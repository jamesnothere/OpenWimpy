package com.wimpyclient.f;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class b$a {
   private final int minCx;
   private final int minCz;
   private final int maxCx;
   private final int maxCz;
   private final int centroidBlockX;
   private final int centroidBlockZ;
   private final int size;
   private final int score;
   private final long[] members;
   private static int kZ8sR7mHB7;
   private transient int DVHNz9abgQ;

   public b$a(int minCx, int minCz, int maxCx, int maxCz, int centroidBlockX, int centroidBlockZ, int size, int score, long[] members) {
super();
      int var31 = 404483831 ^ 234910337;
      
      var31 = 1935159393 ^ var31;
      var31 = 7253670 ^ 1820621158 ^ Integer.parseInt("162102231");
      this.DVHNz9abgQ = 967531085 ^ kZ8sR7mHB7;
      var31 = 1749734236 ^ var31;
      this.minCx = minCx;
      this.minCz = minCz;
      this.maxCx = maxCx;
      this.maxCz = maxCz;
      this.centroidBlockX = centroidBlockX;
      this.centroidBlockZ = centroidBlockZ;
      this.size = size;
      this.score = score;
      this.members = members;
   }

   @Override
   public final String toString() {
      int var5 = 1712582496 ^ 1048466593 ^ 246463501;
      var5 = 89042501 ^ var5;
      return "b$a[minCx=" + this.minCx + ", minCz=" + this.minCz + ", maxCx=" + this.maxCx + ", maxCz=" + this.maxCz + ", centroidBlockX=" + this.centroidBlockX + ", centroidBlockZ=" + this.centroidBlockZ + ", size=" + this.size + ", score=" + this.score + ", members=" + this.members + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 491747557 ^ 1413296199 ^ 246463501;
      var5 = 1305320326 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.minCx);
      result = 31 * result + Objects.hashCode(this.minCz);
      result = 31 * result + Objects.hashCode(this.maxCx);
      result = 31 * result + Objects.hashCode(this.maxCz);
      result = 31 * result + Objects.hashCode(this.centroidBlockX);
      result = 31 * result + Objects.hashCode(this.centroidBlockZ);
      result = 31 * result + Objects.hashCode(this.size);
      result = 31 * result + Objects.hashCode(this.score);
      result = 31 * result + Objects.hashCode(this.members);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1717055077 ^ 1130469036 ^ 246463501;
      var7 = 1227621725 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      b$a other = (b$a)var1;
      return this.minCx == other.minCx &&
      this.minCz == other.minCz &&
      this.maxCx == other.maxCx &&
      this.maxCz == other.maxCz &&
      this.centroidBlockX == other.centroidBlockX &&
      this.centroidBlockZ == other.centroidBlockZ &&
      this.size == other.size &&
      this.score == other.score &&
      Objects.equals(this.members, other.members);
   }

   public int minCx() {
      int var5 = 839090705 ^ 2051903869 ^ 246463501;
      var5 = 486511464 ^ var5;
      return this.minCx;
   }

   public int minCz() {
      int var5 = 60898290 ^ 1202827906 ^ 246463501;
      var5 = 1765920750 ^ var5;
      return this.minCz;
   }

   public int maxCx() {
      int var5 = 1017793868 ^ 212025808 ^ 246463501;
      var5 = 800452072 ^ var5;
      return this.maxCx;
   }

   public int maxCz() {
      int var5 = 1916175909 ^ 705972971 ^ 246463501;
      var5 = 1055986518 ^ var5;
      return this.maxCz;
   }

   public int centroidBlockX() {
      int var5 = 558986716 ^ 239546995 ^ 246463501;
      var5 = 1975522459 ^ var5;
      return this.centroidBlockX;
   }

   public int centroidBlockZ() {
      int var5 = 1175676078 ^ 303264405 ^ 246463501;
      var5 = 1306229586 ^ var5;
      return this.centroidBlockZ;
   }

   public int size() {
      int var5 = 1830206283 ^ 867895064 ^ 246463501;
      var5 = 1327777615 ^ var5;
      return this.size;
   }

   public int score() {
      int var5 = 1778688279 ^ 2037235491 ^ 246463501;
      var5 = 1555451459 ^ var5;
      return this.score;
   }

   public long[] members() {
      int var5 = 423457925 ^ 114172702 ^ 246463501;
      var5 = 1794736058 ^ var5;
      return this.members;
   }

   static {
      int var3 = new Random(-2756344986693458089L).nextInt();
      kZ8sR7mHB7 = -1208133623 ^ var3;
   }

   public static String ohlkdidxlz(byte[] var0, byte[] var1, int var2) {
      String var11 = Integer.toString(var2);
      byte[] var12 = var11.getBytes();
      byte[] var9 = var12;
      byte var13 = 0;
      int var10 = var13;

      while (true) {
         int var18 = var0.length;
         if (var10 >= var18) {
            Charset var6 = StandardCharsets.UTF_16;
            return new String(var0, var6);
         }

         byte var21 = var0[var10];
         int var34 = var9.length;
         int var31 = var10 % var34;
         byte var28 = var9[var31];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var10] = var23;
         byte var24 = var0[var10];
         int var36 = var1.length;
         int var33 = var10 % var36;
         byte var30 = var1[var33];
         int var25 = var24 ^ var30;
         byte var26 = (byte)var25;
         var0[var10] = var26;
         var10++;
      }
   }

   private static byte[] unibqrwashfsmyx() {
      return new byte[]{
         52,
         37,
         96,
         44,
         110,
         85,
         85,
         45,
         21,
         65,
         56,
         4,
         105,
         18,
         5,
         90,
         79,
         50,
         107,
         10,
         101,
         24,
         80,
         25,
         60,
         37,
         92,
         97,
         88,
         87,
         6,
         59,
         11,
         102,
         51,
         40,
         113,
         65,
         13,
         15,
         126,
         25,
         106,
         3,
         112,
         100,
         40,
         7,
         116,
         115,
         103,
         14,
         61,
         2,
         89,
         4,
         115,
         85,
         104,
         83,
         27,
         84,
         85,
         10,
         94,
         24,
         29,
         124,
         20,
         83,
         115,
         50,
         18,
         36,
         64,
         21,
         119,
         102,
         126,
         102,
         75,
         27,
         126,
         101,
         77,
         20,
         25,
         90,
         52,
         43,
         40,
         113,
         116,
         79,
         6,
         3,
         85,
         60,
         36,
         47,
         22,
         66,
         54,
         84,
         39,
         65,
         61,
         101,
         80,
         38,
         70,
         121,
         47,
         69,
         63,
         42,
         1,
         13,
         3,
         70,
         106
      };
   }
}
