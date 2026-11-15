package com.wimpyclient.s;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.IdMap;
import net.minecraft.core.IdMapper;
import net.minecraft.core.MappedRegistry;
import net.minecraft.core.QuartPos;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.Holder.Reference;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.HolderLookup.RegistryLookup;
import net.minecraft.core.RegistryAccess.Frozen;
import net.minecraft.core.RegistryAccess.ImmutableRegistryAccess;
import net.minecraft.core.RegistrySetBuilder.RegistryBootstrap;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.Carvers;
import net.minecraft.data.worldgen.NoiseData;
import net.minecraft.data.worldgen.ProcessorLists;
import net.minecraft.data.worldgen.biome.BiomeData;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeManager;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.FeatureSorter;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.MultiNoiseBiomeSourceParameterLists;
import net.minecraft.world.level.biome.BiomeManager.NoiseBiomeSource;
import net.minecraft.world.level.biome.Climate.Sampler;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.CarvingMask;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.PalettedContainerFactory;
import net.minecraft.world.level.chunk.ProtoChunk;
import net.minecraft.world.level.chunk.Strategy;
import net.minecraft.world.level.chunk.UpgradeData;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import net.minecraft.world.level.levelgen.Aquifer;
import net.minecraft.world.level.levelgen.LegacyRandomSource;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseChunk;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseRouterData;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.RandomSupport;
import net.minecraft.world.level.levelgen.WorldGenerationContext;
import net.minecraft.world.level.levelgen.WorldOptions;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.SurfaceRules.RuleSource;
import net.minecraft.world.level.levelgen.blending.Blender;
import net.minecraft.world.level.levelgen.blending.BlendingData;
import net.minecraft.world.level.levelgen.carver.CarvingContext;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.StructureCheck;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class j {
   public static final int MIN_Y = -64;
   public static final int HEIGHT = 384;
   public static final int MAX_Y = 319;
   public final long seed;
   final NoiseBasedChunkGenerator generator;
   final RandomState randomState;
   final MultiNoiseBiomeSource biomeSource;
   final NoiseGeneratorSettings settings;
   private final List<h> specs;
   private final PalettedContainerFactory containers;
   private final StructureManager noStructures;
   private final LevelHeightAccessor height;
   private final long zoomSeed;
   private final Map<Long, BiomeGenerationSettings> carverBiomes;
   private final Map<Long, short[]> storedBiomes;
   private final List<Holder<Biome>> biomeIds;
   private final Map<Holder<Biome>, Integer> biomeIndex;
   private static final int MIN_QUART = -16;
   private static final int QUARTS_Y = 96;
   private static final int MAX_STORED_BIOMES = 4096;
   private static final int MAX_CARVER_BIOMES = 65536;
   private final BiomeManager biomeManager;
   private static final RegistryAccess CARVER_REGISTRIES;
   private static final Set<ResourceKey<Biome>> TALL_TREES;
   private static int xmnyY3Vecz;
   private transient int ewWlFL1yG2;
   private static byte[] dsbtdpxvkv = shpufmncwkmpown();

   private j(long var1) {
super();
      int var184 = 779900339 ^ 894267219;
      
      var184 = 1082560244 ^ var184;
      var184 = 655728046 ^ 1152261207 ^ Integer.parseInt("940324333");
      this.ewWlFL1yG2 = 89731629 ^ xmnyY3Vecz;
      var184 = 1743557514 ^ var184;
      byte var4 = -64;
      short var5 = 384;
      LevelHeightAccessor var77 = LevelHeightAccessor.create(var4, var5);
      this.height = var77;
      ConcurrentHashMap var78 = new ConcurrentHashMap();
      this.carverBiomes = var78;
      ConcurrentHashMap var79 = new ConcurrentHashMap();
      this.storedBiomes = var79;
      IdentityHashMap var80 = new IdentityHashMap();
      this.biomeIndex = var80;
      this.seed = var1;
      RegistrySetBuilder var27 = new RegistrySetBuilder();
      ResourceKey var83 = Registries.CONFIGURED_CARVER;
      RegistryBootstrap var134 = Carvers::bootstrap;
      RegistrySetBuilder var28 = var27.add(var83, var134);
      ResourceKey var84 = Registries.PROCESSOR_LIST;
      RegistryBootstrap var135 = ProcessorLists::bootstrap;
      RegistrySetBuilder var29 = var28.add(var84, var135);
      ResourceKey var85 = Registries.CONFIGURED_FEATURE;
      RegistryBootstrap var136 = FeatureUtils::bootstrap;
      RegistrySetBuilder var30 = var29.add(var85, var136);
      ResourceKey var86 = Registries.PLACED_FEATURE;
      RegistryBootstrap var137 = PlacementUtils::bootstrap;
      RegistrySetBuilder var31 = var30.add(var86, var137);
      ResourceKey var87 = Registries.BIOME;
      RegistryBootstrap var138 = BiomeData::bootstrap;
      RegistrySetBuilder var32 = var31.add(var87, var138);
      ResourceKey var88 = Registries.MULTI_NOISE_BIOME_SOURCE_PARAMETER_LIST;
      RegistryBootstrap var139 = MultiNoiseBiomeSourceParameterLists::bootstrap;
      RegistrySetBuilder var33 = var32.add(var88, var139);
      ResourceKey var89 = Registries.NOISE;
      RegistryBootstrap var140 = NoiseData::bootstrap;
      RegistrySetBuilder var34 = var33.add(var89, var140);
      ResourceKey var90 = Registries.DENSITY_FUNCTION;
      RegistryBootstrap var141 = NoiseRouterData::bootstrap;
      RegistrySetBuilder var35 = var34.add(var90, var141);
      ResourceKey var91 = Registries.NOISE_SETTINGS;
      RegistryBootstrap var142 = NoiseGeneratorSettings::bootstrap;
      RegistrySetBuilder var36 = var35.add(var91, var142);
      Registry var92 = BuiltInRegistries.REGISTRY;
      Frozen var93 = RegistryAccess.fromRegistryOfRegistries(var92);
      Provider var37 = var36.build(var93);
      ResourceKey var94 = Registries.NOISE_SETTINGS;
      RegistryLookup var39 = var37.lookupOrThrow(var94);
      ResourceKey var95 = NoiseGeneratorSettings.OVERWORLD;
      Reference var40 = var39.getOrThrow(var95);
      Object var97 = var40.value();
      NoiseGeneratorSettings var98 = (NoiseGeneratorSettings)var97;
      this.settings = var98;
      NoiseGeneratorSettings var100 = this.settings;
      ResourceKey var6 = Registries.NOISE;
      RegistryLookup var144 = var37.lookupOrThrow(var6);
      RandomState var101 = RandomState.create(var100, var144, var1);
      this.randomState = var101;
      ResourceKey var102 = Registries.MULTI_NOISE_BIOME_SOURCE_PARAMETER_LIST;
      RegistryLookup var44 = var37.lookupOrThrow(var102);
      ResourceKey var103 = MultiNoiseBiomeSourceParameterLists.OVERWORLD;
      Reference var45 = var44.getOrThrow(var103);
      MultiNoiseBiomeSource var105 = MultiNoiseBiomeSource.createFromPreset(var45);
      this.biomeSource = var105;
      MultiNoiseBiomeSource var154 = this.biomeSource;
      NoiseBasedChunkGenerator var106 = new NoiseBasedChunkGenerator(var154, var40);
      this.generator = var106;
      MultiNoiseBiomeSource var49 = this.biomeSource;
      Set var50 = var49.possibleBiomes();
      List var51 = List.copyOf(var50);
      Function var108 = var1x -> {
         int var9x = 1461841833 ^ 59322190 ^ 889291123;
         var9x = 1146847823 ^ var9x;
         NoiseBasedChunkGenerator var4x = this.generator;
         BiomeGenerationSettings var5x = var4x.getBiomeGenerationSettings((Holder<Biome>)var1x);
         return var5x.features();
      };
      boolean var145 = true;
      List var53 = FeatureSorter.buildFeaturesPerStep(var51, var108, var145);
      IdentityHashMap var54 = new IdentityHashMap();
      ResourceKey var109 = Registries.PLACED_FEATURE;
      RegistryLookup var56 = var37.lookupOrThrow(var109);
      Stream var57 = var56.listElements();
      Consumer var111 = var1x -> {
         int var13 = 1405267453 ^ 627710170 ^ 811119454;
         var13 = 808010615 ^ var13;
         Object var6x = ((Holder)var1x).value();
         PlacedFeature var7 = (PlacedFeature)var6x;
         ResourceKey var8x = (ResourceKey)((Holder)var1x).unwrapKey().orElse(null);
         Identifier var9x = var8x.identifier();
         String var10 = var9x.getPath();
         Object var5x = var54.put(var7, var10);
      };
      var57.forEach(var111);
      NoiseBasedChunkGenerator var156 = this.generator;
      Function var165 = var1x -> {
         int var9x = 1752493236 ^ 842596527 ^ 811119454;
         var9x = 1403829481 ^ var9x;
         String var4x = wvouiihlmv(xgwyxbaxhcesext(), var9x);
         Object var5x = var54.getOrDefault(var1x, var4x);
         return (String)var5x;
      };
      byte var8 = -64;
      short var9 = 319;
      List var113 = h.derive(var53, var51, var156, var165, var8, var9);
      this.specs = var113;
      ResourceKey var114 = Registries.BIOME;
      RegistryLookup var60 = var37.lookupOrThrow(var114);
      ResourceKey var115 = Biomes.PLAINS;
      Reference var61 = var60.getOrThrow(var115);
      ArrayList var62 = new ArrayList(var51);
      boolean var64 = var62.contains(var61);
      if (!var64) {
         var184 = 1555570161 ^ var184;
         boolean var66 = var62.add(var61);
         var184 = 1441689614 ^ var184;
      } else {
         var184 = 156659199 ^ var184;
      }

      List var119 = List.copyOf(var62);
      this.biomeIds = var119;
      byte var68 = 0;
      int var21 = var68;
      var184 = 1835891880 ^ var184;

      while (true) {
         List var121 = this.biomeIds;
         int var122 = var121.size();
         if (var21 >= var122) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var184)) {
                  case 188363333:
                     var184 = 473875194 ^ var184;
                  case 1056763728:
                     IdMapper var157 = Block.BLOCK_STATE_REGISTRY;
                     Strategy var158 = Strategy.createForBlockStates(var157);
                     Block var166 = Blocks.AIR;
                     BlockState var167 = var166.defaultBlockState();
                     Object var174 = null;
                     IdMap var177 = listIds(var62);
                     Strategy var178 = Strategy.createForBiomes(var177);
                     Object var11 = null;
                     PalettedContainerFactory var123 = new PalettedContainerFactory(var158, var167, (Codec)var174, var178, var61, (Codec)var11);
                     this.containers = var123;
                     PalettedContainerFactory var160 = this.containers;
                     LevelHeightAccessor var169 = this.height;
                     LevelAccessor var161 = emptyLevel(var160, var169);
                     boolean var181 = false;
                     boolean var12 = false;
                     WorldOptions var170 = new WorldOptions(var1, var181, var12);
                     Object var175 = null;
                     StructureManager var124 = new StructureManager(var161, var170, (StructureCheck)var175);
                     this.noStructures = var124;
                     long var127 = BiomeManager.obfuscateSeed(var1);
                     this.zoomSeed = var127;
                     NoiseBiomeSource var163 = this::storedBiome;
                     long var172 = this.zoomSeed;
                     BiomeManager var129 = new BiomeManager(var163, var172);
                     this.biomeManager = var129;
                     return;
                  case 738740558:
                  default:
                     throw new RuntimeException();
                  case 2015582146:
               }
            }
         }

         var184 = 1658333242 ^ var184;
         Map var75 = this.biomeIndex;
         List var131 = this.biomeIds;
         Object var132 = var131.get(var21);
         Holder var133 = (Holder)var132;
         Integer var150 = var21;
         Object var76 = var75.put(var133, var150);
         var21++;
         var184 = 1658333242 ^ var184;
      }
   }

   public static j create(long var0) {
      int var6 = 1737984519 ^ 1865784489 ^ 811119454;
      var6 = 1492275396 ^ var6;
      return new j(var0);
   }

   public List<h> specs() {
      int var5 = 223754651 ^ 1832397229 ^ 889291123;
      var5 = 1820441042 ^ var5;
      return this.specs;
   }

   public int treeAllowance(int var1, int var2) {
      int var46 = 1883747216 ^ 1510905885 ^ 889291123;
      var46 = 754477752 ^ var46;
      byte var3 = (byte)(-867221575 ^ var46);
      int var7 = var3;
      var46 = 1945196540 ^ var46;

      label84:
      while (true) {
         byte var4 = (byte)(1078040507 ^ var46);
         if (var7 <= var4) {
            var46 = 1724812508 ^ var46;
            byte var13 = (byte)(-646912871 ^ var46);
            int var8 = var13;
            var46 = 1516884121 ^ var46;

            label68:
            while (true) {
               byte var32 = (byte)(2095500286 ^ var46);
               if (var8 > var32) {
                  var46 = elghheduhogkjaxi(var46, 1604572900);
                  var7 += 591731994 ^ var46;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                        case 72731425:
                           var46 ^= 1661242017;
                           continue label84;
                        case 1188336651:
                        default:
                           throw new IllegalStateException();
                        case 1278035186:
                           continue label84;
                        case 1972835738:
                     }
                  }
               }

               var46 = 1111787482 ^ var46;
               int var16 = var1 + var7;
               byte var34 = (byte)(1050823713 ^ var46);
               int var17 = var16 << var34;
               byte var35 = (byte)(1050823725 ^ var46);
               int var18 = var17 + var35;
               int var9 = var18;
               int var20 = var2 + var8;
               byte var37 = (byte)(1050823713 ^ var46);
               int var21 = var20 << var37;
               byte var38 = (byte)(1050823725 ^ var46);
               int var22 = var21 + var38;
               int var10 = var22;
               byte var23 = (byte)(1050823705 ^ var46);
               int var11 = var23;
               var46 = 957155578 ^ var46;

               while (true) {
                  short var39 = (short)(128926813 ^ var46);
                  if (var11 > var39) {
                     label53:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                           case 120870718:
                              var46 ^= 1320473739;
                              break label53;
                           case 230386685:
                           default:
                              throw new IllegalStateException();
                           case 843206788:
                              break;
                           case 1770036889:
                              break label53;
                        }
                     }

                     var8 += 1226543189 ^ var46;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                           case 19594047:
                           default:
                              throw new IllegalStateException();
                           case 228929209:
                              var46 ^= 905796523;
                           case 1019807327:
                              continue label68;
                           case 2036329163:
                        }
                     }
                  }

                  var46 = 743858803 ^ var46;
                  Holder var26 = this.biomeAt(var9, var11, var10);
                  Optional var27 = var26.unwrapKey();
                  Set var41 = TALL_TREES;
                  Object var43 = Objects.requireNonNull(var41);
                  Predicate var42 = var41::contains;
                  Optional var28 = var27.filter(var42);
                  byte var29 = (byte)((var28.isPresent()) ? 1 : 0);
                  if (var29 != (737748652 ^ var46)) {
                     var46 = 801650036 ^ var46;
                     return e.TALL_TREE_ALLOWANCE;
                  }

                  var46 = elghheduhogkjaxi(var46, 1572301390);
                  var11 += 1984842984 ^ var46;
                  var46 = elghheduhogkjaxi(var46, 1910573117);
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var46)) {
                  case 209671609:
                     var46 = 171262307 ^ var46;
                     return e.TREE_ALLOWANCE;
                  case 674329757:
                     return e.TREE_ALLOWANCE;
                  case 868439751:
                  default:
                     throw new IllegalStateException();
                  case 2139175874:
               }
            }
         }
      }
   }

   public Holder<Biome> biomeAt(int var1, int var2, int var3) {
      int var13 = 2694252 ^ 844082273 ^ 889291123;
      var13 = 1240183109 ^ var13;
      BiomeManager var9 = this.biomeManager;
      BlockPos var5 = new BlockPos(var1, var2, var3);
      return var9.getBiome(var5);
   }

   Holder<Biome> storedBiome(int var1, int var2, int var3) {
      int var40 = 1804229882 ^ 1258970895 ^ 889291123;
      var40 = 153918846 ^ var40;
      byte var4 = (byte)(-481107960 ^ var40);
      byte var6 = (byte)(481107895 ^ var40);
      int var18 = Math.min(var2, var6);
      int var11 = Math.max(var4, var18);
      int var20 = QuartPos.toSection(var1);
      int var24 = QuartPos.toSection(var3);
      short[] var13 = this.storedBiomes(var20, var24);
      List var15 = this.biomeIds;
      byte var7 = (byte)(-481107960 ^ var40);
      int var26 = var11 - var7;
      byte var31 = (byte)(481107964 ^ var40);
      int var27 = var26 * var31;
      byte var8 = (byte)(481107963 ^ var40);
      int var33 = var3 & var8;
      int var28 = var27 + var33;
      byte var34 = (byte)(481107964 ^ var40);
      int var29 = var28 * var34;
      byte var37 = (byte)(481107963 ^ var40);
      int var36 = var1 & var37;
      int var30 = var29 + var36;
      short var22 = var13[var30];
      Object var16 = var15.get(var22);
      return (Holder<Biome>)var16;
   }

   private short[] storedBiomes(int var1, int var2) {
      int var35 = 637993057 ^ 1879311829 ^ 889291123;
      var35 = 289982896 ^ var35;
      long var13 = ChunkPos.asLong(var1, var2);
      Map var16 = this.storedBiomes;
      Long var26 = var13;
      Object var17 = var16.get(var26);
      short[] var18 = (short[])var17;
      if (var18 != null) {
         var35 = 1365742127 ^ var35;
         return var18;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var35)) {
               case 151805249:
               default:
                  throw new RuntimeException();
               case 225412188:
                  var35 = 2071135837 ^ var35;
               case 176296082:
                  ChunkPos var5 = new ChunkPos(var1, var2);
                  UpgradeData var28 = UpgradeData.EMPTY;
                  LevelHeightAccessor var30 = this.height;
                  PalettedContainerFactory var32 = this.containers;
                  Object var8 = null;
                  ProtoChunk var20 = new ProtoChunk(var5, var28, var30, var32, (BlendingData)var8);
                  return this.fillBiomes(var20);
               case 518908556:
            }
         }
      }
   }

   private short[] fillBiomes(ProtoChunk var1) {
      int var87 = 1795496261 ^ 196166870 ^ 889291123;
      var87 = 792218834 ^ var87;
      NoiseBasedChunkGenerator var15 = this.generator;
      RandomState var49 = this.randomState;
      Blender var4 = Blender.empty();
      StructureManager var78 = this.noStructures;
      CompletableFuture var16 = var15.createBiomes(var49, var4, var78, var1);
      Object var17 = var16.join();
      ChunkStatus var50 = ChunkStatus.BIOMES;
      var1.setPersistedStatus(var50);
      ChunkPos var20 = var1.getPos();
      int var21 = var20.getMinBlockX();
      int var22 = QuartPos.fromBlock(var21);
      int var8 = var22;
      ChunkPos var24 = var1.getPos();
      int var25 = var24.getMinBlockZ();
      int var26 = QuartPos.fromBlock(var25);
      int var9 = var26;
      short var27 = (short)(2056099378 ^ var87);
      short[] var28 = new short[var27];
      short[] var10 = var28;
      byte var29 = (byte)(2056097842 ^ var87);
      int var11 = var29;
      var87 = 1259204423 ^ var87;

      label71:
      while (true) {
         byte var51 = (byte)(830504725 ^ var87);
         if (var11 >= var51) {
            var87 = 1146829065 ^ var87;
            Map var41 = this.storedBiomes;
            int var42 = var41.size();
            short var61 = (short)(1977308796 ^ var87);
            if (var42 > var61) {
               var87 = 1869345357 ^ var87;
               Map var44 = this.storedBiomes;
               var44.clear();
               var87 = 383368570 ^ var87;
            } else {
               var87 = elghheduhogkjaxi(var87, 2041728823);
            }

            Map var46 = this.storedBiomes;
            ChunkPos var63 = var1.getPos();
            long var64 = var63.toLong();
            Long var66 = var64;
            Object var47 = var46.put(var66, var10);
            return var10;
         }

         var87 = 1675708517 ^ var87;
         byte var31 = (byte)(1382102800 ^ var87);
         int var12 = var31;
         var87 = 1890748169 ^ var87;

         while (true) {
            byte var52 = (byte)(584298525 ^ var87);
            if (var12 >= var52) {
               var87 = 649671381 ^ var87;
               var11 += 74089165 ^ var87;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var87)) {
                     case 69459701:
                        var87 ^= 904592825;
                        continue label71;
                     case 583082753:
                        break;
                     case 1255431382:
                     default:
                        throw new IllegalStateException();
                     case 1638053551:
                        continue label71;
                  }
               }
            }

            var87 = 201150720 ^ var87;
            byte var33 = (byte)(690938137 ^ var87);
            int var13 = var33;
            var87 = 279750723 ^ var87;

            while (true) {
               byte var53 = (byte)(964839774 ^ var87);
               if (var13 >= var53) {
                  var87 = elghheduhogkjaxi(var87, 1748829747);
                  var12 += 1371492200 ^ var87;
                  var87 = elghheduhogkjaxi(var87, 1936523120);
                  break;
               }

               var87 = 2063263859 ^ var87;
               Map var36 = this.biomeIndex;
               int var68 = var8 + var13;
               byte var80 = (byte)(-1131979047 ^ var87);
               int var81 = var80 + var11;
               int var84 = var9 + var12;
               Holder var55 = var1.getNoiseBiome(var68, var81, var84);
               Object var37 = var36.get(var55);
               Integer var38 = (Integer)var37;
               byte var69 = (byte)(1131979053 ^ var87);
               int var57 = var11 * var69;
               int var58 = var57 + var12;
               byte var71 = (byte)(1131979053 ^ var87);
               int var59 = var58 * var71;
               int var60 = var59 + var13;
               int var75;
               if (var38 == null) {
                  var87 = 689543224 ^ var87;
                  var75 = (byte)(1784756497 ^ var87);

                  label52:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var87)) {
                        case 69288978:
                           break;
                        case 236729585:
                           var87 ^= 1784458157;
                        case 255023484:
                           break label52;
                        case 1914411128:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               } else {
                  label62:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var87)) {
                        case 45742919:
                           var87 ^= 1133058676;
                        case 511507986:
                           break label62;
                        case 1320482470:
                           break;
                        case 1697013809:
                        default:
                           throw new IllegalStateException();
                     }
                  }

                  var75 = var38;
                  var87 = 13380065 ^ var87;
               }

               short var76 = (short)var75;
               var10[var60] = var76;
               var13 += 4035261 ^ var87;
               var87 = elghheduhogkjaxi(var87, 968874982);
            }
         }
      }
   }

   public ProtoChunk generateTerrain(int var1, int var2) {
      int var53 = 255563268 ^ 2002422536 ^ 889291123;
      var53 = 1032265096 ^ var53;
      ChunkPos var4 = new ChunkPos(var1, var2);
      UpgradeData var33 = UpgradeData.EMPTY;
      LevelHeightAccessor var39 = this.height;
      PalettedContainerFactory var46 = this.containers;
      Object var7 = null;
      ProtoChunk var3 = new ProtoChunk(var4, var33, var39, var46, (BlendingData)var7);
      short[] var11 = this.fillBiomes(var3);
      NoiseBasedChunkGenerator var13 = this.generator;
      Blender var24 = Blender.empty();
      RandomState var31 = this.randomState;
      StructureManager var35 = this.noStructures;
      CompletableFuture var14 = var13.fillFromNoise(var24, var31, var35, var3);
      Object var15 = var14.join();
      ChunkStatus var25 = ChunkStatus.NOISE;
      var3.setPersistedStatus(var25);
      NoiseBasedChunkGenerator var18 = this.generator;
      NoiseBasedChunkGenerator var42 = this.generator;
      WorldGenerationContext var32 = new WorldGenerationContext(var42, var3);
      RandomState var37 = this.randomState;
      StructureManager var44 = this.noStructures;
      BiomeManager var49 = this.biomeManager;
      Object var50 = null;
      Blender var8 = Blender.empty();
      var18.buildSurface(var3, var32, var37, var44, var49, (Registry)var50, var8);
      ChunkStatus var27 = ChunkStatus.SURFACE;
      var3.setPersistedStatus(var27);
      this.carve(var3);
      ChunkStatus var29 = ChunkStatus.CARVERS;
      var3.setPersistedStatus(var29);
      return var3;
   }

   public l terrain(int var1, int var2) {
      int var10 = 1432072523 ^ 656039108 ^ 889291123;
      var10 = 2096222070 ^ var10;
      ProtoChunk var6 = this.generateTerrain(var1, var2);
      return l.of(var6);
   }

   void carve(ProtoChunk var1) {
      int var121 = 1408647391 ^ 1112330240 ^ 889291123;
      var121 = 253655033 ^ var121;
      Map var26 = this.carverBiomes;
      int var27 = var26.size();
      int var3 = 732194389 ^ var121;
      if (var27 > var3) {
         var121 = 710162564 ^ var121;
         Map var29 = this.carverBiomes;
         var29.clear();
         var121 = 1741430566 ^ var121;
      } else {
         var121 = elghheduhogkjaxi(var121, 1301817250);
      }

      NoiseBiomeSource var81 = (var1x, var2, var3x) -> {
         int var15x = 1567320689 ^ 1877269382 ^ 889291123;
         var15x = 1162292534 ^ var15x;
         MultiNoiseBiomeSource var9 = this.biomeSource;
         RandomState var11x = this.randomState;
         Sampler var12x = var11x.sampler();
         return var9.getNoiseBiome(var1x, var2, var3x, var12x);
      };
      long var91 = this.zoomSeed;
      BiomeManager var30 = new BiomeManager(var81, var91);
      BiomeManager var11 = var30;
      long var6 = RandomSupport.generateUniqueSeed();
      LegacyRandomSource var82 = new LegacyRandomSource(var6);
      WorldgenRandom var31 = new WorldgenRandom(var82);
      WorldgenRandom var12 = var31;
      ChunkPos var33 = var1.getPos();
      ChunkPos var13 = var33;
      Function var67 = var0 -> {
         int var5 = 126826231 ^ 114270064 ^ 811119454;
         var5 = 170177871 ^ var5;
         String var2 = wvouiihlmv(nbxhqaronqzndkl(), var5);
         IllegalStateException var1x = new IllegalStateException(var2);
         throw var1x;
      };
      NoiseChunk var35 = var1.getOrCreateNoiseChunk(var67);
      Aquifer var37 = var35.aquifer();
      Aquifer var15 = var37;
      NoiseBasedChunkGenerator var84 = this.generator;
      RegistryAccess var93 = CARVER_REGISTRIES;
      LevelHeightAccessor var107 = var1.getHeightAccessorForGeneration();
      RandomState var114 = this.randomState;
      NoiseGeneratorSettings var116 = this.settings;
      RuleSource var117 = var116.surfaceRule();
      CarvingContext var38 = new CarvingContext(var84, var93, var107, var35, var114, var117);
      CarvingContext var16 = var38;
      CarvingMask var40 = var1.getOrCreateCarvingMask();
      CarvingMask var17 = var40;
      byte var41 = (byte)(-1715290609 ^ var121);
      int var18 = var41;
      var121 = 2105021654 ^ var121;

      while (true) {
         byte var68 = (byte)(457528617 ^ var121);
         if (var18 > var68) {
            var121 = elghheduhogkjaxi(var121, 2128462959);
            return;
         }

         var121 = 790355508 ^ var121;
         byte var43 = (byte)(-878611219 ^ var121);
         int var19 = var43;
         var121 = 1876432287 ^ var121;

         while (true) {
            byte var69 = (byte)(1535549058 ^ var121);
            if (var19 > var69) {
               label39:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var121)) {
                     case 22317229:
                        var121 ^= 1462331456;
                        break label39;
                     case 501328982:
                     default:
                        throw new RuntimeException();
                     case 964657991:
                        break;
                     case 1056169247:
                        break label39;
                  }
               }

               var18 += 212858571 ^ var121;
               var121 = elghheduhogkjaxi(var121, 401253355);
               break;
            }

            var121 = 932057791 ^ var121;
            int var86 = var13.x;
            int var87 = var86 + var18;
            int var96 = var13.z;
            int var97 = var96 + var19;
            ChunkPos var45 = new ChunkPos(var87, var97);
            ChunkPos var20 = var45;
            Map var47 = this.carverBiomes;
            long var71 = var45.toLong();
            Long var73 = var71;
            Function var89 = var2 -> {
               int var21 = 583874824 ^ 2027387189 ^ 889291123;
               var21 = 234771075 ^ var21;
               NoiseBasedChunkGenerator var9 = this.generator;
               MultiNoiseBiomeSource var11x = this.biomeSource;
               int var13x = var45.getMinBlockX();
               int var14 = QuartPos.fromBlock(var13x);
               byte var6x = (byte)(1659212749 ^ var21);
               int var15x = var45.getMinBlockZ();
               int var16x = QuartPos.fromBlock(var15x);
               RandomState var17x = this.randomState;
               Sampler var18x = var17x.sampler();
               Holder var12x = var11x.getNoiseBiome(var14, var6x, var16x, var18x);
               return var9.getBiomeGenerationSettings(var12x);
            };
            Object var48 = var47.computeIfAbsent(var73, var89);
            BiomeGenerationSettings var49 = (BiomeGenerationSettings)var48;
            byte var50 = (byte)(1812499509 ^ var121);
            int var22 = var50;
            Iterable var52 = var49.getCarvers();
            Iterator var53 = var52.iterator();
            Iterator var23 = var53;
            var121 = 183451353 ^ var121;

            label57:
            while (true) {
               byte var55 = (byte)((var23.hasNext()) ? 1 : 0);
               if (var55 == (1726460652 ^ var121)) {
                  label66:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var121)) {
                        case 123767886:
                           var121 ^= 665126407;
                           break label66;
                        case 167946987:
                        default:
                           throw new RuntimeException();
                        case 516352654:
                           break;
                        case 1503185254:
                           break label66;
                     }
                  }

                  var19 += 1094890730 ^ var121;
                  var121 = elghheduhogkjaxi(var121, 449063521);
                  break;
               }

               var121 = 346983169 ^ var121;
               Object var57 = var23.next();
               Holder var58 = (Holder)var57;
               long var75 = this.seed;
               long var100 = var22;
               long var77 = var75 + var100;
               int var103 = var20.x;
               int var110 = var20.z;
               var12.setLargeFeatureSeed(var77, var103, var110);
               Object var61 = var58.value();
               ConfiguredWorldCarver var62 = (ConfiguredWorldCarver)var61;
               byte var64 = (byte)((var62.isStartChunk(var12)) ? 1 : 0);
               if (var64 != (1917401581 ^ var121)) {
                  var121 = 206048094 ^ var121;
                  Object var111 = Objects.requireNonNull(var11);
                  Function<BlockPos, Holder<Biome>> var105 = var11::getBiome;
                  boolean var66 = var62.carve(var16, var1, var105, var12, var15, var20, var17);
                  var121 = 73902094 ^ var121;
               } else {
                  var121 = elghheduhogkjaxi(var121, 137339728);
               }

               var22 += 2053544636 ^ var121;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var121)) {
                     case 220639656:
                        var121 ^= 478226513;
                        continue label57;
                     case 257220796:
                        break;
                     case 808527191:
                        continue label57;
                     case 1461643805:
                     default:
                        throw new RuntimeException();
                  }
               }
            }
         }
      }
   }

   private static IdMap<Holder<Biome>> listIds(final List<Holder<Biome>> var0) {
      int var21 = 1903210216 ^ 960062401 ^ 811119454;
      var21 = 1928434332 ^ var21;
      IdentityHashMap var1 = new IdentityHashMap();
      final IdentityHashMap var4 = var1;
      byte var6 = (byte)(182512875 ^ var21);
      int var5 = var6;
      var21 = 1640696279 ^ var21;

      label38:
      while (true) {
         int var12 = var0.size();
         if (var5 < var12) {
            var21 ^= 1503221950;
            Object var14 = var0.get(var5);
            Holder var15 = (Holder)var14;
            Integer var17 = var5;
            Object var9 = var4.put(var15, var17);
            var5 += 850574723 ^ var21;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var21)) {
                  case 37387673:
                     var21 ^= 1503221950;
                     continue label38;
                  case 1018435527:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1626325430:
                     break;
                  case 1651551757:
                     continue label38;
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var21)) {
                  case 93753789:
                     return new IdMap<Holder<Biome>>() {
                        private static int VNaD2wf6V2;
                        private transient int f592rOJiPj0;
                        private static byte[] dtcqronbie = wuxabwjqzytmqgi();

                        {
                           int var10 = 750826148 ^ 1862687747;
                           var10 = nomadlclzpupgnil(var10, 977173424);
                           var10 = 1830027983 ^ 1168180359 ^ Integer.parseInt("1364038495");
                           this.f592rOJiPj0 = 23903229 ^ VNaD2wf6V2;
                           var10 = nomadlclzpupgnil(var10, 1512351498);
                        }

                        public int getId(Holder<Biome> var1) {
                           int var13 = 908273222 ^ 1917964261 ^ 1836740941;
                           var13 = 1461797109 ^ var13;
                           Map var5x = var4;
                           Object var6x = var5x.get(var1);
                           Integer var7 = (Integer)var6x;
                           if (var7 != null) {
                              var13 = nomadlclzpupgnil(var13, 933319526);
                              int var19 = var7;
                              var13 = 703239101 ^ var13;
                              return var19;
                           } else {
                              var13 = 809003995 ^ var13;
                              byte var10 = (byte)(-1309782977 ^ var13);

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
                                    case 121766485:
                                       var13 = 779332352 ^ var13;
                                       return var10;
                                    case 793560070:
                                       return var10;
                                    case 1369645384:
                                    default:
                                       throw new RuntimeException(new IOException());
                                    case 1726503511:
                                 }
                              }
                           }
                        }

                        public Holder<Biome> byId(int var1) {
                           int var14 = 1577198036 ^ 318884169 ^ 1836740941;
                           var14 = 1139214113 ^ var14;
                           if (var1 >= (1671339761 ^ var14)) {
                              var14 = 1106869170 ^ var14;
                              List var9 = var0;
                              int var10 = var9.size();
                              if (var1 < var10) {
                                 var14 = 1813676530 ^ var14;
                                 List var7 = var0;
                                 Object var8 = var7.get(var1);
                                 Holder var5x = (Holder)var8;
                                 var14 = nomadlclzpupgnil(var14, 1227366374);
                                 return var5x;
                              }

                              var14 = 1381254421 ^ var14;
                           } else {
                              var14 = 330120871 ^ var14;
                           }

                           Object var21x = null;
                           var14 = 2003229441 ^ var14;
                           return (Holder<Biome>)var21x;
                        }

                        public int size() {
                           int var6x = 713923815 ^ 222321613 ^ 1836740941;
                           var6x = 1300901924 ^ var6x;
                           List var2 = var0;
                           return var2.size();
                        }

                        public Iterator<Holder<Biome>> iterator() {
                           int var6x = 1458069327 ^ 2071135663 ^ 1836740941;
                           var6x = 485445135 ^ var6x;
                           List var2 = var0;
                           return var2.iterator();
                        }

                        static {
                           int var3 = new Random(-8189088704578653747L).nextInt();
                           VNaD2wf6V2 = 2141627635 ^ var3;
                        }

                        public static String rxjeugyqfa(byte[] var0x, int var1x) {
                           String var10 = Integer.toString(var1x);
                           byte[] var11 = var10.getBytes();
                           byte[] var8 = var11;
                           byte var12x = 0;
                           int var9 = var12x;

                           while (true) {
                              int var17 = var0x.length;
                              if (var9 >= var17) {
                                 Charset var5x = StandardCharsets.UTF_16;
                                 return new String(var0x, var5x);
                              }

                              byte var20 = var0x[var9];
                              int var33 = var8.length;
                              int var30 = var9 % var33;
                              byte var27 = var8[var30];
                              int var21x = var20 ^ var27;
                              byte var22 = (byte)var21x;
                              var0x[var9] = var22;
                              byte var23 = var0x[var9];
                              byte[] var28 = dtcqronbie;
                              byte[] var34 = dtcqronbie;
                              int var35 = var34.length;
                              int var32 = var9 % var35;
                              byte var29 = var28[var32];
                              int var24 = var23 ^ var29;
                              byte var25 = (byte)var24;
                              var0x[var9] = var25;
                              var9++;
                           }
                        }

                        private static byte[] wuxabwjqzytmqgi() {
                           return new byte[]{
                              60,
                              91,
                              39,
                              71,
                              70,
                              31,
                              80,
                              90,
                              72,
                              68,
                              65,
                              31,
                              123,
                              47,
                              22,
                              50,
                              37,
                              60,
                              19,
                              98,
                              20,
                              28,
                              5,
                              91,
                              39,
                              83,
                              17,
                              110,
                              85,
                              87,
                              126,
                              112,
                              75,
                              79,
                              56,
                              32,
                              72,
                              118,
                              45,
                              98,
                              56,
                              78,
                              1,
                              25,
                              116,
                              53,
                              48,
                              122,
                              98,
                              118,
                              12,
                              27,
                              11,
                              18,
                              44,
                              29,
                              49,
                              118,
                              5,
                              116,
                              103,
                              41,
                              78,
                              12,
                              109,
                              64,
                              87,
                              100,
                              48,
                              31,
                              11,
                              74,
                              24,
                              26,
                              118,
                              89,
                              89,
                              37,
                              9
                           };
                        }

                        private static int nomadlclzpupgnil(int var0x, int var1x) {
                           return var1x ^ var0x;
                        }
                     };
                  case 262498063:
                     var21 = 90996448 ^ var21;
                     return new IdMap<Holder<Biome>>() {
                        private static int VNaD2wf6V2;
                        private transient int f592rOJiPj0;
                        private static byte[] dtcqronbie = wuxabwjqzytmqgi();

                        {
                           int var10 = 750826148 ^ 1862687747;
                           var10 = nomadlclzpupgnil(var10, 977173424);
                           var10 = 1830027983 ^ 1168180359 ^ Integer.parseInt("1364038495");
                           this.f592rOJiPj0 = 23903229 ^ VNaD2wf6V2;
                           var10 = nomadlclzpupgnil(var10, 1512351498);
                        }

                        public int getId(Holder<Biome> var1) {
                           int var13 = 908273222 ^ 1917964261 ^ 1836740941;
                           var13 = 1461797109 ^ var13;
                           Map var5x = var4;
                           Object var6x = var5x.get(var1);
                           Integer var7 = (Integer)var6x;
                           if (var7 != null) {
                              var13 = nomadlclzpupgnil(var13, 933319526);
                              int var19 = var7;
                              var13 = 703239101 ^ var13;
                              return var19;
                           } else {
                              var13 = 809003995 ^ var13;
                              byte var10 = (byte)(-1309782977 ^ var13);

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
                                    case 121766485:
                                       var13 = 779332352 ^ var13;
                                       return var10;
                                    case 793560070:
                                       return var10;
                                    case 1369645384:
                                    default:
                                       throw new RuntimeException(new IOException());
                                    case 1726503511:
                                 }
                              }
                           }
                        }

                        public Holder<Biome> byId(int var1) {
                           int var14 = 1577198036 ^ 318884169 ^ 1836740941;
                           var14 = 1139214113 ^ var14;
                           if (var1 >= (1671339761 ^ var14)) {
                              var14 = 1106869170 ^ var14;
                              List var9 = var0;
                              int var10 = var9.size();
                              if (var1 < var10) {
                                 var14 = 1813676530 ^ var14;
                                 List var7 = var0;
                                 Object var8 = var7.get(var1);
                                 Holder var5x = (Holder)var8;
                                 var14 = nomadlclzpupgnil(var14, 1227366374);
                                 return var5x;
                              }

                              var14 = 1381254421 ^ var14;
                           } else {
                              var14 = 330120871 ^ var14;
                           }

                           Object var21x = null;
                           var14 = 2003229441 ^ var14;
                           return (Holder<Biome>)var21x;
                        }

                        public int size() {
                           int var6x = 713923815 ^ 222321613 ^ 1836740941;
                           var6x = 1300901924 ^ var6x;
                           List var2 = var0;
                           return var2.size();
                        }

                        public Iterator<Holder<Biome>> iterator() {
                           int var6x = 1458069327 ^ 2071135663 ^ 1836740941;
                           var6x = 485445135 ^ var6x;
                           List var2 = var0;
                           return var2.iterator();
                        }

                        static {
                           int var3 = new Random(-8189088704578653747L).nextInt();
                           VNaD2wf6V2 = 2141627635 ^ var3;
                        }

                        public static String rxjeugyqfa(byte[] var0x, int var1x) {
                           String var10 = Integer.toString(var1x);
                           byte[] var11 = var10.getBytes();
                           byte[] var8 = var11;
                           byte var12x = 0;
                           int var9 = var12x;

                           while (true) {
                              int var17 = var0x.length;
                              if (var9 >= var17) {
                                 Charset var5x = StandardCharsets.UTF_16;
                                 return new String(var0x, var5x);
                              }

                              byte var20 = var0x[var9];
                              int var33 = var8.length;
                              int var30 = var9 % var33;
                              byte var27 = var8[var30];
                              int var21x = var20 ^ var27;
                              byte var22 = (byte)var21x;
                              var0x[var9] = var22;
                              byte var23 = var0x[var9];
                              byte[] var28 = dtcqronbie;
                              byte[] var34 = dtcqronbie;
                              int var35 = var34.length;
                              int var32 = var9 % var35;
                              byte var29 = var28[var32];
                              int var24 = var23 ^ var29;
                              byte var25 = (byte)var24;
                              var0x[var9] = var25;
                              var9++;
                           }
                        }

                        private static byte[] wuxabwjqzytmqgi() {
                           return new byte[]{
                              60,
                              91,
                              39,
                              71,
                              70,
                              31,
                              80,
                              90,
                              72,
                              68,
                              65,
                              31,
                              123,
                              47,
                              22,
                              50,
                              37,
                              60,
                              19,
                              98,
                              20,
                              28,
                              5,
                              91,
                              39,
                              83,
                              17,
                              110,
                              85,
                              87,
                              126,
                              112,
                              75,
                              79,
                              56,
                              32,
                              72,
                              118,
                              45,
                              98,
                              56,
                              78,
                              1,
                              25,
                              116,
                              53,
                              48,
                              122,
                              98,
                              118,
                              12,
                              27,
                              11,
                              18,
                              44,
                              29,
                              49,
                              118,
                              5,
                              116,
                              103,
                              41,
                              78,
                              12,
                              109,
                              64,
                              87,
                              100,
                              48,
                              31,
                              11,
                              74,
                              24,
                              26,
                              118,
                              89,
                              89,
                              37,
                              9
                           };
                        }

                        private static int nomadlclzpupgnil(int var0x, int var1x) {
                           return var1x ^ var0x;
                        }
                     };
                  case 1346311141:
                     break;
                  case 1426312318:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      }
   }

   private static LevelAccessor emptyLevel(PalettedContainerFactory var0, LevelHeightAccessor var1) {
      int var25 = 1091696124 ^ 1842168015 ^ 811119454;
      var25 = 1252249268 ^ var25;
      byte var4 = (byte)(1445447897 ^ var25);
      byte var5 = (byte)(1445447897 ^ var25);
      ChunkPos var3 = new ChunkPos(var4, var5);
      UpgradeData var18 = UpgradeData.EMPTY;
      Object var6 = null;
      ProtoChunk var2 = new ProtoChunk(var3, var18, var1, var0, (BlendingData)var6);
      InvocationHandler var10 = (var1x, var2x, var3x) -> {
         int var51 = 234496065 ^ 647038694 ^ 811119454;
         var51 = 618212409 ^ var51;
         Class var9 = var2x.getDeclaringClass();
         Class<Object> var5x = Object.class;
         if (var9 != var5x) {
            var51 = elghheduhogkjaxi(var51, 1595870430);
            Class<ChunkAccess> var10x = ChunkAccess.class;
            Class var38 = var2x.getReturnType();
            byte var11x = (byte)((var10x.isAssignableFrom(var38)) ? 1 : 0);
            if (var11x != (1626715422 ^ var51)) {
               var51 = 838502670 ^ var51;
               int var13x = var2x.getParameterCount();
               byte var39 = (byte)(1359952916 ^ var51);
               if (var13x == var39) {
                  var51 = 1910173013 ^ var51;
                  return var2;
               }

               var51 = elghheduhogkjaxi(var51, 201883436);
            } else {
               var51 = elghheduhogkjaxi(var51, 1039332898);
            }

            byte var16x = (byte)((var2x.isDefault()) ? 1 : 0);
            if (var16x != (1560757052 ^ var51)) {
               var51 = 423894699 ^ var51;
               return InvocationHandler.invokeDefault(var1x, var2x, var3x);
            } else {
               var51 = elghheduhogkjaxi(var51, 1633381205);
               String var46 = String.valueOf(var2x);
               String var47 = "structure-free level: " + var46;
               UnsupportedOperationException var19x = new UnsupportedOperationException(var47);
               throw var19x;
            }
         } else {
            var51 = 155340231 ^ var51;
            String var21x = var2x.getName();
            byte var22 = (byte)(-917042184 ^ var51);
            byte var8 = var22;
            int var24 = var21x.hashCode();

            labelSW_var51: switch (var24) {
               case -1295482945 -> {
                  label57:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var51)) {
                        case 166162021:
                           var51 ^= 622472152;
                        case 291781886:
                           break label57;
                        case 609533281:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1490867194:
                     }
                  }

                  String var44 = wvouiihlmv(jwcvtohqkddrxne(), var51);
                  byte var35 = (byte)((var21x.equals(var44)) ? 1 : 0);
                  if (var35 != (330489823 ^ var51)) {
                     var51 = 220238626 ^ var51;
                     byte var36 = (byte)(512904445 ^ var51);
                     var8 = var36;
                   {
                      var51 = 996348188 ^ var51;
                      break labelSW_var51;
                   }
                  } else {
                   {
                      var51 = 910393918 ^ var51;
                      break labelSW_var51;
                   }
                  }
               }
               case 147696667 -> {
                  label64:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var51)) {
                        case 166162021:
                           var51 ^= 1663177060;
                           break label64;
                        case 332431013:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1551344837:
                           break;
                        case 1940331163:
                           break label64;
                     }
                  }

                  String var41 = wvouiihlmv(zzejwhzkzwuewkq(), var51);
                  byte var26x = (byte)((var21x.equals(var41)) ? 1 : 0);
                  if (var26x != (1435166051 ^ var51)) {
                     var51 = 526589315 ^ var51;
                     byte var27 = (byte)(1256847585 ^ var51);
                     var8 = var27;
                   {
                      var51 = 1863886081 ^ var51;
                      break labelSW_var51;
                   }
                  } else {
                   {
                      var51 = elghheduhogkjaxi(var51, 1887156354);
                      break labelSW_var51;
                   }
                  }
               }
               default -> {
                  var51 = 324643302 ^ var51;
                  break labelSW_var51;
               }
            }

            Object var33;
            switch (var8) {
               case 0:
                  var51 = 889565256 ^ var51;
                  byte var48 = (byte)(284487081 ^ var51);
                  Object var43 = var3x[var48];
                  byte var30;
                  if (var1x == var43) {
                     var51 = 414789825 ^ var51;
                     var30 = (byte)(139320681 ^ var51);
                     var51 = 1541832089 ^ var51;
                  } else {
                     var51 = elghheduhogkjaxi(var51, 413089880);
                     var30 = (byte)(141274609 ^ var51);
                     var51 = 1539312896 ^ var51;
                  }

                  var33 = Boolean.valueOf((var30 != 0));
                  var51 = 1061957653 ^ var51;
                  break;
               case 1:
                  var51 = 1887359641 ^ var51;
                  int var32 = System.identityHashCode(var1x);
                  var33 = var32;
                  var51 = elghheduhogkjaxi(var51, 963125148);
                  break;
               default:
                  var51 = elghheduhogkjaxi(var51, 1634835735);
                  var33 = wvouiihlmv(jdlfcwvdzmlhojq(), var51);
                  var51 = 677859346 ^ var51;
            }

            return var33;
         }
      };
      Class<LevelAccessor> var11 = LevelAccessor.class;
      ClassLoader var12 = var11.getClassLoader();
      byte var15 = (byte)(1445447896 ^ var25);
      Class[] var16 = new Class[var15];
      byte var19 = (byte)(1445447897 ^ var25);
      Class<LevelAccessor> var21 = LevelAccessor.class;
      var16[var19] = var21;
      Object var13 = Proxy.newProxyInstance(var12, var16, var10);
      return (LevelAccessor)var13;
   }

   static {
      int var18 = 1563197198 ^ 927183692 ^ Integer.parseInt("940324333");
      int var15 = new Random(5833843276958260438L).nextInt();
      xmnyY3Vecz = -1544759096 ^ var15;
      var18 = 1956442470 ^ var18;
      ResourceKey var2 = Registries.BIOME;
      Lifecycle var3 = Lifecycle.stable();
      MappedRegistry var1 = new MappedRegistry(var2, var3);
      Registry var7 = var1.freeze();
      List var8 = List.of(var7);
      ImmutableRegistryAccess var0 = new ImmutableRegistryAccess(var8);
      CARVER_REGISTRIES = var0;
      ResourceKey var4 = Biomes.JUNGLE;
      ResourceKey var6 = Biomes.BAMBOO_JUNGLE;
      ResourceKey var9 = Biomes.SPARSE_JUNGLE;
      ResourceKey var10 = Biomes.OLD_GROWTH_PINE_TAIGA;
      ResourceKey var11 = Biomes.OLD_GROWTH_SPRUCE_TAIGA;
      ResourceKey var12 = Biomes.MANGROVE_SWAMP;
      Set var5 = Set.of(var4, var6, var9, var10, var11, var12);
      TALL_TREES = var5;
   }

   public static String wvouiihlmv(byte[] var0, int var1) {
      String var8 = Integer.toString(var1);
      byte[] var9 = var8.getBytes();
      byte[] var6 = var9;
      byte var10 = 0;
      int var7 = var10;

      while (true) {
         int var15 = var0.length;
         if (var7 >= var15) {
            Charset var29 = StandardCharsets.UTF_16;
            return new String(var0, var29);
         }

         byte var18 = var0[var7];
         int var33 = var6.length;
         int var30 = var7 % var33;
         byte var26 = var6[var30];
         int var19 = var18 ^ var26;
         byte var20 = (byte)var19;
         var0[var7] = var20;
         byte var21 = var0[var7];
         byte[] var27 = dsbtdpxvkv;
         byte[] var34 = dsbtdpxvkv;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] shpufmncwkmpown() {
      return new byte[]{
         44,
         81,
         48,
         75,
         24,
         118,
         53,
         47,
         44,
         110,
         29,
         58,
         127,
         40,
         27,
         62,
         100,
         83,
         73,
         11,
         84,
         16,
         106,
         29,
         76,
         125,
         107,
         4,
         51,
         122,
         110,
         35,
         18,
         99,
         29,
         112,
         49,
         99,
         20,
         41,
         79,
         47,
         79,
         10,
         122,
         118,
         3,
         109,
         69,
         122,
         111,
         18,
         66,
         20,
         46,
         50,
         117,
         55,
         58,
         103,
         78,
         125,
         84,
         50,
         56,
         9,
         25,
         109,
         9,
         50,
         91,
         111,
         53,
         52,
         54,
         100,
         101,
         54,
         9,
         8,
         115,
         12,
         114,
         27,
         78,
         33,
         112,
         55,
         14,
         101,
         28,
         57,
         23,
         115,
         39,
         46,
         88,
         110,
         37,
         122,
         89,
         72,
         26,
         4,
         20,
         120,
         95,
         107,
         58,
         80,
         92
      };
   }

   private static byte[] zzejwhzkzwuewkq() {
      return new byte[]{-29, -102, 3, 22, 41, 33, 3, 108, 25, 55, 44, 77, 76, 114, 42, 108, 82, 6};
   }

   private static byte[] jdlfcwvdzmlhojq() {
      return new byte[]{
         -29,
         -97,
         4,
         33,
         42,
         43,
         13,
         124,
         21,
         62,
         44,
         92,
         75,
         126,
         41,
         116,
         92,
         9,
         112,
         91,
         101,
         70,
         94,
         65,
         126,
         43,
         83,
         28,
         10,
         43,
         95,
         127,
         38,
         42,
         47,
         60,
         9,
         44,
         45,
         81,
         126,
         123,
         123,
         69,
         72,
         43,
         59,
         55
      };
   }

   private static byte[] jwcvtohqkddrxne() {
      return new byte[]{-31, -99, 0, 26, 32, 62, 13, 104, 31, 60, 46, 102, 75, 99};
   }

   private static byte[] nbxhqaronqzndkl() {
      return new byte[]{
         -21,
         -105,
         3,
         16,
         43,
         37,
         13,
         104,
         24,
         33,
         36,
         96,
         71,
         117,
         41,
         97,
         81,
         71,
         112,
         80,
         103,
         77,
         89,
         73,
         116,
         39,
         95,
         79,
         10,
         44,
         86,
         48,
         32,
         47,
         40,
         44,
         8,
         63,
         39,
         49,
         124,
         115,
         119,
         80,
         78,
         38,
         58,
         45,
         125,
         44,
         93,
         10,
         119,
         70,
         23,
         98,
         70,
         99,
         9,
         57
      };
   }

   private static byte[] xgwyxbaxhcesext() {
      return new byte[]{-21, -104, 8, 64};
   }

   private static int elghheduhogkjaxi(int var0, int var1) {
      return var1 ^ var0;
   }
}
