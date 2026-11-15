package com.wimpyclient.k;

import com.mojang.blaze3d.ProjectionType;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.ByteBufferBuilder;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import com.wimpyclient.auth.LicenseGate;
import com.wimpyclient.i.aj$b;
import com.wimpyclient.i.aj$d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.PerspectiveProjectionMatrixBuffer;
import net.minecraft.client.renderer.MultiBufferSource.BufferSource;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;

@Environment(EnvType.CLIENT)
public final class d {
   public static final d INSTANCE = new d();
   public static final int OVERLAY_Y = 60;
   private static final float CHUNK_THICKNESS = 0.3F;
   private static final float CHUNK_PLANE_ALPHA = 0.45F;
   private static final int MAX_STORAGE_DRAWN = 512;
   private static final int MAX_BLOCK_ESP_DRAWN = 1024;
   private static final int MAX_CHUNK_PLANES = 128;
   private static final double ESP_MIN_DISTANCE = 128.0;
   private static final int MAX_TRACERS_DRAWN = 512;
   private static final float TRACER_START = 0.35F;
   private static final float TRACER_NEAR = 0.1F;
   private static final float TRACER_WIDTH = 1.2F;
   private static final float TRACER_ALPHA = 0.72F;
   private static final float CHUNK_CORNER = 2.35F;
   private static final float CHUNK_OVERLAP = 0.18F;
   private static final float CHUNK_POP_SEC = 0.34F;
   private static final int CHUNK_CORNER_STEPS = 5;
   private List<ChunkPos> extractedPlayerChunks = List.of();
   private List<ChunkPos> extractedBaseDebug = List.of();
   private List<ChunkPos> extractedBaseCalc = List.of();
   private List<BlockPos> extractedBaseCalcCentroids = List.of();
   private List<BlockPos> extractedYHideBases = List.of();
   private List<ChunkPos> extractedPrimeSus = List.of();
   private List<com.wimpyclient.e.b> extractedStorage = List.of();
   private List<com.wimpyclient.e.b> extractedBlockEsp = List.of();
   private List<com.wimpyclient.e.h> extractedSpawners = List.of();
   private List<BlockPos> extractedNbt = List.of();
   private List<AABB> extractedPlayers = List.of();
   private List<com.wimpyclient.e.c> extractedEntities = List.of();
   private List<aj$d> extractedSchematic = List.of();
   private List<aj$b> extractedSchematicDebug = List.of();
   private final Map<Long, Long> growthAppearNanos = new HashMap<>();
   private final Map<Long, Long> primeAppearNanos = new HashMap<>();
   private ByteBufferBuilder overlayBuffer;
   private PerspectiveProjectionMatrixBuffer overlayProjectionBuffer;

   public static int overlayY() {
      return com.wimpyclient.i.x.INSTANCE.growthDebugRenderY;
   }

   private d() {
   }

   private ByteBufferBuilder overlayBuffer() {
      if (this.overlayBuffer == null) {
         this.overlayBuffer = new ByteBufferBuilder(524288);
      }

      return this.overlayBuffer;
   }

   private PerspectiveProjectionMatrixBuffer overlayProjectionBuffer() {
      if (this.overlayProjectionBuffer == null) {
         this.overlayProjectionBuffer = new PerspectiveProjectionMatrixBuffer("wimpyclient-overlay");
      }

      return this.overlayProjectionBuffer;
   }

   public void register() {
      WorldRenderEvents.END_EXTRACTION.register(this::extract);
      WorldRenderEvents.END_MAIN.register(this::draw);
   }

   private void extract(WorldExtractionContext var1) {
      if (!LicenseGate.isAuthorized()) {
         this.extractedPlayerChunks = List.of();
         this.extractedBaseDebug = List.of();
         this.extractedBaseCalc = List.of();
         this.extractedBaseCalcCentroids = List.of();
         this.extractedYHideBases = List.of();
         this.extractedPrimeSus = List.of();
         this.extractedStorage = List.of();
         this.extractedBlockEsp = List.of();
         this.extractedSpawners = List.of();
         this.extractedNbt = List.of();
         this.extractedPlayers = List.of();
         this.extractedEntities = List.of();
         this.extractedSchematic = List.of();
         this.extractedSchematicDebug = List.of();
      } else {
         com.wimpyclient.i.x var2 = com.wimpyclient.i.x.INSTANCE;
         if (!var2.needsWorldScan()) {
            this.extractedPlayerChunks = List.of();
            this.extractedBaseDebug = List.of();
            this.extractedBaseCalc = List.of();
            this.extractedBaseCalcCentroids = List.of();
            this.extractedYHideBases = List.of();
            this.extractedPrimeSus = List.of();
            this.extractedStorage = List.of();
            this.extractedBlockEsp = List.of();
            this.extractedSpawners = List.of();
            this.extractedNbt = List.of();
            this.extractedPlayers = List.of();
            this.extractedEntities = List.of();
            this.extractedSchematic = List.of();
            this.extractedSchematicDebug = List.of();
         } else {
            this.extractedPlayerChunks = var2.growthDebug.qo() ? com.wimpyclient.e.a.INSTANCE.playerChunkRenderSnapshot() : List.of();
            this.extractedBaseDebug = List.of();
            this.extractedBaseCalc = List.of();
            this.extractedBaseCalcCentroids = var2.baseDebug.qo() ? com.wimpyclient.f.b.INSTANCE.renderCentroids() : List.of();
            this.extractedYHideBases = var2.yHideBases.qo() ? com.wimpyclient.f.h.INSTANCE.renderCentroids() : List.of();
            this.extractedPrimeSus = var2.isPrimeSusFinderEnabled() ? com.wimpyclient.e.a.INSTANCE.primeSusRenderSnapshot() : List.of();
            this.extractedStorage = var2.storage.qo() ? selectNearestBlockMarks(com.wimpyclient.e.a.INSTANCE.storageRenderSnapshot(), 512) : List.of();
            this.extractedBlockEsp = var2.blockEsp.qo() ? selectNearestBlockMarks(com.wimpyclient.e.a.INSTANCE.blockEspRenderSnapshot(), 1024) : List.of();
            this.extractedSpawners = var2.spawnerFinder.qo() ? selectNearestSpawners(com.wimpyclient.e.a.INSTANCE.spawnerRenderSnapshot(), 512) : List.of();
            this.extractedNbt = var2.nbtBypass.qo() ? selectNearestPositions(com.wimpyclient.e.a.INSTANCE.nbtRenderSnapshot(), 512) : List.of();
            this.extractedPlayers = var2.playerMarker.qo() ? r.sample(Minecraft.getInstance()) : List.of();
            this.extractedEntities = var2.entityEsp.qo() ? i.sample(Minecraft.getInstance()) : List.of();
            this.extractedSchematic = List.of();
            this.extractedSchematicDebug = List.of();
         }
      }
   }

