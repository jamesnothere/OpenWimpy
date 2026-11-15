package com.wimpyclient.i;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class aj$d {
   private final BlockPos pos;
   private final BlockState state;
   private final int red;
   private final int green;
   private final int blue;
   private final float alpha;
   private final boolean wrong;
   private static int fYP3FBKRdX;
   private transient int f0G7Bl63xjj;
   private static byte[] gkiilldvjr = mxezhlqhuzzoxzl();

   public aj$d(BlockPos pos, BlockState state, int red, int green, int blue, float alpha, boolean wrong) {
super();
      int var25 = 1770306738 ^ 1447254163;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
            case 170729299:
               break;
            case 194213432:
               var25 = 771575116 ^ var25;
            case 1641111718:
               var25 = 119898271 ^ 267869890 ^ Integer.parseInt("451442480");
               this.f0G7Bl63xjj = 297615567 ^ fYP3FBKRdX;
               var25 = nyaeimcxtxymrkqv(var25, 470608097);
               this.pos = pos;
               this.state = state;
               this.red = red;
               this.green = green;
               this.blue = blue;
               this.alpha = alpha;
               this.wrong = wrong;
               return;
            case 2042197620:
            default:
               throw new IllegalStateException();
         }
      }
   }

   public float redF() {
      int var8 = 1488558802 ^ 980840401 ^ 1478539260;
      var8 = 157543013 ^ var8;
      int var3 = this.red;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public float greenF() {
      int var8 = 1420204273 ^ 1241873489 ^ 1478539260;
      var8 = 1857508697 ^ var8;
      int var3 = this.green;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public float blueF() {
      int var8 = 1172264055 ^ 1607323705 ^ 1478539260;
      var8 = 999155980 ^ var8;
      int var3 = this.blue;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   @Override
   public final String toString() {
      int var5 = 2067710876 ^ 1760452432 ^ 1478539260;
      var5 = 1751119710 ^ var5;
      return "aj$d[pos=" + this.pos + ", state=" + this.state + ", red=" + this.red + ", green=" + this.green + ", blue=" + this.blue + ", alpha=" + this.alpha + ", wrong=" + this.wrong + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 80269821 ^ 44907446 ^ 1478539260;
      var5 = 312487211 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.pos);
      result = 31 * result + Objects.hashCode(this.state);
      result = 31 * result + Objects.hashCode(this.red);
      result = 31 * result + Objects.hashCode(this.green);
      result = 31 * result + Objects.hashCode(this.blue);
      result = 31 * result + Objects.hashCode(this.alpha);
      result = 31 * result + Objects.hashCode(this.wrong);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1539977687 ^ 368155997 ^ 1478539260;
      var7 = 295950519 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      aj$d other = (aj$d)var1;
      return Objects.equals(this.pos, other.pos) &&
      Objects.equals(this.state, other.state) &&
      this.red == other.red &&
      this.green == other.green &&
      this.blue == other.blue &&
      Float.compare(this.alpha, other.alpha) == 0 &&
      this.wrong == other.wrong;
   }

   public BlockPos pos() {
      int var5 = 652026008 ^ 1183872909 ^ 1478539260;
      var5 = 899458189 ^ var5;
      return this.pos;
   }

   public BlockState state() {
      int var5 = 1646294 ^ 1519316465 ^ 1478539260;
      var5 = 35001443 ^ var5;
      return this.state;
   }

   public int red() {
      int var5 = 248326518 ^ 463659619 ^ 1478539260;
      var5 = 183948353 ^ var5;
      return this.red;
   }

   public int green() {
      int var5 = 1333512295 ^ 1062454568 ^ 1478539260;
      var5 = 901914260 ^ var5;
      return this.green;
   }

   public int blue() {
      int var5 = 1808386093 ^ 1803186682 ^ 1478539260;
      var5 = 909248631 ^ var5;
      return this.blue;
   }

   public float alpha() {
      int var5 = 702793711 ^ 1444359488 ^ 1478539260;
      var5 = 433174493 ^ var5;
      return this.alpha;
   }

   public boolean wrong() {
      int var5 = 569883138 ^ 1760478659 ^ 1478539260;
      var5 = 57920114 ^ var5;
      return this.wrong;
   }

   static {
      int var3 = new Random(5874270299532013018L).nextInt();
      fYP3FBKRdX = -696498346 ^ var3;
   }

   public static String irqmnyeptx(byte[] var0, int var1) {
      String var8 = Integer.toString(var1);
      byte[] var9 = var8.getBytes();
      byte[] var6 = var9;
      byte var10 = 0;
      int var7 = var10;

      while (true) {
         int var15 = var0.length;
         if (var7 >= var15) {
            Charset var29 = StandardCharsets.UTF_16;
            return new String(var0, var29);
         }

         byte var18 = var0[var7];
         int var33 = var6.length;
         int var30 = var7 % var33;
         byte var26 = var6[var30];
         int var19 = var18 ^ var26;
         byte var20 = (byte)var19;
         var0[var7] = var20;
         byte var21 = var0[var7];
         byte[] var27 = gkiilldvjr;
         byte[] var34 = gkiilldvjr;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] mxezhlqhuzzoxzl() {
      return new byte[]{99, 69, 116, 52, 13, 6, 36, 9, 37, 21, 108, 67, 89, 99, 112, 52, 39, 101, 56, 36, 102, 49, 25, 111, 123, 123, 98, 103};
   }

   private static int nyaeimcxtxymrkqv(int var0, int var1) {
      return var0 ^ var1;
   }
}
