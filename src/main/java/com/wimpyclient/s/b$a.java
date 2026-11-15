package com.wimpyclient.s;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class b$a implements b$e {
   private final b$e vanilla;
   private int lastX;
   private int lastZ;
   private n last;
   private static int jecbBf177C;
   private transient int yc78PbtjgR;
   private static byte[] iwvuejgptm = szezfqdqafwfezg();

   b$a(b$e var1) {
super();
      int var11 = 280737072 ^ 896844124;
      
      var11 = 1151250106 ^ var11;
      var11 = 178493092 ^ 323381802 ^ Integer.parseInt("2025072216");
      this.yc78PbtjgR = 435233270 ^ jecbBf177C;
      var11 = nmwrqbrxsnkzlukr(var11, 524280610);
      int var3 = Integer.MIN_VALUE;
      this.lastX = var3;
      int var7 = Integer.MIN_VALUE;
      this.lastZ = var7;
      this.vanilla = var1;
   }

   n at(int var1, int var2) {
      int var13 = 778120555 ^ 1771586989 ^ 2071068056;
      var13 = 961854766 ^ var13;
      byte var5 = (byte)(98314356 ^ var13);
      int var8 = var1 >> var5;
      byte var6 = (byte)(98314356 ^ var13);
      int var10 = var2 >> var6;
      return this.band(var8, var10);
   }

   @Override
   public n band(int var1, int var2) {
      int var23 = 259860138 ^ 1641910896 ^ 2071068056;
      var23 = 1741715912 ^ var23;
      int var13 = this.lastX;
      if (var1 == var13) {
         var23 = 1072852554 ^ var23;
         int var15 = this.lastZ;
         if (var2 == var15) {
            var23 = 2009127713 ^ var23;
            return this.last;
         }

         var23 = 771013627 ^ var23;
      } else {
         label22:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
               case 216153098:
                  var23 ^= 302437809;
                  break label22;
               case 777663619:
                  break;
               case 912645897:
                  break label22;
               case 1625771821:
               default:
                  throw new IllegalStateException();
            }
         }
      }

      this.lastX = var1;
      this.lastZ = var2;
      b$e var19 = this.vanilla;
      n var20 = var19.band(var1, var2);
      this.last = var20;
      var23 = 1513382106 ^ var23;
      return this.last;
   }

   static {
      int var3 = new Random(-1566148325598692634L).nextInt();
      jecbBf177C = 689212700 ^ var3;
   }

   public static String tsahofhsgr(byte[] var0, int var1) {
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
         byte[] var28 = iwvuejgptm;
         byte[] var34 = iwvuejgptm;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] szezfqdqafwfezg() {
      return new byte[]{
         23,
         34,
         65,
         26,
         59,
         127,
         93,
         60,
         70,
         6,
         6,
         12,
         67,
         111,
         35,
         10,
         72,
         37,
         118,
         78,
         100,
         106,
         4,
         43,
         35,
         60,
         24,
         94,
         90,
         21,
         95,
         42,
         47,
         53,
         33,
         93,
         53,
         106,
         91,
         23
      };
   }

   private static int nmwrqbrxsnkzlukr(int var0, int var1) {
      return var0 ^ var1;
   }
}