   private static List<com.wimpyclient.e.b> selectNearestBlockMarks(List<com.wimpyclient.e.b> var0, int var1) {
      if (var0.isEmpty()) {
         return List.of();
      } else if (var0.size() <= var1) {
         return var0;
      } else {
         Vec3 var2 = Minecraft.getInstance().gameRenderer.getMainCamera().position();
         com.wimpyclient.e.b[] var3 = new com.wimpyclient.e.b[var1];
         double[] var4 = new double[var1];
         int var5 = 0;
         double var6 = -1.0;
         int var8 = 0;

         for (com.wimpyclient.e.b var10 : var0) {
            BlockPos var11 = var10.pos();
            double var12 = var11.getX() + 0.5 - var2.x;
            double var14 = var11.getY() + 0.5 - var2.y;
            double var16 = var11.getZ() + 0.5 - var2.z;
            double var18 = var12 * var12 + var14 * var14 + var16 * var16;
            if (var5 < var1) {
               var3[var5] = var10;
               var4[var5] = var18;
               if (var18 > var6) {
                  var6 = var18;
                  var8 = var5;
               }

               var5++;
            } else if (!(var18 >= var6)) {
               var3[var8] = var10;
               var4[var8] = var18;
               var6 = -1.0;
               var8 = 0;

               for (int var20 = 0; var20 < var1; var20++) {
                  if (var4[var20] > var6) {
                     var6 = var4[var20];
                     var8 = var20;
                  }
               }
            }
         }

         ArrayList var21 = new ArrayList(var5);

         for (int var22 = 0; var22 < var5; var22++) {
            var21.add(var3[var22]);
         }

         return var21;
      }
   }

   private static List<com.wimpyclient.e.h> selectNearestSpawners(List<com.wimpyclient.e.h> var0, int var1) {
      if (!var0.isEmpty() && var0.size() > var1) {
         Vec3 var2 = Minecraft.getInstance().gameRenderer.getMainCamera().position();
         com.wimpyclient.e.h[] var3 = new com.wimpyclient.e.h[var1];
         double[] var4 = new double[var1];
         int var5 = 0;
         double var6 = -1.0;
         int var8 = 0;

         for (com.wimpyclient.e.h var10 : var0) {
            BlockPos var11 = var10.pos();
            double var12 = var11.getX() + 0.5 - var2.x;
            double var14 = var11.getY() + 0.5 - var2.y;
            double var16 = var11.getZ() + 0.5 - var2.z;
            double var18 = var12 * var12 + var14 * var14 + var16 * var16;
            if (var5 < var1) {
               var3[var5] = var10;
               var4[var5] = var18;
               if (var18 > var6) {
                  var6 = var18;
                  var8 = var5;
               }

               var5++;
            } else if (!(var18 >= var6)) {
               var3[var8] = var10;
               var4[var8] = var18;
               var6 = -1.0;
               var8 = 0;

               for (int var20 = 0; var20 < var1; var20++) {
                  if (var4[var20] > var6) {
                     var6 = var4[var20];
                     var8 = var20;
                  }
               }
            }
         }

         ArrayList var21 = new ArrayList(var5);

         for (int var22 = 0; var22 < var5; var22++) {
            var21.add(var3[var22]);
         }

         return var21;
      } else {
         return var0;
      }
   }

   private static List<BlockPos> selectNearestPositions(List<BlockPos> var0, int var1) {
      if (!var0.isEmpty() && var0.size() > var1) {
         Vec3 var2 = Minecraft.getInstance().gameRenderer.getMainCamera().position();
         BlockPos[] var3 = new BlockPos[var1];
         double[] var4 = new double[var1];
         int var5 = 0;
         double var6 = -1.0;
         int var8 = 0;

         for (BlockPos var10 : var0) {
            double var11 = var10.getX() + 0.5 - var2.x;
            double var13 = var10.getY() + 0.5 - var2.y;
            double var15 = var10.getZ() + 0.5 - var2.z;
            double var17 = var11 * var11 + var13 * var13 + var15 * var15;
            if (var5 < var1) {
               var3[var5] = var10;
               var4[var5] = var17;
               if (var17 > var6) {
                  var6 = var17;
                  var8 = var5;
               }

               var5++;
            } else if (!(var17 >= var6)) {
               var3[var8] = var10;
               var4[var8] = var17;
               var6 = -1.0;
               var8 = 0;

               for (int var19 = 0; var19 < var1; var19++) {
                  if (var4[var19] > var6) {
                     var6 = var4[var19];
                     var8 = var19;
                  }
               }
            }
         }

         ArrayList var20 = new ArrayList(var5);

         for (int var21 = 0; var21 < var5; var21++) {
            var20.add(var3[var21]);
         }

         return var20;
      } else {
         return var0;
      }
   }

   private void draw(WorldRenderContext var1) {
   }

