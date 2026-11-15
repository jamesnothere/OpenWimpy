package com.wimpyclient.i;

import java.util.Locale;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

@Environment(EnvType.CLIENT)
public final class o {
   private static final int GRAY = 11184810;
   private static final int GREEN = 5635925;
   private static final String[] MONEY_KEYS = new String[]{"money", "balance", "coins", "cash"};
   private static final String[] SHARD_KEYS = new String[]{"shard"};
   private static final String[] KILL_KEYS = new String[]{"kill"};
   private static final String[] DEATH_KEYS = new String[]{"death"};
   private static final String[] PLAYTIME_KEYS = new String[]{"playtime", "play time", "time played", "played"};
   private static String lastMoneyText;
   private static double liveBalance;
   private static int widthIndex;
   private static int drawIndex;

   private o() {
   }

   public static boolean isActive() {
      return x.INSTANCE.fakeStats.qo();
   }

   public static boolean sidebarEnabled() {
      return isActive() && x.INSTANCE.fakeStatsSidebar;
   }

   public static boolean tabEnabled() {
      return isActive() && x.INSTANCE.fakeStatsTab;
   }

   public static void beginSidebar() {
      widthIndex = 0;
      drawIndex = 0;
   }

   public static Component rewriteForWidth(Component var0) {
      return rewriteLine(var0, true);
   }

   public static Component rewriteForDraw(Component var0) {
      return rewriteLine(var0, false);
   }

   public static Component rewriteByKeywords(Component var0) {
      if (isActive() && var0 != null) {
         String var1 = stripCodes(var0.getString());
         return var1.isBlank() ? var0 : applyOverride(-1, var1.toLowerCase(Locale.ROOT), var0);
      } else {
         return var0;
      }
   }

   public static Component rewriteTabBanner(Component var0) {
      if (var0 == null) {
         return null;
      } else {
         Component var1 = var0;
         if (tabEnabled()) {
            x var2 = x.INSTANCE;
            if (!var2.fakeStatsMoney.isBlank()) {
               var1 = keepName(var0, com.wimpyclient.p.a.replaceNearKeys(var0, MONEY_KEYS, com.wimpyclient.p.a.shortForm(getLiveBalance()), true));
            }

            if (!var2.fakeStatsShards.isBlank()) {
               var1 = keepName(var1, com.wimpyclient.p.a.replaceNearKeys(var1, SHARD_KEYS, var2.fakeStatsShards.trim(), false));
            }

            if (!var2.fakeStatsKills.isBlank()) {
               var1 = keepName(var1, com.wimpyclient.p.a.replaceNearKeys(var1, KILL_KEYS, var2.fakeStatsKills.trim(), false));
            }

            if (!var2.fakeStatsDeaths.isBlank()) {
               var1 = keepName(var1, com.wimpyclient.p.a.replaceNearKeys(var1, DEATH_KEYS, var2.fakeStatsDeaths.trim(), false));
            }

            if (!var2.fakeStatsPlaytime.isBlank()) {
               var1 = keepName(var1, com.wimpyclient.p.a.replaceNearKeys(var1, PLAYTIME_KEYS, var2.fakeStatsPlaytime.trim(), false));
            }
         }

         return n.rewrite(var1);
      }
   }

   public static Component rewriteTabText(Component var0) {
      return rewriteTabBanner(var0);
   }

   private static Component rewriteLine(Component var0, boolean var1) {
      if (sidebarEnabled() && var0 != null) {
         String var2 = stripCodes(var0.getString());
         if (var2.isBlank()) {
            return var0;
         } else {
            int var3 = var1 ? widthIndex++ : drawIndex++;
            return applyOverride(var3, var2.toLowerCase(Locale.ROOT), var0);
         }
      } else {
         return var0;
      }
   }

