package com.wimpyclient.n;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.network.chat.FormattedText.StyledContentConsumer;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b {
   public static final String MODE_STAR_RANK = "Star + Rank";
   public static final String MODE_STAR = "Star Only";
   public static final String MODE_RANK = "Rank Only";
   public static final String MODE_NAMES = "Names Only";
   public static final String DEFAULT_SYMBOLS = "\u2605\u2606\u2726\u2727\u272a\u2729\u272b\u272c\u272d\u272e\u272f\u2b50\u2730\u2742\u269d\u2734\u2735\u2736\u2737\u2738\u2739\u235f";
   public static final List<String> DEFAULT_RANK_KEYWORDS;
   public static final String DEFAULT_RANK_KEYWORDS_STRING;
   private static final Map<String, String> RANK_LABELS;
   private static int YTNzgy5g6c;
   private transient int CPrRW3tYw6;

   private b() {
super();
      int var4 = 777284005 ^ 1430499888;
      
      var4 = 1757814680 ^ var4;
      var4 = 95116776 ^ 1028102798 ^ Integer.parseInt("725418859");
      this.CPrRW3tYw6 = 406332493 ^ YTNzgy5g6c;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 107378696:
               var4 = 1695602830 ^ var4;
            case 1749819170:
               return;
            case 1292912616:
               break;
            case 1555347807:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public static c classify(String var0, Component var1, Component var2, Component var3, String var4, boolean var5, int var6, b$a var7) {
      int var103 = 1148065459 ^ 1808036693 ^ 1829255677;
      var103 = 722410712 ^ var103;
      if (var0 != null) {
         var103 = 570928905 ^ var103;
         byte var27 = (byte)((var0.isEmpty()) ? 1 : 0);
         if (var27 == (1269493706 ^ var103)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                  case 43744061:
                     var103 ^= 365834543;
                  case 751087357:
                     Set var30 = var7.names();
                     Locale var10 = Locale.ROOT;
                     String var82 = var0.toLowerCase(var10);
                     byte var31 = (byte)((var30.contains(var82)) ? 1 : 0);                     Integer var33 = scanMarker(var1, var7);
                     Integer var17 = var33;
                     if (var33 == null) {
                        var103 = 1158610642 ^ var103;
                        Integer var36 = scanMarker(var2, var7);
                        var17 = var36;
                        var103 = 78300137 ^ var103;
                     } else {
                        var103 = 1101282619 ^ var103;
                     }

                     if (var17 == null) {
                        var103 = 1730158364 ^ var103;
                        Integer var39 = scanMarker(var3, var7);
                        var17 = var39;
                        var103 = 203672721 ^ var103;
                     } else {
                        label191:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                              case 161605879:
                                 break label191;
                              case 226862782:
                                 var103 ^= 1795412877;
                                 break label191;
                              case 1146272083:
                              default:
                                 throw new RuntimeException();
                              case 1183625931:
                           }
                        }
                     }

                     byte var41;
                     if (var17 != null) {
                        var103 = 237835974 ^ var103;
                        var41 = (byte)(2062427796 ^ var103);

                        label182:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                              case 237834286:
                                 var103 ^= 663157283;
                              case 444790530:
                                 break label182;
                              case 1475680832:
                              default:
                                 throw new RuntimeException();
                              case 2010075746:
                           }
                        }
                     } else {
                        label175:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                              case 37378403:
                                 var103 ^= 115992757;
                                 break label175;
                              case 606764030:
                                 break;
                              case 1486532070:
                                 break label175;
                              case 1838526794:
                              default:
                                 throw new RuntimeException();
                           }
                        }

                        var41 = (byte)(1915410662 ^ var103);
                        var103 = 792855632 ^ var103;
                     }

                     String var43 = plain(var1);
                     String var87 = plain(var2);
                     String var95 = plain(var3);
                     String var98;
                     if (var4 == null) {
                        var103 = 1071355527 ^ var103;
                        var98 = xuseqiuesi(sirbpsffhgibedv(), ypjeyywugxovvqp(), var103);
                        var103 = notgpjaufqsnywsz(var103, 608097439);
                     } else {
                        var103 = notgpjaufqsnywsz(var103, 680149955);
                        var98 = var4;
                        var103 = 862912987 ^ var103;
                     }

                     String var44 = var43 + " " + var87 + " " + var95 + " " + var98;
                     String var46 = stripName(var44, var0);
                     List var90 = var7.rankKeywords();
                     b$b var47 = deriveRank(var46, var90);
                     byte var49;
                     if (var47 != null) {
                        var103 = 2132489423 ^ var103;
                        var49 = (byte)(966175328 ^ var103);
                        var103 = 1717479065 ^ var103;
                     } else {
                        label165:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                              case 145892860:
                                 var103 ^= 1478834492;
                                 break label165;
                              case 229820928:
                              default:
                                 throw new RuntimeException();
                              case 772957769:
                                 break;
                              case 1736814615:
                                 break label165;
                           }
                        }

                        var49 = (byte)(514369426 ^ var103);
                        var103 = 1096854378 ^ var103;
                     }

                     String var51 = var7.mode();
                     byte var52 = (byte)(-1606946041 ^ var103);
                     byte var24 = var52;
                     int var54 = var51.hashCode();

                     var103 = switch (var54) {
                        case -203046726 -> {
                           var103 = 1960283385 ^ var103;
                           String var93 = xuseqiuesi(qoiowhhecphhilv(), ypjeyywugxovvqp(), var103);
                           byte var78 = (byte)((var51.equals(var93)) ? 1 : 0);
                           if (var78 != (723484673 ^ var103)) {
                              var103 = 699763124 ^ var103;
                              byte var79 = (byte)(44698037 ^ var103);
                              var24 = var79;

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                                    case 41905075:
                                       yield 663804165;
                                    case 308763263:
                                    default:
                                       throw new RuntimeException();
                                    case 440254620:
                                    case 1386980723:
                                 }
                              }
                           } else {
                              yield 237326513 ^ var103;
                           }
                        }
                        case 1302991648 -> {
                           var103 = notgpjaufqsnywsz(var103, 1009647266);
                           String var91 = xuseqiuesi(wrewrfrnjkirjuf(), ypjeyywugxovvqp(), var103);
                           byte var56 = (byte)((var51.equals(var91)) ? 1 : 0);
                           if (var56 != (1676014170 ^ var103)) {
                              var103 = 1396638630 ^ var103;
                              byte var57 = (byte)(819655165 ^ var103);
                              var24 = var57;
                              yield 367010124 ^ var103;
                           } else {
                              yield notgpjaufqsnywsz(var103, 1189028586);
                           }
                        }
                        case 2083116484 -> {
                           var103 = 533627430 ^ var103;
                           String var92 = xuseqiuesi(xsnqscsorhwiwto(), ypjeyywugxovvqp(), var103);
                           byte var75 = (byte)((var51.equals(var92)) ? 1 : 0);
                           if (var75 != (1074171614 ^ var103)) {
                              var103 = 278736555 ^ var103;
                              byte var76 = (byte)(1352376439 ^ var103);
                              var24 = var76;
                              yield 1973514437 ^ var103;
                           } else {
                              yield notgpjaufqsnywsz(var103, 1698455150);
                           }
                        }
                        default -> notgpjaufqsnywsz(var103, 2062736456);
                     };

                     byte var73;

                     var103 = switch (var24) {
                        case 0 -> {
                           label134:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                                 case 136434031:
                                    var103 ^= 641816052;
                                    break label134;
                                 case 273913192:
                                    break;
                                 case 444330143:
                                 default:
                                    throw new RuntimeException();
                                 case 1297495645:
                                    break label134;
                              }
                           }

                           var73 = var41;
                           yield notgpjaufqsnywsz(var103, 1263787004);
                        }
                        case 1 -> {
                           var103 = notgpjaufqsnywsz(var103, 803477836);
                           var73 = var49;
                           yield 1123456836 ^ var103;
                        }
                        case 2 -> {
                           var103 = 168788994 ^ var103;
                           var73 = (byte)(792024242 ^ var103);

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                                 case 192379693:
                                    yield 1729956362;
                                 case 595854420:
                                 default:
                                    throw new RuntimeException();
                                 case 928350198:
                                    break;
                                 case 1440315161:
                              }
                           }
                        }
                        default -> {
                           label147: {
                              var103 = 1432840190 ^ var103;
                              if (var41 == (1885189966 ^ var103)) {
                                 var103 = 773114218 ^ var103;
                                 if (var49 == (1581874724 ^ var103)) {
                                    var103 = 1000073118 ^ var103;
                                    var73 = (byte)(1708300730 ^ var103);
                                    yield 771409666 ^ var103;
                                    }

                                 var103 = 1789122636 ^ var103;
                              } else {
                                 var103 = 1152848166 ^ var103;
                              }

                              var73 = (byte)(887793257 ^ var103);
                              yield notgpjaufqsnywsz(var103, 2093152464);
                           }
                        }
                     };

                     if (var31 == (1210605240 ^ var103)) {
                        var103 = 1961779067 ^ var103;
                        if (var73 == (1019609539 ^ var103)) {
                           var103 = 2028706127 ^ var103;
                           return null;
                        }

                        label125:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                              case 38646208:
                                 break label125;
                              case 96444335:
                                 var103 ^= 1958665430;
                                 break label125;
                              case 1534692511:
                              default:
                                 throw new RuntimeException();
                              case 1568626156:
                           }
                        }
                     } else {
                        var103 = 5276589 ^ var103;
                     }

                     int var65;
                     if (var41 != (1215880469 ^ var103)) {
                        var103 = 785242799 ^ var103;
                        var65 = var17;
                        var103 = notgpjaufqsnywsz(var103, 2108825760);
                     } else {
                        var103 = notgpjaufqsnywsz(var103, 210203348);
                        var65 = (byte)(1157607361 ^ var103);
                        var103 = 1610123483 ^ var103;
                     }

                     byte var99 = (byte)var65;
                     String var80;
                     if (var49 != (453453594 ^ var103)) {
                        var103 = 1182157323 ^ var103;
                        var80 = var47.label();
                        var103 = 1238477865 ^ var103;
                     } else {
                        var103 = 1911323469 ^ var103;
                        var80 = xuseqiuesi(fuyvxpzwlgpulvk(), ypjeyywugxovvqp(), var103);
                        var103 = 2118884719 ^ var103;
                     }

                     if (var49 != (346079544 ^ var103)) {
                        var103 = 1125116964 ^ var103;
                        int var144 = var47.priority();

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                              case 165884105:
                                 var103 = 1436074266 ^ var103;
                                 return new c(var0, var80, var99, var5, var6, var144);
                              case 192115014:
                                 break;
                              case 1973954571:
                              default:
                                 throw new RuntimeException();
                              case 2038982577:
                                 return new c(var0, var80, var99, var5, var6, var144);
                           }
                        }
                     }

                     var103 = 1210314190 ^ var103;
                     if (var41 != (1552100598 ^ var103)) {
                        var103 = 705730442 ^ var103;
                        byte var143 = (byte)(1989393277 ^ var103);
                        var103 = 1956927354 ^ var103;
                        return new c(var0, var80, var99, var5, var6, var143);
                     }

                     label117:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var103)) {
                           case 54426527:
                              var103 ^= 779219958;
                           case 726055327:
                              break label117;
                           case 1344903566:
                           default:
                              throw new RuntimeException();
                           case 2114574406:
                        }
                     }

                     byte var81 = (byte)(1928519424 ^ var103);
                     var103 = 1891971846 ^ var103;
                     return new c(var0, var80, var99, var5, var6, var81);
                  case 978247972:
                  default:
                     throw new RuntimeException();
                  case 1176372738:
               }
            }
         }

         var103 = 1302455443 ^ var103;
      } else {
         var103 = notgpjaufqsnywsz(var103, 1873169306);
      }

      return null;
   }

   static Integer scanMarker(Component var0, b$a var1) {
      int var14 = 155140024 ^ 1004125685 ^ 1829255677;
      var14 = 2041649591 ^ var14;
      if (var0 == null) {
         var14 = 1021232296 ^ var14;
         return null;
      } else {
         var14 = notgpjaufqsnywsz(var14, 1843907885);
         StyledContentConsumer var10 = (var1x, var2) -> {
            int var32 = 404137689 ^ 370714971 ^ 1829255677;
            var32 = 1857511325 ^ var32;
            byte var3 = (byte)(229730786 ^ var32);
            int var5 = var3;
            var32 = 1300206497 ^ var32;

            while (true) {
               int var23 = var2.length();
               if (var5 >= var23) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
                        case 227623983:
                           var32 = 1526926836 ^ var32;
                        case 10426072:
                           return Optional.empty();
                        case 1204625688:
                           break;
                        case 1455914089:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }

               var32 = 1123696798 ^ var32;
               int var10x = var2.codePointAt(var5);
               int var26 = Character.charCount(var10x);
               int var12 = var5 + var26;
               var5 = var12;
               byte var14x = (byte)((isMarker(var10x, var1)) ? 1 : 0);
               if (var14x != (37010141 ^ var32)) {
                  var32 = 431021932 ^ var32;
                  TextColor var16x = var1x.getColor();
                  int var21;
                  if (var16x != null) {
                     var32 = 2128509146 ^ var32;
                     int var18 = -1705370261 ^ var32;
                     int var29 = var16x.getValue();
                     var21 = var18 | var29;
                     var32 = 24763051 ^ var32;
                  } else {
                     var32 = notgpjaufqsnywsz(var32, 571408817);
                     var21 = (byte)(965436416 ^ var32);
                     var32 = 1571333056 ^ var32;
                  }

                  Integer var19 = var21;
                  return Optional.of(var19);
               }

               var32 = 230709558 ^ var32;
               var32 = notgpjaufqsnywsz(var32, 1329207720);
            }
         };
         Style var4 = Style.EMPTY;
         Optional var7 = var0.visit(var10, var4);
         Object var11 = null;
         Object var8 = var7.orElse(var11);
         return (Integer)var8;
      }
   }

   private static boolean isMarker(int var0, b$a var1) {
      int var25 = 1906934598 ^ 1984775110 ^ 1829255677;
      var25 = 1346237745 ^ var25;
      String var4 = var1.symbols();
      int var5 = var4.indexOf(var0);
      if (var5 >= (986778700 ^ var25)) {
         var25 = 1823884516 ^ var25;
         return (((byte)(1449609385 ^ var25)) != 0);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
               case 32849154:
                  var25 ^= 24466496;
               case 118523509:
                  byte var8 = (byte)((var1.fontIcons()) ? 1 : 0);
                  if (var8 == (1000626188 ^ var25)) {
                     var25 = 165287836 ^ var25;
                     return (((byte)(847138704 ^ var25)) != 0);
                  }

                  label85: {
                     label86: {
                        var25 = notgpjaufqsnywsz(var25, 216023431);
                        int var17 = 927267211 ^ var25;
                        if (var0 >= var17) {
                           var25 = 30683185 ^ var25;
                           int var18 = 915460421 ^ var25;
                           if (var0 <= var18) {
                              var25 = notgpjaufqsnywsz(var25, 1446700181);
                              break label86;
                           }

                           var25 = 164967587 ^ var25;
                        } else {
                           var25 = 134284434 ^ var25;
                        }

                        int var19 = 1061821721 ^ var25;
                        if (var0 >= var19) {
                           var25 = 995464469 ^ var25;
                           int var20 = 69171185 ^ var25;
                           if (var0 <= var20) {
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                                    case 63929243:
                                       var25 ^= 1689928995;
                                    case 1053711745:
                                       break label86;
                                    case 1398278791:
                                    default:
                                       throw new IllegalStateException();
                                    case 1650217316:
                                 }
                              }
                           }

                           var25 = 1604563481 ^ var25;
                        } else {
                           label62:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                                 case 60270476:
                                 default:
                                    throw new IllegalStateException();
                                 case 177592101:
                                    var25 ^= 1693853452;
                                 case 1374863958:
                                    break label62;
                                 case 2027900398:
                              }
                           }
                        }

                        int var21 = 1537423893 ^ var25;
                        if (var0 < var21) {
                           var25 = 859608446 ^ var25;
                           break label85;
                        }

                        var25 = 715299426 ^ var25;
                        int var22 = 1895915402 ^ var25;
                        if (var0 > var22) {
                           var25 = notgpjaufqsnywsz(var25, 429788956);
                           break label85;
                        }

                        var25 = 297495896 ^ var25;
                     }

                     byte var15 = (byte)(1621806382 ^ var25);

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                           case 189435169:
                              var25 = 339990950 ^ var25;
                              return (var15 != 0);
                           case 359643881:
                              return (var15 != 0);
                           case 1544353639:
                           default:
                              throw new IllegalStateException();
                           case 2015691655:
                        }
                     }
                  }

                  byte var37 = (byte)(1754247019 ^ var25);
                  var25 = 476494818 ^ var25;
                  return (var37 != 0);
               case 1349331513:
               default:
                  throw new IllegalStateException();
               case 1490911912:
            }
         }
      }
   }

   private static b$b deriveRank(String var0, List<String> var1) {
      int var35 = 2106524126 ^ 1921716342 ^ 1829255677;
      var35 = 1902813503 ^ var35;
      Locale var3 = Locale.ROOT;
      String var10 = var0.toLowerCase(var3);
      String var11 = lettersOnly(var10);
      String var7 = var11;
      byte var13 = (byte)((var11.isEmpty()) ? 1 : 0);
      if (var13 != (325486954 ^ var35)) {
         var35 = 1170205366 ^ var35;
         return null;
      } else {
         var35 = 1877319536 ^ var35;
         byte var15 = (byte)(2088965658 ^ var35);
         int var8 = var15;
         var35 = 2106508034 ^ var35;

         while (true) {
            int var27 = var1.size();
            if (var8 < var27) {
               var35 = 1065575569 ^ var35;
               Object var19 = var1.get(var8);
               String var20 = (String)var19;
               byte var22 = (byte)((var20.isEmpty()) ? 1 : 0);
               if (var22 == (1049538953 ^ var35)) {
                  var35 ^= 1827807280;
                  byte var24 = (byte)((var7.contains(var20)) ? 1 : 0);
                  if (var24 != (1383895481 ^ var35)) {
                     var35 = 1231736438 ^ var35;
                     String var30 = labelFor(var20);
                     int var31 = var1.size();
                     int var32 = var31 - var8;
                     return new b$b(var30, var32);
                  }

                  label32:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var35)) {
                        case 265357354:
                           var35 ^= 606168439;
                           break label32;
                        case 407091155:
                           break;
                        case 1644102913:
                           break label32;
                        case 1944556541:
                        default:
                           throw new RuntimeException();
                     }
                  }
               } else {
                  label41:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var35)) {
                        case 154421623:
                           var35 ^= 1221805383;
                           break label41;
                        case 449958081:
                        default:
                           throw new RuntimeException();
                        case 931854441:
                           break;
                        case 962242151:
                           break label41;
                     }
                  }
               }
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var35)) {
                     case 16578251:
                        var35 = 1673134758 ^ var35;
                        return null;
                     case 407835303:
                     default:
                        throw new RuntimeException();
                     case 1016811475:
                        break;
                     case 1356298035:
                        return null;
                  }
               }
            }

            var8 += 1985869007 ^ var35;
            var35 = notgpjaufqsnywsz(var35, 2001740246);
         }
      }
   }

   private static String labelFor(String var0) {
      int var20 = 687953029 ^ 6126378 ^ 1829255677;
      var20 = 1564028024 ^ var20;
      Map var1 = RANK_LABELS;
      Object var5 = var1.get(var0);
      String var6 = (String)var5;
      if (var6 != null) {
         var20 = 2053323281 ^ var20;
         return var6;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
               case 21215708:
                  var20 ^= 2026449218;
               case 1206987212:
                  byte var9 = (byte)((var0.isEmpty()) ? 1 : 0);
                  String var13;
                  if (var9 != (1638142824 ^ var20)) {
                     var20 = 1679032906 ^ var20;
                     var13 = xuseqiuesi(eqanoydmskdbfei(), ypjeyywugxovvqp(), var20);
                     var20 = notgpjaufqsnywsz(var20, 549383292);
                  } else {
                     var20 = notgpjaufqsnywsz(var20, 1770206254);
                     byte var15 = (byte)(136783686 ^ var20);
                     char var11 = var0.charAt(var15);
                     char var12 = Character.toUpperCase(var11);
                     byte var3 = (byte)(136783687 ^ var20);
                     String var17 = var0.substring(var3);
                     var13 = var12 + var17;
                     var20 = 757717528 ^ var20;
                  }

                  return var13;
               case 625578995:
                  break;
               case 1547591650:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private static String plain(Component var0) {
      int var6 = 612676143 ^ 1104993708 ^ 1829255677;
      var6 = 1434681579 ^ var6;
      if (var0 != null) {
         var6 = 902560395 ^ var6;
         String var12 = var0.getString();
         var6 = 1314111698 ^ var6;
         return var12;
      } else {
         var6 = 1027890593 ^ var6;
         String var3 = xuseqiuesi(pvvlqswhirkwlmp(), ypjeyywugxovvqp(), var6);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var6)) {
               case 95700104:
                  break;
               case 187039011:
                  var6 = 1188849656 ^ var6;
                  return var3;
               case 1326185623:
               default:
                  throw new RuntimeException();
               case 1370472738:
                  return var3;
            }
         }
      }
   }

   private static String lettersOnly(String var0) {
      int var25 = 2039700703 ^ 274032029 ^ 1829255677;
      var25 = 159714935 ^ var25;
      int var22 = var0.length();
      StringBuilder var1 = new StringBuilder(var22);
      StringBuilder var3 = var1;
      byte var6 = (byte)(223022792 ^ var25);
      int var4 = var6;
      var25 = 757553162 ^ var25;

      while (true) {
         int var17 = var0.length();
         if (var4 < var17) {
            var25 = 2037509273 ^ var25;
            char var11 = var0.charAt(var4);
            byte var19 = (byte)(1495120442 ^ var25);
            if (var11 >= var19) {
               var25 = 1437787599 ^ var25;
               byte var20 = (byte)(212819950 ^ var25);
               if (var11 <= var20) {
                  var25 = 691575771 ^ var25;
                  StringBuilder var15 = var3.append(var11);
                  var25 = 771705289 ^ var25;
               } else {
                  var25 = notgpjaufqsnywsz(var25, 80204306);
               }
            } else {
               label27:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                     case 212451341:
                        var25 ^= 1366636509;
                     case 325157149:
                        break label27;
                     case 564051959:
                     default:
                        throw new RuntimeException(new IOException());
                     case 710838649:
                  }
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                  case 111080344:
                     return var3.toString();
                  case 140604504:
                  default:
                     throw new RuntimeException(new IOException());
                  case 248629371:
                     var25 = 1882105562 ^ var25;
                     return var3.toString();
                  case 1288178076:
               }
            }
         }

         var4 += 141069703 ^ var25;
         var25 = 671406916 ^ var25;
      }
   }

   private static String stripName(String var0, String var1) {
      int var56 = 1378740688 ^ 1124327277 ^ 1829255677;
      var56 = 1141527952 ^ var56;
      if (var1 != null) {
         var56 ^= 548698856;
         byte var12 = (byte)((var1.isEmpty()) ? 1 : 0);
         if (var12 == (412622904 ^ var56)) {
            var56 = 1288721502 ^ var56;
            if (var0 != null) {
               var56 = 2064116028 ^ var56;
               byte var15 = (byte)((var0.isEmpty()) ? 1 : 0);
               if (var15 == (793746778 ^ var56)) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
                        case 195719057:
                           var56 ^= 703074283;
                        case 379387124:
                           Locale var3 = Locale.ROOT;
                           String var18 = var0.toLowerCase(var3);
                           String var6 = var18;
                           Locale var40 = Locale.ROOT;
                           String var20 = var1.toLowerCase(var40);
                           String var7 = var20;
                           int var22 = var18.indexOf(var20);
                           int var8 = var22;
                           if (var22 < (111645361 ^ var56)) {
                              var56 = 177690836 ^ var56;
                              return var0;
                           }

                           var56 = 467283475 ^ var56;
                           int var48 = var0.length();
                           StringBuilder var24 = new StringBuilder(var48);
                           StringBuilder var9 = var24;
                           byte var25 = (byte)(494779554 ^ var56);
                           int var10 = var25;
                           var56 = 154380551 ^ var56;

                           label48:
                           while (var8 >= (340661669 ^ var56)) {
                              var56 ^= 1659414581;
                              StringBuilder var32 = var9.append(var0, var10, var8);
                              byte var44 = (byte)(1990639024 ^ var56);
                              StringBuilder var33 = var32.append((char)var44);
                              int var46 = var1.length();
                              int var35 = var8 + var46;
                              var10 = var35;
                              int var37 = var6.indexOf(var7, var35);
                              var8 = var37;

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
                                    case 98793953:
                                       var56 ^= 1659414581;
                                    case 683964623:
                                       continue label48;
                                    case 723762143:
                                    default:
                                       throw new RuntimeException();
                                    case 1665317858:
                                 }
                              }
                           }

                           var56 = notgpjaufqsnywsz(var56, 1382827554);
                           int var52 = var0.length();
                           StringBuilder var28 = var9.append(var0, var10, var52);
                           return var9.toString();
                        case 952818446:
                           break;
                        case 1787735489:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }

               var56 = 907644762 ^ var56;
            } else {
               var56 = notgpjaufqsnywsz(var56, 1293837926);
            }
         } else {
            label80:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
                  case 239090667:
                  default:
                     throw new RuntimeException();
                  case 262579956:
                     var56 ^= 30290488;
                     break label80;
                  case 514223691:
                     break;
                  case 1294244980:
                     break label80;
               }
            }
         }
      } else {
         label74:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
               case 143934258:
                  break;
               case 215341023:
                  var56 ^= 561662160;
                  break label74;
               case 526210597:
               default:
                  throw new RuntimeException();
               case 1406265809:
                  break label74;
            }
         }
      }

      if (var0 == null) {
         var56 = 33006702 ^ var56;
         String var39 = xuseqiuesi(iasheugcmdybnzk(), ypjeyywugxovvqp(), var56);
         var56 = 1570244099 ^ var56;
         return var39;
      } else {
         label66:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
               case 18275254:
                  var56 ^= 1679658222;
                  break label66;
               case 743837112:
               default:
                  throw new RuntimeException();
               case 1156239265:
                  break;
               case 2121248613:
                  break label66;
            }
         }

         var56 = 947007107 ^ var56;
         return var0;
      }
   }

   static {
      int var128 = 1094989637 ^ 1262327314 ^ Integer.parseInt("725418859");
      int var125 = new Random(-3408625020514158144L).nextInt();
      YTNzgy5g6c = -1405562247 ^ var125;
      var128 = 893860149 ^ var128;
      byte var0 = (byte)(335780634 ^ var128);
      String[] var4 = new String[var0];
      byte var1 = (byte)(335780617 ^ var128);
      String var2 = xuseqiuesi(rblwonntfcwrnmg(), ypjeyywugxovvqp(), var128);
      var4[var1] = var2;
      byte var12 = (byte)(335780616 ^ var128);
      String var49 = xuseqiuesi(ogsjgbgoyjswdzv(), ypjeyywugxovvqp(), var128);
      var4[var12] = var49;
      byte var13 = (byte)(335780619 ^ var128);
      String var50 = xuseqiuesi(kbawsoyniiqwghv(), ypjeyywugxovvqp(), var128);
      var4[var13] = var50;
      byte var14 = (byte)(335780618 ^ var128);
      String var51 = xuseqiuesi(dbfkqqklefybcte(), ypjeyywugxovvqp(), var128);
      var4[var14] = var51;
      byte var15 = (byte)(335780621 ^ var128);
      String var52 = xuseqiuesi(sitdhmazwwmoqcx(), ypjeyywugxovvqp(), var128);
      var4[var15] = var52;
      byte var16 = (byte)(335780620 ^ var128);
      String var53 = xuseqiuesi(ksihoyvsnheumll(), ypjeyywugxovvqp(), var128);
      var4[var16] = var53;
      byte var17 = (byte)(335780623 ^ var128);
      String var54 = xuseqiuesi(pgccpydzlzqdxoe(), ypjeyywugxovvqp(), var128);
      var4[var17] = var54;
      byte var18 = (byte)(335780622 ^ var128);
      String var55 = xuseqiuesi(knicbumdzcvmbft(), ypjeyywugxovvqp(), var128);
      var4[var18] = var55;
      byte var19 = (byte)(335780609 ^ var128);
      String var56 = xuseqiuesi(yummpahwpfmouzk(), ypjeyywugxovvqp(), var128);
      var4[var19] = var56;
      byte var20 = (byte)(335780608 ^ var128);
      String var57 = xuseqiuesi(xfjsfxciyxzeboh(), ypjeyywugxovvqp(), var128);
      var4[var20] = var57;
      byte var21 = (byte)(335780611 ^ var128);
      String var58 = xuseqiuesi(eaedszdkqqsoirw(), ypjeyywugxovvqp(), var128);
      var4[var21] = var58;
      byte var22 = (byte)(335780610 ^ var128);
      String var59 = xuseqiuesi(botgnhjrsqcolmz(), ypjeyywugxovvqp(), var128);
      var4[var22] = var59;
      byte var23 = (byte)(335780613 ^ var128);
      String var60 = xuseqiuesi(tfsmomaxczyhled(), ypjeyywugxovvqp(), var128);
      var4[var23] = var60;
      byte var24 = (byte)(335780612 ^ var128);
      String var61 = xuseqiuesi(ukircmeutoreqlg(), ypjeyywugxovvqp(), var128);
      var4[var24] = var61;
      byte var25 = (byte)(335780615 ^ var128);
      String var62 = xuseqiuesi(fhfuijsnzgqijjz(), ypjeyywugxovvqp(), var128);
      var4[var25] = var62;
      byte var26 = (byte)(335780614 ^ var128);
      String var63 = xuseqiuesi(kzvgsqemyydwyle(), ypjeyywugxovvqp(), var128);
      var4[var26] = var63;
      byte var27 = (byte)(335780633 ^ var128);
      String var64 = xuseqiuesi(ijkiwfvutueiazi(), ypjeyywugxovvqp(), var128);
      var4[var27] = var64;
      byte var28 = (byte)(335780632 ^ var128);
      String var65 = xuseqiuesi(kbelxmsugbjftfp(), ypjeyywugxovvqp(), var128);
      var4[var28] = var65;
      byte var29 = (byte)(335780635 ^ var128);
      String var66 = xuseqiuesi(dbeujkcozqjnepa(), ypjeyywugxovvqp(), var128);
      var4[var29] = var66;
      List var5 = List.of(var4);
      DEFAULT_RANK_KEYWORDS = var5;
      String var6 = xuseqiuesi(tglowjeoxnsiqfm(), ypjeyywugxovvqp(), var128);
      List var11 = DEFAULT_RANK_KEYWORDS;
      String var7 = String.join(var6, var11);
      DEFAULT_RANK_KEYWORDS_STRING = var7;
      byte var8 = (byte)(335780634 ^ var128);
      Entry[] var9 = new Entry[var8];
      byte var30 = (byte)(335780617 ^ var128);
      String var67 = xuseqiuesi(iodzjbyxlosjdsv(), ypjeyywugxovvqp(), var128);
      String var3 = xuseqiuesi(chhsivxhmcowwan(), ypjeyywugxovvqp(), var128);
      Entry var68 = Map.entry(var67, var3);
      var9[var30] = var68;
      byte var31 = (byte)(335780616 ^ var128);
      String var69 = xuseqiuesi(bdpiokpzibrtfcp(), ypjeyywugxovvqp(), var128);
      String var105 = xuseqiuesi(ohhjkwznsssgdhp(), ypjeyywugxovvqp(), var128);
      Entry var70 = Map.entry(var69, var105);
      var9[var31] = var70;
      byte var32 = (byte)(335780619 ^ var128);
      String var71 = xuseqiuesi(szfpjnyjdstckxz(), ypjeyywugxovvqp(), var128);
      String var106 = xuseqiuesi(gxzjfaleabnfuyz(), ypjeyywugxovvqp(), var128);
      Entry var72 = Map.entry(var71, var106);
      var9[var32] = var72;
      byte var33 = (byte)(335780618 ^ var128);
      String var73 = xuseqiuesi(aoxlcqymkrlpwzn(), ypjeyywugxovvqp(), var128);
      String var107 = xuseqiuesi(sqruxfufbhjrtci(), ypjeyywugxovvqp(), var128);
      Entry var74 = Map.entry(var73, var107);
      var9[var33] = var74;
      byte var34 = (byte)(335780621 ^ var128);
      String var75 = xuseqiuesi(wufafivhbjqrzjv(), ypjeyywugxovvqp(), var128);
      String var108 = xuseqiuesi(xdpskvlzgynoywu(), ypjeyywugxovvqp(), var128);
      Entry var76 = Map.entry(var75, var108);
      var9[var34] = var76;
      byte var35 = (byte)(335780620 ^ var128);
      String var77 = xuseqiuesi(hhciucfryvibsvk(), ypjeyywugxovvqp(), var128);
      String var109 = xuseqiuesi(bmqoyaknsgwshhn(), ypjeyywugxovvqp(), var128);
      Entry var78 = Map.entry(var77, var109);
      var9[var35] = var78;
      byte var36 = (byte)(335780623 ^ var128);
      String var79 = xuseqiuesi(svhnpzhufspeubt(), ypjeyywugxovvqp(), var128);
      String var110 = xuseqiuesi(odiwiffhnzgxcec(), ypjeyywugxovvqp(), var128);
      Entry var80 = Map.entry(var79, var110);
      var9[var36] = var80;
      byte var37 = (byte)(335780622 ^ var128);
      String var81 = xuseqiuesi(icssoczchdaoyvq(), ypjeyywugxovvqp(), var128);
      String var111 = xuseqiuesi(xsrdguxyjtoakkq(), ypjeyywugxovvqp(), var128);
      Entry var82 = Map.entry(var81, var111);
      var9[var37] = var82;
      byte var38 = (byte)(335780609 ^ var128);
      String var83 = xuseqiuesi(idilaqpebflciba(), ypjeyywugxovvqp(), var128);
      String var112 = xuseqiuesi(jcqsifogxirfqvq(), ypjeyywugxovvqp(), var128);
      Entry var84 = Map.entry(var83, var112);
      var9[var38] = var84;
      byte var39 = (byte)(335780608 ^ var128);
      String var85 = xuseqiuesi(lsqxcqfakvmtkdw(), ypjeyywugxovvqp(), var128);
      String var113 = xuseqiuesi(jcxublmpusjhzwk(), ypjeyywugxovvqp(), var128);
      Entry var86 = Map.entry(var85, var113);
      var9[var39] = var86;
      byte var40 = (byte)(335780611 ^ var128);
      String var87 = xuseqiuesi(eqszilujhyvuwqw(), ypjeyywugxovvqp(), var128);
      String var114 = xuseqiuesi(ithevopvgsuvroj(), ypjeyywugxovvqp(), var128);
      Entry var88 = Map.entry(var87, var114);
      var9[var40] = var88;
      byte var41 = (byte)(335780610 ^ var128);
      String var89 = xuseqiuesi(wcnlubwprpiwpak(), ypjeyywugxovvqp(), var128);
      String var115 = xuseqiuesi(ctoaskbqtmbkgfp(), ypjeyywugxovvqp(), var128);
      Entry var90 = Map.entry(var89, var115);
      var9[var41] = var90;
      byte var42 = (byte)(335780613 ^ var128);
      String var91 = xuseqiuesi(pblhvfmeiaushdj(), ypjeyywugxovvqp(), var128);
      String var116 = xuseqiuesi(bvsnlbabcugehki(), ypjeyywugxovvqp(), var128);
      Entry var92 = Map.entry(var91, var116);
      var9[var42] = var92;
      byte var43 = (byte)(335780612 ^ var128);
      String var93 = xuseqiuesi(homooeutwncnjsh(), ypjeyywugxovvqp(), var128);
      String var117 = xuseqiuesi(jfhnwdxwcdskbbj(), ypjeyywugxovvqp(), var128);
      Entry var94 = Map.entry(var93, var117);
      var9[var43] = var94;
      byte var44 = (byte)(335780615 ^ var128);
      String var95 = xuseqiuesi(jfdsdnujbasumpe(), ypjeyywugxovvqp(), var128);
      String var118 = xuseqiuesi(olbdamlwuuisdsi(), ypjeyywugxovvqp(), var128);
      Entry var96 = Map.entry(var95, var118);
      var9[var44] = var96;
      byte var45 = (byte)(335780614 ^ var128);
      String var97 = xuseqiuesi(snzrrkeihxindfm(), ypjeyywugxovvqp(), var128);
      String var119 = xuseqiuesi(hopirkocjryicxx(), ypjeyywugxovvqp(), var128);
      Entry var98 = Map.entry(var97, var119);
      var9[var45] = var98;
      byte var46 = (byte)(335780633 ^ var128);
      String var99 = xuseqiuesi(mwjwhumgtzqdmdg(), ypjeyywugxovvqp(), var128);
      String var120 = xuseqiuesi(yxzghzxiwfjwhwr(), ypjeyywugxovvqp(), var128);
      Entry var100 = Map.entry(var99, var120);
      var9[var46] = var100;
      byte var47 = (byte)(335780632 ^ var128);
      String var101 = xuseqiuesi(rsfgrlbmbmslktl(), ypjeyywugxovvqp(), var128);
      String var121 = xuseqiuesi(chwyycljnbdholj(), ypjeyywugxovvqp(), var128);
      Entry var102 = Map.entry(var101, var121);
      var9[var47] = var102;
      byte var48 = (byte)(335780635 ^ var128);
      String var103 = xuseqiuesi(kdimaslihiqlnqn(), ypjeyywugxovvqp(), var128);
      String var122 = xuseqiuesi(ccrcmxjpoussgoy(), ypjeyywugxovvqp(), var128);
      Entry var104 = Map.entry(var103, var122);
      var9[var48] = var104;
      Map var10 = Map.ofEntries(var9);
      RANK_LABELS = var10;
   }

   public static String xuseqiuesi(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] ypjeyywugxovvqp() {
      return new byte[]{
         111,
         6,
         6,
         39,
         62,
         59,
         84,
         9,
         66,
         122,
         16,
         45,
         55,
         108,
         22,
         35,
         62,
         55,
         11,
         85,
         98,
         3,
         18,
         106,
         104,
         73,
         85,
         73,
         92,
         116,
         20,
         43,
         39,
         64,
         39,
         119,
         79,
         55,
         54,
         123,
         70,
         99,
         45,
         6,
         105,
         123,
         58,
         11,
         8,
         111,
         30,
         70,
         10,
         22,
         18,
         76,
         92,
         38,
         30,
         35,
         48,
         35,
         25,
         126,
         21,
         110,
         78,
         121,
         56,
         126,
         127,
         79,
         85,
         12,
         113,
         89,
         42
      };
   }

   private static byte[] rblwonntfcwrnmg() {
      return new byte[]{-94, -54, 51, 115, 6, 100, 98, 87, 117, 62, 35, 118, 0, 49, 38, 103};
   }

   private static byte[] ogsjgbgoyjswdzv() {
      return new byte[]{-94, -54, 51, 127, 6, 124, 98, 86, 117, 44, 35, 106};
   }

   private static byte[] kbawsoyniiqwghv() {
      return new byte[]{-94, -54, 51, 125, 6, 106, 98, 86, 117, 40, 35, 127, 0, 49, 38, 103};
   }

   private static byte[] dbfkqqklefybcte() {
      return new byte[]{-94, -54, 51, 113, 6, 111, 98, 85, 117, 32, 35, 118, 0, 61, 38, 102, 15, 116, 56, 20, 87, 85, 42, 46, 94, 23, 98, 8};
   }

   private static byte[] sitdhmazwwmoqcx() {
      return new byte[]{-94, -54, 51, 113, 6, 111, 98, 85, 117, 32, 35, 118};
   }

   private static byte[] ksihoyvsnheumll() {
      return new byte[]{-94, -54, 51, 116, 6, 110, 98, 78, 117, 44, 35, 116, 0, 59, 38, 101, 15, 101, 56, 20};
   }

   private static byte[] pgccpydzlzqdxoe() {
      return new byte[]{-94, -54, 51, 116, 6, 110, 98, 78};
   }

   private static byte[] knicbumdzcvmbft() {
      return new byte[]{-94, -54, 51, 99, 6, 121, 98, 85, 117, 38, 35, 124};
   }

   private static byte[] yummpahwpfmouzk() {
      return new byte[]{-94, -54, 51, 99, 6, 110, 98, 86, 117, 32, 35, 119, 0, 38, 38, 120, 15, 111, 56, 2};
   }

   private static byte[] xfjsfxciyxzeboh() {
      return new byte[]{-94, -54, 51, 125, 6, 100, 98, 92, 117, 44, 35, 106, 0, 53, 38, 97, 15, 111, 56, 20};
   }

   private static byte[] eaedszdkqqsoirw() {
      return new byte[]{-94, -54, 51, 125, 6, 100, 98, 92};
   }

   private static byte[] botgnhjrsqcolmz() {
      return new byte[]{-94, -54, 51, 99, 6, 121, 98, 80, 117, 44, 35, 116, 0, 36, 38, 112, 15, 114};
   }

   private static byte[] tfsmomaxczyhled() {
      return new byte[]{-94, -54, 51, 99, 6, 110, 98, 86, 117, 32, 35, 119, 0, 38, 38, 125, 15, 101, 56, 10, 87, 68, 42, 63, 94, 10};
   }

   private static byte[] ukircmeutoreqlg() {
      return new byte[]{-94, -54, 51, 120, 6, 110, 98, 84, 117, 57, 35, 125, 0, 38};
   }

   private static byte[] fhfuijsnzgqijjz() {
      return new byte[]{-94, -54, 51, 100, 6, 121, 98, 81, 117, 40, 35, 116, 0, 57, 38, 122, 15, 100};
   }

   private static byte[] kzvgsqemyydwyle() {
      return new byte[]{-94, -54, 51, 100, 6, 121, 98, 81, 117, 40, 35, 116};
   }

   private static byte[] ijkiwfvutueiazi() {
      return new byte[]{-94, -54, 51, 114, 6, 126, 98, 81, 117, 37, 35, 124, 0, 49, 38, 103};
   }

   private static byte[] kbelxmsugbjftfp() {
      return new byte[]{-94, -54, 51, 99, 6, 126, 98, 72, 117, 57, 35, 119, 0, 38, 38, 97};
   }

   private static byte[] dbeujkcozqjnepa() {
      return new byte[]{-94, -54, 51, 99, 6, 127, 98, 89, 117, 47, 35, 126};
   }

   private static byte[] tglowjeoxnsiqfm() {
      return new byte[]{-94, -54, 51, 60, 6, 43};
   }

   private static byte[] iodzjbyxlosjdsv() {
      return new byte[]{-94, -54, 51, 115, 6, 100, 98, 87, 117, 62, 35, 118, 0, 49, 38, 103};
   }

   private static byte[] chhsivxhmcowwan() {
      return new byte[]{-94, -54, 51, 83, 6, 100, 98, 21, 117, 6, 35, 111, 0, 58, 38, 112, 15, 114};
   }

   private static byte[] bdpiokpzibrtfcp() {
      return new byte[]{-94, -54, 51, 127, 6, 124, 98, 86, 117, 44, 35, 106};
   }

   private static byte[] ohhjkwznsssgdhp() {
      return new byte[]{-94, -54, 51, 95, 6, 124, 98, 86, 117, 44, 35, 106};
   }

   private static byte[] szfpjnyjdstckxz() {
      return new byte[]{-94, -54, 51, 125, 6, 106, 98, 86, 117, 40, 35, 127, 0, 49, 38, 103};
   }

   private static byte[] gxzjfaleabnfuyz() {
      return new byte[]{-94, -54, 51, 93, 6, 106, 98, 86, 117, 40, 35, 127, 0, 49, 38, 103};
   }

   private static byte[] aoxlcqymkrlpwzn() {
      return new byte[]{-94, -54, 51, 113, 6, 111, 98, 85, 117, 32, 35, 118, 0, 61, 38, 102, 15, 116, 56, 20, 87, 85, 42, 46, 94, 23, 98, 8};
   }

   private static byte[] sqruxfufbhjrtci() {
      return new byte[]{-94, -54, 51, 81, 6, 111, 98, 85, 117, 32, 35, 118};
   }

   private static byte[] wufafivhbjqrzjv() {
      return new byte[]{-94, -54, 51, 113, 6, 111, 98, 85, 117, 32, 35, 118};
   }

   private static byte[] xdpskvlzgynoywu() {
      return new byte[]{-94, -54, 51, 81, 6, 111, 98, 85, 117, 32, 35, 118};
   }

   private static byte[] hhciucfryvibsvk() {
      return new byte[]{-94, -54, 51, 116, 6, 110, 98, 78, 117, 44, 35, 116, 0, 59, 38, 101, 15, 101, 56, 20};
   }

   private static byte[] bmqoyaknsgwshhn() {
      return new byte[]{-94, -54, 51, 84, 6, 110, 98, 78};
   }

   private static byte[] svhnpzhufspeubt() {
      return new byte[]{-94, -54, 51, 116, 6, 110, 98, 78};
   }

   private static byte[] odiwiffhnzgxcec() {
      return new byte[]{-94, -54, 51, 84, 6, 110, 98, 78};
   }

   private static byte[] icssoczchdaoyvq() {
      return new byte[]{-94, -54, 51, 99, 6, 121, 98, 85, 117, 38, 35, 124};
   }

   private static byte[] xsrdguxyjtoakkq() {
      return new byte[]{-94, -54, 51, 67, 6, 121, 98, 22, 117, 4, 35, 119, 0, 48};
   }

   private static byte[] idilaqpebflciba() {
      return new byte[]{-94, -54, 51, 99, 6, 110, 98, 86, 117, 32, 35, 119, 0, 38, 38, 120, 15, 111, 56, 2};
   }

   private static byte[] jcqsifogxirfqvq() {
      return new byte[]{-94, -54, 51, 67, 6, 121, 98, 22, 117, 4, 35, 119, 0, 48};
   }

   private static byte[] lsqxcqfakvmtkdw() {
      return new byte[]{-94, -54, 51, 125, 6, 100, 98, 92, 117, 44, 35, 106, 0, 53, 38, 97, 15, 111, 56, 20};
   }

   private static byte[] jcxublmpusjhzwk() {
      return new byte[]{-94, -54, 51, 93, 6, 100, 98, 92};
   }

   private static byte[] eqszilujhyvuwqw() {
      return new byte[]{-94, -54, 51, 125, 6, 100, 98, 92};
   }

   private static byte[] ithevopvgsuvroj() {
      return new byte[]{-94, -54, 51, 93, 6, 100, 98, 92};
   }

   private static byte[] wcnlubwprpiwpak() {
      return new byte[]{-94, -54, 51, 99, 6, 121, 98, 80, 117, 44, 35, 116, 0, 36, 38, 112, 15, 114};
   }

   private static byte[] ctoaskbqtmbkgfp() {
      return new byte[]{-94, -54, 51, 67, 6, 121, 98, 22, 117, 1, 35, 125, 0, 56, 38, 101, 15, 101, 56, 20};
   }

   private static byte[] pblhvfmeiaushdj() {
      return new byte[]{-94, -54, 51, 99, 6, 110, 98, 86, 117, 32, 35, 119, 0, 38, 38, 125, 15, 101, 56, 10, 87, 68, 42, 63, 94, 10};
   }

   private static byte[] bvsnlbabcugehki() {
      return new byte[]{-94, -54, 51, 67, 6, 121, 98, 22, 117, 1, 35, 125, 0, 56, 38, 101, 15, 101, 56, 20};
   }

   private static byte[] homooeutwncnjsh() {
      return new byte[]{-94, -54, 51, 120, 6, 110, 98, 84, 117, 57, 35, 125, 0, 38};
   }

   private static byte[] jfhnwdxwcdskbbj() {
      return new byte[]{-94, -54, 51, 88, 6, 110, 98, 84, 117, 57, 35, 125, 0, 38};
   }

   private static byte[] jfdsdnujbasumpe() {
      return new byte[]{-94, -54, 51, 100, 6, 121, 98, 81, 117, 40, 35, 116, 0, 57, 38, 122, 15, 100};
   }

   private static byte[] olbdamlwuuisdsi() {
      return new byte[]{-94, -54, 51, 68, 6, 121, 98, 81, 117, 40, 35, 116};
   }

   private static byte[] snzrrkeihxindfm() {
      return new byte[]{-94, -54, 51, 100, 6, 121, 98, 81, 117, 40, 35, 116};
   }

   private static byte[] hopirkocjryicxx() {
      return new byte[]{-94, -54, 51, 68, 6, 121, 98, 81, 117, 40, 35, 116};
   }

   private static byte[] mwjwhumgtzqdmdg() {
      return new byte[]{-94, -54, 51, 114, 6, 126, 98, 81, 117, 37, 35, 124, 0, 49, 38, 103};
   }

   private static byte[] yxzghzxiwfjwhwr() {
      return new byte[]{-94, -54, 51, 82, 6, 126, 98, 81, 117, 37, 35, 124, 0, 49, 38, 103};
   }

   private static byte[] rsfgrlbmbmslktl() {
      return new byte[]{-94, -54, 51, 99, 6, 126, 98, 72, 117, 57, 35, 119, 0, 38, 38, 97};
   }

   private static byte[] chwyycljnbdholj() {
      return new byte[]{-94, -54, 51, 67, 6, 126, 98, 72, 117, 57, 35, 119, 0, 38, 38, 97};
   }

   private static byte[] kdimaslihiqlnqn() {
      return new byte[]{-94, -54, 51, 99, 6, 127, 98, 89, 117, 47, 35, 126};
   }

   private static byte[] ccrcmxjpoussgoy() {
      return new byte[]{-94, -54, 51, 67, 6, 127, 98, 89, 117, 47, 35, 126};
   }

   private static byte[] wrewrfrnjkirjuf() {
      return new byte[]{-96, -49, 49, 67, 14, 107, 96, 86, 117, 33, 33, 59, 0, 21, 38, 124, 10, 106, 60, 28};
   }

   private static byte[] fuyvxpzwlgpulvk() {
      return new byte[0];
   }

   private static byte[] qoiowhhecphhilv() {
      return new byte[]{-90, -53, 53, 64, 6, 123, 98, 95, 113, 63, 34, 62, 3, 27, 34, 123, 9, 104, 60, 30};
   }

   private static byte[] sirbpsffhgibedv() {
      return new byte[0];
   }

   private static byte[] xsnqscsorhwiwto() {
      return new byte[]{-96, -55, 49, 93, 15, 109, 101, 82, 115, 43, 33, 110, 0, 120, 39, 91, 15, 111, 58, 13, 83, 74};
   }

   private static byte[] eqanoydmskdbfei() {
      return new byte[]{-88, -52, 50, 70, 10, 119, 100, 90, 123, 41, 36, 121};
   }

   private static byte[] pvvlqswhirkwlmp() {
      return new byte[0];
   }

   private static byte[] iasheugcmdybnzk() {
      return new byte[0];
   }

   private static int notgpjaufqsnywsz(int var0, int var1) {
      return var1 ^ var0;
   }
}
