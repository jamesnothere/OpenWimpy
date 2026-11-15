package com.wimpyclient.s;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class d {
   public static final int MIN_VOTES = 3;
   private final Map<d$a, int[]> votes;
   private final Long2ObjectOpenHashMap<Map<d$a, int[]>> bySource;
   private static int dEzHvXmWRe;
   private transient int oGlau7kQJf;
   private static String nvsyjbywzz = ByteBuffer.wrap(rxlnqfrfhucmgju()).asCharBuffer().toString();

   public d() {
super();
      int var8 = 1901213518 ^ 1664451283;
      
      var8 = 874414892 ^ var8;
      var8 = 805547860 ^ 845486048 ^ Integer.parseInt("606047749");
      this.oGlau7kQJf = 1470448287 ^ dEzHvXmWRe;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
            case 171875745:
               break;
            case 176881551:
               var8 = 873089566 ^ var8;
            case 1188761848:
               HashMap var2 = new HashMap();
               this.votes = var2;
               Long2ObjectOpenHashMap var5 = new Long2ObjectOpenHashMap();
               this.bySource = var5;
               return;
            case 1145314833:
            default:
               throw new RuntimeException();
         }
      }
   }

   public int compare(long var1, long var3) {
      int var50 = 1073321295 ^ 1955930213 ^ 1543760398;
      var50 = 1502556055 ^ var50;
      long var70;
      int var15 = (var70 = var1 - var3) == 0L ? 0 : (var70 < 0L ? -1 : 1);
      if (var15 == (1323331763 ^ var50)) {
         var50 = 453228970 ^ var50;
         return (byte)(1440991513 ^ var50);
      } else {
         var50 = vfxabiwiqysfbnck(var50, 104353019);
         Map var17 = this.votes;
         d$a var40 = d$a.of(var1, var3);
         Object var18 = var17.get(var40);
         int[] var19 = (int[])var18;
         if (var19 == null) {
            var50 = 621346030 ^ var50;
            return (byte)(1842397350 ^ var50);
         } else {
            var50 = 719844583 ^ var50;
            long var71;
            int var24 = (var71 = var1 - var3) == 0L ? 0 : (var71 < 0L ? -1 : 1);
            byte var25;
            if (var24 < (1648347311 ^ var50)) {
               var50 = 246658952 ^ var50;
               var25 = (byte)(1821146918 ^ var50);
               var50 = vfxabiwiqysfbnck(var50, 1809974902);
            } else {
               var50 = 1542026765 ^ var50;
               var25 = (byte)(970374818 ^ var50);
               var50 = 1052297203 ^ var50;
            }

            byte var41 = (byte)(124680529 ^ var50);
            int var27 = var19[var41];
            byte var42 = (byte)(124680530 ^ var50);
            if (var27 >= var42) {
               var50 ^= 980233122;
               byte var43 = (byte)(1023628018 ^ var50);
               int var29 = var19[var43];
               if (var29 == (1023628019 ^ var50)) {
                  var50 = 1011738451 ^ var50;
                  byte var31;
                  if (var25 != (21935520 ^ var50)) {
                     var50 = 1993717282 ^ var50;
                     var31 = (byte)(2006647683 ^ var50);
                     var50 = vfxabiwiqysfbnck(var50, 1385553850);
                  } else {
                     var50 = 1978732772 ^ var50;
                     var31 = (byte)(-1958716741 ^ var50);
                     var50 = 1370585468 ^ var50;
                  }

                  return var31;
               }

               label61:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var50)) {
                     case 104222133:
                        var50 ^= 1729620610;
                     case 705985230:
                        break label61;
                     case 1087162100:
                        break;
                     case 1576566661:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            } else {
               label68:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var50)) {
                     case 116889301:
                        var50 ^= 1568325920;
                        break label68;
                     case 321853515:
                        break;
                     case 902398370:
                        break label68;
                     case 1547840057:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }

            byte var44 = (byte)(1511307376 ^ var50);
            int var33 = var19[var44];
            byte var45 = (byte)(1511307378 ^ var50);
            if (var33 >= var45) {
               var50 = 1140584086 ^ var50;
               byte var46 = (byte)(435115751 ^ var50);
               int var35 = var19[var46];
               if (var35 == (435115751 ^ var50)) {
                  var50 = 1120060312 ^ var50;
                  byte var39;
                  if (var25 != (1529714047 ^ var50)) {
                     var50 = 1436907196 ^ var50;
                     var39 = (byte)(-243852228 ^ var50);
                     var50 = 1844180957 ^ var50;
                  } else {
                     var50 = vfxabiwiqysfbnck(var50, 983175956);
                     var39 = (byte)(1639417450 ^ var50);
                     var50 = 47485557 ^ var50;
                  }

                  return var39;
               } else {
                  var50 = vfxabiwiqysfbnck(var50, 2136076296);
                  return (byte)(1723770607 ^ var50);
               }
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var50)) {
                     case 28617898:
                        return (byte)(1723770607 ^ var50);
                     case 52549285:
                        break;
                     case 243826510:
                        var50 ^= 1017781918;
                        return (byte)(1723770607 ^ var50);
                     case 1873741672:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }
         }
      }
   }

   public boolean after(long var1, long var3) {
      int var14 = 286638360 ^ 1151424306 ^ 1543760398;
      var14 = 579832624 ^ var14;
      int var10 = this.compare(var1, var3);
      byte var11;
      if (var10 > (725153556 ^ var14)) {
         var14 = 161407010 ^ var14;
         var11 = (byte)(581310263 ^ var14);
         var14 = vfxabiwiqysfbnck(var14, 1308327757);
      } else {
         var14 = 720057317 ^ var14;
         var11 = (byte)(30655729 ^ var14);
         var14 = 1854844042 ^ var14;
      }

      return (var11 != 0);
   }

   public Set<long[]> collect(c var1, Long2ObjectMap<c> var2, d$c var3, d$b var4) {
      int var295 = 913078734 ^ 1872412247 ^ 1543760398;
      var295 = 334873254 ^ var295;
      int var33 = var1.chunkX;
      int var168 = var1.chunkZ;
      long var34 = ChunkPos.asLong(var33, var168);
      long var10 = var34;
      HashMap var36 = new HashMap();
      HashMap var12 = var36;
      byte var37 = (byte)(369159985 ^ var295);
      int var13 = var37;
      var295 = 1284282608 ^ var295;

      label242:
      while (true) {
         int var170 = var1.size();
         if (var13 < var170) {
            var295 = 1925157063 ^ var295;
            long var40 = var1.key(var13);
            long var14 = var40;
            byte var43 = lastStone(var1, var13);
            if (var43 >= (674490118 ^ var295)) {
               var295 = 1305666597 ^ var295;
               int var47 = BlockPos.getX(var40);
               int var18 = var47;
               int var50 = BlockPos.getY(var40);
               int var19 = var50;
               int var53 = BlockPos.getZ(var40);
               int var20 = var53;
               byte var54 = (byte)(-1709245220 ^ var295);
               byte var21 = var54;
               long var55 = 0L;
               long var22 = var55;
               byte var57 = (byte)(1709245218 ^ var295);
               byte var24 = var57;
               byte var58 = (byte)(1709245219 ^ var295);
               byte var25 = var58;
               byte var59 = (byte)(-1709245220 ^ var295);
               int var26 = var59;
               var295 = 1681183373 ^ var295;

               label185:
               while (true) {
                  byte var173 = (byte)(30790063 ^ var295);
                  if (var26 > var173) {
                     var295 = vfxabiwiqysfbnck(var295, 1437947542);
                     break;
                  }

                  var295 = 892983182 ^ var295;
                  if (var24 == (887883296 ^ var295)) {
                     var295 = vfxabiwiqysfbnck(var295, 1619820824);
                     break;
                  }

                  var295 = 274765690 ^ var295;
                  byte var62 = (byte)(-613192027 ^ var295);
                  int var27 = var62;
                  var295 = 261964195 ^ var295;

                  label170:
                  while (true) {
                     byte var174 = (byte)(722587896 ^ var295);
                     if (var27 > var174) {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var295)) {
                              case 57847795:
                                 var295 ^= 20057286;
                              case 208646638:
                                 break label170;
                              case 541082411:
                                 break;
                              case 1699597815:
                              default:
                                 throw new IllegalStateException();
                           }
                        }
                     }

                     var295 = 2083351863 ^ var295;
                     if (var24 == (1463598542 ^ var295)) {
                        var295 = vfxabiwiqysfbnck(var295, 2099208689);
                        break;
                     }

                     var295 = 969352737 ^ var295;
                     byte var175 = (byte)(1861983211 ^ var295);
                     int var66 = var18 >> var175;
                     int var67 = var66 + var26;
                     byte var7 = (byte)(1861983211 ^ var295);
                     int var178 = var20 >> var7;
                     int var179 = var178 + var27;
                     long var68 = ChunkPos.asLong(var67, var179);
                     Object var71 = var2.get(var68);
                     c var72 = (c)var71;
                     if (var72 != null) {
                        var295 = 148038890 ^ var295;
                        List var75 = var72.fogs();
                        Iterator var76 = var75.iterator();
                        Iterator var31 = var76;
                        var295 = 1260817603 ^ var295;

                        label164:
                        while (true) {
                           byte var78 = (byte)((var31.hasNext()) ? 1 : 0);
                           if (var78 == (756020166 ^ var295)) {
                              var295 = 1006948894 ^ var295;
                              long var339;
                              int var87 = (var339 = var68 - var10) == 0L ? 0 : (var339 < 0L ? -1 : 1);
                              if (var87 != (285942232 ^ var295)) {
                                 var295 = 1194307109 ^ var295;
                                 int var89 = var72.find(var14);
                                 if (var89 >= (1445236733 ^ var295)) {
                                    var295 = 1818070440 ^ var295;
                                    if (var25 != (981008981 ^ var295)) {
                                       var295 = 1092794779 ^ var295;
                                       byte var99 = (byte)(2069609422 ^ var295);
                                       var24 = var99;
                                       var295 = 2072355402 ^ var295;
                                    } else {
                                       var295 = 891266256 ^ var295;
                                       byte var92 = (byte)(258385540 ^ var295);
                                       var25 = var92;
                                       byte var94 = lastStone(var72, var89);
                                       var21 = var94;
                                       var22 = var68;
                                       if (var94 < (258385541 ^ var295)) {
                                          var295 = 45488251 ^ var295;
                                          byte var98 = (byte)(231784190 ^ var295);
                                          var24 = var98;
                                          var295 = 219064186 ^ var295;
                                       } else {
                                          var295 = 263765761 ^ var295;
                                       }
                                    }
                                 } else {
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var295)) {
                                          case 115769566:
                                             var295 ^= 1459263097;
                                          case 682013640:
                                             break label164;
                                          case 952797976:
                                          default:
                                             throw new IllegalStateException();
                                          case 959911969:
                                       }
                                    }
                                 }
                              } else {
                                 var295 = vfxabiwiqysfbnck(var295, 299186268);
                              }
                              break;
                           }

                           var295 = 763541609 ^ var295;
                           Object var80 = var31.next();
                           c$b var81 = (c$b)var80;
                           byte var83 = (byte)((var81.contains(var18, var19, var20)) ? 1 : 0);
                           if (var83 != (9259951 ^ var295)) {
                              var295 = 222689516 ^ var295;
                              byte var84 = (byte)(231256899 ^ var295);
                              var24 = var84;
                              var295 = 442741821 ^ var295;
                           } else {
                              var295 = vfxabiwiqysfbnck(var295, 388386001);
                           }

                           var295 = vfxabiwiqysfbnck(var295, 983889080);
                        }
                     } else {
                        var295 = 1847951979 ^ var295;
                     }

                     var27 += 14555525 ^ var295;
                     var295 = vfxabiwiqysfbnck(var295, 735037821);
                  }

                  var26 += 706993214 ^ var295;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var295)) {
                        case 27611289:
                           var295 ^= 737545617;
                        case 217786137:
                           continue label185;
                        case 500910299:
                           break;
                        case 1392535671:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               }

               if (var24 != (1415612216 ^ var295)) {
                  var295 = 1429346371 ^ var295;
                  if (var25 != (22191995 ^ var295)) {
                     var295 = 1618630631 ^ var295;
                     if (var21 != var43) {
                        var295 = 1917017790 ^ var295;
                        long var340;
                        int var105 = (var340 = var22 - var10) == 0L ? 0 : (var340 < 0L ? -1 : 1);
                        if (var105 >= (325817890 ^ var295)) {
                           var295 = 2025280908 ^ var295;
                           byte var227 = (byte)(1809630122 ^ var295);
                           int var188 = var18 >> var227;
                           byte var248 = (byte)(1809630122 ^ var295);
                           int var229 = var20 >> var248;
                           l var107 = var3.terrain(var188, var229);
                           if (var107 != null) {
                              var295 = 1088019067 ^ var295;
                              byte var110 = var107.kind(var18, var19, var20);
                              byte var111 = (byte)((m.isBase(var110)) ? 1 : 0);
                              if (var111 != (721754581 ^ var295)) {
                                 var295 = 2138963097 ^ var295;
                                 byte var113 = var4.kind(var18, var19, var20);
                                 d$a var193 = d$a.of(var10, var22);
                                 Function var232 = var0 -> {
                                    int var5 = 967049301 ^ 1875487466 ^ 195471505;
                                    var5 = 188870098 ^ var5;
                                    byte var1x = (byte)(1451945982 ^ var5);
                                    return new int[var1x];
                                 };
                                 Object var115 = var12.computeIfAbsent(var193, var232);
                                 int[] var116 = (int[])var115;
                                 if (var113 == var43) {
                                    var295 = 1667238162 ^ var295;
                                    byte var197 = (byte)(924380254 ^ var295);
                                    int var235 = var116[var197];
                                    byte var254 = (byte)(924380255 ^ var295);
                                    int var236 = var235 + var254;
                                    var116[var197] = var236;
                                    var295 = 205343159 ^ var295;
                                 } else {
                                    var295 = 1639028672 ^ var295;
                                    if (var113 == var21) {
                                       var295 = 69840237 ^ var295;
                                       byte var196 = (byte)(836820960 ^ var295);
                                       int var233 = var116[var196];
                                       byte var253 = (byte)(836820960 ^ var295);
                                       int var234 = var233 + var253;
                                       var116[var196] = var234;
                                       var295 = 180713992 ^ var295;
                                    } else {
                                       var295 = vfxabiwiqysfbnck(var295, 250402661);
                                    }
                                 }
                              } else {
                                 var295 = 270580796 ^ var295;
                              }
                           } else {
                              var295 = vfxabiwiqysfbnck(var295, 1358521927);
                           }
                        } else {
                           var295 = 676213707 ^ var295;
                        }
                     } else {
                        var295 = vfxabiwiqysfbnck(var295, 1510829429);
                     }
                  } else {
                     var295 = vfxabiwiqysfbnck(var295, 980892306);
                  }
               } else {
                  label133:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var295)) {
                        case 58413468:
                           var295 ^= 1866801873;
                           break label133;
                        case 592387581:
                           break;
                        case 852763888:
                        default:
                           throw new IllegalStateException();
                        case 1186135208:
                           break label133;
                     }
                  }
               }
            } else {
               var295 = vfxabiwiqysfbnck(var295, 320226031);
            }

            var13 += 992323048 ^ var295;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var295)) {
                  case 43567702:
                     var295 ^= 1638519336;
                     continue label242;
                  case 181739002:
                     break;
                  case 346136089:
                  default:
                     throw new IllegalStateException();
                  case 1245446958:
                     continue label242;
               }
            }
         } else {
            var295 = vfxabiwiqysfbnck(var295, 330941553);
            Set var238 = var12.keySet();
            HashSet var121 = new HashSet(var238);
            Long2ObjectOpenHashMap var123 = this.bySource;
            Object var124 = var123.put(var10, var12);
            Map var125 = (Map)var124;
            Map var282 = var125;
            if (var125 != null) {
               var295 = 625287762 ^ var295;
               Set var201 = var125.keySet();
               boolean var128 = var121.addAll(var201);
               var295 = 960127648 ^ var295;
            } else {
               label235:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var295)) {
                     case 38979082:
                        break label235;
                     case 232277264:
                        var295 ^= 478101746;
                        break label235;
                     case 1174671240:
                        break;
                     case 1554935844:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }

            HashSet var129 = new HashSet();
            HashSet var16 = var129;
            Iterator var131 = var121.iterator();
            Iterator var283 = var131;
            var295 = 1303226671 ^ var295;

            while (true) {
               byte var133 = (byte)((var283.hasNext()) ? 1 : 0);
               if (var133 == (417815149 ^ var295)) {
                  var295 = vfxabiwiqysfbnck(var295, 1202403232);
                  return var16;
               }

               var295 = 392302346 ^ var295;
               Object var136 = var283.next();
               d$a var137 = (d$a)var136;
               long var203 = var137.first();
               long var257 = var137.second();
               int var139 = this.compare(var203, var257);
               Map var141 = this.votes;
               Function var239 = var0 -> {
                  int var5 = 967049301 ^ 1875487466 ^ 195471505;
                  var5 = 188870098 ^ var5;
                  byte var1x = (byte)(1451945982 ^ var5);
                  return new int[var1x];
               };
               Object var142 = var141.computeIfAbsent(var137, var239);
               int[] var143 = (int[])var142;
               int[] var167;
               if (var282 == null) {
                  var295 = 743942609 ^ var295;
                  var167 = null;
                  var295 = vfxabiwiqysfbnck(var295, 1591817440);
               } else {
                  var295 = 159191676 ^ var295;
                  Object var166 = var282.get(var137);
                  var167 = (int[])var166;
                  var295 = 2076938061 ^ var295;
               }

               Object var146 = var12.get(var137);
               int[] var147 = (int[])var146;
               if (var167 != null) {
                  var295 = 1765738891 ^ var295;
                  byte var207 = (byte)(336380381 ^ var295);
                  int var240 = var143[var207];
                  byte var9 = (byte)(336380381 ^ var295);
                  int var260 = var167[var9];
                  int var241 = var240 - var260;
                  var143[var207] = var241;
                  byte var208 = (byte)(336380380 ^ var295);
                  int var242 = var143[var208];
                  byte var272 = (byte)(336380380 ^ var295);
                  int var262 = var167[var272];
                  int var243 = var242 - var262;
                  var143[var208] = var243;
                  var295 = 612216786 ^ var295;
               } else {
                  var295 = 1296213593 ^ var295;
               }

               if (var147 != null) {
                  var295 = 1703806620 ^ var295;
                  byte var209 = (byte)(1442801811 ^ var295);
                  int var244 = var143[var209];
                  byte var273 = (byte)(1442801811 ^ var295);
                  int var264 = var147[var273];
                  int var245 = var244 + var264;
                  var143[var209] = var245;
                  byte var210 = (byte)(1442801810 ^ var295);
                  int var246 = var143[var210];
                  byte var274 = (byte)(1442801810 ^ var295);
                  int var266 = var147[var274];
                  int var247 = var246 + var266;
                  var143[var210] = var247;
                  var295 = 587780267 ^ var295;
               } else {
                  label200:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var295)) {
                        case 232518988:
                           var295 ^= 1183241783;
                           break label200;
                        case 1461053467:
                           break;
                        case 1488965664:
                           break label200;
                        case 1909583132:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               }

               byte var211 = (byte)(1995946040 ^ var295);
               int var155 = var143[var211];
               if (var155 == (1995946040 ^ var295)) {
                  var295 = 832907644 ^ var295;
                  byte var212 = (byte)(1196593477 ^ var295);
                  int var157 = var143[var212];
                  if (var157 == (1196593476 ^ var295)) {
                     var295 = 1605488031 ^ var295;
                     Map var159 = this.votes;
                     Object var160 = var159.remove(var137);
                     var295 = 1361531929 ^ var295;
                  } else {
                     var295 = 244750726 ^ var295;
                  }
               } else {
                  label212:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var295)) {
                        case 54979973:
                           break;
                        case 109019675:
                           var295 ^= 1060352250;
                        case 122175608:
                           break label212;
                        case 1020028035:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               }

               long var215 = var137.first();
               long var268 = var137.second();
               int var162 = this.compare(var215, var268);
               if (var162 != var139) {
                  var295 = 855301122 ^ var295;
                  byte var218 = (byte)(2067715266 ^ var295);
                  long[] var219 = new long[var218];
                  byte var270 = (byte)(2067715264 ^ var295);
                  long var276 = var137.first();
                  var219[var270] = var276;
                  byte var271 = (byte)(2067715265 ^ var295);
                  long var279 = var137.second();
                  var219[var271] = var279;
                  boolean var164 = var16.add(var219);
                  var295 = 1617575001 ^ var295;
               } else {
                  label224:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var295)) {
                        case 250321203:
                           var295 ^= 1385226331;
                           break label224;
                        case 1226925414:
                           break;
                        case 1441089055:
                        default:
                           throw new IllegalStateException();
                        case 1870456986:
                           break label224;
                     }
                  }
               }

               var295 = vfxabiwiqysfbnck(var295, 62108404);
            }
         }
      }
   }

   static long evidenceSignature(c var0) {
      int var54 = 750032474 ^ 364209445 ^ 195471505;
      var54 = 98257268 ^ var54;
      long var1 = 1125899906842597L;
      long var7 = var1;
      byte var11 = (byte)(930878106 ^ var54);
      int var9 = var11;
      var54 = 1267252142 ^ var54;

      while (true) {
         label50: {
            int var34 = var0.size();
            if (var9 < var34) {
               var54 = 1867617365 ^ var54;
               byte var14 = lastStone(var0, var9);
               if (var14 >= (329596257 ^ var54)) {
                  var54 = 481299262 ^ var54;
                  long var16 = 31L;
                  long var18 = var16 * var7;
                  long var37 = var0.key(var9);
                  long var20 = var18 + var37;
                  long var22 = 31L;
                  long var24 = var22 * var20;
                  long var42 = var14;
                  long var26 = var24 + var42;
                  var7 = var26;
                  var54 = 454007372 ^ var54;
                  break label50;
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
                     case 101725518:
                        var54 ^= 129995122;
                        break label50;
                     case 587797882:
                     default:
                        throw new RuntimeException();
                     case 2091823299:
                        break label50;
                     case 2124741963:
                  }
               }
            } else {
               label34:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
                     case 35289888:
                        var54 = 2122922866 ^ var54;
                        break label34;
                     case 861104891:
                     default:
                        throw new RuntimeException();
                     case 1062392949:
                        break label34;
                     case 2056295865:
                  }
               }
            }

            long var28 = 31L;
            long var30 = var28 * var7;
            List var47 = var0.fogs();
            int var48 = var47.hashCode();
            long var49 = var48;
            return var30 + var49;
         }

         var9 += 337292306 ^ var54;
         var54 = 1760429351 ^ var54;
      }
   }

   private static byte lastStone(c var0, int var1) {
      int var27 = 1435972538 ^ 710931352 ^ 195471505;
      var27 = 306050029 ^ var27;
      byte var2 = (byte)(-1716755295 ^ var27);
      byte var5 = var2;
      byte var9 = (byte)(1716755294 ^ var27);
      int var6 = var9;
      var27 = 918214229 ^ var27;

      label47:
      while (true) {
         int var22 = var0.writeCount(var1);
         if (var6 >= var22) {
            var27 = vfxabiwiqysfbnck(var27, 449273033);
            return var5;
         }

         var27 = 1127907141 ^ var27;
         short var12 = var0.write(var1, var6);
         byte var14 = c.kind(var12);
         byte var16 = (byte)((c.possible(var12)) ? 1 : 0);
         if (var16 == (332608078 ^ var27)) {
            var27 = 1911430892 ^ var27;
            byte var18 = (byte)((m.isBase(var14)) ? 1 : 0);
            if (var18 == (1648176290 ^ var27)) {
               var27 = 1063407645 ^ var27;
               return (byte)(-1566538944 ^ var27);
            }

            var27 = 678265462 ^ var27;
            var5 = var14;
            var6 += 1246801621 ^ var27;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var27)) {
                  case 268179690:
                     var27 ^= 448390111;
                     continue label47;
                  case 432547301:
                  default:
                     throw new IllegalStateException();
                  case 978572427:
                     continue label47;
                  case 1783281862:
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var27)) {
                  case 107553444:
                     var27 ^= 1317818097;
                     return (byte)(-1566538944 ^ var27);
                  case 1286957385:
                     break;
                  case 1540318220:
                  default:
                     throw new IllegalStateException();
                  case 1713236485:
                     return (byte)(-1566538944 ^ var27);
               }
            }
         }
      }
   }

   static {
      int var3 = new Random(3931763685644858278L).nextInt();
      dEzHvXmWRe = -1916499151 ^ var3;
   }

   public static String qqhohlezdl(byte[] var0, int var1) {
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
      String var29 = nvsyjbywzz;
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
            Charset var91 = StandardCharsets.UTF_16BE;
            return new String(var11, var91);
         }

         byte var85 = var11[var12];
         int var93 = var8.length;
         int var92 = var12 % var93;
         byte var90 = var8[var92];
         int var86 = var85 ^ var90;
         byte var87 = (byte)var86;
         var11[var12] = var87;
         var12++;
      }
   }

   private static byte[] rxlnqfrfhucmgju() {
      return new byte[0];
   }

   private static int vfxabiwiqysfbnck(int var0, int var1) {
      return var0 ^ var1;
   }
}
