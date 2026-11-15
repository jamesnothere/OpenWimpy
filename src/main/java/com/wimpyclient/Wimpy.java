package com.wimpyclient;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

public final class Wimpy {
   public static final String MOD_ID = "wimpyclient";
   public static final Logger LOGGER;
   private static int qgrFi7dg5R;
   private transient int f1sHRj5xKzC;
   private static byte[] dwjhitpkvc = qqtvqoluuldxhco();

   private Wimpy() {
super();
      int var4 = 565057167 ^ 1324314130;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 126793457:
               var4 = 1560794576 ^ var4;
            case 730207128:
               var4 = 607925416 ^ 2117431833 ^ Integer.parseInt("1750068220");
               this.f1sHRj5xKzC = 1099023553 ^ qgrFi7dg5R;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
                     case 23649667:
                        var4 = 820048221 ^ var4;
                        return;
                     case 582116794:
                        return;
                     case 786235588:
                     default:
                        throw new IllegalStateException();
                     case 1456824337:
                  }
               }
            case 246311533:
            default:
               throw new IllegalStateException();
            case 662279839:
         }
      }
   }

   public static Identifier id(String var0) {
      int var6 = 1892012267 ^ 212620056 ^ 1530611697;
      var6 = 46103609 ^ var6;
      String var1 = zfnjpeqaqh(vhnekixdcgloiwc(), var6);
      return Identifier.fromNamespaceAndPath(var1, var0);
   }

   static {
      int var7 = 1719299259 ^ 142956387 ^ Integer.parseInt("1750068220");
      int var4 = new Random(1397359411402935573L).nextInt();
      qgrFi7dg5R = -1674700690 ^ var4;
      var7 = 1735247721 ^ var7;
      String var0 = zfnjpeqaqh(hyldisjmuwxufvn(), var7);
      Logger var1 = LoggerFactory.getLogger(var0);
      LOGGER = var1;
   }

   public static String zfnjpeqaqh(byte[] var0, int var1) {
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
         byte[] var27 = dwjhitpkvc;
         byte[] var34 = dwjhitpkvc;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] qqtvqoluuldxhco() {
      return new byte[]{42, 80, 72, 56, 89, 104, 68, 105, 21, 117, 108, 117, 98, 8, 58, 1, 116, 89, 18, 83};
   }

   private static byte[] hyldisjmuwxufvn() {
      return new byte[]{-27, -103, 124, 126, 97, 54, 125, 55, 34, 54, 93, 58, 86, 90, 2, 90, 77, 3, 37, 5, 27, 8, 124, 125};
   }

   private static byte[] vhnekixdcgloiwc() {
      return new byte[]{-30, -100, 126, 124, 106, 55, 117, 60, 34, 51, 95, 58, 81, 88, 12, 92, 76, 7, 36, 5, 28, 13, 123, 122};
   }
}
