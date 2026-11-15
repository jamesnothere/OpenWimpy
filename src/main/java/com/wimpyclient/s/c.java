package com.wimpyclient.s;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class c {
   public final int chunkX;
   public final int chunkZ;
   private final long[] keys;
   private final int[] first;
   private final short[] writes;
   private final c$b[] fogs;
   private static int seiCOnaDev;
   private transient int XpKoqipFFX;
   private static byte[] hwmbptlnog = ecnerdvjqfnboxa();

   public c(int var1, int var2, long[] var3, int[] var4, short[] var5, c$b[] var6) {
super();
      int var22 = 296897298 ^ 428600406;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
            case 129369334:
               var22 = 1164386557 ^ var22;
            case 484303797:
               var22 = 950915335 ^ 1382912340 ^ Integer.parseInt("664717290");
               this.XpKoqipFFX = 457681714 ^ seiCOnaDev;
               var22 = uisyiqjueqcebhnl(var22, 1872458819);
               this.chunkX = var1;
               this.chunkZ = var2;
               this.keys = var3;
               this.first = var4;
               this.writes = var5;
               this.fogs = var6;
               return;
            case 511248348:
            default:
               throw new RuntimeException();
            case 1016316979:
         }
      }
   }

   static short pack(int var0, byte var1, boolean var2) {
      int var16 = 1536504982 ^ 2017413590 ^ 1541717714;
      var16 = 2088776866 ^ var16;
      byte var4 = (byte)(80672565 ^ var16);
      int var6 = var0 << var4;
      byte var5 = (byte)(80672561 ^ var16);
      int var11 = var1 << var5;
      int var7 = var6 | var11;
      byte var13;
      if (var2 != ((80672560 ^ var16) != 0)) {
         var16 = 1743668097 ^ var16;
         var13 = (byte)(1663087792 ^ var16);

         label20:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
               case 998710:
                  var16 = 111715472 ^ var16;
                  break label20;
               case 230327815:
               default:
                  throw new RuntimeException(new IOException());
               case 1091102278:
                  break label20;
               case 1613685148:
            }
         }
      } else {
         label28:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
               case 75629427:
                  var16 ^= 384470262;
               case 201255606:
                  break label28;
               case 739548953:
                  break;
               case 1963738064:
               default:
                  throw new RuntimeException(new IOException());
            }
         }

         var13 = (byte)(304380870 ^ var16);
         var16 = 2007788519 ^ var16;
      }

      int var8 = var7 | var13;
      return (short)var8;
   }

   public static byte kind(short var0) {
      int var9 = 1584366636 ^ 441820560 ^ 1541717714;
      var9 = 967012523 ^ var9;
      byte var2 = (byte)(645787588 ^ var9);
      int var3 = var0 >> var2;
      byte var6 = (byte)(645787594 ^ var9);
      int var4 = var3 & var6;
      return (byte)var4;
   }

   public static boolean possible(short var0) {
      int var7 = 1742992744 ^ 1368264678 ^ 1541717714;
      var7 = 1065689630 ^ var7;
      byte var2 = (byte)(1376544323 ^ var7);
      int var3 = var0 & var2;
      if (var3 != (1376544322 ^ var7)) {
         var7 = 1627701847 ^ var7;
         byte var12 = (byte)(856204308 ^ var7);
         var7 = uisyiqjueqcebhnl(var7, 1792551423);
         return (var12 != 0);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var7)) {
               case 251155475:
                  var7 ^= 295894739;
               case 277263636:
                  byte var4 = (byte)(1135515793 ^ var7);
                  var7 = 444470651 ^ var7;
                  return (var4 != 0);
               case 1649421096:
               default:
                  throw new RuntimeException();
               case 1687923088:
            }
         }
      }
   }

   public int find(long var1) {
      int var10 = 1811796289 ^ 961219374 ^ 1084429792;
      var10 = 242725620 ^ var10;
      long[] var6 = this.keys;
      return Arrays.binarySearch(var6, var1);
   }

   public int writeCount(int var1) {
      int var15 = 380906105 ^ 1524922502 ^ 1084429792;
      var15 = 773679473 ^ var15;
      int[] var5 = this.first;
      byte var4 = (byte)(586034799 ^ var15);
      int var8 = var1 + var4;
      int var6 = var5[var8];
      int[] var10 = this.first;
      int var11 = var10[var1];
      return var6 - var11;
   }

   public short write(int var1, int var2) {
      int var14 = 415707079 ^ 1959247026 ^ 1084429792;
      var14 = 1007491205 ^ var14;
      short[] var6 = this.writes;
      int[] var8 = this.first;
      int var9 = var8[var1];
      int var10 = var9 + var2;
      return var6[var10];
   }

   public List<c$b> fogs() {
      int var6 = 1830970997 ^ 1276700210 ^ 1084429792;
      var6 = 1570701535 ^ var6;
      c$b[] var2 = this.fogs;
      return Arrays.asList(var2);
   }

   public int size() {
      int var6 = 714063209 ^ 925548317 ^ 1084429792;
      var6 = 1960312851 ^ var6;
      long[] var2 = this.keys;
      return var2.length;
   }

   public long key(int var1) {
      int var8 = 1899149212 ^ 505795697 ^ 1084429792;
      var8 = 1119117553 ^ var8;
      long[] var4 = this.keys;
      return var4[var1];
   }

   public c trimmed(int var1, int var2, boolean var3) {
      int var79 = 1615796628 ^ 658024306 ^ 1084429792;
      var79 = 713605138 ^ var79;
      int var64 = this.chunkX;
      int var68 = this.chunkZ;
      c$a var4 = new c$a(var64, var68);
      c$a var8 = var4;
      byte var13 = (byte)(761031444 ^ var79);
      int var9 = var13;
      var79 = 1837307927 ^ var79;

      label94:
      while (true) {
         long[] var47 = this.keys;
         int var48 = var47.length;
         if (var9 < var48) {
            byte var22;
            label69: {
               var79 = 1618686390 ^ var79;
               long[] var16 = this.keys;
               long var17 = var16[var9];
               int var19 = BlockPos.getY(var17);
               if (var19 >= var1) {
                  var79 = 1435838476 ^ var79;
                  if (var19 <= var2) {
                     var79 = 1702975729 ^ var79;
                     var22 = (byte)(279982665 ^ var79);
                     var79 = uisyiqjueqcebhnl(var79, 1745937081);
                     break label69;
                  }

                  var79 = uisyiqjueqcebhnl(var79, 943142223);
               } else {
                  var79 = 1839340867 ^ var79;
               }

               var22 = (byte)(1292263414 ^ var79);
               var79 = 900108039 ^ var79;
            }

            byte var11 = var22;
            int[] var24 = this.first;
            int var25 = var24[var9];
            int var12 = var25;
            var79 = 1274330604 ^ var79;

            while (true) {
               int[] var54 = this.first;
               byte var69 = (byte)(861170972 ^ var79);
               int var66 = var9 + var69;
               int var55 = var54[var66];
               if (var12 >= var55) {
                  var79 = uisyiqjueqcebhnl(var79, 135584055);
                  var9 += 994096171 ^ var79;
                  var79 = 2074068777 ^ var79;
                  continue label94;
               }

               label60: {
                  var79 = 1159419330 ^ var79;
                  if (var11 == (1984903391 ^ var79)) {
                     var79 = 944310426 ^ var79;
                     if (var3 != ((1309028421 ^ var79) != 0)) {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                              case 120304515:
                                 var79 ^= 1898443040;
                              case 145079744:
                                 break label60;
                              case 1520960922:
                                 break;
                              case 2004525034:
                              default:
                                 throw new IllegalStateException();
                           }
                        }
                     }

                     var79 = 1556099390 ^ var79;
                     short[] var30 = this.writes;
                     short var31 = var30[var12];
                     byte var32 = kind(var31);
                     byte var33 = (byte)((m.isBase(var32)) ? 1 : 0);
                     if (var33 != (314966395 ^ var79)) {
                        var79 = uisyiqjueqcebhnl(var79, 770162718);
                        break label60;
                     }

                     var79 = 1806107186 ^ var79;
                  } else {
                     label58:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                           case 82047570:
                           default:
                              throw new IllegalStateException();
                           case 87623807:
                              var79 ^= 254688150;
                           case 113500650:
                              break label58;
                           case 1430750856:
                        }
                     }
                  }

                  long[] var58 = this.keys;
                  long var59 = var58[var9];
                  short[] var71 = this.writes;
                  short var72 = var71[var12];
                  var8.add(var59, var72);
                  var79 = 1178649132 ^ var79;
               }

               var12 += 1059176804 ^ var79;
               var79 = 209038456 ^ var79;
            }
         }

         label91:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
               case 229682698:
                  var79 ^= 687401636;
               case 394963654:
                  break label91;
               case 1829644943:
                  break;
               case 1973012291:
               default:
                  throw new IllegalStateException();
            }
         }

         c$b[] var36 = this.fogs;
         c$b[] var73 = var36;
         int var38 = var36.length;
         int var74 = var38;
         byte var39 = (byte)(1747425703 ^ var79);
         int var75 = var39;
         var79 = 800430285 ^ var79;

         while (var75 < var74) {
            var79 = 1525316857 ^ var79;
            c$b var42 = var73[var75];
            var8.fog(var42);
            var75 += 494435730 ^ var79;
            var79 = uisyiqjueqcebhnl(var79, 1525316857);
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
               case 178955567:
                  var79 = 778167994 ^ var79;
                  return var8.build();
               case 435595619:
                  return var8.build();
               case 903119531:
                  break;
               case 1086563240:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   static {
      int var3 = new Random(441455920419349083L).nextInt();
      seiCOnaDev = 2113515469 ^ var3;
   }

   public static String gxgdcuwrkl(byte[] var0, int var1) {
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
         byte[] var28 = hwmbptlnog;
         byte[] var34 = hwmbptlnog;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] ecnerdvjqfnboxa() {
      return new byte[]{
         40,
         100,
         126,
         93,
         108,
         112,
         107,
         15,
         28,
         63,
         107,
         120,
         107,
         60,
         14,
         54,
         30,
         86,
         76,
         113,
         89,
         32,
         73,
         61,
         54,
         55,
         56,
         109,
         57,
         125,
         29,
         37,
         53,
         112,
         78,
         12,
         86,
         5,
         123,
         85,
         48,
         6,
         57,
         123,
         38,
         127,
         19,
         52,
         25,
         5,
         125,
         97,
         66,
         81,
         45,
         29,
         38,
         94,
         115,
         63,
         127,
         92,
         21,
         74,
         82,
         47,
         117,
         113,
         98,
         105,
         87
      };
   }

   private static int uisyiqjueqcebhnl(int var0, int var1) {
      return var1 ^ var0;
   }
}
