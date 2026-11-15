package com.wimpyclient.k;

import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class k$c {
   float x;
   float y;
   float nx;
   float ny;
   float scale;
   private static int SI1IpKmG1B;
   private transient int WbYOsy96xw;

   public k$c() {
super();
      int var14 = 345232497 ^ 2018441780;
      
      var14 = 784997019 ^ var14;
      var14 = 1416473915 ^ 508047969 ^ Integer.parseInt("137538436");
      this.WbYOsy96xw = 1133471711 ^ SI1IpKmG1B;
      var14 = htpopdvjxqhknbei(var14, 2142428557);
      float var2 = Float.NaN;
      this.x = var2;
      float var8 = Float.NaN;
      this.y = var8;
      float var9 = Float.NaN;
      this.nx = var9;
      float var10 = Float.NaN;
      this.ny = var10;
      float var11 = 1.0F;
      this.scale = var11;
   }

   static {
      int var3 = new Random(-376379525627499293L).nextInt();
      SI1IpKmG1B = 1485108935 ^ var3;
   }

   private static int htpopdvjxqhknbei(int var0, int var1) {
      return var1 ^ var0;
   }
}
