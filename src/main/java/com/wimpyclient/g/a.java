package com.wimpyclient.g;

import com.mojang.blaze3d.platform.Window;
import com.wimpyclient.a.c$b;
import com.wimpyclient.p.q;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.util.Mth;
import org.lwjgl.glfw.GLFW;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a {
   public static final a INSTANCE;
   private static final ExecutorService AUTH;
   private boolean open;
   private boolean fieldFocused;
   private boolean busy;
   private int loginGeneration;
   private String combo;
   private String status;
   private int statusColor;
   private int scroll;
   private int panelX;
   private int panelY;
   private int panelW;
   private int panelH;
   private int listX;
   private int listY;
   private int listW;
   private int listH;
   private int fieldX;
   private int fieldY;
   private int fieldW;
   private int fieldH;
   private int addX;
   private int loginX;
   private int pasteX;
   private int buttonY;
   private int buttonW;
   private int buttonH;
   private int rowH;
   private static int f2XDebsdBIi;
   private transient int D71mf1sr0X;

   private a() {
super();
      int var10 = 1957971167 ^ 1172650017;
      
      var10 = 1534564091 ^ var10;
      var10 = 2086433760 ^ 1523932101 ^ Integer.parseInt("1286586912");
      this.D71mf1sr0X = 1047558354 ^ f2XDebsdBIi;
      var10 = 423164713 ^ var10;
      String var2 = "";
      this.combo = var2;
      String var6 = "Paste username:refreshToken, then Add or Login.";
      this.status = var6;
      int var7 = -7364430;
      this.statusColor = var7;
   }

   public boolean isOpen() {
      int var5 = 1883636936 ^ 1570839104 ^ 1685426888;
      var5 = 489870907 ^ var5;
      return this.open;
   }

   public void open() {
      int var14 = 883779553 ^ 1120771514 ^ 1685426888;
      var14 = 197558849 ^ var14;
      byte var2 = (byte)(433318611 ^ var14);
      this.open = (var2 != 0);
      byte var10 = (byte)(433318611 ^ var14);
      this.fieldFocused = (var10 != 0);
      String var5 = this.status;
      if (var5 != null) {
         var14 = 594641750 ^ var14;
         String var7 = this.status;
         byte var8 = (byte)((var7.isBlank()) ? 1 : 0);
         if (var8 == (983722372 ^ var14)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
                  case 26908365:
                     var14 = 1316103781 ^ var14;
                     return;
                  case 834642971:
                     return;
                  case 1820497609:
                  default:
                     throw new RuntimeException();
                  case 2011619399:
               }
            }
         }

         var14 = 1672623790 ^ var14;
      } else {
         var14 = qdvtnruldckqsrem(var14, 1086567928);
      }

      String var11 = crfefvfqgh(lpgjolboztfmelo(), qeiqywwcytlqrgo(), var14);
      this.idle(var11);
      var14 = 767561931 ^ var14;
   }

   public void close() {
      int var17 = 590071500 ^ 1600363550 ^ 1685426888;
      var17 = 1939121895 ^ var17;
      byte var2 = (byte)(1806266109 ^ var17);
      this.open = (var2 != 0);
      byte var10 = (byte)(1806266109 ^ var17);
      this.fieldFocused = (var10 != 0);
      byte var6 = (byte)((this.busy) ? 1 : 0);
      if (var6 != (1806266109 ^ var17)) {
         var17 = 853411034 ^ var17;
         int var11 = this.loginGeneration;
         byte var3 = (byte)(1500998182 ^ var17);
         int var12 = var11 + var3;
         this.loginGeneration = var12;
         byte var13 = (byte)(1500998183 ^ var17);
         this.busy = (var13 != 0);
         String var14 = crfefvfqgh(tclzxpdzgcqibgk(), qeiqywwcytlqrgo(), var17);
         this.fail(var14);
         var17 = 152829655 ^ var17;
      } else {
         var17 = qdvtnruldckqsrem(var17, 1002830349);
      }
   }

   public void toggle() {
      int var7 = 933596171 ^ 588047048 ^ 1685426888;
      var7 = 1808767002 ^ var7;
      byte var2 = (byte)((this.open) ? 1 : 0);
      if (var2 != (454255633 ^ var7)) {
         var7 = 1291105147 ^ var7;
         this.close();
         var7 = 953177840 ^ var7;
      } else {
         var7 = qdvtnruldckqsrem(var7, 691395663);
         this.open();
         var7 = 1561409988 ^ var7;
      }
   }

   public static void shutdown() {
      int var4 = 1920792184 ^ 876979069 ^ 1510337050;
      var4 = 1552510518 ^ var4;
      ExecutorService var0 = AUTH;
      List var1 = var0.shutdownNow();
   }

   public void renderExtract(GuiGraphics var1, Font var2, int var3, int var4, int var5, int var6) {
      int var411 = 878981690 ^ 1191560672 ^ 1685426888;
      var411 = 1589252130 ^ var411;
      byte var32 = (byte)((this.open) ? 1 : 0);
      if (var32 == (1236170032 ^ var411)) {
         var411 = 650317534 ^ var411;
      } else {
         var411 = 1142063191 ^ var411;
         float var117 = var5;
         float var154 = var6;
         this.layout(var117, var154);
         byte var118 = (byte)(230487399 ^ var411);
         byte var155 = (byte)(230487399 ^ var411);
         int var12 = -222497433 ^ var411;
         float var13 = 0.45F;
         int var318 = com.wimpyclient.p.g.withAlpha(var12, var13);
         var1.fill(var118, var155, var5, var6, var318);
         int var36 = this.panelX;
         int var38 = this.panelY;
         int var40 = this.panelW;
         int var42 = this.panelH;
         d.panel(var1, var36, var38, var40, var42);
         String var157 = crfefvfqgh(srrsoolhiacbsuz(), qeiqywwcytlqrgo(), var411);
         byte var250 = (byte)(230487401 ^ var411);
         int var205 = var36 + var250;
         byte var319 = (byte)(230487405 ^ var411);
         int var252 = var38 + var319;
         int var320 = -229768291 ^ var411;
         byte var370 = (byte)(230487399 ^ var411);
         var1.drawString(var2, var157, var205, var252, var320, (var370 != 0));
         double var46 = var3;
         double var159 = var4;
         int var254 = var36 + var40;
         byte var322 = (byte)(230487419 ^ var411);
         int var255 = var254 - var322;
         double var256 = var255;
         byte var14 = (byte)(230487393 ^ var411);
         int var372 = var38 + var14;
         double var373 = var372;
         double var15 = 20.0;
         double var17 = 20.0;
         byte var48 = (byte)((inside(var46, var159, var256, var373, var15, var17)) ? 1 : 0);
         String var161 = crfefvfqgh(tmyoplkwahnddgo(), qeiqywwcytlqrgo(), var411);
         int var207 = var36 + var40;
         byte var259 = (byte)(230487409 ^ var411);
         int var208 = var207 - var259;
         byte var323 = (byte)(230487405 ^ var411);
         int var261 = var38 + var323;
         int var369;
         if (var48 != (230487399 ^ var411)) {
            var411 = 1309166786 ^ var411;
            var369 = (short)(-1135931919 ^ var411);
            var411 = qdvtnruldckqsrem(var411, 460213216);
         } else {
            var411 = qdvtnruldckqsrem(var411, 1555324000);
            var369 = -1366881867 ^ var411;
            var411 = 164780866 ^ var411;
         }

         byte var375 = (byte)(1490743877 ^ var411);
         var1.drawString(var2, var161, var208, var261, var369, (var375 != 0));
         String var50 = com.wimpyclient.a.d.currentUsername();
         String var24 = var50;
         byte var163 = (byte)((var50.isBlank()) ? 1 : 0);
         String var202;
         if (var163 != (1490743877 ^ var411)) {
            var411 = 1650124202 ^ var411;
            var202 = crfefvfqgh(vfixmttrucbhzuz(), qeiqywwcytlqrgo(), var411);
            var411 = 12155957 ^ var411;
         } else {
            var411 = qdvtnruldckqsrem(var411, 1382065423);
            var202 = "Playing as " + var50;
            var411 = 813907088 ^ var411;
         }

         byte var262 = (byte)(976841684 ^ var411);
         int var210 = var36 + var262;
         byte var325 = (byte)(976841664 ^ var411);
         int var264 = var38 + var325;
         int var326 = -977876120 ^ var411;
         byte var376 = (byte)(976841690 ^ var411);
         var1.drawString(var2, var202, var210, var264, var326, (var376 != 0));
         int var124 = this.listX;
         int var166 = this.listY;
         int var212 = this.listX;
         int var266 = this.listW;
         int var213 = var212 + var266;
         int var268 = this.listY;
         int var328 = this.listH;
         int var269 = var268 + var328;
         var1.enableScissor(var124, var166, var213, var269);
         List var53 = com.wimpyclient.a.b.accounts();
         int var55 = this.listY;
         int var126 = this.scroll;
         int var56 = var55 - var126;
         int var26 = var56;
         byte var58 = (byte)((var53.isEmpty()) ? 1 : 0);
         if (var58 != (976841690 ^ var411)) {
            var411 = 1545219174 ^ var411;
            String var167 = crfefvfqgh(ipjjbihlrhovhsq(), qeiqywwcytlqrgo(), var411);
            int var215 = this.listX;
            byte var270 = (byte)(1713588148 ^ var411);
            int var216 = var215 + var270;
            int var272 = this.listY;
            byte var329 = (byte)(1713588150 ^ var411);
            int var273 = var272 + var329;
            int var330 = -1716721906 ^ var411;
            byte var377 = (byte)(1713588156 ^ var411);
            var1.drawString(var2, var167, var216, var273, var330, (var377 != 0));
            var411 = 30531909 ^ var411;
         } else {
            var411 = qdvtnruldckqsrem(var411, 1860253360);
            Iterator var90 = var53.iterator();
            Iterator var407 = var90;
            var411 = 1128895196 ^ var411;

            while (true) {
               byte var92 = (byte)((var407.hasNext()) ? 1 : 0);
               if (var92 == (395431862 ^ var411)) {
                  var411 = 1885563215 ^ var411;
                  break;
               }

               com.wimpyclient.a.a var95;
               byte var97;
               byte var115;
               label135: {
                  var411 = 1264239192 ^ var411;
                  Object var94 = var407.next();
                  var95 = (com.wimpyclient.a.a)var94;
                  String var137 = var95.username();
                  var97 = (byte)((var24.equalsIgnoreCase(var137)) ? 1 : 0);
                  double var99 = var3;
                  double var188 = var4;
                  int var300 = this.listX;
                  double var301 = var300;
                  double var390 = var26;
                  int var400 = this.listW;
                  double var401 = var400;
                  int var404 = this.rowH;
                  double var405 = var404;
                  byte var101 = (byte)((inside(var99, var188, var301, var390, var401, var405)) ? 1 : 0);
                  if (var101 != (1556811246 ^ var411)) {
                     var411 ^= 1380410529;
                     int var139 = this.listY;
                     if (var4 >= var139) {
                        var411 = 1803929275 ^ var411;
                        int var141 = this.listY;
                        int var191 = this.listH;
                        int var142 = var141 + var191;
                        if (var4 < var142) {
                           var411 = 21698789 ^ var411;
                           var115 = (byte)(1682093840 ^ var411);
                           var411 = qdvtnruldckqsrem(var411, 1109671765);
                           break label135;
                        }

                        var411 = 1772201747 ^ var411;
                     } else {
                        label132:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var411)) {
                              case 204472965:
                                 var411 ^= 35938728;
                                 break label132;
                              case 277671436:
                                 break;
                              case 1109490240:
                              default:
                                 throw new RuntimeException();
                              case 1259901468:
                                 break label132;
                           }
                        }
                     }
                  } else {
                     label126:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var411)) {
                           case 63518262:
                              var411 ^= 1348666633;
                              break label126;
                           case 598347953:
                              break;
                           case 1269819894:
                           default:
                              throw new RuntimeException();
                           case 1511210485:
                              break label126;
                        }
                     }
                  }

                  var115 = (byte)(212338919 ^ var411);
                  var411 = 718176419 ^ var411;
               }

               if (var97 != (644253764 ^ var411)) {
                  var411 = 2067172079 ^ var411;
                  int var153 = this.listX;
                  int var247 = this.listX;
                  int var315 = this.listW;
                  int var248 = var247 + var315;
                  int var366 = this.rowH;
                  int var317 = var26 + var366;
                  int var367 = -1572069247 ^ var411;
                  var1.fill(var153, var26, var248, var317, var367);
                  var411 = qdvtnruldckqsrem(var411, 525727950);
               } else {
                  label155:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var411)) {
                        case 169523739:
                           break label155;
                        case 174493285:
                           var411 ^= 921877117;
                           break label155;
                        case 1848318539:
                           break;
                        case 1983549060:
                        default:
                           throw new RuntimeException();
                     }
                  }

                  if (var115 != (278147641 ^ var411)) {
                     var411 = 1991131481 ^ var411;
                     int var144 = this.listX;
                     int var236 = this.listX;
                     int var304 = this.listW;
                     int var237 = var236 + var304;
                     int var354 = this.rowH;
                     int var306 = var26 + var354;
                     int var355 = -1726457008 ^ var411;
                     var1.fill(var144, var26, var237, var306, var355);
                     var411 = 608143621 ^ var411;
                  } else {
                     label147:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var411)) {
                           case 2044378:
                              var411 ^= 1385285724;
                              break label147;
                           case 356746444:
                              break;
                           case 483557276:
                              break label147;
                           case 1658914593:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  }
               }

               String var146 = var95.username();
               int var194 = this.listW;
               byte var238 = (byte)(1107687993 ^ var411);
               int var195 = var194 - var238;
               String var108 = d.ellipsize(var2, var146, var195);
               int var240 = this.listX;
               byte var307 = (byte)(1107688045 ^ var411);
               int var241 = var240 + var307;
               int var357 = this.rowH;
               int var309 = d.textY(var26, var357, var2);
               int var358 = -1107882849 ^ var411;
               byte var393 = (byte)(1107688037 ^ var411);
               var1.drawString(var2, var108, var241, var309, var358, (var393 != 0));
               int var198 = this.loginBtnX();
               byte var310 = (byte)(1107688033 ^ var411);
               int var243 = var26 + var310;
               byte var311 = (byte)(1107688009 ^ var411);
               int var360 = this.rowH;
               byte var394 = (byte)(1107688045 ^ var411);
               int var361 = var360 - var394;
               String var395 = crfefvfqgh(xgzfitysumvloth(), qeiqywwcytlqrgo(), var411);
               drawExtractButton(var1, var2, var198, var243, var311, var361, var395);
               int var200 = this.removeBtnX();
               byte var312 = (byte)(1107688033 ^ var411);
               int var245 = var26 + var312;
               byte var313 = (byte)(1107688051 ^ var411);
               int var363 = this.rowH;
               byte var396 = (byte)(1107688045 ^ var411);
               int var364 = var363 - var396;
               String var397 = crfefvfqgh(yecjsyicmkdoeue(), qeiqywwcytlqrgo(), var411);
               drawExtractButton(var1, var2, var200, var245, var313, var364, var397);
               int var151 = this.rowH;
               int var113 = var26 + var151;
               var26 = var113;
               var411 = qdvtnruldckqsrem(var411, 1435776467);
            }
         }

         var1.disableScissor();
         int var129 = this.fieldX;
         int var169 = this.fieldY;
         int var218 = this.fieldW;
         int var275 = this.fieldH;
         int var332 = this.fieldH;
         byte var378 = (byte)(1743955707 ^ var411);
         int var333 = var332 / var378;
         byte var380 = (byte)((this.fieldFocused) ? 1 : 0);
         int var398;
         if (var380 != (1743955705 ^ var411)) {
            var411 = 115734448 ^ var411;
            var398 = -1640144527 ^ var411;

            label112:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var411)) {
                  case 203246698:
                     var411 ^= 951288299;
                     break label112;
                  case 1128277446:
                     break;
                  case 1163742108:
                     break label112;
                  case 1854010177:
                  default:
                     throw new RuntimeException();
               }
            }
         } else {
            var411 = 38646473 ^ var411;
            var398 = -1699674584 ^ var411;
            var411 = 1008452754 ^ var411;
         }

         d.fillRound(var1, var129, var169, var218, var275, var333, var398);
         String var63 = this.combo;
         String var27 = var63;
         byte var65 = (byte)((this.fieldFocused) ? 1 : 0);
         if (var65 != (1503973538 ^ var411)) {
            var411 = 895023014 ^ var411;
            long var66 = System.nanoTime();
            long var170 = 400000000L;
            long var68 = var66 / var170;
            long var172 = 2L;
            long var70 = var68 % var172;
            long var174 = 0L;
            long var443;
            int var72 = (var443 = var70 - var174) == 0L ? 0 : (var443 < 0L ? -1 : 1);
            if (var72 == (1828464388 ^ var411)) {
               var411 = 450842843 ^ var411;
               String var74 = var63 + "|";
               var27 = var74;
               var411 = 714605825 ^ var411;
            } else {
               var411 = 809981402 ^ var411;
            }
         } else {
            var411 = 85959292 ^ var411;
         }

         label104: {
            String var76 = this.combo;
            byte var77 = (byte)((var76.isEmpty()) ? 1 : 0);
            if (var77 != (1555788510 ^ var411)) {
               var411 = 1072911214 ^ var411;
               byte var79 = (byte)((this.fieldFocused) ? 1 : 0);
               if (var79 == (1665671600 ^ var411)) {
                  var411 = 956632745 ^ var411;
                  String var176 = crfefvfqgh(gxjbvaxaekkkjvk(), qeiqywwcytlqrgo(), var411);
                  int var220 = this.fieldX;
                  byte var276 = (byte)(1515007761 ^ var411);
                  int var221 = var220 + var276;
                  int var278 = this.fieldY;
                  int var335 = this.fieldH;
                  int var279 = d.textY(var278, var335, var2);
                  int var336 = -1513975893 ^ var411;
                  byte var382 = (byte)(1515007769 ^ var411);
                  var1.drawString(var2, var176, var221, var279, var336, (var382 != 0));

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var411)) {
                        case 250990861:
                           var411 ^= 645166496;
                           break label104;
                        case 507881390:
                        default:
                           throw new RuntimeException();
                        case 1033067482:
                           break label104;
                        case 1757406320:
                     }
                  }
               }

               label101:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var411)) {
                     case 6005261:
                        var411 ^= 243834681;
                        break label101;
                     case 1244221080:
                        break;
                     case 1307301264:
                     default:
                        throw new RuntimeException();
                     case 1610310665:
                        break label101;
                  }
               }
            } else {
               var411 = 830196823 ^ var411;
            }

            int var293 = this.fieldW;
            byte var349 = (byte)(1841348249 ^ var411);
            int var294 = var293 - var349;
            String var186 = d.ellipsize(var2, var27, var294);
            int var233 = this.fieldX;
            byte var295 = (byte)(1841348225 ^ var411);
            int var234 = var233 + var295;
            int var297 = this.fieldY;
            int var351 = this.fieldH;
            int var298 = d.textY(var297, var351, var2);
            int var352 = -1842198413 ^ var411;
            byte var388 = (byte)(1841348233 ^ var411);
            var1.drawString(var2, var186, var234, var298, var352, (var388 != 0));
            var411 = 301589552 ^ var411;
         }

         int var178 = this.pasteX;
         int var223 = this.buttonY;
         int var281 = this.buttonW;
         int var338 = this.buttonH;
         String var383 = crfefvfqgh(seknourwgoitzpr(), qeiqywwcytlqrgo(), var411);
         drawExtractButton(var1, var2, var178, var223, var281, var338, var383);
         int var180 = this.addX;
         int var225 = this.buttonY;
         int var283 = this.buttonW;
         int var340 = this.buttonH;
         String var384 = crfefvfqgh(xzkektiosfpobhf(), qeiqywwcytlqrgo(), var411);
         drawExtractButton(var1, var2, var180, var225, var283, var340, var384);
         int var182 = this.loginX;
         int var227 = this.buttonY;
         int var285 = this.buttonW;
         int var342 = this.buttonH;
         String var385 = crfefvfqgh(pddrwnsembbwfei(), qeiqywwcytlqrgo(), var411);
         drawExtractButton(var1, var2, var182, var227, var285, var342, var385);
         byte var85 = (byte)((this.busy) ? 1 : 0);
         String var116;
         if (var85 != (2084133561 ^ var411)) {
            var411 = 1643677477 ^ var411;
            var116 = crfefvfqgh(yqcnmedomhrewnx(), qeiqywwcytlqrgo(), var411);

            label83:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var411)) {
                  case 161972383:
                     var411 ^= 1160493659;
                     break label83;
                  case 323848430:
                     break;
                  case 1095784457:
                     break label83;
                  case 1761307768:
                  default:
                     throw new RuntimeException();
               }
            }
         } else {
            var411 = qdvtnruldckqsrem(var411, 702066212);
            var116 = this.status;
            var411 = 218862426 ^ var411;
         }

         byte var343 = (byte)(1491757019 ^ var411);
         int var287 = var40 - var343;
         String var184 = d.ellipsize(var2, var116, var287);
         byte var288 = (byte)(1491757001 ^ var411);
         int var230 = var36 + var288;
         int var290 = var38 + var42;
         byte var345 = (byte)(1491757011 ^ var411);
         int var291 = var290 - var345;
         byte var347 = (byte)((this.busy) ? 1 : 0);
         int var368;
         if (var347 != (1491756999 ^ var411)) {
            var411 = 1800122855 ^ var411;
            var368 = (short)(-866229644 ^ var411);
            var411 = 1901383322 ^ var411;
         } else {
            var411 = qdvtnruldckqsrem(var411, 1428959711);
            var368 = this.statusColor;
            var411 = 1328762530 ^ var411;
         }

         byte var386 = (byte)(1123358906 ^ var411);
         var1.drawString(var2, var184, var230, var291, var368, (var386 != 0));
      }
   }

   private static void drawExtractButton(GuiGraphics var0, Font var1, int var2, int var3, int var4, int var5, String var6) {
      int var34 = 1467362711 ^ 67211236 ^ 1510337050;
      var34 = 1127579335 ^ var34;
      byte var12 = (byte)(1246181034 ^ var34);
      int var13 = -1251146090 ^ var34;
      d.fillRound(var0, var2, var3, var4, var5, var12, var13);
      int var25 = var1.width(var6);
      int var20 = var4 - var25;
      byte var26 = (byte)(1246181036 ^ var34);
      int var21 = var20 / var26;
      int var18 = var2 + var21;
      int var23 = d.textY(var3, var5, var1);
      int var28 = -1246379948 ^ var34;
      byte var31 = (byte)(1246181038 ^ var34);
      var0.drawString(var1, var6, var18, var23, var28, (var31 != 0));
   }

   public void render(com.wimpyclient.m.b var1, int var2, int var3, float var4, float var5) {
      int var495 = 1638706331 ^ 2043386201 ^ 1685426888;
      var495 = 1499768674 ^ var495;
      byte var32 = (byte)((this.open) ? 1 : 0);
      if (var32 == (628490344 ^ var495)) {
         var495 = 925329432 ^ var495;
      } else {
         var495 = qdvtnruldckqsrem(var495, 1990941008);
         this.layout(var4, var5);
         com.wimpyclient.o.b var34 = com.wimpyclient.o.b.INSTANCE;
         com.wimpyclient.o.b var19 = var34;
         float var132 = 0.0F;
         float var193 = 0.0F;
         float var11 = 0.0F;
         int var12 = -1394779848 ^ var495;
         float var13 = 0.45F;
         int var411 = com.wimpyclient.p.g.withAlpha(var12, var13);
         var1.rect(var132, var193, var4, var5, var11, var411);
         int var37 = this.panelX;
         float var38 = var37;
         int var40 = this.panelY;
         float var41 = var40;
         int var43 = this.panelW;
         float var44 = var43;
         int var46 = this.panelH;
         float var47 = var46;
         float var372 = 10.0F;
         com.wimpyclient.k.e.glassPanel(var1, var38, var41, var44, var47, var372);
         float var195 = 14.0F;
         float var135 = var38 + var195;
         float var266 = 16.0F;
         float var197 = var41 + var266;
         float var267 = 14.0F;
         int var319 = var34.textPrimary();
         String var373 = crfefvfqgh(kibasfwpijpnwka(), qeiqywwcytlqrgo(), var495);
         float var50 = var1.text(var135, var197, var267, var319, var373);
         double var52 = var2;
         double var199 = var3;
         float var321 = var38 + var44;
         float var375 = 28.0F;
         float var322 = var321 - var375;
         double var323 = var322;
         float var441 = 6.0F;
         float var413 = var41 + var441;
         double var414 = var413;
         double var14 = 20.0;
         double var17 = 20.0;
         byte var54 = (byte)((inside(var52, var199, var323, var414, var14, var17)) ? 1 : 0);
         float var137 = var38 + var44;
         float var202 = 18.0F;
         float var138 = var137 - var202;
         float var268 = 16.0F;
         float var204 = var41 + var268;
         float var269 = 14.0F;
         int var327;
         if (var54 != (1407015224 ^ var495)) {
            var495 = 2119568884 ^ var495;
            var327 = var34.warn();

            label234:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                  case 125383383:
                  default:
                     throw new RuntimeException();
                  case 138271168:
                     var495 ^= 22257055;
                  case 1081557025:
                     break label234;
                  case 1912296281:
               }
            }
         } else {
            label227:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                  case 41717505:
                     var495 ^= 1893937440;
                  case 739788639:
                     break label227;
                  case 1230550719:
                  default:
                     throw new RuntimeException();
                  case 1382520541:
               }
            }

            var327 = var34.textMuted();
            var495 = 266772811 ^ var495;
         }

         String var376 = crfefvfqgh(ucanqakgxoconjc(), qeiqywwcytlqrgo(), var495);
         var1.textCentered(var138, var204, var269, var327, var376);
         String var56 = com.wimpyclient.a.d.currentUsername();
         String var25 = var56;
         float var205 = 14.0F;
         float var140 = var38 + var205;
         float var270 = 34.0F;
         float var207 = var41 + var270;
         float var271 = 11.0F;
         int var329 = var34.textMuted();
         byte var378 = (byte)((var56.isBlank()) ? 1 : 0);
         String var380;
         if (var378 != (752404819 ^ var495)) {
            var495 = 1069028547 ^ var495;
            var380 = crfefvfqgh(eqmebrqwqkrlpew(), qeiqywwcytlqrgo(), var495);
            var495 = 722562460 ^ var495;
         } else {
            label218:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                  case 35340335:
                     break label218;
                  case 115616456:
                     var495 ^= 434200744;
                     break label218;
                  case 384373724:
                  default:
                     throw new RuntimeException();
                  case 2128457139:
               }
            }

            var380 = "Playing as " + var56;
            var495 = 222829047 ^ var495;
         }

         float var58 = var1.text(var140, var207, var271, var329, var380);
         var1.save();
         int var142 = this.listX;
         float var143 = var142;
         int var209 = this.listY;
         float var210 = var209;
         int var273 = this.listW;
         float var274 = var273;
         int var331 = this.listH;
         float var332 = var331;
         var1.scissor(var143, var210, var274, var332);
         List var61 = com.wimpyclient.a.b.accounts();
         List var26 = var61;
         int var63 = this.listY;
         int var145 = this.scroll;
         int var64 = var63 - var145;
         int var27 = var64;
         byte var66 = (byte)((var61.isEmpty()) ? 1 : 0);
         if (var66 != (946974732 ^ var495)) {
            var495 = 1275579201 ^ var495;
            int var190 = this.listX;
            byte var260 = (byte)(1953921861 ^ var495);
            int var191 = var190 + var260;
            float var192 = var191;
            int var262 = this.listY;
            byte var315 = (byte)(1953921885 ^ var495);
            int var263 = var262 + var315;
            float var264 = var263;
            float var316 = 12.0F;
            int var370 = var34.textDisabled();
            String var410 = crfefvfqgh(gikwzeroldhtjoj(), qeiqywwcytlqrgo(), var495);
            float var131 = var1.text(var192, var264, var316, var370, var410);

            label209:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                  case 27654803:
                     var495 ^= 48287373;
                  case 278074150:
                     break label209;
                  case 346558138:
                     break;
                  case 2135302840:
                  default:
                     throw new RuntimeException();
               }
            }
         } else {
            label202:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                  case 39977696:
                     break;
                  case 121983040:
                     break label202;
                  case 224165222:
                     var495 ^= 1047722728;
                     break label202;
                  case 600342066:
                  default:
                     throw new RuntimeException();
               }
            }

            byte var67 = (byte)(100879076 ^ var495);
            int var28 = var67;
            var495 = 872657334 ^ var495;

            label194:
            while (true) {
               int var147 = var26.size();
               if (var28 >= var147) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                        case 14800110:
                           var495 ^= 1150701202;
                           break label194;
                        case 1557541002:
                        default:
                           throw new RuntimeException();
                        case 1866642942:
                           break;
                        case 1926728153:
                           break label194;
                     }
                  }
               }

               com.wimpyclient.a.a var71;
               byte var73;
               byte var90;
               label180: {
                  var495 = 847829839 ^ var495;
                  Object var70 = var26.get(var28);
                  var71 = (com.wimpyclient.a.a)var70;
                  String var150 = var71.username();
                  var73 = (byte)((var25.equalsIgnoreCase(var150)) ? 1 : 0);
                  double var75 = var2;
                  double var212 = var3;
                  int var334 = this.listX;
                  double var335 = var334;
                  double var417 = var27;
                  int var458 = this.listW;
                  double var459 = var458;
                  int var487 = this.rowH;
                  double var488 = var487;
                  byte var77 = (byte)((inside(var75, var212, var335, var417, var459, var488)) ? 1 : 0);
                  if (var77 != (8921117 ^ var495)) {
                     var495 = 1662874653 ^ var495;
                     int var152 = this.listY;
                     if (var3 >= var152) {
                        var495 = 1008509905 ^ var495;
                        int var154 = this.listY;
                        int var215 = this.listH;
                        int var155 = var154 + var215;
                        if (var3 < var155) {
                           var495 = 1108313965 ^ var495;
                           var90 = (byte)(495349949 ^ var495);

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                                 case 154429418:
                                    var495 ^= 466576238;
                                    break label180;
                                 case 1715169202:
                                    break;
                                 case 1911954260:
                                 default:
                                    throw new RuntimeException();
                                 case 2002608832:
                                    break label180;
                              }
                           }
                        }

                        var495 = 823211604 ^ var495;
                     } else {
                        label177:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                              case 15806805:
                                 var495 ^= 218994053;
                              case 183266263:
                                 break label177;
                              case 933243258:
                              default:
                                 throw new RuntimeException();
                              case 1275738727:
                           }
                        }
                     }
                  } else {
                     var495 = 1846600088 ^ var495;
                  }

                  var90 = (byte)(1855504773 ^ var495);
                  var495 = 1758581335 ^ var495;
               }

               if (var73 != (105452498 ^ var495)) {
                  var495 = 441509454 ^ var495;
                  int var157 = this.listX;
                  float var158 = var157;
                  float var217 = var27;
                  int var276 = this.listW;
                  float var277 = var276;
                  int var338 = this.rowH;
                  float var339 = var338;
                  float var381 = 5.0F;
                  int var420 = var19.moduleActiveFill();
                  var1.rect(var158, var217, var277, var339, var381, var420);
                  var495 = 1735928179 ^ var495;
               } else {
                  var495 = 825242880 ^ var495;
                  if (var90 != (930686674 ^ var495)) {
                     var495 = 1746126742 ^ var495;
                     int var168 = this.listX;
                     float var169 = var168;
                     float var227 = var27;
                     int var288 = this.listW;
                     float var289 = var288;
                     int var348 = this.rowH;
                     float var349 = var348;
                     float var390 = 5.0F;
                     int var427 = var19.rowHover();
                     var1.rect(var169, var227, var289, var349, var390, var427);
                     var495 = 604716459 ^ var495;
                  } else {
                     var495 = qdvtnruldckqsrem(var495, 1276705341);
                  }
               }

               int var160 = this.listX;
               byte var218 = (byte)(2070011111 ^ var495);
               int var161 = var160 + var218;
               float var162 = var161;
               float var220 = var27;
               int var279 = this.rowH;
               float var280 = var279;
               float var340 = 2.0F;
               float var281 = var280 / var340;
               float var221 = var220 + var281;
               float var282 = 12.0F;
               int var342 = var19.textPrimary();
               float var421 = 12.0F;
               String var443 = var71.username();
               int var462 = this.listW;
               byte var16 = (byte)(2070011059 ^ var495);
               int var463 = var462 - var16;
               float var464 = var463;
               String var383 = var1.ellipsize(var421, var443, var464);
               float var83 = var1.text(var162, var221, var282, var342, var383);
               int var223 = this.loginBtnX();
               byte var343 = (byte)(2070011115 ^ var495);
               int var284 = var27 + var343;
               byte var344 = (byte)(2070011075 ^ var495);
               int var385 = this.rowH;
               byte var422 = (byte)(2070011111 ^ var495);
               int var386 = var385 - var422;
               String var423 = crfefvfqgh(ymojotgjjhvvqvi(), qeiqywwcytlqrgo(), var495);
               this.drawButton(var1, var223, var284, var344, var386, var423, var2, var3, var19);
               int var225 = this.removeBtnX();
               byte var345 = (byte)(2070011115 ^ var495);
               int var286 = var27 + var345;
               byte var346 = (byte)(2070011129 ^ var495);
               int var388 = this.rowH;
               byte var424 = (byte)(2070011111 ^ var495);
               int var389 = var388 - var424;
               String var425 = crfefvfqgh(pfxhhccyzssejzu(), qeiqywwcytlqrgo(), var495);
               this.drawButton(var1, var225, var286, var346, var389, var425, var2, var3, var19);
               int var166 = this.rowH;
               int var87 = var27 + var166;
               var27 = var87;
               var28 += 2070011118 ^ var495;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                     case 252569454:
                        var495 ^= 1231103933;
                        continue label194;
                     case 355799531:
                     default:
                        throw new RuntimeException();
                     case 1077335126:
                        break;
                     case 2115392786:
                        continue label194;
                  }
               }
            }
         }

         var1.restore();
         int var171 = this.fieldX;
         float var172 = var171;
         int var229 = this.fieldY;
         float var230 = var229;
         int var291 = this.fieldW;
         float var292 = var291;
         int var351 = this.fieldH;
         float var352 = var351;
         int var392 = this.fieldH;
         float var393 = var392;
         float var428 = 2.0F;
         float var394 = var393 / var428;
         byte var430 = (byte)((this.fieldFocused) ? 1 : 0);
         int var440;
         if (var430 != (1989588416 ^ var495)) {
            var495 = 1364317276 ^ var495;
            var440 = var19.track();
            var495 = 163271847 ^ var495;
         } else {
            var495 = 1768898590 ^ var495;
            var440 = var19.field();
            var495 = 830849253 ^ var495;
         }

         var1.rect(var172, var230, var292, var352, var394, var440);
         int var174 = this.fieldX;
         float var175 = var174;
         int var232 = this.fieldY;
         float var233 = var232;
         int var294 = this.fieldW;
         float var295 = var294;
         int var354 = this.fieldH;
         float var355 = var354;
         int var396 = this.fieldH;
         float var397 = var396;
         float var432 = 2.0F;
         float var398 = var397 / var432;
         float var433 = 1.0F;
         byte var447 = (byte)((this.fieldFocused) ? 1 : 0);
         int var456;
         if (var447 != (779892027 ^ var495)) {
            var495 = 757205858 ^ var495;
            var456 = var19.accentBright();

            label147:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                  case 52975917:
                     var495 ^= 523811146;
                     break label147;
                  case 663503827:
                     break;
                  case 692820771:
                     break label147;
                  case 1840637731:
                  default:
                     throw new RuntimeException();
               }
            }
         } else {
            var495 = 1308556509 ^ var495;
            var456 = var19.accent();
            var495 = 2145668853 ^ var495;
         }

         byte var468 = (byte)((this.fieldFocused) ? 1 : 0);
         float var478;
         if (var468 != (476481299 ^ var495)) {
            var495 = 281589117 ^ var495;
            var478 = 0.9F;

            label138:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                  case 143756571:
                     var495 ^= 1831518017;
                  case 236023674:
                     break label138;
                  case 888494561:
                     break;
                  case 1017011486:
                  default:
                     throw new RuntimeException();
               }
            }
         } else {
            var495 = 108963881 ^ var495;
            var478 = 0.35F;
            var495 = 2073862677 ^ var495;
         }

         int var449 = com.wimpyclient.p.g.withAlpha(var456, var478);
         var1.rectOutline(var175, var233, var295, var355, var398, var433, var449);
         String var95 = this.combo;
         String var490 = var95;
         byte var97 = (byte)((this.fieldFocused) ? 1 : 0);
         if (var97 != (1636076847 ^ var495)) {
            var495 = 1694439025 ^ var495;
            long var98 = System.nanoTime();
            long var234 = 400000000L;
            long var100 = var98 / var234;
            long var236 = 2L;
            long var102 = var100 % var236;
            long var238 = 0L;
            long var529;
            int var104 = (var529 = var102 - var238) == 0L ? 0 : (var529 < 0L ? -1 : 1);
            if (var104 == (91986782 ^ var495)) {
               var495 = 325033257 ^ var495;
               String var106 = var95 + "|";
               var490 = var106;
               var495 = 1334699872 ^ var495;
            } else {
               var495 = qdvtnruldckqsrem(var495, 1557297737);
            }
         } else {
            var495 = qdvtnruldckqsrem(var495, 942500920);
         }

         label130: {
            String var108 = this.combo;
            byte var109 = (byte)((var108.isEmpty()) ? 1 : 0);
            if (var109 != (1504305431 ^ var495)) {
               var495 = 195949645 ^ var495;
               byte var111 = (byte)((this.fieldFocused) ? 1 : 0);
               if (var111 == (1375999322 ^ var495)) {
                  var495 = 1820421561 ^ var495;
                  int var177 = this.fieldX;
                  byte var240 = (byte)(1048934635 ^ var495);
                  int var178 = var177 + var240;
                  float var179 = var178;
                  int var242 = this.fieldY;
                  float var243 = var242;
                  int var297 = this.fieldH;
                  float var298 = var297;
                  float var356 = 2.0F;
                  float var299 = var298 / var356;
                  float var244 = var243 + var299;
                  float var300 = 11.0F;
                  int var358 = var19.textDisabled();
                  String var399 = crfefvfqgh(ejsfxvenjelqdyc(), qeiqywwcytlqrgo(), var495);
                  float var113 = var1.text(var179, var244, var300, var358, var399);
                  var495 = 1580243929 ^ var495;
                  break label130;
               }

               var495 = 2116835871 ^ var495;
            } else {
               var495 = 1971433042 ^ var495;
            }

            int var186 = this.fieldX;
            byte var255 = (byte)(740839245 ^ var495);
            int var187 = var186 + var255;
            float var188 = var187;
            int var257 = this.fieldY;
            float var258 = var257;
            int var311 = this.fieldH;
            float var312 = var311;
            float var366 = 2.0F;
            float var313 = var312 / var366;
            float var259 = var258 + var313;
            float var314 = 11.0F;
            int var368 = var19.textPrimary();
            float var438 = 11.0F;
            int var475 = this.fieldW;
            byte var485 = (byte)(740839253 ^ var495);
            int var476 = var475 - var485;
            float var477 = var476;
            String var409 = var1.ellipsize(var438, var490, var477);
            float var129 = var1.text(var188, var259, var314, var368, var409);
            var495 = 1285401727 ^ var495;
         }

         int var246 = this.pasteX;
         int var302 = this.buttonY;
         int var360 = this.buttonW;
         int var401 = this.buttonH;
         String var434 = crfefvfqgh(muemlbhyxgfreyp(), qeiqywwcytlqrgo(), var495);
         this.drawButton(var1, var246, var302, var360, var401, var434, var2, var3, var19);
         int var248 = this.addX;
         int var304 = this.buttonY;
         int var362 = this.buttonW;
         int var403 = this.buttonH;
         String var435 = crfefvfqgh(osoltfzbhkmasht(), qeiqywwcytlqrgo(), var495);
         this.drawButton(var1, var248, var304, var362, var403, var435, var2, var3, var19);
         int var250 = this.loginX;
         int var306 = this.buttonY;
         int var364 = this.buttonW;
         int var405 = this.buttonH;
         String var436 = crfefvfqgh(nbnuzyoxbknilgk(), qeiqywwcytlqrgo(), var495);
         this.drawButton(var1, var250, var306, var364, var405, var436, var2, var3, var19);
         byte var118 = (byte)((this.busy) ? 1 : 0);
         String var127;
         if (var118 != (1622532922 ^ var495)) {
            var495 = 457600652 ^ var495;
            var127 = crfefvfqgh(brfnkruqbsoajbd(), qeiqywwcytlqrgo(), var495);

            label122:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                  case 2595171:
                     var495 ^= 352050301;
                     break label122;
                  case 953066824:
                     break;
                  case 1361536959:
                     break label122;
                  case 1881179762:
                  default:
                     throw new RuntimeException();
               }
            }
         } else {
            label115:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                  case 190843125:
                     var495 ^= 1210521597;
                     break label115;
                  case 1759414430:
                     break;
                  case 1775660634:
                     break label115;
                  case 2106791890:
                  default:
                     throw new RuntimeException();
               }
            }

            var127 = this.status;
            var495 = 1201317132 ^ var495;
         }

         byte var121 = (byte)((this.busy) ? 1 : 0);
         int var126;
         if (var121 == (1862816203 ^ var495)) {
            var495 = qdvtnruldckqsrem(var495, 1970112883);
            var126 = this.statusColor;
            var495 = 1408867646 ^ var495;
         } else {
            var495 = 1390020142 ^ var495;
            var126 = var19.warn();

            label108:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var495)) {
                  case 130529177:
                     var495 = 1951273571 ^ var495;
                     break label108;
                  case 818188522:
                  default:
                     throw new RuntimeException();
                  case 1305984069:
                     break label108;
                  case 1500573656:
               }
            }
         }

         float var251 = 14.0F;
         float var184 = var38 + var251;
         float var253 = var41 + var47;
         float var308 = 16.0F;
         float var254 = var253 - var308;
         float var309 = 11.0F;
         float var437 = 11.0F;
         float var484 = 28.0F;
         float var473 = var44 - var484;
         String var407 = var1.ellipsize(var437, var127, var473);
         float var124 = var1.text(var184, var254, var309, var126, var407);
      }
   }

   public boolean mouseClicked(double var1, double var3, int var5) {
      int var292 = 765158824 ^ 1229278422 ^ 1685426888;
      var292 = 297701752 ^ var292;
      byte var26 = (byte)((this.open) ? 1 : 0);
      if (var26 == (286599886 ^ var292)) {
         var292 = 1630393316 ^ var292;
         return (((byte)(1882781994 ^ var292)) != 0);
      } else {
         var292 = 555822799 ^ var292;
         this.layoutGui();
         byte var7 = (byte)(808715264 ^ var292);
         if (var5 == var7) {
            var292 = 527312130 ^ var292;
            this.close();
            q.click();
            return (((byte)(794435842 ^ var292)) != 0);
         } else {
            var292 = 638819514 ^ var292;
            if (var5 != (371693755 ^ var292)) {
               var292 = 257752530 ^ var292;
               return (((byte)(427517288 ^ var292)) != 0);
            } else {
               var292 = qdvtnruldckqsrem(var292, 1642637022);
               int var150 = this.panelX;
               int var183 = this.panelW;
               int var151 = var150 + var183;
               byte var184 = (byte)(2010070649 ^ var292);
               int var152 = var151 - var184;
               double var153 = var152;
               int var189 = this.panelY;
               byte var15 = (byte)(2010070627 ^ var292);
               int var190 = var189 + var15;
               double var191 = var190;
               double var16 = 20.0;
               double var19 = 20.0;
               byte var33 = (byte)((inside(var1, var3, var153, var191, var16, var19)) ? 1 : 0);
               if (var33 != (2010070629 ^ var292)) {
                  var292 = 555361338 ^ var292;
                  this.close();
                  q.click();
                  return (((byte)(1456806494 ^ var292)) != 0);
               } else {
                  var292 = 1782764436 ^ var292;
                  int var156 = this.panelX;
                  double var157 = var156;
                  int var194 = this.panelY;
                  double var195 = var194;
                  int var227 = this.panelW;
                  double var228 = var227;
                  int var256 = this.panelH;
                  double var257 = var256;
                  byte var36 = (byte)((inside(var1, var3, var157, var195, var228, var257)) ? 1 : 0);
                  if (var36 == (495840753 ^ var292)) {
                     var292 = 2124712829 ^ var292;
                     this.close();
                     q.click();
                     return (((byte)(1663657613 ^ var292)) != 0);
                  } else {
                     var292 = qdvtnruldckqsrem(var292, 259006197);
                     byte var38 = (byte)((this.busy) ? 1 : 0);
                     if (var38 != (318632708 ^ var292)) {
                        var292 = 368011817 ^ var292;
                        return (((byte)(118659372 ^ var292)) != 0);
                     } else {
                        com.wimpyclient.a.a var62;
                        label112:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var292)) {
                              case 80483370:
                                 var292 ^= 1616434641;
                              case 1078432412:
                                 int var186 = this.fieldX;
                                 double var187 = var186;
                                 int var221 = this.fieldY;
                                 double var222 = var221;
                                 int var251 = this.fieldW;
                                 double var252 = var251;
                                 int var285 = this.fieldH;
                                 double var286 = var285;
                                 boolean var105 = inside(var1, var3, var187, var222, var252, var286);
                                 this.fieldFocused = var105;
                                 int var160 = this.pasteX;
                                 double var161 = var160;
                                 int var198 = this.buttonY;
                                 double var199 = var198;
                                 int var231 = this.buttonW;
                                 double var232 = var231;
                                 int var260 = this.buttonH;
                                 double var261 = var260;
                                 byte var43 = (byte)((inside(var1, var3, var161, var199, var232, var261)) ? 1 : 0);
                                 if (var43 != (1923426005 ^ var292)) {
                                    var292 = 1034452410 ^ var292;
                                    this.pasteClipboard();
                                    q.click();
                                    return (((byte)(1326275438 ^ var292)) != 0);
                                 }

                                 label109:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var292)) {
                                       case 236947865:
                                          var292 ^= 1793110721;
                                          break label109;
                                       case 886423862:
                                       default:
                                          throw new IllegalStateException();
                                       case 1095358595:
                                          break label109;
                                       case 1335471362:
                                    }
                                 }

                                 int var164 = this.addX;
                                 double var165 = var164;
                                 int var202 = this.buttonY;
                                 double var203 = var202;
                                 int var235 = this.buttonW;
                                 double var236 = var235;
                                 int var264 = this.buttonH;
                                 double var265 = var264;
                                 byte var46 = (byte)((inside(var1, var3, var165, var203, var236, var265)) ? 1 : 0);
                                 if (var46 != (407213076 ^ var292)) {
                                    var292 = 168758546 ^ var292;
                                    byte var115 = (byte)(306878726 ^ var292);
                                    this.addFromField((var115 != 0));
                                    q.click();
                                    return (((byte)(306878727 ^ var292)) != 0);
                                 }

                                 var292 = 1924754335 ^ var292;
                                 int var168 = this.loginX;
                                 double var169 = var168;
                                 int var206 = this.buttonY;
                                 double var207 = var206;
                                 int var239 = this.buttonW;
                                 double var240 = var239;
                                 int var268 = this.buttonH;
                                 double var269 = var268;
                                 byte var49 = (byte)((inside(var1, var3, var169, var207, var240, var269)) ? 1 : 0);
                                 if (var49 != (1794965387 ^ var292)) {
                                    var292 = 1931124177 ^ var292;
                                    byte var106 = (byte)(434528859 ^ var292);
                                    this.addFromField((var106 != 0));
                                    q.click();
                                    return (((byte)(434528859 ^ var292)) != 0);
                                 }

                                 var292 = qdvtnruldckqsrem(var292, 1228696169);
                                 List var52 = com.wimpyclient.a.b.accounts();
                                 int var54 = this.listY;
                                 int var108 = this.scroll;
                                 int var55 = var54 - var108;
                                 int var23 = var55;
                                 Iterator var57 = var52.iterator();
                                 Iterator var24 = var57;
                                 var292 = 568419875 ^ var292;

                                 while (true) {
                                    byte var59 = (byte)((var24.hasNext()) ? 1 : 0);
                                    if (var59 == (35779521 ^ var292)) {
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var292)) {
                                             case 33543845:
                                                var292 ^= 1408059236;
                                                return (((byte)(1372370084 ^ var292)) != 0);
                                             case 176870533:
                                             default:
                                                throw new IllegalStateException();
                                             case 1380121701:
                                                return (((byte)(1372370084 ^ var292)) != 0);
                                             case 1966817397:
                                          }
                                       }
                                    }

                                    var292 = 1112181754 ^ var292;
                                    Object var61 = var24.next();
                                    var62 = (com.wimpyclient.a.a)var61;
                                    int var125 = this.listY;
                                    double var126 = var125;
                                    double var320;
                                    int var65 = (var320 = var3 - var126) == 0.0 ? 0 : (var320 < 0.0 ? -1 : 1);
                                    if (var65 >= (1080784955 ^ var292)) {
                                       var292 = 1171866276 ^ var292;
                                       int var129 = this.listY;
                                       int var147 = this.listH;
                                       int var130 = var129 + var147;
                                       double var131 = var130;
                                       double var321;
                                       int var68 = (var321 = var3 - var131) == 0.0 ? 0 : (var321 < 0.0 ? -1 : 1);
                                       if (var68 < (95566495 ^ var292)) {
                                          var292 = 718275095 ^ var292;
                                          double var134 = var23;
                                          double var322;
                                          int var71 = (var322 = var3 - var134) == 0.0 ? 0 : (var322 < 0.0 ? -1 : 1);
                                          if (var71 >= (794966152 ^ var292)) {
                                             var292 = 1306283223 ^ var292;
                                             int var149 = this.rowH;
                                             int var137 = var23 + var149;
                                             double var138 = var137;
                                             double var323;
                                             int var74 = (var323 = var3 - var138) == 0.0 ? 0 : (var323 < 0.0 ? -1 : 1);
                                             if (var74 < (1656648799 ^ var292)) {
                                                var292 = 1829197873 ^ var292;
                                                int var172 = this.removeBtnX();
                                                double var173 = var172;
                                                byte var224 = (byte)(263793770 ^ var292);
                                                int var210 = var23 + var224;
                                                double var211 = var210;
                                                double var242 = 22.0;
                                                int var272 = this.rowH;
                                                byte var288 = (byte)(263793766 ^ var292);
                                                int var273 = var272 - var288;
                                                double var274 = var273;
                                                byte var77 = (byte)((inside(var1, var3, var173, var211, var242, var274)) ? 1 : 0);
                                                if (var77 != (263793774 ^ var292)) {
                                                   var292 = 1095687873 ^ var292;
                                                   com.wimpyclient.a.b.remove(var62);
                                                   String var113 = var62.username();
                                                   String var114 = "Removed " + var113;
                                                   this.idle(var114);
                                                   q.click();
                                                   return (((byte)(1324872366 ^ var292)) != 0);
                                                }

                                                var292 = 1453404216 ^ var292;
                                                int var176 = this.loginBtnX();
                                                double var177 = var176;
                                                byte var225 = (byte)(1494752338 ^ var292);
                                                int var214 = var23 + var225;
                                                double var215 = var214;
                                                double var244 = 44.0;
                                                int var277 = this.rowH;
                                                byte var289 = (byte)(1494752350 ^ var292);
                                                int var278 = var277 - var289;
                                                double var279 = var278;
                                                byte var80 = (byte)((inside(var1, var3, var177, var215, var244, var279)) ? 1 : 0);
                                                if (var80 != (1494752342 ^ var292)) {
                                                   while (true) {
                                                      switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var292)) {
                                                         case 211742718:
                                                            var292 ^= 1315932416;
                                                            break label112;
                                                         case 214147284:
                                                         default:
                                                            throw new IllegalStateException();
                                                         case 702439063:
                                                            break label112;
                                                         case 1810016981:
                                                      }
                                                   }
                                                }

                                                var292 = 1462153397 ^ var292;
                                                int var180 = this.listX;
                                                double var181 = var180;
                                                double var218 = var23;
                                                int var247 = this.listW;
                                                byte var254 = (byte)(238988453 ^ var292);
                                                int var248 = var247 - var254;
                                                double var249 = var248;
                                                int var282 = this.rowH;
                                                double var283 = var282;
                                                byte var83 = (byte)((inside(var1, var3, var181, var218, var249, var283)) ? 1 : 0);
                                                if (var83 != (238988515 ^ var292)) {
                                                   var292 = 424229301 ^ var292;
                                                   break label112;
                                                }

                                                var292 = qdvtnruldckqsrem(var292, 19975623);
                                             } else {
                                                var292 = 1840256379 ^ var292;
                                             }
                                          } else {
                                             var292 = 543971756 ^ var292;
                                          }
                                       } else {
                                          var292 = 180116411 ^ var292;
                                       }
                                    } else {
                                       var292 = 1332025631 ^ var292;
                                    }

                                    int var111 = this.rowH;
                                    int var87 = var23 + var111;
                                    var23 = var87;
                                    var292 = 221221605 ^ var292;
                                 }
                              case 708525651:
                              default:
                                 throw new IllegalStateException();
                              case 1662804345:
                           }
                        }

                        this.login(var62);
                        q.click();
                        return (((byte)(393712983 ^ var292)) != 0);
                     }
                  }
               }
            }
         }
      }
   }

   public boolean mouseScrolled(double var1, double var3, double var5) {
      int var64 = 1733896556 ^ 1532573548 ^ 1685426888;
      var64 = 471068877 ^ var64;
      byte var18 = (byte)((this.open) ? 1 : 0);
      if (var18 == (1147567109 ^ var64)) {
         var64 = 1802747513 ^ var64;
         return (((byte)(789955196 ^ var64)) != 0);
      } else {
         var64 = qdvtnruldckqsrem(var64, 430172829);
         this.layoutGui();
         int var49 = this.listX;
         double var50 = var49;
         int var54 = this.listY;
         double var55 = var54;
         int var57 = this.listW;
         double var58 = var57;
         int var60 = this.listH;
         double var61 = var60;
         byte var23 = (byte)((inside(var1, var3, var50, var55, var58, var61)) ? 1 : 0);
         if (var23 == (1573230232 ^ var64)) {
            var64 = 126639221 ^ var64;
            return (((byte)(1514785516 ^ var64)) != 0);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var64)) {
                  case 95325699:
                     var64 ^= 566374698;
                  case 1730223420:
                     List var24 = com.wimpyclient.a.b.accounts();
                     int var25 = var24.size();
                     int var32 = this.rowH;
                     int var26 = var25 * var32;
                     byte var27 = (byte)(2080876466 ^ var64);
                     int var40 = this.listH;
                     int var34 = var26 - var40;
                     int var28 = Math.max(var27, var34);
                     int var36 = this.scroll;
                     double var52 = 18.0;
                     double var43 = var5 * var52;
                     long var45 = Math.round(var43);
                     int var47 = (int)var45;
                     int var37 = var36 - var47;
                     byte var48 = (byte)(2080876466 ^ var64);
                     int var38 = Mth.clamp(var37, var48, var28);
                     this.scroll = var38;
                     return (((byte)(2080876467 ^ var64)) != 0);
                  case 647331720:
                     break;
                  case 1365724454:
                  default:
                     throw new IllegalStateException();
               }
            }
         }
      }
   }

   public boolean keyPressed(KeyEvent var1) {
      int var46 = 404464934 ^ 974079157 ^ 1685426888;
      var46 = 1734818861 ^ var46;
      byte var7 = (byte)((this.open) ? 1 : 0);
      if (var7 == (554061686 ^ var46)) {
         var46 = 48826496 ^ var46;
         return (((byte)(602884086 ^ var46)) != 0);
      } else {
         var46 = qdvtnruldckqsrem(var46, 406364114);
         int var10 = var1.key();
         short var3 = (short)(960418212 ^ var46);
         if (var10 == var3) {
            var46 = 1690929849 ^ var46;
            this.close();
            return (((byte)(1576491548 ^ var46)) != 0);
         } else {
            var46 = 1385498838 ^ var46;
            byte var14 = (byte)((controlDown(var1)) ? 1 : 0);
            if (var14 != (1806424178 ^ var46)) {
               var46 = 1542219455 ^ var46;
               int var16 = var1.key();
               byte var34 = (byte)(810008219 ^ var46);
               if (var16 == var34) {
                  var46 = 1975903397 ^ var46;
                  this.pasteClipboard();
                  return (((byte)(1166170729 ^ var46)) != 0);
               }

               label59:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                     case 227226090:
                        var46 ^= 1167479333;
                     case 723566964:
                        break label59;
                     case 1606533198:
                        break;
                     case 1927622617:
                     default:
                        throw new IllegalStateException();
                  }
               }
            } else {
               var46 = 511325338 ^ var46;
            }

            byte var20 = (byte)((this.fieldFocused) ? 1 : 0);
            if (var20 == (1976691944 ^ var46)) {
               var46 = 148868421 ^ var46;
               return (((byte)(2098094508 ^ var46)) != 0);
            } else {
               var46 = qdvtnruldckqsrem(var46, 1996795607);
               int var22 = var1.key();
               short var35 = (short)(47530812 ^ var46);
               if (var22 == var35) {
                  var46 = 1357932942 ^ var46;
                  String var29 = this.combo;
                  byte var30 = (byte)((var29.isEmpty()) ? 1 : 0);
                  if (var30 == (1378167729 ^ var46)) {
                     var46 = 1126609346 ^ var46;
                     String var39 = this.combo;
                     byte var4 = (byte)(285448819 ^ var46);
                     String var41 = this.combo;
                     int var42 = var41.length();
                     byte var6 = (byte)(285448818 ^ var46);
                     int var43 = var42 - var6;
                     String var40 = var39.substring(var4, var43);
                     this.combo = var40;
                     var46 = 62221026 ^ var46;
                     return (((byte)(313979024 ^ var46)) != 0);
                  } else {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                           case 254301827:
                              var46 ^= 1083431712;
                              return (((byte)(313979024 ^ var46)) != 0);
                           case 745599902:
                              return (((byte)(313979024 ^ var46)) != 0);
                           case 997440593:
                              break;
                           case 1638668548:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }
               } else {
                  label51:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                        case 44559566:
                           var46 ^= 919848732;
                        case 181494331:
                           break label51;
                        case 672585485:
                        default:
                           throw new IllegalStateException();
                        case 1725917715:
                     }
                  }

                  int var24 = var1.key();
                  short var36 = (short)(872842274 ^ var46);
                  if (var24 == var36) {
                     var46 = 909702112 ^ var46;
                     byte var37 = (byte)(37648066 ^ var46);
                     this.addFromField((var37 != 0));
                     return (((byte)(37648066 ^ var46)) != 0);
                  } else {
                     var46 = qdvtnruldckqsrem(var46, 1038391883);
                     return (((byte)(165814121 ^ var46)) != 0);
                  }
               }
            }
         }
      }
   }

   public boolean charTyped(CharacterEvent var1) {
      int var27 = 1913764979 ^ 1859961923 ^ 1685426888;
      var27 = 1046675182 ^ var27;
      byte var5 = (byte)((this.open) ? 1 : 0);
      if (var5 != (1188697110 ^ var27)) {
         var27 = 242435445 ^ var27;
         byte var7 = (byte)((this.fieldFocused) ? 1 : 0);
         if (var7 != (1219055971 ^ var27)) {
            var27 = 994650696 ^ var27;
            byte var9 = (byte)((this.busy) ? 1 : 0);
            if (var9 == (1944091435 ^ var27)) {
               var27 = qdvtnruldckqsrem(var27, 1403941744);
               byte var11 = (byte)((var1.isAllowedChatCharacter()) ? 1 : 0);
               if (var11 == (541984859 ^ var27)) {
                  var27 = 1244731850 ^ var27;
                  return (((byte)(1786712464 ^ var27)) != 0);
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var27)) {
                     case 244781182:
                        var27 ^= 1771100825;
                     case 92028245:
                        String var13 = this.combo;
                        String var22 = var1.codepointAsString();
                        String var14 = var13 + var22;
                        int var16 = var14.length();
                        short var23 = (short)(1239335618 ^ var27);
                        if (var16 <= var23) {
                           var27 = 1838090200 ^ var27;
                           this.combo = var14;
                           var27 = 248931366 ^ var27;
                        } else {
                           var27 = 1666802686 ^ var27;
                        }

                        return (((byte)(713535805 ^ var27)) != 0);
                     case 829579439:
                        break;
                     case 1814980218:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }

            var27 = 1508182166 ^ var27;
         } else {
            var27 = qdvtnruldckqsrem(var27, 1655448286);
         }
      } else {
         var27 = qdvtnruldckqsrem(var27, 1826580395);
      }

      return this.open;
   }

   private void addFromField(boolean var1) {
      int var42 = 1113306432 ^ 189342018 ^ 1685426888;
      var42 = 124820824 ^ var42;
      String var10 = this.combo;
      List var11 = com.wimpyclient.a.b.parseCombos(var10);
      byte var13 = (byte)((var11.isEmpty()) ? 1 : 0);
      if (var13 != (706190226 ^ var42)) {
         var42 = 871120748 ^ var42;
         String var37 = crfefvfqgh(uanlpgklloevpsa(), qeiqywwcytlqrgo(), var42);
         this.fail(var37);
      } else {
         var42 = qdvtnruldckqsrem(var42, 244253003);
         Object var14 = null;
         com.wimpyclient.a.a var7 = (com.wimpyclient.a.a)var14;
         Iterator var16 = var11.iterator();
         Iterator var8 = var16;
         var42 = 252174208 ^ var42;

         label75:
         while (true) {
            byte var18 = (byte)((var8.hasNext()) ? 1 : 0);
            if (var18 != (731858265 ^ var42)) {
               var42 ^= 846635098;
               Object var25 = var8.next();
               com.wimpyclient.a.a var26 = (com.wimpyclient.a.a)var25;
               String var28 = var26.username();
               String var36 = var26.refreshToken();
               com.wimpyclient.a.a var29 = com.wimpyclient.a.b.addOrUpdate(var28, var36);
               var7 = var29;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                     case 37040732:
                        var42 ^= 846635098;
                        continue label75;
                     case 567584262:
                     default:
                        throw new IllegalStateException();
                     case 1425885374:
                        continue label75;
                     case 1562854732:
                  }
               }
            }

            var42 = 318338455 ^ var42;
            String var3 = crfefvfqgh(egcwmzmnqhodgbm(), qeiqywwcytlqrgo(), var42);
            this.combo = var3;
            if (var1 != ((962998478 ^ var42) != 0)) {
               var42 = 1988171478 ^ var42;
               if (var7 != null) {
                  var42 = 346594854 ^ var42;
                  this.login(var7);

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                        case 15347639:
                           var42 = 820523463 ^ var42;
                           return;
                        case 612068330:
                           break;
                        case 767076750:
                        default:
                           throw new IllegalStateException();
                        case 1825443816:
                           return;
                     }
                  }
               }

               label66:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                     case 181376553:
                        var42 ^= 1502632721;
                        break label66;
                     case 724774122:
                     default:
                        throw new IllegalStateException();
                     case 1826443284:
                        break;
                     case 1857444582:
                        break label66;
                  }
               }
            } else {
               var42 = qdvtnruldckqsrem(var42, 789663175);
            }

            int var32 = var11.size();
            int var38 = var11.size();
            byte var5 = (byte)(376929544 ^ var42);
            String var39;
            if (var38 == var5) {
               var42 = 1199644164 ^ var42;
               var39 = crfefvfqgh(ujdwpnrzeskunxk(), qeiqywwcytlqrgo(), var42);
               var42 = 1519100538 ^ var42;
            } else {
               label57:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                     case 193434678:
                        var42 ^= 1143493311;
                     case 544135371:
                        break label57;
                     case 1209946319:
                     default:
                        throw new IllegalStateException();
                     case 1692239211:
                  }
               }

               var39 = crfefvfqgh(ijhihfjlbpysjmz(), qeiqywwcytlqrgo(), var42);
               var42 = 1495461569 ^ var42;
            }

            String var33 = "Saved " + var32 + var39;
            this.idle(var33);
            var42 = 1624918158 ^ var42;
            return;
         }
      }
   }

   private void login(com.wimpyclient.a.a var1) {
      int var23 = 2137561108 ^ 1970024362 ^ 1685426888;
      var23 = 1973654330 ^ var23;
      byte var6 = (byte)((this.busy) ? 1 : 0);
      if (var6 == (466794060 ^ var23)) {
         var23 = 1080641555 ^ var23;
         if (var1 != null) {
            var23 = 12664423 ^ var23;
            byte var3 = (byte)(1534771257 ^ var23);
            this.busy = (var3 != 0);
            String var13 = var1.username();
            String var14 = "Logging in as " + var13 + "\u2026";
            this.idle(var14);
            int var15 = this.loginGeneration;
            byte var4 = (byte)(1534771257 ^ var23);
            int var16 = var15 + var4;
            this.loginGeneration = var16;
            ExecutorService var11 = AUTH;
            Runnable var18 = () -> {
               int var25x = 730190570 ^ 626003430 ^ 1685426888;
               var25x = 304513341 ^ var25x;

               try {
                  String var9 = var1.refreshToken();
                  Consumer var14x = var2x -> {
                     int var10x = 1812685396 ^ 353353155 ^ 1685426888;
                     var10x = 326708696 ^ var10x;
                     Minecraft var3x = Minecraft.getInstance();
                     Runnable var7 = () -> {
                        int var12 = 2050349363 ^ 2090451476 ^ 1685426888;
                        var12 = 1863391436 ^ var12;
                        byte var5 = (byte)((this.busy) ? 1 : 0);
                        if (var5 != (231248163 ^ var12)) {
                           var12 = 1130891500 ^ var12;
                           int var8 = this.loginGeneration;
                           if (var16 == var8) {
                              var12 = 1480931959 ^ var12;
                              this.idle((String)var2x);
                              var12 = 428205867 ^ var12;
                           } else {
                              var12 = 1103158620 ^ var12;
                           }
                        } else {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var12)) {
                                 case 7644573:
                                    return;
                                 case 179606779:
                                    var12 = 44619184 ^ var12;
                                    return;
                                 case 924305214:
                                 default:
                                    throw new IllegalStateException();
                                 case 1225679127:
                              }
                           }
                        }
                     };
                     var3x.execute(var7);
                  };
                  c$b var10 = com.wimpyclient.a.c.login(var9, var14x);
                  Minecraft var11x = Minecraft.getInstance();
                  Runnable var16x = () -> {
                     int var42 = 305990812 ^ 1512256515 ^ 1685426888;
                     var42 = 592525124 ^ var42;
                     int var25xx = this.loginGeneration;
                     if (var16 != var25xx) {
                        var42 = 1776877288 ^ var42;
                     } else {
                        var42 = 542094530 ^ var42;

                        label87: {
                           Exception var10000;
                           label67: {
                              label66: {
                                 label65: {
                                    label64: {
                                       label63: {
                                          label62: {
                                             label61: {
                                                try {
                                                   String var9x = var1.username();
                                                   String var11xx = var10.name();
                                                   String var27xx = var10.refreshToken();
                                                   com.wimpyclient.a.a var12 = com.wimpyclient.a.b.addOrUpdate(var11xx, var27xx);
                                                   String var29x = var10.name();
                                                   byte var14xx = (byte)((var9x.equalsIgnoreCase(var29x)) ? 1 : 0);
                                                   if (var14xx == (796207569 ^ var42)) {
                                                      var42 ^= 129493206;
                                                      com.wimpyclient.a.a var16xx = com.wimpyclient.a.b.findIgnoreCase(var9x);
                                                      if (var16xx == null) {
                                                         break label61;
                                                      }

                                                      var42 ^= 1981718345;
                                                      com.wimpyclient.a.b.remove(var16xx);
                                                      var42 ^= 756383429;
                                                      break label62;
                                                   }
                                                } catch (Exception var44) {
                                                   var10000 = var44;
                                                   switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var42)) {
                                                      case -1639381925:
                                                         break label65;
                                                      case -152898958:
                                                         break label63;
                                                      case 1175849017:
                                                         break label66;
                                                      case 2074693257:
                                                         break label64;
                                                      default:
                                                         throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                   }
                                                }

                                                var42 ^= 1555827034;
                                                break label62;
                                             }

                                             var42 ^= 1527505292;
                                          }

                                          try {
                                             com.wimpyclient.a.d.apply(var10);
                                             byte var30x = (byte)(1942560907 ^ var42);
                                             this.busy = (var30x != 0);
                                             String var32 = var10.name();
                                             String var33 = "Logged in as " + var32 + ". Rejoin the server.";
                                             this.ok(var33);
                                             var42 ^= 944169863;
                                             break label87;
                                          } catch (Exception var43) {
                                             var10000 = var43;
                                             switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var42)) {
                                                case -1639381925:
                                                   break label65;
                                                case -152898958:
                                                   break;
                                                case 1175849017:
                                                   break label66;
                                                case 2074693257:
                                                   break label64;
                                                default:
                                                   throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                             }
                                          }
                                       }

                                       var42 = 1138698572 ^ var42;
                                       break label67;
                                    }

                                    var42 = 846618323 ^ var42;
                                    break label67;
                                 }

                                 var42 = 1858754441 ^ var42;
                                 break label67;
                              }

                              var42 = 901887493 ^ var42;
                           }

                           Exception var22 = var10000;
                           byte var34 = (byte)(486766338 ^ var42);
                           this.busy = (var34 != 0);
                           String var36 = var22.getMessage();
                           String var38;
                           if (var36 == null) {
                              var42 = 1246656382 ^ var42;
                              var38 = crfefvfqgh(csgyyulszrwypsx(), qeiqywwcytlqrgo(), var42);
                              var42 = 1728580647 ^ var42;
                           } else {
                              var42 = 1258951953 ^ var42;
                              var38 = var22.getMessage();
                              var42 = 1716285000 ^ var42;
                           }

                           this.fail(var38);
                           var42 = 149982657 ^ var42;
                           return;
                        }

                        var42 = qdvtnruldckqsrem(var42, 1933197974);
                     }
                  };
                  var11x.execute(var16x);
                  var25x ^= 2115623662;
               } catch (Exception var26x) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var25x)) {
                     case -1003067445:
                        var25x = 595022200 ^ var25x;
                        Minecraft var13x = Minecraft.getInstance();
                        Runnable var18x = () -> {
                           int var22 = 187952981 ^ 1043606311 ^ 1685426888;
                           var22 = 1369751988 ^ var22;
                           int var14xx = this.loginGeneration;
                           if (var16 != var14xx) {
                              var22 = 748128017 ^ var22;
                           } else {
                              var22 = 863842027 ^ var22;
                              byte var15x = (byte)(866892261 ^ var22);
                              this.busy = (var15x != 0);
                              String var8 = var26x.getMessage();
                              String var5 = var8;
                              byte var10x = (byte)((var26x instanceof InterruptedException) ? 1 : 0);
                              if (var10x != (866892261 ^ var22)) {
                                 var22 = 1592849910 ^ var22;
                                 String var11xx = crfefvfqgh(uoxvqnfbxtqfomu(), qeiqywwcytlqrgo(), var22);
                                 var5 = var11xx;
                                 Thread var12 = Thread.currentThread();
                                 var12.interrupt();
                                 var22 = 542448275 ^ var22;
                              } else {
                                 var22 = qdvtnruldckqsrem(var22, 2124803941);
                              }

                              String var19;
                              label30: {
                                 if (var5 != null) {
                                    var22 = 700441642 ^ var22;
                                    byte var18xx = (byte)((var5.isBlank()) ? 1 : 0);
                                    if (var18xx == (1689367210 ^ var22)) {
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                                             case 51916440:
                                                var22 ^= 1389577120;
                                             case 87443443:
                                                var19 = var5;
                                                var22 = 1498268877 ^ var22;
                                                break label30;
                                             case 1897983528:
                                             default:
                                                throw new RuntimeException();
                                             case 2010444432:
                                          }
                                       }
                                    }

                                    var22 = 1250933213 ^ var22;
                                 } else {
                                    var22 = qdvtnruldckqsrem(var22, 1664114167);
                                 }

                                 var19 = crfefvfqgh(vettbbfnkfxbcqf(), qeiqywwcytlqrgo(), var22);
                                 var22 = qdvtnruldckqsrem(var22, 1091649200);
                              }

                              this.fail(var19);
                           }
                        };
                        var13x.execute(var18x);
                        var25x = 1853731676 ^ var25x;
                        return;
                     default:
                        throw new RuntimeException(new IOException("Error in hash"));
                  }
               }

               var25x = qdvtnruldckqsrem(var25x, 856897738);
            };
            var11.execute(var18);
            return;
         }

         var23 = 31443438 ^ var23;
      } else {
         var23 = 1102479869 ^ var23;
      }
   }

   private void pasteClipboard() {
      int var26 = 1671589980 ^ 211237285 ^ 1685426888;
      var26 = 324086106 ^ var26;
      Minecraft var1 = Minecraft.getInstance();
      Minecraft var3 = var1;
      String var6 = crfefvfqgh(bwlyrabygkowuqs(), qeiqywwcytlqrgo(), var26);
      String var4 = var6;
      var26 = 978576600 ^ var26;

      label52: {
         try {
            Window var8 = var3.getWindow();
            long var9 = var8.handle();
            String var11 = GLFW.glfwGetClipboardString(var9);
            var26 ^= 1854747156;
            var4 = var11;
            var26 ^= 1966660656;
         } catch (Exception var27) {
            var26 = 536480761 ^ switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var26)) {
               case 303084953 -> 2008967222 ^ var26;
               case 1719215418 -> qdvtnruldckqsrem(var26, 422795810);
               default -> throw new RuntimeException(new IOException("Error in hash"));
            };
            break label52;
         }

         label49:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
               case 5261395:
                  var26 ^= 1945210347;
               case 468165636:
                  break label49;
               case 838351071:
                  break;
               case 1874191601:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }

      if (var4 == null) {
         var26 = 1691260494 ^ var26;
      } else {
         var26 = 2049465854 ^ var26;
         byte var14 = (byte)((var4.isBlank()) ? 1 : 0);
         if (var14 == (808331394 ^ var26)) {
            label38:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
                  case 223960661:
                     var26 ^= 1715110635;
                     break label38;
                  case 661683329:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1400972876:
                     break;
                  case 1957178145:
                     break label38;
               }
            }

            String var20 = var4.trim();
            this.combo = var20;
            byte var21 = (byte)(1444194920 ^ var26);
            this.fieldFocused = (var21 != 0);
            String var22 = crfefvfqgh(qfmxxdiykjqaobd(), qeiqywwcytlqrgo(), var26);
            this.idle(var22);
            return;
         }

         var26 = 518441904 ^ var26;
      }

      String var23 = crfefvfqgh(dljnxmlzixhjeov(), qeiqywwcytlqrgo(), var26);
      this.fail(var23);
   }

   private void layoutGui() {
      int var14 = 2053826344 ^ 1962914143 ^ 1685426888;
      var14 = 208118983 ^ var14;
      Minecraft var1 = Minecraft.getInstance();
      Window var6 = var1.getWindow();
      int var7 = var6.getGuiScaledWidth();
      float var8 = var7;
      Window var9 = var1.getWindow();
      int var10 = var9.getGuiScaledHeight();
      float var11 = var10;
      this.layout(var8, var11);
   }

   private void layout(float var1, float var2) {
      int var136 = 2005160496 ^ 591981816 ^ 1685426888;
      var136 = 1191202492 ^ var136;
      short var4 = (short)(2008638420 ^ var136);
      short var5 = (short)(2008638372 ^ var136);
      float var7 = 0.42F;
      float var123 = var1 * var7;
      int var124 = (int)var123;
      int var91 = Math.max(var5, var124);
      int var32 = Math.min(var4, var91);
      this.panelW = var32;
      short var33 = (short)(2008638460 ^ var136);
      short var92 = (short)(2008638028 ^ var136);
      float var130 = 0.58F;
      float var126 = var2 * var130;
      int var127 = (int)var126;
      int var93 = Math.max(var92, var127);
      int var34 = Math.min(var33, var93);
      this.panelH = var34;
      int var95 = this.panelW;
      float var96 = var95;
      float var36 = var1 - var96;
      float var97 = 2.0F;
      float var37 = var36 / var97;
      int var38 = Math.round(var37);
      this.panelX = var38;
      int var99 = this.panelH;
      float var100 = var99;
      float var40 = var2 - var100;
      float var101 = 2.0F;
      float var41 = var40 / var101;
      int var42 = Math.round(var41);
      this.panelY = var42;
      byte var43 = (byte)(2008638116 ^ var136);
      this.rowH = var43;
      int var45 = this.panelX;
      byte var102 = (byte)(2008638128 ^ var136);
      int var46 = var45 + var102;
      this.listX = var46;
      int var48 = this.panelY;
      byte var103 = (byte)(2008638098 ^ var136);
      int var49 = var48 + var103;
      this.listY = var49;
      int var51 = this.panelW;
      byte var104 = (byte)(2008638116 ^ var136);
      int var52 = var51 - var104;
      this.listW = var52;
      int var54 = this.panelH;
      short var105 = (short)(2008638012 ^ var136);
      int var55 = var54 - var105;
      this.listH = var55;
      int var57 = this.panelX;
      byte var106 = (byte)(2008638128 ^ var136);
      int var58 = var57 + var106;
      this.fieldX = var58;
      byte var59 = (byte)(2008638122 ^ var136);
      this.fieldH = var59;
      int var61 = this.panelY;
      int var108 = this.panelH;
      int var62 = var61 + var108;
      byte var109 = (byte)(2008638194 ^ var136);
      int var63 = var62 - var109;
      this.fieldY = var63;
      int var65 = this.panelW;
      byte var110 = (byte)(2008638116 ^ var136);
      int var66 = var65 - var110;
      this.fieldW = var66;
      byte var67 = (byte)(2008638120 ^ var136);
      this.buttonH = var67;
      int var69 = this.panelY;
      int var112 = this.panelH;
      int var70 = var69 + var112;
      byte var113 = (byte)(2008638094 ^ var136);
      int var71 = var70 - var113;
      this.buttonY = var71;
      int var73 = this.listW;
      byte var114 = (byte)(2008638124 ^ var136);
      int var74 = var73 - var114;
      byte var115 = (byte)(2008638143 ^ var136);
      int var75 = var74 / var115;
      this.buttonW = var75;
      int var77 = this.listX;
      this.pasteX = var77;
      int var79 = this.pasteX;
      int var117 = this.buttonW;
      int var80 = var79 + var117;
      byte var118 = (byte)(2008638132 ^ var136);
      int var81 = var80 + var118;
      this.addX = var81;
      int var83 = this.addX;
      int var120 = this.buttonW;
      int var84 = var83 + var120;
      byte var121 = (byte)(2008638132 ^ var136);
      int var85 = var84 + var121;
      this.loginX = var85;
      List var28 = com.wimpyclient.a.b.accounts();
      int var29 = var28.size();
      int var87 = this.rowH;
      int var30 = var29 * var87;
      int var89 = this.scroll;
      byte var122 = (byte)(2008638140 ^ var136);
      byte var128 = (byte)(2008638140 ^ var136);
      int var133 = this.listH;
      int var132 = var30 - var133;
      int var129 = Math.max(var128, var132);
      int var90 = Mth.clamp(var89, var122, var129);
      this.scroll = var90;
   }

   private int loginBtnX() {
      int var10 = 245061638 ^ 467742785 ^ 1685426888;
      var10 = 551151458 ^ var10;
      int var3 = this.listX;
      int var6 = this.listW;
      int var4 = var3 + var6;
      byte var7 = (byte)(1372986795 ^ var10);
      return var4 - var7;
   }

   private int removeBtnX() {
      int var10 = 1458295879 ^ 1188768136 ^ 1685426888;
      var10 = 1327694384 ^ var10;
      int var3 = this.listX;
      int var6 = this.listW;
      int var4 = var3 + var6;
      byte var7 = (byte)(996568367 ^ var10);
      return var4 - var7;
   }

   private void drawButton(com.wimpyclient.m.b var1, int var2, int var3, int var4, int var5, String var6, int var7, int var8, com.wimpyclient.o.b var9) {
      int var86 = 922067635 ^ 731392680 ^ 1685426888;
      var86 = 1414322611 ^ var86;
      double var21 = var7;
      double var33 = var8;
      double var53 = var2;
      double var68 = var3;
      double var79 = var4;
      double var83 = var5;
      byte var23 = (byte)((inside(var21, var33, var53, var68, var79, var83)) ? 1 : 0);
      float var27 = var2;
      float var36 = var3;
      float var45 = var4;
      float var56 = var5;
      float var62 = var5;
      float var70 = 2.0F;
      float var63 = var62 / var70;
      int var76;
      if (var23 != (760529760 ^ var86)) {
         var86 = 1528423648 ^ var86;
         var76 = var9.accentHover();

         label32:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
               case 87362245:
                  var86 ^= 1799270919;
                  break label32;
               case 251714605:
                  break;
               case 770879969:
                  break label32;
               case 1127402167:
               default:
                  throw new RuntimeException();
            }
         }
      } else {
         var86 = 1472137183 ^ var86;
         var76 = var9.field();
         var86 = 1738035512 ^ var86;
      }

      var1.rect(var27, var36, var45, var56, var63, var76);
      float var29 = var2;
      float var38 = var3;
      float var47 = var4;
      float var58 = var5;
      float var65 = var5;
      float var73 = 2.0F;
      float var66 = var65 / var73;
      float var74 = 1.0F;
      int var77 = var9.accent();
      float var82;
      if (var23 != (494114183 ^ var86)) {
         var86 = 397703542 ^ var86;
         var82 = 0.9F;
         var86 = 1451482599 ^ var86;
      } else {
         label24:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
               case 152038598:
                  var86 ^= 287079099;
               case 665648731:
                  break label24;
               case 1329617369:
               default:
                  throw new RuntimeException();
               case 1613209206:
            }
         }

         var82 = 0.4F;
         var86 = 1345052202 ^ var86;
      }

      int var78 = com.wimpyclient.p.g.withAlpha(var77, var82);
      var1.rectOutline(var29, var38, var47, var58, var66, var74, var78);
      float var31 = var2;
      float var40 = var4;
      float var48 = 2.0F;
      float var41 = var40 / var48;
      float var32 = var31 + var41;
      float var43 = var3;
      float var50 = var5;
      float var59 = 2.0F;
      float var51 = var50 / var59;
      float var44 = var43 + var51;
      float var52 = 10.0F;
      int var61 = var9.textPrimary();
      var1.textCentered(var32, var44, var52, var61, var6);
   }

   private void idle(String var1) {
      int var9 = 1671516863 ^ 475538959 ^ 1685426888;
      var9 = 1773836453 ^ var9;
      this.status = var1;
      com.wimpyclient.o.b var5 = com.wimpyclient.o.b.INSTANCE;
      int var6 = var5.textMuted();
      this.statusColor = var6;
   }

   private void ok(String var1) {
      int var9 = 477988595 ^ 1477279367 ^ 1685426888;
      var9 = 675781203 ^ var9;
      this.status = var1;
      com.wimpyclient.o.b var5 = com.wimpyclient.o.b.INSTANCE;
      int var6 = var5.accent();
      this.statusColor = var6;
   }

   private void fail(String var1) {
      int var9 = 373313160 ^ 1389762579 ^ 1685426888;
      var9 = 7384030 ^ var9;
      this.status = var1;
      com.wimpyclient.o.b var5 = com.wimpyclient.o.b.INSTANCE;
      int var6 = var5.warn();
      this.statusColor = var6;
   }

   private static boolean controlDown(KeyEvent var0) {
      int var12 = 85745493 ^ 1815245796 ^ 1510337050;
      var12 = 257445371 ^ var12;
      int var3 = var0.modifiers();
      byte var2 = (byte)(1014205266 ^ var12);
      int var4 = var3 & var2;
      if (var4 == (1014205264 ^ var12)) {
         var12 = 1800678604 ^ var12;
         int var6 = var0.modifiers();
         byte var9 = (byte)(1462216596 ^ var12);
         int var7 = var6 & var9;
         if (var7 == (1462216604 ^ var12)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var12)) {
                  case 109418687:
                     break;
                  case 148669337:
                     var12 ^= 186825094;
                  case 1917271172:
                     byte var8 = (byte)(1543839258 ^ var12);
                     var12 = 1087649983 ^ var12;
                     return (var8 != 0);
                  case 849318316:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var12 = 542389710 ^ var12;
      } else {
         var12 = qdvtnruldckqsrem(var12, 1258297602);
      }

      byte var18 = (byte)(2004062803 ^ var12);
      var12 = qdvtnruldckqsrem(var12, 1805825271);
      return (var18 != 0);
   }

   private static boolean inside(double var0, double var2, double var4, double var6, double var8, double var10) {
      int var42 = 1251470668 ^ 1537318 ^ 1510337050;
      var42 = 1161501879 ^ var42;
      double var50;
      int var18 = (var50 = var0 - var4) == 0.0 ? 0 : (var50 < 0.0 ? -1 : 1);
      if (var18 >= (1438543559 ^ var42)) {
         var42 = 819660396 ^ var42;
         double var31 = var4 + var8;
         double var51;
         int var21 = (var51 = var0 - var31) == 0.0 ? 0 : (var51 < 0.0 ? -1 : 1);
         if (var21 < (1701144747 ^ var42)) {
            var42 = 1748349640 ^ var42;
            double var52;
            int var24 = (var52 = var2 - var6) == 0.0 ? 0 : (var52 < 0.0 ? -1 : 1);
            if (var24 >= (223402595 ^ var42)) {
               var42 = 545697372 ^ var42;
               double var37 = var6 + var10;
               double var53;
               int var27 = (var53 = var2 - var37) == 0.0 ? 0 : (var53 < 0.0 ? -1 : 1);
               if (var27 < (769029183 ^ var42)) {
                  var42 = 1871328308 ^ var42;
                  byte var28 = (byte)(1113341962 ^ var42);
                  var42 = qdvtnruldckqsrem(var42, 1326051290);
                  return (var28 != 0);
               }

               var42 = 2132246459 ^ var42;
            } else {
               label27:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                     case 164407887:
                        var42 ^= 1603391975;
                        break label27;
                     case 772092023:
                        break;
                     case 1312293181:
                        break label27;
                     case 1993027854:
                     default:
                        throw new RuntimeException();
                  }
               }
            }
         } else {
            var42 = qdvtnruldckqsrem(var42, 933520175);
         }
      } else {
         var42 = 125789507 ^ var42;
      }

      byte var54 = (byte)(1388383108 ^ var42);
      var42 = 1603576917 ^ var42;
      return (var54 != 0);
   }

   static {
      int var8 = 1064834346 ^ 897719040 ^ Integer.parseInt("1286586912");
      int var5 = new Random(-1012481430272384505L).nextInt();
      f2XDebsdBIi = -1774851532 ^ var5;
      var8 = 1020451308 ^ var8;
      a var0 = new a();
      INSTANCE = var0;
      ThreadFactory var1 = var0x -> {
         int var10 = 1434208958 ^ 1271624943 ^ 1510337050;
         var10 = 1344168096 ^ var10;
         String var3 = crfefvfqgh(kyyecknqwvboyfa(), qeiqywwcytlqrgo(), var10);
         Thread var1x = new Thread(var0x, var3);
         byte var7 = (byte)(346862826 ^ var10);
         var1x.setDaemon((var7 != 0));
         return var1x;
      };
      ExecutorService var2 = Executors.newSingleThreadExecutor(var1);
      AUTH = var2;
   }

   public static String crfefvfqgh(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] qeiqywwcytlqrgo() {
      return new byte[]{
         48,
         107,
         48,
         67,
         79,
         1,
         73,
         67,
         118,
         79,
         76,
         15,
         67,
         24,
         114,
         57,
         3,
         126,
         86,
         68,
         7,
         75,
         109,
         73,
         18,
         82,
         6,
         85,
         112,
         83,
         7,
         106,
         112,
         56,
         49,
         83,
         31,
         15,
         48,
         14,
         31,
         72,
         81,
         45,
         45,
         120,
         60,
         59,
         22,
         85,
         55,
         12,
         58,
         97,
         55,
         43,
         40,
         109,
         38,
         60,
         21,
         15,
         121,
         115,
         76,
         112,
         10,
         106,
         59,
         126,
         92,
         94,
         38,
         100,
         38,
         8,
         125,
         36,
         99,
         58,
         62,
         37,
         41,
         7,
         26,
         120,
         107,
         72
      };
   }

   private static byte[] kyyecknqwvboyfa() {
      return new byte[]{
         -3,
         -96,
         6,
         12,
         121,
         90,
         113,
         28,
         65,
         12,
         120,
         64,
         123,
         3,
         64,
         96,
         49,
         42,
         101,
         19,
         49,
         28,
         91,
         14,
         42,
         14,
         49,
         18,
         68,
         72,
         63,
         61,
         66,
         117,
         3,
         16,
         44,
         83
      };
   }

   private static byte[] uoxvqnfbxtqfomu() {
      return new byte[]{-1, -84, 3, 59, 121, 87, 112, 19, 79, 19, 125, 89, 112, 12, 68, 99, 58, 40, 111, 31, 54, 16, 94, 24, 36, 7, 63, 14, 73, 3, 54, 54};
   }

   private static byte[] vettbbfnkfxbcqf() {
      return new byte[]{-7, -93, 5, 55, 126, 86, 120, 20, 69, 17, 123, 84, 123, 9, 74, 110, 51, 44, 97, 26, 50, 31, 92, 20, 35, 6};
   }

   private static byte[] csgyyulszrwypsx() {
      return new byte[]{
         -1,
         -96,
         6,
         36,
         121,
         82,
         125,
         1,
         78,
         4,
         125,
         82,
         117,
         67,
         68,
         97,
         55,
         111,
         110,
         15,
         54,
         8,
         91,
         20,
         36,
         16,
         50,
         7,
         72,
         3,
         54,
         126,
         70,
         106,
         7,
         4,
         43,
         87,
         8,
         90,
         46,
         25,
         103,
         125
      };
   }

   private static byte[] lpgjolboztfmelo() {
      return new byte[]{
         -1,
         -96,
         9,
         39,
         125,
         84,
         124,
         1,
         64,
         9,
         125,
         94,
         122,
         12,
         64,
         120,
         54,
         60,
         96,
         19,
         54,
         13,
         84,
         19,
         32,
         7,
         51,
         9,
         70,
         4,
         54,
         100,
         73,
         126,
         3,
         2,
         42,
         88,
         6,
         78,
         46,
         25,
         104,
         106,
         31,
         36,
         9,
         94,
         32,
         8,
         6,
         83,
         3,
         48,
         5,
         113,
         29,
         112,
         16,
         46,
         36,
         79,
         64,
         47,
         126,
         33,
         63,
         53,
         13,
         108,
         109,
         43,
         31,
         52,
         20,
         88,
         72,
         53,
         85,
         103,
         15,
         99,
         16,
         19,
         40,
         0,
         94,
         22,
         6,
         62,
         1,
         30,
         118,
         91,
         123,
         89
      };
   }

   private static byte[] tclzxpdzgcqibgk() {
      return new byte[]{
         -1, -95, 0, 63, 118, 87, 113, 21, 78, 21, 125, 84, 115, 8, 75, 99, 59, 46, 110, 25, 54, 29, 93, 28, 43, 7, 62, 8, 72, 5, 54, 59, 64, 38
      };
   }

   private static byte[] seknourwgoitzpr() {
      return new byte[]{-4, -92, 8, 39, 126, 115, 122, 37, 64, 42, 126, 122};
   }

   private static byte[] xzkektiosfpobhf() {
      return new byte[]{-4, -92, 8, 54, 126, 118, 122, 50};
   }

   private static byte[] pddrwnsembbwfei() {
      return new byte[]{-4, -92, 8, 59, 126, 125, 122, 49, 64, 55, 126, 113};
   }

   private static byte[] ipjjbihlrhovhsq() {
      return new byte[]{
         -1, -93, 1, 62, 122, 86, 113, 82, 67, 10, 125, 89, 114, 93, 71, 100, 59, 43, 99, 82, 54, 29, 92, 25, 39, 9, 62, 11, 69, 16, 54, 51, 65, 127, 4, 24
      };
   }

   private static byte[] yqcnmedomhrewnx() {
      return new byte[]{-6, -83, 9, 61, 123, 90, 125, 16, 66, 28, 117, 95, 113, 66, 70, 106, 55, 106, 98, 20, 62, 23, 89, 83, 38, 72, 50, 79};
   }

   private static byte[] srrsoolhiacbsuz() {
      return new byte[]{-4, -89, 0, 54, 119, 85, 122, 25, 79, 18, 127, 74, 119, 78, 69, 126, 58, 52};
   }

   private static byte[] tmyoplkwahnddgo() {
      return new byte[]{-4, -89, 0, 15};
   }

   private static byte[] gxjbvaxaekkkjvk() {
      return new byte[]{
         -1,
         -95,
         1,
         3,
         127,
         66,
         126,
         17,
         64,
         4,
         125,
         84,
         114,
         76,
         66,
         100,
         52,
         44,
         96,
         71,
         54,
         12,
         92,
         25,
         34,
         4,
         49,
         16,
         70,
         15,
         54,
         44,
         65,
         101,
         1,
         55,
         40,
         87,
         6,
         92,
         46,
         24,
         96,
         118
      };
   }

   private static byte[] xgzfitysumvloth() {
      return new byte[]{-1, -91, 0, 56, 121, 118, 113, 52, 69, 49, 125, 112};
   }

   private static byte[] yecjsyicmkdoeue() {
      return new byte[]{-1, -91, 0, 12};
   }

   private static byte[] vfixmttrucbhzuz() {
      return new byte[]{-9, -84, 1, 57, 120, 93, 123, 1, 69, 86, 116, 77, 119, 70, 65, 108, 53, 35, 111, 25, 54, 27, 90, 90, 32, 13, 53, 2};
   }

   private static byte[] kibasfwpijpnwka() {
      return new byte[]{-1, -96, 0, 53, 127, 83, 124, 18, 68, 20, 125, 78, 115, 65, 66, 124, 54, 63};
   }

   private static byte[] ejsfxvenjelqdyc() {
      return new byte[]{
         -1,
         -92,
         4,
         14,
         118,
         65,
         125,
         16,
         68,
         10,
         125,
         81,
         119,
         65,
         75,
         103,
         55,
         45,
         100,
         73,
         54,
         9,
         89,
         20,
         43,
         7,
         50,
         17,
         66,
         1,
         54,
         41,
         68,
         104,
         8,
         52,
         43,
         86,
         2,
         82,
         46,
         29,
         101,
         123
      };
   }

   private static byte[] ymojotgjjhvvqvi() {
      return new byte[]{-4, -92, 7, 63, 127, 127, 120, 53, 71, 63, 126, 113};
   }

   private static byte[] pfxhhccyzssejzu() {
      return new byte[]{-4, -92, 7, 11};
   }

   private static byte[] muemlbhyxgfreyp() {
      return new byte[]{-1, -94, 2, 33, 122, 115, 123, 41, 68, 41, 125, 124};
   }

   private static byte[] osoltfzbhkmasht() {
      return new byte[]{-1, -94, 2, 48, 122, 118, 123, 62};
   }

   private static byte[] nbnuzyoxbknilgk() {
      return new byte[]{-1, -94, 2, 61, 122, 125, 123, 61, 68, 52, 125, 119};
   }

   private static byte[] eqmebrqwqkrlpew() {
      return new byte[]{-3, -90, 5, 60, 126, 91, 123, 15, 70, 92, 126, 73, 114, 64, 71, 108, 59, 32, 101, 19, 50, 30, 92, 92, 32, 3, 54, 8};
   }

   private static byte[] ucanqakgxoconjc() {
      return new byte[]{-7, -95, 2, 15};
   }

   private static byte[] brfnkruqbsoajbd() {
      return new byte[]{-4, -92, 7, 54, 122, 91, 112, 20, 79, 28, 126, 86, 116, 79, 71, 107, 58, 110, 111, 25, 53, 21, 122, 86};
   }

   private static byte[] gikwzeroldhtjoj() {
      return new byte[]{
         -1, -83, 5, 62, 118, 92, 120, 91, 64, 5, 125, 87, 118, 93, 75, 110, 50, 34, 96, 93, 54, 19, 88, 25, 43, 3, 55, 2, 70, 31, 54, 61, 69, 127, 8, 18
      };
   }

   private static byte[] egcwmzmnqhodgbm() {
      return new byte[0];
   }

   private static byte[] ujdwpnrzeskunxk() {
      return new byte[]{-1, -89, 7, 86, 126, 80, 120, 23, 70, 21, 125, 83, 116, 88, 67, 103, 50, 61, 102, 83};
   }

   private static byte[] uanlpgklloevpsa() {
      return new byte[]{
         -6,
         -89,
         5,
         47,
         125,
         64,
         120,
         17,
         66,
         91,
         127,
         79,
         122,
         89,
         64,
         109,
         52,
         56,
         98,
         25,
         50,
         19,
         95,
         22,
         35,
         0,
         50,
         91,
         67,
         20,
         62,
         61,
         66,
         111,
         6,
         21,
         43,
         89,
         5,
         68,
         45,
         18,
         96,
         78,
         25,
         35,
         15,
         101,
         47,
         2,
         5,
         83,
         13,
         117,
         3,
         48,
         29,
         59,
         20,
         96,
         36,
         93,
         77,
         103,
         127,
         53,
         51,
         61,
         9,
         61,
         107,
         74,
         18,
         59,
         19,
         88,
         79,
         120,
         82,
         104,
         10,
         56,
         26,
         28
      };
   }

   private static byte[] ijhihfjlbpysjmz() {
      return new byte[]{-1, -89, 8, 82, 118, 86, 112, 24, 66, 26, 125, 83, 123, 92, 75, 97, 58, 50, 98, 1, 54, 86};
   }

   private static byte[] qfmxxdiykjqaobd() {
      return new byte[]{
         -1,
         -96,
         4,
         39,
         126,
         89,
         125,
         9,
         68,
         10,
         125,
         94,
         119,
         72,
         67,
         32,
         55,
         36,
         100,
         26,
         54,
         18,
         89,
         31,
         35,
         4,
         50,
         66,
         66,
         66,
         54,
         31,
         68,
         104,
         0,
         14,
         43,
         22,
         2,
         75,
         46,
         19,
         101,
         57,
         28,
         50,
         8,
         99,
         36,
         18,
         6,
         93,
         14,
         121,
         6,
         50,
         28,
         59,
         20,
         127,
         36,
         27,
         77,
         11,
         125,
         38,
         62,
         52,
         9,
         38,
         109,
         4,
         18,
         112,
         23,
         69,
         73,
         114,
         81,
         43,
         15,
         98,
         29,
         68,
         43,
         40,
         95,
         5,
         2,
         57,
         1,
         31,
         123,
         27
      };
   }

   private static byte[] bwlyrabygkowuqs() {
      return new byte[0];
   }

   private static byte[] dljnxmlzixhjeov() {
      return new byte[]{
         -7,
         -84,
         4,
         57,
         126,
         90,
         123,
         19,
         78,
         8,
         116,
         89,
         122,
         70,
         69,
         106,
         58,
         52,
         97,
         24,
         51,
         82,
         92,
         23,
         32,
         24,
         62,
         66,
         72,
         2,
         62,
         54,
         71,
         122,
         8,
         31,
         40,
         78,
         4,
         25
      };
   }

   private static int qdvtnruldckqsrem(int var0, int var1) {
      return var0 ^ var1;
   }
}
