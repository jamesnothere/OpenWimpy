package com.wimpyclient.i;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
enum aj$c {READY(),
   RESTOCKING(),
   MISSING();

   private aj$c() {
      int var8 = 2134093597 ^ 1723321082;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
            case 24157419:
               var8 = 1157586232 ^ var8;
            case 1088308414:
               var8 = 1074577359 ^ 1184485117 ^ Integer.parseInt("1542343149");
               var8 = 305957364 ^ var8;
               return;
            case 601405048:
            default:
               throw new RuntimeException();
            case 1025758664:
         }
      }
   }



   public static String wavzjqpvmi(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] mtgppultkixfhvn() {
      return new byte[]{40, 7, 103, 38, 35, 119, 38, 73, 102, 10, 109, 111, 11, 67, 64};
   }

   private static byte[] fvszqlvdloywjzn() {
      return new byte[]{-18, -52, 86, 65, 17, 6, 17, 49, 95, 118, 89, 7};
   }

   private static byte[] lntexhruarwdura() {
      return new byte[]{-18, -52, 86, 65, 17, 6, 17, 35, 95, 102, 89, 17, 62, 50, 116, 84, 62, 23, 30, 89, 70, 84};
   }

   private static byte[] eptfvwwzvikklws() {
      return new byte[]{-18, -52, 86, 94, 17, 10, 17, 35, 95, 97, 89, 23, 62, 63, 116, 88};
   }
}
