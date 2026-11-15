package com.wimpyclient.k;

import com.mojang.blaze3d.opengl.GlDevice;
import com.mojang.blaze3d.opengl.GlTexture;
import com.mojang.blaze3d.opengl.GlTextureView;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.wimpyclient.auth.LicenseGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL33C;

@Environment(EnvType.CLIENT)
public final class q {
   private static int fbo = -1;
   private static int stencilRbo = -1;
   private static int stencilW;
   private static int stencilH;
   private static int stencilSamples = -1;
   private static boolean crashed;
   private static boolean hudCrashed;
   private static boolean loggedFboFailure;
   private static int cachedBindMode;
   private static int cachedBindW;
   private static int cachedBindH;
   private static int cachedBindColorTex;
   private static int cachedBindFb;

   private q() {
   }

   public static float uiScale() {
      Minecraft var0 = Minecraft.getInstance();
      int var1 = var0.getWindow().getHeight();
      if (var0.gameRenderer != null) {
         RenderTarget var2 = var0.getMainRenderTarget();
         if (var2 != null) {
            var1 = var2.height;
         }
      }

      return Math.max(1.0F, var1 / 1080.0F);
   }

   public static void render() {
      if (!crashed) {
         Minecraft var0 = Minecraft.getInstance();
         if (var0.gameRenderer != null) {
            boolean var1 = var0.level != null && var0.player != null && LicenseGate.isAuthorized();
            boolean var2 = com.wimpyclient.g.g.INSTANCE.shouldDraw();
            if (var1 || var2) {
               if (com.wimpyclient.m.b.ready()) {
                  RenderTarget var3 = var0.getMainRenderTarget();
                  if (var3 != null) {
                     try {
                        com.wimpyclient.m.a var4 = com.wimpyclient.m.a.capture();

                        try {
                           if (bindCachedOrDiscover(var3, var4, var3.width, var3.height)) {
                              com.wimpyclient.m.b var5 = com.wimpyclient.m.b.get();
                              int var6 = Math.max(1, var3.width);
                              int var7 = Math.max(1, var3.height);
                              var5.beginFrame(var6, var7, 1.0F);
                              if (var1 && !hudCrashed) {
                                 float var8 = Math.max(1.0F, var7 / 1080.0F);
                                 var5.save();
                                 var5.scale(var8);
                                 float var9 = var6 / var8;
                                 float var10 = var7 / var8;

                                 try {
                                    safeHud(() -> l.renderNvg(var5, var9, var10), "InfoHud");
                                    safeHud(() -> z.renderNvg(var5, var9, var10), "StatusEffects");
                                    safeHud(() -> x.renderNvg(var5, var9, var10), "Staff");
                                    safeHud(() -> s.renderNvg(var5, var9, var10), "RtpMap");
                                    safeHud(() -> o.renderNvg(var5), "Nametag");
                                    safeHud(() -> w.renderNvg(var5, var9, var10), "Spotify");
                                    if (com.wimpyclient.g.g.INSTANCE.isOpen()) {
                                       k.INSTANCE.ensureAllVisible();
                                    }

                                    k.INSTANCE.drawEditHandles(var5);
                                 } catch (Throwable var27) {
                                    hudCrashed = true;
                                    com.wimpyclient.Wimpy.LOGGER.error("NanoVG HUD crashed; Click GUI will keep running", var27);
                                 } finally {
                                    var5.restore();
                                 }
                              }

                              if (var2 && var0.mouseHandler != null) {
                                 try {
                                    Window var31 = var0.getWindow();
                                    float var32 = var31.getGuiScaledWidth();
                                    float var33 = var31.getGuiScaledHeight();
                                    float var11 = var6 / Math.max(1.0F, var32);
                                    float var12 = var7 / Math.max(1.0F, var33);
                                    var5.save();
                                    var5.scale(var11, var12);
                                    int var13 = (int)var0.mouseHandler.getScaledXPos(var31);
                                    int var14 = (int)var0.mouseHandler.getScaledYPos(var31);
                                    com.wimpyclient.g.g.INSTANCE.renderNvg(var5, var13, var14, var32, var33);
                                    var5.restore();
                                 } catch (Throwable var26) {
                                    com.wimpyclient.Wimpy.LOGGER.error("NanoVG ClickGUI crashed", var26);
                                 }
                              }

                              var5.endFrame();
                              return;
                           }

                           logFboFailure("no usable framebuffer after GuiRenderer.submit");
                        } finally {
                           var4.restore();
                        }
                     } catch (Throwable var30) {
                        crashed = true;
                        com.wimpyclient.Wimpy.LOGGER.error("NanoVG overlay crashed; disabling overlay renderer", var30);
                     }
                  }
               }
            }
         }
      }
   }

