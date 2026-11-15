package com.wimpyclient.e;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class a$a {
   public int scanFlags;
   public int likelihood;
   public int siteLikelihood;
   private static int Tvea0eUmrz;
   private transient int cpm1yuavmV;

   public a$a() {
super();
      int var4 = 1735565110 ^ 337837551;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 258723028:
               var4 = 1834785858 ^ var4;
            case 1632454364:
               var4 = 141977470 ^ 1593842608 ^ Integer.parseInt("1232765525");
               this.cpm1yuavmV = 19923236 ^ Tvea0eUmrz;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
                     case 171520832:
                        var4 = 1687171010 ^ var4;
                        return;
                     case 976937871:
                        return;
                     case 1403307098:
                        break;
                     case 1670520326:
                     default:
                        throw new RuntimeException();
                  }
               }
            case 366960698:
               break;
            case 1886538244:
            default:
               throw new RuntimeException();
         }
      }
   }

   public int effectiveFlags() {
      int var5 = 1138036510 ^ 1506362757 ^ 446539786;
      var5 = 1206765847 ^ var5;
      return this.scanFlags;
   }

   public void refreshLikelihood() {
      int var17 = 1166032972 ^ 1275462517 ^ 446539786;
      var17 = 1497748285 ^ var17;
      byte var1 = (byte)(1247688718 ^ var17);
      int var5 = var1;
      int var7 = this.scanFlags;
      int var2 = 1247164431 ^ var17;
      int var8 = var7 & var2;
      if (var8 != (1247688718 ^ var17)) {
         var17 = 1768033148 ^ var17;
         int var10 = this.siteLikelihood;
         var5 = var10;
         var17 = 658368488 ^ var17;
      } else {
         label16:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var17)) {
               case 1492677:
                  var17 ^= 1314909332;
               case 136807473:
                  break label16;
               case 1299112606:
               default:
                  throw new RuntimeException();
               case 1630884393:
            }
         }
      }

      byte var12 = (byte)(67228826 ^ var17);
      byte var3 = (byte)(67228926 ^ var17);
      int var14 = Math.min(var3, var5);
      int var13 = Math.max(var12, var14);
      this.likelihood = var13;
   }

   static {
      int var3 = new Random(4240776391071311187L).nextInt();
      Tvea0eUmrz = -958358223 ^ var3;
   }

   public static String bhpjzlpmlo(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] jevhsraiaflrdfi() {
      return new byte[]{
         120,
         40,
         57,
         39,
         60,
         85,
         97,
         110,
         65,
         60,
         126,
         106,
         80,
         65,
         72,
         73,
         29,
         74,
         26,
         85,
         112,
         105,
         50,
         83,
         36,
         75,
         18,
         14,
         123,
         112,
         125,
         88,
         24,
         26,
         101,
         15,
         79,
         8,
         39,
         91,
         67,
         5,
         37,
         64,
         28,
         106,
         34,
         98,
         52,
         76,
         70,
         96,
         119,
         50,
         7,
         58,
         31,
         121,
         102,
         51,
         97,
         74,
         114,
         92,
         106,
         114,
         20,
         37,
         77,
         92,
         106,
         99,
         121,
         113,
         4,
         80,
         25,
         104,
         56,
         16,
         42,
         27,
         102,
         35,
         109,
         56,
         11,
         45,
         101,
         78,
         10,
         85,
         125,
         67,
         102,
         96,
         105,
         51,
         6,
         92,
         51,
         9,
         115,
         6,
         6,
         82,
         110,
         108,
         71,
         70,
         57,
         33,
         1
      };
   }
}
