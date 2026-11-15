package com.wimpyclient.s;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
interface g$b {
   long seed();

   int gateLow(int var1, int var2);

   int gateHigh(int var1, int var2);

   byte base(int var1, int var2, int var3);

   byte air(int var1, int var2, int var3);

   boolean inBiome(h var1, int var2, int var3, int var4);
}
