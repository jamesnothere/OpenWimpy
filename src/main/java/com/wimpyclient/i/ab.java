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
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.HitResult.Type;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class ab {
   public static final ab INSTANCE;
   private int tickCounter;
   private int currentDelay;
   private static int rtWrf4W5h1;
   private transient int AMJljgmjrq;

   private ab() {
super();
      int var6 = 267222122 ^ 530018725;
      
      var6 = amzmxzxwhscobtgk(var6, 1358529815);
      var6 = 1459163453 ^ 1112188258 ^ Integer.parseInt("1412447367");
      this.AMJljgmjrq = 628823337 ^ rtWrf4W5h1;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var6)) {
            case 218012065:
               var6 = 1061737912 ^ var6;
            case 1502702656:
               byte var2 = 10;
               this.currentDelay = var2;
               return;
            case 688700498:
               break;
            case 1447669383:
            default:
               throw new RuntimeException();
         }
      }
   }

   public void tick(Minecraft var1) {
      int var111 = 726694861 ^ 337746876 ^ 2005270262;
      var111 = 532515172 ^ var111;
      byte var2 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var2 == (1464440803 ^ var111)) {
         var111 = 601065903 ^ var111;
         byte var3 = (byte)(1956257356 ^ var111);
         this.tickCounter = var3;
      } else {
         label287: {
            label283: {
               x var12;
               LocalPlayer var35;
               Entity var45;
               label214:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                     case 153010446:
                        var111 ^= 776661428;
                     case 1887112138:
                        var12 = x.INSTANCE;
                        v var14 = var12.triggerbot;
                        byte var15 = (byte)((var14.qo()) ? 1 : 0);
                        if (var15 == (2030272087 ^ var111)) {
                           var111 = 1993623759 ^ var111;
                           byte var103 = (byte)(265762456 ^ var111);
                           this.tickCounter = var103;
                           return;
                        }

                        var111 = 1014188565 ^ var111;
                        LocalPlayer var17 = var1.player;
                        if (var17 == null) {
                           var111 = amzmxzxwhscobtgk(var111, 646228751);
                           return;
                        }

                        var111 = 1277325152 ^ var111;
                        MultiPlayerGameMode var19 = var1.gameMode;
                        if (var19 == null) {
                           var111 = amzmxzxwhscobtgk(var111, 1789314159);
                           return;
                        }

                        var111 = 1263288340 ^ var111;
                        ClientLevel var21 = var1.level;
                        if (var21 == null) {
                           var111 = 569017467 ^ var111;
                           return;
                        }

                        label211:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                              case 1709734:
                                 var111 ^= 417188159;
                                 break label211;
                              case 341308383:
                                 break;
                              case 1122837815:
                              default:
                                 throw new RuntimeException();
                              case 1677876216:
                                 break label211;
                           }
                        }

                        Screen var23 = var1.screen;
                        if (var23 != null) {
                           var111 = amzmxzxwhscobtgk(var111, 875949972);
                           return;
                        }

                        var111 = 2100322559 ^ var111;
                        com.wimpyclient.g.g var24 = com.wimpyclient.g.g.INSTANCE;
                        byte var25 = (byte)((var24.isOpen()) ? 1 : 0);
                        if (var25 != (670282486 ^ var111)) {
                           var111 = 1225101163 ^ var111;
                           return;
                        }

                        var111 = 908896988 ^ var111;
                        q var26 = q.INSTANCE;
                        byte var27 = (byte)((var26.isActive()) ? 1 : 0);
                        if (var27 != (299833386 ^ var111)) {
                           var111 = 1613196878 ^ var111;
                           return;
                        }

                        var111 = 314186243 ^ var111;
                        r var28 = r.INSTANCE;
                        byte var29 = (byte)((var28.isActive()) ? 1 : 0);
                        if (var29 != (56951337 ^ var111)) {
                           var111 = 1922921549 ^ var111;
                           return;
                        }

                        var111 = 1496566896 ^ var111;
                        d var30 = d.INSTANCE;
                        byte var31 = (byte)((var30.isBusy()) ? 1 : 0);
                        if (var31 == (1515638361 ^ var111)) {
                           var111 = 1554652455 ^ var111;
                           c var32 = c.INSTANCE;
                           byte var33 = (byte)((var32.isBusy()) ? 1 : 0);
                           if (var33 != (117232510 ^ var111)) {
                              var111 = 118149764 ^ var111;
                              return;
                           }

                           var111 = amzmxzxwhscobtgk(var111, 1294039142);
                           var35 = var1.player;
                           HitResult var37 = var1.hitResult;
                           byte var39 = (byte)((var37 instanceof EntityHitResult) ? 1 : 0);
                           if (var39 != (1272818456 ^ var111)) {
                              var111 = 248542282 ^ var111;
                              EntityHitResult var41 = (EntityHitResult)var37;
                              Type var43 = var41.getType();
                              Type var86 = Type.ENTITY;
                              if (var43 != var86) {
                                 var111 = 308565512 ^ var111;
                                 break label287;
                              }

                              var111 = amzmxzxwhscobtgk(var111, 531008912);
                              var45 = var41.getEntity();
                              byte var47 = (byte)((var45 instanceof LivingEntity) ? 1 : 0);
                              if (var47 == (1521177282 ^ var111)) {
                                 var111 = amzmxzxwhscobtgk(var111, 588634776);
                                 break label283;
                              }

                              var111 = 1244283466 ^ var111;
                              if (var45 != var35) {
                                 var111 = 2102928079 ^ var111;
                                 byte var50 = (byte)((isValidTarget(var35, var45, var12)) ? 1 : 0);
                                 if (var50 == (1842950727 ^ var111)) {
                                    var111 = 342342173 ^ var111;
                                    break label283;
                                 }

                                 var111 = amzmxzxwhscobtgk(var111, 862097558);
                                 byte var52 = (byte)((var12.triggerbotOnlyItem) ? 1 : 0);
                                 if (var52 != (1589355217 ^ var111)) {
                                    var111 = 1350791303 ^ var111;
                                    ItemStack var54 = var35.getMainHandItem();
                                    String var90 = var12.triggerbotItemFilter;
                                    byte var55 = (byte)((itemAllowed(var54, var90)) ? 1 : 0);
                                    if (var55 == (238604886 ^ var111)) {
                                       var111 = 63633196 ^ var111;
                                       return;
                                    }

                                    label171:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                          case 56918119:
                                             break;
                                          case 193862078:
                                             var111 ^= 1428061701;
                                          case 1095785796:
                                             break label171;
                                          case 1190895908:
                                          default:
                                             throw new RuntimeException();
                                       }
                                    }
                                 } else {
                                    var111 = 94178946 ^ var111;
                                 }

                                 byte var57 = (byte)((var12.triggerbotOnlyCrit) ? 1 : 0);
                                 if (var57 != (1529261139 ^ var111)) {
                                    var111 = 1686230074 ^ var111;
                                    byte var59 = (byte)((var35.onGround()) ? 1 : 0);
                                    if (var59 != (1067939945 ^ var111)) {
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                             case 190072556:
                                                var111 = 1023875057 ^ var111;
                                                return;
                                             case 1292157298:
                                                return;
                                             case 1934378686:
                                                break;
                                             case 1986165568:
                                             default:
                                                throw new RuntimeException();
                                          }
                                       }
                                    }

                                    var111 = 1643594184 ^ var111;
                                    double var61 = var35.fallDistance;
                                    double var104 = 0.0;
                                    double var149;
                                    int var63 = (var149 = var61 - var104) == 0.0 ? 0 : (var149 < 0.0 ? -1 : 1);
                                    if (var63 <= (1582315937 ^ var111)) {
                                       var111 = 1559254585 ^ var111;
                                       return;
                                    }

                                    label162:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                          case 112931319:
                                             var111 ^= 922695753;
                                          case 837537478:
                                             break label162;
                                          case 1277179932:
                                             break;
                                          case 1768507226:
                                          default:
                                             throw new RuntimeException();
                                       }
                                    }
                                 } else {
                                    label156:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                          case 10139334:
                                             var111 ^= 864660923;
                                             break label156;
                                          case 936823802:
                                             break;
                                          case 1215908270:
                                          default:
                                             throw new RuntimeException();
                                          case 2003956738:
                                             break label156;
                                       }
                                    }
                                 }

                                 byte var65 = (byte)((var12.triggerbotCheckShield) ? 1 : 0);
                                 if (var65 != (1756299752 ^ var111)) {
                                    var111 = 105807142 ^ var111;
                                    byte var67 = (byte)((var45 instanceof Player) ? 1 : 0);
                                    if (var67 != (1860271310 ^ var111)) {
                                       var111 = 314049532 ^ var111;
                                       Player var69 = (Player)var45;
                                       byte var71 = (byte)((var69.isBlocking()) ? 1 : 0);
                                       if (var71 != (2086240050 ^ var111)) {
                                          var111 = 2102140827 ^ var111;
                                          return;
                                       }

                                       var111 = amzmxzxwhscobtgk(var111, 406658065);
                                    } else {
                                       var111 = 176496621 ^ var111;
                                    }
                                 } else {
                                    label148:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                          case 181631774:
                                             var111 ^= 214655691;
                                             break label148;
                                          case 702987587:
                                             break;
                                          case 852780221:
                                          default:
                                             throw new RuntimeException();
                                          case 1283575278:
                                             break label148;
                                       }
                                    }
                                 }

                                 float var91 = 0.5F;
                                 float var73 = var35.getAttackStrengthScale(var91);
                                 float var92 = 1.0F;
                                 float var150;
                                 int var74 = (var150 = var73 - var92) == 0.0F ? 0 : (var150 < 0.0F ? -1 : 1);
                                 if (var74 < (1684300579 ^ var111)) {
                                    var111 = 1776714655 ^ var111;
                                    return;
                                 }

                                 label140:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                       case 42132599:
                                          var111 ^= 1131022067;
                                       case 961145681:
                                          break label140;
                                       case 1324955789:
                                       default:
                                          throw new RuntimeException();
                                       case 1910453547:
                                    }
                                 }

                                 int var93 = this.tickCounter;
                                 byte var106 = (byte)(655254993 ^ var111);
                                 int var94 = var93 + var106;
                                 this.tickCounter = var94;
                                 int var77 = this.tickCounter;
                                 int var96 = this.currentDelay;
                                 if (var77 < var96) {
                                    var111 = 1871744129 ^ var111;
                                    return;
                                 }

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                       case 78432729:
                                          break;
                                       case 195805773:
                                          var111 ^= 698954635;
                                          break label214;
                                       case 516819378:
                                       default:
                                          throw new RuntimeException();
                                       case 1390872759:
                                          break label214;
                                    }
                                 }
                              }

                              var111 = 1765775570 ^ var111;
                              break label283;
                           }

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                                 case 50147491:
                                    var111 ^= 481567298;
                                    break label287;
                                 case 779298850:
                                 default:
                                    throw new RuntimeException();
                                 case 836569619:
                                    break;
                                 case 1408295666:
                                    break label287;
                              }
                           }
                        }

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var111)) {
                              case 252212634:
                                 var111 = 1537265571 ^ var111;
                                 return;
                              case 389961313:
                                 return;
                              case 1156651622:
                              default:
                                 throw new RuntimeException();
                              case 2007845690:
                           }
                        }
                     case 907893882:
                     default:
                        throw new RuntimeException();
                     case 956531953:
                  }
               }

               MultiPlayerGameMode var79 = var1.gameMode;
               var79.attack(var35, var45);
               InteractionHand var98 = InteractionHand.MAIN_HAND;
               var35.swing(var98);
               byte var99 = (byte)(245847643 ^ var111);
               this.tickCounter = var99;
               this.randomizeDelay(var1, var12);
               return;
            }

            byte var101 = (byte)(2042529882 ^ var111);
            this.tickCounter = var101;
            return;
         }

         byte var102 = (byte)(1466534234 ^ var111);
         this.tickCounter = var102;
      }
   }

   private void randomizeDelay(Minecraft var1, x var2) {
      int var31 = 1723956740 ^ 1848117635 ^ 2005270262;
      var31 = 106675745 ^ var31;
      int var10 = var2.triggerbotMinDelay;
      int var16 = var2.triggerbotMaxDelay;
      int var11 = Math.min(var10, var16);
      int var13 = var2.triggerbotMinDelay;
      int var18 = var2.triggerbotMaxDelay;
      int var14 = Math.max(var13, var18);
      int var21;
      if (var11 >= var14) {
         var31 = 747890903 ^ var31;
         var21 = var11;
         var31 = amzmxzxwhscobtgk(var31, 1154836677);
      } else {
         var31 = 528296512 ^ var31;
         ClientLevel var23 = var1.level;
         RandomSource var24 = var23.getRandom();
         int var26 = var14 - var11;
         byte var28 = (byte)(1716133137 ^ var31);
         int var27 = var26 + var28;
         int var25 = var24.nextInt(var27);
         var21 = var11 + var25;
         var31 = 2000398930 ^ var31;
      }

      this.currentDelay = var21;
   }

   private static boolean itemAllowed(ItemStack var0, String var1) {
      int var22 = 416136482 ^ 629501472 ^ 1392438239;
      var22 = 729540809 ^ var22;
      String var16;
      if (var1 == null) {
         var22 = 1707460083 ^ var22;
         var16 = gehssnxmif(thsxjgcwypenvfj(), oqqfwgdftwfqhoa(), var22);
         var22 = 1673782353 ^ var22;
      } else {
         label34:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
               case 89032683:
                  var22 ^= 1681073562;
               case 311483690:
                  break label34;
               case 361546701:
               default:
                  throw new RuntimeException();
               case 1349606383:
            }
         }

         var16 = var1.trim();
         var22 = 1647641656 ^ var22;
      }

      String var3 = gehssnxmif(xglinlhhlzxlmfb(), oqqfwgdftwfqhoa(), var22);
      byte var6 = (byte)((var16.equalsIgnoreCase(var3)) ? 1 : 0);
      if (var6 != (1120661942 ^ var22)) {
         var22 = 528888253 ^ var22;
         TagKey var17 = ItemTags.AXES;
         return var0.is(var17);
      } else {
         var22 = 683581725 ^ var22;
         String var18 = gehssnxmif(vijrlkkpmhgqvyk(), oqqfwgdftwfqhoa(), var22);
         byte var10 = (byte)((var16.equalsIgnoreCase(var18)) ? 1 : 0);
         if (var10 != (1786073259 ^ var22)) {
            var22 = 1985243539 ^ var22;
            return var0.isEmpty();
         } else {
            label27:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                  case 53862303:
                  default:
                     throw new RuntimeException();
                  case 239281726:
                     var22 = 1694585472 ^ var22;
                     break label27;
                  case 1341486851:
                     break;
                  case 1920877486:
                     break label27;
               }
            }

            TagKey var19 = ItemTags.SWORDS;
            return var0.is(var19);
         }
      }
   }

   private static boolean isValidTarget(LocalPlayer var0, Entity var1, x var2) {
      int var33 = 1840652998 ^ 233303049 ^ 1392438239;
      var33 = 947702137 ^ var33;
      if (var1 != null) {
         var33 = 538309078 ^ var33;
         if (var1 != var0) {
            var33 = 356424914 ^ var33;
            byte var8 = (byte)((var1 instanceof p) ? 1 : 0);
            if (var8 == (1073250669 ^ var33)) {
               var33 = 1137287089 ^ var33;
               byte var10 = (byte)((var1 instanceof LivingEntity) ? 1 : 0);
               if (var10 != (2083593948 ^ var33)) {
                  var33 = 969038592 ^ var33;
                  LivingEntity var12 = (LivingEntity)var1;
                  byte var14 = (byte)((var12.isAlive()) ? 1 : 0);
                  if (var14 == (1173571036 ^ var33)) {
                     var33 = 1410700193 ^ var33;
                     return (((byte)(300340861 ^ var33)) != 0);
                  }

                  var33 = 435019564 ^ var33;
                  byte var16 = (byte)((var12.isDeadOrDying()) ? 1 : 0);
                  if (var16 != (1545509616 ^ var33)) {
                     var33 = 1308118157 ^ var33;
                     return (((byte)(300340861 ^ var33)) != 0);
                  }

                  label64:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                        case 41619503:
                           var33 ^= 2304110;
                           break label64;
                        case 251636014:
                           break;
                        case 1280589976:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1387399974:
                           break label64;
                     }
                  }

                  byte var18 = (byte)((var1 instanceof ArmorStand) ? 1 : 0);
                  if (var18 != (1547547294 ^ var33)) {
                     var33 = 236367708 ^ var33;
                     return (((byte)(1378557378 ^ var33)) != 0);
                  }

                  var33 = amzmxzxwhscobtgk(var33, 1882478662);
                  byte var20 = (byte)((var1 instanceof Player) ? 1 : 0);
                  if (var20 != (738847448 ^ var33)) {
                     var33 = 2141208625 ^ var33;
                     byte var24 = (byte)((var2.triggerbotPlayers) ? 1 : 0);
                     if (var24 != (1403628265 ^ var33)) {
                        var33 = 100233958 ^ var33;
                        byte var26 = (byte)((var1 instanceof LocalPlayer) ? 1 : 0);
                        if (var26 == (1448138767 ^ var33)) {
                           var33 = 181716978 ^ var33;
                           byte var27 = (byte)(1552162812 ^ var33);
                           var33 = amzmxzxwhscobtgk(var33, 191403171);
                           return (var27 != 0);
                        }

                        var33 = amzmxzxwhscobtgk(var33, 1499740069);
                     } else {
                        var33 = amzmxzxwhscobtgk(var33, 1553810755);
                     }

                     byte var50 = (byte)(255127466 ^ var33);
                     var33 = 1490576628 ^ var33;
                     return (var50 != 0);
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                        case 89332491:
                           var33 = 1198165192 ^ var33;
                           return var2.triggerbotMobs;
                        case 213710653:
                           return var2.triggerbotMobs;
                        case 1305527174:
                           break;
                        case 2002812790:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               } else {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                        case 10442747:
                           var33 ^= 1842858145;
                           return (((byte)(300340861 ^ var33)) != 0);
                        case 1065457593:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1405263977:
                           return (((byte)(300340861 ^ var33)) != 0);
                        case 1628346592:
                     }
                  }
               }
            }

            var33 = 25626993 ^ var33;
         } else {
            var33 = 347706787 ^ var33;
         }
      } else {
         var33 = 883713141 ^ var33;
      }

      return (((byte)(1048545308 ^ var33)) != 0);
   }

   static {
      int var6 = 685785485 ^ 765261534 ^ Integer.parseInt("1412447367");
      int var3 = new Random(-3371037234415696262L).nextInt();
      rtWrf4W5h1 = -597457171 ^ var3;
      var6 = 1274369472 ^ var6;
      ab var0 = new ab();
      INSTANCE = var0;
   }

   public static String gehssnxmif(byte[] var0, byte[] var1, int var2) {
      String var11 = Integer.toString(var2);
      byte[] var12 = var11.getBytes();
      byte[] var9 = var12;
      byte var13 = 0;
      int var10 = var13;

      while (true) {
         int var18 = var0.length;
         if (var10 >= var18) {
            Charset var6 = StandardCharsets.UTF_16;
            return new String(var0, var6);
         }

         byte var21 = var0[var10];
         int var34 = var9.length;
         int var31 = var10 % var34;
         byte var28 = var9[var31];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var10] = var23;
         byte var24 = var0[var10];
         int var36 = var1.length;
         int var33 = var10 % var36;
         byte var30 = var1[var33];
         int var25 = var24 ^ var30;
         byte var26 = (byte)var25;
         var0[var10] = var26;
         var10++;
      }
   }

   private static byte[] oqqfwgdftwfqhoa() {
      return new byte[]{
         36,
         89,
         27,
         105,
         37,
         37,
         25,
         71,
         101,
         119,
         78,
         56,
         38,
         11,
         23,
         9,
         120,
         102,
         11,
         28,
         115,
         18,
         11,
         30,
         29,
         91,
         24,
         95,
         23,
         81,
         119,
         13,
         7,
         29,
         59,
         68,
         64,
         119,
         59,
         76,
         24,
         107,
         65,
         95,
         12,
         66,
         104,
         5,
         103,
         69,
         3,
         9,
         1,
         55,
         99,
         74,
         9,
         44,
         114,
         95,
         84,
         56,
         123,
         74,
         54,
         27,
         6,
         31,
         120,
         42,
         59,
         76,
         95,
         48,
         101,
         105,
         118,
         39,
         85,
         26,
         84,
         12,
         49,
         49,
         87,
         87,
         76,
         86,
         116,
         94,
         111,
         33,
         79,
         97,
         81,
         79,
         115
      };
   }

   private static byte[] xglinlhhlzxlmfb() {
      return new byte[]{-21, -105, 41, 24, 19, 107, 40, 27};
   }

   private static byte[] vijrlkkpmhgqvyk() {
      return new byte[]{-21, -111, 35, 23, 21, 115, 42, 27, 80, 42};
   }

   private static byte[] thsxjgcwypenvfj() {
      return new byte[]{-17, -109, 47, 11, 18, 106, 41, 26, 86, 48, 123, 104};
   }

   private static int amzmxzxwhscobtgk(int var0, int var1) {
      return var1 ^ var0;
   }
}
