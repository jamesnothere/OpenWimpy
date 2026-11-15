package com.wimpyclient.f;

import com.wimpyclient.i.v;
import com.wimpyclient.i.x;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.FastEntrySet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalLong;
import java.util.Random;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.Options;
import net.minecraft.client.multiplayer.ClientChunkCache;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder.Reference;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.levelgen.WorldOptions;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class e {
   public static final e INSTANCE;
   private static final long SCAN_BUDGET_NANOS = 600000L;
   private static final int PROBE_CHUNKS = 48;
   private static final int SCAN_MIN_Y = 0;
   private static final int SCAN_MAX_Y = 32;
   private static final int SEED_SETTLE_TICKS = 20;
   private static final byte OTHER = 0;
   private static final byte STONE = 1;
   private static final byte BLOB = 2;
   private static final byte AIR = 3;
   private static final byte MISSING = 4;
   private static final int[] SIDE_X;
   private static final int[] SIDE_Z;
   private static final int[] CORNER_X;
   private static final int[] CORNER_Z;
   private static final e$a UNDECIDED;
   private final Long2ObjectOpenHashMap<e$a> flagged;
   private final LongArrayFIFOQueue queue;
   private final LongOpenHashSet queued;
   private final List<e$a> fresh;
   private final Long2IntOpenHashMap heat;
   private int appliedRadius;
   private LongOpenHashSet shown;
   private ClientLevel lastLevel;
   private boolean active;
   private boolean scanning;
   private e$b appliedConfig;
   private com.wimpyclient.s.a advanced;
   private boolean appliedAdvanced;
   private String seedText;
   private int seedStill;
   private boolean seedAsked;
   private WeakReference<ClientPacketListener> probeServer;
   private boolean probing;
   private final LongOpenHashSet probed;
   private final LevelChunk[] around;
   private final int[] groupX;
   private final int[] groupZ;
   private int groupSize;
   private boolean guessed;
   private Block wall;
   private Block lastBlock;
   private final int[] stackTop;
   private final int[] stackShape;
   private final int[] stackAreas;
   private final boolean[] stackGuessed;
   private final Block[] stackWall;
   private boolean sawBlob;
   private int scanX;
   private int scanZ;
   private int keepHeight;
   private long[] keptStacks;
   private int keptStackCount;
   private int tallest;
   private long bottom;
   private boolean unsure;
   private static int B5eivIAFNJ;
   private transient int GLOZ7OcKq7;
   private static String nzdtmtkxkd = ByteBuffer.wrap(dmydnjdyckrryzd()).asCharBuffer().toString();

   private e() {
super();
      int var48 = 1488060115 ^ 1091257362;
      
      var48 = 332609808 ^ var48;
      var48 = 471013940 ^ 981821345 ^ Integer.parseInt("754974276");
      this.GLOZ7OcKq7 = 2068118004 ^ B5eivIAFNJ;
      var48 = syfpllerxlszxeld(var48, 1209383982);
      Long2ObjectOpenHashMap var2 = new Long2ObjectOpenHashMap();
      this.flagged = var2;
      LongArrayFIFOQueue var21 = new LongArrayFIFOQueue();
      this.queue = var21;
      LongOpenHashSet var22 = new LongOpenHashSet();
      this.queued = var22;
      ArrayList var23 = new ArrayList();
      this.fresh = var23;
      Long2IntOpenHashMap var24 = new Long2IntOpenHashMap();
      this.heat = var24;
      LongOpenHashSet var25 = new LongOpenHashSet();
      this.shown = var25;
      Object var3 = null;
      WeakReference var26 = new WeakReference<>(var3);
      this.probeServer = var26;
      LongOpenHashSet var27 = new LongOpenHashSet();
      this.probed = var27;
      byte var28 = 9;
      LevelChunk[] var29 = new LevelChunk[var28];
      this.around = var29;
      byte var30 = 4;
      int[] var31 = new int[var30];
      this.groupX = var31;
      byte var32 = 4;
      int[] var33 = new int[var32];
      this.groupZ = var33;
      short var34 = 256;
      int[] var35 = new int[var34];
      this.stackTop = var35;
      short var36 = 256;
      int[] var37 = new int[var36];
      this.stackShape = var37;
      short var38 = 256;
      int[] var39 = new int[var38];
      this.stackAreas = var39;
      short var40 = 256;
      boolean[] var41 = new boolean[var40];
      this.stackGuessed = var41;
      short var42 = 256;
      Block[] var43 = new Block[var42];
      this.stackWall = var43;
      byte var44 = 16;
      long[] var45 = new long[var44];
      this.keptStacks = var45;
   }

   public void clear() {
      int var10 = 1054857362 ^ 313497990 ^ 374332952;
      var10 = 494627050 ^ var10;
      byte var3 = (byte)((this.active) ? 1 : 0);
      if (var3 == (658831334 ^ var10)) {
         var10 = 93837854 ^ var10;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
               case 202737417:
                  var10 ^= 616120149;
               case 989635679:
                  byte var2 = (byte)(66963635 ^ var10);
                  this.active = (var2 != 0);
                  Object var7 = null;
                  this.startLevel((ClientLevel)var7);
                  com.wimpyclient.e.a var6 = com.wimpyclient.e.a.INSTANCE;
                  var6.clearGrowthChunks();
                  return;
               case 1767416954:
               default:
                  throw new IllegalStateException();
               case 2021080963:
            }
         }
      }
   }

   public void noteWorldReload() {
      int var8 = 1279024046 ^ 1260014272 ^ 374332952;
      var8 = 1653094227 ^ var8;
      byte var3 = (byte)((this.active) ? 1 : 0);
      if (var3 != (1944188965 ^ var8)) {
         var8 = 146279100 ^ var8;
         Minecraft var2 = Minecraft.getInstance();
         ClientLevel var5 = var2.level;
         this.startLevel(var5);
         var8 = 571312347 ^ var8;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
               case 8758054:
                  var8 = 716538471 ^ var8;
                  return;
               case 199826433:
                  return;
               case 695037095:
               default:
                  throw new RuntimeException(new IOException());
               case 1361576431:
            }
         }
      }
   }

   public void onChunkArrived(int var1, int var2) {
      int var28 = 1070828169 ^ 494047319 ^ 374332952;
      var28 = 1626269135 ^ var28;
      com.wimpyclient.s.a var9 = this.advanced;
      if (var9 != null) {
         var28 = 1071221267 ^ var28;
         com.wimpyclient.s.a var11 = this.advanced;
         var11.chunkArrived(var1, var2);
         var28 = 271962982 ^ var28;
      } else {
         var28 = 804018549 ^ var28;
      }

      byte var12 = (byte)(-2079094909 ^ var28);
      int var7 = var12;
      var28 = 1452074310 ^ var28;

      while (true) {
         byte var17 = (byte)(761306427 ^ var28);
         if (var7 > var17) {
            var28 = 1791346632 ^ var28;
            return;
         }

         var28 = 1432811151 ^ var28;
         byte var14 = (byte)(-2013686710 ^ var28);
         int var8 = var14;
         var28 = 558433789 ^ var28;

         label35:
         while (true) {
            byte var18 = (byte)(1498377801 ^ var28);
            if (var8 > var18) {
               var28 = 986464405 ^ var28;
               var7 += 1669541596 ^ var28;
               var28 = 1323545575 ^ var28;
               break;
            }

            var28 ^= 1962847695;
            int var20 = var1 + var7;
            int var25 = var2 + var8;
            long var21 = ChunkPos.asLong(var20, var25);
            this.enqueue(var21);
            var8 += 766624646 ^ var28;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                  case 143148900:
                     var28 ^= 1962847695;
                     continue label35;
                  case 423717502:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1270420756:
                     break;
                  case 2001809697:
                     continue label35;
               }
            }
         }
      }
   }

   public void onBlockUpdate(BlockPos var1, BlockState var2, BlockState var3) {
      int var70 = 643729011 ^ 1416904362 ^ 374332952;
      var70 = 1591355761 ^ var70;
      byte var12 = (byte)((this.scanning) ? 1 : 0);
      if (var12 != (985616304 ^ var70)) {
         var70 = 1903473986 ^ var70;
         if (var1 != null) {
            var70 = 804742247 ^ var70;
            e$b var15 = this.appliedConfig;
            if (var15 != null) {
               var70 = syfpllerxlszxeld(var70, 1435873422);
               com.wimpyclient.s.a var17 = this.advanced;
               if (var17 != null) {
                  var70 = 33720753 ^ var70;
                  com.wimpyclient.s.a var19 = this.advanced;
                  var19.blockChanged(var1);
                  var70 = 1270103889 ^ var70;
               } else {
                  label76:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                        case 3668221:
                           var70 ^= 1236711136;
                           break label76;
                        case 309838443:
                        default:
                           throw new RuntimeException();
                        case 1071518887:
                           break label76;
                        case 1678032730:
                     }
                  }
               }

               int var21 = var1.getY();
               e$b var42 = this.appliedConfig;
               int var43 = var42.minY();
               byte var6 = (byte)(2015336698 ^ var70);
               int var44 = var43 - var6;
               if (var21 >= var44) {
                  var70 = 870939947 ^ var70;
                  e$b var46 = this.appliedConfig;
                  int var47 = var46.maxY();
                  byte var62 = (byte)(1274471889 ^ var70);
                  int var48 = var47 + var62;
                  if (var21 > var48) {
                     var70 = 336132104 ^ var70;
                     return;
                  }

                  var70 = 1538913082 ^ var70;
                  byte var25 = (byte)((matters(var2)) ? 1 : 0);
                  if (var25 == (273618666 ^ var70)) {
                     var70 = 493613165 ^ var70;
                     byte var27 = (byte)((matters(var3)) ? 1 : 0);
                     if (var27 == (220522119 ^ var70)) {
                        var70 = 764622694 ^ var70;
                        return;
                     }

                     label56:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                           case 158823297:
                              var70 ^= 1106437806;
                              break label56;
                           case 689181140:
                           default:
                              throw new RuntimeException();
                           case 1919805038:
                              break label56;
                           case 2023675118:
                        }
                     }
                  } else {
                     var70 = syfpllerxlszxeld(var70, 1553536707);
                  }

                  int var29 = var1.getX();
                  int var8 = var29;
                  int var31 = var1.getZ();
                  int var9 = var31;
                  byte var49 = (byte)(1289093163 ^ var70);
                  int var33 = var29 - var49;
                  byte var50 = (byte)(1289093165 ^ var70);
                  int var34 = var33 >> var50;
                  int var10 = var34;
                  var70 = 1811891971 ^ var70;

                  while (true) {
                     byte var63 = (byte)(657016619 ^ var70);
                     int var52 = var8 + var63;
                     byte var64 = (byte)(657016622 ^ var70);
                     int var53 = var52 >> var64;
                     if (var10 > var53) {
                        var70 = syfpllerxlszxeld(var70, 858331965);
                        return;
                     }

                     var70 = 1864597222 ^ var70;
                     byte var54 = (byte)(1208629710 ^ var70);
                     int var37 = var9 - var54;
                     byte var55 = (byte)(1208629704 ^ var70);
                     int var38 = var37 >> var55;
                     int var11 = var38;
                     var70 = 2141700177 ^ var70;

                     while (true) {
                        byte var65 = (byte)(934148511 ^ var70);
                        int var57 = var9 + var65;
                        byte var66 = (byte)(934148505 ^ var70);
                        int var58 = var57 >> var66;
                        if (var11 > var58) {
                           var70 = 396172166 ^ var70;
                           var10 += 540074522 ^ var70;
                           var70 = 119121201 ^ var70;
                           break;
                        }

                        var70 = 867351884 ^ var70;
                        long var60 = ChunkPos.asLong(var10, var11);
                        this.enqueue(var60);
                        var11 += 69158096 ^ var70;
                        var70 = syfpllerxlszxeld(var70, 867351884);
                     }
                  }
               } else {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                        case 146620537:
                           var70 = 669091107 ^ var70;
                           return;
                        case 946199782:
                        default:
                           throw new RuntimeException();
                        case 1325960521:
                           break;
                        case 1361727585:
                           return;
                     }
                  }
               }
            }

            var70 = 997416384 ^ var70;
         } else {
            var70 = syfpllerxlszxeld(var70, 344209831);
         }
      } else {
         var70 = 1710263525 ^ var70;
      }
   }

   public void tick(Minecraft var1) {
      int var177 = 970688117 ^ 1748112608 ^ 374332952;
      var177 = 1367532871 ^ var177;
      x var2 = x.INSTANCE;
      v var22 = var2.growthDebug;
      byte var23 = (byte)((var22.qo()) ? 1 : 0);
      if (var23 == (371501514 ^ var177)) {
         var177 = 1361178905 ^ var177;
         this.clear();
      } else {
         ClientLevel var9;
         ClientLevel var26;
         label195: {
            var177 = syfpllerxlszxeld(var177, 1274992295);
            var26 = var1.level;
            var9 = var26;
            byte var28 = (byte)((this.active) ? 1 : 0);
            if (var28 != (1574600557 ^ var177)) {
               var177 = 457384235 ^ var177;
               ClientLevel var119 = this.lastLevel;
               if (var26 == var119) {
                  var177 = syfpllerxlszxeld(var177, 695054178);
                  break label195;
               }

               var177 = 19617963 ^ var177;
            } else {
               label193:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var177)) {
                     case 97979193:
                        var177 ^= 443054464;
                        break label193;
                     case 410809568:
                        break;
                     case 1237825183:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1735753311:
                        break label193;
                  }
               }
            }

            byte var120 = (byte)(1202849516 ^ var177);
            this.active = (var120 != 0);
            this.startLevel(var26);
            var177 = 675739593 ^ var177;
         }

         byte var33 = (byte)((this.scanning) ? 1 : 0);
         if (var33 == (1878323492 ^ var177)) {
            var177 = 339601828 ^ var177;
            com.wimpyclient.e.a var117 = com.wimpyclient.e.a.INSTANCE;
            var117.clearGrowthChunks();
         } else {
            var177 = syfpllerxlszxeld(var177, 499187876);
            boolean var35 = var2.growthDebugAdvanced;
            boolean var123 = this.appliedAdvanced;
            if (var35 != var123) {
               var177 = 1817317810 ^ var177;
               this.startLevel(var26);
               var177 = 1075889662 ^ var177;
            } else {
               var177 = 745722956 ^ var177;
            }

            e$b var38 = currentConfig(var26);
            e$b var10 = var38;
            e$b var126 = this.appliedConfig;
            byte var40 = (byte)((var38.equals(var126)) ? 1 : 0);
            if (var40 == (1581721036 ^ var177)) {
               var177 = 1933589519 ^ var177;
               this.appliedConfig = var38;
               this.queueLoadedChunks(var26);
               var177 = 2075939869 ^ var177;
            } else {
               var177 = 150759442 ^ var177;
            }

            int var44 = var2.growthDebugSpreadRadius;
            int var130 = this.appliedRadius;
            if (var44 != var130) {
               var177 = 297013618 ^ var177;
               this.appliedRadius = var44;
               Long2IntOpenHashMap var48 = this.heat;
               var48.clear();
               Long2ObjectOpenHashMap var50 = this.flagged;
               FastEntrySet var51 = var50.long2ObjectEntrySet();
               ObjectIterator var52 = var51.iterator();
               ObjectIterator var12 = var52;
               var177 = 829073186 ^ var177;

               while (true) {
                  byte var54 = (byte)((var12.hasNext()) ? 1 : 0);
                  if (var54 == (1986395022 ^ var177)) {
                     var177 = syfpllerxlszxeld(var177, 102960938);
                     break;
                  }

                  var177 = 1419986262 ^ var177;
                  Object var56 = var12.next();
                  Entry var57 = (Entry)var56;
                  long var133 = var57.getLongKey();
                  Object var164 = var57.getValue();
                  e$a var165 = (e$a)var164;
                  byte var7 = (byte)(583450329 ^ var177);
                  this.spread(var133, var165, var7);
                  var177 = syfpllerxlszxeld(var177, 1419986262);
               }
            } else {
               var177 = syfpllerxlszxeld(var177, 654162298);
            }

            long var59 = System.nanoTime();
            long var4 = 600000L;
            long var61 = var59 + var4;
            long var172 = var61;
            byte var64 = (byte)((var2.growthDebugAdvanced) ? 1 : 0);
            if (var64 != (1883698340 ^ var177)) {
               var177 = 357004857 ^ var177;
               this.tickAdvanced(var1, var26, var61);
               var177 = 189995080 ^ var177;
            } else {
               label173:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var177)) {
                     case 159975867:
                        var177 ^= 504655473;
                     case 594403530:
                        break label173;
                     case 935217932:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1126602561:
                  }
               }
            }

            label166:
            while (true) {
               LongArrayFIFOQueue var67 = this.queue;
               byte var68 = (byte)((var67.isEmpty()) ? 1 : 0);
               if (var68 != (1850907349 ^ var177)) {
                  var177 = syfpllerxlszxeld(var177, 315880387);
                  break;
               }

               var177 = 1818615311 ^ var177;
               long var69 = System.nanoTime();
               long var210;
               int var71 = (var210 = var69 - var172) == 0L ? 0 : (var210 < 0L ? -1 : 1);
               if (var71 >= (37176538 ^ var177)) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var177)) {
                        case 34853563:
                           var177 ^= 2125868492;
                           break label166;
                        case 828261037:
                        default:
                           throw new RuntimeException(new IOException());
                        case 889504341:
                           break label166;
                        case 1378047993:
                     }
                  }
               }

               var177 = 74861483 ^ var177;
               LongArrayFIFOQueue var73 = this.queue;
               long var74 = var73.dequeueLong();
               LongOpenHashSet var77 = this.queued;
               boolean var78 = var77.remove(var74);
               int var81 = ChunkPos.getX(var74);
               int var84 = ChunkPos.getZ(var74);
               byte var86 = (byte)((isLoaded(var9, var81, var84)) ? 1 : 0);
               if (var86 == (104927089 ^ var177)) {
                  var177 = 799925604 ^ var177;
                  var177 = syfpllerxlszxeld(var177, 1203663040);
               } else {
                  var177 = syfpllerxlszxeld(var177, 412453273);
                  e$a var88 = this.scan(var9, var81, var84, var10);
                  byte var90 = (byte)((this.sawBlob) ? 1 : 0);
                  if (var90 != (517244648 ^ var177)) {
                     var177 = 1406062369 ^ var177;
                     this.probe(var1, var74);
                     var177 = 19092798 ^ var177;
                  } else {
                     label159:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var177)) {
                           case 115854014:
                           default:
                              throw new RuntimeException(new IOException());
                           case 196860853:
                              var177 ^= 1391303199;
                           case 1327977777:
                              break label159;
                           case 2034636396:
                        }
                     }
                  }

                  e$a var141 = UNDECIDED;
                  if (var88 == var141) {
                     var177 = 1971711518 ^ var177;
                     var177 = 1475242044 ^ var177;
                  } else {
                     label151:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var177)) {
                           case 61793319:
                              var177 ^= 116537483;
                           case 346666594:
                              break label151;
                           case 1293549820:
                           default:
                              throw new RuntimeException(new IOException());
                           case 2134103945:
                        }
                     }

                     Long2ObjectOpenHashMap var94 = this.flagged;
                     Object var95 = var94.get(var74);
                     e$a var96 = (e$a)var95;
                     byte var118;
                     if (var88 == null) {
                        var177 = 1059181656 ^ var177;
                        if (var96 != null) {
                           var177 = 257117099 ^ var177;
                           var118 = (byte)(2058992526 ^ var177);
                           var177 = 1150906800 ^ var177;
                        } else {
                           var177 = syfpllerxlszxeld(var177, 313248238);
                           var118 = (byte)(1732327882 ^ var177);

                           label123:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var177)) {
                                 case 135149750:
                                    var177 ^= 1499591669;
                                    break label123;
                                 case 1784979519:
                                    break;
                                 case 1989288232:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 2071668413:
                                    break label123;
                              }
                           }
                        }
                     } else {
                        label206: {
                           label142:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var177)) {
                                 case 15326331:
                                    var177 ^= 675909422;
                                 case 367869538:
                                    break label142;
                                 case 401445014:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1715774021:
                              }
                           }

                           if (var96 != null) {
                              var177 = 1089743587 ^ var177;
                              byte var107 = (byte)((var96.sameAs(var88)) ? 1 : 0);
                              if (var107 != (578191793 ^ var177)) {
                                 var177 = syfpllerxlszxeld(var177, 641654435);
                                 var118 = (byte)(71851794 ^ var177);
                                 var177 = 979932461 ^ var177;
                                 break label206;
                              }

                              var177 = 1963418296 ^ var177;
                           } else {
                              label134:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var177)) {
                                    case 160189511:
                                       break label134;
                                    case 163605860:
                                    default:
                                       throw new RuntimeException(new IOException());
                                    case 249383276:
                                       var177 ^= 905136219;
                                       break label134;
                                    case 408316812:
                                 }
                              }
                           }

                           var118 = (byte)(1467081480 ^ var177);
                           var177 = 1766926646 ^ var177;
                        }
                     }

                     if (var118 != (1042336319 ^ var177)) {
                        var177 = 34002706 ^ var177;
                        this.refile(var74, var96, var88);
                        if (var96 == null) {
                           var177 = 1733136838 ^ var177;
                           List var103 = this.fresh;
                           boolean var104 = var103.add(var88);
                           var177 = 2038683587 ^ var177;
                        } else {
                           var177 = 516834821 ^ var177;
                        }
                     } else {
                        var177 = 482906391 ^ var177;
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var177)) {
                           case 60953205:
                              var177 ^= 1287307773;
                           case 973328903:
                              continue label166;
                           case 1189684741:
                              break;
                           case 1427799034:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }
               }
            }

            List var163 = this.fresh;
            this.announce(var1, var163);
            List var110 = this.fresh;
            var110.clear();
            LongOpenHashSet var112 = this.computeShown(var9);
            LongOpenHashSet var151 = this.shown;
            byte var114 = (byte)((var112.equals(var151)) ? 1 : 0);
            if (var114 == (2088855830 ^ var177)) {
               var177 = 982610082 ^ var177;
               this.shown = var112;
               com.wimpyclient.e.a var116 = com.wimpyclient.e.a.INSTANCE;
               LongOpenHashSet var154 = this.shown;
               var116.replaceGrowthChunks(var154);
               var177 = 715429169 ^ var177;
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var177)) {
                     case 20629275:
                        var177 = 271967635 ^ var177;
                        return;
                     case 1447554774:
                        break;
                     case 1736215015:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1941224944:
                        return;
                  }
               }
            }
         }
      }
   }

   private void startLevel(ClientLevel var1) {
      byte var51;
      int var62;
      label38: {
         var62 = 1820438275 ^ 700917287 ^ 374332952;
         var62 = 334072871 ^ var62;
         this.closeAdvanced();
         x var3 = x.INSTANCE;
         boolean var33 = var3.growthDebugAdvanced;
         this.appliedAdvanced = var33;
         Long2ObjectOpenHashMap var8 = this.flagged;
         var8.clear();
         Long2IntOpenHashMap var10 = this.heat;
         var10.clear();
         x var34 = x.INSTANCE;
         int var35 = var34.growthDebugSpreadRadius;
         this.appliedRadius = var35;
         LongArrayFIFOQueue var13 = this.queue;
         var13.clear();
         LongOpenHashSet var15 = this.queued;
         var15.clear();
         List var17 = this.fresh;
         var17.clear();
         LongOpenHashSet var36 = new LongOpenHashSet();
         this.shown = var36;
         com.wimpyclient.e.a var19 = com.wimpyclient.e.a.INSTANCE;
         var19.clearGrowthChunks();
         this.lastLevel = var1;
         if (var1 != null) {
            var62 = 1952958142 ^ var62;
            ResourceKey var40 = var1.dimension();
            ResourceKey var52 = Level.NETHER;
            if (var40 != var52) {
               var62 = 1253321790 ^ var62;
               ResourceKey var42 = var1.dimension();
               ResourceKey var53 = Level.END;
               if (var42 != var53) {
                  var62 = 934498869 ^ var62;
                  var51 = (byte)(1233150895 ^ var62);
                  var62 = syfpllerxlszxeld(var62, 1518905342);
                  break label38;
               }

               var62 = 2079835104 ^ var62;
            } else {
               var62 = 826535902 ^ var62;
            }
         } else {
            var62 = syfpllerxlszxeld(var62, 1159997792);
         }

         var51 = (byte)(96793211 ^ var62);
         var62 = 382481963 ^ var62;
      }

      this.scanning = (var51 != 0);
      byte var23 = (byte)((this.scanning) ? 1 : 0);
      if (var23 == (319341648 ^ var62)) {
         var62 = 208573195 ^ var62;
      } else {
         var62 = syfpllerxlszxeld(var62, 1029467079);
         Minecraft var24 = Minecraft.getInstance();
         ClientPacketListener var25 = var24.getConnection();
         WeakReference var44 = this.probeServer;
         Object var45 = var44.get();
         if (var25 != var45) {
            var62 = 1981586722 ^ var62;
            WeakReference var46 = new WeakReference<>(var25);
            this.probeServer = var46;
            byte var47 = (byte)(1481126580 ^ var62);
            this.probing = (var47 != 0);
            LongOpenHashSet var30 = this.probed;
            var30.clear();
            var62 = 930601698 ^ var62;
         } else {
            label29:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var62)) {
                  case 21391928:
                     break;
                  case 163854944:
                     var62 = 1097549760 ^ var62;
                  case 844478121:
                     break label29;
                  case 927325485:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         e$b var49 = currentConfig(var1);
         this.appliedConfig = var49;
         this.queueLoadedChunks(var1);
      }
   }

   private void tickAdvanced(Minecraft var1, ClientLevel var2, long var3) {
      int var134 = 1746441331 ^ 1410878387 ^ 374332952;
      var134 = 292802519 ^ var134;
      x var5 = x.INSTANCE;
      String var16 = var5.growthDebugSeed;
      String var88 = this.seedText;
      byte var18 = (byte)((var16.equals(var88)) ? 1 : 0);
      if (var18 == (993840655 ^ var134)) {
         var134 = 1428768393 ^ var134;
         String var90 = this.seedText;
         byte var115;
         if (var90 == null) {
            var134 = 623670445 ^ var134;
            var115 = (byte)(1262091327 ^ var134);
            var134 = 1149319486 ^ var134;
         } else {
            var134 = 2077984988 ^ var134;
            var115 = (byte)(365822042 ^ var134);
            var134 = 443991375 ^ var134;
         }

         this.seedStill = var115;
         this.seedText = var16;

         label187:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
               case 242610784:
                  var134 ^= 2128450123;
               case 1552837984:
                  break label187;
               case 1664224177:
               default:
                  throw new RuntimeException(new IOException());
               case 2007049287:
            }
         }
      } else {
         var134 = 559705961 ^ var134;
         int var86 = this.seedStill;
         byte var112 = (byte)(442540402 ^ var134);
         if (var86 < var112) {
            var134 = 253607103 ^ var134;
            int var113 = this.seedStill;
            byte var124 = (byte)(360521176 ^ var134);
            int var114 = var113 + var124;
            this.seedStill = var114;
            var134 = 1679313543 ^ var134;
         } else {
            var134 = 1795552824 ^ var134;
         }
      }

      int var22 = this.seedStill;
      byte var92 = (byte)(1902466890 ^ var134);
      label180:
      if (var22 >= var92) {
         var134 = 792212789 ^ var134;
         OptionalLong var24 = WorldOptions.parseSeed(var16);
         byte var26 = (byte)((var24.isEmpty()) ? 1 : 0);
         if (var26 != (1583178347 ^ var134)) {
            var134 = 1764635521 ^ var134;
            com.wimpyclient.s.a var28 = this.advanced;
            if (var28 != null) {
               var134 = 1556721791 ^ var134;
               this.startLevel(var2);
               var134 = 489921809 ^ var134;
            } else {
               label101:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                     case 191846854:
                        var134 ^= 1106914670;
                     case 472985450:
                        break label101;
                     case 487069577:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1154624903:
                  }
               }
            }

            byte var31 = (byte)((this.seedAsked) ? 1 : 0);
            if (var31 == (1988721796 ^ var134)) {
               var134 = 672459479 ^ var134;
               byte var94 = (byte)(1587385938 ^ var134);
               this.seedAsked = (var94 != 0);
               String var95 = npkakepwjg(hdpwnpimkcppebf(), var134);
               chat(var1, var95);
               var134 = 2113703211 ^ var134;
               return;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                  case 95033270:
                     var134 = 1441294332 ^ var134;
                     return;
                  case 140545031:
                     break;
                  case 391868938:
                     return;
                  case 572669492:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }

         var134 = syfpllerxlszxeld(var134, 808633259);
         byte var96 = (byte)(1852809664 ^ var134);
         this.seedAsked = (var96 != 0);
         com.wimpyclient.s.a var36 = this.advanced;
         if (var36 != null) {
            var134 = 2041129525 ^ var134;
            com.wimpyclient.s.a var38 = this.advanced;
            long var39 = var38.seed();
            long var116 = var24.getAsLong();
            long var167;
            int var41 = (var167 = var39 - var116) == 0L ? 0 : (var167 < 0L ? -1 : 1);
            if (var41 == (398887925 ^ var134)) {
               var134 = syfpllerxlszxeld(var134, 2067831639);
               break label180;
            }

            var134 = 1371821432 ^ var134;
         } else {
            label176:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                  case 100149003:
                     var134 ^= 678264653;
                  case 154145376:
                     break label176;
                  case 191631782:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1413166500:
               }
            }
         }

         com.wimpyclient.s.a var43 = this.advanced;
         if (var43 != null) {
            var134 = 1642530464 ^ var134;
            this.startLevel(var2);
            var134 = 113642142 ^ var134;
         } else {
            var134 = 1730219070 ^ var134;
         }

         long var99 = var24.getAsLong();
         com.wimpyclient.s.a var101 = com.wimpyclient.s.a.start(var99);
         this.advanced = var101;
         var134 = 1302708753 ^ var134;
      } else {
         var134 = 501434364 ^ var134;
      }

      com.wimpyclient.s.a var47 = this.advanced;
      if (var47 == null) {
         var134 = 674599916 ^ var134;
      } else {
         var134 = 1880392319 ^ var134;
         com.wimpyclient.s.a var49 = this.advanced;
         List var50 = var49.tick(var2, var3);
         Iterator var51 = var50.iterator();
         Iterator var129 = var51;
         var134 = 806284612 ^ var134;

         while (true) {
            byte var53 = (byte)((var129.hasNext()) ? 1 : 0);
            if (var53 == (748453785 ^ var134)) {
               var134 = syfpllerxlszxeld(var134, 1413107838);
               com.wimpyclient.s.a var55 = this.advanced;
               List var56 = var55.drainNotices();
               Iterator var57 = var56.iterator();
               Iterator var130 = var57;
               var134 = 240405507 ^ var134;

               while (true) {
                  byte var59 = (byte)((var130.hasNext()) ? 1 : 0);
                  if (var59 == (1995596772 ^ var134)) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                           case 108386171:
                              var134 = 973547568 ^ var134;
                              return;
                           case 194106758:
                              return;
                           case 338429249:
                              break;
                           case 1976239699:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }

                  var134 = 1884338465 ^ var134;
                  Object var61 = var130.next();
                  String var62 = (String)var61;
                  chat(var1, var62);
                  var134 = syfpllerxlszxeld(var134, 1884338465);
               }
            }

            var134 = 300342558 ^ var134;
            Object var65 = var129.next();
            com.wimpyclient.s.a$c var66 = (com.wimpyclient.s.a$c)var65;
            byte var68 = (byte)((var66.flagged()) ? 1 : 0);
            e$a var69;
            if (var68 != (1031447175 ^ var134)) {
               var134 = 627079487 ^ var134;
               long[] var121 = var66.anchors();
               byte var8 = (byte)(404413368 ^ var134);
               long var122 = var121[var8];
               int var126 = var66.blocks();
               long[] var128 = var66.anchors();
               var69 = new e$a(var122, var126, var128);
               var134 = 840607014 ^ var134;
            } else {
               var134 = syfpllerxlszxeld(var134, 1308271178);
               var69 = null;
               var134 = 1518370387 ^ var134;
            }

            label162: {
               Long2ObjectOpenHashMap var71 = this.flagged;
               long var105 = var66.chunk();
               Object var72 = var71.get(var105);
               e$a var73 = (e$a)var72;
               if (var69 == null) {
                  var134 = 1781503375 ^ var134;
                  if (var73 == null) {
                     var134 = 1197562003 ^ var134;
                     break label162;
                  }

                  var134 = 1253458133 ^ var134;

                  label159:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                        case 76133970:
                           var134 ^= 2093715788;
                           break label159;
                        case 242287385:
                        default:
                           throw new RuntimeException(new IOException());
                        case 409449384:
                           break;
                        case 743081216:
                           break label159;
                     }
                  }
               } else {
                  label152:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                        case 23125842:
                           var134 ^= 1912018134;
                           break label152;
                        case 158253902:
                        default:
                           throw new RuntimeException(new IOException());
                        case 432129109:
                           break label152;
                        case 1337998088:
                     }
                  }

                  if (var73 != null) {
                     var134 ^= 1212410502;
                     byte var84 = (byte)((var73.sameAs(var69)) ? 1 : 0);
                     if (var84 != (330596558 ^ var134)) {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                              case 103655995:
                                 var134 ^= 351941452;
                              case 524983216:
                                 break label162;
                              case 1643809397:
                                 break;
                              case 1716252343:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }
                     }

                     var134 ^= 1709619782;
                  } else {
                     label145:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                           case 36636188:
                              var134 ^= 765808832;
                              break label145;
                           case 873339823:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1559998655:
                              break label145;
                           case 2007824430:
                        }
                     }
                  }
               }

               long var108 = var66.chunk();
               this.refile(var108, var73, var69);
               if (var73 == null) {
                  var134 = 1537200799 ^ var134;
                  if (var69 != null) {
                     var134 = 1522343848 ^ var134;
                     List var80 = this.fresh;
                     boolean var81 = var80.add(var69);
                     var134 = 1883128893 ^ var134;
                  } else {
                     var134 = 713251733 ^ var134;
                  }
               } else {
                  label127:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                        case 88024885:
                           var134 ^= 1897695498;
                        case 385959427:
                           break label127;
                        case 555100548:
                           break;
                        case 888297530:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               }
            }

            var134 = syfpllerxlszxeld(var134, 735235099);
         }
      }
   }

   private void closeAdvanced() {
      int var9 = 30448551 ^ 1738821056 ^ 374332952;
      var9 = 1101418378 ^ var9;
      com.wimpyclient.s.a var3 = this.advanced;
      if (var3 != null) {
         var9 = 2071988426 ^ var9;
         com.wimpyclient.s.a var5 = this.advanced;
         var5.close();
         var9 = 1509313493 ^ var9;
      } else {
         var9 = 578175775 ^ var9;
      }

      Object var2 = null;
      this.advanced = (com.wimpyclient.s.a)var2;
   }

   private static void chat(Minecraft var0, String var1) {
      int var12 = 488769040 ^ 1987391522 ^ 1829447660;
      var12 = 519533911 ^ var12;
      LocalPlayer var5 = var0.player;
      if (var5 != null) {
         var12 = 1698117870 ^ var12;
         LocalPlayer var7 = var0.player;
         String var8 = "[Growth Debug] " + var1;
         MutableComponent var9 = Component.literal(var8);
         byte var4 = (byte)(2107399271 ^ var12);
         var7.displayClientMessage(var9, (var4 != 0));
         var12 = 420922808 ^ var12;
      } else {
         var12 = 2082602326 ^ var12;
      }
   }

   private static e$b currentConfig(ClientLevel var0) {
      int var18 = 679784619 ^ 1539250355 ^ 1829447660;
      var18 = 263789543 ^ var18;
      byte var2 = (byte)(294229011 ^ var18);
      int var8 = var0.getMinY();
      int var7 = Math.max(var2, var8);
      byte var9 = (byte)(294229043 ^ var18);
      int var11 = var0.getMaxY();
      int var10 = Math.min(var9, var11);
      byte var12 = (byte)(294229009 ^ var18);
      byte var5 = (byte)(294229014 ^ var18);
      x var6 = x.INSTANCE;
      int var15 = var6.growthDebugSensitivity;
      int var14 = Math.min(var5, var15);
      int var13 = Math.max(var12, var14);
      return new e$b(var7, var10, var13);
   }

   private void queueLoadedChunks(ClientLevel var1) {
      int var51 = 299738720 ^ 1786258266 ^ 374332952;
      var51 = 169218519 ^ var51;
      Minecraft var2 = Minecraft.getInstance();
      LocalPlayer var12 = var2.player;
      if (var12 == null) {
         var51 = 881734275 ^ var51;
      } else {
         var51 = 203210345 ^ var51;
         Options var15 = var2.options;
         OptionInstance var16 = var15.renderDistance();
         Object var17 = var16.get();
         Integer var18 = (Integer)var17;
         int var19 = var18;
         byte var3 = (byte)(1809904797 ^ var51);
         int var20 = var19 + var3;
         int var7 = var20;
         ChunkPos var22 = var12.chunkPosition();
         ChunkPos var8 = var22;
         int var24 = var22.x;
         int var25 = var24 - var20;
         int var9 = var25;
         var51 = 925728382 ^ var51;

         while (true) {
            int var36 = var8.x;
            int var37 = var36 + var7;
            if (var9 > var37) {
               var51 = 469233687 ^ var51;
               return;
            }

            var51 = 447426175 ^ var51;
            int var28 = var8.z;
            int var29 = var28 - var7;
            int var10 = var29;
            var51 = 1114573377 ^ var51;

            label48:
            while (true) {
               int var40 = var8.z;
               int var41 = var40 + var7;
               if (var10 > var41) {
                  label33:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var51)) {
                        case 63510503:
                           var51 ^= 1108326036;
                           break label33;
                        case 146359814:
                           break;
                        case 380377020:
                           break label33;
                        case 837768819:
                        default:
                           throw new RuntimeException();
                     }
                  }

                  var9 += 1174804553 ^ var51;
                  var51 = 449548970 ^ var51;
                  break;
               }

               var51 = 1718243211 ^ var51;
               byte var32 = (byte)((isLoaded(var1, var9, var10)) ? 1 : 0);
               if (var32 != (1650712919 ^ var51)) {
                  var51 = 1639477511 ^ var51;
                  long var44 = ChunkPos.asLong(var9, var10);
                  this.enqueue(var44);
                  var51 = 1217426450 ^ var51;
               } else {
                  var51 = 690488597 ^ var51;
               }

               var10 += 1263264835 ^ var51;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var51)) {
                     case 31670644:
                        var51 ^= 1329744542;
                        continue label48;
                     case 51164688:
                     default:
                        throw new RuntimeException();
                     case 1166320288:
                        break;
                     case 1999778903:
                        continue label48;
                  }
               }
            }
         }
      }
   }

   private void enqueue(long var1) {
      int var17 = 2083080103 ^ 807302830 ^ 374332952;
      var17 = 154882730 ^ var17;
      byte var6 = (byte)((this.scanning) ? 1 : 0);
      if (var6 != (1396948411 ^ var17)) {
         var17 = 1979495023 ^ var17;
         x var7 = x.INSTANCE;
         byte var8 = (byte)((var7.growthDebugAdvanced) ? 1 : 0);
         if (var8 == (650055636 ^ var17)) {
            var17 = 1584943121 ^ var17;
            LongOpenHashSet var10 = this.queued;
            byte var11 = (byte)((var10.add(var1)) ? 1 : 0);
            if (var11 != (2026332101 ^ var17)) {
               var17 = 1099326828 ^ var17;
               LongArrayFIFOQueue var13 = this.queue;
               var13.enqueue(var1);
               var17 = 2003065927 ^ var17;
            } else {
               var17 = 920795435 ^ var17;
            }
         } else {
            var17 = syfpllerxlszxeld(var17, 1754949946);
         }
      } else {
         var17 = 493280085 ^ var17;
      }
   }

   private static boolean isLoaded(ClientLevel var0, int var1, int var2) {
      int var10 = 94527788 ^ 354099923 ^ 1829447660;
      var10 = 1590990428 ^ var10;
      ClientChunkCache var6 = var0.getChunkSource();
      return var6.hasChunk(var1, var2);
   }

   private void refile(long var1, e$a var3, e$a var4) {
      int var30 = 1726491653 ^ 895048038 ^ 374332952;
      var30 = 29798776 ^ var30;
      if (var3 != null) {
         var30 = 1266767490 ^ var30;
         byte var9 = (byte)(-263801986 ^ var30);
         this.spread(var1, var3, var9);
         var30 = 765401840 ^ var30;
      } else {
         var30 = syfpllerxlszxeld(var30, 1713261682);
      }

      if (var4 != null) {
         var30 = 255543697 ^ var30;
         Long2ObjectOpenHashMap var16 = this.flagged;
         Object var17 = var16.put(var1, var4);
         byte var27 = (byte)(756883425 ^ var30);
         this.spread(var1, var4, var27);
         var30 = 923387990 ^ var30;
      } else {
         var30 = 1979440318 ^ var30;
         Long2ObjectOpenHashMap var13 = this.flagged;
         Object var14 = var13.remove(var1);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
               case 139431702:
                  return;
               case 171797292:
                  var30 = 1305042297 ^ var30;
                  return;
               case 1128643898:
                  break;
               case 1430615100:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private void spread(long var1, e$a var3, int var4) {
      int var59 = 1411963174 ^ 1507790424 ^ 374332952;
      var59 = 1588748330 ^ var59;
      long[] var42 = var3.stacks();
      int var43 = var42.length;
      int var17 = var4 * var43;
      int var9 = var17;
      int var19 = this.appliedRadius;
      int var10 = var19;
      int var22 = ChunkPos.getX(var1);
      int var11 = var22;
      int var25 = ChunkPos.getZ(var1);
      int var12 = var25;
      int var27 = var22 - var19;
      int var13 = var27;
      var59 = 1449117050 ^ var59;

      while (true) {
         int var46 = var11 + var10;
         if (var13 > var46) {
            var59 = 100085627 ^ var59;
            return;
         }

         var59 = 200754539 ^ var59;
         int var30 = var12 - var10;
         int var14 = var30;
         var59 = 890287052 ^ var59;

         while (true) {
            int var49 = var12 + var10;
            if (var14 > var49) {
               var59 = syfpllerxlszxeld(var59, 691550517);
               var13 += 76178341 ^ var59;
               var59 = syfpllerxlszxeld(var59, 400543634);
               break;
            }

            var59 = 998166006 ^ var59;
            long var33 = ChunkPos.asLong(var13, var14);
            Long2IntOpenHashMap var36 = this.heat;
            int var37 = var36.addTo(var33, var9);
            int var38 = var37 + var9;
            if (var38 == (382506855 ^ var59)) {
               var59 = 1204393946 ^ var59;
               Long2IntOpenHashMap var40 = this.heat;
               int var41 = var40.remove(var33);
               var59 = 1664451438 ^ var59;
            } else {
               var59 = 620500148 ^ var59;
            }

            var14 += 842040274 ^ var59;
            var59 = 528668994 ^ var59;
         }
      }
   }

   private LongOpenHashSet computeShown(ClientLevel var1) {
      int var42 = 991935449 ^ 295688577 ^ 374332952;
      var42 = 1032334456 ^ var42;
      Long2IntOpenHashMap var2 = new Long2IntOpenHashMap();
      Long2IntOpenHashMap var6 = var2;
      Long2IntOpenHashMap var12 = this.heat;
      it.unimi.dsi.fastutil.longs.Long2IntMap.FastEntrySet var13 = var12.long2IntEntrySet();
      ObjectIterator var14 = var13.iterator();
      ObjectIterator var7 = var14;
      var42 = 314186623 ^ var42;

      while (true) {
         byte var16 = (byte)((var7.hasNext()) ? 1 : 0);
         if (var16 != (335383367 ^ var42)) {
            var42 = 40648709 ^ var42;
            Object var18 = var7.next();
            it.unimi.dsi.fastutil.longs.Long2IntMap.Entry var19 = (it.unimi.dsi.fastutil.longs.Long2IntMap.Entry)var18;
            long var21 = var19.getLongKey();
            int var33 = ChunkPos.getX(var21);
            int var36 = ChunkPos.getZ(var21);
            byte var24 = (byte)((isLoaded(var1, var33, var36)) ? 1 : 0);
            if (var24 != (294767426 ^ var42)) {
               var42 = 1026684361 ^ var42;
               int var39 = var19.getIntValue();
               int var26 = var6.put(var21, var39);
               var42 = 530223728 ^ var42;
            } else {
               label28:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                     case 34236510:
                        var42 ^= 581658553;
                     case 944318227:
                        break label28;
                     case 1114352500:
                     default:
                        throw new IllegalStateException();
                     case 1828736335:
                  }
               }
            }
         } else {
            var42 = syfpllerxlszxeld(var42, 1261431130);
            int var28 = this.appliedRadius;
            LongOpenHashSet var30;
            if (var28 == (1490182685 ^ var42)) {
               var42 = 1320721190 ^ var42;
               LongSet var38 = var6.keySet();
               var30 = new LongOpenHashSet(var38);
               var42 = 1487546938 ^ var42;
            } else {
               label36:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                     case 202884810:
                        var42 ^= 701756035;
                     case 598543254:
                        break label36;
                     case 730135403:
                     default:
                        throw new IllegalStateException();
                     case 1600887846:
                  }
               }

               var30 = hottestPerPatch(var6);
               var42 = 1069630367 ^ var42;
            }

            return var30;
         }

         var42 = 549922748 ^ var42;
      }
   }

   private static LongOpenHashSet hottestPerPatch(Long2IntOpenHashMap var0) {
      int var106 = 367888840 ^ 544062987 ^ 1829447660;
      var106 = 223199259 ^ var106;
      LongOpenHashSet var1 = new LongOpenHashSet();
      LongOpenHashSet var4 = var1;
      LongOpenHashSet var18 = new LongOpenHashSet();
      LongOpenHashSet var5 = var18;
      LongArrayList var19 = new LongArrayList();
      LongArrayList var6 = var19;
      LongArrayFIFOQueue var20 = new LongArrayFIFOQueue();
      LongArrayFIFOQueue var7 = var20;
      LongSet var22 = var0.keySet();
      LongIterator var23 = var22.iterator();
      LongIterator var8 = var23;
      var106 = 678106030 ^ var106;

      while (true) {
         label129:
         while (true) {
            byte var25 = (byte)((var8.hasNext()) ? 1 : 0);
            if (var25 != (2108539802 ^ var106)) {
               var106 = 997149562 ^ var106;
               Object var27 = var8.next();
               Long var28 = (Long)var27;
               long var29 = var28;
               byte var32 = (byte)((var5.add(var29)) ? 1 : 0);
               if (var32 == (1187154144 ^ var106)) {
                  var106 = 1738182875 ^ var106;
                  var106 = syfpllerxlszxeld(var106, 1559616417);
                  continue;
               }

               var106 = 2094380033 ^ var106;
               var6.clear();
               var7.enqueue(var29);
               byte var35 = (byte)(974601441 ^ var106);
               int var11 = var35;
               var106 = 1017589787 ^ var106;

               label118:
               while (true) {
                  byte var37 = (byte)((var7.isEmpty()) ? 1 : 0);
                  if (var37 != (112200954 ^ var106)) {
                     var106 = 259950792 ^ var106;
                     byte var38 = (byte)(164529202 ^ var106);
                     int var12 = var38;
                     var106 = 1241755700 ^ var106;

                     while (true) {
                        int var74 = var6.size();
                        if (var12 >= var74) {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                                 case 56481542:
                                    var106 ^= 322693985;
                                    break label129;
                                 case 93359197:
                                    break;
                                 case 170738136:
                                 default:
                                    throw new RuntimeException();
                                 case 1813445921:
                                    break label129;
                              }
                           }
                        }

                        var106 = 928098655 ^ var106;
                        long var76 = var6.getLong(var12);
                        int var41 = var0.get(var76);
                        if (var41 == var11) {
                           var106 = 2064067223 ^ var106;
                           long var80 = var6.getLong(var12);
                           boolean var43 = var4.add(var80);
                           var106 = 473202309 ^ var106;
                        } else {
                           label60:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                                 case 32441408:
                                    var106 ^= 1731417106;
                                 case 684740772:
                                    break label60;
                                 case 1622474476:
                                 default:
                                    throw new RuntimeException();
                                 case 1776052285:
                              }
                           }
                        }

                        var12 += 330287434 ^ var106;
                        var106 = syfpllerxlszxeld(var106, 1348664653);
                     }
                  }

                  var106 = 1172252968 ^ var106;
                  long var45 = var7.dequeueLong();
                  boolean var48 = var6.add(var45);
                  int var85 = var0.get(var45);
                  int var50 = Math.max(var11, var85);
                  var11 = var50;
                  int var53 = ChunkPos.getX(var45);
                  int var13 = var53;
                  int var56 = ChunkPos.getZ(var45);
                  int var14 = var56;
                  byte var57 = (byte)(1131357650 ^ var106);
                  int var15 = var57;
                  var106 = 1459221726 ^ var106;

                  label104:
                  while (true) {
                     byte var86 = (byte)(362205448 ^ var106);
                     if (var15 >= var86) {
                        var106 = syfpllerxlszxeld(var106, 2039524714);

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                              case 21822723:
                                 var106 ^= 1790341276;
                              case 424620746:
                                 continue label118;
                              case 1165074441:
                                 break;
                              case 1804578140:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     }

                     var106 ^= 1810098864;
                     int[] var87 = SIDE_X;
                     int var88 = var87[var15];
                     int var60 = var13 + var88;
                     int[] var101 = SIDE_Z;
                     int var102 = var101[var15];
                     int var90 = var14 + var102;
                     long var61 = ChunkPos.asLong(var60, var90);
                     byte var64 = (byte)((var0.containsKey(var61)) ? 1 : 0);
                     if (var64 != (2121612220 ^ var106)) {
                        var106 ^= 76947494;
                        byte var66 = (byte)((var5.add(var61)) ? 1 : 0);
                        if (var66 != (2061704090 ^ var106)) {
                           var106 = 1982908326 ^ var106;
                           var7.enqueue(var61);
                           var106 = 1125647095 ^ var106;
                        } else {
                           label78:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                                 case 236486553:
                                    var106 ^= 891864401;
                                    break label78;
                                 case 515754531:
                                 default:
                                    throw new RuntimeException();
                                 case 1647153864:
                                    break;
                                 case 1706889096:
                                    break label78;
                              }
                           }
                        }
                     } else {
                        label89:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                              case 84106697:
                                 var106 ^= 834594167;
                                 break label89;
                              case 93618089:
                              default:
                                 throw new RuntimeException();
                              case 868738293:
                                 break label89;
                              case 1004865235:
                           }
                        }
                     }

                     var15 += 1338760906 ^ var106;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                           case 9844018:
                              break;
                           case 177909858:
                              var106 ^= 1516048327;
                              continue label104;
                           case 1096616495:
                           default:
                              throw new RuntimeException();
                           case 1907269793:
                              continue label104;
                        }
                     }
                  }
               }
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                  case 58775383:
                     var106 = 1497642659 ^ var106;
                     return var4;
                  case 127850116:
                     break;
                  case 194683077:
                  default:
                     throw new RuntimeException();
                  case 2110234450:
                     return var4;
               }
            }
         }

         var106 = 760945917 ^ var106;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private e$a scan(ClientLevel var1, int var2, int var3, e$b var4) {
      int var231 = 1737736847 ^ 1036856903 ^ 374332952;
      var231 = 1910595261 ^ var231;
      byte var5 = (byte)(-1039166574 ^ var231);
      int var12 = var5;
      var231 = 2101399017 ^ var231;

      e$a var224;
      label1835: {
         e$a var227;
         label1714:
         while (true) {
            byte var6 = (byte)(1085317509 ^ var231);
            if (var12 <= var6) {
               var231 = 967989314 ^ var231;
               byte var128 = (byte)(-2030238151 ^ var231);
               int var225 = var128;
               var231 = 849148483 ^ var231;

               while (true) {
                  byte var182 = (byte)(1268646788 ^ var231);
                  if (var225 > var182) {
                     label237:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var231)) {
                           case 42102095:
                              var231 ^= 1569755900;
                              break label237;
                           case 308562510:
                           default:
                              throw new IllegalStateException();
                           case 1037290831:
                              break;
                           case 2057767721:
                              break label237;
                        }
                     }

                     var12 += 370053496 ^ var231;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var231)) {
                           case 180105172:
                              var231 ^= 1455304957;
                           case 198292738:
                              continue label1714;
                           case 491277892:
                           default:
                              throw new IllegalStateException();
                           case 1927201011:
                        }
                     }
                  }

                  var231 = 542889387 ^ var231;
                  LevelChunk[] var131 = this.around;
                  byte var200 = (byte)(1808127535 ^ var231);
                  int var184 = var12 + var200;
                  byte var201 = (byte)(1808127533 ^ var231);
                  int var185 = var184 * var201;
                  int var186 = var185 + var225;
                  byte var203 = (byte)(1808127535 ^ var231);
                  int var187 = var186 + var203;
                  ClientChunkCache var205 = var1.getChunkSource();
                  int var214 = var2 + var12;
                  int var218 = var3 + var225;
                  LevelChunk var206 = var205.getChunkNow(var214, var218);
                  var131[var187] = var206;
                  var225 += 1808127535 ^ var231;
                  var231 = 542889387 ^ var231;
               }
            }

            var231 = 718715374 ^ var231;
            byte var133 = (byte)(1785075818 ^ var231);
            this.sawBlob = (var133 != 0);
            byte var7 = (byte)(1785075822 ^ var231);
            int var135 = var2 << var7;
            this.scanX = var135;
            byte var188 = (byte)(1785075822 ^ var231);
            int var137 = var3 << var188;
            this.scanZ = var137;
            int var139 = var4.stackHeight();
            this.keepHeight = var139;
            byte var140 = (byte)(1785075818 ^ var231);
            this.keptStackCount = var140;
            byte var141 = (byte)(1785075818 ^ var231);
            this.tallest = var141;
            long var142 = 0L;
            this.bottom = var142;
            byte var144 = (byte)(1785075818 ^ var231);
            this.unsure = (var144 != 0);
            var231 = 395591741 ^ var231;

            Throwable var10000;
            label1723: {
               LevelChunk var223;
               try {
                  LevelChunk[] var38 = this.around;
                  byte var145 = (byte)(2113034323 ^ var231);
                  LevelChunk var39 = var38[var145];
                  var223 = var39;
                  if (var39 == null) {
                     var231 ^= 1447177828;
                     e$a var124 = UNDECIDED;
                     var224 = var124;
                     var231 ^= 2092143601;
                     break label1835;
                  }
               } catch (Throwable var234) {
                  var10000 = var234;
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var231)) {
                     case -275594565:
                        var231 = syfpllerxlszxeld(var231, 1769226214);
                        break label1723;
                     case 1568911769:
                        var231 = 1060508034 ^ var231;
                        break label1723;
                     default:
                        throw new RuntimeException(new IOException("Error in hash"));
                  }
               }

               var231 = 277115134 ^ var231;

               label1704: {
                  label1703: {
                     label1702: {
                        label1701: {
                           label1700: {
                              label1699: {
                                 label1698: {
                                    label1697: {
                                       label1696: {
                                          label1695: {
                                             label1694: {
                                                label1693: {
                                                   label1692: {
                                                      label1691: {
                                                         label1690: {
                                                            label1689: {
                                                               label1688: {
                                                                  label1687: {
                                                                     label1686: {
                                                                        label1685: {
                                                                           label1684: {
                                                                              label1683: {
                                                                                 label1682: {
                                                                                    label1681: {
                                                                                       label1680: {
                                                                                          label1679: {
                                                                                             label1678: {
                                                                                                label1677: {
                                                                                                   label1676: {
                                                                                                      label1675: {
                                                                                                         label1674: {
                                                                                                            label1673: {
                                                                                                               label1672: {
                                                                                                                  label1671: {
                                                                                                                     label1670: {
                                                                                                                        label1669: {
                                                                                                                           label1668: {
                                                                                                                              label1667: {
                                                                                                                                 label1666: {
                                                                                                                                    label1665: {
                                                                                                                                       label1664: {
                                                                                                                                          label1663: {
                                                                                                                                             label1662: {
                                                                                                                                                label1661: {
                                                                                                                                                   label1660: {
                                                                                                                                                      label1758: {
                                                                                                                                                         LevelChunkSection[] var13;
                                                                                                                                                         int var14;
                                                                                                                                                         byte var15;
                                                                                                                                                         int var16;
                                                                                                                                                         try {
                                                                                                                                                            LevelChunkSection[] var42 = var223.getSections();
                                                                                                                                                            var13 = var42;
                                                                                                                                                            int var44 = var223.getMinSectionY();
                                                                                                                                                            var14 = var44;
                                                                                                                                                            int[] var46 = this.stackTop;
                                                                                                                                                            int var146 = -311023447
                                                                                                                                                               ^ var231;
                                                                                                                                                            Arrays.fill(
                                                                                                                                                               var46,
                                                                                                                                                               var146
                                                                                                                                                            );
                                                                                                                                                            byte var47 = (byte)(
                                                                                                                                                               1836460200
                                                                                                                                                                  ^ var231
                                                                                                                                                            );
                                                                                                                                                            var15 = var47;
                                                                                                                                                            byte var48 = (byte)(
                                                                                                                                                               1836460201
                                                                                                                                                                  ^ var231
                                                                                                                                                            );
                                                                                                                                                            var16 = var48;
                                                                                                                                                            var231 ^= 1003004433;
                                                                                                                                                         } catch (Throwable var246) {
                                                                                                                                                            var10000 = var246;
                                                                                                                                                            switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                               var231
                                                                                                                                                            )) {
                                                                                                                                                               case -2021649678:
                                                                                                                                                                  break label1680;
                                                                                                                                                               case -1938794271:
                                                                                                                                                                  break label1694;
                                                                                                                                                               case -1862190239:
                                                                                                                                                                  break label1677;
                                                                                                                                                               case -1853829655:
                                                                                                                                                                  break label1667;
                                                                                                                                                               case -1831506759:
                                                                                                                                                                  break label1696;
                                                                                                                                                               case -1722804742:
                                                                                                                                                                  break label1660;
                                                                                                                                                               case -1672950864:
                                                                                                                                                                  break label1704;
                                                                                                                                                               case -1665149061:
                                                                                                                                                                  break label1697;
                                                                                                                                                               case -1546530294:
                                                                                                                                                                  break label1672;
                                                                                                                                                               case -1476848541:
                                                                                                                                                                  break label1683;
                                                                                                                                                               case -1409350039:
                                                                                                                                                                  break label1758;
                                                                                                                                                               case -1263565367:
                                                                                                                                                                  break label1687;
                                                                                                                                                               case -1242278462:
                                                                                                                                                                  break label1661;
                                                                                                                                                               case -1239724632:
                                                                                                                                                                  break label1701;
                                                                                                                                                               case -1215235128:
                                                                                                                                                                  break label1702;
                                                                                                                                                               case -1037556935:
                                                                                                                                                                  break label1693;
                                                                                                                                                               case -1036705118:
                                                                                                                                                                  break label1679;
                                                                                                                                                               case -1016315159:
                                                                                                                                                                  break label1689;
                                                                                                                                                               case -695463974:
                                                                                                                                                                  break label1686;
                                                                                                                                                               case -483158007:
                                                                                                                                                                  break label1665;
                                                                                                                                                               case -451298125:
                                                                                                                                                                  break label1682;
                                                                                                                                                               case -247506944:
                                                                                                                                                                  break label1692;
                                                                                                                                                               case 426525722:
                                                                                                                                                                  break label1681;
                                                                                                                                                               case 437687496:
                                                                                                                                                                  break label1675;
                                                                                                                                                               case 470554554:
                                                                                                                                                                  break label1673;
                                                                                                                                                               case 558675880:
                                                                                                                                                                  break label1691;
                                                                                                                                                               case 793970219:
                                                                                                                                                                  break label1699;
                                                                                                                                                               case 831781507:
                                                                                                                                                                  break label1664;
                                                                                                                                                               case 1072522138:
                                                                                                                                                                  break label1688;
                                                                                                                                                               case 1079482409:
                                                                                                                                                                  break label1671;
                                                                                                                                                               case 1116075312:
                                                                                                                                                                  break label1663;
                                                                                                                                                               case 1204272394:
                                                                                                                                                                  break label1674;
                                                                                                                                                               case 1375291912:
                                                                                                                                                                  break label1668;
                                                                                                                                                               case 1412274147:
                                                                                                                                                                  break label1670;
                                                                                                                                                               case 1456331563:
                                                                                                                                                                  break label1676;
                                                                                                                                                               case 1461405355:
                                                                                                                                                                  break label1678;
                                                                                                                                                               case 1482069162:
                                                                                                                                                                  break label1669;
                                                                                                                                                               case 1709059979:
                                                                                                                                                                  break label1698;
                                                                                                                                                               case 1802811963:
                                                                                                                                                                  break label1690;
                                                                                                                                                               case 1806779723:
                                                                                                                                                                  break label1695;
                                                                                                                                                               case 1807565554:
                                                                                                                                                                  break label1703;
                                                                                                                                                               case 1815357832:
                                                                                                                                                                  break label1700;
                                                                                                                                                               case 1897586258:
                                                                                                                                                                  break label1684;
                                                                                                                                                               case 2012823963:
                                                                                                                                                                  break label1685;
                                                                                                                                                               case 2065282114:
                                                                                                                                                                  break label1666;
                                                                                                                                                               case 2079860872:
                                                                                                                                                                  break label1662;
                                                                                                                                                               default:
                                                                                                                                                                  throw new RuntimeException(new IOException(
                                                                                                                                                                     "Error in hash"
                                                                                                                                                                  ));
                                                                                                                                                            }
                                                                                                                                                         }

                                                                                                                                                         while (true) {
                                                                                                                                                            label1655: {
                                                                                                                                                               label1726: {
                                                                                                                                                                  LevelChunkSection var17;
                                                                                                                                                                  label1653: {
                                                                                                                                                                     try {
                                                                                                                                                                        int var148 = var13.length;
                                                                                                                                                                        if (var16
                                                                                                                                                                           >= var148
                                                                                                                                                                           )
                                                                                                                                                                         {
                                                                                                                                                                           break;
                                                                                                                                                                        }

                                                                                                                                                                        var231 ^= 507936025;
                                                                                                                                                                        LevelChunkSection var51 = var13[var16];
                                                                                                                                                                        var17 = var51;
                                                                                                                                                                        if (var51
                                                                                                                                                                           != null
                                                                                                                                                                           )
                                                                                                                                                                         {
                                                                                                                                                                           var231 ^= 1165914768;
                                                                                                                                                                           byte var54 = (byte)((var51.hasOnlyAir()) ? 1 : 0);
                                                                                                                                                                           if (var54
                                                                                                                                                                              == (
                                                                                                                                                                                 226919729
                                                                                                                                                                                    ^ var231
                                                                                                                                                                              )
                                                                                                                                                                              )
                                                                                                                                                                            {
                                                                                                                                                                              break label1653;
                                                                                                                                                                           }

                                                                                                                                                                           var231 ^= 904596844;
                                                                                                                                                                           break label1726;
                                                                                                                                                                        }
                                                                                                                                                                     } catch (Throwable var257) {
                                                                                                                                                                        var10000 = var257;
                                                                                                                                                                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                           var231
                                                                                                                                                                        )) {
                                                                                                                                                                           case -2021649678:
                                                                                                                                                                              break label1680;
                                                                                                                                                                           case -1938794271:
                                                                                                                                                                              break label1694;
                                                                                                                                                                           case -1862190239:
                                                                                                                                                                              break label1677;
                                                                                                                                                                           case -1853829655:
                                                                                                                                                                              break label1667;
                                                                                                                                                                           case -1831506759:
                                                                                                                                                                              break label1696;
                                                                                                                                                                           case -1722804742:
                                                                                                                                                                              break label1660;
                                                                                                                                                                           case -1672950864:
                                                                                                                                                                              break label1704;
                                                                                                                                                                           case -1665149061:
                                                                                                                                                                              break label1697;
                                                                                                                                                                           case -1546530294:
                                                                                                                                                                              break label1672;
                                                                                                                                                                           case -1476848541:
                                                                                                                                                                              break label1683;
                                                                                                                                                                           case -1409350039:
                                                                                                                                                                              break label1758;
                                                                                                                                                                           case -1263565367:
                                                                                                                                                                              break label1687;
                                                                                                                                                                           case -1242278462:
                                                                                                                                                                              break label1661;
                                                                                                                                                                           case -1239724632:
                                                                                                                                                                              break label1701;
                                                                                                                                                                           case -1215235128:
                                                                                                                                                                              break label1702;
                                                                                                                                                                           case -1037556935:
                                                                                                                                                                              break label1693;
                                                                                                                                                                           case -1036705118:
                                                                                                                                                                              break label1679;
                                                                                                                                                                           case -1016315159:
                                                                                                                                                                              break label1689;
                                                                                                                                                                           case -695463974:
                                                                                                                                                                              break label1686;
                                                                                                                                                                           case -483158007:
                                                                                                                                                                              break label1665;
                                                                                                                                                                           case -451298125:
                                                                                                                                                                              break label1682;
                                                                                                                                                                           case -247506944:
                                                                                                                                                                              break label1692;
                                                                                                                                                                           case 426525722:
                                                                                                                                                                              break label1681;
                                                                                                                                                                           case 437687496:
                                                                                                                                                                              break label1675;
                                                                                                                                                                           case 470554554:
                                                                                                                                                                              break label1673;
                                                                                                                                                                           case 558675880:
                                                                                                                                                                              break label1691;
                                                                                                                                                                           case 793970219:
                                                                                                                                                                              break label1699;
                                                                                                                                                                           case 831781507:
                                                                                                                                                                              break label1664;
                                                                                                                                                                           case 1072522138:
                                                                                                                                                                              break label1688;
                                                                                                                                                                           case 1079482409:
                                                                                                                                                                              break label1671;
                                                                                                                                                                           case 1116075312:
                                                                                                                                                                              break label1663;
                                                                                                                                                                           case 1204272394:
                                                                                                                                                                              break label1674;
                                                                                                                                                                           case 1375291912:
                                                                                                                                                                              break label1668;
                                                                                                                                                                           case 1412274147:
                                                                                                                                                                              break label1670;
                                                                                                                                                                           case 1456331563:
                                                                                                                                                                              break label1676;
                                                                                                                                                                           case 1461405355:
                                                                                                                                                                              break label1678;
                                                                                                                                                                           case 1482069162:
                                                                                                                                                                              break label1669;
                                                                                                                                                                           case 1709059979:
                                                                                                                                                                              break label1698;
                                                                                                                                                                           case 1802811963:
                                                                                                                                                                              break label1690;
                                                                                                                                                                           case 1806779723:
                                                                                                                                                                              break label1695;
                                                                                                                                                                           case 1807565554:
                                                                                                                                                                              break label1703;
                                                                                                                                                                           case 1815357832:
                                                                                                                                                                              break label1700;
                                                                                                                                                                           case 1897586258:
                                                                                                                                                                              break label1684;
                                                                                                                                                                           case 2012823963:
                                                                                                                                                                              break label1685;
                                                                                                                                                                           case 2065282114:
                                                                                                                                                                              break label1666;
                                                                                                                                                                           case 2079860872:
                                                                                                                                                                              break label1662;
                                                                                                                                                                           default:
                                                                                                                                                                              throw new RuntimeException(new IOException(
                                                                                                                                                                                 "Error in hash"
                                                                                                                                                                              ));
                                                                                                                                                                        }
                                                                                                                                                                     }

                                                                                                                                                                     while (true) {
                                                                                                                                                                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                           var231
                                                                                                                                                                        )) {
                                                                                                                                                                           case 224532287:
                                                                                                                                                                              var231 ^= 578635101;
                                                                                                                                                                              break label1655;
                                                                                                                                                                           case 1451420857:
                                                                                                                                                                           default:
                                                                                                                                                                              throw new IllegalStateException();
                                                                                                                                                                           case 1465853897:
                                                                                                                                                                              break label1655;
                                                                                                                                                                           case 1655854189:
                                                                                                                                                                        }
                                                                                                                                                                     }
                                                                                                                                                                  }

                                                                                                                                                                  label1635:
                                                                                                                                                                  while (true) {
                                                                                                                                                                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                        var231
                                                                                                                                                                     )) {
                                                                                                                                                                        case 161561594:
                                                                                                                                                                        default:
                                                                                                                                                                           throw new IllegalStateException();
                                                                                                                                                                        case 171224968:
                                                                                                                                                                           var231 ^= 902005078;
                                                                                                                                                                           break label1635;
                                                                                                                                                                        case 805011517:
                                                                                                                                                                           break;
                                                                                                                                                                        case 1062915480:
                                                                                                                                                                           break label1635;
                                                                                                                                                                     }
                                                                                                                                                                  }

                                                                                                                                                                  label1628: {
                                                                                                                                                                     label1728: {
                                                                                                                                                                        int var18;
                                                                                                                                                                        try {
                                                                                                                                                                           int var60 = var14
                                                                                                                                                                              + var16;
                                                                                                                                                                           byte var152 = (byte)(
                                                                                                                                                                              944047203
                                                                                                                                                                                 ^ var231
                                                                                                                                                                           );
                                                                                                                                                                           int var61 = var60
                                                                                                                                                                              << var152;
                                                                                                                                                                           var18 = var61;
                                                                                                                                                                           byte var153 = (byte)(
                                                                                                                                                                              944047208
                                                                                                                                                                                 ^ var231
                                                                                                                                                                           );
                                                                                                                                                                           int var63 = var61
                                                                                                                                                                              + var153;
                                                                                                                                                                           int var155 = var4.minY();
                                                                                                                                                                           if (var63
                                                                                                                                                                              < var155
                                                                                                                                                                              )
                                                                                                                                                                            {
                                                                                                                                                                              break label1728;
                                                                                                                                                                           }

                                                                                                                                                                           var231 ^= 175447514;
                                                                                                                                                                           int var157 = var4.maxY();
                                                                                                                                                                           if (var61
                                                                                                                                                                              > var157
                                                                                                                                                                              )
                                                                                                                                                                            {
                                                                                                                                                                              var231 ^= 1409443565;
                                                                                                                                                                              break label1628;
                                                                                                                                                                           }
                                                                                                                                                                        } catch (Throwable var256) {
                                                                                                                                                                           var10000 = var256;
                                                                                                                                                                           switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                              var231
                                                                                                                                                                           )) {
                                                                                                                                                                              case -2021649678:
                                                                                                                                                                                 break label1680;
                                                                                                                                                                              case -1938794271:
                                                                                                                                                                                 break label1694;
                                                                                                                                                                              case -1862190239:
                                                                                                                                                                                 break label1677;
                                                                                                                                                                              case -1853829655:
                                                                                                                                                                                 break label1667;
                                                                                                                                                                              case -1831506759:
                                                                                                                                                                                 break label1696;
                                                                                                                                                                              case -1722804742:
                                                                                                                                                                                 break label1660;
                                                                                                                                                                              case -1672950864:
                                                                                                                                                                                 break label1704;
                                                                                                                                                                              case -1665149061:
                                                                                                                                                                                 break label1697;
                                                                                                                                                                              case -1546530294:
                                                                                                                                                                                 break label1672;
                                                                                                                                                                              case -1476848541:
                                                                                                                                                                                 break label1683;
                                                                                                                                                                              case -1409350039:
                                                                                                                                                                                 break label1758;
                                                                                                                                                                              case -1263565367:
                                                                                                                                                                                 break label1687;
                                                                                                                                                                              case -1242278462:
                                                                                                                                                                                 break label1661;
                                                                                                                                                                              case -1239724632:
                                                                                                                                                                                 break label1701;
                                                                                                                                                                              case -1215235128:
                                                                                                                                                                                 break label1702;
                                                                                                                                                                              case -1037556935:
                                                                                                                                                                                 break label1693;
                                                                                                                                                                              case -1036705118:
                                                                                                                                                                                 break label1679;
                                                                                                                                                                              case -1016315159:
                                                                                                                                                                                 break label1689;
                                                                                                                                                                              case -695463974:
                                                                                                                                                                                 break label1686;
                                                                                                                                                                              case -483158007:
                                                                                                                                                                                 break label1665;
                                                                                                                                                                              case -451298125:
                                                                                                                                                                                 break label1682;
                                                                                                                                                                              case -247506944:
                                                                                                                                                                                 break label1692;
                                                                                                                                                                              case 426525722:
                                                                                                                                                                                 break label1681;
                                                                                                                                                                              case 437687496:
                                                                                                                                                                                 break label1675;
                                                                                                                                                                              case 470554554:
                                                                                                                                                                                 break label1673;
                                                                                                                                                                              case 558675880:
                                                                                                                                                                                 break label1691;
                                                                                                                                                                              case 793970219:
                                                                                                                                                                                 break label1699;
                                                                                                                                                                              case 831781507:
                                                                                                                                                                                 break label1664;
                                                                                                                                                                              case 1072522138:
                                                                                                                                                                                 break label1688;
                                                                                                                                                                              case 1079482409:
                                                                                                                                                                                 break label1671;
                                                                                                                                                                              case 1116075312:
                                                                                                                                                                                 break label1663;
                                                                                                                                                                              case 1204272394:
                                                                                                                                                                                 break label1674;
                                                                                                                                                                              case 1375291912:
                                                                                                                                                                                 break label1668;
                                                                                                                                                                              case 1412274147:
                                                                                                                                                                                 break label1670;
                                                                                                                                                                              case 1456331563:
                                                                                                                                                                                 break label1676;
                                                                                                                                                                              case 1461405355:
                                                                                                                                                                                 break label1678;
                                                                                                                                                                              case 1482069162:
                                                                                                                                                                                 break label1669;
                                                                                                                                                                              case 1709059979:
                                                                                                                                                                                 break label1698;
                                                                                                                                                                              case 1802811963:
                                                                                                                                                                                 break label1690;
                                                                                                                                                                              case 1806779723:
                                                                                                                                                                                 break label1695;
                                                                                                                                                                              case 1807565554:
                                                                                                                                                                                 break label1703;
                                                                                                                                                                              case 1815357832:
                                                                                                                                                                                 break label1700;
                                                                                                                                                                              case 1897586258:
                                                                                                                                                                                 break label1684;
                                                                                                                                                                              case 2012823963:
                                                                                                                                                                                 break label1685;
                                                                                                                                                                              case 2065282114:
                                                                                                                                                                                 break label1666;
                                                                                                                                                                              case 2079860872:
                                                                                                                                                                                 break label1662;
                                                                                                                                                                              default:
                                                                                                                                                                                 throw new RuntimeException(new IOException(
                                                                                                                                                                                    "Error in hash"
                                                                                                                                                                                 ));
                                                                                                                                                                           }
                                                                                                                                                                        }

                                                                                                                                                                        var231 = syfpllerxlszxeld(
                                                                                                                                                                           var231,
                                                                                                                                                                           6992938
                                                                                                                                                                        );

                                                                                                                                                                        int var19;
                                                                                                                                                                        int var20;
                                                                                                                                                                        label1615: {
                                                                                                                                                                           byte var107;
                                                                                                                                                                           label1730: {
                                                                                                                                                                              label1731: {
                                                                                                                                                                                 label1612: {
                                                                                                                                                                                    try {
                                                                                                                                                                                       int var66 = var4.minY();
                                                                                                                                                                                       int var67 = var66
                                                                                                                                                                                          - var18;
                                                                                                                                                                                       byte var159 = (byte)(
                                                                                                                                                                                          844803479
                                                                                                                                                                                             ^ var231
                                                                                                                                                                                       );
                                                                                                                                                                                       int var68 = Math.max(
                                                                                                                                                                                          var67,
                                                                                                                                                                                          var159
                                                                                                                                                                                       );
                                                                                                                                                                                       var19 = var68;
                                                                                                                                                                                       int var70 = var4.maxY();
                                                                                                                                                                                       int var71 = var70
                                                                                                                                                                                          - var18;
                                                                                                                                                                                       byte var161 = (byte)(
                                                                                                                                                                                          844803480
                                                                                                                                                                                             ^ var231
                                                                                                                                                                                       );
                                                                                                                                                                                       int var72 = Math.min(
                                                                                                                                                                                          var71,
                                                                                                                                                                                          var161
                                                                                                                                                                                       );
                                                                                                                                                                                       var20 = var72;
                                                                                                                                                                                       if (var15
                                                                                                                                                                                          == (
                                                                                                                                                                                             844803479
                                                                                                                                                                                                ^ var231
                                                                                                                                                                                          )
                                                                                                                                                                                          )
                                                                                                                                                                                        {
                                                                                                                                                                                          break label1731;
                                                                                                                                                                                       }

                                                                                                                                                                                       var231 ^= 1185255195;
                                                                                                                                                                                       byte var75 = (byte)((hasBlocks(
                                                                                                                                                                                          var17,
                                                                                                                                                                                          var68,
                                                                                                                                                                                          var72
                                                                                                                                                                                       )) ? 1 : 0);
                                                                                                                                                                                       if (var75
                                                                                                                                                                                          != (
                                                                                                                                                                                             1962877580
                                                                                                                                                                                                ^ var231
                                                                                                                                                                                          )
                                                                                                                                                                                          )
                                                                                                                                                                                        {
                                                                                                                                                                                          break label1612;
                                                                                                                                                                                       }

                                                                                                                                                                                       var231 ^= 2008936469;
                                                                                                                                                                                       var107 = (byte)(
                                                                                                                                                                                          54710936
                                                                                                                                                                                             ^ var231
                                                                                                                                                                                       );
                                                                                                                                                                                    } catch (Throwable var255) {
                                                                                                                                                                                       var10000 = var255;
                                                                                                                                                                                       switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                          var231
                                                                                                                                                                                       )) {
                                                                                                                                                                                          case -2021649678:
                                                                                                                                                                                             break label1680;
                                                                                                                                                                                          case -1938794271:
                                                                                                                                                                                             break label1694;
                                                                                                                                                                                          case -1862190239:
                                                                                                                                                                                             break label1677;
                                                                                                                                                                                          case -1853829655:
                                                                                                                                                                                             break label1667;
                                                                                                                                                                                          case -1831506759:
                                                                                                                                                                                             break label1696;
                                                                                                                                                                                          case -1722804742:
                                                                                                                                                                                             break label1660;
                                                                                                                                                                                          case -1672950864:
                                                                                                                                                                                             break label1704;
                                                                                                                                                                                          case -1665149061:
                                                                                                                                                                                             break label1697;
                                                                                                                                                                                          case -1546530294:
                                                                                                                                                                                             break label1672;
                                                                                                                                                                                          case -1476848541:
                                                                                                                                                                                             break label1683;
                                                                                                                                                                                          case -1409350039:
                                                                                                                                                                                             break label1758;
                                                                                                                                                                                          case -1263565367:
                                                                                                                                                                                             break label1687;
                                                                                                                                                                                          case -1242278462:
                                                                                                                                                                                             break label1661;
                                                                                                                                                                                          case -1239724632:
                                                                                                                                                                                             break label1701;
                                                                                                                                                                                          case -1215235128:
                                                                                                                                                                                             break label1702;
                                                                                                                                                                                          case -1037556935:
                                                                                                                                                                                             break label1693;
                                                                                                                                                                                          case -1036705118:
                                                                                                                                                                                             break label1679;
                                                                                                                                                                                          case -1016315159:
                                                                                                                                                                                             break label1689;
                                                                                                                                                                                          case -695463974:
                                                                                                                                                                                             break label1686;
                                                                                                                                                                                          case -483158007:
                                                                                                                                                                                             break label1665;
                                                                                                                                                                                          case -451298125:
                                                                                                                                                                                             break label1682;
                                                                                                                                                                                          case -247506944:
                                                                                                                                                                                             break label1692;
                                                                                                                                                                                          case 426525722:
                                                                                                                                                                                             break label1681;
                                                                                                                                                                                          case 437687496:
                                                                                                                                                                                             break label1675;
                                                                                                                                                                                          case 470554554:
                                                                                                                                                                                             break label1673;
                                                                                                                                                                                          case 558675880:
                                                                                                                                                                                             break label1691;
                                                                                                                                                                                          case 793970219:
                                                                                                                                                                                             break label1699;
                                                                                                                                                                                          case 831781507:
                                                                                                                                                                                             break label1664;
                                                                                                                                                                                          case 1072522138:
                                                                                                                                                                                             break label1688;
                                                                                                                                                                                          case 1079482409:
                                                                                                                                                                                             break label1671;
                                                                                                                                                                                          case 1116075312:
                                                                                                                                                                                             break label1663;
                                                                                                                                                                                          case 1204272394:
                                                                                                                                                                                             break label1674;
                                                                                                                                                                                          case 1375291912:
                                                                                                                                                                                             break label1668;
                                                                                                                                                                                          case 1412274147:
                                                                                                                                                                                             break label1670;
                                                                                                                                                                                          case 1456331563:
                                                                                                                                                                                             break label1676;
                                                                                                                                                                                          case 1461405355:
                                                                                                                                                                                             break label1678;
                                                                                                                                                                                          case 1482069162:
                                                                                                                                                                                             break label1669;
                                                                                                                                                                                          case 1709059979:
                                                                                                                                                                                             break label1698;
                                                                                                                                                                                          case 1802811963:
                                                                                                                                                                                             break label1690;
                                                                                                                                                                                          case 1806779723:
                                                                                                                                                                                             break label1695;
                                                                                                                                                                                          case 1807565554:
                                                                                                                                                                                             break label1703;
                                                                                                                                                                                          case 1815357832:
                                                                                                                                                                                             break label1700;
                                                                                                                                                                                          case 1897586258:
                                                                                                                                                                                             break label1684;
                                                                                                                                                                                          case 2012823963:
                                                                                                                                                                                             break label1685;
                                                                                                                                                                                          case 2065282114:
                                                                                                                                                                                             break label1666;
                                                                                                                                                                                          case 2079860872:
                                                                                                                                                                                             break label1662;
                                                                                                                                                                                          default:
                                                                                                                                                                                             throw new RuntimeException(new IOException(
                                                                                                                                                                                                "Error in hash"
                                                                                                                                                                                             ));
                                                                                                                                                                                       }
                                                                                                                                                                                    }

                                                                                                                                                                                    while (true) {
                                                                                                                                                                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                                          var231
                                                                                                                                                                                       )) {
                                                                                                                                                                                          case 9294381:
                                                                                                                                                                                          default:
                                                                                                                                                                                             throw new IllegalStateException();
                                                                                                                                                                                          case 51291693:
                                                                                                                                                                                             var231 ^= 1153400554;
                                                                                                                                                                                          case 1525217183:
                                                                                                                                                                                             break label1730;
                                                                                                                                                                                          case 1529424955:
                                                                                                                                                                                       }
                                                                                                                                                                                    }
                                                                                                                                                                                 }

                                                                                                                                                                                 var231 ^= 407168893;

                                                                                                                                                                                 try {
                                                                                                                                                                                    var107 = (byte)(
                                                                                                                                                                                       1824245233
                                                                                                                                                                                          ^ var231
                                                                                                                                                                                    );
                                                                                                                                                                                    var231 ^= 726034818;
                                                                                                                                                                                    break label1730;
                                                                                                                                                                                 } catch (Throwable var245) {
                                                                                                                                                                                    var10000 = var245;
                                                                                                                                                                                    switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                       var231
                                                                                                                                                                                    )) {
                                                                                                                                                                                       case -2021649678:
                                                                                                                                                                                          break label1680;
                                                                                                                                                                                       case -1938794271:
                                                                                                                                                                                          break label1694;
                                                                                                                                                                                       case -1862190239:
                                                                                                                                                                                          break label1677;
                                                                                                                                                                                       case -1853829655:
                                                                                                                                                                                          break label1667;
                                                                                                                                                                                       case -1831506759:
                                                                                                                                                                                          break label1696;
                                                                                                                                                                                       case -1722804742:
                                                                                                                                                                                          break label1660;
                                                                                                                                                                                       case -1672950864:
                                                                                                                                                                                          break label1704;
                                                                                                                                                                                       case -1665149061:
                                                                                                                                                                                          break label1697;
                                                                                                                                                                                       case -1546530294:
                                                                                                                                                                                          break label1672;
                                                                                                                                                                                       case -1476848541:
                                                                                                                                                                                          break label1683;
                                                                                                                                                                                       case -1409350039:
                                                                                                                                                                                          break label1758;
                                                                                                                                                                                       case -1263565367:
                                                                                                                                                                                          break label1687;
                                                                                                                                                                                       case -1242278462:
                                                                                                                                                                                          break label1661;
                                                                                                                                                                                       case -1239724632:
                                                                                                                                                                                          break label1701;
                                                                                                                                                                                       case -1215235128:
                                                                                                                                                                                          break label1702;
                                                                                                                                                                                       case -1037556935:
                                                                                                                                                                                          break label1693;
                                                                                                                                                                                       case -1036705118:
                                                                                                                                                                                          break label1679;
                                                                                                                                                                                       case -1016315159:
                                                                                                                                                                                          break label1689;
                                                                                                                                                                                       case -695463974:
                                                                                                                                                                                          break label1686;
                                                                                                                                                                                       case -483158007:
                                                                                                                                                                                          break label1665;
                                                                                                                                                                                       case -451298125:
                                                                                                                                                                                          break label1682;
                                                                                                                                                                                       case -247506944:
                                                                                                                                                                                          break label1692;
                                                                                                                                                                                       case 426525722:
                                                                                                                                                                                          break label1681;
                                                                                                                                                                                       case 437687496:
                                                                                                                                                                                          break label1675;
                                                                                                                                                                                       case 470554554:
                                                                                                                                                                                          break label1673;
                                                                                                                                                                                       case 558675880:
                                                                                                                                                                                          break label1691;
                                                                                                                                                                                       case 793970219:
                                                                                                                                                                                          break label1699;
                                                                                                                                                                                       case 831781507:
                                                                                                                                                                                          break label1664;
                                                                                                                                                                                       case 1072522138:
                                                                                                                                                                                          break label1688;
                                                                                                                                                                                       case 1079482409:
                                                                                                                                                                                          break label1671;
                                                                                                                                                                                       case 1116075312:
                                                                                                                                                                                          break label1663;
                                                                                                                                                                                       case 1204272394:
                                                                                                                                                                                          break label1674;
                                                                                                                                                                                       case 1375291912:
                                                                                                                                                                                          break label1668;
                                                                                                                                                                                       case 1412274147:
                                                                                                                                                                                          break label1670;
                                                                                                                                                                                       case 1456331563:
                                                                                                                                                                                          break label1676;
                                                                                                                                                                                       case 1461405355:
                                                                                                                                                                                          break label1678;
                                                                                                                                                                                       case 1482069162:
                                                                                                                                                                                          break label1669;
                                                                                                                                                                                       case 1709059979:
                                                                                                                                                                                          break label1698;
                                                                                                                                                                                       case 1802811963:
                                                                                                                                                                                          break label1690;
                                                                                                                                                                                       case 1806779723:
                                                                                                                                                                                          break label1695;
                                                                                                                                                                                       case 1807565554:
                                                                                                                                                                                          break label1703;
                                                                                                                                                                                       case 1815357832:
                                                                                                                                                                                          break label1700;
                                                                                                                                                                                       case 1897586258:
                                                                                                                                                                                          break label1684;
                                                                                                                                                                                       case 2012823963:
                                                                                                                                                                                          break label1685;
                                                                                                                                                                                       case 2065282114:
                                                                                                                                                                                          break label1666;
                                                                                                                                                                                       case 2079860872:
                                                                                                                                                                                          break label1662;
                                                                                                                                                                                       default:
                                                                                                                                                                                          throw new RuntimeException(new IOException(
                                                                                                                                                                                             "Error in hash"
                                                                                                                                                                                          ));
                                                                                                                                                                                    }
                                                                                                                                                                                 }
                                                                                                                                                                              }

                                                                                                                                                                              while (true) {
                                                                                                                                                                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                                    var231
                                                                                                                                                                                 )) {
                                                                                                                                                                                    case 26182158:
                                                                                                                                                                                       var231 ^= 1484986098;
                                                                                                                                                                                       break label1615;
                                                                                                                                                                                    case 248826006:
                                                                                                                                                                                    default:
                                                                                                                                                                                       throw new IllegalStateException();
                                                                                                                                                                                    case 1635471009:
                                                                                                                                                                                       break;
                                                                                                                                                                                    case 2071712557:
                                                                                                                                                                                       break label1615;
                                                                                                                                                                                 }
                                                                                                                                                                              }
                                                                                                                                                                           }

                                                                                                                                                                           try {
                                                                                                                                                                              var15 = var107;
                                                                                                                                                                              var231 ^= 757339926;
                                                                                                                                                                           } catch (Throwable var244) {
                                                                                                                                                                              var10000 = var244;
                                                                                                                                                                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                 var231
                                                                                                                                                                              )) {
                                                                                                                                                                                 case -2021649678:
                                                                                                                                                                                    break label1680;
                                                                                                                                                                                 case -1938794271:
                                                                                                                                                                                    break label1694;
                                                                                                                                                                                 case -1862190239:
                                                                                                                                                                                    break label1677;
                                                                                                                                                                                 case -1853829655:
                                                                                                                                                                                    break label1667;
                                                                                                                                                                                 case -1831506759:
                                                                                                                                                                                    break label1696;
                                                                                                                                                                                 case -1722804742:
                                                                                                                                                                                    break label1660;
                                                                                                                                                                                 case -1672950864:
                                                                                                                                                                                    break label1704;
                                                                                                                                                                                 case -1665149061:
                                                                                                                                                                                    break label1697;
                                                                                                                                                                                 case -1546530294:
                                                                                                                                                                                    break label1672;
                                                                                                                                                                                 case -1476848541:
                                                                                                                                                                                    break label1683;
                                                                                                                                                                                 case -1409350039:
                                                                                                                                                                                    break label1758;
                                                                                                                                                                                 case -1263565367:
                                                                                                                                                                                    break label1687;
                                                                                                                                                                                 case -1242278462:
                                                                                                                                                                                    break label1661;
                                                                                                                                                                                 case -1239724632:
                                                                                                                                                                                    break label1701;
                                                                                                                                                                                 case -1215235128:
                                                                                                                                                                                    break label1702;
                                                                                                                                                                                 case -1037556935:
                                                                                                                                                                                    break label1693;
                                                                                                                                                                                 case -1036705118:
                                                                                                                                                                                    break label1679;
                                                                                                                                                                                 case -1016315159:
                                                                                                                                                                                    break label1689;
                                                                                                                                                                                 case -695463974:
                                                                                                                                                                                    break label1686;
                                                                                                                                                                                 case -483158007:
                                                                                                                                                                                    break label1665;
                                                                                                                                                                                 case -451298125:
                                                                                                                                                                                    break label1682;
                                                                                                                                                                                 case -247506944:
                                                                                                                                                                                    break label1692;
                                                                                                                                                                                 case 426525722:
                                                                                                                                                                                    break label1681;
                                                                                                                                                                                 case 437687496:
                                                                                                                                                                                    break label1675;
                                                                                                                                                                                 case 470554554:
                                                                                                                                                                                    break label1673;
                                                                                                                                                                                 case 558675880:
                                                                                                                                                                                    break label1691;
                                                                                                                                                                                 case 793970219:
                                                                                                                                                                                    break label1699;
                                                                                                                                                                                 case 831781507:
                                                                                                                                                                                    break label1664;
                                                                                                                                                                                 case 1072522138:
                                                                                                                                                                                    break label1688;
                                                                                                                                                                                 case 1079482409:
                                                                                                                                                                                    break label1671;
                                                                                                                                                                                 case 1116075312:
                                                                                                                                                                                    break label1663;
                                                                                                                                                                                 case 1204272394:
                                                                                                                                                                                    break label1674;
                                                                                                                                                                                 case 1375291912:
                                                                                                                                                                                    break label1668;
                                                                                                                                                                                 case 1412274147:
                                                                                                                                                                                    break label1670;
                                                                                                                                                                                 case 1456331563:
                                                                                                                                                                                    break label1676;
                                                                                                                                                                                 case 1461405355:
                                                                                                                                                                                    break label1678;
                                                                                                                                                                                 case 1482069162:
                                                                                                                                                                                    break label1669;
                                                                                                                                                                                 case 1709059979:
                                                                                                                                                                                    break label1698;
                                                                                                                                                                                 case 1802811963:
                                                                                                                                                                                    break label1690;
                                                                                                                                                                                 case 1806779723:
                                                                                                                                                                                    break label1695;
                                                                                                                                                                                 case 1807565554:
                                                                                                                                                                                    break label1703;
                                                                                                                                                                                 case 1815357832:
                                                                                                                                                                                    break label1700;
                                                                                                                                                                                 case 1897586258:
                                                                                                                                                                                    break label1684;
                                                                                                                                                                                 case 2012823963:
                                                                                                                                                                                    break label1685;
                                                                                                                                                                                 case 2065282114:
                                                                                                                                                                                    break label1666;
                                                                                                                                                                                 case 2079860872:
                                                                                                                                                                                    break label1662;
                                                                                                                                                                                 default:
                                                                                                                                                                                    throw new RuntimeException(new IOException(
                                                                                                                                                                                       "Error in hash"
                                                                                                                                                                                    ));
                                                                                                                                                                              }
                                                                                                                                                                           }
                                                                                                                                                                        }

                                                                                                                                                                        label1733: {
                                                                                                                                                                           label1586: {
                                                                                                                                                                              try {
                                                                                                                                                                                 Predicate<BlockState> var163 = var0 -> {
                                                                                                                                                                                    int var6x = 1916512534
                                                                                                                                                                                       ^ 1448231361
                                                                                                                                                                                       ^ 1829447660;
                                                                                                                                                                                    var6x = 1930474397
                                                                                                                                                                                       ^ var6x;
                                                                                                                                                                                    Block var2x = Blocks.STONE;
                                                                                                                                                                                    return var0.is(
                                                                                                                                                                                       var2x
                                                                                                                                                                                    );
                                                                                                                                                                                 };
                                                                                                                                                                                 byte var77 = (byte)((var17.maybeHas(
                                                                                                                                                                                    var163
                                                                                                                                                                                 )) ? 1 : 0);
                                                                                                                                                                                 if (var77
                                                                                                                                                                                    != (
                                                                                                                                                                                       1792654181
                                                                                                                                                                                          ^ var231
                                                                                                                                                                                    )
                                                                                                                                                                                    )
                                                                                                                                                                                  {
                                                                                                                                                                                    var231 ^= 665719611;
                                                                                                                                                                                    Predicate<BlockState> var164 = var0 -> {
                                                                                                                                                                                       int var6x = 1006607818
                                                                                                                                                                                          ^ 637799746
                                                                                                                                                                                          ^ 1829447660;
                                                                                                                                                                                       var6x = 2096963803
                                                                                                                                                                                          ^ var6x;
                                                                                                                                                                                       Block var2x = var0.getBlock();
                                                                                                                                                                                       return isBlob(
                                                                                                                                                                                          var2x
                                                                                                                                                                                       );
                                                                                                                                                                                    };
                                                                                                                                                                                    byte var79 = (byte)((var17.maybeHas(
                                                                                                                                                                                       var164
                                                                                                                                                                                    )) ? 1 : 0);
                                                                                                                                                                                    if (var79
                                                                                                                                                                                       != (
                                                                                                                                                                                          1299687518
                                                                                                                                                                                             ^ var231
                                                                                                                                                                                       )
                                                                                                                                                                                       )
                                                                                                                                                                                     {
                                                                                                                                                                                       break label1586;
                                                                                                                                                                                    }

                                                                                                                                                                                    var231 ^= 681429147;
                                                                                                                                                                                    break label1733;
                                                                                                                                                                                 }
                                                                                                                                                                              } catch (Throwable var254) {
                                                                                                                                                                                 var10000 = var254;
                                                                                                                                                                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                    var231
                                                                                                                                                                                 )) {
                                                                                                                                                                                    case -2021649678:
                                                                                                                                                                                       break label1680;
                                                                                                                                                                                    case -1938794271:
                                                                                                                                                                                       break label1694;
                                                                                                                                                                                    case -1862190239:
                                                                                                                                                                                       break label1677;
                                                                                                                                                                                    case -1853829655:
                                                                                                                                                                                       break label1667;
                                                                                                                                                                                    case -1831506759:
                                                                                                                                                                                       break label1696;
                                                                                                                                                                                    case -1722804742:
                                                                                                                                                                                       break label1660;
                                                                                                                                                                                    case -1672950864:
                                                                                                                                                                                       break label1704;
                                                                                                                                                                                    case -1665149061:
                                                                                                                                                                                       break label1697;
                                                                                                                                                                                    case -1546530294:
                                                                                                                                                                                       break label1672;
                                                                                                                                                                                    case -1476848541:
                                                                                                                                                                                       break label1683;
                                                                                                                                                                                    case -1409350039:
                                                                                                                                                                                       break label1758;
                                                                                                                                                                                    case -1263565367:
                                                                                                                                                                                       break label1687;
                                                                                                                                                                                    case -1242278462:
                                                                                                                                                                                       break label1661;
                                                                                                                                                                                    case -1239724632:
                                                                                                                                                                                       break label1701;
                                                                                                                                                                                    case -1215235128:
                                                                                                                                                                                       break label1702;
                                                                                                                                                                                    case -1037556935:
                                                                                                                                                                                       break label1693;
                                                                                                                                                                                    case -1036705118:
                                                                                                                                                                                       break label1679;
                                                                                                                                                                                    case -1016315159:
                                                                                                                                                                                       break label1689;
                                                                                                                                                                                    case -695463974:
                                                                                                                                                                                       break label1686;
                                                                                                                                                                                    case -483158007:
                                                                                                                                                                                       break label1665;
                                                                                                                                                                                    case -451298125:
                                                                                                                                                                                       break label1682;
                                                                                                                                                                                    case -247506944:
                                                                                                                                                                                       break label1692;
                                                                                                                                                                                    case 426525722:
                                                                                                                                                                                       break label1681;
                                                                                                                                                                                    case 437687496:
                                                                                                                                                                                       break label1675;
                                                                                                                                                                                    case 470554554:
                                                                                                                                                                                       break label1673;
                                                                                                                                                                                    case 558675880:
                                                                                                                                                                                       break label1691;
                                                                                                                                                                                    case 793970219:
                                                                                                                                                                                       break label1699;
                                                                                                                                                                                    case 831781507:
                                                                                                                                                                                       break label1664;
                                                                                                                                                                                    case 1072522138:
                                                                                                                                                                                       break label1688;
                                                                                                                                                                                    case 1079482409:
                                                                                                                                                                                       break label1671;
                                                                                                                                                                                    case 1116075312:
                                                                                                                                                                                       break label1663;
                                                                                                                                                                                    case 1204272394:
                                                                                                                                                                                       break label1674;
                                                                                                                                                                                    case 1375291912:
                                                                                                                                                                                       break label1668;
                                                                                                                                                                                    case 1412274147:
                                                                                                                                                                                       break label1670;
                                                                                                                                                                                    case 1456331563:
                                                                                                                                                                                       break label1676;
                                                                                                                                                                                    case 1461405355:
                                                                                                                                                                                       break label1678;
                                                                                                                                                                                    case 1482069162:
                                                                                                                                                                                       break label1669;
                                                                                                                                                                                    case 1709059979:
                                                                                                                                                                                       break label1698;
                                                                                                                                                                                    case 1802811963:
                                                                                                                                                                                       break label1690;
                                                                                                                                                                                    case 1806779723:
                                                                                                                                                                                       break label1695;
                                                                                                                                                                                    case 1807565554:
                                                                                                                                                                                       break label1703;
                                                                                                                                                                                    case 1815357832:
                                                                                                                                                                                       break label1700;
                                                                                                                                                                                    case 1897586258:
                                                                                                                                                                                       break label1684;
                                                                                                                                                                                    case 2012823963:
                                                                                                                                                                                       break label1685;
                                                                                                                                                                                    case 2065282114:
                                                                                                                                                                                       break label1666;
                                                                                                                                                                                    case 2079860872:
                                                                                                                                                                                       break label1662;
                                                                                                                                                                                    default:
                                                                                                                                                                                       throw new RuntimeException(new IOException(
                                                                                                                                                                                          "Error in hash"
                                                                                                                                                                                       ));
                                                                                                                                                                                 }
                                                                                                                                                                              }

                                                                                                                                                                              while (true) {
                                                                                                                                                                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                                    var231
                                                                                                                                                                                 )) {
                                                                                                                                                                                    case 198590173:
                                                                                                                                                                                    default:
                                                                                                                                                                                       throw new IllegalStateException();
                                                                                                                                                                                    case 252031434:
                                                                                                                                                                                       var231 ^= 6031769;
                                                                                                                                                                                       break label1655;
                                                                                                                                                                                    case 2000437186:
                                                                                                                                                                                       break;
                                                                                                                                                                                    case 2084507053:
                                                                                                                                                                                       break label1655;
                                                                                                                                                                                 }
                                                                                                                                                                              }
                                                                                                                                                                           }

                                                                                                                                                                           label1569:
                                                                                                                                                                           while (true) {
                                                                                                                                                                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                                 var231
                                                                                                                                                                              )) {
                                                                                                                                                                                 case 102210369:
                                                                                                                                                                                    var231 ^= 1054888625;
                                                                                                                                                                                    break label1569;
                                                                                                                                                                                 case 1295836135:
                                                                                                                                                                                 default:
                                                                                                                                                                                    throw new IllegalStateException();
                                                                                                                                                                                 case 1482189346:
                                                                                                                                                                                    break label1569;
                                                                                                                                                                                 case 1507925296:
                                                                                                                                                                              }
                                                                                                                                                                           }

                                                                                                                                                                           int var21;
                                                                                                                                                                           try {
                                                                                                                                                                              var21 = var19;
                                                                                                                                                                              var231 ^= 1189616162;
                                                                                                                                                                           } catch (Throwable var243) {
                                                                                                                                                                              var10000 = var243;
                                                                                                                                                                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                 var231
                                                                                                                                                                              )) {
                                                                                                                                                                                 case -2021649678:
                                                                                                                                                                                    break label1680;
                                                                                                                                                                                 case -1938794271:
                                                                                                                                                                                    break label1694;
                                                                                                                                                                                 case -1862190239:
                                                                                                                                                                                    break label1677;
                                                                                                                                                                                 case -1853829655:
                                                                                                                                                                                    break label1667;
                                                                                                                                                                                 case -1831506759:
                                                                                                                                                                                    break label1696;
                                                                                                                                                                                 case -1722804742:
                                                                                                                                                                                    break label1660;
                                                                                                                                                                                 case -1672950864:
                                                                                                                                                                                    break label1704;
                                                                                                                                                                                 case -1665149061:
                                                                                                                                                                                    break label1697;
                                                                                                                                                                                 case -1546530294:
                                                                                                                                                                                    break label1672;
                                                                                                                                                                                 case -1476848541:
                                                                                                                                                                                    break label1683;
                                                                                                                                                                                 case -1409350039:
                                                                                                                                                                                    break label1758;
                                                                                                                                                                                 case -1263565367:
                                                                                                                                                                                    break label1687;
                                                                                                                                                                                 case -1242278462:
                                                                                                                                                                                    break label1661;
                                                                                                                                                                                 case -1239724632:
                                                                                                                                                                                    break label1701;
                                                                                                                                                                                 case -1215235128:
                                                                                                                                                                                    break label1702;
                                                                                                                                                                                 case -1037556935:
                                                                                                                                                                                    break label1693;
                                                                                                                                                                                 case -1036705118:
                                                                                                                                                                                    break label1679;
                                                                                                                                                                                 case -1016315159:
                                                                                                                                                                                    break label1689;
                                                                                                                                                                                 case -695463974:
                                                                                                                                                                                    break label1686;
                                                                                                                                                                                 case -483158007:
                                                                                                                                                                                    break label1665;
                                                                                                                                                                                 case -451298125:
                                                                                                                                                                                    break label1682;
                                                                                                                                                                                 case -247506944:
                                                                                                                                                                                    break label1692;
                                                                                                                                                                                 case 426525722:
                                                                                                                                                                                    break label1681;
                                                                                                                                                                                 case 437687496:
                                                                                                                                                                                    break label1675;
                                                                                                                                                                                 case 470554554:
                                                                                                                                                                                    break label1673;
                                                                                                                                                                                 case 558675880:
                                                                                                                                                                                    break label1691;
                                                                                                                                                                                 case 793970219:
                                                                                                                                                                                    break label1699;
                                                                                                                                                                                 case 831781507:
                                                                                                                                                                                    break label1664;
                                                                                                                                                                                 case 1072522138:
                                                                                                                                                                                    break label1688;
                                                                                                                                                                                 case 1079482409:
                                                                                                                                                                                    break label1671;
                                                                                                                                                                                 case 1116075312:
                                                                                                                                                                                    break label1663;
                                                                                                                                                                                 case 1204272394:
                                                                                                                                                                                    break label1674;
                                                                                                                                                                                 case 1375291912:
                                                                                                                                                                                    break label1668;
                                                                                                                                                                                 case 1412274147:
                                                                                                                                                                                    break label1670;
                                                                                                                                                                                 case 1456331563:
                                                                                                                                                                                    break label1676;
                                                                                                                                                                                 case 1461405355:
                                                                                                                                                                                    break label1678;
                                                                                                                                                                                 case 1482069162:
                                                                                                                                                                                    break label1669;
                                                                                                                                                                                 case 1709059979:
                                                                                                                                                                                    break label1698;
                                                                                                                                                                                 case 1802811963:
                                                                                                                                                                                    break label1690;
                                                                                                                                                                                 case 1806779723:
                                                                                                                                                                                    break label1695;
                                                                                                                                                                                 case 1807565554:
                                                                                                                                                                                    break label1703;
                                                                                                                                                                                 case 1815357832:
                                                                                                                                                                                    break label1700;
                                                                                                                                                                                 case 1897586258:
                                                                                                                                                                                    break label1684;
                                                                                                                                                                                 case 2012823963:
                                                                                                                                                                                    break label1685;
                                                                                                                                                                                 case 2065282114:
                                                                                                                                                                                    break label1666;
                                                                                                                                                                                 case 2079860872:
                                                                                                                                                                                    break label1662;
                                                                                                                                                                                 default:
                                                                                                                                                                                    throw new RuntimeException(new IOException(
                                                                                                                                                                                       "Error in hash"
                                                                                                                                                                                    ));
                                                                                                                                                                              }
                                                                                                                                                                           }

                                                                                                                                                                           while (true) {
                                                                                                                                                                              int var22;
                                                                                                                                                                              try {
                                                                                                                                                                                 if (var21
                                                                                                                                                                                    > var20
                                                                                                                                                                                    )
                                                                                                                                                                                  {
                                                                                                                                                                                    break;
                                                                                                                                                                                 }

                                                                                                                                                                                 var231 ^= 596508596;
                                                                                                                                                                                 byte var82 = (byte)(
                                                                                                                                                                                    384966521
                                                                                                                                                                                       ^ var231
                                                                                                                                                                                 );
                                                                                                                                                                                 var22 = var82;
                                                                                                                                                                                 var231 ^= 1320467245;
                                                                                                                                                                              } catch (Throwable var249) {
                                                                                                                                                                                 var10000 = var249;
                                                                                                                                                                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                    var231
                                                                                                                                                                                 )) {
                                                                                                                                                                                    case -2021649678:
                                                                                                                                                                                       break label1680;
                                                                                                                                                                                    case -1938794271:
                                                                                                                                                                                       break label1694;
                                                                                                                                                                                    case -1862190239:
                                                                                                                                                                                       break label1677;
                                                                                                                                                                                    case -1853829655:
                                                                                                                                                                                       break label1667;
                                                                                                                                                                                    case -1831506759:
                                                                                                                                                                                       break label1696;
                                                                                                                                                                                    case -1722804742:
                                                                                                                                                                                       break label1660;
                                                                                                                                                                                    case -1672950864:
                                                                                                                                                                                       break label1704;
                                                                                                                                                                                    case -1665149061:
                                                                                                                                                                                       break label1697;
                                                                                                                                                                                    case -1546530294:
                                                                                                                                                                                       break label1672;
                                                                                                                                                                                    case -1476848541:
                                                                                                                                                                                       break label1683;
                                                                                                                                                                                    case -1409350039:
                                                                                                                                                                                       break label1758;
                                                                                                                                                                                    case -1263565367:
                                                                                                                                                                                       break label1687;
                                                                                                                                                                                    case -1242278462:
                                                                                                                                                                                       break label1661;
                                                                                                                                                                                    case -1239724632:
                                                                                                                                                                                       break label1701;
                                                                                                                                                                                    case -1215235128:
                                                                                                                                                                                       break label1702;
                                                                                                                                                                                    case -1037556935:
                                                                                                                                                                                       break label1693;
                                                                                                                                                                                    case -1036705118:
                                                                                                                                                                                       break label1679;
                                                                                                                                                                                    case -1016315159:
                                                                                                                                                                                       break label1689;
                                                                                                                                                                                    case -695463974:
                                                                                                                                                                                       break label1686;
                                                                                                                                                                                    case -483158007:
                                                                                                                                                                                       break label1665;
                                                                                                                                                                                    case -451298125:
                                                                                                                                                                                       break label1682;
                                                                                                                                                                                    case -247506944:
                                                                                                                                                                                       break label1692;
                                                                                                                                                                                    case 426525722:
                                                                                                                                                                                       break label1681;
                                                                                                                                                                                    case 437687496:
                                                                                                                                                                                       break label1675;
                                                                                                                                                                                    case 470554554:
                                                                                                                                                                                       break label1673;
                                                                                                                                                                                    case 558675880:
                                                                                                                                                                                       break label1691;
                                                                                                                                                                                    case 793970219:
                                                                                                                                                                                       break label1699;
                                                                                                                                                                                    case 831781507:
                                                                                                                                                                                       break label1664;
                                                                                                                                                                                    case 1072522138:
                                                                                                                                                                                       break label1688;
                                                                                                                                                                                    case 1079482409:
                                                                                                                                                                                       break label1671;
                                                                                                                                                                                    case 1116075312:
                                                                                                                                                                                       break label1663;
                                                                                                                                                                                    case 1204272394:
                                                                                                                                                                                       break label1674;
                                                                                                                                                                                    case 1375291912:
                                                                                                                                                                                       break label1668;
                                                                                                                                                                                    case 1412274147:
                                                                                                                                                                                       break label1670;
                                                                                                                                                                                    case 1456331563:
                                                                                                                                                                                       break label1676;
                                                                                                                                                                                    case 1461405355:
                                                                                                                                                                                       break label1678;
                                                                                                                                                                                    case 1482069162:
                                                                                                                                                                                       break label1669;
                                                                                                                                                                                    case 1709059979:
                                                                                                                                                                                       break label1698;
                                                                                                                                                                                    case 1802811963:
                                                                                                                                                                                       break label1690;
                                                                                                                                                                                    case 1806779723:
                                                                                                                                                                                       break label1695;
                                                                                                                                                                                    case 1807565554:
                                                                                                                                                                                       break label1703;
                                                                                                                                                                                    case 1815357832:
                                                                                                                                                                                       break label1700;
                                                                                                                                                                                    case 1897586258:
                                                                                                                                                                                       break label1684;
                                                                                                                                                                                    case 2012823963:
                                                                                                                                                                                       break label1685;
                                                                                                                                                                                    case 2065282114:
                                                                                                                                                                                       break label1666;
                                                                                                                                                                                    case 2079860872:
                                                                                                                                                                                       break label1662;
                                                                                                                                                                                    default:
                                                                                                                                                                                       throw new RuntimeException(new IOException(
                                                                                                                                                                                          "Error in hash"
                                                                                                                                                                                       ));
                                                                                                                                                                                 }
                                                                                                                                                                              }

                                                                                                                                                                              while (true) {
                                                                                                                                                                                 byte var23;
                                                                                                                                                                                 int var24;
                                                                                                                                                                                 try {
                                                                                                                                                                                    byte var166 = (byte)(
                                                                                                                                                                                       1481024580
                                                                                                                                                                                          ^ var231
                                                                                                                                                                                    );
                                                                                                                                                                                    if (var22
                                                                                                                                                                                       >= var166
                                                                                                                                                                                       )
                                                                                                                                                                                     {
                                                                                                                                                                                       break;
                                                                                                                                                                                    }

                                                                                                                                                                                    var231 ^= 849726593;
                                                                                                                                                                                    byte var84 = (byte)(
                                                                                                                                                                                       1793288405
                                                                                                                                                                                          ^ var231
                                                                                                                                                                                    );
                                                                                                                                                                                    var23 = var84;
                                                                                                                                                                                    byte var85 = (byte)(
                                                                                                                                                                                       1793288405
                                                                                                                                                                                          ^ var231
                                                                                                                                                                                    );
                                                                                                                                                                                    var24 = var85;
                                                                                                                                                                                    var231 ^= 126746514;
                                                                                                                                                                                 } catch (Throwable var250) {
                                                                                                                                                                                    var10000 = var250;
                                                                                                                                                                                    switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                       var231
                                                                                                                                                                                    )) {
                                                                                                                                                                                       case -2021649678:
                                                                                                                                                                                          break label1680;
                                                                                                                                                                                       case -1938794271:
                                                                                                                                                                                          break label1694;
                                                                                                                                                                                       case -1862190239:
                                                                                                                                                                                          break label1677;
                                                                                                                                                                                       case -1853829655:
                                                                                                                                                                                          break label1667;
                                                                                                                                                                                       case -1831506759:
                                                                                                                                                                                          break label1696;
                                                                                                                                                                                       case -1722804742:
                                                                                                                                                                                          break label1660;
                                                                                                                                                                                       case -1672950864:
                                                                                                                                                                                          break label1704;
                                                                                                                                                                                       case -1665149061:
                                                                                                                                                                                          break label1697;
                                                                                                                                                                                       case -1546530294:
                                                                                                                                                                                          break label1672;
                                                                                                                                                                                       case -1476848541:
                                                                                                                                                                                          break label1683;
                                                                                                                                                                                       case -1409350039:
                                                                                                                                                                                          break label1758;
                                                                                                                                                                                       case -1263565367:
                                                                                                                                                                                          break label1687;
                                                                                                                                                                                       case -1242278462:
                                                                                                                                                                                          break label1661;
                                                                                                                                                                                       case -1239724632:
                                                                                                                                                                                          break label1701;
                                                                                                                                                                                       case -1215235128:
                                                                                                                                                                                          break label1702;
                                                                                                                                                                                       case -1037556935:
                                                                                                                                                                                          break label1693;
                                                                                                                                                                                       case -1036705118:
                                                                                                                                                                                          break label1679;
                                                                                                                                                                                       case -1016315159:
                                                                                                                                                                                          break label1689;
                                                                                                                                                                                       case -695463974:
                                                                                                                                                                                          break label1686;
                                                                                                                                                                                       case -483158007:
                                                                                                                                                                                          break label1665;
                                                                                                                                                                                       case -451298125:
                                                                                                                                                                                          break label1682;
                                                                                                                                                                                       case -247506944:
                                                                                                                                                                                          break label1692;
                                                                                                                                                                                       case 426525722:
                                                                                                                                                                                          break label1681;
                                                                                                                                                                                       case 437687496:
                                                                                                                                                                                          break label1675;
                                                                                                                                                                                       case 470554554:
                                                                                                                                                                                          break label1673;
                                                                                                                                                                                       case 558675880:
                                                                                                                                                                                          break label1691;
                                                                                                                                                                                       case 793970219:
                                                                                                                                                                                          break label1699;
                                                                                                                                                                                       case 831781507:
                                                                                                                                                                                          break label1664;
                                                                                                                                                                                       case 1072522138:
                                                                                                                                                                                          break label1688;
                                                                                                                                                                                       case 1079482409:
                                                                                                                                                                                          break label1671;
                                                                                                                                                                                       case 1116075312:
                                                                                                                                                                                          break label1663;
                                                                                                                                                                                       case 1204272394:
                                                                                                                                                                                          break label1674;
                                                                                                                                                                                       case 1375291912:
                                                                                                                                                                                          break label1668;
                                                                                                                                                                                       case 1412274147:
                                                                                                                                                                                          break label1670;
                                                                                                                                                                                       case 1456331563:
                                                                                                                                                                                          break label1676;
                                                                                                                                                                                       case 1461405355:
                                                                                                                                                                                          break label1678;
                                                                                                                                                                                       case 1482069162:
                                                                                                                                                                                          break label1669;
                                                                                                                                                                                       case 1709059979:
                                                                                                                                                                                          break label1698;
                                                                                                                                                                                       case 1802811963:
                                                                                                                                                                                          break label1690;
                                                                                                                                                                                       case 1806779723:
                                                                                                                                                                                          break label1695;
                                                                                                                                                                                       case 1807565554:
                                                                                                                                                                                          break label1703;
                                                                                                                                                                                       case 1815357832:
                                                                                                                                                                                          break label1700;
                                                                                                                                                                                       case 1897586258:
                                                                                                                                                                                          break label1684;
                                                                                                                                                                                       case 2012823963:
                                                                                                                                                                                          break label1685;
                                                                                                                                                                                       case 2065282114:
                                                                                                                                                                                          break label1666;
                                                                                                                                                                                       case 2079860872:
                                                                                                                                                                                          break label1662;
                                                                                                                                                                                       default:
                                                                                                                                                                                          throw new RuntimeException(new IOException(
                                                                                                                                                                                             "Error in hash"
                                                                                                                                                                                          ));
                                                                                                                                                                                    }
                                                                                                                                                                                 }

                                                                                                                                                                                 while (true) {
                                                                                                                                                                                    Block var25;
                                                                                                                                                                                    byte var132;
                                                                                                                                                                                    label1738: {
                                                                                                                                                                                       label1739: {
                                                                                                                                                                                          try {
                                                                                                                                                                                             byte var167 = (byte)(
                                                                                                                                                                                                1835964247
                                                                                                                                                                                                   ^ var231
                                                                                                                                                                                             );
                                                                                                                                                                                             if (var24
                                                                                                                                                                                                >= var167
                                                                                                                                                                                                )
                                                                                                                                                                                              {
                                                                                                                                                                                                break;
                                                                                                                                                                                             }

                                                                                                                                                                                             var231 ^= 787420592;
                                                                                                                                                                                             BlockState var88 = var17.getBlockState(
                                                                                                                                                                                                var24,
                                                                                                                                                                                                var21,
                                                                                                                                                                                                var22
                                                                                                                                                                                             );
                                                                                                                                                                                             Block var89 = var88.getBlock();
                                                                                                                                                                                             var25 = var89;
                                                                                                                                                                                             Block var169 = Blocks.STONE;
                                                                                                                                                                                             if (var89
                                                                                                                                                                                                != var169
                                                                                                                                                                                                )
                                                                                                                                                                                              {
                                                                                                                                                                                                break label1739;
                                                                                                                                                                                             }

                                                                                                                                                                                             var231 ^= 1430448962;
                                                                                                                                                                                             var132 = (byte)(
                                                                                                                                                                                                381905332
                                                                                                                                                                                                   ^ var231
                                                                                                                                                                                             );
                                                                                                                                                                                          } catch (Throwable var251) {
                                                                                                                                                                                             var10000 = var251;
                                                                                                                                                                                             switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                                var231
                                                                                                                                                                                             )) {
                                                                                                                                                                                                case -2021649678:
                                                                                                                                                                                                   break label1680;
                                                                                                                                                                                                case -1938794271:
                                                                                                                                                                                                   break label1694;
                                                                                                                                                                                                case -1862190239:
                                                                                                                                                                                                   break label1677;
                                                                                                                                                                                                case -1853829655:
                                                                                                                                                                                                   break label1667;
                                                                                                                                                                                                case -1831506759:
                                                                                                                                                                                                   break label1696;
                                                                                                                                                                                                case -1722804742:
                                                                                                                                                                                                   break label1660;
                                                                                                                                                                                                case -1672950864:
                                                                                                                                                                                                   break label1704;
                                                                                                                                                                                                case -1665149061:
                                                                                                                                                                                                   break label1697;
                                                                                                                                                                                                case -1546530294:
                                                                                                                                                                                                   break label1672;
                                                                                                                                                                                                case -1476848541:
                                                                                                                                                                                                   break label1683;
                                                                                                                                                                                                case -1409350039:
                                                                                                                                                                                                   break label1758;
                                                                                                                                                                                                case -1263565367:
                                                                                                                                                                                                   break label1687;
                                                                                                                                                                                                case -1242278462:
                                                                                                                                                                                                   break label1661;
                                                                                                                                                                                                case -1239724632:
                                                                                                                                                                                                   break label1701;
                                                                                                                                                                                                case -1215235128:
                                                                                                                                                                                                   break label1702;
                                                                                                                                                                                                case -1037556935:
                                                                                                                                                                                                   break label1693;
                                                                                                                                                                                                case -1036705118:
                                                                                                                                                                                                   break label1679;
                                                                                                                                                                                                case -1016315159:
                                                                                                                                                                                                   break label1689;
                                                                                                                                                                                                case -695463974:
                                                                                                                                                                                                   break label1686;
                                                                                                                                                                                                case -483158007:
                                                                                                                                                                                                   break label1665;
                                                                                                                                                                                                case -451298125:
                                                                                                                                                                                                   break label1682;
                                                                                                                                                                                                case -247506944:
                                                                                                                                                                                                   break label1692;
                                                                                                                                                                                                case 426525722:
                                                                                                                                                                                                   break label1681;
                                                                                                                                                                                                case 437687496:
                                                                                                                                                                                                   break label1675;
                                                                                                                                                                                                case 470554554:
                                                                                                                                                                                                   break label1673;
                                                                                                                                                                                                case 558675880:
                                                                                                                                                                                                   break label1691;
                                                                                                                                                                                                case 793970219:
                                                                                                                                                                                                   break label1699;
                                                                                                                                                                                                case 831781507:
                                                                                                                                                                                                   break label1664;
                                                                                                                                                                                                case 1072522138:
                                                                                                                                                                                                   break label1688;
                                                                                                                                                                                                case 1079482409:
                                                                                                                                                                                                   break label1671;
                                                                                                                                                                                                case 1116075312:
                                                                                                                                                                                                   break label1663;
                                                                                                                                                                                                case 1204272394:
                                                                                                                                                                                                   break label1674;
                                                                                                                                                                                                case 1375291912:
                                                                                                                                                                                                   break label1668;
                                                                                                                                                                                                case 1412274147:
                                                                                                                                                                                                   break label1670;
                                                                                                                                                                                                case 1456331563:
                                                                                                                                                                                                   break label1676;
                                                                                                                                                                                                case 1461405355:
                                                                                                                                                                                                   break label1678;
                                                                                                                                                                                                case 1482069162:
                                                                                                                                                                                                   break label1669;
                                                                                                                                                                                                case 1709059979:
                                                                                                                                                                                                   break label1698;
                                                                                                                                                                                                case 1802811963:
                                                                                                                                                                                                   break label1690;
                                                                                                                                                                                                case 1806779723:
                                                                                                                                                                                                   break label1695;
                                                                                                                                                                                                case 1807565554:
                                                                                                                                                                                                   break label1703;
                                                                                                                                                                                                case 1815357832:
                                                                                                                                                                                                   break label1700;
                                                                                                                                                                                                case 1897586258:
                                                                                                                                                                                                   break label1684;
                                                                                                                                                                                                case 2012823963:
                                                                                                                                                                                                   break label1685;
                                                                                                                                                                                                case 2065282114:
                                                                                                                                                                                                   break label1666;
                                                                                                                                                                                                case 2079860872:
                                                                                                                                                                                                   break label1662;
                                                                                                                                                                                                default:
                                                                                                                                                                                                   throw new RuntimeException(new IOException(
                                                                                                                                                                                                      "Error in hash"
                                                                                                                                                                                                   ));
                                                                                                                                                                                             }
                                                                                                                                                                                          }

                                                                                                                                                                                          while (true) {
                                                                                                                                                                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                                                var231
                                                                                                                                                                                             )) {
                                                                                                                                                                                                case 203065869:
                                                                                                                                                                                                   var231 ^= 1784700451;
                                                                                                                                                                                                   break label1738;
                                                                                                                                                                                                case 370204887:
                                                                                                                                                                                                   break;
                                                                                                                                                                                                case 396525126:
                                                                                                                                                                                                default:
                                                                                                                                                                                                   throw new IllegalStateException();
                                                                                                                                                                                                case 1189861374:
                                                                                                                                                                                                   break label1738;
                                                                                                                                                                                             }
                                                                                                                                                                                          }
                                                                                                                                                                                       }

                                                                                                                                                                                       var231 ^= 1913620971;

                                                                                                                                                                                       try {
                                                                                                                                                                                          var132 = (byte)(
                                                                                                                                                                                             831392540
                                                                                                                                                                                                ^ var231
                                                                                                                                                                                          );
                                                                                                                                                                                          var231 ^= 1294810250;
                                                                                                                                                                                       } catch (Throwable var242) {
                                                                                                                                                                                          var10000 = var242;
                                                                                                                                                                                          switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                             var231
                                                                                                                                                                                          )) {
                                                                                                                                                                                             case -2021649678:
                                                                                                                                                                                                break label1680;
                                                                                                                                                                                             case -1938794271:
                                                                                                                                                                                                break label1694;
                                                                                                                                                                                             case -1862190239:
                                                                                                                                                                                                break label1677;
                                                                                                                                                                                             case -1853829655:
                                                                                                                                                                                                break label1667;
                                                                                                                                                                                             case -1831506759:
                                                                                                                                                                                                break label1696;
                                                                                                                                                                                             case -1722804742:
                                                                                                                                                                                                break label1660;
                                                                                                                                                                                             case -1672950864:
                                                                                                                                                                                                break label1704;
                                                                                                                                                                                             case -1665149061:
                                                                                                                                                                                                break label1697;
                                                                                                                                                                                             case -1546530294:
                                                                                                                                                                                                break label1672;
                                                                                                                                                                                             case -1476848541:
                                                                                                                                                                                                break label1683;
                                                                                                                                                                                             case -1409350039:
                                                                                                                                                                                                break label1758;
                                                                                                                                                                                             case -1263565367:
                                                                                                                                                                                                break label1687;
                                                                                                                                                                                             case -1242278462:
                                                                                                                                                                                                break label1661;
                                                                                                                                                                                             case -1239724632:
                                                                                                                                                                                                break label1701;
                                                                                                                                                                                             case -1215235128:
                                                                                                                                                                                                break label1702;
                                                                                                                                                                                             case -1037556935:
                                                                                                                                                                                                break label1693;
                                                                                                                                                                                             case -1036705118:
                                                                                                                                                                                                break label1679;
                                                                                                                                                                                             case -1016315159:
                                                                                                                                                                                                break label1689;
                                                                                                                                                                                             case -695463974:
                                                                                                                                                                                                break label1686;
                                                                                                                                                                                             case -483158007:
                                                                                                                                                                                                break label1665;
                                                                                                                                                                                             case -451298125:
                                                                                                                                                                                                break label1682;
                                                                                                                                                                                             case -247506944:
                                                                                                                                                                                                break label1692;
                                                                                                                                                                                             case 426525722:
                                                                                                                                                                                                break label1681;
                                                                                                                                                                                             case 437687496:
                                                                                                                                                                                                break label1675;
                                                                                                                                                                                             case 470554554:
                                                                                                                                                                                                break label1673;
                                                                                                                                                                                             case 558675880:
                                                                                                                                                                                                break label1691;
                                                                                                                                                                                             case 793970219:
                                                                                                                                                                                                break label1699;
                                                                                                                                                                                             case 831781507:
                                                                                                                                                                                                break label1664;
                                                                                                                                                                                             case 1072522138:
                                                                                                                                                                                                break label1688;
                                                                                                                                                                                             case 1079482409:
                                                                                                                                                                                                break label1671;
                                                                                                                                                                                             case 1116075312:
                                                                                                                                                                                                break label1663;
                                                                                                                                                                                             case 1204272394:
                                                                                                                                                                                                break label1674;
                                                                                                                                                                                             case 1375291912:
                                                                                                                                                                                                break label1668;
                                                                                                                                                                                             case 1412274147:
                                                                                                                                                                                                break label1670;
                                                                                                                                                                                             case 1456331563:
                                                                                                                                                                                                break label1676;
                                                                                                                                                                                             case 1461405355:
                                                                                                                                                                                                break label1678;
                                                                                                                                                                                             case 1482069162:
                                                                                                                                                                                                break label1669;
                                                                                                                                                                                             case 1709059979:
                                                                                                                                                                                                break label1698;
                                                                                                                                                                                             case 1802811963:
                                                                                                                                                                                                break label1690;
                                                                                                                                                                                             case 1806779723:
                                                                                                                                                                                                break label1695;
                                                                                                                                                                                             case 1807565554:
                                                                                                                                                                                                break label1703;
                                                                                                                                                                                             case 1815357832:
                                                                                                                                                                                                break label1700;
                                                                                                                                                                                             case 1897586258:
                                                                                                                                                                                                break label1684;
                                                                                                                                                                                             case 2012823963:
                                                                                                                                                                                                break label1685;
                                                                                                                                                                                             case 2065282114:
                                                                                                                                                                                                break label1666;
                                                                                                                                                                                             case 2079860872:
                                                                                                                                                                                                break label1662;
                                                                                                                                                                                             default:
                                                                                                                                                                                                throw new RuntimeException(new IOException(
                                                                                                                                                                                                   "Error in hash"
                                                                                                                                                                                                ));
                                                                                                                                                                                          }
                                                                                                                                                                                       }
                                                                                                                                                                                    }

                                                                                                                                                                                    byte var26;
                                                                                                                                                                                    label1532: {
                                                                                                                                                                                       label1531: {
                                                                                                                                                                                          label1530: {
                                                                                                                                                                                             label1741: {
                                                                                                                                                                                                try {
                                                                                                                                                                                                   var26 = var132;
                                                                                                                                                                                                   if (var132
                                                                                                                                                                                                      != (
                                                                                                                                                                                                         2091071382
                                                                                                                                                                                                            ^ var231
                                                                                                                                                                                                      )
                                                                                                                                                                                                      )
                                                                                                                                                                                                    {
                                                                                                                                                                                                      var231 ^= 2022351203;
                                                                                                                                                                                                      if (var23
                                                                                                                                                                                                         != (
                                                                                                                                                                                                            69834485
                                                                                                                                                                                                               ^ var231
                                                                                                                                                                                                         )
                                                                                                                                                                                                         )
                                                                                                                                                                                                       {
                                                                                                                                                                                                         break label1530;
                                                                                                                                                                                                      }

                                                                                                                                                                                                      var231 ^= 1242221887;
                                                                                                                                                                                                      int var192 = var18
                                                                                                                                                                                                         + var21;
                                                                                                                                                                                                      byte var94 = (byte)((this.isArea(
                                                                                                                                                                                                         var24,
                                                                                                                                                                                                         var192,
                                                                                                                                                                                                         var22
                                                                                                                                                                                                      )) ? 1 : 0);
                                                                                                                                                                                                      if (var94
                                                                                                                                                                                                         == (
                                                                                                                                                                                                            1310940106
                                                                                                                                                                                                               ^ var231
                                                                                                                                                                                                         )
                                                                                                                                                                                                         )
                                                                                                                                                                                                       {
                                                                                                                                                                                                         break label1531;
                                                                                                                                                                                                      }

                                                                                                                                                                                                      var231 ^= 487151989;
                                                                                                                                                                                                      int var194 = var18
                                                                                                                                                                                                         + var21;
                                                                                                                                                                                                      this.stack(
                                                                                                                                                                                                         var24,
                                                                                                                                                                                                         var194,
                                                                                                                                                                                                         var22
                                                                                                                                                                                                      );
                                                                                                                                                                                                      break label1741;
                                                                                                                                                                                                   }
                                                                                                                                                                                                } catch (Throwable var253) {
                                                                                                                                                                                                   var10000 = var253;
                                                                                                                                                                                                   switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                                      var231
                                                                                                                                                                                                   )) {
                                                                                                                                                                                                      case -2021649678:
                                                                                                                                                                                                         break label1680;
                                                                                                                                                                                                      case -1938794271:
                                                                                                                                                                                                         break label1694;
                                                                                                                                                                                                      case -1862190239:
                                                                                                                                                                                                         break label1677;
                                                                                                                                                                                                      case -1853829655:
                                                                                                                                                                                                         break label1667;
                                                                                                                                                                                                      case -1831506759:
                                                                                                                                                                                                         break label1696;
                                                                                                                                                                                                      case -1722804742:
                                                                                                                                                                                                         break label1660;
                                                                                                                                                                                                      case -1672950864:
                                                                                                                                                                                                         break label1704;
                                                                                                                                                                                                      case -1665149061:
                                                                                                                                                                                                         break label1697;
                                                                                                                                                                                                      case -1546530294:
                                                                                                                                                                                                         break label1672;
                                                                                                                                                                                                      case -1476848541:
                                                                                                                                                                                                         break label1683;
                                                                                                                                                                                                      case -1409350039:
                                                                                                                                                                                                         break label1758;
                                                                                                                                                                                                      case -1263565367:
                                                                                                                                                                                                         break label1687;
                                                                                                                                                                                                      case -1242278462:
                                                                                                                                                                                                         break label1661;
                                                                                                                                                                                                      case -1239724632:
                                                                                                                                                                                                         break label1701;
                                                                                                                                                                                                      case -1215235128:
                                                                                                                                                                                                         break label1702;
                                                                                                                                                                                                      case -1037556935:
                                                                                                                                                                                                         break label1693;
                                                                                                                                                                                                      case -1036705118:
                                                                                                                                                                                                         break label1679;
                                                                                                                                                                                                      case -1016315159:
                                                                                                                                                                                                         break label1689;
                                                                                                                                                                                                      case -695463974:
                                                                                                                                                                                                         break label1686;
                                                                                                                                                                                                      case -483158007:
                                                                                                                                                                                                         break label1665;
                                                                                                                                                                                                      case -451298125:
                                                                                                                                                                                                         break label1682;
                                                                                                                                                                                                      case -247506944:
                                                                                                                                                                                                         break label1692;
                                                                                                                                                                                                      case 426525722:
                                                                                                                                                                                                         break label1681;
                                                                                                                                                                                                      case 437687496:
                                                                                                                                                                                                         break label1675;
                                                                                                                                                                                                      case 470554554:
                                                                                                                                                                                                         break label1673;
                                                                                                                                                                                                      case 558675880:
                                                                                                                                                                                                         break label1691;
                                                                                                                                                                                                      case 793970219:
                                                                                                                                                                                                         break label1699;
                                                                                                                                                                                                      case 831781507:
                                                                                                                                                                                                         break label1664;
                                                                                                                                                                                                      case 1072522138:
                                                                                                                                                                                                         break label1688;
                                                                                                                                                                                                      case 1079482409:
                                                                                                                                                                                                         break label1671;
                                                                                                                                                                                                      case 1116075312:
                                                                                                                                                                                                         break label1663;
                                                                                                                                                                                                      case 1204272394:
                                                                                                                                                                                                         break label1674;
                                                                                                                                                                                                      case 1375291912:
                                                                                                                                                                                                         break label1668;
                                                                                                                                                                                                      case 1412274147:
                                                                                                                                                                                                         break label1670;
                                                                                                                                                                                                      case 1456331563:
                                                                                                                                                                                                         break label1676;
                                                                                                                                                                                                      case 1461405355:
                                                                                                                                                                                                         break label1678;
                                                                                                                                                                                                      case 1482069162:
                                                                                                                                                                                                         break label1669;
                                                                                                                                                                                                      case 1709059979:
                                                                                                                                                                                                         break label1698;
                                                                                                                                                                                                      case 1802811963:
                                                                                                                                                                                                         break label1690;
                                                                                                                                                                                                      case 1806779723:
                                                                                                                                                                                                         break label1695;
                                                                                                                                                                                                      case 1807565554:
                                                                                                                                                                                                         break label1703;
                                                                                                                                                                                                      case 1815357832:
                                                                                                                                                                                                         break label1700;
                                                                                                                                                                                                      case 1897586258:
                                                                                                                                                                                                         break label1684;
                                                                                                                                                                                                      case 2012823963:
                                                                                                                                                                                                         break label1685;
                                                                                                                                                                                                      case 2065282114:
                                                                                                                                                                                                         break label1666;
                                                                                                                                                                                                      case 2079860872:
                                                                                                                                                                                                         break label1662;
                                                                                                                                                                                                      default:
                                                                                                                                                                                                         throw new RuntimeException(new IOException(
                                                                                                                                                                                                            "Error in hash"
                                                                                                                                                                                                         ));
                                                                                                                                                                                                   }
                                                                                                                                                                                                }

                                                                                                                                                                                                var231 ^= 933881091;

                                                                                                                                                                                                label1514: {
                                                                                                                                                                                                   label1513: {
                                                                                                                                                                                                      try {
                                                                                                                                                                                                         byte var98 = (byte)((this.probing) ? 1 : 0);
                                                                                                                                                                                                         if (var98
                                                                                                                                                                                                            == (
                                                                                                                                                                                                               1259000469
                                                                                                                                                                                                                  ^ var231
                                                                                                                                                                                                            )
                                                                                                                                                                                                            )
                                                                                                                                                                                                          {
                                                                                                                                                                                                            break label1514;
                                                                                                                                                                                                         }

                                                                                                                                                                                                         var231 ^= 136796694;
                                                                                                                                                                                                         byte var100 = (byte)((isBlob(
                                                                                                                                                                                                            var25
                                                                                                                                                                                                         )) ? 1 : 0);
                                                                                                                                                                                                         if (var100
                                                                                                                                                                                                            == (
                                                                                                                                                                                                               1127057539
                                                                                                                                                                                                                  ^ var231
                                                                                                                                                                                                            )
                                                                                                                                                                                                            )
                                                                                                                                                                                                          {
                                                                                                                                                                                                            break label1513;
                                                                                                                                                                                                         }

                                                                                                                                                                                                         var231 ^= 1280478610;
                                                                                                                                                                                                         byte var172 = (byte)(
                                                                                                                                                                                                            259982608
                                                                                                                                                                                                               ^ var231
                                                                                                                                                                                                         );
                                                                                                                                                                                                         this.sawBlob = (var172 != 0);
                                                                                                                                                                                                         int var196 = var18
                                                                                                                                                                                                            + var21;
                                                                                                                                                                                                         byte var103 = (byte)((this.enclosed(
                                                                                                                                                                                                            var24,
                                                                                                                                                                                                            var196,
                                                                                                                                                                                                            var22
                                                                                                                                                                                                         )) ? 1 : 0);
                                                                                                                                                                                                         if (var103
                                                                                                                                                                                                            != (
                                                                                                                                                                                                               259982609
                                                                                                                                                                                                                  ^ var231
                                                                                                                                                                                                            )
                                                                                                                                                                                                            )
                                                                                                                                                                                                          {
                                                                                                                                                                                                            var231 ^= 1075590041;
                                                                                                                                                                                                            byte var174 = (byte)(
                                                                                                                                                                                                               1331902088
                                                                                                                                                                                                                  ^ var231
                                                                                                                                                                                                            );
                                                                                                                                                                                                            this.probing = (var174 != 0);
                                                                                                                                                                                                            LongOpenHashSet var106 = this.probed;
                                                                                                                                                                                                            var106.clear();
                                                                                                                                                                                                            var231 ^= 563879611;
                                                                                                                                                                                                            break label1532;
                                                                                                                                                                                                         }
                                                                                                                                                                                                      } catch (Throwable var252) {
                                                                                                                                                                                                         var10000 = var252;
                                                                                                                                                                                                         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                                            var231
                                                                                                                                                                                                         )) {
                                                                                                                                                                                                            case -2021649678:
                                                                                                                                                                                                               break label1680;
                                                                                                                                                                                                            case -1938794271:
                                                                                                                                                                                                               break label1694;
                                                                                                                                                                                                            case -1862190239:
                                                                                                                                                                                                               break label1677;
                                                                                                                                                                                                            case -1853829655:
                                                                                                                                                                                                               break label1667;
                                                                                                                                                                                                            case -1831506759:
                                                                                                                                                                                                               break label1696;
                                                                                                                                                                                                            case -1722804742:
                                                                                                                                                                                                               break label1660;
                                                                                                                                                                                                            case -1672950864:
                                                                                                                                                                                                               break label1704;
                                                                                                                                                                                                            case -1665149061:
                                                                                                                                                                                                               break label1697;
                                                                                                                                                                                                            case -1546530294:
                                                                                                                                                                                                               break label1672;
                                                                                                                                                                                                            case -1476848541:
                                                                                                                                                                                                               break label1683;
                                                                                                                                                                                                            case -1409350039:
                                                                                                                                                                                                               break label1758;
                                                                                                                                                                                                            case -1263565367:
                                                                                                                                                                                                               break label1687;
                                                                                                                                                                                                            case -1242278462:
                                                                                                                                                                                                               break label1661;
                                                                                                                                                                                                            case -1239724632:
                                                                                                                                                                                                               break label1701;
                                                                                                                                                                                                            case -1215235128:
                                                                                                                                                                                                               break label1702;
                                                                                                                                                                                                            case -1037556935:
                                                                                                                                                                                                               break label1693;
                                                                                                                                                                                                            case -1036705118:
                                                                                                                                                                                                               break label1679;
                                                                                                                                                                                                            case -1016315159:
                                                                                                                                                                                                               break label1689;
                                                                                                                                                                                                            case -695463974:
                                                                                                                                                                                                               break label1686;
                                                                                                                                                                                                            case -483158007:
                                                                                                                                                                                                               break label1665;
                                                                                                                                                                                                            case -451298125:
                                                                                                                                                                                                               break label1682;
                                                                                                                                                                                                            case -247506944:
                                                                                                                                                                                                               break label1692;
                                                                                                                                                                                                            case 426525722:
                                                                                                                                                                                                               break label1681;
                                                                                                                                                                                                            case 437687496:
                                                                                                                                                                                                               break label1675;
                                                                                                                                                                                                            case 470554554:
                                                                                                                                                                                                               break label1673;
                                                                                                                                                                                                            case 558675880:
                                                                                                                                                                                                               break label1691;
                                                                                                                                                                                                            case 793970219:
                                                                                                                                                                                                               break label1699;
                                                                                                                                                                                                            case 831781507:
                                                                                                                                                                                                               break label1664;
                                                                                                                                                                                                            case 1072522138:
                                                                                                                                                                                                               break label1688;
                                                                                                                                                                                                            case 1079482409:
                                                                                                                                                                                                               break label1671;
                                                                                                                                                                                                            case 1116075312:
                                                                                                                                                                                                               break label1663;
                                                                                                                                                                                                            case 1204272394:
                                                                                                                                                                                                               break label1674;
                                                                                                                                                                                                            case 1375291912:
                                                                                                                                                                                                               break label1668;
                                                                                                                                                                                                            case 1412274147:
                                                                                                                                                                                                               break label1670;
                                                                                                                                                                                                            case 1456331563:
                                                                                                                                                                                                               break label1676;
                                                                                                                                                                                                            case 1461405355:
                                                                                                                                                                                                               break label1678;
                                                                                                                                                                                                            case 1482069162:
                                                                                                                                                                                                               break label1669;
                                                                                                                                                                                                            case 1709059979:
                                                                                                                                                                                                               break label1698;
                                                                                                                                                                                                            case 1802811963:
                                                                                                                                                                                                               break label1690;
                                                                                                                                                                                                            case 1806779723:
                                                                                                                                                                                                               break label1695;
                                                                                                                                                                                                            case 1807565554:
                                                                                                                                                                                                               break label1703;
                                                                                                                                                                                                            case 1815357832:
                                                                                                                                                                                                               break label1700;
                                                                                                                                                                                                            case 1897586258:
                                                                                                                                                                                                               break label1684;
                                                                                                                                                                                                            case 2012823963:
                                                                                                                                                                                                               break label1685;
                                                                                                                                                                                                            case 2065282114:
                                                                                                                                                                                                               break label1666;
                                                                                                                                                                                                            case 2079860872:
                                                                                                                                                                                                               break label1662;
                                                                                                                                                                                                            default:
                                                                                                                                                                                                               throw new RuntimeException(new IOException(
                                                                                                                                                                                                                  "Error in hash"
                                                                                                                                                                                                               ));
                                                                                                                                                                                                         }
                                                                                                                                                                                                      }

                                                                                                                                                                                                      var231 ^= 1635790114;
                                                                                                                                                                                                      break label1532;
                                                                                                                                                                                                   }

                                                                                                                                                                                                   var231 = syfpllerxlszxeld(
                                                                                                                                                                                                      var231,
                                                                                                                                                                                                      768778416
                                                                                                                                                                                                   );
                                                                                                                                                                                                   break label1532;
                                                                                                                                                                                                }

                                                                                                                                                                                                var231 = syfpllerxlszxeld(
                                                                                                                                                                                                   var231,
                                                                                                                                                                                                   636877478
                                                                                                                                                                                                );
                                                                                                                                                                                                break label1532;
                                                                                                                                                                                             }

                                                                                                                                                                                             var231 = syfpllerxlszxeld(
                                                                                                                                                                                                var231,
                                                                                                                                                                                                1037380236
                                                                                                                                                                                             );
                                                                                                                                                                                             break label1532;
                                                                                                                                                                                          }

                                                                                                                                                                                          var231 ^= 1792458438;
                                                                                                                                                                                          break label1532;
                                                                                                                                                                                       }

                                                                                                                                                                                       var231 ^= 551318521;
                                                                                                                                                                                    }

                                                                                                                                                                                    try {
                                                                                                                                                                                       var23 = var26;
                                                                                                                                                                                       var24 += 1862215730
                                                                                                                                                                                          ^ var231;
                                                                                                                                                                                    } catch (Throwable var241) {
                                                                                                                                                                                       var10000 = var241;
                                                                                                                                                                                       switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                          var231
                                                                                                                                                                                       )) {
                                                                                                                                                                                          case -2021649678:
                                                                                                                                                                                             break label1680;
                                                                                                                                                                                          case -1938794271:
                                                                                                                                                                                             break label1694;
                                                                                                                                                                                          case -1862190239:
                                                                                                                                                                                             break label1677;
                                                                                                                                                                                          case -1853829655:
                                                                                                                                                                                             break label1667;
                                                                                                                                                                                          case -1831506759:
                                                                                                                                                                                             break label1696;
                                                                                                                                                                                          case -1722804742:
                                                                                                                                                                                             break label1660;
                                                                                                                                                                                          case -1672950864:
                                                                                                                                                                                             break label1704;
                                                                                                                                                                                          case -1665149061:
                                                                                                                                                                                             break label1697;
                                                                                                                                                                                          case -1546530294:
                                                                                                                                                                                             break label1672;
                                                                                                                                                                                          case -1476848541:
                                                                                                                                                                                             break label1683;
                                                                                                                                                                                          case -1409350039:
                                                                                                                                                                                             break label1758;
                                                                                                                                                                                          case -1263565367:
                                                                                                                                                                                             break label1687;
                                                                                                                                                                                          case -1242278462:
                                                                                                                                                                                             break label1661;
                                                                                                                                                                                          case -1239724632:
                                                                                                                                                                                             break label1701;
                                                                                                                                                                                          case -1215235128:
                                                                                                                                                                                             break label1702;
                                                                                                                                                                                          case -1037556935:
                                                                                                                                                                                             break label1693;
                                                                                                                                                                                          case -1036705118:
                                                                                                                                                                                             break label1679;
                                                                                                                                                                                          case -1016315159:
                                                                                                                                                                                             break label1689;
                                                                                                                                                                                          case -695463974:
                                                                                                                                                                                             break label1686;
                                                                                                                                                                                          case -483158007:
                                                                                                                                                                                             break label1665;
                                                                                                                                                                                          case -451298125:
                                                                                                                                                                                             break label1682;
                                                                                                                                                                                          case -247506944:
                                                                                                                                                                                             break label1692;
                                                                                                                                                                                          case 426525722:
                                                                                                                                                                                             break label1681;
                                                                                                                                                                                          case 437687496:
                                                                                                                                                                                             break label1675;
                                                                                                                                                                                          case 470554554:
                                                                                                                                                                                             break label1673;
                                                                                                                                                                                          case 558675880:
                                                                                                                                                                                             break label1691;
                                                                                                                                                                                          case 793970219:
                                                                                                                                                                                             break label1699;
                                                                                                                                                                                          case 831781507:
                                                                                                                                                                                             break label1664;
                                                                                                                                                                                          case 1072522138:
                                                                                                                                                                                             break label1688;
                                                                                                                                                                                          case 1079482409:
                                                                                                                                                                                             break label1671;
                                                                                                                                                                                          case 1116075312:
                                                                                                                                                                                             break label1663;
                                                                                                                                                                                          case 1204272394:
                                                                                                                                                                                             break label1674;
                                                                                                                                                                                          case 1375291912:
                                                                                                                                                                                             break label1668;
                                                                                                                                                                                          case 1412274147:
                                                                                                                                                                                             break label1670;
                                                                                                                                                                                          case 1456331563:
                                                                                                                                                                                             break label1676;
                                                                                                                                                                                          case 1461405355:
                                                                                                                                                                                             break label1678;
                                                                                                                                                                                          case 1482069162:
                                                                                                                                                                                             break label1669;
                                                                                                                                                                                          case 1709059979:
                                                                                                                                                                                             break label1698;
                                                                                                                                                                                          case 1802811963:
                                                                                                                                                                                             break label1690;
                                                                                                                                                                                          case 1806779723:
                                                                                                                                                                                             break label1695;
                                                                                                                                                                                          case 1807565554:
                                                                                                                                                                                             break label1703;
                                                                                                                                                                                          case 1815357832:
                                                                                                                                                                                             break label1700;
                                                                                                                                                                                          case 1897586258:
                                                                                                                                                                                             break label1684;
                                                                                                                                                                                          case 2012823963:
                                                                                                                                                                                             break label1685;
                                                                                                                                                                                          case 2065282114:
                                                                                                                                                                                             break label1666;
                                                                                                                                                                                          case 2079860872:
                                                                                                                                                                                             break label1662;
                                                                                                                                                                                          default:
                                                                                                                                                                                             throw new RuntimeException(new IOException(
                                                                                                                                                                                                "Error in hash"
                                                                                                                                                                                             ));
                                                                                                                                                                                       }
                                                                                                                                                                                    }

                                                                                                                                                                                    var231 ^= 59883380;
                                                                                                                                                                                 }

                                                                                                                                                                                 label1544:
                                                                                                                                                                                 while (true) {
                                                                                                                                                                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                                       var231
                                                                                                                                                                                    )) {
                                                                                                                                                                                       case 67512439:
                                                                                                                                                                                          var231 ^= 1033803033;
                                                                                                                                                                                          break label1544;
                                                                                                                                                                                       case 589440529:
                                                                                                                                                                                       default:
                                                                                                                                                                                          throw new IllegalStateException();
                                                                                                                                                                                       case 1516751784:
                                                                                                                                                                                          break label1544;
                                                                                                                                                                                       case 1640438163:
                                                                                                                                                                                    }
                                                                                                                                                                                 }

                                                                                                                                                                                 try {
                                                                                                                                                                                    var22 += 1357906527
                                                                                                                                                                                       ^ var231;
                                                                                                                                                                                 } catch (Throwable var240) {
                                                                                                                                                                                    var10000 = var240;
                                                                                                                                                                                    switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                       var231
                                                                                                                                                                                    )) {
                                                                                                                                                                                       case -2021649678:
                                                                                                                                                                                          break label1680;
                                                                                                                                                                                       case -1938794271:
                                                                                                                                                                                          break label1694;
                                                                                                                                                                                       case -1862190239:
                                                                                                                                                                                          break label1677;
                                                                                                                                                                                       case -1853829655:
                                                                                                                                                                                          break label1667;
                                                                                                                                                                                       case -1831506759:
                                                                                                                                                                                          break label1696;
                                                                                                                                                                                       case -1722804742:
                                                                                                                                                                                          break label1660;
                                                                                                                                                                                       case -1672950864:
                                                                                                                                                                                          break label1704;
                                                                                                                                                                                       case -1665149061:
                                                                                                                                                                                          break label1697;
                                                                                                                                                                                       case -1546530294:
                                                                                                                                                                                          break label1672;
                                                                                                                                                                                       case -1476848541:
                                                                                                                                                                                          break label1683;
                                                                                                                                                                                       case -1409350039:
                                                                                                                                                                                          break label1758;
                                                                                                                                                                                       case -1263565367:
                                                                                                                                                                                          break label1687;
                                                                                                                                                                                       case -1242278462:
                                                                                                                                                                                          break label1661;
                                                                                                                                                                                       case -1239724632:
                                                                                                                                                                                          break label1701;
                                                                                                                                                                                       case -1215235128:
                                                                                                                                                                                          break label1702;
                                                                                                                                                                                       case -1037556935:
                                                                                                                                                                                          break label1693;
                                                                                                                                                                                       case -1036705118:
                                                                                                                                                                                          break label1679;
                                                                                                                                                                                       case -1016315159:
                                                                                                                                                                                          break label1689;
                                                                                                                                                                                       case -695463974:
                                                                                                                                                                                          break label1686;
                                                                                                                                                                                       case -483158007:
                                                                                                                                                                                          break label1665;
                                                                                                                                                                                       case -451298125:
                                                                                                                                                                                          break label1682;
                                                                                                                                                                                       case -247506944:
                                                                                                                                                                                          break label1692;
                                                                                                                                                                                       case 426525722:
                                                                                                                                                                                          break label1681;
                                                                                                                                                                                       case 437687496:
                                                                                                                                                                                          break label1675;
                                                                                                                                                                                       case 470554554:
                                                                                                                                                                                          break label1673;
                                                                                                                                                                                       case 558675880:
                                                                                                                                                                                          break label1691;
                                                                                                                                                                                       case 793970219:
                                                                                                                                                                                          break label1699;
                                                                                                                                                                                       case 831781507:
                                                                                                                                                                                          break label1664;
                                                                                                                                                                                       case 1072522138:
                                                                                                                                                                                          break label1688;
                                                                                                                                                                                       case 1079482409:
                                                                                                                                                                                          break label1671;
                                                                                                                                                                                       case 1116075312:
                                                                                                                                                                                          break label1663;
                                                                                                                                                                                       case 1204272394:
                                                                                                                                                                                          break label1674;
                                                                                                                                                                                       case 1375291912:
                                                                                                                                                                                          break label1668;
                                                                                                                                                                                       case 1412274147:
                                                                                                                                                                                          break label1670;
                                                                                                                                                                                       case 1456331563:
                                                                                                                                                                                          break label1676;
                                                                                                                                                                                       case 1461405355:
                                                                                                                                                                                          break label1678;
                                                                                                                                                                                       case 1482069162:
                                                                                                                                                                                          break label1669;
                                                                                                                                                                                       case 1709059979:
                                                                                                                                                                                          break label1698;
                                                                                                                                                                                       case 1802811963:
                                                                                                                                                                                          break label1690;
                                                                                                                                                                                       case 1806779723:
                                                                                                                                                                                          break label1695;
                                                                                                                                                                                       case 1807565554:
                                                                                                                                                                                          break label1703;
                                                                                                                                                                                       case 1815357832:
                                                                                                                                                                                          break label1700;
                                                                                                                                                                                       case 1897586258:
                                                                                                                                                                                          break label1684;
                                                                                                                                                                                       case 2012823963:
                                                                                                                                                                                          break label1685;
                                                                                                                                                                                       case 2065282114:
                                                                                                                                                                                          break label1666;
                                                                                                                                                                                       case 2079860872:
                                                                                                                                                                                          break label1662;
                                                                                                                                                                                       default:
                                                                                                                                                                                          throw new RuntimeException(new IOException(
                                                                                                                                                                                             "Error in hash"
                                                                                                                                                                                          ));
                                                                                                                                                                                    }
                                                                                                                                                                                 }

                                                                                                                                                                                 var231 = syfpllerxlszxeld(
                                                                                                                                                                                    var231,
                                                                                                                                                                                    146187786
                                                                                                                                                                                 );
                                                                                                                                                                              }

                                                                                                                                                                              label1557:
                                                                                                                                                                              while (true) {
                                                                                                                                                                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                                    var231
                                                                                                                                                                                 )) {
                                                                                                                                                                                    case 185108004:
                                                                                                                                                                                       var231 ^= 43460015;
                                                                                                                                                                                    case 921240314:
                                                                                                                                                                                       break label1557;
                                                                                                                                                                                    case 1124184253:
                                                                                                                                                                                       break;
                                                                                                                                                                                    case 1340081411:
                                                                                                                                                                                    default:
                                                                                                                                                                                       throw new IllegalStateException();
                                                                                                                                                                                 }
                                                                                                                                                                              }

                                                                                                                                                                              try {
                                                                                                                                                                                 var21 += 1523679738
                                                                                                                                                                                    ^ var231;
                                                                                                                                                                              } catch (Throwable var239) {
                                                                                                                                                                                 var10000 = var239;
                                                                                                                                                                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                                    var231
                                                                                                                                                                                 )) {
                                                                                                                                                                                    case -2021649678:
                                                                                                                                                                                       break label1680;
                                                                                                                                                                                    case -1938794271:
                                                                                                                                                                                       break label1694;
                                                                                                                                                                                    case -1862190239:
                                                                                                                                                                                       break label1677;
                                                                                                                                                                                    case -1853829655:
                                                                                                                                                                                       break label1667;
                                                                                                                                                                                    case -1831506759:
                                                                                                                                                                                       break label1696;
                                                                                                                                                                                    case -1722804742:
                                                                                                                                                                                       break label1660;
                                                                                                                                                                                    case -1672950864:
                                                                                                                                                                                       break label1704;
                                                                                                                                                                                    case -1665149061:
                                                                                                                                                                                       break label1697;
                                                                                                                                                                                    case -1546530294:
                                                                                                                                                                                       break label1672;
                                                                                                                                                                                    case -1476848541:
                                                                                                                                                                                       break label1683;
                                                                                                                                                                                    case -1409350039:
                                                                                                                                                                                       break label1758;
                                                                                                                                                                                    case -1263565367:
                                                                                                                                                                                       break label1687;
                                                                                                                                                                                    case -1242278462:
                                                                                                                                                                                       break label1661;
                                                                                                                                                                                    case -1239724632:
                                                                                                                                                                                       break label1701;
                                                                                                                                                                                    case -1215235128:
                                                                                                                                                                                       break label1702;
                                                                                                                                                                                    case -1037556935:
                                                                                                                                                                                       break label1693;
                                                                                                                                                                                    case -1036705118:
                                                                                                                                                                                       break label1679;
                                                                                                                                                                                    case -1016315159:
                                                                                                                                                                                       break label1689;
                                                                                                                                                                                    case -695463974:
                                                                                                                                                                                       break label1686;
                                                                                                                                                                                    case -483158007:
                                                                                                                                                                                       break label1665;
                                                                                                                                                                                    case -451298125:
                                                                                                                                                                                       break label1682;
                                                                                                                                                                                    case -247506944:
                                                                                                                                                                                       break label1692;
                                                                                                                                                                                    case 426525722:
                                                                                                                                                                                       break label1681;
                                                                                                                                                                                    case 437687496:
                                                                                                                                                                                       break label1675;
                                                                                                                                                                                    case 470554554:
                                                                                                                                                                                       break label1673;
                                                                                                                                                                                    case 558675880:
                                                                                                                                                                                       break label1691;
                                                                                                                                                                                    case 793970219:
                                                                                                                                                                                       break label1699;
                                                                                                                                                                                    case 831781507:
                                                                                                                                                                                       break label1664;
                                                                                                                                                                                    case 1072522138:
                                                                                                                                                                                       break label1688;
                                                                                                                                                                                    case 1079482409:
                                                                                                                                                                                       break label1671;
                                                                                                                                                                                    case 1116075312:
                                                                                                                                                                                       break label1663;
                                                                                                                                                                                    case 1204272394:
                                                                                                                                                                                       break label1674;
                                                                                                                                                                                    case 1375291912:
                                                                                                                                                                                       break label1668;
                                                                                                                                                                                    case 1412274147:
                                                                                                                                                                                       break label1670;
                                                                                                                                                                                    case 1456331563:
                                                                                                                                                                                       break label1676;
                                                                                                                                                                                    case 1461405355:
                                                                                                                                                                                       break label1678;
                                                                                                                                                                                    case 1482069162:
                                                                                                                                                                                       break label1669;
                                                                                                                                                                                    case 1709059979:
                                                                                                                                                                                       break label1698;
                                                                                                                                                                                    case 1802811963:
                                                                                                                                                                                       break label1690;
                                                                                                                                                                                    case 1806779723:
                                                                                                                                                                                       break label1695;
                                                                                                                                                                                    case 1807565554:
                                                                                                                                                                                       break label1703;
                                                                                                                                                                                    case 1815357832:
                                                                                                                                                                                       break label1700;
                                                                                                                                                                                    case 1897586258:
                                                                                                                                                                                       break label1684;
                                                                                                                                                                                    case 2012823963:
                                                                                                                                                                                       break label1685;
                                                                                                                                                                                    case 2065282114:
                                                                                                                                                                                       break label1666;
                                                                                                                                                                                    case 2079860872:
                                                                                                                                                                                       break label1662;
                                                                                                                                                                                    default:
                                                                                                                                                                                       throw new RuntimeException(new IOException(
                                                                                                                                                                                          "Error in hash"
                                                                                                                                                                                       ));
                                                                                                                                                                                 }
                                                                                                                                                                              }

                                                                                                                                                                              var231 ^= 1873699126;
                                                                                                                                                                           }

                                                                                                                                                                           var231 = syfpllerxlszxeld(
                                                                                                                                                                              var231,
                                                                                                                                                                              1610240561
                                                                                                                                                                           );
                                                                                                                                                                           break label1655;
                                                                                                                                                                        }

                                                                                                                                                                        var231 ^= 258986553;
                                                                                                                                                                        break label1655;
                                                                                                                                                                     }

                                                                                                                                                                     var231 = syfpllerxlszxeld(
                                                                                                                                                                        var231,
                                                                                                                                                                        1388361371
                                                                                                                                                                     );
                                                                                                                                                                     break label1655;
                                                                                                                                                                  }

                                                                                                                                                                  var231 = syfpllerxlszxeld(
                                                                                                                                                                     var231,
                                                                                                                                                                     213372332
                                                                                                                                                                  );
                                                                                                                                                                  break label1655;
                                                                                                                                                               }

                                                                                                                                                               var231 ^= 1390951073;
                                                                                                                                                            }

                                                                                                                                                            try {
                                                                                                                                                               var16 += 1787147005
                                                                                                                                                                  ^ var231;
                                                                                                                                                            } catch (Throwable var238) {
                                                                                                                                                               var10000 = var238;
                                                                                                                                                               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                  var231
                                                                                                                                                               )) {
                                                                                                                                                                  case -2021649678:
                                                                                                                                                                     break label1680;
                                                                                                                                                                  case -1938794271:
                                                                                                                                                                     break label1694;
                                                                                                                                                                  case -1862190239:
                                                                                                                                                                     break label1677;
                                                                                                                                                                  case -1853829655:
                                                                                                                                                                     break label1667;
                                                                                                                                                                  case -1831506759:
                                                                                                                                                                     break label1696;
                                                                                                                                                                  case -1722804742:
                                                                                                                                                                     break label1660;
                                                                                                                                                                  case -1672950864:
                                                                                                                                                                     break label1704;
                                                                                                                                                                  case -1665149061:
                                                                                                                                                                     break label1697;
                                                                                                                                                                  case -1546530294:
                                                                                                                                                                     break label1672;
                                                                                                                                                                  case -1476848541:
                                                                                                                                                                     break label1683;
                                                                                                                                                                  case -1409350039:
                                                                                                                                                                     break label1758;
                                                                                                                                                                  case -1263565367:
                                                                                                                                                                     break label1687;
                                                                                                                                                                  case -1242278462:
                                                                                                                                                                     break label1661;
                                                                                                                                                                  case -1239724632:
                                                                                                                                                                     break label1701;
                                                                                                                                                                  case -1215235128:
                                                                                                                                                                     break label1702;
                                                                                                                                                                  case -1037556935:
                                                                                                                                                                     break label1693;
                                                                                                                                                                  case -1036705118:
                                                                                                                                                                     break label1679;
                                                                                                                                                                  case -1016315159:
                                                                                                                                                                     break label1689;
                                                                                                                                                                  case -695463974:
                                                                                                                                                                     break label1686;
                                                                                                                                                                  case -483158007:
                                                                                                                                                                     break label1665;
                                                                                                                                                                  case -451298125:
                                                                                                                                                                     break label1682;
                                                                                                                                                                  case -247506944:
                                                                                                                                                                     break label1692;
                                                                                                                                                                  case 426525722:
                                                                                                                                                                     break label1681;
                                                                                                                                                                  case 437687496:
                                                                                                                                                                     break label1675;
                                                                                                                                                                  case 470554554:
                                                                                                                                                                     break label1673;
                                                                                                                                                                  case 558675880:
                                                                                                                                                                     break label1691;
                                                                                                                                                                  case 793970219:
                                                                                                                                                                     break label1699;
                                                                                                                                                                  case 831781507:
                                                                                                                                                                     break label1664;
                                                                                                                                                                  case 1072522138:
                                                                                                                                                                     break label1688;
                                                                                                                                                                  case 1079482409:
                                                                                                                                                                     break label1671;
                                                                                                                                                                  case 1116075312:
                                                                                                                                                                     break label1663;
                                                                                                                                                                  case 1204272394:
                                                                                                                                                                     break label1674;
                                                                                                                                                                  case 1375291912:
                                                                                                                                                                     break label1668;
                                                                                                                                                                  case 1412274147:
                                                                                                                                                                     break label1670;
                                                                                                                                                                  case 1456331563:
                                                                                                                                                                     break label1676;
                                                                                                                                                                  case 1461405355:
                                                                                                                                                                     break label1678;
                                                                                                                                                                  case 1482069162:
                                                                                                                                                                     break label1669;
                                                                                                                                                                  case 1709059979:
                                                                                                                                                                     break label1698;
                                                                                                                                                                  case 1802811963:
                                                                                                                                                                     break label1690;
                                                                                                                                                                  case 1806779723:
                                                                                                                                                                     break label1695;
                                                                                                                                                                  case 1807565554:
                                                                                                                                                                     break label1703;
                                                                                                                                                                  case 1815357832:
                                                                                                                                                                     break label1700;
                                                                                                                                                                  case 1897586258:
                                                                                                                                                                     break label1684;
                                                                                                                                                                  case 2012823963:
                                                                                                                                                                     break label1685;
                                                                                                                                                                  case 2065282114:
                                                                                                                                                                     break label1666;
                                                                                                                                                                  case 2079860872:
                                                                                                                                                                     break label1662;
                                                                                                                                                                  default:
                                                                                                                                                                     throw new RuntimeException(new IOException(
                                                                                                                                                                        "Error in hash"
                                                                                                                                                                     ));
                                                                                                                                                               }
                                                                                                                                                            }

                                                                                                                                                            var231 ^= 1010513988;
                                                                                                                                                         }

                                                                                                                                                         var231 ^= 2125756861;

                                                                                                                                                         int var226;
                                                                                                                                                         try {
                                                                                                                                                            byte var108 = (byte)(
                                                                                                                                                               671806213
                                                                                                                                                                  ^ var231
                                                                                                                                                            );
                                                                                                                                                            var226 = var108;
                                                                                                                                                            var231 ^= 908924933;
                                                                                                                                                         } catch (Throwable var237) {
                                                                                                                                                            var10000 = var237;
                                                                                                                                                            switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                               var231
                                                                                                                                                            )) {
                                                                                                                                                               case -2021649678:
                                                                                                                                                                  break label1680;
                                                                                                                                                               case -1938794271:
                                                                                                                                                                  break label1694;
                                                                                                                                                               case -1862190239:
                                                                                                                                                                  break label1677;
                                                                                                                                                               case -1853829655:
                                                                                                                                                                  break label1667;
                                                                                                                                                               case -1831506759:
                                                                                                                                                                  break label1696;
                                                                                                                                                               case -1722804742:
                                                                                                                                                                  break label1660;
                                                                                                                                                               case -1672950864:
                                                                                                                                                                  break label1704;
                                                                                                                                                               case -1665149061:
                                                                                                                                                                  break label1697;
                                                                                                                                                               case -1546530294:
                                                                                                                                                                  break label1672;
                                                                                                                                                               case -1476848541:
                                                                                                                                                                  break label1683;
                                                                                                                                                               case -1409350039:
                                                                                                                                                                  break label1758;
                                                                                                                                                               case -1263565367:
                                                                                                                                                                  break label1687;
                                                                                                                                                               case -1242278462:
                                                                                                                                                                  break label1661;
                                                                                                                                                               case -1239724632:
                                                                                                                                                                  break label1701;
                                                                                                                                                               case -1215235128:
                                                                                                                                                                  break label1702;
                                                                                                                                                               case -1037556935:
                                                                                                                                                                  break label1693;
                                                                                                                                                               case -1036705118:
                                                                                                                                                                  break label1679;
                                                                                                                                                               case -1016315159:
                                                                                                                                                                  break label1689;
                                                                                                                                                               case -695463974:
                                                                                                                                                                  break label1686;
                                                                                                                                                               case -483158007:
                                                                                                                                                                  break label1665;
                                                                                                                                                               case -451298125:
                                                                                                                                                                  break label1682;
                                                                                                                                                               case -247506944:
                                                                                                                                                                  break label1692;
                                                                                                                                                               case 426525722:
                                                                                                                                                                  break label1681;
                                                                                                                                                               case 437687496:
                                                                                                                                                                  break label1675;
                                                                                                                                                               case 470554554:
                                                                                                                                                                  break label1673;
                                                                                                                                                               case 558675880:
                                                                                                                                                                  break label1691;
                                                                                                                                                               case 793970219:
                                                                                                                                                                  break label1699;
                                                                                                                                                               case 831781507:
                                                                                                                                                                  break label1664;
                                                                                                                                                               case 1072522138:
                                                                                                                                                                  break label1688;
                                                                                                                                                               case 1079482409:
                                                                                                                                                                  break label1671;
                                                                                                                                                               case 1116075312:
                                                                                                                                                                  break label1663;
                                                                                                                                                               case 1204272394:
                                                                                                                                                                  break label1674;
                                                                                                                                                               case 1375291912:
                                                                                                                                                                  break label1668;
                                                                                                                                                               case 1412274147:
                                                                                                                                                                  break label1670;
                                                                                                                                                               case 1456331563:
                                                                                                                                                                  break label1676;
                                                                                                                                                               case 1461405355:
                                                                                                                                                                  break label1678;
                                                                                                                                                               case 1482069162:
                                                                                                                                                                  break label1669;
                                                                                                                                                               case 1709059979:
                                                                                                                                                                  break label1698;
                                                                                                                                                               case 1802811963:
                                                                                                                                                                  break label1690;
                                                                                                                                                               case 1806779723:
                                                                                                                                                                  break label1695;
                                                                                                                                                               case 1807565554:
                                                                                                                                                                  break label1703;
                                                                                                                                                               case 1815357832:
                                                                                                                                                                  break label1700;
                                                                                                                                                               case 1897586258:
                                                                                                                                                                  break label1684;
                                                                                                                                                               case 2012823963:
                                                                                                                                                                  break label1685;
                                                                                                                                                               case 2065282114:
                                                                                                                                                                  break label1666;
                                                                                                                                                               case 2079860872:
                                                                                                                                                                  break label1662;
                                                                                                                                                               default:
                                                                                                                                                                  throw new RuntimeException(new IOException(
                                                                                                                                                                     "Error in hash"
                                                                                                                                                                  ));
                                                                                                                                                            }
                                                                                                                                                         }

                                                                                                                                                         while (true) {
                                                                                                                                                            try {
                                                                                                                                                               short var175 = (short)(
                                                                                                                                                                  505932288
                                                                                                                                                                     ^ var231
                                                                                                                                                               );
                                                                                                                                                               if (var226
                                                                                                                                                                  >= var175
                                                                                                                                                                  )
                                                                                                                                                                {
                                                                                                                                                                  break;
                                                                                                                                                               }

                                                                                                                                                               var231 ^= 229569142;
                                                                                                                                                               this.keep(
                                                                                                                                                                  var226
                                                                                                                                                               );
                                                                                                                                                               var226 += 327752055
                                                                                                                                                                  ^ var231;
                                                                                                                                                            } catch (Throwable var248) {
                                                                                                                                                               var10000 = var248;
                                                                                                                                                               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                  var231
                                                                                                                                                               )) {
                                                                                                                                                                  case -2021649678:
                                                                                                                                                                     break label1680;
                                                                                                                                                                  case -1938794271:
                                                                                                                                                                     break label1694;
                                                                                                                                                                  case -1862190239:
                                                                                                                                                                     break label1677;
                                                                                                                                                                  case -1853829655:
                                                                                                                                                                     break label1667;
                                                                                                                                                                  case -1831506759:
                                                                                                                                                                     break label1696;
                                                                                                                                                                  case -1722804742:
                                                                                                                                                                     break label1660;
                                                                                                                                                                  case -1672950864:
                                                                                                                                                                     break label1704;
                                                                                                                                                                  case -1665149061:
                                                                                                                                                                     break label1697;
                                                                                                                                                                  case -1546530294:
                                                                                                                                                                     break label1672;
                                                                                                                                                                  case -1476848541:
                                                                                                                                                                     break label1683;
                                                                                                                                                                  case -1409350039:
                                                                                                                                                                     break label1758;
                                                                                                                                                                  case -1263565367:
                                                                                                                                                                     break label1687;
                                                                                                                                                                  case -1242278462:
                                                                                                                                                                     break label1661;
                                                                                                                                                                  case -1239724632:
                                                                                                                                                                     break label1701;
                                                                                                                                                                  case -1215235128:
                                                                                                                                                                     break label1702;
                                                                                                                                                                  case -1037556935:
                                                                                                                                                                     break label1693;
                                                                                                                                                                  case -1036705118:
                                                                                                                                                                     break label1679;
                                                                                                                                                                  case -1016315159:
                                                                                                                                                                     break label1689;
                                                                                                                                                                  case -695463974:
                                                                                                                                                                     break label1686;
                                                                                                                                                                  case -483158007:
                                                                                                                                                                     break label1665;
                                                                                                                                                                  case -451298125:
                                                                                                                                                                     break label1682;
                                                                                                                                                                  case -247506944:
                                                                                                                                                                     break label1692;
                                                                                                                                                                  case 426525722:
                                                                                                                                                                     break label1681;
                                                                                                                                                                  case 437687496:
                                                                                                                                                                     break label1675;
                                                                                                                                                                  case 470554554:
                                                                                                                                                                     break label1673;
                                                                                                                                                                  case 558675880:
                                                                                                                                                                     break label1691;
                                                                                                                                                                  case 793970219:
                                                                                                                                                                     break label1699;
                                                                                                                                                                  case 831781507:
                                                                                                                                                                     break label1664;
                                                                                                                                                                  case 1072522138:
                                                                                                                                                                     break label1688;
                                                                                                                                                                  case 1079482409:
                                                                                                                                                                     break label1671;
                                                                                                                                                                  case 1116075312:
                                                                                                                                                                     break label1663;
                                                                                                                                                                  case 1204272394:
                                                                                                                                                                     break label1674;
                                                                                                                                                                  case 1375291912:
                                                                                                                                                                     break label1668;
                                                                                                                                                                  case 1412274147:
                                                                                                                                                                     break label1670;
                                                                                                                                                                  case 1456331563:
                                                                                                                                                                     break label1676;
                                                                                                                                                                  case 1461405355:
                                                                                                                                                                     break label1678;
                                                                                                                                                                  case 1482069162:
                                                                                                                                                                     break label1669;
                                                                                                                                                                  case 1709059979:
                                                                                                                                                                     break label1698;
                                                                                                                                                                  case 1802811963:
                                                                                                                                                                     break label1690;
                                                                                                                                                                  case 1806779723:
                                                                                                                                                                     break label1695;
                                                                                                                                                                  case 1807565554:
                                                                                                                                                                     break label1703;
                                                                                                                                                                  case 1815357832:
                                                                                                                                                                     break label1700;
                                                                                                                                                                  case 1897586258:
                                                                                                                                                                     break label1684;
                                                                                                                                                                  case 2012823963:
                                                                                                                                                                     break label1685;
                                                                                                                                                                  case 2065282114:
                                                                                                                                                                     break label1666;
                                                                                                                                                                  case 2079860872:
                                                                                                                                                                     break label1662;
                                                                                                                                                                  default:
                                                                                                                                                                     throw new RuntimeException(new IOException(
                                                                                                                                                                        "Error in hash"
                                                                                                                                                                     ));
                                                                                                                                                               }
                                                                                                                                                            }

                                                                                                                                                            var231 = syfpllerxlszxeld(
                                                                                                                                                               var231,
                                                                                                                                                               229569142
                                                                                                                                                            );
                                                                                                                                                         }

                                                                                                                                                         label261:
                                                                                                                                                         while (true) {
                                                                                                                                                            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                               var231
                                                                                                                                                            )) {
                                                                                                                                                               case 174934391:
                                                                                                                                                                  var231 ^= 1247662401;
                                                                                                                                                               case 481964058:
                                                                                                                                                                  break label261;
                                                                                                                                                               case 490618979:
                                                                                                                                                               default:
                                                                                                                                                                  throw new IllegalStateException();
                                                                                                                                                               case 1679183451:
                                                                                                                                                            }
                                                                                                                                                         }

                                                                                                                                                         label1462: {
                                                                                                                                                            e$a var118;
                                                                                                                                                            label1461: {
                                                                                                                                                               label1460: {
                                                                                                                                                                  label1459: {
                                                                                                                                                                     label1458: {
                                                                                                                                                                        try {
                                                                                                                                                                           int var111 = this.tallest;
                                                                                                                                                                           int var177 = var4.stackHeight();
                                                                                                                                                                           if (var111
                                                                                                                                                                              >= var177
                                                                                                                                                                              )
                                                                                                                                                                            {
                                                                                                                                                                              break label1462;
                                                                                                                                                                           }

                                                                                                                                                                           var231 ^= 1717181741;
                                                                                                                                                                           byte var113 = (byte)((this.unsure) ? 1 : 0);
                                                                                                                                                                           if (var113
                                                                                                                                                                              != (
                                                                                                                                                                                 840968044
                                                                                                                                                                                    ^ var231
                                                                                                                                                                              )
                                                                                                                                                                              )
                                                                                                                                                                            {
                                                                                                                                                                              break label1458;
                                                                                                                                                                           }

                                                                                                                                                                           var231 ^= 239490157;
                                                                                                                                                                           if (var15
                                                                                                                                                                              == (
                                                                                                                                                                                 1013347073
                                                                                                                                                                                    ^ var231
                                                                                                                                                                              )
                                                                                                                                                                              )
                                                                                                                                                                            {
                                                                                                                                                                              var231 ^= 876006823;
                                                                                                                                                                              var118 = null;
                                                                                                                                                                              break label1459;
                                                                                                                                                                           }
                                                                                                                                                                        } catch (Throwable var247) {
                                                                                                                                                                           var10000 = var247;
                                                                                                                                                                           switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                              var231
                                                                                                                                                                           )) {
                                                                                                                                                                              case -2021649678:
                                                                                                                                                                                 break label1680;
                                                                                                                                                                              case -1938794271:
                                                                                                                                                                                 break label1694;
                                                                                                                                                                              case -1862190239:
                                                                                                                                                                                 break label1677;
                                                                                                                                                                              case -1853829655:
                                                                                                                                                                                 break label1667;
                                                                                                                                                                              case -1831506759:
                                                                                                                                                                                 break label1696;
                                                                                                                                                                              case -1722804742:
                                                                                                                                                                                 break label1660;
                                                                                                                                                                              case -1672950864:
                                                                                                                                                                                 break label1704;
                                                                                                                                                                              case -1665149061:
                                                                                                                                                                                 break label1697;
                                                                                                                                                                              case -1546530294:
                                                                                                                                                                                 break label1672;
                                                                                                                                                                              case -1476848541:
                                                                                                                                                                                 break label1683;
                                                                                                                                                                              case -1409350039:
                                                                                                                                                                                 break label1758;
                                                                                                                                                                              case -1263565367:
                                                                                                                                                                                 break label1687;
                                                                                                                                                                              case -1242278462:
                                                                                                                                                                                 break label1661;
                                                                                                                                                                              case -1239724632:
                                                                                                                                                                                 break label1701;
                                                                                                                                                                              case -1215235128:
                                                                                                                                                                                 break label1702;
                                                                                                                                                                              case -1037556935:
                                                                                                                                                                                 break label1693;
                                                                                                                                                                              case -1036705118:
                                                                                                                                                                                 break label1679;
                                                                                                                                                                              case -1016315159:
                                                                                                                                                                                 break label1689;
                                                                                                                                                                              case -695463974:
                                                                                                                                                                                 break label1686;
                                                                                                                                                                              case -483158007:
                                                                                                                                                                                 break label1665;
                                                                                                                                                                              case -451298125:
                                                                                                                                                                                 break label1682;
                                                                                                                                                                              case -247506944:
                                                                                                                                                                                 break label1692;
                                                                                                                                                                              case 426525722:
                                                                                                                                                                                 break label1681;
                                                                                                                                                                              case 437687496:
                                                                                                                                                                                 break label1675;
                                                                                                                                                                              case 470554554:
                                                                                                                                                                                 break label1673;
                                                                                                                                                                              case 558675880:
                                                                                                                                                                                 break label1691;
                                                                                                                                                                              case 793970219:
                                                                                                                                                                                 break label1699;
                                                                                                                                                                              case 831781507:
                                                                                                                                                                                 break label1664;
                                                                                                                                                                              case 1072522138:
                                                                                                                                                                                 break label1688;
                                                                                                                                                                              case 1079482409:
                                                                                                                                                                                 break label1671;
                                                                                                                                                                              case 1116075312:
                                                                                                                                                                                 break label1663;
                                                                                                                                                                              case 1204272394:
                                                                                                                                                                                 break label1674;
                                                                                                                                                                              case 1375291912:
                                                                                                                                                                                 break label1668;
                                                                                                                                                                              case 1412274147:
                                                                                                                                                                                 break label1670;
                                                                                                                                                                              case 1456331563:
                                                                                                                                                                                 break label1676;
                                                                                                                                                                              case 1461405355:
                                                                                                                                                                                 break label1678;
                                                                                                                                                                              case 1482069162:
                                                                                                                                                                                 break label1669;
                                                                                                                                                                              case 1709059979:
                                                                                                                                                                                 break label1698;
                                                                                                                                                                              case 1802811963:
                                                                                                                                                                                 break label1690;
                                                                                                                                                                              case 1806779723:
                                                                                                                                                                                 break label1695;
                                                                                                                                                                              case 1807565554:
                                                                                                                                                                                 break label1703;
                                                                                                                                                                              case 1815357832:
                                                                                                                                                                                 break label1700;
                                                                                                                                                                              case 1897586258:
                                                                                                                                                                                 break label1684;
                                                                                                                                                                              case 2012823963:
                                                                                                                                                                                 break label1685;
                                                                                                                                                                              case 2065282114:
                                                                                                                                                                                 break label1666;
                                                                                                                                                                              case 2079860872:
                                                                                                                                                                                 break label1662;
                                                                                                                                                                              default:
                                                                                                                                                                                 throw new RuntimeException(new IOException(
                                                                                                                                                                                    "Error in hash"
                                                                                                                                                                                 ));
                                                                                                                                                                           }
                                                                                                                                                                        }

                                                                                                                                                                        while (true) {
                                                                                                                                                                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                              var231
                                                                                                                                                                           )) {
                                                                                                                                                                              case 84296375:
                                                                                                                                                                                 var231 ^= 183731128;
                                                                                                                                                                              case 264574067:
                                                                                                                                                                                 break label1460;
                                                                                                                                                                              case 311762709:
                                                                                                                                                                                 break;
                                                                                                                                                                              case 803983856:
                                                                                                                                                                              default:
                                                                                                                                                                                 throw new IllegalStateException();
                                                                                                                                                                           }
                                                                                                                                                                        }
                                                                                                                                                                     }

                                                                                                                                                                     var231 = syfpllerxlszxeld(
                                                                                                                                                                        var231,
                                                                                                                                                                        79026133
                                                                                                                                                                     );
                                                                                                                                                                     break label1460;
                                                                                                                                                                  }

                                                                                                                                                                  while (true) {
                                                                                                                                                                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                        var231
                                                                                                                                                                     )) {
                                                                                                                                                                        case 1866033:
                                                                                                                                                                           var231 ^= 40867815;
                                                                                                                                                                           break label1461;
                                                                                                                                                                        case 289451019:
                                                                                                                                                                        default:
                                                                                                                                                                           throw new IllegalStateException();
                                                                                                                                                                        case 1663304421:
                                                                                                                                                                           break label1461;
                                                                                                                                                                        case 1967849391:
                                                                                                                                                                     }
                                                                                                                                                                  }
                                                                                                                                                               }

                                                                                                                                                               try {
                                                                                                                                                                  var118 = UNDECIDED;
                                                                                                                                                                  var231 ^= 1017829880;
                                                                                                                                                               } catch (Throwable var236) {
                                                                                                                                                                  var10000 = var236;
                                                                                                                                                                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                     var231
                                                                                                                                                                  )) {
                                                                                                                                                                     case -2021649678:
                                                                                                                                                                        break label1680;
                                                                                                                                                                     case -1938794271:
                                                                                                                                                                        break label1694;
                                                                                                                                                                     case -1862190239:
                                                                                                                                                                        break label1677;
                                                                                                                                                                     case -1853829655:
                                                                                                                                                                        break label1667;
                                                                                                                                                                     case -1831506759:
                                                                                                                                                                        break label1696;
                                                                                                                                                                     case -1722804742:
                                                                                                                                                                        break label1660;
                                                                                                                                                                     case -1672950864:
                                                                                                                                                                        break label1704;
                                                                                                                                                                     case -1665149061:
                                                                                                                                                                        break label1697;
                                                                                                                                                                     case -1546530294:
                                                                                                                                                                        break label1672;
                                                                                                                                                                     case -1476848541:
                                                                                                                                                                        break label1683;
                                                                                                                                                                     case -1409350039:
                                                                                                                                                                        break label1758;
                                                                                                                                                                     case -1263565367:
                                                                                                                                                                        break label1687;
                                                                                                                                                                     case -1242278462:
                                                                                                                                                                        break label1661;
                                                                                                                                                                     case -1239724632:
                                                                                                                                                                        break label1701;
                                                                                                                                                                     case -1215235128:
                                                                                                                                                                        break label1702;
                                                                                                                                                                     case -1037556935:
                                                                                                                                                                        break label1693;
                                                                                                                                                                     case -1036705118:
                                                                                                                                                                        break label1679;
                                                                                                                                                                     case -1016315159:
                                                                                                                                                                        break label1689;
                                                                                                                                                                     case -695463974:
                                                                                                                                                                        break label1686;
                                                                                                                                                                     case -483158007:
                                                                                                                                                                        break label1665;
                                                                                                                                                                     case -451298125:
                                                                                                                                                                        break label1682;
                                                                                                                                                                     case -247506944:
                                                                                                                                                                        break label1692;
                                                                                                                                                                     case 426525722:
                                                                                                                                                                        break label1681;
                                                                                                                                                                     case 437687496:
                                                                                                                                                                        break label1675;
                                                                                                                                                                     case 470554554:
                                                                                                                                                                        break label1673;
                                                                                                                                                                     case 558675880:
                                                                                                                                                                        break label1691;
                                                                                                                                                                     case 793970219:
                                                                                                                                                                        break label1699;
                                                                                                                                                                     case 831781507:
                                                                                                                                                                        break label1664;
                                                                                                                                                                     case 1072522138:
                                                                                                                                                                        break label1688;
                                                                                                                                                                     case 1079482409:
                                                                                                                                                                        break label1671;
                                                                                                                                                                     case 1116075312:
                                                                                                                                                                        break label1663;
                                                                                                                                                                     case 1204272394:
                                                                                                                                                                        break label1674;
                                                                                                                                                                     case 1375291912:
                                                                                                                                                                        break label1668;
                                                                                                                                                                     case 1412274147:
                                                                                                                                                                        break label1670;
                                                                                                                                                                     case 1456331563:
                                                                                                                                                                        break label1676;
                                                                                                                                                                     case 1461405355:
                                                                                                                                                                        break label1678;
                                                                                                                                                                     case 1482069162:
                                                                                                                                                                        break label1669;
                                                                                                                                                                     case 1709059979:
                                                                                                                                                                        break label1698;
                                                                                                                                                                     case 1802811963:
                                                                                                                                                                        break label1690;
                                                                                                                                                                     case 1806779723:
                                                                                                                                                                        break label1695;
                                                                                                                                                                     case 1807565554:
                                                                                                                                                                        break label1703;
                                                                                                                                                                     case 1815357832:
                                                                                                                                                                        break label1700;
                                                                                                                                                                     case 1897586258:
                                                                                                                                                                        break label1684;
                                                                                                                                                                     case 2012823963:
                                                                                                                                                                        break label1685;
                                                                                                                                                                     case 2065282114:
                                                                                                                                                                        break label1666;
                                                                                                                                                                     case 2079860872:
                                                                                                                                                                        break label1662;
                                                                                                                                                                     default:
                                                                                                                                                                        throw new RuntimeException(new IOException(
                                                                                                                                                                           "Error in hash"
                                                                                                                                                                        ));
                                                                                                                                                                  }
                                                                                                                                                               }
                                                                                                                                                            }

                                                                                                                                                            try {
                                                                                                                                                               var227 = var118;
                                                                                                                                                               var231 ^= 666500037;
                                                                                                                                                               break;
                                                                                                                                                            } catch (Throwable var235) {
                                                                                                                                                               var10000 = var235;
                                                                                                                                                               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                  var231
                                                                                                                                                               )) {
                                                                                                                                                                  case -2021649678:
                                                                                                                                                                     break label1680;
                                                                                                                                                                  case -1938794271:
                                                                                                                                                                     break label1694;
                                                                                                                                                                  case -1862190239:
                                                                                                                                                                     break label1677;
                                                                                                                                                                  case -1853829655:
                                                                                                                                                                     break label1667;
                                                                                                                                                                  case -1831506759:
                                                                                                                                                                     break label1696;
                                                                                                                                                                  case -1722804742:
                                                                                                                                                                     break label1660;
                                                                                                                                                                  case -1672950864:
                                                                                                                                                                     break label1704;
                                                                                                                                                                  case -1665149061:
                                                                                                                                                                     break label1697;
                                                                                                                                                                  case -1546530294:
                                                                                                                                                                     break label1672;
                                                                                                                                                                  case -1476848541:
                                                                                                                                                                     break label1683;
                                                                                                                                                                  case -1409350039:
                                                                                                                                                                     break label1758;
                                                                                                                                                                  case -1263565367:
                                                                                                                                                                     break label1687;
                                                                                                                                                                  case -1242278462:
                                                                                                                                                                     break label1661;
                                                                                                                                                                  case -1239724632:
                                                                                                                                                                     break label1701;
                                                                                                                                                                  case -1215235128:
                                                                                                                                                                     break label1702;
                                                                                                                                                                  case -1037556935:
                                                                                                                                                                     break label1693;
                                                                                                                                                                  case -1036705118:
                                                                                                                                                                     break label1679;
                                                                                                                                                                  case -1016315159:
                                                                                                                                                                     break label1689;
                                                                                                                                                                  case -695463974:
                                                                                                                                                                     break label1686;
                                                                                                                                                                  case -483158007:
                                                                                                                                                                     break label1665;
                                                                                                                                                                  case -451298125:
                                                                                                                                                                     break label1682;
                                                                                                                                                                  case -247506944:
                                                                                                                                                                     break label1692;
                                                                                                                                                                  case 426525722:
                                                                                                                                                                     break label1681;
                                                                                                                                                                  case 437687496:
                                                                                                                                                                     break label1675;
                                                                                                                                                                  case 470554554:
                                                                                                                                                                     break label1673;
                                                                                                                                                                  case 558675880:
                                                                                                                                                                     break label1691;
                                                                                                                                                                  case 793970219:
                                                                                                                                                                     break label1699;
                                                                                                                                                                  case 831781507:
                                                                                                                                                                     break label1664;
                                                                                                                                                                  case 1072522138:
                                                                                                                                                                     break label1688;
                                                                                                                                                                  case 1079482409:
                                                                                                                                                                     break label1671;
                                                                                                                                                                  case 1116075312:
                                                                                                                                                                     break label1663;
                                                                                                                                                                  case 1204272394:
                                                                                                                                                                     break label1674;
                                                                                                                                                                  case 1375291912:
                                                                                                                                                                     break label1668;
                                                                                                                                                                  case 1412274147:
                                                                                                                                                                     break label1670;
                                                                                                                                                                  case 1456331563:
                                                                                                                                                                     break label1676;
                                                                                                                                                                  case 1461405355:
                                                                                                                                                                     break label1678;
                                                                                                                                                                  case 1482069162:
                                                                                                                                                                     break label1669;
                                                                                                                                                                  case 1709059979:
                                                                                                                                                                     break label1698;
                                                                                                                                                                  case 1802811963:
                                                                                                                                                                     break label1690;
                                                                                                                                                                  case 1806779723:
                                                                                                                                                                     break label1695;
                                                                                                                                                                  case 1807565554:
                                                                                                                                                                     break label1703;
                                                                                                                                                                  case 1815357832:
                                                                                                                                                                     break label1700;
                                                                                                                                                                  case 1897586258:
                                                                                                                                                                     break label1684;
                                                                                                                                                                  case 2012823963:
                                                                                                                                                                     break label1685;
                                                                                                                                                                  case 2065282114:
                                                                                                                                                                     break label1666;
                                                                                                                                                                  case 2079860872:
                                                                                                                                                                     break label1662;
                                                                                                                                                                  default:
                                                                                                                                                                     throw new RuntimeException(new IOException(
                                                                                                                                                                        "Error in hash"
                                                                                                                                                                     ));
                                                                                                                                                               }
                                                                                                                                                            }
                                                                                                                                                         }

                                                                                                                                                         var231 = syfpllerxlszxeld(
                                                                                                                                                            var231,
                                                                                                                                                            1973604903
                                                                                                                                                         );

                                                                                                                                                         e$a var228;
                                                                                                                                                         try {
                                                                                                                                                            long var198 = this.bottom;
                                                                                                                                                            int var215 = this.tallest;
                                                                                                                                                            long[] var219 = this.keptStacks;
                                                                                                                                                            int var222 = this.keptStackCount;
                                                                                                                                                            long[] var220 = Arrays.copyOf(
                                                                                                                                                               var219,
                                                                                                                                                               var222
                                                                                                                                                            );
                                                                                                                                                            e$a var119 = new e$a(
                                                                                                                                                               var198,
                                                                                                                                                               var215,
                                                                                                                                                               var220
                                                                                                                                                            );
                                                                                                                                                            var228 = var119;
                                                                                                                                                            var231 ^= 621628944;
                                                                                                                                                         } catch (Throwable var233) {
                                                                                                                                                            var10000 = var233;
                                                                                                                                                            switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                               var231
                                                                                                                                                            )) {
                                                                                                                                                               case 247939889:
                                                                                                                                                                  var231 = syfpllerxlszxeld(
                                                                                                                                                                     var231,
                                                                                                                                                                     895389655
                                                                                                                                                                  );
                                                                                                                                                                  break label1723;
                                                                                                                                                               default:
                                                                                                                                                                  throw new RuntimeException(new IllegalAccessException(
                                                                                                                                                                     "Error in hash"
                                                                                                                                                                  ));
                                                                                                                                                            }
                                                                                                                                                         }

                                                                                                                                                         LevelChunk[] var121 = this.around;
                                                                                                                                                         Object var179 = null;
                                                                                                                                                         Arrays.fill(
                                                                                                                                                            var121,
                                                                                                                                                            var179
                                                                                                                                                         );
                                                                                                                                                         return var228;
                                                                                                                                                      }

                                                                                                                                                      var231 = 570001276
                                                                                                                                                         ^ var231;
                                                                                                                                                      break label1723;
                                                                                                                                                   }

                                                                                                                                                   var231 = 1202480398
                                                                                                                                                      ^ var231;
                                                                                                                                                   break label1723;
                                                                                                                                                }

                                                                                                                                                var231 = 1111026953
                                                                                                                                                   ^ var231;
                                                                                                                                                break label1723;
                                                                                                                                             }

                                                                                                                                             var231 = syfpllerxlszxeld(
                                                                                                                                                var231,
                                                                                                                                                469328544
                                                                                                                                             );
                                                                                                                                             break label1723;
                                                                                                                                          }

                                                                                                                                          var231 = 483842327
                                                                                                                                             ^ var231;
                                                                                                                                          break label1723;
                                                                                                                                       }

                                                                                                                                       var231 = syfpllerxlszxeld(
                                                                                                                                          var231, 1924405473
                                                                                                                                       );
                                                                                                                                       break label1723;
                                                                                                                                    }

                                                                                                                                    var231 = 685774000 ^ var231;
                                                                                                                                    break label1723;
                                                                                                                                 }

                                                                                                                                 var231 = syfpllerxlszxeld(
                                                                                                                                    var231, 1541755193
                                                                                                                                 );
                                                                                                                                 break label1723;
                                                                                                                              }

                                                                                                                              var231 = 649494028 ^ var231;
                                                                                                                              break label1723;
                                                                                                                           }

                                                                                                                           var231 = 515460848 ^ var231;
                                                                                                                           break label1723;
                                                                                                                        }

                                                                                                                        var231 = 1603056932 ^ var231;
                                                                                                                        break label1723;
                                                                                                                     }

                                                                                                                     var231 = syfpllerxlszxeld(
                                                                                                                        var231, 2114180429
                                                                                                                     );
                                                                                                                     break label1723;
                                                                                                                  }

                                                                                                                  var231 = syfpllerxlszxeld(var231, 1015846068);
                                                                                                                  break label1723;
                                                                                                               }

                                                                                                               var231 = 1090280944 ^ var231;
                                                                                                               break label1723;
                                                                                                            }

                                                                                                            var231 = 1460135238 ^ var231;
                                                                                                            break label1723;
                                                                                                         }

                                                                                                         var231 = 1551798288 ^ var231;
                                                                                                         break label1723;
                                                                                                      }

                                                                                                      var231 = syfpllerxlszxeld(var231, 398767400);
                                                                                                      break label1723;
                                                                                                   }

                                                                                                   var231 = 2120211668 ^ var231;
                                                                                                   break label1723;
                                                                                                }

                                                                                                var231 = 648429789 ^ var231;
                                                                                                break label1723;
                                                                                             }

                                                                                             var231 = syfpllerxlszxeld(var231, 2120552292);
                                                                                             break label1723;
                                                                                          }

                                                                                          var231 = syfpllerxlszxeld(var231, 1287701477);
                                                                                          break label1723;
                                                                                       }

                                                                                       var231 = syfpllerxlszxeld(var231, 1148610031);
                                                                                       break label1723;
                                                                                    }

                                                                                    var231 = syfpllerxlszxeld(var231, 1470885682);
                                                                                    break label1723;
                                                                                 }

                                                                                 var231 = 1747275815 ^ var231;
                                                                                 break label1723;
                                                                              }

                                                                              var231 = 1618560317 ^ var231;
                                                                              break label1723;
                                                                           }

                                                                           var231 = syfpllerxlszxeld(var231, 1520778363);
                                                                           break label1723;
                                                                        }

                                                                        var231 = 2054770562 ^ var231;
                                                                        break label1723;
                                                                     }

                                                                     var231 = syfpllerxlszxeld(var231, 1314383434);
                                                                     break label1723;
                                                                  }

                                                                  var231 = 571709192 ^ var231;
                                                                  break label1723;
                                                               }

                                                               var231 = 1400622018 ^ var231;
                                                               break label1723;
                                                            }

                                                            var231 = syfpllerxlszxeld(var231, 753659884);
                                                            break label1723;
                                                         }

                                                         var231 = syfpllerxlszxeld(var231, 2045309174);
                                                         break label1723;
                                                      }

                                                      var231 = 279966020 ^ var231;
                                                      break label1723;
                                                   }

                                                   var231 = syfpllerxlszxeld(var231, 178359473);
                                                   break label1723;
                                                }

                                                var231 = 751002582 ^ var231;
                                                break label1723;
                                             }

                                             var231 = 621309101 ^ var231;
                                             break label1723;
                                          }

                                          var231 = 2045792024 ^ var231;
                                          break label1723;
                                       }

                                       var231 = syfpllerxlszxeld(var231, 652003878);
                                       break label1723;
                                    }

                                    var231 = 1729207646 ^ var231;
                                    break label1723;
                                 }

                                 var231 = 2017305152 ^ var231;
                                 break label1723;
                              }

                              var231 = 1902905204 ^ var231;
                              break label1723;
                           }

                           var231 = 419488384 ^ var231;
                           break label1723;
                        }

                        var231 = 38080004 ^ var231;
                        break label1723;
                     }

                     var231 = syfpllerxlszxeld(var231, 41187528);
                     break label1723;
                  }

                  var231 = 1509019631 ^ var231;
                  break label1723;
               }

               var231 = 118456007 ^ var231;
            }

            Throwable var27;
            while (true) {
               try {
                  Throwable var55 = var10000;
                  var27 = var55;
                  var231 ^= 133219579;
                  break;
               } catch (Throwable var232) {
                  var10000 = var232;
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var231)) {
                     case -1540145784:
                        var231 ^= 0;
                        break;
                     default:
                        throw new RuntimeException("Error in hash");
                  }
               }
            }

            LevelChunk[] var57 = this.around;
            Object var150 = null;
            Arrays.fill(var57, var150);
            throw new RuntimeException(var27);
         }

         LevelChunk[] var116 = this.around;
         Object var178 = null;
         Arrays.fill(var116, var178);
         return var227;
      }

      LevelChunk[] var126 = this.around;
      Object var181 = null;
      Arrays.fill(var126, var181);
      return var224;
   }

   private void stack(int var1, int var2, int var3) {
      int var12;
      int var14;
      byte var24;
      int var80;
      label85: {
         var80 = 1512884994 ^ 590285013 ^ 374332952;
         var80 = 1052524601 ^ var80;
         byte var5 = (byte)(1374707186 ^ var80);
         int var11 = var3 << var5;
         var12 = var11 | var1;
         var14 = this.shape(var1, var3);
         int[] var16 = this.stackTop;
         int var17 = var16[var12];
         byte var53 = (byte)(1374707191 ^ var80);
         int var41 = var2 - var53;
         if (var17 == var41) {
            var80 = 436290552 ^ var80;
            int[] var19 = this.stackShape;
            int var20 = var19[var12];
            if (var20 == var14) {
               var80 = 603318123 ^ var80;
               Block[] var22 = this.stackWall;
               Block var23 = var22[var12];
               Block var46 = this.wall;
               if (var23 == var46) {
                  var80 = 1064388367 ^ var80;
                  var24 = (byte)(1467334251 ^ var80);
                  var80 = 52902503 ^ var80;
                  break label85;
               }

               var80 = syfpllerxlszxeld(var80, 355324072);
            } else {
               var80 = 920139715 ^ var80;
            }
         } else {
            var80 = syfpllerxlszxeld(var80, 752448571);
         }

         var24 = (byte)(2099849677 ^ var80);
         var80 = 695971264 ^ var80;
      }

      if (var24 == (1414693901 ^ var80)) {
         var80 = 514260349 ^ var80;
         this.keep(var12);
         var80 = 1229896875 ^ var80;
      } else {
         var80 = syfpllerxlszxeld(var80, 1474838998);
      }

      int[] var28 = this.stackTop;
      var28[var12] = var2;
      int[] var30 = this.stackShape;
      var30[var12] = var14;
      Block[] var32 = this.stackWall;
      Block var57 = this.wall;
      var32[var12] = var57;
      int[] var34 = this.stackAreas;
      int var68;
      if (var24 != (62571995 ^ var80)) {
         var80 = 2054629549 ^ var80;
         int[] var66 = this.stackAreas;
         int var67 = var66[var12];
         byte var71 = (byte)(2043538807 ^ var80);
         var68 = var67 + var71;

         label74:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
               case 201229785:
                  var80 ^= 2030739875;
               case 1865653113:
                  break label74;
               case 2019284402:
               default:
                  throw new RuntimeException();
               case 2096581759:
            }
         }
      } else {
         label67:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
               case 36282009:
               default:
                  throw new RuntimeException();
               case 58661575:
                  var80 ^= 1522175627;
                  break label67;
               case 889538264:
                  break;
               case 1684669458:
                  break label67;
            }
         }

         var68 = (byte)(1493191505 ^ var80);
         var80 = 1506215813 ^ var80;
      }

      boolean[] var36;
      byte var69;
      label60: {
         label89: {
            var34[var12] = var68;
            var36 = this.stackGuessed;
            byte var60 = (byte)((this.guessed) ? 1 : 0);
            if (var60 == (13061333 ^ var80)) {
               var80 = 680205416 ^ var80;
               if (var24 == (676090045 ^ var80)) {
                  var80 = syfpllerxlszxeld(var80, 700351073);
                  break label89;
               }

               var80 = 1152219793 ^ var80;
               boolean[] var63 = this.stackGuessed;
               byte var64 = (byte)((var63[var12]) ? 1 : 0);
               if (var64 == (1826695724 ^ var80)) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                        case 49556820:
                           var80 ^= 1830025456;
                           break label89;
                        case 822162546:
                           break;
                        case 1476766057:
                           break label89;
                        case 1668751086:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }

               var80 = 1342654815 ^ var80;
            } else {
               var80 = 1008807846 ^ var80;
            }

            var69 = (byte)(1021731698 ^ var80);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                  case 42996087:
                  default:
                     throw new RuntimeException();
                  case 100555848:
                     var80 = 981203569 ^ var80;
                  case 1144474343:
                     break label60;
                  case 1252630390:
               }
            }
         }

         var69 = (byte)(32690908 ^ var80);
         var80 = 124734430 ^ var80;
      }

      var36[var12] = (var69 != 0);
   }

   private void keep(int var1) {
      int var114 = 97934221 ^ 1649338420 ^ 374332952;
      var114 = 60426934 ^ var114;
      int[] var12 = this.stackAreas;
      int var13 = var12[var1];
      int[] var15 = this.stackTop;
      int var16 = var15[var1];
      int var48 = -229808361 ^ var114;
      if (var16 != var48) {
         var114 = 480460634 ^ var114;
         int var50 = this.keepHeight;
         if (var13 >= var50) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var114)) {
                  case 116237819:
                     var114 ^= 15882801;
                     break;
                  case 667687833:
                     continue;
                  case 1542125226:
                  default:
                     throw new RuntimeException(new IOException());
                  case 2067404342:
               }

               int[] var20 = this.stackShape;
               int var21 = var20[var1];
               byte var4 = (byte)(1847329395 ^ var114);
               int var53 = var1 & var4;
               byte var5 = (byte)(1847329405 ^ var114);
               int var78 = var16 + var5;
               byte var6 = (byte)(1847329400 ^ var114);
               int var99 = var1 >> var6;
               byte var23 = (byte)((this.goesOn(var53, var78, var99, var21)) ? 1 : 0);
               if (var23 != (1847329404 ^ var114)) {
                  var114 = 810152024 ^ var114;
                  byte var79 = (byte)(1582690859 ^ var114);
                  int var55 = var1 & var79;
                  int var81 = var16 - var13;
                  byte var108 = (byte)(1582690848 ^ var114);
                  int var102 = var1 >> var108;
                  byte var25 = (byte)((this.goesOn(var55, var81, var102, var21)) ? 1 : 0);
                  if (var25 == (1582690852 ^ var114)) {
                     var114 = 902530562 ^ var114;
                     return;
                  }

                  label66:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var114)) {
                        case 113695600:
                           var114 ^= 1854182494;
                           break label66;
                        case 594777547:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1832760724:
                           break;
                        case 1867940896:
                           break label66;
                     }
                  }

                  boolean[] var27 = this.stackGuessed;
                  byte var28 = (byte)((var27[var1]) ? 1 : 0);
                  if (var28 != (819029626 ^ var114)) {
                     var114 = 999425769 ^ var114;
                     byte var76 = (byte)(188965010 ^ var114);
                     this.unsure = (var76 != 0);
                     return;
                  }

                  long var32;
                  label58: {
                     var114 = syfpllerxlszxeld(var114, 1321241599);
                     int var30 = this.scanX;
                     byte var82 = (byte)(2115104138 ^ var114);
                     int var58 = var1 & var82;
                     int var31 = var30 + var58;
                     int var60 = var16 - var13;
                     byte var84 = (byte)(2115104132 ^ var114);
                     int var61 = var60 + var84;
                     int var86 = this.scanZ;
                     byte var110 = (byte)(2115104129 ^ var114);
                     int var104 = var1 >> var110;
                     int var87 = var86 + var104;
                     var32 = BlockPos.asLong(var31, var61, var87);
                     int var63 = this.tallest;
                     if (var13 <= var63) {
                        var114 = 658936810 ^ var114;
                        int var65 = this.tallest;
                        if (var13 != var65) {
                           var114 = syfpllerxlszxeld(var114, 850447802);
                           break label58;
                        }

                        var114 = 413063181 ^ var114;
                        long var89 = this.bottom;
                        byte var38 = (byte)((before(var32, var89)) ? 1 : 0);
                        if (var38 == (1103734370 ^ var114)) {
                           var114 = 707663287 ^ var114;
                           break label58;
                        }

                        var114 = 1013207841 ^ var114;
                     } else {
                        label56:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var114)) {
                              case 71483936:
                                 var114 ^= 62658758;
                                 break label56;
                              case 688656135:
                                 break;
                              case 1056559853:
                                 break label56;
                              case 1931533561:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }
                     }

                     this.tallest = var13;
                     this.bottom = var32;
                     var114 = 373966486 ^ var114;
                  }

                  int var42 = this.keptStackCount;
                  long[] var70 = this.keptStacks;
                  int var71 = var70.length;
                  if (var42 == var71) {
                     var114 = 1662606763 ^ var114;
                     long[] var73 = this.keptStacks;
                     long[] var92 = this.keptStacks;
                     int var93 = var92.length;
                     byte var105 = (byte)(150924924 ^ var114);
                     int var94 = var93 * var105;
                     long[] var74 = Arrays.copyOf(var73, var94);
                     this.keptStacks = var74;
                     var114 = 704175672 ^ var114;
                  } else {
                     var114 = syfpllerxlszxeld(var114, 1256293267);
                  }

                  long[] var45 = this.keptStacks;
                  int var95 = this.keptStackCount;
                  byte var111 = (byte)(554053703 ^ var114);
                  int var106 = var95 + var111;
                  this.keptStackCount = var106;
                  var45[var95] = var32;
                  return;
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var114)) {
                     case 89533132:
                        var114 = 92436058 ^ var114;
                        return;
                     case 349531442:
                        break;
                     case 388021194:
                        return;
                     case 1511717734:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }
         }

         var114 = 538794858 ^ var114;
      } else {
         var114 = 1019110448 ^ var114;
      }
   }

   private boolean goesOn(int var1, int var2, int var3, int var4) {
      int var36 = 1340327241 ^ 158743124 ^ 374332952;
      var36 = 946451075 ^ var36;
      byte var5 = (byte)(1756599174 ^ var36);
      int var11 = var5;
      var36 = 1571931024 ^ var36;

      while (true) {
         byte var6 = (byte)(889344016 ^ var36);
         if (var11 >= var6) {
            var36 = 738595604 ^ var36;
            return (((byte)(419709699 ^ var36)) != 0);
         }

         var36 = 1045358476 ^ var36;
         int var14 = var4 >> var11;
         byte var24 = (byte)(189577115 ^ var36);
         int var15 = var14 & var24;
         if (var15 == (189577114 ^ var36)) {
            var36 = 362506962 ^ var36;
            var36 = syfpllerxlszxeld(var36, 1121137239);
         } else {
            var36 = syfpllerxlszxeld(var36, 1808874951);
            byte var8 = (byte)(1620937310 ^ var36);
            int var27 = var11 / var8;
            int var26 = var1 + var27;
            byte var10 = (byte)(1620937310 ^ var36);
            int var32 = var11 % var10;
            int var30 = var3 + var32;
            byte var33 = (byte)(1620937308 ^ var36);
            int var31 = var30 - var33;
            byte var17 = this.kind(var26, var2, var31);
            Block var19 = this.lastBlock;
            byte var20 = (byte)((carriesStone(var19)) ? 1 : 0);
            if (var20 == (1620937309 ^ var36)) {
               var36 = 1198197314 ^ var36;
               return (((byte)(670466079 ^ var36)) != 0);
            }

            var36 = syfpllerxlszxeld(var36, 1016685890);
         }

         var11 += 1543827230 ^ var36;
         var36 = 1762049801 ^ var36;
      }
   }

   private static boolean before(long var0, long var2) {
      int var39 = 1162040626 ^ 1238284739 ^ 1829447660;
      var39 = 2135983684 ^ var39;
      int var8 = BlockPos.getY(var0);
      int var24 = BlockPos.getY(var2);
      if (var8 != var24) {
         var39 = 1469726402 ^ var39;
         int var21 = BlockPos.getY(var0);
         int var36 = BlockPos.getY(var2);
         byte var22;
         if (var21 < var36) {
            var39 = 1306929793 ^ var39;
            var22 = (byte)(78272795 ^ var39);
            var39 = syfpllerxlszxeld(var39, 1609601486);
         } else {
            label37:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                  case 235165360:
                     var39 ^= 1750492893;
                     break label37;
                  case 829908707:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1748966000:
                     break;
                  case 1792872852:
                     break label37;
               }
            }

            var22 = (byte)(555357510 ^ var39);
            var39 = 2051071378 ^ var39;
         }

         return (var22 != 0);
      } else {
         label57:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
               case 197077770:
                  var39 ^= 1756108603;
                  break label57;
               case 1061724258:
                  break;
               case 1072415020:
               default:
                  throw new RuntimeException(new IOException());
               case 1579199224:
                  break label57;
            }
         }

         int var11 = BlockPos.getZ(var0);
         int var27 = BlockPos.getZ(var2);
         if (var11 != var27) {
            var39 = 1482991044 ^ var39;
            int var14 = BlockPos.getZ(var0);
            int var30 = BlockPos.getZ(var2);
            byte var15;
            if (var14 < var30) {
               var39 = 1419598637 ^ var39;
               var15 = (byte)(2055447690 ^ var39);
               var39 = syfpllerxlszxeld(var39, 1414933356);
            } else {
               var39 = 861790246 ^ var39;
               var15 = (byte)(490938240 ^ var39);
               var39 = 865505383 ^ var39;
            }

            return (var15 != 0);
         } else {
            var39 = 1025756718 ^ var39;
            int var18 = BlockPos.getX(var0);
            int var33 = BlockPos.getX(var2);
            if (var18 < var33) {
               var39 = 1021811564 ^ var39;
               byte var23 = (byte)(2008944417 ^ var39);

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                     case 134236912:
                        var39 = 38080339 ^ var39;
                        return (var23 != 0);
                     case 723548175:
                        return (var23 != 0);
                     case 1298810600:
                        break;
                     case 2059930481:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            } else {
               var39 = 2004952362 ^ var39;
               byte var55 = (byte)(1020834150 ^ var39);
               var39 = 1227075861 ^ var39;
               return (var55 != 0);
            }
         }
      }
   }

   private int shape(int var1, int var2) {
      int var34 = 771207309 ^ 1574386127 ^ 374332952;
      var34 = 1022919523 ^ var34;
      byte var3 = (byte)(1519899705 ^ var34);
      int var8 = var3;
      byte var10 = (byte)(1519899705 ^ var34);
      int var9 = var10;
      var34 = 1764259111 ^ var34;

      while (true) {
         int var15 = this.groupSize;
         if (var9 >= var15) {
            var34 = 984855257 ^ var34;
            return var8;
         }

         var34 = 184382888 ^ var34;
         byte var16 = (byte)(960681143 ^ var34);
         int[] var18 = this.groupX;
         int var19 = var18[var9];
         int var20 = var19 - var1;
         byte var26 = (byte)(960681141 ^ var34);
         int var21 = var20 * var26;
         int[] var28 = this.groupZ;
         int var29 = var28[var9];
         int var22 = var21 + var29;
         int var23 = var22 - var2;
         byte var31 = (byte)(960681143 ^ var34);
         int var24 = var23 + var31;
         int var17 = var16 << var24;
         int var13 = var8 | var17;
         var8 = var13;
         var9 += 960681143 ^ var34;
         var34 = syfpllerxlszxeld(var34, 184382888);
      }
   }

   private boolean isArea(int var1, int var2, int var3) {
      int var201 = 560524760 ^ 823320624 ^ 374332952;
      var201 = 1159414814 ^ var201;
      byte var5 = (byte)(1127127022 ^ var201);
      this.guessed = (var5 != 0);
      Object var105 = null;
      this.wall = (Block)var105;
      byte var6 = (byte)(1127127023 ^ var201);
      int var107 = var1 - var6;
      byte var20 = this.seen(var107, var2, var3);
      byte var108 = (byte)(1127127020 ^ var201);
      if (var20 != var108) {
         var201 = 309592226 ^ var201;
         return (((byte)(1364891468 ^ var201)) != 0);
      } else {
         var201 = 538467125 ^ var201;
         byte var22 = (byte)((this.sameWall()) ? 1 : 0);
         int var9;
         if (var22 != (1664535771 ^ var201)) {
            var201 = 469721860 ^ var201;
            byte var8 = (byte)(2026483678 ^ var201);
            int var179 = var3 - var8;
            byte var24 = this.seen(var1, var2, var179);
            byte var110 = (byte)(2026483677 ^ var201);
            if (var24 != var110) {
               var201 = syfpllerxlszxeld(var201, 697514131);
               return (((byte)(1364891468 ^ var201)) != 0);
            }

            var201 = 1200608402 ^ var201;
            byte var26 = (byte)((this.sameWall()) ? 1 : 0);
            if (var26 == (1061583693 ^ var201)) {
               var201 = 1847389185 ^ var201;
               return (((byte)(1364891468 ^ var201)) != 0);
            }

            label193:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                  case 177779107:
                     var201 ^= 1872960246;
                     break label193;
                  case 1284740005:
                     break;
                  case 1399234137:
                     break label193;
                  case 1600577945:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }

            int[] var28 = this.groupX;
            byte var111 = (byte)(1357210043 ^ var201);
            var28[var111] = var1;
            int[] var30 = this.groupZ;
            byte var112 = (byte)(1357210043 ^ var201);
            var30[var112] = var3;
            byte var31 = (byte)(1357210042 ^ var201);
            var9 = var31;
            int var10 = var1;
            int var11 = var3;
            int var12 = var3;
            byte var35 = (byte)(1357210043 ^ var201);
            int var13 = var35;
            var201 = 499803408 ^ var201;

            while (var13 < var9) {
               var201 = 995632887 ^ var201;
               byte var37 = (byte)(1987519068 ^ var201);
               int var14 = var37;
               var201 = 1538961183 ^ var201;

               while (true) {
                  byte var114 = (byte)(768445767 ^ var201);
                  if (var14 >= var114) {
                     var201 = syfpllerxlszxeld(var201, 590218962);
                     var13 += 249793424 ^ var201;
                     var201 = syfpllerxlszxeld(var201, 1137479482);
                     break;
                  }

                  var201 = 823344503 ^ var201;
                  int[] var40 = this.groupX;
                  int var41 = var40[var13];
                  int[] var116 = SIDE_X;
                  int var117 = var116[var14];
                  int var42 = var41 + var117;
                  int[] var44 = this.groupZ;
                  int var45 = var44[var13];
                  int[] var119 = SIDE_Z;
                  int var120 = var119[var14];
                  int var46 = var45 + var120;
                  byte var48 = (byte)((this.inGroup(var42, var46, var9)) ? 1 : 0);
                  if (var48 != (484356148 ^ var201)) {
                     var201 = 1139668371 ^ var201;

                     label168:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                           case 141756864:
                              var201 ^= 891484270;
                           case 239417967:
                              break label168;
                           case 1159282085:
                              break;
                           case 1942133034:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  } else {
                     var201 = 1812132705 ^ var201;
                     byte var50 = this.seen(var42, var2, var46);
                     byte var123 = (byte)(1893483351 ^ var201);
                     if (var50 == var123) {
                        var201 = 842836711 ^ var201;
                        byte var53 = (byte)((this.sameWall()) ? 1 : 0);
                        if (var53 == (1122036146 ^ var201)) {
                           var201 = 1128033307 ^ var201;
                           return (((byte)(31229353 ^ var201)) != 0);
                        }

                        var201 = syfpllerxlszxeld(var201, 686904443);
                     } else {
                        label239: {
                           var201 = syfpllerxlszxeld(var201, 685322958);
                           byte var124 = (byte)(1476751770 ^ var201);
                           if (var50 != var124) {
                              var201 = 241349571 ^ var201;
                              return (((byte)(1449640536 ^ var201)) != 0);
                           }

                           var201 = 1346323079 ^ var201;
                           if (var42 < var1) {
                              var201 = 121065322 ^ var201;
                              return (((byte)(252542070 ^ var201)) != 0);
                           }

                           var201 = 2104890585 ^ var201;
                           if (var42 == var1) {
                              var201 = 904039956 ^ var201;
                              if (var46 < var3) {
                                 var201 = 1336137127 ^ var201;
                                 return (((byte)(252542070 ^ var201)) != 0);
                              }

                              var201 = syfpllerxlszxeld(var201, 590012828);
                           } else {
                              var201 = syfpllerxlszxeld(var201, 382234504);
                           }

                           int var62 = Math.max(var10, var42);
                           var10 = var62;
                           int var64 = Math.min(var11, var46);
                           var11 = var64;
                           int var66 = Math.max(var12, var46);
                           var12 = var66;
                           int var68 = var62 - var1;
                           byte var132 = (byte)(1669613644 ^ var201);
                           if (var68 <= var132) {
                              var201 = 1865505549 ^ var201;
                              int var70 = var66 - var64;
                              byte var134 = (byte)(213193537 ^ var201);
                              if (var70 <= var134) {
                                 label179:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                                       case 144628217:
                                          var201 ^= 471638092;
                                          break label179;
                                       case 210800958:
                                          break;
                                       case 609052329:
                                       default:
                                          throw new RuntimeException(new IOException());
                                       case 654045409:
                                          break label179;
                                    }
                                 }

                                 int[] var72 = this.groupX;
                                 var72[var9] = var42;
                                 int[] var74 = this.groupZ;
                                 var74[var9] = var46;
                                 var9 += 279556877 ^ var201;
                                 var201 = 2058882757 ^ var201;
                                 break label239;
                              }

                              var201 = 1826105175 ^ var201;
                           } else {
                              var201 = syfpllerxlszxeld(var201, 65633370);
                           }

                           return (((byte)(1617769495 ^ var201)) != 0);
                        }
                     }
                  }

                  var14 += 1779547592 ^ var201;
                  var201 = 1205612682 ^ var201;
               }
            }

            var201 = syfpllerxlszxeld(var201, 1267826763);
            byte var76 = (byte)(113149152 ^ var201);
            int var194 = var76;
            var201 = 830189575 ^ var201;

            while (var194 < var9) {
               var201 = 365843607 ^ var201;
               byte var87 = (byte)(571170928 ^ var201);
               int var196 = var87;
               var201 = 1664404177 ^ var201;

               label150:
               while (true) {
                  byte var148 = (byte)(1094691493 ^ var201);
                  if (var196 >= var148) {
                     var201 = syfpllerxlszxeld(var201, 443301135);
                     var194 += 1532204975 ^ var201;
                     var201 = 1821811529 ^ var201;
                     break;
                  }

                  var201 = 1232498805 ^ var201;
                  int[] var90 = this.groupX;
                  int var91 = var90[var194];
                  int[] var150 = CORNER_X;
                  int var151 = var150[var196];
                  int var92 = var91 + var151;
                  int[] var94 = this.groupZ;
                  int var95 = var94[var194];
                  int[] var153 = CORNER_Z;
                  int var154 = var153[var196];
                  int var96 = var95 + var154;
                  byte var98 = (byte)((this.inGroup(var92, var96, var9)) ? 1 : 0);
                  if (var98 == (139057876 ^ var201)) {
                     var201 = 216329066 ^ var201;
                     byte var100 = this.seen(var92, var2, var96);
                     byte var157 = (byte)(78459324 ^ var201);
                     if (var100 != var157) {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                              case 73554447:
                                 var201 ^= 895904411;
                                 return (((byte)(835410725 ^ var201)) != 0);
                              case 580430540:
                                 return (((byte)(835410725 ^ var201)) != 0);
                              case 1740067406:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1861807860:
                           }
                        }
                     }

                     var201 = 996828287 ^ var201;
                     byte var102 = (byte)((this.sameWall()) ? 1 : 0);
                     if (var102 == (1070028225 ^ var201)) {
                        var201 = 235671268 ^ var201;
                        return (((byte)(835410725 ^ var201)) != 0);
                     }

                     var201 = syfpllerxlszxeld(var201, 949678349);
                  } else {
                     var201 = 253001240 ^ var201;
                  }

                  var196 += 123577549 ^ var201;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                        case 115854626:
                           var201 ^= 1180831341;
                           continue label150;
                        case 1261040847:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1920205507:
                           break;
                        case 1980745355:
                           continue label150;
                     }
                  }
               }
            }

            var201 = syfpllerxlszxeld(var201, 1703057358);
            byte var78 = (byte)(1380426537 ^ var201);
            int var195 = var78;
            var201 = 460801770 ^ var201;

            while (var195 < var9) {
               var201 = 1335851885 ^ var201;
               int[] var140 = this.groupX;
               int var141 = var140[var195];
               byte var182 = (byte)(112172719 ^ var201);
               int var170 = var2 + var182;
               int[] var184 = this.groupZ;
               int var185 = var184[var195];
               byte var81 = this.kind(var141, var170, var185);
               byte var142 = (byte)(112172717 ^ var201);
               if (var81 != var142) {
                  var201 = 309163929 ^ var201;
                  int[] var144 = this.groupX;
                  int var145 = var144[var195];
                  byte var186 = (byte)(348318006 ^ var201);
                  int var173 = var2 - var186;
                  int[] var188 = this.groupZ;
                  int var189 = var188[var195];
                  byte var83 = this.kind(var145, var173, var189);
                  byte var146 = (byte)(348318004 ^ var201);
                  if (var83 != var146) {
                     var201 = syfpllerxlszxeld(var201, 1144650485);
                     var195 += 1358631875 ^ var201;
                     var201 = 432797185 ^ var201;
                     continue;
                  }

                  var201 = 713010927 ^ var201;
               } else {
                  var201 = syfpllerxlszxeld(var201, 940759414);
               }

               return (((byte)(1052592088 ^ var201)) != 0);
            }

            label126:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                  case 210789696:
                     break;
                  case 231666713:
                     var201 ^= 342935261;
                     break label126;
                  case 1366382379:
                  default:
                     throw new RuntimeException(new IOException());
                  case 2063125235:
                     break label126;
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                  case 3821534:
                     var201 ^= 845962135;
                     return (((byte)(1364891468 ^ var201)) != 0);
                  case 1523762477:
                     break;
                  case 1752524357:
                  default:
                     throw new RuntimeException(new IOException());
                  case 2113729608:
                     return (((byte)(1364891468 ^ var201)) != 0);
               }
            }
         }

         this.groupSize = var9;
         return (((byte)(1564484383 ^ var201)) != 0);
      }
   }

   private boolean inGroup(int var1, int var2, int var3) {
      int var22 = 770062008 ^ 1839898426 ^ 374332952;
      var22 = 1962427367 ^ var22;
      byte var4 = (byte)(586888317 ^ var22);
      int var6 = var4;
      var22 = 397992515 ^ var22;

      while (var6 < var3) {
         var22 = 118613527 ^ var22;
         int[] var10 = this.groupX;
         int var11 = var10[var6];
         if (var11 == var1) {
            var22 ^= 369554641;
            int[] var13 = this.groupZ;
            int var14 = var13[var6];
            if (var14 == var2) {
               var22 = 843706718 ^ var22;
               return (((byte)(371013031 ^ var22)) != 0);
            }

            label27:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                  case 107223540:
                     var22 ^= 778977070;
                     break label27;
                  case 440256803:
                  default:
                     throw new IllegalStateException();
                  case 1018555623:
                     break;
                  case 1829418906:
                     break label27;
               }
            }
         } else {
            label34:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                  case 25104157:
                     var22 ^= 946392063;
                     break label34;
                  case 684715653:
                     break;
                  case 1751360587:
                     break label34;
                  case 1834329346:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var6 += 171637719 ^ var22;
         var22 = syfpllerxlszxeld(var22, 1064906216);
      }

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
            case 120805979:
               var22 ^= 205701231;
               return (((byte)(956372561 ^ var22)) != 0);
            case 1096340520:
            default:
               throw new IllegalStateException();
            case 1122804497:
               return (((byte)(956372561 ^ var22)) != 0);
            case 1869928523:
         }
      }
   }

   private byte seen(int var1, int var2, int var3) {
      int var18 = 1680564876 ^ 119337851 ^ 374332952;
      var18 = 3301251 ^ var18;
      byte var9 = this.kind(var1, var2, var3);
      byte var14 = (byte)(1967788136 ^ var18);
      if (var9 != var14) {
         var18 = 1275439308 ^ var18;
         return var9;
      } else {
         var18 = syfpllerxlszxeld(var18, 653100550);
         byte var15 = (byte)(1403491947 ^ var18);
         this.guessed = (var15 != 0);
         return (byte)(1403491944 ^ var18);
      }
   }

   private boolean sameWall() {
      int var16 = 926052898 ^ 853829297 ^ 374332952;
      var16 = 308915567 ^ var16;
      Block var3 = this.lastBlock;
      if (var3 == null) {
         var16 = 703126818 ^ var16;
         return (((byte)(672709319 ^ var16)) != 0);
      } else {
         var16 = syfpllerxlszxeld(var16, 2117673751);
         Block var6 = this.wall;
         if (var6 == null) {
            var16 = 1637810973 ^ var16;
            Block var11 = this.lastBlock;
            this.wall = var11;
            var16 = 816554569 ^ var16;
         } else {
            label35:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
                  case 127240799:
                     var16 ^= 1362403668;
                  case 219345798:
                     break label35;
                  case 1126702092:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1698716554:
               }
            }
         }

         Block var9 = this.lastBlock;
         Block var13 = this.wall;
         byte var10;
         if (var9 == var13) {
            var16 = 1115382003 ^ var16;
            var10 = (byte)(1820755285 ^ var16);
            var16 = syfpllerxlszxeld(var16, 1747501533);
         } else {
            label26:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
                  case 185319950:
                     var16 ^= 1350817396;
                     break label26;
                  case 533562815:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1873553560:
                     break;
                  case 1933895446:
                     break label26;
               }
            }

            var10 = (byte)(2122200019 ^ var16);
            var16 = 2060482394 ^ var16;
         }

         return (var10 != 0);
      }
   }

   private byte kind(int var1, int var2, int var3) {
      int var55 = 1380168315 ^ 1639109545 ^ 374332952;
      var55 = 165086208 ^ var55;
      LevelChunk[] var12 = this.around;
      byte var6 = (byte)(745126862 ^ var55);
      int var28 = var1 >> var6;
      byte var42 = (byte)(745126859 ^ var55);
      int var29 = var28 + var42;
      byte var43 = (byte)(745126857 ^ var55);
      int var30 = var29 * var43;
      byte var7 = (byte)(745126862 ^ var55);
      int var45 = var3 >> var7;
      int var31 = var30 + var45;
      byte var46 = (byte)(745126859 ^ var55);
      int var32 = var31 + var46;
      LevelChunk var13 = var12[var32];
      Object var33 = null;
      this.lastBlock = (Block)var33;
      if (var13 == null) {
         var55 = 1612239237 ^ var55;
         return (byte)(1282501195 ^ var55);
      } else {
         var55 = 2061755049 ^ var55;
         int var17 = var13.getSectionIndex(var2);
         if (var17 >= (1451907427 ^ var55)) {
            var55 = 1819804120 ^ var55;
            int var36 = var13.getSectionsCount();
            if (var17 < var36) {
               var55 = syfpllerxlszxeld(var55, 724919373);
               LevelChunkSection var21 = var13.getSection(var17);
               byte var47 = (byte)(298269945 ^ var55);
               int var39 = var1 & var47;
               byte var50 = (byte)(298269945 ^ var55);
               int var49 = var2 & var50;
               byte var8 = (byte)(298269945 ^ var55);
               int var52 = var3 & var8;
               BlockState var22 = var21.getBlockState(var39, var49, var52);
               Block var41 = var22.getBlock();
               this.lastBlock = var41;
               return kindOf(var22);
            }

            var55 = 1305563055 ^ var55;
         } else {
            var55 = 564743799 ^ var55;
         }

         return (byte)(1998788372 ^ var55);
      }
   }

   private boolean enclosed(int var1, int var2, int var3) {
      int var49 = 1476642184 ^ 1354781671 ^ 374332952;
      var49 = 121592425 ^ var49;
      byte var6 = (byte)(431165983 ^ var49);
      int var21 = var1 + var6;
      byte var9 = (byte)((this.full(var21, var2, var3)) ? 1 : 0);
      if (var9 != (431165982 ^ var49)) {
         var49 = 1013450400 ^ var49;
         byte var29 = (byte)(635114687 ^ var49);
         int var23 = var1 - var29;
         byte var11 = (byte)((this.full(var23, var2, var3)) ? 1 : 0);
         if (var11 != (635114686 ^ var49)) {
            var49 ^= 60600643;
            byte var8 = (byte)(642229756 ^ var49);
            int var39 = var3 + var8;
            byte var13 = (byte)((this.full(var1, var2, var39)) ? 1 : 0);
            if (var13 != (642229757 ^ var49)) {
               var49 = 1162034899 ^ var49;
               byte var46 = (byte)(1661246255 ^ var49);
               int var41 = var3 - var46;
               byte var15 = (byte)((this.full(var1, var2, var41)) ? 1 : 0);
               if (var15 != (1661246254 ^ var49)) {
                  var49 = 168491260 ^ var49;
                  byte var42 = (byte)(1762550739 ^ var49);
                  int var34 = var2 + var42;
                  byte var17 = (byte)((this.full(var1, var34, var3)) ? 1 : 0);
                  if (var17 != (1762550738 ^ var49)) {
                     var49 = 1130313206 ^ var49;
                     byte var44 = (byte)(709973541 ^ var49);
                     int var36 = var2 - var44;
                     byte var19 = (byte)((this.full(var1, var36, var3)) ? 1 : 0);
                     if (var19 != (709973540 ^ var49)) {
                        var49 = 1020965870 ^ var49;
                        byte var20 = (byte)(378267083 ^ var49);

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var49)) {
                              case 196025276:
                                 var49 = 1552949335 ^ var49;
                                 return (var20 != 0);
                              case 330321114:
                                 return (var20 != 0);
                              case 617704336:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1075389321:
                           }
                        }
                     }

                     var49 = syfpllerxlszxeld(var49, 1991302346);
                  } else {
                     label41:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var49)) {
                           case 193693800:
                              var49 ^= 904915260;
                           case 621541615:
                              break label41;
                           case 1070207189:
                           default:
                              throw new RuntimeException(new IOException());
                           case 2104480777:
                        }
                     }
                  }
               } else {
                  var49 = syfpllerxlszxeld(var49, 1071976896);
               }
            } else {
               label55:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var49)) {
                     case 170588125:
                        var49 ^= 2057711379;
                        break label55;
                     case 302982099:
                     default:
                        throw new RuntimeException(new IOException());
                     case 542286145:
                        break;
                     case 1745510345:
                        break label55;
                  }
               }
            }
         } else {
            label49:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var49)) {
                  case 156786155:
                     var49 ^= 2033884752;
                  case 1411992326:
                     break label49;
                  case 1562251252:
                     break;
                  case 1590555331:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      } else {
         var49 = 1163041008 ^ var49;
      }

      byte var57 = (byte)(1558285038 ^ var49);
      var49 = 385503091 ^ var49;
      return (var57 != 0);
   }

   private boolean full(int var1, int var2, int var3) {
      int var48 = 704506781 ^ 303314143 ^ 374332952;
      var48 = 909058331 ^ var48;
      LevelChunk[] var11 = this.around;
      byte var6 = (byte)(461971525 ^ var48);
      int var24 = var1 >> var6;
      byte var35 = (byte)(461971520 ^ var48);
      int var25 = var24 + var35;
      byte var36 = (byte)(461971522 ^ var48);
      int var26 = var25 * var36;
      byte var7 = (byte)(461971525 ^ var48);
      int var38 = var3 >> var7;
      int var27 = var26 + var38;
      byte var39 = (byte)(461971520 ^ var48);
      int var28 = var27 + var39;
      LevelChunk var12 = var11[var28];
      if (var12 == null) {
         var48 = 270544536 ^ var48;
         return (((byte)(195628761 ^ var48)) != 0);
      } else {
         var48 = 1383383265 ^ var48;
         int var15 = var12.getSectionIndex(var2);
         if (var15 >= (1241374880 ^ var48)) {
            var48 = 787742057 ^ var48;
            int var31 = var12.getSectionsCount();
            if (var15 < var31) {
               var48 = 1413913576 ^ var48;
               LevelChunkSection var19 = var12.getSection(var15);
               byte var40 = (byte)(860390958 ^ var48);
               int var34 = var1 & var40;
               byte var43 = (byte)(860390958 ^ var48);
               int var42 = var2 & var43;
               byte var8 = (byte)(860390958 ^ var48);
               int var45 = var3 & var8;
               BlockState var20 = var19.getBlockState(var34, var42, var45);
               byte var21 = (byte)((var20.isSolidRender()) ? 1 : 0);
               if (var21 != (860390945 ^ var48)) {
                  var48 = 1576690394 ^ var48;
                  byte var22 = (byte)(1857217786 ^ var48);
                  var48 = 2096639762 ^ var48;
                  return (var22 != 0);
               }

               var48 = syfpllerxlszxeld(var48, 632333477);
            } else {
               var48 = 1911963469 ^ var48;
            }
         } else {
            label29:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var48)) {
                  case 257665739:
                     var48 ^= 1594212900;
                  case 333044340:
                     break label29;
                  case 1184264198:
                     break;
                  case 1634285117:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }

         byte var57 = (byte)(385360516 ^ var48);
         var48 = 78834029 ^ var48;
         return (var57 != 0);
      }
   }

   private static boolean hasBlocks(LevelChunkSection var0, int var1, int var2) {
      int var29 = 2146590207 ^ 134057604 ^ 1829447660;
      var29 = 1432552542 ^ var29;
      Predicate<BlockState> var4 = var0x -> {
         int var6 = 672696058 ^ 1679676544 ^ 1829447660;
         var6 = 490374924 ^ var6;
         byte var2x = (byte)((var0x.isAir()) ? 1 : 0);
         byte var3;
         if (var2x == (1010102938 ^ var6)) {
            var6 = 48634169 ^ var6;
            var3 = (byte)(1054010274 ^ var6);
            var6 = syfpllerxlszxeld(var6, 1347305933);
         } else {
            var6 = syfpllerxlszxeld(var6, 780717079);
            var3 = (byte)(314326669 ^ var6);
            var6 = 2082510051 ^ var6;
         }

         return (var3 != 0);
      };
      byte var10 = (byte)((var0.maybeHas(var4)) ? 1 : 0);
      if (var10 == (1080553673 ^ var29)) {
         var29 = 55633094 ^ var29;
         return (((byte)(1127683087 ^ var29)) != 0);
      } else {
         var29 = syfpllerxlszxeld(var29, 2011681784);
         int var7 = var1;
         var29 = 153450203 ^ var29;

         while (var7 <= var2) {
            var29 = 1950491718 ^ var29;
            byte var14 = (byte)(1256681900 ^ var29);
            int var8 = var14;
            var29 = 475001319 ^ var29;

            while (true) {
               byte var24 = (byte)(1453883483 ^ var29);
               if (var8 >= var24) {
                  var29 = syfpllerxlszxeld(var29, 507102527);
                  var7 += 1217480053 ^ var29;
                  var29 = syfpllerxlszxeld(var29, 1983123614);
                  break;
               }

               var29 = 2135962134 ^ var29;
               byte var16 = (byte)(704164445 ^ var29);
               int var9 = var16;
               var29 = 1229162427 ^ var29;

               while (true) {
                  byte var25 = (byte)(1622881782 ^ var29);
                  if (var9 >= var25) {
                     var29 = 1555766204 ^ var29;
                     var8 += 1006644827 ^ var29;
                     var29 = 1789439505 ^ var29;
                     break;
                  }

                  var29 = 912480934 ^ var29;
                  BlockState var19 = var0.getBlockState(var9, var7, var8);
                  byte var20 = (byte)((var19.isAir()) ? 1 : 0);
                  if (var20 == (1457024832 ^ var29)) {
                     var29 = 1851005009 ^ var29;
                     return (((byte)(948729616 ^ var29)) != 0);
                  }

                  label39:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                        case 138608980:
                           var29 ^= 432301744;
                           break label39;
                        case 245054724:
                        default:
                           throw new RuntimeException();
                        case 752357967:
                           break;
                        case 1356912204:
                           break label39;
                     }
                  }

                  var9 += 1327237617 ^ var29;
                  var29 = syfpllerxlszxeld(var29, 799489046);
               }
            }
         }

         var29 = syfpllerxlszxeld(var29, 1011607911);
         return (((byte)(49200269 ^ var29)) != 0);
      }
   }

   private static byte kindOf(BlockState var0) {
      int var15 = 1910802547 ^ 599959091 ^ 1829447660;
      var15 = 623846019 ^ var15;
      Block var4 = var0.getBlock();
      Block var2 = Blocks.STONE;
      if (var4 == var2) {
         var15 = 94697400 ^ var15;
         return (byte)(531029142 ^ var15);
      } else {
         var15 = 482428113 ^ var15;
         byte var7 = (byte)((isBlob(var4)) ? 1 : 0);
         if (var7 != (113471486 ^ var15)) {
            var15 = 758532532 ^ var15;
            return (byte)(737486408 ^ var15);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
                  case 88645159:
                     break;
                  case 106380861:
                     var15 ^= 1658080482;
                  case 1261875879:
                     byte var9 = (byte)((var0.isAir()) ? 1 : 0);
                     byte var12;
                     if (var9 != (1679237916 ^ var15)) {
                        var15 = 252610631 ^ var15;
                        var12 = (byte)(1796844376 ^ var15);
                        var15 = syfpllerxlszxeld(var15, 383679622);
                     } else {
                        var15 = syfpllerxlszxeld(var15, 879124246);
                        var12 = (byte)(1349614602 ^ var15);
                        var15 = 766946263 ^ var15;
                     }

                     return var12;
                  case 2057645285:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      }
   }

   private static boolean isBlob(Block var0) {
      int var12 = 2021837723 ^ 1860969348 ^ 1829447660;
      var12 = 1843121276 ^ var12;
      Block var2 = Blocks.DIORITE;
      if (var0 != var2) {
         var12 = 1580099074 ^ var12;
         Block var7 = Blocks.ANDESITE;
         if (var0 != var7) {
            var12 = 355687533 ^ var12;
            Block var8 = Blocks.GRANITE;
            if (var0 != var8) {
               var12 = 1612657985 ^ var12;
               Block var9 = Blocks.GRAVEL;
               if (var0 != var9) {
                  var12 = 59735726 ^ var12;
                  byte var6 = (byte)(1043558927 ^ var12);
                  var12 = 276043875 ^ var12;
                  return (var6 != 0);
               }

               var12 = 1002374918 ^ var12;
            } else {
               var12 = 1537225287 ^ var12;
            }
         } else {
            label28:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var12)) {
                  case 211258449:
                     var12 ^= 1318284842;
                     break label28;
                  case 410862825:
                     break;
                  case 892566697:
                     break label28;
                  case 938809852:
                  default:
                     throw new IllegalStateException();
               }
            }
         }
      } else {
         var12 = 280823848 ^ var12;
      }

      byte var20 = (byte)(100862886 ^ var12);
      var12 = 675570123 ^ var12;
      return (var20 != 0);
   }

   private static boolean carriesStone(Block var0) {
      int var8 = 1418405570 ^ 1082667889 ^ 1829447660;
      var8 = 458950083 ^ var8;
      Block var2 = Blocks.STONE;
      if (var0 != var2) {
         var8 = 1236375781 ^ var8;
         Block var5 = Blocks.DEEPSLATE;
         if (var0 != var5) {
            var8 = syfpllerxlszxeld(var8, 1449702755);
            byte var4 = (byte)(2106202650 ^ var8);
            var8 = 2128957479 ^ var8;
            return (var4 != 0);
         }

         var8 = 117294067 ^ var8;
      } else {
         var8 = 1330404118 ^ var8;
      }

      byte var15 = (byte)(757034123 ^ var8);
      var8 = syfpllerxlszxeld(var8, 779101879);
      return (var15 != 0);
   }

   private static boolean matters(BlockState var0) {
      int var15;
      label28: {
         var15 = 815353764 ^ 1162948939 ^ 1829447660;
         var15 = 1773279781 ^ var15;
         if (var0 != null) {
            var15 = 937288291 ^ var15;
            byte var3 = kindOf(var0);
            if (var3 != (1185718597 ^ var15)) {
               var15 = 378462347 ^ var15;
               break label28;
            }

            var15 = 1916445734 ^ var15;
            Block var5 = var0.getBlock();
            byte var6 = (byte)((carriesStone(var5)) ? 1 : 0);
            if (var6 != (882247011 ^ var15)) {
               var15 = 1689535661 ^ var15;
               break label28;
            }

            var15 = 2139091742 ^ var15;
         } else {
            var15 = 983086427 ^ var15;
         }

         byte var18 = (byte)(1273624189 ^ var15);
         var15 = 1535360437 ^ var15;
         return (var18 != 0);
      }

      byte var7 = (byte)(1344422351 ^ var15);
      var15 = syfpllerxlszxeld(var15, 1078462982);
      return (var7 != 0);
   }

   private void probe(Minecraft var1, long var2) {
      int var28 = 1518812629 ^ 381104314 ^ 374332952;
      var28 = 1790824002 ^ var28;
      byte var8 = (byte)((this.probing) ? 1 : 0);
      if (var8 != (818027829 ^ var28)) {
         var28 = 1675703695 ^ var28;
         LongOpenHashSet var10 = this.probed;
         byte var11 = (byte)((var10.add(var2)) ? 1 : 0);
         if (var11 == (1394813114 ^ var28)) {
            var28 = 1803317006 ^ var28;
         } else {
            var28 = 2107435742 ^ var28;
            LongOpenHashSet var13 = this.probed;
            int var14 = var13.size();
            byte var22 = (byte)(784319060 ^ var28);
            if (var14 < var22) {
               var28 = 383813072 ^ var28;
            } else {
               label31:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                     case 177448478:
                        var28 ^= 381302820;
                        break label31;
                     case 838839061:
                     default:
                        throw new IllegalStateException();
                     case 858361203:
                        break label31;
                     case 1270471154:
                  }
               }

               byte var23 = (byte)(939915840 ^ var28);
               this.probing = (var23 != 0);
               LongOpenHashSet var17 = this.probed;
               var17.clear();
               LocalPlayer var19 = var1.player;
               if (var19 != null) {
                  var28 = 1052350176 ^ var28;
                  LocalPlayer var21 = var1.player;
                  String var24 = npkakepwjg(noraaaqnimdvmko(), var28);
                  MutableComponent var25 = Component.literal(var24);
                  byte var7 = (byte)(113011872 ^ var28);
                  var21.displayClientMessage(var25, (var7 != 0));
                  var28 = 1115736956 ^ var28;
               } else {
                  var28 = 2084134300 ^ var28;
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
               case 157026303:
                  return;
               case 242755668:
                  var28 = 144530049 ^ var28;
                  return;
               case 1037160364:
                  break;
               case 2147265401:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   private void announce(Minecraft var1, List<e$a> var2) {
      int var53 = 1560849808 ^ 424074555 ^ 374332952;
      var53 = 1165441850 ^ var53;
      byte var13 = (byte)((var2.isEmpty()) ? 1 : 0);
      BlockPos var24;
      String var40;
      String var41;
      if (var13 == (393647497 ^ var53)) {
         var53 = 952692328 ^ var53;
         x var14 = x.INSTANCE;
         byte var15 = (byte)((var14.growthDebugNotify) ? 1 : 0);
         if (var15 != (801012705 ^ var53)) {
            var53 = 487526721 ^ var53;
            LocalPlayer var17 = var1.player;
            if (var17 == null) {
               var53 = 1729382105 ^ var53;
               return;
            }

            var53 = 308482945 ^ var53;
            byte var4 = (byte)(550664481 ^ var53);
            Object var19 = var2.get(var4);
            e$a var20 = (e$a)var19;
            long var22 = var20.pos();
            var24 = BlockPos.of(var22);
            int var26 = var2.size();
            byte var42 = (byte)(550664480 ^ var53);
            if (var26 > var42) {
               var53 = 273940787 ^ var53;
               int var28 = var2.size();
               byte var43 = (byte)(814118931 ^ var53);
               int var29 = var28 - var43;
               var41 = " (+" + var29 + " more)";
               var53 = 903003006 ^ var53;
            } else {
               var53 = 1169597830 ^ var53;
               var41 = npkakepwjg(manwcipereaedvx(), var53);
               var53 = 1613766603 ^ var53;
            }

            com.wimpyclient.s.a var31 = this.advanced;
            if (var31 == null) {
               var53 = 232672451 ^ var53;
               int var39 = var20.height();
               var40 = var39 + "-high patched shaft";
               var53 = 64692808 ^ var53;
            } else {
               var53 = 1851428831 ^ var53;
               int var33 = var20.height();
               var40 = var33 + " blocks differ from the seed";

               label39:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
                     case 74693259:
                        break;
                     case 237286032:
                        break label39;
                     case 258727828:
                        var53 = 1616896340 ^ var53;
                        break label39;
                     case 1158799682:
                     default:
                        throw new RuntimeException();
                  }
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
                  case 128523242:
                     return;
                  case 209797053:
                     var53 = 2048612248 ^ var53;
                     return;
                  case 1692054283:
                     break;
                  case 2099059293:
                  default:
                     throw new RuntimeException();
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
               case 225826511:
                  var53 = 1121171952 ^ var53;
                  return;
               case 483916945:
               default:
                  throw new RuntimeException();
               case 619736074:
                  break;
               case 1566260334:
                  return;
            }
         }
      }

      int var47 = var24.getX();
      int var49 = var24.getY();
      int var50 = var24.getZ();
      String var45 = "Suspect chunk: " + var40 + " at " + var47 + " " + var49 + " " + var50 + var41;
      chat(var1, var45);
      Reference var35 = SoundEvents.NOTE_BLOCK_BELL;
      Object var36 = var35.value();
      SoundEvent var37 = (SoundEvent)var36;
      float var46 = 1.4F;
      float var48 = 0.65F;
      com.wimpyclient.p.f.playUi(var37, var46, var48);
   }

   static {
      int var52 = 806670771 ^ 1296201140 ^ Integer.parseInt("754974276");
      int var49 = new Random(-5361695975917139029L).nextInt();
      B5eivIAFNJ = 1891123718 ^ var49;
      var52 = 1638546450 ^ var52;
      e var0 = new e();
      INSTANCE = var0;
      byte var5 = (byte)(805529173 ^ var52);
      int[] var6 = new int[var5];
      byte var1 = (byte)(805529169 ^ var52);
      byte var2 = (byte)(805529168 ^ var52);
      var6[var1] = var2;
      byte var14 = (byte)(805529168 ^ var52);
      byte var31 = (byte)(-805529170 ^ var52);
      var6[var14] = var31;
      byte var15 = (byte)(805529171 ^ var52);
      byte var32 = (byte)(805529169 ^ var52);
      var6[var15] = var32;
      byte var16 = (byte)(805529170 ^ var52);
      byte var33 = (byte)(805529169 ^ var52);
      var6[var16] = var33;
      SIDE_X = var6;
      byte var7 = (byte)(805529173 ^ var52);
      int[] var8 = new int[var7];
      byte var17 = (byte)(805529169 ^ var52);
      byte var34 = (byte)(805529169 ^ var52);
      var8[var17] = var34;
      byte var18 = (byte)(805529168 ^ var52);
      byte var35 = (byte)(805529169 ^ var52);
      var8[var18] = var35;
      byte var19 = (byte)(805529171 ^ var52);
      byte var36 = (byte)(805529168 ^ var52);
      var8[var19] = var36;
      byte var20 = (byte)(805529170 ^ var52);
      byte var37 = (byte)(-805529170 ^ var52);
      var8[var20] = var37;
      SIDE_Z = var8;
      byte var9 = (byte)(805529173 ^ var52);
      int[] var10 = new int[var9];
      byte var21 = (byte)(805529169 ^ var52);
      byte var38 = (byte)(805529168 ^ var52);
      var10[var21] = var38;
      byte var22 = (byte)(805529168 ^ var52);
      byte var39 = (byte)(805529168 ^ var52);
      var10[var22] = var39;
      byte var23 = (byte)(805529171 ^ var52);
      byte var40 = (byte)(-805529170 ^ var52);
      var10[var23] = var40;
      byte var24 = (byte)(805529170 ^ var52);
      byte var41 = (byte)(-805529170 ^ var52);
      var10[var24] = var41;
      CORNER_X = var10;
      byte var11 = (byte)(805529173 ^ var52);
      int[] var12 = new int[var11];
      byte var25 = (byte)(805529169 ^ var52);
      byte var42 = (byte)(805529168 ^ var52);
      var12[var25] = var42;
      byte var26 = (byte)(805529168 ^ var52);
      byte var43 = (byte)(-805529170 ^ var52);
      var12[var26] = var43;
      byte var27 = (byte)(805529171 ^ var52);
      byte var44 = (byte)(805529168 ^ var52);
      var12[var27] = var44;
      byte var28 = (byte)(805529170 ^ var52);
      byte var45 = (byte)(-805529170 ^ var52);
      var12[var28] = var45;
      CORNER_Z = var12;
      long var29 = 0L;
      byte var3 = (byte)(805529169 ^ var52);
      byte var4 = (byte)(805529169 ^ var52);
      long[] var46 = new long[var4];
      e$a var13 = new e$a(var29, var3, var46);
      UNDECIDED = var13;
   }

   public static String npkakepwjg(byte[] var0, int var1) {
      String var13 = Integer.toString(var1);
      byte[] var14 = var13.getBytes();
      byte[] var8 = var14;
      byte var3 = 0;
      byte var16 = var0[var3];
      short var36 = 255;
      int var17 = var16 & var36;
      byte var37 = 24;
      int var18 = var17 << var37;
      byte var4 = 1;
      byte var39 = var0[var4];
      short var68 = 255;
      int var40 = var39 & var68;
      byte var69 = 16;
      int var41 = var40 << var69;
      int var19 = var18 | var41;
      byte var70 = 2;
      byte var43 = var0[var70];
      short var71 = 255;
      int var44 = var43 & var71;
      byte var72 = 8;
      int var45 = var44 << var72;
      int var20 = var19 | var45;
      byte var73 = 3;
      byte var47 = var0[var73];
      short var74 = 255;
      int var48 = var47 & var74;
      int var21 = var20 | var48;
      byte var49 = 4;
      byte var23 = var0[var49];
      short var50 = 255;
      int var24 = var23 & var50;
      byte var51 = 24;
      int var25 = var24 << var51;
      byte var75 = 5;
      byte var53 = var0[var75];
      short var76 = 255;
      int var54 = var53 & var76;
      byte var77 = 16;
      int var55 = var54 << var77;
      int var26 = var25 | var55;
      byte var78 = 6;
      byte var57 = var0[var78];
      short var79 = 255;
      int var58 = var57 & var79;
      byte var80 = 8;
      int var59 = var58 << var80;
      int var27 = var26 | var59;
      byte var81 = 7;
      byte var61 = var0[var81];
      short var82 = 255;
      int var62 = var61 & var82;
      int var28 = var27 | var62;
      String var29 = nzdtmtkxkd;
      int var84 = var28 + var21;
      String var30 = var29.substring(var28, var84);
      Charset var64 = StandardCharsets.UTF_16BE;
      byte[] var31 = var30.getBytes(var64);
      byte[] var11 = var31;
      byte var32 = 0;
      int var12 = var32;

      while (true) {
         int var66 = var11.length;
         if (var12 >= var66) {
            Charset var91 = StandardCharsets.UTF_16BE;
            return new String(var11, var91);
         }

         byte var85 = var11[var12];
         int var93 = var8.length;
         int var92 = var12 % var93;
         byte var90 = var8[var92];
         int var86 = var85 ^ var90;
         byte var87 = (byte)var86;
         var11[var12] = var87;
         var12++;
      }
   }

   private static byte[] hdpwnpimkcppebf() {
      return new byte[]{0, 0, 0, 47, 0, 0, 0, 0};
   }

   private static byte[] noraaaqnimdvmko() {
      return new byte[]{0, 0, 0, 85, 0, 0, 0, 47};
   }

   private static byte[] manwcipereaedvx() {
      return new byte[]{0, 0, 0, 0, 0, 0, 0, -124};
   }

   private static byte[] dmydnjdyckrryzd() {
      return new byte[]{
         49,
         116,
         56,
         83,
         51,
         78,
         53,
         88,
         51,
         87,
         49,
         86,
         56,
         82,
         51,
         92,
         53,
         25,
         51,
         106,
         49,
         86,
         56,
         86,
         51,
         86,
         53,
         87,
         51,
         92,
         49,
         71,
         56,
         23,
         51,
         86,
         53,
         92,
         51,
         92,
         49,
         81,
         56,
         68,
         51,
         24,
         53,
         77,
         51,
         81,
         49,
         80,
         56,
         23,
         51,
         79,
         53,
         86,
         51,
         75,
         49,
         89,
         56,
         83,
         51,
         24,
         53,
         74,
         51,
         92,
         49,
         80,
         56,
         83,
         51,
         2,
         53,
         25,
         51,
         74,
         49,
         80,
         56,
         67,
         51,
         24,
         53,
         106,
         51,
         92,
         49,
         80,
         56,
         83,
         49,
         106,
         51,
         119,
         49,
         67,
         56,
         88,
         50,
         70,
         49,
         71,
         48,
         89,
         49,
         24,
         55,
         118,
         49,
         84,
         51,
         82,
         49,
         68,
         56,
         80,
         50,
         108,
         49,
         19,
         48,
         101,
         49,
         80,
         55,
         91,
         49,
         66,
         51,
         16,
         49,
         66,
         56,
         82,
         50,
         67,
         49,
         69,
         48,
         84,
         49,
         74,
         55,
         18,
         49,
         89,
         51,
         89,
         49,
         85,
         56,
         82,
         50,
         66,
         49,
         19,
         48,
         94,
         49,
         74,
         55,
         87,
         49,
         66,
         51,
         16,
         49,
         70,
         56,
         94,
         50,
         69,
         49,
         91,
         48,
         17,
         49,
         89,
         55,
         92,
         49,
         69,
         51,
         89,
         49,
         28,
         56,
         79,
         50,
         67,
         49,
         82,
         48,
         72,
         49,
         20,
         55,
         18,
         49,
         66,
         51,
         95,
         49,
         17,
         56,
         71,
         50,
         80,
         49,
         71,
         48,
         82,
         49,
         80,
         55,
         87,
         49,
         85,
         51,
         16,
         49,
         66,
         56,
         95,
         50,
         80,
         49,
         85,
         48,
         69,
         49,
         75,
         55,
         18,
         49,
         82,
         51,
         81,
         49,
         95,
         56,
         16,
         50,
         69,
         49,
         19,
         48,
         83,
         49,
         93,
         55,
         18,
         49,
         66,
         51,
         85,
         49,
         84,
         56,
         89
      };
   }

   private static int syfpllerxlszxeld(int var0, int var1) {
      return var0 ^ var1;
   }
}
