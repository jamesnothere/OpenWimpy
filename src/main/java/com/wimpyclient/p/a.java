package com.wimpyclient.p;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.FormattedText.StyledContentConsumer;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a {
   private static final String[] SUFFIX;
   private static final String[] DISPLAY;
   private static final int[] POWER;
   private static final Pattern NUMBER;
   private static int f5vCHOlmxRX;
   private transient int kg7Es2bwzv;

   private a() {
super();
      int var4 = 1149419724 ^ 994896957;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 127863004:
               var4 = 937994229 ^ var4;
            case 533399042:
               var4 = 1583092449 ^ 778728880 ^ Integer.parseInt("940633173");
               this.kg7Es2bwzv = 811491710 ^ f5vCHOlmxRX;
               var4 = ttbaeafsqovmihqq(var4, 1744788340);
               return;
            case 471706750:
               break;
            case 1818120586:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public static double parse(String var0) {
      int var87 = 956697979 ^ 1014596997 ^ 1477950616;
      var87 = 26737901 ^ var87;
      if (var0 == null) {
         var87 = 665632978 ^ var87;
         return Double.NaN;
      } else {
         var87 = 1173466079 ^ var87;
         String var12 = var0.trim();
         Locale var2 = Locale.ROOT;
         String var13 = var12.toLowerCase(var2);
         String var53 = bnmlqiknsf(ahhtcvbojmnedxz(), zaegwhxysejkllz(), var87);
         String var3 = bnmlqiknsf(nxukbqklxyqvqpt(), zaegwhxysejkllz(), var87);
         String var14 = var13.replaceAll(var53, var3);
         String var7 = var14;
         var87 = 909594160 ^ var87;

         label129:
         while (true) {
            label133: {
               byte var16 = (byte)((var7.isEmpty()) ? 1 : 0);
               if (var16 == (792276324 ^ var87)) {
                  var87 = 277737145 ^ var87;
                  byte var54 = (byte)(1068811229 ^ var87);
                  char var18 = var7.charAt(var54);
                  byte var55 = (byte)(1068811257 ^ var87);
                  if (var18 == var55) {
                     var87 = ttbaeafsqovmihqq(var87, 588984865);
                     break label133;
                  }

                  var87 = 1536963519 ^ var87;
                  byte var56 = (byte)(1680404578 ^ var87);
                  char var20 = var7.charAt(var56);
                  short var57 = (short)(1680396494 ^ var87);
                  if (var20 == var57) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var87)) {
                           case 34551189:
                              var87 ^= 2022113694;
                              break label133;
                           case 216449771:
                           default:
                              throw new RuntimeException(new IOException());
                           case 507388187:
                              break label133;
                           case 1296193252:
                        }
                     }
                  }

                  var87 = 2016999474 ^ var87;
                  byte var58 = (byte)(470812752 ^ var87);
                  char var22 = var7.charAt(var58);
                  short var59 = (short)(470812915 ^ var87);
                  if (var22 == var59) {
                     var87 = 12581292 ^ var87;
                     break label133;
                  }

                  var87 = 119305304 ^ var87;
               } else {
                  label115:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var87)) {
                        case 167658009:
                           break label115;
                        case 192866504:
                           var87 ^= 875909484;
                           break label115;
                        case 418858849:
                        default:
                           throw new RuntimeException(new IOException());
                        case 608478618:
                     }
                  }
               }

               byte var24 = (byte)((var7.isEmpty()) ? 1 : 0);
               if (var24 != (453803016 ^ var87)) {
                  var87 = 26642895 ^ var87;
                  return Double.NaN;
               }

               label107:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var87)) {
                     case 73935683:
                        var87 ^= 1656623848;
                        break label107;
                     case 942002741:
                        break;
                     case 1532050290:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1720072583:
                        break label107;
                  }
               }

               byte var25 = (byte)(2041736928 ^ var87);
               int var8 = var25;
               var87 = 1243533526 ^ var87;

               while (true) {
                  String[] var60 = SUFFIX;
                  int var61 = var60.length;
                  if (var8 >= var61) {
                     label84:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var87)) {
                           case 69108516:
                              var87 ^= 658271790;
                           case 221765440:
                              break label84;
                           case 224371771:
                              break;
                           case 1183798463:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }

                     try {
                        double var28 = Double.parseDouble(var7);
                        var87 ^= 1512363870;
                        return var28;
                     } catch (NumberFormatException var88) {
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var87)) {
                           case -1534689088:
                              var87 = 778951413 ^ var87;
                              return Double.NaN;
                           default:
                              throw new RuntimeException("Error in hash");
                        }
                     }
                  }

                  var87 = 1671207234 ^ var87;
                  String[] var62 = SUFFIX;
                  String var63 = var62[var8];
                  byte var34 = (byte)((var7.endsWith(var63)) ? 1 : 0);
                  if (var34 != (1345333108 ^ var87)) {
                     var87 = 1531722934 ^ var87;
                     int var36 = var7.length();
                     String[] var64 = SUFFIX;
                     String var65 = var64[var8];
                     int var66 = var65.length();
                     if (var36 > var66) {
                        var87 = 42879003 ^ var87;
                        byte var67 = (byte)(166876121 ^ var87);
                        int var72 = var7.length();
                        String[] var4 = SUFFIX;
                        String var78 = var4[var8];
                        int var79 = var78.length();
                        int var73 = var72 - var79;
                        String var38 = var7.substring(var67, var73);
                        String var9 = var38;
                        var87 = 484310210 ^ var87;

                        try {
                           double var40 = Double.parseDouble(var9);
                           double var74 = 10.0;
                           int[] var80 = POWER;
                           int var81 = var80[var8];
                           double var82 = var81;
                           double var76 = Math.pow(var74, var82);
                           double var42 = var40 * var76;
                           var87 ^= 1281217758;
                           return var42;
                        } catch (NumberFormatException var89) {
                           switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var87)) {
                              case -1451394856:
                                 var87 = ttbaeafsqovmihqq(var87, 1995200075);
                                 return Double.NaN;
                              default:
                                 throw new RuntimeException(new IOException("Error in hash"));
                           }
                        }
                     }

                     var87 = ttbaeafsqovmihqq(var87, 1774103757);
                  } else {
                     label96:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var87)) {
                           case 190651456:
                              var87 ^= 854757499;
                           case 1290048708:
                              break label96;
                           case 1827119148:
                              break;
                           case 1885581851:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }

                  var8 += 1656928014 ^ var87;
                  var87 = 1366165817 ^ var87;
               }
            }

            byte var68 = (byte)(481292797 ^ var87);
            String var50 = var7.substring(var68);
            var7 = var50;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var87)) {
                  case 127203447:
                     var87 ^= 865524888;
                     continue label129;
                  case 1258581513:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1268238481:
                     break;
                  case 1809525063:
                     continue label129;
               }
            }
         }
      }
   }

   public static String shortForm(double var0) {
      int var63 = 1596167476 ^ 544557981 ^ 1477950616;
      var63 = 278393661 ^ var63;
      double var14 = Math.abs(var0);
      double var7 = var14;
      byte var16 = (byte)(936808716 ^ var63);
      int var9 = var16;
      var63 = 2132298665 ^ var63;

      while (true) {
         label50: {
            int[] var4 = POWER;
            int var46 = var4.length;
            if (var9 < var46) {
               var63 = 1775160115 ^ var63;
               double var18 = 10.0;
               int[] var5 = POWER;
               int var49 = var5[var9];
               double var50 = var49;
               double var20 = Math.pow(var18, var50);
               double var69;
               int var24 = (var69 = var7 - var20) == 0.0 ? 0 : (var69 < 0.0 ? -1 : 1);
               if (var24 >= (553652630 ^ var63)) {
                  var63 = 753147788 ^ var63;
                  double var27 = var0 / var20;
                  double var56 = 10.0;
                  double var29 = var27 * var56;
                  long var31 = Math.round(var29);
                  double var33 = var31;
                  double var58 = 10.0;
                  double var35 = var33 / var58;
                  String var39 = trimZero(var35);
                  String[] var47 = DISPLAY;
                  String var48 = var47[var9];
                  return var39 + var48;
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var63)) {
                     case 267387666:
                        var63 ^= 283636113;
                     case 548028627:
                        break label50;
                     case 1345825823:
                     default:
                        throw new RuntimeException();
                     case 1352836809:
                  }
               }
            } else {
               label34:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var63)) {
                     case 219189073:
                        var63 = 1035210620 ^ var63;
                        break label34;
                     case 1361521069:
                        break;
                     case 1590020977:
                        break label34;
                     case 2072584721:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            long var43 = Math.round(var0);
            return Long.toString(var43);
         }

         var9 += 837279750 ^ var63;
         var63 = 2032745122 ^ var63;
      }
   }

   public static String comma(double var0) {
      int var17 = 376487674 ^ 532614500 ^ 1477950616;
      var17 = 231564415 ^ var17;
      Locale var2 = Locale.US;
      String var3 = bnmlqiknsf(fyuvmkmimjxubcl(), zaegwhxysejkllz(), var17);
      byte var4 = (byte)(1544907640 ^ var17);
      Object[] var9 = new Object[var4];
      byte var5 = (byte)(1544907641 ^ var17);
      double var10 = Math.floor(var0);
      long var12 = (long)var10;
      Long var14 = var12;
      var9[var5] = var14;
      return String.format(var2, var3, var9);
   }

   public static String plain(double var0) {
      int var11 = 1832313412 ^ 1237967965 ^ 1477950616;
      var11 = 537798583 ^ var11;
      double var4 = Math.floor(var0);
      long var6 = (long)var4;
      return Long.toString(var6);
   }

   public static String format(double var0, String var2) {
      int var20 = 74598864 ^ 23318922 ^ 1477950616;
      var20 = 1408346580 ^ var20;
      String var3 = bnmlqiknsf(onqlihczqlfmytq(), zaegwhxysejkllz(), var20);
      byte var5 = (byte)((var3.equals(var2)) ? 1 : 0);
      if (var5 != (251104534 ^ var20)) {
         var20 = 1205895989 ^ var20;
         return plain(var0);
      } else {
         var20 = ttbaeafsqovmihqq(var20, 1297520269);
         String var6 = bnmlqiknsf(crjgwemfftotjgr(), zaegwhxysejkllz(), var20);
         byte var7 = (byte)((var6.equals(var2)) ? 1 : 0);
         if (var7 != (1134631835 ^ var20)) {
            var20 = 2077006373 ^ var20;
            return shortForm(var0);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
                  case 50882269:
                     var20 = 944390625 ^ var20;
                  case 1206827271:
                     return comma(var0);
                  case 754939562:
                     break;
                  case 1289118562:
                  default:
                     throw new IllegalStateException();
               }
            }
         }
      }
   }

   private static String trimZero(double var0) {
      int var20 = 437190110 ^ 178410823 ^ 1477950616;
      var20 = 1454393092 ^ var20;
      double var17 = Math.floor(var0);
      double var26;
      int var6 = (var26 = var0 - var17) == 0.0 ? 0 : (var26 < 0.0 ? -1 : 1);
      if (var6 == (504058629 ^ var20)) {
         var20 = 539633121 ^ var20;
         byte var9 = (byte)((Double.isInfinite(var0)) ? 1 : 0);
         if (var9 == (1042380516 ^ var20)) {
            var20 = 1322670479 ^ var20;
            long var12 = (long)var0;
            String var16 = Long.toString(var12);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
                  case 182360872:
                     var20 = 1919066061 ^ var20;
                     return var16;
                  case 1227336946:
                     return var16;
                  case 1367915148:
                  default:
                     throw new RuntimeException();
                  case 1781420860:
               }
            }
         }

         label30:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
               case 140568696:
                  var20 ^= 855076766;
                  break label30;
               case 499294887:
               default:
                  throw new RuntimeException();
               case 1091895398:
                  break;
               case 1352969789:
                  break label30;
            }
         }
      } else {
         var20 = 316492415 ^ var20;
      }

      String var27 = String.valueOf(var0);
      var20 = 239315420 ^ var20;
      return var27;
   }

   public static int[] lastNumberSpan(String var0) {
      int var24 = 1783822457 ^ 603373227 ^ 1477950616;
      var24 = 392749471 ^ var24;
      Pattern var1 = NUMBER;
      Matcher var8 = var1.matcher(var0);
      Matcher var5 = var8;
      byte var9 = (byte)(-115022806 ^ var24);
      int var6 = var9;
      byte var10 = (byte)(-115022806 ^ var24);
      int var7 = var10;
      var24 = 693939924 ^ var24;

      while (true) {
         byte var12 = (byte)((var5.find()) ? 1 : 0);
         if (var12 == (797422849 ^ var24)) {
            var24 = 1009493228 ^ var24;
            int[] var19;
            if (var6 < (330043885 ^ var24)) {
               var24 = 280927067 ^ var24;
               var19 = null;
               var24 = ttbaeafsqovmihqq(var24, 1358037158);
            } else {
               var24 = ttbaeafsqovmihqq(var24, 605117616);
               byte var18 = (byte)(935152991 ^ var24);
               var19 = new int[var18];
               byte var3 = (byte)(935152989 ^ var24);
               var19[var3] = var6;
               byte var20 = (byte)(935152988 ^ var24);
               var19[var20] = var7;
               var24 = 1683867469 ^ var24;
            }

            return var19;
         }

         var24 = 1281712241 ^ var24;
         int var14 = var5.start();
         var6 = var14;
         int var16 = var5.end();
         var7 = var16;
         var24 = 1281712241 ^ var24;
      }
   }

   public static int[] firstNumberSpan(String var0) {
      int var17 = 1348552586 ^ 1458549211 ^ 1477950616;
      var17 = 1842930058 ^ var17;
      Pattern var1 = NUMBER;
      Matcher var6 = var1.matcher(var0);
      byte var8 = (byte)((var6.find()) ? 1 : 0);
      int[] var10;
      if (var8 != (859941699 ^ var17)) {
         var17 = 528981411 ^ var17;
         byte var9 = (byte)(751187682 ^ var17);
         var10 = new int[var9];
         byte var3 = (byte)(751187680 ^ var17);
         int var12 = var6.start();
         var10[var3] = var12;
         byte var11 = (byte)(751187681 ^ var17);
         int var14 = var6.end();
         var10[var11] = var14;
         var17 = ttbaeafsqovmihqq(var17, 1569981092);
      } else {
         var17 = ttbaeafsqovmihqq(var17, 1114110494);
         var10 = null;
         var17 = 7628057 ^ var17;
      }

      return var10;
   }

   public static int[] firstNumberSpanFrom(String var0, int var1) {
      int var27 = 1766901731 ^ 2060026095 ^ 1477950616;
      var27 = 185544323 ^ var27;
      Pattern var2 = NUMBER;
      Matcher var7 = var2.matcher(var0);
      if (var1 > (1082250519 ^ var27)) {
         var27 = 553248906 ^ var27;
         int var17 = var0.length();
         int var16 = Math.min(var1, var17);
         int var19 = var0.length();
         Matcher var10 = var7.region(var16, var19);
         var27 = 1272157219 ^ var27;
      } else {
         var27 = ttbaeafsqovmihqq(var27, 1797946537);
      }

      byte var12 = (byte)((var7.find()) ? 1 : 0);
      if (var12 != (732670398 ^ var27)) {
         var27 = 1999906487 ^ var27;
         byte var13 = (byte)(1553960715 ^ var27);
         int[] var34 = new int[var13];
         byte var20 = (byte)(1553960713 ^ var27);
         int var22 = var7.start();
         var34[var20] = var22;
         byte var21 = (byte)(1553960712 ^ var27);
         int var24 = var7.end();
         var34[var21] = var24;
         var27 = ttbaeafsqovmihqq(var27, 2071721624);
         return var34;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var27)) {
               case 77378379:
                  var27 ^= 2115263452;
               case 55181477:
                  Object var14 = null;
                  var27 = 1918602227 ^ var27;
                  return (int[])var14;
               case 294679311:
               default:
                  throw new RuntimeException();
               case 583615469:
            }
         }
      }
   }

   public static int[] valueSpan(String var0) {
      int var20 = 2024178059 ^ 1127963958 ^ 1477950616;
      var20 = 131883110 ^ var20;
      byte var1 = (byte)(1683357763 ^ var20);
      int var5 = var1;
      var20 = 255918016 ^ var20;

      while (true) {
         int var13 = var0.length();
         if (var5 >= var13) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
                  case 259843099:
                     var20 = 821844214 ^ var20;
                  case 509225617:
                     return null;
                  case 599845835:
                     break;
                  case 2041235553:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }

         var20 = 1228160255 ^ var20;
         char var8 = var0.charAt(var5);
         byte var9 = (byte)((Character.isDigit(var8)) ? 1 : 0);
         if (var9 != (572703612 ^ var20)) {
            var20 = 649442231 ^ var20;
            byte var10 = (byte)(77033673 ^ var20);
            int[] var11 = new int[var10];
            byte var3 = (byte)(77033675 ^ var20);
            var11[var3] = var5;
            byte var15 = (byte)(77033674 ^ var20);
            int var17 = var0.length();
            var11[var15] = var17;
            return var11;
         }

         var20 = 1626616289 ^ var20;
         var5 += 1121383068 ^ var20;
         var20 = 700452126 ^ var20;
      }
   }

   public static Component replaceNumberStyled(Component var0, String var1) {
      int var8 = 1003960687 ^ 544438803 ^ 1477950616;
      var8 = 279790212 ^ var8;
      byte var4 = (byte)(1394523488 ^ var8);
      return spliceStyled(var0, var1, (var4 != 0));
   }

   public static Component replaceValueStyled(Component var0, String var1) {
      int var8 = 1553041257 ^ 1830698957 ^ 1477950616;
      var8 = 91733268 ^ var8;
      byte var4 = (byte)(1827649833 ^ var8);
      return spliceStyled(var0, var1, (var4 != 0));
   }

   public static Component replaceFirstNumberStyled(Component var0, String var1) {
      int var10 = 1892034843 ^ 319004691 ^ 1477950616;
      var10 = 766217039 ^ var10;
      String var6 = plain(var0);
      int[] var7 = firstNumberSpan(var6);
      return spliceSpan(var0, var1, var7);
   }

   public static Component replaceNearKeys(Component var0, String[] var1, String var2, boolean var3) {
      int var65 = 377303289 ^ 1335033378 ^ 1477950616;
      var65 = 206976668 ^ var65;
      if (var0 != null) {
         var65 = 1112284720 ^ var65;
         if (var2 == null) {
            var65 = 1080997013 ^ var65;
            return var0;
         } else {
            var65 = ttbaeafsqovmihqq(var65, 2069817578);
            String var18 = plain(var0);
            Locale var5 = Locale.ROOT;
            String var20 = var18.toLowerCase(var5);
            String var8 = var20;
            byte var21 = (byte)(-884781574 ^ var65);
            int var9 = var21;
            byte var22 = (byte)(884781573 ^ var65);
            int var10 = var22;
            String[] var11 = var1;
            int var25 = var1.length;
            int var12 = var25;
            byte var26 = (byte)(884781573 ^ var65);
            int var13 = var26;
            var65 = 856102713 ^ var65;

            label90:
            while (var13 < var12) {
               var65 = 497179999 ^ var65;
               String var29 = var11[var13];
               int var31 = var8.indexOf(var29);
               if (var31 < (437909603 ^ var65)) {
                  var65 = 2087520232 ^ var65;
               } else {
                  label110: {
                     var65 = 1281188255 ^ var65;
                     if (var9 >= (1447336444 ^ var65)) {
                        var65 = 1419760646 ^ var65;
                        if (var31 >= var9) {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                                 case 44932033:
                                    var65 ^= 1689236081;
                                 case 545467748:
                                    break label110;
                                 case 876021355:
                                    break;
                                 case 1139853709:
                                 default:
                                    throw new RuntimeException();
                              }
                           }
                        }

                        var65 = 1458573333 ^ var65;
                     } else {
                        var65 = ttbaeafsqovmihqq(var65, 40879123);
                     }

                     var9 = var31;
                     int var37 = var29.length();
                     var10 = var37;
                     var65 = 845128292 ^ var65;
                  }
               }

               var13 += 1718943626 ^ var65;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                     case 109234537:
                        var65 ^= 1640979127;
                     case 855053196:
                        continue label90;
                     case 1079448080:
                     default:
                        throw new RuntimeException();
                     case 1564077906:
                  }
               }
            }

            label59:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                  case 121630035:
                     var65 ^= 1385308171;
                  case 475895014:
                     break label59;
                  case 524764322:
                     break;
                  case 1541437745:
                  default:
                     throw new RuntimeException();
               }
            }

            Object var38 = null;
            int[] var62 = (int[])var38;
            if (var9 < (1428784439 ^ var65)) {
               var65 = 837974874 ^ var65;
               if (var3 != ((1692139117 ^ var65) != 0)) {
                  var65 = 1167213171 ^ var65;
                  int[] var42 = firstNumberSpan(var18);
                  var62 = var42;
                  var65 = 1303550360 ^ var65;
               } else {
                  var65 = 136371179 ^ var65;
               }

               return spliceSpan(var0, var2, var62);
            } else {
               var65 = 32221941 ^ var65;
               int var58 = var9 + var10;
               int[] var46 = firstNumberSpanFrom(var18, var58);
               if (var46 == null) {
                  var65 = 1999373147 ^ var65;
                  byte var59 = (byte)(602811545 ^ var65);
                  String var49 = var18.substring(var59, var9);
                  int[] var50 = firstNumberSpan(var49);
                  var65 = 1326778655 ^ var65;
                  return spliceSpan(var0, var2, var50);
               } else {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                        case 70805573:
                           var65 = 943262276 ^ var65;
                           return spliceSpan(var0, var2, var46);
                        case 828532742:
                           break;
                        case 1026143663:
                        default:
                           throw new RuntimeException();
                        case 1256448748:
                           return spliceSpan(var0, var2, var46);
                     }
                  }
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
               case 176269534:
                  var65 = 35826341 ^ var65;
                  return var0;
               case 747464260:
                  break;
               case 1800703807:
                  return var0;
               case 2143616951:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private static String plain(Component var0) {
      int var12 = 245520423 ^ 785383314 ^ 1477950616;
      var12 = 2082928936 ^ var12;
      StringBuilder var1 = new StringBuilder();
      StyledContentConsumer var9 = (var1x, var2x) -> {
         int var9x = 475938604 ^ 635842115 ^ 1477950616;
         var9x = 1673546061 ^ var9x;
         StringBuilder var5x = var1.append(var2x);
         return Optional.empty();
      };
      Style var2 = Style.EMPTY;
      Optional var5 = var0.visit(var9, var2);
      return var1.toString();
   }

   private static Component spliceStyled(Component var0, String var1, boolean var2) {
      int var42 = 1854998242 ^ 25293984 ^ 1477950616;
      var42 = 1995651263 ^ var42;
      ArrayList var3 = new ArrayList();
      ArrayList var12 = new ArrayList();
      StyledContentConsumer var34 = (var2x, var3x) -> {
         int var13 = 1303742923 ^ 732654128 ^ 1477950616;
         var13 = 868502116 ^ var13;
         boolean var6 = var3.add(var2x);
         boolean var8 = var12.add(var3x);
         return Optional.empty();
      };
      Style var37 = Style.EMPTY;
      Optional var14 = var0.visit(var34, var37);
      StringBuilder var15 = new StringBuilder();
      StringBuilder var9 = var15;
      Iterator var17 = var12.iterator();
      Iterator var10 = var17;
      var42 = 1880515713 ^ var42;

      while (true) {
         byte var19 = (byte)((var10.hasNext()) ? 1 : 0);
         if (var19 == (836899556 ^ var42)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                  case 10892667:
                     var42 ^= 2033158905;
                  case 1058883327:
                     int[] var28;
                     if (var2 != ((1221433373 ^ var42) != 0)) {
                        var42 = 455291427 ^ var42;
                        String var27 = var9.toString();
                        var28 = valueSpan(var27);
                        var42 = 1226213003 ^ var42;
                     } else {
                        var42 = ttbaeafsqovmihqq(var42, 2031579819);
                        String var32 = var9.toString();
                        var28 = lastNumberSpan(var32);
                        var42 = 723699203 ^ var42;
                     }

                     return splice(var3, var12, var28, var1, var0);
                  case 198189645:
                     break;
                  case 628147408:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var42 = 1451067902 ^ var42;
         Object var21 = var10.next();
         String var22 = (String)var21;
         StringBuilder var24 = var9.append(var22);
         var42 = 1451067902 ^ var42;
      }
   }

   private static Component spliceSpan(Component var0, String var1, int[] var2) {
      int var21 = 57691855 ^ 798976590 ^ 1477950616;
      var21 = 854943032 ^ var21;
      ArrayList var3 = new ArrayList();
      ArrayList var9 = new ArrayList();
      StyledContentConsumer var15 = (var2x, var3x) -> {
         int var13 = 1303742923 ^ 732654128 ^ 1477950616;
         var13 = 868502116 ^ var13;
         boolean var6 = var3.add(var2x);
         boolean var8 = var9.add(var3x);
         return Optional.empty();
      };
      Style var17 = Style.EMPTY;
      Optional var11 = var0.visit(var15, var17);
      return splice(var3, var9, var2, var1, var0);
   }

   private static Component splice(List<Style> var0, List<String> var1, int[] var2, String var3, Component var4) {
      int var91 = 1964633059 ^ 161164485 ^ 1477950616;
      var91 = 1969303059 ^ var91;
      if (var2 == null) {
         var91 = 414521374 ^ var91;
         return var4;
      } else {
         var91 = 966882564 ^ var91;
         byte var6 = (byte)(1750409385 ^ var91);
         int var22 = var2[var6];
         int var10 = var22;
         byte var58 = (byte)(1750409384 ^ var91);
         int var24 = var2[var58];
         int var11 = var24;
         MutableComponent var25 = Component.empty();
         MutableComponent var12 = var25;
         byte var26 = (byte)(1750409385 ^ var91);
         int var13 = var26;
         byte var27 = (byte)(1750409385 ^ var91);
         byte var14 = var27;
         byte var28 = (byte)(1750409385 ^ var91);
         int var15 = var28;
         var91 = 1728691656 ^ var91;

         while (true) {
            int var60 = var1.size();
            if (var15 >= var60) {
               label58:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var91)) {
                     case 230916023:
                        var91 ^= 1127593327;
                     case 1419682919:
                        break label58;
                     case 1542142642:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1746868778:
                  }
               }

               Object var57;
               if (var14 != (1281959950 ^ var91)) {
                  var91 = 155754798 ^ var91;
                  var57 = var12;
                  var91 = ttbaeafsqovmihqq(var91, 790950760);
               } else {
                  var91 = 2123493564 ^ var91;
                  var57 = var4;
                  var91 = 1493017338 ^ var91;
               }

               return (Component)var57;
            }

            var91 = 1196974906 ^ var91;
            Object var32 = var1.get(var15);
            String var33 = (String)var32;
            Object var35 = var0.get(var15);
            Style var36 = (Style)var35;
            int var64 = var33.length();
            int var38 = var13 + var64;
            int var40 = Math.min(var38, var10);
            if (var40 > var13) {
               var91 = 333090972 ^ var91;
               byte var7 = (byte)(1541304007 ^ var91);
               int var87 = var40 - var13;
               String var68 = var33.substring(var7, var87);
               MutableComponent var69 = Component.literal(var68);
               MutableComponent var70 = var69.setStyle(var36);
               MutableComponent var43 = var12.append(var70);
               var91 = 259622937 ^ var91;
            } else {
               label49:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var91)) {
                     case 193586388:
                        var91 ^= 480450693;
                        break label49;
                     case 372022093:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1647550920:
                        break;
                     case 1995403168:
                        break label49;
                  }
               }
            }

            if (var14 == (1420289758 ^ var91)) {
               var91 = 241743506 ^ var91;
               if (var10 >= var13) {
                  var91 = 1976727991 ^ var91;
                  if (var10 < var38) {
                     var91 = 470912057 ^ var91;
                     MutableComponent var74 = Component.literal(var3);
                     MutableComponent var75 = var74.setStyle(var36);
                     MutableComponent var48 = var12.append(var75);
                     byte var49 = (byte)(856466883 ^ var91);
                     var14 = var49;
                     var91 = 1612850186 ^ var91;
                  } else {
                     var91 = 2083760179 ^ var91;
                  }
               } else {
                  var91 = 165794180 ^ var91;
               }
            } else {
               var91 = 126445334 ^ var91;
            }

            int var51 = Math.max(var13, var11);
            if (var38 > var51) {
               var91 = 701033107 ^ var91;
               int var85 = var51 - var13;
               String var79 = var33.substring(var85);
               MutableComponent var80 = Component.literal(var79);
               MutableComponent var81 = var80.setStyle(var36);
               MutableComponent var54 = var12.append(var81);
               var91 = 1080428737 ^ var91;
            } else {
               var91 = ttbaeafsqovmihqq(var91, 1773068882);
            }

            var13 = var38;
            var15 += 981492635 ^ var91;
            var91 = ttbaeafsqovmihqq(var91, 903675643);
         }
      }
   }

   static {
      int var49 = 8076693 ^ 328791600 ^ Integer.parseInt("940633173");
      int var46 = new Random(3550177205363339508L).nextInt();
      f5vCHOlmxRX = -1147031371 ^ var46;
      var49 = 1652837699 ^ var49;
      byte var0 = (byte)(1232562869 ^ var49);
      String[] var3 = new String[var0];
      byte var1 = (byte)(1232562867 ^ var49);
      String var2 = bnmlqiknsf(gdxyeipohehfwfd(), zaegwhxysejkllz(), var49);
      var3[var1] = var2;
      byte var10 = (byte)(1232562866 ^ var49);
      String var27 = bnmlqiknsf(cajpheqrwjjvejr(), zaegwhxysejkllz(), var49);
      var3[var10] = var27;
      byte var11 = (byte)(1232562865 ^ var49);
      String var28 = bnmlqiknsf(hfeatxezvsjhsor(), zaegwhxysejkllz(), var49);
      var3[var11] = var28;
      byte var12 = (byte)(1232562864 ^ var49);
      String var29 = bnmlqiknsf(fmmffhbqwptbzda(), zaegwhxysejkllz(), var49);
      var3[var12] = var29;
      byte var13 = (byte)(1232562871 ^ var49);
      String var30 = bnmlqiknsf(qgxfzmfnoomfqos(), zaegwhxysejkllz(), var49);
      var3[var13] = var30;
      byte var14 = (byte)(1232562870 ^ var49);
      String var31 = bnmlqiknsf(mkayykyutmbtqeb(), zaegwhxysejkllz(), var49);
      var3[var14] = var31;
      SUFFIX = var3;
      byte var4 = (byte)(1232562869 ^ var49);
      String[] var5 = new String[var4];
      byte var15 = (byte)(1232562867 ^ var49);
      String var32 = bnmlqiknsf(fkobuixumnnowwv(), zaegwhxysejkllz(), var49);
      var5[var15] = var32;
      byte var16 = (byte)(1232562866 ^ var49);
      String var33 = bnmlqiknsf(qljnyeezvhfvbhp(), zaegwhxysejkllz(), var49);
      var5[var16] = var33;
      byte var17 = (byte)(1232562865 ^ var49);
      String var34 = bnmlqiknsf(tjtknuwjzxnfdfc(), zaegwhxysejkllz(), var49);
      var5[var17] = var34;
      byte var18 = (byte)(1232562864 ^ var49);
      String var35 = bnmlqiknsf(jdqilirabfzodhc(), zaegwhxysejkllz(), var49);
      var5[var18] = var35;
      byte var19 = (byte)(1232562871 ^ var49);
      String var36 = bnmlqiknsf(tupyqmyfhqsduxy(), zaegwhxysejkllz(), var49);
      var5[var19] = var36;
      byte var20 = (byte)(1232562870 ^ var49);
      String var37 = bnmlqiknsf(opgccbtlvfudszz(), zaegwhxysejkllz(), var49);
      var5[var20] = var37;
      DISPLAY = var5;
      byte var6 = (byte)(1232562869 ^ var49);
      int[] var7 = new int[var6];
      byte var21 = (byte)(1232562867 ^ var49);
      byte var38 = (byte)(1232562849 ^ var49);
      var7[var21] = var38;
      byte var22 = (byte)(1232562866 ^ var49);
      byte var39 = (byte)(1232562876 ^ var49);
      var7[var22] = var39;
      byte var23 = (byte)(1232562865 ^ var49);
      byte var40 = (byte)(1232562879 ^ var49);
      var7[var23] = var40;
      byte var24 = (byte)(1232562864 ^ var49);
      byte var41 = (byte)(1232562874 ^ var49);
      var7[var24] = var41;
      byte var25 = (byte)(1232562871 ^ var49);
      byte var42 = (byte)(1232562869 ^ var49);
      var7[var25] = var42;
      byte var26 = (byte)(1232562870 ^ var49);
      byte var43 = (byte)(1232562864 ^ var49);
      var7[var26] = var43;
      POWER = var7;
      String var8 = bnmlqiknsf(tcikuprufseygku(), zaegwhxysejkllz(), var49);
      Pattern var9 = Pattern.compile(var8);
      NUMBER = var9;
   }

   public static String bnmlqiknsf(byte[] var0, byte[] var1, int var2) {
      String var9 = Integer.toString(var2);
      byte[] var10 = var9.getBytes();
      byte[] var7 = var10;
      byte var11 = 0;
      int var8 = var11;

      while (true) {
         int var16 = var0.length;
         if (var8 >= var16) {
            Charset var30 = StandardCharsets.UTF_16;
            return new String(var0, var30);
         }

         byte var19 = var0[var8];
         int var34 = var7.length;
         int var31 = var8 % var34;
         byte var27 = var7[var31];
         int var20 = var19 ^ var27;
         byte var21 = (byte)var20;
         var0[var8] = var21;
         byte var22 = var0[var8];
         int var36 = var1.length;
         int var33 = var8 % var36;
         byte var29 = var1[var33];
         int var23 = var22 ^ var29;
         byte var24 = (byte)var23;
         var0[var8] = var24;
         var8++;
      }
   }

   private static byte[] zaegwhxysejkllz() {
      return new byte[]{
         55,
         35,
         98,
         60,
         63,
         98,
         86,
         79,
         75,
         73,
         110,
         2,
         115,
         102,
         78,
         17,
         86,
         45,
         16,
         114,
         96,
         75,
         43,
         107,
         68,
         32,
         38,
         41,
         47,
         59,
         73,
         40,
         119,
         121,
         75,
         81,
         13,
         20,
         81,
         76,
         72,
         55,
         41,
         55,
         30,
         100,
         33,
         100,
         126,
         15,
         115,
         83,
         72,
         58,
         90,
         6,
         37,
         91,
         47,
         61,
         30,
         71,
         47,
         60,
         52,
         84,
         16,
         93,
         76,
         17,
         25,
         110,
         42,
         73
      };
   }

   private static byte[] gdxyeipohehfwfd() {
      return new byte[]{-8, -18, 81, 127, 10, 32};
   }

   private static byte[] cajpheqrwjjvejr() {
      return new byte[]{-8, -18, 81, 127};
   }

   private static byte[] hfeatxezvsjhsor() {
      return new byte[]{-8, -18, 81, 122};
   }

   private static byte[] fmmffhbqwptbzda() {
      return new byte[]{-8, -18, 81, 108};
   }

   private static byte[] qgxfzmfnoomfqos() {
      return new byte[]{-8, -18, 81, 99};
   }

   private static byte[] mkayykyutmbtqeb() {
      return new byte[]{-8, -18, 81, 101};
   }

   private static byte[] fkobuixumnnowwv() {
      return new byte[]{-8, -18, 81, 95, 10, 0};
   }

   private static byte[] qljnyeezvhfvbhp() {
      return new byte[]{-8, -18, 81, 95};
   }

   private static byte[] tjtknuwjzxnfdfc() {
      return new byte[]{-8, -18, 81, 90};
   }

   private static byte[] jdqilirabfzodhc() {
      return new byte[]{-8, -18, 81, 76};
   }

   private static byte[] tupyqmyfhqsduxy() {
      return new byte[]{-8, -18, 81, 67};
   }

   private static byte[] opgccbtlvfudszz() {
      return new byte[]{-8, -18, 81, 101};
   }

   private static byte[] tcikuprufseygku() {
      return new byte[]{
         -8,
         -18,
         81,
         82,
         10,
         48,
         100,
         44,
         125,
         34,
         95,
         84,
         64,
         122,
         123,
         11,
         100,
         72,
         38,
         111,
         81,
         81,
         24,
         102,
         113,
         44,
         20,
         77,
         25,
         127,
         120,
         37,
         68,
         99,
         126,
         88,
         63,
         22,
         103,
         32,
         121,
         116,
         26,
         84,
         43,
         15,
         19,
         7,
         72,
         76,
         66,
         53,
         123,
         85,
         111,
         76,
         23,
         56,
         25,
         97,
         47,
         62,
         28,
         99,
         1,
         47,
         34,
         7,
         122,
         100,
         40,
         40,
         25,
         47,
         2,
         100,
         80,
         85,
         9,
         8,
         103,
         84,
         120,
         82,
         91,
         11
      };
   }

   private static byte[] ahhtcvbojmnedxz() {
      return new byte[]{-3, -18, 82, 84, 8, 125, 101, 32, 121, 14, 92, 109, 64, 12};
   }

   private static byte[] nxukbqklxyqvqpt() {
      return new byte[0];
   }

   private static byte[] fyuvmkmimjxubcl() {
      return new byte[]{-8, -23, 86, 45, 6, 126, 97, 29};
   }

   private static byte[] crjgwemfftotjgr() {
      return new byte[]{-8, -19, 81, 91, 9, 57, 103, 24, 120, 14, 95, 71};
   }

   private static byte[] onqlihczqlfmytq() {
      return new byte[]{-5, -23, 83, 93, 15, 58, 99, 29, 127, 18, 91, 93};
   }

   private static int ttbaeafsqovmihqq(int var0, int var1) {
      return var1 ^ var0;
   }
}
