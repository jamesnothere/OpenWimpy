package com.wimpyclient.localauth;

import ivirzlaazbgesszx.equlxktebzrxiyte;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button.Builder;
import net.minecraft.client.gui.components.Button.OnPress;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

@Environment(EnvType.CLIENT)
public final class c extends Screen {
   private static final int BACKDROP = -435021792;
   private static final int PANEL = -15064532;
   private static final int TEXT = -854278;
   private static final int MUTED = -7362397;
   private static final int ACCENT = -12723049;
   private static final int ERROR = -30070;
   private final Screen parent;
   private final String initialStatus;
   private EditBox keyBox;
   private String status;
   private static int f1fXEyN3GSQ;
   private transient int f4FpVBLlnin;
   private static byte[] eojjfdcgfm = xqkfycdmvzdwvmk();

   public c(Screen var1, String var2) {
super(Component.literal("Wimpy Client"));
      int var15 = 1473655391 ^ 1667254044;
      String var4 = "Wimpy Client";
      MutableComponent var8 = Component.literal(var4);
      

      String var12;
      label40:
      while (true) {
         switch (equlxktebzrxiyte.tpabobqnolkrvwps(var15)) {
            case 102872967:
               var15 = 992342421 ^ var15;
            case 2096847543:
               var15 = 470271346 ^ 402673587 ^ Integer.parseInt("194252311");
               this.f4FpVBLlnin = 979671842 ^ f1fXEyN3GSQ;

               label37:
               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var15)) {
                     case 107895107:
                        break;
                     case 237887181:
                        var15 ^= 690808138;
                     case 459859049:
                        break label37;
                     case 481223832:
                     default:
                        throw new RuntimeException();
                  }
               }

               this.parent = var1;
               this.initialStatus = var2;
               if (var2 == null) {
                  var15 = 658867099 ^ var15;
                  var12 = "";
                  var15 = bachzjjrnnutbyiq(var15, 66078978);
                  break label40;
               }

