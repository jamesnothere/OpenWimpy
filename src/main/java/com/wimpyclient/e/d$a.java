package com.wimpyclient.e;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public enum d$a {CLUSTER(((short)(1586597770 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((byte)(1586597752 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((short)(1586597825 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((byte)(1586597690 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), (((byte)(1586597695 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))) != 0)),
   LARGE_BUD(((short)(1586597800 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((byte)(1586597732 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((short)(1586597848 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((byte)(1586597693 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), (((byte)(1586597695 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))) != 0)),
   BUD(((byte)(1586597712 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((byte)(1586597752 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((short)(1586597780 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((byte)(1586597695 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), (((byte)(1586597694 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))) != 0)),
   PACKET(((byte)(1586597654 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((short)(1586597858 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((short)(1586597825 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((byte)(1586597693 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), (((byte)(1586597695 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))) != 0)),
   LIGHT(((short)(1586597825 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((short)(1586597800 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((byte)(1586597654 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((byte)(1586597692 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), (((byte)(1586597695 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))) != 0)),
   CULLED(((short)(1586597825 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((short)(1586597868 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((byte)(1586597654 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), ((byte)(1586597692 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))), (((byte)(1586597695 ^ (36759485 ^ (1984190425 ^ 235718569 ^ Integer.parseInt("619313395"))))) != 0));

   private final int red;
   private final int green;
   private final int blue;
   private final int rank;
   private final boolean grown;
   private static byte[] ulibgqeaut = zjxpsfwykecxowi();

   private d$a(int nullxx, int nullxxx, int nullxxxx, int nullxxxxx, boolean nullxxxxxx) {
      int var23 = 543375712 ^ 476105523;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
            case 71753731:
               var23 = 1290619995 ^ var23;
            case 1671373174:
               var23 = 975393423 ^ 1847880820 ^ Integer.parseInt("619313395");
               var23 = cenuambqkdnfiajr(var23, 1086567790);
               this.red = nullxx;
               this.green = nullxxx;
               this.blue = nullxxxx;
               this.rank = nullxxxxx;
               this.grown = nullxxxxxx;
               return;
            case 273513665:
               break;
            case 972895479:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public int red() {
      int var5 = 1271240851 ^ 618670076 ^ 946211806;
      var5 = 761428799 ^ var5;
      return this.red;
   }

   public int green() {
      int var5 = 1944124437 ^ 311956643 ^ 946211806;
      var5 = 230429138 ^ var5;
      return this.green;
   }

   public int blue() {
      int var5 = 1742240936 ^ 252322539 ^ 946211806;
      var5 = 667003354 ^ var5;
      return this.blue;
   }

   public float redF() {
      int var8 = 880398243 ^ 1252338857 ^ 946211806;
      var8 = 1381056015 ^ var8;
      int var3 = this.red;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public float greenF() {
      int var8 = 1749278776 ^ 1710978788 ^ 946211806;
      var8 = 137775013 ^ var8;
      int var3 = this.green;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public float blueF() {
      int var8 = 141310788 ^ 1377151215 ^ 946211806;
      var8 = 1763748908 ^ var8;
      int var3 = this.blue;
      float var4 = var3;
      float var2 = 255.0F;
      return var4 / var2;
   }

   public int rank() {
      int var5 = 1935336107 ^ 1817381235 ^ 946211806;
      var5 = 1286143702 ^ var5;
      return this.rank;
   }

   public boolean grown() {
      int var5 = 467577861 ^ 1436727570 ^ 946211806;
      var5 = 268844578 ^ var5;
      return this.grown;
   }

   public boolean countsAsCluster() {
      int var8 = 283150014 ^ 2056442299 ^ 946211806;
      var8 = 639126195 ^ var8;
      d$a var2 = CLUSTER;
      if (this != var2) {
         var8 = 1148382024 ^ var8;
         d$a var5 = LIGHT;
         if (this != var5) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
                  case 64256527:
                  default:
                     throw new RuntimeException();
                  case 234240528:
                     var8 ^= 1506949131;
                  case 212670392:
                     byte var4 = (byte)(1772930347 ^ var8);
                     var8 = 1704139082 ^ var8;
                     return (var4 != 0);
                  case 947163246:
               }
            }
         }

         var8 = 555030476 ^ var8;
      } else {
         var8 = cenuambqkdnfiajr(var8, 1701313668);
      }

      byte var14 = (byte)(292285165 ^ var8);
      var8 = 492058253 ^ var8;
      return (var14 != 0);
   }



   public static String psikorxleq(byte[] var0, int var1) {
      String var8 = Integer.toString(var1);
      byte[] var9 = var8.getBytes();
      byte[] var6 = var9;
      byte var10 = 0;
      int var7 = var10;

      while (true) {
         int var15 = var0.length;
         if (var7 >= var15) {
            Charset var29 = StandardCharsets.UTF_16;
            return new String(var0, var29);
         }

         byte var18 = var0[var7];
         int var33 = var6.length;
         int var30 = var7 % var33;
         byte var26 = var6[var30];
         int var19 = var18 ^ var26;
         byte var20 = (byte)var19;
         var0[var7] = var20;
         byte var21 = var0[var7];
         byte[] var27 = ulibgqeaut;
         byte[] var34 = ulibgqeaut;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] zjxpsfwykecxowi() {
      return new byte[]{
         112,
         84,
         68,
         98,
         51,
         95,
         13,
         68,
         42,
         117,
         39,
         127,
         44,
         72,
         40,
         2,
         64,
         79,
         58,
         39,
         6,
         69,
         105,
         96,
         34,
         87,
         11,
         8,
         107,
         107,
         106,
         86,
         106,
         63,
         78,
         47,
         22,
         8,
         124
      };
   }

   private static byte[] gywasaghpgozurp() {
      return new byte[]{-65, -98, 124, 23, 6, 42, 58, 39, 19, 18, 22, 30, 20, 59, 29, 105};
   }

   private static byte[] rwejgmnzvmdmnul() {
      return new byte[]{-65, -98, 124, 24, 6, 39, 58, 32, 19, 6, 22, 15, 20, 33, 29, 121, 119, 44, 3, 87};
   }

   private static byte[] qbazdjleytnqvoi() {
      return new byte[]{-65, -98, 124, 22, 6, 51, 58, 54};
   }

   private static byte[] idvwplivubnqdzf() {
      return new byte[]{-65, -98, 124, 4, 6, 39, 58, 49, 19, 10, 22, 15, 20, 42};
   }

   private static byte[] nqweegbucqkmgiv() {
      return new byte[]{-65, -98, 124, 24, 6, 47, 58, 53, 19, 9, 22, 30};
   }

   private static byte[] edwkkgjkmoabsvb() {
      return new byte[]{-65, -98, 124, 23, 6, 51, 58, 62, 19, 13, 22, 15, 20, 58};
   }

   private static int cenuambqkdnfiajr(int var0, int var1) {
      return var1 ^ var0;
   }
}
