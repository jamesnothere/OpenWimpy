package com.wimpyclient.g;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum b$c {NONE(),
   HEADER(),
   MODULE_TOGGLE(),
   MODULE_OPEN(),
   KEYBIND(),
   BOOL(),
   INT_DEC(),
   INT_INC(),
   INT_SLIDER(),
   DOUBLE_DEC(),
   DOUBLE_INC(),
   DOUBLE_SLIDER(),
   STRING(),
   MODE(),
   COLOR_TOGGLE(),
   COLOR_WHEEL(),
   COLOR_VALUE(),
   SEARCH_FIELD(),
   SEARCH_CLEAR();

   private static byte[] opoiummqcv = bfedtfejhwdmbbu();

   private b$c() {
      int var8 = 255761658 ^ 307543558;
      
      var8 = 1123481412 ^ var8;
      var8 = 1122718376 ^ 158126902 ^ Integer.parseInt("337335334");
      var8 = xsqrptfsxgdgcxcj(var8, 1456549593);
   }



   public static String hdmpkcygsl(byte[] var0, int var1) {
      String var10 = Integer.toString(var1);
      byte[] var11 = var10.getBytes();
      byte[] var8 = var11;
      byte var12 = 0;
      int var9 = var12;

      while (true) {
         int var17 = var0.length;
         if (var9 >= var17) {
            Charset var5 = StandardCharsets.UTF_16;
            return new String(var0, var5);
         }

         byte var20 = var0[var9];
         int var33 = var8.length;
         int var30 = var9 % var33;
         byte var27 = var8[var30];
         int var21 = var20 ^ var27;
         byte var22 = (byte)var21;
         var0[var9] = var22;
         byte var23 = var0[var9];
         byte[] var28 = opoiummqcv;
         byte[] var34 = opoiummqcv;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] bfedtfejhwdmbbu() {
      return new byte[]{
         35,
         65,
         2,
         54,
         85,
         47,
         92,
         12,
         34,
         101,
         18,
         17,
         97,
         45,
         40,
         81,
         33,
         9,
         119,
         35,
         62,
         107,
         98,
         9,
         29,
         83,
         52,
         102,
         77,
         100,
         127,
         104,
         73,
         67,
         72,
         9,
         29,
         31,
         10,
         68,
         125,
         88,
         35,
         43,
         40,
         11,
         75,
         46,
         101,
         122,
         52,
         114,
         88,
         57,
         100,
         50,
         108,
         21,
         17,
         16,
         39,
         94,
         60,
         104,
         68,
         81,
         28,
         44,
         50,
         83,
         46,
         44,
         25,
         13,
         47,
         105,
         31,
         40,
         120,
         80,
         19,
         57,
         118,
         89,
         104,
         16,
         15,
         106,
         116,
         88,
         44,
         32,
         74,
         103,
         54,
         30,
         105,
         65,
         115,
         24
      };
   }

   private static byte[] qguoglugovzmwas() {
      return new byte[]{-20, -120, 51, 72, 99, 86, 111, 114, 17, 20};
   }

   private static byte[] apvaoqufxcdqjac() {
      return new byte[]{-20, -120, 51, 78, 99, 92, 111, 125, 17, 21, 35, 98, 80, 79};
   }

   private static byte[] alkfntqxmouywze() {
      return new byte[]{-20, -120, 51, 75, 99, 86, 111, 120, 17, 4, 35, 107, 80, 88, 30, 56, 18, 109, 68, 88, 15, 26, 83, 126, 43, 41, 7, 19};
   }

   private static byte[] yonjdbiekuqesji() {
      return new byte[]{-20, -120, 51, 75, 99, 86, 111, 120, 17, 4, 35, 107, 80, 88, 30, 56, 18, 118, 68, 71, 15, 24, 83, 119};
   }

   private static byte[] gzvppcjptrrdkkv() {
      return new byte[]{-20, -120, 51, 77, 99, 92, 111, 101, 17, 19, 35, 110, 80, 83, 30, 35};
   }

   private static byte[] nztvuuaxdceeujw() {
      return new byte[]{-20, -120, 51, 68, 99, 86, 111, 115, 17, 29};
   }

   private static byte[] jtuvdccryckzpvc() {
      return new byte[]{-20, -120, 51, 79, 99, 87, 111, 104, 17, 14, 35, 99, 80, 88, 30, 36};
   }

   private static byte[] befciidxkimzrpf() {
      return new byte[]{-20, -120, 51, 79, 99, 87, 111, 104, 17, 14, 35, 110, 80, 83, 30, 36};
   }

   private static byte[] qtkhymnqnwivdmf() {
      return new byte[]{-20, -120, 51, 79, 99, 87, 111, 104, 17, 14, 35, 116, 80, 81, 30, 46, 18, 125, 68, 82, 15, 15};
   }

   private static byte[] mijtosdzjddeyud() {
      return new byte[]{-20, -120, 51, 66, 99, 86, 111, 105, 17, 19, 35, 107, 80, 88, 30, 56, 18, 125, 68, 82, 15, 30};
   }

   private static byte[] wbhevgsyxodlxsu() {
      return new byte[]{-20, -120, 51, 66, 99, 86, 111, 105, 17, 19, 35, 107, 80, 88, 30, 56, 18, 112, 68, 89, 15, 30};
   }

   private static byte[] jtgyoxsdlugfopn() {
      return new byte[]{-20, -120, 51, 66, 99, 86, 111, 105, 17, 19, 35, 107, 80, 88, 30, 56, 18, 106, 68, 91, 15, 20, 83, 125, 43, 32, 7, 4};
   }

   private static byte[] ftsykjlptpmwywb() {
      return new byte[]{-20, -120, 51, 85, 99, 77, 111, 110, 17, 24, 35, 105, 80, 90};
   }

   private static byte[] gyrxfwhokddkvpv() {
      return new byte[]{-20, -120, 51, 75, 99, 86, 111, 120, 17, 20};
   }

   private static byte[] hjimklkuwfmkfkc() {
      return new byte[]{-20, -120, 51, 69, 99, 86, 111, 112, 17, 30, 35, 117, 80, 66, 30, 51, 18, 118, 68, 80, 15, 26, 83, 117, 43, 32};
   }

   private static byte[] quoqecsohtopoup() {
      return new byte[]{-20, -120, 51, 69, 99, 86, 111, 112, 17, 30, 35, 117, 80, 66, 30, 48, 18, 113, 68, 82, 15, 24, 83, 117};
   }

   private static byte[] coeezgewewetkxi() {
      return new byte[]{-20, -120, 51, 69, 99, 86, 111, 112, 17, 30, 35, 117, 80, 66, 30, 49, 18, 120, 68, 91, 15, 8, 83, 124};
   }

   private static byte[] mayaconffsyiswb() {
      return new byte[]{-20, -120, 51, 85, 99, 92, 111, 125, 17, 3, 35, 100, 80, 85, 30, 56, 18, 127, 68, 94, 15, 24, 83, 117, 43, 33};
   }

   private static byte[] mfhfynnovladnqf() {
      return new byte[]{-20, -120, 51, 85, 99, 92, 111, 125, 17, 3, 35, 100, 80, 85, 30, 56, 18, 122, 68, 91, 15, 24, 83, 120, 43, 55};
   }

   private static int xsqrptfsxgdgcxcj(int var0, int var1) {
      return var0 ^ var1;
   }
}
