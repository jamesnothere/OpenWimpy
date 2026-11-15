package com.wimpyclient.f;

import com.wimpyclient.i.v;
import com.wimpyclient.i.x;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.FastEntrySet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder.Reference;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.ChunkPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class c {
   public static final c INSTANCE;
   private static final int ALERT_MIN_Y = -64;
   private static final int ALERT_MAX_Y = 184;
   private static final int BASE_DETECT_CEILING_Y = 62;
   private static final int MAX_DRAIN_PER_TICK = 4096;
   private static final int NIBBLES_PER_SECTION = 2048;
   private static final int RENDER_DISTANCE_CHUNKS = 16;
   private static final int CHUNK_PACKET_NEAR_Y = 48;
   private static final int PILLAR_BOTTOM_Y = -60;
   private static final int PILLAR_TOP_Y = 164;
   private static final ConcurrentLinkedQueue<c$c> QUEUE;
   private final Long2ObjectOpenHashMap<c$a> snapshots;
   private final LongOpenHashSet alerted;
   private final LongOpenHashSet visible;
   private ClientLevel lastLevel;
   private double lastPlayerY;
   private static int odAJh3wtke;
   private transient int rYQEMNrQ4F;

   private c() {
super();
      int var12 = 2040436101 ^ 806364510;
      
      var12 = 896632428 ^ var12;
      var12 = 1787146066 ^ 883976488 ^ Integer.parseInt("583725261");
      this.rYQEMNrQ4F = 91240526 ^ odAJh3wtke;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var12)) {
            case 36570877:
               var12 = 1894094477 ^ var12;
            case 1544377443:
               Long2ObjectOpenHashMap var2 = new Long2ObjectOpenHashMap();
               this.snapshots = var2;
               LongOpenHashSet var7 = new LongOpenHashSet();
               this.alerted = var7;
               LongOpenHashSet var8 = new LongOpenHashSet();
               this.visible = var8;
               double var9 = Double.NaN;
               this.lastPlayerY = var9;
               return;
            case 208877863:
            default:
               throw new IllegalStateException();
            case 1398672738:
         }
      }
   }

   public boolean isEnabled() {
      int var6 = 730345331 ^ 403118107 ^ 1224323061;
      var6 = 1439394584 ^ var6;
      x var1 = x.INSTANCE;
      v var2 = var1.baseDebug;
      return var2.qo();
   }

   public static void offer(int var0, int var1, ClientboundLightUpdatePacketData var2, boolean var3) {
      int var6 = 1189935856 ^ 1694031408 ^ 1300862907;
      var6 = 301271067 ^ var6;
   }

   public void clear() {
      int var15 = 594680113 ^ 1437716955 ^ 1224323061;
      var15 = 1026540218 ^ var15;
      Long2ObjectOpenHashMap var3 = this.snapshots;
      var3.clear();
      LongOpenHashSet var5 = this.alerted;
      var5.clear();
      LongOpenHashSet var7 = this.visible;
      var7.clear();
      ConcurrentLinkedQueue var8 = QUEUE;
      var8.clear();
      Object var2 = null;
      this.lastLevel = (ClientLevel)var2;
      double var12 = Double.NaN;
      this.lastPlayerY = var12;
      com.wimpyclient.e.a var11 = com.wimpyclient.e.a.INSTANCE;
      var11.clearBaseDebugChunks();
   }

   public void tick(Minecraft var1) {
      int var32 = 1012018966 ^ 1437833212 ^ 1224323061;
      var32 = 434475481 ^ var32;
      ClientLevel var5 = var1.level;
      ClientLevel var28 = this.lastLevel;
      if (var5 == var28) {
         var32 = 1369323206 ^ var32;
         Long2ObjectOpenHashMap var10 = this.snapshots;
         byte var11 = (byte)((var10.isEmpty()) ? 1 : 0);
         if (var11 != (1768140800 ^ var32)) {
            var32 = 121530355 ^ var32;
            LongOpenHashSet var13 = this.alerted;
            byte var14 = (byte)((var13.isEmpty()) ? 1 : 0);
            if (var14 != (1851643891 ^ var32)) {
               var32 = 1860835614 ^ var32;
               LongOpenHashSet var16 = this.visible;
               byte var17 = (byte)((var16.isEmpty()) ? 1 : 0);
               if (var17 != (12046061 ^ var32)) {
                  var32 = 1040165899 ^ var32;
                  ConcurrentLinkedQueue var18 = QUEUE;
                  byte var19 = (byte)((var18.isEmpty()) ? 1 : 0);
                  if (var19 != (1028154086 ^ var32)) {
                     var32 = 2026257126 ^ var32;
                     return;
                  }

                  var32 = 2126490539 ^ var32;
               } else {
                  label31:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
                        case 11293001:
                           var32 ^= 1128269728;
                        case 1159880484:
                           break label31;
                        case 1279505451:
                        default:
                           throw new IllegalStateException();
                        case 1327037149:
                     }
                  }
               }
            } else {
               var32 = 766123710 ^ var32;
            }
         } else {
            var32 = 714373453 ^ var32;
         }

         Long2ObjectOpenHashMap var21 = this.snapshots;
         var21.clear();
         LongOpenHashSet var23 = this.alerted;
         var23.clear();
         LongOpenHashSet var25 = this.visible;
         var25.clear();
         ConcurrentLinkedQueue var26 = QUEUE;
         var26.clear();
         com.wimpyclient.e.a var27 = com.wimpyclient.e.a.INSTANCE;
         var27.clearBaseDebugChunks();
         var32 = 108630349 ^ var32;
      } else {
         var32 = 1611094110 ^ var32;
         this.clear();
         this.lastLevel = var5;

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
               case 208033724:
                  var32 = 494175896 ^ var32;
                  return;
               case 600879307:
                  break;
               case 1560653466:
                  return;
               case 1770571009:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   private void ingest(Minecraft var1, c$c var2, int var3, int var4) {
      c$a var12;
      long var15;
      int var53;
      label47: {
         var53 = 1157880364 ^ 256592769 ^ 1224323061;
         var53 = 795548385 ^ var53;
         int var14 = var2.chunkX;
         int var34 = var2.chunkZ;
         var15 = ChunkPos.asLong(var14, var34);
         Long2ObjectOpenHashMap var18 = this.snapshots;
         Object var19 = var18.get(var15);
         c$a var20 = (c$a)var19;
         var12 = var20;
         if (var20 != null) {
            var53 = 1424008033 ^ var53;
            int var23 = var20.sectionCount;
            if (var23 == var3) {
               var53 = 1237580587 ^ var53;
               int var25 = var20.bottomSectionY;
               if (var25 == var4) {
                  var53 = 1515053964 ^ var53;
                  break label47;
               }

               var53 = 1305348593 ^ var53;
            } else {
               label44:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
                     case 182525448:
                        var53 ^= 68023002;
                        break label44;
                     case 720743284:
                        break;
                     case 944461336:
                     default:
                        throw new RuntimeException();
                     case 1476819558:
                        break label44;
                  }
               }
            }
         } else {
            var53 = eenbmkejxgnkpnng(var53, 1357730235);
         }

         c$a var26 = new c$a(var3, var4);
         var12 = var26;
         Long2ObjectOpenHashMap var28 = this.snapshots;
         Object var29 = var28.put(var15, var26);
         var53 = 394521213 ^ var53;
      }

      try {
         ClientboundLightUpdatePacketData var31 = var2.data;
         c$b.apply(var31, var12);
         var53 ^= 1232576367;
      } catch (Throwable var49) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var53)) {
            case 1436875771:
               var53 = 1941805643 ^ var53;
               return;
            default:
               throw new RuntimeException("Error in hash");
         }
      }

      label34:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
            case 88732636:
               var53 = 1706709578 ^ var53;
               break label34;
            case 222326313:
            default:
               throw new RuntimeException();
            case 320548145:
               break label34;
            case 1903520207:
         }
      }

      this.maybeAlert(var1, var2, var15, var12);
   }

   private void maybeAlert(Minecraft var1, c$c var2, long var3, c$a var5) {
      int var78 = 1996427859 ^ 1674028203 ^ 1224323061;
      var78 = 1224298105 ^ var78;
      LongOpenHashSet var16 = this.alerted;
      byte var17 = (byte)((var16.contains(var3)) ? 1 : 0);
      if (var17 == (356013940 ^ var78)) {
         var78 = 1677782120 ^ var78;
         byte var19 = (byte)((this.isEnabled()) ? 1 : 0);
         if (var19 == (1899543324 ^ var78)) {
            var78 = 937838622 ^ var78;
         } else {
            var78 = 1284557156 ^ var78;
            LocalPlayer var21 = var1.player;
            double var50;
            if (var21 != null) {
               var78 = 599279430 ^ var78;
               LocalPlayer var23 = var1.player;
               var50 = var23.getY();

               label90:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var78)) {
                     case 74614738:
                        break;
                     case 171931960:
                        var78 ^= 1492216181;
                        break label90;
                     case 528970141:
                     default:
                        throw new RuntimeException();
                     case 1570359038:
                        break label90;
                  }
               }
            } else {
               label83:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var78)) {
                     case 125198432:
                        var78 ^= 181558594;
                     case 612090143:
                        break label83;
                     case 712671725:
                        break;
                     case 926968663:
                     default:
                        throw new RuntimeException();
                  }
               }

               var50 = 62.0;
               var78 = 1906013041 ^ var78;
            }

            double var11 = var50;
            byte var24 = (byte)(1189174346 ^ var78);
            int var13 = var24;
            var78 = 747581838 ^ var78;

            while (true) {
               int var53 = var5.sectionCount;
               byte var9 = (byte)(1785621956 ^ var78);
               int var54 = var53 + var9;
               if (var13 >= var54) {
                  var78 = eenbmkejxgnkpnng(var78, 1563319668);
                  return;
               }

               var78 = 1893201044 ^ var78;
               int var27 = var5.bottomSectionY;
               int var28 = var27 + var13;
               byte var56 = (byte)(448371024 ^ var78);
               int var29 = var28 - var56;
               byte var57 = (byte)(448371009 ^ var78);
               int var30 = var29 * var57;
               byte var58 = (byte)(448371038 ^ var78);
               int var31 = var30 + var58;
               int var33 = var5.bottomSectionY;
               int var34 = var33 + var13;
               byte var60 = (byte)(448371024 ^ var78);
               int var35 = var34 - var60;
               byte var61 = (byte)(448371009 ^ var78);
               int var36 = var35 * var61;
               byte var62 = (byte)(-448371055 ^ var78);
               if (var31 < var62) {
                  var78 = 2125909427 ^ var78;
               } else {
                  var78 = 134042241 ^ var78;
                  short var63 = (short)(491047784 ^ var78);
                  if (var36 > var63) {
                     var78 = eenbmkejxgnkpnng(var78, 2034999090);
                  } else {
                     var78 = 877514563 ^ var78;
                     byte var64 = (byte)(688456877 ^ var78);
                     if (var31 < var64) {
                        var78 ^= 925875366;
                        c$d[] var41 = var5.sky;
                        c$d var42 = var41[var13];
                        c$d var66 = c$d.ZEROED_PRESENT;
                        if (var42 == var66) {
                           var78 ^= 997454148;
                           boolean var44 = var2.chunkPacket;
                           byte var45 = (byte)((isTrustedZero(var44, var31, var11)) ? 1 : 0);
                           if (var45 != (626346353 ^ var78)) {
                              var78 = 2012608270 ^ var78;
                              LongOpenHashSet var47 = this.alerted;
                              boolean var48 = var47.add(var3);
                              int var74 = var2.chunkX;
                              int var75 = var2.chunkZ;
                              this.onChunkSpotted(var1, var74, var75);
                              return;
                           }

                           label47:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var78)) {
                                 case 61756650:
                                    break label47;
                                 case 139795231:
                                    var78 ^= 1096424851;
                                    break label47;
                                 case 642251881:
                                    break;
                                 case 1869046646:
                                 default:
                                    throw new RuntimeException();
                              }
                           }
                        } else {
                           label57:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var78)) {
                                 case 174791360:
                                    var78 ^= 2049567959;
                                 case 544908105:
                                    break label57;
                                 case 595577047:
                                 default:
                                    throw new RuntimeException();
                                 case 1083735115:
                              }
                           }
                        }
                     } else {
                        label71:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var78)) {
                              case 260133333:
                                 var78 ^= 1292259441;
                                 break label71;
                              case 305739920:
                              default:
                                 throw new RuntimeException();
                              case 1650391376:
                                 break label71;
                              case 2056229159:
                           }
                        }
                     }
                  }
               }

               var13 += 1678726371 ^ var78;
               var78 = eenbmkejxgnkpnng(var78, 241252647);
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var78)) {
               case 152910920:
                  var78 = 1407624310 ^ var78;
                  return;
               case 328800932:
               default:
                  throw new RuntimeException();
               case 382251218:
                  return;
               case 1864266232:
            }
         }
      }
   }

   private static boolean isTrustedZero(boolean var0, int var1, double var2) {
      int var24 = 1802711720 ^ 146643437 ^ 1300862907;
      var24 = 795826528 ^ var24;
      if (var0 == ((19424670 ^ var24) != 0)) {
         var24 = 1737110715 ^ var24;
         return (((byte)(1721913636 ^ var24)) != 0);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var24)) {
               case 18210412:
                  var24 ^= 955373269;
               case 112101286:
                  double var5 = 62.0;
                  double var33;
                  int var11 = (var33 = var2 - var5) == 0.0 ? 0 : (var33 < 0.0 ? -1 : 1);
                  if (var11 < (970568523 ^ var24)) {
                     var24 = 1427932311 ^ var24;
                     return (((byte)(1824864221 ^ var24)) != 0);
                  }

                  var24 = 923057840 ^ var24;
                  double var13 = var1;
                  double var7 = 48.0;
                  double var21 = var2 - var7;
                  double var34;
                  int var15 = (var34 = var13 - var21) == 0.0 ? 0 : (var34 < 0.0 ? -1 : 1);
                  byte var16;
                  if (var15 >= (249368059 ^ var24)) {
                     var24 = 1025737944 ^ var24;
                     var16 = (byte)(872319266 ^ var24);
                     var24 = eenbmkejxgnkpnng(var24, 165227061);
                  } else {
                     var24 = eenbmkejxgnkpnng(var24, 506465170);
                     var16 = (byte)(283969129 ^ var24);
                     var24 = 717923711 ^ var24;
                  }

                  return (var16 != 0);
               case 1374307106:
                  break;
               case 2028577122:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }
   }

   private void rescanDeferred(Minecraft var1) {
      int var43 = 666633911 ^ 1814389885 ^ 1224323061;
      var43 = 594513000 ^ var43;
      Long2ObjectOpenHashMap var17 = this.snapshots;
      FastEntrySet var18 = var17.long2ObjectEntrySet();
      ObjectIterator var19 = var18.iterator();
      ObjectIterator var12 = var19;
      var43 = 150575584 ^ var43;

      while (true) {
         byte var21 = (byte)((var12.hasNext()) ? 1 : 0);
         if (var21 == (687265975 ^ var43)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var43)) {
                  case 257846036:
                     var43 = 592784255 ^ var43;
                  case 1933948653:
                     return;
                  case 509541331:
                  default:
                     throw new IllegalStateException();
                  case 1722855326:
               }
            }
         }

         var43 = 1763624057 ^ var43;
         Object var23 = var12.next();
         Entry var24 = (Entry)var23;
         long var26 = var24.getLongKey();
         LongOpenHashSet var29 = this.alerted;
         byte var30 = (byte)((var29.contains(var26)) ? 1 : 0);
         if (var30 != (1105730766 ^ var43)) {
            var43 = 1942360471 ^ var43;
            var43 = eenbmkejxgnkpnng(var43, 450418158);
         } else {
            var43 = eenbmkejxgnkpnng(var43, 1081095288);
            Object var32 = var24.getValue();
            c$a var33 = (c$a)var32;
            int var38 = ChunkPos.getX(var26);
            int var39 = ChunkPos.getZ(var26);
            Object var10 = null;
            byte var11 = (byte)(26749111 ^ var43);
            c$c var5 = new c$c(var38, var39, (ClientboundLightUpdatePacketData)var10, (var11 != 0));
            this.maybeAlert(var1, var5, var26, var33);
            var43 = eenbmkejxgnkpnng(var43, 695136257);
         }
      }
   }

   private static boolean hasBaseSignal(c$a var0, double var1) {
      int var36 = 867360970 ^ 1814858229 ^ 1300862907;
      var36 = 713301595 ^ var36;
      byte var3 = (byte)(949215454 ^ var36);
      int var6 = var3;
      var36 = 1482432574 ^ var36;

      while (true) {
         int var23 = var0.sectionCount;
         byte var5 = (byte)(1624228064 ^ var36);
         int var24 = var23 + var5;
         if (var6 >= var24) {
            var36 = 1636624760 ^ var36;
            return (((byte)(21178777 ^ var36)) != 0);
         }

         var36 = 1165432139 ^ var36;
         int var10 = var0.bottomSectionY;
         int var11 = var10 + var6;
         byte var26 = (byte)(632870315 ^ var36);
         int var12 = var11 - var26;
         byte var27 = (byte)(632870330 ^ var36);
         int var13 = var12 * var27;
         byte var28 = (byte)(632870309 ^ var36);
         int var14 = var13 + var28;
         byte var29 = (byte)(632870292 ^ var36);
         if (var14 < var29) {
            var36 = 1317709231 ^ var36;
            c$d[] var17 = var0.sky;
            c$d var18 = var17[var6];
            c$d var31 = c$d.ZEROED_PRESENT;
            if (var18 == var31) {
               var36 = 1040652731 ^ var36;
               byte var19 = (byte)(1429563839 ^ var36);
               byte var20 = (byte)((isTrustedZero((var19 != 0), var14, var1)) ? 1 : 0);
               if (var20 != (1429563838 ^ var36)) {
                  var36 = 126160 ^ var36;
                  return (((byte)(1429505391 ^ var36)) != 0);
               }

               label25:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var36)) {
                     case 85404117:
                        var36 ^= 453246550;
                        break label25;
                     case 276481161:
                     default:
                        throw new RuntimeException();
                     case 1804348358:
                        break label25;
                     case 1929851431:
                  }
               }
            } else {
               var36 = eenbmkejxgnkpnng(var36, 621078509);
            }
         } else {
            var36 = 1804485186 ^ var36;
         }

         var6 += 1312200681 ^ var36;
         var36 = eenbmkejxgnkpnng(var36, 788092681);
      }
   }

   private void publishVisible(Minecraft var1) {
      int var95 = 749845391 ^ 641318025 ^ 1224323061;
      var95 = 798185667 ^ var95;
      LongOpenHashSet var2 = new LongOpenHashSet();
      LongOpenHashSet var4 = var2;
      LocalPlayer var17 = var1.player;
      byte var19 = (byte)((this.isEnabled()) ? 1 : 0);
      if (var19 != (1843589168 ^ var95)) {
         var95 ^= 1737966450;
         ClientLevel var21 = var1.level;
         if (var21 != null) {
            var95 = 1870106522 ^ var95;
            if (var17 != null) {
               var95 = 666352577 ^ var95;
               Long2ObjectOpenHashMap var24 = this.snapshots;
               byte var25 = (byte)((var24.isEmpty()) ? 1 : 0);
               if (var25 == (1119192857 ^ var95)) {
                  var95 = 792762287 ^ var95;
                  BlockPos var27 = var17.blockPosition();
                  int var29 = var27.getX();
                  byte var69 = (byte)(1844777138 ^ var95);
                  int var30 = var29 >> var69;
                  int var7 = var30;
                  int var32 = var27.getZ();
                  byte var70 = (byte)(1844777138 ^ var95);
                  int var33 = var32 >> var70;
                  int var8 = var33;
                  double var35 = var17.getY();
                  double var9 = var35;
                  byte var71 = (byte)(1844777126 ^ var95);
                  int var38 = var30 - var71;
                  int var11 = var38;
                  var95 = 761018787 ^ var95;

                  while (true) {
                     byte var3 = (byte)(1084827909 ^ var95);
                     int var73 = var7 + var3;
                     if (var11 > var73) {
                        var95 = eenbmkejxgnkpnng(var95, 631090877);
                        break;
                     }

                     var95 = 1357574115 ^ var95;
                     byte var74 = (byte)(272877286 ^ var95);
                     int var41 = var8 - var74;
                     int var12 = var41;
                     var95 = 1103103165 ^ var95;

                     label97:
                     while (true) {
                        byte var92 = (byte)(1367589467 ^ var95);
                        int var76 = var8 + var92;
                        if (var12 > var76) {
                           var95 = eenbmkejxgnkpnng(var95, 1422927701);
                           var11 += 89384223 ^ var95;
                           var95 = eenbmkejxgnkpnng(var95, 1174064139);
                           break;
                        }

                        var95 = 1994782896 ^ var95;
                        long var44 = ChunkPos.asLong(var11, var12);
                        Long2ObjectOpenHashMap var47 = this.snapshots;
                        Object var48 = var47.get(var44);
                        c$a var49 = (c$a)var48;
                        label82:
                        if (var49 != null) {
                           var95 = 936976078 ^ var95;
                           LongOpenHashSet var52 = this.alerted;
                           byte var53 = (byte)((var52.contains(var44)) ? 1 : 0);
                           if (var53 == (280962101 ^ var95)) {
                              var95 = 1466416478 ^ var95;
                              byte var55 = (byte)((hasBaseSignal(var49, var9)) ? 1 : 0);
                              if (var55 == (1205377387 ^ var95)) {
                                 var95 = eenbmkejxgnkpnng(var95, 1483060070);
                                 break label82;
                              }

                              var95 = 1523861684 ^ var95;
                           } else {
                              var95 = eenbmkejxgnkpnng(var95, 229897706);
                           }

                           boolean var57 = var4.add(var44);
                           var95 = 45218770 ^ var95;
                        } else {
                           var95 = 953880822 ^ var95;
                        }

                        var12 += 532490764 ^ var95;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var95)) {
                              case 226401988:
                                 var95 ^= 1312745542;
                                 continue label97;
                              case 1665260260:
                              default:
                                 throw new IllegalStateException();
                              case 1695639812:
                                 continue label97;
                              case 1704315862:
                           }
                        }
                     }
                  }
               } else {
                  label71:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var95)) {
                        case 20969333:
                           var95 ^= 662765745;
                        case 601839046:
                           break label71;
                        case 990269964:
                           break;
                        case 1144291721:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               }
            } else {
               var95 = eenbmkejxgnkpnng(var95, 3586928);
            }
         } else {
            label65:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var95)) {
                  case 71565626:
                     var95 ^= 1866544362;
                     break label65;
                  case 924836333:
                     break;
                  case 1189344124:
                  default:
                     throw new IllegalStateException();
                  case 1407319690:
                     break label65;
               }
            }
         }
      } else {
         label59:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var95)) {
               case 49408104:
                  break label59;
               case 82304191:
                  var95 ^= 148273048;
                  break label59;
               case 1716075525:
                  break;
               case 1875717982:
               default:
                  throw new IllegalStateException();
            }
         }
      }

      LongOpenHashSet var87 = this.visible;
      byte var59 = (byte)((var4.equals(var87)) ? 1 : 0);
      if (var59 != (1697941416 ^ var95)) {
         var95 = 31867144 ^ var95;
         com.wimpyclient.e.a var60 = com.wimpyclient.e.a.INSTANCE;
         List var61 = var60.baseDebugRenderSnapshot();
         int var62 = var61.size();
         int var89 = var4.size();
         if (var62 == var89) {
            var95 = eenbmkejxgnkpnng(var95, 23945852);
            return;
         }

         var95 = 1955228262 ^ var95;
      } else {
         label51:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var95)) {
               case 32429703:
                  break label51;
               case 68527073:
                  var95 ^= 1970023278;
                  break label51;
               case 1121763946:
                  break;
               case 1130186989:
               default:
                  throw new IllegalStateException();
            }
         }
      }

      LongOpenHashSet var64 = this.visible;
      var64.clear();
      LongOpenHashSet var66 = this.visible;
      boolean var67 = var66.addAll(var4);
      com.wimpyclient.e.a var68 = com.wimpyclient.e.a.INSTANCE;
      var68.replaceBaseDebugChunks(var4);
      var95 = 1978075162 ^ var95;
   }

   private void onChunkSpotted(Minecraft var1, int var2, int var3) {
      int var46 = 900146091 ^ 1732582793 ^ 1224323061;
      var46 = 1548982823 ^ var46;
      x var4 = x.INSTANCE;
      byte var5 = (byte)(1179126772 ^ var46);
      int var13 = var2 << var5;
      byte var34 = (byte)(1179126776 ^ var46);
      int var14 = var13 + var34;
      byte var35 = (byte)(1179126772 ^ var46);
      int var16 = var3 << var35;
      byte var36 = (byte)(1179126776 ^ var46);
      int var17 = var16 + var36;
      byte var19 = (byte)((var4.baseDebugChat) ? 1 : 0);
      if (var19 != (1179126768 ^ var46)) {
         var46 = 566772968 ^ var46;
         byte var21 = (byte)((var4.baseDebugShowCoords) ? 1 : 0);
         String var33;
         if (var21 != (1736462104 ^ var46)) {
            var46 = 1215143342 ^ var46;
            var33 = " at " + var14 + ", " + var17;
            var46 = 473038393 ^ var46;
         } else {
            label43:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                  case 143195838:
                     var46 ^= 1296285587;
                  case 423787315:
                     break label43;
                  case 475956884:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1716987873:
               }
            }

            var33 = ffjeivepcs(wiepjpvtqwamejz(), etsdmfwaeeamxvn(), var46);
            var46 = 421518340 ^ var46;
         }

         String var39 = "Base Debug chunk found" + var33;
         chat(var1, var39);
         var46 = 1010777376 ^ var46;
      } else {
         label52:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
               case 137089385:
                  var46 ^= 1235950175;
                  break label52;
               case 1032860449:
               default:
                  throw new RuntimeException(new IOException());
               case 1563838154:
                  break;
               case 1723506543:
                  break label52;
            }
         }
      }

      byte var25 = (byte)((var4.baseDebugSound) ? 1 : 0);
      if (var25 != (266539439 ^ var46)) {
         var46 = 429282760 ^ var46;
         Reference var26 = SoundEvents.NOTE_BLOCK_BELL;
         Object var27 = var26.value();
         SoundEvent var28 = (SoundEvent)var27;
         float var40 = 1.4F;
         float var6 = 0.65F;
         com.wimpyclient.p.f.playUi(var28, var40, var6);
         var46 = 1845069314 ^ var46;
      } else {
         label33:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
               case 129650233:
                  break;
               case 247987616:
                  var46 ^= 1953485770;
               case 1930920450:
                  break label33;
               case 2029373842:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }

      byte var30 = (byte)((var4.baseDebugDisconnect) ? 1 : 0);
      if (var30 != (2072822373 ^ var46)) {
         var46 = 364631967 ^ var46;
         if (var1 != null) {
            var46 = 720265500 ^ var46;
            Runnable var42 = () -> {
               int var23 = 532798784 ^ 1263637659 ^ 1300862907;
               var23 = 236590649 ^ var23;
               ClientLevel var8 = var1.level;
               if (var8 == null) {
                  var23 = 1209347838 ^ var23;
               } else {
                  var23 = eenbmkejxgnkpnng(var23, 910975101);
                  String var10 = "Base Debug chunk found at " + var14 + ", " + var17;
                  MutableComponent var11 = Component.literal(var10);
                  ClientLevel var13x = var1.level;
                  var13x.disconnect(var11);
                  TitleScreen var6x = new TitleScreen();
                  JoinMultiplayerScreen var5x = new JoinMultiplayerScreen(var6x);
                  String var18 = ffjeivepcs(uidkdxiwnzwlgmp(), etsdmfwaeeamxvn(), var23);
                  MutableComponent var19x = Component.translatable(var18);
                  DisconnectedScreen var16x = new DisconnectedScreen(var5x, var19x, var11);
                  byte var17x = (byte)(558868516 ^ var23);
                  var1.disconnect(var16x, (var17x != 0));
               }
            };
            var1.execute(var42);
            var46 = 568751156 ^ var46;
         } else {
            var46 = 185079080 ^ var46;
         }
      } else {
         var46 = eenbmkejxgnkpnng(var46, 515097271);
      }
   }

   private static void chat(Minecraft var0, String var1) {
      int var13 = 913938697 ^ 1917592798 ^ 1300862907;
      var13 = 1719291544 ^ var13;
      if (var0 != null) {
         var13 = 1920746183 ^ var13;
         LocalPlayer var6 = var0.player;
         if (var6 != null) {
            var13 = 896768267 ^ var13;
            LocalPlayer var8 = var0.player;
            String var9 = "[Base Debug] " + var1;
            MutableComponent var10 = Component.literal(var9);
            byte var4 = (byte)(684310328 ^ var13);
            var8.displayClientMessage(var10, (var4 != 0));
            var13 = 1401855540 ^ var13;
         } else {
            var13 = eenbmkejxgnkpnng(var13, 1727858495);
         }
      } else {
         var13 = eenbmkejxgnkpnng(var13, 344016376);
      }
   }

   public static int pillarBottomY() {
      int var3 = 2013159898 ^ 271988169 ^ 1300862907;
      var3 = 2094095864 ^ var3;
      return (byte)(-1452318316 ^ var3);
   }

   public static int pillarTopY() {
      int var3 = 1158137183 ^ 58913832 ^ 1300862907;
      var3 = 771807376 ^ var3;
      return (short)(621575928 ^ var3);
   }

   static {
      int var7 = 1228969301 ^ 1563759717 ^ Integer.parseInt("583725261");
      int var4 = new Random(-8739297203478014454L).nextInt();
      odAJh3wtke = 419974874 ^ var4;
      var7 = 1485983224 ^ var7;
      c var0 = new c();
      INSTANCE = var0;
      ConcurrentLinkedQueue var1 = new ConcurrentLinkedQueue();
      QUEUE = var1;
   }

   public static String ffjeivepcs(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] etsdmfwaeeamxvn() {
      return new byte[]{80, 112, 6, 95, 66, 45, 33, 61, 92, 46, 118, 42, 59, 73, 42, 8, 21, 8, 55, 83, 107, 91, 55, 85, 54, 26, 7, 86, 11, 31};
   }

   private static byte[] uidkdxiwnzwlgmp() {
      return new byte[]{-101, -70, 62, 3, 116, 124, 20, 127, 106, 120, 67, 125, 3, 17, 18, 83, 36, 91, 2, 5, 83, 23, 1, 67, 3, 71, 49, 12, 62, 84, 104, 50};
   }

   private static byte[] wiepjpvtqwamejz() {
      return new byte[0];
   }

   private static int eenbmkejxgnkpnng(int var0, int var1) {
      return var1 ^ var0;
   }
}
