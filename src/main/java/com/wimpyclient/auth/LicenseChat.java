package com.wimpyclient.auth;

import com.wimpyclient.LicenseLifecycle;
import com.wimpyclient.d.a;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

@Environment(EnvType.CLIENT)
public final class LicenseChat {
   private static final AtomicBoolean VALIDATING = new AtomicBoolean();
   private static final String PREFIX = "[License] ";
   private static volatile String pendingNotice;
   private static long lastLockedNotice;
   private static boolean warnedExpiry;
   private static Object announcedWorld;
   private static int worldTicks;
   private static boolean promptedThisWorld;

   private LicenseChat() {
   }

   public static boolean handle(String var0) {
      String var1 = var0 == null ? "" : var0.trim();
      int var2 = !var1.regionMatches(true, 0, ".key", 0, 4) && !var1.regionMatches(true, 0, ",key", 0, 4)
         ? (!var1.regionMatches(true, 0, "/.key", 0, 5) && !var1.regionMatches(true, 0, "/,key", 0, 5) ? 0 : 5)
         : 4;
      if (var2 == 0) {
         return false;
      } else {
         Minecraft var3 = Minecraft.getInstance();
         if (!var3.isSameThread()) {
            var3.execute(() -> handle(var1));
            return true;
         } else {
            promptedThisWorld = true;
            String var4 = var1.substring(var2).trim();
            if (var4.isEmpty()) {
               showStatus();
               return true;
            } else if (LicenseGate.isAuthorized()) {
               show(
                  LicenseGate.isCurrentKey(var4)
                     ? "This key is already active on this client."
                     : "A license is already active. Wait for it to expire before entering another key."
               );
               return true;
            } else if (!VALIDATING.compareAndSet(false, true)) {
               show("A key is already being checked.");
               return true;
            } else {
               show("Activating license...");
               CompletableFuture.runAsync(
                  () -> {
                     boolean var1x = LicenseGate.activate(var4);
                     Minecraft.getInstance()
                        .execute(
                           () -> {
                              VALIDATING.set(false);
                              if (var1x && LicenseGate.isAuthorized()) {
                                 warnedExpiry = false;
                                 LicenseGate.startHeartbeat(LicenseLifecycle::onAuthLost);
                                 a.load();
                                 show("License accepted. Modules unlocked.");
                                 if (LicenseGate.isFreeKey()) {
                                    show("Prime Sus Finder and NBT Bypass need a paid key.");
                                 }

                                 showTimeLeft();
                              } else {
                                 show(
                                    LicenseGate.isAuthorized()
                                       ? "Key rejected. Your current key is still active."
                                       : "Key rejected or server unavailable. Enter .key <key> to try again."
                                 );
                              }
                           }
                        );
                  }
               );
               return true;
            }
         }
      }
   }

   public static void storedKeyAuthorized() {
      Minecraft.getInstance()
         .execute(
            () -> {
               if (LicenseGate.isAuthorized()) {
                  warnedExpiry = false;
                  LicenseGate.startHeartbeat(LicenseLifecycle::onAuthLost);
                  pendingNotice = "License accepted. Modules unlocked."
                     + (LicenseGate.isFreeKey() ? " Prime Sus Finder and NBT Bypass need a paid key." : "")
                     + " Time left: "
                     + remainingText();
                  flushPending();
               }
            }
         );
   }

   public static void storedKeyInvalid() {
      Minecraft.getInstance().execute(() -> {
         if (!LicenseGate.isAuthorized()) {
            promptedThisWorld = true;
            pendingNotice = "Saved key was rejected. Enter .key <key> in chat.";
            flushPending();
         }
      });
   }

   public static void sessionEnded() {
      Minecraft.getInstance().execute(() -> {
         if (!LicenseGate.isAuthorized()) {
            promptedThisWorld = true;
            pendingNotice = "License no longer valid \u2014 all modules disabled. Enter a new key with .key YOURKEY";
            flushPending();
         }
      });
   }

   public static void maybeWarnExpiring() {
      if (!warnedExpiry && LicenseGate.isAuthorized()) {
         long var0 = LicenseGate.remainingSeconds();
         if (var0 <= 900L) {
            warnedExpiry = true;
            show((LicenseGate.isFreeKey() ? "Your trial key" : "Your key") + " expires in about " + minutesLeft() + " minutes.");
         }
      }
   }

   public static void announceIfNeeded() {
      Minecraft var0 = Minecraft.getInstance();
      if (var0.level != null && var0.player != null) {
         if (announcedWorld != var0.level) {
            announcedWorld = var0.level;
            promptedThisWorld = false;
            worldTicks = 0;
         }

         boolean var1 = pendingNotice != null;
         flushPending();
         if (var1 && !LicenseGate.isAuthorized()) {
            promptedThisWorld = true;
         }

         if (!promptedThisWorld && !LicenseGate.isAuthorized() && ++worldTicks >= 40) {
            promptedThisWorld = true;
            show("License required. Type .key YOURKEY in chat to unlock modules.");
         }
      } else {
         announcedWorld = null;
         promptedThisWorld = false;
         worldTicks = 0;
      }
   }

   public static void noticeLocked() {
      long var0 = System.nanoTime();
      if (lastLockedNotice == 0L || var0 - lastLockedNotice >= 2000000000L) {
         lastLockedNotice = var0;
         show("Modules locked \u2014 activate with .key YOURKEY");
      }
   }

   public static void noticePaidOnly(String var0) {
      show(var0 + " needs a paid key.");
   }

   private static void showStatus() {
      show("Enter your key in chat: .key YOURKEY");
      if (LicenseGate.isAuthorized()) {
         show(keyStatus());
         showTimeLeft();
      } else if (VALIDATING.get()) {
         show("Status: checking - Activating license...");
      } else {
         show("Status: invalid - No valid key on this client.");
         show("Modules stay off until a valid key is accepted.");
      }
   }

   private static String keyStatus() {
      return LicenseGate.isFreeKey() ? "Status: valid - free key (Prime Sus Finder and NBT Bypass unavailable)" : "Status: valid - paid key";
   }

   private static void showTimeLeft() {
      show("Time left: " + remainingText());
   }

   private static String remainingText() {
      return "about " + minutesLeft() + " minutes";
   }

   private static long minutesLeft() {
      return (LicenseGate.remainingSeconds() + 59L) / 60L;
   }

   private static void flushPending() {
      String var0 = pendingNotice;
      if (var0 != null) {
         Minecraft var1 = Minecraft.getInstance();
         if (var1.player != null && var1.gui != null) {
            pendingNotice = null;
            show(var0);
         }
      }
   }

   private static void show(String var0) {
      Minecraft var1 = Minecraft.getInstance();
      if (var1.player != null) {
         var1.player.displayClientMessage(Component.literal("[License] " + var0), false);
      } else {
         pendingNotice = var0;
      }
   }
}
