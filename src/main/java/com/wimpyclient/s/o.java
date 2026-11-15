package com.wimpyclient.s;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class o {
   private long lo;
   private long hi;
   private static int rnVhmRxSpH;
   private transient int pd5ogaH0kJ;
   private static String ndoluxaxyp = ByteBuffer.wrap(ktcwjnroffxakqb()).asCharBuffer().toString();

   o() {
super();
      int var4 = 1259534704 ^ 1697733565;
      
      var4 = 1532818333 ^ var4;
      var4 = 1661323445 ^ 741599255 ^ Integer.parseInt("977891826");
      this.pd5ogaH0kJ = 734850771 ^ rnVhmRxSpH;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 61266164:
               var4 = 1923682966 ^ var4;
            case 943646666:
               return;
            case 1089236157:
               break;
            case 1742469102:
            default:
               throw new RuntimeException();
         }
      }
   }

   private o(long var1, long var3) {
 super();
      int var13 = 58790162 ^ 1311595189;
     
      var13 = mfvuhejhsjoesvzt(var13, 1026884235);
      var13 = 2027245216 ^ 839218814 ^ Integer.parseInt("977891826");
      this.pd5ogaH0kJ = 734850771 ^ rnVhmRxSpH;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
            case 170429788:
               var13 = 1895240162 ^ var13;
            case 568865774:
               this.lo = var1;
               this.hi = var3;
               return;
            case 226365391:
            default:
               throw new RuntimeException(new IOException());
            case 1866553399:
         }
      }
   }

   o copy() {
      int var9 = 1528561233 ^ 1036635030 ^ 1713410256;
      var9 = 2011380369 ^ var9;
      long var4 = this.lo;
      long var6 = this.hi;
      return new o(var4, var6);
   }

   boolean sameState(o var1) {
      int var18 = 1901418228 ^ 1601893584 ^ 1713410256;
      var18 = 1267816597 ^ var18;
      long var4 = this.lo;
      long var12 = var1.lo;
      long var24;
      int var6 = (var24 = var4 - var12) == 0L ? 0 : (var24 < 0L ? -1 : 1);
      if (var6 == (60713569 ^ var18)) {
         var18 = 671983799 ^ var18;
         long var8 = this.hi;
         long var15 = var1.hi;
         long var25;
         int var10 = (var25 = var8 - var15) == 0L ? 0 : (var25 < 0L ? -1 : 1);
         if (var10 == (731103958 ^ var18)) {
            var18 = 1100771240 ^ var18;
            byte var11 = (byte)(1779412351 ^ var18);
            var18 = mfvuhejhsjoesvzt(var18, 785999795);
            return (var11 != 0);
         }

         label22:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
               case 74343149:
                  var18 ^= 1497728855;
                  break label22;
               case 1362609170:
               default:
                  throw new RuntimeException();
               case 1380834754:
                  break label22;
               case 1409196818:
            }
         }
      } else {
         var18 = 1900556256 ^ var18;
      }

      byte var26 = (byte)(1926645121 ^ var18);
      var18 = 906006348 ^ var18;
      return (var26 != 0);
   }

   long stateHash() {
      int var14 = 1630705934 ^ 1005322617 ^ 1713410256;
      var14 = 1142919960 ^ var14;
      long var4 = this.lo;
      long var2 = 31L;
      long var6 = var4 * var2;
      long var11 = this.hi;
      return var6 + var11;
   }

   private static long mix(long var0) {
      int var42 = 1333345143 ^ 1550501517 ^ 1307344387;
      var42 = 355061014 ^ var42;
      byte var6 = (byte)(1272336113 ^ var42);
      long var21 = var0 >>> var6;
      long var7 = var0 ^ var21;
      long var23 = -4658895280553007687L;
      long var9 = var7 * var23;
      byte var35 = (byte)(1272336116 ^ var42);
      long var27 = var9 >>> var35;
      long var13 = var9 ^ var27;
      long var29 = -7723592293110705685L;
      long var15 = var13 * var29;
      byte var36 = (byte)(1272336112 ^ var42);
      long var33 = var15 >>> var36;
      return var15 ^ var33;
   }

   void setSeed(long var1) {
      int var47 = 414991403 ^ 1220591840 ^ 1713410256;
      var47 = 926458716 ^ var47;
      long var7 = 7640891576956012809L;
      long var13 = var1 ^ var7;
      long var39 = -7046029254386353131L;
      long var17 = var13 + var39;
      long var29 = mix(var13);
      this.lo = var29;
      long var33 = mix(var17);
      this.hi = var33;
      long var22 = this.lo;
      long var42 = this.hi;
      long var24 = var22 | var42;
      long var44 = 0L;
      long var52;
      int var26 = (var52 = var24 - var44) == 0L ? 0 : (var52 < 0L ? -1 : 1);
      if (var26 == (23377735 ^ var47)) {
         var47 = 869217821 ^ var47;
         long var35 = -7046029254386353131L;
         this.lo = var35;
         long var37 = 7640891576956012809L;
         this.hi = var37;
         var47 = 1495121513 ^ var47;
      } else {
         var47 = 1792182388 ^ var47;
      }
   }

   private long step() {
      int var60 = 1605559435 ^ 342322624 ^ 1713410256;
      var60 = 365552412 ^ var60;
      long var14 = this.lo;
      long var17 = this.hi;
      long var21 = var14 + var17;
      byte var45 = (byte)(943520406 ^ var60);
      long var23 = Long.rotateLeft(var21, var45);
      long var25 = var23 + var14;
      long var29 = var17 ^ var14;
      byte var6 = (byte)(943520438 ^ var60);
      long var35 = Long.rotateLeft(var14, var6);
      long var37 = var35 ^ var29;
      byte var7 = (byte)(943520402 ^ var60);
      long var54 = var29 << var7;
      long var39 = var37 ^ var54;
      this.lo = var39;
      byte var56 = (byte)(943520411 ^ var60);
      long var43 = Long.rotateLeft(var29, var56);
      this.hi = var43;
      return var25;
   }

   void skip(int var1) {
      int var10 = 1735338075 ^ 1513520863 ^ 1713410256;
      var10 = 979850325 ^ var10;
      byte var2 = (byte)(1629393409 ^ var10);
      int var4 = var2;
      var10 = 655772447 ^ var10;

      while (var4 < var1) {
         var10 = 344595612 ^ var10;
         long var7 = this.step();
         var4 += 1384301955 ^ var10;
         var10 = 344595612 ^ var10;
      }

      var10 = 156530738 ^ var10;
   }

   int next(int var1) {
      int var13 = 1303067476 ^ 642740269 ^ 1713410256;
      var13 = 380240971 ^ var13;
      long var5 = this.step();
      byte var3 = (byte)(460251042 ^ var13);
      int var10 = var3 - var1;
      long var7 = var5 >>> var10;
      return (int)var7;
   }

   int nextInt(int var1) {
      int var39 = 480236726 ^ 1594276626 ^ 1713410256;
      var39 = 2110688288 ^ var39;
      byte var4 = (byte)(1484223317 ^ var39);
      int var25 = var1 - var4;
      int var8 = var1 & var25;
      if (var8 == (1484223316 ^ var39)) {
         var39 = 1831416266 ^ var39;
         long var10 = var1;
         byte var5 = (byte)(895369857 ^ var39);
         int var32 = this.next(var5);
         long var33 = var32;
         long var12 = var10 * var33;
         byte var35 = (byte)(895369857 ^ var39);
         long var14 = var12 >> var35;
         return (int)var14;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
               case 191313669:
                  var39 ^= 1646489368;
               case 1991997447:
                  while (true) {
                     byte var26 = (byte)(978590803 ^ var39);
                     int var18 = this.next(var26);
                     int var20 = var18 % var1;
                     int var22 = var18 - var20;
                     byte var36 = (byte)(978590797 ^ var39);
                     int var30 = var1 - var36;
                     int var23 = var22 + var30;
                     if (var23 >= (978590796 ^ var39)) {
                        var39 = 2031289967 ^ var39;
                        return var20;
                     }

                     var39 = mfvuhejhsjoesvzt(var39, 0);
                  }
               case 766292727:
               default:
                  throw new RuntimeException();
               case 1087378366:
            }
         }
      }
   }

   int between(int var1, int var2) {
      int var14 = 1797115854 ^ 1330590334 ^ 1713410256;
      var14 = 1784040432 ^ var14;
      int var8 = var2 - var1;
      byte var11 = (byte)(673457809 ^ var14);
      int var9 = var8 + var11;
      int var6 = this.nextInt(var9);
      return var6 + var1;
   }

   long nextLong() {
      int var21 = 939116647 ^ 1393168692 ^ 1713410256;
      var21 = 188974307 ^ var21;
      byte var2 = (byte)(160484672 ^ var21);
      int var6 = this.next(var2);
      byte var16 = (byte)(160484672 ^ var21);
      int var8 = this.next(var16);
      long var10 = var6;
      byte var3 = (byte)(160484672 ^ var21);
      long var12 = var10 << var3;
      long var18 = var8;
      return var12 + var18;
   }

   float nextFloat() {
      int var9 = 925532396 ^ 1184928164 ^ 1713410256;
      var9 = 777428132 ^ var9;
      byte var2 = (byte)(972823844 ^ var9);
      int var3 = this.next(var2);
      float var4 = var3;
      float var6 = 5.9604645E-8F;
      return var4 * var6;
   }

   double nextDouble() {
      int var26 = 72469047 ^ 587242010 ^ 1713410256;
      var26 = 670081074 ^ var26;
      byte var2 = (byte)(1719754965 ^ var26);
      int var6 = this.next(var2);
      byte var20 = (byte)(1719754964 ^ var26);
      int var8 = this.next(var20);
      long var10 = var6;
      byte var3 = (byte)(1719754964 ^ var26);
      long var12 = var10 << var3;
      long var23 = var8;
      long var14 = var12 + var23;
      float var16 = (float)var14;
      float var21 = 1.110223E-16F;
      float var17 = var16 * var21;
      return var17;
   }

   long setDecorationSeed(long var1, int var3, int var4) {
      int var54 = 1662183203 ^ 1266580439 ^ 1713410256;
      var54 = 642067464 ^ var54;
      this.setSeed(var1);
      long var19 = this.nextLong();
      long var8 = 1L;
      long var21 = var19 | var8;
      long var24 = this.nextLong();
      long var42 = 1L;
      long var26 = var24 | var42;
      long var29 = var3;
      long var31 = var29 * var21;
      long var47 = var4;
      long var49 = var47 * var26;
      long var33 = var31 + var49;
      long var35 = var33 ^ var1;
      this.setSeed(var35);
      return var35;
   }

   void setFeatureSeed(long var1, int var3, int var4) {
      int var23 = 1467740147 ^ 392897856 ^ 1713410256;
      var23 = 574944215 ^ var23;
      long var14 = var3;
      long var10 = var1 + var14;
      long var16 = 10000L;
      long var20 = var4;
      long var18 = var16 * var20;
      long var12 = var10 + var18;
      this.setSeed(var12);
   }

   static {
      int var3 = new Random(-1890002766131686519L).nextInt();
      rnVhmRxSpH = -388056383 ^ var3;
   }

   public static String hfctmxvdrs(byte[] var0, int var1) {
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
      String var29 = ndoluxaxyp;
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

   private static byte[] ktcwjnroffxakqb() {
      return new byte[0];
   }

   private static int mfvuhejhsjoesvzt(int var0, int var1) {
      return var1 ^ var0;
   }
}
