package com.wimpyclient.s;

import java.util.Objects;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a$c {
   private final long chunk;
   private final int blocks;
   private final long[] anchors;
   private final List<b$f> verdicts;
   private static int H2hnTWPeTO;
   private transient int RBIF4X3B3J;

   public a$c(long chunk, int blocks, long[] anchors, List<b$f> verdicts) {
super();
      int var18 = 484931153 ^ 582503203;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
            case 51709161:
               break;
            case 78244120:
            default:
               throw new RuntimeException(new IOException());
            case 148420947:
               var18 = 681615766 ^ var18;
            case 738397126:
               var18 = 1579569416 ^ 1765562082 ^ Integer.parseInt("568695566");
               this.RBIF4X3B3J = 1115445788 ^ H2hnTWPeTO;
               var18 = 1727723307 ^ var18;
               this.chunk = chunk;
               this.blocks = blocks;
               this.anchors = anchors;
               this.verdicts = verdicts;
               return;
         }
      }
   }

   public boolean flagged() {
      int var7 = 1069863889 ^ 1887894580 ^ 1869933420;
      var7 = 819606458 ^ var7;
      long[] var2 = this.anchors;
      int var3 = var2.length;
      byte var4;
      if (var3 > (283965235 ^ var7)) {
         var7 = 1375088532 ^ var7;
         var4 = (byte)(1092278438 ^ var7);
         var7 = 737206656 ^ var7;
      } else {
         var7 = yjeeunkfwkavzdzt(var7, 704808250);
         var4 = (byte)(988705289 ^ var7);
         var7 = 1342458670 ^ var7;
      }

      return (var4 != 0);
   }

   @Override
   public final String toString() {
      int var5 = 2026728917 ^ 1606026176 ^ 1869933420;
      var5 = 1914381932 ^ var5;
      return "a$c[chunk=" + this.chunk + ", blocks=" + this.blocks + ", anchors=" + this.anchors + ", verdicts=" + this.verdicts + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1487185954 ^ 905537318 ^ 1869933420;
      var5 = 699957615 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.chunk);
      result = 31 * result + Objects.hashCode(this.blocks);
      result = 31 * result + Objects.hashCode(this.anchors);
      result = 31 * result + Objects.hashCode(this.verdicts);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1986117357 ^ 581288397 ^ 1869933420;
      var7 = 2120186617 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      a$c other = (a$c)var1;
      return this.chunk == other.chunk &&
      this.blocks == other.blocks &&
      Objects.equals(this.anchors, other.anchors) &&
      Objects.equals(this.verdicts, other.verdicts);
   }

   public long chunk() {
      int var5 = 776647743 ^ 1636749757 ^ 1869933420;
      var5 = 210999846 ^ var5;
      return this.chunk;
   }

   public int blocks() {
      int var5 = 830490688 ^ 1917667908 ^ 1869933420;
      var5 = 1314954714 ^ var5;
      return this.blocks;
   }

   public long[] anchors() {
      int var5 = 1018180911 ^ 369466297 ^ 1869933420;
      var5 = 1467433709 ^ var5;
      return this.anchors;
   }

   public List<b$f> verdicts() {
      int var5 = 1207396757 ^ 1715167934 ^ 1869933420;
      var5 = 741948750 ^ var5;
      return this.verdicts;
   }

   static {
      int var3 = new Random(7297023302825426978L).nextInt();
      H2hnTWPeTO = 1084973065 ^ var3;
   }

   public static String feqhufxwib(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] jtcloycqjzfxgfb() {
      return new byte[]{
         64,
         95,
         94,
         101,
         49,
         21,
         71,
         13,
         85,
         124,
         18,
         55,
         68,
         85,
         42,
         97,
         33,
         86,
         39,
         60,
         48,
         125,
         49,
         39,
         79,
         76,
         108,
         45,
         100,
         78,
         50,
         3,
         56,
         57,
         45,
         124,
         72,
         29,
         58,
         44,
         49,
         27,
         102,
         22,
         37,
         82,
         61,
         98,
         96,
         85,
         68,
         95,
         57,
         54,
         118,
         93,
         78,
         83,
         65,
         27,
         21,
         3,
         33,
         5,
         8,
         41,
         114,
         107,
         54,
         25,
         65,
         75,
         35,
         80,
         124,
         112,
         48,
         124,
         28,
         123,
         63,
         63,
         75,
         1,
         107,
         89,
         98,
         78
      };
   }

   private static int yjeeunkfwkavzdzt(int var0, int var1) {
      return var0 ^ var1;
   }
}
