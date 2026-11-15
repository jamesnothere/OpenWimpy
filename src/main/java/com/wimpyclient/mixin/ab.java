package com.wimpyclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({LightTexture.class})
public class ab {
   @Shadow
   private boolean updateLightTexture;
   @Unique
   private boolean wimpyclient$wasFullbright;
   @Unique
   private int wimpyclient$lastFullbrightIntensity = Integer.MIN_VALUE;

   public ab() {
   }

   @ModifyExpressionValue(
      method = {"updateLightTexture(F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/OptionInstance;get()Ljava/lang/Object;"
      )},
      slice = {@Slice(
         from = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/Options;gamma()Lnet/minecraft/client/OptionInstance;"
         )
      )}
   )
   private Object wimpyclient$fullbrightGamma(Object var1) {
      return fullbrightAllowed() && com.wimpyclient.i.x.INSTANCE.fullbright.qo() ? com.wimpyclient.i.x.INSTANCE.fullbrightIntensity / 100.0 * 16.0 : var1;
   }

   @Inject(
      method = {"updateLightTexture(F)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$forceLightmapUpdate(float var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         if (!fullbrightAllowed()) {
            this.wimpyclient$wasFullbright = false;
            this.wimpyclient$lastFullbrightIntensity = Integer.MIN_VALUE;
         } else {
            boolean var3 = com.wimpyclient.i.x.INSTANCE.fullbright.qo();
            int var4 = com.wimpyclient.i.x.INSTANCE.fullbrightIntensity;
            if (var3 != this.wimpyclient$wasFullbright || var3 && var4 != this.wimpyclient$lastFullbrightIntensity) {
               this.updateLightTexture = true;
            }

            this.wimpyclient$wasFullbright = var3;
            this.wimpyclient$lastFullbrightIntensity = var4;
         }
      }
   }

   @Inject(
      method = {"calculateDarknessScale(Lnet/minecraft/world/entity/LivingEntity;FF)F"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$noDarkness(LivingEntity var1, float var2, float var3, CallbackInfoReturnable<Float> var4) {
      if (fullbrightAllowed() && com.wimpyclient.i.x.INSTANCE.fullbright.qo()) {
         var4.setReturnValue(0.0F);
      }
   }

   @Inject(
      method = {"getBrightness(Lnet/minecraft/world/level/dimension/DimensionType;I)F"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void wimpyclient$fullbrightDim(DimensionType var0, int var1, CallbackInfoReturnable<Float> var2) {
      applyFullbright(var2);
   }

   @Inject(
      method = {"getBrightness(FI)F"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void wimpyclient$fullbright(float var0, int var1, CallbackInfoReturnable<Float> var2) {
      applyFullbright(var2);
   }

   private static void applyFullbright(CallbackInfoReturnable<Float> var0) {
      if (BridgeGate.ready()) {
         if (fullbrightAllowed() && com.wimpyclient.i.x.INSTANCE.fullbright.qo()) {
            var0.setReturnValue(com.wimpyclient.i.x.INSTANCE.fullbrightIntensity / 100.0F);
         }
      }
   }

   private static boolean fullbrightAllowed() {
      return BridgeGate.ready();
   }
}
