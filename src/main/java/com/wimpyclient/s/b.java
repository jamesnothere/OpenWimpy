package com.wimpyclient.s;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b {
   public static final int JUDGED_MIN_Y = 0;
   public static final int JUDGED_MAX_Y = 30;
   public static final double MIN_MATCH = 0.6;
   public static final int MIN_JUDGED = 8;
   public static final int MAX_FILLED = 3;
   public static final int MAX_CLUSTER = 20000;
   public static final int SHELL_MODEL_CAVE = 16;
   public static final int SHELL_JUDGED = 32;
   public static final int SHELL_STONE = 64;
   private static final Set<Block> NATURAL;
   private static final Set<Block> FAKES;
   private static final Map<Block, Boolean> STRUCTURE;
   private static int ChbtRFWcht;
   private transient int IGK0OejPbp;

   private b() {
super();
      int var4 = 1283412298 ^ 155272648;
      
      var4 = 568949201 ^ var4;
      var4 = 1924002998 ^ 504087421 ^ Integer.parseInt("141646488");
      this.IGK0OejPbp = 1090745133 ^ ChbtRFWcht;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 56690439:
               var4 = 924559520 ^ var4;
            case 1464488749:
               return;
            case 1432802043:
               break;
            case 1684088315:
            default:
               throw new RuntimeException();
         }
      }
   }

   public static List<b$c> clusters(int var0, int var1, b$e var2) {
      int var111 = 953547998 ^ 1577499343 ^ 189043002;
      var111 = 1469262773 ^ var111;
      ArrayList var3 = new ArrayList();
      ArrayList var7 = var3;
      n var23 = var2.band(var0, var1);
      n var8 = var23;
      if (var23 == null) {
         var111 = 509036957 ^ var111;
         return var3;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
               case 6919030:
                  var111 ^= 1304921597;
               case 1485896221:
                  b$a var26 = new b$a(var2);
                  b$a var9 = var26;
                  byte var27 = (byte)(2009299303 ^ var111);
                  byte[] var28 = new byte[var27];
                  byte var93 = (byte)(2009299299 ^ var111);
                  byte var5 = (byte)(2009299303 ^ var111);
                  var28[var93] = var5;
                  byte var94 = (byte)(2009299298 ^ var111);
                  byte var104 = (byte)(2009299302 ^ var111);
                  var28[var94] = var104;
                  byte var95 = (byte)(2009299297 ^ var111);
                  byte var105 = (byte)(2009299301 ^ var111);
                  var28[var95] = var105;
                  byte var96 = (byte)(2009299296 ^ var111);
                  byte var106 = (byte)(2009299307 ^ var111);
                  var28[var96] = var106;
                  byte[] var10 = var28;
                  int var30 = var28.length;
                  int var11 = var30;
                  byte var31 = (byte)(2009299299 ^ var111);
                  int var12 = var31;
                  var111 = 2117543198 ^ var111;

                  label133:
                  while (var12 < var11) {
                     var111 = 1920257562 ^ var111;
                     byte var35 = var10[var12];
                     byte var13 = var35;
                     int var37 = m.familyBit(var35);
                     int var14 = var37;
                     LongOpenHashSet var38 = new LongOpenHashSet();
                     LongOpenHashSet var15 = var38;
                     byte var39 = (byte)(2072023655 ^ var111);
                     int var16 = var39;
                     var111 = 748410566 ^ var111;

                     label109:
                     while (true) {
                        byte var73 = (byte)(1461404863 ^ var111);
                        if (var16 > var73) {
                           label118:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                 case 147096556:
                                    var111 ^= 1515910596;
                                    break label118;
                                 case 366580582:
                                    break;
                                 case 1751559064:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1755161356:
                                    break label118;
                              }
                           }

                           var12 += 222409060 ^ var111;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                 case 38132949:
                                    break;
                                 case 162482930:
                                    var111 ^= 79031576;
                                    continue label133;
                                 case 292522582:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 545267996:
                                    continue label133;
                              }
                           }
                        }

                        var111 = 447395382 ^ var111;
                        byte var74 = (byte)(1303507603 ^ var111);
                        int var42 = var1 << var74;
                        int var17 = var42;
                        var111 = 1314176347 ^ var111;

                        label85:
                        while (true) {
                           byte var97 = (byte)(65359816 ^ var111);
                           int var76 = var1 << var97;
                           byte var98 = (byte)(65359836 ^ var111);
                           int var77 = var76 + var98;
                           if (var17 >= var77) {
                              label94:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                    case 61274410:
                                       var111 ^= 1462054420;
                                    case 1182496460:
                                       break label94;
                                    case 1217297355:
                                       break;
                                    case 1954813092:
                                    default:
                                       throw new RuntimeException(new IOException());
                                 }
                              }

                              var16 += 1421894105 ^ var111;

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                    case 70576466:
                                       var111 ^= 64693625;
                                    case 1399798360:
                                       continue label109;
                                    case 1498328753:
                                       break;
                                    case 1684647935:
                                    default:
                                       throw new RuntimeException(new IOException());
                                 }
                              }
                           }

                           var111 = 536120294 ^ var111;
                           byte var78 = (byte)(470926382 ^ var111);
                           int var45 = var0 << var78;
                           int var18 = var45;
                           var111 = 1959491166 ^ var111;

                           while (true) {
                              byte var99 = (byte)(1759162992 ^ var111);
                              int var80 = var0 << var99;
                              byte var100 = (byte)(1759162980 ^ var111);
                              int var81 = var80 + var100;
                              if (var18 >= var81) {
                                 label70:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                       case 88263786:
                                       default:
                                          throw new RuntimeException(new IOException());
                                       case 187158810:
                                          var111 ^= 571795718;
                                       case 1011510483:
                                          break label70;
                                       case 1113263548:
                                    }
                                 }

                                 var17 += 1255037811 ^ var111;

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                       case 15703010:
                                          var111 ^= 1227560126;
                                          continue label85;
                                       case 113391516:
                                          break;
                                       case 222534503:
                                          continue label85;
                                       case 475078622:
                                       default:
                                          throw new RuntimeException(new IOException());
                                    }
                                 }
                              }

                              var111 = 1669340734 ^ var111;
                              int var48 = var8.families(var18, var16, var17);
                              int var49 = var48 & var14;
                              if (var49 != (190491722 ^ var111)) {
                                 var111 = 789077864 ^ var111;
                                 long var51 = BlockPos.asLong(var18, var16, var17);
                                 byte var54 = (byte)((var15.contains(var51)) ? 1 : 0);
                                 if (var54 == (609415970 ^ var111)) {
                                    var111 = 1649660215 ^ var111;
                                    b$c var57 = cluster(var51, var13, var9, var15);
                                    long var59 = var57.owner();
                                    int var61 = BlockPos.getX(var59);
                                    byte var87 = (byte)(1174479377 ^ var111);
                                    int var62 = var61 >> var87;
                                    if (var62 == var0) {
                                       var111 = 587935266 ^ var111;
                                       long var64 = var57.owner();
                                       int var66 = BlockPos.getZ(var64);
                                       byte var89 = (byte)(1695157299 ^ var111);
                                       int var67 = var66 >> var89;
                                       if (var67 == var1) {
                                          var111 = 980469405 ^ var111;
                                          boolean var69 = var7.add(var57);
                                          var111 = 437531659 ^ var111;
                                       } else {
                                          var111 = nsttnqkwnjybhduw(var111, 543486614);
                                       }
                                    } else {
                                       var111 = nsttnqkwnjybhduw(var111, 57662644);
                                    }
                                 } else {
                                    var111 = 1631325571 ^ var111;
                                 }
                              } else {
                                 var111 = 1312051947 ^ var111;
                              }

                              var18 += 1164902048 ^ var111;
                              var111 = nsttnqkwnjybhduw(var111, 766790869);
                           }
                        }
                     }
                  }

                  var111 = nsttnqkwnjybhduw(var111, 266169295);
                  return var7;
               case 1775390342:
               default:
                  throw new RuntimeException(new IOException());
               case 1866354073:
            }
         }
      }
   }

   private static b$c cluster(long var0, byte var2, b$a var3, LongOpenHashSet var4) {
      int var329 = 786811035 ^ 840396046 ^ 189043002;
      var329 = 1630764580 ^ var329;
      int var41 = m.familyBit(var2);
      int var14 = var41;
      LongArrayList var42 = new LongArrayList();
      LongArrayList var15 = var42;
      LongOpenHashSet var43 = new LongOpenHashSet();
      LongOpenHashSet var16 = var43;
      LongArrayFIFOQueue var44 = new LongArrayFIFOQueue();
      LongArrayFIFOQueue var17 = var44;
      var44.enqueue(var0);
      boolean var47 = var43.add(var0);
      byte var48 = (byte)(1988446859 ^ var329);
      byte var18 = var48;
      byte var49 = (byte)(1988446859 ^ var329);
      byte var19 = var49;
      byte var50 = (byte)(1988446859 ^ var329);
      byte var20 = var50;
      long var21 = var0;
      var329 = 1647479094 ^ var329;

      label317:
      while (true) {
         byte var54 = (byte)((var17.isEmpty()) ? 1 : 0);
         if (var54 == (347587517 ^ var329)) {
            var329 = 126883845 ^ var329;
            long var56 = var17.dequeueLong();
            boolean var59 = var15.add(var56);
            int var62 = BlockPos.getY(var56);
            if (var62 >= (321379256 ^ var329)) {
               var329 = 1914015863 ^ var329;
               byte var212 = (byte)(1630686161 ^ var329);
               if (var62 > var212) {
                  var329 = 1800100639 ^ var329;
               } else {
                  label297: {
                     var329 = 2050966066 ^ var329;
                     if (var20 != (453839357 ^ var329)) {
                        var329 = 2136815438 ^ var329;
                        byte var68 = (byte)((before(var56, var21)) ? 1 : 0);
                        if (var68 == (1682980531 ^ var329)) {
                           var329 = nsttnqkwnjybhduw(var329, 1169474689);
                           break label297;
                        }

                        var329 = 1226512360 ^ var329;
                     } else {
                        label295:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var329)) {
                              case 74012759:
                                 var329 ^= 910565542;
                                 break label295;
                              case 439097622:
                                 break;
                              case 1026792305:
                              default:
                                 throw new RuntimeException();
                              case 1524135411:
                                 break label295;
                           }
                        }
                     }

                     var21 = var56;
                     var329 = 212849513 ^ var329;
                  }

                  byte var71 = (byte)(568654387 ^ var329);
                  var20 = var71;
                  var329 = 731769570 ^ var329;
               }
            } else {
               label307:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var329)) {
                     case 85797523:
                        var329 ^= 425642856;
                        break label307;
                     case 248830842:
                        break;
                     case 958910868:
                        break label307;
                     case 1984892148:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            int var73 = var15.size();
            short var213 = (short)(175726320 ^ var329);
            if (var73 <= var213) {
               var329 = 2058743757 ^ var329;
               int var76 = BlockPos.getX(var56);
               int var27 = var76;
               int var79 = BlockPos.getY(var56);
               int var28 = var79;
               int var82 = BlockPos.getZ(var56);
               int var29 = var82;
               byte var83 = (byte)(-1892482846 ^ var329);
               int var30 = var83;
               var329 = 173709687 ^ var329;

               label195:
               while (true) {
                  byte var214 = (byte)(2056676971 ^ var329);
                  if (var30 > var214) {
                     var329 = 2130096643 ^ var329;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var329)) {
                           case 68862786:
                              var329 ^= 282531796;
                           case 1125476241:
                              continue label317;
                           case 1181717196:
                              break;
                           case 1417582713:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  }

                  var329 = 712679692 ^ var329;
                  byte var85 = (byte)(-1357694823 ^ var329);
                  int var31 = var85;
                  var329 = 1400585986 ^ var329;

                  while (true) {
                     byte var215 = (byte)(60291173 ^ var329);
                     if (var31 > var215) {
                        label180:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var329)) {
                              case 56523594:
                                 var329 ^= 330488387;
                                 break label180;
                              case 869781048:
                                 break;
                              case 1778591095:
                              default:
                                 throw new RuntimeException();
                              case 1984620538:
                                 break label180;
                           }
                        }

                        var30 += 270869030 ^ var329;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var329)) {
                              case 256369166:
                                 var329 ^= 1790133325;
                                 continue label195;
                              case 485452895:
                              default:
                                 throw new RuntimeException();
                              case 1379310879:
                                 break;
                              case 1651473336:
                                 continue label195;
                           }
                        }
                     }

                     var329 = 364151531 ^ var329;
                     byte var87 = (byte)(-371423888 ^ var329);
                     int var32 = var87;
                     var329 = 1784066893 ^ var329;

                     label168:
                     while (true) {
                        byte var216 = (byte)(2088094147 ^ var329);
                        if (var32 > var216) {
                           var329 = 1171951439 ^ var329;
                           var31 += 967788172 ^ var329;
                           var329 = nsttnqkwnjybhduw(var329, 976797417);
                           break;
                        }

                        label154: {
                           var329 = 2053806752 ^ var329;
                           if (var30 == (102716258 ^ var329)) {
                              var329 = 1006290718 ^ var329;
                              if (var31 == (1038455932 ^ var329)) {
                                 var329 = 1335634070 ^ var329;
                                 if (var32 == (1920580842 ^ var329)) {
                                    var329 = nsttnqkwnjybhduw(var329, 1350215245);
                                    break label154;
                                 }

                                 var329 = 260933151 ^ var329;
                              } else {
                                 var329 = 1074900617 ^ var329;
                              }
                           } else {
                              var329 = 2079025559 ^ var329;
                           }

                           int var93 = var27 + var30;
                           int var95 = var28 + var31;
                           int var97 = var29 + var32;
                           long var99 = BlockPos.asLong(var93, var95, var97);
                           byte var102 = (byte)((var16.contains(var99)) ? 1 : 0);
                           if (var102 == (2113157877 ^ var329)) {
                              var329 = 1203157134 ^ var329;
                              byte var104 = (byte)((n.inBand(var95)) ? 1 : 0);
                              if (var104 == (977437307 ^ var329)) {
                                 var329 = 1091122486 ^ var329;
                                 byte var115 = (byte)(2068559692 ^ var329);
                                 var19 = var115;
                                 var329 = nsttnqkwnjybhduw(var329, 1497935338);
                              } else {
                                 var329 = 1178409423 ^ var329;
                                 n var106 = var3.at(var93, var97);
                                 if (var106 == null) {
                                    var329 = 254398060 ^ var329;
                                    byte var114 = (byte)(1935037913 ^ var329);
                                    var18 = var114;
                                    var329 = nsttnqkwnjybhduw(var329, 1364545407);
                                 } else {
                                    var329 = nsttnqkwnjybhduw(var329, 1241412632);
                                    int var109 = var106.families(var93, var95, var97);
                                    int var110 = var109 & var14;
                                    if (var110 != (897707948 ^ var329)) {
                                       var329 = 121008907 ^ var329;
                                       boolean var112 = var16.add(var99);
                                       var17.enqueue(var99);
                                       var329 = 280266240 ^ var329;
                                    } else {
                                       var329 = 394458379 ^ var329;
                                    }
                                 }
                              }
                           } else {
                              var329 = 1610031186 ^ var329;
                           }
                        }

                        var32 += 570628774 ^ var329;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var329)) {
                              case 31859104:
                                 var329 ^= 1584845669;
                              case 156460202:
                                 continue label168;
                              case 1390321518:
                              default:
                                 throw new RuntimeException();
                              case 1834872011:
                           }
                        }
                     }
                  }
               }
            }

            var329 = 1953541242 ^ var329;
            byte var116 = (byte)(2114567339 ^ var329);
            var19 = var116;
            var329 = nsttnqkwnjybhduw(var329, 1121397476);
         } else {
            var329 = nsttnqkwnjybhduw(var329, 677991923);
         }

         boolean var118 = var4.addAll(var16);
         byte var119 = (byte)(1021220430 ^ var329);
         long[] var120 = new long[var119];
         if (var19 != (1021220430 ^ var329)) {
            var329 = 1460043012 ^ var329;
            b$d var289 = b$d.OUT_OF_BAND;
            byte var301 = (byte)(1809378122 ^ var329);
            byte[] var302 = new byte[var301];
            return new b$c(var2, var21, var289, var120, var120, var120, var302);
         }

         var329 = nsttnqkwnjybhduw(var329, 570450564);
         if (var18 != (517928138 ^ var329)) {
            var329 = 261800925 ^ var329;
            b$d var9 = b$d.INCOMPLETE;
            byte var13 = (byte)(289683223 ^ var329);
            byte[] var298 = new byte[var13];
            return new b$c(var2, var21, var9, var120, var120, var120, var298);
         }

         var329 = 1077336001 ^ var329;
         LongArrayList var124 = new LongArrayList();
         LongArrayList var25 = var124;
         LongOpenHashSet var125 = new LongOpenHashSet();
         LongOpenHashSet var304 = var125;
         byte var126 = (byte)(1592271627 ^ var329);
         int var305 = var126;
         var329 = 373095758 ^ var329;

         long[] var129;
         ByteArrayList var307;
         label283:
         while (true) {
            int var232 = var15.size();
            if (var305 >= var232) {
               var329 = 1541323914 ^ var329;
               var129 = var304.toLongArray();
               int var267 = var129.length;
               ByteArrayList var130 = new ByteArrayList(var267);
               var307 = var130;
               long[] var310 = var129;
               int var133 = var129.length;
               int var311 = var133;
               byte var134 = (byte)(319447759 ^ var329);
               int var313 = var134;
               var329 = 1152781101 ^ var329;

               while (var313 < var311) {
                  var329 = 1164352919 ^ var329;
                  long var138 = var310[var313];
                  int var142 = BlockPos.getX(var138);
                  int var145 = BlockPos.getY(var138);
                  int var148 = BlockPos.getZ(var138);
                  byte var149 = (byte)(316339317 ^ var329);
                  int var38 = var149;
                  n var151 = var3.at(var142, var148);
                  if (var151 != null) {
                     var329 ^= 2086040674;
                     byte var154 = (byte)((n.inBand(var145)) ? 1 : 0);
                     if (var154 != (1854701591 ^ var329)) {
                        var329 = 1622738384 ^ var329;
                        int var156 = var151.families(var142, var145, var148);
                        var38 = var156;
                        byte var158 = var151.certain(var142, var145, var148);
                        byte var160 = (byte)((m.isOpen(var158)) ? 1 : 0);
                        if (var160 != (238388679 ^ var329)) {
                           var329 = 2074229904 ^ var329;
                           byte var238 = (byte)(1972877639 ^ var329);
                           int var162 = var156 | var238;
                           var38 = var162;
                           var329 = 1755687542 ^ var329;
                        } else {
                           label214:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var329)) {
                                 case 193445124:
                                    var329 ^= 319264486;
                                    break label214;
                                 case 461208534:
                                    break;
                                 case 765763948:
                                 default:
                                    throw new RuntimeException();
                                 case 1882007231:
                                    break label214;
                              }
                           }
                        }

                        byte var239 = (byte)(489820962 ^ var329);
                        if (var158 == var239) {
                           var329 = 1652802870 ^ var329;
                           byte var240 = (byte)(2142361175 ^ var329);
                           int var165 = var38 | var240;
                           var38 = var165;
                           var329 = 2003931379 ^ var329;
                        } else {
                           var329 = nsttnqkwnjybhduw(var329, 368203205);
                        }

                        if (var145 >= (146818788 ^ var329)) {
                           var329 = 649931832 ^ var329;
                           byte var241 = (byte)(779971266 ^ var329);
                           if (var145 <= var241) {
                              var329 = 1191420358 ^ var329;
                              byte var242 = (byte)(1769917242 ^ var329);
                              int var169 = var38 | var242;
                              var38 = var169;
                              var329 = 958289886 ^ var329;
                           } else {
                              var329 = nsttnqkwnjybhduw(var329, 2115892760);
                           }
                        } else {
                           var329 = 1486936608 ^ var329;
                        }
                     } else {
                        label224:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var329)) {
                              case 103831200:
                                 var329 ^= 1055661267;
                                 break label224;
                              case 817823900:
                                 break;
                              case 1051998244:
                                 break label224;
                              case 2137840713:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     }
                  } else {
                     label235:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var329)) {
                           case 76032888:
                              var329 ^= 1119512753;
                           case 283308203:
                              break label235;
                           case 528598921:
                              break;
                           case 1018929560:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  }

                  byte var244 = (byte)var38;
                  boolean var171 = var307.add(var244);
                  var313 += 1348508869 ^ var329;
                  var329 = nsttnqkwnjybhduw(var329, 131921190);
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var329)) {
                     case 167598745:
                        var329 = 2068938154 ^ var329;
                        break label283;
                     case 1075976757:
                        break;
                     case 1634921926:
                        break label283;
                     case 2107375280:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            var329 = 1032504705 ^ var329;
            long var173 = var15.getLong(var305);
            int var177 = BlockPos.getX(var173);
            int var312 = var177;
            int var180 = BlockPos.getY(var173);
            int var314 = var180;
            int var183 = BlockPos.getZ(var173);
            int var317 = var183;
            if (var180 >= (1969101764 ^ var329)) {
               var329 ^= 1656971328;
               byte var246 = (byte)(396196762 ^ var329);
               if (var180 <= var246) {
                  var329 = 1979757429 ^ var329;
                  n var187 = var3.at(var177, var183);
                  byte var188 = var187.certain(var177, var180, var183);
                  if (var188 == var2) {
                     var329 = 570894533 ^ var329;
                     boolean var190 = var25.add(var173);
                     var329 = 689000733 ^ var329;
                  } else {
                     var329 = nsttnqkwnjybhduw(var329, 186022360);
                  }
               } else {
                  label250:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var329)) {
                        case 29160054:
                        default:
                           throw new RuntimeException();
                        case 230754514:
                           var329 ^= 2098645677;
                           break label250;
                        case 1703947985:
                           break;
                        case 1905525130:
                           break label250;
                     }
                  }
               }
            } else {
               label261:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var329)) {
                     case 57024661:
                        var329 ^= 534096621;
                        break label261;
                     case 974041177:
                        break;
                     case 1303497836:
                        break label261;
                     case 1370989046:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            byte var191 = (byte)(-1787539754 ^ var329);
            int var318 = var191;
            var329 = 916838147 ^ var329;

            while (true) {
               byte var252 = (byte)(1546544683 ^ var329);
               if (var318 > var252) {
                  var329 = nsttnqkwnjybhduw(var329, 1002586750);
                  var305 += 1743529045 ^ var329;
                  var329 = 792263185 ^ var329;
                  break;
               }

               var329 = 1732295393 ^ var329;
               byte var193 = (byte)(-997121228 ^ var329);
               int var320 = var193;
               var329 = 2006169994 ^ var329;

               while (true) {
                  byte var253 = (byte)(1291674944 ^ var329);
                  if (var320 > var253) {
                     var329 = 955329028 ^ var329;
                     var318 += 1946963780 ^ var329;
                     var329 = nsttnqkwnjybhduw(var329, 673327471);
                     break;
                  }

                  var329 = 1710949237 ^ var329;
                  byte var195 = (byte)(-688285237 ^ var329);
                  int var322 = var195;
                  var329 = 1670072990 ^ var329;

                  while (true) {
                     byte var254 = (byte)(1250765995 ^ var329);
                     if (var322 > var254) {
                        var329 = nsttnqkwnjybhduw(var329, 1120269825);
                        var320 += 138992298 ^ var329;
                        var329 = nsttnqkwnjybhduw(var329, 1152761834);
                        break;
                     }

                     var329 = 2045446946 ^ var329;
                     int var198 = var312 + var318;
                     int var257 = var314 + var320;
                     int var276 = var317 + var322;
                     long var199 = BlockPos.asLong(var198, var257, var276);
                     byte var202 = (byte)((var16.contains(var199)) ? 1 : 0);
                     if (var202 == (862332808 ^ var329)) {
                        var329 = 372272321 ^ var329;
                        boolean var204 = var304.add(var199);
                        var329 = 1470599926 ^ var329;
                     } else {
                        var329 = nsttnqkwnjybhduw(var329, 1100480055);
                     }

                     var322 += 1928452542 ^ var329;
                     var329 = nsttnqkwnjybhduw(var329, 947713301);
                  }
               }
            }
         }

         Object var288 = null;
         long[] var291 = var15.toLongArray();
         long[] var294 = var25.toLongArray();
         byte[] var300 = var307.toByteArray();
         return new b$c(var2, var21, (b$d)var288, var291, var294, var129, var300);
      }
   }

   public static b$f judge(b$c var0, b$b var1, int var2) {
      int var364 = 624874922 ^ 1719991150 ^ 189043002;
      var364 = 2074692646 ^ var364;
      byte var32 = var0.kind();
      long var34 = var0.owner();
      b$d var37 = var0.unfinished();
      if (var37 != null) {
         var364 = 1699287691 ^ var364;
         b$d var39 = var0.unfinished();
         return verdict(var39, var32, var34);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
               case 58350373:
                  var364 ^= 1089278455;
               case 275210786:
                  byte var41 = (byte)(1941627439 ^ var364);
                  int var14 = var41;
                  long[] var43 = var0.cells();
                  long[] var15 = var43;
                  int var45 = var43.length;
                  int var16 = var45;
                  byte var46 = (byte)(1941627439 ^ var364);
                  int var17 = var46;
                  var364 = 543423202 ^ var364;

                  while (var17 < var16) {
                     var364 = 42342177 ^ var364;
                     long var49 = var15[var17];
                     int var195 = BlockPos.getX(var49);
                     int var278 = BlockPos.getY(var49);
                     int var325 = BlockPos.getZ(var49);
                     BlockState var52 = var1.state(var195, var278, var325);
                     if (var52 == null) {
                        var364 = 1209571278 ^ var364;
                        b$d var54 = b$d.INCOMPLETE;
                        return verdict(var54, var32, var34);
                     }

                     var364 = 717208689 ^ var364;
                     byte var57 = (byte)((open(var52)) ? 1 : 0);
                     if (var57 != (2078323613 ^ var364)) {
                        var364 = 409307484 ^ var364;
                        b$d var60 = b$d.OPEN;
                        return verdict(var60, var32, var34);
                     }

                     var364 = 883525446 ^ var364;
                     Block var198 = var52.getBlock();
                     byte var199 = (byte)((isStructure(var198)) ? 1 : 0);
                     int var59 = var14 | var199;
                     var14 = var59;
                     var17 += 1330197722 ^ var364;
                     var364 = 479210518 ^ var364;
                  }

                  label331:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                        case 41219028:
                           var364 ^= 2059795583;
                           break label331;
                        case 287206324:
                        default:
                           throw new RuntimeException();
                        case 647502760:
                           break label331;
                        case 1268696664:
                     }
                  }

                  long[] var63 = var0.shell();
                  long[] var345 = var63;
                  byte[] var65 = var0.shellFlags();
                  byte[] var346 = var65;
                  byte var66 = (byte)(689759410 ^ var364);
                  int var347 = var66;
                  byte var67 = (byte)(689759410 ^ var364);
                  int var348 = var67;
                  var364 = 1597827603 ^ var364;

                  while (true) {
                     int var202 = var345.length;
                     if (var348 >= var202) {
                        var364 = 401541002 ^ var364;
                        if (var14 != (1640958251 ^ var364)) {
                           var364 = 699841526 ^ var364;
                           b$d var70 = b$d.STRUCTURE;
                           return verdict(var70, var32, var34);
                        }

                        var364 = nsttnqkwnjybhduw(var364, 2092131474);
                        byte var204 = (byte)(494693818 ^ var364);
                        if (var347 > var204) {
                           var364 = 720897345 ^ var364;
                           b$d var73 = b$d.TERRAIN;
                           return verdict(var73, var32, var34);
                        }

                        var364 = 1229878388 ^ var364;
                        Block var76 = m.familyBlock(var32);
                        Block var349 = var76;
                        byte var77 = (byte)(1412569549 ^ var364);
                        int var20 = var77;
                        byte var78 = (byte)(1412569549 ^ var364);
                        int var351 = var78;
                        byte var79 = (byte)(1412569549 ^ var364);
                        int var22 = var79;
                        LongArrayList var80 = new LongArrayList();
                        LongArrayList var23 = var80;
                        LongArrayList var81 = new LongArrayList();
                        LongArrayList var24 = var81;
                        long[] var83 = var0.judged();
                        long[] var25 = var83;
                        int var85 = var83.length;
                        int var26 = var85;
                        byte var86 = (byte)(1412569549 ^ var364);
                        int var27 = var86;
                        var364 = 644652917 ^ var364;

                        while (var27 < var26) {
                           var364 = 91373556 ^ var364;
                           long var164 = var25[var27];
                           int var259 = BlockPos.getX(var164);
                           int var315 = BlockPos.getY(var164);
                           int var334 = BlockPos.getZ(var164);
                           BlockState var167 = var1.state(var259, var315, var334);
                           Block var168 = var167.getBlock();
                           if (var168 != var349) {
                              var364 = nsttnqkwnjybhduw(var364, 1902167522);
                              Set var170 = FAKES;
                              byte var171 = (byte)((var170.contains(var168)) ? 1 : 0);
                              if (var171 != (105675950 ^ var364)) {
                                 var364 = 399880793 ^ var364;
                                 var22 += 295292662 ^ var364;
                                 var364 = 956302518 ^ var364;
                              } else {
                                 var364 = nsttnqkwnjybhduw(var364, 320661140);
                                 Set var172 = NATURAL;
                                 byte var173 = (byte)((var172.contains(var168)) ? 1 : 0);
                                 if (var173 == (357603898 ^ var364)) {
                                    var364 = 171885550 ^ var364;
                                    var20 += 527325653 ^ var364;
                                    boolean var175 = var23.add(var164);
                                    var364 = 938972053 ^ var364;
                                 } else {
                                    var364 = 1036603515 ^ var364;
                                 }
                              }
                           } else {
                              var364 = 772229797 ^ var364;
                              var20 += 1496052712 ^ var364;
                              var351 += 1496052712 ^ var364;

                              label294:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                    case 214266296:
                                       var364 ^= 1907505576;
                                       break label294;
                                    case 563787664:
                                       break;
                                    case 1078717558:
                                       break label294;
                                    case 1093839256:
                                    default:
                                       throw new RuntimeException();
                                 }
                              }
                           }

                           var27 += 681167424 ^ var364;
                           var364 = 1523010809 ^ var364;
                        }

                        label281:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                              case 228022106:
                                 var364 ^= 289682054;
                              case 1306411551:
                                 break label281;
                              case 1620856057:
                                 break;
                              case 2033831514:
                              default:
                                 throw new RuntimeException();
                           }
                        }

                        byte var88 = (byte)(1662694462 ^ var364);
                        int var352 = var88;
                        var364 = 1911559268 ^ var364;

                        while (true) {
                           int var208 = var345.length;
                           if (var352 >= var208) {
                              var364 = nsttnqkwnjybhduw(var364, 46756818);
                              int var91 = var20 + var22;
                              if (var91 > (270783368 ^ var364)) {
                                 var364 = 1308504415 ^ var364;
                                 byte var210 = (byte)(1574822621 ^ var364);
                                 int var93 = var22 * var210;
                                 int var212 = var20 + var22;
                                 byte var288 = (byte)(1574822612 ^ var364);
                                 int var213 = var212 * var288;
                                 if (var93 > var213) {
                                    var364 = 1170523632 ^ var364;
                                    b$d var94 = b$d.HIDDEN;
                                    return verdict(var94, var32, var34);
                                 }

                                 label196:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                       case 70878547:
                                       default:
                                          throw new RuntimeException();
                                       case 98417245:
                                          var364 ^= 600356151;
                                       case 395882299:
                                          break label196;
                                       case 705589092:
                                    }
                                 }
                              } else {
                                 var364 = nsttnqkwnjybhduw(var364, 1849066600);
                              }

                              byte var215 = (byte)(2115327976 ^ var364);
                              if (var20 < var215) {
                                 var364 = 837064001 ^ var364;
                                 b$d var97 = b$d.TOO_FEW;
                                 return verdict(var97, var32, var34);
                              }

                              var364 = nsttnqkwnjybhduw(var364, 1976777366);
                              double var100 = var351;
                              double var293 = 0.6;
                              double var340 = var20;
                              double var295 = var293 * var340;
                              double var413;
                              int var102 = (var413 = var100 - var295) == 0.0 ? 0 : (var413 < 0.0 ? -1 : 1);
                              if (var102 < (197553526 ^ var364)) {
                                 var364 = 927916631 ^ var364;
                                 b$d var103 = b$d.MISPREDICTED;
                                 return verdict(var103, var32, var34);
                              }

                              var364 = nsttnqkwnjybhduw(var364, 167627793);
                              int var106 = var23.size();
                              int var219 = var24.size();
                              int var107 = var106 + var219;
                              long[] var108 = new long[var107];
                              long[] var353 = var108;
                              byte var109 = (byte)(37462375 ^ var364);
                              int var354 = var109;
                              var364 = 230518589 ^ var364;

                              while (true) {
                                 int var221 = var23.size();
                                 if (var354 >= var221) {
                                    label183:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                          case 236265544:
                                             var364 ^= 896834779;
                                             break label183;
                                          case 603556855:
                                             break;
                                          case 1407259127:
                                          default:
                                             throw new RuntimeException();
                                          case 1995537251:
                                             break label183;
                                       }
                                    }

                                    byte var112 = (byte)(988959361 ^ var364);
                                    int var355 = var112;
                                    var364 = 1329962506 ^ var364;

                                    label176:
                                    while (true) {
                                       int var224 = var24.size();
                                       if (var355 >= var224) {
                                          var364 = nsttnqkwnjybhduw(var364, 318190358);
                                          int var115 = var353.length;
                                          byte var225 = (byte)(1732312988 ^ var364);
                                          int var226 = Math.max(var225, var2);
                                          if (var115 >= var226) {
                                             var364 = 354492696 ^ var364;
                                             b$d var414 = b$d.ALERT;

                                             while (true) {
                                                switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                                   case 83362042:
                                                   default:
                                                      throw new RuntimeException();
                                                   case 228453696:
                                                      var364 = 1416888463 ^ var364;
                                                      return new b$f(var414, var32, var34, var353);
                                                   case 1404037419:
                                                      break;
                                                   case 1792260406:
                                                      return new b$f(var414, var32, var34, var353);
                                                }
                                             }
                                          }

                                          label160:
                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                                case 135104512:
                                                   var364 ^= 207252315;
                                                   break label160;
                                                case 881497282:
                                                default:
                                                   throw new RuntimeException();
                                                case 1747504532:
                                                   break label160;
                                                case 1828256044:
                                             }
                                          }

                                          b$d var190 = b$d.CLEAN;
                                          var364 = 1292847820 ^ var364;
                                          return new b$f(var190, var32, var34, var353);
                                       }

                                       var364 ^= 1683044050;
                                       int var228 = var23.size();
                                       int var229 = var228 + var355;
                                       long var306 = var24.getLong(var355);
                                       var353[var229] = var306;
                                       var355 += 300350040 ^ var364;

                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                             case 45061354:
                                                var364 ^= 1683044050;
                                             case 641989938:
                                                continue label176;
                                             case 1344563805:
                                             default:
                                                throw new RuntimeException();
                                             case 1954928483:
                                          }
                                       }
                                    }
                                 }

                                 var364 = 506818569 ^ var364;
                                 long var300 = var23.getLong(var354);
                                 var353[var354] = var300;
                                 var354 += 296992338 ^ var364;
                                 var364 = nsttnqkwnjybhduw(var364, 506818569);
                              }
                           }

                           var364 = 1499425089 ^ var364;
                           byte var119 = var346[var352];
                           byte var231 = (byte)(1270204731 ^ var364);
                           int var120 = var119 & var231;
                           if (var120 == (1270204699 ^ var364)) {
                              var364 = nsttnqkwnjybhduw(var364, 1238754653);
                           } else {
                              var364 = 106449031 ^ var364;
                              byte var122 = var346[var352];
                              byte var233 = (byte)(1307410828 ^ var364);
                              int var123 = var122 & var233;
                              if (var123 != (1307410844 ^ var364)) {
                                 var364 = 1334685146 ^ var364;
                              } else {
                                 var364 = 1725874586 ^ var364;
                                 long var125 = var345[var352];
                                 int var127 = BlockPos.getX(var125);
                                 long var129 = var345[var352];
                                 int var131 = BlockPos.getY(var129);
                                 long var133 = var345[var352];
                                 int var135 = BlockPos.getZ(var133);
                                 BlockState var137 = var1.state(var127, var131, var135);
                                 byte var139 = m.of(var137);
                                 int var141 = m.familyBit(var139);
                                 if (var141 != (724779014 ^ var364)) {
                                    var364 ^= 455893780;
                                    byte var156 = var346[var352];
                                    int var157 = var156 & var141;
                                    label231:
                                    if (var157 == (807346962 ^ var364)) {
                                       var364 ^= 65354120;
                                       byte var251 = (byte)(872028818 ^ var364);
                                       if (var139 == var251) {
                                          var364 ^= 1819678001;
                                          byte var160 = (byte)((nearOpen(var1, var127, var131, var135)) ? 1 : 0);
                                          if (var160 != (1603014571 ^ var364)) {
                                             while (true) {
                                                switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                                   case 153027031:
                                                      var364 ^= 1575756781;
                                                      break label231;
                                                   case 623931444:
                                                   default:
                                                      throw new RuntimeException();
                                                   case 1227540054:
                                                      break;
                                                   case 1513937018:
                                                      break label231;
                                                }
                                             }
                                          }

                                          var364 ^= 1612770411;
                                       } else {
                                          label228:
                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                                case 78946416:
                                                   var364 ^= 207026522;
                                                   break label228;
                                                case 462483823:
                                                   break;
                                                case 1253171475:
                                                default:
                                                   throw new RuntimeException();
                                                case 1641601318:
                                                   break label228;
                                             }
                                          }
                                       }

                                       long var254 = var345[var352];
                                       boolean var162 = var24.add(var254);

                                       label220:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                             case 190760680:
                                                var364 ^= 1036832646;
                                                break label220;
                                             case 1051463266:
                                             default:
                                                throw new RuntimeException();
                                             case 1664653240:
                                                break label220;
                                             case 2007180597:
                                          }
                                       }
                                    } else {
                                       label238:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                             case 222061549:
                                                var364 ^= 847187796;
                                                break label238;
                                             case 500667147:
                                                break;
                                             case 833489876:
                                             default:
                                                throw new RuntimeException();
                                             case 1701894194:
                                                break label238;
                                          }
                                       }
                                    }
                                 } else {
                                    label270:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                          case 62089016:
                                             var364 ^= 2010581150;
                                             break label270;
                                          case 169516221:
                                          default:
                                             throw new RuntimeException();
                                          case 681780479:
                                             break;
                                          case 1698045423:
                                             break label270;
                                       }
                                    }

                                    byte var144 = var346[var352];
                                    byte var239 = (byte)(1558464728 ^ var364);
                                    int var145 = var144 & var239;
                                    if (var145 != (1558464664 ^ var364)) {
                                       var364 ^= 1985052165;
                                       byte var240 = (byte)(716519070 ^ var364);
                                       if (var139 != var240) {
                                          var364 = 1783671967 ^ var364;
                                          Set var147 = FAKES;
                                          Block var242 = var137.getBlock();
                                          byte var148 = (byte)((var147.contains(var242)) ? 1 : 0);
                                          if (var148 == (1088788994 ^ var364)) {
                                             var364 = 1508292020 ^ var364;
                                             Set var149 = NATURAL;
                                             Block var244 = var137.getBlock();
                                             byte var150 = (byte)((var149.contains(var244)) ? 1 : 0);
                                             if (var150 == (419639222 ^ var364)) {
                                                var364 = 2049054547 ^ var364;
                                                byte var152 = (byte)((nearOpen(var1, var127, var131, var135)) ? 1 : 0);
                                                if (var152 == (1663121637 ^ var364)) {
                                                   var364 = 55770402 ^ var364;
                                                   long var247 = var345[var352];
                                                   boolean var154 = var24.add(var247);
                                                   var364 = 1645472129 ^ var364;
                                                } else {
                                                   var364 = 1631655075 ^ var364;
                                                }
                                             } else {
                                                var364 = nsttnqkwnjybhduw(var364, 459473904);
                                             }
                                          } else {
                                             var364 = nsttnqkwnjybhduw(var364, 1116059204);
                                          }
                                       } else {
                                          label252:
                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                                case 46084965:
                                                   var364 ^= 685054683;
                                                   break label252;
                                                case 215765230:
                                                default:
                                                   throw new RuntimeException();
                                                case 919507880:
                                                   break;
                                                case 1287267057:
                                                   break label252;
                                             }
                                          }
                                       }
                                    } else {
                                       label262:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                                             case 66719810:
                                                var364 ^= 1585734878;
                                             case 628743196:
                                                break label262;
                                             case 718783770:
                                             default:
                                                throw new RuntimeException();
                                             case 1761122116:
                                          }
                                       }
                                    }
                                 }
                              }
                           }

                           var352 += 39857223 ^ var364;
                           var364 = nsttnqkwnjybhduw(var364, 277515292);
                        }
                     }

                     var364 = 1632117528 ^ var364;
                     long var266 = var345[var348];
                     int var268 = BlockPos.getX(var266);
                     long var318 = var345[var348];
                     int var320 = BlockPos.getY(var318);
                     long var337 = var345[var348];
                     int var339 = BlockPos.getZ(var337);
                     BlockState var177 = var1.state(var268, var320, var339);
                     if (var177 == null) {
                        var364 = 1837715089 ^ var364;
                        b$d var188 = b$d.INCOMPLETE;
                        return verdict(var188, var32, var34);
                     }

                     label309:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                           case 223989758:
                              var364 ^= 719928713;
                              break label309;
                           case 625219159:
                           default:
                              throw new RuntimeException();
                           case 655827608:
                              break label309;
                           case 1471905861:
                        }
                     }

                     byte var180 = (byte)((open(var177)) ? 1 : 0);
                     if (var180 != (1031868464 ^ var364)) {
                        var364 = 701462863 ^ var364;
                        b$d var181 = b$d.OPEN;
                        return verdict(var181, var32, var34);
                     }

                     label320:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var364)) {
                           case 120206044:
                              var364 ^= 1116526784;
                              break label320;
                           case 794529083:
                              break;
                           case 841950790:
                           default:
                              throw new RuntimeException();
                           case 1110472127:
                              break label320;
                        }
                     }

                     Block var271 = var177.getBlock();
                     byte var272 = (byte)((isStructure(var271)) ? 1 : 0);
                     int var184 = var14 | var272;
                     var14 = var184;
                     byte var186 = var346[var348];
                     byte var274 = (byte)(2131609824 ^ var364);
                     int var187 = var186 & var274;
                     if (var187 != (2131609840 ^ var364)) {
                        var364 = 1627638720 ^ var364;
                        var347 += 504234801 ^ var364;
                        var364 = 60905759 ^ var364;
                     } else {
                        var364 = 1654821599 ^ var364;
                     }

                     var348 += 498031150 ^ var364;
                     var364 = nsttnqkwnjybhduw(var364, 1804555406);
                  }
               case 620987556:
               default:
                  throw new RuntimeException();
               case 1665466971:
            }
         }
      }
   }

   private static b$f verdict(b$d var0, byte var1, long var2) {
      int var13 = 1070726055 ^ 942447090 ^ 189043002;
      var13 = 2012170167 ^ var13;
      byte var9 = (byte)(2069279960 ^ var13);
      long[] var10 = new long[var9];
      return new b$f(var0, var1, var2, var10);
   }

   public static boolean open(BlockState var0) {
      int var9 = 1655167810 ^ 870420716 ^ 189043002;
      var9 = 522610199 ^ var9;
      byte var2 = (byte)((var0.isAir()) ? 1 : 0);
      if (var2 == (1160035459 ^ var9)) {
         var9 = 1817672606 ^ var9;
         FluidState var4 = var0.getFluidState();
         byte var5 = (byte)((var4.isEmpty()) ? 1 : 0);
         if (var5 != (695453469 ^ var9)) {
            var9 = 1846156246 ^ var9;
            byte var6 = (byte)(1199168715 ^ var9);
            var9 = 147946114 ^ var9;
            return (var6 != 0);
         }

         var9 = 1649198627 ^ var9;
      } else {
         var9 = 236699069 ^ var9;
      }

      byte var16 = (byte)(1262420287 ^ var9);
      var9 = 77047671 ^ var9;
      return (var16 != 0);
   }

   private static boolean nearOpen(b$b var0, int var1, int var2, int var3) {
      int var35 = 35682486 ^ 2078548 ^ 189043002;
      var35 = 692189895 ^ var35;
      byte var4 = (byte)(-540714016 ^ var35);
      int var9 = var4;
      var35 = 1225309913 ^ var35;

      label72:
      while (true) {
         byte var5 = (byte)(1764891335 ^ var35);
         if (var9 > var5) {
            var35 = 821125375 ^ var35;
            return (((byte)(1505983033 ^ var35)) != 0);
         }

         var35 = 1305559197 ^ var35;
         byte var14 = (byte)(-618879580 ^ var35);
         int var10 = var14;
         var35 = 1414785803 ^ var35;

         while (true) {
            byte var25 = (byte)(1890627921 ^ var35);
            if (var10 <= var25) {
               var35 = 1783772820 ^ var35;
               byte var16 = (byte)(-451053509 ^ var35);
               int var11 = var16;
               var35 = 219775299 ^ var35;

               label47:
               while (true) {
                  byte var26 = (byte)(402327174 ^ var35);
                  if (var11 > var26) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var35)) {
                           case 226471293:
                           default:
                              throw new RuntimeException(new IOException());
                           case 242633566:
                              var35 ^= 595476176;
                              break label47;
                           case 777085253:
                              break;
                           case 1725188950:
                              break label47;
                        }
                     }
                  }

                  var35 = 528103916 ^ var35;
                  int var28 = var1 + var9;
                  int var30 = var2 + var10;
                  int var32 = var3 + var11;
                  BlockState var19 = var0.state(var28, var30, var32);
                  if (var19 != null) {
                     var35 = 20845096 ^ var35;
                     byte var22 = (byte)((open(var19)) ? 1 : 0);
                     if (var22 == (163523907 ^ var35)) {
                        var35 = 1064778136 ^ var35;
                        var11 += 919082202 ^ var35;
                        var35 = 556995164 ^ var35;
                        continue;
                     }

                     var35 = 485599760 ^ var35;
                  } else {
                     var35 = 500152376 ^ var35;
                  }

                  return (((byte)(357467986 ^ var35)) != 0);
               }
            } else {
               label64:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var35)) {
                     case 173418299:
                        var35 ^= 2092824835;
                     case 346075420:
                        break label64;
                     case 776156094:
                     default:
                        throw new RuntimeException(new IOException());
                     case 940374077:
                  }
               }

               var9 += 202197074 ^ var35;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var35)) {
                     case 123318317:
                        var35 ^= 1698648725;
                        continue label72;
                     case 1376996773:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1847884114:
                        break;
                     case 2081670497:
                        continue label72;
                  }
               }
            }

            var10 += 881145942 ^ var35;
            var35 = nsttnqkwnjybhduw(var35, 1144359175);
         }
      }
   }

   private static boolean before(long var0, long var2) {
      int var38 = 430141435 ^ 1846118568 ^ 189043002;
      var38 = 201293414 ^ var38;
      int var8 = BlockPos.getY(var0);
      int var23 = BlockPos.getY(var2);
      if (var8 != var23) {
         var38 = 1308527524 ^ var38;
         int var21 = BlockPos.getY(var0);
         int var35 = BlockPos.getY(var2);
         if (var21 >= var35) {
            var38 = 1185269739 ^ var38;
            byte var56 = (byte)(2085241920 ^ var38);
            var38 = 911698958 ^ var38;
            return (var56 != 0);
         }

         var38 = 1054152654 ^ var38;
         byte var22 = (byte)(70947940 ^ var38);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
               case 66514724:
                  var38 = 1311226923 ^ var38;
                  return (var22 != 0);
               case 680567929:
                  return (var22 != 0);
               case 1149066985:
               default:
                  throw new RuntimeException(new IOException());
               case 2062286959:
            }
         }
      } else {
         label73:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
               case 112232588:
                  var38 ^= 1847625372;
                  break label73;
               case 1017095821:
               default:
                  throw new RuntimeException(new IOException());
               case 1884171781:
                  break label73;
               case 2007755903:
            }
         }

         int var11 = BlockPos.getZ(var0);
         int var26 = BlockPos.getZ(var2);
         if (var11 == var26) {
            var38 = 996556528 ^ var38;
            int var14 = BlockPos.getX(var0);
            int var29 = BlockPos.getX(var2);
            if (var14 >= var29) {
               var38 = 1378508339 ^ var38;
               byte var55 = (byte)(1887301200 ^ var38);
               var38 = 341238543 ^ var38;
               return (var55 != 0);
            }

            var38 = 239042689 ^ var38;
            byte var57 = (byte)(745025763 ^ var38);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                  case 101315293:
                     var38 = 1212366269 ^ var38;
                     return (var57 != 0);
                  case 622964306:
                     return (var57 != 0);
                  case 1355941609:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1614391400:
               }
            }
         } else {
            var38 = 139981635 ^ var38;
            int var17 = BlockPos.getZ(var0);
            int var32 = BlockPos.getZ(var2);
            if (var17 < var32) {
               var38 = 176755991 ^ var38;
               byte var54 = (byte)(468674758 ^ var38);
               var38 = nsttnqkwnjybhduw(var38, 2143577496);
               return (var54 != 0);
            }

            label65:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                  case 28738213:
                     var38 ^= 1504837914;
                     break label65;
                  case 1315058927:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1643015101:
                     break label65;
                  case 1842325499:
               }
            }
         }
      }

      byte var18 = (byte)(1221885130 ^ var38);
      var38 = 754938261 ^ var38;
      return (var18 != 0);
   }

   static boolean isStructure(Block var0) {
      int var15 = 599782932 ^ 1799522153 ^ 189043002;
      var15 = 1014818618 ^ var15;
      Map var1 = STRUCTURE;
      Object var5 = var1.get(var0);
      Boolean var6 = (Boolean)var5;
      if (var6 != null) {
         var15 = 1348578660 ^ var15;
         var15 = nsttnqkwnjybhduw(var15, 712016854);
         return var6;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
               case 126730567:
                  var15 ^= 111021767;
               case 2117086063:
                  Map var8 = STRUCTURE;
                  Function<Block, Boolean> var3 = b::structureBlock;
                  Object var9 = var8.computeIfAbsent(var0, var3);
                  Boolean var11 = (Boolean)var9;
                  var15 = 2089754741 ^ var15;
                  return var11;
               case 422117320:
               default:
                  throw new IllegalStateException();
               case 1830208029:
            }
         }
      }
   }

   private static boolean structureBlock(Block var0) {
      int var72 = 1717804562 ^ 1464471245 ^ 189043002;
      var72 = 2073262477 ^ var72;
      Block var2 = Blocks.BONE_BLOCK;
      if (var0 != var2) {
         var72 ^= 863146958;
         Block var47 = Blocks.SPAWNER;
         if (var0 != var47) {
            var72 = 1014004996 ^ var72;
            Block var48 = Blocks.TRIAL_SPAWNER;
            if (var0 == var48) {
               var72 = nsttnqkwnjybhduw(var72, 1610227170);
               return ((285641537 ^ var72) != 0);
            } else {
               var72 = 1341903988 ^ var72;
               Block var49 = Blocks.VAULT;
               if (var0 != var49) {
                  var72 = 741662853 ^ var72;
                  Block var50 = Blocks.END_PORTAL_FRAME;
                  if (var0 == var50) {
                     var72 = nsttnqkwnjybhduw(var72, 1010116883);
                     return ((285641537 ^ var72) != 0);
                  } else {
                     var72 = 587670679 ^ var72;
                     Block var51 = Blocks.REINFORCED_DEEPSLATE;
                     if (var0 == var51) {
                        var72 = 523373956 ^ var72;
                        return ((285641537 ^ var72) != 0);
                     } else {
                        var72 = 1139441182 ^ var72;
                        Block var52 = Blocks.SEA_LANTERN;
                        if (var0 != var52) {
                           var72 = 353922928 ^ var72;
                           DefaultedRegistry var10 = BuiltInRegistries.BLOCK;
                           Identifier var11 = var10.getKey(var0);
                           String var12 = var11.getPath();
                           String var54 = thxsilwprj(vrlrzkwvcvqxaky(), sfpcbeuncyteplw(), var72);
                           byte var14 = (byte)((var12.contains(var54)) ? 1 : 0);
                           label129:
                           if (var14 == (1489409962 ^ var72)) {
                              var72 = 507478812 ^ var72;
                              String var55 = thxsilwprj(brifaspjnyiiyit(), sfpcbeuncyteplw(), var72);
                              byte var16 = (byte)((var12.contains(var55)) ? 1 : 0);
                              if (var16 != (1190728886 ^ var72)) {
                                 var72 = 2122867244 ^ var72;
                                 String var56 = thxsilwprj(rrqzeddanemcurn(), sfpcbeuncyteplw(), var72);
                                 byte var18 = (byte)((var12.equals(var56)) ? 1 : 0);
                                 if (var18 == (946960026 ^ var72)) {
                                    var72 = nsttnqkwnjybhduw(var72, 1764617912);
                                    break label129;
                                 }

                                 var72 = 1825452672 ^ var72;
                              } else {
                                 var72 = nsttnqkwnjybhduw(var72, 306598060);
                              }

                              String var57 = thxsilwprj(tvzctndhjizhgpp(), sfpcbeuncyteplw(), var72);
                              byte var20 = (byte)((var12.contains(var57)) ? 1 : 0);
                              if (var20 != (1421820954 ^ var72)) {
                                 var72 = 1061271419 ^ var72;
                                 String var58 = thxsilwprj(arcfoxjcxttwwhe(), sfpcbeuncyteplw(), var72);
                                 byte var22 = (byte)((var12.contains(var58)) ? 1 : 0);
                                 if (var22 == (1811870561 ^ var72)) {
                                    var72 = 313532628 ^ var72;
                                    String var59 = thxsilwprj(nvzghrxcykdqeze(), sfpcbeuncyteplw(), var72);
                                    byte var24 = (byte)((var12.equals(var59)) ? 1 : 0);
                                    if (var24 == (2035209141 ^ var72)) {
                                       var72 = nsttnqkwnjybhduw(var72, 672287639);
                                       break label129;
                                    }

                                    var72 = 1174247034 ^ var72;
                                 } else {
                                    var72 = nsttnqkwnjybhduw(var72, 1464710830);
                                 }
                              } else {
                                 var72 = 1745617365 ^ var72;
                              }

                              String var60 = thxsilwprj(boohuueikvchklb(), sfpcbeuncyteplw(), var72);
                              byte var26 = (byte)((var12.startsWith(var60)) ? 1 : 0);
                              if (var26 == (1018381775 ^ var72)) {
                                 var72 = 457524724 ^ var72;
                                 String var61 = thxsilwprj(uaenpywduqqufex(), sfpcbeuncyteplw(), var72);
                                 byte var28 = (byte)((var12.startsWith(var61)) ? 1 : 0);
                                 if (var28 == (670433339 ^ var72)) {
                                    var72 = 136895476 ^ var72;
                                    String var62 = thxsilwprj(qpuchpxfpptcmes(), sfpcbeuncyteplw(), var72);
                                    byte var30 = (byte)((var12.startsWith(var62)) ? 1 : 0);
                                    if (var30 == (803134415 ^ var72)) {
                                       var72 = 486537243 ^ var72;
                                       String var63 = thxsilwprj(wratoymlawzpadz(), sfpcbeuncyteplw(), var72);
                                       byte var32 = (byte)((var12.startsWith(var63)) ? 1 : 0);
                                       if (var32 == (857809876 ^ var72)) {
                                          var72 = 491891303 ^ var72;
                                          String var64 = thxsilwprj(oageblbxzzwdbqn(), sfpcbeuncyteplw(), var72);
                                          byte var34 = (byte)((var12.equals(var64)) ? 1 : 0);
                                          if (var34 == (779127219 ^ var72)) {
                                             var72 = 661919557 ^ var72;
                                             String var65 = thxsilwprj(szrligswgqkmktd(), sfpcbeuncyteplw(), var72);
                                             byte var36 = (byte)((var12.startsWith(var65)) ? 1 : 0);
                                             if (var36 == (151297782 ^ var72)) {
                                                var72 = 96691837 ^ var72;
                                                String var66 = thxsilwprj(cmrdbbihqqmbeju(), sfpcbeuncyteplw(), var72);
                                                byte var38 = (byte)((var12.contains(var66)) ? 1 : 0);
                                                if (var38 == (214431883 ^ var72)) {
                                                   var72 ^= 1089147184;
                                                   String var67 = thxsilwprj(okznuwchdntdxxo(), sfpcbeuncyteplw(), var72);
                                                   byte var40 = (byte)((var12.endsWith(var67)) ? 1 : 0);
                                                   if (var40 == (1278011835 ^ var72)) {
                                                      var72 = 1125534943 ^ var72;
                                                      String var68 = thxsilwprj(juuhqsmeinlanfq(), sfpcbeuncyteplw(), var72);
                                                      byte var42 = (byte)((var12.contains(var68)) ? 1 : 0);
                                                      if (var42 == (255501668 ^ var72)) {
                                                         var72 = 1787189003 ^ var72;
                                                         String var69 = thxsilwprj(ciiakfvtycfrhma(), sfpcbeuncyteplw(), var72);
                                                         byte var44 = (byte)((var12.startsWith(var69)) ? 1 : 0);
                                                         if (var44 == (1706881647 ^ var72)) {
                                                            label78:
                                                            while (true) {
                                                               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                                                                  case 85880843:
                                                                     var72 ^= 1721541809;
                                                                  case 1085624615:
                                                                     break label78;
                                                                  case 1502412189:
                                                                     break;
                                                                  case 1879917836:
                                                                  default:
                                                                     throw new RuntimeException(new IOException());
                                                               }
                                                            }

                                                            byte var45 = (byte)(52451038 ^ var72);
                                                            var72 = 2068133692 ^ var72;
                                                            return (var45 != 0);
                                                         }

                                                         var72 = 887122509 ^ var72;
                                                      } else {
                                                         var72 = 1583758662 ^ var72;
                                                      }
                                                   } else {
                                                      label97:
                                                      while (true) {
                                                         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                                                            case 60246262:
                                                               var72 ^= 493908377;
                                                            case 1228399599:
                                                               break label97;
                                                            case 1419630599:
                                                            default:
                                                               throw new RuntimeException(new IOException());
                                                            case 2097991621:
                                                         }
                                                      }
                                                   }
                                                } else {
                                                   label104:
                                                   while (true) {
                                                      switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                                                         case 147029322:
                                                            var72 ^= 1570463913;
                                                         case 517033643:
                                                            break label104;
                                                         case 971503030:
                                                         default:
                                                            throw new RuntimeException(new IOException());
                                                         case 2017799851:
                                                      }
                                                   }
                                                }
                                             } else {
                                                var72 = nsttnqkwnjybhduw(var72, 1482163924);
                                             }
                                          } else {
                                             var72 = 2133594513 ^ var72;
                                          }
                                       } else {
                                          var72 = 1652407286 ^ var72;
                                       }
                                    } else {
                                       var72 = nsttnqkwnjybhduw(var72, 2122466285);
                                    }
                                 } else {
                                    label115:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                                          case 225216388:
                                             var72 ^= 1990891545;
                                          case 336166051:
                                             break label115;
                                          case 466527425:
                                          default:
                                             throw new RuntimeException(new IOException());
                                          case 2134558639:
                                       }
                                    }
                                 }
                              } else {
                                 var72 = 1844436461 ^ var72;
                              }
                           } else {
                              var72 = nsttnqkwnjybhduw(var72, 161091464);
                           }

                           byte var93 = (byte)(1365022755 ^ var72);

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                                 case 228800413:
                                    var72 = 691665344 ^ var72;
                                    return (var93 != 0);
                                 case 268658058:
                                    break;
                                 case 1001971440:
                                    return (var93 != 0);
                                 case 1635851440:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        } else {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                                 case 115363832:
                                    var72 ^= 1557689242;
                                    return ((285641537 ^ var72) != 0);
                                 case 950271245:
                                    break;
                                 case 1066097513:
                                    return ((285641537 ^ var72) != 0);
                                 case 1089587401:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        }
                     }
                  }
               } else {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                        case 16175023:
                           var72 ^= 268552598;
                           return ((285641537 ^ var72) != 0);
                        case 46176441:
                           return ((285641537 ^ var72) != 0);
                        case 830153164:
                        default:
                           throw new RuntimeException(new IOException());
                        case 2036110635:
                     }
                  }
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                  case 233929245:
                     var72 ^= 1670013158;
                     return ((285641537 ^ var72) != 0);
                  case 880525890:
                     break;
                  case 1700706987:
                     return ((285641537 ^ var72) != 0);
                  case 1995719643:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
               case 266160311:
                  var72 ^= 1358492456;
                  return ((285641537 ^ var72) != 0);
               case 1025046036:
               default:
                  throw new RuntimeException(new IOException());
               case 1347346702:
                  return ((285641537 ^ var72) != 0);
               case 1647012285:
            }
         }
      }
   }

   private static Set<Block> set(Block... var0) {
      int var10 = 496737133 ^ 2073845195 ^ 189043002;
      var10 = 1110887844 ^ var10;
      IdentityHashMap var1 = new IdentityHashMap();
      Set var3 = Collections.newSetFromMap(var1);
      boolean var5 = Collections.addAll(var3, var0);
      return var3;
   }

   static {
      int var96 = 1998825987 ^ 1942368881 ^ Integer.parseInt("141646488");
      int var93 = new Random(-7087574130110387292L).nextInt();
      ChbtRFWcht = -1820544962 ^ var93;
      var96 = 326866025 ^ var96;
      byte var0 = (byte)(535778961 ^ var96);
      Block[] var3 = new Block[var0];
      byte var1 = (byte)(535778947 ^ var96);
      Block var2 = Blocks.CALCITE;
      var3[var1] = var2;
      byte var9 = (byte)(535778946 ^ var96);
      Block var50 = Blocks.SMOOTH_BASALT;
      var3[var9] = var50;
      byte var10 = (byte)(535778945 ^ var96);
      Block var51 = Blocks.AMETHYST_BLOCK;
      var3[var10] = var51;
      byte var11 = (byte)(535778944 ^ var96);
      Block var52 = Blocks.BUDDING_AMETHYST;
      var3[var11] = var52;
      byte var12 = (byte)(535778951 ^ var96);
      Block var53 = Blocks.DRIPSTONE_BLOCK;
      var3[var12] = var53;
      byte var13 = (byte)(535778950 ^ var96);
      Block var54 = Blocks.POINTED_DRIPSTONE;
      var3[var13] = var54;
      byte var14 = (byte)(535778949 ^ var96);
      Block var55 = Blocks.MOSS_BLOCK;
      var3[var14] = var55;
      byte var15 = (byte)(535778948 ^ var96);
      Block var56 = Blocks.MOSS_CARPET;
      var3[var15] = var56;
      byte var16 = (byte)(535778955 ^ var96);
      Block var57 = Blocks.ROOTED_DIRT;
      var3[var16] = var57;
      byte var17 = (byte)(535778954 ^ var96);
      Block var58 = Blocks.CLAY;
      var3[var17] = var58;
      byte var18 = (byte)(535778953 ^ var96);
      Block var59 = Blocks.SCULK;
      var3[var18] = var59;
      byte var19 = (byte)(535778952 ^ var96);
      Block var60 = Blocks.SCULK_VEIN;
      var3[var19] = var60;
      byte var20 = (byte)(535778959 ^ var96);
      Block var61 = Blocks.SCULK_CATALYST;
      var3[var20] = var61;
      byte var21 = (byte)(535778958 ^ var96);
      Block var62 = Blocks.SCULK_SENSOR;
      var3[var21] = var62;
      byte var22 = (byte)(535778957 ^ var96);
      Block var63 = Blocks.SCULK_SHRIEKER;
      var3[var22] = var63;
      byte var23 = (byte)(535778956 ^ var96);
      Block var64 = Blocks.MAGMA_BLOCK;
      var3[var23] = var64;
      byte var24 = (byte)(535778963 ^ var96);
      Block var65 = Blocks.NETHERRACK;
      var3[var24] = var65;
      byte var25 = (byte)(535778962 ^ var96);
      Block var66 = Blocks.CRYING_OBSIDIAN;
      var3[var25] = var66;
      Set var4 = set(var3);
      NATURAL = var4;
      byte var5 = (byte)(535778971 ^ var96);
      Block[] var6 = new Block[var5];
      byte var26 = (byte)(535778947 ^ var96);
      Block var67 = Blocks.COAL_ORE;
      var6[var26] = var67;
      byte var27 = (byte)(535778946 ^ var96);
      Block var68 = Blocks.DEEPSLATE_COAL_ORE;
      var6[var27] = var68;
      byte var28 = (byte)(535778945 ^ var96);
      Block var69 = Blocks.IRON_ORE;
      var6[var28] = var69;
      byte var29 = (byte)(535778944 ^ var96);
      Block var70 = Blocks.DEEPSLATE_IRON_ORE;
      var6[var29] = var70;
      byte var30 = (byte)(535778951 ^ var96);
      Block var71 = Blocks.COPPER_ORE;
      var6[var30] = var71;
      byte var31 = (byte)(535778950 ^ var96);
      Block var72 = Blocks.DEEPSLATE_COPPER_ORE;
      var6[var31] = var72;
      byte var32 = (byte)(535778949 ^ var96);
      Block var73 = Blocks.GOLD_ORE;
      var6[var32] = var73;
      byte var33 = (byte)(535778948 ^ var96);
      Block var74 = Blocks.DEEPSLATE_GOLD_ORE;
      var6[var33] = var74;
      byte var34 = (byte)(535778955 ^ var96);
      Block var75 = Blocks.REDSTONE_ORE;
      var6[var34] = var75;
      byte var35 = (byte)(535778954 ^ var96);
      Block var76 = Blocks.DEEPSLATE_REDSTONE_ORE;
      var6[var35] = var76;
      byte var36 = (byte)(535778953 ^ var96);
      Block var77 = Blocks.LAPIS_ORE;
      var6[var36] = var77;
      byte var37 = (byte)(535778952 ^ var96);
      Block var78 = Blocks.DEEPSLATE_LAPIS_ORE;
      var6[var37] = var78;
      byte var38 = (byte)(535778959 ^ var96);
      Block var79 = Blocks.DIAMOND_ORE;
      var6[var38] = var79;
      byte var39 = (byte)(535778958 ^ var96);
      Block var80 = Blocks.DEEPSLATE_DIAMOND_ORE;
      var6[var39] = var80;
      byte var40 = (byte)(535778957 ^ var96);
      Block var81 = Blocks.EMERALD_ORE;
      var6[var40] = var81;
      byte var41 = (byte)(535778956 ^ var96);
      Block var82 = Blocks.DEEPSLATE_EMERALD_ORE;
      var6[var41] = var82;
      byte var42 = (byte)(535778963 ^ var96);
      Block var83 = Blocks.RAW_IRON_BLOCK;
      var6[var42] = var83;
      byte var43 = (byte)(535778962 ^ var96);
      Block var84 = Blocks.RAW_COPPER_BLOCK;
      var6[var43] = var84;
      byte var44 = (byte)(535778961 ^ var96);
      Block var85 = Blocks.INFESTED_STONE;
      var6[var44] = var85;
      byte var45 = (byte)(535778960 ^ var96);
      Block var86 = Blocks.INFESTED_DEEPSLATE;
      var6[var45] = var86;
      byte var46 = (byte)(535778967 ^ var96);
      Block var87 = Blocks.MOSSY_COBBLESTONE;
      var6[var46] = var87;
      byte var47 = (byte)(535778966 ^ var96);
      Block var88 = Blocks.OBSIDIAN;
      var6[var47] = var88;
      byte var48 = (byte)(535778965 ^ var96);
      Block var89 = Blocks.CHEST;
      var6[var48] = var89;
      byte var49 = (byte)(535778964 ^ var96);
      Block var90 = Blocks.ENDER_CHEST;
      var6[var49] = var90;
      Set var7 = set(var6);
      FAKES = var7;
      ConcurrentHashMap var8 = new ConcurrentHashMap();
      STRUCTURE = var8;
   }

   public static String thxsilwprj(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] sfpcbeuncyteplw() {
      return new byte[]{
         90,
         68,
         40,
         114,
         49,
         100,
         88,
         88,
         116,
         60,
         69,
         29,
         26,
         54,
         86,
         125,
         56,
         3,
         5,
         68,
         13,
         13,
         102,
         49,
         89,
         105,
         1,
         94,
         57,
         1,
         95,
         55,
         109,
         80,
         99,
         114,
         16,
         16,
         83,
         39,
         24,
         79,
         43,
         126,
         1,
         98,
         17,
         68,
         105,
         43,
         123,
         9,
         105,
         8,
         118,
         78,
         92,
         62,
         62,
         44,
         31,
         112,
         45,
         101,
         17,
         52,
         122,
         16,
         21,
         115,
         13,
         83,
         75,
         47,
         3,
         119,
         47,
         36,
         125,
         113,
         54,
         3,
         20
      };
   }

   private static byte[] wratoymlawzpadz() {
      return new byte[]{
         -100,
         -114,
         31,
         58,
         1,
         50,
         96,
         3,
         66,
         109,
         112,
         89,
         34,
         110,
         111,
         32,
         15,
         81,
         61,
         46,
         58,
         81,
         86,
         109,
         97,
         59,
         55,
         22,
         12,
         69,
         103,
         107,
         84,
         9,
         84,
         48,
         40,
         64
      };
   }

   private static byte[] uaenpywduqqufex() {
      return new byte[]{-110, -116, 24, 34, 2, 50, 107, 14, 77, 122, 114, 94, 46, 105, 101, 47, 11, 78, 51, 22, 61, 102, 85, 118, 106, 51, 56, 4, 14, 84};
   }

   private static byte[] nvzghrxcykdqeze() {
      return new byte[]{
         -106, -117, 27, 53, 3, 53, 97, 30, 64, 82, 119, 78, 41, 108, 100, 61, 1, 66, 49, 16, 63, 79, 85, 91, 107, 59, 56, 3, 13, 95, 109, 100, 94, 14
      };
   }

   private static byte[] ciiakfvtycfrhma() {
      return new byte[]{-107, -116, 24, 41, 9, 41, 105, 10, 64, 84, 116, 72, 42, 114, 110, 44, 9, 86, 49, 24};
   }

   private static byte[] brifaspjnyiiyit() {
      return new byte[]{-107, -118, 17, 54, 6, 35, 96, 6, 76, 108};
   }

   private static byte[] szrligswgqkmktd() {
      return new byte[]{-107, -114, 25, 51, 8, 38, 111, 19, 70, 125, 112, 69, 40, 108, 97, 35, 0, 94, 52, 4, 60, 76, 95, 89};
   }

   private static byte[] okznuwchdntdxxo() {
      return new byte[]{-107, -119, 31, 57, 1, 37, 105, 15, 71, 103, 116, 72, 45, 107};
   }

   private static byte[] oageblbxzzwdbqn() {
      return new byte[]{
         -109,
         -116,
         17,
         32,
         3,
         59,
         106,
         0,
         77,
         120,
         114,
         65,
         43,
         104,
         97,
         42,
         9,
         94,
         50,
         44,
         52,
         88,
         84,
         99,
         107,
         61,
         56,
         25,
         14,
         75,
         110,
         105,
         90,
         3,
         82,
         63,
         39,
         66
      };
   }

   private static byte[] vrlrzkwvcvqxaky() {
      return new byte[]{-107, -113, 16, 56, 5, 32, 97, 14, 66, 96, 116, 76, 34, 80, 98, 47, 1, 72, 51, 31, 60, 90, 94, 99};
   }

   private static byte[] cmrdbbihqqmbeju() {
      return new byte[]{-106, -118, 28, 54, 2, 39, 96, 9, 71, 125, 116, 68, 46, 100, 103, 55, 0, 89, 55, 27, 57, 92};
   }

   private static byte[] juuhqsmeinlanfq() {
      return new byte[]{-106, -114, 29, 51, 1, 48, 110, 28, 76, 124, 112, 73, 47, 101, 103, 36, 14, 79, 55, 5, 56, 89};
   }

   private static byte[] arcfoxjcxttwwhe() {
      return new byte[]{-107, -125, 25, 44, 9, 33, 104, 8};
   }

   private static byte[] qpuchpxfpptcmes() {
      return new byte[]{
         -100, -117, 27, 32, 2, 34, 108, 8, 65, 103, 117, 69, 43, 96, 98, 45, 9, 105, 61, 16, 62, 89, 85, 96, 109, 40, 52, 21, 9, 94, 110, 101, 89, 16, 82, 34
      };
   }

   private static byte[] tvzctndhjizhgpp() {
      return new byte[]{-107, -113, 26, 32, 9, 57, 104, 17, 65, 120, 116, 76, 40, 117};
   }

   private static byte[] boohuueikvchklb() {
      return new byte[]{
         -107, -117, 25, 46, 2, 57, 105, 10, 67, 121, 116, 94, 43, 98, 101, 36, 9, 64, 50, 20, 60, 98, 87, 107, 106, 35, 48, 0, 14, 87, 110, 108
      };
   }

   private static byte[] rrqzeddanemcurn() {
      return new byte[]{-99, -113, 30, 63, 7, 33, 104, 12, 66, 99};
   }

   private static int nsttnqkwnjybhduw(int var0, int var1) {
      return var0 ^ var1;
   }
}
