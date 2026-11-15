package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import com.wimpyclient.bridge.ClickOverlayAccess;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({Screen.class})
public class aw {
   public aw() {
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/gui/GuiGraphics;IIF)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$clickGuiOverScreen(GuiGraphics var1, int var2, int var3, float var4, CallbackInfo var5) {
      Minecraft var6 = Minecraft.getInstance();
      if (var6.screen == (Object)this) {
         if (!BridgeGate.ready()) {
            if ((Object)this instanceof TitleScreen) {
               Screen var9 = (Screen)(Object)this;
               int var8 = var9.height - 9 - 2;
               var1.drawCenteredString(var6.font, "Wimpy: press Right Shift to enter your key", var9.width / 2, var8, -4657152);
            }
         } else {
            ClickOverlayAccess var7 = BridgeGate.overlay();
            if (var7 == null || !var7.isOpen()) {
               ;
            }
         }
      }
   }
}
