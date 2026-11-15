package com.wimpyclient.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({RenderType.class})
public interface au {
   @Invoker("create")
   static RenderType wimpyclient$create(String var0, RenderSetup var1) {
      throw new AssertionError();
   }
}
