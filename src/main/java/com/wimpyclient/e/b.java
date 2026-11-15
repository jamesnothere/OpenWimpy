package com.wimpyclient.e;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;

@Environment(EnvType.CLIENT)
public final class b {
   private final BlockPos pos;
   private final int red;
   private final int green;
   private final int blue;
   private static int gxXiJlailm;
   private transient int f3ISrXd7Ltd;

   public b(BlockPos pos, int red, int green, int blue) {
super();
      int var16 = 1401502347 ^ 2131268264;
      
      var16 = 2085231169 ^ var16;
      var16 = 246994653 ^ 151840306 ^ Integer.parseInt("1467974285");
      this.f3ISrXd7Ltd = 665964379 ^ gxXiJlailm;
      var16 = 2102231825 ^ var16;
      this.pos = pos;
      this.red = red;
      this.green = green;
      this.blue = blue;
   }

   public float redF() {
      int var8 = 1634004067 ^ 1737325306 ^ 98730798;
      var8 = 2093017918 ^ var8;
      int var3 = this.red;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public float greenF() {
      int var8 = 854240339 ^ 853999539 ^ 98730798;
      var8 = 2052487922 ^ var8;
      int var3 = this.green;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public float blueF() {
      int var8 = 1353890090 ^ 750857118 ^ 98730798;
      var8 = 751501900 ^ var8;
      int var3 = this.blue;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public int argb() {
      int var23 = 1318060421 ^ 120350362 ^ 98730798;
      var23 = 367621536 ^ var23;
      int var1 = -1497919087 ^ var23;
      int var7 = this.red;
      short var3 = (short)(1505202542 ^ var23);
      int var8 = var7 & var3;
      byte var17 = (byte)(1505202561 ^ var23);
      int var9 = var8 << var17;
      int var4 = var1 | var9;
      int var11 = this.green;
      short var18 = (short)(1505202542 ^ var23);
      int var12 = var11 & var18;
      byte var19 = (byte)(1505202585 ^ var23);
      int var13 = var12 << var19;
      int var5 = var4 | var13;
      int var15 = this.blue;
      short var20 = (short)(1505202542 ^ var23);
      int var16 = var15 & var20;
      return var5 | var16;
   }

   @Override
   public final String toString() {
      int var5 = 146848136 ^ 892103554 ^ 98730798;
      var5 = 1976993625 ^ var5;
      return "b[pos=" + this.pos + ", red=" + this.red + ", green=" + this.green + ", blue=" + this.blue + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1527801464 ^ 1601113956 ^ 98730798;
      var5 = 280183782 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.pos);
      result = 31 * result + Objects.hashCode(this.red);
      result = 31 * result + Objects.hashCode(this.green);
      result = 31 * result + Objects.hashCode(this.blue);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 450432376 ^ 1211345295 ^ 98730798;
      var7 = 101833359 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      b other = (b)var1;
      return Objects.equals(this.pos, other.pos) &&
      this.red == other.red &&
      this.green == other.green &&
      this.blue == other.blue;
   }

   public BlockPos pos() {
      int var5 = 1053946747 ^ 222888332 ^ 98730798;
      var5 = 544769079 ^ var5;
      return this.pos;
   }

   public int red() {
      int var5 = 733418961 ^ 1276250045 ^ 98730798;
      var5 = 1634266237 ^ var5;
      return this.red;
   }

   public int green() {
      int var5 = 2661159 ^ 1398816672 ^ 98730798;
      var5 = 1913303723 ^ var5;
      return this.green;
   }

   public int blue() {
      int var5 = 982176252 ^ 31665517 ^ 98730798;
      var5 = 899325185 ^ var5;
      return this.blue;
   }

   static {
      int var3 = new Random(8816484579042377940L).nextInt();
      gxXiJlailm = 728458624 ^ var3;
   }

   public static String fhxggypipe(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] enjbtwtoqlouvpo() {
      return new byte[]{82, 101, 37, 17, 16, 56, 100, 57, 4, 91, 30, 10, 105};
   }
}
