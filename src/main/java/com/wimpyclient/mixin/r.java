package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.scores.Objective;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({Gui.class})
public class r {
   public r() {
   }

   @Inject(
      method = {"getCameraPlayer()Lnet/minecraft/world/entity/player/Player;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$useRealPlayer(CallbackInfoReturnable<Player> var1) {
      if (BridgeGate.ready()) {
         if (com.wimpyclient.i.q.INSTANCE.isActive()) {
            var1.setReturnValue(Minecraft.getInstance().player);
         }
      }
   }

   @Inject(
      method = {"renderTextureOverlay(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/resources/Identifier;F)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$hideFreecamOverlays(GuiGraphics var1, Identifier var2, float var3, CallbackInfo var4) {
      if (BridgeGate.ready()) {
         if (com.wimpyclient.i.q.INSTANCE.isActive()) {
            var4.cancel();
         }
      }
   }

   @Inject(
      method = {"displayScoreboardSidebar(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/world/scores/Objective;)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$beginSidebar(GuiGraphics var1, Objective var2, CallbackInfo var3) {
      if (BridgeGate.ready()) {
         com.wimpyclient.i.o.beginSidebar();
      }
   }

   @ModifyVariable(
      method = {"setTitle(Lnet/minecraft/network/chat/Component;)V", "setSubtitle(Lnet/minecraft/network/chat/Component;)V"},
      at = {@At("HEAD")},
      argsOnly = true
   )
   private Component wimpyclient$rewriteTitle(Component var1) {
      return !BridgeGate.ready() ? var1 : com.wimpyclient.i.n.rewrite(var1);
   }

   @ModifyVariable(
      method = {"setOverlayMessage(Lnet/minecraft/network/chat/Component;Z)V"},
      at = {@At("HEAD")},
      argsOnly = true
   )
   private Component wimpyclient$rewriteOverlayMessage(Component var1) {
      return !BridgeGate.ready() ? var1 : com.wimpyclient.i.n.rewrite(var1);
   }

   @Redirect(
      method = {"displayScoreboardSidebar(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/world/scores/Objective;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/Font;width(Lnet/minecraft/network/chat/FormattedText;)I",
         ordinal = 1
      )}
   )
   private int wimpyclient$sidebarLineWidth(Font var1, FormattedText var2) {
      if (!BridgeGate.ready()) {
         return var1.width(var2);
      } else {
         if (var2 instanceof Component var3) {
            try {
               return var1.width(com.wimpyclient.i.n.rewrite(com.wimpyclient.i.o.rewriteForWidth(var3)));
            } catch (Exception var5) {
            }
         }

         return var1.width(var2);
      }
   }

   @ModifyArg(
      method = {"displayScoreboardSidebar(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/world/scores/Objective;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/GuiGraphics;drawString(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
         ordinal = 0
      )},
      index = 1
   )
   private Component wimpyclient$sidebarTitleText(Component var1) {
      return !BridgeGate.ready() ? var1 : com.wimpyclient.i.n.rewrite(var1);
   }

   @ModifyArg(
      method = {"displayScoreboardSidebar(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/world/scores/Objective;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/GuiGraphics;drawString(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
         ordinal = 1
      )},
      index = 1
   )
   private Component wimpyclient$sidebarLineText(Component var1) {
      if (!BridgeGate.ready()) {
         return var1;
      } else {
         try {
            return com.wimpyclient.i.n.rewrite(com.wimpyclient.i.o.rewriteForDraw(var1));
         } catch (Exception var3) {
            return com.wimpyclient.i.n.rewrite(var1);
         }
      }
   }

   @ModifyArg(
      method = {"displayScoreboardSidebar(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/world/scores/Objective;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/GuiGraphics;drawString(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
         ordinal = 2
      )},
      index = 1
   )
   private Component wimpyclient$sidebarScoreText(Component var1) {
      return !BridgeGate.ready() ? var1 : com.wimpyclient.i.n.rewrite(var1);
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/client/DeltaTracker;)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$drawHudOverlays(GuiGraphics var1, DeltaTracker var2, CallbackInfo var3) {
      com.wimpyclient.localauth.b.render(var1);
      if (BridgeGate.ready()) {
         com.wimpyclient.k.ab.render(var1);
         com.wimpyclient.k.o.render(var1);
         com.wimpyclient.k.aa.render(var1);
         com.wimpyclient.k.t.render(var1);
         com.wimpyclient.k.v.render(var1);
         com.wimpyclient.k.c.render(var1);
         com.wimpyclient.k.y.render(var1);
      }
   }
}
