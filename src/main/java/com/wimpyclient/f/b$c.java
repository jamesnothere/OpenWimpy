package com.wimpyclient.f;

import java.util.Objects;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class b$c {
   private final LongArrayList members;
   private final int score;
   private final double centroidBlockX;
   private final double centroidBlockZ;
   private final int minCx;
   private final int minCz;
   private final int maxCx;
   private final int maxCz;
   private static int rS59VDk8iT;
   private transient int L9ypMSmPio;
   private static byte[] vufhhrcoov = evxoesxgdqfvsnb();

   public b$c(LongArrayList members, int score, double centroidBlockX, double centroidBlockZ, int minCx, int minCz, int maxCx, int maxCz) {
super();
      int var32 = 414758066 ^ 1369486466;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
            case 98219585:
            default:
               throw new RuntimeException(new IOException());
            case 228510021:
               var32 = 1076448476 ^ var32;
            case 2042522388:
               var32 = 1198887712 ^ 860512784 ^ Integer.parseInt("2098118108");
               this.L9ypMSmPio = 873314218 ^ rS59VDk8iT;
               var32 = zxxjcsibhwspvxlw(var32, 156667063);
               this.members = members;
               this.score = score;
               this.centroidBlockX = centroidBlockX;
               this.centroidBlockZ = centroidBlockZ;
               this.minCx = minCx;
               this.minCz = minCz;
               this.maxCx = maxCx;
               this.maxCz = maxCz;
               return;
            case 1270063184:
         }
      }
   }

   @Override
   public final String toString() {
      int var5 = 356885763 ^ 1906927031 ^ 1097305371;
      var5 = 1565412037 ^ var5;
      return "b$c[members=" + this.members + ", score=" + this.score + ", centroidBlockX=" + this.centroidBlockX + ", centroidBlockZ=" + this.centroidBlockZ + ", minCx=" + this.minCx + ", minCz=" + this.minCz + ", maxCx=" + this.maxCx + ", maxCz=" + this.maxCz + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 25564512 ^ 468320593 ^ 1097305371;
      var5 = 1434115202 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.members);
      result = 31 * result + Objects.hashCode(this.score);
      result = 31 * result + Objects.hashCode(this.centroidBlockX);
      result = 31 * result + Objects.hashCode(this.centroidBlockZ);
      result = 31 * result + Objects.hashCode(this.minCx);
      result = 31 * result + Objects.hashCode(this.minCz);
      result = 31 * result + Objects.hashCode(this.maxCx);
      result = 31 * result + Objects.hashCode(this.maxCz);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 921363449 ^ 213297082 ^ 1097305371;
      var7 = 1719321980 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      b$c other = (b$c)var1;
      return Objects.equals(this.members, other.members) &&
      this.score == other.score &&
      Double.compare(this.centroidBlockX, other.centroidBlockX) == 0 &&
      Double.compare(this.centroidBlockZ, other.centroidBlockZ) == 0 &&
      this.minCx == other.minCx &&
      this.minCz == other.minCz &&
      this.maxCx == other.maxCx &&
      this.maxCz == other.maxCz;
   }

   public LongArrayList members() {
      int var5 = 1948189749 ^ 1001025162 ^ 1097305371;
      var5 = 1086364155 ^ var5;
      return this.members;
   }

   public int score() {
      int var5 = 889415285 ^ 1562771237 ^ 1097305371;
      var5 = 268536177 ^ var5;
      return this.score;
   }

   public double centroidBlockX() {
      int var5 = 1312600600 ^ 1146726073 ^ 1097305371;
      var5 = 135198750 ^ var5;
      return this.centroidBlockX;
   }

   public double centroidBlockZ() {
      int var5 = 1396772598 ^ 1994204559 ^ 1097305371;
      var5 = 763400262 ^ var5;
      return this.centroidBlockZ;
   }

   public int minCx() {
      int var5 = 1831826075 ^ 938333017 ^ 1097305371;
      var5 = 1542207351 ^ var5;
      return this.minCx;
   }

   public int minCz() {
      int var5 = 530948066 ^ 152691634 ^ 1097305371;
      var5 = 1510208660 ^ var5;
      return this.minCz;
   }

   public int maxCx() {
      int var5 = 951849339 ^ 1664888535 ^ 1097305371;
      var5 = 180152634 ^ var5;
      return this.maxCx;
   }

   public int maxCz() {
      int var5 = 1230626452 ^ 105131876 ^ 1097305371;
      var5 = 771077246 ^ var5;
      return this.maxCz;
   }

   static {
      int var3 = new Random(8768148527140681965L).nextInt();
      rS59VDk8iT = -2027315803 ^ var3;
   }

   public static String lridanabvi(byte[] var0, int var1) {
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
         byte[] var27 = vufhhrcoov;
         byte[] var34 = vufhhrcoov;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] evxoesxgdqfvsnb() {
      return new byte[]{
         63,
         32,
         59,
         110,
         110,
         75,
         69,
         98,
         11,
         63,
         121,
         100,
         33,
         22,
         16,
         96,
         116,
         78,
         64,
         121,
         20,
         34,
         64,
         88,
         41,
         97,
         19,
         75,
         27,
         2,
         93,
         110,
         121,
         115,
         14,
         75,
         88,
         111,
         113,
         46,
         34,
         61,
         90,
         103,
         44,
         20,
         84,
         67,
         118,
         7,
         116,
         50,
         23,
         28,
         50,
         54,
         94,
         12,
         55,
         111,
         5,
         46,
         35,
         27,
         9,
         114,
         120,
         120,
         30,
         1,
         39,
         31,
         94,
         71,
         22
      };
   }

   private static int zxxjcsibhwspvxlw(int var0, int var1) {
      return var1 ^ var0;
   }
}
