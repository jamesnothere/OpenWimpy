package com.wimpyclient.p;

import java.lang.reflect.Field;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.ChunkPos;

@Environment(EnvType.CLIENT)
public final class b {
   private static Boolean available;
   private static String lastError;
   private static final int HUMAN_SETTINGS_VERSION = 8;
   private static int appliedHumanSettingsVersion;
   private static ClassLoader baritoneLoader;
   private static final int DIG_TARGET_Y = -3;
   private static final double ARRIVE_DIST = 1.6;
   private static final double PROGRESS_EPSILON = 0.75;
   private static final int STUCK_TICKS = 60;
   private static final int MAX_UNSTICK_STAGE = 4;
   private static final int TRAVEL_GIVE_UP_TICKS = 2400;
   private static final int DIG_STALL_TICKS = 160;
   private static final int MAX_DIG_RESTARTS = 3;
   private static final double TELEPORT_ABORT_DIST_SQ = 2304.0;
   private static final double GOAL_ABANDON_DIST_SQ = 230400.0;
   private static final int REPATH_GRACE_TICKS = 40;
   private static final Random RNG = new Random();
   private static b$a state = b$a.IDLE;
   private static int goalX = Integer.MIN_VALUE;
   private static int goalZ;
   private static int digToY = -3;
   private static double arriveDist = 1.6;
   private static double bestDistSq = Double.MAX_VALUE;
   private static int ticksSinceProgress;
   private static int unstickStage;
   private static int travelTicks;
   private static int repathCooldown;
   private static int detourTicksLeft;
   private static boolean escapeSettingsOn;
   private static int settleTicksLeft;
   private static double lastDigY = Double.NaN;
   private static int digStallTicks;
   private static int digRestarts;
   private static boolean diggerFinishedLast;
   private static boolean havePlayerSample;
   private static double lastPlayerX;
   private static double lastPlayerZ;

   private b() {
   }

   public static boolean isAvailable() {
      if (available == null) {
         available = probe();
      }

      return available;
   }

   public static String lastError() {
      return lastError;
   }

   public static boolean pathToChunk(ChunkPos var0) {
      int var1 = var0.getMinBlockX() + 4 + RNG.nextInt(8);
      int var2 = var0.getMinBlockZ() + 4 + RNG.nextInt(8);
      return startTravel(var1, var2, -3);
   }

   public static boolean pathTo(BlockPos var0) {
      return pathTo(var0.getX(), var0.getY(), var0.getZ());
   }

   public static boolean pathTo(int var0, int var1) {
      return startTravel(var0, var1, -3);
   }

   public static boolean pathTo(int var0, int var1, int var2) {
      ensureSettings();
      return trySetGoalBlock(var0, var1, var2) ? true : startTravel(var0, var2, var1);
   }

   private static boolean startTravel(int var0, int var1, int var2) {
      ensureSettings();
      resetTravel();
      goalX = var0;
      goalZ = var1;
      digToY = var2;
      arriveDist = 1.6 + RNG.nextDouble() * 0.8;
      state = b$a.TRAVEL;
      bestDistSq = Double.MAX_VALUE;
      if (!reissueGoal()) {
         state = b$a.FAILED;
         return false;
      } else {
         return true;
      }
   }

   public static boolean isTravelBusy() {
      return state == b$a.TRAVEL || state == b$a.SETTLE || state == b$a.DIG;
   }

   public static boolean travelSucceeded() {
      return state == b$a.DONE;
   }

   public static boolean travelFailed() {
      return state == b$a.FAILED;
   }

   public static b$a travelState() {
      return state;
   }

   public static void clearTravelResult() {
      if (state == b$a.DONE || state == b$a.FAILED) {
         state = b$a.IDLE;
      }
   }

