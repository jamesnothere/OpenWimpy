package com.wimpyclient.k;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.PlayerFaceRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.server.Services;
import net.minecraft.server.players.ProfileResolver;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.PlayerSkin;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class y {
   private static final float LIFE_MS = 2200.0F;
   private static final float FADE_IN_MS = 280.0F;
   private static final float FADE_OUT_MS = 450.0F;
   private static final int FACE = 56;
   private static final int PANEL_PAD = 10;
   private static final int TITLE_COLOR = -43691;
   private static final int NAME_COLOR = -5912;
   private static final int MUTED = -4144952;
   private static final int PANEL = -536212978;
   private static final int EDGE = -1996532395;
   private static UUID watcherId;
   private static String watcherName;
   private static int distanceM;
   private static long startMs;
   private static boolean active;
   private static boolean titlePushed;
   private static Supplier<PlayerSkin> skinLookup;
   private static final AtomicReference<String> resolvingName;
   private static int IlC3Zq2Sc4;
   private transient int tBhcILYJrn;
   private static byte[] oivebaioor = wkzfpmdamcdqksk();

   private y() {
super();
      int var4 = 392217945 ^ 1551570487;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 25535166:
               var4 = 270769187 ^ var4;
            case 647822125:
               var4 = 1296225960 ^ 1156844556 ^ Integer.parseInt("1385076201");
               this.tBhcILYJrn = 1277797961 ^ IlC3Zq2Sc4;
               var4 = 923953100 ^ var4;
               return;
            case 353595605:
               break;
            case 2011802905:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public static void show(UUID var0, String var1, int var2) {
      int var47 = 365198394 ^ 1391097155 ^ 840412809;
      var47 = 1405853767 ^ var47;
      if (var1 != null) {
         var47 = 190862343 ^ var47;
         byte var10 = (byte)((var1.isBlank()) ? 1 : 0);
         if (var10 == (764564400 ^ var47)) {
            var47 = pvfniaspuglczjhc(var47, 570159803);
            Minecraft var11 = Minecraft.getInstance();
            ClientLevel var13 = var11.level;
            if (var13 == null) {
               var47 = 1585815886 ^ var47;
               return;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var47)) {
                  case 111107580:
                  default:
                     throw new RuntimeException(new IOException());
                  case 135046252:
                     var47 ^= 323761599;
                  case 1242783840:
                     watcherId = var0;
                     String var16 = var1.trim();
                     watcherName = var16;
                     byte var17 = (byte)(522556596 ^ var47);
                     int var18 = Math.max(var17, var2);
                     distanceM = var18;
                     long var19 = System.currentTimeMillis();
                     startMs = var19;
                     byte var21 = (byte)(522556597 ^ var47);
                     active = (var21 != 0);
                     byte var22 = (byte)(522556596 ^ var47);
                     titlePushed = (var22 != 0);
                     Object var23 = null;
                     skinLookup = (Supplier<PlayerSkin>)var23;
                     AtomicReference var24 = resolvingName;
                     String var36 = watcherName;
                     var24.set(var36);
                     String var5 = watcherName;
                     resolveSkin(var11, var0, var5);
                     Gui var27 = var11.gui;
                     byte var38 = (byte)(522556606 ^ var47);
                     byte var44 = (byte)(522556572 ^ var47);
                     byte var6 = (byte)(522556603 ^ var47);
                     var27.setTimes(var38, var44, var6);
                     Gui var29 = var11.gui;
                     String var39 = kpzwmwdpmt(oknblepumemqace(), var47);
                     MutableComponent var40 = Component.literal(var39);
                     var29.setTitle(var40);
                     int var30 = distanceM;
                     String var35;
                     if (var30 > (522556596 ^ var47)) {
                        var47 = 688698287 ^ var47;
                        String var31 = watcherName;
                        int var41 = distanceM;
                        var35 = var31 + " \u00b7 " + var41 + "m";
                        var47 = 1161980092 ^ var47;
                     } else {
                        var47 = pvfniaspuglczjhc(var47, 1110776052);
                        var35 = watcherName;
                        var47 = 779863015 ^ var47;
                     }

                     Gui var33 = var11.gui;
                     MutableComponent var43 = Component.literal(var35);
                     var33.setSubtitle(var43);
                     byte var34 = (byte)(1936412582 ^ var47);
                     titlePushed = (var34 != 0);
                     return;
                  case 679861740:
               }
            }
         }

         var47 = 2028061454 ^ var47;
      } else {
         var47 = 1937872649 ^ var47;
      }
   }

   public static void reset() {
      int var10 = 1089280504 ^ 76619888 ^ 840412809;
      var10 = 948179798 ^ var10;
      byte var0 = (byte)(1324319831 ^ var10);
      active = (var0 != 0);
      Object var2 = null;
      watcherId = (UUID)var2;
      String var3 = kpzwmwdpmt(qewndcfbprvxfjl(), var10);
      watcherName = var3;
      byte var4 = (byte)(1324319831 ^ var10);
      distanceM = var4;
      Object var5 = null;
      skinLookup = (Supplier<PlayerSkin>)var5;
      byte var6 = (byte)(1324319831 ^ var10);
      titlePushed = (var6 != 0);
      AtomicReference var7 = resolvingName;
      String var1 = kpzwmwdpmt(hdkewenrfjlbjjx(), var10);
      var7.set(var1);
   }

   public static boolean isActive() {
      int var3 = 1924094543 ^ 401383035 ^ 840412809;
      var3 = 1910541487 ^ var3;
      return active;
   }

   public static void render(GuiGraphics var0) {
      int var266 = 454224147 ^ 1760067303 ^ 840412809;
      var266 = 1629347156 ^ var266;
      byte var1 = (byte)((active) ? 1 : 0);
      if (var1 == (552657961 ^ var266)) {
         var266 = 396688486 ^ var266;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var266)) {
               case 265460479:
                  var266 ^= 2146483609;
               case 1195579018:
                  long var26 = System.currentTimeMillis();
                  long var3 = startMs;
                  long var28 = var26 - var3;
                  float var32 = (float)var28;
                  float var2 = 2200.0F;
                  float var283;
                  int var33 = (var283 = var32 - var2) == 0.0F ? 0 : (var283 < 0.0F ? -1 : 1);
                  if (var33 >= (1593858480 ^ var266)) {
                     var266 = 129716894 ^ var266;
                     reset();
                     return;
                  }

                  label69:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var266)) {
                        case 129092144:
                        default:
                           throw new RuntimeException();
                        case 135328453:
                           var266 ^= 1706190344;
                        case 2013488159:
                           break label69;
                        case 2024758592:
                     }
                  }

                  float var36 = (float)var28;
                  float var110 = 280.0F;
                  float var284;
                  int var37 = (var284 = var36 - var110) == 0.0F ? 0 : (var284 < 0.0F ? -1 : 1);
                  float var261;
                  if (var37 < (984760248 ^ var266)) {
                     var266 = 1479099249 ^ var266;
                     float var40 = (float)var28;
                     float var111 = 280.0F;
                     float var41 = var40 / var111;
                     var261 = var41;
                     var266 = 1202292264 ^ var266;
                  } else {
                     var266 = pvfniaspuglczjhc(var266, 1612808138);
                     float var104 = (float)var28;
                     float var164 = 1750.0F;
                     float var285;
                     int var105 = (var285 = var104 - var164) == 0.0F ? 0 : (var285 < 0.0F ? -1 : 1);
                     if (var105 > (1519599730 ^ var266)) {
                        var266 = 1064172692 ^ var266;
                        float var106 = 2200.0F;
                        float var167 = (float)var28;
                        float var107 = var106 - var167;
                        float var168 = 450.0F;
                        float var108 = var107 / var168;
                        var261 = var108;

                        label59:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var266)) {
                              case 94234627:
                                 var266 ^= 1087129095;
                                 break label59;
                              case 484061255:
                                 break;
                              case 1172398311:
                                 break label59;
                              case 1827177187:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     } else {
                        var266 = 841466390 ^ var266;
                        float var109 = 1.0F;
                        var261 = var109;
                        var266 = 1300658309 ^ var266;
                     }
                  }

                  float var112 = 0.0F;
                  float var169 = 1.0F;
                  float var43 = Mth.clamp(var261, var112, var169);
                  float var113 = 0.02F;
                  float var286;
                  int var45 = (var286 = var43 - var113) == 0.0F ? 0 : (var286 < 0.0F ? -1 : 1);
                  if (var45 <= (624098017 ^ var266)) {
                     var266 = 43095203 ^ var266;
                     return;
                  }

                  label51:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var266)) {
                        case 135455521:
                           var266 ^= 1983202326;
                           break label51;
                        case 904648000:
                        default:
                           throw new RuntimeException();
                        case 1019460800:
                           break label51;
                        case 1080386482:
                     }
                  }

                  Minecraft var46 = Minecraft.getInstance();
                  Font var48 = var46.font;
                  int var50 = var0.guiWidth();
                  float var114 = 255.0F;
                  float var52 = var43 * var114;
                  int var53 = Math.round(var52);
                  byte var115 = (byte)(1393016559 ^ var266);
                  int var54 = var53 << var115;
                  String var55 = kpzwmwdpmt(roxpkuwicpprqin(), var266);
                  String var56 = watcherName;
                  int var57 = distanceM;
                  String var101;
                  if (var57 > (1393016567 ^ var266)) {
                     var266 = 565762139 ^ var266;
                     int var58 = distanceM;
                     var101 = var58 + "m nearby";
                     var266 = pvfniaspuglczjhc(var266, 1435283025);
                  } else {
                     var266 = 1437035900 ^ var266;
                     var101 = kpzwmwdpmt(qpwavlwuulaszmc(), var266);
                     var266 = 563288950 ^ var266;
                  }

                  int var60 = var48.width(var55);
                  int var118 = var48.width(var56);
                  int var172 = var48.width(var101);
                  int var119 = Math.max(var118, var172);
                  int var61 = Math.max(var60, var119);
                  byte var62 = (byte)(657705137 ^ var266);
                  byte var173 = (byte)(657705193 ^ var266);
                  int var121 = var61 + var173;
                  int var63 = Math.max(var62, var121);
                  byte var64 = (byte)(657705141 ^ var266);
                  Object var123 = Objects.requireNonNull(var48);
                  byte var124 = (byte)(657705204 ^ var266);
                  int var65 = var64 + var124;
                  byte var125 = (byte)(657705215 ^ var266);
                  int var66 = var65 + var125;
                  Object var127 = Objects.requireNonNull(var48);
                  byte var128 = (byte)(657705204 ^ var266);
                  int var67 = var66 + var128;
                  byte var129 = (byte)(657705215 ^ var266);
                  int var68 = var67 + var129;
                  Object var131 = Objects.requireNonNull(var48);
                  byte var132 = (byte)(657705204 ^ var266);
                  int var69 = var68 + var132;
                  byte var133 = (byte)(657705207 ^ var266);
                  int var70 = var69 + var133;
                  int var72 = var50 - var63;
                  byte var135 = (byte)(657705215 ^ var266);
                  int var73 = var72 / var135;
                  byte var74 = (byte)(657705201 ^ var266);
                  int var137 = var0.guiHeight();
                  byte var174 = (byte)(657705210 ^ var266);
                  int var138 = var137 / var174;
                  int var75 = Math.max(var74, var138);
                  int var195 = var73 + var63;
                  int var214 = var75 + var70;
                  int var233 = 658096883 ^ var266;
                  int var234 = var233 | var54;
                  var0.fill(var73, var75, var195, var214, var234);
                  int var197 = var73 + var63;
                  byte var235 = (byte)(657705212 ^ var266);
                  int var217 = var75 + var235;
                  int var236 = 667721128 ^ var266;
                  int var237 = var236 | var54;
                  var0.fill(var73, var75, var197, var217, var237);
                  int var178 = var75 + var70;
                  byte var199 = (byte)(657705212 ^ var266);
                  int var179 = var178 - var199;
                  int var201 = var73 + var63;
                  int var220 = var75 + var70;
                  int var239 = 667721128 ^ var266;
                  int var240 = var239 | var54;
                  var0.fill(var73, var179, var201, var220, var240);
                  byte var221 = (byte)(657705212 ^ var266);
                  int var203 = var73 + var221;
                  int var223 = var75 + var70;
                  int var242 = 667721128 ^ var266;
                  int var243 = var242 | var54;
                  var0.fill(var73, var75, var203, var223, var243);
                  int var144 = var73 + var63;
                  byte var182 = (byte)(657705212 ^ var266);
                  int var145 = var144 - var182;
                  int var205 = var73 + var63;
                  int var226 = var75 + var70;
                  int var245 = 667721128 ^ var266;
                  int var246 = var245 | var54;
                  var0.fill(var145, var75, var205, var226, var246);
                  byte var184 = (byte)(657705157 ^ var266);
                  int var147 = var63 - var184;
                  byte var185 = (byte)(657705215 ^ var266);
                  int var148 = var147 / var185;
                  int var82 = var73 + var148;
                  byte var149 = (byte)(657705207 ^ var266);
                  int var84 = var75 + var149;
                  drawFace(var0, var46, var82, var84);
                  byte var151 = (byte)(657705157 ^ var266);
                  int var87 = var84 + var151;
                  byte var152 = (byte)(657705211 ^ var266);
                  int var88 = var87 + var152;
                  byte var227 = (byte)(657705215 ^ var266);
                  int var208 = var50 / var227;
                  int var247 = 667721128 ^ var266;
                  int var248 = var247 | var54;
                  drawCentered(var0, var48, var55, var208, var88, var248);
                  Object var155 = Objects.requireNonNull(var48);
                  byte var156 = (byte)(657705204 ^ var266);
                  byte var188 = (byte)(657705215 ^ var266);
                  int var157 = var156 + var188;
                  int var91 = var88 + var157;
                  byte var229 = (byte)(657705215 ^ var266);
                  int var210 = var50 / var229;
                  int var249 = 667688981 ^ var266;
                  int var250 = var249 | var54;
                  drawCentered(var0, var48, var56, var210, var91, var250);
                  Object var160 = Objects.requireNonNull(var48);
                  byte var161 = (byte)(657705204 ^ var266);
                  byte var190 = (byte)(657705215 ^ var266);
                  int var162 = var161 + var190;
                  int var94 = var91 + var162;
                  byte var231 = (byte)(657705215 ^ var266);
                  int var212 = var50 / var231;
                  int var251 = 670238773 ^ var266;
                  int var252 = var251 | var54;
                  drawCentered(var0, var48, var101, var212, var94, var252);
                  byte var96 = (byte)((titlePushed) ? 1 : 0);
                  if (var96 != (657705213 ^ var266)) {
                     var266 = 460684059 ^ var266;
                     long var192 = 1600L;
                     long var287;
                     int var99 = (var287 = var28 - var192) == 0L ? 0 : (var287 < 0L ? -1 : 1);
                     if (var99 > (1011266534 ^ var266)) {
                        var266 = 1407667651 ^ var266;
                        byte var100 = (byte)(1872887333 ^ var266);
                        titlePushed = (var100 != 0);
                        var266 = 1474613917 ^ var266;
                     } else {
                        var266 = 67346270 ^ var266;
                     }
                  } else {
                     var266 = 527885381 ^ var266;
                  }

                  return;
               case 467273062:
                  break;
               case 1024439295:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private static void drawCentered(GuiGraphics var0, Font var1, String var2, int var3, int var4, int var5) {
      int var21 = 1936532270 ^ 803837028 ^ 840412809;
      var21 = 1224703792 ^ var21;
      int var14 = var1.width(var2);
      byte var17 = (byte)(644638449 ^ var21);
      int var15 = var14 / var17;
      int var13 = var3 - var15;
      byte var12 = (byte)(644638450 ^ var21);
      var0.drawString(var1, var2, var13, var4, var5, (var12 != 0));
   }

   private static void drawFace(GuiGraphics var0, Minecraft var1, int var2, int var3) {
      int var50 = 1029608598 ^ 519247594 ^ 840412809;
      var50 = 1034539893 ^ var50;
      PlayerSkin var13 = resolveCurrentSkin(var1);
      if (var13 != null) {
         var50 = 1702696853 ^ var50;
         byte var8 = (byte)(1232005165 ^ var50);
         PlayerFaceRenderer.draw(var0, var13, var2, var3, var8);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var50)) {
               case 90608411:
                  var50 ^= 607800846;
               case 214706854:
                  byte var36 = (byte)(136950198 ^ var50);
                  int var32 = var2 + var36;
                  byte var9 = (byte)(136950198 ^ var50);
                  int var38 = var3 + var9;
                  int var44 = -150758492 ^ var50;
                  var0.fill(var2, var3, var32, var38, var44);
                  String var17 = watcherName;
                  byte var18 = (byte)((var17.isEmpty()) ? 1 : 0);
                  String var22;
                  if (var18 != (136950158 ^ var50)) {
                     var50 = 395360942 ^ var50;
                     var22 = kpzwmwdpmt(cxvsrnygxmxifmw(), var50);
                     var50 = pvfniaspuglczjhc(var50, 1078659525);
                  } else {
                     var50 = 588891339 ^ var50;
                     String var19 = watcherName;
                     byte var24 = (byte)(724596037 ^ var50);
                     byte var29 = (byte)(724596036 ^ var50);
                     String var20 = var19.substring(var24, var29);
                     Locale var25 = Locale.ROOT;
                     var22 = var20.toUpperCase(var25);
                     var50 = 1958901664 ^ var50;
                  }

                  Font var27 = var1.font;
                  byte var39 = (byte)(1609695993 ^ var50);
                  int var34 = var2 + var39;
                  byte var40 = (byte)(1609695974 ^ var50);
                  int var35 = var34 - var40;
                  byte var45 = (byte)(1609695993 ^ var50);
                  int var42 = var3 + var45;
                  byte var46 = (byte)(1609695969 ^ var50);
                  int var43 = var42 - var46;
                  int var47 = -1604802481 ^ var50;
                  byte var10 = (byte)(1609695973 ^ var50);
                  var0.drawString(var27, var22, var35, var43, var47, (var10 != 0));
                  return;
               case 242481303:
                  break;
               case 338209290:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private static PlayerSkin resolveCurrentSkin(Minecraft var0) {
      int var37 = 1248471150 ^ 1853957461 ^ 840412809;
      var37 = 1968001427 ^ var37;
      PlayerSkin var1 = com.wimpyclient.i.z.getForcedSkin();
      if (var1 != null) {
         var37 = 643416879 ^ var37;
         return var1;
      } else {
         var37 = pvfniaspuglczjhc(var37, 2059795806);
         Supplier var7 = skinLookup;
         if (var7 != null) {
            var37 = 873778639 ^ var37;
            Supplier var8 = skinLookup;
            Object var9 = var8.get();
            PlayerSkin var10 = (PlayerSkin)var9;
            if (var10 != null) {
               var37 = 1838894122 ^ var37;
               return var10;
            }

            var37 = 1714063937 ^ var37;
         } else {
            var37 = pvfniaspuglczjhc(var37, 1379813262);
         }

         ClientPacketListener var13 = var0.getConnection();
         if (var13 != null) {
            var37 = 2089778182 ^ var37;
            Object var15 = null;
            PlayerInfo var5 = (PlayerInfo)var15;
            UUID var16 = watcherId;
            if (var16 != null) {
               var37 = 2111070139 ^ var37;
               UUID var2 = watcherId;
               PlayerInfo var18 = var13.getPlayerInfo(var2);
               var5 = var18;
               var37 = 158926227 ^ var37;
            } else {
               var37 = pvfniaspuglczjhc(var37, 1957517864);
            }

            if (var5 == null) {
               var37 = 1586911154 ^ var37;
               String var33 = watcherName;
               PlayerInfo var21 = var13.getPlayerInfoIgnoreCase(var33);
               var5 = var21;
               var37 = 850298904 ^ var37;
            } else {
               label47:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                     case 43652536:
                        var37 ^= 1815666602;
                     case 637568092:
                        break label47;
                     case 1126194643:
                     default:
                        throw new IllegalStateException();
                     case 2005741764:
                  }
               }
            }

            if (var5 != null) {
               var37 = 1735015493 ^ var37;
               PlayerSkin var24 = var5.getSkin();
               if (var24 != null) {
                  var37 = 1462580751 ^ var37;
                  return var5.getSkin();
               }

               var37 = pvfniaspuglczjhc(var37, 466931701);
            } else {
               var37 = 2092889008 ^ var37;
            }
         } else {
            var37 = 413403700 ^ var37;
         }

         UUID var27 = watcherId;
         if (var27 != null) {
            var37 = 419886570 ^ var37;
            UUID var29 = watcherId;
            return DefaultPlayerSkin.get(var29);
         } else {
            var37 = pvfniaspuglczjhc(var37, 484141668);
            return DefaultPlayerSkin.getDefaultSkin();
         }
      }
   }

   private static void resolveSkin(Minecraft var0, UUID var1, String var2) {
      int var38 = 1907664683 ^ 33714110 ^ 840412809;
      var38 = 1459445817 ^ var38;
      ClientPacketListener var9 = var0.getConnection();
      if (var9 != null) {
         var38 = 2018707351 ^ var38;
         PlayerInfo var12;
         if (var1 != null) {
            var38 = 140502902 ^ var38;
            var12 = var9.getPlayerInfo(var1);
            var38 = pvfniaspuglczjhc(var38, 1303168083);
         } else {
            var38 = 1954908472 ^ var38;
            var12 = null;
            var38 = 829860381 ^ var38;
         }

         PlayerInfo var7 = var12;
         if (var12 == null) {
            var38 = 13891027 ^ var38;
            PlayerInfo var15 = var9.getPlayerInfoIgnoreCase(var2);
            var7 = var15;
            var38 = 1679109827 ^ var38;
         } else {
            var38 = 1690753808 ^ var38;
         }

         if (var7 != null) {
            var38 = 425830263 ^ var38;
            PlayerSkin var18 = var7.getSkin();
            if (var18 != null) {
               var38 = 1342039182 ^ var38;
               PlayerSkin var20 = var7.getSkin();
               Supplier var22 = () -> {
                  int var4 = 1435583418 ^ 970664119 ^ 840412809;
                  var4 = 984720602 ^ var4;
                  return var20;
               };
               skinLookup = var22;
               return;
            }

            var38 = pvfniaspuglczjhc(var38, 277043236);
         } else {
            var38 = 165871443 ^ var38;
         }
      } else {
         var38 = 1350828273 ^ var38;
      }

      if (var1 != null) {
         var38 = 1161516819 ^ var38;
         Supplier var25 = () -> {
            int var5 = 203213469 ^ 114576828 ^ 840412809;
            var5 = 51882761 ^ var5;
            return DefaultPlayerSkin.get(var1);
         };
         skinLookup = var25;
         var38 = pvfniaspuglczjhc(var38, 164968149);
      } else {
         label38:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
               case 100838908:
                  break;
               case 187878114:
                  var38 ^= 617037469;
               case 1064371340:
                  Supplier var30 = DefaultPlayerSkin::getDefaultSkin;
                  skinLookup = var30;
                  var38 = 1747541851 ^ var38;
                  break label38;
               case 196483109:
               default:
                  throw new RuntimeException();
            }
         }
      }

      Supplier var27 = () -> {
         int var12x = 1475124691 ^ 2076056148 ^ 840412809;
         var12x = 1288467083 ^ var12x;

         try {
            Services var5 = var0.services();
            ProfileResolver var6 = var5.profileResolver();
            Optional var7x = var6.fetchByName(var2);
            var12x ^= 1695276604;
            return var7x;
         } catch (Exception var13) {
            switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var12x)) {
               case -1807033302:
                  var12x = 666543866 ^ var12x;
                  return Optional.empty();
               default:
                  throw new RuntimeException(new IllegalAccessException("Error in hash"));
            }
         }
      };
      CompletableFuture var28 = CompletableFuture.supplyAsync(var27);
      Consumer var34 = var2x -> {
         int var10 = 1602163231 ^ 1505372538 ^ 840412809;
         var10 = 753268399 ^ var10;
         Runnable var7x = () -> {
            int var8 = 424944540 ^ 2077326864 ^ 840412809;
            var8 = 409144334 ^ var8;
            applyProfile(var0, var2, (Optional<GameProfile>)var2x);
         };
         var0.execute(var7x);
      };
      CompletableFuture var29 = var28.thenAccept(var34);
   }

   private static void applyProfile(Minecraft var0, String var1, Optional<GameProfile> var2) {
      int var21 = 937222565 ^ 1652025137 ^ 840412809;
      var21 = 1359311599 ^ var21;
      AtomicReference var4 = resolvingName;
      Object var15 = var4.get();
      byte var7 = (byte)((var1.equals(var15)) ? 1 : 0);
      if (var7 != (918149874 ^ var21)) {
         var21 = 1853142537 ^ var21;
         byte var8 = (byte)((active) ? 1 : 0);
         if (var8 != (1489857787 ^ var21)) {
            var21 = 838605142 ^ var21;
            byte var10 = (byte)((var2.isEmpty()) ? 1 : 0);
            if (var10 == (1764849069 ^ var21)) {
               var21 = 1065273593 ^ var21;

               try {
                  SkinManager var12 = var0.getSkinManager();
                  Object var17 = var2.get();
                  GameProfile var18 = (GameProfile)var17;
                  byte var5 = (byte)(1448066388 ^ var21);
                  Supplier var13 = var12.createLookup(var18, (var5 != 0));
                  skinLookup = var13;
                  var21 ^= 134204930;
               } catch (Exception var22) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var21)) {
                     case -1300370782:
                        var21 = pvfniaspuglczjhc(var21, 1807496219);
                        var21 = 687869550 ^ var21;
                        return;
                     default:
                        throw new RuntimeException("Error in hash");
                  }
               }

               var21 = pvfniaspuglczjhc(var21, 1162081399);
               return;
            }

            var21 = 872956430 ^ var21;
         } else {
            var21 = 99900248 ^ var21;
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var21)) {
               case 168308365:
                  var21 = 1803611473 ^ var21;
                  return;
               case 630538020:
                  return;
               case 1570280117:
                  break;
               case 1682514998:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   static {
      int var8 = 832014336 ^ 7652542 ^ Integer.parseInt("1385076201");
      int var5 = new Random(7293250542480102258L).nextInt();
      IlC3Zq2Sc4 = -1258945733 ^ var5;
      var8 = 1646549838 ^ var8;
      String var0 = kpzwmwdpmt(esnifmuqbuugsxf(), var8);
      watcherName = var0;
      String var1 = kpzwmwdpmt(rakiobyimxnymnb(), var8);
      AtomicReference var2 = new AtomicReference<>(var1);
      resolvingName = var2;
   }

   public static String kpzwmwdpmt(byte[] var0, int var1) {
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
         byte[] var28 = oivebaioor;
         byte[] var34 = oivebaioor;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] wkzfpmdamcdqksk() {
      return new byte[]{
         51,
         63,
         3,
         15,
         5,
         104,
         84,
         8,
         29,
         44,
         91,
         29,
         47,
         53,
         29,
         12,
         9,
         1,
         123,
         104,
         68,
         39,
         24,
         52,
         114,
         112,
         93,
         87,
         105,
         50,
         124,
         99,
         77,
         25,
         11,
         13,
         112,
         30,
         86,
         8,
         77,
         100,
         44,
         65,
         79,
         40,
         32,
         113,
         114,
         100,
         30,
         4,
         86,
         87,
         95,
         108,
         75,
         94,
         37,
         26,
         28,
         82,
         17,
         59,
         78,
         118,
         72,
         112,
         86,
         83,
         65,
         28,
         87,
         58,
         17,
         68,
         83,
         68
      };
   }

   private static byte[] esnifmuqbuugsxf() {
      return new byte[0];
   }

   private static byte[] rakiobyimxnymnb() {
      return new byte[0];
   }

   private static byte[] oknblepumemqace() {
      return new byte[]{-8, -14, 49, 109, 48, 31, 97, 101, 43, 90, 105, 103, 26, 73, 43, 119, 48, 112, 78, 122, 118, 75, 45, 77, 71, 28};
   }

   private static byte[] qewndcfbprvxfjl() {
      return new byte[0];
   }

   private static byte[] hdkewenrfjlbjjx() {
      return new byte[0];
   }

   private static byte[] qpwavlwuulaszmc() {
      return new byte[]{-4, -15, 50, 83, 53, 62, 102, 88, 44, 111, 106, 78, 29, 124};
   }

   private static byte[] roxpkuwicpprqin() {
      return new byte[]{-4, -13, 58, 107, 53, 24, 98, 105, 43, 88, 106, 102, 22, 79, 45, 115, 63, 115, 77, 127, 117, 77, 33, 72, 66, 20};
   }

   private static byte[] cxvsrnygxmxifmw() {
      return new byte[]{-8, -13, 49, 2};
   }

   private static int pvfniaspuglczjhc(int var0, int var1) {
      return var1 ^ var0;
   }
}
