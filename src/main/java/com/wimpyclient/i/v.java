package com.wimpyclient.i;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.platform.InputConstants.Key;
import com.mojang.blaze3d.platform.InputConstants.Type;
import com.wimpyclient.auth.LicenseGate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import org.lwjgl.glfw.GLFW;

@Environment(EnvType.CLIENT)
public final class v {
   private final String id;
   private final w category;
   private boolean e;
   private final List<com.wimpyclient.j.f> settings = new ArrayList<>();
   private KeyMapping keybind;
   private boolean wasHeld;
   private Component displayName;
   private String displayNameString;

   public v(String var1, w var2, boolean var3) {
      this.id = var1;
      this.category = var2;
      this.e = var3;
   }

   public String id() {
      return this.id;
   }

   public w category() {
      return this.category;
   }

   public boolean qn() {
      return this.e;
   }

   public boolean qo() {
      return this.e && LicenseGate.isAuthorized();
   }

   public void qq(boolean var1) {
      if (var1 && !LicenseGate.isAuthorized()) {
         this.e = false;
      } else {
         this.e = var1;
      }
   }

   public void qp(boolean var1) {
      if (!var1 || LicenseGate.isAuthorized()) {
         if (var1 && !this.e && "flight".equals(this.id)) {
            com.wimpyclient.g.c.INSTANCE.request();
         } else {
            this.e = var1;
            com.wimpyclient.d.a.save();
         }
      }
   }

   public void enableAfterConfirm() {
      if ("flight".equals(this.id) && LicenseGate.isAuthorized()) {
         this.e = true;
         com.wimpyclient.d.a.save();
      }
   }

   public void qr() {
      if (this.e || LicenseGate.isAuthorized()) {
         this.qp(!this.e);
      }
   }

   public Component displayName() {
      if (this.displayName == null) {
         this.displayName = Component.translatable("wimpyclient.module." + this.id);
      }

      return this.displayName;
   }

   public String displayNameString() {
      if (this.displayNameString == null) {
         this.displayNameString = this.displayName().getString();
      }

      return this.displayNameString;
   }

   public v addSetting(com.wimpyclient.j.f var1) {
      this.settings.add(var1);
      return this;
   }

   public List<com.wimpyclient.j.f> settings() {
      return Collections.unmodifiableList(this.settings);
   }

   public boolean hasSettings() {
      return !this.settings.isEmpty();
   }

   public void setKeybind(KeyMapping var1) {
      this.keybind = var1;
   }

   public KeyMapping keybind() {
      return this.keybind;
   }

   public boolean isKeybound() {
      return this.keybind == null ? false : KeyBindingHelper.getBoundKeyOf(this.keybind).getValue() != InputConstants.UNKNOWN.getValue();
   }

   public String keybindLabel() {
      return !this.isKeybound() ? "NONE" : this.keybind.getTranslatedKeyMessage().getString();
   }

   public void bindKey(Key var1) {
      this.applyKeybind(var1);
      if (this.keybind != null) {
         Minecraft var2 = Minecraft.getInstance();
         if (var2 != null && var2.options != null) {
            var2.options.save();
         }

         try {
            com.wimpyclient.d.a.save();
         } catch (RuntimeException var4) {
            com.wimpyclient.Wimpy.LOGGER.warn("Could not save keybind to Wimpy config", var4);
         }
      }
   }

   public void applyKeybind(Key var1) {
      if (this.keybind != null && var1 != null) {
         this.keybind.setKey(var1);
         KeyMapping.resetMapping();
         this.resetKeyState();
      }
   }

   public void clearKeybind() {
      this.bindKey(InputConstants.UNKNOWN);
   }

   public Key boundKey() {
      return this.keybind == null ? InputConstants.UNKNOWN : KeyBindingHelper.getBoundKeyOf(this.keybind);
   }

   public boolean samePhysicalBind(v var1) {
      if (var1 != null && this.isKeybound() && var1.isKeybound()) {
         Key var2 = this.boundKey();
         Key var3 = var1.boundKey();
         return var2.getType() == var3.getType() && var2.getValue() == var3.getValue();
      } else {
         return false;
      }
   }

   public boolean pollRisingEdge() {
      this.drainVanillaClicks();
      boolean var1 = this.isHeld();
      boolean var2 = var1 && !this.wasHeld;
      this.wasHeld = var1;
      return var2;
   }

   public boolean isHeld() {
      if (!this.isKeybound()) {
         return false;
      } else {
         Minecraft var1 = Minecraft.getInstance();
         if (var1 != null && var1.getWindow() != null) {
            Key var2 = this.boundKey();
            Window var3 = var1.getWindow();
            return var2.getType() == Type.MOUSE
               ? GLFW.glfwGetMouseButton(var3.handle(), var2.getValue()) == 1
               : InputConstants.isKeyDown(var3, var2.getValue());
         } else {
            return false;
         }
      }
   }

   public void resetKeyState() {
      this.drainVanillaClicks();
      if (this.keybind != null) {
         this.keybind.setDown(false);
      }

      this.wasHeld = this.isHeld();
   }

   private void drainVanillaClicks() {
      if (this.keybind != null) {
         while (this.keybind.consumeClick()) {
         }
      }
   }
}
