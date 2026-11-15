package com.wimpyclient.i;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.trim.ArmorTrim;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimPattern;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public final class b {
   private static RegistryAccess cachedAccess;
   private static final List<Holder<TrimMaterial>> MATERIALS = new ArrayList<>();
   private static final List<Holder<TrimPattern>> PATTERNS = new ArrayList<>();

   private b() {
   }

   public static boolean isActive() {
      return x.INSTANCE.armorTrimHider.qo();
   }

   public static boolean affectsOwn() {
      return x.INSTANCE.armorTrimHiderOwn;
   }

   public static boolean shouldAffect(@Nullable LivingEntity var0) {
      if (!isActive()) {
         return false;
      } else if (affectsOwn()) {
         return true;
      } else {
         Minecraft var1 = Minecraft.getInstance();
         return var1.player == null || var0 != var1.player;
      }
   }

   @Nullable
   public static ArmorTrim mapTrim(ItemStack var0, @Nullable ArmorTrim var1) {
      if (!isActive()) {
         clearCache();
         return var1;
      } else if ("Random".equals(x.INSTANCE.armorTrimHiderMode)) {
         ArmorTrim var2 = randomTrim(var0);
         return var2 != null ? var2 : var1;
      } else {
         return null;
      }
   }

   @Nullable
   private static ArmorTrim randomTrim(ItemStack var0) {
      Minecraft var1 = Minecraft.getInstance();
      if (var1.level == null) {
         return null;
      } else {
         RegistryAccess var2 = var1.level.registryAccess();
         if (var2 != cachedAccess) {
            rebuildCache(var2);
         }

         if (!MATERIALS.isEmpty() && !PATTERNS.isEmpty()) {
            Random var3 = new Random(var0.getItem().getDescriptionId().hashCode());
            Holder var4 = MATERIALS.get(var3.nextInt(MATERIALS.size()));
            Holder var5 = PATTERNS.get(var3.nextInt(PATTERNS.size()));
            return new ArmorTrim(var4, var5);
         } else {
            return null;
         }
      }
   }

   private static void rebuildCache(RegistryAccess var0) {
      cachedAccess = var0;
      MATERIALS.clear();
      PATTERNS.clear();

      try {
         var0.lookupOrThrow(Registries.TRIM_MATERIAL).listElements().forEach(MATERIALS::add);
         var0.lookupOrThrow(Registries.TRIM_PATTERN).listElements().forEach(PATTERNS::add);
      } catch (Exception var2) {
         MATERIALS.clear();
         PATTERNS.clear();
      }
   }

   public static void clearCache() {
      cachedAccess = null;
      MATERIALS.clear();
      PATTERNS.clear();
   }
}
