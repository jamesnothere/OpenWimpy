package com.wimpyclient.p;

import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongIntBiConsumer;
import it.unimi.dsi.fastutil.longs.LongLongBiConsumer;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongObjectBiConsumer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Random;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class i {
   private static int f60aQYrEzWq;
   private transient int RaDBHj0GfQ;
   private static String gyukbwhhgh = ByteBuffer.wrap(jfllmmvvomutgwx()).asCharBuffer().toString();

   private i() {
super();
      int var4 = 1469869385 ^ 1976290583;
      
      var4 = 1161718841 ^ var4;
      var4 = 1897092482 ^ 1675513464 ^ Integer.parseInt("1973737373");
      this.RaDBHj0GfQ = 490901655 ^ f60aQYrEzWq;
      var4 = 1702991644 ^ var4;
   }

   public static boolean removeKeysIf(Long2ObjectMap<?> var0, LongPredicate var1) {
      int var27 = 182826068 ^ 343804331 ^ 1893360954;
      var27 = 1146612240 ^ var27;
      if (var0 != null) {
         var27 = 616031227 ^ var27;
         byte var9 = (byte)((var0.isEmpty()) ? 1 : 0);
         if (var9 == (245485870 ^ var27)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var27)) {
                  case 114626007:
                  default:
                     throw new RuntimeException();
                  case 207195112:
                     var27 ^= 1605980019;
                  case 1684458448:
                     LongArrayList var11 = matchingKeys(var0, var1);
                     LongArrayList var5 = var11;
                     byte var12 = (byte)(1360567901 ^ var27);
                     int var6 = var12;
                     int var14 = var11.size();
                     int var7 = var14;
                     var27 = 1172049481 ^ var27;

                     while (var6 < var7) {
                        var27 = 599991078 ^ var27;
                        long var24 = var5.getLong(var6);
                        Object var20 = var0.remove(var24);
                        var6 += 923251507 ^ var27;
                        var27 = otwgeuahoqtbyykc(var27, 599991078);
                     }

                     var27 = otwgeuahoqtbyykc(var27, 304754888);
                     byte var17 = (byte)((var5.isEmpty()) ? 1 : 0);                     byte var18;
                     if (var17 == (116302044 ^ var27)) {
                        var27 = 2027724103 ^ var27;
                        var18 = (byte)(2117221786 ^ var27);
                        var27 = otwgeuahoqtbyykc(var27, 1416629741);
                     } else {
                        label31:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var27)) {
                              case 78390990:
                                 break label31;
                              case 109031456:
                                 var27 ^= 1214144231;
                                 break label31;
                              case 704679969:
                                 break;
                              case 1994091779:
                              default:
                                 throw new RuntimeException();
                           }
                        }

                        var18 = (byte)(1320222267 ^ var27);
                        var27 = 1693634125 ^ var27;
                     }

                     return (var18 != 0);
                  case 566413798:
               }
            }
         }

         var27 = 916141830 ^ var27;
      } else {
         var27 = otwgeuahoqtbyykc(var27, 304927997);
      }

      return (((byte)(943384104 ^ var27)) != 0);
   }

   public static boolean removeKeysIf(Long2IntMap var0, LongPredicate var1) {
      int var27 = 154250149 ^ 993628024 ^ 1893360954;
      var27 = 1785216383 ^ var27;
      if (var0 != null) {
         var27 = 1291494982 ^ var27;
         byte var9 = (byte)((var0.isEmpty()) ? 1 : 0);
         if (var9 == (1681971934 ^ var27)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var27)) {
                  case 37604430:
                     var27 ^= 1159861463;
                  case 1641943268:
                     LongArrayList var12 = matchingKeys(var0, var1);
                     LongArrayList var5 = var12;
                     byte var13 = (byte)(560123401 ^ var27);
                     int var6 = var13;
                     int var15 = var12.size();
                     int var7 = var15;
                     var27 = 1659622511 ^ var27;

                     while (var6 < var7) {
                        var27 = 1985768510 ^ var27;
                        long var24 = var5.getLong(var6);
                        int var21 = var0.remove(var24);
                        var6 += 903181913 ^ var27;
                        var27 = 1985768510 ^ var27;
                     }

                     var27 = 636366107 ^ var27;
                     byte var18 = (byte)((var5.isEmpty()) ? 1 : 0);
                     if (var18 == (1718040445 ^ var27)) {
                        var27 = 463009801 ^ var27;
                        byte var37 = (byte)(2113916789 ^ var27);
                        var27 = otwgeuahoqtbyykc(var27, 110182414);
                        return (var37 != 0);
                     }

                     label34:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var27)) {
                           case 107453925:
                              var27 ^= 1052935201;
                           case 429325538:
                              break label34;
                           case 640144890:
                           default:
                              throw new RuntimeException();
                           case 1789627709:
                        }
                     }

                     byte var19 = (byte)(1487254364 ^ var27);
                     var27 = 600521766 ^ var27;
                     return (var19 != 0);
                  case 654219300:
                  default:
                     throw new RuntimeException();
                  case 1675726951:
               }
            }
         }

         var27 = 1664611093 ^ var27;
      } else {
         var27 = otwgeuahoqtbyykc(var27, 801985875);
      }

      return (((byte)(125249995 ^ var27)) != 0);
   }

   public static boolean removeKeysIf(Long2LongMap var0, LongPredicate var1) {
      int var28 = 2000692600 ^ 338086803 ^ 1893360954;
      var28 = 651544319 ^ var28;
      if (var0 != null) {
         var28 = 1331898529 ^ var28;
         byte var9 = (byte)((var0.isEmpty()) ? 1 : 0);
         if (var9 != (2047501711 ^ var28)) {
            var28 = 1219565345 ^ var28;
            return (((byte)(851145390 ^ var28)) != 0);
         } else {
            var28 = 1036726310 ^ var28;
            LongArrayList var11 = matchingKeys(var0, var1);
            LongArrayList var5 = var11;
            byte var12 = (byte)(1203852713 ^ var28);
            int var6 = var12;
            int var14 = var11.size();
            int var7 = var14;
            var28 = 1159011769 ^ var28;

            label58:
            while (var6 < var7) {
               var28 ^= 1550108654;
               long var25 = var5.getLong(var6);
               long var17 = var0.remove(var25);
               var6 += 1588629503 ^ var28;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                     case 125192268:
                        var28 ^= 1550108654;
                        continue label58;
                     case 370482051:
                        break;
                     case 398308564:
                        continue label58;
                     case 2072683275:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            label43:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                  case 44499291:
                     var28 ^= 204509359;
                  case 518110545:
                     break label43;
                  case 783474220:
                  default:
                     throw new RuntimeException();
                  case 1254665466:
               }
            }

            byte var20 = (byte)((var5.isEmpty()) ? 1 : 0);
            if (var20 != (249878719 ^ var28)) {
               var28 = otwgeuahoqtbyykc(var28, 1191495146);
               byte var37 = (byte)(1239424341 ^ var28);
               var28 = 1461730198 ^ var28;
               return (var37 != 0);
            } else {
               var28 = 1026865767 ^ var28;
               byte var22 = (byte)(869294809 ^ var28);

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                     case 73632850:
                        var28 = 756040731 ^ var28;
                        return (var22 != 0);
                     case 276153582:
                     default:
                        throw new RuntimeException();
                     case 762359081:
                        break;
                     case 2007307478:
                        return (var22 != 0);
                  }
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
               case 125579488:
                  var28 ^= 131219328;
                  return (((byte)(851145390 ^ var28)) != 0);
               case 356446749:
               default:
                  throw new RuntimeException();
               case 740915236:
                  break;
               case 1857682138:
                  return (((byte)(851145390 ^ var28)) != 0);
            }
         }
      }
   }

   public static LongArrayList snapshotKeys(Long2ObjectMap<?> var0) {
      int var19 = 2084116489 ^ 323126138 ^ 1893360954;
      var19 = 1947692364 ^ var19;
      int var13;
      if (var0 != null) {
         var19 = otwgeuahoqtbyykc(var19, 1299464247);
         byte var15 = (byte)(650302258 ^ var19);
         int var16 = var0.size();
         var13 = Math.max(var15, var16);
         var19 = 95301919 ^ var19;
      } else {
         var19 = 1526656619 ^ var19;
         var13 = (byte)(826834286 ^ var19);

         label29:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
               case 8692421:
                  break label29;
               case 259801677:
                  var19 ^= 304389955;
                  break label29;
               case 999036232:
                  break;
               case 1345217537:
               default:
                  throw new IllegalStateException();
            }
         }
      }

      LongArrayList var1 = new LongArrayList(var13);
      if (var0 != null) {
         var19 = 621478777 ^ var19;
         byte var7 = (byte)((var0.isEmpty()) ? 1 : 0);
         if (var7 == (107471188 ^ var19)) {
            var19 = otwgeuahoqtbyykc(var19, 1664443145);
            Object var14 = Objects.requireNonNull(var1);
            LongConsumer var12 = var1::add;
            forEachKey(var0, var12);
            return var1;
         }

         var19 = 2125397459 ^ var19;
      } else {
         var19 = otwgeuahoqtbyykc(var19, 1537605290);
      }

      return var1;
   }

   private static void forEachKey(Long2ObjectMap<?> var0, LongConsumer var1) {
      int var9 = 1542747918 ^ 2112436922 ^ 1893360954;
      var9 = 878143144 ^ var9;

      try {
         for (LongIterator var6 = var0.keySet().iterator(); var6.hasNext(); ) {
            var1.accept(var6.nextLong());
         }
         var9 ^= 117439235;
      } catch (RuntimeException var10) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var9)) {
            case 344092979:
               var9 = 406741428 ^ var9;
               var9 = 397459989 ^ var9;
               return;
            default:
               throw new RuntimeException("Error in hash");
         }
      }

      var9 = otwgeuahoqtbyykc(var9, 158423202);
   }

   private static LongArrayList matchingKeys(Long2ObjectMap<?> var0, LongPredicate var1) {
      int var11 = 1066889505 ^ 1007930289 ^ 1893360954;
      var11 = 297055237 ^ var11;
      LongArrayList var2 = new LongArrayList();
      LongConsumer var8 = var2x -> {
         int var13 = 1180849627 ^ 443218573 ^ 1893360954;
         var13 = 1691864367 ^ var13;
         byte var7 = (byte)((var1.test(var2x)) ? 1 : 0);
         if (var7 != (1208289091 ^ var13)) {
            var13 = 311530489 ^ var13;
            boolean var9 = var2.add(var2x);
            var13 = 2009958390 ^ var13;
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
                  case 193590804:
                     var13 = 1700533263 ^ var13;
                     return;
                  case 415596844:
                     return;
                  case 1408808577:
                     break;
                  case 2048390603:
                  default:
                     throw new RuntimeException();
               }
            }
         }
      };
      forEachKey(var0, var8);
      return var2;
   }

   private static LongArrayList matchingKeys(Long2IntMap var0, LongPredicate var1) {
      int var13 = 1252470714 ^ 117325009 ^ 1893360954;
      var13 = 2118465759 ^ var13;
      LongArrayList var2 = new LongArrayList();
      LongArrayList var4 = var2;
      var13 = 442924891 ^ var13;

      try {
         LongIntBiConsumer var10 = (var2x, var4x) -> {
            int var14x = 364149581 ^ 835040299 ^ 1893360954;
            var14x = 569061501 ^ var14x;
            byte var8 = (byte)((var1.test(var2x)) ? 1 : 0);
            if (var8 != (1967168033 ^ var14x)) {
               var14x = 692995284 ^ var14x;
               boolean var10x = var4.add(var2x);
               var14x = 280586641 ^ var14x;
            } else {
               var14x = otwgeuahoqtbyykc(var14x, 972500293);
            }
         };
         var0.forEach(var10);
         var13 ^= 514637515;
      } catch (RuntimeException var14) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var13)) {
            case -989753686:
               var13 = otwgeuahoqtbyykc(var13, 560610492);
               var13 = 1785670107 ^ var13;
               return var2;
            default:
               throw new RuntimeException(new IOException("Error in hash"));
         }
      }

      var13 = otwgeuahoqtbyykc(var13, 1437182892);
      return var2;
   }

   private static LongArrayList matchingKeys(Long2LongMap var0, LongPredicate var1) {
      int var13 = 1419564010 ^ 1676203738 ^ 1893360954;
      var13 = 1331335176 ^ var13;
      LongArrayList var2 = new LongArrayList();
      LongArrayList var4 = var2;
      var13 = 443219705 ^ var13;

      try {
         LongLongBiConsumer var10 = (var2x, var4x) -> {
            int var15x = 1988545044 ^ 892899765 ^ 1893360954;
            var15x = 398796038 ^ var15x;
            byte var9 = (byte)((var1.test(var2x)) ? 1 : 0);
            if (var9 != (614538141 ^ var15x)) {
               var15x = 271717130 ^ var15x;
               boolean var11 = var4.add(var2x);
               var15x = 1723481344 ^ var15x;
            } else {
               var15x = 1988636170 ^ var15x;
            }
         };
         var0.forEach(var10);
         var13 ^= 204603984;
      } catch (RuntimeException var14) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var13)) {
            case -1796180008:
               var13 = 806535705 ^ var13;
               var13 = 1840644722 ^ var13;
               return var2;
            default:
               throw new RuntimeException("Error in hash");
         }
      }

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
            case 191710759:
               var13 = 1368834619 ^ var13;
               return var2;
            case 1233815212:
               return var2;
            case 1638449812:
            default:
               throw new RuntimeException(new IOException());
            case 1974297280:
         }
      }
   }

   static {
      int var3 = new Random(4173165589730799493L).nextInt();
      f60aQYrEzWq = -1628651236 ^ var3;
   }

   public static String jwjtcrvrbp(byte[] var0, int var1) {
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
      String var29 = gyukbwhhgh;
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

   private static byte[] jfllmmvvomutgwx() {
      return new byte[0];
   }

   private static int otwgeuahoqtbyykc(int var0, int var1) {
      return var0 ^ var1;
   }
}
