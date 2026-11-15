package com.wimpyclient;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.blaze3d.platform.InputConstants.Type;
import com.wimpyclient.a.b;
import com.wimpyclient.auth.LicenseChat;
import com.wimpyclient.auth.LicenseGate;
import com.wimpyclient.bridge.BridgeGate;
import com.wimpyclient.f.c;
import com.wimpyclient.f.h;
import com.wimpyclient.g.g;
import com.wimpyclient.i.ab;
import com.wimpyclient.i.ac;
import com.wimpyclient.i.af;
import com.wimpyclient.i.ah;
import com.wimpyclient.i.ai;
import com.wimpyclient.i.e;
import com.wimpyclient.i.f;
import com.wimpyclient.i.i;
import com.wimpyclient.i.j;
import com.wimpyclient.i.l;
import com.wimpyclient.i.q;
import com.wimpyclient.i.r;
import com.wimpyclient.i.t;
import com.wimpyclient.i.x;
import com.wimpyclient.i.y;
import com.wimpyclient.i.z;
import com.wimpyclient.k.d;
import com.wimpyclient.p.k;
import com.wimpyclient.p.m;
import com.wimpyclient.p.o;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStopping;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndTick;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.StartTick;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraft.client.KeyMapping.Category;

@Environment(EnvType.CLIENT)
public final class WimpyClient implements ClientModInitializer {
   public static KeyMapping OPEN_MENU_KEY;
   private KeyMapping openMenuKey;

   public WimpyClient() {
   }

   public void onInitializeClient() {
      Options var1 = Minecraft.getInstance().options;
      boolean var2 = var1 != null;
      KeyMapping var3 = BridgeGate.openMenuKey();
      Category var4 = var3 != null ? var3.getCategory() : Category.register(Wimpy.id("main"));
      if (var3 == null) {
         KeyMapping var5 = new KeyMapping("key.wimpyclient.open_menu", Type.KEYSYM, 344, var4);
         this.openMenuKey = var2 ? var5 : KeyBindingHelper.registerKeyBinding(var5);
      } else {
         this.openMenuKey = var3;
      }

      OPEN_MENU_KEY = this.openMenuKey;
      BridgeGate.bindOpenMenuKey(this.openMenuKey);
      List<KeyMapping> var6 = x.INSTANCE.registerKeybinds(var4, this.openMenuKey, var2);
      if (var2) {
         if (var3 != null) {
            var6 = new ArrayList((Collection)var6);
            var6.remove(this.openMenuKey);
         }

         registerLateKeybinds(var1, (List<KeyMapping>)var6);
      }

      d.INSTANCE.register();
      com.wimpyclient.d.a.load();
      b.load();
      com.wimpyclient.q.a.INSTANCE.start();
      com.wimpyclient.r.b.INSTANCE.start();
      if (!LicenseGate.isAuthorized()) {
         x.INSTANCE.disableAllForLicense();
      }

      ClientLifecycleEvents.CLIENT_STOPPING.register((ClientStopping)var0 -> {
         k.fullReset(var0);
         com.wimpyclient.p.b.shutdownForClientExit();
         com.wimpyclient.g.a.shutdown();
         com.wimpyclient.q.a.INSTANCE.stop();
         com.wimpyclient.r.b.INSTANCE.stop();
      });
      ClientTickEvents.START_CLIENT_TICK.register((StartTick)var0 -> {
         if (LicenseGate.isAuthorized()) {
            if (o.isActive()) {
               o.tick(var0);
            } else {
               j.INSTANCE.tick(var0);
            }

            ah.INSTANCE.tick(var0);
            c.INSTANCE.tick(var0);
            h.INSTANCE.tick(var0);
         }
      });
      ClientTickEvents.END_CLIENT_TICK.register((EndTick)var1x -> {
         while (this.openMenuKey.consumeClick()) {
         }

         g.INSTANCE.tick();
         com.wimpyclient.r.b.INSTANCE.tick(var1x);
         LicenseLifecycle.observeAuth(var1x);
         LicenseChat.announceIfNeeded();
         if (!LicenseGate.isAuthorized()) {
            if (var1x.screen == null && !g.INSTANCE.isOpen()) {
               x.INSTANCE.tickKeybinds();
            }
         } else {
            LicenseChat.maybeWarnExpiring();
            if (var1x.screen == null && !g.INSTANCE.isOpen()) {
               x.INSTANCE.tickKeybinds();
            }

            q.INSTANCE.tick(var1x);
            r.INSTANCE.tick(var1x);
            if (!o.isActive() && (com.wimpyclient.p.b.isForcingLeftClick() || var1x.gameMode != null && var1x.gameMode.isDestroying())) {
               j.INSTANCE.tick(var1x);
            }

            e.INSTANCE.tick(var1x);
            com.wimpyclient.i.d.INSTANCE.tick(var1x);
            com.wimpyclient.i.c.INSTANCE.tick(var1x);
            ab.INSTANCE.tick(var1x);
            y.INSTANCE.tick(var1x);
            t.INSTANCE.tick(var1x);
            l.INSTANCE.tick(var1x);
            com.wimpyclient.i.a.INSTANCE.tick(var1x);
            f.INSTANCE.tick(var1x);
            com.wimpyclient.i.g.INSTANCE.tick(var1x);
            i.INSTANCE.tick(var1x);
            af.INSTANCE.tick(var1x);
            ai.INSTANCE.tick(var1x);
            z.tick(var1x);
            ac.INSTANCE.tick(var1x);
            com.wimpyclient.p.l.tick(var1x);
            com.wimpyclient.k.x.tick(var1x);
            com.wimpyclient.f.a.INSTANCE.tick(var1x);
            com.wimpyclient.f.b.INSTANCE.tick(var1x);
            com.wimpyclient.i.h.INSTANCE.tick(var1x);
            com.wimpyclient.p.b.tickPathKeepAlive(var1x);
            m.tick(var1x);
            com.wimpyclient.f.f.INSTANCE.tick(var1x);
         }
      });
      Wimpy.LOGGER.info("WimpyClient initialized");
   }

