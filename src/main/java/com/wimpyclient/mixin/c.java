package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import com.wimpyclient.bridge.FreelookCameraAccess;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({Camera.class})
public abstract class c implements FreelookCameraAccess {
   @Shadow
   private Entity entity;
   @Shadow
   private boolean detached;
   @Shadow
   private float eyeHeight;
   @Shadow
   private float eyeHeightOld;

   public c() {
   }

   @Shadow
   protected abstract void setRotation(float var1, float var2);

   @Shadow
   protected abstract void setPosition(double var1, double var3, double var5);

   @Shadow
   protected abstract void move(float var1, float var2, float var3);

   @Override
   public void wimpyclient$setRotation(float var1, float var2) {
      this.setRotation(var1, var2);
   }

   @Override
   public void wimpyclient$setPosition(double var1, double var3, double var5) {
      this.setPosition(var1, var3, var5);
   }

   @Override
   public void wimpyclient$move(float var1) {
      this.move(var1, 0.0F, 0.0F);
   }

   @Inject(
      method = {"setup(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;ZZF)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$syncEyeHeight(Level var1, Entity var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      if (BridgeGate.ready() && var2 != null && this.entity != null) {
         try {
            if (var2 instanceof com.wimpyclient.i.p || this.entity instanceof com.wimpyclient.i.p) {
               this.eyeHeightOld = this.eyeHeight = var2.getEyeHeight();
            }
         } catch (LinkageError var8) {
         }
      }
   }

   @Inject(
      method = {"setup(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;ZZF)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$freelookOrbit(Level var1, Entity var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      if (BridgeGate.ready()) {
         try {
            if (!com.wimpyclient.i.r.INSTANCE.isActive()) {
               return;
            }

            Minecraft var7 = Minecraft.getInstance();
            LocalPlayer var8 = var7.player;
            if (var8 == null) {
               return;
            }

            this.detached = true;
            com.wimpyclient.i.r.INSTANCE.applyToCamera((Camera)(Object)this, var8, var5);
         } catch (LinkageError var9) {
         }
      }
   }
}
