package com.wimpyclient.f;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.chunk.DataLayer;
import net.minecraft.world.level.lighting.LayerLightEventListener;
import net.minecraft.world.level.lighting.LevelLightEngine;

@Environment(EnvType.CLIENT)
final class a$d {
   public static final a$d EMPTY= new a$d(new DataLayer[0], 0, true);
   private final DataLayer[] layers;
   private final int minLightSection;
   private final boolean empty;

   public a$d(DataLayer[] var1, int var2, boolean var3) {
      this.layers = var1;
      this.minLightSection = var2;
      this.empty = var3;
   }

   public static a$d copyOf(a$e var0) {
      if (var0 != null && var0.layers != null && var0.layers.length != 0) {
         DataLayer[] var1 = new DataLayer[var0.layers.length];
         boolean var2 = false;

         for (int var3 = 0; var3 < var1.length; var3++) {
            if (var0.layers[var3] != null) {
               var1[var3] = copyLayer(var0.layers[var3]);
               var2 = true;
            }
         }

         return !var2 ? EMPTY : new a$d(var1, var0.minLightSection, false);
      } else {
         return EMPTY;
      }
   }

   public static a$d copyEngine(ClientLevel var0, int var1, int var2) {
      if (var0 == null) {
         return EMPTY;
      } else {
         LevelLightEngine var3 = var0.getLightEngine();
         LayerLightEventListener var4 = var3.getLayerListener(LightLayer.BLOCK);
         int var5 = var3.getMinLightSection();
         int var6 = var3.getLightSectionCount();
         DataLayer[] var7 = new DataLayer[var6];
         boolean var8 = false;

         for (int var9 = 0; var9 < var6; var9++) {
            DataLayer var10 = var4.getDataLayerData(SectionPos.of(var1, var5 + var9, var2));
            if (var10 != null && !var10.isEmpty()) {
               var7[var9] = var10.copy();
               var8 = true;
            }
         }

         return !var8 ? EMPTY : new a$d(var7, var5, false);
      }
   }

   private static DataLayer copyLayer(DataLayer var0) {
      return var0.copy();
   }

   public boolean empty() {
      return this.empty;
   }

   public int get(int var1, int var2, int var3) {
      int var4 = SectionPos.blockToSectionCoord(var2) - this.minLightSection;
      if (var4 >= 0 && var4 < this.layers.length) {
         DataLayer var5 = this.layers[var4];
         return var5 == null ? 0 : var5.get(var1, SectionPos.sectionRelative(var2), var3);
      } else {
         return 0;
      }
   }

   public boolean hasLayer(int var1) {
      int var2 = SectionPos.blockToSectionCoord(var1) - this.minLightSection;
      return var2 >= 0 && var2 < this.layers.length && this.layers[var2] != null;
   }

   private boolean hasBrighterNeighbor(int var1, int var2, int var3, int var4) {
      for (Direction var8 : Direction.values()) {
         int var9 = var1 + var8.getStepX();
         int var10 = var3 + var8.getStepZ();
         if (var9 >= 0 && var9 <= 15 && var10 >= 0 && var10 <= 15 && this.get(var9, var2 + var8.getStepY(), var10) > var4) {
            return true;
         }
      }

      return false;
   }

   private int sameLightNeighborCount(int var1, int var2, int var3, int var4) {
      int var5 = 0;

      for (Direction var9 : Direction.values()) {
         int var10 = var1 + var9.getStepX();
         int var11 = var3 + var9.getStepZ();
         if (var10 >= 0 && var10 <= 15 && var11 >= 0 && var11 <= 15 && this.get(var10, var2 + var9.getStepY(), var11) == var4) {
            var5++;
         }
      }

      return var5;
   }

   private boolean hasDimmerNeighbor(int var1, int var2, int var3, int var4) {
      for (Direction var8 : Direction.values()) {
         int var9 = var1 + var8.getStepX();
         int var10 = var3 + var8.getStepZ();
         if (var9 >= 0 && var9 <= 15 && var10 >= 0 && var10 <= 15) {
            int var11 = this.get(var9, var2 + var8.getStepY(), var10);
            if (var11 > 0 && var11 < var4) {
               return true;
            }
         }
      }

      return false;
   }
}
