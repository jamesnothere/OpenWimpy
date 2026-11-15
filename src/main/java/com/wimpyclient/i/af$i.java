package com.wimpyclient.i;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record af$i(double x, double y, double z, String detail, boolean sound) {
   static af$i sound(double var0, double var2, double var4, String var6) {
      return new af$i(var0, var2, var4, var6, true);
   }

   static af$i particle(double var0, double var2, double var4, String var6) {
      return new af$i(var0, var2, var4, var6, false);
   }
}
