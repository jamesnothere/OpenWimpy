package com.wimpyclient.e;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongListIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2IntMap.FastEntrySet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectCollection;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.LongPredicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.phys.AABB;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a {
   public static final a INSTANCE;
   public static final int FLAG_AMETHYST = 1;
   public static final int FLAG_PLAYER = 32;
   public static final int FLAG_SPAWNER = 32768;
   public static final int FLAG_GEODE = 524288;
   public static final int PRIME_SUS_MASK = 524289;
   private static final int GEODE_CENTER_JOIN = 6;
   private static final int GEODE_SLICE_JOIN = 12;
   private static final int GEODE_MIN_BLOCKS = 1;
   private static final int MAX_HITS_PER_CHUNK = 32;
   private static final int MAX_RENDER_BOXES_PER_CHUNK = 32;
   private static final int SUS_RANGE_CLEAR_HYSTERESIS = 16;
   private static final int CLEAR_STREAK = 8;
   private final Long2ObjectMap<a$a> flagsByChunk;
   private final LongSet playerChunks;
   private final LongSet growthChunks;
   private final LongSet baseDebugChunks;
   private final Long2ObjectMap<a$c> sitesByChunk;
   private final Long2IntOpenHashMap geodeClearStreak;
   private final Long2IntOpenHashMap crystalClearStreak;
   private final Long2ObjectMap<List<b>> storageByChunk;
   private final Long2ObjectMap<List<b>> blockEspByChunk;
   private final Long2ObjectMap<List<h>> spawnersByChunk;
   private final Long2ObjectMap<List<BlockPos>> nbtByChunk;
   private final List<AABB> playerMarkers;
   private volatile List<ChunkPos> primeSusRenderSnapshot;
   private volatile List<i> primeSusMarkSnapshot;
   private volatile List<ChunkPos> playerChunkRenderSnapshot;
   private volatile List<ChunkPos> baseDebugRenderSnapshot;
   private volatile List<b> storageRenderSnapshot;
   private volatile List<b> blockEspRenderSnapshot;
   private volatile List<h> spawnerRenderSnapshot;
   private volatile List<BlockPos> nbtRenderSnapshot;
   private volatile List<BlockPos> amethystClusterRenderSnapshot;
   private volatile List<e> geodeHudRenderSnapshot;
   private volatile List<d> crystalOverlaySnapshot;
   private volatile List<AABB> playerMarkerRenderSnapshot;
   private boolean dirty;
   private boolean lastAmethystClusterIconsEnabled;
   private static int nTJ9iV63Q4;
   private transient int sYWT8UcuZw;
   private static String pwepjiaofa = ByteBuffer.wrap(vdytbzodyzneakk()).asCharBuffer().toString();

   private a() {
super();
      int var60 = 2037721476 ^ 1441326055;
      
      var60 = uewqfcyityvzphte(var60, 1983741447);
      var60 = 1289366913 ^ 996452891 ^ Integer.parseInt("756954110");
      this.sYWT8UcuZw = 607759692 ^ nTJ9iV63Q4;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var60)) {
            case 142213500:
               break;
            case 261556001:
               var60 = 969822539 ^ var60;
            case 2080765131:
               Long2ObjectOpenHashMap var2 = new Long2ObjectOpenHashMap();
               this.flagsByChunk = var2;
               LongOpenHashSet var32 = new LongOpenHashSet();
               this.playerChunks = var32;
               LongOpenHashSet var33 = new LongOpenHashSet();
               this.growthChunks = var33;
               LongOpenHashSet var34 = new LongOpenHashSet();
               this.baseDebugChunks = var34;
               Long2ObjectOpenHashMap var35 = new Long2ObjectOpenHashMap();
               this.sitesByChunk = var35;
               Long2IntOpenHashMap var36 = new Long2IntOpenHashMap();
               this.geodeClearStreak = var36;
               Long2IntOpenHashMap var37 = new Long2IntOpenHashMap();
               this.crystalClearStreak = var37;
               Long2ObjectOpenHashMap var38 = new Long2ObjectOpenHashMap();
               this.storageByChunk = var38;
               Long2ObjectOpenHashMap var39 = new Long2ObjectOpenHashMap();
               this.blockEspByChunk = var39;
               Long2ObjectOpenHashMap var40 = new Long2ObjectOpenHashMap();
               this.spawnersByChunk = var40;
               Long2ObjectOpenHashMap var41 = new Long2ObjectOpenHashMap();
               this.nbtByChunk = var41;
               ArrayList var42 = new ArrayList();
               this.playerMarkers = var42;
               List var43 = List.of();
               this.primeSusRenderSnapshot = var43;
               List var44 = List.of();
               this.primeSusMarkSnapshot = var44;
               List var45 = List.of();
               this.playerChunkRenderSnapshot = var45;
               List var46 = List.of();
               this.baseDebugRenderSnapshot = var46;
               List var47 = List.of();
               this.storageRenderSnapshot = var47;
               List var48 = List.of();
               this.blockEspRenderSnapshot = var48;
               List var49 = List.of();
               this.spawnerRenderSnapshot = var49;
               List var50 = List.of();
               this.nbtRenderSnapshot = var50;
               List var51 = List.of();
               this.amethystClusterRenderSnapshot = var51;
               List var52 = List.of();
               this.geodeHudRenderSnapshot = var52;
               List var53 = List.of();
               this.crystalOverlaySnapshot = var53;
               List var54 = List.of();
               this.playerMarkerRenderSnapshot = var54;
               boolean var55 = true;
               this.dirty = var55;
               Long2IntOpenHashMap var29 = this.geodeClearStreak;
               byte var56 = 0;
               var29.defaultReturnValue(var56);
               Long2IntOpenHashMap var31 = this.crystalClearStreak;
               byte var57 = 0;
               var31.defaultReturnValue(var57);
               return;
            case 1472699359:
            default:
               throw new RuntimeException();
         }
      }
   }

   private void markDirty() {
      int var5 = 934928080 ^ 1190070949 ^ 1358997049;
      var5 = 2145992714 ^ var5;
      byte var2 = (byte)(1606365767 ^ var5);
      this.dirty = (var2 != 0);
   }

   public synchronized void requestRenderRebuild() {
      int var4 = 1020627807 ^ 1287052728 ^ 1358997049;
      var4 = 507384242 ^ var4;
      this.markDirty();
   }

   private static int chebyshev(long var0, ChunkPos var2) {
      int var22 = 126536892 ^ 590353006 ^ 1966672757;
      var22 = 46960761 ^ var22;
      ChunkPos var3 = new ChunkPos(var0);
      int var8 = var3.x;
      int var13 = var2.x;
      int var9 = var8 - var13;
      int var10 = Math.abs(var9);
      int var15 = var3.z;
      int var19 = var2.z;
      int var16 = var15 - var19;
      int var17 = Math.abs(var16);
      return Math.max(var10, var17);
   }

   public synchronized void clearSusOutsideRange(ChunkPos var1, int var2) {
      int var54 = 1778932290 ^ 1526774862 ^ 1358997049;
      var54 = 381962893 ^ var54;
      byte var3 = (byte)(1993083576 ^ var54);
      byte var5 = (byte)(1993083560 ^ var54);
      int var40 = var2 + var5;
      int var10 = Math.max(var3, var40);
      int var6 = var10;
      Long2ObjectMap var12 = this.sitesByChunk;
      LongPredicate var42 = var2x -> {
         int var12x = 976510938 ^ 1484742625 ^ 1966672757;
         var12x = 126297951 ^ var12x;
         int var8x = chebyshev(var2x, var1);
         byte var9;
         if (var8x > var10) {
            var12x = 312297521 ^ var12x;
            var9 = (byte)(40395809 ^ var12x);
            var12x = uewqfcyityvzphte(var12x, 394115750);
         } else {
            var12x = 1643044310 ^ var12x;
            var9 = (byte)(1897656775 ^ var12x);
            var12x = 1678651201 ^ var12x;
         }

         return (var9 != 0);
      };
      byte var13 = (byte)((com.wimpyclient.p.i.removeKeysIf(var12, var42)) ? 1 : 0);
      byte var7 = var13;
      Long2IntOpenHashMap var15 = this.geodeClearStreak;
      LongPredicate var44 = var2x -> {
         int var12x = 976510938 ^ 1484742625 ^ 1966672757;
         var12x = 126297951 ^ var12x;
         int var8x = chebyshev(var2x, var1);
         byte var9;
         if (var8x > var10) {
            var12x = 312297521 ^ var12x;
            var9 = (byte)(40395809 ^ var12x);
            var12x = uewqfcyityvzphte(var12x, 394115750);
         } else {
            var12x = 1643044310 ^ var12x;
            var9 = (byte)(1897656775 ^ var12x);
            var12x = 1678651201 ^ var12x;
         }

         return (var9 != 0);
      };
      boolean var16 = com.wimpyclient.p.i.removeKeysIf(var15, var44);
      Long2IntOpenHashMap var18 = this.crystalClearStreak;
      LongPredicate var46 = var2x -> {
         int var12x = 976510938 ^ 1484742625 ^ 1966672757;
         var12x = 126297951 ^ var12x;
         int var8x = chebyshev(var2x, var1);
         byte var9;
         if (var8x > var10) {
            var12x = 312297521 ^ var12x;
            var9 = (byte)(40395809 ^ var12x);
            var12x = uewqfcyityvzphte(var12x, 394115750);
         } else {
            var12x = 1643044310 ^ var12x;
            var9 = (byte)(1897656775 ^ var12x);
            var12x = 1678651201 ^ var12x;
         }

         return (var9 != 0);
      };
      boolean var19 = com.wimpyclient.p.i.removeKeysIf(var18, var46);
      Long2ObjectMap var21 = this.flagsByChunk;
      ObjectSet var22 = var21.long2ObjectEntrySet();
      ObjectIterator var23 = var22.iterator();
      ObjectIterator var8 = var23;
      var54 = 161661478 ^ var54;

      while (true) {
         byte var25 = (byte)((var8.hasNext()) ? 1 : 0);
         if (var25 == (2137966750 ^ var54)) {
            var54 = 1762019885 ^ var54;
            if (var7 != (375947955 ^ var54)) {
               var54 = 1478738956 ^ var54;
               this.markDirty();
               var54 = 987757148 ^ var54;
               return;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
                  case 191523666:
                     var54 = 1660698192 ^ var54;
                     return;
                  case 561776988:
                     break;
                  case 1178918578:
                     return;
                  case 2075980205:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var54 = 2140081770 ^ var54;
         Object var29 = var8.next();
         Entry var30 = (Entry)var29;
         long var32 = var30.getLongKey();
         int var34 = chebyshev(var32, var1);
         if (var34 <= var6) {
            var54 = 35614244 ^ var54;
            var54 = uewqfcyityvzphte(var54, 2106613838);
         } else {
            var54 = uewqfcyityvzphte(var54, 639719339);
            Object var36 = var30.getValue();
            a$a var37 = (a$a)var36;
            byte var38 = (byte)((clearSusCluesOn(var37)) ? 1 : 0);
            if (var38 != (650154335 ^ var54)) {
               var54 = 1582838086 ^ var54;
               byte var39 = (byte)(2023268376 ^ var54);
               var7 = var39;
               var54 = 95646879 ^ var54;
            } else {
               label30:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
                     case 155306044:
                        break label30;
                     case 185941864:
                        var54 ^= 1542145497;
                        break label30;
                     case 1272142588:
                     default:
                        throw new IllegalStateException();
                     case 1752520260:
                  }
               }
            }

            var54 = uewqfcyityvzphte(var54, 38083608);
         }
      }
   }

   public synchronized void clearAllSusClues() {
      int var30 = 1793605341 ^ 416776877 ^ 1358997049;
      var30 = 247580948 ^ var30;
      Long2ObjectMap var5 = this.sitesByChunk;
      byte var6 = (byte)((var5.isEmpty()) ? 1 : 0);
      byte var7;
      if (var6 == (771674973 ^ var30)) {
         var30 = 266371979 ^ var30;
         var7 = (byte)(572412119 ^ var30);
         var30 = uewqfcyityvzphte(var30, 1716577708);
      } else {
         label45:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
               case 152933498:
                  var30 ^= 2138918326;
               case 195128323:
                  break label45;
               case 900236914:
                  break;
               case 1610763569:
               default:
                  throw new RuntimeException();
            }
         }

         var7 = (byte)(1384357611 ^ var30);
         var30 = 382544785 ^ var30;
      }

      byte var2 = var7;
      Long2ObjectMap var9 = this.sitesByChunk;
      var9.clear();
      Long2IntOpenHashMap var11 = this.geodeClearStreak;
      var11.clear();
      Long2IntOpenHashMap var13 = this.crystalClearStreak;
      var13.clear();
      Long2ObjectMap var15 = this.flagsByChunk;
      ObjectCollection var16 = var15.values();
      ObjectIterator var17 = var16.iterator();
      ObjectIterator var3 = var17;
      var30 = 1847140760 ^ var30;

      while (true) {
         byte var19 = (byte)((var3.hasNext()) ? 1 : 0);
         if (var19 == (710382818 ^ var30)) {
            var30 = 1903709163 ^ var30;
            if (var2 != (1529863945 ^ var30)) {
               var30 = 459945790 ^ var30;
               this.markDirty();
               var30 = 32101358 ^ var30;
               return;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 11311886:
                     var30 = 444851408 ^ var30;
                     return;
                  case 1498212208:
                  default:
                     throw new RuntimeException();
                  case 1753020219:
                     break;
                  case 1906822386:
                     return;
               }
            }
         }

         var30 = 615828539 ^ var30;
         Object var23 = var3.next();
         a$a var24 = (a$a)var23;
         byte var26 = (byte)((clearSusCluesOn(var24)) ? 1 : 0);
         if (var26 != (249780441 ^ var30)) {
            var30 = 659129532 ^ var30;
            byte var27 = (byte)(699063396 ^ var30);
            var2 = var27;
            var30 = 1529976729 ^ var30;
         } else {
            var30 = 2088244005 ^ var30;
         }

         var30 = uewqfcyityvzphte(var30, 1489821470);
      }
   }

   public synchronized void clearAllAmethystClusterIcons() {
      int var19 = 1039547501 ^ 1525971191 ^ 1358997049;
      var19 = 537502763 ^ var19;
      byte var1 = (byte)(369837704 ^ var19);
      byte var3 = var1;
      List var5 = this.amethystClusterRenderSnapshot;
      byte var6 = (byte)((var5.isEmpty()) ? 1 : 0);
      if (var6 == (369837704 ^ var19)) {
         var19 = 1282945565 ^ var19;
         List var2 = List.of();
         this.amethystClusterRenderSnapshot = var2;
         byte var8 = (byte)(1517515924 ^ var19);
         var3 = var8;
         var19 = 1513273113 ^ var19;
      } else {
         label33:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
               case 179687084:
                  var19 ^= 373982468;
                  break label33;
               case 763048420:
                  break;
               case 1616804122:
               default:
                  throw new IllegalStateException();
               case 2141218346:
                  break label33;
            }
         }
      }

      List var10 = this.geodeHudRenderSnapshot;
      byte var11 = (byte)((var10.isEmpty()) ? 1 : 0);
      if (var11 == (4309900 ^ var19)) {
         var19 = 349009467 ^ var19;
         List var16 = List.of();
         this.geodeHudRenderSnapshot = var16;
         byte var13 = (byte)(344765878 ^ var19);
         var3 = var13;
         var19 = 947843286 ^ var19;
      } else {
         label25:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
               case 4040466:
                  var19 ^= 749962989;
                  break label25;
               case 676802887:
                  break;
               case 1565588791:
               default:
                  throw new IllegalStateException();
               case 2016155635:
                  break label25;
            }
         }
      }

      if (var3 != (754074977 ^ var19)) {
         var19 = 1376683213 ^ var19;
         this.markDirty();
         var19 = 1294863333 ^ var19;
      } else {
         var19 = 522227496 ^ var19;
      }
   }

   private static boolean clearSusCluesOn(a$a var0) {
      int var22 = 445214328 ^ 1683334283 ^ 1966672757;
      var22 = 1498333252 ^ var22;
      int var5 = var0.scanFlags;
      int var7 = var0.likelihood;
      int var15 = var0.scanFlags;
      int var2 = -1386414532 ^ var22;
      int var16 = var15 & var2;
      var0.scanFlags = var16;
      byte var17 = (byte)(1386938818 ^ var22);
      var0.likelihood = var17;
      int var11 = var0.scanFlags;
      if (var11 == var5) {
         var22 = 2107867885 ^ var22;
         int var13 = var0.likelihood;
         if (var13 == var7) {
            var22 = 1870378884 ^ var22;
            byte var14 = (byte)(1081291947 ^ var22);
            var22 = 1753731751 ^ var22;
            return (var14 != 0);
         }

         var22 = 422894770 ^ var22;
      } else {
         var22 = 1687641695 ^ var22;
      }

      byte var29 = (byte)(909926300 ^ var22);
      var22 = 516471185 ^ var22;
      return (var29 != 0);
   }

   public synchronized void setAmethystSite(long var1, int[] var3, BlockPos var4, int var5, boolean var6, boolean var7, List<d> var8, int var9, int var10) {
      List var48;
      int var73;
      label57: {
         var73 = 1821225408 ^ 317326300 ^ 1358997049;
         var73 = 1826764630 ^ var73;
         if (var8 != null) {
            var73 = 865170970 ^ var73;
            byte var34 = (byte)((var8.isEmpty()) ? 1 : 0);
            if (var34 == (1880380777 ^ var73)) {
               var73 = 39158487 ^ var73;
               var48 = List.copyOf(var8);
               var73 = 1109337985 ^ var73;
               break label57;
            }

            var73 = 1385817187 ^ var73;
         } else {
            var73 = 1627951737 ^ var73;
         }

         var48 = List.of();

         label47:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var73)) {
               case 49456526:
                  var73 ^= 315834677;
                  break label47;
               case 408759588:
                  break;
               case 632479552:
               default:
                  throw new RuntimeException(new IOException());
               case 2000976774:
                  break label47;
            }
         }
      }

      byte var46;
      label40: {
         if (var6 != ((811528255 ^ var73) != 0)) {
            var73 = 480384007 ^ var73;
            byte var37 = (byte)((hasGrownCrystal(var48)) ? 1 : 0);
            if (var37 == (754771000 ^ var73)) {
               var73 = 2034816827 ^ var73;
               var46 = (byte)(1437872898 ^ var73);

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var73)) {
                     case 101545825:
                        var73 ^= 1812452639;
                        break label40;
                     case 460443942:
                     default:
                        throw new RuntimeException(new IOException());
                     case 625286135:
                        break;
                     case 1867288580:
                        break label40;
                  }
               }
            }

            var73 = uewqfcyityvzphte(var73, 1265099867);
         } else {
            var73 = 1472589916 ^ var73;
         }

         var46 = (byte)(1738211427 ^ var73);
         var73 = 1579738751 ^ var73;
      }

      byte var16 = (byte)(968091164 ^ var73);
      int var52 = var3[var16];
      byte var17 = (byte)(968091165 ^ var73);
      int var54 = var3[var17];
      byte var18 = (byte)(968091166 ^ var73);
      int var56 = var3[var18];
      byte var19 = (byte)(968091167 ^ var73);
      int var58 = var3[var19];
      int var60 = var4.getX();
      int var61 = var4.getY();
      int var62 = var4.getZ();
      byte var22 = (byte)(968091165 ^ var73);
      int var63 = Math.max(var22, var5);
      byte var26 = (byte)(968091164 ^ var73);
      int var65 = Math.max(var26, var9);
      byte var66 = (byte)(968091164 ^ var73);
      int var67 = Math.max(var66, var10);
      a$c var38 = new a$c(var1, var52, var54, var56, var58, var60, var61, var62, var63, (var46 != 0), var7, var48, var65, var67);
      Long2ObjectMap var40 = this.sitesByChunk;
      Object var41 = var40.put(var1, var38);
      a$c var42 = (a$c)var41;
      byte var44 = (byte)((var38.equals(var42)) ? 1 : 0);
      if (var44 == (968091164 ^ var73)) {
         var73 = 136631756 ^ var73;
         this.markDirty();
         var73 = 1098728559 ^ var73;
      } else {
         var73 = uewqfcyityvzphte(var73, 1230606755);
      }
   }

   private static boolean hasGrownCrystal(List<d> var0) {
      int var17 = 1585856818 ^ 1349141023 ^ 1966672757;
      var17 = 623839140 ^ var17;
      Iterator var4 = var0.iterator();
      Iterator var2 = var4;
      var17 = 732352781 ^ var17;

      while (true) {
         byte var6 = (byte)((var2.hasNext()) ? 1 : 0);
         if (var6 != (1969020657 ^ var17)) {
            var17 = 1792613209 ^ var17;
            Object var9 = var2.next();
            d var10 = (d)var9;
            d$a var12 = var10.kind();
            byte var13 = (byte)((var12.grown()) ? 1 : 0);
            if (var13 != (528860584 ^ var17)) {
               var17 = 429844542 ^ var17;
               return (((byte)(102444439 ^ var17)) != 0);
            }

            label25:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var17)) {
                  case 52462572:
                     break label25;
                  case 219361648:
                     var17 ^= 883501047;
                     break label25;
                  case 996085751:
                  default:
                     throw new RuntimeException();
                  case 1631994396:
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var17)) {
                  case 56859310:
                     var17 ^= 433017804;
                     return (((byte)(1821609277 ^ var17)) != 0);
                  case 454967427:
                     break;
                  case 520118030:
                     return (((byte)(1821609277 ^ var17)) != 0);
                  case 1961939330:
                  default:
                     throw new RuntimeException();
               }
            }
         }

         var17 = uewqfcyityvzphte(var17, 1584413870);
      }
   }

   public synchronized void clearAmethystSite(long var1) {
      int var11 = 1650823809 ^ 1754586528 ^ 1358997049;
      var11 = 2042062539 ^ var11;
      Long2ObjectMap var6 = this.sitesByChunk;
      Object var7 = var6.remove(var1);
      if (var7 != null) {
         var11 = 45345494 ^ var11;
         this.markDirty();
         var11 = 671512342 ^ var11;
      } else {
         var11 = uewqfcyityvzphte(var11, 716545472);
      }
   }

   public synchronized boolean hasAmethystSite(long var1) {
      int var10 = 1927227179 ^ 893413280 ^ 1358997049;
      var10 = 1423207280 ^ var10;
      Long2ObjectMap var6 = this.sitesByChunk;
      return var6.containsKey(var1);
   }

   public synchronized List<BlockPos> nearbyGeodeCenters(long var1) {
      int var54 = 2059149190 ^ 137969646 ^ 1358997049;
      var54 = 1000658619 ^ var54;
      ChunkPos var3 = new ChunkPos(var1);
      ChunkPos var9 = var3;
      ArrayList var14 = new ArrayList();
      ArrayList var10 = var14;
      Long2ObjectMap var16 = this.sitesByChunk;
      ObjectCollection var17 = var16.values();
      ObjectIterator var18 = var17.iterator();
      ObjectIterator var11 = var18;
      var54 = 1661187895 ^ var54;

      label43:
      while (true) {
         byte var20 = (byte)((var11.hasNext()) ? 1 : 0);
         if (var20 == (2065885149 ^ var54)) {
            var54 = uewqfcyityvzphte(var54, 1314282718);
            return var10;
         }

         var54 = 1894960402 ^ var54;
         Object var22 = var11.next();
         a$c var23 = (a$c)var22;
         int var25 = var23.blocks();
         byte var35 = (byte)(198191822 ^ var54);
         if (var25 >= var35) {
            label40:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
                  case 115562785:
                     var54 ^= 1269663176;
                     break label40;
                  case 440005976:
                     break;
                  case 578736516:
                  default:
                     throw new IllegalStateException();
                  case 1024923369:
                     break label40;
               }
            }

            long var45 = var23.chunkKey();
            ChunkPos var26 = new ChunkPos(var45);
            int var28 = var26.x;
            int var37 = var9.x;
            int var29 = var28 - var37;
            int var30 = Math.abs(var29);
            int var39 = var26.z;
            int var48 = var9.z;
            int var40 = var39 - var48;
            int var41 = Math.abs(var40);
            int var31 = Math.max(var30, var41);
            byte var42 = (byte)(1081978629 ^ var54);
            if (var31 <= var42) {
               var54 = 123107190 ^ var54;
               int var49 = var23.iconX();
               int var50 = var23.iconY();
               int var51 = var23.iconZ();
               BlockPos var43 = new BlockPos(var49, var50, var51);
               boolean var33 = var10.add(var43);
               var54 = uewqfcyityvzphte(var54, 1007239084);
            } else {
               var54 = 1151263473 ^ var54;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
                     case 76881397:
                        var54 ^= 2143398443;
                        continue label43;
                     case 234003625:
                        break;
                     case 1560083988:
                     default:
                        throw new IllegalStateException();
                     case 1663329348:
                        continue label43;
                  }
               }
            }
         } else {
            var54 = 2116170913 ^ var54;
            var54 = 248576435 ^ var54;
         }
      }
   }

   public synchronized void appendGeodeCrystals(BlockPos var1, List<d> var2) {
      int var135 = 1725854281 ^ 1663576392 ^ 1358997049;
      var135 = 359709763 ^ var135;
      a$c var21;
      ArrayList var128;
      if (var1 != null) {
         var135 = 802718835 ^ var135;
         if (var2 != null) {
            var135 = 1115552229 ^ var135;
            byte var30 = (byte)((var2.isEmpty()) ? 1 : 0);
            if (var30 != (740506861 ^ var135)) {
               var135 = 1293260290 ^ var135;
               return;
            }

            var135 = 32558414 ^ var135;
            Object var31 = null;
            var21 = (a$c)var31;
            int var32 = 1378618972 ^ var135;
            int var22 = var32;
            Long2ObjectMap var34 = this.sitesByChunk;
            ObjectCollection var35 = var34.values();
            ObjectIterator var36 = var35.iterator();
            ObjectIterator var23 = var36;
            var135 = 1828233243 ^ var135;

            label141:
            while (true) {
               byte var38 = (byte)((var23.hasNext()) ? 1 : 0);
               if (var38 == (1093358008 ^ var135)) {
                  var135 = 506729807 ^ var135;
                  if (var21 != null) {
                     var135 = 755742260 ^ var135;
                     byte var91 = (byte)(1913975493 ^ var135);
                     if (var22 > var91) {
                        var135 = 586043087 ^ var135;
                        return;
                     }

                     var135 = 1041056318 ^ var135;
                     List var110 = var21.crystals();
                     ArrayList var52 = new ArrayList(var110);
                     var128 = var52;
                     LongOpenHashSet var53 = new LongOpenHashSet();
                     LongOpenHashSet var129 = var53;
                     Iterator var55 = var52.iterator();
                     Iterator var130 = var55;
                     var135 = 1691937459 ^ var135;

                     label115:
                     while (true) {
                        byte var57 = (byte)((var130.hasNext()) ? 1 : 0);
                        if (var57 == (683760206 ^ var135)) {
                           var135 = uewqfcyityvzphte(var135, 1376993578);
                           byte var63 = (byte)(2060589924 ^ var135);
                           byte var131 = var63;
                           Iterator var65 = var2.iterator();
                           Iterator var132 = var65;
                           var135 = 1562924183 ^ var135;

                           label100:
                           while (true) {
                              byte var67 = (byte)((var132.hasNext()) ? 1 : 0);
                              if (var67 == (670715891 ^ var135)) {
                                 label73:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                                       case 225762588:
                                          var135 ^= 1641946660;
                                          break label73;
                                       case 339301866:
                                          break;
                                       case 627352478:
                                          break label73;
                                       case 938244312:
                                       default:
                                          throw new IllegalStateException();
                                    }
                                 }

                                 if (var131 == (1176785367 ^ var135)) {
                                    var135 = 73005067 ^ var135;
                                    return;
                                 }

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                                       case 132520116:
                                          var135 = 2115725787 ^ var135;
                                          break label141;
                                       case 616461521:
                                          break;
                                       case 1084277863:
                                       default:
                                          throw new IllegalStateException();
                                       case 1318460769:
                                          break label141;
                                    }
                                 }
                              }

                              var135 = 485991755 ^ var135;
                              Object var69 = var132.next();
                              d var70 = (d)var69;
                              d$a var72 = var70.kind();
                              byte var73 = (byte)((var72.countsAsCluster()) ? 1 : 0);
                              if (var73 == (990767800 ^ var135)) {
                                 var135 = 1255646819 ^ var135;
                                 var135 = uewqfcyityvzphte(var135, 1444938536);
                              } else {
                                 label95:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                                       case 40553929:
                                          var135 ^= 634869977;
                                          break label95;
                                       case 719101510:
                                       default:
                                          throw new IllegalStateException();
                                       case 1418889976:
                                          break;
                                       case 1994200583:
                                          break label95;
                                    }
                                 }

                                 BlockPos var97 = var70.pos();
                                 long var98 = var97.asLong();
                                 byte var75 = (byte)((var129.add(var98)) ? 1 : 0);
                                 if (var75 == (517648993 ^ var135)) {
                                    var135 = 109966931 ^ var135;
                                    var135 = uewqfcyityvzphte(var135, 1068305345);
                                 } else {
                                    var135 = 282252908 ^ var135;
                                    boolean var77 = var128.add(var70);
                                    byte var78 = (byte)(235430924 ^ var135);
                                    var131 = var78;

                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                                          case 187715537:
                                             var135 ^= 703736830;
                                             continue label100;
                                          case 216368054:
                                             break;
                                          case 767731391:
                                             continue label100;
                                          case 1394575328:
                                          default:
                                             throw new IllegalStateException();
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        var135 ^= 1026399701;
                        Object var59 = var130.next();
                        d var60 = (d)var59;
                        BlockPos var93 = var60.pos();
                        long var94 = var93.asLong();
                        boolean var62 = var129.add(var94);

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                              case 175822672:
                                 var135 ^= 1026399701;
                                 continue label115;
                              case 492049033:
                              default:
                                 throw new IllegalStateException();
                              case 1749241937:
                                 break;
                              case 1960625542:
                                 continue label115;
                           }
                        }
                     }
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                        case 139250305:
                           var135 = 266729723 ^ var135;
                           return;
                        case 609601712:
                        default:
                           throw new IllegalStateException();
                        case 1886281363:
                           return;
                        case 2051572512:
                     }
                  }
               }

               var135 = 232419823 ^ var135;
               Object var40 = var23.next();
               a$c var41 = (a$c)var40;
               int var43 = var1.getX();
               int var84 = var41.iconX();
               int var44 = var43 - var84;
               int var45 = Math.abs(var44);
               int var86 = var1.getY();
               int var104 = var41.iconY();
               int var87 = var86 - var104;
               int var88 = Math.abs(var87);
               int var106 = var1.getZ();
               int var111 = var41.iconZ();
               int var107 = var106 - var111;
               int var108 = Math.abs(var107);
               int var89 = Math.max(var88, var108);
               int var46 = Math.max(var45, var89);
               if (var46 < var22) {
                  var135 = 1243862561 ^ var135;
                  var22 = var46;
                  var21 = var41;
                  var135 = 364470954 ^ var135;
               } else {
                  label137:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                        case 85156441:
                           var135 ^= 1603974283;
                        case 508239704:
                           break label137;
                        case 941382115:
                        default:
                           throw new IllegalStateException();
                        case 1604189176:
                     }
                  }
               }

               var135 = uewqfcyityvzphte(var135, 1379976548);
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
                  case 98038753:
                     var135 = 258502631 ^ var135;
                     return;
                  case 464092589:
                     break;
                  case 1126859927:
                  default:
                     throw new IllegalStateException();
                  case 2141182527:
                     return;
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var135)) {
               case 250896216:
                  var135 = 548465556 ^ var135;
                  return;
               case 581511449:
               default:
                  throw new IllegalStateException();
               case 897944344:
                  break;
               case 1292396453:
                  return;
            }
         }
      }

      Long2ObjectMap var81 = this.sitesByChunk;
      long var102 = var21.chunkKey();
      long var113 = var21.chunkKey();
      int var115 = var21.minX();
      int var116 = var21.minZ();
      int var117 = var21.maxX();
      int var118 = var21.maxZ();
      int var119 = var21.iconX();
      int var120 = var21.iconY();
      int var121 = var21.iconZ();
      int var122 = var21.blocks();
      boolean var123 = var21.shellOnly();
      boolean var124 = var21.qualified();
      List var125 = List.copyOf(var128);
      int var126 = var21.budding();
      int var127 = var21.innerBlocks();
      a$c var112 = new a$c(var113, var115, var116, var117, var118, var119, var120, var121, var122, var123, var124, var125, var126, var127);
      Object var82 = var81.put(var102, var112);
      this.markDirty();
   }

   private List<a$b> mergeSites() {
      int var71 = 311659502 ^ 521802662 ^ 1358997049;
      var71 = 1977130018 ^ var71;
      Long2ObjectMap var58 = this.sitesByChunk;
      ObjectCollection var59 = var58.values();
      ArrayList var1 = new ArrayList(var59);
      ArrayList var4 = var1;
      int var12 = var1.size();
      int var5 = var12;
      if (var12 == (693215827 ^ var71)) {
         var71 = 1532023232 ^ var71;
         return List.of();
      } else {
         var71 = uewqfcyityvzphte(var71, 557329622);
         int[] var16 = new int[var12];
         int[] var6 = var16;
         byte var17 = (byte)(141135493 ^ var71);
         int var7 = var17;
         var71 = 877347645 ^ var71;

         while (var7 < var5) {
            var71 = 905890042 ^ var71;
            var6[var7] = var7;
            var7 += 165414211 ^ var71;
            var71 = 905890042 ^ var71;
         }

         Long2ObjectOpenHashMap var67;
         label73:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var71)) {
               case 75715254:
                  var71 ^= 1070567797;
               case 2102909331:
                  byte var19 = (byte)(65887437 ^ var71);
                  int var66 = var19;
                  var71 = 746067350 ^ var71;

                  label71:
                  while (var66 < var5) {
                     var71 = 586182655 ^ var71;
                     Object var22 = var4.get(var66);
                     a$c var23 = (a$c)var22;
                     a$c var8 = var23;
                     byte var44 = (byte)(224732837 ^ var71);
                     int var25 = var66 + var44;
                     int var9 = var25;
                     var71 = 850413723 ^ var71;

                     while (var9 < var5) {
                        var71 = 236736899 ^ var71;
                        Object var28 = var4.get(var9);
                        a$c var29 = (a$c)var28;
                        byte var31 = (byte)((sameGeode(var8, var29)) ? 1 : 0);
                        if (var31 != (835272636 ^ var71)) {
                           var71 = 346157761 ^ var71;
                           union(var6, var66, var9);
                           var71 = 150417274 ^ var71;
                        } else {
                           var71 = 475454907 ^ var71;
                        }

                        var9 += 765452806 ^ var71;
                        var71 = uewqfcyityvzphte(var71, 306875448);
                     }

                     var71 = 258784839 ^ var71;
                     var66 += 817483897 ^ var71;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var71)) {
                           case 241709905:
                              var71 ^= 523016483;
                              continue label71;
                           case 546493087:
                              break;
                           case 764852667:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1226699024:
                              continue label71;
                        }
                     }
                  }

                  var71 = 1253811892 ^ var71;
                  Long2ObjectOpenHashMap var33 = new Long2ObjectOpenHashMap();
                  var67 = var33;
                  byte var34 = (byte)(1697574895 ^ var71);
                  int var68 = var34;
                  var71 = 1789121607 ^ var71;

                  while (var68 < var5) {
                     var71 = 1470695472 ^ var71;
                     int var51 = find(var6, var68);
                     long var52 = var51;
                     Long2ObjectFunction var3 = var0 -> {
                        int var5x = 1696913064 ^ 1528215221 ^ 1966672757;
                        var5x = 1187877210 ^ var5x;
                        return new a$b();
                     };
                     Object var37 = var67.computeIfAbsent(var52, var3);
                     a$b var38 = (a$b)var37;
                     Object var55 = var4.get(var68);
                     a$c var56 = (a$c)var55;
                     var38.add(var56);
                     var68 += 1478767513 ^ var71;
                     var71 = uewqfcyityvzphte(var71, 1470695472);
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var71)) {
                        case 237087768:
                           var71 = 862603114 ^ var71;
                           break label73;
                        case 696206019:
                        default:
                           throw new RuntimeException(new IOException());
                        case 719895825:
                           break;
                        case 845986538:
                           break label73;
                     }
                  }
               case 467745182:
                  break;
               case 1504755299:
               default:
                  throw new RuntimeException(new IOException());
            }
         }

         ObjectCollection var64 = var67.values();
         return new ArrayList<>(var64);
      }
   }

   private static boolean sameGeode(a$c var0, a$c var1) {
      int var65 = 567042112 ^ 632246718 ^ 1966672757;
      var65 = 1241499069 ^ var65;
      int var12 = var0.iconX();
      int var38 = var1.iconX();
      int var13 = var12 - var38;
      int var14 = Math.abs(var13);
      int var16 = var0.iconY();
      int var40 = var1.iconY();
      int var17 = var16 - var40;
      int var18 = Math.abs(var17);
      int var20 = var0.iconZ();
      int var42 = var1.iconZ();
      int var21 = var20 - var42;
      int var22 = Math.abs(var21);
      int var44 = Math.max(var18, var22);
      int var24 = Math.max(var14, var44);
      byte var45 = (byte)(950402864 ^ var65);
      if (var24 <= var45) {
         var65 = 1252352254 ^ var65;
         return (((byte)(1912643529 ^ var65)) != 0);
      } else {
         var65 = 2077059044 ^ var65;
         long var56 = var0.chunkKey();
         ChunkPos var26 = new ChunkPos(var56);
         long var59 = var1.chunkKey();
         ChunkPos var27 = new ChunkPos(var59);
         int var29 = var26.x;
         int var47 = var27.x;
         int var30 = var29 - var47;
         int var31 = Math.abs(var30);
         int var49 = var26.z;
         int var62 = var27.z;
         int var50 = var49 - var62;
         int var51 = Math.abs(var50);
         int var32 = Math.max(var31, var51);
         byte var52 = (byte)(1130928339 ^ var65);
         if (var32 <= var52) {
            var65 = 270581517 ^ var65;
            int var35 = Math.max(var14, var22);
            byte var54 = (byte)(1397237715 ^ var65);
            if (var35 <= var54) {
               var65 = 86758570 ^ var65;
               byte var36 = (byte)(1449390964 ^ var65);
               var65 = 329590189 ^ var65;
               return (var36 != 0);
            }

            label26:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var65)) {
                  case 22781448:
                     var65 ^= 259697798;
                  case 658424350:
                     break label26;
                  case 955512472:
                     break;
                  case 1785221206:
                  default:
                     throw new RuntimeException();
               }
            }
         } else {
            var65 = uewqfcyityvzphte(var65, 525996939);
         }

         byte var73 = (byte)(1546816345 ^ var65);
         var65 = 435445121 ^ var65;
         return (var73 != 0);
      }
   }

   private static void union(int[] var0, int var1, int var2) {
      int var18 = 595912493 ^ 950389049 ^ 1966672757;
      var18 = 9114376 ^ var18;
      int var8 = find(var0, var1);
      int var10 = find(var0, var2);
      if (var8 != var10) {
         var18 = 1142788368 ^ var18;
         var0[var10] = var8;
         var18 = 1812860428 ^ var18;
      } else {
         var18 = uewqfcyityvzphte(var18, 672374556);
      }
   }

   private static int find(int[] var0, int var1) {
      int var19 = 81627151 ^ 1405305342 ^ 1966672757;
      var19 = 1756395138 ^ var19;

      while (true) {
         int var7 = var0[var1];
         if (var7 == var1) {
            var19 = 1088346826 ^ var19;
            return var1;
         }

         var19 = 595485018 ^ var19;
         int var16 = var0[var1];
         int var15 = var0[var16];
         var0[var1] = var15;
         int var11 = var0[var1];
         var1 = var11;
         var19 = 595485018 ^ var19;
      }
   }

   public synchronized void applyAmethystSiteMarks(ChunkPos var1, int var2, int var3, boolean var4, boolean var5) {
      int var256 = 2001139709 ^ 274685246 ^ 1358997049;
      var256 = 639001859 ^ var256;
      int var23 = com.wimpyclient.f.g.primeClusterNeed(var3);
      int var10 = var23;
      List var25 = this.mergeSites();
      Long2IntOpenHashMap var26 = new Long2IntOpenHashMap();
      Long2IntOpenHashMap var12 = var26;
      byte var163 = (byte)(269445625 ^ var256);
      var26.defaultReturnValue(var163);
      LongArrayList var28 = new LongArrayList();
      LongArrayList var13 = var28;
      Iterator var30 = var25.iterator();
      Iterator var14 = var30;
      var256 = 197468010 ^ var256;

      label257:
      while (true) {
         byte var32 = (byte)((var14.hasNext()) ? 1 : 0);
         if (var32 != (466253459 ^ var256)) {
            var256 = 2010474863 ^ var256;
            Object var131 = var14.next();
            a$b var132 = (a$b)var131;
            a$b var240 = var132;
            int var134 = var132.visibleClusterCount();
            int var242 = var134;
            if (var5 == ((1813979132 ^ var256) != 0)) {
               var256 = uewqfcyityvzphte(var256, 2010474863);
            } else {
               var256 = 1268953297 ^ var256;
               if (var134 < var10) {
                  var256 = 1115429182 ^ var256;
                  var256 = 2114699392 ^ var256;
               } else {
                  label146:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var256)) {
                        case 218080474:
                           var256 ^= 1178523948;
                           break label146;
                        case 690807432:
                           break;
                        case 1149763657:
                        default:
                           throw new IllegalStateException();
                        case 1752283335:
                           break label146;
                     }
                  }

                  long var209 = var132.centroidChunkKey();
                  boolean var138 = var13.add(var209);
                  LongOpenHashSet var140 = var132.memberChunkKeys();
                  LongIterator var141 = var140.iterator();
                  LongIterator var245 = var141;
                  var256 = 1574881416 ^ var256;

                  label139:
                  while (true) {
                     byte var143 = (byte)((var245.hasNext()) ? 1 : 0);
                     if (var143 == (1012776585 ^ var256)) {
                        var256 = uewqfcyityvzphte(var256, 480073063);

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var256)) {
                              case 259385821:
                                 var256 ^= 990551421;
                              case 310715620:
                                 continue label257;
                              case 921418906:
                                 break;
                              case 1939582117:
                              default:
                                 throw new IllegalStateException();
                           }
                        }
                     }

                     var256 = 457060370 ^ var256;
                     Object var145 = var245.next();
                     Long var146 = (Long)var145;
                     long var147 = var146;
                     int var151 = chebyshev(var147, var1);
                     if (var151 > var2) {
                        var256 = 833312638 ^ var256;
                        var256 = uewqfcyityvzphte(var256, 714434412);
                     } else {
                        var256 = 1457352266 ^ var256;
                        int var153 = var240.confirmedGrownInChunk(var147);
                        int var155 = com.wimpyclient.f.g.clusterConfidence(var153, var10);
                        int var253 = var155;
                        if (var155 <= (1908334801 ^ var256)) {
                           var256 = 484424861 ^ var256;
                           int var158 = com.wimpyclient.f.g.clusterConfidence(var242, var10);
                           var253 = var158;
                           var256 = 497104433 ^ var256;
                        } else {
                           var256 = 25070252 ^ var256;
                        }

                        if (var253 <= (1891658365 ^ var256)) {
                           var256 = 1058297974 ^ var256;
                           var256 = 1938394242 ^ var256;
                        } else {
                           var256 = uewqfcyityvzphte(var256, 1451541106);
                           int var217 = var12.get(var147);
                           if (var253 > var217) {
                              var256 = 708004456 ^ var256;
                              int var162 = var12.put(var147, var253);
                              var256 = 1063000267 ^ var256;
                           } else {
                              var256 = uewqfcyityvzphte(var256, 359617187);
                           }

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var256)) {
                                 case 52758150:
                                    var256 ^= 259408933;
                                    continue label139;
                                 case 701623644:
                                 default:
                                    throw new IllegalStateException();
                                 case 817929429:
                                    continue label139;
                                 case 1124690691:
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            label251:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var256)) {
                  case 98066038:
                     var256 ^= 1937975638;
                     break label251;
                  case 568651216:
                     break;
                  case 1609330525:
                     break label251;
                  case 1894438752:
                  default:
                     throw new IllegalStateException();
               }
            }

            Long2IntOpenHashMap var33 = new Long2IntOpenHashMap();
            Long2IntOpenHashMap var238 = var33;
            byte var164 = (byte)(1749639109 ^ var256);
            var33.defaultReturnValue(var164);
            byte var36 = (byte)((var13.isEmpty()) ? 1 : 0);
            if (var36 == (1749639109 ^ var256)) {
               var256 = 1055353636 ^ var256;
               byte var165 = (byte)(1454257376 ^ var256);
               int var166 = Math.max(var165, var2);
               Long2IntOpenHashMap var38 = com.wimpyclient.f.d.findOverlapVotes(var13, var166);
               FastEntrySet var40 = var38.long2IntEntrySet();
               ObjectIterator var41 = var40.iterator();
               ObjectIterator var16 = var41;
               var256 = 1709461547 ^ var256;

               label241:
               while (true) {
                  byte var43 = (byte)((var16.hasNext()) ? 1 : 0);
                  if (var43 == (860513482 ^ var256)) {
                     var256 = uewqfcyityvzphte(var256, 377020474);
                     break;
                  }

                  var256 = 629240788 ^ var256;
                  Object var45 = var16.next();
                  it.unimi.dsi.fastutil.longs.Long2IntMap.Entry var46 = (it.unimi.dsi.fastutil.longs.Long2IntMap.Entry)var45;
                  long var48 = var46.getLongKey();
                  int var52 = chebyshev(var48, var1);
                  if (var52 > var2) {
                     var256 = 1687467504 ^ var256;
                     var256 = 1091946020 ^ var256;
                  } else {
                     var256 = 1984863898 ^ var256;
                     int var54 = var12.get(var48);
                     if (var54 > (1619364228 ^ var256)) {
                        var256 = 1920304980 ^ var256;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var256)) {
                              case 78712387:
                                 var256 ^= 565864986;
                                 continue label241;
                              case 377089594:
                              default:
                                 throw new IllegalStateException();
                              case 558090526:
                                 break;
                              case 1494551648:
                                 continue label241;
                           }
                        }
                     } else {
                        label236:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var256)) {
                              case 184736490:
                                 var256 ^= 107403290;
                              case 697345952:
                                 break label236;
                              case 1775185389:
                              default:
                                 throw new IllegalStateException();
                              case 2028832748:
                           }
                        }

                        int var56 = var46.getIntValue();
                        int var57 = com.wimpyclient.f.d.likelihoodFromVotes(var56);
                        if (var57 > (1726173598 ^ var256)) {
                           var256 = 230123098 ^ var256;
                           int var60 = var238.put(var48, var57);
                           var256 = 1822474458 ^ var256;
                        } else {
                           var256 = uewqfcyityvzphte(var256, 1628939904);
                        }

                        var256 = 884904916 ^ var256;
                     }
                  }
               }
            } else {
               var256 = uewqfcyityvzphte(var256, 1299962677);
            }

            byte var61 = (byte)(624067824 ^ var256);
            int var239 = var61;
            LongOpenHashSet var62 = new LongOpenHashSet();
            LongOpenHashSet var241 = var62;
            LongSet var173 = var12.keySet();
            boolean var64 = var62.addAll(var173);
            LongSet var175 = var238.keySet();
            boolean var66 = var62.addAll(var175);
            Long2ObjectMap var68 = this.flagsByChunk;
            ObjectSet var69 = var68.long2ObjectEntrySet();
            ObjectIterator var70 = var69.iterator();
            ObjectIterator var243 = var70;
            var256 = 139976495 ^ var256;

            while (true) {
               byte var72 = (byte)((var243.hasNext()) ? 1 : 0);
               if (var72 == (761617375 ^ var256)) {
                  var256 = uewqfcyityvzphte(var256, 1923010119);
                  LongIterator var74 = var241.iterator();
                  LongIterator var244 = var74;
                  var256 = 722851933 ^ var256;

                  label197:
                  while (true) {
                     byte var76 = (byte)((var244.hasNext()) ? 1 : 0);
                     if (var76 == (1961774533 ^ var256)) {
                        label155:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var256)) {
                              case 42844739:
                                 var256 ^= 653494198;
                                 break label155;
                              case 59589949:
                              default:
                                 throw new IllegalStateException();
                              case 1519169619:
                                 break;
                              case 1838429320:
                                 break label155;
                           }
                        }

                        if (var239 != (1377684083 ^ var256)) {
                           var256 = 754007436 ^ var256;
                           this.markDirty();
                           var256 = 579840262 ^ var256;
                        } else {
                           var256 = uewqfcyityvzphte(var256, 243176586);
                        }

                        return;
                     }

                     var256 = 1629563920 ^ var256;
                     Object var80 = var244.next();
                     Long var81 = (Long)var80;
                     long var82 = var81;
                     int var86 = chebyshev(var82, var1);
                     byte var222 = (byte)(365912517 ^ var256);
                     int var177 = var2 + var222;
                     if (var86 > var177) {
                        var256 = 1539719575 ^ var256;
                        var256 = 988245383 ^ var256;
                     } else {
                        var256 = uewqfcyityvzphte(var256, 503638812);
                        int var88 = var12.get(var82);
                        int var90 = var238.get(var82);
                        if (var88 > (197888713 ^ var256)) {
                           var256 = 2017831835 ^ var256;
                           byte var183 = (byte)((this.setAmethystMark(var82, var88)) ? 1 : 0);
                           int var93 = var239 | var183;
                           var239 = var93;

                           label190:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var256)) {
                                 case 266539776:
                                    var256 ^= 1859287445;
                                    break label190;
                                 case 605122568:
                                 default:
                                    throw new IllegalStateException();
                                 case 874032757:
                                    break;
                                 case 1393774037:
                                    break label190;
                              }
                           }
                        } else {
                           var256 = uewqfcyityvzphte(var256, 1608831613);
                           if (var4 != ((1412389044 ^ var256) != 0)) {
                              var256 = 2087062239 ^ var256;
                              Long2IntOpenHashMap var109 = this.crystalClearStreak;
                              byte var235 = (byte)(675893866 ^ var256);
                              int var110 = var109.addTo(var82, var235);
                              byte var196 = (byte)(675893866 ^ var256);
                              int var111 = var110 + var196;
                              byte var197 = (byte)(675893859 ^ var256);
                              if (var111 >= var197) {
                                 var256 = 361323787 ^ var256;
                                 Long2IntOpenHashMap var113 = this.crystalClearStreak;
                                 int var114 = var113.remove(var82);
                                 byte var201 = (byte)((this.clearAmethystMark(var82)) ? 1 : 0);
                                 int var116 = var239 | var201;
                                 var239 = var116;
                                 var256 = 547116967 ^ var256;
                              } else {
                                 var256 = uewqfcyityvzphte(var256, 890571436);
                              }
                           } else {
                              label183:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var256)) {
                                    case 52162547:
                                       var256 ^= 1232273523;
                                       break label183;
                                    case 760763191:
                                    default:
                                       throw new IllegalStateException();
                                    case 978799500:
                                       break;
                                    case 1433825159:
                                       break label183;
                                 }
                              }
                           }
                        }

                        if (var90 > (492591303 ^ var256)) {
                           var256 = 900156462 ^ var256;
                           byte var193 = (byte)((this.setGeodeMark(var82, var90)) ? 1 : 0);
                           int var106 = var239 | var193;
                           var239 = var106;
                           var256 = uewqfcyityvzphte(var256, 472115997);
                        } else {
                           label174:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var256)) {
                                 case 149090653:
                                    var256 ^= 394083320;
                                 case 423098580:
                                    break label174;
                                 case 1785874829:
                                    break;
                                 case 2132154405:
                                 default:
                                    throw new IllegalStateException();
                              }
                           }

                           if (var4 != ((169960255 ^ var256) != 0)) {
                              var256 = 1070664583 ^ var256;
                              Long2IntOpenHashMap var97 = this.geodeClearStreak;
                              byte var234 = (byte)(904947897 ^ var256);
                              int var98 = var97.addTo(var82, var234);
                              byte var186 = (byte)(904947897 ^ var256);
                              int var99 = var98 + var186;
                              byte var187 = (byte)(904947888 ^ var256);
                              if (var99 >= var187) {
                                 var256 = 70507852 ^ var256;
                                 Long2IntOpenHashMap var101 = this.geodeClearStreak;
                                 int var102 = var101.remove(var82);
                                 byte var191 = (byte)((this.clearGeodeMark(var82)) ? 1 : 0);
                                 int var104 = var239 | var191;
                                 var239 = var104;
                                 var256 = 85674496 ^ var256;
                              } else {
                                 var256 = 19437388 ^ var256;
                              }
                           } else {
                              var256 = uewqfcyityvzphte(var256, 1056545995);
                           }
                        }

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var256)) {
                              case 107240240:
                                 var256 ^= 1077326385;
                                 continue label197;
                              case 431111391:
                              default:
                                 throw new IllegalStateException();
                              case 1541129911:
                                 continue label197;
                              case 1819567393:
                           }
                        }
                     }
                  }
               }

               label210: {
                  var256 = 1063831331 ^ var256;
                  Object var118 = var243.next();
                  Entry var119 = (Entry)var118;
                  Object var121 = var119.getValue();
                  a$a var122 = (a$a)var121;
                  int var123 = var122.scanFlags;
                  int var202 = 302357756 ^ var256;
                  int var125 = var123 & var202;
                  if (var125 == (302882044 ^ var256)) {
                     var256 = 314966568 ^ var256;
                     byte var203 = (byte)(13344469 ^ var256);
                     int var127 = var123 & var203;
                     if (var127 == (13344468 ^ var256)) {
                        var256 = 1839863145 ^ var256;
                        break label210;
                     }

                     var256 = 1618119104 ^ var256;
                  } else {
                     label208:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var256)) {
                           case 49967653:
                              var256 ^= 1924434920;
                           case 404049536:
                              break label208;
                           case 642757938:
                           default:
                              throw new IllegalStateException();
                           case 2013768775:
                        }
                     }
                  }

                  long var205 = var119.getLongKey();
                  boolean var129 = var241.add(var205);
                  var256 = 232299689 ^ var256;
               }

               var256 = uewqfcyityvzphte(var256, 1074057314);
            }
         }
      }
   }

   private boolean setAmethystMark(long var1, int var3) {
      int var53 = 2058989877 ^ 1797372152 ^ 1358997049;
      var53 = 964119685 ^ var53;
      Long2ObjectMap var12 = this.flagsByChunk;
      Long2ObjectFunction var8 = var0 -> {
         int var5 = 1899504992 ^ 1854435510 ^ 1966672757;
         var5 = 1850272672 ^ var5;
         return new a$a();
      };
      Object var13 = var12.computeIfAbsent(var1, var8);
      a$a var14 = (a$a)var13;
      int var16 = var14.scanFlags;
      int var18 = var14.likelihood;
      int var37 = var14.scanFlags;
      byte var7 = (byte)(2045764464 ^ var53);
      int var38 = var37 | var7;
      var14.scanFlags = var38;
      byte var39 = (byte)(2045764465 ^ var53);
      byte var48 = (byte)(2045764373 ^ var53);
      int var49 = Math.min(var48, var3);
      int var40 = Math.max(var39, var49);
      var14.siteLikelihood = var40;
      var14.refreshLikelihood();
      Long2IntOpenHashMap var23 = this.crystalClearStreak;
      int var24 = var23.remove(var1);
      Long2IntOpenHashMap var26 = this.geodeClearStreak;
      int var27 = var26.remove(var1);
      byte var45 = (byte)(2045764464 ^ var53);
      int var29 = var16 & var45;
      if (var29 == (2045764465 ^ var53)) {
         var53 = 14515347 ^ var53;
         com.wimpyclient.p.f.onNewPrimeSusChunk(var1);
         var53 = 532427067 ^ var53;
      } else {
         label40:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
               case 8636713:
                  break;
               case 205566277:
                  var53 ^= 526470568;
                  break label40;
               case 1051145848:
               default:
                  throw new RuntimeException();
               case 1448316792:
                  break label40;
            }
         }
      }

      int var33 = var14.scanFlags;
      if (var33 == var16) {
         var53 = 1593335751 ^ var53;
         int var35 = var14.likelihood;
         if (var35 == var18) {
            var53 = 1671286072 ^ var53;
            byte var36 = (byte)(1542143014 ^ var53);
            var53 = 445100728 ^ var53;
            return (var36 != 0);
         }

         var53 = 71915330 ^ var53;
      } else {
         var53 = uewqfcyityvzphte(var53, 1521551493);
      }

      byte var61 = (byte)(1010804317 ^ var53);

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var53)) {
            case 79392365:
               var53 = 2102601922 ^ var53;
               return (var61 != 0);
            case 747489280:
               return (var61 != 0);
            case 1043038051:
            default:
               throw new RuntimeException();
            case 1422634100:
         }
      }
   }

   private boolean clearAmethystMark(long var1) {
      int var30 = 2067701508 ^ 396226217 ^ 1358997049;
      var30 = 1293651251 ^ var30;
      Long2ObjectMap var8 = this.flagsByChunk;
      Object var9 = var8.get(var1);
      a$a var10 = (a$a)var9;
      if (var10 != null) {
         var30 = 664533284 ^ var30;
         int var13 = var10.scanFlags;
         byte var23 = (byte)(1461953410 ^ var30);
         int var14 = var13 & var23;
         if (var14 != (1461953411 ^ var30)) {
            var30 = 126454238 ^ var30;
            int var24 = var10.scanFlags;
            byte var6 = (byte)(-1353329245 ^ var30);
            int var25 = var24 & var6;
            var10.scanFlags = var25;
            int var17 = var10.scanFlags;
            int var26 = 1352804957 ^ var30;
            int var18 = var17 & var26;
            if (var18 == (1353329245 ^ var30)) {
               var30 = 150555604 ^ var30;
               byte var27 = (byte)(1481859465 ^ var30);
               var10.siteLikelihood = var27;
               var30 = 1031420257 ^ var30;
            } else {
               var30 = 897807029 ^ var30;
            }

            var10.refreshLikelihood();
            return (((byte)(1697208553 ^ var30)) != 0);
         } else {
            var30 = 1557086001 ^ var30;
            return (((byte)(200055986 ^ var30)) != 0);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
               case 14140733:
               default:
                  throw new RuntimeException(new IOException());
               case 174415643:
                  var30 ^= 2069153301;
                  return (((byte)(200055986 ^ var30)) != 0);
               case 242019274:
                  break;
               case 457664014:
                  return (((byte)(200055986 ^ var30)) != 0);
            }
         }
      }
   }

   private boolean setGeodeMark(long var1, int var3) {
      int var56 = 771755883 ^ 1171150587 ^ 1358997049;
      var56 = 1759982372 ^ var56;
      Long2ObjectMap var13 = this.flagsByChunk;
      Long2ObjectFunction var8 = var0 -> {
         int var5 = 1899504992 ^ 1854435510 ^ 1966672757;
         var5 = 1850272672 ^ var5;
         return new a$a();
      };
      Object var14 = var13.computeIfAbsent(var1, var8);
      a$a var15 = (a$a)var14;
      int var17 = var15.scanFlags;
      int var19 = var15.likelihood;
      int var35 = var15.scanFlags;
      int var7 = 1377946765 ^ var56;
      int var36 = var35 | var7;
      var15.scanFlags = var36;
      int var22 = var15.scanFlags;
      byte var37 = (byte)(1378471052 ^ var56);
      int var23 = var22 & var37;
      if (var23 == (1378471053 ^ var56)) {
         var56 = 1732797031 ^ var56;
         byte var38 = (byte)(895594218 ^ var56);
         byte var47 = (byte)(895594126 ^ var56);
         int var48 = Math.min(var47, var3);
         int var39 = Math.max(var38, var48);
         var15.siteLikelihood = var39;
         var56 = 417192162 ^ var56;
      } else {
         label38:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
               case 35066361:
                  break;
               case 234131051:
                  break label38;
               case 254848632:
                  var56 ^= 459399482;
                  break label38;
               case 867107448:
               default:
                  throw new RuntimeException();
            }
         }

         int var45 = var15.siteLikelihood;
         byte var49 = (byte)(1229467063 ^ var56);
         byte var52 = (byte)(1229467091 ^ var56);
         int var53 = Math.min(var52, var3);
         int var50 = Math.max(var49, var53);
         int var46 = Math.max(var45, var50);
         var15.siteLikelihood = var46;
         var56 = 1693735871 ^ var56;
      }

      var15.refreshLikelihood();
      Long2IntOpenHashMap var27 = this.geodeClearStreak;
      int var28 = var27.remove(var1);
      int var30 = var15.scanFlags;
      if (var30 == var17) {
         var56 = 381624843 ^ var56;
         int var32 = var15.likelihood;
         if (var32 == var19) {
            label27:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
                  case 39209414:
                     var56 ^= 101171466;
                     break label27;
                  case 989381064:
                  default:
                     throw new RuntimeException();
                  case 1812382816:
                     break label27;
                  case 1999405353:
               }
            }

            byte var33 = (byte)(1023710473 ^ var56);
            var56 = 1945115559 ^ var56;
            return (var33 != 0);
         }

         var56 = 520991402 ^ var56;
      } else {
         var56 = uewqfcyityvzphte(var56, 162697377);
      }

      byte var64 = (byte)(604956328 ^ var56);
      var56 = 1794795527 ^ var56;
      return (var64 != 0);
   }

   private boolean clearGeodeMark(long var1) {
      int var30 = 1492061218 ^ 945854604 ^ 1358997049;
      var30 = 533668074 ^ var30;
      Long2ObjectMap var8 = this.flagsByChunk;
      Object var9 = var8.get(var1);
      a$a var10 = (a$a)var9;
      if (var10 != null) {
         var30 = 1140046977 ^ var30;
         int var13 = var10.scanFlags;
         int var23 = 1841016572 ^ var30;
         int var14 = var13 & var23;
         if (var14 != (1840492284 ^ var30)) {
            var30 = uewqfcyityvzphte(var30, 1771103536);
            int var24 = var10.scanFlags;
            int var6 = -69946317 ^ var30;
            int var25 = var24 & var6;
            var10.scanFlags = var25;
            int var17 = var10.scanFlags;
            byte var26 = (byte)(69422029 ^ var30);
            int var18 = var17 & var26;
            if (var18 == (69422028 ^ var30)) {
               var30 = 1330871319 ^ var30;
               byte var27 = (byte)(1265645531 ^ var30);
               var10.siteLikelihood = var27;
               var30 = 1142302053 ^ var30;
            } else {
               label22:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                     case 65082156:
                        var30 ^= 189094258;
                        break label22;
                     case 397768336:
                        break;
                     case 471834856:
                        break label22;
                     case 590404766:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            var10.refreshLikelihood();
            return (((byte)(258347711 ^ var30)) != 0);
         }

         var30 = 1146685135 ^ var30;
      } else {
         var30 = 128629326 ^ var30;
      }

      return (((byte)(703244339 ^ var30)) != 0);
   }

   public synchronized void setScanFlag(long var1, int var3, boolean var4) {
      int var33 = 722879732 ^ 1942432171 ^ 1358997049;
      var33 = 862049151 ^ var33;
      Long2ObjectMap var12 = this.flagsByChunk;
      Long2ObjectFunction var9 = var0 -> {
         int var5 = 1899504992 ^ 1854435510 ^ 1966672757;
         var5 = 1850272672 ^ var5;
         return new a$a();
      };
      Object var13 = var12.computeIfAbsent(var1, var9);
      a$a var14 = (a$a)var13;
      int var16 = var14.scanFlags;
      if (var4 != ((984619033 ^ var33) != 0)) {
         var33 = 318527953 ^ var33;
         int var23 = var14.scanFlags;
         int var24 = var23 | var3;
         var14.scanFlags = var24;
         var33 = uewqfcyityvzphte(var33, 697510178);
      } else {
         var33 = 469586459 ^ var33;
         int var26 = var14.scanFlags;
         byte var30 = (byte)(-558713347 ^ var33);
         int var29 = var3 ^ var30;
         int var27 = var26 & var29;
         var14.scanFlags = var27;
         var33 = 546448104 ^ var33;
      }

      int var20 = var14.scanFlags;
      if (var20 != var16) {
         var33 = 1776270502 ^ var33;
         this.markDirty();
         var33 = 1657175758 ^ var33;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
               case 29455236:
                  var33 = 186237544 ^ var33;
                  return;
               case 468261930:
               default:
                  throw new IllegalStateException();
               case 840279236:
                  return;
               case 1635552689:
            }
         }
      }
   }

   public synchronized int getSusLikelihood(long var1) {
      int var15 = 379596544 ^ 364543182 ^ 1358997049;
      var15 = 20956804 ^ var15;
      Long2ObjectMap var7 = this.flagsByChunk;
      Object var8 = var7.get(var1);
      a$a var9 = (a$a)var8;
      if (var9 == null) {
         var15 = 1707744329 ^ var15;
         byte var20 = (byte)(921644858 ^ var15);
         var15 = 1855139669 ^ var15;
         return var20;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
               case 18366603:
                  var15 ^= 2084805919;
               case 33903598:
                  int var12 = var9.likelihood;
                  var15 = 1998237187 ^ var15;
                  return var12;
               case 329134939:
               default:
                  throw new RuntimeException();
               case 2034107182:
            }
         }
      }
   }

   public synchronized void markPlayerChunk(long var1) {
      int var29 = 597630393 ^ 744933173 ^ 1358997049;
      var29 = 2061706390 ^ var29;
      LongSet var10 = this.playerChunks;
      boolean var11 = var10.add(var1);
      Long2ObjectMap var13 = this.flagsByChunk;
      Long2ObjectFunction var7 = var0 -> {
         int var5 = 1899504992 ^ 1854435510 ^ 1966672757;
         var5 = 1850272672 ^ var5;
         return new a$a();
      };
      Object var14 = var13.computeIfAbsent(var1, var7);
      a$a var15 = (a$a)var14;
      int var17 = var15.scanFlags;
      int var24 = var15.scanFlags;
      byte var6 = (byte)(605706243 ^ var29);
      int var25 = var24 | var6;
      var15.scanFlags = var25;
      int var20 = var15.scanFlags;
      if (var20 != var17) {
         var29 = 1252302459 ^ var29;
         this.markDirty();
         var29 = 1398195781 ^ var29;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
               case 99823321:
                  var29 = 435312702 ^ var29;
                  return;
               case 277774517:
               default:
                  throw new RuntimeException();
               case 501435717:
                  return;
               case 1572886854:
            }
         }
      }
   }

   public synchronized void replaceGrowthChunks(Collection<Long> var1) {
      int var14 = 475536411 ^ 1185169431 ^ 1358997049;
      var14 = 263310964 ^ var14;
      LongSet var4 = this.growthChunks;
      var4.clear();
      if (var1 != null) {
         var14 = 80564388 ^ var14;
         byte var7 = (byte)((var1.isEmpty()) ? 1 : 0);
         if (var7 == (8414437 ^ var14)) {
            var14 = 185742158 ^ var14;
            LongSet var9 = this.growthChunks;
            boolean var10 = var9.addAll(var1);
            var14 = 887887151 ^ var14;
         } else {
            var14 = uewqfcyityvzphte(var14, 1073620577);
         }
      } else {
         label19:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
               case 67658929:
                  var14 = 993228485 ^ var14;
               case 995572650:
                  break label19;
               case 1795039581:
               default:
                  throw new IllegalStateException();
               case 2037096734:
            }
         }
      }

      this.markDirty();
   }

   public synchronized void clearGrowthChunks() {
      int var9 = 1727415798 ^ 1818855727 ^ 1358997049;
      var9 = 135654917 ^ var9;
      LongSet var2 = this.growthChunks;
      byte var3 = (byte)((var2.isEmpty()) ? 1 : 0);
      if (var3 != (1401586917 ^ var9)) {
         var9 = 205543705 ^ var9;
      } else {
         var9 = 436532531 ^ var9;
         LongSet var5 = this.growthChunks;
         var5.clear();
         this.markDirty();
      }
   }

   public synchronized void markBaseDebugChunk(long var1) {
      int var11 = 912595609 ^ 726465577 ^ 1358997049;
      var11 = 27621160 ^ var11;
      LongSet var6 = this.baseDebugChunks;
      byte var7 = (byte)((var6.add(var1)) ? 1 : 0);
      if (var7 != (1301034913 ^ var11)) {
         var11 = 1117382789 ^ var11;
         this.publishBaseDebugSnapshot();
         var11 = 116961063 ^ var11;
      } else {
         var11 = 1147226018 ^ var11;
      }
   }

   public synchronized void replaceBaseDebugChunks(Collection<Long> var1) {
      int var14 = 1004551602 ^ 635727527 ^ 1358997049;
      var14 = 883696287 ^ var14;
      LongSet var4 = this.baseDebugChunks;
      var4.clear();
      if (var1 != null) {
         var14 = 1902622246 ^ var14;
         byte var7 = (byte)((var1.isEmpty()) ? 1 : 0);
         if (var7 == (181363093 ^ var14)) {
            var14 = 1730487149 ^ var14;
            LongSet var9 = this.baseDebugChunks;
            boolean var10 = var9.addAll(var1);
            var14 = 157959781 ^ var14;
         } else {
            var14 = uewqfcyityvzphte(var14, 1850696968);
         }
      } else {
         var14 = 522769198 ^ var14;
      }

      this.publishBaseDebugSnapshot();
   }

   public synchronized void clearBaseDebugChunks() {
      int var13 = 566189488 ^ 552320103 ^ 1358997049;
      var13 = 1271979626 ^ var13;
      LongSet var3 = this.baseDebugChunks;
      byte var4 = (byte)((var3.isEmpty()) ? 1 : 0);
      if (var4 != (461674884 ^ var13)) {
         var13 = 879033967 ^ var13;
         List var6 = this.baseDebugRenderSnapshot;
         byte var7 = (byte)((var6.isEmpty()) ? 1 : 0);
         if (var7 != (803235819 ^ var13)) {
            var13 = 322231215 ^ var13;
            return;
         }

         var13 = 1035681629 ^ var13;
      } else {
         label22:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
               case 89191147:
                  var13 = 165658930 ^ var13;
                  break label22;
               case 118256636:
               default:
                  throw new RuntimeException();
               case 1675063313:
                  break label22;
               case 1829534299:
            }
         }
      }

      LongSet var9 = this.baseDebugChunks;
      var9.clear();
      List var2 = List.of();
      this.baseDebugRenderSnapshot = var2;
   }

   private void publishBaseDebugSnapshot() {
      int var29 = 2126041545 ^ 205367811 ^ 1358997049;
      var29 = 1146708409 ^ var29;
      LongSet var25 = this.baseDebugChunks;
      int var26 = var25.size();
      ArrayList var1 = new ArrayList(var26);
      ArrayList var5 = var1;
      LongSet var10 = this.baseDebugChunks;
      LongIterator var11 = var10.iterator();
      LongIterator var6 = var11;
      var29 = 1849369781 ^ var29;

      while (true) {
         byte var13 = (byte)((var6.hasNext()) ? 1 : 0);
         if (var13 == (166172927 ^ var29)) {
            var29 = 1690994266 ^ var29;
            List var23 = List.copyOf(var5);
            this.baseDebugRenderSnapshot = var23;
            return;
         }

         var29 = 1342815634 ^ var29;
         Object var16 = var6.next();
         Long var17 = (Long)var16;
         long var18 = var17;
         ChunkPos var24 = new ChunkPos(var18);
         boolean var21 = var5.add(var24);
         var29 = uewqfcyityvzphte(var29, 1342815634);
      }
   }

   public List<ChunkPos> baseDebugRenderSnapshot() {
      int var5 = 579307136 ^ 1025166936 ^ 1358997049;
      var5 = 990464871 ^ var5;
      return this.baseDebugRenderSnapshot;
   }

   public synchronized void clearPlayerFlags() {
      int var29 = 1393710637 ^ 1539375780 ^ 1358997049;
      var29 = 686754614 ^ var29;
      byte var1 = (byte)(1899821446 ^ var29);
      byte var4 = var1;
      Long2ObjectMap var8 = this.flagsByChunk;
      ObjectCollection var9 = var8.values();
      ObjectIterator var10 = var9.iterator();
      ObjectIterator var5 = var10;
      var29 = 1333445359 ^ var29;

      label32:
      while (true) {
         byte var12 = (byte)((var5.hasNext()) ? 1 : 0);
         if (var12 == (1044790121 ^ var29)) {
            var29 = 2029720463 ^ var29;
            LongSet var14 = this.playerChunks;
            var14.clear();
            if (var4 != (1186801894 ^ var29)) {
               var29 = 1888214866 ^ var29;
               this.markDirty();
               var29 = 39024852 ^ var29;
            } else {
               var29 = uewqfcyityvzphte(var29, 1926801286);
            }

            return;
         }

         var29 = 1036420270 ^ var29;
         Object var18 = var5.next();
         a$a var19 = (a$a)var18;
         int var21 = var19.scanFlags;
         byte var2 = (byte)(58769383 ^ var29);
         int var22 = var21 & var2;
         if (var22 != (58769351 ^ var29)) {
            var29 = 1476187694 ^ var29;
            int var25 = var19.scanFlags;
            byte var3 = (byte)(-1417439690 ^ var29);
            int var26 = var25 & var3;
            var19.scanFlags = var26;
            byte var24 = (byte)(1417439720 ^ var29);
            var4 = var24;
            var29 = 1940989722 ^ var29;
         } else {
            var29 = 609087796 ^ var29;
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
               case 220065595:
                  var29 ^= 428570010;
               case 1194147912:
                  continue label32;
               case 1411427680:
               default:
                  throw new RuntimeException(new IOException());
               case 1722910028:
            }
         }
      }
   }

   public synchronized void replacePlayerMarkers(List<AABB> var1) {
      int var17 = 988334095 ^ 1594891466 ^ 1358997049;
      var17 = 1359461947 ^ var17;
      List var4 = this.playerMarkers;
      var4.clear();
      if (var1 != null) {
         var17 = 1367303186 ^ var17;
         byte var7 = (byte)((var1.isEmpty()) ? 1 : 0);
         if (var7 == (880847061 ^ var17)) {
            var17 = 1346554149 ^ var17;
            List var9 = this.playerMarkers;
            boolean var10 = var9.addAll(var1);
            var17 = 43639364 ^ var17;
         } else {
            var17 = uewqfcyityvzphte(var17, 1390095201);
         }
      } else {
         label19:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var17)) {
               case 94370110:
                  var17 = 61099891 ^ var17;
                  break label19;
               case 323872638:
                  break;
               case 927902144:
                  break label19;
               case 2105282865:
               default:
                  throw new IllegalStateException();
            }
         }
      }

      List var13 = this.playerMarkers;
      List var14 = List.copyOf(var13);
      this.playerMarkerRenderSnapshot = var14;
   }

   public synchronized void replaceStorageInChunk(long var1, List<b> var3) {
      int var34 = 661561483 ^ 1534215924 ^ 1358997049;
      var34 = 292848589 ^ var34;
      if (var3 != null) {
         var34 = 1638204776 ^ var34;
         byte var11 = (byte)((var3.isEmpty()) ? 1 : 0);
         if (var11 == (1573766883 ^ var34)) {
            var34 = 1259724960 ^ var34;
            List var13 = List.copyOf(var3);
            Long2ObjectMap var15 = this.storageByChunk;
            Object var16 = var15.put(var1, var13);
            List var17 = (List)var16;
            if (var17 != null) {
               var34 = 2030430332 ^ var34;
               int var20 = var17.size();
               int var29 = var13.size();
               if (var20 == var29) {
                  var34 = 912009023 ^ var34;
                  byte var22 = (byte)((var17.equals(var13)) ? 1 : 0);
                  if (var22 != (1501686016 ^ var34)) {
                     var34 = 117122928 ^ var34;
                     return;
                  }

                  var34 = 2127749887 ^ var34;
               } else {
                  var34 = uewqfcyityvzphte(var34, 1217316288);
               }
            } else {
               var34 = 831204796 ^ var34;
            }

            this.markDirty();
            var34 = 2016003471 ^ var34;
            return;
         }

         var34 = 2126567842 ^ var34;
      } else {
         label42:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
               case 84592309:
                  var34 ^= 526769354;
                  break label42;
               case 362352103:
               default:
                  throw new IllegalStateException();
               case 606519161:
                  break;
               case 1056366617:
                  break label42;
            }
         }
      }

      Long2ObjectMap var25 = this.storageByChunk;
      Object var26 = var25.remove(var1);
      if (var26 != null) {
         var34 = 155389348 ^ var34;
         this.markDirty();
         var34 = 1007136471 ^ var34;
      } else {
         var34 = uewqfcyityvzphte(var34, 893690739);
      }
   }

   public synchronized void replaceBlockEspInChunk(long var1, List<b> var3) {
      int var34 = 766970247 ^ 1610564878 ^ 1358997049;
      var34 = 1665524441 ^ var34;
      if (var3 != null) {
         var34 = 1835115730 ^ var34;
         byte var11 = (byte)((var3.isEmpty()) ? 1 : 0);
         if (var11 == (762096827 ^ var34)) {
            var34 = uewqfcyityvzphte(var34, 1564281795);
            List var13 = List.copyOf(var3);
            Long2ObjectMap var15 = this.blockEspByChunk;
            Object var16 = var15.put(var1, var13);
            List var17 = (List)var16;
            if (var17 != null) {
               var34 = 2060583785 ^ var34;
               int var20 = var17.size();
               int var29 = var13.size();
               if (var20 == var29) {
                  var34 = 2021162819 ^ var34;
                  byte var22 = (byte)((var17.equals(var13)) ? 1 : 0);
                  if (var22 != (1929108306 ^ var34)) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
                           case 247958037:
                              var34 = 350245511 ^ var34;
                              return;
                           case 491508198:
                           default:
                              throw new RuntimeException();
                           case 520922917:
                              return;
                           case 703841975:
                        }
                     }
                  }

                  var34 = 672313751 ^ var34;
               } else {
                  var34 = 1349177044 ^ var34;
               }
            } else {
               var34 = uewqfcyityvzphte(var34, 716754365);
            }

            this.markDirty();
            var34 = 1022550800 ^ var34;
            return;
         }

         var34 = 2070126120 ^ var34;
      } else {
         var34 = uewqfcyityvzphte(var34, 369244922);
      }

      Long2ObjectMap var25 = this.blockEspByChunk;
      Object var26 = var25.remove(var1);
      if (var26 != null) {
         var34 = 1339955043 ^ var34;
         this.markDirty();
         var34 = 345178276 ^ var34;
      } else {
         var34 = 1531779015 ^ var34;
      }
   }

   public synchronized void clearBlockEsp() {
      int var14 = 1656037858 ^ 1133616108 ^ 1358997049;
      var14 = 329425496 ^ var14;
      Long2ObjectMap var3 = this.blockEspByChunk;
      byte var4 = (byte)((var3.isEmpty()) ? 1 : 0);
      if (var4 != (1669774959 ^ var14)) {
         var14 = 1096255323 ^ var14;
         List var6 = this.blockEspRenderSnapshot;
         byte var7 = (byte)((var6.isEmpty()) ? 1 : 0);
         if (var7 != (584137012 ^ var14)) {
            var14 = uewqfcyityvzphte(var14, 649252728);
            return;
         }

         var14 = 93124896 ^ var14;
      } else {
         var14 = uewqfcyityvzphte(var14, 1155235451);
      }

      Long2ObjectMap var9 = this.blockEspByChunk;
      var9.clear();
      List var2 = List.of();
      this.blockEspRenderSnapshot = var2;
      this.markDirty();
      var14 = 591279704 ^ var14;
   }

   public synchronized void replaceSpawnersInChunk(long var1, List<h> var3) {
      int var34 = 878793708 ^ 157997168 ^ 1358997049;
      var34 = 1034839507 ^ var34;
      if (var3 != null) {
         var34 = 1805583554 ^ var34;
         byte var11 = (byte)((var3.isEmpty()) ? 1 : 0);
         if (var11 == (976899252 ^ var34)) {
            var34 = 113186193 ^ var34;
            List var13 = List.copyOf(var3);
            Long2ObjectMap var15 = this.spawnersByChunk;
            Object var16 = var15.put(var1, var13);
            List var17 = (List)var16;
            if (var17 != null) {
               var34 = 1094170255 ^ var34;
               int var20 = var17.size();
               int var29 = var13.size();
               if (var20 == var29) {
                  var34 = 68988177 ^ var34;
                  byte var22 = (byte)((var17.equals(var13)) ? 1 : 0);
                  if (var22 != (2041463483 ^ var34)) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
                           case 138852785:
                              return;
                           case 150301880:
                              break;
                           case 197253348:
                              var34 = 1424353270 ^ var34;
                              return;
                           case 1848516270:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }

                  var34 = 2054942567 ^ var34;
               } else {
                  label42:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
                        case 59428331:
                           var34 ^= 2120696438;
                           break label42;
                        case 646071134:
                           break;
                        case 1729062850:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1863645341:
                           break label42;
                     }
                  }
               }
            } else {
               var34 = 1062270201 ^ var34;
            }

            this.markDirty();
            var34 = 782108817 ^ var34;
            return;
         }

         var34 = 2066307914 ^ var34;
      } else {
         var34 = 280387464 ^ var34;
      }

      Long2ObjectMap var25 = this.spawnersByChunk;
      Object var26 = var25.remove(var1);
      if (var26 != null) {
         var34 = 466271468 ^ var34;
         this.markDirty();
         var34 = 1870831012 ^ var34;
      } else {
         var34 = 1950884168 ^ var34;
      }
   }

   public synchronized void replaceNbtMarkersInChunk(long var1, List<BlockPos> var3) {
      int var35 = 121693344 ^ 48556314 ^ 1358997049;
      var35 = 484156024 ^ var35;
      if (var3 != null) {
         var35 = 1157698586 ^ var35;
         byte var11 = (byte)((var3.isEmpty()) ? 1 : 0);
         if (var11 == (226368993 ^ var35)) {
            var35 = 1543533903 ^ var35;
            List var17 = List.copyOf(var3);
            Long2ObjectMap var19 = this.nbtByChunk;
            Object var20 = var19.put(var1, var17);
            List var21 = (List)var20;
            if (var21 != null) {
               var35 = 2119433390 ^ var35;
               int var24 = var21.size();
               int var31 = var17.size();
               if (var24 == var31) {
                  var35 = 420423673 ^ var35;
                  byte var26 = (byte)((var21.equals(var17)) ? 1 : 0);
                  if (var26 != (908243961 ^ var35)) {
                     var35 = 26863659 ^ var35;
                     return;
                  }

                  var35 = 930149374 ^ var35;
               } else {
                  var35 = 780129287 ^ var35;
               }
            } else {
               var35 = uewqfcyityvzphte(var35, 1345071273);
            }

            this.markDirty();
            var35 = 921246677 ^ var35;
            return;
         }

         var35 = 919794222 ^ var35;
      } else {
         var35 = 1943266868 ^ var35;
      }

      Long2ObjectMap var13 = this.nbtByChunk;
      Object var14 = var13.remove(var1);
      if (var14 != null) {
         var35 = 203266017 ^ var35;
         this.markDirty();
         var35 = 429713443 ^ var35;
      } else {
         var35 = 360808386 ^ var35;
      }
   }

   public synchronized void pruneEmpty() {
      int var41 = 1459664445 ^ 1946730781 ^ 1358997049;
      var41 = 152920616 ^ var41;
      byte var1 = (byte)(2065019697 ^ var41);
      byte var4 = var1;
      Long2ObjectMap var10 = this.flagsByChunk;
      LongArrayList var11 = com.wimpyclient.p.i.snapshotKeys(var10);
      LongListIterator var12 = var11.iterator();
      LongListIterator var5 = var12;
      var41 = 1515940617 ^ var41;

      while (true) {
         byte var14 = (byte)((var5.hasNext()) ? 1 : 0);
         if (var14 == (558815288 ^ var41)) {
            var41 = 1212431744 ^ var41;
            if (var4 != (1762321848 ^ var41)) {
               var41 = 191425957 ^ var41;
               this.markDirty();
               var41 = 271511567 ^ var41;
               return;
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                     case 193295390:
                        var41 = 457579946 ^ var41;
                        return;
                     case 902555276:
                     default:
                        throw new RuntimeException(new IOException());
                     case 973681836:
                        break;
                     case 1828726246:
                        return;
                  }
               }
            }
         }

         var41 = 1982620456 ^ var41;
         Object var18 = var5.next();
         Long var19 = (Long)var18;
         long var20 = var19;
         Long2ObjectMap var23 = this.flagsByChunk;
         Object var24 = var23.get(var20);
         a$a var25 = (a$a)var24;
         if (var25 != null) {
            var41 = 646978568 ^ var41;
            int var28 = var25.effectiveFlags();
            if (var28 == (1911727896 ^ var41)) {
               var41 = 674606604 ^ var41;
               Long2ObjectMap var30 = this.sitesByChunk;
               byte var31 = (byte)((var30.containsKey(var20)) ? 1 : 0);
               if (var31 == (1506216212 ^ var41)) {
                  var41 = 1159806289 ^ var41;
                  Long2ObjectMap var33 = this.flagsByChunk;
                  Object var34 = var33.remove(var20);
                  byte var35 = (byte)(484848708 ^ var41);
                  var4 = var35;
                  var41 = 1544565149 ^ var41;
               } else {
                  var41 = uewqfcyityvzphte(var41, 422644940);
               }
            } else {
               var41 = uewqfcyityvzphte(var41, 822387392);
            }
         } else {
            var41 = uewqfcyityvzphte(var41, 395624136);
         }

         var41 = uewqfcyityvzphte(var41, 1639505376);
      }
   }

   public synchronized void retainChunks(LongSet var1) {
      int var79 = 1208078761 ^ 1329881875 ^ 1358997049;
      var79 = 1862911015 ^ var79;
      byte var2 = (byte)(961335460 ^ var79);
      byte var6 = var2;
      Long2ObjectMap var12 = this.flagsByChunk;
      LongArrayList var13 = com.wimpyclient.p.i.snapshotKeys(var12);
      LongListIterator var14 = var13.iterator();
      LongListIterator var7 = var14;
      var79 = 499156240 ^ var79;

      label73:
      while (true) {
         byte var16 = (byte)((var7.hasNext()) ? 1 : 0);
         if (var16 != (613176756 ^ var79)) {
            var79 = 1588481974 ^ var79;
            Object var18 = var7.next();
            Long var19 = (Long)var18;
            long var20 = var19;
            byte var23 = (byte)((var1.contains(var20)) ? 1 : 0);
            if (var23 != (2049055234 ^ var79)) {
               var79 = uewqfcyityvzphte(var79, 1588481974);
            } else {
               var79 = 1746739356 ^ var79;
               Long2ObjectMap var25 = this.sitesByChunk;
               byte var26 = (byte)((var25.containsKey(var20)) ? 1 : 0);
               if (var26 != (306133662 ^ var79)) {
                  var79 = 974288739 ^ var79;
                  var79 = 211884105 ^ var79;
               } else {
                  label56:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                        case 56267693:
                           var79 ^= 254095162;
                        case 716766961:
                           break label56;
                        case 1042700142:
                           break;
                        case 1199438762:
                        default:
                           throw new RuntimeException();
                     }
                  }

                  Long2ObjectMap var28 = this.flagsByChunk;
                  Object var29 = var28.get(var20);
                  a$a var30 = (a$a)var29;
                  if (var30 != null) {
                     var79 = 1861905938 ^ var79;
                     int var33 = var30.scanFlags;
                     if (var33 == (1944091574 ^ var79)) {
                        var79 = 716352725 ^ var79;
                        Long2ObjectMap var35 = this.flagsByChunk;
                        Object var36 = var35.remove(var20);
                        byte var37 = (byte)(1498601314 ^ var79);
                        var6 = var37;
                        var79 = 1563544514 ^ var79;
                     } else {
                        var79 = 2005100311 ^ var79;
                     }
                  } else {
                     label48:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                           case 73215775:
                           default:
                              throw new RuntimeException();
                           case 140678391:
                              var79 ^= 427362565;
                           case 1494867832:
                              break label48;
                           case 1567533171:
                        }
                     }
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                        case 3071552:
                        default:
                           throw new RuntimeException();
                        case 69004981:
                           var79 ^= 552552725;
                        case 372848234:
                           continue label73;
                        case 1078144188:
                     }
                  }
               }
            }
         } else {
            var79 = uewqfcyityvzphte(var79, 647828991);
            Long2ObjectMap var55 = this.storageByChunk;
            LongPredicate var66 = var1x -> {
               int var10 = 1082554866 ^ 266177879 ^ 1966672757;
               var10 = 1856046318 ^ var10;
               byte var6x = (byte)((var1.contains(var1x)) ? 1 : 0);
               if (var6x != (1422129982 ^ var10)) {
                  var10 = uewqfcyityvzphte(var10, 124048828);
                  byte var16x = (byte)(1403465346 ^ var10);
                  var10 = 1477322301 ^ var10;
                  return (var16x != 0);
               } else {
                  var10 = 248378448 ^ var10;
                  byte var7x = (byte)(1510870895 ^ var10);

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
                        case 115104262:
                           return (var7x != 0);
                        case 242968555:
                           var10 = 1369901009 ^ var10;
                           return (var7x != 0);
                        case 1582840214:
                        default:
                           throw new IllegalStateException();
                        case 1822962083:
                     }
                  }
               }
            };
            byte var56 = (byte)((com.wimpyclient.p.i.removeKeysIf(var55, var66)) ? 1 : 0);
            int var39 = var6 | var56;
            Long2ObjectMap var58 = this.blockEspByChunk;
            LongPredicate var68 = var1x -> {
               int var10 = 1082554866 ^ 266177879 ^ 1966672757;
               var10 = 1856046318 ^ var10;
               byte var6x = (byte)((var1.contains(var1x)) ? 1 : 0);
               if (var6x != (1422129982 ^ var10)) {
                  var10 = uewqfcyityvzphte(var10, 124048828);
                  byte var16x = (byte)(1403465346 ^ var10);
                  var10 = 1477322301 ^ var10;
                  return (var16x != 0);
               } else {
                  var10 = 248378448 ^ var10;
                  byte var7x = (byte)(1510870895 ^ var10);

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
                        case 115104262:
                           return (var7x != 0);
                        case 242968555:
                           var10 = 1369901009 ^ var10;
                           return (var7x != 0);
                        case 1582840214:
                        default:
                           throw new IllegalStateException();
                        case 1822962083:
                     }
                  }
               }
            };
            byte var59 = (byte)((com.wimpyclient.p.i.removeKeysIf(var58, var68)) ? 1 : 0);
            int var41 = var39 | var59;
            Long2ObjectMap var61 = this.spawnersByChunk;
            LongPredicate var70 = var1x -> {
               int var10 = 1082554866 ^ 266177879 ^ 1966672757;
               var10 = 1856046318 ^ var10;
               byte var6x = (byte)((var1.contains(var1x)) ? 1 : 0);
               if (var6x != (1422129982 ^ var10)) {
                  var10 = uewqfcyityvzphte(var10, 124048828);
                  byte var16x = (byte)(1403465346 ^ var10);
                  var10 = 1477322301 ^ var10;
                  return (var16x != 0);
               } else {
                  var10 = 248378448 ^ var10;
                  byte var7x = (byte)(1510870895 ^ var10);

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
                        case 115104262:
                           return (var7x != 0);
                        case 242968555:
                           var10 = 1369901009 ^ var10;
                           return (var7x != 0);
                        case 1582840214:
                        default:
                           throw new IllegalStateException();
                        case 1822962083:
                     }
                  }
               }
            };
            byte var62 = (byte)((com.wimpyclient.p.i.removeKeysIf(var61, var70)) ? 1 : 0);
            int var43 = var41 | var62;
            Long2ObjectMap var64 = this.nbtByChunk;
            LongPredicate var72 = var1x -> {
               int var10 = 1082554866 ^ 266177879 ^ 1966672757;
               var10 = 1856046318 ^ var10;
               byte var6x = (byte)((var1.contains(var1x)) ? 1 : 0);
               if (var6x != (1422129982 ^ var10)) {
                  var10 = uewqfcyityvzphte(var10, 124048828);
                  byte var16x = (byte)(1403465346 ^ var10);
                  var10 = 1477322301 ^ var10;
                  return (var16x != 0);
               } else {
                  var10 = 248378448 ^ var10;
                  byte var7x = (byte)(1510870895 ^ var10);

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
                        case 115104262:
                           return (var7x != 0);
                        case 242968555:
                           var10 = 1369901009 ^ var10;
                           return (var7x != 0);
                        case 1582840214:
                        default:
                           throw new IllegalStateException();
                        case 1822962083:
                     }
                  }
               }
            };
            byte var65 = (byte)((com.wimpyclient.p.i.removeKeysIf(var64, var72)) ? 1 : 0);
            int var45 = var43 | var65;
            if (var45 != (34685003 ^ var79)) {
               var79 = 348070060 ^ var79;
               this.markDirty();
               var79 = 1613357400 ^ var79;
               return;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                  case 32517719:
                     var79 = 1956037108 ^ var79;
                     return;
                  case 236067125:
                     break;
                  case 248720447:
                  default:
                     throw new RuntimeException();
                  case 689587331:
                     return;
               }
            }
         }
      }
   }

   public synchronized void rebuildRenderSnapshotIfDirty(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      int var46 = 473919098 ^ 1776631445 ^ 1358997049;
      var46 = 1289053526 ^ var46;
      byte var14 = (byte)((this.dirty) ? 1 : 0);
      if (var14 == (1745851264 ^ var46)) {
         var46 = 627455006 ^ var46;
         byte var33 = (byte)((this.lastAmethystClusterIconsEnabled) ? 1 : 0);
         if (var6 == (var33 != 0)) {
            label60: {
               var46 = 1135562788 ^ var46;
               if (var3 == ((247920570 ^ var46) != 0)) {
                  var46 = 392298430 ^ var46;
                  List var18 = this.playerMarkerRenderSnapshot;
                  byte var19 = (byte)((var18.isEmpty()) ? 1 : 0);
                  if (var19 == (430376964 ^ var46)) {
                     var46 = 1288939308 ^ var46;
                     List var34 = List.of();
                     this.playerMarkerRenderSnapshot = var34;
                     var46 = 1674629435 ^ var46;
                     break label60;
                  }

                  var46 = uewqfcyityvzphte(var46, 2086062694);
               } else {
                  label58:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                        case 78402658:
                           break label58;
                        case 211906878:
                           var46 ^= 1798780376;
                           break label58;
                        case 1842589706:
                        default:
                           throw new RuntimeException();
                        case 2141927926:
                     }
                  }
               }

               if (var3 != ((1710342754 ^ var46) != 0)) {
                  var46 = 584071165 ^ var46;
                  List var29 = this.playerMarkerRenderSnapshot;
                  int var30 = var29.size();
                  List var38 = this.playerMarkers;
                  int var39 = var38.size();
                  if (var30 != var39) {
                     var46 = 1922704488 ^ var46;
                     List var41 = this.playerMarkers;
                     List var42 = List.copyOf(var41);
                     this.playerMarkerRenderSnapshot = var42;
                     var46 = 52408292 ^ var46;
                  } else {
                     label47:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                           case 164728005:
                              var46 ^= 1904577420;
                              break label47;
                           case 338280840:
                              break;
                           case 1902706454:
                              break label47;
                           case 1922717213:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  }
               } else {
                  var46 = 1398127729 ^ var46;
               }
            }

            if (var6 == ((916749843 ^ var46) != 0)) {
               var46 = 353696398 ^ var46;
               List var23 = this.amethystClusterRenderSnapshot;
               byte var24 = (byte)((var23.isEmpty()) ? 1 : 0);
               if (var24 == (598770845 ^ var46)) {
                  var46 = 708815741 ^ var46;
                  List var35 = List.of();
                  this.amethystClusterRenderSnapshot = var35;
                  List var36 = List.of();
                  this.geodeHudRenderSnapshot = var36;
                  var46 = 221955130 ^ var46;
               } else {
                  var46 = 654667591 ^ var46;
               }

               return;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                  case 165577440:
                     var46 = 840013257 ^ var46;
                     return;
                  case 178842726:
                     return;
                  case 191762870:
                  default:
                     throw new RuntimeException();
                  case 1241329968:
               }
            }
         }

         var46 = 2003275143 ^ var46;
      } else {
         var46 = uewqfcyityvzphte(var46, 1375844761);
      }

      this.rebuildRenderSnapshot(var1, var2, (boolean)var3, var4, var5, (boolean)var6);
   }

   public synchronized void rebuildRenderSnapshot(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      int var257 = 1027807614 ^ 1155741978 ^ 1358997049;
      var257 = 962068731 ^ var257;
      ArrayList var7 = new ArrayList();
      ArrayList var13 = var7;
      ArrayList var25 = new ArrayList();
      ArrayList var14 = var25;
      ArrayList var26 = new ArrayList();
      ArrayList var15 = var26;
      Long2ObjectMap var28 = this.flagsByChunk;
      ObjectSet var29 = var28.long2ObjectEntrySet();
      ObjectIterator var30 = var29.iterator();
      ObjectIterator var16 = var30;
      var257 = 787489959 ^ var257;

      while (true) {
         byte var32 = (byte)((var16.hasNext()) ? 1 : 0);
         if (var32 == (1057530369 ^ var257)) {
            var257 = 623067932 ^ var257;
            if (var1 != ((439083293 ^ var257) != 0)) {
               var257 = 1786550049 ^ var257;
               LongSet var35 = this.growthChunks;
               LongIterator var36 = var35.iterator();
               LongIterator var235 = var36;
               var257 = 2086844226 ^ var257;

               while (true) {
                  byte var38 = (byte)((var235.hasNext()) ? 1 : 0);
                  if (var38 == (204849534 ^ var257)) {
                     var257 = 765011544 ^ var257;
                     break;
                  }

                  var257 = 1891510157 ^ var257;
                  Object var40 = var235.next();
                  Long var41 = (Long)var40;
                  long var42 = var41;
                  ChunkPos var173 = new ChunkPos(var42);
                  boolean var45 = var15.add(var173);
                  var257 = 1891510157 ^ var257;
               }
            } else {
               label320:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                     case 45424131:
                        var257 ^= 998704699;
                        break label320;
                     case 262258167:
                     default:
                        throw new RuntimeException(new IOException());
                     case 322974092:
                        break label320;
                     case 1448032840:
                  }
               }
            }

            List var175 = List.copyOf(var13);
            this.primeSusRenderSnapshot = var175;
            List var177 = List.copyOf(var14);
            this.primeSusMarkSnapshot = var177;
            List var179 = List.copyOf(var15);
            this.playerChunkRenderSnapshot = var179;
            if (var2 != ((564979494 ^ var257) != 0)) {
               var257 = 852976620 ^ var257;
               ArrayList var50 = new ArrayList();
               List var236 = var50;
               Long2ObjectMap var52 = this.storageByChunk;
               ObjectCollection var53 = var52.values();
               ObjectIterator var54 = var53.iterator();
               ObjectIterator var238 = var54;
               var257 = 1402564794 ^ var257;

               label310:
               while (true) {
                  byte var56 = (byte)((var238.hasNext()) ? 1 : 0);
                  if (var56 == (1088615536 ^ var257)) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                           case 230160763:
                              var257 ^= 1326921163;
                              break label310;
                           case 331783067:
                           default:
                              throw new RuntimeException(new IOException());
                           case 402502954:
                              break;
                           case 1574917882:
                              break label310;
                        }
                     }
                  }

                  var257 = 1134312245 ^ var257;
                  Object var58 = var238.next();
                  List var59 = (List)var58;
                  boolean var61 = var236.addAll(var59);
                  int var63 = var236.size();
                  short var181 = (short)(58641989 ^ var257);
                  if (var63 >= var181) {
                     var257 = 1803505418 ^ var257;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                           case 159547544:
                              var257 ^= 1744060916;
                              break label310;
                           case 632342500:
                              break;
                           case 1214007964:
                              break label310;
                           case 1216328073:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }

                  var257 = 2018338871 ^ var257;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                        case 246706015:
                           var257 ^= 1003574018;
                        case 903939366:
                           continue label310;
                        case 1646881446:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1675076709:
                     }
                  }
               }

               int var65 = var236.size();
               short var182 = (short)(267763899 ^ var257);
               if (var65 > var182) {
                  var257 = 1187982157 ^ var257;
                  byte var183 = (byte)(1228598006 ^ var257);
                  short var222 = (short)(1228598262 ^ var257);
                  List var67 = var236.subList(var183, var222);
                  var236 = var67;
                  var257 = 614685267 ^ var257;
               } else {
                  var257 = 1651274014 ^ var257;
               }

               List var185 = List.copyOf((Collection)var236);
               this.storageRenderSnapshot = var185;

               label275:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                     case 7582346:
                        break label275;
                     case 72985510:
                        var257 ^= 1648661559;
                        break label275;
                     case 1005464573:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1886094731:
                  }
               }
            } else {
               label268:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                     case 20897397:
                        var257 ^= 1552581141;
                     case 139732273:
                        break label268;
                     case 1224224481:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1793602636:
                  }
               }

               List var218 = List.of();
               this.storageRenderSnapshot = var218;
               var257 = 1929068961 ^ var257;
            }

            ArrayList var69 = new ArrayList();
            ArrayList var237 = var69;
            Long2ObjectMap var71 = this.blockEspByChunk;
            ObjectCollection var72 = var71.values();
            ObjectIterator var73 = var72.iterator();
            ObjectIterator var239 = var73;
            var257 = 660163165 ^ var257;

            List var201;
            label260:
            while (true) {
               byte var75 = (byte)((var239.hasNext()) ? 1 : 0);
               if (var75 == (679767759 ^ var257)) {
                  label255:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                        case 88513797:
                        default:
                           throw new RuntimeException(new IOException());
                        case 137052157:
                           break label255;
                        case 243318325:
                           var257 ^= 1200126388;
                           break label255;
                        case 834895511:
                     }
                  }

                  byte var188 = (byte)((var237.isEmpty()) ? 1 : 0);
                  List var217;
                  if (var188 != (1863063419 ^ var257)) {
                     var257 = 2053835751 ^ var257;
                     var217 = List.of();

                     label246:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                           case 158847497:
                              var257 ^= 2066394700;
                              break label246;
                           case 163464107:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1671965834:
                              break label246;
                           case 2145311205:
                        }
                     }
                  } else {
                     var257 = 700638857 ^ var257;
                     var217 = List.copyOf(var237);
                     var257 = 679691042 ^ var257;
                  }

                  this.blockEspRenderSnapshot = var217;
                  if (var4 != ((1850585808 ^ var257) != 0)) {
                     var257 = 1216675117 ^ var257;
                     ArrayList var141 = new ArrayList();
                     ArrayList var242 = var141;
                     Long2ObjectMap var143 = this.spawnersByChunk;
                     ObjectCollection var144 = var143.values();
                     ObjectIterator var145 = var144.iterator();
                     ObjectIterator var247 = var145;
                     var257 = 1538415423 ^ var257;

                     label236:
                     while (true) {
                        byte var147 = (byte)((var247.hasNext()) ? 1 : 0);
                        if (var147 == (2105218242 ^ var257)) {
                           label220:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                                 case 52299084:
                                    var257 ^= 431113137;
                                 case 1105225064:
                                    break label220;
                                 case 1627155634:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1762346018:
                              }
                           }

                           List var214 = List.copyOf(var242);
                           this.spawnerRenderSnapshot = var214;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                                 case 54951335:
                                    var257 ^= 782789622;
                                    break label236;
                                 case 164050113:
                                    break;
                                 case 747380599:
                                    break label236;
                                 case 948026098:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        }

                        var257 ^= 1450725980;
                        Object var150 = var247.next();
                        List var151 = (List)var150;
                        boolean var153 = var242.addAll(var151);

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                              case 55997393:
                                 var257 ^= 1450725980;
                                 continue label236;
                              case 268655582:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 739049683:
                                 break;
                              case 1827954614:
                                 continue label236;
                           }
                        }
                     }
                  } else {
                     var257 = uewqfcyityvzphte(var257, 541346928);
                     List var189 = List.of();
                     this.spawnerRenderSnapshot = var189;
                     var257 = 73974309 ^ var257;
                  }

                  if (var5 != ((1247886469 ^ var257) != 0)) {
                     var257 = 1509720577 ^ var257;
                     ArrayList var128 = new ArrayList();
                     ArrayList var241 = var128;
                     Long2ObjectMap var130 = this.nbtByChunk;
                     ObjectCollection var131 = var130.values();
                     ObjectIterator var132 = var131.iterator();
                     ObjectIterator var246 = var132;
                     var257 = 1452043416 ^ var257;

                     while (true) {
                        byte var134 = (byte)((var246.hasNext()) ? 1 : 0);
                        if (var134 == (1158795804 ^ var257)) {
                           label198:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                                 case 97698311:
                                    var257 ^= 149778543;
                                 case 557547167:
                                    break label198;
                                 case 1423871761:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1896226191:
                              }
                           }

                           List var212 = List.copyOf(var241);
                           this.nbtRenderSnapshot = var212;
                           var257 = uewqfcyityvzphte(var257, 1064270224);
                           break;
                        }

                        var257 = 372903525 ^ var257;
                        Object var136 = var246.next();
                        List var137 = (List)var136;
                        boolean var139 = var241.addAll(var137);
                        var257 = 372903525 ^ var257;
                     }
                  } else {
                     var257 = uewqfcyityvzphte(var257, 607963652);
                     List var190 = List.of();
                     this.nbtRenderSnapshot = var190;
                     var257 = 483274082 ^ var257;
                  }

                  ArrayList var86 = new ArrayList();
                  ArrayList var240 = var86;
                  List var88 = this.mergeSites();
                  if (var6 != ((1922292707 ^ var257) != 0)) {
                     var257 = 34405260 ^ var257;
                     ArrayList var107 = new ArrayList();
                     ArrayList var249 = var107;
                     ArrayList var108 = new ArrayList();
                     ArrayList var253 = var108;
                     Iterator var110 = var88.iterator();
                     Iterator var22 = var110;
                     var257 = 603006523 ^ var257;

                     label188:
                     while (true) {
                        byte var112 = (byte)((var22.hasNext()) ? 1 : 0);
                        if (var112 == (1399719508 ^ var257)) {
                           var257 = 2074142646 ^ var257;
                           List var207 = List.copyOf(var249);
                           this.amethystClusterRenderSnapshot = var207;
                           List var209 = List.copyOf(var253);
                           this.geodeHudRenderSnapshot = var209;
                           var257 = uewqfcyityvzphte(var257, 1564073451);
                           break;
                        }

                        var257 = 859207925 ^ var257;
                        Object var114 = var22.next();
                        a$b var115 = (a$b)var114;
                        byte var117 = (byte)((var115.worthHud()) ? 1 : 0);
                        if (var117 == (1616412321 ^ var257)) {
                           var257 = 1858682947 ^ var257;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                                 case 205088580:
                                    var257 ^= 1577007286;
                                    continue label188;
                                 case 894613143:
                                    break;
                                 case 1031061918:
                                    continue label188;
                                 case 1920572689:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        } else {
                           var257 = 169862130 ^ var257;
                           BlockPos var119 = var115.icon();
                           boolean var121 = var249.add(var119);
                           int var228 = var115.clusterCount();
                           int var231 = var115.clusterCount();
                           List var234 = var115.crystalList();
                           e var203 = new e(var119, var228, var231, var234);
                           boolean var123 = var253.add(var203);
                           List var205 = var115.crystalList();
                           boolean var125 = var240.addAll(var205);

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                                 case 54170436:
                                    break;
                                 case 233482903:
                                    var257 ^= 959027975;
                                    continue label188;
                                 case 1118794595:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1807878279:
                                    continue label188;
                              }
                           }
                        }
                     }
                  } else {
                     var257 = 2049882604 ^ var257;
                     Iterator var91 = var88.iterator();
                     Iterator var20 = var91;
                     var257 = 1883829857 ^ var257;

                     label157:
                     while (true) {
                        byte var93 = (byte)((var20.hasNext()) ? 1 : 0);
                        if (var93 == (2029360238 ^ var257)) {
                           label127:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                                 case 173782880:
                                    var257 ^= 1502627244;
                                    break label127;
                                 case 230294531:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 644342816:
                                    break;
                                 case 1994198932:
                                    break label127;
                              }
                           }

                           List var193 = List.of();
                           this.amethystClusterRenderSnapshot = var193;
                           List var194 = List.of();
                           this.geodeHudRenderSnapshot = var194;
                           var257 = 1418915275 ^ var257;
                           break;
                        }

                        var257 = 1357397209 ^ var257;
                        Object var95 = var20.next();
                        a$b var96 = (a$b)var95;
                        byte var98 = (byte)((var96.worthHud()) ? 1 : 0);
                        if (var98 == (673032375 ^ var257)) {
                           var257 = 378521305 ^ var257;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                                 case 154897255:
                                    var257 ^= 1181219328;
                                 case 611086134:
                                    continue label157;
                                 case 996603836:
                                    break;
                                 case 998835805:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        } else {
                           var257 = uewqfcyityvzphte(var257, 1703395239);
                           List var192 = var96.crystalList();
                           boolean var100 = var240.addAll(var192);

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                                 case 106610997:
                                    var257 ^= 896500606;
                                    continue label157;
                                 case 390178244:
                                    break;
                                 case 1244712700:
                                    continue label157;
                                 case 1988008068:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        }
                     }
                  }

                  List var195 = List.of();
                  this.crystalOverlaySnapshot = var195;
                  if (var3 == ((1979137033 ^ var257) != 0)) {
                     var257 = uewqfcyityvzphte(var257, 1858358908);
                     var201 = List.of();
                     var257 = 491749319 ^ var257;
                     break;
                  }

                  var257 = 1699222892 ^ var257;
                  List var200 = this.playerMarkers;
                  var201 = List.copyOf(var200);

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var257)) {
                        case 7499916:
                           var257 ^= 381887703;
                           break label260;
                        case 563278612:
                        default:
                           throw new RuntimeException(new IOException());
                        case 565815252:
                           break label260;
                        case 884249879:
                     }
                  }
               }

               var257 = 432044284 ^ var257;
               Object var77 = var239.next();
               List var78 = (List)var77;
               boolean var80 = var237.addAll(var78);
               var257 = uewqfcyityvzphte(var257, 432044284);
            }

            this.playerMarkerRenderSnapshot = var201;
            this.lastAmethystClusterIconsEnabled = (boolean)var6;
            byte var198 = (byte)(108793266 ^ var257);
            this.dirty = (var198 != 0);
            return;
         }

         var257 = 1382129193 ^ var257;
         Object var156 = var16.next();
         Entry var157 = (Entry)var156;
         Object var159 = var157.getValue();
         a$a var160 = (a$a)var159;
         int var162 = var160.effectiveFlags();
         int var219 = 1835088937 ^ var257;
         int var164 = var162 & var219;
         if (var164 != (1835613224 ^ var257)) {
            var257 = 1156337665 ^ var257;
            int var166 = var160.likelihood;
            if (var166 <= (696609833 ^ var257)) {
               var257 = 19382855 ^ var257;
               var160.refreshLikelihood();
               var257 = 584636979 ^ var257;
            } else {
               var257 = uewqfcyityvzphte(var257, 603920500);
            }

            long var224 = var157.getLongKey();
            ChunkPos var168 = new ChunkPos(var224);
            boolean var170 = var13.add(var168);
            byte var229 = (byte)(175797340 ^ var257);
            int var233 = var160.siteLikelihood;
            int var230 = Math.max(var229, var233);
            i var221 = new i(var168, var230);
            boolean var172 = var14.add(var221);
            var257 = 399682443 ^ var257;
         } else {
            var257 = uewqfcyityvzphte(var257, 1891755006);
         }

         var257 = 580943319 ^ var257;
      }
   }

   public List<ChunkPos> primeSusRenderSnapshot() {
      int var5 = 1687953526 ^ 715357795 ^ 1358997049;
      var5 = 1867788321 ^ var5;
      return this.primeSusRenderSnapshot;
   }

   public List<i> primeSusMarkSnapshot() {
      int var5 = 1225947488 ^ 1366111588 ^ 1358997049;
      var5 = 1105002 ^ var5;
      return this.primeSusMarkSnapshot;
   }

   public List<ChunkPos> playerChunkRenderSnapshot() {
      int var5 = 51655276 ^ 55058634 ^ 1358997049;
      var5 = 973793848 ^ var5;
      return this.playerChunkRenderSnapshot;
   }

   public List<b> storageRenderSnapshot() {
      int var5 = 1342835295 ^ 622907266 ^ 1358997049;
      var5 = 1858342448 ^ var5;
      return this.storageRenderSnapshot;
   }

   public List<b> blockEspRenderSnapshot() {
      int var5 = 462430743 ^ 1687596846 ^ 1358997049;
      var5 = 987128909 ^ var5;
      return this.blockEspRenderSnapshot;
   }

   public List<h> spawnerRenderSnapshot() {
      int var5 = 35023888 ^ 309230534 ^ 1358997049;
      var5 = 2108360637 ^ var5;
      return this.spawnerRenderSnapshot;
   }

   public List<BlockPos> nbtRenderSnapshot() {
      int var5 = 312135311 ^ 2072455901 ^ 1358997049;
      var5 = 1978031331 ^ var5;
      return this.nbtRenderSnapshot;
   }

   public List<BlockPos> amethystClusterRenderSnapshot() {
      int var5 = 1814231941 ^ 953576330 ^ 1358997049;
      var5 = 1444878610 ^ var5;
      return this.amethystClusterRenderSnapshot;
   }

   public List<e> geodeHudRenderSnapshot() {
      int var5 = 102482139 ^ 49133642 ^ 1358997049;
      var5 = 242219414 ^ var5;
      return this.geodeHudRenderSnapshot;
   }

   public List<d> crystalOverlaySnapshot() {
      int var5 = 1801736509 ^ 113015528 ^ 1358997049;
      var5 = 25739698 ^ var5;
      return this.crystalOverlaySnapshot;
   }

   public synchronized void publishCrystalOverlay(List<d> var1) {
      int var6 = 956458010 ^ 1743273118 ^ 1358997049;
      var6 = 77134873 ^ var6;
      List var3 = List.of();
      this.crystalOverlaySnapshot = var3;
   }

   public List<AABB> playerMarkerRenderSnapshot() {
      int var5 = 1068608594 ^ 1942674559 ^ 1358997049;
      var5 = 1932506060 ^ var5;
      return this.playerMarkerRenderSnapshot;
   }

   public synchronized void clearAll() {
      int var53 = 711614597 ^ 1095343289 ^ 1358997049;
      var53 = 1175329958 ^ var53;
      Long2ObjectMap var3 = this.flagsByChunk;
      var3.clear();
      LongSet var5 = this.playerChunks;
      var5.clear();
      LongSet var7 = this.growthChunks;
      var7.clear();
      LongSet var9 = this.baseDebugChunks;
      var9.clear();
      Long2ObjectMap var11 = this.sitesByChunk;
      var11.clear();
      Long2IntOpenHashMap var13 = this.geodeClearStreak;
      var13.clear();
      Long2IntOpenHashMap var15 = this.crystalClearStreak;
      var15.clear();
      Long2ObjectMap var17 = this.storageByChunk;
      var17.clear();
      Long2ObjectMap var19 = this.blockEspByChunk;
      var19.clear();
      Long2ObjectMap var21 = this.spawnersByChunk;
      var21.clear();
      Long2ObjectMap var23 = this.nbtByChunk;
      var23.clear();
      List var25 = this.playerMarkers;
      var25.clear();
      List var2 = List.of();
      this.primeSusRenderSnapshot = var2;
      List var39 = List.of();
      this.primeSusMarkSnapshot = var39;
      List var40 = List.of();
      this.playerChunkRenderSnapshot = var40;
      List var41 = List.of();
      this.baseDebugRenderSnapshot = var41;
      List var42 = List.of();
      this.storageRenderSnapshot = var42;
      List var43 = List.of();
      this.blockEspRenderSnapshot = var43;
      List var44 = List.of();
      this.spawnerRenderSnapshot = var44;
      List var45 = List.of();
      this.nbtRenderSnapshot = var45;
      List var46 = List.of();
      this.amethystClusterRenderSnapshot = var46;
      List var47 = List.of();
      this.geodeHudRenderSnapshot = var47;
      List var48 = List.of();
      this.crystalOverlaySnapshot = var48;
      List var49 = List.of();
      this.playerMarkerRenderSnapshot = var49;
      byte var50 = (byte)(2083341987 ^ var53);
      this.dirty = (var50 != 0);
      com.wimpyclient.p.f.resetSusSoundCooldown();
   }

   static {
      int var6 = 15460312 ^ 1263363872 ^ Integer.parseInt("756954110");
      int var3 = new Random(-8924005671334326924L).nextInt();
      nTJ9iV63Q4 = -856249660 ^ var3;
      var6 = 1348886004 ^ var6;
      a var0 = new a();
      INSTANCE = var0;
   }

   public static String jeubprnxqm(byte[] var0, int var1) {
      String var13 = Integer.toString(var1);
      byte[] var14 = var13.getBytes();
      byte[] var8 = var14;
      byte var3 = 0;
      byte var16 = var0[var3];
      short var36 = 255;
      int var17 = var16 & var36;
      byte var37 = 24;
      int var18 = var17 << var37;
      byte var4 = 1;
      byte var39 = var0[var4];
      short var68 = 255;
      int var40 = var39 & var68;
      byte var69 = 16;
      int var41 = var40 << var69;
      int var19 = var18 | var41;
      byte var70 = 2;
      byte var43 = var0[var70];
      short var71 = 255;
      int var44 = var43 & var71;
      byte var72 = 8;
      int var45 = var44 << var72;
      int var20 = var19 | var45;
      byte var73 = 3;
      byte var47 = var0[var73];
      short var74 = 255;
      int var48 = var47 & var74;
      int var21 = var20 | var48;
      byte var49 = 4;
      byte var23 = var0[var49];
      short var50 = 255;
      int var24 = var23 & var50;
      byte var51 = 24;
      int var25 = var24 << var51;
      byte var75 = 5;
      byte var53 = var0[var75];
      short var76 = 255;
      int var54 = var53 & var76;
      byte var77 = 16;
      int var55 = var54 << var77;
      int var26 = var25 | var55;
      byte var78 = 6;
      byte var57 = var0[var78];
      short var79 = 255;
      int var58 = var57 & var79;
      byte var80 = 8;
      int var59 = var58 << var80;
      int var27 = var26 | var59;
      byte var81 = 7;
      byte var61 = var0[var81];
      short var82 = 255;
      int var62 = var61 & var82;
      int var28 = var27 | var62;
      String var29 = pwepjiaofa;
      int var84 = var28 + var21;
      String var30 = var29.substring(var28, var84);
      Charset var64 = StandardCharsets.UTF_16BE;
      byte[] var31 = var30.getBytes(var64);
      byte[] var11 = var31;
      byte var32 = 0;
      int var12 = var32;

      while (true) {
         int var66 = var11.length;
         if (var12 >= var66) {
            Charset var91 = StandardCharsets.UTF_16BE;
            return new String(var11, var91);
         }

         byte var85 = var11[var12];
         int var93 = var8.length;
         int var92 = var12 % var93;
         byte var90 = var8[var92];
         int var86 = var85 ^ var90;
         byte var87 = (byte)var86;
         var11[var12] = var87;
         var12++;
      }
   }

   private static byte[] vdytbzodyzneakk() {
      return new byte[0];
   }

   private static int uewqfcyityvzphte(int var0, int var1) {
      return var0 ^ var1;
   }
}