   public static void tickPathKeepAlive(Minecraft var0) {
      if (var0 == null || var0.player == null) {
         havePlayerSample = false;
         o.stop(var0);
      } else if (var0.screen == null && !com.wimpyclient.g.g.INSTANCE.isOpen()) {
         double var1 = var0.player.getX();
         double var3 = var0.player.getZ();
         if (havePlayerSample) {
            double var5 = var1 - lastPlayerX;
            double var7 = var3 - lastPlayerZ;
            if (var5 * var5 + var7 * var7 >= 2304.0) {
               lastPlayerX = var1;
               lastPlayerZ = var3;
               if (isTravelBusy() || o.isActive()) {
                  cancelPath();
               }

               return;
            }
         }

         lastPlayerX = var1;
         lastPlayerZ = var3;
         havePlayerSample = true;
         switch (state) {
            case TRAVEL:
               tickTravel(var0);
               break;
            case SETTLE:
               tickSettle(var0);
               break;
            case DIG:
               tickDig(var0);
               break;
            default:
               if (o.isActive()) {
                  o.stop(var0);
               }
         }
      } else {
         if (state != b$a.DIG && !o.isActive()) {
            o.stop(var0);
            releaseMovementKeys(var0);
         } else {
            cancelPath();
         }
      }
   }

   private static void tickTravel(Minecraft var0) {
      if (!isAvailable()) {
         failTravel(var0, "Baritone unavailable");
      } else if (++travelTicks > 2400) {
         failTravel(var0, "travel timed out");
      } else {
         double var1 = var0.player.getX() - (goalX + 0.5);
         double var3 = var0.player.getZ() - (goalZ + 0.5);
         double var5 = var1 * var1 + var3 * var3;
         if (var5 >= 230400.0) {
            failTravel(var0, "goal out of range");
         } else if (var5 <= arriveDist * arriveDist) {
            beginSettle(var0);
         } else if (detourTicksLeft > 0) {
            if (--detourTicksLeft == 0) {
               reissueGoal();
               ticksSinceProgress = 0;
            }
         } else if (var5 < bestDistSq - 0.75) {
            bestDistSq = var5;
            ticksSinceProgress = 0;
            if (unstickStage > 0 && var5 < bestDistSq * 0.9) {
               unstickStage = Math.max(0, unstickStage - 1);
            }
         } else {
            ticksSinceProgress++;
            if (!isPathing() && !isCustomGoalActive()) {
               if (--repathCooldown <= 0) {
                  repathCooldown = jitter(30, 12);
                  reissueGoal();
               }
            } else {
               if (ticksSinceProgress >= 60) {
                  escalateUnstick(var0);
               }
            }
         }
      }
   }

   private static void escalateUnstick(Minecraft var0) {
      ticksSinceProgress = 0;
      unstickStage++;
      if (unstickStage == 1) {
         reissueGoal();
      } else if (unstickStage == 2) {
         stopBaritoneSilent();
         startDetour(var0);
      } else if (unstickStage == 3) {
         stopBaritoneSilent();
         enableEscapeSettings();
         reissueGoal();
      } else if (unstickStage <= 4) {
         stopBaritoneSilent();
         enableEscapeSettings();
         startDetour(var0);
      } else {
         failTravel(var0, "stuck");
      }
   }

   private static void startDetour(Minecraft var0) {
      double var1 = RNG.nextDouble() * Math.PI * 2.0;
      int var3 = 8 + RNG.nextInt(9);
      int var4 = var0.player.blockPosition().getX();
      int var5 = var0.player.blockPosition().getZ();
      int var6 = var4 + (int)Math.round(Math.cos(var1) * var3);
      int var7 = var5 + (int)Math.round(Math.sin(var1) * var3);
      if (trySetGoalXZ(var6, var7)) {
         detourTicksLeft = jitter(60, 20);
      } else {
         reissueGoal();
      }
   }

