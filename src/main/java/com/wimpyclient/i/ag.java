package com.wimpyclient.i;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.ClientInput;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Input;

@Environment(EnvType.CLIENT)
public final class ag {
   public static final ag INSTANCE = new ag();
   private static final float LOOK_DOWN_PITCH = 45.0F;

   private ag() {
   }

   public boolean shouldCrouch(LocalPlayer var1) {
      if (var1 == null || !x.INSTANCE.autoCrouch.qo()) {
         return false;
      } else {
         return !var1.isInWater() ? false : var1.getXRot() >= 45.0F;
      }
   }

   public static Input withShift(Input var0, boolean var1) {
      return var0.shift() == var1 ? var0 : new Input(var0.forward(), var0.backward(), var0.left(), var0.right(), var0.jump(), var1, var0.sprint());
   }

   public void applyToInput(ClientInput var1) {
      if (var1 != null && this.shouldCrouch(Minecraft.getInstance().player)) {
         if (!var1.keyPresses.shift()) {
            var1.keyPresses = withShift(var1.keyPresses, true);
         }
      }
   }
}
