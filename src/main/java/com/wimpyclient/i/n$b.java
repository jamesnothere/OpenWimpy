package com.wimpyclient.i;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.chat.Style;

@Environment(EnvType.CLIENT)
record n$b(Style style, String text) {
}
