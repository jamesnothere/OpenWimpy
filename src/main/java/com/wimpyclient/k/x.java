package com.wimpyclient.k;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

@Environment(EnvType.CLIENT)
public final class x {
   private static final long NEW_MS = 5000L;
   private static final float PAD = 10.0F;
   private static final float FONT = 12.0F;
   private static final float LINE = 18.0F;
   private static final float FACE = 12.0F;
   private static final Map<String, Long> JOINED_AT = new HashMap<>();

   private x() {
   }

   public static void tick(Minecraft var0) {
      com.wimpyclient.i.x var1 = com.wimpyclient.i.x.INSTANCE;
      if (!var1.hud.qo() || !var1.hudStaffDetector) {
         wipe();
      } else if (var0.player != null && var0.level != null && var0.getConnection() != null) {
         com.wimpyclient.n.d.INSTANCE.tick();
      } else {
         wipe();
      }
   }

   public static void onStaffAppear(com.wimpyclient.n.c var0) {
      if (var0 != null) {
         JOINED_AT.put(var0.name().toLowerCase(Locale.ROOT), System.currentTimeMillis());
         com.wimpyclient.i.x var1 = com.wimpyclient.i.x.INSTANCE;
         if (!"Off".equals(var1.hudStaffAlerts)) {
            Minecraft var2 = Minecraft.getInstance();
            if (var2.player != null) {
               String var3 = var0.rankLabel().isEmpty() ? "Staff" : var0.rankLabel();
               String var4 = var0.vanished() ? " (vanished)" : "";
               MutableComponent var5 = Component.literal("\u00a7d[Wimpy] \u00a7f" + var3 + " \u00a7b" + var0.name() + "\u00a77 is online" + var4);
               if ("Chat".equals(var1.hudStaffAlerts)) {
                  var2.player.displayClientMessage(var5, false);
               } else {
                  var2.player.displayClientMessage(var5, true);
               }

               if (var1.hudStaffSound) {
                  com.wimpyclient.p.f.playUi((SoundEvent)SoundEvents.NOTE_BLOCK_BELL.value(), 1.5F, 0.6F);
               }
            }
         }
      }
   }

   public static void renderNvg(com.wimpyclient.m.b var0, float var1, float var2) {
      com.wimpyclient.i.x var3 = com.wimpyclient.i.x.INSTANCE;
      if (var3.hud.qo() && var3.hudStaffDetector) {
         Minecraft var4 = Minecraft.getInstance();
         if (var4.player != null && var4.level != null && var4.getConnection() != null) {
            long var5 = System.currentTimeMillis();
            pruneJoined(var5);
            List var7 = com.wimpyclient.n.d.INSTANCE.current();
            int var8 = shownCount(var7, var3.hudStaffMaxRows);
            ArrayList<com.wimpyclient.n.c> var9 = new ArrayList<>();

            for (int var10 = 0; var10 < var8 && var10 < var7.size(); var10++) {
               var9.add((com.wimpyclient.n.c)var7.get(var10));
            }

            int var36 = var7.size() - var9.size();
            int var11 = Math.max(1, var9.isEmpty() ? 1 : var9.size() + (var36 > 0 ? 1 : 0));
            String var12 = var7.size() + " online";
            float var13 = Math.max(var0.textWidth(12.0F, "Staff") + 16.0F + var0.textWidth(12.0F, var12), var0.textWidth(12.0F, "nobody on"));

            for (com.wimpyclient.n.c var15 : var9) {
               var13 = Math.max(var13, rowWidth(var0, var15, var5, var3));
            }

            if (var36 > 0) {
               var13 = Math.max(var13, 20.0F + var0.textWidth(12.0F, "+" + var36 + " more"));
            }

            float var37 = 20.0F + var13;
            float var38 = 20.0F + (1 + var11) * 18.0F - 4.0F;
            float var16 = var1 - var37 - 8.0F;
            float var17 = 8.0F;
            float var18 = k.INSTANCE.x(k$d.STAFF, var16);
            float var19 = k.INSTANCE.y(k$d.STAFF, var17);
            k.INSTANCE.reportScaled(k$d.STAFF, var18, var19, var37, var38);
            com.wimpyclient.o.b var20 = com.wimpyclient.o.b.INSTANCE;
            float var21 = k.INSTANCE.beginElement(var0, k$d.STAFF, var18, var19);

            try {
               e.glassPanel(var0, var18, var19, var37, var38, 8.0F);
               if (k.INSTANCE.editMode()) {
                  var0.rectOutline(var18, var19, var37, var38, 8.0F, 1.2F, com.wimpyclient.p.g.withAlpha(var20.accentBright(), 0.55F));
               }

               float var22 = var19 + 10.0F + 9.0F;
               var0.textGradient(var18 + 10.0F, var22, 12.0F, var20.accentBright(), var20.accent(), "Staff");
               float var23 = var0.textWidth(12.0F, var12);
               int var24 = var9.isEmpty() ? var20.textMuted() : var20.accent();
               var0.text(var18 + var37 - 10.0F - var23, var22, 12.0F, var24, var12);
               var22 += 18.0F;
               if (!var9.isEmpty()) {
                  for (com.wimpyclient.n.c var26 : var9) {
                     String var27 = var26.name().toLowerCase(Locale.ROOT);
                     drawFace(var0, var20, var26, var18 + 10.0F, var22);
                     float var28 = var18 + 10.0F + 12.0F + 6.0F;
                     int var29 = var26.vanished() ? var20.textMuted() : var20.textPrimary();
                     var0.text(var28, var22, 12.0F, var29, var26.name());
                     float var30 = var28 + var0.textWidth(12.0F, var26.name());
                     if (var3.hudStaffShowRank && !var26.rankLabel().isEmpty()) {
                        int var31 = var26.hasColor() ? var26.color() : var20.accent();
                        if (var26.vanished()) {
                           var31 = var20.textMuted();
                        }

                        var0.text(var30 + 6.0F, var22, 12.0F, var31, var26.rankLabel());
                     }

                     if (isNew(var27, var5)) {
                        float var40 = var0.textWidth(12.0F, "new");
                        var0.text(var18 + var37 - 10.0F - var40, var22, 12.0F, var20.accentBright(), "new");
                     } else if (var3.hudStaffShowPing && var26.latency() >= 0) {
                        String var41 = var26.latency() + "ms";
                        float var32 = var0.textWidth(12.0F, var41);
                        var0.text(var18 + var37 - 10.0F - var32, var22, 12.0F, var20.textMuted(), var41);
                     }

                     var22 += 18.0F;
                  }

                  if (var36 > 0) {
                     var0.text(var18 + 10.0F + 12.0F + 6.0F, var22, 12.0F, var20.textMuted(), "+" + var36 + " more");
                  }

                  return;
               }

               var0.text(var18 + 10.0F, var22, 12.0F, var20.textMuted(), "nobody on");
            } finally {
               k.INSTANCE.endElement(var0, var21);
            }
         } else {
            k.INSTANCE.clearReport(k$d.STAFF);
         }
      } else {
         k.INSTANCE.clearReport(k$d.STAFF);
      }
   }

