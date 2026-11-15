package com.wimpyclient.n;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a {
   public static final List<String> ALL;
   public static final Set<String> ALL_LOWER;
   private static int MTokRtBGnI;
   private transient int JUrmIxFFfU;

   private a() {
super();
      int var4 = 1523692797 ^ 479124183;
      
      var4 = 1970650631 ^ var4;
      var4 = 626018760 ^ 1796336746 ^ Integer.parseInt("2104194447");
      this.JUrmIxFFfU = 268166027 ^ MTokRtBGnI;
      var4 = 2078957653 ^ var4;
   }

   public static boolean contains(String var0) {
      int var10 = 75719612 ^ 1035267089 ^ 1971167965;
      var10 = 1390126261 ^ var10;
      if (var0 != null) {
         var10 ^= 769322997;
         Set var4 = ALL_LOWER;
         Locale var3 = Locale.ROOT;
         String var7 = var0.toLowerCase(var3);
         byte var5 = (byte)((var4.contains(var7)) ? 1 : 0);
         if (var5 != (860579376 ^ var10)) {
            var10 = 660263599 ^ var10;
            byte var6 = (byte)(336704670 ^ var10);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
                  case 115497445:
                     var10 = 1037115385 ^ var10;
                     return (var6 != 0);
                  case 512321993:
                     return (var6 != 0);
                  case 1167630184:
                  default:
                     throw new RuntimeException();
                  case 1376631517:
               }
            }
         }

         label31:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
               case 56764086:
                  var10 ^= 77313606;
                  break label31;
               case 108799390:
               default:
                  throw new RuntimeException();
               case 858620155:
                  break;
               case 1049249032:
                  break label31;
            }
         }
      } else {
         label38:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
               case 133813620:
               default:
                  throw new RuntimeException();
               case 188343420:
                  var10 ^= 692148659;
                  break label38;
               case 756699466:
                  break;
               case 867471864:
                  break label38;
            }
         }
      }

      byte var15 = (byte)(936431734 ^ var10);
      var10 = 504396560 ^ var10;
      return (var15 != 0);
   }

   static {
      int var57 = 1457216705 ^ 147524439 ^ Integer.parseInt("2104194447");
      int var54 = new Random(3955180173431924938L).nextInt();
      MTokRtBGnI = 1538552682 ^ var54;
      var57 = 1547931447 ^ var57;
      byte var0 = (byte)(2134420795 ^ var57);
      String[] var3 = new String[var0];
      byte var1 = (byte)(2134420782 ^ var57);
      String var2 = qqkdcnosji(auaiwfszrzwmuet(), xjpsddsemtmsawk(), var57);
      var3[var1] = var2;
      byte var12 = (byte)(2134420783 ^ var57);
      String var32 = qqkdcnosji(bllmdqflshaanwj(), xjpsddsemtmsawk(), var57);
      var3[var12] = var32;
      byte var13 = (byte)(2134420780 ^ var57);
      String var33 = qqkdcnosji(diranhnahsqsgem(), xjpsddsemtmsawk(), var57);
      var3[var13] = var33;
      byte var14 = (byte)(2134420781 ^ var57);
      String var34 = qqkdcnosji(ogbxpcqsrdyzfta(), xjpsddsemtmsawk(), var57);
      var3[var14] = var34;
      byte var15 = (byte)(2134420778 ^ var57);
      String var35 = qqkdcnosji(dwiwjwanuhzwcrd(), xjpsddsemtmsawk(), var57);
      var3[var15] = var35;
      byte var16 = (byte)(2134420779 ^ var57);
      String var36 = qqkdcnosji(bgeglhieitabcjk(), xjpsddsemtmsawk(), var57);
      var3[var16] = var36;
      byte var17 = (byte)(2134420776 ^ var57);
      String var37 = qqkdcnosji(nhawpbqwpjspnut(), xjpsddsemtmsawk(), var57);
      var3[var17] = var37;
      byte var18 = (byte)(2134420777 ^ var57);
      String var38 = qqkdcnosji(emthnfclrfcgjap(), xjpsddsemtmsawk(), var57);
      var3[var18] = var38;
      byte var19 = (byte)(2134420774 ^ var57);
      String var39 = qqkdcnosji(nmlgbbdlenmbksc(), xjpsddsemtmsawk(), var57);
      var3[var19] = var39;
      byte var20 = (byte)(2134420775 ^ var57);
      String var40 = qqkdcnosji(xttwwjsrbjsoqax(), xjpsddsemtmsawk(), var57);
      var3[var20] = var40;
      byte var21 = (byte)(2134420772 ^ var57);
      String var41 = qqkdcnosji(uhghftqezfhfqiv(), xjpsddsemtmsawk(), var57);
      var3[var21] = var41;
      byte var22 = (byte)(2134420773 ^ var57);
      String var42 = qqkdcnosji(yvygpkqnhgdgmrf(), xjpsddsemtmsawk(), var57);
      var3[var22] = var42;
      byte var23 = (byte)(2134420770 ^ var57);
      String var43 = qqkdcnosji(mmafvpfuirjnasr(), xjpsddsemtmsawk(), var57);
      var3[var23] = var43;
      byte var24 = (byte)(2134420771 ^ var57);
      String var44 = qqkdcnosji(jjvzqwbizigswix(), xjpsddsemtmsawk(), var57);
      var3[var24] = var44;
      byte var25 = (byte)(2134420768 ^ var57);
      String var45 = qqkdcnosji(guhgvjggbzdtsoz(), xjpsddsemtmsawk(), var57);
      var3[var25] = var45;
      byte var26 = (byte)(2134420769 ^ var57);
      String var46 = qqkdcnosji(gfmztmffhkbcjfy(), xjpsddsemtmsawk(), var57);
      var3[var26] = var46;
      byte var27 = (byte)(2134420798 ^ var57);
      String var47 = qqkdcnosji(ezdvwibegpvbqtx(), xjpsddsemtmsawk(), var57);
      var3[var27] = var47;
      byte var28 = (byte)(2134420799 ^ var57);
      String var48 = qqkdcnosji(uevzacuujcftiuu(), xjpsddsemtmsawk(), var57);
      var3[var28] = var48;
      byte var29 = (byte)(2134420796 ^ var57);
      String var49 = qqkdcnosji(lkdhxhpnpvupcok(), xjpsddsemtmsawk(), var57);
      var3[var29] = var49;
      byte var30 = (byte)(2134420797 ^ var57);
      String var50 = qqkdcnosji(noirzrtovgfxytx(), xjpsddsemtmsawk(), var57);
      var3[var30] = var50;
      byte var31 = (byte)(2134420794 ^ var57);
      String var51 = qqkdcnosji(pngcgxywvewnmwx(), xjpsddsemtmsawk(), var57);
      var3[var31] = var51;
      List var4 = List.of(var3);
      ALL = var4;
      List var5 = ALL;
      Stream var6 = var5.stream();
      Function<String, String> var10 = var0x -> {
         int var6x = 221031789 ^ 1377692298 ^ 1971167965;
         var6x = 72923976 ^ var6x;
         Locale var2x = Locale.ROOT;
         return var0x.toLowerCase(var2x);
      };
      Stream var7 = var6.map(var10);
      Collector var11 = Collectors.toUnmodifiableSet();
      Object var8 = var7.collect(var11);
      Set var9 = (Set)var8;
      ALL_LOWER = var9;
   }

   public static String qqkdcnosji(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] xjpsddsemtmsawk() {
      return new byte[]{
         57,
         90,
         21,
         105,
         94,
         35,
         126,
         123,
         38,
         92,
         72,
         22,
         21,
         94,
         78,
         62,
         15,
         114,
         89,
         86,
         55,
         16,
         31,
         76,
         79,
         115,
         12,
         38,
         51,
         63,
         101,
         39,
         86,
         110,
         69,
         90,
         34,
         82,
         80,
         102,
         89,
         64,
         58,
         86,
         87,
         26,
         42,
         116,
         50,
         82,
         33,
         94,
         80,
         33,
         29,
         19,
         104,
         111,
         110,
         24,
         17,
         118,
         6,
         63,
         65,
         19,
         124,
         25
      };
   }

   private static byte[] auaiwfszrzwmuet() {
      return new byte[]{-11, -108, 38, 27, 106, 125, 78, 57, 30, 8, 122, 65, 38, 19, 122, 65, 63, 36, 97, 23, 5, 85, 44, 29, 123, 51, 60, 33, 11, 58};
   }

   private static byte[] bllmdqflshaanwj() {
      return new byte[]{-11, -108, 38, 60, 106, 99, 78, 47, 30, 6, 122, 78, 38, 28, 122, 105, 63, 21, 97, 1, 5, 69, 44, 10, 123, 46};
   }

   private static byte[] diranhnahsqsgem() {
      return new byte[]{-11, -108, 38, 16, 106, 100, 78, 34, 30, 5, 122, 66, 38, 24, 122, 96, 63, 44, 97, 7, 5, 73};
   }

   private static byte[] ogbxpcqsrdyzfta() {
      return new byte[]{-11, -108, 38, 27, 106, 99, 78, 41, 30, 0, 122, 76, 38, 53, 122, 78, 63, 49, 97, 19};
   }

   private static byte[] dwiwjwanuhzwcrd() {
      return new byte[]{-11, -108, 38, 19, 106, 112, 78, 60, 30, 1, 122, 72, 38, 5, 122, 83};
   }

   private static byte[] bgeglhieitabcjk() {
      return new byte[]{-11, -108, 38, 60, 106, 100, 78, 54, 30, 20, 122, 78, 38, 30, 122, 105, 63, 38, 97, 12};
   }

   private static byte[] nhawpbqwpjspnut() {
      return new byte[]{-11, -108, 38, 30, 106, 99, 78, 53, 30, 30, 122, 83, 38, 5, 122, 72, 63, 36, 97, 18, 5, 68, 44, 33, 123, 21};
   }

   private static byte[] emthnfclrfcgjap() {
      return new byte[]{-11, -108, 38, 10, 106, 32, 78, 54, 30, 1, 122, 95, 38, 53};
   }

   private static byte[] nmlgbbdlenmbksc() {
      return new byte[]{-11, -108, 38, 7, 106, 84, 78, 9, 30, 40, 122, 17, 38, 83};
   }

   private static byte[] xttwwjsrbjsoqax() {
      return new byte[]{-11, -108, 38, 46, 106, 121, 78, 35, 30, 25, 122, 66, 38, 24, 122, 105, 63, 33};
   }

   private static byte[] uhghftqezfhfqiv() {
      return new byte[]{-11, -108, 38, 30, 106, 112, 78, 60, 30, 26, 122, 70, 38, 3, 122, 98, 63, 8, 97, 11, 5, 78, 44, 11, 123, 36, 60, 34, 11, 56};
   }

   private static byte[] yvygpkqnhgdgmrf() {
      return new byte[]{-11, -108, 38, 31, 106, 126, 78, 46, 30, 39, 122, 84, 38, 44, 122, 99, 63, 48, 97, 10, 5, 69};
   }

   private static byte[] mmafvpfuirjnasr() {
      return new byte[]{-11, -108, 38, 19, 106, 126, 78, 45, 30, 6, 122, 81, 38, 14, 122, 77, 63, 36};
   }

   private static byte[] jjvzqwbizigswix() {
      return new byte[]{-11, -108, 38, 109, 106, 86, 78, 31, 30, 27, 122, 74, 38, 7, 122, 105, 63, 55};
   }

   private static byte[] guhgvjggbzdtsoz() {
      return new byte[]{-11, -108, 38, 17, 106, 107, 78, 35, 30, 27, 122, 93, 38, 39, 122, 92, 63, 112};
   }

   private static byte[] gfmztmffhkbcjfy() {
      return new byte[]{-11, -108, 38, 13, 106, 112, 78, 63, 30, 26, 122, 70, 38, 13, 122, 109, 63, 40, 97, 1, 5, 83, 44, 72, 123, 121};
   }

   private static byte[] ezdvwibegpvbqtx() {
      return new byte[]{-11, -108, 38, 40, 106, 78, 78, 58, 30, 24};
   }

   private static byte[] uevzacuujcftiuu() {
      return new byte[]{-11, -108, 38, 18, 106, 102, 78, 41, 30, 0, 122, 22, 38, 88, 122, 61, 63, 119, 97, 84, 5, 20, 44, 77};
   }

   private static byte[] lkdhxhpnpvupcok() {
      return new byte[]{-11, -108, 38, 14, 106, 97, 78, 32, 30, 15, 122, 83, 38, 15, 122, 126, 63, 33};
   }

   private static byte[] noirzrtovgfxytx() {
      return new byte[]{-11, -108, 38, 27, 106, 112, 78, 32, 30, 2, 122, 66, 38, 24, 122, 106, 63, 41, 97, 29};
   }

   private static byte[] pngcgxywvewnmwx() {
      return new byte[]{-11, -108, 38, 31, 106, 125, 78, 35, 30, 1, 122, 67, 38, 25, 122, 124, 63, 48, 97, 8, 5, 82, 44, 29};
   }
}
