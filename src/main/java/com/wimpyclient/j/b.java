package com.wimpyclient.j;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b extends f {
   private final IntSupplier redGetter;
   private final IntSupplier greenGetter;
   private final IntSupplier blueGetter;
   private final IntConsumer redSetter;
   private final IntConsumer greenSetter;
   private final IntConsumer blueSetter;
   private float hue;
   private float saturation;
   private float value;
   private boolean hsvReady;
   private boolean pickerOpen;
   private static int NT0dZhOKdE;
   private transient int f9f1kS1Lvlv;
   private static byte[] dsjkqmeduc = zgkwsshixzbppfd();

   public b(String var1, String var2, IntSupplier var3, IntSupplier var4, IntSupplier var5, IntConsumer var6, IntConsumer var7, IntConsumer var8) {
super(var1, var2);
      int var26 = 408247830 ^ 503299663;
      
      var26 = 184455004 ^ var26;
      var26 = 1384912719 ^ 2104507367 ^ Integer.parseInt("547898285");
      this.f9f1kS1Lvlv = 534324629 ^ NT0dZhOKdE;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
            case 156811734:
               break;
            case 229873741:
               var26 = 1339325354 ^ var26;
            case 574985446:
               this.redGetter = var3;
               this.greenGetter = var4;
               this.blueGetter = var5;
               this.redSetter = var6;
               this.greenSetter = var7;
               this.blueSetter = var8;
               return;
            case 1874489487:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public boolean isPickerOpen() {
      int var5 = 530193701 ^ 395054447 ^ 73265249;
      var5 = 1676269221 ^ var5;
      return this.pickerOpen;
   }

   public void setPickerOpen(boolean var1) {
      int var6 = 1711633541 ^ 1982125666 ^ 73265249;
      var6 = 377828810 ^ var6;
      this.pickerOpen = var1;
   }

   public void togglePicker() {
      int var7 = 80470977 ^ 539663281 ^ 73265249;
      var7 = 301353826 ^ var7;
      byte var3 = (byte)((this.pickerOpen) ? 1 : 0);
      byte var4;
      if (var3 == (826983283 ^ var7)) {
         var7 = 937818760 ^ var7;
         var4 = (byte)(112146938 ^ var7);
         var7 = egxodrhaoysdtrmp(var7, 412622752);
      } else {
         var7 = 229581013 ^ var7;
         var4 = (byte)(1021698982 ^ var7);
         var7 = 584238589 ^ var7;
      }

      this.pickerOpen = (var4 != 0);
   }

   public int red() {
      int var7 = 1315331917 ^ 147230203 ^ 73265249;
      var7 = 2086302915 ^ var7;
      IntSupplier var2 = this.redGetter;
      int var3 = var2.getAsInt();
      return clampByte(var3);
   }

   public int green() {
      int var7 = 1352058475 ^ 1660134101 ^ 73265249;
      var7 = 1890913998 ^ var7;
      IntSupplier var2 = this.greenGetter;
      int var3 = var2.getAsInt();
      return clampByte(var3);
   }

   public int blue() {
      int var7 = 497467890 ^ 1820921179 ^ 73265249;
      var7 = 988711636 ^ var7;
      IntSupplier var2 = this.blueGetter;
      int var3 = var2.getAsInt();
      return clampByte(var3);
   }

   public int packedRgb() {
      int var15 = 212772200 ^ 1657750442 ^ 73265249;
      var15 = 1754811230 ^ var15;
      int var4 = this.red();
      byte var2 = (byte)(44326381 ^ var15);
      int var5 = var4 << var2;
      int var9 = this.green();
      byte var3 = (byte)(44326389 ^ var15);
      int var10 = var9 << var3;
      int var6 = var5 | var10;
      int var12 = this.blue();
      return var6 | var12;
   }

   public int argb() {
      int var7 = 838335536 ^ 541753080 ^ 73265249;
      var7 = 1507644200 ^ var7;
      int var1 = -1287872127 ^ var7;
      int var4 = this.packedRgb();
      return var1 | var4;
   }

   public float hue() {
      int var6 = 444144315 ^ 248598791 ^ 73265249;
      var6 = 1766042164 ^ var6;
      this.ensureHsv();
      return this.hue;
   }

   public float saturation() {
      int var6 = 1850324787 ^ 2051107147 ^ 73265249;
      var6 = 1194367489 ^ var6;
      this.ensureHsv();
      return this.saturation;
   }

   public float value() {
      int var6 = 710078112 ^ 1803498829 ^ 73265249;
      var6 = 434845281 ^ var6;
      this.ensureHsv();
      return this.value;
   }

   public void setRgb(int var1, int var2, int var3) {
      int var20 = 49585624 ^ 2071267425 ^ 73265249;
      var20 = 1835428862 ^ var20;
      IntConsumer var6 = this.redSetter;
      int var12 = clampByte(var1);
      var6.accept(var12);
      IntConsumer var8 = this.greenSetter;
      int var14 = clampByte(var2);
      var8.accept(var14);
      IntConsumer var10 = this.blueSetter;
      int var16 = clampByte(var3);
      var10.accept(var16);
      byte var17 = (byte)(280628774 ^ var20);
      this.hsvReady = (var17 != 0);
      com.wimpyclient.d.a.save();
   }

   public void setPackedRgb(int var1) {
      int var18 = 2025919940 ^ 998118561 ^ 73265249;
      var18 = 69030867 ^ var18;
      byte var4 = (byte)(1140826823 ^ var18);
      int var7 = var1 >> var4;
      short var9 = (short)(1140826664 ^ var18);
      int var8 = var7 & var9;
      byte var5 = (byte)(1140826847 ^ var18);
      int var11 = var1 >> var5;
      short var13 = (short)(1140826664 ^ var18);
      int var12 = var11 & var13;
      short var6 = (short)(1140826664 ^ var18);
      int var15 = var1 & var6;
      this.setRgb(var8, var12, var15);
   }

   public void setFromWheel(float var1, float var2) {
      int var16 = 1344103274 ^ 1295453921 ^ 73265249;
      var16 = 2046059519 ^ var16;
      this.ensureHsv();
      float var9 = wrapHue(var1);
      this.hue = var9;
      float var11 = clamp01(var2);
      this.saturation = var11;
      byte var12 = (byte)(1619262996 ^ var16);
      this.hsvReady = (var12 != 0);
      byte var13 = (byte)(1619262997 ^ var16);
      this.applyHsv((var13 != 0));
   }

   public void setValue(float var1) {
      int var12 = 815843310 ^ 2067937611 ^ 73265249;
      var12 = 319487533 ^ var12;
      this.ensureHsv();
      float var7 = clamp01(var1);
      this.value = var7;
      byte var8 = (byte)(1555427560 ^ var12);
      this.hsvReady = (var8 != 0);
      byte var9 = (byte)(1555427561 ^ var12);
      this.applyHsv((var9 != 0));
   }

   public void save() {
      int var3 = 464953781 ^ 824383978 ^ 73265249;
      var3 = 1585385428 ^ var3;
      com.wimpyclient.d.a.save();
   }

   private void applyHsv(boolean var1) {
      int var32 = 356307750 ^ 368340359 ^ 73265249;
      var32 = 1915169696 ^ var32;
      float var6 = this.hue;
      float var15 = this.saturation;
      float var24 = this.value;
      int var7 = hsvToRgb(var6, var15, var24);
      IntConsumer var9 = this.redSetter;
      byte var25 = (byte)(1991402864 ^ var32);
      int var17 = var7 >> var25;
      short var26 = (short)(1991402911 ^ var32);
      int var18 = var17 & var26;
      var9.accept(var18);
      IntConsumer var11 = this.greenSetter;
      byte var27 = (byte)(1991402856 ^ var32);
      int var20 = var7 >> var27;
      short var28 = (short)(1991402911 ^ var32);
      int var21 = var20 & var28;
      var11.accept(var21);
      IntConsumer var13 = this.blueSetter;
      short var29 = (short)(1991402911 ^ var32);
      int var23 = var7 & var29;
      var13.accept(var23);
      if (var1 != ((1991402848 ^ var32) != 0)) {
         var32 = 487945681 ^ var32;
         com.wimpyclient.d.a.save();
         var32 = 2034088716 ^ var32;
      } else {
         var32 = egxodrhaoysdtrmp(var32, 1680395997);
      }
   }

   private void ensureHsv() {
      int var27 = 1742302008 ^ 332405801 ^ 73265249;
      var27 = 982041834 ^ var27;
      byte var5 = (byte)((this.hsvReady) ? 1 : 0);
      if (var5 != (1255949210 ^ var27)) {
         var27 = 1408989762 ^ var27;
      } else {
         var27 = 1300767117 ^ var27;
         int var7 = this.red();
         int var13 = this.green();
         int var21 = this.blue();
         float[] var8 = rgbToHsv(var7, var13, var21);
         byte var22 = (byte)(122970647 ^ var27);
         float var15 = var8[var22];
         this.hue = var15;
         byte var23 = (byte)(122970646 ^ var27);
         float var17 = var8[var23];
         this.saturation = var17;
         byte var24 = (byte)(122970645 ^ var27);
         float var19 = var8[var24];
         this.value = var19;
         byte var20 = (byte)(122970646 ^ var27);
         this.hsvReady = (var20 != 0);
      }
   }

   public static int hsvToRgb(float var0, float var1, float var2) {
      int var101 = 933060728 ^ 1643288357 ^ 461690356;
      var101 = 322071076 ^ var101;
      float var14 = wrapHue(var0);
      float var16 = clamp01(var1);
      float var18 = clamp01(var2);
      float var20 = var18 * var16;
      float var69 = 1.0F;
      float var6 = 6.0F;
      float var86 = var14 * var6;
      float var91 = 2.0F;
      float var87 = var86 % var91;
      float var92 = 1.0F;
      float var88 = var87 - var92;
      float var89 = Math.abs(var88);
      float var70 = var69 - var89;
      float var22 = var20 * var70;
      float var24 = var18 - var20;
      float var72 = 6.0F;
      float var26 = var14 * var72;
      double var27 = var26;
      double var29 = Math.floor(var27);
      int var31 = (int)var29;
      byte var73 = (byte)(1591298187 ^ var101);
      int var32 = var31 % var73;
      float var96;
      float var97;
      float var98;

      labelSW_var101: switch (var32) {
         case 0 -> {
            var96 = var20;
            var97 = var22;
            float var62 = 0.0F;
            var98 = var62;

            while (true) {
               byte var104 = 0;
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var104)) {
                  case 144296472:
                     {
                        var101 = 762488259;
                        break labelSW_var101;
                     }
                  case 173611338:
                     break;
                  case 451951898:
                  default:
                     throw new RuntimeException();
                  case 1524686291:
               }
            }
         }
         case 1 -> {
            label33:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var101)) {
                  case 130327112:
                     var101 ^= 852519537;
                  case 405354726:
                     break label33;
                  case 748999886:
                  default:
                     throw new RuntimeException();
                  case 1351839442:
               }
            }

            var96 = var22;
            var97 = var20;
            float var59 = 0.0F;
            var98 = var59;
            {
               var101 = egxodrhaoysdtrmp(var101, 377450879);
               break labelSW_var101;
            }
         }
         case 2 -> {
            var101 = egxodrhaoysdtrmp(var101, 815632167);
            float var63 = 0.0F;
            var96 = var63;
            var97 = var20;
            var98 = var22;
            {
               var101 = 338859049 ^ var101;
               break labelSW_var101;
            }
         }
         case 3 -> {
            var101 = 1368950833 ^ var101;
            float var34 = 0.0F;
            var96 = var34;
            var97 = var22;
            var98 = var20;
            {
               var101 = egxodrhaoysdtrmp(var101, 1966576447);
               break labelSW_var101;
            }
         }
         case 4 -> {
            label26:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var101)) {
                  case 130327112:
                     var101 ^= 1973849849;
                     break label26;
                  case 939461073:
                  default:
                     throw new RuntimeException();
                  case 1467609875:
                     break;
                  case 1745939039:
                     break label26;
               }
            }

            var96 = var22;
            float var55 = 0.0F;
            var97 = var55;
            var98 = var20;
            {
               var101 = egxodrhaoysdtrmp(var101, 1359582711);
               break labelSW_var101;
            }
         }
         default -> {
            var101 = egxodrhaoysdtrmp(var101, 1227760043);
            var96 = var20;
            float var67 = 0.0F;
            var97 = var67;
            var98 = var22;
            {
               var101 = 1837185701 ^ var101;
               break labelSW_var101;
            }
         }
      }
      float var38 = var96 + var24;
      float var75 = 255.0F;
      float var39 = var38 * var75;
      int var40 = Math.round(var39);
      float var42 = var97 + var24;
      float var77 = 255.0F;
      float var43 = var42 * var77;
      int var44 = Math.round(var43);
      float var46 = var98 + var24;
      float var79 = 255.0F;
      float var47 = var46 * var79;
      int var48 = Math.round(var47);
      int var50 = clampByte(var40);
      byte var80 = (byte)(2054574995 ^ var101);
      int var51 = var50 << var80;
      int var82 = clampByte(var44);
      byte var90 = (byte)(2054574987 ^ var101);
      int var83 = var82 << var90;
      int var52 = var51 | var83;
      int var85 = clampByte(var48);
      return var52 | var85;
   }

   public static float[] rgbToHsv(int var0, int var1, int var2) {
      int var96 = 917473322 ^ 288722175 ^ 461690356;
      var96 = 181776234 ^ var96;
      int var15 = clampByte(var0);
      float var16 = var15;
      float var4 = 255.0F;
      float var17 = var16 / var4;
      int var19 = clampByte(var1);
      float var20 = var19;
      float var63 = 255.0F;
      float var21 = var20 / var63;
      int var23 = clampByte(var2);
      float var24 = var23;
      float var64 = 255.0F;
      float var25 = var24 / var64;
      float var66 = Math.max(var21, var25);
      float var27 = Math.max(var17, var66);
      float var68 = Math.min(var21, var25);
      float var29 = Math.min(var17, var68);
      float var31 = var27 - var29;
      float var70 = 1.0E-5F;
      float var109;
      int var33 = (var109 = var31 - var70) == 0.0F ? 0 : (var109 < 0.0F ? -1 : 1);
      float var13;
      if (var33 <= (919305803 ^ var96)) {
         var96 = 1787246713 ^ var96;
         float var34 = 0.0F;
         var13 = var34;
         var96 = 633379130 ^ var96;
      } else {
         var96 = 1873510645 ^ var96;
         float var110;
         int var48 = (var110 = var27 - var17) == 0.0F ? 0 : (var110 < 0.0F ? -1 : 1);
         if (var48 == (1499528894 ^ var96)) {
            var96 = 428316963 ^ var96;
            float var60 = var21 - var25;
            float var61 = var60 / var31;
            float var86 = 6.0F;
            float var62 = var61 % var86;
            var13 = var62;
            var96 = 963360917 ^ var96;
         } else {
            var96 = 360000133 ^ var96;
            float var111;
            int var50 = (var111 = var27 - var21) == 0.0F ? 0 : (var111 < 0.0F ? -1 : 1);
            if (var50 == (1276499003 ^ var96)) {
               var96 = 363807858 ^ var96;
               float var52 = var25 - var17;
               float var53 = var52 / var31;
               float var80 = 2.0F;
               float var54 = var53 + var80;
               var13 = var54;
               var96 = egxodrhaoysdtrmp(var96, 540430145);
            } else {
               label39:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var96)) {
                     case 57280295:
                        var96 ^= 1241762363;
                     case 533803942:
                        float var56 = var17 - var21;
                        float var57 = var56 / var31;
                        float var83 = 4.0F;
                        float var58 = var57 + var83;
                        var13 = var58;
                        var96 = 2140848392 ^ var96;
                        break label39;
                     case 1013383143:
                     default:
                        throw new IllegalStateException();
                     case 2097335643:
                  }
               }
            }
         }
      }

      float var71 = 6.0F;
      float var36 = var13 / var71;
      float var93 = var36;
      float var72 = 0.0F;
      float var112;
      int var38 = (var112 = var36 - var72) == 0.0F ? 0 : (var112 < 0.0F ? -1 : 1);
      if (var38 < (2039275272 ^ var96)) {
         var96 = 2025770230 ^ var96;
         float var73 = 1.0F;
         float var40 = var36 + var73;
         var93 = var40;
         var96 = 1605271266 ^ var96;
      } else {
         var96 = 655405588 ^ var96;
      }

      float var74 = 1.0E-5F;
      float var113;
      int var42 = (var113 = var27 - var74) == 0.0F ? 0 : (var113 < 0.0F ? -1 : 1);
      float var46;
      if (var42 <= (1587309852 ^ var96)) {
         var96 = 1912538733 ^ var96;
         var46 = 0.0F;
         var96 = 846289240 ^ var96;
      } else {
         var96 = 511336307 ^ var96;
         var46 = var31 / var27;
         var96 = 1576271942 ^ var96;
      }

      byte var43 = (byte)(487731754 ^ var96);
      float[] var44 = new float[var43];
      byte var88 = (byte)(487731753 ^ var96);
      var44[var88] = var93;
      byte var89 = (byte)(487731752 ^ var96);
      var44[var89] = var46;
      byte var90 = (byte)(487731755 ^ var96);
      var44[var90] = var27;
      return var44;
   }

   private static int clampByte(int var0) {
      int var8 = 1852869854 ^ 1922052444 ^ 461690356;
      var8 = 477746120 ^ var8;
      byte var1 = (byte)(454933438 ^ var8);
      short var2 = (short)(454933313 ^ var8);
      int var5 = Math.min(var2, var0);
      return Math.max(var1, var5);
   }

   private static float clamp01(float var0) {
      int var8 = 1115982333 ^ 1877821459 ^ 461690356;
      var8 = 1307830000 ^ var8;
      float var1 = 0.0F;
      float var2 = 1.0F;
      float var5 = Math.min(var2, var0);
      return Math.max(var1, var5);
   }

   private static float wrapHue(float var0) {
      int var14 = 783250308 ^ 9624545 ^ 461690356;
      var14 = 743727388 ^ var14;
      float var2 = 1.0F;
      float var3 = var0 % var2;
      float var9 = 0.0F;
      float var19;
      int var5 = (var19 = var3 - var9) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
      if (var5 < (434969741 ^ var14)) {
         var14 = 1880681877 ^ var14;
         float var10 = 1.0F;
         float var7 = var3 + var10;
         var14 = 288703991 ^ var14;
         return var7;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
               case 37453500:
                  var14 = 1630382178 ^ var14;
                  return var3;
               case 483685250:
                  break;
               case 889059275:
                  return var3;
               case 1734027291:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   static {
      int var3 = new Random(2910030183134803788L).nextInt();
      NT0dZhOKdE = -1300561086 ^ var3;
   }

   public static String ryastuxeux(byte[] var0, int var1) {
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
         byte[] var28 = dsjkqmeduc;
         byte[] var34 = dsjkqmeduc;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] zgkwsshixzbppfd() {
      return new byte[]{88, 123, 117, 60, 9, 32, 93, 10, 31, 42, 13, 1, 124, 9, 35, 42, 106, 71, 97, 16, 104, 72};
   }

   private static int egxodrhaoysdtrmp(int var0, int var1) {
      return var0 ^ var1;
   }
}
