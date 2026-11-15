package com.wimpyclient.i;

import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.world.entity.player.PlayerSkin;

@Environment(EnvType.CLIENT)
public final class z {
   private static final AtomicBoolean RESOLVE_IN_FLIGHT = new AtomicBoolean(false);
   private static volatile String resolvedName = null;
   private static volatile Supplier<PlayerSkin> skinLookup;

   private z() {
   }

   public static boolean isActive() {
      return x.INSTANCE.skinChanger.qo();
   }

   public static String getSkinName() {
      return x.INSTANCE.skinChangerName.trim();
   }

   public static PlayerSkin getForcedSkin() {
      if (!isActive()) {
         return null;
      } else {
         Supplier var0 = skinLookup;
         return var0 != null ? (PlayerSkin)var0.get() : DefaultPlayerSkin.getDefaultSkin();
      }
   }

   public static void tick(Minecraft var0) {
      if (!isActive()) {
         clear();
      } else {
         String var1 = getSkinName();
         if (!var1.isEmpty()) {
            if (!var1.equals(resolvedName) || skinLookup == null) {
               if (RESOLVE_IN_FLIGHT.compareAndSet(false, true)) {
                  resolvedName = var1;
                  skinLookup = DefaultPlayerSkin::getDefaultSkin;
                  CompletableFuture.<Optional<GameProfile>>supplyAsync(() -> fetchProfile(var0, var1))
                     .thenAccept(var2 -> var0.execute(() -> applyResolved(var0, var1, (Optional<GameProfile>)var2)));
               }
            }
         } else {
            if (!"".equals(resolvedName) || skinLookup == null) {
               resolvedName = "";
               skinLookup = DefaultPlayerSkin::getDefaultSkin;
               RESOLVE_IN_FLIGHT.set(false);
            }
         }
      }
   }

   private static Optional<GameProfile> fetchProfile(Minecraft var0, String var1) {
      try {
         return var0.services().profileResolver().fetchByName(var1);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   private static void applyResolved(Minecraft var0, String var1, Optional<GameProfile> var2) {
      try {
         if (!isActive() || !var1.equals(getSkinName())) {
            return;
         }

         if (var2.isPresent()) {
            skinLookup = var0.getSkinManager().createLookup((GameProfile)var2.get(), false);
            resolvedName = var1;
         } else {
            skinLookup = DefaultPlayerSkin::getDefaultSkin;
            resolvedName = var1;
         }
      } finally {
         RESOLVE_IN_FLIGHT.set(false);
      }
   }

   private static void clear() {
      resolvedName = null;
      skinLookup = null;
      RESOLVE_IN_FLIGHT.set(false);
   }
}
