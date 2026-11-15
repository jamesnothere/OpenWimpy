package com.wimpyclient.p;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum b$a {
   IDLE,
   TRAVEL,
   SETTLE,
   DIG,
   DONE,
   FAILED;

   private b$a() {
   }
}
