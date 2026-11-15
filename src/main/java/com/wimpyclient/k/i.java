package com.wimpyclient.k;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class i {
   private static final double MIN_DISTANCE = 128.0;
   private static final int MAX_MARKS = 512;
   private static final List<com.wimpyclient.e.c> MARKS;
   private static int UmXLwIZoel;
   private transient int f3kdd8DYlZA;
   private static String rbyscabejm = ByteBuffer.wrap(rsksrsxmlctmfkb()).asCharBuffer().toString();

   private i() {
super();
      int var4 = 2050490650 ^ 1854545459;
      
      var4 = 1134502643 ^ var4;
      var4 = 1096262719 ^ 233012558 ^ Integer.parseInt("463070379");
      this.f3kdd8DYlZA = 139958791 ^ UmXLwIZoel;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 149418235:
               var4 = 1386311168 ^ var4;
            case 1416832066:
               return;
            case 1002551247:
               break;
            case 1418362726:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   static List<com.wimpyclient.e.c> sample(Minecraft var0) {
      int var194 = 1661844454 ^ 262548529 ^ 53208533;
      var194 = 937917307 ^ var194;
      com.wimpyclient.i.x var1 = com.wimpyclient.i.x.INSTANCE;
      com.wimpyclient.i.x var9 = var1;
      List var35 = MARKS;
      var35.clear();
      com.wimpyclient.i.v var37 = var1.entityEsp;
      byte var38 = (byte)((var37.qo()) ? 1 : 0);
      if (var38 != (1483147641 ^ var194)) {
         var194 = 418789010 ^ var194;
         ClientLevel var40 = var0.level;
         if (var40 != null) {
            var194 = 1132742018 ^ var194;
            LocalPlayer var42 = var0.player;
            if (var42 != null) {
               var194 = 940762053 ^ var194;
               DeltaTracker var44 = var0.getDeltaTracker();
               byte var2 = (byte)(990353836 ^ var194);
               float var45 = var44.getGameTimeDeltaPartialTick((var2 != 0));
               float var10 = var45;
               LocalPlayer var47 = var0.player;
               LocalPlayer var11 = var47;
               GameRenderer var49 = var0.gameRenderer;
               Camera var50 = var49.getMainCamera();
               Vec3 var51 = var50.position();
               Vec3 var12 = var51;
               List var52 = MARKS;
               List var13 = var52;
               int var54 = var1.entityEspRed;
               int var14 = var54;
               int var56 = var1.entityEspGreen;
               int var15 = var56;
               int var58 = var1.entityEspBlue;
               int var16 = var58;
               ClientLevel var60 = var0.level;
               Iterable var61 = var60.entitiesForRendering();
               Iterator var62 = var61.iterator();
               Iterator var17 = var62;
               var194 = 1772699131 ^ var194;

               label128:
               while (true) {
                  byte var64 = (byte)((var17.hasNext()) ? 1 : 0);                  AABB var85;
                  if (var64 == (1387177047 ^ var194)) {
                     var194 = 1917171068 ^ var194;
                     return var13;
                  } else {
                     var194 = 1520557465 ^ var194;
                     Object var66 = var17.next();
                     Entity var67 = (Entity)var66;
                     int var69 = var13.size();
                     short var135 = (short)(135232462 ^ var194);
                     if (var69 >= var135) {
                        var194 = 1200971438 ^ var194;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var194)) {
                              case 171631568:
                                 var194 = 1869690443 ^ var194;
                                 return var13;
                              case 804828305:
                                 return var13;
                              case 854506466:
                              default:
                                 throw new IllegalStateException();
                              case 1247385580:
                           }
                        }
                     } else {
                        var194 = pimpcmavryynjujg(var194, 1251098596);
                        if (var67 == null) {
                           var194 = 271835773 ^ var194;
                           continue;
                        }

                        var194 = 1023860865 ^ var194;
                        byte var73 = (byte)((var67.isAlive()) ? 1 : 0);
                        if (var73 == (2140907179 ^ var194)) {
                           var194 = 816521522 ^ var194;
                           var194 = 496903118 ^ var194;
                           continue;
                        }

                        var194 = pimpcmavryynjujg(var194, 1517146272);
                        if (var67 == var11) {
                           var194 = pimpcmavryynjujg(var194, 2002309724);
                           continue;
                        }

                        var194 = 1436906753 ^ var194;
                        byte var76 = (byte)((var67 instanceof LocalPlayer) ? 1 : 0);
                        if (var76 != (1884488458 ^ var194)) {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var194)) {
                                 case 161523120:
                                    var194 ^= 587048797;
                                    continue label128;
                                 case 518101237:
                                    break;
                                 case 589114730:
                                 default:
                                    throw new IllegalStateException();
                                 case 1985929216:
                                    continue label128;
                              }
                           }
                        } else {
                           var194 = 1896829866 ^ var194;
                           byte var78 = (byte)((var67 instanceof com.wimpyclient.i.p) ? 1 : 0);
                           if (var78 != (22827168 ^ var194)) {
                              var194 = 109488588 ^ var194;
                              var194 = pimpcmavryynjujg(var194, 1433689403);
                              continue;
                           }

                           var194 = 2013641046 ^ var194;
                           Map var138 = var9.entityEspByType;
                           com.wimpyclient.i.m var80 = com.wimpyclient.i.m.resolve(var67, var138);
                           if (var80 == null) {
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var194)) {
                                    case 186534933:
                                       var194 ^= 737627553;
                                       continue label128;
                                    case 1505352995:
                                    default:
                                       throw new IllegalStateException();
                                    case 1654884206:
                                       continue label128;
                                    case 2093838352:
                                 }
                              }
                           } else {
                              var194 = 604138173 ^ var194;
                              byte var83 = (byte)((var80.enabled) ? 1 : 0);
                              if (var83 == (1566278475 ^ var194)) {
                                 var194 = 1622680871 ^ var194;

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var194)) {
                                       case 132722578:
                                          var194 ^= 1867317819;
                                       case 156290137:
                                          continue label128;
                                       case 400090033:
                                          break;
                                       case 1932017847:
                                       default:
                                          throw new IllegalStateException();
                                    }
                                 }
                              } else {
                                 var194 = 809797422 ^ var194;
                                 var85 = interpolatedBox(var67, var10);
                                 double var87 = var85.minX;
                                 double var141 = var85.maxX;
                                 double var89 = var87 + var141;
                                 double var143 = 0.5;
                                 double var91 = var89 * var143;
                                 double var94 = var85.minY;
                                 double var146 = var85.maxY;
                                 double var96 = var94 + var146;
                                 double var148 = 0.5;
                                 double var98 = var96 * var148;
                                 double var101 = var85.minZ;
                                 double var151 = var85.maxZ;
                                 double var103 = var101 + var151;
                                 double var153 = 0.5;
                                 double var105 = var103 * var153;
                                 double var156 = var12.x;
                                 double var109 = var91 - var156;
                                 double var159 = var12.y;
                                 double var113 = var98 - var159;
                                 double var162 = var12.z;
                                 double var117 = var105 - var162;
                                 double var119 = 128.0;
                                 Options var165 = var0.options;
                                 int var166 = var165.getEffectiveRenderDistance();
                                 double var167 = var166;
                                 double var5 = 16.0;
                                 double var169 = var167 * var5;
                                 double var121 = Math.max(var119, var169);
                                 double var125 = var109 * var109;
                                 double var175 = var113 * var113;
                                 double var127 = var125 + var175;
                                 double var179 = var117 * var117;
                                 double var129 = var127 + var179;
                                 double var183 = var121 * var121;
                                 double var216;
                                 int var131 = (var216 = var129 - var183) == 0.0 ? 0 : (var216 < 0.0 ? -1 : 1);
                                 if (var131 > (1830749285 ^ var194)) {
                                    var194 = 2108030256 ^ var194;
                                    var194 = 1108630786 ^ var194;
                                    continue;
                                 }

                                 label111:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var194)) {
                                       case 57439644:
                                          var194 ^= 317298253;
                                       case 323963595:
                                          break label111;
                                       case 862243625:
                                          break;
                                       case 1074159088:
                                       default:
                                          throw new IllegalStateException();
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  com.wimpyclient.e.c var140 = new com.wimpyclient.e.c(var85, var14, var15, var16);
                  boolean var133 = var13.add(var140);
                  var194 = pimpcmavryynjujg(var194, 760755839);
               }
            }

            var194 = 597460360 ^ var194;
         } else {
            var194 = 1612234762 ^ var194;
         }
      } else {
         var194 = pimpcmavryynjujg(var194, 2028926616);
      }

      return MARKS;
   }

   private static AABB interpolatedBox(Entity var0, float var1) {
      int var64 = 783668313 ^ 2268054 ^ 53208533;
      var64 = 957135648 ^ var64;
      Vec3 var17 = var0.getPosition(var1);
      AABB var19 = var0.getBoundingBox();
      double var21 = var17.x;
      double var49 = var0.getX();
      double var23 = var21 - var49;
      double var26 = var17.y;
      double var52 = var0.getY();
      double var28 = var26 - var52;
      double var31 = var17.z;
      double var55 = var0.getZ();
      double var33 = var31 - var55;
      double var57 = 0.0;
      double var72;
      int var37 = (var72 = var23 - var57) == 0.0 ? 0 : (var72 < 0.0 ? -1 : 1);
      if (var37 == (347083066 ^ var64)) {
         var64 = 1759861393 ^ var64;
         double var59 = 0.0;
         double var73;
         int var40 = (var73 = var28 - var59) == 0.0 ? 0 : (var73 < 0.0 ? -1 : 1);
         if (var40 == (2085964715 ^ var64)) {
            var64 = 1279980382 ^ var64;
            double var61 = 0.0;
            double var74;
            int var43 = (var74 = var33 - var61) == 0.0 ? 0 : (var74 < 0.0 ? -1 : 1);
            if (var43 == (807385333 ^ var64)) {
               var64 = 984258502 ^ var64;
               return var19;
            }

            var64 = pimpcmavryynjujg(var64, 1521919239);
         } else {
            var64 = pimpcmavryynjujg(var64, 385635929);
         }
      } else {
         var64 = pimpcmavryynjujg(var64, 2115570888);
      }

      return var19.move(var23, var28, var33);
   }

   static {
      int var7 = 1702683980 ^ 564080618 ^ Integer.parseInt("463070379");
      int var4 = new Random(4404295328457075297L).nextInt();
      UmXLwIZoel = -986582734 ^ var4;
      var7 = 2007946372 ^ var7;
      short var1 = (short)(685045897 ^ var7);
      ArrayList var0 = new ArrayList(var1);
      MARKS = var0;
   }

   public static String jgcawjmdcu(byte[] var0, int var1) {
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
      String var29 = rbyscabejm;
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

   private static byte[] rsksrsxmlctmfkb() {
      return new byte[0];
   }

   private static int pimpcmavryynjujg(int var0, int var1) {
      return var1 ^ var0;
   }
}
