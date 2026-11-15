package com.wimpyclient.p;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerStatusPinger;
import net.minecraft.client.multiplayer.ServerData.Type;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.server.network.EventLoopGroupHolder;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class l {
   private static final int PING_INTERVAL_TICKS = 100;
   private static final int MAX_PING_MS = 30000;
   private static final ServerStatusPinger PINGER;
   private static ServerData probe;
   private static boolean pingInFlight;
   private static int ticksUntilNext;
   private static int lastPingMs;
   private static int WCEusozj3Z;
   private transient int NhmdP0iNDk;

   private l() {
super();
      int var4 = 1922482733 ^ 873937708;
      
      var4 = coxrjcyqevhchqik(var4, 747330412);
      var4 = 2087730056 ^ 1691162523 ^ Integer.parseInt("1924632190");
      this.NhmdP0iNDk = 1329248799 ^ WCEusozj3Z;
      var4 = coxrjcyqevhchqik(var4, 2063300267);
   }

   public static void tick(Minecraft var0) {
      int var20 = 179410878 ^ 1911434982 ^ 1480032311;
      var20 = 1263938177 ^ var20;
      ServerStatusPinger var1 = PINGER;
      var1.tick();
      LocalPlayer var4 = var0.player;
      if (var4 != null) {
         var20 = 1446510773 ^ var20;
         ClientLevel var6 = var0.level;
         if (var6 != null) {
            var20 = 179300629 ^ var20;
            ClientPacketListener var8 = var0.getConnection();
            if (var8 != null) {
               var20 = 78329276 ^ var20;
               byte var10 = (byte)((var0.hasSingleplayerServer()) ? 1 : 0);
               if (var10 != (805490674 ^ var20)) {
                  var20 = 992846619 ^ var20;
                  byte var11 = (byte)(187657449 ^ var20);
                  lastPingMs = var11;
                  return;
               }

               var20 = 1341905195 ^ var20;
               int var12 = ticksUntilNext;
               if (var12 > (2147030745 ^ var20)) {
                  var20 = 1843716187 ^ var20;
                  int var16 = ticksUntilNext;
                  byte var2 = (byte)(303953539 ^ var20);
                  int var17 = var16 - var2;
                  ticksUntilNext = var17;
                  return;
               }

               var20 = coxrjcyqevhchqik(var20, 154777799);
               byte var13 = (byte)((pingInFlight) ? 1 : 0);
               if (var13 != (1992338974 ^ var20)) {
                  var20 = 426946270 ^ var20;
                  return;
               }

               var20 = 263277942 ^ var20;
               byte var14 = (byte)(2037506828 ^ var20);
               ticksUntilNext = var14;
               startStatusPing(var0);
               return;
            }

            var20 = 1518245047 ^ var20;
         } else {
            var20 = 1355906466 ^ var20;
         }
      } else {
         label35:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
               case 167259811:
                  var20 = 115965207 ^ var20;
                  break label35;
               case 314620899:
               default:
                  throw new RuntimeException();
               case 1012665441:
                  break;
               case 1714398109:
                  break label35;
            }
         }
      }

      reset();
   }

   private static void startStatusPing(Minecraft var0) {
      int var36 = 1262737089 ^ 1319087766 ^ 1480032311;
      var36 = 1474970392 ^ var36;
      ServerData var8 = var0.getCurrentServer();
      if (var8 != null) {
         var36 = 1625481438 ^ var36;
         String var11 = var8.ip;
         if (var11 == null) {
            var36 = coxrjcyqevhchqik(var36, 1656774145);
         } else {
            var36 = 46929960 ^ var36;
            String var13 = var8.ip;
            byte var14 = (byte)((var13.isBlank()) ? 1 : 0);
            if (var14 == (1747927950 ^ var36)) {
               var36 = coxrjcyqevhchqik(var36, 934507335);
               String var27 = var8.name;
               String var29 = var8.ip;
               Type var31 = var8.type();
               ServerData var15 = new ServerData(var27, var29, var31);
               probe = var15;
               byte var16 = (byte)(1604071624 ^ var36);
               pingInFlight = (var16 != 0);
               var36 = 1285081144 ^ var36;

               try {
                  ServerStatusPinger var17 = PINGER;
                  ServerData var26 = probe;
                  Runnable var28 = () -> {
                     int var3 = 1826905298 ^ 470724099 ^ 1480032311;
                     var3 = 7522107 ^ var3;
                  };
                  Runnable var30 = () -> {
                     int var14x = 1121178916 ^ 89257379 ^ 1480032311;
                     var14x = 1836636888 ^ var14x;
                     long var0x = 30000L;
                     long var2 = 0L;
                     ServerData var4 = probe;
                     long var11x = var4.ping;
                     long var9 = Math.max(var2, var11x);
                     long var5 = Math.min(var0x, var9);
                     int var7 = (int)var5;
                     lastPingMs = var7;
                     byte var8x = (byte)(1926068840 ^ var14x);
                     pingInFlight = (var8x != 0);
                  };
                  byte var32 = (byte)(319092976 ^ var36);
                  EventLoopGroupHolder var33 = EventLoopGroupHolder.remote((var32 != 0));
                  var17.pingServer(var26, var28, var30, var33);
                  var36 ^= 1547731887;
               } catch (Exception var37) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var36)) {
                     case -1742223480:
                        var36 = 1663346949 ^ var36;
                        byte var19 = (byte)(1881166324 ^ var36);
                        pingInFlight = (var19 != 0);
                        int var21 = tabLatency(var0);
                        if (var21 >= (1881166324 ^ var36)) {
                           var36 = 900293131 ^ var36;
                           lastPingMs = var21;
                           var36 = 1096415423 ^ var36;
                           return;
                        } else {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var36)) {
                                 case 155119336:
                                    var36 = 1961925300 ^ var36;
                                    return;
                                 case 1426386067:
                                    return;
                                 case 1885633532:
                                 default:
                                    throw new RuntimeException();
                                 case 2098732805:
                              }
                           }
                        }
                     default:
                        throw new RuntimeException(new IllegalAccessException("Error in hash"));
                  }
               }

               var36 = coxrjcyqevhchqik(var36, 1268035614);
               return;
            }

            var36 = 1611417129 ^ var36;
         }
      } else {
         label54:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var36)) {
               case 56840505:
                  var36 = 35831519 ^ var36;
                  break label54;
               case 805298966:
               default:
                  throw new RuntimeException();
               case 962989925:
                  break;
               case 1057538433:
                  break label54;
            }
         }
      }

      int var25 = tabLatency(var0);
      lastPingMs = var25;
   }

   private static int tabLatency(Minecraft var0) {
      int var20 = 1751150656 ^ 1342968759 ^ 1480032311;
      var20 = 568683054 ^ var20;
      LocalPlayer var6 = var0.player;
      ClientPacketListener var8 = var0.getConnection();
      if (var6 != null) {
         var20 = 288144605 ^ var20;
         if (var8 != null) {
            var20 = coxrjcyqevhchqik(var20, 1742764161);
            UUID var17 = var6.getUUID();
            PlayerInfo var12 = var8.getPlayerInfo(var17);
            int var15;
            if (var12 == null) {
               var20 = 870774644 ^ var20;
               var15 = (byte)(-76856007 ^ var20);
               var20 = 1029606424 ^ var20;
            } else {
               var20 = coxrjcyqevhchqik(var20, 109777251);
               var15 = var12.getLatency();
               var20 = 137587215 ^ var20;
            }

            return var15;
         } else {
            var20 = 643593677 ^ var20;
            return (byte)(-1993228543 ^ var20);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
               case 258042499:
                  var20 ^= 930138384;
                  return (byte)(-1993228543 ^ var20);
               case 798770310:
               default:
                  throw new RuntimeException();
               case 994322288:
                  return (byte)(-1993228543 ^ var20);
               case 1862746428:
            }
         }
      }
   }

   private static void reset() {
      int var7 = 1696754433 ^ 865545188 ^ 1480032311;
      var7 = 1596952290 ^ var7;
      byte var0 = (byte)(-1370312241 ^ var7);
      lastPingMs = var0;
      byte var1 = (byte)(1370312240 ^ var7);
      ticksUntilNext = var1;
      byte var2 = (byte)(1370312240 ^ var7);
      pingInFlight = (var2 != 0);
      Object var3 = null;
      probe = (ServerData)var3;
      ServerStatusPinger var4 = PINGER;
      var4.removeAll();
   }

   public static int getPingMs() {
      int var3 = 1294427839 ^ 1582762136 ^ 1480032311;
      var3 = 620705641 ^ var3;
      return lastPingMs;
   }

   public static int resolvePing(Minecraft var0) {
      int var9 = 864786041 ^ 477726879 ^ 1480032311;
      var9 = 1167786339 ^ var9;
      int var1 = lastPingMs;
      if (var1 >= (845062066 ^ var9)) {
         var9 = 2121789841 ^ var9;
         return var1;
      } else {
         var9 = 148496314 ^ var9;
         return tabLatency(var0);
      }
   }

   static {
      int var7 = 564939999 ^ 242576636 ^ Integer.parseInt("1924632190");
      int var4 = new Random(603797826037227886L).nextInt();
      WCEusozj3Z = -1984902252 ^ var4;
      var7 = 545120867 ^ var7;
      ServerStatusPinger var0 = new ServerStatusPinger();
      PINGER = var0;
      byte var1 = (byte)(-2098416703 ^ var7);
      lastPingMs = var1;
   }

   public static String ykfmpjqdds(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] lpexuztabehrtfw() {
      return new byte[]{
         81,
         99,
         22,
         23,
         70,
         71,
         46,
         35,
         118,
         89,
         37,
         4,
         86,
         21,
         97,
         23,
         54,
         31,
         127,
         71,
         95,
         107,
         125,
         80,
         75,
         15,
         52,
         50,
         108,
         23,
         17,
         90,
         112,
         2,
         26,
         27,
         59,
         77,
         43,
         33,
         35
      };
   }

   private static int coxrjcyqevhchqik(int var0, int var1) {
      return var0 ^ var1;
   }
}
