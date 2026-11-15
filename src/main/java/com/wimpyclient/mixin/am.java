package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.PlayerSkin;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({PlayerInfo.class})
public class am {
   public am() {
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

   @Inject(
      method = {"getTabListDisplayName()Lnet/minecraft/network/chat/Component;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wimpyclient$fakeTabDisplayName(CallbackInfoReturnable<Component> var1) {
      PlayerInfo var2 = (PlayerInfo)(Object)this;
      if (BridgeGate.ready() && var2.getProfile() != null) {
         Component var3 = (Component)var1.getReturnValue();
         if (var3 != null) {
            if (com.wimpyclient.i.n.appliesTo(var2.getProfile().id())) {
               var1.setReturnValue(com.wimpyclient.i.n.rewriteOwnDisplay(var3));
            } else {
               if (com.wimpyclient.i.n.containsRealName(var3)) {
                  var1.setReturnValue(com.wimpyclient.i.n.replaceRealName(var3));
               }
            }
         }
      }
   }
}
