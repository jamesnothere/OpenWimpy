package com.wimpyclient.u;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class c$a {
   private final BlockPos rel;
   private final BlockState state;
   private static int AIAfuKSOCh;
   private transient int Q5cI9htYYo;

   public c$a(BlockPos rel, BlockState state) {
super();
      int var14 = 856853261 ^ 418311972;
      
      var14 = 434476602 ^ var14;
      var14 = 979246475 ^ 1052991566 ^ Integer.parseInt("914657238");
      this.Q5cI9htYYo = 624811174 ^ AIAfuKSOCh;
      var14 = qkubtyalfpgjurnq(var14, 583884536);
      if (rel != null) {
         var14 = 1747817775 ^ var14;
         if (state != null) {
            var14 = 52194013 ^ var14;
            this.rel = rel;
            this.state = state;
            return;
         }

         var14 = 443241485 ^ var14;
      } else {
         label20:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
               case 10231763:
                  var14 = 1917239586 ^ var14;
                  break label20;
               case 851905485:
                  break;
               case 1083202865:
                  break label20;
               case 1195597915:
               default:
                  throw new RuntimeException();
            }
         }
      }

      String var5 = "placement";
      IllegalArgumentException var10 = new IllegalArgumentException(var5);
      throw new RuntimeException(var10);
   }

   @Override
   public final String toString() {
      int var5 = 235995275 ^ 381911455 ^ 638413107;
      var5 = 731467678 ^ var5;
      return "c$a[rel=" + this.rel + ", state=" + this.state + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 676747793 ^ 2088822137 ^ 638413107;
      var5 = 1975651909 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.rel);
      result = 31 * result + Objects.hashCode(this.state);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1832614265 ^ 1809597330 ^ 638413107;
      var7 = 1206748997 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      c$a other = (c$a)var1;
      return Objects.equals(this.rel, other.rel) &&
      Objects.equals(this.state, other.state);
   }

   public BlockPos rel() {
      int var5 = 621260511 ^ 595844440 ^ 638413107;
      var5 = 1573863106 ^ var5;
      return this.rel;
   }

   public BlockState state() {
      int var5 = 16891337 ^ 441262912 ^ 638413107;
      var5 = 1081728847 ^ var5;
      return this.state;
   }

   static {
      int var3 = new Random(1987594085371797553L).nextInt();
      AIAfuKSOCh = 840555600 ^ var3;
   }

   public static String wuerhmyewo(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] esonuljyqrghetw() {
      return new byte[]{
         80, 58, 113, 30, 44, 77, 64, 101, 83, 23, 62, 30, 46, 98, 82, 79, 52, 49, 39, 101, 125, 44, 94, 66, 18, 27, 17, 36, 29, 95, 50, 65, 103, 36
      };
   }

   private static int qkubtyalfpgjurnq(int var0, int var1) {
      return var1 ^ var0;
   }
}
