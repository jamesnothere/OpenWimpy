package com.wimpyclient.f;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class b$b {
   private final int baseHits;
   private static int jMV8mbG6I8;
   private transient int JXPGreHOuu;
   private static byte[] fplxeyscpn = gaiusfisohdpodi();

   public b$b(int baseHits) {
super();
      int var7 = 1713539605 ^ 1830725811;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var7)) {
            case 96765981:
               var7 = 784073305 ^ var7;
            case 636745618:
               var7 = 515859301 ^ 1314044396 ^ Integer.parseInt("1970141814");
               this.JXPGreHOuu = 2053020803 ^ jMV8mbG6I8;
               var7 = iocqlugqdyxjmwoi(var7, 1916811809);
               this.baseHits = baseHits;
               return;
            case 255880214:
               break;
            case 1640403939:
            default:
               throw new IllegalStateException();
         }
      }
   }

   int totalHits() {
      int var5 = 662945309 ^ 909146888 ^ 2111816070;
      var5 = 1342980202 ^ var5;
      return this.baseHits;
   }

   @Override
   public final String toString() {
      int var5 = 1670933169 ^ 1292970282 ^ 2111816070;
      var5 = 1435222794 ^ var5;
      return "b$b[baseHits=" + this.baseHits + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1206103213 ^ 659705292 ^ 2111816070;
      var5 = 1577801192 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.baseHits);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 220009289 ^ 806284071 ^ 2111816070;
      var7 = 1057541605 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      b$b other = (b$b)var1;
      return this.baseHits == other.baseHits;
   }

   public int baseHits() {
      int var5 = 70210172 ^ 1821887818 ^ 2111816070;
      var5 = 440006390 ^ var5;
      return this.baseHits;
   }

   static {
      int var3 = new Random(-83764123551568307L).nextInt();
      jMV8mbG6I8 = -794895166 ^ var3;
   }

   public static String wagznandtr(byte[] var0, int var1) {
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
         byte[] var28 = fplxeyscpn;
         byte[] var34 = fplxeyscpn;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] gaiusfisohdpodi() {
      return new byte[]{
         7,
         2,
         74,
         124,
         3,
         51,
         70,
         94,
         30,
         106,
         57,
         79,
         87,
         14,
         39,
         24,
         114,
         43,
         85,
         92,
         108,
         54,
         40,
         17,
         117,
         46,
         79,
         70,
         113,
         84,
         68,
         122,
         35,
         59,
         104,
         69,
         9,
         45,
         90,
         49,
         71,
         67,
         38,
         108,
         71,
         90,
         56,
         95,
         11,
         27,
         102,
         111,
         118,
         42,
         72
      };
   }

   private static int iocqlugqdyxjmwoi(int var0, int var1) {
      return var1 ^ var0;
   }
}
