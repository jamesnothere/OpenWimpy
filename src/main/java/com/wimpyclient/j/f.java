package com.wimpyclient.j;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public abstract class f {
   private final String name;
   private final String description;
   private static int R24FQsvu4M;
   private transient int nGCfLN56eN;
   private static byte[] ufipaowakw = knbcdixtfxdbwca();

   protected f(String var1, String var2) {
super();
      int var10 = 687045121 ^ 1730544681;
      
      var10 = 791171992 ^ var10;
      var10 = 10988614 ^ 1661448720 ^ Integer.parseInt("56439782");
      this.nGCfLN56eN = 620120857 ^ R24FQsvu4M;
      var10 = yywmqdqcajjoqtgp(var10, 880009391);
      this.name = var1;
      this.description = var2;
   }

   public String name() {
      int var5 = 2003532628 ^ 738381005 ^ 1060613920;
      var5 = 2095599963 ^ var5;
      return this.name;
   }

   public String description() {
      int var5 = 722372663 ^ 218632143 ^ 1060613920;
      var5 = 1980380584 ^ var5;
      return this.description;
   }

   static {
      int var3 = new Random(-879819548961778767L).nextInt();
      R24FQsvu4M = -1705505644 ^ var3;
   }

   public static String ewdfoklnom(byte[] var0, int var1) {
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
         byte[] var28 = ufipaowakw;
         byte[] var34 = ufipaowakw;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] knbcdixtfxdbwca() {
      return new byte[]{
         40,
         104,
         76,
         16,
         27,
         126,
         36,
         61,
         14,
         51,
         27,
         54,
         64,
         88,
         126,
         124,
         67,
         69,
         126,
         91,
         4,
         102,
         18,
         82,
         42,
         26,
         106,
         99,
         71,
         59,
         110,
         91,
         10,
         8,
         4,
         35,
         96,
         25,
         109,
         101,
         34,
         24,
         73,
         88,
         28,
         49,
         35,
         100,
         77,
         28,
         34,
         32,
         51,
         67,
         14,
         10,
         53,
         59,
         53,
         22,
         20,
         12,
         107
      };
   }

   private static int yywmqdqcajjoqtgp(int var0, int var1) {
      return var1 ^ var0;
   }
}