   public void drawAfterShaderComposite() {
      if (!m.isShadowPass()) {
         if (this.hasAnythingToDraw()) {
            Minecraft var1 = Minecraft.getInstance();
            Camera var2 = var1.gameRenderer.getMainCamera();
            float var3 = var1.getDeltaTracker().getGameTimeDeltaPartialTick(true);
            com.wimpyclient.mixin.o var4 = (com.wimpyclient.mixin.o)var1.gameRenderer;
            float var5 = var4.wimpyclient$getFov(var2, var3, true);
            Matrix4f var6 = new Matrix4f(var1.gameRenderer.getProjectionMatrix(var5));
            PoseStack var7 = new PoseStack();
            float var8 = var2.getPartialTickTime();
            var4.wimpyclient$bobHurt(var7, var8);
            if (Boolean.TRUE.equals(var1.options.bobView().get())) {
               var4.wimpyclient$bobView(var7, var8);
            }

            var6.mul(var7.last().pose());
            RenderSystem.setProjectionMatrix(this.overlayProjectionBuffer().getBuffer(var6), ProjectionType.PERSPECTIVE);
            Matrix4fStack var9 = RenderSystem.getModelViewStack();
            var9.pushMatrix();
            var9.identity();
            var9.rotation(var2.rotation().conjugate(new Quaternionf()));

            try {
               Runnable var10 = () -> {
                  ByteBufferBuilder var1x = this.overlayBuffer();
                  BufferSource var2x = MultiBufferSource.immediate(var1x);
                  this.emitFrame(new PoseStack(), var2x);
                  var2x.endBatch();
               };
               if (m.isShaderPackInUse()) {
                  m.runWithPipelineBypass(var10);
               } else {
                  var10.run();
               }
            } finally {
               var9.popMatrix();
               if (this.overlayBuffer != null) {
                  this.overlayBuffer.clear();
               }
            }
         }
      }
   }

   private boolean hasAnythingToDraw() {
      return this.hasOverlayMarks() || anyTracersEnabled(com.wimpyclient.i.x.INSTANCE);
   }

   private boolean hasOverlayMarks() {
      return !this.extractedPlayerChunks.isEmpty()
         || !this.extractedBaseDebug.isEmpty()
         || !this.extractedBaseCalc.isEmpty()
         || !this.extractedBaseCalcCentroids.isEmpty()
         || !this.extractedYHideBases.isEmpty()
         || !this.extractedPrimeSus.isEmpty()
         || !this.extractedStorage.isEmpty()
         || !this.extractedBlockEsp.isEmpty()
         || !this.extractedSpawners.isEmpty()
         || !this.extractedNbt.isEmpty()
         || !this.extractedPlayers.isEmpty()
         || !this.extractedEntities.isEmpty()
         || !this.extractedSchematic.isEmpty()
         || !this.extractedSchematicDebug.isEmpty();
   }

   private void emitFrame(PoseStack var1, MultiBufferSource var2) {
      Minecraft var3 = Minecraft.getInstance();
      if (this.hasOverlayMarks()) {
         this.renderOverlays(var1, var2);
      }

      if (anyTracersEnabled(com.wimpyclient.i.x.INSTANCE)) {
         this.drawTracers(var1, var2, var3);
      }
   }

   private void drawTracers(PoseStack var1, MultiBufferSource var2, Minecraft var3) {
      Camera var4 = var3.gameRenderer.getMainCamera();
      Vector3f var5 = tracerStartOffset(var3, var4);
      Vector3f var6 = new Vector3f(var4.forwardVector());
      if (var6.lengthSquared() > 1.0E-12F) {
         var6.normalize();
      } else {
         var6.set(var5);
         if (var6.lengthSquared() > 1.0E-12F) {
            var6.normalize();
         } else {
            var6.set(0.0F, 0.0F, -1.0F);
         }
      }

      this.writeTracers(var2.getBuffer(p.lines()), var1.last(), com.wimpyclient.i.x.INSTANCE, var4.position(), var6, var5);
   }

