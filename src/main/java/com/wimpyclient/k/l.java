package com.wimpyclient.k;

import net.minecraft.world.level.biome.Biome;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.CameraType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class l {
   private static final String LOGO_RESOURCE = "assets/wimpyclient/textures/gui/logo.png";
   private static final int LOGO_TEX_W = 96;
   private static final int LOGO_TEX_H = 128;
   private static final float LOGO_DRAW_H = 18.0F;
   private static final float WATERMARK_H = 30.0F;
   private static final float WATERMARK_PAD = 13.0F;
   private static int logoHandle = Integer.MIN_VALUE;
   private static final float PILL_H = 22.0F;
   private static final float PILL_PAD = 9.0F;
   private static final float PILL_FONT = 13.0F;
   private static final float ARRAY_H = 20.0F;
   private static final float ARRAY_FONT = 13.5F;
   private static final float ARRAY_PAD = 8.0F;
   private static final float STRIP_W = 2.5F;
   private static final float GAP = 6.0F;
   private static final float MARGIN = 8.0F;
   private static final Map<com.wimpyclient.i.v, com.wimpyclient.l.a> ARRAY_SLIDE = new HashMap<>();
   private static final List<com.wimpyclient.i.v> ARRAY_ENTRIES = new ArrayList<>();
   private static final Map<com.wimpyclient.i.v, Float> ARRAY_WIDTHS = new IdentityHashMap<>();
   private static int arrayWidthEpoch = -1;

   private l() {
   }

   public static void renderNvg(com.wimpyclient.m.b var0, float var1, float var2) {
      com.wimpyclient.i.x var3 = com.wimpyclient.i.x.INSTANCE;
      if (!var3.hud.qo()) {
         k.INSTANCE.clearReport(k$d.WATERMARK);
         k.INSTANCE.clearReport(k$d.KEYBINDS);
         k.INSTANCE.clearReport(k$d.ARRAYLIST);
         k.INSTANCE.clearReport(k$d.INFO);
         k.INSTANCE.clearReport(k$d.STATUS_EFFECTS);
      } else {
         Minecraft var4 = Minecraft.getInstance();
         LocalPlayer var5 = var4.player;
         if (var5 != null && var4.level != null) {
            com.wimpyclient.o.b var6 = com.wimpyclient.o.b.INSTANCE;
            float var7 = 8.0F;
            if (var3.hudWatermark) {
               float var8 = k.INSTANCE.x(k$d.WATERMARK, 8.0F);
               float var9 = k.INSTANCE.y(k$d.WATERMARK, var7);
               var7 = drawWatermark(var0, var6, var8, var9) + 6.0F;
            } else {
               k.INSTANCE.clearReport(k$d.WATERMARK);
            }

            if (var3.hudKeybinds) {
               float var11 = k.INSTANCE.x(k$d.KEYBINDS, 8.0F);
               float var12 = k.INSTANCE.y(k$d.KEYBINDS, var7);
               var7 = drawKeybindMenu(var0, var6, var11, var12) + 6.0F;
            } else {
               k.INSTANCE.clearReport(k$d.KEYBINDS);
            }

            if (var3.hudArraylist) {
               drawArraylist(var0, var6, var1, var2);
            } else {
               k.INSTANCE.clearReport(k$d.ARRAYLIST);
            }

            drawInfoPills(var0, var6, var4, var5, var3, var1, var2);
         }
      }
   }

   private static float drawWatermark(com.wimpyclient.m.b var0, com.wimpyclient.o.b var1, float var2, float var3) {
      String var4 = "Wimpy";
      String var5 = "client";
      ensureLogo(var0);
      float var6 = 18.0F;
      float var7 = logoHandle >= 0 ? Math.max(1.0F, var6 * 96.0F / 128.0F) : 0.0F;
      float var8 = var0.textWidth(18.0F, var4);
      float var9 = var0.textWidth(14.0F, var5);
      float var10 = 13.0F + var7 + (var7 > 0.0F ? 6.0F : 0.0F) + var8 + 7.0F + var9 + 13.0F;
      float var11 = 30.0F;
      float var12 = k.INSTANCE.beginElement(var0, k$d.WATERMARK, var2, var3);

      try {
         float var13 = var3 + var11 / 2.0F;
         float var14 = (float)(0.5 + 0.5 * Math.sin(System.nanoTime() / 4.0E8));
         int var15 = com.wimpyclient.p.g.lerp(var1.accentBright(), var1.accent(), var14);
         int var16 = com.wimpyclient.p.g.lerp(var1.accent(), var1.accentBright(), var14);
         e.glassCapsule(var0, var2, var3, var10, var11);
         if (k.INSTANCE.editMode()) {
            var0.rectOutline(var2, var3, var10, var11, var11 / 2.0F, 1.2F, com.wimpyclient.p.g.withAlpha(var1.accentBright(), 0.55F));
         }

         float var17 = var2 + 13.0F;
         if (logoHandle >= 0) {
            e.logo(var0, logoHandle, var17, var3 + (var11 - var6) / 2.0F, var7, var6);
            var17 += var7 + 6.0F;
         }

         var0.textGradient(var17, var13, 18.0F, var15, var16, var4);
         var17 += var8 + 7.0F;
         var0.circle(var17 - 4.5F, var13, 1.4F, com.wimpyclient.p.g.withAlpha(var1.textMuted(), 0.8F));
         var0.text(var17, var13, 14.0F, com.wimpyclient.p.g.withAlpha(var1.textPrimary(), 0.92F), var5);
      } finally {
         k.INSTANCE.endElement(var0, var12);
      }

      k.INSTANCE.reportScaled(k$d.WATERMARK, var2, var3, var10, var11);
      return var3 + var11 * var12;
   }

   private static void ensureLogo(com.wimpyclient.m.b var0) {
      if (logoHandle == Integer.MIN_VALUE) {
         logoHandle = var0.loadImage("assets/wimpyclient/textures/gui/logo.png");
      }
   }

   private static void drawInfoPills(
      com.wimpyclient.m.b var0, com.wimpyclient.o.b var1, Minecraft var2, LocalPlayer var3, com.wimpyclient.i.x var4, float var5, float var6
   ) {
      ArrayList<l$b> var7 = new ArrayList<>();
      Vec3 var8 = com.wimpyclient.i.q.INSTANCE.isActive()
         ? new Vec3(com.wimpyclient.i.q.INSTANCE.x(), com.wimpyclient.i.q.INSTANCE.y(), com.wimpyclient.i.q.INSTANCE.z())
         : var3.position();
      if (var4.hudFps) {
         var7.add(new l$b("FPS", Integer.toString(var2.getFps()), var1.textPrimary()));
      }

      if (var4.hudPing) {
         int var9 = com.wimpyclient.p.l.resolvePing(var2);
         var7.add(new l$b("Ping", var9 >= 0 ? var9 + "ms" : "--ms", pingColor(var9)));
      }

      if (var4.hudCoords) {
         var7.add(new l$b("XYZ", String.format("%.1f, %.1f, %.1f", var8.x, var8.y, var8.z), var1.textPrimary()));
      }

      if (var4.hudChunk) {
         int var30 = Mth.floor(var8.x) >> 4;
         int var10 = Mth.floor(var8.z) >> 4;
         var7.add(new l$b("Chunk", var30 + " " + var10, var1.textPrimary()));
      }

      if (var4.hudDirection) {
         float var31 = com.wimpyclient.i.q.INSTANCE.isActive() && com.wimpyclient.i.q.INSTANCE.camera() != null
            ? com.wimpyclient.i.q.INSTANCE.camera().getYRot()
            : var3.getYRot();
         Direction var34 = Direction.fromYRot(var31);

         String var11 = switch (var34) {
            case NORTH -> "N  -Z";
            case SOUTH -> "S  +Z";
            case WEST -> "W  -X";
            case EAST -> "E  +X";
            default -> var34.getSerializedName().toUpperCase();
         };
         var7.add(new l$b("Facing", var11, var1.textPrimary()));
      }

      if (var4.hudSpeed) {
         var7.add(new l$b("Speed", String.format("%.2f", playerSpeedBps(var3)), var1.textPrimary()));
      }

      if (var4.hudBiome) {
         BlockPos var32 = BlockPos.containing(var8);
         Holder<Biome> var35 = var2.level.getBiome(var32);
         String var37 = var35.unwrapKey().map(ResourceKey::identifier).map(var0x -> prettify(var0x.getPath())).orElse("Unknown");
         var7.add(new l$b("Biome", var37, var1.textPrimary()));
      }

      if (var7.isEmpty()) {
         k.INSTANCE.clearReport(k$d.INFO);
      } else {
         ArrayList var33 = new ArrayList(var7.size());
         float var36 = 0.0F;
         float var38 = 0.0F;
         int var12 = 1;

         for (l$b var14 : var7) {
            float var15 = 9.0F + var0.textWidth(13.0F, var14.label()) + 5.0F + var0.textWidth(13.0F, var14.value()) + 9.0F;
            var33.add(var15);
            if (var36 > 0.0F && var36 + 6.0F + var15 > var5 - 16.0F) {
               var38 = Math.max(var38, var36);
               var36 = var15;
               var12++;
            } else {
               var36 = var36 > 0.0F ? var36 + 6.0F + var15 : var15;
            }
         }

         var38 = Math.max(var38, var36);
         float var40 = var12 * 22.0F + (var12 - 1) * 4.0F;
         float var41 = 8.0F;
         float var42 = var6 - 8.0F - var40;
         float var16 = k.INSTANCE.x(k$d.INFO, var41);
         float var17 = k.INSTANCE.y(k$d.INFO, var42);
         float var18 = var16;
         float var19 = var17;
         float var20 = var16;
         float var21 = var17;
         float var22 = var16;
         float var23 = var17 + 22.0F;
         float var24 = k.INSTANCE.beginElement(var0, k$d.INFO, var16, var17);

         try {
            for (int var25 = 0; var25 < var7.size(); var25++) {
               float var26 = (Float)var33.get(var25);
               if (var18 > var16 && var18 + var26 > var5 - 8.0F) {
                  var18 = var16;
                  var19 += 26.0F;
               }

               drawPill(var0, var1, var18, var19, var26, (l$b)var7.get(var25));
               var20 = Math.min(var20, var18);
               var21 = Math.min(var21, var19);
               var22 = Math.max(var22, var18 + var26);
               var23 = Math.max(var23, var19 + 22.0F);
               var18 += var26 + 6.0F;
            }

            if (k.INSTANCE.editMode()) {
               var0.rectOutline(var20, var21, var22 - var20, var23 - var21, 6.0F, 1.2F, com.wimpyclient.p.g.withAlpha(var1.accentBright(), 0.55F));
            }
         } finally {
            k.INSTANCE.endElement(var0, var24);
         }

         k.INSTANCE.reportScaled(k$d.INFO, var16, var17, var22 - var16, var23 - var17);
      }
   }

   private static void drawPill(com.wimpyclient.m.b var0, com.wimpyclient.o.b var1, float var2, float var3, float var4, l$b var5) {
      float var6 = 22.0F;
      float var7 = var3 + var6 / 2.0F;
      e.glassCapsule(var0, var2, var3, var4, var6);
      float var8 = var2 + 9.0F;
      var8 += var0.textGradient(var8, var7, 13.0F, var1.accentBright(), var1.accent(), var5.label());
      var0.text(var8 + 5.0F, var7, 13.0F, var5.color(), var5.value());
   }

   private static float drawKeybindMenu(com.wimpyclient.m.b var0, com.wimpyclient.o.b var1, float var2, float var3) {
      ArrayList<com.wimpyclient.i.v> var4 = new ArrayList<>();

      for (com.wimpyclient.i.v var6 : com.wimpyclient.i.x.INSTANCE.modules()) {
         if (var6.isKeybound()) {
            var4.add(var6);
         }
      }

      if (var4.isEmpty()) {
         k.INSTANCE.clearReport(k$d.KEYBINDS);
         return var3;
      } else {
         var4.sort(Comparator.comparing(com.wimpyclient.i.v::displayNameString, String.CASE_INSENSITIVE_ORDER));
         float var21 = 12.0F;
         float var22 = 18.0F;
         float var7 = var0.textWidth(var21, "Keybinds");

         for (com.wimpyclient.i.v var9 : var4) {
            float var10 = var0.textWidth(var21, var9.displayName().getString()) + 10.0F + var0.textWidth(var21, var9.keybindLabel());
            var7 = Math.max(var7, var10);
         }

         float var23 = 10.0F;
         float var24 = var23 * 2.0F + var7;
         float var25 = var23 * 2.0F + (var4.size() + 1) * var22 - 4.0F;
         float var11 = k.INSTANCE.beginElement(var0, k$d.KEYBINDS, var2, var3);

         try {
            e.glassPanel(var0, var2, var3, var24, var25, 8.0F);
            if (k.INSTANCE.editMode()) {
               var0.rectOutline(var2, var3, var24, var25, 8.0F, 1.2F, com.wimpyclient.p.g.withAlpha(var1.accentBright(), 0.55F));
            }

            float var12 = var3 + var23 + var22 / 2.0F;
            var0.textGradient(var2 + var23, var12, var21, var1.accentBright(), var1.accent(), "Keybinds");
            var12 += var22;

            for (com.wimpyclient.i.v var14 : var4) {
               String var15 = var14.displayName().getString();
               String var16 = var14.keybindLabel();
               var0.text(var2 + var23, var12, var21, var1.textPrimary(), var15);
               float var17 = var0.textWidth(var21, var16);
               var0.text(var2 + var24 - var23 - var17, var12, var21, var1.textMuted(), var16);
               var12 += var22;
            }
         } finally {
            k.INSTANCE.endElement(var0, var11);
         }

         k.INSTANCE.reportScaled(k$d.KEYBINDS, var2, var3, var24, var25);
         return var3 + var25 * var11;
      }
   }

   private static void drawArraylist(com.wimpyclient.m.b var0, com.wimpyclient.o.b var1, float var2, float var3) {
      ARRAY_ENTRIES.clear();

      for (com.wimpyclient.i.v var5 : com.wimpyclient.i.x.INSTANCE.modules()) {
         if (var5.category() != com.wimpyclient.i.w.CLIENT && !var5.id().equals("hud")) {
            com.wimpyclient.l.a var6 = ARRAY_SLIDE.computeIfAbsent(var5, var0x -> {
               com.wimpyclient.l.a var1x = new com.wimpyclient.l.a(12.0F);
               var1x.snap(var0x.qo() ? 1.0F : 0.0F);
               return var1x;
            });
            var6.setTarget(var5.qo() ? 1.0F : 0.0F);
            var6.update();
            if (var5.qo() || var6.get() > 0.01F) {
               ARRAY_ENTRIES.add(var5);
            }
         }
      }

      Iterator var32 = ARRAY_SLIDE.entrySet().iterator();

      while (var32.hasNext()) {
         Entry var33 = (Entry)var32.next();
         if (!((com.wimpyclient.i.v)var33.getKey()).qo() && ((com.wimpyclient.l.a)var33.getValue()).get() <= 0.01F) {
            ARRAY_WIDTHS.remove(var33.getKey());
            var32.remove();
         }
      }

      if (!ARRAY_ENTRIES.isEmpty()) {
         int var34 = System.identityHashCode(var0) ^ Float.floatToIntBits(13.5F);
         if (var34 != arrayWidthEpoch) {
            ARRAY_WIDTHS.clear();
            arrayWidthEpoch = var34;
         }

         int var35 = 0;

         for (int var7 = ARRAY_ENTRIES.size(); var35 < var7; var35++) {
            com.wimpyclient.i.v var8 = ARRAY_ENTRIES.get(var35);
            if (!ARRAY_WIDTHS.containsKey(var8)) {
               ARRAY_WIDTHS.put(var8, var0.textWidth(13.5F, var8.displayNameString()));
            }
         }

         ARRAY_ENTRIES.sort((var0x, var1x) -> {
            float var2x = ARRAY_WIDTHS.getOrDefault(var0x, 0.0F);
            float var3x = ARRAY_WIDTHS.getOrDefault(var1x, 0.0F);
            return var2x != var3x ? Float.compare(var3x, var2x) : var0x.displayNameString().compareToIgnoreCase(var1x.displayNameString());
         });
         float var36 = x.topRightReserve();
         float var37 = 0.0F;
         int var38 = 0;

         for (int var9 = ARRAY_ENTRIES.size(); var38 < var9; var38++) {
            com.wimpyclient.i.v var10 = ARRAY_ENTRIES.get(var38);
            float var11 = ARRAY_SLIDE.get(var10).get();
            if (!(var11 <= 0.01F)) {
               float var12 = ARRAY_WIDTHS.getOrDefault(var10, 0.0F);
               var37 = Math.max(var37, var12 + 16.0F + 2.5F + 2.0F);
            }
         }

         if (var37 <= 0.0F) {
            k.INSTANCE.clearReport(k$d.ARRAYLIST);
         } else {
            float var39 = var2 - 8.0F - var37;
            float var40 = 8.0F + var36;
            float var41 = k.INSTANCE.x(k$d.ARRAYLIST, var39);
            float var42 = k.INSTANCE.y(k$d.ARRAYLIST, var40);
            float var43 = Float.POSITIVE_INFINITY;
            float var13 = var42;
            float var14 = Float.NEGATIVE_INFINITY;
            float var15 = var42;
            float var16 = var42;
            float var17 = k.INSTANCE.beginElement(var0, k$d.ARRAYLIST, var41, var42);

            try {
               int var18 = 0;

               for (int var19 = ARRAY_ENTRIES.size(); var18 < var19; var18++) {
                  com.wimpyclient.i.v var20 = ARRAY_ENTRIES.get(var18);
                  float var21 = ARRAY_SLIDE.get(var20).get();
                  if (!(var21 <= 0.01F)) {
                     String var22 = var20.displayNameString();
                     float var23 = ARRAY_WIDTHS.getOrDefault(var20, 0.0F);
                     float var24 = var23 + 16.0F + 2.5F + 2.0F;
                     float var25 = (1.0F - var21) * (var24 + 12.0F);
                     float var26 = Math.round(var41 + (var37 - var24) + var25);
                     float var27 = Math.round(var42);
                     if (var27 + 20.0F > var3 - 4.0F) {
                        break;
                     }

                     var0.save();
                     var0.alpha(var21);
                     e.glassPanel(var0, var26, var27, var24, 20.0F, 5.0F, false);
                     float var28 = var26 + var24 - 2.5F;
                     var0.rect(var28, var27 + 2.0F, 2.5F, 16.0F, 1.25F, var1.accent());
                     var0.textGradient(Math.round(var26 + 8.0F), var27 + 10.0F, 13.5F, var1.accentBright(), var1.accent(), var22);
                     var0.restore();
                     var43 = Math.min(var43, var26);
                     var14 = Math.max(var14, var26 + var24);
                     var15 = var27 + 20.0F;
                     var42 += 20.0F * var21;
                  }
               }

               if (var43 < var14 && k.INSTANCE.editMode()) {
                  var0.rectOutline(var43, var13, var14 - var43, var15 - var13, 5.0F, 1.2F, com.wimpyclient.p.g.withAlpha(var1.accentBright(), 0.55F));
               }
            } finally {
               k.INSTANCE.endElement(var0, var17);
            }

            if (var43 < var14) {
               k.INSTANCE.reportScaled(k$d.ARRAYLIST, var41, var16, Math.max(var37, var14 - var41), Math.max(20.0F, var15 - var16));
            } else {
               k.INSTANCE.clearReport(k$d.ARRAYLIST);
            }
         }
      }
   }

   private static double playerSpeedBps(LocalPlayer var0) {
      Vec3 var1 = var0.getDeltaMovement();
      double var2 = Math.sqrt(var1.x * var1.x + var1.z * var1.z) * 20.0;
      if (var2 >= 0.05) {
         return var2;
      } else {
         double var4 = var0.getX() - var0.xo;
         double var6 = var0.getZ() - var0.zo;
         return Math.sqrt(var4 * var4 + var6 * var6) * 20.0;
      }
   }

   private static String prettify(String var0) {
      String[] var1 = var0.split("_");
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (var3 > 0) {
            var2.append(' ');
         }

         if (!var1[var3].isEmpty()) {
            var2.append(Character.toUpperCase(var1[var3].charAt(0)));
            if (var1[var3].length() > 1) {
               var2.append(var1[var3].substring(1));
            }
         }
      }

      return var2.toString();
   }

   private static int pingColor(int var0) {
      if (var0 < 0) {
         return com.wimpyclient.o.b.INSTANCE.textMuted();
      } else if (var0 <= 80) {
         return com.wimpyclient.o.b.INSTANCE.accent();
      } else {
         return var0 <= 180 ? com.wimpyclient.o.b.INSTANCE.warn() : -41878;
      }
   }

   public static boolean isLocalBodyVisible(Minecraft var0) {
      if (!com.wimpyclient.i.q.INSTANCE.isActive() && !com.wimpyclient.i.r.INSTANCE.isActive()) {
         CameraType var1 = var0.options.getCameraType();
         return var1 != null && !var1.isFirstPerson();
      } else {
         return true;
      }
   }
}
