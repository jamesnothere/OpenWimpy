package com.wimpyclient.s;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.PalettedContainer;

@Environment(EnvType.CLIENT)
final class a$d {
   private final int x;
   private final int z;
   private final PalettedContainer<BlockState>[] sections;
   private static int oQivccngpi;
   private transient int MuitdUME6h;
   private static byte[] ggnrvgansr = msawwbqsihetybj();

   public a$d(int x, int z, PalettedContainer<BlockState>[] sections) {
super();
      int var13 = 2110379786 ^ 2001679551;
      
      var13 = fmwpjlbobdcdllal(var13, 150822967);
      var13 = 1062066961 ^ 650470641 ^ Integer.parseInt("468925538");
      this.MuitdUME6h = 1774066325 ^ oQivccngpi;
      var13 = fmwpjlbobdcdllal(var13, 1792118349);
      this.x = x;
      this.z = z;
      this.sections = sections;
   }

   @Override
   public final String toString() {
      int var5 = 256166660 ^ 1475513 ^ 819489557;
      var5 = 585228581 ^ var5;
      return "a$d[x=" + this.x + ", z=" + this.z + ", sections=" + this.sections + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 3454050 ^ 1784014687 ^ 819489557;
      var5 = 1014464373 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.x);
      result = 31 * result + Objects.hashCode(this.z);
      result = 31 * result + Objects.hashCode(this.sections);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1342813571 ^ 2097758644 ^ 819489557;
      var7 = 2051347273 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      a$d other = (a$d)var1;
      return this.x == other.x &&
      this.z == other.z &&
      Objects.equals(this.sections, other.sections);
   }

   public int x() {
      int var5 = 2058850018 ^ 914296778 ^ 819489557;
      var5 = 1970462671 ^ var5;
      return this.x;
   }

   public int z() {
      int var5 = 2034410167 ^ 908150558 ^ 819489557;
      var5 = 649825388 ^ var5;
      return this.z;
   }

   public PalettedContainer<BlockState>[] sections() {
      int var5 = 2000205873 ^ 748880122 ^ 819489557;
      var5 = 339884957 ^ var5;
      return this.sections;
   }

   static {
      int var3 = new Random(-5716057518737578075L).nextInt();
      oQivccngpi = 873750802 ^ var3;
   }

   public static String urmxzsijsl(byte[] var0, int var1) {
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
         byte[] var27 = ggnrvgansr;
         byte[] var34 = ggnrvgansr;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] msawwbqsihetybj() {
      return new byte[]{
         22,
         20,
         49,
         28,
         111,
         18,
         38,
         109,
         37,
         89,
         4,
         100,
         61,
         66,
         29,
         75,
         4,
         121,
         105,
         62,
         3,
         15,
         100,
         40,
         90,
         107,
         101,
         93,
         123,
         5,
         100,
         36,
         69,
         78,
         85,
         89,
         47,
         96,
         108,
         60,
         63
      };
   }

   private static int fmwpjlbobdcdllal(int var0, int var1) {
      return var0 ^ var1;
   }
}
