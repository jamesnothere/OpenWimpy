package com.wimpyclient.f;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class g$b {
   private final int flags;
   private final int score;
   private final boolean crystalsVisible;
   private final boolean densityEligible;
   private static int mUBITM7iR6;
   private transient int i0dGFckaiM;
   private static byte[] cbcrqedtrp = bluoamyhkyzqtpo();

   public g$b(int flags, int score, boolean crystalsVisible, boolean densityEligible) {
super();
      int var16 = 637305641 ^ 1237607127;
      
      var16 = 1004043689 ^ var16;
      var16 = 1015894217 ^ 1238463165 ^ Integer.parseInt("582794787");
      this.i0dGFckaiM = 2062718103 ^ mUBITM7iR6;
      var16 = 1430968905 ^ var16;
      this.flags = flags;
      this.score = score;
      this.crystalsVisible = crystalsVisible;
      this.densityEligible = densityEligible;
   }

   @Override
   public final String toString() {
      int var5 = 473753620 ^ 439225978 ^ 719382230;
      var5 = 1611811801 ^ var5;
      return "g$b[flags=" + this.flags + ", score=" + this.score + ", crystalsVisible=" + this.crystalsVisible + ", densityEligible=" + this.densityEligible + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 765470867 ^ 1886218908 ^ 719382230;
      var5 = 788703674 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.flags);
      result = 31 * result + Objects.hashCode(this.score);
      result = 31 * result + Objects.hashCode(this.crystalsVisible);
      result = 31 * result + Objects.hashCode(this.densityEligible);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1946438424 ^ 1731316855 ^ 719382230;
      var7 = 616863742 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      g$b other = (g$b)var1;
      return this.flags == other.flags &&
      this.score == other.score &&
      this.crystalsVisible == other.crystalsVisible &&
      this.densityEligible == other.densityEligible;
   }

   public int flags() {
      int var5 = 1731868524 ^ 939394910 ^ 719382230;
      var5 = 1621063524 ^ var5;
      return this.flags;
   }

   public int score() {
      int var5 = 1100260550 ^ 831481370 ^ 719382230;
      var5 = 2138421154 ^ var5;
      return this.score;
   }

   public boolean crystalsVisible() {
      int var5 = 349104190 ^ 2104771217 ^ 719382230;
      var5 = 781225143 ^ var5;
      return this.crystalsVisible;
   }

   public boolean densityEligible() {
      int var5 = 44570438 ^ 1666779836 ^ 719382230;
      var5 = 1540654862 ^ var5;
      return this.densityEligible;
   }

   static {
      int var3 = new Random(7126960338248477166L).nextInt();
      mUBITM7iR6 = -280650212 ^ var3;
   }

   public static String gzhpodwlvr(byte[] var0, int var1) {
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
         byte[] var28 = cbcrqedtrp;
         byte[] var34 = cbcrqedtrp;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] bluoamyhkyzqtpo() {
      return new byte[]{
         33,
         26,
         89,
         16,
         52,
         22,
         10,
         6,
         105,
         122,
         86,
         124,
         51,
         21,
         119,
         63,
         115,
         61,
         79,
         4,
         2,
         116,
         76,
         67,
         55,
         6,
         63,
         58,
         30,
         107,
         37,
         17,
         4,
         33,
         24,
         46,
         55,
         15,
         66,
         23,
         16,
         52,
         28,
         93,
         27,
         1,
         107,
         101,
         30,
         38,
         110,
         51,
         118,
         89,
         52,
         4,
         81,
         31,
         13,
         111,
         28,
         98,
         123,
         68,
         47,
         71,
         20,
         77,
         88,
         60,
         89,
         11,
         98,
         56,
         101,
         84,
         7,
         49,
         60,
         75,
         106,
         103,
         34,
         10,
         83,
         19
      };
   }
}