   private static void enableEscapeSettings() {
      if (!escapeSettingsOn) {
         try {
            Object var0 = baritoneSettings();
            set(var0, "allowPlace", true);
            set(var0, "allowParkour", true);
            set(var0, "allowParkourPlace", true);
            set(var0, "blockPlacementPenalty", 8.0);
            escapeSettingsOn = true;
         } catch (Throwable var1) {
         }
      }
   }

   private static void restoreEscapeSettings() {
      if (escapeSettingsOn) {
         escapeSettingsOn = false;

         try {
            Object var0 = baritoneSettings();
            set(var0, "allowPlace", false);
            set(var0, "allowParkour", false);
            set(var0, "allowParkourPlace", false);
            set(var0, "blockPlacementPenalty", 80.0);
         } catch (Throwable var1) {
         }
      }
   }

   private static void beginSettle(Minecraft var0) {
      stopBaritoneSilent();
      releaseMovementKeys(var0);
      restoreEscapeSettings();
      settleTicksLeft = jitter(16, 9);
      state = b$a.SETTLE;
   }

   private static void tickSettle(Minecraft var0) {
      if (--settleTicksLeft <= 0) {
         state = b$a.DIG;
         lastDigY = var0.player.getY();
         digStallTicks = 0;
         digRestarts = 0;
         diggerFinishedLast = false;
         o.start(digToY);
         var0.player.displayClientMessage(Component.literal("[Auto-RTP] Arrived \u2014 digging down to Y=" + digToY), false);
      }
   }

   private static void tickDig(Minecraft var0) {
      double var1 = var0.player.getY();
      if (var1 <= digToY + 0.25) {
         o.stop(var0);
         succeedTravel(var0);
      } else if (!o.isActive()) {
         if (diggerFinishedLast) {
            if (var1 <= digToY + 1.0) {
               succeedTravel(var0);
            } else {
               failTravel(var0, "dig aborted at Y=" + (int)Math.floor(var1));
            }
         } else if (++digRestarts > 3) {
            failTravel(var0, "dig kept aborting");
         } else {
            diggerFinishedLast = true;
            o.start(digToY);
         }
      } else {
         diggerFinishedLast = false;
         if (var1 < lastDigY - 0.1) {
            lastDigY = var1;
            digStallTicks = 0;
         } else if (++digStallTicks >= 160) {
            o.stop(var0);
            failTravel(var0, "shaft blocked at Y=" + (int)Math.floor(var1));
            return;
         }
      }
   }

   private static void succeedTravel(Minecraft var0) {
      o.stop(var0);
      restoreEscapeSettings();
      clearGoal();
      state = b$a.DONE;
      var0.player.displayClientMessage(Component.literal("[Auto-RTP] Reached Y=" + digToY), false);
   }

   private static void failTravel(Minecraft var0, String var1) {
      lastError = var1;
      o.stop(var0);
      stopBaritoneSilent();
      restoreEscapeSettings();
      releaseMovementKeys(var0);
      clearGoal();
      state = b$a.FAILED;
      if (var0.player != null) {
         var0.player.displayClientMessage(Component.literal("[Auto-RTP] Giving up on chunk: " + var1), false);
      }
   }

   private static boolean reissueGoal() {
      if (goalX == Integer.MIN_VALUE) {
         return false;
      } else if (trySetGoalXZ(goalX, goalZ)) {
         return true;
      } else {
         return tryDispatchChatCommand("goto " + goalX + " " + goalZ) ? true : tryExecuteCommand("goto " + goalX + " " + goalZ);
      }
   }

   private static void resetTravel() {
      travelTicks = 0;
      ticksSinceProgress = 0;
      unstickStage = 0;
      repathCooldown = 0;
      detourTicksLeft = 0;
      settleTicksLeft = 0;
      digStallTicks = 0;
      digRestarts = 0;
      lastDigY = Double.NaN;
      diggerFinishedLast = false;
      bestDistSq = Double.MAX_VALUE;
   }

