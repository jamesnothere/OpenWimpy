package com.wimpyclient.i;

import com.mojang.blaze3d.framegraph.FrameGraphBuilder;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.resource.GraphicsResourceAllocator;
import com.mojang.blaze3d.resource.ResourceHandle;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.wimpyclient.bridge.BridgeGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.LevelTargetBundle;
import net.minecraft.client.renderer.PostChain;
import net.minecraft.client.renderer.PostChain.TargetBundle;
import net.minecraft.resources.Identifier;
import net.minecraft.util.ARGB;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

@Environment(EnvType.CLIENT)
public final class ae {
   private static final Identifier ITEM_OUTLINE_THIN = com.wimpyclient.Wimpy.id("item_outline");
   private static final Identifier ITEM_OUTLINE_MED = com.wimpyclient.Wimpy.id("item_outline_med");
   private static final Identifier ENTITY_OUTLINE_POST = Identifier.withDefaultNamespace("entity_outline");
   private static final ThreadLocal<Boolean> HELD = ThreadLocal.withInitial(() -> Boolean.FALSE);
   private static boolean firstPersonHeld;
   private static boolean overlayHeld;
   private static boolean outlineArmed;
   private static boolean pendingComposite;
   private static boolean compositing;
   private static boolean handFlush;

   private ae() {
   }

   public static void beginHeld(LivingEntity var0, ItemStack var1) {
      boolean var2 = affects(var0) && var1 != null && !var1.isEmpty();
      boolean var3 = var2 && var1.is(Items.TOTEM_OF_UNDYING);
      outlineArmed = enabled() && var2;
      HELD.set(outlineArmed);
      overlayHeld = var2 && !var3 && com.wimpyclient.k.h.itemStarfield();
      firstPersonHeld = var2 && (outlineArmed || overlayHeld);
   }

   public static void beginHeldId(int var0, ItemStack var1) {
      HELD.set(enabled() && affectsId(var0) && var1 != null && !var1.isEmpty());
      overlayHeld = false;
   }

   public static void endHeld() {
      HELD.set(Boolean.FALSE);
   }

   public static boolean isOverlayHeld() {
      return overlayHeld;
   }

   public static int colorOr(int var0) {
      if (!outlineArmed && !Boolean.TRUE.equals(HELD.get())) {
         return var0;
      } else {
         if (firstPersonHeld) {
            pendingComposite = true;
         }

         int var1 = com.wimpyclient.k.h.itemOutline() ? com.wimpyclient.k.h.chrome() : com.wimpyclient.o.b.INSTANCE.accent();
         return ARGB.opaque(var1);
      }
   }

   public static void beginHandFlush() {
      handFlush = true;
   }

   public static void endHandFlush() {
      handFlush = false;
      overlayHeld = false;
      firstPersonHeld = false;
      outlineArmed = false;
      com.wimpyclient.k.f.endFlush();
   }

   public static boolean isHandFlush() {
      return handFlush;
   }

   public static boolean isCompositing() {
      return compositing;
   }

   public static boolean hasPending() {
      return pendingComposite;
   }

   public static boolean shouldForceHandSync() {
      return enabled();
   }

   public static void compositeHandOutlines(GraphicsResourceAllocator var0) {
      if (pendingComposite) {
         pendingComposite = false;
         firstPersonHeld = false;
         if (enabled() && var0 != null) {
            Minecraft var1 = Minecraft.getInstance();
            LevelRenderer var2 = var1.levelRenderer;
            RenderTarget var3 = ((com.wimpyclient.mixin.z)var2).wimpyclient$entityOutlineTarget();
            if (var3 != null && var3.getColorTexture() != null) {
               compositing = true;

               try {
                  CommandEncoder var4 = RenderSystem.getDevice().createCommandEncoder();
                  GpuTexture var5 = var3.getColorTexture();
                  GpuTexture var6 = var3.getDepthTexture();
                  if (var6 != null) {
                     var4.clearColorAndDepthTextures(var5, 0, var6, 1.0);
                  } else {
                     var4.clearColorTexture(var5, 0);
                  }

                  var1.renderBuffers().outlineBufferSource().endOutlineBatch();
                  runOutlineEdgePass(var1, var3, var0);
                  var2.doEntityOutline();
               } finally {
                  compositing = false;
               }
            }
         }
      }
   }

   private static void runOutlineEdgePass(Minecraft var0, RenderTarget var1, GraphicsResourceAllocator var2) {
      float var3 = com.wimpyclient.k.h.outlineThickness();
      Identifier var4 = var3 < 0.9F ? ITEM_OUTLINE_THIN : (var3 < 1.45F ? ITEM_OUTLINE_MED : ENTITY_OUTLINE_POST);
      PostChain var5 = var0.getShaderManager().getPostChain(var4, LevelTargetBundle.OUTLINE_TARGETS);
      if (var5 == null && var4 != ITEM_OUTLINE_THIN) {
         var5 = var0.getShaderManager().getPostChain(ITEM_OUTLINE_THIN, LevelTargetBundle.OUTLINE_TARGETS);
      }

      if (var5 == null) {
         var5 = var0.getShaderManager().getPostChain(ENTITY_OUTLINE_POST, LevelTargetBundle.OUTLINE_TARGETS);
      }

      if (var5 != null) {
         FrameGraphBuilder var6 = new FrameGraphBuilder();
         ResourceHandle var7 = var6.importExternal("entity_outline", var1);
         TargetBundle var8 = TargetBundle.of(LevelTargetBundle.ENTITY_OUTLINE_TARGET_ID, var7);
         var5.addToFrame(var6, var1.width, var1.height, var8);
         var6.execute(var2);
      }
   }

   private static boolean enabled() {
      if (!BridgeGate.ready()) {
         return false;
      } else {
         x var0 = x.INSTANCE;
         return var0 == null ? false : var0.toolOutline.qo() || com.wimpyclient.k.h.itemOutline();
      }
   }

   private static boolean affects(LivingEntity var0) {
      Minecraft var1 = Minecraft.getInstance();
      return var1.player != null && var0 == var1.player;
   }

   private static boolean affectsId(int var0) {
      Minecraft var1 = Minecraft.getInstance();
      return var1.player != null && var0 == var1.player.getId();
   }
}
