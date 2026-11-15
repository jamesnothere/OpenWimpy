package com.wimpyclient.c;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public interface b {
   void wimpyclient$setRotation(float var1, float var2);

   void wimpyclient$setPosition(double var1, double var3, double var5);

   void wimpyclient$move(float var1);
}
