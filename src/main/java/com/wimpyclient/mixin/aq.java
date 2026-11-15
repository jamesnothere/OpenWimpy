package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.components.PlayerTabOverlay;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.util.FormattedCharSequence;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({PlayerTabOverlay.class})
public class aq {
   public aq() {
   }

   @Inject(
      method = {"getNameForDisplay(Lnet/minecraft/client/multiplayer/PlayerInfo;)Lnet/minecraft/network/chat/Component;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wimpyclient$fakeTabName(PlayerInfo var1, CallbackInfoReturnable<Component> var2) {
      if (BridgeGate.ready() && var1 != null && var1.getProfile() != null) {
         Component var3 = (Component)var2.getReturnValue();
         if (var3 == null) {
            if (com.wimpyclient.i.n.appliesTo(var1.getProfile().id())) {
               var2.setReturnValue(com.wimpyclient.i.n.getComponent());
            }
         } else {
            if (com.wimpyclient.i.n.appliesTo(var1.getProfile().id())) {
               var2.setReturnValue(com.wimpyclient.i.n.rewriteOwnDisplay(var3));
            } else if (com.wimpyclient.i.n.containsRealName(var3)) {
               var2.setReturnValue(com.wimpyclient.i.n.replaceRealName(var3));
            }
         }
      }
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/gui/GuiGraphics;ILnet/minecraft/world/scores/Scoreboard;Lnet/minecraft/world/scores/Objective;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/Font;split(Lnet/minecraft/network/chat/FormattedText;I)Ljava/util/List;",
         ordinal = 0
      )}
   )
   private List<FormattedCharSequence> wimpyclient$rewriteTabHeader(Font var1, FormattedText var2, int var3) {
      return var1.split(rewriteBanner(var2), var3);
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/gui/GuiGraphics;ILnet/minecraft/world/scores/Scoreboard;Lnet/minecraft/world/scores/Objective;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/Font;split(Lnet/minecraft/network/chat/FormattedText;I)Ljava/util/List;",
         ordinal = 1
      )}
   )
   private List<FormattedCharSequence> wimpyclient$rewriteTabFooter(Font var1, FormattedText var2, int var3) {
      return var1.split(rewriteBanner(var2), var3);
   }

   private static FormattedText rewriteBanner(FormattedText var0) {
      if (!BridgeGate.ready()) {
         return var0;
      } else {
         return (FormattedText)(var0 instanceof Component var1 ? com.wimpyclient.i.o.rewriteTabBanner(var1) : var0);
      }
   }
}
