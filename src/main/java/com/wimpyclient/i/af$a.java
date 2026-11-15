package com.wimpyclient.i;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record af$a(String name, String rankLabel, int color, int priority, long seenAtMs) {
   com.wimpyclient.n.c asEntry(boolean var1) {
      return new com.wimpyclient.n.c(this.name, this.rankLabel == null ? "" : this.rankLabel, this.color, var1, 0, this.priority);
   }
}
