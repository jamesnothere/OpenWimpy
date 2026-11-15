package com.wimpyclient.j;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class g extends f {
   private final Supplier<String> getter;
   private final Consumer<String> setter;
   private final int maxLength;
   private boolean editing;
   private static int ip7YlZHzdc;
   private transient int Ver1JctY2q;

   public g(String var1, String var2, int var3, Supplier<String> var4, Consumer<String> var5) {
super(var1, var2);
      int var19 = 413379069 ^ 1859592215;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
            case 58968545:
               break;
            case 92388673:
               var19 = 113836343 ^ var19;
            case 1842485874:
               var19 = 718923714 ^ 1984313162 ^ Integer.parseInt("740448341");
               this.Ver1JctY2q = 712694387 ^ ip7YlZHzdc;
               var19 = sdllfzclzvpmbhjr(var19, 352917096);
               byte var12 = 1;
               int var13 = Math.max(var12, var3);
               this.maxLength = var13;
               this.getter = var4;
               this.setter = var5;
               return;
            case 132957572:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public String get() {
      int var10 = 1263680579 ^ 37347631 ^ 1248175135;
      var10 = 374862008 ^ var10;
      Supplier var3 = this.getter;
      Object var4 = var3.get();
      String var5 = (String)var4;
      if (var5 != null) {
         var10 = sdllfzclzvpmbhjr(var10, 1255229539);
         var10 = 767447114 ^ var10;
         return var5;
      } else {
         var10 = 1001846160 ^ var10;
         String var7 = tozpafdddi(xkmaqbvjzmkhbvi(), qdfbdyqhvukuzcd(), var10);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
               case 183512607:
                  var10 = 1557786041 ^ var10;
                  return var7;
               case 366856956:
                  return var7;
               case 1315433682:
                  break;
               case 1567951712:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   public void set(String var1) {
      int var19 = 1545773536 ^ 261223957 ^ 1248175135;
      var19 = 1773797516 ^ var19;
      String var6;
      if (var1 == null) {
         var19 = 605025 ^ var19;
         var6 = tozpafdddi(yfviepystfzcbry(), qdfbdyqhvukuzcd(), var19);
         var19 = 1409334128 ^ var19;
      } else {
         var19 = sdllfzclzvpmbhjr(var19, 1423285528);
         var6 = var1;
         var19 = 14425353 ^ var19;
      }

      String var5 = var6;
      int var8 = var6.length();
      int var13 = this.maxLength;
      if (var8 > var13) {
         var19 = 1070265999 ^ var19;
         byte var14 = (byte)(464487928 ^ var19);
         int var16 = this.maxLength;
         String var10 = var6.substring(var14, var16);
         var5 = var10;
         var19 = 320211365 ^ var19;
      } else {
         var19 = sdllfzclzvpmbhjr(var19, 752680746);
      }

      Consumer var12 = this.setter;
      var12.accept(var5);
      com.wimpyclient.d.a.save();
   }

   public int maxLength() {
      int var5 = 839745772 ^ 1926772886 ^ 1248175135;
      var5 = 1434336328 ^ var5;
      return this.maxLength;
   }

   public boolean isEditing() {
      int var5 = 195719056 ^ 933092539 ^ 1248175135;
      var5 = 396209771 ^ var5;
      return this.editing;
   }

   public void setEditing(boolean var1) {
      int var6 = 1059957414 ^ 1842827929 ^ 1248175135;
      var6 = 264289338 ^ var6;
      this.editing = var1;
   }

   static {
      int var3 = new Random(-6839842423139880031L).nextInt();
      ip7YlZHzdc = -1707140874 ^ var3;
   }

   public static String tozpafdddi(byte[] var0, byte[] var1, int var2) {
      String var9 = Integer.toString(var2);
      byte[] var10 = var9.getBytes();
      byte[] var7 = var10;
      byte var11 = 0;
      int var8 = var11;

      while (true) {
         int var16 = var0.length;
         if (var8 >= var16) {
            Charset var30 = StandardCharsets.UTF_16;
            return new String(var0, var30);
         }

         byte var19 = var0[var8];
         int var34 = var7.length;
         int var31 = var8 % var34;
         byte var27 = var7[var31];
         int var20 = var19 ^ var27;
         byte var21 = (byte)var20;
         var0[var8] = var21;
         byte var22 = var0[var8];
         int var36 = var1.length;
         int var33 = var8 % var36;
         byte var29 = var1[var33];
         int var23 = var22 ^ var29;
         byte var24 = (byte)var23;
         var0[var8] = var24;
         var8++;
      }
   }

   private static byte[] qdfbdyqhvukuzcd() {
      return new byte[]{
         41,
         90,
         103,
         37,
         118,
         31,
         84,
         93,
         124,
         112,
         80,
         15,
         49,
         9,
         97,
         60,
         29,
         31,
         95,
         46,
         96,
         63,
         39,
         92,
         58,
         43,
         26,
         29,
         40,
         105,
         36,
         126,
         33,
         23,
         119,
         73,
         85,
         125,
         30,
         106,
         65,
         35,
         28,
         56,
         5,
         98,
         67,
         44,
         114,
         20,
         45,
         122,
         16,
         125,
         81,
         26,
         20,
         17,
         28,
         20,
         47,
         73,
         92,
         21,
         61,
         68,
         107,
         28,
         54,
         118,
         119,
         108,
         7,
         5,
         121,
         69,
         70,
         30,
         57,
         23,
         59,
         52,
         98,
         11,
         23,
         90,
         53,
         7
      };
   }

   private static byte[] xkmaqbvjzmkhbvi() {
      return new byte[0];
   }

   private static byte[] yfviepystfzcbry() {
      return new byte[0];
   }

   private static int sdllfzclzvpmbhjr(int var0, int var1) {
      return var1 ^ var0;
   }
}
