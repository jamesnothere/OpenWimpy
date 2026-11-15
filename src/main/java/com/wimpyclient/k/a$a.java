package com.wimpyclient.k;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
final class a$a {
   final Vector3f pos = new Vector3f();
   final Vector3f vel = new Vector3f();
   final Vector3f[] trail = new Vector3f[16];
   boolean alive;
   float age;
   float life;
   float speed;
   float width;
   int core;
   int tail;
   int trailHead;
   int trailCount;

   a$a() {
      for (int var1 = 0; var1 < 16; var1++) {
         this.trail[var1] = new Vector3f();
      }
   }
}
