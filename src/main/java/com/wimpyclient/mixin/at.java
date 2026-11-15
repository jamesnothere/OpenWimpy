package com.wimpyclient.mixin;

import com.mojang.blaze3d.textures.GpuSampler;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin(
   targets = {"net/minecraft/class_12247$class_12338"}
)
public interface at {
   @Accessor("comp_5228")
   Identifier wimpyclient$location();

   @Accessor("comp_5229")
   Supplier<GpuSampler> wimpyclient$sampler();
}
