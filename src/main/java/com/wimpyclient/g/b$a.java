package com.wimpyclient.g;

import java.io.IOException;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class b$a {
   int wheelCx;
   int wheelCy;
   int sliderX;
   int sliderY;
   int sliderW;
   private static int Os6mykokr3;
   private transient int fWcHhcEO8Y;

   b$a() {
super();
      int var4 = 582114333 ^ 1219406561;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 228095124:
               var4 = 1263960360 ^ var4;
            case 1241524471:
               var4 = 925953585 ^ 1508887244 ^ Integer.parseInt("1335186217");
               this.fWcHhcEO8Y = 2116991517 ^ Os6mykokr3;
               var4 = 1136115186 ^ var4;
               return;
            case 228293900:
            default:
               throw new RuntimeException(new IOException());
            case 1016659852:
         }
      }
   }

   static {
      int var3 = new Random(-1252635709964414158L).nextInt();
      Os6mykokr3 = 1331492460 ^ var3;
   }
}
