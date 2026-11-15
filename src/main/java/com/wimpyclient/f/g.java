package com.wimpyclient.f;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class g {
   public static final int CRYSTAL_VISIBLE_MIN = 3;
   public static final int AMETHYST_CLUSTER_BASE = 4;
   public static final int AMETHYST_CLUSTER_99 = 40;
   private static final int STRUCTURE_CHANCE_FLOOR = 40;
   private static final int COCOA_FLOOR = 40;
   private static final int BEE_NEST_FLOOR = 5;
   private static final int TRIAL_CHAMBER_BASE = 8;
   private static final int STRUCTURE_CHANCE_BASE = 45;
   private static final int CAVE_VINE_TIP_BASE = 48;
   private static final int CAVE_VINE_BODY_BASE = 64;
   private static final int VINE_BASE = 224;
   private static final int BAMBOO_STALK_BASE = 180;
   private static final int BAMBOO_THICK_BASE = 100;
   private static final int KELP_TIP_BASE = 100;
   private static final int KELP_BODY_BASE = 140;
   private static final int FARMLAND_BASE = 28;
   private static final int CROP_BASE = 48;
   private static final int SUGAR_CANE_BASE = 96;
   private static final int COCOA_BASE = 48;
   private static final int BEEHIVE_BASE = 2;
   private static final int BEE_NEST_BASE = 5;
   private static final int FULL_HONEY_BASE = 1;
   private static final int BERRY_BASE = 3;
   private static final int DRIPSTONE_SPIKE_BASE = 2;
   private static final int GROWN_GRASS_BASE = 96;
   private static final int LUSH_DECOR_MAX = 3;
   private static final int LUSH_ROOT_MAX = 6;
   private static final int LUSH_MOSS_MAX = 16;
   private static final int LUSH_COMBINED_MAX = 20;
   private static final int JUNGLE_CANOPY_MAX_FOR_VINES = 24;
   private static final int MANGROVE_CANOPY_MAX_FOR_VINES = 16;
   private static final int OCEAN_DECOR_MAX = 8;
   private static final int BAMBOO_FOREST_CANOPY = 48;
   private static final int BAMBOO_FOREST_PODZOL = 8;
   private static int nMz1rYRwkE;
   private transient int QNOzc2gh72;
   private static String wipneqvwck = ByteBuffer.wrap(llkbdsboaozpakj()).asCharBuffer().toString();

   private g() {
super();
      int var4 = 824962792 ^ 593255098;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 63438633:
               var4 = 1690184879 ^ var4;
            case 47701160:
               var4 = 1622343960 ^ 2106245185 ^ Integer.parseInt("1810913700");
               this.QNOzc2gh72 = 386832458 ^ nMz1rYRwkE;
               var4 = mpluhssuaobhalsb(var4, 869859073);
               return;
            case 1738907215:
            default:
               throw new RuntimeException(new IOException());
            case 1796501994:
         }
      }
   }

   private static int structureScore(g$a var0) {
      byte var1;
      int var6;
      byte var22;
      int var56;
      label39: {
         var56 = 276220790 ^ 1448077393 ^ 272723821;
         var56 = 2025725837 ^ var56;
         var1 = (byte)(784749511 ^ var56);
         var6 = var1;
         int var9 = var0.repeaters;
         if (var9 <= (784749511 ^ var56)) {
            var56 = 596673586 ^ var56;
            int var11 = var0.workstations;
            if (var11 <= (223795189 ^ var56)) {
               var56 = 1706569069 ^ var56;
               int var13 = var0.hoppers;
               byte var2 = (byte)(1760492186 ^ var56);
               if (var13 < var2) {
                  var56 = mpluhssuaobhalsb(var56, 330905826);
                  var22 = (byte)(2069348986 ^ var56);
                  var56 = 1319575105 ^ var56;
                  break label39;
               }

               var56 = 1754138356 ^ var56;
            } else {
               var56 = mpluhssuaobhalsb(var56, 221653913);
            }
         } else {
            var56 = 782675883 ^ var56;
         }

         var22 = (byte)(6356077 ^ var56);

         label34:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
               case 5958853:
                  var56 ^= 898637911;
               case 1591968280:
                  break label34;
               case 1902679192:
               default:
                  throw new RuntimeException(new IOException());
               case 2068298139:
            }
         }
      }

      if (var22 != (904977467 ^ var56)) {
         var56 = 621934920 ^ var56;
         byte var23 = (byte)(283190578 ^ var56);
         int var29 = var0.deepslateFloor;
         byte var4 = (byte)(283190641 ^ var56);
         int var30 = var29 / var4;
         int var24 = Math.min(var23, var30);
         int var16 = var1 + var24;
         var6 = var16;
         var56 = 1310592636 ^ var56;
      } else {
         var56 = 1796208436 ^ var56;
      }

      byte var25 = (byte)(1593781077 ^ var56);
      int var32 = var0.repeaters;
      byte var39 = (byte)(1593781023 ^ var56);
      int var33 = var32 * var39;
      int var41 = var0.poweredRepeaters;
      byte var5 = (byte)(1593781011 ^ var56);
      int var42 = var41 * var5;
      int var34 = var33 + var42;
      int var26 = Math.min(var25, var34);
      int var18 = var6 + var26;
      byte var27 = (byte)(1593781099 ^ var56);
      int var36 = var0.workstations;
      byte var43 = (byte)(1593781021 ^ var56);
      int var37 = var36 * var43;
      int var45 = var0.hoppers;
      byte var47 = (byte)(1593780993 ^ var56);
      int var46 = var45 * var47;
      int var38 = var37 + var46;
      int var28 = Math.min(var27, var38);
      return var18 + var28;
   }

   private static int structureChance(int var0) {
      int var12 = 1393979203 ^ 1190094444 ^ 272723821;
      var12 = 1528655228 ^ var12;
      byte var1 = (byte)(1587874602 ^ var12);
      byte var2 = (byte)(1587874653 ^ var12);
      byte var3 = (byte)(1587874599 ^ var12);
      byte var5 = (byte)(1587874620 ^ var12);
      int var9 = var0 / var5;
      int var8 = var3 + var9;
      int var7 = Math.min(var2, var8);
      return Math.max(var1, var7);
   }

   public static int primeClusterNeed(int var0) {
      int var9 = 845719596 ^ 682755701 ^ 272723821;
      var9 = 609953567 ^ var9;
      byte var1 = (byte)(784393769 ^ var9);
      int var5 = clampSensitivity(var0);
      byte var3 = (byte)(784393769 ^ var9);
      int var6 = var5 * var3;
      return var1 + var6;
   }

   public static int strippedCrystalNeed(int var0) {
      int var23 = 1298230500 ^ 446355690 ^ 272723821;
      var23 = 2119935228 ^ var23;
      byte var1 = (byte)(971079572 ^ var23);
      int var11 = clampSensitivity(var0);
      int var8 = var1 - var11;
      byte var9 = (byte)(971079575 ^ var23);
      double var12 = 40.0;
      byte var4 = (byte)(971079582 ^ var23);
      int var17 = var8 - var4;
      double var18 = var17;
      double var5 = 3.5555555555555554;
      double var20 = var18 * var5;
      double var14 = var12 - var20;
      int var16 = (int)var14;
      return Math.max(var9, var16);
   }

   public static boolean hasGeodeShell(g$a var0) {
      int var38;
      int var37 = 286079137 ^ 369871958 ^ 272723821;
      var38 = 252746483 ^ var37;
      int var3 = var0.calcite;
      byte var2 = (byte)(408355181 ^ var38);
      label86:
      if (var3 < var2) {
         var38 = 528335777 ^ var38;
         int var5 = var0.calcite;
         byte var25 = (byte)(120242890 ^ var38);
         if (var5 >= var25) {
            var38 = 233260186 ^ var38;
            int var7 = var0.smoothBasalt;
            byte var26 = (byte)(181241425 ^ var38);
            if (var7 >= var26) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                     case 82722547:
                        var38 ^= 1445661410;
                        break label86;
                     case 590549237:
                        break;
                     case 680927854:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1591262638:
                        break label86;
                  }
               }
            }

            var38 = 1129626957 ^ var38;
         } else {
            var38 = mpluhssuaobhalsb(var38, 1320417751);
         }

         int var9 = var0.calcite;
         byte var27 = (byte)(1234778909 ^ var38);
         if (var9 >= var27) {
            var38 = 422769116 ^ var38;
            int var11 = var0.amethystBlock;
            byte var28 = (byte)(1353435841 ^ var38);
            if (var11 >= var28) {
               var38 = mpluhssuaobhalsb(var38, 206390899);
               break label86;
            }

            var38 = 1940305183 ^ var38;
         } else {
            var38 = mpluhssuaobhalsb(var38, 1788101827);
         }

         int var13 = var0.smoothBasalt;
         byte var29 = (byte)(588087258 ^ var38);
         if (var13 >= var29) {
            var38 = 1426706682 ^ var38;
            int var15 = var0.amethystBlock;
            byte var30 = (byte)(1980018469 ^ var38);
            if (var15 >= var30) {
               var38 = 719463318 ^ var38;
               break label86;
            }

            var38 = 1954398433 ^ var38;
         } else {
            label82:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                  case 65668279:
                     var38 ^= 561254427;
                  case 288166728:
                     break label82;
                  case 355282560:
                     break;
                  case 1973049189:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }

         int var17 = var0.amethystBlock;
         byte var31 = (byte)(41512897 ^ var38);
         if (var17 >= var31) {
            var38 = 1792286572 ^ var38;
            int var19 = var0.calcite;
            byte var32 = (byte)(1756197034 ^ var38);
            if (var19 >= var32) {
               var38 = 877394971 ^ var38;
               break label86;
            }

            var38 = 1833663318 ^ var38;
         } else {
            label74:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                  case 38918835:
                     var38 ^= 127886394;
                     break label74;
                  case 483167664:
                     break;
                  case 1384399849:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1529375900:
                     break label74;
               }
            }
         }

         int var21 = var0.shellTotal();
         byte var33 = (byte)(98962423 ^ var38);
         if (var21 >= var33) {
            var38 = 491971882 ^ var38;
            int var23 = var0.calcite;
            byte var34 = (byte)(414510805 ^ var38);
            if (var23 >= var34) {
               var38 = 1146249831 ^ var38;
               break label86;
            }

            var38 = mpluhssuaobhalsb(var38, 392587036);
         } else {
            var38 = mpluhssuaobhalsb(var38, 171213366);
         }

         byte var49 = (byte)(265456075 ^ var38);
         var38 = 375991666 ^ var38;
         return (var49 != 0);
      } else {
         label46:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
               case 99214172:
                  break;
               case 254315244:
                  var38 ^= 1152486873;
                  break label46;
               case 320346010:
               default:
                  throw new RuntimeException(new IOException());
               case 1311261044:
                  break label46;
            }
         }
      }

      byte var24 = (byte)(1558613169 ^ var38);
      var38 = mpluhssuaobhalsb(var38, 1163733001);
      return (var24 != 0);
   }

   public static int scaleBySensitivity(int var0, int var1) {
      int var54 = 421935139 ^ 772098935 ^ 272723821;
      var54 = 408882666 ^ var54;
      int var10 = clampSensitivity(var1);
      byte var11 = (byte)(1060966855 ^ var54);
      byte var4 = (byte)(1060966851 ^ var54);
      int var27 = var10 * var4;
      int var12 = var11 + var27;
      byte var43 = (byte)(1060966875 ^ var54);
      int var29;
      if (var10 >= var43) {
         var54 = 1692055046 ^ var54;
         byte var48 = (byte)(1541908434 ^ var54);
         int var42 = var10 - var48;
         byte var49 = (byte)(1541908447 ^ var54);
         var29 = var42 * var49;
         var54 = mpluhssuaobhalsb(var54, 1260329357);
      } else {
         label32:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
               case 176582069:
                  var54 ^= 1357318940;
               case 1606779939:
                  var29 = (byte)(1876564687 ^ var54);
                  var54 = 2132976791 ^ var54;
                  break label32;
               case 898858490:
               default:
                  throw new RuntimeException();
               case 957989790:
            }
         }
      }

      int var13 = var12 + var29;
      int var15 = var0 * var13;
      byte var31 = (byte)(284737130 ^ var54);
      int var16 = var15 + var31;
      byte var32 = (byte)(284737084 ^ var54);
      int var17 = var16 / var32;
      int var9 = var17;
      byte var33 = (byte)(284737113 ^ var54);
      if (var0 > var33) {
         var54 = 980375072 ^ var54;
         byte var34 = (byte)(714598525 ^ var54);
         if (var10 < var34) {
            var54 = 1523938975 ^ var54;
            byte var39 = (byte)(1883414246 ^ var54);
            byte var50 = (byte)(1883414242 ^ var54);
            int var51 = var50 - var10;
            int var47 = var0 - var51;
            int var40 = Math.max(var39, var47);
            int var26 = Math.min(var17, var40);
            var9 = var26;
            var54 = 2005674733 ^ var54;
         } else {
            var54 = mpluhssuaobhalsb(var54, 635359524);
            byte var35 = (byte)(256457049 ^ var54);
            if (var10 > var35) {
               var54 = 1028426603 ^ var54;
               byte var5 = (byte)(839234098 ^ var54);
               int var45 = var10 - var5;
               int var37 = var0 + var45;
               int var22 = Math.max(var17, var37);
               var9 = var22;
               var54 = 902497853 ^ var54;
            } else {
               var54 = mpluhssuaobhalsb(var54, 143101270);
            }
         }
      } else {
         var54 = 389417554 ^ var54;
      }

      byte var23 = (byte)(130987019 ^ var54);
      return Math.max(var23, var9);
   }

   private static int scaleAtLeast(int var0, int var1, int var2) {
      int var10 = 1239121368 ^ 209661412 ^ 272723821;
      var10 = 1224261766 ^ var10;
      int var7 = scaleBySensitivity(var0, var1);
      return Math.max(var2, var7);
   }

   public static int clampSensitivity(int var0) {
      int var8 = 1517997134 ^ 1495108032 ^ 272723821;
      var8 = 491144673 ^ var8;
      byte var1 = (byte)(241200899 ^ var8);
      byte var2 = (byte)(241200904 ^ var8);
      int var5 = Math.min(var2, var0);
      return Math.max(var1, var5);
   }

   public static int clusterConfidence(int var0, int var1) {
      int var21 = 362542833 ^ 3005947 ^ 272723821;
      var21 = 139667373 ^ var21;
      byte var2 = (byte)(228877259 ^ var21);
      int var8 = Math.max(var2, var1);
      if (var0 < var8) {
         var21 = 1242996512 ^ var21;
         return (byte)(1202912490 ^ var21);
      } else {
         var21 = mpluhssuaobhalsb(var21, 1057050314);
         byte var5 = (byte)(849685761 ^ var21);
         int var15 = var8 + var5;
         byte var17 = (byte)(849685800 ^ var21);
         int var16 = Math.max(var15, var17);
         byte var18 = (byte)(849685815 ^ var21);
         byte var6 = (byte)(849685859 ^ var21);
         return scaleScore(var0, var8, var16, var18, var6);
      }
   }

   public static int geodeShellConfidence(int var0) {
      int var14 = 1224138366 ^ 878858840 ^ 272723821;
      var14 = 828276972 ^ var14;
      if (var0 <= (1569416103 ^ var14)) {
         var14 = 1948728484 ^ var14;
         return (byte)(699162371 ^ var14);
      } else {
         var14 = mpluhssuaobhalsb(var14, 981736027);
         byte var2 = (byte)(1729067508 ^ var14);
         if (var0 < var2) {
            var14 = 1855379384 ^ var14;
            return (byte)(161066611 ^ var14);
         } else {
            var14 = mpluhssuaobhalsb(var14, 1461414043);
            byte var11 = (byte)(806621551 ^ var14);
            byte var3 = (byte)(806621447 ^ var14);
            byte var4 = (byte)(806621520 ^ var14);
            byte var5 = (byte)(806621493 ^ var14);
            return scaleScore(var0, var11, var3, var4, var5);
         }
      }
   }

   public static int confidencePercent(int var0, int var1) {
      int var47 = 80983545 ^ 1241908814 ^ 272723821;
      var47 = 2022493294 ^ var47;
      byte var2 = (byte)(639111349 ^ var47);
      int var14 = Math.max(var2, var1);
      if (var0 < var14) {
         var47 = 1405003551 ^ var47;
         return (byte)(1973860267 ^ var47);
      } else {
         var47 = mpluhssuaobhalsb(var47, 1736980762);
         int var18 = var0 - var14;
         double var19 = var18;
         double var32 = var14;
         double var5 = 2.0;
         double var34 = var32 * var5;
         double var21 = var19 / var34;
         double var23 = 55.0;
         double var36 = 45.0;
         double var40 = 0.0;
         double var7 = 1.0;
         double var44 = Math.min(var7, var21);
         double var42 = Math.max(var40, var44);
         double var38 = var36 * var42;
         double var25 = var23 + var38;
         long var27 = Math.round(var25);
         return (int)var27;
      }
   }

   public static int scaleScore(int var0, int var1, int var2, int var3, int var4) {
      int var42 = 2016122075 ^ 1352496984 ^ 272723821;
      var42 = 126265972 ^ var42;
      if (var0 <= var1) {
         var42 = 1185424250 ^ var42;
         return var3;
      } else {
         label46:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
               case 183174587:
                  var42 ^= 1005296914;
                  break;
               case 1602460446:
                  continue;
               case 1676832713:
                  break;
               case 2044353196:
               default:
                  throw new IllegalStateException();
            }

            if (var2 > var1) {
               var42 = 2082748163 ^ var42;
               if (var0 >= var2) {
                  var42 = 47796182 ^ var42;
                  return var4;
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                     case 5954309:
                        break label46;
                     case 166807795:
                        var42 = 1641572131 ^ var42;
                        break label46;
                     case 1165790657:
                        break;
                     case 2036520856:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                  case 72420181:
                     var42 = 2130540757 ^ var42;
                     return var4;
                  case 441941754:
                     return var4;
                  case 1496160318:
                  default:
                     throw new IllegalStateException();
                  case 2094791007:
               }
            }
         }

         int var17 = var2 - var1;
         int var19 = var0 - var1;
         int var27 = var4 - var3;
         double var28 = var27;
         double var35 = var19;
         double var39 = var17;
         double var37 = var35 / var39;
         double var30 = var28 * var37;
         long var32 = Math.round(var30);
         int var34 = (int)var32;
         return var3 + var34;
      }
   }

   static {
      int var3 = new Random(2987216066188432408L).nextInt();
      nMz1rYRwkE = 2130441492 ^ var3;
   }

   public static String hcqhhxheik(byte[] var0, int var1) {
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
      String var29 = wipneqvwck;
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

   private static byte[] llkbdsboaozpakj() {
      return new byte[0];
   }

   private static int mpluhssuaobhalsb(int var0, int var1) {
      return var0 ^ var1;
   }
}
