package com.wimpyclient.f;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;

@Environment(EnvType.CLIENT)
final class h$f {
   BlockPos pos;
   LongOpenHashSet members;
   int score;
   int softLit;
   int hardLit;
   int activity;
   boolean locked;

   h$f(BlockPos var1, LongOpenHashSet var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.pos = var1;
      this.members = var2;
      this.score = var3;
      this.softLit = var4;
      this.hardLit = var5;
      this.activity = var6;
      this.locked = var7;
   }
}
