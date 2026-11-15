package com.wimpyclient.k;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public enum k$d {WATERMARK(),
   KEYBINDS(),
   ARRAYLIST(),
   INFO(),
   RTP_MAP(),
   SPOTIFY(),
   STAFF(),
   STATUS_EFFECTS();

   private k$d() {
      int var8 = 1433549346 ^ 1140317654;
      
      var8 = 794623274 ^ var8;
      var8 = 615423438 ^ 1656247069 ^ Integer.parseInt("2144326669");

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
            case 1351127:
               var8 = 2113514134 ^ var8;
            case 554044931:
               return;
            case 447630464:
            default:
               throw new RuntimeException();
            case 640305658:
         }
      }
   }



   public static String gmxhqiujuh(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] wxgkhkjtkdmqpsx() {
      return new byte[]{
         33,
         48,
         45,
         123,
         102,
         7,
         126,
         77,
         85,
         112,
         38,
         99,
         68,
         106,
         70,
         121,
         76,
         68,
         126,
         80,
         25,
         31,
         109,
         43,
         20,
         46,
         12,
         8,
         80,
         27,
         64,
         76,
         100,
         53,
         27,
         47,
         32,
         38,
         79,
         75,
         64,
         64,
         23,
         81,
         103,
         61,
         75,
         53,
         111,
         75,
         112,
         52,
         26,
         78,
         106,
         47,
         49,
         13,
         64
      };
   }

   private static byte[] mozriptqmtmmtul() {
      return new byte[]{-25, -3, 30, 29, 85, 118, 74, 43, 99, 13, 20, 2, 117, 20, 118, 12, 126, 32, 70, 41};
   }

   private static byte[] xkgdbeqyqhlkzoz() {
      return new byte[]{-25, -3, 30, 1, 85, 114, 74, 38, 99, 10, 20, 25, 117, 23, 118, 9, 126, 33};
   }

   private static byte[] gjxmrwodbvhqsvz() {
      return new byte[]{-25, -3, 30, 11, 85, 101, 74, 45, 99, 9, 20, 9, 117, 21, 118, 4, 126, 33, 70, 54};
   }

   private static byte[] ngdvgjumjmnooos() {
      return new byte[]{-25, -3, 30, 3, 85, 121, 74, 57, 99, 7};
   }

   private static byte[] vvxubeqjiigyweh() {
      return new byte[]{-25, -3, 30, 24, 85, 99, 74, 47, 99, 23, 20, 29, 117, 24, 118, 29};
   }

   private static byte[] bwuxyxghrgvqvdg() {
      return new byte[]{-25, -3, 30, 25, 85, 103, 74, 48, 99, 28, 20, 25, 117, 31, 118, 20};
   }

   private static byte[] mhcviqoczpbosyi() {
      return new byte[]{-25, -3, 30, 25, 85, 99, 74, 62, 99, 14, 20, 22};
   }

   private static byte[] gkxnipsiguqrqgm() {
      return new byte[]{-25, -3, 30, 25, 85, 99, 74, 62, 99, 28, 20, 5, 117, 10, 118, 18, 126, 55, 70, 36, 42, 104, 94, 94, 32, 95, 58, 100, 98, 123};
   }
}
