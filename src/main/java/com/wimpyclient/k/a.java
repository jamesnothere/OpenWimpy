package com.wimpyclient.k;

import com.mojang.blaze3d.vertex.ByteBufferBuilder;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.MultiBufferSource.BufferSource;
import net.minecraft.client.renderer.state.SkyRenderState;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType.Skybox;
import org.joml.Vector3f;
import org.joml.Vector4f;

@Environment(EnvType.CLIENT)
public final class a {
   public static final a INSTANCE = new a();
   private static final int STAR_CAP = 420;
   private static final int METEOR_CAP = 18;
   private static final int TRAIL = 16;
   private static final float GOLDEN = 2.399963F;
   public static final int SKY_ARGB = -16579316;
   private static final float FOG_R = 0.012F;
   private static final float FOG_G = 0.018F;
   private static final float FOG_B = 0.045F;
   private final a$b[] stars = new a$b[420];
   private final a$a[] meteors = new a$a[18];
   private final Vector3f camRight = new Vector3f();
   private final Vector3f camUp = new Vector3f();
   private final Vector3f scratch = new Vector3f();
   private final Vector3f scratch2 = new Vector3f();
   private final Vector3f scratch3 = new Vector3f();
   private final Random rng = new Random();
   private boolean seeded;
   private float spawnAcc;
   private long lastNanos;
   private ByteBufferBuilder skyBuffer;

   private a() {
      for (int var1 = 0; var1 < 18; var1++) {
         this.meteors[var1] = new a$a();
      }
   }

   public static boolean wantsDraw() {
      return com.wimpyclient.i.x.INSTANCE.ambient.qo();
   }

   public static boolean shouldDarkenSky(ClientLevel var0, float var1) {
      if (wantsDraw() && var0 != null) {
         if (var0.dimensionType().skybox() != Skybox.OVERWORLD) {
            return false;
         } else {
            return com.wimpyclient.i.x.INSTANCE.ambientDay ? true : nightFactor(var0, var1) > 0.12F;
         }
      } else {
         return false;
      }
   }

   public static void applyDarkSky(SkyRenderState var0) {
      var0.skyColor = -16579316;
      var0.sunriseAndSunsetColor = 0;
      var0.rainBrightness = 0.0F;
      var0.starBrightness = 0.0F;
   }

   public static void tintFog(Vector4f var0) {
      var0.x = Mth.lerp(0.42F, var0.x, 0.012F);
      var0.y = Mth.lerp(0.42F, var0.y, 0.018F);
      var0.z = Mth.lerp(0.42F, var0.z, 0.045F);
   }

   public void drawInSkyPass() {
      if (!m.isShadowPass()) {
         Minecraft var1 = Minecraft.getInstance();
         ByteBufferBuilder var2 = this.skyBuffer();
         BufferSource var3 = MultiBufferSource.immediate(var2);

         try {
            this.draw(new PoseStack(), var3, var1);
            var3.endBatch();
         } finally {
            var2.clear();
         }
      }
   }

