package com.wimpyclient.k;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.pipeline.RenderPipeline.UniformDescription;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.wimpyclient.bridge.BridgeGate;
import com.wimpyclient.i.ae;
import com.wimpyclient.mixin.as;
import com.wimpyclient.mixin.at;
import com.wimpyclient.mixin.au;
import com.wimpyclient.mixin.av;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderSetup.RenderSetupBuilder;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemDisplayContext;

@Environment(EnvType.CLIENT)
public final class f {
   private static final int CACHE_LIMIT = 48;
   private static final IdentityHashMap<RenderType, RenderType> CACHE = new IdentityHashMap<>();
   private static final Set<List<BakedQuad>> OVERLAY_QUADS = Collections.newSetFromMap(new IdentityHashMap<>());
   static final RenderPipeline PIPELINE = buildPipeline(false);
   private static final RenderPipeline MODEL_PIPELINE = buildPipeline(true);
   private static boolean overlayModel;
   private static Identifier overlayModelTexture;

   private f() {
   }

   public static void markHeldItem(List<BakedQuad> var0, ItemDisplayContext var1) {
      if (BridgeGate.ready() && var0 != null && ae.isOverlayHeld()) {
         if (var1 == null || var1.firstPerson()) {
            OVERLAY_QUADS.add(var0);
         }
      }
   }

   public static void markHeldModel() {
      markHeldModel(null);
   }

   public static void markHeldModel(Identifier var0) {
      if (BridgeGate.ready() && ae.isOverlayHeld()) {
         overlayModel = true;
         if (var0 != null) {
            overlayModelTexture = var0;
         }
      }
   }

   public static void endFlush() {
      OVERLAY_QUADS.clear();
      overlayModel = false;
      overlayModelTexture = null;
   }

   public static boolean shouldOverlay(ItemDisplayContext var0, RenderType var1, List<BakedQuad> var2) {
      if (!h.itemStarfield() || var1 == null || var1.isOutline()) {
         return false;
      } else if (var0 != null && !var0.firstPerson()) {
         return false;
      } else {
         return var2 != null && OVERLAY_QUADS.contains(var2) ? compatible(var1) : false;
      }
   }

   public static Identifier outlineAtlas(RenderType var0) {
      if (var0 == Sheets.translucentItemSheet()) {
         return TextureAtlas.LOCATION_ITEMS;
      } else if (isBlockSheet(var0)) {
         return TextureAtlas.LOCATION_BLOCKS;
      } else if (overlayModelTexture != null) {
         return overlayModelTexture;
      } else {
         Identifier var1 = sampler0(var0);
         return var1 != null ? var1 : TextureAtlas.LOCATION_ITEMS;
      }
   }

   public static Identifier sampler0(RenderType var0) {
      if (var0 == null) {
         return null;
      } else {
         RenderSetup var1 = ((av)var0).wimpyclient$state();
         if (var1 == null) {
            return null;
         } else {
            Map var2 = ((as)(Object)var1).wimpyclient$textures();
            if (var2 == null) {
               return null;
            } else {
               return var2.get("Sampler0") instanceof at var4 ? var4.wimpyclient$location() : null;
            }
         }
      }
   }

   public static RenderType wrapHeldModel(RenderType var0) {
      return wrapHeldModel(var0, overlayModelTexture);
   }

   public static RenderType wrapHeldModel(RenderType var0, Identifier var1) {
      if (BridgeGate.ready() && overlayModel && compatible(var0)) {
         Identifier var2 = var1 != null ? var1 : overlayModelTexture;
         return wrap(var0, var2, true);
      } else {
         return var0;
      }
   }

   private static boolean compatible(RenderType var0) {
      if (var0 != null && !var0.isOutline()) {
         RenderPipeline var1 = var0.pipeline();
         return var1 != PIPELINE && var1 != MODEL_PIPELINE
            ? var0.format() == DefaultVertexFormat.NEW_ENTITY || var0.format() == RenderPipelines.ITEM_ENTITY_TRANSLUCENT_CULL.getVertexFormat()
            : false;
      } else {
         return false;
      }
   }

   public static RenderType wrap(RenderType var0) {
      return wrap(var0, null, isBlockSheet(var0));
   }

   private static RenderType wrap(RenderType var0, Identifier var1, boolean var2) {
      if (var0 == null) {
         return var0;
      } else {
         RenderType var4 = CACHE.get(var0);
         if (var4 == null || var1 != null && !sameSampler0(var4, var1)) {
            if (CACHE.size() >= 48) {
               CACHE.clear();
            }

            RenderType var5 = create(var0, var1, var2);
            if (var5 == var0) {
               return var0;
            } else {
               CACHE.put(var0, var5);
               return var5;
            }
         } else {
            return var4;
         }
      }
   }

