package com.wimpyclient.f;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
enum c$d {UNKNOWN(),
   NORMAL(),
   EMPTY_MASK(),
   ZEROED_PRESENT(),
   UNIFORM_MAX();

   private static String rfujbjrxgn = ByteBuffer.wrap(cdloqyikmepngzf()).asCharBuffer().toString();

   private c$d() {
      int var8 = 1306058231 ^ 326248011;
      
      var8 = drehhrsorxdhfplu(var8, 1263332432);
      var8 = 143757564 ^ 1300886735 ^ Integer.parseInt("1358853087");

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
            case 174971839:
               var8 = 1866893654 ^ var8;
            case 101797597:
               return;
            case 377333446:
            default:
               throw new RuntimeException(new IOException());
            case 1201301538:
         }
      }
   }



   public static String dxkrwwblyt(byte[] var0, int var1) {
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
      String var29 = rfujbjrxgn;
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
            Charset var91 = StandardCharsets.UTF_16BE;
            return new String(var11, var91);
         }

         byte var85 = var11[var12];
         int var93 = var8.length;
         int var92 = var12 % var93;
         byte var90 = var8[var92];
         int var86 = var85 ^ var90;
         byte var87 = (byte)var86;
         var11[var12] = var87;
         var12++;
      }
   }

   private static byte[] hvrpnirehnqmzfx() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, 0};
   }

   private static byte[] qpwjmmqywtlcump() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, 7};
   }

   private static byte[] ezbrmswtyeqtndp() {
      return new byte[]{0, 0, 0, 10, 0, 0, 0, 13};
   }

   private static byte[] xgqifvtwvtunqdv() {
      return new byte[]{0, 0, 0, 14, 0, 0, 0, 23};
   }

   private static byte[] ioxiocfbusmqmko() {
      return new byte[]{0, 0, 0, 11, 0, 0, 0, 37};
   }

   private static byte[] cdloqyikmepngzf() {
      return new byte[]{
         54,
         100,
         52,
         120,
         50,
         126,
         49,
         124,
         54,
         121,
         49,
         99,
         54,
         124,
         54,
         127,
         52,
         121,
         50,
         103,
         49,
         127,
         54,
         119,
         49,
         120,
         54,
         116,
         52,
         123,
         50,
         101,
         49,
         102,
         54,
         111,
         49,
         107,
         54,
         127,
         53,
         112,
         50,
         101,
         54,
         122,
         54,
         107,
         52,
         115,
         50,
         103,
         49,
         125,
         54,
         115,
         49,
         112,
         54,
         109,
         53,
         97,
         50,
         100,
         54,
         116,
         52,
         101,
         50,
         112,
         49,
         124,
         54,
         98,
         54,
         100,
         52,
         120,
         50,
         124,
         49,
         116,
         54,
         121,
         49,
         102,
         54,
         127,
         53,
         110,
         50,
         123,
         54,
         112,
         52,
         110
      };
   }

   private static int drehhrsorxdhfplu(int var0, int var1) {
      return var0 ^ var1;
   }
}
