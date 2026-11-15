package com.wimpyclient.f;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;

@Environment(EnvType.CLIENT)
record h$e(BlockPos pos, int score, int softLit, int hardLit, int activity, long[] members) {
}
