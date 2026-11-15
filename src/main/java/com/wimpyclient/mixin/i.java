package com.wimpyclient.mixin;

import com.wimpyclient.bridge.BridgeGate;
import java.util.ArrayList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.protocol.game.ClientboundBlockEventPacket;
import net.minecraft.network.protocol.game.ClientboundCommandSuggestionsPacket;
import net.minecraft.network.protocol.game.ClientboundDamageEventPacket;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.network.protocol.game.ClientboundExplodePacket;
import net.minecraft.network.protocol.game.ClientboundLevelChunkWithLightPacket;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import net.minecraft.network.protocol.game.ClientboundLightUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData;
import net.minecraft.network.protocol.game.ClientboundPlayerInfoRemovePacket;
import net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ClientboundSetPassengersPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket.Action;
import net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket.Entry;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({ClientPacketListener.class})
public class i {
   @Unique
   private double wimpyclient$posBeforeX;
   @Unique
   private double wimpyclient$posBeforeY;
   @Unique
   private double wimpyclient$posBeforeZ;
   @Unique
   private boolean wimpyclient$posBeforeValid;
   private static final String ENSURE_MAIN_THREAD = "Lnet/minecraft/network/protocol/PacketUtils;ensureRunningOnSameThread(Lnet/minecraft/network/protocol/Packet;Lnet/minecraft/network/PacketListener;Lnet/minecraft/network/PacketProcessor;)V";

   public i() {
   }

