package com.wimpyclient.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.protocol.game.ClientboundLevelChunkPacketData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({ClientboundLevelChunkPacketData.class})
public interface y {
   @Accessor("buffer")
   byte[] wimpyclient$buffer();
}
