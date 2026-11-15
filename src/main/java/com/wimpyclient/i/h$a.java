package com.wimpyclient.i;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum h$a {SEND_COMMAND(),
   WAIT_TELEPORT(),
   WAIT_LOAD(),
   WAIT_SCAN(),
   WAIT_TRAVEL();

   private static byte[] ukserajoys = nmpstflwgjjqqty();

   private h$a() {
      int var8 = 1443807634 ^ 1935759395;
      
      var8 = 1833120981 ^ var8;
      var8 = 1432038004 ^ 988152977 ^ Integer.parseInt("663847809");
      var8 = 35203497 ^ var8;
   }



   public static String gjdxglpjek(byte[] var0, int var1) {
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
         byte[] var27 = ukserajoys;
         byte[] var34 = ukserajoys;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] nmpstflwgjjqqty() {
      return new byte[]{
         114, 38, 3, 73, 109, 28, 1, 8, 95, 99, 121, 10, 15, 56, 24, 8, 6, 31, 26, 13, 90, 93, 65, 85, 114, 32, 76, 102, 125, 106, 1, 1, 32, 98, 111, 93
      };
   }

   private static byte[] jqiiodlvpzadwwv() {
      return new byte[]{-67, -21, 48, 45, 88, 109, 50, 118, 105, 18, 72, 103, 60, 76, 45, 115, 53, 98, 44, 117, 107, 46, 114, 44, 71, 80};
   }

   private static byte[] lcinkgqsvzgyojx() {
      return new byte[]{-67, -21, 48, 41, 88, 105, 50, 113, 105, 2, 72, 103, 60, 91, 45, 121, 53, 99, 44, 125, 107, 63, 114, 45, 71, 70, 127, 2};
   }

   private static byte[] scmmvysxxfyabcg() {
      return new byte[]{-67, -21, 48, 41, 88, 105, 50, 113, 105, 2, 72, 103, 60, 67, 45, 115, 53, 110, 44, 124};
   }

   private static byte[] mwiogxpiavqrxcb() {
      return new byte[]{-67, -21, 48, 41, 88, 105, 50, 113, 105, 2, 72, 103, 60, 92, 45, 127, 53, 110, 44, 118};
   }

   private static byte[] txfxsrdsigvhupd() {
      return new byte[]{-67, -21, 48, 41, 88, 105, 50, 113, 105, 2, 72, 103, 60, 91, 45, 110, 53, 110, 44, 110, 107, 42, 114, 46};
   }
}
