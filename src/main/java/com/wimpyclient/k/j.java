package com.wimpyclient.k;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class j {
   private static int wbHlyUuR2P;
   private transient int oMCo6w2pKD;

   private j() {
super();
      int var4 = 50571631 ^ 1297507136;
      
      var4 = qlpovvgblgejwvpk(var4, 1777954468);
      var4 = 836124014 ^ 57452142 ^ Integer.parseInt("353779595");
      this.oMCo6w2pKD = 792415409 ^ wbHlyUuR2P;
      var4 = qlpovvgblgejwvpk(var4, 611158798);
   }

   public static boolean enabled() {
      int var3 = 2137365107 ^ 1536731153 ^ 156131343;
      var3 = 971101938 ^ var3;
      return h.uiGlow();
   }

   public static int soft(int var0, float var1) {
      int var28 = 2003255467 ^ 22747918 ^ 156131343;
      var28 = 917084704 ^ var28;
      byte var3 = (byte)(1239130514 ^ var28);
      int var7 = var0 >>> var3;
      short var15 = (short)(1239130485 ^ var28);
      int var8 = var7 & var15;
      float var9 = var8;
      float var16 = 255.0F;
      float var10 = var9 / var16;
      float var11 = var10 * var1;
      float var18 = 0.55F;
      float var4 = 0.45F;
      float var5 = h.glowIntensity();
      float var22 = var4 * var5;
      float var19 = var18 + var22;
      float var12 = var11 * var19;
      float var20 = 0.0F;
      float var23 = 1.0F;
      float var24 = Math.min(var23, var12);
      float var21 = Math.max(var20, var24);
      return com.wimpyclient.p.g.withAlpha(var0, var21);
   }

   public static int shadow() {
      int var3 = 529983184 ^ 377387059 ^ 156131343;
      var3 = 196908858 ^ var3;
      return -1843762730 ^ var3;
   }

   static {
      int var3 = new Random(1045199456622050079L).nextInt();
      wbHlyUuR2P = -305551683 ^ var3;
   }

   public static String qqqbdogbmh(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] pgzszvrslztycgs() {
      return new byte[]{
         121,
         77,
         37,
         104,
         79,
         112,
         77,
         76,
         122,
         94,
         110,
         14,
         69,
         56,
         41,
         31,
         112,
         21,
         5,
         6,
         47,
         37,
         65,
         31,
         41,
         28,
         70,
         116,
         89,
         12,
         43,
         52,
         96,
         35,
         78,
         105,
         60,
         44,
         124,
         110,
         16,
         53,
         83,
         68,
         7,
         72,
         35,
         95,
         17,
         107,
         88,
         78,
         42,
         106,
         51,
         73,
         25,
         113,
         15,
         20,
         102,
         4,
         60,
         1,
         97,
         112,
         66,
         8,
         6,
         113,
         30,
         37,
         98,
         13,
         74,
         86,
         43,
         68,
         108,
         93,
         99,
         34,
         72,
         19,
         69,
         54,
         29,
         114
      };
   }

   private static int qlpovvgblgejwvpk(int var0, int var1) {
      return var1 ^ var0;
   }
}
