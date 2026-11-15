package com.wimpyclient.f;

import java.util.Arrays;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class c$a {
   final int sectionCount;
   final int bottomSectionY;
   final c$d[] block;
   final c$d[] sky;
   private static int f4uOv9maGuC;
   private transient int f0M3ymkgp4j;

   c$a(int var1, int var2) {
super();
      int var26 = 1210518996 ^ 724088932;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
            case 267260682:
               var26 = 1346014696 ^ var26;
            case 731430994:
               var26 = 1395609974 ^ 1785482039 ^ Integer.parseInt("175514137");
               this.f0M3ymkgp4j = 909819269 ^ f4uOv9maGuC;
               var26 = 1166916292 ^ var26;
               this.sectionCount = var1;
               this.bottomSectionY = var2;
               byte var5 = 2;
               int var16 = var1 + var5;
               c$d[] var17 = new c$d[var16];
               this.block = var17;
               byte var23 = 2;
               int var19 = var1 + var23;
               c$d[] var20 = new c$d[var19];
               this.sky = var20;
               c$d[] var11 = this.block;
               c$d var21 = c$d.UNKNOWN;
               Arrays.fill(var11, var21);
               c$d[] var13 = this.sky;
               c$d var22 = c$d.UNKNOWN;
               Arrays.fill(var13, var22);
               return;
            case 446545036:
            default:
               throw new RuntimeException();
            case 966265634:
         }
      }
   }

   static {
      int var3 = new Random(7012889181968911599L).nextInt();
      f4uOv9maGuC = 1861290974 ^ var3;
   }
}
