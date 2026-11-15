package com.wimpyclient.s;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class n {
   public static final int MIN_Y = -16;
   public static final int MAX_Y = 63;
   public static final int LAYERS = 80;
   private static final int MAX_CHUNKS = 4;
   private static final int MAX_POSSIBLE = 10;
   private static final int[][][] PERMUTATIONS;
   public final int chunkX;
   public final int chunkZ;
   private final byte[] cells;
   private static int h5DLTtyaFt;
   private transient int kcY1rp9aNw;
   private static byte[] yydaqjocjs = uvogfyhiepldstl();

   private n(int var1, int var2, byte[] var3) {
super();
      int var13 = 1211981284 ^ 953841555;
      

      label25:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
            case 180327073:
               var13 = 834521473 ^ var13;
            case 930545059:
               var13 = 2124173196 ^ 488656494 ^ Integer.parseInt("585556500");
               this.kcY1rp9aNw = 848698513 ^ h5DLTtyaFt;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
                     case 245389558:
                        var13 = 1297456939 ^ var13;
                        break label25;
                     case 272387391:
                     default:
                        throw new RuntimeException(new IOException());
                     case 914669282:
                        break;
                     case 1809345158:
                        break label25;
                  }
               }
            case 756169056:
               break;
            case 1660245421:
            default:
               throw new RuntimeException(new IOException());
         }
      }

      this.chunkX = var1;
      this.chunkZ = var2;
      this.cells = var3;
   }

   private static int index(int var0, int var1, int var2) {
      int var20 = 1926073688 ^ 2068619256 ^ 1329924868;
      var20 = 37785870 ^ var20;
      byte var4 = (byte)(-1149536422 ^ var20);
      int var6 = var1 - var4;
      byte var10 = (byte)(1149536418 ^ var20);
      int var7 = var6 << var10;
      byte var5 = (byte)(1149536421 ^ var20);
      int var12 = var2 & var5;
      byte var16 = (byte)(1149536430 ^ var20);
      int var13 = var12 << var16;
      int var8 = var7 | var13;
      byte var17 = (byte)(1149536421 ^ var20);
      int var15 = var0 & var17;
      return var8 | var15;
   }

   public static boolean inBand(int var0) {
      int var8 = 1919603921 ^ 505840134 ^ 1329924868;
      var8 = 663762556 ^ var8;
      byte var2 = (byte)(-77163425 ^ var8);
      if (var0 >= var2) {
         var8 = 2001993231 ^ var8;
         byte var5 = (byte)(1942656415 ^ var8);
         if (var0 <= var5) {
            var8 = 1528742764 ^ var8;
            byte var4 = (byte)(685004493 ^ var8);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
                  case 253444351:
                     var8 = 676763964 ^ var8;
                     return (var4 != 0);
                  case 402638569:
                     break;
                  case 588198591:
                     return (var4 != 0);
                  case 844109266:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var8 = 1059001191 ^ var8;
      } else {
         var8 = 1213001064 ^ var8;
      }

      byte var15 = (byte)(1289062087 ^ var8);
      var8 = 1280788791 ^ var8;
      return (var15 != 0);
   }

   public byte certain(int var1, int var2, int var3) {
      int var16 = 1551999970 ^ 33870475 ^ 2110986133;
      var16 = 754077827 ^ var16;
      byte[] var8 = this.cells;
      int var12 = index(var1, var2, var3);
      byte var9 = var8[var12];
      byte var13 = (byte)(262420080 ^ var16);
      int var10 = var9 & var13;
      return (byte)var10;
   }

   public int families(int var1, int var2, int var3) {
      int var17 = 761993053 ^ 647954613 ^ 2110986133;
      var17 = 680374909 ^ var17;
      byte[] var8 = this.cells;
      int var12 = index(var1, var2, var3);
      byte var9 = var8[var12];
      byte var13 = (byte)(1588244996 ^ var17);
      int var10 = var9 >> var13;
      byte var14 = (byte)(1588245007 ^ var17);
      return var10 & var14;
   }

   public static n of(l var0, c[] var1, d var2) {
      int var105 = 942650830 ^ 1060035369 ^ 1329924868;
      var105 = 1809143969 ^ var105;
      short var3 = (short)(596733250 ^ var105);
      byte[] var24 = new byte[var3];
      byte[] var8 = var24;
      byte var4 = (byte)(596720971 ^ var105);
      ArrayList var25 = new ArrayList(var4);
      ArrayList var9 = var25;
      byte var26 = (byte)(596720971 ^ var105);
      long[] var27 = new long[var26];
      long[] var10 = var27;
      int var29 = var0.chunkX;
      byte var62 = (byte)(596720966 ^ var105);
      int var30 = var29 << var62;
      int var11 = var30;
      int var32 = var0.chunkZ;
      byte var63 = (byte)(596720966 ^ var105);
      int var33 = var32 << var63;
      int var12 = var33;
      byte var34 = (byte)(-596720974 ^ var105);
      int var13 = var34;
      var105 = 528437473 ^ var105;

      label97:
      while (true) {
         byte var64 = (byte)(1022258588 ^ var105);
         if (var13 <= var64) {
            var105 = 1309263315 ^ var105;
            int var14 = var12;
            var105 = 1966899106 ^ var105;

            while (true) {
               byte var80 = (byte)(131848130 ^ var105);
               int var66 = var12 + var80;
               if (var14 >= var66) {
                  var105 = 1913901539 ^ var105;
                  var13 += 1976043056 ^ var105;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var105)) {
                        case 70516278:
                           var105 ^= 1227254674;
                           continue label97;
                        case 521041337:
                           break;
                        case 1081144109:
                           continue label97;
                        case 1249213939:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               }

               var105 = 670380706 ^ var105;
               int var15 = var11;
               var105 = 1238255615 ^ var105;

               while (true) {
                  byte var81 = (byte)(1776329375 ^ var105);
                  int var68 = var11 + var81;
                  if (var15 >= var68) {
                     label77:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var105)) {
                           case 220418837:
                              var105 ^= 1781483036;
                           case 535763974:
                              break label77;
                           case 1019285209:
                              break;
                           case 1765342437:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }

                     var14 += 63956114 ^ var105;
                     var105 = qpddxxhuxbyrlulj(var105, 68432705);
                     break;
                  }

                  var105 = 763217981 ^ var105;
                  byte var41 = var0.kind(var15, var13, var14);
                  var9.clear();
                  long var44 = BlockPos.asLong(var15, var13, var14);
                  long var17 = var44;
                  c[] var19 = var1;
                  int var48 = var1.length;
                  int var20 = var48;
                  byte var49 = (byte)(1151167154 ^ var105);
                  int var21 = var49;
                  var105 = 587976897 ^ var105;

                  label65:
                  while (var21 < var20) {
                     var105 = 954193152 ^ var105;
                     c var52 = var19[var21];
                     if (var52 != null) {
                        var105 = 849691920 ^ var105;
                        short[] var55 = sequence(var52, var17, var15, var13, var14);
                        if (var55 != null) {
                           var105 = 882188106 ^ var105;
                           int var76 = var9.size();
                           int var85 = var52.chunkX;
                           int var95 = var52.chunkZ;
                           long var86 = ChunkPos.asLong(var85, var95);
                           var10[var76] = var86;
                           boolean var59 = var9.add(var55);
                           var105 = 1761864834 ^ var105;
                        } else {
                           var105 = 1570173896 ^ var105;
                        }
                     } else {
                        var105 = 1865660120 ^ var105;
                     }

                     var21 += 813357482 ^ var105;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var105)) {
                           case 233715137:
                              var105 ^= 1475109848;
                              continue label65;
                           case 319338764:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1036219149:
                              break;
                           case 1892550720:
                              continue label65;
                        }
                     }
                  }

                  var105 = 1388114934 ^ var105;
                  int var79 = index(var15, var13, var14);
                  byte var90 = play(var41, var9, var10, var2);
                  var8[var79] = var90;
                  var15 += 891963780 ^ var105;
                  var105 = qpddxxhuxbyrlulj(var105, 1556802314);
               }
            }
         } else {
            label90:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var105)) {
                  case 1001002:
                  default:
                     throw new RuntimeException(new IOException());
                  case 101566597:
                     var105 = 1281414332 ^ var105;
                  case 1005715991:
                     break label90;
                  case 1585284152:
               }
            }
         }

         int var92 = var0.chunkX;
         int var99 = var0.chunkZ;
         return new n(var92, var99, var8);
      }
   }

   private static short[] sequence(c var0, long var1, int var3, int var4, int var5) {
      int var86 = 1311906758 ^ 1319188381 ^ 1329924868;
      var86 = 1181503445 ^ var86;
      int var19 = var0.find(var1);
      int var12 = var19;
      int var21;
      if (var19 >= (163211402 ^ var86)) {
         var86 = 1267005265 ^ var86;
         var21 = var0.writeCount(var19);
         var86 = qpddxxhuxbyrlulj(var86, 132985947);
      } else {
         label119:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
               case 47784753:
                  var86 ^= 1946429445;
                  break label119;
               case 376048943:
               default:
                  throw new RuntimeException(new IOException());
               case 471092140:
                  break;
               case 597690746:
                  break label119;
            }
         }

         var21 = (byte)(2109620367 ^ var86);
         var86 = 946727695 ^ var86;
      }

      int var13 = var21;
      Object var22 = null;
      ArrayList var14 = (ArrayList)var22;
      List var24 = var0.fogs();
      Iterator var25 = var24.iterator();
      Iterator var15 = var25;
      var86 = 88545504 ^ var86;

      while (true) {
         byte var27 = (byte)((var15.hasNext()) ? 1 : 0);
         if (var27 == (1083487072 ^ var86)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                  case 220224286:
                     var86 ^= 1009646289;
                  case 1227997708:
                     if (var21 == (2092517809 ^ var86)) {
                        var86 = 1915941171 ^ var86;
                        if (var14 == null) {
                           var86 = 1260857961 ^ var86;
                           return null;
                        }

                        var86 = 1844322782 ^ var86;
                     } else {
                        label88:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                              case 27689599:
                                 var86 ^= 534565101;
                              case 740706014:
                                 break label88;
                              case 1010725833:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1933549998:
                           }
                        }
                     }

                     int var68;
                     if (var14 == null) {
                        var86 = 67243889 ^ var86;
                        var68 = (byte)(1734841901 ^ var86);
                        var86 = 1830853521 ^ var86;
                     } else {
                        label78:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                              case 9747015:
                                 var86 ^= 1641563784;
                                 break label78;
                              case 796519640:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 905131009:
                                 break;
                              case 1744885745:
                                 break label78;
                           }
                        }

                        var68 = var14.size();
                        var86 = 150655592 ^ var86;
                     }

                     int var32 = var21 + var68;
                     short[] var33 = new short[var32];
                     short[] var81 = var33;
                     byte var34 = (byte)(172428732 ^ var86);
                     int var16 = var34;
                     var86 = 1075947877 ^ var86;

                     label70:
                     while (var16 < var13) {
                        var86 ^= 1008061897;
                        short var69 = var0.write(var12, var16);
                        var81[var16] = var69;
                        var16 += 1987275025 ^ var86;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                              case 92270076:
                                 var86 ^= 1008061897;
                              case 927463677:
                                 continue label70;
                              case 1194520627:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1626719426:
                           }
                        }
                     }

                     var86 = 117931166 ^ var86;
                     if (var14 != null) {
                        var86 = 2141346991 ^ var86;
                        int var82 = var13;
                        Iterator var40 = var14.iterator();
                        Iterator var17 = var40;
                        var86 = 842205768 ^ var86;

                        while (true) {
                           byte var42 = (byte)((var17.hasNext()) ? 1 : 0);
                           if (var42 == (15765152 ^ var86)) {
                              var86 = 458881714 ^ var86;
                              byte var64 = (byte)(464090130 ^ var86);
                              int var74 = var81.length;
                              Arrays.sort(var81, var64, var74);
                              var86 = 1686497356 ^ var86;
                              break;
                           }

                           var86 = 426197023 ^ var86;
                           Object var44 = var17.next();
                           c$b var45 = (c$b)var44;
                           int var63 = var82;
                           var82 += 429379262 ^ var86;
                           int var71 = var45.order();
                           byte var78 = var45.kind();
                           byte var80 = (byte)(429379262 ^ var86);
                           short var72 = c.pack(var71, var78, (var80 != 0));
                           var81[var63] = var72;
                           var86 = 426197023 ^ var86;
                        }
                     } else {
                        var86 = 843924505 ^ var86;
                     }

                     return var81;
                  case 523985537:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1751948680:
               }
            }
         }

         var86 = 2050257721 ^ var86;
         Object var50 = var15.next();
         c$b var51 = (c$b)var50;
         byte var53 = (byte)((var51.contains(var3, var4, var5)) ? 1 : 0);
         if (var53 == (983613529 ^ var86)) {
            var86 = 141458028 ^ var86;
         } else {
            var86 = 1757302515 ^ var86;
            if (var14 == null) {
               var86 = 909711028 ^ var86;
               byte var76 = (byte)(1680316444 ^ var86);
               ArrayList var55 = new ArrayList(var76);
               var14 = var55;
               var86 = 219167809 ^ var86;
            } else {
               label106:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                     case 253453943:
                        var86 ^= 992553717;
                        break label106;
                     case 1201784019:
                        break;
                     case 1402910275:
                        break label106;
                     case 1605201487:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }

            boolean var57 = var14.add(var51);
            var86 = 1543052906 ^ var86;
         }

         var86 = qpddxxhuxbyrlulj(var86, 1918503253);
      }
   }

   private static byte play(byte var0, List<short[]> var1, long[] var2, d var3) {
      int var202 = 1332619658 ^ 168778691 ^ 1329924868;
      var202 = 549679833 ^ var202;
      byte var26 = (byte)((var1.isEmpty()) ? 1 : 0);
      if (var26 != (719784852 ^ var202)) {
         var202 = 1797304496 ^ var202;
         int var138 = m.familyBit(var0);
         byte var179 = (byte)(1103608608 ^ var202);
         int var139 = var138 << var179;
         int var140 = var139 | var0;
         return (byte)var140;
      } else {
         var202 = 2143917655 ^ var202;
         byte var27 = (byte)(1429118403 ^ var202);
         int var8 = var27;
         Iterator var29 = var1.iterator();
         Iterator var9 = var29;
         var202 = 586879689 ^ var202;

         byte var104;
         int var187;
         label234:
         while (true) {
            byte var31 = (byte)((var9.hasNext()) ? 1 : 0);
            if (var31 == (2010484490 ^ var202)) {
               var202 = 1800547454 ^ var202;
               int var45 = var1.size();
               byte var144 = (byte)(478651248 ^ var202);
               if (var45 <= var144) {
                  var202 = 1893390995 ^ var202;
                  byte var145 = (byte)(1818065389 ^ var202);
                  if (var8 <= var145) {
                     var202 = 72561248 ^ var202;
                     byte var47 = (byte)(1745767303 ^ var202);
                     int var184 = var47;
                     int[][][] var48 = PERMUTATIONS;
                     int var147 = var1.size();
                     int[][] var49 = var48[var147];
                     int[][] var186 = var49;
                     int var51 = var49.length;
                     int var189 = var51;
                     byte var52 = (byte)(1745767303 ^ var202);
                     int var193 = var52;
                     var202 = 1060270359 ^ var202;

                     while (var193 < var189) {
                        label241: {
                           var202 = 1019873000 ^ var202;
                           int[] var55 = var186[var193];
                           int[] var195 = var55;
                           if (var3 != null) {
                              var202 = 1064131333 ^ var202;
                              byte var58 = (byte)((fits(var55, var2, var3)) ? 1 : 0);
                              if (var58 == (1419470717 ^ var202)) {
                                 var202 = qpddxxhuxbyrlulj(var202, 1882271048);
                                 break label241;
                              }

                              var202 = 1730001918 ^ var202;
                           } else {
                              var202 = 1483792635 ^ var202;
                           }

                           byte var59 = (byte)(864476291 ^ var202);
                           int var197 = var59;
                           var202 = 1275714685 ^ var202;

                           label224:
                           while (true) {
                              byte var151 = (byte)(2140078335 ^ var202);
                              int var152 = var151 << var8;
                              if (var197 >= var152) {
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var202)) {
                                       case 119893603:
                                          var202 ^= 1529170635;
                                          break label224;
                                       case 538712138:
                                       default:
                                          throw new RuntimeException(new IOException());
                                       case 988561508:
                                          break;
                                       case 2023085260:
                                          break label224;
                                    }
                                 }
                              }

                              var202 = 882275221 ^ var202;
                              byte var15 = var0;
                              byte var62 = (byte)(1259959147 ^ var202);
                              int var16 = var62;
                              int[] var17 = var195;
                              int var65 = var195.length;
                              int var18 = var65;
                              byte var66 = (byte)(1259959147 ^ var202);
                              int var19 = var66;
                              var202 = 1850753306 ^ var202;

                              while (var19 < var18) {
                                 var202 = 881306517 ^ var202;
                                 int var69 = var17[var19];
                                 Object var71 = var1.get(var69);
                                 short[] var72 = (short[])var71;
                                 short[] var21 = var72;
                                 int var74 = var72.length;
                                 int var22 = var74;
                                 byte var75 = (byte)(298752484 ^ var202);
                                 int var23 = var75;
                                 var202 = 195600276 ^ var202;

                                 while (var23 < var22) {
                                    var202 = 754691080 ^ var202;
                                    short var78 = var21[var23];
                                    byte var79 = (byte)(916302457 ^ var202);
                                    byte var25 = var79;
                                    byte var81 = (byte)((c.possible(var78)) ? 1 : 0);
                                    if (var81 != (916302456 ^ var202)) {
                                       var202 = 495777531 ^ var202;
                                       int var158 = var16;
                                       var16 += 722558082 ^ var202;
                                       int var83 = var197 >> var158;
                                       byte var159 = (byte)(722558082 ^ var202);
                                       int var84 = var83 & var159;
                                       byte var142;
                                       if (var84 != (722558083 ^ var202)) {
                                          var202 = 1269611924 ^ var202;
                                          var142 = (byte)(1623056662 ^ var202);
                                          var202 = qpddxxhuxbyrlulj(var202, 1933965554);
                                       } else {
                                          var202 = 918224850 ^ var202;
                                          var142 = (byte)(497787729 ^ var202);
                                          var202 = 240368308 ^ var202;
                                       }

                                       var25 = var142;
                                       var202 = 1535699820 ^ var202;
                                    } else {
                                       var202 = qpddxxhuxbyrlulj(var202, 2129484017);
                                    }

                                    if (var25 == (1215361673 ^ var202)) {
                                       var202 = qpddxxhuxbyrlulj(var202, 2004225771);
                                    } else {
                                       var202 = 351897079 ^ var202;
                                       byte var87 = (byte)((m.isBase(var15)) ? 1 : 0);
                                       if (var87 != (1552512894 ^ var202)) {
                                          var202 = 1559288970 ^ var202;
                                          byte var89 = c.kind(var78);
                                          var15 = var89;
                                          var202 = 1065310102 ^ var202;
                                       } else {
                                          label193:
                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var202)) {
                                                case 55184141:
                                                   var202 ^= 1670351644;
                                                   break label193;
                                                case 434419580:
                                                default:
                                                   throw new RuntimeException(new IOException());
                                                case 1335268648:
                                                   break;
                                                case 1864391077:
                                                   break label193;
                                             }
                                          }
                                       }
                                    }

                                    var23 += 1057422435 ^ var202;
                                    var202 = qpddxxhuxbyrlulj(var202, 627112466);
                                 }

                                 var202 = 424003786 ^ var202;
                                 var19 += 52678331 ^ var202;
                                 var202 = 644545739 ^ var202;
                              }

                              label209:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var202)) {
                                    case 138278131:
                                       var202 ^= 749626154;
                                    case 590575773:
                                       break label209;
                                    case 610209952:
                                       break;
                                    case 719604596:
                                    default:
                                       throw new RuntimeException(new IOException());
                                 }
                              }

                              byte var160 = (byte)(166154586 ^ var202);
                              int var161 = var160 << var15;
                              int var91 = var184 | var161;
                              var184 = var91;
                              var197 += 166154586 ^ var202;

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var202)) {
                                    case 24773259:
                                       break;
                                    case 53486663:
                                       var202 ^= 1986548133;
                                    case 1405554112:
                                       continue label224;
                                    case 1721160523:
                                    default:
                                       throw new RuntimeException(new IOException());
                                 }
                              }
                           }
                        }

                        var193 += 615139892 ^ var202;
                        var202 = qpddxxhuxbyrlulj(var202, 1939239077);
                     }

                     var202 = qpddxxhuxbyrlulj(var202, 2120671644);
                     if (var184 == (693820172 ^ var202)) {
                        var202 = 185232812 ^ var202;
                        Object var7 = null;
                        return play(var0, var1, var2, (d)var7);
                     }

                     var202 = 1417631129 ^ var202;
                     byte var93 = (byte)(2099613333 ^ var202);
                     var187 = var93;
                     byte var94 = (byte)(2099613333 ^ var202);
                     byte var190 = var94;
                     var202 = 1601064790 ^ var202;

                     while (true) {
                        byte var162 = (byte)(575390163 ^ var202);
                        if (var190 >= var162) {
                           label151:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var202)) {
                                 case 41084194:
                                    var202 ^= 929408359;
                                    break label151;
                                 case 320079283:
                                    break;
                                 case 1001990868:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1470525257:
                                    break label151;
                              }
                           }

                           int var97 = Integer.bitCount(var184);
                           byte var163 = (byte)(355361957 ^ var202);
                           if (var97 != var163) {
                              var202 = qpddxxhuxbyrlulj(var202, 436826869);
                              var104 = (byte)(254219870 ^ var202);
                              var202 = 2107157323 ^ var202;
                              break label234;
                           }

                           var202 = 1306844774 ^ var202;
                           int var103 = Integer.numberOfTrailingZeros(var184);
                           var104 = (byte)var103;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var202)) {
                                 case 201888029:
                                    var202 ^= 712312792;
                                 case 232584333:
                                    break label234;
                                 case 1609548885:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1756473044:
                              }
                           }
                        }

                        var202 = 1310283599 ^ var202;
                        int var106 = var184 >> var190;
                        byte var167 = (byte)(1817351821 ^ var202);
                        int var107 = var106 & var167;
                        if (var107 != (1817351820 ^ var202)) {
                           var202 = 1693921862 ^ var202;
                           int var169 = m.familyBit(var190);
                           int var109 = var187 | var169;
                           var187 = var109;
                           var202 = 1069596043 ^ var202;
                        } else {
                           var202 = qpddxxhuxbyrlulj(var202, 1530367949);
                        }

                        byte var170 = (byte)(929372480 ^ var202);
                        int var111 = var190 + var170;
                        byte var112 = (byte)var111;
                        var190 = var112;
                        var202 = 355391618 ^ var202;
                     }
                  }

                  var202 = qpddxxhuxbyrlulj(var202, 192124737);
               } else {
                  var202 = 2074693074 ^ var202;
               }

               int var116 = m.familyBit(var0);
               int var185 = var116;
               Iterator var118 = var1.iterator();
               Iterator var188 = var118;
               var202 = 451501434 ^ var202;

               while (true) {
                  byte var120 = (byte)((var188.hasNext()) ? 1 : 0);
                  if (var120 == (2110239708 ^ var202)) {
                     var202 = qpddxxhuxbyrlulj(var202, 1198165085);
                     byte var172 = (byte)(984432517 ^ var202);
                     int var122 = var185 << var172;
                     byte var173 = (byte)(984432526 ^ var202);
                     int var123 = var122 | var173;
                     return (byte)var123;
                  }

                  var202 = 2094730940 ^ var202;
                  Object var126 = var188.next();
                  short[] var127 = (short[])var126;
                  short[] var194 = var127;
                  int var130 = var127.length;
                  int var196 = var130;
                  byte var131 = (byte)(18660704 ^ var202);
                  int var198 = var131;
                  var202 = 1239869889 ^ var202;

                  while (var198 < var196) {
                     var202 = 428804113 ^ var202;
                     short var134 = var194[var198];
                     byte var177 = c.kind(var134);
                     int var178 = m.familyBit(var177);
                     int var136 = var185 | var178;
                     var185 = var136;
                     var198 += 1366645937 ^ var202;
                     var202 = qpddxxhuxbyrlulj(var202, 428804113);
                  }

                  label111:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var202)) {
                        case 224742157:
                           var202 ^= 2131753874;
                           break label111;
                        case 1284799014:
                           break;
                        case 1644709783:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1743210756:
                           break label111;
                     }
                  }

                  var202 = qpddxxhuxbyrlulj(var202, 1244798191);
               }
            }

            var202 = 466561808 ^ var202;
            Object var33 = var9.next();
            short[] var34 = (short[])var33;
            short[] var11 = var34;
            int var37 = var34.length;
            int var12 = var37;
            byte var38 = (byte)(1813685274 ^ var202);
            int var13 = var38;
            var202 = 1175648807 ^ var202;

            label132:
            while (var13 < var12) {
               var202 = 1086046049 ^ var202;
               short var41 = var11[var13];
               byte var43 = (byte)((c.possible(var41)) ? 1 : 0);
               if (var43 != (1790173532 ^ var202)) {
                  var202 = 1729420116 ^ var202;
                  var8 += 229063177 ^ var202;
                  var202 = 4232969 ^ var202;
               } else {
                  var202 = 1733577821 ^ var202;
               }

               var13 += 233286912 ^ var202;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var202)) {
                     case 183554774:
                        var202 ^= 670036796;
                     case 361260525:
                        continue label132;
                     case 1556376362:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1794955170:
                  }
               }
            }

            var202 = qpddxxhuxbyrlulj(var202, 502439963);
            var202 = 1076850988 ^ var202;
         }

         byte var164 = (byte)(1925168414 ^ var202);
         int var99 = var187 << var164;
         int var100 = var99 | var104;
         return (byte)var100;
      }
   }

   private static boolean fits(int[] var0, long[] var1, d var2) {
      int var33 = 658008844 ^ 327738869 ^ 1329924868;
      var33 = 1395827671 ^ var33;
      byte var3 = (byte)(684140074 ^ var33);
      int var9 = var3;
      var33 = 1313966511 ^ var33;

      label47:
      while (true) {
         int var19 = var0.length;
         if (var9 < var19) {
            var33 = 42891603 ^ var33;
            byte var20 = (byte)(1679349463 ^ var33);
            int var13 = var9 + var20;
            int var10 = var13;
            var33 = 1942675124 ^ var33;

            label35:
            while (true) {
               int var22 = var0.length;
               if (var10 >= var22) {
                  var33 = 2135094361 ^ var33;
                  var9 += 1754332218 ^ var33;
                  var33 = qpddxxhuxbyrlulj(var33, 235295678);
                  continue label47;
               }

               var33 = 1956216973 ^ var33;
               int var26 = var0[var9];
               long var24 = var1[var26];
               int var30 = var0[var10];
               long var28 = var1[var30];
               byte var16 = (byte)((var2.after(var24, var28)) ? 1 : 0);
               if (var16 != (1665894639 ^ var33)) {
                  var33 = 1383034491 ^ var33;
                  return (((byte)(824501908 ^ var33)) != 0);
               }

               var33 = qpddxxhuxbyrlulj(var33, 749326790);
               var10 += 1340234024 ^ var33;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                     case 180798301:
                        var33 ^= 1479561547;
                        continue label35;
                     case 329403923:
                     default:
                        throw new IllegalStateException();
                     case 329576661:
                        break;
                     case 1003135298:
                        continue label35;
                  }
               }
            }
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
               case 49581202:
               default:
                  throw new IllegalStateException();
               case 113480327:
                  var33 ^= 920078883;
                  return (((byte)(1346495911 ^ var33)) != 0);
               case 1135132031:
                  return (((byte)(1346495911 ^ var33)) != 0);
               case 2081312660:
            }
         }
      }
   }

   private static int[][][] permutations(int var0) {
      int var28 = 1307028905 ^ 33961066 ^ 1329924868;
      var28 = 72683408 ^ var28;
      byte var2 = (byte)(82943318 ^ var28);
      int var8 = var0 + var2;
      int[][][] var9 = new int[var8][][];
      int[][][] var5 = var9;
      byte var10 = (byte)(82943319 ^ var28);
      int var6 = var10;
      var28 = 905277626 ^ var28;

      label23:
      while (var6 <= var0) {
         var28 ^= 437863560;
         ArrayList var13 = new ArrayList();
         int[] var15 = new int[var6];
         boolean[] var19 = new boolean[var6];
         byte var3 = (byte)(723364197 ^ var28);
         permute(var15, var19, var3, var13);
         byte var24 = (byte)(723364197 ^ var28);
         int[][] var25 = new int[var24][];
         Object[] var22 = var13.toArray(var25);
         int[][] var23 = (int[][])var22;
         var5[var6] = var23;
         var6 += 723364196 ^ var28;

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
               case 59331374:
                  var28 ^= 437863560;
               case 221278249:
                  continue label23;
               case 251370160:
                  break;
               case 1649041829:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }

      var28 = 41222583 ^ var28;
      return var5;
   }

   private static void permute(int[] var0, boolean[] var1, int var2, List<int[]> var3) {
      int var37 = 533078921 ^ 523557757 ^ 1329924868;
      var37 = 1128534917 ^ var37;
      int var19 = var0.length;
      if (var2 == var19) {
         var37 = 2043308544 ^ var37;
         Object var21 = var0.clone();
         int[] var22 = (int[])var21;
         boolean var10 = var3.add(var22);
         var37 = 1615500440 ^ var37;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
               case 152604177:
                  var37 ^= 1979701082;
               case 1910062458:
                  byte var11 = (byte)(2030843695 ^ var37);
                  int var8 = var11;
                  var37 = 302777346 ^ var37;

                  label37:
                  while (true) {
                     int var24 = var0.length;
                     if (var8 >= var24) {
                        var37 = 2121477568 ^ var37;
                        return;
                     }

                     var37 = 304825005 ^ var37;
                     byte var14 = (byte)((var1[var8]) ? 1 : 0);
                     if (var14 == (2032890240 ^ var37)) {
                        var37 = 207035209 ^ var37;
                        byte var6 = (byte)(1971088072 ^ var37);
                        var1[var8] = (var6 != 0);
                        var0[var2] = var8;
                        byte var7 = (byte)(1971088072 ^ var37);
                        int var32 = var2 + var7;
                        permute(var0, var1, var32, var3);
                        byte var33 = (byte)(1971088073 ^ var37);
                        var1[var8] = (var33 != 0);
                        var37 = 194995153 ^ var37;
                     } else {
                        var37 = qpddxxhuxbyrlulj(var37, 130578584);
                     }

                     var8 += 2128808217 ^ var37;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                           case 98017149:
                              var37 ^= 367213109;
                              continue label37;
                           case 1060892060:
                           default:
                              throw new RuntimeException();
                           case 1770488630:
                              continue label37;
                           case 2131060120:
                        }
                     }
                  }
               case 1105893462:
               default:
                  throw new RuntimeException();
               case 1949756878:
            }
         }
      }
   }

   static {
      int var7 = 535906949 ^ 1782839652 ^ Integer.parseInt("585556500");
      int var4 = new Random(-958765373338041336L).nextInt();
      h5DLTtyaFt = -1781946102 ^ var4;
      var7 = 1234387280 ^ var7;
      byte var0 = (byte)(516362401 ^ var7);
      int[][][] var1 = permutations(var0);
      PERMUTATIONS = var1;
   }

   public static String xqqnywvpiv(byte[] var0, int var1) {
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
         byte[] var27 = yydaqjocjs;
         byte[] var34 = yydaqjocjs;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] uvogfyhiepldstl() {
      return new byte[]{97, 72, 29, 12};
   }

   private static int qpddxxhuxbyrlulj(int var0, int var1) {
      return var1 ^ var0;
   }
}
