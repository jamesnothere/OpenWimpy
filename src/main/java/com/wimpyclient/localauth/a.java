package com.wimpyclient.localauth;

import ivirzlaazbgesszx.equlxktebzrxiyte;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class a {
   private final String text;
   private int position;
   private static int kWfQ6BoQeo;
   private transient int p8GVInbc5C;
   private static byte[] ijyelwpmpn = ljbilbouaqdwpyz();

   private a(String var1) {
super();
      int var7 = 2142225077 ^ 1711122008;
      
      var7 = 4257177 ^ var7;
      var7 = 866866969 ^ 1775828686 ^ Integer.parseInt("1080113315");
      this.p8GVInbc5C = 1238637747 ^ kWfQ6BoQeo;
      var7 = 1542167558 ^ var7;
      this.text = var1;
   }

   public static Map<String, Object> object(String var0) {
      int var17 = 1266109200 ^ 420921100 ^ 139333021;
      var17 = 872208370 ^ var17;
      a var1 = new a(var0);
      Map var6 = var1.readObject();
      var1.skipWhitespace();
      int var9 = var1.position;
      int var14 = var0.length();
      if (var9 != var14) {
         var17 = 1755025794 ^ var17;
         IllegalArgumentException var11 = var1.invalid();
         throw new RuntimeException(var11);
      } else {
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var17)) {
               case 123182197:
                  break;
               case 218710061:
                  var17 = 292973961 ^ var17;
               case 1501141058:
                  return var6;
               case 1727413481:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   public static String quote(String var0) {
      int var55 = 1494637203 ^ 1184426698 ^ 139333021;
      var55 = 1306180920 ^ var55;
      String var2 = qlpqxyzzhp(dfcczjnkmenugxq(), var55);
      StringBuilder var1 = new StringBuilder(var2);
      StringBuilder var5 = var1;
      byte var8 = 0;
      int var6 = var8;
      var55 = 362008639 ^ var55;

      label93:
      while (true) {
         int var36 = var0.length();
         if (var6 >= var36) {
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var55)) {
                  case 169561072:
                     var55 = 1745178660 ^ var55;
                     break label93;
                  case 645667722:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1104057930:
                     break label93;
                  case 2072039670:
               }
            }
         }

         var55 = 1936001040 ^ var55;
         char var11 = var0.charAt(var6);

         var55 = switch (var11) {
            case '\b' -> {
               var55 = 708672686 ^ var55;
               String var46 = qlpqxyzzhp(koxyylvqrljnzkh(), var55);
               StringBuilder var27 = var5.append(var46);

               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var55)) {
                     case 204879971:
                        yield 1767113119;
                     case 819311778:
                        break;
                     case 1196232886:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1535982457:
                  }
               }
            }
            case '\t' -> {
               var55 = wyiwbtzulukkzrmg(var55, 1560264133);
               String var47 = qlpqxyzzhp(hyhtsmtfphiphuc(), var55);
               StringBuilder var29 = var5.append(var47);

               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var55)) {
                     case 89114007:
                     default:
                        throw new RuntimeException(new IOException());
                     case 170259401:
                        yield 529973492;
                     case 437244713:
                        break;
                     case 1493865628:
                  }
               }
            }
            case '\n' -> {
               var55 = 2143554184 ^ var55;
               String var43 = qlpqxyzzhp(bnpdmxcuocwnylz(), var55);
               StringBuilder var21 = var5.append(var43);

               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var55)) {
                     case 35607736:
                        yield 1018001337;
                     case 834698225:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1142072983:
                     case 1297866684:
                  }
               }
            }
            case '\f' -> {
               var55 = 396085247 ^ var55;
               String var48 = qlpqxyzzhp(qnzlfatsaxbvwnt(), var55);
               StringBuilder var31 = var5.append(var48);
               yield 1425193678 ^ var55;
            }
            case '\r' -> {
               var55 = 885553384 ^ var55;
               String var38 = qlpqxyzzhp(muqukzlcewrugbi(), var55);
               StringBuilder var14 = var5.append(var38);

               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var55)) {
                     case 128081427:
                        yield 2007041497;
                     case 544293560:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1498004251:
                        break;
                     case 1581495607:
                  }
               }
            }
            case '"' -> {
               var55 = wyiwbtzulukkzrmg(var55, 1563464412);
               String var44 = qlpqxyzzhp(fvxjjxgregtotmh(), var55);
               StringBuilder var23 = var5.append(var44);
               yield wyiwbtzulukkzrmg(var55, 509210605);
            }
            case '\\' -> {
               label51:
               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var55)) {
                     case 101374196:
                        var55 ^= 1606066557;
                        break label51;
                     case 1013403723:
                        break;
                     case 1551807945:
                        break label51;
                     case 1649497236:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }

               String var45 = qlpqxyzzhp(tmxwhpaquddqalv(), var55);
               StringBuilder var25 = var5.append(var45);
               yield 483646540 ^ var55;
            }
            default -> {
               label44:
               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var55)) {
                     case 101374196:
                        var55 ^= 45223445;
                        break label44;
                     case 189864039:
                        break;
                     case 766985985:
                        break label44;
                     case 1142001724:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }

               byte var39 = 32;
               if (var11 < var39) {
                  var55 = 985222648 ^ var55;
                  String var40 = qlpqxyzzhp(caygxlklenycvma(), var55);
                  byte var50 = 1;
                  Object[] var51 = new Object[var50];
                  byte var3 = 0;
                  Integer var52 = Integer.valueOf(var11);
                  var51[var3] = var52;
                  String var41 = String.format(var40, var51);
                  StringBuilder var17 = var5.append(var41);
                  yield wyiwbtzulukkzrmg(var55, 2070036188);
               } else {
                  var55 = 968504821 ^ var55;
                  StringBuilder var19 = var5.append(var11);
                  yield 2019641041 ^ var55;
               }
            }
         };
         var6++;
         var55 = 806122785 ^ var55;
      }

      byte var49 = 34;
      StringBuilder var33 = var5.append((char)var49);
      return var33.toString();
   }

   private Map<String, Object> readObject() {
      int var32 = 447809872 ^ 1362765384 ^ 1100615982;
      var32 = 636336112 ^ var32;
      byte var2 = 123;
      this.expect((char)var2);
      LinkedHashMap var6 = new LinkedHashMap();
      LinkedHashMap var4 = var6;
      byte var23 = 125;
      boolean var8 = this.accept((char)var23);
      if (var8) {
         var32 = 1006802205 ^ var32;
         return var6;
      } else {
         var32 = wyiwbtzulukkzrmg(var32, 1107644598);

         label38:
         while (true) {
            String var10 = this.readString();
            byte var24 = 58;
            this.expect((char)var24);
            boolean var13 = var4.containsKey(var10);
            if (var13) {
               var32 = 94696216 ^ var32;
               IllegalArgumentException var15 = this.invalid();
               throw new RuntimeException(var15);
            }

            label35:
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var32)) {
                  case 85227696:
                     var32 ^= 1967924317;
                     break label35;
                  case 349043503:
                     break;
                  case 1220190369:
                  default:
                     throw new RuntimeException();
                  case 1506879691:
                     break label35;
               }
            }

            Object var29 = this.readValue();
            Object var17 = var4.put(var10, var29);
            byte var27 = 44;
            boolean var19 = this.accept((char)var27);
            if (!var19) {
               var32 = 191593658 ^ var32;
               byte var28 = 125;
               this.expect((char)var28);
               return var4;
            }

            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var32)) {
                  case 8850747:
                  default:
                     throw new RuntimeException();
                  case 266371634:
                     var32 ^= 1967924317;
                     continue label38;
                  case 918610956:
                     break;
                  case 923622957:
                     continue label38;
               }
            }
         }
      }
   }

   private Object readValue() {
      int var119 = 1675488186 ^ 1137407790 ^ 1100615982;
      var119 = 1581807179 ^ var119;
      this.skipWhitespace();
      int var11 = this.position;
      String var69 = this.text;
      int var70 = var69.length();
      if (var11 >= var70) {
         var119 = 1950069547 ^ var119;
         IllegalArgumentException var67 = this.invalid();
         throw new RuntimeException(var67);
      } else {
         label170:
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var119)) {
               case 193828838:
                  var119 ^= 834806841;
               case 1002930488:
                  String var13 = this.text;
                  int var72 = this.position;
                  char var14 = var13.charAt(var72);
                  byte var73 = 34;
                  if (var14 == var73) {
                     var119 = 1971060046 ^ var119;
                     return this.readString();
                  }

                  label167:
                  while (true) {
                     switch (equlxktebzrxiyte.tpabobqnolkrvwps(var119)) {
                        case 187522965:
                           var119 ^= 696042224;
                           break label167;
                        case 270043325:
                        default:
                           throw new RuntimeException(new IOException());
                        case 650582528:
                           break;
                        case 1936564965:
                           break label167;
                     }
                  }

                  byte var74 = 123;
                  if (var14 == var74) {
                     var119 = 1163002574 ^ var119;
                     return this.readObject();
                  }

                  label159:
                  while (true) {
                     switch (equlxktebzrxiyte.tpabobqnolkrvwps(var119)) {
                        case 209502182:
                           var119 ^= 189546404;
                           break label159;
                        case 1123007269:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1802087188:
                           break label159;
                        case 1996231441:
                     }
                  }

                  byte var19 = 3;
                  String[] var20 = new String[var19];
                  byte var3 = 0;
                  String var4 = qlpqxyzzhp(ihzubnezsjnmkaf(), var119);
                  var20[var3] = var4;
                  byte var102 = 1;
                  String var113 = qlpqxyzzhp(fawwnbmkraztool(), var119);
                  var20[var102] = var113;
                  byte var103 = 2;
                  String var114 = qlpqxyzzhp(pokuevmhorbfvia(), var119);
                  var20[var103] = var114;
                  String[] var6 = var20;
                  int var22 = var20.length;
                  int var7 = var22;
                  byte var23 = 0;
                  int var8 = var23;
                  var119 = 1101050330 ^ var119;

                  label152:
                  while (var8 < var7) {
                     var119 = 1140297715 ^ var119;
                     String var56 = var6[var8];
                     String var58 = this.text;
                     int var110 = this.position;
                     boolean var59 = var58.startsWith(var56, var110);
                     if (var59) {
                        var119 = 675800372 ^ var119;
                        int var99 = this.position;
                        int var112 = var56.length();
                        int var100 = var99 + var112;
                        this.position = var100;
                        String var101 = qlpqxyzzhp(hpdcgficcgnueyq(), var119);
                        boolean var62 = var56.equals(var101);
                        if (!var62) {
                           var119 = 392983122 ^ var119;
                           Boolean var140 = Boolean.valueOf(var56);
                           var119 = 1926875070 ^ var119;
                           return var140;
                        }

                        var119 = 1090886482 ^ var119;
                        Object var68 = null;

                        while (true) {
                           switch (equlxktebzrxiyte.tpabobqnolkrvwps(var119)) {
                              case 51984007:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 164939867:
                                 var119 = 615526078 ^ var119;
                                 return var68;
                              case 458330728:
                                 return var68;
                              case 1303540130:
                           }
                        }
                     }

                     var119 = wyiwbtzulukkzrmg(var119, 1306380725);
                     var8++;

                     while (true) {
                        switch (equlxktebzrxiyte.tpabobqnolkrvwps(var119)) {
                           case 10623535:
                           default:
                              throw new RuntimeException(new IOException());
                           case 20823820:
                              var119 ^= 237651526;
                              continue label152;
                           case 649750968:
                              break;
                           case 1426180439:
                              continue label152;
                        }
                     }
                  }

                  label137:
                  while (true) {
                     switch (equlxktebzrxiyte.tpabobqnolkrvwps(var119)) {
                        case 72601793:
                           var119 ^= 1342314757;
                           break label137;
                        case 1391750372:
                           break;
                        case 1413667311:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1981798342:
                           break label137;
                     }
                  }

                  int var26 = this.position;
                  int var115 = var26;
                  byte var76 = 45;
                  if (var14 == var76) {
                     var119 = 1049170616 ^ var119;
                     int var77 = this.position;
                     byte var104 = 1;
                     int var78 = var77 + var104;
                     this.position = var78;
                     var119 = 1232740065 ^ var119;
                  } else {
                     label129:
                     while (true) {
                        switch (equlxktebzrxiyte.tpabobqnolkrvwps(var119)) {
                           case 122680949:
                              var119 ^= 2012417113;
                              break label129;
                           case 1074313030:
                              break;
                           case 1462074497:
                              break label129;
                           case 2090095015:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }

                  int var30 = this.position;
                  String var80 = this.text;
                  int var81 = var80.length();
                  if (var30 < var81) {
                     var119 = 1823729031 ^ var119;
                     String var32 = this.text;
                     int var83 = this.position;
                     char var33 = var32.charAt(var83);
                     boolean var34 = Character.isDigit(var33);
                     if (!var34) {
                        var119 = 412949424 ^ var119;
                        break label170;
                     }

                     var119 = 1287662127 ^ var119;
                     String var36 = this.text;
                     int var85 = this.position;
                     char var37 = var36.charAt(var85);
                     byte var86 = 48;
                     if (var37 == var86) {
                        var119 = 431096513 ^ var119;
                        int var87 = this.position;
                        byte var105 = 1;
                        int var88 = var87 + var105;
                        this.position = var88;

                        label90:
                        while (true) {
                           switch (equlxktebzrxiyte.tpabobqnolkrvwps(var119)) {
                              case 1196424:
                                 var119 ^= 1708277628;
                                 break label90;
                              case 706069260:
                                 break;
                              case 880541973:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1148257888:
                                 break label90;
                           }
                        }
                     } else {
                        label103:
                        while (true) {
                           switch (equlxktebzrxiyte.tpabobqnolkrvwps(var119)) {
                              case 226960604:
                                 var119 ^= 1875201689;
                                 break label103;
                              case 610938874:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 630538612:
                                 break;
                              case 1537477889:
                                 break label103;
                           }
                        }

                        label109:
                        while (true) {
                           int var47 = this.position;
                           String var91 = this.text;
                           int var92 = var91.length();
                           if (var47 >= var92) {
                              var119 = wyiwbtzulukkzrmg(var119, 329610020);
                              break;
                           }

                           var119 = 1622237513 ^ var119;
                           String var49 = this.text;
                           int var94 = this.position;
                           char var50 = var49.charAt(var94);
                           boolean var51 = Character.isDigit(var50);
                           if (!var51) {
                              while (true) {
                                 switch (equlxktebzrxiyte.tpabobqnolkrvwps(var119)) {
                                    case 74097469:
                                       var119 ^= 1930695277;
                                    case 692437182:
                                       break label109;
                                    case 717802307:
                                    default:
                                       throw new RuntimeException(new IOException());
                                    case 1189805167:
                                 }
                              }
                           }

                           var119 = 342002323 ^ var119;
                           int var95 = this.position;
                           byte var108 = 1;
                           int var96 = var95 + var108;
                           this.position = var96;
                           var119 = wyiwbtzulukkzrmg(var119, 1960045530);
                        }
                     }

                     try {
                        String var40 = this.text;
                        int var107 = this.position;
                        String var41 = var40.substring(var115, var107);
                        Long var42 = Long.valueOf(var41);
                        var119 ^= 484889040;
                        return var42;
                     } catch (NumberFormatException var120) {
                        switch (equlxktebzrxiyte.ywsixjszjupjgadr(var119)) {
                           case -1281122184:
                              var119 = 1372842111 ^ var119;
                              IllegalArgumentException var45 = this.invalid();
                              throw new RuntimeException(var45);
                           default:
                              throw new RuntimeException("Error in hash");
                        }
                     }
                  }

                  while (true) {
                     switch (equlxktebzrxiyte.tpabobqnolkrvwps(var119)) {
                        case 2677173:
                           var119 = 1949236791 ^ var119;
                           break label170;
                        case 1253410307:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1618220961:
                           break label170;
                        case 2115286100:
                     }
                  }
               case 297569099:
                  break;
               case 1157755406:
               default:
                  throw new RuntimeException(new IOException());
            }
         }

         IllegalArgumentException var54 = this.invalid();
         throw new RuntimeException(var54);
      }
   }

   private String readString() {
      int var102 = 1624330352 ^ 1126896365 ^ 1100615982;
      var102 = 297208738 ^ var102;
      byte var2 = 34;
      this.expect((char)var2);
      StringBuilder var7 = new StringBuilder();
      StringBuilder var3 = var7;
      var102 = 1912431092 ^ var102;

      label121:
      while (true) {
         int var9 = this.position;
         String var58 = this.text;
         int var59 = var58.length();
         if (var9 >= var59) {
            var102 = 746410441 ^ var102;
            IllegalArgumentException var56 = this.invalid();
            throw new RuntimeException(var56);
         }

         var102 = 429235809 ^ var102;
         String var11 = this.text;
         int var86 = this.position;
         byte var97 = 1;
         int var92 = var86 + var97;
         this.position = var92;
         char var12 = var11.charAt(var86);
         byte var61 = 34;
         if (var12 == var61) {
            var102 = 318875279 ^ var102;
            return var3.toString();
         }

         var102 = 1860909991 ^ var102;
         byte var62 = 32;
         if (var12 < var62) {
            var102 = 209534947 ^ var102;
            IllegalArgumentException var16 = this.invalid();
            throw new RuntimeException(var16);
         }

         label116:
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var102)) {
               case 55811031:
                  var102 ^= 1339647155;
               case 1501749506:
                  byte var63 = 92;
                  if (var12 != var63) {
                     var102 = 798976250 ^ var102;
                     StringBuilder var52 = var3.append(var12);
                     var102 = wyiwbtzulukkzrmg(var102, 389589391);
                     continue label121;
                  }

                  var102 = wyiwbtzulukkzrmg(var102, 796527782);
                  int var19 = this.position;
                  String var65 = this.text;
                  int var66 = var65.length();
                  if (var19 >= var66) {
                     var102 = 795280071 ^ var102;
                     IllegalArgumentException var50 = this.invalid();
                     throw new RuntimeException(var50);
                  }

                  label113:
                  while (true) {
                     switch (equlxktebzrxiyte.tpabobqnolkrvwps(var102)) {
                        case 177241311:
                           var102 ^= 136765897;
                           break label113;
                        case 779749636:
                           break;
                        case 1370123977:
                           break label113;
                        case 1532887854:
                        default:
                           throw new RuntimeException();
                     }
                  }

                  char var22;
                  String var21 = this.text;
                  int var87 = this.position;
                  byte var98 = 1;
                  int var93 = var87 + var98;
                  this.position = var93;
                  var22 = var21.charAt(var87);
                  label105:
                  switch (var22) {
                     case '"':
                        while (true) {
                           switch (equlxktebzrxiyte.tpabobqnolkrvwps(var102)) {
                              case 163907407:
                                 var102 ^= 2065467092;
                              case 167764715:
                                 break label105;
                              case 338789541:
                                 break;
                              case 1357663058:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     case '/':
                        while (true) {
                           switch (equlxktebzrxiyte.tpabobqnolkrvwps(var102)) {
                              case 163907407:
                                 var102 ^= 2065467092;
                                 break label105;
                              case 326203686:
                                 break;
                              case 1753155429:
                                 break label105;
                              case 1822544800:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     case '\\':
                        while (true) {
                           switch (equlxktebzrxiyte.tpabobqnolkrvwps(var102)) {
                              case 24040539:
                                 break;
                              case 163907407:
                                 var102 ^= 2065467092;
                              case 811782530:
                                 break label105;
                              case 2132788066:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     case 'b':
                        var102 = 1752878881 ^ var102;
                        byte var83 = 8;
                        StringBuilder var46 = var3.append((char)var83);
                        var102 = 1431188098 ^ var102;
                        break label116;
                     case 'f':
                        var102 = 1776032703 ^ var102;
                        byte var84 = 12;
                        StringBuilder var48 = var3.append((char)var84);
                        var102 = wyiwbtzulukkzrmg(var102, 1424549404);
                        break label116;
                     case 'n':
                        label85:
                        while (true) {
                           switch (equlxktebzrxiyte.tpabobqnolkrvwps(var102)) {
                              case 163907407:
                                 var102 ^= 954717119;
                                 break label85;
                              case 862711384:
                                 break;
                              case 1573877518:
                              default:
                                 throw new RuntimeException();
                              case 2011665709:
                                 break label85;
                           }
                        }

                        byte var69 = 10;
                        StringBuilder var27 = var3.append((char)var69);
                        var102 = wyiwbtzulukkzrmg(var102, 97725980);
                        break label116;
                     case 'r':
                        var102 = wyiwbtzulukkzrmg(var102, 2122603837);
                        byte var68 = 13;
                        StringBuilder var25 = var3.append((char)var68);
                        var102 = wyiwbtzulukkzrmg(var102, 1135648926);
                        break label116;
                     case 't':
                        var102 = wyiwbtzulukkzrmg(var102, 205618317);
                        byte var82 = 9;
                        StringBuilder var44 = var3.append((char)var82);
                        var102 = wyiwbtzulukkzrmg(var102, 829784366);
                        break label116;
                     case 'u':
                        var102 = wyiwbtzulukkzrmg(var102, 174328115);
                        int var29 = this.position;
                        byte var70 = 4;
                        int var30 = var29 + var70;
                        String var72 = this.text;
                        int var73 = var72.length();
                        if (var30 > var73) {
                           var102 = 186570396 ^ var102;
                           IllegalArgumentException var38 = this.invalid();
                           throw new RuntimeException(var38);
                        }

                        var102 = 416263017 ^ var102;

                        try {
                           String var75 = this.text;
                           int var89 = this.position;
                           int var95 = this.position;
                           byte var99 = 4;
                           int var96 = var95 + var99;
                           String var76 = var75.substring(var89, var96);
                           byte var90 = 16;
                           int var77 = Integer.parseInt(var76, var90);
                           char var78 = (char)var77;
                           StringBuilder var32 = var3.append(var78);
                           var102 ^= 1179850870;
                        } catch (NumberFormatException var103) {
                           switch (equlxktebzrxiyte.ywsixjszjupjgadr(var102)) {
                              case 2077605160:
                                 var102 = 332241585 ^ var102;
                                 IllegalArgumentException var36 = this.invalid();
                                 throw new RuntimeException(var36);
                              default:
                                 throw new RuntimeException(new IOException("Error in hash"));
                           }
                        }

                        label77:
                        while (true) {
                           switch (equlxktebzrxiyte.tpabobqnolkrvwps(var102)) {
                              case 168902708:
                                 break;
                              case 230722945:
                                 var102 ^= 888161546;
                              case 243620061:
                                 break label77;
                              case 776817986:
                              default:
                                 throw new RuntimeException();
                           }
                        }

                        int var79 = this.position;
                        byte var91 = 4;
                        int var80 = var79 + var91;
                        this.position = var80;
                        var102 = wyiwbtzulukkzrmg(var102, 1564213893);
                        break label116;
                     default:
                        var102 = 1781071954 ^ var102;
                        IllegalArgumentException var40 = this.invalid();
                        throw new RuntimeException(var40);
                  }

                  StringBuilder var42 = var3.append(var22);
                  var102 = 1177058167 ^ var102;
                  break label116;
               case 268692641:
                  break;
               case 563361694:
               default:
                  throw new RuntimeException();
            }
         }

         var102 = 584044985 ^ var102;
      }
   }

   private void skipWhitespace() {
      int var19 = 1472153990 ^ 1725938199 ^ 1100615982;
      var19 = 1345020664 ^ var19;

      while (true) {
         int var4 = this.position;
         String var8 = this.text;
         int var9 = var8.length();
         if (var4 >= var9) {
            var19 = wyiwbtzulukkzrmg(var19, 1280867286);
            return;
         }

         var19 = 43064477 ^ var19;
         String var5 = qlpqxyzzhp(iczpihafslcgumn(), var19);
         String var11 = this.text;
         int var15 = this.position;
         char var12 = var11.charAt(var15);
         int var6 = var5.indexOf(var12);
         if (var6 < 0) {
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var19)) {
                  case 39652774:
                     var19 = 1321822027 ^ var19;
                     return;
                  case 729622529:
                     break;
                  case 961419839:
                  default:
                     throw new IllegalStateException();
                  case 2068875450:
                     return;
               }
            }
         }

         var19 = 1739388815 ^ var19;
         int var13 = this.position;
         byte var16 = 1;
         int var14 = var13 + var16;
         this.position = var14;
         var19 = 1698556690 ^ var19;
      }
   }

   private boolean accept(char var1) {
      int var22 = 383368698 ^ 1469218172 ^ 1100615982;
      var22 = 1560521229 ^ var22;
      this.skipWhitespace();
      int var6 = this.position;
      String var13 = this.text;
      int var14 = var13.length();
      if (var6 < var14) {
         var22 = 1610419838 ^ var22;
         String var8 = this.text;
         int var16 = this.position;
         char var9 = var8.charAt(var16);
         if (var9 == var1) {
            var22 = 1685083394 ^ var22;
            int var18 = this.position;
            byte var4 = 1;
            int var19 = var18 + var4;
            this.position = var19;
            return true;
         } else {
            var22 = 1190120341 ^ var22;
            return false;
         }
      } else {
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var22)) {
               case 96965213:
                  var22 = 420660715 ^ var22;
                  return false;
               case 189781009:
               default:
                  throw new IllegalStateException();
               case 602293725:
                  return false;
               case 1361960950:
            }
         }
      }
   }

   private void expect(char var1) {
      int var9 = 340526275 ^ 18400049 ^ 1100615982;
      var9 = 1221309579 ^ var9;
      boolean var4 = this.accept(var1);
      if (!var4) {
         var9 = 757666455 ^ var9;
         IllegalArgumentException var6 = this.invalid();
         throw new RuntimeException(var6);
      } else {
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var9)) {
               case 105542285:
                  var9 = 314185430 ^ var9;
               case 468434009:
                  return;
               case 159455493:
               default:
                  throw new IllegalStateException();
               case 160452609:
            }
         }
      }
   }

   private IllegalArgumentException invalid() {
      int var5 = 1767307696 ^ 1804011108 ^ 1100615982;
      var5 = 1942960637 ^ var5;
      String var2 = qlpqxyzzhp(gtpfuxnqgceeplw(), var5);
      return new IllegalArgumentException(var2);
   }

   static {
      int var3 = new Random(8240079051474093094L).nextInt();
      kWfQ6BoQeo = 735284713 ^ var3;
   }

   public static String qlpqxyzzhp(byte[] var0, int var1) {
      String var10 = Integer.toString(var1);
      byte[] var11 = var10.getBytes();
      byte[] var8 = var11;
      byte var12 = 0;
      int var9 = var12;

      while (true) {
         int var17 = var0.length;
         if (var9 >= var17) {
            Charset var5 = StandardCharsets.UTF_16;
            return new String(var0, var5);
         }

         byte var20 = var0[var9];
         int var33 = var8.length;
         int var30 = var9 % var33;
         byte var27 = var8[var30];
         int var21 = var20 ^ var27;
         byte var22 = (byte)var21;
         var0[var9] = var22;
         byte var23 = var0[var9];
         byte[] var28 = ijyelwpmpn;
         byte[] var34 = ijyelwpmpn;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] ljbilbouaqdwpyz() {
      return new byte[]{
         85,
         96,
         36,
         107,
         88,
         46,
         78,
         105,
         2,
         39,
         91,
         62,
         107,
         123,
         55,
         39,
         80,
         50,
         93,
         71,
         11,
         82,
         48,
         69,
         96,
         19,
         57,
         66,
         123,
         109,
         27,
         98,
         92,
         19,
         78,
         2,
         70,
         56,
         37,
         78,
         25,
         50,
         43,
         127,
         106,
         6,
         86,
         41,
         70,
         41,
         93,
         88,
         57,
         24,
         39,
         60,
         115,
         78,
         119,
         18,
         18,
         113,
         61,
         93,
         37,
         52,
         121,
         76,
         112,
         61,
         112,
         93,
         42,
         9,
         26,
         32,
         62,
         38
      };
   }

   private static byte[] tmxwhpaquddqalv() {
      return new byte[]{-102, -87, 18, 1, 110, 67};
   }

   private static byte[] qnzlfatsaxbvwnt() {
      return new byte[]{-100, -83, 29, 5, 106, 127};
   }

   private static byte[] bnpdmxcuocwnylz() {
      return new byte[]{-102, -82, 22, 1, 111, 116};
   }

   private static byte[] fvxjjxgregtotmh() {
      return new byte[]{-102, -87, 16, 6, 96, 62};
   }

   private static byte[] caygxlklenycvma() {
      return new byte[]{-109, -83, 22, 15, 111, 111, 124, 126, 58, 37, 105, 50, 92, 55};
   }

   private static byte[] dfcczjnkmenugxq() {
      return new byte[]{-102, -86, 21, 120};
   }

   private static byte[] koxyylvqrljnzkh() {
      return new byte[]{-104, -89, 22, 15, 107, 123};
   }

   private static byte[] hyhtsmtfphiphuc() {
      return new byte[]{-102, -87, 21, 6, 96, 98};
   }

   private static byte[] muqukzlcewrugbi() {
      return new byte[]{-102, -84, 18, 1, 105, 100};
   }

   private static byte[] hpdcgficcgnueyq() {
      return new byte[]{-102, -81, 23, 55, 105, 108, 123, 54, 53, 122};
   }

   private static byte[] ihzubnezsjnmkaf() {
      return new byte[]{-100, -85, 21, 40, 108, 105, 125, 44, 58, 117};
   }

   private static byte[] fawwnbmkraztool() {
      return new byte[]{-100, -85, 21, 58, 108, 122, 125, 53, 58, 99, 111, 106};
   }

   private static byte[] pokuevmhorbfvia() {
      return new byte[]{-100, -85, 21, 50, 108, 110, 125, 53, 58, 124};
   }

   private static byte[] iczpihafslcgumn() {
      return new byte[]{-98, -88, 16, 125, 109, 30, 118, 84, 48, 24};
   }

   private static byte[] gtpfuxnqgceeplw() {
      return new byte[]{
         -109,
         -82,
         16,
         18,
         105,
         114,
         127,
         41,
         53,
         126,
         106,
         102,
         91,
         35,
         5,
         114,
         102,
         37,
         101,
         5,
         63,
         7,
         1,
         5,
         81,
         83,
         14,
         31,
         74,
         43,
         43,
         115,
         110,
         80,
         120,
         80,
         126,
         122,
         17,
         14,
         40,
         111,
         26,
         39,
         93,
         77,
         103,
         120
      };
   }

   private static int wyiwbtzulukkzrmg(int var0, int var1) {
      return var0 ^ var1;
   }
}
