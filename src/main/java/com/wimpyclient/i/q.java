package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.CameraType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.KeyboardInput;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Input;
import net.minecraft.world.phys.Vec2;

@Environment(EnvType.CLIENT)
public final class q {
   public static final q INSTANCE = new q();
   private boolean active;
   private p freeCamera;
   private CameraType rememberedCameraType;
   private boolean rememberedSmartCull = true;
   private boolean rememberedAutoJump = false;
   private boolean autoJumpOverrideActive;
   private Input heldKeys = Input.EMPTY;
   private Vec2 heldMove = Vec2.ZERO;
   private boolean speedDirty;

   private q() {
   }

   public boolean isActive() {
      return this.active && x.INSTANCE.freecam.qo() && this.freeCamera != null;
   }

   public p camera() {
      return this.freeCamera;
   }

   public double x() {
      return this.freeCamera != null ? this.freeCamera.getX() : 0.0;
   }

   public double y() {
      return this.freeCamera != null ? this.freeCamera.getY() : 0.0;
   }

   public double z() {
      return this.freeCamera != null ? this.freeCamera.getZ() : 0.0;
   }

   public void tick(Minecraft var1) {
      if (!LicenseGate.isAuthorized()) {
         if (this.active) {
            this.disable(var1);
         }
      } else {
         v var2 = x.INSTANCE.freecam;
         LocalPlayer var3 = var1.player;
         if (var2.qo() && var3 != null && var1.level != null) {
            if (!this.active) {
               this.enable(var1, var3);
            }

            this.applyHeldPlayerMovement(var3);
         } else {
            if (this.active) {
               this.disable(var1);
            }
         }
      }
   }

   public boolean handleTurn(double var1, double var3) {
      if (this.isActive() && this.freeCamera != null) {
         this.freeCamera.turn(var1, var3);
         return true;
      } else {
         return false;
      }
   }

   public boolean handleScroll(double var1) {
      if (this.isActive() && !(Math.abs(var1) < 1.0E-4)) {
         int var3 = var1 > 0.0 ? 1 : -1;
         int var4 = Math.max(1, Math.min(50, x.INSTANCE.freecamSpeed + var3));
         if (var4 == x.INSTANCE.freecamSpeed) {
            return true;
         } else {
            x.INSTANCE.freecamSpeed = var4;
            this.speedDirty = true;
            return true;
         }
      } else {
         return false;
      }
   }

   public void onDisconnect(Minecraft var1) {
      if (this.active) {
         this.disable(var1);
      }

      x.INSTANCE.freecam.qq(false);
   }

   private void enable(Minecraft var1, LocalPlayer var2) {
      if (r.INSTANCE.isActive() || x.INSTANCE.freelook.qo()) {
         x.INSTANCE.freelook.qq(false);
         r.INSTANCE.reset();
      }

      this.captureHeldMovement(var2);
      this.rememberedSmartCull = var1.smartCull;
      var1.smartCull = false;
      this.rememberedAutoJump = (Boolean)var1.options.autoJump().get();
      var1.options.autoJump().set(true);
      this.autoJumpOverrideActive = true;
      this.rememberedCameraType = var1.options.getCameraType();
      if (var1.gameRenderer.getMainCamera().isDetached()) {
         var1.options.setCameraType(CameraType.FIRST_PERSON);
      }

      this.freeCamera = new p();
      this.freeCamera.applyFrom(var2);
      this.freeCamera.spawn();
      var1.setCameraEntity(this.freeCamera);
      this.active = true;
   }

   private void disable(Minecraft var1) {
      LocalPlayer var2 = var1.player;
      if (this.freeCamera != null) {
         var1.setCameraEntity(var2);
         this.freeCamera.despawn();
         this.freeCamera = null;
      }

      var1.smartCull = this.rememberedSmartCull;
      if (this.autoJumpOverrideActive) {
         var1.options.autoJump().set(this.rememberedAutoJump);
         this.autoJumpOverrideActive = false;
      }

      if (this.rememberedCameraType != null) {
         var1.options.setCameraType(this.rememberedCameraType);
         this.rememberedCameraType = null;
      }

      if (var2 != null) {
         var2.input = new KeyboardInput(var1.options);
         var2.xBob = var2.xBobO = var2.getXRot();
         var2.yBob = var2.yBobO = var2.getYRot();
      }

      this.heldKeys = Input.EMPTY;
      this.heldMove = Vec2.ZERO;
      this.active = false;
      if (this.speedDirty) {
         this.speedDirty = false;
         com.wimpyclient.d.a.save();
      }
   }

   private void captureHeldMovement(LocalPlayer var1) {
      Input var2 = var1.input != null ? var1.input.keyPresses : Input.EMPTY;
      Vec2 var3 = var1.input != null ? var1.input.getMoveVector() : Vec2.ZERO;
      boolean var4 = var2.forward() || var2.backward() || var2.left() || var2.right() || var3.lengthSquared() > 1.0E-5F;
      if (var4) {
         this.heldKeys = new Input(var2.forward(), var2.backward(), var2.left(), var2.right(), false, false, var2.sprint());
         this.heldMove = var3.lengthSquared() > 1.0E-5F ? var3 : impulseFromKeys(var2);
      } else {
         this.heldKeys = Input.EMPTY;
         this.heldMove = Vec2.ZERO;
      }
   }

   private static Vec2 impulseFromKeys(Input var0) {
      float var1 = impulse(var0.forward(), var0.backward());
      float var2 = impulse(var0.left(), var0.right());
      return new Vec2(var2, var1);
   }

   private static float impulse(boolean var0, boolean var1) {
      if (var0 == var1) {
         return 0.0F;
      } else {
         return var0 ? 1.0F : -1.0F;
      }
   }

   private void applyHeldPlayerMovement(LocalPlayer var1) {
      Input var2 = this.heldKeys;
      if (ag.INSTANCE.shouldCrouch(var1)) {
         var2 = ag.withShift(var2, true);
      }

      var1.input = new q$a(var2, this.heldMove);
   }

   public void reset() {
      Minecraft var1 = Minecraft.getInstance();
      if (this.active) {
         this.disable(var1);
      }
   }
}
