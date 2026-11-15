package com.wimpyclient.n;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class c {
   private final String name;
   private final String rankLabel;
   private final int color;
   private final boolean vanished;
   private final int latency;
   private final int priority;
   private static int Vm0bm2YihP;
   private transient int f85UKTwfwxV;
   private static byte[] epkouyumgi = sinncveedkbbufg();

   public c(String var1, String var2, int var3, boolean var4, int var5, int var6) {
super();
      int var22 = 290985734 ^ 573153368;
      
      var22 = 957699843 ^ var22;
      var22 = 377960729 ^ 2000138472 ^ Integer.parseInt("1809082796");
      this.f85UKTwfwxV = 2111067492 ^ Vm0bm2YihP;
      var22 = 1220500601 ^ var22;
      this.name = var1;
      this.rankLabel = var2;
      this.color = var3;
      this.vanished = var4;
      this.latency = var5;
      this.priority = var6;
   }

   public boolean hasColor() {
      int var8 = 44341909 ^ 252806053 ^ 1478379486;
      var8 = 1078234006 ^ var8;
      int var3 = this.color;
      int var2 = 353380999 ^ var8;
      int var4 = var3 & var2;
      byte var5;
      if (var4 != (368039288 ^ var8)) {
         var8 = 2096723862 ^ var8;
         var5 = (byte)(1763091183 ^ var8);
         var8 = nrtttknkcnfgyaon(var8, 1911943291);
      } else {
         var8 = 2118643422 ^ var8;
         var5 = (byte)(1806187430 ^ var8);
         var8 = 1934321971 ^ var8;
      }

      return (var5 != 0);
   }

   public String name() {
      int var5 = 1580002520 ^ 119625916 ^ 1478379486;
      var5 = 1127240870 ^ var5;
      return this.name;
   }

   public String rankLabel() {
      int var5 = 1601108265 ^ 881781587 ^ 1478379486;
      var5 = 518164273 ^ var5;
      return this.rankLabel;
   }

   public int color() {
      int var5 = 1153719808 ^ 1829817699 ^ 1478379486;
      var5 = 1137058541 ^ var5;
      return this.color;
   }

   public boolean vanished() {
      int var5 = 475031907 ^ 971959591 ^ 1478379486;
      var5 = 626335293 ^ var5;
      return this.vanished;
   }

   public int latency() {
      int var5 = 2101571691 ^ 397270766 ^ 1478379486;
      var5 = 1006465576 ^ var5;
      return this.latency;
   }

   public int priority() {
      int var5 = 1548694819 ^ 838533198 ^ 1478379486;
      var5 = 1798603162 ^ var5;
      return this.priority;
   }

   static {
      int var3 = new Random(-4416123782310085335L).nextInt();
      Vm0bm2YihP = 141945259 ^ var3;
   }

   public static String wmioqluulz(byte[] var0, int var1) {
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
         byte[] var28 = epkouyumgi;
         byte[] var34 = epkouyumgi;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] sinncveedkbbufg() {
      return new byte[]{
         29,
         110,
         114,
         12,
         14,
         64,
         93,
         124,
         27,
         115,
         72,
         1,
         93,
         115,
         102,
         14,
         25,
         31,
         60,
         127,
         11,
         121,
         2,
         111,
         91,
         76,
         105,
         84,
         38,
         43,
         41,
         59,
         71,
         6,
         64,
         19,
         126,
         27,
         127,
         77,
         115,
         32,
         112,
         21,
         93,
         104,
         34,
         28,
         5,
         16,
         71,
         118,
         84,
         17,
         21,
         119,
         48,
         57,
         50,
         80,
         68,
         37,
         125,
         41,
         93,
         2,
         25,
         40,
         71,
         89,
         19,
         115,
         26,
         20,
         34,
         55
      };
   }

   private static int nrtttknkcnfgyaon(int var0, int var1) {
      return var1 ^ var0;
   }
}
