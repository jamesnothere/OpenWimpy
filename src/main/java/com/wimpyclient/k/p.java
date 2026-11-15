package com.wimpyclient.k;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.pipeline.RenderPipeline.UniformDescription;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.wimpyclient.mixin.au;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.ShaderDefines;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;

@Environment(EnvType.CLIENT)
final class p {
   static final RenderPipeline FILLED_PIPELINE = 
      throughWalls(RenderPipelines.DEBUG_FILLED_BOX, com.wimpyclient.Wimpy.id("pipeline/chunk_overlay_filled"))
   ;
   static final RenderPipeline LINES_PIPELINE = 
      RenderPipeline.builder(new Snippet[]{RenderPipelines.LINES_SNIPPET})
         .withLocation(com.wimpyclient.Wimpy.id("pipeline/chunk_overlay_lines"))
         .withCull(false)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthBias(-3.0F, -3.0F)
         .build()
   ;
   static final RenderPipeline GLOW_LINES_PIPELINE = 
      RenderPipeline.builder(new Snippet[]{RenderPipelines.LINES_SNIPPET})
         .withLocation(com.wimpyclient.Wimpy.id("pipeline/chunk_overlay_glow_lines"))
         .withVertexShader(com.wimpyclient.Wimpy.id("core/wimpy_glow_lines"))
         .withFragmentShader(com.wimpyclient.Wimpy.id("core/wimpy_glow_lines"))
         .withCull(false)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthBias(-3.0F, -3.0F)
         .build()
   ;
   static final RenderPipeline SKY_FILLED_PIPELINE = skyFilled();
   static final RenderPipeline SKY_LINES_PIPELINE = 
      RenderPipeline.builder(new Snippet[]{RenderPipelines.LINES_SNIPPET})
         .withLocation(com.wimpyclient.Wimpy.id("pipeline/ambient_sky_lines"))
         .withVertexShader(com.wimpyclient.Wimpy.id("core/wimpy_sky_lines"))
         .withFragmentShader(com.wimpyclient.Wimpy.id("core/wimpy_sky_lines"))
         .withCull(false)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   ;
   static final RenderType FILLED = create("wimpyclient_filled_xray", FILLED_PIPELINE);
   static final RenderType LINES = create("wimpyclient_lines_xray", LINES_PIPELINE);
   static final RenderType GLOW_LINES = create("wimpyclient_glow_lines_xray", GLOW_LINES_PIPELINE);
   static final RenderType SKY_FILLED = create("wimpyclient_ambient_filled", SKY_FILLED_PIPELINE);
   static final RenderType SKY_LINES = create("wimpyclient_ambient_lines", SKY_LINES_PIPELINE);

   static RenderType lines() {
      return h.master() ? GLOW_LINES : LINES;
   }

   static RenderType skyLines() {
      return SKY_LINES;
   }

   private p() {
   }

   private static RenderType create(String var0, RenderPipeline var1) {
      return au.wimpyclient$create(var0, RenderSetup.builder(var1).createRenderSetup());
   }

   private static RenderPipeline skyFilled() {
      RenderPipeline var0 = RenderPipelines.DEBUG_FILLED_BOX;
      Builder var1 = RenderPipeline.builder(new Snippet[0])
         .withLocation(com.wimpyclient.Wimpy.id("pipeline/ambient_sky_filled"))
         .withVertexShader(com.wimpyclient.Wimpy.id("core/wimpy_sky_color"))
         .withFragmentShader(com.wimpyclient.Wimpy.id("core/wimpy_sky_color"))
         .withVertexFormat(var0.getVertexFormat(), var0.getVertexFormatMode())
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.ADDITIVE);

      for (String var3 : var0.getSamplers()) {
         var1.withSampler(var3);
      }

      for (UniformDescription var5 : var0.getUniforms()) {
         if (!"Fog".equals(var5.name()) && !"FogColor".equals(var5.name())) {
            if (var5.textureFormat() != null) {
               var1.withUniform(var5.name(), var5.type(), var5.textureFormat());
            } else {
               var1.withUniform(var5.name(), var5.type());
            }
         }
      }

      return var1.build();
   }

   private static RenderPipeline throughWalls(RenderPipeline var0, Identifier var1) {
      Builder var2 = RenderPipeline.builder(new Snippet[0])
         .withLocation(var1)
         .withVertexShader(var0.getVertexShader())
         .withFragmentShader(var0.getFragmentShader())
         .withVertexFormat(var0.getVertexFormat(), var0.getVertexFormatMode())
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withDepthBias(-3.0F, -3.0F);
      var0.getBlendFunction().ifPresent(var2::withBlend);

      for (String var4 : var0.getSamplers()) {
         var2.withSampler(var4);
      }

      for (UniformDescription var11 : var0.getUniforms()) {
         if (var11.textureFormat() != null) {
            var2.withUniform(var11.name(), var11.type(), var11.textureFormat());
         } else {
            var2.withUniform(var11.name(), var11.type());
         }
      }

      ShaderDefines var10 = var0.getShaderDefines();
      if (var10 != null && !var10.isEmpty()) {
         for (String var5 : var10.flags()) {
            var2.withShaderDefine(var5);
         }

         for (Entry var14 : var10.values().entrySet()) {
            String var6 = (String)var14.getValue();

            try {
               if (var6.indexOf(46) >= 0) {
                  var2.withShaderDefine((String)var14.getKey(), Float.parseFloat(var6));
               } else {
                  var2.withShaderDefine((String)var14.getKey(), Integer.parseInt(var6));
               }
            } catch (NumberFormatException var8) {
               var2.withShaderDefine((String)var14.getKey());
            }
         }
      }

      return var2.build();
   }
}
