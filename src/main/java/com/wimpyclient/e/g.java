package com.wimpyclient.e;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class g {
   public static final int GRID = 9;
   public static final double REGION_SIZE = 50000.0;
   public static final double MAP_OFFSET = 225000.0;
   public static final int WORLD_SPAN = 450000;
   public static final String[] TYPE_NAMES = new String[]{"EU-C", "EU-W", "NA-E", "NA-W", "Asia", "Oce"};
   public static final int[] TYPE_COLORS = new int[]{-12723049, -14702452, -10838060, -12748200, -2050998, -2525080};
   private static final int[][] LAYOUT = new int[][]{
      {82, 5},
      {100, 3},
      {101, 3},
      {102, 3},
      {103, 2},
      {104, 2},
      {105, 2},
      {106, 2},
      {91, 2},
      {83, 5},
      {44, 3},
      {75, 3},
      {42, 3},
      {41, 2},
      {40, 2},
      {39, 2},
      {38, 2},
      {92, 2},
      {84, 5},
      {45, 3},
      {14, 3},
      {13, 3},
      {12, 2},
      {11, 2},
      {10, 2},
      {37, 2},
      {93, 2},
      {85, 5},
      {46, 5},
      {74, 5},
      {3, 3},
      {2, 2},
      {1, 2},
      {25, 2},
      {36, 2},
      {94, 2},
      {86, 4},
      {47, 4},
      {72, 4},
      {71, 4},
      {5, 2},
      {4, 2},
      {24, 2},
      {35, 2},
      {95, 2},
      {87, 4},
      {51, 1},
      {17, 1},
      {9, 0},
      {8, 0},
      {7, 0},
      {23, 0},
      {34, 0},
      {96, 2},
      {88, 4},
      {54, 1},
      {18, 1},
      {61, 0},
      {62, 0},
      {21, 0},
      {22, 0},
      {33, 0},
      {97, 0},
      {89, 0},
      {26, 1},
      {27, 0},
      {28, 0},
      {29, 0},
      {30, 0},
      {59, 0},
      {32, 0},
      {98, 0},
      {90, 0},
      {107, 1},
      {108, 1},
      {109, 1},
      {110, 1},
      {111, 1},
      {112, 1},
      {113, 1},
      {99, 0}
   };
   private static final int[] REGION_ID = new int[81];
   private static final int[] REGION_TYPE = new int[81];

   private g() {
   }

   public static int gridIndex(double var0) {
      return (int)Math.floor((var0 + 225000.0) / 50000.0);
   }

   public static boolean onMap(double var0, double var2) {
      int var4 = gridIndex(var0);
      int var5 = gridIndex(var2);
      return var4 >= 0 && var4 < 9 && var5 >= 0 && var5 < 9;
   }

   public static int cellIndex(int var0, int var1) {
      return var1 * 9 + var0;
   }

   public static int regionIdAt(int var0) {
      return var0 >= 0 && var0 < REGION_ID.length ? REGION_ID[var0] : -1;
   }

   public static int regionTypeAt(int var0) {
      return var0 >= 0 && var0 < REGION_TYPE.length ? REGION_TYPE[var0] : -1;
   }

   public static int regionIdAtWorld(double var0, double var2) {
      return !onMap(var0, var2) ? -1 : regionIdAt(cellIndex(gridIndex(var0), gridIndex(var2)));
   }

   public static int regionTypeAtWorld(double var0, double var2) {
      return !onMap(var0, var2) ? -1 : regionTypeAt(cellIndex(gridIndex(var0), gridIndex(var2)));
   }

   public static String typeName(int var0) {
      return var0 >= 0 && var0 < TYPE_NAMES.length ? TYPE_NAMES[var0] : "";
   }

   public static int typeRgb(int var0) {
      return var0 >= 0 && var0 < TYPE_COLORS.length ? TYPE_COLORS[var0] : -1;
   }

   public static double cellFraction(double var0) {
      double var2 = (var0 + 225000.0) % 50000.0 / 50000.0;
      if (var2 < 0.0) {
         var2++;
      }

      return Math.clamp(var2, 0.0, 1.0);
   }

   static {
      for (int var0 = 0; var0 < LAYOUT.length && var0 < REGION_ID.length; var0++) {
         REGION_ID[var0] = LAYOUT[var0][0];
         REGION_TYPE[var0] = Math.min(LAYOUT[var0][1], TYPE_NAMES.length - 1);
      }
   }
}
