package com.wimpyclient.k;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3fc;

@Environment(EnvType.CLIENT)
public final class v {
   private static final int MAX_LABELS = 48;
   private static final int PANEL = -1441785824;
   private static final int TEXT = -15222;

   private v() {
   }

   public static void render(GuiGraphics var0) {
      com.wimpyclient.i.x var1 = com.wimpyclient.i.x.INSTANCE;
      if (var1.spawnerFinder.qo()) {
         if (!var1.nametags.qo() || !var1.nametagBlocks) {
            Minecraft var2 = Minecraft.getInstance();
            if (var2.level != null && var2.player != null && var2.gameRenderer != null) {
               Camera var3 = var2.gameRenderer.getMainCamera();
               Vec3 var4 = var3.position();
               Vector3fc var5 = var3.forwardVector();
               int var6 = var2.getWindow().getGuiScaledWidth();
               int var7 = var2.getWindow().getGuiScaledHeight();
               Font var8 = var2.font;
               int var9 = 0;

               for (com.wimpyclient.e.h var11 : com.wimpyclient.e.a.INSTANCE.spawnerRenderSnapshot()) {
                  if (var9 >= 48) {
                     break;
                  }

                  BlockPos var12 = var11.pos();
                  float[] var13 = project(var2, var4, var5, var6, var7, var12.getX() + 0.5, var12.getY() + 1.35, var12.getZ() + 0.5);
                  if (var13 != null) {
                     String var14 = var11.typeLabel();
                     int var15 = var8.width(var14);
                     int var16 = Math.round(var13[0]) - var15 / 2;
                     int var17 = Math.round(var13[1]) - 5;
                     var0.fill(var16 - 2, var17 - 1, var16 + var15 + 2, var17 + 9, -1441785824);
                     var0.drawString(var8, var14, var16, var17, -15222, false);
                     var9++;
                  }
               }
            }
         }
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
