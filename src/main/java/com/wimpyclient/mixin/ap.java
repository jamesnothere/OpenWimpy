package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.chat.Component;
import net.minecraft.world.scores.PlayerScoreEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({PlayerScoreEntry.class})
public abstract class ap {
   public ap() {
   }

   @Inject(
      method = {"ownerName()Lnet/minecraft/network/chat/Component;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$fakeScoreboardName(CallbackInfoReturnable<Component> var1) {
      PlayerScoreEntry var2 = (PlayerScoreEntry)(Object)this;
      if (BridgeGate.ready()) {
         Object var3 = var2.display();
         if (var3 == null) {
            var3 = Component.literal(var2.owner() == null ? "" : var2.owner());
         }

         var1.setReturnValue(com.wimpyclient.i.n.rewriteSidebarLine((Component)var3, var2.owner()));
      }
   }
}
