package com.wimpyclient.mixin;

import com.mojang.blaze3d.pipeline.RenderTarget;
import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.LevelRenderState;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({LevelRenderer.class})
public abstract class aa {
   @Shadow
   private RenderTarget entityOutlineTarget;

   public aa() {
   }

   @Shadow
   protected abstract EntityRenderState extractEntity(Entity var1, float var2);

   @Inject(
      method = {"entityOutlineTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wimpyclient$resolveOutlineDuringHandComposite(CallbackInfoReturnable<RenderTarget> var1) {
      if (var1.getReturnValue() == null && BridgeGate.ready() && com.wimpyclient.i.ae.isCompositing()) {
         if (this.entityOutlineTarget != null) {
            var1.setReturnValue(this.entityOutlineTarget);
         }
      }
   }

   @Inject(
      method = {"extractVisibleEntities(Lnet/minecraft/client/Camera;Lnet/minecraft/client/renderer/culling/Frustum;Lnet/minecraft/client/DeltaTracker;Lnet/minecraft/client/renderer/state/LevelRenderState;)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$extractLocalPlayerDuringFreecam(Camera var1, Frustum var2, DeltaTracker var3, LevelRenderState var4, CallbackInfo var5) {
      if (BridgeGate.ready()) {
         if (com.wimpyclient.i.q.INSTANCE.isActive() || com.wimpyclient.i.r.INSTANCE.isActive()) {
            LocalPlayer var6 = Minecraft.getInstance().player;
            if (var6 != null) {
               if (!hasVisibleLocalBody(var4, var6)) {
                  dropMatchingLocalBody(var4, var6);
                  float var7 = var3.getGameTimeDeltaPartialTick(false);
                  var4.entityRenderStates.add(this.extractEntity(var6, var7));
               }
            }
         }
      }
   }

   private static boolean hasVisibleLocalBody(LevelRenderState var0, LocalPlayer var1) {
      if (!BridgeGate.ready()) {
         return false;
      } else {
         for (EntityRenderState var3 : var0.entityRenderStates) {
            if (isLocalBodyState(var3, var1) && !var3.isInvisible) {
               return true;
            }
         }

         return false;
      }
   }

   private static void dropMatchingLocalBody(LevelRenderState var0, LocalPlayer var1) {
      if (BridgeGate.ready()) {
         var0.entityRenderStates.removeIf(var1x -> isLocalBodyState(var1x, var1));
      }
   }

   private static boolean isLocalBodyState(EntityRenderState var0, LocalPlayer var1) {
      if (!BridgeGate.ready()) {
         return false;
      } else {
         return var0.entityType != var1.getType()
            ? false
            : Math.abs(var0.x - var1.getX()) < 0.05 && Math.abs(var0.y - var1.getY()) < 0.05 && Math.abs(var0.z - var1.getZ()) < 0.05;
      }
   }
}
