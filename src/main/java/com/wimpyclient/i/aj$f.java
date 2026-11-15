package com.wimpyclient.i;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.Vec3;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class aj$f {
   public final BlockPos against;
   public final Direction face;
   public final Vec3 hit;
   private static int b68bJmNQXi;
   private transient int EZCmACPr5D;

   public aj$f(BlockPos against, Direction face, Vec3 hit) {
super();
      int var13 = 671082251 ^ 1837459706;
      

      label25:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
            case 5061784:
               var13 = 1844380991 ^ var13;
            case 252001725:
               var13 = 2103874584 ^ 1829499568 ^ Integer.parseInt("939060326");
               this.EZCmACPr5D = 1320974305 ^ b68bJmNQXi;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
                     case 203419283:
                        break;
                     case 212966266:
                        var13 = 25590246 ^ var13;
                     case 1468489336:
                        break label25;
                     case 2038593619:
                     default:
                        throw new IllegalStateException();
                  }
               }
            case 1054033420:
               break;
            case 1058337491:
            default:
               throw new IllegalStateException();
         }
      }

      this.against = against;
      this.face = face;
      this.hit = hit;
   }

   @Override
   public final String toString() {
      int var5 = 276255395 ^ 789283447 ^ 533031643;
      var5 = 1958517001 ^ var5;
      return "aj$f[against=" + this.against + ", face=" + this.face + ", hit=" + this.hit + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 12690664 ^ 1162405521 ^ 533031643;
      var5 = 1208610897 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.against);
      result = 31 * result + Objects.hashCode(this.face);
      result = 31 * result + Objects.hashCode(this.hit);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 120825903 ^ 1377058938 ^ 533031643;
      var7 = 927619114 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      aj$f other = (aj$f)var1;
      return Objects.equals(this.against, other.against) &&
      Objects.equals(this.face, other.face) &&
      Objects.equals(this.hit, other.hit);
   }

   public BlockPos against() {
      int var5 = 1403798785 ^ 92772792 ^ 533031643;
      var5 = 1495298314 ^ var5;
      return this.against;
   }

   public Direction face() {
      int var5 = 768572775 ^ 1270922132 ^ 533031643;
      var5 = 430760868 ^ var5;
      return this.face;
   }

   public Vec3 hit() {
      int var5 = 168733318 ^ 421455138 ^ 533031643;
      var5 = 911734894 ^ var5;
      return this.hit;
   }

   static {
      int var3 = new Random(-5316571129864794050L).nextInt();
      b68bJmNQXi = -1282207510 ^ var3;
   }

   public static String sacelhrwib(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] knmqsdoywepqair() {
      return new byte[]{
         94,
         44,
         57,
         14,
         6,
         116,
         57,
         99,
         17,
         22,
         25,
         120,
         65,
         51,
         69,
         13,
         87,
         16,
         2,
         45,
         57,
         87,
         108,
         32,
         61,
         92,
         89,
         115,
         111,
         110,
         114,
         11,
         123,
         40,
         25,
         14,
         84,
         108,
         89,
         121,
         26,
         101,
         6,
         36,
         86,
         66,
         123,
         17,
         49,
         37,
         69,
         121,
         29,
         26,
         66,
         123,
         74,
         26,
         58,
         85,
         84,
         53,
         55,
         25,
         125,
         27,
         87,
         18,
         112,
         48,
         41,
         30,
         35,
         118,
         27,
         11,
         74,
         14,
         97,
         65,
         98,
         114,
         44,
         78,
         74,
         4,
         77,
         83,
         36,
         68,
         4,
         62,
         65,
         30,
         66,
         68,
         3,
         66,
         68
      };
   }
}
