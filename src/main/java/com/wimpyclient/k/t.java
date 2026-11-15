package com.wimpyclient.k;

import com.mojang.blaze3d.platform.Window;
import com.wimpyclient.i.aj;
import com.wimpyclient.i.aj$b;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3fc;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class t {
   private static int t9tYjjWSSf;
   private transient int NWB1iaU6R2;
   private static byte[] fdsqicipve = ofmwejiksxitsjm();

   private t() {
super();
      int var4 = 339698137 ^ 1849193721;
      
      var4 = vfnpeeizaqgzmxgl(var4, 69616855);
      var4 = 1750845458 ^ 102424887 ^ Integer.parseInt("274757842");
      this.NWB1iaU6R2 = 1580783561 ^ t9tYjjWSSf;
      var4 = 1875356140 ^ var4;
   }

   public static void render(GuiGraphics var0) {
      int var149 = 685335366 ^ 765578669 ^ 1275499352;
      var149 = 1913636149 ^ var149;
      com.wimpyclient.i.x var1 = com.wimpyclient.i.x.INSTANCE;
      com.wimpyclient.i.v var38 = var1.schematicBuilder;
      byte var39 = (byte)((var38.qo()) ? 1 : 0);
      if (var39 != (997324934 ^ var149)) {
         var149 = 778178906 ^ var149;
         byte var41 = (byte)((var1.schematicBuilderDebug) ? 1 : 0);
         if (var41 != (353626588 ^ var149)) {
            var149 = 1991142664 ^ var149;
            aj var42 = aj.INSTANCE;
            List var43 = var42.debugMarks();
            byte var45 = (byte)((var43.isEmpty()) ? 1 : 0);
            if (var45 != (1673364692 ^ var149)) {
               var149 = 1833779924 ^ var149;
               return;
            }

            var149 = 76515605 ^ var149;
            Minecraft var46 = Minecraft.getInstance();
            Minecraft var16 = var46;
            ClientLevel var48 = var46.level;
            if (var48 != null) {
               var149 = 705648253 ^ var149;
               LocalPlayer var50 = var46.player;
               if (var50 != null) {
                  var149 = 15126236 ^ var149;
                  GameRenderer var52 = var46.gameRenderer;
                  if (var52 != null) {
                     var149 = vfnpeeizaqgzmxgl(var149, 1050548838);
                     GameRenderer var54 = var46.gameRenderer;
                     Camera var55 = var54.getMainCamera();
                     Vec3 var57 = var55.position();
                     Vec3 var18 = var57;
                     Vector3fc var59 = var55.forwardVector();
                     Vector3fc var19 = var59;
                     Window var61 = var46.getWindow();
                     int var62 = var61.getGuiScaledWidth();
                     int var20 = var62;
                     Window var64 = var46.getWindow();
                     int var65 = var64.getGuiScaledHeight();
                     int var21 = var65;
                     Font var67 = var46.font;
                     Font var22 = var67;
                     Iterator var69 = var43.iterator();
                     Iterator var23 = var69;
                     var149 = 635041038 ^ var149;

                     while (true) {
                        byte var71 = (byte)((var23.hasNext()) ? 1 : 0);
                        if (var71 == (1453095432 ^ var149)) {
                           var149 = 686131330 ^ var149;
                           return;
                        }

                        var149 = 322044860 ^ var149;
                        Object var73 = var23.next();
                        aj$b var74 = (aj$b)var73;
                        BlockPos var76 = var74.pos();
                        int var78 = var76.getX();
                        double var79 = var78;
                        double var3 = 0.5;
                        double var81 = var79 + var3;
                        int var84 = var76.getY();
                        double var85 = var84;
                        double var121 = 1.15;
                        double var87 = var85 + var121;
                        int var90 = var76.getZ();
                        double var91 = var90;
                        double var123 = 0.5;
                        double var93 = var91 + var123;
                        float[] var96 = project(var16, var18, var19, var20, var21, var81, var87, var93);
                        if (var96 == null) {
                           var149 = 949338955 ^ var149;
                           var149 = 732414199 ^ var149;
                        } else {
                           var149 = vfnpeeizaqgzmxgl(var149, 208660312);
                           String var99 = var74.tag();
                           int var101 = var22.width(var99);
                           byte var113 = (byte)(1237425900 ^ var149);
                           float var103 = var96[var113];
                           int var104 = Math.round(var103);
                           byte var126 = (byte)(1237425902 ^ var149);
                           int var115 = var101 / var126;
                           int var105 = var104 - var115;
                           byte var116 = (byte)(1237425901 ^ var149);
                           float var107 = var96[var116];
                           int var108 = Math.round(var107);
                           byte var117 = (byte)(1237425897 ^ var149);
                           int var109 = var108 - var117;
                           byte var127 = (byte)(1237425902 ^ var149);
                           int var119 = var105 - var127;
                           byte var131 = (byte)(1237425901 ^ var149);
                           int var129 = var109 - var131;
                           int var133 = var105 + var101;
                           byte var137 = (byte)(1237425902 ^ var149);
                           int var134 = var133 + var137;
                           byte var141 = (byte)(1237425893 ^ var149);
                           int var139 = var109 + var141;
                           int var142 = -473850132 ^ var149;
                           var0.fill(var119, var129, var134, var139, var142);
                           int var144 = var74.argb();
                           int var9 = -1228824852 ^ var149;
                           int var145 = var144 | var9;
                           byte var146 = (byte)(1237425900 ^ var149);
                           var0.drawString(var22, var99, var105, var109, var145, (var146 != 0));
                           var149 = vfnpeeizaqgzmxgl(var149, 526247140);
                        }
                     }
                  }

                  var149 = 1883925356 ^ var149;
               } else {
                  var149 = vfnpeeizaqgzmxgl(var149, 1890362800);
               }
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var149)) {
                     case 41542016:
                        break;
                     case 133209495:
                        var149 = 1520694221 ^ var149;
                        return;
                     case 743632856:
                        return;
                     case 1866141281:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }

            return;
         }

         var149 = 1209174359 ^ var149;
      } else {
         var149 = 1718654989 ^ var149;
      }
   }

   private static float[] project(Minecraft var0, Vec3 var1, Vector3fc var2, int var3, int var4, double var5, double var7, double var9) {
      int var156 = 826257920 ^ 703963173 ^ 1275499352;
      var156 = 1727942057 ^ var156;
      double var101 = var1.x;
      double var31 = var5 - var101;
      double var104 = var1.y;
      double var35 = var7 - var104;
      double var107 = var1.z;
      double var39 = var9 - var107;
      float var110 = var2.x();
      double var111 = var110;
      double var43 = var31 * var111;
      float var148 = var2.y();
      double var149 = var148;
      double var115 = var35 * var149;
      double var45 = var43 + var115;
      float var152 = var2.z();
      double var153 = var152;
      double var119 = var39 * var153;
      double var47 = var45 + var119;
      double var121 = 0.05;
      double var172;
      int var49 = (var172 = var47 - var121) == 0.0 ? 0 : (var172 < 0.0 ? -1 : 1);
      if (var49 <= (842190036 ^ var156)) {
         var156 = 1360864287 ^ var156;
         return null;
      } else {
         var156 = 540703856 ^ var156;
         GameRenderer var52 = var0.gameRenderer;
         Vec3 var13 = new Vec3(var5, var7, var9);
         Vec3 var53 = var52.projectPointToScreen(var13);
         double var55 = var53.z;
         double var123 = 1.0;
         double var173;
         int var57 = (var173 = var55 - var123) == 0.0 ? 0 : (var173 < 0.0 ? -1 : 1);
         if (var57 <= (302559396 ^ var156)) {
            var156 = 585600178 ^ var156;
            double var59 = var53.z;
            double var125 = -1.0;
            double var174;
            int var61 = (var174 = var59 - var125) == 0.0 ? 0 : (var174 < 0.0 ? -1 : 1);
            if (var61 < (820984854 ^ var156)) {
               var156 = 1500192860 ^ var156;
               return null;
            }

            var156 = 324050478 ^ var156;
            double var63 = var53.x;
            double var127 = 1.0;
            double var65 = var63 + var127;
            double var129 = 0.5;
            double var67 = var65 * var129;
            double var132 = var3;
            double var69 = var67 * var132;
            float var71 = (float)var69;
            double var72 = 1.0;
            double var135 = var53.y;
            double var74 = var72 - var135;
            double var137 = 0.5;
            double var76 = var74 * var137;
            double var140 = var4;
            double var78 = var76 * var140;
            float var80 = (float)var78;
            float var93 = -80.0F;
            float var175;
            int var82 = (var175 = var71 - var93) == 0.0F ? 0 : (var175 < 0.0F ? -1 : 1);
            if (var82 < (599761464 ^ var156)) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var156)) {
                     case 88304115:
                        var156 = 1091972879 ^ var156;
                        return null;
                     case 353789687:
                        break;
                     case 745906193:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1537794502:
                        return null;
                  }
               }
            }

            var156 = 1736611524 ^ var156;
            float var94 = -80.0F;
            float var176;
            int var84 = (var176 = var80 - var94) == 0.0F ? 0 : (var176 < 0.0F ? -1 : 1);
            if (var84 >= (1144861948 ^ var156)) {
               var156 = 70376847 ^ var156;
               byte var142 = (byte)(1074587939 ^ var156);
               int var96 = var3 + var142;
               float var97 = var96;
               float var177;
               int var86 = (var177 = var71 - var97) == 0.0F ? 0 : (var177 < 0.0F ? -1 : 1);
               if (var86 <= (1074588019 ^ var156)) {
                  var156 = 224378668 ^ var156;
                  byte var143 = (byte)(1297307151 ^ var156);
                  int var99 = var4 + var143;
                  float var100 = var99;
                  float var178;
                  int var88 = (var178 = var80 - var100) == 0.0F ? 0 : (var178 < 0.0F ? -1 : 1);
                  if (var88 <= (1297307231 ^ var156)) {
                     var156 = 1702682433 ^ var156;
                     byte var89 = (byte)(674203932 ^ var156);
                     float[] var90 = new float[var89];
                     byte var144 = (byte)(674203934 ^ var156);
                     var90[var144] = var71;
                     byte var145 = (byte)(674203935 ^ var156);
                     var90[var145] = var80;
                     return var90;
                  }

                  var156 = 804969320 ^ var156;
               } else {
                  var156 = vfnpeeizaqgzmxgl(var156, 581264452);
               }
            } else {
               var156 = vfnpeeizaqgzmxgl(var156, 647281099);
               return null;
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var156)) {
                  case 49333301:
                     var156 = 2072816878 ^ var156;
                     return null;
                  case 647225149:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1075606257:
                     return null;
                  case 2129252309:
               }
            }
         }

         return null;
      }
   }

   static {
      int var3 = new Random(-6249770205825177355L).nextInt();
      t9tYjjWSSf = -416047963 ^ var3;
   }

   public static String kyvdmfdohy(byte[] var0, int var1) {
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
         byte[] var27 = fdsqicipve;
         byte[] var34 = fdsqicipve;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] ofmwejiksxitsjm() {
      return new byte[]{74, 100, 69, 91, 122, 46, 102, 19, 118, 86, 79, 11, 47, 47, 49, 71, 21, 105, 46, 16, 41, 99, 65, 52, 105};
   }

   private static int vfnpeeizaqgzmxgl(int var0, int var1) {
      return var1 ^ var0;
   }
}