   private static void registerLateKeybinds(Options var0, List<KeyMapping> var1) {
      KeyMapping[] var2 = var0.keyMappings;
      KeyMapping[] var3 = Arrays.copyOf(var2, var2.length + var1.size());

      for (int var4 = 0; var4 < var1.size(); var4++) {
         var3[var2.length + var4] = (KeyMapping)var1.get(var4);
      }

      try {
         for (Field var7 : Options.class.getDeclaredFields()) {
            if (var7.getType() == KeyMapping[].class) {
               var7.setAccessible(true);
               if (var7.get(var0) == var2) {
                  var7.set(var0, var3);
                  restoreSavedKeybinds(var0, var1);
                  KeyMapping.resetMapping();
                  return;
               }
            }
         }
      } catch (SecurityException | ReflectiveOperationException var8) {
         throw new IllegalStateException("Cannot register Wimpy keybinds after startup", var8);
      }

      throw new IllegalStateException("Minecraft keybind list was not found");
   }

   private static void restoreSavedKeybinds(Options var0, List<KeyMapping> var1) {
      if (var0.getFile().isFile()) {
         HashMap var2 = new HashMap();

         for (KeyMapping var4 : var1) {
            var2.put("key_" + var4.getName(), var4);
         }

         try {
            for (String var11 : Files.readAllLines(var0.getFile().toPath(), StandardCharsets.UTF_8)) {
               int var5 = var11.indexOf(58);
               if (var5 >= 0) {
                  KeyMapping var6 = (KeyMapping)var2.get(var11.substring(0, var5));
                  if (var6 != null) {
                     try {
                        var6.setKey(InputConstants.getKey(var11.substring(var5 + 1)));
                     } catch (IllegalArgumentException var8) {
                        Wimpy.LOGGER.warn("Invalid saved keybind for {}", var6.getName());
                     }
                  }
               }
            }
         } catch (IOException var9) {
            Wimpy.LOGGER.warn("Could not read saved keybinds", var9);
         }
      }
   }
}
