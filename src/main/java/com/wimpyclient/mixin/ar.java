package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.scores.Team;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({PlayerTeam.class})
public class ar {
   public ar() {
   }

   @Inject(
      method = {"getPlayerPrefix()Lnet/minecraft/network/chat/Component;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wimpyclient$fakePrefix(CallbackInfoReturnable<Component> var1) {
      rewriteFakeNameOnly(var1);
   }

   @Inject(
      method = {"getPlayerSuffix()Lnet/minecraft/network/chat/Component;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wimpyclient$fakeSuffix(CallbackInfoReturnable<Component> var1) {
      rewriteFakeNameOnly(var1);
   }

   @Inject(
      method = {"formatNameForTeam(Lnet/minecraft/world/scores/Team;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private static void wimpyclient$fakeNameInTeamFormat(Team var0, Component var1, CallbackInfoReturnable<MutableComponent> var2) {
      MutableComponent var3 = (MutableComponent)var2.getReturnValue();
      if (BridgeGate.ready() && var3 != null) {
         MutableComponent var4 = var3;
         if (com.wimpyclient.i.n.isActive() && com.wimpyclient.i.n.containsRealName(var3)) {
            var4 = com.wimpyclient.i.n.replaceRealName(var3);
         }

         if (var4 != var3) {
            var2.setReturnValue(var4 instanceof MutableComponent var5 ? var5 : var4.copy());
         }
      }
   }

   private static void rewriteFakeNameOnly(CallbackInfoReturnable<Component> var0) {
      if (BridgeGate.ready()) {
         Component var1 = (Component)var0.getReturnValue();
         if (var1 != null) {
            if (com.wimpyclient.i.n.isActive() && com.wimpyclient.i.n.containsRealName(var1)) {
               var0.setReturnValue(com.wimpyclient.i.n.replaceRealName(var1));
            }
         }
      }
   }
}
