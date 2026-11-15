package com.wimpyclient.p;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class g {
   private g() {
   }

   public static int withAlpha(int var0, float var1) {
      int var2 = Math.clamp((long)Math.round(var1 * 255.0F), 0, 255);
      return var2 << 24 | var0 & 16777215;
   }

   public static int lighten(int var0, float var1) {
      float var2 = Math.clamp(var1, 0.0F, 1.0F);
      int var3 = var0 >>> 24 & 0xFF;
      int var4 = var0 >>> 16 & 0xFF;
      int var5 = var0 >>> 8 & 0xFF;
      int var6 = var0 & 0xFF;
      var4 = Math.clamp((long)Math.round(var4 + (255 - var4) * var2), 0, 255);
      var5 = Math.clamp((long)Math.round(var5 + (255 - var5) * var2), 0, 255);
      var6 = Math.clamp((long)Math.round(var6 + (255 - var6) * var2), 0, 255);
      return var3 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   public static int darken(int var0, float var1) {
      float var2 = Math.clamp(1.0F - var1, 0.0F, 1.0F);
      int var3 = var0 >>> 24 & 0xFF;
      int var4 = Math.round((var0 >>> 16 & 0xFF) * var2);
      int var5 = Math.round((var0 >>> 8 & 0xFF) * var2);
      int var6 = Math.round((var0 & 0xFF) * var2);
      return var3 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   public static int lerp(int var0, int var1, float var2) {
      var2 = Math.clamp(var2, 0.0F, 1.0F);
      int var3 = var0 >>> 24 & 0xFF;
      int var4 = var0 >>> 16 & 0xFF;
      int var5 = var0 >>> 8 & 0xFF;
      int var6 = var0 & 0xFF;
      int var7 = var1 >>> 24 & 0xFF;
      int var8 = var1 >>> 16 & 0xFF;
      int var9 = var1 >>> 8 & 0xFF;
      int var10 = var1 & 0xFF;
      int var11 = Math.round(var3 + (var7 - var3) * var2);
      int var12 = Math.round(var4 + (var8 - var4) * var2);
      int var13 = Math.round(var5 + (var9 - var5) * var2);
      int var14 = Math.round(var6 + (var10 - var6) * var2);
      return var11 << 24 | var12 << 16 | var13 << 8 | var14;
   }

   public static int hsvToRgb(float var0, float var1, float var2) {
      float var3 = (var0 % 360.0F + 360.0F) % 360.0F / 60.0F;
      float var4 = Math.clamp(var1, 0.0F, 1.0F);
      float var5 = Math.clamp(var2, 0.0F, 1.0F);
      float var6 = var5 * var4;
      float var7 = var6 * (1.0F - Math.abs(var3 % 2.0F - 1.0F));
      float var8 = var5 - var6;
      float var9;
      float var10;
      float var11;
      if (var3 < 1.0F) {
         var9 = var6;
         var10 = var7;
         var11 = 0.0F;
      } else if (var3 < 2.0F) {
         var9 = var7;
         var10 = var6;
         var11 = 0.0F;
      } else if (var3 < 3.0F) {
         var9 = 0.0F;
         var10 = var6;
         var11 = var7;
      } else if (var3 < 4.0F) {
         var9 = 0.0F;
         var10 = var7;
         var11 = var6;
      } else if (var3 < 5.0F) {
         var9 = var7;
         var10 = 0.0F;
         var11 = var6;
      } else {
         var9 = var6;
         var10 = 0.0F;
         var11 = var7;
      }

      int var12 = Math.clamp((long)Math.round((var9 + var8) * 255.0F), 0, 255);
      int var13 = Math.clamp((long)Math.round((var10 + var8) * 255.0F), 0, 255);
      int var14 = Math.clamp((long)Math.round((var11 + var8) * 255.0F), 0, 255);
      return 0xFF000000 | var12 << 16 | var13 << 8 | var14;
   }

   public static int red(int var0) {
      return var0 >>> 16 & 0xFF;
   }

   public static int green(int var0) {
      return var0 >>> 8 & 0xFF;
   }

   public static int blue(int var0) {
      return var0 & 0xFF;
   }

   public static int alpha(int var0) {
      return var0 >>> 24 & 0xFF;
   }

   public static float[] rgba(int var0) {
      return new float[]{red(var0) / 255.0F, green(var0) / 255.0F, blue(var0) / 255.0F, alpha(var0) / 255.0F};
   }
}
