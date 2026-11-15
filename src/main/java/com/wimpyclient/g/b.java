package com.wimpyclient.g;

import com.wimpyclient.i.k;
import com.wimpyclient.i.m;
import com.wimpyclient.i.v;
import com.wimpyclient.i.w;
import com.wimpyclient.i.x;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class b {
   final w category;
   int x;
   int y;
   int w;
   int h;
   int scroll;
   boolean collapsed;
   boolean userMoved;
   String hoverTip;
   private final com.wimpyclient.l.a expandAnim;
   private final com.wimpyclient.l.a enterAnim;
   private final com.wimpyclient.l.a settingsAnim;
   private long enterDelayNs;
   private v settingsTarget;
   private final Map<v, com.wimpyclient.l.a> hoverAnims;
   private final Map<v, com.wimpyclient.l.a> enableAnims;
   private final Map<com.wimpyclient.j.a, com.wimpyclient.l.a> boolAnims;
   private String cachedModuleFilter;
   private List<v> cachedModules;
   private static int CCzCTC4dbB;
   private transient int GF1ns3wFYb;

   b(w var1) {
super();
      int var33 = 1433604229 ^ 1382429557;
      
      var33 = 508282299 ^ var33;
      var33 = 2093293460 ^ 1399596492 ^ Integer.parseInt("922213395");
      this.GF1ns3wFYb = 114599207 ^ CCzCTC4dbB;
      var33 = tmbnfwxztnsvmyha(var33, 1011963935);
      String var3 = "";
      this.hoverTip = var3;
      float var4 = 14.0F;
      com.wimpyclient.l.a var19 = new com.wimpyclient.l.a(var4);
      this.expandAnim = var19;
      float var29 = 11.0F;
      com.wimpyclient.l.a var20 = new com.wimpyclient.l.a(var29);
      this.enterAnim = var20;
      float var30 = 13.0F;
      com.wimpyclient.l.a var21 = new com.wimpyclient.l.a(var30);
      this.settingsAnim = var21;
      IdentityHashMap var22 = new IdentityHashMap();
      this.hoverAnims = var22;
      IdentityHashMap var23 = new IdentityHashMap();
      this.enableAnims = var23;
      IdentityHashMap var24 = new IdentityHashMap();
      this.boolAnims = var24;
      this.category = var1;
      com.wimpyclient.l.a var14 = this.expandAnim;
      float var26 = 1.0F;
      var14.snap(var26);
      com.wimpyclient.l.a var16 = this.enterAnim;
      float var27 = 1.0F;
      var16.snap(var27);
      com.wimpyclient.l.a var18 = this.settingsAnim;
      float var28 = 1.0F;
      var18.snap(var28);
   }

   void playEnter(int var1) {
      int var21 = 2146637640 ^ 833186797 ^ 504965528;
      var21 = 225672684 ^ var21;
      com.wimpyclient.l.a var7 = this.enterAnim;
      float var3 = 0.0F;
      var7.snap(var3);
      com.wimpyclient.l.a var9 = this.enterAnim;
      float var11 = 1.0F;
      var9.setTarget(var11);
      long var12 = System.nanoTime();
      long var16 = var1;
      long var5 = 55000000L;
      long var18 = var16 * var5;
      long var14 = var12 + var18;
      this.enterDelayNs = var14;
   }

   void tickAnims() {
      int var59 = 1698154237 ^ 1905921927 ^ 504965528;
      var59 = 882111294 ^ var59;
      long var1 = System.nanoTime();
      long var56 = this.enterDelayNs;
      long var70;
      int var11 = (var70 = var1 - var56) == 0L ? 0 : (var70 < 0L ? -1 : 1);
      if (var11 >= (1042748380 ^ var59)) {
         var59 = 544090462 ^ var59;
         com.wimpyclient.l.a var13 = this.enterAnim;
         float var3 = 1.0F;
         var13.setTarget(var3);
         com.wimpyclient.l.a var15 = this.enterAnim;
         float var16 = var15.update();
         var59 = 30361039 ^ var59;
      } else {
         var59 = 564227217 ^ var59;
      }

      com.wimpyclient.l.a var18 = this.expandAnim;
      byte var53 = (byte)((this.collapsed) ? 1 : 0);
      float var55;
      if (var53 != (528908109 ^ var59)) {
         var59 = 1704913315 ^ var59;
         var55 = 0.0F;
         var59 = tmbnfwxztnsvmyha(var59, 1235295511);
      } else {
         var59 = 1035017761 ^ var59;
         var55 = 1.0F;
         var59 = 294578837 ^ var59;
      }

      var18.setTarget(var55);
      com.wimpyclient.l.a var20 = this.expandAnim;
      float var21 = var20.update();
      com.wimpyclient.l.a var23 = this.settingsAnim;
      float var24 = var23.update();
      Map var26 = this.hoverAnims;
      pruneAnims(var26);
      Map var28 = this.enableAnims;
      pruneAnims(var28);
      Map var30 = this.boolAnims;
      Set var31 = var30.entrySet();
      Iterator var32 = var31.iterator();
      Iterator var7 = var32;
      var59 = 1062402117 ^ var59;

      while (true) {
         byte var34 = (byte)((var7.hasNext()) ? 1 : 0);
         if (var34 == (216757180 ^ var59)) {
            var59 = tmbnfwxztnsvmyha(var59, 1062056049);
            return;
         }

         var59 = 1525325299 ^ var59;
         Object var36 = var7.next();
         Entry var37 = (Entry)var36;
         Object var39 = var37.getValue();
         com.wimpyclient.l.a var40 = (com.wimpyclient.l.a)var39;
         float var41 = var40.update();
         Object var43 = var37.getValue();
         com.wimpyclient.l.a var44 = (com.wimpyclient.l.a)var43;
         byte var45 = (byte)((var44.finished()) ? 1 : 0);
         if (var45 != (1442967119 ^ var59)) {
            var59 ^= 853859226;
            Object var47 = var37.getValue();
            com.wimpyclient.l.a var48 = (com.wimpyclient.l.a)var47;
            float var49 = var48.get();
            float var54 = 0.01F;
            float var71;
            int var50 = (var71 = var49 - var54) == 0.0F ? 0 : (var71 < 0.0F ? -1 : 1);
            if (var50 < (1692743125 ^ var59)) {
               var59 = 1271198517 ^ var59;
               var7.remove();
               var59 = 1252250596 ^ var59;
            } else {
               label34:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var59)) {
                     case 58490025:
                        var59 ^= 23535825;
                     case 877346860:
                        break label34;
                     case 1989835823:
                        break;
                     case 2122308830:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }
         } else {
            label41:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var59)) {
                  case 111406008:
                     var59 ^= 864287563;
                     break label41;
                  case 171456348:
                     break;
                  case 1185871168:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1311104272:
                     break label41;
               }
            }
         }

         var59 = 1768515256 ^ var59;
      }
   }

   private static void pruneAnims(Map<v, com.wimpyclient.l.a> var0) {
      int var28 = 1239903915 ^ 40797915 ^ 416124095;
      var28 = 643891416 ^ var28;
      Set var5 = var0.entrySet();
      Iterator var6 = var5.iterator();
      Iterator var3 = var6;
      var28 = 1357841589 ^ var28;

      while (true) {
         byte var8 = (byte)((var3.hasNext()) ? 1 : 0);
         if (var8 == (634020002 ^ var28)) {
            var28 = 1034210708 ^ var28;
            return;
         }

         var28 = 1632989776 ^ var28;
         Object var10 = var3.next();
         Entry var11 = (Entry)var10;
         Object var13 = var11.getValue();
         com.wimpyclient.l.a var14 = (com.wimpyclient.l.a)var13;
         float var15 = var14.update();
         Object var17 = var11.getValue();
         com.wimpyclient.l.a var18 = (com.wimpyclient.l.a)var17;
         byte var19 = (byte)((var18.finished()) ? 1 : 0);
         if (var19 != (1151275762 ^ var28)) {
            var28 = 1591686606 ^ var28;
            Object var21 = var11.getValue();
            com.wimpyclient.l.a var22 = (com.wimpyclient.l.a)var21;
            float var23 = var22.get();
            float var2 = 0.01F;
            float var36;
            int var24 = (var36 = var23 - var2) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
            if (var24 < (440411964 ^ var28)) {
               var28 = 1785156593 ^ var28;
               var3.remove();
               var28 = 599004443 ^ var28;
            } else {
               var28 = tmbnfwxztnsvmyha(var28, 1238583018);
            }
         } else {
            var28 = 386691876 ^ var28;
         }

         var28 = tmbnfwxztnsvmyha(var28, 1985544564);
      }
   }

   void layout(int var1, int var2, int var3, int var4, v var5, String var6) {
      int var56 = 324415868 ^ 1221920451 ^ 504965528;
      var56 = 239866700 ^ var56;
      byte var14 = (byte)((this.userMoved) ? 1 : 0);
      if (var14 == (1272319339 ^ var56)) {
         var56 = 1343931143 ^ var56;
         this.x = var1;
         this.y = var2;
         var56 = 426567569 ^ var56;
      } else {
         var56 = 1232479382 ^ var56;
      }

      this.w = var3;
      this.syncSettingsAnim(var5);
      com.wimpyclient.l.a var20 = this.expandAnim;
      float var21 = var20.get();
      float var33 = 0.01F;
      float var66;
      int var23 = (var66 = var21 - var33) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
      if (var23 < (44050941 ^ var56)) {
         var56 = 1586698633 ^ var56;
         int var34 = e.HEADER_H;
         this.h = var34;

         label28:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
               case 44265939:
                  var56 = 33368676 ^ var56;
                  break label28;
               case 759493357:
               default:
                  throw new IllegalStateException();
               case 935952216:
                  break;
               case 999587483:
                  break label28;
            }
         }
      } else {
         var56 = 972362567 ^ var56;
         int var27 = this.contentHeightFor(var5, var6);
         int var37 = e.HEADER_H;
         byte var43 = (byte)(995441338 ^ var56);
         float var50 = var27;
         float var51 = var50 * var21;
         int var52 = Math.round(var51);
         int var44 = Math.max(var43, var52);
         int var38 = var37 + var44;
         float var53 = 0.98F;
         float var67;
         int var46 = (var67 = var21 - var53) == 0.0F ? 0 : (var67 < 0.0F ? -1 : 1);
         byte var47;
         if (var46 <= (995441338 ^ var56)) {
            var56 = tmbnfwxztnsvmyha(var56, 1525820260);
            var47 = (byte)(1638339038 ^ var56);
            var56 = 2040319711 ^ var56;
         } else {
            var56 = 1263553330 ^ var56;
            var47 = (byte)(1879404940 ^ var56);

            label39:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
                  case 151714802:
                     var56 ^= 1748938377;
                     break label39;
                  case 1080453940:
                  default:
                     throw new IllegalStateException();
                  case 1479674956:
                     break label39;
                  case 2063620029:
               }
            }
         }

         int var39 = var38 + var47;
         this.h = var39;
         int var49 = this.h;
         int var41 = Math.min(var4, var49);
         this.h = var41;
         var56 = 1173734673 ^ var56;
      }

      this.clampScroll(var5, var6);
   }

   private void syncSettingsAnim(v var1) {
      int var23 = 973656300 ^ 833093252 ^ 504965528;
      var23 = 1701749031 ^ var23;
      v var15 = this.settingsTarget;
      if (var1 == var15) {
         var23 = 574248075 ^ var23;
         if (var1 != null) {
            var23 = 631456459 ^ var23;
            com.wimpyclient.l.a var6 = this.settingsAnim;
            float var16 = 1.0F;
            var6.setTarget(var16);
            var23 = 2111308996 ^ var23;
         } else {
            var23 = tmbnfwxztnsvmyha(var23, 1484473871);
         }
      } else {
         var23 = 377516232 ^ var23;
         this.settingsTarget = var1;
         if (var1 != null) {
            var23 = 2095009655 ^ var23;
            com.wimpyclient.l.a var12 = this.settingsAnim;
            float var19 = 0.0F;
            var12.snap(var19);
            com.wimpyclient.l.a var14 = this.settingsAnim;
            float var20 = 1.0F;
            var14.setTarget(var20);
            var23 = tmbnfwxztnsvmyha(var23, 270413115);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 105674884:
                     var23 ^= 1513425823;
                  case 518855131:
                     com.wimpyclient.l.a var10 = this.settingsAnim;
                     float var18 = 0.0F;
                     var10.setTarget(var18);
                     var23 = 921987539 ^ var23;
                     return;
                  case 744268641:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1784776821:
               }
            }
         }
      }
   }

   void clampToScreen(int var1, int var2) {
      int var30 = 1959379804 ^ 1043663519 ^ 504965528;
      var30 = 1510254751 ^ var30;
      int var10 = this.x;
      byte var5 = (byte)(249645254 ^ var30);
      byte var6 = (byte)(249645254 ^ var30);
      int var24 = this.w;
      int var19 = var1 - var24;
      byte var25 = (byte)(249645254 ^ var30);
      int var20 = var19 - var25;
      int var16 = Math.max(var6, var20);
      int var11 = Mth.clamp(var10, var5, var16);
      this.x = var11;
      int var13 = this.y;
      byte var15 = (byte)(249645254 ^ var30);
      byte var17 = (byte)(249645254 ^ var30);
      int var26 = e.HEADER_H;
      int var22 = var2 - var26;
      byte var27 = (byte)(249645254 ^ var30);
      int var23 = var22 - var27;
      int var18 = Math.max(var17, var23);
      int var14 = Mth.clamp(var13, var15, var18);
      this.y = var14;
   }

   boolean contains(double var1, double var3) {
      int var42 = 725332128 ^ 833883768 ^ 504965528;
      var42 = 1109167197 ^ var42;
      int var20 = this.x;
      double var21 = var20;
      double var48;
      int var9 = (var48 = var1 - var21) == 0.0 ? 0 : (var48 < 0.0 ? -1 : 1);
      if (var9 >= (1183456029 ^ var42)) {
         var42 = 941744498 ^ var42;
         int var24 = this.x;
         int var37 = this.w;
         int var25 = var24 + var37;
         double var26 = var25;
         double var49;
         int var12 = (var49 = var1 - var26) == 0.0 ? 0 : (var49 < 0.0 ? -1 : 1);
         if (var12 < (2125199983 ^ var42)) {
            var42 ^= 1669254792;
            int var29 = this.y;
            double var30 = var29;
            double var50;
            int var15 = (var50 = var3 - var30) == 0.0 ? 0 : (var50 < 0.0 ? -1 : 1);
            if (var15 >= (500511975 ^ var42)) {
               var42 ^= 1568239383;
               int var33 = this.y;
               int var39 = this.h;
               int var34 = var33 + var39;
               double var35 = var34;
               double var51;
               int var18 = (var51 = var3 - var35) == 0.0 ? 0 : (var51 < 0.0 ? -1 : 1);
               if (var18 < (1085037552 ^ var42)) {
                  var42 = 1253861883 ^ var42;
                  byte var19 = (byte)(168833546 ^ var42);
                  var42 = tmbnfwxztnsvmyha(var42, 1445514209);
                  return (var19 != 0);
               }

               label28:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                     case 223195789:
                        var42 ^= 1119021386;
                        break label28;
                     case 650674597:
                     default:
                        throw new RuntimeException();
                     case 842661169:
                        break label28;
                     case 1326916295:
                  }
               }
            } else {
               label35:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                     case 164432810:
                        var42 ^= 533431901;
                        break label35;
                     case 1044736006:
                     default:
                        throw new RuntimeException();
                     case 1647380861:
                        break;
                     case 2086883633:
                        break label35;
                  }
               }
            }
         } else {
            label42:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                  case 91048860:
                     var42 ^= 2092255445;
                     break label42;
                  case 679942688:
                     break;
                  case 923747070:
                  default:
                     throw new RuntimeException();
                  case 1067757532:
                     break label42;
               }
            }
         }
      } else {
         var42 = 1150593447 ^ var42;
      }

      byte var52 = (byte)(35566266 ^ var42);
      var42 = 1579567952 ^ var42;
      return (var52 != 0);
   }

   boolean headerContains(double var1, double var3) {
      int var41 = 196790170 ^ 1751758535 ^ 504965528;
      var41 = 887233050 ^ var41;
      int var20 = this.x;
      double var21 = var20;
      double var50;
      int var9 = (var50 = var1 - var21) == 0.0 ? 0 : (var50 < 0.0 ? -1 : 1);
      if (var9 >= (1227375327 ^ var41)) {
         var41 = 1010671644 ^ var41;
         int var24 = this.x;
         int var37 = this.w;
         int var25 = var24 + var37;
         double var26 = var25;
         double var51;
         int var12 = (var51 = var1 - var26) == 0.0 ? 0 : (var51 < 0.0 ? -1 : 1);
         if (var12 < (1964368579 ^ var41)) {
            var41 = 34795221 ^ var41;
            int var29 = this.y;
            double var30 = var29;
            double var52;
            int var15 = (var52 = var3 - var30) == 0.0 ? 0 : (var52 < 0.0 ? -1 : 1);
            if (var15 >= (1996950550 ^ var41)) {
               var41 = 1847705695 ^ var41;
               int var33 = this.y;
               int var38 = e.HEADER_H;
               int var34 = var33 + var38;
               double var35 = var34;
               double var53;
               int var18 = (var53 = var3 - var35) == 0.0 ? 0 : (var53 < 0.0 ? -1 : 1);
               if (var18 < (421973065 ^ var41)) {
                  var41 = 388071602 ^ var41;
                  byte var19 = (byte)(235359482 ^ var41);
                  var41 = 1456977406 ^ var41;
                  return (var19 != 0);
               }

               var41 = tmbnfwxztnsvmyha(var41, 948309234);
            } else {
               var41 = tmbnfwxztnsvmyha(var41, 1453837485);
            }
         } else {
            var41 = tmbnfwxztnsvmyha(var41, 1421156984);
         }
      } else {
         var41 = tmbnfwxztnsvmyha(var41, 1753776740);
      }

      byte var54 = (byte)(564183227 ^ var41);
      var41 = 2037397950 ^ var41;
      return (var54 != 0);
   }

   int contentTop() {
      int var7 = 970095399 ^ 1309292513 ^ 504965528;
      var7 = 2062222824 ^ var7;
      int var3 = this.y;
      int var2 = e.HEADER_H;
      return var3 + var2;
   }

   int contentBottom() {
      int var10 = 360437466 ^ 774103074 ^ 504965528;
      var10 = 1709844635 ^ var10;
      int var3 = this.y;
      int var6 = this.h;
      int var4 = var3 + var6;
      byte var7 = (byte)(1084962809 ^ var10);
      return var4 - var7;
   }

   int contentHeight() {
      int var10 = 176703266 ^ 1600762835 ^ 504965528;
      var10 = 1062180283 ^ var10;
      byte var1 = (byte)(1958168786 ^ var10);
      int var5 = this.contentBottom();
      int var7 = this.contentTop();
      int var6 = var5 - var7;
      return Math.max(var1, var6);
   }

   int contentWidth() {
      int var9 = 789402689 ^ 326628228 ^ 504965528;
      var9 = 1608139700 ^ var9;
      int var4 = this.w;
      int var2 = e.PAD;
      byte var3 = (byte)(2109328875 ^ var9);
      int var6 = var2 * var3;
      return var4 - var6;
   }

   List<v> modules(String var1) {
      int var57 = 743116245 ^ 728454333 ^ 504965528;
      var57 = 2121068642 ^ var57;
      String var45;
      if (var1 == null) {
         var57 = 1389864079 ^ var57;
         var45 = nncilsnhig(nleueevsvvgergr(), wdhqinctnounira(), var57);

         label63:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var57)) {
               case 128716922:
                  var57 ^= 903446853;
                  break label63;
               case 179677287:
                  break;
               case 675432244:
               default:
                  throw new RuntimeException();
               case 1806558097:
                  break label63;
            }
         }
      } else {
         var57 = tmbnfwxztnsvmyha(var57, 1265294194);
         var45 = var1;
         var57 = 744816312 ^ var57;
      }

      String var46 = this.cachedModuleFilter;
      byte var11 = (byte)((var45.equals(var46)) ? 1 : 0);
      if (var11 != (6006104 ^ var57)) {
         var57 = 2111407878 ^ var57;
         List var13 = this.cachedModules;
         if (var13 != null) {
            var57 = 167124222 ^ var57;
            return this.cachedModules;
         }

         var57 = 183378914 ^ var57;
      } else {
         var57 = 2000135396 ^ var57;
      }

      x var14 = com.wimpyclient.i.x.INSTANCE;
      w var48 = this.category;
      List var15 = var14.modulesIn(var48);
      byte var17 = (byte)((var45.isBlank()) ? 1 : 0);
      Object var54;
      if (var17 != (2003567036 ^ var57)) {
         var57 = 1108218863 ^ var57;
         var54 = var15;
         var57 = tmbnfwxztnsvmyha(var57, 822455056);
      } else {
         var57 = 1702158428 ^ var57;
         String var23 = var45.trim();
         String var24 = var23.toLowerCase();
         String var6 = var24;
         ArrayList var25 = new ArrayList();
         ArrayList var7 = var25;
         Iterator var27 = var15.iterator();
         Iterator var8 = var27;
         var57 = 1616252238 ^ var57;

         while (true) {
            byte var29 = (byte)((var8.hasNext()) ? 1 : 0);
            if (var29 == (1917775022 ^ var57)) {
               var57 = 1737319363 ^ var57;
               var54 = var7;
               var57 = 295974446 ^ var57;
               break;
            }

            label51: {
               var57 = 224159865 ^ var57;
               Object var32 = var8.next();
               v var33 = (v)var32;
               String var35 = var33.displayNameString();
               String var36 = var35.toLowerCase();
               byte var37 = (byte)((var36.contains(var6)) ? 1 : 0);
               if (var37 == (2131920087 ^ var57)) {
                  var57 = 557025453 ^ var57;
                  String var39 = var33.id();
                  byte var40 = (byte)((var39.contains(var6)) ? 1 : 0);
                  if (var40 == (1579224186 ^ var57)) {
                     var57 = tmbnfwxztnsvmyha(var57, 566253151);
                     break label51;
                  }

                  var57 = 1630177449 ^ var57;
               } else {
                  label49:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var57)) {
                        case 104046194:
                           var57 ^= 1075380228;
                           break label49;
                        case 354592481:
                        default:
                           throw new RuntimeException();
                        case 1296783686:
                           break;
                        case 1717475333:
                           break label49;
                     }
                  }
               }

               boolean var42 = var7.add(var33);
               var57 = 1089134326 ^ var57;
            }

            var57 = tmbnfwxztnsvmyha(var57, 229619339);
         }
      }

      this.cachedModuleFilter = var45;
      this.cachedModules = (List<v>)var54;
      return (List<v>)var54;
   }

   int contentHeightFor(v var1, String var2) {
      int var43 = 7034380 ^ 907420690 ^ 504965528;
      var43 = 442967833 ^ var43;
      byte var3 = (byte)(839089311 ^ var43);
      int var6 = var3;
      com.wimpyclient.l.a var13 = this.settingsAnim;
      float var14 = var13.eased();
      float var7 = var14;
      List var16 = this.modules(var2);
      List var8 = var16;
      byte var17 = (byte)(839089311 ^ var43);
      int var9 = var17;
      int var19 = var16.size();
      int var10 = var19;
      var43 = 466837664 ^ var43;

      label28:
      while (var9 < var10) {
         var43 = 853833318 ^ var43;
         Object var22 = var8.get(var9);
         v var23 = (v)var22;
         int var33 = e.ROW_H;
         int var25 = var6 + var33;
         var6 = var25;
         if (var23 == var1) {
            var43 = 1745422648 ^ var43;
            int var36 = settingsHeight(var23);
            float var37 = var36;
            float var38 = var37 * var7;
            int var39 = Math.round(var38);
            int var28 = var25 + var39;
            var6 = var28;
            var43 = 1049231480 ^ var43;
         } else {
            var43 = 1451428160 ^ var43;
         }

         var9 += 1303864088 ^ var43;

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var43)) {
               case 76787445:
                  continue label28;
               case 110304695:
                  var43 ^= 1684504358;
                  continue label28;
               case 813966861:
               default:
                  throw new RuntimeException();
               case 1969888500:
            }
         }
      }

      var43 = 635818574 ^ var43;
      byte var40 = (byte)(204852853 ^ var43);
      return Math.max(var6, var40);
   }

   void clampScroll(v var1, String var2) {
      int var21 = 627674240 ^ 349175057 ^ 504965528;
      var21 = 253761137 ^ var21;
      byte var3 = (byte)(547311224 ^ var21);
      int var10 = this.contentHeightFor(var1, var2);
      int var16 = this.contentHeight();
      int var11 = var10 - var16;
      int var8 = Math.max(var3, var11);
      int var13 = this.scroll;
      byte var17 = (byte)(547311224 ^ var21);
      int var14 = Mth.clamp(var13, var17, var8);
      this.scroll = var14;
   }

   boolean mouseScrolled(double var1, v var3, String var4) {
      int var29 = 2103446024 ^ 1369850009 ^ 504965528;
      var29 = 186241397 ^ var29;
      com.wimpyclient.l.a var10 = this.expandAnim;
      float var11 = var10.get();
      float var6 = 0.05F;
      float var33;
      int var12 = (var33 = var11 - var6) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
      if (var12 < (969323132 ^ var29)) {
         var29 = 1304744598 ^ var29;
         return (((byte)(1946312938 ^ var29)) != 0);
      } else {
         var29 = 471950905 ^ var29;
         int var17 = this.scroll;
         int var9 = e.SCROLL_STEP;
         double var26 = var9;
         double var20 = var1 * var26;
         long var22 = Math.round(var20);
         int var24 = (int)var22;
         int var18 = var17 - var24;
         this.scroll = var18;
         this.clampScroll(var3, var4);
         return (((byte)(635950148 ^ var29)) != 0);
      }
   }

   void toggleCollapsed() {
      int var16 = 341823631 ^ 77857532 ^ 504965528;
      var16 = 756410129 ^ var16;
      byte var8 = (byte)((this.collapsed) ? 1 : 0);
      byte var9;
      if (var8 == (603397370 ^ var16)) {
         var16 = 531940813 ^ var16;
         var9 = (byte)(1011079478 ^ var16);

         label37:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
               case 79906969:
                  var16 ^= 105046669;
                  break label37;
               case 983403340:
                  break;
               case 1155737209:
               default:
                  throw new RuntimeException(new IOException());
               case 1370940104:
                  break label37;
            }
         }
      } else {
         var16 = tmbnfwxztnsvmyha(var16, 1313222563);
         var9 = (byte)(1840329561 ^ var16);
         var16 = 1471154403 ^ var16;
      }

      this.collapsed = (var9 != 0);
      com.wimpyclient.l.a var4 = this.expandAnim;
      byte var11 = (byte)((this.collapsed) ? 1 : 0);
      float var13;
      if (var11 != (973159354 ^ var16)) {
         var16 = 1133998936 ^ var16;
         var13 = 0.0F;
         var16 = tmbnfwxztnsvmyha(var16, 2107357005);
      } else {
         label28:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
               case 6445497:
                  var16 ^= 259714127;
               case 1305659052:
                  break label28;
               case 1554425739:
               default:
                  throw new RuntimeException(new IOException());
               case 1910390805:
            }
         }

         var13 = 1.0F;
         var16 = 829827162 ^ var16;
      }

      var4.setTarget(var13);
      byte var6 = (byte)((this.collapsed) ? 1 : 0);
      if (var6 == (68026287 ^ var16)) {
         var16 = 1463222157 ^ var16;
         byte var12 = (byte)(1396375586 ^ var16);
         this.scroll = var12;
         var16 = 665782044 ^ var16;
      } else {
         var16 = 1889138833 ^ var16;
      }
   }

   void renderExtract(GuiGraphics var1, Font var2, int var3, int var4, v var5, v var6, com.wimpyclient.j.g var7, b$a var8, String var9) {
      int var308 = 2136234220 ^ 121416877 ^ 504965528;
      var308 = 2044092138 ^ var308;
      String var11 = nncilsnhig(uosvogonfttgbyt(), wdhqinctnounira(), var308);
      this.hoverTip = var11;
      int var102 = this.x;
      int var153 = this.y;
      int var194 = this.w;
      int var238 = this.h;
      d.panel(var1, var102, var153, var194, var238);
      int var104 = this.x;
      byte var154 = (byte)(531071794 ^ var308);
      int var105 = var104 + var154;
      int var156 = this.y;
      byte var195 = (byte)(531071794 ^ var308);
      int var157 = var156 + var195;
      int var197 = this.x;
      int var240 = this.w;
      int var198 = var197 + var240;
      byte var241 = (byte)(531071794 ^ var308);
      int var199 = var198 - var241;
      int var243 = this.y;
      int var15 = e.HEADER_H;
      int var244 = var243 + var15;
      int var282 = -525100269 ^ var308;
      var1.fill(var105, var157, var199, var244, var282);
      int var107 = this.x;
      byte var158 = (byte)(531071794 ^ var308);
      int var108 = var107 + var158;
      int var160 = this.y;
      int var200 = e.HEADER_H;
      int var161 = var160 + var200;
      byte var201 = (byte)(531071794 ^ var308);
      int var162 = var161 - var201;
      int var203 = this.w;
      byte var245 = (byte)(531071793 ^ var308);
      int var204 = var203 - var245;
      int var246 = 928545996 ^ var308;
      d.hLine(var1, var108, var162, var204, var246);
      int var41 = e.ICON;
      int var110 = this.x;
      int var163 = e.PAD;
      int var111 = var110 + var163;
      int var165 = this.y;
      int var205 = e.HEADER_H;
      int var206 = var205 - var41;
      byte var248 = (byte)(531071793 ^ var308);
      int var207 = var206 / var248;
      int var166 = var165 + var207;
      byte var208 = (byte)(531071795 ^ var308);
      d.drawCategoryIcon(var1, var111, var166, var208);
      w var44 = this.category;
      Component var45 = var44.displayName();
      String var46 = var45.getString();
      int var48 = this.x;
      int var113 = this.w;
      int var168 = var2.width(var46);
      int var114 = var113 - var168;
      byte var169 = (byte)(531071793 ^ var308);
      int var115 = var114 / var169;
      int var49 = var48 + var115;
      int var250 = this.y;
      int var283 = e.HEADER_H;
      int var251 = d.textY(var250, var283, var2);
      int var284 = -522955828 ^ var308;
      byte var300 = (byte)(531071795 ^ var308);
      var1.drawString(var2, var46, var49, var251, var284, (var300 != 0));
      byte var172 = (byte)((this.collapsed) ? 1 : 0);
      String var193;
      if (var172 != (531071795 ^ var308)) {
         var308 = 1647718689 ^ var308;
         var193 = nncilsnhig(yandhivqnmlltmu(), wdhqinctnounira(), var308);
         var308 = 1093902897 ^ var308;
      } else {
         var308 = 168051543 ^ var308;
         var193 = nncilsnhig(acvqdrihycicvoy(), wdhqinctnounira(), var308);
         var308 = 687984711 ^ var308;
      }

      int var212 = this.x;
      int var253 = this.w;
      int var213 = var212 + var253;
      int var254 = e.PAD;
      int var214 = var213 - var254;
      byte var286 = (byte)((this.collapsed) ? 1 : 0);
      String var299;
      if (var286 != (1017253923 ^ var308)) {
         var308 = 948716724 ^ var308;
         var299 = nncilsnhig(zzzciirgvyuagzp(), wdhqinctnounira(), var308);

         label151:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var308)) {
               case 65760099:
                  var308 ^= 1134578777;
                  break label151;
               case 938470475:
                  break;
               case 1165299770:
                  break label151;
               case 1623163164:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      } else {
         var308 = 434107757 ^ var308;
         var299 = nncilsnhig(jlyxybqodchvlwi(), wdhqinctnounira(), var308);
         var308 = 1660157312 ^ var308;
      }

      int var256 = var2.width(var299);
      int var215 = var214 - var256;
      int var258 = this.y;
      int var287 = e.HEADER_H;
      int var259 = d.textY(var258, var287, var2);
      int var288 = -1207846788 ^ var308;
      byte var302 = (byte)(1200494798 ^ var308);
      var1.drawString(var2, var193, var215, var259, var288, (var302 != 0));
      byte var53 = (byte)((this.collapsed) ? 1 : 0);
      if (var53 != (1200494798 ^ var308)) {
         var308 = 2096852064 ^ var308;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var308)) {
               case 178460545:
                  var308 ^= 100711859;
               case 1432199531:
                  int var55 = this.x;
                  int var118 = e.PAD;
                  int var56 = var55 + var118;
                  int var27 = var56;
                  int var58 = this.contentWidth();
                  int var28 = var58;
                  int var60 = this.contentTop();
                  int var29 = var60;
                  int var62 = this.contentBottom();
                  int var30 = var62;
                  int var120 = this.x;
                  byte var173 = (byte)(1099867516 ^ var308);
                  int var121 = var120 + var173;
                  int var217 = this.x;
                  int var261 = this.w;
                  int var218 = var217 + var261;
                  byte var262 = (byte)(1099867516 ^ var308);
                  int var219 = var218 - var262;
                  var1.enableScissor(var121, var60, var219, var62);
                  int var123 = this.scroll;
                  int var65 = var60 - var123;
                  int var31 = var65;
                  List var67 = this.modules(var9);
                  Iterator var68 = var67.iterator();
                  Iterator var32 = var68;
                  var308 = 577041201 ^ var308;

                  label137:
                  while (true) {
                     byte var70 = (byte)((var32.hasNext()) ? 1 : 0);
                     if (var70 == (1676301900 ^ var308)) {
                        var308 = 37234075 ^ var308;
                        var1.disableScissor();
                        return;
                     }

                     var308 = 696175487 ^ var308;
                     Object var73 = var32.next();
                     v var74 = (v)var73;
                     byte var100;
                     if (var74 != var5) {
                        var308 = tmbnfwxztnsvmyha(var308, 1997373760);
                        var100 = (byte)(1033444467 ^ var308);
                        var308 = 1731929107 ^ var308;
                     } else {
                        var308 = 1683030400 ^ var308;
                        var100 = (byte)(784702642 ^ var308);

                        label78:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var308)) {
                              case 178188639:
                                 var308 ^= 1952949459;
                              case 646695231:
                                 break label78;
                              case 990892390:
                                 break;
                              case 1343027298:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }
                     }

                     byte var77;
                     byte var99;
                     label110: {
                        var77 = (byte)((var74.qo()) ? 1 : 0);
                        int var127 = this.x;
                        if (var3 >= var127) {
                           var308 = 2027900197 ^ var308;
                           int var129 = this.x;
                           int var176 = this.w;
                           int var130 = var129 + var176;
                           if (var3 < var130) {
                              var308 = 1168528981 ^ var308;
                              if (var4 >= var31) {
                                 var308 = 1757753846 ^ var308;
                                 int var177 = e.ROW_H;
                                 int var133 = var31 + var177;
                                 if (var4 < var133) {
                                    var308 = 1334439744 ^ var308;
                                    if (var4 >= var29) {
                                       var308 = 2131021471 ^ var308;
                                       if (var4 < var30) {
                                          var308 = 476068334 ^ var308;
                                          var99 = (byte)(603130582 ^ var308);

                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var308)) {
                                                case 94815987:
                                                   var308 ^= 1240367268;
                                                   break label110;
                                                case 517143462:
                                                   break;
                                                case 641928557:
                                                default:
                                                   throw new RuntimeException(new IOException());
                                                case 1151776696:
                                                   break label110;
                                             }
                                          }
                                       }

                                       var308 = tmbnfwxztnsvmyha(var308, 1242533192);
                                    } else {
                                       var308 = tmbnfwxztnsvmyha(var308, 889930711);
                                    }
                                 } else {
                                    var308 = 2055384215 ^ var308;
                                 }
                              } else {
                                 label106:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var308)) {
                                       case 101533522:
                                       default:
                                          throw new RuntimeException(new IOException());
                                       case 154727476:
                                          var308 ^= 306683233;
                                          break label106;
                                       case 183905342:
                                          break;
                                       case 686334559:
                                          break label106;
                                    }
                                 }
                              }
                           } else {
                              var308 = 1474415412 ^ var308;
                           }
                        } else {
                           label100:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var308)) {
                                 case 261756824:
                                    var308 ^= 792626705;
                                    break label100;
                                 case 548046639:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1312536089:
                                    break label100;
                                 case 2127783506:
                              }
                           }
                        }

                        var99 = (byte)(1973206641 ^ var308);
                        var308 = 528561154 ^ var308;
                     }

                     if (var100 != (1780320883 ^ var308)) {
                        var308 = 711592244 ^ var308;
                        int var151 = this.x;
                        byte var191 = (byte)(1081574213 ^ var308);
                        int var152 = var151 + var191;
                        int var235 = this.x;
                        int var278 = this.w;
                        int var236 = var235 + var278;
                        byte var279 = (byte)(1081574213 ^ var308);
                        int var237 = var236 - var279;
                        int var297 = e.ROW_H;
                        int var281 = var31 + var297;
                        int var298 = -1083465363 ^ var308;
                        var1.fill(var152, var31, var237, var281, var298);
                        var308 = 196180094 ^ var308;
                     } else {
                        var308 = 925404290 ^ var308;
                        if (var99 != (1563756273 ^ var308)) {
                           var308 = 684169169 ^ var308;
                           int var137 = this.x;
                           byte var178 = (byte)(1978831138 ^ var308);
                           int var138 = var137 + var178;
                           int var221 = this.x;
                           int var265 = this.w;
                           int var222 = var221 + var265;
                           byte var266 = (byte)(1978831138 ^ var308);
                           int var223 = var222 - var266;
                           int var289 = e.ROW_H;
                           int var268 = var31 + var289;
                           int var290 = -1966032624 ^ var308;
                           var1.fill(var138, var31, var223, var268, var290);
                           var308 = 1043622425 ^ var308;
                        } else {
                           var308 = 385088968 ^ var308;
                        }
                     }

                     if (var77 != (1271331641 ^ var308)) {
                        var308 = 1945959763 ^ var308;
                        int var140 = this.x;
                        byte var180 = (byte)(943326824 ^ var308);
                        int var141 = var140 + var180;
                        byte var224 = (byte)(943326830 ^ var308);
                        int var182 = var31 + var224;
                        int var226 = this.x;
                        byte var269 = (byte)(943326830 ^ var308);
                        int var227 = var226 + var269;
                        int var291 = e.ROW_H;
                        int var271 = var31 + var291;
                        byte var292 = (byte)(943326830 ^ var308);
                        int var272 = var271 - var292;
                        int var293 = -951462251 ^ var308;
                        var1.fill(var141, var182, var227, var272, var293);
                        var308 = 751616515 ^ var308;
                     } else {
                        label122:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var308)) {
                              case 47304056:
                                 var308 ^= 1596997456;
                                 break label122;
                              case 601512431:
                                 break;
                              case 981315046:
                                 break label122;
                              case 1240057985:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }
                     }

                     Component var143 = var74.displayName();
                     String var144 = var143.getString();
                     int var228 = e.TOGGLE_W;
                     int var184 = var28 - var228;
                     byte var229 = (byte)(351716453 ^ var308);
                     int var185 = var184 - var229;
                     String var90 = d.ellipsize(var2, var144, var185);
                     byte var273 = (byte)(351716463 ^ var308);
                     int var231 = var27 + var273;
                     int var294 = e.ROW_H;
                     int var275 = d.textY(var31, var294, var2);
                     int var295 = -352046445 ^ var308;
                     byte var304 = (byte)(351716457 ^ var308);
                     var1.drawString(var2, var90, var231, var275, var295, (var304 != 0));
                     int var147 = e.toggleX(var27, var28);
                     int var189 = e.toggleY(var31);
                     d.drawToggle(var1, var147, var189, (var77 != 0));
                     int var148 = e.ROW_H;
                     int var94 = var31 + var148;
                     var31 = var94;
                     if (var100 != (351716457 ^ var308)) {
                        var308 = 1160602123 ^ var308;
                        int var97 = this.renderSettingsExtract(var1, var2, var27, var94, var28, var74, var6, var7, var8, var3, var4, var29, var30);
                        var31 = var97;
                        var308 = 1099665132 ^ var308;
                     } else {
                        var308 = tmbnfwxztnsvmyha(var308, 78048487);
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var308)) {
                           case 261840579:
                              var308 ^= 1941601986;
                           case 537791230:
                              continue label137;
                           case 924331285:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1274005351:
                        }
                     }
                  }
               case 1052747052:
               default:
                  throw new RuntimeException(new IOException());
               case 1144963436:
            }
         }
      }
   }

   private int renderSettingsExtract(
      GuiGraphics var1, Font var2, int var3, int var4, int var5, v var6, v var7, com.wimpyclient.j.g var8, b$a var9, int var10, int var11, int var12, int var13
   ) {
      int var77 = 110989028 ^ 1174404909 ^ 504965528;
      var77 = 1249879663 ^ var77;
      byte var68;
      if (var7 == var6) {
         var77 = 1673582887 ^ var77;
         var68 = (byte)(1959012120 ^ var77);

         label44:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
               case 37519108:
                  var77 ^= 1069956010;
                  break label44;
               case 568457346:
               default:
                  throw new RuntimeException();
               case 923767610:
                  break label44;
               case 1845657269:
            }
         }
      } else {
         var77 = 543594539 ^ var77;
         var68 = (byte)(929195541 ^ var77);
         var77 = 2086697638 ^ var77;
      }

      int var32 = this.drawKeybindRowExtract(var1, var2, var3, var4, var5, var6, (var68 != 0), var10, var11, var12, var13);
      int var74 = var32;
      List var34 = visibleSettings(var6);
      Iterator var36 = var34.iterator();
      Iterator var29 = var36;
      var77 = 2146986270 ^ var77;

      while (true) {
         byte var38 = (byte)((var29.hasNext()) ? 1 : 0);
         if (var38 == (888829357 ^ var77)) {
            var77 = tmbnfwxztnsvmyha(var77, 1011999741);
            byte var40 = (byte)((var34.isEmpty()) ? 1 : 0);
            if (var40 == (145462864 ^ var77)) {
               var77 = tmbnfwxztnsvmyha(var77, 1217233122);
               return var74;
            }

            var77 = 1360081480 ^ var77;
            List var42 = var6.settings();
            byte var43 = (byte)((var42.isEmpty()) ? 1 : 0);
            if (var43 != (1505403928 ^ var77)) {
               var77 = 213277709 ^ var77;
               String var53 = nncilsnhig(jnmlucmxxllglcr(), wdhqinctnounira(), var77);
               byte var58 = (byte)(1426913297 ^ var77);
               int var56 = var3 + var58;
               byte var62 = (byte)(1426913299 ^ var77);
               int var60 = var74 + var62;
               int var63 = -1434232665 ^ var77;
               byte var65 = (byte)(1426913301 ^ var77);
               var1.drawString(var2, var53, var56, var60, var63, (var65 != 0));
               var74 += 1426913281 ^ var77;
               var77 = 355135143 ^ var77;
               return var74;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                  case 41506767:
                  default:
                     throw new RuntimeException();
                  case 232375380:
                     var77 = 429699754 ^ var77;
                     return var74;
                  case 861750074:
                     break;
                  case 1975363660:
                     return var74;
               }
            }
         }

         var77 = 1988812597 ^ var77;
         Object var47 = var29.next();
         com.wimpyclient.j.f var48 = (com.wimpyclient.j.f)var47;
         int var50 = this.drawSettingExtract(var1, var2, var3, var74, var5, var48, var8, var9, var10, var11, var12, var13);
         var74 = var50;
         var77 = 1988812597 ^ var77;
      }
   }

   private int drawKeybindRowExtract(GuiGraphics var1, Font var2, int var3, int var4, int var5, v var6, boolean var7, int var8, int var9, int var10, int var11) {
      int var29;
      byte var49;
      int var109;
      label76: {
         var109 = 2130635284 ^ 781670334 ^ 504965528;
         var109 = 2004823162 ^ var109;
         float var51 = var8;
         float var59 = var9;
         int var18 = e.SETTING_H;
         String var21 = nncilsnhig(puomwkvyhpstlvw(), wdhqinctnounira(), var109);
         this.noteHover(var51, var59, var3, var4, var5, var18, var10, var11, var21);
         String var60 = nncilsnhig(dtzbqjawikmzogg(), wdhqinctnounira(), var109);
         byte var79 = (byte)(957331532 ^ var109);
         int var73 = var3 + var79;
         byte var89 = (byte)(957331532 ^ var109);
         int var81 = var4 + var89;
         int var90 = -964683526 ^ var109;
         byte var98 = (byte)(957331528 ^ var109);
         var1.drawString(var2, var60, var73, var81, var90, (var98 != 0));
         int var53 = e.LABEL_GAP;
         var29 = var4 + var53;
         if (var7 != ((957331528 ^ var109) != 0)) {
            var109 = 1098080274 ^ var109;
            long var31 = System.nanoTime();
            long var61 = 180000000L;
            long var33 = var31 / var61;
            long var63 = 2L;
            long var35 = var33 % var63;
            long var65 = 0L;
            long var115;
            int var37 = (var115 = var35 - var65) == 0L ? 0 : (var115 < 0L ? -1 : 1);
            if (var37 == (2021447770 ^ var109)) {
               var109 = 1784523219 ^ var109;
               var49 = (byte)(304181640 ^ var109);

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var109)) {
                     case 52484568:
                        var109 ^= 1351236497;
                        break label76;
                     case 1022594920:
                     default:
                        throw new RuntimeException();
                     case 1150327446:
                        break label76;
                     case 1906001060:
                  }
               }
            }

            label73:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var109)) {
                  case 158440274:
                     var109 ^= 132442748;
                     break label73;
                  case 264959894:
                  default:
                     throw new RuntimeException();
                  case 334541877:
                     break;
                  case 659268855:
                     break label73;
               }
            }
         } else {
            var109 = tmbnfwxztnsvmyha(var109, 1184336494);
         }

         var49 = (byte)(2140680742 ^ var109);
         var109 = 1026783294 ^ var109;
      }

      int var48;
      if (var7 != ((1118521880 ^ var109) != 0)) {
         var109 = 1782182754 ^ var109;
         if (var49 != (680704378 ^ var109)) {
            var109 = 1112055290 ^ var109;
            var48 = (short)(-1792700204 ^ var109);
            var109 = tmbnfwxztnsvmyha(var109, 1662016886);
         } else {
            var109 = tmbnfwxztnsvmyha(var109, 1581774146);
            var48 = -30738324 ^ var109;

            label54:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var109)) {
                  case 49611111:
                     break;
                  case 104674681:
                     var109 ^= 2132751822;
                     break label54;
                  case 169497777:
                  default:
                     throw new RuntimeException();
                  case 1484514299:
                     break label54;
               }
            }
         }
      } else {
         label47:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var109)) {
               case 19635493:
                  var109 ^= 176929928;
                  break label47;
               case 344616178:
               default:
                  throw new RuntimeException();
               case 938097986:
                  break label47;
               case 1158811317:
            }
         }

         var48 = -1221663608 ^ var109;
         var109 = 1105891174 ^ var109;
      }

      byte var67 = (byte)(164264436 ^ var109);
      int var55 = var3 + var67;
      byte var82 = (byte)(164264436 ^ var109);
      int var75 = var5 - var82;
      int var83 = e.BTN_H;
      int var91 = e.BTN_H;
      byte var99 = (byte)(164264436 ^ var109);
      int var92 = var91 / var99;
      d.fillRound(var1, var55, var29, var75, var83, var92, var48);
      String var50;
      if (var7 == ((164264438 ^ var109) != 0)) {
         var109 = 516255716 ^ var109;
         var50 = var6.keybindLabel();
         var109 = 1153971883 ^ var109;
      } else {
         var109 = 1419765695 ^ var109;
         var50 = nncilsnhig(xvjvzbwnkszbhxr(), wdhqinctnounira(), var109);

         label40:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var109)) {
               case 81117176:
                  var109 ^= 244498160;
                  break label40;
               case 1227577062:
               default:
                  throw new RuntimeException();
               case 1977424055:
                  break label40;
               case 2034975546:
            }
         }
      }

      byte var76 = (byte)(1405558963 ^ var109);
      int var70 = var5 - var76;
      String var42 = d.ellipsize(var2, var50, var70);
      int var94 = var2.width(var42);
      int var85 = var5 - var94;
      byte var95 = (byte)(1405558971 ^ var109);
      int var86 = var85 / var95;
      int var78 = var3 + var86;
      int var96 = e.BTN_H;
      int var88 = d.textY(var29, var96, var2);
      int var97 = -1405757885 ^ var109;
      byte var103 = (byte)(1405558969 ^ var109);
      var1.drawString(var2, var42, var78, var88, var97, (var103 != 0));
      int var58 = e.SETTING_H;
      return var4 + var58;
   }

   private int drawSettingExtract(
      GuiGraphics var1,
      Font var2,
      int var3,
      int var4,
      int var5,
      com.wimpyclient.j.f var6,
      com.wimpyclient.j.g var7,
      b$a var8,
      int var9,
      int var10,
      int var11,
      int var12
   ) {
      int var624 = 1608013422 ^ 1879899772 ^ 504965528;
      var624 = 1512799661 ^ var624;
      byte var32 = (byte)((var6 instanceof com.wimpyclient.j.a) ? 1 : 0);
      if (var32 != (1810299943 ^ var624)) {
         var624 = 1158311091 ^ var624;
         com.wimpyclient.j.a var34 = (com.wimpyclient.j.a)var6;
         float var166 = var9;
         float var260 = var10;
         int var19 = e.ROW_H;
         String var588 = var6.description();
         this.noteHover(var166, var260, var3, var4, var5, var19, var11, var12, var588);
         String var168 = var6.name();
         int var346 = e.TOGGLE_W;
         int var262 = var5 - var346;
         byte var347 = (byte)(787255448 ^ var624);
         int var263 = var262 - var347;
         String var37 = d.ellipsize(var2, var168, var263);
         byte var418 = (byte)(787255440 ^ var624);
         int var349 = var3 + var418;
         int var493 = e.ROW_H;
         int var420 = d.textY(var4, var493, var2);
         int var494 = -782028762 ^ var624;
         byte var552 = (byte)(787255444 ^ var624);
         var1.drawString(var2, var37, var349, var420, var494, (var552 != 0));
         int var171 = e.toggleX(var3, var5);
         int var267 = e.toggleY(var4);
         boolean var351 = var34.get();
         d.drawToggle(var1, var171, var267, var351);
         int var172 = e.ROW_H;
         return var4 + var172;
      } else {
         var624 = 1428929308 ^ var624;
         byte var43 = (byte)((var6 instanceof com.wimpyclient.j.b) ? 1 : 0);
         int var117;
         String var258;
         if (var43 != (1053640507 ^ var624)) {
            var624 = 1290266327 ^ var624;
            com.wimpyclient.j.b var45 = (com.wimpyclient.j.b)var6;
            float var174 = var9;
            float var269 = var10;
            int var553 = e.ROW_H;
            String var590 = var6.description();
            this.noteHover(var174, var269, var3, var4, var5, var553, var11, var12, var590);
            byte var47 = (byte)(1915396582 ^ var624);
            int var175 = e.ICON;
            byte var270 = (byte)(1915396584 ^ var624);
            int var176 = var175 + var270;
            int var48 = Math.max(var47, var176);
            String var178 = var6.name();
            int var272 = var5 - var48;
            byte var354 = (byte)(1915396576 ^ var624);
            int var273 = var272 - var354;
            String var50 = d.ellipsize(var2, var178, var273);
            byte var422 = (byte)(1915396584 ^ var624);
            int var356 = var3 + var422;
            int var496 = e.ROW_H;
            int var424 = d.textY(var4, var496, var2);
            int var497 = -1918566050 ^ var624;
            byte var555 = (byte)(1915396588 ^ var624);
            var1.drawString(var2, var50, var356, var424, var497, (var555 != 0));
            int var180 = e.ROW_H;
            int var181 = var180 - var48;
            byte var276 = (byte)(1915396590 ^ var624);
            int var182 = var181 / var276;
            int var53 = var4 + var182;
            int var184 = var3 + var5;
            int var185 = var184 - var48;
            int var358 = var3 + var5;
            int var427 = var53 + var48;
            int var500 = var45.argb();
            var1.fill(var185, var53, var358, var427, var500);
            int var186 = e.ROW_H;
            int var56 = var4 + var186;
            byte var58 = (byte)((var45.isPickerOpen()) ? 1 : 0);
            if (var58 != (1915396588 ^ var624)) {
               var624 = 801320346 ^ var624;
               byte var280 = (byte)(1575586932 ^ var624);
               int var188 = var3 + var280;
               byte var428 = (byte)(1575586932 ^ var624);
               int var360 = var5 - var428;
               int var60 = drawColorPickerExtract(var1, var188, var56, var360, var45, var8);
               var624 = 1329513311 ^ var624;
               return var60;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var624)) {
                  case 221440915:
                     var624 = 1627254469 ^ var624;
                     return var56;
                  case 1059738066:
                     break;
                  case 1542288982:
                     return var56;
                  case 1800190278:
                  default:
                     throw new IllegalStateException();
               }
            }
         } else {
            label161: {
               var624 = 886301144 ^ var624;
               byte var63 = (byte)((var6 instanceof com.wimpyclient.j.d) ? 1 : 0);
               if (var63 != (169780963 ^ var624)) {
                  var624 = 2043662056 ^ var624;
                  com.wimpyclient.j.d var65 = (com.wimpyclient.j.d)var6;
                  float var190 = var9;
                  float var283 = var10;
                  int var556 = e.SETTING_H;
                  String var592 = var6.description();
                  this.noteHover(var190, var283, var3, var4, var5, var556, var11, var12, var592);
                  int var68 = var65.get();
                  String var69 = Integer.toString(var68);
                  String var285 = var6.name();
                  byte var431 = (byte)(1943103503 ^ var624);
                  int var363 = var3 + var431;
                  byte var503 = (byte)(1943103503 ^ var624);
                  int var433 = var4 + var503;
                  int var504 = -1939945287 ^ var624;
                  byte var557 = (byte)(1943103499 ^ var624);
                  var1.drawString(var2, var285, var363, var433, var504, (var557 != 0));
                  int var365 = var3 + var5;
                  byte var435 = (byte)(1943103503 ^ var624);
                  int var366 = var365 - var435;
                  int var437 = var2.width(var69);
                  int var367 = var366 - var437;
                  byte var506 = (byte)(1943103503 ^ var624);
                  int var439 = var4 + var506;
                  int var507 = -1935492876 ^ var624;
                  byte var558 = (byte)(1943103499 ^ var624);
                  var1.drawString(var2, var69, var367, var439, var507, (var558 != 0));
                  int var193 = e.LABEL_GAP;
                  int var73 = var4 + var193;
                  byte var194 = (byte)(1943103497 ^ var624);
                  int var75 = var3 + var194;
                  byte var76 = (byte)(1943103491 ^ var624);
                  byte var287 = (byte)(1943103503 ^ var624);
                  int var196 = var5 - var287;
                  int var77 = Math.max(var76, var196);
                  int var79 = var65.get();
                  int var198 = var65.min();
                  int var80 = var79 - var198;
                  float var81 = var80;
                  byte var199 = (byte)(1943103498 ^ var624);
                  int var289 = var65.max();
                  int var369 = var65.min();
                  int var290 = var289 - var369;
                  int var200 = Math.max(var199, var290);
                  float var201 = var200;
                  float var82 = var81 / var201;
                  int var202 = e.BTN_H;
                  byte var291 = (byte)(1943103497 ^ var624);
                  int var203 = var202 / var291;
                  int var84 = var73 + var203;
                  byte var370 = (byte)(1943103496 ^ var624);
                  int var293 = var84 - var370;
                  int var372 = var75 + var77;
                  byte var508 = (byte)(1943103496 ^ var624);
                  int var442 = var84 + var508;
                  int var509 = -1929684941 ^ var624;
                  var1.fill(var75, var293, var372, var442, var509);
                  byte var373 = (byte)(1943103496 ^ var624);
                  int var295 = var84 - var373;
                  byte var443 = (byte)(1943103503 ^ var624);
                  float var511 = var77;
                  float var512 = var511 * var82;
                  int var513 = Math.round(var512);
                  int var444 = Math.max(var443, var513);
                  int var375 = var75 + var444;
                  byte var514 = (byte)(1943103496 ^ var624);
                  int var446 = var84 + var514;
                  int var515 = -1935492876 ^ var624;
                  var1.fill(var75, var295, var375, var446, var515);
                  byte var376 = (byte)(1943103498 ^ var624);
                  int var297 = var77 - var376;
                  float var298 = var297;
                  float var207 = var82 * var298;
                  int var208 = Math.round(var207);
                  int var88 = var75 + var208;
                  byte var299 = (byte)(1943103496 ^ var624);
                  int var210 = var88 - var299;
                  byte var377 = (byte)(1943103501 ^ var624);
                  int var301 = var84 - var377;
                  byte var447 = (byte)(1943103496 ^ var624);
                  int var379 = var88 + var447;
                  byte var516 = (byte)(1943103501 ^ var624);
                  int var449 = var84 + var516;
                  byte var517 = (byte)(-1943103500 ^ var624);
                  var1.fill(var210, var301, var379, var449, var517);
                  int var211 = e.SETTING_H;
                  return var4 + var211;
               }

               label122:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var624)) {
                     case 60516681:
                        var624 ^= 1910633695;
                        break label122;
                     case 227197425:
                        break;
                     case 1131467060:
                        break label122;
                     case 2051080591:
                     default:
                        throw new IllegalStateException();
                  }
               }

               byte var93 = (byte)((var6 instanceof com.wimpyclient.j.c) ? 1 : 0);
               if (var93 != (2080330300 ^ var624)) {
                  var624 = 407507942 ^ var624;
                  com.wimpyclient.j.c var132 = (com.wimpyclient.j.c)var6;
                  float var241 = var9;
                  float var319 = var10;
                  int var573 = e.SETTING_H;
                  String var598 = var6.description();
                  this.noteHover(var241, var319, var3, var4, var5, var573, var11, var12, var598);
                  String var135 = var132.display();
                  String var321 = var6.name();
                  byte var471 = (byte)(1672823262 ^ var624);
                  int var403 = var3 + var471;
                  byte var536 = (byte)(1672823262 ^ var624);
                  int var473 = var4 + var536;
                  int var537 = -1673862808 ^ var624;
                  byte var574 = (byte)(1672823258 ^ var624);
                  var1.drawString(var2, var321, var403, var473, var537, (var574 != 0));
                  int var405 = var3 + var5;
                  byte var475 = (byte)(1672823262 ^ var624);
                  int var406 = var405 - var475;
                  int var477 = var2.width(var135);
                  int var407 = var406 - var477;
                  byte var539 = (byte)(1672823262 ^ var624);
                  int var479 = var4 + var539;
                  int var540 = -1664708315 ^ var624;
                  byte var575 = (byte)(1672823258 ^ var624);
                  var1.drawString(var2, var135, var407, var479, var540, (var575 != 0));
                  int var244 = e.LABEL_GAP;
                  int var139 = var4 + var244;
                  byte var245 = (byte)(1672823256 ^ var624);
                  int var141 = var3 + var245;
                  byte var142 = (byte)(1672823250 ^ var624);
                  byte var323 = (byte)(1672823262 ^ var624);
                  int var247 = var5 - var323;
                  int var143 = Math.max(var142, var247);
                  double var144 = 1.0E-9;
                  double var325 = var132.max();
                  double var481 = var132.min();
                  double var327 = var325 - var481;
                  double var146 = Math.max(var144, var327);
                  float var148 = (float)var146;
                  double var150 = var132.get();
                  double var330 = var132.min();
                  double var152 = var150 - var330;
                  double var333 = var148;
                  double var154 = var152 / var333;
                  float var156 = (float)var154;
                  int var248 = e.BTN_H;
                  byte var335 = (byte)(1672823256 ^ var624);
                  int var249 = var248 / var335;
                  int var158 = var139 + var249;
                  byte var408 = (byte)(1672823257 ^ var624);
                  int var337 = var158 - var408;
                  int var410 = var141 + var143;
                  byte var541 = (byte)(1672823257 ^ var624);
                  int var485 = var158 + var541;
                  int var542 = -1667272222 ^ var624;
                  var1.fill(var141, var337, var410, var485, var542);
                  byte var411 = (byte)(1672823257 ^ var624);
                  int var339 = var158 - var411;
                  byte var486 = (byte)(1672823262 ^ var624);
                  float var544 = var143;
                  float var545 = var544 * var156;
                  int var546 = Math.round(var545);
                  int var487 = Math.max(var486, var546);
                  int var413 = var141 + var487;
                  byte var547 = (byte)(1672823257 ^ var624);
                  int var489 = var158 + var547;
                  int var548 = -1664708315 ^ var624;
                  var1.fill(var141, var339, var413, var489, var548);
                  byte var414 = (byte)(1672823259 ^ var624);
                  int var341 = var143 - var414;
                  float var342 = var341;
                  float var253 = var156 * var342;
                  int var254 = Math.round(var253);
                  int var162 = var141 + var254;
                  byte var343 = (byte)(1672823257 ^ var624);
                  int var256 = var162 - var343;
                  byte var415 = (byte)(1672823260 ^ var624);
                  int var345 = var158 - var415;
                  byte var490 = (byte)(1672823257 ^ var624);
                  int var417 = var162 + var490;
                  byte var549 = (byte)(1672823260 ^ var624);
                  int var492 = var158 + var549;
                  byte var550 = (byte)(-1672823259 ^ var624);
                  var1.fill(var256, var345, var417, var492, var550);
                  int var257 = e.SETTING_H;
                  return var4 + var257;
               }

               var624 = tmbnfwxztnsvmyha(var624, 154202681);
               byte var95 = (byte)((var6 instanceof com.wimpyclient.j.g) ? 1 : 0);
               if (var95 == (1926209541 ^ var624)) {
                  var624 = 1592561557 ^ var624;
                  byte var97 = (byte)((var6 instanceof com.wimpyclient.j.e) ? 1 : 0);
                  if (var97 != (740503440 ^ var624)) {
                     var624 = 1271227113 ^ var624;
                     com.wimpyclient.j.e var99 = (com.wimpyclient.j.e)var6;
                     float var213 = var9;
                     float var303 = var10;
                     int var560 = e.SETTING_H;
                     String var594 = var6.description();
                     this.noteHover(var213, var303, var3, var4, var5, var560, var11, var12, var594);
                     String var305 = var6.name();
                     byte var451 = (byte)(1743146365 ^ var624);
                     int var382 = var3 + var451;
                     byte var519 = (byte)(1743146365 ^ var624);
                     int var453 = var4 + var519;
                     int var520 = -1737888309 ^ var624;
                     byte var561 = (byte)(1743146361 ^ var624);
                     var1.drawString(var2, var305, var382, var453, var520, (var561 != 0));
                     int var215 = e.LABEL_GAP;
                     int var103 = var4 + var215;
                     byte var306 = (byte)(1743146363 ^ var624);
                     int var217 = var3 + var306;
                     byte var454 = (byte)(1743146363 ^ var624);
                     int var384 = var5 - var454;
                     int var455 = e.BTN_H;
                     int var521 = e.BTN_H;
                     byte var562 = (byte)(1743146363 ^ var624);
                     int var522 = var521 / var562;
                     int var563 = -1729601695 ^ var624;
                     d.fillRound(var1, var217, var103, var384, var455, var522, var563);
                     String var106 = var99.get();
                     int var524 = var2.width(var106);
                     int var457 = var5 - var524;
                     byte var525 = (byte)(1743146363 ^ var624);
                     int var458 = var457 / var525;
                     int var386 = var3 + var458;
                     int var526 = e.BTN_H;
                     int var460 = d.textY(var103, var526, var2);
                     int var527 = -1735025274 ^ var624;
                     byte var566 = (byte)(1743146361 ^ var624);
                     var1.drawString(var2, var106, var386, var460, var527, (var566 != 0));
                     int var219 = e.SETTING_H;
                     return var4 + var219;
                  }

                  var624 = 513465857 ^ var624;
                  int var220 = e.ROW_H;
                  return var4 + var220;
               }

               var624 = 1230937610 ^ var624;
               com.wimpyclient.j.g var113 = (com.wimpyclient.j.g)var6;
               float var222 = var9;
               float var310 = var10;
               int var567 = e.SETTING_H;
               String var596 = var6.description();
               this.noteHover(var222, var310, var3, var4, var5, var567, var11, var12, var596);
               String var312 = var6.name();
               byte var462 = (byte)(999374347 ^ var624);
               int var389 = var3 + var462;
               byte var529 = (byte)(999374347 ^ var624);
               int var464 = var4 + var529;
               int var530 = -1004626243 ^ var624;
               byte var568 = (byte)(999374351 ^ var624);
               var1.drawString(var2, var312, var389, var464, var530, (var568 != 0));
               int var224 = e.LABEL_GAP;
               var117 = var4 + var224;
               byte var130;
               if (var7 == var113) {
                  var624 = 939851270 ^ var624;
                  var130 = (byte)(60145672 ^ var624);
                  var624 = 1003030438 ^ var624;
               } else {
                  var624 = tmbnfwxztnsvmyha(var624, 693396948);
                  var130 = (byte)(314923995 ^ var624);
                  var624 = 714710132 ^ var624;
               }

               byte var313 = (byte)(945604525 ^ var624);
               int var227 = var3 + var313;
               byte var465 = (byte)(945604525 ^ var624);
               int var391 = var5 - var465;
               int var466 = e.BTN_H;
               int var531 = e.BTN_H;
               byte var569 = (byte)(945604525 ^ var624);
               int var532 = var531 / var569;
               int var577;
               if (var130 != (945604527 ^ var624)) {
                  var624 = 700970537 ^ var624;
                  var577 = -290389570 ^ var624;
                  var624 = 316880143 ^ var624;
               } else {
                  var624 = 895081313 ^ var624;
                  var577 = -234156330 ^ var624;
                  var624 = 243079239 ^ var624;
               }

               d.fillRound(var1, var227, var117, var391, var466, var532, var577);
               String var121 = var113.get();
               String var614 = var121;
               if (var130 != (58197129 ^ var624)) {
                  var624 = 1344621281 ^ var624;
                  long var228 = System.nanoTime();
                  long var392 = 400000000L;
                  long var230 = var228 / var392;
                  long var394 = 2L;
                  long var232 = var230 % var394;
                  long var396 = 0L;
                  long var651;
                  int var234 = (var651 = var232 - var396) == 0L ? 0 : (var651 < 0L ? -1 : 1);
                  String var259;
                  if (var234 != (1398623848 ^ var624)) {
                     var624 = 1804881910 ^ var624;
                     var259 = nncilsnhig(goobfefhzuidmyi(), wdhqinctnounira(), var624);
                     var624 = 727052133 ^ var624;
                  } else {
                     var624 = 122853799 ^ var624;
                     var259 = nncilsnhig(gthkvrpxbnzgxxa(), wdhqinctnounira(), var624);

                     label101:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var624)) {
                           case 48162350:
                              var624 ^= 1200830772;
                           case 933437394:
                              break label101;
                           case 1290122856:
                              break;
                           case 1567148784:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }

                  String var124 = var121 + var259;
                  var614 = var124;
                  var624 = 1632044397 ^ var624;
               } else {
                  label110:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var624)) {
                        case 54560568:
                           var624 ^= 1906568991;
                        case 206989610:
                           break label110;
                        case 887932792:
                           break;
                        case 1621154261:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               }

               byte var236 = (byte)((var614.isEmpty()) ? 1 : 0);
               if (var236 != (1927015318 ^ var624)) {
                  var624 = 1738494435 ^ var624;
                  if (var130 == (356825717 ^ var624)) {
                     var624 = 994079264 ^ var624;
                     var258 = nncilsnhig(bzqqxjvmkaqmbbl(), wdhqinctnounira(), var624);

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var624)) {
                           case 153709088:
                              var624 ^= 1549652075;
                              break label161;
                           case 501683017:
                           default:
                              throw new IllegalStateException();
                           case 740736490:
                              break;
                           case 1269196223:
                              break label161;
                        }
                     }
                  }

                  label88:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var624)) {
                        case 80274971:
                           break;
                        case 154483718:
                           var624 ^= 757244208;
                           break label88;
                        case 1792179081:
                        default:
                           throw new IllegalStateException();
                        case 1850450355:
                           break label88;
                     }
                  }
               } else {
                  var624 = 1253961939 ^ var624;
               }

               var258 = var614;
               var624 = 1245643643 ^ var624;
            }
         }

         byte var398 = (byte)(1918441524 ^ var624);
         int var316 = var5 - var398;
         String var126 = d.ellipsize(var2, var258, var316);
         byte var467 = (byte)(1918441528 ^ var624);
         int var400 = var3 + var467;
         int var533 = e.BTN_H;
         int var469 = d.textY(var117, var533, var2);
         int var534 = -1918112060 ^ var624;
         byte var572 = (byte)(1918441534 ^ var624);
         var1.drawString(var2, var126, var400, var469, var534, (var572 != 0));
         int var239 = e.SETTING_H;
         return var4 + var239;
      }
   }

   private static int drawColorPickerExtract(GuiGraphics var0, int var1, int var2, int var3, com.wimpyclient.j.b var4, b$a var5) {
      int var215 = 1772772709 ^ 32963714 ^ 416124095;
      var215 = 1149270494 ^ var215;
      int var6 = e.WHEEL_R;
      int var13 = var6;
      byte var25 = (byte)(873550980 ^ var215);
      int var7 = e.WHEEL_STEP;
      int var26 = Math.max(var25, var7);
      int var14 = var26;
      byte var8 = (byte)(873550980 ^ var215);
      int var99 = var3 / var8;
      int var28 = var1 + var99;
      int var15 = var28;
      int var30 = var2 + var6;
      byte var101 = (byte)(873550980 ^ var215);
      int var31 = var30 + var101;
      int var16 = var31;
      int var33 = var6 * var6;
      int var17 = var33;
      int var35 = -var6;
      int var18 = var35;
      var215 = 580932684 ^ var215;

      while (true) {
         if (var18 <= var13) {
            var215 = 1348127079 ^ var215;
            int var38 = -var13;
            int var19 = var38;
            var215 = 824078933 ^ var215;

            while (var19 <= var13) {
               var215 = 92771336 ^ var215;
               int var43 = var19 * var19;
               int var108 = var18 * var18;
               int var44 = var43 + var108;
               if (var44 > var17) {
                  var215 = 680863990 ^ var215;
                  var215 = 1734263228 ^ var215;
               } else {
                  label57:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                        case 230510227:
                           var215 ^= 1838801663;
                           break label57;
                        case 369720655:
                        default:
                           throw new RuntimeException();
                        case 382330995:
                           break label57;
                        case 965589468:
                     }
                  }

                  double var49 = var44;
                  double var51 = Math.sqrt(var49);
                  float var53 = (float)var51;
                  float var112 = var13;
                  float var54 = var53 / var112;
                  double var56 = var18;
                  double var147 = var19;
                  double var58 = Math.atan2(var56, var147);
                  double var149 = Math.PI * 2;
                  double var60 = var58 / var149;
                  double var151 = 0.5;
                  double var62 = var60 + var151;
                  float var64 = (float)var62;
                  float var153 = 1.0F;
                  int var66 = com.wimpyclient.j.b.hsvToRgb(var64, var54, var153);
                  int var115 = var15 + var19;
                  int var156 = var16 + var18;
                  int var171 = var15 + var19;
                  int var172 = var171 + var14;
                  int var181 = var16 + var18;
                  int var182 = var181 + var14;
                  int var192 = -521417457 ^ var215;
                  int var193 = var192 | var66;
                  var0.fill(var115, var156, var172, var182, var193);
                  var215 = 575802293 ^ var215;
               }

               int var47 = var19 + var14;
               var19 = var47;
               var215 = 1246526786 ^ var215;
            }

            label47:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                  case 141323205:
                     var215 ^= 1405604643;
                     break label47;
                  case 1197020993:
                  default:
                     throw new RuntimeException();
                  case 1439553092:
                     break label47;
                  case 1583424287:
               }
            }
         } else {
            label69:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                  case 200730422:
                     var215 ^= 864326237;
                     break label69;
                  case 1397311186:
                  default:
                     throw new RuntimeException();
                  case 1518003256:
                     break;
                  case 2138938079:
                     break label69;
               }
            }

            int var116 = e.COLOR_PICKER_H;
            int var69 = var2 + var116;
            int var117 = e.FIELD_H;
            int var70 = var69 - var117;
            int var206 = var70;
            byte var71 = (byte)(624267921 ^ var215);
            int var118 = e.FIELD_H;
            byte var157 = (byte)(624267923 ^ var215);
            int var119 = var118 - var157;
            int var72 = Math.max(var71, var119);
            int var207 = var72;
            byte var73 = (byte)(624267935 ^ var215);
            byte var158 = (byte)(624267925 ^ var215);
            int var121 = var3 / var158;
            int var74 = Math.max(var73, var121);
            int var208 = var74;
            byte var75 = (byte)(624267927 ^ var215);
            int var209 = var75;
            var215 = 515074164 ^ var215;

            while (var209 < var208) {
               var215 = 538738811 ^ var215;
               byte var135 = (byte)(463108761 ^ var215);
               float var97;
               if (var208 <= var135) {
                  var215 = 102927783 ^ var215;
                  var97 = 1.0F;
                  var215 = tmbnfwxztnsvmyha(var215, 943522082);
               } else {
                  var215 = tmbnfwxztnsvmyha(var215, 77379430);
                  float var90 = var209;
                  byte var165 = (byte)(520539647 ^ var215);
                  int var137 = var208 - var165;
                  float var138 = var137;
                  var97 = var90 / var138;
                  var215 = 981679075 ^ var215;
               }

               float var92 = var4.hue();
               float var140 = var4.saturation();
               int var93 = com.wimpyclient.j.b.hsvToRgb(var92, var140, var97);
               int var142 = var209 * var3;
               int var143 = var142 / var208;
               int var95 = var1 + var143;
               byte var187 = (byte)(629536284 ^ var215);
               int var198 = var3 / var208;
               byte var204 = (byte)(629536284 ^ var215);
               int var199 = var198 + var204;
               int var188 = Math.max(var187, var199);
               int var178 = var95 + var188;
               int var190 = var206 + var207;
               int var201 = -628754915 ^ var215;
               int var202 = var201 | var93;
               var0.fill(var95, var206, var178, var190, var202);
               var209 += 629536284 ^ var215;
               var215 = 503516414 ^ var215;
            }

            var215 = 1426172774 ^ var215;
            float var124 = var4.value();
            byte var173 = (byte)(1854361988 ^ var215);
            int var160 = var3 - var173;
            float var161 = var160;
            float var125 = var124 * var161;
            int var126 = Math.round(var125);
            int var78 = var1 + var126;
            byte var162 = (byte)(1854361991 ^ var215);
            int var128 = var78 - var162;
            byte var174 = (byte)(1854361988 ^ var215);
            int var164 = var206 - var174;
            byte var183 = (byte)(1854361991 ^ var215);
            int var176 = var78 + var183;
            int var185 = var206 + var207;
            byte var195 = (byte)(1854361988 ^ var215);
            int var186 = var185 + var195;
            byte var196 = (byte)(-1854361990 ^ var215);
            var0.fill(var128, var164, var176, var186, var196);
            if (var5 != null) {
               var215 = 1112254200 ^ var215;
               var5.wheelCx = var15;
               var5.wheelCy = var16;
               var5.sliderX = var1;
               var5.sliderY = var206;
               var5.sliderW = var3;
               var215 = 1237933129 ^ var215;
            } else {
               var215 = tmbnfwxztnsvmyha(var215, 193133233);
            }

            int var134 = e.COLOR_PICKER_H;
            return var2 + var134;
         }

         int var41 = var18 + var14;
         var18 = var41;
         var215 = tmbnfwxztnsvmyha(var215, 847472657);
      }
   }

   void render(com.wimpyclient.m.b var1, float var2, float var3, v var4, v var5, com.wimpyclient.j.g var6, b$a var7, String var8) {
      int var476 = 829064759 ^ 1616800816 ^ 504965528;
      var476 = 1769012909 ^ var476;
      String var10 = nncilsnhig(jjcicgaqitwcimo(), wdhqinctnounira(), var476);
      this.hoverTip = var10;
      com.wimpyclient.l.a var52 = this.enterAnim;
      float var53 = var52.eased();
      float var188 = 0.01F;
      float var508;
      int var55 = (var508 = var53 - var188) == 0.0F ? 0 : (var508 < 0.0F ? -1 : 1);
      if (var55 < (643644722 ^ var476)) {
         var476 = 1677789566 ^ var476;
      } else {
         var476 = 1712182259 ^ var476;
         com.wimpyclient.o.b var56 = com.wimpyclient.o.b.INSTANCE;
         com.wimpyclient.o.b var23 = var56;
         int var57 = e.RADIUS;
         float var58 = var57;
         float var59 = 1.0F;
         float var60 = var59 - var53;
         float var190 = 18.0F;
         float var61 = var60 * var190;
         var1.save();
         var1.alpha(var53);
         float var192 = 0.0F;
         var1.translate(var192, var61);
         int var194 = this.x;
         float var195 = var194;
         int var286 = this.y;
         float var287 = var286;
         int var353 = this.w;
         float var354 = var353;
         int var403 = this.h;
         float var404 = var403;
         com.wimpyclient.k.e.glassPanel(var1, var195, var287, var354, var404, var58);
         float var66 = 1.2F;
         int var197 = this.x;
         float var198 = var197;
         float var199 = var198 + var66;
         int var290 = this.y;
         float var291 = var290;
         float var292 = var291 + var66;
         int var357 = this.w;
         float var358 = var357;
         float var440 = 2.0F;
         float var406 = var66 * var440;
         float var359 = var358 - var406;
         int var407 = e.HEADER_H;
         float var408 = var407;
         float var409 = var408 - var66;
         float var442 = 1.0F;
         float var459 = var58 - var66;
         float var443 = Math.max(var442, var459);
         int var461 = var56.headerTop();
         int var470 = var56.headerBottom();
         byte var17 = (byte)(1079045824 ^ var476);
         var1.rectGradient(var199, var292, var359, var409, var443, var461, var470, (var17 != 0));
         int var201 = this.x;
         float var202 = var201;
         float var203 = var202 + var66;
         int var295 = this.y;
         int var360 = e.HEADER_H;
         int var296 = var295 + var360;
         byte var361 = (byte)(1079045824 ^ var476);
         int var297 = var296 - var361;
         float var298 = var297;
         int var363 = this.w;
         float var364 = var363;
         float var444 = 2.0F;
         float var411 = var66 * var444;
         float var365 = var364 - var411;
         float var412 = 1.0F;
         float var445 = 0.0F;
         int var463 = var56.headerLine();
         var1.rect(var203, var298, var365, var412, var445, var463);
         float var69 = e.bodyFont();
         float var27 = var69;
         float var70 = e.titleFont();
         int var71 = e.ICON;
         float var72 = var71;
         int var205 = this.x;
         int var299 = e.PAD;
         int var206 = var205 + var299;
         float var207 = var206;
         int var301 = this.y;
         float var302 = var301;
         int var366 = e.HEADER_H;
         float var367 = var366;
         float var368 = var367 - var72;
         float var414 = 2.0F;
         float var369 = var368 / var414;
         float var303 = var302 + var369;
         drawCategoryIcon(var1, var207, var303, var72);
         int var209 = this.x;
         float var210 = var209;
         int var305 = this.w;
         float var306 = var305;
         float var371 = 2.0F;
         float var307 = var306 / var371;
         float var211 = var210 + var307;
         int var309 = this.y;
         float var310 = var309;
         int var372 = e.HEADER_H;
         float var373 = var372;
         float var415 = 2.0F;
         float var374 = var373 / var415;
         float var311 = var310 + var374;
         int var417 = var56.accent();
         w var447 = this.category;
         Component var448 = var447.displayName();
         String var449 = var448.getString();
         var1.textCentered(var211, var311, var70, var417, var449);
         com.wimpyclient.l.a var76 = this.expandAnim;
         float var77 = var76.eased();
         float var212 = 0.5F;
         float var509;
         int var79 = (var509 = var77 - var212) == 0.0F ? 0 : (var509 < 0.0F ? -1 : 1);
         String var186;
         if (var79 > (1079045825 ^ var476)) {
            var476 = 1865797842 ^ var476;
            var186 = nncilsnhig(yocdyrdtlxaelnk(), wdhqinctnounira(), var476);

            label183:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var476)) {
                  case 198444833:
                     var476 ^= 1454074233;
                     break label183;
                  case 370317964:
                     break;
                  case 1209806210:
                     break label183;
                  case 1937420350:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         } else {
            var476 = tmbnfwxztnsvmyha(var476, 430191545);
            var186 = nncilsnhig(nyxodfbtqffasxd(), wdhqinctnounira(), var476);
            var476 = 540707346 ^ var476;
         }

         int var214 = this.x;
         int var313 = this.w;
         int var215 = var214 + var313;
         int var314 = e.PAD;
         int var216 = var215 - var314;
         byte var315 = (byte)(2043565920 ^ var476);
         int var217 = var216 - var315;
         float var218 = var217;
         int var317 = this.y;
         float var318 = var317;
         int var376 = e.HEADER_H;
         float var377 = var376;
         float var418 = 2.0F;
         float var378 = var377 / var418;
         float var319 = var318 + var378;
         int var420 = var56.textMuted();
         float var81 = var1.text(var218, var319, var69, var420, var186);
         com.wimpyclient.l.a var83 = this.expandAnim;
         float var84 = var83.get();
         float var219 = 0.02F;
         float var510;
         int var85 = (var510 = var84 - var219) == 0.0F ? 0 : (var510 < 0.0F ? -1 : 1);
         if (var85 < (2043565930 ^ var476)) {
            var476 = 2060607528 ^ var476;
            var1.restore();
         } else {
            label175:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var476)) {
                  case 201306259:
                     var476 ^= 678695804;
                  case 314198390:
                     break label175;
                  case 646485665:
                     break;
                  case 902902346:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }

            int var87 = this.x;
            int var220 = e.PAD;
            int var88 = var87 + var220;
            int var32 = var88;
            int var90 = this.contentWidth();
            int var33 = var90;
            int var92 = this.contentTop();
            int var34 = var92;
            int var94 = this.contentBottom();
            int var35 = var94;
            var1.save();
            int var222 = this.x;
            byte var320 = (byte)(1371161623 ^ var476);
            int var223 = var222 + var320;
            float var224 = var223;
            float var322 = var92;
            int var381 = this.w;
            byte var421 = (byte)(1371161620 ^ var476);
            int var382 = var381 - var421;
            float var383 = var382;
            byte var422 = (byte)(1371161622 ^ var476);
            int var452 = var94 - var92;
            int var423 = Math.max(var422, var452);
            float var424 = var423;
            var1.scissor(var224, var322, var383, var424);
            int var226 = this.scroll;
            int var98 = var92 - var226;
            int var36 = var98;
            com.wimpyclient.l.a var100 = this.settingsAnim;
            float var101 = var100.eased();
            float var37 = var101;
            List var103 = this.modules(var8);
            Iterator var104 = var103.iterator();
            Iterator var38 = var104;
            var476 = 1153676411 ^ var476;

            label168:
            while (true) {
               byte var106 = (byte)((var38.hasNext()) ? 1 : 0);
               if (var106 == (360312941 ^ var476)) {
                  var476 = 1112016101 ^ var476;
                  var1.restore();
                  var1.restore();
                  return;
               }

               var476 = 1012289474 ^ var476;
               Object var108 = var38.next();
               v var109 = (v)var108;
               byte var187;
               if (var109 == var4) {
                  var476 = 295197160 ^ var476;
                  var187 = (byte)(951576134 ^ var476);
                  var476 = 1945530175 ^ var476;
               } else {
                  var476 = 1332677555 ^ var476;
                  var187 = (byte)(1715516444 ^ var476);
                  var476 = 755055972 ^ var476;
               }

               byte var112;
               byte var125;
               label165: {
                  var112 = (byte)((var109.qo()) ? 1 : 0);
                  int var230 = this.x;
                  float var231 = var230;
                  float var511;
                  int var114 = (var511 = var2 - var231) == 0.0F ? 0 : (var511 < 0.0F ? -1 : 1);
                  if (var114 >= (1262586232 ^ var476)) {
                     var476 = 890740137 ^ var476;
                     int var233 = this.x;
                     int var324 = this.w;
                     int var234 = var233 + var324;
                     float var235 = var234;
                     float var512;
                     int var116 = (var512 = var2 - var235) == 0.0F ? 0 : (var512 < 0.0F ? -1 : 1);
                     if (var116 < (2119570641 ^ var476)) {
                        var476 = 161310012 ^ var476;
                        float var237 = var36;
                        float var513;
                        int var118 = (var513 = var3 - var237) == 0.0F ? 0 : (var513 < 0.0F ? -1 : 1);
                        if (var118 >= (2009821677 ^ var476)) {
                           var476 = 1705161683 ^ var476;
                           int var325 = e.ROW_H;
                           int var239 = var36 + var325;
                           float var240 = var239;
                           float var514;
                           int var120 = (var514 = var3 - var240) == 0.0F ? 0 : (var514 < 0.0F ? -1 : 1);
                           if (var120 < (308920894 ^ var476)) {
                              var476 = 80400262 ^ var476;
                              float var242 = var34;
                              float var515;
                              int var122 = (var515 = var3 - var242) == 0.0F ? 0 : (var515 < 0.0F ? -1 : 1);
                              if (var122 >= (379784632 ^ var476)) {
                                 var476 = 661860675 ^ var476;
                                 float var244 = var35;
                                 float var516;
                                 int var124 = (var516 = var3 - var244) == 0.0F ? 0 : (var516 < 0.0F ? -1 : 1);
                                 if (var124 < (835730683 ^ var476)) {
                                    var476 = 1494722072 ^ var476;
                                    var125 = (byte)(1757911778 ^ var476);
                                    var476 = tmbnfwxztnsvmyha(var476, 1162680044);
                                    break label165;
                                 }

                                 var476 = tmbnfwxztnsvmyha(var476, 850246389);
                              } else {
                                 var476 = tmbnfwxztnsvmyha(var476, 366906294);
                              }
                           } else {
                              label160:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var476)) {
                                    case 61667889:
                                       var476 ^= 286540848;
                                       break label160;
                                    case 1203712423:
                                       break;
                                    case 1778450056:
                                    default:
                                       throw new RuntimeException(new IOException());
                                    case 1972018869:
                                       break label160;
                                 }
                              }
                           }
                        } else {
                           var476 = 1958148067 ^ var476;
                        }
                     } else {
                        var476 = tmbnfwxztnsvmyha(var476, 2100007647);
                     }
                  } else {
                     var476 = tmbnfwxztnsvmyha(var476, 1211895670);
                  }

                  var125 = (byte)(58557966 ^ var476);
                  var476 = 787941889 ^ var476;
               }

               com.wimpyclient.l.a var129;
               float var284;
               label149: {
                  Map var127 = this.hoverAnims;
                  Function var326 = var0 -> {
                     int var5x = 1519771859 ^ 1426930429 ^ 416124095;
                     var5x = 1367682980 ^ var5x;
                     float var2x = 16.0F;
                     return new com.wimpyclient.l.a(var2x);
                  };
                  Object var128 = var127.computeIfAbsent(var109, var326);
                  var129 = (com.wimpyclient.l.a)var128;
                  if (var125 == (764054543 ^ var476)) {
                     var476 = 775882193 ^ var476;
                     if (var187 == (62228958 ^ var476)) {
                        var476 = 434070441 ^ var476;
                        var284 = 0.0F;
                        var476 = 263343720 ^ var476;
                        break label149;
                     }

                     var476 = 834397046 ^ var476;
                  } else {
                     label147:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var476)) {
                           case 99880060:
                              break label147;
                           case 138166999:
                              var476 ^= 528803495;
                              break label147;
                           case 293980850:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1643125341:
                        }
                     }
                  }

                  var284 = 1.0F;
                  var476 = 668389047 ^ var476;
               }

               var129.setTarget(var284);
               float var132 = var129.update();
               float var134 = var129.eased();
               Map var136 = this.enableAnims;
               Function var328 = var1x -> {
                  int var11 = 610459936 ^ 192682992 ^ 416124095;
                  var11 = 527356424 ^ var11;
                  float var3x = 14.0F;
                  com.wimpyclient.l.a var2x = new com.wimpyclient.l.a(var3x);
                  float var8x;
                  if (var112 != (683517031 ^ var11)) {
                     var11 = 2122254012 ^ var11;
                     var8x = 1.0F;
                     var11 = 476693658 ^ var11;
                  } else {
                     var11 = tmbnfwxztnsvmyha(var11, 901820225);
                     var8x = 0.0F;
                     var11 = 1473670503 ^ var11;
                  }

                  var2x.snap(var8x);
                  return var2x;
               };
               Object var137 = var136.computeIfAbsent(var109, var328);
               com.wimpyclient.l.a var138 = (com.wimpyclient.l.a)var137;
               float var283;
               if (var112 != (366519327 ^ var476)) {
                  var476 = 830750903 ^ var476;
                  var283 = 1.0F;

                  label135:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var476)) {
                        case 108257113:
                           var476 ^= 1776596513;
                           break label135;
                        case 869451272:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1175918926:
                           break;
                        case 1920437899:
                           break label135;
                     }
                  }
               } else {
                  label128:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var476)) {
                        case 166126019:
                           break label128;
                        case 173254692:
                           var476 ^= 869334018;
                           break label128;
                        case 369457794:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1602259719:
                     }
                  }

                  var283 = 0.0F;
                  var476 = 1806699156 ^ var476;
               }

               float var143;
               label197: {
                  var138.setTarget(var283);
                  float var141 = var138.update();
                  var143 = var138.eased();
                  float var250 = 0.01F;
                  float var517;
                  int var145 = (var517 = var134 - var250) == 0.0F ? 0 : (var517 < 0.0F ? -1 : 1);
                  if (var145 <= (1303925385 ^ var476)) {
                     var476 = 1523472140 ^ var476;
                     if (var187 == (393610629 ^ var476)) {
                        var476 = 1347687828 ^ var476;
                        break label197;
                     }

                     var476 = 1848625082 ^ var476;
                  } else {
                     var476 = 887197878 ^ var476;
                  }

                  int var150;
                  if (var187 != (2035925567 ^ var476)) {
                     var476 = 41972767 ^ var476;
                     int var182 = var23.moduleActiveFill();
                     float var281 = 0.55F;
                     float var351 = 0.45F;
                     float var352 = var351 * var134;
                     float var282 = var281 + var352;
                     var150 = com.wimpyclient.p.g.withAlpha(var182, var282);
                     var476 = 209446648 ^ var476;
                  } else {
                     label113:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var476)) {
                           case 186487043:
                              var476 ^= 1563623544;
                              break label113;
                           case 1315716768:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1547273414:
                              break label113;
                           case 1940777952:
                        }
                     }

                     int var149 = var23.rowHover();
                     var150 = com.wimpyclient.p.g.withAlpha(var149, var134);
                     var476 = 1405653663 ^ var476;
                  }

                  int var253 = this.x;
                  byte var329 = (byte)(2007126234 ^ var476);
                  int var254 = var253 + var329;
                  float var255 = var254;
                  float var331 = var36;
                  int var385 = this.w;
                  byte var425 = (byte)(2007126236 ^ var476);
                  int var386 = var385 - var425;
                  float var387 = var386;
                  int var426 = e.ROW_H;
                  float var427 = var426;
                  float var453 = 4.0F;
                  var1.rect(var255, var331, var387, var427, var453, var150);
                  var476 = 813711561 ^ var476;
               }

               float var256 = 0.01F;
               float var518;
               int var153 = (var518 = var143 - var256) == 0.0F ? 0 : (var518 < 0.0F ? -1 : 1);
               if (var153 > (1193414673 ^ var476)) {
                  var476 = 641879886 ^ var476;
                  int var258 = this.x;
                  byte var332 = (byte)(1633705821 ^ var476);
                  int var259 = var258 + var332;
                  float var260 = var259;
                  byte var388 = (byte)(1633705819 ^ var476);
                  int var334 = var36 + var388;
                  float var335 = var334;
                  float var389 = 2.0F;
                  int var428 = e.ROW_H;
                  byte var454 = (byte)(1633705815 ^ var476);
                  int var429 = var428 - var454;
                  float var430 = var429;
                  float var431 = var430 * var143;
                  float var456 = 1.0F;
                  int var467 = var23.accent();
                  var1.rect(var260, var335, var389, var431, var456, var467);
                  var476 = 495457201 ^ var476;
               } else {
                  var476 = 1003117823 ^ var476;
               }

               Component var337 = var109.displayName();
               String var338 = var337.getString();
               int var432 = e.TOGGLE_W;
               int var391 = var33 - var432;
               byte var433 = (byte)(2095598818 ^ var476);
               int var392 = var391 - var433;
               float var393 = var392;
               String var156 = var1.ellipsize(var27, var338, var393);
               byte var339 = (byte)(2095598824 ^ var476);
               int var263 = var32 + var339;
               float var264 = var263;
               float var341 = var36;
               int var394 = e.ROW_H;
               float var395 = var394;
               float var434 = 2.0F;
               float var396 = var395 / var434;
               float var342 = var341 + var396;
               int var436 = var23.textPrimary();
               float var158 = var1.text(var264, var342, var27, var436, var156);
               int var266 = e.toggleX(var32, var33);
               int var345 = e.toggleY(var36);
               drawToggle(var1, var266, var345, var143);
               int var267 = e.ROW_H;
               int var161 = var36 + var267;
               var36 = var161;
               if (var187 != (2095598830 ^ var476)) {
                  var476 = 119554440 ^ var476;
                  float var268 = 0.01F;
                  float var519;
                  int var164 = (var519 = var37 - var268) == 0.0F ? 0 : (var519 < 0.0F ? -1 : 1);
                  if (var164 > (2076708198 ^ var476)) {
                     var476 = 835504011 ^ var476;
                     int var166 = settingsHeight(var109);
                     byte var167 = (byte)(1241828077 ^ var476);
                     float var270 = var166;
                     float var271 = var270 * var37;
                     int var272 = Math.round(var271);
                     int var168 = Math.max(var167, var272);
                     var1.save();
                     float var274 = var32;
                     float var348 = var161;
                     float var400 = var33;
                     float var438 = var168;
                     var1.scissor(var274, var348, var400, var438);
                     var1.alpha(var37);
                     float var172 = 1.0F;
                     float var173 = var172 - var37;
                     float var277 = 10.0F;
                     float var174 = var173 * var277;
                     float var278 = 0.0F;
                     var1.translate(var278, var174);
                     int var177 = this.renderSettings(var1, var32, var161, var33, var109, var5, var6, var7, var2, var3, var34, var35);
                     var1.restore();
                     int var180 = var161 + var168;
                     var36 = var180;
                     var476 = 219530927 ^ var476;
                  } else {
                     var476 = 1020854564 ^ var476;
                  }
               } else {
                  label102:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var476)) {
                        case 33712613:
                           var476 ^= 1006190764;
                           break label102;
                        case 624794793:
                           break;
                        case 1342109378:
                           break label102;
                        case 1448354827:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var476)) {
                     case 162611374:
                        var476 ^= 1382612015;
                        continue label168;
                     case 482594189:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1874977998:
                        continue label168;
                     case 2107274271:
                  }
               }
            }
         }
      }
   }

   private int renderSettings(
      com.wimpyclient.m.b var1, int var2, int var3, int var4, v var5, v var6, com.wimpyclient.j.g var7, b$a var8, float var9, float var10, int var11, int var12
   ) {
      int var77 = 1756308802 ^ 1228408300 ^ 504965528;
      var77 = 134837628 ^ var77;
      byte var68;
      if (var6 == var5) {
         var77 = 1478633359 ^ var77;
         var68 = (byte)(1873107908 ^ var77);
         var77 = 1847635655 ^ var77;
      } else {
         label53:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
               case 100736961:
                  break label53;
               case 194426696:
                  var77 ^= 1328575282;
                  break label53;
               case 449705602:
                  break;
               case 1192659639:
               default:
                  throw new RuntimeException(new IOException());
            }
         }

         var68 = (byte)(2025262968 ^ var77);
         var77 = 2033384058 ^ var77;
      }

      int var30 = this.drawKeybindRow(var1, var2, var3, var4, var5, (var68 != 0), var9, var10, var11, var12);
      int var74 = var30;
      List var32 = visibleSettings(var5);
      Iterator var34 = var32.iterator();
      Iterator var27 = var34;
      var77 = 499184838 ^ var77;

      while (true) {
         byte var36 = (byte)((var27.hasNext()) ? 1 : 0);
         if (var36 == (474284484 ^ var77)) {
            var77 = tmbnfwxztnsvmyha(var77, 1707621629);
            byte var38 = (byte)((var32.isEmpty()) ? 1 : 0);
            if (var38 != (2039299385 ^ var77)) {
               var77 = 2117338184 ^ var77;
               List var40 = var5.settings();
               byte var41 = (byte)((var40.isEmpty()) ? 1 : 0);
               if (var41 != (129579377 ^ var77)) {
                  var77 = 1776743183 ^ var77;
                  byte var54 = (byte)(1851771514 ^ var77);
                  int var51 = var2 + var54;
                  float var52 = var51;
                  byte var59 = (byte)(1851771508 ^ var77);
                  int var56 = var74 + var59;
                  float var57 = var56;
                  float var60 = e.bodyFont();
                  com.wimpyclient.o.b var62 = com.wimpyclient.o.b.INSTANCE;
                  int var63 = var62.textMuted();
                  String var65 = nncilsnhig(yfhdbdavzggidym(), wdhqinctnounira(), var77);
                  float var43 = var1.text(var52, var57, var60, var63, var65);
                  var74 += 1851771498 ^ var77;
                  var77 = 563555039 ^ var77;
                  return var74;
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                     case 121479776:
                        var77 = 1215420880 ^ var77;
                        return var74;
                     case 345939395:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1035805240:
                        break;
                     case 2074578844:
                        return var74;
                  }
               }
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                     case 193060627:
                        var77 = 910548376 ^ var77;
                        return var74;
                     case 612772264:
                        return var74;
                     case 1759497002:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1871201615:
                  }
               }
            }
         }

         var77 = 719013780 ^ var77;
         Object var46 = var27.next();
         com.wimpyclient.j.f var47 = (com.wimpyclient.j.f)var46;
         int var49 = this.drawSetting(var1, var2, var74, var4, var47, var7, var8, var9, var10, var11, var12);
         var74 = var49;
         var77 = tmbnfwxztnsvmyha(var77, 719013780);
      }
   }

   private int drawKeybindRow(com.wimpyclient.m.b var1, int var2, int var3, int var4, v var5, boolean var6, float var7, float var8, int var9, int var10) {
      com.wimpyclient.o.b var11;
      int var31;
      byte var55;
      int var126;
      label53: {
         var126 = 2066270341 ^ 276161040 ^ 504965528;
         var126 = 1313979368 ^ var126;
         var11 = com.wimpyclient.o.b.INSTANCE;
         int var17 = e.SETTING_H;
         String var20 = nncilsnhig(cdltxkbpxstneiq(), wdhqinctnounira(), var126);
         this.noteHover(var7, var8, var2, var3, var4, var17, var9, var10, var20);
         byte var68 = (byte)(991279329 ^ var126);
         int var57 = var2 + var68;
         float var58 = var57;
         byte var87 = (byte)(991279341 ^ var126);
         int var70 = var3 + var87;
         float var71 = var70;
         float var88 = e.labelFont();
         int var98 = var11.textMuted();
         String var105 = nncilsnhig(swvrlgegfdjybik(), wdhqinctnounira(), var126);
         float var29 = var1.text(var58, var71, var88, var98, var105);
         int var59 = e.LABEL_GAP;
         var31 = var3 + var59;
         if (var6 != ((991279333 ^ var126) != 0)) {
            var126 = 1556145873 ^ var126;
            long var33 = System.nanoTime();
            long var72 = 180000000L;
            long var35 = var33 / var72;
            long var74 = 2L;
            long var37 = var35 % var74;
            long var76 = 0L;
            long var133;
            int var39 = (var133 = var37 - var76) == 0L ? 0 : (var133 < 0L ? -1 : 1);
            if (var39 == (1742036532 ^ var126)) {
               var126 = 2057639537 ^ var126;
               var55 = (byte)(493897796 ^ var126);
               var126 = tmbnfwxztnsvmyha(var126, 1778731550);
               break label53;
            }

            var126 = tmbnfwxztnsvmyha(var126, 1547964520);
         } else {
            var126 = 8713913 ^ var126;
         }

         var55 = (byte)(999378524 ^ var126);
         var126 = 1290030087 ^ var126;
      }

      int var53;
      if (var6 != ((2004157019 ^ var126) != 0)) {
         var126 = 1785915546 ^ var126;
         if (var55 != (487058113 ^ var126)) {
            var126 = 1975495146 ^ var126;
            var53 = var11.warn();
            var126 = 1128177369 ^ var126;
         } else {
            label43:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var126)) {
                  case 138365906:
                     var126 ^= 1507571623;
                  case 1258674816:
                     break label43;
                  case 1635952451:
                     break;
                  case 1756482774:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }

            int var52 = var11.warn();
            float var67 = 0.55F;
            var53 = com.wimpyclient.p.g.withAlpha(var52, var67);
            var126 = 1868202132 ^ var126;
         }
      } else {
         var126 = tmbnfwxztnsvmyha(var126, 1290189461);
         var53 = var11.field();
         var126 = 269837628 ^ var126;
      }

      byte var78 = (byte)(730258928 ^ var126);
      int var61 = var2 + var78;
      float var62 = var61;
      float var80 = var31;
      byte var99 = (byte)(730258928 ^ var126);
      int var90 = var4 - var99;
      float var91 = var90;
      int var100 = e.BTN_H;
      float var101 = var100;
      int var106 = e.BTN_H;
      float var107 = var106;
      float var111 = 2.0F;
      float var108 = var107 / var111;
      var1.rect(var62, var80, var91, var101, var108, var53);
      String var50;
      if (var6 != ((730258930 ^ var126) != 0)) {
         var126 = 1181550927 ^ var126;
         var50 = nncilsnhig(irkhiasnigzwdjy(), wdhqinctnounira(), var126);

         label34:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var126)) {
               case 83395013:
                  var126 ^= 1054226308;
                  break label34;
               case 86706565:
                  break;
               case 1286993108:
                  break label34;
               case 1983559326:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      } else {
         var126 = 1803232908 ^ var126;
         var50 = var5.keybindLabel();
         var126 = 331356231 ^ var126;
      }

      float var46 = e.bodyFont();
      float var64 = var2;
      float var82 = var4;
      float var92 = 2.0F;
      float var83 = var82 / var92;
      float var65 = var64 + var83;
      float var85 = var31;
      int var93 = e.BTN_H;
      float var94 = var93;
      float var102 = 2.0F;
      float var95 = var94 / var102;
      float var86 = var85 + var95;
      int var104 = var11.textPrimary();
      byte var118 = (byte)(1396564787 ^ var126);
      int var116 = var4 - var118;
      float var117 = var116;
      String var110 = var1.ellipsize(var46, var50, var117);
      var1.textCentered(var65, var86, var46, var104, var110);
      int var66 = e.SETTING_H;
      return var3 + var66;
   }

   private int drawSetting(
      com.wimpyclient.m.b var1,
      int var2,
      int var3,
      int var4,
      com.wimpyclient.j.f var5,
      com.wimpyclient.j.g var6,
      b$a var7,
      float var8,
      float var9,
      int var10,
      int var11
   ) {
      int var655 = 1449179579 ^ 747026875 ^ 504965528;
      var655 = 718166723 ^ var655;
      com.wimpyclient.o.b var12 = com.wimpyclient.o.b.INSTANCE;
      float var33 = e.bodyFont();
      float var34 = e.labelFont();
      byte var36 = (byte)((var5 instanceof com.wimpyclient.j.a) ? 1 : 0);
      if (var36 != (1311863643 ^ var655)) {
         var655 = 294806499 ^ var655;
         com.wimpyclient.j.a var38 = (com.wimpyclient.j.a)var5;
         int var18 = e.ROW_H;
         String var618 = var5.description();
         this.noteHover(var8, var9, var2, var3, var4, var18, var10, var11, var618);
         byte var292 = (byte)(1604522172 ^ var655);
         int var184 = var2 + var292;
         float var185 = var184;
         float var294 = var3;
         int var400 = e.ROW_H;
         float var401 = var400;
         float var473 = 2.0F;
         float var402 = var401 / var473;
         float var295 = var294 + var402;
         int var475 = var12.textMuted();
         String var596 = var5.name();
         int var619 = e.TOGGLE_W;
         int var606 = var4 - var619;
         byte var620 = (byte)(1604522164 ^ var655);
         int var607 = var606 - var620;
         float var608 = var607;
         String var531 = var1.ellipsize(var33, var596, var608);
         float var41 = var1.text(var185, var295, var33, var475, var531);
         Map var43 = this.boolAnims;
         Function var297 = var1x -> {
            int var12x = 872371380 ^ 688196789 ^ 416124095;
            var12x = 1198621910 ^ var12x;
            float var3x = 14.0F;
            com.wimpyclient.l.a var2x = new com.wimpyclient.l.a(var3x);
            byte var8x = (byte)((var38.get()) ? 1 : 0);
            float var9x;
            if (var8x != (1162236008 ^ var12x)) {
               var12x = 285421160 ^ var12x;
               var9x = 1.0F;
               var12x = tmbnfwxztnsvmyha(var12x, 1389792883);
            } else {
               var12x = tmbnfwxztnsvmyha(var12x, 922510255);
               var9x = 0.0F;
               var12x = 1965671348 ^ var12x;
            }

            var2x.snap(var9x);
            return var2x;
         };
         Object var44 = var43.computeIfAbsent(var38, var297);
         com.wimpyclient.l.a var45 = (com.wimpyclient.l.a)var44;
         byte var188 = (byte)((var38.get()) ? 1 : 0);
         float var189;
         if (var188 != (1604522168 ^ var655)) {
            var655 = 222767659 ^ var655;
            var189 = 1.0F;
            var655 = tmbnfwxztnsvmyha(var655, 1092024458);
         } else {
            var655 = 36986873 ^ var655;
            var189 = 0.0F;
            var655 = 1315278168 ^ var655;
         }

         var45.setTarget(var189);
         float var48 = var45.update();
         int var191 = e.toggleX(var2, var4);
         int var300 = e.toggleY(var3);
         float var405 = var45.eased();
         drawToggle(var1, var191, var300, var405);
         int var192 = e.ROW_H;
         return var3 + var192;
      } else {
         int var168;
         String var395;
         label109:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var655)) {
               case 125796785:
                  var655 ^= 985184588;
               case 843776047:
                  byte var53 = (byte)((var5 instanceof com.wimpyclient.j.b) ? 1 : 0);
                  if (var53 != (1955187223 ^ var655)) {
                     var655 = 1111219782 ^ var655;
                     com.wimpyclient.j.b var55 = (com.wimpyclient.j.b)var5;
                     int var568 = e.ROW_H;
                     String var622 = var5.description();
                     this.noteHover(var8, var9, var2, var3, var4, var568, var10, var11, var622);
                     byte var57 = (byte)(917640283 ^ var655);
                     int var194 = e.ICON;
                     byte var302 = (byte)(917640277 ^ var655);
                     int var195 = var194 + var302;
                     int var58 = Math.max(var57, var195);
                     byte var303 = (byte)(917640277 ^ var655);
                     int var197 = var2 + var303;
                     float var198 = var197;
                     float var305 = var3;
                     int var407 = e.ROW_H;
                     float var408 = var407;
                     float var477 = 2.0F;
                     float var409 = var408 / var477;
                     float var306 = var305 + var409;
                     int var479 = var12.textMuted();
                     String var599 = var5.name();
                     int var611 = var4 - var58;
                     byte var624 = (byte)(917640285 ^ var655);
                     int var612 = var611 - var624;
                     float var613 = var612;
                     String var534 = var1.ellipsize(var33, var599, var613);
                     float var60 = var1.text(var198, var306, var33, var479, var534);
                     float var62 = var3;
                     int var199 = e.ROW_H;
                     int var200 = var199 - var58;
                     float var201 = var200;
                     float var308 = 2.0F;
                     float var202 = var201 / var308;
                     float var63 = var62 + var202;
                     int var204 = var2 + var4;
                     int var205 = var204 - var58;
                     float var206 = var205;
                     float var412 = var58;
                     float var481 = var58;
                     float var535 = 2.0F;
                     float var571 = var58;
                     float var600 = 4.0F;
                     float var572 = var571 / var600;
                     float var536 = Math.max(var535, var572);
                     int var574 = var55.argb();
                     var1.rect(var206, var63, var412, var481, var536, var574);
                     int var207 = e.ROW_H;
                     int var66 = var3 + var207;
                     int var28 = var66;
                     byte var68 = (byte)((var55.isPickerOpen()) ? 1 : 0);
                     if (var68 != (917640273 ^ var655)) {
                        var655 = 62425187 ^ var655;
                        byte var312 = (byte)(889887792 ^ var655);
                        int var209 = var2 + var312;
                        byte var482 = (byte)(889887792 ^ var655);
                        int var414 = var4 - var482;
                        int var70 = drawColorPicker(var1, var209, var66, var414, var55, var7);
                        var28 = var70;
                        var655 = 1792321951 ^ var655;
                     } else {
                        var655 = tmbnfwxztnsvmyha(var655, 1768694268);
                     }

                     return var28;
                  }

                  label106:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var655)) {
                        case 30049029:
                           var655 ^= 381606024;
                           break label106;
                        case 97013799:
                           break;
                        case 170460141:
                        default:
                           throw new IllegalStateException();
                        case 604341737:
                           break label106;
                     }
                  }

                  byte var73 = (byte)((var5 instanceof com.wimpyclient.j.d) ? 1 : 0);
                  if (var73 != (1647776415 ^ var655)) {
                     var655 = 1846645948 ^ var655;
                     com.wimpyclient.j.d var75 = (com.wimpyclient.j.d)var5;
                     int var575 = e.SETTING_H;
                     String var626 = var5.description();
                     this.noteHover(var8, var9, var2, var3, var4, var575, var10, var11, var626);
                     byte var315 = (byte)(203851303 ^ var655);
                     int var212 = var2 + var315;
                     float var213 = var212;
                     byte var416 = (byte)(203851307 ^ var655);
                     int var317 = var3 + var416;
                     float var318 = var317;
                     int var486 = var12.textMuted();
                     String var540 = var5.name();
                     float var78 = var1.text(var213, var318, var34, var486, var540);
                     int var80 = var75.get();
                     String var81 = Integer.toString(var80);
                     int var215 = var2 + var4;
                     byte var320 = (byte)(203851303 ^ var655);
                     int var216 = var215 - var320;
                     float var217 = var216;
                     float var322 = var1.textWidth(var34, var81);
                     float var218 = var217 - var322;
                     byte var419 = (byte)(203851307 ^ var655);
                     int var324 = var3 + var419;
                     float var325 = var324;
                     int var489 = var12.accent();
                     float var83 = var1.text(var218, var325, var34, var489, var81);
                     int var219 = e.LABEL_GAP;
                     int var85 = var3 + var219;
                     byte var220 = (byte)(203851297 ^ var655);
                     int var87 = var2 + var220;
                     float var88 = var87;
                     byte var89 = (byte)(203851307 ^ var655);
                     byte var326 = (byte)(203851303 ^ var655);
                     int var222 = var4 - var326;
                     int var90 = Math.max(var89, var222);
                     float var91 = var90;
                     int var93 = var75.get();
                     int var224 = var75.min();
                     int var94 = var93 - var224;
                     float var95 = var94;
                     byte var225 = (byte)(203851298 ^ var655);
                     int var328 = var75.max();
                     int var422 = var75.min();
                     int var329 = var328 - var422;
                     int var226 = Math.max(var225, var329);
                     float var227 = var226;
                     float var96 = var95 / var227;
                     float var98 = var85;
                     int var228 = e.BTN_H;
                     float var229 = var228;
                     float var330 = 2.0F;
                     float var230 = var229 / var330;
                     float var99 = var98 + var230;
                     float var423 = 3.0F;
                     float var332 = var99 - var423;
                     float var490 = 6.0F;
                     float var542 = 3.0F;
                     int var577 = var12.track();
                     var1.rect(var88, var332, var91, var490, var542, var577);
                     float var425 = 3.0F;
                     float var334 = var99 - var425;
                     float var426 = 6.0F;
                     float var492 = var91 * var96;
                     float var427 = Math.max(var426, var492);
                     float var493 = 6.0F;
                     float var544 = 3.0F;
                     int var579 = var12.accent();
                     var1.rect(var88, var334, var427, var493, var544, var579);
                     float var336 = var91 * var96;
                     float var234 = var88 + var336;
                     float var429 = 6.0F;
                     int var495 = var12.knob();
                     var1.circle(var234, var99, var429, var495);
                     int var235 = e.SETTING_H;
                     return var3 + var235;
                  }

                  var655 = tmbnfwxztnsvmyha(var655, 594181770);
                  byte var106 = (byte)((var5 instanceof com.wimpyclient.j.c) ? 1 : 0);
                  if (var106 != (1096641557 ^ var655)) {
                     var655 = 2122744722 ^ var655;
                     com.wimpyclient.j.c var108 = (com.wimpyclient.j.c)var5;
                     int var580 = e.SETTING_H;
                     String var628 = var5.description();
                     this.noteHover(var8, var9, var2, var3, var4, var580, var10, var11, var628);
                     byte var339 = (byte)(1071378307 ^ var655);
                     int var238 = var2 + var339;
                     float var239 = var238;
                     byte var431 = (byte)(1071378319 ^ var655);
                     int var341 = var3 + var431;
                     float var342 = var341;
                     int var498 = var12.textMuted();
                     String var547 = var5.name();
                     float var111 = var1.text(var239, var342, var34, var498, var547);
                     String var113 = var108.display();
                     int var241 = var2 + var4;
                     byte var344 = (byte)(1071378307 ^ var655);
                     int var242 = var241 - var344;
                     float var243 = var242;
                     float var346 = var1.textWidth(var34, var113);
                     float var244 = var243 - var346;
                     byte var434 = (byte)(1071378319 ^ var655);
                     int var348 = var3 + var434;
                     float var349 = var348;
                     int var501 = var12.accent();
                     float var115 = var1.text(var244, var349, var34, var501, var113);
                     int var245 = e.LABEL_GAP;
                     int var117 = var3 + var245;
                     byte var246 = (byte)(1071378309 ^ var655);
                     int var119 = var2 + var246;
                     float var120 = var119;
                     byte var121 = (byte)(1071378319 ^ var655);
                     byte var350 = (byte)(1071378307 ^ var655);
                     int var248 = var4 - var350;
                     int var122 = Math.max(var121, var248);
                     float var123 = var122;
                     double var124 = 1.0E-9;
                     double var352 = var108.max();
                     double var503 = var108.min();
                     double var354 = var352 - var503;
                     double var126 = Math.max(var124, var354);
                     float var128 = (float)var126;
                     double var130 = var108.get();
                     double var357 = var108.min();
                     double var132 = var130 - var357;
                     double var360 = var128;
                     double var134 = var132 / var360;
                     float var136 = (float)var134;
                     float var138 = var117;
                     int var249 = e.BTN_H;
                     float var250 = var249;
                     float var362 = 2.0F;
                     float var251 = var250 / var362;
                     float var139 = var138 + var251;
                     float var436 = 3.0F;
                     float var364 = var139 - var436;
                     float var505 = 6.0F;
                     float var549 = 3.0F;
                     int var582 = var12.track();
                     var1.rect(var120, var364, var123, var505, var549, var582);
                     float var438 = 3.0F;
                     float var366 = var139 - var438;
                     float var439 = 6.0F;
                     float var507 = var123 * var136;
                     float var440 = Math.max(var439, var507);
                     float var508 = 6.0F;
                     float var551 = 3.0F;
                     int var584 = var12.accent();
                     var1.rect(var120, var366, var440, var508, var551, var584);
                     float var368 = var123 * var136;
                     float var255 = var120 + var368;
                     float var442 = 6.0F;
                     int var510 = var12.knob();
                     var1.circle(var255, var139, var442, var510);
                     int var256 = e.SETTING_H;
                     return var3 + var256;
                  }

                  var655 = tmbnfwxztnsvmyha(var655, 1922818802);
                  byte var146 = (byte)((var5 instanceof com.wimpyclient.j.g) ? 1 : 0);
                  if (var146 == (868650727 ^ var655)) {
                     var655 = 1683118694 ^ var655;
                     byte var148 = (byte)((var5 instanceof com.wimpyclient.j.e) ? 1 : 0);
                     if (var148 != (1469371521 ^ var655)) {
                        var655 = 1467271944 ^ var655;
                        com.wimpyclient.j.e var150 = (com.wimpyclient.j.e)var5;
                        int var585 = e.SETTING_H;
                        String var630 = var5.description();
                        this.noteHover(var8, var9, var2, var3, var4, var585, var10, var11, var630);
                        byte var371 = (byte)(14688141 ^ var655);
                        int var259 = var2 + var371;
                        float var260 = var259;
                        byte var444 = (byte)(14688129 ^ var655);
                        int var373 = var3 + var444;
                        float var374 = var373;
                        int var513 = var12.textMuted();
                        String var554 = var5.name();
                        float var153 = var1.text(var260, var374, var34, var513, var554);
                        int var261 = e.LABEL_GAP;
                        int var155 = var3 + var261;
                        byte var375 = (byte)(14688139 ^ var655);
                        int var263 = var2 + var375;
                        float var264 = var263;
                        float var377 = var155;
                        byte var514 = (byte)(14688139 ^ var655);
                        int var447 = var4 - var514;
                        float var448 = var447;
                        int var515 = e.BTN_H;
                        float var516 = var515;
                        int var555 = e.BTN_H;
                        float var556 = var555;
                        float var586 = 2.0F;
                        float var557 = var556 / var586;
                        int var588 = var12.field();
                        var1.rect(var264, var377, var448, var516, var557, var588);
                        float var266 = var2;
                        float var379 = var4;
                        float var449 = 2.0F;
                        float var380 = var379 / var449;
                        float var267 = var266 + var380;
                        float var382 = var155;
                        int var450 = e.BTN_H;
                        float var451 = var450;
                        float var517 = 2.0F;
                        float var452 = var451 / var517;
                        float var383 = var382 + var452;
                        int var519 = var12.accent();
                        String var559 = var150.get();
                        var1.textCentered(var267, var383, var33, var519, var559);
                        int var268 = e.SETTING_H;
                        return var3 + var268;
                     }

                     var655 = tmbnfwxztnsvmyha(var655, 938758839);
                     int var269 = e.ROW_H;
                     return var3 + var269;
                  }

                  var655 = 837898753 ^ var655;
                  com.wimpyclient.j.g var163 = (com.wimpyclient.j.g)var5;
                  int var589 = e.SETTING_H;
                  String var632 = var5.description();
                  this.noteHover(var8, var9, var2, var3, var4, var589, var10, var11, var632);
                  byte var385 = (byte)(37215458 ^ var655);
                  int var272 = var2 + var385;
                  float var273 = var272;
                  byte var455 = (byte)(37215470 ^ var655);
                  int var387 = var3 + var455;
                  float var388 = var387;
                  int var522 = var12.textMuted();
                  String var562 = var5.name();
                  float var166 = var1.text(var273, var388, var34, var522, var562);
                  int var274 = e.LABEL_GAP;
                  var168 = var3 + var274;
                  byte var182;
                  if (var6 == var163) {
                     var655 = 355657409 ^ var655;
                     var182 = (byte)(386218534 ^ var655);

                     label96:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var655)) {
                           case 211433390:
                              var655 ^= 255132802;
                              break label96;
                           case 952504812:
                              break;
                           case 1345336557:
                              break label96;
                           case 1657852329:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  } else {
                     var655 = 1083254835 ^ var655;
                     var182 = (byte)(1118237909 ^ var655);
                     var655 = 1519831664 ^ var655;
                  }

                  byte var389 = (byte)(405814951 ^ var655);
                  int var277 = var2 + var389;
                  float var278 = var277;
                  float var391 = var168;
                  byte var523 = (byte)(405814951 ^ var655);
                  int var458 = var4 - var523;
                  float var459 = var458;
                  int var524 = e.BTN_H;
                  float var525 = var524;
                  int var563 = e.BTN_H;
                  float var564 = var563;
                  float var590 = 2.0F;
                  float var565 = var564 / var590;
                  int var594;
                  if (var182 != (405814949 ^ var655)) {
                     var655 = 1580398484 ^ var655;
                     var594 = var12.track();
                     var655 = tmbnfwxztnsvmyha(var655, 1434036535);
                  } else {
                     var655 = 750763988 ^ var655;
                     var594 = var12.field();
                     var655 = 670359927 ^ var655;
                  }

                  var1.rect(var278, var391, var459, var525, var565, var594);
                  String var172 = var163.get();
                  String var648 = var172;
                  if (var182 != (326852614 ^ var655)) {
                     var655 = 1913774449 ^ var655;
                     long var279 = System.nanoTime();
                     long var460 = 400000000L;
                     long var281 = var279 / var460;
                     long var462 = 2L;
                     long var283 = var281 % var462;
                     long var464 = 0L;
                     long var687;
                     int var285 = (var687 = var283 - var464) == 0L ? 0 : (var687 < 0L ? -1 : 1);
                     String var291;
                     if (var285 == (1634369911 ^ var655)) {
                        var655 = 1801319762 ^ var655;
                        var291 = nncilsnhig(eandrnjpinqltnr(), wdhqinctnounira(), var655);
                        var655 = 779293196 ^ var655;
                     } else {
                        var655 = 1761917454 ^ var655;
                        var291 = nncilsnhig(gfrtftyprshahuk(), wdhqinctnounira(), var655);
                        var655 = 740973904 ^ var655;
                     }

                     String var175 = var172 + var291;
                     var648 = var175;
                     var655 = 2060257714 ^ var655;
                  } else {
                     var655 = 1307709341 ^ var655;
                  }

                  byte var393 = (byte)((var648.isEmpty()) ? 1 : 0);
                  if (var393 != (1586065307 ^ var655)) {
                     var655 = 690874880 ^ var655;
                     if (var182 == (2007270811 ^ var655)) {
                        var655 = 969310608 ^ var655;
                        var395 = nncilsnhig(fsbcbhgoupghwbl(), wdhqinctnounira(), var655);

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var655)) {
                              case 131967415:
                                 var655 ^= 1442450766;
                              case 267003809:
                                 break label109;
                              case 678462059:
                              default:
                                 throw new IllegalStateException();
                              case 1841593598:
                           }
                        }
                     }

                     var655 = 1973921954 ^ var655;
                  } else {
                     var655 = tmbnfwxztnsvmyha(var655, 1552564898);
                  }

                  var395 = var648;
                  var655 = 429597820 ^ var655;
                  break label109;
               case 378597205:
                  break;
               case 1446316914:
               default:
                  throw new IllegalStateException();
            }
         }

         byte var526 = (byte)(462948687 ^ var655);
         int var467 = var4 - var526;
         float var468 = var467;
         String var177 = var1.ellipsize(var33, var395, var468);
         byte var396 = (byte)(462948675 ^ var655);
         int var288 = var2 + var396;
         float var289 = var288;
         float var398 = var168;
         int var469 = e.BTN_H;
         float var470 = var469;
         float var527 = 2.0F;
         float var471 = var470 / var527;
         float var399 = var398 + var471;
         int var529 = var12.textPrimary();
         float var179 = var1.text(var289, var399, var33, var529, var177);
         int var290 = e.SETTING_H;
         return var3 + var290;
      }
   }

   private static int drawColorPicker(com.wimpyclient.m.b var0, int var1, int var2, int var3, com.wimpyclient.j.b var4, b$a var5) {
      int var266 = 1154376588 ^ 986783708 ^ 416124095;
      var266 = 123685897 ^ var266;
      int var6 = e.WHEEL_R;
      int var14 = var6;
      byte var30 = (byte)(1636678884 ^ var266);
      int var7 = e.WHEEL_STEP;
      int var31 = Math.max(var30, var7);
      int var15 = var31;
      byte var8 = (byte)(1636678884 ^ var266);
      int var120 = var3 / var8;
      int var33 = var1 + var120;
      int var16 = var33;
      int var35 = var2 + var6;
      byte var122 = (byte)(1636678884 ^ var266);
      int var36 = var35 + var122;
      int var17 = var36;
      int var38 = var6 * var6;
      int var18 = var38;
      int var40 = -var6;
      int var19 = var40;
      var266 = 840748975 ^ var266;

      label103:
      while (var19 <= var14) {
         var266 = 827447495 ^ var266;
         int var43 = -var14;
         int var20 = var43;
         var266 = 1000016762 ^ var266;

         label76:
         while (var20 <= var14) {
            var266 = 1143618455 ^ var266;
            int var46 = var20 * var20;
            int var128 = var19 * var19;
            int var47 = var46 + var128;
            if (var47 > var18) {
               var266 = 9848967 ^ var266;
               var266 = 1223787062 ^ var266;
            } else {
               label61:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var266)) {
                     case 151781502:
                        var266 ^= 1195472249;
                        break label61;
                     case 1072067546:
                        break;
                     case 1244693346:
                     default:
                        throw new RuntimeException();
                     case 1252497504:
                        break label61;
                  }
               }

               double var52 = var47;
               double var54 = Math.sqrt(var52);
               float var56 = (float)var54;
               float var132 = var14;
               float var57 = var56 / var132;
               double var59 = var19;
               double var188 = var20;
               double var61 = Math.atan2(var59, var188);
               double var190 = Math.PI * 2;
               double var63 = var61 / var190;
               double var192 = 0.5;
               double var65 = var63 + var192;
               float var67 = (float)var65;
               float var194 = 1.0F;
               int var69 = com.wimpyclient.j.b.hsvToRgb(var67, var57, var194);
               int var135 = var16 + var20;
               float var136 = var135;
               int var197 = var17 + var19;
               float var198 = var197;
               float var224 = var15;
               float var236 = var15;
               float var11 = 0.0F;
               int var12 = -1523519974 ^ var266;
               int var251 = var12 | var69;
               var0.rect(var136, var198, var224, var236, var11, var251);
               var266 = 254197704 ^ var266;
            }

            int var50 = var20 + var15;
            var20 = var50;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var266)) {
                  case 81488784:
                     var266 ^= 206434598;
                     continue label76;
                  case 121402889:
                  default:
                     throw new RuntimeException();
                  case 242909068:
                     break;
                  case 395892399:
                     continue label76;
               }
            }
         }

         var266 = tmbnfwxztnsvmyha(var266, 1864804873);
         int var72 = var19 + var15;
         var19 = var72;

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var266)) {
               case 160592695:
                  var266 ^= 1709996468;
               case 280473081:
                  continue label103;
               case 1724110398:
               default:
                  throw new RuntimeException();
               case 1829487597:
            }
         }
      }

      label97:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var266)) {
            case 32087244:
               var266 ^= 952556421;
            case 700264063:
               break label97;
            case 990999798:
            default:
               throw new RuntimeException();
            case 1857011990:
         }
      }

      float var74 = var4.hue();
      float var138 = 0.5F;
      float var75 = var74 - var138;
      float var139 = (float) (Math.PI * 2);
      float var76 = var75 * var139;
      float var78 = var4.saturation();
      float var80 = var16;
      double var141 = var76;
      double var143 = Math.cos(var141);
      float var145 = (float)var143;
      float var146 = var145 * var78;
      float var201 = var14;
      float var147 = var146 * var201;
      float var81 = var80 + var147;
      float var83 = var17;
      double var149 = var76;
      double var151 = Math.sin(var149);
      float var153 = (float)var151;
      float var154 = var153 * var78;
      float var204 = var14;
      float var155 = var154 * var204;
      float var84 = var83 + var155;
      float var225 = 3.5F;
      byte var237 = (byte)(-1800906957 ^ var266);
      var0.circle(var81, var84, var225, var237);
      float var226 = 3.5F;
      float var238 = 1.2F;
      int var247 = -1806194484 ^ var266;
      var0.circleOutline(var81, var84, var226, var238, var247);
      int var158 = e.COLOR_PICKER_H;
      int var88 = var2 + var158;
      int var159 = e.FIELD_H;
      int var89 = var88 - var159;
      int var261 = var89;
      byte var90 = (byte)(1800906954 ^ var266);
      int var160 = e.FIELD_H;
      byte var207 = (byte)(1800906952 ^ var266);
      int var161 = var160 - var207;
      int var91 = Math.max(var90, var161);
      int var262 = var91;
      byte var92 = (byte)(1800906948 ^ var266);
      byte var208 = (byte)(1800906958 ^ var266);
      int var163 = var3 / var208;
      int var93 = Math.max(var92, var163);
      int var25 = var93;
      byte var94 = (byte)(1800906956 ^ var266);
      int var26 = var94;
      var266 = 385252297 ^ var266;

      while (var26 < var25) {
         var266 = 1976226851 ^ var266;
         byte var176 = (byte)(141231911 ^ var266);
         float var111;
         if (var25 <= var176) {
            var266 = 1046380926 ^ var266;
            var111 = 1.0F;
            var266 = tmbnfwxztnsvmyha(var266, 1904451653);
         } else {
            var266 = tmbnfwxztnsvmyha(var266, 1187558345);
            float var110 = var26;
            byte var216 = (byte)(1319351534 ^ var266);
            int var178 = var25 - var216;
            float var179 = var178;
            var111 = var110 / var179;
            var266 = 152408818 ^ var266;
         }

         float var113 = var4.hue();
         float var181 = var4.saturation();
         int var114 = com.wimpyclient.j.b.hsvToRgb(var113, var181, var111);
         float var116 = var1;
         float var183 = var26;
         float var219 = var3;
         float var231 = var25;
         float var220 = var219 / var231;
         float var184 = var183 * var220;
         float var117 = var116 + var184;
         float var222 = var261;
         float var233 = var3;
         float var243 = var25;
         float var234 = var233 / var243;
         float var244 = 0.5F;
         float var235 = var234 + var244;
         float var246 = var262;
         float var250 = 0.0F;
         int var254 = -1196022243 ^ var266;
         int var255 = var254 | var114;
         var0.rect(var117, var222, var235, var246, var250, var255);
         var26 += 1203119644 ^ var266;
         var266 = 974648600 ^ var266;
      }

      label84:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var266)) {
            case 57275768:
               var266 ^= 1819408302;
               break label84;
            case 81504201:
               break;
            case 493567857:
               break label84;
            case 2102831405:
            default:
               throw new RuntimeException();
         }
      }

      float var97 = var1;
      float var166 = var4.value();
      byte var227 = (byte)(298853546 ^ var266);
      int var210 = var3 - var227;
      float var211 = var210;
      float var167 = var166 * var211;
      float var98 = var97 + var167;
      float var212 = 2.0F;
      float var169 = var98 - var212;
      byte var228 = (byte)(298853546 ^ var266);
      int var214 = var261 - var228;
      float var215 = var214;
      float var229 = 4.0F;
      byte var248 = (byte)(298853545 ^ var266);
      int var240 = var262 + var248;
      float var241 = var240;
      float var249 = 2.0F;
      com.wimpyclient.o.b var252 = com.wimpyclient.o.b.INSTANCE;
      int var253 = var252.knob();
      var0.rect(var169, var215, var229, var241, var249, var253);
      if (var5 != null) {
         var266 = 1324708933 ^ var266;
         var5.wheelCx = var16;
         var5.wheelCy = var17;
         var5.sliderX = var1;
         var5.sliderY = var261;
         var5.sliderW = var3;
         var266 = 830616235 ^ var266;
      } else {
         var266 = tmbnfwxztnsvmyha(var266, 2138523374);
      }

      int var175 = e.COLOR_PICKER_H;
      return var2 + var175;
   }

   private void noteHover(float var1, float var2, int var3, int var4, int var5, int var6, int var7, int var8, String var9) {
      int var35 = 1817520708 ^ 387132741 ^ 504965528;
      var35 = 1134043938 ^ var35;
      if (var9 != null) {
         var35 = 1258436445 ^ var35;
         byte var18 = (byte)((var9.isBlank()) ? 1 : 0);
         if (var18 == (1841642214 ^ var35)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var35)) {
                  case 78532568:
                     var35 ^= 2049138918;
                  case 733960879:
                     float var28 = var7;
                     float var47;
                     int var20 = (var47 = var2 - var28) == 0.0F ? 0 : (var47 < 0.0F ? -1 : 1);
                     if (var20 >= (400972288 ^ var35)) {
                        var35 = 1618310371 ^ var35;
                        float var30 = var8;
                        float var48;
                        int var22 = (var48 = var2 - var30) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
                        if (var22 < (2006134499 ^ var35)) {
                           var35 = 1310673351 ^ var35;
                           double var24 = var1;
                           double var32 = var2;
                           byte var26 = (byte)((inside(var24, var32, var3, var4, var5, var6)) ? 1 : 0);
                           if (var26 != (965502756 ^ var35)) {
                              var35 = 730007738 ^ var35;
                              this.hoverTip = var9;
                              var35 = 816675142 ^ var35;
                           } else {
                              var35 = 456028668 ^ var35;
                           }

                           return;
                        }

                        var35 = 1215202021 ^ var35;
                        return;
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var35)) {
                           case 240015750:
                              var35 = 672921094 ^ var35;
                              return;
                           case 598988891:
                              return;
                           case 669989162:
                              break;
                           case 930834545:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  case 104731141:
                  default:
                     throw new RuntimeException(new IOException());
                  case 422564648:
               }
            }
         }

         var35 = 1051710799 ^ var35;
      } else {
         var35 = tmbnfwxztnsvmyha(var35, 1974329874);
      }
   }

   private static void drawToggle(com.wimpyclient.m.b var0, int var1, int var2, float var3) {
      int var100 = 1054960711 ^ 1391806281 ^ 416124095;
      var100 = 740328129 ^ var100;
      com.wimpyclient.o.b var4 = com.wimpyclient.o.b.INSTANCE;
      int var24 = e.TOGGLE_W;
      int var25 = e.TOGGLE_H;
      int var27 = var4.track();
      int var29 = var4.accent();
      int var31 = com.wimpyclient.p.g.lerp(var27, var29, var3);
      float var55 = var1;
      float var75 = var2;
      float var84 = var24;
      float var87 = var25;
      float var90 = var25;
      float var10 = 2.0F;
      float var91 = var90 / var10;
      var0.rect(var55, var75, var84, var87, var91, var31);
      byte var33 = (byte)(1492723058 ^ var100);
      byte var76 = (byte)(1492723063 ^ var100);
      int var57 = var25 / var76;
      int var34 = Math.max(var33, var57);
      byte var77 = (byte)(1492723058 ^ var100);
      int var59 = var34 * var77;
      int var36 = var25 - var59;
      float var38 = var2;
      int var61 = var25 - var36;
      float var62 = var61;
      float var79 = 2.0F;
      float var63 = var62 / var79;
      float var39 = var38 + var63;
      int var41 = var1 + var34;
      float var42 = var41;
      int var44 = var1 + var24;
      int var45 = var44 - var36;
      int var46 = var45 - var34;
      float var47 = var46;
      float var69 = var47 - var42;
      float var70 = var69 * var3;
      float var49 = var42 + var70;
      int var51 = var4.knobOff();
      int var72 = var4.knob();
      int var52 = com.wimpyclient.p.g.lerp(var51, var72, var3);
      float var86 = var36;
      float var89 = var36;
      float var93 = var36;
      float var96 = 2.0F;
      float var94 = var93 / var96;
      var0.rect(var49, var39, var86, var89, var94, var52);
   }

   private static void drawCategoryIcon(com.wimpyclient.m.b var0, float var1, float var2, float var3) {
      int var16 = 1815119169 ^ 616458627 ^ 416124095;
      var16 = 2128701290 ^ var16;
      float var10 = 2.0F;
      float var11 = var3 / var10;
      com.wimpyclient.o.b var12 = com.wimpyclient.o.b.INSTANCE;
      int var13 = var12.accent();
      var0.rect(var1, var2, var3, var3, var11, var13);
   }

   static int settingsHeight(v var0) {
      int var47 = 509696331 ^ 314014268 ^ 416124095;
      var47 = 1903636039 ^ var47;
      int var1 = e.SETTING_H;
      int var3 = var1;
      List var9 = visibleSettings(var0);
      byte var11 = (byte)((var9.isEmpty()) ? 1 : 0);
      if (var11 != (1701609871 ^ var47)) {
         var47 = 1339562076 ^ var47;
         List var13 = var0.settings();
         byte var14 = (byte)((var13.isEmpty()) ? 1 : 0);
         if (var14 != (716478931 ^ var47)) {
            var47 = 1116116930 ^ var47;
            byte var2 = (byte)(1748110853 ^ var47);
            return var1 + var2;
         }

         label101:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var47)) {
               case 45990076:
                  var47 ^= 1691692188;
                  break label101;
               case 647197397:
                  break;
               case 691784832:
                  break label101;
               case 887007103:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      } else {
         var47 = 722285760 ^ var47;
      }

      Iterator var18 = var9.iterator();
      Iterator var5 = var18;
      var47 = 805561748 ^ var47;

      label94:
      while (true) {
         byte var20 = (byte)((var5.hasNext()) ? 1 : 0);
         if (var20 == (2120372443 ^ var47)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var47)) {
                  case 81658570:
                     var47 = 787179111 ^ var47;
                     return var3;
                  case 1070531381:
                     return var3;
                  case 1450186768:
                     break;
                  case 1546219026:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }

         var47 = 1522218719 ^ var47;
         Object var23 = var5.next();
         com.wimpyclient.j.f var24 = (com.wimpyclient.j.f)var23;
         byte var26 = (byte)((var24 instanceof com.wimpyclient.j.a) ? 1 : 0);
         if (var26 != (618227204 ^ var47)) {
            var47 = 218149447 ^ var47;
            int var41 = e.ROW_H;
            int var28 = var3 + var41;
            var3 = var28;

            label52:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var47)) {
                  case 18227864:
                     var47 ^= 1745168682;
                     break label52;
                  case 630539092:
                     break;
                  case 1568763453:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1856358400:
                     break label52;
               }
            }
         } else {
            label80:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var47)) {
                  case 124064126:
                     var47 ^= 39547432;
                     break label80;
                  case 649721369:
                     break;
                  case 1588081868:
                  default:
                     throw new RuntimeException(new IOException());
                  case 2043668356:
                     break label80;
               }
            }

            byte var30 = (byte)((var24 instanceof com.wimpyclient.j.b) ? 1 : 0);
            if (var30 != (646059052 ^ var47)) {
               var47 = 1176444605 ^ var47;
               com.wimpyclient.j.b var32 = (com.wimpyclient.j.b)var24;
               int var42 = e.ROW_H;
               int var34 = var3 + var42;
               var3 = var34;
               byte var36 = (byte)((var32.isPickerOpen()) ? 1 : 0);
               if (var36 == (1620904593 ^ var47)) {
                  var47 = 557971448 ^ var47;
               } else {
                  var47 = 771460739 ^ var47;
                  int var43 = e.COLOR_PICKER_H;
                  int var38 = var34 + var43;
                  var3 = var38;

                  label63:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var47)) {
                        case 100061828:
                           var47 ^= 213547387;
                           break label63;
                        case 1244929465:
                           break;
                        case 1598131553:
                           break label63;
                        case 2076008203:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               }
            } else {
               label72:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var47)) {
                     case 178004375:
                        var47 ^= 1855023873;
                        break label72;
                     case 183604375:
                     default:
                        throw new RuntimeException(new IOException());
                     case 345440580:
                        break;
                     case 1552869371:
                        break label72;
                  }
               }

               int var44 = e.SETTING_H;
               int var40 = var3 + var44;
               var3 = var40;
               var47 = 164594244 ^ var47;
            }
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var47)) {
               case 261909287:
                  var47 ^= 1069460914;
                  continue label94;
               case 416587119:
               default:
                  throw new RuntimeException(new IOException());
               case 650980534:
                  continue label94;
               case 1449476442:
            }
         }
      }
   }

   static List<com.wimpyclient.j.f> visibleSettings(v var0) {
      int var25 = 1921070297 ^ 692561049 ^ 416124095;
      var25 = 546845765 ^ var25;
      List var4 = var0.settings();
      String var5 = nncilsnhig(mzdciadyavrsvel(), wdhqinctnounira(), var25);
      String var18 = var0.id();
      byte var6 = (byte)((var5.equals(var18)) ? 1 : 0);
      if (var6 != (1670588602 ^ var25)) {
         var25 = 1964533288 ^ var25;
         return filterEntityEspSettings(var4);
      } else {
         var25 = tmbnfwxztnsvmyha(var25, 1204801349);
         String var9 = nncilsnhig(rhdrwbucmwxwuix(), wdhqinctnounira(), var25);
         String var20 = var0.id();
         byte var10 = (byte)((var9.equals(var20)) ? 1 : 0);
         if (var10 != (610068479 ^ var25)) {
            var25 = 684614813 ^ var25;
            return filterBlockEspSettings(var4);
         } else {
            var25 = tmbnfwxztnsvmyha(var25, 39163837);
            String var11 = nncilsnhig(dtzwvgmxjnyrkmq(), wdhqinctnounira(), var25);
            String var22 = var0.id();
            byte var12 = (byte)((var11.equals(var22)) ? 1 : 0);
            if (var12 != (638152770 ^ var25)) {
               var25 = 1479803115 ^ var25;
               return filterThemeSettings(var4);
            } else {
               var25 = tmbnfwxztnsvmyha(var25, 1950407651);
               return var4;
            }
         }
      }
   }

   private static List<com.wimpyclient.j.f> filterThemeSettings(List<com.wimpyclient.j.f> var0) {
      int var28 = 1538014204 ^ 2038421146 ^ 416124095;
      var28 = 1247545938 ^ var28;
      String var1 = nncilsnhig(iimmeabyojbkovy(), wdhqinctnounira(), var28);
      x var2 = com.wimpyclient.i.x.INSTANCE;
      String var22 = var2.themePreset;
      byte var7 = (byte)((var1.equals(var22)) ? 1 : 0);
      byte var3 = (byte)((var7 != 0)? 1 : 0);
      ArrayList var8 = new ArrayList();
      ArrayList var4 = var8;
      Iterator var10 = var0.iterator();
      Iterator var5 = var10;
      var28 = 305825895 ^ var28;

      while (true) {
         byte var12 = (byte)((var5.hasNext()) ? 1 : 0);
         if (var12 == (1652089836 ^ var28)) {
            var28 = 1754299208 ^ var28;
            return var4;
         }

         var28 = 1195251023 ^ var28;
         Object var14 = var5.next();
         com.wimpyclient.j.f var15 = (com.wimpyclient.j.f)var14;
         String var16 = nncilsnhig(vyakxvfzyvjidmb(), wdhqinctnounira(), var28);
         String var24 = var15.name();
         byte var17 = (byte)((var16.equals(var24)) ? 1 : 0);
         if (var17 != (625407651 ^ var28)) {
            var28 ^= 1653042570;
            if (var3 == (1203870505 ^ var28)) {
               var28 = 1627495728 ^ var28;
               var28 = tmbnfwxztnsvmyha(var28, 1152968181);
               continue;
            }

            label24:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                  case 185031518:
                     var28 ^= 1867014451;
                  case 528282559:
                     break label24;
                  case 1130319695:
                     break;
                  case 1149523899:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         } else {
            label31:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                  case 137975965:
                     var28 ^= 231673017;
                     break label31;
                  case 1239791094:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1640621034:
                     break label31;
                  case 1677623168:
               }
            }
         }

         boolean var20 = var4.add(var15);
         var28 = 1257314806 ^ var28;
      }
   }

   private static List<com.wimpyclient.j.f> filterEntityEspSettings(List<com.wimpyclient.j.f> var0) {
      String var10;
      byte var53;
      int var68;
      label117: {
         var68 = 1277635195 ^ 1994859317 ^ 416124095;
         var68 = 570821551 ^ var68;
         x var1 = com.wimpyclient.i.x.INSTANCE;
         var10 = var1.entityEspSearch;
         if (var10 != null) {
            var68 ^= 1869740955;
            byte var13 = (byte)((var10.isBlank()) ? 1 : 0);
            if (var13 == (1870296517 ^ var68)) {
               var68 = 539420974 ^ var68;
               var53 = (byte)(1331469546 ^ var68);
               var68 = 1032949159 ^ var68;
               break label117;
            }

            label114:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
                  case 134032215:
                     var68 ^= 988649502;
                     break label114;
                  case 1248949105:
                  default:
                     throw new IllegalStateException();
                  case 1414021812:
                     break;
                  case 1702528350:
                     break label114;
               }
            }
         } else {
            label108:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
                  case 710003:
                     var68 ^= 1436312453;
                     break label108;
                  case 183877779:
                  default:
                     throw new IllegalStateException();
                  case 676906766:
                     break;
                  case 1503756950:
                     break label108;
               }
            }
         }

         var53 = (byte)(1436020187 ^ var68);
         var68 = 660274327 ^ var68;
      }

      byte var3 = var53;
      String var15;
      if (var53 != (1926041932 ^ var68)) {
         var68 = 2089452508 ^ var68;
         String var52 = var10.trim();
         var15 = var52.toLowerCase();

         label97:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
               case 195732912:
                  var68 ^= 1089915054;
               case 616046008:
                  break label97;
               case 1008776076:
               default:
                  throw new IllegalStateException();
               case 2112454122:
            }
         }
      } else {
         var68 = tmbnfwxztnsvmyha(var68, 660305215);
         var15 = nncilsnhig(mymlqfpizyholwx(), wdhqinctnounira(), var68);
         var68 = 455556685 ^ var68;
      }

      String var4 = var15;
      ArrayList var16 = new ArrayList();
      ArrayList var5 = var16;
      Iterator var18 = var0.iterator();
      Iterator var6 = var18;
      var68 = 608974725 ^ var68;

      while (true) {
         byte var20 = (byte)((var6.hasNext()) ? 1 : 0);
         if (var20 == (1794993595 ^ var68)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
                  case 73062655:
                     break;
                  case 256601703:
                     var68 = 396693989 ^ var68;
                     return var5;
                  case 1981144993:
                     return var5;
                  case 2027325158:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var68 = 1670385328 ^ var68;
         Object var23 = var6.next();
         com.wimpyclient.j.f var24 = (com.wimpyclient.j.f)var23;
         String var26 = var24.name();
         String var54 = nncilsnhig(xjnjunpsaontxai(), wdhqinctnounira(), var68);
         byte var28 = (byte)((var26.equals(var54)) ? 1 : 0);
         if (var28 == (158163723 ^ var68)) {
            var68 = 1690984081 ^ var68;
            String var55 = nncilsnhig(nrkzourlyzdsrou(), wdhqinctnounira(), var68);
            byte var30 = (byte)((var26.equals(var55)) ? 1 : 0);
            if (var30 == (1839676826 ^ var68)) {
               var68 = 1810825030 ^ var68;
               String var56 = nncilsnhig(sfonkjcipcjzqes(), wdhqinctnounira(), var68);
               byte var32 = (byte)((var26.equals(var56)) ? 1 : 0);
               if (var32 == (105497308 ^ var68)) {
                  var68 = 467546104 ^ var68;
                  String var57 = nncilsnhig(cwosfwfowsrfvss(), wdhqinctnounira(), var68);
                  byte var34 = (byte)((var26.equals(var57)) ? 1 : 0);
                  if (var34 == (496495908 ^ var68)) {
                     var68 = 2117023390 ^ var68;
                     x var35 = com.wimpyclient.i.x.INSTANCE;
                     Map var36 = var35.entityEspBySettingName;
                     Object var37 = var36.get(var26);
                     m var38 = (m)var37;
                     if (var38 == null) {
                        var68 = 1070431481 ^ var68;
                        var68 = 914934520 ^ var68;
                        continue;
                     }

                     label85:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
                           case 20335104:
                              var68 ^= 767666554;
                              break label85;
                           case 519285016:
                              break;
                           case 604036836:
                           default:
                              throw new IllegalStateException();
                           case 2038397507:
                              break label85;
                        }
                     }

                     if (var3 != (1316582080 ^ var68)) {
                        var68 = 572230467 ^ var68;
                        byte var42 = (byte)((m.matchesSearch(var38, var4)) ? 1 : 0);
                        if (var42 != (1818425731 ^ var68)) {
                           var68 = 1161420064 ^ var68;
                           boolean var44 = var5.add(var24);
                           var68 = tmbnfwxztnsvmyha(var68, 1334010049);
                        } else {
                           var68 = 180010465 ^ var68;
                        }
                     } else {
                        var68 = tmbnfwxztnsvmyha(var68, 1660150297);
                        byte var46 = (byte)((var38.enabled) ? 1 : 0);
                        if (var46 != (747278553 ^ var68)) {
                           var68 = 113712893 ^ var68;
                           boolean var48 = var5.add(var24);
                           var68 = 1284885062 ^ var68;
                        } else {
                           var68 = tmbnfwxztnsvmyha(var68, 1246942395);
                        }
                     }

                     var68 = 203762137 ^ var68;
                     continue;
                  }

                  var68 = 585503273 ^ var68;
               } else {
                  var68 = tmbnfwxztnsvmyha(var68, 959987153);
               }
            } else {
               label71:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
                     case 74738429:
                        var68 ^= 1389806231;
                     case 457956309:
                        break label71;
                     case 1507676043:
                        break;
                     case 1685345382:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }
         } else {
            var68 = 907844614 ^ var68;
         }

         boolean var50 = var5.add(var24);
         var68 = 1435275958 ^ var68;
      }
   }

   private static List<com.wimpyclient.j.f> filterBlockEspSettings(List<com.wimpyclient.j.f> var0) {
      String var10;
      byte var50;
      int var67;
      label119: {
         var67 = 1152330102 ^ 370009102 ^ 416124095;
         var67 = 885474444 ^ var67;
         x var1 = com.wimpyclient.i.x.INSTANCE;
         var10 = var1.blockEspSearch;
         if (var10 != null) {
            var67 = 2083340225 ^ var67;
            byte var13 = (byte)((var10.isBlank()) ? 1 : 0);
            if (var13 == (42285706 ^ var67)) {
               var67 = 922251686 ^ var67;
               var50 = (byte)(880626477 ^ var67);
               var67 = tmbnfwxztnsvmyha(var67, 125989510);
               break label119;
            }

            var67 = tmbnfwxztnsvmyha(var67, 953437029);
         } else {
            var67 = 1157199012 ^ var67;
         }

         var50 = (byte)(978416111 ^ var67);
         var67 = 162416709 ^ var67;
      }

      byte var3 = var50;
      String var51;
      if (var50 != (872364458 ^ var67)) {
         var67 = 462992774 ^ var67;
         String var49 = var10.trim();
         var51 = var49.toLowerCase();

         label109:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var67)) {
               case 7225256:
                  break label109;
               case 239646706:
                  var67 ^= 1868149047;
                  break label109;
               case 368176817:
                  break;
               case 1260691217:
               default:
                  throw new IllegalStateException();
            }
         }
      } else {
         var67 = 265330975 ^ var67;
         var51 = nncilsnhig(jgbalcjqyvylnqs(), wdhqinctnounira(), var67);
         var67 = 2064754094 ^ var67;
      }

      String var4 = var51;
      ArrayList var15 = new ArrayList();
      ArrayList var5 = var15;
      Iterator var17 = var0.iterator();
      Iterator var6 = var17;
      var67 = 891008953 ^ var67;

      while (true) {
         byte var19 = (byte)((var6.hasNext()) ? 1 : 0);
         if (var19 == (1915062946 ^ var67)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var67)) {
                  case 220778172:
                     var67 = 1782698806 ^ var67;
                     return var5;
                  case 245504454:
                     break;
                  case 1923390656:
                     return var5;
                  case 2061880272:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var67 = 5705256 ^ var67;
         Object var22 = var6.next();
         com.wimpyclient.j.f var23 = (com.wimpyclient.j.f)var22;
         String var25 = var23.name();
         String var52 = nncilsnhig(twfikelhvhzfrfp(), wdhqinctnounira(), var67);
         byte var27 = (byte)((var25.equals(var52)) ? 1 : 0);
         if (var27 == (1920107658 ^ var67)) {
            var67 = 2059144245 ^ var67;
            String var53 = nncilsnhig(bubvclwchlnaybl(), wdhqinctnounira(), var67);
            byte var29 = (byte)((var25.equals(var53)) ? 1 : 0);
            if (var29 == (147753151 ^ var67)) {
               var67 = 2095641469 ^ var67;
               String var54 = nncilsnhig(kneoyqikzsbewoj(), wdhqinctnounira(), var67);
               byte var31 = (byte)((var25.equals(var54)) ? 1 : 0);
               if (var31 == (1948679106 ^ var67)) {
                  var67 = tmbnfwxztnsvmyha(var67, 1266308841);
                  x var32 = com.wimpyclient.i.x.INSTANCE;
                  Map var33 = var32.blockEspBySettingName;
                  Object var34 = var33.get(var25);
                  k var35 = (k)var34;
                  if (var35 == null) {
                     var67 = 1206541881 ^ var67;
                     var67 = tmbnfwxztnsvmyha(var67, 177469872);
                     continue;
                  }

                  label97:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var67)) {
                        case 180529375:
                           var67 ^= 916543822;
                           break label97;
                        case 759397937:
                           break;
                        case 1656740981:
                        default:
                           throw new IllegalStateException();
                        case 1858972103:
                           break label97;
                     }
                  }

                  if (var3 != (167605349 ^ var67)) {
                     var67 = 2128324606 ^ var67;
                     byte var39 = (byte)((k.matchesSearch(var35, var4)) ? 1 : 0);
                     if (var39 != (1999033243 ^ var67)) {
                        var67 = 515697225 ^ var67;
                        boolean var41 = var5.add(var23);

                        label87:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var67)) {
                              case 211466652:
                                 var67 ^= 1229309267;
                              case 881681623:
                                 break label87;
                              case 1164267006:
                              default:
                                 throw new IllegalStateException();
                              case 2051524259:
                           }
                        }
                     } else {
                        var67 = 1475948314 ^ var67;
                     }
                  } else {
                     label80:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var67)) {
                           case 56301694:
                              var67 ^= 689361899;
                           case 1067543794:
                              break label80;
                           case 1218043804:
                           default:
                              throw new IllegalStateException();
                           case 1464918269:
                        }
                     }

                     byte var43 = (byte)((var35.enabled) ? 1 : 0);
                     if (var43 != (552314766 ^ var67)) {
                        var67 = 1864320358 ^ var67;
                        boolean var45 = var5.add(var23);
                        var67 = 1865096809 ^ var67;
                     } else {
                        label73:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var67)) {
                              case 264811592:
                                 var67 ^= 3431183;
                                 break label73;
                              case 977950257:
                              default:
                                 throw new IllegalStateException();
                              case 1360099713:
                                 break label73;
                              case 1980670099:
                           }
                        }
                     }
                  }

                  var67 = tmbnfwxztnsvmyha(var67, 1392145955);
                  continue;
               }

               var67 = 1333535050 ^ var67;
            } else {
               var67 = tmbnfwxztnsvmyha(var67, 865391159);
            }
         } else {
            var67 = tmbnfwxztnsvmyha(var67, 1227415042);
         }

         boolean var47 = var5.add(var23);
         var67 = tmbnfwxztnsvmyha(var67, 1233113130);
      }
   }

   b$b hit(double var1, double var3, v var5, String var6) {
      int var128 = 1067652609 ^ 1272431740 ^ 504965528;
      var128 = 2099996232 ^ var128;
      byte var26 = (byte)((this.contains(var1, var3)) ? 1 : 0);
      if (var26 == (390503853 ^ var128)) {
         var128 = 732145696 ^ var128;
         return b$b.miss();
      } else {
         var128 = tmbnfwxztnsvmyha(var128, 1465248865);
         byte var29 = (byte)((this.headerContains(var1, var3)) ? 1 : 0);
         if (var29 != (1075016140 ^ var128)) {
            var128 = 1090171471 ^ var128;
            w var31 = this.category;
            return b$b.header(var31);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var128)) {
                  case 203811944:
                     var128 ^= 694008440;
                  case 723784771:
                     com.wimpyclient.l.a var34 = this.expandAnim;
                     float var35 = var34.get();
                     float var95 = 0.05F;
                     float var150;
                     int var36 = (var150 = var35 - var95) == 0.0F ? 0 : (var150 < 0.0F ? -1 : 1);
                     if (var36 < (1766771636 ^ var128)) {
                        var128 = 355067383 ^ var128;
                        return b$b.miss();
                     }

                     var128 = 856680084 ^ var128;
                     int var39 = this.x;
                     int var96 = e.PAD;
                     int var40 = var39 + var96;
                     int var17 = var40;
                     int var42 = this.contentWidth();
                     int var18 = var42;
                     int var44 = this.contentTop();
                     int var46 = this.contentBottom();
                     double var107 = var44;
                     double var151;
                     int var49 = (var151 = var3 - var107) == 0.0 ? 0 : (var151 < 0.0 ? -1 : 1);
                     if (var49 < (1514220832 ^ var128)) {
                        var128 = tmbnfwxztnsvmyha(var128, 149071935);
                        return b$b.miss();
                     }

                     var128 = 1256838775 ^ var128;
                     double var110 = var46;
                     double var152;
                     int var52 = (var152 = var3 - var110) == 0.0 ? 0 : (var152 < 0.0 ? -1 : 1);
                     if (var52 >= (279509847 ^ var128)) {
                        var128 = 1108049480 ^ var128;
                        return b$b.miss();
                     }

                     var128 = tmbnfwxztnsvmyha(var128, 1002740090);
                     int var98 = this.scroll;
                     int var55 = var44 - var98;
                     int var21 = var55;
                     List var57 = this.modules(var6);
                     Iterator var58 = var57.iterator();
                     Iterator var22 = var58;
                     var128 = 1168119606 ^ var128;

                     label81:
                     while (true) {
                        byte var60 = (byte)((var22.hasNext()) ? 1 : 0);
                        if (var60 == (1858893083 ^ var128)) {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var128)) {
                                 case 111954984:
                                    var128 = 1829424281 ^ var128;
                                    return b$b.miss();
                                 case 433677993:
                                    return b$b.miss();
                                 case 1562601010:
                                 default:
                                    throw new IllegalStateException();
                                 case 1783146612:
                              }
                           }
                        }

                        var128 = 1875963696 ^ var128;
                        Object var62 = var22.next();
                        v var63 = (v)var62;
                        int var100 = e.ROW_H;
                        int var65 = var21 + var100;
                        double var113 = var21;
                        double var153;
                        int var68 = (var153 = var3 - var113) == 0.0 ? 0 : (var153 < 0.0 ? -1 : 1);
                        if (var68 >= (18651691 ^ var128)) {
                           var128 = 1895081471 ^ var128;
                           double var116 = var65;
                           double var154;
                           int var71 = (var154 = var3 - var116) == 0.0 ? 0 : (var154 < 0.0 ? -1 : 1);
                           if (var71 < (1911046100 ^ var128)) {
                              var128 = 443896369 ^ var128;
                              int var73 = e.toggleX(var17, var18);
                              byte var102 = (byte)(1805479393 ^ var128);
                              int var74 = var73 - var102;
                              double var119 = var74;
                              double var155;
                              int var77 = (var155 = var1 - var119) == 0.0 ? 0 : (var155 < 0.0 ? -1 : 1);
                              if (var77 >= (1805479397 ^ var128)) {
                                 var128 = 1581789651 ^ var128;
                                 return b$b.moduleToggle(var63);
                              }

                              var128 = 558650387 ^ var128;
                              return b$b.moduleOpen(var63);
                           }

                           var128 = 2000884203 ^ var128;
                        } else {
                           var128 = 129479700 ^ var128;
                        }

                        var21 = var65;
                        if (var63 != var5) {
                           var128 = 1064064873 ^ var128;
                           var128 = tmbnfwxztnsvmyha(var128, 1460341837);
                        } else {
                           var128 = 652614691 ^ var128;
                           b$b var86 = hitSettings(var1, var3, var17, var65, var18, var63);
                           b$c var88 = var86.type;
                           b$c var104 = b$c.NONE;
                           if (var88 != var104) {
                              var128 = 138083574 ^ var128;
                              return var86;
                           }

                           var128 = 135515888 ^ var128;
                           int var106 = settingsHeight(var63);
                           int var90 = var65 + var106;
                           var21 = var90;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var128)) {
                                 case 238559831:
                                    var128 ^= 1184008695;
                                 case 998414918:
                                    continue label81;
                                 case 1176318828:
                                    break;
                                 case 1492442110:
                                 default:
                                    throw new IllegalStateException();
                              }
                           }
                        }
                     }
                  case 457081216:
                  default:
                     throw new IllegalStateException();
                  case 1570772201:
               }
            }
         }
      }
   }

   private static b$b hitSettings(double var0, double var2, int var4, int var5, int var6, v var7) {
      int var268 = 933203836 ^ 1533495733 ^ 416124095;
      var268 = 423732863 ^ var268;
      byte var14 = (byte)(1836379147 ^ var268);
      int var200 = var4 + var14;
      int var15 = e.LABEL_GAP;
      int var213 = var5 + var15;
      byte var16 = (byte)(1836379147 ^ var268);
      int var228 = var6 - var16;
      int var241 = e.BTN_H;
      byte var28 = (byte)((inside(var0, var2, var200, var213, var228, var241)) ? 1 : 0);
      if (var28 != (1836379145 ^ var268)) {
         var268 = 1883555465 ^ var268;
         return b$b.keybind(var7);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var268)) {
               case 68346917:
                  var268 ^= 501059812;
               case 982645711:
                  int var9 = e.SETTING_H;
                  int var30 = var5 + var9;
                  int var254 = var30;
                  List var32 = visibleSettings(var7);
                  Iterator var33 = var32.iterator();
                  Iterator var20 = var33;
                  var268 = 1042272393 ^ var268;

                  label151:
                  while (true) {
                     byte var35 = (byte)((var20.hasNext()) ? 1 : 0);
                     if (var35 == (1320594532 ^ var268)) {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var268)) {
                              case 31570605:
                                 return b$b.miss();
                              case 142713015:
                                 var268 = 460101155 ^ var268;
                                 return b$b.miss();
                              case 795895680:
                                 break;
                              case 2104194405:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     }

                     var268 = 893770757 ^ var268;
                     Object var37 = var20.next();
                     com.wimpyclient.j.f var38 = (com.wimpyclient.j.f)var37;
                     byte var40 = (byte)((var38 instanceof com.wimpyclient.j.a) ? 1 : 0);
                     if (var40 != (2079551585 ^ var268)) {
                        var268 = 1910044577 ^ var268;
                        com.wimpyclient.j.a var42 = (com.wimpyclient.j.a)var38;
                        int var242 = e.ROW_H;
                        byte var45 = (byte)((inside(var0, var2, var4, var254, var6, var242)) ? 1 : 0);
                        if (var45 != (170624960 ^ var268)) {
                           var268 = 1011913561 ^ var268;
                           return b$b.bool(var42);
                        }

                        var268 = 283881539 ^ var268;
                        int var145 = e.ROW_H;
                        int var49 = var254 + var145;
                        var254 = var49;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var268)) {
                              case 64254285:
                                 var268 ^= 1417059303;
                                 continue label151;
                              case 318718313:
                                 break;
                              case 1621753847:
                                 continue label151;
                              case 1653730351:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     } else {
                        var268 = tmbnfwxztnsvmyha(var268, 1576721978);
                        byte var51 = (byte)((var38 instanceof com.wimpyclient.j.d) ? 1 : 0);
                        if (var51 != (638168667 ^ var268)) {
                           var268 = 1438182764 ^ var268;
                           com.wimpyclient.j.d var128 = (com.wimpyclient.j.d)var38;
                           int var168 = e.LABEL_GAP;
                           int var130 = var254 + var168;
                           byte var169 = (byte)(1940996917 ^ var268);
                           int var132 = var4 + var169;
                           byte var133 = (byte)(1940996927 ^ var268);
                           byte var196 = (byte)(1940996915 ^ var268);
                           int var171 = var6 - var196;
                           int var134 = Math.max(var133, var171);
                           int var252 = e.BTN_H;
                           byte var137 = (byte)((inside(var0, var2, var132, var130, var134, var252)) ? 1 : 0);
                           if (var137 != (1940996919 ^ var268)) {
                              var268 = 1249754219 ^ var268;
                              return b$b.intSlider(var128, var132, var134);
                           }

                           label100:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var268)) {
                                 case 2556299:
                                    var268 ^= 2020035246;
                                    break label100;
                                 case 24577687:
                                 default:
                                    throw new RuntimeException();
                                 case 768728239:
                                    break label100;
                                 case 1605708530:
                              }
                           }

                           int var172 = e.SETTING_H;
                           int var139 = var254 + var172;
                           var254 = var139;
                           var268 = tmbnfwxztnsvmyha(var268, 1163961853);
                        } else {
                           var268 = tmbnfwxztnsvmyha(var268, 262908469);
                           byte var53 = (byte)((var38 instanceof com.wimpyclient.j.c) ? 1 : 0);
                           if (var53 != (698483822 ^ var268)) {
                              var268 = 1429464683 ^ var268;
                              com.wimpyclient.j.c var113 = (com.wimpyclient.j.c)var38;
                              int var162 = e.LABEL_GAP;
                              int var115 = var254 + var162;
                              byte var163 = (byte)(2089935367 ^ var268);
                              int var117 = var4 + var163;
                              byte var118 = (byte)(2089935373 ^ var268);
                              byte var192 = (byte)(2089935361 ^ var268);
                              int var165 = var6 - var192;
                              int var119 = Math.max(var118, var165);
                              int var251 = e.BTN_H;
                              byte var122 = (byte)((inside(var0, var2, var117, var115, var119, var251)) ? 1 : 0);
                              if (var122 != (2089935365 ^ var268)) {
                                 var268 = 592309705 ^ var268;
                                 return b$b.doubleSlider(var113, var117, var119);
                              }

                              var268 = 1089911747 ^ var268;
                              int var167 = e.SETTING_H;
                              int var126 = var254 + var167;
                              var254 = var126;
                              var268 = 1926362530 ^ var268;
                           } else {
                              label135:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var268)) {
                                    case 11125047:
                                       var268 ^= 61364940;
                                    case 93111296:
                                       break label135;
                                    case 182285460:
                                    default:
                                       throw new RuntimeException();
                                    case 1852830881:
                                 }
                              }

                              byte var55 = (byte)((var38 instanceof com.wimpyclient.j.g) ? 1 : 0);
                              if (var55 != (705322658 ^ var268)) {
                                 var268 = 150038609 ^ var268;
                                 com.wimpyclient.j.g var57 = (com.wimpyclient.j.g)var38;
                                 byte var215 = (byte)(586888945 ^ var268);
                                 int var203 = var4 + var215;
                                 int var230 = e.LABEL_GAP;
                                 int var217 = var254 + var230;
                                 byte var243 = (byte)(586888945 ^ var268);
                                 int var232 = var6 - var243;
                                 int var244 = e.BTN_H;
                                 byte var60 = (byte)((inside(var0, var2, var203, var217, var232, var244)) ? 1 : 0);
                                 if (var60 != (586888947 ^ var268)) {
                                    var268 = 997959642 ^ var268;
                                    return b$b.stringEdit(var57);
                                 }

                                 var268 = 333635381 ^ var268;
                                 int var146 = e.SETTING_H;
                                 int var64 = var254 + var146;
                                 var254 = var64;
                                 var268 = tmbnfwxztnsvmyha(var268, 2142193058);
                              } else {
                                 var268 = tmbnfwxztnsvmyha(var268, 1905785248);
                                 byte var66 = (byte)((var38 instanceof com.wimpyclient.j.e) ? 1 : 0);
                                 if (var66 != (1537058562 ^ var268)) {
                                    var268 = 2115805813 ^ var268;
                                    com.wimpyclient.j.e var104 = (com.wimpyclient.j.e)var38;
                                    byte var222 = (byte)(629212533 ^ var268);
                                    int var209 = var4 + var222;
                                    int var236 = e.LABEL_GAP;
                                    int var224 = var254 + var236;
                                    byte var249 = (byte)(629212533 ^ var268);
                                    int var238 = var6 - var249;
                                    int var250 = e.BTN_H;
                                    byte var107 = (byte)((inside(var0, var2, var209, var224, var238, var250)) ? 1 : 0);
                                    if (var107 != (629212535 ^ var268)) {
                                       var268 = 136290625 ^ var268;
                                       return b$b.mode(var104);
                                    }

                                    var268 = tmbnfwxztnsvmyha(var268, 158831703);
                                    int var161 = e.SETTING_H;
                                    int var109 = var254 + var161;
                                    var254 = var109;
                                    var268 = tmbnfwxztnsvmyha(var268, 1648377156);
                                 } else {
                                    var268 = 1153436380 ^ var268;
                                    byte var68 = (byte)((var38 instanceof com.wimpyclient.j.b) ? 1 : 0);
                                    if (var68 == (526233054 ^ var268)) {
                                       var268 = tmbnfwxztnsvmyha(var268, 211698634);
                                       int var160 = e.ROW_H;
                                       int var102 = var254 + var160;
                                       var254 = var102;
                                       var268 = 1567965808 ^ var268;
                                    } else {
                                       var268 = 27549876 ^ var268;
                                       com.wimpyclient.j.b var70 = (com.wimpyclient.j.b)var38;
                                       int var245 = e.ROW_H;
                                       byte var73 = (byte)((inside(var0, var2, var4, var254, var6, var245)) ? 1 : 0);
                                       if (var73 != (519687530 ^ var268)) {
                                          var268 = 472320096 ^ var268;
                                          return b$b.colorToggle(var70);
                                       }

                                       label127:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var268)) {
                                             case 201581316:
                                                var268 ^= 380373458;
                                                break label127;
                                             case 321779995:
                                                break;
                                             case 384367040:
                                                break label127;
                                             case 1611686891:
                                             default:
                                                throw new RuntimeException();
                                          }
                                       }

                                       int var147 = e.ROW_H;
                                       int var77 = var254 + var147;
                                       var254 = var77;
                                       byte var79 = (byte)((var70.isPickerOpen()) ? 1 : 0);
                                       if (var79 == (139838648 ^ var268)) {
                                          var268 = tmbnfwxztnsvmyha(var268, 1189308636);
                                       } else {
                                          var268 = 506216274 ^ var268;
                                          byte var148 = (byte)(377093096 ^ var268);
                                          int var81 = var4 + var148;
                                          byte var180 = (byte)(377093096 ^ var268);
                                          int var150 = var6 - var180;
                                          byte var181 = (byte)(377093096 ^ var268);
                                          int var151 = var150 / var181;
                                          int var82 = var81 + var151;
                                          int var152 = e.WHEEL_R;
                                          int var84 = var77 + var152;
                                          byte var153 = (byte)(377093096 ^ var268);
                                          int var85 = var84 + var153;
                                          int var154 = e.COLOR_PICKER_H;
                                          int var87 = var77 + var154;
                                          int var155 = e.FIELD_H;
                                          int var88 = var87 - var155;
                                          byte var91 = (byte)((insideWheel(var0, var2, var82, var85)) ? 1 : 0);
                                          if (var91 != (377093098 ^ var268)) {
                                             var268 = 913363249 ^ var268;
                                             return b$b.colorWheel(var70, var82, var85);
                                          }

                                          label119:
                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var268)) {
                                                case 193744492:
                                                   var268 ^= 1091749142;
                                                   break label119;
                                                case 731932354:
                                                default:
                                                   throw new RuntimeException();
                                                case 1104563625:
                                                   break;
                                                case 1142224519:
                                                   break label119;
                                             }
                                          }

                                          byte var220 = (byte)(1466646270 ^ var268);
                                          int var207 = var4 + var220;
                                          byte var246 = (byte)(1466646270 ^ var268);
                                          int var235 = var6 - var246;
                                          byte var247 = (byte)(1466646266 ^ var268);
                                          int var17 = e.FIELD_H;
                                          byte var18 = (byte)(1466646264 ^ var268);
                                          int var253 = var17 - var18;
                                          int var248 = Math.max(var247, var253);
                                          byte var96 = (byte)((inside(var0, var2, var207, var88, var235, var248)) ? 1 : 0);
                                          if (var96 != (1466646268 ^ var268)) {
                                             var268 = 988113047 ^ var268;
                                             byte var187 = (byte)(1838044777 ^ var268);
                                             int var158 = var4 + var187;
                                             byte var12 = (byte)(1838044777 ^ var268);
                                             int var189 = var6 - var12;
                                             return b$b.colorValue(var70, var158, var189);
                                          }

                                          label111:
                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var268)) {
                                                case 66470308:
                                                   break label111;
                                                case 157261155:
                                                   var268 ^= 1710268687;
                                                   break label111;
                                                case 1364493017:
                                                   break;
                                                case 1549767420:
                                                default:
                                                   throw new RuntimeException();
                                             }
                                          }

                                          int var159 = e.COLOR_PICKER_H;
                                          int var100 = var77 + var159;
                                          var254 = var100;
                                          var268 = 2083337111 ^ var268;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               case 207403621:
                  break;
               case 418566412:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private static boolean inside(double var0, double var2, int var4, int var5, int var6, int var7) {
      int var39 = 182777321 ^ 2080313209 ^ 416124095;
      var39 = 1920634754 ^ var39;
      double var23 = var4;
      double var48;
      int var12 = (var48 = var0 - var23) == 0.0 ? 0 : (var48 < 0.0 ? -1 : 1);
      if (var12 >= (464320941 ^ var39)) {
         var39 = 574176511 ^ var39;
         int var26 = var4 + var6;
         double var27 = var26;
         double var49;
         int var15 = (var49 = var0 - var27) == 0.0 ? 0 : (var49 < 0.0 ? -1 : 1);
         if (var15 < (966116690 ^ var39)) {
            var39 = 1454049356 ^ var39;
            double var30 = var5;
            double var50;
            int var18 = (var50 = var2 - var30) == 0.0 ? 0 : (var50 < 0.0 ? -1 : 1);
            if (var18 >= (1866386718 ^ var39)) {
               var39 = 1821232288 ^ var39;
               int var33 = var5 + var7;
               double var34 = var33;
               double var51;
               int var21 = (var51 = var2 - var34) == 0.0 ? 0 : (var51 < 0.0 ? -1 : 1);
               if (var21 < (62063038 ^ var39)) {
                  var39 = 622770346 ^ var39;
                  byte var22 = (byte)(648919317 ^ var39);
                  var39 = 1647122312 ^ var39;
                  return (var22 != 0);
               }

               var39 = 240007449 ^ var39;
            } else {
               var39 = tmbnfwxztnsvmyha(var39, 1657009593);
            }
         } else {
            var39 = 879295989 ^ var39;
         }
      } else {
         var39 = tmbnfwxztnsvmyha(var39, 374456586);
      }

      byte var52 = (byte)(234698919 ^ var39);
      var39 = 1232967227 ^ var39;
      return (var52 != 0);
   }

   private static boolean insideWheel(double var0, double var2, int var4, int var5) {
      int var53 = 548642648 ^ 2103228064 ^ 416124095;
      var53 = 1855162801 ^ var53;
      double var33 = var4;
      double var17 = var0 - var33;
      double var36 = var5;
      double var21 = var2 - var36;
      int var23 = e.WHEEL_R;
      byte var8 = (byte)(733031668 ^ var53);
      int var24 = var23 + var8;
      double var27 = var17 * var17;
      double var42 = var21 * var21;
      double var29 = var27 + var42;
      double var45 = var24;
      double var50 = var24;
      double var47 = var45 * var50;
      double var59;
      int var31 = (var59 = var29 - var47) == 0.0 ? 0 : (var59 < 0.0 ? -1 : 1);
      if (var31 > (733031670 ^ var53)) {
         var53 = 1201813598 ^ var53;
         byte var60 = (byte)(1813189800 ^ var53);
         var53 = 191771106 ^ var53;
         return (var60 != 0);
      } else {
         var53 = 1876840162 ^ var53;
         byte var32 = (byte)(1148150293 ^ var53);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
               case 77040233:
                  var53 = 588400478 ^ var53;
                  return (var32 != 0);
               case 227138184:
                  break;
               case 234556948:
               default:
                  throw new IllegalStateException();
               case 352826933:
                  return (var32 != 0);
            }
         }
      }
   }

   static {
      int var3 = new Random(-1505072407820926387L).nextInt();
      CCzCTC4dbB = 2012245313 ^ var3;
   }

   public static String nncilsnhig(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] wdhqinctnounira() {
      return new byte[]{123, 12, 103, 81, 17, 35, 45, 1, 46, 107, 126, 98, 21, 104, 66, 47, 15, 108, 83, 116, 88, 63, 15, 110, 81, 49, 49, 6};
   }

   private static byte[] mzdciadyavrsvel() {
      return new byte[]{-76, -59, 80, 4, 36, 117, 21, 67, 30, 48, 79, 32, 34, 33, 119, 72, 55, 63, 99, 53, 105, 121};
   }

   private static byte[] dtzwvgmxjnyrkmq() {
      return new byte[]{-77, -64, 95, 20, 36, 121, 26, 83, 30, 48, 77, 63};
   }

   private static byte[] rhdrwbucmwxwuix() {
      return new byte[]{-77, -62, 87, 3, 39, 119, 25, 89, 23, 62, 79, 57, 37, 1, 122, 126, 56, 38, 101, 53};
   }

   private static byte[] iimmeabyojbkovy() {
      return new byte[]{-76, -53, 95, 33, 37, 102, 28, 66, 23, 38, 79, 53, 45, 54};
   }

   private static byte[] vyakxvfzyvjidmb() {
      return new byte[]{-77, -63, 82, 38, 33, 97, 27, 71, 31, 41, 76, 56, 33, 53, 117, 57, 58, 28, 101, 37, 109, 104, 63, 60, 103, 106, 0, 68};
   }

   private static byte[] cwosfwfowsrfvss() {
      return new byte[]{-79, -54, 81, 38, 40, 121, 20, 93, 22, 48, 71, 38};
   }

   private static byte[] xjnjunpsaontxai() {
      return new byte[]{-76, -58, 95, 51, 39, 117, 26, 82, 29, 40, 75, 57, 36, 54};
   }

   private static byte[] mymlqfpizyholwx() {
      return new byte[0];
   }

   private static byte[] nrkzourlyzdsrou() {
      return new byte[]{-76, -53, 84, 45, 39, 71, 27, 105, 28, 125, 79, 21, 38, 33, 116, 121, 57, 55, 97, 43, 105, 115, 60, 46, 103, 38, 7, 27};
   }

   private static byte[] sfonkjcipcjzqes() {
      return new byte[]{-76, -61, 82, 49, 40, 102, 30, 80, 22, 57, 78, 50, 33, 35, 117, 111};
   }

   private static byte[] jgbalcjqyvylnqs() {
      return new byte[0];
   }

   private static byte[] kneoyqikzsbewoj() {
      return new byte[]{-76, -54, 83, 61, 39, 102, 20, 81, 30, 62, 79, 62, 33, 34, 116, 107};
   }

   private static byte[] bubvclwchlnaybl() {
      return new byte[]{-76, -57, 80, 35, 36, 67, 28, 100, 31, 122, 74, 26, 34, 45, 113, 127, 58, 62, 98, 41, 111, 124, 58, 36, 96, 36, 0, 18};
   }

   private static byte[] twfikelhvhzfrfp() {
      return new byte[]{-76, -54, 85, 50, 32, 118, 26, 86, 27, 33, 79, 56, 39, 48};
   }

   private static byte[] nleueevsvvgergr() {
      return new byte[0];
   }

   private static byte[] zzzciirgvyuagzp() {
      return new byte[]{-78, -61, 86, 78};
   }

   private static byte[] uosvogonfttgbyt() {
      return new byte[0];
   }

   private static byte[] jlyxybqodchvlwi() {
      return new byte[]{-77, -63, 94, 76};
   }

   private static byte[] acvqdrihycicvoy() {
      return new byte[]{-74, -59, 84, 76};
   }

   private static byte[] yandhivqnmlltmu() {
      return new byte[]{-73, -62, 87, 76};
   }

   private static byte[] jnmlucmxxllglcr() {
      return new byte[]{-76, -57, 85, 41, 40, 93, 30, 18, 30, 9, 79, 19, 39, 10, 123, 74, 60, 22, 99, 11, 105, 76, 61, 11};
   }

   private static byte[] puomwkvyhpstlvw() {
      return new byte[]{
         -68,
         -58,
         80,
         33,
         34,
         126,
         24,
         90,
         22,
         49,
         75,
         62,
         38,
         119,
         115,
         58,
         61,
         32,
         106,
         41,
         111,
         105,
         60,
         49,
         100,
         35,
         9,
         79,
         78,
         73,
         84,
         7,
         32,
         101,
         31,
         74,
         23,
         126,
         73,
         48,
         38,
         121,
         119,
         118,
         55,
         48,
         102,
         58,
         107,
         34,
         62,
         123,
         99,
         76,
         8,
         64,
         76,
         92,
         84,
         64,
         36,
         114,
         21,
         84,
         27,
         57,
         77,
         48,
         36,
         47,
         112,
         100,
         54,
         119
      };
   }

   private static byte[] dtzbqjawikmzogg() {
      return new byte[]{-68, -58, 80, 41, 34, 119, 24, 74, 22, 48, 75, 60, 38, 53, 115, 126};
   }

   private static byte[] xvjvzbwnkszbhxr() {
      return new byte[]{-76, -58, 81, 74, 41, 52, 31, 30};
   }

   private static byte[] gthkvrpxbnzgxxa() {
      return new byte[]{-76, -57, 86, 29};
   }

   private static byte[] goobfefhzuidmyi() {
      return new byte[0];
   }

   private static byte[] bzqqxjvmkaqmbbl() {
      return new byte[]{-78, -60, 85, 79, 39, 56, 30, 25};
   }

   private static byte[] jjcicgaqitwcimo() {
      return new byte[0];
   }

   private static byte[] yocdyrdtlxaelnk() {
      return new byte[]{-78, -54, 114, 115};
   }

   private static byte[] nyxodfbtqffasxd() {
      return new byte[]{-76, -58, 87, 67};
   }

   private static byte[] yfhdbdavzggidym() {
      return new byte[]{-76, -53, 82, 46, 38, 91, 28, 20, 31, 0, 79, 31, 32, 13, 117, 76, 62, 16, 98, 2, 105, 64, 58, 12};
   }

   private static byte[] cdltxkbpxstneiq() {
      return new byte[]{
         -68,
         -54,
         86,
         32,
         38,
         118,
         30,
         91,
         29,
         49,
         71,
         56,
         39,
         115,
         123,
         60,
         60,
         43,
         106,
         37,
         105,
         104,
         56,
         57,
         98,
         34,
         2,
         79,
         66,
         79,
         85,
         3,
         40,
         99,
         30,
         65,
         23,
         114,
         79,
         49,
         34,
         113,
         113,
         119,
         60,
         48,
         106,
         60,
         106,
         38,
         54,
         125,
         98,
         71,
         8,
         76,
         74,
         93,
         80,
         72,
         34,
         115,
         30,
         84,
         23,
         63,
         76,
         52,
         44,
         41,
         113,
         111,
         54,
         123
      };
   }

   private static byte[] swvrlgegfdjybik() {
      return new byte[]{-68, -54, 86, 40, 38, 127, 30, 75, 29, 48, 71, 58, 39, 49, 123, 120};
   }

   private static byte[] irkhiasnigzwdjy() {
      return new byte[]{-76, -53, 83, 75, 32, 58, 28, 22};
   }

   private static byte[] gfrtftyprshahuk() {
      return new byte[0];
   }

   private static byte[] eandrnjpinqltnr() {
      return new byte[]{-76, -60, 86, 25};
   }

   private static byte[] fsbcbhgoupghwbl() {
      return new byte[]{-76, -64, 86, 74, 33, 57, 27, 27};
   }

   private static int tmbnfwxztnsvmyha(int var0, int var1) {
      return var1 ^ var0;
   }
}
