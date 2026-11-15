package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.Equippable;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class l {
   public static final l INSTANCE;
   private int tickCounter;
   private boolean waitingForSwap;
   private boolean waitingForSwitchBack;
   private static int AwJHq8l83c;
   private transient int IXBOvzvDxl;

   private l() {
super();
      int var4 = 1350404204 ^ 2013656198;
      
      var4 = 1481264782 ^ var4;
      var4 = 1716038529 ^ 1648739737 ^ Integer.parseInt("1950309500");
      this.IXBOvzvDxl = 993979550 ^ AwJHq8l83c;
      var4 = quujxgttfbqwyaof(var4, 109001243);
   }

   public void tick(Minecraft var1) {
      int var68 = 1559938222 ^ 100928200 ^ 360987846;
      var68 = 810844885 ^ var68;
      byte var2 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var2 == (2133749877 ^ var68)) {
         var68 = 1660507021 ^ var68;
         this.resetState();
      } else {
         v var10;
         label85:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
               case 107579084:
                  var68 ^= 1512661415;
               case 1092632639:
                  x var8 = x.INSTANCE;
                  var10 = var8.elytraSwap;
                  byte var12 = (byte)((var10.qo()) ? 1 : 0);
                  if (var12 == (621220306 ^ var68)) {
                     var68 = 1814933923 ^ var68;
                     this.resetState();
                     return;
                  }

                  var68 = quujxgttfbqwyaof(var68, 103667137);
                  LocalPlayer var14 = var1.player;
                  if (var14 == null) {
                     var68 = 346798992 ^ var68;
                     return;
                  }

                  var68 = 512595971 ^ var68;
                  MultiPlayerGameMode var16 = var1.gameMode;
                  if (var16 == null) {
                     var68 = 170271635 ^ var68;
                     return;
                  }

                  var68 = quujxgttfbqwyaof(var68, 1114579694);
                  Screen var18 = var1.screen;
                  if (var18 != null) {
                     var68 = quujxgttfbqwyaof(var68, 1262298891);
                     break label85;
                  }

                  var68 = 1961502640 ^ var68;
                  com.wimpyclient.g.g var19 = com.wimpyclient.g.g.INSTANCE;
                  byte var20 = (byte)((var19.isOpen()) ? 1 : 0);
                  if (var20 != (186800462 ^ var68)) {
                     var68 = 1071055035 ^ var68;
                     break label85;
                  }

                  var68 = quujxgttfbqwyaof(var68, 494421409);
                  byte var22 = (byte)((this.waitingForSwap) ? 1 : 0);
                  if (var22 != (375004399 ^ var68)) {
                     var68 = 1599250735 ^ var68;
                     boolean var37 = var10.pollRisingEdge();
                     int var57 = this.tickCounter;
                     byte var65 = (byte)(1225309633 ^ var68);
                     int var58 = var57 + var65;
                     this.tickCounter = var58;
                     int var40 = this.tickCounter;
                     int var60 = var8.elytraSwapDelay;
                     if (var40 < var60) {
                        var68 = 263730867 ^ var68;
                        return;
                     }

                     var68 = 485875381 ^ var68;
                     this.performSwap(var1);
                     byte var62 = (byte)(1442669429 ^ var68);
                     this.waitingForSwap = (var62 != 0);
                     byte var44 = (byte)((var8.elytraSwapSwitchBack) ? 1 : 0);
                     if (var44 != (1442669429 ^ var68)) {
                        var68 = 388823674 ^ var68;
                        byte var63 = (byte)(1121032462 ^ var68);
                        this.waitingForSwitchBack = (var63 != 0);
                        byte var64 = (byte)(1121032463 ^ var68);
                        this.tickCounter = var64;
                        var68 = 73470588 ^ var68;
                        return;
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
                           case 22442915:
                              return;
                           case 110798159:
                              var68 = 323872774 ^ var68;
                              return;
                           case 623083508:
                              break;
                           case 1370207991:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }

                  var68 = 1046612183 ^ var68;
                  byte var24 = (byte)((this.waitingForSwitchBack) ? 1 : 0);
                  if (var24 == (674763832 ^ var68)) {
                     var68 = 526173705 ^ var68;
                     byte var26 = (byte)((var10.pollRisingEdge()) ? 1 : 0);
                     if (var26 != (929354289 ^ var68)) {
                        var68 = 953086263 ^ var68;
                        byte var3 = (byte)(262808327 ^ var68);
                        this.waitingForSwap = (var3 != 0);
                        byte var50 = (byte)(262808326 ^ var68);
                        this.tickCounter = var50;
                        var68 = 198413028 ^ var68;
                     } else {
                        var68 = 857570259 ^ var68;
                     }

                     return;
                  }

                  var68 = 1806050705 ^ var68;
                  boolean var30 = var10.pollRisingEdge();
                  int var51 = this.tickCounter;
                  byte var4 = (byte)(1134440872 ^ var68);
                  int var52 = var51 + var4;
                  this.tickCounter = var52;
                  int var33 = this.tickCounter;
                  int var54 = var8.elytraSwapSwitchDelay;
                  if (var33 >= var54) {
                     var68 = 750845153 ^ var68;
                     this.performSwap(var1);
                     byte var56 = (byte)(1868483912 ^ var68);
                     this.waitingForSwitchBack = (var56 != 0);
                     var68 = 542873194 ^ var68;
                     return;
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
                        case 50512809:
                           var68 = 211511947 ^ var68;
                           return;
                        case 381324600:
                           break;
                        case 786279397:
                        default:
                           throw new RuntimeException(new IOException());
                        case 2090030951:
                           return;
                     }
                  }
               case 821380121:
                  break;
               case 1756889724:
               default:
                  throw new RuntimeException(new IOException());
            }
         }

         boolean var48 = var10.pollRisingEdge();
      }
   }

   private void performSwap(Minecraft var1) {
      int var110 = 352688101 ^ 1878379138 ^ 360987846;
      var110 = 1194957630 ^ var110;
      LocalPlayer var16 = var1.player;
      LocalPlayer var8 = var16;
      if (var16 != null) {
         var110 = 223699031 ^ var110;
         MultiPlayerGameMode var19 = var1.gameMode;
         if (var19 != null) {
            var110 = 425465267 ^ var110;
            x var20 = x.INSTANCE;
            EquipmentSlot var3 = EquipmentSlot.CHEST;
            ItemStack var22 = var16.getItemBySlot(var3);
            Item var76 = Items.ELYTRA;
            byte var24 = (byte)((var22.is(var76)) ? 1 : 0);
            byte var25 = (byte)(-1011126140 ^ var110);
            int var12 = var25;
            if (var24 != (1011126139 ^ var110)) {
               var110 = 427590420 ^ var110;
               byte var62 = (byte)(624430191 ^ var110);
               int var105 = var62;
               var110 = 2092714625 ^ var110;

               while (true) {
                  byte var88 = (byte)(1501841098 ^ var110);
                  if (var105 >= var88) {
                     var110 = quujxgttfbqwyaof(var110, 391356408);
                     break;
                  }

                  var110 = 983753078 ^ var110;
                  Inventory var65 = var8.getInventory();
                  ItemStack var66 = var65.getItem(var105);
                  DataComponentType var90 = DataComponents.EQUIPPABLE;
                  Object var68 = var66.get(var90);
                  Equippable var69 = (Equippable)var68;
                  if (var69 == null) {
                     var110 = quujxgttfbqwyaof(var110, 1848722798);
                  } else {
                     var110 = 367785862 ^ var110;
                     EquipmentSlot var72 = var69.slot();
                     EquipmentSlot var91 = EquipmentSlot.CHEST;
                     if (var72 == var91) {
                        var110 = 1804025463 ^ var110;
                        Item var92 = Items.ELYTRA;
                        byte var74 = (byte)((var66.is(var92)) ? 1 : 0);
                        if (var74 == (491417193 ^ var110)) {
                           var110 = 1481464253 ^ var110;
                           var12 = var105;
                           var110 = quujxgttfbqwyaof(var110, 198241986);
                           break;
                        }

                        var110 = 274566303 ^ var110;
                     } else {
                        label132:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                              case 103661047:
                                 var110 ^= 2077930216;
                                 break label132;
                              case 115120631:
                                 break;
                              case 169030515:
                                 break label132;
                              case 896555675:
                              default:
                                 throw new IllegalStateException();
                           }
                        }
                     }
                  }

                  var105 += 219669239 ^ var110;
                  var110 = 1418961944 ^ var110;
               }

               label116:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 146963021:
                        var110 ^= 1951317261;
                        break label116;
                     case 561250979:
                     default:
                        throw new IllegalStateException();
                     case 908539611:
                        break;
                     case 1134467905:
                        break label116;
                  }
               }
            } else {
               label109:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 80013754:
                        var110 ^= 817470947;
                        break label109;
                     case 574354478:
                     default:
                        throw new IllegalStateException();
                     case 1750208302:
                        break label109;
                     case 2083610561:
                  }
               }

               byte var28 = (byte)((var20.elytraSwapPreferSlot) ? 1 : 0);
               if (var28 != (217911960 ^ var110)) {
                  var110 ^= 809836457;
                  int var30 = var20.elytraSwapSlot;
                  byte var77 = (byte)(1018694960 ^ var110);
                  int var31 = var30 - var77;
                  long var32 = var31;
                  byte var4 = (byte)(1018694961 ^ var110);
                  byte var5 = (byte)(1018694969 ^ var110);
                  int var34 = Math.clamp(var32, (int)var4, (int)var5);
                  Inventory var36 = var16.getInventory();
                  ItemStack var37 = var36.getItem(var34);
                  Item var79 = Items.ELYTRA;
                  byte var38 = (byte)((var37.is(var79)) ? 1 : 0);
                  if (var38 != (1018694961 ^ var110)) {
                     var110 = 1194625710 ^ var110;
                     var12 = var34;
                     var110 = 829265685 ^ var110;
                  } else {
                     label90:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                           case 94676278:
                              var110 ^= 1985551803;
                           case 151578996:
                              break label90;
                           case 283139430:
                           default:
                              throw new IllegalStateException();
                           case 754619999:
                        }
                     }
                  }
               } else {
                  label100:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                        case 153770235:
                           var110 ^= 1176240658;
                           break label100;
                        case 719350283:
                        default:
                           throw new IllegalStateException();
                        case 775401913:
                           break label100;
                        case 1653136624:
                     }
                  }
               }

               if (var12 < (1256263818 ^ var110)) {
                  var110 = 3064345 ^ var110;
                  byte var41 = (byte)(1255133843 ^ var110);
                  int var103 = var41;
                  var110 = 1687905373 ^ var110;

                  label79:
                  while (true) {
                     byte var80 = (byte)(777303786 ^ var110);
                     if (var103 >= var80) {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                              case 163843195:
                                 var110 ^= 349033173;
                              case 620963658:
                                 break label79;
                              case 1169384913:
                                 break;
                              case 1229242720:
                              default:
                                 throw new IllegalStateException();
                           }
                        }
                     }

                     var110 = 176411778 ^ var110;
                     Inventory var44 = var8.getInventory();
                     ItemStack var45 = var44.getItem(var103);
                     Item var82 = Items.ELYTRA;
                     byte var46 = (byte)((var45.is(var82)) ? 1 : 0);
                     if (var46 != (618095180 ^ var110)) {
                        var110 = 1214079217 ^ var110;
                        var12 = var103;
                        var110 = 1444112038 ^ var110;
                        break;
                     }

                     var110 = 1863625750 ^ var110;
                     var103 += 1271123547 ^ var110;
                     var110 = 1704425620 ^ var110;
                  }
               } else {
                  var110 = quujxgttfbqwyaof(var110, 1886942353);
               }
            }

            if (var12 < (983131163 ^ var110)) {
               var110 = 2111057931 ^ var110;
               return;
            }

            var110 = 422576835 ^ var110;
            byte var83 = (byte)(598304465 ^ var110);
            int var61;
            if (var12 >= var83) {
               var110 = 78437547 ^ var110;
               var61 = var12;
               var110 = 1480339305 ^ var110;
            } else {
               var110 = 529046036 ^ var110;
               byte var84 = (byte)(1008860392 ^ var110);
               var61 = var12 + var84;

               label66:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 75621866:
                        var110 ^= 1125673430;
                        break label66;
                     case 576716004:
                        break;
                     case 828906149:
                        break label66;
                     case 882595387:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }

            byte var51 = (byte)(2134480156 ^ var110);
            AbstractContainerMenu var53 = var8.containerMenu;
            int var54 = var53.containerId;
            MultiPlayerGameMode var56 = var1.gameMode;
            byte var96 = (byte)(2134480154 ^ var110);
            ClickType var6 = ClickType.PICKUP;
            var56.handleInventoryMouseClick(var54, var61, var96, var6, var8);
            MultiPlayerGameMode var58 = var1.gameMode;
            byte var97 = (byte)(2134480154 ^ var110);
            ClickType var99 = ClickType.PICKUP;
            var58.handleInventoryMouseClick(var54, var51, var97, var99, var8);
            MultiPlayerGameMode var60 = var1.gameMode;
            byte var98 = (byte)(2134480154 ^ var110);
            ClickType var100 = ClickType.PICKUP;
            var60.handleInventoryMouseClick(var54, var61, var98, var100, var8);
            return;
         }

         var110 = 1796409321 ^ var110;
      } else {
         var110 = 1715890110 ^ var110;
      }
   }

   private void resetState() {
      int var9 = 130465293 ^ 98312838 ^ 360987846;
      var9 = 1936684054 ^ var9;
      byte var2 = (byte)(1693570139 ^ var9);
      this.tickCounter = var2;
      byte var5 = (byte)(1693570139 ^ var9);
      this.waitingForSwap = (var5 != 0);
      byte var6 = (byte)(1693570139 ^ var9);
      this.waitingForSwitchBack = (var6 != 0);
   }

   static {
      int var6 = 2134980629 ^ 1529184612 ^ Integer.parseInt("1950309500");
      int var3 = new Random(8407973495340511532L).nextInt();
      AwJHq8l83c = -1135659800 ^ var3;
      var6 = 1579706729 ^ var6;
      l var0 = new l();
      INSTANCE = var0;
   }

   public static String kwocycdhkk(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] sctkwrsgfvjefme() {
      return new byte[]{
         104,
         54,
         90,
         72,
         117,
         114,
         3,
         107,
         40,
         127,
         57,
         111,
         73,
         106,
         19,
         107,
         118,
         124,
         42,
         26,
         94,
         31,
         33,
         124,
         69,
         50,
         31,
         7,
         108,
         113,
         25,
         105,
         27,
         1,
         48,
         121,
         53,
         27,
         110,
         46,
         126,
         37,
         126,
         122,
         123
      };
   }

   private static int quujxgttfbqwyaof(int var0, int var1) {
      return var1 ^ var0;
   }
}
