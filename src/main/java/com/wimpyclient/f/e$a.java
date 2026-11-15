package com.wimpyclient.f;

import java.util.Objects;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class e$a {
   private final long pos;
   private final int height;
   private final long[] stacks;
   private static int YzOoj0twD7;
   private transient int c3yKUtMUFz;

   public e$a(long pos, int height, long[] stacks) {
super();
      int var15 = 384084980 ^ 1110522299;
      
      var15 = 1738231393 ^ var15;
      var15 = 1568070022 ^ 176392007 ^ Integer.parseInt("1690010351");
      this.c3yKUtMUFz = 773106401 ^ YzOoj0twD7;
      var15 = 821199447 ^ var15;
      this.pos = pos;
      this.height = height;
      this.stacks = stacks;
   }

   boolean sameAs(e$a var1) {
      int var20 = 1075881688 ^ 954373802 ^ 1233018349;
      var20 = 1437929372 ^ var20;
      long var5 = this.pos;
      long var17 = var1.pos;
      long var27;
      int var7 = (var27 = var5 - var17) == 0L ? 0 : (var27 < 0L ? -1 : 1);
      if (var7 == (1678336515 ^ var20)) {
         var20 = 1226325598 ^ var20;
         int var9 = this.height;
         int var14 = var1.height;
         if (var9 == var14) {
            var20 = 1847344520 ^ var20;
            long[] var11 = this.stacks;
            long[] var16 = var1.stacks;
            byte var12 = (byte)((Arrays.equals(var11, var16)) ? 1 : 0);
            if (var12 != (1124950485 ^ var20)) {
               var20 = 1666522455 ^ var20;
               byte var13 = (byte)(542669955 ^ var20);
               var20 = bhqyupxekkxcjqnr(var20, 495531818);
               return (var13 != 0);
            }

            var20 = bhqyupxekkxcjqnr(var20, 686995407);
         } else {
            label24:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
                  case 122785765:
                     var20 ^= 1190038087;
                  case 961839813:
                     break label24;
                  case 1208491658:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1673932522:
               }
            }
         }
      } else {
         var20 = bhqyupxekkxcjqnr(var20, 267826201);
      }

      byte var28 = (byte)(1811928602 ^ var20);
      var20 = 1445895602 ^ var20;
      return (var28 != 0);
   }

   @Override
   public final String toString() {
      int var5 = 1442452319 ^ 2041623873 ^ 1233018349;
      var5 = 687423697 ^ var5;
      return "e$a[pos=" + this.pos + ", height=" + this.height + ", stacks=" + this.stacks + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 611179500 ^ 334746023 ^ 1233018349;
      var5 = 1019193722 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.pos);
      result = 31 * result + Objects.hashCode(this.height);
      result = 31 * result + Objects.hashCode(this.stacks);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1166777846 ^ 78608204 ^ 1233018349;
      var7 = 344220285 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      e$a other = (e$a)var1;
      return this.pos == other.pos &&
      this.height == other.height &&
      Objects.equals(this.stacks, other.stacks);
   }

   public long pos() {
      int var5 = 386061731 ^ 125824575 ^ 1233018349;
      var5 = 1427077278 ^ var5;
      return this.pos;
   }

   public int height() {
      int var5 = 1639539293 ^ 1855410015 ^ 1233018349;
      var5 = 123251527 ^ var5;
      return this.height;
   }

   public long[] stacks() {
      int var5 = 104164176 ^ 89877109 ^ 1233018349;
      var5 = 1806344372 ^ var5;
      return this.stacks;
   }

   static {
      int var3 = new Random(-4277454563262567044L).nextInt();
      YzOoj0twD7 = 2146411844 ^ var3;
   }

   public static String udeuptmmzp(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] kkvfopzskmdpiwf() {
      return new byte[]{
         31,
         114,
         81,
         87,
         6,
         85,
         114,
         104,
         81,
         112,
         83,
         50,
         10,
         91,
         120,
         120,
         20,
         108,
         94,
         48,
         49,
         109,
         51,
         21,
         50,
         1,
         72,
         88,
         92,
         37,
         66,
         117,
         97,
         73,
         62,
         106,
         99,
         25,
         2,
         9,
         91
      };
   }

   private static int bhqyupxekkxcjqnr(int var0, int var1) {
      return var1 ^ var0;
   }
}
