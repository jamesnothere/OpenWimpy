package com.wimpyclient.u;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.InflaterInputStream;
import java.util.Locale;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.NbtAccounter;
import net.minecraft.nbt.NbtIo;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class f {
   private static int auYKtrKpEb;
   private transient int FXPa6qUw1t;
   private static String ljindsomxk = ByteBuffer.wrap(nyityqbfexeqhce()).asCharBuffer().toString();

   private f() {
super();
      int var4 = 1648325666 ^ 1246807118;
      
      var4 = qvsjhsjvcvggqiuk(var4, 1857540574);
      var4 = 1352857687 ^ 34838251 ^ Integer.parseInt("342429454");
      this.FXPa6qUw1t = 211911905 ^ auYKtrKpEb;
      var4 = qvsjhsjvcvggqiuk(var4, 269066881);
   }

   public static c load(Path var0) throws IOException {
      int var71 = 1759522677 ^ 157842943 ^ 1420744373;
      var71 = 1065504265 ^ var71;
      if (var0 != null) {
         var71 = 2016482195 ^ var71;
         byte var2 = (byte)(1922423205 ^ var71);
         LinkOption[] var50 = new LinkOption[var2];
         byte var8 = (byte)((Files.isRegularFile(var0, var50)) ? 1 : 0);
         if (var8 != (1922423205 ^ var71)) {
            var71 = 362972413 ^ var71;
            Path var10 = var0.getFileName();
            String var11 = var10.toString();
            Locale var51 = Locale.ROOT;
            String var13 = var11.toLowerCase(var51);
            CompoundTag var15 = readRoot(var0);
            if (var15 != null) {
               var71 = 440758434 ^ var71;
               byte var18 = (byte)((var15.isEmpty()) ? 1 : 0);
               if (var18 == (2104634874 ^ var71)) {
                  var71 = qvsjhsjvcvggqiuk(var71, 573641906);
                  String var52 = torlirkdgs(brccqhrfghbkvkq(), var71);
                  byte var20 = (byte)((var13.endsWith(var52)) ? 1 : 0);
                  if (var20 == (1598241096 ^ var71)) {
                     var71 = 2057792349 ^ var71;
                     String var53 = torlirkdgs(bngcixuceaejijt(), var71);
                     byte var22 = (byte)((var15.contains(var53)) ? 1 : 0);
                     if (var22 != (635720213 ^ var71)) {
                        var71 = 735373886 ^ var71;
                        return loadLitematic(var11, var15);
                     }

                     label101:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var71)) {
                           case 157973228:
                              var71 ^= 243257268;
                           case 200482821:
                              break label101;
                           case 736746986:
                              break;
                           case 1052997419:
                           default:
                              throw new IllegalStateException();
                        }
                     }

                     String var54 = torlirkdgs(dmvwjuqnlotutxw(), var71);
                     byte var24 = (byte)((var13.endsWith(var54)) ? 1 : 0);
                     if (var24 == (731618721 ^ var71)) {
                        var71 = 293499733 ^ var71;
                        String var55 = torlirkdgs(anmukstaigwddpx(), var71);
                        byte var26 = (byte)((var15.contains(var55)) ? 1 : 0);
                        if (var26 == (988147444 ^ var71)) {
                           var71 = 1457688038 ^ var71;
                           String var56 = torlirkdgs(eyyxevetprjsdjw(), var71);
                           byte var28 = (byte)((var15.contains(var56)) ? 1 : 0);
                           if (var28 != (1812423442 ^ var71)) {
                              var71 = 187261286 ^ var71;
                              return loadSponge(var11, var15);
                           }

                           var71 = 23416292 ^ var71;
                           String var57 = torlirkdgs(upedixpgubmotka(), var71);
                           byte var30 = (byte)((var13.endsWith(var57)) ? 1 : 0);
                           if (var30 == (1835151094 ^ var71)) {
                              var71 = 774064413 ^ var71;
                              String var58 = torlirkdgs(verfhvhtkyxqycy(), var71);
                              byte var32 = (byte)((var15.contains(var58)) ? 1 : 0);
                              if (var32 != (1128359915 ^ var71)) {
                                 var71 = 883273565 ^ var71;
                                 return loadLegacy(var11, var15);
                              }

                              var71 = 1685418246 ^ var71;
                              String var60 = torlirkdgs(zgialfuuofnzahz(), var71);
                              byte var36 = (byte)((var15.contains(var60)) ? 1 : 0);
                              if (var36 != (657725165 ^ var71)) {
                                 var71 = 1557865751 ^ var71;
                                 return loadLitematic(var11, var15);
                              }

                              var71 = qvsjhsjvcvggqiuk(var71, 1887331442);
                              String var61 = torlirkdgs(mgjqlfhvatdnstu(), var71);
                              byte var38 = (byte)((var15.contains(var61)) ? 1 : 0);
                              if (var38 != (1464496799 ^ var71)) {
                                 var71 = 595017679 ^ var71;
                                 return loadSponge(var11, var15);
                              }

                              label63:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var71)) {
                                    case 153119070:
                                       var71 = 1046454944 ^ var71;
                                    case 799413584:
                                       break label63;
                                    case 1222212050:
                                    default:
                                       throw new IllegalStateException();
                                    case 2107892152:
                                 }
                              }
                           } else {
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var71)) {
                                    case 65951646:
                                       var71 = 445048384 ^ var71;
                                       return loadLegacy(var11, var15);
                                    case 1229922623:
                                       return loadLegacy(var11, var15);
                                    case 1247728106:
                                       break;
                                    case 1684445300:
                                    default:
                                       throw new IllegalStateException();
                                 }
                              }
                           }
                        } else {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var71)) {
                                 case 35472413:
                                    var71 = 1573645440 ^ var71;
                                    return loadSponge(var11, var15);
                                 case 296585431:
                                    return loadSponge(var11, var15);
                                 case 450104963:
                                    break;
                                 case 1626180211:
                                 default:
                                    throw new IllegalStateException();
                              }
                           }
                        }
                     } else {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var71)) {
                              case 75344636:
                                 var71 = 1286971349 ^ var71;
                                 return loadSponge(var11, var15);
                              case 179731144:
                                 break;
                              case 1271737167:
                              default:
                                 throw new IllegalStateException();
                              case 1665608374:
                                 return loadSponge(var11, var15);
                           }
                        }
                     }
                  } else {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var71)) {
                           case 143811000:
                              var71 = 1366524259 ^ var71;
                              return loadLitematic(var11, var15);
                           case 272617544:
                              break;
                           case 511109160:
                              return loadLitematic(var11, var15);
                           case 1156459659:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }

                  String var66 = "Unrecognized schematic format: " + var11;
                  IOException var39 = new IOException(var66);
                  throw new RuntimeException(var39);
               }

               var71 = 548320962 ^ var71;
            } else {
               var71 = 988530272 ^ var71;
            }

            String var67 = torlirkdgs(udrjbkqixebyxio(), var71);
            IOException var48 = new IOException(var67);
            throw new RuntimeException(var48);
         }

         var71 = 686409052 ^ var71;
      } else {
         var71 = qvsjhsjvcvggqiuk(var71, 1356388047);
      }

      String var68 = torlirkdgs(fobjhcvunnnzwre(), var71);
      IOException var49 = new IOException(var68);
      throw new RuntimeException(var49);
   }

   private static c loadLitematic(String var0, CompoundTag var1) throws IOException {
      int var232 = 2018287305 ^ 657388007 ^ 1420744373;
      var232 = 1101253951 ^ var232;
      String var3 = torlirkdgs(bujuqasmmaubwzi(), var232);
      CompoundTag var31 = var1.getCompoundOrEmpty(var3);
      CompoundTag var10 = var31;
      byte var33 = (byte)((var31.isEmpty()) ? 1 : 0);
      if (var33 != (1248818340 ^ var232)) {
         var232 = 86936914 ^ var232;
         String var200 = torlirkdgs(sewugfelxnqmlet(), var232);
         IOException var130 = new IOException(var200);
         throw new RuntimeException(var130);
      } else {
         label175: {
            int var15;
            int var17;
            ArrayList var22;
            int var51;
            String var131;
            label174:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var232)) {
                  case 3652498:
                     var232 ^= 348004810;
                  case 928561659:
                     Object var34 = null;
                     String var11 = (String)var34;
                     Object var35 = null;
                     CompoundTag var12 = (CompoundTag)var35;
                     byte var36 = (byte)(-1590777199 ^ var232);
                     int var13 = var36;
                     Set var38 = var31.keySet();
                     Iterator var39 = var38.iterator();
                     Iterator var14 = var39;
                     var232 = 1918029543 ^ var232;

                     label170:
                     while (true) {
                        byte var41 = (byte)((var14.hasNext()) ? 1 : 0);
                        if (var41 == (746822537 ^ var232)) {
                           var232 = 539167450 ^ var232;
                           if (var12 == null) {
                              var232 = 1481870510 ^ var232;
                              String var4 = torlirkdgs(kxsngzxphahmkii(), var232);
                              IOException var43 = new IOException(var4);
                              throw new RuntimeException(var43);
                           }

                           var232 = 1494571413 ^ var232;
                           String var132 = torlirkdgs(eupjxnllbakqotf(), var232);
                           CompoundTag var45 = var12.getCompoundOrEmpty(var132);
                           String var133 = torlirkdgs(yyeupvbsvcjjxzw(), var232);
                           String var5 = torlirkdgs(xtnbamtznjwgxvo(), var232);
                           byte var6 = (byte)(1437976774 ^ var232);
                           int var174 = var45.getIntOr(var5, var6);
                           int var47 = var45.getIntOr(var133, var174);
                           int var48 = Math.abs(var47);
                           var15 = var48;
                           String var134 = torlirkdgs(sndwlbreqbchdie(), var232);
                           String var201 = torlirkdgs(ghrziglxflzzupb(), var232);
                           byte var209 = (byte)(1437976774 ^ var232);
                           int var176 = var45.getIntOr(var201, var209);
                           int var50 = var45.getIntOr(var134, var176);
                           var51 = Math.abs(var50);
                           String var135 = torlirkdgs(ankaqbepllmnqrs(), var232);
                           String var202 = torlirkdgs(ymushuinhnzebyj(), var232);
                           byte var210 = (byte)(1437976774 ^ var232);
                           int var178 = var45.getIntOr(var202, var210);
                           int var53 = var45.getIntOr(var135, var178);
                           int var54 = Math.abs(var53);
                           var17 = var54;
                           if (var48 == (1437976774 ^ var232)) {
                              var232 = qvsjhsjvcvggqiuk(var232, 722873258);
                              break label175;
                           }

                           var232 = 960288331 ^ var232;
                           if (var51 == (1820925581 ^ var232)) {
                              var232 = qvsjhsjvcvggqiuk(var232, 304807393);
                              break label175;
                           }

                           var232 = 1499329884 ^ var232;
                           if (var54 == (903146449 ^ var232)) {
                              var232 = 1266092221 ^ var232;
                              break label175;
                           }

                           var232 = 932715504 ^ var232;
                           String var136 = torlirkdgs(ufjcnxvikjhcmuy(), var232);
                           ListTag var59 = var12.getListOrEmpty(var136);
                           ListTag var18 = var59;
                           int var180 = var59.size();
                           ArrayList var60 = new ArrayList(var180);
                           ArrayList var19 = var60;
                           byte var61 = (byte)(38596641 ^ var232);
                           int var20 = var61;
                           var232 = 367177099 ^ var232;

                           while (true) {
                              int var138 = var18.size();
                              if (var20 >= var138) {
                                 var232 = 1551377999 ^ var232;
                                 byte var64 = (byte)((var19.isEmpty()) ? 1 : 0);
                                 if (var64 != (1272347621 ^ var232)) {
                                    var232 = 188262230 ^ var232;
                                    Block var139 = Blocks.AIR;
                                    BlockState var140 = var139.defaultBlockState();
                                    boolean var66 = var19.add(var140);
                                    var232 = 802686937 ^ var232;
                                 } else {
                                    label146:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var232)) {
                                          case 49273821:
                                             var232 ^= 618700943;
                                             break label146;
                                          case 1254156061:
                                          default:
                                             throw new IllegalStateException();
                                          case 1352045261:
                                             break;
                                          case 1873835759:
                                             break label146;
                                       }
                                    }
                                 }

                                 String var141 = torlirkdgs(bcbkhdmkoitwbuf(), var232);
                                 long[] var68 = longArray(var12, var141);
                                 long[] var225 = var68;
                                 byte var69 = (byte)(1865866088 ^ var232);
                                 byte var142 = (byte)(1865866058 ^ var232);
                                 int var182 = var19.size();
                                 byte var203 = (byte)(1865866091 ^ var232);
                                 int var183 = var182 - var203;
                                 int var184 = Integer.numberOfLeadingZeros(var183);
                                 int var143 = var142 - var184;
                                 int var70 = Math.max(var69, var143);
                                 int var21 = var70;
                                 ArrayList var71 = new ArrayList();
                                 var22 = var71;
                                 int var73 = var48 * var51;
                                 int var74 = var73 * var54;
                                 int var23 = var74;
                                 byte var75 = (byte)(1865866090 ^ var232);
                                 int var24 = var75;
                                 var232 = 690149751 ^ var232;

                                 while (var24 < var23) {
                                    var232 = 1144776496 ^ var232;
                                    int var86 = readPacked(var225, var24, var21);
                                    if (var86 >= (36693293 ^ var232)) {
                                       var232 = 292124895 ^ var232;
                                       int var151 = var19.size();
                                       if (var86 >= var151) {
                                          var232 = 1523928209 ^ var232;

                                          label103:
                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var232)) {
                                                case 244198460:
                                                   var232 ^= 1960382564;
                                                   break label103;
                                                case 1207867980:
                                                default:
                                                   throw new IllegalStateException();
                                                case 1404127949:
                                                   break label103;
                                                case 1861079365:
                                             }
                                          }
                                       } else {
                                          var232 = qvsjhsjvcvggqiuk(var232, 296256510);
                                          Object var90 = var19.get(var86);
                                          BlockState var91 = (BlockState)var90;
                                          byte var93 = (byte)((d.isPlaceable(var91)) ? 1 : 0);
                                          if (var93 == (49159692 ^ var232)) {
                                             var232 = 89298643 ^ var232;

                                             label113:
                                             while (true) {
                                                switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var232)) {
                                                   case 101888364:
                                                      break label113;
                                                   case 121685997:
                                                      var232 ^= 989219288;
                                                      break label113;
                                                   case 1236762814:
                                                      break;
                                                   case 1453678324:
                                                   default:
                                                      throw new IllegalStateException();
                                                }
                                             }
                                          } else {
                                             label123:
                                             while (true) {
                                                switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var232)) {
                                                   case 46087877:
                                                      var232 ^= 1605446219;
                                                   case 184832372:
                                                      break label123;
                                                   case 622883473:
                                                   default:
                                                      throw new IllegalStateException();
                                                   case 816404221:
                                                }
                                             }

                                             int var154 = var15 * var17;
                                             int var95 = var24 / var154;
                                             int var156 = var95 * var15;
                                             int var157 = var156 * var17;
                                             int var97 = var24 - var157;
                                             int var99 = var97 / var15;
                                             int var160 = var99 * var15;
                                             int var101 = var97 - var160;
                                             BlockPos var205 = new BlockPos(var101, var95, var99);
                                             c$a var161 = new c$a(var205, var91);
                                             boolean var103 = var22.add(var161);
                                             var232 = 1612051776 ^ var232;
                                          }
                                       }
                                    } else {
                                       label134:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var232)) {
                                             case 34399477:
                                                var232 ^= 1063593002;
                                             case 343513501:
                                                break label134;
                                             case 776161373:
                                             default:
                                                throw new IllegalStateException();
                                             case 937447882:
                                          }
                                       }
                                    }

                                    var24 += 1028309254 ^ var232;
                                    var232 = 2069807898 ^ var232;
                                 }

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var232)) {
                                       case 130449932:
                                          var232 ^= 562521893;
                                       case 591577216:
                                          String var147 = torlirkdgs(xthcvlmiffmzves(), var232);
                                          CompoundTag var78 = var1.getCompoundOrEmpty(var147);
                                          String var148 = torlirkdgs(uidroqagopucdzn(), var232);
                                          String var79 = var78.getStringOr(var148, var11);
                                          if (var79 != null) {
                                             var232 = 2118783476 ^ var232;
                                             byte var82 = (byte)((var79.isBlank()) ? 1 : 0);
                                             if (var82 == (433681612 ^ var232)) {
                                                var232 = 1407648571 ^ var232;
                                                var131 = var79;
                                                var232 = 935756161 ^ var232;
                                                break label174;
                                             }

                                             var232 = 1603923933 ^ var232;
                                          } else {
                                             var232 = 567541289 ^ var232;
                                          }

                                          var131 = stripExt(var0);

                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var232)) {
                                                case 136145456:
                                                   var232 = 1001942375 ^ var232;
                                                case 1005130423:
                                                   break label174;
                                                case 1124865832:
                                                   break;
                                                case 1557629771:
                                                default:
                                                   throw new IllegalStateException();
                                             }
                                          }
                                       case 391765267:
                                          break;
                                       case 1529999038:
                                       default:
                                          throw new IllegalStateException();
                                    }
                                 }
                              }

                              var232 = 238843334 ^ var232;
                              CompoundTag var163 = var18.getCompoundOrEmpty(var20);
                              BlockState var164 = d.fromPaletteTag(var163);
                              boolean var105 = var19.add(var164);
                              var20 += 429009005 ^ var232;
                              var232 = qvsjhsjvcvggqiuk(var232, 238843334);
                           }
                        }

                        var232 = 825453250 ^ var232;
                        Object var108 = var14.next();
                        String var109 = (String)var108;
                        CompoundTag var111 = var10.getCompoundOrEmpty(var109);
                        String var166 = torlirkdgs(mbjzyfkpeztppxk(), var232);
                        CompoundTag var113 = var111.getCompoundOrEmpty(var166);
                        String var167 = torlirkdgs(cpvtrmimkvrgtqm(), var232);
                        String var206 = torlirkdgs(xiucvcwmsnwpeut(), var232);
                        byte var213 = (byte)(498135371 ^ var232);
                        int var195 = var113.getIntOr(var206, var213);
                        int var115 = var113.getIntOr(var167, var195);
                        int var116 = Math.abs(var115);
                        String var168 = torlirkdgs(nhdxeqsaugjisxn(), var232);
                        String var207 = torlirkdgs(vaybaivjnluossp(), var232);
                        byte var214 = (byte)(498135371 ^ var232);
                        int var197 = var113.getIntOr(var207, var214);
                        int var118 = var113.getIntOr(var168, var197);
                        int var119 = Math.abs(var118);
                        String var169 = torlirkdgs(ctysoczmvfxirio(), var232);
                        String var208 = torlirkdgs(qticsnxpvtskfan(), var232);
                        byte var215 = (byte)(498135371 ^ var232);
                        int var199 = var113.getIntOr(var208, var215);
                        int var121 = var113.getIntOr(var169, var199);
                        int var122 = Math.abs(var121);
                        int var124 = var116 * var119;
                        int var125 = var124 * var122;
                        if (var125 > var13) {
                           var232 = 920486699 ^ var232;
                           var13 = var125;
                           var11 = var109;
                           var12 = var111;
                           var232 = 1116974573 ^ var232;
                        } else {
                           var232 = 1951280838 ^ var232;
                        }

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var232)) {
                              case 224245983:
                                 var232 ^= 1165837316;
                                 continue label170;
                              case 379087560:
                              default:
                                 throw new IllegalStateException();
                              case 800033942:
                                 break;
                              case 1590966429:
                                 continue label170;
                           }
                        }
                     }
                  case 1706334020:
                  default:
                     throw new IllegalStateException();
                  case 1942208170:
               }
            }

            List var217 = c.compact(var22);
            return new c(var131, var15, var51, var17, var217);
         }

         String var193 = torlirkdgs(swjhvabmdejsoag(), var232);
         IOException var106 = new IOException(var193);
         throw new RuntimeException(var106);
      }
   }

   private static c loadSponge(String var0, CompoundTag var1) throws IOException {
      int var149 = 2015593993 ^ 449587334 ^ 1420744373;
      var149 = 666981911 ^ var149;
      String var3 = torlirkdgs(jiebvhjbfwxpmjz(), var149);
      String var5 = torlirkdgs(zwakopmjoaefjyx(), var149);
      byte var6 = (byte)(293613101 ^ var149);
      int var108 = var1.getIntOr(var5, var6);
      short var109 = (short)var108;
      short var24 = var1.getShortOr(var3, var109);
      int var81 = 293654994 ^ var149;
      int var25 = var24 & var81;
      int var10 = var25;
      String var82 = torlirkdgs(ipqtgipsdbqmnqk(), var149);
      String var133 = torlirkdgs(lfhfwcspphoqanp(), var149);
      byte var137 = (byte)(293613101 ^ var149);
      int var111 = var1.getIntOr(var133, var137);
      short var112 = (short)var111;
      short var27 = var1.getShortOr(var82, var112);
      int var83 = 293654994 ^ var149;
      int var28 = var27 & var83;
      String var84 = torlirkdgs(wooeisxbnqojdat(), var149);
      String var134 = torlirkdgs(wiqwcokmkfizzwd(), var149);
      byte var138 = (byte)(293613101 ^ var149);
      int var114 = var1.getIntOr(var134, var138);
      short var115 = (short)var114;
      short var30 = var1.getShortOr(var84, var115);
      int var85 = 293654994 ^ var149;
      int var31 = var30 & var85;
      int var12 = var31;
      if (var25 != (293613101 ^ var149)) {
         var149 = 1321108888 ^ var149;
         if (var28 != (1597942709 ^ var149)) {
            var149 = 1649618324 ^ var149;
            if (var31 != (1030587937 ^ var149)) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var149)) {
                     case 71795711:
                        break;
                     case 117706418:
                        var149 ^= 787218520;
                     case 686393970:
                        String var86 = torlirkdgs(trcvtewttqrqjre(), var149);
                        CompoundTag var36 = var1.getCompoundOrEmpty(var86);
                        CompoundTag var13 = var36;
                        HashMap var37 = new HashMap();
                        HashMap var14 = var37;
                        Set var39 = var36.keySet();
                        Iterator var40 = var39.iterator();
                        Iterator var15 = var40;
                        var149 = 159671752 ^ var149;

                        label59:
                        while (true) {
                           byte var42 = (byte)((var15.hasNext()) ? 1 : 0);
                           if (var42 == (436593585 ^ var149)) {
                              var149 = qvsjhsjvcvggqiuk(var149, 1224383100);
                              byte var44 = (byte)((var14.isEmpty()) ? 1 : 0);
                              if (var44 != (1392474573 ^ var149)) {
                                 var149 = 2084371237 ^ var149;
                                 String var128 = torlirkdgs(vtiwzefclstthkr(), var149);
                                 IOException var71 = new IOException(var128);
                                 throw new RuntimeException(var71);
                              }

                              var149 = qvsjhsjvcvggqiuk(var149, 1194263636);
                              String var87 = torlirkdgs(qywejfcnhvybhuj(), var149);
                              byte[] var46 = byteArray(var1, var87);
                              int var48 = var46.length;
                              if (var48 == (365985177 ^ var149)) {
                                 var149 = 948349706 ^ var149;
                                 String var116 = torlirkdgs(hpdhsupckxpaelf(), var149);
                                 IOException var49 = new IOException(var116);
                                 throw new RuntimeException(var49);
                              }

                              var149 = qvsjhsjvcvggqiuk(var149, 2045479796);
                              int var89 = var25 * var28;
                              int var90 = var89 * var31;
                              int[] var51 = decodeVarInts(var46, var90);
                              int[] var16 = var51;
                              ArrayList var52 = new ArrayList();
                              ArrayList var17 = var52;
                              byte var53 = (byte)(1815869165 ^ var149);
                              int var18 = var53;
                              var149 = 1272337161 ^ var149;

                              while (true) {
                                 int var92 = var16.length;
                                 if (var18 >= var92) {
                                    var149 = 640345350 ^ var149;
                                    String var127 = stripExt(var0);
                                    List var143 = c.compact(var17);
                                    return new c(var127, var10, var28, var12, var143);
                                 }

                                 var149 = 537795713 ^ var149;
                                 int var94 = var16[var18];
                                 Integer var95 = var94;
                                 Block var120 = Blocks.AIR;
                                 BlockState var121 = var120.defaultBlockState();
                                 Object var56 = var14.getOrDefault(var95, var121);
                                 BlockState var57 = (BlockState)var56;
                                 byte var59 = (byte)((d.isPlaceable(var57)) ? 1 : 0);
                                 if (var59 == (132364645 ^ var149)) {
                                    var149 = 1048823211 ^ var149;
                                    var149 = 732744954 ^ var149;
                                 } else {
                                    var149 = 1912579335 ^ var149;
                                    int var97 = var10 * var12;
                                    int var61 = var18 / var97;
                                    int var99 = var61 * var10;
                                    int var100 = var99 * var12;
                                    int var63 = var18 - var100;
                                    int var65 = var63 / var10;
                                    int var103 = var65 * var10;
                                    int var67 = var63 - var103;
                                    BlockPos var135 = new BlockPos(var67, var61, var65);
                                    c$a var104 = new c$a(var135, var57);
                                    boolean var69 = var17.add(var104);
                                    var149 = 1691397206 ^ var149;
                                 }

                                 var18 += 315404341 ^ var149;
                                 var149 = 891360720 ^ var149;
                              }
                           }

                           var149 = 1392526634 ^ var149;
                           Object var73 = var15.next();
                           String var74 = (String)var73;
                           byte var129 = (byte)(-1225107100 ^ var149);
                           int var76 = var13.getIntOr(var74, var129);
                           if (var76 < (1225107099 ^ var149)) {
                              var149 = 1352968688 ^ var149;
                              var149 = 61140186 ^ var149;
                           } else {
                              var149 = 907792160 ^ var149;
                              Integer var107 = var76;
                              BlockState var131 = d.parse(var74);
                              Object var79 = var14.put(var107, var131);

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var149)) {
                                    case 105550788:
                                       var149 ^= 1696303626;
                                       continue label59;
                                    case 120045754:
                                    default:
                                       throw new IllegalStateException();
                                    case 809596034:
                                       break;
                                    case 1057528928:
                                       continue label59;
                                 }
                              }
                           }
                        }
                     case 922607781:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }

            var149 = 124085968 ^ var149;
         } else {
            var149 = qvsjhsjvcvggqiuk(var149, 1698057028);
         }
      } else {
         var149 = qvsjhsjvcvggqiuk(var149, 730386140);
      }

      String var132 = torlirkdgs(ywhtwgyrggnzhpr(), var149);
      IOException var80 = new IOException(var132);
      throw new RuntimeException(var80);
   }

   private static c loadLegacy(String var0, CompoundTag var1) throws IOException {
      int var168;
      label172: {
         int var167 = 373713886 ^ 371911016 ^ 1420744373;
         var168 = 289021759 ^ var167;
         String var3 = torlirkdgs(nzofhhthtrihcym(), var168);
         byte var4 = (byte)(1173900092 ^ var168);
         short var25 = var1.getShortOr(var3, var4);
         int var97 = 1173927107 ^ var168;
         int var26 = var25 & var97;
         int var10 = var26;
         String var98 = torlirkdgs(btmvsvdfxgvvlbb(), var168);
         byte var141 = (byte)(1173900092 ^ var168);
         short var28 = var1.getShortOr(var98, var141);
         int var99 = 1173927107 ^ var168;
         int var29 = var28 & var99;
         String var100 = torlirkdgs(jklonqocnpydkzb(), var168);
         byte var142 = (byte)(1173900092 ^ var168);
         short var31 = var1.getShortOr(var100, var142);
         int var101 = 1173927107 ^ var168;
         int var32 = var31 & var101;
         int var12 = var32;
         ArrayList var16;
         if (var26 != (1173900092 ^ var168)) {
            var168 = 914545099 ^ var168;
            if (var29 == (1937412855 ^ var168)) {
               var168 = 1515121336 ^ var168;
               break label172;
            }

            var168 = 1503096823 ^ var168;
            if (var32 == (720239872 ^ var168)) {
               var168 = 64587087 ^ var168;
               break label172;
            }

            label130:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var168)) {
                  case 53293277:
                     var168 ^= 20749279;
                  case 329418043:
                     break label130;
                  case 1302628013:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1915492110:
               }
            }

            String var102 = torlirkdgs(czkqlvmbkzoffme(), var168);
            byte[] var37 = byteArray(var1, var102);
            byte[] var13 = var37;
            String var103 = torlirkdgs(jbhkbfxeqjlsmac(), var168);
            byte[] var39 = byteArray(var1, var103);
            byte[] var14 = var39;
            int var41 = var39.length;
            int var105 = var37.length;
            if (var41 < var105) {
               var168 = 665749269 ^ var168;
               int var43 = var37.length;
               byte[] var44 = new byte[var43];
               var14 = var44;
               var168 = 1845803361 ^ var168;
            } else {
               label122:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var168)) {
                     case 82156673:
                        var168 ^= 1235893876;
                     case 295834870:
                        break label122;
                     case 772276755:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1716632835:
                  }
               }
            }

            int var46 = var37.length;
            int var107 = var26 * var29;
            int var108 = var107 * var32;
            if (var46 < var108) {
               var168 = 1665062410 ^ var168;
               String var145 = torlirkdgs(hdxcavyqsnvkfvt(), var168);
               IOException var47 = new IOException(var145);
               throw new RuntimeException(var47);
            }

            var168 = qvsjhsjvcvggqiuk(var168, 1761802020);
            String var109 = torlirkdgs(wfjbexhcbaxqxwf(), var168);
            byte var49 = (byte)((var1.contains(var109)) ? 1 : 0);
            byte[] var51;
            if (var49 != (192524175 ^ var168)) {
               var168 = 1252541536 ^ var168;
               String var110 = torlirkdgs(mqhycfmqliruowb(), var168);
               var51 = byteArray(var1, var110);
               var168 = qvsjhsjvcvggqiuk(var168, 1218980407);
            } else {
               var168 = qvsjhsjvcvggqiuk(var168, 1279896549);
               byte var94 = (byte)(1194329194 ^ var168);
               var51 = new byte[var94];
               var168 = 1313457586 ^ var168;
            }

            byte[] var15 = var51;
            ArrayList var52 = new ArrayList();
            var16 = var52;
            int var54 = var26 * var29;
            int var55 = var54 * var32;
            int var17 = var55;
            byte var56 = (byte)(158974424 ^ var168);
            int var18 = var56;
            var168 = 1931683862 ^ var168;

            label115:
            while (var18 < var17) {
               var168 = 1888884025 ^ var168;
               byte var63 = var13[var18];
               short var115 = (short)(181206024 ^ var168);
               int var64 = var63 & var115;
               int var19 = var64;
               int var66 = var15.length;
               if (var66 > (181206263 ^ var168)) {
                  var168 = 183661919 ^ var168;
                  byte var116 = (byte)(4098473 ^ var168);
                  int var68 = var18 >> var116;
                  int var118 = var15.length;
                  if (var68 >= var118) {
                     var168 = 2063582612 ^ var168;
                  } else {
                     var168 = 354606892 ^ var168;
                     byte var119 = (byte)(354178693 ^ var168);
                     int var71 = var18 & var119;
                     int var96;
                     if (var71 == (354178692 ^ var168)) {
                        var168 = 1089423724 ^ var168;
                        byte var92 = var15[var68];
                        byte var138 = (byte)(1441996780 ^ var168);
                        int var93 = var92 >> var138;
                        byte var139 = (byte)(1441996775 ^ var168);
                        var96 = var93 & var139;

                        label95:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var168)) {
                              case 109533218:
                                 var168 ^= 1996878974;
                                 break label95;
                              case 969592125:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1094387098:
                                 break label95;
                              case 1726369828:
                           }
                        }
                     } else {
                        var168 = 95549990 ^ var168;
                        byte var73 = var15[var68];
                        byte var121 = (byte)(279817389 ^ var168);
                        var96 = var73 & var121;
                        var168 = 844842804 ^ var168;
                     }

                     byte var149 = (byte)(586607518 ^ var168);
                     int var123 = var96 << var149;
                     int var75 = var64 | var123;
                     var19 = var75;
                     var168 = 1480042410 ^ var168;
                  }
               } else {
                  var168 = qvsjhsjvcvggqiuk(var168, 1879945419);
               }

               if (var19 == (2059488316 ^ var168)) {
                  var168 = 1122009113 ^ var168;
                  var168 = qvsjhsjvcvggqiuk(var168, 1624650106);
               } else {
                  var168 = qvsjhsjvcvggqiuk(var168, 1615180058);
                  int var125 = var14.length;
                  int var140;
                  if (var125 > var18) {
                     var168 = 176163306 ^ var168;
                     byte var127 = var14[var18];
                     short var152 = (short)(268760115 ^ var168);
                     var140 = var127 & var152;
                     var168 = 1458749162 ^ var168;
                  } else {
                     var168 = qvsjhsjvcvggqiuk(var168, 38152953);
                     var140 = (byte)(415422431 ^ var168);
                     var168 = 1580506617 ^ var168;
                  }

                  BlockState var78 = a.state(var19, var140);
                  byte var80 = (byte)((d.isPlaceable(var78)) ? 1 : 0);
                  if (var80 == (1190545958 ^ var168)) {
                     var168 = 668217046 ^ var168;
                     var168 = 970299823 ^ var168;
                  } else {
                     var168 = qvsjhsjvcvggqiuk(var168, 1599907415);
                     int var129 = var10 * var12;
                     int var82 = var18 / var129;
                     int var131 = var82 * var10;
                     int var132 = var131 * var12;
                     int var84 = var18 - var132;
                     int var86 = var84 / var10;
                     int var135 = var86 * var10;
                     int var88 = var84 - var135;
                     BlockPos var158 = new BlockPos(var88, var82, var86);
                     c$a var136 = new c$a(var158, var78);
                     boolean var90 = var16.add(var136);
                     var168 = 1096618286 ^ var168;
                  }
               }

               var18 += 1492647262 ^ var168;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var168)) {
                     case 207626783:
                        var168 ^= 581768337;
                        continue label115;
                     case 722006310:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1017305906:
                        continue label115;
                     case 1766216804:
                  }
               }
            }

            label85:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var168)) {
                  case 219176613:
                     var168 ^= 634457759;
                     break label85;
                  case 318062887:
                  default:
                     throw new RuntimeException(new IOException());
                  case 925208478:
                     break;
                  case 1303795987:
                     break label85;
               }
            }

            byte var59 = (byte)((var16.isEmpty()) ? 1 : 0);
            if (var59 != (1603004241 ^ var168)) {
               var168 = 1620452095 ^ var168;
               String var148 = torlirkdgs(dpuvehbfgmjsytx(), var168);
               IOException var61 = new IOException(var148);
               throw new RuntimeException(var61);
            }

            label78:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var168)) {
                  case 153046951:
                     var168 = 962661823 ^ var168;
                     break label78;
                  case 465853194:
                     break;
                  case 1059893512:
                  default:
                     throw new RuntimeException(new IOException());
                  case 2105395528:
                     break label78;
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var168)) {
                  case 62946633:
                  default:
                     throw new RuntimeException(new IOException());
                  case 126964796:
                     var168 ^= 1825321843;
                     break label172;
                  case 314454196:
                     break;
                  case 1401259635:
                     break label172;
               }
            }
         }

         String var147 = stripExt(var0);
         List var161 = c.compact(var16);
         return new c(var147, var10, var29, var12, var161);
      }

      String var157 = torlirkdgs(udfgezijmsucbqz(), var168);
      IOException var95 = new IOException(var157);
      throw new RuntimeException(var95);
   }

   private static int readPacked(long[] var0, int var1, int var2) {
      int var118 = 1057800597 ^ 1785901991 ^ 1420744373;
      var118 = 952215967 ^ var118;
      int var16 = var0.length;
      if (var16 != (957418776 ^ var118)) {
         var118 = 2087629918 ^ var118;
         if (var2 > (1165998406 ^ var118)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                  case 111621000:
                     var118 ^= 881474308;
                  case 877613715:
                     long var19 = var1;
                     long var89 = var2;
                     long var21 = var19 * var89;
                     byte var91 = (byte)(1911915076 ^ var118);
                     long var25 = var21 >>> var91;
                     int var27 = (int)var25;
                     long var92 = 63L;
                     long var30 = var21 & var92;
                     int var32 = (int)var30;
                     long var95 = var2;
                     long var35 = var21 + var95;
                     long var97 = 1L;
                     long var37 = var35 - var97;
                     byte var99 = (byte)(1911915076 ^ var118);
                     long var39 = var37 >>> var99;
                     int var41 = (int)var39;
                     long var42 = 1L;
                     long var44 = var42 << var2;
                     long var101 = 1L;
                     long var46 = var44 - var101;
                     int var81 = var0.length;
                     if (var27 >= var81) {
                        var118 = 980324741 ^ var118;
                        return (byte)(1268454343 ^ var118);
                     }

                     var118 = qvsjhsjvcvggqiuk(var118, 135334298);
                     if (var27 == var41) {
                        var118 = 659093355 ^ var118;
                        long var52 = var0[var27];
                        long var54 = var52 >>> var32;
                        long var56 = var54 & var46;
                        return (int)var56;
                     }

                     var118 = qvsjhsjvcvggqiuk(var118, 181037916);
                     int var85 = var0.length;
                     if (var41 >= var85) {
                        var118 = 842236128 ^ var118;
                        long var61 = var0[var27];
                        long var63 = var61 >>> var32;
                        long var65 = var63 & var46;
                        return (int)var65;
                     }

                     var118 = qvsjhsjvcvggqiuk(var118, 1370577703);
                     byte var68 = (byte)(580893667 ^ var118);
                     int var69 = var68 - var32;
                     long var71 = var0[var27];
                     long var73 = var71 >>> var32;
                     long var111 = var0[var41];
                     long var113 = var111 << var69;
                     long var75 = var73 | var113;
                     long var77 = var75 & var46;
                     return (int)var77;
                  case 1354762417:
                     break;
                  case 1943304138:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }

         var118 = 43701690 ^ var118;
      } else {
         var118 = 2129945060 ^ var118;
      }

      return (byte)(1206217980 ^ var118);
   }

   private static int[] decodeVarInts(byte[] var0, int var1) throws IOException {
      int var48 = 268077660 ^ 564261789 ^ 1420744373;
      var48 = 977034383 ^ var48;
      int[] var11 = new int[var1];
      int[] var5 = var11;
      byte var12 = (byte)(1086977019 ^ var48);
      int var6 = var12;
      byte var13 = (byte)(1086977019 ^ var48);
      int var7 = var13;
      byte var14 = (byte)(1086977019 ^ var48);
      int var8 = var14;
      byte var15 = (byte)(1086977019 ^ var48);
      int var9 = var15;
      var48 = 96044545 ^ var48;

      label51:
      while (true) {
         int var32 = var0.length;
         if (var6 < var32) {
            var48 = 734030278 ^ var48;
            if (var9 < var1) {
               var48 = 1512104636 ^ var48;
               int var34 = var6;
               var6 += 881917569 ^ var48;
               byte var19 = var0[var34];
               byte var4 = (byte)(881917695 ^ var48);
               int var36 = var19 & var4;
               int var37 = var36 << var8;
               int var21 = var7 | var37;
               var7 = var21;
               short var38 = (short)(881917440 ^ var48);
               int var23 = var19 & var38;
               if (var23 == (881917568 ^ var48)) {
                  var48 = 2071245294 ^ var48;
                  int var40 = var9;
                  var9 += 1340362607 ^ var48;
                  var5[var40] = var21;
                  byte var27 = (byte)(1340362606 ^ var48);
                  var7 = var27;
                  byte var28 = (byte)(1340362606 ^ var48);
                  var8 = var28;
                  var48 = 2083722436 ^ var48;
               } else {
                  var48 = 493013784 ^ var48;
                  var8 += 703739295 ^ var48;
                  byte var39 = (byte)(703739323 ^ var48);
                  if (var8 > var39) {
                     var48 = 1009427471 ^ var48;
                     String var43 = torlirkdgs(cufhdtgvcvicyyn(), var48);
                     IOException var25 = new IOException(var43);
                     throw new RuntimeException(var25);
                  }

                  label41:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var48)) {
                        case 21327396:
                           var48 ^= 438660658;
                        case 532151998:
                           break label41;
                        case 544851661:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1977844830:
                     }
                  }
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var48)) {
                     case 3127333:
                        continue label51;
                     case 74543694:
                        var48 ^= 1990667856;
                        continue label51;
                     case 181688771:
                     default:
                        throw new RuntimeException(new IOException());
                     case 231905197:
                  }
               }
            }

            var48 = qvsjhsjvcvggqiuk(var48, 2116427893);
         } else {
            var48 = 1441155507 ^ var48;
         }

         if (var9 < var1) {
            var48 = 2115829453 ^ var48;
            String var45 = torlirkdgs(epsgkjsbycacwhy(), var48);
            IOException var30 = new IOException(var45);
            throw new RuntimeException(var30);
         }

         var48 = qvsjhsjvcvggqiuk(var48, 686029487);
         return var5;
      }
   }

   private static String stripExt(String var0) {
      int var12 = 1716479671 ^ 1737338988 ^ 1420744373;
      var12 = 1085257973 ^ var12;
      byte var2 = (byte)(365148341 ^ var12);
      int var5 = var0.lastIndexOf(var2);
      String var8;
      if (var5 > (365148315 ^ var12)) {
         var12 = 2109825904 ^ var12;
         byte var9 = (byte)(1745017835 ^ var12);
         var8 = var0.substring(var9, var5);
         var12 = qvsjhsjvcvggqiuk(var12, 1224903102);
      } else {
         var12 = 2021167865 ^ var12;
         var8 = var0;
         var12 = 1287354423 ^ var12;
      }

      return var8;
   }

   private static byte[] byteArray(CompoundTag var0, String var1) {
      int var11 = 655115961 ^ 52133798 ^ 1420744373;
      var11 = 1140536944 ^ var11;
      Optional var4 = var0.getByteArray(var1);
      byte var7 = (byte)(860019162 ^ var11);
      byte[] var8 = new byte[var7];
      Object var5 = var4.orElse(var8);
      return (byte[])var5;
   }

   private static long[] longArray(CompoundTag var0, String var1) {
      int var11 = 34497719 ^ 1280141391 ^ 1420744373;
      var11 = 1340585405 ^ var11;
      Optional var4 = var0.getLongArray(var1);
      byte var7 = (byte)(1426747376 ^ var11);
      long[] var8 = new long[var7];
      Object var5 = var4.orElse(var8);
      return (long[])var5;
   }

   private static CompoundTag readRoot(Path var0) throws IOException {
      int var91 = 701580207 ^ (649925772 ^ 1420744373);
      var91 = 1998816479 ^ var91;
      byte[] var5 = Files.readAllBytes(var0);
      int var12 = var5.length;
      byte var2 = (byte)(752944459 ^ var91);
      if (var12 < var2) {
         var91 = 466473042 ^ var91;
         String var3 = torlirkdgs(jrmhfdmlfsbozto(), var91);
         throw new RuntimeException(new IOException(var3));
      } else {
         var91 = qvsjhsjvcvggqiuk(var91, 828305754);
         boolean var16 = isGzip(var5);
         if (var16 != ((499119123 ^ var91) != 0)) {
            var91 = 316952718 ^ var91;
            ByteArrayInputStream var17 = new ByteArrayInputStream(var5);
            CompoundTag var18 = NbtIo.readCompressed(var17, NbtAccounter.unlimitedHeap());
            return var18;
         } else {
            var91 = 1525045600 ^ var91;
            boolean var30 = isZlib(var5);
            if (var30 != ((1197059443 ^ var91) != 0)) {
               var91 = 1284573350 ^ var91;
               InflaterInputStream var31 = new InflaterInputStream(new ByteArrayInputStream(var5));
               CompoundTag var33 = readUncompressed(var31);
               var91 = 83104713 ^ var91;
               var31.close();
               var91 = 1410520183 ^ var91;
               return var33;
            } else {
               var91 = 732638319 ^ var91;
               ByteArrayInputStream var38 = new ByteArrayInputStream(var5);
               CompoundTag var39 = readUncompressed(var38);
               var91 = 792440516 ^ var91;
               return var39;
            }
         }
      }
   }

   private static CompoundTag readUncompressed(InputStream var0) throws IOException {
      int var21 = 2086428261 ^ 1306760414 ^ 1420744373;
      var21 = 1232808115 ^ var21;
      BufferedInputStream var2 = new BufferedInputStream(var0);
      DataInputStream var1 = new DataInputStream(var2);
      DataInputStream var4 = var1;
      var21 = 559611538 ^ var21;

      CompoundTag var5;
      try {
         NbtAccounter var16 = NbtAccounter.unlimitedHeap();
         CompoundTag var8 = NbtIo.read(var4, var16);
         var5 = var8;
         var21 ^= 1034486747;
      } catch (Throwable var23) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var21)) {
            case 1770410360:
               var21 = 1495228216 ^ var21;
               var21 = 1264469959 ^ var21;

               try {
                  var4.close();
                  var21 ^= 90506193;
               } catch (Throwable var22) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var21)) {
                     case -74541440:
                        var21 = qvsjhsjvcvggqiuk(var21, 2023191241);
                        var23.addSuppressed(var22);
                        var21 = 869479289 ^ var21;
                        throw new RuntimeException(var23);
                     default:
                        throw new RuntimeException(new IllegalAccessException("Error in hash"));
                  }
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var21)) {
                     case 42487525:
                        var21 = 1310802529 ^ var21;
                        throw new RuntimeException(var23);
                     case 1000014557:
                        throw new RuntimeException(var23);
                     case 1282966842:
                        break;
                     case 1321805922:
                     default:
                        throw new RuntimeException();
                  }
               }
            default:
               throw new RuntimeException(new IllegalAccessException("Error in hash"));
         }
      }

      var1.close();
      return var5;
   }

   private static boolean isGzip(byte[] var0) {
      int var16 = 324551797 ^ 956076951 ^ 1420744373;
      var16 = 130948602 ^ var16;
      byte var2 = (byte)(2026118317 ^ var16);
      byte var3 = var0[var2];
      short var9 = (short)(2026118226 ^ var16);
      int var4 = var3 & var9;
      byte var10 = (byte)(2026118322 ^ var16);
      if (var4 == var10) {
         var16 ^= 805115379;
         byte var11 = (byte)(1463355743 ^ var16);
         byte var6 = var0[var11];
         short var12 = (short)(1463355809 ^ var16);
         int var7 = var6 & var12;
         short var13 = (short)(1463355861 ^ var16);
         if (var7 == var13) {
            var16 = 590765398 ^ var16;
            byte var8 = (byte)(1947161609 ^ var16);
            var16 = qvsjhsjvcvggqiuk(var16, 108341179);
            return (var8 != 0);
         }

         label28:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
               case 150918431:
                  var16 ^= 1608934324;
                  break label28;
               case 180962903:
                  break;
               case 1478981109:
               default:
                  throw new RuntimeException();
               case 1657101022:
                  break label28;
            }
         }
      } else {
         label22:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
               case 167481163:
                  var16 ^= 1880847943;
                  break label22;
               case 809347996:
                  break;
               case 879888801:
               default:
                  throw new RuntimeException();
               case 1703036812:
                  break label22;
            }
         }
      }

      byte var21 = (byte)(148859626 ^ var16);
      var16 = 2057640281 ^ var16;
      return (var21 != 0);
   }

   private static boolean isZlib(byte[] var0) {
      int var28;
      label60: {
         var28 = 664849363 ^ 1129662826 ^ 1420744373;
         var28 = 1289634766 ^ var28;
         byte var2 = (byte)(2089097154 ^ var28);
         byte var5 = var0[var2];
         short var16 = (short)(2089097021 ^ var28);
         int var6 = var5 & var16;
         byte var17 = (byte)(2089097155 ^ var28);
         byte var8 = var0[var17];
         short var18 = (short)(2089097021 ^ var28);
         int var9 = var8 & var18;
         byte var19 = (byte)(2089097146 ^ var28);
         if (var6 == var19) {
            var28 = 220573787 ^ var28;
            byte var20 = (byte)(1906354072 ^ var28);
            if (var9 == var20) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                     case 89724804:
                     default:
                        throw new RuntimeException(new IOException());
                     case 203896088:
                        var28 ^= 1909562357;
                        break label60;
                     case 404913431:
                        break;
                     case 1602027211:
                        break label60;
                  }
               }
            }

            var28 = 153524654 ^ var28;
            byte var21 = (byte)(2022063721 ^ var28);
            if (var9 == var21) {
               var28 = 2029453915 ^ var28;
               break label60;
            }

            var28 = 1911333409 ^ var28;
            short var22 = (short)(157981834 ^ var28);
            if (var9 == var22) {
               var28 = qvsjhsjvcvggqiuk(var28, 152805498);
               break label60;
            }

            var28 = 889350461 ^ var28;
            short var23 = (short)(1013511665 ^ var28);
            if (var9 == var23) {
               var28 = 1008322887 ^ var28;
               break label60;
            }

            var28 = qvsjhsjvcvggqiuk(var28, 1308206689);
         } else {
            label35:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                  case 21078658:
                     var28 ^= 219432072;
                     break label35;
                  case 187396326:
                  default:
                     throw new RuntimeException(new IOException());
                  case 190279899:
                     break label35;
                  case 842171184:
               }
            }
         }

         byte var34 = (byte)(1905349450 ^ var28);
         var28 = 1509353924 ^ var28;
         return (var34 != 0);
      }

      byte var15 = (byte)(7421037 ^ var28);
      var28 = 672564962 ^ var28;
      return (var15 != 0);
   }

   static {
      int var3 = new Random(5180977912899329749L).nextInt();
      auYKtrKpEb = -1933352692 ^ var3;
   }

   public static String torlirkdgs(byte[] var0, int var1) {
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
      String var29 = ljindsomxk;
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

   private static byte[] fobjhcvunnnzwre() {
      return new byte[]{0, 0, 0, 14, 0, 0, 0, 0};
   }

   private static byte[] bngcixuceaejijt() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, 14};
   }

   private static byte[] eyyxevetprjsdjw() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, 21};
   }

   private static byte[] upedixpgubmotka() {
      return new byte[]{0, 0, 0, 10, 0, 0, 0, 28};
   }

   private static byte[] verfhvhtkyxqycy() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, 38};
   }

   private static byte[] udrjbkqixebyxio() {
      return new byte[]{0, 0, 0, 19, 0, 0, 0, 44};
   }

   private static byte[] brccqhrfghbkvkq() {
      return new byte[]{0, 0, 0, 10, 0, 0, 0, 63};
   }

   private static byte[] dmvwjuqnlotutxw() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, 73};
   }

   private static byte[] zgialfuuofnzahz() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, 79};
   }

   private static byte[] anmukstaigwddpx() {
      return new byte[]{0, 0, 0, 9, 0, 0, 0, 86};
   }

   private static byte[] mgjqlfhvatdnstu() {
      return new byte[]{0, 0, 0, 9, 0, 0, 0, 95};
   }

   private static byte[] sewugfelxnqmlet() {
      return new byte[]{0, 0, 0, 30, 0, 0, 0, 104};
   }

   private static byte[] ufjcnxvikjhcmuy() {
      return new byte[]{0, 0, 0, 17, 0, 0, 0, -122};
   }

   private static byte[] bcbkhdmkoitwbuf() {
      return new byte[]{0, 0, 0, 11, 0, 0, 0, -105};
   }

   private static byte[] xthcvlmiffmzves() {
      return new byte[]{0, 0, 0, 8, 0, 0, 0, -94};
   }

   private static byte[] uidroqagopucdzn() {
      return new byte[]{0, 0, 0, 4, 0, 0, 0, -86};
   }

   private static byte[] eupjxnllbakqotf() {
      return new byte[]{0, 0, 0, 4, 0, 0, 0, -82};
   }

   private static byte[] yyeupvbsvcjjxzw() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, -78};
   }

   private static byte[] xtnbamtznjwgxvo() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, -77};
   }

   private static byte[] sndwlbreqbchdie() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, -76};
   }

   private static byte[] ghrziglxflzzupb() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, -75};
   }

   private static byte[] ankaqbepllmnqrs() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, -74};
   }

   private static byte[] ymushuinhnzebyj() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, -73};
   }

   private static byte[] bujuqasmmaubwzi() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, -72};
   }

   private static byte[] mbjzyfkpeztppxk() {
      return new byte[]{0, 0, 0, 4, 0, 0, 0, -65};
   }

   private static byte[] cpvtrmimkvrgtqm() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, -61};
   }

   private static byte[] xiucvcwmsnwpeut() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, -60};
   }

   private static byte[] nhdxeqsaugjisxn() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, -59};
   }

   private static byte[] vaybaivjnluossp() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, -58};
   }

   private static byte[] ctysoczmvfxirio() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, -57};
   }

   private static byte[] qticsnxpvtskfan() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, -56};
   }

   private static byte[] swjhvabmdejsoag() {
      return new byte[]{0, 0, 0, 30, 0, 0, 0, -55};
   }

   private static byte[] kxsngzxphahmkii() {
      return new byte[]{0, 0, 0, 27, 0, 0, 0, -25};
   }

   private static byte[] hpdhsupckxpaelf() {
      return new byte[]{0, 0, 0, 34, 0, 0, 1, 2};
   }

   private static byte[] ywhtwgyrggnzhpr() {
      return new byte[]{0, 0, 0, 29, 0, 0, 1, 36};
   }

   private static byte[] trcvtewttqrqjre() {
      return new byte[]{0, 0, 0, 7, 0, 0, 1, 65};
   }

   private static byte[] jiebvhjbfwxpmjz() {
      return new byte[]{0, 0, 0, 5, 0, 0, 1, 72};
   }

   private static byte[] zwakopmjoaefjyx() {
      return new byte[]{0, 0, 0, 5, 0, 0, 1, 77};
   }

   private static byte[] ipqtgipsdbqmnqk() {
      return new byte[]{0, 0, 0, 6, 0, 0, 1, 82};
   }

   private static byte[] lfhfwcspphoqanp() {
      return new byte[]{0, 0, 0, 6, 0, 0, 1, 88};
   }

   private static byte[] wooeisxbnqojdat() {
      return new byte[]{0, 0, 0, 6, 0, 0, 1, 94};
   }

   private static byte[] wiqwcokmkfizzwd() {
      return new byte[]{0, 0, 0, 6, 0, 0, 1, 100};
   }

   private static byte[] vtiwzefclstthkr() {
      return new byte[]{0, 0, 0, 34, 0, 0, 1, 106};
   }

   private static byte[] qywejfcnhvybhuj() {
      return new byte[]{0, 0, 0, 9, 0, 0, 1, -116};
   }

   private static byte[] udfgezijmsucbqz() {
      return new byte[]{0, 0, 0, 29, 0, 0, 1, -107};
   }

   private static byte[] czkqlvmbkzoffme() {
      return new byte[]{0, 0, 0, 6, 0, 0, 1, -78};
   }

   private static byte[] jbhkbfxeqjlsmac() {
      return new byte[]{0, 0, 0, 4, 0, 0, 1, -72};
   }

   private static byte[] dpuvehbfgmjsytx() {
      return new byte[]{0, 0, 0, 66, 0, 0, 1, -68};
   }

   private static byte[] nzofhhthtrihcym() {
      return new byte[]{0, 0, 0, 5, 0, 0, 1, -2};
   }

   private static byte[] btmvsvdfxgvvlbb() {
      return new byte[]{0, 0, 0, 6, 0, 0, 2, 3};
   }

   private static byte[] jklonqocnpydkzb() {
      return new byte[]{0, 0, 0, 6, 0, 0, 2, 9};
   }

   private static byte[] mqhycfmqliruowb() {
      return new byte[]{0, 0, 0, 9, 0, 0, 2, 15};
   }

   private static byte[] wfjbexhcbaxqxwf() {
      return new byte[]{0, 0, 0, 9, 0, 0, 2, 24};
   }

   private static byte[] hdxcavyqsnvkfvt() {
      return new byte[]{0, 0, 0, 39, 0, 0, 2, 33};
   }

   private static byte[] cufhdtgvcvicyyn() {
      return new byte[]{0, 0, 0, 24, 0, 0, 2, 72};
   }

   private static byte[] epsgkjsbycacwhy() {
      return new byte[]{0, 0, 0, 39, 0, 0, 2, 96};
   }

   private static byte[] jrmhfdmlfsbozto() {
      return new byte[]{0, 0, 0, 14, 0, 0, 2, -121};
   }

   private static byte[] tklpazujirwdzxz() {
      return new byte[]{0, 0, 0, 0, 0, 0, 2, -107};
   }

   private static byte[] nyityqbfexeqhce() {
      return new byte[]{
         49,
         115,
         49,
         81,
         48,
         84,
         51,
         86,
         50,
         17,
         49,
         91,
         49,
         87,
         48,
         76,
         51,
         19,
         50,
         87,
         49,
         90,
         49,
         77,
         48,
         86,
         51,
         87,
         54,
         97,
         53,
         82,
         50,
         87,
         50,
         88,
         51,
         89,
         51,
         91,
         55,
         65,
         49,
         104,
         49,
         83,
         52,
         94,
         51,
         81,
         52,
         70,
         49,
         76,
         49,
         87,
         49,
         22,
         51,
         70,
         49,
         86,
         49,
         88,
         57,
         81,
         49,
         85,
         51,
         84,
         49,
         65,
         49,
         89,
         57,
         87,
         49,
         115,
         50,
         84,
         51,
         90,
         57,
         90,
         49,
         94,
         49,
         66,
         49,
         112,
         55,
         89,
         55,
         67,
         56,
         67,
         52,
         77,
         49,
         21,
         55,
         71,
         55,
         80,
         56,
         95,
         52,
         81,
         49,
         88,
         55,
         85,
         55,
         71,
         56,
         94,
         52,
         87,
         49,
         21,
         55,
         122,
         55,
         113,
         56,
         99,
         49,
         27,
         57,
         84,
         50,
         93,
         49,
         68,
         57,
         83,
         49,
         88,
         57,
         89,
         50,
         64,
         49,
         89,
         57,
         85,
         55,
         29,
         49,
         69,
         49,
         91,
         55,
         90,
         49,
         82,
         51,
         92,
         54,
         103,
         55,
         82,
         50,
         82,
         49,
         95,
         53,
         89,
         53,
         89,
         55,
         65,
         57,
         122,
         56,
         93,
         52,
         88,
         52,
         87,
         52,
         82,
         56,
         124,
         49,
         85,
         55,
         64,
         52,
         85,
         49,
         118,
         54,
         88,
         52,
         86,
         54,
         84,
         57,
         82,
         49,
         112,
         54,
         85,
         52,
         77,
         54,
         86,
         49,
         127,
         50,
         80,
         55,
         70,
         51,
         93,
         57,
         89,
         49,
         82,
         50,
         77,
         55,
         91,
         51,
         91,
         57,
         85,
         49,
         19,
         50,
         95,
         55,
         91,
         51,
         84,
         57,
         81,
         49,
         19,
         50,
         81,
         55,
         83,
         51,
         75,
         57,
         20,
         49,
         93,
         50,
         86,
         55,
         18,
         51,
         106,
         57,
         81,
         49,
         84,
         50,
         80,
         55,
         93,
         51,
         86,
         57,
         71,
         51,
         122,
         53,
         85,
         54,
         89,
         52,
         82,
         51,
         83,
         53,
         106,
         54,
         66,
         52,
         80,
         51,
         76,
         53,
         92,
         54,
         102,
         52,
         80,
         51,
         84,
         53,
         92,
         54,
         66,
         52,
         69,
         51,
         93,
         49,
         122,
         54,
         89,
         56,
         89,
         54,
         83,
         57,
         91,
         49,
         107,
         54,
         65,
         56,
         87,
         54,
         68,
         57,
         85,
         49,
         75,
         49,
         122,
         51,
         82,
         55,
         69,
         50,
         88,
         53,
         86,
         49,
         86,
         51,
         67,
         55,
         80,
         49,
         121,
         51,
         86,
         55,
         92,
         50,
         92,
         49,
         103,
         51,
         94,
         57,
         77,
         54,
         82,
         49,
         76,
         49,
         108,
         49,
         77,
         49,
         109,
         49,
         78,
         49,
         110,
         49,
         96,
         52,
         93,
         56,
         86,
         56,
         90,
         52,
         95,
         49,
         92,
         52,
         75,
         52,
         106,
         56,
         88,
         51,
         79,
         51,
         82,
         52,
         65,
         52,
         97,
         52,
         64,
         52,
         96,
         52,
         67,
         52,
         99,
         50,
         120,
         50,
         90,
         54,
         64,
         57,
         89,
         48,
         88,
         50,
         88,
         50,
         80,
         54,
         22,
         57,
         116,
         48,
         93,
         50,
         69,
         50,
         81,
         54,
         91,
         57,
         89,
         48,
         64,
         50,
         88,
         50,
         87,
         54,
         87,
         57,
         24,
         48,
         70,
         50,
         84,
         50,
         83,
         54,
         95,
         57,
         87,
         48,
         90,
         50,
         17,
         50,
         71,
         54,
         95,
         57,
         66,
         48,
         81,
         49,
         122,
         50,
         90,
         50,
         17,
         57,
         69,
         54,
         74,
         49,
         85,
         50,
         87,
         50,
         93,
         57,
         85,
         54,
         25,
         49,
         120,
         50,
         92,
         50,
         69,
         57,
         85,
         54,
         84,
         49,
         85,
         50,
         65,
         50,
         88,
         57,
         83,
         54,
         88,
         49,
         20,
         50,
         71,
         50,
         84,
         57,
         87,
         54,
         80,
         49,
         91,
         50,
         91,
         55,
         101,
         48,
         70,
         54,
         90,
         55,
         90,
         55,
         80,
         54,
         85,
         54,
         22,
         53,
         68,
         52,
         84,
         55,
         94,
         48,
         83,
         54,
         88,
         55,
         85,
         55,
         67,
         54,
         89,
         54,
         85,
         53,
         23,
         52,
         90,
         55,
         95,
         48,
         69,
         54,
         70,
         55,
         93,
         55,
         89,
         54,
         87,
         54,
         22,
         53,
         117,
         52,
         91,
         55,
         89,
         48,
         85,
         54,
         94,
         55,
         112,
         55,
         86,
         54,
         68,
         54,
         87,
         57,
         126,
         51,
         88,
         54,
         70,
         52,
         81,
         49,
         85,
         55,
         90,
         54,
         82,
         48,
         20,
         48,
         98,
         57,
         71,
         51,
         89,
         54,
         94,
         52,
         87,
         49,
         92,
         55,
         19,
         54,
         69,
         48,
         87,
         48,
         89,
         57,
         82,
         51,
         91,
         54,
         81,
         52,
         68,
         49,
         80,
         55,
         80,
         54,
         22,
         48,
         71,
         48,
         88,
         57,
         77,
         51,
         83,
         51,
         98,
         55,
         83,
         53,
         89,
         54,
         82,
         51,
         71,
         50,
         67,
         50,
         80,
         50,
         110,
         51,
         95,
         49,
         87,
         49,
         68,
         49,
         90,
         50,
         110,
         51,
         95,
         49,
         87,
         49,
         68,
         49,
         90,
         50,
         113,
         51,
         83,
         49,
         90,
         49,
         87,
         49,
         90,
         57,
         71,
         50,
         113,
         51,
         83,
         49,
         90,
         49,
         87,
         49,
         90,
         57,
         71,
         50,
         117,
         51,
         83,
         49,
         93,
         49,
         87,
         49,
         70,
         57,
         91,
         50,
         117,
         51,
         83,
         49,
         93,
         49,
         87,
         49,
         70,
         57,
         91,
         55,
         107,
         52,
         69,
         54,
         91,
         57,
         88,
         56,
         80,
         56,
         81,
         53,
         22,
         52,
         74,
         54,
         91,
         55,
         80,
         52,
         80,
         54,
         89,
         57,
         87,
         56,
         67,
         56,
         93,
         53,
         85,
         52,
         25,
         54,
         80,
         55,
         89,
         52,
         70,
         54,
         20,
         57,
         83,
         56,
         90,
         56,
         68,
         53,
         66,
         52,
         64,
         54,
         24,
         55,
         104,
         52,
         84,
         54,
         88,
         57,
         83,
         56,
         67,
         56,
         64,
         53,
         83,
         51,
         116,
         53,
         85,
         56,
         90,
         49,
         84,
         55,
         88,
         54,
         113,
         57,
         89,
         53,
         69,
         55,
         86,
         54,
         112,
         49,
         93,
         48,
         66,
         53,
         83,
         55,
         90,
         57,
         88,
         51,
         84,
         52,
         21,
         50,
         91,
         54,
         92,
         49,
         84,
         48,
         85,
         53,
         81,
         55,
         79,
         57,
         17,
         51,
         67,
         52,
         86,
         50,
         95,
         54,
         92,
         49,
         94,
         48,
         85,
         53,
         70,
         55,
         95,
         57,
         82,
         51,
         16,
         52,
         70,
         50,
         94,
         54,
         67,
         49,
         86,
         55,
         113,
         53,
         93,
         52,
         92,
         54,
         87,
         55,
         92,
         51,
         70,
         55,
         119,
         53,
         80,
         52,
         71,
         54,
         85,
         49,
         124,
         53,
         93,
         57,
         86,
         53,
         86,
         53,
         91,
         49,
         73,
         53,
         24,
         57,
         66,
         53,
         84,
         53,
         80,
         49,
         85,
         53,
         85,
         57,
         80,
         53,
         67,
         53,
         81,
         49,
         83,
         53,
         24,
         57,
         89,
         53,
         86,
         53,
         75,
         49,
         16,
         53,
         86,
         57,
         94,
         53,
         23,
         53,
         85,
         49,
         81,
         53,
         72,
         57,
         65,
         53,
         82,
         53,
         92,
         49,
         16,
         53,
         90,
         57,
         93,
         53,
         88,
         53,
         91,
         49,
         91,
         53,
         75,
         57,
         17,
         53,
         31,
         53,
         72,
         49,
         66,
         53,
         93,
         57,
         87,
         53,
         82,
         53,
         74,
         49,
         16,
         53,
         22,
         57,
         66,
         53,
         84,
         53,
         80,
         49,
         85,
         53,
         85,
         57,
         17,
         53,
         24,
         53,
         24,
         49,
         30,
         53,
         84,
         57,
         88,
         53,
         67,
         53,
         93,
         49,
         93,
         53,
         89,
         57,
         69,
         53,
         94,
         53,
         91,
         49,
         25,
         49,
         102,
         55,
         90,
         57,
         84,
         48,
         68,
         57,
         90,
         49,
         121,
         55,
         86,
         57,
         89,
         48,
         87,
         57,
         90,
         49,
         69,
         49,
         125,
         55,
         86,
         57,
         94,
         48,
         87,
         57,
         70,
         49,
         89,
         49,
         112,
         48,
         80,
         50,
         83,
         54,
         118,
         54,
         95,
         49,
         94,
         48,
         87,
         50,
         92,
         54,
         71,
         49,
         120,
         50,
         81,
         50,
         80,
         49,
         117,
         53,
         93,
         57,
         93,
         53,
         81,
         52,
         90,
         55,
         70,
         50,
         125,
         51,
         86,
         53,
         80,
         49,
         82,
         50,
         82,
         51,
         74,
         53,
         23,
         49,
         64,
         50,
         82,
         51,
         91,
         53,
         82,
         49,
         94,
         50,
         80,
         51,
         71,
         53,
         94,
         49,
         80,
         50,
         17,
         51,
         113,
         53,
         91,
         49,
         92,
         50,
         82,
         51,
         88,
         53,
         68,
         49,
         19,
         50,
         80,
         51,
         65,
         53,
         69,
         49,
         82,
         50,
         72,
         51,
         19,
         53,
         67,
         49,
         92,
         50,
         94,
         51,
         19,
         53,
         68,
         49,
         91,
         50,
         94,
         51,
         65,
         53,
         67,
         51,
         117,
         54,
         90,
         49,
         70,
         53,
         74,
         51,
         70,
         54,
         70,
         53,
         69,
         52,
         21,
         56,
         113,
         51,
         90,
         54,
         90,
         49,
         87,
         53,
         83,
         51,
         119,
         54,
         87,
         53,
         69,
         52,
         84,
         56,
         19,
         51,
         64,
         54,
         84,
         49,
         70,
         53,
         81,
         51,
         93,
         54,
         66,
         49,
         122,
         53,
         88,
         53,
         87,
         55,
         86,
         50,
         95,
         49,
         124,
         53,
         85,
         53,
         76,
         55,
         84,
         50,
         20,
         49,
         75,
         53,
         92,
         53,
         87,
         55,
         71,
         50,
         64,
         49,
         93,
         53,
         70,
         53,
         24,
         55,
         65,
         50,
         92,
         49,
         89,
         53,
         90,
         53,
         24,
         55,
         70,
         50,
         87,
         49,
         80,
         53,
         81,
         53,
         85,
         55,
         84,
         50,
         64,
         49,
         81,
         53,
         87,
         53,
         24,
         55,
         67,
         50,
         91,
         49,
         84,
         53,
         65,
         53,
         85,
         55,
         80,
         57,
         116,
         53,
         95,
         56,
         89,
         48,
         84,
         57,
         25,
         50,
         65,
         54,
         87,
         53,
         95,
         49,
         25,
         57,
         65,
         53,
         91,
         56,
         84,
         48,
         93,
         57,
         85
      };
   }

   private static int qvsjhsjvcvggqiuk(int var0, int var1) {
      return var1 ^ var0;
   }
}