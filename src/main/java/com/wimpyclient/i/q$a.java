package com.wimpyclient.i;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.player.ClientInput;
import net.minecraft.world.entity.player.Input;
import net.minecraft.world.phys.Vec2;

@Environment(EnvType.CLIENT)
final class q$a extends ClientInput {
   q$a(Input var1, Vec2 var2) {
      this.keyPresses = var1;
      this.moveVector = var2;
   }
}
