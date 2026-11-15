package com.wimpyclient;

import com.wimpyclient.auth.LicenseChat;
import com.wimpyclient.auth.LicenseGate;
import com.wimpyclient.i.q;
import com.wimpyclient.i.r;
import com.wimpyclient.i.x;
import com.wimpyclient.p.k;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;

@Environment(EnvType.CLIENT)
public final class LicenseLifecycle {
   private static boolean wasAuthorized;
   private static boolean wasFree;

   private LicenseLifecycle() {
   }

   public static void observeAuth(Minecraft var0) {
      boolean var1 = LicenseGate.isAuthorized();
      if (var1) {
         boolean var2 = LicenseGate.isFreeKey();
         if (var2 && !wasFree) {
            com.wimpyclient.f.a.INSTANCE.invalidateAllSusScans();
         }

         wasFree = var2;
         wasAuthorized = true;
      } else if (wasAuthorized) {
         wasAuthorized = false;
         wasFree = false;
         com.wimpyclient.d.a.save(true);
         x.INSTANCE.disableAllForLicense();
         q.INSTANCE.reset();
         r.INSTANCE.reset();
         k.fullReset(var0);
         LicenseChat.sessionEnded();
      }
   }

   public static void onAuthLost() {
      Minecraft var0 = Minecraft.getInstance();
      if (var0 != null) {
         var0.execute(() -> observeAuth(var0));
      }
   }

   public static void stopClient() {
      onAuthLost();
   }
}
