package com.wimpyclient.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.core.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({MultiPlayerGameMode.class})
public interface aj {
   @Accessor("isDestroying")
   boolean wimpyclient$isDestroying();

   @Accessor("isDestroying")
   void wimpyclient$setDestroying(boolean var1);

   @Accessor("destroyDelay")
   void wimpyclient$setDestroyDelay(int var1);

   @Accessor("destroyBlockPos")
   BlockPos wimpyclient$getDestroyBlockPos();

   @Invoker("ensureHasSentCarriedItem")
   void wimpyclient$syncCarriedItem();
}
