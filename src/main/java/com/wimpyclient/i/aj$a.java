package com.wimpyclient.i;

import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.player.ClientInput;
import net.minecraft.world.entity.player.Input;
import net.minecraft.world.phys.Vec2;

@Environment(EnvType.CLIENT)
final class aj$a extends ClientInput {
   private static int d9h4k1Pt88;
   private transient int xwrejXGKBv;

   aj$a(Input var1, Vec2 var2) {
super();
      int var10 = 981898236 ^ 1483987910;
      
      var10 = jtqaceeoajphjuqf(var10, 154152378);
      var10 = 737126933 ^ 1439088799 ^ Integer.parseInt("367791882");
      this.xwrejXGKBv = 66080734 ^ d9h4k1Pt88;
      var10 = 1973540816 ^ var10;
      this.keyPresses = var1;
      this.moveVector = var2;
   }

   static {
      int var3 = new Random(2963643898164847613L).nextInt();
      d9h4k1Pt88 = -877638464 ^ var3;
   }

   private static int jtqaceeoajphjuqf(int var0, int var1) {
      return var1 ^ var0;
   }
}
