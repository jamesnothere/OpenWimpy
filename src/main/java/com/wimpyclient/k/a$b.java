package com.wimpyclient.k;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
final class a$b {
   final Vector3f dir = new Vector3f();
   float size;
   float phase;
   float twinkle;
   float gain;
   int tint;
   boolean sparkle;

   public a$b() {
   }
}
