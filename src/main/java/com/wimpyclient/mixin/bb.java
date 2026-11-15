package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({TridentItem.class})
public abstract class bb {
   public bb() {
   }

   @Inject(
      method = {"use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$beginUse(Level var1, Player var2, InteractionHand var3, CallbackInfoReturnable<InteractionResult> var4) {
      tridentUse(true);
   }

   @Inject(
      method = {"use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wimpyclient$endUse(Level var1, Player var2, InteractionHand var3, CallbackInfoReturnable<InteractionResult> var4) {
      tridentUse(false);
      if (BridgeGate.ready() && var2 != null) {
         try {
            InteractionResult var5 = (InteractionResult)var4.getReturnValue();
            ItemStack var6 = var2.getItemInHand(var3);
            if ((var5 == null || !var5.consumesAction()) && com.wimpyclient.i.s.shouldAllowDryUse() && !var6.isEmpty() && !var6.nextDamageWillBreak()) {
               var2.startUsingItem(var3);
               var4.setReturnValue(InteractionResult.CONSUME);
            }
         } catch (LinkageError var7) {
         }
      }
   }

   @Inject(
      method = {"releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$beginRelease(ItemStack var1, Level var2, LivingEntity var3, int var4, CallbackInfoReturnable<Boolean> var5) {
      tridentUse(true);
   }

   @Inject(
      method = {"releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$endRelease(ItemStack var1, Level var2, LivingEntity var3, int var4, CallbackInfoReturnable<Boolean> var5) {
      tridentUse(false);
   }

   @ModifyVariable(
      method = {"releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z"},
      at = {@At("HEAD")},
      argsOnly = true,
      ordinal = 0
   )
   private int wimpyclient$scaleMinCharge(int var1) {
      if (!BridgeGate.ready()) {
         return var1;
      } else {
         try {
            return com.wimpyclient.i.s.scaleRemainingUseTicks(var1);
         } catch (LinkageError var3) {
            return var1;
         }
      }
   }

   private static void tridentUse(boolean var0) {
      if (BridgeGate.ready()) {
         try {
            if (var0) {
               com.wimpyclient.i.s.enterTridentUse();
            } else {
               com.wimpyclient.i.s.leaveTridentUse();
            }
         } catch (LinkageError var2) {
         }
      }
   }
}
