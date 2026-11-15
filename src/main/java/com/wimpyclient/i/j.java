package com.wimpyclient.i;

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
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class j {
   public static final j INSTANCE;
   private static int nociEQrlkn;
   private transient int G9LgdYiRqQ;

   private j() {
super();
      int var4 = 1949315704 ^ 475799895;
      
      var4 = 1481486366 ^ var4;
      var4 = 643513044 ^ 1403772012 ^ Integer.parseInt("1171342729");
      this.G9LgdYiRqQ = 671367216 ^ nociEQrlkn;
      var4 = 1634691771 ^ var4;
   }

   public void tick(Minecraft var1) {
      int var53 = 871331797 ^ 1090031400 ^ 2013258968;
      var53 = 466173181 ^ var53;
      byte var2 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var2 == (522264792 ^ var53)) {
         var53 = 1508892158 ^ var53;
      } else {
         var53 = batlbwwfrbzmzege(var53, 305074477);
         x var9 = x.INSTANCE;
         v var10 = var9.autotool;
         byte var11 = (byte)((var10.qo()) ? 1 : 0);
         if (var11 == (219034101 ^ var53)) {
            var53 = 741633076 ^ var53;
         } else {
            var53 = batlbwwfrbzmzege(var53, 1352474871);
            LocalPlayer var13 = var1.player;
            if (var13 == null) {
               var53 = batlbwwfrbzmzege(var53, 344450224);
            } else {
               var53 = 1727442149 ^ var53;
               ClientLevel var15 = var1.level;
               if (var15 != null) {
                  var53 = 1568447443 ^ var53;
                  MultiPlayerGameMode var17 = var1.gameMode;
                  if (var17 == null) {
                     var53 = 789435270 ^ var53;
                  } else {
                     label129:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
                           case 97573917:
                              var53 ^= 1883035314;
                           case 683535779:
                              break label129;
                           case 1459732208:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1506460515:
                        }
                     }

                     Screen var19 = var1.screen;
                     if (var19 != null) {
                        var53 = 1488470587 ^ var53;
                     } else {
                        label121:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
                              case 116293487:
                                 break;
                              case 183079974:
                                 var53 ^= 359165128;
                              case 529973414:
                                 break label121;
                              case 1756325111:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }

                        byte var20 = (byte)((com.wimpyclient.p.o.isActive()) ? 1 : 0);
                        if (var20 != (55417934 ^ var53)) {
                           var53 = batlbwwfrbzmzege(var53, 996599515);
                        } else {
                           var53 = 533180478 ^ var53;
                           d var21 = d.INSTANCE;
                           byte var22 = (byte)((var21.isBusy()) ? 1 : 0);
                           if (var22 == (478817392 ^ var53)) {
                              var53 = 1477728180 ^ var53;
                              c var23 = c.INSTANCE;
                              byte var24 = (byte)((var23.isBusy()) ? 1 : 0);
                              if (var24 != (1151237060 ^ var53)) {
                                 var53 = 2092237137 ^ var53;
                              } else {
                                 var53 = batlbwwfrbzmzege(var53, 1236912286);
                                 HitResult var26 = var1.hitResult;
                                 if (var26 != null) {
                                    var53 = 1872574029 ^ var53;
                                    Type var29 = var26.getType();
                                    Type var3 = Type.ENTITY;
                                    if (var29 == var3) {
                                       var53 = 1160729340 ^ var53;
                                       return;
                                    }

                                    var53 = 555804531 ^ var53;
                                 } else {
                                    label109:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
                                          case 159180377:
                                             var53 ^= 1321062718;
                                             break label109;
                                          case 719975445:
                                          default:
                                             throw new RuntimeException(new IOException());
                                          case 1341794920:
                                             break;
                                          case 1897252951:
                                             break label109;
                                       }
                                    }
                                 }

                                 byte var48;
                                 label153: {
                                    Options var31 = var1.options;
                                    KeyMapping var32 = var31.keyAttack;
                                    byte var33 = (byte)((var32.isDown()) ? 1 : 0);
                                    if (var33 == (1134191204 ^ var53)) {
                                       var53 = 886295942 ^ var53;
                                       MultiPlayerGameMode var35 = var1.gameMode;
                                       byte var36 = (byte)((var35.isDestroying()) ? 1 : 0);
                                       if (var36 == (2001317858 ^ var53)) {
                                          var53 = 765455072 ^ var53;
                                          byte var37 = (byte)((com.wimpyclient.p.b.isForcingLeftClick()) ? 1 : 0);
                                          if (var37 == (1523991810 ^ var53)) {
                                             var53 = batlbwwfrbzmzege(var53, 1333134343);
                                             var48 = (byte)(362823941 ^ var53);
                                             var53 = 1575116127 ^ var53;
                                             break label153;
                                          }

                                          var53 = 1930772202 ^ var53;
                                       } else {
                                          var53 = 1586156554 ^ var53;
                                       }
                                    } else {
                                       label100:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
                                             case 50027835:
                                                var53 ^= 1784224140;
                                             case 86889838:
                                                break label100;
                                             case 868537434:
                                                break;
                                             case 2090524424:
                                             default:
                                                throw new RuntimeException(new IOException());
                                          }
                                       }
                                    }

                                    var48 = (byte)(700677097 ^ var53);

                                    label89:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
                                          case 15395282:
                                             var53 ^= 1635870642;
                                          case 766448329:
                                             break label89;
                                          case 1469266709:
                                             break;
                                          case 2027455093:
                                          default:
                                             throw new RuntimeException(new IOException());
                                       }
                                    }
                                 }

                                 if (var48 == (1212292186 ^ var53)) {
                                    var53 = 824108812 ^ var53;
                                 } else {
                                    label81:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
                                          case 4529178:
                                          default:
                                             throw new RuntimeException(new IOException());
                                          case 201350828:
                                             var53 ^= 581909461;
                                          case 424016952:
                                             break label81;
                                          case 1773057477:
                                       }
                                    }

                                    BlockPos var40 = resolveMiningPos(var1);
                                    if (var40 == null) {
                                       var53 = 1541390806 ^ var53;
                                    } else {
                                       var53 = 586297325 ^ var53;
                                       ClientLevel var43 = var1.level;
                                       BlockState var44 = var43.getBlockState(var40);
                                       byte var46 = (byte)((var44.isAir()) ? 1 : 0);
                                       if (var46 != (1209993314 ^ var53)) {
                                          var53 = 331633975 ^ var53;
                                       } else {
                                          var53 = batlbwwfrbzmzege(var53, 1328575749);
                                          this.swapForBlock(var1, var40);
                                       }
                                    }
                                 }
                              }
                           } else {
                              var53 = 614553317 ^ var53;
                           }
                        }
                     }
                  }
               } else {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
                        case 50373737:
                        default:
                           throw new RuntimeException(new IOException());
                        case 51717258:
                           var53 = 1920026709 ^ var53;
                           return;
                        case 1616049327:
                           break;
                        case 2144101855:
                           return;
                     }
                  }
               }
            }
         }
      }
   }

   public void swapForBlock(Minecraft var1, BlockPos var2) {
      int var11 = 1146632491 ^ 1478801735 ^ 2013258968;
      var11 = 1848704728 ^ var11;
      x var3 = x.INSTANCE;
      v var6 = var3.autotool;
      byte var7 = (byte)((var6.qo()) ? 1 : 0);
      if (var7 == (95656556 ^ var11)) {
         var11 = 1004250724 ^ var11;
      } else {
         var11 = batlbwwfrbzmzege(var11, 1133852483);
         this.forceSwapForBlock(var1, var2);
      }
   }

   public void forceSwapForBlock(Minecraft var1, BlockPos var2) {
      int var41 = 572905888 ^ 1249769563 ^ 2013258968;
      var41 = 1112247864 ^ var41;
      byte var3 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var3 == (1575766811 ^ var41)) {
         var41 = 95176919 ^ var41;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
               case 100240488:
                  var41 ^= 1119685051;
               case 1000133141:
                  LocalPlayer var11 = var1.player;
                  if (var11 == null) {
                     var41 = 1383709174 ^ var41;
                     return;
                  }

                  var41 = 689150653 ^ var41;
                  ClientLevel var13 = var1.level;
                  if (var13 == null) {
                     var41 = 2070553419 ^ var41;
                     return;
                  }

                  var41 = 121890859 ^ var41;
                  ClientLevel var15 = var1.level;
                  BlockState var16 = var15.getBlockState(var2);
                  byte var18 = (byte)((var16.isAir()) ? 1 : 0);
                  if (var18 != (822161462 ^ var41)) {
                     var41 = 33380038 ^ var41;
                     return;
                  }

                  label66:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                        case 250772585:
                           var41 ^= 593168363;
                           break label66;
                        case 1158913904:
                           break;
                        case 1645214807:
                        default:
                           throw new RuntimeException();
                        case 2054089119:
                           break label66;
                     }
                  }

                  LocalPlayer var20 = var1.player;
                  int var22 = findBestSlot(var20, var16);
                  if (var22 < (307902429 ^ var41)) {
                     var41 = batlbwwfrbzmzege(var41, 115667368);
                     return;
                  }

                  var41 = 170654234 ^ var41;
                  Inventory var36 = var20.getInventory();
                  int var37 = var36.getSelectedSlot();
                  if (var22 != var37) {
                     var41 = 1211209112 ^ var41;
                     Inventory var26 = var20.getInventory();
                     var26.setSelectedSlot(var22);
                     MultiPlayerGameMode var28 = var1.gameMode;
                     byte var30 = (byte)((var28 instanceof com.wimpyclient.mixin.aj) ? 1 : 0);
                     if (var30 != (1346394207 ^ var41)) {
                        var41 = 463008139 ^ var41;
                        com.wimpyclient.mixin.aj var32 = (com.wimpyclient.mixin.aj)var28;
                        var32.wimpyclient$syncCarriedItem();
                        var41 = 1600548769 ^ var41;
                        return;
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                           case 192740216:
                              var41 = 1157537322 ^ var41;
                              return;
                           case 277627751:
                           default:
                              throw new RuntimeException();
                           case 279628246:
                              break;
                           case 897291295:
                              return;
                        }
                     }
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                        case 257713856:
                           var41 = 214895538 ^ var41;
                           return;
                        case 263081992:
                        default:
                           throw new RuntimeException();
                        case 1315088447:
                           break;
                        case 1986341529:
                           return;
                     }
                  }
               case 975309676:
                  break;
               case 1892113638:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private static BlockPos resolveMiningPos(Minecraft var0) {
      int var40 = 2042879026 ^ 324494275 ^ 1610327272;
      var40 = 1494033822 ^ var40;
      HitResult var6 = var0.hitResult;
      if (var6 != null) {
         var40 = 1557890759 ^ var40;
         Type var9 = var6.getType();
         Type var2 = Type.ENTITY;
         if (var9 == var2) {
            var40 = 1353635757 ^ var40;
            return null;
         }

         label78:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
               case 241689669:
                  var40 ^= 224766792;
                  break label78;
               case 418950722:
                  break;
               case 1291079972:
                  break label78;
               case 1865346378:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      } else {
         var40 = batlbwwfrbzmzege(var40, 1371417999);
      }

      MultiPlayerGameMode var11 = var0.gameMode;
      byte var13 = (byte)((var11 instanceof com.wimpyclient.mixin.aj) ? 1 : 0);
      if (var13 != (1037832968 ^ var40)) {
         var40 = 1151802126 ^ var40;
         com.wimpyclient.mixin.aj var15 = (com.wimpyclient.mixin.aj)var11;
         byte var17 = (byte)((var15.wimpyclient$isDestroying()) ? 1 : 0);
         if (var17 != (2038106118 ^ var40)) {
            var40 = 1310024418 ^ var40;
            BlockPos var19 = var15.wimpyclient$getDestroyBlockPos();
            if (var19 != null) {
               var40 = 726451955 ^ var40;
               return var19;
            }

            var40 = 1727244426 ^ var40;
         } else {
            var40 = 686213736 ^ var40;
         }
      } else {
         label70:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
               case 131750147:
                  var40 ^= 1816252774;
               case 495621429:
                  break label70;
               case 1136839391:
                  break;
               case 1590340024:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }

      if (var6 != null) {
         var40 ^= 307584370;
         Type var24 = var6.getType();
         Type var36 = Type.BLOCK;
         if (var24 == var36) {
            var40 = 1644220564 ^ var40;
            BlockHitResult var26 = (BlockHitResult)var6;
            return var26.getBlockPos();
         }

         label61:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
               case 55900046:
                  var40 ^= 900771739;
                  break label61;
               case 61191736:
                  break;
               case 1296494540:
                  break label61;
               case 1954687093:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      } else {
         label55:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
               case 237107496:
                  var40 ^= 669381353;
               case 712498371:
                  break label55;
               case 1256350002:
                  break;
               case 1920867309:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }

      MultiPlayerGameMode var29 = var0.gameMode;
      byte var30 = (byte)((var29.isDestroying()) ? 1 : 0);
      if (var30 == (1987588231 ^ var40)) {
         var40 = 1808863011 ^ var40;
         byte var31 = (byte)((com.wimpyclient.p.b.isForcingLeftClick()) ? 1 : 0);
         if (var31 == (497631140 ^ var40)) {
            var40 = batlbwwfrbzmzege(var40, 1109417650);
            return null;
         } else {
            var40 = 528587231 ^ var40;
            return raycastEffectiveLook(var0);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
               case 92842109:
                  var40 = 1951438588 ^ var40;
                  return raycastEffectiveLook(var0);
               case 415526901:
                  break;
               case 557276294:
               default:
                  throw new RuntimeException(new IOException());
               case 2093451065:
                  return raycastEffectiveLook(var0);
            }
         }
      }
   }

   private static BlockPos raycastEffectiveLook(Minecraft var0) {
      int var63 = 1688750934 ^ 1111127615 ^ 1610327272;
      var63 = 1723554794 ^ var63;
      LocalPlayer var20 = var0.player;
      if (var20 != null) {
         var63 = 657307183 ^ var63;
         ClientLevel var23 = var0.level;
         if (var23 != null) {
            var63 = batlbwwfrbzmzege(var63, 1695733094);
            float var25 = var20.getYRot();
            float var11 = var25;
            float var27 = var20.getXRot();
            float var12 = var27;
            float[] var28 = com.wimpyclient.p.b.getEffectiveLook();
            if (var28 != null) {
               var63 = 858241594 ^ var63;
               byte var2 = (byte)(1858738968 ^ var63);
               float var31 = var28[var2];
               var11 = var31;
               byte var54 = (byte)(1858738969 ^ var63);
               float var33 = var28[var54];
               var12 = var33;
               var63 = 478840258 ^ var63;
            } else {
               var63 = batlbwwfrbzmzege(var63, 799883256);
            }

            byte var35 = (byte)((var20.isCreative()) ? 1 : 0);
            double var36;
            if (var35 != (1916837594 ^ var63)) {
               var63 = 1989364657 ^ var63;
               var36 = 5.0;
               var63 = batlbwwfrbzmzege(var63, 1763937236);
            } else {
               var63 = batlbwwfrbzmzege(var63, 949626871);
               var36 = 4.5;
               var63 = 657123218 ^ var63;
            }

            float var55 = 1.0F;
            Vec3 var39 = var20.getEyePosition(var55);
            Vec3 var41 = Vec3.directionFromRotation(var12, var11);
            Vec3 var58 = var41.scale(var36);
            Vec3 var43 = var39.add(var58);
            ClientLevel var45 = var0.level;
            Block var7 = Block.OUTLINE;
            Fluid var8 = Fluid.NONE;
            ClipContext var59 = new ClipContext(var39, var43, var7, var8, var20);
            BlockHitResult var46 = var45.clip(var59);
            Type var48 = var46.getType();
            Type var60 = Type.BLOCK;
            if (var48 == var60) {
               var63 = 135289387 ^ var63;
               BlockHitResult var50 = var46;
               return var50.getBlockPos();
            } else {
               var63 = 911724163 ^ var63;
               return null;
            }
         } else {
            var63 = 774653106 ^ var63;
            return null;
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var63)) {
               case 229132157:
                  var63 = 151122589 ^ var63;
                  return null;
               case 439277061:
                  break;
               case 1950686248:
                  return null;
               case 2052393817:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   private static int findBestSlot(LocalPlayer var0, BlockState var1) {
      int var42 = 39778090 ^ 1865282806 ^ 1610327272;
      var42 = 1584845415 ^ var42;
      Inventory var11 = var0.getInventory();
      Inventory var5 = var11;
      byte var12 = (byte)(-1828615508 ^ var42);
      int var6 = var12;
      float var13 = Float.NEGATIVE_INFINITY;
      float var7 = var13;
      byte var14 = (byte)(1828615507 ^ var42);
      int var8 = var14;
      var42 = 1070316797 ^ var42;

      label58:
      while (true) {
         int var3 = Inventory.getSelectionSize();
         if (var8 < var3) {
            var42 ^= 456070925;
            ItemStack var26 = var5.getItem(var8);
            float var28 = scoreTool(var26, var1);
            float var51;
            int var30 = (var51 = var28 - var7) == 0.0F ? 0 : (var51 < 0.0F ? -1 : 1);
            if (var30 > (1209720483 ^ var42)) {
               var42 = 564294729 ^ var42;
               var7 = var28;
               var6 = var8;
               var42 = 1771614767 ^ var42;
            } else {
               label41:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                     case 112127148:
                        break label41;
                     case 196364097:
                        var42 ^= 1211811430;
                        break label41;
                     case 467150087:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1046567573:
                  }
               }
            }

            var8 += 2103492 ^ var42;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                  case 1971992:
                     var42 ^= 1393938795;
                     continue label58;
                  case 1122782707:
                     break;
                  case 1859708894:
                     continue label58;
                  case 1946394047:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         } else {
            var42 = 24371678 ^ var42;
            if (var6 < (1380329584 ^ var42)) {
               var42 = 1061894154 ^ var42;
               return (byte)(-1829572731 ^ var42);
            }

            var42 = batlbwwfrbzmzege(var42, 1510297690);
            ItemStack var18 = var5.getSelectedItem();
            float var19 = scoreTool(var18, var1);
            float var4 = 0.001F;
            float var35 = var19 + var4;
            float var52;
            int var21 = (var52 = var7 - var35) == 0.0F ? 0 : (var52 < 0.0F ? -1 : 1);
            if (var21 <= (138639402 ^ var42)) {
               var42 = 676401496 ^ var42;
               return (byte)(-538077555 ^ var42);
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                  case 176274:
                     var42 = 1517393872 ^ var42;
                     return var6;
                  case 728841283:
                  default:
                     throw new RuntimeException(new IOException());
                  case 894214608:
                     return var6;
                  case 2019539897:
               }
            }
         }
      }
   }

   private static float scoreTool(ItemStack var0, BlockState var1) {
      int var56 = 1363691102 ^ 2103085749 ^ 1610327272;
      var56 = 1835053456 ^ var56;
      byte var10 = (byte)((var0.isEmpty()) ? 1 : 0);
      if (var10 != (512350611 ^ var56)) {
         var56 = 688093838 ^ var56;
         return 0.0F;
      } else {
         var56 = 502271101 ^ var56;
         float var12 = var0.getDestroySpeed(var1);
         float var4 = var12;
         TagKey var44 = ItemTags.SWORDS;
         byte var14 = (byte)((var0.is(var44)) ? 1 : 0);
         TagKey var45 = BlockTags.LEAVES;
         byte var16 = (byte)((var1.is(var45)) ? 1 : 0);
         net.minecraft.world.level.block.Block var46 = Blocks.COBWEB;
         byte var18 = (byte)((var1.is(var46)) ? 1 : 0);
         Item var47 = Items.SHEARS;
         byte var20 = (byte)((var0.is(var47)) ? 1 : 0);
         if (var14 == (58316270 ^ var56)) {
            var56 = batlbwwfrbzmzege(var56, 675126563);
         } else {
            var56 = 1106990792 ^ var56;
            if (var16 != (1115849510 ^ var56)) {
               var56 = 1012325757 ^ var56;
               return 0.1F;
            }

            label61:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
                  case 14132037:
                     break;
                  case 14458011:
                     var56 ^= 1774636011;
                  case 230579137:
                     break label61;
                  case 1777773376:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         label69: {
            if (var20 != (725895373 ^ var56)) {
               var56 = 505315165 ^ var56;
               if (var16 != (895104912 ^ var56)) {
                  var56 = batlbwwfrbzmzege(var56, 1834886848);
                  break label69;
               }

               var56 = 1813385547 ^ var56;
               if (var18 != (1498162907 ^ var56)) {
                  var56 = 21510027 ^ var56;
                  break label69;
               }

               var56 = 1902623064 ^ var56;
            } else {
               var56 = 57661262 ^ var56;
            }

            if (var14 != (673947523 ^ var56)) {
               var56 = 1965678608 ^ var56;
               if (var18 == (1560444819 ^ var56)) {
                  var56 = 1156047029 ^ var56;
                  float var48 = 1.0F;
                  float var29 = Math.min(var12, var48);
                  var4 = var29;
                  var56 = 1817768735 ^ var56;
               } else {
                  var56 = 683611050 ^ var56;
               }
            } else {
               var56 = batlbwwfrbzmzege(var56, 1570173882);
            }

            float var9 = var4;
            byte var32 = (byte)((isMatchingToolClass(var0, var1)) ? 1 : 0);
            if (var32 != (1975348281 ^ var56)) {
               var56 = 348127914 ^ var56;
               float var50 = 1000.0F;
               float var34 = var4 + var50;
               var9 = var34;
               var56 = 680164967 ^ var56;
            } else {
               var56 = 51136401 ^ var56;
               byte var37 = (byte)((var0.isCorrectToolForDrops(var1)) ? 1 : 0);
               if (var37 != (1991322536 ^ var56)) {
                  var56 = 1659081438 ^ var56;
                  float var52 = 500.0F;
                  float var39 = var4 + var52;
                  var9 = var39;
                  var56 = 1571137922 ^ var56;
               } else {
                  var56 = batlbwwfrbzmzege(var56, 1061567324);
               }
            }

            return var9;
         }

         float var53 = 2000.0F;
         return var12 + var53;
      }
   }

   private static boolean isMatchingToolClass(ItemStack var0, BlockState var1) {
      int var43 = 179379644 ^ 78852675 ^ 1610327272;
      var43 = 1887299015 ^ var43;
      TagKey var3 = BlockTags.MINEABLE_WITH_AXE;
      byte var4 = (byte)((var1.is(var3)) ? 1 : 0);
      if (var4 != (562327248 ^ var43)) {
         var43 = 1155457534 ^ var43;
         TagKey var31 = ItemTags.AXES;
         byte var6 = (byte)((var0.is(var31)) ? 1 : 0);
         if (var6 != (1700433710 ^ var43)) {
            var43 = 177504497 ^ var43;
            return (((byte)(1875775454 ^ var43)) != 0);
         }

         var43 = 1967428610 ^ var43;
      } else {
         var43 = batlbwwfrbzmzege(var43, 832206332);
      }

      TagKey var32 = BlockTags.MINEABLE_WITH_PICKAXE;
      byte var9 = (byte)((var1.is(var32)) ? 1 : 0);
      if (var9 != (270408492 ^ var43)) {
         var43 = 193663678 ^ var43;
         TagKey var33 = ItemTags.PICKAXES;
         byte var11 = (byte)((var0.is(var33)) ? 1 : 0);
         if (var11 != (462752146 ^ var43)) {
            var43 = 714127530 ^ var43;
            return (((byte)(822456633 ^ var43)) != 0);
         }

         var43 = batlbwwfrbzmzege(var43, 965180789);
      } else {
         label70:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var43)) {
               case 233497841:
                  break;
               case 255476923:
                  var43 ^= 839675851;
               case 840240263:
                  break label70;
               case 1665401139:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }

      TagKey var34 = BlockTags.MINEABLE_WITH_SHOVEL;
      byte var14 = (byte)((var1.is(var34)) ? 1 : 0);
      if (var14 != (571634919 ^ var43)) {
         var43 = 681228430 ^ var43;
         TagKey var35 = ItemTags.SHOVELS;
         byte var16 = (byte)((var0.is(var35)) ? 1 : 0);
         if (var16 != (176737385 ^ var43)) {
            var43 = 785263765 ^ var43;
            return (((byte)(608624893 ^ var43)) != 0);
         }

         var43 = batlbwwfrbzmzege(var43, 770903903);
      } else {
         var43 = 90814417 ^ var43;
      }

      TagKey var36 = BlockTags.MINEABLE_WITH_HOE;
      byte var19 = (byte)((var1.is(var36)) ? 1 : 0);
      if (var19 != (662422326 ^ var43)) {
         var43 = 841121722 ^ var43;
         TagKey var37 = ItemTags.HOES;
         byte var21 = (byte)((var0.is(var37)) ? 1 : 0);
         if (var21 != (358202508 ^ var43)) {
            var43 = 1889369442 ^ var43;
            return (((byte)(1707393519 ^ var43)) != 0);
         }

         label60:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var43)) {
               case 157141014:
                  var43 ^= 729526700;
                  break label60;
               case 419722838:
               default:
                  throw new RuntimeException(new IOException());
               case 1180263093:
                  break label60;
               case 2116264359:
            }
         }
      } else {
         var43 = 425315862 ^ var43;
      }

      TagKey var38 = BlockTags.LEAVES;
      byte var24 = (byte)((var1.is(var38)) ? 1 : 0);
      if (var24 == (1042418976 ^ var43)) {
         var43 = 2142970794 ^ var43;
         net.minecraft.world.level.block.Block var39 = Blocks.COBWEB;
         byte var26 = (byte)((var1.is(var39)) ? 1 : 0);
         if (var26 == (1100557962 ^ var43)) {
            var43 = batlbwwfrbzmzege(var43, 1817100206);
            return (((byte)(769102116 ^ var43)) != 0);
         }

         var43 = 615027848 ^ var43;
      } else {
         var43 = batlbwwfrbzmzege(var43, 1528018722);
      }

      Item var40 = Items.SHEARS;
      byte var28 = (byte)((var0.is(var40)) ? 1 : 0);
      if (var28 != (1697757698 ^ var43)) {
         var43 = 938369792 ^ var43;
         return (((byte)(1390401795 ^ var43)) != 0);
      } else {
         var43 = batlbwwfrbzmzege(var43, 1223043878);
         return (((byte)(769102116 ^ var43)) != 0);
      }
   }

   static {
      int var6 = 2129813704 ^ 326135207 ^ Integer.parseInt("1171342729");
      int var3 = new Random(4855336210393181485L).nextInt();
      nociEQrlkn = 685053222 ^ var3;
      var6 = 732089955 ^ var6;
      j var0 = new j();
      INSTANCE = var0;
   }

   public static String csmwuhjyje(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] kgbozplkmlylxbc() {
      return new byte[]{
         125,
         55,
         77,
         74,
         22,
         96,
         86,
         77,
         113,
         111,
         48,
         102,
         22,
         43,
         15,
         39,
         12,
         28,
         27,
         92,
         5,
         88,
         101,
         12,
         76,
         109,
         40,
         124,
         59,
         73,
         5,
         85,
         99,
         20,
         47,
         78,
         104,
         84,
         60,
         61,
         20,
         32,
         113,
         52,
         62,
         92,
         104,
         52,
         111,
         23,
         120,
         74,
         79,
         3,
         32,
         44,
         118,
         78,
         62,
         47,
         108,
         53,
         108,
         11,
         11,
         36,
         20,
         84,
         30,
         111,
         24,
         52,
         108,
         106,
         69,
         23,
         87,
         33,
         59,
         43,
         54,
         114,
         84,
         52,
         41,
         81,
         101,
         116,
         67,
         52,
         120,
         93,
         107,
         124,
         25,
         9,
         98,
         27,
         7,
         45,
         103,
         115,
         29,
         29,
         74,
         4,
         40,
         11,
         70,
         36,
         37,
         121,
         22,
         4,
         55,
         113,
         93,
         70,
         101,
         123,
         44,
         5,
         110,
         38,
         24
      };
   }

   private static int batlbwwfrbzmzege(int var0, int var1) {
      return var0 ^ var1;
   }
}
