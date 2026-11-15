package com.wimpyclient.s;

import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class b$c {
   private final byte kind;
   private final long owner;
   private final b$d unfinished;
   private final long[] cells;
   private final long[] judged;
   private final long[] shell;
   private final byte[] shellFlags;
   private static int w4F9D3m490;
   private transient int eux2iOX0Hd;
   private static String gpbmrrjtic = ByteBuffer.wrap(lgggbzimarsyddo()).asCharBuffer().toString();

   public b$c(byte kind, long owner, b$d unfinished, long[] cells, long[] judged, long[] shell, byte[] shellFlags) {
super();
      int var27 = 1709875897 ^ 734621870;
      
      var27 = 1237593144 ^ var27;
      var27 = 286951667 ^ 1903267261 ^ Integer.parseInt("1737292641");
      this.eux2iOX0Hd = 181519201 ^ w4F9D3m490;
      var27 = 881715644 ^ var27;
      this.kind = kind;
      this.owner = owner;
      this.unfinished = unfinished;
      this.cells = cells;
      this.judged = judged;
      this.shell = shell;
      this.shellFlags = shellFlags;
   }

   @Override
   public final String toString() {
      int var5 = 1730094524 ^ 396242277 ^ 659604937;
      var5 = 868840345 ^ var5;
      return "b$c[kind=" + this.kind + ", owner=" + this.owner + ", unfinished=" + this.unfinished + ", cells=" + this.cells + ", judged=" + this.judged + ", shell=" + this.shell + ", shellFlags=" + this.shellFlags + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1429060450 ^ 2111654275 ^ 659604937;
      var5 = 159972114 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.kind);
      result = 31 * result + Objects.hashCode(this.owner);
      result = 31 * result + Objects.hashCode(this.unfinished);
      result = 31 * result + Objects.hashCode(this.cells);
      result = 31 * result + Objects.hashCode(this.judged);
      result = 31 * result + Objects.hashCode(this.shell);
      result = 31 * result + Objects.hashCode(this.shellFlags);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 320495877 ^ 1786900328 ^ 659604937;
      var7 = 1504628318 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      b$c other = (b$c)var1;
      return this.kind == other.kind &&
      this.owner == other.owner &&
      Objects.equals(this.unfinished, other.unfinished) &&
      Objects.equals(this.cells, other.cells) &&
      Objects.equals(this.judged, other.judged) &&
      Objects.equals(this.shell, other.shell) &&
      Objects.equals(this.shellFlags, other.shellFlags);
   }

   public byte kind() {
      int var5 = 420931877 ^ 1112472842 ^ 659604937;
      var5 = 1783954009 ^ var5;
      return this.kind;
   }

   public long owner() {
      int var5 = 878720504 ^ 1580522200 ^ 659604937;
      var5 = 1425092018 ^ var5;
      return this.owner;
   }

   public b$d unfinished() {
      int var5 = 2036273013 ^ 601555687 ^ 659604937;
      var5 = 1734814344 ^ var5;
      return this.unfinished;
   }

   public long[] cells() {
      int var5 = 1398312678 ^ 24446389 ^ 659604937;
      var5 = 1836613330 ^ var5;
      return this.cells;
   }

   public long[] judged() {
      int var5 = 1777697930 ^ 2010670873 ^ 659604937;
      var5 = 1574666612 ^ var5;
      return this.judged;
   }

   public long[] shell() {
      int var5 = 1690774926 ^ 1891990585 ^ 659604937;
      var5 = 1421592076 ^ var5;
      return this.shell;
   }

   public byte[] shellFlags() {
      int var5 = 1666305432 ^ 2064948973 ^ 659604937;
      var5 = 931850158 ^ var5;
      return this.shellFlags;
   }

   static {
      int var3 = new Random(-6238171657505360163L).nextInt();
      w4F9D3m490 = -605411453 ^ var3;
   }

   public static String zzkwdspcmc(byte[] var0, int var1) {
      String var13 = Integer.toString(var1);
      byte[] var14 = var13.getBytes();
      byte[] var8 = var14;
      byte var3 = 0;
      byte var16 = var0[var3];
      short var36 = 255;
      int var17 = var16 & var36;
      byte var37 = 24;
      int var18 = var17 << var37;
      byte var4 = 1;
      byte var39 = var0[var4];
      short var68 = 255;
      int var40 = var39 & var68;
      byte var69 = 16;
      int var41 = var40 << var69;
      int var19 = var18 | var41;
      byte var70 = 2;
      byte var43 = var0[var70];
      short var71 = 255;
      int var44 = var43 & var71;
      byte var72 = 8;
      int var45 = var44 << var72;
      int var20 = var19 | var45;
      byte var73 = 3;
      byte var47 = var0[var73];
      short var74 = 255;
      int var48 = var47 & var74;
      int var21 = var20 | var48;
      byte var49 = 4;
      byte var23 = var0[var49];
      short var50 = 255;
      int var24 = var23 & var50;
      byte var51 = 24;
      int var25 = var24 << var51;
      byte var75 = 5;
      byte var53 = var0[var75];
      short var76 = 255;
      int var54 = var53 & var76;
      byte var77 = 16;
      int var55 = var54 << var77;
      int var26 = var25 | var55;
      byte var78 = 6;
      byte var57 = var0[var78];
      short var79 = 255;
      int var58 = var57 & var79;
      byte var80 = 8;
      int var59 = var58 << var80;
      int var27 = var26 | var59;
      byte var81 = 7;
      byte var61 = var0[var81];
      short var82 = 255;
      int var62 = var61 & var82;
      int var28 = var27 | var62;
      String var29 = gpbmrrjtic;
      int var84 = var28 + var21;
      String var30 = var29.substring(var28, var84);
      Charset var64 = StandardCharsets.UTF_16BE;
      byte[] var31 = var30.getBytes(var64);
      byte[] var11 = var31;
      byte var32 = 0;
      int var12 = var32;

      while (true) {
         int var66 = var11.length;
         if (var12 >= var66) {
            Charset var89 = StandardCharsets.UTF_16BE;
            return new String(var11, var89);
         }

         byte var86 = var11[var12];
         int var93 = var8.length;
         int var92 = var12 % var93;
         byte var91 = var8[var92];
         int var87 = var86 ^ var91;
         byte var88 = (byte)var87;
         var11[var12] = var88;
         var12++;
      }
   }

   private static byte[] lgggbzimarsyddo() {
      return new byte[0];
   }
}
