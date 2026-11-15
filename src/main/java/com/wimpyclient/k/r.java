package com.wimpyclient.k;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
final class r {
   private static int Qvoo0GqvGC;
   private transient int f9DajWa87jD;
   private static String awxmqgozaa = ByteBuffer.wrap(jviwlhdcrqigxsn()).asCharBuffer().toString();

   private r() {
super();
      int var4 = 1870582745 ^ 603888666;
      
      var4 = dpkeygzbgvhkgjyw(var4, 421508374);
      var4 = 1139106608 ^ 1944418561 ^ Integer.parseInt("1704976612");
      this.f9DajWa87jD = 1498579721 ^ Qvoo0GqvGC;
      var4 = 1825251242 ^ var4;
   }

   static List<AABB> sample(Minecraft var0) {
      int var41 = 352758216 ^ 97723133 ^ 14767768;
      var41 = 1059040570 ^ var41;
      ClientLevel var9 = var0.level;
      if (var9 != null) {
         var41 = 1407040902 ^ var41;
         LocalPlayer var11 = var0.player;
         if (var11 != null) {
            var41 = 1941575443 ^ var41;
            DeltaTracker var13 = var0.getDeltaTracker();
            byte var2 = (byte)(256694786 ^ var41);
            float var14 = var13.getGameTimeDeltaPartialTick((var2 != 0));
            float var4 = var14;
            LocalPlayer var16 = var0.player;
            LocalPlayer var5 = var16;
            ArrayList var17 = new ArrayList();
            ArrayList var6 = var17;
            ClientLevel var19 = var0.level;
            List var20 = var19.players();
            Iterator var21 = var20.iterator();
            Iterator var7 = var21;
            var41 = 1434012483 ^ var41;

            while (true) {
               byte var23 = (byte)((var7.hasNext()) ? 1 : 0);
               if (var23 == (1513460033 ^ var41)) {
                  var41 = 1064882784 ^ var41;
                  return var6;
               }

               var41 = 1635558477 ^ var41;
               Object var25 = var7.next();
               AbstractClientPlayer var26 = (AbstractClientPlayer)var25;
               if (var26 != var5) {
                  var41 = 182522305 ^ var41;
                  byte var29 = (byte)((var26 instanceof LocalPlayer) ? 1 : 0);
                  if (var29 == (833103053 ^ var41)) {
                     var41 = 1650534482 ^ var41;
                     byte var31 = (byte)((var26 instanceof com.wimpyclient.i.p) ? 1 : 0);
                     if (var31 != (1405684895 ^ var41)) {
                        var41 = 2798029 ^ var41;
                        var41 = dpkeygzbgvhkgjyw(var41, 165030931);
                     } else {
                        var41 = dpkeygzbgvhkgjyw(var41, 365836380);
                        AABB var38 = interpolatedBox(var26, var4);
                        boolean var33 = var6.add(var38);
                        var41 = dpkeygzbgvhkgjyw(var41, 473081218);
                     }
                  } else {
                     var41 = dpkeygzbgvhkgjyw(var41, 1805497740);
                  }
               } else {
                  var41 = 1635558477 ^ var41;
               }
            }
         }

         var41 = 2076740579 ^ var41;
      } else {
         var41 = dpkeygzbgvhkgjyw(var41, 672478821);
      }

      return List.of();
   }

   private static AABB interpolatedBox(AbstractClientPlayer var0, float var1) {
      int var64 = 410684012 ^ 1831898730 ^ 14767768;
      var64 = 50921302 ^ var64;
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
      if (var37 == (1990438344 ^ var64)) {
         var64 = 1206909421 ^ var64;
         double var59 = 0.0;
         double var73;
         int var40 = (var73 = var28 - var59) == 0.0 ? 0 : (var73 < 0.0 ? -1 : 1);
         if (var40 == (827085861 ^ var64)) {
            var64 = 2002908716 ^ var64;
            double var61 = 0.0;
            double var74;
            int var43 = (var74 = var33 - var61) == 0.0 ? 0 : (var74 < 0.0 ? -1 : 1);
            if (var43 == (1177395721 ^ var64)) {
               var64 = 458960987 ^ var64;
               return var19;
            }

            var64 = 1227235125 ^ var64;
         } else {
            var64 = 1044900121 ^ var64;
         }
      } else {
         var64 = dpkeygzbgvhkgjyw(var64, 2041057524);
      }

      return var19.move(var23, var28, var33);
   }

   static {
      int var3 = new Random(5351565918679941390L).nextInt();
      Qvoo0GqvGC = 1959952719 ^ var3;
   }

   public static String hmogcauubt(byte[] var0, int var1) {
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
      String var29 = awxmqgozaa;
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

   private static byte[] jviwlhdcrqigxsn() {
      return new byte[0];
   }

   private static int dpkeygzbgvhkgjyw(int var0, int var1) {
      return var0 ^ var1;
   }
}
