package com.wimpyclient.f;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;

@Environment(EnvType.CLIENT)
final class a$f {
   private final int chunkMinX;
   private final int chunkMaxX;
   private final int chunkMinZ;
   private final int chunkMaxZ;
   private long sumX;
   private long sumY;
   private long sumZ;
   private int n;
   private int inChunk;
   private int minX = Integer.MAX_VALUE;
   private int minZ = Integer.MAX_VALUE;
   private int maxX = Integer.MIN_VALUE;
   private int maxZ = Integer.MIN_VALUE;

   public a$f(int var1, int var2, int var3, int var4) {
      this.chunkMinX = var1;
      this.chunkMaxX = var2;
      this.chunkMinZ = var3;
      this.chunkMaxZ = var4;
   }

   public void add(long var1) {
      int var3 = BlockPos.getX(var1);
      int var4 = BlockPos.getY(var1);
      int var5 = BlockPos.getZ(var1);
      this.sumX += var3;
      this.sumY += var4;
      this.sumZ += var5;
      this.n++;
      this.minX = Math.min(this.minX, var3);
      this.maxX = Math.max(this.maxX, var3);
      this.minZ = Math.min(this.minZ, var5);
      this.maxZ = Math.max(this.maxZ, var5);
      if (var3 >= this.chunkMinX && var3 <= this.chunkMaxX && var5 >= this.chunkMinZ && var5 <= this.chunkMaxZ) {
         this.inChunk++;
      }
   }

   public boolean belongsToChunk() {
      if (this.inChunk > 0) {
         return true;
      } else if (this.n <= 0) {
         return false;
      } else {
         int var1 = (int)(this.sumX / this.n);
         int var2 = (int)(this.sumZ / this.n);
         return var1 >= this.chunkMinX && var1 <= this.chunkMaxX && var2 >= this.chunkMinZ && var2 <= this.chunkMaxZ;
      }
   }

   public boolean betterThan(a$f var1) {
      if (this.inChunk != var1.inChunk) {
         return this.inChunk > var1.inChunk;
      } else {
         return this.belongsToChunk() != var1.belongsToChunk() ? this.belongsToChunk() : this.n > var1.n;
      }
   }

   public BlockPos center() {
      return this.n <= 0 ? BlockPos.ZERO : new BlockPos((int)(this.sumX / this.n), (int)(this.sumY / this.n), (int)(this.sumZ / this.n));
   }

   public int minX() {
      return this.minX;
   }

   public int minZ() {
      return this.minZ;
   }

   public int maxX() {
      return this.maxX;
   }

   public int maxZ() {
      return this.maxZ;
   }
}
