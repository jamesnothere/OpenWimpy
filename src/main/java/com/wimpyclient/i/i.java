package com.wimpyclient.i;

import com.mojang.authlib.GameProfile;
import com.wimpyclient.auth.LicenseGate;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.player.Player;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class i {
   public static final i INSTANCE;
   private boolean disconnecting;
   private static int f0Cpk9f9TNV;
   private transient int TKBphMqn3L;

   private i() {
super();
      int var4 = 352834635 ^ 398915871;
      
      var4 = maqcpatkoakpyhdc(var4, 1917427439);
      var4 = 1727146590 ^ 830013675 ^ Integer.parseInt("654547214");
      this.TKBphMqn3L = 1054228243 ^ f0Cpk9f9TNV;
      var4 = maqcpatkoakpyhdc(var4, 414972101);
   }

   public void tick(Minecraft var1) {
      int var122 = 1304107698 ^ 1033338968 ^ 83419224;
      var122 = 1329799151 ^ var122;
      x var2 = x.INSTANCE;
      v var23 = var2.autolog;
      byte var24 = (byte)((var23.qo()) ? 1 : 0);
      if (var24 != (999777629 ^ var122)) {
         var122 = 2127462768 ^ var122;
         byte var26 = (byte)((this.disconnecting) ? 1 : 0);
         if (var26 == (1163519021 ^ var122)) {
            var122 = maqcpatkoakpyhdc(var122, 573909387);
            byte var27 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
            if (var27 == (1735183782 ^ var122)) {
               var122 = 761814048 ^ var122;
               return;
            }

            ClientLevel var31;
            MutableComponent var65;
            label143:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var122)) {
                  case 140683549:
                     var122 ^= 511229167;
                  case 1605127848:
                     LocalPlayer var29 = var1.player;
                     LocalPlayer var8 = var29;
                     var31 = var1.level;
                     ClientPacketListener var33 = var1.getConnection();
                     if (var29 == null) {
                        var122 = maqcpatkoakpyhdc(var122, 2070901160);
                        return;
                     }

                     var122 = 1226755319 ^ var122;
                     if (var31 == null) {
                        var122 = maqcpatkoakpyhdc(var122, 846314847);
                        return;
                     }

                     var122 = 727250069 ^ var122;
                     if (var33 == null) {
                        var122 = 422136266 ^ var122;
                        return;
                     }

                     var122 = 1657217124 ^ var122;
                     byte var37 = (byte)(2039834958 ^ var122);
                     int var99 = var2.autologRange;
                     int var38 = Math.max(var37, var99);
                     double var39 = var38;
                     double var43 = var39 * var39;
                     double var13 = var43;
                     Object var45 = null;
                     Player var15 = (Player)var45;
                     double var46 = Double.MAX_VALUE;
                     double var16 = var46;
                     List var49 = var31.players();
                     Iterator var50 = var49.iterator();
                     Iterator var18 = var50;
                     var122 = 1880926872 ^ var122;

                     label141:
                     while (true) {
                        byte var52 = (byte)((var18.hasNext()) ? 1 : 0);
                        if (var52 == (160023511 ^ var122)) {
                           label100:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var122)) {
                                 case 41607929:
                                    var122 ^= 1044623657;
                                    break label100;
                                 case 98392695:
                                 default:
                                    throw new IllegalStateException();
                                 case 311059127:
                                    break;
                                 case 2091676076:
                                    break label100;
                              }
                           }

                           if (var15 == null) {
                              var122 = 1697105391 ^ var122;
                              return;
                           }

                           String var117;
                           label92: {
                              var122 = 2090412921 ^ var122;
                              GameProfile var55 = var15.getGameProfile();
                              String var56 = var55.name();
                              var117 = var56;
                              if (var56 != null) {
                                 var122 = 568707698 ^ var122;
                                 byte var59 = (byte)((var56.isBlank()) ? 1 : 0);
                                 if (var59 == (1790350325 ^ var122)) {
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var122)) {
                                          case 28257624:
                                          default:
                                             throw new IllegalStateException();
                                          case 247583772:
                                             var122 ^= 668791908;
                                             break label92;
                                          case 550695814:
                                             break;
                                          case 652579510:
                                             break label92;
                                       }
                                    }
                                 }

                                 var122 = 1776874338 ^ var122;
                              } else {
                                 var122 = maqcpatkoakpyhdc(var122, 1208826128);
                              }

                              Component var61 = var15.getName();
                              String var62 = var61.getString();
                              var117 = var62;
                              var122 = 1312032518 ^ var122;
                           }

                           String var64 = "[WimpyClient] " + var117 + " is nearby.";
                           var65 = Component.literal(var64);
                           byte var100 = (byte)(1298818960 ^ var122);
                           this.disconnecting = (var100 != 0);
                           v var68 = var2.autolog;
                           byte var101 = (byte)(1298818961 ^ var122);
                           var68.qp((var101 != 0));
                           com.wimpyclient.g.g var69 = com.wimpyclient.g.g.INSTANCE;
                           byte var70 = (byte)((var69.isOpen()) ? 1 : 0);
                           if (var70 != (1298818961 ^ var122)) {
                              var122 = 1857312251 ^ var122;
                              com.wimpyclient.g.g var71 = com.wimpyclient.g.g.INSTANCE;
                              var71.forceClose(var1);
                              var122 = 925136708 ^ var122;
                              break label143;
                           }

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var122)) {
                                 case 100558274:
                                    var122 ^= 1502618303;
                                 case 229970282:
                                    break label143;
                                 case 397285326:
                                 default:
                                    throw new IllegalStateException();
                                 case 1544172109:
                              }
                           }
                        }

                        var122 ^= 1518897310;
                        Object var78 = var18.next();
                        Player var79 = (Player)var78;
                        if (var79 != var8) {
                           var122 = 2020063643 ^ var122;
                           byte var82 = (byte)((var79.isRemoved()) ? 1 : 0);
                           if (var82 == (728167122 ^ var122)) {
                              var122 = 1396686577 ^ var122;
                              byte var84 = (byte)((var79 instanceof LocalPlayer) ? 1 : 0);
                              if (var84 == (2019118115 ^ var122)) {
                                 var122 = 1659742375 ^ var122;
                                 byte var86 = (byte)((var79 instanceof p) ? 1 : 0);
                                 if (var86 != (448062596 ^ var122)) {
                                    var122 = 1891992399 ^ var122;
                                    var122 = maqcpatkoakpyhdc(var122, 1677239324);
                                 } else {
                                    var122 = maqcpatkoakpyhdc(var122, 1382270402);
                                    double var88 = var8.distanceToSqr(var79);
                                    double var148;
                                    int var92 = (var148 = var88 - var13) == 0.0 ? 0 : (var148 < 0.0 ? -1 : 1);
                                    if (var92 <= (1222058310 ^ var122)) {
                                       var122 = 2076266495 ^ var122;
                                       double var149;
                                       int var95 = (var149 = var88 - var16) == 0.0 ? 0 : (var149 < 0.0 ? -1 : 1);
                                       if (var95 < (857108153 ^ var122)) {
                                          var122 = 1259113873 ^ var122;
                                          var16 = var88;
                                          var15 = var79;
                                          var122 = 1757612174 ^ var122;
                                       } else {
                                          var122 = 600802591 ^ var122;
                                       }
                                    } else {
                                       var122 = maqcpatkoakpyhdc(var122, 1477364448);
                                    }

                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var122)) {
                                          case 10889288:
                                             var122 ^= 424683633;
                                             continue label141;
                                          case 145848024:
                                             break;
                                          case 743588791:
                                             continue label141;
                                          case 2108998837:
                                          default:
                                             throw new IllegalStateException();
                                       }
                                    }
                                 }
                              } else {
                                 var122 = maqcpatkoakpyhdc(var122, 1909493748);
                              }
                           } else {
                              var122 = maqcpatkoakpyhdc(var122, 586100997);
                           }
                        } else {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var122)) {
                                 case 13816540:
                                    var122 ^= 1518897310;
                                 case 353352106:
                                    continue label141;
                                 case 1361049283:
                                    break;
                                 case 1504139621:
                                 default:
                                    throw new IllegalStateException();
                              }
                           }
                        }
                     }
                  case 576913239:
                  default:
                     throw new IllegalStateException();
                  case 1569628141:
               }
            }

            var31.disconnect(var65);
            TitleScreen var73 = new TitleScreen();
            JoinMultiplayerScreen var108 = new JoinMultiplayerScreen(var73);
            String var114 = vkezzmkmww(dmmhxgshuiobbhn(), wqytwqrlasevwdl(), var122);
            MutableComponent var115 = Component.translatable(var114);
            DisconnectedScreen var74 = new DisconnectedScreen(var108, var115, var65);
            byte var109 = (byte)(351946030 ^ var122);
            var1.disconnect(var74, (var109 != 0));
            byte var105 = (byte)(351946030 ^ var122);
            this.disconnecting = (var105 != 0);
            return;
         }

         var122 = 1025774835 ^ var122;
      } else {
         var122 = 1139447171 ^ var122;
      }
   }

   static {
      int var6 = 1493582800 ^ 708150112 ^ Integer.parseInt("654547214");
      int var3 = new Random(6548253764908896942L).nextInt();
      f0Cpk9f9TNV = 373606917 ^ var3;
      var6 = 273633409 ^ var6;
      i var0 = new i();
      INSTANCE = var0;
   }

   public static String vkezzmkmww(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] wqytwqrlasevwdl() {
      return new byte[]{
         19,
         72,
         127,
         106,
         90,
         32,
         10,
         112,
         27,
         46,
         27,
         49,
         54,
         21,
         53,
         95,
         78,
         73,
         98,
         3,
         79,
         78,
         70,
         64,
         58,
         39,
         98,
         63,
         11,
         53,
         24,
         82,
         65,
         4,
         5,
         38,
         72,
         2,
         60,
         89,
         39,
         50,
         4,
         108,
         87,
         37,
         55,
         35,
         37,
         124,
         105,
         42,
         61,
         77,
         119,
         11,
         90,
         20,
         34,
         83,
         66,
         117,
         95,
         90,
         28,
         126,
         50,
         37,
         87,
         15,
         108,
         125,
         18,
         89,
         73,
         47,
         13,
         52,
         52,
         6,
         19,
         85,
         57,
         105,
         120,
         65,
         11,
         23,
         74,
         91
      };
   }

   private static byte[] dmmhxgshuiobbhn() {
      return new byte[]{
         -34, -126, 78, 55, 110, 127, 58, 48, 43, 126, 46, 111, 15, 79, 3, 1, 125, 28, 81, 85, 126, 3, 114, 88, 10, 120, 82, 99, 62, 119, 33, 18
      };
   }

   private static int maqcpatkoakpyhdc(int var0, int var1) {
      return var1 ^ var0;
   }
}