   private static void clearGoal() {
      goalX = Integer.MIN_VALUE;
      resetTravel();
   }

   private static int jitter(int var0, int var1) {
      return Math.max(1, var0 + RNG.nextInt(var1 * 2 + 1) - var1);
   }

   private static void releaseMovementKeys(Minecraft var0) {
      if (var0 != null && var0.options != null) {
         var0.options.keyAttack.setDown(false);
         var0.options.keyUse.setDown(false);
      }
   }

   public static boolean cancelPath() {
      Minecraft var0 = Minecraft.getInstance();
      o.stop(var0);
      restoreEscapeSettings();
      clearGoal();
      state = b$a.IDLE;
      stopBaritoneSilent();
      k.releaseAttackAndMovement(var0);
      return true;
   }

   public static void onPlayerTeleported() {
      if (isTravelBusy() || o.isActive() || isPathing()) {
         cancelPath();
      }

      havePlayerSample = false;
   }

   public static void abortAutoDigForScreen() {
      Minecraft var0 = Minecraft.getInstance();
      if (state != b$a.DIG && !o.isActive()) {
         o.stop(var0);
         releaseMovementKeys(var0);
      } else {
         cancelPath();
      }
   }

   public static void clearPathWithoutInputWipe() {
      o.stop(Minecraft.getInstance());
      restoreEscapeSettings();
      clearGoal();
      state = b$a.IDLE;
      stopBaritoneSilent();
   }

   private static void stopBaritoneSilent() {
      try {
         Object var0 = primaryBaritone();
         Class var1 = loadClass("baritone.api.IBaritone");
         Object var2 = var1.getMethod("getPathingBehavior").invoke(var0);
         var2.getClass().getMethod("cancelEverything").invoke(var2);

         try {
            Object var3 = var1.getMethod("getInputOverrideHandler").invoke(var0);
            var3.getClass().getMethod("clearAllKeys").invoke(var3);
         } catch (Throwable var4) {
         }
      } catch (Throwable var5) {
         tryExecuteCommand("stop");
      }
   }

   public static void shutdownForClientExit() {
      try {
         if (isAvailable()) {
            cancelPath();
         }
      } catch (Throwable var6) {
      }

      try {
         Class var0 = loadClass("baritone.Baritone");
         var0.getMethod("shutdownExecutor").invoke(null);
      } catch (Throwable var5) {
         try {
            Object var1 = loadClass("baritone.Baritone").getMethod("getExecutor").invoke(null);
            if (var1 instanceof ThreadPoolExecutor var2) {
               var2.shutdownNow();
            } else if (var1 instanceof ExecutorService var3) {
               var3.shutdownNow();
            }
         } catch (Throwable var4) {
         }
      }

      try {
         for (Thread var9 : Thread.getAllStackTraces().keySet()) {
            String var10 = var9.getName();
            if (var10 != null && (var10.startsWith("Baritone") || var10.startsWith("Baritone-") || var10.matches("pool-\\d+-thread-\\d+"))) {
               var9.interrupt();
            }
         }
      } catch (Throwable var7) {
      }
   }

