package com.wimpyclient.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({ItemInHandRenderer.class})
public class t {
   @Shadow
   private ItemStack mainHandItem;
   @Shadow
   private ItemStack offHandItem;
   @Shadow
   private float mainHandHeight;
   @Shadow
   private float oMainHandHeight;
   @Shadow
   private float offHandHeight;
   @Shadow
   private float oOffHandHeight;

   public t() {
   }

   @Inject(
      method = {"renderItem(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$toolSize(
      LivingEntity var1, ItemStack var2, ItemDisplayContext var3, PoseStack var4, SubmitNodeCollector var5, int var6, CallbackInfo var7
   ) {
      if (BridgeGate.ready()) {
         com.wimpyclient.i.ae.beginHeld(var1, var2);
         if (com.wimpyclient.i.ad.affects(var1)) {
            com.wimpyclient.i.ad.apply(var4, var2, com.wimpyclient.i.ad.leftHand(var3));
         }
      }
   }

   @Inject(
      method = {"renderItem(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$toolOutlineEnd(
      LivingEntity var1, ItemStack var2, ItemDisplayContext var3, PoseStack var4, SubmitNodeCollector var5, int var6, CallbackInfo var7
   ) {
      if (BridgeGate.ready()) {
         com.wimpyclient.i.ae.endHeld();
      }
   }

   @Inject(
      method = {"tick()V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$syncHandsForOutline(CallbackInfo var1) {
      if (BridgeGate.ready() && com.wimpyclient.i.ae.shouldForceHandSync()) {
         LocalPlayer var2 = Minecraft.getInstance().player;
         if (var2 != null) {
            ItemStack var3 = var2.getMainHandItem();
            ItemStack var4 = var2.getOffhandItem();
            if (this.mainHandItem != var3) {
               this.mainHandItem = var3;
               this.mainHandHeight = 1.0F;
               this.oMainHandHeight = 1.0F;
            }

            if (this.offHandItem != var4) {
               this.offHandItem = var4;
               this.offHandHeight = 1.0F;
               this.oOffHandHeight = 1.0F;
            }
         }
      }
   }
}
