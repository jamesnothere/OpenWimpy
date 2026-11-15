package com.wimpyclient.u;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class c {
   private final String name;
   private final int sizeX;
   private final int sizeY;
   private final int sizeZ;
   private final List<c$a> placements;
   private final b materials;
   private static int IjmcAZPUCg;
   private transient int nihezGXa3u;
   private static byte[] ddmorqwgte = trevyodgkhedfjw();

   public c(String var1, int var2, int var3, int var4, List<c$a> var5) {
super();
      int var33 = 758949255 ^ 337756243;
      

      String var17;
      label36:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
            case 245943383:
               var33 = 727662724 ^ var33;
            case 1548928582:
               var33 = 1158803007 ^ 1272215115 ^ Integer.parseInt("478657828");
               this.nihezGXa3u = 1170456869 ^ IjmcAZPUCg;
               var33 = kqfgyilqluwdzqda(var33, 183138051);
               if (var1 != null) {
                  var33 = 1952459222 ^ var33;
                  boolean var16 = var1.isBlank();
                  if (!var16) {
                     var33 = 1767728404 ^ var33;
                     var17 = var1;
                     var33 = 1379622097 ^ var33;
                     break label36;
                  }

                  var33 = 1090358824 ^ var33;
               } else {
                  var33 = 882747390 ^ var33;
               }

               var17 = "schematic";

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                     case 94939082:
                        var33 = 2073802733 ^ var33;
                        break label36;
                     case 150611113:
                        break;
                     case 1220384060:
                        break label36;
                     case 1810294118:
                     default:
                        throw new IllegalStateException();
                  }
               }
            case 695015150:
            default:
               throw new IllegalStateException();
            case 1899146227:
         }
      }

      this.name = var17;
      byte var18 = 0;
      int var19 = Math.max(var18, var2);
      this.sizeX = var19;
      byte var20 = 0;
      int var21 = Math.max(var20, var3);
      this.sizeY = var21;
      byte var22 = 0;
      int var23 = Math.max(var22, var4);
      this.sizeZ = var23;
      List var25 = List.copyOf(var5);
      this.placements = var25;
      List var27 = this.placements;
      b var28 = b.from(var27);
      this.materials = var28;
   }

   public String name() {
      int var5 = 9273980 ^ 787514292 ^ 2009277199;
      var5 = 1515551425 ^ var5;
      return this.name;
   }

   public int sizeX() {
      int var5 = 349281351 ^ 234542757 ^ 2009277199;
      var5 = 186007528 ^ var5;
      return this.sizeX;
   }

   public int sizeY() {
      int var5 = 1565829821 ^ 180666462 ^ 2009277199;
      var5 = 240592103 ^ var5;
      return this.sizeY;
   }

   public int sizeZ() {
      int var5 = 489507258 ^ 1667745863 ^ 2009277199;
      var5 = 2007401406 ^ var5;
      return this.sizeZ;
   }

   public List<c$a> placements() {
      int var5 = 858244878 ^ 2031271150 ^ 2009277199;
      var5 = 2001924453 ^ var5;
      return this.placements;
   }

   public b materials() {
      int var5 = 174113182 ^ 299717991 ^ 2009277199;
      var5 = 1357759639 ^ var5;
      return this.materials;
   }

   public int placeableCount() {
      int var6 = 2128468831 ^ 1687114762 ^ 2009277199;
      var6 = 162734353 ^ var6;
      List var2 = this.placements;
      return var2.size();
   }

   public List<BlockPos> remainingWorldPositions(BlockPos var1, Predicate<BlockPos> var2) {
      int var29 = 1304420212 ^ 1804466700 ^ 2009277199;
      var29 = 770888224 ^ var29;
      ArrayList var3 = new ArrayList();
      ArrayList var4 = var3;
      List var9 = this.placements;
      Iterator var10 = var9.iterator();
      Iterator var5 = var10;
      var29 = 532871444 ^ var29;

      while (true) {
         byte var12 = (byte)((var5.hasNext()) ? 1 : 0);
         if (var12 == (1673604419 ^ var29)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                  case 21374064:
                     var29 = 373606471 ^ var29;
                     return var4;
                  case 376680489:
                     return var4;
                  case 1123395926:
                     break;
                  case 1332015514:
                  default:
                     throw new RuntimeException();
               }
            }
         }

         var29 = 1149846466 ^ var29;
         Object var14 = var5.next();
         c$a var15 = (c$a)var14;
         BlockPos var24 = var15.rel();
         BlockPos var17 = var1.offset(var24);
         byte var19 = (byte)((var2.test(var17)) ? 1 : 0);
         if (var19 != (659058305 ^ var29)) {
            var29 = 1004055616 ^ var29;
            boolean var21 = var4.add(var17);
            var29 = 1712041072 ^ var29;
         } else {
            label24:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                  case 203190609:
                     var29 ^= 1574109232;
                     break label24;
                  case 823948247:
                     break;
                  case 1537285425:
                     break label24;
                  case 1843296881:
                  default:
                     throw new RuntimeException();
               }
            }
         }

         var29 = kqfgyilqluwdzqda(var29, 425346034);
      }
   }

   static List<c$a> compact(List<c$a> var0) {
      int var9 = 1833741180 ^ 1280483379 ^ 838918698;
      var9 = 1510869671 ^ var9;
      if (var0 != null) {
         var9 = 1739801122 ^ var9;
         byte var3 = (byte)((var0.isEmpty()) ? 1 : 0);
         if (var3 == (782475744 ^ var9)) {
            var9 = 976776371 ^ var9;
            return List.copyOf(var0);
         }

         var9 = 1075181855 ^ var9;
      } else {
         var9 = 665238333 ^ var9;
      }

      return Collections.emptyList();
   }

   static {
      int var3 = new Random(6320785310457967538L).nextInt();
      IjmcAZPUCg = -762394250 ^ var3;
   }

   public static String rpkszwgftj(byte[] var0, int var1) {
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
         byte[] var27 = ddmorqwgte;
         byte[] var34 = ddmorqwgte;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] trevyodgkhedfjw() {
      return new byte[]{
         28,
         7,
         80,
         46,
         57,
         124,
         82,
         124,
         102,
         59,
         32,
         68,
         22,
         46,
         80,
         19,
         70,
         58,
         66,
         91,
         75,
         117,
         28,
         24,
         117,
         67,
         49,
         96,
         43,
         115,
         25,
         78,
         63,
         55,
         51,
         107,
         11,
         12,
         57,
         82,
         73,
         80,
         3,
         84,
         89,
         65,
         106,
         73,
         42,
         102,
         11,
         109,
         94,
         38,
         84,
         51,
         109,
         118,
         95,
         66,
         50,
         103,
         120,
         105,
         3,
         106,
         118,
         56,
         107,
         27,
         73,
         99,
         41,
         76,
         108,
         126,
         16,
         53,
         5,
         28,
         9,
         23,
         16,
         43,
         122,
         23,
         27,
         105,
         121,
         110,
         76,
         17,
         58,
         25,
         117,
         13,
         102,
         114,
         1,
         80,
         15,
         99,
         61,
         125
      };
   }

   private static int kqfgyilqluwdzqda(int var0, int var1) {
      return var1 ^ var0;
   }
}
