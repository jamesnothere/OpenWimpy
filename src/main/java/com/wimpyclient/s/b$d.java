package com.wimpyclient.s;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum b$d {ALERT(),
   CLEAN(),
   OPEN(),
   STRUCTURE(),
   TERRAIN(),
   MISPREDICTED(),
   HIDDEN(),
   TOO_FEW(),
   INCOMPLETE(),
   OUT_OF_BAND();

   private static String flxkyalywi = ByteBuffer.wrap(mhnwxighilmtgxl()).asCharBuffer().toString();

   private b$d() {
      int var8 = 419480404 ^ 1467379242;
      
      var8 = iiyvhwkeswvtvyaf(var8, 1016013411);
      var8 = 1871579149 ^ 1308597165 ^ Integer.parseInt("1351097533");
      var8 = iiyvhwkeswvtvyaf(var8, 135644645);
   }



   public static String gvpdbbpnux(byte[] var0, int var1) {
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
      String var29 = flxkyalywi;
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

   private static byte[] xrfsgasvjxcypme() {
      return new byte[]{0, 0, 0, 5, 0, 0, 0, 0};
   }

   private static byte[] mmnxpibxlxxqxnh() {
      return new byte[]{0, 0, 0, 5, 0, 0, 0, 5};
   }

   private static byte[] jooatjfxkufeqdf() {
      return new byte[]{0, 0, 0, 4, 0, 0, 0, 10};
   }

   private static byte[] dhhmpydkpwbcjtk() {
      return new byte[]{0, 0, 0, 9, 0, 0, 0, 14};
   }

   private static byte[] fwlyxclayzbxctn() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, 23};
   }

   private static byte[] iqycbcfszhpxzxm() {
      return new byte[]{0, 0, 0, 12, 0, 0, 0, 30};
   }

   private static byte[] itlqaiwqtenqgvt() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, 42};
   }

   private static byte[] xcjmuxbzaevhxwy() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, 48};
   }

   private static byte[] vauwlzqlsbytkwn() {
      return new byte[]{0, 0, 0, 10, 0, 0, 0, 55};
   }

   private static byte[] golyvlonkfbsxmb() {
      return new byte[]{0, 0, 0, 11, 0, 0, 0, 65};
   }

   private static byte[] mhnwxighilmtgxl() {
      return new byte[]{
         49,
         117,
         56,
         122,
         53,
         125,
         53,
         99,
         57,
         99,
         49,
         119,
         56,
         122,
         53,
         125,
         53,
         112,
         57,
         121,
         49,
         123,
         56,
         102,
         53,
         125,
         53,
         127,
         49,
         103,
         56,
         98,
         53,
         106,
         53,
         100,
         57,
         116,
         49,
         96,
         56,
         99,
         53,
         106,
         53,
         116,
         49,
         96,
         56,
         115,
         53,
         106,
         53,
         99,
         57,
         118,
         49,
         125,
         56,
         120,
         49,
         121,
         56,
         127,
         53,
         107,
         53,
         97,
         57,
         101,
         49,
         113,
         56,
         114,
         53,
         113,
         53,
         114,
         57,
         99,
         49,
         113,
         56,
         114,
         49,
         124,
         56,
         127,
         53,
         124,
         53,
         117,
         57,
         114,
         49,
         122,
         49,
         96,
         56,
         121,
         53,
         119,
         53,
         110,
         57,
         113,
         49,
         113,
         56,
         97,
         49,
         125,
         56,
         120,
         53,
         123,
         53,
         126,
         57,
         122,
         49,
         100,
         56,
         122,
         53,
         125,
         53,
         101,
         57,
         114,
         49,
         123,
         56,
         99,
         53,
         108,
         53,
         110,
         57,
         120,
         49,
         114,
         56,
         105,
         53,
         122,
         53,
         112,
         57,
         121,
         49,
         112
      };
   }

   private static int iiyvhwkeswvtvyaf(int var0, int var1) {
      return var0 ^ var1;
   }
}
