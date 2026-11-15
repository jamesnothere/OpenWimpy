package com.wimpyclient.i;

import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record af$f(af$g type, String subject, UUID id, String reason, int weight, long timeMs) {
}
