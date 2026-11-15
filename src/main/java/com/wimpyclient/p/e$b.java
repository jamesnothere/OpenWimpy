package com.wimpyclient.p;

import java.util.Objects;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class e$b {
   private final int chunkX;
   private final int chunkZ;
   private final int minY;
   private final int seaLevel;
   private final int[][] sections;
   private final int[] surfaceAir;
   private static int SkkEjBTVZb;
   private transient int jSMXuKGG4l;

   public e$b(int chunkX, int chunkZ, int minY, int seaLevel, int[][] sections, int[] surfaceAir) {
super();
      int var22 = 1992929296 ^ 864227379;
      

      label25:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
            case 104911625:
               var22 = 463323159 ^ var22;
            case 1422896627:
               var22 = 617133463 ^ 1318800744 ^ Integer.parseInt("881105099");
               this.jSMXuKGG4l = 1018264775 ^ SkkEjBTVZb;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                     case 130094259:
                        var22 = 1893332742 ^ var22;
                     case 413895547:
                        break label25;
                     case 777673820:
                        break;
                     case 1163261748:
                     default:
                        throw new IllegalStateException();
                  }
               }
            case 107515529:
            default:
               throw new IllegalStateException();
            case 539690512:
         }
      }

      this.chunkX = chunkX;
      this.chunkZ = chunkZ;
      this.minY = minY;
      this.seaLevel = seaLevel;
      this.sections = sections;
      this.surfaceAir = surfaceAir;
   }

   public int originX() {
      int var7 = 1280789352 ^ 1602915799 ^ 811118535;
      var7 = 1231292068 ^ var7;
      int var3 = this.chunkX;
      byte var2 = (byte)(1793159128 ^ var7);
      return var3 << var2;
   }

   public int originZ() {
      int var7 = 310830696 ^ 687676805 ^ 811118535;
      var7 = 1157017308 ^ var7;
      int var3 = this.chunkZ;
      byte var2 = (byte)(1322646258 ^ var7);
      return var3 << var2;
   }

   public int maxY() {
      int var13 = 1085418878 ^ 2046368160 ^ 811118535;
      var13 = 713746633 ^ var13;
      int var4 = this.minY;
      int[][] var7 = this.sections;
      int var8 = var7.length;
      byte var3 = (byte)(597259200 ^ var13);
      int var9 = var8 * var3;
      int var5 = var4 + var9;
      byte var10 = (byte)(597259217 ^ var13);
      return var5 - var10;
   }

   public BlockState get(int var1, int var2, int var3) {
      int var32 = 517264739 ^ 1244104616 ^ 811118535;
      var32 = 1964386890 ^ var32;
      if (var1 >= (297654086 ^ var32)) {
         var32 = 1809617740 ^ var32;
         byte var5 = (byte)(2053194757 ^ var32);
         if (var1 <= var5) {
            var32 = 1616014286 ^ var32;
            if (var3 >= (439562180 ^ var32)) {
               var32 = 1513856095 ^ var32;
               byte var25 = (byte)(1074312084 ^ var32);
               if (var3 <= var25) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
                        case 202415092:
                           var32 ^= 1254044378;
                        case 1435090254:
                           int[] var14 = this.sectionAt(var2);
                           if (var14 == null) {
                              var32 = 795109346 ^ var32;
                              Block var16 = Blocks.AIR;
                              return var16.defaultBlockState();
                           }

                           var32 = 1730139421 ^ var32;
                           byte var27 = (byte)(1839748179 ^ var32);
                           int var19 = var2 & var27;
                           int var29 = e.index(var1, var19, var3);
                           int var21 = var14[var29];
                           return Block.stateById(var21);
                        case 905555535:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1323890990:
                     }
                  }
               }

               var32 = 571526840 ^ var32;
            } else {
               var32 = 2016105191 ^ var32;
            }
         } else {
            var32 = fiektsghkuxokvnp(var32, 410597673);
         }
      } else {
         var32 = 1940236901 ^ var32;
      }

      Block var23 = Blocks.AIR;
      return var23.defaultBlockState();
   }

   public Block block(int var1, int var2, int var3) {
      int var12 = 699466931 ^ 984194999 ^ 811118535;
      var12 = 802093297 ^ var12;
      BlockState var8 = this.get(var1, var2, var3);
      return var8.getBlock();
   }

   public boolean isAir(int var1, int var2, int var3) {
      int var12 = 593389012 ^ 584219916 ^ 811118535;
      var12 = 1385579653 ^ var12;
      BlockState var8 = this.get(var1, var2, var3);
      return var8.isAir();
   }

   int[] sectionAt(int var1) {
      int var21 = 915125071 ^ 686659228 ^ 811118535;
      var21 = 1349949155 ^ var21;
      int var13 = this.minY;
      int var5 = var1 - var13;
      byte var14 = (byte)(2118655219 ^ var21);
      int var6 = var5 >> var14;
      if (var6 >= (2118655223 ^ var21)) {
         var21 = 1795769122 ^ var21;
         int[][] var16 = this.sections;
         int var17 = var16.length;
         if (var6 < var17) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var21)) {
                  case 154057965:
                     var21 = 1082234166 ^ var21;
                  case 603938069:
                     int[][] var10 = this.sections;
                     return var10[var6];
                  case 1059825586:
                  default:
                     throw new IllegalStateException();
                  case 1108041666:
               }
            }
         }

         var21 = 1831025896 ^ var21;
      } else {
         var21 = 103448522 ^ var21;
      }

      return null;
   }

   public boolean hasSection(int var1) {
      int var8 = 1761827837 ^ 532336363 ^ 811118535;
      var8 = 1421546298 ^ var8;
      int[] var4 = this.sectionAt(var1);
      if (var4 == null) {
         var8 = 181372228 ^ var8;
         byte var14 = (byte)(412462255 ^ var8);
         var8 = 974546503 ^ var8;
         return (var14 != 0);
      } else {
         var8 = 1413800394 ^ var8;
         byte var5 = (byte)(1176422432 ^ var8);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
               case 131851681:
                  var8 = 1688011465 ^ var8;
                  return (var5 != 0);
               case 702299354:
               default:
                  throw new IllegalStateException();
               case 1344164908:
                  return (var5 != 0);
               case 1463991209:
            }
         }
      }
   }

   @Override
   public final String toString() {
      int var5 = 717327250 ^ 9848683 ^ 811118535;
      var5 = 1654370515 ^ var5;
      return "e$b[chunkX=" + this.chunkX + ", chunkZ=" + this.chunkZ + ", minY=" + this.minY + ", seaLevel=" + this.seaLevel + ", sections=" + this.sections + ", surfaceAir=" + this.surfaceAir + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1249345161 ^ 1792353165 ^ 811118535;
      var5 = 456896914 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.chunkX);
      result = 31 * result + Objects.hashCode(this.chunkZ);
      result = 31 * result + Objects.hashCode(this.minY);
      result = 31 * result + Objects.hashCode(this.seaLevel);
      result = 31 * result + Objects.hashCode(this.sections);
      result = 31 * result + Objects.hashCode(this.surfaceAir);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 449314513 ^ 2106164582 ^ 811118535;
      var7 = 240106060 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      e$b other = (e$b)var1;
      return this.chunkX == other.chunkX &&
      this.chunkZ == other.chunkZ &&
      this.minY == other.minY &&
      this.seaLevel == other.seaLevel &&
      Objects.equals(this.sections, other.sections) &&
      Objects.equals(this.surfaceAir, other.surfaceAir);
   }

   public int chunkX() {
      int var5 = 1578226518 ^ 525884908 ^ 811118535;
      var5 = 1770757387 ^ var5;
      return this.chunkX;
   }

   public int chunkZ() {
      int var5 = 649061905 ^ 1169776698 ^ 811118535;
      var5 = 502507865 ^ var5;
      return this.chunkZ;
   }

   public int minY() {
      int var5 = 1794722353 ^ 115750817 ^ 811118535;
      var5 = 479142962 ^ var5;
      return this.minY;
   }

   public int seaLevel() {
      int var5 = 681366554 ^ 1395385743 ^ 811118535;
      var5 = 1063496701 ^ var5;
      return this.seaLevel;
   }

   public int[][] sections() {
      int var5 = 493504496 ^ 1208789928 ^ 811118535;
      var5 = 1302405306 ^ var5;
      return this.sections;
   }

   public int[] surfaceAir() {
      int var5 = 75729668 ^ 2041804060 ^ 811118535;
      var5 = 1587302560 ^ var5;
      return this.surfaceAir;
   }

   static {
      int var3 = new Random(-6798393937367585757L).nextInt();
      SkkEjBTVZb = 426273921 ^ var3;
   }

   public static String ngqkysfrns(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] peqvseyytevjhdy() {
      return new byte[]{
         6,
         115,
         49,
         60,
         4,
         103,
         104,
         62,
         40,
         120,
         75,
         114,
         103,
         99,
         58,
         90,
         53,
         89,
         32,
         121,
         46,
         76,
         70,
         10,
         124,
         84,
         17,
         124,
         64,
         124,
         103,
         57,
         113,
         110,
         119,
         57,
         77,
         15,
         72,
         75,
         53,
         113,
         107,
         7,
         92,
         124,
         13,
         115,
         48,
         15,
         73,
         122,
         32,
         47,
         95,
         15,
         94,
         6,
         63,
         57,
         4,
         53,
         31,
         112,
         72,
         82,
         123,
         6,
         62,
         97,
         19,
         50,
         64,
         108,
         92,
         108,
         12,
         67,
         83,
         6,
         1,
         29,
         98,
         1,
         19,
         64
      };
   }

   private static int fiektsghkuxokvnp(int var0, int var1) {
      return var1 ^ var0;
   }
}
