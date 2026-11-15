package com.wimpyclient.p;

import com.wimpyclient.mixin.aj;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.protocol.game.ServerboundInteractPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class h {
   private static int FhlQhpO4ma;
   private transient int Ub23zKu9g2;

   private h() {
super();
      int var4 = 1289068658 ^ 1224235511;
      
      var4 = 1751973292 ^ var4;
      var4 = 2050727372 ^ 1394505452 ^ Integer.parseInt("1164242697");
      this.Ub23zKu9g2 = 309243031 ^ FhlQhpO4ma;
      var4 = 1869308329 ^ var4;
   }

   public static boolean attackNoPrediction(Minecraft var0, LocalPlayer var1, Entity var2) {
      int var34 = 470186333 ^ 824122220 ^ 1937561002;
      var34 = 239630523 ^ var34;
      if (var0 == null) {
         var34 = 1675337664 ^ var34;
      } else {
         var34 = 536864580 ^ var34;
         if (var1 == null) {
            var34 = tavkhsuavcnpejwt(var34, 2082764932);
         } else {
            var34 = 827060944 ^ var34;
            if (var2 != null) {
               var34 = 100273748 ^ var34;
               byte var11 = (byte)((var2.isAlive()) ? 1 : 0);
               if (var11 != (2070140128 ^ var34)) {
                  var34 = tavkhsuavcnpejwt(var34, 2122164919);
                  MultiPlayerGameMode var14 = var0.gameMode;
                  byte var16 = (byte)((var14 instanceof aj) ? 1 : 0);
                  if (var16 != (85884503 ^ var34)) {
                     var34 = 1635681618 ^ var34;
                     aj var18 = (aj)var14;
                     var18.wimpyclient$syncCarriedItem();
                     var34 = 500807823 ^ var34;
                  } else {
                     var34 = 2091335133 ^ var34;
                  }

                  ClientPacketListener var21 = var0.getConnection();
                  if (var21 == null) {
                     var34 = 400839685 ^ var34;
                     return (((byte)(1851594639 ^ var34)) != 0);
                  }

                  var34 = 1470435820 ^ var34;
                  boolean var30 = var1.isShiftKeyDown();
                  ServerboundInteractPacket var28 = ServerboundInteractPacket.createAttackPacket(var2, var30);
                  var21.send(var28);
                  var1.resetAttackStrengthTicker();
                  InteractionHand var29 = InteractionHand.MAIN_HAND;
                  var1.swing(var29);
                  return (((byte)(773608039 ^ var34)) != 0);
               }

               var34 = 1217758208 ^ var34;
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
                     case 88762661:
                        var34 ^= 1299155540;
                        return (((byte)(871780576 ^ var34)) != 0);
                     case 376493358:
                        break;
                     case 1378697457:
                     default:
                        throw new IllegalStateException();
                     case 1665858681:
                        return (((byte)(871780576 ^ var34)) != 0);
                  }
               }
            }
         }
      }

      return (((byte)(871780576 ^ var34)) != 0);
   }

   static {
      int var3 = new Random(-4798907757739306127L).nextInt();
      FhlQhpO4ma = -241336354 ^ var3;
   }

   public static String fdrrekdopp(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] yvdcfbpzbbtyltq() {
      return new byte[]{
         77,
         72,
         9,
         107,
         55,
         2,
         34,
         28,
         109,
         17,
         9,
         124,
         88,
         33,
         81,
         111,
         64,
         26,
         74,
         23,
         16,
         65,
         36,
         9,
         126,
         39,
         32,
         99,
         15,
         49,
         19,
         115,
         7,
         54,
         68,
         110,
         5,
         21,
         78,
         64,
         53
      };
   }

   private static int tavkhsuavcnpejwt(int var0, int var1) {
      return var0 ^ var1;
   }
}
