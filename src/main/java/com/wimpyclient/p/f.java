package com.wimpyclient.p;

import com.wimpyclient.i.x;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

@Environment(EnvType.CLIENT)
public final class f {
   private static final int SUS_SOUND_COOLDOWN_TICKS = 20;
   private static long lastSusSoundGameTime = -4611686018427387904L;

   private f() {
   }

   public static void playUi(SoundEvent var0, float var1, float var2) {
      Minecraft var3 = Minecraft.getInstance();
      if (var3.getSoundManager() != null) {
         var3.getSoundManager().play(SimpleSoundInstance.forUI(var0, var1, var2));
      }
   }

   public static void onNewPrimeSusChunk(long var0) {
      x var2 = x.INSTANCE;
      if (var2.isPrimeSusFinderEnabled() && var2.primeSusSound) {
         playSusPing();
      }
   }

   private static void playSusPing() {
      Minecraft var0 = Minecraft.getInstance();
      if (var0.level != null) {
         long var1 = var0.level.getGameTime();
         long var3 = var1 - lastSusSoundGameTime;
         if (var3 < 0L || var3 >= 20L) {
            lastSusSoundGameTime = var1;
            playUi((SoundEvent)SoundEvents.NOTE_BLOCK_PLING.value(), 1.4F, 0.55F);
            playUi(SoundEvents.EXPERIENCE_ORB_PICKUP, 1.15F, 0.35F);
         }
      }
   }

   public static void resetSusSoundCooldown() {
      lastSusSoundGameTime = -4611686018427387904L;
   }

   public static void onWeatherChange(boolean var0, boolean var1) {
      if (x.INSTANCE.weatherNotifier.qo() && x.INSTANCE.weatherNotifierSound) {
         if (var1) {
            playUi(SoundEvents.LIGHTNING_BOLT_THUNDER, 0.85F, 0.45F);
         } else if (var0) {
            playUi(SoundEvents.WEATHER_RAIN, 1.0F, 0.4F);
         } else {
            playUi((SoundEvent)SoundEvents.NOTE_BLOCK_CHIME.value(), 1.25F, 0.4F);
         }
      }
   }
}