   private void renderOverlays(PoseStack var1, MultiBufferSource var2) {
      Minecraft var3 = Minecraft.getInstance();
      Vec3 var4 = var3.gameRenderer.getMainCamera().position();
      VertexConsumer var5 = var2.getBuffer(p.FILLED);
      com.wimpyclient.i.x var6 = com.wimpyclient.i.x.INSTANCE;
      double var7 = var4.x;
      double var9 = var4.y;
      double var11 = var4.z;
      var1.pushPose();
      var1.translate(-var4.x, -var4.y, -var4.z);
      Matrix4f var13 = var1.last().pose();
      float var14 = overlayY();
      float var15 = var14 + 0.3F;
      if (!this.extractedPlayerChunks.isEmpty()) {
         this.renderChunkMarkers(
            var13, var5, this.extractedPlayerChunks, this.growthAppearNanos, var6.growthDebugStyle, var14, var15, var7, var11, false, 128, 0.45F
         );
      }

      if (!this.extractedYHideBases.isEmpty()) {
         var5 = var2.getBuffer(p.FILLED);
         float var16 = var3.level != null ? var3.level.getMaxY() + 1.0F : 320.0F;
         float var17 = var3.level != null ? var3.level.getMinY() : -64.0F;
         float var18 = 0.55F;
         float var19 = var6.yHideBasesStyle.redF();
         float var20 = var6.yHideBasesStyle.greenF();
         float var21 = var6.yHideBasesStyle.blueF();

         for (BlockPos var23 : this.extractedYHideBases) {
            float var24 = var23.getX() + 0.5F;
            float var25 = var23.getZ() + 0.5F;
            renderFilledBox(var13, var5, var24 - var18, var17, var25 - var18, var24 + var18, var16, var25 + var18, var19, var20, var21, 0.72F);
         }
      }

      if (!this.extractedBaseCalcCentroids.isEmpty()) {
         var5 = var2.getBuffer(p.FILLED);
         float var33 = var3.level != null ? var3.level.getMaxY() + 1.0F : 320.0F;
         float var35 = var3.level != null ? var3.level.getMinY() : -64.0F;
         float var37 = 0.55F;

         for (BlockPos var48 : this.extractedBaseCalcCentroids) {
            float var56 = var48.getX() + 0.5F;
            float var64 = var48.getZ() + 0.5F;
            renderFilledBox(var13, var5, var56 - var37, var35, var64 - var37, var56 + var37, var33, var64 + var37, 1.0F, 0.08F, 0.08F, 0.72F);
         }
      }

      float var34 = var6.primeSusRenderY;
      float var36 = var34 + 0.3F;
      if (!this.extractedPrimeSus.isEmpty()) {
         this.renderChunkMarkers(
            var13,
            var5,
            this.extractedPrimeSus,
            this.primeAppearNanos,
            var6.primeSusStyle,
            var34,
            var36,
            var7,
            var11,
            true,
            128,
            var6.primeSusAlphaPercent / 100.0F
         );
      }

      if (!this.extractedSchematic.isEmpty()) {
         var5 = var2.getBuffer(p.FILLED);

         for (aj$d var43 : this.extractedSchematic) {
            BlockPos var49 = var43.pos();
            float var57 = var43.wrong() ? 0.02F : 0.01F;
            renderFilledBox(
               var13,
               var5,
               var49.getX() + var57,
               var49.getY() + var57,
               var49.getZ() + var57,
               var49.getX() + 1.0F - var57,
               var49.getY() + 1.0F - var57,
               var49.getZ() + 1.0F - var57,
               var43.redF(),
               var43.greenF(),
               var43.blueF(),
               var43.alpha()
            );
         }

         Pose var39 = var1.last();
         VertexConsumer var44 = var2.getBuffer(p.lines());

         for (aj$d var58 : this.extractedSchematic) {
            BlockPos var65 = var58.pos();
            float var71 = var58.wrong() ? 0.02F : 0.01F;
            float var77 = var65.getX() + var71;
            float var84 = var65.getY() + var71;
            float var26 = var65.getZ() + var71;
            float var27 = var65.getX() + 1.0F - var71;
            float var28 = var65.getY() + 1.0F - var71;
            float var29 = var65.getZ() + 1.0F - var71;
            int var30 = var58.wrong() ? -50630 : packRgba(var58.redF(), var58.greenF(), var58.blueF(), 1.0F);
            renderBoxOutline(var44, var39, var77, var84, var26, var27, var28, var29, var30, 2.5F);
         }

         var5 = var2.getBuffer(p.FILLED);
      }

      if (!this.extractedSchematicDebug.isEmpty()) {
         Pose var40 = var1.last();
         VertexConsumer var45 = var2.getBuffer(p.lines());

         for (aj$b var59 : this.extractedSchematicDebug) {
            BlockPos var66 = var59.pos();
            float var72 = -0.02F;
            float var78 = var66.getX() + var72;
            float var85 = var66.getY() + var72;
            float var90 = var66.getZ() + var72;
            float var95 = var66.getX() + 1.0F - var72;
            float var99 = var66.getY() + 1.0F - var72;
            float var104 = var66.getZ() + 1.0F - var72;
            renderBoxOutline(var45, var40, var78, var85, var90, var95, var99, var104, var59.argb(), 3.5F);
         }

         var5 = var2.getBuffer(p.FILLED);

         for (aj$b var60 : this.extractedSchematicDebug) {
            BlockPos var67 = var60.pos();
            int var73 = var60.argb();
            float var79 = (var73 >> 16 & 0xFF) / 255.0F;
            float var86 = (var73 >> 8 & 0xFF) / 255.0F;
            float var91 = (var73 & 0xFF) / 255.0F;
            renderFilledBox(
               var13,
               var5,
               var67.getX() + 0.08F,
               var67.getY() + 0.08F,
               var67.getZ() + 0.08F,
               var67.getX() + 0.92F,
               var67.getY() + 0.92F,
               var67.getZ() + 0.92F,
               var79,
               var86,
               var91,
               0.45F
            );
         }
      }

      float var41 = var6.storageAlphaPercent / 100.0F;

      for (com.wimpyclient.e.b var53 : this.extractedStorage) {
         BlockPos var61 = var53.pos();
         if (withinEspRange(var7, var9, var11, var61.getX() + 0.5, var61.getY() + 0.5, var61.getZ() + 0.5)) {
            float var68 = var61.getX();
            float var74 = var61.getY();
            float var80 = var61.getZ();
            renderFilledBox(var13, var5, var68, var74, var80, var68 + 1.0F, var74 + 1.0F, var80 + 1.0F, var53.redF(), var53.greenF(), var53.blueF(), var41);
         }
      }

      float var47 = var6.blockEspAlphaPercent / 100.0F;

      for (com.wimpyclient.e.b var62 : this.extractedBlockEsp) {
         BlockPos var69 = var62.pos();
         if (withinEspRange(var7, var9, var11, var69.getX() + 0.5, var69.getY() + 0.5, var69.getZ() + 0.5)) {
            float var75 = var69.getX();
            float var81 = var69.getY();
            float var87 = var69.getZ();
            renderFilledBox(var13, var5, var75, var81, var87, var75 + 1.0F, var81 + 1.0F, var87 + 1.0F, var62.redF(), var62.greenF(), var62.blueF(), var47);
         }
      }

      float var55 = var6.spawnerAlphaPercent / 100.0F;
      com.wimpyclient.i.u var63 = var6.spawnerStyle;
      float var70 = var3.level != null ? var3.level.getMaxY() + 1.0F : 320.0F;
      float var76 = 0.55F;

      for (com.wimpyclient.e.h var88 : this.extractedSpawners) {
         BlockPos var92 = var88.pos();
         float var96 = var92.getX() + 0.5F;
         float var100 = var92.getZ() + 0.5F;
         renderFilledBox(var13, var5, var96 - var76, var92.getY(), var100 - var76, var96 + var76, var70, var100 + var76, 1.0F, 0.08F, 0.08F, 0.72F);
         if (withinEspRange(var7, var9, var11, var92.getX() + 0.5, var92.getY() + 0.5, var92.getZ() + 0.5)) {
            float var105 = var92.getX();
            float var109 = var92.getY();
            float var31 = var92.getZ();
            renderFilledBox(var13, var5, var105, var109, var31, var105 + 1.0F, var109 + 1.0F, var31 + 1.0F, var63.redF(), var63.greenF(), var63.blueF(), var55);
         }
      }

      float var83 = var6.nbtAlphaPercent / 100.0F;
      com.wimpyclient.i.u var89 = var6.nbtStyle;

      for (BlockPos var97 : this.extractedNbt) {
         if (withinEspRange(var7, var9, var11, var97.getX() + 0.5, var97.getY() + 0.5, var97.getZ() + 0.5)) {
            float var101 = var97.getX();
            float var106 = var97.getY();
            float var110 = var97.getZ();
            renderFilledBox(
               var13, var5, var101, var106, var110, var101 + 1.0F, var106 + 1.0F, var110 + 1.0F, var89.redF(), var89.greenF(), var89.blueF(), var83
            );
         }
      }

      float var94 = var6.playerMarkerAlphaPercent / 100.0F;
      com.wimpyclient.i.u var98 = var6.playerMarkerStyle;

      for (AABB var107 : this.extractedPlayers) {
         renderFilledBox(
            var13,
            var5,
            (float)var107.minX,
            (float)var107.minY,
            (float)var107.minZ,
            (float)var107.maxX,
            (float)var107.maxY,
            (float)var107.maxZ,
            var98.redF(),
            var98.greenF(),
            var98.blueF(),
            var94
         );
      }

      float var103 = var6.entityEspAlphaPercent / 100.0F;

      for (com.wimpyclient.e.c var111 : this.extractedEntities) {
         AABB var112 = var111.box();
         renderFilledBox(
            var13,
            var5,
            (float)var112.minX,
            (float)var112.minY,
            (float)var112.minZ,
            (float)var112.maxX,
            (float)var112.maxY,
            (float)var112.maxZ,
            var111.redF(),
            var111.greenF(),
            var111.blueF(),
            var103
         );
      }

      var1.popPose();
   }

