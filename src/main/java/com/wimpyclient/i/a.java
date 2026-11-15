package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
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
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a {
   public static final a INSTANCE;
   private Entity stickyTarget;
   private boolean attackWasDown;
   private boolean toggleLatched;
   private static int g0oYWnEViu;
   private transient int f4cihIC0QHF;

   private a() {
super();
      int var4 = 1489450271 ^ 1875657913;
      
      var4 = 2092194386 ^ var4;
      var4 = 1573237265 ^ 608724713 ^ Integer.parseInt("842202892");
      this.f4cihIC0QHF = 97304816 ^ g0oYWnEViu;
      var4 = 1774354992 ^ var4;
   }

   public void tick(Minecraft var1) {
      int var194 = 1194153806 ^ 1933912092 ^ 1646384302;
      var194 = 517018399 ^ var194;
      byte var2 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var2 == (1217968355 ^ var194)) {
         var194 = 1222800394 ^ var194;
         this.resetState();
      } else {
         var194 = 1470695476 ^ var194;
         x var30 = x.INSTANCE;
         v var32 = var30.aimAssist;
         byte var33 = (byte)((var32.qo()) ? 1 : 0);
         if (var33 == (523350231 ^ var194)) {
            var194 = 895650013 ^ var194;
            this.resetState();
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var194)) {
                  case 203842704:
                  default:
                     throw new RuntimeException(new IOException());
                  case 208689553:
                     var194 ^= 992792549;
                  case 947000648:
                     break;
                  case 1729388587:
                     continue;
               }

               LocalPlayer var35 = var1.player;
               if (var35 == null) {
                  var194 = 1745010465 ^ var194;
                  return;
               }

               var194 = 1374221349 ^ var194;
               ClientLevel var37 = var1.level;
               if (var37 == null) {
                  var194 = 971655940 ^ var194;
                  return;
               }

               var194 = 1094164996 ^ var194;
               Screen var39 = var1.screen;
               if (var39 == null) {
                  var194 = 607040714 ^ var194;
                  com.wimpyclient.g.g var40 = com.wimpyclient.g.g.INSTANCE;
                  byte var41 = (byte)((var40.isOpen()) ? 1 : 0);
                  if (var41 != (283942361 ^ var194)) {
                     var194 = 859769186 ^ var194;
                     return;
                  }

                  var194 = 1510028210 ^ var194;
                  q var42 = q.INSTANCE;
                  byte var43 = (byte)((var42.isActive()) ? 1 : 0);
                  if (var43 != (1257090667 ^ var194)) {
                     var194 = 1742708516 ^ var194;
                     return;
                  }

                  label95:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var194)) {
                        case 19712770:
                           var194 ^= 1935051393;
                           break label95;
                        case 1154105912:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1157231669:
                           break;
                        case 1979384790:
                           break label95;
                     }
                  }

                  LocalPlayer var45 = var1.player;
                  Options var47 = var1.options;
                  KeyMapping var48 = var47.keyAttack;
                  boolean var49 = var48.isDown();
                  String var129 = var30.aimAssistActivation;
                  boolean var181 = var30.aimAssistSticky;
                  byte var51 = (byte)((this.activationAllows(var129, var49, var181)) ? 1 : 0);
                  if (var51 == (968565994 ^ var194)) {
                     var194 = 964521567 ^ var194;
                     return;
                  }

                  label87:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var194)) {
                        case 265989694:
                           var194 ^= 635589607;
                           break label87;
                        case 658252041:
                           break;
                        case 826545678:
                           break label87;
                        case 1502631067:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }

                  LivingEntity var53 = this.pickTarget(var1, var45, var30);
                  if (var53 == null) {
                     var194 = 1247092598 ^ var194;
                     Object var149 = null;
                     this.stickyTarget = (Entity)var149;
                     return;
                  }

                  label79:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var194)) {
                        case 114805547:
                        default:
                           throw new RuntimeException(new IOException());
                        case 116214512:
                           var194 ^= 695556106;
                           break label79;
                        case 241479876:
                           break;
                        case 1192331413:
                           break label79;
                     }
                  }

                  this.stickyTarget = var53;
                  String var133 = var30.aimAssistTarget;
                  Vec3 var57 = aimPoint(var53, var133);
                  float var134 = 1.0F;
                  Vec3 var59 = var45.getEyePosition(var134);
                  double var61 = var57.x;
                  double var152 = var59.x;
                  double var63 = var61 - var152;
                  double var66 = var57.y;
                  double var155 = var59.y;
                  double var68 = var66 - var155;
                  double var71 = var57.z;
                  double var158 = var59.z;
                  double var73 = var71 - var158;
                  double var77 = var63 * var63;
                  double var164 = var73 * var73;
                  double var79 = var77 + var164;
                  double var81 = Math.sqrt(var79);
                  double var85 = Mth.atan2(var73, var63);
                  double var168 = 180.0 / Math.PI;
                  double var87 = var85 * var168;
                  float var89 = (float)var87;
                  float var135 = 90.0F;
                  float var90 = var89 - var135;
                  double var93 = Mth.atan2(var68, var81);
                  double var172 = 180.0 / Math.PI;
                  double var95 = var93 * var172;
                  double var97 = -var95;
                  float var99 = (float)var97;
                  float var101 = var45.getYRot();
                  float var103 = var45.getXRot();
                  float var105 = var90 - var101;
                  float var106 = Mth.wrapDegrees(var105);
                  float var108 = var99 - var103;
                  int var110 = var30.aimAssistFov;
                  float var111 = var110;
                  float var113 = Math.abs(var106);
                  float var217;
                  int var114 = (var217 = var113 - var111) == 0.0F ? 0 : (var217 < 0.0F ? -1 : 1);
                  if (var114 <= (892088071 ^ var194)) {
                     var194 = 526748123 ^ var194;
                     float var116 = Math.abs(var108);
                     float var218;
                     int var117 = (var218 = var116 - var111) == 0.0F ? 0 : (var218 < 0.0F ? -1 : 1);
                     if (var117 <= (709469916 ^ var194)) {
                        var194 = 1719009424 ^ var194;
                        int var119 = var30.aimAssistSpeed;
                        int var141 = var30.aimAssistSmoothness;
                        String var175 = var30.aimAssistSmoothing;
                        float var184 = Math.abs(var106);
                        float var190 = Math.abs(var108);
                        float var185 = Math.max(var184, var190);
                        float var120 = pullFactor(var119, var141, var175, var185, var111);
                        float var177 = var106 * var120;
                        float var143 = var101 + var177;
                        var45.setYRot(var143);
                        float var145 = var45.getYRot();
                        var45.setYHeadRot(var145);
                        byte var124 = (byte)((var30.aimAssistVertical) ? 1 : 0);
                        if (var124 != (1279239756 ^ var194)) {
                           var194 = 805280779 ^ var194;
                           float var179 = var108 * var120;
                           float var147 = var103 + var179;
                           float var180 = -90.0F;
                           float var188 = 90.0F;
                           float var148 = Mth.clamp(var147, var180, var188);
                           var45.setXRot(var148);
                           var194 = 1653040083 ^ var194;
                        } else {
                           var194 = mnfqkwlrtuumqdfi(var194, 1299775448);
                        }

                        return;
                     }

                     var194 = 1268192846 ^ var194;
                     return;
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var194)) {
                        case 117812785:
                           var194 = 1425186709 ^ var194;
                           return;
                        case 687402658:
                           break;
                        case 1479407227:
                        default:
                           throw new RuntimeException(new IOException());
                        case 2026701165:
                           return;
                     }
                  }
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var194)) {
                     case 104340310:
                        var194 = 387038632 ^ var194;
                        return;
                     case 363219984:
                        break;
                     case 671800384:
                        return;
                     case 2129478192:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }
         }
      }
   }

   private boolean activationAllows(String var1, boolean var2, boolean var3) {
      int var38 = 1599000404 ^ 1310312073 ^ 1646384302;
      var38 = 1039668006 ^ var38;
      String var4 = tyioaddfjk(ncmryhfesmhxebz(), jmtinqrugqxzudc(), var38);
      byte var6 = (byte)((var4.equals(var1)) ? 1 : 0);
      if (var6 != (1317981781 ^ var38)) {
         var38 = 1218082266 ^ var38;
         this.attackWasDown = (boolean)var2;
         return (((byte)(102022030 ^ var38)) != 0);
      } else {
         label80:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
               case 8521350:
               default:
                  throw new RuntimeException(new IOException());
               case 137683274:
                  var38 ^= 1660446220;
               case 965924931:
                  break;
               case 1315114507:
                  continue;
            }

            String var9 = tyioaddfjk(mrhpfowbvrmzdff(), jmtinqrugqxzudc(), var38);
            byte var10 = (byte)((var9.equals(var1)) ? 1 : 0);
            if (var10 != (745973849 ^ var38)) {
               var38 = 1502348087 ^ var38;
               if (var2 != ((1979362158 ^ var38) != 0)) {
                  var38 = 1250410550 ^ var38;
                  byte var19 = (byte)((this.attackWasDown) ? 1 : 0);
                  if (var19 != (1065184088 ^ var38)) {
                     var38 = mnfqkwlrtuumqdfi(var38, 1953298355);
                     break;
                  }

                  var38 = 538724528 ^ var38;
                  byte var32 = (byte)((this.toggleLatched) ? 1 : 0);
                  byte var35;
                  if (var32 == (526459880 ^ var38)) {
                     var38 = 1042104719 ^ var38;
                     var35 = (byte)(561799782 ^ var38);
                     var38 = 580985770 ^ var38;
                  } else {
                     label47:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                           case 214706928:
                              var38 ^= 1324828174;
                           case 896356776:
                              break label47;
                           case 926943997:
                              break;
                           case 1279528794:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }

                     var35 = (byte)(1368810982 ^ var38);
                     var38 = 1380656171 ^ var38;
                  }

                  this.toggleLatched = (var35 != 0);
                  byte var22 = (byte)((this.toggleLatched) ? 1 : 0);
                  if (var22 == (64831949 ^ var38)) {
                     var38 = 604733277 ^ var38;
                     Object var33 = null;
                     this.stickyTarget = (Entity)var33;
                     var38 = 1825022587 ^ var38;
                  } else {
                     var38 = mnfqkwlrtuumqdfi(var38, 1221385510);
                  }
                  break;
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                     case 76929503:
                        var38 = 1055602565 ^ var38;
                        break label80;
                     case 428788718:
                     default:
                        throw new RuntimeException(new IOException());
                     case 568266625:
                        break label80;
                     case 1512794557:
                  }
               }
            }

            var38 = mnfqkwlrtuumqdfi(var38, 272813918);
            this.attackWasDown = (boolean)var2;
            if (var2 == ((1010067207 ^ var38) != 0)) {
               var38 = 2010551836 ^ var38;
               if (var3 == ((1273164059 ^ var38) != 0)) {
                  var38 = 785685987 ^ var38;
                  Object var30 = null;
                  this.stickyTarget = (Entity)var30;
                  var38 = 1283542946 ^ var38;
               } else {
                  var38 = 1649791553 ^ var38;
               }

               return (((byte)(699867994 ^ var38)) != 0);
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
                  case 77970345:
                     var38 ^= 746056174;
                     return (((byte)(272862952 ^ var38)) != 0);
                  case 1270651125:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1593778970:
                     return (((byte)(272862952 ^ var38)) != 0);
                  case 1802143639:
               }
            }
         }

         this.attackWasDown = (boolean)var2;
         return this.toggleLatched;
      }
   }

   private void resetState() {
      int var9 = 718971976 ^ 738797826 ^ 1646384302;
      var9 = 635210736 ^ var9;
      Object var2 = null;
      this.stickyTarget = (Entity)var2;
      byte var5 = (byte)(1093587476 ^ var9);
      this.attackWasDown = (var5 != 0);
      byte var6 = (byte)(1093587476 ^ var9);
      this.toggleLatched = (var6 != 0);
   }

   private static float pullFactor(int var0, int var1, String var2, float var3, float var4) {
      int var91 = 2102603936 ^ 1107960558 ^ 1743590494;
      var91 = 433032096 ^ var91;
      float var16 = var0;
      float var6 = 10.0F;
      float var17 = var16 / var6;
      float var49 = 0.1F;
      float var7 = 1.0F;
      float var18 = Mth.clamp(var17, var49, var7);
      float var20 = var1;
      float var50 = 10.0F;
      float var21 = var20 / var50;
      float var51 = 0.0F;
      float var72 = 1.0F;
      float var22 = Mth.clamp(var21, var51, var72);
      float var23 = 0.1F;
      float var52 = 1.0F;
      float var24 = Mth.lerp(var23, var52, var18);
      if (var2 != null) {
         var91 = 1374241181 ^ var91;
         String var26 = tyioaddfjk(ylzcygreotdejso(), jmtinqrugqxzudc(), var91);
         byte var27 = (byte)((var26.equals(var2)) ? 1 : 0);
         if (var27 == (278055981 ^ var91)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var91)) {
                  case 1866501:
                     var91 ^= 135131540;
                  case 552919140:
                     String var30 = tyioaddfjk(usbkyeysohmirsm(), jmtinqrugqxzudc(), var91);
                     byte var31 = (byte)((var30.equals(var2)) ? 1 : 0);
                     if (var31 != (413089209 ^ var91)) {
                        var91 = 658105234 ^ var91;
                        float var61 = 1.0F;
                        float var62 = Math.max(var61, var4);
                        float var38 = var3 / var62;
                        float var63 = 0.0F;
                        float var80 = 1.0F;
                        float var39 = Mth.clamp(var38, var63, var80);
                        float var41 = var39 * var39;
                        float var65 = 3.0F;
                        float var81 = 2.0F;
                        float var82 = var81 * var39;
                        float var66 = var65 - var82;
                        float var42 = var41 * var66;
                        float var43 = 1.0F;
                        float var83 = 0.85F;
                        float var68 = var22 * var83;
                        float var44 = var43 - var68;
                        float var84 = 1.0F;
                        float var70 = Mth.lerp(var44, var84, var42);
                        float var46 = var24 * var70;
                        float var71 = 0.015F;
                        float var85 = 1.0F;
                        return Mth.clamp(var46, var71, var85);
                     }

                     var91 = mnfqkwlrtuumqdfi(var91, 1356863024);
                     float var56 = 1.0F;
                     float var8 = 0.88F;
                     float var76 = var22 * var8;
                     float var57 = var56 - var76;
                     float var33 = var24 * var57;
                     float var58 = 0.025F;
                     float var59 = var58 * var22;
                     float var34 = var33 + var59;
                     float var60 = 0.015F;
                     float var78 = 1.0F;
                     return Mth.clamp(var34, var60, var78);
                  case 347524260:
                  default:
                     throw new RuntimeException();
                  case 416906188:
               }
            }
         }

         var91 = 1718803756 ^ var91;
      } else {
         var91 = 932945073 ^ var91;
      }

      float var54 = 0.02F;
      float var74 = 1.0F;
      return Mth.clamp(var24, var54, var74);
   }

   private LivingEntity pickTarget(Minecraft var1, LocalPlayer var2, x var3) {
      int var135 = 1440121932 ^ 543665956 ^ 1646384302;
      var135 = 1295610381 ^ var135;
      double var27 = var3.aimAssistRange;
      double var31 = var27 * var27;
      double var13 = var31;
      byte var34 = (byte)((var3.aimAssistSticky) ? 1 : 0);
      if (var34 != (1521061323 ^ var135)) {
         var135 = 1600866170 ^ var135;
         Entity var36 = this.stickyTarget;
         byte var38 = (byte)((var36 instanceof LivingEntity) ? 1 : 0);
         if (var38 != (96651953 ^ var135)) {
            var135 = 268606160 ^ var135;
            LivingEntity var40 = (LivingEntity)var36;
            byte var42 = (byte)((var40.isAlive()) ? 1 : 0);
            if (var42 != (364925025 ^ var135)) {
               var135 = 1703790384 ^ var135;
               double var44 = var40.distanceToSqr(var2);
               double var152;
               int var46 = (var152 = var44 - var31) == 0.0 ? 0 : (var152 < 0.0 ? -1 : 1);
               if (var46 <= (1884133201 ^ var135)) {
                  var135 = 2036410951 ^ var135;
                  byte var48 = (byte)((passesFilters(var40, var2, var3)) ? 1 : 0);
                  if (var48 != (153926934 ^ var135)) {
                     var135 = 2037628446 ^ var135;
                     byte var50 = (byte)((var3.aimAssistWallCheck) ? 1 : 0);
                     if (var50 == (1885274888 ^ var135)) {
                        var135 = 213798872 ^ var135;
                        return var40;
                     }

                     var135 = 728254642 ^ var135;
                     byte var52 = (byte)((var2.hasLineOfSight(var40)) ? 1 : 0);
                     if (var52 != (1530350522 ^ var135)) {
                        var135 = 668338026 ^ var135;
                        return var40;
                     }

                     var135 = mnfqkwlrtuumqdfi(var135, 1438035867);
                  } else {
                     var135 = mnfqkwlrtuumqdfi(var135, 128801079);
                  }
               } else {
                  label130:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                        case 160834913:
                           var135 ^= 2127328112;
                           break label130;
                        case 386840474:
                        default:
                           throw new RuntimeException();
                        case 484610945:
                           break;
                        case 1298472523:
                           break label130;
                     }
                  }
               }
            } else {
               var135 = mnfqkwlrtuumqdfi(var135, 457290816);
            }
         } else {
            label138:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                  case 90610631:
                     var135 ^= 188952208;
                     break label138;
                  case 281104774:
                  default:
                     throw new RuntimeException();
                  case 783579927:
                     break;
                  case 1121146637:
                     break label138;
               }
            }
         }
      } else {
         var135 = 1411934698 ^ var135;
      }

      Object var54 = null;
      LivingEntity var131 = (LivingEntity)var54;
      double var55 = Double.MAX_VALUE;
      double var132 = var55;
      AABB var58 = var2.getBoundingBox();
      AABB var59 = var58.inflate(var27);
      ClientLevel var61 = var1.level;
      Predicate var8 = var0 -> {
         int var5 = 79081202 ^ 379740566 ^ 1743590494;
         var5 = 1526905033 ^ var5;
         return var0 instanceof LivingEntity;
      };
      List var62 = var61.getEntities(var2, var59, var8);
      Iterator var63 = var62.iterator();
      Iterator var18 = var63;
      var135 = 475202149 ^ var135;

      label123:
      while (true) {
         byte var65 = (byte)((var18.hasNext()) ? 1 : 0);
         if (var65 == (315811396 ^ var135)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                  case 40294613:
                     break;
                  case 75009265:
                     var135 = 560454553 ^ var135;
                     return var131;
                  case 1806505397:
                     return var131;
                  case 1966920356:
                  default:
                     throw new RuntimeException();
               }
            }
         }

         var135 = 407778782 ^ var135;
         Object var67 = var18.next();
         Entity var68 = (Entity)var67;
         byte var70 = (byte)((var68 instanceof LivingEntity) ? 1 : 0);
         if (var70 != (178049946 ^ var135)) {
            var135 = 1455279079 ^ var135;
            LivingEntity var72 = (LivingEntity)var68;
            byte var74 = (byte)((passesFilters(var72, var2, var3)) ? 1 : 0);
            if (var74 == (1545672829 ^ var135)) {
               var135 = 464957457 ^ var135;
               var135 = 1430605352 ^ var135;
            } else {
               label118:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                     case 41960275:
                        var135 ^= 592432984;
                        break label118;
                     case 304533313:
                     default:
                        throw new RuntimeException();
                     case 1244704814:
                        break label118;
                     case 1902926772:
                  }
               }

               double var76 = var72.distanceToSqr(var2);
               double var153;
               int var78 = (var153 = var76 - var13) == 0.0 ? 0 : (var153 < 0.0 ? -1 : 1);
               if (var78 > (2137970469 ^ var135)) {
                  var135 = 35098524 ^ var135;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                        case 38438007:
                           continue label123;
                        case 52127391:
                           var135 ^= 1873526525;
                           continue label123;
                        case 1540134341:
                        default:
                           throw new RuntimeException();
                        case 1835831126:
                     }
                  }
               } else {
                  label110:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                        case 115785657:
                           var135 ^= 560515638;
                           break label110;
                        case 301220700:
                        default:
                           throw new RuntimeException();
                        case 1501700957:
                           break label110;
                        case 1620915352:
                     }
                  }

                  byte var80 = (byte)((var3.aimAssistWallCheck) ? 1 : 0);
                  if (var80 != (1577458963 ^ var135)) {
                     var135 = 548832082 ^ var135;
                     byte var82 = (byte)((var2.hasLineOfSight(var72)) ? 1 : 0);
                     if (var82 == (2125504065 ^ var135)) {
                        var135 = 1869607478 ^ var135;
                        var135 = mnfqkwlrtuumqdfi(var135, 51218995);
                        continue;
                     }

                     var135 = mnfqkwlrtuumqdfi(var135, 554886758);
                  } else {
                     label102:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                           case 103515730:
                              var135 ^= 27551028;
                              break label102;
                           case 523628721:
                              break;
                           case 1226596959:
                              break label102;
                           case 1659307031:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  }

                  String var115 = var3.aimAssistTarget;
                  Vec3 var84 = aimPoint(var72, var115);
                  float var116 = 1.0F;
                  Vec3 var86 = var2.getEyePosition(var116);
                  float var117 = 1.0F;
                  Vec3 var88 = var2.getViewVector(var117);
                  Vec3 var90 = var84.subtract(var86);
                  Vec3 var91 = var90.normalize();
                  double var93 = var88.dot(var91);
                  double var127 = -1.0;
                  double var9 = 1.0;
                  double var95 = Mth.clamp(var93, var127, var9);
                  double var97 = Math.acos(var95);
                  double var154;
                  int var101 = (var154 = var97 - var132) == 0.0 ? 0 : (var154 < 0.0 ? -1 : 1);
                  if (var101 < (1604483111 ^ var135)) {
                     var135 = 1148739802 ^ var135;
                     var132 = var97;
                     var131 = var72;
                     var135 = 1861833667 ^ var135;
                  } else {
                     label94:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                           case 155883369:
                              var135 ^= 713110297;
                              break label94;
                           case 291596649:
                              break;
                           case 1150025912:
                           default:
                              throw new RuntimeException();
                           case 1932351128:
                              break label94;
                        }
                     }
                  }

                  var135 = mnfqkwlrtuumqdfi(var135, 1743891834);
               }
            }
         } else {
            var135 = 407778782 ^ var135;
         }
      }
   }

   private static boolean passesFilters(LivingEntity var0, LocalPlayer var1, x var2) {
      int var33 = 1778128738 ^ 158115726 ^ 1743590494;
      var33 = 1908316784 ^ var33;
      if (var0 != var1) {
         var33 = 1725442896 ^ var33;
         byte var8 = (byte)((var0 instanceof p) ? 1 : 0);
         if (var8 == (270210450 ^ var33)) {
            var33 = 2075346193 ^ var33;
            byte var10 = (byte)((var0.isAlive()) ? 1 : 0);
            if (var10 != (1806192771 ^ var33)) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                     case 9859157:
                        var33 ^= 1484646824;
                     case 178046501:
                        byte var12 = (byte)((var0.isInvisible()) ? 1 : 0);
                        if (var12 != (869644587 ^ var33)) {
                           var33 = 202495897 ^ var33;
                           byte var14 = (byte)((var2.aimAssistInvisibles) ? 1 : 0);
                           if (var14 == (1069838002 ^ var33)) {
                              var33 = 1496495163 ^ var33;
                              return (((byte)(1727453833 ^ var33)) != 0);
                           }

                           var33 = 1254273990 ^ var33;
                        } else {
                           var33 = 1188258911 ^ var33;
                        }

                        byte var16 = (byte)((var0 instanceof Player) ? 1 : 0);
                        if (var16 != (1963384180 ^ var33)) {
                           var33 = 1381132375 ^ var33;
                           return var2.aimAssistPlayers;
                        }

                        label43:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                              case 45955094:
                                 var33 ^= 81514671;
                                 break label43;
                              case 63616182:
                                 break;
                              case 947473340:
                                 break label43;
                              case 1057490225:
                              default:
                                 throw new IllegalStateException();
                           }
                        }

                        EntityType var18 = var0.getType();
                        MobCategory var20 = var18.getCategory();
                        MobCategory var30 = MobCategory.MONSTER;
                        if (var20 == var30) {
                           var33 = 1113422340 ^ var33;
                           return var2.aimAssistHostiles;
                        }

                        var33 = mnfqkwlrtuumqdfi(var33, 992839716);
                        return var2.aimAssistPassive;
                     case 1998423346:
                     default:
                        throw new IllegalStateException();
                     case 2114423122:
                  }
               }
            }

            var33 = 1892723066 ^ var33;
         } else {
            var33 = mnfqkwlrtuumqdfi(var33, 191097963);
         }
      } else {
         var33 = mnfqkwlrtuumqdfi(var33, 1841022779);
      }

      return (((byte)(460913145 ^ var33)) != 0);
   }

   private static Vec3 aimPoint(LivingEntity var0, String var1) {
      int var48 = 2082290388 ^ 33604897 ^ 1743590494;
      var48 = 253245782 ^ var48;
      String var2 = tyioaddfjk(nevskjlnnbrefzi(), jmtinqrugqxzudc(), var48);
      byte var7 = (byte)((var2.equals(var1)) ? 1 : 0);
      if (var7 != (384357117 ^ var48)) {
         var48 = 783483575 ^ var48;
         Vec3 var9 = var0.position();
         double var19 = 0.0;
         float var26 = var0.getBbHeight();
         double var27 = var26;
         double var5 = 0.9;
         double var29 = var27 * var5;
         double var39 = 0.0;
         return var9.add(var19, var29, var39);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var48)) {
               case 207818274:
                  var48 ^= 1490215040;
               case 1588631184:
                  String var11 = tyioaddfjk(uwkwghevhpdandu(), jmtinqrugqxzudc(), var48);
                  byte var12 = (byte)((var11.equals(var1)) ? 1 : 0);
                  if (var12 != (1312436861 ^ var48)) {
                     var48 = 1396197457 ^ var48;
                     Vec3 var14 = var0.position();
                     double var22 = 0.0;
                     double var31 = 0.1;
                     double var41 = 0.0;
                     return var14.add(var22, var31, var41);
                  }

                  label26:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var48)) {
                        case 126914536:
                           var48 = 118241881 ^ var48;
                        case 409100072:
                           break label26;
                        case 2075699866:
                        default:
                           throw new RuntimeException();
                        case 2082226288:
                     }
                  }

                  Vec3 var17 = var0.position();
                  double var24 = 0.0;
                  float var34 = var0.getBbHeight();
                  double var35 = var34;
                  double var43 = 0.55;
                  double var37 = var35 * var43;
                  double var45 = 0.0;
                  return var17.add(var24, var37, var45);
               case 671324749:
               default:
                  throw new RuntimeException();
               case 1807623062:
            }
         }
      }
   }

   static {
      int var6 = 943382330 ^ 83181940 ^ Integer.parseInt("842202892");
      int var3 = new Random(-3461733103665653943L).nextInt();
      g0oYWnEViu = 1205828639 ^ var3;
      var6 = 1771137848 ^ var6;
      a var0 = new a();
      INSTANCE = var0;
   }

   public static String tyioaddfjk(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] jmtinqrugqxzudc() {
      return new byte[]{
         63,
         79,
         49,
         54,
         41,
         38,
         43,
         96,
         110,
         51,
         116,
         62,
         78,
         58,
         41,
         53,
         52,
         10,
         76,
         120,
         83,
         109,
         14,
         53,
         38,
         67,
         16,
         68,
         62,
         49,
         80,
         86,
         27,
         4,
         27,
         31,
         64,
         60,
         53,
         107,
         112,
         35,
         77,
         52,
         30,
         8,
         63,
         62,
         89,
         105,
         25,
         86,
         94,
         34,
         40,
         28,
         98,
         46,
         93
      };
   }

   private static byte[] ylzcygreotdejso() {
      return new byte[]{-13, -121, 9, 73, 28, 117, 18, 62};
   }

   private static byte[] usbkyeysohmirsm() {
      return new byte[]{-11, -127, 2, 67, 17, 126, 25, 35, 87, 98};
   }

   private static byte[] nevskjlnnbrefzi() {
      return new byte[]{-14, -120, 5, 77, 28, 116, 26, 48, 89, 100};
   }

   private static byte[] uwkwghevhpdandu() {
      return new byte[]{-16, -125, 0, 66, 29, 112, 29, 61, 88, 118};
   }

   private static byte[] mrhpfowbvrmzdff() {
      return new byte[]{-10, -124, 4, 91, 30, 122, 19, 51, 87, 99, 64, 103, 119, 104};
   }

   private static byte[] ncmryhfesmhxebz() {
      return new byte[]{-16, -125, 0, 64, 16, 114, 26, 32, 86, 99, 69, 116, 127, 126};
   }

   private static int mnfqkwlrtuumqdfi(int var0, int var1) {
      return var1 ^ var0;
   }
}