               label29:
               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var15)) {
                     case 185789345:
                        var15 ^= 1403721675;
                        break label29;
                     case 1097398652:
                     default:
                        throw new RuntimeException();
                     case 1259690827:
                        break;
                     case 1990347333:
                        break label29;
                  }
               }

               var12 = var2;
               var15 = 1998511442 ^ var15;
               break label40;
            case 1505194449:
               break;
            case 1510366270:
            default:
               throw new RuntimeException();
         }
      }

      this.status = var12;
   }

   Screen parent() {
      int var5 = 818886389 ^ 1563852814 ^ 113569945;
      var5 = 2000981908 ^ var5;
      return this.parent;
   }

   protected void init() {
      int var83 = 2125954258 ^ 2025006744 ^ 113569945;
      var83 = 1331597974 ^ var83;
      short var1 = 420;
      short var2 = 280;
      int var58 = this.width;
      byte var4 = 40;
      int var59 = var58 - var4;
      int var38 = Math.max(var2, var59);
      int var13 = Math.min(var1, var38);
      int var15 = this.width;
      int var16 = var15 - var13;
      byte var40 = 2;
      int var17 = var16 / var40;
      int var19 = this.height;
      short var41 = 168;
      int var20 = var19 - var41;
      byte var42 = 2;
      int var21 = var20 / var42;
      Font var65 = this.font;
      byte var6 = 20;
      int var69 = var17 + var6;
      byte var7 = 72;
      int var74 = var21 + var7;
      byte var8 = 40;
      int var78 = var13 - var8;
      byte var79 = 20;
      String var9 = jhtsdlcprb(prjpetoikonxtka(), var83);
      MutableComponent var80 = Component.literal(var9);
      EditBox var43 = new EditBox(var65, var69, var74, var78, var79, var80);
      this.keyBox = var43;
      EditBox var24 = this.keyBox;
      short var44 = 128;
      var24.setMaxLength(var44);
      EditBox var26 = this.keyBox;
      String var45 = jhtsdlcprb(cdwkgdfztojocrh(), var83);
      MutableComponent var46 = Component.literal(var45);
      var26.setHint(var46);
      EditBox var48 = this.keyBox;
      GuiEventListener var28 = this.addRenderableWidget(var48);
      String var49 = jhtsdlcprb(taafoqhdtbxehsx(), var83);
      MutableComponent var50 = Component.literal(var49);
      OnPress var61 = var1x -> {
         int var5 = 2043986246 ^ 1339487886 ^ 113569945;
         var5 = 667438533 ^ var5;
         this.submit();
      };
      Builder var51 = Button.builder(var50, var61);
      byte var66 = 20;
      int var63 = var17 + var66;
      byte var70 = 100;
      int var68 = var21 + var70;
      byte var75 = 40;
      int var72 = var13 - var75;
      byte var76 = 20;
      Builder var52 = var51.bounds(var63, var68, var72, var76);
      Button var53 = var52.build();
      GuiEventListener var30 = this.addRenderableWidget(var53);
      EditBox var55 = this.keyBox;
      this.setInitialFocus(var55);
      String var33 = this.initialStatus;
      if (var33 != null) {
         var83 = 292640190 ^ var83;
         String var35 = this.initialStatus;
         boolean var36 = var35.isBlank();
         if (!var36) {
            var83 = 1831291545 ^ var83;
            String var57 = this.initialStatus;
            this.status = var57;
            var83 = 1958140207 ^ var83;
         } else {
            var83 = 428970934 ^ var83;
         }
      } else {
         var83 = bachzjjrnnutbyiq(var83, 148948488);
      }
   }

   public void render(GuiGraphics var1, int var2, int var3, float var4) {
      int var123 = 1155673885 ^ 1744915037 ^ 113569945;
      var123 = 1004078270 ^ var123;
      byte var6 = 0;
      byte var7 = 0;
      int var67 = this.width;
      int var87 = this.height;
      int var10 = -435021792;
      var1.fill(var6, var7, var67, var87, var10);
      short var14 = 420;
      short var37 = 280;
      int var56 = this.width;
      byte var68 = 40;
      int var57 = var56 - var68;
      int var38 = Math.max(var37, var57);
      int var15 = Math.min(var14, var38);
      int var17 = this.width;
      int var18 = var17 - var15;
      byte var40 = 2;
      int var19 = var18 / var40;
      int var21 = this.height;
      short var41 = 168;
      int var22 = var21 - var41;
      byte var42 = 2;
      int var23 = var22 / var42;
      int var70 = var19 + var15;
      short var108 = 168;
      int var90 = var23 + var108;
      int var109 = -15064532;
      var1.fill(var19, var23, var70, var90, var109);
      short var91 = 168;
      int var110 = -13352116;
      var1.renderOutline(var19, var23, var15, var91, var110);
      byte var92 = 3;
      int var73 = var19 + var92;
      short var111 = 168;
      int var94 = var23 + var111;
      int var112 = -12723049;
      var1.fill(var19, var23, var73, var94, var112);
      Font var47 = this.font;
      String var61 = jhtsdlcprb(pltaqsocvuxxqbz(), var123);
      int var75 = this.width;
      byte var95 = 2;
      int var76 = var75 / var95;
      byte var113 = 18;
      int var97 = var23 + var113;
      int var114 = -854278;
      var1.drawCenteredString(var47, var61, var76, var97, var114);
      Font var49 = this.font;
      String var62 = jhtsdlcprb(glakanpyzdzuudu(), var123);
      int var78 = this.width;
      byte var98 = 2;
      int var79 = var78 / var98;
      byte var115 = 40;
      int var100 = var23 + var115;
      int var116 = -7362397;
      var1.drawCenteredString(var49, var62, var79, var100, var116);
      super.render(var1, var2, var3, var4);
      String var31 = this.status;
      if (var31 != null) {
         var123 = 1346990536 ^ var123;
         String var33 = this.status;
         boolean var34 = var33.isBlank();
         if (!var34) {
            var123 = 1616738572 ^ var123;
            Font var52 = this.font;
            String var65 = this.status;
            int var82 = this.width;
            byte var102 = 2;
            int var83 = var82 / var102;
            short var117 = 132;
            int var104 = var23 + var117;
            short var118 = -30070;
            var1.drawCenteredString(var52, var65, var83, var104, var118);
            var123 = 1444471150 ^ var123;
            return;
         }

         var123 = 390739097 ^ var123;
      } else {
         var123 = bachzjjrnnutbyiq(var123, 1191396689);
      }

      Font var54 = this.font;
      String var66 = jhtsdlcprb(xaylwtwrjmlwqty(), var123);
      int var85 = this.width;
      byte var105 = 2;
      int var86 = var85 / var105;
      short var119 = 132;
      int var107 = var23 + var119;
      int var120 = -7362397;
      var1.drawCenteredString(var54, var66, var86, var107, var120);
      var123 = 554675451 ^ var123;
   }

   public boolean keyPressed(KeyEvent var1) {
      int var15 = 1044251110 ^ 1310764985 ^ 113569945;
      var15 = 2111690141 ^ var15;
      int var4 = var1.key();
      short var3 = 257;
      if (var4 != var3) {
         var15 = 1545848246 ^ var15;
         int var6 = var1.key();
         short var11 = 335;
         if (var6 != var11) {
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var15)) {
                  case 148246479:
                     var15 = 673187675 ^ var15;
                  case 1936227935:
                     return super.keyPressed(var1);
                  case 583080563:
                  default:
                     throw new RuntimeException(new IOException());
                  case 2109204075:
               }
            }
         }

         var15 = 167695366 ^ var15;
      } else {
         var15 = bachzjjrnnutbyiq(var15, 1440551344);
      }

      this.submit();
      return true;
   }

   public void onClose() {
      int var7 = 828737777 ^ 1819082525 ^ 113569945;
      var7 = 1350991499 ^ var7;
      Minecraft var3 = this.minecraft;
      Screen var4 = this.parent;
      var3.setScreen(var4);
   }

   private void submit() {
      int var18 = 1619135248 ^ 1219995729 ^ 113569945;
      var18 = 1117256808 ^ var18;
      EditBox var4 = this.keyBox;
      String var5 = var4.getValue();
      if (var5 != null) {
         var18 = 1707138111 ^ var18;
         boolean var8 = var5.isBlank();
         if (!var8) {
            label27:
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var18)) {
                  case 45250115:
                     var18 ^= 1546751631;
                     break label27;
                  case 448572888:
                     break;
                  case 457488930:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1567671008:
                     break label27;
               }
            }

            String var14 = jhtsdlcprb(monvhknxpgugayh(), var18);
            this.status = var14;
            boolean var12 = WimpyLoader.requestActivation(var5);
            if (!var12) {
               var18 = 1549428048 ^ var18;
               String var15 = jhtsdlcprb(gjjmabtdntirjue(), var18);
               this.status = var15;
               var18 = 60635512 ^ var18;
            } else {
               var18 = bachzjjrnnutbyiq(var18, 1606900776);
            }

            return;
         }

         var18 = 1687879478 ^ var18;
      } else {
         label37:
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var18)) {
               case 33986563:
                  var18 ^= 22684425;
                  break label37;
               case 400194106:
                  break;
               case 1304083710:
               default:
                  throw new RuntimeException(new IOException());
               case 1648039015:
                  break label37;
            }
         }
      }

      String var2 = jhtsdlcprb(fwehjzewhzyijdd(), var18);
      this.status = var2;
   }

   static {
      int var3 = new Random(7637201924758017311L).nextInt();
      f1fXEyN3GSQ = -319275791 ^ var3;
   }

   public static String jhtsdlcprb(byte[] var0, int var1) {
      String var10 = Integer.toString(var1);
      byte[] var11 = var10.getBytes();
      byte[] var8 = var11;
      byte var12 = 0;
      int var9 = var12;

      while (true) {
         int var17 = var0.length;
         if (var9 >= var17) {
            Charset var5 = StandardCharsets.UTF_16;
            return new String(var0, var5);
         }

         byte var20 = var0[var9];
         int var33 = var8.length;
         int var30 = var9 % var33;
         byte var27 = var8[var30];
         int var21 = var20 ^ var27;
         byte var22 = (byte)var21;
         var0[var9] = var22;
         byte var23 = var0[var9];
         byte[] var28 = eojjfdcgfm;
         byte[] var34 = eojjfdcgfm;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] xqkfycdmvzdwvmk() {
      return new byte[]{
         33,
         55,
         108,
         84,
         23,
         13,
         75,
         75,
         71,
         49,
         7,
         73,
         3,
         101,
         61,
         20,
         103,
         33,
         72,
         72,
         120,
         100,
         5,
         85,
         49,
         45,
         73,
         110,
         4,
         34,
         65,
         105,
         47,
         12,
         72,
         87,
         26,
         58,
         89,
         78,
         88,
         45,
         124,
         94,
         39,
         124,
         46,
         50,
         61,
         77,
         58,
         104,
         125,
         77,
         81,
         18,
         49,
         106,
         46,
         124,
         97,
         6,
         16,
         21,
         96,
         109,
         116,
         50,
         24,
         59,
         119,
         33,
         85,
         120,
         41,
         27,
         45,
         90,
         10,
         47,
         47,
         127,
         37,
         116,
         105,
         9,
         114,
         69,
         61,
         32,
         80,
         43,
         27,
         17,
         4,
         82
      };
   }

   private static byte[] prjpetoikonxtka() {
      return new byte[]{-18, -5, 95, 45, 32, 82, 114, 25, 114, 99, 54, 20, 48, 35, 10, 71, 94, 48, 125, 20, 73, 50, 54, 25};
   }

   private static byte[] cdwkgdfztojocrh() {
      return new byte[]{-18, -5, 95, 49, 32, 90, 114, 9, 114, 114, 54, 31, 48, 112, 10, 91, 94, 127, 125, 10, 73, 37, 54, 64, 6, 112, 112, 58, 49, 108};
   }

   private static byte[] taafoqhdtbxehsx() {
      return new byte[]{-18, -5, 95, 52, 32, 85, 114, 22, 114, 105, 54, 25, 48, 59};
   }

   private static byte[] xaylwtwrjmlwqty() {
      return new byte[]{-18, -4, 89, 40, 35, 73, 126, 29, 118, 33, 54, 9, 54, 51, 9, 3, 82, 119, 121, 25, 73, 62, 48, 15, 5, 127, 124, 55};
   }

   private static byte[] pltaqsocvuxxqbz() {
      return new byte[]{-20, -8, 93, 59, 46, 114, 123, 53, 126, 82, 55, 33, 59, 124, 11, 103, 84, 84, 123, 49, 73, 25, 60, 45, 1, 74};
   }

   private static byte[] glakanpyzdzuudu() {
      return new byte[]{
         -20,
         -8,
         93,
         41,
         46,
         85,
         123,
         12,
         126,
         103,
         55,
         10,
         59,
         124,
         11,
         93,
         84,
         119,
         123,
         13,
         73,
         46,
         60,
         67,
         1,
         114,
         112,
         52,
         52,
         112,
         121,
         53,
         25,
         82,
         123,
         29,
         41,
         111,
         104,
         86,
         97,
         112,
         76,
         8,
         30,
         54,
         30,
         35,
         5,
         0,
         12,
         55,
         78,
         84,
         98,
         78,
         0,
         61,
         23,
         43,
         81,
         81,
         41,
         6,
         80,
         40,
         76,
         99,
         46,
         110,
         68,
         56,
         102,
         43,
         24,
         79,
         20,
         5,
         58,
         121,
         22,
         34,
         21,
         49,
         81,
         30
      };
   }

   private static byte[] gjjmabtdntirjue() {
      return new byte[]{
         -18,
         -2,
         88,
         33,
         33,
         21,
         115,
         17,
         113,
         101,
         49,
         4,
         55,
         115,
         5,
         69,
         86,
         100,
         121,
         94,
         76,
         49,
         51,
         1,
         9,
         110,
         127,
         58,
         50,
         119,
         117,
         59,
         23,
         77,
         121,
         65,
         43,
         110,
         109,
         31,
         110,
         124,
         68,
         1,
         17,
         42,
         24,
         38,
         9,
         24,
         2,
         56,
         76,
         30,
         96,
         71,
         5,
         53,
         24,
         33,
         89,
         83,
         38,
         10
      };
   }

   private static byte[] fwehjzewhzyijdd() {
      return new byte[]{
         -18,
         -16,
         95,
         54,
         33,
         84,
         127,
         15,
         117,
         124,
         54,
         20,
         48,
         119,
         11,
         77,
         83,
         54,
         122,
         26,
         73,
         57,
         54,
         30,
         7,
         53,
         125,
         63,
         54,
         114,
         112,
         35,
         28,
         77,
         126,
         27,
         46,
         35
      };
   }

   private static byte[] monvhknxpgugayh() {
      return new byte[]{
         -18, -4, 95, 33, 39, 87, 127, 30, 113, 102, 54, 22, 48, 58, 13, 72, 83, 118, 126, 92, 73, 59, 54, 6, 1, 102, 125, 112, 50, 56, 112, 115
      };
   }

   private static int bachzjjrnnutbyiq(int var0, int var1) {
      return var1 ^ var0;
   }
}
