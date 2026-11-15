package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({EntityRenderDispatcher.class})
public class k {
   public k() {
   }

   @Inject(
      method = {"shouldRender(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$hideFreeCamera(Entity var1, Frustum var2, double var3, double var5, double var7, CallbackInfoReturnable<Boolean> var9) {
      if (BridgeGate.ready()) {
         if (var1 instanceof com.wimpyclient.i.p || com.wimpyclient.i.q.INSTANCE.isActive() && var1 == com.wimpyclient.i.q.INSTANCE.camera()) {
            var9.setReturnValue(false);
         }
      }
   }
}
