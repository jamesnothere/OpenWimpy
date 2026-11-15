package com.wimpyclient.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.layers.PlayerItemInHandLayer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({PlayerItemInHandLayer.class})
public class an {
   public an() {
   }

   @Inject(
      method = {"submitArmWithItem(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$toolSize(
      AvatarRenderState var1,
      ItemStackRenderState var2,
      ItemStack var3,
      HumanoidArm var4,
      PoseStack var5,
      SubmitNodeCollector var6,
      int var7,
      CallbackInfo var8
   ) {
      if (BridgeGate.ready() && var1 != null) {
         com.wimpyclient.i.ae.beginHeldId(var1.id, var3);
         if (com.wimpyclient.i.ad.affectsId(var1.id)) {
            com.wimpyclient.i.ad.apply(var5, var3, com.wimpyclient.i.ad.leftHand(var4));
         }
      }
   }

   @Inject(
      method = {"submitArmWithItem(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$toolOutlineEnd(
      AvatarRenderState var1,
      ItemStackRenderState var2,
      ItemStack var3,
      HumanoidArm var4,
      PoseStack var5,
      SubmitNodeCollector var6,
      int var7,
      CallbackInfo var8
   ) {
      if (BridgeGate.ready()) {
         com.wimpyclient.i.ae.endHeld();
      }
   }
}
