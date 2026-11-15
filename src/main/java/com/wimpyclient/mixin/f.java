package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.chunk.ChunkAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({ChunkAccess.class})
public class f {
   public f() {
   }

   @Inject(
      method = {"setBlockEntityNbt(Lnet/minecraft/nbt/CompoundTag;)V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$storageDirtyOnPendingBe(CompoundTag var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         ChunkAccess var3 = (ChunkAccess)(Object)this;
         BlockPos var4 = BlockEntity.getPosFromTag(var3.getPos(), var1);
         if (var4 != null) {
            com.wimpyclient.f.a.INSTANCE.markStorageChunkDirty(var4);
            com.wimpyclient.f.a.INSTANCE.invalidateSusScan(new ChunkPos(var4).toLong());
         }
      }
   }
}
