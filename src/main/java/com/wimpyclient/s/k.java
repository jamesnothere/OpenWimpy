package com.wimpyclient.s;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.PalettedContainer;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class k {
   static final int KEEP_TOP = 207;
   public final int chunkX;
   public final int chunkZ;
   private final byte[][] nibbles;
   private final byte[] uniform;
   private final short[] terrainTop;
   private final boolean[] iceTop;
   private final short[] motionTop;
   private static int oIELNBl6NP;
   private transient int iruT7E8WTc;

   private k(int var1, int var2) {
super();
      int var31 = 252697512 ^ 910761256;
      

      label25:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
            case 224648042:
            default:
               throw new RuntimeException();
            case 251206110:
               var31 = 708306802 ^ var31;
            case 1320490344:
               var31 = 1292241424 ^ 595248809 ^ Integer.parseInt("2098064715");
               this.iruT7E8WTc = 1320690270 ^ oIELNBl6NP;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
                     case 95101621:
                        var31 = 965145768 ^ var31;
                     case 602945975:
                        break label25;
                     case 641638045:
                     default:
                        throw new RuntimeException();
                     case 790753322:
                  }
               }
            case 1247808879:
         }
      }

      byte var4 = 24;
      byte[][] var16 = new byte[var4][];
      this.nibbles = var16;
      byte var17 = 24;
      byte[] var18 = new byte[var17];
      this.uniform = var18;
      short var19 = 256;
      short[] var20 = new short[var19];
      this.terrainTop = var20;
      short var21 = 256;
      boolean[] var22 = new boolean[var21];
      this.iceTop = var22;
      short var23 = 256;
      short[] var24 = new short[var23];
      this.motionTop = var24;
      this.chunkX = var1;
      this.chunkZ = var2;
      short[] var13 = this.terrainTop;
      byte var27 = -64;
      Arrays.fill(var13, (short)var27);
      short[] var15 = this.motionTop;
      byte var28 = -64;
      Arrays.fill(var15, (short)var28);
   }

   public static k of(int var0, int var1, PalettedContainer<BlockState>[] var2) {
      int var144 = 136208980 ^ 344087940 ^ 2079281761;
      var144 = 1967132847 ^ var144;
      k var3 = new k(var0, var1);
      k var6 = var3;
      byte var21 = (byte)(305364254 ^ var144);
      int var7 = var21;
      var144 = 1001022083 ^ var144;

      while (true) {
         byte var84 = (byte)(697900933 ^ var144);
         if (var7 >= var84) {
            var144 = fnwyfgqtaeghvqyq(var144, 67036865);
            return var6;
         }

         var144 = 1251238666 ^ var144;
         int var86 = var2.length;
         PalettedContainer var25;
         if (var7 < var86) {
            var144 = 702807213 ^ var144;
            var25 = var2[var7];

            label195:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var144)) {
                  case 19813022:
                     var144 ^= 1717713569;
                     break label195;
                  case 364590366:
                     break;
                  case 1614561548:
                     break label195;
                  case 1824043173:
                  default:
                     throw new IllegalStateException();
               }
            }
         } else {
            label188:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var144)) {
                  case 267010665:
                     var144 ^= 1673309147;
                     break label188;
                  case 491443975:
                     break;
                  case 538498039:
                     break label188;
                  case 742484875:
                  default:
                     throw new IllegalStateException();
               }
            }

            var25 = null;
            var144 = 742223319 ^ var144;
         }

         PalettedContainer var8 = var25;
         if (var25 == null) {
            var144 = 977030221 ^ var144;
            byte[] var28 = var6.uniform;
            byte var121 = (byte)(380696278 ^ var144);
            var28[var7] = var121;

            label179:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var144)) {
                  case 200722574:
                     var144 ^= 428210791;
                     break label179;
                  case 564081378:
                  default:
                     throw new IllegalStateException();
                  case 574439655:
                     break;
                  case 834718940:
                     break label179;
               }
            }
         } else {
            label172:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var144)) {
                  case 105940224:
                     var144 ^= 834808288;
                     break label172;
                  case 671890640:
                     break;
                  case 1520112614:
                  default:
                     throw new IllegalStateException();
                  case 1986055998:
                     break label172;
               }
            }

            byte var29 = (byte)(-491688773 ^ var144);
            byte var122 = (byte)(491688831 ^ var144);
            int var90 = var7 << var122;
            int var30 = var29 + var90;
            short var91 = (short)(491688884 ^ var144);
            byte var83;
            if (var30 > var91) {
               var144 = 1002110729 ^ var144;
               var83 = (byte)(653552754 ^ var144);
               var144 = 1084916975 ^ var144;
            } else {
               var144 = 847333678 ^ var144;
               var83 = (byte)(802150996 ^ var144);

               label163:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var144)) {
                     case 189367096:
                     default:
                        throw new IllegalStateException();
                     case 211982539:
                        var144 ^= 1234252488;
                     case 250350001:
                        break label163;
                     case 1936091843:
                  }
               }
            }

            byte var9 = var83;
            byte var92 = (byte)(1717495965 ^ var144);
            byte var123 = (byte)(1717495965 ^ var144);
            byte var140 = (byte)(1717495965 ^ var144);
            Object var32 = var25.get(var92, var123, var140);
            BlockState var33 = (BlockState)var32;
            byte var34 = m.of(var33);
            byte var10 = var34;
            Object var35 = null;
            byte[] var11 = (byte[])var35;
            byte var36 = (byte)(1717495965 ^ var144);
            int var12 = var36;
            var144 = 1647310102 ^ var144;

            label151:
            while (true) {
               short var93 = (short)(74517899 ^ var144);
               if (var12 >= var93) {
                  label79:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var144)) {
                        case 69865411:
                           var144 ^= 1967568209;
                           break label79;
                        case 394233673:
                           break;
                        case 983421604:
                        default:
                           throw new IllegalStateException();
                        case 1515422433:
                           break label79;
                     }
                  }

                  byte[] var79 = var6.uniform;
                  byte var139;
                  if (var9 != (1899473114 ^ var144)) {
                     var144 = 1248806050 ^ var144;
                     var139 = var10;
                     var144 = fnwyfgqtaeghvqyq(var144, 1851463418);
                  } else {
                     var144 = fnwyfgqtaeghvqyq(var144, 25163996);
                     var139 = (byte)(1883787273 ^ var144);
                     var144 = 625715844 ^ var144;
                  }

                  var79[var7] = var139;
                  byte[][] var81 = var6.nibbles;
                  var81[var7] = var11;
                  var144 = 1513551411 ^ var144;
                  break;
               }

               var144 = 1338101416 ^ var144;
               byte var94 = (byte)(1269879596 ^ var144);
               int var39 = var12 & var94;
               byte var95 = (byte)(1269879595 ^ var144);
               int var41 = var12 >> var95;
               byte var96 = (byte)(1269879591 ^ var144);
               int var43 = var12 >> var96;
               byte var97 = (byte)(1269879596 ^ var144);
               int var44 = var43 & var97;
               Object var46 = var8.get(var39, var41, var44);
               BlockState var47 = (BlockState)var46;
               byte var49 = m.of(var47);
               byte var50 = (byte)(-1269879581 ^ var144);
               byte var125 = (byte)(1269879591 ^ var144);
               int var100 = var7 << var125;
               int var51 = var50 + var100;
               int var52 = var51 + var41;
               byte var102 = (byte)(1269879586 ^ var144);
               int var53 = var52 + var102;
               byte var103 = (byte)(1269879603 ^ var144);
               int var104 = var103 * var44;
               int var55 = var39 + var104;
               if (var49 == (1269879587 ^ var144)) {
                  var144 = 1764200970 ^ var144;
               } else {
                  var144 = 2024356095 ^ var144;
                  byte var58 = (byte)((var47.blocksMotion()) ? 1 : 0);
                  if (var58 != (857336796 ^ var144)) {
                     var144 = 1878440530 ^ var144;
                     short[] var106 = var6.motionTop;
                     short var107 = var106[var55];
                     if (var53 > var107) {
                        var144 = 959702105 ^ var144;
                        short[] var61 = var6.motionTop;
                        short var129 = (short)var53;
                        var61[var55] = var129;
                        var144 = 1196160254 ^ var144;
                     } else {
                        var144 = 2121797799 ^ var144;
                     }
                  } else {
                     label94:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var144)) {
                           case 50465763:
                              var144 ^= 294562549;
                              break label94;
                           case 301433738:
                              break;
                           case 514898378:
                           default:
                              throw new IllegalStateException();
                           case 1746750117:
                              break label94;
                        }
                     }
                  }
               }

               byte var63 = (byte)((isTerrain(var47, var49)) ? 1 : 0);
               if (var63 == (580337961 ^ var144)) {
                  var144 = fnwyfgqtaeghvqyq(var144, 126588494);
               } else {
                  var144 = 645842579 ^ var144;
                  short[] var111 = var6.terrainTop;
                  short var112 = var111[var55];
                  if (var53 > var112) {
                     var144 = 672964140 ^ var144;
                     short[] var66 = var6.terrainTop;
                     short var132 = (short)var53;
                     var66[var55] = var132;
                     boolean[] var68 = var6.iceTop;
                     boolean var134 = isIce(var47);
                     var68[var55] = var134;
                     var144 = 166317809 ^ var144;
                  } else {
                     label108:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var144)) {
                           case 77261783:
                              var144 ^= 569725149;
                              break label108;
                           case 154922545:
                           default:
                              throw new IllegalStateException();
                           case 322715055:
                              break;
                           case 1829616558:
                              break label108;
                        }
                     }
                  }
               }

               label128:
               if (var9 != (622647143 ^ var144)) {
                  var144 = 1235878245 ^ var144;
                  if (var11 == null) {
                     var144 = 1817322870 ^ var144;
                     if (var49 == var10) {
                        var144 = 468898226 ^ var144;
                        var144 = fnwyfgqtaeghvqyq(var144, 1530210604);
                        break label128;
                     }

                     var144 = 405872514 ^ var144;
                     short var72 = (short)(416670966 ^ var144);
                     byte[] var73 = new byte[var72];
                     var11 = var73;
                     byte var74 = (byte)(416673014 ^ var144);
                     int var20 = var74;
                     var144 = 1570801833 ^ var144;

                     while (var20 < var12) {
                        var144 = 1598430313 ^ var144;
                        put(var11, var20, var10);
                        var20 += 439580727 ^ var144;
                        var144 = fnwyfgqtaeghvqyq(var144, 1598430313);
                     }

                     var144 = 703788770 ^ var144;
                  } else {
                     label125:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var144)) {
                           case 44192277:
                              var144 ^= 3228863;
                              break label125;
                           case 412036810:
                              break;
                           case 619433157:
                              break label125;
                           case 1772491342:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }

                  put(var11, var12, var49);
                  var144 = 748984663 ^ var144;
               } else {
                  label136:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var144)) {
                        case 132629579:
                           var144 ^= 1698684045;
                        case 422949446:
                           break label136;
                        case 860071094:
                           break;
                        case 2102655699:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               }

               var12 += 1076038635 ^ var144;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var144)) {
                     case 205760310:
                        var144 ^= 1146230369;
                        continue label151;
                     case 272386601:
                     default:
                        throw new IllegalStateException();
                     case 328811005:
                        break;
                     case 1167673425:
                        continue label151;
                  }
               }
            }
         }

         var7 += 255134896 ^ var144;
         var144 = fnwyfgqtaeghvqyq(var144, 648811308);
      }
   }

   static boolean isTerrain(BlockState var0, byte var1) {
      int var77 = 494456824 ^ 109792285 ^ 2079281761;
      var77 = 553851844 ^ var77;
      if (var1 != (1092602432 ^ var77)) {
         var77 = 1696233371 ^ var77;
         byte var3 = (byte)(604356058 ^ var77);
         if (var1 != var3) {
            var77 = 1051066607 ^ var77;
            byte var53 = (byte)(446938422 ^ var77);
            if (var1 != var53) {
               var77 = 2010346345 ^ var77;
               byte var54 = (byte)(1836109393 ^ var77);
               if (var1 != var54) {
                  var77 = 1697150190 ^ var77;
                  return (((byte)(140032690 ^ var77)) != 0);
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                     case 67822244:
                        var77 ^= 2063818388;
                     case 12086954:
                        byte var10 = (byte)((var0.blocksMotion()) ? 1 : 0);
                        if (var10 == (376672457 ^ var77)) {
                           var77 = 1160363476 ^ var77;
                           return (((byte)(1398418717 ^ var77)) != 0);
                        }

                        label147:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                              case 81201527:
                                 break;
                              case 192937718:
                                 var77 ^= 563549287;
                                 break label147;
                              case 1322868793:
                              default:
                                 throw new RuntimeException();
                              case 1939699960:
                                 break label147;
                           }
                        }

                        DefaultedRegistry var11 = BuiltInRegistries.BLOCK;
                        Block var56 = var0.getBlock();
                        Identifier var12 = var11.getKey(var56);
                        String var13 = var12.getPath();
                        String var57 = bkfqqlogdk(mtzctdfixlcckhq(), ojpsylnvtthphsi(), var77);
                        byte var15 = (byte)((var13.endsWith(var57)) ? 1 : 0);
                        if (var15 == (937723054 ^ var77)) {
                           var77 = 849326125 ^ var77;
                           String var58 = bkfqqlogdk(fmojvarzfwytdoz(), ojpsylnvtthphsi(), var77);
                           byte var17 = (byte)((var13.equals(var58)) ? 1 : 0);
                           if (var17 == (91960451 ^ var77)) {
                              var77 = 1752031450 ^ var77;
                              String var59 = bkfqqlogdk(qzcjqpwpaodloca(), ojpsylnvtthphsi(), var77);
                              byte var19 = (byte)((var13.equals(var59)) ? 1 : 0);
                              if (var19 == (1830212697 ^ var77)) {
                                 var77 = 476129873 ^ var77;
                                 String var60 = bkfqqlogdk(kgtqpijpjhtwrbu(), ojpsylnvtthphsi(), var77);
                                 byte var21 = (byte)((var13.equals(var60)) ? 1 : 0);
                                 if (var21 == (1903689224 ^ var77)) {
                                    var77 = 1512481080 ^ var77;
                                    String var61 = bkfqqlogdk(uauguqbzwxwwwoe(), ojpsylnvtthphsi(), var77);
                                    byte var23 = (byte)((var13.endsWith(var61)) ? 1 : 0);
                                    if (var23 == (726753072 ^ var77)) {
                                       var77 = 945779403 ^ var77;
                                       String var62 = bkfqqlogdk(cfntenuuqtrxpbi(), ojpsylnvtthphsi(), var77);
                                       byte var25 = (byte)((var13.endsWith(var62)) ? 1 : 0);
                                       if (var25 == (319696379 ^ var77)) {
                                          var77 = 205963560 ^ var77;
                                          String var63 = bkfqqlogdk(ufgfwlebbhmdwtd(), ojpsylnvtthphsi(), var77);
                                          byte var27 = (byte)((var13.endsWith(var63)) ? 1 : 0);
                                          if (var27 == (524872915 ^ var77)) {
                                             var77 = 1361356487 ^ var77;
                                             String var64 = bkfqqlogdk(hilyrumsplkmzbb(), ojpsylnvtthphsi(), var77);
                                             byte var29 = (byte)((var13.equals(var64)) ? 1 : 0);
                                             if (var29 == (1315719700 ^ var77)) {
                                                var77 = 308276178 ^ var77;
                                                String var65 = bkfqqlogdk(giinphhqvnxaljg(), ojpsylnvtthphsi(), var77);
                                                byte var31 = (byte)((var13.equals(var65)) ? 1 : 0);
                                                if (var31 == (1546887622 ^ var77)) {
                                                   var77 = 443314678 ^ var77;
                                                   String var66 = bkfqqlogdk(xlvhnobwrseafnk(), ojpsylnvtthphsi(), var77);
                                                   byte var33 = (byte)((var13.equals(var66)) ? 1 : 0);
                                                   if (var33 == (1180684336 ^ var77)) {
                                                      var77 = 1009513000 ^ var77;
                                                      String var67 = bkfqqlogdk(knfpakwrnurhwyi(), ojpsylnvtthphsi(), var77);
                                                      byte var35 = (byte)((var13.equals(var67)) ? 1 : 0);
                                                      if (var35 == (2054431256 ^ var77)) {
                                                         var77 = 1063831227 ^ var77;
                                                         String var68 = bkfqqlogdk(ybbqtvnzabjjmdx(), ojpsylnvtthphsi(), var77);
                                                         byte var37 = (byte)((var13.equals(var68)) ? 1 : 0);
                                                         if (var37 == (1159521443 ^ var77)) {
                                                            var77 = 149836684 ^ var77;
                                                            String var69 = bkfqqlogdk(iivgrkolsjbdmwm(), ojpsylnvtthphsi(), var77);
                                                            byte var39 = (byte)((var13.equals(var69)) ? 1 : 0);
                                                            if (var39 == (1307752239 ^ var77)) {
                                                               var77 = 1926437843 ^ var77;
                                                               String var70 = bkfqqlogdk(mgoidcqdnwzcakc(), ojpsylnvtthphsi(), var77);
                                                               byte var41 = (byte)((var13.equals(var70)) ? 1 : 0);
                                                               if (var41 == (1059171580 ^ var77)) {
                                                                  var77 = 2059090383 ^ var77;
                                                                  String var71 = bkfqqlogdk(dxgruchvwcwgvvn(), ojpsylnvtthphsi(), var77);
                                                                  byte var43 = (byte)((var13.equals(var71)) ? 1 : 0);
                                                                  if (var43 == (1167758643 ^ var77)) {
                                                                     var77 = 1714804675 ^ var77;
                                                                     String var72 = bkfqqlogdk(poeskdqrrwqijjm(), ojpsylnvtthphsi(), var77);
                                                                     byte var45 = (byte)((var13.equals(var72)) ? 1 : 0);
                                                                     if (var45 == (598688496 ^ var77)) {
                                                                        var77 = 403308104 ^ var77;
                                                                        String var73 = bkfqqlogdk(cnoqpfdchuxtxqn(), ojpsylnvtthphsi(), var77);
                                                                        byte var47 = (byte)((var13.equals(var73)) ? 1 : 0);
                                                                        if (var47 == (1000783032 ^ var77)) {
                                                                           var77 = 1000145773 ^ var77;
                                                                           String var74 = bkfqqlogdk(bwvfljeznszwzkd(), ojpsylnvtthphsi(), var77);
                                                                           byte var49 = (byte)((var13.equals(var74)) ? 1 : 0);
                                                                           if (var49 == (3915733 ^ var77)) {
                                                                              label81:
                                                                              while (true) {
                                                                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                                                                                    case 3671020:
                                                                                       var77 ^= 1053323846;
                                                                                    case 103089516:
                                                                                       break label81;
                                                                                    case 1315926056:
                                                                                    default:
                                                                                       throw new RuntimeException();
                                                                                    case 1611393685:
                                                                                 }
                                                                              }

                                                                              byte var50 = (byte)(1056165267 ^ var77);
                                                                              var77 = 2008473331 ^ var77;
                                                                              return (var50 != 0);
                                                                           }

                                                                           var77 = 2074564910 ^ var77;
                                                                        } else {
                                                                           label105:
                                                                           while (true) {
                                                                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                                                                                 case 59979266:
                                                                                    var77 ^= 1077566019;
                                                                                 case 151884623:
                                                                                    break label105;
                                                                                 case 823436791:
                                                                                 default:
                                                                                    throw new RuntimeException();
                                                                                 case 1465213780:
                                                                              }
                                                                           }
                                                                        }
                                                                     } else {
                                                                        var77 = 1479779339 ^ var77;
                                                                     }
                                                                  } else {
                                                                     label125:
                                                                     while (true) {
                                                                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                                                                           case 115065992:
                                                                              var77 ^= 1040610248;
                                                                              break label125;
                                                                           case 561452737:
                                                                           default:
                                                                              throw new RuntimeException();
                                                                           case 1128178053:
                                                                              break;
                                                                           case 1134676791:
                                                                              break label125;
                                                                        }
                                                                     }
                                                                  }
                                                               } else {
                                                                  var77 = 1153255943 ^ var77;
                                                               }
                                                            } else {
                                                               var77 = 913199572 ^ var77;
                                                            }
                                                         } else {
                                                            var77 = fnwyfgqtaeghvqyq(var77, 1048576600);
                                                         }
                                                      } else {
                                                         label99:
                                                         while (true) {
                                                            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                                                               case 98539806:
                                                                  break;
                                                               case 115408085:
                                                                  break label99;
                                                               case 222394490:
                                                                  var77 ^= 32031971;
                                                                  break label99;
                                                               case 1007038742:
                                                               default:
                                                                  throw new RuntimeException();
                                                            }
                                                         }
                                                      }
                                                   } else {
                                                      var77 = 1036203723 ^ var77;
                                                   }
                                                } else {
                                                   label119:
                                                   while (true) {
                                                      switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                                                         case 44324188:
                                                            var77 ^= 665798461;
                                                            break label119;
                                                         case 168898454:
                                                            break;
                                                         case 1066055710:
                                                            break label119;
                                                         case 1723146268:
                                                         default:
                                                            throw new RuntimeException();
                                                      }
                                                   }
                                                }
                                             } else {
                                                var77 = 904965359 ^ var77;
                                             }
                                          } else {
                                             label113:
                                             while (true) {
                                                switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                                                   case 211637648:
                                                      var77 ^= 1691617832;
                                                      break label113;
                                                   case 470178443:
                                                   default:
                                                      throw new RuntimeException();
                                                   case 660112156:
                                                      break label113;
                                                   case 923484545:
                                                }
                                             }
                                          }
                                       } else {
                                          var77 = 1754450688 ^ var77;
                                       }
                                    } else {
                                       var77 = fnwyfgqtaeghvqyq(var77, 1355659723);
                                    }
                                 } else {
                                    var77 = fnwyfgqtaeghvqyq(var77, 183179507);
                                 }
                              } else {
                                 var77 = 378155682 ^ var77;
                              }
                           } else {
                              var77 = fnwyfgqtaeghvqyq(var77, 2129121912);
                           }
                        } else {
                           var77 = 1282957909 ^ var77;
                        }

                        byte var100 = (byte)(2073880314 ^ var77);

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var77)) {
                              case 260015130:
                                 var77 = 853144987 ^ var77;
                                 return (var100 != 0);
                              case 401824290:
                                 break;
                              case 1341886005:
                                 return (var100 != 0);
                              case 1788632436:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     case 883642899:
                     default:
                        throw new RuntimeException();
                     case 1770410973:
                  }
               }
            }

            var77 = 896762888 ^ var77;
         } else {
            var77 = fnwyfgqtaeghvqyq(var77, 198542567);
         }
      } else {
         var77 = fnwyfgqtaeghvqyq(var77, 1859122044);
      }

      return (((byte)(802175292 ^ var77)) != 0);
   }

   static boolean isIce(BlockState var0) {
      int var13 = 174980316 ^ 1757985938 ^ 2079281761;
      var13 = 1201523030 ^ var13;
      Block var2 = Blocks.PACKED_ICE;
      byte var3 = (byte)((var0.is(var2)) ? 1 : 0);
      if (var3 == (1591204729 ^ var13)) {
         var13 = 139253613 ^ var13;
         Block var9 = Blocks.BLUE_ICE;
         byte var5 = (byte)((var0.is(var9)) ? 1 : 0);
         if (var5 == (1453001748 ^ var13)) {
            var13 = 996323330 ^ var13;
            Block var10 = Blocks.SNOW_BLOCK;
            byte var7 = (byte)((var0.is(var10)) ? 1 : 0);
            if (var7 == (1845083158 ^ var13)) {
               var13 = fnwyfgqtaeghvqyq(var13, 32598328);
               byte var8 = (byte)(1812518190 ^ var13);
               var13 = 1380072567 ^ var13;
               return (var8 != 0);
            }

            var13 = 691704888 ^ var13;
         } else {
            var13 = fnwyfgqtaeghvqyq(var13, 307766330);
         }
      } else {
         var13 = 437580631 ^ var13;
      }

      byte var21 = (byte)(1153640495 ^ var13);
      var13 = 2055848311 ^ var13;
      return (var21 != 0);
   }

   private static void put(byte[] var0, int var1, byte var2) {
      int var31 = 1898810968 ^ 156747169 ^ 2079281761;
      var31 = 1900452195 ^ var31;
      byte var4 = (byte)(1926463738 ^ var31);
      int var9 = var1 >> var4;
      byte var6 = (byte)(1926463738 ^ var31);
      int var12 = var1 & var6;
      byte var17;
      if (var12 == (1926463739 ^ var31)) {
         var31 = 2058717485 ^ var31;
         byte var19 = var0[var9];
         short var27 = (short)(140904742 ^ var31);
         int var20 = var19 & var27;
         int var21 = var20 | var2;
         var17 = (byte)var21;

         label20:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
               case 4569960:
                  var31 = 1861276354 ^ var31;
               case 959251926:
                  break label20;
               case 1643392536:
               default:
                  throw new RuntimeException(new IOException());
               case 1939325380:
            }
         }
      } else {
         label28:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
               case 167322356:
                  break label28;
               case 242858805:
                  var31 ^= 503797970;
                  break label28;
               case 288489149:
               default:
                  throw new RuntimeException(new IOException());
               case 2107559724:
            }
         }

         byte var14 = var0[var9];
         byte var23 = (byte)(1825888294 ^ var31);
         int var15 = var14 & var23;
         byte var7 = (byte)(1825888301 ^ var31);
         int var25 = var2 << var7;
         int var16 = var15 | var25;
         var17 = (byte)var16;
         var31 = 172098365 ^ var31;
      }

      var0[var9] = var17;
   }

   public byte kind(int var1, int var2, int var3) {
      int var60 = 429066926 ^ 418207210 ^ 894922815;
      var60 = 1633350291 ^ var60;
      byte var5 = (byte)(-1433656792 ^ var60);
      if (var2 >= var5) {
         var60 = 169186232 ^ var60;
         short var37 = (short)(1600540432 ^ var60);
         if (var2 < var37) {
            var60 = 1149023218 ^ var60;
            byte var38 = (byte)(-454753694 ^ var60);
            int var13 = var2 - var38;
            byte var39 = (byte)(454753702 ^ var60);
            int var14 = var13 >> var39;
            byte[][] var16 = this.nibbles;
            byte[] var17 = var16[var14];
            if (var17 == null) {
               var60 = 757351198 ^ var60;
               byte[] var34 = this.uniform;
               return var34[var14];
            } else {
               var60 = fnwyfgqtaeghvqyq(var60, 1799008582);
               byte var41 = (byte)(1881165035 ^ var60);
               int var20 = var2 & var41;
               byte var42 = (byte)(1881165036 ^ var60);
               int var21 = var20 << var42;
               byte var6 = (byte)(1881165035 ^ var60);
               int var44 = var3 & var6;
               byte var55 = (byte)(1881165024 ^ var60);
               int var45 = var44 << var55;
               int var22 = var21 | var45;
               byte var56 = (byte)(1881165035 ^ var60);
               int var47 = var1 & var56;
               int var23 = var22 | var47;
               byte var57 = (byte)(1881165029 ^ var60);
               int var49 = var23 >> var57;
               byte var25 = var17[var49];
               byte var50 = (byte)(1881165029 ^ var60);
               int var27 = var23 & var50;
               int var29;
               if (var27 == (1881165028 ^ var60)) {
                  var60 = 437561331 ^ var60;
                  byte var51 = (byte)(1781852952 ^ var60);
                  var29 = var25 & var51;
                  var60 = fnwyfgqtaeghvqyq(var60, 958445757);
               } else {
                  var60 = fnwyfgqtaeghvqyq(var60, 780040002);
                  byte var52 = (byte)(1583233954 ^ var60);
                  int var32 = var25 >> var52;
                  byte var53 = (byte)(1583233961 ^ var60);
                  var29 = var32 & var53;
                  var60 = 222980108 ^ var60;
               }

               return (byte)var29;
            }
         } else {
            var60 = fnwyfgqtaeghvqyq(var60, 2016736707);
            return (byte)(659733395 ^ var60);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var60)) {
               case 93333634:
                  var60 ^= 1914791547;
                  return (byte)(659733395 ^ var60);
               case 971739788:
                  break;
               case 1035726177:
                  return (byte)(659733395 ^ var60);
               case 1151489987:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   public int terrainTop(int var1, int var2) {
      int var23 = 1706528428 ^ 1666317990 ^ 894922815;
      var23 = 1014777926 ^ var23;
      byte var4 = (byte)(265111676 ^ var23);
      int var8 = var1 & var4;
      byte var16 = (byte)(265111651 ^ var23);
      byte var6 = (byte)(265111676 ^ var23);
      int var20 = var2 & var6;
      int var17 = var16 * var20;
      int var9 = var8 + var17;
      boolean[] var11 = this.iceTop;
      byte var12 = (byte)((var11[var9]) ? 1 : 0);
      int var15;
      if (var12 != (265111667 ^ var23)) {
         var23 = 1340427027 ^ var23;
         var15 = -1071119520 ^ var23;
         var23 = 1989719425 ^ var23;
      } else {
         var23 = 1605929302 ^ var23;
         short[] var14 = this.terrainTop;
         var15 = var14[var9];
         var23 = 1724217284 ^ var23;
      }

      return var15;
   }

   public int motionTop(int var1, int var2) {
      int var17 = 1201258012 ^ 773138115 ^ 894922815;
      var17 = 763462384 ^ var17;
      short[] var8 = this.motionTop;
      byte var5 = (byte)(1901750815 ^ var17);
      int var10 = var1 & var5;
      byte var12 = (byte)(1901750784 ^ var17);
      byte var7 = (byte)(1901750815 ^ var17);
      int var14 = var2 & var7;
      int var13 = var12 * var14;
      int var11 = var10 + var13;
      return var8[var11];
   }

   static {
      int var3 = new Random(-8417804921336378396L).nextInt();
      oIELNBl6NP = -726069556 ^ var3;
   }

   public static String bkfqqlogdk(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] ojpsylnvtthphsi() {
      return new byte[]{
         14,
         112,
         45,
         65,
         24,
         119,
         82,
         104,
         96,
         16,
         44,
         70,
         40,
         97,
         68,
         2,
         51,
         95,
         82,
         111,
         54,
         108,
         37,
         60,
         13,
         92,
         35,
         62,
         124,
         26,
         126,
         80,
         113,
         45,
         85,
         108,
         88,
         108,
         50,
         93,
         124,
         88,
         39,
         58,
         81,
         93,
         116,
         87,
         2,
         95,
         102,
         1,
         75,
         62,
         116,
         97,
         76,
         70,
         69,
         100,
         37,
         104,
         107,
         6,
         21,
         97,
         112,
         35,
         22,
         124,
         54,
         65,
         39,
         122,
         19,
         109,
         116,
         24,
         57,
         127,
         85,
         90,
         1,
         3,
         70,
         76,
         27,
         84,
         17,
         71,
         69,
         108,
         36,
         83
      };
   }

   private static byte[] iivgrkolsjbdmwm() {
      return new byte[]{-63, -68, 29, 6, 47, 45, 96, 45, 83, 77, 29, 16, 24, 36, 115, 104, 1, 30, 97, 56, 7, 48, 21, 124};
   }

   private static byte[] kgtqpijpjhtwrbu() {
      return new byte[]{-63, -74, 29, 31, 46, 54, 107, 57, 82, 65, 29, 19, 24, 59, 114, 79, 10, 0};
   }

   private static byte[] mtzctdfixlcckhq() {
      return new byte[]{-55, -68, 26, 18, 42, 45, 98, 47, 84, 93};
   }

   private static byte[] poeskdqrrwqijjm() {
      return new byte[]{-59, -74, 21, 19, 32, 61, 102, 56, 86, 85, 21, 13, 30, 45, 124, 89, 10, 7, 103, 51, 14, 5, 29, 102, 57, 9, 21, 100, 69, 65, 72, 3};
   }

   private static byte[] cnoqpfdchuxtxqn() {
      return new byte[]{-63, -65, 29, 28, 47, 46, 97, 63, 83, 79, 29, 23, 24, 14, 115, 88, 0, 3, 97, 50, 7, 63, 21, 103};
   }

   private static byte[] hilyrumsplkmzbb() {
      return new byte[]{-63, -68, 28, 7, 47, 40, 107, 48, 80, 87, 29, 42, 25, 54, 115, 95, 10, 7, 98, 60, 7, 52};
   }

   private static byte[] uauguqbzwxwwwoe() {
      return new byte[]{-57, -67, 27, 5, 45, 37, 98, 49, 82, 67};
   }

   private static byte[] qzcjqpwpaodloca() {
      return new byte[]{-63, -73, 30, 1, 42, 41, 96, 58, 89, 93, 29, 17, 27, 61};
   }

   private static byte[] cfntenuuqtrxpbi() {
      return new byte[]{-61, -66, 20, 4, 33, 32, 97, 49, 89, 71, 29, 12, 30, 44, 114, 94, 4, 8, 97, 59};
   }

   private static byte[] ybbqtvnzabjjmdx() {
      return new byte[]{-63, -66, 24, 27, 45, 36, 99, 48, 84, 64, 29, 30, 29, 44, 113, 85};
   }

   private static byte[] mgoidcqdnwzcakc() {
      return new byte[]{-63, -65, 24, 21, 41, 47, 99, 46, 88, 83, 29, 41, 29, 58, 117, 89, 2, 5, 106, 60, 7, 55};
   }

   private static byte[] bwvfljeznszwzkd() {
      return new byte[]{-61, -74, 28, 7, 47, 41, 97, 52, 89, 78, 25, 5, 27, 58, 119, 100, 2, 8, 101, 61, 5, 44, 28, 108, 56, 7, 16, 121};
   }

   private static byte[] knfpakwrnurhwyi() {
      return new byte[]{-62, -65, 24, 24, 44, 49, 99, 62};
   }

   private static byte[] ufgfwlebbhmdwtd() {
      return new byte[]{-59, -67, 25, 13, 47, 32, 107, 43, 85, 87, 30, 19, 16, 53, 118, 84, 2, 30, 103, 41, 2, 53};
   }

   private static byte[] dxgruchvwcwgvvn() {
      return new byte[]{-63, -66, 27, 21, 47, 46, 106, 63, 84, 90};
   }

   private static byte[] fmojvarzfwytdoz() {
      return new byte[]{-55, -66, 20, 16, 40, 49, 103, 56, 89, 82, 21, 3, 24, 10, 113, 81, 10, 2, 107, 54, 6, 59, 16, 102};
   }

   private static byte[] xlvhnobwrseafnk() {
      return new byte[]{-63, -66, 21, 19, 46, 35, 102, 46, 83, 67, 29, 40, 16, 56, 114, 89, 7, 9};
   }

   private static byte[] giinphhqvnxaljg() {
      return new byte[]{-63, -70, 25, 7, 32, 46, 101, 61, 82, 73, 29, 22, 28, 51, 124, 101, 4, 0, 96, 62, 7, 60};
   }

   private static int fnwyfgqtaeghvqyq(int var0, int var1) {
      return var0 ^ var1;
   }
}
