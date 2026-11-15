package com.wimpyclient.localauth;

import ivirzlaazbgesszx.equlxktebzrxiyte;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

@Environment(EnvType.CLIENT)
public final class f extends Screen {
   private static final int BACKDROP = -435021792;
   private static final int PANEL = -15064532;
   private static final int TRACK = -14273221;
   private static final int ACCENT = -12723049;
   private static final int TEXT = -854278;
   private static final int MUTED = -7362397;
   private volatile String stage;
   private volatile int percent;
   private static int KFHVaG4Sp6;
   private transient int UxFgOB3lpj;

   public f() {
super(Component.literal("Wimpy Client"));
      int var8 = 1740223020 ^ 1684532020;
      String var2 = "Wimpy Client";
      MutableComponent var4 = Component.literal(var2);
      

      while (true) {
         switch (equlxktebzrxiyte.tpabobqnolkrvwps(var8)) {
            case 60846168:
               var8 = 327511388 ^ var8;
            case 851164661:
               var8 = 204433485 ^ 277678999 ^ Integer.parseInt("217667486");
               this.UxFgOB3lpj = 687743185 ^ KFHVaG4Sp6;
               var8 = bsuovooshqpvwxiv(var8, 1667902435);
               String var5 = "Connecting to server";
               this.stage = var5;
               return;
            case 1217255866:
               break;
            case 1927247717:
            default:
               throw new IllegalStateException();
         }
      }
   }