   private int writeTracers(VertexConsumer var1, Pose var2, com.wimpyclient.i.x var3, Vec3 var4, Vector3fc var5, Vector3fc var6) {
      int var7 = 0;
      if (var3.playerMarker.qo() && var3.playerMarkerStyle.tracers) {
         int var8 = tracerArgb(var3.playerMarkerStyle.redF(), var3.playerMarkerStyle.greenF(), var3.playerMarkerStyle.blueF());

         for (AABB var10 : this.extractedPlayers) {
            if (var7 >= 512) {
               return var7;
            }

            tracer(var1, var2, var4, var5, var6, var10.getCenter().x, var10.getCenter().y, var10.getCenter().z, var8, 1.2F);
            var7++;
         }
      }

      if (var3.blockEsp.qo() && var3.blockEspStyle.tracers) {
         for (com.wimpyclient.e.b var22 : this.extractedBlockEsp) {
            if (var7 >= 512) {
               return var7;
            }

            BlockPos var29 = var22.pos();
            tracer(
               var1,
               var2,
               var4,
               var5,
               var6,
               var29.getX() + 0.5,
               var29.getY() + 0.5,
               var29.getZ() + 0.5,
               tracerArgb(var22.redF(), var22.greenF(), var22.blueF()),
               1.2F
            );
            var7++;
         }
      }

      if (var3.entityEsp.qo() && var3.entityEspStyle.tracers) {
         for (com.wimpyclient.e.c var23 : this.extractedEntities) {
            if (var7 >= 512) {
               return var7;
            }

            AABB var30 = var23.box();
            tracer(
               var1,
               var2,
               var4,
               var5,
               var6,
               var30.getCenter().x,
               var30.getCenter().y,
               var30.getCenter().z,
               tracerArgb(var23.redF(), var23.greenF(), var23.blueF()),
               1.2F
            );
            var7++;
         }
      }

      if (var3.growthDebug.qo() && var3.growthDebugStyle.tracers) {
         int var15 = tracerArgb(var3.growthDebugStyle.redF(), var3.growthDebugStyle.greenF(), var3.growthDebugStyle.blueF());
         var7 = this.emitChunkTracers(var1, var2, var4, var5, var6, this.extractedPlayerChunks, var15, var7, false);
      }

      if (var3.yHideBases.qo() && var3.yHideBasesStyle.tracers) {
         int var16 = tracerArgb(var3.yHideBasesStyle.redF(), var3.yHideBasesStyle.greenF(), var3.yHideBasesStyle.blueF());

         for (BlockPos var31 : this.extractedYHideBases) {
            if (var7 >= 512) {
               return var7;
            }

            double var11 = var31.getY() != 0 ? var31.getY() + 0.5 : 60.125;
            tracer(var1, var2, var4, var5, var6, var31.getX() + 0.5, var11, var31.getZ() + 0.5, var16, 1.2F);
            var7++;
         }
      }

      if (var3.baseDebug.qo() && var3.baseDebugStyle.tracers) {
         int var17 = tracerArgb(1.0F, 0.08F, 0.08F);
         float var25 = var3.baseCalcRenderY + 0.125F;

         for (BlockPos var36 : this.extractedBaseCalcCentroids) {
            if (var7 >= 512) {
               return var7;
            }

            tracer(var1, var2, var4, var5, var6, var36.getX() + 0.5, var25, var36.getZ() + 0.5, var17, 1.2F);
            var7++;
         }
      }

      if (var3.isPrimeSusFinderEnabled() && var3.primeSusStyle.tracers) {
         int var18 = tracerArgb(var3.primeSusStyle.redF(), var3.primeSusStyle.greenF(), var3.primeSusStyle.blueF());
         var7 = this.emitChunkTracers(var1, var2, var4, var5, var6, this.extractedPrimeSus, var3.primeSusRenderY, var18, var7, true);
      }

      if (var3.storage.qo() && var3.storageStyle.tracers) {
         for (com.wimpyclient.e.b var26 : this.extractedStorage) {
            if (var7 >= 512) {
               return var7;
            }

            BlockPos var33 = var26.pos();
            tracer(
               var1,
               var2,
               var4,
               var5,
               var6,
               var33.getX() + 0.5,
               var33.getY() + 0.5,
               var33.getZ() + 0.5,
               tracerArgb(var26.redF(), var26.greenF(), var26.blueF()),
               1.15F
            );
            var7++;
         }
      }

      if (var3.spawnerFinder.qo() && var3.spawnerStyle.tracers) {
         int var20 = tracerArgb(var3.spawnerStyle.redF(), var3.spawnerStyle.greenF(), var3.spawnerStyle.blueF());

         for (com.wimpyclient.e.h var34 : this.extractedSpawners) {
            if (var7 >= 512) {
               return var7;
            }

            BlockPos var37 = var34.pos();
            if (withinEspRange(var4.x, var4.y, var4.z, var37.getX() + 0.5, var37.getY() + 0.5, var37.getZ() + 0.5)) {
               tracer(var1, var2, var4, var5, var6, var37.getX() + 0.5, var37.getY() + 0.5, var37.getZ() + 0.5, var20, 1.2F);
               var7++;
            }
         }
      }

      if (var3.nbtBypass.qo() && var3.nbtStyle.tracers) {
         int var21 = tracerArgb(var3.nbtStyle.redF(), var3.nbtStyle.greenF(), var3.nbtStyle.blueF());

         for (BlockPos var35 : this.extractedNbt) {
            if (var7 >= 512) {
               return var7;
            }

            if (withinEspRange(var4.x, var4.y, var4.z, var35.getX() + 0.5, var35.getY() + 0.5, var35.getZ() + 0.5)) {
               tracer(var1, var2, var4, var5, var6, var35.getX() + 0.5, var35.getY() + 0.5, var35.getZ() + 0.5, var21, 1.2F);
               var7++;
            }
         }
      }

      return var7;
   }

