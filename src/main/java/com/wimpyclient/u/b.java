package com.wimpyclient.u;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b {
   private final List<b$b> entries;
   private static int n1G3WKmI4m;
   private transient int f5bIBbJfVwS;

   private b(List<b$b> var1) {
super();
      int var8 = 1849047057 ^ 153289051;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
            case 3042286:
               break;
            case 129595882:
               var8 = 505365385 ^ var8;
            case 877644236:
               var8 = 335058264 ^ 859474505 ^ Integer.parseInt("1506305490");
               this.f5bIBbJfVwS = 1371865729 ^ n1G3WKmI4m;
               var8 = 1751066877 ^ var8;
               List var5 = List.copyOf(var1);
               this.entries = var5;
               return;
            case 2014472715:
            default:
               throw new RuntimeException();
         }
      }
   }

   public static b from(List<c$a> var0) {
      int var56 = 310648608 ^ 1961517588 ^ 1256530484;
      var56 = 62090471 ^ var56;
      LinkedHashMap var1 = new LinkedHashMap();
      LinkedHashMap var5 = var1;
      Iterator var10 = var0.iterator();
      Iterator var6 = var10;
      var56 = 1591519415 ^ var56;

      label51:
      while (true) {
         byte var12 = (byte)((var6.hasNext()) ? 1 : 0);
         if (var12 != (1910807376 ^ var56)) {
            var56 ^= 286846462;
            Object var14 = var6.next();
            c$a var15 = (c$a)var14;
            BlockState var17 = var15.state();
            Item var18 = itemFor(var17);
            if (var18 != null) {
               var56 = 570058703 ^ var56;
               Item var36 = Items.AIR;
               if (var18 == var36) {
                  var56 = 1112196193 ^ var56;
                  var56 = pibjrsaxkxrazqcz(var56, 1923632720);
               } else {
                  var56 = 1357796798 ^ var56;
                  byte var2 = (byte)(300434654 ^ var56);
                  Integer var41 = Integer.valueOf(var2);
                  BiFunction<Integer, Integer, Integer> var3 = Integer::sum;
                  Object var22 = var5.merge(var18, var41, var3);
                  var56 = pibjrsaxkxrazqcz(var56, 1611456399);
               }
               continue;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
                  case 199836941:
                     var56 ^= 286846462;
                  case 851185532:
                     continue label51;
                  case 937612956:
                     break;
                  case 2048901129:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }

         label45:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
               case 79976067:
                  break label45;
               case 212507919:
                  var56 ^= 215151942;
                  break label45;
               case 526260796:
               default:
                  throw new RuntimeException(new IOException());
               case 1842194336:
            }
         }

         int var43 = var5.size();
         ArrayList var23 = new ArrayList(var43);
         ArrayList var51 = var23;
         Set var25 = var5.entrySet();
         Iterator var26 = var25.iterator();
         Iterator var52 = var26;
         var56 = 394770580 ^ var56;

         while (true) {
            byte var28 = (byte)((var52.hasNext()) ? 1 : 0);
            if (var28 == (1790039682 ^ var56)) {
               var56 = 1674143487 ^ var56;
               Function<b$b, String> var38 = b$b::displayName;
               Comparator var39 = Comparator.comparing(var38);
               var51.sort(var39);
               return new b(var51);
            }

            var56 = 699458596 ^ var56;
            Object var32 = var52.next();
            Map.Entry var33 = (Map.Entry)var32;
            Object var46 = var33.getKey();
            Item var47 = (Item)var46;
            Object var48 = var33.getValue();
            Integer var49 = (Integer)var48;
            int var50 = var49;
            b$b var40 = new b$b(var47, var50);
            boolean var35 = var51.add(var40);
            var56 = 699458596 ^ var56;
         }
      }
   }

   public List<b$b> entries() {
      int var5 = 1419851672 ^ 1132677881 ^ 455090357;
      var5 = 989340757 ^ var5;
      return this.entries;
   }

   public List<b$a> withInventory(LocalPlayer var1) {
      int var46 = 779557431 ^ 1915564077 ^ 455090357;
      var46 = 528614065 ^ var46;
      Map var15 = countInventory(var1);
      Map var10 = var15;
      List var35 = this.entries;
      int var36 = var35.size();
      ArrayList var16 = new ArrayList(var36);
      ArrayList var11 = var16;
      List var18 = this.entries;
      Iterator var19 = var18.iterator();
      Iterator var12 = var19;
      var46 = 1208487232 ^ var46;

      label38:
      while (true) {
         byte var21 = (byte)((var12.hasNext()) ? 1 : 0);
         if (var21 != (284165470 ^ var46)) {
            var46 ^= 244672163;
            Object var23 = var12.next();
            b$b var24 = (b$b)var23;
            Item var33 = var24.item();
            byte var37 = (byte)(509961213 ^ var46);
            Integer var38 = Integer.valueOf(var37);
            Object var26 = var10.getOrDefault(var33, var38);
            Integer var27 = (Integer)var26;
            int var28 = var27;
            Item var39 = var24.item();
            int var40 = var24.needed();
            byte var7 = (byte)(509961213 ^ var46);
            int var42 = var24.needed();
            int var43 = var42 - var28;
            int var41 = Math.max(var7, var43);
            b$a var34 = new b$a(var39, var40, var28, var41);
            boolean var30 = var11.add(var34);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                  case 182743007:
                     var46 ^= 244672163;
                     continue label38;
                  case 395684603:
                  default:
                     throw new RuntimeException();
                  case 1093533187:
                     break;
                  case 1729635821:
                     continue label38;
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                  case 13703830:
                     var46 = 594878832 ^ var46;
                     return var11;
                  case 151243802:
                     break;
                  case 967921482:
                  default:
                     throw new RuntimeException();
                  case 1329016633:
                     return var11;
               }
            }
         }
      }
   }

   public List<b$a> withoutInventory() {
      int var6 = 1655293219 ^ 758776487 ^ 455090357;
      var6 = 186287835 ^ var6;
      Object var2 = null;
      return this.withInventory((LocalPlayer)var2);
   }

   public boolean hasAnyMissing(LocalPlayer var1) {
      int var19 = 907451976 ^ 233546326 ^ 455090357;
      var19 = 1453565017 ^ var19;
      List var6 = this.withInventory(var1);
      Iterator var7 = var6.iterator();
      Iterator var4 = var7;
      var19 = 485196784 ^ var19;

      while (true) {
         byte var9 = (byte)((var4.hasNext()) ? 1 : 0);
         if (var9 == (1788164866 ^ var19)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
                  case 243353798:
                     var19 ^= 873074207;
                     return (((byte)(1587492125 ^ var19)) != 0);
                  case 548920848:
                     return (((byte)(1587492125 ^ var19)) != 0);
                  case 602642246:
                     break;
                  case 1816221716:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var19 = 1114760925 ^ var19;
         Object var12 = var4.next();
         b$a var13 = (b$a)var12;
         int var15 = var13.missing();
         if (var15 > (686087647 ^ var19)) {
            var19 = 747189293 ^ var19;
            return (((byte)(74312179 ^ var19)) != 0);
         }

         label24:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
               case 30929434:
               default:
                  throw new IllegalStateException();
               case 255542532:
                  var19 ^= 2118954603;
                  break label24;
               case 1864247520:
                  break;
               case 2074183675:
                  break label24;
            }
         }

         var19 = 1010649270 ^ var19;
      }
   }

   public static Item itemFor(BlockState var0) {
      int var23 = 212568127 ^ 2124996819 ^ 1256530484;
      var23 = 1488193368 ^ var23;
      if (var0 != null) {
         var23 = 1444456611 ^ var23;
         byte var5 = (byte)((var0.isAir()) ? 1 : 0);
         if (var5 == (910877987 ^ var23)) {
            var23 = pibjrsaxkxrazqcz(var23, 967251127);
            Block var2 = Blocks.WATER;
            byte var7 = (byte)((var0.is(var2)) ? 1 : 0);
            if (var7 != (267252116 ^ var23)) {
               var23 = 1103542340 ^ var23;
               return Items.WATER_BUCKET;
            }

            var23 = pibjrsaxkxrazqcz(var23, 776492979);
            Block var19 = Blocks.LAVA;
            byte var9 = (byte)((var0.is(var19)) ? 1 : 0);
            if (var9 != (564504103 ^ var23)) {
               var23 = 995198080 ^ var23;
               return Items.LAVA_BUCKET;
            }

            var23 = 744507080 ^ var23;
            Block var12 = var0.getBlock();
            Item var13 = var12.asItem();
            if (var13 != null) {
               var23 = 1861839438 ^ var23;
               Item var20 = Items.AIR;
               if (var13 != var20) {
                  var23 = pibjrsaxkxrazqcz(var23, 508569099);
                  var23 = 1184645580 ^ var23;
                  return var13;
               }

               var23 = 548443327 ^ var23;
            } else {
               var23 = 1313472241 ^ var23;
            }

            Object var18 = null;
            var23 = pibjrsaxkxrazqcz(var23, 2021454712);
            return (Item)var18;
         }

         var23 = 2126061546 ^ var23;
      } else {
         var23 = 681686857 ^ var23;
      }

      return null;
   }

   public static boolean isBucketFluid(BlockState var0) {
      int var13;
      var13 = 492159147 ^ 922669719 ^ 1256530484;
      var13 = 2097730355 ^ var13;
      label38:
      if (var0 != null) {
         var13 = 215066502 ^ var13;
         Block var2 = Blocks.WATER;
         byte var4 = (byte)((var0.is(var2)) ? 1 : 0);
         if (var4 == (278348989 ^ var13)) {
            var13 = 812042695 ^ var13;
            Block var8 = Blocks.LAVA;
            byte var6 = (byte)((var0.is(var8)) ? 1 : 0);
            if (var6 == (552701306 ^ var13)) {
               var13 = pibjrsaxkxrazqcz(var13, 10084439);
               break label38;
            }

            var13 = 677700673 ^ var13;
         } else {
            label32:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
                  case 2426297:
                     var13 ^= 402795910;
                     break label32;
                  case 261791284:
                     break;
                  case 471171430:
                     break label32;
                  case 1942520908:
                  default:
                     throw new RuntimeException();
               }
            }
         }

         byte var18 = (byte)(144009530 ^ var13);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
               case 10580855:
                  var13 = 1954237988 ^ var13;
                  return (var18 != 0);
               case 444328520:
                  return (var18 != 0);
               case 1547732560:
                  break;
               case 1613254842:
               default:
                  throw new RuntimeException();
            }
         }
      } else {
         var13 = 1009683990 ^ var13;
      }

      byte var7 = (byte)(543714605 ^ var13);
      var13 = 1552304690 ^ var13;
      return (var7 != 0);
   }

   public static Map<Item, Integer> countInventory(LocalPlayer var0) {
      int var30 = 412251435 ^ 1867726410 ^ 1256530484;
      var30 = 1522754545 ^ var30;
      LinkedHashMap var1 = new LinkedHashMap();
      LinkedHashMap var4 = var1;
      if (var0 == null) {
         var30 = 1790029320 ^ var30;
         return var1;
      } else {
         var30 = pibjrsaxkxrazqcz(var30, 484983720);
         Inventory var11 = var0.getInventory();
         Inventory var5 = var11;
         byte var12 = (byte)(2064599308 ^ var30);
         int var6 = var12;
         var30 = 1814120380 ^ var30;

         while (true) {
            int var22 = var5.getContainerSize();
            if (var6 >= var22) {
               var30 = 1120791352 ^ var30;
               return var4;
            }

            var30 = 902139232 ^ var30;
            ItemStack var16 = var5.getItem(var6);
            byte var18 = (byte)((var16.isEmpty()) ? 1 : 0);
            if (var18 != (585860048 ^ var30)) {
               var30 = 1583323681 ^ var30;
               var30 = 221922364 ^ var30;
            } else {
               var30 = pibjrsaxkxrazqcz(var30, 1608146010);
               Item var25 = var16.getItem();
               int var26 = var16.getCount();
               Integer var27 = var26;
               BiFunction<Integer, Integer, Integer> var3 = Integer::sum;
               Object var20 = var4.merge(var25, var27, var3);
               var30 = 213877319 ^ var30;
            }

            var6 += 1905155532 ^ var30;
            var30 = pibjrsaxkxrazqcz(var30, 1721783165);
         }
      }
   }

   static {
      int var3 = new Random(8549368671956249563L).nextInt();
      n1G3WKmI4m = -1296923553 ^ var3;
   }

   public static String iltfptybnl(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] kzamsptnzxabyyf() {
      return new byte[]{
         80,
         14,
         50,
         49,
         39,
         126,
         88,
         75,
         60,
         101,
         104,
         25,
         99,
         25,
         69,
         120,
         87,
         70,
         63,
         11,
         14,
         8,
         11,
         74,
         68,
         124,
         77,
         35,
         31,
         30,
         56,
         120,
         17,
         100,
         84,
         118,
         55,
         92,
         117,
         49,
         12,
         8,
         77,
         16,
         103,
         122,
         28,
         24,
         112,
         94,
         35,
         43,
         109,
         14,
         44,
         117,
         5,
         105,
         40,
         100,
         122,
         63,
         9,
         86,
         103,
         24,
         16,
         102,
         36,
         44,
         93,
         5,
         104,
         103,
         93,
         19,
         51,
         118,
         108,
         54,
         29,
         92,
         7,
         7,
         17,
         124,
         110,
         7,
         126,
         21,
         40,
         123,
         109,
         36,
         45,
         74,
         72,
         73,
         2,
         104,
         40,
         85,
         74,
         36,
         32,
         50,
         120,
         112,
         122
      };
   }

   private static int pibjrsaxkxrazqcz(int var0, int var1) {
      return var0 ^ var1;
   }
}
