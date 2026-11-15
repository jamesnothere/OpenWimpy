package com.wimpyclient.k;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class s {
   private static final float MARGIN = 8.0F;
   private static final float PAD = 10.0F;
   private static final float HEADER_H = 16.0F;
   private static final float CELL = 18.0F;
   private static final int GRID = 9;
   private static final float GRID_PX = 162.0F;
   private static final float GAP_HEADER = 6.0F;
   private static final float GAP_LEGEND = 7.0F;
   private static final float LEGEND_ROW = 11.0F;
   private static final int LEGEND_COLS = 3;
   private static final float PILL_RESERVE = 56.0F;
   private static final int HEAT_RED_AT = 400;
   private static boolean clearedBadLayout;

   private s() {
   }

   public static void renderNvg(com.wimpyclient.m.b var0, float var1, float var2) {
      com.wimpyclient.i.x var3 = com.wimpyclient.i.x.INSTANCE;
      if (var3.hud.qo() && var3.hudRtpMap) {
         Minecraft var4 = Minecraft.getInstance();
         LocalPlayer var5 = var4.player;
         if (var5 != null && var4.level != null) {
            com.wimpyclient.o.b var6 = com.wimpyclient.o.b.INSTANCE;
            boolean var7 = var3.hudRtpMapLegend;
            int var8 = var7 ? (com.wimpyclient.e.g.TYPE_NAMES.length + 3 - 1) / 3 : 0;
            float var9 = var7 ? var8 * 11.0F : 0.0F;
            float var10 = 182.0F;
            float var11 = 194.0F + (var7 ? 7.0F + var9 : 4.0F) + 10.0F;
            float var12 = k.INSTANCE.scale(k$d.RTP_MAP);
            float var13 = var10 * var12;
            float var14 = var11 * var12;
            float var15 = 8.0F;
            float var16 = var2 - 8.0F - 56.0F - var14;
            if (var16 < 8.0F) {
               var16 = 8.0F;
            }

            if (!clearedBadLayout) {
               clearedBadLayout = true;
               k.INSTANCE.reset(k$d.RTP_MAP);
            }

            float var17 = k.INSTANCE.x(k$d.RTP_MAP, var15);
            float var18 = k.INSTANCE.y(k$d.RTP_MAP, var16);
            if (k.INSTANCE.hasCustom(k$d.RTP_MAP)) {
               k.INSTANCE.reportScaled(k$d.RTP_MAP, var17, var18, var10, var11);
               k.INSTANCE.ensureVisible(k$d.RTP_MAP);
               var17 = k.INSTANCE.x(k$d.RTP_MAP, var15);
               var18 = k.INSTANCE.y(k$d.RTP_MAP, var16);
            }

            k.INSTANCE.reportScaled(k$d.RTP_MAP, var17, var18, var10, var11);
            com.wimpyclient.i.q var19 = com.wimpyclient.i.q.INSTANCE;
            Vec3 var20 = var19.isActive() ? new Vec3(var19.x(), var19.y(), var19.z()) : var5.position();
            float var21 = var19.isActive() && var19.camera() != null ? var19.camera().getYRot() : var5.getYRot();
            int var22 = com.wimpyclient.e.g.regionIdAtWorld(var20.x, var20.z);
            int var23 = com.wimpyclient.e.g.regionTypeAtWorld(var20.x, var20.z);
            boolean var24 = com.wimpyclient.e.g.onMap(var20.x, var20.z);
            float var25 = k.INSTANCE.beginElement(var0, k$d.RTP_MAP, var17, var18);

            try {
               e.glassPanel(var0, var17, var18, var10, var11, 8.0F);
               if (k.INSTANCE.editMode()) {
                  var0.rectOutline(var17, var18, var10, var11, 8.0F, 1.2F, com.wimpyclient.p.g.withAlpha(var6.accentBright(), 0.55F));
               }

               float var26 = var18 + 10.0F + 8.0F;
               var0.textGradient(var17 + 10.0F, var26, 11.0F, var6.accentBright(), var6.accent(), "RTP Map");
               String var27 = var24 ? var22 + " \u00b7 " + com.wimpyclient.e.g.typeName(var23) : "OFF MAP";
               float var28 = var0.textWidth(9.0F, var27);
               var0.text(var17 + var10 - 10.0F - var28, var26, 9.0F, var24 ? var6.accentBright() : var6.textMuted(), var27);
               float var29 = var17 + 10.0F;
               float var30 = var18 + 10.0F + 16.0F + 6.0F;
               drawGrid(var0, var6, var3, var20, var21, var24, var29, var30);
               if (var7) {
                  drawLegend(var0, var6, var23, var29, var30 + 162.0F + 7.0F, 162.0F);
               }
            } finally {
               k.INSTANCE.endElement(var0, var25);
            }
         }
      } else {
         k.INSTANCE.clearReport(k$d.RTP_MAP);
      }
   }

   private static void drawGrid(
      com.wimpyclient.m.b var0, com.wimpyclient.o.b var1, com.wimpyclient.i.x var2, Vec3 var3, float var4, boolean var5, float var6, float var7
   ) {
      float var8 = Mth.clamp(var2.hudRtpMapOpacity / 100.0F, 0.1F, 1.0F);
      int[] var9 = com.wimpyclient.e.f.INSTANCE.snapshotCounts();
      var0.rect(var6, var7, 162.0F, 162.0F, 4.0F, com.wimpyclient.p.g.withAlpha(var1.field(), 0.95F));
      var0.save();
      var0.scissor(var6, var7, 162.0F, 162.0F);
      int var10 = com.wimpyclient.e.g.gridIndex(var3.x);
      int var11 = com.wimpyclient.e.g.gridIndex(var3.z);

      for (int var12 = 0; var12 < 9; var12++) {
         for (int var13 = 0; var13 < 9; var13++) {
            int var14 = com.wimpyclient.e.g.cellIndex(var13, var12);
            int var15 = com.wimpyclient.e.g.regionTypeAt(var14);
            if (var15 >= 0) {
               float var16 = var6 + var13 * 18.0F;
               float var17 = var7 + var12 * 18.0F;
               int var18 = com.wimpyclient.p.g.withAlpha(com.wimpyclient.e.g.typeRgb(var15), var8);
               if (var2.hudRtpMapHeat) {
                  float var19 = heatFromCount(var9[var14]);
                  if (var19 <= 0.001F) {
                     var18 = com.wimpyclient.p.g.withAlpha(com.wimpyclient.p.g.darken(com.wimpyclient.e.g.typeRgb(var15), 0.28F), var8 * 0.85F);
                  } else {
                     var18 = com.wimpyclient.p.g.withAlpha(com.wimpyclient.p.g.lerp(com.wimpyclient.e.g.typeRgb(var15), -14, var19 * 0.42F), var8);
                  }
               }

               var0.rect(var16 + 1.0F, var17 + 1.0F, 16.0F, 16.0F, 2.2F, var18);
               if (var2.hudRtpMapHeat) {
                  float var38 = heatFromCount(var9[var14]);
                  if (var38 > 0.08F) {
                     float var20 = Math.max(1.4F, var38 * 3.2F);
                     var0.rect(
                        var16 + 2.2F, var17 + 18.0F - 2.2F - var20, 13.6F, var20, 1.0F, com.wimpyclient.p.g.withAlpha(var1.accent(), 0.25F + var38 * 0.55F)
                     );
                  }
               }
            }
         }
      }

      if (var2.hudRtpMapGrid) {
         int var21 = com.wimpyclient.p.g.withAlpha(-1, 0.08F);

         for (int var25 = 1; var25 < 9; var25++) {
            float var29 = var25 * 18.0F;
            var0.line(var6 + var29, var7 + 1.0F, var6 + var29, var7 + 162.0F - 1.0F, 1.0F, var21);
            var0.line(var6 + 1.0F, var7 + var29, var6 + 162.0F - 1.0F, var7 + var29, 1.0F, var21);
         }
      }

      if (var5) {
         float var22 = var6 + var10 * 18.0F;
         float var26 = var7 + var11 * 18.0F;
         var0.rectOutline(var22 + 0.6F, var26 + 0.6F, 16.8F, 16.8F, 2.4F, 1.15F, var1.accentBright());
      }

      if (var2.hudRtpMapIds) {
         for (int var23 = 0; var23 < 9; var23++) {
            for (int var27 = 0; var27 < 9; var27++) {
               int var30 = com.wimpyclient.e.g.cellIndex(var27, var23);
               int var32 = com.wimpyclient.e.g.regionIdAt(var30);
               if (var32 >= 0) {
                  String var33 = Integer.toString(var32);
                  float var35 = var33.length() >= 3 ? 6.5F : 7.5F;
                  boolean var37 = var5 && var27 == var10 && var23 == var11;
                  var0.textCentered(
                     var6 + var27 * 18.0F + 9.0F,
                     var7 + var23 * 18.0F + 8.639999F,
                     var35,
                     var37 ? var1.textPrimary() : com.wimpyclient.p.g.withAlpha(var1.textPrimary(), 0.78F),
                     var33
                  );
               }
            }
         }
      }

      if (var5) {
         float var24 = var6 + (float)((var10 + com.wimpyclient.e.g.cellFraction(var3.x)) * 18.0);
         float var28 = var7 + (float)((var11 + com.wimpyclient.e.g.cellFraction(var3.z)) * 18.0);
         double var31 = Math.toRadians(var4 + 180.0);
         float var34 = (float)Math.sin(var31);
         float var36 = (float)(-Math.cos(var31));
         var0.circle(var24, var28, 3.6F, com.wimpyclient.p.g.withAlpha(-16777216, 0.45F));
         var0.line(var24, var28, var24 + var34 * 7.4F, var28 + var36 * 7.4F, 1.8F, var1.accentBright());
         var0.circle(var24, var28, 2.45F, var1.accent());
         var0.circle(var24, var28, 1.15F, var1.textPrimary());
      }

      var0.restore();
      var0.rectOutline(var6, var7, 162.0F, 162.0F, 4.0F, 1.0F, com.wimpyclient.p.g.withAlpha(var1.accent(), 0.32F));
   }

   private static void drawLegend(com.wimpyclient.m.b var0, com.wimpyclient.o.b var1, int var2, float var3, float var4, float var5) {
      float var6 = var5 / 3.0F;

      for (int var7 = 0; var7 < com.wimpyclient.e.g.TYPE_NAMES.length; var7++) {
         int var8 = var7 % 3;
         int var9 = var7 / 3;
         float var10 = var3 + var8 * var6;
         float var11 = var4 + var9 * 11.0F + 5.5F;
         var0.rect(var10, var11 - 2.4F, 6.0F, 6.0F, 1.4F, com.wimpyclient.e.g.typeRgb(var7));
         boolean var12 = var7 == var2;
         var0.text(var10 + 9.0F, var11, 7.0F, var12 ? var1.accentBright() : var1.textMuted(), com.wimpyclient.e.g.typeName(var7));
      }
   }

   private static float heatFromCount(int var0) {
      return var0 <= 0 ? 0.0F : Mth.clamp((float)(Math.log1p(var0) / Math.log1p(400.0)), 0.0F, 1.0F);
   }
}
