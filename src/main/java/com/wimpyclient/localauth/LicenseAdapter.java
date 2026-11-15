package com.wimpyclient.localauth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.LanguageAdapter;
import net.fabricmc.loader.api.LanguageAdapterException;
import net.fabricmc.loader.api.ModContainer;

@Environment(EnvType.CLIENT)
public final class LicenseAdapter implements LanguageAdapter {
   private static int DEU3Hw3LHZ;
   private transient int mot703Eshb;
   private static String vetxchrzci = ByteBuffer.wrap(heqeigkwlmqfecl()).asCharBuffer().toString();

   public LicenseAdapter() {
super();
      int var4 = 2103310670 ^ 1532609275;
      
      var4 = 2001993738 ^ var4;
      var4 = 1294231478 ^ 993891189 ^ Integer.parseInt("659148668");
      this.mot703Eshb = 373176685 ^ DEU3Hw3LHZ;
      var4 = lsjkbcrsbnzzzmnd(var4, 558137576);
   }

   public <T> T create(ModContainer var1, String var2, Class<T> var3) throws LanguageAdapterException {
      int var11 = 574282571 ^ 954559291 ^ 277124220;
      var11 = 1163887885 ^ var11;
      LanguageAdapter var4 = LanguageAdapter.getDefault();
      return (T)var4.create(var1, var2, var3);
   }

   static {
      int var3 = new Random(-897518313086594129L).nextInt();
      DEU3Hw3LHZ = -1452063594 ^ var3;
   }

   public static String kvuzaizuri(byte[] var0, int var1) {
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
      String var29 = vetxchrzci;
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

   private static byte[] heqeigkwlmqfecl() {
      return new byte[0];
   }

   private static int lsjkbcrsbnzzzmnd(int var0, int var1) {
      return var1 ^ var0;
   }
}
