package com.wimpyclient.k;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class e {
   private static int eG9p9BWbaJ;
   private transient int fUSKkQEhtQ;

   private e() {
super();
      int var4 = 1695089213 ^ 1086898148;
      
      var4 = 989383657 ^ var4;
      var4 = 155447253 ^ 736038120 ^ Integer.parseInt("1034261773");
      this.fUSKkQEhtQ = 112832020 ^ eG9p9BWbaJ;
      var4 = kpeczhwgfokwbbap(var4, 2032948668);
   }

   public static void glassPanel(com.wimpyclient.m.b var0, float var1, float var2, float var3, float var4, float var5) {
      int var15 = 1552903586 ^ 1947252242 ^ 2133929916;
      var15 = 525745589 ^ var15;
      byte var12 = (byte)(1224264120 ^ var15);
      glassPanel(var0, var1, var2, var3, var4, var5, (var12 != 0));
   }

   public static void glassPanel(com.wimpyclient.m.b var0, float var1, float var2, float var3, float var4, float var5, boolean var6) {
      int var101 = 1874885624 ^ 295014555 ^ 2133929916;
      var101 = 603159061 ^ var101;
      byte var7 = (byte)((h.master()) ? 1 : 0);
      if (var7 == (580370122 ^ var101)) {
         var101 = 975456748 ^ var101;
         com.wimpyclient.o.b var21 = com.wimpyclient.o.b.INSTANCE;
         int var80 = var21.background();
         int var85 = var21.backgroundTo();
         byte var15 = (byte)(414447399 ^ var101);
         var0.rectGradient(var1, var2, var3, var4, var5, var80, var85, (var15 != 0));
         float var81 = 1.0F;
         int var87 = var21.panelEdge();
         var0.strokeRect(var1, var2, var3, var4, var5, var81, var87);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var101)) {
               case 50733872:
                  var101 ^= 344915649;
               case 491388463:
                  float var24 = 0.4F;
                  float var37 = h.outlineThickness();
                  float var48 = 0.85F;
                  float var38 = var37 * var48;
                  float var25 = Math.max(var24, var38);
                  int var26 = h.chrome();
                  byte var27 = (byte)((h.uiGlow()) ? 1 : 0);
                  if (var27 != (907624459 ^ var101)) {
                     var101 = 968537748 ^ var101;
                     float var28 = 2.0F;
                     float var39 = 2.2F;
                     float var49 = h.glowIntensity();
                     float var40 = var39 * var49;
                     float var29 = var28 + var40;
                     float var59 = 1.0F;
                     float var51 = var2 + var59;
                     float var93 = 0.05F;
                     float var16 = 0.08F;
                     float var17 = h.glowIntensity();
                     float var97 = var16 * var17;
                     float var94 = var93 + var97;
                     int var89 = com.wimpyclient.p.g.withAlpha(var26, var94);
                     var0.glow(var1, var51, var3, var4, var5, var29, var89);
                     var101 = 1124716442 ^ var101;
                  } else {
                     var101 = kpeczhwgfokwbbap(var101, 2058582286);
                  }

                  int var83 = h.glassTop();
                  int var90 = h.glassBottom();
                  byte var95 = (byte)(1286224132 ^ var101);
                  var0.rectGradient(var1, var2, var3, var4, var5, var83, var90, (var95 != 0));
                  nebula(var0, var1, var2, var3, var4);
                  if (var6 != ((1286224133 ^ var101) != 0)) {
                     var101 = 1201346412 ^ var101;
                     float var54 = 1.5F;
                     float var45 = var1 + var54;
                     float var63 = 1.5F;
                     float var56 = var2 + var63;
                     float var71 = 3.0F;
                     float var65 = var3 - var71;
                     float var78 = 3.0F;
                     float var73 = var4 - var78;
                     g.draw(var0, var45, var56, var65, var73);
                     var101 = 1594513674 ^ var101;
                  } else {
                     var101 = 412175974 ^ var101;
                  }

                  float var96 = 0.55F;
                  int var92 = com.wimpyclient.p.g.withAlpha(var26, var96);
                  var0.strokeRect(var1, var2, var3, var4, var5, var25, var92);
                  return;
               case 395317891:
               default:
                  throw new RuntimeException();
               case 1092317930:
            }
         }
      }
   }

   private static void nebula(com.wimpyclient.m.b var0, float var1, float var2, float var3, float var4) {
      int var161 = 289765960 ^ 1934500587 ^ 2133929916;
      var161 = 747417624 ^ var161;
      var0.save();
      var0.intersectScissor(var1, var2, var3, var4);
      float var23 = h.starAnimSpeed();
      long var24 = System.nanoTime();
      double var26 = var24;
      double var81 = 1.0E-9;
      double var28 = var26 * var81;
      double var83 = 0.08;
      double var135 = 0.12;
      double var154 = var23;
      double var137 = var135 * var154;
      double var85 = var83 + var137;
      double var30 = var28 * var85;
      float var32 = h.glowIntensity();
      int var33 = -829666865 ^ var161;
      float var61 = 0.1F;
      float var87 = 0.08F;
      float var88 = var87 * var32;
      float var62 = var61 + var88;
      int var34 = com.wimpyclient.p.g.withAlpha(var33, var62);
      int var35 = -823358033 ^ var161;
      float var63 = 0.08F;
      float var89 = 0.06F;
      float var90 = var89 * var32;
      float var64 = var63 + var90;
      int var36 = com.wimpyclient.p.g.withAlpha(var35, var64);
      int var37 = -825751304 ^ var161;
      float var65 = 0.06F;
      float var91 = 0.06F;
      float var92 = var91 * var32;
      float var66 = var65 + var92;
      int var38 = com.wimpyclient.p.g.withAlpha(var37, var66);
      double var41 = Math.sin(var30);
      float var43 = (float)var41;
      float var44 = var43 * var3;
      float var68 = 0.1F;
      float var45 = var44 * var68;
      double var93 = 0.73;
      double var48 = var30 * var93;
      double var50 = Math.cos(var48);
      float var52 = (float)var50;
      float var53 = var52 * var4;
      float var70 = 0.16F;
      float var54 = var53 * var70;
      float var56 = Math.max(var3, var4);
      float var116 = 0.26F;
      float var96 = var3 * var116;
      float var73 = var1 + var96;
      float var74 = var73 + var45;
      float var139 = 0.48F;
      float var118 = var4 * var139;
      float var99 = var2 + var118;
      float var100 = var99 + var54;
      float var140 = 0.55F;
      float var121 = var56 * var140;
      float var156 = 0.0F;
      int var149 = com.wimpyclient.p.g.withAlpha(var34, var156);
      var0.radial(var74, var100, var121, var34, var149);
      float var122 = 0.78F;
      float var102 = var3 * var122;
      float var76 = var1 + var102;
      float var77 = var76 - var45;
      float var142 = 0.55F;
      float var124 = var4 * var142;
      float var105 = var2 + var124;
      float var106 = var105 - var54;
      float var143 = 0.48F;
      float var127 = var56 * var143;
      float var157 = 0.0F;
      int var151 = com.wimpyclient.p.g.withAlpha(var36, var157);
      var0.radial(var77, var106, var127, var36, var151);
      float var128 = 0.52F;
      float var108 = var3 * var128;
      float var79 = var1 + var108;
      float var129 = 0.35F;
      float var110 = var45 * var129;
      float var80 = var79 + var110;
      float var145 = 0.38F;
      float var131 = var4 * var145;
      float var112 = var2 + var131;
      float var133 = Math.min(var3, var4);
      float var147 = 0.85F;
      float var134 = var133 * var147;
      float var158 = 0.0F;
      int var153 = com.wimpyclient.p.g.withAlpha(var38, var158);
      var0.radial(var80, var112, var134, var38, var153);
      var0.restore();
   }

   public static void glassCapsule(com.wimpyclient.m.b var0, float var1, float var2, float var3, float var4) {
      int var13 = 54491185 ^ 2069904531 ^ 2133929916;
      var13 = 183923982 ^ var13;
      byte var10 = (byte)(228072977 ^ var13);
      glassCapsule(var0, var1, var2, var3, var4, (var10 != 0));
   }

   public static void glassCapsule(com.wimpyclient.m.b var0, float var1, float var2, float var3, float var4, boolean var5) {
      int var17 = 224238613 ^ 1538914498 ^ 2133929916;
      var17 = 1982757510 ^ var17;
      float var12 = 2.0F;
      float var13 = var4 / var12;
      glassPanel(var0, var1, var2, var3, var4, var13, var5);
   }

   public static void logo(com.wimpyclient.m.b var0, int var1, float var2, float var3, float var4, float var5) {
      int var38 = 444566926 ^ 1401453530 ^ 2133929916;
      var38 = 1320108127 ^ var38;
      if (var1 < (2020186551 ^ var38)) {
         var38 = 222389905 ^ var38;
      } else {
         var38 = kpeczhwgfokwbbap(var38, 784091529);
         byte var19 = (byte)((h.logoGlow()) ? 1 : 0);
         if (var19 != (1456853054 ^ var38)) {
            var38 = 1973627210 ^ var38;
            int var20 = h.chrome();
            float var21 = 2.5F;
            float var7 = 3.0F;
            float var8 = h.glowIntensity();
            float var25 = var7 * var8;
            float var22 = var21 + var25;
            float var11 = 3.0F;
            float var14 = 0.18F;
            float var15 = 0.16F;
            float var16 = h.glowIntensity();
            float var35 = var15 * var16;
            float var34 = var14 + var35;
            int var33 = com.wimpyclient.p.g.withAlpha(var20, var34);
            var0.glow(var2, var3, var4, var5, var11, var22, var33);
            var38 = 1626623976 ^ var38;
         } else {
            label20:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                  case 138286509:
                     var38 = 358049442 ^ var38;
                     break label20;
                  case 665649918:
                     break;
                  case 1218413900:
                     break label20;
                  case 2087074092:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }

         var0.image(var1, var2, var3, var4, var5);
      }
   }

   static {
      int var3 = new Random(4780192293746767418L).nextInt();
      eG9p9BWbaJ = -1987539822 ^ var3;
   }

   public static String abrfugpabl(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] arejcidrcvbkfzq() {
      return new byte[]{47, 38, 21, 17, 66, 59, 85, 15, 120, 91, 105, 34, 52, 22, 119, 123, 10, 65};
   }

   private static int kpeczhwgfokwbbap(int var0, int var1) {
      return var1 ^ var0;
   }
}
