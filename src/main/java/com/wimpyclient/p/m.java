package com.wimpyclient.p;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class m {
   private static final float YAW_BLEND = 0.07F;
   private static final float PITCH_BLEND = 0.05F;
   private static final float MAX_YAW_STEP = 2.2F;
   private static final float MAX_PITCH_STEP = 1.4F;
   private static int f299JXQocFx;
   private transient int qUppSjgJW8;
   private static String plgsumybse = ByteBuffer.wrap(jtyyuiaupprqvvm()).asCharBuffer().toString();

   private m() {
super();
      int var4 = 2142318522 ^ 2136750228;
      
      var4 = 1160736387 ^ var4;
      var4 = 1404624968 ^ 430169048 ^ Integer.parseInt("265896509");
      this.qUppSjgJW8 = 607004863 ^ f299JXQocFx;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 120098429:
               var4 = 263557885 ^ var4;
            case 2058137867:
               return;
            case 1017779950:
            default:
               throw new RuntimeException(new IOException());
            case 1477334174:
         }
      }
   }

   public static void tick(Minecraft var0) {
      int var80 = 1152358748 ^ 1702814195 ^ 1868547973;
      var80 = 934820127 ^ var80;
      LocalPlayer var11 = var0.player;
      if (var11 != null) {
         var80 = 63426680 ^ var80;
         ClientLevel var13 = var0.level;
         if (var13 == null) {
            var80 = ssfyasgxufyabfdd(var80, 887820997);
         } else {
            var80 = 578047353 ^ var80;
            Screen var15 = var0.screen;
            if (var15 != null) {
               var80 = 379543484 ^ var80;
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                     case 193051697:
                        var80 ^= 1385616849;
                     case 380992832:
                        byte var16 = (byte)((b.isAvailable()) ? 1 : 0);
                        if (var16 == (169070309 ^ var80)) {
                           var80 = 2063968703 ^ var80;
                           return;
                        }

                        var80 = 1606401875 ^ var80;
                        byte var17 = (byte)((b.isPathing()) ? 1 : 0);
                        if (var17 == (1437364662 ^ var80)) {
                           var80 = 616175340 ^ var80;
                           return;
                        }

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                              case 100551164:
                                 var80 ^= 1044255767;
                              case 1655560901:
                                 byte var18 = (byte)((o.isActive()) ? 1 : 0);
                                 if (var18 != (1804756385 ^ var80)) {
                                    var80 = 1657099918 ^ var80;
                                    return;
                                 }

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                                       case 7065461:
                                          var80 ^= 1031102050;
                                       case 1557194890:
                                          byte var19 = (byte)((b.isForcingLeftClick()) ? 1 : 0);
                                          if (var19 != (1457994691 ^ var80)) {
                                             var80 = ssfyasgxufyabfdd(var80, 1001802211);
                                             return;
                                          }

                                          var80 = 913375147 ^ var80;
                                          MultiPlayerGameMode var21 = var0.gameMode;
                                          if (var21 != null) {
                                             var80 = 47279902 ^ var80;
                                             MultiPlayerGameMode var23 = var0.gameMode;
                                             byte var24 = (byte)((var23.isDestroying()) ? 1 : 0);
                                             if (var24 != (1648798582 ^ var80)) {
                                                var80 = 253221206 ^ var80;
                                                return;
                                             }

                                             var80 = 215032037 ^ var80;
                                          } else {
                                             var80 = 234901499 ^ var80;
                                          }

                                          b.ensureHumanSettings();
                                          LocalPlayer var26 = var0.player;
                                          float[] var27 = b.getEffectiveLook();
                                          float var7;
                                          float var8;
                                          if (var27 != null) {
                                             var80 = 480914837 ^ var80;
                                             byte var2 = (byte)(1916642822 ^ var80);
                                             float var30 = var27[var2];
                                             var7 = var30;
                                             byte var54 = (byte)(1916642823 ^ var80);
                                             float var32 = var27[var54];
                                             var8 = var32;

                                             label72:
                                             while (true) {
                                                switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                                                   case 223806358:
                                                      var80 = 676155641 ^ var80;
                                                   case 263362145:
                                                      break label72;
                                                   case 327203688:
                                                   default:
                                                      throw new RuntimeException();
                                                   case 1043705432:
                                                }
                                             }
                                          } else {
                                             label65:
                                             while (true) {
                                                switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                                                   case 105246971:
                                                      var80 ^= 404793504;
                                                      break label65;
                                                   case 373098156:
                                                   default:
                                                      throw new RuntimeException();
                                                   case 438477754:
                                                      break label65;
                                                   case 1375976171:
                                                }
                                             }

                                             Vec3 var36 = var26.getDeltaMovement();
                                             double var38 = var36.horizontalDistanceSqr();
                                             double var67 = 1.0E-5;
                                             double var101;
                                             int var40 = (var101 = var38 - var67) == 0.0 ? 0 : (var101 < 0.0 ? -1 : 1);
                                             if (var40 < (1991713587 ^ var80)) {
                                                var80 = 1892297839 ^ var80;
                                                return;
                                             }

                                             var80 = 447584317 ^ var80;
                                             double var42 = var36.z;
                                             double var70 = var36.x;
                                             double var44 = Mth.atan2(var42, var70);
                                             double var72 = 180.0 / Math.PI;
                                             double var46 = var44 * var72;
                                             float var48 = (float)var46;
                                             float var62 = 90.0F;
                                             float var49 = var48 - var62;
                                             var7 = var49;
                                             float var51 = var26.getXRot();
                                             float var63 = 0.92F;
                                             float var52 = var51 * var63;
                                             float var64 = -15.0F;
                                             float var74 = 12.0F;
                                             float var53 = Mth.clamp(var52, var64, var74);
                                             var8 = var53;
                                             var80 = 912936433 ^ var80;
                                          }

                                          float var56 = var26.getYRot();
                                          float var4 = 0.07F;
                                          float var5 = 2.2F;
                                          float var57 = approachAngle(var56, var7, var4, var5);
                                          var26.setYRot(var57);
                                          float var59 = var26.getXRot();
                                          float var75 = 0.05F;
                                          float var77 = 1.4F;
                                          float var60 = approachAngle(var59, var8, var75, var77);
                                          float var66 = -90.0F;
                                          float var76 = 90.0F;
                                          float var61 = Mth.clamp(var60, var66, var76);
                                          var26.setXRot(var61);
                                          return;
                                       case 946331396:
                                          break;
                                       case 1227072913:
                                       default:
                                          throw new RuntimeException();
                                    }
                                 }
                              case 1428150192:
                                 break;
                              case 2112308420:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     case 922601166:
                     default:
                        throw new RuntimeException();
                     case 2084729507:
                  }
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
               case 154766496:
                  break;
               case 161771061:
               default:
                  throw new RuntimeException();
               case 182050096:
                  var80 = 925680317 ^ var80;
                  return;
               case 1038223694:
                  return;
            }
         }
      }
   }

   private static float approachAngle(float var0, float var1, float var2, float var3) {
      int var33 = 567984676 ^ 243472403 ^ 1868547973;
      var33 = 1583800415 ^ var33;
      float var8 = var1 - var0;
      float var9 = Mth.wrapDegrees(var8);
      float var11 = Math.abs(var9);
      float var25 = 0.02F;
      float var42;
      int var12 = (var42 = var11 - var25) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1);
      if (var12 < (509672941 ^ var33)) {
         var33 = 1705827117 ^ var33;
         return var0 + var9;
      } else {
         var33 = 508813207 ^ var33;
         float var14 = var9 * var2;
         float var43;
         int var16 = (var43 = var14 - var3) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
         if (var16 > (3351162 ^ var33)) {
            var33 = 108912796 ^ var33;
            var33 = 1787886964 ^ var33;
            return var0 + var3;
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                  case 3141729:
                     var33 ^= 1823320400;
                  case 309776834:
                     float var44;
                     int var21 = (var44 = var14 - var3) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
                     if (var21 < (1822329642 ^ var33)) {
                        var33 = 2045765756 ^ var33;
                        var33 = 2041535684 ^ var33;
                        return var0 + var3;
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                           case 41107775:
                              var33 = 4240568 ^ var33;
                              return var0 + var14;
                           case 651892637:
                              return var0 + var14;
                           case 966402496:
                              break;
                           case 1149942101:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  case 850331998:
                     break;
                  case 2075920020:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      }
   }

   static {
      int var3 = new Random(370508996980036365L).nextInt();
      f299JXQocFx = -1387828057 ^ var3;
   }

   public static String ocjsixrnep(byte[] var0, int var1) {
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
      String var29 = plgsumybse;
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

   private static byte[] jtyyuiaupprqvvm() {
      return new byte[0];
   }

   private static int ssfyasgxufyabfdd(int var0, int var1) {
      return var0 ^ var1;
   }
}
