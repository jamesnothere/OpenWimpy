package com.wimpyclient.s;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public interface f$b {
   l terrain(int var1, int var2);

   e gateHeights(int var1, int var2);

   boolean othersMayWrite(int var1, int var2, int var3);

   byte shown(int var1, int var2, int var3);

   boolean predictedOre(int var1, int var2, int var3);
}
