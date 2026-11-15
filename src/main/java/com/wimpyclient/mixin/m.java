package com.wimpyclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.layers.EquipmentLayerRenderer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.trim.ArmorTrim;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Environment(EnvType.CLIENT)
@Mixin({EquipmentLayerRenderer.class})
public class m {
   public m() {
   }

   @ModifyExpressionValue(
      method = {"renderLayers(Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lnet/minecraft/world/item/ItemStack;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;II)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/item/ItemStack;get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;"
      )}
   )
   private Object wimpyclient$mapArmorTrim(Object var1, @Local(argsOnly = true) ItemStack var2, @Local(argsOnly = true) Object var3) {
      if (!BridgeGate.ready()) {
         return var1;
      } else {
         com.wimpyclient.i.x var4 = com.wimpyclient.i.x.INSTANCE;
         if (var4 == null || !var4.armorTrimHider.qo()) {
            com.wimpyclient.i.b.clearCache();
            return var1;
         } else {
            return !com.wimpyclient.i.b.affectsOwn() && isLocalPlayer(var3) ? var1 : com.wimpyclient.i.b.mapTrim(var2, (ArmorTrim)var1);
         }
      }
   }

   private static boolean isLocalPlayer(Object var0) {
      if (!BridgeGate.ready()) {
         return false;
      } else if (!(var0 instanceof AvatarRenderState var1)) {
         return false;
      } else {
         Minecraft var2 = Minecraft.getInstance();
         return var2.player != null && var1.id == var2.player.getId();
      }
   }
}
