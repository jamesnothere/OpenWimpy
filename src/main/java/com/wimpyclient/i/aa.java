package com.wimpyclient.i;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class aa {
   public final String id;
   public final String label;
   public boolean enabled;
   public int red;
   public int green;
   public int blue;
   private static int qlux99NGTy;
   private transient int zznIHu9dua;
   private static String zhvnqkxuot = ByteBuffer.wrap(klgrpqotrumwpxa()).asCharBuffer().toString();

   public aa(String var1, String var2, boolean var3, int var4, int var5, int var6) {
super();
      int var22 = 1967546510 ^ 911085126;
      
      var22 = dhnssgwuuwkouttz(var22, 572145411);
      var22 = 750142642 ^ 1618651773 ^ Integer.parseInt("769572612");
      this.zznIHu9dua = 442129668 ^ qlux99NGTy;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
            case 53164516:
               break;
            case 202579819:
               var22 = 1280228643 ^ var22;
            case 1706147512:
               this.id = var1;
               this.label = var2;
               this.enabled = var3;
               this.red = var4;
               this.green = var5;
               this.blue = var6;
               return;
            case 743269179:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public float redF() {
      int var8 = 1349485939 ^ 454864253 ^ 426203443;
      var8 = 1249184139 ^ var8;
      int var3 = this.red;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public float greenF() {
      int var8 = 1986299251 ^ 833241970 ^ 426203443;
      var8 = 235115383 ^ var8;
      int var3 = this.green;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public float blueF() {
      int var8 = 1716476809 ^ 1289536088 ^ 426203443;
      var8 = 1650497184 ^ var8;
      int var3 = this.blue;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public int argb() {
      int var23 = 135807850 ^ 84379049 ^ 426203443;
      var23 = 802397960 ^ var23;
      int var1 = -995426056 ^ var23;
      int var7 = this.red;
      short var3 = (short)(1001062407 ^ var23);
      int var8 = var7 & var3;
      byte var17 = (byte)(1001062632 ^ var23);
      int var9 = var8 << var17;
      int var4 = var1 | var9;
      int var11 = this.green;
      short var18 = (short)(1001062407 ^ var23);
      int var12 = var11 & var18;
      byte var19 = (byte)(1001062640 ^ var23);
      int var13 = var12 << var19;
      int var5 = var4 | var13;
      int var15 = this.blue;
      short var20 = (short)(1001062407 ^ var23);
      int var16 = var15 & var20;
      return var5 | var16;
   }

   public static aa resolve(Block var0, aa[] var1) {
      int var28 = 894650733 ^ 475133639 ^ 54330423;
      var28 = 1422084773 ^ var28;
      String var9 = classify(var0);
      String var4 = var9;
      if (var9 == null) {
         var28 = 2068456195 ^ var28;
         return null;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
               case 19274911:
               default:
                  throw new IllegalStateException();
               case 101346720:
                  var28 ^= 1420548415;
               case 1125674245:
                  aa[] var5 = var1;
                  int var13 = var1.length;
                  int var6 = var13;
                  byte var14 = (byte)(710354951 ^ var28);
                  int var7 = var14;
                  var28 = 1993992348 ^ var28;

                  while (var7 < var6) {
                     var28 = 1044725980 ^ var28;
                     aa var17 = var5[var7];
                     String var19 = var17.id;
                     byte var20 = (byte)((var19.equals(var4)) ? 1 : 0);
                     if (var20 != (1657503815 ^ var28)) {
                        var28 = 1310902494 ^ var28;
                        return var17;
                     }

                     label42:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                           case 258615874:
                              var28 ^= 1338440876;
                              break label42;
                           case 396228376:
                              break;
                           case 858962935:
                           default:
                              throw new IllegalStateException();
                           case 2017087214:
                              break label42;
                        }
                     }

                     var7 += 755858666 ^ var28;
                     var28 = 1904458864 ^ var28;
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                        case 55888290:
                           var28 = 1757828578 ^ var28;
                           return null;
                        case 157023513:
                           return null;
                        case 1382723016:
                        default:
                           throw new IllegalStateException();
                        case 1462618886:
                     }
                  }
               case 1076114380:
            }
         }
      }
   }

   public static String classify(Block var0) {
      int var65 = 1986287561 ^ 1815066256 ^ 54330423;
      var65 = 140605493 ^ var65;
      Block var2 = Blocks.CHEST;
      if (var0 == var2) {
         var65 = 1921516773 ^ var65;
         return fyyukdfrde(khlytdxuprwxvjk(), var65);
      } else {
         var65 = 1780058519 ^ var65;
         Block var42 = Blocks.TRAPPED_CHEST;
         if (var0 == var42) {
            var65 = 5194686 ^ var65;
            return fyyukdfrde(atyaetaygikjjzu(), var65);
         } else {
            var65 = dhnssgwuuwkouttz(var65, 851064554);
            String var43 = fyyukdfrde(dcwegcaczcdggnn(), var65);
            byte var7 = (byte)((blockPathContains(var0, var43)) ? 1 : 0);
            if (var7 != (1236541990 ^ var65)) {
               var65 = 829278367 ^ var65;
               return fyyukdfrde(jiqjxstmdxnmucu(), var65);
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                     case 248335261:
                        var65 ^= 1833432354;
                     case 1219151387:
                        Block var44 = Blocks.ENDER_CHEST;
                        if (var0 == var44) {
                           var65 = 608998310 ^ var65;
                           return fyyukdfrde(hzzktuilipdvpuo(), var65);
                        }

                        label172:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                              case 127423588:
                                 var65 ^= 151008166;
                                 break label172;
                              case 231033157:
                                 break;
                              case 778620478:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1790320958:
                                 break label172;
                           }
                        }

                        Block var45 = Blocks.BARREL;
                        if (var0 == var45) {
                           var65 = 910471973 ^ var65;
                           return fyyukdfrde(kooyljyybiinahs(), var65);
                        }

                        var65 = 1981478705 ^ var65;
                        byte var13 = (byte)((var0 instanceof ShulkerBoxBlock) ? 1 : 0);
                        if (var13 != (1542001555 ^ var65)) {
                           var65 = 1886966544 ^ var65;
                           return fyyukdfrde(jxzlfutwjrtzbzh(), var65);
                        }

                        label164:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                              case 34852357:
                                 var65 ^= 753881072;
                              case 783926694:
                                 break label164;
                              case 1251360897:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 2142173477:
                           }
                        }

                        Block var46 = Blocks.HOPPER;
                        if (var0 == var46) {
                           var65 = 1244300223 ^ var65;
                           return fyyukdfrde(clohsizplmftmkz(), var65);
                        }

                        var65 = dhnssgwuuwkouttz(var65, 494170989);
                        Block var47 = Blocks.DROPPER;
                        if (var0 == var47) {
                           var65 = 654171904 ^ var65;
                           return fyyukdfrde(cudkfdibqruhfzb(), var65);
                        }

                        var65 = dhnssgwuuwkouttz(var65, 1099425960);
                        Block var48 = Blocks.DISPENSER;
                        if (var0 == var48) {
                           var65 = 2007463828 ^ var65;
                           return fyyukdfrde(gokoavnxrimlntq(), var65);
                        }

                        var65 = dhnssgwuuwkouttz(var65, 1703959623);
                        Block var49 = Blocks.CRAFTER;
                        if (var0 == var49) {
                           var65 = 800799230 ^ var65;
                           return fyyukdfrde(uvzxulyvaljiejh(), var65);
                        }

                        var65 = dhnssgwuuwkouttz(var65, 30624046);
                        Block var50 = Blocks.FURNACE;
                        if (var0 == var50) {
                           var65 = 322131317 ^ var65;
                           return fyyukdfrde(vwpwfrsapcmtgvq(), var65);
                        }

                        var65 = 1796001416 ^ var65;
                        Block var51 = Blocks.BLAST_FURNACE;
                        if (var0 == var51) {
                           var65 = dhnssgwuuwkouttz(var65, 2017434621);
                           return fyyukdfrde(vwpwfrsapcmtgvq(), var65);
                        }

                        var65 = 1335062318 ^ var65;
                        Block var52 = Blocks.SMOKER;
                        if (var0 == var52) {
                           var65 = 934081747 ^ var65;
                           return fyyukdfrde(vwpwfrsapcmtgvq(), var65);
                        }

                        var65 = dhnssgwuuwkouttz(var65, 1607033182);
                        Block var53 = Blocks.BREWING_STAND;
                        if (var0 == var53) {
                           var65 = 1487626637 ^ var65;
                           return fyyukdfrde(kutbqifhdzfvstp(), var65);
                        }

                        label156:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                              case 108140458:
                                 var65 ^= 1396210430;
                              case 829037224:
                                 break label156;
                              case 1150591407:
                                 break;
                              case 1264290508:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }

                        Block var54 = Blocks.PISTON;
                        if (var0 == var54) {
                           var65 = 192053013 ^ var65;
                           return fyyukdfrde(dihyivkxyxpihdn(), var65);
                        }

                        var65 = 1107241183 ^ var65;
                        Block var55 = Blocks.STICKY_PISTON;
                        if (var0 == var55) {
                           var65 = 1250777034 ^ var65;
                           return fyyukdfrde(dihyivkxyxpihdn(), var65);
                        }

                        var65 = 967705286 ^ var65;
                        Block var56 = Blocks.PISTON_HEAD;
                        if (var0 == var56) {
                           var65 = dhnssgwuuwkouttz(var65, 1931695372);
                           return fyyukdfrde(dihyivkxyxpihdn(), var65);
                        }

                        var65 = 1199206503 ^ var65;
                        Block var57 = Blocks.MOVING_PISTON;
                        if (var0 == var57) {
                           var65 = 878257515 ^ var65;
                           return fyyukdfrde(dihyivkxyxpihdn(), var65);
                        }

                        var65 = 1095295549 ^ var65;
                        Block var58 = Blocks.CHISELED_BOOKSHELF;
                        if (var0 != var58) {
                           var65 = 1380573060 ^ var65;
                           Block var59 = Blocks.DECORATED_POT;
                           if (var0 == var59) {
                              var65 = dhnssgwuuwkouttz(var65, 546231997);
                              return fyyukdfrde(ohuewobxnenddgq(), var65);
                           }

                           var65 = 1544501334 ^ var65;
                           Block var60 = Blocks.LECTERN;
                           if (var0 != var60) {
                              var65 ^= 1966968385;
                              Block var61 = Blocks.JUKEBOX;
                              if (var0 != var61) {
                                 var65 = 439258060 ^ var65;
                                 Block var62 = Blocks.COMPOSTER;
                                 if (var0 == var62) {
                                    var65 = 328395622 ^ var65;
                                    return fyyukdfrde(ohuewobxnenddgq(), var65);
                                 }

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                                       case 28581864:
                                       default:
                                          throw new RuntimeException(new IOException());
                                       case 172882578:
                                          var65 = 572787569 ^ var65;
                                          return null;
                                       case 706996002:
                                          break;
                                       case 1271198585:
                                          return null;
                                    }
                                 }
                              }

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                                    case 257229920:
                                       var65 ^= 163340458;
                                       return fyyukdfrde(ohuewobxnenddgq(), var65);
                                    case 513722502:
                                       break;
                                    case 1045652041:
                                       return fyyukdfrde(ohuewobxnenddgq(), var65);
                                    case 1775710826:
                                    default:
                                       throw new RuntimeException(new IOException());
                                 }
                              }
                           }

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                                 case 242912455:
                                    var65 ^= 2088890091;
                                    return fyyukdfrde(ohuewobxnenddgq(), var65);
                                 case 833623629:
                                    break;
                                 case 1664494004:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1735136962:
                                    return fyyukdfrde(ohuewobxnenddgq(), var65);
                              }
                           }
                        }

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                              case 31194544:
                                 var65 ^= 1925646649;
                                 return fyyukdfrde(ohuewobxnenddgq(), var65);
                              case 146575823:
                                 return fyyukdfrde(ohuewobxnenddgq(), var65);
                              case 243834750:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1492530531:
                           }
                        }
                     case 1186661483:
                        break;
                     case 1872851560:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }
         }
      }
   }

   public static String classifyFromTypeId(String var0) {
      int var86 = 1627424365 ^ 759845008 ^ 54330423;
      var86 = 205583433 ^ var86;
      if (var0 != null) {
         var86 = 30920901 ^ var86;
         byte var5 = (byte)((var0.isEmpty()) ? 1 : 0);
         if (var5 == (1122039366 ^ var86)) {
            var86 = 1679453838 ^ var86;
            Locale var2 = Locale.ROOT;
            String var7 = var0.toLowerCase(var2);
            String var64 = fyyukdfrde(fhuwhkfopwhjwsy(), var86);
            byte var9 = (byte)((var7.contains(var64)) ? 1 : 0);
            if (var9 != (653957320 ^ var86)) {
               var86 = 101719913 ^ var86;
               return fyyukdfrde(zybffqrbtbjttuk(), var86);
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                  case 193310457:
                     var86 ^= 695705329;
                  case 1646782076:
                     String var65 = fyyukdfrde(bgbwmccsgqrfuhn(), var86);
                     byte var11 = (byte)((var7.contains(var65)) ? 1 : 0);
                     if (var11 != (260900409 ^ var86)) {
                        var86 = 992414016 ^ var86;
                        return fyyukdfrde(rrfbcuqjxqjtwgi(), var86);
                     }

                     var86 = 610702763 ^ var86;
                     String var66 = fyyukdfrde(xkhcclbynuiglll(), var86);
                     byte var14 = (byte)((var7.contains(var66)) ? 1 : 0);
                     if (var14 != (736859026 ^ var86)) {
                        var86 = 2141658233 ^ var86;
                        return fyyukdfrde(uelewasplapdrzj(), var86);
                     }

                     var86 = dhnssgwuuwkouttz(var86, 290212699);
                     String var67 = fyyukdfrde(cgpxmssewejhykq(), var86);
                     byte var16 = (byte)((var7.contains(var67)) ? 1 : 0);
                     if (var16 != (984078537 ^ var86)) {
                        var86 = 128389739 ^ var86;
                        return fyyukdfrde(vgpstdopcvrwube(), var86);
                     }

                     label167:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                           case 27594402:
                              var86 ^= 709608633;
                              break label167;
                           case 731743456:
                           default:
                              throw new RuntimeException();
                           case 756457955:
                              break label167;
                           case 1388528718:
                        }
                     }

                     String var68 = fyyukdfrde(xezfoyoeqmrctav(), var86);
                     byte var19 = (byte)((var7.contains(var68)) ? 1 : 0);
                     if (var19 != (283909232 ^ var86)) {
                        var86 = 1000540576 ^ var86;
                        return fyyukdfrde(bhfosbmsdjbnsbd(), var86);
                     }

                     label159:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                           case 13199349:
                              var86 ^= 1181190732;
                           case 75572627:
                              break label159;
                           case 370131714:
                              break;
                           case 985516911:
                           default:
                              throw new RuntimeException();
                        }
                     }

                     String var69 = fyyukdfrde(sccocqhynukeijw(), var86);
                     byte var21 = (byte)((var7.contains(var69)) ? 1 : 0);
                     if (var21 != (1451988540 ^ var86)) {
                        var86 = 1941102827 ^ var86;
                        return fyyukdfrde(dtvfrlsnmtmqihf(), var86);
                     }

                     label151:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                           case 128853407:
                              var86 ^= 1335970111;
                           case 1593471171:
                              break label151;
                           case 1692570284:
                              break;
                           case 2122329071:
                           default:
                              throw new RuntimeException();
                        }
                     }

                     String var70 = fyyukdfrde(xojcjsjimewbrqc(), var86);
                     byte var24 = (byte)((var7.contains(var70)) ? 1 : 0);
                     if (var24 != (422240003 ^ var86)) {
                        var86 = 1926010099 ^ var86;
                        return fyyukdfrde(almhqmllhwfawja(), var86);
                     }

                     label143:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                           case 12781887:
                              var86 ^= 1955980063;
                              break label143;
                           case 902739502:
                           default:
                              throw new RuntimeException();
                           case 947058752:
                              break label143;
                           case 1402830296:
                        }
                     }

                     String var71 = fyyukdfrde(sqdwigrmzomfjmn(), var86);
                     byte var27 = (byte)((var7.contains(var71)) ? 1 : 0);
                     if (var27 != (1841249308 ^ var86)) {
                        var86 = 113249218 ^ var86;
                        return fyyukdfrde(vyuumkvalilszxf(), var86);
                     }

                     var86 = 2129028312 ^ var86;
                     String var72 = fyyukdfrde(hjroxkpbekmyupx(), var86);
                     byte var30 = (byte)((var7.contains(var72)) ? 1 : 0);
                     if (var30 != (324622532 ^ var86)) {
                        var86 = 2020968960 ^ var86;
                        return fyyukdfrde(ccwslrpysntmhsb(), var86);
                     }

                     var86 = dhnssgwuuwkouttz(var86, 108709618);
                     String var73 = fyyukdfrde(slvztvxghbyvwpm(), var86);
                     byte var33 = (byte)((var7.contains(var73)) ? 1 : 0);
                     if (var33 != (354655798 ^ var86)) {
                        var86 = 945057888 ^ var86;
                        return fyyukdfrde(xzomavvouohxvpw(), var86);
                     }

                     var86 = 468472435 ^ var86;
                     String var74 = fyyukdfrde(rdcogjrorirpeyn(), var86);
                     byte var35 = (byte)((var7.contains(var74)) ? 1 : 0);
                     if (var35 == (248499269 ^ var86)) {
                        var86 = 1212105005 ^ var86;
                        String var75 = fyyukdfrde(toqikmvukbcfydv(), var86);
                        byte var37 = (byte)((var7.contains(var75)) ? 1 : 0);
                        if (var37 != (1190169960 ^ var86)) {
                           var86 = 520558444 ^ var86;
                           return fyyukdfrde(hptkrhsuvmyewux(), var86);
                        }

                        var86 = 1017873494 ^ var86;
                        String var76 = fyyukdfrde(wnwthgzrpeiqrnl(), var86);
                        byte var39 = (byte)((var7.contains(var76)) ? 1 : 0);
                        if (var39 != (2052786494 ^ var86)) {
                           var86 = 598512442 ^ var86;
                           return fyyukdfrde(hptkrhsuvmyewux(), var86);
                        }

                        label124:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                              case 219159475:
                                 var86 ^= 943200573;
                                 break label124;
                              case 286230307:
                                 break;
                              case 825013628:
                                 break label124;
                              case 1118752103:
                              default:
                                 throw new RuntimeException();
                           }
                        }

                        String var77 = fyyukdfrde(vtvjnvlyhcuuoep(), var86);
                        byte var42 = (byte)((var7.contains(var77)) ? 1 : 0);
                        if (var42 != (1113788419 ^ var86)) {
                           var86 = 247602970 ^ var86;
                           return fyyukdfrde(luzgkfsqprmizmk(), var86);
                        }

                        label116:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                              case 10464614:
                                 var86 ^= 1433225873;
                                 break label116;
                              case 132109846:
                              default:
                                 throw new RuntimeException();
                              case 496647682:
                                 break label116;
                              case 911363611:
                           }
                        }

                        String var78 = fyyukdfrde(ztthidmrsjphmhx(), var86);
                        byte var44 = (byte)((var7.contains(var78)) ? 1 : 0);
                        if (var44 != (386816658 ^ var86)) {
                           var86 = 1757531378 ^ var86;
                           return fyyukdfrde(irvrbxumgeixtip(), var86);
                        }

                        var86 = dhnssgwuuwkouttz(var86, 2100672383);
                        String var79 = fyyukdfrde(homcarfrxxqaqol(), var86);
                        byte var46 = (byte)((var7.contains(var79)) ? 1 : 0);
                        if (var46 != (1782312429 ^ var86)) {
                           var86 = 1052500106 ^ var86;
                           return fyyukdfrde(fuumretxaagzzto(), var86);
                        }

                        var86 = 70201909 ^ var86;
                        String var80 = fyyukdfrde(etlujntuzqlwyvt(), var86);
                        byte var48 = (byte)((var7.contains(var80)) ? 1 : 0);
                        if (var48 == (1846861784 ^ var86)) {
                           var86 = 1862996178 ^ var86;
                           String var81 = fyyukdfrde(edfzgrbcrjudkrf(), var86);
                           byte var50 = (byte)((var7.contains(var81)) ? 1 : 0);
                           if (var50 == (18861834 ^ var86)) {
                              var86 = 1993949575 ^ var86;
                              String var82 = fyyukdfrde(ocezcucdqymooch(), var86);
                              byte var52 = (byte)((var7.contains(var82)) ? 1 : 0);
                              if (var52 == (2009501325 ^ var86)) {
                                 var86 = 2057651564 ^ var86;
                                 String var83 = fyyukdfrde(btcyqyjssnqaehh(), var86);
                                 byte var54 = (byte)((var7.contains(var83)) ? 1 : 0);
                                 if (var54 == (224644065 ^ var86)) {
                                    var86 = 1151032844 ^ var86;
                                    return null;
                                 }

                                 var86 = 1508099718 ^ var86;
                              } else {
                                 var86 = dhnssgwuuwkouttz(var86, 591823850);
                              }

                              return fyyukdfrde(fuumretxaagzzto(), var86);
                           } else {
                              var86 = dhnssgwuuwkouttz(var86, 1436533357);
                              return fyyukdfrde(fuumretxaagzzto(), var86);
                           }
                        }

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                              case 88612774:
                                 var86 ^= 982831807;
                                 return fyyukdfrde(fuumretxaagzzto(), var86);
                              case 224607130:
                              default:
                                 throw new RuntimeException();
                              case 1071367334:
                                 break;
                              case 1764913499:
                                 return fyyukdfrde(fuumretxaagzzto(), var86);
                           }
                        }
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                           case 131146434:
                              break;
                           case 213030154:
                              var86 ^= 1463309889;
                              return fyyukdfrde(hptkrhsuvmyewux(), var86);
                           case 1332388102:
                              return fyyukdfrde(hptkrhsuvmyewux(), var86);
                           case 1645453479:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  case 1262311044:
                     break;
                  case 1726344564:
                  default:
                     throw new RuntimeException();
               }
            }
         }

         var86 = 1260204645 ^ var86;
      } else {
         var86 = dhnssgwuuwkouttz(var86, 1254810272);
      }

      return null;
   }

   public static aa resolveFromTypeId(String var0, aa[] var1) {
      int var28 = 2047092720 ^ 1682103669 ^ 54330423;
      var28 = 330383853 ^ var28;
      String var9 = classifyFromTypeId(var0);
      String var4 = var9;
      if (var9 == null) {
         var28 = 1653559359 ^ var28;
         return null;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
               case 212392962:
                  var28 ^= 1105727020;
               case 2095158446:
                  aa[] var5 = var1;
                  int var14 = var1.length;
                  int var6 = var14;
                  byte var15 = (byte)(1327673715 ^ var28);
                  int var7 = var15;
                  var28 = 710960563 ^ var28;

                  label34:
                  while (var7 < var6) {
                     var28 = 2060231386 ^ var28;
                     aa var18 = var5[var7];
                     String var20 = var18.id;
                     byte var21 = (byte)((var20.equals(var4)) ? 1 : 0);
                     if (var21 != (529430042 ^ var28)) {
                        var28 = 967870954 ^ var28;
                        return var18;
                     }

                     var28 = 943154666 ^ var28;
                     var7 += 666440689 ^ var28;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                           case 194474462:
                              break;
                           case 217493784:
                              var28 ^= 1123796784;
                           case 526065024:
                              continue label34;
                           case 1115558725:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }

                  var28 = 1014885934 ^ var28;
                  return null;
               case 1452349696:
               default:
                  throw new IllegalStateException();
               case 2016595419:
            }
         }
      }
   }

   private static boolean blockPathContains(Block var0, String var1) {
      int var14 = 1946973299 ^ 189374704 ^ 54330423;
      var14 = 1431067197 ^ var14;
      DefaultedRegistry var2 = BuiltInRegistries.BLOCK;
      Identifier var5 = var2.getKey(var0);
      if (var5 != null) {
         var14 = 1844945479 ^ var14;
         String var8 = var5.getPath();
         byte var9 = (byte)((var8.contains(var1)) ? 1 : 0);
         if (var9 != (1153640654 ^ var14)) {
            var14 = 363252051 ^ var14;
            byte var10 = (byte)(1365631388 ^ var14);
            var14 = 1303254628 ^ var14;
            return (var10 != 0);
         }

         var14 = 301938190 ^ var14;
      } else {
         label22:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
               case 265676125:
                  var14 ^= 2080937033;
               case 382192235:
                  break label22;
               case 1528946464:
                  break;
               case 1583419887:
               default:
                  throw new IllegalStateException();
            }
         }
      }

      byte var20 = (byte)(1430003392 ^ var14);
      var14 = 1240983865 ^ var14;
      return (var20 != 0);
   }

   public static aa[] defaults() {
      int var116 = 333809493 ^ 313851306 ^ 54330423;
      var116 = 145471230 ^ var116;
      byte var0 = (byte)(180865080 ^ var116);
      aa[] var9 = new aa[var0];
      byte var1 = (byte)(180865078 ^ var116);
      String var3 = fyyukdfrde(yebflxihmcgcgeu(), var116);
      String var4 = fyyukdfrde(hrymhvfplffyafq(), var116);
      byte var5 = (byte)(180865079 ^ var116);
      byte var6 = (byte)(180865040 ^ var116);
      short var7 = (short)(180865220 ^ var116);
      byte var8 = (byte)(180865142 ^ var116);
      aa var2 = new aa(var3, var4, (var5 != 0), var6, var7, var8);
      var9[var1] = var2;
      byte var10 = (byte)(180865079 ^ var116);
      String var36 = fyyukdfrde(uhnhdcvoskebqfp(), var116);
      String var49 = fyyukdfrde(kdoucdiftjoxtad(), var116);
      byte var62 = (byte)(180865079 ^ var116);
      short var75 = (short)(180865258 ^ var116);
      byte var88 = (byte)(180865034 ^ var116);
      byte var101 = (byte)(180865034 ^ var116);
      aa var23 = new aa(var36, var49, (var62 != 0), var75, var88, var101);
      var9[var10] = var23;
      byte var11 = (byte)(180865076 ^ var116);
      String var37 = fyyukdfrde(xsiuevoofrypjma(), var116);
      String var50 = fyyukdfrde(hgeaombwiemeqfb(), var116);
      byte var63 = (byte)(180865079 ^ var116);
      short var76 = (short)(180865278 ^ var116);
      short var89 = (short)(180865204 ^ var116);
      byte var102 = (byte)(180865136 ^ var116);
      aa var24 = new aa(var37, var50, (var63 != 0), var76, var89, var102);
      var9[var11] = var24;
      byte var12 = (byte)(180865077 ^ var116);
      String var38 = fyyukdfrde(fqacgryajzujzbj(), var116);
      String var51 = fyyukdfrde(olfcnwtzkqicior(), var116);
      byte var64 = (byte)(180865079 ^ var116);
      byte var77 = (byte)(180865102 ^ var116);
      byte var90 = (byte)(180865054 ^ var116);
      short var103 = (short)(180865278 ^ var116);
      aa var25 = new aa(var38, var51, (var64 != 0), var77, var90, var103);
      var9[var12] = var25;
      byte var13 = (byte)(180865074 ^ var116);
      String var39 = fyyukdfrde(jjfqoccorwwyncn(), var116);
      String var52 = fyyukdfrde(idzozoaqbzvgxqx(), var116);
      byte var65 = (byte)(180865079 ^ var116);
      short var78 = (short)(180865174 ^ var116);
      byte var91 = (byte)(180865112 ^ var116);
      byte var104 = (byte)(180865028 ^ var116);
      aa var26 = new aa(var39, var52, (var65 != 0), var78, var91, var104);
      var9[var13] = var26;
      byte var14 = (byte)(180865075 ^ var116);
      String var40 = fyyukdfrde(izphiwwydghixof(), var116);
      String var53 = fyyukdfrde(sxuaubabswgapqd(), var116);
      byte var66 = (byte)(180865079 ^ var116);
      short var79 = (short)(180865154 ^ var116);
      byte var92 = (byte)(180865126 ^ var116);
      short var105 = (short)(180865278 ^ var116);
      aa var27 = new aa(var40, var53, (var66 != 0), var79, var92, var105);
      var9[var14] = var27;
      byte var15 = (byte)(180865072 ^ var116);
      String var41 = fyyukdfrde(mfooledflgcrolx(), var116);
      String var54 = fyyukdfrde(fjbetwswlzlpoms(), var116);
      byte var67 = (byte)(180865079 ^ var116);
      short var80 = (short)(180865210 ^ var116);
      short var93 = (short)(180865210 ^ var116);
      short var106 = (short)(180865184 ^ var116);
      aa var28 = new aa(var41, var54, (var67 != 0), var80, var93, var106);
      var9[var15] = var28;
      byte var16 = (byte)(180865073 ^ var116);
      String var42 = fyyukdfrde(ychiqulflnaxhje(), var116);
      String var55 = fyyukdfrde(jrodupqygwfrarw(), var116);
      byte var68 = (byte)(180865079 ^ var116);
      byte var81 = (byte)(180865106 ^ var116);
      short var94 = (short)(180865174 ^ var116);
      byte var107 = (byte)(180865106 ^ var116);
      aa var29 = new aa(var42, var55, (var68 != 0), var81, var94, var107);
      var9[var16] = var29;
      byte var17 = (byte)(180865086 ^ var116);
      String var43 = fyyukdfrde(tinjqipewumvgrq(), var116);
      String var56 = fyyukdfrde(jvwtcmdnjxrizbp(), var116);
      byte var69 = (byte)(180865079 ^ var116);
      byte var82 = (byte)(180865106 ^ var116);
      short var95 = (short)(180865210 ^ var116);
      short var108 = (short)(180865154 ^ var116);
      aa var30 = new aa(var43, var56, (var69 != 0), var82, var95, var108);
      var9[var17] = var30;
      byte var18 = (byte)(180865087 ^ var116);
      String var44 = fyyukdfrde(yzlrohwgnzwaluy(), var116);
      String var57 = fyyukdfrde(cjlkwkvuoxktcxx(), var116);
      byte var70 = (byte)(180865079 ^ var116);
      byte var83 = (byte)(180865126 ^ var116);
      short var96 = (short)(180865278 ^ var116);
      short var109 = (short)(180865154 ^ var116);
      aa var31 = new aa(var44, var57, (var70 != 0), var83, var96, var109);
      var9[var18] = var31;
      byte var19 = (byte)(180865084 ^ var116);
      String var45 = fyyukdfrde(aoztedprqmdzwuv(), var116);
      String var58 = fyyukdfrde(epmlktcdmgznqie(), var116);
      byte var71 = (byte)(180865079 ^ var116);
      short var84 = (short)(180865278 ^ var116);
      byte var97 = (byte)(180865106 ^ var116);
      byte var110 = (byte)(180865054 ^ var116);
      aa var32 = new aa(var45, var58, (var71 != 0), var84, var97, var110);
      var9[var19] = var32;
      byte var20 = (byte)(180865085 ^ var116);
      String var46 = fyyukdfrde(xzeckgitsunmccv(), var116);
      String var59 = fyyukdfrde(jywctzshhiyoafp(), var116);
      byte var72 = (byte)(180865079 ^ var116);
      byte var85 = (byte)(180865126 ^ var116);
      short var98 = (short)(180865278 ^ var116);
      byte var111 = (byte)(180865126 ^ var116);
      aa var33 = new aa(var46, var59, (var72 != 0), var85, var98, var111);
      var9[var20] = var33;
      byte var21 = (byte)(180865082 ^ var116);
      String var47 = fyyukdfrde(xdcwuzexjpwuutf(), var116);
      String var60 = fyyukdfrde(mbcpbgsdbuhlkze(), var116);
      byte var73 = (byte)(180865078 ^ var116);
      short var86 = (short)(180865154 ^ var116);
      short var99 = (short)(180865154 ^ var116);
      byte var112 = (byte)(180865034 ^ var116);
      aa var34 = new aa(var47, var60, (var73 != 0), var86, var99, var112);
      var9[var21] = var34;
      byte var22 = (byte)(180865083 ^ var116);
      String var48 = fyyukdfrde(dajkpvvaelmqsyn(), var116);
      String var61 = fyyukdfrde(urprswlcvpzmsnn(), var116);
      byte var74 = (byte)(180865078 ^ var116);
      byte var87 = (byte)(180865106 ^ var116);
      short var100 = (short)(180865154 ^ var116);
      short var113 = (short)(180865258 ^ var116);
      aa var35 = new aa(var48, var61, (var74 != 0), var87, var100, var113);
      var9[var22] = var35;
      return var9;
   }

   public String enableSettingName() {
      int var5 = 1159649475 ^ 181254105 ^ 426203443;
      var5 = 1224630076 ^ var5;
      return this.label;
   }

   public String colorSettingName() {
      int var6 = 1420792978 ^ 1786658834 ^ 426203443;
      var6 = 732198618 ^ var6;
      String var2 = this.label;
      return var2 + " Color";
   }

   @Override
   public String toString() {
      int var7 = 2076770244 ^ 698986911 ^ 426203443;
      var7 = 509425656 ^ var7;
      String var3 = this.id;
      Locale var2 = Locale.ROOT;
      return var3.toUpperCase(var2);
   }

   static {
      int var3 = new Random(725358495857522653L).nextInt();
      qlux99NGTy = -1087730808 ^ var3;
   }

   public static String fyyukdfrde(byte[] var0, int var1) {
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
      String var29 = zhvnqkxuot;
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

   private static byte[] ohuewobxnenddgq() {
      return new byte[]{0, 0, 0, 4, 0, 0, 0, 0};
   }

   private static byte[] kooyljyybiinahs() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, 4};
   }

   private static byte[] hzzktuilipdvpuo() {
      return new byte[]{0, 0, 0, 11, 0, 0, 0, 10};
   }

   private static byte[] vwpwfrsapcmtgvq() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, 21};
   }

   private static byte[] dcwegcaczcdggnn() {
      return new byte[]{0, 0, 0, 12, 0, 0, 0, 28};
   }

   private static byte[] dihyivkxyxpihdn() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, 40};
   }

   private static byte[] atyaetaygikjjzu() {
      return new byte[]{0, 0, 0, 13, 0, 0, 0, 46};
   }

   private static byte[] uvzxulyvaljiejh() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, 59};
   }

   private static byte[] kutbqifhdzfvstp() {
      return new byte[]{0, 0, 0, 13, 0, 0, 0, 66};
   }

   private static byte[] jiqjxstmdxnmucu() {
      return new byte[]{0, 0, 0, 12, 0, 0, 0, 79};
   }

   private static byte[] gokoavnxrimlntq() {
      return new byte[]{0, 0, 0, 9, 0, 0, 0, 91};
   }

   private static byte[] clohsizplmftmkz() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, 100};
   }

   private static byte[] cudkfdibqruhfzb() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, 106};
   }

   private static byte[] khlytdxuprwxvjk() {
      return new byte[]{0, 0, 0, 5, 0, 0, 0, 113};
   }

   private static byte[] jxzlfutwjrtzbzh() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, 118};
   }

   private static byte[] ztthidmrsjphmhx() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, 125};
   }

   private static byte[] hjroxkpbekmyupx() {
      return new byte[]{0, 0, 0, 9, 0, 0, 0, -125};
   }

   private static byte[] ocezcucdqymooch() {
      return new byte[]{0, 0, 0, 13, 0, 0, 0, -116};
   }

   private static byte[] hptkrhsuvmyewux() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, -103};
   }

   private static byte[] btcyqyjssnqaehh() {
      return new byte[]{0, 0, 0, 9, 0, 0, 0, -96};
   }

   private static byte[] rrfbcuqjxqjtwgi() {
      return new byte[]{0, 0, 0, 12, 0, 0, 0, -87};
   }

   private static byte[] ccwslrpysntmhsb() {
      return new byte[]{0, 0, 0, 9, 0, 0, 0, -75};
   }

   private static byte[] xzomavvouohxvpw() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, -66};
   }

   private static byte[] toqikmvukbcfydv() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, -59};
   }

   private static byte[] bhfosbmsdjbnsbd() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, -53};
   }

   private static byte[] vtvjnvlyhcuuoep() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, -47};
   }

   private static byte[] luzgkfsqprmizmk() {
      return new byte[]{0, 0, 0, 13, 0, 0, 0, -40};
   }

   private static byte[] fhuwhkfopwhjwsy() {
      return new byte[]{0, 0, 0, 13, 0, 0, 0, -27};
   }

   private static byte[] fuumretxaagzzto() {
      return new byte[]{0, 0, 0, 4, 0, 0, 0, -14};
   }

   private static byte[] uelewasplapdrzj() {
      return new byte[]{0, 0, 0, 11, 0, 0, 0, -10};
   }

   private static byte[] homcarfrxxqaqol() {
      return new byte[]{0, 0, 0, 7, 0, 0, 1, 1};
   }

   private static byte[] zybffqrbtbjttuk() {
      return new byte[]{0, 0, 0, 13, 0, 0, 1, 8};
   }

   private static byte[] vyuumkvalilszxf() {
      return new byte[]{0, 0, 0, 7, 0, 0, 1, 21};
   }

   private static byte[] sqdwigrmzomfjmn() {
      return new byte[]{0, 0, 0, 7, 0, 0, 1, 28};
   }

   private static byte[] xezfoyoeqmrctav() {
      return new byte[]{0, 0, 0, 6, 0, 0, 1, 35};
   }

   private static byte[] xkhcclbynuiglll() {
      return new byte[]{0, 0, 0, 11, 0, 0, 1, 41};
   }

   private static byte[] dtvfrlsnmtmqihf() {
      return new byte[]{0, 0, 0, 7, 0, 0, 1, 52};
   }

   private static byte[] slvztvxghbyvwpm() {
      return new byte[]{0, 0, 0, 7, 0, 0, 1, 59};
   }

   private static byte[] rdcogjrorirpeyn() {
      return new byte[]{0, 0, 0, 7, 0, 0, 1, 66};
   }

   private static byte[] sccocqhynukeijw() {
      return new byte[]{0, 0, 0, 7, 0, 0, 1, 73};
   }

   private static byte[] almhqmllhwfawja() {
      return new byte[]{0, 0, 0, 6, 0, 0, 1, 80};
   }

   private static byte[] etlujntuzqlwyvt() {
      return new byte[]{0, 0, 0, 7, 0, 0, 1, 86};
   }

   private static byte[] edfzgrbcrjudkrf() {
      return new byte[]{0, 0, 0, 18, 0, 0, 1, 93};
   }

   private static byte[] wnwthgzrpeiqrnl() {
      return new byte[]{0, 0, 0, 13, 0, 0, 1, 111};
   }

   private static byte[] cgpxmssewejhykq() {
      return new byte[]{0, 0, 0, 5, 0, 0, 1, 124};
   }

   private static byte[] vgpstdopcvrwube() {
      return new byte[]{0, 0, 0, 5, 0, 0, 1, -127};
   }

   private static byte[] irvrbxumgeixtip() {
      return new byte[]{0, 0, 0, 6, 0, 0, 1, -122};
   }

   private static byte[] bgbwmccsgqrfuhn() {
      return new byte[]{0, 0, 0, 12, 0, 0, 1, -116};
   }

   private static byte[] xojcjsjimewbrqc() {
      return new byte[]{0, 0, 0, 6, 0, 0, 1, -104};
   }

   private static byte[] yebflxihmcgcgeu() {
      return new byte[]{0, 0, 0, 5, 0, 0, 1, -98};
   }

   private static byte[] hrymhvfplffyafq() {
      return new byte[]{0, 0, 0, 5, 0, 0, 1, -93};
   }

   private static byte[] uhnhdcvoskebqfp() {
      return new byte[]{0, 0, 0, 13, 0, 0, 1, -88};
   }

   private static byte[] kdoucdiftjoxtad() {
      return new byte[]{0, 0, 0, 13, 0, 0, 1, -75};
   }

   private static byte[] xsiuevoofrypjma() {
      return new byte[]{0, 0, 0, 12, 0, 0, 1, -62};
   }

   private static byte[] hgeaombwiemeqfb() {
      return new byte[]{0, 0, 0, 12, 0, 0, 1, -50};
   }

   private static byte[] fqacgryajzujzbj() {
      return new byte[]{0, 0, 0, 11, 0, 0, 1, -38};
   }

   private static byte[] olfcnwtzkqicior() {
      return new byte[]{0, 0, 0, 11, 0, 0, 1, -27};
   }

   private static byte[] jjfqoccorwwyncn() {
      return new byte[]{0, 0, 0, 6, 0, 0, 1, -16};
   }

   private static byte[] idzozoaqbzvgxqx() {
      return new byte[]{0, 0, 0, 6, 0, 0, 1, -10};
   }

   private static byte[] izphiwwydghixof() {
      return new byte[]{0, 0, 0, 7, 0, 0, 1, -4};
   }

   private static byte[] sxuaubabswgapqd() {
      return new byte[]{0, 0, 0, 11, 0, 0, 2, 3};
   }

   private static byte[] mfooledflgcrolx() {
      return new byte[]{0, 0, 0, 6, 0, 0, 2, 14};
   }

   private static byte[] fjbetwswlzlpoms() {
      return new byte[]{0, 0, 0, 6, 0, 0, 2, 20};
   }

   private static byte[] ychiqulflnaxhje() {
      return new byte[]{0, 0, 0, 7, 0, 0, 2, 26};
   }

   private static byte[] jrodupqygwfrarw() {
      return new byte[]{0, 0, 0, 7, 0, 0, 2, 33};
   }

   private static byte[] tinjqipewumvgrq() {
      return new byte[]{0, 0, 0, 9, 0, 0, 2, 40};
   }

   private static byte[] jvwtcmdnjxrizbp() {
      return new byte[]{0, 0, 0, 9, 0, 0, 2, 49};
   }

   private static byte[] yzlrohwgnzwaluy() {
      return new byte[]{0, 0, 0, 7, 0, 0, 2, 58};
   }

   private static byte[] cjlkwkvuoxktcxx() {
      return new byte[]{0, 0, 0, 7, 0, 0, 2, 65};
   }

   private static byte[] aoztedprqmdzwuv() {
      return new byte[]{0, 0, 0, 7, 0, 0, 2, 72};
   }

   private static byte[] epmlktcdmgznqie() {
      return new byte[]{0, 0, 0, 8, 0, 0, 2, 79};
   }

   private static byte[] xzeckgitsunmccv() {
      return new byte[]{0, 0, 0, 13, 0, 0, 2, 87};
   }

   private static byte[] jywctzshhiyoafp() {
      return new byte[]{0, 0, 0, 13, 0, 0, 2, 100};
   }

   private static byte[] xdcwuzexjpwuutf() {
      return new byte[]{0, 0, 0, 6, 0, 0, 2, 113};
   }

   private static byte[] mbcpbgsdbuhlkze() {
      return new byte[]{0, 0, 0, 7, 0, 0, 2, 119};
   }

   private static byte[] dajkpvvaelmqsyn() {
      return new byte[]{0, 0, 0, 4, 0, 0, 2, 126};
   }

   private static byte[] urprswlcvpzmsnn() {
      return new byte[]{0, 0, 0, 12, 0, 0, 2, -126};
   }

   private static byte[] klgrpqotrumwpxa() {
      return new byte[]{
         49,
         85,
         48,
         90,
         51,
         71,
         52,
         80,
         52,
         84,
         53,
         81,
         48,
         66,
         51,
         64,
         55,
         81,
         54,
         89,
         49,
         87,
         53,
         93,
         52,
         93,
         52,
         83,
         49,
         64,
         53,
         108,
         52,
         90,
         52,
         94,
         49,
         87,
         53,
         64,
         52,
         77,
         49,
         83,
         53,
         71,
         50,
         71,
         52,
         87,
         48,
         87,
         49,
         86,
         53,
         87,
         49,
         81,
         51,
         89,
         53,
         68,
         49,
         73,
         57,
         85,
         49,
         64,
         51,
         105,
         53,
         87,
         49,
         81,
         57,
         85,
         49,
         65,
         51,
         66,
         49,
         72,
         50,
         90,
         48,
         75,
         54,
         65,
         53,
         89,
         49,
         86,
         50,
         68,
         54,
         69,
         56,
         86,
         57,
         71,
         57,
         68,
         50,
         85,
         54,
         83,
         56,
         104,
         57,
         84,
         57,
         92,
         50,
         85,
         54,
         68,
         56,
         67,
         49,
         85,
         52,
         67,
         57,
         89,
         48,
         82,
         52,
         67,
         49,
         83,
         52,
         67,
         49,
         90,
         49,
         68,
         56,
         93,
         52,
         70,
         53,
         93,
         49,
         86,
         49,
         81,
         56,
         103,
         52,
         66,
         53,
         64,
         49,
         89,
         49,
         88,
         56,
         92,
         50,
         83,
         50,
         88,
         53,
         68,
         55,
         67,
         50,
         84,
         50,
         66,
         50,
         104,
         53,
         87,
         55,
         91,
         50,
         84,
         50,
         67,
         50,
         67,
         49,
         81,
         52,
         81,
         57,
         65,
         50,
         73,
         51,
         85,
         49,
         91,
         52,
         75,
         57,
         87,
         50,
         75,
         49,
         88,
         50,
         89,
         51,
         69,
         49,
         64,
         54,
         93,
         49,
         66,
         49,
         86,
         56,
         70,
         53,
         95,
         49,
         69,
         49,
         72,
         49,
         87,
         56,
         70,
         49,
         85,
         55,
         89,
         52,
         85,
         51,
         74,
         54,
         66,
         55,
         64,
         48,
         81,
         55,
         71,
         50,
         85,
         49,
         92,
         51,
         85,
         57,
         69,
         51,
         72,
         54,
         81,
         49,
         69,
         54,
         65,
         56,
         92,
         56,
         88,
         51,
         86,
         52,
         95,
         50,
         65,
         53,
         67,
         50,
         86,
         50,
         90,
         54,
         65,
         50,
         80,
         51,
         64,
         50,
         84,
         48,
         92,
         53,
         83,
         49,
         92,
         50,
         71,
         50,
         81,
         48,
         77,
         53,
         85,
         49,
         87,
         50,
         106,
         50,
         64,
         48,
         86,
         53,
         68,
         49,
         83,
         48,
         76,
         51,
         75,
         57,
         94,
         52,
         85,
         49,
         86,
         48,
         92,
         50,
         81,
         52,
         89,
         52,
         89,
         48,
         70,
         53,
         93,
         50,
         71,
         54,
         64,
         52,
         85,
         54,
         71,
         56,
         91,
         51,
         90,
         54,
         64,
         51,
         65,
         51,
         93,
         56,
         65,
         53,
         105,
         48,
         80,
         49,
         91,
         56,
         93,
         51,
         70,
         54,
         68,
         49,
         83,
         57,
         81,
         48,
         74,
         57,
         70,
         53,
         87,
         49,
         89,
         57,
         75,
         48,
         92,
         57,
         68,
         55,
         85,
         50,
         74,
         51,
         85,
         53,
         87,
         56,
         67,
         54,
         87,
         56,
         65,
         49,
         66,
         57,
         93,
         49,
         89,
         57,
         82,
         54,
         85,
         49,
         67,
         55,
         80,
         54,
         87,
         48,
         65,
         50,
         67,
         54,
         82,
         50,
         90,
         49,
         83,
         49,
         65,
         55,
         93,
         56,
         67,
         49,
         80,
         49,
         95,
         49,
         84,
         49,
         80,
         56,
         71,
         54,
         87,
         51,
         66,
         55,
         94,
         49,
         92,
         56,
         82,
         54,
         109,
         51,
         70,
         55,
         67,
         49,
         83,
         56,
         91,
         54,
         86,
         54,
         65,
         51,
         75,
         53,
         86,
         51,
         66,
         48,
         70,
         53,
         86,
         57,
         81,
         55,
         108,
         50,
         83,
         54,
         93,
         51,
         92,
         53,
         68,
         51,
         70,
         49,
         89,
         49,
         94,
         54,
         68,
         56,
         82,
         49,
         81,
         49,
         90,
         51,
         84,
         51,
         82,
         50,
         65,
         49,
         107,
         49,
         87,
         51,
         88,
         51,
         82,
         50,
         64,
         49,
         64,
         49,
         91,
         56,
         87,
         51,
         82,
         50,
         64,
         50,
         92,
         49,
         69,
         56,
         92,
         53,
         65,
         50,
         64,
         52,
         80,
         48,
         69,
         55,
         69,
         53,
         87,
         50,
         80,
         49,
         111,
         53,
         84,
         53,
         93,
         50,
         87,
         52,
         66,
         48,
         65,
         49,
         92,
         48,
         65,
         52,
         86,
         57,
         68,
         56,
         70,
         49,
         93,
         48,
         65,
         49,
         92,
         52,
         67,
         50,
         91,
         57,
         67,
         48,
         72,
         49,
         93,
         52,
         67,
         50,
         90,
         51,
         88,
         48,
         75,
         50,
         65,
         50,
         87,
         56,
         95,
         55,
         86,
         54,
         86,
         53,
         93,
         48,
         87,
         54,
         69,
         51,
         105,
         56,
         86,
         57,
         88,
         50,
         83,
         55,
         64,
         54,
         76,
         54,
         65,
         52,
         93,
         50,
         71,
         57,
         90,
         55,
         93,
         50,
         81,
         53,
         64,
         51,
         86,
         52,
         68,
         53,
         84,
         55,
         95,
         56,
         71,
         53,
         81,
         54,
         71,
         50,
         82,
         56,
         65,
         57,
         75,
         50,
         88,
         57,
         83,
         52,
         91,
         52,
         92,
         49,
         71,
         53,
         89,
         57,
         77,
         56,
         89,
         52,
         91,
         49,
         81,
         53,
         67,
         49,
         80,
         49,
         95,
         50,
         69,
         52,
         72,
         51,
         87,
         49,
         74,
         49,
         82,
         52,
         67,
         56,
         93,
         49,
         82,
         56,
         86,
         49,
         87,
         52,
         78,
         49,
         91,
         56,
         94,
         49,
         81,
         51,
         71,
         49,
         93,
         56,
         90,
         49,
         93,
         51,
         80,
         49,
         103,
         56,
         84,
         49,
         87,
         51,
         91,
         49,
         83,
         56,
         69,
         49,
         80,
         51,
         81,
         49,
         84,
         56,
         80,
         50,
         82,
         53,
         94,
         55,
         89,
         54,
         71,
         57,
         64,
         50,
         111,
         53,
         84,
         55,
         77,
         54,
         70,
         57,
         90,
         50,
         81,
         53,
         81,
         55,
         93,
         57,
         91,
         52,
         88,
         55,
         93,
         53,
         64,
         55,
         77,
         49,
         83,
         50,
         91,
         52,
         83,
         50,
         67,
         53,
         68,
         50,
         65,
         52,
         93,
         51,
         66,
         48,
         76,
         56,
         95,
         50,
         95,
         50,
         85,
         48,
         86,
         48,
         64,
         52,
         64,
         57,
         87,
         54,
         66,
         57,
         111,
         48,
         87,
         48,
         81,
         50,
         83,
         48,
         74,
         48,
         68,
         52,
         90,
         50,
         93,
         52,
         64,
         48,
         64,
         51,
         81,
         50,
         64,
         49,
         91,
         48,
         80,
         54,
         80,
         48,
         68,
         56,
         69,
         49,
         123,
         48,
         80,
         54,
         80,
         48,
         68,
         56,
         69,
         49,
         76,
         48,
         74,
         54,
         84,
         48,
         71,
         56,
         65,
         56,
         85,
         56,
         82,
         53,
         111,
         55,
         91,
         49,
         80,
         48,
         93,
         54,
         70,
         48,
         67,
         49,
         108,
         48,
         74,
         54,
         84,
         48,
         71,
         56,
         65,
         56,
         85,
         56,
         82,
         53,
         16,
         55,
         123,
         49,
         80,
         48,
         93,
         54,
         70,
         48,
         67,
         49,
         91,
         48,
         87,
         54,
         69,
         48,
         71,
         56,
         84,
         56,
         66,
         56,
         105,
         53,
         83,
         55,
         80,
         49,
         93,
         48,
         75,
         54,
         65,
         49,
         123,
         48,
         87,
         54,
         69,
         48,
         71,
         56,
         84,
         56,
         66,
         56,
         22,
         53,
         115,
         55,
         80,
         49,
         93,
         48,
         75,
         54,
         65,
         49,
         93,
         48,
         86,
         54,
         81,
         48,
         82,
         56,
         67,
         56,
         111,
         56,
         85,
         53,
         88,
         55,
         93,
         49,
         75,
         48,
         76,
         49,
         125,
         48,
         86,
         54,
         81,
         48,
         82,
         56,
         67,
         56,
         16,
         56,
         117,
         53,
         88,
         55,
         93,
         49,
         75,
         48,
         76,
         49,
         90,
         48,
         89,
         54,
         71,
         48,
         69,
         56,
         84,
         56,
         92,
         49,
         122,
         48,
         89,
         54,
         71,
         48,
         69,
         56,
         84,
         56,
         92,
         49,
         75,
         48,
         80,
         54,
         64,
         48,
         91,
         56,
         90,
         56,
         85,
         56,
         68,
         49,
         107,
         48,
         80,
         54,
         64,
         48,
         91,
         56,
         90,
         56,
         85,
         56,
         68,
         53,
         16,
         55,
         122,
         49,
         87,
         48,
         64,
         49,
         80,
         48,
         87,
         54,
         69,
         48,
         71,
         56,
         84,
         56,
         66,
         49,
         112,
         48,
         87,
         54,
         69,
         48,
         71,
         56,
         84,
         56,
         66,
         49,
         92,
         48,
         74,
         54,
         90,
         48,
         71,
         56,
         65,
         56,
         85,
         56,
         68,
         49,
         124,
         48,
         74,
         54,
         90,
         48,
         71,
         56,
         65,
         56,
         85,
         56,
         68,
         49,
         92,
         48,
         81,
         54,
         70,
         48,
         71,
         56,
         84,
         56,
         94,
         56,
         69,
         53,
         85,
         55,
         74,
         49,
         124,
         48,
         81,
         54,
         70,
         48,
         71,
         56,
         84,
         56,
         94,
         56,
         69,
         53,
         85,
         55,
         74,
         49,
         91,
         48,
         74,
         54,
         84,
         48,
         81,
         56,
         69,
         56,
         85,
         56,
         68,
         49,
         123,
         48,
         74,
         54,
         84,
         48,
         81,
         56,
         69,
         56,
         85,
         56,
         68,
         49,
         94,
         48,
         77,
         54,
         71,
         48,
         89,
         56,
         80,
         56,
         83,
         56,
         83,
         49,
         126,
         48,
         77,
         54,
         71,
         48,
         89,
         56,
         80,
         56,
         83,
         56,
         83,
         53,
         67,
         49,
         90,
         48,
         74,
         54,
         80,
         48,
         64,
         56,
         88,
         56,
         94,
         56,
         81,
         53,
         111,
         55,
         75,
         49,
         76,
         48,
         89,
         54,
         91,
         48,
         83,
         49,
         122,
         48,
         74,
         54,
         80,
         48,
         64,
         56,
         88,
         56,
         94,
         56,
         81,
         53,
         16,
         55,
         107,
         49,
         76,
         48,
         89,
         54,
         91,
         48,
         83,
         49,
         72,
         48,
         81,
         54,
         70,
         48,
         67,
         56,
         94,
         56,
         94,
         49,
         104,
         48,
         81,
         54,
         70,
         48,
         67,
         56,
         94,
         56,
         94,
         56,
         69,
         49,
         85,
         48,
         81,
         54,
         70,
         48,
         84,
         49,
         117,
         48,
         81,
         54,
         70,
         48,
         84,
         56,
         17,
         56,
         99,
         56,
         66,
         53,
         95,
         55,
         74,
         49,
         89,
         48,
         95,
         54,
         80
      };
   }

   private static int dhnssgwuuwkouttz(int var0, int var1) {
      return var0 ^ var1;
   }
}
