package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
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
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class ah {
   public static final ah INSTANCE;
   private boolean holdingAttack;
   private static int f9KIR60WsTa;
   private transient int xbCNBLu8Wl;
   private static byte[] bllkqkqbex = grczrlabjzaihea();

   private ah() {
super();
      int var4 = 174218700 ^ 1583498501;
      
      var4 = 1175315727 ^ var4;
      var4 = 74933283 ^ 738912972 ^ Integer.parseInt("980448041");
      this.xbCNBLu8Wl = 675956001 ^ f9KIR60WsTa;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 50006434:
               var4 = 528107989 ^ var4;
            case 470051844:
               return;
            case 342719570:
               break;
            case 2085048126:
            default:
               throw new RuntimeException();
         }
      }
   }

   public void tick(Minecraft var1) {
      int var32 = 2020726866 ^ 313730302 ^ 400093989;
      var32 = 527800252 ^ var32;
      byte var2 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var2 != (1651480629 ^ var32)) {
         var32 = 1808788156 ^ var32;
         x var5 = x.INSTANCE;
         v var6 = var5.autoMine;
         byte var7 = (byte)((var6.qo()) ? 1 : 0);
         if (var7 != (161510025 ^ var32)) {
            var32 = aefnavjacxlbzlxy(var32, 429956283);
            LocalPlayer var10 = var1.player;
            if (var10 != null) {
               var32 = 177640708 ^ var32;
               ClientLevel var13 = var1.level;
               if (var13 == null) {
                  var32 = aefnavjacxlbzlxy(var32, 1182083823);
               } else {
                  var32 = 1842876166 ^ var32;
                  MultiPlayerGameMode var15 = var1.gameMode;
                  if (var15 != null) {
                     var32 = 1838385853 ^ var32;
                     Screen var17 = var1.screen;
                     if (var17 != null) {
                        var32 = 1178513236 ^ var32;
                     } else {
                        label95: {
                           var32 = 659010721 ^ var32;
                           com.wimpyclient.g.g var18 = com.wimpyclient.g.g.INSTANCE;
                           byte var19 = (byte)((var18.isOpen()) ? 1 : 0);
                           if (var19 == (1033521708 ^ var32)) {
                              var32 = 1082866794 ^ var32;
                              byte var20 = (byte)((com.wimpyclient.p.o.isActive()) ? 1 : 0);
                              if (var20 == (2098296390 ^ var32)) {
                                 var32 = 1392004441 ^ var32;
                                 byte var21 = (byte)((com.wimpyclient.p.b.isForcingLeftClick()) ? 1 : 0);
                                 if (var21 != (803814175 ^ var32)) {
                                    var32 = 1930062534 ^ var32;
                                    break label95;
                                 }

                                 label45:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
                                       case 140915536:
                                       default:
                                          throw new IllegalStateException();
                                       case 215207269:
                                          var32 ^= 1944868907;
                                       case 1120534194:
                                          break label45;
                                       case 1454212270:
                                    }
                                 }
                              } else {
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
                                       case 38905910:
                                          var32 = 569517983 ^ var32;
                                          break label95;
                                       case 1281434212:
                                          break;
                                       case 1334020046:
                                       default:
                                          throw new IllegalStateException();
                                       case 1398683578:
                                          break label95;
                                    }
                                 }
                              }
                           } else {
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
                                    case 123392559:
                                       var32 = 1635326965 ^ var32;
                                       break label95;
                                    case 477724888:
                                    default:
                                       throw new IllegalStateException();
                                    case 1057338023:
                                       break label95;
                                    case 1156472986:
                                 }
                              }
                           }

                           Options var23 = var1.options;
                           KeyMapping var24 = var23.keyAttack;
                           byte var27 = (byte)(1543856949 ^ var32);
                           var24.setDown((var27 != 0));
                           byte var28 = (byte)(1543856949 ^ var32);
                           this.holdingAttack = (var28 != 0);
                           return;
                        }
                     }
                  } else {
                     var32 = 732767721 ^ var32;
                  }
               }
            } else {
               var32 = aefnavjacxlbzlxy(var32, 1289994219);
            }

            this.release(var1);
            return;
         }

         var32 = 1925413740 ^ var32;
      } else {
         var32 = 420254160 ^ var32;
      }

      this.release(var1);
   }

   public void release(Minecraft var1) {
      int var15 = 1164022016 ^ 1148195471 ^ 400093989;
      var15 = 106902550 ^ var15;
      byte var4 = (byte)((this.holdingAttack) ? 1 : 0);
      if (var4 == (278283452 ^ var15)) {
         var15 = 355270683 ^ var15;
      } else {
         var15 = aefnavjacxlbzlxy(var15, 841206227);
         byte var3 = (byte)(582323567 ^ var15);
         this.holdingAttack = (var3 != 0);
         if (var1 == null) {
            var15 = aefnavjacxlbzlxy(var15, 110352224);
         } else {
            var15 = 1485636569 ^ var15;
            Options var8 = var1.options;
            if (var8 != null) {
               var15 = 1391580455 ^ var15;
               Options var10 = var1.options;
               KeyMapping var11 = var10.keyAttack;
               byte var12 = (byte)(684284817 ^ var15);
               var11.setDown((var12 != 0));
               var15 = 216990110 ^ var15;
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
                     case 214822584:
                        var15 = 1579078841 ^ var15;
                        return;
                     case 269938352:
                        return;
                     case 1006797256:
                        break;
                     case 1165984303:
                     default:
                        throw new RuntimeException();
                  }
               }
            }
         }
      }
   }

   static {
      int var6 = 949544451 ^ 537764547 ^ Integer.parseInt("980448041");
      int var3 = new Random(-5466844232330157761L).nextInt();
      f9KIR60WsTa = 613768602 ^ var3;
      var6 = 3934607 ^ var6;
      ah var0 = new ah();
      INSTANCE = var0;
   }

   public static String wnfwlezyjk(byte[] var0, int var1) {
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
         byte[] var28 = bllkqkqbex;
         byte[] var34 = bllkqkqbex;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] grczrlabjzaihea() {
      return new byte[]{
         32,
         20,
         12,
         102,
         4,
         57,
         99,
         42,
         10,
         24,
         90,
         49,
         125,
         71,
         33,
         123,
         115,
         38,
         107,
         61,
         62,
         38,
         21,
         103,
         3,
         76,
         37,
         80,
         60,
         43,
         112,
         31,
         3,
         98,
         7,
         66,
         114,
         47,
         5,
         126,
         11,
         64,
         26,
         55,
         109,
         47,
         36,
         86,
         78,
         99,
         21,
         77,
         83,
         115,
         119,
         71,
         41,
         4,
         90,
         90,
         6,
         69,
         55,
         48,
         77,
         108,
         32,
         48,
         59,
         31,
         8,
         119,
         62,
         64,
         120,
         1,
         73,
         113,
         4,
         40,
         81,
         25,
         87,
         35,
         70,
         75,
         113,
         109,
         123,
         103,
         89,
         52,
         99,
         68,
         87,
         31,
         121,
         12,
         122,
         125,
         33,
         65,
         114,
         111,
         120,
         25,
         66,
         122,
         74
      };
   }

   private static int aefnavjacxlbzlxy(int var0, int var1) {
      return var1 ^ var0;
   }
}
