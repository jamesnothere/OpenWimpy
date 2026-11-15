package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
import com.wimpyclient.bridge.FreelookCameraAccess;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.CameraType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class r {
   public static final r INSTANCE = new r();
   private boolean active;
   private float yaw;
   private float pitch;
   private CameraType rememberedCameraType;
   private boolean rememberedSmartCull = true;
   private boolean smartCullOverride;

   private r() {
   }

   public boolean isActive() {
      return this.active && x.INSTANCE.freelook.qo();
   }

   public float yaw() {
      return this.yaw;
   }

   public float pitch() {
      return this.pitch;
   }

   public float distance() {
      return Math.max(1.0F, (float)x.INSTANCE.freelookDistance);
   }

   public void tick(Minecraft var1) {
      if (!LicenseGate.isAuthorized()) {
         if (this.active) {
            this.disable(var1);
         }
      } else {
         v var2 = x.INSTANCE.freelook;
         LocalPlayer var3 = var1.player;
         if (var2.qo() && var3 != null && var1.level != null && !var3.isDeadOrDying()) {
            if (!this.active) {
               if (x.INSTANCE.freecam.qo() || q.INSTANCE.isActive()) {
                  x.INSTANCE.freecam.qq(false);
                  q.INSTANCE.reset();
               }

               this.enable(var1, var3);
            }

            var1.options.setCameraType(CameraType.THIRD_PERSON_BACK);
            var1.smartCull = false;
         } else {
            if (this.active) {
               this.disable(var1);
            }
         }
      }
   }

   public boolean handleTurn(double var1, double var3) {
      if (!this.isActive()) {
         return false;
      } else {
         this.yaw += (float)var1 * 0.15F;
         this.pitch = Mth.clamp(this.pitch + (float)var3 * 0.15F, -90.0F, 90.0F);
         return true;
      }
   }

   public void applyToCamera(Camera var1, LocalPlayer var2, float var3) {
      Vec3 var4 = var2.getEyePosition(var3);
      setCameraRotation(var1, this.yaw, this.pitch);
      setCameraPosition(var1, var4.x, var4.y, var4.z);
      moveCamera(var1, -this.distance());
   }

   public void reset() {
      Minecraft var1 = Minecraft.getInstance();
      if (this.active) {
         this.disable(var1);
      }
   }

   public void onDisconnect(Minecraft var1) {
      if (this.active) {
         this.disable(var1);
      }

      x.INSTANCE.freelook.qq(false);
   }

   private void enable(Minecraft var1, LocalPlayer var2) {
      this.yaw = var2.getYRot();
      this.pitch = var2.getXRot();
      this.rememberedCameraType = var1.options.getCameraType();
      this.rememberedSmartCull = var1.smartCull;
      var1.smartCull = false;
      this.smartCullOverride = true;
      var1.options.setCameraType(CameraType.THIRD_PERSON_BACK);
      this.active = true;
   }

   private void disable(Minecraft var1) {
      if (this.smartCullOverride) {
         var1.smartCull = this.rememberedSmartCull;
         this.smartCullOverride = false;
      }

      if (this.rememberedCameraType != null) {
         var1.options.setCameraType(this.rememberedCameraType);
         this.rememberedCameraType = null;
      }

      this.active = false;
   }

   private static void setCameraRotation(Camera var0, float var1, float var2) {
      ((FreelookCameraAccess)var0).wimpyclient$setRotation(var1, var2);
   }

   private static void setCameraPosition(Camera var0, double var1, double var3, double var5) {
      ((FreelookCameraAccess)var0).wimpyclient$setPosition(var1, var3, var5);
   }

   private static void moveCamera(Camera var0, float var1) {
      ((FreelookCameraAccess)var0).wimpyclient$move(var1);
   }
}
