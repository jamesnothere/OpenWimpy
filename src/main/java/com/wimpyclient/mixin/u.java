package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Environment(EnvType.CLIENT)
@Mixin({ItemStackRenderState.class})
public class u {
   public u() {
   }

   @ModifyVariable(
      method = {"submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;III)V"},
      at = {@At("HEAD")},
      argsOnly = true,
      ordinal = 2
   )
   private int wimpyclient$toolOutline(int var1) {
      return !BridgeGate.ready() ? var1 : com.wimpyclient.i.ae.colorOr(var1);
   }
}
