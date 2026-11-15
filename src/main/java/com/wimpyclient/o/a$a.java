package com.wimpyclient.o;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class a$a {
   public final String name;
   public final String[] files;
   private static int f1DtFAV92GF;
   private transient int hy1pbgX18R;

   public a$a(String name, String... files) {
super();
      int var10 = 122905521 ^ 915756901;
      
      var10 = oiatzbsepavsusqz(var10, 1408322012);
      var10 = 1767413347 ^ 343351283 ^ Integer.parseInt("521729176");
      this.hy1pbgX18R = 857204583 ^ f1DtFAV92GF;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
            case 239853576:
               var10 = 331356093 ^ var10;
            case 2142966959:
               this.name = name;
               this.files = files;
               return;
            case 869886787:
            default:
               throw new RuntimeException();
            case 1960754300:
         }
      }
   }

   @Override
   public final String toString() {
      int var5 = 1093430194 ^ 1922032947 ^ 1111559583;
      var5 = 609252855 ^ var5;
      return "a$a[name=" + this.name + ", files=" + this.files + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1968750399 ^ 416055765 ^ 1111559583;
      var5 = 265912510 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.name);
      result = 31 * result + Objects.hashCode(this.files);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1533963899 ^ 261105470 ^ 1111559583;
      var7 = 524747295 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      a$a other = (a$a)var1;
      return Objects.equals(this.name, other.name) &&
      Objects.equals(this.files, other.files);
   }

   public String name() {
      int var5 = 143351626 ^ 943327967 ^ 1111559583;
      var5 = 1108713080 ^ var5;
      return this.name;
   }

   public String[] files() {
      int var5 = 793493228 ^ 1163556797 ^ 1111559583;
      var5 = 692980206 ^ var5;
      return this.files;
   }

   static {
      int var3 = new Random(-553537999915559613L).nextInt();
      f1DtFAV92GF = -1411538219 ^ var3;
   }

   public static String zcgchokulo(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] gfdznzxdurjnapz() {
      return new byte[]{
         124,
         26,
         19,
         54,
         91,
         57,
         33,
         123,
         91,
         110,
         29,
         124,
         76,
         77,
         63,
         88,
         111,
         91,
         47,
         6,
         17,
         32,
         127,
         89,
         22,
         6,
         15,
         12,
         1,
         81,
         69,
         115,
         75,
         115,
         101,
         73,
         29,
         85,
         80,
         88,
         9,
         73,
         20,
         32,
         64,
         16,
         91,
         112,
         66,
         113,
         15,
         79,
         8,
         124,
         41,
         8,
         75,
         117,
         55,
         15,
         27,
         99,
         1,
         124,
         19,
         26,
         127,
         24,
         27,
         59,
         40,
         33,
         1,
         124,
         100,
         50,
         100,
         57,
         90,
         60,
         63,
         117,
         82,
         88,
         90,
         36,
         62,
         12,
         74
      };
   }

   private static int oiatzbsepavsusqz(int var0, int var1) {
      return var1 ^ var0;
   }
}
