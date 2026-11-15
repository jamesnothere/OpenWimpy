package com.wimpyclient.f;

import java.util.Arrays;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class h$b {
   final int minLightSection;
   final int lightSectionCount;
   final h$d[] block;
   final boolean[] culled;
   final boolean[] blockLeak;
   boolean culledReady;
   boolean mineshaft;
   boolean peakValid;
   int peakValue = -1;
   int peakLx;
   int peakLy;
   int peakLz;
   int peakSectionY;

   h$b(int var1, int var2) {
      this.minLightSection = var1;
      this.lightSectionCount = var2;
      int var3 = Math.max(1, var2);
      this.block = new h$d[var3];
      this.culled = new boolean[var3];
      this.blockLeak = new boolean[var3];
      Arrays.fill(this.block, h$d.UNKNOWN);
   }
}
