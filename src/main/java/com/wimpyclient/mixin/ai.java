package com.wimpyclient.mixin;

import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.Window;
import com.wimpyclient.bridge.BridgeGate;
import com.wimpyclient.bridge.ClickOverlayAccess;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MouseHandler;
import net.minecraft.client.input.MouseButtonInfo;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({MouseHandler.class})
public class ai {
   @Shadow
   @Final
   private Minecraft minecraft;
   private boolean wimpyclient$overlayLeftDown;

   public ai() {
   }

   @Inject(
      method = {"onButton(JLnet/minecraft/client/input/MouseButtonInfo;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$overlayButton(long var1, MouseButtonInfo var3, int var4, CallbackInfo var5) {
      try {
         if (!BridgeGate.ready()) {
            return;
         }

         if (this.minecraft.getWindow().handle() != var1) {
            return;
         }

         ClickOverlayAccess var6 = BridgeGate.overlay();
         if (var6 != null && var6.isOpen()) {
            double var17 = ((MouseHandler)(Object)this).getScaledXPos(this.minecraft.getWindow());
            double var18 = ((MouseHandler)(Object)this).getScaledYPos(this.minecraft.getWindow());
            int var19 = var3.button();
            if (var19 == 0) {
               this.wimpyclient$overlayLeftDown = var4 == 1;
            }

            if (var4 == 1) {
               var6.mouseClicked(var17, var18, var19);
            } else if (var4 == 0) {
               var6.mouseReleased(var17, var18, var19);
            }

            var5.cancel();
            return;
         }

         this.wimpyclient$overlayLeftDown = false;
         if (var4 == 1 && var3.button() == 0 && this.minecraft.screen != null) {
            double var7 = ((MouseHandler)(Object)this).getScaledXPos(this.minecraft.getWindow());
            double var9 = ((MouseHandler)(Object)this).getScaledYPos(this.minecraft.getWindow());
            float var11 = Math.max(1.0F, com.wimpyclient.k.q.uiScale());
            RenderTarget var12 = this.minecraft.getMainRenderTarget();
            float var13 = 1.0F;
            float var14 = 1.0F;
            if (var12 != null) {
               Window var15 = this.minecraft.getWindow();
               var13 = var12.width / Math.max(1.0F, (float)var15.getGuiScaledWidth());
               var14 = var12.height / Math.max(1.0F, (float)var15.getGuiScaledHeight());
            }

            if (com.wimpyclient.k.w.onClick((float)(var7 * var13), (float)(var9 * var14), var11)) {
               var5.cancel();
            }
         }
      } catch (RuntimeException | LinkageError var16) {
      }
   }

   @Inject(
      method = {"onScroll(JDD)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$overlayScroll(long var1, double var3, double var5, CallbackInfo var7) {
      if (BridgeGate.ready()) {
         if (this.minecraft.getWindow().handle() == var1) {
            ClickOverlayAccess var8 = BridgeGate.overlay();
            if (var8 != null && var8.isOpen()) {
               MouseHandler var9 = (MouseHandler)(Object)this;
               double var10 = var9.getScaledXPos(this.minecraft.getWindow());
               double var12 = var9.getScaledYPos(this.minecraft.getWindow());
               var8.mouseScrolled(var10, var12, var5);
               var7.cancel();
            } else {
               if (this.minecraft.screen == null && com.wimpyclient.i.q.INSTANCE.handleScroll(var5)) {
                  var7.cancel();
               }
            }
         }
      }
   }

   @Inject(
      method = {"onMove(JDD)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$overlayDrag(long var1, double var3, double var5, CallbackInfo var7) {
      if (BridgeGate.ready()) {
         ClickOverlayAccess var8 = BridgeGate.overlay();
         if (var8 == null || !var8.isOpen() || this.minecraft.getWindow().handle() != var1) {
            this.wimpyclient$overlayLeftDown = false;
         } else if (this.wimpyclient$overlayLeftDown) {
            MouseHandler var9 = (MouseHandler)(Object)this;
            double var10 = var9.getScaledXPos(this.minecraft.getWindow());
            double var12 = var9.getScaledYPos(this.minecraft.getWindow());
            var8.mouseDragged(var10, var12, 0);
         }
      }
   }

   @Inject(
      method = {"grabMouse()V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$keepCursorFree(CallbackInfo var1) {
      try {
         if (!BridgeGate.ready()) {
            return;
         }

         ClickOverlayAccess var2 = BridgeGate.overlay();
         if (var2 != null && var2.isOpen()) {
            var1.cancel();
         }
      } catch (RuntimeException | LinkageError var3) {
      }
   }
}
