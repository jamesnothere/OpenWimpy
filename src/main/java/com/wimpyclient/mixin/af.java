package com.wimpyclient.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.DeathScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResult.Fail;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({Minecraft.class})
public class af {
   public af() {
   }

   @Inject(
      method = {"setScreen(Lnet/minecraft/client/gui/screens/Screen;)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$onSetScreen(Screen var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         if (var1 != null) {
            if (var1 instanceof DeathScreen) {
               com.wimpyclient.i.e.INSTANCE.onDeathScreen();
            }

            com.wimpyclient.p.b.abortAutoDigForScreen();
         }
      }
   }

   @Inject(
      method = {"disconnect(Lnet/minecraft/client/gui/screens/Screen;Z)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$onDisconnect(Screen var1, boolean var2, CallbackInfo var3) {
      if (BridgeGate.ready()) {
         Minecraft var4 = (Minecraft)(Object)this;
         com.wimpyclient.p.k.fullReset(var4);
         com.wimpyclient.i.q.INSTANCE.onDisconnect(var4);
         com.wimpyclient.i.r.INSTANCE.onDisconnect(var4);
         com.wimpyclient.i.f.INSTANCE.onDisconnect(var4);
         com.wimpyclient.i.af.INSTANCE.reset();
         com.wimpyclient.p.f.resetSusSoundCooldown();
         com.wimpyclient.f.h.INSTANCE.onDisconnect();
      }
   }

   @WrapOperation(
      method = {"startUseItem()V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;useItemOn(Lnet/minecraft/client/player/LocalPlayer;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/BlockHitResult;)Lnet/minecraft/world/InteractionResult;"
      )}
   )
   private InteractionResult wimpyclient$allowHoldUseOnBlockFail(
      MultiPlayerGameMode var1, LocalPlayer var2, InteractionHand var3, BlockHitResult var4, Operation<InteractionResult> var5
   ) {
      InteractionResult var6 = (InteractionResult)var5.call(new Object[]{var1, var2, var3, var4});
      if (BridgeGate.ready() && var2 != null && var3 != null) {
         try {
            if (var6 instanceof Fail) {
               ItemStack var7 = var2.getItemInHand(var3);
               if (!var7.isEmpty() && var7.getUseDuration(var2) > 0) {
                  return InteractionResult.PASS;
               }
            }
         } catch (LinkageError var8) {
         }

         return var6;
      } else {
         return var6;
      }
   }

   @WrapOperation(
      method = {"startUseItem()V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ItemInHandRenderer;itemUsed(Lnet/minecraft/world/InteractionHand;)V"
      )}
   )
   private void wimpyclient$keepFirstPersonChargeHand(ItemInHandRenderer var1, InteractionHand var2, Operation<Void> var3) {
      Minecraft var4 = (Minecraft)(Object)this;
      LocalPlayer var5 = var4.player;
      if (!BridgeGate.ready() || var5 == null || !var5.isUsingItem()) {
         var3.call(new Object[]{var1, var2});
      }
   }
}
