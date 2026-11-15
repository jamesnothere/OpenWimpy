package com.wimpyclient.f;

import com.wimpyclient.i.q;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;

@Environment(EnvType.CLIENT)
public final class f {
   public static final f INSTANCE = new f();
   private static final double RTP_MIN_DISTANCE = 64.0;
   private static final double RTP_MIN_DISTANCE_SQR = 4096.0;
   private static final int COOLDOWN_TICKS = 20;
   private boolean hasSample;
   private double lastX;
   private double lastZ;
   private ResourceKey<Level> lastDimension;
   private int cooldown;
   private double packetBeforeX;
   private double packetBeforeZ;
   private boolean packetBeforeValid;

   private f() {
   }

   public void captureBeforePositionPacket() {
      Minecraft var1 = Minecraft.getInstance();
      LocalPlayer var2 = var1.player;
      if (var2 == null) {
         this.packetBeforeValid = false;
      } else {
         this.packetBeforeX = var2.getX();
         this.packetBeforeZ = var2.getZ();
         this.packetBeforeValid = true;
      }
   }

   public void onAfterPositionPacket() {
      Minecraft var1 = Minecraft.getInstance();
      LocalPlayer var2 = var1.player;
      if (var2 != null && var1.level != null && this.packetBeforeValid) {
         this.packetBeforeValid = false;
         if (q.INSTANCE.isActive()) {
            this.syncSample(var2);
         } else {
            double var3 = var2.getX();
            double var5 = var2.getZ();
            double var7 = var3 - this.packetBeforeX;
            double var9 = var5 - this.packetBeforeZ;
            if (var7 * var7 + var9 * var9 < 4096.0) {
               this.syncSample(var2);
            } else {
               com.wimpyclient.p.b.onPlayerTeleported();
               this.maybeRecordLanding(var1, var2, var3, var5);
            }
         }
      } else {
         this.packetBeforeValid = false;
      }
   }

   public void tick(Minecraft var1) {
      LocalPlayer var2 = var1.player;
      if (var2 != null && var1.level != null) {
         if (this.cooldown > 0) {
            this.cooldown--;
         }

         if (q.INSTANCE.isActive()) {
            this.syncSample(var2);
         } else {
            ResourceKey var3 = var1.level.dimension();
            double var4 = var2.getX();
            double var6 = var2.getZ();
            if (this.hasSample && this.lastDimension != null && this.lastDimension.equals(var3)) {
               double var8 = var4 - this.lastX;
               double var10 = var6 - this.lastZ;
               double var12 = var8 * var8 + var10 * var10;
               this.lastX = var4;
               this.lastZ = var6;
               if (this.cooldown <= 0 && !(var12 < 4096.0)) {
                  com.wimpyclient.p.b.onPlayerTeleported();
                  this.maybeRecordLanding(var1, var2, var4, var6);
               }
            } else {
               this.hasSample = true;
               this.lastX = var4;
               this.lastZ = var6;
               this.lastDimension = var3;
            }
         }
      } else {
         this.hasSample = false;
         this.cooldown = 0;
      }
   }

   private void maybeRecordLanding(Minecraft var1, LocalPlayer var2, double var3, double var5) {
      if (this.cooldown > 0) {
         this.syncSample(var2);
      } else {
         ResourceKey var7 = var1.level.dimension();
         if (!Level.NETHER.equals(var7) && !Level.END.equals(var7)) {
            boolean var8 = com.wimpyclient.e.f.INSTANCE.recordLanding(var3, var5);
            this.cooldown = 20;
            this.syncSample(var2);
            if (var8) {
               com.wimpyclient.d.a.save();
            }
         } else {
            this.syncSample(var2);
         }
      }
   }

   private void syncSample(LocalPlayer var1) {
      this.hasSample = true;
      this.lastX = var1.getX();
      this.lastZ = var1.getZ();
      if (var1.level() != null) {
         this.lastDimension = var1.level().dimension();
      }
   }
}
