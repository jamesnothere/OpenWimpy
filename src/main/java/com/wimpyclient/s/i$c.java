package com.wimpyclient.s;

import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class i$c {
   static final int TOP = 200;
   private final int originX;
   private final int originZ;
   private int[] nonBase;
   private int[] ores;
   private final List<c$b> fogs;
   private static int cLgRVlR2pi;
   private transient int f0NPsDgv1R2;

   i$c(int var1, int var2) {
super();
      int var26 = 1881150301 ^ 32194376;
      
      var26 = dybbflyaevkdmsgx(var26, 138860293);
      var26 = 236101799 ^ 871839517 ^ Integer.parseInt("1147694250");
      this.f0NPsDgv1R2 = 378912943 ^ cLgRVlR2pi;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
            case 193163234:
               var26 = 289799290 ^ var26;
            case 118497556:
               byte var4 = 0;
               int[] var10 = new int[var4];
               this.nonBase = var10;
               byte var11 = 0;
               int[] var12 = new int[var11];
               this.ores = var12;
               ArrayList var13 = new ArrayList();
               this.fogs = var13;
               byte var20 = 1;
               int var15 = var1 - var20;
               byte var21 = 4;
               int var16 = var15 << var21;
               this.originX = var16;
               byte var22 = 1;
               int var18 = var2 - var22;
               byte var23 = 4;
               int var19 = var18 << var23;
               this.originZ = var19;
               return;
            case 979799539:
            default:
               throw new IllegalStateException();
            case 1180500773:
         }
      }
   }

   private int index(int var1, int var2, int var3) {
      int var37 = 4352011 ^ 2044715955 ^ 1685907220;
      var37 = 333038016 ^ var37;
      int var23 = this.originX;
      int var8 = var1 - var23;
      int var25 = this.originZ;
      int var10 = var3 - var25;
      if (var8 >= (238595436 ^ var37)) {
         var37 = 639382730 ^ var37;
         byte var26 = (byte)(673487254 ^ var37);
         if (var8 < var26) {
            var37 = 1544731502 ^ var37;
            if (var10 >= (1949704904 ^ var37)) {
               var37 = 1197812762 ^ var37;
               byte var27 = (byte)(861081314 ^ var37);
               if (var10 < var27) {
                  var37 ^= 954391660;
                  byte var28 = (byte)(-196203138 ^ var37);
                  if (var2 >= var28) {
                     var37 = 1767452185 ^ var37;
                     short var29 = (short)(1659436143 ^ var37);
                     if (var2 <= var29) {
                        var37 = 2125349963 ^ var37;
                        byte var30 = (byte)(-474396884 ^ var37);
                        int var18 = var2 - var30;
                        byte var31 = (byte)(474396892 ^ var37);
                        int var19 = var18 * var31;
                        int var20 = var19 + var10;
                        byte var33 = (byte)(474396892 ^ var37);
                        int var21 = var20 * var33;
                        int var22 = var21 + var8;
                        var37 = 377875202 ^ var37;
                        return var22;
                     }

                     var37 = 1683970386 ^ var37;
                  } else {
                     label32:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                           case 111707105:
                              var37 ^= 218527563;
                              break label32;
                           case 660113123:
                              break;
                           case 1224998366:
                              break label32;
                           case 1583676928:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }
               } else {
                  label39:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                        case 57728997:
                           var37 ^= 904178471;
                           break label39;
                        case 1356272513:
                           break;
                        case 1590376984:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1608745439:
                           break label39;
                     }
                  }
               }
            } else {
               var37 = dybbflyaevkdmsgx(var37, 1921091389);
            }
         } else {
            var37 = 781401171 ^ var37;
         }
      } else {
         var37 = 143591577 ^ var37;
      }

      byte var46 = (byte)(-112698870 ^ var37);
      var37 = 208991771 ^ var37;
      return var46;
   }

   boolean absorb(c var1) {
      int var100 = 1689894861 ^ 1785582909 ^ 1685907220;
      var100 = 1046006532 ^ var100;
      IntOpenHashSet var2 = new IntOpenHashSet();
      IntOpenHashSet var6 = var2;
      IntOpenHashSet var14 = new IntOpenHashSet();
      IntOpenHashSet var7 = var14;
      byte var15 = (byte)(1425032928 ^ var100);
      int var8 = var15;
      var100 = 1964503455 ^ var100;

      label170:
      while (true) {
         int var68 = var1.size();
         if (var8 < var68) {
            var100 ^= 1139503900;
            long var44 = var1.key(var8);
            int var80 = BlockPos.getX(var44);
            int var92 = BlockPos.getY(var44);
            int var95 = BlockPos.getZ(var44);
            int var47 = this.index(var80, var92, var95);
            int var11 = var47;
            if (var47 >= (1645003875 ^ var100)) {
               var100 = 1919140476 ^ var100;
               byte var49 = (byte)(275711519 ^ var100);
               int var12 = var49;
               var100 = 587737460 ^ var100;

               label104:
               while (true) {
                  int var82 = var1.writeCount(var8);
                  if (var12 >= var82) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var100)) {
                           case 60283064:
                              var100 ^= 1366736693;
                           case 250172034:
                              break label104;
                           case 394696083:
                           default:
                              throw new IllegalStateException();
                           case 1495540313:
                        }
                     }
                  }

                  var100 = 1310320260 ^ var100;
                  short var52 = var1.write(var8, var12);
                  byte var53 = c.kind(var52);
                  byte var55 = (byte)((m.isBase(var53)) ? 1 : 0);
                  if (var55 != (2105461231 ^ var100)) {
                     var100 = dybbflyaevkdmsgx(var100, 250563481);
                  } else {
                     var100 = 2107596324 ^ var100;
                     int[] var57 = this.nonBase;
                     int var58 = Arrays.binarySearch(var57, var11);
                     if (var58 < (14784459 ^ var100)) {
                        var100 = 546328534 ^ var100;
                        boolean var60 = var6.add(var11);
                        var100 = 810797044 ^ var100;
                     } else {
                        label99:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var100)) {
                              case 13860527:
                                 var100 ^= 281249826;
                                 break label99;
                              case 283576296:
                                 break;
                              case 1785230964:
                                 break label99;
                              case 2087505210:
                              default:
                                 throw new IllegalStateException();
                           }
                        }
                     }

                     byte var86 = (byte)(270671842 ^ var100);
                     if (var53 != var86) {
                        var100 = dybbflyaevkdmsgx(var100, 1672715679);
                     } else {
                        var100 = 1715282316 ^ var100;
                        int[] var63 = this.ores;
                        int var64 = Arrays.binarySearch(var63, var11);
                        if (var64 < (1981759077 ^ var100)) {
                           var100 = 79743108 ^ var100;
                           boolean var66 = var7.add(var11);
                           var100 = 21918871 ^ var100;
                        } else {
                           label91:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var100)) {
                                 case 81592060:
                                    var100 ^= 93240339;
                                    break label91;
                                 case 781603864:
                                    break;
                                 case 1061331181:
                                    break label91;
                                 case 1740570164:
                                 default:
                                    throw new IllegalStateException();
                              }
                           }
                        }
                     }
                  }

                  var12 += 1938915959 ^ var100;
                  var100 = dybbflyaevkdmsgx(var100, 1089907997);
               }
            } else {
               label70:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var100)) {
                     case 234413683:
                        var100 ^= 1922109;
                        break label70;
                     case 251866156:
                        break;
                     case 1729895166:
                     default:
                        throw new IllegalStateException();
                     case 1777827628:
                        break label70;
                  }
               }
            }

            var8 += 1645318239 ^ var100;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var100)) {
                  case 235038119:
                     var100 ^= 1140205345;
                  case 863481823:
                     continue label170;
                  case 1497323082:
                     break;
                  case 2111957897:
                  default:
                     throw new IllegalStateException();
               }
            }
         } else {
            byte var21;
            label164: {
               var100 = 1640193494 ^ var100;
               byte var18 = (byte)((var6.isEmpty()) ? 1 : 0);
               if (var18 != (1076161193 ^ var100)) {
                  var100 = 255672600 ^ var100;
                  byte var20 = (byte)((var7.isEmpty()) ? 1 : 0);
                  if (var20 != (1327082417 ^ var100)) {
                     var100 = 2092300594 ^ var100;
                     var21 = (byte)(866931331 ^ var100);
                     var100 = 88719384 ^ var100;
                     break label164;
                  }

                  var100 = 1522253837 ^ var100;
               } else {
                  label162:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var100)) {
                        case 206030467:
                           var100 ^= 1434878229;
                        case 901610229:
                           break label162;
                        case 1640111198:
                        default:
                           throw new IllegalStateException();
                        case 1748715395:
                     }
                  }
               }

               var21 = (byte)(362965949 ^ var100);
               var100 = dybbflyaevkdmsgx(var100, 591919399);
            }

            byte var96 = var21;
            int[] var70 = this.nonBase;
            int[] var71 = merged(var70, var6);
            this.nonBase = var71;
            int[] var73 = this.ores;
            int[] var74 = merged(var73, var7);
            this.ores = var74;
            List var25 = var1.fogs();
            Iterator var26 = var25.iterator();
            Iterator var9 = var26;
            var100 = 1874543128 ^ var100;

            label152:
            while (true) {
               byte var28 = (byte)((var9.hasNext()) ? 1 : 0);
               if (var28 == (1499385987 ^ var100)) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var100)) {
                        case 220719779:
                           var100 = 454106889 ^ var100;
                           return (var96 != 0);
                        case 1071305561:
                           break;
                        case 1349201407:
                        default:
                           throw new IllegalStateException();
                        case 1848356455:
                           return (var96 != 0);
                     }
                  }
               }

               var100 ^= 1838461266;
               Object var31 = var9.next();
               c$b var32 = (c$b)var31;
               byte var34 = var32.kind();
               byte var35 = (byte)((m.isBase(var34)) ? 1 : 0);
               if (var35 == (885678545 ^ var100)) {
                  var100 ^= 1112455489;
                  List var37 = this.fogs;
                  byte var38 = (byte)((var37.contains(var32)) ? 1 : 0);
                  if (var38 == (1988417680 ^ var100)) {
                     var100 = 577799159 ^ var100;
                     List var40 = this.fogs;
                     boolean var41 = var40.add(var32);
                     byte var42 = (byte)(1425300326 ^ var100);
                     var96 = var42;
                     var100 = 1196352303 ^ var100;
                  } else {
                     label127:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var100)) {
                           case 94442771:
                              var100 ^= 1698586840;
                           case 1327924070:
                              break label127;
                           case 1730189978:
                              break;
                           case 1744216259:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }
               } else {
                  label138:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var100)) {
                        case 105392462:
                           var100 ^= 661707161;
                           break label138;
                        case 1097654798:
                           break;
                        case 1205973077:
                           break label138;
                        case 1868251564:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var100)) {
                     case 104453809:
                        var100 ^= 1256483019;
                     case 497247114:
                        continue label152;
                     case 1867612170:
                        break;
                     case 2093353875:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }
         }
      }
   }

   private static int[] merged(int[] var0, IntOpenHashSet var1) {
      int var29 = 191953346 ^ 1052829176 ^ 1927882683;
      var29 = 1695831642 ^ var29;
      byte var8 = (byte)((var1.isEmpty()) ? 1 : 0);
      if (var8 != (575499739 ^ var29)) {
         var29 = 1957719931 ^ var29;
         return var0;
      } else {
         var29 = 24530289 ^ var29;
         int var21 = var0.length;
         int var24 = var1.size();
         int var22 = var21 + var24;
         int[] var10 = Arrays.copyOf(var0, var22);
         int[] var5 = var10;
         int var12 = var0.length;
         int var6 = var12;
         IntIterator var14 = var1.iterator();
         IntIterator var7 = var14;
         var29 = 43013608 ^ var29;

         while (true) {
            byte var16 = (byte)((var7.hasNext()) ? 1 : 0);
            if (var16 == (564884802 ^ var29)) {
               var29 = 356846051 ^ var29;
               Arrays.sort(var5);
               return var5;
            }

            var29 = 1927577386 ^ var29;
            int var23 = var6;
            var6 += 1397688937 ^ var29;
            int var26 = var7.nextInt();
            var5[var23] = var26;
            var29 = 1927577386 ^ var29;
         }
      }
   }

   boolean nonBase(int var1, int var2, int var3) {
      int var35 = 1398354794 ^ 663183703 ^ 1685907220;
      var35 = 1424565160 ^ var35;
      int var11 = this.index(var1, var2, var3);
      if (var11 >= (1145804417 ^ var35)) {
         var35 = 271262231 ^ var35;
         int[] var14 = this.nonBase;
         int var15 = Arrays.binarySearch(var14, var11);
         if (var15 >= (1415623830 ^ var35)) {
            var35 = 785022398 ^ var35;
            return (((byte)(2058012969 ^ var35)) != 0);
         }

         var35 = dybbflyaevkdmsgx(var35, 1221359963);
      } else {
         var35 = 1491557196 ^ var35;
      }

      List var18 = this.fogs;
      Iterator var19 = var18.iterator();
      Iterator var9 = var19;
      var35 = 341829777 ^ var35;

      label36:
      while (true) {
         byte var21 = (byte)((var9.hasNext()) ? 1 : 0);
         if (var21 == (150152540 ^ var35)) {
            var35 = 1379655921 ^ var35;
            return (((byte)(1523107245 ^ var35)) != 0);
         }

         var35 = 1335589342 ^ var35;
         Object var23 = var9.next();
         c$b var24 = (c$b)var23;
         byte var26 = (byte)((var24.contains(var1, var2, var3)) ? 1 : 0);
         if (var26 != (1198021762 ^ var35)) {
            var35 = 1932997316 ^ var35;
            return (((byte)(878669383 ^ var35)) != 0);
         }

         var35 = 308650370 ^ var35;

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var35)) {
               case 80432957:
                  var35 ^= 1576982620;
                  continue label36;
               case 617085581:
                  break;
               case 1101140888:
               default:
                  throw new IllegalStateException();
               case 1166079418:
                  continue label36;
            }
         }
      }
   }

   boolean ore(int var1, int var2, int var3) {
      int var38 = 636287884 ^ 140361560 ^ 1685907220;
      var38 = 350016596 ^ var38;
      int var11 = this.index(var1, var2, var3);
      if (var11 >= (1561425812 ^ var38)) {
         var38 = 2040257304 ^ var38;
         int[] var14 = this.ores;
         int var15 = Arrays.binarySearch(var14, var11);
         if (var15 >= (613067916 ^ var38)) {
            var38 = 1037785507 ^ var38;
            return (((byte)(424801582 ^ var38)) != 0);
         }

         label58:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
               case 114068165:
                  var38 ^= 1701932191;
                  break label58;
               case 146575287:
                  break;
               case 305155536:
               default:
                  throw new IllegalStateException();
               case 1001329205:
                  break label58;
            }
         }
      } else {
         var38 = 485144455 ^ var38;
      }

      List var18 = this.fogs;
      Iterator var19 = var18.iterator();
      Iterator var9 = var19;
      var38 = 1683041922 ^ var38;

      label50:
      while (true) {
         byte var21 = (byte)((var9.hasNext()) ? 1 : 0);
         if (var21 == (631959185 ^ var38)) {
            var38 = dybbflyaevkdmsgx(var38, 1206028843);
            return (((byte)(1648911546 ^ var38)) != 0);
         }

         var38 ^= 115557142;
         Object var23 = var9.next();
         c$b var24 = (c$b)var23;
         byte var26 = var24.kind();
         byte var32 = (byte)(592031116 ^ var38);
         if (var26 == var32) {
            var38 = 571276849 ^ var38;
            byte var28 = (byte)((var24.contains(var1, var2, var3)) ? 1 : 0);
            if (var28 != (21320630 ^ var38)) {
               var38 = 711133123 ^ var38;
               return (((byte)(723932276 ^ var38)) != 0);
            }

            var38 = 34382127 ^ var38;
         } else {
            label36:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                  case 73327484:
                     var38 ^= 536895262;
                  case 386198871:
                     break label36;
                  case 715009182:
                     break;
                  case 889150201:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
               case 51728422:
                  var38 ^= 652418056;
                  continue label50;
               case 212429259:
               default:
                  throw new IllegalStateException();
               case 1677387217:
                  continue label50;
               case 2087834034:
            }
         }
      }
   }

   static {
      int var3 = new Random(1548999600211227537L).nextInt();
      cLgRVlR2pi = 649992635 ^ var3;
   }

   public static String wwpbjvnthn(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] gsmrviankzvtplg() {
      return new byte[]{
         106, 116, 17, 92, 85, 46, 107, 75, 11, 75, 23, 102, 121, 9, 74, 91, 69, 114, 104, 56, 53, 65, 122, 104, 38, 14, 126, 7, 24, 118, 120, 50
      };
   }

   private static int dybbflyaevkdmsgx(int var0, int var1) {
      return var1 ^ var0;
   }
}
