package com.wimpyclient.k;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3fc;

@Environment(EnvType.CLIENT)
public final class c {
   private static final int MAX_ICONS = 128;
   private static final int ICON = 16;
   private static final double MAX_DIST_SQ = 25600.0;

   private c() {
   }

   public static void render(GuiGraphics var0) {
      com.wimpyclient.i.x var1 = com.wimpyclient.i.x.INSTANCE;
      if (var1.isPrimeSusFinderEnabled() && var1.primeSusClusterIcons) {
         Minecraft var2 = Minecraft.getInstance();
         if (var2.level != null && var2.player != null && var2.gameRenderer != null) {
            Camera var3 = var2.gameRenderer.getMainCamera();
            Vec3 var4 = var3.position();
            Vector3fc var5 = var3.forwardVector();
            int var6 = var2.getWindow().getGuiScaledWidth();
            int var7 = var2.getWindow().getGuiScaledHeight();
            Font var8 = var2.font;
            ItemStack var9 = new ItemStack(Items.AMETHYST_CLUSTER);
            if (var9.isEmpty()) {
               var9 = new ItemStack(Items.AMETHYST_SHARD);
            }

            int var10 = 0;

            for (com.wimpyclient.e.e var12 : com.wimpyclient.e.a.INSTANCE.geodeHudRenderSnapshot()) {
               if (var10 >= 128) {
                  break;
               }

               BlockPos var13 = var12.pos();
               double var14 = var13.getX() + 0.5;
               double var16 = var13.getY() + 0.75;
               double var18 = var13.getZ() + 0.5;
               double var20 = var14 - var4.x;
               double var22 = var16 - var4.y;
               double var24 = var18 - var4.z;
               if (!(var20 * var20 + var22 * var22 + var24 * var24 > 25600.0)) {
                  float[] var26 = project(var2, var4, var5, var6, var7, var14, var16, var18);
                  if (var26 != null) {
                     int var27 = Math.round(var26[0]) - 8;
                     int var28 = Math.round(var26[1]) - 8;
                     var0.fill(var27 - 2, var28 - 2, var27 + 16 + 2, var28 + 16 + 2, -1441785824);
                     var0.renderItem(var9, var27, var28);
                     var0.renderItemDecorations(var8, var9, var27, var28);
                     String var29 = String.valueOf(var12.grown());
                     int var30 = var8.width(var29);
                     int var31 = var27 + 8 - var30 / 2;
                     int var32 = var28 + 16 + 1;
                     var0.fill(var31 - 1, var32 - 1, var31 + var30 + 1, var32 + 9, -1441785824);
                     var0.drawString(var8, var29, var31, var32, -1519361, false);
                     var10++;
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
         if (!Double.isFinite(var17.x) || !Double.isFinite(var17.y) || !Double.isFinite(var17.z)) {
            return null;
         } else if (!(var17.z > 1.0) && !(var17.z < -1.0)) {
            float var18 = (float)((var17.x + 1.0) * 0.5 * var3);
            float var19 = (float)((1.0 - var17.y) * 0.5 * var4);
            if (!Float.isFinite(var18) || !Float.isFinite(var19)) {
               return null;
            } else {
               return !(var18 < 0.0F) && !(var19 < 0.0F) && !(var18 > var3) && !(var19 > var4) ? new float[]{var18, var19} : null;
            }
         } else {
            return null;
         }
      }
   }
}
