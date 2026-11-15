package com.wimpyclient.localauth;

import ivirzlaazbgesszx.equlxktebzrxiyte;
import java.io.IOException;
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

@Environment(EnvType.CLIENT)
public final class b {
   private static final int PANEL = -871360480;
   private static final int EDGE = 1157627903;
   private static final int ACCENT = -4657152;
   private static final int TEXT = -1511691;
   private static final int MUTED = -6641739;
   private static int QQdPmqH5Ls;
   private transient int Zrx13TZN1W;

   private b() {
super();
      int var4 = 984107237 ^ 1842543578;
      

      while (true) {
         switch (equlxktebzrxiyte.tpabobqnolkrvwps(var4)) {
            case 159247408:
               var4 = 918318820 ^ var4;
            case 1885179365:
               var4 = 2108850642 ^ 130543477 ^ Integer.parseInt("464761724");
               this.Zrx13TZN1W = 540115028 ^ QQdPmqH5Ls;

               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var4)) {
                     case 225520670:
                        var4 = 1668309244 ^ var4;
                        return;
                     case 1847337039:
                        return;
                     case 1896100826:
                     default:
                        throw new RuntimeException(new IOException());
                     case 2119581888:
                  }
               }
            case 1474663211:
               break;
            case 1578521000:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public static void render(GuiGraphics var0) {
      int var171 = 514967279 ^ 1792931814 ^ 1184159810;
      var171 = 215457327 ^ var171;
      boolean var1 = LicenseLoader.isAuthorized();
      if (var1) {
         var171 = 1811333548 ^ var171;
      } else {
         var171 = uyaxelwbytdfndkn(var171, 874496674);
         Minecraft var21 = Minecraft.getInstance();
         LocalPlayer var23 = var21.player;
         if (var23 == null) {
            var171 = 1911658307 ^ var171;
         } else {
            var171 = uyaxelwbytdfndkn(var171, 326064441);
            Font var26 = var21.font;
            String var27 = rdbwpopkgf(lgjonwfqqqpkzgn(), tfqafpzhshswhxw(), var171);
            String var28 = rdbwpopkgf(oqebihfewzbjruz(), tfqafpzhshswhxw(), var171);
            String var29 = rdbwpopkgf(urexvdkspiymmjd(), tfqafpzhshswhxw(), var171);
            byte var30 = 6;
            Object var32 = Objects.requireNonNull(var26);
            byte var33 = 9;
            byte var2 = 2;
            int var34 = var33 + var2;
            int var36 = var26.width(var27);
            int var64 = var26.width(var28);
            int var89 = var26.width(var29);
            int var65 = Math.max(var64, var89);
            int var37 = Math.max(var36, var65);
            byte var90 = 2;
            int var67 = var30 * var90;
            int var38 = var37 + var67;
            byte var68 = 2;
            int var40 = var30 * var68;
            byte var91 = 3;
            int var70 = var34 * var91;
            int var41 = var40 + var70;
            int var43 = var0.guiWidth();
            int var44 = var43 - var38;
            byte var72 = 2;
            int var45 = var44 / var72;
            byte var46 = 8;
            int var107 = var45 + var38;
            int var128 = var46 + var41;
            int var151 = -871360480;
            var0.fill(var45, var46, var107, var128, var151);
            int var109 = var45 + var38;
            byte var152 = 1;
            int var131 = var46 + var152;
            int var153 = 1157627903;
            var0.fill(var45, var46, var109, var131, var153);
            int var95 = var46 + var41;
            byte var111 = 1;
            int var96 = var95 - var111;
            int var113 = var45 + var38;
            int var134 = var46 + var41;
            int var155 = 1157627903;
            var0.fill(var45, var96, var113, var134, var155);
            byte var135 = 1;
            int var115 = var45 + var135;
            int var137 = var46 + var41;
            int var157 = 1157627903;
            var0.fill(var45, var46, var115, var137, var157);
            int var78 = var45 + var38;
            byte var99 = 1;
            int var79 = var78 - var99;
            int var117 = var45 + var38;
            int var140 = var46 + var41;
            int var159 = 1157627903;
            var0.fill(var79, var46, var117, var140, var159);
            byte var101 = 1;
            int var81 = var45 + var101;
            int var119 = var45 + var38;
            byte var142 = 1;
            int var120 = var119 - var142;
            byte var160 = 2;
            int var144 = var46 + var160;
            int var161 = -4657152;
            var0.fill(var81, var46, var120, var144, var161);
            int var54 = var46 + var30;
            int var122 = var45 + var30;
            int var162 = -4657152;
            boolean var7 = false;
            var0.drawString(var26, var27, var122, var54, var162, var7);
            int var57 = var54 + var34;
            int var124 = var45 + var30;
            int var163 = -1511691;
            boolean var165 = false;
            var0.drawString(var26, var28, var124, var57, var163, var165);
            int var60 = var57 + var34;
            int var126 = var45 + var30;
            int var164 = -6641739;
            boolean var166 = false;
            var0.drawString(var26, var29, var126, var60, var164, var166);
         }
      }
   }

