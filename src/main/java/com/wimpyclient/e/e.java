package com.wimpyclient.e;

import java.util.Objects;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class e {
   private final BlockPos pos;
   private final int grown;
   private final int total;
   private final List<d> crystals;
   private static int DMsaduagQp;
   private transient int f3cIhp0Bmyl;
   private static byte[] kxihvhukpy = dorzudwkrqhqhmu();

   public e(BlockPos pos, int grown, int total, List<d> crystals) {
super();
      int var22 = 1359535108 ^ 1257935086;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
            case 103116535:
               var22 = 228098549 ^ var22;
            case 51815935:
               var22 = 259635724 ^ 790529915 ^ Integer.parseInt("906883176");
               this.f3cIhp0Bmyl = 1906607771 ^ DMsaduagQp;

               label44:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                     case 191822598:
                        var22 ^= 247483230;
                        break label44;
                     case 903638031:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1922085136:
                        break label44;
                     case 1985491966:
                  }
               }

               List var11;
               label37: {
                  if (crystals != null) {
                     var22 = 1438617629 ^ var22;
                     boolean var9 = crystals.isEmpty();
                     if (!var9) {
                        label31:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                              case 89691719:
                                 var22 ^= 1598862293;
                                 break label31;
                              case 188019046:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 748678690:
                                 break label31;
                              case 1213813522:
                           }
                        }

                        var11 = List.copyOf(crystals);
                        var22 = 1251261799 ^ var22;
                        break label37;
                     }

                     var22 = 295588045 ^ var22;
                  } else {
                     var22 = 1143062736 ^ var22;
                  }

                  var11 = List.of();
                  var22 = 71720575 ^ var22;
               }

               this.pos = pos;
               this.grown = grown;
               this.total = total;
               this.crystals = var11;
               return;
            case 759470443:
            default:
               throw new RuntimeException(new IOException());
            case 2026078575:
         }
      }
   }

   @Override
   public final String toString() {
      int var5 = 463408987 ^ 960213350 ^ 167074250;
      var5 = 10161424 ^ var5;
      return "e[pos=" + this.pos + ", grown=" + this.grown + ", total=" + this.total + ", crystals=" + this.crystals + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1591066931 ^ 1400427904 ^ 167074250;
      var5 = 2021026020 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.pos);
      result = 31 * result + Objects.hashCode(this.grown);
      result = 31 * result + Objects.hashCode(this.total);
      result = 31 * result + Objects.hashCode(this.crystals);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1172372191 ^ 1143239531 ^ 167074250;
      var7 = 1332430030 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      e other = (e)var1;
      return Objects.equals(this.pos, other.pos) &&
      this.grown == other.grown &&
      this.total == other.total &&
      Objects.equals(this.crystals, other.crystals);
   }

   public BlockPos pos() {
      int var5 = 263380844 ^ 454552406 ^ 167074250;
      var5 = 2124158749 ^ var5;
      return this.pos;
   }

   public int grown() {
      int var5 = 1631430661 ^ 1455069378 ^ 167074250;
      var5 = 1781053350 ^ var5;
      return this.grown;
   }

   public int total() {
      int var5 = 222353739 ^ 812543755 ^ 167074250;
      var5 = 682209574 ^ var5;
      return this.total;
   }

   public List<d> crystals() {
      int var5 = 451276368 ^ 1250514617 ^ 167074250;
      var5 = 1493320561 ^ var5;
      return this.crystals;
   }

   static {
      int var3 = new Random(2711728638866800467L).nextInt();
      DMsaduagQp = 1785369726 ^ var3;
   }

   public static String czcdscjzue(byte[] var0, int var1) {
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
         byte[] var27 = kxihvhukpy;
         byte[] var34 = kxihvhukpy;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] dorzudwkrqhqhmu() {
      return new byte[]{
         91,
         111,
         13,
         50,
         72,
         13,
         123,
         6,
         19,
         10,
         40,
         104,
         116,
         99,
         33,
         111,
         93,
         106,
         85,
         12,
         127,
         44,
         13,
         50,
         17,
         53,
         116,
         36,
         99,
         14,
         56,
         85,
         93,
         83,
         70,
         22,
         9,
         19,
         16,
         22,
         68,
         72,
         101,
         70,
         19,
         24,
         93,
         82,
         97,
         24,
         59,
         55,
         37,
         12,
         88,
         50,
         14,
         41,
         88,
         2,
         118,
         72,
         28,
         54,
         39,
         102,
         35,
         59,
         77,
         55,
         61,
         124,
         29,
         27,
         101,
         110,
         101,
         27,
         62,
         6,
         60,
         85,
         24,
         50,
         85,
         125,
         41,
         96,
         51,
         18,
         37,
         113,
         53,
         62,
         125,
         114,
         27,
         84,
         36,
         72,
         35,
         54,
         22,
         114,
         6,
         27
      };
   }
}
