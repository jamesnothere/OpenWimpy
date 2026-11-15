package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({LivingEntity.class})
public class ac {
   public ac() {
   }

   @Inject(
      method = {"getCurrentSwingDuration()I"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wimpyclient$swingSpeed(CallbackInfoReturnable<Integer> var1) {
      LivingEntity var2 = (LivingEntity)(Object)this;
      Minecraft var3 = Minecraft.getInstance();
      if (BridgeGate.ready() && var3.player == var2) {
         com.wimpyclient.i.x var4 = com.wimpyclient.i.x.INSTANCE;
         if (var4.swingSpeed.qo()) {
            float var5 = var4.swingSpeedMultiplier();
            if (!(var5 <= 0.01F)) {
               int var6 = var1.getReturnValueI();
               var1.setReturnValue(Math.max(1, Math.round(var6 / var5)));
            }
         }
      }
   }
}
