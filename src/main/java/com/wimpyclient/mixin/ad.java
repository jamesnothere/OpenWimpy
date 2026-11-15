package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({LivingEntityRenderer.class})
public class ad {
   public ad() {
   }

   @Inject(
      method = {"shouldShowName(Lnet/minecraft/world/entity/LivingEntity;D)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$hideVanillaNames(LivingEntity var1, double var2, CallbackInfoReturnable<Boolean> var4) {
      Minecraft var5 = Minecraft.getInstance();
      if (BridgeGate.ready()) {
         com.wimpyclient.i.x var6 = com.wimpyclient.i.x.INSTANCE;
         if (com.wimpyclient.i.q.INSTANCE.isActive() && var1 == var5.player) {
            var4.setReturnValue(false);
         } else if (var6.nametags.qo() && var6.nametagPlayers && var1 instanceof Player) {
            if (var1 == var5.player) {
               if (var6.nametagSelf && com.wimpyclient.k.l.isLocalBodyVisible(var5)) {
                  var4.setReturnValue(false);
               }
            } else {
               var4.setReturnValue(false);
            }
         }
      }
   }
}
