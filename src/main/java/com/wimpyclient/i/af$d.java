package com.wimpyclient.i;

import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record af$d(UUID uuid, String name, long dueMs) {
}
