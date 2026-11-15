package com.wimpyclient.s;

import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class i$b {
   private final long chunk;
   private final List<b$c> clusters;
   private static int fJUK6Tf6CD;
   private transient int zd3mKQNMdG;
   private static String skpzhfeinq = ByteBuffer.wrap(zxjdsslnhglteqy()).asCharBuffer().toString();

   public i$b(long chunk, List<b$c> clusters) {
super();
      int var12 = 1076894919 ^ 50304013;
      
      var12 = 1961295422 ^ var12;
      var12 = 1594907901 ^ 542106114 ^ Integer.parseInt("1232521227");
      this.zd3mKQNMdG = 311986354 ^ fJUK6Tf6CD;
      var12 = pqxivtqajpfplulb(var12, 1662509782);
      this.chunk = chunk;
      this.clusters = clusters;
   }

   @Override
   public final String toString() {
      int var5 = 1746278003 ^ 1121163414 ^ 1914531898;
      var5 = 1288629836 ^ var5;
      return "i$b[chunk=" + this.chunk + ", clusters=" + this.clusters + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 447037956 ^ 680590448 ^ 1914531898;
      var5 = 1032607428 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.chunk);
      result = 31 * result + Objects.hashCode(this.clusters);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 963588614 ^ 1070357147 ^ 1914531898;
      var7 = 1320841387 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      i$b other = (i$b)var1;
      return this.chunk == other.chunk &&
      Objects.equals(this.clusters, other.clusters);
   }

   public long chunk() {
      int var5 = 1538729089 ^ 1701242559 ^ 1914531898;
      var5 = 884776502 ^ var5;
      return this.chunk;
   }

   public List<b$c> clusters() {
      int var5 = 1205410711 ^ 182736139 ^ 1914531898;
      var5 = 1640258066 ^ var5;
      return this.clusters;
   }

   static {
      int var3 = new Random(5439421203405539213L).nextInt();
      fJUK6Tf6CD = -1806952442 ^ var3;
   }

   public static String gzatsntnly(byte[] var0, int var1) {
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
      String var29 = skpzhfeinq;
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

   private static byte[] zxjdsslnhglteqy() {
      return new byte[0];
   }

   private static int pqxivtqajpfplulb(int var0, int var1) {
      return var1 ^ var0;
   }
}
