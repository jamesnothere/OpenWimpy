package com.wimpyclient.mixin;

import com.mojang.blaze3d.resource.CrossFrameResourcePool;
import com.mojang.blaze3d.vertex.PoseStack;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({GameRenderer.class})
public interface o {
   @Invoker("bobHurt")
   void wimpyclient$bobHurt(PoseStack var1, float var2);

   @Invoker("bobView")
   void wimpyclient$bobView(PoseStack var1, float var2);

   @Invoker("getFov")
   float wimpyclient$getFov(Camera var1, float var2, boolean var3);

   @Accessor("resourcePool")
   CrossFrameResourcePool wimpyclient$resourcePool();
}