   public static boolean applyHumanMovementSettings() {
      try {
         Object var0 = baritoneSettings();
         set(var0, "freeLook", true);
         set(var0, "blockFreeLook", false);
         set(var0, "smoothLook", false);
         set(var0, "smoothLookTicks", 5);
         set(var0, "remainWithExistingLookDirection", false);
         set(var0, "randomLooking", 0.0);
         set(var0, "randomLooking113", 0.0);
         set(var0, "antiCheatCompatibility", true);
         set(var0, "allowBreak", true);
         set(var0, "allowPlace", false);
         set(var0, "allowSprint", true);
         set(var0, "sprintAscends", false);
         set(var0, "sprintInWater", false);
         set(var0, "assumeWalkOnWater", false);
         set(var0, "assumeWalkOnLava", false);
         set(var0, "allowWaterBucketFall", false);
         set(var0, "walkOnWaterOnePenalty", 4.0);
         set(var0, "allowParkour", false);
         set(var0, "allowParkourPlace", false);
         set(var0, "allowParkourAscend", false);
         set(var0, "allowDiagonalAscend", false);
         set(var0, "allowDiagonalDescend", false);
         set(var0, "assumeStep", false);
         set(var0, "jumpPenalty", 8.0);
         set(var0, "blockBreakAdditionalPenalty", 12.0);
         set(var0, "blockPlacementPenalty", 80.0);
         set(var0, "blockBreakSpeed", 1);
         set(var0, "allowInventory", false);
         set(var0, "maxFallHeightNoWater", 4);
         set(var0, "splicePath", true);
         set(var0, "cancelOnGoalInvalidation", false);
         set(var0, "renderPath", true);
         set(var0, "renderPathAsLine", true);
         set(var0, "renderGoal", true);
         set(var0, "fadePath", true);
         set(var0, "echoCommands", false);
         set(var0, "chatDebug", false);
         set(var0, "desktopNotifications", false);
         set(var0, "disconnectOnArrival", false);
         set(var0, "chatControl", true);
         set(var0, "prefixControl", true);
         set(var0, "chatControlAnyway", true);
         set(var0, "primaryTimeoutMS", (long)jitter(12000, 2500));
         set(var0, "failureTimeoutMS", (long)jitter(30000, 5000));
         set(var0, "planAheadPrimaryTimeoutMS", (long)jitter(12000, 2500));
         set(var0, "planAheadFailureTimeoutMS", (long)jitter(30000, 5000));
         escapeSettingsOn = false;
         appliedHumanSettingsVersion = 8;
         lastError = null;
         available = true;
         return true;
      } catch (Throwable var1) {
         lastError = rootMessage(var1);
         return false;
      }
   }

   public static void ensureHumanSettings() {
      ensureSettings();
   }

   private static void ensureSettings() {
      if (appliedHumanSettingsVersion != 8) {
         applyHumanMovementSettings();
      }
   }

   public static boolean isPathing() {
      if (!isAvailable()) {
         return false;
      } else {
         try {
            Object var0 = primaryBaritone();
            Class var1 = loadClass("baritone.api.IBaritone");
            Object var2 = var1.getMethod("getPathingBehavior").invoke(var0);
            return var2.getClass().getMethod("isPathing").invoke(var2) instanceof Boolean var4 && var4;
         } catch (Throwable var5) {
            return false;
         }
      }
   }

   public static float[] getEffectiveLook() {
      if (!isAvailable()) {
         return null;
      } else {
         try {
            Object var0 = primaryBaritone();
            Class var1 = loadClass("baritone.api.IBaritone");
            Object var2 = var1.getMethod("getLookBehavior").invoke(var0);
            if (var2.getClass().getMethod("getEffectiveRotation").invoke(var2) instanceof Optional var4 && !var4.isEmpty()) {
               Object var5 = var4.get();
               float var6 = ((Number)var5.getClass().getMethod("getYaw").invoke(var5)).floatValue();
               float var7 = ((Number)var5.getClass().getMethod("getPitch").invoke(var5)).floatValue();
               return new float[]{var6, var7};
            } else {
               return null;
            }
         } catch (Throwable var8) {
            return null;
         }
      }
   }

   public static boolean isForcingLeftClick() {
      if (!isAvailable()) {
         return false;
      } else {
         try {
            Object var0 = primaryBaritone();
            Class var1 = loadClass("baritone.api.IBaritone");
            Object var2 = var1.getMethod("getInputOverrideHandler").invoke(var0);
            Class var3 = loadClass("baritone.api.utils.input.Input");
            Object var4 = null;

            for (Object var8 : var3.getEnumConstants()) {
               if ("CLICK_LEFT".equals(String.valueOf(var8))) {
                  var4 = var8;
                  break;
               }
            }

            return var4 == null ? false : var2.getClass().getMethod("isInputForcedDown", var3).invoke(var2, var4) instanceof Boolean var11 && var11;
         } catch (Throwable var9) {
            return false;
         }
      }
   }

