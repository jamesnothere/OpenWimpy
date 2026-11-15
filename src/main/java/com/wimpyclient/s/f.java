package com.wimpyclient.s;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry;
import it.unimi.dsi.fastutil.longs.Long2ByteMap.FastEntrySet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class f {
   public static final ThreadLocal<f$a> ANSWERS;
   private static int sDlTZvNGOT;
   private transient int s4IWJJDzJc;
   private static String bbhdxprtkb = ByteBuffer.wrap(knuorftobgdsgav()).asCharBuffer().toString();

   private f() {
super();
      int var4 = 425802481 ^ 2062094685;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 14137109:
               var4 = 5633243 ^ var4;
            case 770580085:
               var4 = 1973896850 ^ 169497081 ^ Integer.parseInt("476104732");
               this.s4IWJJDzJc = 110494793 ^ sDlTZvNGOT;
               var4 = tfunopaitoiqsqqe(var4, 1232967497);
               return;
            case 1752914747:
               break;
            case 1866080997:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   static boolean baseish(byte var0) {
      int var8 = 1573204114 ^ 124826838 ^ 146752198;
      var8 = 2002762324 ^ var8;
      byte var3 = (byte)((m.isBase(var0)) ? 1 : 0);
      if (var3 == (626359510 ^ var8)) {
         var8 = 2115629121 ^ var8;
         byte var2 = (byte)(1531743388 ^ var8);
         if (var0 != var2) {
            var8 = tfunopaitoiqsqqe(var8, 1915225432);
            byte var5 = (byte)(694454735 ^ var8);
            var8 = 1062077799 ^ var8;
            return (var5 != 0);
         }

         var8 = 1313780703 ^ var8;
      } else {
         var8 = tfunopaitoiqsqqe(var8, 811025310);
      }

      byte var15 = (byte)(352468809 ^ var8);
      var8 = tfunopaitoiqsqqe(var8, 52999136);
      return (var15 != 0);
   }

   static boolean disagreesOnBase(f$b var0, byte var1, int var2, int var3, int var4) {
      int var33 = 935595918 ^ 1156776897 ^ 146752198;
      var33 = 1544651989 ^ var33;
      byte var11 = var0.shown(var2, var3, var4);
      byte var23 = (byte)(664390227 ^ var33);
      if (var11 == var23) {
         var33 = 1368700354 ^ var33;
         return (((byte)(1980596127 ^ var33)) != 0);
      } else {
         var33 = 395635513 ^ var33;
         byte var14 = (byte)((baseish(var1)) ? 1 : 0);         byte var24 = (byte)(806166894 ^ var33);
         if (var11 != var24) {
            var33 = 1562501035 ^ var33;
            byte var28 = (byte)((m.isBase(var11)) ? 1 : 0);
            if (var14 == var28) {
               var33 = tfunopaitoiqsqqe(var33, 7455568);
               byte var46 = (byte)(1834827166 ^ var33);
               var33 = 1101405037 ^ var33;
               return (var46 != 0);
            }

            var33 = 1746758651 ^ var33;
            byte var48 = (byte)(87135540 ^ var33);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                  case 81690320:
                     var33 = 701150150 ^ var33;
                     return (var48 != 0);
                  case 889825826:
                     return (var48 != 0);
                  case 1387485561:
                     break;
                  case 1435511173:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         } else {
            label94: {
               label81:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                     case 219758782:
                        var33 ^= 1284364272;
                        break label81;
                     case 1270337291:
                        break;
                     case 1335024846:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1504092523:
                        break label81;
                  }
               }

               if (var14 != (2088826517 ^ var33)) {
                  var33 = 479418333 ^ var33;
                  byte var25 = (byte)(1611899203 ^ var33);
                  if (var1 == var25) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                           case 23783054:
                              break label94;
                           case 170289256:
                              var33 ^= 2080765625;
                              break label94;
                           case 1271517086:
                              break;
                           case 2009865572:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }

                  var33 ^= 859885752;
                  byte var19 = (byte)((var0.predictedOre(var2, var3, var4)) ? 1 : 0);
                  if (var19 != (1397977584 ^ var33)) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                           case 24248210:
                              var33 ^= 1329931777;
                              break label94;
                           case 193577214:
                           default:
                              throw new RuntimeException(new IOException());
                           case 535069132:
                              break label94;
                           case 1798053689:
                        }
                     }
                  }

                  var33 = 178015362 ^ var33;
               } else {
                  var33 = tfunopaitoiqsqqe(var33, 625986535);
               }

               byte var47 = (byte)(1506753907 ^ var33);

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                     case 136121521:
                     default:
                        throw new RuntimeException(new IOException());
                     case 235003587:
                        var33 = 1966349185 ^ var33;
                        return (var47 != 0);
                     case 1420447982:
                        return (var47 != 0);
                     case 1556683277:
                  }
               }
            }
         }

         byte var20 = (byte)(471226353 ^ var33);
         var33 = 820867330 ^ var33;
         return (var20 != 0);
      }
   }

   static boolean disagreesOnAir(f$b var0, byte var1, int var2, int var3, int var4) {
      int var26 = 1681146618 ^ 1327405173 ^ 146752198;
      var26 = 1626648812 ^ var26;
      byte var11 = var0.shown(var2, var3, var4);
      byte var18 = (byte)(1130440874 ^ var26);
      byte var13;
      if (var11 == var18) {
         var26 = 995343459 ^ var26;
         var13 = (byte)(2016580807 ^ var26);
         var26 = 335419037 ^ var26;
      } else {
         var26 = 696696526 ^ var26;
         byte var17;
         if (var1 == (1793562219 ^ var26)) {
            var26 = 1686056083 ^ var26;
            var17 = (byte)(244890361 ^ var26);
            var26 = tfunopaitoiqsqqe(var26, 1517342537);
         } else {
            label55:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
                  case 253811080:
                     var26 ^= 1930300016;
                  case 1327278950:
                     break label55;
                  case 1862117072:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1979992220:
               }
            }

            var17 = (byte)(434740251 ^ var26);
            var26 = 1291970986 ^ var26;
         }

         byte var21;
         if (var11 == (1424520625 ^ var26)) {
            var26 = 744835927 ^ var26;
            var21 = (byte)(2022522599 ^ var26);

            label46:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
                  case 160551248:
                     var26 ^= 408324464;
                  case 212333822:
                     break label46;
                  case 784163359:
                     break;
                  case 1454991313:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         } else {
            var26 = tfunopaitoiqsqqe(var26, 1907071246);
            var21 = (byte)(625208511 ^ var26);
            var26 = 1167612713 ^ var26;
         }

         if (var17 == var21) {
            var26 = 429637740 ^ var26;
            byte var16 = (byte)((disagreesOnBase(var0, var1, var2, var3, var4)) ? 1 : 0);
            if (var16 == (2034268154 ^ var26)) {
               var26 = tfunopaitoiqsqqe(var26, 1179049120);
               var13 = (byte)(1057401690 ^ var26);
               var26 = 1422534913 ^ var26;
               return (var13 != 0);
            }

            var26 = 162941865 ^ var26;
         } else {
            label39:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
                  case 195679081:
                     var26 ^= 271420357;
                     break label39;
                  case 465047029:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1159949470:
                     break label39;
                  case 1621639010:
               }
            }
         }

         var13 = (byte)(1895185490 ^ var26);
         var26 = 456834568 ^ var26;
      }

      return (var13 != 0);
   }

   public static c predict(j var0, int var1, int var2, f$b var3) {
      int var88 = 559944162 ^ 1901473437 ^ 146752198;
      var88 = 1096102455 ^ var88;
      f$c var4 = new f$c(var0, var1, var2, var3);
      f$c var15 = var4;
      List var22 = var0.specs();
      Iterator var23 = var22.iterator();
      Iterator var16 = var23;
      var88 = 1745820887 ^ var88;

      while (true) {
         byte var25 = (byte)((var16.hasNext()) ? 1 : 0);
         if (var25 == (1909674841 ^ var88)) {
            var88 = 2121415411 ^ var88;
            c$a var27 = var15.builder;
            return var27.build();
         }

         var88 = 248448832 ^ var88;
         Object var30 = var16.next();
         h var31 = (h)var30;
         h var17 = var31;
         var15.spec = var31;
         g$a var34 = g.run(var31, var1, var2, var15);
         Long2ByteOpenHashMap var36 = var34.writes;
         FastEntrySet var37 = var36.long2ByteEntrySet();
         ObjectIterator var38 = var37.fastIterator();
         ObjectIterator var19 = var38;
         var88 = 1261733953 ^ var88;

         label54:
         while (true) {
            byte var40 = (byte)((var19.hasNext()) ? 1 : 0);
            if (var40 == (875093080 ^ var88)) {
               var88 = tfunopaitoiqsqqe(var88, 1890026412);
               byte var47 = (byte)((var34.fogged()) ? 1 : 0);
               if (var47 != (1150246900 ^ var88)) {
                  var88 = 43119428 ^ var88;
                  int[] var49 = var34.fogBox();
                  c$a var51 = var15.builder;
                  int var64 = var17.order();
                  byte var68 = var17.kind();
                  byte var74 = (byte)(1176415408 ^ var88);
                  int var72 = var49[var74];
                  byte var10 = (byte)(1176415409 ^ var88);
                  int var76 = var49[var10];
                  byte var11 = (byte)(1176415410 ^ var88);
                  int var78 = var49[var11];
                  byte var12 = (byte)(1176415411 ^ var88);
                  int var80 = var49[var12];
                  byte var13 = (byte)(1176415412 ^ var88);
                  int var82 = var49[var13];
                  byte var14 = (byte)(1176415413 ^ var88);
                  int var84 = var49[var14];
                  c$b var57 = new c$b(var64, var68, var72, var76, var78, var80, var82, var84);
                  var51.fog(var57);
                  var88 = 959058371 ^ var88;
               } else {
                  var88 = 1002168967 ^ var88;
               }

               var88 = 250080810 ^ var88;
               break;
            }

            var88 = 1578563023 ^ var88;
            Object var42 = var19.next();
            Entry var43 = (Entry)var42;
            c$a var45 = var15.builder;
            long var55 = var43.getLongKey();
            int var61 = var17.order();
            byte var66 = var17.kind();
            byte var70 = var43.getByteValue();
            byte var9 = (byte)(1782458773 ^ var88);
            byte var73;
            if (var70 != var9) {
               var88 = 385764478 ^ var88;
               var73 = (byte)(2092983785 ^ var88);
               var88 = 803508654 ^ var88;
            } else {
               var88 = 535701001 ^ var88;
               var73 = (byte)(1976569759 ^ var88);

               label39:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var88)) {
                     case 71527314:
                        var88 ^= 653589465;
                        break label39;
                     case 102756624:
                     default:
                        throw new RuntimeException(new IOException());
                     case 177884262:
                        break label39;
                     case 302952981:
                  }
               }
            }

            short var62 = c.pack(var61, var66, (var73 != 0));
            var45.add(var55, var62);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var88)) {
                  case 18336365:
                     var88 ^= 1728849951;
                     continue label54;
                  case 491925714:
                     break;
                  case 927053461:
                     continue label54;
                  case 1519516160:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      }
   }

   static {
      int var7 = 1905818366 ^ 472889275 ^ Integer.parseInt("476104732");
      int var4 = new Random(2078976693528103001L).nextInt();
      sDlTZvNGOT = 1588368953 ^ var4;
      var7 = 1036286442 ^ var7;
      Supplier var0 = f$a::new;
      ThreadLocal var1 = ThreadLocal.withInitial(var0);
      ANSWERS = var1;
   }

   public static String pgszcxadcx(byte[] var0, int var1) {
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
      String var29 = bbhdxprtkb;
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

   private static byte[] knuorftobgdsgav() {
      return new byte[0];
   }

   private static int tfunopaitoiqsqqe(int var0, int var1) {
      return var1 ^ var0;
   }
}