   private static void safeHud(Runnable var0, String var1) {
      try {
         var0.run();
      } catch (Throwable var3) {
         com.wimpyclient.Wimpy.LOGGER.error("NanoVG HUD piece crashed: " + var1, var3);
      }
   }

   public static void close() {
      if (fbo != -1) {
         GL33C.glDeleteFramebuffers(fbo);
         fbo = -1;
      }

      if (stencilRbo != -1) {
         GL33C.glDeleteRenderbuffers(stencilRbo);
         stencilRbo = -1;
         stencilW = 0;
         stencilH = 0;
         stencilSamples = -1;
      }

      com.wimpyclient.m.b.shutdown();
      crashed = false;
      hudCrashed = false;
      loggedFboFailure = false;
      cachedBindMode = 0;
      cachedBindW = 0;
      cachedBindH = 0;
      cachedBindColorTex = 0;
      cachedBindFb = 0;
   }

   private static boolean bindCachedOrDiscover(RenderTarget var0, com.wimpyclient.m.a var1, int var2, int var3) {
      int var4 = colorTextureId(var0);
      if (cachedBindMode != 0 && cachedBindW == var2 && cachedBindH == var3 && cachedBindColorTex == var4 && rebindCached(var1, var2, var3)) {
         return true;
      } else {
         cachedBindMode = 0;
         if (bindNativeFbo(var0, var2, var3)) {
            cachedBindMode = 1;
            cachedBindW = var2;
            cachedBindH = var3;
            cachedBindColorTex = var4;
            cachedBindFb = GL33C.glGetInteger(36006);
            return true;
         } else if (bindOverlayFbo(var0, var2, var3)) {
            cachedBindMode = 2;
            cachedBindW = var2;
            cachedBindH = var3;
            cachedBindColorTex = var4;
            cachedBindFb = fbo;
            return true;
         } else if (bindMinecraftFbo(var1, var2, var3)) {
            cachedBindMode = 3;
            cachedBindW = var2;
            cachedBindH = var3;
            cachedBindColorTex = var4;
            cachedBindFb = var1.framebuffer();
            return true;
         } else {
            return false;
         }
      }
   }

   private static boolean rebindCached(com.wimpyclient.m.a var0, int var1, int var2) {
      switch (cachedBindMode) {
         case 1:
            if (cachedBindFb <= 0) {
               return false;
            }

            GL33C.glBindFramebuffer(36160, cachedBindFb);
            GL33C.glViewport(0, 0, var1, var2);
            GL33C.glDisable(3089);
            return true;
         case 2:
            if (fbo <= 0) {
               return false;
            }

            GL33C.glBindFramebuffer(36160, fbo);
            GL33C.glViewport(0, 0, var1, var2);
            GL33C.glDisable(3089);
            return true;
         case 3:
            return bindMinecraftFbo(var0, var1, var2);
         default:
            return false;
      }
   }

