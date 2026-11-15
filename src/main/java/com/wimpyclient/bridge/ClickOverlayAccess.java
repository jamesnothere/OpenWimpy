package com.wimpyclient.bridge;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;

@Environment(EnvType.CLIENT)
public interface ClickOverlayAccess {
   boolean isOpen();

   boolean isCapturingKeybind();

   void toggle(Minecraft var1);

   boolean mouseClicked(double var1, double var3, int var5);

   boolean mouseReleased(double var1, double var3, int var5);

   boolean mouseDragged(double var1, double var3, int var5);

   boolean mouseScrolled(double var1, double var3, double var5);

   boolean keyPressed(KeyEvent var1);

   boolean charTyped(CharacterEvent var1);
}
