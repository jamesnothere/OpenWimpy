package com.wimpyclient.g;

import com.wimpyclient.i.v;
import com.wimpyclient.i.w;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class b$b {
   final b$c type;
   final v module;
   final com.wimpyclient.j.f setting;
   final w category;
   final int a;
   final int b;
   private static int f3jeCgE5Flu;
   private transient int eE8Qsh0Jxo;

   public b$b(b$c var1, v var2, com.wimpyclient.j.f var3, w var4, int var5, int var6) {
super();
      int var22 = 286296354 ^ 522371904;
      
      var22 = 405984658 ^ var22;
      var22 = 948933128 ^ 1634143164 ^ Integer.parseInt("1340606020");
      this.eE8Qsh0Jxo = 2105176264 ^ f3jeCgE5Flu;
      var22 = svrtgtozfrpbzqsp(var22, 2039614026);
      this.type = var1;
      this.module = var2;
      this.setting = var3;
      this.category = var4;
      this.a = var5;
      this.b = var6;
   }

   static b$b miss() {
      int var9 = 1323372400 ^ 58354267 ^ 968759475;
      var9 = 732698891 ^ var9;
      b$c var1 = b$c.NONE;
      Object var2 = null;
      Object var3 = null;
      Object var4 = null;
      byte var5 = (byte)(1602839699 ^ var9);
      byte var6 = (byte)(1602839699 ^ var9);
      return new b$b(var1, (v)var2, (com.wimpyclient.j.f)var3, (w)var4, var5, var6);
   }

   static b$b header(w var0) {
      int var10 = 639693983 ^ 1129835204 ^ 968759475;
      var10 = 1726949744 ^ var10;
      b$c var2 = b$c.HEADER;
      Object var3 = null;
      Object var4 = null;
      byte var6 = (byte)(975581080 ^ var10);
      byte var7 = (byte)(975581080 ^ var10);
      return new b$b(var2, (v)var3, (com.wimpyclient.j.f)var4, var0, var6, var7);
   }

   static b$b moduleToggle(v var0) {
      int var10 = 391650967 ^ 1564193160 ^ 968759475;
      var10 = 857776374 ^ var10;
      b$c var2 = b$c.MODULE_TOGGLE;
      Object var4 = null;
      Object var5 = null;
      byte var6 = (byte)(1090328410 ^ var10);
      byte var7 = (byte)(1090328410 ^ var10);
      return new b$b(var2, var0, (com.wimpyclient.j.f)var4, (w)var5, var6, var7);
   }

   static b$b moduleOpen(v var0) {
      int var10 = 640239992 ^ 1037128425 ^ 968759475;
      var10 = 923883432 ^ var10;
      b$c var2 = b$c.MODULE_OPEN;
      Object var4 = null;
      Object var5 = null;
      byte var6 = (byte)(358044810 ^ var10);
      byte var7 = (byte)(358044810 ^ var10);
      return new b$b(var2, var0, (com.wimpyclient.j.f)var4, (w)var5, var6, var7);
   }

   static b$b keybind(v var0) {
      int var10 = 53530920 ^ 1177861158 ^ 968759475;
      var10 = 1512523763 ^ var10;
      b$c var2 = b$c.KEYBIND;
      Object var4 = null;
      Object var5 = null;
      byte var6 = (byte)(647836238 ^ var10);
      byte var7 = (byte)(647836238 ^ var10);
      return new b$b(var2, var0, (com.wimpyclient.j.f)var4, (w)var5, var6, var7);
   }

   static b$b bool(com.wimpyclient.j.a var0) {
      int var10 = 1327016133 ^ 1360450016 ^ 968759475;
      var10 = 399974700 ^ var10;
      b$c var2 = b$c.BOOL;
      Object var3 = null;
      Object var5 = null;
      byte var6 = (byte)(812073146 ^ var10);
      byte var7 = (byte)(812073146 ^ var10);
      return new b$b(var2, (v)var3, var0, (w)var5, var6, var7);
   }

   static b$b intDec(com.wimpyclient.j.d var0) {
      int var10 = 890108227 ^ 2012642649 ^ 968759475;
      var10 = 376907070 ^ var10;
      b$c var2 = b$c.INT_DEC;
      Object var3 = null;
      Object var5 = null;
      byte var6 = (byte)(1832040855 ^ var10);
      byte var7 = (byte)(1832040855 ^ var10);
      return new b$b(var2, (v)var3, var0, (w)var5, var6, var7);
   }

   static b$b intInc(com.wimpyclient.j.d var0) {
      int var10 = 567596158 ^ 1965766695 ^ 968759475;
      var10 = 983996276 ^ var10;
      b$c var2 = b$c.INT_INC;
      Object var3 = null;
      Object var5 = null;
      byte var6 = (byte)(1474782110 ^ var10);
      byte var7 = (byte)(1474782110 ^ var10);
      return new b$b(var2, (v)var3, var0, (w)var5, var6, var7);
   }

   static b$b intSlider(com.wimpyclient.j.d var0, int var1, int var2) {
      int var12 = 236649394 ^ 509378197 ^ 968759475;
      var12 = 1402137506 ^ var12;
      b$c var4 = b$c.INT_SLIDER;
      Object var5 = null;
      Object var7 = null;
      return new b$b(var4, (v)var5, var0, (w)var7, var1, var2);
   }

   static b$b doubleDec(com.wimpyclient.j.c var0) {
      int var10 = 942730518 ^ 1982481786 ^ 968759475;
      var10 = 744085347 ^ var10;
      b$c var2 = b$c.DOUBLE_DEC;
      Object var3 = null;
      Object var5 = null;
      byte var6 = (byte)(1543333820 ^ var10);
      byte var7 = (byte)(1543333820 ^ var10);
      return new b$b(var2, (v)var3, var0, (w)var5, var6, var7);
   }

   static b$b doubleInc(com.wimpyclient.j.c var0) {
      int var10 = 2097502411 ^ 336321381 ^ 968759475;
      var10 = 1356498560 ^ var10;
      b$c var2 = b$c.DOUBLE_INC;
      Object var3 = null;
      Object var5 = null;
      byte var6 = (byte)(6954397 ^ var10);
      byte var7 = (byte)(6954397 ^ var10);
      return new b$b(var2, (v)var3, var0, (w)var5, var6, var7);
   }

   static b$b doubleSlider(com.wimpyclient.j.c var0, int var1, int var2) {
      int var12 = 59216652 ^ 286400428 ^ 968759475;
      var12 = 1266060032 ^ var12;
      b$c var4 = b$c.DOUBLE_SLIDER;
      Object var5 = null;
      Object var7 = null;
      return new b$b(var4, (v)var5, var0, (w)var7, var1, var2);
   }

   static b$b stringEdit(com.wimpyclient.j.g var0) {
      int var10 = 191986398 ^ 1314185257 ^ 968759475;
      var10 = 2015752730 ^ var10;
      b$c var2 = b$c.STRING;
      Object var3 = null;
      Object var5 = null;
      byte var6 = (byte)(79589470 ^ var10);
      byte var7 = (byte)(79589470 ^ var10);
      return new b$b(var2, (v)var3, var0, (w)var5, var6, var7);
   }

   static b$b mode(com.wimpyclient.j.e var0) {
      int var10 = 718289296 ^ 412475450 ^ 968759475;
      var10 = 910103140 ^ var10;
      b$c var2 = b$c.MODE;
      Object var3 = null;
      Object var5 = null;
      byte var6 = (byte)(1036309373 ^ var10);
      byte var7 = (byte)(1036309373 ^ var10);
      return new b$b(var2, (v)var3, var0, (w)var5, var6, var7);
   }

   static b$b colorToggle(com.wimpyclient.j.b var0) {
      int var10 = 1484198279 ^ 671930002 ^ 968759475;
      var10 = 167081826 ^ var10;
      b$c var2 = b$c.COLOR_TOGGLE;
      Object var3 = null;
      Object var5 = null;
      byte var6 = (byte)(1076930756 ^ var10);
      byte var7 = (byte)(1076930756 ^ var10);
      return new b$b(var2, (v)var3, var0, (w)var5, var6, var7);
   }

   static b$b colorWheel(com.wimpyclient.j.b var0, int var1, int var2) {
      int var12 = 1254342498 ^ 608698643 ^ 968759475;
      var12 = 1482751930 ^ var12;
      b$c var4 = b$c.COLOR_WHEEL;
      Object var5 = null;
      Object var7 = null;
      return new b$b(var4, (v)var5, var0, (w)var7, var1, var2);
   }

   static b$b colorValue(com.wimpyclient.j.b var0, int var1, int var2) {
      int var12 = 2054474772 ^ 1901798308 ^ 968759475;
      var12 = 843447938 ^ var12;
      b$c var4 = b$c.COLOR_VALUE;
      Object var5 = null;
      Object var7 = null;
      return new b$b(var4, (v)var5, var0, (w)var7, var1, var2);
   }

   static b$b searchField() {
      int var9 = 808305718 ^ 762641275 ^ 968759475;
      var9 = 1342855313 ^ var9;
      b$c var1 = b$c.SEARCH_FIELD;
      Object var2 = null;
      Object var3 = null;
      Object var4 = null;
      byte var5 = (byte)(1961721711 ^ var9);
      byte var6 = (byte)(1961721711 ^ var9);
      return new b$b(var1, (v)var2, (com.wimpyclient.j.f)var3, (w)var4, var5, var6);
   }

   static {
      int var3 = new Random(6595947305094193084L).nextInt();
      f3jeCgE5Flu = -26227547 ^ var3;
   }

   public static String rutyeqdkxp(byte[] var0, byte[] var1, int var2) {
      String var11 = Integer.toString(var2);
      byte[] var12 = var11.getBytes();
      byte[] var9 = var12;
      byte var13 = 0;
      int var10 = var13;

      while (true) {
         int var18 = var0.length;
         if (var10 >= var18) {
            Charset var6 = StandardCharsets.UTF_16;
            return new String(var0, var6);
         }

         byte var21 = var0[var10];
         int var34 = var9.length;
         int var31 = var10 % var34;
         byte var28 = var9[var31];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var10] = var23;
         byte var24 = var0[var10];
         int var36 = var1.length;
         int var33 = var10 % var36;
         byte var30 = var1[var33];
         int var25 = var24 ^ var30;
         byte var26 = (byte)var25;
         var0[var10] = var26;
         var10++;
      }
   }

   private static byte[] wouqpqdfqixviuk() {
      return new byte[]{
         50,
         56,
         78,
         93,
         126,
         95,
         47,
         41,
         108,
         87,
         22,
         38,
         48,
         14,
         56,
         41,
         71,
         61,
         14,
         118,
         66,
         15,
         42,
         15,
         110,
         35,
         59,
         127,
         74,
         101,
         5,
         83,
         27,
         118,
         117,
         1,
         121,
         86,
         29,
         123,
         79,
         67,
         35,
         28,
         102,
         5,
         71,
         35,
         123,
         2,
         4,
         5,
         37,
         60,
         122,
         34,
         109,
         24,
         86,
         36,
         4,
         126,
         120,
         21,
         97,
         14,
         48,
         21,
         30,
         60,
         83,
         100,
         75,
         10,
         31,
         34,
         14,
         64,
         70,
         127,
         51
      };
   }

   private static int svrtgtozfrpbzqsp(int var0, int var1) {
      return var0 ^ var1;
   }
}
