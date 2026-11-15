package com.wimpyclient.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.wimpyclient.bridge.BridgeGate;
import java.util.Optional;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource.BufferSource;
import net.minecraft.client.renderer.feature.ModelPartFeatureRenderer;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Environment(EnvType.CLIENT)
@Mixin({ModelPartFeatureRenderer.class})
public class ah {
   public ah() {
   }

   @WrapOperation(
      method = {"render(Lnet/minecraft/client/renderer/SubmitNodeCollection;Lnet/minecraft/client/renderer/MultiBufferSource$BufferSource;Lnet/minecraft/client/renderer/OutlineBufferSource;Lnet/minecraft/client/renderer/MultiBufferSource$BufferSource;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/MultiBufferSource$BufferSource;getBuffer(Lnet/minecraft/client/renderer/rendertype/RenderType;)Lcom/mojang/blaze3d/vertex/VertexConsumer;",
         ordinal = 0
      )}
   )
   private VertexConsumer wimpyclient$cosmicModelPart(BufferSource var1, RenderType var2, Operation<VertexConsumer> var3) {
      RenderType var4 = var2;
      if (BridgeGate.ready()) {
         try {
            var4 = com.wimpyclient.k.f.wrapHeldModel(var2);
         } catch (LinkageError var6) {
         }
      }

      return (VertexConsumer)var3.call(new Object[]{var1, var4});
   }

   @ModifyArg(
      method = {"render(Lnet/minecraft/client/renderer/SubmitNodeCollection;Lnet/minecraft/client/renderer/MultiBufferSource$BufferSource;Lnet/minecraft/client/renderer/OutlineBufferSource;Lnet/minecraft/client/renderer/MultiBufferSource$BufferSource;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/ItemRenderer;getFoilBuffer(Lnet/minecraft/client/renderer/MultiBufferSource;Lnet/minecraft/client/renderer/rendertype/RenderType;ZZ)Lcom/mojang/blaze3d/vertex/VertexConsumer;"
      )},
      index = 1
   )
   private RenderType wimpyclient$cosmicFoil(RenderType var1) {
      if (!BridgeGate.ready()) {
         return var1;
      } else {
         try {
            return com.wimpyclient.k.f.wrapHeldModel(var1);
         } catch (LinkageError var3) {
            return var1;
         }
      }
   }

   @WrapOperation(
      method = {"render(Lnet/minecraft/client/renderer/SubmitNodeCollection;Lnet/minecraft/client/renderer/MultiBufferSource$BufferSource;Lnet/minecraft/client/renderer/OutlineBufferSource;Lnet/minecraft/client/renderer/MultiBufferSource$BufferSource;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/model/geom/ModelPart;render(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;III)V",
         ordinal = 1
      )}
   )
   private void wimpyclient$inflateModelOutline(ModelPart var1, PoseStack var2, VertexConsumer var3, int var4, int var5, int var6, Operation<Void> var7) {
      boolean var8 = BridgeGate.ready() && com.wimpyclient.i.ae.hasPending();
      if (var8) {
         float var9 = 1.0F + 0.03F * com.wimpyclient.k.h.outlineThickness();
         var2.pushPose();
         var2.scale(var9, var9, var9);
      }

      try {
         var7.call(new Object[]{var1, var2, var3, var4, var5, var6});
      } finally {
         if (var8) {
            var2.popPose();
         }
      }
   }

   @WrapOperation(
      method = {"render(Lnet/minecraft/client/renderer/SubmitNodeCollection;Lnet/minecraft/client/renderer/MultiBufferSource$BufferSource;Lnet/minecraft/client/renderer/OutlineBufferSource;Lnet/minecraft/client/renderer/MultiBufferSource$BufferSource;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/rendertype/RenderType;outline()Ljava/util/Optional;"
      )}
   )
   private Optional<RenderType> wimpyclient$ensureOutline(RenderType var1, Operation<Optional<RenderType>> var2) {
      Optional var3 = (Optional)var2.call(new Object[]{var1});
      return !var3.isPresent() && BridgeGate.ready() && com.wimpyclient.i.ae.hasPending()
         ? Optional.of(RenderTypes.outline(com.wimpyclient.k.f.outlineAtlas(var1)))
         : var3;
   }
}
