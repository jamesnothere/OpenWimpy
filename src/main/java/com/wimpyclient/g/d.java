package com.wimpyclient.g;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class d {
   private static int RUBXxRClHp;
   private transient int wBtC9HxDrP;
   private static byte[] rqswyefjje = yprhnmiysuoulvj();

   private d() {
super();
      int var4 = 1224949515 ^ 1359484454;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 5899509:
               break;
            case 244680652:
               var4 = 1155635891 ^ var4;
            case 1210201687:
               var4 = 1250962043 ^ 462273949 ^ Integer.parseInt("234300536");
               this.wBtC9HxDrP = 1329138643 ^ RUBXxRClHp;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
                     case 67559656:
                        var4 = 1188488455 ^ var4;
                        return;
                     case 1048399120:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1405008056:
                        break;
                     case 2060843507:
                        return;
                  }
               }
            case 938539276:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public static int centerY(int var0, int var1, int var2) {
      int var12 = 247703566 ^ 451325300 ^ 1424249362;
      var12 = 2084111201 ^ var12;
      int var7 = var1 - var2;
      byte var9 = (byte)(1022907403 ^ var12);
      int var8 = var7 / var9;
      return var0 + var8;
   }

   public static int textY(int var0, int var1, Font var2) {
      int var11 = 1944044811 ^ 440145104 ^ 1424249362;
      var11 = 1744118396 ^ var11;
      Object var7 = Objects.requireNonNull(var2);
      byte var8 = (byte)(1525850556 ^ var11);
      return centerY(var0, var1, var8);
   }

   public static void panel(GuiGraphics var0, int var1, int var2, int var3, int var4) {
      int var46 = 2145365268 ^ 1006138805 ^ 1424249362;
      var46 = 1285610533 ^ var46;
      int var5 = e.RADIUS;
      byte var7 = (byte)(1550014103 ^ var46);
      int var17 = var1 + var7;
      byte var8 = (byte)(1550014100 ^ var46);
      int var22 = var2 + var8;
      int var11 = 476272278 ^ var46;
      fillRound(var0, var17, var22, var3, var4, var5, var11);
      int var40 = -1553376634 ^ var46;
      fillRound(var0, var1, var2, var3, var4, var5, var40);
      byte var24 = (byte)(1550014103 ^ var46);
      int var20 = var1 + var24;
      byte var29 = (byte)(1550014103 ^ var46);
      int var26 = var2 + var29;
      byte var33 = (byte)(1550014100 ^ var46);
      int var31 = var3 - var33;
      byte var37 = (byte)(1550014100 ^ var46);
      int var35 = var4 - var37;
      byte var38 = (byte)(1550014100 ^ var46);
      byte var12 = (byte)(1550014103 ^ var46);
      int var42 = var5 - var12;
      int var39 = Math.max(var38, var42);
      int var43 = -1266988364 ^ var46;
      fillRound(var0, var20, var26, var31, var35, var39, var43);
   }

   public static void fillRound(GuiGraphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var73 = 568292263 ^ 1220457261 ^ 1424249362;
      var73 = 712130813 ^ var73;
      if (var3 > (402117221 ^ var73)) {
         var73 = 281448906 ^ var73;
         if (var4 > (120669103 ^ var73)) {
            var73 = 279259714 ^ var73;
            byte var17 = (byte)(395602413 ^ var73);
            int var44 = Math.min(var3, var4);
            byte var52 = (byte)(395602415 ^ var73);
            int var45 = var44 / var52;
            int var35 = Math.min(var5, var45);
            int var18 = Math.max(var17, var35);
            if (var18 <= (395602413 ^ var73)) {
               var73 = 316989851 ^ var73;
               int var54 = var1 + var3;
               int var59 = var2 + var4;
               var0.fill(var1, var2, var54, var59, var6);
            } else {
               var73 = jqexwmeshfuynkuh(var73, 847538315);
               byte var37 = (byte)(621805862 ^ var73);
               if (var3 <= var37) {
                  var73 = 1556324466 ^ var73;
                  byte var38 = (byte)(2043912456 ^ var73);
                  if (var4 <= var38) {
                     var73 = 881422373 ^ var73;
                     Matrix3x2fStack var24 = var0.pose();
                     Matrix3x2fStack var26 = var24.pushMatrix();
                     float var40 = var1;
                     float var48 = var2;
                     Matrix3x2f var28 = var24.translate(var40, var48);
                     float var41 = 0.5F;
                     float var49 = 0.5F;
                     Matrix3x2f var30 = var24.scale(var41, var49);
                     byte var42 = (byte)(1297797425 ^ var73);
                     byte var50 = (byte)(1297797425 ^ var73);
                     byte var60 = (byte)(1297797427 ^ var73);
                     int var56 = var3 * var60;
                     byte var65 = (byte)(1297797427 ^ var73);
                     int var62 = var4 * var65;
                     byte var13 = (byte)(1297797427 ^ var73);
                     int var67 = var18 * var13;
                     fillRoundRaw(var0, var42, var50, var56, var62, var67, var6);
                     Matrix3x2fStack var33 = var24.popMatrix();
                     return;
                  }

                  var73 = 2146787856 ^ var73;
               } else {
                  var73 = 590791266 ^ var73;
               }

               fillRoundRaw(var0, var1, var2, var3, var4, var18, var6);
            }
         } else {
            var73 = 909269789 ^ var73;
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var73)) {
               case 242233428:
                  var73 = 653576919 ^ var73;
                  return;
               case 817618489:
               default:
                  throw new RuntimeException();
               case 1406684665:
                  return;
               case 2129520814:
            }
         }
      }
   }

   public static void fillRoundBorder(GuiGraphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var42 = 805305894 ^ 1950831720 ^ 1424249362;
      var42 = 886607940 ^ var42;
      if (var3 > (998533144 ^ var42)) {
         var42 = 582082605 ^ var42;
         if (var4 > (422938677 ^ var42)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                  case 14134995:
                     var42 ^= 802168196;
                  case 14620246:
                     fillRound(var0, var1, var2, var3, var4, var5, var7);
                     byte var21 = (byte)(921015731 ^ var42);
                     if (var3 <= var21) {
                        var42 = jqexwmeshfuynkuh(var42, 320317453);
                        return;
                     }

                     var42 = 1484708237 ^ var42;
                     byte var22 = (byte)(1855671358 ^ var42);
                     if (var4 > var22) {
                        var42 = 209543725 ^ var42;
                        byte var25 = (byte)(1659252240 ^ var42);
                        int var24 = var1 + var25;
                        byte var28 = (byte)(1659252240 ^ var42);
                        int var27 = var2 + var28;
                        byte var31 = (byte)(1659252243 ^ var42);
                        int var30 = var3 - var31;
                        byte var34 = (byte)(1659252243 ^ var42);
                        int var33 = var4 - var34;
                        byte var35 = (byte)(1659252241 ^ var42);
                        byte var15 = (byte)(1659252240 ^ var42);
                        int var38 = var5 - var15;
                        int var36 = Math.max(var35, var38);
                        fillRound(var0, var24, var27, var30, var33, var36, var6);
                        var42 = 1192498093 ^ var42;
                        return;
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                           case 105680175:
                              var42 = 1265201536 ^ var42;
                              return;
                           case 404514104:
                              return;
                           case 497992119:
                           default:
                              throw new RuntimeException(new IOException());
                           case 946756641:
                        }
                     }
                  case 796889062:
                     break;
                  case 1717559978:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }

         var42 = 1210084709 ^ var42;
      } else {
         var42 = jqexwmeshfuynkuh(var42, 1787923784);
      }
   }

   private static void fillRoundRaw(GuiGraphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var156 = 283622748 ^ 1608736756 ^ 1424249362;
      var156 = 1635726368 ^ var156;
      byte var7 = (byte)(2057274522 ^ var156);
      int var83 = Math.min(var3, var4);
      byte var99 = (byte)(2057274520 ^ var156);
      int var84 = var83 / var99;
      int var55 = Math.min(var5, var84);
      int var22 = Math.max(var7, var55);
      int var13 = var22;
      if (var22 <= (2057274522 ^ var156)) {
         var156 = 1215846656 ^ var156;
         int var101 = var1 + var3;
         int var116 = var2 + var4;
         var0.fill(var1, var2, var101, var116, var6);
      } else {
         var156 = 1482496600 ^ var156;
         int var58 = var1 + var22;
         int var103 = var1 + var3;
         int var104 = var103 - var22;
         int var120 = var2 + var4;
         var0.fill(var58, var2, var104, var120, var6);
         byte var88 = (byte)(583179968 ^ var156);
         int var60 = var22 * var88;
         if (var4 > var60) {
            var156 = 1234931395 ^ var156;
            int var90 = var2 + var22;
            int var107 = var1 + var22;
            int var123 = var2 + var4;
            int var124 = var123 - var22;
            var0.fill(var1, var90, var107, var124, var6);
            int var63 = var1 + var3;
            int var64 = var63 - var22;
            int var94 = var2 + var22;
            int var110 = var1 + var3;
            int var127 = var2 + var4;
            int var128 = var127 - var22;
            var0.fill(var64, var94, var110, var128, var6);
            var156 = 2075788747 ^ var156;
         } else {
            var156 = jqexwmeshfuynkuh(var156, 841059080);
         }

         byte var29 = (byte)(283317706 ^ var156);
         int var14 = var29;
         var156 = 286602619 ^ var156;

         while (var14 < var13) {
            var156 = 1365600041 ^ var156;
            int var32 = cornerIndent(var14, var13);
            int var34 = var1 + var32;
            int var36 = var1 + var13;
            int var38 = var1 + var3;
            int var39 = var38 - var13;
            int var41 = var1 + var3;
            int var42 = var41 - var32;
            int var44 = var2 + var14;
            int var46 = var2 + var4;
            byte var75 = (byte)(1351829401 ^ var156);
            int var47 = var46 - var75;
            int var48 = var47 - var14;
            if (var36 > var34) {
               var156 = 822413893 ^ var156;
               byte var146 = (byte)(1637240284 ^ var156);
               int var130 = var44 + var146;
               var0.fill(var34, var44, var36, var130, var6);
               byte var148 = (byte)(1637240284 ^ var156);
               int var132 = var48 + var148;
               var0.fill(var34, var48, var36, var132, var6);
               var156 = 1904844849 ^ var156;
            } else {
               var156 = 1082960500 ^ var156;
            }

            if (var42 > var39) {
               var156 = 2089784150 ^ var156;
               byte var150 = (byte)(1821408955 ^ var156);
               int var134 = var44 + var150;
               var0.fill(var39, var44, var42, var134, var6);
               byte var152 = (byte)(1821408955 ^ var156);
               int var136 = var48 + var152;
               var0.fill(var39, var48, var42, var136, var6);
               var156 = 1935083382 ^ var156;
            } else {
               var156 = jqexwmeshfuynkuh(var156, 265851936);
            }

            var14 += 533166541 ^ var156;
            var156 = 506550653 ^ var156;
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var156)) {
               case 30850899:
                  var156 = 1976882892 ^ var156;
               case 563441003:
                  return;
               case 429910556:
               default:
                  throw new IllegalStateException();
               case 2004347256:
            }
         }
      }
   }

   private static int cornerIndent(int var0, int var1) {
      int var38 = 364215879 ^ 1855828928 ^ 1424249362;
      var38 = 2073464245 ^ var38;
      float var7 = var1;
      float var18 = var0;
      float var4 = 0.5F;
      float var19 = var18 + var4;
      float var8 = var7 - var19;
      float var10 = var1;
      float var21 = var1;
      float var11 = var10 * var21;
      float var23 = var8 * var8;
      float var12 = var11 - var23;
      float var24 = 0.0F;
      float var42;
      int var14 = (var42 = var12 - var24) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1);
      if (var14 <= (1415189024 ^ var38)) {
         var38 = 2033170509 ^ var38;
         return var1;
      } else {
         var38 = jqexwmeshfuynkuh(var38, 1014233532);
         byte var16 = (byte)(1747577756 ^ var38);
         float var26 = var1;
         double var31 = var12;
         double var33 = Math.sqrt(var31);
         float var35 = (float)var33;
         float var27 = var26 - var35;
         int var28 = Math.round(var27);
         return Math.max(var16, var28);
      }
   }

   public static void hLine(GuiGraphics var0, int var1, int var2, int var3, int var4) {
      int var18 = 1173339228 ^ 1615679249 ^ 1424249362;
      var18 = 367060843 ^ var18;
      if (var3 > (1688618548 ^ var18)) {
         var18 = 1474679116 ^ var18;
         int var12 = var1 + var3;
         byte var10 = (byte)(860067705 ^ var18);
         int var14 = var2 + var10;
         var0.fill(var1, var2, var12, var14, var4);
         var18 = 196293906 ^ var18;
      } else {
         var18 = 1549198430 ^ var18;
      }
   }

   public static void vLine(GuiGraphics var0, int var1, int var2, int var3, int var4) {
      int var18 = 1865234974 ^ 2110609556 ^ 1424249362;
      var18 = 1696864301 ^ var18;
      if (var3 > (589310133 ^ var18)) {
         var18 = 2031345865 ^ var18;
         byte var9 = (byte)(1513343101 ^ var18);
         int var12 = var1 + var9;
         int var14 = var2 + var3;
         var0.fill(var1, var2, var12, var14, var4);
         var18 = 473887451 ^ var18;
      } else {
         var18 = 1697452562 ^ var18;
      }
   }

   public static void drawToggle(GuiGraphics var0, int var1, int var2, boolean var3) {
      int var63 = 299554203 ^ 514154815 ^ 1424249362;
      var63 = 138114769 ^ var63;
      int var4 = e.TOGGLE_W;
      int var18 = e.TOGGLE_H;
      byte var5 = (byte)(1403031653 ^ var63);
      int var20 = var18 / var5;
      int var60;
      if (var3 != ((1403031655 ^ var63) != 0)) {
         var63 = 1247946107 ^ var63;
         var60 = -425954839 ^ var63;
         var63 = jqexwmeshfuynkuh(var63, 87272673);
      } else {
         var63 = jqexwmeshfuynkuh(var63, 1042410074);
         var60 = -1834268155 ^ var63;
         var63 = 1903190976 ^ var63;
      }

      fillRound(var0, var1, var2, var4, var18, var20, var60);
      byte var22 = (byte)(485562879 ^ var63);
      byte var48 = (byte)(485562874 ^ var63);
      int var37 = var18 / var48;
      int var23 = Math.max(var22, var37);
      byte var49 = (byte)(485562879 ^ var63);
      int var39 = var23 * var49;
      int var25 = var18 - var39;
      int var41 = var18 - var25;
      byte var51 = (byte)(485562879 ^ var63);
      int var42 = var41 / var51;
      int var27 = var2 + var42;
      int var34;
      if (var3 != ((485562877 ^ var63) != 0)) {
         var63 = 1469870157 ^ var63;
         int var32 = var1 + var4;
         int var33 = var32 - var25;
         var34 = var33 - var23;
         var63 = 2056187056 ^ var63;
      } else {
         label31:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var63)) {
               case 135478955:
                  var63 ^= 918599182;
               case 1760658031:
                  var34 = var1 + var23;
                  var63 = 466758387 ^ var63;
                  break label31;
               case 433840457:
                  break;
               case 1509497289:
               default:
                  throw new RuntimeException();
            }
         }
      }

      byte var57 = (byte)(836994306 ^ var63);
      int var56 = var25 / var57;
      int var59;
      if (var3 != ((836994304 ^ var63) != 0)) {
         var63 = 1219032718 ^ var63;
         var59 = (byte)(-2034987919 ^ var63);
         var63 = jqexwmeshfuynkuh(var63, 1979514730);
      } else {
         var63 = jqexwmeshfuynkuh(var63, 2082219246);
         var59 = -1306966264 ^ var63;
         var63 = 1095249162 ^ var63;
      }

      fillRound(var0, var34, var27, var25, var25, var56, var59);
   }

   public static void drawCategoryIcon(GuiGraphics var0, int var1, int var2, int var3) {
      int var40 = 1072784587 ^ 873476544 ^ 1424249362;
      var40 = 2094266818 ^ var40;
      int var4 = e.ICON;
      byte var5 = (byte)(601292505 ^ var40);
      int var15 = var4 / var5;
      int var10 = -593154524 ^ var40;
      fillRound(var0, var1, var2, var4, var4, var15, var10);
      byte var17 = (byte)(601292505 ^ var40);
      byte var27 = (byte)(601292511 ^ var40);
      int var23 = var4 - var27;
      int var18 = Math.max(var17, var23);
      byte var24 = (byte)(601292506 ^ var40);
      if (var3 == var24) {
         var40 = 197420656 ^ var40;
         byte var28 = (byte)(672307369 ^ var40);
         int var26 = var1 + var28;
         byte var31 = (byte)(672307369 ^ var40);
         int var30 = var2 + var31;
         byte var36 = (byte)(672307369 ^ var40);
         int var35 = var18 / var36;
         int var37 = -1073052535 ^ var40;
         fillRound(var0, var26, var30, var18, var18, var35, var37);
         var40 = 744835450 ^ var40;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
               case 6267376:
               default:
                  throw new RuntimeException();
               case 91270686:
                  var40 = 664874762 ^ var40;
                  return;
               case 526682725:
                  return;
               case 783791728:
            }
         }
      }
   }

   public static String ellipsize(Font var0, String var1, int var2) {
      int var65 = 210853508 ^ 1205816955 ^ 1424249362;
      var65 = 1942148626 ^ var65;
      StringBuilder var8;
      String var14;
      if (var1 != null) {
         var65 = 1718522098 ^ var65;
         byte var10 = (byte)((var1.isEmpty()) ? 1 : 0);
         if (var10 != (168166413 ^ var65)) {
            var65 = 224409804 ^ var65;
            return dbiubbldrb(oetxupesuxpepzc(), var65);
         }

         var65 = jqexwmeshfuynkuh(var65, 575744352);
         if (var2 <= (676801901 ^ var65)) {
            var65 = 736116632 ^ var65;
            return dbiubbldrb(lgnexyykytsuomn(), var65);
         }

         var65 = 1416577367 ^ var65;
         int var13 = var0.width(var1);
         if (var13 <= var2) {
            var65 = 844573724 ^ var65;
            return var1;
         }

         var65 = jqexwmeshfuynkuh(var65, 533426973);
         var14 = dbiubbldrb(gebschajdxgxbys(), var65);
         int var16 = var0.width(var14);
         int var7 = var16;
         if (var2 <= var16) {
            var65 = 175933523 ^ var65;
            StringBuilder var29 = new StringBuilder(var1);
            StringBuilder var62 = var29;
            var65 = 1444672961 ^ var65;

            label69:
            while (true) {
               int var31 = var62.length();
               byte var52 = (byte)(1066689204 ^ var65);
               if (var31 <= var52) {
                  var65 = 189834276 ^ var65;
                  return var62.toString();
               }

               var65 = 1161641111 ^ var65;
               String var54 = var62.toString();
               int var33 = var0.width(var54);
               if (var33 <= var2) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                        case 229137608:
                           var65 = 1315805363 ^ var65;
                           return var62.toString();
                        case 422755970:
                        default:
                           throw new IllegalStateException();
                        case 763390673:
                           return var62.toString();
                        case 1325535270:
                     }
                  }
               }

               var65 = 1904003670 ^ var65;
               int var57 = var62.length();
               byte var61 = (byte)(198546549 ^ var65);
               int var58 = var57 - var61;
               StringBuilder var35 = var62.deleteCharAt(var58);

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                     case 21119048:
                     default:
                        throw new IllegalStateException();
                     case 116245621:
                        var65 ^= 876738241;
                     case 1326914872:
                        continue label69;
                     case 1906390079:
                  }
               }
            }
         } else {
            label92:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                  case 27750312:
                     var65 ^= 1061908537;
                  case 79781717:
                     break label92;
                  case 1807707607:
                  default:
                     throw new IllegalStateException();
                  case 1965586992:
               }
            }

            StringBuilder var18 = new StringBuilder(var1);
            var8 = var18;
            var65 = 1065415511 ^ var65;

            label84:
            while (true) {
               int var20 = var8.length();
               if (var20 <= (1664654409 ^ var65)) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                        case 4050421:
                           var65 = 1069672932 ^ var65;
                        case 637871800:
                           break label84;
                        case 743924058:
                           break;
                        case 1192024830:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               }

               var65 = 1880194148 ^ var65;
               String var45 = var8.toString();
               int var22 = var0.width(var45);
               int var23 = var22 + var7;
               if (var23 <= var2) {
                  var65 = 1339069824 ^ var65;
                  break;
               }

               var65 = 1084445966 ^ var65;
               int var49 = var8.length();
               byte var59 = (byte)(1401599266 ^ var65);
               int var50 = var49 - var59;
               StringBuilder var25 = var8.deleteCharAt(var50);
               var65 = jqexwmeshfuynkuh(var65, 816982378);
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
               case 8921776:
               default:
                  throw new IllegalStateException();
               case 34262214:
                  var65 ^= 1796122686;
                  return dbiubbldrb(oetxupesuxpepzc(), var65);
               case 177454309:
                  break;
               case 1742242849:
                  return dbiubbldrb(oetxupesuxpepzc(), var65);
            }
         }
      }

      String var27 = String.valueOf(var8);
      return var27 + var14;
   }

   static {
      int var3 = new Random(-2791373012512859096L).nextInt();
      RUBXxRClHp = 1141554197 ^ var3;
   }

   public static String dbiubbldrb(byte[] var0, int var1) {
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
         byte[] var28 = rqswyefjje;
         byte[] var34 = rqswyefjje;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] yprhnmiysuoulvj() {
      return new byte[]{
         72,
         33,
         100,
         72,
         115,
         74,
         75,
         31,
         47,
         10,
         10,
         89,
         38,
         126,
         59,
         112,
         35,
         46,
         83,
         30,
         27,
         9,
         126,
         94,
         94,
         100,
         111,
         54,
         52,
         80,
         89,
         35,
         46,
         32,
         95,
         120,
         90,
         5,
         67,
         111,
         49,
         7,
         30,
         113,
         35,
         59,
         124,
         13,
         126,
         102,
         50,
         64,
         18,
         35,
         111,
         107,
         112,
         55,
         73,
         17,
         42,
         89,
         8,
         90,
         123
      };
   }

   private static byte[] oetxupesuxpepzc() {
      return new byte[0];
   }

   private static byte[] lgnexyykytsuomn() {
      return new byte[0];
   }

   private static byte[] gebschajdxgxbys() {
      return new byte[]{-121, -24, 83, 80, 75, 83, 124, 7};
   }

   private static int jqexwmeshfuynkuh(int var0, int var1) {
      return var0 ^ var1;
   }
}
