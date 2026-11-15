package com.wimpyclient.d;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.blaze3d.platform.InputConstants;
import com.wimpyclient.auth.LicenseGate;
import com.wimpyclient.i.v;
import com.wimpyclient.i.x;
import com.wimpyclient.j.b;
import com.wimpyclient.j.c;
import com.wimpyclient.j.d;
import com.wimpyclient.j.e;
import com.wimpyclient.j.f;
import com.wimpyclient.j.g;
import com.wimpyclient.k.k;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;

@Environment(EnvType.CLIENT)
public final class a {
   private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
   private static final Path PATH = FabricLoader.getInstance().getConfigDir().resolve("wimpyclient.json");
   private static boolean loading;

   private a() {
   }

   public static void load() {
      if (Files.isRegularFile(PATH)) {
         boolean var0 = LicenseGate.isAuthorized();
         loading = true;

         try (BufferedReader var1 = Files.newBufferedReader(PATH)) {
            JsonObject var2 = (JsonObject)GSON.fromJson(var1, JsonObject.class);
            if (var2 != null) {
               JsonObject var3 = var2.has("modules") && var2.get("modules").isJsonObject() ? var2.getAsJsonObject("modules") : var2;

               for (v var5 : x.INSTANCE.modules()) {
                  if (var3.has(var5.id()) && var3.get(var5.id()).isJsonObject()) {
                     JsonObject var6 = var3.getAsJsonObject(var5.id());
                     if (var6.has("enabled")) {
                        boolean var7 = var6.get("enabled").getAsBoolean();
                        var5.qq(var0 && var7);
                     }

                     if (var6.has("keybind")) {
                        try {
                           var5.applyKeybind(InputConstants.getKey(var6.get("keybind").getAsString()));
                        } catch (IllegalArgumentException var23) {
                           com.wimpyclient.Wimpy.LOGGER.warn("Invalid saved keybind for {}", var5.id());
                        }
                     }

                     if (var6.has("settings") && var6.get("settings").isJsonObject()) {
                        JsonObject var30 = var6.getAsJsonObject("settings");

                        for (f var9 : var5.settings()) {
                           if (var30.has(var9.name())) {
                              if (var9 instanceof com.wimpyclient.j.a var10) {
                                 var10.set(var30.get(var9.name()).getAsBoolean());
                              } else if (var9 instanceof d var11) {
                                 var11.set(var30.get(var9.name()).getAsInt());
                              } else if (var9 instanceof c var12) {
                                 var12.set(var30.get(var9.name()).getAsDouble());
                              } else if (var9 instanceof b var13) {
                                 var13.setPackedRgb(var30.get(var9.name()).getAsInt());
                              } else if (var9 instanceof e var14) {
                                 var14.set(var30.get(var9.name()).getAsString());
                              } else if (var9 instanceof g var15) {
                                 var15.set(var30.get(var9.name()).getAsString());
                              }
                           }
                        }
                     }
                  }
               }

               int var27 = var2.has("rtpHeatmapSpan") ? var2.get("rtpHeatmapSpan").getAsInt() : 0;
               if (var27 == 450000 && var2.has("rtpHeatmap") && var2.get("rtpHeatmap").isJsonArray()) {
                  JsonArray var28 = var2.getAsJsonArray("rtpHeatmap");
                  int[] var29 = new int[81];
                  int var31 = Math.min(var28.size(), var29.length);

                  for (int var32 = 0; var32 < var31; var32++) {
                     var29[var32] = Math.max(0, var28.get(var32).getAsInt());
                  }

                  com.wimpyclient.e.f.INSTANCE.importCounts(var29);
               }

               if (var2.has("hudLayout") && var2.get("hudLayout").isJsonObject()) {
                  k.INSTANCE.fromJson(var2.getAsJsonObject("hudLayout"));
               }

               return;
            }
         } catch (Exception var25) {
            com.wimpyclient.Wimpy.LOGGER.warn("Failed to load WimpyClient config", var25);
            return;
         } finally {
            loading = false;
         }
      }
   }

   public static void save() {
      save(false);
   }

   public static void save(boolean var0) {
      if (!loading) {
         if (!var0 && !LicenseGate.isAuthorized()) {
            com.wimpyclient.Wimpy.LOGGER.warn("Skipping config save \u2014 license session invalid");
         } else {
            JsonObject var1 = new JsonObject();

            for (v var3 : x.INSTANCE.modules()) {
               JsonObject var4 = new JsonObject();
               var4.addProperty("enabled", var3.qn());
               if (var3.keybind() != null) {
                  var4.addProperty("keybind", var3.boundKey().getName());
               }

               JsonObject var5 = new JsonObject();

               for (f var7 : var3.settings()) {
                  if (var7 instanceof com.wimpyclient.j.a var8) {
                     var5.addProperty(var7.name(), var8.get());
                  } else if (var7 instanceof d var9) {
                     var5.addProperty(var7.name(), var9.get());
                  } else if (var7 instanceof c var10) {
                     var5.addProperty(var7.name(), var10.get());
                  } else if (var7 instanceof b var11) {
                     var5.addProperty(var7.name(), var11.packedRgb());
                  } else if (var7 instanceof e var12) {
                     var5.addProperty(var7.name(), var12.get());
                  } else if (var7 instanceof g var13) {
                     var5.addProperty(var7.name(), var13.get());
                  }
               }

               if (!var5.entrySet().isEmpty()) {
                  var4.add("settings", var5);
               }

               var1.add(var3.id(), var4);
            }

            JsonObject var17 = new JsonObject();
            var17.add("modules", var1);
            JsonArray var18 = new JsonArray();

            for (int var23 : com.wimpyclient.e.f.INSTANCE.exportCounts()) {
               var18.add(var23);
            }

            var17.add("rtpHeatmap", var18);
            var17.addProperty("rtpHeatmapSpan", 450000);
            var17.add("hudLayout", k.INSTANCE.toJson());

            try {
               Files.createDirectories(PATH.getParent());

               try (BufferedWriter var20 = Files.newBufferedWriter(PATH)) {
                  GSON.toJson(var17, var20);
               }
            } catch (IOException var16) {
               com.wimpyclient.Wimpy.LOGGER.warn("Failed to save WimpyClient config", var16);
            }
         }
      }
   }
}