   public void draw(PoseStack var1, MultiBufferSource var2, Minecraft var3) {
      if (wantsDraw() && var3.level != null) {
         ClientLevel var4 = var3.level;
         if (var4.dimension() != Level.NETHER) {
            Camera var5 = var3.gameRenderer.getMainCamera();
            this.seedStars();
            var5.rotation().transform(this.camRight.set(1.0F, 0.0F, 0.0F));
            var5.rotation().transform(this.camUp.set(0.0F, 1.0F, 0.0F));
            com.wimpyclient.i.x var6 = com.wimpyclient.i.x.INSTANCE;
            int var7 = Mth.clamp(var6.ambientStars, 0, 420);
            int var8 = Mth.clamp(var6.ambientMeteors, 0, 18);
            float var9 = Mth.clamp(var6.ambientSpeed / 10.0F, 0.25F, 2.5F);
            float var10 = Mth.clamp(var6.ambientBrightness / 100.0F, 0.1F, 1.6F);
            float var11 = var3.getDeltaTracker().getGameTimeDeltaPartialTick(true);
            float var12;
            if (shouldDarkenSky(var4, var11)) {
               var12 = 0.82F + 0.18F * nightFactor(var4, var11);
            } else {
               var12 = nightFactor(var4, var11);
               var12 *= var12;
            }

            var12 *= 1.0F - 0.35F * var4.getRainLevel(var11);
            var12 = Mth.clamp(var12 * var10 * 1.65F, 0.0F, 1.85F);
            if (!(var12 < 0.03F)) {
               float var13 = 100.0F;
               float var14 = 0.0F;
               long var15 = System.nanoTime();
               if (this.lastNanos != 0L && !var3.isPaused()) {
                  var14 = Mth.clamp((float)(var15 - this.lastNanos) / 1.0E9F, 0.0F, 0.08F);
               }

               this.lastNanos = var15;
               if (!var3.isPaused()) {
                  this.tickMeteors(var14, var9, var8);
               }

               Pose var17 = var1.last();
               float var18 = (float)var15 * 1.0E-9F;
               VertexConsumer var19 = var2.getBuffer(p.SKY_FILLED);

               for (int var20 = 0; var20 < var7; var20++) {
                  a$b var21 = this.stars[var20];
                  float var22 = Mth.clamp((var21.dir.y + 0.08F) / 0.32F, 0.0F, 1.0F);
                  if (!(var22 <= 0.01F)) {
                     float var23 = 0.52F + 0.48F * (0.5F + 0.5F * Mth.sin(var18 * var21.twinkle + var21.phase));
                     float var24 = Mth.clamp(var12 * var22 * var23 * var21.gain * 1.35F, 0.0F, 1.0F);
                     if (!(var24 < 0.02F)) {
                        float var25 = (var21.sparkle ? 1.15F : 0.72F) * var21.size * (0.9F + var23 * 0.25F);
                        this.quad(var19, var17, var21.dir, var13, var25, com.wimpyclient.p.g.withAlpha(var21.tint, var24));
                     }
                  }
               }

               for (a$a var35 : this.meteors) {
                  if (var35.alive) {
                     this.drawMeteorHead(var19, var17, var35, var13, var12);
                  }
               }

               VertexConsumer var30 = var2.getBuffer(p.skyLines());

               for (a$a var37 : this.meteors) {
                  if (var37.alive) {
                     this.drawMeteorTrail(var30, var17, var37, var13, var12);
                  }
               }
            }
         }
      } else {
         this.spawnAcc = 0.0F;
      }
   }

   private void seedStars() {
      if (!this.seeded) {
         this.seeded = true;
         Random var1 = new Random(2813410449L);
         int var2 = 0;
         int var3 = 0;

         while (var2 < 420 && var3++ < 1680) {
            float var4 = 1.0F - (var2 + var1.nextFloat()) / 420.0F * 1.22F;
            if (!(var4 < -0.12F)) {
               float var5 = (float)Math.sqrt(Math.max(0.0, 1.0 - var4 * var4));
               float var6 = 2.399963F * var2 + var1.nextFloat() * 0.35F;
               float var7 = Mth.cos(var6) * var5;
               float var8 = Mth.sin(var6) * var5;
               float var9 = Mth.sqrt(var7 * var7 + var4 * var4 + var8 * var8);
               if (!(var9 < 1.0E-4F)) {
                  a$b var10 = new a$b();
                  var10.dir.set(var7 / var9, var4 / var9, var8 / var9);
                  float var11 = var1.nextFloat();
                  var10.size = 0.16F + var11 * var11 * 0.62F;
                  var10.phase = var1.nextFloat() * (float) (Math.PI * 2);
                  var10.twinkle = 0.55F + var1.nextFloat() * 2.4F;
                  var10.gain = 0.55F + var1.nextFloat() * 0.55F;
                  var10.sparkle = var11 > 0.86F;
                  if (var11 < 0.62F) {
                     var10.tint = com.wimpyclient.p.g.lerp(-1378561, -4724737, var1.nextFloat() * 0.45F);
                  } else if (var11 < 0.84F) {
                     var10.tint = com.wimpyclient.p.g.lerp(-8466433, h.chrome(), var1.nextFloat());
                  } else if (var11 < 0.94F) {
                     var10.tint = -8016;
                  } else {
                     var10.tint = com.wimpyclient.p.g.lerp(-25896, h.chromeBright(), 0.35F);
                  }

                  this.stars[var2++] = var10;
               }
            }
         }

         while (var2 < 420) {
            a$b var12 = new a$b();
            var12.dir.set(0.0F, 1.0F, 0.0F);
            var12.gain = 0.0F;
            this.stars[var2++] = var12;
         }
      }
   }

