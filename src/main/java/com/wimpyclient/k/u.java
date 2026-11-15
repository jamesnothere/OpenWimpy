package com.wimpyclient.k;

import com.wimpyclient.i.aj;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.util.Mth;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class u {
   private static final float CARD_W = 300.0F;
   private static final float CARD_H = 44.0F;
   private static final float RADIUS = 11.0F;
   private static int f3ogh7bfquh;
   private transient int bSVI4evghR;

   private u() {
super();
      int var4 = 99881710 ^ 353799002;
      
      var4 = xfkfdcacuakfrmkk(var4, 1198445048);
      var4 = 1106694569 ^ 1439556043 ^ Integer.parseInt("1136097326");
      this.bSVI4evghR = 453465159 ^ f3ogh7bfquh;
      var4 = 1264146802 ^ var4;
   }

   public static void renderNvg(com.wimpyclient.m.b var0, float var1, float var2) {
      int var187 = 500966732 ^ 549390698 ^ 1869936510;
      var187 = 1912606729 ^ var187;
      com.wimpyclient.i.x var3 = com.wimpyclient.i.x.INSTANCE;
      com.wimpyclient.i.v var33 = var3.schematicBuilder;
      byte var34 = (byte)((var33.qo()) ? 1 : 0);
      if (var34 == (538430289 ^ var187)) {
         var187 = 1759508967 ^ var187;
      } else {
         var187 = 1407856984 ^ var187;
         aj var35 = aj.INSTANCE;
         com.wimpyclient.u.c var37 = var35.schematic();
         if (var37 == null) {
            var187 = 1091386179 ^ var187;
         } else {
            var187 = 582698679 ^ var187;
            byte var40 = (byte)((var35.isBuilding()) ? 1 : 0);            com.wimpyclient.o.b var41 = com.wimpyclient.o.b.INSTANCE;
            float var42 = 300.0F;
            float var43 = 44.0F;
            float var45 = var1 - var42;
            float var101 = 0.5F;
            float var46 = var45 * var101;
            float var48 = var2 - var43;
            float var103 = 18.0F;
            float var49 = var48 - var103;
            float var6 = 2.0F;
            float var121 = var49 + var6;
            float var8 = 11.0F;
            float var9 = 10.0F;
            int var165 = var41.accent();
            float var11 = 0.14F;
            int var166 = com.wimpyclient.p.g.withAlpha(var165, var11);
            var0.glow(var46, var121, var42, var43, var8, var9, var166);
            float var152 = 11.0F;
            int var158 = -1370381925 ^ var187;
            float var167 = 0.92F;
            int var159 = com.wimpyclient.p.g.withAlpha(var158, var167);
            int var168 = -1370969948 ^ var187;
            float var178 = 0.94F;
            int var169 = com.wimpyclient.p.g.withAlpha(var168, var178);
            byte var179 = (byte)(1363590335 ^ var187);
            var0.rectGradient(var46, var49, var42, var43, var152, var159, var169, (var179 != 0));
            float var153 = 11.0F;
            float var160 = 1.1F;
            int var171 = var41.accent();
            float var180 = 0.45F;
            int var172 = com.wimpyclient.p.g.withAlpha(var171, var180);
            var0.rectOutline(var46, var49, var42, var43, var153, var160, var172);
            String var99;
            if (var40 != (1363590334 ^ var187)) {
               var187 = 614918537 ^ var187;
               String var55 = var35.progressLabel();
               var99 = "Building  " + var55;
               var187 = xfkfdcacuakfrmkk(var187, 39403647);
            } else {
               label155:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var187)) {
                     case 226057462:
                        var187 ^= 2135371673;
                     case 1132775624:
                        break label155;
                     case 1372150694:
                        break;
                     case 1731031042:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }

               String var97 = var37.name();
               var99 = "Preview  " + var97;
               var187 = 1505265263 ^ var187;
            }

            String var22;
            label166: {
               String var57 = var35.status();
               var22 = var57;
               if (var57 != null) {
                  var187 = 1576041623 ^ var187;
                  byte var60 = (byte)((var57.isBlank()) ? 1 : 0);
                  if (var60 == (709454303 ^ var187)) {
                     var187 = xfkfdcacuakfrmkk(var187, 1078100324);
                     break label166;
                  }

                  var187 = 1935162228 ^ var187;
               } else {
                  var187 = xfkfdcacuakfrmkk(var187, 782780387);
               }

               String var62;
               if (var40 != (1494307499 ^ var187)) {
                  var187 = 844265366 ^ var187;
                  var62 = dvfzlvtaho(lntrdyzsihbxhvx(), eyynzgivknnaofj(), var187);
                  var187 = 50026163 ^ var187;
               } else {
                  var187 = xfkfdcacuakfrmkk(var187, 1361559469);
                  var62 = dvfzlvtaho(iqvvrmkjsydymlt(), eyynzgivknnaofj(), var187);
                  var187 = 1636736648 ^ var187;
               }

               var22 = var62;
               var187 = 62102325 ^ var187;
            }

            byte var64 = (byte)((looksFailed(var22)) ? 1 : 0);
            int var100;
            if (var64 != (1779165371 ^ var187)) {
               var187 = 221382504 ^ var187;
               var100 = (short)(-1731828397 ^ var187);

               label140:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var187)) {
                     case 134227857:
                        var187 ^= 391957157;
                        break label140;
                     case 595993829:
                     default:
                        throw new RuntimeException(new IOException());
                     case 630698538:
                        break;
                     case 638066392:
                        break label140;
                  }
               }
            } else {
               var187 = xfkfdcacuakfrmkk(var187, 1097459800);
               if (var40 != (727843043 ^ var187)) {
                  var187 = 1772645621 ^ var187;
                  var100 = var41.accentBright();
                  var187 = 850348384 ^ var187;
               } else {
                  label132:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var187)) {
                        case 68012757:
                           var187 ^= 1403757684;
                           break label132;
                        case 179074019:
                           break;
                        case 457363576:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1615208642:
                           break label132;
                     }
                  }

                  var100 = var41.textMuted();
                  var187 = 145523169 ^ var187;
               }
            }

            float var124 = 14.0F;
            float var108 = var46 + var124;
            float var137 = 15.0F;
            float var126 = var49 + var137;
            float var138 = 12.5F;
            float var67 = var0.text(var108, var126, var138, var100, var99);
            float var109 = 14.0F;
            float var69 = var46 + var109;
            float var110 = 24.0F;
            float var71 = var49 + var110;
            float var111 = 28.0F;
            float var73 = var42 - var111;
            float var74 = 6.0F;
            float var155 = 3.0F;
            int var161 = -1887502010 ^ var187;
            float var173 = 0.95F;
            int var162 = com.wimpyclient.p.g.withAlpha(var161, var173);
            var0.rect(var69, var71, var73, var74, var155, var162);
            float var92;
            if (var40 != (1885676918 ^ var187)) {
               var187 = 1340697911 ^ var187;
               var92 = var35.progressFraction();
               var187 = xfkfdcacuakfrmkk(var187, 1129537240);
            } else {
               var187 = xfkfdcacuakfrmkk(var187, 179245753);
               var92 = 1.0F;
               var187 = 102048086 ^ var187;
            }

            float var128 = 0.0F;
            float var140 = 1.0F;
            float var114 = Mth.clamp(var92, var128, var140);
            float var79 = var73 * var114;
            float var115 = 0.5F;
            float var218;
            int var81 = (var218 = var79 - var115) == 0.0F ? 0 : (var218 < 0.0F ? -1 : 1);
            if (var81 > (2094995097 ^ var187)) {
               var187 = 1410249669 ^ var187;
               int var98;
               if (var40 != (684827996 ^ var187)) {
                  var187 = 1862885860 ^ var187;
                  var98 = -1192945617 ^ var187;
                  var187 = xfkfdcacuakfrmkk(var187, 1052151882);
               } else {
                  label120:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var187)) {
                        case 151479726:
                           break;
                        case 253106355:
                           var187 ^= 1393799312;
                           break label120;
                        case 445885968:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1964323002:
                           break label120;
                     }
                  }

                  var98 = var41.accent();
                  var187 = 44843326 ^ var187;
               }

               float var156 = 3.0F;
               float var174 = 0.95F;
               int var164 = com.wimpyclient.p.g.withAlpha(var98, var174);
               int var176 = var41.accentBright();
               float var183;
               if (var40 == (2037273842 ^ var187)) {
                  var187 = xfkfdcacuakfrmkk(var187, 1410916205);
                  var183 = 0.85F;
                  var187 = 1184565468 ^ var187;
               } else {
                  var187 = 440526485 ^ var187;
                  var183 = 0.55F;

                  label109:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var187)) {
                        case 2886280:
                           var187 ^= 146944292;
                           break label109;
                        case 438955227:
                        default:
                           throw new RuntimeException(new IOException());
                        case 465021652:
                           break label109;
                        case 1677103826:
                     }
                  }
               }

               int var177 = com.wimpyclient.p.g.withAlpha(var176, var183);
               byte var182 = (byte)(1810727747 ^ var187);
               var0.rectGradient(var69, var71, var79, var74, var156, var164, var177, (var182 != 0));
               var187 = 1689486240 ^ var187;
            } else {
               var187 = 1937839738 ^ var187;
            }

            int var85 = var22.length();
            byte var117 = (byte)(257818839 ^ var187);
            String var90;
            if (var85 > var117) {
               var187 = 926624654 ^ var187;
               byte var120 = (byte)(946154349 ^ var187);
               byte var133 = (byte)(946154334 ^ var187);
               String var89 = var22.substring(var120, var133);
               var90 = var89 + "\u2026";

               label96:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var187)) {
                     case 222575686:
                        var187 ^= 1279949836;
                     case 1315123567:
                        break label96;
                     case 2018488478:
                        break;
                     case 2086141974:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            } else {
               var187 = xfkfdcacuakfrmkk(var187, 881030307);
               var90 = var22;
               var187 = 1341268769 ^ var187;
            }

            float var130 = 14.0F;
            float var119 = var46 + var130;
            float var142 = 38.0F;
            float var132 = var49 + var142;
            float var143 = 10.5F;
            int var151;
            if (var64 != (1949259617 ^ var187)) {
               var187 = 1499879537 ^ var187;
               var151 = (short)(-759790192 ^ var187);

               label80:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var187)) {
                     case 129867878:
                        var187 = 1922787355 ^ var187;
                     case 412376133:
                        break label80;
                     case 715871087:
                        break;
                     case 1752390693:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            } else {
               label88:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var187)) {
                     case 18599268:
                        var187 ^= 1627381789;
                     case 35762635:
                        break label88;
                     case 787541795:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1058062859:
                  }
               }

               var151 = var41.textMuted();
               var187 = 1258475639 ^ var187;
            }

            float var87 = var0.text(var119, var132, var143, var151, var90);
         }
      }
   }

   public static void render(GuiGraphics var0) {
      int var3 = 1996771236 ^ 1136005808 ^ 1869936510;
      var3 = 787982889 ^ var3;
   }

   private static boolean looksFailed(String var0) {
      int var22 = 315296965 ^ 806322369 ^ 1869936510;
      var22 = 1467736282 ^ var22;
      String var4 = var0.toLowerCase();
      String var2 = dvfzlvtaho(bmvduvzhrzoczbh(), eyynzgivknnaofj(), var22);
      byte var6 = (byte)((var4.startsWith(var2)) ? 1 : 0);
      if (var6 == (449551264 ^ var22)) {
         var22 = 217844641 ^ var22;
         String var16 = dvfzlvtaho(fjqgyickfullfzf(), eyynzgivknnaofj(), var22);
         byte var8 = (byte)((var4.contains(var16)) ? 1 : 0);
         if (var8 == (372740097 ^ var22)) {
            var22 = 338109782 ^ var22;
            String var17 = dvfzlvtaho(banihitojqeleee(), eyynzgivknnaofj(), var22);
            byte var10 = (byte)((var4.contains(var17)) ? 1 : 0);
            if (var10 == (34649431 ^ var22)) {
               var22 = 1688272127 ^ var22;
               String var18 = dvfzlvtaho(haxtmaycmltvmjl(), eyynzgivknnaofj(), var22);
               byte var12 = (byte)((var4.contains(var18)) ? 1 : 0);
               if (var12 == (1722829224 ^ var22)) {
                  var22 = 1472952954 ^ var22;
                  String var19 = dvfzlvtaho(ejututhpidsptuu(), eyynzgivknnaofj(), var22);
                  byte var14 = (byte)((var4.contains(var19)) ? 1 : 0);
                  if (var14 == (830157778 ^ var22)) {
                     var22 = xfkfdcacuakfrmkk(var22, 895487547);
                     byte var15 = (byte)(68894185 ^ var22);
                     var22 = 1334659381 ^ var22;
                     return (var15 != 0);
                  }

                  var22 = 1345499744 ^ var22;
               } else {
                  var22 = 133810202 ^ var22;
               }
            } else {
               label39:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                     case 32483345:
                        var22 ^= 1666790629;
                        break label39;
                     case 708749262:
                        break;
                     case 811019408:
                     default:
                        throw new RuntimeException(new IOException());
                     case 2138797215:
                        break label39;
                  }
               }
            }
         } else {
            var22 = 2004750771 ^ var22;
         }
      } else {
         var22 = 2072123922 ^ var22;
      }

      byte var31 = (byte)(1632207283 ^ var22);

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
            case 209586689:
               var22 = 719320430 ^ var22;
               return (var31 != 0);
            case 982289405:
               break;
            case 1382580096:
               return (var31 != 0);
            case 1564996985:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   static {
      int var3 = new Random(9087016242990501183L).nextInt();
      f3ogh7bfquh = 1681228741 ^ var3;
   }

   public static String dvfzlvtaho(byte[] var0, byte[] var1, int var2) {
      String var11 = Integer.toString(var2);
      byte[] var12 = var11.getBytes();
      byte[] var9 = var12;
      byte var13 = 0;
      int var10 = var13;

      while (true) {
         int var18 = var0.length;
         if (var10 >= var18) {
            Charset var6 = StandardCharsets.UTF_16;
            return new String(var0, var6);
         }

         byte var21 = var0[var10];
         int var34 = var9.length;
         int var31 = var10 % var34;
         byte var28 = var9[var31];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var10] = var23;
         byte var24 = var0[var10];
         int var36 = var1.length;
         int var33 = var10 % var36;
         byte var30 = var1[var33];
         int var25 = var24 ^ var30;
         byte var26 = (byte)var25;
         var0[var10] = var26;
         var10++;
      }
   }

   private static byte[] eyynzgivknnaofj() {
      return new byte[]{
         77,
         98,
         75,
         54,
         103,
         101,
         108,
         19,
         96,
         26,
         60,
         102,
         118,
         103,
         86,
         18,
         8,
         70,
         65,
         104,
         77,
         28,
         45,
         34,
         42,
         22,
         61,
         72,
         67,
         99,
         75,
         103,
         27,
         24,
         125,
         15,
         114,
         51,
         99,
         80,
         123,
         93,
         11,
         49,
         127,
         119,
         120,
         13,
         123,
         3,
         43,
         93
      };
   }

   private static byte[] iqvvrmkjsydymlt() {
      return new byte[]{
         -126,
         -82,
         124,
         65,
         86,
         52,
         95,
         64,
         80,
         88,
         15,
         52,
         78,
         34,
         97,
         1,
         61,
         -63,
         112,
         123,
         122,
         119,
         28,
         97,
         25,
         66,
         13,
         11,
         112,
         32,
         115,
         118,
         44,
         92,
         72,
         87,
         67,
         101,
         84,
         6,
         74,
         74,
         56,
         118,
         79,
         35,
         75,
         91,
         67,
         86,
         28,
         23
      };
   }

   private static byte[] lntrdyzsihbxhvx() {
      return new byte[]{-126, -86, 114, 88, 82, 60, 94, 84, 85, 70, 13, 56, 79, 48, 99, 67, 26, 85};
   }

   private static byte[] ejututhpidsptuu() {
      return new byte[]{-117, -82, 123, 117, 82, 55, 91, 78, 88, 71, 15, 53, 71, 38, 97, 64, 63, 26};
   }

   private static byte[] banihitojqeleee() {
      return new byte[]{-128, -87, 125, 109, 94, 50, 95, 65, 83, 91, 10, 34, 79, 58, 101, 70, 59, 22};
   }

   private static byte[] fjqgyickfullfzf() {
      return new byte[]{-128, -86, 121, 116, 83, 59, 92, 89, 87, 92, 11, 36, 65, 35, 102, 77, 49, 3, 114, 43, 127, 78, 25, 118};
   }

   private static byte[] bmvduvzhrzoczbh() {
      return new byte[]{-121, -87, 114, 101, 82, 53, 94, 76, 84, 66};
   }

   private static byte[] haxtmaycmltvmjl() {
      return new byte[]{
         -126, -86, 121, 96, 95, 62, 85, 69, 82, 14, 13, 63, 68, 58, 110, 84, 49, 84, 115, 63, 124, 68, 31, 126, 18, 66, 4, 19, 113, 37, 122, 61
      };
   }

   private static int xfkfdcacuakfrmkk(int var0, int var1) {
      return var1 ^ var0;
   }
}
