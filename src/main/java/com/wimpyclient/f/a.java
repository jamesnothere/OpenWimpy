package com.wimpyclient.f;

import com.wimpyclient.auth.LicenseGate;
import com.wimpyclient.e.d$a;
import com.wimpyclient.i.aa;
import com.wimpyclient.i.k;
import com.wimpyclient.i.p;
import com.wimpyclient.i.x;
import com.wimpyclient.p.i;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.LongPredicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.SectionPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.Direction.Axis;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.animal.polarbear.PolarBear;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrownEnderpearl;
import net.minecraft.world.entity.vehicle.boat.AbstractBoat;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.BambooStalkBlock;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CaveVines;
import net.minecraft.world.level.block.DiodeBlock;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.ObserverBlock;
import net.minecraft.world.level.block.RedStoneWireBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.entity.SpawnerBlockEntity;
import net.minecraft.world.level.block.entity.TrialSpawnerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.DataLayer;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.level.lighting.LayerLightEventListener;
import net.minecraft.world.level.lighting.LevelLightEngine;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class a {
   public static final a INSTANCE = new a();
   private static final int SUS_SCAN_INTERVAL_TICKS = 4;
   private static final int SUS_CHUNKS_PER_PASS = 12;
   private static final int SUS_CHUNKS_PER_PASS_BURST = 48;
   private static final int STORAGE_SCAN_INTERVAL_TICKS = 8;
   private static final int STORAGE_BACKGROUND_INTERVAL_TICKS = 40;
   private static final int STORAGE_SCAN_RADIUS = 6;
   private static final int BLOCK_ESP_SCAN_INTERVAL_TICKS = 1;
   private static final int BLOCK_ESP_CHUNKS_PER_PASS = 4;
   private static final int BLOCK_ESP_PER_CHUNK = 512;
   private static final int NEARBY_REFRESH_INTERVAL_TICKS = 20;
   private static final int AMETHYST_SCAN_Y_MAX = 128;
   private static final int LIGHT_ZERO = 0;
   private static final int LIGHT_AIR_NBR = 1;
   private static final int MAX_HITS_PER_CHUNK = 32;
   private static final int GEODE_MIN_Y = -64;
   private static final int GEODE_MAX_Y = 32;
   private static final int PRUNE_EXTRA_CHUNKS = 1;
   private static final int[][] NEIGHBORS = new int[][]{{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
   private static final int[][] SHELL_NEIGHBORS = shellNeighbors();
   private static final int GEODE_PRUNE_RADIUS = 16;
   private static final int MAX_AIR_ISLAND = 1;
   private static final int SHELL_LEAK_RADIUS = 3;
   private static final int SHELL_CAP_DROP = 16;
   private static final int SHELL_CAP_XZ_PAD = 4;
   private static final int LIGHT_CLUSTER_Y_MAX = 48;
   private static final int MAX_LIGHT_CLUSTER_SMEAR = 6;
   private static final int MIN_UNSHELLED_LIGHT_CLUSTERS = 1;
   private static final int UNSHELLED_GEODE_LIGHT_CLUSTERS = 8;
   private static final int BUILD_SIGNAL_MIN_Y = 16;
   private static final int BUILD_SIGNAL_MAX_Y = 128;
   private static final int BASE_COLUMN_MAX_Y = 60;
   private static final int BASE_PISTON_MAX_Y = 20;
   private static final int SITE_SAMPLE_MIN_BLOCKS = 1;
   private static final int BAMBOO_DEEP_CLEARANCE = 18;
   private static final int ANTI_XRAY_Y_MAX = 64;
   private static final int UNDERGROUND_CLEARANCE = 4;
   private static final int FLOATING_SURFACE_DELTA = 16;
   private static final int FLOATING_SOLID_MAX = 28;
   private static final int FLOATING_AIR_GAP = 10;
   private static final int SKYBASE_COLUMN_THRESHOLD = 48;
   private static final int SCAN_SETTLE_GIVE_UP_TICKS = 300;
   private static final double SELF_HINT_RANGE_SQ = 9.0;
   private static final double SELF_BLOCK_HINT_RANGE_SQ = 144.0;
   private static final long MINING_CORROBORATE_MS = 8000L;
   private static final double EXPLAINED_BY_VISIBLE_SQ = 1024.0;
   private static final double RIDERLESS_VEHICLE_SPEED_SQ = 0.09;
   private static final double VIEW_EDGE_MARGIN = 32.0;
   private static final double SELF_TELEPORT_DIST_SQ = 4096.0;
   private static final long VANISH_MARK_MAX_MS = 300000L;
   private static final Set<Block> STORAGE_BLOCKS = buildStorageBlocks();
   private static final Set<Block> REDSTONE_BLOCKS = buildRedstoneBlocks();
   private static final Set<Block> WAXED_COPPER_BLOCKS = waxedCopperBlocks();
   private static final Set<Block> TRIAL_CHAMBER_BLOCKS = trialChamberBlocks();
   private int susTickCounter;
   private int storageTickCounter;
   private int blockEspTickCounter;
   private int nearbyRefreshCounter;
   private int storageCursor;
   private int susCursor;
   private boolean lastChunkScanPrime;
   private long lastCenterChunk = Long.MIN_VALUE;
   private final List<ChunkPos> nearbyChunks = new ArrayList<>();
   private final LongSet nearbyChunkKeys = new LongOpenHashSet();
   private final LongSet notifiedSpawners = new LongOpenHashSet();
   private final LongOpenHashSet susScannedChunks = new LongOpenHashSet();
   private final com.wimpyclient.p.e susSnapshots = com.wimpyclient.p.e.INSTANCE;
   private final ExecutorService susWorkers = Executors.newFixedThreadPool(2, var0 -> {
      Thread var1 = new Thread(var0, "Wimpy-SusChunk");
      var1.setDaemon(true);
      var1.setPriority(4);
      return var1;
   });
   private final ConcurrentLinkedQueue<a$g> susResults = new ConcurrentLinkedQueue<>();
   private final LongOpenHashSet susPendingChunks = new LongOpenHashSet();
   private final AtomicInteger susActiveScans = new AtomicInteger();
   private static final int SUS_MAX_IN_FLIGHT = 8;
   private final LongOpenHashSet susBurstRescan = new LongOpenHashSet();
   private final LongOpenHashSet storageDirtyChunks = new LongOpenHashSet();
   private final LongOpenHashSet blockEspScannedChunks = new LongOpenHashSet();
   private final Long2IntOpenHashMap armorStandWeightByChunk = new Long2IntOpenHashMap();
   private final Long2IntOpenHashMap villagerCountByChunk = new Long2IntOpenHashMap();
   private final Long2IntOpenHashMap itemFrameCountByChunk = new Long2IntOpenHashMap();
   private final Long2IntOpenHashMap droppedItemCountByChunk = new Long2IntOpenHashMap();
   private final Long2IntOpenHashMap polarBearCountByChunk = new Long2IntOpenHashMap();
   private final Long2IntOpenHashMap mobCountByChunk = new Long2IntOpenHashMap();
   private final Long2IntOpenHashMap susSurfaceByColumn = new Long2IntOpenHashMap();
   private final Long2LongOpenHashMap susSectionFingerprint = new Long2LongOpenHashMap();
   private final Long2IntOpenHashMap lastPoweredCoreByChunk = new Long2IntOpenHashMap();
   private final Long2LongOpenHashMap inferredPlayerChunks = new Long2LongOpenHashMap();
   private final Long2LongOpenHashMap pendingMiningHints = new Long2LongOpenHashMap();
   private final Long2ObjectOpenHashMap<LongOpenHashSet> leakedPacketCrystalsByChunk = new Long2ObjectOpenHashMap();
   private final Long2ObjectOpenHashMap<LongOpenHashSet> leakedLightCrystalsByChunk = new Long2ObjectOpenHashMap();
   private final Long2ObjectOpenHashMap<LongOpenHashSet> leakedCulledCrystalsByChunk = new Long2ObjectOpenHashMap();
   private final Long2ObjectOpenHashMap<BlockPos> leakedCrystalIconByChunk = new Long2ObjectOpenHashMap();
   private final Long2ObjectOpenHashMap<a$e> packetLightGridByChunk = new Long2ObjectOpenHashMap();
   private final Long2IntOpenHashMap packetLightRevisionByChunk = new Long2IntOpenHashMap();
   private final Object packetLightLock = new Object();
   private final Long2IntOpenHashMap scannedLightRevisionByChunk = new Long2IntOpenHashMap();
   private final Map<UUID, a$c> lastSightings = new HashMap<>();
   private final Map<UUID, a$i> vanishMarks = new HashMap<>();
   private Boolean wasRevealed;
   private double lastSelfX;
   private double lastSelfY;
   private double lastSelfZ;
   private boolean haveLastSelf;
   private boolean nearbyDirty;
   private final LongOpenHashSet autoRtpTerrainReady = new LongOpenHashSet();
   private boolean susBurstMode;
   private int autoRtpScanTicks;
   private int autoRtpStableTicks;
   private ChunkPos autoRtpScanCenter;
   private int autoRtpScanSim;
   private int autoRtpLoadTicks;
   private int susEntityWeightCooldown;

   private a() {
      this.lastPoweredCoreByChunk.defaultReturnValue(-1);
      this.inferredPlayerChunks.defaultReturnValue(0L);
      this.pendingMiningHints.defaultReturnValue(0L);
   }

   public void tick(Minecraft var1) {
      if (!LicenseGate.isAuthorized()) {
         this.clearRuntimeState();
         com.wimpyclient.e.a.INSTANCE.clearAll();
      } else {
         x var2 = x.INSTANCE;
         if (!var2.needsWorldScan()) {
            this.clearRuntimeState();
            com.wimpyclient.e.a.INSTANCE.clearAll();
         } else {
            ClientLevel var3 = var1.level;
            if (var3 != null && var1.player != null) {
               if (!var2.spawnerFinder.qo()) {
                  this.notifiedSpawners.clear();
               }

               this.refreshNearbyChunks(var1, var3);
               if (this.nearbyDirty) {
                  com.wimpyclient.e.a.INSTANCE.retainChunks(this.nearbyChunkKeys);
                  this.susScannedChunks.removeIf(var1x -> !this.nearbyChunkKeys.contains(var1x));
                  this.blockEspScannedChunks.removeIf(var1x -> !this.nearbyChunkKeys.contains(var1x));
                  this.pruneNotifiedSpawners();
                  this.pruneCachesOutsideNearby();
                  this.nearbyDirty = false;
               }

               this.updatePlayers(var1, var3, var2);
               boolean var4 = false;
               boolean var5 = var2.isPrimeSusFinderEnabled();
               if (var5 != this.lastChunkScanPrime) {
                  this.lastChunkScanPrime = var5;
                  if (var5) {
                     this.invalidateSusScansKeepMarks();
                  }

                  com.wimpyclient.e.a.INSTANCE.requestRenderRebuild();
               }

               if (var2.isChunkScanEnabled()) {
                  this.susTickCounter++;
                  int var6 = this.susBurstMode ? 1 : 4;
                  if (this.susTickCounter >= var6) {
                     this.susTickCounter = 0;
                     var4 |= this.scanSusOnceNearPlayer(var1, var3, var2);
                  }
               } else {
                  this.susTickCounter = 0;
                  this.susScannedChunks.clear();
                  this.susBurstMode = false;
                  this.clearSusOnlyCaches();
               }

               boolean var12 = var2.storage.qo();
               boolean var7 = var2.spawnerFinder.qo();
               boolean var8 = var2.nbtBypass.qo();
               if (!var12 && !var7 && !var8) {
                  this.storageTickCounter = 0;
               } else {
                  this.storageTickCounter++;
                  boolean var9 = !this.storageDirtyChunks.isEmpty();
                  boolean var10 = var9 && this.storageTickCounter >= 8;
                  boolean var11 = !var9 && this.storageTickCounter >= 40;
                  if (var10 || var11) {
                     this.storageTickCounter = 0;
                     var4 |= this.scanStoragePass(var3, var2, var12, var7, var8, var9);
                  }
               }

               if (var2.blockEsp.qo() && var2.hasAnyBlockEspEnabled()) {
                  this.blockEspTickCounter++;
                  if (this.blockEspTickCounter >= 1) {
                     this.blockEspTickCounter = 0;
                     var4 |= this.scanBlockEspPass(var1, var3, var2);
                  }
               } else {
                  this.blockEspTickCounter = 0;
                  this.blockEspScannedChunks.clear();
                  com.wimpyclient.e.a.INSTANCE.clearBlockEsp();
               }

               if (var4) {
                  com.wimpyclient.e.a.INSTANCE.pruneEmpty();
               }

               com.wimpyclient.e.a.INSTANCE
                  .rebuildRenderSnapshotIfDirty(
                     var2.growthDebug.qo(),
                     var2.storage.qo(),
                     var2.playerMarker.qo(),
                     var2.spawnerFinder.qo(),
                     var2.nbtBypass.qo(),
                     var2.isPrimeSusFinderEnabled() && var2.primeSusClusterIcons
                  );
            } else {
               this.clearRuntimeState();
               com.wimpyclient.e.a.INSTANCE.clearAll();
            }
         }
      }
   }

   public void markStorageChunkDirty(long var1) {
      this.storageDirtyChunks.add(var1);
   }

   public void markStorageChunkDirty(BlockPos var1) {
      this.markStorageChunkDirty(new ChunkPos(var1).toLong());
   }

   public void markBlockEspChunkDirty(BlockPos var1) {
      this.markBlockEspChunkDirty(new ChunkPos(var1).toLong());
   }

   public void markBlockEspChunkDirty(long var1) {
      if (x.INSTANCE.blockEsp.qo()) {
         this.blockEspScannedChunks.remove(var1);
      }
   }

   public void requestBlockEspRescan() {
      this.blockEspScannedChunks.clear();
   }

   public void invalidateSusScan(long var1) {
      this.susSectionFingerprint.remove(var1);
      if (this.susBurstMode && this.susScannedChunks.contains(var1)) {
         this.susBurstRescan.add(var1);
      } else {
         this.susScannedChunks.remove(var1);
      }

      if (this.autoRtpScanCenter != null) {
         ChunkPos var3 = new ChunkPos(var1);
         int var4 = Math.max(Math.abs(var3.x - this.autoRtpScanCenter.x), Math.abs(var3.z - this.autoRtpScanCenter.z));
         if (var4 <= this.autoRtpScanSim) {
            this.autoRtpTerrainReady.add(var1);
            if (this.susBurstMode) {
               this.autoRtpStableTicks = 0;
            }
         }
      }
   }

   public void beginAutoRtpLoadWait(Minecraft var1) {
      this.susBurstMode = false;
      this.autoRtpScanTicks = 0;
      this.autoRtpStableTicks = 0;
      this.autoRtpLoadTicks = 0;
      this.autoRtpTerrainReady.clear();
      this.autoRtpScanSim = this.autoRtpCheckRadius(var1);
      if (var1 != null && var1.player != null) {
         this.autoRtpScanCenter = var1.player.chunkPosition();
         this.seedTerrainReadyFromWorld(var1);
      } else {
         this.autoRtpScanCenter = null;
      }
   }

   public void beginAutoRtpScanPass(Minecraft var1) {
      this.susBurstMode = true;
      this.autoRtpScanTicks = 0;
      this.autoRtpStableTicks = 0;
      this.autoRtpScanSim = this.autoRtpCheckRadius(var1);
      if (var1 != null && var1.player != null) {
         this.autoRtpScanCenter = var1.player.chunkPosition();
         this.seedTerrainReadyFromWorld(var1);
      } else {
         this.autoRtpScanCenter = null;
      }

      this.invalidateSusScansKeepMarks();
   }

   public void invalidateAllSusScans() {
      this.susScannedChunks.clear();
      this.susPendingChunks.clear();
      this.susResults.clear();
      this.susActiveScans.set(0);
      this.susSnapshots.clear();
      this.susBurstRescan.clear();
      this.susCursor = 0;
      this.susTickCounter = 4;
      com.wimpyclient.e.a.INSTANCE.clearAllSusClues();
      com.wimpyclient.e.a.INSTANCE.clearAllAmethystClusterIcons();
   }

   public void invalidateSusScansKeepMarks() {
      this.susScannedChunks.clear();
      this.susPendingChunks.clear();
      this.susResults.clear();
      this.susActiveScans.set(0);
      this.susSnapshots.clear();
      this.susBurstRescan.clear();
      this.susCursor = 0;
      this.susTickCounter = 4;
   }

   public void endAutoRtpScanPass() {
      this.susBurstMode = false;
      this.autoRtpScanTicks = 0;
      this.autoRtpStableTicks = 0;
      this.autoRtpLoadTicks = 0;
      this.autoRtpScanCenter = null;
      this.autoRtpTerrainReady.clear();
      this.susScannedChunks.removeAll(this.susBurstRescan);
      this.susBurstRescan.clear();
   }

   private void seedTerrainReadyFromWorld(Minecraft var1) {
      if (var1 != null && var1.level != null && this.autoRtpScanCenter != null) {
         ClientLevel var2 = var1.level;
         int var3 = this.autoRtpScanSim;
         int var4 = 12;

         try {
            var4 = Math.max(2, var1.options.getEffectiveRenderDistance());
         } catch (Throwable var11) {
         }

         int var5 = Math.min(var3, var4);
         ChunkPos var6 = this.autoRtpScanCenter;

         for (int var7 = -var5; var7 <= var5; var7++) {
            for (int var8 = -var5; var8 <= var5; var8++) {
               int var9 = var6.x + var7;
               int var10 = var6.z + var8;
               if (var2.hasChunk(var9, var10)) {
                  this.autoRtpTerrainReady.add(ChunkPos.asLong(var9, var10));
               }
            }
         }
      }
   }

   private static boolean chunkLooksPopulated(ClientLevel var0, int var1, int var2) {
      try {
         return var0.hasChunk(var1, var2);
      } catch (Throwable var4) {
         return false;
      }
   }

   private int autoRtpCheckRadius(Minecraft var1) {
      int var2 = Math.max(1, x.INSTANCE.primeSusSimulationDistance);
      int var3 = 12;

      try {
         if (var1 != null && var1.options != null) {
            var3 = Math.max(2, var1.options.getEffectiveRenderDistance());
         }
      } catch (Throwable var5) {
      }

      return Math.min(var2, var3);
   }

   public boolean isSusSimulationLoadReady(Minecraft var1) {
      if (var1 != null && var1.player != null && var1.level != null) {
         ClientLevel var2 = var1.level;
         ChunkPos var3 = var1.player.chunkPosition();
         int var4 = this.autoRtpCheckRadius(var1);
         this.autoRtpScanCenter = var3;
         this.autoRtpScanSim = var4;
         this.seedTerrainReadyFromWorld(var1);
         int var5 = (var4 * 2 + 1) * (var4 * 2 + 1);
         int var6 = 0;

         for (int var7 = -var4; var7 <= var4; var7++) {
            for (int var8 = -var4; var8 <= var4; var8++) {
               int var9 = var3.x + var7;
               int var10 = var3.z + var8;
               if (var2.hasChunk(var9, var10)) {
                  var6++;
                  this.autoRtpTerrainReady.add(ChunkPos.asLong(var9, var10));
               }
            }
         }

         int var11 = Math.max(1, var5 - 2);
         return var6 < var11 ? false : this.autoRtpLoadTicks >= 60;
      } else {
         return false;
      }
   }

   public boolean isSusSimulationScanComplete(Minecraft var1) {
      if (var1 != null && var1.player != null && var1.level != null) {
         x var2 = x.INSTANCE;
         if (!var2.isPrimeSusFinderEnabled()) {
            return false;
         } else {
            ClientLevel var3 = var1.level;
            ChunkPos var4 = var1.player.chunkPosition();
            int var5 = this.autoRtpCheckRadius(var1);
            this.autoRtpScanCenter = var4;
            this.autoRtpScanSim = var5;
            int var6 = 0;
            int var7 = 0;

            for (int var8 = -var5; var8 <= var5; var8++) {
               for (int var9 = -var5; var9 <= var5; var9++) {
                  int var10 = var4.x + var8;
                  int var11 = var4.z + var9;
                  if (!var3.hasChunk(var10, var11)) {
                     if (this.autoRtpScanTicks < 200) {
                        return false;
                     }
                  } else {
                     var6++;
                     if (this.susScannedChunks.contains(ChunkPos.asLong(var10, var11))) {
                        var7++;
                     }
                  }
               }
            }

            if (var6 == 0 || var7 < var6) {
               return false;
            } else {
               return this.autoRtpScanTicks < 40 ? false : this.autoRtpStableTicks >= 30 || this.autoRtpScanTicks >= 300;
            }
         }
      } else {
         return false;
      }
   }

   public void tickAutoRtpLoadWait() {
      this.autoRtpLoadTicks++;
   }

   public void tickAutoRtpScanWait() {
      if (this.susBurstMode) {
         this.autoRtpScanTicks++;
         this.autoRtpStableTicks++;
         this.autoRtpLoadTicks++;
      }
   }

   public int autoRtpLoadTicks() {
      return this.autoRtpLoadTicks;
   }

   public int autoRtpTerrainReadyCount() {
      return this.autoRtpTerrainReady.size();
   }

   public int autoRtpExpectedChunkCount(Minecraft var1) {
      int var2 = this.autoRtpCheckRadius(var1);
      return (var2 * 2 + 1) * (var2 * 2 + 1);
   }

   private void clearRuntimeState() {
      this.notifiedSpawners.clear();
      this.susScannedChunks.clear();
      this.susPendingChunks.clear();
      this.susResults.clear();
      this.susActiveScans.set(0);
      this.susSnapshots.clear();
      this.susBurstRescan.clear();
      this.storageDirtyChunks.clear();
      this.blockEspScannedChunks.clear();
      this.armorStandWeightByChunk.clear();
      this.villagerCountByChunk.clear();
      this.itemFrameCountByChunk.clear();
      this.droppedItemCountByChunk.clear();
      this.polarBearCountByChunk.clear();
      this.mobCountByChunk.clear();
      this.lastPoweredCoreByChunk.clear();
      this.inferredPlayerChunks.clear();
      this.pendingMiningHints.clear();
      e.INSTANCE.clear();
      this.leakedPacketCrystalsByChunk.clear();
      this.leakedLightCrystalsByChunk.clear();
      this.leakedCulledCrystalsByChunk.clear();
      this.leakedCrystalIconByChunk.clear();
      this.susSectionFingerprint.clear();
      this.clearPacketLightCaches();
      this.scannedLightRevisionByChunk.clear();
      this.lastSightings.clear();
      this.vanishMarks.clear();
      this.haveLastSelf = false;
      this.wasRevealed = null;
      this.lastCenterChunk = Long.MIN_VALUE;
      this.nearbyChunks.clear();
      this.nearbyChunkKeys.clear();
      this.storageCursor = 0;
      this.susCursor = 0;
      this.susTickCounter = 0;
      this.storageTickCounter = 0;
      this.blockEspTickCounter = 0;
      this.nearbyRefreshCounter = 0;
      this.susBurstMode = false;
      this.autoRtpScanTicks = 0;
      this.autoRtpStableTicks = 0;
      this.autoRtpLoadTicks = 0;
      this.autoRtpScanCenter = null;
      this.autoRtpTerrainReady.clear();
   }

   private boolean scanSusOnceNearPlayer(Minecraft var1, ClientLevel var2, x var3) {
      if (this.nearbyChunks.isEmpty()) {
         return false;
      } else {
         if (this.susEntityWeightCooldown <= 0) {
            this.refreshSusEntityWeights(var2);
            this.susEntityWeightCooldown = this.susBurstMode ? 2 : 4;
         } else {
            this.susEntityWeightCooldown--;
         }

         this.drainSusResults(var3);
         ChunkPos var4 = var1.player.chunkPosition();
         int var5 = Math.max(1, var3.chunkScanSimulationDistance());
         this.pruneSusOutsideSimulation(var4, var5);
         int var6 = 0;
         long var7 = var4.toLong();
         if (var2.hasChunk(var4.x, var4.z) && !this.susScannedChunks.contains(var7) && this.offerSusScan(var2, var2.getChunk(var4.x, var4.z), var7, var3)) {
            this.susScannedChunks.add(var7);
            var6++;
         }

         if (this.susBurstMode) {
            int var9 = Math.min(var5, Math.max(2, var1.options.getEffectiveRenderDistance()));
            byte var10 = 48;

            for (int var11 = -var9; var11 <= var9 && var6 < var10; var11++) {
               for (int var12 = -var9; var12 <= var9 && var6 < var10; var12++) {
                  int var13 = var4.x + var11;
                  int var14 = var4.z + var12;
                  if (var2.hasChunk(var13, var14)) {
                     long var15 = ChunkPos.asLong(var13, var14);
                     if (!this.susScannedChunks.contains(var15) && this.offerSusScan(var2, var2.getChunk(var13, var14), var15, var3)) {
                        this.susScannedChunks.add(var15);
                        var6++;
                     }
                  }
               }
            }
         } else {
            int var18 = this.nearbyChunks.size();
            int var19 = Math.min(12, var18);
            int var20 = 0;

            for (int var21 = 0; var21 < var18 && var6 < var19; var21++) {
               int var22 = Math.floorMod(this.susCursor + var21, var18);
               ChunkPos var23 = this.nearbyChunks.get(var22);
               var20++;
               int var24 = Math.max(Math.abs(var23.x - var4.x), Math.abs(var23.z - var4.z));
               if (var24 <= var5 && var2.hasChunk(var23.x, var23.z)) {
                  long var16 = var23.toLong();
                  if (!this.susScannedChunks.contains(var16) && this.offerSusScan(var2, var2.getChunk(var23.x, var23.z), var16, var3)) {
                     this.susScannedChunks.add(var16);
                     var6++;
                  }
               }
            }

            this.susCursor = Math.floorMod(this.susCursor + Math.max(1, var20), var18);
            if (var6 == 0 && var20 > 0) {
               this.susScannedChunks.clear();
            }
         }

         if (var3.isPrimeSusFinderEnabled()) {
            com.wimpyclient.e.a.INSTANCE
               .applyAmethystSiteMarks(
                  var4,
                  Math.max(1, var3.primeSusSimulationDistance),
                  var3.primeSusSensitivity,
                  !this.susBurstMode || this.isSusSimulationScanComplete(var1),
                  true
               );
         }

         return var6 > 0;
      }
   }

   private boolean offerSusScan(ClientLevel var1, LevelChunk var2, long var3, x var5) {
      if (this.susPendingChunks.contains(var3)) {
         return true;
      } else if (this.susActiveScans.get() >= 8) {
         return false;
      } else {
         try {
            return this.enqueueSusScan(var1, var2, var3, var5);
         } catch (RuntimeException var7) {
            return true;
         }
      }
   }

   private boolean enqueueSusScan(ClientLevel var1, LevelChunk var2, long var3, x var5) {
      boolean var6 = var5.isPrimeSusFinderEnabled();
      boolean var7 = var5.isPrimeSusFinderEnabled();
      boolean var8 = var5.isPrimeSusFinderEnabled() && var5.primeSusClusterIcons;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      if (!var6 && !var7 && !var9 && !var10 && !var11 && !var12 && !var13 && !var14 && !var15 && !var16 && !var17 && !var18 && !var19 && !var8) {
         com.wimpyclient.e.a.INSTANCE.clearAmethystSite(var3);
         return true;
      } else {
         ChunkPos var20 = var2.getPos();
         int var21;
         synchronized (this.packetLightLock) {
            var21 = this.packetLightRevisionByChunk.get(var3);
         }

         boolean var42 = var21 != this.scannedLightRevisionByChunk.get(var3);
         boolean var23 = var6 || var7 || var8;
         List var24 = var23 ? List.copyOf(com.wimpyclient.e.a.INSTANCE.nearbyGeodeCenters(var3)) : List.of();
         boolean var25 = var23 && !var24.isEmpty() && !com.wimpyclient.e.a.INSTANCE.hasAmethystSite(var3);
         long var26 = fingerprintChunkSections(var2);
         this.susSectionFingerprint.defaultReturnValue(Long.MIN_VALUE);
         if (var26 != this.susSectionFingerprint.get(var3) || !this.susSnapshots.has(var20.x, var20.z) || var25 || var23 && var42) {
            int var28 = var20.getMinBlockX();
            int var29 = var20.getMinBlockZ();
            int[] var30 = new int[256];
            int var31 = Integer.MAX_VALUE;

            for (int var32 = 0; var32 < 16; var32++) {
               for (int var33 = 0; var33 < 16; var33++) {
                  int var34 = var1.getHeight(Types.MOTION_BLOCKING, var28 + var33, var29 + var32);
                  var30[var32 * 16 + var33] = var34;
                  if (var34 < var31) {
                     var31 = var34;
                  }
               }
            }

            if (var31 == Integer.MAX_VALUE) {
               var31 = var1.getSeaLevel();
            }

            com.wimpyclient.p.e$b var43 = this.susSnapshots.capture(var2, var30, var1.getSeaLevel());
            boolean var44 = this.susSnapshots.has(var43.chunkX(), var43.chunkZ());
            boolean var45 = var44 && this.susSnapshots.compare(var43.chunkX(), var43.chunkZ(), var43.minY(), var43.sections()).isEmpty();
            this.susSnapshots.store(var43.chunkX(), var43.chunkZ(), var43.minY(), var43.sections());
            this.susSectionFingerprint.put(var3, var26);
            if (!var45 || var25 || var23 && var42) {
               a$d var35 = a$d.EMPTY;
               if (var23) {
                  var35 = a$d.copyEngine(var1, var20.x, var20.z);
                  if (var35.empty()) {
                     synchronized (this.packetLightLock) {
                        var35 = a$d.copyOf((a$e)this.packetLightGridByChunk.get(var3));
                     }
                  }
               }

               int var46 = 0;
               if (var16) {
                  for (BlockEntity var38 : var2.getBlockEntities().values()) {
                     if (var38 instanceof BeehiveBlockEntity var39) {
                        var46 += Math.max(0, var39.getOccupantCount());
                     }
                  }
               }

               a$h var47 = new a$h(
                  var43,
                  var3,
                  var31,
                  Level.END.equals(var1.dimension()),
                  Math.max(1, Math.min(10, var5.primeSusSensitivity)),
                  var6,
                  var7,
                  var8,
                  var9,
                  var10,
                  var11,
                  var12,
                  var13,
                  var14,
                  var15,
                  var16,
                  var17,
                  var18,
                  var19,
                  this.droppedItemCountByChunk.get(var3),
                  this.polarBearCountByChunk.get(var3),
                  this.mobCountByChunk.get(var3),
                  this.armorStandWeightByChunk.get(var3),
                  this.villagerCountByChunk.get(var3),
                  this.itemFrameCountByChunk.get(var3),
                  var46,
                  var35,
                  var24,
                  var21
               );
               this.susPendingChunks.add(var3);
               this.susActiveScans.incrementAndGet();
               this.susWorkers.execute(() -> {
                  try {
                     this.susResults.add(this.analyzeSusSnapshot(var47));
                  } catch (RuntimeException var6x) {
                     this.susResults.add(a$g.failed(var47.key()));
                  } finally {
                     this.susActiveScans.decrementAndGet();
                  }
               });
               return true;
            } else {
               return true;
            }
         } else {
            return true;
         }
      }
   }

   private void drainSusResults(x var1) {
      a$g var2;
      for (int var3 = 0; var3 < 24 && (var2 = this.susResults.poll()) != null; var3++) {
         this.susPendingChunks.remove(var2.key());
         this.applySusResult(var2, var1);
      }
   }

   private void pruneSusOutsideSimulation(ChunkPos var1, int var2) {
      com.wimpyclient.e.a.INSTANCE.clearSusOutsideRange(var1, var2);
      this.susScannedChunks.removeIf(var2x -> outsideSim(var2x, var1, var2));
      this.susPendingChunks.removeIf(var2x -> outsideSim(var2x, var1, var2));
      this.susBurstRescan.removeIf(var2x -> outsideSim(var2x, var1, var2));
      this.susSnapshots.retain(var2x -> !outsideSim(var2x, var1, var2));
      LongPredicate var3 = var2x -> outsideSim(var2x, var1, var2);
      i.removeKeysIf(this.leakedPacketCrystalsByChunk, var3);
      i.removeKeysIf(this.leakedLightCrystalsByChunk, var3);
      i.removeKeysIf(this.leakedCulledCrystalsByChunk, var3);
      i.removeKeysIf(this.leakedCrystalIconByChunk, var3);
      i.removeKeysIf(this.susSectionFingerprint, var3);
      i.removeKeysIf(this.lastPoweredCoreByChunk, var3);
      synchronized (this.packetLightLock) {
         i.removeKeysIf(this.packetLightGridByChunk, var3);
         i.removeKeysIf(this.packetLightRevisionByChunk, var3);
      }

      i.removeKeysIf(this.scannedLightRevisionByChunk, var3);
   }

   private void pruneCachesOutsideNearby() {
      if (!this.nearbyChunkKeys.isEmpty()) {
         LongPredicate var1 = var1x -> !this.nearbyChunkKeys.contains(var1x);
         i.removeKeysIf(this.susSectionFingerprint, var1);
         i.removeKeysIf(this.lastPoweredCoreByChunk, var1);
         i.removeKeysIf(this.leakedPacketCrystalsByChunk, var1);
         i.removeKeysIf(this.leakedLightCrystalsByChunk, var1);
         i.removeKeysIf(this.leakedCulledCrystalsByChunk, var1);
         i.removeKeysIf(this.leakedCrystalIconByChunk, var1);
         i.removeKeysIf(this.scannedLightRevisionByChunk, var1);
         this.susSnapshots.retain(var1x -> this.nearbyChunkKeys.contains(var1x));
         synchronized (this.packetLightLock) {
            i.removeKeysIf(this.packetLightGridByChunk, var1);
            i.removeKeysIf(this.packetLightRevisionByChunk, var1);
         }
      }
   }

   private void clearPacketLightCaches() {
      synchronized (this.packetLightLock) {
         this.packetLightGridByChunk.clear();
         this.packetLightRevisionByChunk.clear();
      }
   }

   private void clearSusOnlyCaches() {
      boolean var1;
      synchronized (this.packetLightLock) {
         var1 = this.packetLightGridByChunk.isEmpty() && this.packetLightRevisionByChunk.isEmpty();
      }

      if (!var1
         || !this.susSectionFingerprint.isEmpty()
         || !this.scannedLightRevisionByChunk.isEmpty()
         || !this.leakedPacketCrystalsByChunk.isEmpty()
         || !this.leakedLightCrystalsByChunk.isEmpty()
         || !this.leakedCulledCrystalsByChunk.isEmpty()
         || !this.leakedCrystalIconByChunk.isEmpty()
         || this.susSnapshots.size() != 0
         || !this.susPendingChunks.isEmpty()
         || !this.susBurstRescan.isEmpty()) {
         this.clearPacketLightCaches();
         this.susSectionFingerprint.clear();
         this.scannedLightRevisionByChunk.clear();
         this.leakedPacketCrystalsByChunk.clear();
         this.leakedLightCrystalsByChunk.clear();
         this.leakedCulledCrystalsByChunk.clear();
         this.leakedCrystalIconByChunk.clear();
         this.susPendingChunks.clear();
         this.susBurstRescan.clear();
         this.susResults.clear();
         this.susSnapshots.clear();
      }
   }

   private static boolean outsideSim(long var0, ChunkPos var2, int var3) {
      ChunkPos var4 = new ChunkPos(var0);
      return Math.max(Math.abs(var4.x - var2.x), Math.abs(var4.z - var2.z)) > var3;
   }

   private static long fingerprintChunkSections(LevelChunk var0) {
      LevelChunkSection[] var1 = var0.getSections();
      long var2 = -7046029254386353131L;

      for (int var4 = 0; var4 < var1.length; var4++) {
         LevelChunkSection var5 = var1[var4];
         var2 ^= var4 * -4658895280553007687L;
         if (var5 != null && !var5.hasOnlyAir()) {
            for (byte var6 = 0; var6 < 16; var6 += 4) {
               for (byte var7 = 0; var7 < 16; var7 += 4) {
                  for (byte var8 = 0; var8 < 16; var8 += 4) {
                     var2 = Long.rotateLeft(var2, 5) ^ Block.getId(var5.getBlockState(var8, var6, var7));
                  }
               }
            }
         } else {
            var2 = Long.rotateLeft(var2, 7);
         }
      }

      return var2;
   }

   private void refreshSusEntityWeights(ClientLevel var1) {
      this.armorStandWeightByChunk.clear();
      this.villagerCountByChunk.clear();
      this.itemFrameCountByChunk.clear();
      this.droppedItemCountByChunk.clear();
      this.polarBearCountByChunk.clear();
      this.mobCountByChunk.clear();
      MutableBlockPos var2 = new MutableBlockPos();
      this.susSurfaceByColumn.clear();
      this.susSurfaceByColumn.defaultReturnValue(Integer.MIN_VALUE);

      for (Entity var4 : var1.entitiesForRendering()) {
         BlockPos var5 = var4.blockPosition();
         long var6 = var4.chunkPosition().toLong();
         if (var4 instanceof ItemEntity && var4.getY() < 0.0) {
            this.droppedItemCountByChunk.addTo(var6, 1);
         }

         if (var4 instanceof PolarBear && var4.getY() < 0.0) {
            this.polarBearCountByChunk.addTo(var6, 3);
         }

         if (!(var4 instanceof Player) && var4.getY() < 20.0) {
            this.mobCountByChunk.addTo(var6, 1);
         }

         boolean var8 = var4 instanceof ArmorStand || var4 instanceof Villager || var4 instanceof ItemFrame;
         if (var8) {
            long var9 = BlockPos.asLong(var5.getX(), 0, var5.getZ());
            int var11 = this.susSurfaceByColumn.get(var9);
            if (var11 == Integer.MIN_VALUE) {
               var11 = var1.getHeight(Types.MOTION_BLOCKING, var5.getX(), var5.getZ());
               this.susSurfaceByColumn.put(var9, var11);
            }

            if (isUndergroundColumn(var1, var5.getX(), var5.getY(), var5.getZ(), var11, var11, var2)) {
               if (var4 instanceof ArmorStand var12) {
                  if (!var12.isMarker()) {
                     int var13 = armorStandHasGear(var12) ? 2 : 1;
                     this.armorStandWeightByChunk.addTo(var6, var13);
                  }
               } else if (var4 instanceof Villager) {
                  this.villagerCountByChunk.addTo(var6, 1);
               } else if (var4 instanceof ItemFrame) {
                  this.itemFrameCountByChunk.addTo(var6, 1);
               }
            }
         }
      }
   }

   private static boolean isUndergroundColumn(int var0, int var1, int var2, boolean var3) {
      if (var3) {
         return false;
      } else {
         int var4 = var1;
         if (var1 > var2 + 16) {
            var4 = var2;
         }

         return var0 < var4 - 4;
      }
   }

   private static boolean isUndergroundColumn(ClientLevel var0, int var1, int var2, int var3, int var4, int var5, MutableBlockPos var6) {
      int var7 = var4 - 1;
      boolean var8 = isFloatingPlatformColumn(var0, var1, var7, var3, var6);
      return isUndergroundColumn(var2, var4, var5, var8);
   }

   private static boolean isFloatingPlatformColumn(com.wimpyclient.p.e$b var0, int var1, int var2, int var3) {
      if (var2 < var0.seaLevel() + 24) {
         return false;
      } else {
         int var4 = 0;
         int var5 = var2;

         int var6;
         for (var6 = var0.minY(); var5 >= var6 && var4 < 29 && !var0.isAir(var1, var5, var3); var5--) {
            var4++;
         }

         if (var4 != 0 && var4 <= 28) {
            int var7;
            for (var7 = 0; var5 >= var6 && var7 < 10 && var0.isAir(var1, var5, var3); var5--) {
               var7++;
            }

            return var7 >= 10;
         } else {
            return false;
         }
      }
   }

   private static boolean isFloatingPlatformColumn(ClientLevel var0, int var1, int var2, int var3, MutableBlockPos var4) {
      if (var2 < var0.getSeaLevel() + 24) {
         return false;
      } else {
         int var5 = 0;
         int var6 = var2;

         int var7;
         for (var7 = var0.getMinY(); var6 >= var7 && var5 < 29; var6--) {
            var4.set(var1, var6, var3);
            if (var0.getBlockState(var4).isAir()) {
               break;
            }

            var5++;
         }

         if (var5 != 0 && var5 <= 28) {
            int var8;
            for (var8 = 0; var6 >= var7 && var8 < 10; var6--) {
               var4.set(var1, var6, var3);
               if (!var0.getBlockState(var4).isAir()) {
                  break;
               }

               var8++;
            }

            return var8 >= 10;
         } else {
            return false;
         }
      }
   }

   private static boolean armorStandHasGear(ArmorStand var0) {
      for (EquipmentSlot var4 : EquipmentSlot.values()) {
         if (var4 != EquipmentSlot.BODY && var4 != EquipmentSlot.SADDLE && !var0.getItemBySlot(var4).isEmpty()) {
            return true;
         }
      }

      return false;
   }

   private boolean scanStoragePass(ClientLevel var1, x var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      if (this.nearbyChunks.isEmpty()) {
         return false;
      } else {
         int var7 = this.nearbyChunks.size();
         int var8 = Math.min(6, Math.max(2, var2.chunksPerScan));
         int var9 = 0;
         ChunkPos var10 = Minecraft.getInstance().player != null ? Minecraft.getInstance().player.chunkPosition() : this.nearbyChunks.get(0);
         if (!this.storageDirtyChunks.isEmpty()) {
            long[] var11 = this.storageDirtyChunks.toLongArray();
            this.storageDirtyChunks.clear();

            for (long var15 : var11) {
               if (var9 >= var8) {
                  this.storageDirtyChunks.add(var15);
               } else if (this.nearbyChunkKeys.contains(var15)) {
                  ChunkPos var17 = new ChunkPos(var15);
                  if (chunkChebyshev(var17, var10) <= 6 && var1.hasChunk(var17.x, var17.z)) {
                     this.scanStorageChunk(var1, var1.getChunk(var17.x, var17.z), var15, var2, var3, var4, var5);
                     var9++;
                  }
               }
            }
         }

         if (!var6 && var9 < var8) {
            int var18 = 0;

            for (int var19 = 0; var19 < var7 && var9 < var8; var19++) {
               ChunkPos var20 = this.nearbyChunks.get(Math.floorMod(this.storageCursor + var19, var7));
               var18++;
               if (chunkChebyshev(var20, var10) <= 6 && var1.hasChunk(var20.x, var20.z)) {
                  long var21 = var20.toLong();
                  this.scanStorageChunk(var1, var1.getChunk(var20.x, var20.z), var21, var2, var3, var4, var5);
                  var9++;
               }
            }

            if (var18 > 0) {
               this.storageCursor = Math.floorMod(this.storageCursor + var18, var7);
            }
         }

         return var9 > 0;
      }
   }

   private void scanStorageChunk(ClientLevel var1, LevelChunk var2, long var3, x var5, boolean var6, boolean var7, boolean var8) {
      ArrayList var9 = var6 ? new ArrayList() : null;
      ArrayList var10 = var7 ? new ArrayList() : null;
      ArrayList var11 = var8 ? new ArrayList() : null;
      this.collectBlockEntityMarkers(var1, var2, var5, var6, var7, var8, var9, var10, var11);
      com.wimpyclient.e.a var12 = com.wimpyclient.e.a.INSTANCE;
      if (var6) {
         var12.replaceStorageInChunk(var3, var9);
      }

      if (var7) {
         var12.replaceSpawnersInChunk(var3, var10);
      }

      if (var8) {
         var12.replaceNbtMarkersInChunk(var3, var11);
      }
   }

   private boolean scanBlockEspPass(Minecraft var1, ClientLevel var2, x var3) {
      if (!this.nearbyChunks.isEmpty() && var1.player != null) {
         ChunkPos var4 = var1.player.chunkPosition();
         int var5 = Math.max(2, var1.options.getEffectiveRenderDistance());
         int var6 = 0;

         for (int var7 = 0; var7 <= var5 && var6 < 4; var7++) {
            if (var7 == 0) {
               if (this.tryScanBlockEspChunk(var2, var3, var4.x, var4.z)) {
                  var6++;
               }
            } else {
               for (int var8 = -var7; var8 <= var7 && var6 < 4; var8++) {
                  if (this.tryScanBlockEspChunk(var2, var3, var4.x + var8, var4.z - var7)) {
                     var6++;
                  }

                  if (var6 >= 4) {
                     break;
                  }

                  if (this.tryScanBlockEspChunk(var2, var3, var4.x + var8, var4.z + var7)) {
                     var6++;
                  }
               }

               for (int var9 = -var7 + 1; var9 <= var7 - 1 && var6 < 4; var9++) {
                  if (this.tryScanBlockEspChunk(var2, var3, var4.x - var7, var4.z + var9)) {
                     var6++;
                  }

                  if (var6 >= 4) {
                     break;
                  }

                  if (this.tryScanBlockEspChunk(var2, var3, var4.x + var7, var4.z + var9)) {
                     var6++;
                  }
               }
            }
         }

         return var6 > 0;
      } else {
         return false;
      }
   }

   private boolean tryScanBlockEspChunk(ClientLevel var1, x var2, int var3, int var4) {
      if (!var1.hasChunk(var3, var4)) {
         return false;
      } else {
         long var5 = ChunkPos.asLong(var3, var4);
         if (this.nearbyChunkKeys.contains(var5) && !this.blockEspScannedChunks.contains(var5)) {
            this.scanBlockEspChunk(var1, var1.getChunk(var3, var4), var5, var2);
            this.blockEspScannedChunks.add(var5);
            return true;
         } else {
            return false;
         }
      }
   }

   private void scanBlockEspChunk(ClientLevel var1, LevelChunk var2, long var3, x var5) {
      Map var6 = var5.blockEspByBlock;
      ArrayList var7 = new ArrayList();
      LevelChunkSection[] var8 = var2.getSections();
      int var9 = var2.getPos().getMinBlockX();
      int var10 = var2.getPos().getMinBlockZ();

      for (int var11 = 0; var11 < var8.length; var11++) {
         LevelChunkSection var12 = var8[var11];
         if (var12 != null && !var12.hasOnlyAir() && var12.maybeHas(var1x -> {
            k var2x = k.settingsFor(var1x.getBlock(), var6);
            return var2x != null && var2x.enabled;
         })) {
            int var13 = SectionPos.sectionToBlockCoord(var2.getSectionYFromSectionIndex(var11));

            for (int var14 = 0; var14 < 16; var14++) {
               int var15 = var13 + var14;

               for (int var16 = 0; var16 < 16; var16++) {
                  int var17 = var10 + var16;

                  for (int var18 = 0; var18 < 16; var18++) {
                     k var19 = k.settingsFor(var12.getBlockState(var18, var14, var16).getBlock(), var6);
                     if (var19 != null && var19.enabled) {
                        int var20 = var9 + var18;
                        var7.add(new com.wimpyclient.e.b(new BlockPos(var20, var15, var17), var19.red, var19.green, var19.blue));
                        if (var7.size() >= 512) {
                           com.wimpyclient.e.a.INSTANCE.replaceBlockEspInChunk(var3, var7);
                           return;
                        }
                     }
                  }
               }
            }
         }
      }

      com.wimpyclient.e.a.INSTANCE.replaceBlockEspInChunk(var3, var7);
   }

   private void refreshNearbyChunks(Minecraft var1, ClientLevel var2) {
      ChunkPos var3 = var1.player.chunkPosition();
      long var4 = var3.toLong();
      int var6 = Math.max(2, var1.options.getEffectiveRenderDistance());
      boolean var7 = this.lastCenterChunk != var4;
      if (!var7 && !this.nearbyChunks.isEmpty()) {
         this.nearbyRefreshCounter++;
         if (this.nearbyRefreshCounter < 20) {
            return;
         }
      }

      this.nearbyRefreshCounter = 0;
      if (var7 && this.lastCenterChunk != Long.MIN_VALUE) {
         ChunkPos var8 = new ChunkPos(this.lastCenterChunk);
         int var9 = Math.max(Math.abs(var3.x - var8.x), Math.abs(var3.z - var8.z));
         if (var9 > var6) {
            this.storageCursor = 0;
            this.susCursor = 0;
            this.notifiedSpawners.clear();
            this.susScannedChunks.clear();
            this.blockEspScannedChunks.clear();
            this.storageDirtyChunks.clear();
         }
      }

      this.lastCenterChunk = var4;
      this.nearbyDirty = true;
      this.nearbyChunks.clear();
      this.nearbyChunkKeys.clear();

      for (int var13 = -var6; var13 <= var6; var13++) {
         for (int var14 = -var6; var14 <= var6; var14++) {
            int var10 = var3.x + var13;
            int var11 = var3.z + var14;
            if (var2.hasChunk(var10, var11)) {
               ChunkPos var12 = new ChunkPos(var10, var11);
               this.nearbyChunks.add(var12);
               this.nearbyChunkKeys.add(var12.toLong());
            }
         }
      }
   }

   private void pruneNotifiedSpawners() {
      if (!this.notifiedSpawners.isEmpty()) {
         this.notifiedSpawners.removeIf(var1 -> !this.nearbyChunkKeys.contains(new ChunkPos(BlockPos.of(var1)).toLong()));
      }
   }

   private void updatePlayers(Minecraft var1, ClientLevel var2, x var3) {
      if (!var3.playerMarker.qo()) {
         com.wimpyclient.e.a.INSTANCE.replacePlayerMarkers(List.of());
      }

      if (var3.growthDebug.qo()) {
         e.INSTANCE.tick(var1);
      } else {
         e.INSTANCE.clear();
      }
   }

   private static int chunkChebyshev(ChunkPos var0, ChunkPos var1) {
      return Math.max(Math.abs(var0.x - var1.x), Math.abs(var0.z - var1.z));
   }

   public void onPositionalSound(double var1, double var3, double var5, Holder<SoundEvent> var7, SoundSource var8) {
      this.onPositionalSound(var1, var3, var5, (SoundEvent)var7.value(), var8);
   }

   public void onPositionalSound(double var1, double var3, double var5, SoundEvent var7, SoundSource var8) {
      this.noteAmethystSoundLeak(var1, var3, var5, var7);
   }

   public void onLevelEvent(int var1, BlockPos var2, int var3) {
      this.noteAmethystDestroyLeak(var1, var2, var3);
   }

   public void onBlockEvent(BlockPos var1, Block var2, int var3) {
   }

   public void onEntityDamaged(ClientLevel var1, int var2, int var3, int var4) {
   }

   public void onPassengersUpdate(ClientLevel var1, int var2, int[] var3) {
   }

   public void onServerBlockUpdate(BlockPos var1, BlockState var2, BlockState var3) {
      this.noteAmethystBlockUpdateLeak(var1, var2, var3);
      if (x.INSTANCE.growthDebug.qo()) {
         e.INSTANCE.onBlockUpdate(var1, var2, var3);
      }
   }

   public void onChunkArrived(int var1, int var2) {
      if (x.INSTANCE.growthDebug.qo()) {
         e.INSTANCE.onChunkArrived(var1, var2);
      }

      b.INSTANCE.onChunkArrived(var1, var2);
   }

   public void onBlockDestructionProgress(ClientLevel var1, int var2, BlockPos var3, int var4) {
   }

   private void notePlayerPresenceHint(double var1, double var3, double var5, x var7, double var8, String var10) {
   }

   private void reportSignal(x var1, String var2, double var3, double var5, double var7) {
   }

   private void trackVanishedPlayers(Minecraft var1, LocalPlayer var2, Set<UUID> var3) {
      ClientPacketListener var4 = var1.getConnection();
      if (var4 != null && var2 != null) {
         boolean var5 = this.haveLastSelf && var2.distanceToSqr(this.lastSelfX, this.lastSelfY, this.lastSelfZ) > 4096.0;
         this.lastSelfX = var2.getX();
         this.lastSelfY = var2.getY();
         this.lastSelfZ = var2.getZ();
         this.haveLastSelf = true;
         long var6 = System.currentTimeMillis();
         Iterator var8 = this.lastSightings.entrySet().iterator();

         while (var8.hasNext()) {
            Entry var9 = (Entry)var8.next();
            if (!var3.contains(var9.getKey())) {
               var8.remove();
               a$c var10 = (a$c)var9.getValue();
               if (!var5 && var10.insideViewEdge() && var4.getPlayerInfo((UUID)var9.getKey()) != null) {
                  this.vanishMarks.put((UUID)var9.getKey(), new a$i(var10.chunkKey(), var6));
                  this.reportSignal(x.INSTANCE, "vanish " + var10.name(), var10.x(), var10.y(), var10.z());
                  if (h.INSTANCE.isEnabled()) {
                     h.INSTANCE.offerActivity(ChunkPos.getX(var10.chunkKey()), ChunkPos.getZ(var10.chunkKey()), 12);
                  }
               }
            }
         }

         Iterator var13 = this.vanishMarks.entrySet().iterator();

         while (var13.hasNext()) {
            Entry var14 = (Entry)var13.next();
            if (!var3.contains(var14.getKey()) && var4.getPlayerInfo((UUID)var14.getKey()) != null && var6 - ((a$i)var14.getValue()).seenAtMs() <= 300000L) {
               long var11 = ((a$i)var14.getValue()).chunkKey();
               com.wimpyclient.e.a.INSTANCE.markPlayerChunk(var11);
               if (h.INSTANCE.isEnabled()) {
                  h.INSTANCE.offerActivity(ChunkPos.getX(var11), ChunkPos.getZ(var11), 2);
               }
            } else {
               var13.remove();
            }
         }
      } else {
         this.lastSightings.clear();
         this.vanishMarks.clear();
         this.haveLastSelf = false;
      }
   }

   private static boolean explainedBySurfacePlayer(ClientLevel var0, LocalPlayer var1, double var2, double var4, double var6, int var8) {
      for (AbstractClientPlayer var10 : var0.players()) {
         if (var10 != var1
            && !(var10 instanceof LocalPlayer)
            && !(var10 instanceof p)
            && !(var10.getY() <= var8)
            && var10.distanceToSqr(var2, var4, var6) < 1024.0) {
            return true;
         }
      }

      return false;
   }

   private static boolean isViewerRevealed(LocalPlayer var0, x var1) {
      return false;
   }

   private static boolean isViewerRevealed(x var0) {
      return false;
   }

   private static boolean insideViewEdge(Minecraft var0, LocalPlayer var1, Player var2) {
      double var3 = var0.options.getEffectiveRenderDistance() * 16.0 - 32.0;
      if (var3 <= 0.0) {
         return false;
      } else {
         double var5 = var2.getX() - var1.getX();
         double var7 = var2.getZ() - var1.getZ();
         return var5 * var5 + var7 * var7 < var3 * var3;
      }
   }

   private void applyInferredPlayerChunks() {
      long var1 = System.currentTimeMillis();
      ObjectIterator var3 = this.inferredPlayerChunks.long2LongEntrySet().iterator();

      while (var3.hasNext()) {
         it.unimi.dsi.fastutil.longs.Long2LongMap.Entry var4 = (it.unimi.dsi.fastutil.longs.Long2LongMap.Entry)var3.next();
         if (var4.getLongValue() < var1) {
            var3.remove();
         } else {
            com.wimpyclient.e.a.INSTANCE.markPlayerChunk(var4.getLongKey());
         }
      }

      ObjectIterator var5 = this.pendingMiningHints.long2LongEntrySet().iterator();

      while (var5.hasNext()) {
         if (((it.unimi.dsi.fastutil.longs.Long2LongMap.Entry)var5.next()).getLongValue() < var1) {
            var5.remove();
         }
      }
   }

   private void scanPlayerPresenceProxies(ClientLevel var1, LocalPlayer var2) {
      x var3 = x.INSTANCE;

      for (Entity var5 : var1.entitiesForRendering()) {
         if (var5 instanceof FishingHook var15) {
            Player var18 = var15.getPlayerOwner();
            if (var18 != var2 && !(var18 instanceof LocalPlayer)) {
               this.notePlayerPresenceHint(var15.getX(), var15.getY(), var15.getZ(), var3, 9.0, "bobber");
            }
         } else if (var5 instanceof ThrownEnderpearl var14) {
            Entity var17 = var14.getOwner();
            if (var17 != var2 && !(var17 instanceof LocalPlayer) && (var17 instanceof Player || var17 == null)) {
               this.notePlayerPresenceHint(var14.getX(), var14.getY(), var14.getZ(), var3, 9.0, "pearl");
            }
         } else if (var5 instanceof AbstractArrow var6) {
            Entity var7 = var6.getOwner();
            if (var7 != var2 && !(var7 instanceof LocalPlayer) && var7 instanceof Player) {
               this.notePlayerPresenceHint(var6.getX(), var6.getY(), var6.getZ(), var3, 9.0, "arrow");
            }
         } else if (var5 instanceof ExperienceOrb var11) {
            this.notePlayerPresenceHint(var11.getX(), var11.getY(), var11.getZ(), var3, 9.0, "xp orb");
         } else if (var5 instanceof FireworkRocketEntity var12) {
            this.notePlayerPresenceHint(var12.getX(), var12.getY(), var12.getZ(), var3, 9.0, "firework");
         } else if (var5 instanceof AbstractBoat var13) {
            double var16 = var13.getX() - var13.xOld;
            double var9 = var13.getZ() - var13.zOld;
            if (var13.getPassengers().isEmpty() && var16 * var16 + var9 * var9 > 0.09) {
               this.notePlayerPresenceHint(var13.getX(), var13.getY(), var13.getZ(), var3, 9.0, "empty boat");
            }
         }
      }
   }

   private static boolean isPlayerOnlyLevelEvent(int var0) {
      return switch (var0) {
         case 1010, 1011, 1030, 1042, 1043, 1044, 1500, 1503, 1505, 2001, 3003, 3004, 3005, 3008 -> true;
         default -> false;
      };
   }

   private static boolean isMinedAway(BlockState var0, BlockState var1) {
      if (!var1.isAir() || var0.isAir() || var0.liquid()) {
         return false;
      } else {
         return var0.blocksMotion() && !(var0.getBlock() instanceof FallingBlock)
            ? !var0.is(BlockTags.LEAVES) && !var0.is(BlockTags.ICE) && !var0.is(BlockTags.SNOW) && !var0.is(BlockTags.FIRE)
            : false;
      }
   }

   private static boolean isPlayerPresenceSound(SoundSource var0, SoundEvent var1) {
      String var2 = var1.location().getPath();
      if (var2.startsWith("item.trident")
         || var2.equals("entity.arrow.shoot")
         || var2.equals("entity.arrow.hit")
         || var2.startsWith("item.crossbow")
         || var2.startsWith("entity.pillager")
         || var2.startsWith("entity.vindicator")
         || var2.startsWith("entity.evoker")
         || var2.startsWith("entity.illusioner")
         || var2.startsWith("entity.piglin")
         || var2.startsWith("entity.skeleton")
         || var2.startsWith("entity.stray")
         || var2.startsWith("entity.wither_skeleton")) {
         return false;
      } else if (var0 == SoundSource.PLAYERS) {
         return true;
      } else if (var0 == SoundSource.BLOCKS) {
         return var2.endsWith(".place")
            || var2.startsWith("block.chest.")
            || var2.startsWith("block.ender_chest.")
            || var2.startsWith("block.barrel.")
            || var2.startsWith("block.shulker_box.")
            || var2.startsWith("block.enchantment_table.")
            || var2.startsWith("block.beacon.")
            || var2.startsWith("block.lever.")
            || var2.startsWith("block.stone_button.")
            || var2.startsWith("block.wooden_button.")
            || var2.equals("block.bell.use")
            || var2.equals("block.respawn_anchor.charge")
            || var2.equals("block.cake.add_candle")
            || var2.equals("block.brewing_stand.brew");
      } else {
         return !var2.startsWith("item.elytra") && !var2.startsWith("entity.firework_rocket") && !var2.startsWith("entity.firework")
            ? var2.startsWith("entity.player.")
               || var2.startsWith("item.armor.equip")
               || var2.startsWith("item.shield")
               || var2.startsWith("item.spyglass")
               || var2.startsWith("item.goat_horn")
               || var2.equals("entity.fishing_bobber.throw")
               || var2.equals("entity.fishing_bobber.retrieve")
               || var2.equals("entity.ender_pearl.throw")
               || var2.equals("entity.experience_bottle.throw")
               || var2.equals("entity.snowball.throw")
               || var2.equals("entity.splash_potion.throw")
               || var2.equals("entity.lingering_potion.throw")
            : false;
      }
   }

   private a$g analyzeSusSnapshot(a$h var1) {
      com.wimpyclient.p.e$b var2 = var1.packed();
      g$a var3 = new g$a();
      ArrayList var4 = new ArrayList();
      LongOpenHashSet var5 = new LongOpenHashSet();
      int[] var6 = var2.surfaceAir();
      boolean[] var7 = new boolean[256];

      for (int var8 = 0; var8 < 16; var8++) {
         for (int var9 = 0; var9 < 16; var9++) {
            int var10 = var6[var8 * 16 + var9] - 1;
            var7[var8 * 16 + var9] = isFloatingPlatformColumn(var2, var9, var10, var8);
         }
      }

      var3.droppedItems = var1.droppedItems();
      var3.polarBears = var1.polarBears();
      if (var1.mobs() > 20) {
         var3.mobCluster = var1.mobs() / 5;
      }

      var3.armorStands = var1.armorStands();
      var3.villagers = var1.villagers();
      var3.itemFrames = var1.itemFrames();
      var3.beeOccupants = var1.beeOccupants();
      countTrialAndAncient(var2, var3);
      boolean var12 = var1.wantCaveVines()
         || var1.wantVines()
         || var1.wantBamboo()
         || var1.wantKelp()
         || var1.wantCrop()
         || var1.wantCocoa()
         || var1.wantBee()
         || var1.wantBerries()
         || var1.wantDripstone()
         || var1.wantGrass();
      if (var12) {
         scanSusFarmSignals(var2, var3, var7, var1.chunkMinSurfaceAir());
      }

      a$a var13 = new a$a();
      if (var1.wantAmethyst() || var1.wantGeode() || var1.wantClusterIcons()) {
         var13 = collectAmethystFromPacked(var2, var3, var4, var5);
         a$f var14 = findGeodeBlob(var2);
         BlockPos var11 = var14 != null ? var14.center() : nearestNearbyCenter(var2, var1.nearbyCenters());
         if (var14 != null) {
            var13.occupyWorldBounds(var14.minX(), var14.minZ(), var14.maxX(), var14.maxZ());
         }

         if (var11 != null) {
            var13.setWorldCenter(var11);
            scanAddonChunk(var2, var1.packetLight(), var3, var4, var5, var13, var11);
         }
      }

      return new a$g(
         var1.key(), var1.sensitivity(), var1.wantAmethyst(), var1.wantGeode(), var1.wantClusterIcons(), false, false, var3, var4, var13, var1.lightRevision()
      );
   }

   private void applySusResult(a$g var1, x var2) {
      com.wimpyclient.e.a var3 = com.wimpyclient.e.a.INSTANCE;
      this.scannedLightRevisionByChunk.put(var1.key(), var1.lightRevision());
      if (!var1.failed()) {
         if (var1.skybase()) {
            var3.clearAmethystSite(var1.key());
         } else {
            g$a var4 = var1.evidence();
            a$a var5 = var1.site();
            BlockPos var6 = var5.icon;
            BlockPos var7 = var5.crystalIcon;
            BlockPos var8 = var6 != null ? var6 : var7;
            boolean var9 = var1.wantAmethyst();
            boolean var10 = var1.wantGeode();
            boolean var11 = var1.wantClusterIcons();
            BlockPos var12 = var5.findGeodeCenter();
            ArrayList<com.wimpyclient.e.d> var13 = new ArrayList<>(var1.crystals());
            ArrayList var14 = new ArrayList();
            if (var12 != null) {
               var14.add(var12);
            }

            var14.addAll(var3.nearbyGeodeCenters(var1.key()));
            if (var12 != null) {
               var8 = var12;
            } else if (var5.icon != null) {
               var8 = var5.icon;
            } else if (var5.crystalIcon != null) {
               var8 = var5.crystalIcon;
            }

            if (var8 == null && !var13.isEmpty()) {
               var8 = ((com.wimpyclient.e.d)var13.get(0)).pos();
            }

            if (var12 != null && !var13.isEmpty()) {
               var13.removeIf(var1x -> !nearGeodeCenter(var12, var1x.pos().getX(), var1x.pos().getY(), var1x.pos().getZ()));
            }

            boolean var15 = var12 != null;
            if ((var9 || var10 || var11) && var8 != null && var15) {
               var3.setAmethystSite(
                  var1.key(),
                  new int[]{var5.minX, var5.minZ, var5.maxX, var5.maxZ},
                  var8,
                  var5.shellBlocks,
                  !var4.crystalsVisible() && var15,
                  var15,
                  var13,
                  var4.budding,
                  var4.amethystBlock
               );
               this.invalidateNeighborGeodeChunks(var1.key());
            } else {
               var3.clearAmethystSite(var1.key());
               if (!var14.isEmpty() && (hasLightCrystal(var13) || hasConfirmedCrystal(var13))) {
                  var3.appendGeodeCrystals(nearestGeodeCenter(var14, var8), hiddenClusterMarks(var13));
               }
            }
         }
      }
   }

   private void invalidateNeighborGeodeChunks(long var1) {
      ChunkPos var3 = new ChunkPos(var1);

      for (int var4 = -1; var4 <= 1; var4++) {
         for (int var5 = -1; var5 <= 1; var5++) {
            if (var4 != 0 || var5 != 0) {
               this.invalidateSusScan(ChunkPos.asLong(var3.x + var4, var3.z + var5));
            }
         }
      }
   }

   private static BlockPos nearestGeodeCenter(List<BlockPos> var0, BlockPos var1) {
      if (var0.isEmpty()) {
         return null;
      } else if (var1 == null) {
         return (BlockPos)var0.get(0);
      } else {
         BlockPos var2 = (BlockPos)var0.get(0);
         int var3 = Integer.MAX_VALUE;

         for (BlockPos var5 : var0) {
            int var6 = Math.max(Math.abs(var1.getX() - var5.getX()), Math.max(Math.abs(var1.getY() - var5.getY()), Math.abs(var1.getZ() - var5.getZ())));
            if (var6 < var3) {
               var3 = var6;
               var2 = var5;
            }
         }

         return var2;
      }
   }

   private static List<com.wimpyclient.e.d> hiddenClusterMarks(List<com.wimpyclient.e.d> var0) {
      ArrayList var1 = new ArrayList();

      for (com.wimpyclient.e.d var3 : var0) {
         if (var3.kind().countsAsCluster()) {
            var1.add(var3);
         }
      }

      return var1;
   }

   private static void scanSusFarmSignals(com.wimpyclient.p.e$b var0, g$a var1, boolean[] var2, int var3) {
      int[] var4 = var0.surfaceAir();
      int[][] var5 = var0.sections();
      int[] var6 = new int[256];
      int var7 = var0.originX();
      int var8 = var0.originZ();
      LongOpenHashSet var9 = new LongOpenHashSet();

      for (int var10 = 0; var10 < var5.length; var10++) {
         int[] var11 = var5[var10];
         if (var11 != null) {
            int var12 = var0.minY() + var10 * 16;

            for (int var13 = 0; var13 < 16; var13++) {
               int var14 = var12 + var13;

               for (int var15 = 0; var15 < 16; var15++) {
                  for (int var16 = 0; var16 < 16; var16++) {
                     int var17 = var15 * 16 + var16;
                     BlockState var18 = var0.get(var16, var14, var15);
                     Block var19 = var18.getBlock();
                     if (var19 == Blocks.POINTED_DRIPSTONE && var14 >= -12 && var14 <= 80) {
                        var6[var17]++;
                     } else {
                        if (var6[var17] >= 5) {
                           var1.dripstoneSpikes++;
                        }

                        var6[var17] = 0;
                     }

                     if (!var18.isAir()) {
                        boolean var20 = isUndergroundColumn(var14, var4[var17], var3, var2[var17]);
                        if (isJungleCanopy(var19)) {
                           var1.jungleCanopy++;
                        }

                        if (isMangroveCanopy(var19)) {
                           var1.mangroveCanopy++;
                        }

                        if (var19 == Blocks.PODZOL) {
                           var1.podzol++;
                        }

                        if (var19 == Blocks.BAMBOO && var14 >= var4[var17] - 16) {
                           var1.canopyBamboo++;
                        }

                        if (isLushDecor(var19)) {
                           var1.lushDecor++;
                        }

                        if (isLushRoot(var19)) {
                           var1.lushRoots++;
                        }

                        if (isOceanDecor(var19)) {
                           var1.oceanDecor++;
                        }

                        if (var19 == Blocks.MOSS_BLOCK) {
                           var1.mossBlocks++;
                        }

                        if (var19 == Blocks.BEE_NEST) {
                           var1.beeNests++;
                           if (isFullHoney(var18)) {
                              var1.fullHoney++;
                           }
                        } else if (var19 == Blocks.BEEHIVE) {
                           var1.beehives++;
                           if (isFullHoney(var18)) {
                              var1.fullHoney++;
                           }
                        }

                        if (isGrowthPlant(var19)) {
                           var1.growthBlocks++;
                           if (isGrownGrass(var19)) {
                              var1.grownGrass++;
                              var9.add(BlockPos.asLong(var7 + var16, var14, var8 + var15));
                           }
                        }

                        if (var19 == Blocks.SWEET_BERRY_BUSH
                           && var18.hasProperty(SweetBerryBushBlock.AGE)
                           && (Integer)var18.getValue(SweetBerryBushBlock.AGE) == 3) {
                           var1.maxAgeBerries++;
                        }

                        if (!var2[var17]) {
                           if (!var20) {
                              if (var19 == Blocks.COCOA) {
                                 var1.cocoaPods++;
                              }

                              if (var19 == Blocks.FARMLAND) {
                                 var1.farmland++;
                              } else if (isCropPlant(var19)) {
                                 var1.crops++;
                              } else if (var19 == Blocks.SUGAR_CANE) {
                                 var1.sugarCane++;
                              }

                              if (var19 == Blocks.VINE) {
                                 var1.climbingVines++;
                              }
                           } else {
                              if (isCaveVineTip(var18)) {
                                 if (isBerriedCaveVineTip(var18)) {
                                    var1.berriedVineTips++;
                                 } else {
                                    var1.plainVineTips++;
                                 }
                              } else if (var19 == Blocks.CAVE_VINES_PLANT) {
                                 var1.vineBodies++;
                              }

                              if (var19 == Blocks.VINE) {
                                 var1.climbingVines++;
                              }

                              if (var19 == Blocks.FARMLAND) {
                                 var1.farmland++;
                              } else if (isCropPlant(var19)) {
                                 var1.crops++;
                              } else if (var19 == Blocks.SUGAR_CANE) {
                                 var1.sugarCane++;
                              } else if (var19 == Blocks.COCOA) {
                                 var1.cocoaPods++;
                              }

                              if (var19 == Blocks.BAMBOO && var14 < var4[var17] - 18) {
                                 var1.bambooStalks++;
                                 if (var18.hasProperty(BambooStalkBlock.AGE) && (Integer)var18.getValue(BambooStalkBlock.AGE) == 1) {
                                    var1.thickBamboo++;
                                 }
                              }

                              if (var19 == Blocks.KELP) {
                                 var1.kelpTips++;
                              } else if (var19 == Blocks.KELP_PLANT) {
                                 var1.kelpBodies++;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      for (int var24 : var6) {
         if (var24 >= 5) {
            var1.dripstoneSpikes++;
         }
      }

      var1.denseGrownGrass = hasDenseGrownGrass(var9);
   }

   private static void clearSusClueFlags(com.wimpyclient.e.a var0, long var1) {
      var0.setScanFlag(var1, 32768, false);
   }

   private static a$b countAntiXrayLeaks(ClientLevel var0, LevelChunk var1, int[] var2, int var3, boolean[] var4) {
      int var5 = 0;
      int var6 = 0;
      LongOpenHashSet var7 = new LongOpenHashSet();
      Map var8 = var1.getBlockEntities();
      Map var9 = ((com.wimpyclient.mixin.e)var1).wimpyclient$pendingBlockEntities();
      ChunkPos var10 = var1.getPos();
      int var11 = var10.getMinBlockX();
      int var12 = var10.getMinBlockZ();
      if (var9 != null) {
         for (Entry var14 : ((Map<BlockPos, CompoundTag>)var9).entrySet()) {
            a$b var15 = inspectBePosition(var0, var1, var8, (BlockPos)var14.getKey(), (CompoundTag)var14.getValue(), var7, var2, var3, var4, var11, var12);
            var5 += var15.hiddenMismatches();
            var6 += var15.automationBes();
         }
      }

      for (BlockPos var18 : var1.getBlockEntitiesPos()) {
         a$b var20 = inspectBePosition(var0, var1, var8, var18, null, var7, var2, var3, var4, var11, var12);
         var5 += var20.hiddenMismatches();
         var6 += var20.automationBes();
      }

      for (Entry var19 : ((Map<BlockPos, BlockEntity>)var8).entrySet()) {
         a$b var21 = inspectBePosition(var0, var1, var8, (BlockPos)var19.getKey(), null, var7, var2, var3, var4, var11, var12);
         var5 += var21.hiddenMismatches();
         var6 += var21.automationBes();
      }

      return new a$b(var5, var6);
   }

   private static a$b inspectBePosition(
      ClientLevel var0,
      LevelChunk var1,
      Map<BlockPos, BlockEntity> var2,
      BlockPos var3,
      CompoundTag var4,
      LongOpenHashSet var5,
      int[] var6,
      int var7,
      boolean[] var8,
      int var9,
      int var10
   ) {
      long var11 = var3.asLong();
      if (!var5.add(var11)) {
         return new a$b(0, 0);
      } else {
         int var13 = var3.getX() - var9;
         int var14 = var3.getZ() - var10;
         int var15;
         boolean var16;
         if (var13 >= 0 && var13 < 16 && var14 >= 0 && var14 < 16) {
            int var17 = var14 * 16 + var13;
            var15 = var6[var17];
            var16 = var8[var17];
         } else {
            var15 = var0.getHeight(Types.MOTION_BLOCKING, var3.getX(), var3.getZ());
            var16 = false;
         }

         if (!isUndergroundColumn(var3.getY(), var15, var7, var16)) {
            return new a$b(0, 0);
         } else {
            boolean var27 = var3.getY() < 64;
            Block var18 = var1.getBlockState(var3).getBlock();
            BlockEntity var19 = (BlockEntity)var2.get(var3);
            CompoundTag var20 = var4;
            if (var4 == null) {
               var20 = var1.getBlockEntityNbt(var3);
            }

            Block var21 = var19 != null ? var19.getBlockState().getBlock() : null;
            boolean var22 = isObfuscationFiller(var18);
            boolean var23 = var21 != null && var21 != var18 && !isObfuscationFiller(var21);
            boolean var24 = isAutomationBlockEntity(var19, var21, var20);
            byte var25 = 0;
            byte var26 = 0;
            if (var22 && isPlayerMachineLeak(var19, var21, var20)) {
               var25 = 1;
            }

            if (var24 && (var22 || var23 && var27)) {
               var26 = 1;
            }

            return new a$b(var25, var26);
         }
      }
   }

   private static boolean isPlayerMachineLeak(BlockEntity var0, Block var1, CompoundTag var2) {
      if (isAutomationBlockEntity(var0, var1, var2)) {
         return true;
      } else if (var1 != null && isPlayerStashBlock(var1)) {
         return true;
      } else if (var0 != null && typeNameLooksPlayerStash(String.valueOf(var0.getType()).toLowerCase())) {
         return true;
      } else {
         return var2 != null ? typeNameLooksPlayerStash(var2.getStringOr("id", "").toLowerCase()) : false;
      }
   }

   private static boolean isPlayerStashBlock(Block var0) {
      return var0 == Blocks.SHULKER_BOX
         || var0 instanceof ShulkerBoxBlock
         || var0 == Blocks.DROPPER
         || var0 == Blocks.DISPENSER
         || var0 == Blocks.HOPPER
         || var0 == Blocks.CRAFTER
         || var0 == Blocks.FURNACE
         || var0 == Blocks.BLAST_FURNACE
         || var0 == Blocks.SMOKER
         || var0 == Blocks.BREWING_STAND;
   }

   private static boolean typeNameLooksPlayerStash(String var0) {
      return var0 != null && !var0.isEmpty()
         ? var0.contains("shulker")
            || var0.contains("hopper")
            || var0.contains("dropper")
            || var0.contains("dispenser")
            || var0.contains("crafter")
            || var0.contains("furnace")
            || var0.contains("smoker")
            || var0.contains("blast_furnace")
            || var0.contains("brewing")
         : false;
   }

   private static boolean isAutomationBlockEntity(BlockEntity var0, Block var1, CompoundTag var2) {
      if (var1 != null && isAutomationBlock(var1)) {
         return true;
      } else {
         if (var0 != null) {
            String var3 = String.valueOf(var0.getType()).toLowerCase();
            if (typeNameLooksAutomation(var3)) {
               return true;
            }
         }

         if (var2 != null) {
            String var4 = var2.getStringOr("id", "").toLowerCase();
            return typeNameLooksAutomation(var4);
         } else {
            return false;
         }
      }
   }

   private static boolean isAutomationBlock(Block var0) {
      return var0 == Blocks.HOPPER
         || var0 == Blocks.DROPPER
         || var0 == Blocks.DISPENSER
         || var0 == Blocks.CRAFTER
         || var0 == Blocks.FURNACE
         || var0 == Blocks.BLAST_FURNACE
         || var0 == Blocks.SMOKER
         || var0 == Blocks.BREWING_STAND;
   }

   private static boolean typeNameLooksAutomation(String var0) {
      return var0 != null && !var0.isEmpty()
         ? var0.contains("hopper")
            || var0.contains("dropper")
            || var0.contains("dispenser")
            || var0.contains("crafter")
            || var0.contains("furnace")
            || var0.contains("smoker")
            || var0.contains("blast_furnace")
            || var0.contains("brewing")
         : false;
   }

   private static boolean isInterestingBlockEntity(BlockEntity var0, Block var1) {
      if (var0 instanceof BaseContainerBlockEntity
         || var0 instanceof RandomizableContainerBlockEntity
         || var0 instanceof SpawnerBlockEntity
         || var0 instanceof TrialSpawnerBlockEntity) {
         return true;
      } else if (var1 != null && isDeepLeakBlock(var1)) {
         return true;
      } else if (var0 != null) {
         String var2 = String.valueOf(var0.getType()).toLowerCase();
         return typeNameLooksInteresting(var2);
      } else {
         return false;
      }
   }

   private static boolean pendingLooksInteresting(CompoundTag var0) {
      if (var0 != null && !var0.isEmpty()) {
         String var1 = var0.getStringOr("id", "");
         return !var1.isEmpty() && typeNameLooksInteresting(var1.toLowerCase());
      } else {
         return false;
      }
   }

   private static boolean typeNameLooksInteresting(String var0) {
      return var0 != null && !var0.isEmpty()
         ? var0.contains("hopper")
            || var0.contains("chest")
            || var0.contains("barrel")
            || var0.contains("shulker")
            || var0.contains("spawner")
            || var0.contains("dropper")
            || var0.contains("dispenser")
            || var0.contains("furnace")
            || var0.contains("smoker")
            || var0.contains("blast_furnace")
            || var0.contains("brewing")
            || var0.contains("crafter")
            || var0.contains("lectern")
            || var0.contains("jukebox")
            || var0.contains("trapped")
            || var0.contains("chiseled_bookshelf")
            || var0.contains("decorated_pot")
            || var0.contains("copper_chest")
         : false;
   }

   private static boolean isDeepLeakBlock(Block var0) {
      return isRedstoneRelated(var0) || isStorageBlock(var0) || isSpawner(var0);
   }

   private static boolean isObfuscationFiller(Block var0) {
      return var0 == Blocks.STONE
         || var0 == Blocks.DEEPSLATE
         || var0 == Blocks.NETHERRACK
         || var0 == Blocks.BLACKSTONE
         || var0 == Blocks.END_STONE
         || var0 == Blocks.GRANITE
         || var0 == Blocks.DIORITE
         || var0 == Blocks.ANDESITE
         || var0 == Blocks.TUFF
         || var0 == Blocks.DIRT
         || var0 == Blocks.GRAVEL
         || var0 == Blocks.COBBLESTONE
         || var0 == Blocks.SMOOTH_BASALT
         || var0 == Blocks.CALCITE
         || var0 == Blocks.AIR
         || var0 == Blocks.CAVE_AIR
         || var0 == Blocks.VOID_AIR;
   }

   private void collectBlockEntityMarkers(
      ClientLevel var1,
      LevelChunk var2,
      x var3,
      boolean var4,
      boolean var5,
      boolean var6,
      List<com.wimpyclient.e.b> var7,
      List<com.wimpyclient.e.h> var8,
      List<BlockPos> var9
   ) {
      Map var10 = var2.getBlockEntities();
      Map var11 = ((com.wimpyclient.mixin.e)var2).wimpyclient$pendingBlockEntities();
      LongOpenHashSet var12 = new LongOpenHashSet();
      if (var11 != null) {
         for (Entry var14 : ((Map<BlockPos, CompoundTag>)var11).entrySet()) {
            this.collectOneBlockEntityMarker(
               var1, var2, var3, var4, var5, var6, var10, (BlockPos)var14.getKey(), (CompoundTag)var14.getValue(), var12, var7, var8, var9
            );
         }
      }

      for (Entry var16 : ((Map<BlockPos, BlockEntity>)var10).entrySet()) {
         this.collectOneBlockEntityMarker(var1, var2, var3, var4, var5, var6, var10, (BlockPos)var16.getKey(), null, var12, var7, var8, var9);
      }
   }

   private void collectOneBlockEntityMarker(
      ClientLevel var1,
      LevelChunk var2,
      x var3,
      boolean var4,
      boolean var5,
      boolean var6,
      Map<BlockPos, BlockEntity> var7,
      BlockPos var8,
      CompoundTag var9,
      LongOpenHashSet var10,
      List<com.wimpyclient.e.b> var11,
      List<com.wimpyclient.e.h> var12,
      List<BlockPos> var13
   ) {
      long var14 = var8.asLong();
      if (var10.add(var14)) {
         BlockEntity var16 = (BlockEntity)var7.get(var8);
         CompoundTag var17 = var9;
         if (var9 == null && var6) {
            var17 = var2.getBlockEntityNbt(var8);
         }

         Block var18 = var2.getBlockState(var8).getBlock();
         Block var19 = var16 != null ? var16.getBlockState().getBlock() : null;
         Block var20 = var17 != null ? blockFromPendingId(var17) : null;
         Block var21 = var19 != null && isDeepLeakBlock(var19) ? var19 : (var20 != null ? var20 : (var19 != null ? var19 : var18));
         BlockPos var22 = var8.immutable();
         if (var4) {
            aa var23 = var3.storageSettingsFor(var21);
            if (var23 == null && var17 != null) {
               var23 = var3.storageSettingsForTypeId(var17.getStringOr("id", ""));
            }

            if (var23 == null && var16 != null) {
               var23 = var3.storageSettingsForTypeId(String.valueOf(var16.getType()));
            }

            if (var23 != null && var23.enabled) {
               var11.add(new com.wimpyclient.e.b(var22, var23.red, var23.green, var23.blue));
            }
         }

         if (var5 && isMonsterSpawner(var21, var16, var17)) {
            String var24 = resolveSpawnerMobLabel(var1, var22, var16, var17);
            var12.add(new com.wimpyclient.e.h(var22, var24));
            this.maybeNotifySpawner(var3, var22, var24);
         }

         if (var6) {
            if (var16 != null && hasInterestingNbt(var1, var16)) {
               var13.add(var22);
            } else if (var17 != null && hasMeaningfulNbt(var17)) {
               var13.add(var22);
            }
         }
      }
   }

   private static Block blockFromPendingId(CompoundTag var0) {
      String var1 = var0.getStringOr("id", "").toLowerCase();
      if (var1.isEmpty()) {
         return null;
      } else if (var1.contains("trapped_chest")) {
         return Blocks.TRAPPED_CHEST;
      } else if (var1.contains("copper_chest")) {
         return firstMatchingBlock("copper_chest", Blocks.CHEST);
      } else if (var1.contains("ender_chest")) {
         return Blocks.ENDER_CHEST;
      } else if (var1.contains("chest")) {
         return Blocks.CHEST;
      } else if (var1.contains("barrel")) {
         return Blocks.BARREL;
      } else if (var1.contains("shulker")) {
         return Blocks.SHULKER_BOX;
      } else if (var1.contains("hopper")) {
         return Blocks.HOPPER;
      } else if (var1.contains("dropper")) {
         return Blocks.DROPPER;
      } else if (var1.contains("dispenser")) {
         return Blocks.DISPENSER;
      } else if (var1.contains("crafter")) {
         return Blocks.CRAFTER;
      } else if (var1.contains("blast_furnace")) {
         return Blocks.BLAST_FURNACE;
      } else if (var1.contains("smoker")) {
         return Blocks.SMOKER;
      } else if (var1.contains("furnace")) {
         return Blocks.FURNACE;
      } else if (var1.contains("brewing")) {
         return Blocks.BREWING_STAND;
      } else if (var1.contains("spawner") && !var1.contains("trial")) {
         return Blocks.SPAWNER;
      } else if (var1.contains("trial_spawner")) {
         return Blocks.TRIAL_SPAWNER;
      } else if (var1.contains("lectern")) {
         return Blocks.LECTERN;
      } else if (var1.contains("jukebox")) {
         return Blocks.JUKEBOX;
      } else if (var1.contains("chiseled_bookshelf")) {
         return Blocks.CHISELED_BOOKSHELF;
      } else {
         return var1.contains("decorated_pot") ? Blocks.DECORATED_POT : null;
      }
   }

   private static boolean hasInterestingNbt(ClientLevel var0, BlockEntity var1) {
      if (!(var1 instanceof SpawnerBlockEntity) && !(var1 instanceof TrialSpawnerBlockEntity)) {
         Block var2 = var1.getBlockState().getBlock();
         if (!isStorageBlock(var2) && !(var1 instanceof BaseContainerBlockEntity)) {
            return false;
         } else {
            if (var1 instanceof BaseContainerBlockEntity var3) {
               if (var3.getCustomName() != null || var3.isLocked()) {
                  return true;
               }

               if (var1 instanceof RandomizableContainerBlockEntity var4 && var4.getLootTable() != null) {
                  return true;
               }

               try {
                  if (!var3.isEmpty()) {
                     return true;
                  }
               } catch (Exception var5) {
               }
            }

            return false;
         }
      } else {
         return true;
      }
   }

   private static boolean hasMeaningfulNbt(CompoundTag var0) {
      if (var0 != null && !var0.isEmpty()) {
         for (String var2 : List.of(
            "SpawnData",
            "spawn_data",
            "SpawnPotentials",
            "spawn_potentials",
            "CustomName",
            "custom_name",
            "Lock",
            "lock",
            "LootTable",
            "loot_table",
            "LootTableSeed",
            "loot_table_seed",
            "Items",
            "items",
            "item",
            "RecordItem",
            "record_item",
            "Book",
            "book",
            "sherds",
            "Lootable",
            "components"
         )) {
            if (var0.contains(var2)) {
               if (!var2.equals("Items") && !var2.equals("items")) {
                  return true;
               }

               Optional var3 = var0.getList(var2);
               if (var3.isPresent() && !((ListTag)var3.get()).isEmpty()) {
                  return true;
               }
            }
         }

         return var0.size() > 0 && !isOnlyEmptyDefaults(var0);
      } else {
         return false;
      }
   }

   private static boolean isOnlyEmptyDefaults(CompoundTag var0) {
      if (var0.size() == 0) {
         return true;
      } else if (var0.size() == 1 && (var0.contains("Items") || var0.contains("items"))) {
         Optional var1 = var0.contains("Items") ? var0.getList("Items") : var0.getList("items");
         return var1.isEmpty() || ((ListTag)var1.get()).isEmpty();
      } else {
         return false;
      }
   }

   private void maybeNotifySpawner(x var1, BlockPos var2, String var3) {
      if (var1.spawnerNotify) {
         long var4 = var2.asLong();
         if (this.notifiedSpawners.add(var4)) {
            Minecraft var6 = Minecraft.getInstance();
            LocalPlayer var7 = var6.player;
            if (var7 != null) {
               String var8 = var3 != null && !var3.isBlank() && !"Unknown".equals(var3) ? var3 + " Spawner" : "Spawner";
               MutableComponent var9 = Component.literal(var8 + " found @ " + var2.getX() + ", " + var2.getY() + ", " + var2.getZ());
               var7.displayClientMessage(var9, false);
               var7.displayClientMessage(Component.literal(var8 + " found"), true);
            }
         }
      }
   }

   private static String resolveSpawnerMobLabel(ClientLevel var0, BlockPos var1, BlockEntity var2, CompoundTag var3) {
      String var4 = spawnerEntityIdFromNbt(var3);
      if (var4 != null && !var4.isBlank()) {
         Identifier var5 = Identifier.tryParse(var4);
         if (var5 != null) {
            EntityType var6 = (EntityType)BuiltInRegistries.ENTITY_TYPE.getValue(var5);
            if (var6 != null) {
               return var6.getDescription().getString();
            }
         }

         return prettyEntityPath(var4);
      } else {
         return "Spawner";
      }
   }

   private static String spawnerEntityIdFromNbt(CompoundTag var0) {
      if (var0 == null) {
         return null;
      } else {
         String var1 = entityIdFromSpawnData(var0.getCompoundOrEmpty("SpawnData"));
         if (var1 == null) {
            var1 = entityIdFromSpawnData(var0.getCompoundOrEmpty("spawn_data"));
         }

         if (var1 != null) {
            return var1;
         } else {
            ListTag var2 = (ListTag)var0.getList("SpawnPotentials").orElse(null);
            if (var2 == null || var2.isEmpty()) {
               var2 = (ListTag)var0.getList("spawn_potentials").orElse(null);
            }

            if (var2 != null && !var2.isEmpty()) {
               CompoundTag var3 = var2.getCompoundOrEmpty(0);
               String var4 = entityIdFromSpawnData(var3.getCompoundOrEmpty("data"));
               if (var4 == null) {
                  var4 = entityIdFromSpawnData(var3.getCompoundOrEmpty("Entity"));
               }

               if (var4 == null) {
                  var4 = entityIdFromSpawnData(var3);
               }

               if (var4 != null) {
                  return var4;
               }
            }

            return null;
         }
      }
   }

   private static String entityIdFromSpawnData(CompoundTag var0) {
      if (var0 != null && !var0.isEmpty()) {
         CompoundTag var1 = var0.getCompoundOrEmpty("entity");
         if (var1.isEmpty()) {
            var1 = var0.getCompoundOrEmpty("Entity");
         }

         String var2 = var1.getStringOr("id", "");
         if (!var2.isBlank()) {
            return var2;
         } else {
            var2 = var0.getStringOr("id", "");
            return var2.isBlank() ? null : var2;
         }
      } else {
         return null;
      }
   }

   private static String prettyEntityPath(String var0) {
      String var1 = var0;
      int var2 = var0.indexOf(58);
      if (var2 >= 0 && var2 + 1 < var0.length()) {
         var1 = var0.substring(var2 + 1);
      }

      var1 = var1.replace('_', ' ').trim();
      if (var1.isEmpty()) {
         return "Unknown";
      } else {
         StringBuilder var3 = new StringBuilder(var1.length());
         boolean var4 = true;

         for (int var5 = 0; var5 < var1.length(); var5++) {
            char var6 = var1.charAt(var5);
            if (var6 == ' ') {
               var3.append(var6);
               var4 = true;
            } else {
               var3.append(var4 ? Character.toUpperCase(var6) : var6);
               var4 = false;
            }
         }

         return var3.toString();
      }
   }

   private static boolean isAmethystCrystalBlock(Block var0) {
      return var0 == Blocks.AMETHYST_CLUSTER;
   }

   private static void countTrialAndAncient(com.wimpyclient.p.e$b var0, g$a var1) {
      int[][] var2 = var0.sections();

      for (int var3 = 0; var3 < var2.length; var3++) {
         if (var2[var3] != null) {
            int var4 = var0.minY() + var3 * 16;

            for (int var5 = 0; var5 < 16; var5++) {
               int var6 = var4 + var5;

               for (int var7 = 0; var7 < 16; var7++) {
                  for (int var8 = 0; var8 < 16; var8++) {
                     BlockState var9 = var0.get(var8, var6, var7);
                     if (!var9.isAir()) {
                        Block var10 = var9.getBlock();
                        if (isTrialChamberBlock(var9)) {
                           var1.trialChamber++;
                           if (var10 == Blocks.TRIAL_SPAWNER || var10 == Blocks.VAULT) {
                              var1.trialChamber += 80;
                           }
                        }

                        if (var10 == Blocks.REINFORCED_DEEPSLATE) {
                           var1.reinforcedDeepslate++;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static a$a collectAmethystFromPacked(com.wimpyclient.p.e$b var0, g$a var1, List<com.wimpyclient.e.d> var2, LongOpenHashSet var3) {
      a$a var4 = new a$a();
      int var5 = var0.originX();
      int var6 = var0.originZ();
      int var7 = var0.minY();
      int var8 = Math.min(var0.maxY(), 128);
      int[][] var9 = var0.sections();

      for (int var10 = 0; var10 < var9.length; var10++) {
         if (var9[var10] != null) {
            int var11 = var0.minY() + var10 * 16;
            if (var11 <= var8 && var11 + 15 >= var7) {
               for (int var12 = 0; var12 < 16; var12++) {
                  int var13 = var11 + var12;
                  if (var13 >= var7 && var13 <= var8) {
                     for (int var14 = 0; var14 < 16; var14++) {
                        int var15 = var6 + var14;

                        for (int var16 = 0; var16 < 16; var16++) {
                           int var17 = var5 + var16;
                           BlockState var18 = var0.get(var16, var13, var14);
                           Block var19 = var18.getBlock();
                           if (!var18.isAir()) {
                              boolean var20 = isGeodeShell(var19);
                              boolean var21 = var19 == Blocks.AMETHYST_CLUSTER;
                              boolean var22 = var19 == Blocks.LARGE_AMETHYST_BUD;
                              boolean var23 = var19 == Blocks.BUDDING_AMETHYST;
                              if (var20 || var21 || var22 || var23) {
                                 BlockPos var24 = new BlockPos(var17, var13, var15);
                                 if (var20) {
                                    if (var19 == Blocks.CALCITE) {
                                       var1.calcite++;
                                    } else if (var19 == Blocks.SMOOTH_BASALT) {
                                       var1.smoothBasalt++;
                                    } else {
                                       var1.amethystBlock++;
                                    }

                                    var4.noteGeodeShell(var17, var13, var15, var16, var14);
                                 } else if (var21) {
                                    var1.fullClusters++;
                                    offerCrystal(var2, var3, var24, d$a.CLUSTER);
                                    var4.noteInterior(var17, var13, var15);
                                    if (var13 > var4.crystalIconY) {
                                       var4.crystalIconY = var13;
                                       var4.crystalIcon = var24;
                                    }
                                 } else {
                                    if (!var22) {
                                       var1.budding++;
                                       var4.noteInterior(var17, var13, var15);
                                       continue;
                                    }

                                    var1.largeBuds++;
                                    offerCrystal(var2, var3, var24, d$a.LARGE_BUD);
                                    var4.noteInterior(var17, var13, var15);
                                    if (var13 > var4.crystalIconY) {
                                       var4.crystalIconY = var13;
                                       var4.crystalIcon = var24;
                                    }
                                 }

                                 if ((var20 || var21 || var22) && var13 > var4.iconY) {
                                    var4.iconY = var13;
                                    var4.icon = var24;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var4;
   }

   private static a$f findGeodeBlob(com.wimpyclient.p.e$b var0) {
      LongOpenHashSet var1 = collectWorldShells(var0);
      if (var1.isEmpty()) {
         return null;
      } else {
         int var2 = var0.originX();
         int var3 = var0.originZ();
         int var4 = var2;
         int var5 = var2 + 15;
         int var6 = var3;
         int var7 = var3 + 15;
         LongOpenHashSet var8 = new LongOpenHashSet();
         a$f var9 = null;
         LongIterator var10 = var1.iterator();

         while (var10.hasNext()) {
            long var11 = (Long)var10.next();
            if (var8.add(var11)) {
               a$f var13 = floodShell(var1, var8, var11, var4, var5, var6, var7);
               if (var13.belongsToChunk() && (var9 == null || var13.betterThan(var9))) {
                  var9 = var13;
               }
            }
         }

         return var9 != null && var9.belongsToChunk() ? var9 : null;
      }
   }

   private static BlockPos nearestNearbyCenter(com.wimpyclient.p.e$b var0, List<BlockPos> var1) {
      if (var1 != null && !var1.isEmpty()) {
         int var2 = var0.originX() + 8;
         int var3 = var0.originZ() + 8;
         BlockPos var4 = null;
         int var5 = Integer.MAX_VALUE;

         for (BlockPos var7 : var1) {
            int var8 = Math.max(Math.abs(var7.getX() - var2), Math.abs(var7.getZ() - var3));
            if (var8 <= 24 && var8 < var5) {
               var5 = var8;
               var4 = var7;
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   private static LongOpenHashSet collectWorldShells(com.wimpyclient.p.e$b var0) {
      LongOpenHashSet var1 = new LongOpenHashSet();

      for (int var2 = -1; var2 <= 1; var2++) {
         for (int var3 = -1; var3 <= 1; var3++) {
            com.wimpyclient.p.e$b var4 = packedAt(var0, var0.chunkX() + var2, var0.chunkZ() + var3);
            if (var4 != null) {
               int var5 = var4.originX();
               int var6 = var4.originZ();
               int var7 = Math.max(var4.minY(), -64);
               int var8 = Math.min(var4.maxY(), 32);

               for (int var9 = var7; var9 <= var8; var9++) {
                  if (var4.hasSection(var9)) {
                     for (int var10 = 0; var10 < 16; var10++) {
                        for (int var11 = 0; var11 < 16; var11++) {
                           if (isGeodeShell(var4.block(var11, var9, var10))) {
                              var1.add(BlockPos.asLong(var5 + var11, var9, var6 + var10));
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var1;
   }

   private static a$f floodShell(LongOpenHashSet var0, LongOpenHashSet var1, long var2, int var4, int var5, int var6, int var7) {
      a$f var8 = new a$f(var4, var5, var6, var7);
      ArrayDeque var9 = new ArrayDeque();
      var9.add(var2);
      var8.add(var2);

      while (!var9.isEmpty()) {
         long var10 = (Long)var9.removeFirst();
         int var12 = BlockPos.getX(var10);
         int var13 = BlockPos.getY(var10);
         int var14 = BlockPos.getZ(var10);

         for (int[] var18 : SHELL_NEIGHBORS) {
            long var19 = BlockPos.asLong(var12 + var18[0], var13 + var18[1], var14 + var18[2]);
            if (var0.contains(var19) && var1.add(var19)) {
               var9.add(var19);
               var8.add(var19);
            }
         }
      }

      return var8;
   }

   private static void scanAddonChunk(
      com.wimpyclient.p.e$b var0, a$d var1, g$a var2, List<com.wimpyclient.e.d> var3, LongOpenHashSet var4, a$a var5, BlockPos var6
   ) {
      if (var1 != null && !var1.empty() && var6 != null) {
         if (geodeStillHasAmethyst(var0)) {
            int var7 = var0.originX();
            int var8 = var0.originZ();
            int var9 = Math.max(var0.minY(), -64);
            int var10 = Math.min(var0.maxY(), 32);
            LongOpenHashSet var11 = new LongOpenHashSet();

            for (int var12 = var9; var12 <= var10; var12++) {
               if (var0.hasSection(var12) && var1.hasLayer(var12)) {
                  for (int var13 = 0; var13 < 16; var13++) {
                     int var14 = var8 + var13;

                     for (int var15 = 0; var15 < 16; var15++) {
                        int var16 = var7 + var15;
                        if (nearGeodeCenter(var6, var16, var12, var14)
                           && var0.block(var15, var12, var13) == Blocks.AIR
                           && var1.get(var15, var12, var13) == 0
                           && hasLightAirNeighbour(var0, var16, var12, var14)
                           && adjacentToClusterHost(var0, var16, var12, var14)) {
                           var11.add(BlockPos.asLong(var16, var12, var14));
                        }
                     }
                  }
               }
            }

            int var17 = countLightMarks(var3);

            for (LongIterator var18 = keepSmallAirIslands(var11).iterator(); var18.hasNext(); var17++) {
               long var19 = (Long)var18.next();
               if (var17 >= 32) {
                  break;
               }

               noteHiddenCluster(BlockPos.of(var19), var2, var3, var4, var5);
            }
         }
      }
   }

   private static LongOpenHashSet keepSmallAirIslands(LongOpenHashSet var0) {
      LongOpenHashSet var1 = new LongOpenHashSet();
      LongOpenHashSet var2 = new LongOpenHashSet();
      ArrayDeque var3 = new ArrayDeque();
      ArrayList<Long> var4 = new ArrayList<>();
      LongIterator var5 = var0.iterator();

      while (var5.hasNext()) {
         long var6 = (Long)var5.next();
         if (var2.add(var6)) {
            var4.clear();
            var3.clear();
            var3.add(var6);
            var4.add(var6);

            while (!var3.isEmpty()) {
               long var8 = (Long)var3.removeFirst();
               int var10 = BlockPos.getX(var8);
               int var11 = BlockPos.getY(var8);
               int var12 = BlockPos.getZ(var8);

               for (int[] var16 : NEIGHBORS) {
                  long var17 = BlockPos.asLong(var10 + var16[0], var11 + var16[1], var12 + var16[2]);
                  if (var0.contains(var17) && var2.add(var17)) {
                     var3.add(var17);
                     var4.add(var17);
                  }
               }
            }

            if (var4.size() <= 1) {
               for (long var9 : var4) {
                  var1.add(var9);
               }
            }
         }
      }

      return var1;
   }

   private static boolean hasLightAirNeighbour(com.wimpyclient.p.e$b var0, int var1, int var2, int var3) {
      int var4 = 0;

      for (int[] var8 : NEIGHBORS) {
         Block var9 = worldBlock(var0, var1 + var8[0], var2 + var8[1], var3 + var8[2]);
         if (var9 != null && (var9 == Blocks.AIR || var9 == Blocks.CAVE_AIR)) {
            if (++var4 >= 1) {
               return true;
            }
         }
      }

      return false;
   }

   private static boolean isClusterHost(Block var0) {
      return var0 == Blocks.BUDDING_AMETHYST || var0 == Blocks.AMETHYST_BLOCK;
   }

   private static boolean adjacentToClusterHost(com.wimpyclient.p.e$b var0, int var1, int var2, int var3) {
      for (int[] var7 : NEIGHBORS) {
         Block var8 = worldBlock(var0, var1 + var7[0], var2 + var7[1], var3 + var7[2]);
         if (var8 != null && isClusterHost(var8)) {
            return true;
         }
      }

      return false;
   }

   private static boolean geodeStillHasAmethyst(com.wimpyclient.p.e$b var0) {
      for (int var1 = -1; var1 <= 1; var1++) {
         for (int var2 = -1; var2 <= 1; var2++) {
            com.wimpyclient.p.e$b var3 = packedAt(var0, var0.chunkX() + var1, var0.chunkZ() + var2);
            if (var3 != null) {
               int var4 = Math.max(var3.minY(), -64);
               int var5 = Math.min(var3.maxY(), 32);

               for (int var6 = var4; var6 <= var5; var6++) {
                  if (var3.hasSection(var6)) {
                     for (int var7 = 0; var7 < 16; var7++) {
                        for (int var8 = 0; var8 < 16; var8++) {
                           if (isClusterHost(var3.block(var8, var6, var7))) {
                              return true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   private static com.wimpyclient.p.e$b packedAt(com.wimpyclient.p.e$b var0, int var1, int var2) {
      return var0.chunkX() == var1 && var0.chunkZ() == var2 ? var0 : com.wimpyclient.p.e.INSTANCE.getPacked(var1, var2);
   }

   private static Block worldBlock(com.wimpyclient.p.e$b var0, int var1, int var2, int var3) {
      com.wimpyclient.p.e$b var4 = packedAt(var0, var1 >> 4, var3 >> 4);
      return var4 != null && var4.hasSection(var2) ? var4.block(var1 & 15, var2, var3 & 15) : null;
   }

   private static boolean nearGeodeCenter(BlockPos var0, int var1, int var2, int var3) {
      return Math.max(Math.abs(var1 - var0.getX()), Math.max(Math.abs(var2 - var0.getY()), Math.abs(var3 - var0.getZ()))) <= 16;
   }

   private static int countLightMarks(List<com.wimpyclient.e.d> var0) {
      int var1 = 0;

      for (com.wimpyclient.e.d var3 : var0) {
         if (var3.kind() == d$a.LIGHT) {
            var1++;
         }
      }

      return var1;
   }

   private static BlockPos geodeCenter(LongOpenHashSet var0) {
      long var1 = 0L;
      long var3 = 0L;
      long var5 = 0L;
      int var7 = 0;

      for (LongIterator var8 = var0.iterator(); var8.hasNext(); var7++) {
         long var9 = (Long)var8.next();
         BlockPos var11 = BlockPos.of(var9);
         var1 += var11.getX();
         var3 += var11.getY();
         var5 += var11.getZ();
      }

      return var7 == 0 ? BlockPos.ZERO : new BlockPos((int)(var1 / var7), (int)(var3 / var7), (int)(var5 / var7));
   }

   private static void noteHiddenCluster(BlockPos var0, g$a var1, List<com.wimpyclient.e.d> var2, LongOpenHashSet var3, a$a var4) {
      if (var3.add(var0.asLong())) {
         var2.add(new com.wimpyclient.e.d(var0, d$a.LIGHT));
         if (var1 != null) {
            var1.hiddenFullClusters++;
         }

         var4.noteLeak(var0.getX(), var0.getZ());
         if (var0.getY() > var4.crystalIconY) {
            var4.crystalIconY = var0.getY();
            var4.crystalIcon = var0;
         }

         if (var4.icon == null && var0.getY() > var4.iconY) {
            var4.iconY = var0.getY();
            var4.icon = var0;
         }
      }
   }

   private static boolean hasConfirmedCrystal(List<com.wimpyclient.e.d> var0) {
      for (com.wimpyclient.e.d var2 : var0) {
         if (var2.kind().countsAsCluster()) {
            return true;
         }
      }

      return false;
   }

   private static boolean hasLightCrystal(List<com.wimpyclient.e.d> var0) {
      for (com.wimpyclient.e.d var2 : var0) {
         if (var2.kind() == d$a.LIGHT) {
            return true;
         }
      }

      return false;
   }

   public static long packLocalCell(int var0, int var1, int var2) {
      return (long)(var1 + 512) << 8 | (var2 & 15) << 4 | var0 & 15;
   }

   private static int unpackLocalX(long var0) {
      return (int)(var0 & 15L);
   }

   private static int unpackLocalZ(long var0) {
      return (int)(var0 >> 4 & 15L);
   }

   private static int unpackLocalY(long var0) {
      return (int)(var0 >> 8) - 512;
   }

   private List<com.wimpyclient.e.d> sampleLiveCrystals(ClientLevel var1, LocalPlayer var2) {
      Long2ObjectOpenHashMap var3 = new Long2ObjectOpenHashMap();
      Vec3 var4 = var2.position();
      if (Minecraft.getInstance().gameRenderer != null) {
         var4 = Minecraft.getInstance().gameRenderer.getMainCamera().position();
      }

      BlockPos var5 = BlockPos.containing(var4.x, var4.y, var4.z);
      ChunkPos var6 = new ChunkPos(var5.getX() >> 4, var5.getZ() >> 4);
      int var7 = var1.getMinY();
      int var8 = Math.min(var1.getMaxY(), 128);
      MutableBlockPos var9 = new MutableBlockPos();

      for (int var10 = -1; var10 <= 1; var10++) {
         for (int var11 = -1; var11 <= 1; var11++) {
            int var12 = var6.x + var10;
            int var13 = var6.z + var11;
            if (var1.hasChunk(var12, var13)) {
               int var14 = var12 << 4;
               int var15 = var13 << 4;

               for (int var16 = var7; var16 <= var8; var16++) {
                  for (int var17 = 0; var17 < 16; var17++) {
                     int var18 = var15 + var17;

                     for (int var19 = 0; var19 < 16; var19++) {
                        int var20 = var14 + var19;
                        BlockState var21 = var1.getBlockState(var9.set(var20, var16, var18));
                        Block var22 = var21.getBlock();
                        d$a var23 = com.wimpyclient.e.d.ofVisible(var22);
                        if (var23 != null) {
                           BlockPos var24 = new BlockPos(var20, var16, var18);
                           var3.put(
                              var24.asLong(), com.wimpyclient.e.d.prefer((com.wimpyclient.e.d)var3.get(var24.asLong()), new com.wimpyclient.e.d(var24, var23))
                           );
                        }
                     }
                  }
               }
            }
         }
      }

      return (List<com.wimpyclient.e.d>)(List)(var3.isEmpty() ? List.of() : new ArrayList<>(var3.values()));
   }

   private static boolean wantsAmethystBypass() {
      return x.INSTANCE.isPrimeSusFinderEnabled();
   }

   public void ingestBlockLightPacket(int var1, int var2, ClientboundLightUpdatePacketData var3, ClientLevel var4) {
      this.ingestBlockLightPacket(var1, var2, var3, var4, false);
   }

   public void ingestBlockLightPacket(int var1, int var2, ClientboundLightUpdatePacketData var3, ClientLevel var4, boolean var5) {
      if (var3 != null && var4 != null) {
         if (wantsAmethystBypass()) {
            BitSet var6 = var3.getBlockYMask();
            List var7 = var3.getBlockUpdates();
            if (var6 != null && var7 != null && !var6.isEmpty() && !var7.isEmpty()) {
               if (this.nearbyChunkKeys.isEmpty() || this.nearbyChunkKeys.contains(ChunkPos.asLong(var1, var2))) {
                  LevelLightEngine var8 = var4.getLightEngine();
                  int var9 = var8.getMinLightSection();
                  int var10 = var8.getLightSectionCount();
                  DataLayer[] var11 = new DataLayer[var10];
                  int var12 = 0;
                  boolean var13 = false;

                  for (int var14 = 0; var14 < var10; var14++) {
                     if (var6.get(var14)) {
                        if (var12 >= var7.size()) {
                           break;
                        }

                        DataLayer var15 = layerFromBytes((byte[])var7.get(var12++));
                        if (var15 != null) {
                           var11[var14] = var15;
                           var13 = true;
                        }
                     }
                  }

                  if (var13) {
                     long var20 = ChunkPos.asLong(var1, var2);
                     synchronized (this.packetLightLock) {
                        a$e var17 = (a$e)this.packetLightGridByChunk.get(var20);
                        if (var17 == null) {
                           this.packetLightGridByChunk.put(var20, new a$e(var11, var9));
                        } else {
                           var17.merge(var11, var9);
                        }

                        this.bumpPacketLightRevision(var20);
                     }

                     if (wantsAmethystBypass()) {
                        this.invalidateSusScan(var20);
                     }
                  }
               }
            }
         }
      }
   }

   public void snapshotAppliedBlockLight(int var1, int var2, ClientLevel var3) {
      if (var3 != null && wantsAmethystBypass()) {
         long var4 = ChunkPos.asLong(var1, var2);
         synchronized (this.packetLightLock) {
            this.bumpPacketLightRevision(var4);
         }

         this.invalidateSusScan(var4);
      }
   }

   private void bumpPacketLightRevision(long var1) {
      this.packetLightRevisionByChunk.put(var1, this.packetLightRevisionByChunk.get(var1) + 1);
   }

   private void mergeEngineBlockLight(ClientLevel var1, long var2, int var4, int var5) {
      LevelLightEngine var6 = var1.getLightEngine();
      LayerLightEventListener var7 = var6.getLayerListener(LightLayer.BLOCK);
      int var8 = var6.getMinLightSection();
      int var9 = var6.getLightSectionCount();
      DataLayer[] var10 = new DataLayer[var9];
      boolean var11 = false;

      for (int var12 = 0; var12 < var9; var12++) {
         DataLayer var13 = var7.getDataLayerData(SectionPos.of(var4, var8 + var12, var5));
         if (var13 != null && !var13.isEmpty()) {
            var10[var12] = var13.copy();
            var11 = true;
         }
      }

      if (var11) {
         synchronized (this.packetLightLock) {
            a$e var17 = (a$e)this.packetLightGridByChunk.get(var2);
            if (var17 == null) {
               this.packetLightGridByChunk.put(var2, new a$e(var10, var8));
            } else {
               var17.merge(var10, var8);
            }
         }
      }
   }

   private static DataLayer layerFromBytes(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         if (var0.length == 2048) {
            return new DataLayer((byte[])var0.clone());
         } else {
            byte[] var1 = new byte[2048];
            System.arraycopy(var0, 0, var1, 0, Math.min(var0.length, var1.length));
            return new DataLayer(var1);
         }
      } else {
         return null;
      }
   }

   private int markAirGrowthSlots(
      ClientLevel var1, int var2, int var3, int var4, boolean var5, MutableBlockPos var6, List<com.wimpyclient.e.d> var7, LongOpenHashSet var8
   ) {
      int var9 = 0;

      for (Direction var13 : Direction.values()) {
         int var14 = var2 + var13.getStepX();
         int var15 = var3 + var13.getStepY();
         int var16 = var4 + var13.getStepZ();
         BlockState var17 = var1.getBlockState(var6.set(var14, var15, var16));
         if (var17.isAir() && (var5 || var15 <= var3)) {
            BlockPos var18 = new BlockPos(var14, var15, var16);
            if (var8.add(var18.asLong())) {
               var7.add(new com.wimpyclient.e.d(var18, d$a.CULLED));
               var9++;
            }
         }
      }

      return var9;
   }

   private static int countGeodeWallNeighbors(ClientLevel var0, int var1, int var2, int var3, MutableBlockPos var4) {
      int var5 = 0;

      for (Direction var9 : Direction.values()) {
         Block var10 = var0.getBlockState(var4.set(var1 + var9.getStepX(), var2 + var9.getStepY(), var3 + var9.getStepZ())).getBlock();
         if (var10 == Blocks.AMETHYST_BLOCK
            || var10 == Blocks.BUDDING_AMETHYST
            || var10 == Blocks.CALCITE
            || var10 == Blocks.SMOOTH_BASALT
            || isAmethystGrowth(var10)) {
            var5++;
         }
      }

      return var5;
   }

   private int probeHiddenAirCrystals(
      ClientLevel var1, int var2, int var3, int var4, MutableBlockPos var5, Long2ObjectOpenHashMap<com.wimpyclient.e.d> var6, BlockPos[] var7, int[] var8
   ) {
      int var9 = 0;

      for (Direction var13 : Direction.values()) {
         int var14 = var2 + var13.getStepX();
         int var15 = var3 + var13.getStepY();
         int var16 = var4 + var13.getStepZ();
         var5.set(var14, var15, var16);
         BlockState var17 = var1.getBlockState(var5);
         if (var17.isAir() && var17.getLightEmission() <= 0) {
            int var18 = this.packetBlockLight(var14, var15, var16);
            if (var18 == 5 && !this.packetLightHasBrighterNeighbor(var14, var15, var16, var18)) {
               BlockPos var19 = new BlockPos(var14, var15, var16);
               if (this.noteCulledCrystal(var19)) {
                  var9++;
               }

               rememberLeakIcon(var19, var7, var8);
               if (var6 != null) {
                  var6.put(
                     var19.asLong(), com.wimpyclient.e.d.prefer((com.wimpyclient.e.d)var6.get(var19.asLong()), new com.wimpyclient.e.d(var19, d$a.CULLED))
                  );
               }
            }
         }
      }

      return var9;
   }

   private int packetBlockLight(int var1, int var2, int var3) {
      a$e var4;
      synchronized (this.packetLightLock) {
         var4 = (a$e)this.packetLightGridByChunk.get(ChunkPos.asLong(var1 >> 4, var3 >> 4));
      }

      return var4 == null ? -1 : var4.get(var1, var2, var3);
   }

   private boolean packetLightHasBrighterNeighbor(int var1, int var2, int var3, int var4) {
      for (Direction var8 : Direction.values()) {
         int var9 = this.packetBlockLight(var1 + var8.getStepX(), var2 + var8.getStepY(), var3 + var8.getStepZ());
         if (var9 > var4) {
            return true;
         }
      }

      return false;
   }

   private void noteAmethystSoundLeak(double var1, double var3, double var5, SoundEvent var7) {
      if (var7 != null && wantsAmethystBypass()) {
         String var8 = var7.location().getPath();
         if (var8.contains("amethyst_cluster")) {
            if (!this.isSelfNear(var1, var3, var5, 144.0)) {
               this.noteLeakedCrystal(BlockPos.containing(var1, var3, var5), true);
            }
         }
      }
   }

   private void noteAmethystDestroyLeak(int var1, BlockPos var2, int var3) {
      if (var1 == 2001 && wantsAmethystBypass()) {
         if (!this.isSelfNear(var2.getX() + 0.5, var2.getY() + 0.5, var2.getZ() + 0.5, 144.0)) {
            BlockState var4 = Block.stateById(var3);
            if (var4 != null) {
               if (var4.getBlock() == Blocks.AMETHYST_CLUSTER) {
                  this.noteLeakedCrystal(var2.immutable(), true);
               }
            }
         }
      }
   }

   private void noteAmethystBlockUpdateLeak(BlockPos var1, BlockState var2, BlockState var3) {
      if (wantsAmethystBypass()) {
         Block var4 = var3.getBlock();
         if (var4 == Blocks.AMETHYST_CLUSTER) {
            Block var5 = var2.getBlock();
            if (var5 != Blocks.AMETHYST_CLUSTER) {
               this.noteLeakedCrystal(var1.immutable(), true);
            }
         }
      }
   }

   private boolean isSelfNear(double var1, double var3, double var5, double var7) {
      LocalPlayer var9 = Minecraft.getInstance().player;
      return var9 != null && var9.distanceToSqr(var1, var3, var5) < var7;
   }

   private static void offerCrystal(List<com.wimpyclient.e.d> var0, LongOpenHashSet var1, BlockPos var2, d$a var3) {
      if (var1.add(var2.asLong())) {
         var0.add(new com.wimpyclient.e.d(var2.immutable(), var3));
      }
   }

   private int collectLeakedCrystals(LongOpenHashSet var1, d$a var2, List<com.wimpyclient.e.d> var3, LongOpenHashSet var4, BlockPos[] var5, int[] var6) {
      if (var1 != null && !var1.isEmpty()) {
         int var7 = 0;
         LongIterator var8 = var1.iterator();

         while (var8.hasNext()) {
            long var9 = (Long)var8.next();
            BlockPos var11 = BlockPos.of(var9);
            if (var4.add(var9)) {
               var3.add(new com.wimpyclient.e.d(var11, var2));
               var7++;
               if (var11.getY() > var6[0]) {
                  var6[0] = var11.getY();
                  var5[0] = var11;
               }
            }
         }

         return var7;
      } else {
         return 0;
      }
   }

   private boolean noteLeakedCrystal(BlockPos var1, boolean var2) {
      if (var1.getY() > 128) {
         return false;
      } else {
         long var3 = new ChunkPos(var1).toLong();
         long var5 = var1.asLong();
         Long2ObjectOpenHashMap var7 = var2 ? this.leakedPacketCrystalsByChunk : this.leakedLightCrystalsByChunk;
         LongOpenHashSet var8 = (LongOpenHashSet)var7.get(var3);
         if (var8 == null) {
            var8 = new LongOpenHashSet();
            var7.put(var3, var8);
         }

         if (var2) {
            LongOpenHashSet var9 = (LongOpenHashSet)this.leakedLightCrystalsByChunk.get(var3);
            if (var9 != null) {
               var9.remove(var5);
            }

            LongOpenHashSet var10 = (LongOpenHashSet)this.leakedCulledCrystalsByChunk.get(var3);
            if (var10 != null) {
               var10.remove(var5);
            }
         } else {
            LongOpenHashSet var11 = (LongOpenHashSet)this.leakedPacketCrystalsByChunk.get(var3);
            if (var11 != null && var11.contains(var5)) {
               return false;
            }
         }

         if (!var8.add(var5)) {
            return false;
         } else {
            this.rememberLeakChunkIcon(var3, var1);
            this.susScannedChunks.remove(var3);
            return true;
         }
      }
   }

   private boolean noteCulledCrystal(BlockPos var1) {
      if (var1.getY() > 128) {
         return false;
      } else {
         long var2 = new ChunkPos(var1).toLong();
         long var4 = var1.asLong();
         LongOpenHashSet var6 = (LongOpenHashSet)this.leakedPacketCrystalsByChunk.get(var2);
         if (var6 != null && var6.contains(var4)) {
            return false;
         } else {
            LongOpenHashSet var7 = (LongOpenHashSet)this.leakedCulledCrystalsByChunk.get(var2);
            if (var7 == null) {
               var7 = new LongOpenHashSet();
               this.leakedCulledCrystalsByChunk.put(var2, var7);
            }

            if (!var7.add(var4)) {
               return false;
            } else {
               this.rememberLeakChunkIcon(var2, var1);
               this.susScannedChunks.remove(var2);
               return true;
            }
         }
      }
   }

   private void rememberLeakChunkIcon(long var1, BlockPos var3) {
      BlockPos var4 = (BlockPos)this.leakedCrystalIconByChunk.get(var1);
      if (var4 == null || var3.getY() > var4.getY()) {
         this.leakedCrystalIconByChunk.put(var1, var3.immutable());
      }
   }

   private static void rememberLeakIcon(BlockPos var0, BlockPos[] var1, int[] var2) {
      if (var1 != null && var2 != null) {
         if (var0.getY() > var2[0]) {
            var2[0] = var0.getY();
            var1[0] = var0;
         }
      }
   }

   private static boolean isAmethystGrowth(Block var0) {
      return var0 == Blocks.AMETHYST_CLUSTER || var0 == Blocks.LARGE_AMETHYST_BUD || var0 == Blocks.MEDIUM_AMETHYST_BUD || var0 == Blocks.SMALL_AMETHYST_BUD;
   }

   private static int[][] shellNeighbors() {
      int[][] var0 = new int[26][3];
      int var1 = 0;

      for (int var2 = -1; var2 <= 1; var2++) {
         for (int var3 = -1; var3 <= 1; var3++) {
            for (int var4 = -1; var4 <= 1; var4++) {
               if (var2 != 0 || var3 != 0 || var4 != 0) {
                  var0[var1++] = new int[]{var2, var3, var4};
               }
            }
         }
      }

      return var0;
   }

   private static boolean isGrowthPlant(Block var0) {
      return var0 == Blocks.SHORT_GRASS || var0 == Blocks.TALL_GRASS || var0 == Blocks.FERN || var0 == Blocks.LARGE_FERN;
   }

   private static boolean isGrownGrass(Block var0) {
      return var0 == Blocks.TALL_GRASS || var0 == Blocks.LARGE_FERN;
   }

   private static boolean isFullHoney(BlockState var0) {
      return var0.hasProperty(BeehiveBlock.HONEY_LEVEL) && (Integer)var0.getValue(BeehiveBlock.HONEY_LEVEL) >= 5;
   }

   private static boolean hasDenseGrownGrass(LongOpenHashSet var0) {
      if (var0.size() < 8) {
         return false;
      } else {
         LongOpenHashSet var1 = new LongOpenHashSet();
         ArrayDeque var2 = new ArrayDeque();
         LongIterator var3 = var0.iterator();

         while (var3.hasNext()) {
            long var4 = (Long)var3.next();
            if (var1.add(var4)) {
               var2.add(var4);
               int var6 = 0;

               while (!var2.isEmpty()) {
                  long var7 = (Long)var2.removeFirst();
                  if (++var6 >= 8) {
                     return true;
                  }

                  int var9 = BlockPos.getX(var7);
                  int var10 = BlockPos.getY(var7);
                  int var11 = BlockPos.getZ(var7);

                  for (int[] var15 : NEIGHBORS) {
                     long var16 = BlockPos.asLong(var9 + var15[0], var10 + var15[1], var11 + var15[2]);
                     if (var0.contains(var16) && var1.add(var16)) {
                        var2.addLast(var16);
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   private static boolean isCaveVineTip(BlockState var0) {
      return var0.getBlock() == Blocks.CAVE_VINES;
   }

   private static boolean isBerriedCaveVineTip(BlockState var0) {
      return isCaveVineTip(var0) && CaveVines.hasGlowBerries(var0);
   }

   private static boolean isBamboo(Block var0) {
      return var0 == Blocks.BAMBOO || var0 == Blocks.BAMBOO_SAPLING;
   }

   private static boolean isJungleCanopy(Block var0) {
      return var0 == Blocks.JUNGLE_LEAVES
         || var0 == Blocks.JUNGLE_LOG
         || var0 == Blocks.JUNGLE_WOOD
         || var0 == Blocks.STRIPPED_JUNGLE_LOG
         || var0 == Blocks.STRIPPED_JUNGLE_WOOD;
   }

   private static boolean isMangroveCanopy(Block var0) {
      return var0 == Blocks.MANGROVE_LEAVES
         || var0 == Blocks.MANGROVE_LOG
         || var0 == Blocks.MANGROVE_WOOD
         || var0 == Blocks.STRIPPED_MANGROVE_LOG
         || var0 == Blocks.STRIPPED_MANGROVE_WOOD
         || var0 == Blocks.MANGROVE_ROOTS
         || var0 == Blocks.MUDDY_MANGROVE_ROOTS;
   }

   private static boolean isLushDecor(Block var0) {
      return var0 == Blocks.SPORE_BLOSSOM
         || var0 == Blocks.BIG_DRIPLEAF
         || var0 == Blocks.BIG_DRIPLEAF_STEM
         || var0 == Blocks.SMALL_DRIPLEAF
         || var0 == Blocks.AZALEA
         || var0 == Blocks.FLOWERING_AZALEA
         || var0 == Blocks.AZALEA_LEAVES
         || var0 == Blocks.FLOWERING_AZALEA_LEAVES
         || var0 == Blocks.CLAY
         || var0 == Blocks.MOSS_CARPET;
   }

   private static boolean isLushRoot(Block var0) {
      return var0 == Blocks.ROOTED_DIRT || var0 == Blocks.HANGING_ROOTS;
   }

   private static boolean isGeodeShell(Block var0) {
      return var0 == Blocks.CALCITE || var0 == Blocks.SMOOTH_BASALT || var0 == Blocks.AMETHYST_BLOCK;
   }

   private static boolean isOceanDecor(Block var0) {
      return var0 == Blocks.SEAGRASS
         || var0 == Blocks.TALL_SEAGRASS
         || var0 == Blocks.SEA_PICKLE
         || var0 == Blocks.TUBE_CORAL
         || var0 == Blocks.BRAIN_CORAL
         || var0 == Blocks.BUBBLE_CORAL
         || var0 == Blocks.FIRE_CORAL
         || var0 == Blocks.HORN_CORAL
         || var0 == Blocks.TUBE_CORAL_BLOCK
         || var0 == Blocks.BRAIN_CORAL_BLOCK
         || var0 == Blocks.BUBBLE_CORAL_BLOCK
         || var0 == Blocks.FIRE_CORAL_BLOCK
         || var0 == Blocks.HORN_CORAL_BLOCK
         || var0 == Blocks.TUBE_CORAL_FAN
         || var0 == Blocks.BRAIN_CORAL_FAN
         || var0 == Blocks.BUBBLE_CORAL_FAN
         || var0 == Blocks.FIRE_CORAL_FAN
         || var0 == Blocks.HORN_CORAL_FAN
         || var0 == Blocks.TUBE_CORAL_WALL_FAN
         || var0 == Blocks.BRAIN_CORAL_WALL_FAN
         || var0 == Blocks.BUBBLE_CORAL_WALL_FAN
         || var0 == Blocks.FIRE_CORAL_WALL_FAN
         || var0 == Blocks.HORN_CORAL_WALL_FAN;
   }

   private static boolean isMineshaftMarker(Block var0) {
      return var0 == Blocks.COBWEB || isMineshaftSupport(var0);
   }

   private static boolean isMineshaftSupport(Block var0) {
      return var0 == Blocks.RAIL
         || var0 == Blocks.POWERED_RAIL
         || var0 == Blocks.DETECTOR_RAIL
         || var0 == Blocks.ACTIVATOR_RAIL
         || var0 == Blocks.OAK_FENCE
         || var0 == Blocks.OAK_PLANKS
         || var0 == Blocks.OAK_LOG
         || var0 == Blocks.STRIPPED_OAK_LOG
         || var0 == Blocks.OAK_WOOD
         || var0 == Blocks.STRIPPED_OAK_WOOD;
   }

   private static boolean isKelp(Block var0) {
      return var0 == Blocks.KELP || var0 == Blocks.KELP_PLANT;
   }

   private static boolean isSpawner(Block var0) {
      return var0 == Blocks.SPAWNER || var0 == Blocks.TRIAL_SPAWNER;
   }

   private static boolean isMonsterSpawner(Block var0, BlockEntity var1, CompoundTag var2) {
      if (var0 == Blocks.TRIAL_SPAWNER || var1 instanceof TrialSpawnerBlockEntity) {
         return false;
      } else if (var0 == Blocks.SPAWNER || var1 instanceof SpawnerBlockEntity) {
         return true;
      } else if (var2 == null) {
         return false;
      } else {
         String var3 = var2.getStringOr("id", "").toLowerCase();
         return var3.contains("spawner") && !var3.contains("trial");
      }
   }

   private static boolean isTrialChamberBlock(BlockState var0) {
      return TRIAL_CHAMBER_BLOCKS.contains(var0.getBlock());
   }

   private static Set<Block> trialChamberBlocks() {
      HashSet var0 = new HashSet();
      var0.add(Blocks.CHISELED_TUFF);
      var0.add(Blocks.POLISHED_TUFF);
      var0.add(Blocks.POLISHED_TUFF_STAIRS);
      var0.add(Blocks.POLISHED_TUFF_SLAB);
      var0.add(Blocks.POLISHED_TUFF_WALL);
      var0.add(Blocks.TUFF_BRICKS);
      var0.add(Blocks.TUFF_BRICK_STAIRS);
      var0.add(Blocks.TUFF_BRICK_SLAB);
      var0.add(Blocks.TUFF_BRICK_WALL);
      var0.add(Blocks.CHISELED_TUFF_BRICKS);
      var0.add(Blocks.TRIAL_SPAWNER);
      var0.add(Blocks.VAULT);
      addWaxedCopper(var0, Blocks.COPPER_BLOCK);
      addWaxedCopper(var0, Blocks.CUT_COPPER);
      addWaxedCopper(var0, Blocks.CUT_COPPER_STAIRS);
      addWaxedCopper(var0, Blocks.CUT_COPPER_SLAB);
      addWaxedCopper(var0, Blocks.COPPER_GRATE);
      addWaxedCopper(var0, Blocks.COPPER_BULB);
      addWaxedCopper(var0, Blocks.COPPER_DOOR);
      addWaxedCopper(var0, Blocks.COPPER_TRAPDOOR);
      addWaxedCopper(var0, Blocks.CHISELED_COPPER);
      return Set.copyOf(var0);
   }

   private static void addWaxedCopper(Set<Block> var0, Block var1) {
      addMatchingBlocks(var0, "waxed_", BuiltInRegistries.BLOCK.getKey(var1).getPath());
   }

   private static Set<Block> waxedCopperBlocks() {
      HashSet var0 = new HashSet();
      addWaxedCopper(var0, Blocks.COPPER_BLOCK);
      return Set.copyOf(var0);
   }

   private static boolean isRotatedDeepslate(BlockState var0) {
      return var0.is(Blocks.DEEPSLATE) && var0.hasProperty(RotatedPillarBlock.AXIS) ? var0.getValue(RotatedPillarBlock.AXIS) != Axis.Y : false;
   }

   private static boolean isCraftedDeepslate(Block var0) {
      return var0 == Blocks.POLISHED_DEEPSLATE
         || var0 == Blocks.POLISHED_DEEPSLATE_STAIRS
         || var0 == Blocks.POLISHED_DEEPSLATE_SLAB
         || var0 == Blocks.POLISHED_DEEPSLATE_WALL
         || var0 == Blocks.DEEPSLATE_BRICKS
         || var0 == Blocks.DEEPSLATE_BRICK_STAIRS
         || var0 == Blocks.DEEPSLATE_BRICK_SLAB
         || var0 == Blocks.DEEPSLATE_BRICK_WALL
         || var0 == Blocks.CRACKED_DEEPSLATE_BRICKS
         || var0 == Blocks.DEEPSLATE_TILES
         || var0 == Blocks.DEEPSLATE_TILE_STAIRS
         || var0 == Blocks.DEEPSLATE_TILE_SLAB
         || var0 == Blocks.DEEPSLATE_TILE_WALL
         || var0 == Blocks.CRACKED_DEEPSLATE_TILES
         || var0 == Blocks.CHISELED_DEEPSLATE;
   }

   private static boolean isPiston(Block var0) {
      return var0 == Blocks.PISTON || var0 == Blocks.STICKY_PISTON || var0 == Blocks.MOVING_PISTON || var0 == Blocks.PISTON_HEAD;
   }

   private static boolean isValuableOre(Block var0) {
      return var0 == Blocks.DIAMOND_ORE || var0 == Blocks.DEEPSLATE_DIAMOND_ORE || var0 == Blocks.ANCIENT_DEBRIS;
   }

   private static boolean isPlayerStair(Block var0) {
      return var0 == Blocks.STONE_STAIRS
         || var0 == Blocks.COBBLESTONE_STAIRS
         || var0 == Blocks.DEEPSLATE_BRICK_STAIRS
         || var0 == Blocks.POLISHED_DEEPSLATE_STAIRS
         || var0 == Blocks.OAK_STAIRS
         || var0 == Blocks.SPRUCE_STAIRS
         || var0 == Blocks.DARK_OAK_STAIRS
         || var0 == Blocks.COBBLED_DEEPSLATE_STAIRS;
   }

   private static boolean isWorkstation(Block var0) {
      return var0 == Blocks.FURNACE
         || var0 == Blocks.BLAST_FURNACE
         || var0 == Blocks.SMOKER
         || var0 == Blocks.CRAFTING_TABLE
         || var0 == Blocks.ENCHANTING_TABLE
         || var0 == Blocks.ANVIL
         || var0 == Blocks.CHIPPED_ANVIL
         || var0 == Blocks.DAMAGED_ANVIL
         || var0 == Blocks.ENDER_CHEST;
   }

   private static boolean isPlayerDeepslate(Block var0) {
      return var0 == Blocks.COBBLED_DEEPSLATE
         || var0 == Blocks.COBBLED_DEEPSLATE_STAIRS
         || var0 == Blocks.COBBLED_DEEPSLATE_SLAB
         || var0 == Blocks.COBBLED_DEEPSLATE_WALL
         || isCraftedDeepslate(var0);
   }

   private static boolean isRedstoneRelated(Block var0) {
      return REDSTONE_BLOCKS.contains(var0);
   }

   private static boolean isCoreRedstone(Block var0) {
      return var0 == Blocks.REDSTONE_WIRE || var0 == Blocks.REPEATER || var0 == Blocks.COMPARATOR;
   }

   private static boolean isPoweredCoreComponent(BlockState var0) {
      Block var1 = var0.getBlock();
      if (var1 == Blocks.REDSTONE_WIRE) {
         return (Integer)var0.getValue(RedStoneWireBlock.POWER) > 0;
      } else {
         return var1 != Blocks.REPEATER && var1 != Blocks.COMPARATOR ? false : (Boolean)var0.getValue(DiodeBlock.POWERED);
      }
   }

   private static boolean isObserverClockPair(ClientLevel var0, BlockPos var1, BlockState var2) {
      Direction var3 = (Direction)var2.getValue(ObserverBlock.FACING);
      if (var3 != Direction.NORTH && var3 != Direction.EAST && var3 != Direction.UP) {
         return false;
      } else {
         BlockState var4 = var0.getBlockState(var1.relative(var3));
         return var4.is(Blocks.OBSERVER) && var4.getValue(ObserverBlock.FACING) == var3.getOpposite();
      }
   }

   private static boolean isCropFarmBlock(Block var0) {
      return var0 == Blocks.FARMLAND || var0 == Blocks.SUGAR_CANE || isCropPlant(var0);
   }

   private static boolean isCropPlant(Block var0) {
      return var0 == Blocks.WHEAT
         || var0 == Blocks.CARROTS
         || var0 == Blocks.POTATOES
         || var0 == Blocks.BEETROOTS
         || var0 == Blocks.NETHER_WART
         || var0 == Blocks.MELON
         || var0 == Blocks.PUMPKIN
         || var0 == Blocks.MELON_STEM
         || var0 == Blocks.PUMPKIN_STEM
         || var0 == Blocks.ATTACHED_MELON_STEM
         || var0 == Blocks.ATTACHED_PUMPKIN_STEM
         || var0 == Blocks.COCOA
         || var0 == Blocks.CACTUS
         || var0 == Blocks.SWEET_BERRY_BUSH;
   }

   private static boolean isStorageBlock(Block var0) {
      return STORAGE_BLOCKS.contains(var0);
   }

   public static boolean isTrackedStorageBlock(Block var0) {
      return STORAGE_BLOCKS.contains(var0);
   }

   public static boolean isTrackedBlockEspBlock(Block var0) {
      x var1 = x.INSTANCE;
      if (!var1.blockEsp.qo()) {
         return false;
      } else {
         k var2 = k.settingsFor(var0, var1.blockEspByBlock);
         return var2 != null && var2.enabled;
      }
   }

   private static Set<Block> buildStorageBlocks() {
      HashSet var0 = new HashSet();
      var0.add(Blocks.CHEST);
      var0.add(Blocks.TRAPPED_CHEST);
      var0.add(Blocks.ENDER_CHEST);
      var0.add(Blocks.BARREL);
      var0.add(Blocks.SHULKER_BOX);
      var0.add(Blocks.HOPPER);
      var0.add(Blocks.DROPPER);
      var0.add(Blocks.DISPENSER);
      var0.add(Blocks.CRAFTER);
      var0.add(Blocks.PISTON);
      var0.add(Blocks.STICKY_PISTON);
      var0.add(Blocks.PISTON_HEAD);
      var0.add(Blocks.MOVING_PISTON);
      var0.add(Blocks.FURNACE);
      var0.add(Blocks.BLAST_FURNACE);
      var0.add(Blocks.SMOKER);
      var0.add(Blocks.BREWING_STAND);
      var0.add(Blocks.CHISELED_BOOKSHELF);
      var0.add(Blocks.DECORATED_POT);
      var0.add(Blocks.LECTERN);
      var0.add(Blocks.JUKEBOX);
      var0.add(Blocks.COMPOSTER);
      addMatchingBlocks(var0, "shulker_box");
      addMatchingBlocks(var0, "copper_chest");
      return Set.copyOf(var0);
   }

   private static Set<Block> buildRedstoneBlocks() {
      HashSet var0 = new HashSet();
      var0.add(Blocks.REDSTONE_WIRE);
      var0.add(Blocks.REPEATER);
      var0.add(Blocks.COMPARATOR);
      var0.add(Blocks.OBSERVER);
      var0.add(Blocks.PISTON);
      var0.add(Blocks.STICKY_PISTON);
      var0.add(Blocks.PISTON_HEAD);
      var0.add(Blocks.MOVING_PISTON);
      var0.add(Blocks.REDSTONE_TORCH);
      var0.add(Blocks.REDSTONE_WALL_TORCH);
      var0.add(Blocks.REDSTONE_BLOCK);
      var0.add(Blocks.REDSTONE_LAMP);
      var0.add(Blocks.TARGET);
      var0.add(Blocks.NOTE_BLOCK);
      var0.add(Blocks.DAYLIGHT_DETECTOR);
      var0.add(Blocks.LEVER);
      var0.add(Blocks.TRIPWIRE_HOOK);
      var0.add(Blocks.TRIPWIRE);
      var0.add(Blocks.HOPPER);
      var0.add(Blocks.DROPPER);
      var0.add(Blocks.DISPENSER);
      var0.add(Blocks.CRAFTER);
      var0.add(Blocks.TRAPPED_CHEST);
      var0.add(Blocks.SCULK_SENSOR);
      var0.add(Blocks.CALIBRATED_SCULK_SENSOR);
      var0.add(Blocks.STONE_BUTTON);
      var0.add(Blocks.OAK_BUTTON);
      var0.add(Blocks.SPRUCE_BUTTON);
      var0.add(Blocks.BIRCH_BUTTON);
      var0.add(Blocks.JUNGLE_BUTTON);
      var0.add(Blocks.ACACIA_BUTTON);
      var0.add(Blocks.CHERRY_BUTTON);
      var0.add(Blocks.DARK_OAK_BUTTON);
      var0.add(Blocks.PALE_OAK_BUTTON);
      var0.add(Blocks.MANGROVE_BUTTON);
      var0.add(Blocks.BAMBOO_BUTTON);
      var0.add(Blocks.CRIMSON_BUTTON);
      var0.add(Blocks.WARPED_BUTTON);
      var0.add(Blocks.POLISHED_BLACKSTONE_BUTTON);
      var0.add(Blocks.STONE_PRESSURE_PLATE);
      var0.add(Blocks.OAK_PRESSURE_PLATE);
      var0.add(Blocks.SPRUCE_PRESSURE_PLATE);
      var0.add(Blocks.BIRCH_PRESSURE_PLATE);
      var0.add(Blocks.JUNGLE_PRESSURE_PLATE);
      var0.add(Blocks.ACACIA_PRESSURE_PLATE);
      var0.add(Blocks.CHERRY_PRESSURE_PLATE);
      var0.add(Blocks.DARK_OAK_PRESSURE_PLATE);
      var0.add(Blocks.PALE_OAK_PRESSURE_PLATE);
      var0.add(Blocks.MANGROVE_PRESSURE_PLATE);
      var0.add(Blocks.BAMBOO_PRESSURE_PLATE);
      var0.add(Blocks.CRIMSON_PRESSURE_PLATE);
      var0.add(Blocks.WARPED_PRESSURE_PLATE);
      var0.add(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE);
      var0.add(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE);
      var0.add(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);
      addMatchingBlocks(var0, "copper_bulb");
      return Set.copyOf(var0);
   }

   private static void addMatchingBlocks(Set<Block> var0, String... var1) {
      for (Block var3 : BuiltInRegistries.BLOCK) {
         Identifier var4 = BuiltInRegistries.BLOCK.getKey(var3);
         if (var4 != null) {
            String var5 = var4.getPath();
            boolean var6 = true;

            for (String var10 : var1) {
               if (!var5.contains(var10)) {
                  var6 = false;
                  break;
               }
            }

            if (var6) {
               var0.add(var3);
            }
         }
      }
   }

   private static Block firstMatchingBlock(String var0, Block var1) {
      for (Block var3 : BuiltInRegistries.BLOCK) {
         Identifier var4 = BuiltInRegistries.BLOCK.getKey(var3);
         if (var4 != null && var4.getPath().contains(var0)) {
            return var3;
         }
      }

      return var1;
   }
}
