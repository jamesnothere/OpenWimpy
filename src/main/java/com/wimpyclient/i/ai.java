package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Abilities;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class ai {
   public static final ai INSTANCE = new ai();
   private static final float VANILLA_FLYING_SPEED = 0.05F;
   private static final float SPRINT_AIR_ACCEL = 0.026F;
   private static final double FLOAT_CLEAR_DY = -0.03125;
   private static final double FLOAT_RESET_DY = -0.04;
   private static final int FLOAT_RESET_INTERVAL = 30;
   private static final double OPEN_AIR_INFLATE = 0.0625;
   private static final double OPEN_AIR_BELOW = -0.55;
   private static final float GRIM_MAX_IMPULSE = 0.12F;
   private boolean spoofing;
   private boolean holdUi;
   private boolean savedFlying;
   private float savedFlyingSpeed;
   private int floatTicks;

   private ai() {
   }

   public boolean isActive() {
      if (!LicenseGate.isAuthorized()) {
         return false;
      } else {
         x var1 = x.INSTANCE;
         if (!var1.flight.qo()) {
            return false;
         } else if (q.INSTANCE.isActive()) {
            return false;
         } else {
            Minecraft var2 = Minecraft.getInstance();
            return var2.player != null && var2.level != null;
         }
      }
   }

   public boolean isGrimMode() {
      return "Grim".equals(x.INSTANCE.flightMode);
   }

   public boolean isUiBlocking() {
      Minecraft var1 = Minecraft.getInstance();
      return var1.screen != null || com.wimpyclient.g.g.INSTANCE.isOpen();
   }

   public boolean spoofOnGround() {
      return this.isActive() && !this.isGrimMode() && !this.isUiBlocking() ? x.INSTANCE.flightAntiKick : false;
   }

   public void tick(Minecraft var1) {
      if (!this.isActive()) {
         this.floatTicks = 0;
      }
   }

   public void beginAiStep(LocalPlayer var1) {
      this.spoofing = false;
      this.holdUi = false;
      if (!this.canControl(var1)) {
         this.floatTicks = 0;
      } else if (this.isUiBlocking()) {
         this.holdUi = true;
      } else {
         Abilities var2 = var1.getAbilities();
         this.savedFlying = var2.flying;
         this.savedFlyingSpeed = var2.getFlyingSpeed();
         this.spoofing = true;
         var2.flying = true;
         var2.setFlyingSpeed(this.horizontalSpeed() * this.verticalScale());
      }
   }

   public void prepareTravel(LocalPlayer var1) {
      if (this.spoofing) {
         Abilities var2 = var1.getAbilities();
         if (!var2.flying) {
            this.addFlyImpulse(var1);
         }

         var2.flying = true;
         var2.setFlyingSpeed(this.horizontalSpeed());
      }
   }

   private void addFlyImpulse(LocalPlayer var1) {
      if (var1.input != null) {
         int var2 = 0;
         if (var1.input.keyPresses.shift()) {
            var2--;
         }

         if (var1.input.keyPresses.jump()) {
            var2++;
         }

         if (var2 != 0) {
            float var3 = var1.getAbilities().getFlyingSpeed();
            var1.setDeltaMovement(var1.getDeltaMovement().add(0.0, var2 * var3 * 3.0F, 0.0));
         }
      }
   }

   public boolean shouldCancelTravel() {
      return this.holdUi;
   }

   public boolean suppressAbilitiesPacket() {
      return this.spoofing;
   }

   public void endAiStep(LocalPlayer var1) {
      if (this.spoofing) {
         Abilities var2 = var1.getAbilities();
         var2.flying = var1.isSpectator() || this.savedFlying;
         var2.setFlyingSpeed(this.savedFlyingSpeed);
         this.spoofing = false;
      }

      if (!this.canControl(var1)) {
         this.floatTicks = 0;
      } else {
         var1.fallDistance = 0.0;
         if (this.wantsFloatReset(var1) && this.serverWouldCountFloating(var1)) {
            this.applyFloatReset(var1);
         } else {
            this.floatTicks = 0;
         }
      }
   }

   private boolean canControl(LocalPlayer var1) {
      return this.isActive()
         && var1 == Minecraft.getInstance().player
         && !var1.isPassenger()
         && !var1.isSleeping()
         && !var1.isSpectator()
         && !var1.isFallFlying();
   }

   private float horizontalSpeed() {
      int var1 = Mth.clamp(x.INSTANCE.flightSpeed, 1, 10);
      if (this.isGrimMode()) {
         float var2 = (var1 - 1) / 9.0F;
         return Mth.lerp(var2, 0.008F, 0.026F);
      } else {
         return 0.05F * (var1 / 5.0F);
      }
   }

   private float verticalScale() {
      int var1 = Mth.clamp(x.INSTANCE.flightVerticalSpeed, 1, 10);
      float var2 = var1 / 5.0F;
      if (!this.isGrimMode()) {
         return var2;
      } else {
         float var3 = this.horizontalSpeed();
         float var4 = var3 * 3.0F * var2;
         return !(var4 <= 0.12F) && !(var3 <= 1.0E-4F) ? 0.12F / (var3 * 3.0F) : var2;
      }
   }

   private boolean wantsFloatReset(LocalPlayer var1) {
      return !var1.getAbilities().mayfly && !var1.hasEffect(MobEffects.LEVITATION) && !var1.isAutoSpinAttack()
         ? this.isGrimMode() || x.INSTANCE.flightAntiKick
         : false;
   }

   private boolean serverWouldCountFloating(LocalPlayer var1) {
      if (!var1.onGround() && !var1.verticalCollisionBelow) {
         AABB var2 = var1.getBoundingBox().inflate(0.0625).expandTowards(0.0, -0.55, 0.0);
         return var1.level().getBlockStates(var2).allMatch(var0 -> var0.isAir());
      } else {
         return false;
      }
   }

   private void applyFloatReset(LocalPlayer var1) {
      double var2 = var1.getY() - var1.yo;
      if (var2 < -0.03125) {
         this.floatTicks = 0;
      } else if (++this.floatTicks >= 30) {
         var1.move(MoverType.SELF, new Vec3(0.0, -0.04 - var2, 0.0));
         var1.fallDistance = 0.0;
         if (var1.getY() - var1.yo < -0.03125 || var1.verticalCollisionBelow || var1.onGround()) {
            this.floatTicks = 0;
         }
      }
   }
}
