package com.wimpyclient.i;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aj$e {NONE(),
   OPEN(),
   SWAP(),
   CLOSE();

   private aj$e() {
      int var8 = 735138512 ^ 1126689295;
      
      var8 = tdtdmlayhxnsqogf(var8, 1061179533);
      var8 = 1254190914 ^ 1601076319 ^ Integer.parseInt("1108998991");
      var8 = 280674021 ^ var8;
   }



   public static String hhttjpocmd(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] wqyewnulhyrwfff() {
      return new byte[]{
         117,
         37,
         122,
         9,
         20,
         108,
         58,
         113,
         26,
         122,
         100,
         39,
         29,
         110,
         99,
         101,
         17,
         18,
         10,
         119,
         109,
         24,
         116,
         55,
         39,
         83,
         121,
         112,
         74,
         103,
         113,
         68,
         83,
         123,
         4,
         72,
         5,
         57,
         84,
         86,
         1,
         40,
         107,
         126,
         117,
         61,
         40,
         57,
         111,
         104,
         103,
         70,
         40,
         36,
         62,
         122,
         78,
         14,
         11,
         96,
         43,
         82,
         123,
         40,
         19,
         116,
         43,
         109,
         111,
         44,
         14,
         99,
         22,
         19,
         57,
         11,
         52,
         48,
         44,
         40,
         11,
         127,
         87,
         48,
         86,
         45,
         4,
         17,
         118,
         125,
         28,
         10,
         85,
         8,
         45,
         103,
         11,
         60,
         11,
         46,
         56,
         40,
         8,
         73,
         66,
         93,
         90,
         65,
         125,
         115,
         73,
         122,
         124,
         16,
         102,
         58,
         75,
         40,
         72,
         27,
         3,
         10,
         12,
         107,
         98,
         73,
         108
      };
   }

   private static byte[] rphfcxpvvjpuwwa() {
      return new byte[]{-71, -17, 78, 126, 39, 18, 12, 15, 40, 13};
   }

   private static byte[] kdxlcuspxxuhpfc() {
      return new byte[]{-71, -17, 78, 127, 39, 13, 12, 4, 40, 6};
   }

   private static byte[] ngncpmcfyspiznn() {
      return new byte[]{-71, -17, 78, 99, 39, 10, 12, 0, 40, 24};
   }

   private static byte[] acrdvetdgqjnffb() {
      return new byte[]{-71, -17, 78, 115, 39, 17, 12, 14, 40, 27, 81, 86};
   }

   private static int tdtdmlayhxnsqogf(int var0, int var1) {
      return var0 ^ var1;
   }
}
