package com.wimpyclient.i;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.TridentItem;

@Environment(EnvType.CLIENT)
public final class s {
   public static final s INSTANCE = new s();
   public final com.wimpyclient.j.c scale = new com.wimpyclient.j.c(
      "scale",
      "Multiplier on the charge time a trident needs before it can be thrown.",
      0.0,
      1.0,
      0.1,
      () -> x.INSTANCE.godTridentScale,
      var0 -> x.INSTANCE.godTridentScale = var0
   );
   public final com.wimpyclient.j.a noWater = new com.wimpyclient.j.a(
      "no-water", "Let riptide tridents be used out of water and rain.", () -> x.INSTANCE.godTridentNoWater, var0 -> x.INSTANCE.godTridentNoWater = var0
   );
   private static int tridentUseDepth;

   private s() {
   }

   public static s get() {
      return INSTANCE;
   }

   public boolean isActive() {
      return x.INSTANCE.godTrident.qo();
   }

   public static void enterTridentUse() {
      tridentUseDepth++;
   }

   public static void leaveTridentUse() {
      if (tridentUseDepth > 0) {
         tridentUseDepth--;
      }
   }

   public static boolean shouldAllowDryUse() {
      return INSTANCE.isActive() && INSTANCE.noWater.get();
   }

   public static boolean shouldPretendInWater() {
      if (!shouldAllowDryUse()) {
         return false;
      } else if (tridentUseDepth > 0) {
         return true;
      } else {
         Minecraft var0 = Minecraft.getInstance();
         LocalPlayer var1 = var0.player;
         return var1 != null && var1.isUsingItem() && var1.getUseItem().getItem() instanceof TridentItem;
      }
   }

   public static int scaleRemainingUseTicks(int var0) {
      if (!INSTANCE.isActive()) {
         return var0;
      } else {
         byte var1 = 10;
         int var2 = Math.max(1, (int)Math.round(var1 * INSTANCE.scale.get()));
         return var0 - (var1 - var2);
      }
   }
}