   static {
      int var3 = new Random(6167735422698782049L).nextInt();
      QQdPmqH5Ls = 888744695 ^ var3;
   }

   public static String rdbwpopkgf(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] tfqafpzhshswhxw() {
      return new byte[]{106, 56, 125, 45, 23, 39, 43, 60, 10, 86, 48, 106, 41, 117, 30, 122, 112, 31};
   }

   private static byte[] lgjonwfqqqpkzgn() {
      return new byte[]{
         -96, -11, 72, 86, 38, 120, 18, 102, 59, 7, 2, 49, 30, 55, 40, 38, 73, 14, 94, 120, 72, 127, 38, 96, 18, 112, 59, 11, 2, 45, 30, 33, 40, 39
      };
   }

   private static byte[] oqebihfewzbjruz() {
      return new byte[]{
         -96,
         -11,
         72,
         74,
         38,
         99,
         18,
         96,
         59,
         17,
         2,
         44,
         30,
         100,
         40,
         17,
         73,
         71,
         94,
         109,
         72,
         114,
         38,
         101,
         18,
         37,
         59,
         49,
         2,
         55,
         30,
         45,
         40,
         37,
         73,
         90,
         94,
         42,
         72,
         117,
         38,
         99,
         18,
         37,
         59,
         22,
         2,
         38,
         30,
         52,
         40,
         38,
         73,
         14,
         94,
         36,
         72,
         113,
         38,
         116,
         18,
         124,
         59,
         66,
         2,
         6,
         30,
         11,
         40,
         22,
         73,
         124,
         94,
         65,
         72,
         95,
         38,
         72,
         18,
         37,
         59,
         11,
         2,
         49,
         30,
         100,
         40,
         32,
         73,
         70,
         94,
         107,
         72,
         110
      };
   }

   private static byte[] urexvdkspiymmjd() {
      return new byte[]{
         -96,
         -11,
         72,
         87,
         38,
         126,
         18,
         97,
         59,
         23,
         2,
         51,
         30,
         33,
         40,
         48,
         73,
         14,
         94,
         107,
         72,
         104,
         38,
         116,
         18,
         37,
         59,
         14,
         2,
         48,
         30,
         39,
         40,
         40,
         73,
         75,
         94,
         110,
         72,
         58,
         38,
         100,
         18,
         107,
         59,
         22,
         2,
         54,
         30,
         40,
         40,
         99,
         73,
         79,
         94,
         42,
         72,
         108,
         38,
         112,
         18,
         105,
         59,
         11,
         2,
         59,
         30,
         100,
         40,
         40,
         73,
         75,
         94,
         115,
         72,
         58,
         38,
         120,
         18,
         118,
         59,
         66,
         2,
         62,
         30,
         39,
         40,
         32,
         73,
         75,
         94,
         122,
         72,
         110,
         38,
         116,
         18,
         97,
         59,
         76
      };
   }

   private static int uyaxelwbytdfndkn(int var0, int var1) {
      return var0 ^ var1;
   }
}
