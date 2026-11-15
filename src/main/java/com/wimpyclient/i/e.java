package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

@Environment(EnvType.CLIENT)
public final class e {
   public static final e INSTANCE = new e();
   private int tickCounter;
   private int pendingHotbarSlot = -1;

   private e() {
   }

   public void onDeathScreen() {
      this.tickCounter = 0;
      this.pendingHotbarSlot = -1;
   }

   public void onLocalTotemPop() {
   }

   public void tick(Minecraft var1) {
      if (!LicenseGate.isAuthorized()) {
         this.tickCounter = 0;
         this.pendingHotbarSlot = -1;
      } else {
         x var2 = x.INSTANCE;
         if (!var2.autoInvTotem.qo()) {
            this.tickCounter = 0;
            this.pendingHotbarSlot = -1;
         } else if (var1.player != null && var1.gameMode != null) {
            if (canRun(var1)) {
               this.tickCounter++;
               int var3 = var2.autoTotemHotbarTotem && needsHotbarWork(var1, var2) && !needsOffhandWork(var1, var2)
                  ? var2.autoTotemHotbarDelay
                  : var2.autoTotemDelay;
               if (this.tickCounter >= Math.max(1, var3)) {
                  this.tickCounter = 0;
                  LocalPlayer var4 = var1.player;
                  int var5 = Math.max(0, Math.min(8, var2.autoTotemHotbarSlot - 1));
                  if (var2.autoTotemHotbarTotem && needsHotbarWork(var1, var2)) {
                     if (var4.getInventory().getItem(var5).is(Items.TOTEM_OF_UNDYING)) {
                        selectHotbarSlot(var1, var5);
                     } else {
                        int var9 = findTotemInMainInventory(var4);
                        if (var9 != -1 && canContainerClick(var1)) {
                           swapInventoryToHotbar(var1, var9, var5);
                        }
                     }
                  } else if (!needsOffhandWork(var1, var2)) {
                     this.pendingHotbarSlot = -1;
                  } else if (!var4.getOffhandItem().is(Items.TOTEM_OF_UNDYING) || var2.autoTotemForce) {
                     int var6 = findTotemInHotbar(var4);
                     if (var6 != -1) {
                        this.pendingHotbarSlot = var6;
                        selectHotbarSlot(var1, var6);
                        if (var4.getMainHandItem().is(Items.TOTEM_OF_UNDYING)) {
                           swapOffhand(var1);
                        }
                     } else if (this.pendingHotbarSlot >= 0) {
                        selectHotbarSlot(var1, this.pendingHotbarSlot);
                        if (var4.getMainHandItem().is(Items.TOTEM_OF_UNDYING)) {
                           swapOffhand(var1);
                           this.pendingHotbarSlot = -1;
                        }
                     } else {
                        int var7 = findTotemInMainInventory(var4);
                        if (var7 != -1 && canContainerClick(var1)) {
                           int var8 = var2.autoTotemHotbarTotem ? var5 : var4.getInventory().getSelectedSlot();
                           swapInventoryToHotbar(var1, var7, var8);
                           this.pendingHotbarSlot = var8;
                        } else if (var4.getMainHandItem().is(Items.TOTEM_OF_UNDYING)) {
                           swapOffhand(var1);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean canRun(Minecraft var0) {
      return com.wimpyclient.g.g.INSTANCE.isOpen() ? false : var0.screen == null || var0.screen instanceof InventoryScreen;
   }

   private static boolean canContainerClick(Minecraft var0) {
      return var0.screen != null || !isMoving(var0);
   }

   private static boolean isMoving(Minecraft var0) {
      LocalPlayer var1 = var0.player;
      if (var1 == null) {
         return false;
      } else if (!var0.options.keyUp.isDown()
         && !var0.options.keyDown.isDown()
         && !var0.options.keyLeft.isDown()
         && !var0.options.keyRight.isDown()
         && !var0.options.keyJump.isDown()
         && !var1.isSprinting()
         && !var0.options.keyShift.isDown()) {
         Vec3 var2 = var1.getDeltaMovement();
         return var2.x * var2.x + var2.z * var2.z > 0.0025;
      } else {
         return true;
      }
   }

   private static boolean needsOffhandWork(Minecraft var0, x var1) {
      boolean var2 = var0.player.getOffhandItem().is(Items.TOTEM_OF_UNDYING);
      return var1.autoTotemForce || !var2;
   }

   private static boolean needsHotbarWork(Minecraft var0, x var1) {
      if (!var1.autoTotemHotbarTotem) {
         return false;
      } else {
         int var2 = Math.max(0, Math.min(8, var1.autoTotemHotbarSlot - 1));
         return !var0.player.getInventory().getItem(var2).is(Items.TOTEM_OF_UNDYING);
      }
   }

   private static int findTotemInMainInventory(LocalPlayer var0) {
      Inventory var1 = var0.getInventory();

      for (int var2 = 9; var2 < 36; var2++) {
         if (var1.getItem(var2).is(Items.TOTEM_OF_UNDYING)) {
            return var2;
         }
      }

      return -1;
   }

   private static int findTotemInHotbar(LocalPlayer var0) {
      Inventory var1 = var0.getInventory();

      for (int var2 = 0; var2 < Inventory.getSelectionSize(); var2++) {
         if (var1.getItem(var2).is(Items.TOTEM_OF_UNDYING)) {
            return var2;
         }
      }

      return -1;
   }

   private static void selectHotbarSlot(Minecraft var0, int var1) {
      LocalPlayer var2 = var0.player;
      if (var2 != null && var1 >= 0 && var1 <= 8) {
         if (var2.getInventory().getSelectedSlot() != var1) {
            var2.getInventory().setSelectedSlot(var1);
            ClientPacketListener var3 = var0.getConnection();
            if (var3 != null) {
               var3.send(new ServerboundSetCarriedItemPacket(var1));
            }
         }
      }
   }

   private static void swapOffhand(Minecraft var0) {
      ClientPacketListener var1 = var0.getConnection();
      if (var0.player != null && var1 != null) {
         var1.send(new ServerboundPlayerActionPacket(Action.SWAP_ITEM_WITH_OFFHAND, BlockPos.ZERO, Direction.DOWN));
      }
   }

   private static void swapInventoryToHotbar(Minecraft var0, int var1, int var2) {
      if (var0.player != null && var0.gameMode != null) {
         if (var1 >= 9 && var1 <= 35 && var2 >= 0 && var2 <= 8) {
            int var3 = var1 < 9 ? var1 + 36 : var1;
            var0.gameMode.handleInventoryMouseClick(var0.player.containerMenu.containerId, var3, var2, ClickType.SWAP, var0.player);
         }
      }
   }
}