   private void tickMeteors(float var1, float var2, int var3) {
      int var4 = 0;

      for (a$a var8 : this.meteors) {
         if (var8.alive) {
            var4++;
            var8.age += var1;
            if (!(var8.age >= var8.life) && !(var8.pos.y < -0.12F)) {
               this.scratch.set(var8.vel).mul(var1);
               var8.pos.add(this.scratch).normalize();
               float var9 = var8.vel.dot(var8.pos);
               var8.vel.sub(var8.pos.x * var9, var8.pos.y * var9, var8.pos.z * var9);
               if (var8.vel.lengthSquared() < 1.0E-6F) {
                  var8.alive = false;
                  var4--;
               } else {
                  var8.vel.normalize().mul(var8.speed * var2);
                  pushTrail(var8, var8.pos);
               }
            } else {
               var8.alive = false;
               var4--;
            }
         }
      }

      if (var3 > 0) {
         this.spawnAcc += var1 * var3 * 0.42F;

         while (this.spawnAcc >= 1.0F && var4 < var3) {
            this.spawnAcc--;
            if (this.spawnMeteor()) {
               var4++;
            }
         }

         if (this.spawnAcc > 3.0F) {
            this.spawnAcc = 3.0F;
         }
      }
   }

   private boolean spawnMeteor() {
      a$a var1 = null;

      for (a$a var5 : this.meteors) {
         if (!var5.alive) {
            var1 = var5;
            break;
         }
      }

      if (var1 == null) {
         return false;
      } else {
         for (int var6 = 0; var6 < 12; var6++) {
            this.randomHemisphere(this.scratch);
            this.scratch2.set(this.rng.nextFloat() * 2.0F - 1.0F, this.rng.nextFloat() * 0.7F + 0.15F, this.rng.nextFloat() * 2.0F - 1.0F).normalize();
            this.scratch.cross(this.scratch2, this.scratch3);
            if (!(this.scratch3.lengthSquared() < 0.05F)) {
               this.scratch2.set(this.scratch3).normalize();
               if (this.scratch2.y > 0.08F) {
                  this.scratch2.y -= 0.42F;
                  this.scratch2.normalize();
               }

               var1.alive = true;
               var1.pos.set(this.scratch);
               var1.speed = 0.28F + this.rng.nextFloat() * 0.55F;
               var1.vel.set(this.scratch2).mul(var1.speed);
               var1.age = 0.0F;
               var1.life = 0.85F + this.rng.nextFloat() * 1.55F;
               var1.width = 1.6F + this.rng.nextFloat() * 2.4F;
               var1.trailCount = 0;
               var1.trailHead = 0;
               boolean var7 = this.rng.nextFloat() < 0.55F;
               var1.core = var7 ? -655873 : -3372;
               var1.tail = var7 ? -8466433 : -26038;
               pushTrail(var1, var1.pos);
               return true;
            }
         }

         return false;
      }
   }

   private void randomHemisphere(Vector3f var1) {
      float var2 = 0.18F + this.rng.nextFloat() * 0.82F;
      float var3 = this.rng.nextFloat() * (float) (Math.PI * 2);
      float var4 = (float)Math.sqrt(Math.max(0.0, 1.0 - var2 * var2));
      var1.set(Mth.cos(var3) * var4, var2, Mth.sin(var3) * var4).normalize();
   }

   private static void pushTrail(a$a var0, Vector3f var1) {
      var0.trail[var0.trailHead].set(var1);
      var0.trailHead = (var0.trailHead + 1) % 16;
      if (var0.trailCount < 16) {
         var0.trailCount++;
      }
   }

   private float meteorFade(a$a var1, float var2) {
      float var3 = 1.0F - var1.age / var1.life;
      var3 = var3 * var3 * (3.0F - 2.0F * var3);
      float var4 = Mth.clamp(var1.age / 0.12F, 0.0F, 1.0F);
      float var5 = Mth.clamp((var1.pos.y + 0.08F) / 0.28F, 0.0F, 1.0F);
      return Mth.clamp(var2 * var3 * var4 * var5 * 1.35F, 0.0F, 1.0F);
   }

   private ByteBufferBuilder skyBuffer() {
      if (this.skyBuffer == null) {
         this.skyBuffer = new ByteBufferBuilder(262144);
      }

      return this.skyBuffer;
   }

   private void drawMeteorHead(VertexConsumer var1, Pose var2, a$a var3, float var4, float var5) {
      float var6 = this.meteorFade(var3, var5);
      if (!(var6 < 0.02F)) {
         float var7 = 0.72F + var3.width * 0.18F;
         this.quad(var1, var2, var3.pos, var4, var7 * 2.4F, com.wimpyclient.p.g.withAlpha(var3.tail, var6 * 0.42F));
         this.quad(var1, var2, var3.pos, var4, var7, com.wimpyclient.p.g.withAlpha(var3.core, Math.min(1.0F, var6 * 1.35F)));
      }
   }

