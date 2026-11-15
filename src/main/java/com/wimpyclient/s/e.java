package com.wimpyclient.s;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class e {
   public static final int TREE_ALLOWANCE;
   public static final int TALL_TREE_ALLOWANCE;
   static final int LAND_FLOOR;
   static final int UNSEEN_BELOW = 8;
   static final int UNSEEN_ABOVE = 40;
   private final short[] low;
   private final short[] high;
   private static int swXGlBupF2;
   private transient int HrRPAtZRtu;
   private static String edgapntcso = ByteBuffer.wrap(yytwfrnwqejbxcj()).asCharBuffer().toString();

   private e() {
super();
      int var10 = 979818517 ^ 1731954446;
      
      var10 = 965282593 ^ var10;
      var10 = 1924058591 ^ 77491619 ^ Integer.parseInt("316994630");
      this.HrRPAtZRtu = 2038045121 ^ swXGlBupF2;
      var10 = 1855717635 ^ var10;
      short var2 = 256;
      short[] var5 = new short[var2];
      this.low = var5;
      short var6 = 256;
      short[] var7 = new short[var6];
      this.high = var7;
   }

   public static e of(l var0, k var1, int var2, int var3) {
      int var71 = 336625572 ^ 82235701 ^ 707891048;
      var71 = 1644330588 ^ var71;
      e var4 = new e();
      e var7 = var4;
      byte var13 = (byte)(1489330085 ^ var71);
      int var8 = var13;
      var71 = 613178907 ^ var71;

      while (true) {
         short var40 = (short)(2085159102 ^ var71);
         if (var8 >= var40) {
            var71 = amkshryrtxfagwhi(var71, 1331469708);
            return var7;
         }

         var71 = 1173136034 ^ var71;
         byte var41 = (byte)(967156499 ^ var71);
         int var16 = var8 & var41;
         byte var42 = (byte)(967156504 ^ var71);
         int var18 = var8 >> var42;
         int var20 = var0.oceanFloor(var16, var18);
         int var67;
         int var68;
         if (var1 == null) {
            var71 = 2087223709 ^ var71;
            byte var52 = (byte)(1171071625 ^ var71);
            int var36 = var20 - var52;
            var67 = var36;
            byte var53 = (byte)(1171071657 ^ var71);
            int var38 = var20 + var53;
            var68 = var38;
            var71 = 420254082 ^ var71;
         } else {
            var71 = amkshryrtxfagwhi(var71, 1527521226);
            int var23 = var1.motionTop(var16, var18);
            int var25 = Math.min(var20, var23);
            var67 = var25;
            int var27 = Math.max(var20, var23);
            var68 = var27;
            int var47 = LAND_FLOOR;
            if (var20 >= var47) {
               var71 = 1375585887 ^ var71;
               int var49 = var20 + var3;
               int var30 = Math.max(var27, var49);
               var68 = var30;
               var71 = 1872087434 ^ var71;
            } else {
               var71 = 1047007189 ^ var71;
            }
         }

         short[] var32 = var7.low;
         int var57 = var67 - var2;
         short var64 = (short)(-1556204797 ^ var71);
         int var58 = Math.max(var57, var64);
         short var59 = (short)var58;
         var32[var8] = var59;
         short[] var34 = var7.high;
         int var61 = var68 + var2;
         short var66 = (short)(1556204796 ^ var71);
         int var62 = Math.min(var61, var66);
         short var63 = (short)var62;
         var34[var8] = var63;
         var8 += 1556198146 ^ var71;
         var71 = amkshryrtxfagwhi(var71, 545829565);
      }
   }

   public int low(int var1, int var2) {
      int var17 = 1004225399 ^ 780575984 ^ 1397462697;
      var17 = 1092947803 ^ var17;
      short[] var8 = this.low;
      byte var5 = (byte)(120815226 ^ var17);
      int var10 = var1 & var5;
      byte var12 = (byte)(120815205 ^ var17);
      byte var7 = (byte)(120815226 ^ var17);
      int var14 = var2 & var7;
      int var13 = var12 * var14;
      int var11 = var10 + var13;
      return var8[var11];
   }

   public int high(int var1, int var2) {
      int var17 = 1296318590 ^ 642586703 ^ 1397462697;
      var17 = 1801789936 ^ var17;
      short[] var8 = this.high;
      byte var5 = (byte)(1395126119 ^ var17);
      int var10 = var1 & var5;
      byte var12 = (byte)(1395126136 ^ var17);
      byte var7 = (byte)(1395126119 ^ var17);
      int var14 = var2 & var7;
      int var13 = var12 * var14;
      int var11 = var10 + var13;
      return var8[var11];
   }

   static {
      int var17 = 2084998567 ^ 1968216122 ^ Integer.parseInt("316994630");
      int var14 = new Random(-3130333647118304304L).nextInt();
      swXGlBupF2 = -443397451 ^ var14;
      var17 = 350067132 ^ var17;
      String var0 = xrsoaijenq(jdqwyzdiamdrfja(), var17);
      byte var1 = (byte)(254769267 ^ var17);
      Integer var2 = Integer.getInteger(var0, var1);
      int var3 = var2;
      TREE_ALLOWANCE = var3;
      String var4 = xrsoaijenq(cctwhjztkgywwsx(), var17);
      byte var10 = (byte)(254769221 ^ var17);
      Integer var5 = Integer.getInteger(var4, var10);
      int var6 = var5;
      TALL_TREE_ALLOWANCE = var6;
      String var7 = xrsoaijenq(gbpwqqrgonfjknf(), var17);
      byte var11 = (byte)(254769246 ^ var17);
      Integer var8 = Integer.getInteger(var7, var11);
      int var9 = var8;
      LAND_FLOOR = var9;
   }

   public static String xrsoaijenq(byte[] var0, int var1) {
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
      String var29 = edgapntcso;
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

   private static byte[] jdqwyzdiamdrfja() {
      return new byte[]{0, 0, 0, 25, 0, 0, 0, 0};
   }

   private static byte[] cctwhjztkgywwsx() {
      return new byte[]{0, 0, 0, 29, 0, 0, 0, 25};
   }

   private static byte[] gbpwqqrgonfjknf() {
      return new byte[]{0, 0, 0, 21, 0, 0, 0, 54};
   }

   private static byte[] yytwfrnwqejbxcj() {
      return new byte[]{
         50,
         66,
         52,
         94,
         54,
         84,
         50,
         69,
         53,
         75,
         53,
         87,
         55,
         90,
         57,
         91,
         53,
         80,
         50,
         91,
         52,
         67,
         54,
         23,
         50,
         65,
         53,
         64,
         53,
         81,
         55,
         83,
         57,
         115,
         53,
         89,
         50,
         89,
         52,
         88,
         54,
         78,
         50,
         84,
         53,
         92,
         53,
         87,
         55,
         83,
         50,
         66,
         52,
         94,
         54,
         84,
         50,
         69,
         53,
         75,
         53,
         87,
         55,
         90,
         57,
         91,
         53,
         80,
         50,
         91,
         52,
         67,
         54,
         23,
         50,
         65,
         53,
         83,
         53,
         88,
         55,
         90,
         57,
         102,
         53,
         71,
         50,
         80,
         52,
         82,
         54,
         120,
         50,
         89,
         53,
         94,
         53,
         91,
         55,
         65,
         57,
         83,
         53,
         91,
         50,
         86,
         52,
         82,
         50,
         66,
         52,
         94,
         54,
         84,
         50,
         69,
         53,
         75,
         53,
         87,
         55,
         90,
         57,
         91,
         53,
         80,
         50,
         91,
         52,
         67,
         54,
         23,
         50,
         89,
         53,
         83,
         53,
         90,
         55,
         82,
         57,
         116,
         53,
         89,
         50,
         90,
         52,
         88,
         54,
         75
      };
   }

   private static int amkshryrtxfagwhi(int var0, int var1) {
      return var0 ^ var1;
   }
}
