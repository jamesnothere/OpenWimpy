package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.OutlineBufferSource;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Environment(EnvType.CLIENT)
@Mixin({OutlineBufferSource.class})
public class al {
   public al() {
   }

   @ModifyVariable(
      method = {"getBuffer(Lnet/minecraft/client/renderer/rendertype/RenderType;)Lcom/mojang/blaze3d/vertex/VertexConsumer;"},
      at = {@At("HEAD")},
      argsOnly = true
   )
   private RenderType wimpyclient$forceNoCullOutline(RenderType var1) {
      if (!BridgeGate.ready() || !com.wimpyclient.i.ae.hasPending()) {
         return var1;
      } else {
         return var1.isOutline() ? var1 : RenderTypes.outline(com.wimpyclient.k.f.outlineAtlas(var1));
      }
   }
}
