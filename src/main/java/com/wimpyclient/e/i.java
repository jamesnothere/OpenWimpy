package com.wimpyclient.e;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.ChunkPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class i {
   private final ChunkPos chunk;
   private final int likelihood;
   private static int x2L8wacO1L;
   private transient int f1FcMznzvOi;
   private static String xxahesnpsw = ByteBuffer.wrap(dbnzqaklsrzgjzq()).asCharBuffer().toString();

   public i(ChunkPos var1, int var2) {
super();
      int var14 = 177349903 ^ 1839937806;
      
      var14 = 1974885564 ^ var14;
      var14 = 417728227 ^ 867571006 ^ Integer.parseInt("970937184");
      this.f1FcMznzvOi = 1336504605 ^ x2L8wacO1L;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
            case 66428897:
               var14 = 2088456330 ^ var14;
            case 1423473813:
               this.chunk = var1;
               byte var9 = 0;
               byte var5 = 100;
               int var11 = Math.min(var5, var2);
               int var10 = Math.max(var9, var11);
               this.likelihood = var10;
               return;
            case 534854635:
            default:
               throw new RuntimeException();
            case 956233683:
         }
      }
   }

   public ChunkPos chunk() {
      int var5 = 1710611273 ^ 1455146906 ^ 409100323;
      var5 = 2019096270 ^ var5;
      return this.chunk;
   }

   public int likelihood() {
      int var5 = 1280226823 ^ 427785486 ^ 409100323;
      var5 = 675228464 ^ var5;
      return this.likelihood;
   }

   static {
      int var3 = new Random(5141549650615867517L).nextInt();
      x2L8wacO1L = -643889882 ^ var3;
   }

   public static String psrnmcljsd(byte[] var0, int var1) {
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
      String var29 = xxahesnpsw;
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

   private static byte[] dbnzqaklsrzgjzq() {
      return new byte[0];
   }
}
