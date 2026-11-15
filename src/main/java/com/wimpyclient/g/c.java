package com.wimpyclient.g;

import com.mojang.blaze3d.platform.Window;
import com.wimpyclient.i.v;
import com.wimpyclient.i.x;
import com.wimpyclient.p.q;
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
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class c {
   public static final c INSTANCE;
   private static final String TITLE = "Flight warning";
   private static final String LINE1 = "Flight might not be safe for use on servers.";
   private static final String LINE2 = "Use at your own risk.";
   private boolean open;
   private int panelX;
   private int panelY;
   private int panelW;
   private int panelH;
   private int okX;
   private int cancelX;
   private int buttonY;
   private int buttonW;
   private int buttonH;
   private static int Mb3TzRdboJ;
   private transient int y639wthXsL;
   private static byte[] wyrgkpvnlr = zwodrtyiqugrccs();

   private c() {
super();
      int var4 = 1413493816 ^ 1042464274;
      
      var4 = 1128204629 ^ var4;
      var4 = 1059527322 ^ 2036054993 ^ Integer.parseInt("1864442420");
      this.y639wthXsL = 886968887 ^ Mb3TzRdboJ;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 2426779:
               var4 = 575431100 ^ var4;
            case 2004132304:
               return;
            case 1103838642:
            default:
               throw new RuntimeException(new IOException());
            case 2109906488:
         }
      }
   }

   public boolean isOpen() {
      int var5 = 465304013 ^ 1012380546 ^ 240113618;
      var5 = 328911126 ^ var5;
      return this.open;
   }

   public void request() {
      int var12 = 1826099094 ^ 1777937835 ^ 240113618;
      var12 = 359767632 ^ var12;
      byte var2 = (byte)(505375678 ^ var12);
      this.open = (var2 != 0);
      Minecraft var4 = Minecraft.getInstance();
      if (var4 != null) {
         var12 = 2139772612 ^ var12;
         g var6 = g.INSTANCE;
         byte var7 = (byte)((var6.isOpen()) ? 1 : 0);
         if (var7 == (1637170555 ^ var12)) {
            var12 = 355787389 ^ var12;
            g var8 = g.INSTANCE;
            var8.open(var4);
            var12 = 1166012031 ^ var12;
         } else {
            var12 = 1347095554 ^ var12;
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var12)) {
               case 173866717:
                  var12 = 801200838 ^ var12;
                  return;
               case 715487838:
                  return;
               case 904627977:
                  break;
               case 2147217674:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   public void close() {
      int var5 = 1512813473 ^ 1964332956 ^ 240113618;
      var5 = 1905188537 ^ var5;
      byte var2 = (byte)(1358949718 ^ var5);
      this.open = (var2 != 0);
   }

   public void confirm() {
      int var6 = 698281993 ^ 1635088323 ^ 240113618;
      var6 = 1701861665 ^ var6;
      x var1 = x.INSTANCE;
      v var2 = var1.flight;
      var2.enableAfterConfirm();
      this.close();
   }

   public void render(com.wimpyclient.m.b var1, int var2, int var3, float var4, float var5) {
      int var144 = 1801768835 ^ 1261709997 ^ 240113618;
      var144 = 843252424 ^ var144;
      byte var21 = (byte)((this.open) ? 1 : 0);
      if (var21 == (475803700 ^ var144)) {
         var144 = 1799306162 ^ var144;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var144)) {
               case 116556088:
                  var144 ^= 778760055;
               case 226863107:
                  int var45 = (int)var4;
                  int var60 = (int)var5;
                  this.layout(var45, var60);
                  com.wimpyclient.o.b var23 = com.wimpyclient.o.b.INSTANCE;
                  float var46 = 0.0F;
                  float var61 = 0.0F;
                  float var11 = 0.0F;
                  int var12 = -852041917 ^ var144;
                  float var13 = 0.55F;
                  int var120 = com.wimpyclient.p.g.withAlpha(var12, var13);
                  var1.rect(var46, var61, var4, var5, var11, var120);
                  int var26 = this.panelX;
                  float var27 = var26;
                  int var29 = this.panelY;
                  float var30 = var29;
                  int var32 = this.panelW;
                  float var33 = var32;
                  int var35 = this.panelH;
                  float var36 = var35;
                  float var82 = 2.0F;
                  float var63 = var30 + var82;
                  float var112 = 10.0F;
                  float var121 = 8.0F;
                  int var128 = var23.warn();
                  float var14 = 0.18F;
                  int var129 = com.wimpyclient.p.g.withAlpha(var128, var14);
                  var1.glow(var27, var63, var33, var36, var112, var121, var129);
                  float var113 = 10.0F;
                  int var123 = var23.background();
                  int var131 = var23.backgroundTo();
                  byte var137 = (byte)(842456898 ^ var144);
                  var1.rectGradient(var27, var30, var33, var36, var113, var123, var131, (var137 != 0));
                  float var114 = 10.0F;
                  float var124 = 1.2F;
                  int var133 = var23.warn();
                  float var138 = 0.65F;
                  int var134 = com.wimpyclient.p.g.withAlpha(var133, var138);
                  var1.rectOutline(var27, var30, var33, var36, var114, var124, var134);
                  float var86 = 2.0F;
                  float var67 = var33 / var86;
                  float var51 = var27 + var67;
                  float var87 = 22.0F;
                  float var69 = var30 + var87;
                  float var88 = 15.0F;
                  int var103 = var23.warn();
                  String var115 = pfjuljcvca(nncsvinswgoljup(), var144);
                  var1.textCentered(var51, var69, var88, var103, var115);
                  float var89 = 2.0F;
                  float var71 = var33 / var89;
                  float var53 = var27 + var71;
                  float var90 = 48.0F;
                  float var73 = var30 + var90;
                  float var91 = 12.0F;
                  int var105 = var23.textPrimary();
                  String var116 = pfjuljcvca(dnfqoigvpciygrb(), var144);
                  var1.textCentered(var53, var73, var91, var105, var116);
                  float var92 = 2.0F;
                  float var75 = var33 / var92;
                  float var55 = var27 + var75;
                  float var93 = 66.0F;
                  float var77 = var30 + var93;
                  float var94 = 12.0F;
                  int var107 = var23.textPrimary();
                  String var117 = pfjuljcvca(ubbozkvwwwulegz(), var144);
                  var1.textCentered(var55, var77, var94, var107, var117);
                  int var57 = this.cancelX;
                  int var79 = this.buttonY;
                  int var96 = this.buttonW;
                  int var109 = this.buttonH;
                  String var118 = pfjuljcvca(frczyzqurrmbval(), var144);
                  byte var15 = (byte)(842456899 ^ var144);
                  drawButton(var1, var57, var79, var96, var109, var118, var2, var3, var23, (var15 != 0));
                  int var59 = this.okX;
                  int var81 = this.buttonY;
                  int var98 = this.buttonW;
                  int var111 = this.buttonH;
                  String var119 = pfjuljcvca(bsidyeistqdglny(), var144);
                  byte var141 = (byte)(842456898 ^ var144);
                  drawButton(var1, var59, var81, var98, var111, var119, var2, var3, var23, (var141 != 0));
                  return;
               case 282660418:
                  break;
               case 322538767:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }
   }

   public void renderExtract(GuiGraphics var1, Font var2, int var3, int var4, int var5, int var6) {
      int var92 = 877213276 ^ 768043395 ^ 240113618;
      var92 = 309375818 ^ var92;
      byte var17 = (byte)((this.open) ? 1 : 0);
      if (var17 == (95501127 ^ var92)) {
         var92 = 1987690715 ^ var92;
      } else {
         var92 = thexapsltriyshla(var92, 1667334647);
         this.layout(var5, var6);
         byte var29 = (byte)(1724955312 ^ var92);
         byte var40 = (byte)(1724955312 ^ var92);
         int var12 = -1714373968 ^ var92;
         float var13 = 0.55F;
         int var75 = com.wimpyclient.p.g.withAlpha(var12, var13);
         var1.fill(var29, var40, var5, var6, var75);
         int var31 = this.panelX;
         int var42 = this.panelY;
         int var52 = this.panelW;
         int var61 = this.panelH;
         d.panel(var1, var31, var42, var52, var61);
         int var22 = this.panelX;
         int var33 = this.panelW;
         byte var43 = (byte)(1724955314 ^ var92);
         int var34 = var33 / var43;
         int var23 = var22 + var34;
         String var44 = pfjuljcvca(ltyangcycvxwrqs(), var92);
         int var63 = this.panelY;
         byte var76 = (byte)(1724955326 ^ var92);
         int var64 = var63 + var76;
         short var77 = (short)(-1724969244 ^ var92);
         var1.drawCenteredString(var2, var44, var23, var64, var77);
         String var45 = pfjuljcvca(olsgzlfuauymfua(), var92);
         int var66 = this.panelY;
         byte var78 = (byte)(1724955284 ^ var92);
         int var67 = var66 + var78;
         int var79 = -1725805494 ^ var92;
         var1.drawCenteredString(var2, var45, var23, var67, var79);
         String var46 = pfjuljcvca(shmjufifpkjpwvo(), var92);
         int var69 = this.panelY;
         byte var80 = (byte)(1724955266 ^ var92);
         int var70 = var69 + var80;
         int var81 = -1725805494 ^ var92;
         var1.drawCenteredString(var2, var46, var23, var70, var81);
         int var48 = this.cancelX;
         int var57 = this.buttonY;
         int var72 = this.buttonW;
         int var83 = this.buttonH;
         String var86 = pfjuljcvca(jirotxoozpnbvso(), var92);
         drawExtractButton(var1, var2, var48, var57, var72, var83, var86, var3, var4);
         int var50 = this.okX;
         int var59 = this.buttonY;
         int var74 = this.buttonW;
         int var85 = this.buttonH;
         String var87 = pfjuljcvca(tfawkejjsnjnzfm(), var92);
         drawExtractButton(var1, var2, var50, var59, var74, var85, var87, var3, var4);
      }
   }

   public boolean mouseClicked(double var1, double var3, int var5) {
      int var57 = 2091612121 ^ 1018124246 ^ 240113618;
      var57 = 1486056915 ^ var57;
      byte var14 = (byte)((this.open) ? 1 : 0);
      if (var14 == (383293966 ^ var57)) {
         var57 = 7684891 ^ var57;
         return (((byte)(380492053 ^ var57)) != 0);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var57)) {
               case 54694137:
                  break;
               case 205765795:
                  var57 ^= 1982839531;
               case 1202957934:
                  Minecraft var15 = Minecraft.getInstance();
                  Window var34 = var15.getWindow();
                  int var35 = var34.getGuiScaledWidth();
                  Window var37 = var15.getWindow();
                  int var38 = var37.getGuiScaledHeight();
                  this.layout(var35, var38);
                  byte var36 = (byte)(1626808548 ^ var57);
                  if (var5 == var36) {
                     var57 = 774504444 ^ var57;
                     this.close();
                     return (((byte)(1323228952 ^ var57)) != 0);
                  }

                  var57 = 593107518 ^ var57;
                  if (var5 != (1135426267 ^ var57)) {
                     var57 = 1425100774 ^ var57;
                     return (((byte)(391935292 ^ var57)) != 0);
                  }

                  var57 = thexapsltriyshla(var57, 1182640069);
                  int var43 = this.okX;
                  int var46 = this.buttonY;
                  int var49 = this.buttonW;
                  int var52 = this.buttonH;
                  byte var22 = (byte)((inside(var1, var3, var43, var46, var49, var52)) ? 1 : 0);
                  if (var22 != (97557790 ^ var57)) {
                     var57 = 1702002637 ^ var57;
                     this.confirm();
                     q.toggle();
                     return (((byte)(1621287634 ^ var57)) != 0);
                  }

                  var57 = 235125145 ^ var57;
                  int var45 = this.cancelX;
                  int var48 = this.buttonY;
                  int var51 = this.buttonW;
                  int var54 = this.buttonH;
                  byte var27 = (byte)((inside(var1, var3, var45, var48, var51, var54)) ? 1 : 0);
                  if (var27 != (198386823 ^ var57)) {
                     var57 = 1585022499 ^ var57;
                     this.close();
                     q.click();
                     return (((byte)(1437246117 ^ var57)) != 0);
                  }

                  var57 = thexapsltriyshla(var57, 538036127);
                  return (((byte)(734192409 ^ var57)) != 0);
               case 483510189:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private void layout(int var1, int var2) {
      int var68 = 2050733276 ^ 680856246 ^ 240113618;
      var68 = 1471829074 ^ var68;
      short var4 = (short)(190528642 ^ var68);
      short var5 = (short)(190528754 ^ var68);
      byte var7 = (byte)(190528962 ^ var68);
      int var63 = var1 - var7;
      int var46 = Math.max(var5, var63);
      int var23 = Math.min(var4, var46);
      this.panelW = var23;
      short var24 = (short)(190528872 ^ var68);
      this.panelH = var24;
      int var48 = this.panelW;
      int var26 = var1 - var48;
      byte var49 = (byte)(190529000 ^ var68);
      int var27 = var26 / var49;
      this.panelX = var27;
      int var51 = this.panelH;
      int var29 = var2 - var51;
      byte var52 = (byte)(190529000 ^ var68);
      int var30 = var29 / var52;
      this.panelY = var30;
      byte var31 = (byte)(190528906 ^ var68);
      this.buttonW = var31;
      byte var32 = (byte)(190529010 ^ var68);
      this.buttonH = var32;
      int var34 = this.panelY;
      int var54 = this.panelH;
      int var35 = var34 + var54;
      byte var55 = (byte)(190528974 ^ var68);
      int var36 = var35 - var55;
      this.buttonY = var36;
      byte var16 = (byte)(190529018 ^ var68);
      int var18 = this.buttonW;
      byte var37 = (byte)(190529000 ^ var68);
      int var19 = var18 * var37;
      int var20 = var19 + var16;
      int var40 = this.panelX;
      int var57 = this.panelW;
      int var58 = var57 - var20;
      byte var65 = (byte)(190529000 ^ var68);
      int var59 = var58 / var65;
      int var41 = var40 + var59;
      this.cancelX = var41;
      int var43 = this.cancelX;
      int var61 = this.buttonW;
      int var44 = var43 + var61;
      int var45 = var44 + var16;
      this.okX = var45;
   }

   private static void drawButton(
      com.wimpyclient.m.b var0, int var1, int var2, int var3, int var4, String var5, int var6, int var7, com.wimpyclient.o.b var8, boolean var9
   ) {
      int var89 = 753022317 ^ 1967364158 ^ 982631909;
      var89 = 994455081 ^ var89;
      double var22 = var6;
      double var46 = var7;
      byte var24 = (byte)((inside(var22, var46, var1, var2, var3, var4)) ? 1 : 0);
      int var39;
      if (var9 != ((1484146335 ^ var89) != 0)) {
         var89 = 1336780802 ^ var89;
         if (var24 != (400289437 ^ var89)) {
            var89 = 1680184530 ^ var89;
            var39 = var8.accentBright();
            var89 = thexapsltriyshla(var89, 863757499);
         } else {
            var89 = thexapsltriyshla(var89, 2053808854);
            var39 = var8.accent();
            var89 = thexapsltriyshla(var89, 758436543);
         }
      } else {
         label45:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var89)) {
               case 191197346:
                  var89 ^= 1648826000;
               case 1840374374:
                  if (var24 != (976310287 ^ var89)) {
                     var89 = 1793191329 ^ var89;
                     var39 = var8.rowHover();
                     var89 = thexapsltriyshla(var89, 274015066);
                  } else {
                     var89 = 2071309196 ^ var89;
                     var39 = var8.field();
                     var89 = 29451639 ^ var89;
                  }
                  break label45;
               case 754423277:
                  break;
               case 1760680817:
               default:
                  throw new IllegalStateException();
            }
         }
      }

      int var34;
      if (var9 != ((1082498804 ^ var89) != 0)) {
         var89 = 1231216306 ^ var89;
         var34 = -152220586 ^ var89;
         var89 = thexapsltriyshla(var89, 2036134872);
      } else {
         var89 = 1800946290 ^ var89;
         var34 = var8.textPrimary();
         var89 = 1533439768 ^ var89;
      }

      float var40 = var1;
      float var49 = var2;
      float var58 = var3;
      float var67 = var4;
      float var73 = var4;
      float var79 = 2.0F;
      float var74 = var73 / var79;
      var0.rect(var40, var49, var58, var67, var74, var39);
      if (var9 == ((1891349406 ^ var89) != 0)) {
         var89 = 52609861 ^ var89;
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
         if (var24 != (1939435739 ^ var89)) {
            var89 = 1625853573 ^ var89;
            var86 = 0.7F;
            var89 = 1078155702 ^ var89;
         } else {
            var89 = 389944812 ^ var89;
            var86 = 0.35F;
            var89 = 932561631 ^ var89;
         }

         int var85 = com.wimpyclient.p.g.withAlpha(var84, var86);
         var0.rectOutline(var42, var51, var60, var69, var77, var82, var85);
         var89 = 948738326 ^ var89;
      } else {
         var89 = thexapsltriyshla(var89, 453348704);
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
      var0.textCentered(var45, var57, var65, var34, var5);
   }

   private static void drawExtractButton(GuiGraphics var0, Font var1, int var2, int var3, int var4, int var5, String var6, int var7, int var8) {
      int var52 = 774341280 ^ 1339873649 ^ 982631909;
      var52 = 1460575698 ^ var52;
      double var18 = var7;
      double var24 = var8;
      byte var20 = (byte)((inside(var18, var24, var2, var3, var4, var5)) ? 1 : 0);
      int var28 = var2 + var4;
      int var33 = var3 + var5;
      int var45;
      if (var20 != (207881190 ^ var52)) {
         var52 = 1777217172 ^ var52;
         var45 = -1694892659 ^ var52;
         var52 = thexapsltriyshla(var52, 561200019);
      } else {
         var52 = thexapsltriyshla(var52, 1509937557);
         var45 = -1433026453 ^ var52;
         var52 = 291685522 ^ var52;
      }

      var0.fill(var2, var3, var28, var33, var45);
      byte var40 = (byte)(1157175011 ^ var52);
      int var35 = var4 / var40;
      int var30 = var2 + var35;
      Object var47 = Objects.requireNonNull(var1);
      byte var48 = (byte)(1157175016 ^ var52);
      int var42 = var5 - var48;
      byte var49 = (byte)(1157175011 ^ var52);
      int var43 = var42 / var49;
      int var37 = var3 + var43;
      int var44 = -1156849637 ^ var52;
      var0.drawCenteredString(var1, var6, var30, var37, var44);
   }

   private static boolean inside(double var0, double var2, int var4, int var5, int var6, int var7) {
      int var39 = 1034990728 ^ 1205073761 ^ 982631909;
      var39 = 1740472670 ^ var39;
      double var23 = var4;
      double var46;
      int var12 = (var46 = var0 - var23) == 0.0 ? 0 : (var46 < 0.0 ? -1 : 1);
      if (var12 >= (659490642 ^ var39)) {
         var39 = 188953091 ^ var39;
         int var26 = var4 + var6;
         double var27 = var26;
         double var47;
         int var15 = (var47 = var0 - var27) == 0.0 ? 0 : (var47 < 0.0 ? -1 : 1);
         if (var15 < (738997585 ^ var39)) {
            var39 = 1473619790 ^ var39;
            double var30 = var5;
            double var48;
            int var18 = (var48 = var2 - var30) == 0.0 ? 0 : (var48 < 0.0 ? -1 : 1);
            if (var18 >= (2077856287 ^ var39)) {
               var39 = 218651280 ^ var39;
               int var33 = var5 + var7;
               double var34 = var33;
               double var49;
               int var21 = (var49 = var2 - var34) == 0.0 ? 0 : (var49 < 0.0 ? -1 : 1);
               if (var21 < (1993459855 ^ var39)) {
                  var39 = 1874601802 ^ var39;
                  byte var22 = (byte)(426635204 ^ var39);
                  var39 = thexapsltriyshla(var39, 2103064340);
                  return (var22 != 0);
               }

               var39 = 1153524274 ^ var39;
            } else {
               label28:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                     case 100396785:
                        break label28;
                     case 267776197:
                        var39 ^= 1237924002;
                        break label28;
                     case 1386446071:
                        break;
                     case 1859958922:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }
         } else {
            var39 = thexapsltriyshla(var39, 505192428);
         }
      } else {
         label36:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
               case 204028257:
                  var39 ^= 358591983;
               case 281564744:
                  break label36;
               case 2076398525:
               default:
                  throw new RuntimeException(new IOException());
               case 2129456676:
            }
         }
      }

      byte var50 = (byte)(839953085 ^ var39);
      var39 = 1445425772 ^ var39;
      return (var50 != 0);
   }

   static {
      int var6 = 1191377969 ^ 1852235782 ^ Integer.parseInt("1864442420");
      int var3 = new Random(-5780020054728738810L).nextInt();
      Mb3TzRdboJ = -2025467980 ^ var3;
      var6 = 1652371153 ^ var6;
      c var0 = new c();
      INSTANCE = var0;
   }

   public static String pfjuljcvca(byte[] var0, int var1) {
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
         byte[] var28 = wyrgkpvnlr;
         byte[] var34 = wyrgkpvnlr;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] zwodrtyiqugrccs() {
      return new byte[]{
         122,
         82,
         127,
         21,
         119,
         121,
         74,
         97,
         16,
         57,
         105,
         51,
         87,
         116,
         5,
         88,
         96,
         19,
         11,
         74,
         90,
         70,
         23,
         78,
         106,
         2,
         95,
         19,
         40,
         106,
         18,
         111,
         21,
         55,
         73,
         8,
         67,
         91,
         105,
         80,
         90,
         101,
         69,
         16,
         17,
         21,
         27,
         4,
         7,
         77,
         14,
         41,
         59,
         43,
         82,
         101,
         84,
         77,
         99,
         26,
         100,
         24,
         18,
         60,
         46,
         16,
         70,
         98,
         1,
         124,
         124,
         16,
         34,
         2,
         93,
         84,
         65
      };
   }

   private static byte[] nncsvinswgoljup() {
      return new byte[]{-68, -103, 77, 103, 66, 35, 114, 49, 41, 102, 93, 105, 99, 53, 51, 64, 89, 93, 51, 31, 104, 0, 34, 22, 82, 82, 102, 69, 28, 63};
   }

   private static byte[] dnfqoigvpciygrb() {
      return new byte[]{
         -68,
         -103,
         77,
         103,
         66,
         35,
         114,
         49,
         41,
         102,
         93,
         105,
         99,
         53,
         51,
         64,
         89,
         71,
         51,
         23,
         104,
         21,
         34,
         16,
         82,
         79,
         102,
         11,
         28,
         54,
         38,
         53,
         35,
         123,
         112,
         17,
         123,
         13,
         91,
         1,
         111,
         115,
         125,
         90,
         40,
         76,
         47,
         80,
         51,
         29,
         56,
         49,
         2,
         116,
         106,
         62,
         102,
         11,
         86,
         12,
         92,
         84,
         43,
         119,
         26,
         71,
         114,
         119,
         55,
         43,
         69,
         71,
         26,
         22,
         111,
         19,
         116,
         41,
         106,
         52,
         44,
         57,
         77,
         29,
         85,
         87,
         15,
         34,
         10,
         64
      };
   }

   private static byte[] ubbozkvwwwulegz() {
      return new byte[]{
         -68,
         -103,
         77,
         116,
         66,
         60,
         114,
         61,
         41,
         33,
         93,
         96,
         99,
         53,
         51,
         64,
         89,
         83,
         51,
         17,
         104,
         7,
         34,
         10,
         82,
         27,
         102,
         68,
         28,
         47,
         38,
         52,
         35,
         47,
         112,
         67,
         123,
         6,
         91,
         23,
         111,
         56,
         125,
         7
      };
   }

   private static byte[] frczyzqurrmbval() {
      return new byte[]{-68, -103, 77, 98, 66, 46, 114, 54, 41, 98, 93, 100, 99, 45};
   }

   private static byte[] bsidyeistqdglny() {
      return new byte[]{-68, -103, 77, 110, 66, 4};
   }

   private static byte[] ltyangcycvxwrqs() {
      return new byte[]{-75, -102, 77, 103, 78, 32, 127, 59, 33, 108, 88, 108, 101, 52, 60, 77, 85, 87, 58, 25, 107, 3, 37, 20, 83, 94, 106, 78, 25, 63};
   }

   private static byte[] olsgzlfuauymfua() {
      return new byte[]{
         -75,
         -102,
         77,
         103,
         78,
         32,
         127,
         59,
         33,
         108,
         88,
         108,
         101,
         52,
         60,
         77,
         85,
         77,
         58,
         17,
         107,
         22,
         37,
         18,
         83,
         67,
         106,
         0,
         25,
         54,
         35,
         55,
         39,
         119,
         112,
         29,
         118,
         10,
         88,
         7,
         107,
         114,
         119,
         87,
         40,
         65,
         46,
         81,
         54,
         26,
         63,
         62,
         9,
         121,
         107,
         63,
         97,
         12,
         82,
         8,
         85,
         90,
         32,
         123,
         23,
         64,
         115,
         113,
         48,
         33,
         77,
         73,
         16,
         22,
         100,
         18,
         116,
         44,
         99,
         63,
         36,
         54,
         75,
         27,
         88,
         87,
         12,
         41,
         2,
         75
      };
   }

   private static byte[] shmjufifpkjpwvo() {
      return new byte[]{
         -75,
         -102,
         77,
         116,
         78,
         63,
         127,
         55,
         33,
         43,
         88,
         101,
         101,
         52,
         60,
         77,
         85,
         89,
         58,
         23,
         107,
         4,
         37,
         8,
         83,
         23,
         106,
         79,
         25,
         47,
         35,
         54,
         39,
         35,
         112,
         79,
         118,
         1,
         88,
         17,
         107,
         57,
         119,
         10
      };
   }

   private static byte[] jirotxoozpnbvso() {
      return new byte[]{-75, -102, 77, 98, 78, 45, 127, 60, 33, 104, 88, 97, 101, 44};
   }

   private static byte[] tfawkejjsnjnzfm() {
      return new byte[]{-75, -102, 77, 110, 78, 7};
   }

   private static int thexapsltriyshla(int var0, int var1) {
      return var1 ^ var0;
   }
}
