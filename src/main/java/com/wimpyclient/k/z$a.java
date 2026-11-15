package com.wimpyclient.k;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record z$a(String label, String time, int icon, int tint, boolean urgent) {
}
