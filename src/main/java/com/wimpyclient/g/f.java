package com.wimpyclient.g;

import com.mojang.blaze3d.platform.Window;
import com.wimpyclient.i.aj;
import com.wimpyclient.p.q;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.ItemStack;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWDropCallback;
import org.lwjgl.glfw.GLFWDropCallbackI;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class f {
   public static final f INSTANCE;
   private static final int ROW_H = 20;
   private static final int ICON = 16;
   private boolean open;
   private int scroll;
   private int panelX;
   private int panelY;
   private int panelW;
   private int panelH;
   private int listX;
   private int listY;
   private int listW;
   private int listH;
   private int browseX;
   private int clearX;
   private int startX;
   private int stopX;
   private int closeX;
   private int buttonY;
   private int buttonW;
   private int buttonH;
   private long dropWindow;
   private GLFWDropCallback previousDrop;
   private boolean dropHooked;
   private List<com.wimpyclient.u.b$a> iconRows;
   private int iconVisible;
   private int iconScroll;
   private static int XyAqSQYx06;
   private transient int RWqFCey5oh;
   private static byte[] uekdbkmwgz = hnydkqunrwhvhdx();

   private f() {
super();
      int var6 = 1589656672 ^ 1917808070;
      

      label25:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var6)) {
            case 106267326:
               var6 = 1462611653 ^ var6;
            case 1861210080:
               var6 = 1842898566 ^ 354026169 ^ Integer.parseInt("56662876");
               this.RWqFCey5oh = 1158789722 ^ XyAqSQYx06;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var6)) {
                     case 260814189:
                        var6 = 608346385 ^ var6;
                        break label25;
                     case 798156972:
                        break;
                     case 1296385087:
                     default:
                        throw new IllegalStateException();
                     case 1654110162:
                        break label25;
                  }
               }
            case 621458260:
               break;
            case 1378543152:
            default:
               throw new IllegalStateException();
         }
      }

      List var2 = List.of();
      this.iconRows = var2;
   }

   public boolean isOpen() {
      int var5 = 517262320 ^ 2040814628 ^ 1867332251;
      var5 = 827642835 ^ var5;
      return this.open;
   }

   public void open() {
      int var15 = 1570699308 ^ 127872553 ^ 1867332251;
      var15 = 1605908028 ^ var15;
      byte var2 = (byte)(1794431651 ^ var15);
      this.open = (var2 != 0);
      byte var11 = (byte)(1794431650 ^ var15);
      this.scroll = var11;
      this.hookDrop();
      Minecraft var6 = Minecraft.getInstance();
      if (var6 != null) {
         var15 = 1428415238 ^ var15;
         g var8 = g.INSTANCE;
         byte var9 = (byte)((var8.isOpen()) ? 1 : 0);
         if (var9 == (1071069604 ^ var15)) {
            var15 = 1520081832 ^ var15;
            g var10 = g.INSTANCE;
            var10.open(var6);
            var15 = 66799214 ^ var15;
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
                  case 196132986:
                     var15 = 1499585990 ^ var15;
                     return;
                  case 436051008:
                     break;
                  case 1401751699:
                     return;
                  case 1927215820:
                  default:
                     throw new IllegalStateException();
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
               case 255462765:
                  var15 = 205668032 ^ var15;
                  return;
               case 674072729:
                  return;
               case 674824933:
                  break;
               case 1640382473:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   public void close() {
      int var6 = 1766321349 ^ 1337028752 ^ 1867332251;
      var6 = 1994612930 ^ var6;
      byte var2 = (byte)(1062782476 ^ var6);
      this.open = (var2 != 0);
      this.unhookDrop();
   }

   public void toggle() {
      int var7 = 426436519 ^ 146553585 ^ 1867332251;
      var7 = 1519317299 ^ var7;
      byte var2 = (byte)((this.open) ? 1 : 0);
      if (var2 == (605361918 ^ var7)) {
         var7 = 1811633479 ^ var7;
         this.open();
         var7 = 1107501258 ^ var7;
      } else {
         var7 = 815491100 ^ var7;
         this.close();

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var7)) {
               case 98462594:
                  return;
               case 131334491:
                  var7 = 425926033 ^ var7;
                  return;
               case 1446021647:
                  break;
               case 1711908194:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }
   }

   public void render(com.wimpyclient.m.b var1, int var2, int var3, float var4, float var5) {
      int var392 = 609855364 ^ 1308070596 ^ 1867332251;
      var392 = 384806053 ^ var392;
      byte var33 = (byte)((this.open) ? 1 : 0);
      if (var33 == (269263742 ^ var392)) {
         var392 = 625567863 ^ var392;
      } else {
         com.wimpyclient.o.b var16;
         label127: {
            var392 = 1476757373 ^ var392;
            int var121 = (int)var4;
            int var195 = (int)var5;
            this.layout(var121, var195);
            com.wimpyclient.o.b var35 = com.wimpyclient.o.b.INSTANCE;
            var16 = var35;
            float var122 = 0.0F;
            float var196 = 0.0F;
            float var11 = 0.0F;
            int var12 = -1224137725 ^ var392;
            float var13 = 0.55F;
            int var348 = com.wimpyclient.p.g.withAlpha(var12, var13);
            var1.rect(var122, var196, var4, var5, var11, var348);
            int var38 = this.panelX;
            float var39 = var38;
            int var41 = this.panelY;
            float var42 = var41;
            int var44 = this.panelW;
            float var45 = var44;
            int var47 = this.panelH;
            float var48 = var47;
            float var257 = 2.0F;
            float var198 = var42 + var257;
            float var330 = 10.0F;
            float var349 = 8.0F;
            int var362 = var35.accent();
            float var14 = 0.16F;
            int var363 = com.wimpyclient.p.g.withAlpha(var362, var14);
            var1.glow(var39, var198, var45, var48, var330, var349, var363);
            float var331 = 10.0F;
            int var351 = var35.background();
            int var365 = var35.backgroundTo();
            byte var377 = (byte)(1208558594 ^ var392);
            var1.rectGradient(var39, var42, var45, var48, var331, var351, var365, (var377 != 0));
            float var332 = 10.0F;
            float var352 = 1.2F;
            int var367 = var35.accent();
            float var378 = 0.55F;
            int var368 = com.wimpyclient.p.g.withAlpha(var367, var378);
            var1.rectOutline(var39, var42, var45, var48, var332, var352, var368);
            float var201 = 16.0F;
            float var127 = var39 + var201;
            float var261 = 22.0F;
            float var203 = var42 + var261;
            float var262 = 15.0F;
            int var302 = var35.textPrimary();
            String var333 = nqvryaagjb(vzdxeggyrgcedru(), var392);
            float var53 = var1.text(var127, var203, var262, var302, var333);
            aj var54 = aj.INSTANCE;
            com.wimpyclient.u.c var56 = var54.schematic();
            String var119;
            if (var56 == null) {
               var392 = 262643426 ^ var392;
               var119 = nqvryaagjb(byidaontzjxxhtc(), var392);

               label112:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var392)) {
                     case 92245064:
                        break;
                     case 182635965:
                        var392 ^= 1287278361;
                     case 494162998:
                        break label112;
                     case 1940290064:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            } else {
               var392 = ekaklckthqlvaysw(var392, 1395831916);
               String var59 = var56.name();
               int var129 = var56.sizeX();
               int var205 = var56.sizeY();
               int var264 = var56.sizeZ();
               var119 = var59 + "  \u00b7  " + var129 + "\u00d7" + var205 + "\u00d7" + var264;
               var392 = 271541655 ^ var392;
            }

            float var206 = 16.0F;
            float var131 = var39 + var206;
            float var265 = 42.0F;
            float var208 = var42 + var265;
            float var266 = 11.5F;
            int var304 = var35.textMuted();
            float var61 = var1.text(var131, var208, var266, var304, var119);
            float var209 = 16.0F;
            float var133 = var39 + var209;
            float var267 = 58.0F;
            float var211 = var42 + var267;
            float var268 = 11.0F;
            int var306 = var54.statusColor();
            String var336 = var54.status();
            float var63 = var1.text(var133, var211, var268, var306, var336);
            int var135 = this.listX;
            float var136 = var135;
            int var213 = this.listY;
            float var214 = var213;
            int var270 = this.listW;
            float var271 = var270;
            int var308 = this.listH;
            float var309 = var308;
            float var337 = 6.0F;
            int var354 = var35.field();
            var1.rect(var136, var214, var271, var309, var337, var354);
            int var138 = this.listX;
            float var139 = var138;
            int var216 = this.listY;
            float var217 = var216;
            int var273 = this.listW;
            float var274 = var273;
            int var311 = this.listH;
            float var312 = var311;
            float var338 = 6.0F;
            float var355 = 1.0F;
            int var370 = var35.accent();
            float var379 = 0.25F;
            int var371 = com.wimpyclient.p.g.withAlpha(var370, var379);
            var1.rectOutline(var139, var217, var274, var312, var338, var355, var371);
            Minecraft var66 = Minecraft.getInstance();
            LocalPlayer var141 = var66.player;
            List var68 = var54.materialRows(var141);
            List var25 = var68;
            byte var69 = (byte)(185923065 ^ var392);
            int var143 = this.listH;
            byte var218 = (byte)(185923052 ^ var392);
            int var144 = var143 / var218;
            int var70 = Math.max(var69, var144);
            int var26 = var70;
            byte var71 = (byte)(185923064 ^ var392);
            int var146 = var68.size();
            int var147 = var146 - var70;
            int var72 = Math.max(var71, var147);
            byte var148 = (byte)(185923064 ^ var392);
            int var221 = this.scroll;
            int var222 = Math.min(var221, var72);
            int var149 = Math.max(var148, var222);
            this.scroll = var149;
            this.iconRows = var68;
            this.iconVisible = var70;
            int var153 = this.scroll;
            this.iconScroll = var153;
            if (var56 == null) {
               var392 = 981244246 ^ var392;
               int var192 = this.listX;
               byte var252 = (byte)(828927140 ^ var392);
               int var193 = var192 + var252;
               float var194 = var193;
               int var254 = this.listY;
               byte var296 = (byte)(828927160 ^ var392);
               int var255 = var254 + var296;
               float var256 = var255;
               float var297 = 12.0F;
               int var329 = var35.textMuted();
               String var347 = nqvryaagjb(sjysqzflsmwowwx(), var392);
               float var118 = var1.text(var194, var256, var297, var329, var347);

               label82:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var392)) {
                     case 263873529:
                        var392 ^= 1427109918;
                        break label82;
                     case 333940047:
                        break;
                     case 1594735195:
                     default:
                        throw new RuntimeException(new IOException());
                     case 2076671189:
                        break label82;
                  }
               }
            } else {
               var392 = ekaklckthqlvaysw(var392, 986141150);
               byte var79 = (byte)((var68.isEmpty()) ? 1 : 0);
               if (var79 != (835953702 ^ var392)) {
                  var392 = 626076771 ^ var392;
                  int var155 = this.listX;
                  byte var223 = (byte)(344098895 ^ var392);
                  int var156 = var155 + var223;
                  float var157 = var156;
                  int var225 = this.listY;
                  byte var276 = (byte)(344098899 ^ var392);
                  int var226 = var225 + var276;
                  float var227 = var226;
                  float var277 = 12.0F;
                  int var314 = var35.textMuted();
                  String var339 = nqvryaagjb(suqtzsdkhhfaxbn(), var392);
                  float var81 = var1.text(var157, var227, var277, var314, var339);
                  var392 = ekaklckthqlvaysw(var392, 1894063349);
               } else {
                  var392 = ekaklckthqlvaysw(var392, 1798233729);
                  byte var97 = (byte)(1526561447 ^ var392);
                  int var389 = var97;
                  var392 = 998093495 ^ var392;

                  while (true) {
                     if (var389 >= var26) {
                        var392 = ekaklckthqlvaysw(var392, 99048608);
                        break;
                     }

                     var392 = 1561357813 ^ var392;
                     int var175 = this.scroll;
                     int var100 = var389 + var175;
                     int var177 = var25.size();
                     if (var100 >= var177) {
                        var392 = 1492595029 ^ var392;
                        break;
                     }

                     var392 = 155735394 ^ var392;
                     int var244 = this.scroll;
                     int var179 = var389 + var244;
                     Object var102 = var25.get(var179);
                     com.wimpyclient.u.b$a var103 = (com.wimpyclient.u.b$a)var102;
                     int var105 = this.listY;
                     byte var180 = (byte)(903409801 ^ var392);
                     int var106 = var105 + var180;
                     byte var245 = (byte)(903409811 ^ var392);
                     int var182 = var389 * var245;
                     int var107 = var106 + var182;
                     float var108 = var107;
                     int var110 = var103.missing();
                     int var120;
                     if (var110 <= (903409799 ^ var392)) {
                        var392 = 533397106 ^ var392;
                        var120 = var16.textPrimary();
                        var392 = 881129442 ^ var392;
                     } else {
                        var392 = 135929525 ^ var392;
                        var120 = -1037918654 ^ var392;

                        label98:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var392)) {
                              case 128553026:
                                 var392 ^= 592713509;
                              case 858895064:
                                 break label98;
                              case 994249190:
                                 break;
                              case 1869723494:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }
                     }

                     String var112 = var103.displayName();
                     int var184 = var103.have();
                     int var247 = var103.needed();
                     int var291 = var103.missing();
                     String var292;
                     if (var291 > (513210647 ^ var392)) {
                        var392 = 1777434232 ^ var392;
                        int var295 = var103.missing();
                        var292 = "  (-" + var295 + ")";
                        var392 = 975586333 ^ var392;
                     } else {
                        var392 = 196769687 ^ var392;
                        var292 = nqvryaagjb(gvdhznpzursacgs(), var392);
                        var392 = 1483558386 ^ var392;
                     }

                     String var113 = var112 + "  " + var184 + " / " + var247 + var292;
                     int var186 = this.listX;
                     byte var248 = (byte)(1296155512 ^ var392);
                     int var187 = var186 + var248;
                     byte var249 = (byte)(1296155490 ^ var392);
                     int var188 = var187 + var249;
                     byte var250 = (byte)(1296155508 ^ var392);
                     int var189 = var188 + var250;
                     float var190 = var189;
                     float var293 = 11.5F;
                     float var115 = var1.text(var190, var108, var293, var120, var113);
                     var389 += 1296155507 ^ var392;
                     var392 = ekaklckthqlvaysw(var392, 750848866);
                  }
               }
            }

            byte var83 = (byte)((var54.isBuilding()) ? 1 : 0);
            if (var83 == (1684509872 ^ var392)) {
               var392 = 2111398050 ^ var392;
               int var85 = var54.totalToPlace();
               if (var85 <= (431944722 ^ var392)) {
                  var392 = 56394354 ^ var392;
                  if (var56 == null) {
                     var392 = ekaklckthqlvaysw(var392, 1510084254);
                     break label127;
                  }

                  var392 = 374552363 ^ var392;
               } else {
                  var392 = 353351001 ^ var392;
               }
            } else {
               label74:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var392)) {
                     case 42521714:
                        var392 ^= 1758909947;
                     case 1092220852:
                        break label74;
                     case 1336358591:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1608474094:
                  }
               }
            }

            String var88 = var54.progressLabel();
            byte var159 = (byte)((var54.isBuilding()) ? 1 : 0);
            String var160;
            if (var159 != (212943179 ^ var392)) {
               var392 = 1447985714 ^ var392;
               var160 = nqvryaagjb(lfvcchggccrjtut(), var392);
               var392 = ekaklckthqlvaysw(var392, 559040961);
            } else {
               label65:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var392)) {
                     case 144138800:
                        var392 ^= 1825375711;
                        break label65;
                     case 257946481:
                     default:
                        throw new RuntimeException(new IOException());
                     case 626886115:
                        break label65;
                     case 1383793891:
                  }
               }

               var160 = nqvryaagjb(mbdrnpdsaykxodd(), var392);
               var392 = 466734636 ^ var392;
            }

            String var89 = "Progress  " + var88 + var160;
            float var228 = 16.0F;
            float var162 = var39 + var228;
            int var230 = this.buttonY;
            byte var278 = (byte)(2074970794 ^ var392);
            int var231 = var230 - var278;
            float var232 = var231;
            float var279 = 11.5F;
            int var316 = var16.textMuted();
            float var91 = var1.text(var162, var232, var279, var316, var89);
            var392 = 994964038 ^ var392;
         }

         int var164 = this.browseX;
         int var234 = this.buttonY;
         int var281 = this.buttonW;
         int var318 = this.buttonH;
         String var341 = nqvryaagjb(jwpeuenlabpbrau(), var392);
         byte var15 = (byte)(1088452862 ^ var392);
         drawButton(var1, var164, var234, var281, var318, var341, var2, var3, var16, (var15 != 0));
         int var166 = this.clearX;
         int var236 = this.buttonY;
         int var283 = this.buttonW;
         int var320 = this.buttonH;
         String var342 = nqvryaagjb(gtsitggsogbswiy(), var392);
         byte var385 = (byte)(1088452862 ^ var392);
         drawButton(var1, var166, var236, var283, var320, var342, var2, var3, var16, (var385 != 0));
         int var168 = this.startX;
         int var238 = this.buttonY;
         int var285 = this.buttonW;
         int var322 = this.buttonH;
         String var343 = nqvryaagjb(wfnvnbmmkowejqx(), var392);
         byte var386 = (byte)(1088452863 ^ var392);
         drawButton(var1, var168, var238, var285, var322, var343, var2, var3, var16, (var386 != 0));
         int var170 = this.stopX;
         int var240 = this.buttonY;
         int var287 = this.buttonW;
         int var324 = this.buttonH;
         String var344 = nqvryaagjb(nfiiwpcwsqmvdyy(), var392);
         byte var387 = (byte)(1088452862 ^ var392);
         drawButton(var1, var170, var240, var287, var324, var344, var2, var3, var16, (var387 != 0));
         int var172 = this.closeX;
         int var242 = this.buttonY;
         int var289 = this.buttonW;
         int var326 = this.buttonH;
         String var345 = nqvryaagjb(vfqfawenrcsfumo(), var392);
         byte var388 = (byte)(1088452862 ^ var392);
         drawButton(var1, var172, var242, var289, var326, var345, var2, var3, var16, (var388 != 0));
      }
   }

   public void renderExtract(GuiGraphics var1, Font var2, int var3, int var4, int var5, int var6) {
      int var17 = 554965095 ^ 1119970898 ^ 1867332251;
      var17 = 1828680695 ^ var17;
      byte var10 = (byte)((this.open) ? 1 : 0);
      if (var10 == (1617377113 ^ var17)) {
         var17 = 1038349418 ^ var17;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var17)) {
               case 180853595:
                  var17 = 2126845765 ^ var17;
               case 1143628517:
                  this.layout(var5, var6);
                  this.drawMaterialIcons(var1, var2);
                  return;
               case 1261730681:
                  break;
               case 1963532540:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }
   }

   private void drawMaterialIcons(GuiGraphics var1, Font var2) {
      List var10;
      int var87;
      label65: {
         var87 = 1794071314 ^ 70491402 ^ 1867332251;
         var87 = 85142996 ^ var87;
         aj var3 = aj.INSTANCE;
         Minecraft var18 = Minecraft.getInstance();
         List var20 = this.iconRows;
         var10 = var20;
         if (var20 != null) {
            var87 = 749420816 ^ var87;
            byte var23 = (byte)((var20.isEmpty()) ? 1 : 0);
            if (var23 == (673812551 ^ var87)) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var87)) {
                     case 106958835:
                     default:
                        throw new RuntimeException(new IOException());
                     case 231780256:
                        var87 ^= 1894495088;
                     case 1646994761:
                        break label65;
                     case 2043585226:
                  }
               }
            }

            var87 = 1404469548 ^ var87;
         } else {
            var87 = ekaklckthqlvaysw(var87, 2132656188);
         }

         LocalPlayer var55 = var18.player;
         List var25 = var3.materialRows(var55);
         var10 = var25;
         this.iconRows = var25;
         byte var57 = (byte)(2074022250 ^ var87);
         int var75 = this.listH;
         byte var6 = (byte)(2074022271 ^ var87);
         int var76 = var75 / var6;
         int var58 = Math.max(var57, var76);
         this.iconVisible = var58;
         int var60 = this.scroll;
         this.iconScroll = var60;
         var87 = 593310300 ^ var87;
      }

      byte var30 = (byte)((var10.isEmpty()) ? 1 : 0);
      if (var30 != (1489118007 ^ var87)) {
         var87 = 364531474 ^ var87;
      } else {
         label52:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var87)) {
               case 200834296:
                  var87 ^= 1391268977;
               case 537257917:
                  break label52;
               case 848296190:
                  break;
               case 1603644008:
               default:
                  throw new RuntimeException(new IOException());
            }
         }

         byte var31 = (byte)(170866503 ^ var87);
         int var62 = this.iconVisible;
         int var32 = Math.max(var31, var62);
         int var11 = var32;
         int var34 = this.iconScroll;
         int var12 = var34;
         byte var35 = (byte)(170866502 ^ var87);
         int var13 = var35;
         var87 = 419203618 ^ var87;

         while (var13 < var11) {
            var87 = 913295556 ^ var87;
            int var38 = var13 + var12;
            int var66 = var10.size();
            if (var38 >= var66) {
               var87 = ekaklckthqlvaysw(var87, 794135660);
               return;
            }

            var87 = 891996128 ^ var87;
            int var68 = var13 + var12;
            Object var40 = var10.get(var68);
            com.wimpyclient.u.b$a var41 = (com.wimpyclient.u.b$a)var40;
            ItemStack var43 = var41.stack();
            byte var45 = (byte)((var43.isEmpty()) ? 1 : 0);
            if (var45 != (295088704 ^ var87)) {
               var87 = 1518706258 ^ var87;
               var87 = 1643255610 ^ var87;
            } else {
               label38:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var87)) {
                     case 34859210:
                        var87 ^= 1397329585;
                        break label38;
                     case 1056159292:
                        break;
                     case 1068936675:
                        break label38;
                     case 1316690111:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }

               int var47 = this.listX;
               byte var69 = (byte)(1121926393 ^ var87);
               int var48 = var47 + var69;
               int var50 = this.listY;
               byte var70 = (byte)(1121926389 ^ var87);
               int var51 = var50 + var70;
               byte var78 = (byte)(1121926373 ^ var87);
               int var72 = var13 * var78;
               int var52 = var51 + var72;
               var1.renderItem(var43, var48, var52);
               var1.renderItemDecorations(var2, var43, var48, var52);
               var87 = 1748895705 ^ var87;
            }

            var13 += 719403817 ^ var87;
            var87 = ekaklckthqlvaysw(var87, 942835276);
         }

         var87 = 423249064 ^ var87;
      }
   }

   public boolean mouseClicked(double var1, double var3, int var5) {
      int var105 = 1284850591 ^ 1165474270 ^ 1867332251;
      var105 = 1748184161 ^ var105;
      byte var14 = (byte)((this.open) ? 1 : 0);
      if (var14 == (245165243 ^ var105)) {
         var105 = 986120221 ^ var105;
         return (((byte)(878439590 ^ var105)) != 0);
      } else {
         var105 = 2009753214 ^ var105;
         Minecraft var15 = Minecraft.getInstance();
         Window var50 = var15.getWindow();
         int var51 = var50.getGuiScaledWidth();
         Window var55 = var15.getWindow();
         int var56 = var55.getGuiScaledHeight();
         this.layout(var51, var56);
         byte var52 = (byte)(2035714756 ^ var105);
         if (var5 == var52) {
            var105 = 998444515 ^ var105;
            this.close();
            return (((byte)(1121290023 ^ var105)) != 0);
         } else {
            var105 = 427784291 ^ var105;
            if (var5 != (1613361830 ^ var105)) {
               var105 = 1345984029 ^ var105;
               return (((byte)(806610106 ^ var105)) != 0);
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var105)) {
                     case 173090312:
                        var105 ^= 172772694;
                     case 1797120262:
                        int var67 = this.browseX;
                        int var76 = this.buttonY;
                        int var85 = this.buttonW;
                        int var94 = this.buttonH;
                        byte var22 = (byte)((inside(var1, var3, var67, var76, var85, var94)) ? 1 : 0);
                        if (var22 != (1785053168 ^ var105)) {
                           var105 = 811030276 ^ var105;
                           this.browse();
                           q.click();
                           return (((byte)(1513285877 ^ var105)) != 0);
                        }

                        label59:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var105)) {
                              case 12800726:
                              default:
                                 throw new RuntimeException();
                              case 237324676:
                                 var105 ^= 539409044;
                                 break label59;
                              case 1350876708:
                                 break;
                              case 1498456475:
                                 break label59;
                           }
                        }

                        int var69 = this.clearX;
                        int var78 = this.buttonY;
                        int var87 = this.buttonW;
                        int var96 = this.buttonH;
                        byte var25 = (byte)((inside(var1, var3, var69, var78, var87, var96)) ? 1 : 0);
                        if (var25 != (1245906276 ^ var105)) {
                           var105 = 988141030 ^ var105;
                           aj var26 = aj.INSTANCE;
                           var26.clearSchematic();
                           q.click();
                           return (((byte)(1889980547 ^ var105)) != 0);
                        }

                        label51:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var105)) {
                              case 59122024:
                                 break label51;
                              case 153357698:
                              default:
                                 throw new RuntimeException();
                              case 266440754:
                                 var105 ^= 1663161299;
                                 break label51;
                              case 1432590705:
                           }
                        }

                        int var71 = this.startX;
                        int var80 = this.buttonY;
                        int var89 = this.buttonW;
                        int var98 = this.buttonH;
                        byte var30 = (byte)((inside(var1, var3, var71, var80, var89, var98)) ? 1 : 0);
                        if (var30 != (694343351 ^ var105)) {
                           var105 = 1532789648 ^ var105;
                           aj var42 = aj.INSTANCE;
                           var42.startBuild(var15);
                           this.close();
                           q.toggle();
                           return (((byte)(1916687654 ^ var105)) != 0);
                        }

                        var105 = ekaklckthqlvaysw(var105, 1104743151);
                        int var73 = this.stopX;
                        int var82 = this.buttonY;
                        int var91 = this.buttonW;
                        int var100 = this.buttonH;
                        byte var33 = (byte)((inside(var1, var3, var73, var82, var91, var100)) ? 1 : 0);
                        if (var33 != (1757142104 ^ var105)) {
                           var105 = 91492984 ^ var105;
                           aj var34 = aj.INSTANCE;
                           byte var53 = (byte)(1842335265 ^ var105);
                           var34.stop((var53 != 0));
                           q.click();
                           return (((byte)(1842335265 ^ var105)) != 0);
                        }

                        var105 = 1650913585 ^ var105;
                        int var75 = this.closeX;
                        int var84 = this.buttonY;
                        int var93 = this.buttonW;
                        int var102 = this.buttonH;
                        byte var38 = (byte)((inside(var1, var3, var75, var84, var93, var102)) ? 1 : 0);
                        if (var38 != (182267241 ^ var105)) {
                           var105 = 2099077060 ^ var105;
                           this.close();
                           q.click();
                           return (((byte)(2009100972 ^ var105)) != 0);
                        }

                        var105 = 1318761697 ^ var105;
                        return (((byte)(1145543049 ^ var105)) != 0);
                     case 1291093395:
                        break;
                     case 2040889560:
                     default:
                        throw new RuntimeException();
                  }
               }
            }
         }
      }
   }

   public boolean mouseScrolled(double var1, double var3, double var5) {
      int var38 = 799571837 ^ 474361236 ^ 1867332251;
      var38 = 232874266 ^ var38;
      byte var17 = (byte)((this.open) ? 1 : 0);
      if (var17 == (1363282280 ^ var38)) {
         var38 = 629306095 ^ var38;
         return (((byte)(1958771591 ^ var38)) != 0);
      } else {
         var38 = 177089097 ^ var38;
         int var32 = this.listX;
         int var33 = this.listY;
         int var34 = this.listW;
         int var35 = this.listH;
         byte var20 = (byte)((inside(var1, var3, var32, var33, var34, var35)) ? 1 : 0);
         if (var20 != (1540104993 ^ var38)) {
            var38 = 1705814218 ^ var38;
            byte var8 = (byte)(1046514667 ^ var38);
            int var27 = this.scroll;
            double var29 = Math.signum(var5);
            int var31 = (int)var29;
            int var28 = var27 - var31;
            int var25 = Math.max(var8, var28);
            this.scroll = var25;
            return (((byte)(1046514666 ^ var38)) != 0);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                  case 31186883:
                     var38 ^= 1917171072;
                  case 1057200087:
                     return (((byte)(696882848 ^ var38)) != 0);
                  case 1056363427:
                     break;
                  case 1636692591:
                  default:
                     throw new RuntimeException();
               }
            }
         }
      }
   }

   private void browse() {
      int var8 = 705598907 ^ 1717329718 ^ 1867332251;
      var8 = 137012654 ^ var8;
      aj var1 = aj.INSTANCE;
      String var2 = nqvryaagjb(dwhuwapiygsurox(), var8);
      int var3 = -725945078 ^ var8;
      var1.noteStatus(var2, var3);
      Consumer var5 = var1x -> {
         int var18 = 1907706908 ^ 1239963398 ^ 1867332251;
         var18 = 917044464 ^ var18;
         if (var1x == null) {
            var18 = 1432559598 ^ var18;
            aj var12 = aj.INSTANCE;
            String var15 = nqvryaagjb(ormapilxhhljipn(), var18);
            int var4 = -883662291 ^ var18;
            var12.noteStatus(var15, var4);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
                  case 223759538:
                     var18 ^= 1762387650;
                  case 669473859:
                     aj var5x = aj.INSTANCE;
                     boolean var6 = var5x.loadPath((Path)var1x);
                     g var7 = g.INSTANCE;
                     byte var8x = (byte)((var7.isOpen()) ? 1 : 0);
                     if (var8x == (145963955 ^ var18)) {
                        var18 = 1331828712 ^ var18;
                        g var9x = g.INSTANCE;
                        Minecraft var13 = Minecraft.getInstance();
                        var9x.open(var13);
                        var18 = 1095651052 ^ var18;
                     } else {
                        var18 = 237787396 ^ var18;
                     }

                     byte var14 = (byte)(111108790 ^ var18);
                     this.open = (var14 != 0);
                     this.hookDrop();
                     return;
                  case 1188584645:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1880014967:
               }
            }
         }
      };
      com.wimpyclient.u.e.pickAsync(var5);
   }

   private void hookDrop() {
      int var25 = 2108385163 ^ 1961496239 ^ 1867332251;
      var25 = 1024974378 ^ var25;
      Minecraft var1 = Minecraft.getInstance();
      if (var1 != null) {
         var25 = 208538751 ^ var25;
         byte var10 = (byte)((this.dropHooked) ? 1 : 0);
         if (var10 == (1467318762 ^ var25)) {
            var25 = 1782416161 ^ var25;
            Window var12 = var1.getWindow();
            long var13 = var12.handle();
            this.dropWindow = var13;
            GLFWDropCallbackI var22 = (var1x, var3, var4) -> {
               int var37 = 1981219774 ^ 1042526119 ^ 1867332251;
               var37 = 2079400874 ^ var37;
               byte var13x = (byte)((this.open) ? 1 : 0);
               if (var13x == (1552463144 ^ var37)) {
                  var37 = 1390393478 ^ var37;
               } else {
                  var37 = 852707863 ^ var37;
                  byte var14 = (byte)(1851522879 ^ var37);
                  int var9 = var14;
                  var37 = 941235709 ^ var37;

                  while (true) {
                     label38: {
                        if (var9 < var3) {
                           var37 = 26951391 ^ var37;
                           String var18 = GLFWDropCallback.getName(var4, var9);
                           Path var20x = resolveDroppedPath(var18);
                           if (var20x == null) {
                              var37 = 1185390061 ^ var37;
                              var37 = ekaklckthqlvaysw(var37, 54017387);
                              break label38;
                           }

                           var37 = 2019832007 ^ var37;
                           Path var23 = var20x.getFileName();
                           String var24 = var23.toString();
                           Locale var31 = Locale.ROOT;
                           String var25x = var24.toLowerCase(var31);
                           byte var27x = (byte)((com.wimpyclient.u.e.isSchematicName(var25x)) ? 1 : 0);
                           if (var27x == (801041626 ^ var37)) {
                              var37 = 820349341 ^ var37;
                              String var32 = nqvryaagjb(svdfyyhlyfngdmk(), var37);
                              byte var29x = (byte)((var25x.contains(var32)) ? 1 : 0);
                              if (var29x == (526083399 ^ var37)) {
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                                       case 213977954:
                                          var37 ^= 220076508;
                                          break label38;
                                       case 776321711:
                                          break;
                                       case 837997411:
                                       default:
                                          throw new IllegalStateException();
                                       case 1920531001:
                                          break label38;
                                    }
                                 }
                              }

                              var37 = 950223596 ^ var37;
                           } else {
                              var37 = 138857329 ^ var37;
                           }

                           Minecraft var30x = Minecraft.getInstance();
                           Runnable var34 = () -> {
                              int var6 = 1939488729 ^ 172616197 ^ 710705345;
                              var6 = 658734755 ^ var6;
                              aj var1xx = aj.INSTANCE;
                              boolean var3x = var1xx.loadPath(var20x);
                           };
                           var30x.execute(var34);
                           var37 = ekaklckthqlvaysw(var37, 730130499);
                        } else {
                           var37 = 1513958698 ^ var37;
                        }

                        return;
                     }

                     var9 += 306543770 ^ var37;
                     var37 = 1141153369 ^ var37;
                  }
               }
            };
            GLFWDropCallback var20 = GLFW.glfwSetDropCallback(var13, var22);
            this.previousDrop = var20;
            byte var21 = (byte)(1028129482 ^ var25);
            this.dropHooked = (var21 != 0);
            return;
         }

         var25 = 1626415482 ^ var25;
      } else {
         var25 = 1822371077 ^ var25;
      }
   }

   private static Path resolveDroppedPath(String var0) {
      int var25 = 383223961 ^ 1670973692 ^ 710705345;
      var25 = 71517697 ^ var25;
      if (var0 != null) {
         var25 = 1668677516 ^ var25;
         byte var6 = (byte)((var0.isBlank()) ? 1 : 0);
         if (var6 == (941930793 ^ var25)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                  case 214376091:
                     var25 ^= 266515393;
                  case 1210432228:
                     String var9 = var0.trim();
                     String var3 = var9;
                     var25 = 46157449 ^ var25;

                     label44: {
                        try {
                           String var2 = nqvryaagjb(adfxpqxlqfteksz(), var25);
                           byte var11 = (byte)((var3.startsWith(var2)) ? 1 : 0);
                           if (var11 != (889603169 ^ var25)) {
                              var25 ^= 1095382253;
                              URI var17 = URI.create(var3);
                              Path var18 = Path.of(var17);
                              var25 ^= 1685724250;
                              return var18;
                           }
                        } catch (Exception var27) {
                           var25 = 1571092384 ^ switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var25)) {
                              case -1570536349 -> 1516115090 ^ var25;
                              case -1473109239 -> 454303871 ^ var25;
                              default -> throw new RuntimeException(new IOException("Error in hash"));
                           };
                           break label44;
                        }

                        var25 = 2095807147 ^ var25;
                        var25 = 979086708 ^ var25;
                     }

                     try {
                        byte var20 = (byte)(1941345214 ^ var25);
                        String[] var21 = new String[var20];
                        Path var13 = Path.of(var3, var21);
                        var25 ^= 985696518;
                        return var13;
                     } catch (Exception var26) {
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var25)) {
                           case -1649107469:
                              var25 = 668999981 ^ var25;
                              return null;
                           default:
                              throw new RuntimeException(new IOException("Error in hash"));
                        }
                     }
                  case 694829202:
                     break;
                  case 2014520208:
                  default:
                     throw new RuntimeException();
               }
            }
         }

         var25 = 1706104581 ^ var25;
      } else {
         var25 = ekaklckthqlvaysw(var25, 113567881);
      }

      return null;
   }

   private void unhookDrop() {
      int var25 = 9703532 ^ 2115287295 ^ 1867332251;
      var25 = 1851973758 ^ var25;
      byte var5 = (byte)((this.dropHooked) ? 1 : 0);
      if (var5 == (2142204534 ^ var25)) {
         var25 = 1659928058 ^ var25;
      } else {
         var25 = 209697563 ^ var25;

         label30: {
            label29: {
               try {
                  long var7 = this.dropWindow;
                  GLFWDropCallback var20 = this.previousDrop;
                  GLFWDropCallback var9 = GLFW.glfwSetDropCallback(var7, var20);
                  if (var9 != null) {
                     var25 ^= 848184617;
                     var9.free();
                     var25 ^= 1053818480;
                     break label29;
                  }
               } catch (Throwable var26) {
                  var25 = switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var25)) {
                     case -1635366037 -> 1910960843 ^ var25;
                     case 183788066 -> ekaklckthqlvaysw(var25, 1130936290);
                     default -> throw new RuntimeException(new IllegalAccessException("Error in hash"));
                  };
                  long var14 = this.dropWindow;
                  Object var21 = null;
                  GLFWDropCallback var16 = GLFW.glfwSetDropCallback(var14, (GLFWDropCallbackI)var21);
                  var25 = 1273934339 ^ var25;
                  break label30;
               }

               var25 ^= 205634393;
            }

            var25 = ekaklckthqlvaysw(var25, 910818193);
         }

         Object var2 = null;
         this.previousDrop = (GLFWDropCallback)var2;
         byte var19 = (byte)(1238927781 ^ var25);
         this.dropHooked = (var19 != 0);
      }
   }

   private void layout(int var1, int var2) {
      int var124 = 1450860823 ^ 292744902 ^ 1867332251;
      var124 = 1437405042 ^ var124;
      short var4 = (short)(2112403504 ^ var124);
      short var5 = (short)(2112404304 ^ var124);
      byte var7 = (byte)(2112403976 ^ var124);
      int var105 = var1 - var7;
      int var77 = Math.max(var5, var105);
      int var34 = Math.min(var4, var77);
      this.panelW = var34;
      short var35 = (short)(2112404380 ^ var124);
      short var78 = (short)(2112404256 ^ var124);
      byte var118 = (byte)(2112403976 ^ var124);
      int var107 = var2 - var118;
      int var79 = Math.max(var78, var107);
      int var36 = Math.min(var35, var79);
      this.panelH = var36;
      int var81 = this.panelW;
      int var38 = var1 - var81;
      byte var82 = (byte)(2112404026 ^ var124);
      int var39 = var38 / var82;
      this.panelX = var39;
      int var84 = this.panelH;
      int var41 = var2 - var84;
      byte var85 = (byte)(2112404026 ^ var124);
      int var42 = var41 / var85;
      this.panelY = var42;
      int var44 = this.panelX;
      byte var86 = (byte)(2112404008 ^ var124);
      int var45 = var44 + var86;
      this.listX = var45;
      int var47 = this.panelY;
      byte var87 = (byte)(2112404080 ^ var124);
      int var48 = var47 + var87;
      this.listY = var48;
      int var50 = this.panelW;
      byte var88 = (byte)(2112403992 ^ var124);
      int var51 = var50 - var88;
      this.listW = var51;
      int var53 = this.panelH;
      short var89 = (short)(2112404148 ^ var124);
      int var54 = var53 - var89;
      this.listH = var54;
      byte var55 = (byte)(2112404076 ^ var124);
      this.buttonW = var55;
      byte var56 = (byte)(2112404002 ^ var124);
      this.buttonH = var56;
      int var58 = this.panelY;
      int var91 = this.panelH;
      int var59 = var58 + var91;
      byte var92 = (byte)(2112403984 ^ var124);
      int var60 = var59 - var92;
      this.buttonY = var60;
      byte var21 = (byte)(2112404016 ^ var124);
      int var23 = this.buttonW;
      byte var61 = (byte)(2112404029 ^ var124);
      int var24 = var23 * var61;
      byte var93 = (byte)(2112404028 ^ var124);
      int var63 = var21 * var93;
      int var25 = var24 + var63;
      int var27 = this.panelX;
      int var65 = this.panelW;
      int var66 = var65 - var25;
      byte var95 = (byte)(2112404026 ^ var124);
      int var67 = var66 / var95;
      int var28 = var27 + var67;
      this.browseX = var28;
      int var97 = this.buttonW;
      int var98 = var97 + var21;
      int var70 = var28 + var98;
      this.clearX = var70;
      byte var99 = (byte)(2112404026 ^ var124);
      int var110 = this.buttonW;
      int var111 = var110 + var21;
      int var100 = var99 * var111;
      int var72 = var28 + var100;
      this.startX = var72;
      byte var101 = (byte)(2112404027 ^ var124);
      int var113 = this.buttonW;
      int var114 = var113 + var21;
      int var102 = var101 * var114;
      int var74 = var28 + var102;
      this.stopX = var74;
      byte var103 = (byte)(2112404028 ^ var124);
      int var116 = this.buttonW;
      int var117 = var116 + var21;
      int var104 = var103 * var117;
      int var76 = var28 + var104;
      this.closeX = var76;
   }

   private static void drawButton(
      com.wimpyclient.m.b var0, int var1, int var2, int var3, int var4, String var5, int var6, int var7, com.wimpyclient.o.b var8, boolean var9
   ) {
      int var89 = 331404655 ^ 1876305398 ^ 710705345;
      var89 = 209592613 ^ var89;
      double var22 = var6;
      double var46 = var7;
      byte var24 = (byte)((inside(var22, var46, var1, var2, var3, var4)) ? 1 : 0);
      int var39;
      if (var9 != ((1513378173 ^ var89) != 0)) {
         var89 = 1894330951 ^ var89;
         if (var24 != (719151930 ^ var89)) {
            var89 = 1951042401 ^ var89;
            var39 = var8.accentBright();
            var89 = 864343631 ^ var89;
         } else {
            var89 = 1932636185 ^ var89;
            var39 = var8.accent();
            var89 = 889187639 ^ var89;
         }
      } else {
         var89 = ekaklckthqlvaysw(var89, 251858981);
         if (var24 != (1429684568 ^ var89)) {
            var89 = 572189305 ^ var89;
            var39 = var8.rowHover();
            var89 = ekaklckthqlvaysw(var89, 440309045);
         } else {
            label58:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var89)) {
                  case 85679021:
                     var89 ^= 1059331463;
                  case 195958338:
                     break label58;
                  case 1087011073:
                     break;
                  case 2089917629:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }

            var39 = var8.field();
            var89 = 117465803 ^ var89;
         }
      }

      int var38;
      if (var9 != ((1829977620 ^ var89) != 0)) {
         var89 = 1228836674 ^ var89;
         var38 = -618152634 ^ var89;

         label49:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var89)) {
               case 102278075:
                  var89 ^= 699009457;
               case 294347745:
                  break label49;
               case 663752107:
               default:
                  throw new RuntimeException(new IOException());
               case 671046869:
            }
         }
      } else {
         label42:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var89)) {
               case 24895957:
               default:
                  throw new RuntimeException(new IOException());
               case 55911765:
                  var89 ^= 1206356423;
                  break label42;
               case 317696074:
                  break;
               case 1377189112:
                  break label42;
            }
         }

         var38 = var8.textPrimary();
         var89 = 661851956 ^ var89;
      }

      float var40 = var1;
      float var49 = var2;
      float var58 = var3;
      float var67 = var4;
      float var73 = var4;
      float var79 = 2.0F;
      float var74 = var73 / var79;
      var0.rect(var40, var49, var58, var67, var74, var39);
      if (var9 == ((226998503 ^ var89) != 0)) {
         var89 = 2009890795 ^ var89;
         float var42 = var1;
         float var51 = var2;
         float var60 = var3;
         float var69 = var4;
         float var76 = var4;
         float var81 = 2.0F;
         float var77 = var76 / var81;
         float var82 = 1.0F;
         int var84 = var8.accent();
         float var86;
         if (var24 != (2051786508 ^ var89)) {
            var89 = 1661812252 ^ var89;
            var86 = 0.7F;
            var89 = 1096118407 ^ var89;
         } else {
            var89 = 2049145645 ^ var89;
            var86 = 0.35F;
            var89 = 1484469686 ^ var89;
         }

         int var85 = com.wimpyclient.p.g.withAlpha(var84, var86);
         var0.rectOutline(var42, var51, var60, var69, var77, var82, var85);
         var89 = 945443162 ^ var89;
      } else {
         var89 = 1842241578 ^ var89;
      }

      float var44 = var1;
      float var53 = var3;
      float var61 = 2.0F;
      float var54 = var53 / var61;
      float var45 = var44 + var54;
      float var56 = var2;
      float var63 = var4;
      float var70 = 2.0F;
      float var64 = var63 / var70;
      float var57 = var56 + var64;
      float var65 = 12.0F;
      var0.textCentered(var45, var57, var65, var38, var5);
   }

   private static void drawExtractButton(GuiGraphics var0, Font var1, int var2, int var3, int var4, int var5, String var6, int var7, int var8) {
      int var52 = 1514949275 ^ 169964874 ^ 710705345;
      var52 = 471452139 ^ var52;
      double var18 = var7;
      double var24 = var8;
      byte var20 = (byte)((inside(var18, var24, var2, var3, var4, var5)) ? 1 : 0);
      int var28 = var2 + var4;
      int var33 = var3 + var5;
      int var45;
      if (var20 != (1713927931 ^ var52)) {
         var52 = 1474727492 ^ var52;
         var45 = -826464192 ^ var52;
         var52 = ekaklckthqlvaysw(var52, 1252713139);
      } else {
         label18:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var52)) {
               case 99483822:
                  var52 ^= 1996362435;
               case 181774025:
                  var45 = -271026656 ^ var52;
                  var52 = 1806859828 ^ var52;
                  break label18;
               case 155481697:
               default:
                  throw new IllegalStateException();
               case 1421936152:
            }
         }
      }

      var0.fill(var2, var3, var28, var33, var45);
      byte var40 = (byte)(2070157838 ^ var52);
      int var35 = var4 / var40;
      int var30 = var2 + var35;
      Object var47 = Objects.requireNonNull(var1);
      byte var48 = (byte)(2070157829 ^ var52);
      int var42 = var5 - var48;
      byte var49 = (byte)(2070157838 ^ var52);
      int var43 = var42 / var49;
      int var37 = var3 + var43;
      int var44 = -2070483722 ^ var52;
      var0.drawCenteredString(var1, var6, var30, var37, var44);
   }

   private static boolean inside(double var0, double var2, int var4, int var5, int var6, int var7) {
      int var39 = 2100361958 ^ 84100692 ^ 710705345;
      var39 = 1738151534 ^ var39;
      double var23 = var4;
      double var46;
      int var12 = (var46 = var0 - var23) == 0.0 ? 0 : (var46 < 0.0 ? -1 : 1);
      if (var12 >= (905259549 ^ var39)) {
         var39 = 1599731481 ^ var39;
         int var26 = var4 + var6;
         double var27 = var26;
         double var47;
         int var15 = (var47 = var0 - var27) == 0.0 ? 0 : (var47 < 0.0 ? -1 : 1);
         if (var15 < (1789713668 ^ var39)) {
            var39 = 869413201 ^ var39;
            double var30 = var5;
            double var48;
            int var18 = (var48 = var2 - var30) == 0.0 ? 0 : (var48 < 0.0 ? -1 : 1);
            if (var18 >= (1501490261 ^ var39)) {
               var39 = 185337768 ^ var39;
               int var33 = var5 + var7;
               double var34 = var33;
               double var49;
               int var21 = (var49 = var2 - var34) == 0.0 ? 0 : (var49 < 0.0 ? -1 : 1);
               if (var21 < (1383263229 ^ var39)) {
                  var39 = 508992940 ^ var39;
                  byte var22 = (byte)(1277458000 ^ var39);

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                        case 59173144:
                           var39 = 344980454 ^ var39;
                           return (var22 != 0);
                        case 701507685:
                        default:
                           throw new RuntimeException(new IOException());
                        case 936002710:
                           break;
                        case 1500962215:
                           return (var22 != 0);
                     }
                  }
               }

               label35:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                     case 264174408:
                        var39 ^= 1387038340;
                     case 1460652787:
                        break label35;
                     case 1984093938:
                     default:
                        throw new RuntimeException(new IOException());
                     case 2034329475:
                  }
               }
            } else {
               var39 = 1503691052 ^ var39;
            }
         } else {
            label43:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                  case 193215237:
                     break label43;
                  case 246318747:
                     var39 ^= 1785901181;
                     break label43;
                  case 1131001581:
                     break;
                  case 1405925550:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      } else {
         var39 = ekaklckthqlvaysw(var39, 892028772);
      }

      byte var50 = (byte)(14577017 ^ var39);
      var39 = 1484120270 ^ var39;
      return (var50 != 0);
   }

   static {
      int var6 = 272394236 ^ 676311323 ^ Integer.parseInt("56662876");
      int var3 = new Random(1960047632382765417L).nextInt();
      XyAqSQYx06 = 1324226811 ^ var3;
      var6 = 2138193291 ^ var6;
      f var0 = new f();
      INSTANCE = var0;
   }

   public static String nqvryaagjb(byte[] var0, int var1) {
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
         byte[] var27 = uekdbkmwgz;
         byte[] var34 = uekdbkmwgz;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] hnydkqunrwhvhdx() {
      return new byte[]{
         75,
         27,
         53,
         88,
         29,
         112,
         27,
         14,
         46,
         76,
         78,
         56,
         66,
         1,
         92,
         66,
         28,
         85,
         9,
         10,
         113,
         67,
         6,
         107,
         93,
         66,
         117,
         29,
         56,
         43,
         84,
         80,
         81,
         2,
         9,
         100,
         68,
         79,
         29,
         103,
         90,
         98,
         61,
         82,
         48,
         8,
         120,
         120,
         111,
         77,
         16,
         28,
         98,
         36,
         68,
         21,
         62,
         12,
         121,
         116,
         44,
         12,
         6,
         48,
         106,
         56,
         18,
         46,
         117,
         60,
         101,
         64,
         8,
         29,
         114,
         116,
         120,
         78,
         17,
         75,
         119,
         123,
         119,
         9,
         1,
         122,
         97,
         16,
         81,
         118
      };
   }

   private static byte[] adfxpqxlqfteksz() {
      return new byte[]{-115, -36, 12, 8, 45, 42, 42, 84, 23, 17, 118, 59};
   }

   private static byte[] svdfyyhlyfngdmk() {
      return new byte[]{-128, -42, 3, 70};
   }

   private static byte[] ormapilxhhljipn() {
      return new byte[]{
         -115,
         -36,
         3,
         34,
         44,
         53,
         47,
         82,
         23,
         3,
         118,
         125,
         122,
         85,
         107,
         86,
         47,
         15,
         49,
         83,
         71,
         21,
         55,
         63,
         105,
         20,
         76,
         73,
         0,
         113,
         108,
         4,
         102,
         82,
         58,
         125,
         92,
         99,
         43,
         127,
         107,
         49,
         9,
         19,
         9,
         95,
         64,
         62,
         87,
         92,
         39,
         73,
         81,
         61,
         124,
         75,
         8,
         93,
         72,
         47,
         24,
         90,
         63,
         40,
         82,
         103,
         42,
         113,
         66,
         123,
         86,
         13,
         48,
         64,
         68,
         45,
         73,
         29
      };
   }

   private static byte[] vzdxeggyrgcedru() {
      return new byte[]{
         -124, -42, 5, 51, 40, 38, 35, 83, 23, 28, 127, 103, 114, 88, 105, 3, 36, 9, 48, 92, 64, 81, 54, 17, 104, 2, 77, 65, 1, 114, 101, 6, 97, 95, 60, 35
      };
   }

   private static byte[] sjysqzflsmwowwx() {
      return new byte[]{
         -115,
         -42,
         13,
         37,
         47,
         53,
         42,
         84,
         30,
         4,
         124,
         32,
         123,
         82,
         107,
         83,
         41,
         22,
         49,
         91,
         73,
         18,
         52,
         57,
         108,
         26,
         69,
         68,
         10,
         103,
         109,
         11,
         102,
         80,
         60,
         116,
         124,
         27,
         37,
         49,
         104,
         39,
         12,
         71,
         0,
         81,
         74,
         96,
         86,
         76,
         39,
         105,
         87,
         52,
         124,
         87,
         6,
         71,
         75,
         38,
         29,
         79,
         54,
         97,
         88,
         101,
         43,
         107,
         66,
         45,
         80,
         91,
         48,
         15,
         74,
         32,
         74,
         24,
         32,
         10,
         71,
         38,
         69,
         67,
         56,
         33,
         86,
         64,
         100,
         42,
         115,
         90
      };
   }

   private static byte[] lfvcchggccrjtut() {
      return new byte[0];
   }

   private static byte[] byidaontzjxxhtc() {
      return new byte[]{
         -124,
         -42,
         5,
         46,
         43,
         49,
         40,
         85,
         26,
         13,
         127,
         42,
         114,
         82,
         106,
         81,
         47,
         7,
         61,
         82,
         64,
         29,
         54,
         60,
         107,
         81,
         70,
         65,
         12,
         127,
         101,
         16,
         97,
         85,
         63,
         119,
         119,
         20,
         41,
         36,
         107,
         112,
         13,
         34,
         6,
         73,
         75,
         35,
         91,
         11,
         33,
         93,
         82,
         115
      };
   }

   private static byte[] jwpeuenlabpbrau() {
      return new byte[]{-124, -44, 13, 34, 41, 55, 41, 89, 24, 9, 127, 123, 122, 92};
   }

   private static byte[] gtsitggsogbswiy() {
      return new byte[]{-124, -44, 13, 35, 41, 41, 41, 83, 24, 31, 127, 122};
   }

   private static byte[] wfnvnbmmkowejqx() {
      return new byte[]{-124, -44, 13, 51, 41, 49, 41, 87, 24, 12, 127, 124};
   }

   private static byte[] nfiiwpcwsqmvdyy() {
      return new byte[]{-124, -44, 13, 51, 41, 49, 41, 89, 24, 14};
   }

   private static byte[] vfqfawenrcsfumo() {
      return new byte[]{-124, -44, 13, 35, 41, 41, 41, 89, 24, 13, 127, 109};
   }

   private static byte[] mbdrnpdsaykxodd() {
      return new byte[]{
         -124,
         -46,
         4,
         64,
         42,
         101,
         45,
         -114,
         27,
         90,
         127,
         46,
         115,
         94,
         107,
         31,
         42,
         13,
         60,
         79,
         64,
         1,
         55,
         115,
         106,
         7,
         67,
         88,
         13,
         120,
         101,
         16,
         96,
         83,
         62,
         52,
         114,
         15,
         40,
         113,
         107,
         61,
         12,
         4,
         7,
         29,
         78,
         56,
         90,
         20,
         33,
         88,
         83,
         112,
         115,
         68
      };
   }

   private static byte[] suqtzsdkhhfaxbn() {
      return new byte[]{
         -122,
         -48,
         1,
         38,
         36,
         39,
         35,
         22,
         27,
         15,
         122,
         96,
         114,
         89,
         100,
         25,
         36,
         5,
         58,
         95,
         69,
         17,
         63,
         63,
         101,
         31,
         64,
         14,
         12,
         125,
         100,
         5,
         105,
         85,
         49,
         50,
         119,
         16,
         41,
         36,
         99,
         122,
         5,
         3,
         5,
         85,
         76,
         108,
         95,
         0,
         40,
         76,
         90,
         120,
         119,
         82,
         10,
         28,
         64,
         63,
         20,
         87,
         51,
         107,
         94,
         105,
         34,
         122,
         77,
         101,
         93,
         1,
         59,
         64,
         70,
         39
      };
   }

   private static byte[] gvdhznpzursacgs() {
      return new byte[0];
   }

   private static byte[] dwhuwapiygsurox() {
      return new byte[]{
         -126,
         -42,
         1,
         46,
         44,
         53,
         45,
         95,
         30,
         21,
         124,
         101,
         123,
         94,
         105,
         19,
         40,
         69,
         62,
         94,
         69,
         19,
         55,
         50,
         107,
         19,
         69,
         10,
         10,
         111,
         109,
         8,
         100,
         87,
         61,
         63,
         115,
         24,
         41,
         44,
         75,
         113
      };
   }

   private static int ekaklckthqlvaysw(int var0, int var1) {
      return var0 ^ var1;
   }
}
