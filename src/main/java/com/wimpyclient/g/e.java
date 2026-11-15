package com.wimpyclient.g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Mth;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class e {
   public static final int OVERLAY = 1426063360;
   public static final int PANEL = -401073118;
   public static final int PANEL_EDGE = -16118768;
   public static final int PANEL_INNER = -15460320;
   public static final int HEADER_LINE = 687865855;
   public static final int ACCENT = -9187073;
   public static final int ACCENT_DIM = -11892054;
   public static final int TEXT = -854278;
   public static final int MUTED = -7364430;
   public static final int WARN = -19372;
   public static final int FIELD = -15855080;
   public static final int TRACK = -14012360;
   public static final int TRACK_ON = -10566411;
   public static final int ROW_HOVER = -14538704;
   public static final int ROW_OPEN = -14933462;
   public static final int KNOB = -1;
   public static final int KNOB_OFF = -1644826;
   public static final int SHADOW = 1073741824;
   public static final float DESIGN_GUI_SCALE = 2.0F;
   private static final int BASE_COL_W = 138;
   private static final int BASE_COL_GAP = 7;
   private static final int BASE_HEADER_H = 24;
   private static final int BASE_ROW_H = 20;
   private static final int BASE_SETTING_H = 30;
   private static final int BASE_COLOR_PICKER_H = 120;
   private static final int BASE_PAD = 7;
   private static final int BASE_RADIUS = 10;
   private static final int BASE_TOGGLE_H = 12;
   private static final int BASE_ACCENT_BAR_W = 2;
   private static final int BASE_TOP_Y = 12;
   private static final int BASE_MAX_COL_H = 360;
   private static final int BASE_WHEEL_R = 38;
   private static final int BASE_BTN_H = 14;
   private static final int BASE_BTN_W = 16;
   private static final int BASE_FIELD_H = 14;
   private static final int BASE_LABEL_GAP = 13;
   private static final int BASE_SCROLL = 14;
   private static final int BASE_ICON = 7;
   public static int COL_W;
   public static int COL_GAP;
   public static int HEADER_H;
   public static int ROW_H;
   public static int SETTING_H;
   public static int COLOR_PICKER_H;
   public static int PAD;
   public static int RADIUS;
   public static int TOGGLE_W;
   public static int TOGGLE_H;
   public static int CONTROL_R;
   public static int ACCENT_BAR_W;
   public static int TOP_Y;
   public static int MAX_COL_H;
   public static int WHEEL_R;
   public static int WHEEL_STEP;
   public static int BTN_H;
   public static int BTN_W;
   public static int FIELD_H;
   public static int LABEL_GAP;
   public static int SCROLL_STEP;
   public static int ICON;
   public static float SCALE;
   private static int t0YkIfEuo5;
   private transient int mCeRs5Ayym;
   private static String itizusdgwp = ByteBuffer.wrap(xjobkctykwrwkna()).asCharBuffer().toString();

   private e() {
super();
      int var4 = 308129263 ^ 801460035;
      
      var4 = 1974824301 ^ var4;
      var4 = 1582765604 ^ 1694440963 ^ Integer.parseInt("1921353702");
      this.mCeRs5Ayym = 833084794 ^ t0YkIfEuo5;
      var4 = cmkgojmtjbantnfm(var4, 359341409);
   }

   public static void rescale(int var0, int var1, int var2) {
      int var10 = 1110921628 ^ 6750416 ^ 939730433;
      var10 = 642442689 ^ var10;
      float var6 = 1.0F;
      double var7 = 2.0;
      rescale(var0, var1, var2, var6, var7);
   }

   public static void rescale(int var0, int var1, int var2, float var3) {
      int var11 = 280720093 ^ 647236505 ^ 939730433;
      var11 = 2000402207 ^ var11;
      double var8 = 2.0;
      rescale(var0, var1, var2, var3, var8);
   }

   public static void rescale(int var0, int var1, int var2, float var3, double var4) {
      int var182 = 1246221439 ^ 1080201686 ^ 939730433;
      var182 = 102815596 ^ var182;
      byte var6 = (byte)(872854725 ^ var182);
      int var19 = Math.max(var6, var2);
      short var97 = (short)(872854606 ^ var182);
      int var21 = var19 * var97;
      byte var8 = (byte)(872854725 ^ var182);
      int var99 = var19 - var8;
      byte var170 = (byte)(872854723 ^ var182);
      int var100 = var99 * var170;
      int var22 = var21 + var100;
      float var23 = var22;
      float var101 = 16.0F;
      float var24 = var23 + var101;
      byte var25 = (byte)(872854728 ^ var182);
      short var102 = (short)(872854956 ^ var182);
      short var171 = (short)(872854976 ^ var182);
      int var103 = Math.min((int)var102, (int)var171);
      int var26 = var25 + var103;
      float var27 = var26;
      float var104 = 24.0F;
      float var28 = var27 + var104;
      float var30 = var0;
      float var31 = var30 / var24;
      float var107 = var1;
      float var108 = var107 / var28;
      float var32 = Math.min(var31, var108);
      float var109 = 0.45F;
      float var173 = 1.0F;
      float var34 = Mth.clamp(var32, var109, var173);
      float var35 = 2.0F;
      double var110 = 1.0;
      double var112 = Math.max(var110, var4);
      float var114 = (float)var112;
      float var36 = var35 / var114;
      float var115 = 0.6F;
      float var174 = 1.15F;
      float var38 = Mth.clamp(var36, var115, var174);
      float var40 = var34 * var38;
      float var175 = 0.5F;
      float var177 = 1.5F;
      float var118 = Mth.clamp(var3, var175, var177);
      float var41 = var40 * var118;
      float var119 = 0.6F;
      float var176 = 1.35F;
      float var42 = Mth.clamp(var41, var119, var176);
      SCALE = var42;
      short var44 = (short)(872854606 ^ var182);
      int var45 = sx(var44);
      COL_W = var45;
      byte var46 = (byte)(872854720 ^ var182);
      byte var120 = (byte)(872854723 ^ var182);
      int var121 = sx(var120);
      int var47 = Math.max(var46, var121);
      COL_GAP = var47;
      byte var48 = (byte)(872854742 ^ var182);
      byte var122 = (byte)(872854748 ^ var182);
      int var123 = sx(var122);
      int var49 = Math.max(var48, var123);
      HEADER_H = var49;
      byte var50 = (byte)(872854740 ^ var182);
      byte var124 = (byte)(872854736 ^ var182);
      int var125 = sx(var124);
      int var126 = even(var125);
      int var51 = Math.max(var50, var126);
      ROW_H = var51;
      byte var52 = (byte)(872854748 ^ var182);
      byte var127 = (byte)(872854746 ^ var182);
      int var128 = sx(var127);
      int var53 = Math.max(var52, var128);
      SETTING_H = var53;
      byte var54 = (byte)(872854668 ^ var182);
      byte var129 = (byte)(872854716 ^ var182);
      int var130 = sx(var129);
      int var55 = Math.max(var54, var130);
      COLOR_PICKER_H = var55;
      byte var56 = (byte)(872854720 ^ var182);
      byte var131 = (byte)(872854723 ^ var182);
      int var132 = sx(var131);
      int var57 = Math.max(var56, var132);
      PAD = var57;
      byte var58 = (byte)(872854721 ^ var182);
      byte var133 = (byte)(872854734 ^ var182);
      int var134 = sx(var133);
      int var59 = Math.max(var58, var134);
      RADIUS = var59;
      byte var60 = (byte)(872854734 ^ var182);
      byte var135 = (byte)(872854728 ^ var182);
      int var136 = sx(var135);
      int var137 = even(var136);
      int var61 = Math.max(var60, var137);
      TOGGLE_H = var61;
      int var62 = TOGGLE_H;
      byte var138 = (byte)(872854726 ^ var182);
      int var63 = var62 * var138;
      TOGGLE_W = var63;
      int var64 = TOGGLE_H;
      byte var139 = (byte)(872854726 ^ var182);
      int var65 = var64 / var139;
      CONTROL_R = var65;
      byte var66 = (byte)(872854726 ^ var182);
      byte var140 = (byte)(872854726 ^ var182);
      int var141 = sx(var140);
      int var67 = Math.max(var66, var141);
      ACCENT_BAR_W = var67;
      byte var68 = (byte)(872854720 ^ var182);
      byte var142 = (byte)(872854728 ^ var182);
      int var143 = sx(var142);
      int var69 = Math.max(var68, var143);
      TOP_Y = var69;
      byte var70 = (byte)(872854716 ^ var182);
      short var144 = (short)(872854956 ^ var182);
      int var145 = sx(var144);
      int var71 = Math.max(var70, var145);
      MAX_COL_H = var71;
      byte var72 = (byte)(872854742 ^ var182);
      byte var146 = (byte)(872854754 ^ var182);
      int var147 = sx(var146);
      int var73 = Math.max(var72, var147);
      WHEEL_R = var73;
      float var148 = 0.75F;
      float var190;
      int var75 = (var190 = var42 - var148) == 0.0F ? 0 : (var190 < 0.0F ? -1 : 1);
      byte var76;
      if (var75 < (872854724 ^ var182)) {
         var182 = 790774154 ^ var182;
         var76 = (byte)(455406927 ^ var182);
         var182 = cmkgojmtjbantnfm(var182, 153769029);
      } else {
         var182 = 1724411312 ^ var182;
         var76 = (byte)(1389287798 ^ var182);
         var182 = 1086355583 ^ var182;
      }

      WHEEL_STEP = var76;
      byte var77 = (byte)(302948615 ^ var182);
      byte var149 = (byte)(302948613 ^ var182);
      int var150 = sx(var149);
      int var151 = even(var150);
      int var78 = Math.max(var77, var151);
      BTN_H = var78;
      byte var79 = (byte)(302948613 ^ var182);
      byte var152 = (byte)(302948635 ^ var182);
      int var153 = sx(var152);
      int var154 = even(var153);
      int var80 = Math.max(var79, var154);
      BTN_W = var80;
      byte var81 = (byte)(302948615 ^ var182);
      byte var155 = (byte)(302948613 ^ var182);
      int var156 = sx(var155);
      int var157 = even(var156);
      int var82 = Math.max(var81, var157);
      FIELD_H = var82;
      byte var83 = (byte)(302948609 ^ var182);
      byte var158 = (byte)(302948614 ^ var182);
      int var159 = sx(var158);
      int var84 = Math.max(var83, var159);
      LABEL_GAP = var84;
      byte var85 = (byte)(302948611 ^ var182);
      byte var160 = (byte)(302948613 ^ var182);
      int var161 = sx(var160);
      int var86 = Math.max(var85, var161);
      SCROLL_STEP = var86;
      byte var87 = (byte)(302948622 ^ var182);
      byte var162 = (byte)(302948620 ^ var182);
      int var163 = sx(var162);
      int var164 = even(var163);
      int var88 = Math.max(var87, var164);
      ICON = var88;
      byte var89 = (byte)(302948659 ^ var182);
      int var90 = PAD;
      byte var165 = (byte)(302948617 ^ var182);
      int var91 = var90 * var165;
      int var166 = TOGGLE_W;
      int var92 = var91 + var166;
      byte var167 = (byte)(302948615 ^ var182);
      int var93 = var92 + var167;
      int var94 = var93 + var89;
      int var95 = COL_W;
      if (var95 < var94) {
         var182 = 1634257734 ^ var182;
         COL_W = var94;
         var182 = 1617050842 ^ var182;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var182)) {
               case 50088459:
                  var182 = 17495964 ^ var182;
                  return;
               case 360765681:
               default:
                  throw new RuntimeException(new IOException());
               case 919139045:
                  break;
               case 1794393297:
                  return;
            }
         }
      }
   }

   public static int toggleX(int var0, int var1) {
      int var9 = 430777207 ^ 87468014 ^ 939730433;
      var9 = 490901390 ^ var9;
      int var4 = var0 + var1;
      int var6 = TOGGLE_W;
      return var4 - var6;
   }

   public static int toggleY(int var0) {
      int var10 = 603774591 ^ 1589680728 ^ 939730433;
      var10 = 1336509731 ^ var10;
      int var2 = ROW_H;
      int var3 = TOGGLE_H;
      int var5 = var2 - var3;
      byte var7 = (byte)(177661703 ^ var10);
      int var6 = var5 / var7;
      return var0 + var6;
   }

   public static float bodyFont() {
      int var7 = 1889171922 ^ 349643480 ^ 939730433;
      var7 = 1695709664 ^ var7;
      float var0 = 8.5F;
      float var1 = 10.0F;
      float var2 = SCALE;
      float var4 = var1 * var2;
      return Math.max(var0, var4);
   }

   public static float titleFont() {
      int var7 = 1700770159 ^ 739895386 ^ 939730433;
      var7 = 85997942 ^ var7;
      float var0 = 9.5F;
      float var1 = 11.0F;
      float var2 = SCALE;
      float var4 = var1 * var2;
      return Math.max(var0, var4);
   }

   public static float labelFont() {
      int var7 = 2126286936 ^ 614293922 ^ 939730433;
      var7 = 721765907 ^ var7;
      float var0 = 8.0F;
      float var1 = 9.5F;
      float var2 = SCALE;
      float var4 = var1 * var2;
      return Math.max(var0, var4);
   }

   private static int sx(int var0) {
      int var10 = 1662627072 ^ 613593642 ^ 939730433;
      var10 = 1793166942 ^ var10;
      byte var1 = (byte)(359249780 ^ var10);
      float var5 = var0;
      float var3 = SCALE;
      float var6 = var5 * var3;
      int var7 = Math.round(var6);
      return Math.max(var1, var7);
   }

   private static int even(int var0) {
      int var13 = 1649546845 ^ 365221683 ^ 939730433;
      var13 = 1061438434 ^ var13;
      byte var1 = (byte)(1892787343 ^ var13);
      int var4 = Math.max(var1, var0);
      byte var9 = (byte)(1892787340 ^ var13);
      int var6 = var4 & var9;
      int var7;
      if (var6 == (1892787341 ^ var13)) {
         var13 = 2082981680 ^ var13;
         var7 = var4;
         var13 = 673093587 ^ var13;
      } else {
         var13 = 836135864 ^ var13;
         byte var10 = (byte)(1091030836 ^ var13);
         var7 = var4 + var10;
         var13 = 1710177115 ^ var13;
      }

      return var7;
   }

   static {
      int var28 = 576212188 ^ 476267492 ^ Integer.parseInt("1921353702");
      int var25 = new Random(2079016365939481273L).nextInt();
      t0YkIfEuo5 = -1751056246 ^ var25;
      var28 = 819180324 ^ var28;
      short var0 = (short)(2087533424 ^ var28);
      COL_W = var0;
      byte var1 = (byte)(2087533565 ^ var28);
      COL_GAP = var1;
      byte var2 = (byte)(2087533538 ^ var28);
      HEADER_H = var2;
      byte var3 = (byte)(2087533550 ^ var28);
      ROW_H = var3;
      byte var4 = (byte)(2087533540 ^ var28);
      SETTING_H = var4;
      byte var5 = (byte)(2087533442 ^ var28);
      COLOR_PICKER_H = var5;
      byte var6 = (byte)(2087533565 ^ var28);
      PAD = var6;
      byte var7 = (byte)(2087533552 ^ var28);
      RADIUS = var7;
      byte var8 = (byte)(2087533538 ^ var28);
      TOGGLE_W = var8;
      byte var9 = (byte)(2087533558 ^ var28);
      TOGGLE_H = var9;
      byte var10 = (byte)(2087533564 ^ var28);
      CONTROL_R = var10;
      byte var11 = (byte)(2087533560 ^ var28);
      ACCENT_BAR_W = var11;
      byte var12 = (byte)(2087533558 ^ var28);
      TOP_Y = var12;
      short var13 = (short)(2087533202 ^ var28);
      MAX_COL_H = var13;
      byte var14 = (byte)(2087533532 ^ var28);
      WHEEL_R = var14;
      byte var15 = (byte)(2087533560 ^ var28);
      WHEEL_STEP = var15;
      byte var16 = (byte)(2087533556 ^ var28);
      BTN_H = var16;
      byte var17 = (byte)(2087533546 ^ var28);
      BTN_W = var17;
      byte var18 = (byte)(2087533556 ^ var28);
      FIELD_H = var18;
      byte var19 = (byte)(2087533559 ^ var28);
      LABEL_GAP = var19;
      byte var20 = (byte)(2087533556 ^ var28);
      SCROLL_STEP = var20;
      byte var21 = (byte)(2087533565 ^ var28);
      ICON = var21;
      float var22 = 1.0F;
      SCALE = var22;
   }

   public static String qfqlfccyjb(byte[] var0, int var1) {
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
      String var29 = itizusdgwp;
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

   private static byte[] xjobkctykwrwkna() {
      return new byte[0];
   }

   private static int cmkgojmtjbantnfm(int var0, int var1) {
      return var1 ^ var0;
   }
}
