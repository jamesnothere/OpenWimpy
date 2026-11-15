package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({ClientLevel.class})
public class h {
   public h() {
   }

   @Inject(
      method = {"setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;II)Z"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$blockEspDirtyBeforeSet(BlockPos var1, BlockState var2, int var3, int var4, CallbackInfoReturnable<Boolean> var5) {
      ClientLevel var6 = (ClientLevel)(Object)this;
      if (BridgeGate.ready()) {
         if (com.wimpyclient.f.a.isTrackedBlockEspBlock(var2.getBlock()) || com.wimpyclient.f.a.isTrackedBlockEspBlock(var6.getBlockState(var1).getBlock())) {
            com.wimpyclient.f.a.INSTANCE.markBlockEspChunkDirty(var1);
         }
      }
   }

   @Inject(
      method = {"setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;II)Z"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$storageDirtyOnBlockChange(BlockPos var1, BlockState var2, int var3, int var4, CallbackInfoReturnable<Boolean> var5) {
      if (BridgeGate.ready() && Boolean.TRUE.equals(var5.getReturnValue())) {
         if (com.wimpyclient.f.a.isTrackedStorageBlock(var2.getBlock())) {
            com.wimpyclient.f.a.INSTANCE.markStorageChunkDirty(var1);
         }
      }
   }

   @Inject(
      method = {"playSeededSound(Lnet/minecraft/world/entity/Entity;DDDLnet/minecraft/core/Holder;Lnet/minecraft/sounds/SoundSource;FFJ)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$playerChunkFromSound(
      Entity var1, double var2, double var4, double var6, Holder<SoundEvent> var8, SoundSource var9, float var10, float var11, long var12, CallbackInfo var14
   ) {
      if (BridgeGate.ready()) {
         com.wimpyclient.f.a.INSTANCE.onPositionalSound(var2, var4, var6, var8, var9);
         com.wimpyclient.i.af.INSTANCE.onPositionalSound(var2, var4, var6, var8, var9);
         com.wimpyclient.f.h.INSTANCE.onSound(var2, var4, var6, (SoundEvent)var8.value(), var9);
      }
   }

   @Inject(
      method = {"playLocalSound(DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$playerChunkFromLocalSound(
      double var1, double var3, double var5, SoundEvent var7, SoundSource var8, float var9, float var10, boolean var11, CallbackInfo var12
   ) {
      if (BridgeGate.ready()) {
         com.wimpyclient.f.a.INSTANCE.onPositionalSound(var1, var3, var5, var7, var8);
         com.wimpyclient.i.af.INSTANCE.onPositionalSound(var1, var3, var5, var7, var8);
         com.wimpyclient.f.h.INSTANCE.onSound(var1, var3, var5, var7, var8);
      }
   }

   @Inject(
      method = {"destroyBlockProgress(ILnet/minecraft/core/BlockPos;I)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$playerChunkFromDig(int var1, BlockPos var2, int var3, CallbackInfo var4) {
      if (BridgeGate.ready()) {
         com.wimpyclient.f.a.INSTANCE.onBlockDestructionProgress((ClientLevel)(Object)this, var1, var2, var3);
         com.wimpyclient.f.h.INSTANCE.onDigProgress(var1, var2, var3);
      }
   }

   @Inject(
      method = {"levelEvent(Lnet/minecraft/world/entity/Entity;ILnet/minecraft/core/BlockPos;I)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$playerChunkFromLevelEvent(Entity var1, int var2, BlockPos var3, int var4, CallbackInfo var5) {
      if (BridgeGate.ready()) {
         com.wimpyclient.f.a.INSTANCE.onLevelEvent(var2, var3, var4);
         com.wimpyclient.i.af.INSTANCE.onLevelEvent(var2, var3, var4);
         com.wimpyclient.f.h.INSTANCE.onLevelEvent(var2, var3, var4);
      }
   }

   @Inject(
      method = {"setServerVerifiedBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$onServerBlockUpdate(BlockPos var1, BlockState var2, int var3, CallbackInfo var4) {
      ClientLevel var5 = (ClientLevel)(Object)this;
      if (BridgeGate.ready()) {
         BlockState var6 = var5.getBlockState(var1);
         if (var6 != var2) {
            com.wimpyclient.f.a.INSTANCE.onServerBlockUpdate(var1, var6, var2);
            com.wimpyclient.f.h.INSTANCE.onBlockUpdate(var1, var6, var2);
            if (com.wimpyclient.f.a.isTrackedStorageBlock(var2.getBlock()) || com.wimpyclient.f.a.isTrackedStorageBlock(var6.getBlock())) {
               com.wimpyclient.f.a.INSTANCE.markStorageChunkDirty(var1);
            }

            if (com.wimpyclient.f.a.isTrackedBlockEspBlock(var2.getBlock()) || com.wimpyclient.f.a.isTrackedBlockEspBlock(var6.getBlock())) {
               com.wimpyclient.f.a.INSTANCE.markBlockEspChunkDirty(var1);
            }
         }
      }
   }
}
