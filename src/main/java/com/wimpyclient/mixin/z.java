package com.wimpyclient.mixin;

import com.mojang.blaze3d.pipeline.RenderTarget;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.LevelRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({LevelRenderer.class})
public interface z {
   @Accessor("entityOutlineTarget")
   RenderTarget wimpyclient$entityOutlineTarget();
}
