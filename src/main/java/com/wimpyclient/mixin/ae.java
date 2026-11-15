package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({LocalPlayer.class})
public class ae {
   public ae() {
   }

   @Inject(
      method = {"isControlledCamera()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$keepPlayerControlled(CallbackInfoReturnable<Boolean> var1) {
      if (BridgeGate.ready()) {
         if (com.wimpyclient.i.q.INSTANCE.isActive() && (Object)this == Minecraft.getInstance().player) {
            var1.setReturnValue(true);
         }
      }
   }

   @Inject(
      method = {"tick()V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$flightBegin(CallbackInfo var1) {
      if (BridgeGate.ready()) {
         LocalPlayer var2 = (LocalPlayer)(Object)this;
         if (var2.connection != null && var2.connection.hasClientLoaded()) {
            com.wimpyclient.i.ai.INSTANCE.beginAiStep(var2);
         }
      }
   }

   @Inject(
      method = {"tick()V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/player/LocalPlayer;sendPosition()V"
      )}
   )
   private void wimpyclient$flightEnd(CallbackInfo var1) {
      if (BridgeGate.ready()) {
         com.wimpyclient.i.ai.INSTANCE.endAiStep((LocalPlayer)(Object)this);
      }
   }

   @Inject(
      method = {"onUpdateAbilities()V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$suppressFlightAbilities(CallbackInfo var1) {
      if (BridgeGate.ready()) {
         if (com.wimpyclient.i.ai.INSTANCE.suppressAbilitiesPacket()) {
            var1.cancel();
         }
      }
   }

   @Inject(
      method = {"sendPosition()V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$flightSpoofGround(CallbackInfo var1) {
      if (BridgeGate.ready()) {
         if (com.wimpyclient.i.ai.INSTANCE.spoofOnGround()) {
            ((LocalPlayer)(Object)this).setOnGround(true);
         }
      }
   }
}
