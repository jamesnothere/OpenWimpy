package com.wimpyclient.p;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.EmptyBlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.shapes.VoxelShape;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class n {
   private static int RnIJH2aE3Z;
   private transient int vGjM0l6iYe;

   private n() {
super();
      int var4 = 2054028571 ^ 1909636340;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 113411072:
               var4 = 487480635 ^ var4;
            case 639364571:
               var4 = 13337905 ^ 636651162 ^ Integer.parseInt("864558975");
               this.vGjM0l6iYe = 134402232 ^ RnIJH2aE3Z;
               var4 = hnauzcjchrjmjhlt(var4, 996219688);
               return;
            case 329827790:
               break;
            case 799124430:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static boolean isSoftPlant(BlockState var0) {
      int var215 = 1142787630 ^ 570738288 ^ 179769835;
      var215 = 604512791 ^ var215;
      if (var0 != null) {
         var215 = 73999523 ^ var215;
         byte var9 = (byte)((var0.isAir()) ? 1 : 0);
         if (var9 == (1288658689 ^ var215)) {
            var215 = hnauzcjchrjmjhlt(var215, 831873531);
            byte var11 = (byte)((var0.canBeReplaced()) ? 1 : 0);
            if (var11 != (2103066362 ^ var215)) {
               var215 = 901280584 ^ var215;
               return (((byte)(1222790579 ^ var215)) != 0);
            }

            var215 = 16899649 ^ var215;
            Block var13 = var0.getBlock();
            byte var15 = (byte)((var13 instanceof LeavesBlock) ? 1 : 0);
            if (var15 != (2086396091 ^ var215)) {
               var215 = 721189226 ^ var215;
               return (((byte)(1453824465 ^ var215)) != 0);
            }

            var215 = 558713482 ^ var215;
            byte var17 = (byte)((var13 instanceof BushBlock) ? 1 : 0);
            if (var17 != (1561766449 ^ var215)) {
               var215 = 277325710 ^ var215;
               return (((byte)(1301351870 ^ var215)) != 0);
            } else {
               var215 = 278932502 ^ var215;
               byte var19 = (byte)((var13 instanceof FlowerBlock) ? 1 : 0);
               if (var19 != (1303807527 ^ var215)) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                        case 110227037:
                           var215 ^= 2591640;
                           return (((byte)(1301351870 ^ var215)) != 0);
                        case 877529329:
                           break;
                        case 1505067044:
                           return (((byte)(1301351870 ^ var215)) != 0);
                        case 1933622000:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               } else {
                  var215 = 453993033 ^ var215;
                  byte var21 = (byte)((var13 instanceof VineBlock) ? 1 : 0);
                  if (var21 != (1455023214 ^ var215)) {
                     var215 = 455666129 ^ var215;
                     return (((byte)(1301351870 ^ var215)) != 0);
                  }

                  var215 = hnauzcjchrjmjhlt(var215, 1402207793);
                  Class var23 = var13.getClass();
                  String var24 = var23.getSimpleName();
                  String var2 = rnycskfvrr(whhhkvgbdjlbajc(), nqjrszquvpirtry(), var215);
                  byte var26 = (byte)((var24.contains(var2)) ? 1 : 0);
                  if (var26 != (86645343 ^ var215)) {
                     var215 = 1058489323 ^ var215;
                     return (((byte)(977099189 ^ var215)) != 0);
                  }

                  var215 = 248990186 ^ var215;
                  String var155 = rnycskfvrr(vrbytctukoojvfm(), nqjrszquvpirtry(), var215);
                  byte var28 = (byte)((var24.contains(var155)) ? 1 : 0);
                  if (var28 == (201151413 ^ var215)) {
                     var215 = 1829239717 ^ var215;
                     String var156 = rnycskfvrr(smeugopmtwflnfy(), nqjrszquvpirtry(), var215);
                     byte var30 = (byte)((var24.contains(var156)) ? 1 : 0);
                     if (var30 != (1727703056 ^ var215)) {
                        var215 = 1556607396 ^ var215;
                        return (((byte)(977099189 ^ var215)) != 0);
                     }

                     var215 = 1759208483 ^ var215;
                     String var157 = rnycskfvrr(niowkclduzditfs(), nqjrszquvpirtry(), var215);
                     byte var32 = (byte)((var24.contains(var157)) ? 1 : 0);
                     if (var32 != (237095987 ^ var215)) {
                        var215 = hnauzcjchrjmjhlt(var215, 874288519);
                        return (((byte)(977099189 ^ var215)) != 0);
                     }

                     var215 = 1523293554 ^ var215;
                     String var158 = rnycskfvrr(uqjhqrudghottns(), nqjrszquvpirtry(), var215);
                     byte var34 = (byte)((var24.contains(var158)) ? 1 : 0);
                     if (var34 != (1424642369 ^ var215)) {
                        var215 = 212920458 ^ var215;
                        String var159 = rnycskfvrr(xckbvxyvhykdpef(), nqjrszquvpirtry(), var215);
                        byte var36 = (byte)((var24.contains(var159)) ? 1 : 0);
                        if (var36 == (1482340811 ^ var215)) {
                           var215 = hnauzcjchrjmjhlt(var215, 1650974847);
                           return (((byte)(977099189 ^ var215)) != 0);
                        }

                        var215 = 1864032681 ^ var215;
                     } else {
                        var215 = 1672087843 ^ var215;
                     }

                     String var160 = rnycskfvrr(zqlyxjkcbiwhmzf(), nqjrszquvpirtry(), var215);
                     byte var38 = (byte)((var24.contains(var160)) ? 1 : 0);
                     if (var38 == (926963810 ^ var215)) {
                        var215 ^= 508715437;
                        String var161 = rnycskfvrr(zkyphumusdhcgde(), nqjrszquvpirtry(), var215);
                        byte var40 = (byte)((var24.contains(var161)) ? 1 : 0);
                        if (var40 == (689060303 ^ var215)) {
                           var215 = 1279232229 ^ var215;
                           String var162 = rnycskfvrr(lbuyxxejvicdrnz(), nqjrszquvpirtry(), var215);
                           byte var42 = (byte)((var24.contains(var162)) ? 1 : 0);
                           if (var42 != (1697493290 ^ var215)) {
                              var215 = hnauzcjchrjmjhlt(var215, 1594943646);
                              return (((byte)(977099189 ^ var215)) != 0);
                           }

                           var215 = 861521122 ^ var215;
                           String var163 = rnycskfvrr(lrdghcbvqndiaak(), nqjrszquvpirtry(), var215);
                           byte var44 = (byte)((var24.contains(var163)) ? 1 : 0);
                           if (var44 != (1450472904 ^ var215)) {
                              var215 = 1816734844 ^ var215;
                              return (((byte)(977099189 ^ var215)) != 0);
                           }

                           var215 = 136006910 ^ var215;
                           String var164 = rnycskfvrr(ojysxyutihddvei(), nqjrszquvpirtry(), var215);
                           byte var46 = (byte)((var24.contains(var164)) ? 1 : 0);
                           if (var46 == (1584347446 ^ var215)) {
                              var215 ^= 57485552;
                              String var165 = rnycskfvrr(ydoebdpstcrlxqx(), nqjrszquvpirtry(), var215);
                              byte var48 = (byte)((var24.contains(var165)) ? 1 : 0);
                              if (var48 == (1560416710 ^ var215)) {
                                 var215 ^= 1225244622;
                                 String var166 = rnycskfvrr(jmsgkyfzkisuqqe(), nqjrszquvpirtry(), var215);
                                 byte var50 = (byte)((var24.contains(var166)) ? 1 : 0);
                                 if (var50 == (335916552 ^ var215)) {
                                    var215 ^= 1335778152;
                                    String var167 = rnycskfvrr(xqwqcdkjpdlztlq(), nqjrszquvpirtry(), var215);
                                    byte var52 = (byte)((var24.contains(var167)) ? 1 : 0);
                                    if (var52 == (1536947552 ^ var215)) {
                                       var215 = 1871710933 ^ var215;
                                       String var168 = rnycskfvrr(ssbaiuhkncjmrkk(), nqjrszquvpirtry(), var215);
                                       byte var54 = (byte)((var24.contains(var168)) ? 1 : 0);
                                       if (var54 != (873201589 ^ var215)) {
                                          var215 = 238462465 ^ var215;
                                          return (((byte)(977099189 ^ var215)) != 0);
                                       }

                                       var215 = 429849544 ^ var215;
                                       String var169 = rnycskfvrr(nhfhoapmezmdbcw(), nqjrszquvpirtry(), var215);
                                       byte var56 = (byte)((var24.contains(var169)) ? 1 : 0);
                                       if (var56 == (764740733 ^ var215)) {
                                          var215 = 1864931787 ^ var215;
                                          String var170 = rnycskfvrr(ktikmfxkopedwrj(), nqjrszquvpirtry(), var215);
                                          byte var58 = (byte)((var24.contains(var170)) ? 1 : 0);
                                          if (var58 != (1119722934 ^ var215)) {
                                             var215 = hnauzcjchrjmjhlt(var215, 2021704706);
                                             return (((byte)(977099189 ^ var215)) != 0);
                                          }

                                          var215 = 2141729140 ^ var215;
                                          String var171 = rnycskfvrr(rpvlrgghtzrgoda(), nqjrszquvpirtry(), var215);
                                          byte var60 = (byte)((var24.contains(var171)) ? 1 : 0);
                                          if (var60 == (1024830658 ^ var215)) {
                                             var215 = 1212857648 ^ var215;
                                             String var172 = rnycskfvrr(nheuypeyrpmpmqr(), nqjrszquvpirtry(), var215);
                                             byte var62 = (byte)((var24.contains(var172)) ? 1 : 0);
                                             if (var62 != (1969164786 ^ var215)) {
                                                var215 = 1331841094 ^ var215;
                                                return (((byte)(977099189 ^ var215)) != 0);
                                             }

                                             var215 = 679384422 ^ var215;
                                             TagKey var173 = BlockTags.FLOWERS;
                                             byte var64 = (byte)((var0.is(var173)) ? 1 : 0);
                                             if (var64 == (1562477716 ^ var215)) {
                                                var215 = 1466554921 ^ var215;
                                                TagKey var174 = BlockTags.SAPLINGS;
                                                byte var66 = (byte)((var0.is(var174)) ? 1 : 0);
                                                if (var66 == (172515005 ^ var215)) {
                                                   var215 = 389659011 ^ var215;
                                                   TagKey var175 = BlockTags.CROPS;
                                                   byte var68 = (byte)((var0.is(var175)) ? 1 : 0);
                                                   if (var68 == (494004030 ^ var215)) {
                                                      var215 = 604479274 ^ var215;
                                                      TagKey var176 = BlockTags.REPLACEABLE;
                                                      byte var70 = (byte)((var0.is(var176)) ? 1 : 0);
                                                      if (var70 == (964065300 ^ var215)) {
                                                         var215 = 20698269 ^ var215;
                                                         Block var177 = Blocks.SHORT_GRASS;
                                                         byte var72 = (byte)((var0.is(var177)) ? 1 : 0);
                                                         if (var72 == (944614537 ^ var215)) {
                                                            var215 = 529584287 ^ var215;
                                                            Block var178 = Blocks.TALL_GRASS;
                                                            byte var74 = (byte)((var0.is(var178)) ? 1 : 0);
                                                            if (var74 == (668826646 ^ var215)) {
                                                               var215 = 220162184 ^ var215;
                                                               Block var179 = Blocks.FERN;
                                                               byte var76 = (byte)((var0.is(var179)) ? 1 : 0);
                                                               if (var76 == (717362334 ^ var215)) {
                                                                  var215 = 128784305 ^ var215;
                                                                  Block var180 = Blocks.LARGE_FERN;
                                                                  byte var78 = (byte)((var0.is(var180)) ? 1 : 0);
                                                                  if (var78 == (762250031 ^ var215)) {
                                                                     var215 = 978878196 ^ var215;
                                                                     Block var181 = Blocks.DEAD_BUSH;
                                                                     byte var80 = (byte)((var0.is(var181)) ? 1 : 0);
                                                                     if (var80 == (389512667 ^ var215)) {
                                                                        var215 = 632805753 ^ var215;
                                                                        Block var182 = Blocks.SEAGRASS;
                                                                        byte var82 = (byte)((var0.is(var182)) ? 1 : 0);
                                                                        if (var82 == (847291554 ^ var215)) {
                                                                           var215 = 554258105 ^ var215;
                                                                           Block var183 = Blocks.TALL_SEAGRASS;
                                                                           byte var84 = (byte)((var0.is(var183)) ? 1 : 0);
                                                                           if (var84 == (327805467 ^ var215)) {
                                                                              var215 = 1472062961 ^ var215;
                                                                              Block var184 = Blocks.KELP;
                                                                              byte var86 = (byte)((var0.is(var184)) ? 1 : 0);
                                                                              if (var86 == (1144262634 ^ var215)) {
                                                                                 var215 = 951820932 ^ var215;
                                                                                 Block var185 = Blocks.KELP_PLANT;
                                                                                 byte var88 = (byte)((var0.is(var185)) ? 1 : 0);
                                                                                 if (var88 == (2089790830 ^ var215)) {
                                                                                    var215 = 863641158 ^ var215;
                                                                                    Block var186 = Blocks.HANGING_ROOTS;
                                                                                    byte var90 = (byte)((var0.is(var186)) ? 1 : 0);
                                                                                    if (var90 == (1341502248 ^ var215)) {
                                                                                       var215 = 910235156 ^ var215;
                                                                                       Block var187 = Blocks.SPORE_BLOSSOM;
                                                                                       byte var92 = (byte)((var0.is(var187)) ? 1 : 0);
                                                                                       if (var92 == (2041881916 ^ var215)) {
                                                                                          var215 = 1171621535 ^ var215;
                                                                                          Block var188 = Blocks.GLOW_LICHEN;
                                                                                          byte var94 = (byte)((var0.is(var188)) ? 1 : 0);
                                                                                          if (var94 == (1012999075 ^ var215)) {
                                                                                             var215 = 728362785 ^ var215;
                                                                                             Block var189 = Blocks.PINK_PETALS;
                                                                                             byte var96 = (byte)((var0.is(var189)) ? 1 : 0);
                                                                                             if (var96 == (386452610 ^ var215)) {
                                                                                                var215 = 1007330446 ^ var215;
                                                                                                Block var190 = Blocks.MOSS_CARPET;
                                                                                                byte var98 = (byte)((var0.is(var190)) ? 1 : 0);
                                                                                                if (var98 == (721577996 ^ var215)) {
                                                                                                   var215 = 1226096953 ^ var215;
                                                                                                   Block var191 = Blocks.SWEET_BERRY_BUSH;
                                                                                                   byte var100 = (byte)((var0.is(var191)) ? 1 : 0);
                                                                                                   if (var100 == (1645652277 ^ var215)) {
                                                                                                      var215 = 320921579 ^ var215;
                                                                                                      Block var192 = Blocks.CAVE_VINES;
                                                                                                      byte var102 = (byte)((var0.is(var192)) ? 1 : 0);
                                                                                                      if (var102 == (1899394782 ^ var215)) {
                                                                                                         var215 = 159660205 ^ var215;
                                                                                                         Block var193 = Blocks.CAVE_VINES_PLANT;
                                                                                                         byte var104 = (byte)((var0.is(var193)) ? 1 : 0);
                                                                                                         if (var104 == (2024951411 ^ var215)) {
                                                                                                            var215 ^= 1028415949;
                                                                                                            Block var194 = Blocks.TWISTING_VINES;
                                                                                                            byte var106 = (byte)((var0.is(var194)) ? 1 : 0);
                                                                                                            if (var106 == (1174286270 ^ var215)) {
                                                                                                               var215 = 1050115190 ^ var215;
                                                                                                               Block var195 = Blocks.TWISTING_VINES_PLANT;
                                                                                                               byte var108 = (byte)((var0.is(var195)) ? 1 : 0);
                                                                                                               if (var108 == (2070500296 ^ var215)) {
                                                                                                                  var215 = 1100364282 ^ var215;
                                                                                                                  Block var196 = Blocks.WEEPING_VINES;
                                                                                                                  byte var110 = (byte)((var0.is(var196)) ? 1 : 0);
                                                                                                                  if (var110 == (989817394 ^ var215)) {
                                                                                                                     var215 = 244490890 ^ var215;
                                                                                                                     Block var197 = Blocks.WEEPING_VINES_PLANT;
                                                                                                                     byte var112 = (byte)((var0.is(var197)) ? 1 : 0);
                                                                                                                     if (var112 == (879610040 ^ var215)) {
                                                                                                                        var215 = 1292454931 ^ var215;
                                                                                                                        Block var198 = Blocks.VINE;
                                                                                                                        byte var114 = (byte)((var0.is(var198)) ? 1 : 0);
                                                                                                                        if (var114 == (2036630699 ^ var215)) {
                                                                                                                           var215 = 483514821 ^ var215;
                                                                                                                           Block var199 = Blocks.SNOW;
                                                                                                                           byte var116 = (byte)((var0.is(var199)) ? 1 : 0);
                                                                                                                           if (var116 == (1706384750 ^ var215)) {
                                                                                                                              var215 = 1983275339 ^ var215;
                                                                                                                              Block var200 = Blocks.BROWN_MUSHROOM;
                                                                                                                              byte var118 = (byte)((var0.is(var200)) ? 1 : 0);
                                                                                                                              if (var118
                                                                                                                                 == (327367717 ^ var215)) {
                                                                                                                                 var215 = 801446457 ^ var215;
                                                                                                                                 Block var201 = Blocks.RED_MUSHROOM;
                                                                                                                                 byte var120 = (byte)((var0.is(var201)) ? 1 : 0);
                                                                                                                                 if (var120
                                                                                                                                    == (1011230236 ^ var215)) {
                                                                                                                                    var215 ^= 839563309;
                                                                                                                                    Block var202 = Blocks.CRIMSON_FUNGUS;
                                                                                                                                    byte var122 = (byte)((var0.is(
                                                                                                                                       var202
                                                                                                                                    )) ? 1 : 0);
                                                                                                                                    if (var122
                                                                                                                                       == (239902257 ^ var215)) {
                                                                                                                                       var215 = 1710634775
                                                                                                                                          ^ var215;
                                                                                                                                       Block var203 = Blocks.WARPED_FUNGUS;
                                                                                                                                       byte var124 = (byte)((var0.is(
                                                                                                                                          var203
                                                                                                                                       )) ? 1 : 0);
                                                                                                                                       if (var124
                                                                                                                                          == (
                                                                                                                                             1807395110
                                                                                                                                                ^ var215
                                                                                                                                          )) {
                                                                                                                                          var215 = 1239265544
                                                                                                                                             ^ var215;
                                                                                                                                          Block var204 = Blocks.CRIMSON_ROOTS;
                                                                                                                                          byte var126 = (byte)((var0.is(
                                                                                                                                             var204
                                                                                                                                          )) ? 1 : 0);
                                                                                                                                          if (var126
                                                                                                                                             == (
                                                                                                                                                577181742
                                                                                                                                                   ^ var215
                                                                                                                                             )) {
                                                                                                                                             var215 = 1525130171
                                                                                                                                                ^ var215;
                                                                                                                                             Block var205 = Blocks.WARPED_ROOTS;
                                                                                                                                             byte var128 = (byte)((var0.is(
                                                                                                                                                var205
                                                                                                                                             )) ? 1 : 0);
                                                                                                                                             if (var128
                                                                                                                                                == (
                                                                                                                                                   2021702549
                                                                                                                                                      ^ var215
                                                                                                                                                )) {
                                                                                                                                                var215 = 181865987
                                                                                                                                                   ^ var215;
                                                                                                                                                Block var206 = Blocks.NETHER_SPROUTS;
                                                                                                                                                byte var130 = (byte)((var0.is(
                                                                                                                                                   var206
                                                                                                                                                )) ? 1 : 0);
                                                                                                                                                if (var130
                                                                                                                                                   == (
                                                                                                                                                      1918350742
                                                                                                                                                         ^ var215
                                                                                                                                                   )) {
                                                                                                                                                   var215 = hnauzcjchrjmjhlt(
                                                                                                                                                      var215,
                                                                                                                                                      882109467
                                                                                                                                                   );
                                                                                                                                                   FluidState var132 = var0.getFluidState();
                                                                                                                                                   byte var133 = (byte)((var132.isEmpty()) ? 1 : 0);
                                                                                                                                                   if (var133
                                                                                                                                                      == (
                                                                                                                                                         1187273101
                                                                                                                                                            ^ var215
                                                                                                                                                      )) {
                                                                                                                                                      var215 = 1602769254
                                                                                                                                                         ^ var215;
                                                                                                                                                      return ((424413419 ^ var215) != 0);
                                                                                                                                                   }

                                                                                                                                                   var215 = hnauzcjchrjmjhlt(
                                                                                                                                                      var215,
                                                                                                                                                      430186204
                                                                                                                                                   );

                                                                                                                                                   try {
                                                                                                                                                      EmptyBlockGetter var207 = EmptyBlockGetter.INSTANCE;
                                                                                                                                                      BlockPos var3 = BlockPos.ZERO;
                                                                                                                                                      VoxelShape var135 = var0.getCollisionShape(
                                                                                                                                                         var207,
                                                                                                                                                         var3
                                                                                                                                                      );
                                                                                                                                                      byte var137 = (byte)((var135.isEmpty()) ? 1 : 0);
                                                                                                                                                      if (var137
                                                                                                                                                         == (
                                                                                                                                                            1600145233
                                                                                                                                                               ^ var215
                                                                                                                                                         )) {
                                                                                                                                                         var215 ^= 2076408883;
                                                                                                                                                         byte var147 = (byte)(
                                                                                                                                                            614677346
                                                                                                                                                               ^ var215
                                                                                                                                                         );
                                                                                                                                                         var215 ^= 1051533287;
                                                                                                                                                         return (var147 != 0);
                                                                                                                                                      }
                                                                                                                                                   } catch (Exception var218) {
                                                                                                                                                      switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                         var215
                                                                                                                                                      )) {
                                                                                                                                                         case -83740022:
                                                                                                                                                            var215 = 1446038648
                                                                                                                                                               ^ var215;
                                                                                                                                                            return ((byte)(
                                                                                                                                                               156273449
                                                                                                                                                                  ^ var215
                                                                                                                                                            ) != 0);
                                                                                                                                                         case 622451473:
                                                                                                                                                            var215 = 770945099
                                                                                                                                                               ^ var215;
                                                                                                                                                            return ((byte)(
                                                                                                                                                               156273449
                                                                                                                                                                  ^ var215
                                                                                                                                                            ) != 0);
                                                                                                                                                         default:
                                                                                                                                                            throw new RuntimeException(new IOException(
                                                                                                                                                               "Error in hash"
                                                                                                                                                            ));
                                                                                                                                                      }
                                                                                                                                                   }

                                                                                                                                                   var215 = hnauzcjchrjmjhlt(
                                                                                                                                                      var215,
                                                                                                                                                      1115587114
                                                                                                                                                   );

                                                                                                                                                   label674: {
                                                                                                                                                      label675: {
                                                                                                                                                         label676: {
                                                                                                                                                            label677: {
                                                                                                                                                               byte var273;
                                                                                                                                                               label678: {
                                                                                                                                                                  label246: {
                                                                                                                                                                     label501: {
                                                                                                                                                                        try {
                                                                                                                                                                           EmptyBlockGetter var208 = EmptyBlockGetter.INSTANCE;
                                                                                                                                                                           BlockPos var211 = BlockPos.ZERO;
                                                                                                                                                                           float var139 = var0.getDestroySpeed(
                                                                                                                                                                              var208,
                                                                                                                                                                              var211
                                                                                                                                                                           );
                                                                                                                                                                           float var209 = 0.0F;
                                                                                                                                                                           float var271;
                                                                                                                                                                           int var141 = (
                                                                                                                                                                                    var271 = var139
                                                                                                                                                                                       - var209
                                                                                                                                                                                 )
                                                                                                                                                                                 == 0.0F
                                                                                                                                                                              ? 0
                                                                                                                                                                              : (
                                                                                                                                                                                 var271
                                                                                                                                                                                       < 0.0F
                                                                                                                                                                                    ? -1
                                                                                                                                                                                    : 1
                                                                                                                                                                              );
                                                                                                                                                                           if (var141
                                                                                                                                                                              >= (
                                                                                                                                                                                 488555899
                                                                                                                                                                                    ^ var215
                                                                                                                                                                              )
                                                                                                                                                                              )
                                                                                                                                                                            {
                                                                                                                                                                              var215 ^= 203485245;
                                                                                                                                                                              float var210 = 0.4F;
                                                                                                                                                                              float var272;
                                                                                                                                                                              int var143 = (
                                                                                                                                                                                       var272 = var139
                                                                                                                                                                                          - var210
                                                                                                                                                                                    )
                                                                                                                                                                                    == 0.0F
                                                                                                                                                                                 ? 0
                                                                                                                                                                                 : (
                                                                                                                                                                                    var272
                                                                                                                                                                                          < 0.0F
                                                                                                                                                                                       ? -1
                                                                                                                                                                                       : 1
                                                                                                                                                                                 );
                                                                                                                                                                              if (var143
                                                                                                                                                                                 <= (
                                                                                                                                                                                    289289542
                                                                                                                                                                                       ^ var215
                                                                                                                                                                                 )
                                                                                                                                                                                 )
                                                                                                                                                                               {
                                                                                                                                                                                 var215 ^= 1176711371;
                                                                                                                                                                                 var273 = (byte)(
                                                                                                                                                                                    1461519756
                                                                                                                                                                                       ^ var215
                                                                                                                                                                                 );
                                                                                                                                                                                 break label678;
                                                                                                                                                                              }
                                                                                                                                                                              break label501;
                                                                                                                                                                           }
                                                                                                                                                                        } catch (Exception var217) {
                                                                                                                                                                           switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                              var215
                                                                                                                                                                           )) {
                                                                                                                                                                              case -1980650960:
                                                                                                                                                                                 break label674;
                                                                                                                                                                              case -1192743830:
                                                                                                                                                                                 break label677;
                                                                                                                                                                              case -386520104:
                                                                                                                                                                                 break label675;
                                                                                                                                                                              case 1061521922:
                                                                                                                                                                                 break label676;
                                                                                                                                                                              default:
                                                                                                                                                                                 throw new RuntimeException(new IOException(
                                                                                                                                                                                    "Error in hash"
                                                                                                                                                                                 ));
                                                                                                                                                                           }
                                                                                                                                                                        }

                                                                                                                                                                        while (true) {
                                                                                                                                                                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                              var215
                                                                                                                                                                           )) {
                                                                                                                                                                              case 141263744:
                                                                                                                                                                                 var215 ^= 1526101051;
                                                                                                                                                                                 break label246;
                                                                                                                                                                              case 1495872037:
                                                                                                                                                                                 break;
                                                                                                                                                                              case 2054150947:
                                                                                                                                                                              default:
                                                                                                                                                                                 throw new RuntimeException(new IOException());
                                                                                                                                                                              case 2056960604:
                                                                                                                                                                                 break label246;
                                                                                                                                                                           }
                                                                                                                                                                        }
                                                                                                                                                                     }

                                                                                                                                                                     label231:
                                                                                                                                                                     while (true) {
                                                                                                                                                                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                                           var215
                                                                                                                                                                        )) {
                                                                                                                                                                           case 23631369:
                                                                                                                                                                              var215 ^= 1456899078;
                                                                                                                                                                              break label231;
                                                                                                                                                                           case 599222360:
                                                                                                                                                                           default:
                                                                                                                                                                              throw new RuntimeException(new IOException());
                                                                                                                                                                           case 1148537370:
                                                                                                                                                                              break label231;
                                                                                                                                                                           case 2021532502:
                                                                                                                                                                        }
                                                                                                                                                                     }
                                                                                                                                                                  }

                                                                                                                                                                  try {
                                                                                                                                                                     var273 = (byte)(
                                                                                                                                                                        1206432064
                                                                                                                                                                           ^ var215
                                                                                                                                                                     );
                                                                                                                                                                     var215 ^= 1843813426;
                                                                                                                                                                     return (var273 != 0);
                                                                                                                                                                  } catch (Exception var216) {
                                                                                                                                                                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(
                                                                                                                                                                        var215
                                                                                                                                                                     )) {
                                                                                                                                                                        case -1980650960:
                                                                                                                                                                           break label674;
                                                                                                                                                                        case -1192743830:
                                                                                                                                                                           break label677;
                                                                                                                                                                        case -386520104:
                                                                                                                                                                           break label675;
                                                                                                                                                                        case 1061521922:
                                                                                                                                                                           break label676;
                                                                                                                                                                        default:
                                                                                                                                                                           throw new RuntimeException(new IOException(
                                                                                                                                                                              "Error in hash"
                                                                                                                                                                           ));
                                                                                                                                                                     }
                                                                                                                                                                  }
                                                                                                                                                               }

                                                                                                                                                               var215 = 2098456831
                                                                                                                                                                  ^ var215;
                                                                                                                                                               return (var273 != 0);
                                                                                                                                                            }

                                                                                                                                                            var215 = hnauzcjchrjmjhlt(
                                                                                                                                                               var215,
                                                                                                                                                               1582141092
                                                                                                                                                            );
                                                                                                                                                            return ((byte)(
                                                                                                                                                               156273449
                                                                                                                                                                  ^ var215
                                                                                                                                                            ) != 0);
                                                                                                                                                         }

                                                                                                                                                         var215 = hnauzcjchrjmjhlt(
                                                                                                                                                            var215,
                                                                                                                                                            1320696425
                                                                                                                                                         );
                                                                                                                                                         return ((byte)(
                                                                                                                                                            156273449
                                                                                                                                                               ^ var215
                                                                                                                                                         ) != 0);
                                                                                                                                                      }

                                                                                                                                                      var215 = hnauzcjchrjmjhlt(
                                                                                                                                                         var215,
                                                                                                                                                         340676178
                                                                                                                                                      );
                                                                                                                                                      return ((byte)(
                                                                                                                                                         156273449
                                                                                                                                                            ^ var215
                                                                                                                                                      ) != 0);
                                                                                                                                                   }

                                                                                                                                                   var215 = 409910895
                                                                                                                                                      ^ var215;
                                                                                                                                                   return ((byte)(
                                                                                                                                                      156273449
                                                                                                                                                         ^ var215
                                                                                                                                                   ) != 0);
                                                                                                                                                }

                                                                                                                                                var215 = 1421606630
                                                                                                                                                   ^ var215;
                                                                                                                                             } else {
                                                                                                                                                while (true) {
                                                                                                                                                   switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                                      var215
                                                                                                                                                   )) {
                                                                                                                                                      case 158929904:
                                                                                                                                                         var215 ^= 1584197861;
                                                                                                                                                         return ((byte)(
                                                                                                                                                            653020017
                                                                                                                                                               ^ var215
                                                                                                                                                         ) != 0);
                                                                                                                                                      case 615816592:
                                                                                                                                                      default:
                                                                                                                                                         throw new RuntimeException(new IOException());
                                                                                                                                                      case 909728910:
                                                                                                                                                         break;
                                                                                                                                                      case 1656653142:
                                                                                                                                                         return ((byte)(
                                                                                                                                                            653020017
                                                                                                                                                               ^ var215
                                                                                                                                                         ) != 0);
                                                                                                                                                   }
                                                                                                                                                }
                                                                                                                                             }
                                                                                                                                          } else {
                                                                                                                                             var215 = 76239710
                                                                                                                                                ^ var215;
                                                                                                                                          }
                                                                                                                                       } else {
                                                                                                                                          var215 = hnauzcjchrjmjhlt(
                                                                                                                                             var215, 1297539670
                                                                                                                                          );
                                                                                                                                       }
                                                                                                                                    } else {
                                                                                                                                       while (true) {
                                                                                                                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                             var215
                                                                                                                                          )) {
                                                                                                                                             case 196377650:
                                                                                                                                                var215 ^= 681628993;
                                                                                                                                                return ((byte)(
                                                                                                                                                   653020017
                                                                                                                                                      ^ var215
                                                                                                                                                ) != 0);
                                                                                                                                             case 632965690:
                                                                                                                                                return ((byte)(
                                                                                                                                                   653020017
                                                                                                                                                      ^ var215
                                                                                                                                                ) != 0);
                                                                                                                                             case 1512785484:
                                                                                                                                             default:
                                                                                                                                                throw new RuntimeException(new IOException());
                                                                                                                                             case 1834746483:
                                                                                                                                          }
                                                                                                                                       }
                                                                                                                                    }
                                                                                                                                 } else {
                                                                                                                                    while (true) {
                                                                                                                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                          var215
                                                                                                                                       )) {
                                                                                                                                          case 80205200:
                                                                                                                                             var215 ^= 447376748;
                                                                                                                                             return ((byte)(
                                                                                                                                                653020017
                                                                                                                                                   ^ var215
                                                                                                                                             ) != 0);
                                                                                                                                          case 973330941:
                                                                                                                                             break;
                                                                                                                                          case 1085962116:
                                                                                                                                          default:
                                                                                                                                             throw new RuntimeException(new IOException());
                                                                                                                                          case 2100319199:
                                                                                                                                             return ((byte)(
                                                                                                                                                653020017
                                                                                                                                                   ^ var215
                                                                                                                                             ) != 0);
                                                                                                                                       }
                                                                                                                                    }
                                                                                                                                 }
                                                                                                                              } else {
                                                                                                                                 var215 = hnauzcjchrjmjhlt(
                                                                                                                                    var215, 896497493
                                                                                                                                 );
                                                                                                                              }
                                                                                                                           } else {
                                                                                                                              while (true) {
                                                                                                                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                                    var215
                                                                                                                                 )) {
                                                                                                                                    case 84869296:
                                                                                                                                       var215 ^= 1129911838;
                                                                                                                                       return ((byte)(
                                                                                                                                          653020017 ^ var215
                                                                                                                                       ) != 0);
                                                                                                                                    case 1113146396:
                                                                                                                                    default:
                                                                                                                                       throw new RuntimeException(new IOException());
                                                                                                                                    case 1617449349:
                                                                                                                                       break;
                                                                                                                                    case 1984153403:
                                                                                                                                       return ((byte)(
                                                                                                                                          653020017 ^ var215
                                                                                                                                       ) != 0);
                                                                                                                                 }
                                                                                                                              }
                                                                                                                           }
                                                                                                                        } else {
                                                                                                                           var215 = hnauzcjchrjmjhlt(
                                                                                                                              var215, 1602801627
                                                                                                                           );
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        while (true) {
                                                                                                                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                              var215
                                                                                                                           )) {
                                                                                                                              case 93618313:
                                                                                                                                 var215 ^= 310477768;
                                                                                                                                 return ((byte)(
                                                                                                                                    653020017 ^ var215
                                                                                                                                 ) != 0);
                                                                                                                              case 526516272:
                                                                                                                              default:
                                                                                                                                 throw new RuntimeException(new IOException());
                                                                                                                              case 777366665:
                                                                                                                                 break;
                                                                                                                              case 882519963:
                                                                                                                                 return ((byte)(
                                                                                                                                    653020017 ^ var215
                                                                                                                                 ) != 0);
                                                                                                                           }
                                                                                                                        }
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var215 = hnauzcjchrjmjhlt(
                                                                                                                        var215, 471015746
                                                                                                                     );
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var215 = 1569003704 ^ var215;
                                                                                                               }
                                                                                                            } else {
                                                                                                               while (true) {
                                                                                                                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(
                                                                                                                     var215
                                                                                                                  )) {
                                                                                                                     case 127678846:
                                                                                                                        var215 ^= 1662149838;
                                                                                                                        return ((byte)(
                                                                                                                           653020017 ^ var215
                                                                                                                        ) != 0);
                                                                                                                     case 1152612386:
                                                                                                                        break;
                                                                                                                     case 1650234344:
                                                                                                                     default:
                                                                                                                        throw new RuntimeException(new IOException());
                                                                                                                     case 1802917528:
                                                                                                                        return ((byte)(
                                                                                                                           653020017 ^ var215
                                                                                                                        ) != 0);
                                                                                                                  }
                                                                                                               }
                                                                                                            }
                                                                                                         } else {
                                                                                                            while (true) {
                                                                                                               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                                                                                                                  case 165220172:
                                                                                                                     var215 ^= 1583219971;
                                                                                                                     return (((byte)(653020017 ^ var215)) != 0);
                                                                                                                  case 945274619:
                                                                                                                     break;
                                                                                                                  case 960970162:
                                                                                                                  default:
                                                                                                                     throw new RuntimeException(new IOException());
                                                                                                                  case 1692820738:
                                                                                                                     return (((byte)(653020017 ^ var215)) != 0);
                                                                                                               }
                                                                                                            }
                                                                                                         }
                                                                                                      } else {
                                                                                                         var215 = 1473920430 ^ var215;
                                                                                                      }
                                                                                                   } else {
                                                                                                      while (true) {
                                                                                                         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                                                                                                            case 66254939:
                                                                                                               break;
                                                                                                            case 114982540:
                                                                                                            default:
                                                                                                               throw new RuntimeException(new IOException());
                                                                                                            case 235636160:
                                                                                                               var215 ^= 1157292613;
                                                                                                               return (((byte)(653020017 ^ var215)) != 0);
                                                                                                            case 1387099128:
                                                                                                               return (((byte)(653020017 ^ var215)) != 0);
                                                                                                         }
                                                                                                      }
                                                                                                   }
                                                                                                } else {
                                                                                                   var215 = hnauzcjchrjmjhlt(var215, 233710460);
                                                                                                }
                                                                                             } else {
                                                                                                var215 = 837060594 ^ var215;
                                                                                             }
                                                                                          } else {
                                                                                             var215 = 445475027 ^ var215;
                                                                                          }
                                                                                       } else {
                                                                                          var215 = 1599663692 ^ var215;
                                                                                       }
                                                                                    } else {
                                                                                       while (true) {
                                                                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                                                                                             case 183256296:
                                                                                                var215 ^= 1763309656;
                                                                                                return (((byte)(653020017 ^ var215)) != 0);
                                                                                             case 1150611939:
                                                                                                return (((byte)(653020017 ^ var215)) != 0);
                                                                                             case 1157577793:
                                                                                             default:
                                                                                                throw new RuntimeException(new IOException());
                                                                                             case 1959621433:
                                                                                          }
                                                                                       }
                                                                                    }
                                                                                 } else {
                                                                                    var215 = hnauzcjchrjmjhlt(var215, 1516496414);
                                                                                 }
                                                                              } else {
                                                                                 var215 = 1658340506 ^ var215;
                                                                              }
                                                                           } else {
                                                                              while (true) {
                                                                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                                                                                    case 28029534:
                                                                                       break;
                                                                                    case 98248221:
                                                                                       var215 ^= 895852907;
                                                                                       return (((byte)(653020017 ^ var215)) != 0);
                                                                                    case 880606017:
                                                                                       return (((byte)(653020017 ^ var215)) != 0);
                                                                                    case 2068336755:
                                                                                    default:
                                                                                       throw new RuntimeException(new IOException());
                                                                                 }
                                                                              }
                                                                           }
                                                                        } else {
                                                                           var215 = hnauzcjchrjmjhlt(var215, 342683602);
                                                                        }
                                                                     } else {
                                                                        var215 = hnauzcjchrjmjhlt(var215, 836449963);
                                                                     }
                                                                  } else {
                                                                     var215 = hnauzcjchrjmjhlt(var215, 193153119);
                                                                  }
                                                               } else {
                                                                  var215 = 204365806 ^ var215;
                                                               }
                                                            } else {
                                                               var215 = hnauzcjchrjmjhlt(var215, 20002662);
                                                            }
                                                         } else {
                                                            var215 = hnauzcjchrjmjhlt(var215, 513927161);
                                                         }
                                                      } else {
                                                         while (true) {
                                                            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                                                               case 257274320:
                                                                  var215 ^= 530199396;
                                                                  return (((byte)(653020017 ^ var215)) != 0);
                                                               case 788309681:
                                                                  return (((byte)(653020017 ^ var215)) != 0);
                                                               case 812277568:
                                                               default:
                                                                  throw new RuntimeException(new IOException());
                                                               case 1486732187:
                                                            }
                                                         }
                                                      }
                                                   } else {
                                                      var215 = 1000189006 ^ var215;
                                                   }
                                                } else {
                                                   while (true) {
                                                      switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                                                         case 65813958:
                                                            var215 ^= 748950989;
                                                            return (((byte)(653020017 ^ var215)) != 0);
                                                         case 217306200:
                                                            return (((byte)(653020017 ^ var215)) != 0);
                                                         case 401014933:
                                                            break;
                                                         case 908458002:
                                                         default:
                                                            throw new RuntimeException(new IOException());
                                                      }
                                                   }
                                                }
                                             } else {
                                                var215 = hnauzcjchrjmjhlt(var215, 2077085668);
                                             }

                                             return (((byte)(653020017 ^ var215)) != 0);
                                          }

                                          var215 = hnauzcjchrjmjhlt(var215, 120124790);
                                          return (((byte)(977099189 ^ var215)) != 0);
                                       }

                                       var215 = 396910025 ^ var215;
                                       return (((byte)(977099189 ^ var215)) != 0);
                                    } else {
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                                             case 25063665:
                                                var215 ^= 1638313172;
                                                return (((byte)(977099189 ^ var215)) != 0);
                                             case 528297653:
                                                return (((byte)(977099189 ^ var215)) != 0);
                                             case 1274432632:
                                             default:
                                                throw new RuntimeException(new IOException());
                                             case 1622231856:
                                          }
                                       }
                                    }
                                 } else {
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                                          case 113972522:
                                             var215 ^= 775485372;
                                             return (((byte)(977099189 ^ var215)) != 0);
                                          case 886711238:
                                             break;
                                          case 1066570906:
                                          default:
                                             throw new RuntimeException(new IOException());
                                          case 2136133623:
                                             return (((byte)(977099189 ^ var215)) != 0);
                                       }
                                    }
                                 }
                              } else {
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                                       case 70541165:
                                          var215 ^= 1732200562;
                                          return (((byte)(977099189 ^ var215)) != 0);
                                       case 616249500:
                                          return (((byte)(977099189 ^ var215)) != 0);
                                       case 1297487758:
                                       default:
                                          throw new RuntimeException(new IOException());
                                       case 1984383104:
                                    }
                                 }
                              }
                           } else {
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                                    case 116859063:
                                       var215 ^= 1683120258;
                                       return (((byte)(977099189 ^ var215)) != 0);
                                    case 955147933:
                                    default:
                                       throw new RuntimeException(new IOException());
                                    case 1309255650:
                                       break;
                                    case 1964898978:
                                       return (((byte)(977099189 ^ var215)) != 0);
                                 }
                              }
                           }
                        } else {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                                 case 261323027:
                                    var215 ^= 321871995;
                                    return (((byte)(977099189 ^ var215)) != 0);
                                 case 852171263:
                                    return (((byte)(977099189 ^ var215)) != 0);
                                 case 1820001265:
                                    break;
                                 case 1910854697:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        }
                     } else {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                              case 185375869:
                                 var215 ^= 226296278;
                                 return (((byte)(977099189 ^ var215)) != 0);
                              case 779091828:
                                 return (((byte)(977099189 ^ var215)) != 0);
                              case 998710310:
                                 break;
                              case 1070674166:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }
                     }
                  } else {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var215)) {
                           case 121297363:
                              var215 ^= 834669057;
                              return (((byte)(977099189 ^ var215)) != 0);
                           case 815767395:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1280707240:
                              break;
                           case 1715831537:
                              return (((byte)(977099189 ^ var215)) != 0);
                        }
                     }
                  }
               }
            }
         }

         var215 = 263489250 ^ var215;
      } else {
         var215 = hnauzcjchrjmjhlt(var215, 199074369);
      }

      return (((byte)(1132190179 ^ var215)) != 0);
   }

   public static boolean isWalkThrough(BlockState var0) {
      int var21 = 916020222 ^ 1970052083 ^ 179769835;
      var21 = 1218521808 ^ var21;
      if (var0 != null) {
         var21 = 869427581 ^ var21;
         byte var6 = (byte)((var0.isAir()) ? 1 : 0);
         if (var6 == (842109515 ^ var21)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var21)) {
                  case 20986176:
                     var21 ^= 246566783;
                     break;
                  case 139264721:
                  default:
                     throw new RuntimeException(new IOException());
                  case 572431630:
                     continue;
                  case 638778774:
               }

               byte var9 = (byte)((isSoftPlant(var0)) ? 1 : 0);
               if (var9 == (1015274804 ^ var21)) {
                  var21 = 811231223 ^ var21;
                  byte var11 = (byte)((var0.canBeReplaced()) ? 1 : 0);
                  if (var11 == (215595715 ^ var21)) {
                     var21 = 195092283 ^ var21;
                     return (((byte)(125396472 ^ var21)) != 0);
                  }

                  var21 = 1883150875 ^ var21;
               } else {
                  label41:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var21)) {
                        case 88031255:
                           var21 ^= 1080360428;
                        case 904213318:
                           break label41;
                        case 1236734461:
                           break;
                        case 1656812803:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               }

               try {
                  EmptyBlockGetter var2 = EmptyBlockGetter.INSTANCE;
                  BlockPos var3 = BlockPos.ZERO;
                  VoxelShape var14 = var0.getCollisionShape(var2, var3);
                  boolean var15 = var14.isEmpty();
                  var21 ^= 1973085746;
                  return var15;
               } catch (Exception var22) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var21)) {
                     case -415693117:
                        var21 = hnauzcjchrjmjhlt(var21, 930453421);
                        return var0.canBeReplaced();
                     default:
                        throw new RuntimeException(new IllegalAccessException("Error in hash"));
                  }
               }
            }
         }

         var21 = 1221978067 ^ var21;
      } else {
         var21 = hnauzcjchrjmjhlt(var21, 2064092846);
      }

      return (((byte)(2061792665 ^ var21)) != 0);
   }

   public static boolean isPlaceOver(BlockState var0) {
      int var38 = 1762066862 ^ 1389085285 ^ 179769835;
      var38 = 1167091596 ^ var38;
      if (var0 != null) {
         var38 = 312198782 ^ var38;
         byte var4 = (byte)((var0.isAir()) ? 1 : 0);
         if (var4 == (1718645714 ^ var38)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                  case 108627478:
                     var38 ^= 878658923;
                  case 299159792:
                     byte var6 = (byte)((isDoublePlantHalf(var0)) ? 1 : 0);
                     if (var6 != (1378825913 ^ var38)) {
                        var38 = 229122958 ^ var38;
                        return (((byte)(1602688311 ^ var38)) != 0);
                     }

                     var38 = 1933948082 ^ var38;
                     byte var9 = (byte)((var0.canBeReplaced()) ? 1 : 0);
                     if (var9 != (560628235 ^ var38)) {
                        var38 = 2004999634 ^ var38;
                        return (((byte)(1458266072 ^ var38)) != 0);
                     }

                     label111:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                           case 12483231:
                              var38 ^= 677227732;
                           case 1469893363:
                              break label111;
                           case 1596326407:
                              break;
                           case 1924130641:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }

                     Block var2 = Blocks.SHORT_GRASS;
                     byte var11 = (byte)((var0.is(var2)) ? 1 : 0);
                     if (var11 == (154611423 ^ var38)) {
                        var38 ^= 524798493;
                        Block var31 = Blocks.FERN;
                        byte var13 = (byte)((var0.is(var31)) ? 1 : 0);
                        if (var13 == (376497346 ^ var38)) {
                           var38 = 1843092500 ^ var38;
                           Block var32 = Blocks.DEAD_BUSH;
                           byte var15 = (byte)((var0.is(var32)) ? 1 : 0);
                           if (var15 != (2074851542 ^ var38)) {
                              var38 = 1814958095 ^ var38;
                              return (((byte)(394635480 ^ var38)) != 0);
                           }

                           var38 = 2025034296 ^ var38;
                           Block var33 = Blocks.SNOW;
                           byte var17 = (byte)((var0.is(var33)) ? 1 : 0);
                           if (var17 == (51915502 ^ var38)) {
                              var38 = 13370817 ^ var38;
                              TagKey var34 = BlockTags.FLOWERS;
                              byte var19 = (byte)((var0.is(var34)) ? 1 : 0);
                              if (var19 != (64237359 ^ var38)) {
                                 var38 = hnauzcjchrjmjhlt(var38, 340887542);
                                 return (((byte)(394635480 ^ var38)) != 0);
                              }

                              var38 = 284122713 ^ var38;
                              TagKey var35 = BlockTags.REPLACEABLE;
                              byte var21 = (byte)((var0.is(var35)) ? 1 : 0);
                              if (var21 != (322662774 ^ var38)) {
                                 var38 = 79616431 ^ var38;
                                 return (((byte)(394635480 ^ var38)) != 0);
                              }

                              var38 = 254566513 ^ var38;
                              byte var23 = (byte)((isSoftPlant(var0)) ? 1 : 0);
                              if (var23 != (471273735 ^ var38)) {
                                 var38 ^= 277616119;
                                 byte var25 = (byte)((isWalkThrough(var0)) ? 1 : 0);
                                 if (var25 != (211485936 ^ var38)) {
                                    var38 = 1889547132 ^ var38;
                                    return (((byte)(2084255629 ^ var38)) != 0);
                                 }

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                                       case 141317386:
                                          var38 ^= 1399658643;
                                          return (((byte)(1609964643 ^ var38)) != 0);
                                       case 391569950:
                                       default:
                                          throw new RuntimeException(new IOException());
                                       case 727049256:
                                          return (((byte)(1609964643 ^ var38)) != 0);
                                       case 969528587:
                                    }
                                 }
                              }

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                                    case 107785450:
                                       var38 ^= 1138822500;
                                       return (((byte)(1609964643 ^ var38)) != 0);
                                    case 629121554:
                                       return (((byte)(1609964643 ^ var38)) != 0);
                                    case 1719862107:
                                       break;
                                    case 1801539427:
                                    default:
                                       throw new RuntimeException(new IOException());
                                 }
                              }
                           }

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                                 case 48671527:
                                    var38 ^= 345866807;
                                    return (((byte)(394635480 ^ var38)) != 0);
                                 case 171412837:
                                    break;
                                 case 750551958:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 902365005:
                                    return (((byte)(394635480 ^ var38)) != 0);
                              }
                           }
                        }

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                              case 192589127:
                                 var38 ^= 32853019;
                                 return (((byte)(394635480 ^ var38)) != 0);
                              case 606732701:
                                 return (((byte)(394635480 ^ var38)) != 0);
                              case 1602947240:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1843011702:
                           }
                        }
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                           case 31122407:
                              var38 ^= 515016198;
                              return (((byte)(394635480 ^ var38)) != 0);
                           case 488660973:
                              return (((byte)(394635480 ^ var38)) != 0);
                           case 1207441375:
                              break;
                           case 1898926803:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  case 674855351:
                  default:
                     throw new RuntimeException(new IOException());
                  case 734953799:
               }
            }
         }

         var38 = 1323114888 ^ var38;
      } else {
         var38 = 1548150774 ^ var38;
      }

      return (((byte)(682447451 ^ var38)) != 0);
   }

   public static BlockPos remainingDoubleHalf(Level var0, BlockPos var1) {
      int var26 = 1194902988 ^ 272320975 ^ 179769835;
      var26 = 1749887830 ^ var26;
      if (var0 != null) {
         var26 = 834973767 ^ var26;
         if (var1 == null) {
            var26 = 1040688170 ^ var26;
            return null;
         } else {
            label39:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
                  case 66663092:
                     var26 ^= 285699673;
                  case 213161755:
                     break label39;
                  case 349195676:
                     break;
                  case 1113456629:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }

            BlockPos var8 = var1.above();
            BlockPos var10 = var1.below();
            BlockState var12 = var0.getBlockState(var8);
            byte var13 = (byte)((isDoublePlantHalf(var12)) ? 1 : 0);
            if (var13 != (356149408 ^ var26)) {
               var26 = 1461684996 ^ var26;
               return var8.immutable();
            } else {
               label31:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
                     case 153173900:
                        var26 ^= 1735045293;
                     case 243771310:
                        break label31;
                     case 600870913:
                        break;
                     case 1424039740:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }

               BlockState var17 = var0.getBlockState(var10);
               byte var18 = (byte)((isDoublePlantHalf(var17)) ? 1 : 0);
               if (var18 != (1917900813 ^ var26)) {
                  var26 = 767056312 ^ var26;
                  return var10.immutable();
               } else {
                  var26 = 915646711 ^ var26;
                  return null;
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
               case 57144760:
               default:
                  throw new RuntimeException(new IOException());
               case 138070630:
                  return null;
               case 143910889:
                  var26 = 264442989 ^ var26;
                  return null;
               case 1330396448:
            }
         }
      }
   }

   public static boolean isDoublePlantHalf(BlockState var0) {
      int var16 = 1220150286 ^ 1672136445 ^ 179769835;
      var16 = 1680494419 ^ var16;
      if (var0 != null) {
         var16 = 1157360801 ^ var16;
         byte var4 = (byte)((var0.isAir()) ? 1 : 0);
         if (var4 == (24539370 ^ var16)) {
            var16 = 1009460235 ^ var16;
            byte var6 = (byte)((isSoftPlant(var0)) ? 1 : 0);
            if (var6 != (1029526753 ^ var16)) {
               var16 = hnauzcjchrjmjhlt(var16, 1793582768);
               Block var8 = var0.getBlock();
               byte var9 = (byte)((var8 instanceof DoublePlantBlock) ? 1 : 0);
               if (var9 != (1471853137 ^ var16)) {
                  var16 = 248014808 ^ var16;
                  return (((byte)(1500697992 ^ var16)) != 0);
               }

               var16 = 311351879 ^ var16;
               EnumProperty var2 = BlockStateProperties.DOUBLE_BLOCK_HALF;
               return var0.hasProperty(var2);
            }

            var16 = 1878829275 ^ var16;
         } else {
            var16 = hnauzcjchrjmjhlt(var16, 1406635216);
         }
      } else {
         var16 = hnauzcjchrjmjhlt(var16, 388784241);
      }

      return (((byte)(1386347578 ^ var16)) != 0);
   }

   static {
      int var3 = new Random(-5117358019795140308L).nextInt();
      RnIJH2aE3Z = 1500007551 ^ var3;
   }

   public static String rnycskfvrr(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] nqjrszquvpirtry() {
      return new byte[]{
         122,
         25,
         45,
         2,
         22,
         57,
         21,
         23,
         22,
         89,
         72,
         91,
         44,
         55,
         66,
         39,
         91,
         46,
         39,
         17,
         20,
         85,
         18,
         81,
         26,
         40,
         31,
         47,
         61,
         54,
         45,
         87,
         79,
         27,
         80,
         68,
         29,
         26,
         5,
         36,
         114,
         113,
         25,
         8,
         106,
         49,
         13,
         114,
         69,
         45,
         39,
         45,
         109,
         40,
         61,
         119,
         107,
         101,
         48,
         9,
         2,
         37,
         122
      };
   }

   private static byte[] ydoebdpstcrlxqx() {
      return new byte[]{-75, -45, 27, 98, 34, 109, 35, 84, 39, 8, 121, 2};
   }

   private static byte[] lrdghcbvqndiaak() {
      return new byte[]{-75, -46, 24, 121, 34, 107, 39, 66, 38, 29};
   }

   private static byte[] nhfhoapmezmdbcw() {
      return new byte[]{-77, -48, 25, 121, 34, 96, 34, 72, 37, 23};
   }

   private static byte[] xckbvxyvhykdpef() {
      return new byte[]{-75, -46, 21, 114, 37, 97, 37, 64, 39, 11, 121, 4};
   }

   private static byte[] vrbytctukoojvfm() {
      return new byte[]{-74, -42, 28, 117, 35, 109, 33, 84, 37, 5};
   }

   private static byte[] whhhkvgbdjlbajc() {
      return new byte[]{-68, -48, 27, 113, 35, 120, 33, 69, 46, 28, 126, 28};
   }

   private static byte[] smeugopmtwflnfy() {
      return new byte[]{-75, -47, 31, 115, 33, 101, 38, 72, 35, 24, 121, 9, 30, 114};
   }

   private static byte[] lbuyxxejvicdrnz() {
      return new byte[]{-75, -48, 20, 102, 34, 101, 38, 68, 47, 14, 121, 31, 21, 97, 118, 109, 104, 111};
   }

   private static byte[] niowkclduzditfs() {
      return new byte[]{-74, -43, 26, 116, 47, 121, 44, 65, 33, 12, 123, 25, 28, 125};
   }

   private static byte[] zkyphumusdhcgde() {
      return new byte[]{-78, -34, 20, 97, 32, 121, 38, 85, 37, 0, 112, 23, 28, 117};
   }

   private static byte[] rpvlrgghtzrgoda() {
      return new byte[]{-75, -42, 31, 101, 46, 100, 37, 78, 35, 22, 121, 39, 30, 98, 122, 109, 107, 125, 18, 91};
   }

   private static byte[] nheuypeyrpmpmqr() {
      return new byte[]{-75, -33, 27, 109, 39, 106, 33, 71, 46, 10, 121, 22, 26, 111, 115, 101, 111, 112, 31, 72, 37, 2};
   }

   private static byte[] zqlyxjkcbiwhmzf() {
      return new byte[]{-67, -44, 27, 105, 32, 101, 45, 73, 38, 20};
   }

   private static byte[] ojysxyutihddvei() {
      return new byte[]{-75, -45, 21, 96, 37, 100, 34, 77, 34, 10};
   }

   private static byte[] ssbaiuhkncjmrkk() {
      return new byte[]{-68, -47, 30, 113, 38, 114, 32, 78, 47, 13, 127, 13, 30, 102};
   }

   private static byte[] uqjhqrudghottns() {
      return new byte[]{-75, -46, 31, 123, 32, 120, 39, 87, 32, 8, 121, 29, 30, 108, 116, 124, 105, 112};
   }

   private static byte[] xqwqcdkjpdlztlq() {
      return new byte[]{-75, -45, 30, 103, 47, 108, 34, 82, 35, 7, 121, 7, 31, 111, 123, 116};
   }

   private static byte[] ktikmfxkopedwrj() {
      return new byte[]{-75, -41, 28, 120, 33, 106, 39, 92, 37, 29, 121, 15, 29, 122};
   }

   private static byte[] jmsgkyfzkisuqqe() {
      return new byte[]{-73, -43, 24, 120, 39, 125, 32, 77, 36, 26};
   }

   private static int hnauzcjchrjmjhlt(int var0, int var1) {
      return var0 ^ var1;
   }
}