   private static boolean isCustomGoalActive() {
      try {
         Object var0 = primaryBaritone();
         Object var1 = customGoalProcess(var0);
         return isProcessActive(var1);
      } catch (Throwable var2) {
         return false;
      }
   }

   private static boolean probe() {
      try {
         loadClass("baritone.api.BaritoneAPI");
         if (!FabricLoader.getInstance().isModLoaded("baritone")) {
            lastError = "BaritoneAPI found but mod id 'baritone' is not loaded";
         } else {
            lastError = null;
         }

         return true;
      } catch (Throwable var1) {
         lastError = "Baritone not installed (" + rootMessage(var1) + "). Need baritone-api-fabric nested in WimpyClient.";
         return false;
      }
   }

   private static ClassLoader baritoneClassLoader() {
      if (baritoneLoader != null) {
         return baritoneLoader;
      } else {
         ClassLoader var0 = Minecraft.class.getClassLoader();

         try {
            Class.forName("baritone.api.BaritoneAPI", false, var0);
            baritoneLoader = var0;
            return baritoneLoader;
         } catch (ClassNotFoundException var2) {
            baritoneLoader = b.class.getClassLoader();
            return baritoneLoader;
         }
      }
   }

   private static Class<?> loadClass(String var0) throws ClassNotFoundException {
      return Class.forName(var0, true, baritoneClassLoader());
   }

   private static Object baritoneSettings() throws Exception {
      Class var0 = loadClass("baritone.api.BaritoneAPI");
      return var0.getMethod("getSettings").invoke(null);
   }

   private static Object primaryBaritone() throws Exception {
      Class var0 = loadClass("baritone.api.BaritoneAPI");
      Object var1 = var0.getMethod("getProvider").invoke(null);
      Class var2 = loadClass("baritone.api.IBaritoneProvider");
      return var2.getMethod("getPrimaryBaritone").invoke(var1);
   }

   private static Object customGoalProcess(Object var0) throws Exception {
      Class var1 = loadClass("baritone.api.IBaritone");
      return var1.getMethod("getCustomGoalProcess").invoke(var0);
   }

   private static boolean trySetGoalXZ(int var0, int var1) {
      try {
         Object var2 = primaryBaritone();
         Object var3 = customGoalProcess(var2);
         Class var4 = loadClass("baritone.api.pathing.goals.GoalXZ");
         Object var5 = var4.getConstructor(int.class, int.class).newInstance(var0, var1);
         setGoalAndPath(var3, var5);
         if (!isProcessActive(var3)) {
            lastError = "CustomGoalProcess inactive after setGoalAndPath";
            return false;
         } else {
            lastError = null;
            available = true;
            return true;
         }
      } catch (Throwable var6) {
         lastError = rootMessage(var6);
         return false;
      }
   }

   private static boolean trySetGoalBlock(int var0, int var1, int var2) {
      try {
         Object var3 = primaryBaritone();
         Object var4 = customGoalProcess(var3);
         Class var5 = loadClass("baritone.api.pathing.goals.GoalBlock");
         Object var6 = var5.getConstructor(int.class, int.class, int.class).newInstance(var0, var1, var2);
         setGoalAndPath(var4, var6);
         if (!isProcessActive(var4)) {
            lastError = "CustomGoalProcess inactive after setGoalAndPath";
            return false;
         } else {
            lastError = null;
            available = true;
            return true;
         }
      } catch (Throwable var7) {
         lastError = rootMessage(var7);
         return false;
      }
   }

