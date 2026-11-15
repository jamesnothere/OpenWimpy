package com.wimpyclient.f;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;

@Environment(EnvType.CLIENT)
record a$h(
   com.wimpyclient.p.e$b packed,
   long key,
   int chunkMinSurfaceAir,
   boolean inEnd,
   int sensitivity,
   boolean wantAmethyst,
   boolean wantGeode,
   boolean wantClusterIcons,
   boolean wantRedstone,
   boolean wantCaveVines,
   boolean wantVines,
   boolean wantBamboo,
   boolean wantKelp,
   boolean wantCrop,
   boolean wantCocoa,
   boolean wantBee,
   boolean wantBerries,
   boolean wantDripstone,
   boolean wantGrass,
   int droppedItems,
   int polarBears,
   int mobs,
   int armorStands,
   int villagers,
   int itemFrames,
   int beeOccupants,
   a$d packetLight,
   List<BlockPos> nearbyCenters,
   int lightRevision
) {
}
