package com.wimpyclient.f;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.chunk.DataLayer;

@Environment(EnvType.CLIENT)
final class a$e {
   public DataLayer[] layers;
   public int minLightSection;

   public a$e(DataLayer[] var1, int var2) {
      this.layers = var1;
      this.minLightSection = var2;
   }

   public void merge(DataLayer[] var1, int var2) {
      this.minLightSection = var2;
      if (var1.length > this.layers.length) {
         DataLayer[] var3 = new DataLayer[var1.length];
         System.arraycopy(this.layers, 0, var3, 0, this.layers.length);
         this.layers = var3;
      }

      for (int var4 = 0; var4 < var1.length; var4++) {
         if (var1[var4] != null) {
            if (this.layers[var4] == null) {
               this.layers[var4] = var1[var4];
            } else {
               this.layers[var4] = maxLayer(this.layers[var4], var1[var4]);
            }
         }
      }
   }

   private static DataLayer maxLayer(DataLayer var0, DataLayer var1) {
      DataLayer var2 = new DataLayer();

      for (int var3 = 0; var3 < 16; var3++) {
         for (int var4 = 0; var4 < 16; var4++) {
            for (int var5 = 0; var5 < 16; var5++) {
               int var6 = Math.max(var0.get(var5, var3, var4), var1.get(var5, var3, var4));
               if (var6 > 0) {
                  var2.set(var5, var3, var4, var6);
               }
            }
         }
      }

      return var2;
   }

   public int get(int var1, int var2, int var3) {
      int var4 = SectionPos.blockToSectionCoord(var2) - this.minLightSection;
      if (var4 >= 0 && var4 < this.layers.length) {
         DataLayer var5 = this.layers[var4];
         return var5 == null ? 0 : var5.get(var1 & 15, SectionPos.sectionRelative(var2), var3 & 15);
      } else {
         return 0;
      }
   }

   private boolean hasLayer(int var1) {
      int var2 = SectionPos.blockToSectionCoord(var1) - this.minLightSection;
      return var2 >= 0 && var2 < this.layers.length && this.layers[var2] != null;
   }
}
