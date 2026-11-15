package com.wimpyclient.p;

import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class e$a {
   private final int worldX;
   private final int worldY;
   private final int worldZ;
   private final int newState;
   private final int oldState;
   private static int itE47N6Tdy;
   private transient int OjTd1zpRfM;
   private static String qjiblluwxs = ByteBuffer.wrap(aynsnwphvogpraz()).asCharBuffer().toString();

   public e$a(int worldX, int worldY, int worldZ, int newState, int oldState) {
super();
      int var19 = 2005517214 ^ 1219870441;
      
      var19 = 241184564 ^ var19;
      var19 = 308443559 ^ 65003866 ^ Integer.parseInt("551668414");
      this.OjTd1zpRfM = 549306367 ^ itE47N6Tdy;
      var19 = bnuwntftbayidvhu(var19, 1259303457);
      this.worldX = worldX;
      this.worldY = worldY;
      this.worldZ = worldZ;
      this.newState = newState;
      this.oldState = oldState;
   }

   @Override
   public final String toString() {
      int var5 = 1314128208 ^ 142776373 ^ 944533657;
      var5 = 90574844 ^ var5;
      return "e$a[worldX=" + this.worldX + ", worldY=" + this.worldY + ", worldZ=" + this.worldZ + ", newState=" + this.newState + ", oldState=" + this.oldState + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1128278925 ^ 1656880339 ^ 944533657;
      var5 = 1292380743 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.worldX);
      result = 31 * result + Objects.hashCode(this.worldY);
      result = 31 * result + Objects.hashCode(this.worldZ);
      result = 31 * result + Objects.hashCode(this.newState);
      result = 31 * result + Objects.hashCode(this.oldState);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 640412041 ^ 1973246520 ^ 944533657;
      var7 = 788618326 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      e$a other = (e$a)var1;
      return this.worldX == other.worldX &&
      this.worldY == other.worldY &&
      this.worldZ == other.worldZ &&
      this.newState == other.newState &&
      this.oldState == other.oldState;
   }

   public int worldX() {
      int var5 = 1937397350 ^ 2075591898 ^ 944533657;
      var5 = 907156054 ^ var5;
      return this.worldX;
   }

   public int worldY() {
      int var5 = 1592137427 ^ 287602052 ^ 944533657;
      var5 = 651468139 ^ var5;
      return this.worldY;
   }

   public int worldZ() {
      int var5 = 1133154078 ^ 838501668 ^ 944533657;
      var5 = 732027723 ^ var5;
      return this.worldZ;
   }

   public int newState() {
      int var5 = 2141471443 ^ 1065345371 ^ 944533657;
      var5 = 1910391565 ^ var5;
      return this.newState;
   }

   public int oldState() {
      int var5 = 1894215629 ^ 732337142 ^ 944533657;
      var5 = 2031433335 ^ var5;
      return this.oldState;
   }

   static {
      int var3 = new Random(6397186881322589081L).nextInt();
      itE47N6Tdy = -1258542107 ^ var3;
   }

   public static String phffmjwezq(byte[] var0, int var1) {
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
      String var29 = qjiblluwxs;
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

   private static byte[] aynsnwphvogpraz() {
      return new byte[0];
   }

   private static int bnuwntftbayidvhu(int var0, int var1) {
      return var0 ^ var1;
   }
}
