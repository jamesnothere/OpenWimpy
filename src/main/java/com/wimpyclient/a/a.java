package com.wimpyclient.a;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a {
   private String username;
   private String refreshToken;
   private static int phpFovubKs;
   private transient int NnUYuvV0ek;

   public a(String var1, String var2) {
super();
      int var12 = 674286734 ^ 86495800;
      
      var12 = eaqatgozragbjnfh(var12, 687337275);
      var12 = 229739645 ^ 241143477 ^ Integer.parseInt("101643077");
      this.NnUYuvV0ek = 1949239049 ^ phpFovubKs;
      var12 = eaqatgozragbjnfh(var12, 1657793376);
      String var9;
      if (var1 == null) {
         var12 = 824562624 ^ var12;
         var9 = "";

         label33:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var12)) {
               case 112505805:
                  var12 ^= 2047221966;
                  break label33;
               case 397887035:
               default:
                  throw new RuntimeException();
               case 786065283:
                  break label33;
               case 1292582735:
            }
         }
      } else {
         var12 = 492318370 ^ var12;
         var9 = var1;
         var12 = 1450958252 ^ var12;
      }

      this.username = var9;
      String var8;
      if (var2 != null) {
         var12 = eaqatgozragbjnfh(var12, 1865420832);
         var8 = var2;
         var12 = 1818637226 ^ var12;
      } else {
         var12 = 1628818664 ^ var12;
         var8 = "";

         label26:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var12)) {
               case 90241756:
                  var12 = 1648619362 ^ var12;
                  break label26;
               case 562021078:
               default:
                  throw new RuntimeException();
               case 700069809:
                  break label26;
               case 1380684569:
            }
         }
      }

      this.refreshToken = var8;
   }

   public String username() {
      int var5 = 2044355206 ^ 2057275517 ^ 1272941512;
      var5 = 523928497 ^ var5;
      return this.username;
   }

   public void setUsername(String var1) {
      int var7 = 1195557234 ^ 27471985 ^ 1272941512;
      var7 = 1406914376 ^ var7;
      String var4;
      if (var1 == null) {
         var7 = 600972877 ^ var7;
         var4 = ljbttsxmyj(kezgxtlelltcvuf(), syvagoaxjbekizr(), var7);
         var7 = eaqatgozragbjnfh(var7, 1782628934);
      } else {
         var7 = eaqatgozragbjnfh(var7, 1037704069);
         var4 = var1;
         var7 = 1950926734 ^ var7;
      }

      this.username = var4;
   }

   public String refreshToken() {
      int var5 = 29461737 ^ 641223288 ^ 1272941512;
      var5 = 1163096180 ^ var5;
      return this.refreshToken;
   }

   public void setRefreshToken(String var1) {
      int var7 = 853264515 ^ 206494887 ^ 1272941512;
      var7 = 1682517808 ^ var7;
      String var4;
      if (var1 != null) {
         var7 = 819278312 ^ var7;
         var4 = var1;
         var7 = 1933666544 ^ var7;
      } else {
         var7 = 1100693982 ^ var7;
         var4 = ljbttsxmyj(tozmdteihzkujts(), syvagoaxjbekizr(), var7);

         label20:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var7)) {
               case 203948651:
                  var7 = 34543814 ^ var7;
               case 1256607893:
                  break label20;
               case 1466488115:
                  break;
               case 1655607241:
               default:
                  throw new IllegalStateException();
            }
         }
      }

      this.refreshToken = var4;
   }

   static {
      int var3 = new Random(-4452736442787317956L).nextInt();
      phpFovubKs = -398547633 ^ var3;
   }

   public static String ljbttsxmyj(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] syvagoaxjbekizr() {
      return new byte[]{
         74,
         107,
         81,
         91,
         20,
         7,
         77,
         40,
         59,
         71,
         83,
         70,
         77,
         52,
         78,
         126,
         77,
         126,
         43,
         53,
         44,
         90,
         2,
         69,
         99,
         97,
         126,
         34,
         10,
         72,
         107,
         38,
         41,
         11,
         36,
         10,
         65,
         44,
         57,
         74,
         40,
         9,
         83,
         85,
         39,
         83,
         28,
         125,
         26,
         5,
         65,
         51,
         119,
         61,
         29,
         122,
         17,
         37,
         99,
         37,
         80,
         34,
         68,
         12,
         79,
         58,
         110,
         93,
         19,
         115,
         32,
         5,
         60,
         47,
         41,
         105,
         80,
         54,
         118,
         13,
         75,
         125,
         112,
         70,
         22,
         115,
         71,
         92,
         124,
         24,
         91,
         105,
         81,
         93,
         96,
         41,
         88,
         56,
         105,
         113,
         83,
         62,
         5,
         14,
         2,
         110,
         51,
         112,
         115,
         112,
         9,
         49,
         9,
         11,
         24,
         94,
         102,
         21,
         111,
         19,
         90,
         95,
         102,
         117,
         34,
         33
      };
   }

   private static byte[] kezgxtlelltcvuf() {
      return new byte[0];
   }

   private static byte[] tozmdteihzkujts() {
      return new byte[0];
   }

   private static int eaqatgozragbjnfh(int var0, int var1) {
      return var1 ^ var0;
   }
}
