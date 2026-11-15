package com.wimpyclient.a;

import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.UserApiService.UserProperties;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.wimpyclient.g.g;
import com.wimpyclient.mixin.ag;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.client.User;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.ProfileKeyPairManager;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.server.Services;
import org.slf4j.Logger;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class d {
   private static int bOBaWyE67M;
   private transient int dsr9CzX0wm;

   private d() {
super();
      int var4 = 1793054691 ^ 1580755161;
      
      var4 = 560282693 ^ var4;
      var4 = 66591386 ^ 877524361 ^ Integer.parseInt("574057580");
      this.dsr9CzX0wm = 678621075 ^ bOBaWyE67M;
      var4 = wlulfxkswusfxydd(var4, 122083207);
   }

   public static void apply(c$b var0) {
      int var13 = 2093187779 ^ 2085723449 ^ 1713364690;
      var13 = 1153509799 ^ var13;
      Minecraft var1 = Minecraft.getInstance();
      byte var6 = (byte)((var1.isSameThread()) ? 1 : 0);
      if (var6 != (575465615 ^ var13)) {
         var13 = 1207105251 ^ var13;
         applyNow(var1, var0);
         var13 = 1053864365 ^ var13;
      } else {
         var13 = 1192277063 ^ var13;
         Runnable var10 = () -> {
            int var6x = 1553970567 ^ 557296573 ^ 1713364690;
            var6x = 2066021944 ^ var6x;
            applyNow(var1, var0);
         };
         var1.execute(var10);
         var13 = 1043526409 ^ var13;
      }
   }

   public static String currentUsername() {
      int var14 = 542597463 ^ 877640318 ^ 1713364690;
      var14 = 530289566 ^ var14;
      Minecraft var0 = Minecraft.getInstance();
      if (var0 != null) {
         var14 = 2118276918 ^ var14;
         User var5 = var0.getUser();
         if (var5 != null) {
            var14 = 343735517 ^ var14;
            User var7 = var0.getUser();
            String var8 = var7.getName();
            if (var8 == null) {
               var14 = 295117292 ^ var14;
               String var11 = gwjwkqqizr(poadzujcwilpcsu(), ricrzixhrfrvkyk(), var14);
               var14 = wlulfxkswusfxydd(var14, 1243416355);
               return var11;
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
                     case 120069655:
                        var14 ^= 754212332;
                     case 1490533659:
                        var14 = 2004777763 ^ var14;
                        return var8;
                     case 1618213535:
                        break;
                     case 2052239519:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }
         }

         var14 = 1688693082 ^ var14;
      } else {
         var14 = 451231340 ^ var14;
      }

      return gwjwkqqizr(ixlxosiwlukxcuh(), ricrzixhrfrvkyk(), var14);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void applyNow(Minecraft var0, c$b var1) {
      byte var15;
      byte var17;
      int var99;
      label176: {
         var99 = 211034626 ^ 124436971 ^ 1713364690;
         var99 = 2015593800 ^ var99;
         g var2 = g.INSTANCE;
         var15 = (byte)((var2.isOpen()) ? 1 : 0);
         com.wimpyclient.g.a var16 = com.wimpyclient.g.a.INSTANCE;
         var17 = (byte)((var16.isOpen()) ? 1 : 0);
         ClientLevel var19 = var0.level;
         if (var19 == null) {
            var99 = 1721286872 ^ var99;
            ClientPacketListener var21 = var0.getConnection();
            if (var21 == null) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                     case 259996305:
                        var99 ^= 1740457109;
                        break label176;
                     case 685557804:
                        break;
                     case 1383659404:
                        break label176;
                     case 1692860268:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            var99 = 1411305847 ^ var99;
         } else {
            var99 = 847647151 ^ var99;
         }

         label177: {
            label158: {
               try {
                  ClientLevel var23 = var0.level;
                  if (var23 != null) {
                     var99 ^= 1312682529;
                     ClientLevel var25 = var0.level;
                     String var3 = gwjwkqqizr(xbnmubtqilhqgjp(), ricrzixhrfrvkyk(), var99);
                     MutableComponent var53 = Component.literal(var3);
                     var25.disconnect(var53);
                     var99 ^= 92699887;
                     break label158;
                  }
               } catch (Throwable var97) {
                  var99 = 101642453 ^ switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var99)) {
                     case 975523553 -> 887750760 ^ var99;
                     case 1271586795 -> 2060972617 ^ var99;
                     default -> throw new RuntimeException(new IllegalAccessException("Error in hash"));
                  };
                  break label177;
               }

               var99 ^= 1270582990;
            }

            label151:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                  case 53360461:
                     var99 ^= 2036301427;
                  case 216240816:
                     break label151;
                  case 1820145824:
                  default:
                     throw new RuntimeException();
                  case 2021528228:
               }
            }
         }

         TitleScreen var54 = new TitleScreen();
         byte var69 = (byte)(362830177 ^ var99);
         var0.disconnect(var54, (var69 != 0));
         var99 = 21456223 ^ var99;
      }

      String var71 = var1.name();
      UUID var77 = var1.uuid();
      String var80 = var1.accessToken();
      String var81 = var1.xuid();
      Optional var82 = optional(var81);
      String var83 = var1.clientId();
      Optional var84 = Optional.of(var83);
      User var27 = new User(var71, var77, var80, var82, var84);
      ag var29 = (ag)var0;
      ag var11 = var29;
      var29.wimpyclient$setUser(var27);
      UserApiService var31 = UserApiService.OFFLINE;
      UserApiService var12 = var31;
      var99 = 1478717894 ^ var99;

      Exception var10000 = null;
      try {
         Proxy var33 = var11.wimpyclient$proxy();
         var99 ^= 458629137;
         Proxy var76;
         if (var33 != null) {
            var99 ^= 1481541389;
            var76 = var33;
         } else {
            var99 = wlulfxkswusfxydd(var99, 767404297);
            var99 ^= 479669566;
            var76 = Proxy.NO_PROXY;
         }
         var99 ^= 1768162106;
         YggdrasilAuthenticationService var34 = new YggdrasilAuthenticationService(var76);
         String var57 = var1.accessToken();
         UserApiService var36 = var34.createUserApiService(var57);
         var99 ^= 1520780251;
         var12 = var36;
         var99 ^= 1832893108;
      } catch (Exception var94) {
         var10000 = var94;
      }
      if (var10000 != null) {
         Exception var50 = var10000;
         Logger var51 = com.wimpyclient.Wimpy.LOGGER;
         String var68 = gwjwkqqizr(cazmzuuhxuhbnsd(), ricrzixhrfrvkyk(), var99);
         var51.warn(var68, var50);
         var99 = 961221437 ^ var99;
      }


      var29.wimpyclient$setUserApiService(var12);
      UserApiService var38 = var12;
      Supplier var60 = () -> {
         int var8 = 1320086304 ^ 1198897267 ^ 1713364690;
         var8 = 104385902 ^ var8;

         try {
            UserProperties var3x = var38.fetchProperties();
            var8 ^= 1612458736;
            return var3x;
         } catch (Exception var9) {
            switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var8)) {
               case 1340213115:
                  var8 = 1112261967 ^ var8;
                  return UserApiService.OFFLINE_PROPERTIES;
               default:
                  throw new RuntimeException(new IllegalAccessException("Error in hash"));
            }
         }
      };
      CompletableFuture var61 = CompletableFuture.supplyAsync(var60);
      var29.wimpyclient$setUserPropertiesFuture(var61);
      FabricLoader var78 = FabricLoader.getInstance();
      Path var79 = var78.getGameDir();
      ProfileKeyPairManager var63 = ProfileKeyPairManager.create(var12, var27, var79);
      var29.wimpyclient$setProfileKeyPairManager(var63);
      var99 = 1966033098 ^ var99;

      label71: {
         try {
            Services var42 = var0.services();
            MinecraftSessionService var43 = var42.sessionService();
            Supplier var65 = () -> {
               int var9 = 1596853704 ^ 343130111 ^ 1713364690;
               var9 = 1603207762 ^ var9;
               UUID var6 = var1.uuid();
               byte var4 = (byte)(1926065846 ^ var9);
               return var43.fetchProfile(var6, (var4 != 0));
            };
            CompletableFuture var66 = CompletableFuture.supplyAsync(var65);
            var11.wimpyclient$setProfileFuture(var66);
            var99 ^= 287277181;
         } catch (Throwable var93) {
            switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var99)) {
               case -392121391:
                  var99 = 112988331 ^ var99;
                  var99 = 458850252 ^ var99;
                  break label71;
               default:
                  throw new RuntimeException(new IllegalAccessException("Error in hash"));
            }
         }

         var99 = 217771802 ^ var99;
      }

      if (var15 != (552696093 ^ var99)) {
         var99 = 1936152826 ^ var99;
         g var47 = g.INSTANCE;
         var47.open(var0);
         var99 = 1790159501 ^ var99;
      } else {
         var99 = wlulfxkswusfxydd(var99, 433386103);
      }

      if (var17 != (958761834 ^ var99)) {
         var99 = 1368400722 ^ var99;
         com.wimpyclient.g.a var49 = com.wimpyclient.g.a.INSTANCE;
         var49.open();
         var99 = 1479004032 ^ var99;
      } else {
         var99 = 163048658 ^ var99;
      }
   }

   private static Optional<String> optional(String var0) {
      int var9 = 294877981 ^ 209310363 ^ 1713364690;
      var9 = 525223708 ^ var9;
      if (var0 != null) {
         var9 = 180963113 ^ var9;
         byte var3 = (byte)((var0.isBlank()) ? 1 : 0);
         if (var3 == (1852995425 ^ var9)) {
            var9 = wlulfxkswusfxydd(var9, 542466500);
            return Optional.of(var0);
         }

         var9 = 469962528 ^ var9;
      } else {
         var9 = wlulfxkswusfxydd(var9, 382355465);
      }

      return Optional.empty();
   }

   static {
      int var3 = new Random(-1892418377351804449L).nextInt();
      bOBaWyE67M = -1421358452 ^ var3;
   }

   public static String gwjwkqqizr(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] ricrzixhrfrvkyk() {
      return new byte[]{
         44,
         48,
         98,
         29,
         1,
         118,
         83,
         105,
         68,
         77,
         2,
         15,
         60,
         117,
         60,
         117,
         46,
         28,
         28,
         94,
         109,
         105,
         36,
         54,
         96,
         101,
         108,
         65,
         83,
         16,
         38,
         35,
         121,
         25,
         88,
         91,
         89,
         8,
         25,
         2,
         16,
         85,
         6,
         110,
         101,
         53,
         25,
         100,
         42,
         73,
         4,
         95,
         79,
         71,
         94,
         126,
         96,
         27,
         36,
         112,
         1,
         6,
         39,
         12,
         65,
         76,
         55,
         23,
         28,
         59,
         106,
         14,
         11,
         43,
         85,
         100,
         121,
         68,
         21,
         116,
         116,
         101,
         26
      };
   }

   private static byte[] ixlxosiwlukxcuh() {
      return new byte[0];
   }

   private static byte[] poadzujcwilpcsu() {
      return new byte[0];
   }

   private static byte[] cazmzuuhxuhbnsd() {
      return new byte[]{
         -29,
         -10,
         82,
         109,
         48,
         33,
         102,
         46,
         125,
         18,
         51,
         82,
         12,
         102,
         13,
         35,
         27,
         65,
         37,
         25,
         92,
         112,
         20,
         102,
         81,
         47,
         89,
         22,
         106,
         66,
         23,
         110,
         73,
         79,
         105,
         67,
         108,
         79,
         32,
         66,
         33,
         9,
         54,
         47,
         84,
         45,
         44,
         23,
         19,
         42,
         53,
         47,
         127,
         84,
         111,
         53,
         85,
         76,
         29,
         49,
         48,
         73,
         23,
         86,
         112,
         23,
         2,
         64,
         37,
         40,
         91,
         86,
         59,
         126,
         100,
         40,
         76,
         19,
         44,
         53,
         69,
         124,
         42,
         126,
         1,
         57,
         40,
         80,
         79,
         15,
         88,
         8,
         125,
         95,
         62,
         112,
         64,
         46,
         76,
         110,
         45,
         82,
         110,
         55,
         88,
         104,
         3,
         49,
         92,
         55
      };
   }

   private static byte[] xbnmubtqilhqgjp() {
      return new byte[]{
         -29,
         -8,
         84,
         119,
         52,
         55,
         98,
         48,
         124,
         12,
         51,
         91,
         10,
         36,
         9,
         42,
         31,
         66,
         36,
         12,
         92,
         126,
         18,
         110,
         85,
         48,
         93,
         18,
         107,
         74,
         23,
         97,
         79,
         78,
         109,
         25,
         104,
         75
      };
   }

   private static int wlulfxkswusfxydd(int var0, int var1) {
      return var1 ^ var0;
   }
}
