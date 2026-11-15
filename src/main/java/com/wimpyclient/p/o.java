package com.wimpyclient.p;

import com.wimpyclient.mixin.aj;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MouseHandler;
import net.minecraft.client.Options;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.EmptyBlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import net.minecraft.world.phys.shapes.VoxelShape;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class o {
   private static final int UNDERWATER_BREAKS_BEFORE_SEAL = 3;
   private static final int SIDE_DIG_TICKS = 25;
   private static final int ABORT_STALL_TICKS = 600;
   private static final int MAX_FALLING_IN_ROW = 12;
   private static final int POST_SEAL_SETTLE_TICKS = 8;
   private static boolean active;
   private static int targetY;
   private static BlockPos currentMineTarget;
   private static int placeCooldown;
   private static double lastY;
   private static double digStartY;
   private static int stuckTicks;
   private static int totalStallTicks;
   private static int solidsBroken;
   private static Vec3 placeAimHit;
   private static BlockPos placeAgainst;
   private static Direction placeFace;
   private static BlockPos placeSlot;
   private static int placeAimTicks;
   private static boolean needsToolSwap;
   private static int fallingBlocksInRow;
   private static BlockPos lastFallingPos;
   private static int settleWait;
   private static final float PLACE_LOOK_BLEND = 0.16F;
   private static final float PLACE_LOOK_MAX_STEP = 7.5F;
   private static final float PLACE_AIM_TOLERANCE_DEG = 5.0F;
   private static final int PLACE_MIN_AIM_TICKS = 5;
   private static int Ed5RSLmUce;
   private transient int oaQEEBhQfu;
   private static String ppdgkutswo = ByteBuffer.wrap(pwrlfvdehzcczyl()).asCharBuffer().toString();

   private o() {
super();
      int var4 = 1234823003 ^ 324259271;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 266856516:
               var4 = 585211680 ^ var4;
            case 2096547604:
               var4 = 1850813529 ^ 448567298 ^ Integer.parseInt("214303207");
               this.oaQEEBhQfu = 342885864 ^ Ed5RSLmUce;
               var4 = 1083195934 ^ var4;
               return;
            case 594901842:
               break;
            case 1313837886:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public static boolean isActive() {
      int var3 = 1133906359 ^ 2122255119 ^ 258429565;
      var3 = 72617886 ^ var3;
      return active;
   }

   public static void start(int var0) {
      int var18 = 312587930 ^ 177170140 ^ 258429565;
      var18 = 1477144024 ^ var18;
      byte var1 = (byte)(1329786850 ^ var18);
      active = (var1 != 0);
      targetY = var0;
      Object var3 = null;
      currentMineTarget = (BlockPos)var3;
      byte var4 = (byte)(1329786851 ^ var18);
      placeCooldown = var4;
      byte var5 = (byte)(1329786851 ^ var18);
      stuckTicks = var5;
      byte var6 = (byte)(1329786851 ^ var18);
      totalStallTicks = var6;
      double var7 = Double.NaN;
      lastY = var7;
      double var9 = Double.NaN;
      digStartY = var9;
      byte var11 = (byte)(1329786851 ^ var18);
      solidsBroken = var11;
      byte var12 = (byte)(1329786851 ^ var18);
      needsToolSwap = (var12 != 0);
      byte var13 = (byte)(1329786851 ^ var18);
      fallingBlocksInRow = var13;
      Object var14 = null;
      lastFallingPos = (BlockPos)var14;
      byte var15 = (byte)(1329786851 ^ var18);
      settleWait = var15;
      clearPlaceAim();
   }

   public static void stop(Minecraft var0) {
      int var38 = 1603728781 ^ 606706842 ^ 258429565;
      var38 = 1827102313 ^ var38;
      byte var1 = (byte)((active) ? 1 : 0);
      byte var5 = (byte)(406807811 ^ var38);
      active = (var5 != 0);
      Object var6 = null;
      currentMineTarget = (BlockPos)var6;
      byte var7 = (byte)(406807811 ^ var38);
      placeCooldown = var7;
      byte var8 = (byte)(406807811 ^ var38);
      stuckTicks = var8;
      byte var9 = (byte)(406807811 ^ var38);
      totalStallTicks = var9;
      double var10 = Double.NaN;
      lastY = var10;
      double var12 = Double.NaN;
      digStartY = var12;
      byte var14 = (byte)(406807811 ^ var38);
      solidsBroken = var14;
      byte var15 = (byte)(406807811 ^ var38);
      needsToolSwap = (var15 != 0);
      byte var16 = (byte)(406807811 ^ var38);
      fallingBlocksInRow = var16;
      Object var17 = null;
      lastFallingPos = (BlockPos)var17;
      byte var18 = (byte)(406807811 ^ var38);
      settleWait = var18;
      clearPlaceAim();
      if (var0 != null) {
         var38 = 1288596448 ^ var38;
         MultiPlayerGameMode var21 = var0.gameMode;
         if (var21 != null) {
            var38 ^= 552801080;
            label68:
            if (var1 != (1946295771 ^ var38)) {
               var38 ^= 1513707729;

               try {
                  MultiPlayerGameMode var24 = var0.gameMode;
                  var24.stopDestroyBlock();
                  var38 ^= 272407191;
               } catch (Throwable var39) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var38)) {
                     case 1910122577:
                        var38 = nwkaduznemenzhod(var38, 1851686266);
                        var38 = 594997166 ^ var38;
                        break label68;
                     default:
                        throw new RuntimeException(new IllegalAccessException("Error in hash"));
                  }
               }

               label63:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                     case 137330503:
                        var38 ^= 1561593923;
                        break label63;
                     case 1021627293:
                     default:
                        throw new RuntimeException();
                     case 1273831018:
                        break label63;
                     case 1924922650:
                  }
               }
            } else {
               label48:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                     case 12873178:
                        var38 ^= 387041797;
                     case 1072315221:
                        break label48;
                     case 1268222859:
                        break;
                     case 1879245099:
                     default:
                        throw new RuntimeException();
                  }
               }
            }
         } else {
            label57:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                  case 76765222:
                     var38 ^= 937613629;
                     break label57;
                  case 555918497:
                  default:
                     throw new RuntimeException();
                  case 895155937:
                     break label57;
                  case 1573148656:
               }
            }
         }
      } else {
         var38 = nwkaduznemenzhod(var38, 2066526941);
      }

      if (var0 != null) {
         var38 = 789872541 ^ var38;
         Options var28 = var0.options;
         if (var28 != null) {
            var38 = 1354735296 ^ var38;
            Options var30 = var0.options;
            KeyMapping var31 = var30.keyAttack;
            byte var2 = (byte)(481834627 ^ var38);
            var31.setDown((var2 != 0));
            Options var33 = var0.options;
            KeyMapping var34 = var33.keyUse;
            byte var35 = (byte)(481834627 ^ var38);
            var34.setDown((var35 != 0));
            var38 = 117479549 ^ var38;
         } else {
            var38 = 1472136893 ^ var38;
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
               case 267784493:
                  var38 = 2024503584 ^ var38;
                  return;
               case 1180149167:
               default:
                  throw new RuntimeException();
               case 1656284711:
                  return;
               case 1736851756:
            }
         }
      }
   }

   public static boolean tick(Minecraft var0) {
      int var166 = 1705588264 ^ 2005547206 ^ 258429565;
      var166 = 1503299257 ^ var166;
      byte var1 = (byte)((active) ? 1 : 0);
      if (var1 == (1155455530 ^ var166)) {
         var166 = 1081114941 ^ var166;
         return (((byte)(78535446 ^ var166)) != 0);
      } else {
         label170: {
            label169: {
               label193: {
                  label166:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var166)) {
                        case 91193967:
                           var166 ^= 2087772284;
                        case 1019380963:
                           if (var0 == null) {
                              var166 = nwkaduznemenzhod(var166, 1761145993);
                              break label170;
                           }

                           var166 = 1504698570 ^ var166;
                           LocalPlayer var13 = var0.player;
                           if (var13 == null) {
                              var166 = nwkaduznemenzhod(var166, 827790403);
                              break label170;
                           }

                           var166 = 1253039175 ^ var166;
                           ClientLevel var15 = var0.level;
                           if (var15 == null) {
                              var166 = 2079901700 ^ var166;
                              break label170;
                           }

                           var166 = 1388370941 ^ var166;
                           MultiPlayerGameMode var17 = var0.gameMode;
                           if (var17 == null) {
                              var166 = 691540985 ^ var166;
                              break label170;
                           }

                           label163:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var166)) {
                                 case 189183255:
                                    var166 ^= 925997875;
                                    break label163;
                                 case 1504411879:
                                    break;
                                 case 1764167853:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 2040056539:
                                    break label163;
                              }
                           }

                           Screen var21 = var0.screen;
                           if (var21 != null) {
                              var166 = 31115723 ^ var166;
                              break label169;
                           }

                           var166 = 433469118 ^ var166;
                           com.wimpyclient.g.g var22 = com.wimpyclient.g.g.INSTANCE;
                           byte var23 = (byte)((var22.isOpen()) ? 1 : 0);
                           if (var23 != (1468625067 ^ var166)) {
                              var166 = 403505013 ^ var166;
                              break label169;
                           }

                           var166 = nwkaduznemenzhod(var166, 814216336);
                           ensureMouseGrabbed(var0);
                           LocalPlayer var28 = var0.player;
                           double var29 = digStartY;
                           byte var31 = (byte)((Double.isNaN(var29)) ? 1 : 0);
                           if (var31 != (1729004603 ^ var166)) {
                              var166 = 1570222415 ^ var166;
                              double var33 = var28.getY();
                              digStartY = var33;
                              var166 = 42434576 ^ var166;
                           } else {
                              var166 = 1594896735 ^ var166;
                           }

                           int var35 = placeCooldown;
                           if (var35 > (941536612 ^ var166)) {
                              var166 = 776388596 ^ var166;
                              int var36 = placeCooldown;
                              byte var2 = (byte)(374868625 ^ var166);
                              int var37 = var36 - var2;
                              placeCooldown = var37;
                              var166 = 1036437523 ^ var166;
                           } else {
                              var166 = nwkaduznemenzhod(var166, 327186407);
                           }

                           int var38 = settleWait;
                           if (var38 > (731824771 ^ var166)) {
                              var166 = 574559078 ^ var166;
                              int var123 = settleWait;
                              byte var146 = (byte)(161599972 ^ var166);
                              int var124 = var123 - var146;
                              settleWait = var124;
                              releaseClick(var0);
                              return (((byte)(161599973 ^ var166)) != 0);
                           }

                           var166 = 1138969270 ^ var166;
                           double var39 = lastY;
                           byte var41 = (byte)((Double.isNaN(var39)) ? 1 : 0);
                           if (var41 == (1753057333 ^ var166)) {
                              var166 = 1654841302 ^ var166;
                              double var43 = var28.getY();
                              double var3 = lastY;
                              double var45 = var43 - var3;
                              double var47 = Math.abs(var45);
                              double var147 = 0.05;
                              double var205;
                              int var49 = (var205 = var47 - var147) == 0.0 ? 0 : (var205 < 0.0 ? -1 : 1);
                              if (var49 < (182409187 ^ var166)) {
                                 var166 = 697468086 ^ var166;
                                 int var119 = stuckTicks;
                                 byte var144 = (byte)(592302932 ^ var166);
                                 int var120 = var119 + var144;
                                 stuckTicks = var120;
                                 int var121 = totalStallTicks;
                                 byte var145 = (byte)(592302932 ^ var166);
                                 int var122 = var121 + var145;
                                 totalStallTicks = var122;
                                 var166 = nwkaduznemenzhod(var166, 24538151);
                              } else {
                                 var166 = nwkaduznemenzhod(var166, 11534601);
                                 byte var50 = (byte)(175068906 ^ var166);
                                 stuckTicks = var50;
                                 double var52 = var28.getY();
                                 double var149 = lastY;
                                 double var5 = 0.1;
                                 double var151 = var149 - var5;
                                 double var206;
                                 int var54 = (var206 = var52 - var151) == 0.0 ? 0 : (var206 < 0.0 ? -1 : 1);
                                 if (var54 < (175068906 ^ var166)) {
                                    var166 = 174477729 ^ var166;
                                    byte var55 = (byte)(591691 ^ var166);
                                    totalStallTicks = var55;
                                    var166 = 573749305 ^ var166;
                                 } else {
                                    var166 = nwkaduznemenzhod(var166, 676653464);
                                 }
                              }
                           } else {
                              var166 = 1246115655 ^ var166;
                           }

                           double var57 = var28.getY();
                           lastY = var57;
                           int var59 = totalStallTicks;
                           short var127 = (short)(574340394 ^ var166);
                           if (var59 >= var127) {
                              var166 = 1211734180 ^ var166;
                              stop(var0);
                              String var128 = rydofeadfl(qsqqhlckcjghyah(), var166);
                              MutableComponent var129 = Component.literal(var128);
                              byte var153 = (byte)(1778526166 ^ var166);
                              var28.displayClientMessage(var129, (var153 != 0));
                              return (((byte)(1778526167 ^ var166)) != 0);
                           }

                           var166 = 865706835 ^ var166;
                           BlockPos var63 = currentMineTarget;
                           if (var63 != null) {
                              var166 = 1191511502 ^ var166;
                              ClientLevel var65 = var0.level;
                              BlockPos var130 = currentMineTarget;
                              BlockState var66 = var65.getBlockState(var130);
                              byte var67 = (byte)((var66.isAir()) ? 1 : 0);
                              if (var67 != (1453791727 ^ var166)) {
                                 var166 = 495923859 ^ var166;
                                 int var68 = solidsBroken;
                                 byte var131 = (byte)(1260923773 ^ var166);
                                 int var69 = var68 + var131;
                                 solidsBroken = var69;
                                 BlockPos var132 = currentMineTarget;
                                 trackFallingBlock(var0, var132);
                                 Object var71 = null;
                                 currentMineTarget = (BlockPos)var71;
                                 var166 = 2038540046 ^ var166;
                              } else {
                                 var166 = nwkaduznemenzhod(var166, 1678677405);
                              }
                           } else {
                              var166 = 587960403 ^ var166;
                           }

                           int var72 = fallingBlocksInRow;
                           byte var133 = (byte)(849972350 ^ var166);
                           if (var72 >= var133) {
                              var166 = 74684272 ^ var166;
                              byte var73 = (byte)(920263426 ^ var166);
                              fallingBlocksInRow = var73;
                              releaseClick(var0);
                              return (((byte)(920263426 ^ var166)) != 0);
                           }

                           label155:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var166)) {
                                 case 36221621:
                                    var166 ^= 180421995;
                                 case 542458153:
                                    break label155;
                                 case 664007851:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1107378903:
                              }
                           }

                           byte var77 = (byte)((isUnderwater(var0, var28)) ? 1 : 0);
                           double var79 = var28.getY();
                           int var154 = targetY;
                           double var155 = var154;
                           double var161 = 0.25;
                           double var157 = var155 + var161;
                           double var207;
                           int var81 = (var207 = var79 - var157) == 0.0 ? 0 : (var207 < 0.0 ? -1 : 1);
                           if (var81 <= (946374937 ^ var166)) {
                              var166 = 1854719133 ^ var166;
                              if (var77 != (1457802628 ^ var166)) {
                                 var166 = 517353473 ^ var166;
                                 byte var84 = (byte)((isSealedAbove(var0, var28)) ? 1 : 0);
                                 if (var84 == (1211268485 ^ var166)) {
                                    var166 = 863004161 ^ var166;
                                    releaseClick(var0);
                                    boolean var87 = tryPlaceBlockAbove(var0, var28);
                                    return (((byte)(2067929988 ^ var166)) != 0);
                                 }

                                 var166 = 585198060 ^ var166;
                                 break label193;
                              }

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var166)) {
                                    case 140116171:
                                       var166 ^= 1010260461;
                                       break label193;
                                    case 1523888828:
                                       break;
                                    case 1775090063:
                                       break label193;
                                    case 2146660779:
                                    default:
                                       throw new RuntimeException(new IOException());
                                 }
                              }
                           }

                           label147:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var166)) {
                                 case 222998984:
                                    var166 ^= 292373994;
                                    break label147;
                                 case 380873826:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1502698599:
                                    break;
                                 case 2114542086:
                                    break label147;
                              }
                           }

                           if (var77 != (688246003 ^ var166)) {
                              var166 = 1472797496 ^ var166;
                              int var92 = solidsBroken;
                              byte var137 = (byte)(2127353800 ^ var166);
                              if (var92 >= var137) {
                                 var166 = 1034348278 ^ var166;
                                 releaseClick(var0);
                                 byte var102 = (byte)((isSealedAbove(var0, var28)) ? 1 : 0);
                                 if (var102 != (1131032893 ^ var166)) {
                                    var166 = 61339605 ^ var166;
                                    byte var106 = (byte)(1087227624 ^ var166);
                                    solidsBroken = var106;
                                    clearPlaceAim();
                                    Object var107 = null;
                                    currentMineTarget = (BlockPos)var107;
                                    byte var108 = (byte)(1087227625 ^ var166);
                                    needsToolSwap = (var108 != 0);
                                    byte var109 = (byte)(1087227616 ^ var166);
                                    settleWait = var109;
                                    return (((byte)(1087227624 ^ var166)) != 0);
                                 }

                                 var166 = 175064050 ^ var166;
                                 boolean var104 = tryPlaceBlockAbove(var0, var28);
                                 return (((byte)(1225093839 ^ var166)) != 0);
                              }

                              var166 = 1476800442 ^ var166;
                              BlockPos var94 = pickDigTarget(var0, var28);
                              if (var94 != null) {
                                 var166 = 895977184 ^ var166;
                                 return holdDig(var0, var28, var94);
                              }

                              var166 = nwkaduznemenzhod(var166, 1116873368);
                              releaseClick(var0);
                              return (((byte)(1683544809 ^ var166)) != 0);
                           }

                           var166 = 1722026819 ^ var166;
                           BlockPos var112 = pickDigTarget(var0, var28);
                           if (var112 != null) {
                              var166 = 1974968921 ^ var166;
                              return holdDig(var0, var28, var112);
                           }

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var166)) {
                                 case 172571972:
                                    var166 ^= 158289137;
                                 case 714050261:
                                    break label166;
                                 case 1280207913:
                                    break;
                                 case 1904374151:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        case 1529826800:
                           break;
                        case 1830055751:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }

                  Object var116 = null;
                  currentMineTarget = (BlockPos)var116;
                  releaseClick(var0);
                  return (((byte)(1187941185 ^ var166)) != 0);
               }

               stop(var0);
               return (((byte)(1792218216 ^ var166)) != 0);
            }

            stop(var0);
            b.abortAutoDigForScreen();
            return (((byte)(1334153183 ^ var166)) != 0);
         }

         stop(var0);
         return (((byte)(1347866334 ^ var166)) != 0);
      }
   }

   private static void trackFallingBlock(Minecraft var0, BlockPos var1) {
      int var40 = 1503160084 ^ 1201979983 ^ 258429565;
      var40 = 532551106 ^ var40;
      ClientLevel var7 = var0.level;
      BlockPos var29 = var1.above();
      BlockState var8 = var7.getBlockState(var29);
      Block var10 = var8.getBlock();
      byte var11 = (byte)((var10 instanceof FallingBlock) ? 1 : 0);
      if (var11 == (249946852 ^ var40)) {
         var40 = nwkaduznemenzhod(var40, 2134683024);
         byte var27 = (byte)(1910067060 ^ var40);
         fallingBlocksInRow = var27;
         Object var28 = null;
         lastFallingPos = (BlockPos)var28;
         var40 = 1592931072 ^ var40;
      } else {
         var40 = 1639907172 ^ var40;
         int var13 = var1.getX();
         byte var30 = (byte)(1868242335 ^ var40);
         int var14 = var13 * var30;
         int var32 = var1.getZ();
         int var15 = var14 + var32;
         BlockPos var16 = lastFallingPos;
         int var17;
         if (var16 == null) {
            var40 = 1832667365 ^ var40;
            var17 = -2107157147 ^ var40;

            label51:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                  case 37806697:
                     var40 ^= 1248238870;
                     break label51;
                  case 489458419:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1499924086:
                     break label51;
                  case 2038595109:
               }
            }
         } else {
            var40 = 1989456406 ^ var40;
            BlockPos var24 = lastFallingPos;
            int var25 = var24.getX();
            byte var35 = (byte)(433041289 ^ var40);
            int var26 = var25 * var35;
            BlockPos var36 = lastFallingPos;
            int var37 = var36.getZ();
            var17 = var26 + var37;
            var40 = 1372481509 ^ var40;
         }

         if (var15 == var17) {
            var40 = 1691351326 ^ var40;
            int var19 = fallingBlocksInRow;
            byte var34 = (byte)(751710572 ^ var40);
            int var20 = var19 + var34;
            fallingBlocksInRow = var20;

            label42:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                  case 114250509:
                     var40 ^= 1598014344;
                  case 358357163:
                     break label42;
                  case 792825490:
                     break;
                  case 1140985795:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         } else {
            var40 = nwkaduznemenzhod(var40, 2120310977);
            byte var23 = (byte)(912304307 ^ var40);
            fallingBlocksInRow = var23;
            var40 = 1167153751 ^ var40;
         }

         BlockPos var22 = var1.immutable();
         lastFallingPos = var22;

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
               case 10794346:
                  var40 = 1557827217 ^ var40;
                  return;
               case 639796872:
                  return;
               case 1797090621:
               default:
                  throw new RuntimeException(new IOException());
               case 1997686931:
            }
         }
      }
   }

   private static boolean holdDig(Minecraft var0, LocalPlayer var1, BlockPos var2) {
      int var124 = 1840011929 ^ 1678959542 ^ 258429565;
      var124 = 1201263746 ^ var124;
      ClientLevel var13 = var0.level;
      BlockState var14 = var13.getBlockState(var2);
      FluidState var16 = var14.getFluidState();
      TagKey var84 = FluidTags.LAVA;
      byte var17 = (byte)((var16.is(var84)) ? 1 : 0);
      if (var17 != (1094729680 ^ var124)) {
         var124 = 1705007619 ^ var124;
         stop(var0);
         String var108 = rydofeadfl(fnmzginxyzdwrcr(), var124);
         MutableComponent var109 = Component.literal(var108);
         byte var118 = (byte)(618685907 ^ var124);
         var1.displayClientMessage(var109, (var118 != 0));
         return (((byte)(618685906 ^ var124)) != 0);
      } else {
         var124 = 1200455340 ^ var124;
         ClientLevel var86 = var0.level;
         float var19 = var14.getDestroySpeed(var86, var2);
         float var9 = var19;
         float var87 = 0.0F;
         float var148;
         int var21 = (var148 = var19 - var87) == 0.0F ? 0 : (var148 < 0.0F ? -1 : 1);
         if (var21 < (114114940 ^ var124)) {
            var124 = 1514589311 ^ var124;
            BlockPos var23 = var2.below();
            int var25 = var23.getY();
            int var88 = targetY;
            byte var110 = (byte)(1552649474 ^ var124);
            int var89 = var88 - var110;
            if (var25 >= var89) {
               var124 = 1370307252 ^ var124;
               byte var27 = (byte)((isMineable(var0, var23)) ? 1 : 0);
               if (var27 != (220641207 ^ var124)) {
                  var124 = 285397245 ^ var124;
                  var2 = var23;
                  ClientLevel var30 = var0.level;
                  BlockState var31 = var30.getBlockState(var23);
                  ClientLevel var93 = var0.level;
                  float var33 = var31.getDestroySpeed(var93, var23);
                  var9 = var33;
                  var124 = 714056597 ^ var124;
               } else {
                  var124 = nwkaduznemenzhod(var124, 999125864);
               }
            } else {
               var124 = 1780500956 ^ var124;
            }

            float var94 = 0.0F;
            float var149;
            int var35 = (var149 = var9 - var94) == 0.0F ? 0 : (var149 < 0.0F ? -1 : 1);
            if (var35 < (917226719 ^ var124)) {
               var124 = 572816438 ^ var124;
               stop(var0);
               String var95 = rydofeadfl(fwvxgrkzxcymtrq(), var124);
               MutableComponent var96 = Component.literal(var95);
               byte var112 = (byte)(344963305 ^ var124);
               var1.displayClientMessage(var96, (var112 != 0));
               return (((byte)(344963304 ^ var124)) != 0);
            }

            var124 = nwkaduznemenzhod(var124, 2131815174);
         } else {
            var124 = 1333161637 ^ var124;
         }

         byte var83;
         label145: {
            BlockPos var39 = currentMineTarget;
            if (var39 != null) {
               var124 = 413758321 ^ var124;
               BlockPos var40 = currentMineTarget;
               byte var41 = (byte)((var40.equals(var2)) ? 1 : 0);
               if (var41 != (1360157864 ^ var124)) {
                  label133:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var124)) {
                        case 15145325:
                           break;
                        case 219398807:
                           var124 ^= 1851497009;
                           break label133;
                        case 342984340:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1177978834:
                           break label133;
                     }
                  }

                  var83 = (byte)(1061799577 ^ var124);
                  var124 = 216944113 ^ var124;
                  break label145;
               }

               var124 = 1506929597 ^ var124;
            } else {
               label143:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var124)) {
                     case 249226511:
                        var124 ^= 1098422476;
                     case 948147038:
                        break label143;
                     case 1102207020:
                        break;
                     case 1198388653:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }

            var83 = (byte)(147044116 ^ var124);
            var124 = nwkaduznemenzhod(var124, 996424829);
         }

         if (var83 != (866618216 ^ var124)) {
            var124 = 354874807 ^ var124;
            BlockPos var43 = currentMineTarget;
            label122:
            if (var43 != null) {
               var124 = 973306270 ^ var124;

               try {
                  MultiPlayerGameMode var45 = var0.gameMode;
                  var45.stopDestroyBlock();
                  var124 ^= 1627316254;
               } catch (Throwable var125) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var124)) {
                     case -468698616:
                        var124 = 529684602 ^ var124;
                        var124 = 1992673117 ^ var124;
                        break label122;
                     default:
                        throw new RuntimeException(new IllegalAccessException("Error in hash"));
                  }
               }

               var124 = 162103097 ^ var124;
            } else {
               var124 = 1398073017 ^ var124;
            }

            com.wimpyclient.i.j var46 = com.wimpyclient.i.j.INSTANCE;
            var46.swapForBlock(var0, var2);
            BlockPos var48 = var2.immutable();
            currentMineTarget = var48;
            byte var49 = (byte)(1976932454 ^ var124);
            needsToolSwap = (var49 != 0);
            var124 = 1753757788 ^ var124;
         } else {
            label113:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var124)) {
                  case 68464062:
                     var124 ^= 704713189;
                     break label113;
                  case 152770172:
                  default:
                     throw new RuntimeException(new IOException());
                  case 516099479:
                     break;
                  case 761028216:
                     break label113;
               }
            }

            byte var76 = (byte)((needsToolSwap) ? 1 : 0);
            if (var76 != (430348941 ^ var124)) {
               var124 = 1565459706 ^ var124;
               com.wimpyclient.i.j var77 = com.wimpyclient.i.j.INSTANCE;
               var77.swapForBlock(var0, var2);
               byte var78 = (byte)(1156161143 ^ var124);
               needsToolSwap = (var78 != 0);
               var124 = 1504984653 ^ var124;
            } else {
               var124 = nwkaduznemenzhod(var124, 83573431);
            }
         }

         BlockHitResult var52;
         byte var82;
         label105: {
            lookAtBlock(var1, var2);
            var52 = hitFor(var1, var2);
            var0.hitResult = var52;
            Options var55 = var0.options;
            KeyMapping var56 = var55.keyUse;
            byte var102 = (byte)(492675130 ^ var124);
            var56.setDown((var102 != 0));
            MouseHandler var58 = var0.mouseHandler;
            if (var58 != null) {
               var124 ^= 324073303;
               MouseHandler var60 = var0.mouseHandler;
               byte var61 = (byte)((var60.isMouseGrabbed()) ? 1 : 0);
               if (var61 != (235755373 ^ var124)) {
                  var124 = 2027481371 ^ var124;
                  var82 = (byte)(1993719415 ^ var124);
                  var124 = nwkaduznemenzhod(var124, 1870390673);
                  break label105;
               }

               label96:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var124)) {
                     case 188340078:
                        var124 ^= 1514696767;
                     case 311264866:
                        break label96;
                     case 1297287327:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1717365629:
                  }
               }
            } else {
               label103:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var124)) {
                     case 21427607:
                        break label103;
                     case 149257005:
                        var124 ^= 1226344296;
                        break label103;
                     case 856633569:
                        break;
                     case 1247399472:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }

            var82 = (byte)(1413818194 ^ var124);
            var124 = 1307278517 ^ var124;
         }

         if (var82 == (430857191 ^ var124)) {
            var124 = 794544583 ^ var124;
            Options var64 = var0.options;
            KeyMapping var65 = var64.keyAttack;
            byte var103 = (byte)(922063393 ^ var124);
            var65.setDown((var103 != 0));
            mineBlockDirect(var0, var1, var2, var52, (var83 != 0));
            var124 = 2100474449 ^ var124;
            return (((byte)(1271341169 ^ var124)) != 0);
         } else {
            var124 = 511898580 ^ var124;
            Options var69 = var0.options;
            KeyMapping var70 = var69.keyAttack;
            byte var105 = (byte)(120367154 ^ var124);
            var70.setDown((var105 != 0));
            if (var83 == (120367155 ^ var124)) {
               var124 = nwkaduznemenzhod(var124, 1290504258);
               return (((byte)(1271341169 ^ var124)) != 0);
            } else {
               var124 = 1839707732 ^ var124;
               MultiPlayerGameMode var73 = var0.gameMode;
               Direction var116 = var52.getDirection();
               boolean var74 = var73.startDestroyBlock(var2, var116);

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var124)) {
                     case 106816952:
                        break;
                     case 242081900:
                        var124 ^= 558644758;
                        return (((byte)(1271341169 ^ var124)) != 0);
                     case 1244687909:
                        return (((byte)(1271341169 ^ var124)) != 0);
                     case 1675129032:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }
         }
      }
   }

   private static void mineBlockDirect(Minecraft var0, LocalPlayer var1, BlockPos var2, BlockHitResult var3, boolean var4) {
      int var57 = 2069397392 ^ 426294125 ^ 258429565;
      var57 = 614723449 ^ var57;
      Direction var11 = var3.getDirection();
      if (var4 != ((1240758777 ^ var57) != 0)) {
         var57 = 1441178656 ^ var57;
         MultiPlayerGameMode var42 = var0.gameMode;
         boolean var43 = var42.startDestroyBlock(var2, var11);
      } else {
         label40: {
            var57 = nwkaduznemenzhod(var57, 1510509434);
            MultiPlayerGameMode var14 = var0.gameMode;
            byte var16 = (byte)((var14 instanceof aj) ? 1 : 0);
            if (var16 != (335344259 ^ var57)) {
               var57 = 1375320711 ^ var57;
               aj var30 = (aj)var14;
               BlockPos var32 = var30.wimpyclient$getDestroyBlockPos();
               byte var34 = (byte)((var30.wimpyclient$isDestroying()) ? 1 : 0);
               if (var34 == (1107642372 ^ var57)) {
                  var57 = 68324117 ^ var57;
                  break label40;
               }

               var57 = 671821939 ^ var57;
               if (var32 == null) {
                  var57 = 739883878 ^ var57;
                  break label40;
               }

               var57 = 1413297305 ^ var57;
               byte var37 = (byte)((var32.equals(var2)) ? 1 : 0);
               if (var37 == (1043549422 ^ var57)) {
                  var57 = 2015662079 ^ var57;
                  break label40;
               }

               var57 = 592216254 ^ var57;
               var57 = 179119943 ^ var57;
            } else {
               var57 = 1005839900 ^ var57;
               MultiPlayerGameMode var18 = var0.gameMode;
               byte var19 = (byte)((var18.isDestroying()) ? 1 : 0);
               if (var19 == (672076959 ^ var57)) {
                  var57 = 1136566614 ^ var57;
                  MultiPlayerGameMode var21 = var0.gameMode;
                  boolean var22 = var21.startDestroyBlock(var2, var11);
                  return;
               }

               var57 = nwkaduznemenzhod(var57, 1071513480);
            }

            MultiPlayerGameMode var24 = var0.gameMode;
            byte var25 = (byte)((var24.continueDestroyBlock(var2, var11)) ? 1 : 0);
            if (var25 != (399698711 ^ var57)) {
               var57 = 1135708661 ^ var57;
               ClientLevel var27 = var0.level;
               var27.addBreakingBlockEffect(var2, var11);
               InteractionHand var46 = InteractionHand.MAIN_HAND;
               var1.swing(var46);
               var57 = 1495476353 ^ var57;
            } else {
               var57 = nwkaduznemenzhod(var57, 445817204);
            }

            return;
         }

         MultiPlayerGameMode var39 = var0.gameMode;
         boolean var40 = var39.startDestroyBlock(var2, var11);
      }
   }

   private static void ensureMouseGrabbed(Minecraft var0) {
      int var14 = 1637576837 ^ 931738289 ^ 258429565;
      var14 = 806890066 ^ var14;
      MouseHandler var3 = var0.mouseHandler;
      if (var3 != null) {
         var14 = 300758769 ^ var14;
         MouseHandler var5 = var0.mouseHandler;
         byte var6 = (byte)((var5.isMouseGrabbed()) ? 1 : 0);
         if (var6 == (2021657834 ^ var14)) {
            var14 = 1319883355 ^ var14;
            Screen var8 = var0.screen;
            if (var8 == null) {
               var14 = 722050035 ^ var14;

               try {
                  MouseHandler var10 = var0.mouseHandler;
                  var10.grabMouse();
                  var14 ^= 65775828;
               } catch (Throwable var15) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var14)) {
                     case -384685552:
                        var14 = 1533705844 ^ var14;
                        var14 = 1255551214 ^ var14;
                        return;
                     default:
                        throw new RuntimeException(new IOException("Error in hash"));
                  }
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
                     case 195502747:
                        var14 = 307750478 ^ var14;
                        return;
                     case 517926092:
                        break;
                     case 885390337:
                     default:
                        throw new IllegalStateException();
                     case 990946262:
                        return;
                  }
               }
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
                     case 150260061:
                        var14 = 984995177 ^ var14;
                        return;
                     case 679363922:
                        return;
                     case 1290561878:
                        break;
                     case 1987029575:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }
         } else {
            var14 = nwkaduznemenzhod(var14, 1948124978);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
               case 205769209:
                  var14 = 1710436803 ^ var14;
                  return;
               case 501698172:
                  break;
               case 2067420802:
               default:
                  throw new IllegalStateException();
               case 2080358864:
                  return;
            }
         }
      }
   }

   private static void releaseClick(Minecraft var0) {
      int var21 = 340064289 ^ 1890097098 ^ 258429565;
      var21 = 434270998 ^ var21;
      if (var0 == null) {
         var21 = 1895701619 ^ var21;
      } else {
         var21 = 1008980446 ^ var21;
         MultiPlayerGameMode var5 = var0.gameMode;
         label45:
         if (var5 != null) {
            var21 = 837506361 ^ var21;

            try {
               MultiPlayerGameMode var7 = var0.gameMode;
               var7.stopDestroyBlock();
               var21 ^= 1632645056;
            } catch (Throwable var22) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var21)) {
                  case -49392837:
                     var21 = 1979215178 ^ var21;
                     var21 = 147781086 ^ var21;
                     break label45;
                  default:
                     throw new RuntimeException(new IOException("Error in hash"));
               }
            }

            var21 = 476493652 ^ var21;
         } else {
            var21 = 1289604525 ^ var21;
         }
      }

      if (var0 == null) {
         var21 = nwkaduznemenzhod(var21, 1561975518);
      } else {
         var21 = 368748940 ^ var21;
         Options var11 = var0.options;
         if (var11 != null) {
            var21 = 76679131 ^ var21;
            Options var13 = var0.options;
            KeyMapping var14 = var13.keyAttack;
            byte var2 = (byte)(335543460 ^ var21);
            var14.setDown((var2 != 0));
            Options var16 = var0.options;
            KeyMapping var17 = var16.keyUse;
            byte var18 = (byte)(335543460 ^ var21);
            var17.setDown((var18 != 0));
            var21 = 1282503817 ^ var21;
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var21)) {
                  case 224722987:
                     var21 = 1222865746 ^ var21;
                     return;
                  case 329507564:
                     break;
                  case 546532972:
                     return;
                  case 1768161298:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      }
   }

   private static BlockPos pickDigTarget(Minecraft var0, LocalPlayer var1) {
      int var122 = 1801420076 ^ 895151955 ^ 258429565;
      var122 = 793635856 ^ var122;
      BlockPos var17 = var1.blockPosition();
      BlockPos var6 = var17;
      BlockPos var19 = var17.below();
      BlockPos var7 = var19;
      byte var21 = (byte)((isMineable(var0, var17)) ? 1 : 0);
      if (var21 != (2117020690 ^ var122)) {
         var122 = 789874530 ^ var122;
         return var17;
      } else {
         var122 = nwkaduznemenzhod(var122, 534548277);
         byte var23 = (byte)((isMineable(var0, var19)) ? 1 : 0);
         if (var23 != (1643356967 ^ var122)) {
            var122 = 589234743 ^ var122;
            return var19;
         } else {
            var122 = 1307619573 ^ var122;
            byte var26 = (byte)((var1.isCreative()) ? 1 : 0);
            double var79;
            if (var26 != (738399186 ^ var122)) {
               var122 = 1829691795 ^ var122;
               var79 = 5.0;
               var122 = nwkaduznemenzhod(var122, 1220357051);
            } else {
               var122 = 98587320 ^ var122;
               var79 = 4.5;
               var122 = 542349456 ^ var122;
            }

            double var29 = Math.ceil(var79);
            int var31 = (int)var29;
            int var10 = var31;
            byte var32 = (byte)(162585080 ^ var122);
            int var11 = var32;
            var122 = 838121099 ^ var122;

            label124:
            while (true) {
               label128: {
                  if (var11 <= var10) {
                     var122 = 36367748 ^ var122;
                     BlockPos var35 = var6.below(var11);
                     int var37 = var35.getY();
                     int var84 = targetY;
                     byte var4 = (byte)(980321012 ^ var122);
                     int var85 = var84 - var4;
                     if (var37 < var85) {
                        var122 = 1711408277 ^ var122;
                        var122 = 1641081784 ^ var122;
                     } else {
                        var122 = nwkaduznemenzhod(var122, 959084979);
                        ClientLevel var39 = var0.level;
                        BlockState var40 = var39.getBlockState(var35);
                        byte var42 = (byte)((isPassableFluid(var40)) ? 1 : 0);
                        if (var42 != (54852422 ^ var122)) {
                           var122 = nwkaduznemenzhod(var122, 407610032);
                           break label128;
                        }

                        var122 = 1824345523 ^ var122;
                        byte var44 = (byte)((var40.isAir()) ? 1 : 0);
                        if (var44 != (1878636277 ^ var122)) {
                           var122 = 89555098 ^ var122;
                           var122 = 1906339737 ^ var122;
                           break label128;
                        }

                        var122 = nwkaduznemenzhod(var122, 1000291229);
                        byte var46 = (byte)((isMineable(var0, var35)) ? 1 : 0);
                        if (var46 != (1416007016 ^ var122)) {
                           var122 = 2061219657 ^ var122;
                           return var35;
                        }

                        var122 = nwkaduznemenzhod(var122, 1775952048);
                     }
                  } else {
                     var122 = 100139689 ^ var122;
                  }

                  int var48 = stuckTicks;
                  byte var88 = (byte)(1035759041 ^ var122);
                  if (var48 >= var88) {
                     var122 = 1165694703 ^ var122;
                     byte var49 = (byte)(2026339123 ^ var122);
                     Direction[] var50 = new Direction[var49];
                     byte var97 = (byte)(2026339127 ^ var122);
                     Direction var5 = Direction.NORTH;
                     var50[var97] = var5;
                     byte var98 = (byte)(2026339126 ^ var122);
                     Direction var105 = Direction.SOUTH;
                     var50[var98] = var105;
                     byte var99 = (byte)(2026339125 ^ var122);
                     Direction var106 = Direction.WEST;
                     var50[var99] = var106;
                     byte var100 = (byte)(2026339124 ^ var122);
                     Direction var107 = Direction.EAST;
                     var50[var100] = var107;
                     Direction[] var112 = var50;
                     int var52 = var50.length;
                     int var114 = var52;
                     byte var53 = (byte)(2026339127 ^ var122);
                     int var116 = var53;
                     var122 = 1593674893 ^ var122;

                     while (var116 < var114) {
                        var122 = 1968881281 ^ var122;
                        Direction var72 = var112[var116];
                        BlockPos var74 = var7.relative(var72);
                        byte var76 = (byte)((isMineable(var0, var74)) ? 1 : 0);
                        if (var76 != (1398819131 ^ var122)) {
                           var122 = 1198374369 ^ var122;
                           return var74;
                        }

                        var122 = 743925248 ^ var122;
                        var116 += 2134323002 ^ var122;
                        var122 = 1494079617 ^ var122;
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var122)) {
                           case 168958402:
                              var122 ^= 2118194477;
                           case 750205484:
                              BlockPos var56 = var6.above();
                              BlockPos var113 = var56;
                              byte var57 = (byte)(1484513939 ^ var122);
                              Direction[] var58 = new Direction[var57];
                              byte var101 = (byte)(1484513943 ^ var122);
                              Direction var108 = Direction.NORTH;
                              var58[var101] = var108;
                              byte var102 = (byte)(1484513942 ^ var122);
                              Direction var109 = Direction.SOUTH;
                              var58[var102] = var109;
                              byte var103 = (byte)(1484513941 ^ var122);
                              Direction var110 = Direction.WEST;
                              var58[var103] = var110;
                              byte var104 = (byte)(1484513940 ^ var122);
                              Direction var111 = Direction.EAST;
                              var58[var104] = var111;
                              Direction[] var115 = var58;
                              int var60 = var58.length;
                              int var117 = var60;
                              byte var61 = (byte)(1484513943 ^ var122);
                              int var14 = var61;
                              var122 = 1663833232 ^ var122;

                              while (var14 < var117) {
                                 var122 = 592541858 ^ var122;
                                 Direction var65 = var115[var14];
                                 BlockPos var67 = var113.relative(var65);
                                 byte var69 = (byte)((isMineable(var0, var67)) ? 1 : 0);
                                 if (var69 != (403082917 ^ var122)) {
                                    var122 = 968296205 ^ var122;
                                    return var67;
                                 }

                                 label74:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var122)) {
                                       case 47846709:
                                       default:
                                          throw new IllegalStateException();
                                       case 244100185:
                                          var122 ^= 889790397;
                                          break label74;
                                       case 1674147521:
                                          break;
                                       case 1769289296:
                                          break label74;
                                    }
                                 }

                                 var14 += 755994905 ^ var122;
                                 var122 = nwkaduznemenzhod(var122, 374892319);
                              }

                              var122 = 997929028 ^ var122;
                              return null;
                           case 350193069:
                              break;
                           case 1829597886:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var122)) {
                        case 127740270:
                           var122 = 1032891291 ^ var122;
                           return null;
                        case 1611233263:
                           return null;
                        case 1809012118:
                        default:
                           throw new IllegalStateException();
                        case 2134900569:
                     }
                  }
               }

               var11 += 453990903 ^ var122;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var122)) {
                     case 74294595:
                        var122 ^= 592131719;
                     case 752222596:
                        continue label124;
                     case 939706142:
                        break;
                     case 1012979216:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }
         }
      }
   }

   private static boolean isMineable(Minecraft var0, BlockPos var1) {
      int var30 = 1709830509 ^ 74445106 ^ 258429565;
      var30 = 528854137 ^ var30;
      ClientLevel var7 = var0.level;
      BlockState var8 = var7.getBlockState(var1);
      byte var10 = (byte)((var8.isAir()) ? 1 : 0);
      if (var10 != (1902444123 ^ var30)) {
         var30 = 1976514780 ^ var30;
         return (((byte)(78366343 ^ var30)) != 0);
      } else {
         var30 = nwkaduznemenzhod(var30, 166465162);
         FluidState var12 = var8.getFluidState();
         TagKey var24 = FluidTags.LAVA;
         byte var13 = (byte)((var12.is(var24)) ? 1 : 0);
         if (var13 != (2022240465 ^ var30)) {
            var30 = 1616824240 ^ var30;
            return (((byte)(416692065 ^ var30)) != 0);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 159984156:
                     var30 ^= 1558595956;
                  case 1294393884:
                     byte var16 = (byte)((isPassableFluid(var8)) ? 1 : 0);
                     if (var16 != (611236261 ^ var30)) {
                        var30 = 1814513222 ^ var30;
                        return (((byte)(1212809187 ^ var30)) != 0);
                     }

                     var30 = 921215450 ^ var30;
                     ClientLevel var26 = var0.level;
                     float var19 = var8.getDestroySpeed(var26, var1);
                     float var27 = 0.0F;
                     float var40;
                     int var21 = (var40 = var19 - var27) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
                     if (var21 >= (310777983 ^ var30)) {
                        var30 = 1628508161 ^ var30;
                        byte var41 = (byte)(1939277951 ^ var30);
                        var30 = nwkaduznemenzhod(var30, 1686520746);
                        return (var41 != 0);
                     }

                     label37:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                           case 65265136:
                              var30 ^= 1873781821;
                              break label37;
                           case 618405458:
                              break;
                           case 687473745:
                           default:
                              throw new IllegalStateException();
                           case 1791848407:
                              break label37;
                        }
                     }

                     byte var23 = (byte)(2099887170 ^ var30);
                     var30 = 1782118294 ^ var30;
                     return (var23 != 0);
                  case 513032198:
                     break;
                  case 1905060665:
                  default:
                     throw new IllegalStateException();
               }
            }
         }
      }
   }

   private static boolean isPassableFluid(BlockState var0) {
      int var19 = 1469999884 ^ 1702149417 ^ 258429565;
      var19 = 526790405 ^ var19;
      FluidState var5 = var0.getFluidState();
      byte var6 = (byte)((var5.isEmpty()) ? 1 : 0);
      if (var6 != (585870173 ^ var19)) {
         var19 = 1939844724 ^ var19;
         return (((byte)(1366557993 ^ var19)) != 0);
      } else {
         var19 = nwkaduznemenzhod(var19, 769119449);
         FluidState var8 = var0.getFluidState();
         TagKey var2 = FluidTags.WATER;
         byte var9 = (byte)((var8.is(var2)) ? 1 : 0);
         if (var9 == (255623044 ^ var19)) {
            var19 = 1969429071 ^ var19;
            return (((byte)(2053072331 ^ var19)) != 0);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
                  case 86756578:
                     break;
                  case 157686012:
                  default:
                     throw new IllegalStateException();
                  case 226834483:
                     var19 = 1189435724 ^ var19;
                  case 922797451:
                     EmptyBlockGetter var16 = EmptyBlockGetter.INSTANCE;
                     BlockPos var3 = BlockPos.ZERO;
                     VoxelShape var12 = var0.getCollisionShape(var16, var3);
                     return var12.isEmpty();
               }
            }
         }
      }
   }

   private static boolean isWaterCell(BlockState var0) {
      int var21 = 1437317941 ^ 1068257379 ^ 258429565;
      var21 = 837305581 ^ var21;
      byte var3 = (byte)((var0.isAir()) ? 1 : 0);
      if (var3 != (1418264006 ^ var21)) {
         var21 = 543595193 ^ var21;
         return (((byte)(1961781119 ^ var21)) != 0);
      } else {
         var21 = nwkaduznemenzhod(var21, 1469174664);
         FluidState var5 = var0.getFluidState();
         TagKey var2 = FluidTags.WATER;
         byte var6 = (byte)((var5.is(var2)) ? 1 : 0);
         if (var6 != (51981902 ^ var21)) {
            var21 = 577449948 ^ var21;
            return (((byte)(561119635 ^ var21)) != 0);
         } else {
            var21 = 457836042 ^ var21;
            byte var8 = (byte)((var0.canBeReplaced()) ? 1 : 0);
            if (var8 != (408102980 ^ var21)) {
               var21 = 31955433 ^ var21;
               FluidState var10 = var0.getFluidState();
               byte var11 = (byte)((var10.isEmpty()) ? 1 : 0);
               if (var11 == (431272365 ^ var21)) {
                  var21 = 1525039681 ^ var21;
                  FluidState var13 = var0.getFluidState();
                  TagKey var18 = FluidTags.WATER;
                  byte var14 = (byte)((var13.is(var18)) ? 1 : 0);
                  if (var14 != (1129509868 ^ var21)) {
                     var21 = 558080916 ^ var21;
                     byte var17 = (byte)(1645301881 ^ var21);
                     var21 = 1257007628 ^ var21;
                     return (var17 != 0);
                  }

                  var21 = nwkaduznemenzhod(var21, 2130345728);
               } else {
                  var21 = nwkaduznemenzhod(var21, 605830465);
               }
            } else {
               var21 = nwkaduznemenzhod(var21, 637248680);
            }

            byte var33 = (byte)(1034456300 ^ var21);
            var21 = 357938840 ^ var21;
            return (var33 != 0);
         }
      }
   }

   private static void lookAtBlock(LocalPlayer var0, BlockPos var1) {
      int var18 = 318601265 ^ 707171053 ^ 258429565;
      var18 = 268180490 ^ var18;
      BlockPos var5 = var0.blockPosition();
      int var7 = var1.getY();
      int var11 = var5.getY();
      if (var7 >= var11) {
         var18 = 1666435159 ^ var18;
         float var12 = 55.0F;
         var0.setXRot(var12);
         var18 = nwkaduznemenzhod(var18, 1815725797);
      } else {
         var18 = 301805650 ^ var18;
         float var15 = 90.0F;
         var0.setXRot(var15);
         var18 = 513228512 ^ var18;
      }

      float var14 = var0.getXRot();
      var0.xRotO = var14;
   }

   private static boolean isUnderwater(Minecraft var0, LocalPlayer var1) {
      int var25 = 485244113 ^ 1554237201 ^ 258429565;
      var25 = 1068767421 ^ var25;
      TagKey var3 = FluidTags.WATER;
      byte var7 = (byte)((var1.isEyeInFluid(var3)) ? 1 : 0);
      if (var7 == (1889317120 ^ var25)) {
         var25 = 1785996456 ^ var25;
         byte var9 = (byte)((var1.isUnderWater()) ? 1 : 0);
         if (var9 == (451450280 ^ var25)) {
            var25 = 1964458243 ^ var25;
            double var11 = var1.getX();
            double var20 = var1.getEyeY();
            double var22 = var1.getZ();
            BlockPos var13 = BlockPos.containing(var11, var20, var22);
            ClientLevel var15 = var0.level;
            BlockState var16 = var15.getBlockState(var13);
            return isWaterCell(var16);
         }

         var25 = 552683363 ^ var25;
      } else {
         var25 = 1250255819 ^ var25;
      }

      return (((byte)(974770890 ^ var25)) != 0);
   }

   private static boolean isSealedAbove(Minecraft var0, LocalPlayer var1) {
      int var21 = 1832395852 ^ 253624900 ^ 258429565;
      var21 = 212511838 ^ var21;
      BlockPos var6 = var1.blockPosition();
      byte var3 = (byte)(1642846249 ^ var21);
      BlockPos var7 = var6.above(var3);
      ClientLevel var9 = var0.level;
      BlockState var10 = var9.getBlockState(var7);
      byte var12 = (byte)((var10.isAir()) ? 1 : 0);
      if (var12 == (1642846251 ^ var21)) {
         var21 = 1367060978 ^ var21;
         byte var14 = (byte)((isPassableFluid(var10)) ? 1 : 0);
         if (var14 == (814770649 ^ var21)) {
            var21 = 65498780 ^ var21;
            byte var16 = (byte)((isWaterCell(var10)) ? 1 : 0);
            if (var16 == (863438661 ^ var21)) {
               var21 = 1207629554 ^ var21;
               byte var17 = (byte)(1955459510 ^ var21);
               var21 = nwkaduznemenzhod(var21, 1724929160);
               return (var17 != 0);
            }

            var21 = nwkaduznemenzhod(var21, 1549291597);
         } else {
            var21 = 1606368977 ^ var21;
         }
      } else {
         label26:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var21)) {
               case 230200120:
                  var21 ^= 247762723;
               case 871307557:
                  break label26;
               case 1646320670:
                  break;
               case 1947606795:
               default:
                  throw new RuntimeException();
            }
         }
      }

      byte var28 = (byte)(1865373448 ^ var21);
      var21 = 2104685111 ^ var21;
      return (var28 != 0);
   }

   private static boolean tryPlaceBlockAbove(Minecraft var0, LocalPlayer var1) {
      int var139 = 1260236774 ^ 31429308 ^ 258429565;
      var139 = 1909269600 ^ var139;
      int var2 = placeCooldown;
      if (var2 > (879250247 ^ var139)) {
         var139 = 1028390071 ^ var139;
         return (((byte)(153335792 ^ var139)) != 0);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
               case 92939697:
                  var139 ^= 538861777;
               case 2117059244:
                  byte var18 = (byte)((selectThrowawayBlock(var0, var1)) ? 1 : 0);
                  if (var18 == (343288726 ^ var139)) {
                     var139 = 328981142 ^ var139;
                     clearPlaceAim();
                     return (((byte)(133034240 ^ var139)) != 0);
                  }

                  var139 = nwkaduznemenzhod(var139, 1154247761);
                  BlockPos var21 = var1.blockPosition();
                  byte var100 = (byte)(1354385349 ^ var139);
                  BlockPos var22 = var21.above(var100);
                  byte var24 = (byte)((isSealedAbove(var0, var1)) ? 1 : 0);
                  if (var24 != (1354385351 ^ var139)) {
                     var139 = 821452102 ^ var139;
                     clearPlaceAim();
                     byte var96 = (byte)(1615600256 ^ var139);
                     needsToolSwap = (var96 != 0);
                     Object var97 = null;
                     currentMineTarget = (BlockPos)var97;
                     return (((byte)(1615600256 ^ var139)) != 0);
                  }

                  var139 = nwkaduznemenzhod(var139, 96626920);
                  ClientLevel var26 = var0.level;
                  BlockState var27 = var26.getBlockState(var22);
                  byte var29 = (byte)((isWaterCell(var27)) ? 1 : 0);
                  if (var29 == (1433939759 ^ var139)) {
                     var139 = 429952517 ^ var139;
                     byte var31 = (byte)((var27.canBeReplaced()) ? 1 : 0);
                     if (var31 == (1289265450 ^ var139)) {
                        var139 = 1255684402 ^ var139;
                        byte var33 = (byte)((var27.isAir()) ? 1 : 0);
                        if (var33 == (100702232 ^ var139)) {
                           var139 = 496301598 ^ var139;
                           clearPlaceAim();
                           return (((byte)(462712327 ^ var139)) != 0);
                        }

                        var139 = nwkaduznemenzhod(var139, 256537146);
                     } else {
                        var139 = nwkaduznemenzhod(var139, 1167215368);
                     }
                  } else {
                     var139 = 1546831117 ^ var139;
                  }

                  label173: {
                     Vec3 var35 = placeAimHit;
                     if (var35 != null) {
                        var139 = 1536605116 ^ var139;
                        BlockPos var36 = placeSlot;
                        if (var36 != null) {
                           var139 = 1053056224 ^ var139;
                           BlockPos var37 = placeSlot;
                           byte var38 = (byte)((var37.equals(var22)) ? 1 : 0);
                           if (var38 != (1813515646 ^ var139)) {
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                                    case 24049212:
                                       var139 ^= 188714510;
                                       break label173;
                                    case 335283111:
                                    default:
                                       throw new RuntimeException();
                                    case 477160106:
                                       break label173;
                                    case 1828361282:
                                 }
                              }
                           }

                           var139 ^= 1564296405;
                        } else {
                           var139 = nwkaduznemenzhod(var139, 1677269045);
                        }
                     } else {
                        label157:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                              case 33631467:
                                 var139 ^= 946840457;
                              case 911629620:
                                 break label157;
                              case 1053444074:
                                 break;
                              case 1452387108:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     }

                     byte var40 = (byte)((acquirePlaceAim(var0, var1, var22)) ? 1 : 0);
                     if (var40 == (824527275 ^ var139)) {
                        var139 = 1431252833 ^ var139;
                        clearPlaceAim();
                        return (((byte)(1684694730 ^ var139)) != 0);
                     }

                     label140:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                           case 55375308:
                           default:
                              throw new RuntimeException();
                           case 84415000:
                              break;
                           case 255332254:
                              var139 ^= 1443023579;
                           case 2090531794:
                              break label140;
                        }
                     }
                  }

                  int var41 = placeAimTicks;
                  byte var105 = (byte)(1730642801 ^ var139);
                  int var42 = var41 + var105;
                  placeAimTicks = var42;
                  Vec3 var106 = placeAimHit;
                  byte var44 = (byte)((smoothAimToward(var1, var106)) ? 1 : 0);
                  Vec3 var5 = placeAimHit;
                  Direction var6 = placeFace;
                  BlockPos var7 = placeAgainst;
                  byte var8 = (byte)(1730642800 ^ var139);
                  BlockHitResult var107 = new BlockHitResult(var5, var6, var7, (var8 != 0));
                  var0.hitResult = var107;
                  Options var47 = var0.options;
                  KeyMapping var48 = var47.keyAttack;
                  byte var108 = (byte)(1730642800 ^ var139);
                  var48.setDown((var108 != 0));
                  Options var50 = var0.options;
                  KeyMapping var51 = var50.keyUse;
                  byte var109 = (byte)(1730642800 ^ var139);
                  var51.setDown((var109 != 0));
                  if (var44 == (1730642800 ^ var139)) {
                     var139 = 1934420084 ^ var139;
                     return (((byte)(342584068 ^ var139)) != 0);
                  }

                  var139 = 1389368892 ^ var139;
                  int var53 = placeAimTicks;
                  byte var110 = (byte)(905418057 ^ var139);
                  if (var53 < var110) {
                     var139 = 563936840 ^ var139;
                     return (((byte)(342584068 ^ var139)) != 0);
                  }

                  label132:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                        case 143623348:
                           var139 ^= 587871551;
                           break label132;
                        case 1102652939:
                        default:
                           throw new RuntimeException();
                        case 1285088084:
                           break label132;
                        case 2131036763:
                     }
                  }

                  MultiPlayerGameMode var55 = var0.gameMode;
                  byte var57 = (byte)((var55 instanceof aj) ? 1 : 0);
                  if (var57 != (385720435 ^ var139)) {
                     var139 = 808957957 ^ var139;
                     aj var59 = (aj)var55;
                     var59.wimpyclient$syncCarriedItem();
                     var139 = 31511556 ^ var139;
                  } else {
                     var139 = nwkaduznemenzhod(var139, 836201473);
                  }

                  byte var62 = (byte)((var1.isCreative()) ? 1 : 0);
                  double var92;
                  if (var62 != (657116274 ^ var139)) {
                     var139 = 1190189132 ^ var139;
                     var92 = 5.0;
                     var139 = 392593050 ^ var139;
                  } else {
                     label122:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                           case 199412534:
                              var139 ^= 2067670288;
                              break label122;
                           case 1067689069:
                           default:
                              throw new RuntimeException();
                           case 1268343569:
                              break;
                           case 1340077522:
                              break label122;
                        }
                     }

                     var92 = 4.5;
                     var139 = 715686854 ^ var139;
                  }

                  float var124 = 1.0F;
                  byte var128 = (byte)(1992059556 ^ var139);
                  HitResult var64 = var1.pick(var92, var124, (var128 != 0));
                  Type var66 = var64.getType();
                  Type var113 = Type.BLOCK;
                  BlockHitResult var135;
                  if (var66 == var113) {
                     label113: {
                        var139 = 87358771 ^ var139;
                        BlockHitResult var81 = (BlockHitResult)var64;
                        BlockPos var83 = var81.getBlockPos();
                        Direction var118 = var81.getDirection();
                        BlockPos var84 = var83.relative(var118);
                        BlockPos var119 = placeSlot;
                        byte var86 = (byte)((var84.equals(var119)) ? 1 : 0);
                        if (var86 == (1938331543 ^ var139)) {
                           var139 = 1955288185 ^ var139;
                           BlockPos var88 = var81.getBlockPos();
                           BlockPos var120 = placeAgainst;
                           byte var89 = (byte)((var88.equals(var120)) ? 1 : 0);
                           if (var89 == (117687278 ^ var139)) {
                              label108:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                                    case 110330028:
                                       var139 ^= 1227567728;
                                    case 1292522774:
                                       break label108;
                                    case 1540935707:
                                       break;
                                    case 2085576117:
                                    default:
                                       throw new RuntimeException();
                                 }
                              }

                              Vec3 var123 = placeAimHit;
                              Direction var127 = placeFace;
                              BlockPos var130 = placeAgainst;
                              byte var132 = (byte)(1311306142 ^ var139);
                              BlockHitResult var90 = new BlockHitResult(var123, var127, var130, (var132 != 0));
                              var135 = var90;
                              var139 = 1892952753 ^ var139;
                              break label113;
                           }

                           var139 = 1599913798 ^ var139;
                        } else {
                           var139 = nwkaduznemenzhod(var139, 735570751);
                        }

                        var135 = var81;
                        var139 = nwkaduznemenzhod(var139, 1722001287);
                     }

                     var139 = nwkaduznemenzhod(var139, 1143215107);
                  } else {
                     label100:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                           case 67975060:
                              break label100;
                           case 101546017:
                              var139 ^= 1451466240;
                              break label100;
                           case 597405975:
                           default:
                              throw new RuntimeException();
                           case 1139008155:
                        }
                     }

                     Vec3 var121 = placeAimHit;
                     Direction var125 = placeFace;
                     BlockPos var129 = placeAgainst;
                     byte var131 = (byte)(541062308 ^ var139);
                     BlockHitResult var67 = new BlockHitResult(var121, var125, var129, (var131 != 0));
                     var135 = var67;
                     var139 = 1525103496 ^ var139;
                  }

                  var0.hitResult = var135;
                  MultiPlayerGameMode var70 = var0.gameMode;
                  InteractionHand var122 = InteractionHand.MAIN_HAND;
                  InteractionResult var71 = var70.useItemOn(var1, var122, var135);
                  byte var73 = (byte)((var71.consumesAction()) ? 1 : 0);
                  if (var73 != (2061029164 ^ var139)) {
                     var139 = 503373233 ^ var139;
                     InteractionHand var116 = InteractionHand.MAIN_HAND;
                     var1.swing(var116);
                     byte var76 = (byte)(1691882142 ^ var139);
                     placeCooldown = var76;
                     clearPlaceAim();
                     Object var77 = null;
                     currentMineTarget = (BlockPos)var77;
                     byte var78 = (byte)(1691882140 ^ var139);
                     needsToolSwap = (var78 != 0);
                     return (((byte)(1691882140 ^ var139)) != 0);
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                        case 235170749:
                           var139 ^= 1038690220;
                           return (((byte)(1194453120 ^ var139)) != 0);
                        case 588732025:
                           break;
                        case 613507149:
                        default:
                           throw new RuntimeException();
                        case 1785213404:
                           return (((byte)(1194453120 ^ var139)) != 0);
                     }
                  }
               case 542371080:
                  break;
               case 765513854:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private static void clearPlaceAim() {
      int var7 = 1696723865 ^ 2118979368 ^ 258429565;
      var7 = 406586623 ^ var7;
      Object var0 = null;
      placeAimHit = (Vec3)var0;
      Object var1 = null;
      placeAgainst = (BlockPos)var1;
      Object var2 = null;
      placeFace = (Direction)var2;
      Object var3 = null;
      placeSlot = (BlockPos)var3;
      byte var4 = (byte)(204974643 ^ var7);
      placeAimTicks = var4;
   }

   private static boolean acquirePlaceAim(Minecraft var0, LocalPlayer var1, BlockPos var2) {
      int var99 = 679560930 ^ 207021602 ^ 258429565;
      var99 = 1120035986 ^ var99;
      byte var3 = (byte)(1769117225 ^ var99);
      Direction[] var19 = new Direction[var3];
      byte var4 = (byte)(1769117231 ^ var99);
      Direction var5 = Direction.NORTH;
      var19[var4] = var5;
      byte var71 = (byte)(1769117230 ^ var99);
      Direction var78 = Direction.SOUTH;
      var19[var71] = var78;
      byte var72 = (byte)(1769117229 ^ var99);
      Direction var79 = Direction.WEST;
      var19[var72] = var79;
      byte var73 = (byte)(1769117228 ^ var99);
      Direction var80 = Direction.EAST;
      var19[var73] = var80;
      byte var74 = (byte)(1769117227 ^ var99);
      Direction var81 = Direction.DOWN;
      var19[var74] = var81;
      byte var75 = (byte)(1769117226 ^ var99);
      Direction var82 = Direction.UP;
      var19[var75] = var82;
      Direction[] var11 = var19;
      int var22 = var19.length;
      int var12 = var22;
      byte var23 = (byte)(1769117231 ^ var99);
      int var13 = var23;
      var99 = 910022218 ^ var99;

      BlockPos var29;
      Direction var40;
      while (true) {
         if (var13 >= var12) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                  case 145347468:
                     var99 ^= 356647027;
                     return (((byte)(1242382358 ^ var99)) != 0);
                  case 175207320:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1461950568:
                     break;
                  case 1933482942:
                     return (((byte)(1242382358 ^ var99)) != 0);
               }
            }
         }

         var99 = 956733944 ^ var99;
         Direction var27 = var11[var13];
         var29 = var2.relative(var27);
         ClientLevel var31 = var0.level;
         BlockState var32 = var31.getBlockState(var29);
         byte var34 = (byte)((var32.isAir()) ? 1 : 0);
         if (var34 == (1716115869 ^ var99)) {
            var99 = 1996676028 ^ var99;
            byte var36 = (byte)((isPassableFluid(var32)) ? 1 : 0);
            if (var36 == (290128417 ^ var99)) {
               var99 = 2129295106 ^ var99;
               byte var38 = (byte)((isWaterCell(var32)) ? 1 : 0);
               if (var38 != (1872852259 ^ var99)) {
                  var99 = 629341683 ^ var99;

                  label38:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                        case 262443824:
                           var99 ^= 601715435;
                           break label38;
                        case 928039700:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1858479055:
                           break;
                        case 2116367681:
                           break label38;
                     }
                  }
               } else {
                  var99 = 1024639323 ^ var99;
                  var40 = var27.getOpposite();
                  ClientLevel var62 = var0.level;
                  byte var42 = (byte)((var32.isFaceSturdy(var62, var29, var40)) ? 1 : 0);
                  if (var42 != (1387508856 ^ var99)) {
                     var99 = nwkaduznemenzhod(var99, 331417829);
                     break;
                  }

                  var99 = 178225780 ^ var99;
                  ClientLevel var64 = var0.level;
                  VoxelShape var44 = var32.getCollisionShape(var64, var29);
                  byte var45 = (byte)((var44.isEmpty()) ? 1 : 0);
                  if (var45 == (1479292428 ^ var99)) {
                     var99 = nwkaduznemenzhod(var99, 425626257);
                     break;
                  }

                  var99 = 26946670 ^ var99;
                  var99 = 810147929 ^ var99;
               }
            } else {
               var99 = nwkaduznemenzhod(var99, 2025191450);
            }
         } else {
            var99 = nwkaduznemenzhod(var99, 263660454);
         }

         var13 += 1778317882 ^ var99;
         var99 = nwkaduznemenzhod(var99, 917617246);
      }

      Vec3 var47 = Vec3.atCenterOf(var29);
      int var66 = var40.getStepX();
      double var67 = var66;
      double var84 = 0.5;
      double var69 = var67 * var84;
      int var87 = var40.getStepY();
      double var88 = var87;
      double var6 = 0.5;
      double var90 = var88 * var6;
      int var93 = var40.getStepZ();
      double var94 = var93;
      double var8 = 0.5;
      double var96 = var94 * var8;
      Vec3 var48 = var47.add(var69, var90, var96);
      BlockPos var50 = var2.immutable();
      placeSlot = var50;
      BlockPos var52 = var29.immutable();
      placeAgainst = var52;
      placeFace = var40;
      placeAimHit = var48;
      byte var55 = (byte)(1098038429 ^ var99);
      placeAimTicks = var55;
      return (((byte)(1098038428 ^ var99)) != 0);
   }

   private static boolean smoothAimToward(LocalPlayer var0, Vec3 var1) {
      int var127 = 1867904152 ^ 545921997 ^ 258429565;
      var127 = 835583234 ^ var127;
      float var3 = 1.0F;
      Vec3 var23 = var0.getEyePosition(var3);
      double var25 = var1.x;
      double var102 = var23.x;
      double var27 = var25 - var102;
      double var30 = var1.y;
      double var105 = var23.y;
      double var32 = var30 - var105;
      double var35 = var1.z;
      double var108 = var23.z;
      double var37 = var35 - var108;
      double var41 = var27 * var27;
      double var114 = var37 * var37;
      double var43 = var41 + var114;
      double var45 = Math.sqrt(var43);
      double var49 = -var27;
      double var51 = Math.atan2(var49, var37);
      double var53 = Math.toDegrees(var51);
      float var55 = (float)var53;
      double var58 = Math.atan2(var32, var45);
      double var60 = -var58;
      double var62 = Math.toDegrees(var60);
      float var64 = (float)var62;
      float var66 = var0.getYRot();
      float var120 = 0.16F;
      float var5 = 7.5F;
      float var67 = approachAngle(var66, var55, var120, var5);
      float var69 = var0.getXRot();
      float var121 = 0.16F;
      float var123 = 7.5F;
      float var70 = approachAngle(var69, var64, var121, var123);
      float var92 = -90.0F;
      float var122 = 90.0F;
      float var72 = Mth.clamp(var70, var92, var122);
      var0.setYRot(var67);
      var0.setXRot(var72);
      var0.yRotO = var67;
      var0.xRotO = var72;
      var0.setYHeadRot(var67);
      float var79 = var55 - var67;
      float var80 = Mth.wrapDegrees(var79);
      float var81 = Math.abs(var80);
      float var83 = var64 - var72;
      float var84 = Math.abs(var83);
      float var100 = 5.0F;
      float var134;
      int var86 = (var134 = var81 - var100) == 0.0F ? 0 : (var134 < 0.0F ? -1 : 1);
      if (var86 <= (1903509546 ^ var127)) {
         var127 = 1207703078 ^ var127;
         float var101 = 5.0F;
         float var135;
         int var88 = (var135 = var84 - var101) == 0.0F ? 0 : (var135 < 0.0F ? -1 : 1);
         if (var88 <= (914970124 ^ var127)) {
            var127 = 866468932 ^ var127;
            byte var89 = (byte)(86774345 ^ var127);
            var127 = 1384898351 ^ var127;
            return (var89 != 0);
         }

         var127 = 669923983 ^ var127;
      } else {
         var127 = 1611803817 ^ var127;
      }

      byte var136 = (byte)(291990659 ^ var127);
      var127 = 1187029476 ^ var127;
      return (var136 != 0);
   }

   private static float approachAngle(float var0, float var1, float var2, float var3) {
      int var33 = 1598176528 ^ 1256063977 ^ 258429565;
      var33 = 401171493 ^ var33;
      float var8 = var1 - var0;
      float var9 = Mth.wrapDegrees(var8);
      float var11 = Math.abs(var9);
      float var25 = 0.05F;
      float var43;
      int var12 = (var43 = var11 - var25) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
      if (var12 < (219285665 ^ var33)) {
         var33 = 1009057383 ^ var33;
         return var0 + var9;
      } else {
         var33 = 253608137 ^ var33;
         float var14 = var9 * var2;
         float var7 = var14;
         float var44;
         int var16 = (var44 = var14 - var3) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
         if (var16 > (34588776 ^ var33)) {
            var33 = 1298583324 ^ var33;
            var7 = var3;
            var33 = nwkaduznemenzhod(var33, 987100509);
         } else {
            var33 = nwkaduznemenzhod(var33, 403272423);
            float var45;
            int var21 = (var45 = var14 - var3) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
            if (var21 < (436648591 ^ var33)) {
               var33 = 1572682444 ^ var33;
               var7 = var3;
               var33 = 839348842 ^ var33;
            } else {
               var33 = 1874479270 ^ var33;
            }
         }

         return var0 + var7;
      }
   }

   private static boolean selectThrowawayBlock(Minecraft var0, LocalPlayer var1) {
      int var80 = 154282877 ^ 171262974 ^ 258429565;
      var80 = 866406388 ^ var80;
      Inventory var13 = var1.getInventory();
      Inventory var5 = var13;
      ItemStack var15 = var13.getSelectedItem();
      byte var17 = (byte)((isThrowaway(var15)) ? 1 : 0);
      if (var17 != (1069839626 ^ var80)) {
         var80 = 751748510 ^ var80;
         MultiPlayerGameMode var19 = var0.gameMode;
         byte var21 = (byte)((var19 instanceof aj) ? 1 : 0);
         if (var21 != (319467668 ^ var80)) {
            var80 = 1845856269 ^ var80;
            aj var23 = (aj)var19;
            var23.wimpyclient$syncCarriedItem();
            var80 = 1730917346 ^ var80;
            return (((byte)(438602618 ^ var80)) != 0);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                  case 82093332:
                     var80 ^= 154024943;
                     return (((byte)(438602618 ^ var80)) != 0);
                  case 381170999:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1044266646:
                     break;
                  case 1183991241:
                     return (((byte)(438602618 ^ var80)) != 0);
               }
            }
         }
      } else {
         var80 = 1688530042 ^ var80;
         byte var26 = (byte)(1533057392 ^ var80);
         int var73 = var26;
         var80 = 1314463717 ^ var80;

         label103:
         while (true) {
            int var3 = Inventory.getSelectionSize();
            if (var73 >= var3) {
               var80 = nwkaduznemenzhod(var80, 893333258);
               int var29 = var5.getSelectedSlot();
               int var30 = Inventory.getSelectionSize();
               int var75 = var30;
               var80 = 2002044939 ^ var80;

               label53:
               while (true) {
                  int var62 = var5.getContainerSize();
                  byte var4 = (byte)(1465016752 ^ var80);
                  int var63 = Math.min(var62, var4);
                  if (var75 >= var63) {
                     var80 = 2070788625 ^ var80;
                     return (((byte)(742382469 ^ var80)) != 0);
                  }

                  var80 = 704890325 ^ var80;
                  ItemStack var33 = var5.getItem(var75);
                  byte var35 = (byte)((isThrowaway(var33)) ? 1 : 0);
                  if (var35 != (2102502465 ^ var80)) {
                     var80 = 1348227506 ^ var80;
                     ItemStack var37 = var5.getItem(var29);
                     ItemStack var71 = var33.copy();
                     var5.setItem(var29, var71);
                     var5.setItem(var75, var37);
                     MultiPlayerGameMode var41 = var0.gameMode;
                     byte var43 = (byte)((var41 instanceof aj) ? 1 : 0);
                     if (var43 != (755889651 ^ var80)) {
                        var80 = 999619234 ^ var80;
                        aj var45 = (aj)var41;
                        var45.wimpyclient$syncCarriedItem();
                        var80 = 1218802878 ^ var80;
                     } else {
                        var80 = nwkaduznemenzhod(var80, 1932627484);
                     }

                     return (((byte)(1581022190 ^ var80)) != 0);
                  }

                  int var89 = 221751166 ^ var80;
                  var80 = 1670653878 ^ var89;
                  var75 += 334636168 ^ var80;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                        case 111490363:
                           var80 ^= 1151354141;
                        case 1188293507:
                           continue label53;
                        case 1751957891:
                           break;
                        case 2052319539:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               }
            }

            var80 ^= 290807578;
            ItemStack var50 = var5.getItem(var73);
            byte var51 = (byte)((isThrowaway(var50)) ? 1 : 0);
            if (var51 != (74242447 ^ var80)) {
               var80 = 1589443601 ^ var80;
               var5.setSelectedSlot(var73);
               MultiPlayerGameMode var54 = var0.gameMode;
               byte var56 = (byte)((var54 instanceof aj) ? 1 : 0);
               if (var56 != (1523590558 ^ var80)) {
                  var80 = 713339950 ^ var80;
                  aj var58 = (aj)var54;
                  var58.wimpyclient$syncCarriedItem();
                  var80 = 419989634 ^ var80;
                  return (((byte)(1767643443 ^ var80)) != 0);
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                     case 267588146:
                        var80 ^= 864828588;
                        return (((byte)(1767643443 ^ var80)) != 0);
                     case 502496898:
                        break;
                     case 1631103648:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1945397501:
                        return (((byte)(1767643443 ^ var80)) != 0);
                  }
               }
            }

            label88:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                  case 69603226:
                     var80 ^= 516492583;
                     break label88;
                  case 525019908:
                     break;
                  case 897479472:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1152998406:
                     break label88;
               }
            }

            var73 += 447075497 ^ var80;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var80)) {
                  case 60905120:
                     var80 ^= 261902909;
                     continue label103;
                  case 164939355:
                     break;
                  case 959973209:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1145216929:
                     continue label103;
               }
            }
         }
      }
   }

   private static boolean isThrowaway(ItemStack var0) {
      int var33 = 1109889373 ^ 1665580347 ^ 258429565;
      var33 = 1896238760 ^ var33;
      byte var7 = (byte)((var0.isEmpty()) ? 1 : 0);
      if (var7 != (1593847987 ^ var33)) {
         var33 = 267937380 ^ var33;
         return (((byte)(1358452439 ^ var33)) != 0);
      } else {
         var33 = 2078428395 ^ var33;
         Item var9 = var0.getItem();
         byte var11 = (byte)((var9 instanceof BlockItem) ? 1 : 0);
         if (var11 != (618822744 ^ var33)) {
            var33 = 856379520 ^ var33;
            BlockItem var13 = (BlockItem)var9;
            var33 = nwkaduznemenzhod(var33, 1404748727);
            Block var15 = var13.getBlock();
            Block var2 = Blocks.AIR;
            if (var15 != var2) {
               var33 = 1410233910 ^ var33;
               Block var26 = Blocks.WATER;
               if (var15 != var26) {
                  var33 = 37010440 ^ var33;
                  Block var27 = Blocks.LAVA;
                  if (var15 != var27) {
                     var33 = 1367995615 ^ var33;
                     Block var28 = Blocks.FIRE;
                     if (var15 != var28) {
                        var33 = nwkaduznemenzhod(var33, 1937989735);
                        BlockState var21 = var15.defaultBlockState();
                        EmptyBlockGetter var29 = EmptyBlockGetter.INSTANCE;
                        BlockPos var3 = BlockPos.ZERO;
                        return var21.isCollisionShapeFullBlock(var29, var3);
                     }

                     var33 = 1394571157 ^ var33;
                  } else {
                     var33 = 43418442 ^ var33;
                  }
               } else {
                  var33 = nwkaduznemenzhod(var33, 10633026);
                  return (((byte)(285189659 ^ var33)) != 0);
               }
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                     case 73587636:
                        var33 ^= 1420577140;
                        return (((byte)(285189659 ^ var33)) != 0);
                     case 1237673442:
                        return (((byte)(285189659 ^ var33)) != 0);
                     case 1268809025:
                     default:
                        throw new IllegalStateException();
                     case 1457283363:
                  }
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                  case 125236232:
                     var33 ^= 1947871887;
                     return (((byte)(1358452439 ^ var33)) != 0);
                  case 718923573:
                     return (((byte)(1358452439 ^ var33)) != 0);
                  case 1567700139:
                  default:
                     throw new IllegalStateException();
                  case 1650600581:
               }
            }
         }

         return (((byte)(285189659 ^ var33)) != 0);
      }
   }

   private static BlockHitResult hitFor(LocalPlayer var0, BlockPos var1) {
      int var76 = 926867833 ^ 35798961 ^ 258429565;
      var76 = 1365718577 ^ var76;
      byte var20 = (byte)((var0.isCreative()) ? 1 : 0);
      double var21;
      if (var20 != (1797044868 ^ var76)) {
         var76 = 591177399 ^ var76;
         var21 = 5.0;

         label41:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var76)) {
               case 197033602:
                  var76 ^= 75836336;
                  break label41;
               case 649417313:
                  break;
               case 895381677:
                  break label41;
               case 1924263227:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      } else {
         var76 = nwkaduznemenzhod(var76, 1438686756);
         var21 = 4.5;
         var76 = 1920537379 ^ var76;
      }

      float var7 = 1.0F;
      byte var8 = (byte)(1285896067 ^ var76);
      HitResult var24 = var0.pick(var21, var7, (var8 != 0));
      Type var26 = var24.getType();
      Type var48 = Type.BLOCK;
      if (var26 == var48) {
         var76 = 546836209 ^ var76;
         BlockHitResult var28 = (BlockHitResult)var24;
         BlockPos var30 = var28.getBlockPos();
         byte var31 = (byte)((var30.equals(var1)) ? 1 : 0);
         if (var31 != (1815951730 ^ var76)) {
            var76 = 1053022991 ^ var76;
            return var28;
         }

         var76 = 1875335413 ^ var76;
      } else {
         var76 = nwkaduznemenzhod(var76, 1331648004);
      }

      Direction var32 = Direction.UP;
      int var34 = var1.getY();
      BlockPos var51 = var0.blockPosition();
      int var52 = var51.getY();
      double var46;
      if (var34 >= var52) {
         var76 = 778900797 ^ var76;
         int var42 = var1.getY();
         double var43 = var42;
         double var60 = 0.05;
         var46 = var43 + var60;
         var76 = nwkaduznemenzhod(var76, 1511899550);
      } else {
         label31:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var76)) {
               case 62568596:
                  var76 ^= 768751898;
                  break label31;
               case 980291110:
                  break;
               case 1729384861:
                  break label31;
               case 1818356923:
               default:
                  throw new RuntimeException(new IOException());
            }
         }

         int var36 = var1.getY();
         double var37 = var36;
         double var5 = 1.0;
         var46 = var37 + var5;
         var76 = 1503849913 ^ var76;
      }

      int var54 = var1.getX();
      double var55 = var54;
      double var63 = 0.5;
      double var57 = var55 + var63;
      int var68 = var1.getZ();
      double var69 = var68;
      double var11 = 0.5;
      double var71 = var69 + var11;
      Vec3 var39 = new Vec3(var57, var46, var71);
      byte var9 = (byte)(2005579044 ^ var76);
      return new BlockHitResult(var39, var32, var1, (var9 != 0));
   }

   static {
      int var6 = 1052275601 ^ 580352360 ^ Integer.parseInt("214303207");
      int var3 = new Random(4691806727122969267L).nextInt();
      Ed5RSLmUce = 1721607233 ^ var3;
      var6 = 543063828 ^ var6;
      byte var0 = (byte)(-817329161 ^ var6);
      targetY = var0;
   }

   public static String rydofeadfl(byte[] var0, int var1) {
      String var13 = Integer.toString(var1);
      byte[] var14 = var13.getBytes();
      byte[] var8 = var14;
      byte var3 = 0;
      byte var16 = var0[var3];
      short var36 = 255;
      int var17 = var16 & var36;
      byte var37 = 24;
      int var18 = var17 << var37;
      byte var4 = 1;
      byte var39 = var0[var4];
      short var68 = 255;
      int var40 = var39 & var68;
      byte var69 = 16;
      int var41 = var40 << var69;
      int var19 = var18 | var41;
      byte var70 = 2;
      byte var43 = var0[var70];
      short var71 = 255;
      int var44 = var43 & var71;
      byte var72 = 8;
      int var45 = var44 << var72;
      int var20 = var19 | var45;
      byte var73 = 3;
      byte var47 = var0[var73];
      short var74 = 255;
      int var48 = var47 & var74;
      int var21 = var20 | var48;
      byte var49 = 4;
      byte var23 = var0[var49];
      short var50 = 255;
      int var24 = var23 & var50;
      byte var51 = 24;
      int var25 = var24 << var51;
      byte var75 = 5;
      byte var53 = var0[var75];
      short var76 = 255;
      int var54 = var53 & var76;
      byte var77 = 16;
      int var55 = var54 << var77;
      int var26 = var25 | var55;
      byte var78 = 6;
      byte var57 = var0[var78];
      short var79 = 255;
      int var58 = var57 & var79;
      byte var80 = 8;
      int var59 = var58 << var80;
      int var27 = var26 | var59;
      byte var81 = 7;
      byte var61 = var0[var81];
      short var82 = 255;
      int var62 = var61 & var82;
      int var28 = var27 | var62;
      String var29 = ppdgkutswo;
      int var84 = var28 + var21;
      String var30 = var29.substring(var28, var84);
      Charset var64 = StandardCharsets.UTF_16BE;
      byte[] var31 = var30.getBytes(var64);
      byte[] var11 = var31;
      byte var32 = 0;
      int var12 = var32;

      while (true) {
         int var66 = var11.length;
         if (var12 >= var66) {
            Charset var89 = StandardCharsets.UTF_16BE;
            return new String(var11, var89);
         }

         byte var86 = var11[var12];
         int var93 = var8.length;
         int var92 = var12 % var93;
         byte var91 = var8[var92];
         int var87 = var86 ^ var91;
         byte var88 = (byte)var87;
         var11[var12] = var88;
         var12++;
      }
   }

   private static byte[] qsqqhlckcjghyah() {
      return new byte[]{0, 0, 0, 43, 0, 0, 0, 0};
   }

   private static byte[] fwvxgrkzxcymtrq() {
      return new byte[]{0, 0, 0, 42, 0, 0, 0, 43};
   }

   private static byte[] fnmzginxyzdwrcr() {
      return new byte[]{0, 0, 0, 35, 0, 0, 0, 85};
   }

   private static byte[] pwrlfvdehzcczyl() {
      return new byte[]{
         49,
         108,
         55,
         121,
         53,
         71,
         54,
         69,
         54,
         89,
         49,
         26,
         55,
         106,
         53,
         102,
         54,
         97,
         54,
         107,
         49,
         23,
         55,
         107,
         53,
         70,
         54,
         94,
         54,
         70,
         49,
         71,
         55,
         93,
         53,
         86,
         54,
         17,
         54,
         82,
         49,
         94,
         55,
         95,
         53,
         18,
         22,
         37,
         54,
         22,
         49,
         68,
         55,
         76,
         53,
         71,
         54,
         82,
         54,
         93,
         49,
         23,
         55,
         94,
         53,
         93,
         54,
         67,
         54,
         22,
         49,
         67,
         55,
         87,
         53,
         93,
         54,
         17,
         54,
         90,
         49,
         88,
         55,
         86,
         53,
         85,
         51,
         111,
         52,
         120,
         54,
         70,
         51,
         68,
         53,
         92,
         52,
         25,
         57,
         100,
         51,
         103,
         48,
         101,
         51,
         105,
         52,
         25,
         54,
         96,
         51,
         68,
         53,
         92,
         52,
         68,
         57,
         70,
         51,
         86,
         48,
         81,
         51,
         20,
         52,
         93,
         54,
         90,
         51,
         87,
         53,
         19,
         20,
         32,
         57,
         22,
         51,
         70,
         48,
         91,
         51,
         86,
         52,
         75,
         54,
         86,
         51,
         81,
         53,
         88,
         52,
         85,
         57,
         84,
         51,
         95,
         48,
         80,
         51,
         20,
         52,
         91,
         54,
         95,
         51,
         95,
         53,
         80,
         52,
         95,
         54,
         106,
         56,
         119,
         56,
         64,
         57,
         68,
         55,
         89,
         49,
         21,
         54,
         106,
         53,
         109,
         48,
         103,
         54,
         108,
         56,
         22,
         56,
         102,
         57,
         68,
         55,
         89,
         49,
         72,
         54,
         72,
         53,
         92,
         48,
         83,
         54,
         17,
         56,
         82,
         56,
         92,
         57,
         87,
         55,
         22,
         17,
         44,
         54,
         24,
         53,
         85,
         48,
         86,
         54,
         71,
         56,
         87,
         56,
         21,
         57,
         82,
         55,
         83,
         49,
         84,
         54,
         87,
         53,
         78
      };
   }

   private static int nwkaduznemenzhod(int var0, int var1) {
      return var0 ^ var1;
   }
}
