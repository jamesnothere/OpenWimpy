package com.wimpyclient.e;

import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class d {
   private final BlockPos pos;
   private final d$a kind;
   private static int lFNBkrXu4M;
   private transient int tHpu3cC4av;
   private static String dubvdipnbc = ByteBuffer.wrap(yrbeugkcejxcjaw()).asCharBuffer().toString();

   public d(BlockPos pos, d$a kind) {
super();
      int var10 = 435120537 ^ 1988186616;
      
      var10 = 1044048065 ^ var10;
      var10 = 1008074716 ^ 2008075499 ^ Integer.parseInt("452060055");
      this.tHpu3cC4av = 1519083777 ^ lFNBkrXu4M;
      var10 = 1058511046 ^ var10;
      this.pos = pos;
      this.kind = kind;
   }

   public static d$a ofVisible(Block var0) {
      int var7 = 185949742 ^ 16752071 ^ 135369864;
      var7 = 1193377207 ^ var7;
      Block var2 = Blocks.AMETHYST_CLUSTER;
      if (var0 == var2) {
         var7 = 1597679583 ^ var7;
         return d$a.CLUSTER;
      } else {
         var7 = wxqxohcteppxbpji(var7, 898951);
         return null;
      }
   }

   public static d prefer(d var0, d var1) {
      int var15 = 308610185 ^ 516142736 ^ 135369864;
      var15 = 1026333205 ^ var15;
      if (var0 == null) {
         var15 = 1915862596 ^ var15;
         return var1;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
               case 261981348:
                  var15 ^= 1161055514;
               case 1115300415:
                  if (var1 == null) {
                     var15 = 2124433867 ^ var15;
                     return var0;
                  }

                  label42:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
                        case 26515597:
                           var15 ^= 1107085939;
                           break label42;
                        case 353885739:
                           break;
                        case 1093959498:
                           break label42;
                        case 1803114862:
                        default:
                           throw new IllegalStateException();
                     }
                  }

                  d$a var7 = var1.kind();
                  int var8 = var7.rank();
                  d$a var11 = var0.kind();
                  int var12 = var11.rank();
                  if (var8 <= var12) {
                     var15 = wxqxohcteppxbpji(var15, 1486040917);
                     var15 = 2060660445 ^ var15;
                     return var0;
                  }

                  var15 = 1943123667 ^ var15;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
                        case 136101674:
                           var15 = 1368504155 ^ var15;
                           return var1;
                        case 344863137:
                        default:
                           throw new IllegalStateException();
                        case 416559387:
                           break;
                        case 422299314:
                           return var1;
                     }
                  }
               case 805191514:
               default:
                  throw new IllegalStateException();
               case 940066096:
            }
         }
      }
   }

   @Override
   public final String toString() {
      int var5 = 1984321404 ^ 1649679653 ^ 1385887113;
      var5 = 359322578 ^ var5;
      return "d[pos=" + this.pos + ", kind=" + this.kind + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 822706388 ^ 135756227 ^ 1385887113;
      var5 = 1524745780 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.pos);
      result = 31 * result + Objects.hashCode(this.kind);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 784329600 ^ 525066024 ^ 1385887113;
      var7 = 2121437922 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      d other = (d)var1;
      return Objects.equals(this.pos, other.pos) &&
      Objects.equals(this.kind, other.kind);
   }

   public BlockPos pos() {
      int var5 = 253017081 ^ 1968267725 ^ 1385887113;
      var5 = 1773275286 ^ var5;
      return this.pos;
   }

   public d$a kind() {
      int var5 = 1021627562 ^ 253824557 ^ 1385887113;
      var5 = 1804865563 ^ var5;
      return this.kind;
   }

   static {
      int var3 = new Random(-3336845549929248409L).nextInt();
      lFNBkrXu4M = 699449742 ^ var3;
   }

   public static String yqckmdmgyx(byte[] var0, int var1) {
      String var13 = Integer.toString(var1);
      byte[] var14 = var13.getBytes();
      byte[] var8 = var14;
      byte var3 = 0;
      byte var16 = var0[var3];
      short var36 = 255;
      int var17 = var16 & var36;
      byte var37 = 24;
      int var18 = var17 << var37;
      byte var4 = 1;
      byte var39 = var0[var4];
      short var68 = 255;
      int var40 = var39 & var68;
      byte var69 = 16;
      int var41 = var40 << var69;
      int var19 = var18 | var41;
      byte var70 = 2;
      byte var43 = var0[var70];
      short var71 = 255;
      int var44 = var43 & var71;
      byte var72 = 8;
      int var45 = var44 << var72;
      int var20 = var19 | var45;
      byte var73 = 3;
      byte var47 = var0[var73];
      short var74 = 255;
      int var48 = var47 & var74;
      int var21 = var20 | var48;
      byte var49 = 4;
      byte var23 = var0[var49];
      short var50 = 255;
      int var24 = var23 & var50;
      byte var51 = 24;
      int var25 = var24 << var51;
      byte var75 = 5;
      byte var53 = var0[var75];
      short var76 = 255;
      int var54 = var53 & var76;
      byte var77 = 16;
      int var55 = var54 << var77;
      int var26 = var25 | var55;
      byte var78 = 6;
      byte var57 = var0[var78];
      short var79 = 255;
      int var58 = var57 & var79;
      byte var80 = 8;
      int var59 = var58 << var80;
      int var27 = var26 | var59;
      byte var81 = 7;
      byte var61 = var0[var81];
      short var82 = 255;
      int var62 = var61 & var82;
      int var28 = var27 | var62;
      String var29 = dubvdipnbc;
      int var84 = var28 + var21;
      String var30 = var29.substring(var28, var84);
      Charset var64 = StandardCharsets.UTF_16BE;
      byte[] var31 = var30.getBytes(var64);
      byte[] var11 = var31;
      byte var32 = 0;
      int var12 = var32;

      while (true) {
         int var66 = var11.length;
         if (var12 >= var66) {
            Charset var89 = StandardCharsets.UTF_16BE;
            return new String(var11, var89);
         }

         byte var86 = var11[var12];
         int var93 = var8.length;
         int var92 = var12 % var93;
         byte var91 = var8[var92];
         int var87 = var86 ^ var91;
         byte var88 = (byte)var87;
         var11[var12] = var88;
         var12++;
      }
   }

   private static byte[] yrbeugkcejxcjaw() {
      return new byte[0];
   }

   private static int wxqxohcteppxbpji(int var0, int var1) {
      return var0 ^ var1;
   }
}
