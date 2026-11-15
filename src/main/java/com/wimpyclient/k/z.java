package com.wimpyclient.k;

import net.minecraft.resources.ResourceKey;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;

@Environment(EnvType.CLIENT)
public final class z {
   private static final float PAD = 10.0F;
   private static final float FONT = 12.0F;
   private static final float LINE = 20.0F;
   private static final float ICON = 14.0F;
   private static final String[] ROMAN = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
   private static final Map<Identifier, Integer> ICONS = new HashMap<>();

   private z() {
   }

   public static void renderNvg(com.wimpyclient.m.b var0, float var1, float var2) {
      com.wimpyclient.i.x var3 = com.wimpyclient.i.x.INSTANCE;
      if (var3.hud.qo() && var3.hudStatusEffects) {
         Minecraft var4 = Minecraft.getInstance();
         LocalPlayer var5 = var4.player;
         if (var5 != null && var4.level != null) {
            ArrayList<MobEffectInstance> var6 = new ArrayList<>(var5.getActiveEffectsMap().values());
            var6.removeIf(var0x -> var0x == null);
            var6.sort(
               Comparator.<MobEffectInstance>comparingInt(var0x -> ((MobEffect)var0x.getEffect().value()).isBeneficial() ? 1 : 0)
                  .thenComparingInt(MobEffectInstance::getDuration)
            );
            com.wimpyclient.o.b var7 = com.wimpyclient.o.b.INSTANCE;
            ArrayList<z$a> var8 = new ArrayList<>(var6.size());
            float var9 = var0.textWidth(12.0F, "Effects");

            for (MobEffectInstance var11 : var6) {
               z$a var12 = row(var0, var4, var11);
               var8.add(var12);
               var9 = Math.max(var9, 22.0F + var0.textWidth(12.0F, var12.label()) + 12.0F + var0.textWidth(12.0F, var12.time()));
            }

            if (var8.isEmpty()) {
               var9 = Math.max(var9, var0.textWidth(12.0F, "none active"));
            }

            int var29 = Math.max(1, var8.size());
            float var30 = 20.0F + var9;
            float var31 = 20.0F + (1 + var29) * 20.0F - 4.0F;
            float var13 = 8.0F;
            float var14 = 72.0F;
            float var15 = k.INSTANCE.x(k$d.STATUS_EFFECTS, var13);
            float var16 = k.INSTANCE.y(k$d.STATUS_EFFECTS, var14);
            k.INSTANCE.reportScaled(k$d.STATUS_EFFECTS, var15, var16, var30, var31);
            float var17 = k.INSTANCE.beginElement(var0, k$d.STATUS_EFFECTS, var15, var16);

            try {
               e.glassPanel(var0, var15, var16, var30, var31, 8.0F);
               if (k.INSTANCE.editMode()) {
                  var0.rectOutline(var15, var16, var30, var31, 8.0F, 1.2F, com.wimpyclient.p.g.withAlpha(var7.accentBright(), 0.55F));
               }

               float var18 = var16 + 10.0F + 10.0F;
               var0.textGradient(var15 + 10.0F, var18, 12.0F, var7.accentBright(), var7.accent(), "Effects");
               String var19 = String.valueOf(var8.size());
               var0.text(var15 + var30 - 10.0F - var0.textWidth(12.0F, var19), var18, 12.0F, var7.textMuted(), var19);
               var18 += 20.0F;
               if (var8.isEmpty()) {
                  var0.text(var15 + 10.0F, var18, 12.0F, var7.textMuted(), "none active");
                  return;
               }

               for (z$a var21 : var8) {
                  float var22 = var15 + 10.0F;
                  float var23 = var18 - 7.0F;
                  if (var21.icon() >= 0) {
                     var0.roundedImage(var21.icon(), var22, var23, 14.0F, 3.0F);
                  } else {
                     var0.rect(var22, var23, 14.0F, 14.0F, 3.0F, com.wimpyclient.p.g.withAlpha(var21.tint(), 0.92F));
                  }

                  var0.text(var22 + 14.0F + 6.0F, var18, 12.0F, var7.textPrimary(), var21.label());
                  float var24 = var0.textWidth(12.0F, var21.time());
                  int var25 = var21.urgent() ? var7.accentBright() : var7.textMuted();
                  var0.text(var15 + var30 - 10.0F - var24, var18, 12.0F, var25, var21.time());
                  var18 += 20.0F;
               }
            } finally {
               k.INSTANCE.endElement(var0, var17);
            }
         } else {
            k.INSTANCE.clearReport(k$d.STATUS_EFFECTS);
         }
      } else {
         k.INSTANCE.clearReport(k$d.STATUS_EFFECTS);
      }
   }

