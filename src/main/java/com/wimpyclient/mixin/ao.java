package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({Player.class})
public class ao {
   public ao() {
   }

   @Inject(
      method = {"getName()Lnet/minecraft/network/chat/Component;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$fakeName(CallbackInfoReturnable<Component> var1) {
      Player var2 = (Player)(Object)this;
      if (BridgeGate.ready() && var2 instanceof LocalPlayer && com.wimpyclient.i.n.appliesTo(var2)) {
         var1.setReturnValue(com.wimpyclient.i.n.getComponent());
      }
   }

   @Inject(
      method = {"getPlainTextName()Ljava/lang/String;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$fakePlainName(CallbackInfoReturnable<String> var1) {
      Player var2 = (Player)(Object)this;
      if (BridgeGate.ready() && var2 instanceof LocalPlayer && com.wimpyclient.i.n.appliesTo(var2)) {
         var1.setReturnValue(com.wimpyclient.i.n.getName());
      }
   }

   @Inject(
      method = {"travel(Lnet/minecraft/world/phys/Vec3;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$flightTravel(Vec3 var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         Player var3 = (Player)(Object)this;
         if (var3 instanceof LocalPlayer var4 && var4 == Minecraft.getInstance().player) {
            com.wimpyclient.i.ai var5 = com.wimpyclient.i.ai.INSTANCE;
            var5.prepareTravel(var4);
            if (var5.shouldCancelTravel()) {
               var4.setDeltaMovement(Vec3.ZERO);
               var2.cancel();
            }
         }
      }
   }

   @Inject(
      method = {"getDisplayName()Lnet/minecraft/network/chat/Component;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wimpyclient$fakeDisplayName(CallbackInfoReturnable<Component> var1) {
      Player var2 = (Player)(Object)this;
      if (BridgeGate.ready()) {
         Component var3 = (Component)var1.getReturnValue();
         if (var2 instanceof LocalPlayer && com.wimpyclient.i.n.appliesTo(var2)) {
            var1.setReturnValue(com.wimpyclient.i.n.rewriteOwnDisplay(var3));
         } else {
            if (var3 != null && com.wimpyclient.i.n.containsRealName(var3)) {
               var1.setReturnValue(com.wimpyclient.i.n.replaceRealName(var3));
            }
         }
      }
   }
}
