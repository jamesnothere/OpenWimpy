package com.wimpyclient.k;

import com.wimpyclient.auth.LicenseGate;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.player.LocalPlayer;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class n {
   private static final int PANEL = -871360480;
   private static final int EDGE = 1157627903;
   private static final int ACCENT = -4657152;
   private static final int TEXT = -1511691;
   private static final int MUTED = -6641739;
   private static int bmIgAROL47;
   private transient int ycwcymh2g1;
   private static byte[] rzsnsavuto = iqpziewmnftaylv();

   private n() {
super();
      int var4 = 1595316584 ^ 1588246061;
      
      var4 = 45887887 ^ var4;
      var4 = 360351535 ^ 1868612729 ^ Integer.parseInt("2031771036");
      this.ycwcymh2g1 = 1876892013 ^ bmIgAROL47;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 47194077:
               var4 = 1958917194 ^ var4;
            case 1609670477:
               return;
            case 529690041:
               break;
            case 1741946768:
            default:
               throw new RuntimeException();
         }
      }
   }

   public static void render(GuiGraphics var0) {
      int var171 = 1797393859 ^ 856254907 ^ 1025620014;
      var171 = 1336026070 ^ var171;
      byte var1 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var1 != (715718528 ^ var171)) {
         var171 = 777577074 ^ var171;
      } else {
         var171 = sqtpqgdbxxypvezs(var171, 1985557359);
         Minecraft var21 = Minecraft.getInstance();
         LocalPlayer var23 = var21.player;
         if (var23 == null) {
            var171 = 1842370931 ^ var171;
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var171)) {
                  case 68428286:
                     var171 ^= 483278559;
                  case 800975777:
                     Font var26 = var21.font;
                     String var27 = cqjhaaobyz(spoylksgjndhgbk(), var171);
                     String var28 = cqjhaaobyz(wklvuhnnfkvglnx(), var171);
                     String var29 = cqjhaaobyz(blwaydkcusvjdlx(), var171);
                     byte var30 = (byte)(1077932598 ^ var171);
                     Object var32 = Objects.requireNonNull(var26);
                     byte var33 = (byte)(1077932601 ^ var171);
                     byte var2 = (byte)(1077932594 ^ var171);
                     int var34 = var33 + var2;
                     int var36 = var26.width(var27);
                     int var64 = var26.width(var28);
                     int var89 = var26.width(var29);
                     int var65 = Math.max(var64, var89);
                     int var37 = Math.max(var36, var65);
                     byte var90 = (byte)(1077932594 ^ var171);
                     int var67 = var30 * var90;
                     int var38 = var37 + var67;
                     byte var68 = (byte)(1077932594 ^ var171);
                     int var40 = var30 * var68;
                     byte var91 = (byte)(1077932595 ^ var171);
                     int var70 = var34 * var91;
                     int var41 = var40 + var70;
                     int var43 = var0.guiWidth();
                     int var44 = var43 - var38;
                     byte var72 = (byte)(1077932594 ^ var171);
                     int var45 = var44 / var72;
                     byte var46 = (byte)(1077932600 ^ var171);
                     int var107 = var45 + var38;
                     int var128 = var46 + var41;
                     int var151 = -1943016944 ^ var171;
                     var0.fill(var45, var46, var107, var128, var151);
                     int var109 = var45 + var38;
                     byte var152 = (byte)(1077932593 ^ var171);
                     int var131 = var46 + var152;
                     int var153 = 79695311 ^ var171;
                     var0.fill(var45, var46, var109, var131, var153);
                     int var95 = var46 + var41;
                     byte var111 = (byte)(1077932593 ^ var171);
                     int var96 = var95 - var111;
                     int var113 = var45 + var38;
                     int var134 = var46 + var41;
                     int var155 = 79695311 ^ var171;
                     var0.fill(var45, var96, var113, var134, var155);
                     byte var135 = (byte)(1077932593 ^ var171);
                     int var115 = var45 + var135;
                     int var137 = var46 + var41;
                     int var157 = 79695311 ^ var171;
                     var0.fill(var45, var46, var115, var137, var157);
                     int var78 = var45 + var38;
                     byte var99 = (byte)(1077932593 ^ var171);
                     int var79 = var78 - var99;
                     int var117 = var45 + var38;
                     int var140 = var46 + var41;
                     int var159 = 79695311 ^ var171;
                     var0.fill(var79, var46, var117, var140, var159);
                     byte var101 = (byte)(1077932593 ^ var171);
                     int var81 = var45 + var101;
                     int var119 = var45 + var38;
                     byte var142 = (byte)(1077932593 ^ var171);
                     int var120 = var119 - var142;
                     byte var160 = (byte)(1077932594 ^ var171);
                     int var144 = var46 + var160;
                     int var161 = -1081671120 ^ var171;
                     var0.fill(var81, var46, var120, var144, var161);
                     int var54 = var46 + var30;
                     int var122 = var45 + var30;
                     int var162 = -1081671120 ^ var171;
                     byte var7 = (byte)(1077932592 ^ var171);
                     var0.drawString(var26, var27, var122, var54, var162, (var7 != 0));
                     int var57 = var54 + var34;
                     int var124 = var45 + var30;
                     int var163 = -1076421435 ^ var171;
                     byte var165 = (byte)(1077932592 ^ var171);
                     var0.drawString(var26, var28, var124, var57, var163, (var165 != 0));
                     int var60 = var57 + var34;
                     int var126 = var45 + var30;
                     int var164 = -1079683707 ^ var171;
                     byte var166 = (byte)(1077932592 ^ var171);
                     var0.drawString(var26, var29, var126, var60, var164, (var166 != 0));
                     return;
                  case 649576908:
                     break;
                  case 1453251489:
                  default:
                     throw new IllegalStateException();
               }
            }
         }
      }
   }

   static {
      int var3 = new Random(-9086234988681635477L).nextInt();
      bmIgAROL47 = -134047777 ^ var3;
   }

   public static String cqjhaaobyz(byte[] var0, int var1) {
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
         byte[] var27 = rzsnsavuto;
         byte[] var34 = rzsnsavuto;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] iqpziewmnftaylv() {
      return new byte[]{
         20,
         72,
         74,
         60,
         103,
         29,
         90,
         120,
         27,
         20,
         43,
         41,
         89,
         28,
         101,
         5,
         68,
         63,
         19,
         107,
         44,
         54,
         110,
         23,
         79,
         28,
         103,
         52,
         10,
         117,
         74,
         48,
         47,
         54,
         74,
         41,
         26,
         12
      };
   }

   private static byte[] spoylksgjndhgbk() {
      return new byte[]{
         -37, -121, 125, 71, 94, 71, 104, 46, 34, 67, 26, 119, 110, 88, 92, 83, 118, 42, 42, 43, 29, 99, 89, 81, 118, 90, 85, 104, 51, 53, 123, 101, 24, 101
      };
   }

   private static byte[] wklvuhnnfkvglnx() {
      return new byte[]{
         -37,
         -121,
         125,
         95,
         94,
         87,
         104,
         61,
         34,
         67,
         26,
         57,
         110,
         5,
         92,
         93,
         118,
         111,
         42,
         32,
         29,
         38,
         89,
         121,
         118,
         96,
         85,
         84,
         51,
         21,
         123,
         75,
         24,
         68,
         115,
         67,
         40,
         25,
         45,
         19,
         123,
         98,
         80,
         10,
         99,
         40,
         41,
         73,
         18,
         122,
         104,
         88
      };
   }

   private static byte[] blwaydkcusvjdlx() {
      return new byte[]{
         -37,
         -121,
         125,
         70,
         94,
         65,
         104,
         41,
         34,
         83,
         26,
         117,
         110,
         78,
         92,
         69,
         118,
         42,
         42,
         56,
         29,
         116,
         89,
         69,
         118,
         15,
         85,
         109,
         51,
         40,
         123,
         99,
         24,
         106,
         115,
         127,
         40,
         93,
         45,
         90,
         123,
         121,
         80,
         68,
         99,
         63,
         41,
         72,
         18,
         119,
         104,
         12,
         82,
         83,
         125,
         44,
         33,
         40,
         21,
         101,
         95,
         75,
         120,
         66,
         94,
         99,
         56,
         96,
         115,
         105,
         30,
         99,
         125,
         103,
         35,
         31,
         38,
         20,
         115,
         125,
         86,
         13,
         109,
         46,
         34,
         68,
         25,
         127,
         96,
         75,
         84,
         69,
         115,
         124,
         42,
         61,
         30,
         103,
         87,
         11
      };
   }

   private static int sqtpqgdbxxypvezs(int var0, int var1) {
      return var0 ^ var1;
   }
}
