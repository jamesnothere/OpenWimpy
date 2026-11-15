package com.wimpyclient.s;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class d$a {
   private final long first;
   private final long second;
   private static int f0g0oXEj8Ku;
   private transient int HznLWsKgfT;

   private d$a(long first, long second) {
super();
      int var13 = 1745286302 ^ 193561858;
      
      var13 = 2013499770 ^ var13;
      var13 = 191648425 ^ 1599167787 ^ Integer.parseInt("1337061220");
      this.HznLWsKgfT = 1829799942 ^ f0g0oXEj8Ku;
      var13 = 1786618914 ^ var13;
      this.first = first;
      this.second = second;
   }

   static d$a of(long var0, long var2) {
      int var19 = 521592184 ^ 1379478255 ^ 24699158;
      var19 = 143358199 ^ var19;
      long var24;
      int var10 = (var24 = var0 - var2) == 0L ? 0 : (var24 < 0L ? -1 : 1);
      if (var10 < (1155296886 ^ var19)) {
         var19 = 562846856 ^ var19;
         d$a var25 = new d$a(var0, var2);
         var19 = 180427581 ^ var19;
         return var25;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
               case 90919640:
                  var19 ^= 1062802725;
               case 832097598:
                  d$a var11 = new d$a(var2, var0);
                  var19 = 336876176 ^ var19;
                  return var11;
               case 194613094:
                  break;
               case 989825408:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   @Override
   public final String toString() {
      int var5 = 1828432359 ^ 1554416060 ^ 1818781968;
      var5 = 714836863 ^ var5;
      return "d$a[first=" + this.first + ", second=" + this.second + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 323056714 ^ 921036122 ^ 1818781968;
      var5 = 1002364706 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.first);
      result = 31 * result + Objects.hashCode(this.second);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1405580510 ^ 565789617 ^ 1818781968;
      var7 = 501054220 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      d$a other = (d$a)var1;
      return this.first == other.first &&
      this.second == other.second;
   }

   public long first() {
      int var5 = 1124854157 ^ 1169480406 ^ 1818781968;
      var5 = 1620402296 ^ var5;
      return this.first;
   }

   public long second() {
      int var5 = 1648056382 ^ 233688153 ^ 1818781968;
      var5 = 1825942023 ^ var5;
      return this.second;
   }

   static {
      int var3 = new Random(-192920834377672985L).nextInt();
      f0g0oXEj8Ku = -1650464242 ^ var3;
   }

   public static String hcadoefdra(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] lrfrckoywinzehw() {
      return new byte[]{
         36,
         91,
         69,
         59,
         6,
         38,
         64,
         104,
         78,
         84,
         98,
         101,
         79,
         84,
         94,
         55,
         37,
         107,
         115,
         122,
         100,
         118,
         43,
         118,
         76,
         19,
         98,
         18,
         116,
         33,
         12,
         117,
         49,
         120,
         64,
         23,
         24,
         78,
         107,
         88,
         10,
         58,
         100,
         33,
         10,
         52,
         56,
         60,
         20,
         87,
         56,
         73,
         5,
         8,
         50,
         2,
         6,
         15,
         114,
         35,
         22,
         14,
         117,
         69,
         28,
         11,
         107,
         2,
         52,
         6,
         81,
         37,
         91,
         38,
         86,
         124,
         66,
         42,
         96,
         98
      };
   }
}
