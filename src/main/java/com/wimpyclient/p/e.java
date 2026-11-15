package com.wimpyclient.p;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class e {
   public static final e INSTANCE;
   private static final int AIR_STATE;
   private static final int SECTION_SIZE = 4096;
   private static final int[] EMPTY_SURFACE;
   private final Map<Long, e$c> snapshots;
   private static int QTwsIOoMfg;
   private transient int V1nuXvsVH4;

   private e() {
super();
      int var6 = 1101020808 ^ 1932600110;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var6)) {
            case 33102816:
               var6 = 1740948983 ^ var6;
            case 300720837:
               var6 = 1127170484 ^ 1331316082 ^ Integer.parseInt("1495325847");
               this.V1nuXvsVH4 = 1211212731 ^ QTwsIOoMfg;

               label22:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var6)) {
                     case 89523785:
                        var6 = 852538244 ^ var6;
                     case 725829638:
                        break label22;
                     case 851857316:
                        break;
                     case 1341505942:
                     default:
                        throw new RuntimeException();
                  }
               }

               ConcurrentHashMap var2 = new ConcurrentHashMap();
               this.snapshots = var2;
               return;
            case 789733211:
               break;
            case 1321765230:
            default:
               throw new RuntimeException();
         }
      }
   }

   public static long key(int var0, int var1) {
      int var18 = 1240743588 ^ 168977533 ^ 696563890;
      var18 = 1058446801 ^ var18;
      long var6 = var0;
      byte var3 = (byte)(1433698202 ^ var18);
      long var8 = var6 << var3;
      long var13 = var1;
      long var4 = 4294967295L;
      long var15 = var13 & var4;
      return var8 | var15;
   }

   public static int index(int var0, int var1, int var2) {
      int var14 = 1707797627 ^ 1307901404 ^ 696563890;
      var14 = 611738143 ^ var14;
      byte var4 = (byte)(634178306 ^ var14);
      int var6 = var1 << var4;
      byte var5 = (byte)(634178318 ^ var14);
      int var10 = var2 << var5;
      int var7 = var6 | var10;
      return var7 | var0;
   }

   public e$b capture(LevelChunk var1, int[] var2, int var3) {
      int var66 = 437392852 ^ 595749907 ^ 1639258889;
      var66 = 1870103929 ^ var66;
      LevelChunkSection[] var20 = var1.getSections();
      LevelChunkSection[] var12 = var20;
      int var22 = var20.length;
      int[][] var23 = new int[var22][];
      int[][] var13 = var23;
      byte var24 = (byte)(928180151 ^ var66);
      int var14 = var24;
      var66 = 1126117385 ^ var66;

      while (true) {
         int var42 = var12.length;
         if (var14 >= var42) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var66)) {
                  case 22455885:
                     var66 = 1216681614 ^ var66;
                  case 938405942:
                     ChunkPos var55 = var1.getPos();
                     int var56 = var55.x;
                     ChunkPos var59 = var1.getPos();
                     int var60 = var59.z;
                     int var62 = var1.getMinY();
                     return new e$b(var56, var60, var62, var3, var13, var2);
                  case 111964275:
                     break;
                  case 1872155200:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var66 = 767149261 ^ var66;
         LevelChunkSection var27 = var12[var14];
         LevelChunkSection var15 = var27;
         if (var27 == null) {
            var66 = ybsnshvaekwelftk(var66, 16253648);
         } else {
            var66 = 362609615 ^ var66;
            byte var30 = (byte)((var27.hasOnlyAir()) ? 1 : 0);
            if (var30 != (1281943740 ^ var66)) {
               var66 = 767179112 ^ var66;
               var66 = ybsnshvaekwelftk(var66, 954122359);
            } else {
               var66 = 1465145912 ^ var66;
               short var31 = (short)(456958596 ^ var66);
               int[] var32 = new int[var31];
               int[] var16 = var32;
               byte var33 = (byte)(456962692 ^ var66);
               int var17 = var33;
               var66 = 2075069090 ^ var66;

               while (true) {
                  byte var44 = (byte)(1620293686 ^ var66);
                  if (var17 >= var44) {
                     var66 = ybsnshvaekwelftk(var66, 441730662);
                     var13[var14] = var16;
                     var66 = 600567779 ^ var66;
                     break;
                  }

                  var66 = 1900184702 ^ var66;
                  byte var35 = (byte)(298925144 ^ var66);
                  int var18 = var35;
                  var66 = 920046879 ^ var66;

                  while (true) {
                     byte var45 = (byte)(654831959 ^ var66);
                     if (var18 >= var45) {
                        var66 = ybsnshvaekwelftk(var66, 695337005);
                        var17 += 242610539 ^ var66;
                        var66 = 1860585804 ^ var66;
                        break;
                     }

                     var66 = 478199719 ^ var66;
                     byte var37 = (byte)(998723296 ^ var66);
                     int var19 = var37;
                     var66 = 1985738236 ^ var66;

                     while (true) {
                        byte var46 = (byte)(1306311436 ^ var66);
                        if (var19 >= var46) {
                           var66 = 1822728106 ^ var66;
                           var18 += 561521847 ^ var66;
                           var66 = 109041137 ^ var66;
                           break;
                        }

                        var66 = 993054294 ^ var66;
                        int var48 = index(var19, var17, var18);
                        BlockState var51 = var15.getBlockState(var19, var17, var18);
                        int var52 = Block.getId(var51);
                        var16[var48] = var52;
                        var19 += 1995208011 ^ var66;
                        var66 = ybsnshvaekwelftk(var66, 993054294);
                     }
                  }
               }
            }
         }

         var14 += 1493963170 ^ var66;
         var66 = ybsnshvaekwelftk(var66, 759285277);
      }
   }

   public boolean has(int var1, int var2) {
      int var13 = 1674270579 ^ 644319852 ^ 1639258889;
      var13 = 1133863234 ^ var13;
      Map var6 = this.snapshots;
      long var8 = key(var1, var2);
      Long var10 = var8;
      return var6.containsKey(var10);
   }

   public e$b getPacked(int var1, int var2) {
      int var69 = 1036399475 ^ 1987069096 ^ 1639258889;
      var69 = 1653377167 ^ var69;
      Map var16 = this.snapshots;
      long var51 = key(var1, var2);
      Long var53 = var51;
      Object var17 = var16.get(var53);
      e$c var18 = (e$c)var17;
      int[][] var65;
      if (var18 != null) {
         var69 = 239994553 ^ var69;
         Map var21 = var18.sections;
         byte var22 = (byte)((var21.isEmpty()) ? 1 : 0);
         if (var22 != (1187111652 ^ var69)) {
            var69 = 82538284 ^ var69;
            return null;
         }

         label54:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var69)) {
               case 152559960:
                  var69 ^= 347489250;
                  break label54;
               case 613423486:
               default:
                  throw new IllegalStateException();
               case 755609850:
                  break label54;
               case 759677748:
            }
         }

         byte var23 = (byte)(-1383571719 ^ var69);
         int var12 = var23;
         Map var25 = var18.sections;
         Set var26 = var25.keySet();
         Iterator var27 = var26.iterator();
         Iterator var13 = var27;
         var69 = 923223019 ^ var69;

         label46:
         while (true) {
            byte var29 = (byte)((var13.hasNext()) ? 1 : 0);
            if (var29 == (1701896941 ^ var69)) {
               var69 = ybsnshvaekwelftk(var69, 936529476);
               byte var55 = (byte)(1386392744 ^ var69);
               int var37 = var12 + var55;
               int[][] var38 = new int[var37][];
               var65 = var38;
               Map var40 = var18.sections;
               Set var41 = var40.entrySet();
               Iterator var42 = var41.iterator();
               Iterator var66 = var42;
               var69 = 838763395 ^ var69;

               while (true) {
                  byte var44 = (byte)((var66.hasNext()) ? 1 : 0);
                  if (var44 == (1666985770 ^ var69)) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var69)) {
                           case 8583229:
                              var69 ^= 144704358;
                              break label46;
                           case 552041972:
                           default:
                              throw new IllegalStateException();
                           case 1142019556:
                              break;
                           case 1837659241:
                              break label46;
                        }
                     }
                  }

                  var69 = 182695685 ^ var69;
                  Object var46 = var66.next();
                  Entry var47 = (Entry)var46;
                  Object var57 = var47.getKey();
                  Integer var58 = (Integer)var57;
                  int var59 = var58;
                  Object var61 = var47.getValue();
                  int[] var62 = (int[])var61;
                  var65[var59] = var62;
                  var69 = ybsnshvaekwelftk(var69, 182695685);
               }
            }

            var69 = 1536150367 ^ var69;
            Object var31 = var13.next();
            Integer var32 = (Integer)var31;
            int var33 = var32;
            if (var33 > var12) {
               var69 = 859017678 ^ var69;
               var12 = var33;
               var69 = 1285736796 ^ var69;
            } else {
               var69 = ybsnshvaekwelftk(var69, 2140231826);
            }

            var69 = ybsnshvaekwelftk(var69, 605983693);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var69)) {
               case 59275634:
                  break;
               case 211190523:
                  var69 = 178612629 ^ var69;
                  return null;
               case 949292064:
               default:
                  throw new IllegalStateException();
               case 1605308404:
                  return null;
            }
         }
      }

      int var64 = var18.minY;
      byte var8 = (byte)(1811688563 ^ var69);
      int[] var10 = EMPTY_SURFACE;
      return new e$b(var1, var2, var64, var8, var65, var10);
   }

   public void store(int var1, int var2, int var3, int[][] var4) {
      int var37 = 641148180 ^ 930762385 ^ 1639258889;
      var37 = 90840851 ^ var37;
      ConcurrentHashMap var5 = new ConcurrentHashMap();
      ConcurrentHashMap var9 = var5;
      byte var11 = (byte)(1972531103 ^ var37);
      int var10 = var11;
      var37 = 1519746197 ^ var37;

      while (true) {
         int var21 = var4.length;
         if (var10 >= var21) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                  case 186489828:
                     var37 = 196239998 ^ var37;
                  case 1744200295:
                     Map var14 = this.snapshots;
                     long var23 = key(var1, var2);
                     Long var25 = var23;
                     e$c var29 = new e$c(var3, var9);
                     Object var15 = var14.put(var25, var29);
                     return;
                  case 235746781:
                     break;
                  case 1155588614:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }

         var37 = 1801481526 ^ var37;
         int[] var17 = var4[var10];
         if (var17 != null) {
            var37 = 2097176438 ^ var37;
            Integer var28 = var10;
            int[] var31 = var4[var10];
            Object var32 = var31.clone();
            int[] var33 = (int[])var32;
            Object var19 = var9.put(var28, var33);
            var37 = 405188135 ^ var37;
         } else {
            var37 = 1697050961 ^ var37;
         }

         var10 += 557944684 ^ var37;
         var37 = ybsnshvaekwelftk(var37, 239508583);
      }
   }

   public void remove(int var1, int var2) {
      int var13 = 788568630 ^ 2075607874 ^ 1639258889;
      var13 = 940860464 ^ var13;
      Map var6 = this.snapshots;
      long var8 = key(var1, var2);
      Long var10 = var8;
      Object var7 = var6.remove(var10);
   }

   public void clear() {
      int var5 = 1217626409 ^ 1586224548 ^ 1639258889;
      var5 = 2101292888 ^ var5;
      Map var2 = this.snapshots;
      var2.clear();
   }

   public int size() {
      int var6 = 1986604330 ^ 635488147 ^ 1639258889;
      var6 = 871908459 ^ var6;
      Map var2 = this.snapshots;
      return var2.size();
   }

   public void retain(LongPredicate var1) {
      int var10 = 1559981991 ^ 970484445 ^ 1639258889;
      var10 = 609666704 ^ var10;
      Map var4 = this.snapshots;
      Set var5 = var4.keySet();
      Predicate<Long> var7 = var1x -> {
         int var9 = 811536327 ^ 904649471 ^ 696563890;
         var9 = 210530989 ^ var9;
         long var6x = var1x;
         byte var4x = (byte)((var1.test(var6x)) ? 1 : 0);
         if (var4x == (549199655 ^ var9)) {
            var9 = 929657478 ^ var9;
            byte var14 = (byte)(399863200 ^ var9);
            var9 = ybsnshvaekwelftk(var9, 1463575445);
            return (var14 != 0);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var9)) {
                  case 258759911:
                     var9 ^= 956703106;
                  case 138328970:
                     byte var5x = (byte)(431636133 ^ var9);
                     var9 = 1498624145 ^ var9;
                     return (var5x != 0);
                  case 1813639898:
                  default:
                     throw new IllegalStateException();
                  case 2068696145:
               }
            }
         }
      };
      boolean var6 = var5.removeIf(var7);
   }

   public List<e$a> compare(int var1, int var2, int var3, int[][] var4) {
      int var123 = 206070936 ^ 771664858 ^ 1639258889;
      var123 = 1222079998 ^ var123;
      ArrayList var5 = new ArrayList();
      ArrayList var14 = var5;
      Map var25 = this.snapshots;
      long var73 = key(var1, var2);
      Long var75 = var73;
      Object var26 = var25.get(var75);
      e$c var27 = (e$c)var26;
      e$c var15 = var27;
      byte var29 = (byte)((isEmpty(var27)) ? 1 : 0);
      if (var29 != (148152757 ^ var123)) {
         var123 = 1416226413 ^ var123;
         return var5;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
               case 18608538:
                  var123 ^= 1099633965;
               case 690575560:
                  Map var32 = var27.sections;
                  byte var33 = (byte)((var32.isEmpty()) ? 1 : 0);
                  int var34;
                  if (var33 != (1231008920 ^ var123)) {
                     var123 = 1048501918 ^ var123;
                     var34 = (byte)(1998678534 ^ var123);
                     var123 = 649870578 ^ var123;
                  } else {
                     var123 = 762656689 ^ var123;
                     byte var71 = (byte)(1680507688 ^ var123);
                     Map var100 = var27.sections;
                     Set var101 = var100.keySet();
                     Stream var102 = var101.stream();
                     ToIntFunction<Object> var109 = var0 -> {
                        int var5x = 1771604245 ^ 1949436035 ^ 696563890;
                        var5x = 234120511 ^ var5x;
                        return ((Integer)var0).intValue();
                     };
                     IntStream var103 = var102.mapToInt(var109);
                     OptionalInt var104 = var103.max();
                     byte var110 = (byte)(1680507689 ^ var123);
                     int var105 = var104.orElse(var110);
                     var34 = var71 + var105;
                     var123 = 901240285 ^ var123;
                  }

                  int var77 = var4.length;
                  int var35 = Math.max(var34, var77);
                  int var16 = var35;
                  byte var36 = (byte)(1369265908 ^ var123);
                  int var17 = var36;
                  var123 = 1879654773 ^ var123;

                  while (var17 < var16) {
                     var123 = 1626419984 ^ var123;
                     Map var39 = var15.sections;
                     Integer var80 = var17;
                     Object var40 = var39.get(var80);
                     int[] var41 = (int[])var40;
                     int[] var18 = var41;
                     int var82 = var4.length;
                     int[] var44;
                     if (var17 >= var82) {
                        var123 = ybsnshvaekwelftk(var123, 1369259692);
                        var44 = null;
                        var123 = 1042278988 ^ var123;
                     } else {
                        var123 = 620124916 ^ var123;
                        var44 = var4[var17];

                        label95:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
                              case 52379451:
                                 break label95;
                              case 80585072:
                                 var123 ^= 1265929748;
                                 break label95;
                              case 630398000:
                                 break;
                              case 1383562170:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     }

                     label234: {
                        int[] var19 = var44;
                        if (var41 == null) {
                           var123 = 1951190550 ^ var123;
                           if (var44 == null) {
                              var123 = 951008441 ^ var123;
                              var123 = 422608339 ^ var123;
                              break label234;
                           }

                           label215:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
                                 case 5906988:
                                 default:
                                    throw new RuntimeException();
                                 case 11312166:
                                    break;
                                 case 262902348:
                                    var123 ^= 1034729681;
                                 case 1299104485:
                                    break label215;
                              }
                           }
                        } else {
                           var123 = 1239447239 ^ var123;
                        }

                        if (var41 != null) {
                           var123 = 141687267 ^ var123;
                           if (var44 != null) {
                              var123 = 512209649 ^ var123;
                              byte var50 = (byte)((Arrays.equals(var41, var44)) ? 1 : 0);
                              if (var50 != (1911672228 ^ var123)) {
                                 var123 = 85883977 ^ var123;
                                 var123 = 266063584 ^ var123;
                                 break label234;
                              }

                              label119:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
                                    case 214175644:
                                       var123 ^= 890791093;
                                       break label119;
                                    case 603978206:
                                    default:
                                       throw new RuntimeException();
                                    case 977119043:
                                       break;
                                    case 1291237824:
                                       break label119;
                                 }
                              }

                              byte var51 = (byte)(1156163857 ^ var123);
                              int var20 = var51;
                              var123 = 1870670058 ^ var123;

                              while (true) {
                                 int var86 = var18.length;
                                 if (var20 >= var86) {
                                    label106:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
                                          case 68960447:
                                             var123 ^= 536968921;
                                             break label106;
                                          case 1032849129:
                                          default:
                                             throw new RuntimeException();
                                          case 1666299135:
                                             break;
                                          case 2015608910:
                                             break label106;
                                       }
                                    }

                                    var123 = 1885110319 ^ var123;
                                    break label234;
                                 }

                                 var123 = 1393872544 ^ var123;
                                 int var54 = var18[var20];
                                 int var89 = var19[var20];
                                 if (var54 != var89) {
                                    var123 = 1563166990 ^ var123;
                                    int var115 = var19[var20];
                                    int var118 = var18[var20];
                                    e$a var91 = this.toChange(var1, var2, var3, var17, var20, var115, var118);
                                    boolean var56 = var14.add(var91);
                                    var123 = 309086122 ^ var123;
                                 } else {
                                    var123 = ybsnshvaekwelftk(var123, 1329614500);
                                 }

                                 var20 += 926745086 ^ var123;
                                 var123 = ybsnshvaekwelftk(var123, 475299844);
                              }
                           }

                           var123 = 1899581625 ^ var123;
                        } else {
                           var123 = 2034805082 ^ var123;
                        }

                        int[] var58;
                        if (var41 != null) {
                           var123 = 1578052317 ^ var123;
                           var58 = var41;

                           label205:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
                                 case 209472078:
                                    var123 ^= 765930697;
                                 case 332746228:
                                    break label205;
                                 case 914795986:
                                 default:
                                    throw new RuntimeException();
                                 case 1942664826:
                              }
                           }
                        } else {
                           var123 = 250677497 ^ var123;
                           var58 = var44;
                           var123 = 2102988525 ^ var123;
                        }

                        int[] var120 = var58;
                        byte var59 = (byte)(1843866104 ^ var123);
                        int var21 = var59;
                        var123 = 1031371304 ^ var123;

                        label198:
                        while (true) {
                           int var93 = var120.length;
                           if (var21 >= var93) {
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
                                    case 204641021:
                                       var123 ^= 732572893;
                                    case 897538936:
                                       break label198;
                                    case 1445503856:
                                    default:
                                       throw new RuntimeException();
                                    case 1495476759:
                                 }
                              }
                           }

                           var123 = 1118733951 ^ var123;
                           int var69;
                           if (var18 != null) {
                              var123 = 1592011853 ^ var123;
                              var69 = var18[var21];

                              label141:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
                                    case 81586417:
                                       var123 ^= 1007229395;
                                    case 798464632:
                                       break label141;
                                    case 1679434492:
                                       break;
                                    case 1825464406:
                                    default:
                                       throw new RuntimeException();
                                 }
                              }
                           } else {
                              label151:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
                                    case 54430771:
                                       var123 ^= 2136872807;
                                    case 658338028:
                                       break label151;
                                    case 1140357713:
                                    default:
                                       throw new RuntimeException();
                                    case 1255359704:
                                 }
                              }

                              var69 = (byte)(1835975368 ^ var123);
                              var123 = 498279161 ^ var123;
                           }

                           byte var22 = (byte)var69;
                           int var64;
                           if (var19 != null) {
                              var123 = 1020405122 ^ var123;
                              var64 = var19[var21];

                              label161:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
                                    case 56541957:
                                       var123 ^= 1915191399;
                                       break label161;
                                    case 200225838:
                                       break;
                                    case 620331588:
                                       break label161;
                                    case 762494133:
                                    default:
                                       throw new RuntimeException();
                                 }
                              }
                           } else {
                              label171:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
                                    case 49455460:
                                    default:
                                       throw new RuntimeException();
                                    case 179147395:
                                       var123 ^= 222336506;
                                    case 1759710949:
                                       break label171;
                                    case 2023873697:
                                 }
                              }

                              var64 = (byte)(2107471307 ^ var123);
                              var123 = 1135947807 ^ var123;
                           }

                           if (var22 != var64) {
                              var123 = 1296172540 ^ var123;
                              e$a var97 = this.toChange(var1, var2, var3, var17, var21, var64, var22);
                              boolean var67 = var14.add(var97);
                              var123 = 532253560 ^ var123;
                           } else {
                              label183:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
                                    case 141441378:
                                       var123 ^= 1392217732;
                                       break label183;
                                    case 204232173:
                                    default:
                                       throw new RuntimeException();
                                    case 1141709918:
                                       break;
                                    case 2118714031:
                                       break label183;
                                 }
                              }
                           }

                           var21 += 1825819473 ^ var123;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var123)) {
                                 case 47854904:
                                    var123 ^= 1011718272;
                                 case 371556893:
                                    continue label198;
                                 case 1045805330:
                                 default:
                                    throw new RuntimeException();
                                 case 1472702425:
                              }
                           }
                        }
                     }

                     var17 += 2067037964 ^ var123;
                     var123 = 1520461964 ^ var123;
                  }

                  var123 = ybsnshvaekwelftk(var123, 1370594075);
                  return var14;
               case 1190917504:
                  break;
               case 1325075251:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   public BlockState getWorld(int var1, int var2, int var3) {
      int var58 = 190036098 ^ 1692584618 ^ 1639258889;
      var58 = 1912931796 ^ var58;
      Map var14 = this.snapshots;
      byte var6 = (byte)(2080468209 ^ var58);
      int var38 = var1 >> var6;
      byte var7 = (byte)(2080468209 ^ var58);
      int var53 = var3 >> var7;
      long var39 = key(var38, var53);
      Long var41 = var39;
      Object var15 = var14.get(var41);
      e$c var16 = (e$c)var15;
      if (var16 == null) {
         var58 = 1246518570 ^ var58;
         return null;
      } else {
         var58 = 503618999 ^ var58;
         int var43 = var16.minY;
         int var19 = var2 - var43;
         byte var44 = (byte)(1644556614 ^ var58);
         int var20 = var19 >> var44;
         Map var22 = var16.sections;
         Integer var46 = var20;
         Object var23 = var22.get(var46);
         int[] var24 = (int[])var23;
         if (var24 == null) {
            var58 = 2136688696 ^ var58;
            Block var26 = Blocks.AIR;
            return var26.defaultBlockState();
         } else {
            var58 = ybsnshvaekwelftk(var58, 275042653);
            byte var47 = (byte)(1918967824 ^ var58);
            int var29 = var1 & var47;
            byte var48 = (byte)(1918967824 ^ var58);
            int var31 = var2 & var48;
            byte var49 = (byte)(1918967824 ^ var58);
            int var33 = var3 & var49;
            int var51 = index(var29, var31, var33);
            int var35 = var24[var51];
            return Block.stateById(var35);
         }
      }
   }

   private e$a toChange(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var46 = 476482701 ^ 1748994876 ^ 1639258889;
      var46 = 77370090 ^ var46;
      byte var9 = (byte)(292589149 ^ var46);
      int var18 = var5 & var9;
      byte var26 = (byte)(292589142 ^ var46);
      int var20 = var5 >> var26;
      byte var27 = (byte)(292589149 ^ var46);
      int var21 = var20 & var27;
      byte var28 = (byte)(292589146 ^ var46);
      int var23 = var5 >> var28;
      byte var29 = (byte)(292589149 ^ var46);
      int var24 = var23 & var29;
      byte var11 = (byte)(292589122 ^ var46);
      int var30 = var1 * var11;
      int var31 = var30 + var18;
      byte var13 = (byte)(292589122 ^ var46);
      int var36 = var4 * var13;
      int var34 = var3 + var36;
      int var35 = var34 + var24;
      byte var41 = (byte)(292589122 ^ var46);
      int var39 = var2 * var41;
      int var40 = var39 + var21;
      return new e$a(var31, var35, var40, var6, var7);
   }

   private static boolean isEmpty(e$c var0) {
      int var37 = 615270834 ^ 306361566 ^ 696563890;
      var37 = 1498580905 ^ var37;
      if (var0 != null) {
         var37 = 1440755270 ^ var37;
         Map var10 = var0.sections;
         byte var11 = (byte)((var10.isEmpty()) ? 1 : 0);
         if (var11 == (332983345 ^ var37)) {
            var37 = ybsnshvaekwelftk(var37, 623873149);
            Map var13 = var0.sections;
            Collection var14 = var13.values();
            Iterator var15 = var14.iterator();
            Iterator var3 = var15;
            var37 = 1601622501 ^ var37;

            label49:
            while (true) {
               byte var17 = (byte)((var3.hasNext()) ? 1 : 0);
               if (var17 == (1770107305 ^ var37)) {
                  var37 = 545898875 ^ var37;
                  return (((byte)(1225289939 ^ var37)) != 0);
               }

               var37 = 1647474124 ^ var37;
               Object var20 = var3.next();
               int[] var21 = (int[])var20;
               if (var21 != null) {
                  var37 = ybsnshvaekwelftk(var37, 713353945);
                  int[] var5 = var21;
                  int var25 = var21.length;
                  int var6 = var25;
                  byte var26 = (byte)(557264572 ^ var37);
                  int var7 = var26;
                  var37 = 695912456 ^ var37;

                  while (var7 < var6) {
                     var37 = 726262773 ^ var37;
                     int var29 = var5[var7];
                     int var34 = AIR_STATE;
                     if (var29 != var34) {
                        var37 = 649904127 ^ var37;
                        return (((byte)(95992510 ^ var37)) != 0);
                     }

                     var37 = 461256387 ^ var37;
                     var7 += 947532675 ^ var37;
                     var37 = 808965430 ^ var37;
                  }

                  var37 = ybsnshvaekwelftk(var37, 749918582);

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                        case 128888696:
                           var37 ^= 1300139627;
                           continue label49;
                        case 1207864696:
                           break;
                        case 1983448521:
                        default:
                           throw new IllegalStateException();
                        case 2141379988:
                           continue label49;
                     }
                  }
               } else {
                  var37 = 1025066222 ^ var37;
                  var37 = 1596666146 ^ var37;
               }
            }
         }

         var37 = 340271610 ^ var37;
      } else {
         var37 = ybsnshvaekwelftk(var37, 1101533116);
      }

      return (((byte)(126930378 ^ var37)) != 0);
   }

   static {
      int var11 = 994479052 ^ 1329206279 ^ Integer.parseInt("1495325847");
      int var8 = new Random(7151979230682484230L).nextInt();
      QTwsIOoMfg = 1767190614 ^ var8;
      var11 = 303376053 ^ var11;
      e var0 = new e();
      INSTANCE = var0;
      Block var1 = Blocks.AIR;
      BlockState var2 = var1.defaultBlockState();
      int var3 = Block.getId(var2);
      AIR_STATE = var3;
      short var4 = (short)(1061774569 ^ var11);
      int[] var5 = new int[var4];
      EMPTY_SURFACE = var5;
   }

   public static String vcgbhnktbi(byte[] var0, byte[] var1, int var2) {
      String var11 = Integer.toString(var2);
      byte[] var12 = var11.getBytes();
      byte[] var9 = var12;
      byte var13 = 0;
      int var10 = var13;

      while (true) {
         int var18 = var0.length;
         if (var10 >= var18) {
            Charset var6 = StandardCharsets.UTF_16;
            return new String(var0, var6);
         }

         byte var21 = var0[var10];
         int var34 = var9.length;
         int var31 = var10 % var34;
         byte var28 = var9[var31];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var10] = var23;
         byte var24 = var0[var10];
         int var36 = var1.length;
         int var33 = var10 % var36;
         byte var30 = var1[var33];
         int var25 = var24 ^ var30;
         byte var26 = (byte)var25;
         var0[var10] = var26;
         var10++;
      }
   }

   private static byte[] dpzykekauvvuher() {
      return new byte[]{116, 35, 10, 111, 110, 98, 89, 33, 87, 26, 71, 106, 30, 92, 5, 38, 100, 110, 38, 96, 70, 104, 93, 103};
   }

   private static int ybsnshvaekwelftk(int var0, int var1) {
      return var0 ^ var1;
   }
}