   public void update(String var1, Integer var2) {
      int var19 = 2128241998 ^ 1673705491 ^ 1580572144;
      var19 = 1799204139 ^ var19;
      if (var1 != null) {
         var19 ^= 1640381800;
         boolean var8 = var1.isBlank();
         if (!var8) {
            var19 = 1977505041 ^ var19;
            this.stage = var1;
            var19 = 2011357172 ^ var19;
         } else {
            label24:
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var19)) {
                  case 252738843:
                     var19 ^= 37522149;
                     break label24;
                  case 600304116:
                  default:
                     throw new IllegalStateException();
                  case 2063404371:
                     break;
                  case 2123736267:
                     break label24;
               }
            }
         }
      } else {
         label31:
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var19)) {
               case 228647971:
                  var19 ^= 1677375373;
               case 801686060:
                  break label31;
               case 1466202733:
                  break;
               case 1764201596:
               default:
                  throw new IllegalStateException();
            }
         }
      }

      if (var2 != null) {
         var19 = 200117098 ^ var19;
         int var13 = var2;
         long var14 = var13;
         byte var5 = 0;
         byte var6 = 100;
         int var16 = Math.clamp(var14, (int)var5, (int)var6);
         this.percent = var16;
         var19 = 137608708 ^ var19;
      } else {
         var19 = 64894318 ^ var19;
      }
   }

   public void render(GuiGraphics var1, int var2, int var3, float var4) {
      int var243 = 816128383 ^ 1678976283 ^ 1580572144;
      var243 = 171455168 ^ var243;
      byte var6 = 0;
      byte var7 = 0;
      int var150 = this.width;
      int var175 = this.height;
      int var10 = -435021792;
      var1.fill(var6, var7, var150, var175, var10);
      short var25 = 390;
      short var78 = 250;
      int var124 = this.width;
      byte var151 = 32;
      int var125 = var124 - var151;
      int var79 = Math.max(var78, var125);
      int var26 = Math.min(var25, var79);
      int var28 = this.width;
      int var29 = var28 - var26;
      byte var81 = 2;
      int var30 = var29 / var81;
      int var32 = this.height;
      short var82 = 154;
      int var33 = var32 - var82;
      byte var83 = 2;
      int var34 = var33 / var83;
      int var153 = var30 + var26;
      short var211 = 154;
      int var178 = var34 + var211;
      int var212 = -15064532;
      var1.fill(var30, var34, var153, var178, var212);
      short var179 = 154;
      int var213 = -13352116;
      var1.renderOutline(var30, var34, var26, var179, var213);
      byte var180 = 3;
      int var156 = var30 + var180;
      short var214 = 154;
      int var182 = var34 + var214;
      int var215 = -12723049;
      var1.fill(var30, var34, var156, var182, var215);
      Font var88 = this.font;
      String var129 = lnhsfruplr(vjcymbyrgvbjbwj(), gjwcutthffeffaw(), var243);
      int var158 = this.width;
      byte var183 = 2;
      int var159 = var158 / var183;
      byte var216 = 23;
      int var185 = var34 + var216;
      int var217 = -854278;
      var1.drawCenteredString(var88, var129, var159, var185, var217);
      long var39 = System.nanoTime();
      double var41 = var39;
      double var130 = 1.0E9;
      double var43 = var41 / var130;
      double var132 = 3.6;
      double var45 = var43 * var132;
      double var15 = var45;
      int var48 = this.width;
      byte var89 = 2;
      int var49 = var48 / var89;
      int var17 = var49;
      byte var90 = 64;
      int var51 = var34 + var90;
      int var18 = var51;
      byte var52 = 0;
      int var19 = var52;
      var243 = 217000853 ^ var243;

      while (true) {
         byte var91 = 12;
         if (var19 >= var91) {
            var243 = 923494597 ^ var243;
            byte var92 = 25;
            int var55 = var30 + var92;
            byte var93 = 50;
            int var57 = var26 - var93;
            byte var94 = 103;
            int var59 = var34 + var94;
            int var161 = var55 + var57;
            byte var218 = 7;
            int var188 = var59 + var218;
            int var219 = -14273221;
            var1.fill(var55, var59, var161, var188, var219);
            int var221 = this.percent;
            int var190 = var57 * var221;
            float var191 = var190;
            float var222 = 100.0F;
            float var192 = var191 / var222;
            int var193 = Math.round(var192);
            int var163 = var55 + var193;
            byte var223 = 7;
            int var195 = var59 + var223;
            int var224 = -12723049;
            var1.fill(var55, var59, var163, var195, var224);
            Font var98 = this.font;
            String var137 = this.stage;
            byte var225 = 121;
            int var197 = var34 + var225;
            int var226 = -7362397;
            boolean var11 = false;
            var1.drawString(var98, var137, var55, var197, var226, var11);
            int var64 = this.percent;
            String var65 = var64 + "%";
            Font var100 = this.font;
            int var166 = var55 + var57;
            Font var200 = this.font;
            int var201 = var200.width(var65);
            int var167 = var166 - var201;
            byte var228 = 121;
            int var203 = var34 + var228;
            int var229 = -854278;
            boolean var234 = false;
            var1.drawString(var100, var65, var167, var203, var229, var234);
            return;
         }

         var243 = 557951870 ^ var243;
         double var140 = var19;
         double var204 = Math.PI;
         double var142 = var140 * var204;
         double var206 = 6.0;
         double var144 = var142 / var206;
         double var69 = var15 + var144;
         double var103 = Math.cos(var69);
         double var168 = 13.0;
         double var105 = var103 * var168;
         long var107 = Math.round(var105);
         int var109 = (int)var107;
         int var72 = var17 + var109;
         double var112 = Math.sin(var69);
         double var170 = 13.0;
         double var114 = var112 * var170;
         long var116 = Math.round(var114);
         int var118 = (int)var116;
         int var74 = var18 + var118;
         byte var75 = 60;
         byte var146 = 15;
         int var120 = var19 * var146;
         int var76 = var75 + var120;
         byte var147 = 2;
         int var122 = var72 - var147;
         byte var172 = 2;
         int var149 = var74 - var172;
         byte var208 = 2;
         int var174 = var72 + var208;
         byte var230 = 2;
         int var210 = var74 + var230;
         byte var235 = 24;
         int var232 = var76 << var235;
         int var236 = 4054167;
         int var233 = var232 | var236;
         var1.fill(var122, var149, var174, var210, var233);
         var19++;
         var243 = bsuovooshqpvwxiv(var243, 557951870);
      }
   }

   public boolean isPauseScreen() {
      int var4 = 2014780855 ^ 689796732 ^ 1580572144;
      var4 = 1026233197 ^ var4;
      return false;
   }

   public boolean shouldCloseOnEsc() {
      int var4 = 114774703 ^ 204989156 ^ 1580572144;
      var4 = 1891178275 ^ var4;
      return false;
   }

   static {
      int var3 = new Random(6628493225583606012L).nextInt();
      KFHVaG4Sp6 = -207540434 ^ var3;
   }

   public static String lnhsfruplr(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] gjwcutthffeffaw() {
      return new byte[]{
         63,
         82,
         121,
         115,
         103,
         100,
         100,
         85,
         69,
         87,
         87,
         120,
         99,
         120,
         119,
         21,
         105,
         60,
         93,
         100,
         76,
         14,
         46,
         51,
         27,
         37,
         108,
         120,
         15,
         14,
         99,
         89,
         66,
         48,
         7,
         104,
         107,
         110,
         5,
         124,
         49,
         71,
         120,
         63,
         35,
         74,
         106,
         109,
         35,
         15,
         11,
         105,
         29,
         122,
         34,
         23,
         113,
         3,
         39,
         21,
         49,
         27,
         92,
         90,
         104,
         59,
         112,
         15,
         20,
         8
      };
   }

   private static byte[] vjcymbyrgvbjbwj() {
      return new byte[]{-16, -97, 75, 29, 94, 29, 93, 42, 116, 53, 101, 24, 90, 104, 78, 100, 88, 66, 111, 20, 117, 123, 23, 79, 42, 67};
   }

   private static int bsuovooshqpvwxiv(int var0, int var1) {
      return var1 ^ var0;
   }
}
