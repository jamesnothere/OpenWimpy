package com.wimpyclient.i;

import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;

@Environment(EnvType.CLIENT)
public final class aj$b {
   private final BlockPos pos;
   private final int argb;
   private final String tag;
   private static int IrcZ5vUSxN;
   private transient int f8G9xKnrUsB;
   private static String prwceqqnar = ByteBuffer.wrap(zcxcgyrrrwbjmnf()).asCharBuffer().toString();

   public aj$b(BlockPos pos, int argb, String tag) {
super();
      int var13 = 1682877752 ^ 1399084606;
      
      var13 = bxgdfrcacruhzsrn(var13, 1493279411);
      var13 = 1295735005 ^ 11947090 ^ Integer.parseInt("598101306");
      this.f8G9xKnrUsB = 230844129 ^ IrcZ5vUSxN;
      var13 = 1008591593 ^ var13;
      this.pos = pos;
      this.argb = argb;
      this.tag = tag;
   }

   @Override
   public final String toString() {
      int var5 = 1470459207 ^ 1417662782 ^ 1689336210;
      var5 = 1004656893 ^ var5;
      return "aj$b[pos=" + this.pos + ", argb=" + this.argb + ", tag=" + this.tag + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 310033286 ^ 1044166104 ^ 1689336210;
      var5 = 240494647 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.pos);
      result = 31 * result + Objects.hashCode(this.argb);
      result = 31 * result + Objects.hashCode(this.tag);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1379337952 ^ 694162227 ^ 1689336210;
      var7 = 2094024582 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      aj$b other = (aj$b)var1;
      return Objects.equals(this.pos, other.pos) &&
      this.argb == other.argb &&
      Objects.equals(this.tag, other.tag);
   }

   public BlockPos pos() {
      int var5 = 2029255280 ^ 848589415 ^ 1689336210;
      var5 = 648256150 ^ var5;
      return this.pos;
   }

   public int argb() {
      int var5 = 966487924 ^ 607645238 ^ 1689336210;
      var5 = 601330449 ^ var5;
      return this.argb;
   }

   public String tag() {
      int var5 = 1434664869 ^ 450455199 ^ 1689336210;
      var5 = 1630979175 ^ var5;
      return this.tag;
   }

   static {
      int var3 = new Random(-8991214324736845096L).nextInt();
      IrcZ5vUSxN = -1646029259 ^ var3;
   }

   public static String rwnzgyzxzj(byte[] var0, int var1) {
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
      String var29 = prwceqqnar;
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
            Charset var91 = StandardCharsets.UTF_16BE;
            return new String(var11, var91);
         }

         byte var85 = var11[var12];
         int var93 = var8.length;
         int var92 = var12 % var93;
         byte var90 = var8[var92];
         int var86 = var85 ^ var90;
         byte var87 = (byte)var86;
         var11[var12] = var87;
         var12++;
      }
   }

   private static byte[] zcxcgyrrrwbjmnf() {
      return new byte[0];
   }

   private static int bxgdfrcacruhzsrn(int var0, int var1) {
      return var1 ^ var0;
   }
}
