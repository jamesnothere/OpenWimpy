package com.wimpyclient.i;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum ac$a {CLEAR((fphqvqihnt(tukqgasinwvaiuw(), yxursfiemhitcup(), (281405011 ^ (447963231 ^ 1785622288 ^ Integer.parseInt("1551275530"))))), (-1020217367 ^ (281405011 ^ (447963231 ^ 1785622288 ^ Integer.parseInt("1551275530")))), (-1015790244 ^ (281405011 ^ (447963231 ^ 1785622288 ^ Integer.parseInt("1551275530"))))),
   RAIN((fphqvqihnt(goantbbxejdpdtw(), yxursfiemhitcup(), (281405011 ^ (447963231 ^ 1785622288 ^ Integer.parseInt("1551275530"))))), (-1023024958 ^ (281405011 ^ (447963231 ^ 1785622288 ^ Integer.parseInt("1551275530")))), (-1015324890 ^ (281405011 ^ (447963231 ^ 1785622288 ^ Integer.parseInt("1551275530"))))),
   THUNDER((fphqvqihnt(bcdnbuhdpeqoxnl(), yxursfiemhitcup(), (281405011 ^ (447963231 ^ 1785622288 ^ Integer.parseInt("1551275530"))))), ((short)(-1013856421 ^ (281405011 ^ (447963231 ^ 1785622288 ^ Integer.parseInt("1551275530"))))), (-1018929914 ^ (281405011 ^ (447963231 ^ 1785622288 ^ Integer.parseInt("1551275530")))));

   public final String label;
   public final int accent;
   public final int wash;

   private ac$a(String nullxx, int nullxxx, int nullxxxx) {
      int var17 = 1256013546 ^ 16676901;
      
      var17 = 1797648551 ^ var17;
      var17 = 1156797909 ^ 964916663 ^ Integer.parseInt("1551275530");
      var17 = coosvpydujmzeekd(var17, 1083451844);
      this.label = nullxx;
      this.accent = nullxxx;
      this.wash = nullxxxx;
   }



   public static String fphqvqihnt(byte[] var0, byte[] var1, int var2) {
      String var9 = Integer.toString(var2);
      byte[] var10 = var9.getBytes();
      byte[] var7 = var10;
      byte var11 = 0;
      int var8 = var11;

      while (true) {
         int var16 = var0.length;
         if (var8 >= var16) {
            Charset var30 = StandardCharsets.UTF_16;
            return new String(var0, var30);
         }

         byte var19 = var0[var8];
         int var34 = var7.length;
         int var31 = var8 % var34;
         byte var27 = var7[var31];
         int var20 = var19 ^ var27;
         byte var21 = (byte)var20;
         var0[var8] = var21;
         byte var22 = var0[var8];
         int var36 = var1.length;
         int var33 = var8 % var36;
         byte var29 = var1[var33];
         int var23 = var22 ^ var29;
         byte var24 = (byte)var23;
         var0[var8] = var24;
         var8++;
      }
   }

   private static byte[] yxursfiemhitcup() {
      return new byte[]{
         39,
         17,
         1,
         99,
         84,
         117,
         119,
         52,
         115,
         35,
         105,
         20,
         55,
         93,
         2,
         123,
         51,
         121,
         103,
         124,
         39,
         124,
         109,
         44,
         62,
         12,
         2,
         87,
         27,
         54,
         55,
         65,
         107,
         58,
         80,
         96,
         47,
         86,
         20,
         21,
         83,
         121,
         80,
         107,
         30,
         81,
         38,
         5,
         88,
         62,
         55,
         96,
         42,
         121,
         36,
         21,
         99,
         18,
         47,
         107,
         116,
         122,
         11,
         17,
         12,
         94,
         20,
         59,
         37,
         120,
         73,
         60,
         60,
         45,
         77,
         16,
         76,
         89,
         30,
         91,
         12,
         15,
         104,
         33,
         94,
         92,
         27,
         100,
         101,
         48,
         115,
         91,
         17,
         68,
         76,
         69,
         117,
         1,
         72,
         49,
         104,
         78,
         50,
         5,
         101,
         50,
         5,
         78,
         123,
         93,
         122,
         8,
         54,
         113
      };
   }

   private static byte[] bzwafzbolyuszyd() {
      return new byte[]{-24, -34, 48, 19, 108, 14, 67, 69, 70, 86, 88, 118};
   }

   private static byte[] tukqgasinwvaiuw() {
      return new byte[]{-24, -34, 48, 19, 108, 46, 67, 101, 70, 118, 88, 86};
   }

   private static byte[] wyjbqirccmkrfgq() {
      return new byte[]{-24, -34, 48, 2, 108, 3, 67, 73, 70, 89};
   }

   private static byte[] goantbbxejdpdtw() {
      return new byte[]{-24, -34, 48, 2, 108, 35, 67, 105, 70, 121};
   }

   private static byte[] khsltlwftkyucue() {
      return new byte[]{-24, -34, 48, 4, 108, 10, 67, 85, 70, 89, 88, 96, 6, 43, 58, 30};
   }

   private static byte[] bcdnbuhdpeqoxnl() {
      return new byte[]{-24, -34, 48, 4, 108, 42, 67, 117, 70, 121, 88, 64, 6, 11, 58, 62};
   }

   private static int coosvpydujmzeekd(int var0, int var1) {
      return var0 ^ var1;
   }
}
