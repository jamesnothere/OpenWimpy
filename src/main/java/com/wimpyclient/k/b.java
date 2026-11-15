package com.wimpyclient.k;

import com.wimpyclient.e.d$a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.phys.Vec3;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class b {
   private static final int CHUNK_RADIUS = 4;
   private static final int Y_MAX = 128;
   private static final int MAX_MARKS = 512;
   private static int eko4h5HMJI;
   private transient int jg1CDewmz7;

   private b() {
super();
      int var4 = 890641178 ^ 1814818158;
      
      var4 = gopydjraovajtprp(var4, 37819813);
      var4 = 1292270132 ^ 318744304 ^ Integer.parseInt("75841301");
      this.jg1CDewmz7 = 2125760463 ^ eko4h5HMJI;
      var4 = gopydjraovajtprp(var4, 726485008);
   }

   static List<com.wimpyclient.e.d> sample(Minecraft var0) {
      int var8 = 749958387 ^ 1678822870 ^ 662996610;
      var8 = 1353489149 ^ var8;

      try {
         List var3 = sampleUnsafe(var0);
         var8 ^= 1254100916;
         return var3;
      } catch (RuntimeException var9) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var8)) {
            case -61003055:
               var8 = 1768721755 ^ var8;
               return List.of();
            default:
               throw new RuntimeException(new IllegalAccessException("Error in hash"));
         }
      }
   }

   private static List<com.wimpyclient.e.d> sampleUnsafe(Minecraft var0) {
      int var67 = 816995450 ^ 1613825109 ^ 662996610;
      var67 = 1028105429 ^ var67;
      ClientLevel var15 = var0.level;
      ClientLevel var5 = var15;
      if (var15 != null) {
         var67 = 1551054708 ^ var67;
         GameRenderer var18 = var0.gameRenderer;
         if (var18 != null) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var67)) {
                  case 184775540:
                     var67 ^= 661646955;
                  case 197533558:
                     GameRenderer var20 = var0.gameRenderer;
                     Camera var21 = var20.getMainCamera();
                     Vec3 var22 = var21.position();
                     double var24 = var22.x;
                     double var60 = var22.y;
                     double var64 = var22.z;
                     BlockPos var26 = BlockPos.containing(var24, var60, var64);
                     int var28 = var26.getX();
                     byte var2 = (byte)(828154723 ^ var67);
                     int var29 = var28 >> var2;
                     int var8 = var29;
                     int var31 = var26.getZ();
                     byte var51 = (byte)(828154723 ^ var67);
                     int var32 = var31 >> var51;
                     int var9 = var32;
                     ArrayList var33 = new ArrayList();
                     ArrayList var10 = var33;
                     byte var34 = (byte)(-828154725 ^ var67);
                     int var11 = var34;
                     var67 = 2094091378 ^ var67;

                     label76:
                     while (true) {
                        byte var52 = (byte)(1301147409 ^ var67);
                        if (var11 > var52) {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var67)) {
                                 case 105034421:
                                    var67 = 1731165845 ^ var67;
                                    return var10;
                                 case 618273505:
                                    return var10;
                                 case 893513424:
                                    break;
                                 case 2012184894:
                                 default:
                                    throw new IllegalStateException();
                              }
                           }
                        }

                        var67 = 1038907442 ^ var67;
                        byte var36 = (byte)(-1885443877 ^ var67);
                        int var12 = var36;
                        var67 = 732497579 ^ var67;

                        while (true) {
                           byte var53 = (byte)(1539871112 ^ var67);
                           if (var12 > var53) {
                              var67 = 1887783194 ^ var67;
                              var11 += 726522007 ^ var67;

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var67)) {
                                    case 18145223:
                                    default:
                                       throw new IllegalStateException();
                                    case 65468655:
                                       var67 ^= 1723873155;
                                       continue label76;
                                    case 125605722:
                                       break;
                                    case 1710858430:
                                       continue label76;
                                 }
                              }
                           }

                           var67 = 223007847 ^ var67;
                           int var39 = var8 + var11;
                           int var41 = var9 + var12;
                           byte var43 = (byte)((var5.hasChunk(var39, var41)) ? 1 : 0);
                           if (var43 != (1451378155 ^ var67)) {
                              var67 = gopydjraovajtprp(var67, 1137386400);
                              LevelChunk var45 = var5.getChunk(var39, var41);
                              collect(var45, var10);
                              int var47 = var10.size();
                              short var59 = (short)(357131339 ^ var67);
                              if (var47 >= var59) {
                                 var67 = 1889551160 ^ var67;
                                 return var10;
                              }

                              var67 = gopydjraovajtprp(var67, 1923655834);
                           } else {
                              var67 = 2124851407 ^ var67;

                              label58:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var67)) {
                                    case 231187281:
                                       var67 ^= 1338319861;
                                    case 835792592:
                                       break label58;
                                    case 1131391330:
                                       break;
                                    case 1674540892:
                                    default:
                                       throw new IllegalStateException();
                                 }
                              }
                           }

                           var12 += 1742851792 ^ var67;
                           var67 = 1009344349 ^ var67;
                        }
                     }
                  case 1502060524:
                     break;
                  case 2044644218:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var67 = 794734411 ^ var67;
      } else {
         var67 = gopydjraovajtprp(var67, 1932367935);
      }

      return List.of();
   }

   private static void collect(LevelChunk var0, List<com.wimpyclient.e.d> var1) {
      int var84 = 1213604211 ^ 885094211 ^ 662996610;
      var84 = 365464216 ^ var84;
      LevelChunkSection[] var19 = var0.getSections();
      LevelChunkSection[] var8 = var19;
      ChunkPos var21 = var0.getPos();
      int var22 = var21.getMinBlockX();
      int var9 = var22;
      ChunkPos var24 = var0.getPos();
      int var25 = var24.getMinBlockZ();
      int var10 = var25;
      byte var26 = (byte)(1322998314 ^ var84);
      int var11 = var26;
      var84 = 2033475886 ^ var84;

      while (true) {
         int var59 = var8.length;
         if (var11 < var59) {
            var84 = 1552184196 ^ var84;
            LevelChunkSection var29 = var8[var11];
            LevelChunkSection var12 = var29;
            if (var29 != null) {
               var84 = 1967705582 ^ var84;
               byte var32 = (byte)((var29.hasOnlyAir()) ? 1 : 0);
               if (var32 != (505644398 ^ var84)) {
                  var84 = 896004846 ^ var84;
                  var84 = 350957000 ^ var84;
               } else {
                  var84 = 1978414176 ^ var84;
                  int var34 = var0.getSectionYFromSectionIndex(var11);
                  int var35 = SectionPos.sectionToBlockCoord(var34);
                  int var13 = var35;
                  short var62 = (short)(1808773518 ^ var84);
                  if (var35 <= var62) {
                     var84 = 610164761 ^ var84;
                     Predicate<BlockState> var63 = var0x -> {
                        int var7 = 81252651 ^ 1017828876 ^ 662996610;
                        var7 = 1103796676 ^ var7;
                        Block var3 = var0x.getBlock();
                        Block var2 = Blocks.AMETHYST_CLUSTER;
                        if (var3 == var2) {
                           var7 = 1003306084 ^ var7;
                           byte var12x = (byte)(1711154180 ^ var7);
                           var7 = 1836255451 ^ var7;
                           return (var12x != 0);
                        } else {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var7)) {
                                 case 109224200:
                                    var7 ^= 67475592;
                                 case 825936432:
                                    byte var4 = (byte)(1513521385 ^ var7);
                                    var7 = 1388031031 ^ var7;
                                    return (var4 != 0);
                                 case 166245508:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 441346993:
                              }
                           }
                        }
                     };
                     byte var38 = (byte)((var29.maybeHas(var63)) ? 1 : 0);
                     if (var38 == (1334956311 ^ var84)) {
                        var84 = 1054240434 ^ var84;
                        var84 = gopydjraovajtprp(var84, 1323886061);
                     } else {
                        var84 = gopydjraovajtprp(var84, 1012417164);
                        byte var39 = (byte)(1942590363 ^ var84);
                        int var14 = var39;
                        var84 = 1073569978 ^ var84;

                        while (true) {
                           byte var64 = (byte)(1278538545 ^ var84);
                           if (var14 >= var64) {
                              var84 = 1939581289 ^ var84;
                              break;
                           }

                           var84 = 2108549454 ^ var84;
                           int var42 = var13 + var14;
                           int var15 = var42;
                           short var66 = (short)(832117487 ^ var84);
                           if (var42 > var66) {
                              var84 = 1754227652 ^ var84;
                              var84 = 906151588 ^ var84;
                           } else {
                              var84 = gopydjraovajtprp(var84, 1162399459);
                              byte var44 = (byte)(1959908492 ^ var84);
                              int var16 = var44;
                              var84 = 1603899900 ^ var84;

                              label107:
                              while (true) {
                                 byte var67 = (byte)(726156640 ^ var84);
                                 if (var16 >= var67) {
                                    var84 = gopydjraovajtprp(var84, 1146944127);
                                    break;
                                 }

                                 var84 = 1737608281 ^ var84;
                                 byte var46 = (byte)(1289324841 ^ var84);
                                 int var17 = var46;
                                 var84 = 2023873471 ^ var84;

                                 while (true) {
                                    byte var68 = (byte)(880300678 ^ var84);
                                    if (var17 >= var68) {
                                       label92:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var84)) {
                                             case 94966906:
                                                var84 ^= 1705956282;
                                                break label92;
                                             case 950063389:
                                             default:
                                                throw new RuntimeException();
                                             case 1469129389:
                                                break;
                                             case 1596493317:
                                                break label92;
                                          }
                                       }

                                       var16 += 1373012269 ^ var84;

                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var84)) {
                                             case 244304787:
                                                var84 ^= 2057225308;
                                             case 385931735:
                                                continue label107;
                                             case 580538851:
                                             default:
                                                throw new RuntimeException();
                                             case 669796225:
                                          }
                                       }
                                    }

                                    var84 = 1993027172 ^ var84;
                                    BlockState var49 = var12.getBlockState(var17, var14, var16);
                                    Block var50 = var49.getBlock();
                                    Block var70 = Blocks.AMETHYST_CLUSTER;
                                    if (var50 != var70) {
                                       var84 = 449976078 ^ var84;
                                       var84 = gopydjraovajtprp(var84, 280238057);
                                    } else {
                                       var84 = 1290418389 ^ var84;
                                       int var76 = var9 + var17;
                                       int var80 = var10 + var16;
                                       BlockPos var51 = new BlockPos(var76, var15, var80);
                                       BlockState var53 = var0.getBlockState(var51);
                                       Block var54 = var53.getBlock();
                                       Block var72 = Blocks.AMETHYST_CLUSTER;
                                       if (var54 == var72) {
                                          var84 = gopydjraovajtprp(var84, 1029772458);
                                          d$a var81 = d$a.CLUSTER;
                                          com.wimpyclient.e.d var73 = new com.wimpyclient.e.d(var51, var81);
                                          boolean var56 = var1.add(var73);
                                          int var58 = var1.size();
                                          short var74 = (short)(859329165 ^ var84);
                                          if (var58 >= var74) {
                                             var84 = 1427834307 ^ var84;
                                             return;
                                          }

                                          var84 = gopydjraovajtprp(var84, 2079141016);
                                       } else {
                                          var84 = 467736234 ^ var84;

                                          label79:
                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var84)) {
                                                case 169151049:
                                                   var84 ^= 1567436440;
                                                   break label79;
                                                case 244701855:
                                                   break;
                                                case 529441519:
                                                   break label79;
                                                case 1809159678:
                                                default:
                                                   throw new RuntimeException();
                                             }
                                          }
                                       }
                                    }

                                    var17 += 1221950484 ^ var84;
                                    var84 = gopydjraovajtprp(var84, 2091724419);
                                 }
                              }
                           }

                           var14 += 1863630606 ^ var84;
                           var84 = gopydjraovajtprp(var84, 589319214);
                        }
                     }
                  } else {
                     var84 = 480361646 ^ var84;

                     label125:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var84)) {
                           case 124079368:
                              var84 ^= 1220630504;
                              break label125;
                           case 354737563:
                              break;
                           case 1274441081:
                           default:
                              throw new RuntimeException();
                           case 1520391465:
                              break label125;
                        }
                     }
                  }
               }
            } else {
               label134:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var84)) {
                     case 2078483:
                        var84 ^= 1422136008;
                        break label134;
                     case 777718417:
                     default:
                        throw new RuntimeException();
                     case 786967859:
                        break label134;
                     case 1697643458:
                  }
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var84)) {
                  case 110564650:
                     break;
                  case 207599032:
                     var84 = 1309791394 ^ var84;
                     return;
                  case 389161439:
                     return;
                  case 1521318592:
                  default:
                     throw new RuntimeException();
               }
            }
         }

         var11 += 1068456521 ^ var84;
         var84 = gopydjraovajtprp(var84, 138436940);
      }
   }

   static {
      int var3 = new Random(5404515837858874325L).nextInt();
      eko4h5HMJI = -1358835408 ^ var3;
   }

   public static String xusgqklcky(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] pgjiofsebwqpejx() {
      return new byte[]{
         31,
         105,
         71,
         90,
         114,
         108,
         94,
         72,
         70,
         99,
         24,
         18,
         18,
         69,
         94,
         37,
         66,
         3,
         68,
         110,
         28,
         97,
         69,
         51,
         42,
         112,
         16,
         26,
         102,
         79,
         7,
         87,
         113,
         94,
         25,
         89,
         50,
         9,
         95,
         25,
         109,
         35,
         84
      };
   }

   private static int gopydjraovajtprp(int var0, int var1) {
      return var1 ^ var0;
   }
}