   private static boolean bindNativeFbo(RenderTarget var0, int var1, int var2) {
      if (!(var0.getColorTextureView() instanceof GlTextureView var4 && !var4.isClosed())) {
         return false;
      } else if (RenderSystem.getDevice() instanceof GlDevice var6) {
         int var7 = var4.getFbo(var6.directStateAccess(), var0.getDepthTexture());
         if (var7 <= 0) {
            return false;
         } else {
            GL33C.glBindFramebuffer(36160, var7);
            if (GL33C.glCheckFramebufferStatus(36160) != 36053) {
               return false;
            } else {
               GL33C.glViewport(0, 0, var1, var2);
               GL33C.glDisable(3089);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private static boolean bindOverlayFbo(RenderTarget var0, int var1, int var2) {
      int var3 = colorTextureId(var0);
      if (var3 <= 0) {
         return false;
      } else {
         int var4 = colorMip(var0);
         if (fbo == -1) {
            fbo = GL33C.glGenFramebuffers();
         }

         GL33C.glBindFramebuffer(36160, fbo);
         int[] var5 = new int[]{3553, 37120};

         for (int var9 : var5) {
            GL33C.glFramebufferTexture2D(36160, 36064, var9, var3, var4);
            int var10 = var9 == 37120 ? querySamples(var3) : 0;
            attachStencil(var1, var2, var10);
            if (GL33C.glCheckFramebufferStatus(36160) == 36053) {
               GL33C.glViewport(0, 0, var1, var2);
               GL33C.glDisable(3089);
               return true;
            }
         }

         GL33C.glFramebufferTexture(36160, 36064, var3, var4);
         attachStencil(var1, var2, 0);
         if (GL33C.glCheckFramebufferStatus(36160) == 36053) {
            GL33C.glViewport(0, 0, var1, var2);
            GL33C.glDisable(3089);
            return true;
         } else {
            return false;
         }
      }
   }

   private static int colorTextureId(RenderTarget var0) {
      if (var0.getColorTextureView() instanceof GlTextureView var2 && !var2.isClosed() && var2.texture() instanceof GlTexture var4 && !var4.isClosed()) {
         return var4.glId();
      } else {
         return var0.getColorTexture() instanceof GlTexture var6 && !var6.isClosed() ? var6.glId() : 0;
      }
   }

   private static int colorMip(RenderTarget var0) {
      GpuTextureView var1 = var0.getColorTextureView();
      return var1 != null ? Math.max(0, var1.baseMipLevel()) : 0;
   }

   private static boolean bindMinecraftFbo(com.wimpyclient.m.a var0, int var1, int var2) {
      int var3 = var0.framebuffer();
      if (var3 <= 0) {
         return false;
      } else {
         GL33C.glBindFramebuffer(36160, var3);
         if (GL33C.glCheckFramebufferStatus(36160) != 36053) {
            return false;
         } else {
            int[] var4 = var0.viewport();
            if (var4[2] > 0 && var4[3] > 0) {
               GL33C.glViewport(var4[0], var4[1], var4[2], var4[3]);
            } else {
               GL33C.glViewport(0, 0, var1, var2);
            }

            GL33C.glDisable(3089);
            return true;
         }
      }
   }

   private static void attachStencil(int var0, int var1, int var2) {
      if (stencilRbo == -1) {
         stencilRbo = GL33C.glGenRenderbuffers();
      }

      int var3 = Math.max(0, var2);
      if (stencilW != var0 || stencilH != var1 || stencilSamples != var3) {
         GL33C.glBindRenderbuffer(36161, stencilRbo);
         if (var3 > 1) {
            GL33C.glRenderbufferStorageMultisample(36161, var3, 35056, var0, var1);
         } else {
            GL33C.glRenderbufferStorage(36161, 35056, var0, var1);
         }

         stencilW = var0;
         stencilH = var1;
         stencilSamples = var3;
      }

      GL33C.glFramebufferRenderbuffer(36160, 33306, 36161, stencilRbo);
   }

   private static int querySamples(int var0) {
      int var1 = GL33C.glGetInteger(37124);
      GL33C.glBindTexture(37120, var0);
      int var2 = GL33C.glGetTexLevelParameteri(37120, 0, 37126);
      GL33C.glBindTexture(37120, var1);
      return Math.max(0, var2);
   }

   private static void logFboFailure(String var0) {
      if (!loggedFboFailure) {
         loggedFboFailure = true;
         com.wimpyclient.Wimpy.LOGGER.error("ClickGUI overlay could not bind a framebuffer: {}", var0);
      }
   }
}
