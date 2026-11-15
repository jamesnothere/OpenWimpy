package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.KeyboardInput;
import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({KeyboardInput.class})
public class w {
   public w() {
   }

   @Inject(
      method = {"tick()V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$autoCrouch(CallbackInfo var1) {
      if (BridgeGate.ready()) {
         Minecraft var2 = Minecraft.getInstance();
         LocalPlayer var3 = var2.player;
         if (var3 != null && var3.input == (Object)this) {
            com.wimpyclient.i.ag.INSTANCE.applyToInput(var3.input);
            com.wimpyclient.i.aj.INSTANCE.applyToInput(var3.input);
         }
      }
   }
}
