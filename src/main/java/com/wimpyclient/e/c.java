package com.wimpyclient.e;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.phys.AABB;

@Environment(EnvType.CLIENT)
public final class c {
   private final AABB box;
   private final int red;
   private final int green;
   private final int blue;
   private static int f2VX2OdqPn9;
   private transient int Q94lGKzYFb;
   private static byte[] qfnoteyora = uvanoozjoctmxfd();

   public c(AABB box, int red, int green, int blue) {
super();
      int var16 = 511220803 ^ 1701579185;
      
      var16 = sssmeanbqqrxsegk(var16, 1200151756);
      var16 = 204664419 ^ 1565070173 ^ Integer.parseInt("1843901440");
      this.Q94lGKzYFb = 801390115 ^ f2VX2OdqPn9;
      var16 = sssmeanbqqrxsegk(var16, 1712253058);
      this.box = box;
      this.red = red;
      this.green = green;
      this.blue = blue;
   }

   public float redF() {
      int var8 = 1684680939 ^ 1796649068 ^ 23533557;
      var8 = 1557588247 ^ var8;
      int var3 = this.red;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public float greenF() {
      int var8 = 638337680 ^ 58847971 ^ 23533557;
      var8 = 662821102 ^ var8;
      int var3 = this.green;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public float blueF() {
      int var8 = 1997266729 ^ 192543109 ^ 23533557;
      var8 = 1462097693 ^ var8;
      int var3 = this.blue;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public int argb() {
      int var23 = 1542542396 ^ 971272546 ^ 23533557;
      var23 = 1308865894 ^ var23;
      int var1 = -764311603 ^ var23;
      int var7 = this.red;
      short var3 = (short)(762414898 ^ var23);
      int var8 = var7 & var3;
      byte var17 = (byte)(762415069 ^ var23);
      int var9 = var8 << var17;
      int var4 = var1 | var9;
      int var11 = this.green;
      short var18 = (short)(762414898 ^ var23);
      int var12 = var11 & var18;
      byte var19 = (byte)(762415045 ^ var23);
      int var13 = var12 << var19;
      int var5 = var4 | var13;
      int var15 = this.blue;
      short var20 = (short)(762414898 ^ var23);
      int var16 = var15 & var20;
      return var5 | var16;
   }

   @Override
   public final String toString() {
      int var5 = 674474563 ^ 833224537 ^ 23533557;
      var5 = 1103880334 ^ var5;
      return "c[box=" + this.box + ", red=" + this.red + ", green=" + this.green + ", blue=" + this.blue + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1973843099 ^ 1542101951 ^ 23533557;
      var5 = 1053277198 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.box);
      result = 31 * result + Objects.hashCode(this.red);
      result = 31 * result + Objects.hashCode(this.green);
      result = 31 * result + Objects.hashCode(this.blue);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 700148882 ^ 1287011668 ^ 23533557;
      var7 = 1103714557 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      c other = (c)var1;
      return Objects.equals(this.box, other.box) &&
      this.red == other.red &&
      this.green == other.green &&
      this.blue == other.blue;
   }

   public AABB box() {
      int var5 = 1437493601 ^ 2101302339 ^ 23533557;
      var5 = 1808644643 ^ var5;
      return this.box;
   }

   public int red() {
      int var5 = 1397697555 ^ 1763674211 ^ 23533557;
      var5 = 2099251863 ^ var5;
      return this.red;
   }

   public int green() {
      int var5 = 2125117333 ^ 749538326 ^ 23533557;
      var5 = 194321632 ^ var5;
      return this.green;
   }

   public int blue() {
      int var5 = 56293691 ^ 1760470390 ^ 23533557;
      var5 = 744611831 ^ var5;
      return this.blue;
   }

   static {
      int var3 = new Random(103172926622306636L).nextInt();
      f2VX2OdqPn9 = -1109096470 ^ var3;
   }

   public static String tdignpvqns(byte[] var0, int var1) {
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
         byte[] var28 = qfnoteyora;
         byte[] var34 = qfnoteyora;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] uvanoozjoctmxfd() {
      return new byte[]{
         106,
         109,
         63,
         8,
         55,
         100,
         47,
         66,
         13,
         82,
         20,
         113,
         72,
         59,
         81,
         102,
         2,
         60,
         3,
         97,
         40,
         29,
         55,
         81,
         83,
         95,
         4,
         18,
         96,
         116,
         57,
         101,
         92,
         26,
         45,
         4,
         84,
         111,
         45,
         36,
         14,
         52,
         37,
         102,
         77,
         30,
         39,
         63,
         5,
         108,
         109,
         34,
         87,
         79,
         41,
         31,
         122,
         87,
         41,
         22,
         5,
         113,
         111,
         75,
         35,
         98,
         98,
         23,
         36,
         36,
         10,
         54,
         10,
         126,
         20,
         78,
         70,
         51,
         72,
         71,
         122,
         79,
         58,
         44,
         11,
         85,
         52,
         118,
         80,
         85,
         23,
         119,
         57,
         13,
         64,
         123,
         123,
         96,
         42,
         99,
         110,
         3,
         109,
         116,
         1,
         125,
         42,
         76,
         71
      };
   }

   private static int sssmeanbqqrxsegk(int var0, int var1) {
      return var1 ^ var0;
   }
}
