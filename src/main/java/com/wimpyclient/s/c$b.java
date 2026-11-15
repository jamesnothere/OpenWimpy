package com.wimpyclient.s;

import java.util.Objects;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class c$b {
   private final int order;
   private final byte kind;
   private final int minX;
   private final int minY;
   private final int minZ;
   private final int maxX;
   private final int maxY;
   private final int maxZ;
   private static int SJUvInASlo;
   private transient int wm3ySmXA4q;
   private static byte[] lmvujodzgx = dhhxkbpqwqgijdk();

   public c$b(int order, byte kind, int minX, int minY, int minZ, int maxX, int maxY, int maxZ) {
super();
      int var28 = 1177944421 ^ 482595358;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
            case 3937099:
               var28 = 170446875 ^ var28;
            case 1063117772:
               var28 = 946599547 ^ 19294333 ^ Integer.parseInt("1771085158");
               this.wm3ySmXA4q = 1790583688 ^ SJUvInASlo;
               var28 = 647116102 ^ var28;
               this.order = order;
               this.kind = kind;
               this.minX = minX;
               this.minY = minY;
               this.minZ = minZ;
               this.maxX = maxX;
               this.maxY = maxY;
               this.maxZ = maxZ;
               return;
            case 22992430:
               break;
            case 1480444559:
            default:
               throw new RuntimeException();
         }
      }
   }

   boolean contains(int var1, int var2, int var3) {
      int var25 = 293736651 ^ 1604491956 ^ 1141068872;
      var25 = 2000330763 ^ var25;
      int var12 = this.minX;
      if (var1 >= var12) {
         var25 = 1606452000 ^ var25;
         int var14 = this.maxX;
         if (var1 <= var14) {
            var25 = 1316076279 ^ var25;
            int var16 = this.minY;
            if (var2 >= var16) {
               var25 = 2107961020 ^ var25;
               int var18 = this.maxY;
               if (var2 <= var18) {
                  var25 = 1558574820 ^ var25;
                  int var20 = this.minZ;
                  if (var3 >= var20) {
                     var25 = 643854376 ^ var25;
                     int var22 = this.maxZ;
                     if (var3 <= var22) {
                        var25 = 199752568 ^ var25;
                        byte var11 = (byte)(1617876194 ^ var25);
                        var25 = 1571809284 ^ var25;
                        return (var11 != 0);
                     }

                     var25 = 320279626 ^ var25;
                  } else {
                     var25 = wnsykipohkkrewgl(var25, 897016930);
                  }
               } else {
                  var25 = 1771213446 ^ var25;
               }
            } else {
               var25 = wnsykipohkkrewgl(var25, 339115066);
            }
         } else {
            label34:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                  case 59144383:
                     var25 ^= 1514653389;
                     break label34;
                  case 350276821:
                     break;
                  case 562757561:
                     break label34;
                  case 2023945103:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      } else {
         var25 = wnsykipohkkrewgl(var25, 92751341);
      }

      byte var35 = (byte)(2023635921 ^ var25);
      var25 = 1163855670 ^ var25;
      return (var35 != 0);
   }

   @Override
   public final String toString() {
      int var5 = 759550904 ^ 1959640292 ^ 1141068872;
      var5 = 813360950 ^ var5;
      return "c$b[order=" + this.order + ", kind=" + this.kind + ", minX=" + this.minX + ", minY=" + this.minY + ", minZ=" + this.minZ + ", maxX=" + this.maxX + ", maxY=" + this.maxY + ", maxZ=" + this.maxZ + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 326340187 ^ 512677890 ^ 1141068872;
      var5 = 1946509332 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.order);
      result = 31 * result + Objects.hashCode(this.kind);
      result = 31 * result + Objects.hashCode(this.minX);
      result = 31 * result + Objects.hashCode(this.minY);
      result = 31 * result + Objects.hashCode(this.minZ);
      result = 31 * result + Objects.hashCode(this.maxX);
      result = 31 * result + Objects.hashCode(this.maxY);
      result = 31 * result + Objects.hashCode(this.maxZ);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1284842412 ^ 164789993 ^ 1141068872;
      var7 = 1821175561 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      c$b other = (c$b)var1;
      return this.order == other.order &&
      this.kind == other.kind &&
      this.minX == other.minX &&
      this.minY == other.minY &&
      this.minZ == other.minZ &&
      this.maxX == other.maxX &&
      this.maxY == other.maxY &&
      this.maxZ == other.maxZ;
   }

   public int order() {
      int var5 = 528997739 ^ 1114850093 ^ 1141068872;
      var5 = 2140690825 ^ var5;
      return this.order;
   }

   public byte kind() {
      int var5 = 130521508 ^ 971778759 ^ 1141068872;
      var5 = 335149947 ^ var5;
      return this.kind;
   }

   public int minX() {
      int var5 = 1861536969 ^ 1572953537 ^ 1141068872;
      var5 = 1743821197 ^ var5;
      return this.minX;
   }

   public int minY() {
      int var5 = 775206280 ^ 316101477 ^ 1141068872;
      var5 = 1937119291 ^ var5;
      return this.minY;
   }

   public int minZ() {
      int var5 = 1883799766 ^ 1264442715 ^ 1141068872;
      var5 = 787698479 ^ var5;
      return this.minZ;
   }

   public int maxX() {
      int var5 = 129224167 ^ 1052501086 ^ 1141068872;
      var5 = 1582428023 ^ var5;
      return this.maxX;
   }

   public int maxY() {
      int var5 = 1610972311 ^ 1902645356 ^ 1141068872;
      var5 = 588423683 ^ var5;
      return this.maxY;
   }

   public int maxZ() {
      int var5 = 1190747878 ^ 1016419726 ^ 1141068872;
      var5 = 1264208525 ^ var5;
      return this.maxZ;
   }

   static {
      int var3 = new Random(3051208510621167780L).nextInt();
      SJUvInASlo = -1096022639 ^ var3;
   }

   public static String yjunavztiw(byte[] var0, int var1) {
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
         byte[] var27 = lmvujodzgx;
         byte[] var34 = lmvujodzgx;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] dhhxkbpqwqgijdk() {
      return new byte[]{
         83, 30, 102, 37, 95, 12, 101, 124, 46, 85, 45, 29, 120, 83, 1, 51, 114, 58, 125, 74, 13, 57, 16, 94, 48, 109, 11, 116, 11, 11, 39, 127, 87, 109, 39
      };
   }

   private static int wnsykipohkkrewgl(int var0, int var1) {
      return var1 ^ var0;
   }
}
