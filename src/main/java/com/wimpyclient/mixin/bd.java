package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.item.properties.select.TrimMaterialProperty;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.trim.ArmorTrim;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({TrimMaterialProperty.class})
public class bd {
   public bd() {
   }

   @Inject(
      method = {"get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/resources/ResourceKey;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$mapGuiTrim(
      ItemStack var1, ClientLevel var2, LivingEntity var3, int var4, ItemDisplayContext var5, CallbackInfoReturnable<ResourceKey<TrimMaterial>> var6
   ) {
      if (BridgeGate.ready()) {
         if (!com.wimpyclient.i.b.shouldAffect(var3)) {
            if (!com.wimpyclient.i.b.isActive()) {
               com.wimpyclient.i.b.clearCache();
            }
         } else {
            ArmorTrim var7 = (ArmorTrim)var1.get(DataComponents.TRIM);
            ArmorTrim var8 = com.wimpyclient.i.b.mapTrim(var1, var7);
            var6.setReturnValue(var8 == null ? null : (ResourceKey)var8.material().unwrapKey().orElse(null));
         }
      }
   }
}
