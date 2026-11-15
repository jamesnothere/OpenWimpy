package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Environment(EnvType.CLIENT)
@Mixin({ServerboundMovePlayerPacket.class})
public abstract class ax {
   public ax() {
   }

   @ModifyVariable(
      method = {"<init>(DDDFFZZZZ)V"},
      at = {@At("HEAD")},
      argsOnly = true,
      ordinal = 0
   )
   private static boolean wimpyclient$spoofOnGround(boolean var0) {
      try {
         if (!BridgeGate.ready()) {
            return var0;
         }

         if (com.wimpyclient.i.ai.INSTANCE.spoofOnGround()) {
            return true;
         }
      } catch (Throwable var2) {
      }

      return var0;
   }
}
