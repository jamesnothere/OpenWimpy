package com.wimpyclient.k;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class h {
   public static final int ICE = -8466433;
   public static final int ICE_BRIGHT = -4724737;
   public static final int NAVY = -16051680;

   private h() {
   }

   public static boolean master() {
      return com.wimpyclient.i.x.INSTANCE.themeNeonGlow;
   }

   public static boolean uiGlow() {
      return master() && com.wimpyclient.i.x.INSTANCE.themeUiGlow;
   }

   public static boolean uiStarfield() {
      return master() && com.wimpyclient.i.x.INSTANCE.themeUiStarfield;
   }

   public static boolean logoGlow() {
      return master() && com.wimpyclient.i.x.INSTANCE.themeLogoGlow;
   }

   public static boolean itemOutline() {
      return master() && com.wimpyclient.i.x.INSTANCE.themeItemOutline;
   }

   public static boolean itemStarfield() {
      return master() && com.wimpyclient.i.x.INSTANCE.themeItemStarfield && overlayOpacity() > 0.08F;
   }

   public static float glowIntensity() {
      return clamp01((float)com.wimpyclient.i.x.INSTANCE.themeGlowIntensity);
   }

   public static float outlineThickness() {
      return Math.max(0.35F, Math.min(2.5F, (float)com.wimpyclient.i.x.INSTANCE.themeOutlineThickness));
   }

   public static float starDensity() {
      return clamp01((float)com.wimpyclient.i.x.INSTANCE.themeStarDensity);
   }

   public static float starAnimSpeed() {
      return Math.max(0.0F, Math.min(2.5F, (float)com.wimpyclient.i.x.INSTANCE.themeStarAnimSpeed));
   }

   public static float overlayOpacity() {
      return clamp01((float)com.wimpyclient.i.x.INSTANCE.themeOverlayOpacity);
   }

   public static int chrome() {
      return com.wimpyclient.p.g.lerp(-8466433, com.wimpyclient.o.b.INSTANCE.accent(), 0.28F);
   }

   public static int chromeBright() {
      return com.wimpyclient.p.g.lerp(-4724737, com.wimpyclient.o.b.INSTANCE.accentBright(), 0.22F);
   }

   public static int glassTop() {
      return com.wimpyclient.p.g.withAlpha(-15590874, 0.78F);
   }

   public static int glassBottom() {
      return com.wimpyclient.p.g.withAlpha(-16249836, 0.84F);
   }

   public static int bevelHighlight() {
      return com.wimpyclient.p.g.withAlpha(-1, 0.16F + 0.1F * glowIntensity());
   }

   public static int bevelShadow() {
      return com.wimpyclient.p.g.withAlpha(-16777216, 0.28F);
   }

   private static float clamp01(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }
}
