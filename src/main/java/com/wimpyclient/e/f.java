package com.wimpyclient.e;

import java.util.Arrays;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class f {
   public static final f INSTANCE = new f();
   public static final int GRID = 9;
   private final int[] counts = new int[81];
   private int[] renderCopy = new int[81];
   private int total;
   private int maxCount;
   private boolean dirty;
   private boolean renderDirty = true;

   private f() {
   }

   public synchronized boolean recordLanding(double var1, double var3) {
      if (!g.onMap(var1, var3)) {
         return false;
      } else {
         int var5 = g.gridIndex(var1);
         int var6 = g.gridIndex(var3);
         int var7 = var6 * 9 + var5;
         int var8 = this.counts[var7] + 1;
         this.counts[var7] = var8;
         this.total++;
         if (var8 > this.maxCount) {
            this.maxCount = var8;
         }

         this.dirty = true;
         this.renderDirty = true;
         return true;
      }
   }

   public synchronized void clear() {
      Arrays.fill(this.counts, 0);
      this.total = 0;
      this.maxCount = 0;
      this.dirty = true;
      this.renderDirty = true;
   }

   public synchronized int countAt(int var1, int var2) {
      return var1 >= 0 && var2 >= 0 && var1 < 9 && var2 < 9 ? this.counts[var2 * 9 + var1] : 0;
   }

   public synchronized int total() {
      return this.total;
   }

   public synchronized int maxCount() {
      return this.maxCount;
   }

   public synchronized int[] snapshotCounts() {
      if (this.renderDirty) {
         System.arraycopy(this.counts, 0, this.renderCopy, 0, this.counts.length);
         this.renderDirty = false;
      }

      return this.renderCopy;
   }

   public synchronized boolean consumeDirty() {
      boolean var1 = this.dirty;
      this.dirty = false;
      return var1;
   }

   public synchronized boolean isDirty() {
      return this.dirty;
   }

   public synchronized int[] exportCounts() {
      return (int[])this.counts.clone();
   }

   public synchronized void importCounts(int[] var1) {
      Arrays.fill(this.counts, 0);
      this.total = 0;
      this.maxCount = 0;
      if (var1 != null) {
         int var2 = Math.min(var1.length, this.counts.length);

         for (int var3 = 0; var3 < var2; var3++) {
            int var4 = Math.max(0, var1[var3]);
            this.counts[var3] = var4;
            this.total += var4;
            if (var4 > this.maxCount) {
               this.maxCount = var4;
            }
         }

         this.dirty = false;
         this.renderDirty = true;
      }
   }
}
