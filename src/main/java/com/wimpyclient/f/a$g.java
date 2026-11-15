package com.wimpyclient.f;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record a$g(
   long key,
   int sensitivity,
   boolean wantAmethyst,
   boolean wantGeode,
   boolean wantClusterIcons,
   boolean skybase,
   boolean failed,
   g$a evidence,
   List<com.wimpyclient.e.d> crystals,
   a$a site,
   int lightRevision
) {
   static a$g skybase(long var0) {
      return new a$g(var0, 5, false, false, false, true, false, new g$a(), List.of(), new a$a(), 0);
   }

   static a$g failed(long var0) {
      return new a$g(var0, 5, false, false, false, false, true, new g$a(), List.of(), new a$a(), 0);
   }
}
