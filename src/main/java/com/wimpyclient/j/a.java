package com.wimpyclient.j;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a extends f {
   private final BooleanSupplier getter;
   private final Consumer<Boolean> setter;
   private static int T8bxOjFhF8;
   private transient int UzrIiHEhWb;

   public a(String var1, String var2, BooleanSupplier var3, Consumer<Boolean> var4) {
super(var1, var2);
      int var14 = 436238302 ^ 868018532;
      
      var14 = qgmshxenmzufipkk(var14, 968675176);
      var14 = 1174469416 ^ 1753812802 ^ Integer.parseInt("1049208248");
      this.UzrIiHEhWb = 1257262689 ^ T8bxOjFhF8;
      var14 = qgmshxenmzufipkk(var14, 534679754);
      this.getter = var3;
      this.setter = var4;
   }

   public boolean get() {
      int var6 = 825152119 ^ 1065238124 ^ 633486769;
      var6 = 849780046 ^ var6;
      BooleanSupplier var2 = this.getter;
      return var2.getAsBoolean();
   }

   public void set(boolean var1) {
      int var8 = 1649388891 ^ 1862258805 ^ 633486769;
      var8 = 1695036971 ^ var8;
      Consumer var4 = this.setter;
      Boolean var5 = var1;
      var4.accept(var5);
      com.wimpyclient.d.a.save();
   }

   public void toggle() {
      int var7 = 909426782 ^ 1483772054 ^ 633486769;
      var7 = 826758571 ^ var7;
      byte var3 = (byte)((this.get()) ? 1 : 0);
      byte var4;
      if (var3 != (2059483346 ^ var7)) {
         var7 = qgmshxenmzufipkk(var7, 1799685655);
         var4 = (byte)(293879493 ^ var7);
         var7 = 2049338177 ^ var7;
      } else {
         var7 = 513670930 ^ var7;
         var4 = (byte)(1683802049 ^ var7);

         label20:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var7)) {
               case 41133912:
                  var7 = 268341828 ^ var7;
                  break label20;
               case 431298892:
                  break;
               case 860539627:
                  break label20;
               case 2061125055:
               default:
                  throw new RuntimeException();
            }
         }
      }

      this.set((var4 != 0));
   }

   static {
      int var3 = new Random(-2879338406677608176L).nextInt();
      T8bxOjFhF8 = 1536078948 ^ var3;
   }

   public static String smdfcnjqwm(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] xrjvlshlokyodcz() {
      return new byte[]{107, 118, 28, 65};
   }

   private static int qgmshxenmzufipkk(int var0, int var1) {
      return var1 ^ var0;
   }
}
