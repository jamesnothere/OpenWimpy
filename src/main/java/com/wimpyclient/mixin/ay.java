package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.SkyRenderer;
import net.minecraft.client.renderer.state.SkyRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({SkyRenderer.class})
public class ay {
   public ay() {
   }

   @Inject(
      method = {"extractRenderState(Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/Camera;Lnet/minecraft/client/renderer/state/SkyRenderState;)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$ambientDarkSky(ClientLevel var1, float var2, Camera var3, SkyRenderState var4, CallbackInfo var5) {
      if (BridgeGate.ready() && com.wimpyclient.k.a.shouldDarkenSky(var1, var2)) {
         com.wimpyclient.k.a.applyDarkSky(var4);
      }
   }

   @Inject(
      method = {"renderSkyDisc(I)V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$ambientStars(int var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         com.wimpyclient.k.a.INSTANCE.drawInSkyPass();
      }
   }

   @Inject(
      method = {"renderEndSky()V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$ambientEndStars(CallbackInfo var1) {
      if (BridgeGate.ready()) {
         com.wimpyclient.k.a.INSTANCE.drawInSkyPass();
      }
   }
}
