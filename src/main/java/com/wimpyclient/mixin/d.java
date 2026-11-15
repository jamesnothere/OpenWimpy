package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.GuiMessageTag;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MessageSignature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({ChatComponent.class})
public class d {
   public d() {
   }

   @ModifyVariable(
      method = {"addMessage(Lnet/minecraft/network/chat/Component;)V"},
      at = {@At("HEAD")},
      argsOnly = true
   )
   private Component wimpyclient$fakeNameInChat(Component var1) {
      return !BridgeGate.ready() ? var1 : com.wimpyclient.i.n.rewrite(var1);
   }

   @Inject(
      method = {"addMessage(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/MessageSignature;Lnet/minecraft/client/GuiMessageTag;)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$antiVanishChat(Component var1, MessageSignature var2, GuiMessageTag var3, CallbackInfo var4) {
      if (BridgeGate.ready()) {
         com.wimpyclient.i.af.INSTANCE.onChatMessage(var1);
      }
   }
}
