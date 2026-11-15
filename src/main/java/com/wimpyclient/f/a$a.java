package com.wimpyclient.f;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;

@Environment(EnvType.CLIENT)
final class a$a {
   public int minX= Integer.MAX_VALUE;
   public int minZ= Integer.MAX_VALUE;
   public int maxX= Integer.MIN_VALUE;
   public int maxZ= Integer.MIN_VALUE;
   private int leakMinX = Integer.MAX_VALUE;
   private int leakMinZ = Integer.MAX_VALUE;
   private int leakMaxX = Integer.MIN_VALUE;
   private int leakMaxZ = Integer.MIN_VALUE;
   private int leakCount;
   private int shellMinY = Integer.MAX_VALUE;
   private int shellMaxY = Integer.MIN_VALUE;
   private final LongOpenHashSet shellSeeds = new LongOpenHashSet();
   private int blocks;
   public int shellBlocks;
   private long shellSumX;
   private long shellSumY;
   private long shellSumZ;
   public int iconY= Integer.MIN_VALUE;
   public BlockPos icon;
   public int crystalIconY= Integer.MIN_VALUE;
   public BlockPos crystalIcon;
   private BlockPos worldCenter;

   public a$a() {
   }

   public void occupyWorldBounds(int var1, int var2, int var3, int var4) {
      if (var1 <= var3 && var2 <= var4) {
         this.minX = Math.min(this.minX, var1);
         this.minZ = Math.min(this.minZ, var2);
         this.maxX = Math.max(this.maxX, var3);
         this.maxZ = Math.max(this.maxZ, var4);
      }
   }

   public void setWorldCenter(BlockPos var1) {
      this.worldCenter = var1;
   }

   public void noteGeodeShell(int var1, int var2, int var3, int var4, int var5) {
      this.noteInterior(var1, var2, var3);
      this.shellSeeds.add(a.packLocalCell(var4, var2, var5));
      this.shellMinY = Math.min(this.shellMinY, var2);
      this.shellMaxY = Math.max(this.shellMaxY, var2);
      this.shellBlocks++;
      this.shellSumX += var1;
      this.shellSumY += var2;
      this.shellSumZ += var3;
   }

   public void noteInterior(int var1, int var2, int var3) {
      this.blocks++;
      this.minX = Math.min(this.minX, var1);
      this.maxX = Math.max(this.maxX, var1);
      this.minZ = Math.min(this.minZ, var3);
      this.maxZ = Math.max(this.maxZ, var3);
   }

   public BlockPos findGeodeCenter() {
      if (this.worldCenter != null) {
         return this.worldCenter;
      } else {
         return this.shellBlocks < 1
            ? null
            : new BlockPos((int)(this.shellSumX / this.shellBlocks), (int)(this.shellSumY / this.shellBlocks), (int)(this.shellSumZ / this.shellBlocks));
      }
   }

   public void noteLeak(int var1, int var2) {
      this.leakCount++;
      this.leakMinX = Math.min(this.leakMinX, var1);
      this.leakMaxX = Math.max(this.leakMaxX, var1);
      this.leakMinZ = Math.min(this.leakMinZ, var2);
      this.leakMaxZ = Math.max(this.leakMaxZ, var2);
   }
}
