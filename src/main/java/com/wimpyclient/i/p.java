package com.wimpyclient.i;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.KeyboardInput;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class p extends AbstractClientPlayer {
   public static final int ENTITY_ID = -420;
   public KeyboardInput input;

   public p() {
      super(Minecraft.getInstance().level, new GameProfile(UUID.randomUUID(), "FreeCamera"));
      this.setId(-420);
      this.setPose(Pose.SWIMMING);
      this.noPhysics = true;
      this.setNoGravity(true);
      this.getAbilities().flying = true;
      this.input = new KeyboardInput(Minecraft.getInstance().options);
   }

   public void applyFrom(Entity var1) {
      this.snapTo(var1.getX(), var1.getEyeY(), var1.getZ(), var1.getYRot(), var1.getXRot());
   }

   public void spawn() {
      ClientLevel var1 = (ClientLevel)this.level();
      var1.addEntity(this);
   }

   public void despawn() {
      ClientLevel var1 = (ClientLevel)this.level();
      var1.removeEntity(this.getId(), RemovalReason.DISCARDED);
   }

   public void tick() {
      this.input.tick();
      this.doMotion();
      this.noPhysics = true;
      super.tick();
      this.noPhysics = true;
   }

   public void move(MoverType var1, Vec3 var2) {
      this.setPos(this.getX() + var2.x, this.getY() + var2.y, this.getZ() + var2.z);
   }

   public boolean isPushable() {
      return false;
   }

   public boolean canBeCollidedWith(Entity var1) {
      return false;
   }

   public boolean canCollideWith(Entity var1) {
      return false;
   }

   private void doMotion() {
      Minecraft var1 = Minecraft.getInstance();
      float var2 = x.INSTANCE.freecamSpeed / 10.0F;
      if (var1.options.keySprint.isDown() || this.input.keyPresses.sprint()) {
         var2 *= 1.5F;
      }

      float var3 = this.getYRot();
      Vec3 var4 = Vec3.directionFromRotation(0.0F, var3);
      Vec3 var5 = Vec3.directionFromRotation(0.0F, var3 + 90.0F);
      double var6 = 0.0;
      double var8 = 0.0;
      double var10 = 0.0;
      boolean var12 = false;
      boolean var13 = false;
      if (this.input.keyPresses.forward()) {
         var6 += var4.x * var2;
         var10 += var4.z * var2;
         var12 = true;
      }

      if (this.input.keyPresses.backward()) {
         var6 -= var4.x * var2;
         var10 -= var4.z * var2;
         var12 = true;
      }

      if (this.input.keyPresses.right()) {
         var6 += var5.x * var2;
         var10 += var5.z * var2;
         var13 = true;
      }

      if (this.input.keyPresses.left()) {
         var6 -= var5.x * var2;
         var10 -= var5.z * var2;
         var13 = true;
      }

      if (var12 && var13) {
         double var14 = Mth.sin((float)Math.toRadians(45.0));
         var6 *= var14;
         var10 *= var14;
      }

      if (this.input.keyPresses.jump()) {
         var8 += var2;
      }

      if (this.input.keyPresses.shift()) {
         var8 -= var2;
      }

      this.setDeltaMovement(var6, var8, var10);
      this.getAbilities().flying = true;
      this.setOnGround(false);
   }

   protected void applyInput() {
      Vec2 var1 = this.input.getMoveVector();
      if (var1.lengthSquared() != 0.0F) {
         var1 = var1.scale(0.98F);
      }

      this.xxa = var1.x;
      this.zza = var1.y;
      this.jumping = this.input.keyPresses.jump();
      this.setSprinting(Minecraft.getInstance().options.keySprint.isDown() && this.input.keyPresses.forward());
   }

   public boolean canSimulateMovement() {
      return true;
   }

   public boolean isEffectiveAi() {
      return true;
   }

   public boolean isLocalPlayer() {
      return false;
   }

   public void setPose(Pose var1) {
      super.setPose(Pose.SWIMMING);
   }

   public boolean onClimbable() {
      return false;
   }

   public boolean isInWater() {
      return false;
   }

   public PushReaction getPistonPushReaction() {
      return PushReaction.IGNORE;
   }

   protected void checkFallDamage(double var1, boolean var3, BlockState var4, BlockPos var5) {
   }

   protected boolean updateIsUnderwater() {
      this.wasUnderwater = this.isEyeInFluid(FluidTags.WATER);
      return this.wasUnderwater;
   }

   protected void doWaterSplashEffect() {
   }

   public float getViewXRot(float var1) {
      return this.getXRot();
   }

   public float getViewYRot(float var1) {
      return this.getYRot();
   }
}
