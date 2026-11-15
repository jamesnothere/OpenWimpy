package com.wimpyclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.RenderBuffers;
import net.minecraft.client.renderer.feature.FeatureRenderDispatcher;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(
   value = {GameRenderer.class},
   priority = 900
)
public class p {
   @Shadow
   @Final
   private RenderBuffers renderBuffers;
   @Shadow
   @Final
   private FeatureRenderDispatcher featureRenderDispatcher;

   public p() {
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/DeltaTracker;Z)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/render/GuiRenderer;render(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V",
         shift = Shift.AFTER
      )}
   )
   private void wimpyclient$renderOverlay(DeltaTracker var1, boolean var2, CallbackInfo var3) {
      if (BridgeGate.ready()) {
         com.wimpyclient.k.q.render();
      }
   }

   @Inject(
      method = {"renderLevel(Lnet/minecraft/client/DeltaTracker;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/LevelRenderer;renderLevel(Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;Lnet/minecraft/client/DeltaTracker;ZLnet/minecraft/client/Camera;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;Z)V",
         shift = Shift.AFTER
      )}
   )
   private void wimpyclient$drawOverlaysAfterWorld(DeltaTracker var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         com.wimpyclient.k.d.INSTANCE.drawAfterShaderComposite();
      }
   }

   @Inject(
      method = {"renderItemInHand(FZLorg/joml/Matrix4f;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ItemInHandRenderer;renderHandsWithItems(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/player/LocalPlayer;I)V",
         shift = Shift.AFTER
      )}
   )
   private void wimpyclient$flushHandToolOutlines(float var1, boolean var2, Matrix4f var3, CallbackInfo var4) {
      if (BridgeGate.ready()) {
         if (com.wimpyclient.i.ae.hasPending() || com.wimpyclient.k.h.itemStarfield()) {
            com.wimpyclient.i.ae.beginHandFlush();

            try {
               this.featureRenderDispatcher.renderAllFeatures();
               this.renderBuffers.bufferSource().endBatch();
               com.wimpyclient.i.ae.compositeHandOutlines(((o)this).wimpyclient$resourcePool());
            } finally {
               com.wimpyclient.i.ae.endHandFlush();
            }
         }
      }
   }

   @ModifyReturnValue(
      method = {"getNightVisionScale(Lnet/minecraft/world/entity/LivingEntity;F)F"},
      at = {@At("RETURN")}
   )
   private static float wimpyclient$fullbrightNightVision(float var0) {
      return fullbrightAllowed() && com.wimpyclient.i.x.INSTANCE.fullbright.qo()
         ? Math.max(var0, com.wimpyclient.i.x.INSTANCE.fullbrightIntensity / 100.0F)
         : var0;
   }

   @Inject(
      method = {"getNightVisionScale(Lnet/minecraft/world/entity/LivingEntity;F)F"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void wimpyclient$fullbrightNightVisionHead(LivingEntity var0, float var1, CallbackInfoReturnable<Float> var2) {
      if (fullbrightAllowed() && com.wimpyclient.i.x.INSTANCE.fullbright.qo()) {
         var2.setReturnValue(com.wimpyclient.i.x.INSTANCE.fullbrightIntensity / 100.0F);
      }
   }

   private static boolean fullbrightAllowed() {
      return BridgeGate.ready();
   }

   @ModifyReturnValue(
      method = {"getFov(Lnet/minecraft/client/Camera;FZ)F"},
      at = {@At("RETURN")}
   )
   private float wimpyclient$fovChanger(float var1, Camera var2, float var3, boolean var4) {
      if (BridgeGate.ready() && var4) {
         com.wimpyclient.i.x var5 = com.wimpyclient.i.x.INSTANCE;
         if (!var5.fovChanger.qo()) {
            return var1;
         } else {
            float var6 = ((Integer)Minecraft.getInstance().options.fov().get()).intValue();
            return applyFovChanger(var1, var6, var5.fovChangerFov);
         }
      } else {
         return var1;
      }
   }

   private static float applyFovChanger(float var0, float var1, float var2) {
      if (var1 <= 0.01F) {
         return clampFov(var2);
      } else {
         float var3 = var0 / var1;
         if (var3 < 0.5F) {
            return clampFov(var2 * var3);
         } else {
            double var4 = halfTan(var1);
            if (var4 < 1.0E-6) {
               return clampFov(var2);
            } else {
               double var6 = Math.atan(halfTan(var2) * (halfTan(var0) / var4));
               return clampFov((float)(Math.toDegrees(var6) * 2.0));
            }
         }
      }
   }

   private static double halfTan(float var0) {
      return Math.tan(Math.toRadians(Math.clamp(var0 * 0.5F, 0.05F, 89.0F)));
   }

   private static float clampFov(float var0) {
      return Math.clamp(var0, 1.0F, 179.0F);
   }

   @ModifyVariable(
      method = {"pick(F)V"},
      at = {@At(
         value = "INVOKE_ASSIGN",
         target = "Lnet/minecraft/client/Minecraft;getCameraEntity()Lnet/minecraft/world/entity/Entity;"
      )}
   )
   private Entity wimpyclient$pickFromPlayer(Entity var1) {
      if (!BridgeGate.ready()) {
         return var1;
      } else {
         Minecraft var2 = Minecraft.getInstance();
         return (Entity)(com.wimpyclient.i.q.INSTANCE.isActive() && var2.player != null ? var2.player : var1);
      }
   }

   @Inject(
      method = {"close()V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$onClose(CallbackInfo var1) {
      if (BridgeGate.ready()) {
         com.wimpyclient.k.q.close();
         com.wimpyclient.k.d.close();
      }
   }
}
