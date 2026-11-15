package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.util.FormattedCharSequence;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin({GuiGraphics.class})
public class q {
   public q() {
   }

   @Redirect(
      method = {"drawString(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V", "drawCenteredString(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;III)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/chat/Component;getVisualOrderText()Lnet/minecraft/util/FormattedCharSequence;"
      )}
   )
   private FormattedCharSequence wimpyclient$fakeNameGlyphs(Component var1) {
      return !BridgeGate.ready() ? var1.getVisualOrderText() : com.wimpyclient.i.n.rewrite(var1).getVisualOrderText();
   }
}
