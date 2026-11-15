package com.wimpyclient.f;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class e$b {
   private final int minY;
   private final int maxY;
   private final int stackHeight;
   private static int f0dtDsPW33O;
   private transient int WHrm0YsSou;
   private static byte[] iqjjetflln = brlzhuanyyrpnea();

   public e$b(int minY, int maxY, int stackHeight) {
super();
      int var13 = 1546608001 ^ 1031639061;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
            case 153087105:
            default:
               throw new IllegalStateException();
            case 210767644:
               var13 = 1493628364 ^ var13;
            case 727251622:
               var13 = 1963603797 ^ 184717445 ^ Integer.parseInt("1180475272");
               this.WHrm0YsSou = 435890746 ^ f0dtDsPW33O;
               var13 = 1027256787 ^ var13;
               this.minY = minY;
               this.maxY = maxY;
               this.stackHeight = stackHeight;
               return;
            case 975438530:
         }
      }
   }

   @Override
   public final String toString() {
      int var5 = 953356300 ^ 1766831773 ^ 1501650481;
      var5 = 718182803 ^ var5;
      return "e$b[minY=" + this.minY + ", maxY=" + this.maxY + ", stackHeight=" + this.stackHeight + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 825260542 ^ 51171963 ^ 1501650481;
      var5 = 436437528 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.minY);
      result = 31 * result + Objects.hashCode(this.maxY);
      result = 31 * result + Objects.hashCode(this.stackHeight);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 2065534624 ^ 340817040 ^ 1501650481;
      var7 = 1942973931 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      e$b other = (e$b)var1;
      return this.minY == other.minY &&
      this.maxY == other.maxY &&
      this.stackHeight == other.stackHeight;
   }

   public int minY() {
      int var5 = 748113843 ^ 1795675837 ^ 1501650481;
      var5 = 945464511 ^ var5;
      return this.minY;
   }

   public int maxY() {
      int var5 = 949610472 ^ 1856262009 ^ 1501650481;
      var5 = 1804351292 ^ var5;
      return this.maxY;
   }

   public int stackHeight() {
      int var5 = 317483344 ^ 1086880787 ^ 1501650481;
      var5 = 1191205265 ^ var5;
      return this.stackHeight;
   }

   static {
      int var3 = new Random(5864126626429963295L).nextInt();
      f0dtDsPW33O = -1185343388 ^ var3;
   }

   public static String bkielfgwaj(byte[] var0, int var1) {
      String var8 = Integer.toString(var1);
      byte[] var9 = var8.getBytes();
      byte[] var6 = var9;
      byte var10 = 0;
      int var7 = var10;

      while (true) {
         int var15 = var0.length;
         if (var7 >= var15) {
            Charset var29 = StandardCharsets.UTF_16;
            return new String(var0, var29);
         }

         byte var18 = var0[var7];
         int var33 = var6.length;
         int var30 = var7 % var33;
         byte var26 = var6[var30];
         int var19 = var18 ^ var26;
         byte var20 = (byte)var19;
         var0[var7] = var20;
         byte var21 = var0[var7];
         byte[] var27 = iqjjetflln;
         byte[] var34 = iqjjetflln;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] brlzhuanyyrpnea() {
      return new byte[]{
         13,
         120,
         23,
         49,
         89,
         65,
         60,
         44,
         61,
         31,
         94,
         66,
         76,
         75,
         100,
         58,
         80,
         38,
         122,
         22,
         59,
         27,
         85,
         122,
         91,
         115,
         21,
         81,
         36,
         121,
         54,
         49,
         110,
         36,
         33,
         1,
         99,
         116,
         16,
         64,
         71,
         30,
         115,
         98,
         82,
         93,
         99,
         27,
         85,
         6,
         6,
         86,
         86,
         73,
         112,
         48,
         123,
         114,
         101,
         21,
         96,
         45,
         71,
         17,
         83,
         10,
         114,
         105,
         12,
         101,
         13,
         6,
         17,
         44,
         32,
         5,
         84,
         93,
         56,
         81,
         100,
         89,
         20,
         107,
         120,
         11,
         64,
         120,
         60,
         60,
         60,
         24,
         66,
         50,
         9,
         60,
         63,
         30,
         110,
         107,
         15,
         114,
         127,
         76,
         124,
         89,
         113,
         85,
         107
      };
   }
}
