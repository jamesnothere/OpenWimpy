package com.wimpyclient.n;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b$a {
   private final String mode;
   private final Set<String> names;
   private final List<String> rankKeywords;
   private final String symbols;
   private final boolean fontIcons;
   private final boolean showVanished;
   private static int P5DXNU0CKg;
   private transient int Rti7r5ZTEu;

   public b$a(String var1, Set<String> var2, List<String> var3, String var4, boolean var5, boolean var6) {
super();
      int var22 = 998011984 ^ 1132304059;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
            case 142860198:
               var22 = 534496319 ^ var22;
            case 1893145278:
               var22 = 1032445749 ^ 909410929 ^ Integer.parseInt("1818721168");
               this.Rti7r5ZTEu = 712493612 ^ P5DXNU0CKg;

               label22:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                     case 154586336:
                        var22 = 1919795395 ^ var22;
                        break label22;
                     case 397539678:
                     default:
                        throw new RuntimeException();
                     case 757445787:
                        break;
                     case 1608121902:
                        break label22;
                  }
               }

               this.mode = var1;
               this.names = var2;
               this.rankKeywords = var3;
               this.symbols = var4;
               this.fontIcons = var5;
               this.showVanished = var6;
               return;
            case 1320230799:
               break;
            case 1378149883:
            default:
               throw new RuntimeException();
         }
      }
   }

   public String mode() {
      int var5 = 387901721 ^ 1052744459 ^ 1930511643;
      var5 = 1324062546 ^ var5;
      return this.mode;
   }

   public Set<String> names() {
      int var5 = 1816008511 ^ 1018267673 ^ 1930511643;
      var5 = 325758869 ^ var5;
      return this.names;
   }

   public List<String> rankKeywords() {
      int var5 = 654560637 ^ 855910482 ^ 1930511643;
      var5 = 1541412732 ^ var5;
      return this.rankKeywords;
   }

   public String symbols() {
      int var5 = 1225905051 ^ 1788790072 ^ 1930511643;
      var5 = 937776349 ^ var5;
      return this.symbols;
   }

   public boolean fontIcons() {
      int var5 = 1274420988 ^ 1931190406 ^ 1930511643;
      var5 = 424418191 ^ var5;
      return this.fontIcons;
   }

   public boolean showVanished() {
      int var5 = 265440615 ^ 72174779 ^ 1930511643;
      var5 = 1132133995 ^ var5;
      return this.showVanished;
   }

   static {
      int var3 = new Random(7620278447241419837L).nextInt();
      P5DXNU0CKg = 1979834152 ^ var3;
   }

   public static String tsgwkulfwe(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] znqstcpbswhdmps() {
      return new byte[]{
         41,
         114,
         106,
         3,
         7,
         79,
         80,
         87,
         118,
         21,
         78,
         22,
         127,
         24,
         121,
         22,
         84,
         105,
         117,
         103,
         103,
         94,
         20,
         92,
         66,
         3,
         12,
         65,
         35,
         125,
         122,
         83,
         121,
         55,
         78,
         35,
         40,
         101,
         15,
         84,
         67
      };
   }
}
