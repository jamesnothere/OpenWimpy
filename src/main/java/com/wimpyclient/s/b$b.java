package com.wimpyclient.s;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.block.state.BlockState;

@Environment(EnvType.CLIENT)
public interface b$b {
   BlockState state(int var1, int var2, int var3);
}
