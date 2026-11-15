package com.wimpyclient.s;

import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class f$c implements g$b {
   final j world;
   final int chunkX;
   final int chunkZ;
   final f$b inputs;
   final l[] terrains;
   final e[] heights;
   final c$a builder;
   final f$a answers;
   final int generation;
   final int minX;
   final int minZ;
   h spec;
   private static int uOb0Qj949b;
   private transient int oIyRmikrAc;
   private static byte[] fxfrakvnqq = ydwvidyetqaegkj();

   f$c(j var1, int var2, int var3, f$b var4) {
super();
      int var94 = 1535606924 ^ 1306218796;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var94)) {
            case 190038138:
               var94 = 1353500237 ^ var94;
            case 1786291841:
               var94 = 4094955 ^ 632395682 ^ Integer.parseInt("1669331876");
               this.oIyRmikrAc = 448200025 ^ uOb0Qj949b;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var94)) {
                     case 158427307:
                        var94 ^= 1764145681;
                     case 1745197218:
                        byte var6 = 9;
                        l[] var31 = new l[var6];
                        this.terrains = var31;
                        byte var32 = 9;
                        e[] var33 = new e[var32];
                        this.heights = var33;
                        ThreadLocal var34 = f.ANSWERS;
                        Object var35 = var34.get();
                        f$a var36 = (f$a)var35;
                        this.answers = var36;
                        this.world = var1;
                        this.chunkX = var2;
                        this.chunkZ = var3;
                        this.inputs = var4;
                        c$a var41 = new c$a(var2, var3);
                        this.builder = var41;
                        byte var20 = -1;
                        int var10 = var20;
                        var94 = 1949471959 ^ var94;

                        label53:
                        while (true) {
                           byte var42 = 1;
                           if (var10 > var42) {
                              var94 = 977525603 ^ var94;
                              f$a var55 = this.answers;
                              int var74 = var55.generation;
                              byte var84 = 1;
                              int var75 = var74 + var84;
                              var55.generation = var75;
                              this.generation = var75;
                              byte var76 = 1;
                              int var57 = var2 - var76;
                              byte var77 = 4;
                              int var58 = var57 << var77;
                              this.minX = var58;
                              byte var78 = 1;
                              int var60 = var3 - var78;
                              byte var79 = 4;
                              int var61 = var60 << var79;
                              this.minZ = var61;
                              return;
                           }

                           var94 = 479261064 ^ var94;
                           byte var22 = -1;
                           int var11 = var22;
                           var94 = 98960291 ^ var94;

                           label39:
                           while (true) {
                              byte var43 = 1;
                              if (var11 > var43) {
                                 var94 = xmpnqcvxnsricoqt(var94, 2113102353);
                                 var10++;

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var94)) {
                                       case 181209329:
                                          var94 ^= 1686474810;
                                          continue label53;
                                       case 395293438:
                                          break;
                                       case 561234837:
                                       default:
                                          throw new RuntimeException();
                                       case 1694105161:
                                          continue label53;
                                    }
                                 }
                              }

                              var94 ^= 259781555;
                              l[] var25 = this.terrains;
                              byte var62 = 1;
                              int var45 = var10 + var62;
                              byte var63 = 3;
                              int var46 = var45 * var63;
                              int var47 = var46 + var11;
                              byte var65 = 1;
                              int var48 = var47 + var65;
                              int var81 = var2 + var10;
                              int var87 = var3 + var11;
                              l var67 = var4.terrain(var81, var87);
                              var25[var48] = var67;
                              e[] var27 = this.heights;
                              byte var68 = 1;
                              int var50 = var10 + var68;
                              byte var69 = 3;
                              int var51 = var50 * var69;
                              int var52 = var51 + var11;
                              byte var71 = 1;
                              int var53 = var52 + var71;
                              int var83 = var2 + var10;
                              int var90 = var3 + var11;
                              e var73 = var4.gateHeights(var83, var90);
                              var27[var53] = var73;
                              var11++;

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var94)) {
                                    case 116625459:
                                       var94 ^= 259781555;
                                       continue label39;
                                    case 222453006:
                                       break;
                                    case 510937139:
                                       continue label39;
                                    case 754304164:
                                    default:
                                       throw new RuntimeException();
                                 }
                              }
                           }
                        }
                     case 316543060:
                        break;
                     case 2045881623:
                     default:
                        throw new RuntimeException();
                  }
               }
            case 398376924:
            default:
               throw new RuntimeException();
            case 496340229:
         }
      }
   }

   private int around(int var1, int var2) {
      int var40 = 1859584473 ^ 174762787 ^ 418343074;
      var40 = 2086738107 ^ var40;
      byte var4 = (byte)(3398375 ^ var40);
      int var9 = var1 >> var4;
      int var25 = this.chunkX;
      int var10 = var9 - var25;
      byte var26 = (byte)(3398375 ^ var40);
      int var12 = var2 >> var26;
      int var28 = this.chunkZ;
      int var13 = var12 - var28;
      byte var29 = (byte)(-3398372 ^ var40);
      if (var10 < var29) {
         var40 = 8260232 ^ var40;
      } else {
         var40 = 882912033 ^ var40;
         byte var30 = (byte)(882110915 ^ var40);
         if (var10 <= var30) {
            var40 = 1801008205 ^ var40;
            byte var31 = (byte)(-1607124368 ^ var40);
            if (var13 >= var31) {
               var40 = 743709493 ^ var40;
               byte var32 = (byte)(1939791547 ^ var40);
               if (var13 <= var32) {
                  var40 = 1782313622 ^ var40;
                  byte var33 = (byte)(430255149 ^ var40);
                  int var19 = var10 + var33;
                  byte var34 = (byte)(430255151 ^ var40);
                  int var20 = var19 * var34;
                  int var21 = var20 + var13;
                  byte var36 = (byte)(430255149 ^ var40);
                  return var21 + var36;
               }

               var40 = 1943211729 ^ var40;
            } else {
               var40 = 1602688484 ^ var40;
            }
         } else {
            label29:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                  case 98472180:
                     var40 = 886972841 ^ var40;
                     break label29;
                  case 1166673288:
                     break;
                  case 1770593063:
                  default:
                     throw new IllegalStateException();
                  case 1778069145:
                     break label29;
               }
            }
         }
      }

      String var37 = "read outside the 3x3 chunks at " + var1 + ", " + var2;
      IllegalStateException var23 = new IllegalStateException(var37);
      throw new RuntimeException(var23);
   }

   private l terrain(int var1, int var2) {
      int var12 = 2012373708 ^ 776818481 ^ 418343074;
      var12 = 2067358047 ^ var12;
      l[] var7 = this.terrains;
      int var9 = this.around(var1, var2);
      return var7[var9];
   }

   private byte answers(int var1, int var2, int var3) {
      int var110 = 443858510 ^ 1637130171 ^ 418343074;
      var110 = 590602106 ^ var110;
      int var71 = this.minX;
      int var19 = var1 - var71;
      int var73 = this.minZ;
      int var21 = var3 - var73;
      byte var74 = (byte)(-1077712403 ^ var110);
      int var23 = var2 - var74;
      byte var75 = (byte)(1077712413 ^ var110);
      int var24 = var23 * var75;
      int var25 = var24 + var21;
      byte var77 = (byte)(1077712413 ^ var110);
      int var26 = var25 * var77;
      int var27 = var26 + var19;
      f$a var29 = this.answers;
      int[] var30 = var29.stamp;
      int var31 = var30[var27];
      int var81 = this.generation;
      if (var31 == var81) {
         var110 = 338397285 ^ var110;
         f$a var67 = this.answers;
         byte[] var68 = var67.answer;
         return var68[var27];
      } else {
         var110 = 1204317695 ^ var110;
         l var33 = this.terrain(var1, var3);
         byte var34 = var33.kind(var1, var2, var3);
         byte var36 = (byte)((m.isBase(var34)) ? 1 : 0);
         byte var70;
         if (var36 != (133495762 ^ var110)) {
            var110 = 530898317 ^ var110;
            var70 = (byte)(407905886 ^ var110);
            var110 = 1613943242 ^ var110;
         } else {
            var110 = xmpnqcvxnsricoqt(var110, 589747834);
            var70 = (byte)(617754024 ^ var110);
            var110 = 1555094077 ^ var110;
         }

         f$b var39 = this.inputs;
         byte var40 = (byte)((f.disagreesOnBase(var39, var34, var1, var2, var3)) ? 1 : 0);
         byte var42;
         if (var40 != (2019751829 ^ var110)) {
            var110 = 1747571671 ^ var110;
            var42 = (byte)(273359936 ^ var110);
            var110 = xmpnqcvxnsricoqt(var110, 2004146666);
         } else {
            var110 = xmpnqcvxnsricoqt(var110, 2123969439);
            var42 = var70;
            var110 = 1640249762 ^ var110;
         }

         byte var16 = var42;
         byte var85 = (byte)(1732246953 ^ var110);
         if (var42 == var85) {
            var110 = 138521055 ^ var110;
            f$b var46 = this.inputs;
            byte var47 = (byte)((var46.othersMayWrite(var1, var2, var3)) ? 1 : 0);
            if (var47 != (1870550135 ^ var110)) {
               var110 = 1821817271 ^ var110;
               byte var48 = (byte)(65596866 ^ var110);
               var16 = var48;
               var110 = 2119803552 ^ var110;
            } else {
               label52:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 47175170:
                        break;
                     case 134524120:
                        var110 ^= 315562775;
                     case 1220208037:
                        break label52;
                     case 1536814966:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }
         } else {
            var110 = 445559496 ^ var110;
         }

         f$b var50 = this.inputs;
         byte var51 = (byte)((f.disagreesOnAir(var50, var34, var1, var2, var3)) ? 1 : 0);         byte var65;
         if (var51 != (2108772192 ^ var110)) {
            var110 = 1220405849 ^ var110;
            var65 = (byte)(890021179 ^ var110);
            var110 = 1145640694 ^ var110;
         } else {
            label43:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                  case 59241595:
                     var110 ^= 406587300;
                     break label43;
                  case 587460507:
                  default:
                     throw new IllegalStateException();
                  case 1536485869:
                     break;
                  case 1649847183:
                     break label43;
               }
            }

            if (var34 == (1703758020 ^ var110)) {
               var110 = 1001775644 ^ var110;
               var65 = (byte)(1580772057 ^ var110);
               var110 = 796727575 ^ var110;
            } else {
               var110 = xmpnqcvxnsricoqt(var110, 250929066);
               var65 = (byte)(1803130734 ^ var110);
               var110 = 440149153 ^ var110;
            }
         }

         byte var99 = (byte)(1900393421 ^ var110);
         int var89 = var42 << var99;
         int var55 = var16 | var89;
         byte var100 = (byte)(1900393419 ^ var110);
         int var91 = var65 << var100;
         int var56 = var55 | var91;
         byte var57 = (byte)var56;
         f$a var59 = this.answers;
         int[] var60 = var59.stamp;
         int var102 = this.generation;
         var60[var27] = var102;
         f$a var62 = this.answers;
         byte[] var63 = var62.answer;
         var63[var27] = var57;
         return var57;
      }
   }

   @Override
   public long seed() {
      int var6 = 1020190386 ^ 1007945558 ^ 418343074;
      var6 = 79897541 ^ var6;
      j var2 = this.world;
      return var2.seed;
   }

   @Override
   public int gateLow(int var1, int var2) {
      int var15 = 139940860 ^ 1462623927 ^ 418343074;
      var15 = 477006544 ^ var15;
      e[] var7 = this.heights;
      int var10 = this.around(var1, var2);
      e var8 = var7[var10];
      return var8.low(var1, var2);
   }

   @Override
   public int gateHigh(int var1, int var2) {
      int var15 = 857748944 ^ 1290144085 ^ 418343074;
      var15 = 1110988060 ^ var15;
      e[] var7 = this.heights;
      int var10 = this.around(var1, var2);
      e var8 = var7[var10];
      return var8.high(var1, var2);
   }

   @Override
   public byte base(int var1, int var2, int var3) {
      int var80 = 162608817 ^ 1474711289 ^ 418343074;
      var80 = 803673991 ^ var80;
      h var11 = this.spec;
      byte var12 = (byte)((var11.drawsOnTerrain()) ? 1 : 0);
      byte var77;
      if (var12 != (1767835501 ^ var80)) {
         var80 = 1404506158 ^ var80;
         byte var44 = this.answers(var1, var2, var3);
         byte var65 = (byte)(988288832 ^ var80);
         int var45 = var44 & var65;
         byte var46 = (byte)var45;
         var77 = var46;
         byte var66 = (byte)(988288834 ^ var80);
         if (var46 == var66) {
            var80 = 1580158631 ^ var80;
            byte var49 = (byte)((this.ownFogCovers(var1, var2, var3)) ? 1 : 0);
            if (var49 != (1690786276 ^ var80)) {
               var80 = 1095225532 ^ var80;
               byte var50 = (byte)(629180762 ^ var80);
               var77 = var50;

               label93:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                     case 145305498:
                        var80 ^= 1302993285;
                     case 280968357:
                        break label93;
                     case 1289506334:
                     default:
                        throw new RuntimeException();
                     case 1809575144:
                  }
               }
            } else {
               var80 = 216910137 ^ var80;
            }
         } else {
            var80 = 1388480414 ^ var80;
         }
      } else {
         var80 = 596937780 ^ var80;
         h var14 = this.spec;
         float var15 = var14.discard();
         float var5 = 0.0F;
         float var98;
         int var16 = (var98 = var15 - var5) == 0.0F ? 0 : (var98 < 0.0F ? -1 : 1);
         if (var16 > (1254853465 ^ var80)) {
            var80 = 1108434836 ^ var80;
            byte var39 = this.answers(var1, var2, var3);
            byte var62 = (byte)(148559055 ^ var80);
            int var40 = var39 >> var62;
            byte var63 = (byte)(148559054 ^ var80);
            int var41 = var40 & var63;
            byte var42 = (byte)var41;
            var77 = var42;

            label102:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                  case 19395735:
                     var80 ^= 1626358800;
                  case 272336652:
                     break label102;
                  case 519172092:
                     break;
                  case 956340788:
                  default:
                     throw new RuntimeException();
               }
            }
         } else {
            var80 = xmpnqcvxnsricoqt(var80, 1019344972);
            l var18 = this.terrain(var1, var3);
            byte var19 = var18.kind(var1, var2, var3);
            byte var20 = (byte)((m.isBase(var19)) ? 1 : 0);
            byte var51;
            if (var20 == (1980396309 ^ var80)) {
               var80 = 347338311 ^ var80;
               var51 = (byte)(1656325458 ^ var80);
               var80 = 412713602 ^ var80;
            } else {
               var80 = 1558152430 ^ var80;
               var51 = (byte)(718665722 ^ var80);

               label84:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                     case 50248355:
                        var80 ^= 1358295083;
                        break label84;
                     case 295601739:
                        break;
                     case 1234149791:
                     default:
                        throw new RuntimeException();
                     case 1419463055:
                        break label84;
                  }
               }
            }

            var77 = var51;
            var80 = 302683917 ^ var80;
         }
      }

      c$a var23 = this.builder;
      long var56 = BlockPos.asLong(var1, var2, var3);
      ShortArrayList var24 = var23.at(var56);
      ShortArrayList var8 = var24;
      if (var24 == null) {
         var80 = 1326676590 ^ var80;
         return var77;
      } else {
         var80 = 1530862216 ^ var80;
         byte var26 = (byte)(857049685 ^ var80);
         int var9 = var26;
         var80 = 62875246 ^ var80;

         while (true) {
            int var59 = var8.size();
            if (var9 >= var59) {
               var80 = 395511432 ^ var80;
               return var77;
            }

            var80 = 1401496937 ^ var80;
            short var30 = var8.getShort(var9);
            byte var32 = c.kind(var30);
            byte var33 = (byte)((m.isBase(var32)) ? 1 : 0);
            if (var33 == (1663289682 ^ var80)) {
               byte var52;
               label58: {
                  var80 = 2135314650 ^ var80;
                  byte var35 = (byte)((c.possible(var30)) ? 1 : 0);
                  if (var35 != (476420488 ^ var80)) {
                     var80 = 1871305541 ^ var80;
                     if (var77 != (1944863437 ^ var80)) {
                        var80 = 1705391311 ^ var80;
                        var52 = (byte)(373978624 ^ var80);
                        var80 = xmpnqcvxnsricoqt(var80, 2023210799);
                        break label58;
                     }

                     var80 = 940275449 ^ var80;
                  } else {
                     label56:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                           case 117753106:
                              var80 ^= 1468181948;
                              break label56;
                           case 169167162:
                              break;
                           case 1826307685:
                              break label56;
                           case 1830279656:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  }

                  var52 = (byte)(1273443380 ^ var80);
                  var80 = 624622873 ^ var80;
               }

               var77 = var52;
               var80 = 1163886176 ^ var80;
            } else {
               label68:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                     case 1389869:
                        var80 ^= 1218543135;
                        break label68;
                     case 90828888:
                        break;
                     case 963599198:
                     default:
                        throw new RuntimeException();
                     case 1055906891:
                        break label68;
                  }
               }
            }

            var9 += 729986892 ^ var80;
            var80 = 455629686 ^ var80;
         }
      }
   }

   private boolean ownFogCovers(int var1, int var2, int var3) {
      int var27 = 549981545 ^ 1499152759 ^ 418343074;
      var27 = 1630331583 ^ var27;
      c$a var10 = this.builder;
      List var11 = var10.fogList();
      Iterator var12 = var11.iterator();
      Iterator var8 = var12;
      var27 = 1814778927 ^ var27;

      while (true) {
         byte var14 = (byte)((var8.hasNext()) ? 1 : 0);
         if (var14 == (1820037676 ^ var27)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var27)) {
                  case 36636494:
                     var27 ^= 103926943;
                  case 1857292565:
                     return (((byte)(1783258803 ^ var27)) != 0);
                  case 255578988:
                  default:
                     throw new IllegalStateException();
                  case 952219020:
               }
            }
         }

         var27 = 1264198117 ^ var27;
         Object var16 = var8.next();
         c$b var17 = (c$b)var16;
         byte var19 = var17.kind();
         byte var20 = (byte)((m.isBase(var19)) ? 1 : 0);
         if (var20 == (656520137 ^ var27)) {
            var27 = 1769857866 ^ var27;
            byte var22 = (byte)((var17.contains(var1, var2, var3)) ? 1 : 0);
            if (var22 != (1314672771 ^ var27)) {
               var27 = 441204949 ^ var27;
               return (((byte)(1410338903 ^ var27)) != 0);
            }

            var27 = 597089864 ^ var27;
         } else {
            var27 = 1256930562 ^ var27;
         }

         var27 = xmpnqcvxnsricoqt(var27, 28384487);
      }
   }

   @Override
   public byte air(int var1, int var2, int var3) {
      int var36 = 1825512343 ^ 110201936 ^ 418343074;
      var36 = 2136775289 ^ var36;
      byte var5 = (byte)(-233661732 ^ var36);
      if (var2 >= var5) {
         var36 = 409701874 ^ var36;
         short var24 = (short)(361163217 ^ var36);
         if (var2 > var24) {
            var36 = xmpnqcvxnsricoqt(var36, 1299875752);
            return (byte)(1492938567 ^ var36);
         } else {
            var36 = 1912890114 ^ var36;
            h var10 = this.spec;
            float var11 = var10.discard();
            float var25 = 0.0F;
            float var45;
            int var12 = (var45 = var11 - var25) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
            if (var12 > (1736608748 ^ var36)) {
               var36 = 1328372128 ^ var36;
               byte var14 = this.answers(var1, var2, var3);
               byte var27 = (byte)(682611272 ^ var36);
               int var15 = var14 >> var27;
               byte var28 = (byte)(682611279 ^ var36);
               int var16 = var15 & var28;
               return (byte)var16;
            } else {
               label33:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var36)) {
                     case 143427739:
                        var36 ^= 1521217926;
                        break label33;
                     case 1112180443:
                     default:
                        throw new IllegalStateException();
                     case 1304358938:
                        break label33;
                     case 1591512705:
                  }
               }

               l var19 = this.terrain(var1, var3);
               byte var20 = var19.kind(var1, var2, var3);
               byte var22;
               if (var20 == (1026128490 ^ var36)) {
                  var36 = 1109347035 ^ var36;
                  var22 = (byte)(2134257840 ^ var36);
                  var36 = 1576388685 ^ var36;
               } else {
                  var36 = 515513044 ^ var36;
                  var22 = (byte)(596861118 ^ var36);
                  var36 = 22059074 ^ var36;
               }

               return var22;
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var36)) {
               case 184286731:
                  var36 ^= 1427180122;
                  return (byte)(1492938567 ^ var36);
               case 852852179:
                  break;
               case 1564008700:
                  return (byte)(1492938567 ^ var36);
               case 1726192713:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   @Override
   public boolean inBiome(h var1, int var2, int var3, int var4) {
      int var18 = 1917754872 ^ 1008775061 ^ 418343074;
      var18 = 467763158 ^ var18;
      Set var10 = var1.biomes();
      if (var10 != null) {
         var18 = 657914938 ^ var18;
         j var14 = this.world;
         Holder var15 = var14.biomeAt(var2, var3, var4);
         byte var12 = (byte)((var1.inBiome(var15)) ? 1 : 0);
         if (var12 == (1784076579 ^ var18)) {
            label22:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
                  case 160797910:
                  default:
                     throw new RuntimeException();
                  case 235417317:
                     var18 ^= 860402869;
                     break label22;
                  case 1727983448:
                     break;
                  case 2110259984:
                     break label22;
               }
            }

            byte var13 = (byte)(1495166358 ^ var18);
            var18 = 387784215 ^ var18;
            return (var13 != 0);
         }

         var18 = 219574405 ^ var18;
      } else {
         label32:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
               case 99224192:
                  var18 ^= 706776255;
                  break label32;
               case 326711386:
               default:
                  throw new RuntimeException();
               case 479888660:
                  break label32;
               case 1007578426:
            }
         }
      }

      byte var23 = (byte)(1732290983 ^ var18);
      var18 = 692312615 ^ var18;
      return (var23 != 0);
   }

   static {
      int var3 = new Random(7201823892398077432L).nextInt();
      uOb0Qj949b = 1174484237 ^ var3;
   }

   public static String bontjjveeo(byte[] var0, int var1) {
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
         byte[] var27 = fxfrakvnqq;
         byte[] var34 = fxfrakvnqq;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] ydwvidyetqaegkj() {
      return new byte[]{
         28,
         75,
         14,
         109,
         99,
         2,
         124,
         6,
         91,
         116,
         89,
         65,
         42,
         127,
         54,
         6,
         9,
         101,
         39,
         99,
         37,
         85,
         43,
         36,
         28,
         28,
         60,
         123,
         7,
         16,
         88,
         113,
         92,
         76,
         85,
         38,
         51,
         81,
         96,
         124,
         26,
         88,
         107,
         98,
         75,
         80,
         6,
         101,
         9,
         43,
         108,
         24,
         48,
         64,
         28,
         94,
         114,
         33,
         42,
         5,
         117,
         80,
         25,
         29,
         104,
         79,
         100,
         38,
         112,
         39,
         3,
         127
      };
   }

   private static int xmpnqcvxnsricoqt(int var0, int var1) {
      return var0 ^ var1;
   }
}