   private void drawMeteorTrail(VertexConsumer var1, Pose var2, a$a var3, float var4, float var5) {
      float var6 = this.meteorFade(var3, var5);
      if (!(var6 < 0.02F) && var3.trailCount >= 2) {
         int var7 = var3.trailCount;
         int var8 = (var3.trailHead - var7 + 16) % 16;

         for (int var9 = 0; var9 < var7 - 1; var9++) {
            Vector3f var10 = var3.trail[(var8 + var9) % 16];
            Vector3f var11 = var3.trail[(var8 + var9 + 1) % 16];
            float var12 = (float)(var9 + 1) / var7;
            float var13 = Mth.clamp(var6 * var12 * var12 * 1.25F, 0.0F, 1.0F);
            int var14 = com.wimpyclient.p.g.withAlpha(com.wimpyclient.p.g.lerp(var3.tail, var3.core, var12), var13);
            float var15 = var3.width * (0.55F + var12 * 1.15F);
            line(var1, var2, var10, var11, var4, var14, var15);
         }
      }
   }

   private void quad(VertexConsumer var1, Pose var2, Vector3f var3, float var4, float var5, int var6) {
      this.scratch.set(var3).mul(var4);
      float var7 = this.camRight.x * var5;
      float var8 = this.camRight.y * var5;
      float var9 = this.camRight.z * var5;
      float var10 = this.camUp.x * var5;
      float var11 = this.camUp.y * var5;
      float var12 = this.camUp.z * var5;
      float var13 = this.scratch.x;
      float var14 = this.scratch.y;
      float var15 = this.scratch.z;
      var1.addVertex(var2, var13 - var7 - var10, var14 - var8 - var11, var15 - var9 - var12).setColor(var6);
      var1.addVertex(var2, var13 + var7 - var10, var14 + var8 - var11, var15 + var9 - var12).setColor(var6);
      var1.addVertex(var2, var13 + var7 + var10, var14 + var8 + var11, var15 + var9 + var12).setColor(var6);
      var1.addVertex(var2, var13 - var7 + var10, var14 - var8 + var11, var15 - var9 + var12).setColor(var6);
   }

   private void cross(VertexConsumer var1, Pose var2, Vector3f var3, float var4, float var5, int var6) {
      this.scratch3.set(var3).mul(var4);
      this.lineOffset(var1, var2, this.scratch3, this.camRight, var5, var6, 1.15F);
      this.lineOffset(var1, var2, this.scratch3, this.camUp, var5 * 0.85F, var6, 1.05F);
   }

   private void lineOffset(VertexConsumer var1, Pose var2, Vector3f var3, Vector3f var4, float var5, int var6, float var7) {
      line(var1, var2, this.scratch2.set(var3).fma(-var5, var4), this.scratch.set(var3).fma(var5, var4), 1.0F, var6, var7);
   }

   private static void line(VertexConsumer var0, Pose var1, Vector3f var2, Vector3f var3, float var4, int var5, float var6) {
      float var7 = var2.x * var4;
      float var8 = var2.y * var4;
      float var9 = var2.z * var4;
      float var10 = var3.x * var4;
      float var11 = var3.y * var4;
      float var12 = var3.z * var4;
      Vector3f var13 = new Vector3f(var10 - var7, var11 - var8, var12 - var9);
      if (var13.lengthSquared() > 1.0E-9F) {
         var13.normalize();
      } else {
         var13.set(0.0F, 1.0F, 0.0F);
      }

      var0.addVertex(var1, var7, var8, var9).setColor(var5).setNormal(var1, var13).setLineWidth(var6);
      var0.addVertex(var1, var10, var11, var12).setColor(var5).setNormal(var1, var13).setLineWidth(var6);
   }

   private static float nightFactor(ClientLevel var0, float var1) {
      float var2 = (((float)var0.getDayTime() + var1) % 24000.0F + 24000.0F) % 24000.0F;
      if (var2 > 13000.0F && var2 < 23000.0F) {
         return 1.0F;
      } else if (var2 >= 12000.0F && var2 <= 13000.0F) {
         float var4 = (var2 - 12000.0F) / 1000.0F;
         return var4 * var4;
      } else if (var2 >= 23000.0F) {
         float var3 = 1.0F - (var2 - 23000.0F) / 1000.0F;
         return var3 * var3;
      } else {
         return 0.0F;
      }
   }
}
