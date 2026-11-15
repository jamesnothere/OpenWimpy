package com.wimpyclient.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.object.projectile.TridentModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.special.TridentSpecialRenderer;
import net.minecraft.world.item.ItemDisplayContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({TridentSpecialRenderer.class})
public class bc {
   public bc() {
   }

   @Inject(
      method = {"submit(Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$markCosmicTrident(
      ItemDisplayContext var1, PoseStack var2, SubmitNodeCollector var3, int var4, int var5, boolean var6, int var7, CallbackInfo var8
   ) {
      if (BridgeGate.ready()) {
         if (var1 == null || var1.firstPerson()) {
            try {
               com.wimpyclient.k.f.markHeldModel(TridentModel.TEXTURE);
            } catch (LinkageError var10) {
            }
         }
      }
   }
}
