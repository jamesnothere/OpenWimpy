package com.wimpyclient.f;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class h$a {
   int strength;
   long lastMs;

   public h$a() {
   }

   void add(int var1, long var2) {
      this.decay(var2);
      this.strength = Math.min(40, this.strength + Math.max(0, var1));
      this.lastMs = var2;
   }

   int strength(long var1) {
      this.decay(var1);
      return this.strength;
   }

   private void decay(long var1) {
      if (this.lastMs <= 0L) {
         this.lastMs = var1;
      } else {
         long var3 = var1 - this.lastMs;
         if (var3 >= 2000L) {
            int var5 = (int)(var3 / 2000L);
            if (var5 > 0) {
               this.strength = Math.max(0, this.strength - var5);
               this.lastMs = var1;
            }
         }
      }
   }
}
