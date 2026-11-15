package com.wimpyclient.s;

import java.util.Objects;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class a$e {
   private final LongOpenHashSet chunks;
   private final int x;
   private final int z;
   private static int f88eivxcVOF;
   private transient int wc0PeAYkrT;
   private static byte[] nzqlcqpwej = cxsqifpxgjachrr();

   public a$e(LongOpenHashSet chunks, int x, int z) {
super();
      int var13 = 1769445603 ^ 1671174695;
      
      var13 = 1738882913 ^ var13;
      var13 = 715251125 ^ 1306920396 ^ Integer.parseInt("168388060");
      this.wc0PeAYkrT = 120187599 ^ f88eivxcVOF;
      var13 = 1042362092 ^ var13;
      this.chunks = chunks;
      this.x = x;
      this.z = z;
   }

   @Override
   public final String toString() {
      int var5 = 343584086 ^ 1919976335 ^ 1119775523;
      var5 = 1921171496 ^ var5;
      return "a$e[chunks=" + this.chunks + ", x=" + this.x + ", z=" + this.z + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 532881237 ^ 406054761 ^ 1119775523;
      var5 = 952089770 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.chunks);
      result = 31 * result + Objects.hashCode(this.x);
      result = 31 * result + Objects.hashCode(this.z);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1887354871 ^ 258949506 ^ 1119775523;
      var7 = 610660241 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      a$e other = (a$e)var1;
      return Objects.equals(this.chunks, other.chunks) &&
      this.x == other.x &&
      this.z == other.z;
   }

   public LongOpenHashSet chunks() {
      int var5 = 1862131165 ^ 454391125 ^ 1119775523;
      var5 = 1598088378 ^ var5;
      return this.chunks;
   }

   public int x() {
      int var5 = 1632144250 ^ 471823472 ^ 1119775523;
      var5 = 777082332 ^ var5;
      return this.x;
   }

   public int z() {
      int var5 = 1764801370 ^ 952764029 ^ 1119775523;
      var5 = 1701289363 ^ var5;
      return this.z;
   }

   static {
      int var3 = new Random(3469906139088012068L).nextInt();
      f88eivxcVOF = -830263056 ^ var3;
   }

   public static String arxlsbemzr(byte[] var0, int var1) {
      String var10 = Integer.toString(var1);
      byte[] var11 = var10.getBytes();
      byte[] var8 = var11;
      byte var12 = 0;
      int var9 = var12;

      while (true) {
         int var17 = var0.length;
         if (var9 >= var17) {
            Charset var5 = StandardCharsets.UTF_16;
            return new String(var0, var5);
         }

         byte var20 = var0[var9];
         int var33 = var8.length;
         int var30 = var9 % var33;
         byte var27 = var8[var30];
         int var21 = var20 ^ var27;
         byte var22 = (byte)var21;
         var0[var9] = var22;
         byte var23 = var0[var9];
         byte[] var28 = nzqlcqpwej;
         byte[] var34 = nzqlcqpwej;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] cxsqifpxgjachrr() {
      return new byte[]{
         105, 83, 33, 7, 15, 92, 41, 71, 89, 59, 36, 123, 12, 19, 21, 12, 25, 33, 13, 12, 113, 8, 26, 24, 72, 47, 20, 125, 116, 40, 125, 37, 99, 1, 66, 7, 106
      };
   }
}
