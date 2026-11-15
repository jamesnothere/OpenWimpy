package com.wimpyclient.localauth;

import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class WimpyLoader$a {
   public final boolean ok;
   public final String message;
   public final long finishedAt;
   private static int Lx1YR5Yg7g;
   private transient int AtIm4ABbV4;
   private static String pszwakqxri = ByteBuffer.wrap(obkghncpqgcrxwv()).asCharBuffer().toString();

   public WimpyLoader$a(boolean ok, String message, long finishedAt) {
super();
      int var14 = 1776278511 ^ 525418172;
      
      var14 = 1778291848 ^ var14;
      var14 = 1513481956 ^ 505592773 ^ Integer.parseInt("1533488378");
      this.AtIm4ABbV4 = 170052576 ^ Lx1YR5Yg7g;
      var14 = 911001208 ^ var14;
      this.ok = ok;
      this.message = message;
      this.finishedAt = finishedAt;
   }

   @Override
   public final String toString() {
      int var5 = 18536475 ^ 257420068 ^ 644213866;
      var5 = 1509409144 ^ var5;
      return "WimpyLoader$a[ok=" + this.ok + ", message=" + this.message + ", finishedAt=" + this.finishedAt + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1294111338 ^ 2051278214 ^ 644213866;
      var5 = 971571726 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.ok);
      result = 31 * result + Objects.hashCode(this.message);
      result = 31 * result + Objects.hashCode(this.finishedAt);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 543075351 ^ 1820072320 ^ 644213866;
      var7 = 203390630 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      WimpyLoader$a other = (WimpyLoader$a)var1;
      return this.ok == other.ok &&
      Objects.equals(this.message, other.message) &&
      this.finishedAt == other.finishedAt;
   }

   public boolean ok() {
      int var5 = 1012373635 ^ 741629794 ^ 644213866;
      var5 = 293128092 ^ var5;
      return this.ok;
   }

   public String message() {
      int var5 = 1986009143 ^ 1024930212 ^ 644213866;
      var5 = 1445195263 ^ var5;
      return this.message;
   }

   public long finishedAt() {
      int var5 = 2128419784 ^ 167018540 ^ 644213866;
      var5 = 1862041331 ^ var5;
      return this.finishedAt;
   }

   static {
      int var3 = new Random(8912262071686611289L).nextInt();
      Lx1YR5Yg7g = 1976231330 ^ var3;
   }

   public static String rhvxsxfwfb(byte[] var0, int var1) {
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
      String var29 = pszwakqxri;
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

   private static byte[] obkghncpqgcrxwv() {
      return new byte[0];
   }
}
