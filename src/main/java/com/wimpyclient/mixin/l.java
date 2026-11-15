package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({EntityRenderer.class})
public class l {
   public l() {
   }

   @Inject(
      method = {"getNameTag(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/chat/Component;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wimpyclient$fakeNameTag(Entity var1, CallbackInfoReturnable<Component> var2) {
      Component var3 = (Component)var2.getReturnValue();
      if (BridgeGate.ready()) {
         if (var1 instanceof Player var4 && com.wimpyclient.i.n.appliesTo(var4)) {
            var2.setReturnValue(com.wimpyclient.i.n.rewriteOwnDisplay(var3));
         } else {
            if (var3 != null && com.wimpyclient.i.n.containsRealName(var3)) {
               var2.setReturnValue(com.wimpyclient.i.n.replaceRealName(var3));
            }
         }
      }
   }
}
