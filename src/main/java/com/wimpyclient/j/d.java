package com.wimpyclient.j;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class d extends f {
   private final int min;
   private final int max;
   private final int step;
   private final DoubleSupplier getter;
   private final DoubleConsumer setter;
   private static int f6IZPaugiIf;
   private transient int LDimlS31PV;
   private static byte[] twblqccssz = tqunhclgbrmmbiw();

   public d(String var1, String var2, int var3, int var4, int var5, DoubleSupplier var6, DoubleConsumer var7) {
super(var1, var2);
      int var25 = 2054727726 ^ 1922521522;
      
      var25 = ijtrkoedhmrlsexr(var25, 562285592);
      var25 = 1643307753 ^ 415084194 ^ Integer.parseInt("1344500175");
      this.LDimlS31PV = 741073528 ^ f6IZPaugiIf;
      var25 = ijtrkoedhmrlsexr(var25, 1218951923);
      this.min = var3;
      this.max = var4;
      byte var18 = 1;
      int var19 = Math.max(var18, var5);
      this.step = var19;
      this.getter = var6;
      this.setter = var7;
   }

   public int min() {
      int var5 = 1727868524 ^ 1498026589 ^ 1419971300;
      var5 = 646991679 ^ var5;
      return this.min;
   }

   public int max() {
      int var5 = 857732866 ^ 450297812 ^ 1419971300;
      var5 = 1597655222 ^ var5;
      return this.max;
   }

   public int step() {
      int var5 = 149065141 ^ 63581361 ^ 1419971300;
      var5 = 2083002686 ^ var5;
      return this.step;
   }

   public int get() {
      int var10 = 1165173869 ^ 636703403 ^ 1419971300;
      var10 = 2036772529 ^ var10;
      DoubleSupplier var2 = this.getter;
      double var3 = var2.getAsDouble();
      long var5 = Math.round(var3);
      return (int)var5;
   }

   public void set(int var1) {
      int var6 = 1682088949 ^ 221917102 ^ 1419971300;
      var6 = 1209330559 ^ var6;
      this.setLive(var1);
      com.wimpyclient.d.a.save();
   }

   public void setLive(int var1) {
      int var16 = 1286026477 ^ 1102169446 ^ 1419971300;
      var16 = 214010268 ^ var16;
      int var6 = this.min;
      int var10 = this.max;
      int var11 = Math.min(var10, var1);
      int var7 = Math.max(var6, var11);
      DoubleConsumer var9 = this.setter;
      double var13 = var7;
      var9.accept(var13);
   }

   public void commit() {
      int var6 = 473589279 ^ 1967366354 ^ 1419971300;
      var6 = 565655669 ^ var6;
      int var3 = this.get();
      this.set(var3);
   }

   public void increment() {
      int var9 = 1500205824 ^ 1837396935 ^ 1419971300;
      var9 = 1153235385 ^ var9;
      int var4 = this.get();
      int var6 = this.step;
      int var5 = var4 + var6;
      this.set(var5);
   }

   public void decrement() {
      int var9 = 2029382425 ^ 1820949399 ^ 1419971300;
      var9 = 1876873275 ^ var9;
      int var4 = this.get();
      int var6 = this.step;
      int var5 = var4 - var6;
      this.set(var5);
   }

   static {
      int var3 = new Random(-4431484411323964926L).nextInt();
      f6IZPaugiIf = 2140492022 ^ var3;
   }

   public static String retjzzpplh(byte[] var0, int var1) {
      String var8 = Integer.toString(var1);
      byte[] var9 = var8.getBytes();
      byte[] var6 = var9;
      byte var10 = 0;
      int var7 = var10;

      while (true) {
         int var15 = var0.length;
         if (var7 >= var15) {
            Charset var29 = StandardCharsets.UTF_16;
            return new String(var0, var29);
         }

         byte var18 = var0[var7];
         int var33 = var6.length;
         int var30 = var7 % var33;
         byte var26 = var6[var30];
         int var19 = var18 ^ var26;
         byte var20 = (byte)var19;
         var0[var7] = var20;
         byte var21 = var0[var7];
         byte[] var27 = twblqccssz;
         byte[] var34 = twblqccssz;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] tqunhclgbrmmbiw() {
      return new byte[]{
         4,
         127,
         8,
         68,
         8,
         22,
         71,
         47,
         51,
         127,
         71,
         84,
         104,
         118,
         103,
         13,
         22,
         67,
         101,
         19,
         66,
         120,
         6,
         42,
         67,
         90,
         75,
         117,
         43,
         55,
         81,
         44,
         87,
         104,
         103,
         17,
         85,
         101,
         34,
         28,
         3,
         99,
         93,
         50,
         7,
         53,
         63,
         85,
         34,
         12,
         78,
         39,
         107,
         28,
         100,
         27,
         104,
         107,
         77,
         120,
         81,
         64,
         124,
         76,
         64,
         56,
         83,
         4,
         7,
         30,
         2,
         122,
         116,
         37,
         25,
         114,
         113,
         77,
         87,
         107,
         5,
         24
      };
   }

   private static int ijtrkoedhmrlsexr(int var0, int var1) {
      return var0 ^ var1;
   }
}
