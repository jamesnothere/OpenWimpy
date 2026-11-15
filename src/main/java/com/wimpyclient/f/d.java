package com.wimpyclient.f;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongListIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.Long2IntMap.Entry;
import it.unimi.dsi.fastutil.longs.Long2IntMap.FastEntrySet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.ChunkPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class d {
   private static final int MIN_OVERLAP = 2;
   private static final int GEODE_CLEARANCE_CHUNKS = 4;
   private static final int PEAK_SPACING_CHUNKS = 3;
   private static int Ksq3L4ktmI;
   private transient int mwhxMe6K4a;
   private static byte[] upwknmbfre = yfzdsvekepufdrj();

   private d() {
super();
      int var4 = 603816660 ^ 5895502;
      
      var4 = 2021670537 ^ var4;
      var4 = 1298059510 ^ 1340719390 ^ Integer.parseInt("1502828795");
      this.mwhxMe6K4a = 1502011978 ^ Ksq3L4ktmI;
      var4 = okgpeeeeufhazykh(var4, 1721112172);
   }

   public static Long2IntOpenHashMap findOverlapVotes(LongArrayList var0, int var1) {
      int var163 = 1014547360 ^ 2138124654 ^ 676019951;
      var163 = 77705435 ^ var163;
      Long2IntOpenHashMap var2 = new Long2IntOpenHashMap();
      Long2IntOpenHashMap var5 = var2;
      byte var112 = (byte)(1877179642 ^ var163);
      var2.defaultReturnValue(var112);
      if (var0 != null) {
         var163 = 444559402 ^ var163;
         byte var26 = (byte)((var0.isEmpty()) ? 1 : 0);
         if (var26 == (1973161168 ^ var163)) {
            var163 = 376162374 ^ var163;
            byte var113 = (byte)(1677182103 ^ var163);
            if (var1 >= var113) {
               var163 = 727162817 ^ var163;
               int var146 = var0.size();
               ArrayList var28 = new ArrayList(var146);
               ArrayList var6 = var28;
               LongOpenHashSet var29 = new LongOpenHashSet();
               LongOpenHashSet var7 = var29;
               byte var30 = (byte)(1218468695 ^ var163);
               int var8 = var30;
               var163 = 278508423 ^ var163;

               while (true) {
                  int var115 = var0.size();
                  if (var8 >= var115) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var163)) {
                           case 23199797:
                              break;
                           case 183528234:
                              var163 ^= 1693342370;
                           case 1342668738:
                              List var40 = groupByProximity(var6, var1);
                              Iterator var41 = var40.iterator();
                              Iterator var154 = var41;
                              var163 = 1050075283 ^ var163;

                              label169:
                              while (true) {
                                 byte var43 = (byte)((var154.hasNext()) ? 1 : 0);
                                 if (var43 == (37835489 ^ var163)) {
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var163)) {
                                          case 35471347:
                                             var163 = 75378754 ^ var163;
                                             return var5;
                                          case 451172313:
                                             return var5;
                                          case 1339501302:
                                             break;
                                          case 1569991808:
                                          default:
                                             throw new RuntimeException(new IOException());
                                       }
                                    }
                                 }

                                 var163 = 158915069 ^ var163;
                                 Object var46 = var154.next();
                                 List var47 = (List)var46;
                                 List var155 = var47;
                                 int var49 = var47.size();
                                 byte var123 = (byte)(188320542 ^ var163);
                                 if (var49 < var123) {
                                    var163 = 939816686 ^ var163;
                                    var163 = 830254867 ^ var163;
                                 } else {
                                    var163 = 2022914236 ^ var163;
                                    Long2IntOpenHashMap var50 = new Long2IntOpenHashMap();
                                    Long2IntOpenHashMap var11 = var50;
                                    byte var124 = (byte)(1940566944 ^ var163);
                                    var50.defaultReturnValue(var124);
                                    byte var52 = (byte)(1940566944 ^ var163);
                                    int var12 = var52;
                                    Iterator var54 = var47.iterator();
                                    Iterator var13 = var54;
                                    var163 = 1717830520 ^ var163;

                                    while (true) {
                                       byte var56 = (byte)((var13.hasNext()) ? 1 : 0);
                                       if (var56 == (365867224 ^ var163)) {
                                          label139:
                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var163)) {
                                                case 85161474:
                                                   break label139;
                                                case 171991916:
                                                   var163 ^= 676391661;
                                                   break label139;
                                                case 1300833324:
                                                default:
                                                   throw new RuntimeException(new IOException());
                                                case 1890244862:
                                             }
                                          }

                                          byte var125 = (byte)(1033787959 ^ var163);
                                          if (var12 < var125) {
                                             var163 = 1434911599 ^ var163;
                                             var163 = okgpeeeeufhazykh(var163, 1784155067);
                                             break;
                                          }

                                          var163 = okgpeeeeufhazykh(var163, 1359990887);
                                          LongOpenHashSet var58 = new LongOpenHashSet();
                                          LongOpenHashSet var156 = var58;
                                          FastEntrySet var60 = var11.long2IntEntrySet();
                                          ObjectIterator var61 = var60.iterator();
                                          ObjectIterator var14 = var61;
                                          var163 = 1659562150 ^ var163;

                                          label132:
                                          while (true) {
                                             byte var63 = (byte)((var14.hasNext()) ? 1 : 0);
                                             if (var63 == (242967284 ^ var163)) {
                                                var163 = 1047218121 ^ var163;
                                                LongArrayList var65 = collapseToSparsePeaks(var156);
                                                LongListIterator var66 = var65.iterator();
                                                LongListIterator var157 = var66;
                                                var163 = 2141760795 ^ var163;

                                                label117:
                                                while (true) {
                                                   byte var68 = (byte)((var157.hasNext()) ? 1 : 0);
                                                   if (var68 == (1337493542 ^ var163)) {
                                                      label99:
                                                      while (true) {
                                                         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var163)) {
                                                            case 76876116:
                                                               break label99;
                                                            case 175491185:
                                                               var163 ^= 1343158855;
                                                               break label99;
                                                            case 516294685:
                                                            default:
                                                               throw new RuntimeException(new IOException());
                                                            case 1858174093:
                                                         }
                                                      }

                                                      var163 = okgpeeeeufhazykh(var163, 502734976);
                                                      continue label169;
                                                   }

                                                   var163 = 663118355 ^ var163;
                                                   Object var70 = var157.next();
                                                   Long var71 = (Long)var70;
                                                   long var72 = var71;
                                                   byte var75 = (byte)((var7.contains(var72)) ? 1 : 0);
                                                   if (var75 != (1748953653 ^ var163)) {
                                                      var163 = 1155560912 ^ var163;
                                                      var163 = 1667635139 ^ var163;
                                                   } else {
                                                      var163 = 824672459 ^ var163;
                                                      int var129 = var5.get(var72);
                                                      if (var12 > var129) {
                                                         var163 = 1200335536 ^ var163;
                                                         int var78 = var5.put(var72, var12);
                                                         var163 = 1332150961 ^ var163;
                                                      } else {
                                                         var163 = okgpeeeeufhazykh(var163, 149727233);
                                                      }

                                                      while (true) {
                                                         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var163)) {
                                                            case 229592010:
                                                            default:
                                                               throw new RuntimeException(new IOException());
                                                            case 248281147:
                                                               var163 ^= 508381913;
                                                               continue label117;
                                                            case 391332146:
                                                               break;
                                                            case 1097339204:
                                                               continue label117;
                                                         }
                                                      }
                                                   }
                                                }
                                             }

                                             var163 = 1874255861 ^ var163;
                                             Object var80 = var14.next();
                                             Entry var81 = (Entry)var80;
                                             int var83 = var81.getIntValue();
                                             if (var83 == var12) {
                                                var163 = 1247303116 ^ var163;
                                                long var134 = var81.getLongKey();
                                                boolean var85 = var156.add(var134);
                                                var163 = 100876329 ^ var163;
                                             } else {
                                                var163 = okgpeeeeufhazykh(var163, 1281037797);
                                             }

                                             while (true) {
                                                switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var163)) {
                                                   case 139709103:
                                                      var163 ^= 602786320;
                                                   case 768813296:
                                                      continue label132;
                                                   case 1424407227:
                                                   default:
                                                      throw new RuntimeException(new IOException());
                                                   case 1705150320:
                                                }
                                             }
                                          }
                                       }

                                       var163 = 460850685 ^ var163;
                                       Object var87 = var13.next();
                                       Long var88 = (Long)var87;
                                       long var89 = var88;
                                       ChunkPos var91 = new ChunkPos(var89);
                                       ChunkPos var17 = var91;
                                       int var93 = -var1;
                                       int var18 = var93;
                                       var163 = 2045412144 ^ var163;

                                       while (var18 <= var1) {
                                          var163 = 1275373541 ^ var163;
                                          int var96 = -var1;
                                          int var19 = var96;
                                          var163 = 1590730454 ^ var163;

                                          while (var19 <= var1) {
                                             var163 = 1165442473 ^ var163;
                                             int var99 = var17.x;
                                             int var100 = var99 + var18;
                                             int var140 = var17.z;
                                             int var141 = var140 + var19;
                                             long var101 = ChunkPos.asLong(var100, var141);
                                             byte var105 = (byte)((tooCloseToGeode(var101, var155)) ? 1 : 0);
                                             if (var105 != (553595535 ^ var163)) {
                                                var163 = 98410839 ^ var163;
                                                var163 = okgpeeeeufhazykh(var163, 314219881);
                                             } else {
                                                var163 = 158661187 ^ var163;
                                                byte var153 = (byte)(697026765 ^ var163);
                                                int var107 = var11.addTo(var101, var153);
                                                byte var144 = (byte)(697026765 ^ var163);
                                                int var108 = var107 + var144;
                                                if (var108 > var12) {
                                                   var163 = 1622105220 ^ var163;
                                                   var12 = var108;
                                                   var163 = 2126289657 ^ var163;
                                                } else {
                                                   var163 = okgpeeeeufhazykh(var163, 504612477);
                                                }
                                             }

                                             var19 += 932712112 ^ var163;
                                             var163 = 1376780695 ^ var163;
                                          }

                                          var163 = 876278098 ^ var163;
                                          var18 += 1370685045 ^ var163;
                                          var163 = 653183073 ^ var163;
                                       }

                                       label161:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var163)) {
                                             case 3157399:
                                                break label161;
                                             case 121823124:
                                                var163 ^= 1540146635;
                                                break label161;
                                             case 794394206:
                                                break;
                                             case 1642456532:
                                             default:
                                                throw new RuntimeException(new IOException());
                                          }
                                       }

                                       var163 = okgpeeeeufhazykh(var163, 962478854);
                                    }
                                 }
                              }
                           case 2004495318:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }

                  var163 = 1763414992 ^ var163;
                  long var33 = var0.getLong(var8);
                  Long var119 = var33;
                  boolean var36 = var6.add(var119);
                  boolean var38 = var7.add(var33);
                  var8 += 824343297 ^ var163;
                  var163 = okgpeeeeufhazykh(var163, 1763414992);
               }
            }

            var163 = 1215630692 ^ var163;
         } else {
            var163 = okgpeeeeufhazykh(var163, 1579074850);
         }
      } else {
         var163 = okgpeeeeufhazykh(var163, 1147254024);
      }

      return var2;
   }

   public static int likelihoodFromVotes(int var0) {
      int var13 = 2004024125 ^ 1775309199 ^ 676019951;
      var13 = 1293195148 ^ var13;
      byte var2 = (byte)(2080130003 ^ var13);
      if (var0 < var2) {
         var13 = 1576387225 ^ var13;
         return (byte)(638157128 ^ var13);
      } else {
         var13 = okgpeeeeufhazykh(var13, 2035390312);
         byte var5 = (byte)(44946650 ^ var13);
         byte var8 = (byte)(44946586 ^ var13);
         byte var4 = (byte)(44946603 ^ var13);
         int var10 = var0 * var4;
         int var9 = var8 + var10;
         return Math.min(var5, var9);
      }
   }

   private static boolean tooCloseToGeode(long var0, List<Long> var2) {
      int var41 = 1175414453 ^ 1620121032 ^ 676019951;
      var41 = 1096789015 ^ var41;
      ChunkPos var3 = new ChunkPos(var0);
      ChunkPos var6 = var3;
      Iterator var12 = var2.iterator();
      Iterator var7 = var12;
      var41 = 1539991328 ^ var41;

      while (true) {
         byte var14 = (byte)((var7.hasNext()) ? 1 : 0);
         if (var14 == (339773093 ^ var41)) {
            var41 = 1881331945 ^ var41;
            return (((byte)(1684168268 ^ var41)) != 0);
         }

         var41 = 1841892247 ^ var41;
         Object var17 = var7.next();
         Long var18 = (Long)var17;
         long var19 = var18;
         ChunkPos var21 = new ChunkPos(var19);
         int var23 = var6.x;
         int var29 = var21.x;
         int var24 = var23 - var29;
         int var25 = Math.abs(var24);
         int var31 = var6.z;
         int var38 = var21.z;
         int var32 = var31 - var38;
         int var33 = Math.abs(var32);
         int var26 = Math.max(var25, var33);
         byte var34 = (byte)(2039057718 ^ var41);
         if (var26 <= var34) {
            var41 = 470707344 ^ var41;
            return (((byte)(1703403939 ^ var41)) != 0);
         }

         var41 = okgpeeeeufhazykh(var41, 1519583847);
         var41 = okgpeeeeufhazykh(var41, 928647664);
      }
   }

   private static LongArrayList collapseToSparsePeaks(LongOpenHashSet var0) {
      int var183 = 233992335 ^ 423781944 ^ 676019951;
      var183 = 549555493 ^ var183;
      LongArrayList var1 = new LongArrayList();
      LongArrayList var5 = var1;
      LongOpenHashSet var25 = new LongOpenHashSet(var0);
      LongOpenHashSet var6 = var25;
      var183 = 2060705911 ^ var183;

      label180:
      while (true) {
         byte var27 = (byte)((var6.isEmpty()) ? 1 : 0);
         if (var27 == (1726563594 ^ var183)) {
            var183 = 2077740431 ^ var183;
            LongIterator var29 = var6.iterator();
            long var30 = var29.nextLong();
            ArrayDeque var32 = new ArrayDeque();
            ArrayDeque var10 = var32;
            Long var102 = var30;
            boolean var34 = var32.add(var102);
            boolean var36 = var6.remove(var30);
            long var37 = 0L;
            long var11 = var37;
            long var39 = 0L;
            long var14 = var39;
            byte var41 = (byte)(490637445 ^ var183);
            int var17 = var41;
            var183 = 336464215 ^ var183;

            while (true) {
               byte var43 = (byte)((var10.isEmpty()) ? 1 : 0);
               if (var43 != (154173906 ^ var183)) {
                  var183 = okgpeeeeufhazykh(var183, 684326531);
                  if (var17 > (569999185 ^ var183)) {
                     var183 = 1868984879 ^ var183;
                     double var121 = var11;
                     double var171 = var17;
                     double var123 = var121 / var171;
                     long var125 = Math.round(var123);
                     int var127 = (int)var125;
                     double var157 = var14;
                     double var174 = var17;
                     double var159 = var157 / var174;
                     long var161 = Math.round(var159);
                     int var163 = (int)var161;
                     long var128 = ChunkPos.asLong(var127, var163);
                     boolean var78 = var5.add(var128);
                     var183 = 1974218959 ^ var183;
                  } else {
                     var183 = 449463008 ^ var183;
                  }

                  var183 = 1574598843 ^ var183;
                  continue label180;
               }

               var183 = 624011973 ^ var183;
               Object var45 = var10.removeFirst();
               Long var46 = (Long)var45;
               long var47 = var46;
               ChunkPos var49 = new ChunkPos(var47);
               ChunkPos var20 = var49;
               int var147 = var49.x;
               long var148 = var147;
               long var52 = var11 + var148;
               var11 = var52;
               int var151 = var49.z;
               long var152 = var151;
               long var56 = var14 + var152;
               var14 = var56;
               var17 += 738274070 ^ var183;
               byte var58 = (byte)(-738274072 ^ var183);
               int var21 = var58;
               var183 = 1511629051 ^ var183;

               label110:
               while (true) {
                  byte var105 = (byte)(1981320173 ^ var183);
                  if (var21 > var105) {
                     label119:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var183)) {
                           case 80738561:
                              var183 ^= 1964855825;
                              break label119;
                           case 1058282624:
                              break;
                           case 1333822162:
                              break label119;
                           case 1960017945:
                           default:
                              throw new IllegalStateException();
                        }
                     }

                     var183 = 171268143 ^ var183;
                     break;
                  }

                  var183 = 1250500220 ^ var183;
                  byte var60 = (byte)(-1016173969 ^ var183);
                  int var22 = var60;
                  var183 = 1970902860 ^ var183;

                  while (true) {
                     byte var106 = (byte)(1239941853 ^ var183);
                     if (var22 > var106) {
                        label95:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var183)) {
                              case 254921826:
                                 var183 ^= 1614451754;
                                 break label95;
                              case 400463664:
                                 break;
                              case 1483983591:
                              default:
                                 throw new IllegalStateException();
                              case 1824970311:
                                 break label95;
                           }
                        }

                        var21 += 701667063 ^ var183;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var183)) {
                              case 17313198:
                                 var183 ^= 1607081242;
                                 continue label110;
                              case 496707794:
                              default:
                                 throw new IllegalStateException();
                              case 730952655:
                                 continue label110;
                              case 1114815069:
                           }
                        }
                     }

                     label83: {
                        var183 = 1313455651 ^ var183;
                        if (var21 == (128040191 ^ var183)) {
                           var183 = 846034120 ^ var183;
                           if (var22 == (902613047 ^ var183)) {
                              var183 = 2143413982 ^ var183;
                              var183 = 286411244 ^ var183;
                              break label83;
                           }

                           label80:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var183)) {
                                 case 30296385:
                                    break label80;
                                 case 138212902:
                                    var183 ^= 74045734;
                                    break label80;
                                 case 762625968:
                                 default:
                                    throw new IllegalStateException();
                                 case 925132531:
                              }
                           }
                        } else {
                           var183 = okgpeeeeufhazykh(var183, 906276334);
                        }

                        int var65 = Math.abs(var21);
                        int var108 = Math.abs(var22);
                        int var66 = var65 + var108;
                        byte var109 = (byte)(832901392 ^ var183);
                        if (var66 != var109) {
                           var183 = 307878964 ^ var183;
                           var183 = 2028186144 ^ var183;
                        } else {
                           var183 = 1975753349 ^ var183;
                           int var68 = var20.x;
                           int var69 = var68 + var21;
                           int var112 = var20.z;
                           int var113 = var112 + var22;
                           long var70 = ChunkPos.asLong(var69, var113);
                           byte var73 = (byte)((var6.remove(var70)) ? 1 : 0);
                           if (var73 != (1147571092 ^ var183)) {
                              var183 = 368373923 ^ var183;
                              Long var118 = var70;
                              boolean var75 = var10.add(var118);
                              var183 = 177019954 ^ var183;
                           } else {
                              var183 = okgpeeeeufhazykh(var183, 528084113);
                           }
                        }
                     }

                     var22 += 1528784644 ^ var183;
                     var183 = 318203353 ^ var183;
                  }
               }
            }
         }

         var183 = 1212167577 ^ var183;
         LongArrayList var79 = new LongArrayList();
         LongArrayList var176 = var79;
         byte var80 = (byte)(782856339 ^ var183);
         int var9 = var80;
         var183 = 1890497300 ^ var183;

         label178:
         while (true) {
            int var131 = var5.size();
            if (var9 >= var131) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var183)) {
                     case 19727585:
                        return var176;
                     case 103765202:
                        var183 = 1789103798 ^ var183;
                        return var176;
                     case 110621538:
                     default:
                        throw new IllegalStateException();
                     case 1223120785:
                  }
               }
            }

            var183 = 1441811311 ^ var183;
            long var83 = var5.getLong(var9);
            ChunkPos var85 = new ChunkPos(var83);
            ChunkPos var13 = var85;
            byte var86 = (byte)(200771816 ^ var183);
            byte var179 = var86;
            byte var87 = (byte)(200771816 ^ var183);
            int var16 = var87;
            var183 = 550036706 ^ var183;

            label151:
            while (true) {
               int var134 = var176.size();
               if (var16 >= var134) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var183)) {
                        case 63621740:
                           var183 ^= 2065081271;
                           break label151;
                        case 372780559:
                           break;
                        case 457049246:
                           break label151;
                        case 1453040278:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               }

               var183 = 869685328 ^ var183;
               long var167 = var176.getLong(var16);
               ChunkPos var89 = new ChunkPos(var167);
               int var91 = var13.x;
               int var136 = var89.x;
               int var92 = var91 - var136;
               int var93 = Math.abs(var92);
               int var138 = var13.z;
               int var170 = var89.z;
               int var139 = var138 - var170;
               int var140 = Math.abs(var139);
               int var94 = Math.max(var93, var140);
               byte var141 = (byte)(417936473 ^ var183);
               if (var94 <= var141) {
                  var183 = 1901864254 ^ var183;
                  byte var95 = (byte)(1773474149 ^ var183);
                  var179 = var95;
                  var183 = 966581977 ^ var183;
                  break;
               }

               var183 = okgpeeeeufhazykh(var183, 684336851);
               var16 += 807604872 ^ var183;
               var183 = 454852227 ^ var183;
            }

            if (var179 == (1344917437 ^ var183)) {
               var183 = 346482880 ^ var183;
               boolean var98 = var176.add(var83);
               var183 = 737669201 ^ var183;
            } else {
               label163:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var183)) {
                     case 69492958:
                        break label163;
                     case 189878871:
                        var183 ^= 1062279313;
                        break label163;
                     case 1035732985:
                     default:
                        throw new IllegalStateException();
                     case 1224509157:
                  }
               }
            }

            var9 += 1870190381 ^ var183;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var183)) {
                  case 133844893:
                     var183 ^= 830411947;
                     continue label178;
                  case 281881079:
                     break;
                  case 1437113252:
                  default:
                     throw new IllegalStateException();
                  case 1803993756:
                     continue label178;
               }
            }
         }
      }
   }

   private static List<List<Long>> groupByProximity(List<Long> var0, int var1) {
      int var145 = 930609762 ^ 1339723156 ^ 676019951;
      var145 = 1320277936 ^ var145;
      ArrayList var2 = new ArrayList();
      ArrayList var6 = var2;
      LongOpenHashSet var28 = new LongOpenHashSet(var0);
      LongOpenHashSet var7 = var28;
      double var30 = var1;
      double var125 = 2.5;
      double var32 = var30 * var125;
      double var36 = var32 * var32;
      double var10 = var36;
      var145 = 630590355 ^ var145;

      while (true) {
         byte var39 = (byte)((var7.isEmpty()) ? 1 : 0);
         if (var39 != (1002542394 ^ var145)) {
            var145 = 1483177044 ^ var145;
            return var6;
         }

         var145 = 350406536 ^ var145;
         LongIterator var41 = var7.iterator();
         long var42 = var41.nextLong();
         boolean var45 = var7.remove(var42);
         ArrayList var46 = new ArrayList();
         ArrayList var14 = var46;
         ArrayDeque var47 = new ArrayDeque();
         ArrayDeque var15 = var47;
         Long var106 = var42;
         boolean var49 = var47.add(var106);
         var145 = 1916135764 ^ var145;

         label43:
         while (true) {
            byte var51 = (byte)((var15.isEmpty()) ? 1 : 0);
            if (var51 != (1561770982 ^ var145)) {
               label51:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var145)) {
                     case 73158939:
                        var145 ^= 820609932;
                        break label51;
                     case 1039591319:
                     default:
                        throw new RuntimeException();
                     case 1400031745:
                        break label51;
                     case 1734913631:
                  }
               }

               boolean var53 = var6.add(var14);
               var145 = okgpeeeeufhazykh(var145, 1446948176);
               break;
            }

            var145 = 392933370 ^ var145;
            Object var55 = var15.removeFirst();
            Long var56 = (Long)var55;
            long var57 = var56;
            Long var110 = var57;
            boolean var60 = var14.add(var110);
            ChunkPos var61 = new ChunkPos(var57);
            ChunkPos var18 = var61;
            LongArrayList var62 = new LongArrayList();
            LongArrayList var19 = var62;
            LongIterator var64 = var7.iterator();
            LongIterator var20 = var64;
            var145 = 732728582 ^ var145;

            while (true) {
               byte var66 = (byte)((var20.hasNext()) ? 1 : 0);
               if (var66 == (1641126170 ^ var145)) {
                  var145 = okgpeeeeufhazykh(var145, 2033077204);
                  byte var92 = (byte)(419418830 ^ var145);
                  int var141 = var92;
                  var145 = 1901300371 ^ var145;

                  while (true) {
                     int var118 = var19.size();
                     if (var141 >= var118) {
                        var145 = okgpeeeeufhazykh(var145, 716998019);
                        var145 = 503735864 ^ var145;
                        continue label43;
                     }

                     var145 = 1081530367 ^ var145;
                     long var95 = var19.getLong(var141);
                     boolean var98 = var7.remove(var95);
                     Long var124 = var95;
                     boolean var100 = var15.add(var124);
                     var141 += 702189475 ^ var145;
                     var145 = 1081530367 ^ var145;
                  }
               }

               var145 = 901774459 ^ var145;
               Object var68 = var20.next();
               Long var69 = (Long)var68;
               long var70 = var69;
               ChunkPos var72 = new ChunkPos(var70);
               int var74 = var18.x;
               int var112 = var72.x;
               int var75 = var74 - var112;
               double var76 = var75;
               int var79 = var18.z;
               int var114 = var72.z;
               int var80 = var79 - var114;
               double var81 = var80;
               double var85 = var76 * var76;
               double var137 = var81 * var81;
               double var87 = var85 + var137;
               double var160;
               int var89 = (var160 = var87 - var10) == 0.0 ? 0 : (var160 < 0.0 ? -1 : 1);
               if (var89 <= (1416521057 ^ var145)) {
                  var145 = 869102805 ^ var145;
                  boolean var91 = var19.add(var70);
                  var145 = 1800508363 ^ var145;
               } else {
                  var145 = okgpeeeeufhazykh(var145, 1486677790);
               }

               var145 = okgpeeeeufhazykh(var145, 1831017317);
            }
         }
      }
   }

   static {
      int var3 = new Random(2501628973649936644L).nextInt();
      Ksq3L4ktmI = -452535412 ^ var3;
   }

   public static String lnpvamzyoi(byte[] var0, int var1) {
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
         byte[] var28 = upwknmbfre;
         byte[] var34 = upwknmbfre;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] yfzdsvekepufdrj() {
      return new byte[]{112};
   }

   private static int okgpeeeeufhazykh(int var0, int var1) {
      return var0 ^ var1;
   }
}
