package com.wimpyclient.i;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum f$a {
   WAIT_AT_Y,
   SETTLE,
   SET_HOME,
   WAIT_SET_CONFIRM,
   SET_HOME_AGAIN,
   WAIT_AFTER_SET,
   TP_HOME1,
   WAIT_TP1,
   TP_BACK,
   WAIT_TP_BACK,
   WAIT_BEFORE_DEL,
   DEL_HOME,
   WAIT_DEL_RETRY,
   WAIT_AFTER_DEL,
   DONE;

   private f$a() {
   }
}