   private static z$a row(com.wimpyclient.m.b var0, Minecraft var1, MobEffectInstance var2) {
      Holder<MobEffect> var3 = var2.getEffect();
      MobEffect var4 = (MobEffect)var3.value();
      String var5 = var4.getDisplayName().getString();
      if (var5 == null || var5.isBlank()) {
         var5 = var3.unwrapKey().map(var0x -> prettify(var0x.identifier().getPath())).orElse("Effect");
      }

      int var6 = var2.getAmplifier();
      if (var6 > 0) {
         var5 = var5 + " " + roman(var6 + 1);
      }

      String var7 = formatDuration(var2);
      boolean var8 = !var2.isInfiniteDuration() && var2.getDuration() <= 200;
      int var9 = 0xFF000000 | var4.getColor() & 16777215;
      if (var4.getCategory() == MobEffectCategory.HARMFUL) {
         var9 = com.wimpyclient.p.g.lerp(var9, -38037, 0.25F);
      }

      return new z$a(var5, var7, icon(var0, var1, var3), var9, var8);
   }

   private static int icon(com.wimpyclient.m.b var0, Minecraft var1, Holder<MobEffect> var2) {
      Optional var3 = var2.unwrapKey().map(var0x -> var0x.identifier());
      if (var3.isEmpty()) {
         return -1;
      } else {
         Identifier var4 = (Identifier)var3.get();
         Integer var5 = ICONS.get(var4);
         if (var5 != null) {
            return var5;
         } else {
            int var6 = -1;

            try {
               Identifier var7 = Identifier.fromNamespaceAndPath(var4.getNamespace(), "textures/mob_effect/" + var4.getPath() + ".png");
               Optional var8 = var1.getResourceManager().getResource(var7);
               if (var8.isPresent()) {
                  try (InputStream var9 = ((Resource)var8.get()).open()) {
                     var6 = var0.loadImageBytes(var9.readAllBytes());
                  }
               }
            } catch (Exception var14) {
               var6 = -1;
            }

            ICONS.put(var4, var6);
            return var6;
         }
      }
   }

   private static String prettify(String var0) {
      String[] var1 = var0.split("_");
      StringBuilder var2 = new StringBuilder();

      for (String var6 : var1) {
         if (!var6.isEmpty()) {
            if (var2.length() > 0) {
               var2.append(' ');
            }

            var2.append(Character.toUpperCase(var6.charAt(0)));
            if (var6.length() > 1) {
               var2.append(var6.substring(1));
            }
         }
      }

      return var2.toString();
   }

   private static String formatDuration(MobEffectInstance var0) {
      if (var0.isInfiniteDuration()) {
         return "INF";
      } else {
         int var1 = Math.max(0, var0.getDuration());
         int var2 = var1 / 20;
         int var3 = var2 / 3600;
         int var4 = var2 % 3600 / 60;
         int var5 = var2 % 60;
         return var3 > 0 ? var3 + ":" + pad(var4) + ":" + pad(var5) : var4 + ":" + pad(var5);
      }
   }

   private static String pad(int var0) {
      return var0 < 10 ? "0" + var0 : String.valueOf(var0);
   }

   private static String roman(int var0) {
      if (var0 <= 0) {
         return "";
      } else {
         return var0 <= ROMAN.length ? ROMAN[var0 - 1] : String.valueOf(var0);
      }
   }
}
