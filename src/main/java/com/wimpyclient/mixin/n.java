package com.wimpyclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.fog.FogRenderer;
import net.minecraft.world.level.material.FogType;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Environment(EnvType.CLIENT)
@Mixin({FogRenderer.class})
public abstract class n {
   public n() {
   }

   @Shadow
   protected abstract FogType getFogType(Camera var1);

   @ModifyReturnValue(
      method = {"setupFog(Lnet/minecraft/client/Camera;ILnet/minecraft/client/DeltaTracker;FLnet/minecraft/client/multiplayer/ClientLevel;)Lorg/joml/Vector4f;"},
      at = {@At("RETURN")}
   )
   private Vector4f wimpyclient$ambientFog(Vector4f var1, Camera var2, int var3, DeltaTracker var4, float var5, ClientLevel var6) {
      if (BridgeGate.ready() && var1 != null && var6 != null) {
         float var7 = var4.getGameTimeDeltaPartialTick(true);
         if (!com.wimpyclient.k.a.shouldDarkenSky(var6, var7)) {
            return var1;
         } else if (this.getFogType(var2) != FogType.ATMOSPHERIC) {
            return var1;
         } else {
            com.wimpyclient.k.a.tintFog(var1);
            return var1;
         }
      } else {
         return var1;
      }
   }
}
