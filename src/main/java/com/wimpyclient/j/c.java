package com.wimpyclient.j;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Random;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class c extends f {
   private final double min;
   private final double max;
   private final double step;
   private final DoubleSupplier getter;
   private final DoubleConsumer setter;
   private static int CLUFgmulTg;
   private transient int UCjeOwsjbq;
   private static String fimjnxxaih = ByteBuffer.wrap(hjtawjqlrtjuycv()).asCharBuffer().toString();

   public c(String var1, String var2, double var3, double var5, double var7, DoubleSupplier var9, DoubleConsumer var10) {
super(var1, var2);
      int var34 = 692953899 ^ 37088968;
      
      var34 = 1540486756 ^ var34;
      var34 = 1881228307 ^ 2104105486 ^ Integer.parseInt("2112021914");
      this.UCjeOwsjbq = 1964970234 ^ CLUFgmulTg;

      double var28;
      label29:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
            case 172534780:
               var34 ^= 1954043782;
            case 2029490943:
               this.min = var3;
               this.max = var5;
               double var14 = 0.0;
               double var40;
               int var27 = (var40 = var7 - var14) == 0.0 ? 0 : (var40 < 0.0 ? -1 : 1);
               if (var27 <= 0) {
                  var34 = 862022646 ^ var34;
                  var28 = 0.1;
                  var34 = 1706719694 ^ var34;
                  break label29;
               }

               label26:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
                     case 75811217:
                        var34 ^= 1223221389;
                     case 937368102:
                        break label26;
                     case 1611008211:
                     default:
                        throw new IllegalStateException();
                     case 1677891884:
                  }
               }

               var28 = var7;
               var34 = 506720949 ^ var34;
               break label29;
            case 837097569:
            default:
               throw new IllegalStateException();
            case 1019381094:
         }
      }

      this.step = var28;
      this.getter = var9;
      this.setter = var10;
   }

   public double min() {
      int var5 = 1202914281 ^ 1456014592 ^ 54008342;
      var5 = 466545346 ^ var5;
      return this.min;
   }

   public double max() {
      int var5 = 1834628789 ^ 120846738 ^ 54008342;
      var5 = 715593738 ^ var5;
      return this.max;
   }

   public double step() {
      int var5 = 301210947 ^ 333072184 ^ 54008342;
      var5 = 747656448 ^ var5;
      return this.step;
   }

   public double get() {
      int var6 = 1257257394 ^ 1383785774 ^ 54008342;
      var6 = 20439367 ^ var6;
      DoubleSupplier var2 = this.getter;
      return var2.getAsDouble();
   }

   public void set(double var1) {
      int var10 = 1948797130 ^ 415705919 ^ 54008342;
      var10 = 1595737244 ^ var10;
      double var7 = this.snap(var1);
      this.setLive(var7);
      com.wimpyclient.d.a.save();
   }

   public void setLive(double var1) {
      int var22 = 801857802 ^ 209927806 ^ 54008342;
      var22 = 567105226 ^ var22;
      double var11 = this.min;
      double var17 = this.max;
      double var19 = Math.min(var17, var1);
      double var13 = Math.max(var11, var19);
      DoubleConsumer var16 = this.setter;
      var16.accept(var13);
   }

   public void commit() {
      int var6 = 1015694147 ^ 1596093033 ^ 54008342;
      var6 = 100619312 ^ var6;
      double var3 = this.get();
      this.set(var3);
   }

   private double snap(double var1) {
      int var58 = 1045254195 ^ 2065360481 ^ 54008342;
      var58 = 1430797619 ^ var58;
      double var11 = this.min;
      double var25 = this.max;
      double var27 = Math.min(var25, var1);
      double var13 = Math.max(var11, var27);
      double var16 = this.min;
      double var47 = this.min;
      double var31 = var13 - var47;
      double var50 = this.step;
      double var33 = var31 / var50;
      long var35 = Math.round(var33);
      double var37 = var35;
      double var53 = this.step;
      double var39 = var37 * var53;
      double var18 = var16 + var39;
      double var21 = this.min;
      double var42 = this.max;
      double var44 = Math.min(var42, var18);
      return Math.max(var21, var44);
   }

   public void increment() {
      int var11 = 1737959326 ^ 690951679 ^ 54008342;
      var11 = 1143208681 ^ var11;
      double var4 = this.get();
      double var8 = this.step;
      double var6 = var4 + var8;
      this.set(var6);
   }

   public void decrement() {
      int var11 = 443760569 ^ 17572607 ^ 54008342;
      var11 = 1098805688 ^ var11;
      double var4 = this.get();
      double var8 = this.step;
      double var6 = var4 - var8;
      this.set(var6);
   }

   public String display() {
      int var48 = 1900727958 ^ 1469785384 ^ 54008342;
      var48 = 1914535757 ^ var48;
      double var11 = this.get();
      double var35 = Math.rint(var11);
      double var15 = var11 - var35;
      double var17 = Math.abs(var15);
      double var37 = 1.0E-9;
      double var55;
      int var19 = (var55 = var17 - var37) == 0.0 ? 0 : (var55 < 0.0 ? -1 : 1);
      if (var19 < (1475645157 ^ var48)) {
         var48 = 1976626489 ^ var48;
         double var22 = Math.rint(var11);
         int var24 = (int)var22;
         return Integer.toString(var24);
      } else {
         var48 = 489318999 ^ var48;
         Locale var26 = Locale.ROOT;
         String var2 = jmyfwrzzzs(uvttlyvbxpdltek(), var48);
         byte var39 = (byte)(1256121523 ^ var48);
         Object[] var40 = new Object[var39];
         byte var5 = (byte)(1256121522 ^ var48);
         Double var45 = var11;
         var40[var5] = var45;
         String var27 = String.format(var26, var2, var40);
         String var33 = jmyfwrzzzs(bqldsmvooitmyoe(), var48);
         byte var29 = (byte)((var27.endsWith(var33)) ? 1 : 0);
         if (var29 != (1256121522 ^ var48)) {
            var48 = 579946485 ^ var48;
            byte var34 = (byte)(1750049607 ^ var48);
            int var42 = var27.length();
            byte var44 = (byte)(1750049606 ^ var48);
            int var43 = var42 - var44;
            String var31 = var27.substring(var34, var43);
            var48 = 147574951 ^ var48;
            return var31;
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var48)) {
                  case 17797574:
                     var48 = 710580050 ^ var48;
                     return var27;
                  case 1336956456:
                     break;
                  case 1461196367:
                     return var27;
                  case 1768459755:
                  default:
                     throw new IllegalStateException();
               }
            }
         }
      }
   }

   static {
      int var3 = new Random(5336553899610903419L).nextInt();
      CLUFgmulTg = -762973869 ^ var3;
   }

   public static String jmyfwrzzzs(byte[] var0, int var1) {
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
      String var29 = fimjnxxaih;
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

   private static byte[] uvttlyvbxpdltek() {
      return new byte[]{0, 0, 0, 4, 0, 0, 0, 0};
   }

   private static byte[] bqldsmvooitmyoe() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, 4};
   }

   private static byte[] hjtawjqlrtjuycv() {
      return new byte[]{49, 23, 53, 24, 49, 0, 49, 83, 49, 2};
   }
}
