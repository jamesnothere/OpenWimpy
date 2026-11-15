package com.wimpyclient.mixin;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.blaze3d.platform.InputConstants.Key;
import com.mojang.blaze3d.platform.InputConstants.Type;
import com.wimpyclient.bridge.BridgeGate;
import com.wimpyclient.bridge.ClickOverlayAccess;
import com.wimpyclient.localauth.WimpyLoader;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.KeyboardHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.options.controls.KeyBindsScreen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({KeyboardHandler.class})
public class v {
   @Shadow
   @Final
   private Minecraft minecraft;

   public v() {
   }

   @Inject(
      method = {"keyPress(JILnet/minecraft/client/input/KeyEvent;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$overlayKey(long var1, int var3, KeyEvent var4, CallbackInfo var5) {
      if (this.minecraft.getWindow().handle() == var1) {
         if (var3 == 1
            && this.isOpenMenuKey(var4)
            && !(this.minecraft.screen instanceof KeyBindsScreen)
            && !(this.minecraft.screen instanceof com.wimpyclient.localauth.c)) {
            ClickOverlayAccess var6 = BridgeGate.overlay();
            if (BridgeGate.ready() && var6 != null && !var6.isCapturingKeybind()) {
               var6.toggle(this.minecraft);
               var5.cancel();
               return;
            }

            if (!BridgeGate.ready()) {
               WimpyLoader.openKeyPrompt(this.minecraft, null);
               var5.cancel();
               return;
            }
         }

         if (BridgeGate.ready()) {
            ClickOverlayAccess var7 = BridgeGate.overlay();
            if (var7 != null && var7.isOpen()) {
               if (var3 == 1 || var3 == 2) {
                  var7.keyPressed(var4);
                  var5.cancel();
               }
            }
         }
      }
   }

   private boolean isOpenMenuKey(KeyEvent var1) {
      KeyMapping var2 = BridgeGate.openMenuKey();
      if (var2 == null) {
         return false;
      } else {
         Key var3 = KeyBindingHelper.getBoundKeyOf(var2);
         return var3.getType() == Type.KEYSYM && var3.getValue() != InputConstants.UNKNOWN.getValue() ? InputConstants.getKey(var1).equals(var3) : false;
      }
   }

   @Inject(
      method = {"charTyped(JLnet/minecraft/client/input/CharacterEvent;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$overlayChar(long var1, CharacterEvent var3, CallbackInfo var4) {
      if (BridgeGate.ready()) {
         ClickOverlayAccess var5 = BridgeGate.overlay();
         if (var5 != null && var5.isOpen() && this.minecraft.getWindow().handle() == var1) {
            var5.charTyped(var3);
            var4.cancel();
         }
      }
   }
}
