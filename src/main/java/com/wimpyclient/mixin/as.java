package com.wimpyclient.mixin;

import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.rendertype.LayeringTransform;
import net.minecraft.client.renderer.rendertype.OutputTarget;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.TextureTransform;
import net.minecraft.client.renderer.rendertype.RenderSetup.OutlineProperty;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({RenderSetup.class})
public interface as {
   @Accessor("textures")
   Map<String, ?> wimpyclient$textures();

   @Accessor("useLightmap")
   boolean wimpyclient$useLightmap();

   @Accessor("useOverlay")
   boolean wimpyclient$useOverlay();

   @Accessor("outputTarget")
   OutputTarget wimpyclient$outputTarget();

   @Accessor("layeringTransform")
   LayeringTransform wimpyclient$layeringTransform();

   @Accessor("textureTransform")
   TextureTransform wimpyclient$textureTransform();

   @Accessor("bufferSize")
   int wimpyclient$bufferSize();

   @Accessor("outlineProperty")
   OutlineProperty wimpyclient$outlineProperty();
}
