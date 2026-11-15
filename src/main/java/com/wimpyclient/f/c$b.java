package com.wimpyclient.f;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class c$b {
   private static int tjUgx4Y98Z;
   private transient int QU00kvsx9d;
   private static String ooqlotiusc = ByteBuffer.wrap(tmhrvajegbqsuqf()).asCharBuffer().toString();

   private c$b() {
super();
      int var4 = 1807557977 ^ 2001549341;
      
      var4 = 930572946 ^ var4;
      var4 = 1040051763 ^ 1957561033 ^ Integer.parseInt("1658100524");
      this.QU00kvsx9d = 148841056 ^ tjUgx4Y98Z;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 72766377:
               var4 = 502970880 ^ var4;
            case 1414035384:
               return;
            case 288369399:
            default:
               throw new RuntimeException(new IOException());
            case 868103313:
         }
      }
   }

   static void apply(ClientboundLightUpdatePacketData var0, c$a var1) {
      int var20 = 148947341 ^ 1382056876 ^ 507848059;
      var20 = 2077645844 ^ var20;
      BitSet var6 = var0.getBlockYMask();
      BitSet var9 = var0.getEmptyBlockYMask();
      List var12 = var0.getBlockUpdates();
      c$d[] var15 = var1.block;
      applyTrack(var6, var9, var12, var15);
      BitSet var8 = var0.getSkyYMask();
      BitSet var11 = var0.getEmptySkyYMask();
      List var14 = var0.getSkyUpdates();
      c$d[] var17 = var1.sky;
      applyTrack(var8, var11, var14, var17);
   }

   private static void applyTrack(BitSet var0, BitSet var1, List<byte[]> var2, c$d[] var3) {
      int var34 = 1137302431 ^ 2042272613 ^ 507848059;
      var34 = 1899689871 ^ var34;
      byte var4 = (byte)(1426887182 ^ var34);
      int var7 = var4;
      byte var10 = (byte)(1426887182 ^ var34);
      int var8 = var10;
      var34 = 2092287866 ^ var34;

      while (true) {
         int var22 = var3.length;
         if (var8 >= var22) {
            var34 = 390925593 ^ var34;
            return;
         }

         var34 = 1705991303 ^ var34;
         byte var13 = (byte)((var0.get(var8)) ? 1 : 0);
         if (var13 != (1276512755 ^ var34)) {
            var34 = 1632206835 ^ var34;
            int var27 = var2.size();
            byte[] var18;
            if (var7 < var27) {
               var34 = 674056540 ^ var34;
               Object var21 = var2.get(var7);
               var18 = (byte[])var21;
               var34 = 442100995 ^ var34;
            } else {
               label36:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
                     case 132700671:
                        var34 ^= 665188216;
                        break label36;
                     case 733771850:
                        break;
                     case 1025391563:
                        break label36;
                     case 2023475713:
                     default:
                        throw new RuntimeException();
                  }
               }

               var18 = null;
               var34 = 366039847 ^ var34;
            }

            var7 += 522965598 ^ var34;
            c$d var31 = classifyPayload(var18);
            var3[var8] = var31;
            var34 = 1796232642 ^ var34;
         } else {
            var34 = tvlzrwgzzpfuribw(var34, 198124935);
            byte var15 = (byte)((var1.get(var8)) ? 1 : 0);
            if (var15 != (1205415028 ^ var34)) {
               var34 = 124727579 ^ var34;
               c$d var6 = c$d.EMPTY_MASK;
               var3[var8] = var6;
               var34 = 881695474 ^ var34;
            } else {
               label27:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
                     case 113832828:
                     default:
                        throw new RuntimeException();
                     case 187990521:
                        var34 ^= 870493161;
                        break label27;
                     case 278348973:
                        break;
                     case 1897330837:
                        break label27;
                  }
               }
            }
         }

         var8 += 1950058396 ^ var34;
         var34 = tvlzrwgzzpfuribw(var34, 1568854761);
      }
   }

   static c$d classifyPayload(byte[] var0) {
      int var37 = 558994775 ^ 769754935 ^ 507848059;
      var37 = 1614795777 ^ var37;
      if (var0 != null) {
         var37 = 522763100 ^ var37;
         int var10 = var0.length;
         short var2 = (short)(1843548230 ^ var37);
         if (var10 != var2) {
            var37 = 805918343 ^ var37;
            return c$d.UNKNOWN;
         } else {
            label112:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                  case 82241253:
                     var37 ^= 1944613093;
                     break label112;
                  case 470677048:
                     break;
                  case 1113706743:
                  default:
                     throw new IllegalStateException();
                  case 1445823843:
                     break label112;
               }
            }

            byte var12 = (byte)(503982242 ^ var37);
            byte var3 = var12;
            byte var13 = (byte)(503982242 ^ var37);
            byte var4 = var13;
            byte[] var5 = var0;
            int var16 = var0.length;
            int var6 = var16;
            byte var17 = (byte)(503982243 ^ var37);
            int var7 = var17;
            var37 = 2005059468 ^ var37;

            label105:
            while (var7 < var6) {
               var37 = 523493019 ^ var37;
               byte var24 = var5[var7];
               if (var24 != (1991979444 ^ var37)) {
                  var37 = 1087219639 ^ var37;
                  byte var26 = (byte)(913741315 ^ var37);
                  var3 = var26;
                  var37 = 1350961374 ^ var37;
               } else {
                  label76:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                        case 62634370:
                        default:
                           throw new IllegalStateException();
                        case 101369591:
                           var37 ^= 273395561;
                        case 934936827:
                           break label76;
                        case 1591548387:
                     }
                  }
               }

               byte var34 = (byte)(-1727045342 ^ var37);
               if (var24 != var34) {
                  var37 = 1858409739 ^ var37;
                  byte var28 = (byte)(137726934 ^ var37);
                  var4 = var28;
                  var37 = 929782306 ^ var37;
               } else {
                  var37 = tvlzrwgzzpfuribw(var37, 1504595753);
               }

               if (var3 != (1063178740 ^ var37)) {
                  var37 = tvlzrwgzzpfuribw(var37, 1680520246);
               } else {
                  var37 = 1158304113 ^ var37;
                  if (var4 == (2052358277 ^ var37)) {
                     var37 = 163648154 ^ var37;
                     return c$d.NORMAL;
                  }

                  label90:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                        case 103366464:
                           break label90;
                        case 218350421:
                           var37 ^= 555803975;
                           break label90;
                        case 518119823:
                           break;
                        case 753161338:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               }

               var7 += 1534354883 ^ var37;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                     case 20045395:
                        var37 ^= 855411437;
                        continue label105;
                     case 117429179:
                     default:
                        throw new IllegalStateException();
                     case 1073671336:
                        continue label105;
                     case 1997335782:
                  }
               }
            }

            label64:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                  case 10516118:
                     break label64;
                  case 209266403:
                     var37 ^= 1169832298;
                     break label64;
                  case 311774304:
                     break;
                  case 1209552281:
                  default:
                     throw new IllegalStateException();
               }
            }

            if (var3 != (741529157 ^ var37)) {
               var37 = 1179943728 ^ var37;
               return c$d.ZEROED_PRESENT;
            } else {
               var37 = tvlzrwgzzpfuribw(var37, 394547087);
               if (var4 != (1001822666 ^ var37)) {
                  var37 = 216110100 ^ var37;
                  c$d var53 = c$d.UNIFORM_MAX;
                  var37 = tvlzrwgzzpfuribw(var37, 1015448249);
                  return var53;
               } else {
                  label56:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                        case 61993537:
                           var37 ^= 1474821918;
                        case 136764947:
                           break label56;
                        case 570653014:
                           break;
                        case 2106029415:
                        default:
                           throw new IllegalStateException();
                     }
                  }

                  c$d var22 = c$d.NORMAL;
                  var37 = 1736501683 ^ var37;
                  return var22;
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
               case 241789640:
                  var37 = 790752731 ^ var37;
                  return c$d.UNKNOWN;
               case 270674579:
               default:
                  throw new IllegalStateException();
               case 525574293:
                  break;
               case 1794202014:
                  return c$d.UNKNOWN;
            }
         }
      }
   }

   static {
      int var3 = new Random(2483797121068251810L).nextInt();
      tjUgx4Y98Z = 615741007 ^ var3;
   }

   public static String jacfhrvdbi(byte[] var0, int var1) {
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
      String var29 = ooqlotiusc;
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

   private static byte[] tmhrvajegbqsuqf() {
      return new byte[0];
   }

   private static int tvlzrwgzzpfuribw(int var0, int var1) {
      return var1 ^ var0;
   }
}