   private static Component applyOverride(int var0, String var1, Component var2) {
      x var3 = x.INSTANCE;
      Component var4 = var2;
      if (!var3.fakeStatsMoney.isBlank() && matches(var3.fakeStatsMoneyLine, var0, var1, MONEY_KEYS)) {
         var4 = com.wimpyclient.p.a.replaceNumberStyled(var2, com.wimpyclient.p.a.shortForm(getLiveBalance()));
      } else if (!var3.fakeStatsShards.isBlank() && matches(var3.fakeStatsShardsLine, var0, var1, SHARD_KEYS)) {
         var4 = com.wimpyclient.p.a.replaceNumberStyled(var2, var3.fakeStatsShards.trim());
      } else if (!var3.fakeStatsKills.isBlank() && matches(var3.fakeStatsKillsLine, var0, var1, KILL_KEYS)) {
         var4 = com.wimpyclient.p.a.replaceNumberStyled(var2, var3.fakeStatsKills.trim());
      } else if (!var3.fakeStatsDeaths.isBlank() && matches(var3.fakeStatsDeathsLine, var0, var1, DEATH_KEYS)) {
         var4 = com.wimpyclient.p.a.replaceNumberStyled(var2, var3.fakeStatsDeaths.trim());
      } else if (!var3.fakeStatsPlaytime.isBlank() && matches(var3.fakeStatsPlaytimeLine, var0, var1, PLAYTIME_KEYS)) {
         var4 = com.wimpyclient.p.a.replaceValueStyled(var2, var3.fakeStatsPlaytime.trim());
      }

      return keepName(var2, var4);
   }

   private static Component keepName(Component var0, Component var1) {
      if (var0 != null && var1 != var0) {
         String var2 = n.getRealName();
         if (var2 != null && !var2.isEmpty()) {
            String var3 = var0.getString();
            String var4 = var1.getString();
            if (containsIgnoreCase(var3, var2) && !containsIgnoreCase(var4, var2)) {
               String var5 = n.getName();
               return n.isActive() && !var5.isEmpty() && containsIgnoreCase(var4, var5) ? var1 : var0;
            } else {
               return var1;
            }
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   private static boolean containsIgnoreCase(String var0, String var1) {
      return var0.toLowerCase(Locale.ROOT).contains(var1.toLowerCase(Locale.ROOT));
   }

   private static boolean matches(int var0, int var1, String var2, String[] var3) {
      if (var1 < 0) {
         return containsAny(var2, var3);
      } else {
         return var0 > 0 ? var1 + 1 == var0 : containsAny(var2, var3);
      }
   }

   private static boolean containsAny(String var0, String[] var1) {
      for (String var5 : var1) {
         if (var0.contains(var5)) {
            return true;
         }
      }

      return false;
   }

   public static double getLiveBalance() {
      syncFromSetting();
      return liveBalance;
   }

   public static void deduct(double var0) {
      syncFromSetting();
      liveBalance = Math.max(0.0, liveBalance - Math.max(0.0, var0));
   }

   public static boolean tryInterceptBalance(String var0) {
      if (isActive() && x.INSTANCE.fakeStatsBalanceCommand) {
         String[] var1 = var0.trim().split("\\s+");
         if (var1.length == 0) {
            return false;
         } else {
            String var2 = var1[0];
            if (var2.startsWith("/")) {
               var2 = var2.substring(1);
            }

            if (!var2.equalsIgnoreCase("bal") && !var2.equalsIgnoreCase("balance")) {
               return false;
            } else {
               Minecraft var3 = Minecraft.getInstance();
               LocalPlayer var4 = var3.player;
               if (var4 == null) {
                  return false;
               } else if (var1.length >= 2 && !var1[1].equalsIgnoreCase(var4.getGameProfile().name())) {
                  return false;
               } else {
                  String var5 = com.wimpyclient.p.a.shortForm(getLiveBalance());
                  MutableComponent var6 = Component.empty()
                     .append(Component.literal("You have ").withColor(11184810))
                     .append(Component.literal(var5).withColor(5635925));
                  var4.displayClientMessage(var6, false);
                  var4.displayClientMessage(var6, true);
                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   private static void syncFromSetting() {
      String var0 = x.INSTANCE.fakeStatsMoney;
      if (!Objects.equals(var0, lastMoneyText)) {
         lastMoneyText = var0;
         double var1 = com.wimpyclient.p.a.parse(var0);
         liveBalance = Double.isNaN(var1) ? 0.0 : Math.max(0.0, var1);
      }
   }

   private static String stripCodes(String var0) {
      return var0 == null ? "" : var0.replaceAll("(?i)\u00a7[0-9A-FK-OR]", "");
   }
}
