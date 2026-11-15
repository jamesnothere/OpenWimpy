package com.wimpyclient.s;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongCollection;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.ChunkPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class i {
   public static final int MARGIN = 1;
   public static final int DOUBT_MISMATCH = 8;
   public static final int MISMATCH_COLUMNS = 26;
   private final j world;
   private final Long2ObjectOpenHashMap<l> terrains;
   private final Long2ObjectOpenHashMap<k> shown;
   private final Long2ObjectOpenHashMap<c> decorations;
   private final Long2ObjectOpenHashMap<i$c> may;
   private final Long2ObjectOpenHashMap<e> gateHeights;
   private final d order;
   private final Long2IntOpenHashMap doubt;
   private LongOpenHashSet bandChunks;
   private LongOpenHashSet decorationChunks;
   private final LongOpenHashSet dirty;
   private final LongOpenHashSet built;
   private final Long2ObjectOpenHashMap<n> bands;
   private final LongOpenHashSet clustersDue;
   private final LongOpenHashSet clustersSent;
   private final ArrayDeque<i$b> out;
   private final LongOpenHashSet collected;
   private final Long2LongOpenHashMap signatures;
   private int focusX;
   private int focusZ;
   private int compared;
   private int mismatched;
   private static int D7bOaE3zl8;
   private transient int u5TTGMIUpk;
   private static byte[] dkyrzvfvpb = zlgqwutgqrkzodo();

   public i(j var1) {
super();
      int var44 = 826028057 ^ 1053100635;
      
      var44 = ojxhvnwbwftnuctp(var44, 302594509);
      var44 = 1981255062 ^ 443782100 ^ Integer.parseInt("1905532365");
      this.u5TTGMIUpk = 1021321272 ^ D7bOaE3zl8;
      var44 = ojxhvnwbwftnuctp(var44, 254195162);
      Long2ObjectOpenHashMap var3 = new Long2ObjectOpenHashMap();
      this.terrains = var3;
      Long2ObjectOpenHashMap var24 = new Long2ObjectOpenHashMap();
      this.shown = var24;
      Long2ObjectOpenHashMap var25 = new Long2ObjectOpenHashMap();
      this.decorations = var25;
      Long2ObjectOpenHashMap var26 = new Long2ObjectOpenHashMap();
      this.may = var26;
      Long2ObjectOpenHashMap var27 = new Long2ObjectOpenHashMap();
      this.gateHeights = var27;
      d var28 = new d();
      this.order = var28;
      Long2IntOpenHashMap var29 = new Long2IntOpenHashMap();
      this.doubt = var29;
      LongOpenHashSet var30 = new LongOpenHashSet();
      this.bandChunks = var30;
      LongOpenHashSet var31 = new LongOpenHashSet();
      this.decorationChunks = var31;
      LongOpenHashSet var32 = new LongOpenHashSet();
      this.dirty = var32;
      LongOpenHashSet var33 = new LongOpenHashSet();
      this.built = var33;
      Long2ObjectOpenHashMap var34 = new Long2ObjectOpenHashMap();
      this.bands = var34;
      LongOpenHashSet var35 = new LongOpenHashSet();
      this.clustersDue = var35;
      LongOpenHashSet var36 = new LongOpenHashSet();
      this.clustersSent = var36;
      ArrayDeque var37 = new ArrayDeque();
      this.out = var37;
      LongOpenHashSet var38 = new LongOpenHashSet();
      this.collected = var38;
      Long2LongOpenHashMap var39 = new Long2LongOpenHashMap();
      this.signatures = var39;
      this.world = var1;
      Long2IntOpenHashMap var23 = this.doubt;
      byte var41 = -1;
      var23.defaultReturnValue(var41);
   }

   public void want(LongCollection var1, int var2, int var3) {
      int var101 = 1627617404 ^ 1053946311 ^ 257596489;
      var101 = 1585376098 ^ var101;
      this.focusX = var2;
      this.focusZ = var3;
      LongOpenHashSet var19 = new LongOpenHashSet(var1);
      LongOpenHashSet var20 = new LongOpenHashSet();
      LongOpenHashSet var9 = var20;
      byte var21 = (byte)(251068050 ^ var101);
      byte var10 = var21;
      LongIterator var23 = var19.iterator();
      LongIterator var11 = var23;
      var101 = 2006515283 ^ var101;

      label95:
      while (true) {
         byte var25 = (byte)((var11.hasNext()) ? 1 : 0);
         if (var25 == (2037252291 ^ var101)) {
            label92:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var101)) {
                  case 189093911:
                     var101 ^= 616838468;
                     break label92;
                  case 328748752:
                     break;
                  case 403729620:
                     break label92;
                  case 1695412392:
                  default:
                     throw new RuntimeException();
               }
            }

            LongIterator var44 = var9.iterator();
            LongIterator var97 = var44;
            var101 = 898754184 ^ var101;

            label85:
            while (true) {
               byte var46 = (byte)((var97.hasNext()) ? 1 : 0);
               if (var46 == (1748751119 ^ var101)) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var101)) {
                        case 166953174:
                           var101 = 1813373367 ^ var101;
                        case 623435568:
                           break label95;
                        case 713210295:
                        default:
                           throw new RuntimeException();
                        case 1857272475:
                     }
                  }
               }

               var101 ^= 396549335;
               long var48 = var97.nextLong();
               Long2ObjectOpenHashMap var51 = this.decorations;
               byte var52 = (byte)((var51.containsKey(var48)) ? 1 : 0);
               if (var52 == (2140737496 ^ var101)) {
                  var101 = 493132241 ^ var101;
                  LongOpenHashSet var54 = this.dirty;
                  boolean var55 = var54.add(var48);
                  var101 = 26917493 ^ var101;
               } else {
                  label71:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var101)) {
                        case 121172267:
                           var101 ^= 486417316;
                           break label71;
                        case 969909857:
                           break;
                        case 1239392926:
                           break label71;
                        case 1773157657:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var101)) {
                     case 9930071:
                        var101 ^= 190644083;
                        continue label85;
                     case 54067705:
                     default:
                        throw new RuntimeException();
                     case 449607709:
                        continue label85;
                     case 1856644599:
                  }
               }
            }
         }

         var101 = 1874579102 ^ var101;
         long var27 = var11.nextLong();
         int var31 = ChunkPos.getX(var27);
         int var14 = var31;
         int var34 = ChunkPos.getZ(var27);
         int var15 = var34;
         int var36 = -var10;
         int var16 = var36;
         var101 = 1006478444 ^ var101;

         while (var16 <= var10) {
            var101 = 217486310 ^ var101;
            int var39 = -var10;
            int var17 = var39;
            var101 = 950165549 ^ var101;

            label47:
            while (var17 <= var10) {
               var101 ^= 1439692223;
               int var79 = var14 + var16;
               int var96 = var15 + var17;
               long var80 = ChunkPos.asLong(var79, var96);
               boolean var42 = var9.add(var80);
               var17 += 1286827076 ^ var101;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var101)) {
                     case 77327734:
                        var101 ^= 1439692223;
                     case 269721972:
                        continue label47;
                     case 1319949571:
                        break;
                     case 1511455395:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            var101 = ojxhvnwbwftnuctp(var101, 518573717);
            var16 += 127162222 ^ var101;
            var101 = 716979550 ^ var101;
         }

         var101 = 880368143 ^ var101;
         var101 = 1614754045 ^ var101;
      }

      this.bandChunks = var19;
      this.decorationChunks = var9;
      LongOpenHashSet var59 = this.built;
      boolean var60 = var59.retainAll(var19);
      Long2ObjectOpenHashMap var62 = this.bands;
      LongSet var63 = var62.keySet();
      boolean var64 = var63.retainAll(var19);
      LongOpenHashSet var66 = this.clustersDue;
      boolean var67 = var66.retainAll(var19);
      LongOpenHashSet var69 = this.clustersSent;
      boolean var70 = var69.retainAll(var19);
      LongOpenHashSet var72 = this.dirty;
      boolean var73 = var72.retainAll(var9);
      this.forgetOutside(var9);
   }

   private void forgetOutside(LongOpenHashSet var1) {
      int var81 = 2040953272 ^ 1570445383 ^ 257596489;
      var81 = 1379591771 ^ var81;
      LongOpenHashSet var2 = new LongOpenHashSet();
      LongOpenHashSet var5 = var2;
      LongIterator var14 = var1.iterator();
      LongIterator var6 = var14;
      var81 = 708441984 ^ var81;

      label77:
      while (true) {
         byte var16 = (byte)((var6.hasNext()) ? 1 : 0);
         if (var16 != (1399123053 ^ var81)) {
            var81 = 932321604 ^ var81;
            long var18 = var6.nextLong();
            int var22 = ChunkPos.getX(var18);
            int var9 = var22;
            int var25 = ChunkPos.getZ(var18);
            int var10 = var25;
            byte var26 = (byte)(-1693906218 ^ var81);
            int var11 = var26;
            var81 = 1455003170 ^ var81;

            label63:
            while (true) {
               byte var63 = (byte)(844063498 ^ var81);
               if (var11 > var63) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var81)) {
                        case 24772010:
                           var81 ^= 673030176;
                           break label63;
                        case 749893270:
                        default:
                           throw new RuntimeException(new IOException());
                        case 947256473:
                           break label63;
                        case 1631006913:
                     }
                  }
               }

               var81 = 626867657 ^ var81;
               byte var28 = (byte)(-387079875 ^ var81);
               int var12 = var28;
               var81 = 587657728 ^ var81;

               while (true) {
                  byte var64 = (byte)(873770179 ^ var81);
                  if (var12 > var64) {
                     label48:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var81)) {
                           case 82328227:
                              var81 ^= 135244609;
                              break label48;
                           case 1443653678:
                              break;
                           case 1612925941:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1669325864:
                              break label48;
                        }
                     }

                     var11 += 1008404354 ^ var81;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var81)) {
                           case 74736278:
                              var81 ^= 240411784;
                           case 1021055992:
                              continue label63;
                           case 1121606377:
                           default:
                              throw new RuntimeException(new IOException());
                           case 2102874798:
                        }
                     }
                  }

                  var81 = 597950610 ^ var81;
                  int var66 = var9 + var11;
                  int var78 = var10 + var12;
                  long var67 = ChunkPos.asLong(var66, var78);
                  boolean var31 = var5.add(var67);
                  var12 += 397454417 ^ var81;
                  var81 = ojxhvnwbwftnuctp(var81, 597950610);
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var81)) {
                  case 26466679:
                     var81 = 1760909374 ^ var81;
                     break label77;
                  case 426050349:
                  default:
                     throw new RuntimeException(new IOException());
                  case 500419547:
                     break label77;
                  case 2065349803:
               }
            }
         }

         var81 = 1228287814 ^ var81;
      }

      Long2ObjectOpenHashMap var33 = this.terrains;
      LongSet var34 = var33.keySet();
      boolean var35 = var34.retainAll(var5);
      Long2ObjectOpenHashMap var37 = this.shown;
      LongSet var38 = var37.keySet();
      boolean var39 = var38.retainAll(var5);
      Long2ObjectOpenHashMap var41 = this.gateHeights;
      LongSet var42 = var41.keySet();
      boolean var43 = var42.retainAll(var5);
      Long2IntOpenHashMap var45 = this.doubt;
      LongSet var46 = var45.keySet();
      boolean var47 = var46.retainAll(var5);
      Long2ObjectOpenHashMap var49 = this.decorations;
      LongSet var50 = var49.keySet();
      boolean var51 = var50.retainAll(var1);
      Long2ObjectOpenHashMap var53 = this.may;
      LongSet var54 = var53.keySet();
      boolean var55 = var54.retainAll(var1);
      LongOpenHashSet var57 = this.collected;
      boolean var58 = var57.retainAll(var1);
      Long2LongOpenHashMap var60 = this.signatures;
      LongSet var61 = var60.keySet();
      boolean var62 = var61.retainAll(var1);
   }

   public void offer(k var1) {
      int var77 = 1360452115 ^ 1797292593 ^ 257596489;
      var77 = 1622817115 ^ var77;
      int var12 = var1.chunkX;
      int var44 = var1.chunkZ;
      long var13 = ChunkPos.asLong(var12, var44);
      Long2ObjectOpenHashMap var16 = this.shown;
      Object var17 = var16.put(var13, var1);
      Long2IntOpenHashMap var19 = this.doubt;
      int var20 = var19.remove(var13);
      Long2ObjectOpenHashMap var22 = this.gateHeights;
      Object var23 = var22.remove(var13);
      byte var24 = (byte)(-1440152883 ^ var77);
      int var8 = var24;
      var77 = 1887134359 ^ var77;

      while (true) {
         byte var51 = (byte)(632135588 ^ var77);
         if (var8 <= var51) {
            var77 = 966325147 ^ var77;
            byte var26 = (byte)(-473263167 ^ var77);
            int var9 = var26;
            var77 = 528550754 ^ var77;

            label41:
            while (true) {
               byte var52 = (byte)(62154589 ^ var77);
               if (var9 > var52) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                        case 58270556:
                           var77 ^= 1502681856;
                        case 496829642:
                           break label41;
                        case 695055157:
                           break;
                        case 1590368872:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }

               var77 = 1281778281 ^ var77;
               LongOpenHashSet var29 = this.collected;
               int var54 = var1.chunkX;
               int var55 = var54 + var8;
               int var69 = var1.chunkZ;
               int var70 = var69 + var9;
               long var56 = ChunkPos.asLong(var55, var70);
               boolean var30 = var29.remove(var56);
               var9 += 1339163958 ^ var77;
               var77 = 1281778281 ^ var77;
            }
         } else {
            label80:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                  case 28390528:
                     break label80;
                  case 35243183:
                  default:
                     throw new RuntimeException();
                  case 151011582:
                     var77 ^= 18431365;
                     break label80;
                  case 2117869369:
               }
            }

            byte var31 = (byte)(-615817763 ^ var77);
            int var73 = var31;
            var77 = 381922393 ^ var77;

            while (true) {
               byte var58 = (byte)(846663290 ^ var77);
               if (var73 > var58) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                        case 29793913:
                           var77 = 750329518 ^ var77;
                           return;
                        case 1788383400:
                           return;
                        case 1918049693:
                           break;
                        case 2130575301:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }

               var77 = 353740136 ^ var77;
               byte var33 = (byte)(-660777748 ^ var77);
               int var74 = var33;
               var77 = 1440550616 ^ var77;

               while (true) {
                  byte var59 = (byte)(1925162442 ^ var77);
                  if (var74 > var59) {
                     var77 = 794636273 ^ var77;
                     var73 += 1575127611 ^ var77;
                     var77 = ojxhvnwbwftnuctp(var77, 1872069697);
                     break;
                  }

                  var77 = 497345649 ^ var77;
                  int var36 = var1.chunkX;
                  int var37 = var36 + var73;
                  int var62 = var1.chunkZ;
                  int var63 = var62 + var74;
                  long var38 = ChunkPos.asLong(var37, var63);
                  LongOpenHashSet var41 = this.decorationChunks;
                  byte var42 = (byte)((var41.contains(var38)) ? 1 : 0);
                  if (var42 != (1864057274 ^ var77)) {
                     var77 = 1161996260 ^ var77;
                     this.markDirty(var38);
                     var77 = 929626555 ^ var77;
                  } else {
                     label66:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                           case 121937987:
                              var77 ^= 1915379295;
                              break label66;
                           case 716461454:
                              break;
                           case 1519976660:
                           default:
                              throw new RuntimeException();
                           case 1663420386:
                              break label66;
                        }
                     }
                  }

                  var74 += 489758692 ^ var77;
                  var77 = ojxhvnwbwftnuctp(var77, 1871624750);
               }
            }
         }

         var8 += 1512406111 ^ var77;
         var77 = 2139677689 ^ var77;
      }
   }

   public boolean idle() {
      int var26 = 2072445695 ^ 1060135202 ^ 257596489;
      var26 = 1491678145 ^ var26;
      LongOpenHashSet var4 = this.dirty;
      byte var5 = (byte)((var4.isEmpty()) ? 1 : 0);
      if (var5 == (319081557 ^ var26)) {
         var26 = 1543596642 ^ var26;
      } else {
         var26 = 1978017484 ^ var26;
         ArrayDeque var7 = this.out;
         byte var8 = (byte)((var7.isEmpty()) ? 1 : 0);
         if (var8 == (1726147225 ^ var26)) {
            var26 = 703024302 ^ var26;
         } else {
            var26 = 1984200014 ^ var26;
            LongOpenHashSet var10 = this.clustersDue;
            byte var11 = (byte)((var10.isEmpty()) ? 1 : 0);
            if (var11 != (279353303 ^ var26)) {
               var26 = 780414887 ^ var26;
               LongOpenHashSet var13 = this.bandChunks;
               LongIterator var14 = var13.iterator();
               LongIterator var3 = var14;
               var26 = 1627360400 ^ var26;

               while (true) {
                  byte var16 = (byte)((var3.hasNext()) ? 1 : 0);
                  if (var16 == (1591555296 ^ var26)) {
                     var26 = ojxhvnwbwftnuctp(var26, 273517477);
                     return (((byte)(1318108996 ^ var26)) != 0);
                  }

                  var26 = 1509380509 ^ var26;
                  LongOpenHashSet var19 = this.built;
                  long var23 = var3.nextLong();
                  byte var20 = (byte)((var19.contains(var23)) ? 1 : 0);
                  if (var20 == (120219005 ^ var26)) {
                     var26 = 1682303819 ^ var26;
                     return (((byte)(1668255286 ^ var26)) != 0);
                  }

                  var26 = 1509380509 ^ var26;
               }
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
                  case 4380310:
                     var26 ^= 1604530656;
                     return (((byte)(1325770295 ^ var26)) != 0);
                  case 528322738:
                     break;
                  case 783431016:
                     return (((byte)(1325770295 ^ var26)) != 0);
                  case 1790084169:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      }

      return (((byte)(1325770295 ^ var26)) != 0);
   }

   public int compared() {
      int var5 = 1510636935 ^ 1091940940 ^ 257596489;
      var5 = 576861665 ^ var5;
      return this.compared;
   }

   public int mismatched() {
      int var5 = 784169 ^ 2037193178 ^ 257596489;
      var5 = 744563256 ^ var5;
      return this.mismatched;
   }

   public i$b step() {
      int var270 = 492059628 ^ 227341916 ^ 257596489;
      var270 = 844563969 ^ var270;
      ArrayDeque var25 = this.out;
      byte var26 = (byte)((var25.isEmpty()) ? 1 : 0);
      if (var26 == (768956408 ^ var270)) {
         var270 = 1593420141 ^ var270;
         ArrayDeque var28 = this.out;
         Object var29 = var28.poll();
         return (i$b)var29;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var270)) {
               case 147683237:
                  var270 ^= 1188650983;
               case 314227178:
                  LongOpenHashSet var31 = new LongOpenHashSet();
                  LongOpenHashSet var8 = var31;
                  LongOpenHashSet var33 = this.dirty;
                  LongIterator var34 = var33.iterator();
                  LongIterator var9 = var34;
                  var270 = 1366051875 ^ var270;

                  while (true) {
                     byte var36 = (byte)((var9.hasNext()) ? 1 : 0);
                     if (var36 == (979387452 ^ var270)) {
                        var270 = ojxhvnwbwftnuctp(var270, 691046975);
                        byte var155 = (byte)((var8.isEmpty()) ? 1 : 0);
                        LongOpenHashSet var213;
                        if (var155 != (324062723 ^ var270)) {
                           var270 = 1346614709 ^ var270;
                           var213 = this.dirty;

                           label201:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var270)) {
                                 case 32898211:
                                    var270 ^= 1061286790;
                                    break label201;
                                 case 603521930:
                                    break;
                                 case 858621364:
                                    break label201;
                                 case 1143210054:
                                 default:
                                    throw new IllegalStateException();
                              }
                           }
                        } else {
                           var270 = ojxhvnwbwftnuctp(var270, 847901821);
                           var213 = var8;
                           var270 = 1569436238 ^ var270;
                        }

                        long var38 = this.nearest(var213);
                        long var2 = Long.MIN_VALUE;
                        long var311;
                        int var42 = (var311 = var38 - var2) == 0L ? 0 : (var311 < 0L ? -1 : 1);
                        if (var42 != (2085783600 ^ var270)) {
                           var270 = 1448669295 ^ var270;
                           int var45 = ChunkPos.getX(var38);
                           int var12 = var45;
                           int var48 = ChunkPos.getZ(var38);
                           int var13 = var48;
                           byte var49 = (byte)(-705329248 ^ var270);
                           int var14 = var49;
                           var270 = 1232949820 ^ var270;

                           label192:
                           while (true) {
                              byte var156 = (byte)(1668754018 ^ var270);
                              if (var14 > var156) {
                                 var270 = ojxhvnwbwftnuctp(var270, 1254620860);
                                 this.predict(var38);
                                 return null;
                              }

                              var270 = 1760477520 ^ var270;
                              byte var53 = (byte)(-194636596 ^ var270);
                              int var15 = var53;
                              var270 = 368564786 ^ var270;

                              label178:
                              while (true) {
                                 byte var159 = (byte)(510537984 ^ var270);
                                 if (var15 > var159) {
                                    var270 = ojxhvnwbwftnuctp(var270, 1739168233);
                                    var14 += 2043128041 ^ var270;

                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var270)) {
                                          case 200453766:
                                             var270 ^= 447775371;
                                             continue label192;
                                          case 780946966:
                                          default:
                                             throw new IllegalStateException();
                                          case 1046500734:
                                             break;
                                          case 1420147486:
                                             continue label192;
                                       }
                                    }
                                 }

                                 var270 = 1771776379 ^ var270;
                                 int var56 = var12 + var14;
                                 int var162 = var13 + var15;
                                 long var57 = ChunkPos.asLong(var56, var162);
                                 Long2ObjectOpenHashMap var60 = this.terrains;
                                 byte var61 = (byte)((var60.containsKey(var57)) ? 1 : 0);
                                 if (var61 == (2012551290 ^ var270)) {
                                    var270 = 397225892 ^ var270;
                                    Long2ObjectOpenHashMap var63 = this.terrains;
                                    j var230 = this.world;
                                    int var237 = var12 + var14;
                                    int var247 = var13 + var15;
                                    l var231 = var230.terrain(var237, var247);
                                    Object var64 = var63.put(var57, var231);
                                    return null;
                                 }

                                 var270 = ojxhvnwbwftnuctp(var270, 1642505845);
                                 var15 += 370392590 ^ var270;

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var270)) {
                                       case 180770350:
                                          var270 ^= 142446350;
                                          continue label178;
                                       case 265253670:
                                          break;
                                       case 674152398:
                                          continue label178;
                                       case 1805157069:
                                       default:
                                          throw new IllegalStateException();
                                    }
                                 }
                              }
                           }
                        } else {
                           var270 = 678223263 ^ var270;
                           LongOpenHashSet var66 = new LongOpenHashSet();
                           LongOpenHashSet var256 = var66;
                           LongOpenHashSet var68 = this.bandChunks;
                           LongIterator var69 = var68.iterator();
                           LongIterator var257 = var69;
                           var270 = 327985930 ^ var270;

                           while (true) {
                              byte var71 = (byte)((var257.hasNext()) ? 1 : 0);
                              if (var71 == (1202912933 ^ var270)) {
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var270)) {
                                       case 183143149:
                                          var270 ^= 708598569;
                                       case 342339204:
                                          break;
                                       case 533483926:
                                          continue;
                                       case 960258735:
                                       default:
                                          throw new IllegalStateException();
                                    }

                                    while (true) {
                                       byte var81 = (byte)((var256.isEmpty()) ? 1 : 0);
                                       if (var81 != (1838065036 ^ var270)) {
                                          var270 = 1791763026 ^ var270;
                                          LongOpenHashSet var216 = this.clustersDue;
                                          LongOpenHashSet var82 = new LongOpenHashSet(var216);
                                          LongOpenHashSet var260 = var82;
                                          var270 = 771699039 ^ var270;

                                          while (true) {
                                             byte var84 = (byte)((var260.isEmpty()) ? 1 : 0);
                                             if (var84 != (717076097 ^ var270)) {
                                                var270 = ojxhvnwbwftnuctp(var270, 1472626040);
                                                return null;
                                             }

                                             var270 = 1285096376 ^ var270;
                                             long var87 = this.nearest(var260);
                                             boolean var90 = var260.remove(var87);
                                             byte var92 = (byte)((this.clustersReady(var87)) ? 1 : 0);
                                             if (var92 != (1713681721 ^ var270)) {
                                                var270 = 1183348610 ^ var270;
                                                LongOpenHashSet var94 = this.clustersDue;
                                                boolean var95 = var94.remove(var87);
                                                LongOpenHashSet var97 = this.clustersSent;
                                                boolean var98 = var97.add(var87);
                                                int var240 = ChunkPos.getX(var87);
                                                int var250 = ChunkPos.getZ(var87);
                                                b$e var253 = (var1, var2x) -> {
                                                   int var12x = 1981315496 ^ 2004451752 ^ 257596489;
                                                   var12x = 705281690 ^ var12x;
                                                   Long2ObjectOpenHashMap var6 = this.bands;
                                                   long var9x = ChunkPos.asLong(var1, var2x);
                                                   Object var7 = var6.get(var9x);
                                                   return (n)var7;
                                                };
                                                List var241 = b.clusters(var240, var250, var253);
                                                List var242 = List.copyOf(var241);
                                                return new i$b(var87, var242);
                                             }

                                             var270 = 1874538142 ^ var270;
                                             var270 = ojxhvnwbwftnuctp(var270, 589442342);
                                          }
                                       }

                                       var270 = 787292214 ^ var270;
                                       long var101 = this.nearest(var256);
                                       boolean var104 = var256.remove(var101);
                                       byte var106 = (byte)((this.ready(var101)) ? 1 : 0);
                                       if (var106 != (1130595770 ^ var270)) {
                                          var270 = 1192063329 ^ var270;
                                          int var109 = ChunkPos.getX(var101);
                                          int var265 = var109;
                                          int var112 = ChunkPos.getZ(var101);
                                          int var18 = var112;
                                          byte var113 = (byte)(74380498 ^ var270);
                                          c[] var114 = new c[var113];
                                          c[] var19 = var114;
                                          byte var115 = (byte)(-74380508 ^ var270);
                                          int var20 = var115;
                                          var270 = 186486789 ^ var270;

                                          while (true) {
                                             byte var185 = (byte)(259220703 ^ var270);
                                             if (var20 > var185) {
                                                var270 = 1360162 ^ var270;
                                                Long2ObjectOpenHashMap var118 = this.terrains;
                                                Object var119 = var118.get(var101);
                                                l var120 = (l)var119;
                                                d var220 = this.order;
                                                n var121 = n.of(var120, var19, var220);
                                                LongOpenHashSet var123 = this.built;
                                                boolean var124 = var123.add(var101);
                                                Long2ObjectOpenHashMap var126 = this.bands;
                                                Object var127 = var126.put(var101, var121);
                                                byte var128 = (byte)(-258450942 ^ var270);
                                                int var21 = var128;
                                                var270 = 126014481 ^ var270;

                                                while (true) {
                                                   byte var193 = (byte)(149254639 ^ var270);
                                                   if (var21 > var193) {
                                                      var270 = ojxhvnwbwftnuctp(var270, 319846907);
                                                      return null;
                                                   }

                                                   var270 = 1197224717 ^ var270;
                                                   byte var130 = (byte)(-1337541346 ^ var270);
                                                   int var22 = var130;
                                                   var270 = 1812425094 ^ var270;

                                                   label109:
                                                   while (true) {
                                                      byte var194 = (byte)(599665508 ^ var270);
                                                      if (var22 > var194) {
                                                         var270 = ojxhvnwbwftnuctp(var270, 572010713);
                                                         var21 += 27663294 ^ var270;
                                                         var270 = ojxhvnwbwftnuctp(var270, 155413074);
                                                         break;
                                                      }

                                                      var270 = 1503781034 ^ var270;
                                                      int var133 = var265 + var21;
                                                      int var197 = var18 + var22;
                                                      long var134 = ChunkPos.asLong(var133, var197);
                                                      LongOpenHashSet var137 = this.bandChunks;
                                                      byte var138 = (byte)((var137.contains(var134)) ? 1 : 0);
                                                      if (var138 != (2048904140 ^ var270)) {
                                                         var270 = 1805210628 ^ var270;
                                                         LongOpenHashSet var140 = this.clustersDue;
                                                         boolean var141 = var140.add(var134);
                                                         var270 = 1145327143 ^ var270;
                                                      } else {
                                                         var270 = ojxhvnwbwftnuctp(var270, 803019299);
                                                      }

                                                      var22 += 1438831086 ^ var270;

                                                      while (true) {
                                                         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var270)) {
                                                            case 103359357:
                                                               var270 ^= 1987902089;
                                                               continue label109;
                                                            case 994650534:
                                                            default:
                                                               throw new IllegalStateException();
                                                            case 1549283078:
                                                               break;
                                                            case 1879247752:
                                                               continue label109;
                                                         }
                                                      }
                                                   }
                                                }
                                             }

                                             var270 = 1856242423 ^ var270;
                                             byte var143 = (byte)(-1641506346 ^ var270);
                                             int var267 = var143;
                                             var270 = 2013471007 ^ var270;

                                             label131:
                                             while (true) {
                                                byte var202 = (byte)(433342263 ^ var270);
                                                if (var267 > var202) {
                                                   var270 = ojxhvnwbwftnuctp(var270, 524142436);
                                                   var20 += 115966035 ^ var270;
                                                   var270 = 161145996 ^ var270;
                                                   break;
                                                }

                                                var270 ^= 1018239259;
                                                byte var222 = (byte)(627400236 ^ var270);
                                                int var204 = var20 + var222;
                                                byte var223 = (byte)(627400238 ^ var270);
                                                int var205 = var204 * var223;
                                                int var206 = var205 + var267;
                                                byte var225 = (byte)(627400236 ^ var270);
                                                int var207 = var206 + var225;
                                                Long2ObjectOpenHashMap var227 = this.decorations;
                                                int var234 = var265 + var20;
                                                int var245 = var18 + var267;
                                                long var235 = ChunkPos.asLong(var234, var245);
                                                Object var228 = var227.get(var235);
                                                c var229 = (c)var228;
                                                var19[var207] = var229;
                                                var267 += 627400236 ^ var270;

                                                while (true) {
                                                   switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var270)) {
                                                      case 141837074:
                                                         var270 ^= 1018239259;
                                                         continue label131;
                                                      case 455094799:
                                                      default:
                                                         throw new IllegalStateException();
                                                      case 1682983715:
                                                         continue label131;
                                                      case 1883732486:
                                                   }
                                                }
                                             }
                                          }
                                       }

                                       label150:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var270)) {
                                             case 43028603:
                                                var270 ^= 204258729;
                                                break label150;
                                             case 540264726:
                                             default:
                                                throw new IllegalStateException();
                                             case 1157542696:
                                                break;
                                             case 1951931277:
                                                break label150;
                                          }
                                       }

                                       var270 = ojxhvnwbwftnuctp(var270, 583114143);
                                    }
                                 }
                              }

                              var270 = 2090097847 ^ var270;
                              long var73 = var257.nextLong();
                              LongOpenHashSet var76 = this.built;
                              byte var77 = (byte)((var76.contains(var73)) ? 1 : 0);
                              if (var77 == (992387602 ^ var270)) {
                                 var270 = 427260578 ^ var270;
                                 boolean var79 = var256.add(var73);
                                 var270 = 501062160 ^ var270;
                              } else {
                                 var270 = 78307506 ^ var270;
                              }

                              var270 = ojxhvnwbwftnuctp(var270, 2017377285);
                           }
                        }
                     }

                     var270 = 1859611771 ^ var270;
                     long var147 = var9.nextLong();
                     Long2ObjectOpenHashMap var150 = this.decorations;
                     byte var151 = (byte)((var150.containsKey(var147)) ? 1 : 0);
                     if (var151 == (1421289543 ^ var270)) {
                        var270 = 1212388869 ^ var270;
                        boolean var153 = var8.add(var147);
                        var270 = 178485940 ^ var270;
                     } else {
                        label216:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var270)) {
                              case 69372606:
                                 var270 ^= 1122036913;
                                 break label216;
                              case 1456985369:
                              default:
                                 throw new IllegalStateException();
                              case 1645467255:
                                 break;
                              case 1967874674:
                                 break label216;
                           }
                        }
                     }

                     var270 = 741834954 ^ var270;
                  }
               case 521970881:
                  break;
               case 2093521412:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   private boolean clustersReady(long var1) {
      int var48 = 20443558 ^ 1017677411 ^ 257596489;
      var48 = 1488388860 ^ var48;
      Long2ObjectOpenHashMap var13 = this.bands;
      byte var14 = (byte)((var13.containsKey(var1)) ? 1 : 0);
      if (var14 == (1785915760 ^ var48)) {
         var48 = 1209586773 ^ var48;
         return (((byte)(577387813 ^ var48)) != 0);
      } else {
         var48 = ojxhvnwbwftnuctp(var48, 432496292);
         int var18 = ChunkPos.getX(var1);
         int var7 = var18;
         int var21 = ChunkPos.getZ(var1);
         int var8 = var21;
         byte var22 = (byte)(-1941288917 ^ var48);
         int var9 = var22;
         var48 = 1125005168 ^ var48;

         while (true) {
            byte var38 = (byte)(817594533 ^ var48);
            if (var9 > var38) {
               var48 = 1598748791 ^ var48;
               return (((byte)(1878096082 ^ var48)) != 0);
            }

            var48 = 1431810007 ^ var48;
            byte var24 = (byte)(-1709977460 ^ var48);
            int var10 = var24;
            var48 = 290848403 ^ var48;

            label54:
            while (true) {
               byte var39 = (byte)(1958334945 ^ var48);
               if (var10 > var39) {
                  var48 = ojxhvnwbwftnuctp(var48, 881230261);
                  var9 += 1077891156 ^ var48;
                  var48 = 1887752433 ^ var48;
                  break;
               }

               var48 ^= 1646766925;
               int var27 = var7 + var9;
               int var42 = var8 + var10;
               long var28 = ChunkPos.asLong(var27, var42);
               LongOpenHashSet var31 = this.bandChunks;
               byte var32 = (byte)((var31.contains(var28)) ? 1 : 0);
               if (var32 != (379484845 ^ var48)) {
                  var48 = 785201175 ^ var48;
                  Long2ObjectOpenHashMap var34 = this.bands;
                  byte var35 = (byte)((var34.containsKey(var28)) ? 1 : 0);
                  if (var35 == (944980666 ^ var48)) {
                     var48 = 366780720 ^ var48;
                     return (((byte)(764404618 ^ var48)) != 0);
                  }

                  var48 = 980111290 ^ var48;
               } else {
                  label39:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var48)) {
                        case 198384433:
                           var48 ^= 346453933;
                           break label39;
                        case 293490648:
                        default:
                           throw new IllegalStateException();
                        case 1296854906:
                           break label39;
                        case 2072608986:
                     }
                  }
               }

               var10 += 37227777 ^ var48;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var48)) {
                     case 34901512:
                        var48 ^= 1988222176;
                        continue label54;
                     case 689575694:
                        break;
                     case 1158128068:
                        continue label54;
                     case 2144472412:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }
         }
      }
   }

   private void unbuild(long var1) {
      int var62 = 375517998 ^ 1804123135 ^ 257596489;
      var62 = 1654071605 ^ var62;
      LongOpenHashSet var16 = this.built;
      byte var17 = (byte)((var16.remove(var1)) ? 1 : 0);
      if (var17 != (270857645 ^ var62)) {
         var62 = 1206348742 ^ var62;
         Long2ObjectOpenHashMap var19 = this.bands;
         Object var20 = var19.remove(var1);
         int var23 = ChunkPos.getX(var1);
         int var10 = var23;
         int var26 = ChunkPos.getZ(var1);
         int var11 = var26;
         byte var27 = (byte)(-1472437867 ^ var62);
         int var12 = var27;
         var62 = 805925642 ^ var62;

         while (true) {
            byte var49 = (byte)(1741352291 ^ var62);
            if (var12 > var49) {
               var62 = ojxhvnwbwftnuctp(var62, 634370345);
               return;
            }

            var62 = 608659692 ^ var62;
            byte var29 = (byte)(-1133348237 ^ var62);
            int var13 = var29;
            var62 = 1798962032 ^ var62;

            while (true) {
               byte var50 = (byte)(682917631 ^ var62);
               if (var13 > var50) {
                  var62 = ojxhvnwbwftnuctp(var62, 2121108593);
                  var12 += 1457123981 ^ var62;
                  var62 = 823336941 ^ var62;
                  break;
               }

               var62 = 1031151025 ^ var62;
               int var32 = var10 + var12;
               int var53 = var11 + var13;
               long var33 = ChunkPos.asLong(var32, var53);
               LongOpenHashSet var36 = this.clustersSent;
               byte var37 = (byte)((var36.remove(var33)) ? 1 : 0);
               if (var37 != (365060940 ^ var62)) {
                  var62 = 204752478 ^ var62;
                  ArrayDeque var39 = this.out;
                  Object var9 = null;
                  i$b var56 = new i$b(var33, (List<b$c>)var9);
                  boolean var40 = var39.add(var56);
                  var62 = 530414851 ^ var62;
               } else {
                  var62 = 329857885 ^ var62;
               }

               LongOpenHashSet var42 = this.bandChunks;
               byte var43 = (byte)((var42.contains(var33)) ? 1 : 0);
               if (var43 != (107698193 ^ var62)) {
                  var62 = 1876653801 ^ var62;
                  LongOpenHashSet var45 = this.clustersDue;
                  boolean var46 = var45.add(var33);
                  var62 = 629742323 ^ var62;
               } else {
                  label41:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var62)) {
                        case 100967652:
                           var62 ^= 1246915610;
                        case 314110127:
                           break label41;
                        case 1201778550:
                        default:
                           throw new RuntimeException();
                        case 1992933472:
                     }
                  }
               }

               var13 += 1278817290 ^ var62;
               var62 = 1686981366 ^ var62;
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var62)) {
               case 256347099:
                  var62 = 1377935845 ^ var62;
                  return;
               case 360331381:
                  return;
               case 898861440:
               default:
                  throw new RuntimeException();
               case 1788137699:
            }
         }
      }
   }

   private boolean ready(long var1) {
      int var60 = 835181790 ^ 464163351 ^ 257596489;
      var60 = 1512603530 ^ var60;
      int var12 = ChunkPos.getX(var1);
      int var8 = var12;
      int var15 = ChunkPos.getZ(var1);
      int var9 = var15;
      byte var16 = (byte)(-2132782347 ^ var60);
      int var10 = var16;
      var60 = 1270982531 ^ var60;

      label84:
      while (true) {
         byte var5 = (byte)(886966920 ^ var60);
         if (var10 > var5) {
            var60 = ojxhvnwbwftnuctp(var60, 553806829);
            Long2ObjectOpenHashMap var19 = this.terrains;
            byte var20 = (byte)((var19.containsKey(var1)) ? 1 : 0);
            if (var20 == (366764388 ^ var60)) {
               var60 = 161247535 ^ var60;
               return (((byte)(473960523 ^ var60)) != 0);
            }

            var60 = 847135471 ^ var60;
            byte var22 = (byte)(-664937354 ^ var60);
            int var56 = var22;
            var60 = 1340274517 ^ var60;

            while (true) {
               byte var39 = (byte)(1749079261 ^ var60);
               if (var56 > var39) {
                  var60 = 402403133 ^ var60;
                  return (((byte)(2143091682 ^ var60)) != 0);
               }

               var60 = 1458833478 ^ var60;
               byte var24 = (byte)(-1052040347 ^ var60);
               int var11 = var24;
               var60 = 117861747 ^ var60;

               while (true) {
                  byte var40 = (byte)(968012264 ^ var60);
                  if (var11 > var40) {
                     label51:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var60)) {
                           case 264896773:
                              var60 ^= 988376560;
                           case 534383113:
                              break label51;
                           case 905354979:
                              break;
                           case 1209724170:
                           default:
                              throw new RuntimeException();
                        }
                     }

                     var56 += 56351770 ^ var60;
                     var60 = 1796933829 ^ var60;
                     break;
                  }

                  var60 = 121349907 ^ var60;
                  LongOpenHashSet var27 = this.dirty;
                  int var42 = var8 + var56;
                  int var51 = var9 + var11;
                  long var43 = ChunkPos.asLong(var42, var51);
                  byte var28 = (byte)((var27.contains(var43)) ? 1 : 0);
                  if (var28 != (1049171704 ^ var60)) {
                     var60 = 1639218218 ^ var60;
                     return (((byte)(1597860562 ^ var60)) != 0);
                  }

                  var60 = 525871607 ^ var60;
                  var11 += 567361294 ^ var60;
                  var60 = ojxhvnwbwftnuctp(var60, 409177828);
               }
            }
         }

         var60 = 374074226 ^ var60;
         byte var31 = (byte)(-580248060 ^ var60);
         int var57 = var31;
         var60 = 212243090 ^ var60;

         label82:
         while (true) {
            byte var45 = (byte)(775123816 ^ var60);
            if (var57 > var45) {
               var60 = 21364159 ^ var60;
               var10 += 796298967 ^ var60;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var60)) {
                     case 200645576:
                        var60 ^= 464028767;
                        continue label84;
                     case 1617207474:
                        break;
                     case 1756429832:
                        continue label84;
                     case 1774560483:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            var60 = 1307486392 ^ var60;
            Long2ObjectOpenHashMap var34 = this.decorations;
            int var47 = var8 + var10;
            int var54 = var9 + var57;
            long var48 = ChunkPos.asLong(var47, var54);
            byte var35 = (byte)((var34.containsKey(var48)) ? 1 : 0);
            if (var35 == (1675484113 ^ var60)) {
               var60 = 1351495261 ^ var60;
               return (((byte)(861140364 ^ var60)) != 0);
            }

            var60 = ojxhvnwbwftnuctp(var60, 801112033);
            var57 += 1281500209 ^ var60;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var60)) {
                  case 67005055:
                     var60 ^= 1649497945;
                     continue label82;
                  case 167191701:
                     break;
                  case 1225896460:
                  default:
                     throw new RuntimeException();
                  case 1625383340:
                     continue label82;
               }
            }
         }
      }
   }

   private void markDirty(long var1) {
      int var40 = 464210191 ^ 1942946115 ^ 257596489;
      var40 = 399772077 ^ var40;
      LongOpenHashSet var12 = this.decorationChunks;
      byte var13 = (byte)((var12.contains(var1)) ? 1 : 0);
      if (var13 != (1894440360 ^ var40)) {
         var40 = 371857857 ^ var40;
         LongOpenHashSet var15 = this.dirty;
         boolean var16 = var15.add(var1);
         int var19 = ChunkPos.getX(var1);
         int var8 = var19;
         int var22 = ChunkPos.getZ(var1);
         int var9 = var22;
         byte var23 = (byte)(-1723909226 ^ var40);
         int var10 = var23;
         var40 = 119902900 ^ var40;

         while (true) {
            byte var30 = (byte)(1642419932 ^ var40);
            if (var10 > var30) {
               var40 = 557393853 ^ var40;
               return;
            }

            var40 = 1894754822 ^ var40;
            byte var25 = (byte)(-285932764 ^ var40);
            int var11 = var25;
            var40 = 231469728 ^ var40;

            while (true) {
               byte var31 = (byte)(482414202 ^ var40);
               if (var11 > var31) {
                  var40 = 1632114849 ^ var40;
                  var10 += 2106136283 ^ var40;
                  var40 = ojxhvnwbwftnuctp(var40, 476856327);
                  break;
               }

               var40 = 1361476232 ^ var40;
               int var33 = var8 + var10;
               int var37 = var9 + var11;
               long var34 = ChunkPos.asLong(var33, var37);
               this.unbuild(var34);
               var11 += 1307014386 ^ var40;
               var40 = ojxhvnwbwftnuctp(var40, 1361476232);
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
               case 180845983:
                  var40 = 808889544 ^ var40;
                  return;
               case 402079577:
                  break;
               case 913136591:
                  return;
               case 1454274901:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   private void predict(long var1) {
      int var225 = 453937320 ^ 595224705 ^ 257596489;
      var225 = 1481940894 ^ var225;
      int var31 = ChunkPos.getX(var1);
      int var10 = var31;
      int var34 = ChunkPos.getZ(var1);
      int var11 = var34;
      j var36 = this.world;
      f$b var197 = this.inputs(var31, var34);
      c var37 = f.predict(var36, var31, var34, var197);
      LongOpenHashSet var39 = this.dirty;
      boolean var40 = var39.remove(var1);
      byte var135 = (byte)(-1870324722 ^ var225);
      byte var183 = (byte)(1870324673 ^ var225);
      byte var198 = (byte)(1870324735 ^ var225);
      c var42 = var37.trimmed(var135, var183, (var198 != 0));
      Long2ObjectOpenHashMap var44 = this.decorations;
      Object var45 = var44.put(var1, var42);
      c var46 = (c)var45;
      byte var47 = (byte)(-1870324735 ^ var225);
      int var15 = var47;
      var225 = 1870034072 ^ var225;

      while (true) {
         byte var138 = (byte)(825191 ^ var225);
         if (var15 > var138) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var225)) {
                  case 773603:
                     var225 ^= 1976512722;
                  case 819269739:
                     Long2ObjectOpenHashMap var50 = this.may;
                     Long2ObjectFunction var201 = var2 -> {
                        int var9 = 2095789094 ^ 1236345368 ^ 867875953;
                        var9 = 1363615884 ^ var9;
                        return new i$c(var10, var11);
                     };
                     Object var51 = var50.computeIfAbsent(var1, var201);
                     i$c var52 = (i$c)var51;
                     byte var54 = (byte)((var52.absorb(var37)) ? 1 : 0);
                     if (var54 != (1975756724 ^ var225)) {
                        var225 = 1421865049 ^ var225;
                        byte var55 = (byte)(-561797101 ^ var225);
                        int var16 = var55;
                        var225 = 1571982860 ^ var225;

                        label211:
                        while (true) {
                           byte var142 = (byte)(2093930979 ^ var225);
                           if (var16 > var142) {
                              var225 = ojxhvnwbwftnuctp(var225, 1649088373);
                              break;
                           }

                           var225 = 2104216763 ^ var225;
                           byte var57 = (byte)(-27596124 ^ var225);
                           int var17 = var57;
                           var225 = 461752235 ^ var225;

                           while (true) {
                              byte var143 = (byte)(438358771 ^ var225);
                              if (var17 > var143) {
                                 var225 = ojxhvnwbwftnuctp(var225, 1615504172);
                                 var16 += 2053796316 ^ var225;

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var225)) {
                                       case 221136630:
                                          var225 ^= 111454268;
                                       case 1150332835:
                                          continue label211;
                                       case 1184939283:
                                       default:
                                          throw new IllegalStateException();
                                       case 1628430767:
                                    }
                                 }
                              }

                              label194: {
                                 var225 = 385357803 ^ var225;
                                 if (var16 == (215532826 ^ var225)) {
                                    var225 = 205146733 ^ var225;
                                    if (var17 == (14847863 ^ var225)) {
                                       var225 = 1740564364 ^ var225;
                                       break label194;
                                    }

                                    var225 = 1664072214 ^ var225;
                                 } else {
                                    var225 = 1863708795 ^ var225;
                                 }

                                 int var145 = var10 + var16;
                                 int var186 = var11 + var17;
                                 long var146 = ChunkPos.asLong(var145, var186);
                                 this.markDirty(var146);
                                 var225 = 76635546 ^ var225;
                              }

                              var17 += 1734109434 ^ var225;
                              var225 = ojxhvnwbwftnuctp(var225, 2105326090);
                           }
                        }
                     } else {
                        var225 = ojxhvnwbwftnuctp(var225, 1799776544);
                     }

                     long var63;
                     byte var74;
                     label181: {
                        var63 = d.evidenceSignature(var42);
                        if (var46 != null) {
                           var225 = 1807802388 ^ var225;
                           Long2LongOpenHashMap var67 = this.signatures;
                           long var68 = var67.get(var1);
                           long var262;
                           int var70 = (var262 = var68 - var63) == 0L ? 0 : (var262 < 0L ? -1 : 1);
                           if (var70 == (1967468160 ^ var225)) {
                              var225 = 377020283 ^ var225;
                              LongOpenHashSet var72 = this.collected;
                              byte var73 = (byte)((var72.contains(var1)) ? 1 : 0);
                              if (var73 != (1665004027 ^ var225)) {
                                 var225 = ojxhvnwbwftnuctp(var225, 1858662958);
                                 var74 = (byte)(234161109 ^ var225);
                                 var225 = 960515995 ^ var225;
                                 break label181;
                              }

                              var225 = 1185923524 ^ var225;
                           } else {
                              var225 = ojxhvnwbwftnuctp(var225, 1356275391);
                           }
                        } else {
                           var225 = ojxhvnwbwftnuctp(var225, 991428267);
                        }

                        var74 = (byte)(630337598 ^ var225);
                        var225 = 287800433 ^ var225;
                     }

                     byte var18 = var74;
                     Long2LongOpenHashMap var76 = this.signatures;
                     long var77 = var76.put(var1, var63);
                     ArrayList var79 = new ArrayList();
                     ArrayList var19 = var79;
                     byte var80 = (byte)(-884296784 ^ var225);
                     int var20 = var80;
                     var225 = 2035928570 ^ var225;

                     label174:
                     while (true) {
                        byte var154 = (byte)(1307345334 ^ var225);
                        if (var20 > var154) {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var225)) {
                                 case 117077664:
                                    var225 ^= 1881924821;
                                 case 338725376:
                                    Iterator var83 = var19.iterator();
                                    Iterator var218 = var83;
                                    var225 = 3696302 ^ var225;

                                    while (true) {
                                       byte var85 = (byte)((var218.hasNext()) ? 1 : 0);
                                       if (var85 == (1040122831 ^ var225)) {
                                          var225 = 1077289637 ^ var225;
                                          return;
                                       }

                                       var225 = 1894490994 ^ var225;
                                       Object var87 = var218.next();
                                       long[] var88 = (long[])var87;
                                       long[] var22 = var88;
                                       int var91 = var88.length;
                                       int var23 = var91;
                                       byte var92 = (byte)(1293197501 ^ var225);
                                       int var24 = var92;
                                       var225 = 149052736 ^ var225;

                                       while (var24 < var23) {
                                          var225 = 677491441 ^ var225;
                                          long var95 = var22[var24];
                                          int var99 = ChunkPos.getX(var95);
                                          int var27 = var99;
                                          int var102 = ChunkPos.getZ(var95);
                                          int var28 = var102;
                                          byte var103 = (byte)(-1838632718 ^ var225);
                                          int var29 = var103;
                                          var225 = 1578136596 ^ var225;

                                          while (true) {
                                             byte var157 = (byte)(864500506 ^ var225);
                                             if (var29 > var157) {
                                                var225 = ojxhvnwbwftnuctp(var225, 1722270615);
                                                var24 += 1428224142 ^ var225;
                                                var225 = 282461554 ^ var225;
                                                break;
                                             }

                                             var225 = 674168194 ^ var225;
                                             byte var105 = (byte)(-464111260 ^ var225);
                                             int var30 = var105;
                                             var225 = 1628954595 ^ var225;

                                             label107:
                                             while (true) {
                                                byte var158 = (byte)(2059278715 ^ var225);
                                                if (var30 > var158) {
                                                   var225 = ojxhvnwbwftnuctp(var225, 903656468);
                                                   var29 += 1331866988 ^ var225;
                                                   var225 = ojxhvnwbwftnuctp(var225, 2095421045);
                                                   break;
                                                }

                                                var225 ^= 2103660769;
                                                int var160 = var27 + var29;
                                                int var191 = var28 + var30;
                                                long var161 = ChunkPos.asLong(var160, var191);
                                                this.markDirty(var161);
                                                var30 += 131942809 ^ var225;

                                                while (true) {
                                                   switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var225)) {
                                                      case 123695907:
                                                         var225 ^= 2103660769;
                                                         continue label107;
                                                      case 793246453:
                                                      default:
                                                         throw new IllegalStateException();
                                                      case 1159643892:
                                                         break;
                                                      case 2007399051:
                                                         continue label107;
                                                   }
                                                }
                                             }
                                          }
                                       }

                                       label122:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var225)) {
                                             case 6950507:
                                             default:
                                                throw new IllegalStateException();
                                             case 36490709:
                                                break label122;
                                             case 126798316:
                                                var225 ^= 1518112996;
                                                break label122;
                                             case 2026659240:
                                          }
                                       }

                                       var225 = ojxhvnwbwftnuctp(var225, 578121430);
                                    }
                                 case 588001048:
                                 default:
                                    throw new IllegalStateException();
                                 case 688281310:
                              }
                           }
                        }

                        var225 = 2033800025 ^ var225;
                        byte var108 = (byte)(-886428397 ^ var225);
                        int var219 = var108;
                        var225 = 1869183085 ^ var225;

                        label160:
                        while (true) {
                           byte var163 = (byte)(1539091074 ^ var225);
                           if (var219 > var163) {
                              var225 = ojxhvnwbwftnuctp(var225, 2062856362);
                              var20 += 558373419 ^ var225;

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var225)) {
                                    case 8098809:
                                       var225 ^= 1822727070;
                                       continue label174;
                                    case 92845089:
                                       break;
                                    case 669824416:
                                       continue label174;
                                    case 1509266169:
                                    default:
                                       throw new IllegalStateException();
                                 }
                              }
                           }

                           var225 = 684584623 ^ var225;
                           int var111 = var10 + var20;
                           int var166 = var11 + var219;
                           long var112 = ChunkPos.asLong(var111, var166);
                           Long2ObjectOpenHashMap var115 = this.decorations;
                           Object var116 = var115.get(var112);
                           c var117 = (c)var116;
                           if (var117 != null) {
                              var225 = 499404116 ^ var225;
                              byte var120 = (byte)((this.neighbourhoodGuessed(var112)) ? 1 : 0);
                              label143:
                              if (var120 != (1857358203 ^ var225)) {
                                 var225 = 1426629469 ^ var225;
                                 if (var18 == (1002285606 ^ var225)) {
                                    var225 = 1308810596 ^ var225;
                                    LongOpenHashSet var123 = this.collected;
                                    byte var124 = (byte)((var123.contains(var112)) ? 1 : 0);
                                    if (var124 != (1975482178 ^ var225)) {
                                       var225 = ojxhvnwbwftnuctp(var225, 1216019741);
                                       break label143;
                                    }

                                    var225 = 1028532164 ^ var225;
                                 } else {
                                    var225 = 1934424736 ^ var225;
                                 }

                                 d var174 = this.order;
                                 Long2ObjectOpenHashMap var207 = this.decorations;
                                 d$c var211 = this::terrainOrNull;
                                 d$b var213 = this::shownKind;
                                 Set var175 = var174.collect(var117, var207, var211, var213);
                                 boolean var126 = var19.addAll(var175);
                                 LongOpenHashSet var128 = this.collected;
                                 boolean var129 = var128.add(var112);
                                 var225 = 1966398169 ^ var225;
                              } else {
                                 var225 = 1399882532 ^ var225;
                              }
                           } else {
                              var225 = 1320472176 ^ var225;
                           }

                           var219 += 1036356190 ^ var225;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var225)) {
                                 case 128877021:
                                    var225 ^= 1719214303;
                                    continue label160;
                                 case 1010134917:
                                    break;
                                 case 1029685948:
                                    continue label160;
                                 case 1078512147:
                                 default:
                                    throw new IllegalStateException();
                              }
                           }
                        }
                     }
                  case 415386303:
                     break;
                  case 1232125113:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var225 = 1187825073 ^ var225;
         byte var130 = (byte)(-1187009240 ^ var225);
         int var217 = var130;
         var225 = 140540809 ^ var225;

         label244:
         while (true) {
            byte var178 = (byte)(1319119199 ^ var225);
            if (var217 > var178) {
               label229:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var225)) {
                     case 139861638:
                        var225 ^= 1945770836;
                        break label229;
                     case 148186516:
                     default:
                        throw new IllegalStateException();
                     case 663906541:
                        break;
                     case 1131394224:
                        break label229;
                  }
               }

               var15 += 1029321227 ^ var225;
               var225 = ojxhvnwbwftnuctp(var225, 1029088620);
               break;
            }

            var225 ^= 651073009;
            int var180 = var10 + var15;
            int var196 = var11 + var217;
            long var181 = ChunkPos.asLong(var180, var196);
            this.unbuild(var181);
            var217 += 1752087726 ^ var225;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var225)) {
                  case 173467133:
                     var225 ^= 651073009;
                     continue label244;
                  case 492840918:
                  default:
                     throw new IllegalStateException();
                  case 875682230:
                     break;
                  case 2147258448:
                     continue label244;
               }
            }
         }
      }
   }

   private boolean neighbourhoodGuessed(long var1) {
      int var42 = 850815571 ^ 262187230 ^ 257596489;
      var42 = 1531401725 ^ var42;
      int var13 = ChunkPos.getX(var1);
      int var7 = var13;
      int var16 = ChunkPos.getZ(var1);
      int var8 = var16;
      byte var17 = (byte)(-1762331449 ^ var42);
      int var9 = var17;
      var42 = 559493094 ^ var42;

      label50:
      while (true) {
         byte var5 = (byte)(1213342941 ^ var42);
         if (var9 > var5) {
            var42 = ojxhvnwbwftnuctp(var42, 1853486913);
            return (((byte)(640406431 ^ var42)) != 0);
         }

         var42 = 1379038187 ^ var42;
         byte var19 = (byte)(-442521398 ^ var42);
         int var10 = var19;
         var42 = 1830067766 ^ var42;

         while (true) {
            byte var33 = (byte)(2004142336 ^ var42);
            if (var10 > var33) {
               label47:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                     case 124924423:
                        var42 ^= 1227966995;
                        break label47;
                     case 1150108447:
                     default:
                        throw new IllegalStateException();
                     case 1902612992:
                        break;
                     case 1921313134:
                        break label47;
                  }
               }

               var9 += 1044742928 ^ var42;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                     case 145134517:
                        var42 ^= 1981261774;
                     case 694334431:
                        continue label50;
                     case 750213972:
                        break;
                     case 2139964617:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }

            var42 = 1706696971 ^ var42;
            int var22 = var7 + var9;
            int var36 = var8 + var10;
            long var23 = ChunkPos.asLong(var22, var36);
            LongOpenHashSet var26 = this.decorationChunks;
            byte var27 = (byte)((var26.contains(var23)) ? 1 : 0);
            if (var27 != (315549705 ^ var42)) {
               var42 = 1753704719 ^ var42;
               Long2ObjectOpenHashMap var29 = this.decorations;
               byte var30 = (byte)((var29.containsKey(var23)) ? 1 : 0);
               if (var30 == (2051637510 ^ var42)) {
                  var42 = 1112688120 ^ var42;
                  return (((byte)(941343998 ^ var42)) != 0);
               }

               var42 = ojxhvnwbwftnuctp(var42, 1319162508);
            } else {
               var42 = ojxhvnwbwftnuctp(var42, 640138115);
            }

            var10 += 887706507 ^ var42;
            var42 = ojxhvnwbwftnuctp(var42, 1134402184);
         }
      }
   }

   private l terrainOrNull(int var1, int var2) {
      int var12 = 970031341 ^ 811904542 ^ 257596489;
      var12 = 1796158176 ^ var12;
      Long2ObjectOpenHashMap var6 = this.terrains;
      long var9 = ChunkPos.asLong(var1, var2);
      Object var7 = var6.get(var9);
      return (l)var7;
   }

   private byte shownKind(int var1, int var2, int var3) {
      int var25 = 46046188 ^ 1389571591 ^ 257596489;
      var25 = 889472306 ^ var25;
      Long2ObjectOpenHashMap var9 = this.shown;
      byte var6 = (byte)(1781755028 ^ var25);
      int var15 = var1 >> var6;
      byte var7 = (byte)(1781755028 ^ var25);
      int var20 = var3 >> var7;
      long var16 = ChunkPos.asLong(var15, var20);
      Object var10 = var9.get(var16);
      k var11 = (k)var10;
      if (var11 == null) {
         var25 = 907897462 ^ var25;
         byte var30 = (byte)(1546520297 ^ var25);
         var25 = 293074808 ^ var25;
         return var30;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
               case 230934628:
                  var25 ^= 610115319;
               case 1032605482:
                  byte var14 = var11.kind(var1, var2, var3);
                  var25 = 53937145 ^ var25;
                  return var14;
               case 813433974:
                  break;
               case 1137022204:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }
   }

   private int heightDoubt(long var1, l var3, k var4) {
      int var92 = 784713052 ^ 746075019 ^ 257596489;
      var92 = 425577379 ^ var92;
      Long2IntOpenHashMap var20 = this.doubt;
      int var21 = var20.get(var1);
      byte var60 = (byte)(-347775294 ^ var92);
      if (var21 != var60) {
         var92 = 1235351644 ^ var92;
         return var21;
      } else {
         var92 = ojxhvnwbwftnuctp(var92, 324470579);
         byte var24 = (byte)(133015054 ^ var92);
         int var11 = var24;
         byte var25 = (byte)(133015054 ^ var92);
         int var12 = var25;
         int var28 = ChunkPos.getX(var1);
         int var13 = var28;
         int var31 = ChunkPos.getZ(var1);
         int var14 = var31;
         byte var32 = (byte)(133015054 ^ var92);
         int var15 = var32;
         var92 = 1772891356 ^ var92;

         label97:
         while (true) {
            byte var61 = (byte)(1849789122 ^ var92);
            if (var15 < var61) {
               var92 = 1204251575 ^ var92;
               byte var46 = (byte)(696705381 ^ var92);
               int var16 = var46;
               var92 = 1321566604 ^ var92;

               while (true) {
                  byte var74 = (byte)(1732468985 ^ var92);
                  if (var16 >= var74) {
                     label62:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var92)) {
                           case 113834038:
                              break label62;
                           case 135457920:
                              var92 ^= 598336006;
                              break label62;
                           case 1436205803:
                           default:
                              throw new IllegalStateException();
                           case 2104998546:
                        }
                     }

                     var15 += 1156219630 ^ var92;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var92)) {
                           case 66108954:
                           default:
                              throw new IllegalStateException();
                           case 92674373:
                              var92 ^= 715851837;
                           case 872530403:
                              continue label97;
                           case 2069632377:
                        }
                     }
                  }

                  var92 = 333277511 ^ var92;
                  byte var75 = (byte)(1956514218 ^ var92);
                  int var49 = var13 << var75;
                  int var50 = var49 + var16;
                  byte var77 = (byte)(1956514218 ^ var92);
                  int var52 = var14 << var77;
                  int var53 = var52 + var15;
                  int var55 = var4.terrainTop(var50, var53);
                  int var80 = -190969426 ^ var92;
                  if (var55 != var80) {
                     var92 = 646087266 ^ var92;
                     var12 += 1377602509 ^ var92;
                     int var82 = var3.oceanFloor(var50, var53);
                     int var58 = var55 - var82;
                     int var59 = Math.abs(var58);
                     byte var83 = (byte)(1377602510 ^ var92);
                     if (var59 > var83) {
                        var92 = 925100843 ^ var92;
                        var11 += 1698652390 ^ var92;
                        var92 = 488202172 ^ var92;
                     } else {
                        var92 = ojxhvnwbwftnuctp(var92, 708490391);
                     }
                  } else {
                     var92 = ojxhvnwbwftnuctp(var92, 213399285);
                  }

                  var16 += 2015772506 ^ var92;
                  var92 = 526737330 ^ var92;
               }
            } else {
               byte var45;
               label90: {
                  var92 = 1584389268 ^ var92;
                  byte var62 = (byte)(808343046 ^ var92);
                  if (var12 >= var62) {
                     var92 = 2044177297 ^ var92;
                     short var63 = (short)(1241119959 ^ var92);
                     int var36 = var11 * var63;
                     byte var64 = (byte)(1241120205 ^ var92);
                     int var65 = var64 * var12;
                     if (var36 > var65) {
                        var92 = 601540444 ^ var92;
                        var45 = (byte)(1780693635 ^ var92);
                        var92 = ojxhvnwbwftnuctp(var92, 263199367);
                        break label90;
                     }

                     label87:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var92)) {
                           case 257167913:
                              var92 ^= 934724948;
                              break label87;
                           case 318782756:
                              break;
                           case 691645051:
                           default:
                              throw new IllegalStateException();
                           case 871810316:
                              break label87;
                        }
                     }
                  } else {
                     var92 = ojxhvnwbwftnuctp(var92, 1315008197);
                  }

                  var45 = (byte)(2119121027 ^ var92);
                  var92 = 467409039 ^ var92;
               }

               Long2IntOpenHashMap var38 = this.doubt;
               int var39 = var38.put(var1, var45);
               byte var68 = (byte)(1704140876 ^ var92);
               if (var12 < var68) {
                  var92 = ojxhvnwbwftnuctp(var92, 321451147);
                  return var45;
               }

               var92 = 1837786089 ^ var92;
               int var69 = this.compared;
               byte var84 = (byte)(135873508 ^ var92);
               int var70 = var69 + var84;
               this.compared = var70;
               byte var71 = (byte)(135873517 ^ var92);
               if (var45 == var71) {
                  var92 = 322786047 ^ var92;
                  int var72 = this.mismatched;
                  byte var85 = (byte)(455348507 ^ var92);
                  int var73 = var72 + var85;
                  this.mismatched = var73;
                  var92 = 1839187357 ^ var92;
                  return var45;
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var92)) {
                     case 127379391:
                        var92 = 2124584802 ^ var92;
                        return var45;
                     case 237700702:
                        break;
                     case 1488122379:
                     default:
                        throw new IllegalStateException();
                     case 2042150487:
                        return var45;
                  }
               }
            }
         }
      }
   }

   private e gateHeights(int var1, int var2) {
      int var57 = 401748274 ^ 584137815 ^ 257596489;
      var57 = 1777048630 ^ var57;
      long var16 = ChunkPos.asLong(var1, var2);
      Long2ObjectOpenHashMap var19 = this.gateHeights;
      Object var20 = var19.get(var16);
      e var21 = (e)var20;
      if (var21 != null) {
         var57 = 149726231 ^ var57;
         return var21;
      } else {
         l var27;
         k var31;
         int var48;
         label32:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var57)) {
               case 32156400:
                  var57 ^= 750584025;
               case 721574221:
                  Long2ObjectOpenHashMap var25 = this.terrains;
                  Object var26 = var25.get(var16);
                  var27 = (l)var26;
                  Long2ObjectOpenHashMap var29 = this.shown;
                  Object var30 = var29.get(var16);
                  var31 = (k)var30;
                  if (var31 == null) {
                     var57 = 178865989 ^ var57;
                     var48 = (byte)(1971735174 ^ var57);
                     var57 = 441674399 ^ var57;
                     break label32;
                  }

                  label29:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var57)) {
                        case 50508549:
                        default:
                           throw new IllegalStateException();
                        case 107697542:
                           var57 ^= 1005201230;
                        case 402237693:
                           break label29;
                        case 2012348399:
                     }
                  }

                  var48 = this.heightDoubt(var16, var27, var31);
                  var57 = 722471572 ^ var57;
                  break label32;
               case 1865588080:
                  break;
               case 1905388735:
               default:
                  throw new IllegalStateException();
            }
         }

         j var50 = this.world;
         int var51 = var50.treeAllowance(var1, var2);
         e var33 = e.of(var27, var31, var48, var51);
         Long2ObjectOpenHashMap var35 = this.gateHeights;
         Object var36 = var35.put(var16, var33);
         return var33;
      }
   }

   private f$b inputs(int var1, int var2) {
      int var15 = 1586062940 ^ 429204314 ^ 257596489;
      var15 = 1458252591 ^ var15;
      final long var10 = ChunkPos.asLong(var1, var2);
      return new f$b() {
         private static int Ea3PKPm5tY;
         private transient int MX13Atd22K;

         {
            int var11 = 174765840 ^ 1791662751;
            var11 = kfwetvwcbbgbhhro(var11, 283507900);
            var11 = 1864321647 ^ 975893551 ^ Integer.parseInt("628125555");
            this.MX13Atd22K = 2097611590 ^ Ea3PKPm5tY;
            var11 = kfwetvwcbbgbhhro(var11, 871383650);
         }

         @Override
         public l terrain(int var1, int var2x) {
            int var13 = 104996986 ^ 593391828 ^ 730204415;
            var13 = 1688710231 ^ var13;
            i var6 = i.this;
            Long2ObjectOpenHashMap var7 = var6.terrains;
            long var10x = ChunkPos.asLong(var1, var2x);
            Object var8 = var7.get(var10x);
            return (l)var8;
         }

         @Override
         public e gateHeights(int var1, int var2x) {
            int var10x = 497700408 ^ 618366723 ^ 730204415;
            var10x = 1208503885 ^ var10x;
            i var6 = i.this;
            return var6.gateHeights(var1, var2x);
         }

         @Override
         public boolean othersMayWrite(int var1, int var2x, int var3) {
            int var70 = 1251008341 ^ 2025302054 ^ 730204415;
            var70 = 797964030 ^ var70;
            byte var5 = (byte)(909019510 ^ var70);
            int var15x = var1 >> var5;
            int var8 = var15x;
            byte var48 = (byte)(909019510 ^ var70);
            int var17 = var3 >> var48;
            int var9 = var17;
            byte var18 = (byte)(-909019507 ^ var70);
            int var10x = var18;
            var70 = 1562316403 ^ var70;

            label80:
            while (true) {
               byte var49 = (byte)(1798407936 ^ var70);
               if (var10x > var49) {
                  var70 = 567210031 ^ var70;
                  return (((byte)(1258256174 ^ var70)) != 0);
               }

               var70 = 1726627676 ^ var70;
               byte var21 = (byte)(-232503390 ^ var70);
               int var11 = var21;
               var70 = 1052957524 ^ var70;

               while (true) {
                  byte var50 = (byte)(857301768 ^ var70);
                  if (var11 > var50) {
                     var70 = kfwetvwcbbgbhhro(var70, 1139749023);
                     var10x += 1895191447 ^ var70;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                           case 182268164:
                              var70 ^= 466080919;
                              continue label80;
                           case 844090121:
                           default:
                              throw new RuntimeException(new IOException());
                           case 969724525:
                              break;
                           case 1336356114:
                              continue label80;
                        }
                     }
                  }

                  var70 = 351072244 ^ var70;
                  int var24 = var8 + var10x;
                  int var53 = var9 + var11;
                  long var25 = ChunkPos.asLong(var24, var53);
                  long var62 = var10;
                  long var81;
                  int var29 = (var81 = var25 - var62) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                  if (var29 != (670403837 ^ var70)) {
                     var70 = 17015939 ^ var70;
                     i var31 = i.this;
                     d var32 = var31.order;
                     long var65 = var10;
                     byte var33 = (byte)((var32.after(var25, var65)) ? 1 : 0);
                     if (var33 != (653666430 ^ var70)) {
                        var70 = 882050207 ^ var70;
                     } else {
                        var70 = 513227042 ^ var70;
                        i var35 = i.this;
                        LongOpenHashSet var36 = var35.decorationChunks;
                        byte var37 = (byte)((var36.contains(var25)) ? 1 : 0);
                        if (var37 == (945885532 ^ var70)) {
                           var70 = 1890328996 ^ var70;
                           return (((byte)(1221406969 ^ var70)) != 0);
                        }

                        label63:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                              case 222046659:
                                 var70 ^= 359011117;
                                 break label63;
                              case 457340943:
                                 break;
                              case 550577204:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 2011435808:
                                 break label63;
                           }
                        }

                        i var39 = i.this;
                        Long2ObjectOpenHashMap var40 = var39.may;
                        Object var41 = var40.get(var25);
                        i$c var42 = (i$c)var41;
                        if (var42 == null) {
                           var70 = 1063399056 ^ var70;
                        } else {
                           var70 = 1233908415 ^ var70;
                           byte var45 = (byte)((var42.nonBase(var1, var2x, var3)) ? 1 : 0);
                           if (var45 != (1686958286 ^ var70)) {
                              var70 = 198181225 ^ var70;
                              return (((byte)(1868362150 ^ var70)) != 0);
                           }

                           label55:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                                 case 47281667:
                                    var70 ^= 1995037743;
                                    break label55;
                                 case 254666241:
                                    break;
                                 case 967172612:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1278677167:
                                    break label55;
                              }
                           }
                        }
                     }
                  } else {
                     label74:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                           case 109386381:
                              break label74;
                           case 225175263:
                              var70 ^= 898670620;
                              break label74;
                           case 354995916:
                           default:
                              throw new RuntimeException(new IOException());
                           case 524076175:
                        }
                     }
                  }

                  var11 += 308620512 ^ var70;
                  var70 = kfwetvwcbbgbhhro(var70, 561795048);
               }
            }
         }

         @Override
         public byte shown(int var1, int var2x, int var3) {
            int var12 = 1721586723 ^ 371279993 ^ 730204415;
            var12 = 339550459 ^ var12;
            i var8 = i.this;
            return var8.shownKind(var1, var2x, var3);
         }

         @Override
         public boolean predictedOre(int var1, int var2x, int var3) {
            int var44 = 887484604 ^ 240314077 ^ 730204415;
            var44 = 1715705405 ^ var44;
            byte var5 = (byte)(2003994791 ^ var44);
            int var13 = var1 >> var5;
            int var8 = var13;
            byte var30 = (byte)(2003994791 ^ var44);
            int var15x = var3 >> var30;
            int var9 = var15x;
            byte var16 = (byte)(-2003994788 ^ var44);
            int var10x = var16;
            var44 = 319008024 ^ var44;

            label83:
            while (true) {
               byte var31 = (byte)(1685136826 ^ var44);
               if (var10x <= var31) {
                  var44 = 1589404597 ^ var44;
                  byte var18 = (byte)(-986531343 ^ var44);
                  int var11 = var18;
                  var44 = 1919362016 ^ var44;

                  while (true) {
                     byte var32 = (byte)(1219126767 ^ var44);
                     if (var11 > var32) {
                        label43:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var44)) {
                              case 214592983:
                                 var44 ^= 683615409;
                                 break label43;
                              case 1050530652:
                                 break;
                              case 1513697071:
                              default:
                                 throw new IllegalStateException();
                              case 1553645440:
                                 break label43;
                           }
                        }

                        var10x += 1612005726 ^ var44;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var44)) {
                              case 170479293:
                                 var44 ^= 73688292;
                                 continue label83;
                              case 441039122:
                                 break;
                              case 1588356254:
                              default:
                                 throw new IllegalStateException();
                              case 2026561335:
                                 continue label83;
                           }
                        }
                     }

                     var44 = 1993889504 ^ var44;
                     i var21 = i.this;
                     Long2ObjectOpenHashMap var22 = var21.may;
                     int var34 = var8 + var10x;
                     int var39 = var9 + var11;
                     long var35 = ChunkPos.asLong(var34, var39);
                     Object var23 = var22.get(var35);
                     i$c var24 = (i$c)var23;
                     if (var24 != null) {
                        var44 ^= 1051861574;
                        byte var27 = (byte)((var24.ore(var1, var2x, var3)) ? 1 : 0);
                        if (var27 != (12587336 ^ var44)) {
                           var44 = 1124789617 ^ var44;
                           return (((byte)(1137376312 ^ var44)) != 0);
                        }

                        label53:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var44)) {
                              case 11800819:
                                 var44 ^= 2030462804;
                                 break label53;
                              case 648100335:
                              default:
                                 throw new IllegalStateException();
                              case 941895074:
                                 break;
                              case 2146417357:
                                 break label53;
                           }
                        }
                     } else {
                        label64:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var44)) {
                              case 150830233:
                                 var44 ^= 1202996498;
                              case 340460343:
                                 break label64;
                              case 798032585:
                              default:
                                 throw new IllegalStateException();
                              case 1788551490:
                           }
                        }
                     }

                     var11 += 2043049501 ^ var44;
                     var44 = 829166578 ^ var44;
                  }
               } else {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var44)) {
                        case 14558792:
                        default:
                           throw new IllegalStateException();
                        case 43736427:
                           var44 ^= 336817340;
                           return (((byte)(1885489415 ^ var44)) != 0);
                        case 1509682438:
                           break;
                        case 1840294430:
                           return (((byte)(1885489415 ^ var44)) != 0);
                     }
                  }
               }
            }
         }

         static {
            int var3 = new Random(7502027574640077736L).nextInt();
            Ea3PKPm5tY = 1928037723 ^ var3;
         }

         public static String vhcuciqjhy(byte[] var0, byte[] var1x, int var2x) {
            String var11 = Integer.toString(var2x);
            byte[] var12 = var11.getBytes();
            byte[] var9 = var12;
            byte var13 = 0;
            int var10x = var13;

            while (true) {
               int var18 = var0.length;
               if (var10x >= var18) {
                  Charset var6 = StandardCharsets.UTF_16;
                  return new String(var0, var6);
               }

               byte var21 = var0[var10x];
               int var34 = var9.length;
               int var31 = var10x % var34;
               byte var28 = var9[var31];
               int var22 = var21 ^ var28;
               byte var23 = (byte)var22;
               var0[var10x] = var23;
               byte var24 = var0[var10x];
               int var36 = var1x.length;
               int var33 = var10x % var36;
               byte var30 = var1x[var33];
               int var25 = var24 ^ var30;
               byte var26 = (byte)var25;
               var0[var10x] = var26;
               var10x++;
            }
         }

         private static byte[] pszznaftbqmtpzd() {
            return new byte[]{
               80,
               106,
               124,
               115,
               116,
               95,
               110,
               124,
               50,
               125,
               127,
               127,
               71,
               47,
               47,
               29,
               100,
               108,
               17,
               118,
               11,
               2,
               77,
               82,
               51,
               81,
               5,
               87,
               8,
               32,
               88,
               99,
               126,
               82,
               19,
               76,
               118,
               85,
               78,
               44,
               3,
               123,
               17,
               125,
               96,
               45,
               78,
               117,
               11,
               95,
               6,
               34,
               77,
               92,
               100,
               47,
               102,
               36,
               79,
               124,
               24,
               28,
               83,
               55,
               62,
               39,
               45,
               69,
               116,
               53,
               16,
               88,
               91,
               10,
               62,
               54,
               101,
               10,
               18,
               74,
               27,
               20,
               71,
               54,
               119,
               40,
               124,
               94,
               84,
               60,
               123,
               93,
               93,
               109,
               84,
               122,
               43,
               42,
               44,
               59,
               13,
               125
            };
         }

         private static int kfwetvwcbbgbhhro(int var0, int var1x) {
            return var1x ^ var0;
         }
      };
   }

   private long nearest(LongOpenHashSet var1) {
      int var43 = 764546983 ^ 1229990669 ^ 257596489;
      var43 = 1471431769 ^ var43;
      long var2 = Long.MIN_VALUE;
      long var6 = var2;
      int var13 = 1137902405 ^ var43;
      int var8 = var13;
      LongIterator var15 = var1.iterator();
      LongIterator var9 = var15;
      var43 = 1127105618 ^ var43;

      label42:
      while (true) {
         byte var17 = (byte)((var9.hasNext()) ? 1 : 0);
         if (var17 != (2130884840 ^ var43)) {
            var43 = 59629222 ^ var43;
            long var21 = var9.nextLong();
            int var25 = ChunkPos.getX(var21);
            int var33 = this.focusX;
            int var26 = var25 - var33;
            int var27 = Math.abs(var26);
            int var36 = ChunkPos.getZ(var21);
            int var40 = this.focusZ;
            int var37 = var36 - var40;
            int var38 = Math.abs(var37);
            int var28 = Math.max(var27, var38);
            if (var28 < var8) {
               var43 = 1085984348 ^ var43;
               var8 = var28;
               var6 = var21;
               var43 = 124142255 ^ var43;
            } else {
               var43 = 1205636339 ^ var43;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var43)) {
                  case 10186578:
                     break;
                  case 49458589:
                     var43 ^= 1146180181;
                     continue label42;
                  case 314571938:
                  default:
                     throw new RuntimeException();
                  case 1484567742:
                     continue label42;
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var43)) {
                  case 102054211:
                     var43 = 389001380 ^ var43;
                     return var6;
                  case 447765657:
                  default:
                     throw new RuntimeException();
                  case 833362160:
                     return var6;
                  case 838236738:
               }
            }
         }
      }
   }

   static {
      int var3 = new Random(-4640136103418647731L).nextInt();
      D7bOaE3zl8 = -1622106661 ^ var3;
   }

   public static String icklvaenrd(byte[] var0, int var1) {
      String var10 = Integer.toString(var1);
      byte[] var11 = var10.getBytes();
      byte[] var8 = var11;
      byte var12 = 0;
      int var9 = var12;

      while (true) {
         int var17 = var0.length;
         if (var9 >= var17) {
            Charset var5 = StandardCharsets.UTF_16;
            return new String(var0, var5);
         }

         byte var20 = var0[var9];
         int var33 = var8.length;
         int var30 = var9 % var33;
         byte var27 = var8[var30];
         int var21 = var20 ^ var27;
         byte var22 = (byte)var21;
         var0[var9] = var22;
         byte var23 = var0[var9];
         byte[] var28 = dkyrzvfvpb;
         byte[] var34 = dkyrzvfvpb;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] zlgqwutgqrkzodo() {
      return new byte[]{
         127,
         5,
         116,
         56,
         63,
         7,
         5,
         49,
         46,
         91,
         115,
         58,
         45,
         62,
         12,
         67,
         5,
         11,
         49,
         57,
         98,
         71,
         64,
         56,
         16,
         28,
         13,
         109,
         112,
         38,
         125,
         9,
         105,
         112,
         71,
         103,
         105,
         84,
         58,
         123,
         4,
         88,
         35,
         105,
         41,
         33,
         122,
         113,
         67,
         84,
         78,
         29,
         113,
         5,
         58,
         122,
         96,
         91,
         116,
         20,
         101,
         65,
         4,
         105,
         14,
         31,
         107,
         101,
         124,
         93,
         49,
         10,
         32,
         112,
         112,
         101,
         112
      };
   }

   private static int ojxhvnwbwftnuctp(int var0, int var1) {
      return var1 ^ var0;
   }
}
