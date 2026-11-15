package com.wimpyclient.k;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.item.ItemStack;

@Environment(EnvType.CLIENT)
record o$a(double dist, float fbX, float fbY, String name, String suffix, int accent, ItemStack icon) {
}
