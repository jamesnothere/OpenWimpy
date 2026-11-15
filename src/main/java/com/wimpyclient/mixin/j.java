package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({Entity.class})
public class j {
   public j() {
   }

   @Inject(
      method = {"turn(DD)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$freecamTurn(double var1, double var3, CallbackInfo var5) {
      if (BridgeGate.ready()) {
         if ((Object)(Object)this instanceof LocalPlayer) {
            if (com.wimpyclient.i.q.INSTANCE.handleTurn(var1, var3)) {
               var5.cancel();
            } else {
               if (com.wimpyclient.i.r.INSTANCE.handleTurn(var1, var3)) {
                  var5.cancel();
               }
            }
         }
      }
   }

   @Inject(
      method = {"push(Lnet/minecraft/world/entity/Entity;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$noFreecamPush(Entity var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         com.wimpyclient.i.p var3 = com.wimpyclient.i.q.INSTANCE.camera();
         if (var3 != null) {
            Entity var4 = (Entity)(Object)this;
            if (var4 == var3 || var1 == var3) {
               var2.cancel();
            }
         }
      }
   }

   @Inject(
      method = {"isInWaterOrRain()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$godTridentDry(CallbackInfoReturnable<Boolean> var1) {
      if ((Object)(Object)this instanceof LocalPlayer) {
         try {
            if (!BridgeGate.ready()) {
               return;
            }

            if (com.wimpyclient.i.s.shouldPretendInWater()) {
               var1.setReturnValue(true);
            }
         } catch (RuntimeException | LinkageError var3) {
         }
      }
   }
}
