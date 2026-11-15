package com.wimpyclient.u;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.commands.arguments.blocks.BlockStateParser;
import net.minecraft.commands.arguments.blocks.BlockStateParser.BlockResult;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class d {
   private static int VQkH1odfCy;
   private transient int KtrebNN4Un;

   private d() {
super();
      int var4 = 1260241698 ^ 1963289123;
      
      var4 = 1162431826 ^ var4;
      var4 = 1831566774 ^ 1241685382 ^ Integer.parseInt("1551369315");
      this.KtrebNN4Un = 1107211182 ^ VQkH1odfCy;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 167110742:
            default:
               throw new IllegalStateException();
            case 250532145:
               var4 = 1002958263 ^ var4;
            case 1560414328:
               return;
            case 1792770767:
         }
      }
   }

   static BlockState fromPaletteTag(CompoundTag var0) {
      int var25 = 1249692948 ^ 397301821 ^ 275847887;
      var25 = 385966195 ^ var25;
      if (var0 != null) {
         var25 = 821630051 ^ var25;
         byte var9 = (byte)((var0.isEmpty()) ? 1 : 0);
         if (var9 == (1784413174 ^ var25)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                  case 1440362:
                  default:
                     throw new IllegalStateException();
                  case 236081783:
                     var25 ^= 989850192;
                  case 1755197950:
                     try {
                        DefaultedRegistry var10 = BuiltInRegistries.BLOCK;
                        BlockState var11 = NbtUtils.readBlockState(var10, var0);
                        var25 ^= 1910613152;
                        return var11;
                     } catch (RuntimeException var26) {
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var25)) {
                           case -2061464270:
                              var25 = 2144476926 ^ var25;
                              String var21 = qpvlgydemo(dmahjvayciqmyfp(), mbuoitcbffbvxjd(), var25);
                              String var4 = qpvlgydemo(phmutmgicwscoud(), mbuoitcbffbvxjd(), var25);
                              String var5 = qpvlgydemo(xywrlewukwakprm(), mbuoitcbffbvxjd(), var25);
                              String var22 = var0.getStringOr(var4, var5);
                              String var14 = var0.getStringOr(var21, var22);
                              byte var16 = (byte)((var14.isEmpty()) ? 1 : 0);                              String var20;
                              if (var16 != (796266328 ^ var25)) {
                                 var25 = 1673295483 ^ var25;
                                 var20 = qpvlgydemo(igcnhkoxstdrvih(), mbuoitcbffbvxjd(), var25);
                                 var25 = qoxnvzuctghwkxad(var25, 127692525);
                              } else {
                                 var25 = qoxnvzuctghwkxad(var25, 1678251591);
                                 var20 = var14;
                                 var25 = 2625233 ^ var25;
                              }

                              return parse(var20);
                           default:
                              throw new RuntimeException("Error in hash");
                        }
                     }
                  case 296166841:
               }
            }
         }

         var25 = 1235973292 ^ var25;
      } else {
         var25 = 2035441871 ^ var25;
      }

      Block var18 = Blocks.AIR;
      return var18.defaultBlockState();
   }

   static BlockState parse(String var0) {
      int var51 = 427947769 ^ 1640535712 ^ 275847887;
      var51 = 979737723 ^ var51;
      if (var0 != null) {
         var51 = 774256553 ^ var51;
         byte var9 = (byte)((var0.isBlank()) ? 1 : 0);
         if (var9 == (2088489284 ^ var51)) {
            var51 = 1970721845 ^ var51;
            String var11 = var0.trim();
            String var4 = var11;
            String var2 = qpvlgydemo(urjsskytnwrgbaw(), mbuoitcbffbvxjd(), var51);
            byte var13 = (byte)((var11.contains(var2)) ? 1 : 0);
            if (var13 == (151848305 ^ var51)) {
               var51 = 233643535 ^ var51;
               String var39 = qpvlgydemo(rlvggvotssmzahh(), mbuoitcbffbvxjd(), var51);
               byte var15 = (byte)((var11.startsWith(var39)) ? 1 : 0);
               if (var15 == (81795966 ^ var51)) {
                  var51 = 936844930 ^ var51;
                  String var17 = "minecraft:" + var11;
                  var4 = var17;
                  var51 = 2065108510 ^ var51;
               } else {
                  var51 = qoxnvzuctghwkxad(var51, 1287655580);
               }
            } else {
               var51 = qoxnvzuctghwkxad(var51, 1093471891);
            }

            try {
               DefaultedRegistry var18 = BuiltInRegistries.BLOCK;
               StringReader var40 = new StringReader(var4);
               byte var45 = (byte)(1210059746 ^ var51);
               BlockResult var19 = BlockStateParser.parseForBlock(var18, var40, (var45 != 0));
               BlockState var20 = var19.blockState();
               var51 ^= 1535244520;
               return var20;
            } catch (RuntimeException | CommandSyntaxException var52) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var51)) {
                  case 1090543378:
                     var51 = 371993154 ^ var51;
                     String var41 = qpvlgydemo(ujxvuuwxoiynkiu(), mbuoitcbffbvxjd(), var51);
                     byte var23 = (byte)((var4.contains(var41)) ? 1 : 0);
                     String var25;
                     if (var23 != (1577853344 ^ var51)) {
                        var51 = 1581530826 ^ var51;
                        byte var42 = (byte)(4726634 ^ var51);
                        byte var48 = (byte)(4726577 ^ var51);
                        int var47 = var4.indexOf(var48);
                        var25 = var4.substring(var42, var47);
                        var51 = 1791992792 ^ var51;
                     } else {
                        label56:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var51)) {
                              case 104324906:
                                 var51 ^= 1147437984;
                              case 333188582:
                                 break label56;
                              case 929617523:
                              default:
                                 throw new IllegalStateException();
                              case 1472842400:
                           }
                        }

                        var25 = var4;
                        var51 = 1894719154 ^ var51;
                     }

                     Identifier var26 = Identifier.tryParse(var25);
                     if (var26 != null) {
                        var51 = 296948288 ^ var51;
                        DefaultedRegistry var28 = BuiltInRegistries.BLOCK;
                        Object var29 = var28.getValue(var26);
                        Block var30 = (Block)var29;
                        if (var30 != null) {
                           var51 = 2123222385 ^ var51;
                           Block var44 = Blocks.AIR;
                           if (var30 != var44) {
                              var51 = 1294100563 ^ var51;
                              return var30.defaultBlockState();
                           }

                           var51 = 768844471 ^ var51;
                        } else {
                           label47:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var51)) {
                                 case 246835648:
                                    var51 = 1398697926 ^ var51;
                                    break label47;
                                 case 312673524:
                                    break;
                                 case 1253315907:
                                 default:
                                    throw new IllegalStateException();
                                 case 2113911598:
                                    break label47;
                              }
                           }
                        }
                     } else {
                        var51 = qoxnvzuctghwkxad(var51, 1122860422);
                     }

                     Block var35 = Blocks.AIR;
                     return var35.defaultBlockState();
                  default:
                     throw new RuntimeException("Error in hash");
               }
            }
         }

         var51 = 1880290262 ^ var51;
      } else {
         var51 = qoxnvzuctghwkxad(var51, 1580516479);
      }

      Block var37 = Blocks.AIR;
      return var37.defaultBlockState();
   }

   static boolean isPlaceable(BlockState var0) {
      int var22 = 51156093 ^ 1103836944 ^ 275847887;
      var22 = 489303166 ^ var22;
      if (var0 != null) {
         var22 = 1277878432 ^ var22;
         byte var5 = (byte)((var0.isAir()) ? 1 : 0);
         if (var5 == (62289276 ^ var22)) {
            var22 = 1986296137 ^ var22;
            Block var2 = Blocks.WATER;
            byte var7 = (byte)((var0.is(var2)) ? 1 : 0);
            if (var7 == (1976699957 ^ var22)) {
               var22 = 693674566 ^ var22;
               Block var18 = Blocks.LAVA;
               byte var9 = (byte)((var0.is(var18)) ? 1 : 0);
               if (var9 != (1552592499 ^ var22)) {
                  var22 = 164722192 ^ var22;
                  return (((byte)(1432082530 ^ var22)) != 0);
               }

               var22 = qoxnvzuctghwkxad(var22, 71561796);
               Block var12 = var0.getBlock();
               Item var13 = var12.asItem();
               if (var13 != null) {
                  var22 ^= 1209350962;
                  Item var19 = Items.AIR;
                  if (var13 != var19) {
                     var22 = 1152360654 ^ var22;
                     byte var16 = (byte)(1416873930 ^ var22);
                     var22 = 2066265341 ^ var22;
                     return (var16 != 0);
                  }

                  label37:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                        case 11212613:
                           var22 ^= 1672024703;
                           break label37;
                        case 297123044:
                           break;
                        case 1448009131:
                           break label37;
                        case 1534495492:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               } else {
                  label44:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                        case 201751139:
                           var22 ^= 733751629;
                           break label44;
                        case 716511803:
                        default:
                           throw new IllegalStateException();
                        case 1360432643:
                           break;
                        case 1764965892:
                           break label44;
                     }
                  }
               }

               byte var32 = (byte)(1937077626 ^ var22);
               var22 = 1546520140 ^ var22;
               return (var32 != 0);
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                     case 71729780:
                        var22 ^= 545903702;
                        return (((byte)(1432082530 ^ var22)) != 0);
                     case 1352027169:
                        return (((byte)(1432082530 ^ var22)) != 0);
                     case 1622956586:
                     default:
                        throw new IllegalStateException();
                     case 2012597008:
                  }
               }
            }
         }

         var22 = 838526762 ^ var22;
      } else {
         var22 = 2110785418 ^ var22;
      }

      return (((byte)(843878998 ^ var22)) != 0);
   }

   static {
      int var3 = new Random(-8878448056187373282L).nextInt();
      VQkH1odfCy = -1658654519 ^ var3;
   }

   public static String qpvlgydemo(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] mbuoitcbffbvxjd() {
      return new byte[]{
         96,
         65,
         79,
         102,
         20,
         104,
         7,
         99,
         49,
         76,
         6,
         24,
         116,
         124,
         62,
         40,
         4,
         54,
         34,
         84,
         12,
         58,
         11,
         61,
         126,
         81,
         15,
         77,
         95,
         34,
         40,
         28,
         57,
         75,
         37,
         16,
         10,
         98,
         4,
         76,
         28,
         18,
         27,
         118,
         43,
         63,
         39,
         53,
         42,
         123,
         10,
         98,
         108,
         53,
         121,
         9,
         35,
         2,
         111,
         116,
         19,
         108,
         120,
         100,
         115,
         28,
         99,
         59,
         99,
         18,
         50,
         57,
         42,
         125,
         100,
         73,
         60,
         78,
         58,
         115
      };
   }

   private static byte[] igcnhkoxstdrvih() {
      return new byte[]{-81, -116, 119, 51, 39, 50, 48, 59, 8, 16, 55, 73, 76, 54, 13, 122, 51, 102, 27, 25, 61, 50, 51, 100, 77, 11, 56, 9};
   }

   private static byte[] dmahjvayciqmyfp() {
      return new byte[]{-87, -121, 121, 26, 34, 63, 52, 60, 9, 30};
   }

   private static byte[] phmutmgicwscoud() {
      return new byte[]{-87, -121, 121, 58, 34, 63, 52, 60, 9, 30};
   }

   private static byte[] xywrlewukwakprm() {
      return new byte[0];
   }

   private static byte[] urjsskytnwrgbaw() {
      return new byte[]{-81, -117, 126, 100};
   }

   private static byte[] rlvggvotssmzahh() {
      return new byte[]{-90, -113, 120, 124};
   }

   private static byte[] ujxvuuwxoiynkiu() {
      return new byte[]{-81, -117, 120, 10};
   }

   private static int qoxnvzuctghwkxad(int var0, int var1) {
      return var1 ^ var0;
   }
}
