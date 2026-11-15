package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.CameraType;
import net.minecraft.client.Options;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({Options.class})
public class ak {
   public ak() {
   }

   @Inject(
      method = {"getCameraType()Lnet/minecraft/client/CameraType;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$freelookThirdPerson(CallbackInfoReturnable<CameraType> var1) {
      if (BridgeGate.ready()) {
         try {
            if (com.wimpyclient.i.r.INSTANCE.isActive()) {
               var1.setReturnValue(CameraType.THIRD_PERSON_BACK);
            }
         } catch (LinkageError var3) {
         }
      }
   }

   @Inject(
      method = {"save()V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$persistKeybinds(CallbackInfo var1) {
      if (BridgeGate.ready()) {
         try {
            com.wimpyclient.d.a.save();
         } catch (LinkageError var3) {
         }
      }
   }
}
