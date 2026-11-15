package com.wimpyclient.k;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.item.ItemStack;

@Environment(EnvType.CLIENT)
record o$b(double dist, float fbX, float fbY, AbstractClientPlayer player, String name, int ping, float health, float maxHealth, List<ItemStack> gear) {
}
