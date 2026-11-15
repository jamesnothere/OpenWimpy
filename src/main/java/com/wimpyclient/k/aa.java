package com.wimpyclient.k;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3fc;

@Environment(EnvType.CLIENT)
public final class aa {
   private static final int MAX_LABELS = 128;

   private aa() {
   }

   public static void render(GuiGraphics var0) {
      com.wimpyclient.i.x var1 = com.wimpyclient.i.x.INSTANCE;
      boolean var2 = var1.isPrimeSusFinderEnabled() && var1.primeSusLikelihoodText;
      if (var2) {
         Minecraft var3 = Minecraft.getInstance();
         if (var3.level != null && var3.player != null && var3.gameRenderer != null) {
            Camera var4 = var3.gameRenderer.getMainCamera();
            Vec3 var5 = var4.position();
            Vector3fc var6 = var4.forwardVector();
            int var7 = var3.getWindow().getGuiScaledWidth();
            int var8 = var3.getWindow().getGuiScaledHeight();
            Font var9 = var3.font;
            int var10 = 0;
            if (var2) {
               double var11 = var1.primeSusRenderY + 0.6;

               for (com.wimpyclient.e.i var14 : com.wimpyclient.e.a.INSTANCE.primeSusMarkSnapshot()) {
                  if (var10 >= 128) {
                     return;
                  }

                  ChunkPos var15 = var14.chunk();
                  double var16 = var15.getMinBlockX() + 8.0;
                  double var18 = var15.getMinBlockZ() + 8.0;
                  if (drawLabel(var0, var3, var5, var6, var7, var8, var9, var16, var11, var18, var14.likelihood())) {
                     var10++;
                  }
               }
            }
         }
      }
   }

   private static boolean drawLabel(
      GuiGraphics var0, Minecraft var1, Vec3 var2, Vector3fc var3, int var4, int var5, Font var6, double var7, double var9, double var11, int var13
   ) {
      float[] var14 = project(var1, var2, var3, var4, var5, var7, var9, var11);
      if (var14 == null) {
         return false;
      } else {
         String var15 = var13 + "%";
         int var16 = colorFor(var13);
         int var17 = var6.width(var15);
         int var18 = Math.round(var14[0]) - var17 / 2;
         int var19 = Math.round(var14[1]) - 5;
         var0.fill(var18 - 2, var19 - 1, var18 + var17 + 2, var19 + 9, -1442840576);
         var0.drawString(var6, var15, var18, var19, var16, false);
         return true;
      }
   }

   private static int colorFor(int var0) {
      if (var0 >= 90) {
         return -43691;
      } else {
         return var0 >= 75 ? -19372 : -8528641;
      }
   }

   private static float[] project(Minecraft var0, Vec3 var1, Vector3fc var2, int var3, int var4, double var5, double var7, double var9) {
      double var11 = var5 - var1.x;
      double var13 = var7 - var1.y;
      double var15 = var9 - var1.z;
      if (var11 * var2.x() + var13 * var2.y() + var15 * var2.z() <= 0.05) {
         return null;
      } else {
         Vec3 var17 = var0.gameRenderer.projectPointToScreen(new Vec3(var5, var7, var9));
         if (!(var17.z > 1.0) && !(var17.z < -1.0)) {
            float var18 = (float)((var17.x + 1.0) * 0.5 * var3);
            float var19 = (float)((1.0 - var17.y) * 0.5 * var4);
            return !(var18 < -80.0F) && !(var19 < -80.0F) && !(var18 > var3 + 80) && !(var19 > var4 + 80) ? new float[]{var18, var19} : null;
         } else {
            return null;
         }
      }
   }
}
