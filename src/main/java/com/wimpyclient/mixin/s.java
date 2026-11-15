package com.wimpyclient.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import com.wimpyclient.bridge.BridgeGate;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.feature.ItemFeatureRenderer;
import net.minecraft.client.renderer.item.ItemStackRenderState.FoilType;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.world.item.ItemDisplayContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

@Environment(EnvType.CLIENT)
@Mixin({ItemFeatureRenderer.class})
public class s {
   @Unique
   private static final float BLOCK_OUTLINE_SCALE = 1.02F;
   @Unique
   private static final float BLOCK_MODEL_CENTER = 0.5F;

   public s() {
   }

   @WrapOperation(
      method = {"render(Lnet/minecraft/client/renderer/SubmitNodeCollection;Lnet/minecraft/client/renderer/MultiBufferSource$BufferSource;Lnet/minecraft/client/renderer/OutlineBufferSource;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/ItemRenderer;renderItem(Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;II[ILjava/util/List;Lnet/minecraft/client/renderer/rendertype/RenderType;Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;)V",
         ordinal = 0
      )}
   )
   private void wimpyclient$cosmicItemOverlay(
      ItemDisplayContext var1,
      PoseStack var2,
      MultiBufferSource var3,
      int var4,
      int var5,
      int[] var6,
      List<BakedQuad> var7,
      RenderType var8,
      FoilType var9,
      Operation<Void> var10
   ) {
      RenderType var11 = var8;
      if (BridgeGate.ready() && com.wimpyclient.k.f.shouldOverlay(var1, var8, var7)) {
         var11 = com.wimpyclient.k.f.wrap(var8);
      }

      var10.call(new Object[]{var1, var2, var3, var4, var5, var6, var7, var11, var9});
   }

   @WrapOperation(
      method = {"render(Lnet/minecraft/client/renderer/SubmitNodeCollection;Lnet/minecraft/client/renderer/MultiBufferSource$BufferSource;Lnet/minecraft/client/renderer/OutlineBufferSource;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/ItemRenderer;renderItem(Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;II[ILjava/util/List;Lnet/minecraft/client/renderer/rendertype/RenderType;Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;)V",
         ordinal = 1
      )}
   )
   private void wimpyclient$inflateBlockOutline(
      ItemDisplayContext var1,
      PoseStack var2,
      MultiBufferSource var3,
      int var4,
      int var5,
      int[] var6,
      List<BakedQuad> var7,
      RenderType var8,
      FoilType var9,
      Operation<Void> var10
   ) {
      boolean var11 = BridgeGate.ready() && com.wimpyclient.i.ae.hasPending();
      if (var11) {
         float var12 = wimpyclient$isBlockItemSheet(var8) ? 0.035F : 0.028F;
         float var13 = 1.0F + var12 * com.wimpyclient.k.h.outlineThickness();
         if (wimpyclient$isBlockItemSheet(var8)) {
            var13 = Math.max(var13, 1.02F);
         }

         var2.pushPose();
         var2.translate(0.5F, 0.5F, 0.5F);
         var2.scale(var13, var13, var13);
         var2.translate(-0.5F, -0.5F, -0.5F);
      }

      try {
         var10.call(new Object[]{var1, var2, var3, var4, var5, var6, var7, var8, var9});
      } finally {
         if (var11) {
            var2.popPose();
         }
      }
   }

   @Unique
   private static boolean wimpyclient$isBlockItemSheet(RenderType var0) {
      return var0 == Sheets.cutoutBlockSheet() || var0 == Sheets.solidBlockSheet() || var0 == Sheets.translucentBlockItemSheet();
   }
}
