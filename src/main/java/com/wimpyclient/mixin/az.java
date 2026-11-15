package com.wimpyclient.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import com.wimpyclient.bridge.BridgeGate;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.SubmitNodeCollection;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer.CrumblingOverlay;
import net.minecraft.client.renderer.item.ItemStackRenderState.FoilType;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.world.item.ItemDisplayContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({SubmitNodeCollection.class})
public class az {
   public az() {
   }

   @Inject(
      method = {"submitItem(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/item/ItemDisplayContext;III[ILjava/util/List;Lnet/minecraft/client/renderer/rendertype/RenderType;Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$markCosmicItem(
      PoseStack var1,
      ItemDisplayContext var2,
      int var3,
      int var4,
      int var5,
      int[] var6,
      List<BakedQuad> var7,
      RenderType var8,
      FoilType var9,
      CallbackInfo var10
   ) {
      if (BridgeGate.ready()) {
         try {
            com.wimpyclient.k.f.markHeldItem(var7, var2);
         } catch (LinkageError var12) {
         }
      }
   }

   @ModifyVariable(
      method = {"submitModelPart(Lnet/minecraft/client/model/geom/ModelPart;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;IILnet/minecraft/client/renderer/texture/TextureAtlasSprite;ZZILnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;I)V"},
      at = {@At("HEAD")},
      argsOnly = true,
      ordinal = 3
   )
   private int wimpyclient$toolOutlineModelPart(int var1) {
      if (!BridgeGate.ready()) {
         return var1;
      } else {
         try {
            return com.wimpyclient.i.ae.colorOr(var1);
         } catch (LinkageError var3) {
            return var1;
         }
      }
   }

   @Inject(
      method = {"submitModelPart(Lnet/minecraft/client/model/geom/ModelPart;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;IILnet/minecraft/client/renderer/texture/TextureAtlasSprite;ZZILnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;I)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$markCosmicModelPart(
      ModelPart var1,
      PoseStack var2,
      RenderType var3,
      int var4,
      int var5,
      TextureAtlasSprite var6,
      boolean var7,
      boolean var8,
      int var9,
      CrumblingOverlay var10,
      int var11,
      CallbackInfo var12
   ) {
      if (BridgeGate.ready()) {
         try {
            com.wimpyclient.k.f.markHeldModel();
         } catch (LinkageError var14) {
         }
      }
   }

   @Inject(
      method = {"submitModel(Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;IIILnet/minecraft/client/renderer/texture/TextureAtlasSprite;ILnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V"},
      at = {@At("HEAD")}
   )
   private <S> void wimpyclient$markCosmicModel(
      Model<? super S> var1,
      S var2,
      PoseStack var3,
      RenderType var4,
      int var5,
      int var6,
      int var7,
      TextureAtlasSprite var8,
      int var9,
      CrumblingOverlay var10,
      CallbackInfo var11
   ) {
      if (BridgeGate.ready()) {
         try {
            com.wimpyclient.k.f.markHeldModel();
         } catch (LinkageError var13) {
         }
      }
   }
}
