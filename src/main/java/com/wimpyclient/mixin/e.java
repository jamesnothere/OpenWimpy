package com.wimpyclient.mixin;

import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.chunk.ChunkAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({ChunkAccess.class})
public interface e {
   @Accessor("pendingBlockEntities")
   Map<BlockPos, CompoundTag> wimpyclient$pendingBlockEntities();
}
