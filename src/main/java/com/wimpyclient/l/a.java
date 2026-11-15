package com.wimpyclient.l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a {
   private float value;
   private float target;
   private float speed;
   private long lastNs;
   private static int kMHTOg4gt5;
   private transient int Okon2poDHt;

   public a(float var1) {
super();
      int var11 = 2019502779 ^ 1460844304;
      
      var11 = 606074544 ^ var11;
      var11 = 1739946757 ^ 889348770 ^ Integer.parseInt("1508209340");
      this.Okon2poDHt = 48828093 ^ kMHTOg4gt5;
      var11 = mfvqfducjuppjxie(var11, 981641650);
      float var3 = 0.001F;
      float var7 = Math.max(var3, var1);
      this.speed = var7;
      long var8 = System.nanoTime();
      this.lastNs = var8;
   }

   public void setSpeed(float var1) {
      int var8 = 171600152 ^ 1657169051 ^ 1031220839;
      var8 = 1657285613 ^ var8;
      float var3 = 0.001F;
      float var5 = Math.max(var3, var1);
      this.speed = var5;
   }

   public void setTarget(float var1) {
      int var9 = 444566623 ^ 299130348 ^ 1031220839;
      var9 = 669228896 ^ var9;
      float var4 = 0.0F;
      float var5 = 1.0F;
      float var6 = Math.clamp(var1, var4, var5);
      this.target = var6;
   }

   public void snap(float var1) {
      int var14 = 405297290 ^ 1414952309 ^ 1031220839;
      var14 = 1680539383 ^ var14;
      float var4 = 0.0F;
      float var5 = 1.0F;
      float var8 = Math.clamp(var1, var4, var5);
      this.value = var8;
      float var10 = this.value;
      this.target = var10;
      long var11 = System.nanoTime();
      this.lastNs = var11;
   }

   public float get() {
      int var5 = 426936546 ^ 1192224698 ^ 1031220839;
      var5 = 485539645 ^ var5;
      return this.value;
   }

   public float target() {
      int var5 = 2107907172 ^ 309409442 ^ 1031220839;
      var5 = 1863510031 ^ var5;
      return this.target;
   }

   public boolean finished() {
      int var9 = 1960546664 ^ 1506526320 ^ 1031220839;
      var9 = 1007755777 ^ var9;
      float var3 = this.value;
      float var6 = this.target;
      float var14;
      int var4 = (var14 = var3 - var6) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
      if (var4 == (745953662 ^ var9)) {
         var9 = 6102458 ^ var9;
         byte var15 = (byte)(741033157 ^ var9);
         var9 = 1460275869 ^ var9;
         return (var15 != 0);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var9)) {
               case 103112978:
                  var9 ^= 1522660829;
               case 893982284:
                  byte var5 = (byte)(1991748771 ^ var9);
                  var9 = 227992314 ^ var9;
                  return (var5 != 0);
               case 491555486:
               default:
                  throw new RuntimeException(new IOException());
               case 1996458761:
            }
         }
      }
   }

   public float eased() {
      int var15 = 791581883 ^ 618120155 ^ 1031220839;
      var15 = 948881505 ^ var15;
      float var6 = this.value;
      float var8 = var6 * var6;
      float var10 = 3.0F;
      float var3 = 2.0F;
      float var12 = var3 * var6;
      float var11 = var10 - var12;
      return var8 * var11;
   }

   public float update() {
      float var11;
      int var77;
      label20: {
         var77 = 437240899 ^ 1948121687 ^ 1031220839;
         var77 = 1936201446 ^ var77;
         long var1 = System.nanoTime();
         long var54 = this.lastNs;
         long var15 = var1 - var54;
         float var17 = (float)var15;
         float var3 = 1.0E9F;
         float var18 = var17 / var3;
         var11 = var18;
         this.lastNs = var1;
         float var38 = 0.0F;
         float var81;
         int var21 = (var81 = var18 - var38) == 0.0F ? 0 : (var81 < 0.0F ? -1 : 1);
         if (var21 > (537724565 ^ var77)) {
            var77 = 752607004 ^ var77;
            float var39 = 0.25F;
            float var82;
            int var23 = (var82 = var18 - var39) == 0.0F ? 0 : (var82 < 0.0F ? -1 : 1);
            if (var23 <= (215406985 ^ var77)) {
               var77 = 1112830251 ^ var77;
               break label20;
            }

            var77 = 85177023 ^ var77;
         } else {
            var77 = 701001123 ^ var77;
         }

         float var24 = 0.016666668F;
         var11 = var24;
         var77 = 1195885460 ^ var77;
      }

      float var25 = 1.0F;
      double var40 = 1.0;
      double var5 = 1.0;
      float var70 = this.speed;
      float var67 = var11 * var70;
      double var68 = var67;
      double var60 = Math.min(var5, var68);
      double var42 = var40 - var60;
      double var62 = 3.0;
      double var44 = Math.pow(var42, var62);
      float var46 = (float)var44;
      float var26 = var25 - var46;
      float var47 = this.value;
      float var57 = this.target;
      float var65 = this.value;
      float var58 = var57 - var65;
      float var59 = var58 * var26;
      float var48 = var47 + var59;
      this.value = var48;
      float var29 = this.target;
      float var50 = this.value;
      float var30 = var29 - var50;
      float var31 = Math.abs(var30);
      float var51 = 0.001F;
      float var83;
      int var32 = (var83 = var31 - var51) == 0.0F ? 0 : (var83 < 0.0F ? -1 : 1);
      if (var32 < (1317185698 ^ var77)) {
         var77 = 1929288277 ^ var77;
         float var53 = this.target;
         this.value = var53;
         var77 = 1584253670 ^ var77;
      } else {
         var77 = mfvqfducjuppjxie(var77, 747851955);
      }

      return this.value;
   }

   static {
      int var3 = new Random(8258301046348525407L).nextInt();
      kMHTOg4gt5 = -1905023083 ^ var3;
   }

   public static String vwyifaataq(byte[] var0, byte[] var1, int var2) {
      String var11 = Integer.toString(var2);
      byte[] var12 = var11.getBytes();
      byte[] var9 = var12;
      byte var13 = 0;
      int var10 = var13;

      while (true) {
         int var18 = var0.length;
         if (var10 >= var18) {
            Charset var6 = StandardCharsets.UTF_16;
            return new String(var0, var6);
         }

         byte var21 = var0[var10];
         int var34 = var9.length;
         int var31 = var10 % var34;
         byte var28 = var9[var31];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var10] = var23;
         byte var24 = var0[var10];
         int var36 = var1.length;
         int var33 = var10 % var36;
         byte var30 = var1[var33];
         int var25 = var24 ^ var30;
         byte var26 = (byte)var25;
         var0[var10] = var26;
         var10++;
      }
   }

   private static byte[] congrgwvwitxwuu() {
      return new byte[]{
         43,
         55,
         100,
         4,
         113,
         126,
         97,
         51,
         2,
         19,
         60,
         71,
         83,
         100,
         83,
         19,
         33,
         101,
         105,
         22,
         104,
         56,
         5,
         117,
         116,
         127,
         39,
         53,
         83,
         106,
         98,
         106,
         96,
         65,
         118,
         64,
         122,
         34,
         84,
         111,
         7,
         91,
         39,
         122,
         115,
         113,
         80,
         6,
         99,
         100,
         22,
         79,
         81,
         2,
         93,
         91,
         15,
         69,
         39,
         18,
         77,
         1,
         113,
         59,
         19,
         88,
         116,
         104,
         32,
         73,
         69,
         81,
         20,
         110,
         13,
         123,
         27,
         7,
         45,
         82,
         23,
         123,
         9,
         85,
         88,
         28,
         76,
         13,
         121,
         125,
         1,
         33,
         4,
         120,
         123,
         90,
         86,
         71,
         61,
         124,
         115,
         45,
         102,
         119,
         96,
         113,
         58,
         81,
         8,
         45,
         50
      };
   }

   private static int mfvqfducjuppjxie(int var0, int var1) {
      return var1 ^ var0;
   }
}
