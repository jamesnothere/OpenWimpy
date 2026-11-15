package com.wimpyclient.k;

import java.util.Objects;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class k$b {
   private final float x;
   private final float y;
   private final float w;
   private final float h;
   private static int fWTQsBOBzU;
   private transient int D5ZwT4gcC0;

   public k$b(float x, float y, float w, float h) {
super();
      int var16 = 959309938 ^ 1050468641;
      

      label25:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
            case 120979212:
               var16 = 1869365661 ^ var16;
            case 559601464:
               var16 = 633259811 ^ 2054734759 ^ Integer.parseInt("924535882");
               this.D5ZwT4gcC0 = 2125548046 ^ fWTQsBOBzU;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
                     case 187487698:
                        var16 = 1214396966 ^ var16;
                        break label25;
                     case 301871289:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1034181164:
                        break;
                     case 2107864354:
                        break label25;
                  }
               }
            case 682103593:
            default:
               throw new RuntimeException(new IOException());
            case 1924081612:
         }
      }

      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
   }

   @Override
   public final String toString() {
      int var5 = 1390273525 ^ 1715573185 ^ 1452243309;
      var5 = 1013792316 ^ var5;
      return "k$b[x=" + this.x + ", y=" + this.y + ", w=" + this.w + ", h=" + this.h + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1195342972 ^ 201520423 ^ 1452243309;
      var5 = 1777557460 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.x);
      result = 31 * result + Objects.hashCode(this.y);
      result = 31 * result + Objects.hashCode(this.w);
      result = 31 * result + Objects.hashCode(this.h);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 247557715 ^ 459166668 ^ 1452243309;
      var7 = 1463390845 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      k$b other = (k$b)var1;
      return Float.compare(this.x, other.x) == 0 &&
      Float.compare(this.y, other.y) == 0 &&
      Float.compare(this.w, other.w) == 0 &&
      Float.compare(this.h, other.h) == 0;
   }

   public float x() {
      int var5 = 997917950 ^ 1645058654 ^ 1452243309;
      var5 = 1133593474 ^ var5;
      return this.x;
   }

   public float y() {
      int var5 = 1755112363 ^ 782585260 ^ 1452243309;
      var5 = 2118759815 ^ var5;
      return this.y;
   }

   public float w() {
      int var5 = 63020699 ^ 1923306563 ^ 1452243309;
      var5 = 632974612 ^ var5;
      return this.w;
   }

   public float h() {
      int var5 = 1039839213 ^ 1835555531 ^ 1452243309;
      var5 = 1168681761 ^ var5;
      return this.h;
   }

   static {
      int var3 = new Random(-3431300543677928487L).nextInt();
      fWTQsBOBzU = -1025460182 ^ var3;
   }

   public static String mjtnwfiakm(byte[] var0, byte[] var1, int var2) {
      String var9 = Integer.toString(var2);
      byte[] var10 = var9.getBytes();
      byte[] var7 = var10;
      byte var11 = 0;
      int var8 = var11;

      while (true) {
         int var16 = var0.length;
         if (var8 >= var16) {
            Charset var30 = StandardCharsets.UTF_16;
            return new String(var0, var30);
         }

         byte var19 = var0[var8];
         int var34 = var7.length;
         int var31 = var8 % var34;
         byte var27 = var7[var31];
         int var20 = var19 ^ var27;
         byte var21 = (byte)var20;
         var0[var8] = var21;
         byte var22 = var0[var8];
         int var36 = var1.length;
         int var33 = var8 % var36;
         byte var29 = var1[var33];
         int var23 = var22 ^ var29;
         byte var24 = (byte)var23;
         var0[var8] = var24;
         var8++;
      }
   }

   private static byte[] ugxdreuqosfgxye() {
      return new byte[]{
         5,
         114,
         90,
         100,
         43,
         49,
         74,
         59,
         117,
         92,
         114,
         125,
         125,
         109,
         59,
         36,
         79,
         30,
         88,
         24,
         108,
         72,
         94,
         97,
         102,
         107,
         38,
         43,
         92,
         107,
         71,
         40,
         96,
         15,
         106,
         120,
         10,
         108,
         101,
         68,
         69
      };
   }
}