   @Inject(
      method = {"sendChat(Ljava/lang/String;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$licenseChatCommand(String var1, CallbackInfo var2) {
      if (BridgeGate.keyChat(var1)) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"sendCommand(Ljava/lang/String;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$fakeBalanceCommand(String var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         try {
            if (com.wimpyclient.i.o.tryInterceptBalance(var1)) {
               var2.cancel();
            }
         } catch (Exception var4) {
         }
      }
   }

   @Inject(
      method = {"handleMovePlayer(Lnet/minecraft/network/protocol/game/ClientboundPlayerPositionPacket;)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$rtpBeforeTeleport(ClientboundPlayerPositionPacket var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         com.wimpyclient.f.f.INSTANCE.captureBeforePositionPacket();
         Minecraft var3 = Minecraft.getInstance();
         LocalPlayer var4 = var3.player;
         if (var4 != null) {
            this.wimpyclient$posBeforeX = var4.getX();
            this.wimpyclient$posBeforeY = var4.getY();
            this.wimpyclient$posBeforeZ = var4.getZ();
            this.wimpyclient$posBeforeValid = true;
         } else {
            this.wimpyclient$posBeforeValid = false;
         }
      }
   }

   @Inject(
      method = {"handleMovePlayer(Lnet/minecraft/network/protocol/game/ClientboundPlayerPositionPacket;)V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$rtpAfterTeleport(ClientboundPlayerPositionPacket var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         com.wimpyclient.f.f.INSTANCE.onAfterPositionPacket();
         if (this.wimpyclient$posBeforeValid) {
            com.wimpyclient.i.f.INSTANCE.onPlayerPositionPacket(this.wimpyclient$posBeforeX, this.wimpyclient$posBeforeY, this.wimpyclient$posBeforeZ);
            this.wimpyclient$posBeforeValid = false;
         }
      }
   }

   @Inject(
      method = {"handleBlockEvent(Lnet/minecraft/network/protocol/game/ClientboundBlockEventPacket;)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$onBlockEvent(ClientboundBlockEventPacket var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         com.wimpyclient.f.a.INSTANCE.onBlockEvent(var1.getPos(), var1.getBlock(), var1.getB0());
      }
   }

   @Inject(
      method = {"handlePlayerInfoRemove(Lnet/minecraft/network/protocol/game/ClientboundPlayerInfoRemovePacket;)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$antiVanishRemove(ClientboundPlayerInfoRemovePacket var1, CallbackInfo var2) {
      if (BridgeGate.ready() && var1 != null) {
         com.wimpyclient.i.af.INSTANCE.onPlayerInfoRemove(var1.profileIds());
      }
   }

   @Inject(
      method = {"handlePlayerInfoUpdate(Lnet/minecraft/network/protocol/game/ClientboundPlayerInfoUpdatePacket;)V"},
      at = {@At("HEAD")}
   )
   private void wimpyclient$antiVanishUpdate(ClientboundPlayerInfoUpdatePacket var1, CallbackInfo var2) {
      if (BridgeGate.ready() && var1 != null) {
         if (var1.actions().contains(Action.UPDATE_LISTED)) {
            ArrayList var3 = new ArrayList();

            for (Entry var5 : var1.entries()) {
               if (var5 != null && !var5.listed()) {
                  var3.add(var5.profileId());
               }
            }

            if (!var3.isEmpty()) {
               com.wimpyclient.i.af.INSTANCE.onPlayerInfoUnlisted(var3);
            }
         }
      }
   }

   @Inject(
      method = {"handleCommandSuggestions(Lnet/minecraft/network/protocol/game/ClientboundCommandSuggestionsPacket;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wimpyclient$antiVanishSuggestions(ClientboundCommandSuggestionsPacket var1, CallbackInfo var2) {
      if (BridgeGate.ready() && var1 != null) {
         ArrayList var3 = new ArrayList();

         for (net.minecraft.network.protocol.game.ClientboundCommandSuggestionsPacket.Entry var5 : var1.suggestions()) {
            if (var5 != null && var5.text() != null && !var5.text().isBlank()) {
               var3.add(var5.text().trim());
            }
         }

         if (com.wimpyclient.i.af.INSTANCE.onCommandSuggestions(var1.id(), var3)) {
            var2.cancel();
         }
      }
   }

   @Inject(
      method = {"handleDamageEvent(Lnet/minecraft/network/protocol/game/ClientboundDamageEventPacket;)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$onDamageEvent(ClientboundDamageEventPacket var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         ClientLevel var3 = Minecraft.getInstance().level;
         if (var3 != null) {
            com.wimpyclient.f.a.INSTANCE.onEntityDamaged(var3, var1.entityId(), var1.sourceCauseId(), var1.sourceDirectId());
         }
      }
   }

   @Inject(
      method = {"handleSetEntityPassengersPacket(Lnet/minecraft/network/protocol/game/ClientboundSetPassengersPacket;)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$onPassengers(ClientboundSetPassengersPacket var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         ClientLevel var3 = Minecraft.getInstance().level;
         if (var3 != null) {
            com.wimpyclient.f.a.INSTANCE.onPassengersUpdate(var3, var1.getVehicle(), var1.getPassengers());
         }
      }
   }

   @Inject(
      method = {"handleEntityEvent(Lnet/minecraft/network/protocol/game/ClientboundEntityEventPacket;)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$onTotemPop(ClientboundEntityEventPacket var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         if (var1.getEventId() == 35) {
            Minecraft var3 = Minecraft.getInstance();
            if (var3.level != null && var3.player != null) {
               Entity var4 = var1.getEntity(var3.level);
               if (var4 != null && var4.getId() == var3.player.getId()) {
                  com.wimpyclient.i.e.INSTANCE.onLocalTotemPop();
               }
            }
         }
      }
   }

   @Inject(
      method = {"handleLevelChunkWithLight(Lnet/minecraft/network/protocol/game/ClientboundLevelChunkWithLightPacket;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/protocol/PacketUtils;ensureRunningOnSameThread(Lnet/minecraft/network/protocol/Packet;Lnet/minecraft/network/PacketListener;Lnet/minecraft/network/PacketProcessor;)V",
         shift = Shift.AFTER
      )}
   )
   private void wimpyclient$ingestChunkBlockLight(ClientboundLevelChunkWithLightPacket var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         ClientLevel var3 = Minecraft.getInstance().level;
         if (var3 != null) {
            com.wimpyclient.f.a.INSTANCE.ingestBlockLightPacket(var1.getX(), var1.getZ(), var1.getLightData(), var3, true);
         }
      }
   }

   @Inject(
      method = {"handleLevelChunkWithLight(Lnet/minecraft/network/protocol/game/ClientboundLevelChunkWithLightPacket;)V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$chunkArrived(ClientboundLevelChunkWithLightPacket var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         com.wimpyclient.f.a.INSTANCE.onChunkArrived(var1.getX(), var1.getZ());
         ClientLevel var3 = Minecraft.getInstance().level;
         if (var3 != null) {
            com.wimpyclient.f.h.INSTANCE.onChunkWithLight(var1, var3);
         }
      }
   }

   @Inject(
      method = {"handleLightUpdatePacket(Lnet/minecraft/network/protocol/game/ClientboundLightUpdatePacket;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/protocol/PacketUtils;ensureRunningOnSameThread(Lnet/minecraft/network/protocol/Packet;Lnet/minecraft/network/PacketListener;Lnet/minecraft/network/PacketProcessor;)V",
         shift = Shift.AFTER
      )}
   )
   private void wimpyclient$ingestLightUpdate(ClientboundLightUpdatePacket var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         ClientLevel var3 = Minecraft.getInstance().level;
         if (var3 != null) {
            com.wimpyclient.f.a.INSTANCE.ingestBlockLightPacket(var1.getX(), var1.getZ(), var1.getLightData(), var3, false);
            com.wimpyclient.f.h.INSTANCE.onLightUpdate(var1, var3);
         }
      }
   }

   @Inject(
      method = {"applyLightData(IILnet/minecraft/network/protocol/game/ClientboundLightUpdatePacketData;Z)V"},
      at = {@At("RETURN")}
   )
   private void wimpyclient$snapshotAppliedBlockLight(int var1, int var2, ClientboundLightUpdatePacketData var3, boolean var4, CallbackInfo var5) {
      if (BridgeGate.ready()) {
         ClientLevel var6 = Minecraft.getInstance().level;
         if (var6 != null) {
            com.wimpyclient.f.a.INSTANCE.snapshotAppliedBlockLight(var1, var2, var6);
         }
      }
   }

   @Inject(
      method = {"handleAddEntity(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$yHideAddEntity(ClientboundAddEntityPacket var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         com.wimpyclient.f.h.INSTANCE.onAddEntity(var1);
      }
   }

   @Inject(
      method = {"handleParticleEvent(Lnet/minecraft/network/protocol/game/ClientboundLevelParticlesPacket;)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$yHideParticle(ClientboundLevelParticlesPacket var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         com.wimpyclient.f.h.INSTANCE.onParticle(var1);
      }
   }

   @Inject(
      method = {"handleExplosion(Lnet/minecraft/network/protocol/game/ClientboundExplodePacket;)V"},
      at = {@At("TAIL")}
   )
   private void wimpyclient$yHideExplosion(ClientboundExplodePacket var1, CallbackInfo var2) {
      if (BridgeGate.ready()) {
         com.wimpyclient.f.h.INSTANCE.onExplosion(var1);
      }
   }
}