   private static boolean isBlockSheet(RenderType var0) {
      return var0 == Sheets.solidBlockSheet() || var0 == Sheets.cutoutBlockSheet() || var0 == Sheets.translucentBlockItemSheet();
   }

   private static boolean sameSampler0(RenderType var0, Identifier var1) {
      RenderSetup var2 = ((av)var0).wimpyclient$state();
      Map var3 = ((as)(Object)var2).wimpyclient$textures();
      if (var3 == null) {
         return false;
      } else {
         return var3.get("Sampler0") instanceof at var5 ? var1.equals(var5.wimpyclient$location()) : false;
      }
   }

   private static RenderType create(RenderType var0, Identifier var1, boolean var2) {
      RenderSetup var3 = ((av)var0).wimpyclient$state();
      as var4 = (as)(Object)var3;
      RenderSetupBuilder var5 = RenderSetup.builder(var2 ? MODEL_PIPELINE : PIPELINE);
      var5.useLightmap();
      if (var4.wimpyclient$useOverlay()) {
         var5.useOverlay();
      }

      if (var4.wimpyclient$outputTarget() != null) {
         var5.setOutputTarget(var4.wimpyclient$outputTarget());
      }

      if (var4.wimpyclient$layeringTransform() != null) {
         var5.setLayeringTransform(var4.wimpyclient$layeringTransform());
      }

      if (var4.wimpyclient$textureTransform() != null) {
         var5.setTextureTransform(var4.wimpyclient$textureTransform());
      }

      if (var0.sortOnUpload()) {
         var5.sortOnUpload();
      }

      if (var4.wimpyclient$outlineProperty() != null) {
         var5.setOutline(var4.wimpyclient$outlineProperty());
      }

      var5.bufferSize(Math.max(1536, var4.wimpyclient$bufferSize()));
      return !copyTextures(var5, var4.wimpyclient$textures(), var1)
         ? var0
         : au.wimpyclient$create(
            "wimpyclient_item_cosmic_" + (var2 ? "model_" : "") + Integer.toHexString(System.identityHashCode(var0)), var5.createRenderSetup()
         );
   }

   private static boolean copyTextures(RenderSetupBuilder var0, Map<String, ?> var1, Identifier var2) {
      boolean var3 = false;
      if (var1 != null) {
         for (Entry var5 : var1.entrySet()) {
            if (var5.getValue() instanceof at var6) {
               Identifier var9 = "Sampler0".equals(var5.getKey()) && var2 != null ? var2 : var6.wimpyclient$location();
               if (var9 != null) {
                  Supplier var8 = var6.wimpyclient$sampler();
                  if (var8 != null) {
                     var0.withTexture((String)var5.getKey(), var9, var8);
                  } else {
                     var0.withTexture((String)var5.getKey(), var9);
                  }

                  var3 = true;
               }
            }
         }
      }

      if (!var3 && var2 != null) {
         var0.withTexture("Sampler0", var2);
         return true;
      } else {
         return var3;
      }
   }

   private static RenderPipeline buildPipeline(boolean var0) {
      RenderPipeline var1 = RenderPipelines.ITEM_ENTITY_TRANSLUCENT_CULL;
      Builder var2 = RenderPipeline.builder(new Snippet[0])
         .withLocation(com.wimpyclient.Wimpy.id(var0 ? "pipeline/item_cosmic_model" : "pipeline/item_cosmic"))
         .withVertexShader(com.wimpyclient.Wimpy.id("core/wimpy_item_cosmic"))
         .withFragmentShader(com.wimpyclient.Wimpy.id("core/wimpy_item_cosmic"))
         .withVertexFormat(var1.getVertexFormat(), var1.getVertexFormatMode())
         .withCull(false)
         .withDepthWrite(true)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST);
      if (var0) {
         var2.withoutBlend();
      } else {
         var2.withBlend(BlendFunction.TRANSLUCENT);
      }

      for (String var4 : var1.getSamplers()) {
         var2.withSampler(var4);
      }

      HashSet var5 = new HashSet();
      copyUniforms(var2, var1, var5);
      copyUniforms(var2, RenderPipelines.GLINT, var5);
      return var2.build();
   }

   private static void copyUniforms(Builder var0, RenderPipeline var1, Set<String> var2) {
      for (UniformDescription var4 : var1.getUniforms()) {
         if (var2.add(var4.name())) {
            if (var4.textureFormat() != null) {
               var0.withUniform(var4.name(), var4.type(), var4.textureFormat());
            } else {
               var0.withUniform(var4.name(), var4.type());
            }
         }
      }
   }
}
