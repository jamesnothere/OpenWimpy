package com.wimpyclient.p;

import com.wimpyclient.mixin.aj;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class c {
   private static int z33SkxzEwz;
   private transient int iaKZBNctly;

   private c() {
super();
      int var4 = 460798192 ^ 452759001;
      
      var4 = 749777102 ^ var4;
      var4 = 994155522 ^ 446411191 ^ Integer.parseInt("216082514");
      this.iaKZBNctly = 420302178 ^ z33SkxzEwz;
      var4 = zmiectqaqwdyqbxo(var4, 1447279228);
   }

   public static boolean place(Minecraft var0, LocalPlayer var1, InteractionHand var2, BlockPos var3, Direction var4, Vec3 var5) {
      int var33 = 656844436 ^ 1604521809 ^ 1261756144;
      var33 = 282128307 ^ var33;
      if (var0 != null) {
         var33 = 1396871225 ^ var33;
         if (var1 != null) {
            var33 = 268666584 ^ var33;
            if (var2 != null) {
               var33 = 740828052 ^ var33;
               if (var3 != null) {
                  var33 = 1400119078 ^ var33;
                  if (var4 != null) {
                     var33 = 580004833 ^ var33;
                     if (var5 != null) {
                        var33 = 646250215 ^ var33;
                        float[] var19 = j.anglesTo(var1, var5);
                        byte var8 = (byte)(459958227 ^ var33);
                        float var25 = var19[var8];
                        byte var9 = (byte)(459958226 ^ var33);
                        float var28 = var19[var9];
                        j.apply(var1, var25, var28);
                        return placeSettled(var0, var1, var2, var3, var4, var5);
                     }

                     var33 = 1104024944 ^ var33;
                  } else {
                     var33 = 1666989713 ^ var33;
                  }
               } else {
                  var33 = 807936439 ^ var33;
               }
            } else {
               var33 = zmiectqaqwdyqbxo(var33, 469762595);
            }
         } else {
            var33 = zmiectqaqwdyqbxo(var33, 201557243);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
               case 76362978:
                  var33 ^= 1598100674;
                  return (((byte)(2082507844 ^ var33)) != 0);
               case 186766023:
               default:
                  throw new RuntimeException();
               case 478824803:
                  break;
               case 805153729:
                  return (((byte)(2082507844 ^ var33)) != 0);
            }
         }
      }

      return (((byte)(2082507844 ^ var33)) != 0);
   }

   public static boolean placeSettled(Minecraft var0, LocalPlayer var1, InteractionHand var2, BlockPos var3, Direction var4, Vec3 var5) {
      int var79 = 364393320 ^ 1948983945 ^ 1261756144;
      var79 = 660289388 ^ var79;
      if (var0 != null) {
         var79 = 724349699 ^ var79;
         if (var1 == null) {
            var79 = 1468592396 ^ var79;
            return (((byte)(1901640306 ^ var79)) != 0);
         } else {
            var79 = 1307336978 ^ var79;
            if (var2 == null) {
               var79 = 442798110 ^ var79;
               return (((byte)(1901640306 ^ var79)) != 0);
            } else {
               var79 = 1016280141 ^ var79;
               if (var3 == null) {
                  var79 = 653763667 ^ var79;
                  return (((byte)(1901640306 ^ var79)) != 0);
               } else {
                  var79 = 1671881535 ^ var79;
                  if (var4 != null) {
                     var79 = 1953924356 ^ var79;
                     if (var5 == null) {
                        var79 = 824689256 ^ var79;
                        return (((byte)(1901640306 ^ var79)) != 0);
                     } else {
                        label97:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                              case 196478286:
                              default:
                                 throw new RuntimeException();
                              case 217495757:
                                 var79 ^= 1629589423;
                              case 1525290638:
                                 break label97;
                              case 1802759198:
                           }
                        }

                        MultiPlayerGameMode var20 = var0.gameMode;
                        if (var20 == null) {
                           var79 = 506276205 ^ var79;
                           return (((byte)(1064558296 ^ var79)) != 0);
                        } else {
                           var79 = zmiectqaqwdyqbxo(var79, 66429262);
                           MultiPlayerGameMode var23 = var0.gameMode;
                           byte var25 = (byte)((var23 instanceof aj) ? 1 : 0);
                           if (var25 != (581654267 ^ var79)) {
                              var79 = 109104316 ^ var79;
                              aj var27 = (aj)var23;
                              var27.wimpyclient$syncCarriedItem();
                              var79 = 1281462160 ^ var79;
                           } else {
                              label88:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                                    case 53205549:
                                       var79 ^= 1256276780;
                                       break label88;
                                    case 644767943:
                                    default:
                                       throw new RuntimeException();
                                    case 1646403530:
                                       break;
                                    case 2119436316:
                                       break label88;
                                 }
                              }
                           }

                           ClientLevel var30 = var0.level;
                           BlockHitResult var31 = resolveHit(var30, var1, var3, var4, var5);
                           BlockHitResult var75 = var31;
                           if (var31 == null) {
                              var79 = 237819999 ^ var79;
                              ClientLevel var34 = var0.level;
                              label80:
                              if (var34 != null) {
                                 var79 = 753114078 ^ var79;
                                 ClientLevel var36 = var0.level;
                                 byte var37 = (byte)((hasLineOfSight(var36, var1, var3, var5, var4)) ? 1 : 0);
                                 if (var37 == (1250252374 ^ var79)) {
                                    var79 = 389993933 ^ var79;
                                    byte var39 = (byte)((var1.isCrouching()) ? 1 : 0);
                                    if (var39 == (1572570011 ^ var79)) {
                                       var79 = 1708556556 ^ var79;
                                       break label80;
                                    }

                                    var79 = 1460400325 ^ var79;
                                    Axis var41 = var4.getAxis();
                                    byte var42 = (byte)((var41.isHorizontal()) ? 1 : 0);
                                    if (var42 == (179336030 ^ var79)) {
                                       var79 = zmiectqaqwdyqbxo(var79, 853373385);
                                       break label80;
                                    }

                                    var79 = 1334304785 ^ var79;
                                    ClientLevel var44 = var0.level;
                                    Object var73 = null;
                                    byte var45 = (byte)((hasLineOfSight(var44, var1, var3, var5, (Direction)var73)) ? 1 : 0);
                                    if (var45 == (1161270095 ^ var79)) {
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                                             case 102492254:
                                                var79 ^= 2103087576;
                                                break label80;
                                             case 518328590:
                                                break;
                                             case 1187837083:
                                             default:
                                                throw new RuntimeException();
                                             case 2110033663:
                                                break label80;
                                          }
                                       }
                                    }

                                    var79 = 675896883 ^ var79;
                                 } else {
                                    var79 = 670800682 ^ var79;
                                 }

                                 byte var11 = (byte)(1837026684 ^ var79);
                                 BlockHitResult var46 = new BlockHitResult(var5, var4, var3, (var11 != 0));
                                 var75 = var46;
                                 var79 = 1427361771 ^ var79;
                              } else {
                                 var79 = 1577832223 ^ var79;
                              }
                           } else {
                              label64:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                                    case 168813082:
                                       var79 ^= 1344739136;
                                    case 172881480:
                                       break label64;
                                    case 334474126:
                                    default:
                                       throw new RuntimeException();
                                    case 615354354:
                                 }
                              }
                           }

                           if (var75 == null) {
                              var79 = 1705293008 ^ var79;
                              return (((byte)(1573500487 ^ var79)) != 0);
                           } else {
                              var79 = zmiectqaqwdyqbxo(var79, 524824574);
                              var0.hitResult = var75;
                              MultiPlayerGameMode var50 = var0.gameMode;
                              InteractionResult var51 = var50.useItemOn(var1, var2, var75);
                              byte var53 = (byte)((var51.consumesAction()) ? 1 : 0);
                              if (var53 != (656747881 ^ var79)) {
                                 var79 = 1012993801 ^ var79;
                                 var1.swing(var2);
                                 return (((byte)(457450081 ^ var79)) != 0);
                              } else {
                                 var79 = 808980944 ^ var79;
                                 return (((byte)(387792057 ^ var79)) != 0);
                              }
                           }
                        }
                     }
                  } else {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                           case 80965219:
                              var79 ^= 1162954604;
                              return (((byte)(1901640306 ^ var79)) != 0);
                           case 195397166:
                              return (((byte)(1901640306 ^ var79)) != 0);
                           case 237173374:
                              break;
                           case 1514724385:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  }
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
               case 186264718:
                  var79 ^= 2091139599;
                  return (((byte)(1901640306 ^ var79)) != 0);
               case 567190005:
                  return (((byte)(1901640306 ^ var79)) != 0);
               case 1066326199:
                  break;
               case 1235733374:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   public static boolean pourBucketSettled(Minecraft var0, LocalPlayer var1, InteractionHand var2, BlockPos var3, Direction var4, Vec3 var5, BlockPos var6) {
      int var97 = 1535903537 ^ 1266730183 ^ 1261756144;
      var97 = 1530732571 ^ var97;
      if (var0 == null) {
         var97 = 227715702 ^ var97;
      } else {
         var97 = 981000880 ^ var97;
         if (var1 != null) {
            var97 = 1491184246 ^ var97;
            if (var2 == null) {
               var97 = zmiectqaqwdyqbxo(var97, 1863049904);
            } else {
               var97 = 1080175629 ^ var97;
               if (var3 != null) {
                  var97 = 1398983839 ^ var97;
                  if (var4 == null) {
                     var97 = 2081096226 ^ var97;
                     return (((byte)(228038507 ^ var97)) != 0);
                  }

                  var97 = 620139268 ^ var97;
                  MultiPlayerGameMode var23 = var0.gameMode;
                  if (var23 == null) {
                     var97 = zmiectqaqwdyqbxo(var97, 1194698456);
                     return (((byte)(308256917 ^ var97)) != 0);
                  }

                  var97 = 176520820 ^ var97;
                  ClientLevel var25 = var0.level;
                  if (var25 == null) {
                     var97 = 1303435436 ^ var97;
                     return (((byte)(308256917 ^ var97)) != 0);
                  }

                  label99:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var97)) {
                        case 165652225:
                           var97 ^= 579628644;
                        case 580035922:
                           break label99;
                        case 1212145000:
                           break;
                        case 1572636899:
                        default:
                           throw new IllegalStateException();
                     }
                  }

                  BlockPos var27;
                  if (var6 != null) {
                     var97 = 2111709883 ^ var97;
                     var27 = var6;

                     label90:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var97)) {
                           case 11624746:
                              var97 ^= 819397237;
                              break label90;
                           case 312165843:
                              break;
                           case 1409114008:
                           default:
                              throw new IllegalStateException();
                           case 1896023432:
                              break label90;
                        }
                     }
                  } else {
                     var97 = 908911750 ^ var97;
                     var27 = var3.relative(var4);
                     var97 = 2066072648 ^ var97;
                  }

                  BlockPos var29 = var3.relative(var4);
                  byte var30 = (byte)((var29.equals(var27)) ? 1 : 0);
                  if (var30 == (812267155 ^ var97)) {
                     var97 = 424970216 ^ var97;
                     return (((byte)(691974523 ^ var97)) != 0);
                  }

                  label82:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var97)) {
                        case 20450327:
                        default:
                           throw new IllegalStateException();
                        case 231602646:
                           var97 ^= 1706948984;
                        case 814143301:
                           break label82;
                        case 1779121637:
                     }
                  }

                  Vec3 var33 = faceCenterHit(var3, var4);
                  byte var35 = (byte)((isWithinReach(var1, var3, var33)) ? 1 : 0);
                  if (var35 == (1440206827 ^ var97)) {
                     var97 = 1936864451 ^ var97;
                     return (((byte)(648411944 ^ var97)) != 0);
                  }

                  var97 = zmiectqaqwdyqbxo(var97, 299971439);
                  float[] var37 = j.anglesTo(var1, var33);
                  byte var84 = (byte)(1144454276 ^ var97);
                  float var76 = var37[var84];
                  byte var10 = (byte)(1144454277 ^ var97);
                  float var86 = var37[var10];
                  byte var90 = (byte)(1144454277 ^ var97);
                  j.apply(var1, var76, var86, (var90 != 0));
                  ClientLevel var40 = var0.level;
                  BlockHitResult var41 = clipPour(var40, var1, var3, var4, var27);
                  if (var41 == null) {
                     var97 = 869469302 ^ var97;
                     return (((byte)(2011558130 ^ var97)) != 0);
                  }

                  label74:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var97)) {
                        case 69913865:
                           var97 ^= 2138777651;
                           break label74;
                        case 362898650:
                        default:
                           throw new IllegalStateException();
                        case 1582660404:
                           break label74;
                        case 1933166489:
                     }
                  }

                  MultiPlayerGameMode var45 = var0.gameMode;
                  byte var47 = (byte)((var45 instanceof aj) ? 1 : 0);
                  if (var47 != (994956471 ^ var97)) {
                     var97 = 1508293329 ^ var97;
                     aj var49 = (aj)var45;
                     var49.wimpyclient$syncCarriedItem();
                     var97 = 1350118309 ^ var97;
                  } else {
                     var97 = zmiectqaqwdyqbxo(var97, 161452404);
                  }

                  var0.hitResult = var41;
                  MultiPlayerGameMode var53 = var0.gameMode;
                  InteractionResult var54 = var53.useItemOn(var1, var2, var41);
                  byte var56 = (byte)((var54.consumesAction()) ? 1 : 0);
                  if (var56 != (852641219 ^ var97)) {
                     var97 = 1387672986 ^ var97;
                     var1.swing(var2);
                     return (((byte)(1617195096 ^ var97)) != 0);
                  }

                  var97 = 1630180693 ^ var97;
                  MultiPlayerGameMode var58 = var0.gameMode;
                  InteractionResult var59 = var58.useItem(var1, var2);
                  byte var61 = (byte)((var59.consumesAction()) ? 1 : 0);
                  if (var61 != (1408815254 ^ var97)) {
                     var97 = 1537482764 ^ var97;
                     var1.swing(var2);
                     return (((byte)(140308635 ^ var97)) != 0);
                  }

                  var97 = 1119130424 ^ var97;
                  return (((byte)(290210734 ^ var97)) != 0);
               } else {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var97)) {
                        case 63761648:
                           var97 ^= 795463357;
                           return (((byte)(228038507 ^ var97)) != 0);
                        case 543431994:
                        default:
                           throw new IllegalStateException();
                        case 1432193733:
                           return (((byte)(228038507 ^ var97)) != 0);
                        case 2017050414:
                     }
                  }
               }
            }
         } else {
            var97 = zmiectqaqwdyqbxo(var97, 938100934);
         }
      }

      return (((byte)(228038507 ^ var97)) != 0);
   }

   public static Vec3 faceCenterHit(BlockPos var0, Direction var1) {
      int var58 = 1145736344 ^ 89417714 ^ 1261756144;
      var58 = 1322724565 ^ var58;
      int var12 = var0.getX();
      double var13 = var12;
      double var4 = 0.5;
      double var15 = var13 + var4;
      int var20 = var1.getStepX();
      double var21 = var20;
      double var6 = 0.5;
      double var23 = var21 * var6;
      double var17 = var15 + var23;
      int var26 = var0.getY();
      double var27 = var26;
      double var33 = 0.5;
      double var29 = var27 + var33;
      int var36 = var1.getStepY();
      double var37 = var36;
      double var8 = 0.5;
      double var39 = var37 * var8;
      double var31 = var29 + var39;
      int var42 = var0.getZ();
      double var43 = var42;
      double var49 = 0.5;
      double var45 = var43 + var49;
      int var52 = var1.getStepZ();
      double var53 = var52;
      double var10 = 0.5;
      double var55 = var53 * var10;
      double var47 = var45 + var55;
      return new Vec3(var17, var31, var47);
   }

   private static BlockHitResult clipPour(Level var0, LocalPlayer var1, BlockPos var2, Direction var3, BlockPos var4) {
      int var78 = 1773623057 ^ 345889546 ^ 1261756144;
      var78 = 1890182284 ^ var78;
      float var6 = 1.0F;
      Vec3 var24 = var1.getEyePosition(var6);
      Vec3 var26 = var1.getLookAngle();
      double var28 = var1.blockInteractionRange();
      double var7 = 0.25;
      double var30 = var28 + var7;
      double var60 = var26.x;
      double var62 = var60 * var30;
      double var67 = var26.y;
      double var69 = var67 * var30;
      double var73 = var26.z;
      double var75 = var73 * var30;
      Vec3 var58 = var24.add(var62, var69, var75);
      Block var64 = Block.OUTLINE;
      Fluid var12 = Fluid.NONE;
      ClipContext var47 = new ClipContext(var24, var58, var64, var12, var1);
      BlockHitResult var33 = var0.clip(var47);
      Type var35 = var33.getType();
      Type var48 = Type.BLOCK;
      if (var35 == var48) {
         var78 = 347038525 ^ var78;
         BlockPos var37 = var33.getBlockPos();
         byte var38 = (byte)((var37.equals(var2)) ? 1 : 0);
         if (var38 == (1377359194 ^ var78)) {
            var78 = zmiectqaqwdyqbxo(var78, 2082066751);
            return null;
         } else {
            var78 = 1437584049 ^ var78;
            Direction var40 = var33.getDirection();
            if (var40 != var3) {
               var78 = 699800462 ^ var78;
               return null;
            } else {
               label30:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var78)) {
                     case 121350747:
                        var78 ^= 357757507;
                        break label30;
                     case 293551199:
                        break;
                     case 1389790918:
                        break label30;
                     case 1990118007:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }

               Direction var52 = var33.getDirection();
               BlockPos var42 = var2.relative(var52);
               byte var43 = (byte)((var42.equals(var4)) ? 1 : 0);
               if (var43 == (317058472 ^ var78)) {
                  var78 = 584179333 ^ var78;
                  return null;
               } else {
                  var78 = 2085164701 ^ var78;
                  Vec3 var55 = faceCenterHit(var2, var3);
                  byte var65 = (byte)(1856830261 ^ var78);
                  return new BlockHitResult(var55, var3, var2, (var65 != 0));
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var78)) {
               case 56669444:
                  break;
               case 133828109:
               default:
                  throw new RuntimeException(new IOException());
               case 151238608:
                  var78 = 1756803586 ^ var78;
                  return null;
               case 1497832064:
                  return null;
            }
         }
      }
   }

   public static boolean placeUnderfoot(Minecraft var0, LocalPlayer var1, BlockPos var2) {
      int var77 = 39779384 ^ 2044169656 ^ 1261756144;
      var77 = 1104105889 ^ var77;
      if (var0 != null) {
         var77 = 1207595606 ^ var77;
         if (var1 != null) {
            var77 = 1929037778 ^ var77;
            if (var2 != null) {
               var77 = 1273082874 ^ var77;
               MultiPlayerGameMode var19 = var0.gameMode;
               if (var19 != null) {
                  var77 = zmiectqaqwdyqbxo(var77, 1897520946);
                  int var49 = var2.getX();
                  double var50 = var49;
                  double var6 = 0.5;
                  double var52 = var50 + var6;
                  int var61 = var2.getY();
                  double var62 = var61;
                  double var9 = 0.95;
                  double var64 = var62 + var9;
                  int var68 = var2.getZ();
                  double var69 = var68;
                  double var11 = 0.5;
                  double var71 = var69 + var11;
                  Vec3 var20 = new Vec3(var52, var64, var71);
                  byte var22 = (byte)((isWithinReach(var1, var2, var20)) ? 1 : 0);
                  if (var22 == (2122983325 ^ var77)) {
                     var77 = 1672967907 ^ var77;
                     return (((byte)(490557822 ^ var77)) != 0);
                  }

                  var77 = zmiectqaqwdyqbxo(var77, 1484045656);
                  MultiPlayerGameMode var25 = var0.gameMode;
                  byte var27 = (byte)((var25 instanceof aj) ? 1 : 0);
                  if (var27 != (654219973 ^ var77)) {
                     var77 = 1692414166 ^ var77;
                     aj var29 = (aj)var25;
                     var29.wimpyclient$syncCarriedItem();
                     var77 = 1261580074 ^ var77;
                  } else {
                     var77 = 802299900 ^ var77;
                  }

                  float var45 = var1.getYRot();
                  float var55 = 90.0F;
                  byte var5 = (byte)(153912633 ^ var77);
                  j.apply(var1, var45, var55, (var5 != 0));
                  Direction var58 = Direction.UP;
                  byte var8 = (byte)(153912633 ^ var77);
                  BlockHitResult var32 = new BlockHitResult(var20, var58, var2, (var8 != 0));
                  var0.hitResult = var32;
                  MultiPlayerGameMode var35 = var0.gameMode;
                  InteractionHand var57 = InteractionHand.MAIN_HAND;
                  InteractionResult var36 = var35.useItemOn(var1, var57, var32);
                  byte var38 = (byte)((var36.consumesAction()) ? 1 : 0);
                  if (var38 != (153912633 ^ var77)) {
                     var77 = 1725332915 ^ var77;
                     InteractionHand var48 = InteractionHand.MAIN_HAND;
                     var1.swing(var48);
                     return (((byte)(1878718603 ^ var77)) != 0);
                  }

                  var77 = zmiectqaqwdyqbxo(var77, 149617690);
                  return (((byte)(29784355 ^ var77)) != 0);
               }

               var77 = 300995561 ^ var77;
            } else {
               var77 = 1511088147 ^ var77;
            }
         } else {
            var77 = zmiectqaqwdyqbxo(var77, 686532545);
         }
      } else {
         var77 = zmiectqaqwdyqbxo(var77, 1863439767);
      }

      return (((byte)(509815622 ^ var77)) != 0);
   }

   public static boolean isWithinReach(LocalPlayer var0, Vec3 var1) {
      int var22 = 1723950579 ^ 554323342 ^ 1261756144;
      var22 = 1757969602 ^ var22;
      if (var0 != null) {
         var22 = 1534539238 ^ var22;
         if (var1 == null) {
            var22 = 2058300368 ^ var22;
            return (((byte)(1173329017 ^ var22)) != 0);
         } else {
            var22 = 664249496 ^ var22;
            double var11 = var0.blockInteractionRange();
            float var3 = 1.0F;
            Vec3 var14 = var0.getEyePosition(var3);
            double var15 = var14.distanceTo(var1);
            double var30;
            int var17 = (var30 = var15 - var11) == 0.0 ? 0 : (var30 < 0.0 ? -1 : 1);
            if (var17 > (416750385 ^ var22)) {
               var22 = zmiectqaqwdyqbxo(var22, 1810562772);
               byte var31 = (byte)(1933436389 ^ var22);
               var22 = 1215122048 ^ var22;
               return (var31 != 0);
            } else {
               var22 = 151339272 ^ var22;
               byte var18 = (byte)(298998328 ^ var22);

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                     case 42442524:
                        var22 = 713225564 ^ var22;
                        return (var18 != 0);
                     case 283104345:
                        return (var18 != 0);
                     case 430149359:
                     default:
                        throw new IllegalStateException();
                     case 1716284067:
                  }
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
               case 36437966:
                  var22 ^= 567811638;
                  return (((byte)(1173329017 ^ var22)) != 0);
               case 118968134:
               default:
                  throw new IllegalStateException();
               case 632092529:
                  break;
               case 1550623683:
                  return (((byte)(1173329017 ^ var22)) != 0);
            }
         }
      }
   }

   public static boolean isWithinReach(LocalPlayer var0, BlockPos var1, Vec3 var2) {
      int var30 = 321970864 ^ 1746277253 ^ 1261756144;
      var30 = 1690634714 ^ var30;
      if (var0 == null) {
         var30 = 1295671947 ^ var30;
         return (((byte)(434979988 ^ var30)) != 0);
      } else {
         var30 = zmiectqaqwdyqbxo(var30, 384498270);
         if (var2 != null) {
            var30 ^= 1507942360;
            byte var11 = (byte)((isWithinReach(var0, var2)) ? 1 : 0);
            if (var11 != (467436441 ^ var30)) {
               var30 = 583925625 ^ var30;
               return (((byte)(957447393 ^ var30)) != 0);
            }

            label33:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 100345124:
                     var30 ^= 941575905;
                     break label33;
                  case 252750847:
                  default:
                     throw new IllegalStateException();
                  case 830695175:
                     break label33;
                  case 2112830773:
               }
            }
         } else {
            label40:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 5740672:
                     var30 ^= 1644040505;
                     break label40;
                  case 451019169:
                     break;
                  case 1800827723:
                     break label40;
                  case 2060494877:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         if (var1 == null) {
            var30 = 885168983 ^ var30;
            return (((byte)(385963567 ^ var30)) != 0);
         } else {
            var30 = zmiectqaqwdyqbxo(var30, 1774680352);
            double var15 = var0.blockInteractionRange();
            float var25 = 1.0F;
            Vec3 var18 = var0.getEyePosition(var25);
            Vec3 var27 = Vec3.atCenterOf(var1);
            double var19 = var18.distanceTo(var27);
            double var41;
            int var21 = (var41 = var19 - var15) == 0.0 ? 0 : (var41 < 0.0 ? -1 : 1);
            byte var24;
            if (var21 <= (1241822296 ^ var30)) {
               var30 = 798074355 ^ var30;
               var24 = (byte)(1704268202 ^ var30);
               var30 = 1634815345 ^ var30;
            } else {
               var30 = 1033124669 ^ var30;
               var24 = (byte)(2005962597 ^ var30);
               var30 = 1937036223 ^ var30;
            }

            return (var24 != 0);
         }
      }
   }

   public static boolean isSoftPlant(BlockState var0) {
      int var5 = 1453554948 ^ 1269006694 ^ 1261756144;
      var5 = 45190949 ^ var5;
      return n.isSoftPlant(var0);
   }

   public static boolean hasLineOfSight(Level var0, LocalPlayer var1, BlockPos var2, Vec3 var3) {
      int var12 = 1755360866 ^ 1149882556 ^ 1261756144;
      var12 = 927894402 ^ var12;
      Object var8 = null;
      return hasLineOfSight(var0, var1, var2, var3, (Direction)var8);
   }

   public static boolean hasLineOfSight(Level var0, LocalPlayer var1, BlockPos var2, Vec3 var3, Direction var4) {
      int var42 = 135134966 ^ 1547974607 ^ 1261756144;
      var42 = 83085946 ^ var42;
      if (var0 != null) {
         var42 = 962791746 ^ var42;
         if (var1 != null) {
            var42 = 1134384699 ^ var42;
            if (var2 != null) {
               var42 = 1980274240 ^ var42;
               if (var3 != null) {
                  var42 = zmiectqaqwdyqbxo(var42, 309846961);
                  byte var16 = (byte)((isWithinReach(var1, var2, var3)) ? 1 : 0);
                  if (var16 == (84932411 ^ var42)) {
                     var42 = 1649623860 ^ var42;
                     return (((byte)(1734128655 ^ var42)) != 0);
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                        case 79622856:
                           var42 ^= 1631963761;
                        case 926783257:
                           float var34 = 1.0F;
                           Vec3 var19 = var1.getEyePosition(var34);
                           Object var9 = null;
                           BlockHitResult var21 = clipIgnoringSoftPlants(var0, var1, var19, var3, (BlockPos)var9);
                           if (var21 != null) {
                              var42 = 1174279060 ^ var42;
                              Type var24 = var21.getType();
                              Type var36 = Type.BLOCK;
                              if (var24 == var36) {
                                 var42 = 1678275678 ^ var42;
                                 BlockPos var26 = var21.getBlockPos();
                                 byte var27 = (byte)((var26.equals(var2)) ? 1 : 0);
                                 if (var27 != (1169971840 ^ var42)) {
                                    var42 = zmiectqaqwdyqbxo(var42, 4200547);
                                    if (var4 != null) {
                                       var42 = 2054793722 ^ var42;
                                       Direction var30 = var21.getDirection();
                                       if (var30 != var4) {
                                          var42 = 1719649494 ^ var42;
                                          byte var33 = (byte)(1509568463 ^ var42);
                                          var42 = 2124602159 ^ var42;
                                          return (var33 != 0);
                                       }

                                       var42 = 1238729516 ^ var42;
                                    } else {
                                       var42 = zmiectqaqwdyqbxo(var42, 866921174);
                                    }

                                    byte var59 = (byte)(1984981044 ^ var42);
                                    var42 = 1359518933 ^ var42;
                                    return (var59 != 0);
                                 }

                                 var42 = 1257028676 ^ var42;
                              } else {
                                 var42 = 786745370 ^ var42;
                              }
                           } else {
                              var42 = 1796922254 ^ var42;
                           }

                           return (((byte)(256960196 ^ var42)) != 0);
                        case 252594713:
                           break;
                        case 408465035:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               }

               var42 = 1772936057 ^ var42;
            } else {
               var42 = zmiectqaqwdyqbxo(var42, 530861369);
            }
         } else {
            var42 = 1547246338 ^ var42;
         }
      } else {
         var42 = 1700401728 ^ var42;
      }

      return (((byte)(2127876083 ^ var42)) != 0);
   }

   public static boolean hasMineLineOfSight(Level var0, LocalPlayer var1, BlockPos var2) {
      int var118 = 1802066294 ^ 173273193 ^ 1261756144;
      var118 = 1335966630 ^ var118;
      if (var0 != null) {
         var118 = 1693700040 ^ var118;
         if (var1 != null) {
            var118 = 771512064 ^ var118;
            if (var2 != null) {
               var118 = zmiectqaqwdyqbxo(var118, 1230360444);
               float var4 = 1.0F;
               Vec3 var26 = var1.getEyePosition(var4);
               Vec3 var13 = var26;
               double var28 = var1.blockInteractionRange();
               double var5 = 0.25;
               double var30 = var28 + var5;
               double var14 = var30;
               BlockState var33 = var0.getBlockState(var2);
               byte var35 = (byte)((n.isSoftPlant(var33)) ? 1 : 0);
               if (var35 != (1710562301 ^ var118)) {
                  var118 = 804298950 ^ var118;
                  Vec3 var87 = Vec3.atCenterOf(var2);
                  double var66 = var26.distanceTo(var87);
                  double var136;
                  int var68 = (var136 = var66 - var30) == 0.0 ? 0 : (var136 < 0.0 ? -1 : 1);
                  byte var69;
                  if (var68 <= (1241889595 ^ var118)) {
                     var118 = 1591684636 ^ var118;
                     var69 = (byte)(349869350 ^ var118);
                     var118 = zmiectqaqwdyqbxo(var118, 513989);
                  } else {
                     var118 = zmiectqaqwdyqbxo(var118, 653495482);
                     var69 = (byte)(1828075393 ^ var118);
                     var118 = 2016114019 ^ var118;
                  }

                  return (var69 != 0);
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                     case 92963791:
                        var118 ^= 1933707793;
                     case 1193883251:
                        float var7 = 1.0F;
                        byte var8 = (byte)(381096428 ^ var118);
                        HitResult var37 = var1.pick(var30, var7, (var8 != 0));
                        byte var39 = (byte)((var37 instanceof BlockHitResult) ? 1 : 0);
                        if (var39 != (381096428 ^ var118)) {
                           var118 ^= 1070054574;
                           BlockHitResult var41 = (BlockHitResult)var37;
                           Type var43 = var41.getType();
                           Type var74 = Type.BLOCK;
                           if (var43 == var74) {
                              var118 ^= 358994374;
                              BlockPos var45 = var41.getBlockPos();
                              byte var46 = (byte)((var45.equals(var2)) ? 1 : 0);
                              if (var46 != (1008041092 ^ var118)) {
                                 var118 = 698369213 ^ var118;
                                 return (((byte)(364197944 ^ var118)) != 0);
                              }

                              label75:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                                    case 74030378:
                                       var118 ^= 824807471;
                                    case 990165537:
                                       break label75;
                                    case 1248657057:
                                    default:
                                       throw new IllegalStateException();
                                    case 1958711927:
                                 }
                              }
                           } else {
                              label69:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                                    case 4875999:
                                       var118 ^= 608977385;
                                    case 187540455:
                                       break label69;
                                    case 830534765:
                                       break;
                                    case 1352680738:
                                    default:
                                       throw new IllegalStateException();
                                 }
                              }
                           }
                        } else {
                           label83:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                                 case 201499662:
                                    var118 ^= 462159175;
                                 case 1082798200:
                                    break label83;
                                 case 1352409051:
                                 default:
                                    throw new IllegalStateException();
                                 case 1830534896:
                              }
                           }
                        }

                        Vec3 var93 = Vec3.atCenterOf(var2);
                        byte var48 = (byte)((rayHitsBlock(var0, var1, var26, var93, var2, var30)) ? 1 : 0);
                        if (var48 != (222096555 ^ var118)) {
                           var118 = 1280596482 ^ var118;
                           return (((byte)(1097381544 ^ var118)) != 0);
                        }

                        var118 = 1071922139 ^ var118;
                        Direction[] var50 = Direction.values();
                        Direction[] var115 = var50;
                        int var52 = var50.length;
                        int var19 = var52;
                        byte var53 = (byte)(853071728 ^ var118);
                        int var20 = var53;
                        var118 = 1206351174 ^ var118;

                        label61:
                        while (var20 < var19) {
                           var118 = 1576622114 ^ var118;
                           Direction var56 = var115[var20];
                           Vec3 var58 = Vec3.atCenterOf(var2);
                           int var80 = var56.getStepX();
                           double var81 = var80;
                           double var94 = 0.49;
                           double var83 = var81 * var94;
                           int var97 = var56.getStepY();
                           double var98 = var97;
                           double var105 = 0.49;
                           double var100 = var98 * var105;
                           int var108 = var56.getStepZ();
                           double var109 = var108;
                           double var11 = 0.49;
                           double var111 = var109 * var11;
                           Vec3 var59 = var58.add(var83, var100, var111);
                           byte var61 = (byte)((rayHitsBlock(var0, var1, var13, var59, var2, var14)) ? 1 : 0);
                           if (var61 != (684128788 ^ var118)) {
                              var118 = 676155845 ^ var118;
                              return (((byte)(9153488 ^ var118)) != 0);
                           }

                           var118 = zmiectqaqwdyqbxo(var118, 868221657);
                           var20 += 453441740 ^ var118;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                                 case 73242891:
                                    var118 ^= 1849252603;
                                 case 259786461:
                                    continue label61;
                                 case 1004843949:
                                    break;
                                 case 1781859300:
                                 default:
                                    throw new IllegalStateException();
                              }
                           }
                        }

                        var118 = zmiectqaqwdyqbxo(var118, 2128929682);
                        return (((byte)(198918564 ^ var118)) != 0);
                     case 829361062:
                        break;
                     case 1046759991:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }

            var118 = 460105256 ^ var118;
         } else {
            var118 = zmiectqaqwdyqbxo(var118, 915468584);
         }
      } else {
         var118 = 1382235872 ^ var118;
      }

      return (((byte)(936145577 ^ var118)) != 0);
   }

   public static BlockPos firstMineOccluder(Level var0, LocalPlayer var1, BlockPos var2) {
      int var36 = 2133127928 ^ 944827813 ^ 1261756144;
      var36 = 996272892 ^ var36;
      if (var0 != null) {
         var36 = 1950844129 ^ var36;
         if (var1 != null) {
            var36 = 1936537624 ^ var36;
            if (var2 != null) {
               var36 = zmiectqaqwdyqbxo(var36, 175966064);
               float var4 = 1.0F;
               Vec3 var15 = var1.getEyePosition(var4);
               Vec3 var17 = Vec3.atCenterOf(var2);
               BlockHitResult var19 = clipIgnoringSoftPlants(var0, var1, var15, var17, var2);
               if (var19 != null) {
                  var36 = 468677024 ^ var36;
                  Type var22 = var19.getType();
                  Type var32 = Type.BLOCK;
                  if (var22 == var32) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var36)) {
                           case 18482497:
                              var36 ^= 1568642383;
                           case 2091409008:
                              BlockPos var25 = var19.getBlockPos();
                              byte var27 = (byte)((var25.equals(var2)) ? 1 : 0);
                              if (var27 == (2095477815 ^ var36)) {
                                 var36 = 1392462227 ^ var36;
                                 BlockPos var51 = var25.immutable();
                                 var36 = 930270893 ^ var36;
                                 return var51;
                              }

                              var36 = 997089023 ^ var36;
                              Object var29 = null;

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var36)) {
                                    case 177706347:
                                       var36 = 1591990721 ^ var36;
                                       return (BlockPos)var29;
                                    case 838529295:
                                       return (BlockPos)var29;
                                    case 902381151:
                                    default:
                                       throw new RuntimeException();
                                    case 1981278041:
                                 }
                              }
                           case 432030192:
                           default:
                              throw new RuntimeException();
                           case 444240299:
                        }
                     }
                  }

                  var36 = 1415078568 ^ var36;
               } else {
                  var36 = zmiectqaqwdyqbxo(var36, 1337398024);
               }

               return null;
            }

            var36 = 834649903 ^ var36;
         } else {
            var36 = zmiectqaqwdyqbxo(var36, 1121093431);
         }
      } else {
         var36 = zmiectqaqwdyqbxo(var36, 915735510);
      }

      return null;
   }

   private static boolean rayHitsBlock(Level var0, LocalPlayer var1, Vec3 var2, Vec3 var3, BlockPos var4, double var5) {
      int var33 = 1848840937 ^ 644275293 ^ 1261756144;
      var33 = 626279896 ^ var33;
      double var14 = var2.distanceTo(var3);
      double var43;
      int var16 = (var43 = var14 - var5) == 0.0 ? 0 : (var43 < 0.0 ? -1 : 1);
      if (var16 > (641029532 ^ var33)) {
         var33 = 1062284648 ^ var33;
         return (((byte)(426014964 ^ var33)) != 0);
      } else {
         var33 = 1837935627 ^ var33;
         BlockHitResult var18 = clipIgnoringSoftPlants(var0, var1, var2, var3, var4);
         if (var18 != null) {
            var33 = 381907965 ^ var33;
            Type var21 = var18.getType();
            Type var28 = Type.BLOCK;
            if (var21 == var28) {
               var33 = 2090665003 ^ var33;
               BlockPos var23 = var18.getBlockPos();
               byte var24 = (byte)((var23.equals(var4)) ? 1 : 0);
               if (var24 != (568823361 ^ var33)) {
                  var33 = 501335057 ^ var33;
                  byte var25 = (byte)(1007045201 ^ var33);
                  var33 = zmiectqaqwdyqbxo(var33, 1291631817);
                  return (var25 != 0);
               }

               var33 = 165749005 ^ var33;
            } else {
               var33 = 1971070246 ^ var33;
            }
         } else {
            var33 = zmiectqaqwdyqbxo(var33, 1673483995);
         }

         byte var44 = (byte)(671526732 ^ var33);
         var33 = 1492933077 ^ var33;
         return (var44 != 0);
      }
   }

   private static BlockHitResult clipIgnoringSoftPlants(Level var0, LocalPlayer var1, Vec3 var2, Vec3 var3, BlockPos var4) {
      int var98 = 349326575 ^ 1725572262 ^ 1261756144;
      var98 = 1053889505 ^ var98;
      Vec3 var12 = var2;
      byte var21 = (byte)(133014872 ^ var98);
      int var13 = var21;
      var98 = 1753847673 ^ var98;

      label80:
      while (true) {
         byte var6 = (byte)(1868837417 ^ var98);
         if (var13 >= var6) {
            var98 = 125194941 ^ var98;
            break;
         }

         var98 = 1364041224 ^ var98;
         Block var9 = Block.OUTLINE;
         Fluid var10 = Fluid.NONE;
         ClipContext var61 = new ClipContext(var12, var3, var9, var10, var1);
         BlockHitResult var24 = var0.clip(var61);
         Type var26 = var24.getType();
         Type var62 = Type.BLOCK;
         if (var26 != var62) {
            var98 = 523693370 ^ var98;
            Block var90 = Block.COLLIDER;
            Fluid var92 = Fluid.NONE;
            ClipContext var71 = new ClipContext(var2, var3, var90, var92, var1);
            BlockHitResult var57 = var0.clip(var71);
            Type var59 = var57.getType();
            Type var72 = Type.BLOCK;
            BlockHitResult var60;
            if (var59 == var72) {
               var98 = 1195819634 ^ var98;
               var60 = var57;
               var98 = zmiectqaqwdyqbxo(var98, 2008154840);
            } else {
               label56:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var98)) {
                     case 2928395:
                        var98 ^= 1938882868;
                        break label56;
                     case 583283910:
                        break;
                     case 1527148430:
                        break label56;
                     case 1618207782:
                     default:
                        throw new IllegalStateException();
                  }
               }

               var60 = var24;
               var98 = 1130742174 ^ var98;
            }

            return var60;
         } else {
            label74:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var98)) {
                  case 93826083:
                     break;
                  case 141591462:
                     var98 ^= 579275665;
                  case 344245830:
                     break label74;
                  case 353567871:
                  default:
                     throw new IllegalStateException();
               }
            }

            BlockPos var28 = var24.getBlockPos();
            BlockState var30 = var0.getBlockState(var28);
            byte var32 = (byte)((n.isSoftPlant(var30)) ? 1 : 0);
            if (var32 == (481208248 ^ var98)) {
               var98 = 269257228 ^ var98;
               return var24;
            }

            var98 = 1883631384 ^ var98;
            if (var4 != null) {
               var98 = 1557126588 ^ var98;
               byte var36 = (byte)((var28.equals(var4)) ? 1 : 0);
               if (var36 != (807703836 ^ var98)) {
                  var98 = 1015462056 ^ var98;
                  return var24;
               }

               var98 = 743730598 ^ var98;
            } else {
               var98 = 1889251354 ^ var98;
            }

            Vec3 var38 = var3.subtract(var12);
            double var40 = var38.length();
            double var73 = 1.0E-4;
            double var117;
            int var44 = (var117 = var40 - var73) == 0.0 ? 0 : (var117 < 0.0 ? -1 : 1);
            if (var44 < (477165754 ^ var98)) {
               var98 = 2105114836 ^ var98;
               return var24;
            }

            var98 = 828488088 ^ var98;
            Vec3 var46 = var24.getLocation();
            Vec3 var67 = var38.normalize();
            double var75 = 0.05;
            Vec3 var68 = var67.scale(var75);
            Vec3 var47 = var46.add(var68);
            var12 = var47;
            double var49 = var47.distanceToSqr(var2);
            double var78 = var3.distanceToSqr(var2);
            double var85 = 0.25;
            double var80 = var78 + var85;
            double var118;
            int var51 = (var118 = var49 - var80) == 0.0 ? 0 : (var118 < 0.0 ? -1 : 1);
            if (var51 > (756105506 ^ var98)) {
               var98 = 1369365372 ^ var98;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var98)) {
                     case 22431641:
                        var98 = 345897666 ^ var98;
                        break label80;
                     case 134859226:
                     default:
                        throw new IllegalStateException();
                     case 522553749:
                        break;
                     case 1214293457:
                        break label80;
                  }
               }
            }

            var98 = 590986697 ^ var98;
            var13 += 237567210 ^ var98;
            var98 = zmiectqaqwdyqbxo(var98, 1632423626);
         }
      }

      Block var89 = Block.COLLIDER;
      Fluid var91 = Fluid.NONE;
      ClipContext var70 = new ClipContext(var2, var3, var89, var91, var1);
      return var0.clip(var70);
   }

   private static BlockHitResult resolveHit(Level var0, LocalPlayer var1, BlockPos var2, Direction var3, Vec3 var4) {
      int var118 = 1792029675 ^ 550959309 ^ 1261756144;
      var118 = 416062249 ^ var118;
      byte var19 = (byte)((isWithinReach(var1, var2, var4)) ? 1 : 0);
      if (var19 == (436113151 ^ var118)) {
         var118 = 1002693377 ^ var118;
         return null;
      } else {
         label178: {
            var118 = zmiectqaqwdyqbxo(var118, 1726233345);
            BlockPos var21 = var2.relative(var3);
            double var23 = var1.blockInteractionRange();
            float var8 = 1.0F;
            byte var9 = (byte)(2132456958 ^ var118);
            HitResult var26 = var1.pick(var23, var8, (var9 != 0));
            byte var28 = (byte)((var26 instanceof BlockHitResult) ? 1 : 0);
            if (var28 != (2132456958 ^ var118)) {
               var118 = 1249240845 ^ var118;
               BlockHitResult var30 = (BlockHitResult)var26;
               Type var32 = var30.getType();
               Type var84 = Type.BLOCK;
               label142:
               if (var32 == var84) {
                  var118 = 1639761752 ^ var118;
                  BlockPos var34 = var30.getBlockPos();
                  BlockState var36 = var0.getBlockState(var34);
                  byte var38 = (byte)((isSoftPlant(var36)) ? 1 : 0);
                  if (var38 != (1423152555 ^ var118)) {
                     var118 ^= 1033502417;
                     byte var41 = (byte)((var34.equals(var2)) ? 1 : 0);
                     if (var41 == (1766484858 ^ var118)) {
                        var118 = 699454907 ^ var118;
                        byte var43 = (byte)((var34.equals(var21)) ? 1 : 0);
                        if (var43 == (1090174657 ^ var118)) {
                           var118 = 922231121 ^ var118;
                           break label142;
                        }

                        var118 = 1634028263 ^ var118;
                     } else {
                        label138:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                              case 201349494:
                                 var118 ^= 1221959516;
                              case 493339721:
                                 break label138;
                              case 1009380631:
                              default:
                                 throw new IllegalStateException();
                              case 1481469661:
                           }
                        }
                     }
                  } else {
                     label132:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                           case 72983848:
                              var118 ^= 1967939981;
                              break label132;
                           case 254084582:
                              break;
                           case 804233124:
                              break label132;
                           case 1814855823:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }

                  byte var45 = (byte)((var34.equals(var2)) ? 1 : 0);
                  if (var45 != (564130854 ^ var118)) {
                     var118 = 1443474331 ^ var118;
                     Direction var47 = var30.getDirection();
                     if (var47 == var3) {
                        var118 = 2030463127 ^ var118;
                        return var30;
                     }

                     var118 = 1146138819 ^ var118;
                  } else {
                     label120:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                           case 19253398:
                              var118 ^= 307829592;
                              break label120;
                           case 344511808:
                              break;
                           case 1787038165:
                              break label120;
                           case 1809553172:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }

                  byte var50 = (byte)((var34.equals(var21)) ? 1 : 0);
                  if (var50 != (868675454 ^ var118)) {
                     var118 = 2048127423 ^ var118;
                     if (var38 != (1238703809 ^ var118)) {
                        var118 = 52920991 ^ var118;
                        byte var53 = (byte)((hasLineOfSight(var0, var1, var2, var4)) ? 1 : 0);
                        if (var53 != (1257413726 ^ var118)) {
                           var118 = 484468945 ^ var118;
                           byte var10 = (byte)(1444082831 ^ var118);
                           return new BlockHitResult(var4, var3, var2, (var10 != 0));
                        }

                        var118 = 991768521 ^ var118;
                     } else {
                        var118 = zmiectqaqwdyqbxo(var118, 943369558);
                     }
                  } else {
                     var118 = zmiectqaqwdyqbxo(var118, 1110007017);
                  }

                  byte var56 = (byte)((var34.equals(var2)) ? 1 : 0);
                  if (var56 != (1911534487 ^ var118)) {
                     var118 ^= 315046862;
                     byte var58 = (byte)((var1.isCrouching()) ? 1 : 0);
                     if (var58 != (1663600729 ^ var118)) {
                        var118 = 1186275486 ^ var118;
                        Axis var60 = var3.getAxis();
                        byte var61 = (byte)((var60.isHorizontal()) ? 1 : 0);
                        if (var61 != (631089351 ^ var118)) {
                           var118 = 2090239624 ^ var118;
                           BlockState var63 = var0.getBlockState(var21);
                           byte var64 = (byte)((var63.canBeReplaced()) ? 1 : 0);
                           if (var64 != (1493904975 ^ var118)) {
                              var118 = 722837467 ^ var118;
                              break label178;
                           }

                           var118 = 218842604 ^ var118;
                           BlockState var66 = var0.getBlockState(var21);
                           byte var67 = (byte)((isSoftPlant(var66)) ? 1 : 0);
                           if (var67 != (1409313699 ^ var118)) {
                              var118 = 639556151 ^ var118;
                              break label178;
                           }

                           var118 = zmiectqaqwdyqbxo(var118, 570618931);
                        } else {
                           var118 = zmiectqaqwdyqbxo(var118, 1402943319);
                        }
                     } else {
                        label108:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                              case 2026244:
                                 var118 ^= 355080137;
                              case 474191842:
                                 break label108;
                              case 824589681:
                              default:
                                 throw new IllegalStateException();
                              case 1083401878:
                           }
                        }
                     }
                  } else {
                     label102:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                           case 110783405:
                           default:
                              throw new IllegalStateException();
                           case 208350000:
                              break label102;
                           case 213916187:
                              var118 ^= 132983815;
                              break label102;
                           case 1696068025:
                        }
                     }
                  }
               } else {
                  var118 = 1131269475 ^ var118;
               }
            } else {
               var118 = 152578670 ^ var118;
            }

            byte var70 = (byte)((hasLineOfSight(var0, var1, var2, var4, var3)) ? 1 : 0);
            label87:
            if (var70 == (1979883408 ^ var118)) {
               var118 = 433747094 ^ var118;
               byte var72 = (byte)((var1.isCrouching()) ? 1 : 0);
               if (var72 != (1876486918 ^ var118)) {
                  var118 = 248854860 ^ var118;
                  Axis var74 = var3.getAxis();
                  byte var75 = (byte)((var74.isHorizontal()) ? 1 : 0);
                  if (var75 != (1628295754 ^ var118)) {
                     var118 = 1014451121 ^ var118;
                     Object var112 = null;
                     byte var77 = (byte)((hasLineOfSight(var0, var1, var2, var4, (Direction)var112)) ? 1 : 0);
                     if (var77 != (1568315899 ^ var118)) {
                        var118 = 176032327 ^ var118;
                        break label87;
                     }

                     var118 = 560603315 ^ var118;
                  } else {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                           case 202024546:
                              var118 = 488467202 ^ var118;
                              return null;
                           case 1089572505:
                              break;
                           case 1160054566:
                           default:
                              throw new IllegalStateException();
                           case 1351350423:
                              return null;
                        }
                     }
                  }
               } else {
                  var118 = zmiectqaqwdyqbxo(var118, 331895374);
               }

               return null;
            } else {
               label94:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                     case 77947685:
                        var118 ^= 554044460;
                        break label94;
                     case 631371500:
                     default:
                        throw new IllegalStateException();
                     case 972437272:
                        break label94;
                     case 1764545035:
                  }
               }
            }

            byte var115 = (byte)(1459917756 ^ var118);
            return new BlockHitResult(var4, var3, var2, (var115 != 0));
         }

         byte var114 = (byte)(1914614164 ^ var118);
         return new BlockHitResult(var4, var3, var2, (var114 != 0));
      }
   }

   static {
      int var3 = new Random(3104682335235158911L).nextInt();
      z33SkxzEwz = 1314274599 ^ var3;
   }

   public static String dywrhuvqrf(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] kktpsllrqwawktm() {
      return new byte[]{
         24,
         14,
         91,
         106,
         23,
         77,
         42,
         46,
         104,
         17,
         33,
         3,
         102,
         46,
         16,
         67,
         108,
         111,
         121,
         88,
         37,
         63,
         125,
         49,
         82,
         38,
         29,
         45,
         10,
         11,
         49,
         77,
         35,
         90,
         47,
         51,
         79,
         56,
         14,
         88,
         79,
         78,
         94,
         113,
         126,
         91,
         3,
         38,
         55,
         79,
         84,
         66,
         34,
         30,
         26,
         32,
         120,
         121,
         35,
         124,
         111,
         11,
         55,
         10,
         20,
         55,
         126,
         100,
         33,
         64,
         46,
         51,
         121,
         126,
         27,
         101,
         51,
         17,
         112,
         56,
         103,
         61,
         117,
         30
      };
   }

   private static int zmiectqaqwdyqbxo(int var0, int var1) {
      return var0 ^ var1;
   }
}