   private int emitChunkTracers(
      VertexConsumer var1, Pose var2, Vec3 var3, Vector3fc var4, Vector3fc var5, List<ChunkPos> var6, int var7, int var8, boolean var9
   ) {
      return this.emitChunkTracers(var1, var2, var3, var4, var5, var6, overlayY(), var7, var8, var9);
   }

   private int emitChunkTracers(
      VertexConsumer var1, Pose var2, Vec3 var3, Vector3fc var4, Vector3fc var5, List<ChunkPos> var6, int var7, int var8, int var9, boolean var10
   ) {
      float var11 = var7 + 0.125F;

      for (ChunkPos var13 : var6) {
         if (var9 >= 512) {
            return var9;
         }

         double var14 = var13.getMinBlockX() + 8.0;
         double var16 = var13.getMinBlockZ() + 8.0;
         if (var10) {
            double var18 = var14 - var3.x;
            double var20 = var16 - var3.z;
            if (var18 * var18 + var20 * var20 > espMaxDistanceSq()) {
               continue;
            }
         }

         tracer(var1, var2, var3, var4, var5, var14, var11, var16, var8, 1.2F);
         var9++;
      }

      return var9;
   }

   private static void tracer(
      VertexConsumer var0, Pose var1, Vec3 var2, Vector3fc var3, Vector3fc var4, double var5, double var7, double var9, int var11, float var12
   ) {
      float var13 = var3.x();
      float var14 = var3.y();
      float var15 = var3.z();
      float var16 = (float)Math.sqrt(var13 * var13 + var14 * var14 + var15 * var15);
      if (var16 > 1.0E-6F) {
         var13 /= var16;
         var14 /= var16;
         var15 /= var16;
      }

      float var17 = var4.x();
      float var18 = var4.y();
      float var19 = var4.z();
      float var20 = (float)(var5 - var2.x);
      float var21 = (float)(var7 - var2.y);
      float var22 = (float)(var9 - var2.z);
      float var23 = var20 * var13 + var21 * var14 + var22 * var15;
      if (var23 < 0.1F) {
         float var24 = -0.25F / (var23 - 0.35F);
         var20 = var17 + (var20 - var17) * var24;
         var21 = var18 + (var21 - var18) * var24;
         var22 = var19 + (var22 - var19) * var24;
      }

      if (h.master()) {
         line(var0, var1, var17, var18, var19, var20, var21, var22, j.soft(var11, 0.28F), var12 * 3.0F);
         line(var0, var1, var17, var18, var19, var20, var21, var22, j.soft(var11, 0.55F), var12 * 1.6F);
      }

      line(var0, var1, var17, var18, var19, var20, var21, var22, var11, var12);
   }

   private static Vector3f tracerStartOffset(Minecraft var0, Camera var1) {
      PoseStack var2 = new PoseStack();
      float var3 = var1.getPartialTickTime();
      com.wimpyclient.mixin.o var4 = (com.wimpyclient.mixin.o)var0.gameRenderer;
      var4.wimpyclient$bobHurt(var2, var3);
      if (Boolean.TRUE.equals(var0.options.bobView().get())) {
         var4.wimpyclient$bobView(var2, var3);
      }

      Vector3f var5 = new Vector3f(0.0F, 0.0F, -0.35F);
      new Matrix4f(var2.last().pose()).invert().transformPosition(var5);
      new Matrix4f().rotation(var1.rotation()).transformPosition(var5);
      return var5;
   }

   private static void line(VertexConsumer var0, Pose var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, float var9) {
      Vector3f var10 = new Vector3f(var5 - var2, var6 - var3, var7 - var4);
      if (var10.lengthSquared() > 1.0E-9F) {
         var10.normalize();
      } else {
         var10.set(0.0F, 1.0F, 0.0F);
      }

      var0.addVertex(var1, var2, var3, var4).setColor(var8).setNormal(var1, var10).setLineWidth(var9);
      var0.addVertex(var1, var5, var6, var7).setColor(var8).setNormal(var1, var10).setLineWidth(var9);
   }

   private static boolean anyTracersEnabled(com.wimpyclient.i.x var0) {
      return var0.growthDebug.qo() && var0.growthDebugStyle.tracers
         || var0.yHideBases.qo() && var0.yHideBasesStyle.tracers
         || var0.baseDebug.qo() && var0.baseDebugStyle.tracers
         || var0.baseDebug.qo() && var0.baseCalcStyle.tracers
         || var0.isPrimeSusFinderEnabled() && var0.primeSusStyle.tracers
         || var0.storage.qo() && var0.storageStyle.tracers
         || var0.spawnerFinder.qo() && var0.spawnerStyle.tracers
         || var0.nbtBypass.qo() && var0.nbtStyle.tracers
         || var0.playerMarker.qo() && var0.playerMarkerStyle.tracers
         || var0.entityEsp.qo() && var0.entityEspStyle.tracers
         || var0.blockEsp.qo() && var0.blockEspStyle.tracers;
   }

   private static int tracerArgb(float var0, float var1, float var2) {
      int var3 = Math.round(var0 * 255.0F) & 0xFF;
      int var4 = Math.round(var1 * 255.0F) & 0xFF;
      int var5 = Math.round(var2 * 255.0F) & 0xFF;
      int var6 = Math.round(183.6F) & 0xFF;
      return var6 << 24 | var3 << 16 | var4 << 8 | var5;
   }

   private static double espMaxDistanceSq() {
      Minecraft var0 = Minecraft.getInstance();
      double var1 = 128.0;
      if (var0 != null && var0.options != null) {
         var1 = Math.max(128.0, var0.options.getEffectiveRenderDistance() * 16.0);
      }

      return var1 * var1;
   }

