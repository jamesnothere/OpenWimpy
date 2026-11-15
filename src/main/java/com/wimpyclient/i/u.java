package com.wimpyclient.i;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class u {
   public boolean tracers;
   public int red;
   public int green;
   public int blue;
   private static int LZthRH4fJs;
   private transient int MOxLxbIm4c;
   private static byte[] pqfozpbknp = jwqmbadbzcjmvff();

   public u(boolean var1, int var2, int var3, int var4) {
super();
      int var16 = 2130623935 ^ 710934985;
      

      label25:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
            case 66312634:
               var16 = 860693850 ^ var16;
            case 1085546700:
               var16 = 880658913 ^ 1353275224 ^ Integer.parseInt("50792341");
               this.MOxLxbIm4c = 686079546 ^ LZthRH4fJs;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
                     case 153722646:
                        var16 = 923793423 ^ var16;
                     case 252508413:
                        break label25;
                     case 366170688:
                        break;
                     case 1687654066:
                     default:
                        throw new IllegalStateException();
                  }
               }
            case 1415139731:
               break;
            case 1466995507:
            default:
               throw new IllegalStateException();
         }
      }

      this.tracers = var1;
      this.red = var2;
      this.green = var3;
      this.blue = var4;
   }

   public float redF() {
      int var8 = 649567956 ^ 2066464119 ^ 934303531;
      var8 = 330427525 ^ var8;
      int var3 = this.red;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public float greenF() {
      int var8 = 696640152 ^ 8055059 ^ 934303531;
      var8 = 558963430 ^ var8;
      int var3 = this.green;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public float blueF() {
      int var8 = 1831491671 ^ 2140458120 ^ 934303531;
      var8 = 200022284 ^ var8;
      int var3 = this.blue;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public int argb() {
      int var23 = 1834527370 ^ 478078979 ^ 934303531;
      var23 = 339711410 ^ var23;
      int var1 = -1381400560 ^ var23;
      int var7 = this.red;
      short var3 = (short)(1386840303 ^ var23);
      int var8 = var7 & var3;
      byte var17 = (byte)(1386840064 ^ var23);
      int var9 = var8 << var17;
      int var4 = var1 | var9;
      int var11 = this.green;
      short var18 = (short)(1386840303 ^ var23);
      int var12 = var11 & var18;
      byte var19 = (byte)(1386840088 ^ var23);
      int var13 = var12 << var19;
      int var5 = var4 | var13;
      int var15 = this.blue;
      short var20 = (short)(1386840303 ^ var23);
      int var16 = var15 & var20;
      return var5 | var16;
   }

   static {
      int var3 = new Random(1222589024647107534L).nextInt();
      LZthRH4fJs = 1170959749 ^ var3;
   }

   public static String ghdetnjrew(byte[] var0, int var1) {
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
         byte[] var27 = pqfozpbknp;
         byte[] var34 = pqfozpbknp;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] jwqmbadbzcjmvff() {
      return new byte[]{121, 66, 94, 24, 39, 25, 117, 7, 70, 95, 40, 69, 86, 114, 47, 45, 31, 19, 73, 111, 46, 88, 87, 24, 108, 39};
   }
}
