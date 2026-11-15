package com.wimpyclient.i;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
enum g$a {WAIT_AT_Y(),
   HOLD_MIN(),
   HOLD_32();

   private static String vcidoaodte = ByteBuffer.wrap(ezufykkipizwmcw()).asCharBuffer().toString();

   private g$a() {
      int var8 = 972097324 ^ 7891125;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
            case 10867256:
            default:
               throw new RuntimeException(new IOException());
            case 259682737:
               var8 = 921963689 ^ var8;
            case 421925579:
               var8 = 302703648 ^ 472537071 ^ Integer.parseInt("22925567");

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
                     case 114525788:
                        return;
                     case 235077456:
                        var8 = 1160140788 ^ var8;
                        return;
                     case 1752880450:
                     default:
                        throw new RuntimeException(new IOException());
                     case 2071887705:
                  }
               }
            case 2026145477:
         }
      }
   }



   public static String hrknwqyjtn(byte[] var0, int var1) {
      String var13 = Integer.toString(var1);
      byte[] var14 = var13.getBytes();
      byte[] var8 = var14;
      byte var3 = 0;
      byte var16 = var0[var3];
      short var36 = 255;
      int var17 = var16 & var36;
      byte var37 = 24;
      int var18 = var17 << var37;
      byte var4 = 1;
      byte var39 = var0[var4];
      short var68 = 255;
      int var40 = var39 & var68;
      byte var69 = 16;
      int var41 = var40 << var69;
      int var19 = var18 | var41;
      byte var70 = 2;
      byte var43 = var0[var70];
      short var71 = 255;
      int var44 = var43 & var71;
      byte var72 = 8;
      int var45 = var44 << var72;
      int var20 = var19 | var45;
      byte var73 = 3;
      byte var47 = var0[var73];
      short var74 = 255;
      int var48 = var47 & var74;
      int var21 = var20 | var48;
      byte var49 = 4;
      byte var23 = var0[var49];
      short var50 = 255;
      int var24 = var23 & var50;
      byte var51 = 24;
      int var25 = var24 << var51;
      byte var75 = 5;
      byte var53 = var0[var75];
      short var76 = 255;
      int var54 = var53 & var76;
      byte var77 = 16;
      int var55 = var54 << var77;
      int var26 = var25 | var55;
      byte var78 = 6;
      byte var57 = var0[var78];
      short var79 = 255;
      int var58 = var57 & var79;
      byte var80 = 8;
      int var59 = var58 << var80;
      int var27 = var26 | var59;
      byte var81 = 7;
      byte var61 = var0[var81];
      short var82 = 255;
      int var62 = var61 & var82;
      int var28 = var27 | var62;
      String var29 = vcidoaodte;
      int var84 = var28 + var21;
      String var30 = var29.substring(var28, var84);
      Charset var64 = StandardCharsets.UTF_16BE;
      byte[] var31 = var30.getBytes(var64);
      byte[] var11 = var31;
      byte var32 = 0;
      int var12 = var32;

      while (true) {
         int var66 = var11.length;
         if (var12 >= var66) {
            Charset var89 = StandardCharsets.UTF_16BE;
            return new String(var11, var89);
         }

         byte var86 = var11[var12];
         int var93 = var8.length;
         int var92 = var12 % var93;
         byte var91 = var8[var92];
         int var87 = var86 ^ var91;
         byte var88 = (byte)var87;
         var11[var12] = var88;
         var12++;
      }
   }

   private static byte[] dpezadpecyjdjpw() {
      return new byte[]{0, 0, 0, 9, 0, 0, 0, 0};
   }

   private static byte[] pknuwzrakdeaumi() {
      return new byte[]{0, 0, 0, 8, 0, 0, 0, 9};
   }

   private static byte[] jedarkwgngahlkc() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, 17};
   }

   private static byte[] ezufykkipizwmcw() {
      return new byte[]{
         49,
         103,
         51,
         117,
         52,
         126,
         56,
         102,
         54,
         110,
         49,
         113,
         51,
         96,
         52,
         104,
         56,
         107,
         49,
         120,
         51,
         123,
         52,
         123,
         56,
         118,
         54,
         110,
         49,
         125,
         51,
         125,
         52,
         121,
         49,
         120,
         51,
         123,
         52,
         123,
         56,
         118,
         54,
         110,
         49,
         3,
         51,
         6
      };
   }
}
