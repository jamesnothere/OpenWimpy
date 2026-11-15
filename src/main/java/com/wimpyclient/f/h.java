package com.wimpyclient.f;

import com.wimpyclient.i.p;
import com.wimpyclient.i.q;
import com.wimpyclient.i.x;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.SectionPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.protocol.game.ClientboundExplodePacket;
import net.minecraft.network.protocol.game.ClientboundLevelChunkWithLightPacket;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import net.minecraft.network.protocol.game.ClientboundLightUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.lighting.LevelLightEngine;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class h {
   public static final h INSTANCE = new h();
   public static final double MIN_FAR_DIST = 96.0;
   private static final int NIBBLES_PER_SECTION = 2048;
   private static final double TELEPORT_BLOCKS = 48.0;
   private static final int KEEP_CHUNKS = 28;
   private static final int CLUSTER_INTERVAL = 10;
   private static final int MAX_SNAPSHOTS = 32768;
   private static final int ACTIVITY_CAP = 40;
   private static final long ACTIVITY_DECAY_MS = 2000L;
   private static final long ACTIVITY_TTL_MS = 60000L;
   private static final int PLAYER_SCAN_INTERVAL = 20;
   private static final double SELF_DIST = 4.0;
   private static final int MIN_MARK_SCORE = 25;
   private final Long2ObjectOpenHashMap<h$b> snapshots = new Long2ObjectOpenHashMap();
   private final Long2ObjectOpenHashMap<h$c> hits = new Long2ObjectOpenHashMap();
   private final Long2ObjectOpenHashMap<h$a> activity = new Long2ObjectOpenHashMap();
   private final LongOpenHashSet alerted = new LongOpenHashSet();
   private final List<h$f> stablePins = new ArrayList<>();
   private volatile List<BlockPos> renderCentroids = List.of();
   private ClientLevel lastLevel;
   private double lastX = Double.NaN;
   private double lastZ = Double.NaN;
   private int tick;
   private boolean wasEnabled;
   private boolean clusterDirty;
   private boolean holdingForDig;

   private h() {
   }

   public boolean isEnabled() {
      return x.INSTANCE.yHideBases.qo();
   }

   public List<BlockPos> renderCentroids() {
      return this.renderCentroids;
   }

   public void offerActivity(int var1, int var2, int var3) {
      if (this.isEnabled() && var3 > 0 && liveActivity()) {
         if (!q.INSTANCE.isActive()) {
            Minecraft var4 = Minecraft.getInstance();
            LocalPlayer var5 = var4.player;
            ClientLevel var6 = var4.level;
            if (var5 != null && var6 != null && !(var5.getY() < softY())) {
               long var7 = System.currentTimeMillis();
               long var9 = ChunkPos.asLong(var1, var2);
               h$a var11 = (h$a)this.activity.get(var9);
               if (var11 == null) {
                  var11 = new h$a();
                  this.activity.put(var9, var11);
               }

               var11.add(var3, var7);
               this.rescoreKey(var9, var5.getY(), var7);
            }
         }
      }
   }

   public void offerActivityAt(double var1, double var3, double var5, int var7) {
      if (this.isEnabled() && var7 > 0 && liveActivity() && !(var3 >= softY())) {
         if (!q.INSTANCE.isActive()) {
            Minecraft var8 = Minecraft.getInstance();
            LocalPlayer var9 = var8.player;
            if (var9 != null && !(var9.getY() < softY())) {
               double var10 = var9.getX() - var1;
               double var12 = var9.getY() - var3;
               double var14 = var9.getZ() - var5;
               if (!(var10 * var10 + var12 * var12 + var14 * var14 < 16.0)) {
                  this.offerActivity(SectionPos.blockToSectionCoord((int)Math.floor(var1)), SectionPos.blockToSectionCoord((int)Math.floor(var5)), var7);
               }
            }
         }
      }
   }

   public void onChunkWithLight(ClientboundLevelChunkWithLightPacket var1, ClientLevel var2) {
      if (this.isEnabled() && var1 != null && var2 != null) {
         this.offerLight(var1.getX(), var1.getZ(), var1.getLightData(), true);
      }
   }

   public void onLightUpdate(ClientboundLightUpdatePacket var1, ClientLevel var2) {
      if (this.isEnabled() && var1 != null && var2 != null) {
         this.offerLight(var1.getX(), var1.getZ(), var1.getLightData(), false);
      }
   }

   public void onAddEntity(ClientboundAddEntityPacket var1) {
      if (this.isEnabled() && liveActivity() && var1 != null) {
         double var2 = var1.getY();
         if (!(var2 >= softY())) {
            EntityType var4 = var1.getType();
            boolean var5 = var4 == EntityType.PLAYER
               || var4 == EntityType.ITEM
               || var4 == EntityType.EXPERIENCE_ORB
               || var4 == EntityType.ARMOR_STAND
               || var4 == EntityType.ITEM_FRAME
               || var4 == EntityType.GLOW_ITEM_FRAME
               || var4 == EntityType.TNT
               || var4 == EntityType.FISHING_BOBBER;
            if (var5) {
               this.offerActivityAt(var1.getX(), var2, var1.getZ(), var2 < hardY() ? 10 : 8);
            }
         }
      }
   }

   public void onParticle(ClientboundLevelParticlesPacket var1) {
      if (this.isEnabled() && liveActivity() && var1 != null && !(var1.getY() >= softY())) {
         if (isHotParticle(String.valueOf(var1.getParticle()))) {
            this.offerActivityAt(var1.getX(), var1.getY(), var1.getZ(), 5);
         }
      }
   }

   public void onExplosion(ClientboundExplodePacket var1) {
      if (this.isEnabled() && liveActivity() && var1 != null) {
         Vec3 var2 = var1.center();
         if (var2 != null && !(var2.y >= softY())) {
            this.offerActivityAt(var2.x, var2.y, var2.z, 8);
         }
      }
   }

   public void onSound(double var1, double var3, double var5, SoundEvent var7, SoundSource var8) {
      if (this.isEnabled() && liveActivity() && !(var3 >= softY())) {
         if (var8 != SoundSource.WEATHER && var8 != SoundSource.AMBIENT && var8 != SoundSource.MUSIC) {
            if (var8 == SoundSource.PLAYERS || var8 == SoundSource.BLOCKS || var8 == SoundSource.HOSTILE || var8 == SoundSource.VOICE) {
               this.offerActivityAt(var1, var3, var5, 4);
            }
         }
      }
   }

   public void onLevelEvent(int var1, BlockPos var2, int var3) {
      if (this.isEnabled() && liveActivity() && var2 != null && var2.getY() < softY()) {
         this.offerActivityAt(var2.getX() + 0.5, var2.getY() + 0.5, var2.getZ() + 0.5, 4);
      }
   }

   public void onBlockUpdate(BlockPos var1, BlockState var2, BlockState var3) {
      if (this.isEnabled() && liveActivity() && var1 != null && var1.getY() < softY()) {
         this.offerActivityAt(var1.getX() + 0.5, var1.getY() + 0.5, var1.getZ() + 0.5, 6);
      }
   }

   public void onDigProgress(int var1, BlockPos var2, int var3) {
      if (this.isEnabled() && liveActivity() && var2 != null && var2.getY() < softY() && var3 >= 0) {
         Minecraft var4 = Minecraft.getInstance();
         if (var4.level == null || var4.level.getEntity(var1) == null) {
            this.offerActivityAt(var2.getX() + 0.5, var2.getY() + 0.5, var2.getZ() + 0.5, 10);
         }
      }
   }

   private static boolean isHotParticle(String var0) {
      String var1 = var0.toLowerCase(Locale.ROOT);
      return var1.contains("crit")
         || var1.contains("damage")
         || var1.contains("sweep")
         || var1.contains("explode")
         || var1.contains("totem")
         || var1.contains("enchant")
         || var1.contains("block")
         || var1.contains("item")
         || var1.contains("flame")
         || var1.contains("smoke")
         || var1.contains("portal");
   }

   public void offerLight(int var1, int var2, ClientboundLightUpdatePacketData var3, boolean var4) {
      if (this.isEnabled() && var3 != null) {
         Minecraft var5 = Minecraft.getInstance();
         ClientLevel var6 = var5.level;
         LocalPlayer var7 = var5.player;
         if (var6 != null && var7 != null) {
            int var8 = softY();
            if (!(var7.getY() < var8)) {
               LevelLightEngine var9 = var6.getLightEngine();
               int var10 = var9.getMinLightSection();
               int var11 = var9.getLightSectionCount();
               long var12 = ChunkPos.asLong(var1, var2);
               h$b var14 = (h$b)this.snapshots.get(var12);
               if (var14 == null || var14.minLightSection != var10 || var14.lightSectionCount != var11) {
                  var14 = new h$b(var10, var11);
                  this.snapshots.put(var12, var14);
               }

               try {
                  if (var4) {
                     this.markCulledFromChunk(var6, var1, var2, var14);
                     seedBlockLight(var3, var14);
                  } else {
                     if (!var14.culledReady) {
                        this.markCulledFromChunk(var6, var1, var2, var14);
                     }

                     applyBlockLight(var3, var14);
                  }

                  refreshLeaks(var14);
                  if (var14.mineshaft) {
                     this.forgetMineshaft(var12);
                  }
               } catch (Throwable var17) {
                  return;
               }

               long var15 = System.currentTimeMillis();
               this.rescoreKey(var12, var7.getY(), var15);
               if (this.snapshots.size() > 32768) {
                  this.snapshots.clear();
               }
            }
         }
      }
   }

   private void rescoreKey(long var1, double var3, long var5) {
      int var7 = softY();
      int var8 = hardY();
      int var9 = liveActivity() && !q.INSTANCE.isActive() ? this.activityStrength(var1, var5) : 0;
      if (var3 < var7) {
         this.putOrClearHit(var1, 0, 0, 0);
      } else {
         h$b var10 = (h$b)this.snapshots.get(var1);
         if (var10 != null && var10.mineshaft) {
            this.putOrClearHit(var1, 0, 0, 0);
         } else {
            int var11 = 0;
            int var12 = 0;
            if (var10 != null) {
               int[] var13 = countBlockLeaks(var10, var7, var8);
               var11 = var13[0];
               var12 = var13[1];
            }

            this.putOrClearHit(var1, var11, var12, var9);
         }
      }
   }

   private void putOrClearHit(long var1, int var3, int var4, int var5) {
      boolean var6 = var3 > 0 || var4 > 0;
      if (!var6) {
         if (this.hits.remove(var1) != null) {
            this.clusterDirty = true;
         }
      } else {
         int var7 = composeScore(var3, var4, liveActivity() ? var5 : 0);
         if (var7 <= 0) {
            if (this.hits.remove(var1) != null) {
               this.clusterDirty = true;
            }
         } else {
            h$c var8 = new h$c(var7, var3, var4, var5);
            h$c var9 = (h$c)this.hits.get(var1);
            if (var9 == null || var9.score() != var7 || var9.activity() != var5 || var9.softLit() != var3 || var9.hardLit() != var4) {
               this.hits.put(var1, var8);
               this.clusterDirty = true;
            }
         }
      }
   }

   private void forgetMineshaft(long var1) {
      boolean var3 = this.hits.remove(var1) != null;
      this.activity.remove(var1);
      if (this.stablePins.removeIf(var2 -> var2.members.contains(var1))) {
         var3 = true;
      }

      if (var3) {
         this.clusterDirty = true;
         this.publishStableCentroids();
      }
   }

   private void recheckMineshafts(ClientLevel var1) {
      LongOpenHashSet var2 = new LongOpenHashSet(this.hits.keySet());

      for (h$f var4 : this.stablePins) {
         var2.addAll(var4.members);
      }

      int var12 = softY();
      int var13 = var1.getMinSectionY();
      LongIterator var5 = var2.iterator();

      while (var5.hasNext()) {
         long var6 = (Long)var5.next();
         int var8 = ChunkPos.getX(var6);
         int var9 = ChunkPos.getZ(var6);
         if (var1.hasChunk(var8, var9)) {
            LevelChunk var10 = var1.getChunk(var8, var9);
            if (var10 != null && chunkLooksLikeMineshaft(var10, var13, var12)) {
               h$b var11 = (h$b)this.snapshots.get(var6);
               if (var11 != null) {
                  var11.mineshaft = true;
               }

               this.forgetMineshaft(var6);
            }
         }
      }
   }

   private static boolean chunkLooksLikeMineshaft(LevelChunk var0, int var1, int var2) {
      LevelChunkSection[] var3 = var0.getSections();

      for (int var4 = 0; var4 < var3.length; var4++) {
         int var5 = (var1 + var4) * 16;
         if (var5 < var2 && sectionHasMineshaft(var3[var4])) {
            return true;
         }
      }

      return false;
   }

   private static int softY() {
      return x.INSTANCE.yHideSoftY;
   }

   private static int hardY() {
      return x.INSTANCE.yHideHardY;
   }

   private static boolean liveActivity() {
      return x.INSTANCE.yHideBasesLiveActivity;
   }

   private static int composeScore(int var0, int var1, int var2) {
      return var1 * 8 + var0 * 5 + Math.min(24, Math.max(0, var2));
   }

   private static int sensitivityNeed(int var0) {
      return Math.max(25, x.INSTANCE.yHideBasesSensitivity);
   }

   private int activityStrength(long var1, long var3) {
      h$a var5 = (h$a)this.activity.get(var1);
      if (var5 == null) {
         return 0;
      } else {
         int var6 = var5.strength(var3);
         if (var6 <= 0) {
            this.activity.remove(var1);
            return 0;
         } else {
            return var6;
         }
      }
   }

   public void offer(
      int var1, int var2, double var3, double var5, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13, boolean var14, boolean var15
   ) {
   }

   public void tick(Minecraft var1) {
      if (!this.isEnabled()) {
         this.wasEnabled = false;
         if (!this.hits.isEmpty()
            || !this.alerted.isEmpty()
            || !this.renderCentroids.isEmpty()
            || !this.snapshots.isEmpty()
            || !this.activity.isEmpty()
            || !this.stablePins.isEmpty()) {
            this.clear();
         }

         this.lastLevel = var1 == null ? null : var1.level;
         this.lastX = Double.NaN;
         this.lastZ = Double.NaN;
         this.holdingForDig = false;
      } else {
         ClientLevel var2 = var1 == null ? null : var1.level;
         LocalPlayer var3 = var1 == null ? null : var1.player;
         if (var2 != this.lastLevel) {
            this.clear();
            this.lastLevel = var2;
            this.wasEnabled = true;
            if (var3 != null) {
               this.lastX = var3.getX();
               this.lastZ = var3.getZ();
            }
         } else {
            if (!this.wasEnabled) {
               this.wasEnabled = true;
            }

            if (var3 != null) {
               double var4 = var3.getX();
               double var6 = var3.getZ();
               if (!Double.isNaN(this.lastX)) {
                  double var8 = var4 - this.lastX;
                  double var10 = var6 - this.lastZ;
                  if (var8 * var8 + var10 * var10 >= 2304.0) {
                     this.clear();
                     this.lastX = var4;
                     this.lastZ = var6;
                     return;
                  }
               }

               this.lastX = var4;
               this.lastZ = var6;
               boolean var12 = var3.getY() < softY();
               if (var12 && !this.holdingForDig) {
                  this.holdingForDig = true;
                  this.suppressLiveHits();
               } else if (!var12 && this.holdingForDig) {
                  this.holdingForDig = false;
               }
            }

            this.tick++;
            if (this.holdingForDig) {
               this.publishStableCentroids();
            } else {
               if (q.INSTANCE.isActive() && !this.activity.isEmpty()) {
                  this.activity.clear();
                  this.clusterDirty = true;
               }

               if (liveActivity() && this.tick % 20 == 0) {
                  this.scanNearbyPlayers(var2, var3);
               }

               if (this.tick % 40 == 0) {
                  this.prune(var1);
               }

               if (this.clusterDirty || this.tick % 10 == 0) {
                  this.clusterDirty = false;
                  this.cluster(var1);
               }
            }
         }
      }
   }

   private void scanNearbyPlayers(ClientLevel var1, LocalPlayer var2) {
      if (var1 != null && var2 != null && !(var2.getY() < softY()) && !q.INSTANCE.isActive()) {
         int var3 = softY();

         for (Player var5 : var1.players()) {
            if (var5 != var2 && !(var5 instanceof LocalPlayer) && !(var5 instanceof p) && !(var5.getY() >= var3)) {
               double var6 = var2.getX() - var5.getX();
               double var8 = var2.getY() - var5.getY();
               double var10 = var2.getZ() - var5.getZ();
               if (!(var6 * var6 + var8 * var8 + var10 * var10 < 16.0)) {
                  this.offerActivity(var5.chunkPosition().x, var5.chunkPosition().z, var5.getY() < hardY() ? 5 : 3);
               }
            }
         }
      }
   }

   public void onDisconnect() {
      this.clear();
      this.lastLevel = null;
      this.lastX = Double.NaN;
      this.lastZ = Double.NaN;
   }

   private void markCulledFromChunk(ClientLevel var1, int var2, int var3, h$b var4) {
      LevelChunk var5 = var1.getChunk(var2, var3);
      if (var5 != null) {
         LevelChunkSection[] var6 = var5.getSections();
         int var7 = var1.getMinSectionY();
         int var8 = softY();
         Arrays.fill(var4.culled, false);
         boolean var9 = false;

         for (int var10 = 0; var10 < var6.length; var10++) {
            LevelChunkSection var11 = var6[var10];
            int var12 = var7 + var10;
            int var13 = var12 * 16;
            if (var13 < var8 && !var9 && sectionHasMineshaft(var11)) {
               var9 = true;
            }

            int var14 = var12 - var4.minLightSection;
            if (var14 >= 0 && var14 < var4.lightSectionCount && var13 < var8) {
               var4.culled[var14] = sectionLooksHidden(var11);
            }
         }

         var4.mineshaft = var9;
         var4.culledReady = true;
      }
   }

   private static boolean sectionLooksHidden(LevelChunkSection var0) {
      if (var0 != null && !var0.hasOnlyAir()) {
         for (int var1 = 0; var1 < 16; var1++) {
            for (int var2 = 0; var2 < 16; var2++) {
               for (int var3 = 0; var3 < 16; var3++) {
                  if (!isFiller(var0.getBlockState(var2, var1, var3).getBlock())) {
                     return false;
                  }
               }
            }
         }

         return true;
      } else {
         return true;
      }
   }

   private static boolean sectionHasMineshaft(LevelChunkSection var0) {
      return var0 != null && !var0.hasOnlyAir() ? var0.maybeHas(var0x -> isMineshaftMarker(var0x.getBlock())) : false;
   }

   private static boolean isMineshaftMarker(Block var0) {
      return var0 == Blocks.COBWEB || var0 == Blocks.RAIL || var0 == Blocks.POWERED_RAIL || var0 == Blocks.DETECTOR_RAIL || var0 == Blocks.ACTIVATOR_RAIL;
   }

   private static boolean isFiller(Block var0) {
      return var0 == Blocks.AIR
         || var0 == Blocks.CAVE_AIR
         || var0 == Blocks.VOID_AIR
         || var0 == Blocks.STONE
         || var0 == Blocks.DEEPSLATE
         || var0 == Blocks.NETHERRACK
         || var0 == Blocks.BLACKSTONE
         || var0 == Blocks.END_STONE
         || var0 == Blocks.DIRT
         || var0 == Blocks.GRASS_BLOCK
         || var0 == Blocks.GRAVEL
         || var0 == Blocks.SAND
         || var0 == Blocks.RED_SAND
         || var0 == Blocks.BEDROCK
         || var0 == Blocks.WATER
         || var0 == Blocks.LAVA;
   }

   private static void applyBlockLight(ClientboundLightUpdatePacketData var0, h$b var1) {
      BitSet var2 = var0.getBlockYMask();
      BitSet var3 = var0.getEmptyBlockYMask();
      List var4 = var0.getBlockUpdates();
      if (var2 != null) {
         int var5 = softY();
         int var6 = 0;

         for (int var7 = 0; var7 < var1.lightSectionCount; var7++) {
            if (var2.get(var7)) {
               byte[] var8 = var4 != null && var6 < var4.size() ? (byte[])var4.get(var6) : null;
               var6++;
               h$d var9 = classifyPayload(var8);
               var1.block[var7] = var9;
               if (isLit(var9)) {
                  noteLightPeak(var1, var7, var8, var5);
               }
            } else if (var3 != null && var3.get(var7)) {
               var1.block[var7] = h$d.EMPTY_MASK;
            }
         }
      }
   }

   private static void seedBlockLight(ClientboundLightUpdatePacketData var0, h$b var1) {
      BitSet var2 = var0.getBlockYMask();
      BitSet var3 = var0.getEmptyBlockYMask();
      List var4 = var0.getBlockUpdates();
      if (var2 != null) {
         int var5 = softY();
         int var6 = 0;

         for (int var7 = 0; var7 < var1.lightSectionCount; var7++) {
            if (var2.get(var7)) {
               byte[] var8 = var4 != null && var6 < var4.size() ? (byte[])var4.get(var6) : null;
               var6++;
               h$d var9 = classifyPayload(var8);
               h$d var10 = var1.block[var7];
               if ((!isLit(var10) || isLit(var9)) && (var10 == h$d.UNKNOWN || isLit(var9) || var10 == null)) {
                  var1.block[var7] = var9;
                  if (isLit(var9)) {
                     noteLightPeak(var1, var7, var8, var5);
                  }
               }
            } else if (var3 != null && var3.get(var7) && !isLit(var1.block[var7])) {
               var1.block[var7] = h$d.EMPTY_MASK;
            }
         }
      }
   }

   private static void noteLightPeak(h$b var0, int var1, byte[] var2, int var3) {
      if (var2 != null && var2.length == 2048) {
         int var4 = var0.minLightSection + var1;
         int var5 = var4 * 16;
         if (var5 + 15 < var3) {
            for (int var6 = 0; var6 < 16; var6++) {
               for (int var7 = 0; var7 < 16; var7++) {
                  for (int var8 = 0; var8 < 16; var8++) {
                     int var9 = lightNibble(var2, var8, var6, var7);
                     if (var9 > var0.peakValue) {
                        var0.peakValue = var9;
                        var0.peakLx = var8;
                        var0.peakLy = var6;
                        var0.peakLz = var7;
                        var0.peakSectionY = var4;
                        var0.peakValid = true;
                     }
                  }
               }
            }
         }
      }
   }

   private static int lightNibble(byte[] var0, int var1, int var2, int var3) {
      int var4 = var2 << 8 | var3 << 4 | var1;
      int var5 = var0[var4 >> 1] & 255;
      return (var4 & 1) == 0 ? var5 & 15 : var5 >> 4 & 15;
   }

   private static void refreshLeaks(h$b var0) {
      for (int var1 = 0; var1 < var0.lightSectionCount; var1++) {
         var0.blockLeak[var1] = var0.culled[var1] && isLit(var0.block[var1]);
      }
   }

   private static boolean isLit(h$d var0) {
      return var0 == h$d.VARIED || var0 == h$d.UNIFORM_MAX;
   }

   private static h$d classifyPayload(byte[] var0) {
      if (var0 != null && var0.length == 2048) {
         boolean var1 = true;
         boolean var2 = true;

         for (byte var6 : var0) {
            if (var6 != 0) {
               var1 = false;
            }

            if (var6 != -1) {
               var2 = false;
            }

            if (!var1 && !var2) {
               return h$d.VARIED;
            }
         }

         if (var1) {
            return h$d.ZERO;
         } else {
            return var2 ? h$d.UNIFORM_MAX : h$d.VARIED;
         }
      } else {
         return h$d.UNKNOWN;
      }
   }

   private static int[] countBlockLeaks(h$b var0, int var1, int var2) {
      int var3 = 0;
      int var4 = 0;

      for (int var5 = 0; var5 < var0.lightSectionCount; var5++) {
         if (var0.blockLeak[var5]) {
            int var6 = var0.minLightSection + var5;
            int var7 = var6 * 16 + 15;
            if (var7 < var1) {
               if (var7 < var2) {
                  var4++;
               } else {
                  var3++;
               }
            }
         }
      }

      return new int[]{var3, var4};
   }

   private void prune(Minecraft var1) {
      LocalPlayer var2 = var1 == null ? null : var1.player;
      ClientLevel var3 = var1 == null ? null : var1.level;
      if (var2 != null) {
         if (var3 != null) {
            this.recheckMineshafts(var3);
         }

         int var4 = var2.chunkPosition().x;
         int var5 = var2.chunkPosition().z;
         short var6 = 784;
         long var7 = System.currentTimeMillis();
         LongArrayList var9 = new LongArrayList();
         LongIterator var10 = this.hits.keySet().iterator();

         while (var10.hasNext()) {
            long var11 = (Long)var10.next();
            int var13 = ChunkPos.getX(var11) - var4;
            int var14 = ChunkPos.getZ(var11) - var5;
            if (var13 * var13 + var14 * var14 > var6) {
               var9.add(var11);
            }
         }

         for (int var19 = 0; var19 < var9.size(); var19++) {
            this.hits.remove(var9.getLong(var19));
         }

         LongArrayList var20 = new LongArrayList();
         LongIterator var21 = this.snapshots.keySet().iterator();

         while (var21.hasNext()) {
            long var12 = (Long)var21.next();
            int var27 = ChunkPos.getX(var12) - var4;
            int var15 = ChunkPos.getZ(var12) - var5;
            if (var27 * var27 + var15 * var15 > var6) {
               var20.add(var12);
            }
         }

         for (int var22 = 0; var22 < var20.size(); var22++) {
            this.snapshots.remove(var20.getLong(var22));
         }

         LongArrayList var23 = new LongArrayList();
         ObjectIterator var24 = this.activity.long2ObjectEntrySet().iterator();

         while (var24.hasNext()) {
            Entry var26 = (Entry)var24.next();
            long var28 = var26.getLongKey();
            int var16 = ChunkPos.getX(var28) - var4;
            int var17 = ChunkPos.getZ(var28) - var5;
            h$a var18 = (h$a)var26.getValue();
            if (var16 * var16 + var17 * var17 > var6 || var18.strength(var7) <= 0 || var7 - var18.lastMs > 60000L) {
               var23.add(var28);
            }
         }

         for (int var25 = 0; var25 < var23.size(); var25++) {
            this.activity.remove(var23.getLong(var25));
         }

         if (!var9.isEmpty()) {
            this.clusterDirty = true;
         }
      }
   }

   private void cluster(Minecraft var1) {
      LongOpenHashSet var2 = new LongOpenHashSet();
      ArrayList var3 = new ArrayList();

      for (long var7 : this.hits.keySet().toLongArray()) {
         if (var2.add(var7)) {
            ArrayDeque var9 = new ArrayDeque();
            var9.add(var7);
            LongArrayList var10 = new LongArrayList();
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            long var15 = var7;
            int var17 = -1;
            int var18 = -1;

            while (!var9.isEmpty()) {
               long var19 = (Long)var9.removeFirst();
               h$c var21 = (h$c)this.hits.get(var19);
               if (var21 != null) {
                  int var22 = ChunkPos.getX(var19);
                  int var23 = ChunkPos.getZ(var19);
                  var10.add(var19);
                  var11 += var21.score();
                  var12 += var21.softLit();
                  var13 += var21.hardLit();
                  var14 += var21.activity();
                  if (var21.hardLit() > var17 || var21.hardLit() == var17 && var21.score() > var18) {
                     var17 = var21.hardLit();
                     var18 = var21.score();
                     var15 = var19;
                  }

                  for (int var24 = -1; var24 <= 1; var24++) {
                     for (int var25 = -1; var25 <= 1; var25++) {
                        if (var24 != 0 || var25 != 0) {
                           long var26 = ChunkPos.asLong(var22 + var24, var23 + var25);
                           if (this.hits.containsKey(var26) && var2.add(var26)) {
                              var9.add(var26);
                           }
                        }
                     }
                  }
               }
            }

            if (!var10.isEmpty() && var11 >= sensitivityNeed(0)) {
               BlockPos var28 = this.pinpoint(var15);
               var3.add(new h$e(var28, var11, var12, var13, var14, var10.toLongArray()));
            }
         }
      }

      var3.sort(Comparator.comparingInt(h$e::score).reversed());
      this.syncStablePins(var1, var3);
      this.publishStableCentroids();
   }

   private BlockPos pinpoint(long var1) {
      int var3 = ChunkPos.getX(var1);
      int var4 = ChunkPos.getZ(var1);
      int var5 = var3 << 4;
      int var6 = var4 << 4;
      h$b var7 = (h$b)this.snapshots.get(var1);
      if (var7 != null && var7.peakValid) {
         int var8 = var7.peakSectionY - var7.minLightSection;
         if (var8 >= 0 && var8 < var7.lightSectionCount && var7.blockLeak[var8]) {
            return new BlockPos(var5 + var7.peakLx, var7.peakSectionY * 16 + var7.peakLy, var6 + var7.peakLz);
         }
      }

      return new BlockPos(var5 + 8, 0, var6 + 8);
   }

   private void publishStableCentroids() {
      if (this.stablePins.isEmpty()) {
         if (!this.renderCentroids.isEmpty()) {
            this.renderCentroids = List.of();
         }
      } else {
         ArrayList var1 = new ArrayList(this.stablePins.size());

         for (h$f var3 : this.stablePins) {
            var1.add(var3.pos);
         }

         this.renderCentroids = List.copyOf(var1);
      }
   }

   private void syncStablePins(Minecraft var1, List<h$e> var2) {
      LocalPlayer var3 = var1 == null ? null : var1.player;
      int var4 = var3 == null ? 0 : var3.chunkPosition().x;
      int var5 = var3 == null ? 0 : var3.chunkPosition().z;
      short var6 = 784;

      for (h$e var8 : var2) {
         LongOpenHashSet var9 = new LongOpenHashSet(var8.members());
         h$f var10 = null;

         for (h$f var12 : this.stablePins) {
            if (sharesMember(var12.members, var9)) {
               var10 = var12;
               break;
            }
         }

         if (var10 != null) {
            var10.members.addAll(var9);
            var10.score = Math.max(var10.score, var8.score());
            var10.softLit = var8.softLit();
            var10.hardLit = var8.hardLit();
            var10.activity = var8.activity();
            if (!var10.locked && var10.pos.getY() == 0 && var8.pos().getY() != 0) {
               var10.pos = var8.pos();
               var10.locked = true;
            }
         } else {
            boolean var13 = var8.pos().getY() != 0;
            h$f var14 = new h$f(var8.pos(), var9, var8.score(), var8.softLit(), var8.hardLit(), var8.activity(), var13);
            this.stablePins.add(var14);
            this.alert(var1, var14);
         }
      }

      this.stablePins.removeIf(var3x -> {
         LongIterator var4x = var3x.members.iterator();

         while (var4x.hasNext()) {
            long var5x = (Long)var4x.next();
            int var7 = ChunkPos.getX(var5x) - var4;
            int var8x = ChunkPos.getZ(var5x) - var5;
            if (var7 * var7 + var8x * var8x <= var6) {
               return false;
            }
         }

         return true;
      });
   }

   private static boolean sharesMember(LongOpenHashSet var0, LongOpenHashSet var1) {
      if (var0.size() <= var1.size()) {
         LongIterator var2 = var0.iterator();

         while (var2.hasNext()) {
            long var3 = (Long)var2.next();
            if (var1.contains(var3)) {
               return true;
            }
         }
      } else {
         LongIterator var5 = var1.iterator();

         while (var5.hasNext()) {
            long var6 = (Long)var5.next();
            if (var0.contains(var6)) {
               return true;
            }
         }
      }

      return false;
   }

   private void alert(Minecraft var1, h$f var2) {
      long var3 = ChunkPos.asLong(var2.pos.getX() >> 4, var2.pos.getZ() >> 4);
      if (this.alerted.add(var3)) {
         LongIterator var5 = var2.members.iterator();

         while (var5.hasNext()) {
            long var6 = (Long)var5.next();
            this.alerted.add(var6);
         }

         x var10 = x.INSTANCE;
         String var11 = var10.yHideBasesShowCoords ? " at " + var2.pos.getX() + ", " + var2.pos.getY() + ", " + var2.pos.getZ() : "";
         if (var10.yHideBasesChat && var1 != null && var1.player != null) {
            boolean var7 = var2.softLit > 0 || var2.hardLit > 0;
            String var8 = var7 ? "block-light base" : "activity signal";
            String var9 = var2.activity > 0 ? " activity=" + var2.activity : "";
            var1.player
               .displayClientMessage(
                  Component.literal("[Wimpy Debug] " + var8 + var11 + " score=" + var2.score + " soft=" + var2.softLit + " hard=" + var2.hardLit + var9), false
               );
            var1.player.displayClientMessage(Component.literal("Wimpy debug" + var11), true);
         }

         if (var10.yHideBasesSound) {
            com.wimpyclient.p.f.playUi((SoundEvent)SoundEvents.NOTE_BLOCK_PLING.value(), 1.35F, 0.7F);
         }
      }
   }

   private void suppressLiveHits() {
      if (!this.hits.isEmpty() || !this.activity.isEmpty()) {
         this.hits.clear();
         this.activity.clear();
         this.clusterDirty = false;
      }
   }

   private void clear() {
      this.snapshots.clear();
      this.hits.clear();
      this.activity.clear();
      this.alerted.clear();
      this.stablePins.clear();
      this.renderCentroids = List.of();
      this.clusterDirty = false;
      this.tick = 0;
      this.holdingForDig = false;
   }
}