   private static boolean withinEspRange(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = var6 - var0;
      double var14 = var8 - var2;
      double var16 = var10 - var4;
      return var12 * var12 + var14 * var14 + var16 * var16 <= espMaxDistanceSq();
   }

   private void renderChunkMarkers(
      Matrix4fc var1,
      VertexConsumer var2,
      List<ChunkPos> var3,
      Map<Long, Long> var4,
      com.wimpyclient.i.u var5,
      float var6,
      float var7,
      double var8,
      double var10,
      boolean var12,
      int var13,
      float var14
   ) {
      if (var3 != null && !var3.isEmpty()) {
         float var15 = var5.redF();
         float var16 = var5.greenF();
         float var17 = var5.blueF();
         HashSet var18 = new HashSet();

         for (ChunkPos var20 : var3) {
            var18.add(ChunkPos.asLong(var20.x, var20.z));
         }

         Iterator var43 = var4.entrySet().iterator();

         while (var43.hasNext()) {
            if (!var18.contains(((Entry)var43.next()).getKey())) {
               var43.remove();
            }
         }

         long var44 = System.nanoTime();
         float var22 = var7;
         int var23 = 0;

         for (ChunkPos var25 : var3) {
            if (var23 >= var13) {
               return;
            }

            double var26 = var25.getMinBlockX() + 8.0;
            double var28 = var25.getMinBlockZ() + 8.0;
            double var30 = var26 - var8;
            double var32 = var28 - var10;
            if (!var12 || !(var30 * var30 + var32 * var32 > espMaxDistanceSq())) {
               long var34 = ChunkPos.asLong(var25.x, var25.z);
               long var36 = var4.computeIfAbsent(var34, var2x -> var44);
               float var38 = popupScale((float)(var44 - var36) / 1.0E9F);
               boolean var39 = var18.contains(ChunkPos.asLong(var25.x, var25.z - 1));
               boolean var40 = var18.contains(ChunkPos.asLong(var25.x, var25.z + 1));
               boolean var41 = var18.contains(ChunkPos.asLong(var25.x - 1, var25.z));
               boolean var42 = var18.contains(ChunkPos.asLong(var25.x + 1, var25.z));
               emitRoundedChunkPlane(
                  var1, var2, var25.getMinBlockX(), var22, var25.getMinBlockZ(), var38, var39, var40, var41, var42, var15, var16, var17, var14
               );
               var23++;
            }
         }
      }
   }

   private static float popupScale(float var0) {
      float var1 = Mth.clamp(var0 / 0.34F, 0.0F, 1.0F);
      float var2 = 1.0F - (1.0F - var1) * (1.0F - var1) * (1.0F - var1);
      float var3 = var1 < 1.0F ? 0.08F * (float)Math.sin(var1 * Math.PI) * (1.0F - var1) : 0.0F;
      return 0.12F + 0.88F * var2 + var3;
   }

   private static void emitRoundedChunkPlane(
      Matrix4fc var0,
      VertexConsumer var1,
      float var2,
      float var3,
      float var4,
      float var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      float var10,
      float var11,
      float var12,
      float var13
   ) {
      float var14 = var2 + 8.0F;
      float var15 = var4 + 8.0F;
      float var16 = var2 - (var8 ? 0.18F : 0.0F);
      float var17 = var4 - (var6 ? 0.18F : 0.0F);
      float var18 = var2 + 16.0F + (var9 ? 0.18F : 0.0F);
      float var19 = var4 + 16.0F + (var7 ? 0.18F : 0.0F);
      float var20 = !var6 && !var8 ? 2.35F : 0.0F;
      float var21 = !var6 && !var9 ? 2.35F : 0.0F;
      float var22 = !var7 && !var9 ? 2.35F : 0.0F;
      float var23 = !var7 && !var8 ? 2.35F : 0.0F;
      float var24 = Math.min((var18 - var16) * 0.45F, (var19 - var17) * 0.45F);
      var20 = Math.min(var20, var24);
      var21 = Math.min(var21, var24);
      var22 = Math.min(var22, var24);
      var23 = Math.min(var23, var24);
      float var25 = var16 + var20;
      float var26 = var17 + var20;
      float var27 = var18 - var21;
      float var28 = var17 + var21;
      float var29 = var18 - var22;
      float var30 = var19 - var22;
      float var31 = var16 + var23;
      float var32 = var19 - var23;
      float var33 = Math.max(var16 + Math.max(var20, var23), var16);
      float var34 = Math.max(var17 + Math.max(var20, var21), var17);
      float var35 = Math.min(var18 - Math.max(var21, var22), var18);
      float var36 = Math.min(var19 - Math.max(var22, var23), var19);
      if (var35 - var33 > 0.05F && var36 - var34 > 0.05F) {
         quadTop(var0, var1, var33, var3, var34, var35, var36, var14, var15, var5, var10, var11, var12, var13);
      }

      if (var20 <= 0.01F && var21 <= 0.01F) {
         quadTop(var0, var1, var16, var3, var17, var18, var34, var14, var15, var5, var10, var11, var12, var13);
      } else if (var27 > var25 && var34 > var17) {
         quadTop(var0, var1, var25, var3, var17, var27, var34, var14, var15, var5, var10, var11, var12, var13);
      }

      if (var23 <= 0.01F && var22 <= 0.01F) {
         quadTop(var0, var1, var16, var3, var36, var18, var19, var14, var15, var5, var10, var11, var12, var13);
      } else if (var29 > var31 && var19 > var36) {
         quadTop(var0, var1, var31, var3, var36, var29, var19, var14, var15, var5, var10, var11, var12, var13);
      }

      if (var20 <= 0.01F && var23 <= 0.01F) {
         quadTop(var0, var1, var16, var3, var34, var33, var36, var14, var15, var5, var10, var11, var12, var13);
      } else if (var33 > var16) {
         quadTop(var0, var1, var16, var3, Math.max(var26, var34), var33, Math.min(var32, var36), var14, var15, var5, var10, var11, var12, var13);
      }

      if (var21 <= 0.01F && var22 <= 0.01F) {
         quadTop(var0, var1, var35, var3, var34, var18, var36, var14, var15, var5, var10, var11, var12, var13);
      } else if (var18 > var35) {
         quadTop(var0, var1, var35, var3, Math.max(var28, var34), var18, Math.min(var30, var36), var14, var15, var5, var10, var11, var12, var13);
      }

      emitCorner(
         var0, var1, var16 + var20, var17 + var20, var20, var3, (float) Math.PI, (float) (Math.PI * 3.0 / 2.0), var14, var15, var5, var10, var11, var12, var13
      );
      emitCorner(
         var0,
         var1,
         var18 - var21,
         var17 + var21,
         var21,
         var3,
         (float) (Math.PI * 3.0 / 2.0),
         (float) (Math.PI * 2),
         var14,
         var15,
         var5,
         var10,
         var11,
         var12,
         var13
      );
      emitCorner(var0, var1, var18 - var22, var19 - var22, var22, var3, 0.0F, (float) (Math.PI / 2), var14, var15, var5, var10, var11, var12, var13);
      emitCorner(var0, var1, var16 + var23, var19 - var23, var23, var3, (float) (Math.PI / 2), (float) Math.PI, var14, var15, var5, var10, var11, var12, var13);
   }