   private static boolean isProcessActive(Object var0) {
      try {
         Class var1 = loadClass("baritone.api.process.IBaritoneProcess");
         return var1.getMethod("isActive").invoke(var0) instanceof Boolean var3 && var3;
      } catch (Throwable var4) {
         return true;
      }
   }

   private static void setGoalAndPath(Object var0, Object var1) throws Exception {
      Class var2 = loadClass("baritone.api.pathing.goals.Goal");
      Class var3 = loadClass("baritone.api.process.ICustomGoalProcess");
      var3.getMethod("setGoal", var2).invoke(var0, var1);
      var3.getMethod("path").invoke(var0);
   }

   private static boolean tryExecuteCommand(String var0) {
      try {
         Object var1 = primaryBaritone();
         Class var2 = loadClass("baritone.api.IBaritone");
         Object var3 = var2.getMethod("getCommandManager").invoke(var1);
         Class var4 = loadClass("baritone.api.command.manager.ICommandManager");
         if (var4.getMethod("execute", String.class).invoke(var3, var0) instanceof Boolean var6 && !var6) {
            lastError = "Baritone command rejected: " + var0;
            return false;
         } else {
            lastError = null;
            available = true;
            return true;
         }
      } catch (Throwable var7) {
         lastError = rootMessage(var7);
         return false;
      }
   }

   private static boolean tryDispatchChatCommand(String var0) {
      try {
         Minecraft var1 = Minecraft.getInstance();
         if (var1.player == null) {
            lastError = "No local player for Baritone chat command";
            return false;
         } else {
            Object var2 = primaryBaritone();
            String var3 = "#";

            try {
               Object var4 = baritoneSettings();
               Object var5 = var4.getClass().getField("prefix").get(var4);
               if (var5.getClass().getField("value").get(var5) instanceof String var7 && !var7.isBlank()) {
                  var3 = var7;
               }
            } catch (Throwable var10) {
            }

            String var12 = var3 + var0;

            try {
               Class var13 = loadClass("baritone.api.command.IBaritoneChatControl");
               Field var15 = var13.getField("FORCE_COMMAND_PREFIX");
               if (var15.get(null) instanceof String var8 && !var8.isBlank()) {
                  var12 = var8 + var0;
               }
            } catch (Throwable var9) {
            }

            Class var14 = loadClass("baritone.api.event.events.ChatEvent");
            Object var16 = var14.getConstructor(String.class).newInstance(var12);
            Class var18 = loadClass("baritone.api.IBaritone");
            Object var19 = var18.getMethod("getGameEventHandler").invoke(var2);
            var19.getClass().getMethod("onSendChatMessage", var14).invoke(var19, var16);
            lastError = null;
            available = true;
            return true;
         }
      } catch (Throwable var11) {
         lastError = rootMessage(var11);
         return false;
      }
   }

   private static void set(Object var0, String var1, Object var2) throws Exception {
      Field var3 = var0.getClass().getField(var1);
      Object var4 = var3.get(var0);
      Field var5 = var4.getClass().getField("value");
      Object var6 = var5.get(var4);
      if (var6 != null && var2 != null && var6.getClass() != var2.getClass()) {
         if (var6 instanceof Float && var2 instanceof Number var7) {
            var2 = var7.floatValue();
         } else if (var6 instanceof Double && var2 instanceof Number var8) {
            var2 = var8.doubleValue();
         } else if (var6 instanceof Integer && var2 instanceof Number var9) {
            var2 = var9.intValue();
         } else if (var6 instanceof Long && var2 instanceof Number var10) {
            var2 = var10.longValue();
         }
      }

      var5.set(var4, var2);
   }

   private static String rootMessage(Throwable var0) {
      Throwable var1 = var0;

      while (var1.getCause() != null && var1.getCause() != var1) {
         var1 = var1.getCause();
      }

      String var2 = var1.getMessage();
      return var1.getClass().getSimpleName() + (var2 != null && !var2.isBlank() ? ": " + var2 : "");
   }
}
