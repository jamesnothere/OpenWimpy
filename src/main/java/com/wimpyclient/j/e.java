package com.wimpyclient.j;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class e extends f {
   private final List<String> modes;
   private final Supplier<String> getter;
   private final Consumer<String> setter;
   private static int IGRcsuxtDl;
   private transient int Op9e2X9jF5;
   private static String flpxkkuuqm = ByteBuffer.wrap(avipispiovjkgly()).asCharBuffer().toString();

   public e(String var1, String var2, Supplier<String> var3, Consumer<String> var4, String... var5) {
super(var1, var2);
      int var23 = 423625070 ^ 1106693447;
      
      var23 = naxstbilknaelqaw(var23, 888618700);
      var23 = 814952208 ^ 1934783046 ^ Integer.parseInt("796962739");
      this.Op9e2X9jF5 = 236415994 ^ IGRcsuxtDl;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
            case 29338330:
               var23 ^= 1410361037;
            case 1921426137:
               if (var5 != null) {
                  var23 = 1548318527 ^ var23;
                  int var11 = var5.length;
                  if (var11 != 0) {
                     var23 = naxstbilknaelqaw(var23, 1208800031);
                     List var17 = List.of(var5);
                     this.modes = var17;
                     this.getter = var3;
                     this.setter = var4;
                     return;
                  }

                  var23 = 557786770 ^ var23;
               } else {
                  var23 = 2104906157 ^ var23;
               }

               String var20 = "ModeSetting requires at least one mode";
               IllegalArgumentException var15 = new IllegalArgumentException(var20);
               throw new RuntimeException(var15);
            case 1754958586:
            default:
               throw new IllegalStateException();
            case 2102980255:
         }
      }
   }

   public List<String> modes() {
      int var5 = 992836046 ^ 304222323 ^ 1666954476;
      var5 = 1684464494 ^ var5;
      return this.modes;
   }

   public String get() {
      int var18 = 2120785090 ^ 2090441019 ^ 1666954476;
      var18 = 1498664350 ^ var18;
      Supplier var4 = this.getter;
      Object var5 = var4.get();
      String var6 = (String)var5;
      if (var6 == null) {
         var18 = 1596381986 ^ var18;
      } else {
         var18 = 1065722630 ^ var18;
         List var9 = this.modes;
         byte var10 = (byte)((var9.contains(var6)) ? 1 : 0);
         if (var10 != (125624205 ^ var18)) {
            var18 = 1672943479 ^ var18;
            return var6;
         }

         label22:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
               case 117774056:
                  var18 = 1621325860 ^ var18;
               case 876102881:
                  break label22;
               case 1516635720:
                  break;
               case 1646214966:
               default:
                  throw new RuntimeException();
            }
         }
      }

      List var12 = this.modes;
      Object var13 = var12.getFirst();
      return (String)var13;
   }

   public void set(String var1) {
      int var12 = 1276659769 ^ 929670898 ^ 1666954476;
      var12 = 347699227 ^ var12;
      if (var1 != null) {
         var12 = 1807258319 ^ var12;
         List var5 = this.modes;
         byte var6 = (byte)((var5.contains(var1)) ? 1 : 0);
         if (var6 != (1730916595 ^ var12)) {
            var12 = 1868297144 ^ var12;
            Consumer var8 = this.setter;
            var8.accept(var1);
            com.wimpyclient.d.a.save();
            var12 = 34486949 ^ var12;
         } else {
            var12 = naxstbilknaelqaw(var12, 1834338589);
         }
      } else {
         var12 = 116218834 ^ var12;
      }
   }

   public boolean check(String var1) {
      int var8 = 1542376028 ^ 1764448544 ^ 1666954476;
      var8 = 1376818988 ^ var8;
      String var4 = this.get();
      return var4.equals(var1);
   }

   public void cycle() {
      int var21 = 957213226 ^ 1703499831 ^ 1666954476;
      var21 = 369657625 ^ var21;
      List var5 = this.modes;
      String var10 = this.get();
      int var6 = var5.indexOf(var10);
      byte var11 = (byte)(701989353 ^ var21);
      int var7 = var6 + var11;
      List var13 = this.modes;
      int var14 = var13.size();
      int var8 = var7 % var14;
      List var16 = this.modes;
      Object var17 = var16.get(var8);
      String var18 = (String)var17;
      this.set(var18);
   }

   static {
      int var3 = new Random(-2031198802207940852L).nextInt();
      IGRcsuxtDl = 440943576 ^ var3;
   }

   public static String ddgvosmsix(byte[] var0, int var1) {
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
      String var29 = flpxkkuuqm;
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

   private static byte[] avipispiovjkgly() {
      return new byte[0];
   }

   private static int naxstbilknaelqaw(int var0, int var1) {
      return var0 ^ var1;
   }
}
