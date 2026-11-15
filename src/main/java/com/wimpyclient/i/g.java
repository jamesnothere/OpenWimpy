package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.Options;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.util.Mth;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class g {
   public static final g INSTANCE;
   private static final int TRIGGER_Y = -3;
   private static final int MIN_RENDER_DISTANCE = 2;
   private static final int FINISH_RENDER_DISTANCE = 32;
   private static final int HOLD_TICKS = 20;
   private static final int RESTORE_ORIGINAL_TICKS = 600;
   private g$a phase;
   private int ticksInPhase;
   private boolean dropped;
   private boolean wasEnabled;
   private int lastOverlayBucket;
   private int originalRenderDistance;
   private static int f8b6nblmLpQ;
   private transient int i5BvH6FXkp;
   private static byte[] zczihesxxu = xosetlcafbiwtmc();

   private g() {
super();
      int var10 = 1515287354 ^ 1749701033;
      

      label25:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
            case 18129127:
               var10 = 1832744952 ^ var10;
            case 1829612547:
               var10 = 1230818446 ^ 1692220954 ^ Integer.parseInt("1923590143");
               this.i5BvH6FXkp = 1321866620 ^ f8b6nblmLpQ;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
                     case 111988912:
                     default:
                        throw new IllegalStateException();
                     case 140122713:
                        var10 = 833093774 ^ var10;
                        break label25;
                     case 1037784064:
                        break;
                     case 1826338006:
                        break label25;
                  }
               }
            case 261587904:
               break;
            case 739099987:
            default:
               throw new IllegalStateException();
         }
      }

      g$a var2 = g$a.WAIT_AT_Y;
      this.phase = var2;
      byte var6 = -1;
      this.lastOverlayBucket = var6;
      byte var7 = -1;
      this.originalRenderDistance = var7;
   }

   public void tick(Minecraft var1) {
      int var118 = 1341461108 ^ 895401607 ^ 776148745;
      var118 = 2025630251 ^ var118;
      byte var2 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var2 == (743707089 ^ var118)) {
         var118 = 372063580 ^ var118;
         byte var68 = (byte)((this.wasEnabled) ? 1 : 0);
         if (var68 != (981019789 ^ var118)) {
            var118 = 971414750 ^ var118;
            this.restoreOriginal(var1);
            this.reset();
            var118 = 1931795934 ^ var118;
         } else {
            var118 = 1254244608 ^ var118;
         }

         byte var110 = (byte)(1891331469 ^ var118);
         this.wasEnabled = (var110 != 0);
      } else {
         label181: {
            label182: {
               label143: {
                  var118 = infuzziyjzroqfpi(var118, 677837640);
                  x var9 = x.INSTANCE;
                  v var11 = var9.autoRelogV2;
                  byte var12 = (byte)((var11.qo()) ? 1 : 0);                  g$a var14 = this.phase;
                  g$a var3 = g$a.HOLD_32;
                  if (var14 == var3) {
                     var118 = 1236430836 ^ var118;
                     if (var12 == (1300268397 ^ var118)) {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                              case 103370499:
                                 var118 = 28484064 ^ var118;
                                 break label143;
                              case 637873844:
                              default:
                                 throw new RuntimeException();
                              case 1088219128:
                                 break;
                              case 2017550655:
                                 break label143;
                           }
                        }
                     }

                     var118 = 561043724 ^ var118;
                     byte var17 = (byte)((this.wasEnabled) ? 1 : 0);
                     if (var17 != (1827691617 ^ var118)) {
                        var118 = infuzziyjzroqfpi(var118, 549615852);
                        break label143;
                     }

                     var118 = 218532654 ^ var118;
                     byte var73 = (byte)(1643566926 ^ var118);
                     this.wasEnabled = (var73 != 0);
                     g$a var74 = g$a.WAIT_AT_Y;
                     this.phase = var74;
                     byte var75 = (byte)(1643566927 ^ var118);
                     this.ticksInPhase = var75;
                     byte var76 = (byte)(-1643566928 ^ var118);
                     this.lastOverlayBucket = var76;
                     var118 = 482271540 ^ var118;
                  } else {
                     var118 = 2038095074 ^ var118;
                  }

                  if (var12 == (2101884539 ^ var118)) {
                     var118 = 436691297 ^ var118;
                     byte var63 = (byte)((this.wasEnabled) ? 1 : 0);
                     if (var63 != (1733252890 ^ var118)) {
                        var118 = 1701019210 ^ var118;
                        this.restoreOriginal(var1);
                        this.reset();
                        var118 = 1630900068 ^ var118;
                        break label181;
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                           case 136961933:
                              var118 ^= 72806702;
                           case 331440491:
                              break label181;
                           case 918320299:
                              break;
                           case 974184819:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  } else {
                     var118 = infuzziyjzroqfpi(var118, 2144587968);
                     byte var25 = (byte)((this.wasEnabled) ? 1 : 0);
                     if (var25 == (43771579 ^ var118)) {
                        var118 = 759609908 ^ var118;
                        this.reset();
                        byte var77 = (byte)(803036302 ^ var118);
                        this.wasEnabled = (var77 != 0);
                        var118 = 663407018 ^ var118;
                     } else {
                        label129:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                              case 41036500:
                                 var118 ^= 181171102;
                                 break label129;
                              case 91121964:
                              default:
                                 throw new RuntimeException();
                              case 385136140:
                                 break;
                              case 731206790:
                                 break label129;
                           }
                        }
                     }

                     LocalPlayer var29 = var1.player;
                     if (var29 == null) {
                        var118 = 1236276122 ^ var118;
                        break label182;
                     }

                     var118 = 1870624272 ^ var118;
                     ClientLevel var32 = var1.level;
                     if (var32 == null) {
                        var118 = 651126154 ^ var118;
                        break label182;
                     }

                     label121:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                           case 132079390:
                              var118 ^= 1274662024;
                              break label121;
                           case 180676580:
                           default:
                              throw new RuntimeException();
                           case 1285403582:
                              break label121;
                           case 1910877665:
                        }
                     }

                     int var78 = this.ticksInPhase;
                     byte var4 = (byte)(751906748 ^ var118);
                     int var79 = var78 + var4;
                     this.ticksInPhase = var79;
                     g$a var35 = this.phase;
                     int var36 = var35.ordinal();
                     switch (var36) {
                        case 0:
                           var118 = 1315921916 ^ var118;
                           byte var38 = (byte)((f.isAtTriggerY(var29)) ? 1 : 0);
                           if (var38 == (1656647745 ^ var118)) {
                              var118 = infuzziyjzroqfpi(var118, 635430750);
                              int var44 = this.ticksInPhase;
                              byte var85 = (byte)(1197578039 ^ var118);
                              int var45 = var44 / var85;
                              int var87 = this.lastOverlayBucket;
                              if (var45 != var87) {
                                 var118 = 1208844869 ^ var118;
                                 this.lastOverlayBucket = var45;
                                 double var90 = var29.getY();
                                 int var92 = Mth.floor(var90);
                                 String var93 = "AutoRelogV2: waiting for Y\u2264-3 (now " + var92 + ")";
                                 MutableComponent var94 = Component.literal(var93);
                                 byte var112 = (byte)(258741595 ^ var118);
                                 var29.displayClientMessage(var94, (var112 != 0));
                                 var118 = 137079244 ^ var118;
                              } else {
                                 var118 = infuzziyjzroqfpi(var118, 1076243337);
                              }

                              var118 = 1884044423 ^ var118;
                              return;
                           }

                           var118 = 1987641290 ^ var118;
                           this.drop(var1);
                           String var81 = jgbwsanehj(fuspvqyfhfctgus(), var118);
                           MutableComponent var82 = Component.literal(var81);
                           byte var111 = (byte)(348557194 ^ var118);
                           var29.displayClientMessage(var82, (var111 != 0));
                           g$a var83 = g$a.HOLD_MIN;
                           this.phase = var83;
                           byte var84 = (byte)(348557195 ^ var118);
                           this.ticksInPhase = var84;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                                 case 20556135:
                                 default:
                                    throw new RuntimeException();
                                 case 60837507:
                                    return;
                                 case 138453723:
                                    var118 = 1674383258 ^ var118;
                                    return;
                                 case 538927391:
                              }
                           }
                        case 1:
                           var118 = 777532193 ^ var118;
                           int var50 = this.ticksInPhase;
                           byte var95 = (byte)(42540168 ^ var118);
                           if (var50 < var95) {
                              var118 = 1971494029 ^ var118;
                              return;
                           }

                           var118 = 200098860 ^ var118;
                           byte var96 = (byte)(157571216 ^ var118);
                           byte var113 = (byte)(157571248 ^ var118);
                           applyRenderDistance(var1, var96, (var113 != 0));
                           String var97 = jgbwsanehj(ldzdrhowxpqcnzk(), var118);
                           MutableComponent var98 = Component.literal(var97);
                           byte var114 = (byte)(157571248 ^ var118);
                           var29.displayClientMessage(var98, (var114 != 0));
                           String var99 = jgbwsanehj(pqrtylcxfqzxpkz(), var118);
                           MutableComponent var100 = Component.literal(var99);
                           byte var115 = (byte)(157571249 ^ var118);
                           var29.displayClientMessage(var100, (var115 != 0));
                           g$a var101 = g$a.HOLD_32;
                           this.phase = var101;
                           byte var102 = (byte)(157571248 ^ var118);
                           this.ticksInPhase = var102;
                           byte var103 = (byte)(-157571249 ^ var118);
                           this.lastOverlayBucket = var103;
                           byte var104 = (byte)(157571248 ^ var118);
                           this.wasEnabled = (var104 != 0);
                           v var59 = var9.autoRelogV2;
                           byte var105 = (byte)(157571248 ^ var118);
                           var59.qp((var105 != 0));

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var118)) {
                                 case 36856497:
                                    var118 = 2121259169 ^ var118;
                                    return;
                                 case 259776741:
                                 default:
                                    throw new RuntimeException();
                                 case 447554361:
                                    break;
                                 case 849120896:
                                    return;
                              }
                           }
                        default:
                           var118 = 1541058476 ^ var118;
                           return;
                     }
                  }
               }

               this.tickHold32(var1);
               return;
            }

            this.restoreOriginal(var1);
            this.reset();
            return;
         }

         byte var108 = (byte)(1662625332 ^ var118);
         this.wasEnabled = (var108 != 0);
      }
   }

   private void tickHold32(Minecraft var1) {
      int var48 = 1045000910 ^ 474861963 ^ 776148745;
      var48 = 1835559812 ^ var48;
      LocalPlayer var7 = var1.player;
      if (var7 != null) {
         var48 = 635236493 ^ var48;
         ClientLevel var10 = var1.level;
         if (var10 != null) {
            var48 = infuzziyjzroqfpi(var48, 1968855271);
            int var27 = this.ticksInPhase;
            byte var3 = (byte)(833189795 ^ var48);
            int var28 = var27 + var3;
            this.ticksInPhase = var28;
            int var13 = this.ticksInPhase;
            short var29 = (short)(833189370 ^ var48);
            if (var13 >= var29) {
               var48 = 1876151422 ^ var48;
               this.restoreOriginal(var1);
               String var31 = jgbwsanehj(zwiovrzbotvuyum(), var48);
               MutableComponent var32 = Component.literal(var31);
               byte var44 = (byte)(1585101789 ^ var48);
               var7.displayClientMessage(var32, (var44 != 0));
               this.reset();
               return;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var48)) {
                  case 3696224:
                     var48 ^= 219123395;
                  case 891175437:
                     short var17 = (short)(1017576249 ^ var48);
                     int var34 = this.ticksInPhase;
                     int var18 = var17 - var34;
                     byte var35 = (byte)(1017575794 ^ var48);
                     int var19 = var18 + var35;
                     byte var36 = (byte)(1017575797 ^ var48);
                     int var20 = var19 / var36;
                     int var38 = this.lastOverlayBucket;
                     if (var20 != var38) {
                        var48 = 1909187673 ^ var48;
                        this.lastOverlayBucket = var20;
                        String var41 = "AutoRelogV2: restoring render distance in " + var20 + "s";
                        MutableComponent var42 = Component.literal(var41);
                        byte var45 = (byte)(1298996537 ^ var48);
                        var7.displayClientMessage(var42, (var45 != 0));
                        var48 = 1751730946 ^ var48;
                     } else {
                        var48 = 430092123 ^ var48;
                     }

                     return;
                  case 1128533405:
                     break;
                  case 2087076071:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }

         var48 = 319404363 ^ var48;
      } else {
         var48 = infuzziyjzroqfpi(var48, 919947718);
      }

      this.restoreOriginal(var1);
      this.reset();
   }

   private void drop(Minecraft var1) {
      int var11 = 1614292077 ^ 1821766229 ^ 776148745;
      var11 = 1099430054 ^ var11;
      this.rememberOriginal(var1);
      byte var7 = (byte)(1667840405 ^ var11);
      byte var4 = (byte)(1667840407 ^ var11);
      applyRenderDistance(var1, var7, (var4 != 0));
      byte var8 = (byte)(1667840406 ^ var11);
      this.dropped = (var8 != 0);
   }

   private void rememberOriginal(Minecraft var1) {
      int var21 = 1880817 ^ 1219490960 ^ 776148745;
      var21 = 1013071851 ^ var21;
      int var8 = this.originalRenderDistance;
      if (var8 >= (1519545987 ^ var21)) {
         var21 = 1437178087 ^ var21;
      } else {
         var21 = 501325874 ^ var21;
         Options var10 = var1.options;
         int var17;
         if (var10 != null) {
            var21 = 2055992297 ^ var21;
            OptionInstance var13 = var10.renderDistance();
            Object var14 = var13.get();
            Integer var15 = (Integer)var14;
            var17 = var15;
            var21 = infuzziyjzroqfpi(var21, 202788095);
         } else {
            var21 = 708054207 ^ var21;
            var17 = (byte)(1833419266 ^ var21);
            var21 = 1554625449 ^ var21;
         }

         byte var7 = (byte)var17;
         byte var4 = (byte)(837710245 ^ var21);
         byte var5 = (byte)(837710215 ^ var21);
         int var18 = Mth.clamp(var7, var4, var5);
         this.originalRenderDistance = var18;
      }
   }

   private void restoreOriginal(Minecraft var1) {
      int var20 = 2002652193 ^ 1236611350 ^ 776148745;
      var20 = 1399484837 ^ var20;
      byte var6 = (byte)((this.dropped) ? 1 : 0);
      if (var6 == (1136810907 ^ var20)) {
         var20 = 699089622 ^ var20;
         int var8 = this.originalRenderDistance;
         if (var8 < (1785272653 ^ var20)) {
            var20 = 1352260629 ^ var20;
            return;
         }

         var20 = 1498536184 ^ var20;
      } else {
         var20 = infuzziyjzroqfpi(var20, 1895471662);
      }

      int var10 = this.originalRenderDistance;
      int var15;
      if (var10 >= (859357621 ^ var20)) {
         var20 = 1413825240 ^ var20;
         var15 = this.originalRenderDistance;
         var20 = infuzziyjzroqfpi(var20, 182685121);
      } else {
         var20 = 1838889802 ^ var20;
         var15 = (byte)(1587804925 ^ var20);
         var20 = 859698259 ^ var20;
      }

      byte var5 = (byte)var15;
      byte var4 = (byte)(1839074989 ^ var20);
      applyRenderDistance(var1, var5, (var4 != 0));
      byte var16 = (byte)(1839074988 ^ var20);
      this.dropped = (var16 != 0);
      byte var17 = (byte)(-1839074989 ^ var20);
      this.originalRenderDistance = var17;
   }

   private static void applyRenderDistance(Minecraft var0, int var1, boolean var2) {
      int var28 = 1483274276 ^ 1051953234 ^ 1619591797;
      var28 = 787231688 ^ var28;
      Options var8 = var0.options;
      if (var8 == null) {
         var28 = 1504905947 ^ var28;
      } else {
         var28 = infuzziyjzroqfpi(var28, 1772751160);
         byte var4 = (byte)(1091848433 ^ var28);
         byte var5 = (byte)(1091848403 ^ var28);
         int var11 = Mth.clamp(var1, var4, var5);
         OptionInstance var13 = var8.renderDistance();
         Object var14 = var13.get();
         Integer var15 = (Integer)var14;
         int var16 = var15;
         if (var16 == var11) {
            var28 = 241301211 ^ var28;
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                  case 236391490:
                     var28 ^= 623998;
                     break;
                  case 254792109:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1423064628:
                     break;
                  case 2095041228:
                     continue;
               }

               OptionInstance var18 = var8.renderDistance();
               Integer var25 = var11;
               var18.set(var25);
               if (var2 != ((1092472205 ^ var28) != 0)) {
                  var28 = 1439729102 ^ var28;
                  var8.save();
                  var28 = infuzziyjzroqfpi(var28, 1353550835);
               } else {
                  label31:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
                        case 237633372:
                           var28 ^= 1711701295;
                           break label31;
                        case 483824399:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1260149238:
                           break label31;
                        case 1548198721:
                     }
                  }

                  var8.broadcastOptions();
                  var28 = 1669034770 ^ var28;
               }

               com.wimpyclient.f.e var21 = com.wimpyclient.f.e.INSTANCE;
               var21.noteWorldReload();
               return;
            }
         }
      }
   }

   private void reset() {
      int var13 = 2100725243 ^ 1436824952 ^ 776148745;
      var13 = 1003513457 ^ var13;
      g$a var2 = g$a.WAIT_AT_Y;
      this.phase = var2;
      byte var7 = (byte)(1023525371 ^ var13);
      this.ticksInPhase = var7;
      byte var8 = (byte)(1023525371 ^ var13);
      this.dropped = (var8 != 0);
      byte var9 = (byte)(-1023525372 ^ var13);
      this.lastOverlayBucket = var9;
      byte var10 = (byte)(-1023525372 ^ var13);
      this.originalRenderDistance = var10;
   }

   static {
      int var6 = 1926716836 ^ 2069724248 ^ Integer.parseInt("1923590143");
      int var3 = new Random(-1060812238489380801L).nextInt();
      f8b6nblmLpQ = -1902053300 ^ var3;
      var6 = 1904338665 ^ var6;
      g var0 = new g();
      INSTANCE = var0;
   }

   public static String jgbwsanehj(byte[] var0, int var1) {
      String var8 = Integer.toString(var1);
      byte[] var9 = var8.getBytes();
      byte[] var6 = var9;
      byte var10 = 0;
      int var7 = var10;

      while (true) {
         int var15 = var0.length;
         if (var7 >= var15) {
            Charset var29 = StandardCharsets.UTF_16;
            return new String(var0, var29);
         }

         byte var18 = var0[var7];
         int var33 = var6.length;
         int var30 = var7 % var33;
         byte var26 = var6[var30];
         int var19 = var18 ^ var26;
         byte var20 = (byte)var19;
         var0[var7] = var20;
         byte var21 = var0[var7];
         byte[] var27 = zczihesxxu;
         byte[] var34 = zczihesxxu;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] xosetlcafbiwtmc() {
      return new byte[]{
         34,
         67,
         110,
         55,
         113,
         8,
         1,
         78,
         1,
         104,
         108,
         55,
         8,
         107,
         106,
         30,
         10,
         22,
         121,
         105,
         9,
         22,
         77,
         27,
         106,
         5,
         75,
         47,
         38,
         111,
         104,
         79,
         12,
         38,
         105,
         34,
         22
      };
   }

   private static byte[] ldzdrhowxpqcnzk() {
      return new byte[]{
         -19,
         -119,
         89,
         89,
         70,
         120,
         51,
         15,
         57,
         45,
         89,
         111,
         61,
         14,
         91,
         73,
         62,
         66,
         72,
         51,
         62,
         68,
         122,
         124,
         88,
         3,
         115,
         67,
         19,
         120,
         93,
         62,
         61,
         120,
         93,
         99,
         39,
         55,
         116,
         46,
         0,
         48,
         58,
         21,
         118,
         94,
         93,
         52,
         2,
         72
      };
   }

   private static byte[] pqrtylcxfqzxpkz() {
      return new byte[]{-19, -119, 89, 68, 70, 85, 51, 3, 57, 121, 89, 117, 61, 44, 91, 12, 62, 64, 72, 51, 62, 84};
   }

   private static byte[] fuspvqyfhfctgus() {
      return new byte[]{
         -17,
         -120,
         86,
         67,
         68,
         74,
         48,
         3,
         52,
         52,
         88,
         93,
         61,
         59,
         93,
         67,
         51,
         76,
         74,
         58,
         49,
         117,
         120,
         30,
         91,
         6,
         126,
         60,
         18,
         51,
         93,
         8,
         59,
         120,
         80,
         103,
         37,
         102,
         123,
         50,
         2,
         40,
         57,
         95,
         123,
         18,
         92,
         38,
         2,
         88,
         92,
         53,
         39,
         91,
         37,
         40,
         81,
         78,
         35,
         90,
         42,
         55,
         48,
         17,
         27,
         109,
         90,
         41,
         120,
         92,
         31,
         50,
         17,
         65,
         26,
         19,
         123,
         38
      };
   }

   private static byte[] zwiovrzbotvuyum() {
      return new byte[]{
         -19,
         -119,
         86,
         67,
         64,
         77,
         48,
         13,
         57,
         63,
         93,
         80,
         48,
         59,
         91,
         66,
         59,
         78,
         65,
         54,
         56,
         117,
         117,
         28,
         91,
         15,
         122,
         56,
         30,
         37,
         89,
         31,
         52,
         125,
         88,
         118,
         39,
         112,
         123,
         36,
         6,
         100,
         48,
         80,
         127,
         88,
         89,
         40,
         15,
         68,
         90,
         62,
         38,
         81,
         39,
         42,
         88,
         91,
         46,
         85,
         42,
         45,
         61,
         27,
         30,
         101,
         94,
         43,
         119,
         91,
         23,
         46,
         26,
         70,
         19,
         23
      };
   }

   private static int infuzziyjzroqfpi(int var0, int var1) {
      return var0 ^ var1;
   }
}
