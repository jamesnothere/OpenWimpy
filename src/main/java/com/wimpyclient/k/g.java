package com.wimpyclient.k;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class g {
   private static final int CAPACITY = 72;
   private static final float[] U;
   private static final float[] V;
   private static final float[] SIZE;
   private static final float[] PHASE;
   private static final boolean[] GLINT;
   private static int N2jRZL1GUV;
   private transient int pInXV46rRf;
   private static byte[] xhqnelumqp = okbebsjvhvkvuyi();

   private g() {
super();
      int var4 = 861544248 ^ 1063738283;
      
      var4 = 2069603453 ^ var4;
      var4 = 1629255947 ^ 943424541 ^ Integer.parseInt("776019448");
      this.pInXV46rRf = 1961177223 ^ N2jRZL1GUV;
      var4 = 1480008692 ^ var4;
   }

   public static void draw(com.wimpyclient.m.b var0, float var1, float var2, float var3, float var4) {
      int var158 = 380475197 ^ 480635026 ^ 719624424;
      var158 = 431829158 ^ var158;
      byte var5 = (byte)((h.uiStarfield()) ? 1 : 0);
      if (var5 != (961664993 ^ var158)) {
         var158 = 1939678577 ^ var158;
         float var6 = 4.0F;
         float var175;
         int var28 = (var175 = var3 - var6) == 0.0F ? 0 : (var175 < 0.0F ? -1 : 1);
         if (var28 < (1254945424 ^ var158)) {
            var158 = 1339951865 ^ var158;
         } else {
            var158 = 1023933937 ^ var158;
            float var68 = 4.0F;
            float var176;
            int var30 = (var176 = var4 - var68) == 0.0F ? 0 : (var176 < 0.0F ? -1 : 1);
            if (var30 < (2009796449 ^ var158)) {
               var158 = 1926887176 ^ var158;
            } else {
               label70:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var158)) {
                     case 135862784:
                        var158 ^= 1936173936;
                        break label70;
                     case 589773623:
                        break;
                     case 1254013391:
                        break label70;
                     case 1409002650:
                     default:
                        throw new IllegalStateException();
                  }
               }

               float var31 = h.starDensity();
               byte var32 = (byte)(78423065 ^ var158);
               float var69 = 72.0F;
               float var70 = var69 * var31;
               float var94 = 1.35F;
               float var118 = var3 * var4;
               float var126 = 14000.0F;
               float var119 = var118 / var126;
               float var95 = Math.min(var94, var119);
               float var71 = var70 * var95;
               int var72 = Math.round(var71);
               int var33 = Math.max(var32, var72);
               byte var34 = (byte)(78423129 ^ var158);
               int var35 = Math.min(var34, var33);
               int var155 = var35;
               float var36 = h.starAnimSpeed();
               long var37 = System.nanoTime();
               double var39 = var37;
               double var96 = 1.0E-9;
               double var41 = var39 * var96;
               double var98 = 0.35;
               double var128 = var36;
               double var100 = var98 + var128;
               double var43 = var41 * var100;
               double var18 = var43;
               int var45 = h.chromeBright();
               int var20 = var45;
               var0.save();
               var0.intersectScissor(var1, var2, var3, var4);
               byte var48 = (byte)(78423057 ^ var158);
               int var21 = var48;
               var158 = 1002911181 ^ var158;

               while (var21 < var155) {
                  var158 = 2050658416 ^ var158;
                  float[] var76 = U;
                  float var77 = var76[var21];
                  float var78 = var77 * var3;
                  float var51 = var1 + var78;
                  float[] var79 = V;
                  float var80 = var79[var21];
                  float var81 = var80 * var4;
                  float var53 = var2 + var81;
                  float var54 = 0.35F;
                  float var82 = 0.65F;
                  double var107 = 0.5;
                  double var131 = 0.5;
                  boolean[] var13 = GLINT;
                  byte var147 = (byte)((var13[var21]) ? 1 : 0);                  double var152;
                  if (var147 != (1162936748 ^ var158)) {
                     var158 = 934721356 ^ var158;
                     var152 = 3.2;
                     var158 = 200496742 ^ var158;
                  } else {
                     var158 = 1079868504 ^ var158;
                     var152 = 1.6;
                     var158 = 2081987954 ^ var158;
                  }

                  double var140 = var18 * var152;
                  float[] var148 = PHASE;
                  float var149 = var148[var21];
                  double var150 = var149;
                  double var142 = var140 + var150;
                  double var144 = Math.sin(var142);
                  double var133 = var131 * var144;
                  double var109 = var107 + var133;
                  float var111 = (float)var109;
                  float var83 = var82 * var111;
                  float var55 = var54 + var83;
                  float[] var56 = SIZE;
                  float var57 = var56[var21];
                  boolean[] var85 = GLINT;
                  byte var86 = (byte)((var85[var21]) ? 1 : 0);                  float var93;
                  if (var86 != (2031411334 ^ var158)) {
                     var158 = 1613017156 ^ var158;
                     var93 = 1.15F;
                     var158 = msvjlvbhqfjnhfxl(var158, 1681494720);
                  } else {
                     var158 = msvjlvbhqfjnhfxl(var158, 398985347);
                     var93 = 0.85F;
                     var158 = 332737031 ^ var158;
                  }

                  float var58 = var57 * var93;
                  float var87 = 0.14F;
                  float var113 = 0.5F;
                  float var114 = var113 * var55;
                  float var122 = h.glowIntensity();
                  float var115 = var114 * var122;
                  float var88 = var87 + var115;
                  int var60 = com.wimpyclient.p.g.withAlpha(var20, var88);
                  var0.circle(var51, var53, var58, var60);
                  boolean[] var62 = GLINT;
                  byte var63 = (byte)((var62[var21]) ? 1 : 0);
                  if (var63 != (2097791490 ^ var158)) {
                     var158 ^= 1769927233;
                     float var91 = 0.78F;
                     float var177;
                     int var65 = (var177 = var55 - var91) == 0.0F ? 0 : (var177 < 0.0F ? -1 : 1);
                     if (var65 > (343355459 ^ var158)) {
                        var158 = 31646945 ^ var158;
                        float var136 = 2.1F;
                        float var125 = var58 * var136;
                        float var10 = 0.12F;
                        float var139 = var10 * var55;
                        int var138 = com.wimpyclient.p.g.withAlpha(var20, var139);
                        var0.circle(var51, var53, var125, var138);
                        var158 = 1011598427 ^ var158;
                     } else {
                        label52:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var158)) {
                              case 128383478:
                                 var158 ^= 1034494138;
                                 break label52;
                              case 1200946548:
                              default:
                                 throw new IllegalStateException();
                              case 1212740244:
                                 break;
                              case 2088313810:
                                 break label52;
                           }
                        }
                     }
                  } else {
                     label59:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var158)) {
                           case 37919466:
                              var158 ^= 1423430395;
                              break label59;
                           case 386015705:
                           default:
                              throw new IllegalStateException();
                           case 940370977:
                              break label59;
                           case 1734757490:
                        }
                     }
                  }

                  var21 += 702419192 ^ var158;
                  var158 = 380993829 ^ var158;
               }

               var158 = 1712666472 ^ var158;
               var0.restore();
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var158)) {
               case 252619538:
                  var158 = 1011036040 ^ var158;
                  return;
               case 1282451089:
                  break;
               case 1571642864:
               default:
                  throw new IllegalStateException();
               case 2053112876:
                  return;
            }
         }
      }
   }

   private static int hash(int var0) {
      int var22 = 1280540340 ^ 1316939542 ^ 719624424;
      var22 = 239924938 ^ var22;
      byte var3 = (byte)(646313869 ^ var22);
      int var10 = var0 << var3;
      int var4 = var0 ^ var10;
      byte var15 = (byte)(646313873 ^ var22);
      int var12 = var4 >>> var15;
      int var6 = var4 ^ var12;
      byte var16 = (byte)(646313861 ^ var22);
      int var14 = var6 << var16;
      return var6 ^ var14;
   }

   static {
      int var84 = 1650445033 ^ 723404016 ^ Integer.parseInt("776019448");
      int var81 = new Random(8549429295361707839L).nextInt();
      N2jRZL1GUV = -153649771 ^ var81;
      var84 = 925711200 ^ var84;
      byte var0 = (byte)(1345169609 ^ var84);
      float[] var7 = new float[var0];
      U = var7;
      byte var8 = (byte)(1345169609 ^ var84);
      float[] var9 = new float[var8];
      V = var9;
      byte var10 = (byte)(1345169609 ^ var84);
      float[] var11 = new float[var10];
      SIZE = var11;
      byte var12 = (byte)(1345169609 ^ var84);
      float[] var13 = new float[var12];
      PHASE = var13;
      byte var14 = (byte)(1345169609 ^ var84);
      boolean[] var15 = new boolean[var14];
      GLINT = var15;
      int var16 = -1871203152 ^ var84;
      int var5 = var16;
      byte var17 = (byte)(1345169537 ^ var84);
      int var6 = var17;
      var84 = 250371246 ^ var84;

      label35:
      while (true) {
         byte var1 = (byte)(1589769319 ^ var84);
         if (var6 >= var1) {
            var84 = msvjlvbhqfjnhfxl(var84, 1032646971);
            break label35;
         }

         var84 = 1702536627 ^ var84;
         int var20 = hash(var5);
         float[] var21 = U;
         byte var3 = (byte)(1002131860 ^ var84);
         int var37 = var20 >>> var3;
         int var57 = 1002155619 ^ var84;
         int var38 = var37 & var57;
         float var39 = var38;
         float var58 = 65535.0F;
         float var40 = var39 / var58;
         var21[var6] = var40;
         int var23 = hash(var20);
         float[] var24 = V;
         byte var59 = (byte)(1002131860 ^ var84);
         int var42 = var23 >>> var59;
         int var60 = 1002155619 ^ var84;
         int var43 = var42 & var60;
         float var44 = var43;
         float var61 = 65535.0F;
         float var45 = var44 / var61;
         var24[var6] = var45;
         int var26 = hash(var23);
         float[] var27 = SIZE;
         float var46 = 0.45F;
         byte var4 = (byte)(1002131852 ^ var84);
         int var63 = var26 >>> var4;
         short var73 = (short)(1002131811 ^ var84);
         int var64 = var63 & var73;
         float var65 = var64;
         float var74 = 255.0F;
         float var66 = var65 / var74;
         float var75 = 1.15F;
         float var67 = var66 * var75;
         float var47 = var46 + var67;
         var27[var6] = var47;
         int var29 = hash(var26);
         var5 = var29;
         float[] var30 = PHASE;
         byte var68 = (byte)(1002131860 ^ var84);
         int var49 = var29 >>> var68;
         int var69 = 1002155619 ^ var84;
         int var50 = var49 & var69;
         float var51 = var50;
         float var70 = 65535.0F;
         float var52 = var51 / var70;
         float var71 = (float) (Math.PI * 2);
         float var53 = var52 * var71;
         var30[var6] = var53;
         boolean[] var31 = GLINT;
         byte var72 = (byte)(1002131867 ^ var84);
         int var55 = var29 & var72;
         byte var56;
         if (var55 == (1002131868 ^ var84)) {
            var84 = 1158862315 ^ var84;
            var56 = (byte)(2125038710 ^ var84);

            label30:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var84)) {
                  case 90705423:
                     var84 ^= 1950201427;
                  case 191880650:
                     break label30;
                  case 1243531431:
                     break;
                  case 1464176332:
                  default:
                     break label35;
               }
            }
         } else {
            label23:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var84)) {
                  case 62576037:
                     var84 ^= 580884806;
                     break label23;
                  case 1317801401:
                     break;
                  case 2038968948:
                     break label23;
                  case 2068217881:
                  default:
                     break label35;
               }
            }

            var56 = (byte)(421841114 ^ var84);
            var84 = 330365694 ^ var84;
         }

         var31[var6] = (var56 != 0);
         var6 += 177484325 ^ var84;
         var84 = 1414907403 ^ var84;
      }

   }

   public static String iqygtxzsfi(byte[] var0, int var1) {
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
         byte[] var28 = xhqnelumqp;
         byte[] var34 = xhqnelumqp;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] okbebsjvhvkvuyi() {
      return new byte[]{118, 22, 6, 89, 87, 70, 72, 109, 79, 42, 83, 87, 85, 38, 113, 49, 60, 60, 62, 22, 3, 54, 43, 79, 96};
   }

   private static int msvjlvbhqfjnhfxl(int var0, int var1) {
      return var0 ^ var1;
   }
}
