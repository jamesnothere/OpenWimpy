package com.wimpyclient.p;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class j {
   private static final float CLICK_DEG = 6.0F;
   private static final float DONE_DEG = 1.2F;
   private static final int GIVE_UP_TICKS = 12;
   private boolean active;
   private float toYaw;
   private float toPitch;
   private int tick;
   private int speed;
   private static int CkCzh9t2oX;
   private transient int DpmJ9FzXrG;
   private static byte[] yhyjqjzsme = ieezdqozbcruysm();

   public j() {
super();
      int var4 = 214725081 ^ 1407868162;
      
      var4 = 164157895 ^ var4;
      var4 = 1083469049 ^ 381812703 ^ Integer.parseInt("12281402");
      this.DpmJ9FzXrG = 2028378322 ^ CkCzh9t2oX;
      var4 = 1905117309 ^ var4;
   }

   public void setSpeed(int var1) {
      int var10 = 380588792 ^ 1629700426 ^ 1166124106;
      var10 = 2111758453 ^ var10;
      byte var3 = (byte)(1339250572 ^ var10);
      byte var4 = (byte)(1339250567 ^ var10);
      int var7 = Math.min(var4, var1);
      int var6 = Math.max(var3, var7);
      this.speed = var6;
   }

   public void aimAt(LocalPlayer var1, Vec3 var2) {
      int var17 = 1916540402 ^ 764352367 ^ 1166124106;
      var17 = 751275335 ^ var17;
      float[] var9 = anglesTo(var1, var2);
      byte var6 = (byte)(922037136 ^ var17);
      float var12 = var9[var6];
      byte var7 = (byte)(922037137 ^ var17);
      float var14 = var9[var7];
      this.aimAngles(var1, var12, var14);
   }

   public void aimAngles(LocalPlayer var1, float var2, float var3) {
      int var17 = 1534828962 ^ 2048149603 ^ 1166124106;
      var17 = 612416890 ^ var17;
      this.toYaw = var2;
      float var6 = -90.0F;
      float var7 = 90.0F;
      float var12 = Mth.clamp(var3, var6, var7);
      this.toPitch = var12;
      byte var13 = (byte)(1081012465 ^ var17);
      this.tick = var13;
      byte var14 = (byte)(1081012464 ^ var17);
      this.active = (var14 != 0);
   }

   public void stop() {
      int var5 = 1446410977 ^ 705458761 ^ 1166124106;
      var5 = 1896225100 ^ var5;
      byte var2 = (byte)(1220392366 ^ var5);
      this.active = (var2 != 0);
   }

   public boolean isActive() {
      int var5 = 72046886 ^ 1162736570 ^ 1166124106;
      var5 = 1571344914 ^ var5;
      return this.active;
   }

   public boolean tick(LocalPlayer var1) {
      int var66 = 1869149502 ^ 531536516 ^ 1166124106;
      var66 = 647506332 ^ var66;
      byte var10 = (byte)((this.active) ? 1 : 0);
      if (var10 == (333439596 ^ var66)) {
         var66 = 481022038 ^ var66;
         return (((byte)(259273275 ^ var66)) != 0);
      } else {
         var66 = 301604393 ^ var66;
         int var37 = this.tick;
         byte var3 = (byte)(36043844 ^ var66);
         int var38 = var37 + var3;
         this.tick = var38;
         float var13 = 0.38F;
         int var40 = this.speed;
         float var41 = var40;
         float var58 = 0.04F;
         float var42 = var41 * var58;
         float var14 = var13 + var42;
         float var15 = 6.0F;
         int var44 = this.speed;
         float var45 = var44;
         float var59 = 0.55F;
         float var46 = var45 * var59;
         float var16 = var15 + var46;
         float var18 = var1.getYRot();
         float var48 = this.toYaw;
         float var19 = approach(var18, var48, var14, var16);
         float var21 = var1.getXRot();
         float var50 = this.toPitch;
         float var22 = approach(var21, var50, var14, var16);
         apply(var1, var19, var22);
         float var25 = this.error(var1);
         float var53 = 1.2F;
         float var77;
         int var27 = (var77 = var25 - var53) == 0.0F ? 0 : (var77 < 0.0F ? -1 : 1);
         if (var27 > (36043845 ^ var66)) {
            var66 = 1430839113 ^ var66;
            int var29 = this.tick;
            byte var54 = (byte)(1466770176 ^ var66);
            if (var29 < var54) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var66)) {
                     case 157492362:
                        var66 ^= 1527530208;
                     case 2048429136:
                        float var55 = 6.0F;
                        float var78;
                        int var31 = (var78 = var25 - var55) == 0.0F ? 0 : (var78 < 0.0F ? -1 : 1);
                        if (var31 <= (207708652 ^ var66)) {
                           var66 = 96401037 ^ var66;
                           int var33 = this.tick;
                           byte var56 = (byte)(165648224 ^ var66);
                           if (var33 >= var56) {
                              var66 = 794150245 ^ var66;
                              byte var36 = (byte)(646599173 ^ var66);
                              var66 = 940720552 ^ var66;
                              return (var36 != 0);
                           }

                           var66 = 631403787 ^ var66;
                        } else {
                           var66 = zrqibmrrvtyqtukx(var66, 538739590);
                        }

                        byte var79 = (byte)(746447466 ^ var66);
                        var66 = 853930438 ^ var66;
                        return (var79 != 0);
                     case 672533757:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1434295257:
                  }
               }
            }

            var66 = 1642164219 ^ var66;
         } else {
            var66 = 883536050 ^ var66;
         }

         byte var57 = (byte)(915164407 ^ var66);
         this.active = (var57 != 0);
         return (((byte)(915164406 ^ var66)) != 0);
      }
   }

   public float error(LocalPlayer var1) {
      int var22 = 309761691 ^ 1436124505 ^ 1166124106;
      var22 = 919068454 ^ var22;
      float var6 = this.toYaw;
      float var16 = var1.getYRot();
      float var7 = var6 - var16;
      float var8 = Mth.wrapDegrees(var7);
      float var9 = Math.abs(var8);
      float var11 = this.toPitch;
      float var18 = var1.getXRot();
      float var12 = var11 - var18;
      float var13 = Math.abs(var12);
      return Math.max(var9, var13);
   }

   public static float[] anglesTo(LocalPlayer var0, Vec3 var1) {
      int var99 = 2138479936 ^ 1333010310 ^ 1030175896;
      var99 = 658512204 ^ var99;
      float var3 = 1.0F;
      Vec3 var20 = var0.getEyePosition(var3);
      double var22 = var1.x;
      double var70 = var20.x;
      double var24 = var22 - var70;
      double var27 = var1.y;
      double var73 = var20.y;
      double var29 = var27 - var73;
      double var32 = var1.z;
      double var76 = var20.z;
      double var34 = var32 - var76;
      double var38 = var24 * var24;
      double var82 = var34 * var34;
      double var40 = var38 + var82;
      double var42 = Math.sqrt(var40);
      double var46 = -var24;
      double var48 = Math.atan2(var46, var34);
      double var50 = Math.toDegrees(var48);
      float var52 = (float)var50;
      double var86 = 1.0E-6;
      double var105;
      int var55 = (var105 = var42 - var86) == 0.0 ? 0 : (var105 < 0.0 ? -1 : 1);
      float var69;
      if (var55 >= (707110674 ^ var99)) {
         var99 = zrqibmrrvtyqtukx(var99, 890015886);
         double var58 = Math.atan2(var29, var42);
         double var60 = -var58;
         double var62 = Math.toDegrees(var60);
         var69 = (float)var62;
         var99 = 1234858362 ^ var99;
      } else {
         var99 = 130942961 ^ var99;
         double var92 = 0.0;
         double var106;
         int var68 = (var106 = var29 - var92) == 0.0 ? 0 : (var106 < 0.0 ? -1 : 1);
         if (var68 <= (770416867 ^ var99)) {
            var99 = 1704475920 ^ var99;
            var69 = 90.0F;
            var99 = zrqibmrrvtyqtukx(var99, 515955477);
         } else {
            var99 = 1320068475 ^ var99;
            var69 = -90.0F;

            label25:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                  case 5626259:
                     var99 ^= 905331582;
                     break label25;
                  case 36759356:
                  default:
                     throw new RuntimeException();
                  case 2027161646:
                     break label25;
                  case 2144739783:
               }
            }
         }
      }

      byte var64 = (byte)(1454589668 ^ var99);
      float[] var65 = new float[var64];
      byte var90 = (byte)(1454589670 ^ var99);
      var65[var90] = var52;
      byte var91 = (byte)(1454589671 ^ var99);
      float var96 = -90.0F;
      float var8 = 90.0F;
      float var95 = Mth.clamp(var69, var96, var8);
      var65[var91] = var95;
      return var65;
   }

   public static void apply(LocalPlayer var0, float var1, float var2) {
      int var9 = 1799845966 ^ 1847416044 ^ 1030175896;
      var9 = 541644589 ^ var9;
      byte var6 = (byte)(410371862 ^ var9);
      apply(var0, var1, var2, (var6 != 0));
   }

   public static void apply(LocalPlayer var0, float var1, float var2, boolean var3) {
      int var22 = 647143712 ^ 1321299730 ^ 1030175896;
      var22 = 106592183 ^ var22;
      float var5 = -90.0F;
      float var6 = 90.0F;
      float var7 = Mth.clamp(var2, var5, var6);
      var0.setYRot(var1);
      var0.setXRot(var7);
      if (var3 != ((1399751965 ^ var22) != 0)) {
         var22 = 581724854 ^ var22;
         var0.yRotO = var1;
         var0.xRotO = var7;
         var22 = 124509739 ^ var22;
      } else {
         var22 = 633844893 ^ var22;
      }

      var0.setYHeadRot(var1);
   }

   private static float approach(float var0, float var1, float var2, float var3) {
      int var47 = 1430968500 ^ 1930751604 ^ 1030175896;
      var47 = 1172944135 ^ var47;
      float var8 = var1 - var0;
      float var9 = Mth.wrapDegrees(var8);
      float var11 = Math.abs(var9);
      float var35 = 1.2F;
      float var62;
      int var12 = (var62 = var11 - var35) == 0.0F ? 0 : (var62 < 0.0F ? -1 : 1);
      if (var12 <= (1590738783 ^ var47)) {
         var47 = 1214481847 ^ var47;
         return var0 + var9;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var47)) {
               case 14466625:
                  continue;
               case 129248280:
                  var47 ^= 1743008999;
               case 187215993:
                  break;
               case 415243340:
               default:
                  throw new RuntimeException(new IOException());
            }

            float var16 = var9 * var2;
            float var7 = var16;
            float var63;
            int var18 = (var63 = var16 - var3) == 0.0F ? 0 : (var63 < 0.0F ? -1 : 1);
            if (var18 > (959744952 ^ var47)) {
               var47 = 2040171926 ^ var47;
               var7 = var3;

               label49:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var47)) {
                     case 223439703:
                        var47 ^= 1520975568;
                        break label49;
                     case 966684902:
                        break;
                     case 1140546032:
                        break label49;
                     case 1668579756:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            } else {
               var47 = zrqibmrrvtyqtukx(var47, 1444479657);
               float var64;
               int var33 = (var64 = var16 - var3) == 0.0F ? 0 : (var64 < 0.0F ? -1 : 1);
               if (var33 < (1865255185 ^ var47)) {
                  var47 = 98894673 ^ var47;
                  var7 = var3;
                  var47 = 1892594366 ^ var47;
               } else {
                  var47 = zrqibmrrvtyqtukx(var47, 1965797871);
               }
            }

            float var39 = 0.0F;
            float var65;
            int var21 = (var65 = var9 - var39) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
            if (var21 > (436615422 ^ var47)) {
               var47 = 2008443393 ^ var47;
               float var66;
               int var23 = (var66 = var7 - var9) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
               if (var23 > (1840272127 ^ var47)) {
                  var47 = 585696389 ^ var47;
                  var47 = 836089585 ^ var47;
                  return var0 + var9;
               }

               var47 = zrqibmrrvtyqtukx(var47, 1086370080);
            } else {
               var47 = 930536225 ^ var47;
            }

            float var41 = 0.0F;
            float var67;
            int var25 = (var67 = var9 - var41) == 0.0F ? 0 : (var67 < 0.0F ? -1 : 1);
            if (var25 < (762373087 ^ var47)) {
               var47 = 1904720948 ^ var47;
               float var68;
               int var27 = (var68 = var7 - var9) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
               if (var27 < (1559715819 ^ var47)) {
                  var47 = 1727900767 ^ var47;
                  var7 = var9;
                  var47 = 1149637439 ^ var47;
               } else {
                  var47 = 578535264 ^ var47;
               }
            } else {
               var47 = zrqibmrrvtyqtukx(var47, 1409024852);
            }

            return var0 + var7;
         }
      }
   }

   static {
      int var3 = new Random(-869298491097756771L).nextInt();
      CkCzh9t2oX = -2025613370 ^ var3;
   }

   public static String ypjyqmuwqj(byte[] var0, int var1) {
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
         byte[] var27 = yhyjqjzsme;
         byte[] var34 = yhyjqjzsme;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] ieezdqozbcruysm() {
      return new byte[]{
         44,
         26,
         34,
         46,
         75,
         62,
         2,
         81,
         120,
         69,
         26,
         71,
         96,
         121,
         120,
         13,
         69,
         94,
         102,
         93,
         95,
         59,
         50,
         125,
         77,
         103,
         73,
         81,
         59,
         104,
         116,
         2,
         97,
         35,
         47,
         122,
         75,
         89,
         52,
         18,
         125,
         95,
         125,
         66,
         53,
         89,
         108,
         42,
         9,
         58,
         26,
         71,
         92,
         37,
         5,
         98,
         87,
         70,
         99,
         83,
         76,
         74,
         73,
         114,
         9,
         67,
         72,
         20,
         39,
         17,
         22,
         82,
         88,
         28,
         86,
         47,
         123,
         18,
         1,
         44,
         96,
         67,
         35,
         96,
         65,
         122,
         121,
         123
      };
   }

   private static int zrqibmrrvtyqtukx(int var0, int var1) {
      return var1 ^ var0;
   }
}
