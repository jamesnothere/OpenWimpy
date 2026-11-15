package com.wimpyclient.i;

import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.platform.InputConstants.Key;
import com.wimpyclient.auth.LicenseGate;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
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
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.lwjgl.glfw.GLFW;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class d {
   public static final d INSTANCE;
   private int breakCooldown;
   private int placeCooldown;
   private int obsidianCooldown;
   private int savedSlot;
   private int lastBrokenId;
   private boolean wasActive;
   private static int hBMznFjC86;
   private transient int V2fnn0K1va;

   private d() {
super();
      int var8 = 2039501698 ^ 1212346212;
      
      var8 = 546858745 ^ var8;
      var8 = 120603642 ^ 2092935657 ^ Integer.parseInt("1791307788");
      this.V2fnn0K1va = 349942776 ^ hBMznFjC86;
      var8 = nivelhimysksqlci(var8, 283862272);
      byte var2 = -1;
      this.savedSlot = var2;
      byte var5 = -1;
      this.lastBrokenId = var5;
   }

   public boolean isBusy() {
      int var5 = 2142081407 ^ 1157073505 ^ 975737093;
      var5 = 1053685884 ^ var5;
      return this.wasActive;
   }

   public void abort() {
      int var5 = 1354168830 ^ 1443199431 ^ 975737093;
      var5 = 1759600728 ^ var5;
      this.restoreSlot();
      this.resetAll();
   }

   public void tick(Minecraft var1) {
      int var114 = 836507825 ^ 1430387152 ^ 975737093;
      var114 = 946420284 ^ var114;
      byte var2 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var2 == (1725712984 ^ var114)) {
         var114 = 2027553477 ^ var114;
         this.abort();
      } else {
         var114 = 728291069 ^ var114;
         x var13 = x.INSTANCE;
         v var15 = var13.autoCrystal;
         boolean var17 = var15.pollRisingEdge();
         byte var19 = (byte)((var15.qo()) ? 1 : 0);
         if (var19 == (1303682213 ^ var114)) {
            var114 = 1931009867 ^ var114;
            this.endActiveHold();
         } else {
            var114 = 494065613 ^ var114;
            LocalPlayer var21 = var1.player;
            if (var21 == null) {
               var114 = 1557202903 ^ var114;
            } else {
               label191: {
                  label220: {
                     var114 = 1768526987 ^ var114;
                     ClientLevel var23 = var1.level;
                     if (var23 != null) {
                        var114 = 1395649585 ^ var114;
                        MultiPlayerGameMode var25 = var1.gameMode;
                        if (var25 == null) {
                           var114 = 1721204589 ^ var114;
                           break label191;
                        }

                        var114 = nivelhimysksqlci(var114, 1565676050);
                        Screen var27 = var1.screen;
                        if (var27 == null) {
                           var114 = 144419516 ^ var114;
                           com.wimpyclient.g.g var28 = com.wimpyclient.g.g.INSTANCE;
                           byte var29 = (byte)((var28.isOpen()) ? 1 : 0);
                           if (var29 != (1061800828 ^ var114)) {
                              var114 = 604455685 ^ var114;
                              break label220;
                           }

                           var114 = nivelhimysksqlci(var114, 1589950813);
                           q var31 = q.INSTANCE;
                           byte var32 = (byte)((var31.isActive()) ? 1 : 0);
                           if (var32 != (1636659745 ^ var114)) {
                              var114 = nivelhimysksqlci(var114, 434835227);
                           } else {
                              var114 = 1200828193 ^ var114;
                              r var33 = r.INSTANCE;
                              byte var34 = (byte)((var33.isActive()) ? 1 : 0);
                              if (var34 == (639524096 ^ var114)) {
                                 label144:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var114)) {
                                       case 125288861:
                                       default:
                                          throw new RuntimeException(new IOException());
                                       case 165343790:
                                          var114 ^= 2014718429;
                                          break label144;
                                       case 718308504:
                                          break;
                                       case 1241963993:
                                          break label144;
                                    }
                                 }

                                 c var35 = c.INSTANCE;
                                 byte var36 = (byte)((var35.isBusy()) ? 1 : 0);
                                 if (var36 != (1577612509 ^ var114)) {
                                    var114 = 862254353 ^ var114;
                                    this.endActiveHold();
                                    return;
                                 }

                                 var114 = 34082747 ^ var114;
                                 byte var39 = (byte)((isActivateHeld(var1, var15)) ? 1 : 0);
                                 if (var39 == (1543535462 ^ var114)) {
                                    var114 = 643688107 ^ var114;
                                    this.endActiveHold();
                                    return;
                                 }

                                 var114 = 291169806 ^ var114;
                                 HitResult var41 = var1.hitResult;
                                 byte var43 = (byte)((isActionableTarget(var1, var13, var41)) ? 1 : 0);
                                 if (var43 == (1297784168 ^ var114)) {
                                    var114 = 128427072 ^ var114;
                                    this.endActiveHold();
                                    return;
                                 }

                                 label136:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var114)) {
                                       case 98557347:
                                          var114 ^= 448288867;
                                       case 787812485:
                                          break label136;
                                       case 1348791963:
                                          break;
                                       case 2058668341:
                                       default:
                                          throw new RuntimeException(new IOException());
                                    }
                                 }

                                 byte var93 = (byte)(1474479370 ^ var114);
                                 this.wasActive = (var93 != 0);
                                 this.tickCooldowns();
                                 byte var48 = (byte)((isRightMouseActivate(var15)) ? 1 : 0);
                                 if (var48 != (1474479371 ^ var114)) {
                                    var114 = 666995961 ^ var114;
                                    Options var50 = var1.options;
                                    KeyMapping var51 = var50.keyUse;
                                    byte var94 = (byte)(1881360882 ^ var114);
                                    var51.setDown((var94 != 0));
                                    var114 = 296904980 ^ var114;
                                 } else {
                                    var114 = 913565165 ^ var114;
                                 }

                                 byte var53 = (byte)((var41 instanceof EntityHitResult) ? 1 : 0);
                                 if (var53 != (1636901094 ^ var114)) {
                                    var114 = 573237227 ^ var114;
                                    EntityHitResult var55 = (EntityHitResult)var41;
                                    Entity var57 = var55.getEntity();
                                    byte var59 = (byte)((var57 instanceof EndCrystal) ? 1 : 0);
                                    if (var59 != (1136379661 ^ var114)) {
                                       var114 = 39824267 ^ var114;
                                       EndCrystal var61 = (EndCrystal)var57;
                                       byte var63 = (byte)((this.tryBreak(var1, var13, var61)) ? 1 : 0);
                                       if (var63 != (1105489030 ^ var114)) {
                                          var114 = 2028483613 ^ var114;
                                          int var97 = var61.getId();
                                          this.lastBrokenId = var97;
                                          var114 = 815945329 ^ var114;
                                       } else {
                                          var114 = nivelhimysksqlci(var114, 1212834412);
                                       }

                                       return;
                                    }

                                    var114 = nivelhimysksqlci(var114, 2034188815);
                                 } else {
                                    var114 = nivelhimysksqlci(var114, 1528145380);
                                 }

                                 byte var66 = (byte)((var41 instanceof BlockHitResult) ? 1 : 0);
                                 if (var66 != (981763330 ^ var114)) {
                                    var114 = 1500713368 ^ var114;
                                    BlockHitResult var68 = (BlockHitResult)var41;
                                    Type var70 = var68.getType();
                                    Type var98 = Type.BLOCK;
                                    if (var70 != var98) {
                                       var114 = 890370980 ^ var114;
                                       return;
                                    }

                                    var114 = 2000928236 ^ var114;
                                    BlockPos var72 = var68.getBlockPos();
                                    ClientLevel var74 = var1.level;
                                    BlockState var75 = var74.getBlockState(var72);
                                    Block var100 = Blocks.RESPAWN_ANCHOR;
                                    byte var76 = (byte)((var75.is(var100)) ? 1 : 0);
                                    if (var76 != (347351414 ^ var114)) {
                                       var114 = 194410091 ^ var114;
                                       v var78 = var13.autoAnchor;
                                       byte var79 = (byte)((var78.qo()) ? 1 : 0);
                                       if (var79 != (522346269 ^ var114)) {
                                          var114 = 934740089 ^ var114;
                                          return;
                                       }

                                       label123:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var114)) {
                                             case 34698824:
                                                break label123;
                                             case 206735210:
                                                var114 ^= 897745756;
                                                break label123;
                                             case 260468640:
                                             default:
                                                throw new RuntimeException(new IOException());
                                             case 2065985919:
                                          }
                                       }
                                    } else {
                                       var114 = nivelhimysksqlci(var114, 1041560887);
                                    }

                                    ClientLevel var81 = var1.level;
                                    byte var82 = (byte)((isCrystalBase(var81, var72)) ? 1 : 0);
                                    if (var82 != (715185217 ^ var114)) {
                                       var114 = 846383103 ^ var114;
                                       this.serviceBase(var1, var13, var68, var72);
                                       var114 = 1343195912 ^ var114;
                                       return;
                                    }

                                    label115:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var114)) {
                                          case 43483165:
                                             var114 ^= 1652932704;
                                             break label115;
                                          case 453390033:
                                             break;
                                          case 1014085474:
                                          default:
                                             throw new RuntimeException(new IOException());
                                          case 1214723928:
                                             break label115;
                                       }
                                    }

                                    byte var85 = (byte)((var13.autoCrystalAutoObsidian) ? 1 : 0);
                                    if (var85 != (1210391585 ^ var114)) {
                                       var114 = 615309764 ^ var114;
                                       this.layObsidian(var1, var13, var68, var72);
                                       var114 = 609512787 ^ var114;
                                       return;
                                    }

                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var114)) {
                                          case 197635674:
                                             var114 = 16288919 ^ var114;
                                             return;
                                          case 295562858:
                                             return;
                                          case 794300047:
                                             break;
                                          case 942933932:
                                          default:
                                             throw new RuntimeException(new IOException());
                                       }
                                    }
                                 }

                                 var114 = 1818421820 ^ var114;
                                 return;
                              }

                              var114 = 1584930874 ^ var114;
                           }
                        } else {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var114)) {
                                 case 203926198:
                                    var114 = 748480953 ^ var114;
                                 case 724569276:
                                    break label220;
                                 case 1643207882:
                                    break;
                                 case 1817902912:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        }
                     } else {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var114)) {
                              case 264566888:
                                 var114 = 901288796 ^ var114;
                                 break label191;
                              case 346081453:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 518084876:
                                 break;
                              case 2074520590:
                                 break label191;
                           }
                        }
                     }

                     this.endActiveHold();
                     return;
                  }

                  this.endActiveHold();
                  return;
               }
            }

            this.endActiveHold();
         }
      }
   }

   private static boolean isActionableTarget(Minecraft var0, x var1, HitResult var2) {
      int var61 = 257671294 ^ 462968242 ^ 787686141;
      var61 = 1671717678 ^ var61;
      byte var9 = (byte)((var2 instanceof EntityHitResult) ? 1 : 0);
      if (var9 != (1502925855 ^ var61)) {
         var61 = 1991145934 ^ var61;
         EntityHitResult var11 = (EntityHitResult)var2;
         Entity var13 = var11.getEntity();
         byte var14 = (byte)((var13 instanceof EndCrystal) ? 1 : 0);
         if (var14 != (792374737 ^ var61)) {
            var61 = 675598308 ^ var61;
            return (((byte)(125723188 ^ var61)) != 0);
         }

         var61 = nivelhimysksqlci(var61, 2110268961);
      } else {
         var61 = 191258607 ^ var61;
      }

      byte var17 = (byte)((var2 instanceof BlockHitResult) ? 1 : 0);
      if (var17 != (1391627248 ^ var61)) {
         var61 = 155838493 ^ var61;
         BlockHitResult var19 = (BlockHitResult)var2;
         Type var21 = var19.getType();
         Type var4 = Type.BLOCK;
         if (var21 == var4) {
            var61 = 410696037 ^ var61;
            ClientLevel var23 = var0.level;
            if (var23 != null) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var61)) {
                     case 55039142:
                        var61 ^= 1316820455;
                     case 2052791824:
                        BlockPos var25 = var19.getBlockPos();
                        ClientLevel var27 = var0.level;
                        byte var28 = (byte)((isCrystalBase(var27, var25)) ? 1 : 0);
                        if (var28 != (230477679 ^ var61)) {
                           var61 = 1774015306 ^ var61;
                           return (((byte)(1677827108 ^ var61)) != 0);
                        }

                        var61 = nivelhimysksqlci(var61, 21264871);
                        byte var30 = (byte)((var1.autoCrystalAutoObsidian) ? 1 : 0);
                        if (var30 != (217626248 ^ var61)) {
                           var61 = 917246906 ^ var61;
                           Item var52 = Items.OBSIDIAN;
                           byte var32 = (byte)((isHolding(var0, var52)) ? 1 : 0);
                           if (var32 == (978625842 ^ var61)) {
                              var61 = 1774092939 ^ var61;
                              return (((byte)(1407854521 ^ var61)) != 0);
                           }

                           var61 = 184982044 ^ var61;
                           ClientLevel var35 = var0.level;
                           BlockState var36 = var35.getBlockState(var25);
                           byte var38 = (byte)((var36.canBeReplaced()) ? 1 : 0);
                           BlockPos var50;
                           if (var38 != (827473710 ^ var61)) {
                              var61 = 1775742058 ^ var61;
                              var50 = var25;
                              var61 = 51942279 ^ var61;
                           } else {
                              label67:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var61)) {
                                    case 131590583:
                                       break;
                                    case 261057339:
                                       var61 ^= 2056325301;
                                    case 1042419833:
                                       break label67;
                                    case 1610764484:
                                    default:
                                       throw new IllegalStateException();
                                 }
                              }

                              Direction var55 = var19.getDirection();
                              var50 = var25.relative(var55);
                              var61 = 274610008 ^ var61;
                           }

                           ClientLevel var41 = var0.level;
                           BlockState var42 = var41.getBlockState(var50);
                           byte var43 = (byte)((var42.canBeReplaced()) ? 1 : 0);
                           if (var43 != (1537016003 ^ var61)) {
                              var61 = 647579960 ^ var61;
                              ClientLevel var45 = var0.level;
                              byte var46 = (byte)((canFitCrystal(var45, var50)) ? 1 : 0);
                              if (var46 != (2097433083 ^ var61)) {
                                 var61 = 2015430434 ^ var61;
                                 byte var47 = (byte)(86331096 ^ var61);

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var61)) {
                                       case 80936142:
                                          var61 = 1585997038 ^ var61;
                                          return (var47 != 0);
                                       case 819477926:
                                          return (var47 != 0);
                                       case 1140940642:
                                       default:
                                          throw new IllegalStateException();
                                       case 1278191404:
                                    }
                                 }
                              }

                              var61 = nivelhimysksqlci(var61, 253734192);
                           } else {
                              var61 = 696706056 ^ var61;
                           }

                           byte var82 = (byte)(1914430667 ^ var61);
                           var61 = 699846396 ^ var61;
                           return (var82 != 0);
                        }

                        var61 = nivelhimysksqlci(var61, 1595052337);
                        return (((byte)(1407854521 ^ var61)) != 0);
                     case 144896736:
                        break;
                     case 472642852:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }

            var61 = 1922903342 ^ var61;
         } else {
            var61 = 1793561675 ^ var61;
         }
      } else {
         var61 = 1672379478 ^ var61;
      }

      return (((byte)(828176294 ^ var61)) != 0);
   }

   private static boolean isHolding(Minecraft var0, Item var1) {
      int var18 = 1160633254 ^ 984434252 ^ 787686141;
      var18 = 595724011 ^ var18;
      LocalPlayer var5 = var0.player;
      if (var5 == null) {
         var18 = 747327982 ^ var18;
         return (((byte)(1585113106 ^ var18)) != 0);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
               case 246688425:
                  var18 ^= 907389565;
               case 870150209:
                  break;
               case 898136310:
                  continue;
               case 1335940562:
               default:
                  throw new IllegalStateException();
            }

            ItemStack var8 = var5.getMainHandItem();
            byte var9 = (byte)((var8.is(var1)) ? 1 : 0);
            if (var9 == (1155797889 ^ var18)) {
               var18 = 364558592 ^ var18;
               ItemStack var11 = var5.getOffhandItem();
               byte var12 = (byte)((var11.is(var1)) ? 1 : 0);
               if (var12 == (1365158529 ^ var18)) {
                  var18 = nivelhimysksqlci(var18, 1856125691);
                  byte var13 = (byte)(1073516666 ^ var18);
                  var18 = 1605525338 ^ var18;
                  return (var13 != 0);
               }

               var18 = 603212800 ^ var18;
            } else {
               label41:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
                     case 62776659:
                        break label41;
                     case 91857197:
                        var18 ^= 911144192;
                        break label41;
                     case 528354513:
                     default:
                        throw new IllegalStateException();
                     case 1282971332:
                  }
               }
            }

            byte var25 = (byte)(1923802752 ^ var18);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
                  case 237726771:
                     var18 = 316942753 ^ var18;
                     return (var25 != 0);
                  case 712917357:
                  default:
                     throw new IllegalStateException();
                  case 1580767223:
                     break;
                  case 1822983976:
                     return (var25 != 0);
               }
            }
         }
      }
   }

   private void serviceBase(Minecraft var1, x var2, BlockHitResult var3, BlockPos var4) {
      int var41 = 2111986872 ^ 1351851072 ^ 975737093;
      var41 = 155030397 ^ var41;
      ClientLevel var11 = var1.level;
      EndCrystal var12 = crystalOn(var11, var4);
      if (var12 != null) {
         var41 = 905169847 ^ var41;
         byte var26 = (byte)((this.tryBreak(var1, var2, var12)) ? 1 : 0);
         if (var26 != (731318583 ^ var41)) {
            var41 = 1071179027 ^ var41;
            int var36 = var12.getId();
            this.lastBrokenId = var36;
            var41 = 770583110 ^ var41;
         } else {
            var41 = nivelhimysksqlci(var41, 305581909);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
               case 182658748:
                  var41 ^= 847801331;
               case 2056174065:
                  byte var28 = (byte)(-753707380 ^ var41);
                  this.lastBrokenId = var28;
                  int var16 = this.placeCooldown;
                  if (var16 != (753707379 ^ var41)) {
                     var41 = nivelhimysksqlci(var41, 2035993568);
                     return;
                  }

                  var41 = 1174030724 ^ var41;
                  ClientLevel var18 = var1.level;
                  byte var19 = (byte)((canFitCrystal(var18, var4)) ? 1 : 0);
                  if (var19 == (1763107063 ^ var41)) {
                     var41 = 1017152100 ^ var41;
                     return;
                  }

                  label41:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                        case 116553006:
                        default:
                           throw new RuntimeException();
                        case 194788040:
                           var41 ^= 900971100;
                        case 1509170354:
                           break label41;
                        case 1979057258:
                     }
                  }

                  Item var7 = Items.END_CRYSTAL;
                  InteractionHand var21 = this.equip(var1, var7);
                  if (var21 == null) {
                     var41 = 1942954747 ^ var41;
                     return;
                  }

                  var41 = nivelhimysksqlci(var41, 1624939230);
                  interact(var1, var3, var21);
                  int var33 = var2.autoCrystalPlaceDelay;
                  this.placeCooldown = var33;
                  return;
               case 368554289:
                  break;
               case 1398142834:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private void layObsidian(Minecraft var1, x var2, BlockHitResult var3, BlockPos var4) {
      int var44 = 679927561 ^ 167888140 ^ 975737093;
      var44 = 446116958 ^ var44;
      int var11 = this.obsidianCooldown;
      if (var11 != (37273438 ^ var44)) {
         var44 = 1757110560 ^ var44;
      } else {
         var44 = nivelhimysksqlci(var44, 973436908);
         ClientLevel var13 = var1.level;
         BlockState var14 = var13.getBlockState(var4);
         byte var16 = (byte)((var14.canBeReplaced()) ? 1 : 0);
         BlockPos var30;
         if (var16 != (943573170 ^ var44)) {
            var44 = 558913691 ^ var44;
            var30 = var4;

            label44:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var44)) {
                  case 21257762:
                     var44 ^= 1485676195;
                  case 651719557:
                     break label44;
                  case 802545528:
                     break;
                  case 1747262895:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         } else {
            var44 = nivelhimysksqlci(var44, 1693843682);
            Direction var32 = var3.getDirection();
            var30 = var4.relative(var32);
            var44 = 489408218 ^ var44;
         }

         ClientLevel var19 = var1.level;
         BlockState var20 = var19.getBlockState(var30);
         byte var21 = (byte)((var20.canBeReplaced()) ? 1 : 0);
         if (var21 == (1105202826 ^ var44)) {
            var44 = 1079293226 ^ var44;
         } else {
            var44 = 231614453 ^ var44;
            ClientLevel var23 = var1.level;
            byte var24 = (byte)((canFitCrystal(var23, var30)) ? 1 : 0);
            if (var24 == (1278093695 ^ var44)) {
               var44 = 1301975775 ^ var44;
            } else {
               label36:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var44)) {
                     case 60374088:
                        var44 ^= 229668749;
                        break label36;
                     case 713043806:
                     default:
                        throw new RuntimeException(new IOException());
                     case 778288465:
                        break label36;
                     case 2119927379:
                  }
               }

               Item var7 = Items.OBSIDIAN;
               InteractionHand var26 = this.equip(var1, var7);
               if (var26 == null) {
                  var44 = 1727300004 ^ var44;
               } else {
                  var44 = 1485697469 ^ var44;
                  interact(var1, var3, var26);
                  byte var37 = (byte)(420720462 ^ var44);
                  int var41 = var2.autoCrystalObsidianDelay;
                  int var38 = Math.max(var37, var41);
                  this.obsidianCooldown = var38;
               }
            }
         }
      }
   }

   private boolean tryBreak(Minecraft var1, x var2, EndCrystal var3) {
      int var39 = 2135246040 ^ 407310646 ^ 975737093;
      var39 = 1467129640 ^ var39;
      int var7 = this.breakCooldown;
      if (var7 == (173562819 ^ var39)) {
         var39 = 493622683 ^ var39;
         int var9 = var3.getId();
         int var24 = this.lastBrokenId;
         if (var9 == var24) {
            var39 = 1068691948 ^ var39;
            return (((byte)(679919540 ^ var39)) != 0);
         } else {
            label26:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                  case 217399550:
                     var39 ^= 876689054;
                     break label26;
                  case 1340004478:
                     break;
                  case 1711683172:
                     break label26;
                  case 1756215787:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }

            LocalPlayer var11 = var1.player;
            float var25 = 1.0F;
            Vec3 var12 = var11.getEyePosition(var25);
            Vec3 var27 = var3.position();
            double var13 = var12.distanceTo(var27);
            int var33 = var2.autoCrystalRange;
            double var34 = var33;
            double var44;
            int var15 = (var44 = var13 - var34) == 0.0 ? 0 : (var44 < 0.0 ? -1 : 1);
            if (var15 > (594901190 ^ var39)) {
               var39 = 1225294966 ^ var39;
               return (((byte)(1786641584 ^ var39)) != 0);
            } else {
               var39 = nivelhimysksqlci(var39, 2025697362);
               MultiPlayerGameMode var17 = var1.gameMode;
               LocalPlayer var29 = var1.player;
               var17.attack(var29, var3);
               LocalPlayer var19 = var1.player;
               InteractionHand var30 = InteractionHand.MAIN_HAND;
               var19.swing(var30);
               int var32 = var2.autoCrystalBreakDelay;
               this.breakCooldown = var32;
               return (((byte)(1539885205 ^ var39)) != 0);
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
               case 67845009:
                  var39 ^= 585032823;
                  return (((byte)(679919540 ^ var39)) != 0);
               case 399417891:
                  break;
               case 613909074:
               default:
                  throw new RuntimeException(new IOException());
               case 1790877762:
                  return (((byte)(679919540 ^ var39)) != 0);
            }
         }
      }
   }

   private InteractionHand equip(Minecraft var1, Item var2) {
      int var35 = 842768778 ^ 1040946093 ^ 975737093;
      var35 = 364795281 ^ var35;
      LocalPlayer var7 = var1.player;
      ItemStack var9 = var7.getMainHandItem();
      byte var10 = (byte)((var9.is(var2)) ? 1 : 0);
      if (var10 != (598144691 ^ var35)) {
         var35 = 1866097174 ^ var35;
         return InteractionHand.MAIN_HAND;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var35)) {
               case 85155420:
                  var35 ^= 154037318;
               case 1790387838:
                  ItemStack var13 = var7.getOffhandItem();
                  byte var14 = (byte)((var13.is(var2)) ? 1 : 0);
                  if (var14 != (713595637 ^ var35)) {
                     var35 = 50165495 ^ var35;
                     return InteractionHand.OFF_HAND;
                  }

                  var35 = nivelhimysksqlci(var35, 1505080131);
                  int var17 = hotbarSlot(var7, var2);
                  if (var17 < (1933388214 ^ var35)) {
                     var35 = 2146311804 ^ var35;
                     return null;
                  }

                  label35:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var35)) {
                        case 28196725:
                        default:
                           throw new IllegalStateException();
                        case 256308205:
                           var35 ^= 1647012558;
                        case 777868187:
                           break label35;
                        case 2035756393:
                     }
                  }

                  int var20 = this.savedSlot;
                  if (var20 < (286671736 ^ var35)) {
                     var35 = 13811635 ^ var35;
                     Inventory var30 = var7.getInventory();
                     int var31 = var30.getSelectedSlot();
                     this.savedSlot = var31;
                     var35 = 147945489 ^ var35;
                  } else {
                     var35 = 134465442 ^ var35;
                  }

                  Inventory var23 = var7.getInventory();
                  var23.setSelectedSlot(var17);
                  syncHeld(var1);
                  return InteractionHand.MAIN_HAND;
               case 329745555:
               default:
                  throw new IllegalStateException();
               case 1234415178:
            }
         }
      }
   }

   private static boolean isCrystalBase(Level var0, BlockPos var1) {
      int var15 = 801003413 ^ 1142322015 ^ 787686141;
      var15 = 1937264042 ^ var15;
      BlockState var5 = var0.getBlockState(var1);
      Block var11 = Blocks.OBSIDIAN;
      byte var7 = (byte)((var5.is(var11)) ? 1 : 0);
      if (var7 == (908282781 ^ var15)) {
         var15 = 1391249622 ^ var15;
         Block var12 = Blocks.BEDROCK;
         byte var9 = (byte)((var5.is(var12)) ? 1 : 0);
         if (var9 == (1691321163 ^ var15)) {
            var15 = nivelhimysksqlci(var15, 1006492723);
            byte var10 = (byte)(1597136760 ^ var15);
            var15 = 2146551213 ^ var15;
            return (var10 != 0);
         }

         var15 = 701222865 ^ var15;
      } else {
         var15 = 2066155271 ^ var15;
      }

      byte var22 = (byte)(1292127387 ^ var15);

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
            case 87562606:
               var15 = 1841813071 ^ var15;
               return (var22 != 0);
            case 820862075:
               return (var22 != 0);
            case 1376648240:
            default:
               throw new RuntimeException();
            case 1681087485:
         }
      }
   }

   private static EndCrystal crystalOn(Level var0, BlockPos var1) {
      int var69 = 467969608 ^ 1604312793 ^ 787686141;
      var69 = 1827212951 ^ var69;
      BlockPos var20 = var1.above();
      int var32 = var20.getX();
      double var33 = var32;
      double var5 = 0.125;
      double var35 = var33 + var5;
      int var39 = var20.getY();
      double var40 = var39;
      double var7 = 0.1;
      double var42 = var40 - var7;
      int var45 = var20.getZ();
      double var46 = var45;
      double var9 = 0.125;
      double var48 = var46 + var9;
      int var51 = var20.getX();
      double var52 = var51;
      double var11 = 0.875;
      double var54 = var52 + var11;
      int var57 = var20.getY();
      double var58 = var57;
      double var13 = 2.5;
      double var60 = var58 + var13;
      int var63 = var20.getZ();
      double var64 = var63;
      double var15 = 0.875;
      double var66 = var64 + var15;
      AABB var21 = new AABB(var35, var42, var48, var54, var60, var66);
      Object var29 = null;
      Entity var30 = (Entity)var29;
      Predicate var4 = var0x -> {
         int var5x = 353848500 ^ 499095558 ^ 787686141;
         var5x = 2093525150 ^ var5x;
         return var0x instanceof EndCrystal;
      };
      List var23 = var0.getEntities(var30, var21, var4);
      byte var25 = (byte)((var23.isEmpty()) ? 1 : 0);
      EndCrystal var28;
      if (var25 != (107042043 ^ var69)) {
         var69 = 2031740780 ^ var69;
         var28 = null;
         var69 = nivelhimysksqlci(var69, 1634435749);
      } else {
         var69 = 1113007336 ^ var69;
         byte var31 = (byte)(1144418323 ^ var69);
         Object var27 = var23.get(var31);
         var28 = (EndCrystal)var27;
         var69 = 1512390945 ^ var69;
      }

      return var28;
   }

   private static boolean canFitCrystal(Level var0, BlockPos var1) {
      int var56 = 1656655577 ^ 1953534475 ^ 787686141;
      var56 = 531331769 ^ var56;
      BlockPos var17 = var1.above();
      BlockState var19 = var0.getBlockState(var17);
      byte var20 = (byte)((var19.isAir()) ? 1 : 0);
      if (var20 == (664159382 ^ var56)) {
         var56 = 739259076 ^ var56;
         return (((byte)(193361490 ^ var56)) != 0);
      } else {
         var56 = nivelhimysksqlci(var56, 961681263);
         int var28 = var17.getX();
         double var29 = var28;
         int var32 = var17.getY();
         double var33 = var32;
         int var35 = var17.getZ();
         double var36 = var35;
         int var38 = var17.getX();
         double var39 = var38;
         double var9 = 1.0;
         double var41 = var39 + var9;
         int var44 = var17.getY();
         double var45 = var44;
         double var11 = 2.0;
         double var47 = var45 + var11;
         int var50 = var17.getZ();
         double var51 = var50;
         double var13 = 1.0;
         double var53 = var51 + var13;
         AABB var21 = new AABB(var29, var33, var36, var41, var47, var53);
         Object var26 = null;
         Entity var27 = (Entity)var26;
         Predicate<Entity> var5 = var0x -> {
            int var6 = 1629295330 ^ 1028638205 ^ 787686141;
            var6 = 1364474765 ^ var6;
            byte var2 = (byte)((var0x.isSpectator()) ? 1 : 0);
            byte var3;
            if (var2 == (603311727 ^ var6)) {
               var6 = 1528093593 ^ var6;
               var3 = (byte)(2028017143 ^ var6);
               var6 = 1393779504 ^ var6;
            } else {
               var6 = nivelhimysksqlci(var6, 1282675686);
               var3 = (byte)(1870781833 ^ var6);
               var6 = 1148431183 ^ var6;
            }

            return (var3 != 0);
         };
         List var23 = var0.getEntities(var27, var21, var5);
         return var23.isEmpty();
      }
   }

   private static void interact(Minecraft var0, BlockHitResult var1, InteractionHand var2) {
      int var18 = 688111385 ^ 707627165 ^ 787686141;
      var18 = 136139304 ^ var18;
      MultiPlayerGameMode var8 = var0.gameMode;
      LocalPlayer var14 = var0.player;
      InteractionResult var9 = var8.useItemOn(var14, var2, var1);
      byte var11 = (byte)((var9.consumesAction()) ? 1 : 0);
      if (var11 != (633358161 ^ var18)) {
         var18 = 803789456 ^ var18;
         LocalPlayer var13 = var0.player;
         var13.swing(var2);
         var18 = 420483363 ^ var18;
      } else {
         var18 = 922274739 ^ var18;
      }
   }

   private static void syncHeld(Minecraft var0) {
      int var12 = 662276797 ^ 19977226 ^ 787686141;
      var12 = 1374689906 ^ var12;
      MultiPlayerGameMode var4 = var0.gameMode;
      byte var6 = (byte)((var4 instanceof com.wimpyclient.mixin.aj) ? 1 : 0);
      if (var6 != (1498048056 ^ var12)) {
         var12 = 1400028303 ^ var12;
         com.wimpyclient.mixin.aj var8 = (com.wimpyclient.mixin.aj)var4;
         var8.wimpyclient$syncCarriedItem();
         var12 = 436576466 ^ var12;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var12)) {
               case 218136390:
                  var12 = 1232542813 ^ var12;
                  return;
               case 537036495:
                  break;
               case 726867911:
                  return;
               case 913196578:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }
   }

   private static int hotbarSlot(LocalPlayer var0, Item var1) {
      int var18 = 1587054472 ^ 1547251566 ^ 787686141;
      var18 = 1280447173 ^ var18;
      Inventory var6 = var0.getInventory();
      Inventory var4 = var6;
      byte var7 = (byte)(1610651870 ^ var18);
      int var5 = var7;
      var18 = 214760209 ^ var18;

      label40:
      while (true) {
         int var3 = Inventory.getSelectionSize();
         if (var5 < var3) {
            var18 = 723716241 ^ var18;
            ItemStack var11 = var4.getItem(var5);
            byte var12 = (byte)((var11.is(var1)) ? 1 : 0);
            if (var12 != (1206872926 ^ var18)) {
               var18 = 1509551523 ^ var18;
               return var5;
            }

            var18 = 1187972187 ^ var18;
            var5 += 18902788 ^ var18;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
                  case 2998208:
                     break;
                  case 17721652:
                     var18 ^= 1844186314;
                     continue label40;
                  case 1511402616:
                  default:
                     throw new IllegalStateException();
                  case 1739565501:
                     continue label40;
               }
            }
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
               case 46951853:
                  var18 ^= 1352739638;
                  return (byte)(-1013795066 ^ var18);
               case 1143126145:
               default:
                  throw new IllegalStateException();
               case 1652047095:
                  return (byte)(-1013795066 ^ var18);
               case 1746278435:
            }
         }
      }
   }

   private void tickCooldowns() {
      int var21 = 1303561179 ^ 969910212 ^ 975737093;
      var21 = 856636658 ^ var21;
      int var3 = this.breakCooldown;
      if (var3 > (2103101928 ^ var21)) {
         var21 = 123179122 ^ var21;
         int var11 = this.breakCooldown;
         byte var2 = (byte)(2047695259 ^ var21);
         int var12 = var11 - var2;
         this.breakCooldown = var12;
         var21 = 1928137583 ^ var21;
      } else {
         var21 = 1975163677 ^ var21;
      }

      int var6 = this.placeCooldown;
      if (var6 > (148919029 ^ var21)) {
         var21 = 795135514 ^ var21;
         int var13 = this.placeCooldown;
         byte var17 = (byte)(663002350 ^ var21);
         int var14 = var13 - var17;
         this.placeCooldown = var14;
         var21 = 921026239 ^ var21;
      } else {
         var21 = 427913381 ^ var21;
      }

      int var9 = this.obsidianCooldown;
      if (var9 > (291578448 ^ var21)) {
         var21 = 1939264145 ^ var21;
         int var15 = this.obsidianCooldown;
         byte var18 = (byte)(1660416192 ^ var21);
         int var16 = var15 - var18;
         this.obsidianCooldown = var16;
         var21 = 845783002 ^ var21;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var21)) {
               case 28058394:
                  var21 = 1107250507 ^ var21;
                  return;
               case 1600886596:
                  break;
               case 1643087542:
               default:
                  throw new IllegalStateException();
               case 2087785347:
                  return;
            }
         }
      }
   }

   private static boolean isActivateHeld(Minecraft var0, v var1) {
      int var16 = 1230452893 ^ 825336608 ^ 787686141;
      var16 = 1043707175 ^ var16;
      byte var5 = (byte)((var1.isKeybound()) ? 1 : 0);
      if (var5 != (1755319399 ^ var16)) {
         var16 = 1351008378 ^ var16;
         return var1.isHeld();
      } else {
         var16 = nivelhimysksqlci(var16, 662202695);
         Window var9 = var0.getWindow();
         long var10 = var9.handle();
         byte var4 = (byte)(1339581729 ^ var16);
         int var12 = GLFW.glfwGetMouseButton(var10, var4);
         byte var3 = (byte)(1339581729 ^ var16);
         if (var12 != var3) {
            var16 = 1821634244 ^ var16;
            byte var24 = (byte)(592153572 ^ var16);
            var16 = 1786421371 ^ var16;
            return (var24 != 0);
         } else {
            var16 = 1605199369 ^ var16;
            byte var13 = (byte)(276103976 ^ var16);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
                  case 266511978:
                     var16 = 1497639094 ^ var16;
                     return (var13 != 0);
                  case 1297016358:
                     return (var13 != 0);
                  case 1467303369:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1908912032:
               }
            }
         }
      }
   }

   private static boolean isRightMouseActivate(v var0) {
      int var16 = 63027492 ^ 1283704604 ^ 787686141;
      var16 = 1058078147 ^ var16;
      byte var4 = (byte)((var0.isKeybound()) ? 1 : 0);
      if (var4 == (1587650822 ^ var16)) {
         var16 = 1014174961 ^ var16;
         return (((byte)(1657976310 ^ var16)) != 0);
      } else {
         var16 = 1481086953 ^ var16;
         Key var6 = var0.boundKey();
         com.mojang.blaze3d.platform.InputConstants.Type var8 = var6.getType();
         com.mojang.blaze3d.platform.InputConstants.Type var2 = com.mojang.blaze3d.platform.InputConstants.Type.MOUSE;
         if (var8 == var2) {
            var16 = 1955106879 ^ var16;
            int var10 = var6.getValue();
            byte var13 = (byte)(1919854289 ^ var16);
            if (var10 == var13) {
               var16 = 543857185 ^ var16;
               byte var11 = (byte)(1376009456 ^ var16);
               var16 = 1752579301 ^ var16;
               return (var11 != 0);
            }

            var16 = nivelhimysksqlci(var16, 1971525533);
         } else {
            var16 = nivelhimysksqlci(var16, 17532834);
         }

         byte var25 = (byte)(133017933 ^ var16);
         var16 = 1033875801 ^ var16;
         return (var25 != 0);
      }
   }

   private void endActiveHold() {
      int var16 = 1178508360 ^ 1506053645 ^ 975737093;
      var16 = 925710535 ^ var16;
      byte var3 = (byte)((this.wasActive) ? 1 : 0);
      if (var3 == (318749575 ^ var16)) {
         var16 = 1496578234 ^ var16;
      } else {
         var16 = nivelhimysksqlci(var16, 766634228);
         this.restoreSlot();
         byte var2 = (byte)(1062097779 ^ var16);
         this.breakCooldown = var2;
         byte var10 = (byte)(1062097779 ^ var16);
         this.placeCooldown = var10;
         byte var11 = (byte)(1062097779 ^ var16);
         this.obsidianCooldown = var11;
         byte var12 = (byte)(-1062097780 ^ var16);
         this.lastBrokenId = var12;
         byte var13 = (byte)(1062097779 ^ var16);
         this.wasActive = (var13 != 0);
      }
   }

   private void restoreSlot() {
      int var24 = 1045926683 ^ 1158646789 ^ 975737093;
      var24 = 1981664591 ^ var24;
      x var1 = x.INSTANCE;
      byte var4 = (byte)((var1.autoCrystalRestoreSlot) ? 1 : 0);
      if (var4 != (929907540 ^ var24)) {
         var24 = 176273290 ^ var24;
         int var6 = this.savedSlot;
         if (var6 >= (1038939358 ^ var24)) {
            var24 = nivelhimysksqlci(var24, 1449440993);
            Minecraft var8 = Minecraft.getInstance();
            LocalPlayer var10 = var8.player;
            if (var10 != null) {
               var24 = 64505645 ^ var24;
               int var12 = this.savedSlot;
               int var18 = Inventory.getSelectionSize();
               if (var12 < var18) {
                  var24 = 1276653161 ^ var24;
                  LocalPlayer var14 = var8.player;
                  Inventory var15 = var14.getInventory();
                  int var20 = this.savedSlot;
                  var15.setSelectedSlot(var20);
                  syncHeld(var8);
                  var24 = 1068652148 ^ var24;
               } else {
                  var24 = 1940551709 ^ var24;
               }
            } else {
               var24 = nivelhimysksqlci(var24, 1886535472);
            }

            byte var21 = (byte)(-469400848 ^ var24);
            this.savedSlot = var21;
            return;
         }

         var24 = 166626863 ^ var24;
      } else {
         var24 = 57618853 ^ var24;
      }

      byte var2 = (byte)(-872575730 ^ var24);
      this.savedSlot = var2;
   }

   private void resetAll() {
      int var15 = 955118251 ^ 785824758 ^ 975737093;
      var15 = 713999338 ^ var15;
      byte var2 = (byte)(110959538 ^ var15);
      this.breakCooldown = var2;
      byte var8 = (byte)(110959538 ^ var15);
      this.placeCooldown = var8;
      byte var9 = (byte)(110959538 ^ var15);
      this.obsidianCooldown = var9;
      byte var10 = (byte)(-110959539 ^ var15);
      this.savedSlot = var10;
      byte var11 = (byte)(-110959539 ^ var15);
      this.lastBrokenId = var11;
      byte var12 = (byte)(110959538 ^ var15);
      this.wasActive = (var12 != 0);
   }

   static {
      int var6 = 132929825 ^ 39095849 ^ Integer.parseInt("1791307788");
      int var3 = new Random(9000568985589384685L).nextInt();
      hBMznFjC86 = 463477120 ^ var3;
      var6 = 1668822607 ^ var6;
      d var0 = new d();
      INSTANCE = var0;
   }

   public static String ilfvlcuidd(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] ypyxwduejnzcuqu() {
      return new byte[]{
         52,
         37,
         127,
         63,
         22,
         80,
         87,
         102,
         3,
         96,
         77,
         103,
         66,
         61,
         98,
         79,
         17,
         95,
         98,
         7,
         5,
         34,
         81,
         113,
         119,
         99,
         115,
         104,
         29,
         89,
         3,
         78,
         99,
         110,
         8,
         5,
         47,
         78,
         36,
         5,
         106,
         10,
         102,
         47,
         69,
         59,
         61,
         2,
         87,
         70,
         59,
         124,
         98,
         72,
         37,
         8,
         65,
         90,
         115,
         67,
         113,
         44,
         13,
         51,
         53,
         113,
         115,
         63,
         40,
         19,
         6,
         94
      };
   }

   private static int nivelhimysksqlci(int var0, int var1) {
      return var1 ^ var0;
   }
}
