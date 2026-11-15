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
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.HitResult.Type;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class y {
   public static final y INSTANCE;
   private int previousSlot;
   private int tickCounter;
   private boolean waitingToSwapBack;
   private static int MDkK1gMd2u;
   private transient int mu73vRS7dl;
   private static byte[] ymlbjjqqly = sqsodefpecxcolt();

   private y() {
super();
      int var6 = 329488236 ^ 865085516;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var6)) {
            case 123866146:
            default:
               throw new RuntimeException();
            case 241459837:
               var6 = 786759291 ^ var6;
            case 729931149:
               var6 = 414046398 ^ 5513628 ^ Integer.parseInt("372160633");
               this.mu73vRS7dl = 1251235212 ^ MDkK1gMd2u;
               var6 = 1029760424 ^ var6;
               byte var2 = -1;
               this.previousSlot = var2;
               return;
            case 767125992:
         }
      }
   }

   public void tick(Minecraft var1) {
      int var99 = 840146306 ^ 71363317 ^ 925228019;
      var99 = 140545760 ^ var99;
      byte var2 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var2 == (152445540 ^ var99)) {
         var99 = 1656068025 ^ var99;
         this.resetState();
      } else {
         var99 = 1622814006 ^ var99;
         x var10 = x.INSTANCE;
         v var12 = var10.shieldBreaker;
         byte var13 = (byte)((var12.qo()) ? 1 : 0);
         if (var13 == (1772883794 ^ var99)) {
            var99 = 213251353 ^ var99;
            this.resetState();
         } else {
            var99 = 120636266 ^ var99;
            LocalPlayer var15 = var1.player;
            if (var15 == null) {
               var99 = lsjqlwudcfxdkixg(var99, 1595693449);
            } else {
               var99 = 1333291322 ^ var99;
               MultiPlayerGameMode var17 = var1.gameMode;
               if (var17 != null) {
                  var99 = 1168528888 ^ var99;
                  ClientLevel var19 = var1.level;
                  if (var19 == null) {
                     var99 = 1438803275 ^ var99;
                  } else {
                     var99 = lsjqlwudcfxdkixg(var99, 1481364388);
                     Screen var21 = var1.screen;
                     if (var21 != null) {
                        var99 = 1390043128 ^ var99;
                     } else {
                        var99 = 1817163980 ^ var99;
                        com.wimpyclient.g.g var22 = com.wimpyclient.g.g.INSTANCE;
                        byte var23 = (byte)((var22.isOpen()) ? 1 : 0);
                        if (var23 != (1346804626 ^ var99)) {
                           var99 = 1050011444 ^ var99;
                        } else {
                           var99 = lsjqlwudcfxdkixg(var99, 993949393);
                           LocalPlayer var25 = var1.player;
                           byte var27 = (byte)((this.waitingToSwapBack) ? 1 : 0);
                           if (var27 != (1803087171 ^ var99)) {
                              var99 = 1107550853 ^ var99;
                              int var73 = this.tickCounter;
                              byte var3 = (byte)(695930823 ^ var99);
                              int var74 = var73 + var3;
                              this.tickCounter = var74;
                              byte var29 = (byte)(695930823 ^ var99);
                              int var76 = var10.shieldBreakerSwitchDelayMs;
                              byte var93 = (byte)(695930868 ^ var99);
                              int var77 = var76 / var93;
                              int var30 = Math.max(var29, var77);
                              int var32 = this.tickCounter;
                              if (var32 >= var30) {
                                 var99 = 1202603659 ^ var99;
                                 int var34 = this.previousSlot;
                                 if (var34 >= (1859471693 ^ var99)) {
                                    var99 = 1664847367 ^ var99;
                                    Inventory var36 = var25.getInventory();
                                    int var80 = this.previousSlot;
                                    var36.setSelectedSlot(var80);
                                    this.resetState();
                                    var99 = 1974935777 ^ var99;
                                 } else {
                                    var99 = lsjqlwudcfxdkixg(var99, 378318566);
                                 }
                              } else {
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                                       case 6178804:
                                          var99 = 1361242221 ^ var99;
                                          return;
                                       case 186696506:
                                          return;
                                       case 1848999993:
                                          break;
                                       case 1912739120:
                                       default:
                                          throw new IllegalStateException();
                                    }
                                 }
                              }
                           } else {
                              var99 = lsjqlwudcfxdkixg(var99, 1048208380);
                              HitResult var39 = var1.hitResult;
                              if (var39 == null) {
                                 var99 = lsjqlwudcfxdkixg(var99, 1434670376);
                              } else {
                                 var99 = 507096320 ^ var99;
                                 Type var42 = var39.getType();
                                 Type var81 = Type.ENTITY;
                                 if (var42 != var81) {
                                    var99 = 1270544424 ^ var99;
                                 } else {
                                    var99 = 1427594206 ^ var99;
                                    EntityHitResult var44 = (EntityHitResult)var39;
                                    Entity var45 = var44.getEntity();
                                    byte var47 = (byte)((var45 instanceof Player) ? 1 : 0);
                                    if (var47 == (506230881 ^ var99)) {
                                       var99 = 528161584 ^ var99;
                                    } else {
                                       var99 = 1230829584 ^ var99;
                                       Player var49 = (Player)var45;
                                       byte var51 = (byte)((var49 instanceof LocalPlayer) ? 1 : 0);
                                       if (var51 != (1466990705 ^ var99)) {
                                          var99 = 1445454624 ^ var99;
                                       } else {
                                          var99 = lsjqlwudcfxdkixg(var99, 1673026515);
                                          byte var53 = (byte)((var49.isBlocking()) ? 1 : 0);
                                          if (var53 == (885578658 ^ var99)) {
                                             var99 = 560608366 ^ var99;
                                          } else {
                                             label120:
                                             while (true) {
                                                switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                                                   case 105192769:
                                                      var99 ^= 580904584;
                                                      break label120;
                                                   case 683780367:
                                                   default:
                                                      throw new IllegalStateException();
                                                   case 976114485:
                                                      break label120;
                                                   case 2071180275:
                                                }
                                             }

                                             ItemStack var55 = var25.getMainHandItem();
                                             TagKey var82 = ItemTags.AXES;
                                             byte var57 = (byte)((var55.is(var82)) ? 1 : 0);
                                             if (var57 != (374816042 ^ var99)) {
                                                var99 = 756031654 ^ var99;
                                             } else {
                                                label112:
                                                while (true) {
                                                   switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                                                      case 189337814:
                                                         var99 ^= 814089025;
                                                         break label112;
                                                      case 1145979158:
                                                         break;
                                                      case 1199354192:
                                                      default:
                                                         throw new IllegalStateException();
                                                      case 2005831945:
                                                         break label112;
                                                   }
                                                }

                                                boolean var84 = var10.shieldBreakerBestAxe;
                                                int var59 = findAxeSlot(var25, var84);
                                                if (var59 < (651247211 ^ var99)) {
                                                   var99 = 1232683694 ^ var99;
                                                } else {
                                                   var99 = lsjqlwudcfxdkixg(var99, 1997849284);
                                                   Inventory var86 = var25.getInventory();
                                                   int var87 = var86.getSelectedSlot();
                                                   this.previousSlot = var87;
                                                   Inventory var63 = var25.getInventory();
                                                   var63.setSelectedSlot(var59);
                                                   boolean var65 = com.wimpyclient.p.h.attackNoPrediction(var1, var25, var49);
                                                   byte var67 = (byte)((var10.shieldBreakerSwitchBack) ? 1 : 0);
                                                   if (var67 != (1371929775 ^ var99)) {
                                                      var99 = 78360381 ^ var99;
                                                      byte var90 = (byte)(1433293715 ^ var99);
                                                      this.waitingToSwapBack = (var90 != 0);
                                                      byte var91 = (byte)(1433293714 ^ var99);
                                                      this.tickCounter = var91;
                                                      var99 = 457088737 ^ var99;
                                                   } else {
                                                      label104:
                                                      while (true) {
                                                         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                                                            case 20954554:
                                                               break;
                                                            case 242206806:
                                                               var99 ^= 665531963;
                                                            case 658773942:
                                                               break label104;
                                                            case 834158158:
                                                            default:
                                                               throw new IllegalStateException();
                                                         }
                                                      }

                                                      byte var92 = (byte)(-1986972309 ^ var99);
                                                      this.previousSlot = var92;
                                                      var99 = 943589351 ^ var99;
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               } else {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                        case 19055253:
                           return;
                        case 27975255:
                           var99 = 275001523 ^ var99;
                           return;
                        case 735488009:
                           break;
                        case 1121242655:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               }
            }
         }
      }
   }

   private static int findAxeSlot(LocalPlayer var0, boolean var1) {
      int var43 = 1632031040 ^ 1688423825 ^ 2108788351;
      var43 = 278273296 ^ var43;
      if (var1 == ((1757548478 ^ var43) != 0)) {
         var43 = 1378878449 ^ var43;
         byte var9 = (byte)(988941391 ^ var43);
         int var4 = var9;
         var43 = 1975858372 ^ var43;

         while (true) {
            byte var3 = (byte)(1329019010 ^ var43);
            if (var4 >= var3) {
               var43 = lsjqlwudcfxdkixg(var43, 96074157);
               return (byte)(-1250869543 ^ var43);
            }

            var43 = 1117151771 ^ var43;
            Inventory var13 = var0.getInventory();
            ItemStack var14 = var13.getItem(var4);
            TagKey var35 = ItemTags.AXES;
            byte var15 = (byte)((var14.is(var35)) ? 1 : 0);
            if (var15 != (228678288 ^ var43)) {
               var43 = 626174827 ^ var43;
               return var4;
            }

            label40:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var43)) {
                  case 174625494:
                     var43 ^= 1012829753;
                  case 216045639:
                     break label40;
                  case 765693714:
                  default:
                     throw new IllegalStateException();
                  case 1477280078:
               }
            }

            var4 += 838849704 ^ var43;
            var43 = lsjqlwudcfxdkixg(var43, 2127096866);
         }
      } else {
         var43 = 1082327693 ^ var43;
         byte var17 = (byte)(-675351860 ^ var43);
         int var40 = var17;
         float var18 = -1.0F;
         float var5 = var18;
         byte var19 = (byte)(675351859 ^ var43);
         int var6 = var19;
         var43 = 866558199 ^ var43;

         while (true) {
            byte var36 = (byte)(468168141 ^ var43);
            if (var6 >= var36) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var43)) {
                     case 101776204:
                        var43 = 394143558 ^ var43;
                        return var40;
                     case 115975755:
                     default:
                        throw new IllegalStateException();
                     case 1368065264:
                        break;
                     case 1451496445:
                        return var40;
                  }
               }
            }

            var43 = 233378602 ^ var43;
            Inventory var23 = var0.getInventory();
            ItemStack var24 = var23.getItem(var6);
            TagKey var38 = ItemTags.AXES;
            byte var26 = (byte)((var24.is(var38)) ? 1 : 0);
            if (var26 == (370065134 ^ var43)) {
               var43 = 803415166 ^ var43;
               var43 = 152968212 ^ var43;
            } else {
               label65:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var43)) {
                     case 89911861:
                     default:
                        throw new IllegalStateException();
                     case 180127715:
                        var43 ^= 1853162129;
                        break label65;
                     case 402787874:
                        break;
                     case 1543022886:
                        break label65;
                  }
               }

               Item var28 = var24.getItem();
               float var29 = axeTier(var28);
               float var57;
               int var31 = (var57 = var29 - var5) == 0.0F ? 0 : (var57 < 0.0F ? -1 : 1);
               if (var31 > (2021375103 ^ var43)) {
                  var43 = 2080730694 ^ var43;
                  var5 = var29;
                  var40 = var6;
                  var43 = 881677501 ^ var43;
               } else {
                  var43 = 1216887547 ^ var43;
               }
            }

            var6 += 821266053 ^ var43;
            var43 = 722742080 ^ var43;
         }
      }
   }

   private static float axeTier(Item var0) {
      int var25 = 2119248601 ^ 1787589301 ^ 2108788351;
      var25 = 1068716628 ^ var25;
      Item var2 = Items.NETHERITE_AXE;
      if (var0 == var2) {
         var25 = 1160136692 ^ var25;
         return 6.0F;
      } else {
         var25 = lsjqlwudcfxdkixg(var25, 1463206768);
         Item var17 = Items.DIAMOND_AXE;
         if (var0 == var17) {
            var25 = 299067783 ^ var25;
            return 5.0F;
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                  case 30061354:
                     var25 ^= 925506242;
                  case 317608028:
                     Item var18 = Items.IRON_AXE;
                     if (var0 == var18) {
                        var25 = 1090691250 ^ var25;
                        return 4.0F;
                     }

                     var25 = lsjqlwudcfxdkixg(var25, 236819602);
                     Item var19 = Items.COPPER_AXE;
                     if (var0 == var19) {
                        var25 = 1984728424 ^ var25;
                        return 3.5F;
                     }

                     label55:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                           case 238001897:
                              var25 ^= 1395924453;
                              break label55;
                           case 253866908:
                           default:
                              throw new RuntimeException(new IOException());
                           case 949410924:
                              break label55;
                           case 1807326311:
                        }
                     }

                     Item var20 = Items.GOLDEN_AXE;
                     if (var0 == var20) {
                        var25 = 1753371996 ^ var25;
                        return 3.0F;
                     }

                     label47:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                           case 18255953:
                              var25 ^= 1922051740;
                              break label47;
                           case 412353171:
                           default:
                              throw new RuntimeException(new IOException());
                           case 761696537:
                              break;
                           case 2021784408:
                              break label47;
                        }
                     }

                     Item var21 = Items.STONE_AXE;
                     if (var0 == var21) {
                        var25 = 230665197 ^ var25;
                        return 2.0F;
                     }

                     var25 = 1938568607 ^ var25;
                     Item var22 = Items.WOODEN_AXE;
                     if (var0 == var22) {
                        var25 = 704303405 ^ var25;
                        return 1.0F;
                     }

                     var25 = 1213091669 ^ var25;
                     return 0.0F;
                  case 1477087602:
                  default:
                     throw new RuntimeException(new IOException());
                  case 2012656928:
               }
            }
         }
      }
   }

   private void resetState() {
      int var9 = 1616682509 ^ 1207638336 ^ 925228019;
      var9 = 31883342 ^ var9;
      byte var2 = (byte)(-291822833 ^ var9);
      this.previousSlot = var2;
      byte var5 = (byte)(291822832 ^ var9);
      this.tickCounter = var5;
      byte var6 = (byte)(291822832 ^ var9);
      this.waitingToSwapBack = (var6 != 0);
   }

   static {
      int var6 = 1677953868 ^ 1740121355 ^ Integer.parseInt("372160633");
      int var3 = new Random(-2905634457990642186L).nextInt();
      MDkK1gMd2u = -1105981292 ^ var3;
      var6 = 692927236 ^ var6;
      y var0 = new y();
      INSTANCE = var0;
   }

   public static String lkyhscebef(byte[] var0, int var1) {
      String var10 = Integer.toString(var1);
      byte[] var11 = var10.getBytes();
      byte[] var8 = var11;
      byte var12 = 0;
      int var9 = var12;

      while (true) {
         int var17 = var0.length;
         if (var9 >= var17) {
            Charset var5 = StandardCharsets.UTF_16;
            return new String(var0, var5);
         }

         byte var20 = var0[var9];
         int var33 = var8.length;
         int var30 = var9 % var33;
         byte var27 = var8[var30];
         int var21 = var20 ^ var27;
         byte var22 = (byte)var21;
         var0[var9] = var22;
         byte var23 = var0[var9];
         byte[] var28 = ymlbjjqqly;
         byte[] var34 = ymlbjjqqly;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] sqsodefpecxcolt() {
      return new byte[]{65, 88, 62, 72, 51, 101, 31, 55, 85, 60, 45, 25, 92, 50, 7, 70, 8, 68, 72};
   }

   private static int lsjqlwudcfxdkixg(int var0, int var1) {
      return var0 ^ var1;
   }
}
