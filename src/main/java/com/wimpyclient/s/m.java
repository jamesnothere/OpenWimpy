package com.wimpyclient.s;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class m {
   public static final byte AIR = 0;
   public static final byte WATER = 1;
   public static final byte LAVA = 2;
   public static final byte STONE = 3;
   public static final byte GRANITE = 4;
   public static final byte DIORITE = 5;
   public static final byte ANDESITE = 6;
   public static final byte TUFF = 7;
   public static final byte GRAVEL = 8;
   public static final byte DIRT = 9;
   public static final byte CLAY = 10;
   public static final byte ORE = 11;
   public static final byte OTHER = 12;
   public static final byte UNKNOWN = 15;
   public static final int FAMILY_GRANITE = 1;
   public static final int FAMILY_DIORITE = 2;
   public static final int FAMILY_ANDESITE = 4;
   public static final int FAMILY_GRAVEL = 8;
   private static volatile Map<Block, Byte> kinds;
   private static int gMWgEI2Zqi;
   private transient int f4okfusdHmb;

   private m() {
super();
      int var4 = 1692240329 ^ 54096880;
      
      var4 = tdlbaqjfteebeffd(var4, 1679720992);
      var4 = 360767996 ^ 1004221827 ^ Integer.parseInt("765570150");
      this.f4okfusdHmb = 1002826381 ^ gMWgEI2Zqi;
      var4 = tdlbaqjfteebeffd(var4, 736540435);
   }

   public static boolean isBase(byte var0) {
      int var8 = 436005702 ^ 2082461162 ^ 451703616;
      var8 = 1488666989 ^ var8;
      byte var2 = (byte)(666111106 ^ var8);
      if (var0 >= var2) {
         var8 = 886380789 ^ var8;
         byte var5 = (byte)(325129331 ^ var8);
         if (var0 <= var5) {
            var8 = 1632044181 ^ var8;
            byte var4 = (byte)(1915097312 ^ var8);
            var8 = 1051664070 ^ var8;
            return (var4 != 0);
         }

         label22:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
               case 93062337:
                  var8 ^= 461535148;
               case 807624307:
                  break label22;
               case 844687873:
               default:
                  throw new RuntimeException(new IOException());
               case 908110153:
            }
         }
      } else {
         var8 = tdlbaqjfteebeffd(var8, 794259289);
      }

      byte var14 = (byte)(149119960 ^ var8);
      var8 = 1147825663 ^ var8;
      return (var14 != 0);
   }

   public static boolean isOpen(byte var0) {
      int var9 = 1236835960 ^ 1107008354 ^ 451703616;
      var9 = 814850534 ^ var9;
      if (var0 != (574543804 ^ var9)) {
         var9 ^= 376551292;
         byte var2 = (byte)(877617345 ^ var9);
         if (var0 != var2) {
            var9 = 657762475 ^ var9;
            byte var6 = (byte)(326879337 ^ var9);
            if (var0 != var6) {
               var9 = tdlbaqjfteebeffd(var9, 1402959983);
               byte var5 = (byte)(1088729092 ^ var9);
               var9 = 850857616 ^ var9;
               return (var5 != 0);
            }

            var9 = 1704605626 ^ var9;
         } else {
            label31:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var9)) {
                  case 89784123:
                     var9 ^= 1118740241;
                     break label31;
                  case 341335849:
                  default:
                     throw new RuntimeException();
                  case 1345633197:
                     break label31;
                  case 1657469365:
               }
            }
         }
      } else {
         label25:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var9)) {
               case 39445442:
                  var9 ^= 1423911021;
                  break label25;
               case 116524517:
               default:
                  throw new RuntimeException();
               case 408481788:
                  break label25;
               case 1818405818:
            }
         }
      }

      byte var15 = (byte)(1994522576 ^ var9);
      var9 = tdlbaqjfteebeffd(var9, 78790981);
      return (var15 != 0);
   }

   public static int familyBit(byte var0) {
      int var5 = 1613726757 ^ 1001204820 ^ 451703616;
      var5 = 2136429926 ^ var5;
      switch (var0) {
         case 4:
            var5 = tdlbaqjfteebeffd(var5, 127506206);
            byte var19 = (byte)(966793544 ^ var5);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var5)) {
                  case 262539613:
                     var5 = 101077112 ^ var5;
                     return var19;
                  case 1691824439:
                  default:
                     throw new IllegalStateException();
                  case 2041592249:
                     return var19;
                  case 2109953694:
               }
            }
         case 5:
            var5 = tdlbaqjfteebeffd(var5, 966064755);
            byte var18 = (byte)(128807974 ^ var5);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var5)) {
                  case 120757068:
                     var5 = 940260629 ^ var5;
                     return var18;
                  case 129681869:
                     return var18;
                  case 1370385107:
                  default:
                     throw new IllegalStateException();
                  case 1372497861:
               }
            }
         case 6:
            label35:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var5)) {
                  case 51911013:
                  default:
                     throw new IllegalStateException();
                  case 143638001:
                     var5 ^= 928530178;
                  case 247634797:
                     break label35;
                  case 466614137:
               }
            }

            byte var17 = (byte)(157397329 ^ var5);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var5)) {
                  case 36523765:
                     var5 = 919074916 ^ var5;
                     return var17;
                  case 91504411:
                  default:
                     throw new IllegalStateException();
                  case 1881389944:
                     return var17;
                  case 2056084645:
               }
            }
         case 8:
            var5 = 1431019587 ^ var5;
            byte var16 = (byte)(1802645020 ^ var5);
            var5 = 1423206181 ^ var5;
            return var16;
         default:
            var5 = tdlbaqjfteebeffd(var5, 1549956426);
            byte var2 = (byte)(1650195229 ^ var5);
            var5 = tdlbaqjfteebeffd(var5, 1576907308);
            return var2;
      }
   }

   public static Block familyBlock(byte var0) {
      int var8 = 2143624208 ^ 1303092524 ^ 451703616;
      var8 = 386800991 ^ var8;
      switch (var0) {
         case 4:
            label46:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
                  case 186724575:
                     var8 ^= 12072054;
                     break label46;
                  case 207531141:
                     break;
                  case 598618007:
                     break label46;
                  case 1077460205:
                  default:
                     throw new RuntimeException();
               }
            }

            Block var19 = Blocks.GRANITE;
            var8 = 664125847 ^ var8;
            return var19;
         case 5:
            var8 = tdlbaqjfteebeffd(var8, 310870185);
            Block var18 = Blocks.DIORITE;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
                  case 60430412:
                  default:
                     throw new RuntimeException();
                  case 122029328:
                     var8 = 900363592 ^ var8;
                     return var18;
                  case 1400799729:
                     break;
                  case 1813384948:
                     return var18;
               }
            }
         case 6:
            label27:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
                  case 114066408:
                  default:
                     throw new RuntimeException();
                  case 186724575:
                     var8 ^= 1555403383;
                  case 1504037418:
                     break label27;
                  case 1671510572:
               }
            }

            Block var17 = Blocks.ANDESITE;
            var8 = 2073585558 ^ var8;
            return var17;
         case 8:
            var8 = tdlbaqjfteebeffd(var8, 1097776538);
            Block var3 = Blocks.GRAVEL;
            var8 = 1715685499 ^ var8;
            return var3;
         default:
            var8 = tdlbaqjfteebeffd(var8, 1923515630);
            String var5 = "not a blob kind: " + var0;
            IllegalArgumentException var4 = new IllegalArgumentException(var5);
            throw new RuntimeException(var4);
      }
   }

   public static byte of(BlockState var0) {
      int var15 = 1152038214 ^ 1597990027 ^ 451703616;
      var15 = 1022454584 ^ var15;
      byte var4 = (byte)((var0.isAir()) ? 1 : 0);
      if (var4 != (1032374709 ^ var15)) {
         var15 = 2020828954 ^ var15;
         return (byte)(1174122159 ^ var15);
      } else {
         var15 = tdlbaqjfteebeffd(var15, 1786466714);
         Map var5 = kinds();
         Block var12 = var0.getBlock();
         Object var6 = var5.get(var12);
         Byte var7 = (Byte)var6;
         if (var7 == null) {
            var15 = 1642401723 ^ var15;
            byte var23 = (byte)(907450264 ^ var15);
            var15 = 1969822019 ^ var15;
            return var23;
         } else {
            var15 = 2063982375 ^ var15;
            byte var9 = var7;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
                  case 119342441:
                     var15 = 1871301087 ^ var15;
                     return var9;
                  case 303757577:
                     break;
                  case 702744725:
                  default:
                     throw new IllegalStateException();
                  case 1751974281:
                     return var9;
               }
            }
         }
      }
   }

   private static Map<Block, Byte> kinds() {
      int var124 = 2102296564 ^ 1139867168 ^ 451703616;
      var124 = 1504182563 ^ var124;
      Map var0 = kinds;
      if (var0 != null) {
         var124 = 415978040 ^ var124;
         return var0;
      } else {
         var124 = tdlbaqjfteebeffd(var124, 412352507);
         IdentityHashMap var11 = new IdentityHashMap();
         IdentityHashMap var4 = var11;
         Block var46 = Blocks.STONE;
         byte var1 = (byte)(1701383247 ^ var124);
         Byte var60 = var1;
         Object var13 = var11.put(var46, var60);
         Block var47 = Blocks.DEEPSLATE;
         byte var61 = (byte)(1701383247 ^ var124);
         Byte var62 = var61;
         Object var15 = var11.put(var47, var62);
         Block var48 = Blocks.GRANITE;
         byte var63 = (byte)(1701383240 ^ var124);
         Byte var64 = var63;
         Object var17 = var11.put(var48, var64);
         Block var49 = Blocks.DIORITE;
         byte var65 = (byte)(1701383241 ^ var124);
         Byte var66 = var65;
         Object var19 = var11.put(var49, var66);
         Block var50 = Blocks.ANDESITE;
         byte var67 = (byte)(1701383242 ^ var124);
         Byte var68 = var67;
         Object var21 = var11.put(var50, var68);
         Block var51 = Blocks.TUFF;
         byte var69 = (byte)(1701383243 ^ var124);
         Byte var70 = var69;
         Object var23 = var11.put(var51, var70);
         Block var52 = Blocks.GRAVEL;
         byte var71 = (byte)(1701383236 ^ var124);
         Byte var72 = var71;
         Object var25 = var11.put(var52, var72);
         Block var53 = Blocks.DIRT;
         byte var73 = (byte)(1701383237 ^ var124);
         Byte var74 = var73;
         Object var27 = var11.put(var53, var74);
         Block var54 = Blocks.CLAY;
         byte var75 = (byte)(1701383238 ^ var124);
         Byte var76 = var75;
         Object var29 = var11.put(var54, var76);
         Block var55 = Blocks.WATER;
         byte var77 = (byte)(1701383245 ^ var124);
         Byte var78 = var77;
         Object var31 = var11.put(var55, var78);
         Block var56 = Blocks.LAVA;
         byte var79 = (byte)(1701383246 ^ var124);
         Byte var80 = var79;
         Object var33 = var11.put(var56, var80);
         byte var34 = (byte)(1701383256 ^ var124);
         Block[] var35 = new Block[var34];
         byte var81 = (byte)(1701383244 ^ var124);
         Block var2 = Blocks.COAL_ORE;
         var35[var81] = var2;
         byte var82 = (byte)(1701383245 ^ var124);
         Block var103 = Blocks.DEEPSLATE_COAL_ORE;
         var35[var82] = var103;
         byte var83 = (byte)(1701383246 ^ var124);
         Block var104 = Blocks.IRON_ORE;
         var35[var83] = var104;
         byte var84 = (byte)(1701383247 ^ var124);
         Block var105 = Blocks.DEEPSLATE_IRON_ORE;
         var35[var84] = var105;
         byte var85 = (byte)(1701383240 ^ var124);
         Block var106 = Blocks.COPPER_ORE;
         var35[var85] = var106;
         byte var86 = (byte)(1701383241 ^ var124);
         Block var107 = Blocks.DEEPSLATE_COPPER_ORE;
         var35[var86] = var107;
         byte var87 = (byte)(1701383242 ^ var124);
         Block var108 = Blocks.GOLD_ORE;
         var35[var87] = var108;
         byte var88 = (byte)(1701383243 ^ var124);
         Block var109 = Blocks.DEEPSLATE_GOLD_ORE;
         var35[var88] = var109;
         byte var89 = (byte)(1701383236 ^ var124);
         Block var110 = Blocks.REDSTONE_ORE;
         var35[var89] = var110;
         byte var90 = (byte)(1701383237 ^ var124);
         Block var111 = Blocks.DEEPSLATE_REDSTONE_ORE;
         var35[var90] = var111;
         byte var91 = (byte)(1701383238 ^ var124);
         Block var112 = Blocks.LAPIS_ORE;
         var35[var91] = var112;
         byte var92 = (byte)(1701383239 ^ var124);
         Block var113 = Blocks.DEEPSLATE_LAPIS_ORE;
         var35[var92] = var113;
         byte var93 = (byte)(1701383232 ^ var124);
         Block var114 = Blocks.DIAMOND_ORE;
         var35[var93] = var114;
         byte var94 = (byte)(1701383233 ^ var124);
         Block var115 = Blocks.DEEPSLATE_DIAMOND_ORE;
         var35[var94] = var115;
         byte var95 = (byte)(1701383234 ^ var124);
         Block var116 = Blocks.EMERALD_ORE;
         var35[var95] = var116;
         byte var96 = (byte)(1701383235 ^ var124);
         Block var117 = Blocks.DEEPSLATE_EMERALD_ORE;
         var35[var96] = var117;
         byte var97 = (byte)(1701383260 ^ var124);
         Block var118 = Blocks.RAW_IRON_BLOCK;
         var35[var97] = var118;
         byte var98 = (byte)(1701383261 ^ var124);
         Block var119 = Blocks.RAW_COPPER_BLOCK;
         var35[var98] = var119;
         byte var99 = (byte)(1701383262 ^ var124);
         Block var120 = Blocks.INFESTED_STONE;
         var35[var99] = var120;
         byte var100 = (byte)(1701383263 ^ var124);
         Block var121 = Blocks.INFESTED_DEEPSLATE;
         var35[var100] = var121;
         Block[] var5 = var35;
         int var37 = var35.length;
         int var6 = var37;
         byte var38 = (byte)(1701383244 ^ var124);
         int var7 = var38;
         var124 = 748725926 ^ var124;

         while (var7 < var6) {
            var124 = 465130695 ^ var124;
            Block var43 = var5[var7];
            byte var101 = (byte)(1383136806 ^ var124);
            Byte var102 = var101;
            Object var45 = var4.put(var43, var102);
            var7 += 1383136812 ^ var124;
            var124 = tdlbaqjfteebeffd(var124, 465130695);
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var124)) {
               case 251065068:
                  var124 = 1865480858 ^ var124;
               case 475407990:
                  kinds = var4;
                  return var4;
               case 689198045:
                  break;
               case 1785399697:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   static {
      int var3 = new Random(6904780674337312028L).nextInt();
      gMWgEI2Zqi = 1854430220 ^ var3;
   }

   public static String lcieqzbqir(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] zpddmwrsuylgdhy() {
      return new byte[]{
         25,
         35,
         82,
         69,
         118,
         90,
         117,
         33,
         61,
         95,
         46,
         33,
         123,
         79,
         33,
         55,
         75,
         40,
         40,
         12,
         71,
         48,
         50,
         57,
         56,
         19,
         102,
         118,
         105,
         13,
         107,
         6,
         52,
         118,
         61,
         94,
         126,
         4,
         107,
         27,
         121,
         126,
         113,
         54,
         28,
         92,
         119,
         101,
         33,
         77,
         52,
         86,
         14,
         18,
         112,
         15,
         107,
         21,
         105,
         122,
         35,
         77,
         7,
         83,
         90,
         119,
         30,
         29,
         90,
         56,
         97,
         25,
         1,
         37,
         56,
         35,
         73,
         102,
         31,
         83,
         12,
         32,
         44,
         17,
         67,
         56,
         118,
         4,
         65,
         15,
         11,
         48,
         39,
         122,
         44,
         116,
         2,
         10,
         70,
         117,
         69,
         92,
         11,
         25,
         41,
         76,
         90,
         61,
         30,
         31,
         1,
         86,
         24,
         27,
         87,
         85,
         91,
         36,
         72,
         80,
         59,
         123,
         6
      };
   }

   private static int tdlbaqjfteebeffd(int var0, int var1) {
      return var0 ^ var1;
   }
}
