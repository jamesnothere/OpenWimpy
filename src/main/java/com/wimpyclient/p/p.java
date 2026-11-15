package com.wimpyclient.p;

import com.mojang.blaze3d.platform.Window;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class p {
   private static final double REF_GUI_SCALE = 2.0;
   private static final float REF_GUI_H = 540.0F;
   private static int FrUrGda1JE;
   private transient int f8RolQNOn3r;
   private static byte[] ysjhfxpdhx = iqowzrtuwgjpdsa();

   private p() {
super();
      int var4 = 1372544264 ^ 1810941887;
      
      var4 = veqmgikmxphmnshd(var4, 698296695);
      var4 = 98183717 ^ 1552610906 ^ Integer.parseInt("1257271231");
      this.f8RolQNOn3r = 1595920007 ^ FrUrGda1JE;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 101142500:
               var4 = 822556187 ^ var4;
            case 1910118590:
               return;
            case 869915110:
               break;
            case 1568023715:
            default:
               throw new IllegalStateException();
         }
      }
   }

   public static float hud(Minecraft var0) {
      int var45 = 43922253 ^ 1749412281 ^ 508332997;
      var45 = 1364041130 ^ var45;
      if (var0 != null) {
         var45 = 344227092 ^ var45;
         Window var10 = var0.getWindow();
         if (var10 != null) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var45)) {
                  case 262621531:
                     var45 ^= 170897771;
                  case 242193820:
                     byte var12 = (byte)(997261541 ^ var45);
                     Window var29 = var0.getWindow();
                     int var30 = var29.getGuiScaledHeight();
                     int var13 = Math.max(var12, var30);
                     byte var14 = (byte)(997261541 ^ var45);
                     Window var32 = var0.getWindow();
                     int var33 = var32.getGuiScale();
                     int var15 = Math.max(var14, var33);
                     double var16 = 2.0;
                     double var39 = var15;
                     double var18 = var16 / var39;
                     float var20 = (float)var18;
                     float var22 = var13;
                     float var34 = 540.0F;
                     float var23 = var22 / var34;
                     float var35 = 0.65F;
                     float var25 = var20 * var35;
                     float var41 = 0.35F;
                     float var37 = var23 * var41;
                     float var26 = var25 + var37;
                     float var38 = 0.45F;
                     float var42 = 1.35F;
                     return Mth.clamp(var26, var38, var42);
                  case 789954931:
                  default:
                     throw new IllegalStateException();
                  case 1096408566:
               }
            }
         }

         var45 = 1358307281 ^ var45;
      } else {
         var45 = veqmgikmxphmnshd(var45, 1148347077);
      }

      return 1.0F;
   }

   public static int px(Minecraft var0, int var1) {
      int var12 = 1662634795 ^ 1315788265 ^ 508332997;
      var12 = 370891413 ^ var12;
      byte var2 = (byte)(623071123 ^ var12);
      float var6 = var1;
      float var9 = hud(var0);
      float var7 = var6 * var9;
      int var8 = Math.round(var7);
      return Math.max(var2, var8);
   }

   public static int px(float var0, int var1) {
      int var11 = 367927182 ^ 651248605 ^ 508332997;
      var11 = 1073503922 ^ var11;
      byte var2 = (byte)(311396645 ^ var11);
      float var6 = var1;
      float var7 = var6 * var0;
      int var8 = Math.round(var7);
      return Math.max(var2, var8);
   }

   static {
      int var3 = new Random(4019960652334173053L).nextInt();
      FrUrGda1JE = -2138851381 ^ var3;
   }

   public static String riihvqgchk(byte[] var0, int var1) {
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
         byte[] var27 = ysjhfxpdhx;
         byte[] var34 = ysjhfxpdhx;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] iqowzrtuwgjpdsa() {
      return new byte[]{
         49,
         72,
         113,
         85,
         99,
         61,
         74,
         80,
         47,
         10,
         119,
         104,
         68,
         87,
         92,
         77,
         63,
         92,
         112,
         106,
         58,
         74,
         105,
         65,
         7,
         99,
         14,
         48,
         89,
         57,
         100,
         68,
         96,
         110,
         106,
         48,
         3,
         30,
         1,
         68,
         20,
         84,
         33,
         106,
         13,
         121,
         125,
         25,
         52,
         65,
         75,
         108,
         10,
         88,
         123,
         68,
         122,
         11,
         72,
         35,
         59,
         122,
         117,
         30,
         59,
         103,
         86,
         124,
         8,
         73,
         52,
         99,
         64,
         108,
         117,
         98,
         36,
         6,
         9,
         79,
         72,
         81,
         95,
         87,
         76,
         93,
         13,
         126,
         32,
         7,
         127,
         72,
         76,
         115,
         13,
         67,
         127,
         116,
         120,
         75,
         94,
         65,
         64,
         24,
         96,
         51,
         39,
         8,
         26,
         50,
         67,
         23,
         14,
         91,
         115,
         112,
         113,
         36,
         19,
         97,
         111,
         123,
         31,
         81
      };
   }

   private static int veqmgikmxphmnshd(int var0, int var1) {
      return var1 ^ var0;
   }
}
