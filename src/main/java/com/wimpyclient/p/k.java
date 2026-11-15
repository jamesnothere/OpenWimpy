package com.wimpyclient.p;

import com.wimpyclient.i.ah;
import com.wimpyclient.i.aj;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;

@Environment(EnvType.CLIENT)
public final class k {
   private k() {
   }

   public static void releaseAttackAndMovement(Minecraft var0) {
      if (var0 != null && var0.options != null) {
         Options var1 = var0.options;
         setUp(var1.keyAttack);
         setUp(var1.keyUse);
         setUp(var1.keyUp);
         setUp(var1.keyDown);
         setUp(var1.keyLeft);
         setUp(var1.keyRight);
         setUp(var1.keyJump);
         setUp(var1.keyShift);
         setUp(var1.keySprint);
      }
   }

   public static void fullReset(Minecraft var0) {
      o.stop(var0);
      com.wimpyclient.i.d.INSTANCE.abort();
      com.wimpyclient.i.c.INSTANCE.abort();
      ah.INSTANCE.release(var0);
      aj.INSTANCE.abort();
      releaseAttackAndMovement(var0);

      try {
         b.clearPathWithoutInputWipe();
      } catch (Throwable var3) {
      }

      if (var0 != null) {
         com.wimpyclient.g.g.INSTANCE.forceClose(var0);
         if (var0.gui != null && var0.screen == null && var0.level != null && var0.mouseHandler != null && !var0.mouseHandler.isMouseGrabbed()) {
            try {
               var0.mouseHandler.grabMouse();
            } catch (Throwable var2) {
            }
         }
      }
   }

   private static void setUp(KeyMapping var0) {
      if (var0 != null) {
         var0.setDown(false);
      }
   }
}
