package com.wimpyclient.s;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry;
import it.unimi.dsi.fastutil.longs.Long2ByteMap.FastEntrySet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class g {
   static final byte NO = 0;
   static final byte YES = 1;
   static final byte MAYBE = 2;
   static final byte CERTAIN = 1;
   static final byte POSSIBLE = 2;
   static final int MAX_STATES;
   static final int MAX_WORK;
   static final int MIN_Y = -64;
   static final int MAX_Y = 319;
   private static final int[][] SIDES;
   private static int jAg1Ti9tL8;
   private transient int f0REvpOgR4U;
   private static String hdnptixsju = ByteBuffer.wrap(ohijltrdribspuu()).asCharBuffer().toString();

   private g() {
super();
      int var4 = 514169865 ^ 1483455033;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 154087219:
               var4 = 1167020035 ^ var4;
            case 1185890898:
               var4 = 356249558 ^ 107719205 ^ Integer.parseInt("269562816");
               this.f0REvpOgR4U = 419060430 ^ jAg1Ti9tL8;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
                     case 51207566:
                        var4 = 703324350 ^ var4;
                        return;
                     case 951043174:
                        return;
                     case 1081646283:
                        break;
                     case 1424885781:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            case 1037496970:
               break;
            case 1517202287:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   static g$a run(h var0, int var1, int var2, g$b var3) {
      int var173 = 989000485 ^ 1522360050 ^ 994219164;
      var173 = 1123781354 ^ var173;
      o var4 = new o();
      long var115 = var3.seed();
      byte var7 = (byte)(435598245 ^ var173);
      int var151 = var1 << var7;
      byte var8 = (byte)(435598245 ^ var173);
      int var161 = var2 << var8;
      long var32 = var4.setDecorationSeed(var115, var151, var161);
      int var153 = var0.index();
      int var163 = var0.step();
      var4.setFeatureSeed(var32, var153, var163);
      g$a var35 = new g$a(var0, var1, var2);
      int var37 = var0.sampleCount(var4);
      int var15 = var37;
      ArrayList var38 = new ArrayList();
      List var16 = var38;
      boolean var40 = var38.add(var4);
      Long2ByteOpenHashMap var42 = var35.writes;
      Long2ByteOpenHashMap var17 = var42;
      Long2ByteOpenHashMap var43 = new Long2ByteOpenHashMap();
      Long2ByteOpenHashMap var18 = var43;
      byte var44 = (byte)(435598241 ^ var173);
      int var19 = var44;
      byte var45 = (byte)(435598241 ^ var173);
      int var20 = var45;
      var173 = 346362015 ^ var173;

      while (true) {
         if (var20 < var15) {
            var173 = 1969282305 ^ var173;
            int var147 = var16.size();
            byte var155 = (byte)(2016640573 ^ var173);
            int var148 = var147 + var155;
            ArrayList var47 = new ArrayList(var148);
            ArrayList var21 = var47;
            Long2ByteOpenHashMap var48 = new Long2ByteOpenHashMap();
            Long2ByteOpenHashMap var22 = var48;
            Object var49 = null;
            LongOpenHashSet var23 = (LongOpenHashSet)var49;
            Iterator var51 = var16.iterator();
            Iterator var24 = var51;
            var173 = 126775368 ^ var173;

            label144:
            while (true) {
               byte var53 = (byte)((var24.hasNext()) ? 1 : 0);
               if (var53 == (2143096439 ^ var173)) {
                  label112:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var173)) {
                        case 125711291:
                           var173 ^= 952512216;
                           break label112;
                        case 537370831:
                           break;
                        case 1267386790:
                           break label112;
                        case 2000366416:
                        default:
                           throw new RuntimeException();
                     }
                  }

                  FastEntrySet var55 = var22.long2ByteEntrySet();
                  ObjectIterator var56 = var55.fastIterator();
                  ObjectIterator var167 = var56;
                  var173 = 64887228 ^ var173;

                  while (true) {
                     byte var58 = (byte)((var167.hasNext()) ? 1 : 0);
                     if (var58 == (1151678739 ^ var173)) {
                        label87:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var173)) {
                              case 71711743:
                                 break label87;
                              case 83909169:
                                 var173 ^= 8588199;
                                 break label87;
                              case 838861627:
                              default:
                                 throw new RuntimeException();
                              case 846252685:
                           }
                        }

                        if (var23 == null) {
                           var173 = nvcbbjxzchszcxrq(var173, 1229280586);
                        } else {
                           var173 = 799034713 ^ var173;
                           LongIterator var70 = var23.iterator();
                           LongIterator var168 = var70;
                           var173 = 183008677 ^ var173;

                           label78:
                           while (true) {
                              byte var72 = (byte)((var168.hasNext()) ? 1 : 0);
                              if (var72 == (1634599496 ^ var173)) {
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var173)) {
                                       case 214254853:
                                          var173 ^= 1812817334;
                                       case 497719279:
                                          break label78;
                                       case 619522348:
                                          break;
                                       case 1443830356:
                                       default:
                                          throw new RuntimeException();
                                    }
                                 }
                              }

                              var173 = 2019410589 ^ var173;
                              Long var74 = var168.next();
                              long var75 = var74;
                              byte var157 = (byte)(422822100 ^ var173);
                              byte var78 = var17.put(var75, var157);
                              var173 = nvcbbjxzchszcxrq(var173, 2019410589);
                           }
                        }

                        int var130 = var16.size();
                        int var80 = var19 + var130;
                        var19 = var80;
                        List var82 = distinct(var21);
                        var16 = var82;
                        int var84 = var82.size();
                        int var131 = MAX_STATES;
                        if (var84 <= var131) {
                           var173 = 322555642 ^ var173;
                           int var132 = MAX_WORK;
                           if (var80 <= var132) {
                              var173 = 1159894155 ^ var173;
                              break label144;
                           }

                           var173 = 1001939985 ^ var173;
                        } else {
                           var173 = 679586539 ^ var173;
                        }

                        byte var133 = (byte)(635620628 ^ var173);
                        int var87 = var20 + var133;
                        if (var87 >= var15) {
                           var173 = nvcbbjxzchszcxrq(var173, 2124083354);
                           break label144;
                        }

                        var173 = 944410536 ^ var173;
                        byte var149 = (byte)(497566396 ^ var173);
                        int var136 = var20 + var149;
                        var35.fogFrom = var136;
                        var173 = nvcbbjxzchszcxrq(var173, 1285889936);
                        return var35;
                     }

                     var173 = 676537511 ^ var173;
                     Object var60 = var167.next();
                     Entry var61 = (Entry)var60;
                     long var62 = var61.getLongKey();
                     byte var65 = var17.get(var62);
                     byte var124 = (byte)(1828068789 ^ var173);
                     if (var65 != var124) {
                        var173 = 482810384 ^ var173;
                        byte var156 = (byte)(1882261414 ^ var173);
                        byte var67 = var17.put(var62, var156);
                        var173 = 815553598 ^ var173;
                     } else {
                        label100:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var173)) {
                              case 52213114:
                                 var173 ^= 744179246;
                                 break label100;
                              case 1520352604:
                                 break;
                              case 1627569065:
                                 break label100;
                              case 1870962343:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     }

                     var173 = 67658377 ^ var173;
                  }
               }

               var173 = 1148557785 ^ var173;
               Object var91 = var24.next();
               o var92 = (o)var91;
               var18.clear();
               attempt(var0, var1, var2, var3, var92, var17, var18, var21);
               LongOpenHashSet var95 = new LongOpenHashSet();
               LongOpenHashSet var170 = var95;
               FastEntrySet var97 = var18.long2ByteEntrySet();
               ObjectIterator var98 = var97.fastIterator();
               ObjectIterator var29 = var98;
               var173 = 785054586 ^ var173;

               while (true) {
                  byte var100 = (byte)((var29.hasNext()) ? 1 : 0);
                  if (var100 == (352480468 ^ var173)) {
                     var173 = nvcbbjxzchszcxrq(var173, 793388019);
                     if (var23 == null) {
                        var173 = 1934546426 ^ var173;
                        var23 = var170;
                        var173 = nvcbbjxzchszcxrq(var173, 1056844862);
                     } else {
                        label130:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var173)) {
                              case 15475475:
                                 var173 ^= 1616946729;
                                 break label130;
                              case 794651009:
                              default:
                                 throw new RuntimeException();
                              case 905112712:
                                 break;
                              case 2035092288:
                                 break label130;
                           }
                        }

                        boolean var104 = var23.retainAll(var170);
                        var173 = 768630765 ^ var173;
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var173)) {
                           case 135917541:
                              break;
                           case 141661615:
                              var173 ^= 138786964;
                              continue label144;
                           case 1764454085:
                           default:
                              throw new RuntimeException();
                           case 1967326119:
                              continue label144;
                        }
                     }
                  }

                  var173 = 1564539718 ^ var173;
                  Object var106 = var29.next();
                  Entry var107 = (Entry)var106;
                  long var140 = var107.getLongKey();
                  byte var159 = (byte)(1212323728 ^ var173);
                  byte var109 = var22.put(var140, var159);
                  byte var111 = var107.getByteValue();
                  byte var142 = (byte)(1212323731 ^ var173);
                  if (var111 == var142) {
                     var173 = 954520225 ^ var173;
                     long var144 = var107.getLongKey();
                     boolean var113 = var170.add(var144);
                     var173 = 2025076099 ^ var173;
                  } else {
                     var173 = nvcbbjxzchszcxrq(var173, 1079043874);
                  }

                  var173 = 487595108 ^ var173;
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var173)) {
                  case 164757787:
                     var173 = 1549729299 ^ var173;
                     return var35;
                  case 561853715:
                     return var35;
                  case 682858859:
                  default:
                     throw new RuntimeException();
                  case 1561071156:
               }
            }
         }

         var20 += 1534606734 ^ var173;
         var173 = nvcbbjxzchszcxrq(var173, 1445699249);
      }
   }

   private static void attempt(h var0, int var1, int var2, g$b var3, o var4, Long2ByteOpenHashMap var5, Long2ByteOpenHashMap var6, List<o> var7) {
      int var231 = 1335278669 ^ 268025307 ^ 994219164;
      var231 = 582267638 ^ var231;
      byte var9 = (byte)(1503209452 ^ var231);
      int var58 = var4.nextInt(var9);
      byte var10 = (byte)(1503209464 ^ var231);
      int var137 = var1 << var10;
      int var59 = var58 + var137;
      byte var138 = (byte)(1503209452 ^ var231);
      int var61 = var4.nextInt(var138);
      byte var175 = (byte)(1503209464 ^ var231);
      int var140 = var2 << var175;
      int var62 = var61 + var140;
      int var64 = var0.sampleY(var4);
      byte var66 = (byte)((var3.inBiome(var0, var59, var64, var62)) ? 1 : 0);
      if (var66 == (1503209468 ^ var231)) {
         var231 = 1999739915 ^ var231;
         boolean var68 = var7.add(var4);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var231)) {
               case 174506630:
                  var231 = 21338106 ^ var231;
                  return;
               case 309258255:
               default:
                  throw new RuntimeException(new IOException());
               case 864700222:
                  break;
               case 1064317374:
                  return;
            }
         }
      } else {
         label42:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var231)) {
               case 35900899:
                  break label42;
               case 228123873:
                  var231 ^= 1951777188;
                  break label42;
               case 1689992951:
               default:
                  throw new RuntimeException(new IOException());
               case 1993080033:
            }
         }

         int var70 = var0.size();
         float var72 = var4.nextFloat();
         float var144 = (float) Math.PI;
         float var73 = var72 * var144;
         float var75 = var70;
         float var145 = 8.0F;
         float var76 = var75 / var145;
         float var78 = var70;
         float var146 = 16.0F;
         float var79 = var78 / var146;
         float var147 = 2.0F;
         float var80 = var79 * var147;
         float var148 = 1.0F;
         float var81 = var80 + var148;
         float var149 = 2.0F;
         float var82 = var81 / var149;
         int var83 = Mth.ceil(var82);
         double var85 = var59;
         double var178 = var73;
         double var180 = Math.sin(var178);
         double var214 = var76;
         double var182 = var180 * var214;
         double var87 = var85 + var182;
         double var90 = var59;
         double var185 = var73;
         double var187 = Math.sin(var185);
         double var217 = var76;
         double var189 = var187 * var217;
         double var92 = var90 - var189;
         double var95 = var62;
         double var192 = var73;
         double var194 = Math.cos(var192);
         double var220 = var76;
         double var196 = var194 * var220;
         double var97 = var95 + var196;
         double var100 = var62;
         double var199 = var73;
         double var201 = Math.cos(var199);
         double var223 = var76;
         double var203 = var201 * var223;
         double var102 = var100 - var203;
         byte var205 = (byte)(768403035 ^ var231);
         int var151 = var4.nextInt(var205);
         int var105 = var64 + var151;
         byte var152 = (byte)(768403034 ^ var231);
         int var106 = var105 - var152;
         double var107 = var106;
         byte var206 = (byte)(768403035 ^ var231);
         int var154 = var4.nextInt(var206);
         int var110 = var64 + var154;
         byte var155 = (byte)(768403034 ^ var231);
         int var111 = var110 - var155;
         double var112 = var111;
         int var157 = Mth.ceil(var76);
         int var115 = var59 - var157;
         int var116 = var115 - var83;
         byte var159 = (byte)(768403034 ^ var231);
         int var118 = var64 - var159;
         int var119 = var118 - var83;
         int var162 = Mth.ceil(var76);
         int var121 = var62 - var162;
         int var122 = var121 - var83;
         byte var123 = (byte)(768403034 ^ var231);
         int var165 = Mth.ceil(var76);
         int var166 = var165 + var83;
         int var124 = var123 * var166;
         byte var125 = (byte)(768403034 ^ var231);
         byte var167 = (byte)(768403034 ^ var231);
         int var168 = var167 + var83;
         int var126 = var125 * var168;
         byte var128 = gate(var3, var119, var116, var122, var124);
         if (var128 == (768403032 ^ var231)) {
            var231 = 1192268562 ^ var231;
            boolean var131 = var7.add(var4);
            var231 = 1160862023 ^ var231;
         } else {
            var231 = 1920144280 ^ var231;
            byte var171 = (byte)(1606415810 ^ var231);
            if (var128 == var171) {
               var231 = 247789664 ^ var231;
               o var173 = var4.copy();
               boolean var134 = var7.add(var173);
               var231 = 215868562 ^ var231;
            } else {
               var231 = 35200242 ^ var231;
            }

            byte var16 = (byte)(1571219760 ^ var231);
            byte var227;
            if (var128 == var16) {
               var231 = 828333082 ^ var231;
               var227 = (byte)(1828304169 ^ var231);
               var231 = 1366700015 ^ var231;
            } else {
               var231 = 1021964608 ^ var231;
               var227 = (byte)(1632573554 ^ var231);
               var231 = 1556120245 ^ var231;
            }

            doPlace(
               var0,
               var1,
               var2,
               var3,
               var4,
               var5,
               var6,
               (var227 != 0),
               var87,
               var92,
               var97,
               var102,
               var107,
               var112,
               var116,
               var119,
               var122,
               var124,
               var126,
               var7
            );
            var231 = 308459210 ^ var231;
         }
      }
   }

   private static byte gate(g$b var0, int var1, int var2, int var3, int var4) {
      int var36 = 1475771630 ^ 654453101 ^ 994219164;
      var36 = 1128097495 ^ var36;
      byte var5 = (byte)(143370184 ^ var36);
      byte var9 = var5;
      int var10 = var2;
      var36 = 2887327 ^ var36;

      while (true) {
         int var23 = var2 + var4;
         if (var10 > var23) {
            var36 = 1451556338 ^ var36;
            byte var21;
            if (var9 != (1579373733 ^ var36)) {
               var36 = 1837663199 ^ var36;
               var21 = (byte)(866899832 ^ var36);
               var36 = 1246187629 ^ var36;
            } else {
               var36 = 1443941410 ^ var36;
               var21 = (byte)(137599111 ^ var36);
               var36 = 1910448016 ^ var36;
            }

            return var21;
         }

         var36 = 1591924788 ^ var36;
         int var11 = var3;
         var36 = 1447777886 ^ var36;

         while (true) {
            int var25 = var3 + var4;
            if (var11 > var25) {
               var36 = 286494690 ^ var36;
               var10 += 287156446 ^ var36;
               var36 = nvcbbjxzchszcxrq(var36, 431620488);
               break;
            }

            var36 = 991471031 ^ var36;
            int var27 = var0.gateLow(var10, var11);
            if (var1 <= var27) {
               var36 = 57796113 ^ var36;
               return (byte)(946300058 ^ var36);
            }

            var36 = 1081013727 ^ var36;
            int var29 = var0.gateHigh(var10, var11);
            if (var1 <= var29) {
               var36 = 1278909472 ^ var36;
               byte var18 = (byte)(927132532 ^ var36);
               var9 = var18;
               var36 = 679559936 ^ var36;
            } else {
               var36 = 1690033952 ^ var36;
            }

            var11 += 532916340 ^ var36;
            var36 = nvcbbjxzchszcxrq(var36, 533565256);
         }
      }
   }

   private static void doPlace(
      h var0,
      int var1,
      int var2,
      g$b var3,
      o var4,
      Long2ByteOpenHashMap var5,
      Long2ByteOpenHashMap var6,
      boolean var7,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      int var20,
      int var21,
      int var22,
      int var23,
      int var24,
      List<o> var25
   ) {
      int var693 = 443833153 ^ 1377233244 ^ 994219164;
      var693 = 1860682980 ^ var693;
      int var80 = var0.size();
      int var36 = var80;
      byte var27 = (byte)(499638881 ^ var693);
      int var82 = var80 * var27;
      double[] var83 = new double[var82];
      double[] var37 = var83;
      byte var84 = (byte)(499638885 ^ var693);
      int var38 = var84;
      var693 = 1716704118 ^ var693;

      label397:
      while (true) {
         if (var38 < var36) {
            var693 ^= 672691310;
            float var87 = var38;
            float var357 = var36;
            float var88 = var87 / var357;
            double var90 = var88;
            double var92 = Mth.lerp(var90, var8, var10);
            double var95 = var88;
            double var97 = Mth.lerp(var95, var16, var18);
            double var100 = var88;
            double var102 = Mth.lerp(var100, var12, var14);
            double var105 = var4.nextDouble();
            double var466 = var36;
            double var107 = var105 * var466;
            double var468 = 16.0;
            double var109 = var107 / var468;
            float var111 = (float) Math.PI;
            float var112 = var111 * var88;
            double var113 = var112;
            float var115 = Mth.sin(var113);
            float var359 = 1.0F;
            float var116 = var115 + var359;
            double var117 = var116;
            double var119 = var117 * var109;
            double var472 = 1.0;
            double var121 = var119 + var472;
            double var474 = 2.0;
            double var123 = var121 / var474;
            byte var476 = (byte)(1401767289 ^ var693);
            int var361 = var38 * var476;
            var37[var361] = var92;
            byte var479 = (byte)(1401767289 ^ var693);
            int var363 = var38 * var479;
            byte var480 = (byte)(1401767292 ^ var693);
            int var364 = var363 + var480;
            var37[var364] = var97;
            byte var483 = (byte)(1401767289 ^ var693);
            int var366 = var38 * var483;
            byte var484 = (byte)(1401767295 ^ var693);
            int var367 = var366 + var484;
            var37[var367] = var102;
            byte var487 = (byte)(1401767289 ^ var693);
            int var369 = var38 * var487;
            byte var488 = (byte)(1401767294 ^ var693);
            int var370 = var369 + var488;
            var37[var370] = var123;
            var38 += 1401767292 ^ var693;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                  case 31581487:
                     var693 ^= 672691310;
                     continue label397;
                  case 423075559:
                  default:
                     throw new RuntimeException();
                  case 1566773728:
                     continue label397;
                  case 2066621304:
               }
            }
         } else {
            var693 = nvcbbjxzchszcxrq(var693, 1090693367);
            byte var129 = (byte)(983013860 ^ var693);
            int var672 = var129;
            var693 = 2147221513 ^ var693;

            while (true) {
               byte var491 = (byte)(1164679660 ^ var693);
               int var372 = var36 - var491;
               if (var672 >= var372) {
                  var693 = 473923573 ^ var693;
                  byte var173 = (byte)((var0.drawsOnTerrain()) ? 1 : 0);
                  byte var673 = (byte)((var173 != 0) ? 1 : 0);
                  float var175 = var0.discard();
                  float var675 = var175;
                  byte var177 = var0.kind();
                  boolean var178 = m.isBase(var177);
                  boolean var678 = var178;
                  o var353;
                  if (var173 != (1498736152 ^ var693)) {
                     var693 = 1299831852 ^ var693;
                     var353 = var4.copy();

                     label346:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                           case 118994153:
                              var693 ^= 73843930;
                              break label346;
                           case 456194767:
                              break;
                           case 583926164:
                           default:
                              throw new RuntimeException();
                           case 815618154:
                              break label346;
                        }
                     }
                  } else {
                     label339:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                           case 219423898:
                              var693 ^= 1261680753;
                           case 520608936:
                              break label339;
                           case 1553106774:
                              break;
                           case 1733127268:
                           default:
                              throw new RuntimeException();
                        }
                     }

                     var353 = null;
                     var693 = 36479111 ^ var693;
                  }

                  o var42 = var353;
                  byte var180 = (byte)(273415918 ^ var693);
                  int var681 = var180;
                  byte var181 = (byte)(273415918 ^ var693);
                  int var45 = var181;
                  byte var182 = (byte)(273415918 ^ var693);
                  byte var684 = var182;
                  int var540 = var23 * var24;
                  int var541 = var540 * var23;
                  BitSet var183 = new BitSet(var541);
                  BitSet var48 = var183;
                  byte var184 = (byte)(273415918 ^ var693);
                  int var687 = var184;
                  var693 = 1645632760 ^ var693;

                  label332:
                  while (var687 < var36) {
                     var693 ^= 725007511;
                     byte var542 = (byte)(1500192389 ^ var693);
                     int var400 = var687 * var542;
                     byte var543 = (byte)(1500192386 ^ var693);
                     int var401 = var400 + var543;
                     double var187 = var37[var401];
                     double var51 = var187;
                     double var544 = 0.0;
                     double var749;
                     int var191 = (var749 = var187 - var544) == 0.0 ? 0 : (var749 < 0.0 ? -1 : 1);
                     if (var191 >= (1500192385 ^ var693)) {
                        var693 = 1349296474 ^ var693;
                        byte var546 = (byte)(151502815 ^ var693);
                        int var403 = var687 * var546;
                        double var193 = var37[var403];
                        double var55 = var193;
                        byte var547 = (byte)(151502815 ^ var693);
                        int var405 = var687 * var547;
                        byte var548 = (byte)(151502810 ^ var693);
                        int var406 = var405 + var548;
                        double var196 = var37[var406];
                        double var57 = var196;
                        byte var549 = (byte)(151502815 ^ var693);
                        int var408 = var687 * var549;
                        byte var550 = (byte)(151502809 ^ var693);
                        int var409 = var408 + var550;
                        double var199 = var37[var409];
                        double var59 = var199;
                        double var203 = var193 - var187;
                        int var205 = Mth.floor(var203);
                        int var206 = Math.max(var205, var20);
                        double var209 = var196 - var187;
                        int var211 = Mth.floor(var209);
                        int var212 = Math.max(var211, var21);
                        int var62 = var212;
                        double var215 = var199 - var187;
                        int var217 = Mth.floor(var215);
                        int var218 = Math.max(var217, var22);
                        int var63 = var218;
                        double var221 = var193 + var187;
                        int var223 = Mth.floor(var221);
                        int var224 = Math.max(var223, var206);
                        int var64 = var224;
                        double var227 = var196 + var187;
                        int var229 = Mth.floor(var227);
                        int var230 = Math.max(var229, var212);
                        int var65 = var230;
                        double var233 = var199 + var187;
                        int var235 = Mth.floor(var233);
                        int var236 = Math.max(var235, var218);
                        int var66 = var236;
                        int var67 = var206;
                        var693 = 2065751887 ^ var693;

                        label307:
                        while (var67 <= var64) {
                           var693 = 174637950 ^ var693;
                           double var240 = var67;
                           double var563 = 0.5;
                           double var242 = var240 + var563;
                           double var244 = var242 - var55;
                           double var246 = var244 / var51;
                           double var68 = var246;
                           double var250 = var246 * var246;
                           double var571 = 1.0;
                           double var750;
                           int var252 = (var750 = var250 - var571) == 0.0 ? 0 : (var750 < 0.0 ? -1 : 1);
                           if (var252 >= (2018485226 ^ var693)) {
                              var693 = 350910921 ^ var693;
                           } else {
                              var693 = 190909960 ^ var693;
                              int var70 = var62;
                              var693 = 1968796361 ^ var693;

                              while (var70 <= var65) {
                                 var693 = 151799400 ^ var693;
                                 double var256 = var70;
                                 double var573 = 0.5;
                                 double var258 = var256 + var573;
                                 double var260 = var258 - var57;
                                 double var262 = var260 / var51;
                                 double var71 = var262;
                                 double var266 = var68 * var68;
                                 double var583 = var262 * var262;
                                 double var268 = var266 + var583;
                                 double var585 = 1.0;
                                 double var751;
                                 int var270 = (var751 = var268 - var585) == 0.0 ? 0 : (var751 < 0.0 ? -1 : 1);
                                 if (var270 >= (259758403 ^ var693)) {
                                    var693 = 641931025 ^ var693;
                                 } else {
                                    var693 = 511557523 ^ var693;
                                    int var73 = var63;
                                    var693 = 260643657 ^ var693;

                                    while (var73 <= var66) {
                                       var693 = 1783306163 ^ var693;
                                       double var274 = var73;
                                       double var587 = 0.5;
                                       double var276 = var274 + var587;
                                       double var278 = var276 - var59;
                                       double var280 = var278 / var51;
                                       double var284 = var68 * var68;
                                       double var597 = var71 * var71;
                                       double var286 = var284 + var597;
                                       double var601 = var280 * var280;
                                       double var288 = var286 + var601;
                                       double var603 = 1.0;
                                       double var752;
                                       int var290 = (var752 = var288 - var603) == 0.0 ? 0 : (var752 < 0.0 ? -1 : 1);
                                       if (var290 >= (1959012906 ^ var693)) {
                                          var693 = nvcbbjxzchszcxrq(var693, 1988734890);
                                       } else {
                                          var693 = 542494538 ^ var693;
                                          byte var419 = (byte)(-1418847584 ^ var693);
                                          if (var70 < var419) {
                                             var693 = nvcbbjxzchszcxrq(var693, 1457283296);
                                          } else {
                                             var693 = 1757407636 ^ var693;
                                             short var420 = (short)(1009651147 ^ var693);
                                             if (var70 <= var420) {
                                                var693 = 110342689 ^ var693;
                                                int var294 = var67 - var20;
                                                int var423 = var70 - var21;
                                                int var424 = var423 * var23;
                                                int var295 = var294 + var424;
                                                int var426 = var73 - var22;
                                                int var427 = var426 * var23;
                                                int var428 = var427 * var24;
                                                int var296 = var295 + var428;
                                                byte var298 = (byte)((var48.get(var296)) ? 1 : 0);
                                                if (var298 == (985513685 ^ var693)) {
                                                   var693 = 506611312 ^ var693;
                                                   var48.set(var296);
                                                   byte var431 = (byte)(613415073 ^ var693);
                                                   int var301 = var67 >> var431;
                                                   int var302 = var301 - var1;
                                                   int var303 = Math.abs(var302);
                                                   byte var433 = (byte)(613415076 ^ var693);
                                                   if (var303 > var433) {
                                                      var693 = nvcbbjxzchszcxrq(var693, 650280229);
                                                   } else {
                                                      var693 = 2033877995 ^ var693;
                                                      byte var434 = (byte)(1572174666 ^ var693);
                                                      int var305 = var73 >> var434;
                                                      int var306 = var305 - var2;
                                                      int var307 = Math.abs(var306);
                                                      byte var436 = (byte)(1572174671 ^ var693);
                                                      if (var307 <= var436) {
                                                         var693 = 675750810 ^ var693;
                                                         long var309 = BlockPos.asLong(var67, var70, var73);
                                                         byte var312 = baseNow(var3, var5, var678, var67, var70, var73, var309);
                                                         if (var312 == (1978816724 ^ var693)) {
                                                            var693 = 2009062740 ^ var693;
                                                         } else {
                                                            var693 = 2112031350 ^ var693;
                                                            byte var439 = (byte)(135352992 ^ var693);
                                                            if (var312 == var439) {
                                                               var693 = 1111996959 ^ var693;
                                                               if (var673 != (1247209661 ^ var693)) {
                                                                  var693 = 705341397 ^ var693;
                                                                  var45 += 1616662377 ^ var693;
                                                                  byte var339 = (byte)(1616662377 ^ var693);
                                                                  var684 = var339;
                                                                  var693 = 505018369 ^ var693;
                                                               } else {
                                                                  var693 = nvcbbjxzchszcxrq(var693, 873684948);
                                                               }

                                                               byte var635 = (byte)(2118498155 ^ var693);
                                                               byte var341 = var6.put(var309, var635);

                                                               label215:
                                                               while (true) {
                                                                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                                                                     case 37277166:
                                                                        break label215;
                                                                     case 78081310:
                                                                        var693 ^= 2080912105;
                                                                        break label215;
                                                                     case 736781011:
                                                                        break;
                                                                     case 1679064544:
                                                                     default:
                                                                        throw new RuntimeException();
                                                                  }
                                                               }
                                                            } else {
                                                               var693 = nvcbbjxzchszcxrq(var693, 930539605);
                                                               float var440 = 0.0F;
                                                               float var753;
                                                               int var316 = (var753 = var675 - var440) == 0.0F ? 0 : (var753 < 0.0F ? -1 : 1);
                                                               byte var690;
                                                               if (var316 <= (1063762679 ^ var693)) {
                                                                  var693 = 1662846691 ^ var693;
                                                                  byte var337 = (byte)(1551547413 ^ var693);
                                                                  var690 = var337;
                                                                  var693 = nvcbbjxzchszcxrq(var693, 566510613);
                                                               } else {
                                                                  label265:
                                                                  while (true) {
                                                                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                                                                        case 181978457:
                                                                           var693 ^= 350230502;
                                                                        case 822268921:
                                                                           break label265;
                                                                        case 936752364:
                                                                        default:
                                                                           throw new RuntimeException();
                                                                        case 1835759885:
                                                                     }
                                                                  }

                                                                  float var441 = 1.0F;
                                                                  float var754;
                                                                  int var318 = (var754 = var675 - var441) == 0.0F ? 0 : (var754 < 0.0F ? -1 : 1);
                                                                  if (var318 >= (730311953 ^ var693)) {
                                                                     var693 = 1122512785 ^ var693;
                                                                     byte var336 = clearOfAir(var3, var5, var67, var70, var73);
                                                                     var690 = var336;

                                                                     label243:
                                                                     while (true) {
                                                                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                                                                           case 206071223:
                                                                              var693 ^= 349272705;
                                                                           case 429066311:
                                                                              break label243;
                                                                           case 543714137:
                                                                              break;
                                                                           case 945730366:
                                                                           default:
                                                                              throw new RuntimeException();
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var693 = 920906219 ^ var693;
                                                                     var681 += 493110523 ^ var693;
                                                                     if (var684 == (493110522 ^ var693)) {
                                                                        var693 = 368260475 ^ var693;
                                                                        float var321 = var4.nextFloat();
                                                                        float var755;
                                                                        int var322 = (var755 = var321 - var675) == 0.0F ? 0 : (var755 < 0.0F ? -1 : 1);
                                                                        byte var323;
                                                                        if (var322 < (144142721 ^ var693)) {
                                                                           var693 = nvcbbjxzchszcxrq(var693, 1225642867);
                                                                           var323 = clearOfAir(var3, var5, var67, var70, var73);
                                                                           var693 = 647891292 ^ var693;
                                                                        } else {
                                                                           var693 = 450490818 ^ var693;
                                                                           var323 = (byte)(307134530 ^ var693);

                                                                           label254:
                                                                           while (true) {
                                                                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                                                                                 case 58198735:
                                                                                    var693 ^= 1967795181;
                                                                                 case 334688123:
                                                                                    break label254;
                                                                                 case 1051286271:
                                                                                 default:
                                                                                    throw new RuntimeException();
                                                                                 case 1816633166:
                                                                              }
                                                                           }
                                                                        }

                                                                        var690 = var323;
                                                                        var693 = 448418735 ^ var693;
                                                                     } else {
                                                                        label236:
                                                                        while (true) {
                                                                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                                                                              case 86804922:
                                                                                 break;
                                                                              case 150100160:
                                                                                 var693 ^= 37515251;
                                                                                 break label236;
                                                                              case 771008968:
                                                                              default:
                                                                                 throw new RuntimeException();
                                                                              case 1020894357:
                                                                                 break label236;
                                                                           }
                                                                        }

                                                                        byte var332 = clearOfAir(var3, var5, var67, var70, var73);
                                                                        byte var451 = (byte)(525871880 ^ var693);
                                                                        byte var334;
                                                                        if (var332 == var451) {
                                                                           var693 = 1797895253 ^ var693;
                                                                           var334 = (byte)(1953603421 ^ var693);
                                                                           var693 = nvcbbjxzchszcxrq(var693, 203268877);
                                                                        } else {
                                                                           label227:
                                                                           while (true) {
                                                                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                                                                                 case 213568569:
                                                                                    var693 ^= 1055715250;
                                                                                 case 540237459:
                                                                                    break label227;
                                                                                 case 622189778:
                                                                                 default:
                                                                                    throw new RuntimeException();
                                                                                 case 692896621:
                                                                              }
                                                                           }

                                                                           var334 = (byte)(565494969 ^ var693);
                                                                           var693 = 1507391722 ^ var693;
                                                                        }

                                                                        var690 = var334;
                                                                        var693 = 97698896 ^ var693;
                                                                     }
                                                                  }
                                                               }

                                                               byte var443 = (byte)(2109667328 ^ var693);
                                                               if (var690 == var443) {
                                                                  var693 = 1554744440 ^ var693;
                                                                  byte var636;
                                                                  if (var7 != ((555056249 ^ var693) != 0)) {
                                                                     var693 = 1934183869 ^ var693;
                                                                     var636 = (byte)(1381773766 ^ var693);
                                                                     var693 = nvcbbjxzchszcxrq(var693, 2126066349);
                                                                  } else {
                                                                     var693 = nvcbbjxzchszcxrq(var693, 1907180851);
                                                                     var636 = (byte)(1354250571 ^ var693);
                                                                     var693 = 2086484515 ^ var693;
                                                                  }

                                                                  byte var326 = var6.put(var309, var636);
                                                                  var693 = nvcbbjxzchszcxrq(var693, 782796521);
                                                               } else {
                                                                  var693 = nvcbbjxzchszcxrq(var693, 1145927019);
                                                                  byte var446 = (byte)(972262760 ^ var693);
                                                                  if (var690 == var446) {
                                                                     var693 = 1967658020 ^ var693;
                                                                     byte var631 = (byte)(1287362892 ^ var693);
                                                                     byte var329 = var6.put(var309, var631);
                                                                     var693 = 1324752078 ^ var693;
                                                                  } else {
                                                                     var693 = 1002309866 ^ var693;
                                                                  }
                                                               }
                                                            }
                                                         }
                                                      } else {
                                                         var693 = nvcbbjxzchszcxrq(var693, 1610153678);
                                                      }
                                                   }
                                                } else {
                                                   var693 = nvcbbjxzchszcxrq(var693, 955267925);
                                                }
                                             } else {
                                                label286:
                                                while (true) {
                                                   switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                                                      case 77137206:
                                                         var693 ^= 1046710644;
                                                         break label286;
                                                      case 127986538:
                                                         break;
                                                      case 657311089:
                                                         break label286;
                                                      case 1300241634:
                                                      default:
                                                         throw new RuntimeException();
                                                   }
                                                }
                                             }
                                          }
                                       }

                                       var73 += 38634881 ^ var693;
                                       var693 = nvcbbjxzchszcxrq(var693, 482523161);
                                    }

                                    label202:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                                          case 188062167:
                                             var693 ^= 934785995;
                                             break label202;
                                          case 610201470:
                                             break;
                                          case 925819324:
                                          default:
                                             throw new RuntimeException();
                                          case 1270745043:
                                             break label202;
                                       }
                                    }
                                 }

                                 var70 += 691572307 ^ var693;
                                 var693 = 793727353 ^ var693;
                              }

                              var693 = nvcbbjxzchszcxrq(var693, 1792148744);
                           }

                           var67 += 1822808610 ^ var693;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                                 case 42023430:
                                    var693 ^= 511883959;
                                 case 508256626:
                                    continue label307;
                                 case 1449887516:
                                    break;
                                 case 1855047194:
                                 default:
                                    throw new RuntimeException();
                              }
                           }
                        }

                        label184:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                              case 145642712:
                              default:
                                 throw new RuntimeException();
                              case 221002041:
                                 var693 ^= 1155957822;
                                 break label184;
                              case 1412765795:
                                 break;
                              case 1885492647:
                                 break label184;
                           }
                        }
                     } else {
                        label317:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                              case 6594212:
                                 break;
                              case 222286450:
                                 var693 ^= 1873476139;
                                 break label317;
                              case 758596540:
                              default:
                                 throw new RuntimeException();
                              case 1862994350:
                                 break label317;
                           }
                        }
                     }

                     var687 += 918676651 ^ var693;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                           case 169319880:
                              var693 ^= 1151092412;
                              continue label332;
                           case 576632490:
                              break;
                           case 618808568:
                           default:
                              throw new RuntimeException();
                           case 972230690:
                              continue label332;
                        }
                     }
                  }

                  var693 = 493424408 ^ var693;
                  if (var673 == (1865723150 ^ var693)) {
                     var693 = 424089622 ^ var693;
                     boolean var344 = var25.add(var4);
                     var693 = nvcbbjxzchszcxrq(var693, 549348321);
                  } else {
                     var693 = nvcbbjxzchszcxrq(var693, 948904618);
                     byte var345 = (byte)(1471909796 ^ var693);
                     int var688 = var345;
                     var693 = 1426403890 ^ var693;

                     while (var688 <= var45) {
                        var693 = 482590029 ^ var693;
                        o var354;
                        if (var688 == var45) {
                           var693 = 1171066591 ^ var693;
                           var354 = var42;
                           var693 = nvcbbjxzchszcxrq(var693, 686618821);
                        } else {
                           label167:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                                 case 185741269:
                                    var693 ^= 112296815;
                                    break label167;
                                 case 647617423:
                                    break;
                                 case 1372078804:
                                    break label167;
                                 case 1917241002:
                                 default:
                                    throw new RuntimeException();
                              }
                           }

                           var354 = var42.copy();
                           var693 = 1804629365 ^ var693;
                        }

                        int var459 = var681 + var688;
                        var354.skip(var459);
                        boolean var351 = var25.add(var354);
                        var688 += 1935472320 ^ var693;
                        var693 = 1910655831 ^ var693;
                     }

                     var693 = nvcbbjxzchszcxrq(var693, 1416850287);
                  }

                  return;
               }

               var693 = 130940779 ^ var693;
               byte var492 = (byte)(1118201474 ^ var693);
               int var374 = var672 * var492;
               byte var493 = (byte)(1118201477 ^ var693);
               int var375 = var374 + var493;
               double var132 = var37[var375];
               double var494 = 0.0;
               double var756;
               int var134 = (var756 = var132 - var494) == 0.0 ? 0 : (var756 < 0.0 ? -1 : 1);
               if (var134 <= (1118201478 ^ var693)) {
                  var693 = 1647873255 ^ var693;
               } else {
                  var693 = 496061697 ^ var693;
                  byte var376 = (byte)(1597451142 ^ var693);
                  int var136 = var672 + var376;
                  int var674 = var136;
                  var693 = 236544817 ^ var693;

                  while (var674 < var36) {
                     var693 = 1358519581 ^ var693;
                     byte var496 = (byte)(30873007 ^ var693);
                     int var379 = var674 * var496;
                     byte var497 = (byte)(30873000 ^ var693);
                     int var380 = var379 + var497;
                     double var139 = var37[var380];
                     double var498 = 0.0;
                     double var757;
                     int var141 = (var757 = var139 - var498) == 0.0 ? 0 : (var757 < 0.0 ? -1 : 1);
                     if (var141 <= (30873003 ^ var693)) {
                        var693 = 1187797695 ^ var693;
                     } else {
                        var693 = 1165307235 ^ var693;
                        byte var500 = (byte)(1151482060 ^ var693);
                        int var382 = var672 * var500;
                        double var143 = var37[var382];
                        byte var641 = (byte)(1151482060 ^ var693);
                        int var616 = var674 * var641;
                        double var502 = var37[var616];
                        double var145 = var143 - var502;
                        byte var504 = (byte)(1151482060 ^ var693);
                        int var384 = var672 * var504;
                        byte var505 = (byte)(1151482057 ^ var693);
                        int var385 = var384 + var505;
                        double var148 = var37[var385];
                        byte var642 = (byte)(1151482060 ^ var693);
                        int var618 = var674 * var642;
                        byte var643 = (byte)(1151482057 ^ var693);
                        int var619 = var618 + var643;
                        double var507 = var37[var619];
                        double var150 = var148 - var507;
                        byte var509 = (byte)(1151482060 ^ var693);
                        int var387 = var672 * var509;
                        byte var510 = (byte)(1151482058 ^ var693);
                        int var388 = var387 + var510;
                        double var153 = var37[var388];
                        byte var644 = (byte)(1151482060 ^ var693);
                        int var621 = var674 * var644;
                        byte var645 = (byte)(1151482058 ^ var693);
                        int var622 = var621 + var645;
                        double var512 = var37[var622];
                        double var155 = var153 - var512;
                        byte var514 = (byte)(1151482060 ^ var693);
                        int var390 = var672 * var514;
                        byte var515 = (byte)(1151482059 ^ var693);
                        int var391 = var390 + var515;
                        double var158 = var37[var391];
                        byte var646 = (byte)(1151482060 ^ var693);
                        int var624 = var674 * var646;
                        byte var647 = (byte)(1151482059 ^ var693);
                        int var625 = var624 + var647;
                        double var517 = var37[var625];
                        double var160 = var158 - var517;
                        double var164 = var160 * var160;
                        double var523 = var145 * var145;
                        double var652 = var150 * var150;
                        double var525 = var523 + var652;
                        double var656 = var155 * var155;
                        double var527 = var525 + var656;
                        double var758;
                        int var166 = (var758 = var164 - var527) == 0.0 ? 0 : (var758 < 0.0 ? -1 : 1);
                        if (var166 <= (1151482056 ^ var693)) {
                           var693 = 62486492 ^ var693;
                        } else {
                           var693 = 944820659 ^ var693;
                           double var529 = 0.0;
                           double var759;
                           int var169 = (var759 = var160 - var529) == 0.0 ? 0 : (var759 < 0.0 ? -1 : 1);
                           if (var169 > (2096294267 ^ var693)) {
                              var693 = 1671475159 ^ var693;
                              byte var531 = (byte)(525485736 ^ var693);
                              int var393 = var674 * var531;
                              byte var532 = (byte)(525485743 ^ var693);
                              int var394 = var393 + var532;
                              double var533 = -1.0;
                              var37[var394] = var533;

                              label372:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                                    case 212826047:
                                       var693 ^= 1481181624;
                                       break label372;
                                    case 401000759:
                                    default:
                                       throw new RuntimeException();
                                    case 1189099545:
                                       break label372;
                                    case 1517330779:
                                 }
                              }
                           } else {
                              label385:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                                    case 35051692:
                                       var693 ^= 1806970358;
                                       break label385;
                                    case 468364611:
                                       break;
                                    case 584879575:
                                    default:
                                       throw new RuntimeException();
                                    case 1048172661:
                                       break label385;
                                 }
                              }

                              byte var535 = (byte)(390513801 ^ var693);
                              int var396 = var672 * var535;
                              byte var536 = (byte)(390513806 ^ var693);
                              int var397 = var396 + var536;
                              double var537 = -1.0;
                              var37[var397] = var537;
                              var693 = 1348307865 ^ var693;
                           }
                        }
                     }

                     var674 += 1192972053 ^ var693;
                     var693 = 372574114 ^ var693;
                  }

                  label361:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var693)) {
                        case 222952910:
                           var693 ^= 1907401431;
                           break label361;
                        case 686831676:
                           break;
                        case 1093019628:
                           break label361;
                        case 1688208604:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }

               var672 += 547285600 ^ var693;
               var693 = nvcbbjxzchszcxrq(var693, 1710584716);
            }
         }
      }
   }

   private static byte baseNow(g$b var0, Long2ByteOpenHashMap var1, boolean var2, int var3, int var4, int var5, long var6) {
      int var26 = 1650633565 ^ 24389899 ^ 994219164;
      var26 = 364611863 ^ var26;
      byte var14 = var1.get(var6);
      if (var14 != (1307549661 ^ var26)) {
         var26 = 557556646 ^ var26;
         if (var2 == ((1825848443 ^ var26) != 0)) {
            var26 = 179630521 ^ var26;
            byte var23 = (byte)(1717620163 ^ var26);
            byte var21;
            if (var14 == var23) {
               var26 = 1548983062 ^ var26;
               var21 = (byte)(976443092 ^ var26);
               var26 = 1426263745 ^ var26;
            } else {
               var26 = nvcbbjxzchszcxrq(var26, 522669631);
               var21 = (byte)(2034729983 ^ var26);
               var26 = 376953832 ^ var26;
            }

            return var21;
         }

         var26 = 254607653 ^ var26;
      } else {
         var26 = nvcbbjxzchszcxrq(var26, 773235331);
      }

      return var0.base(var3, var4, var5);
   }

   private static byte clearOfAir(g$b var0, Long2ByteOpenHashMap var1, int var2, int var3, int var4) {
      int var66 = 534083040 ^ 1190161787 ^ 994219164;
      var66 = 2030892880 ^ var66;
      byte var5 = (byte)(460028758 ^ var66);
      byte var9 = var5;
      int[][] var18 = SIDES;
      int[][] var10 = var18;
      int var20 = var18.length;
      int var11 = var20;
      byte var21 = (byte)(460028759 ^ var66);
      int var12 = var21;
      var66 = 1584865766 ^ var66;

      label88:
      while (true) {
         if (var12 < var11) {
            var66 = 676105970 ^ var66;
            int[] var24 = var10[var12];
            byte var7 = (byte)(1834013763 ^ var66);
            int var45 = var24[var7];
            int var26 = var2 + var45;
            byte var59 = (byte)(1834013762 ^ var66);
            int var47 = var24[var59];
            int var28 = var3 + var47;
            byte var60 = (byte)(1834013761 ^ var66);
            int var49 = var24[var60];
            int var30 = var4 + var49;
            byte var50 = (byte)(-1834013821 ^ var66);
            if (var28 >= var50) {
               var66 = 242528791 ^ var66;
               short var51 = (short)(1663330155 ^ var66);
               if (var28 > var51) {
                  var66 = 497020060 ^ var66;
                  return (byte)(2126219976 ^ var66);
               }

               label61:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var66)) {
                     case 1500518:
                        var66 ^= 1813363181;
                        break label61;
                     case 138081748:
                     default:
                        throw new RuntimeException(new IOException());
                     case 663964848:
                        break label61;
                     case 1439103163:
                  }
               }

               long var53 = BlockPos.asLong(var26, var28, var30);
               byte var34 = var1.get(var53);
               byte var55 = (byte)(254926776 ^ var66);
               if (var34 != var55) {
                  var66 = 1862897020 ^ var66;
                  byte var36 = var0.air(var26, var28, var30);
                  byte var57 = (byte)(1614303940 ^ var66);
                  if (var36 == var57) {
                     var66 = 477381316 ^ var66;
                     return (byte)(2085359617 ^ var66);
                  }

                  label51:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var66)) {
                        case 174932069:
                           var66 ^= 1342344924;
                           break label51;
                        case 1257873018:
                           break;
                        case 1446070377:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1516228060:
                           break label51;
                     }
                  }

                  byte var58 = (byte)(809163803 ^ var66);
                  if (var36 == var58) {
                     var66 = 2023410851 ^ var66;
                     byte var39 = (byte)(1218449592 ^ var66);
                     var9 = var39;
                     var66 = 556151294 ^ var66;
                  } else {
                     var66 = nvcbbjxzchszcxrq(var66, 1505557853);
                  }
               } else {
                  var66 = nvcbbjxzchszcxrq(var66, 1723334397);
               }

               var12 += 1770398021 ^ var66;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var66)) {
                     case 208898549:
                        var66 ^= 748321781;
                     case 986824183:
                        continue label88;
                     case 1018959612:
                        break;
                     case 1802216639:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var66)) {
                     case 63763985:
                        var66 ^= 334192267;
                        return (byte)(2126219976 ^ var66);
                     case 1021396798:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1581946294:
                        break;
                     case 1729730516:
                        return (byte)(2126219976 ^ var66);
                  }
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var66)) {
                  case 99003050:
                     var66 = 2138380061 ^ var66;
                     return var9;
                  case 826640260:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1063803173:
                     break;
                  case 1449185722:
                     return var9;
               }
            }
         }
      }
   }

   private static List<o> distinct(List<o> var0) {
      int var54 = 457807530 ^ 2142345052 ^ 994219164;
      var54 = 723217351 ^ var54;
      int var12 = var0.size();
      byte var2 = (byte)(1956773548 ^ var54);
      if (var12 <= var2) {
         var54 = 1322761740 ^ var54;
         return var0;
      } else {
         var54 = 1686543595 ^ var54;
         HashMap var14 = new HashMap();
         HashMap var4 = var14;
         int var50 = var0.size();
         ArrayList var15 = new ArrayList(var50);
         ArrayList var5 = var15;
         Iterator var17 = var0.iterator();
         Iterator var6 = var17;
         var54 = 735798529 ^ var54;

         while (true) {
            byte var19 = (byte)((var6.hasNext()) ? 1 : 0);
            if (var19 == (1006372679 ^ var54)) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
                     case 70809061:
                        var54 = 24022964 ^ var54;
                        return var5;
                     case 179649997:
                        break;
                     case 1452958681:
                     default:
                        throw new RuntimeException();
                     case 1528826498:
                        return var5;
                  }
               }
            }

            var54 = 1392271375 ^ var54;
            Object var21 = var6.next();
            o var22 = (o)var21;
            o var7 = var22;
            long var44 = var22.stateHash();
            Long var46 = var44;
            Function var51 = var0x -> {
               int var5x = 1186277110 ^ 1833446929 ^ 994219164;
               var5x = 1022015136 ^ var5x;
               byte var2x = (byte)(743779034 ^ var5x);
               return new ArrayList(var2x);
            };
            Object var24 = var4.computeIfAbsent(var46, var51);
            List var25 = (List)var24;
            byte var26 = (byte)(1761634120 ^ var54);
            byte var9 = var26;
            Iterator var28 = var25.iterator();
            Iterator var10 = var28;
            var54 = 470653037 ^ var54;

            label41:
            while (true) {
               byte var30 = (byte)((var10.hasNext()) ? 1 : 0);
               if (var30 == (1963851557 ^ var54)) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
                        case 46885722:
                           var54 ^= 1305162974;
                           break label41;
                        case 273359348:
                           break;
                        case 875262990:
                        default:
                           throw new RuntimeException();
                        case 1571964923:
                           break label41;
                     }
                  }
               }

               var54 = 1175326791 ^ var54;
               Object var32 = var10.next();
               o var33 = (o)var32;
               byte var35 = (byte)((var33.sameState(var7)) ? 1 : 0);
               if (var35 != (855895906 ^ var54)) {
                  var54 = 1588613014 ^ var54;
                  byte var36 = (byte)(1840488693 ^ var54);
                  var9 = var36;
                  var54 = 1433758479 ^ var54;
                  break;
               }

               var54 = nvcbbjxzchszcxrq(var54, 245320366);
               var54 = 1217485545 ^ var54;
            }

            if (var9 == (952552443 ^ var54)) {
               var54 = 1077620865 ^ var54;
               boolean var39 = var25.add(var7);
               boolean var41 = var5.add(var7);
               var54 = 762530427 ^ var54;
            } else {
               var54 = 1833466618 ^ var54;
            }

            var54 = nvcbbjxzchszcxrq(var54, 1853011526);
         }
      }
   }

   static {
      int var69 = 251588540 ^ 2024377263 ^ Integer.parseInt("269562816");
      int var66 = new Random(7365684484518553736L).nextInt();
      jAg1Ti9tL8 = 1966328184 ^ var66;
      var69 = 517443004 ^ var69;
      String var0 = qyxjrqnisd(urhtnliajnpoaxk(), var69);
      short var1 = (short)(2022825583 ^ var69);
      Integer var6 = Integer.getInteger(var0, var1);
      int var7 = var6;
      MAX_STATES = var7;
      String var8 = qyxjrqnisd(ilgxdciimpwmsis(), var69);
      short var13 = (short)(2022813535 ^ var69);
      Integer var9 = Integer.getInteger(var8, var13);
      int var10 = var9;
      MAX_WORK = var10;
      byte var11 = (byte)(2022824553 ^ var69);
      int[][] var12 = new int[var11][];
      byte var2 = (byte)(2022824559 ^ var69);
      byte var3 = (byte)(2022824556 ^ var69);
      int[] var19 = new int[var3];
      byte var4 = (byte)(2022824559 ^ var69);
      byte var5 = (byte)(2022824558 ^ var69);
      var19[var4] = var5;
      byte var30 = (byte)(2022824558 ^ var69);
      byte var47 = (byte)(2022824559 ^ var69);
      var19[var30] = var47;
      byte var31 = (byte)(2022824557 ^ var69);
      byte var48 = (byte)(2022824559 ^ var69);
      var19[var31] = var48;
      var12[var2] = var19;
      byte var14 = (byte)(2022824558 ^ var69);
      byte var20 = (byte)(2022824556 ^ var69);
      int[] var21 = new int[var20];
      byte var32 = (byte)(2022824559 ^ var69);
      byte var49 = (byte)(-2022824560 ^ var69);
      var21[var32] = var49;
      byte var33 = (byte)(2022824558 ^ var69);
      byte var50 = (byte)(2022824559 ^ var69);
      var21[var33] = var50;
      byte var34 = (byte)(2022824557 ^ var69);
      byte var51 = (byte)(2022824559 ^ var69);
      var21[var34] = var51;
      var12[var14] = var21;
      byte var15 = (byte)(2022824557 ^ var69);
      byte var22 = (byte)(2022824556 ^ var69);
      int[] var23 = new int[var22];
      byte var35 = (byte)(2022824559 ^ var69);
      byte var52 = (byte)(2022824559 ^ var69);
      var23[var35] = var52;
      byte var36 = (byte)(2022824558 ^ var69);
      byte var53 = (byte)(2022824558 ^ var69);
      var23[var36] = var53;
      byte var37 = (byte)(2022824557 ^ var69);
      byte var54 = (byte)(2022824559 ^ var69);
      var23[var37] = var54;
      var12[var15] = var23;
      byte var16 = (byte)(2022824556 ^ var69);
      byte var24 = (byte)(2022824556 ^ var69);
      int[] var25 = new int[var24];
      byte var38 = (byte)(2022824559 ^ var69);
      byte var55 = (byte)(2022824559 ^ var69);
      var25[var38] = var55;
      byte var39 = (byte)(2022824558 ^ var69);
      byte var56 = (byte)(-2022824560 ^ var69);
      var25[var39] = var56;
      byte var40 = (byte)(2022824557 ^ var69);
      byte var57 = (byte)(2022824559 ^ var69);
      var25[var40] = var57;
      var12[var16] = var25;
      byte var17 = (byte)(2022824555 ^ var69);
      byte var26 = (byte)(2022824556 ^ var69);
      int[] var27 = new int[var26];
      byte var41 = (byte)(2022824559 ^ var69);
      byte var58 = (byte)(2022824559 ^ var69);
      var27[var41] = var58;
      byte var42 = (byte)(2022824558 ^ var69);
      byte var59 = (byte)(2022824559 ^ var69);
      var27[var42] = var59;
      byte var43 = (byte)(2022824557 ^ var69);
      byte var60 = (byte)(2022824558 ^ var69);
      var27[var43] = var60;
      var12[var17] = var27;
      byte var18 = (byte)(2022824554 ^ var69);
      byte var28 = (byte)(2022824556 ^ var69);
      int[] var29 = new int[var28];
      byte var44 = (byte)(2022824559 ^ var69);
      byte var61 = (byte)(2022824559 ^ var69);
      var29[var44] = var61;
      byte var45 = (byte)(2022824558 ^ var69);
      byte var62 = (byte)(2022824559 ^ var69);
      var29[var45] = var62;
      byte var46 = (byte)(2022824557 ^ var69);
      byte var63 = (byte)(-2022824560 ^ var69);
      var29[var46] = var63;
      var12[var18] = var29;
      SIDES = var12;
   }

   public static String qyxjrqnisd(byte[] var0, int var1) {
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
      String var29 = hdnptixsju;
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

   private static byte[] urhtnliajnpoaxk() {
      return new byte[]{0, 0, 0, 21, 0, 0, 0, 0};
   }

   private static byte[] ilgxdciimpwmsis() {
      return new byte[]{0, 0, 0, 19, 0, 0, 0, 21};
   }

   private static byte[] ohijltrdribspuu() {
      return new byte[]{
         50,
         71,
         50,
         91,
         56,
         95,
         52,
         69,
         53,
         64,
         50,
         83,
         50,
         94,
         56,
         91,
         52,
         80,
         53,
         87,
         50,
         68,
         50,
         28,
         56,
         93,
         52,
         71,
         53,
         92,
         50,
         99,
         50,
         70,
         56,
         83,
         52,
         65,
         53,
         92,
         50,
         67,
         50,
         71,
         50,
         91,
         56,
         95,
         52,
         69,
         53,
         64,
         50,
         83,
         50,
         94,
         56,
         91,
         52,
         80,
         53,
         87,
         50,
         68,
         50,
         28,
         56,
         93,
         52,
         71,
         53,
         92,
         50,
         103,
         50,
         93,
         56,
         64,
         52,
         94
      };
   }

   private static int nvcbbjxzchszcxrq(int var0, int var1) {
      return var0 ^ var1;
   }
}
