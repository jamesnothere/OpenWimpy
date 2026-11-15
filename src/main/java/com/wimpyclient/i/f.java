package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class f {
   public static final f INSTANCE = new f();
   private static final int TRIGGER_Y = -3;
   private static final double LEAVE_DIST = 6.0;
   private static final double LEAVE_DIST_SQ = 36.0;
   private static final double RETURN_DIST = 5.0;
   private static final double RETURN_DIST_SQ = 25.0;
   private static final double PACKET_JUMP_MIN = 3.0;
   private static final double PACKET_JUMP_MIN_SQ = 9.0;
   private static final int TELEPORT_TIMEOUT_TICKS = 200;
   private static final int TELEPORT_SETTLE_TICKS = 10;
   private static final int STAND_STILL_TICKS = 12;
   private static final int SET_CONFIRM_TICKS = 30;
   private static final int DEL_DELAY_TICKS = 40;
   private static final int DEL_RETRY_TICKS = 40;
   private static final int MAX_TELEPORT_RETRIES = 3;
   private static final int MAX_PENDING_DELETE_TRIES = 8;
   private static final int PENDING_DELETE_GAP_TICKS = 40;
   private static final int COMMAND_ARM_GRACE_TICKS = 2;
   private f$a phase = f$a.WAIT_AT_Y;
   private int ticksInPhase;
   private int settleTicks;
   private double tempHomeX;
   private double tempHomeY;
   private double tempHomeZ;
   private boolean hasTempHomePos;
   private double commandX;
   private double commandY;
   private double commandZ;
   private boolean wasEnabled;
   private boolean packetHopSeen;
   private String pendingTempHome;
   private String lockedTemp = "3";
   private String lockedHome1 = "1";
   private String lockedSetCmd = "sethome";
   private String lockedHomeCmd = "home";
   private String lockedDelCmd = "delhome";
   private int lockedSetDelay = 60;
   private int commandRetries;
   private int lastOverlayBucket = -1;
   private int stillTicks;
   private int delSends;
   private int pendingDeleteTries;
   private int pendingDeleteCooldown;
   private boolean flushOnJoin;
   private int armGraceTicks;
   private int leaveRedoAttempts;

   private f() {
   }

   public void tick(Minecraft var1) {
      if (!LicenseGate.isAuthorized()) {
         if (this.wasEnabled || this.pendingTempHome != null) {
            this.retryPendingDelete(var1.player, true);
            if (this.wasEnabled) {
               this.resetPhase();
            }
         }

         this.wasEnabled = false;
      } else {
         x var2 = x.INSTANCE;
         boolean var3 = var2.autoRelog.qo();
         if (!var3) {
            if (this.wasEnabled) {
               this.resetPhase();
               this.wasEnabled = false;
            }

            this.retryPendingDelete(var1.player, true);
         } else {
            if (!this.wasEnabled) {
               this.resetPhase();
               this.wasEnabled = true;
               this.phase = f$a.WAIT_AT_Y;
            }

            LocalPlayer var4 = var1.player;
            if (var4 != null && var1.level != null && var1.getConnection() != null) {
               if (this.flushOnJoin) {
                  this.retryPendingDelete(var4, false);
                  if (this.pendingTempHome == null || this.pendingDeleteTries >= 8) {
                     this.flushOnJoin = false;
                  }
               } else {
                  this.ticksInPhase++;
                  if (this.armGraceTicks > 0) {
                     this.armGraceTicks--;
                  }

                  switch (this.phase) {
                     case WAIT_AT_Y:
                        if (isAtTriggerY(var4)) {
                           this.phase = f$a.SETTLE;
                           this.ticksInPhase = 0;
                           this.stillTicks = 0;
                           this.lastOverlayBucket = -1;
                        } else {
                           int var10 = this.ticksInPhase / 40;
                           if (var10 != this.lastOverlayBucket) {
                              this.lastOverlayBucket = var10;
                              var4.displayClientMessage(Component.literal("AutoRelog: waiting for Y\u2264-3 (now " + Mth.floor(var4.getY()) + ")"), true);
                           }
                        }
                        break;
                     case SETTLE:
                        if (!isAtTriggerY(var4)) {
                           this.phase = f$a.WAIT_AT_Y;
                           this.ticksInPhase = 0;
                           this.stillTicks = 0;
                           this.lastOverlayBucket = -1;
                        } else {
                           boolean var9 = com.wimpyclient.p.o.isActive();
                           boolean var6 = var4.onGround() || var4.isInWater();
                           boolean var7 = isStandingStill(var4);
                           if (var9 || !var6 || !var7) {
                              this.stillTicks = 0;
                              int var8 = this.ticksInPhase / 10;
                              if (var8 != this.lastOverlayBucket) {
                                 this.lastOverlayBucket = var8;
                                 var4.displayClientMessage(
                                    Component.literal(var9 ? "AutoRelog: waiting for dig to finish\u2026" : "AutoRelog: waiting to stand still\u2026"), true
                                 );
                              }
                           } else if (this.stillTicks < 12) {
                              this.stillTicks++;
                           } else {
                              this.lockCommands(var2);
                              this.phase = f$a.SET_HOME;
                              this.ticksInPhase = 0;
                              this.lastOverlayBucket = -1;
                           }
                        }
                        break;
                     case SET_HOME:
                        var4.displayClientMessage(Component.literal("AutoRelog: setting home " + this.lockedTemp + "\u2026"), true);
                        if (!this.markTempHome(var4)) {
                           this.abort(var4, "AutoRelog: failed to send /" + this.lockedSetCmd + " " + this.lockedTemp);
                        } else {
                           this.phase = f$a.WAIT_SET_CONFIRM;
                           this.ticksInPhase = 0;
                        }
                        break;
                     case WAIT_SET_CONFIRM:
                        if (this.ticksInPhase >= 30) {
                           this.phase = f$a.SET_HOME_AGAIN;
                           this.ticksInPhase = 0;
                        }
                        break;
                     case SET_HOME_AGAIN:
                        var4.displayClientMessage(Component.literal("AutoRelog: confirming home " + this.lockedTemp + "\u2026"), true);
                        this.markTempHome(var4);
                        this.phase = f$a.WAIT_AFTER_SET;
                        this.ticksInPhase = 0;
                        break;
                     case WAIT_AFTER_SET:
                        if (this.ticksInPhase >= this.lockedSetDelay) {
                           this.phase = f$a.TP_HOME1;
                           this.ticksInPhase = 0;
                           this.commandRetries = 0;
                           this.leaveRedoAttempts = 0;
                        }
                        break;
                     case TP_HOME1:
                        this.armTeleportWait(var4);
                        var4.displayClientMessage(Component.literal("AutoRelog: /" + this.lockedHomeCmd + " " + this.lockedHome1), true);
                        if (!com.wimpyclient.p.d.send(var4, this.lockedHomeCmd, this.lockedHome1)) {
                           this.abort(var4, "AutoRelog: failed to send /" + this.lockedHomeCmd + " " + this.lockedHome1);
                        } else {
                           this.phase = f$a.WAIT_TP1;
                           this.ticksInPhase = 0;
                        }
                        break;
                     case WAIT_TP1:
                        this.overlayTeleportWait(var4, this.lockedHome1, f$b.LEAVE);
                        if (this.waitTeleport(var4, f$b.LEAVE)) {
                           var4.displayClientMessage(Component.literal("AutoRelog: arrived at home " + this.lockedHome1), true);
                           this.phase = f$a.TP_BACK;
                           this.ticksInPhase = 0;
                           this.commandRetries = 0;
                        } else if (this.ticksInPhase >= 200
                           && !this.retryHome(
                              var4,
                              this.lockedHome1,
                              "AutoRelog: retrying /" + this.lockedHomeCmd + " " + this.lockedHome1 + " (" + this.commandRetries + "/3)"
                           )) {
                           this.abort(var4, "AutoRelog: never reached home " + this.lockedHome1);
                        }
                        break;
                     case TP_BACK:
                        if (this.hasTempHomePos && distSq(var4, this.tempHomeX, this.tempHomeY, this.tempHomeZ) < 36.0) {
                           this.leaveRedoAttempts++;
                           if (this.leaveRedoAttempts > 3) {
                              this.abort(var4, "AutoRelog: still at dig after leaving \u2014 home " + this.lockedHome1 + " failed");
                           } else {
                              var4.displayClientMessage(
                                 Component.literal(
                                    "AutoRelog: still at dig \u2014 redo /"
                                       + this.lockedHomeCmd
                                       + " "
                                       + this.lockedHome1
                                       + " ("
                                       + this.leaveRedoAttempts
                                       + "/3)"
                                 ),
                                 true
                              );
                              this.phase = f$a.TP_HOME1;
                              this.ticksInPhase = 0;
                              this.commandRetries = 0;
                           }
                        } else {
                           this.armTeleportWait(var4);
                           var4.displayClientMessage(Component.literal("AutoRelog: /" + this.lockedHomeCmd + " " + this.lockedTemp), true);
                           if (!com.wimpyclient.p.d.send(var4, this.lockedHomeCmd, this.lockedTemp)) {
                              this.abort(var4, "AutoRelog: failed to send /" + this.lockedHomeCmd + " " + this.lockedTemp);
                           } else {
                              this.phase = f$a.WAIT_TP_BACK;
                              this.ticksInPhase = 0;
                           }
                        }
                        break;
                     case WAIT_TP_BACK:
                        this.overlayTeleportWait(var4, this.lockedTemp, f$b.RETURN);
                        if (this.waitTeleport(var4, f$b.RETURN)) {
                           var4.displayClientMessage(Component.literal("AutoRelog: back at home " + this.lockedTemp), true);
                           this.phase = f$a.WAIT_BEFORE_DEL;
                           this.ticksInPhase = 0;
                           this.delSends = 0;
                        } else if (this.ticksInPhase >= 200
                           && !this.retryHome(
                              var4, this.lockedTemp, "AutoRelog: retrying /" + this.lockedHomeCmd + " " + this.lockedTemp + " (" + this.commandRetries + "/3)"
                           )) {
                           this.abort(var4, "AutoRelog: never returned to home " + this.lockedTemp);
                        }
                        break;
                     case WAIT_BEFORE_DEL:
                        if (this.ticksInPhase >= 40) {
                           this.phase = f$a.DEL_HOME;
                           this.ticksInPhase = 0;
                        }
                        break;
                     case DEL_HOME:
                        String var5 = this.deleteTarget();
                        var4.displayClientMessage(Component.literal("AutoRelog: /" + this.lockedDelCmd + " " + var5), true);
                        if (this.sendDelHome(var4, var5)) {
                           this.delSends++;
                        }

                        this.phase = f$a.WAIT_DEL_RETRY;
                        this.ticksInPhase = 0;
                        break;
                     case WAIT_DEL_RETRY:
                        if (this.ticksInPhase >= 40) {
                           if (this.sendDelHome(var4, this.deleteTarget())) {
                              this.delSends++;
                           }

                           this.phase = f$a.WAIT_AFTER_DEL;
                           this.ticksInPhase = 0;
                        }
                        break;
                     case WAIT_AFTER_DEL:
                        if (this.ticksInPhase >= 40) {
                           if (this.delSends <= 0) {
                              if (this.sendDelHome(var4, this.deleteTarget())) {
                                 this.delSends++;
                                 this.ticksInPhase = 0;
                              } else {
                                 this.abort(var4, "AutoRelog: failed to send /" + this.lockedDelCmd + " " + this.deleteTarget());
                              }
                           } else {
                              this.clearPendingHome();
                              this.phase = f$a.DONE;
                              this.ticksInPhase = 0;
                           }
                        }
                        break;
                     case DONE:
                        var4.displayClientMessage(Component.literal("[AutoRelog] Fly up now"), false);
                        var4.displayClientMessage(Component.literal("Fly up now"), true);
                        var2.autoRelog.qp(false);
                        this.resetPhase();
                        this.wasEnabled = false;
                  }
               }
            }
         }
      }
   }

   public void onPlayerPositionPacket(double var1, double var3, double var5) {
      if (this.phase == f$a.WAIT_TP1 || this.phase == f$a.WAIT_TP_BACK) {
         if (this.armGraceTicks <= 0) {
            Minecraft var7 = Minecraft.getInstance();
            LocalPlayer var8 = var7.player;
            if (var8 != null) {
               if (!(distSq(var8, var1, var3, var5) < 9.0)) {
                  this.packetHopSeen = true;
               }
            }
         }
      }
   }

   @Deprecated
   public void onPlayerPositionPacket() {
   }

   public void onDisconnect(Minecraft var1) {
      this.flushOnJoin = this.pendingTempHome != null;
      this.resetPhase();
      this.wasEnabled = false;
   }

   static boolean isAtTriggerY(LocalPlayer var0) {
      return var0.getY() <= -2.0;
   }

   private void lockCommands(x var1) {
      this.lockedTemp = com.wimpyclient.p.d.argument(var1.autoRelogTempHome, "3");
      this.lockedHome1 = com.wimpyclient.p.d.argument(var1.autoRelogHome1, "1");
      this.lockedSetCmd = com.wimpyclient.p.d.withoutSlash(var1.autoRelogSetCommand, "sethome");
      this.lockedHomeCmd = com.wimpyclient.p.d.withoutSlash(var1.autoRelogHomeCommand, "home");
      this.lockedDelCmd = com.wimpyclient.p.d.withoutSlash(var1.autoRelogDelCommand, "delhome");
      this.lockedSetDelay = Math.max(20, Math.min(200, var1.autoRelogSetDelayTicks));
   }

   private String deleteTarget() {
      return this.pendingTempHome != null && !this.pendingTempHome.isEmpty() ? this.pendingTempHome : this.lockedTemp;
   }

   private static boolean isStandingStill(LocalPlayer var0) {
      Vec3 var1 = var0.getDeltaMovement();
      return var1.horizontalDistanceSqr() < 0.0025 && Math.abs(var1.y) < 0.08;
   }

   private void overlayTeleportWait(LocalPlayer var1, String var2, f$b var3) {
      int var4 = this.ticksInPhase / 20;
      if (var4 != this.lastOverlayBucket) {
         this.lastOverlayBucket = var4;
         boolean var5 = this.matchesGoal(var1, var3);
         double var6 = this.hasTempHomePos ? Math.sqrt(distSq(var1, this.tempHomeX, this.tempHomeY, this.tempHomeZ)) : -1.0;
         var1.displayClientMessage(
            Component.literal(
               "AutoRelog: waiting /"
                  + this.lockedHomeCmd
                  + " "
                  + var2
                  + (var5 ? " \u2713" : " \u2026")
                  + (var6 >= 0.0 ? String.format(" dig=%.0fm", var6) : "")
                  + " ("
                  + this.ticksInPhase / 20
                  + "s)"
            ),
            true
         );
      }
   }

   private boolean retryHome(LocalPlayer var1, String var2, String var3) {
      if (this.commandRetries >= 3) {
         return false;
      } else {
         this.commandRetries++;
         this.armTeleportWait(var1);
         var1.displayClientMessage(Component.literal(var3), true);
         com.wimpyclient.p.d.send(var1, this.lockedHomeCmd, var2);
         this.ticksInPhase = 0;
         this.settleTicks = 0;
         this.lastOverlayBucket = -1;
         return true;
      }
   }

   private void armTeleportWait(LocalPlayer var1) {
      this.commandX = var1.getX();
      this.commandY = var1.getY();
      this.commandZ = var1.getZ();
      this.packetHopSeen = false;
      this.settleTicks = 0;
      this.lastOverlayBucket = -1;
      this.armGraceTicks = 2;
   }

   private boolean waitTeleport(LocalPlayer var1, f$b var2) {
      if (!this.matchesGoal(var1, var2)) {
         this.settleTicks = 0;
         return false;
      } else if (!this.packetHopSeen && !this.movedFromCommand(var1)) {
         this.settleTicks = 0;
         return false;
      } else {
         this.settleTicks++;
         int var3 = this.packetHopSeen ? Math.max(4, 5) : 10;
         return this.settleTicks >= var3;
      }
   }

   private boolean movedFromCommand(LocalPlayer var1) {
      return distSq(var1, this.commandX, this.commandY, this.commandZ) >= 36.0;
   }

   private boolean matchesGoal(LocalPlayer var1, f$b var2) {
      return var2 == f$b.LEAVE ? this.leftTempHome(var1) : this.returnedToTempHome(var1);
   }

   private boolean leftTempHome(LocalPlayer var1) {
      return !this.hasTempHomePos ? this.movedFromCommand(var1) : distSq(var1, this.tempHomeX, this.tempHomeY, this.tempHomeZ) >= 36.0;
   }

   private boolean returnedToTempHome(LocalPlayer var1) {
      return !this.hasTempHomePos ? false : distSq(var1, this.tempHomeX, this.tempHomeY, this.tempHomeZ) <= 25.0;
   }

   private static double distSq(LocalPlayer var0, double var1, double var3, double var5) {
      double var7 = var0.getX() - var1;
      double var9 = var0.getY() - var3;
      double var11 = var0.getZ() - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   private boolean markTempHome(LocalPlayer var1) {
      if (!com.wimpyclient.p.d.send(var1, this.lockedSetCmd, this.lockedTemp)) {
         return false;
      } else {
         this.pendingTempHome = this.lockedTemp;
         this.tempHomeX = var1.getX();
         this.tempHomeY = var1.getY();
         this.tempHomeZ = var1.getZ();
         this.hasTempHomePos = true;
         this.pendingDeleteTries = 0;
         this.pendingDeleteCooldown = 0;
         return true;
      }
   }

   private boolean sendDelHome(LocalPlayer var1, String var2) {
      return com.wimpyclient.p.d.send(var1, this.lockedDelCmd, var2);
   }

   private void retryPendingDelete(LocalPlayer var1, boolean var2) {
      if (this.pendingTempHome != null) {
         if (this.pendingDeleteCooldown > 0) {
            this.pendingDeleteCooldown--;
         } else if (this.pendingDeleteTries < 8) {
            if (var1 != null) {
               String var3 = this.pendingTempHome;
               String var4 = this.lockedDelCmd;
               if (var4 == null || var4.isEmpty()) {
                  var4 = com.wimpyclient.p.d.withoutSlash(x.INSTANCE.autoRelogDelCommand, "delhome");
               }

               this.pendingDeleteTries++;
               this.pendingDeleteCooldown = 40;
               if (com.wimpyclient.p.d.send(var1, var4, var3)) {
                  if (var2) {
                     var1.displayClientMessage(Component.literal("[AutoRelog] /" + var4 + " " + var3), false);
                  }

                  if (this.pendingDeleteTries >= 2) {
                     this.clearPendingHome();
                  }
               }
            }
         }
      }
   }

   private void clearPendingHome() {
      this.pendingTempHome = null;
      this.hasTempHomePos = false;
      this.delSends = 0;
      this.pendingDeleteTries = 0;
      this.pendingDeleteCooldown = 0;
      this.flushOnJoin = false;
   }

   private void abort(LocalPlayer var1, String var2) {
      this.retryPendingDelete(var1, false);
      if (var1 != null) {
         var1.displayClientMessage(Component.literal("[" + var2 + "]"), false);
         var1.displayClientMessage(Component.literal("AutoRelog failed"), true);
      }

      x.INSTANCE.autoRelog.qp(false);
      this.resetPhase();
      this.wasEnabled = false;
   }

   private void resetPhase() {
      this.phase = f$a.WAIT_AT_Y;
      this.ticksInPhase = 0;
      this.settleTicks = 0;
      this.packetHopSeen = false;
      this.commandRetries = 0;
      this.leaveRedoAttempts = 0;
      this.lastOverlayBucket = -1;
      this.stillTicks = 0;
      this.delSends = 0;
      this.armGraceTicks = 0;
   }
}