   private static void emitCorner(
      Matrix4fc var0,
      VertexConsumer var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14
   ) {
      if (!(var4 <= 0.02F)) {
         for (int var15 = 0; var15 < 5; var15++) {
            float var16 = var15 / 5.0F;
            float var17 = (var15 + 1) / 5.0F;
            float var18 = var6 + (var7 - var6) * var16;
            float var19 = var6 + (var7 - var6) * var17;
            float var20 = var2 + (float)Math.cos(var18) * var4;
            float var21 = var3 + (float)Math.sin(var18) * var4;
            float var22 = var2 + (float)Math.cos(var19) * var4;
            float var23 = var3 + (float)Math.sin(var19) * var4;
            vert(var0, var1, var2, var5, var3, var8, var9, var10, var11, var12, var13, var14);
            vert(var0, var1, var20, var5, var21, var8, var9, var10, var11, var12, var13, var14);
            vert(var0, var1, var22, var5, var23, var8, var9, var10, var11, var12, var13, var14);
            vert(var0, var1, var22, var5, var23, var8, var9, var10, var11, var12, var13, var14);
         }
      }
   }

   private static void quadTop(
      Matrix4fc var0,
      VertexConsumer var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13
   ) {
      if (!(var5 - var2 < 0.02F) && !(var6 - var4 < 0.02F)) {
         vert(var0, var1, var2, var3, var6, var7, var8, var9, var10, var11, var12, var13);
         vert(var0, var1, var5, var3, var6, var7, var8, var9, var10, var11, var12, var13);
         vert(var0, var1, var5, var3, var4, var7, var8, var9, var10, var11, var12, var13);
         vert(var0, var1, var2, var3, var4, var7, var8, var9, var10, var11, var12, var13);
      }
   }

   private static void vert(
      Matrix4fc var0,
      VertexConsumer var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11
   ) {
      float var12 = var5 + (var2 - var5) * var7;
      float var13 = var6 + (var4 - var6) * var7;
      var1.addVertex(var0, var12, var3, var13).setColor(var8, var9, var10, var11);
   }

   private static int packRgba(float var0, float var1, float var2, float var3) {
      int var4 = Mth.clamp((int)(var0 * 255.0F), 0, 255);
      int var5 = Mth.clamp((int)(var1 * 255.0F), 0, 255);
      int var6 = Mth.clamp((int)(var2 * 255.0F), 0, 255);
      int var7 = Mth.clamp((int)(var3 * 255.0F), 0, 255);
      return var7 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   private static void renderBoxOutline(
      VertexConsumer var0, Pose var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, float var9
   ) {
      if (h.master()) {
         int var10 = j.soft(var8, 0.22F);
         strokeBox(var0, var1, var2, var3, var4, var5, var6, var7, var10, var9 * 3.2F);
         strokeBox(var0, var1, var2, var3, var4, var5, var6, var7, j.soft(var8, 0.45F), var9 * 1.7F);
      }

      strokeBox(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   private static void strokeBox(VertexConsumer var0, Pose var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, float var9) {
      line(var0, var1, var2, var3, var4, var5, var3, var4, var8, var9);
      line(var0, var1, var5, var3, var4, var5, var3, var7, var8, var9);
      line(var0, var1, var5, var3, var7, var2, var3, var7, var8, var9);
      line(var0, var1, var2, var3, var7, var2, var3, var4, var8, var9);
      line(var0, var1, var2, var6, var4, var5, var6, var4, var8, var9);
      line(var0, var1, var5, var6, var4, var5, var6, var7, var8, var9);
      line(var0, var1, var5, var6, var7, var2, var6, var7, var8, var9);
      line(var0, var1, var2, var6, var7, var2, var6, var4, var8, var9);
      line(var0, var1, var2, var3, var4, var2, var6, var4, var8, var9);
      line(var0, var1, var5, var3, var4, var5, var6, var4, var8, var9);
      line(var0, var1, var5, var3, var7, var5, var6, var7, var8, var9);
      line(var0, var1, var2, var3, var7, var2, var6, var7, var8, var9);
   }

   private static void renderFilledBox(
      Matrix4fc var0,
      VertexConsumer var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11
   ) {
      var1.addVertex(var0, var2, var3, var7).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var5, var3, var7).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var5, var6, var7).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var2, var6, var7).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var5, var3, var4).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var2, var3, var4).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var2, var6, var4).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var5, var6, var4).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var2, var3, var4).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var2, var3, var7).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var2, var6, var7).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var2, var6, var4).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var5, var3, var7).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var5, var3, var4).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var5, var6, var4).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var5, var6, var7).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var2, var6, var7).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var5, var6, var7).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var5, var6, var4).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var2, var6, var4).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var2, var3, var4).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var5, var3, var4).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var5, var3, var7).setColor(var8, var9, var10, var11);
      var1.addVertex(var0, var2, var3, var7).setColor(var8, var9, var10, var11);
   }

   public static void close() {
      if (INSTANCE.overlayBuffer != null) {
         INSTANCE.overlayBuffer.close();
         INSTANCE.overlayBuffer = null;
      }

      if (INSTANCE.overlayProjectionBuffer != null) {
         INSTANCE.overlayProjectionBuffer.close();
         INSTANCE.overlayProjectionBuffer = null;
      }
   }
}
