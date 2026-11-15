package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.entity.player.PlayerSkin;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({AbstractClientPlayer.class})
public class a {
   public a() {
   }

   @Inject(
      method = {"getSkin()Lnet/minecraft/world/entity/player/PlayerSkin;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$forceSkin(CallbackInfoReturnable<PlayerSkin> var1) {
      if (BridgeGate.ready()) {
         PlayerSkin var2 = com.wimpyclient.i.z.getForcedSkin();
         if (var2 != null) {
            var1.setReturnValue(var2);
         }
      }
   }
}
