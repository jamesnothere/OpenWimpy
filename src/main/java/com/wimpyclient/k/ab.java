package com.wimpyclient.k;

import com.wimpyclient.i.ac;
import com.wimpyclient.i.ac$a;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;

@Environment(EnvType.CLIENT)
public final class ab {
   private static final int GLASS = -1072819172;
   private static final int GLASS_EDGE = 1442840575;
   private static final int LABEL = -7694680;
   private static final int TEXT = -722950;
   private static final int PAD_X = 12;
   private static final int PAD_Y = 6;
   private static final int TOP = 8;
   private static final int DOT = 5;

   private ab() {
   }

   public static void render(GuiGraphics var0) {
      ac var1 = ac.INSTANCE;
      Minecraft var2 = Minecraft.getInstance();
      if (var2.level != null) {
         long var3 = var2.level.getGameTime();
         if (var1.shouldRenderHud(var3)) {
            Font var5 = var2.font;
            ac$a var6 = var1.currentWeather();
            String var7 = "WEATHER";
            String var8 = var1.transitionLabel();
            int var9 = var5.width(var7);
            int var10 = var5.width(var8);
            int var11 = Math.max(var9, 11 + var10);
            int var12 = 24 + var11;
            int var13 = 12 + 9 + 2 + 9;
            int var14 = (var0.guiWidth() - var12) / 2;
            byte var15 = 8;
            var0.fill(var14 - 1, var15 - 1, var14 + var12 + 1, var15 + var13 + 1, 1442840575);
            var0.fill(var14, var15, var14 + var12, var15 + var13, -1072819172);
            int var16 = var6.wash & 16777215 | 1426063360;
            var0.fill(var14 + 1, var15 + 1, var14 + var12 - 1, var15 + var13 - 1, var16);
            int var17 = pulseAccent(var6.accent, var3);
            var0.fill(var14 + 1, var15, var14 + var12 - 1, var15 + 1, var17);
            int var18 = var15 + 6;
            var0.drawString(var5, var7, var14 + (var12 - var9) / 2, var18, -7694680, false);
            var18 += 9 + 2;
            int var19 = 11 + var10;
            int var20 = var14 + (var12 - var19) / 2;
            int var21 = var18 + (9 - 5) / 2;
            var0.fill(var20, var21, var20 + 5, var21 + 5, var17);
            var0.fill(var20 + 1, var21 + 1, var20 + 5 - 1, var21 + 2, 1728053247);
            var0.drawString(var5, var8, var20 + 5 + 6, var18, -722950, false);
         }
      }
   }

   private static int pulseAccent(int var0, long var1) {
      float var3 = (float)Math.sin(var1 % 20L * (Math.PI / 10));
      float var4 = 0.72F + 0.28F * (var3 * 0.5F + 0.5F);
      int var5 = var0 >>> 24 & 0xFF;
      int var6 = Math.min(255, (int)((var0 >>> 16 & 0xFF) * var4));
      int var7 = Math.min(255, (int)((var0 >>> 8 & 0xFF) * var4));
      int var8 = Math.min(255, (int)((var0 & 0xFF) * var4));
      return var5 << 24 | var6 << 16 | var7 << 8 | var8;
   }
}
