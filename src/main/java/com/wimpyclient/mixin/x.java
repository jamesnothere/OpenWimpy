package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import java.util.Map;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.game.ClientboundLevelChunkPacketData.BlockEntityTagOutput;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({LevelChunk.class})
public class x {
   public x() {
   }

   @Inject(
      method = {"setBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$storageDirtyOnSet(BlockEntity var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         if (var1 != null) {
            long var3 = ChunkPos.asLong(var1.getBlockPos());
            com.wimpyclient.f.a.INSTANCE.markStorageChunkDirty(var3);
            com.wimpyclient.f.a.INSTANCE.invalidateSusScan(var3);
         }
      }
   }

   @Inject(
      method = {"addAndRegisterBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$storageDirtyOnAdd(BlockEntity var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         if (var1 != null) {
            long var3 = ChunkPos.asLong(var1.getBlockPos());
            com.wimpyclient.f.a.INSTANCE.markStorageChunkDirty(var3);
            com.wimpyclient.f.a.INSTANCE.invalidateSusScan(var3);
         }
      }
   }

   @Inject(
      method = {"removeBlockEntity(Lnet/minecraft/core/BlockPos;)V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$storageDirtyOnRemove(BlockPos var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         long var3 = new ChunkPos(var1).toLong();
         com.wimpyclient.f.a.INSTANCE.markStorageChunkDirty(var3);
         com.wimpyclient.f.a.INSTANCE.invalidateSusScan(var3);
      }
   }

   @Inject(
      method = {"replaceWithPacketData(Lnet/minecraft/network/FriendlyByteBuf;Ljava/util/Map;Ljava/util/function/Consumer;)V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$invalidateSusOnChunkData(FriendlyByteBuf var1, Map<Types, long[]> var2, Consumer<BlockEntityTagOutput> var3, CallbackInfo var4) {
      if (BridgeGate.ready()) {
         LevelChunk var5 = (LevelChunk)(Object)this;
         long var6 = var5.getPos().toLong();
         com.wimpyclient.f.a.INSTANCE.invalidateSusScan(var6);
         com.wimpyclient.f.a.INSTANCE.markStorageChunkDirty(var6);
         com.wimpyclient.f.a.INSTANCE.markBlockEspChunkDirty(var6);
      }
   }
}
