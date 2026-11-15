package com.wimpyclient.f;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record a$c(String name, long chunkKey, double x, double y, double z, boolean insideViewEdge) {
}
