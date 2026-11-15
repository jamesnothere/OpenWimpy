package com.wimpyclient.p;

import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class e$c {
   public final int minY;
   public final Map<Integer, int[]> sections;
   private static int QEtKeHD7jn;
   private transient int TgCdaXEJMB;
   private static String gzvtvgypcd = ByteBuffer.wrap(fyptrpnlwngnbhe()).asCharBuffer().toString();

   public e$c(int minY, Map<Integer, int[]> sections) {
super();
      int var10 = 886157114 ^ 747333561;
      
      var10 = 956150115 ^ var10;
      var10 = 799607906 ^ 1086713904 ^ Integer.parseInt("1338738098");
      this.TgCdaXEJMB = 177894715 ^ QEtKeHD7jn;
      var10 = dugrvbguyfnsrizt(var10, 1152092936);
      this.minY = minY;
      this.sections = sections;
   }

   @Override
   public final String toString() {
      int var5 = 612120911 ^ 1783831617 ^ 1520301293;
      var5 = 760721752 ^ var5;
      return "e$c[minY=" + this.minY + ", sections=" + this.sections + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1104682996 ^ 1079463 ^ 1520301293;
      var5 = 194722825 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.minY);
      result = 31 * result + Objects.hashCode(this.sections);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 244291367 ^ 390913612 ^ 1520301293;
      var7 = 55587310 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      e$c other = (e$c)var1;
      return this.minY == other.minY &&
      Objects.equals(this.sections, other.sections);
   }

   public int minY() {
      int var5 = 1632515884 ^ 1674465979 ^ 1520301293;
      var5 = 1503132517 ^ var5;
      return this.minY;
   }

   public Map<Integer, int[]> sections() {
      int var5 = 404688970 ^ 1327518199 ^ 1520301293;
      var5 = 1249128272 ^ var5;
      return this.sections;
   }

   static {
      int var3 = new Random(1543324006735588155L).nextInt();
      QEtKeHD7jn = 936243848 ^ var3;
   }

   public static String qknabqjzgq(byte[] var0, int var1) {
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
      String var29 = gzvtvgypcd;
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

   private static byte[] fyptrpnlwngnbhe() {
      return new byte[0];
   }

   private static int dugrvbguyfnsrizt(int var0, int var1) {
      return var0 ^ var1;
   }
}
