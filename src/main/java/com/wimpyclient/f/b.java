package com.wimpyclient.f;

import com.wimpyclient.i.v;
import com.wimpyclient.i.x;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2IntMap.Entry;
import it.unimi.dsi.fastutil.longs.Long2IntMap.FastEntrySet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.multiplayer.ClientChunkCache;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder.Reference;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b {
   public static final b INSTANCE;
   private static final int CHUNKS_PER_TICK = 2;
   private static final int BURST_CHUNKS_PER_TICK = 4;
   private static final int BURST_TICKS = 30;
   private static final long SCAN_BUDGET_NANOS = 500000L;
   private static final int RESCAN_INTERVAL = 400;
   private static final int CLUSTER_INTERVAL = 20;
   private static final int MIN_Y = -64;
   private static final int MAX_Y = 62;
   private static final int MIN_CLUSTER_SIZE = 2;
   private static final double PROXIMITY_FACTOR = 2.5;
   private static final Set<Block> BASE_BLOCKS;
   private final Long2ObjectOpenHashMap<b$b> chunks;
   private final LongOpenHashSet reportedChunks;
   private final ArrayDeque<Long> scanQueue;
   private final LongOpenHashSet queuedKeys;
   private final List<b$a> candidates;
   private final List<b$d> stablePins;
   private ClientLevel lastLevel;
   private ChunkPos queueCenter;
   private int tickCounter;
   private boolean wasEnabled;
   private boolean clusterDirty;
   private volatile List<ChunkPos> renderPlanes;
   private volatile List<BlockPos> renderCentroids;
   private static int q1TRLU0KZO;
   private transient int s8uitOTrON;
   private static byte[] jnbpmiismd = fsbusjwkmdzunve();

   private b() {
super();
      int var20 = 2060113622 ^ 447374951;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
            case 39814939:
            default:
               throw new RuntimeException();
            case 180041270:
               var20 = 360761375 ^ var20;
            case 155880384:
               var20 = 1671094603 ^ 294362646 ^ Integer.parseInt("133236723");
               this.s8uitOTrON = 465967225 ^ q1TRLU0KZO;
               var20 = vbuekfgpataeuvzp(var20, 1330695119);
               Long2ObjectOpenHashMap var2 = new Long2ObjectOpenHashMap();
               this.chunks = var2;
               LongOpenHashSet var11 = new LongOpenHashSet();
               this.reportedChunks = var11;
               ArrayDeque var12 = new ArrayDeque();
               this.scanQueue = var12;
               LongOpenHashSet var13 = new LongOpenHashSet();
               this.queuedKeys = var13;
               ArrayList var14 = new ArrayList();
               this.candidates = var14;
               ArrayList var15 = new ArrayList();
               this.stablePins = var15;
               List var16 = List.of();
               this.renderPlanes = var16;
               List var17 = List.of();
               this.renderCentroids = var17;
               return;
            case 1860304734:
         }
      }
   }

   public boolean isEnabled() {
      int var6 = 1045449227 ^ 566377808 ^ 1140050839;
      var6 = 219264673 ^ var6;
      x var1 = x.INSTANCE;
      v var2 = var1.baseDebug;
      return var2.qo();
   }

   public List<ChunkPos> renderPlanes() {
      int var5 = 164967872 ^ 1644005988 ^ 1140050839;
      var5 = 1759907144 ^ var5;
      return this.renderPlanes;
   }

   public List<BlockPos> renderCentroids() {
      int var5 = 1197601528 ^ 1357438402 ^ 1140050839;
      var5 = 1791957067 ^ var5;
      return this.renderCentroids;
   }

   private void clearState() {
      int var22 = 285193330 ^ 1406924538 ^ 1140050839;
      var22 = 890384901 ^ var22;
      Long2ObjectOpenHashMap var3 = this.chunks;
      var3.clear();
      LongOpenHashSet var5 = this.reportedChunks;
      var5.clear();
      ArrayDeque var7 = this.scanQueue;
      var7.clear();
      LongOpenHashSet var9 = this.queuedKeys;
      var9.clear();
      List var11 = this.candidates;
      var11.clear();
      List var13 = this.stablePins;
      var13.clear();
      Object var2 = null;
      this.queueCenter = (ChunkPos)var2;
      byte var18 = (byte)(902150938 ^ var22);
      this.tickCounter = var18;
      byte var19 = (byte)(902150938 ^ var22);
      this.clusterDirty = (var19 != 0);
      this.publish();
   }

   public void onChunkArrived(int var1, int var2) {
      int var33 = 1233106039 ^ 502236740 ^ 1140050839;
      var33 = 1692688117 ^ var33;
      Minecraft var3 = Minecraft.getInstance();
      byte var11 = (byte)((this.isEnabled()) ? 1 : 0);
      if (var11 != (1938270033 ^ var33)) {
         var33 = 1468444818 ^ var33;
         ClientLevel var13 = var3.level;
         if (var13 != null) {
            var33 = 1341178471 ^ var33;
            LocalPlayer var15 = var3.player;
            if (var15 != null) {
               var33 = vbuekfgpataeuvzp(var33, 458411495);
               ChunkPos var16 = new ChunkPos(var1, var2);
               ChunkPos var27 = playerChunk(var3);
               byte var18 = (byte)((inRange(var16, var27)) ? 1 : 0);
               if (var18 == (1889736771 ^ var33)) {
                  var33 = 253426020 ^ var33;
                  return;
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                     case 171675554:
                        var33 = 1590151445 ^ var33;
                     case 1820137468:
                        long var20 = var16.toLong();
                        Long2ObjectOpenHashMap var23 = this.chunks;
                        Object var24 = var23.remove(var20);
                        this.enqueueFront(var20);
                        return;
                     case 763098061:
                     default:
                        throw new IllegalStateException();
                     case 1252059312:
                  }
               }
            }

            var33 = 252257712 ^ var33;
         } else {
            var33 = 1090119639 ^ var33;
         }
      } else {
         var33 = 394221381 ^ var33;
      }
   }

   public void tick(Minecraft var1) {
      int var68 = 760792596 ^ 380278218 ^ 1140050839;
      var68 = 847512243 ^ var68;
      byte var8 = (byte)((this.isEnabled()) ? 1 : 0);      byte var48 = (byte)((this.wasEnabled) ? 1 : 0);
      if (var8 != var48) {
         var68 = 1464090334 ^ var68;
         this.wasEnabled = (var8 != 0);
         this.clearState();
         ClientLevel var64;
         if (var8 != (499229732 ^ var68)) {
            var68 = 1639191987 ^ var68;
            var64 = var1.level;
            var68 = 1799951081 ^ var68;
         } else {
            label82:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
                  case 28375473:
                     break label82;
                  case 161952708:
                     var68 ^= 491626260;
                     break label82;
                  case 1335985034:
                     break;
                  case 1563407576:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }

            var64 = null;
            var68 = 397449294 ^ var68;
         }

         this.lastLevel = var64;
         var68 = 108106123 ^ var68;
      } else {
         label91:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
               case 6461121:
                  var68 ^= 1539876879;
               case 994144435:
                  break label91;
               case 1628667785:
               default:
                  throw new RuntimeException(new IOException());
               case 2136853218:
            }
         }
      }

      if (var8 == (290271989 ^ var68)) {
         var68 = 1553684474 ^ var68;
      } else {
         var68 = 396430349 ^ var68;
         ClientLevel var15 = var1.level;
         ClientLevel var53 = this.lastLevel;
         if (var15 != var53) {
            var68 = 2115928116 ^ var68;
            this.clearState();
            this.lastLevel = var15;
            var68 = 2107721221 ^ var68;
         } else {
            var68 = vbuekfgpataeuvzp(var68, 62899761);
         }

         if (var15 == null) {
            var68 = 619031514 ^ var68;
         } else {
            var68 = 54522467 ^ var68;
            LocalPlayer var21 = var1.player;
            if (var21 == null) {
               var68 = 668621241 ^ var68;
            } else {
               label72:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
                     case 101011347:
                        var68 ^= 748697152;
                     case 1792757243:
                        break label72;
                     case 1956453834:
                     default:
                        throw new RuntimeException(new IOException());
                     case 2076895612:
                  }
               }

               x var22 = x.INSTANCE;
               byte var24 = (byte)((var22.baseCalcClearRememberedPin) ? 1 : 0);
               if (var24 != (718028010 ^ var68)) {
                  var68 = 1702779310 ^ var68;
                  LongOpenHashSet var26 = this.reportedChunks;
                  var26.clear();
                  List var28 = this.stablePins;
                  var28.clear();
                  this.publish();
                  var68 = 1039123916 ^ var68;
               } else {
                  label64:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
                        case 48995529:
                           var68 ^= 1485937762;
                           break label64;
                        case 829506543:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1188300653:
                           break;
                        case 1588940402:
                           break label64;
                     }
                  }
               }

               int var55 = this.tickCounter;
               byte var4 = (byte)(1918738569 ^ var68);
               int var56 = var55 + var4;
               this.tickCounter = var56;
               int var32 = this.tickCounter;
               short var57 = (short)(1918738712 ^ var68);
               int var33 = var32 % var57;
               if (var33 == (1918738568 ^ var68)) {
                  var68 = 1518197487 ^ var68;
                  Object var58 = null;
                  this.queueCenter = (ChunkPos)var58;
                  ArrayDeque var36 = this.scanQueue;
                  var36.clear();
                  LongOpenHashSet var38 = this.queuedKeys;
                  var38.clear();
                  var68 = 175134076 ^ var68;
               } else {
                  var68 = vbuekfgpataeuvzp(var68, 1343066003);
               }

               this.refillQueueIfNeeded(var1);
               this.scanQueued(var15);
               byte var42 = (byte)((this.clusterDirty) ? 1 : 0);
               if (var42 == (575680283 ^ var68)) {
                  var68 = 1046135597 ^ var68;
                  int var44 = this.tickCounter;
                  byte var61 = (byte)(470477858 ^ var68);
                  int var45 = var44 % var61;
                  if (var45 != (470477878 ^ var68)) {
                     var68 = 1218037760 ^ var68;
                     return;
                  }

                  var68 = 529209782 ^ var68;
               } else {
                  var68 = 567401115 ^ var68;
               }

               byte var62 = (byte)(58848640 ^ var68);
               this.clusterDirty = (var62 != 0);
               this.rebuildCandidates(var1, var15);
               var68 = 1460851126 ^ var68;
            }
         }
      }
   }

   private void enqueueFront(long var1) {
      int var15 = 1335910452 ^ 1852566789 ^ 1140050839;
      var15 = 1118305707 ^ var15;
      LongOpenHashSet var6 = this.queuedKeys;
      byte var7 = (byte)((var6.add(var1)) ? 1 : 0);
      if (var7 != (547339021 ^ var15)) {
         var15 = 747971351 ^ var15;
         ArrayDeque var9 = this.scanQueue;
         Long var12 = var1;
         var9.addFirst(var12);
         var15 = 599017560 ^ var15;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
               case 3318822:
                  return;
               case 255154934:
                  var15 = 253848399 ^ var15;
                  return;
               case 957800901:
                  break;
               case 1657586429:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private void enqueueBack(long var1) {
      int var15 = 1459672749 ^ 741595325 ^ 1140050839;
      var15 = 184563251 ^ var15;
      LongOpenHashSet var6 = this.queuedKeys;
      byte var7 = (byte)((var6.add(var1)) ? 1 : 0);
      if (var7 != (868283316 ^ var15)) {
         var15 = 1270751335 ^ var15;
         ArrayDeque var9 = this.scanQueue;
         Long var12 = var1;
         var9.addLast(var12);
         var15 = 1869625480 ^ var15;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
               case 71691244:
                  var15 = 617486575 ^ var15;
                  return;
               case 1290659175:
                  break;
               case 1470084371:
                  return;
               case 1737319487:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }
   }

   private static ChunkPos playerChunk(Minecraft var0) {
      int var16 = 1652419554 ^ 812157138 ^ 1479922670;
      var16 = 389508931 ^ var16;
      LocalPlayer var6 = var0.player;
      BlockPos var7 = var6.blockPosition();
      int var9 = var7.getX();
      byte var3 = (byte)(488103833 ^ var16);
      int var10 = var9 >> var3;
      int var12 = var7.getZ();
      byte var4 = (byte)(488103833 ^ var16);
      int var13 = var12 >> var4;
      return new ChunkPos(var10, var13);
   }

   private static boolean inRange(ChunkPos var0, ChunkPos var1) {
      int var24 = 1054726988 ^ 1193527127 ^ 1479922670;
      var24 = 1684097893 ^ var24;
      byte var2 = (byte)(1168802968 ^ var24);
      x var3 = x.INSTANCE;
      int var15 = var3.baseCalcSimulationDistance;
      int var5 = Math.min(var2, var15);
      int var7 = var0.x;
      int var17 = var1.x;
      int var8 = var7 - var17;
      int var9 = Math.abs(var8);
      if (var9 <= var5) {
         var24 = 470436128 ^ var24;
         int var11 = var0.z;
         int var20 = var1.z;
         int var12 = var11 - var20;
         int var13 = Math.abs(var12);
         if (var13 <= var5) {
            var24 = 1957408920 ^ var24;
            byte var14 = (byte)(755727657 ^ var24);
            var24 = vbuekfgpataeuvzp(var24, 766293297);
            return (var14 != 0);
         }

         label22:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var24)) {
               case 160774796:
               default:
                  throw new RuntimeException(new IOException());
               case 229103397:
                  var24 ^= 1347709593;
                  break label22;
               case 256677969:
                  break;
               case 1895777632:
                  break label22;
            }
         }
      } else {
         var24 = 1281237945 ^ var24;
      }

      byte var30 = (byte)(167028521 ^ var24);
      var24 = 156462896 ^ var24;
      return (var30 != 0);
   }

   private void refillQueueIfNeeded(Minecraft var1) {
      int var64 = 1089048540 ^ 854021489 ^ 1140050839;
      var64 = 1851699666 ^ var64;
      ChunkPos var12 = playerChunk(var1);
      ChunkPos var6 = var12;
      ChunkPos var42 = this.queueCenter;
      byte var14 = (byte)((var12.equals(var42)) ? 1 : 0);
      if (var14 != (1604559080 ^ var64)) {
         var64 = 1337661356 ^ var64;
         ArrayDeque var16 = this.scanQueue;
         byte var17 = (byte)((var16.isEmpty()) ? 1 : 0);
         if (var17 == (270055236 ^ var64)) {
            var64 = 2146467236 ^ var64;
            return;
         }

         var64 = 144030928 ^ var64;
      } else {
         label128:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var64)) {
               case 156063842:
                  var64 ^= 1194240892;
               case 265939640:
                  break label128;
               case 287928571:
               default:
                  throw new RuntimeException();
               case 1807464029:
            }
         }
      }

      ChunkPos var44 = this.queueCenter;
      byte var19 = (byte)((var12.equals(var44)) ? 1 : 0);
      byte var41;
      if (var19 == (411896724 ^ var64)) {
         var64 = 855487153 ^ var64;
         var41 = (byte)(712030500 ^ var64);
         var64 = 1957811116 ^ var64;
      } else {
         var64 = vbuekfgpataeuvzp(var64, 300075638);
         var41 = (byte)(158319074 ^ var64);
         var64 = 1471064939 ^ var64;
      }

      this.queueCenter = var12;
      byte var21 = (byte)(1589734017 ^ var64);
      x var46 = x.INSTANCE;
      int var47 = var46.baseCalcSimulationDistance;
      int var22 = Math.min(var21, var47);
      int var8 = var22;
      if (var41 != (1589734025 ^ var64)) {
         var64 = 1328280244 ^ var64;
         ArrayDeque var25 = this.scanQueue;
         var25.clear();
         LongOpenHashSet var27 = this.queuedKeys;
         var27.clear();
         var64 = 2116694028 ^ var64;
      } else {
         label119:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var64)) {
               case 96942276:
               default:
                  throw new RuntimeException();
               case 127328424:
                  var64 ^= 822198968;
                  break label119;
               case 1247672829:
                  break;
               case 1796164315:
                  break label119;
            }
         }
      }

      byte var28 = (byte)(1874896945 ^ var64);
      int var9 = var28;
      var64 = 25327901 ^ var64;

      label112:
      while (var9 <= var8) {
         var64 = 137645 ^ var64;
         int var31 = -var9;
         int var10 = var31;
         var64 = 182731788 ^ var64;

         while (var10 <= var9) {
            var64 = 90042852 ^ var64;
            int var34 = -var9;
            int var11 = var34;
            var64 = 179894624 ^ var64;

            while (var11 <= var9) {
               label72: {
                  var64 = 1301451132 ^ var64;
                  if (var9 > (651367797 ^ var64)) {
                     var64 = 1569195049 ^ var64;
                     int var38 = Math.abs(var10);
                     int var52 = Math.abs(var11);
                     int var39 = Math.max(var38, var52);
                     if (var39 != var9) {
                        var64 = 296597169 ^ var64;
                        var64 = vbuekfgpataeuvzp(var64, 1278613968);
                        break label72;
                     }

                     var64 = vbuekfgpataeuvzp(var64, 1874346075);
                  } else {
                     label70:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var64)) {
                           case 131098715:
                              break label70;
                           case 188276545:
                              var64 ^= 842024050;
                              break label70;
                           case 1352819412:
                              break;
                           case 1974558314:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  }

                  int var55 = var6.x;
                  int var56 = var55 + var10;
                  int var60 = var6.z;
                  int var61 = var60 + var11;
                  long var57 = ChunkPos.asLong(var56, var61);
                  this.enqueueBack(var57);
                  var64 = 841215802 ^ var64;
               }

               var11 += 650165820 ^ var64;
               var64 = 1300314676 ^ var64;
            }

            label84:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var64)) {
                  case 265192592:
                     var64 ^= 621265483;
                  case 788727098:
                     break label84;
                  case 817322481:
                  default:
                     throw new RuntimeException();
                  case 1917621743:
               }
            }

            var10 += 1313228355 ^ var64;
            var64 = 719506127 ^ var64;
         }

         label97:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var64)) {
               case 50246901:
                  var64 ^= 1554007946;
                  break label97;
               case 152600194:
               default:
                  throw new RuntimeException();
               case 541650245:
                  break label97;
               case 876635864:
            }
         }

         var9 += 939838214 ^ var64;

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var64)) {
               case 210334041:
                  var64 ^= 1447434795;
               case 520704405:
                  continue label112;
               case 641448106:
                  break;
               case 1095253951:
               default:
                  throw new RuntimeException();
            }
         }
      }

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var64)) {
            case 94444295:
               var64 = 1063979918 ^ var64;
               return;
            case 347444948:
               break;
            case 1450711976:
            default:
               throw new RuntimeException();
            case 2122596866:
               return;
         }
      }
   }

   private void scanQueued(ClientLevel var1) {
      int var54 = 546874079 ^ 1461025136 ^ 1140050839;
      var54 = 544291865 ^ var54;
      int var13 = this.tickCounter;
      byte var3 = (byte)(336538687 ^ var54);
      byte var39;
      if (var13 <= var3) {
         var54 = 1868201743 ^ var54;
         var39 = (byte)(2069189418 ^ var54);

         label50:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
               case 200426070:
                  break label50;
               case 250948220:
                  var54 ^= 1315166876;
                  break label50;
               case 458197649:
               default:
                  throw new RuntimeException();
               case 1216482494:
            }
         }
      } else {
         var54 = 1856720164 ^ var54;
         var39 = (byte)(2057593095 ^ var54);
         var54 = 1335027895 ^ var54;
      }

      byte var6 = var39;
      long var14 = System.nanoTime();
      long var4 = 500000L;
      long var16 = var14 + var4;
      long var7 = var16;
      byte var18 = (byte)(892766642 ^ var54);
      int var9 = var18;
      var54 = 2136773393 ^ var54;

      while (true) {
         if (var9 < var6) {
            var54 = 705463202 ^ var54;
            ArrayDeque var21 = this.scanQueue;
            byte var22 = (byte)((var21.isEmpty()) ? 1 : 0);
            if (var22 == (1617336577 ^ var54)) {
               var54 = 1252446666 ^ var54;
               long var23 = System.nanoTime();
               long var68;
               int var25 = (var68 = var23 - var7) == 0L ? 0 : (var68 < 0L ? -1 : 1);
               if (var25 >= (717244619 ^ var54)) {
                  var54 = 425294806 ^ var54;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
                        case 66642065:
                           var54 = 1310896237 ^ var54;
                           return;
                        case 327720967:
                           break;
                        case 1069256553:
                        default:
                           throw new RuntimeException();
                        case 1935970753:
                           return;
                     }
                  }
               }

               var54 = 1523420719 ^ var54;
               ArrayDeque var27 = this.scanQueue;
               Object var28 = var27.pollFirst();
               Long var29 = (Long)var28;
               long var30 = var29;
               LongOpenHashSet var33 = this.queuedKeys;
               boolean var34 = var33.remove(var30);
               int var45 = ChunkPos.getX(var30);
               int var51 = ChunkPos.getZ(var30);
               LevelChunk var36 = loadedChunk(var1, var45, var51);
               if (var36 != null) {
                  var54 = 1862206618 ^ var54;
                  this.scanChunk(var36);
                  var54 = 894552998 ^ var54;
               } else {
                  var54 = vbuekfgpataeuvzp(var54, 1538182972);
               }

               var9 += 732105177 ^ var54;
               var54 = vbuekfgpataeuvzp(var54, 1640567675);
               continue;
            }

            var54 = 501029489 ^ var54;
            break;
         }

         var54 = 936483283 ^ var54;
         break;
      }
   }

   private static LevelChunk loadedChunk(ClientLevel var0, int var1, int var2) {
      int var21 = 1776662258 ^ 1397119642 ^ 1479922670;
      var21 = 1043494666 ^ var21;
      ClientChunkCache var10 = var0.getChunkSource();
      ChunkStatus var6 = ChunkStatus.FULL;
      byte var7 = (byte)(1554270348 ^ var21);
      LevelChunk var11 = var10.getChunk(var1, var2, var6, (var7 != 0));
      byte var13 = (byte)((var11 instanceof LevelChunk) ? 1 : 0);
      if (var13 != (1554270348 ^ var21)) {
         var21 = 1796294971 ^ var21;
         byte var16 = (byte)((var11.isEmpty()) ? 1 : 0);
         if (var16 == (934609335 ^ var21)) {
            var21 = 1336435514 ^ var21;
            return var11;
         } else {
            var21 = 1740924850 ^ var21;
            return null;
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var21)) {
               case 58593323:
                  var21 = 215297673 ^ var21;
                  return null;
               case 223283362:
                  return null;
               case 632390959:
               default:
                  throw new RuntimeException();
               case 858616901:
            }
         }
      }
   }

   private void scanChunk(LevelChunk var1) {
      int var112 = 620183553 ^ 285393241 ^ 1140050839;
      var112 = 754881174 ^ var112;
      ChunkPos var22 = var1.getPos();
      long var23 = var22.toLong();
      LevelChunkSection[] var26 = var1.getSections();
      LevelChunkSection[] var9 = var26;
      int var28 = var1.getMinY();
      int var10 = var28;
      byte var29 = (byte)(1526257753 ^ var112);
      int var11 = var29;
      x var30 = x.INSTANCE;
      int var31 = var30.baseCalcSensitivity;
      int var12 = var31;
      byte var32 = (byte)(1526257753 ^ var112);
      int var13 = var32;
      var112 = 245631928 ^ var112;

      while (true) {
         label188: {
            int var80 = var9.length;
            if (var13 < var80) {
               var112 = 1149683649 ^ var112;
               LevelChunkSection var35 = var9[var13];
               LevelChunkSection var14 = var35;
               if (var35 == null) {
                  var112 = vbuekfgpataeuvzp(var112, 318558345);
                  break label188;
               }

               var112 = 728574456 ^ var112;
               byte var38 = (byte)((var35.hasOnlyAir()) ? 1 : 0);
               if (var38 != (1001864664 ^ var112)) {
                  var112 = 443394757 ^ var112;
                  var112 = 603739060 ^ var112;
                  break label188;
               }

               label178:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var112)) {
                     case 62078053:
                        var112 ^= 989764864;
                        break label178;
                     case 1136692663:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1432962861:
                        break;
                     case 1772948537:
                        break label178;
                  }
               }

               byte var4 = (byte)(21602504 ^ var112);
               int var83 = var13 * var4;
               int var40 = var10 + var83;
               byte var41 = (byte)(-21602536 ^ var112);
               int var42 = var41 - var40;
               byte var85 = (byte)(21602520 ^ var112);
               int var43 = Math.max(var42, var85);
               byte var44 = (byte)(21602534 ^ var112);
               int var45 = var44 - var40;
               byte var87 = (byte)(21602519 ^ var112);
               int var46 = Math.min(var45, var87);
               int var17 = var46;
               if (var43 > var46) {
                  var112 = 41541643 ^ var112;
                  var112 = vbuekfgpataeuvzp(var112, 18252922);
                  break label188;
               }

               var112 = vbuekfgpataeuvzp(var112, 153785633);
               Predicate<BlockState> var89 = b::isBaseSignal;
               byte var49 = (byte)((var35.maybeHas(var89)) ? 1 : 0);
               if (var49 == (140719609 ^ var112)) {
                  var112 = 422364389 ^ var112;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var112)) {
                        case 25883241:
                           var112 ^= 325662133;
                           break label188;
                        case 667467208:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1333822255:
                           break label188;
                        case 1564607061:
                     }
                  }
               }

               label170:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var112)) {
                     case 4206833:
                        var112 ^= 871664132;
                        break label170;
                     case 197201305:
                     default:
                        throw new RuntimeException(new IOException());
                     case 805327171:
                        break;
                     case 1087020070:
                        break label170;
                  }
               }

               int var18 = var43;
               var112 = 504545496 ^ var112;

               while (var18 <= var17) {
                  var112 = 1310863517 ^ var112;
                  byte var70 = (byte)(1806127032 ^ var112);
                  int var19 = var70;
                  var112 = 867320430 ^ var112;

                  while (true) {
                     byte var103 = (byte)(1477774790 ^ var112);
                     if (var19 >= var103) {
                        label158:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var112)) {
                              case 178819803:
                                 var112 ^= 414104432;
                              case 917775524:
                                 break label158;
                              case 1659353181:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1664102943:
                           }
                        }

                        var18 += 1086043815 ^ var112;
                        var112 = vbuekfgpataeuvzp(var112, 1698613635);
                        break;
                     }

                     var112 = 845408124 ^ var112;
                     byte var72 = (byte)(1786178218 ^ var112);
                     int var20 = var72;
                     var112 = 1891033555 ^ var112;

                     while (true) {
                        byte var104 = (byte)(448793449 ^ var112);
                        if (var20 >= var104) {
                           var112 = 1812068347 ^ var112;
                           var19 += 1992424579 ^ var112;
                           var112 = 785707348 ^ var112;
                           break;
                        }

                        var112 = 1015019699 ^ var112;
                        BlockState var75 = var14.getBlockState(var20, var18, var19);
                        byte var77 = (byte)((var75.isAir()) ? 1 : 0);
                        if (var77 == (650113994 ^ var112)) {
                           var112 = 828901164 ^ var112;
                           byte var79 = (byte)((isBaseSignal(var75)) ? 1 : 0);
                           if (var79 != (400028902 ^ var112)) {
                              var112 = 279580710 ^ var112;
                              var11 += 125691073 ^ var112;
                              var112 = 750419684 ^ var112;
                           } else {
                              var112 = 1007709890 ^ var112;
                           }
                        } else {
                           var112 = 225995246 ^ var112;
                        }

                        var20 += 734501413 ^ var112;
                        var112 = vbuekfgpataeuvzp(var112, 822579549);
                     }
                  }
               }

               var112 = vbuekfgpataeuvzp(var112, 853521116);
               byte var106 = (byte)(391826929 ^ var112);
               int var92 = var12 * var106;
               if (var11 < var92) {
                  var112 = 360450384 ^ var112;
                  break label188;
               }

               var112 = 1791357963 ^ var112;

               label135:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var112)) {
                     case 56950235:
                        var112 ^= 1147288527;
                        break label135;
                     case 1068442301:
                        break;
                     case 1077439322:
                        break label135;
                     case 2011350523:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            } else {
               label129:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var112)) {
                     case 57904863:
                        var112 ^= 1839321564;
                        break label129;
                     case 717584580:
                        break;
                     case 1636105695:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1679061074:
                        break label129;
                  }
               }
            }

            Long2ObjectOpenHashMap var54 = this.chunks;
            Object var55 = var54.get(var23);
            b$b var56 = (b$b)var55;
            if (var11 >= var12) {
               var112 = 1754156216 ^ var112;
               Long2ObjectOpenHashMap var59 = this.chunks;
               b$b var5 = new b$b(var11);
               Object var60 = var59.put(var23, var5);
               if (var56 != null) {
                  var112 = 1312170247 ^ var112;
                  int var63 = var56.totalHits();
                  if (var63 == var11) {
                     var112 = vbuekfgpataeuvzp(var112, 339977711);
                     return;
                  }

                  var112 = 1286342726 ^ var112;
               } else {
                  label103:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var112)) {
                        case 231684434:
                           var112 ^= 43657537;
                           break label103;
                        case 677765356:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1188070259:
                           break label103;
                        case 2050307606:
                     }
                  }
               }

               byte var99 = (byte)(1407805381 ^ var112);
               this.clusterDirty = (var99 != 0);

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var112)) {
                     case 43281122:
                        var112 = 1492102569 ^ var112;
                        return;
                     case 720333679:
                        break;
                     case 726716212:
                        return;
                     case 1499744685:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            } else {
               label121:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var112)) {
                     case 5901739:
                        var112 ^= 1165873493;
                     case 1356359821:
                        break label121;
                     case 1626579510:
                        break;
                     case 1884577056:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }

               if (var56 != null) {
                  var112 = 454463405 ^ var112;
                  Long2ObjectOpenHashMap var67 = this.chunks;
                  Object var68 = var67.remove(var23);
                  byte var102 = (byte)(1737907396 ^ var112);
                  this.clusterDirty = (var102 != 0);
                  var112 = 1821415080 ^ var112;
                  return;
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var112)) {
                     case 20571417:
                        var112 = 2005276933 ^ var112;
                        return;
                     case 107624214:
                        break;
                     case 471975144:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1781285824:
                        return;
                  }
               }
            }
         }

         var13 += 36095144 ^ var112;
         var112 = vbuekfgpataeuvzp(var112, 1450841928);
      }
   }

   private static boolean isBaseSignal(BlockState var0) {
      int var12 = 456905460 ^ 731445076 ^ 1479922670;
      var12 = 1247332428 ^ var12;
      Block var4 = var0.getBlock();
      Set var5 = BASE_BLOCKS;
      byte var6 = (byte)((var5.contains(var4)) ? 1 : 0);
      if (var6 == (583941634 ^ var12)) {
         var12 = 1441825795 ^ var12;
         byte var8 = (byte)((var4 instanceof ShulkerBoxBlock) ? 1 : 0);
         if (var8 == (2000599553 ^ var12)) {
            var12 = 1639005879 ^ var12;
            byte var9 = (byte)(378504374 ^ var12);
            var12 = 169571371 ^ var12;
            return (var9 != 0);
         }

         var12 = 2144181641 ^ var12;
      } else {
         var12 = 708647306 ^ var12;
      }

      byte var19 = (byte)(150153097 ^ var12);
      var12 = 342349589 ^ var12;
      return (var19 != 0);
   }

   private void rebuildCandidates(Minecraft var1, ClientLevel var2) {
      int var420 = 548620835 ^ 30680049 ^ 1140050839;
      var420 = 957404509 ^ var420;
      this.prune(var1, var2);
      LongOpenHashSet var43 = new LongOpenHashSet();
      LongOpenHashSet var16 = var43;
      ArrayList var44 = new ArrayList();
      ArrayList var17 = var44;
      Long2ObjectOpenHashMap var46 = this.chunks;
      LongSet var47 = var46.keySet();
      long[] var48 = var47.toLongArray();
      long[] var18 = var48;
      int var50 = var48.length;
      int var19 = var50;
      byte var51 = (byte)(1535407896 ^ var420);
      int var20 = var51;
      var420 = 1230606469 ^ var420;

      while (var20 < var19) {
         var420 = 248021013 ^ var420;
         long var158 = var18[var20];
         byte var161 = (byte)((var16.add(var158)) ? 1 : 0);
         if (var161 == (471164808 ^ var420)) {
            var420 = 1505654494 ^ var420;

            label92:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var420)) {
                  case 117126205:
                     var420 ^= 567342900;
                     break label92;
                  case 1140737392:
                  default:
                     throw new IllegalStateException();
                  case 1611394163:
                     break;
                  case 2069225649:
                     break label92;
               }
            }
         } else {
            var420 = 1535685342 ^ var420;
            ArrayDeque var162 = new ArrayDeque();
            ArrayDeque var400 = var162;
            Long var275 = var158;
            boolean var164 = var162.add(var275);
            LongArrayList var165 = new LongArrayList();
            LongArrayList var401 = var165;
            byte var166 = (byte)(1201526102 ^ var420);
            int var402 = var166;
            double var167 = 0.0;
            double var403 = var167;
            double var169 = 0.0;
            double var405 = var169;
            int var171 = 945957545 ^ var420;
            int var407 = var171;
            int var172 = 945957545 ^ var420;
            int var32 = var172;
            int var173 = -945957546 ^ var420;
            int var409 = var173;
            int var174 = -945957546 ^ var420;
            int var411 = var174;
            var420 = 296647494 ^ var420;

            label166:
            while (true) {
               byte var176 = (byte)((var400.isEmpty()) ? 1 : 0);
               if (var176 != (1446227472 ^ var420)) {
                  var420 = 1989544285 ^ var420;
                  int var178 = var401.size();
                  byte var276 = (byte)(547727183 ^ var420);
                  if (var178 >= var276) {
                     var420 = 1029174052 ^ var420;
                     if (var402 <= (502420585 ^ var420)) {
                        var420 = 578839460 ^ var420;
                        var420 = 1527370159 ^ var420;
                     } else {
                        var420 = vbuekfgpataeuvzp(var420, 269976678);
                        double var379 = var402;
                        double var375 = var403 / var379;
                        double var387 = var402;
                        double var383 = var405 / var387;
                        b$c var277 = new b$c(var401, var402, var375, var383, var407, var32, var409, var411);
                        boolean var181 = var17.add(var277);
                        var420 = 1771976301 ^ var420;
                     }
                     break;
                  } else {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var420)) {
                           case 165440126:
                              break;
                           case 255906944:
                              var420 ^= 1155416367;
                           case 603458749:
                              break label166;
                           case 1025388409:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }
               }

               var420 = 469388193 ^ var420;
               Object var183 = var400.pollFirst();
               Long var184 = (Long)var183;
               long var185 = var184;
               Long2ObjectOpenHashMap var188 = this.chunks;
               Object var189 = var188.get(var185);
               b$b var190 = (b$b)var189;
               if (var190 == null) {
                  var420 = 1813719957 ^ var420;
                  var420 = 2011258932 ^ var420;
               } else {
                  var420 = vbuekfgpataeuvzp(var420, 198051386);
                  int var194 = ChunkPos.getX(var185);
                  int var417 = var194;
                  int var197 = ChunkPos.getZ(var185);
                  int var37 = var197;
                  byte var198 = (byte)(1174922122 ^ var420);
                  int var281 = var190.totalHits();
                  int var199 = Math.max(var198, var281);
                  boolean var201 = var401.add(var185);
                  int var285 = var190.totalHits();
                  int var203 = var402 + var285;
                  var402 = var203;
                  byte var350 = (byte)(1174922127 ^ var420);
                  int var330 = var194 << var350;
                  double var331 = var330;
                  double var362 = 8.0;
                  double var333 = var331 + var362;
                  double var365 = var199;
                  double var335 = var333 * var365;
                  double var206 = var403 + var335;
                  var403 = var206;
                  byte var351 = (byte)(1174922127 ^ var420);
                  int var338 = var197 << var351;
                  double var339 = var338;
                  double var367 = 8.0;
                  double var341 = var339 + var367;
                  double var370 = var199;
                  double var343 = var341 * var370;
                  double var210 = var405 + var343;
                  var405 = var210;
                  int var213 = Math.min(var407, var194);
                  var407 = var213;
                  int var215 = Math.min(var32, var197);
                  var32 = var215;
                  int var217 = Math.max(var409, var194);
                  var409 = var217;
                  int var219 = Math.max(var411, var197);
                  var411 = var219;
                  byte var220 = (byte)(-1174922124 ^ var420);
                  int var39 = var220;
                  var420 = 1547616356 ^ var420;

                  while (true) {
                     byte var290 = (byte)(439952366 ^ var420);
                     if (var39 > var290) {
                        label120:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var420)) {
                              case 47099814:
                                 var420 ^= 612059849;
                              case 331394830:
                                 break label120;
                              case 1815715447:
                                 break;
                              case 1829023378:
                              default:
                                 throw new IllegalStateException();
                           }
                        }

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var420)) {
                              case 144741883:
                                 var420 ^= 1752287030;
                                 continue label166;
                              case 379155702:
                                 break;
                              case 534683322:
                                 continue label166;
                              case 1875404201:
                              default:
                                 throw new IllegalStateException();
                           }
                        }
                     }

                     var420 = 534696976 ^ var420;
                     byte var222 = (byte)(-99088384 ^ var420);
                     int var40 = var222;
                     var420 = 169789892 ^ var420;

                     while (true) {
                        byte var291 = (byte)(267992634 ^ var420);
                        if (var40 > var291) {
                           var420 = 746301402 ^ var420;
                           var39 += 595761632 ^ var420;
                           var420 = 968604174 ^ var420;
                           break;
                        }

                        label234: {
                           var420 = 1427426409 ^ var420;
                           if (var39 == (1525543506 ^ var420)) {
                              var420 = 385973283 ^ var420;
                              if (var40 == (1307348593 ^ var420)) {
                                 var420 = 810091331 ^ var420;
                                 var420 = 1873148986 ^ var420;
                                 break label234;
                              }

                              label153:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var420)) {
                                    case 117054998:
                                       var420 ^= 2014356812;
                                       break label153;
                                    case 995018503:
                                    default:
                                       throw new IllegalStateException();
                                    case 1424134606:
                                       break;
                                    case 1461466690:
                                       break label153;
                                 }
                              }
                           } else {
                              var420 = 1863440751 ^ var420;
                           }

                           int var227 = var417 + var39;
                           int var294 = var37 + var40;
                           long var228 = ChunkPos.asLong(var227, var294);
                           Long2ObjectOpenHashMap var231 = this.chunks;
                           byte var232 = (byte)((var231.containsKey(var228)) ? 1 : 0);
                           if (var232 != (905718589 ^ var420)) {
                              var420 ^= 1159795657;
                              byte var234 = (byte)((var16.add(var228)) ? 1 : 0);
                              if (var234 != (1893546228 ^ var420)) {
                                 var420 = 889587379 ^ var420;
                                 Long var301 = var228;
                                 boolean var236 = var400.add(var301);
                                 var420 = 1473990479 ^ var420;
                              } else {
                                 label135:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var420)) {
                                       case 179105413:
                                          var420 ^= 1658669564;
                                       case 854088382:
                                          break label135;
                                       case 1823725784:
                                       default:
                                          throw new IllegalStateException();
                                       case 2112172248:
                                    }
                                 }
                              }
                           } else {
                              label145:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var420)) {
                                    case 144221754:
                                       var420 ^= 670849589;
                                    case 564659147:
                                       break label145;
                                    case 1588359462:
                                       break;
                                    case 2088264441:
                                    default:
                                       throw new IllegalStateException();
                                 }
                              }
                           }
                        }

                        var40 += 302018825 ^ var420;
                        var420 = 502878003 ^ var420;
                     }
                  }
               }
            }
         }

         var20 += 1685841507 ^ var420;
         var420 = 1990590975 ^ var420;
      }

      var420 = 603409930 ^ var420;
      byte var53 = (byte)(824879510 ^ var420);
      byte var238 = (byte)(824879519 ^ var420);
      x var302 = x.INSTANCE;
      int var303 = var302.baseCalcSimulationDistance;
      int var239 = Math.min(var238, var303);
      int var54 = Math.max(var53, var239);
      int var393 = var54;
      ArrayList var55 = new ArrayList();
      ArrayList var394 = var55;
      List var57 = groupPocketsByProximity(var17, var54);
      Iterator var58 = var57.iterator();
      Iterator var395 = var58;
      var420 = 20794459 ^ var420;

      label222:
      while (true) {
         byte var60 = (byte)((var395.hasNext()) ? 1 : 0);
         if (var60 == (806872524 ^ var420)) {
            label178:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var420)) {
                  case 221150508:
                     var420 ^= 1474551048;
                     break label178;
                  case 565547192:
                  default:
                     throw new IllegalStateException();
                  case 1058298483:
                     break label178;
                  case 1429705035:
               }
            }

            ToIntFunction<b$a> var241 = b$a::score;
            Comparator var242 = Comparator.comparingInt(var241);
            Comparator var243 = var242.reversed();
            var394.sort(var243);
            List var63 = this.candidates;
            var63.clear();
            List var65 = this.candidates;
            boolean var66 = var65.addAll(var394);
            this.syncStablePins(var1, var394);
            this.publish();
            Iterator var70 = var394.iterator();
            Iterator var396 = var70;
            var420 = 2091477767 ^ var420;

            while (true) {
               byte var72 = (byte)((var396.hasNext()) ? 1 : 0);
               if (var72 == (459101123 ^ var420)) {
                  var420 = 761188762 ^ var420;
                  return;
               }

               var420 = 607525767 ^ var420;
               Object var74 = var396.next();
               b$a var75 = (b$a)var74;
               this.alert(var1, var75);
               var420 = 607525767 ^ var420;
            }
         }

         var420 = 199463407 ^ var420;
         Object var78 = var395.next();
         List var79 = (List)var78;
         LongArrayList var80 = new LongArrayList();
         LongArrayList var22 = var80;
         byte var81 = (byte)(1005876259 ^ var420);
         int var23 = var81;
         int var82 = 1141607388 ^ var420;
         int var24 = var82;
         int var83 = 1141607388 ^ var420;
         int var25 = var83;
         int var84 = -1141607389 ^ var420;
         int var26 = var84;
         int var85 = -1141607389 ^ var420;
         int var27 = var85;
         double var86 = 0.0;
         double var28 = var86;
         double var88 = 0.0;
         double var30 = var88;
         Iterator var91 = var79.iterator();
         Iterator var33 = var91;
         var420 = 955151935 ^ var420;

         label196:
         while (true) {
            byte var93 = (byte)((var33.hasNext()) ? 1 : 0);
            if (var93 == (52036124 ^ var420)) {
               label205:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var420)) {
                     case 48784096:
                        var420 ^= 1943871470;
                        break label205;
                     case 739725163:
                     default:
                        throw new IllegalStateException();
                     case 1965153046:
                        break label205;
                     case 2120219168:
                  }
               }

               byte var118 = (byte)((var22.isEmpty()) ? 1 : 0);
               if (var118 == (1892097522 ^ var420)) {
                  var420 = 599416698 ^ var420;
                  if (var23 <= (1400717960 ^ var420)) {
                     var420 = 2100135132 ^ var420;
                     var420 = vbuekfgpataeuvzp(var420, 507978648);
                  } else {
                     var420 = 1354302072 ^ var420;
                     int var121 = var26 - var24;
                     int var261 = var27 - var25;
                     int var122 = Math.max(var121, var261);
                     byte var123 = (byte)(63193329 ^ var420);
                     byte var6 = (byte)(63193329 ^ var420);
                     int var318 = var122 + var6;
                     byte var346 = (byte)(63193330 ^ var420);
                     int var319 = var318 / var346;
                     int var263 = Math.min(var393, var319);
                     int var124 = Math.max(var123, var263);
                     long var126 = this.triangulatePeakChunk(var22, var24, var25, var26, var27, var124);
                     long var321 = Long.MIN_VALUE;
                     long var452;
                     int var130 = (var452 = var126 - var321) == 0L ? 0 : (var452 < 0L ? -1 : 1);
                     int var414;
                     int var416;
                     if (var130 != (63193328 ^ var420)) {
                        var420 = 2077753371 ^ var420;
                        int var149 = ChunkPos.getX(var126);
                        byte var266 = (byte)(2015117551 ^ var420);
                        int var150 = var149 << var266;
                        byte var267 = (byte)(2015117539 ^ var420);
                        int var151 = var150 + var267;
                        var414 = var151;
                        int var154 = ChunkPos.getZ(var126);
                        byte var268 = (byte)(2015117551 ^ var420);
                        int var155 = var154 << var268;
                        byte var269 = (byte)(2015117539 ^ var420);
                        int var156 = var155 + var269;
                        var416 = var156;
                        var420 = vbuekfgpataeuvzp(var420, 289612277);
                     } else {
                        var420 = 987687831 ^ var420;
                        double var324 = var23;
                        double var133 = var28 / var324;
                        long var135 = Math.round(var133);
                        int var137 = (int)var135;
                        var414 = var137;
                        double var327 = var23;
                        double var140 = var30 / var327;
                        long var142 = Math.round(var140);
                        int var144 = (int)var142;
                        var416 = var144;
                        var420 = 1346751097 ^ var420;
                     }

                     int var385 = var22.size();
                     long[] var391 = var22.toLongArray();
                     b$a var265 = new b$a(var24, var25, var26, var27, var414, var416, var385, var23, var391);
                     boolean var146 = var394.add(var265);
                     var420 = 1497924818 ^ var420;
                  }
                  break;
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var420)) {
                     case 176274115:
                        var420 ^= 1087436862;
                        continue label222;
                     case 762875088:
                        break;
                     case 835689414:
                        continue label222;
                     case 1834141686:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }

            var420 ^= 2061001310;
            Object var95 = var33.next();
            b$c var96 = (b$c)var95;
            LongArrayList var248 = var96.members();
            boolean var98 = var22.addAll(var248);
            int var250 = var96.score();
            int var100 = var23 + var250;
            var23 = var100;
            double var307 = var96.centroidBlockX();
            int var352 = var96.score();
            double var353 = var352;
            double var309 = var307 * var353;
            double var103 = var28 + var309;
            var28 = var103;
            double var312 = var96.centroidBlockZ();
            int var356 = var96.score();
            double var357 = var356;
            double var314 = var312 * var357;
            double var107 = var30 + var314;
            var30 = var107;
            int var252 = var96.minCx();
            int var110 = Math.min(var24, var252);
            var24 = var110;
            int var254 = var96.minCz();
            int var112 = Math.min(var25, var254);
            var25 = var112;
            int var256 = var96.maxCx();
            int var114 = Math.max(var26, var256);
            var26 = var114;
            int var258 = var96.maxCz();
            int var116 = Math.max(var27, var258);
            var27 = var116;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var420)) {
                  case 199812029:
                     var420 ^= 2061001310;
                  case 1386198038:
                     continue label196;
                  case 1587210364:
                     break;
                  case 1721475459:
                  default:
                     throw new IllegalStateException();
               }
            }
         }
      }
   }

   private long triangulatePeakChunk(LongArrayList var1, int var2, int var3, int var4, int var5, int var6) {
      int var120 = 682199086 ^ 470767703 ^ 1140050839;
      var120 = 799295758 ^ var120;
      Long2ObjectOpenHashMap var27 = this.chunks;
      Long2ObjectOpenHashMap var9 = var27;
      Long2IntOpenHashMap var28 = new Long2IntOpenHashMap();
      Long2IntOpenHashMap var10 = var28;
      byte var91 = (byte)(1492210400 ^ var120);
      var28.defaultReturnValue(var91);
      byte var30 = (byte)(1492210400 ^ var120);
      int var11 = var30;
      byte var31 = (byte)(1492210400 ^ var120);
      int var12 = var31;
      var120 = 1427534949 ^ var120;

      while (true) {
         int var93 = var1.size();
         if (var12 >= var93) {
            var120 = vbuekfgpataeuvzp(var120, 899512641);
            if (var11 > (947544004 ^ var120)) {
               var120 = 1697422 ^ var120;
               byte var71 = (byte)((var10.isEmpty()) ? 1 : 0);
               if (var71 == (946059594 ^ var120)) {
                  var120 = vbuekfgpataeuvzp(var120, 1642640675);
                  LongOpenHashSet var72 = new LongOpenHashSet();
                  LongOpenHashSet var116 = var72;
                  FastEntrySet var74 = var10.long2IntEntrySet();
                  ObjectIterator var75 = var74.iterator();
                  ObjectIterator var117 = var75;
                  var120 = 683241578 ^ var120;

                  while (true) {
                     byte var77 = (byte)((var117.hasNext()) ? 1 : 0);
                     if (var77 == (1899133955 ^ var120)) {
                        var120 = 888915578 ^ var120;
                        return collapsePeakCentroid(var116);
                     }

                     var120 = 1066011370 ^ var120;
                     Object var82 = var117.next();
                     Entry var83 = (Entry)var82;
                     int var85 = var83.getIntValue();
                     if (var85 == var11) {
                        var120 = 1621398431 ^ var120;
                        long var114 = var83.getLongKey();
                        boolean var87 = var116.add(var114);
                        var120 = 2101540814 ^ var120;
                     } else {
                        var120 = vbuekfgpataeuvzp(var120, 501638225);
                     }

                     var120 = 577531579 ^ var120;
                  }
               }

               var120 = 1420905607 ^ var120;
            } else {
               var120 = 1420339721 ^ var120;
            }

            return Long.MIN_VALUE;
         }

         var120 = 629453578 ^ var120;
         long var34 = var1.getLong(var12);
         Object var37 = var9.get(var34);
         b$b var38 = (b$b)var37;
         int var90;
         if (var38 == null) {
            var120 = 972107211 ^ var120;
            var90 = (byte)(294828101 ^ var120);
            var120 = vbuekfgpataeuvzp(var120, 1008827662);
         } else {
            label93:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var120)) {
                  case 239131046:
                     var120 ^= 935985928;
                  case 829363972:
                     break label93;
                  case 1058651433:
                     break;
                  case 1905230753:
                  default:
                     throw new RuntimeException();
               }
            }

            byte var68 = (byte)(531207814 ^ var120);
            int var111 = var38.totalHits();
            var90 = Math.max(var68, var111);
            var120 = 840586189 ^ var120;
         }

         int var17 = var90;
         int var42 = ChunkPos.getX(var34);
         int var18 = var42;
         int var45 = ChunkPos.getZ(var34);
         int var19 = var45;
         int var47 = -var6;
         int var20 = var47;
         var120 = 1060998352 ^ var120;

         while (var20 <= var6) {
            var120 = 1791400189 ^ var120;
            int var50 = var18 + var20;
            int var21 = var50;
            if (var50 < var2) {
               var120 = 2028914593 ^ var120;
            } else {
               var120 = 657771239 ^ var120;
               if (var50 > var4) {
                  var120 = 1609500118 ^ var120;
                  var120 = vbuekfgpataeuvzp(var120, 3475600);
               } else {
                  var120 = vbuekfgpataeuvzp(var120, 1362002400);
                  int var54 = -var6;
                  int var22 = var54;
                  var120 = 1540455895 ^ var120;

                  label83:
                  while (var22 <= var6) {
                     var120 = 1781968973 ^ var120;
                     int var57 = var19 + var22;
                     if (var57 >= var3) {
                        var120 = 1090375529 ^ var120;
                        if (var57 > var5) {
                           var120 = 241026069 ^ var120;
                           var120 = vbuekfgpataeuvzp(var120, 1416159089);
                        } else {
                           var120 = 1847228279 ^ var120;
                           long var61 = ChunkPos.asLong(var21, var57);
                           int var64 = var10.addTo(var61, var17);
                           int var65 = var64 + var17;
                           if (var65 > var11) {
                              var120 = 64605344 ^ var120;
                              var11 = var65;
                              var120 = 938909875 ^ var120;
                           } else {
                              var120 = 875523091 ^ var120;
                           }
                        }
                     } else {
                        var120 = vbuekfgpataeuvzp(var120, 449369101);
                     }

                     var22 += 628982774 ^ var120;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var120)) {
                           case 144902867:
                              var120 ^= 1895720000;
                              continue label83;
                           case 353832903:
                           default:
                              throw new RuntimeException();
                           case 1394871800:
                              continue label83;
                           case 1912777902:
                        }
                     }
                  }

                  var120 = 1428550001 ^ var120;
               }
            }

            var20 += 10884807 ^ var120;
            var120 = 304635740 ^ var120;
         }

         var120 = vbuekfgpataeuvzp(var120, 1768245323);
         var12 += 2078998992 ^ var120;
         var120 = vbuekfgpataeuvzp(var120, 1980507988);
      }
   }

   private static long collapsePeakCentroid(LongOpenHashSet var0) {
      int var139 = 1400603939 ^ 288540510 ^ 1479922670;
      var139 = 327990590 ^ var139;
      byte var23 = (byte)((var0.isEmpty()) ? 1 : 0);
      if (var23 != (166735021 ^ var139)) {
         var139 = 633857397 ^ var139;
         return Long.MIN_VALUE;
      } else {
         var139 = vbuekfgpataeuvzp(var139, 827368577);
         LongOpenHashSet var24 = new LongOpenHashSet(var0);
         LongOpenHashSet var4 = var24;
         long var25 = Long.MIN_VALUE;
         long var5 = var25;
         byte var27 = (byte)(950044716 ^ var139);
         int var7 = var27;
         var139 = 519483910 ^ var139;

         while (true) {
            byte var29 = (byte)((var4.isEmpty()) ? 1 : 0);
            if (var29 != (643185194 ^ var139)) {
               var139 = vbuekfgpataeuvzp(var139, 2104768306);
               return var5;
            }

            var139 = 1345895985 ^ var139;
            LongIterator var31 = var4.iterator();
            long var32 = var31.nextLong();
            ArrayDeque var34 = new ArrayDeque();
            ArrayDeque var10 = var34;
            Long var95 = var32;
            boolean var36 = var34.add(var95);
            boolean var38 = var4.remove(var32);
            long var39 = 0L;
            long var11 = var39;
            long var41 = 0L;
            long var13 = var41;
            byte var43 = (byte)(1986954267 ^ var139);
            int var15 = var43;
            var139 = 1254994285 ^ var139;

            while (true) {
               byte var45 = (byte)((var10.isEmpty()) ? 1 : 0);
               if (var45 != (1017329014 ^ var139)) {
                  var139 = 46408483 ^ var139;
                  if (var15 > var7) {
                     var139 = 1122993230 ^ var139;
                     var7 = var15;
                     double var80 = var11;
                     double var134 = var15;
                     double var82 = var80 / var134;
                     long var84 = Math.round(var82);
                     int var86 = (int)var84;
                     double var115 = var13;
                     double var136 = var15;
                     double var117 = var115 / var136;
                     long var119 = Math.round(var117);
                     int var121 = (int)var119;
                     long var87 = ChunkPos.asLong(var86, var121);
                     var5 = var87;
                     var139 = 738251415 ^ var139;
                  } else {
                     label46:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                           case 149390627:
                              var139 ^= 1861179097;
                              break label46;
                           case 1052494235:
                           default:
                              throw new RuntimeException();
                           case 1111380898:
                              break;
                           case 1239995606:
                              break label46;
                        }
                     }
                  }

                  var139 = vbuekfgpataeuvzp(var139, 1994291878);
                  break;
               }

               var139 = 31220194 ^ var139;
               Object var47 = var10.removeFirst();
               Long var48 = (Long)var47;
               long var49 = var48;
               ChunkPos var51 = new ChunkPos(var49);
               ChunkPos var18 = var51;
               int var125 = var51.x;
               long var126 = var125;
               long var54 = var11 + var126;
               var11 = var54;
               int var129 = var51.z;
               long var130 = var129;
               long var58 = var13 + var130;
               var13 = var58;
               var15 += 1031754901 ^ var139;
               byte var60 = (byte)(-1031754901 ^ var139);
               int var19 = var60;
               var139 = 16756779 ^ var139;

               while (true) {
                  byte var98 = (byte)(1031857342 ^ var139);
                  if (var19 > var98) {
                     var139 = vbuekfgpataeuvzp(var139, 91170355);
                     var139 = vbuekfgpataeuvzp(var139, 72153082);
                     break;
                  }

                  var139 = 652227705 ^ var139;
                  byte var62 = (byte)(-459329735 ^ var139);
                  int var20 = var62;
                  var139 = 1171167730 ^ var139;

                  while (true) {
                     byte var99 = (byte)(1588480309 ^ var139);
                     if (var20 > var99) {
                        label77:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                              case 83257541:
                                 break;
                              case 124908410:
                                 var139 ^= 154069149;
                                 break label77;
                              case 1195851157:
                              default:
                                 throw new RuntimeException();
                              case 1402819572:
                                 break label77;
                           }
                        }

                        var19 += 1468047784 ^ var139;
                        var139 = 1778402582 ^ var139;
                        break;
                     }

                     var139 = 628205906 ^ var139;
                     int var65 = Math.abs(var19);
                     int var101 = Math.abs(var20);
                     int var66 = var65 + var101;
                     byte var102 = (byte)(2078269543 ^ var139);
                     if (var66 != var102) {
                        var139 = 42262271 ^ var139;
                        var139 = vbuekfgpataeuvzp(var139, 333982318);
                     } else {
                        label64:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                              case 112922:
                                 var139 ^= 1200367382;
                              case 1221173358:
                                 break label64;
                              case 1258278212:
                                 break;
                              case 1834486577:
                              default:
                                 throw new RuntimeException();
                           }
                        }

                        int var68 = var18.x;
                        int var69 = var68 + var19;
                        int var105 = var18.z;
                        int var106 = var105 + var20;
                        long var70 = ChunkPos.asLong(var69, var106);
                        byte var73 = (byte)((var4.remove(var70)) ? 1 : 0);
                        if (var73 != (1012123504 ^ var139)) {
                           var139 = 175582003 ^ var139;
                           Long var111 = var70;
                           boolean var75 = var10.add(var111);
                           var139 = 1553463476 ^ var139;
                        } else {
                           var139 = vbuekfgpataeuvzp(var139, 1457574791);
                        }
                     }

                     var20 += 1790121206 ^ var139;
                     var139 = vbuekfgpataeuvzp(var139, 874339779);
                  }
               }
            }
         }
      }
   }

   private static List<List<b$c>> groupPocketsByProximity(List<b$c> var0, int var1) {
      int var145 = 694926423 ^ 211156354 ^ 1479922670;
      var145 = 992848654 ^ var145;
      ArrayList var2 = new ArrayList();
      ArrayList var7 = var2;
      int var29 = var0.size();
      boolean[] var30 = new boolean[var29];
      boolean[] var8 = var30;
      double var32 = var1;
      double var3 = 2.5;
      double var34 = var32 * var3;
      double var38 = var34 * var34;
      double var11 = var38;
      byte var40 = (byte)(1189493045 ^ var145);
      int var13 = var40;
      var145 = 899279678 ^ var145;

      label91:
      while (true) {
         int var99 = var0.size();
         if (var13 >= var99) {
            var145 = vbuekfgpataeuvzp(var145, 119828666);
            return var7;
         }

         var145 = 173047594 ^ var145;
         byte var43 = (byte)((var8[var13]) ? 1 : 0);
         if (var43 != (2033167649 ^ var145)) {
            var145 = 1460275598 ^ var145;

            label49:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var145)) {
                  case 157860150:
                     var145 ^= 1002599484;
                     break label49;
                  case 896430806:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1856135022:
                     break;
                  case 2059183433:
                     break label49;
               }
            }
         } else {
            var145 = vbuekfgpataeuvzp(var145, 1161473874);
            ArrayDeque var44 = new ArrayDeque();
            ArrayDeque var14 = var44;
            Integer var102 = var13;
            boolean var46 = var44.add(var102);
            byte var116 = (byte)(1008009842 ^ var145);
            var8[var13] = (var116 != 0);
            ArrayList var48 = new ArrayList();
            ArrayList var15 = var48;
            var145 = 385160751 ^ var145;

            while (true) {
               byte var50 = (byte)((var14.isEmpty()) ? 1 : 0);
               if (var50 != (719328348 ^ var145)) {
                  var145 = 772668129 ^ var145;
                  boolean var96 = var7.add(var15);
                  var145 = 285883950 ^ var145;
                  break;
               }

               var145 = 187048582 ^ var145;
               Object var52 = var14.removeFirst();
               Integer var53 = (Integer)var52;
               int var54 = var53;
               Object var56 = var0.get(var54);
               b$c var57 = (b$c)var56;
               boolean var59 = var15.add(var57);
               double var61 = var57.centroidBlockX();
               double var117 = 16.0;
               double var63 = var61 / var117;
               double var18 = var63;
               double var66 = var57.centroidBlockZ();
               double var119 = 16.0;
               double var68 = var66 / var119;
               double var20 = var68;
               byte var70 = (byte)(566638298 ^ var145);
               int var22 = var70;
               var145 = 1927873262 ^ var145;

               label82:
               while (true) {
                  int var107 = var0.size();
                  if (var22 >= var107) {
                     var145 = vbuekfgpataeuvzp(var145, 914038620);
                     var145 = 1337212724 ^ var145;
                     break;
                  }

                  var145 = 11883424 ^ var145;
                  byte var73 = (byte)((var8[var22]) ? 1 : 0);
                  if (var73 != (1402627988 ^ var145)) {
                     var145 = 158316047 ^ var145;
                     var145 = 606093013 ^ var145;
                  } else {
                     var145 = vbuekfgpataeuvzp(var145, 543883381);
                     Object var75 = var0.get(var22);
                     b$c var76 = (b$c)var75;
                     double var122 = var76.centroidBlockX();
                     double var5 = 16.0;
                     double var124 = var122 / var5;
                     double var79 = var18 - var124;
                     double var127 = var76.centroidBlockZ();
                     double var140 = 16.0;
                     double var129 = var127 / var140;
                     double var83 = var20 - var129;
                     double var87 = var79 * var79;
                     double var135 = var83 * var83;
                     double var89 = var87 + var135;
                     double var159;
                     int var91 = (var159 = var89 - var11) == 0.0 ? 0 : (var159 < 0.0 ? -1 : 1);
                     if (var91 <= (1945200609 ^ var145)) {
                        var145 = 1128328253 ^ var145;
                        byte var139 = (byte)(816942045 ^ var145);
                        var8[var22] = (var139 != 0);
                        Integer var112 = var22;
                        boolean var94 = var14.add(var112);
                        var145 = 1315202194 ^ var145;
                     } else {
                        label67:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var145)) {
                              case 10734258:
                                 var145 ^= 220498095;
                                 break label67;
                              case 299470172:
                                 break;
                              case 828251094:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1225175799:
                                 break label67;
                           }
                        }
                     }
                  }

                  var22 += 2127949647 ^ var145;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var145)) {
                        case 96338290:
                           var145 ^= 771414906;
                           continue label82;
                        case 817226618:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1293102631:
                           break;
                        case 1582862474:
                           continue label82;
                     }
                  }
               }
            }
         }

         var13 += 367513746 ^ var145;

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var145)) {
               case 175190523:
                  var145 ^= 1721238168;
                  continue label91;
               case 1069533061:
                  break;
               case 1444668340:
                  continue label91;
               case 1571700778:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }
   }

   private void syncStablePins(Minecraft var1, List<b$a> var2) {
      int var61 = 999442564 ^ 1437964648 ^ 1140050839;
      var61 = 143081655 ^ var61;
      ChunkPos var16 = playerChunk(var1);
      Iterator var18 = var2.iterator();
      Iterator var9 = var18;
      var61 = 1974070567 ^ var61;

      while (true) {
         byte var20 = (byte)((var9.hasNext()) ? 1 : 0);
         if (var20 == (1358608363 ^ var61)) {
            var61 = vbuekfgpataeuvzp(var61, 1952739524);
            List var22 = this.stablePins;
            Predicate var48 = var1x -> {
               int var24 = 1153878566 ^ 1219597867 ^ 1479922670;
               var24 = 1523997748 ^ var24;
               LongOpenHashSet var8 = ((h$f)var1x).members;
               LongIterator var9x = var8.iterator();
               LongIterator var5 = var9x;
               var24 = 1860242882 ^ var24;

               label27:
               while (true) {
                  byte var11 = (byte)((var5.hasNext()) ? 1 : 0);
                  if (var11 == (1618337301 ^ var24)) {
                     var24 = vbuekfgpataeuvzp(var24, 476564692);
                     return (((byte)(2081559232 ^ var24)) != 0);
                  }

                  var24 = 477038892 ^ var24;
                  Object var14x = var5.next();
                  Long var15 = (Long)var14x;
                  long var16x = var15;
                  ChunkPos var18x = new ChunkPos(var16x);
                  byte var19 = (byte)((inRange(var18x, var16)) ? 1 : 0);
                  if (var19 != (2082133817 ^ var24)) {
                     var24 = 1739510487 ^ var24;
                     return (((byte)(464782830 ^ var24)) != 0);
                  }

                  var24 = 935268648 ^ var24;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var24)) {
                        case 43082853:
                           var24 ^= 735057924;
                           continue label27;
                        case 703852090:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1287106441:
                           continue label27;
                        case 2039680192:
                     }
                  }
               }
            };
            boolean var23 = var22.removeIf(var48);
            return;
         }

         var61 = 622664368 ^ var61;
         Object var25 = var9.next();
         b$a var26 = (b$a)var25;
         int var53 = var26.centroidBlockX();
         byte var6 = (byte)(1978117467 ^ var61);
         int var57 = var26.centroidBlockZ();
         BlockPos var27 = new BlockPos(var53, var6, var57);
         long[] var55 = var26.members();
         LongOpenHashSet var28 = new LongOpenHashSet(var55);
         LongOpenHashSet var12 = var28;
         Object var29 = null;
         b$d var13 = (b$d)var29;
         List var31 = this.stablePins;
         Iterator var32 = var31.iterator();
         Iterator var14 = var32;
         var61 = 1090965214 ^ var61;

         label47:
         while (true) {
            byte var34 = (byte)((var14.hasNext()) ? 1 : 0);
            if (var34 == (887186309 ^ var61)) {
               var61 = 1076959017 ^ var61;
               break;
            }

            var61 = 476094672 ^ var61;
            Object var36 = var14.next();
            b$d var37 = (b$d)var36;
            LongOpenHashSet var39 = var37.members;
            byte var40 = (byte)((sharesMember(var39, var12)) ? 1 : 0);
            if (var40 != (679592789 ^ var61)) {
               var61 = 1800324087 ^ var61;
               var13 = var37;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var61)) {
                     case 56709878:
                        var61 ^= 924808206;
                     case 417194263:
                        break label47;
                     case 1108951131:
                        break;
                     case 2094195651:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }

            var61 = vbuekfgpataeuvzp(var61, 1235991575);
            var61 = 1439374535 ^ var61;
         }

         if (var13 != null) {
            var61 = 1153496003 ^ var61;
            var13.pos = var27;
            var13.members = var12;

            label31:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var61)) {
                  case 220214903:
                     var61 ^= 995244573;
                     break label31;
                  case 426966769:
                     break;
                  case 709140977:
                  default:
                     throw new RuntimeException(new IOException());
                  case 711223745:
                     break label31;
               }
            }
         } else {
            var61 = vbuekfgpataeuvzp(var61, 1303469725);
            List var44 = this.stablePins;
            b$d var50 = new b$d(var27, var12);
            boolean var45 = var44.add(var50);
            var61 = 841193283 ^ var61;
         }

         var61 = vbuekfgpataeuvzp(var61, 1538787993);
      }
   }

   private static boolean sharesMember(LongOpenHashSet var0, LongOpenHashSet var1) {
      int var42 = 987813030 ^ 1082232129 ^ 1479922670;
      var42 = 1845020332 ^ var42;
      int var7 = var0.size();
      int var33 = var1.size();
      if (var7 > var33) {
         var42 = vbuekfgpataeuvzp(var42, 2140386569);
         LongIterator var9 = var1.iterator();
         LongIterator var4 = var9;
         var42 = 1905770402 ^ var42;

         while (true) {
            byte var11 = (byte)((var4.hasNext()) ? 1 : 0);
            if (var11 == (1101547022 ^ var42)) {
               var42 = vbuekfgpataeuvzp(var42, 1219420935);
               break;
            }

            var42 = 1840702615 ^ var42;
            Object var13 = var4.next();
            Long var14 = (Long)var13;
            long var15 = var14;
            byte var18 = (byte)((var0.contains(var15)) ? 1 : 0);
            if (var18 != (740205209 ^ var42)) {
               var42 = 66614728 ^ var42;
               return (((byte)(803657552 ^ var42)) != 0);
            }

            var42 = 430276016 ^ var42;
            var42 = 1947441447 ^ var42;
         }
      } else {
         var42 = 1687212792 ^ var42;
         LongIterator var22 = var0.iterator();
         LongIterator var38 = var22;
         var42 = 99744022 ^ var42;

         label42:
         while (true) {
            byte var24 = (byte)((var38.hasNext()) ? 1 : 0);
            if (var24 == (785213259 ^ var42)) {
               var42 = 1275480697 ^ var42;
               var42 = vbuekfgpataeuvzp(var42, 1808631867);
               break;
            }

            var42 = 1636811243 ^ var42;
            Object var26 = var38.next();
            Long var27 = (Long)var26;
            long var28 = var27;
            byte var31 = (byte)((var1.contains(var28)) ? 1 : 0);
            if (var31 != (1329768096 ^ var42)) {
               var42 = 1241711945 ^ var42;
               return (((byte)(88187880 ^ var42)) != 0);
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                  case 160525716:
                     var42 ^= 1167947113;
                  case 165929030:
                     var42 = 605205634 ^ var42;
                     continue label42;
                  case 350434735:
                  default:
                     throw new IllegalStateException();
                  case 968351148:
               }
            }
         }
      }

      return (((byte)(151430409 ^ var42)) != 0);
   }

   private void alert(Minecraft var1, b$a var2) {
      int var103 = 1425622975 ^ 829342324 ^ 1140050839;
      var103 = 20380160 ^ var103;
      long[] var15 = var2.members();
      long[] var7 = var15;
      int var17 = var15.length;
      int var8 = var17;
      byte var18 = (byte)(659731548 ^ var103);
      int var9 = var18;
      var103 = 1655337156 ^ var103;

      label114:
      while (true) {
         if (var9 < var8) {
            var103 = 1331622726 ^ var103;
            long var21 = var7[var9];
            LongOpenHashSet var24 = this.reportedChunks;
            byte var25 = (byte)((var24.contains(var21)) ? 1 : 0);
            if (var25 != (178665438 ^ var103)) {
               var103 = 609490121 ^ var103;
               return;
            }

            var103 = vbuekfgpataeuvzp(var103, 1208116453);
            var9 += 1118065466 ^ var103;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                  case 18752486:
                     var103 ^= 123508643;
                  case 704665534:
                     continue label114;
                  case 1290662684:
                     break;
                  case 1885083866:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         } else {
            label107:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                  case 126990622:
                     var103 ^= 385829334;
                     break label107;
                  case 416467116:
                  default:
                     throw new RuntimeException(new IOException());
                  case 633981010:
                     break;
                  case 1911132783:
                     break label107;
               }
            }

            int var27 = var2.centroidBlockX();
            int var29 = var2.centroidBlockZ();
            long[] var31 = var2.members();
            long[] var96 = var31;
            int var33 = var31.length;
            int var98 = var33;
            byte var34 = (byte)(1393003854 ^ var103);
            int var12 = var34;
            var103 = 1217519768 ^ var103;

            label100:
            while (var12 < var98) {
               var103 ^= 1852682629;
               long var60 = var96[var12];
               LongOpenHashSet var63 = this.reportedChunks;
               boolean var64 = var63.add(var60);
               var12 += 1979440210 ^ var103;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                     case 77041435:
                        var103 ^= 1852682629;
                        continue label100;
                     case 1209391870:
                     default:
                        throw new RuntimeException(new IOException());
                     case 2059527210:
                        break;
                     case 2062642579:
                        continue label100;
                  }
               }
            }

            var103 = vbuekfgpataeuvzp(var103, 1983542594);
            x var36 = x.INSTANCE;
            LocalPlayer var38 = var1.player;
            if (var38 == null) {
               var103 = 1978424438 ^ var103;
               return;
            }

            label84:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                  case 75301426:
                     var103 ^= 151953782;
                     break label84;
                  case 778672255:
                     break;
                  case 1268436570:
                     break label84;
                  case 2022524909:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }

            byte var40 = (byte)((var36.baseDebugShowCoords) ? 1 : 0);
            String var58;
            if (var40 != (1688386018 ^ var103)) {
               var103 = 303679067 ^ var103;
               String var41 = hczowzggiy(wlunlvbqzoxcbdj(), var103);
               byte var69 = (byte)(1991999419 ^ var103);
               Object[] var70 = new Object[var69];
               byte var5 = (byte)(1991999417 ^ var103);
               Integer var91 = var27;
               var70[var5] = var91;
               byte var89 = (byte)(1991999416 ^ var103);
               Integer var93 = var29;
               var70[var89] = var93;
               var58 = String.format(var41, var70);

               label75:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                     case 101396941:
                        var103 ^= 1417360548;
                        break label75;
                     case 273702810:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1338382793:
                        break;
                     case 1470034773:
                        break label75;
                  }
               }
            } else {
               var103 = vbuekfgpataeuvzp(var103, 680772535);
               var58 = hczowzggiy(hpydswchdsnmhhh(), var103);
               var103 = 1861300552 ^ var103;
            }

            byte var43 = (byte)((var36.baseCalcChat) ? 1 : 0);
            if (var43 != (583027485 ^ var103)) {
               var103 = 1850073039 ^ var103;
               LocalPlayer var45 = var1.player;
               String var72 = "[Base Debug] Base found" + var58;
               MutableComponent var73 = Component.literal(var72);
               byte var85 = (byte)(1283822802 ^ var103);
               var45.displayClientMessage(var73, (var85 != 0));
               var103 = 1294463442 ^ var103;
            } else {
               var103 = 593636893 ^ var103;
            }

            LocalPlayer var47 = var1.player;
            String var75 = "Base found" + var58;
            MutableComponent var76 = Component.literal(var75);
            byte var86 = (byte)(27419905 ^ var103);
            var47.displayClientMessage(var76, (var86 != 0));
            byte var49 = (byte)((var36.baseCalcSound) ? 1 : 0);
            if (var49 != (27419904 ^ var103)) {
               var103 = 2034489911 ^ var103;
               LocalPlayer var51 = var1.player;
               Reference var77 = SoundEvents.NOTE_BLOCK_PLING;
               Object var78 = var77.value();
               SoundEvent var79 = (SoundEvent)var78;
               float var87 = 0.6F;
               float var90 = 1.4F;
               var51.playSound(var79, var87, var90);
               var103 = 1580388076 ^ var103;
            } else {
               var103 = 661722331 ^ var103;
            }

            byte var53 = (byte)((var36.baseDebugDisconnect) ? 1 : 0);
            if (var53 != (651391451 ^ var103)) {
               var103 = 1028148431 ^ var103;
               String var55 = "Base Debug: base found" + var58;
               MutableComponent var56 = Component.literal(var55);
               Runnable var81 = () -> {
                  int var17x = 1308349669 ^ 1894631290 ^ 1479922670;
                  var17x = 198478875 ^ var17x;
                  ClientLevel var6 = var1.level;
                  if (var6 != null) {
                     var17x = 1909457788 ^ var17x;
                     ClientLevel var8x = var1.level;
                     var8x.disconnect(var56);
                     var17x = 1704132977 ^ var17x;
                  } else {
                     var17x = 339935757 ^ var17x;
                  }

                  TitleScreen var5x = new TitleScreen();
                  JoinMultiplayerScreen var4 = new JoinMultiplayerScreen(var5x);
                  String var12x = hczowzggiy(afncemnetocgvvz(), var17x);
                  MutableComponent var13 = Component.translatable(var12x);
                  DisconnectedScreen var10 = new DisconnectedScreen(var4, var13, var56);
                  byte var11 = (byte)(2058636903 ^ var17x);
                  var1.disconnect(var10, (var11 != 0));
               };
               var1.execute(var81);
               var103 = 1158958464 ^ var103;
               return;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                  case 188320331:
                     var103 = 2019295567 ^ var103;
                     return;
                  case 232015341:
                     break;
                  case 936557022:
                     return;
                  case 1886502871:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      }
   }

   private void prune(Minecraft var1, ClientLevel var2) {
      int var96 = 370833153 ^ 89772695 ^ 1140050839;
      var96 = 837571248 ^ var96;
      ChunkPos var15 = playerChunk(var1);
      ChunkPos var6 = var15;
      LongArrayList var16 = new LongArrayList();
      LongArrayList var7 = var16;
      Long2ObjectOpenHashMap var18 = this.chunks;
      LongSet var19 = var18.keySet();
      long[] var20 = var19.toLongArray();
      long[] var8 = var20;
      int var22 = var20.length;
      int var9 = var22;
      byte var23 = (byte)(1633434801 ^ var96);
      int var10 = var23;
      var96 = 759064127 ^ var96;

      while (var10 < var9) {
         label98: {
            var96 = 631773903 ^ var96;
            long var51 = var8[var10];
            ChunkPos var53 = new ChunkPos(var51);
            byte var55 = (byte)((inRange(var53, var6)) ? 1 : 0);
            if (var55 != (1774862401 ^ var96)) {
               var96 = 113321141 ^ var96;
               int var79 = var53.x;
               int var87 = var53.z;
               LevelChunk var57 = loadedChunk(var2, var79, var87);
               if (var57 != null) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var96)) {
                        case 119962771:
                           var96 ^= 788028892;
                           break label98;
                        case 128608164:
                           break;
                        case 620191733:
                           break label98;
                        case 1494857588:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }

               var96 = 1931278752 ^ var96;
            } else {
               label96:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var96)) {
                     case 2047674:
                        break label96;
                     case 217560503:
                        var96 ^= 1977474325;
                        break label96;
                     case 806081750:
                        break;
                     case 973485697:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            boolean var59 = var7.add(var51);
            var96 = 1575265404 ^ var96;
         }

         var10 += 1106458921 ^ var96;
         var96 = vbuekfgpataeuvzp(var96, 227632038);
      }

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var96)) {
            case 67027729:
               var96 ^= 500257498;
            case 629760927:
               byte var25 = (byte)(1370687572 ^ var96);
               int var88 = var25;
               var96 = 1360217514 ^ var96;

               while (true) {
                  int var62 = var7.size();
                  if (var88 >= var62) {
                     var96 = vbuekfgpataeuvzp(var96, 420644558);
                     LongArrayList var27 = new LongArrayList();
                     LongArrayList var89 = var27;
                     LongOpenHashSet var29 = this.reportedChunks;
                     long[] var30 = var29.toLongArray();
                     long[] var90 = var30;
                     int var32 = var30.length;
                     int var92 = var32;
                     byte var33 = (byte)(431147824 ^ var96);
                     int var11 = var33;
                     var96 = 160125682 ^ var96;

                     label67:
                     while (var11 < var92) {
                        var96 = 1371658693 ^ var96;
                        long var36 = var90[var11];
                        ChunkPos var38 = new ChunkPos(var36);
                        byte var39 = (byte)((inRange(var38, var6)) ? 1 : 0);
                        if (var39 == (1106788359 ^ var96)) {
                           var96 = 934866554 ^ var96;
                           boolean var41 = var89.add(var36);
                           var96 = 690470681 ^ var96;
                        } else {
                           var96 = vbuekfgpataeuvzp(var96, 513757539);
                        }

                        var11 += 1600590181 ^ var96;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var96)) {
                              case 148369110:
                                 var96 ^= 1331595430;
                              case 563794861:
                                 continue label67;
                              case 831579374:
                              default:
                                 throw new RuntimeException();
                              case 1624122930:
                           }
                        }
                     }

                     var96 = vbuekfgpataeuvzp(var96, 1115220403);
                     byte var42 = (byte)(1380020337 ^ var96);
                     int var91 = var42;
                     var96 = 863771099 ^ var96;

                     label51:
                     while (true) {
                        int var69 = var89.size();
                        if (var91 >= var69) {
                           var96 = 497507801 ^ var96;
                           return;
                        }

                        var96 ^= 187373151;
                        LongOpenHashSet var45 = this.reportedChunks;
                        long var71 = var89.getLong(var91);
                        boolean var46 = var45.remove(var71);
                        var91 += 1779859444 ^ var96;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var96)) {
                              case 227278332:
                                 var96 ^= 187373151;
                                 continue label51;
                              case 384564601:
                                 break;
                              case 1219409458:
                              default:
                                 throw new RuntimeException();
                              case 1867266568:
                                 continue label51;
                           }
                        }
                     }
                  }

                  var96 = 1801977508 ^ var96;
                  Long2ObjectOpenHashMap var48 = this.chunks;
                  long var74 = var7.getLong(var88);
                  Object var49 = var48.remove(var74);
                  var88 += 1808249691 ^ var96;
                  var96 = vbuekfgpataeuvzp(var96, 1801977508);
               }
            case 1424332006:
               break;
            case 1981738857:
            default:
               throw new RuntimeException();
         }
      }
   }

   private void publish() {
      int var77 = 2114488950 ^ 567596170 ^ 1140050839;
      var77 = 73530460 ^ var77;
      ArrayList var1 = new ArrayList();
      ArrayList var5 = var1;
      List var11 = this.candidates;
      Iterator var12 = var11.iterator();
      Iterator var6 = var12;
      var77 = 1817365550 ^ var77;

      ArrayList var70;
      label109:
      while (true) {
         byte var14 = (byte)((var6.hasNext()) ? 1 : 0);
         if (var14 != (1948034329 ^ var77)) {
            var77 = 1986403264 ^ var77;
            Object var16 = var6.next();
            b$a var17 = (b$a)var16;
            b$a var7 = var17;
            int var19 = var17.minCx();
            int var8 = var19;
            var77 = 963477974 ^ var77;

            label82:
            while (true) {
               int var52 = var7.maxCx();
               if (var8 > var52) {
                  label50:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                        case 41759034:
                           var77 ^= 419175968;
                           break label50;
                        case 412798762:
                        default:
                           throw new RuntimeException();
                        case 869470952:
                           break;
                        case 1151734762:
                           break label50;
                     }
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                        case 93828000:
                           var77 ^= 1475839030;
                        case 475249465:
                           continue label109;
                        case 482721947:
                           break;
                        case 634802325:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }

               var77 = 1052931796 ^ var77;
               int var22 = var7.minCz();
               int var9 = var22;
               var77 = 1313215602 ^ var77;

               label68:
               while (true) {
                  int var54 = var7.maxCz();
                  if (var9 > var54) {
                     var77 = 1949622850 ^ var77;
                     var8 += 1067958250 ^ var77;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                           case 190135408:
                              var77 ^= 78676196;
                           case 693215780:
                              continue label82;
                           case 1192920602:
                              break;
                           case 1809165611:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  }

                  var77 ^= 4904944;
                  ChunkPos var55 = new ChunkPos(var8, var9);
                  boolean var25 = var5.add(var55);
                  var9 += 1272547928 ^ var77;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                        case 49625045:
                           var77 ^= 4904944;
                           continue label68;
                        case 150252718:
                        default:
                           throw new RuntimeException();
                        case 698397214:
                           break;
                        case 1724098016:
                           continue label68;
                     }
                  }
               }
            }
         } else {
            var77 = 1233057565 ^ var77;
            List var64 = this.stablePins;
            int var65 = var64.size();
            ArrayList var26 = new ArrayList(var65);
            var70 = var26;
            List var28 = this.stablePins;
            Iterator var29 = var28.iterator();
            Iterator var71 = var29;
            var77 = 830466049 ^ var77;

            while (true) {
               byte var31 = (byte)((var71.hasNext()) ? 1 : 0);
               if (var31 == (203274757 ^ var77)) {
                  var77 = vbuekfgpataeuvzp(var77, 775375442);
                  byte var33 = (byte)((var70.isEmpty()) ? 1 : 0);
                  if (var33 == (573239383 ^ var77)) {
                     var77 = vbuekfgpataeuvzp(var77, 1493748456);
                     break label109;
                  }

                  var77 = 541906276 ^ var77;
                  List var35 = this.candidates;
                  Iterator var36 = var35.iterator();
                  Iterator var72 = var36;
                  var77 = 1518759011 ^ var77;

                  while (true) {
                     byte var38 = (byte)((var72.hasNext()) ? 1 : 0);
                     if (var38 == (1491093840 ^ var77)) {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                              case 148589123:
                                 break;
                              case 204658411:
                                 var77 = 599946223 ^ var77;
                              case 532889856:
                                 break label109;
                              case 1683511023:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     }

                     var77 = 858138064 ^ var77;
                     Object var42 = var72.next();
                     b$a var43 = (b$a)var42;
                     int var67 = var43.centroidBlockX();
                     byte var68 = (byte)(1808166016 ^ var77);
                     int var69 = var43.centroidBlockZ();
                     BlockPos var60 = new BlockPos(var67, var68, var69);
                     boolean var45 = var70.add(var60);
                     var77 = vbuekfgpataeuvzp(var77, 858138064);
                  }
               }

               var77 = 1766671489 ^ var77;
               Object var47 = var71.next();
               b$d var48 = (b$d)var47;
               BlockPos var62 = var48.pos;
               boolean var50 = var70.add(var62);
               var77 = vbuekfgpataeuvzp(var77, 1766671489);
            }
         }
      }

      List var57 = List.copyOf(var5);
      this.renderPlanes = var57;
      List var59 = List.copyOf(var70);
      this.renderCentroids = var59;
   }

   static {
      int var35 = 22851719 ^ 315399516 ^ Integer.parseInt("133236723");
      int var32 = new Random(6395695186556240354L).nextInt();
      q1TRLU0KZO = -614432645 ^ var32;
      var35 = 667873580 ^ var35;
      b var0 = new b();
      INSTANCE = var0;
      byte var3 = (byte)(867162889 ^ var35);
      Block[] var4 = new Block[var3];
      byte var1 = (byte)(867162884 ^ var35);
      Block var2 = Blocks.CHEST;
      var4[var1] = var2;
      byte var6 = (byte)(867162885 ^ var35);
      Block var18 = Blocks.TRAPPED_CHEST;
      var4[var6] = var18;
      byte var7 = (byte)(867162886 ^ var35);
      Block var19 = Blocks.BARREL;
      var4[var7] = var19;
      byte var8 = (byte)(867162887 ^ var35);
      Block var20 = Blocks.HOPPER;
      var4[var8] = var20;
      byte var9 = (byte)(867162880 ^ var35);
      Block var21 = Blocks.REPEATER;
      var4[var9] = var21;
      byte var10 = (byte)(867162881 ^ var35);
      Block var22 = Blocks.COMPARATOR;
      var4[var10] = var22;
      byte var11 = (byte)(867162882 ^ var35);
      Block var23 = Blocks.ENCHANTING_TABLE;
      var4[var11] = var23;
      byte var12 = (byte)(867162883 ^ var35);
      Block var24 = Blocks.ANVIL;
      var4[var12] = var24;
      byte var13 = (byte)(867162892 ^ var35);
      Block var25 = Blocks.CHIPPED_ANVIL;
      var4[var13] = var25;
      byte var14 = (byte)(867162893 ^ var35);
      Block var26 = Blocks.DAMAGED_ANVIL;
      var4[var14] = var26;
      byte var15 = (byte)(867162894 ^ var35);
      Block var27 = Blocks.BEACON;
      var4[var15] = var27;
      byte var16 = (byte)(867162895 ^ var35);
      Block var28 = Blocks.RESPAWN_ANCHOR;
      var4[var16] = var28;
      byte var17 = (byte)(867162888 ^ var35);
      Block var29 = Blocks.BEEHIVE;
      var4[var17] = var29;
      Set var5 = Set.of(var4);
      BASE_BLOCKS = var5;
   }

   public static String hczowzggiy(byte[] var0, int var1) {
      String var8 = Integer.toString(var1);
      byte[] var9 = var8.getBytes();
      byte[] var6 = var9;
      byte var10 = 0;
      int var7 = var10;

      while (true) {
         int var15 = var0.length;
         if (var7 >= var15) {
            Charset var29 = StandardCharsets.UTF_16;
            return new String(var0, var29);
         }

         byte var18 = var0[var7];
         int var33 = var6.length;
         int var30 = var7 % var33;
         byte var26 = var6[var30];
         int var19 = var18 ^ var26;
         byte var20 = (byte)var19;
         var0[var7] = var20;
         byte var21 = var0[var7];
         byte[] var27 = jnbpmiismd;
         byte[] var34 = jnbpmiismd;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] fsbusjwkmdzunve() {
      return new byte[]{
         40,
         20,
         11,
         98,
         87,
         88,
         9,
         37,
         26,
         43,
         119,
         66,
         39,
         72,
         30,
         21,
         35,
         108,
         4,
         57,
         47,
         115,
         96,
         17,
         86,
         23,
         75,
         101,
         44,
         71,
         10,
         34,
         40,
         45,
         91,
         113,
         65,
         6,
         81,
         102,
         109,
         110,
         82,
         49,
         6,
         96,
         9,
         101,
         99,
         118,
         109,
         44,
         82,
         37,
         58,
         65,
         53,
         51,
         11,
         19,
         55,
         10,
         98,
         96,
         97,
         88,
         122,
         3,
         28,
         13,
         53,
         93,
         51,
         16,
         116,
         75,
         16,
         114,
         67,
         82,
         65,
         113,
         114,
         30,
         17,
         1,
         15,
         58,
         90,
         67,
         40,
         3,
         97
      };
   }

   private static byte[] afncemnetocgvvz() {
      return new byte[]{-28, -37, 62, 62, 97, 2, 63, 111, 42, 123, 69, 29, 18, 30, 40, 72, 21, 48, 52, 105, 29, 55, 85, 7, 96, 72, 125, 51, 28, 7, 56, 102};
   }

   private static byte[] hpydswchdsnmhhh() {
      return new byte[0];
   }

   private static byte[] wlunlvbqzoxcbdj() {
      return new byte[]{-25, -46, 50, 115, 110, 0, 48, 101, 43, 60, 70, 94, 30, 29, 39, 12, 26, 125, 53, 106};
   }

   private static int vbuekfgpataeuvzp(int var0, int var1) {
      return var1 ^ var0;
   }
}
