package com.wimpyclient.i;

import com.mojang.blaze3d.platform.Window;
import com.wimpyclient.auth.LicenseGate;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RespawnAnchorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.HitResult.Type;
import org.lwjgl.glfw.GLFW;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class c {
   public static final c INSTANCE;
   private int step;
   private int tickCounter;
   private BlockPos targetPos;
   private int previousSlot;
   private static int JDdFzmbMLl;
   private transient int VpACBGukzy;
   private static byte[] dsccdsaumd = lfyfxiasjlzdpyg();

   private c() {
super();
      int var6 = 142172949 ^ 1275517761;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var6)) {
            case 79114589:
               var6 = 1812835060 ^ var6;
            case 1290076801:
               var6 = 1040747333 ^ 1275103848 ^ Integer.parseInt("1517949837");
               this.VpACBGukzy = 1852955969 ^ JDdFzmbMLl;
               var6 = 1313153331 ^ var6;
               byte var2 = -1;
               this.previousSlot = var2;
               return;
            case 517667644:
            default:
               throw new RuntimeException();
            case 601913379:
         }
      }
   }

   public boolean isBusy() {
      int var6 = 108797854 ^ 2118198478 ^ 2023889873;
      var6 = 1028539346 ^ var6;
      int var2 = this.step;
      byte var3;
      if (var2 > (1037132627 ^ var6)) {
         var6 = 1636421852 ^ var6;
         var3 = (byte)(1549317006 ^ var6);
         var6 = rxybsbtudxcqafzv(var6, 583359421);
      } else {
         var6 = rxybsbtudxcqafzv(var6, 1078386279);
         var3 = (byte)(2107096372 ^ var6);
         var6 = 51008774 ^ var6;
      }

      return (var3 != 0);
   }

   public void abort() {
      int var4 = 785483863 ^ 904658233 ^ 2023889873;
      var4 = 1224629791 ^ var4;
      this.resetState();
   }

   public void tick(Minecraft var1) {
      int var95 = 1507976074 ^ 197331675 ^ 2023889873;
      var95 = 1603948036 ^ var95;
      byte var2 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var2 == (1964686468 ^ var95)) {
         var95 = 1662292405 ^ var95;
         this.resetState();
      } else {
         label125: {
            label152: {
               label120:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var95)) {
                     case 48478245:
                        var95 ^= 609967031;
                     case 2020231488:
                        x var12 = x.INSTANCE;
                        v var14 = var12.autoAnchor;
                        boolean var15 = var14.pollRisingEdge();
                        v var17 = var12.autoAnchor;
                        byte var18 = (byte)((var17.qo()) ? 1 : 0);
                        if (var18 == (1363273523 ^ var95)) {
                           var95 = 401648072 ^ var95;
                           this.resetState();
                           return;
                        }

                        label117:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var95)) {
                              case 225443507:
                                 var95 ^= 1599071108;
                              case 655415988:
                                 break label117;
                              case 1392550354:
                                 break;
                              case 1895393286:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }

                        LocalPlayer var21 = var1.player;
                        if (var21 == null) {
                           var95 = rxybsbtudxcqafzv(var95, 1758796869);
                           break label125;
                        }

                        var95 = 519516574 ^ var95;
                        MultiPlayerGameMode var23 = var1.gameMode;
                        if (var23 == null) {
                           var95 = rxybsbtudxcqafzv(var95, 1981951451);
                           break label125;
                        }

                        var95 = 1144328551 ^ var95;
                        ClientLevel var25 = var1.level;
                        if (var25 == null) {
                           var95 = 840383676 ^ var95;
                           break label125;
                        }

                        label109:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var95)) {
                              case 72077979:
                                 var95 ^= 1812406428;
                              case 283718326:
                                 break label109;
                              case 345593004:
                                 break;
                              case 1191270906:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }

                        Screen var27 = var1.screen;
                        if (var27 != null) {
                           var95 = rxybsbtudxcqafzv(var95, 1209221337);
                           break label152;
                        }

                        var95 = 1711924827 ^ var95;
                        com.wimpyclient.g.g var28 = com.wimpyclient.g.g.INSTANCE;
                        byte var29 = (byte)((var28.isOpen()) ? 1 : 0);
                        if (var29 != (1589830281 ^ var95)) {
                           var95 = 773498498 ^ var95;
                           break label152;
                        }

                        var95 = 169182523 ^ var95;
                        q var31 = q.INSTANCE;
                        byte var32 = (byte)((var31.isActive()) ? 1 : 0);
                        if (var32 != (1423402930 ^ var95)) {
                           var95 = rxybsbtudxcqafzv(var95, 1862655397);
                           break label120;
                        }

                        var95 = 25910368 ^ var95;
                        r var33 = r.INSTANCE;
                        byte var34 = (byte)((var33.isActive()) ? 1 : 0);
                        if (var34 != (1432107986 ^ var95)) {
                           var95 = 1854833093 ^ var95;
                           break label120;
                        }

                        var95 = 1848676632 ^ var95;
                        int var36 = this.step;
                        if (var36 > (996977354 ^ var95)) {
                           var95 = 766243108 ^ var95;
                           Options var70 = var1.options;
                           KeyMapping var71 = var70.keyUse;
                           byte var89 = (byte)(382163950 ^ var95);
                           var71.setDown((var89 != 0));
                           this.processStep(var1, var12);
                           return;
                        }

                        var95 = rxybsbtudxcqafzv(var95, 1835489268);
                        Window var38 = var1.getWindow();
                        long var39 = var38.handle();
                        byte var4 = (byte)(1443626303 ^ var95);
                        int var43 = GLFW.glfwGetMouseButton(var39, var4);
                        byte var3 = (byte)(1443626303 ^ var95);
                        if (var43 != var3) {
                           var95 = 633319854 ^ var95;
                           return;
                        }

                        var95 = rxybsbtudxcqafzv(var95, 1873201453);
                        HitResult var45 = var1.hitResult;
                        byte var47 = (byte)((var45 instanceof BlockHitResult) ? 1 : 0);
                        if (var47 != (967652371 ^ var95)) {
                           var95 = 579992121 ^ var95;
                           BlockHitResult var49 = (BlockHitResult)var45;
                           Type var51 = var49.getType();
                           Type var75 = Type.BLOCK;
                           if (var51 != var75) {
                              var95 = 1938110100 ^ var95;
                              return;
                           }

                           var95 = 633019930 ^ var95;
                           BlockPos var53 = var49.getBlockPos();
                           ClientLevel var55 = var1.level;
                           BlockState var56 = var55.getBlockState(var53);
                           Block var77 = Blocks.RESPAWN_ANCHOR;
                           byte var57 = (byte)((var56.is(var77)) ? 1 : 0);
                           if (var57 == (1049088048 ^ var95)) {
                              var95 = 1279382819 ^ var95;
                              return;
                           }

                           label85:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var95)) {
                                 case 153558490:
                                    var95 ^= 1612585745;
                                    break label85;
                                 case 1043730382:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1701439066:
                                    break label85;
                                 case 2089870598:
                              }
                           }

                           BlockPos var79 = var53.immutable();
                           this.targetPos = var79;
                           LocalPlayer var81 = var1.player;
                           Inventory var82 = var81.getInventory();
                           int var83 = var82.getSelectedSlot();
                           this.previousSlot = var83;
                           ClientLevel var61 = var1.level;
                           BlockState var62 = var61.getBlockState(var53);
                           int var63 = chargeOf(var62);
                           if (var63 <= (1587137313 ^ var95)) {
                              var95 = 1941432547 ^ var95;
                              byte var87 = (byte)(757998531 ^ var95);
                              this.step = var87;
                              byte var88 = (byte)(757998530 ^ var95);
                              this.tickCounter = var88;
                              var95 = rxybsbtudxcqafzv(var95, 1049869941);
                           } else {
                              var95 = rxybsbtudxcqafzv(var95, 760113441);
                              byte var85 = (byte)(1943511555 ^ var95);
                              this.step = var85;
                              byte var86 = (byte)(1943511552 ^ var95);
                              this.tickCounter = var86;
                              var95 = 1617575863 ^ var95;
                           }

                           return;
                        }

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var95)) {
                              case 264219977:
                                 var95 = 1360317613 ^ var95;
                                 return;
                              case 292478554:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 520818189:
                                 return;
                              case 1271967590:
                           }
                        }
                     case 1106197383:
                        break;
                     case 1288154452:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }

               this.resetState();
               return;
            }

            this.resetState();
            return;
         }

         this.resetState();
      }
   }

   private void processStep(Minecraft var1, x var2) {
      int var90 = 1736337192 ^ 413302240 ^ 2023889873;
      var90 = 1674765238 ^ var90;
      int var56 = this.tickCounter;
      byte var4 = (byte)(1689051822 ^ var90);
      int var57 = var56 + var4;
      this.tickCounter = var57;
      HitResult var9 = var1.hitResult;
      byte var11 = (byte)((var9 instanceof BlockHitResult) ? 1 : 0);
      BlockHitResult var12;
      if (var11 != (1689051823 ^ var90)) {
         var90 = 658578112 ^ var90;
         BlockHitResult var55 = (BlockHitResult)var9;
         var12 = var55;

         label135:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var90)) {
               case 60641978:
                  var90 ^= 645741156;
                  break label135;
               case 613728009:
                  break;
               case 1691483526:
                  break label135;
               case 2100128676:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      } else {
         var90 = 535333088 ^ var90;
         var12 = null;
         var90 = 517253188 ^ var90;
      }

      int var14 = this.step;
      switch (var14) {
         case 1:
            label77:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var90)) {
                  case 80220773:
                     var90 ^= 1905534105;
                  case 1146033772:
                     break label77;
                  case 1419573599:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1645587861:
               }
            }

            int var48 = this.tickCounter;
            int var83 = var2.autoAnchorSwitchDelay;
            if (var48 >= var83) {
               var90 = 20459224 ^ var90;
               Item var84 = Items.GLOWSTONE;
               boolean var50 = selectItem(var1, var84);
               byte var85 = (byte)(356304968 ^ var90);
               this.step = var85;
               byte var86 = (byte)(356304970 ^ var90);
               this.tickCounter = var86;
               var90 = 2079279917 ^ var90;
            } else {
               var90 = 2060936693 ^ var90;
            }
            break;
         case 2:
            label126:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var90)) {
                  case 28624663:
                     break label126;
                  case 80220773:
                     var90 ^= 317214227;
                     break label126;
                  case 1082410998:
                     break;
                  case 1975403824:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }

            int var20 = this.tickCounter;
            int var63 = var2.autoAnchorGlowstoneDelay;
            if (var20 >= var63) {
               var90 = 1734082348 ^ var90;
               if (var12 != null) {
                  var90 = 1660728136 ^ var90;
                  BlockPos var23 = this.targetPos;
                  BlockPos var65 = var12.getBlockPos();
                  byte var24 = (byte)((var23.equals(var65)) ? 1 : 0);
                  if (var24 != (1927266428 ^ var90)) {
                     var90 = 281115050 ^ var90;
                     interact(var1, var12);
                     var90 = 1552817656 ^ var90;
                  } else {
                     var90 = rxybsbtudxcqafzv(var90, 1280271442);
                  }
               } else {
                  var90 = rxybsbtudxcqafzv(var90, 783537946);
               }

               byte var67 = (byte)(1049666605 ^ var90);
               this.step = var67;
               byte var68 = (byte)(1049666606 ^ var90);
               this.tickCounter = var68;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var90)) {
                     case 154665097:
                        var90 = 1346578249 ^ var90;
                        return;
                     case 1753562095:
                        break;
                     case 1783464002:
                     default:
                        throw new RuntimeException(new IOException());
                     case 2073378544:
                        return;
                  }
               }
            } else {
               var90 = rxybsbtudxcqafzv(var90, 430641023);
               break;
            }
         case 3:
            label70:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var90)) {
                  case 50280063:
                  default:
                     throw new RuntimeException(new IOException());
                  case 80220773:
                     var90 ^= 1118076994;
                     break label70;
                  case 336727009:
                     break;
                  case 1769898331:
                     break label70;
               }
            }

            int var43 = this.tickCounter;
            int var76 = var2.autoAnchorExplodeDelay;
            if (var43 >= var76) {
               var90 = 1983840309 ^ var90;
               int var78 = var2.autoAnchorTotemSlot;
               byte var87 = (byte)(1359692413 ^ var90);
               int var79 = var78 - var87;
               selectSlot(var1, var79);
               byte var80 = (byte)(1359692408 ^ var90);
               this.step = var80;
               byte var81 = (byte)(1359692412 ^ var90);
               this.tickCounter = var81;
               var90 = rxybsbtudxcqafzv(var90, 1071169819);
            } else {
               var90 = rxybsbtudxcqafzv(var90, 1239925038);
            }
            break;
         case 4:
            var90 = rxybsbtudxcqafzv(var90, 455208071);
            int var29 = this.tickCounter;
            byte var69 = (byte)(2125541005 ^ var90);
            if (var29 >= var69) {
               var90 = 751069621 ^ var90;
               if (var12 == null) {
                  var90 = 889960469 ^ var90;
               } else {
                  var90 = 695081338 ^ var90;
                  BlockPos var32 = this.targetPos;
                  BlockPos var71 = var12.getBlockPos();
                  byte var33 = (byte)((var32.equals(var71)) ? 1 : 0);
                  if (var33 != (2065391171 ^ var90)) {
                     var90 = 1215913642 ^ var90;
                     interact(var1, var12);
                     var90 = 1411186629 ^ var90;
                  } else {
                     label108:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var90)) {
                           case 47054453:
                           default:
                              throw new RuntimeException(new IOException());
                           case 243629498:
                              var90 ^= 476422511;
                              break label108;
                           case 978627415:
                              break;
                           case 1321999338:
                              break label108;
                        }
                     }
                  }
               }

               byte var36 = (byte)((var2.autoAnchorRestoreSlot) ? 1 : 0);
               if (var36 != (1736376108 ^ var90)) {
                  var90 = 32927704 ^ var90;
                  int var38 = this.previousSlot;
                  if (var38 >= (1720226036 ^ var90)) {
                     var90 = 1579257241 ^ var90;
                     byte var73 = (byte)(950607208 ^ var90);
                     this.step = var73;
                     byte var74 = (byte)(950607213 ^ var90);
                     this.tickCounter = var74;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var90)) {
                           case 231182762:
                              var90 = 1450876426 ^ var90;
                              return;
                           case 320201138:
                           default:
                              throw new RuntimeException(new IOException());
                           case 441321453:
                              return;
                           case 653782699:
                        }
                     }
                  }

                  var90 = 673435625 ^ var90;
               } else {
                  var90 = 701866033 ^ var90;
               }

               this.resetState();
               var90 = 544791674 ^ var90;
            } else {
               var90 = 274902507 ^ var90;
            }
            break;
         case 5:
            label84:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var90)) {
                  case 80220773:
                     var90 ^= 317819584;
                     break label84;
                  case 330061884:
                     break;
                  case 751347132:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1617414315:
                     break label84;
               }
            }

            int var16 = this.tickCounter;
            int var59 = var2.autoAnchorSwitchBackDelay;
            if (var16 >= var59) {
               var90 = 1201694987 ^ var90;
               int var61 = this.previousSlot;
               selectSlot(var1, var61);
               this.resetState();
               var90 = 1578279591 ^ var90;
            } else {
               var90 = 431147948 ^ var90;
            }
            break;
         default:
            var90 = rxybsbtudxcqafzv(var90, 1028430112);
            this.resetState();
            var90 = 907008076 ^ var90;
      }
   }

   private static int chargeOf(BlockState var0) {
      int var12 = 1428205360 ^ 2036933841 ^ 382977680;
      var12 = 644699411 ^ var12;
      IntegerProperty var2 = RespawnAnchorBlock.CHARGE;
      byte var3 = (byte)((var0.hasProperty(var2)) ? 1 : 0);
      if (var3 == (485955682 ^ var12)) {
         var12 = 877008539 ^ var12;
         return (byte)(682692345 ^ var12);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var12)) {
               case 36396966:
                  break;
               case 136225738:
                  var12 = 1922283601 ^ var12;
               case 1654109913:
                  IntegerProperty var9 = RespawnAnchorBlock.CHARGE;
                  Comparable var5 = var0.getValue(var9);
                  Integer var6 = (Integer)var5;
                  return var6;
               case 393267890:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private static void interact(Minecraft var0, BlockHitResult var1) {
      int var17 = 1589573368 ^ 1502350698 ^ 382977680;
      var17 = 87853474 ^ var17;
      MultiPlayerGameMode var7 = var0.gameMode;
      LocalPlayer var13 = var0.player;
      InteractionHand var4 = InteractionHand.MAIN_HAND;
      InteractionResult var8 = var7.useItemOn(var13, var4, var1);
      byte var10 = (byte)((var8.consumesAction()) ? 1 : 0);
      if (var10 != (350074016 ^ var17)) {
         var17 = 1876765296 ^ var17;
         LocalPlayer var12 = var0.player;
         InteractionHand var14 = InteractionHand.MAIN_HAND;
         var12.swing(var14);
         var17 = 730629216 ^ var17;
      } else {
         var17 = rxybsbtudxcqafzv(var17, 1146203664);
      }
   }

   private static boolean selectItem(Minecraft var0, Item var1) {
      int var29 = 499568162 ^ 1524670318 ^ 382977680;
      var29 = 1588389127 ^ var29;
      LocalPlayer var7 = var0.player;
      ItemStack var9 = var7.getMainHandItem();
      byte var10 = (byte)((var9.is(var1)) ? 1 : 0);
      if (var10 != (257520347 ^ var29)) {
         var29 = 1078554493 ^ var29;
         syncHeld(var0);
         return (((byte)(1326456231 ^ var29)) != 0);
      } else {
         var29 = rxybsbtudxcqafzv(var29, 1789996749);
         Inventory var14 = var7.getInventory();
         Inventory var5 = var14;
         byte var15 = (byte)(1709726742 ^ var29);
         int var6 = var15;
         var29 = 282108952 ^ var29;

         while (true) {
            int var23 = Inventory.getSelectionSize();
            if (var6 >= var23) {
               var29 = rxybsbtudxcqafzv(var29, 91399166);
               return (((byte)(1883921392 ^ var29)) != 0);
            }

            var29 = 1290004207 ^ var29;
            ItemStack var18 = var5.getItem(var6);
            byte var19 = (byte)((var18.is(var1)) ? 1 : 0);
            if (var19 != (970661601 ^ var29)) {
               var29 = 2097716768 ^ var29;
               selectSlot(var0, var6);
               return (((byte)(1154711744 ^ var29)) != 0);
            }

            var29 = rxybsbtudxcqafzv(var29, 961369694);
            var6 += 9849022 ^ var29;
            var29 = 1974382769 ^ var29;
         }
      }
   }

   private static void selectSlot(Minecraft var0, int var1) {
      int var12 = 1157657537 ^ 425767371 ^ 382977680;
      var12 = 1079216638 ^ var12;
      if (var1 >= (182488420 ^ var12)) {
         var12 = 383061864 ^ var12;
         int var3 = Inventory.getSelectionSize();
         if (var1 < var3) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var12)) {
                  case 111654850:
                     var12 = 847345057 ^ var12;
                  case 2003266786:
                     LocalPlayer var6 = var0.player;
                     Inventory var7 = var6.getInventory();
                     var7.setSelectedSlot(var1);
                     syncHeld(var0);
                     return;
                  case 196838123:
                  default:
                     throw new RuntimeException();
                  case 1180503642:
               }
            }
         }

         var12 = 924710254 ^ var12;
      } else {
         var12 = rxybsbtudxcqafzv(var12, 566819334);
      }
   }

   private static void syncHeld(Minecraft var0) {
      int var12 = 320617061 ^ 720466907 ^ 382977680;
      var12 = 284463484 ^ var12;
      MultiPlayerGameMode var4 = var0.gameMode;
      byte var6 = (byte)((var4 instanceof com.wimpyclient.mixin.aj) ? 1 : 0);
      if (var6 != (1070210642 ^ var12)) {
         var12 = 97144596 ^ var12;
         com.wimpyclient.mixin.aj var8 = (com.wimpyclient.mixin.aj)var4;
         var8.wimpyclient$syncCarriedItem();
         var12 = 1262753720 ^ var12;
      } else {
         var12 = rxybsbtudxcqafzv(var12, 1317951660);
      }
   }

   private void resetState() {
      int var11 = 332866990 ^ 1935608646 ^ 2023889873;
      var11 = 785663685 ^ var11;
      byte var2 = (byte)(922645500 ^ var11);
      this.step = var2;
      byte var6 = (byte)(922645500 ^ var11);
      this.tickCounter = var6;
      Object var7 = null;
      this.targetPos = (BlockPos)var7;
      byte var8 = (byte)(-922645501 ^ var11);
      this.previousSlot = var8;
   }

   static {
      int var6 = 1380640668 ^ 2047218064 ^ Integer.parseInt("1517949837");
      int var3 = new Random(-5919982201820964511L).nextInt();
      JDdFzmbMLl = 167597485 ^ var3;
      var6 = 791388756 ^ var6;
      c var0 = new c();
      INSTANCE = var0;
   }

   public static String bgkgcgfgwr(byte[] var0, int var1) {
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
         byte[] var28 = dsccdsaumd;
         byte[] var34 = dsccdsaumd;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] lfyfxiasjlzdpyg() {
      return new byte[]{46, 86, 119, 126, 39, 48, 78, 18, 108, 123, 114, 112, 64, 28, 90, 20, 26, 63, 11};
   }

   private static int rxybsbtudxcqafzv(int var0, int var1) {
      return var0 ^ var1;
   }
}