   public static float topRightReserve() {
      com.wimpyclient.i.x var0 = com.wimpyclient.i.x.INSTANCE;
      if (var0.hud.qo() && var0.hudStaffDetector) {
         List var1 = com.wimpyclient.n.d.INSTANCE.current();
         int var2 = Math.max(1, shownCount(var1, var0.hudStaffMaxRows));
         if (var1.isEmpty()) {
            var2 = 1;
         } else if (var1.size() > var2) {
            var2++;
         }

         float var3 = 20.0F + (1 + var2) * 18.0F - 4.0F;
         return (var3 + 6.0F) * k.INSTANCE.scale(k$d.STAFF);
      } else {
         return 0.0F;
      }
   }

   private static int shownCount(List<com.wimpyclient.n.c> var0, int var1) {
      return Math.min(var0.size(), Math.max(1, var1));
   }

   private static float rowWidth(com.wimpyclient.m.b var0, com.wimpyclient.n.c var1, long var2, com.wimpyclient.i.x var4) {
      float var5 = 18.0F + var0.textWidth(12.0F, var1.name());
      if (var4.hudStaffShowRank && !var1.rankLabel().isEmpty()) {
         var5 += 6.0F + var0.textWidth(12.0F, var1.rankLabel());
      }

      if (isNew(var1.name().toLowerCase(Locale.ROOT), var2)) {
         var5 += 10.0F + var0.textWidth(12.0F, "new");
      } else if (var4.hudStaffShowPing && var1.latency() >= 0) {
         var5 += 10.0F + var0.textWidth(12.0F, var1.latency() + "ms");
      }

      return var5;
   }

   private static void drawFace(com.wimpyclient.m.b var0, com.wimpyclient.o.b var1, com.wimpyclient.n.c var2, float var3, float var4) {
      float var5 = 6.0F;
      int var6 = var2.hasColor() ? com.wimpyclient.p.g.withAlpha(var2.color(), 0.85F) : com.wimpyclient.p.g.withAlpha(var1.accent(), 0.55F);
      if (var2.vanished()) {
         var6 = com.wimpyclient.p.g.withAlpha(var1.textMuted(), 0.45F);
      }

      var0.circle(var3 + var5, var4, var5, var6);
      String var7 = var2.name().isEmpty() ? "?" : var2.name().substring(0, 1).toUpperCase(Locale.ROOT);
      var0.textCentered(var3 + var5, var4, 8.0F, -721921, var7);
   }

   private static boolean isNew(String var0, long var1) {
      Long var3 = JOINED_AT.get(var0);
      return var3 != null && var1 - var3 < 5000L;
   }

   private static void pruneJoined(long var0) {
      Iterator var2 = JOINED_AT.entrySet().iterator();

      while (var2.hasNext()) {
         if (var0 - (Long)((Entry)var2.next()).getValue() >= 5000L) {
            var2.remove();
         }
      }
   }

   private static void wipe() {
      com.wimpyclient.n.d.INSTANCE.reset();
      JOINED_AT.clear();
   }
}
