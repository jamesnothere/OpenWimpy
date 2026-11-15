package com.wimpyclient.f;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.IOException;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class b$d {
   public BlockPos pos;
   public LongOpenHashSet members;
   private static int v056BWwc4C;
   private transient int FZ2VAtDyoM;

   public b$d(BlockPos var1, LongOpenHashSet var2) {
super();
      int var10 = 827214643 ^ 1374077487;
      
      var10 = 1406875772 ^ var10;
      var10 = 1513886857 ^ 734080776 ^ Integer.parseInt("1116637921");
      this.FZ2VAtDyoM = 895921309 ^ v056BWwc4C;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
            case 57804398:
            default:
               throw new RuntimeException(new IOException());
            case 61871321:
               var10 = 1024991807 ^ var10;
            case 1211012609:
               this.pos = var1;
               this.members = var2;
               return;
            case 671807217:
         }
      }
   }

   static {
      int var3 = new Random(-4652634686333452480L).nextInt();
      v056BWwc4C = -1700538914 ^ var3;
   }
}
