package com.wimpyclient.i;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

@Environment(EnvType.CLIENT)
public final class ad {
   private ad() {
   }

   public static void apply(PoseStack var0, ItemStack var1, boolean var2) {
      if (var0 != null && var1 != null && !var1.isEmpty()) {
         if (BridgeGate.ready()) {
            x var3 = x.INSTANCE;
            if (var3 != null && var3.toolSize.qo()) {
               float var4 = (float)var3.toolSizeX;
               float var5 = (float)var3.toolSizeY;
               float var6 = (float)var3.toolSizeZ;
               if (var2) {
                  var4 = -var4;
               }

               if (var4 != 0.0F || var5 != 0.0F || var6 != 0.0F) {
                  var0.translate(var4, var5, var6);
               }

               float var7 = var3.toolSizeRotX;
               float var8 = var3.toolSizeRotY;
               float var9 = var3.toolSizeRotZ;
               if (var2) {
                  var8 = -var8;
                  var9 = -var9;
               }

               if (var7 != 0.0F) {
                  var0.mulPose(Axis.XP.rotationDegrees(var7));
               }

               if (var8 != 0.0F) {
                  var0.mulPose(Axis.YP.rotationDegrees(var8));
               }

               if (var9 != 0.0F) {
                  var0.mulPose(Axis.ZP.rotationDegrees(var9));
               }

               float var10 = Math.max(0.01F, var3.toolSizePercent / 100.0F);
               if (var10 != 1.0F) {
                  var0.scale(var10, var10, var10);
               }
            }
         }
      }
   }

   public static boolean leftHand(ItemDisplayContext var0) {
      return var0 == ItemDisplayContext.FIRST_PERSON_LEFT_HAND || var0 == ItemDisplayContext.THIRD_PERSON_LEFT_HAND;
   }

   public static boolean leftHand(HumanoidArm var0) {
      return var0 == HumanoidArm.LEFT;
   }

   public static boolean affects(LivingEntity var0) {
      if (BridgeGate.ready() && var0 != null) {
         Minecraft var1 = Minecraft.getInstance();
         return var1.player != null && var0 == var1.player;
      } else {
         return false;
      }
   }

   public static boolean affectsId(int var0) {
      if (!BridgeGate.ready()) {
         return false;
      } else {
         Minecraft var1 = Minecraft.getInstance();
         return var1.player != null && var0 == var1.player.getId();
      }
   }
}
