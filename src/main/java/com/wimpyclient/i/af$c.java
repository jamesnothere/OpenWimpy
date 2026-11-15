package com.wimpyclient.i;

import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record af$c(UUID id, boolean hide) {
   static af$c hide(UUID var0) {
      return new af$c(var0, true);
   }

   static af$c remove(UUID var0) {
      return new af$c(var0, false);
   }
}
