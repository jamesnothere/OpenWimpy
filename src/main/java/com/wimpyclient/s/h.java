package com.wimpyclient.s;

import java.util.Objects;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.FeatureSorter.StepFeatureData;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration.TargetBlockState;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class h {
   private final String id;
   private final int step;
   private final int index;
   private final int order;
   private final int countMin;
   private final int countMax;
   private final int rarity;
   private final boolean trapezoid;
   private final int yMin;
   private final int yMax;
   private final int plateau;
   private final int size;
   private final float discard;
   private final byte kind;
   private final Set<Holder<Biome>> biomes;
   private static final int[] STEPS;
   private static int BUXHOHJX4A;
   private transient int D5H3nCYAxx;
   private static byte[] qzwoksrerp = xafwvntjpdeoiwh();

   public h(
      String id,
      int step,
      int index,
      int order,
      int countMin,
      int countMax,
      int rarity,
      boolean trapezoid,
      int yMin,
      int yMax,
      int plateau,
      int size,
      float discard,
      byte kind,
      Set<Holder<Biome>> biomes
   ) {
super();
      int var49 = 1697945071 ^ 573773719;
      
      var49 = 1714325750 ^ var49;
      var49 = 362845013 ^ 2143890930 ^ Integer.parseInt("1262531625");
      this.D5H3nCYAxx = 488451127 ^ BUXHOHJX4A;
      var49 = 949540090 ^ var49;
      this.id = id;
      this.step = step;
      this.index = index;
      this.order = order;
      this.countMin = countMin;
      this.countMax = countMax;
      this.rarity = rarity;
      this.trapezoid = trapezoid;
      this.yMin = yMin;
      this.yMax = yMax;
      this.plateau = plateau;
      this.size = size;
      this.discard = discard;
      this.kind = kind;
      this.biomes = biomes;
   }

   public int reach() {
      int var15 = 32331946 ^ 857979682 ^ 355231258;
      var15 = 1395336064 ^ var15;
      int var3 = this.size;
      float var4 = var3;
      float var2 = 16.0F;
      float var5 = var4 / var2;
      float var10 = 2.0F;
      float var6 = var5 * var10;
      float var11 = 1.0F;
      float var7 = var6 + var11;
      float var12 = 2.0F;
      float var8 = var7 / var12;
      return Mth.ceil(var8);
   }

   public int halfWidth() {
      int var12 = 1401221045 ^ 842499174 ^ 355231258;
      var12 = 474444935 ^ var12;
      int var3 = this.size;
      float var4 = var3;
      float var2 = 8.0F;
      float var5 = var4 / var2;
      int var6 = Mth.ceil(var5);
      int var9 = this.reach();
      return var6 + var9;
   }

   public boolean drawsOnTerrain() {
      int var12 = 204322374 ^ 1714210704 ^ 355231258;
      var12 = 967602867 ^ var12;
      float var3 = this.discard;
      float var2 = 0.0F;
      float var19;
      int var4 = (var19 = var3 - var2) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
      if (var4 > (1182885247 ^ var12)) {
         var12 = 1698862741 ^ var12;
         float var6 = this.discard;
         float var9 = 1.0F;
         float var20;
         int var7 = (var20 = var6 - var9) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
         if (var7 < (600044522 ^ var12)) {
            var12 = 476148373 ^ var12;
            byte var8 = (byte)(1067614590 ^ var12);
            var12 = iocceggpjfhemsgs(var12, 863547103);
            return (var8 != 0);
         }

         var12 = 195026741 ^ var12;
      } else {
         var12 = iocceggpjfhemsgs(var12, 1859996064);
      }

      byte var21 = (byte)(677129439 ^ var12);
      var12 = 612762495 ^ var12;
      return (var21 != 0);
   }

   int sampleCount(o var1) {
      int var26 = 2017511619 ^ 1036265362 ^ 355231258;
      var26 = 1963365543 ^ var26;
      int var5 = this.rarity;
      if (var5 > (632167916 ^ var26)) {
         var26 = 1794299633 ^ var26;
         float var7 = var1.nextFloat();
         float var3 = 1.0F;
         int var20 = this.rarity;
         float var21 = var20;
         float var15 = var3 / var21;
         float var38;
         int var8 = (var38 = var7 - var15) == 0.0F ? 0 : (var38 < 0.0F ? -1 : 1);
         byte var9;
         if (var8 < (1331481373 ^ var26)) {
            var26 = 585939952 ^ var26;
            var9 = (byte)(1840279788 ^ var26);
            var26 = iocceggpjfhemsgs(var26, 403937725);
         } else {
            var26 = iocceggpjfhemsgs(var26, 1092160956);
            var9 = (byte)(239453857 ^ var26);
            var26 = 2078683121 ^ var26;
         }

         return var9;
      } else {
         var26 = 1194344718 ^ var26;
         int var11 = this.countMin;
         int var17 = this.countMax;
         int var13;
         if (var11 == var17) {
            var26 = 258338518 ^ var26;
            var13 = this.countMin;
            var26 = 1364627243 ^ var26;
         } else {
            var26 = iocceggpjfhemsgs(var26, 31213340);
            int var19 = this.countMin;
            int var23 = this.countMax;
            var13 = var1.between(var19, var23);
            var26 = 1609508577 ^ var26;
         }

         return var13;
      }
   }

   int sampleY(o var1) {
      int var56 = 1623549549 ^ 375284676 ^ 355231258;
      var56 = 2053617784 ^ var56;
      int var9 = this.yMin;
      int var32 = this.yMax;
      if (var9 > var32) {
         var56 = 21945195 ^ var56;
         return this.yMin;
      } else {
         var56 = 1967651755 ^ var56;
         byte var11 = (byte)((this.trapezoid) ? 1 : 0);
         if (var11 == (1821843552 ^ var56)) {
            var56 = 662322061 ^ var56;
            int var34 = this.yMin;
            int var48 = this.yMax;
            return var1.between(var34, var48);
         } else {
            var56 = iocceggpjfhemsgs(var56, 1349816049);
            int var15 = this.yMax;
            int var36 = this.yMin;
            int var16 = var15 - var36;
            int var18 = this.plateau;
            if (var18 >= var16) {
               var56 = 1599586318 ^ var56;
               int var39 = this.yMin;
               int var50 = this.yMax;
               return var1.between(var39, var50);
            } else {
               var56 = 741967935 ^ var56;
               int var41 = this.plateau;
               int var22 = var16 - var41;
               byte var42 = (byte)(282732204 ^ var56);
               int var23 = var22 / var42;
               int var25 = var16 - var23;
               int var27 = this.yMin;
               byte var51 = (byte)(282732206 ^ var56);
               int var45 = var1.between(var51, var25);
               int var28 = var27 + var45;
               byte var52 = (byte)(282732206 ^ var56);
               int var47 = var1.between(var52, var23);
               return var28 + var47;
            }
         }
      }
   }

   boolean inBiome(Holder<Biome> var1) {
      int var11 = 1083140735 ^ 2044239061 ^ 355231258;
      var11 = 2051457902 ^ var11;
      Set var4 = this.biomes;
      if (var4 != null) {
         var11 = 735209976 ^ var11;
         Set var6 = this.biomes;
         byte var7 = (byte)((var6.contains(var1)) ? 1 : 0);
         if (var7 == (2112829990 ^ var11)) {
            var11 = iocceggpjfhemsgs(var11, 1919742924);
            byte var8 = (byte)(260295146 ^ var11);
            var11 = 420574643 ^ var11;
            return (var8 != 0);
         }

         var11 = 152103666 ^ var11;
      } else {
         var11 = 583172874 ^ var11;
      }

      byte var18 = (byte)(1962922197 ^ var11);

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var11)) {
            case 45076581:
               var11 = 1651338381 ^ var11;
               return (var18 != 0);
            case 575006463:
               break;
            case 609702517:
               return (var18 != 0);
            case 1116171498:
            default:
               throw new IllegalStateException();
         }
      }
   }

   @Override
   public String toString() {
      int var10 = 1234921372 ^ 635604662 ^ 355231258;
      var10 = 616199825 ^ var10;
      String var4 = this.id;
      int var6 = this.step;
      int var7 = this.index;
      return var4 + "(" + var6 + ":" + var7 + ")";
   }

   static List<h> derive(List<StepFeatureData> var0, List<Holder<Biome>> var1, ChunkGenerator var2, Function<PlacedFeature, String> var3, int var4, int var5) {
      int var99 = 357992056 ^ 722936574 ^ 137447981;
      var99 = 451500044 ^ var99;
      checkTags();
      ArrayList var6 = new ArrayList();
      ArrayList var15 = var6;
      int[] var29 = STEPS;
      int[] var16 = var29;
      int var31 = var29.length;
      int var17 = var31;
      byte var32 = (byte)(748271271 ^ var99);
      int var18 = var32;
      var99 = 1769719739 ^ var99;

      while (true) {
         if (var18 < var17) {
            var99 = 1625658478 ^ var99;
            int var35 = var16[var18];
            int var19 = var35;
            int var79 = var0.size();
            if (var35 < var79) {
               var99 = 949002363 ^ var99;
               Object var38 = var0.get(var35);
               StepFeatureData var39 = (StepFeatureData)var38;
               List var40 = var39.features();
               List var20 = var40;
               byte var41 = (byte)(496452873 ^ var99);
               int var21 = var41;
               var99 = 1024788103 ^ var99;

               while (true) {
                  int var82 = var20.size();
                  if (var21 >= var82) {
                     var99 = 830066341 ^ var99;
                     break;
                  }

                  var99 = 1012229153 ^ var99;
                  Object var44 = var20.get(var21);
                  PlacedFeature var45 = (PlacedFeature)var44;
                  PlacedFeature var22 = var45;
                  Holder var47 = var45.feature();
                  Object var48 = var47.value();
                  ConfiguredFeature var49 = (ConfiguredFeature)var48;
                  Feature var51 = var49.feature();
                  Feature var84 = Feature.ORE;
                  if (var51 != var84) {
                     var99 = iocceggpjfhemsgs(var99, 22452545);
                  } else {
                     var99 = 1108696323 ^ var99;
                     FeatureConfiguration var53 = var49.config();
                     OreConfiguration var54 = (OreConfiguration)var53;
                     Object var56 = var3.apply(var45);
                     String var57 = (String)var56;
                     IdentityHashMap var58 = new IdentityHashMap();
                     Set var59 = Collections.newSetFromMap(var58);
                     Set var26 = var59;
                     Iterator var61 = var1.iterator();
                     Iterator var27 = var61;
                     var99 = 1739563954 ^ var99;

                     while (true) {
                        byte var63 = (byte)((var27.hasNext()) ? 1 : 0);
                        if (var63 == (963500318 ^ var99)) {
                           var99 = 874363998 ^ var99;
                           int var91 = var15.size();
                           int var92 = var26.size();
                           int var95 = var1.size();
                           Set var94;
                           if (var92 == var95) {
                              var99 = 744565921 ^ var99;
                              var94 = null;

                              label56:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                                    case 1138226:
                                       var99 ^= 121011802;
                                       break label56;
                                    case 1007851474:
                                       break;
                                    case 1482298791:
                                    default:
                                       throw new IllegalStateException();
                                    case 1984943562:
                                       break label56;
                                 }
                              }
                           } else {
                              label49:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                                    case 168413532:
                                       var99 ^= 1715420572;
                                       break label49;
                                    case 788738953:
                                    default:
                                       throw new IllegalStateException();
                                    case 895252397:
                                       break;
                                    case 1408429762:
                                       break label49;
                                 }
                              }

                              var94 = Set.copyOf(var26);
                              var99 = 1298689895 ^ var99;
                           }

                           h var87 = read(var57, var19, var21, var91, var22, var54, var94, var4, var5);
                           boolean var65 = var15.add(var87);
                           var99 = 1000769877 ^ var99;
                           break;
                        }

                        var99 = 14006956 ^ var99;
                        Object var67 = var27.next();
                        Holder var68 = (Holder)var67;
                        BiomeGenerationSettings var70 = var2.getBiomeGenerationSettings(var68);
                        byte var71 = (byte)((var70.hasFeature(var22)) ? 1 : 0);
                        if (var71 != (968385458 ^ var99)) {
                           var99 = 1676603005 ^ var99;
                           boolean var73 = var26.add(var68);
                           var99 = 706574103 ^ var99;
                        } else {
                           var99 = 1240701290 ^ var99;
                        }

                        var99 = iocceggpjfhemsgs(var99, 1227236294);
                     }
                  }

                  var21 += 495042287 ^ var99;
                  var99 = iocceggpjfhemsgs(var99, 1023671648);
               }
            } else {
               label79:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                     case 129984907:
                        var99 ^= 888957017;
                        break label79;
                     case 346441017:
                        break;
                     case 757816833:
                     default:
                        throw new IllegalStateException();
                     case 1811984243:
                        break label79;
                  }
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var99)) {
                  case 124190404:
                     var99 = 285060903 ^ var99;
                     return List.copyOf(var15);
                  case 261529019:
                     break;
                  case 385817591:
                     return List.copyOf(var15);
                  case 1050544539:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var18 += 301698346 ^ var99;
         var99 = 1410989111 ^ var99;
      }
   }

   private static h read(String var0, int var1, int var2, int var3, PlacedFeature var4, OreConfiguration var5, Set<Holder<Biome>> var6, int var7, int var8) {
      int var201 = 843315242 ^ 895139795 ^ 137447981;
      var201 = 1314272869 ^ var201;
      List var37 = var4.placement();
      int var39 = var37.size();
      byte var10 = (byte)(1098791861 ^ var201);
      if (var39 != var10) {
         var201 = 835582072 ^ var201;
         int var175 = var37.size();
         String var176 = "placement " + var175 + " modifiers";
         IllegalStateException var130 = unsupported(var0, var176);
         throw new RuntimeException(var130);
      } else {
         int var28;
         JsonObject var76;
         int var93;
         byte var99;
         int var191;
         int var192;
         label240: {
            JsonObject var41;
            label206: {
               var201 = iocceggpjfhemsgs(var201, 225858745);
               byte var11 = (byte)(1275621128 ^ var201);
               Object var132 = var37.get(var11);
               PlacementModifier var133 = (PlacementModifier)var132;
               var41 = json(var0, var133);
               byte var42 = (byte)(1275621128 ^ var201);
               var28 = var42;
               String var44 = type(var41);
               byte var46 = (byte)(-1275621129 ^ var201);
               byte var31 = var46;
               int var48 = var44.hashCode();

               labelSW_var201: switch (var48) {
                  case -1148868350 -> {
                     var201 = iocceggpjfhemsgs(var201, 1514670012);
                     String var173 = qzmsznxwui(pxtakrfpncrsghr(), var201);
                     byte var127 = (byte)((var44.equals(var173)) ? 1 : 0);
                     if (var127 != (373319860 ^ var201)) {
                        var201 = 2070061009 ^ var201;
                        byte var128 = (byte)(1831008101 ^ var201);
                        var31 = var128;
                      {
                         var201 = iocceggpjfhemsgs(var201, 1199381160);
                         break labelSW_var201;
                      }
                     } else {
                      {
                         var201 = iocceggpjfhemsgs(var201, 1008698745);
                         break labelSW_var201;
                      }
                     }
                  }
                  case 890604927 -> {
                     label196:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                           case 55581463:
                              var201 ^= 1914722755;
                              break label196;
                           case 800010025:
                              break;
                           case 854466817:
                           default:
                              throw new RuntimeException();
                           case 1444305750:
                              break label196;
                        }
                     }

                     String var134 = qzmsznxwui(exymoiaoficyyht(), var201);
                     byte var50 = (byte)((var44.equals(var134)) ? 1 : 0);
                     if (var50 != (1042822859 ^ var201)) {
                        var201 = 1813729593 ^ var201;
                        byte var51 = (byte)(1379100659 ^ var201);
                        var31 = var51;
                      {
                         var201 = 2020379199 ^ var201;
                         break labelSW_var201;
                      }
                     } else {
                      {
                         var201 = iocceggpjfhemsgs(var201, 343399174);
                         break labelSW_var201;
                      }
                     }
                  }
                  default -> {
                     var201 = 1717011141 ^ var201;
                     break labelSW_var201;
                  }
               }

               label189:
               switch (var31) {
                  case 0:
                     label172:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                           case 35256034:
                              var201 ^= 1726827999;
                              break label172;
                           case 832827820:
                              break;
                           case 1039704009:
                           default:
                              throw new RuntimeException();
                           case 1924758543:
                              break label172;
                        }
                     }

                     String var163 = qzmsznxwui(xuefyzmjmsfilts(), var201);
                     JsonElement var106 = var41.get(var163);
                     byte var108 = (byte)((var106.isJsonPrimitive()) ? 1 : 0);
                     if (var108 != (1286774802 ^ var201)) {
                        var201 = 1239375619 ^ var201;
                        int var123 = var106.getAsInt();
                        var192 = var123;
                        var191 = var123;
                        var201 = iocceggpjfhemsgs(var201, 176224271);
                     } else {
                        var201 = 934508804 ^ var201;
                        JsonObject var110 = var106.getAsJsonObject();
                        String var112 = type(var110);
                        String var164 = qzmsznxwui(pspssscpqkbrvoh(), var201);
                        byte var113 = (byte)((var112.equals(var164)) ? 1 : 0);
                        if (var113 == (2063718678 ^ var201)) {
                           var201 = 1953048072 ^ var201;
                           String var168 = String.valueOf(var110);
                           String var169 = "count " + var168;
                           IllegalStateException var121 = unsupported(var0, var169);
                           throw new RuntimeException(var121);
                        }

                        var201 = 1278246216 ^ var201;
                        String var165 = qzmsznxwui(zeegdgfnisyyalu(), var201);
                        JsonElement var115 = var110.get(var165);
                        int var116 = var115.getAsInt();
                        var191 = var116;
                        String var166 = qzmsznxwui(vtlbjehsfpnaciq(), var201);
                        JsonElement var118 = var110.get(var166);
                        int var119 = var118.getAsInt();
                        var192 = var119;
                        var201 = iocceggpjfhemsgs(var201, 953983808);
                     }
                     break;
                  case 1:
                     var201 = iocceggpjfhemsgs(var201, 888024544);
                     byte var53 = (byte)(514965548 ^ var201);
                     var192 = var53;
                     byte var54 = (byte)(514965548 ^ var201);
                     var191 = var54;
                     String var135 = qzmsznxwui(eivbkacquxbwwzu(), var201);
                     JsonElement var56 = var41.get(var135);
                     int var57 = var56.getAsInt();
                     var28 = var57;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                           case 192445158:
                              var201 ^= 291292979;
                              break label189;
                           case 471248297:
                              break;
                           case 687544618:
                              break label189;
                           case 1403503705:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  default:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                           case 35256034:
                              var201 = 271479969 ^ var201;
                           case 665781456:
                              break label206;
                           case 848999734:
                              break;
                           case 1918129173:
                           default:
                              throw new RuntimeException();
                        }
                     }
               }

               byte var177 = (byte)(267192095 ^ var201);
               Object var137 = var37.get(var177);
               PlacementModifier var138 = (PlacementModifier)var137;
               JsonObject var59 = json(var0, var138);
               String var60 = type(var59);
               String var139 = qzmsznxwui(deyvbinkpudmosx(), var201);
               byte var61 = (byte)((var60.equals(var139)) ? 1 : 0);
               if (var61 == (267192094 ^ var201)) {
                  var201 = 424229309 ^ var201;
                  String var162 = qzmsznxwui(oxfyasvszfixqmz(), var201);
                  IllegalStateException var104 = unsupported(var0, var162);
                  throw new RuntimeException(var104);
               }

               var201 = iocceggpjfhemsgs(var201, 487682482);
               byte var178 = (byte)(318535342 ^ var201);
               Object var141 = var37.get(var178);
               PlacementModifier var142 = (PlacementModifier)var141;
               JsonObject var63 = json(var0, var142);
               String var65 = type(var63);
               String var143 = qzmsznxwui(ahdkmumukxthjdb(), var201);
               byte var66 = (byte)((var65.equals(var143)) ? 1 : 0);
               if (var66 == (318535340 ^ var201)) {
                  var201 = 393975798 ^ var201;
                  String var144 = qzmsznxwui(yddfsxntjoeszjx(), var201);
                  IllegalStateException var68 = unsupported(var0, var144);
                  throw new RuntimeException(var68);
               }

               label164:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                     case 80295697:
                        var201 ^= 1502528828;
                        break label164;
                     case 544589764:
                     default:
                        throw new RuntimeException();
                     case 644315063:
                        break label164;
                     case 2097471964:
                  }
               }

               byte var179 = (byte)(1265808275 ^ var201);
               Object var146 = var37.get(var179);
               PlacementModifier var147 = (PlacementModifier)var146;
               JsonObject var70 = json(var0, var147);
               String var71 = type(var70);
               String var148 = qzmsznxwui(xhngxwcmwjcbmio(), var201);
               byte var72 = (byte)((var71.equals(var148)) ? 1 : 0);
               if (var72 == (1265808272 ^ var201)) {
                  var201 = 448536985 ^ var201;
                  String var149 = qzmsznxwui(xtcfcdxfojuhxcu(), var201);
                  IllegalStateException var74 = unsupported(var0, var149);
                  throw new RuntimeException(var74);
               }

               label156:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                     case 36597909:
                        var201 ^= 1744162839;
                        break label156;
                     case 761721894:
                        break;
                     case 949472841:
                     default:
                        throw new RuntimeException();
                     case 1836824712:
                        break label156;
                  }
               }

               String var150 = qzmsznxwui(uqqbkaegexbmrym(), var201);
               var76 = var63.getAsJsonObject(var150);
               String var78 = type(var76);
               byte var80 = (byte)(-747070344 ^ var201);
               byte var35 = var80;
               int var82 = var78.hashCode();

               int var213_1 = 0;
               labelSW_var213_1: switch (var82) {
                  case -1500643097 -> {
                     label141:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                           case 39481539:
                              break label141;
                           case 105282642:
                            {
                               var213_1 = 2142058163;
                               break labelSW_var213_1;
                            }
                           case 770359455:
                           default:
                              throw new RuntimeException();
                           case 1676604586:
                        }
                     }

                     String var161 = qzmsznxwui(zxpcqsabtarwxcf(), var201);
                     byte var101 = (byte)((var78.equals(var161)) ? 1 : 0);
                     if (var101 != (1395283252 ^ var201)) {
                      {
                         var213_1 = 1334361806;
                         break labelSW_var213_1;
                      }
                     } else {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                              case 19027518:
                               {
                                  var213_1 = 70407059;
                                  break labelSW_var213_1;
                               }
                              case 124871518:
                                 break;
                              case 262555892:
                              case 1125458771:
                              default:
                                 throw new RuntimeException();
                           }
                        }
                     }
                  }
                  case -1348005797 -> {
                     var201 = 1379165520 ^ var201;
                     String var151 = qzmsznxwui(cgqkszbksybfjec(), var201);
                     byte var84 = (byte)((var78.equals(var151)) ? 1 : 0);
                     if (var84 != (2125661911 ^ var201)) {
                        var201 = 1205742603 ^ var201;
                        byte var85 = (byte)(963455709 ^ var201);
                        var35 = var85;
                      {
                         var213_1 = 1853172859 ^ var201;
                         break labelSW_var213_1;
                      }
                     } else {
                      {
                         var213_1 = iocceggpjfhemsgs(var201, 699072624);
                         break labelSW_var213_1;
                      }
                     }
                  }
                  default -> {
                     label148:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                           case 14113959:
                              break label148;
                           case 105282642:
                            {
                               var213_1 = 2074043680;
                               break labelSW_var213_1;
                            }
                           case 461208935:
                              break;
                           case 799474548:
                           default:
                              throw new RuntimeException();
                        }
                     }
                  }

            }
               label119:
               switch (var35) {
                  case 0:
                     var201 = iocceggpjfhemsgs(var201, 1637077617);
                     var99 = (byte)(915133654 ^ var201);

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                           case 162454229:
                              var201 ^= 1077469313;
                              break label119;
                           case 991814041:
                              break;
                           case 1518223266:
                           default:
                              throw new RuntimeException();
                           case 1649929799:
                              break label119;
                        }
                     }
                  case 1:
                     var201 = 1887293085 ^ var201;
                     var99 = (byte)(660981819 ^ var201);

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                           case 206902421:
                              var201 ^= 1373043821;
                           case 1119467221:
                              break label119;
                           case 1254190829:
                           default:
                              throw new RuntimeException();
                           case 1325128762:
                        }
                     }
                  default:
                     var201 = 42163587 ^ var201;
                     String var153 = String.valueOf(var76);
                     String var154 = "height " + var153;
                     IllegalStateException var88 = unsupported(var0, var154);
                     throw new RuntimeException(var88);
               }

               String var155 = qzmsznxwui(pjxgvygpcrqkpjt(), var201);
               byte var90 = (byte)((var76.has(var155)) ? 1 : 0);
               if (var90 != (1991455831 ^ var201)) {
                  var201 = 131965129 ^ var201;
                  String var156 = qzmsznxwui(vzxzesxzyedbxrh(), var201);
                  JsonElement var92 = var76.get(var156);
                  var93 = var92.getAsInt();

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                        case 197545628:
                           var201 ^= 2143384352;
                           break label240;
                        case 576364659:
                           break;
                        case 1140615012:
                        default:
                           throw new RuntimeException();
                        case 1238704133:
                           break label240;
                     }
                  }
               } else {
                  label102:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var201)) {
                        case 100352987:
                           var201 ^= 1221329187;
                        case 1379545588:
                           break label102;
                        case 1595455238:
                        default:
                           throw new RuntimeException();
                        case 1686588022:
                     }
                  }

                  var93 = (byte)(1048524148 ^ var201);
                  var201 = 818991818 ^ var201;
                  break label240;
               }
            }

            String var171 = String.valueOf(var41);
            String var172 = "first modifier " + var171;
            IllegalStateException var125 = unsupported(var0, var172);
            throw new RuntimeException(var125);
         }

         byte var197 = (byte)var93;
         String var180 = qzmsznxwui(ozaqwhavvgkjncm(), var201);
         JsonObject var158 = var76.getAsJsonObject(var180);
         int var95 = anchor(var0, var158, var7, var8);
         String var182 = qzmsznxwui(mlcfwhecrxfxaxd(), var201);
         JsonObject var160 = var76.getAsJsonObject(var182);
         int var97 = anchor(var0, var160, var7, var8);
         int var187 = var5.size;
         float var188 = var5.discardChanceOnAirExposure;
         byte var189 = kindOf(var0, var5);
         return new h(var0, var1, var2, var3, var191, var192, var28, (var99 != 0), var95, var97, var197, var187, var188, var189, var6);
      }
   }

   private static int anchor(String var0, JsonObject var1, int var2, int var3) {
      int var36 = 1230419591 ^ 74641767 ^ 137447981;
      var36 = 2077015204 ^ var36;
      String var5 = qzmsznxwui(jjzdejzpxhvausy(), var36);
      byte var7 = (byte)((var1.has(var5)) ? 1 : 0);
      if (var7 != (1054454121 ^ var36)) {
         var36 = 192676285 ^ var36;
         String var21 = qzmsznxwui(xjhobitizytalmq(), var36);
         JsonElement var9 = var1.get(var21);
         return var9.getAsInt();
      } else {
         label33:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var36)) {
               case 163969378:
                  var36 ^= 609510233;
               case 1665240757:
                  String var22 = qzmsznxwui(jktsszwvfrcmmov(), var36);
                  byte var12 = (byte)((var1.has(var22)) ? 1 : 0);
                  if (var12 != (445502000 ^ var36)) {
                     var36 = 2142030769 ^ var36;
                     String var6 = qzmsznxwui(djgmeqiggmboltm(), var36);
                     JsonElement var24 = var1.get(var6);
                     int var25 = var24.getAsInt();
                     return var2 + var25;
                  }

                  var36 = 994802623 ^ var36;
                  String var26 = qzmsznxwui(gckyzmznlecvfax(), var36);
                  byte var16 = (byte)((var1.has(var26)) ? 1 : 0);
                  if (var16 != (566667663 ^ var36)) {
                     var36 = 450740094 ^ var36;
                     String var33 = qzmsznxwui(upniuuomcpfcrgt(), var36);
                     JsonElement var31 = var1.get(var33);
                     int var32 = var31.getAsInt();
                     return var3 - var32;
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var36)) {
                        case 24168771:
                           var36 = 277905303 ^ var36;
                        case 501893616:
                           break label33;
                        case 1386727153:
                           break;
                        case 1645674179:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               case 751560654:
                  break;
               case 1394538863:
               default:
                  throw new IllegalStateException();
            }
         }

         String var28 = String.valueOf(var1);
         String var29 = "anchor " + var28;
         IllegalStateException var18 = unsupported(var0, var29);
         throw new RuntimeException(var18);
      }
   }

   private static byte kindOf(String var0, OreConfiguration var1) {
      int var82 = 1168505936 ^ 1552577683 ^ 137447981;
      var82 = 974785551 ^ var82;
      HashSet var2 = new HashSet();
      HashSet var4 = var2;
      byte var10 = (byte)(-721735394 ^ var82);
      byte var5 = var10;
      List var12 = var1.targetStates;
      Iterator var13 = var12.iterator();
      Iterator var6 = var13;
      var82 = 269995542 ^ var82;

      TargetBlockState var18;
      label108:
      while (true) {
         byte var15 = (byte)((var6.hasNext()) ? 1 : 0);
         if (var15 != (991101175 ^ var82)) {
            var82 = 106096212 ^ var82;
            Object var17 = var6.next();
            var18 = (TargetBlockState)var17;
            Codec var19 = RuleTest.CODEC;
            JsonOps var52 = JsonOps.INSTANCE;
            RuleTest var76 = var18.target;
            DataResult var20 = var19.encodeStart(var52, var76);
            Object var21 = var20.getOrThrow();
            JsonElement var22 = (JsonElement)var21;
            JsonObject var23 = var22.getAsJsonObject();
            String var53 = qzmsznxwui(gdvlgglqpwlataw(), var82);
            JsonElement var25 = var23.get(var53);
            String var26 = var25.getAsString();
            String var54 = qzmsznxwui(mzznsqczdwqhakg(), var82);
            byte var27 = (byte)((var26.equals(var54)) ? 1 : 0);
            if (var27 == (1027729059 ^ var82)) {
               var82 = 1580150926 ^ var82;
               String var56 = String.valueOf(var23);
               String var57 = "target " + var56;
               IllegalStateException var29 = unsupported(var0, var57);
               throw new RuntimeException(var29);
            }

            var82 = 1669262957 ^ var82;
            String var77 = qzmsznxwui(aagssukyqllwqim(), var82);
            JsonElement var59 = var23.get(var77);
            String var60 = var59.getAsString();
            boolean var31 = var4.add(var60);
            BlockState var33 = var18.state;
            byte var34 = m.of(var33);
            byte var61 = (byte)(1581189314 ^ var82);
            if (var34 != var61) {
               var82 = 271984738 ^ var82;
               if (var34 != (1309221036 ^ var82)) {
                  var82 = 727958561 ^ var82;
                  byte var62 = (byte)(-1701504142 ^ var82);
                  if (var5 != var62) {
                     var82 = 1493196635 ^ var82;
                     if (var5 != var34) {
                        var82 = 936234475 ^ var82;
                        break;
                     }

                     var82 = 1952328098 ^ var82;
                  } else {
                     label56:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var82)) {
                           case 75464635:
                              var82 ^= 761165561;
                              break label56;
                           case 608333283:
                              break;
                           case 1269248971:
                              break label56;
                           case 2102971409:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }

                  var5 = var34;
                  var82 = iocceggpjfhemsgs(var82, 1931973251);
                  continue;
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var82)) {
                     case 120709444:
                        var82 = 1169053329 ^ var82;
                        break label108;
                     case 142038477:
                        break;
                     case 242218483:
                     default:
                        throw new IllegalStateException();
                     case 1206732967:
                        break label108;
                  }
               }
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var82)) {
                  case 110788400:
                     var82 = 1436057331 ^ var82;
                  case 570719536:
                     break label108;
                  case 961962799:
                  default:
                     throw new IllegalStateException();
                  case 1395028764:
               }
            }
         }

         label105:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var82)) {
               case 41216717:
                  var82 ^= 1609505462;
               case 528150347:
                  break label105;
               case 817217288:
                  break;
               case 2146236986:
               default:
                  throw new IllegalStateException();
            }
         }

         byte var46;
         label116: {
            String var68 = qzmsznxwui(vjgtfezkhjmgsgs(), var82);
            Set var69 = Set.of(var68);
            byte var43 = (byte)((var4.equals(var69)) ? 1 : 0);
            if (var43 == (1694243393 ^ var82)) {
               var82 = 769657611 ^ var82;
               String var70 = qzmsznxwui(vqasoolpxpbznkh(), var82);
               String var78 = qzmsznxwui(hakuugsgufaemmi(), var82);
               Set var71 = Set.of(var70, var78);
               byte var45 = (byte)((var4.equals(var71)) ? 1 : 0);
               if (var45 == (1226576202 ^ var82)) {
                  var82 = iocceggpjfhemsgs(var82, 956500238);
                  var46 = (byte)(1881086020 ^ var82);
                  var82 = 294627852 ^ var82;
                  break label116;
               }

               var82 = 878193068 ^ var82;
            } else {
               label96:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var82)) {
                     case 61347361:
                        var82 ^= 431497895;
                        break label96;
                     case 1172583183:
                     default:
                        throw new IllegalStateException();
                     case 1443691027:
                        break;
                     case 2063173532:
                        break label96;
                  }
               }
            }

            var46 = (byte)(2101623015 ^ var82);

            label86:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var82)) {
                  case 45372281:
                     var82 ^= 483691182;
                  case 985424398:
                     break label86;
                  case 1612534936:
                  default:
                     throw new IllegalStateException();
                  case 1861961327:
               }
            }
         }

         if (var46 != (1636872776 ^ var82)) {
            var82 = 1427955981 ^ var82;
            byte var72 = (byte)(-881611590 ^ var82);
            if (var5 != var72) {
               var82 = 1378990704 ^ var82;
               return var5;
            }

            var82 = 547052458 ^ var82;
         } else {
            var82 = 1971829415 ^ var82;
         }

         String var74 = String.valueOf(var4);
         String var75 = "targets " + var74;
         IllegalStateException var50 = unsupported(var0, var75);
         throw new RuntimeException(var50);
      }

      BlockState var65 = var18.state;
      String var66 = String.valueOf(var65);
      String var67 = "writes " + var66;
      IllegalStateException var41 = unsupported(var0, var67);
      throw new RuntimeException(var41);
   }

   static void checkTags() {
      int var35 = 530703022 ^ 786138811 ^ 137447981;
      var35 = 987906971 ^ var35;
      TagKey var0 = BlockTags.BASE_STONE_OVERWORLD;
      byte var1 = (byte)(61435301 ^ var35);
      Block[] var6 = new Block[var1];
      byte var2 = (byte)(61435299 ^ var35);
      Block var3 = Blocks.STONE;
      var6[var2] = var3;
      byte var11 = (byte)(61435298 ^ var35);
      Block var22 = Blocks.GRANITE;
      var6[var11] = var22;
      byte var12 = (byte)(61435297 ^ var35);
      Block var23 = Blocks.DIORITE;
      var6[var12] = var23;
      byte var13 = (byte)(61435296 ^ var35);
      Block var24 = Blocks.ANDESITE;
      var6[var13] = var24;
      byte var14 = (byte)(61435303 ^ var35);
      Block var25 = Blocks.TUFF;
      var6[var14] = var25;
      byte var15 = (byte)(61435302 ^ var35);
      Block var26 = Blocks.DEEPSLATE;
      var6[var15] = var26;
      expect(var0, var6);
      TagKey var4 = BlockTags.STONE_ORE_REPLACEABLES;
      byte var7 = (byte)(61435303 ^ var35);
      Block[] var8 = new Block[var7];
      byte var16 = (byte)(61435299 ^ var35);
      Block var27 = Blocks.STONE;
      var8[var16] = var27;
      byte var17 = (byte)(61435298 ^ var35);
      Block var28 = Blocks.GRANITE;
      var8[var17] = var28;
      byte var18 = (byte)(61435297 ^ var35);
      Block var29 = Blocks.DIORITE;
      var8[var18] = var29;
      byte var19 = (byte)(61435296 ^ var35);
      Block var30 = Blocks.ANDESITE;
      var8[var19] = var30;
      expect(var4, var8);
      TagKey var5 = BlockTags.DEEPSLATE_ORE_REPLACEABLES;
      byte var9 = (byte)(61435297 ^ var35);
      Block[] var10 = new Block[var9];
      byte var20 = (byte)(61435299 ^ var35);
      Block var31 = Blocks.DEEPSLATE;
      var10[var20] = var31;
      byte var21 = (byte)(61435298 ^ var35);
      Block var32 = Blocks.TUFF;
      var10[var21] = var32;
      expect(var5, var10);
   }

   private static void expect(TagKey<Block> var0, Block... var1) {
      int var38 = 267779043 ^ 414523259 ^ 137447981;
      var38 = 24748374 ^ var38;
      IdentityHashMap var2 = new IdentityHashMap();
      Set var9 = Collections.newSetFromMap(var2);
      boolean var11 = Collections.addAll(var9, var1);
      IdentityHashMap var12 = new IdentityHashMap();
      Set var13 = Collections.newSetFromMap(var12);
      Set var6 = var13;
      DefaultedRegistry var14 = BuiltInRegistries.BLOCK;
      Iterable var15 = var14.getTagOrEmpty(var0);
      Iterator var16 = var15.iterator();
      Iterator var7 = var16;
      var38 = 306127180 ^ var38;

      while (true) {
         byte var18 = (byte)((var7.hasNext()) ? 1 : 0);
         if (var18 == (204943023 ^ var38)) {
            var38 = iocceggpjfhemsgs(var38, 261833897);
            byte var25 = (byte)((var6.equals(var9)) ? 1 : 0);
            if (var25 == (61630982 ^ var38)) {
               var38 = 932821929 ^ var38;
               String var33 = String.valueOf(var0);
               String var35 = String.valueOf(var6);
               String var34 = "block tag " + var33 + " is not vanilla's: " + var35;
               IllegalStateException var26 = new IllegalStateException(var34);
               throw new RuntimeException(var26);
            } else {
               var38 = 441085035 ^ var38;
               return;
            }
         }

         var38 = 761567144 ^ var38;
         Object var20 = var7.next();
         Holder var21 = (Holder)var20;
         Object var30 = var21.value();
         Block var31 = (Block)var30;
         boolean var23 = var6.add(var31);
         var38 = 761567144 ^ var38;
      }
   }

   private static JsonObject json(String var0, PlacementModifier var1) {
      int var20 = 359515974 ^ 341906039 ^ 137447981;
      var20 = 1853053963 ^ var20;

      try {
         Codec var2 = PlacementModifier.CODEC;
         JsonOps var3 = JsonOps.INSTANCE;
         DataResult var6 = var2.encodeStart(var3, var1);
         Object var7 = var6.getOrThrow();
         JsonElement var8 = (JsonElement)var7;
         JsonObject var9 = var8.getAsJsonObject();
         var20 ^= 1695785371;
         return var9;
      } catch (RuntimeException var21) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var20)) {
            case 980818107:
               var20 = iocceggpjfhemsgs(var20, 1558003803);
               String var14 = String.valueOf(var1);
               String var17 = var21.getMessage();
               String var15 = "modifier " + var14 + ": " + var17;
               IllegalStateException var12 = unsupported(var0, var15);
               throw new RuntimeException(var12);
            default:
               throw new RuntimeException("Error in hash");
         }
      }
   }

   private static String type(JsonObject var0) {
      int var10 = 1104878839 ^ 443377105 ^ 137447981;
      var10 = 1017245201 ^ var10;
      String var2 = qzmsznxwui(vxmyywdjtyslegq(), var10);
      JsonElement var4 = var0.get(var2);
      if (var4 == null) {
         var10 = 245044979 ^ var10;
         String var15 = qzmsznxwui(xgeczgbmoosqeed(), var10);
         var10 = iocceggpjfhemsgs(var10, 49912114);
         return var15;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
               case 123413316:
                  var10 ^= 1131531898;
               case 493376179:
                  String var7 = var4.getAsString();
                  var10 = 1326662075 ^ var10;
                  return var7;
               case 460995480:
               default:
                  throw new IllegalStateException();
               case 993317064:
            }
         }
      }
   }

   private static IllegalStateException unsupported(String var0, String var1) {
      int var8 = 1283839874 ^ 1712352416 ^ 137447981;
      var8 = 2073507849 ^ var8;
      String var5 = "feature " + var0 + " is not placed like a vanilla ore: " + var1;
      return new IllegalStateException(var5);
   }

   @Override
   public final int hashCode() {
      int var5 = 2126633919 ^ 1336011344 ^ 355231258;
      var5 = 923368315 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.id);
      result = 31 * result + Objects.hashCode(this.step);
      result = 31 * result + Objects.hashCode(this.index);
      result = 31 * result + Objects.hashCode(this.order);
      result = 31 * result + Objects.hashCode(this.countMin);
      result = 31 * result + Objects.hashCode(this.countMax);
      result = 31 * result + Objects.hashCode(this.rarity);
      result = 31 * result + Objects.hashCode(this.trapezoid);
      result = 31 * result + Objects.hashCode(this.yMin);
      result = 31 * result + Objects.hashCode(this.yMax);
      result = 31 * result + Objects.hashCode(this.plateau);
      result = 31 * result + Objects.hashCode(this.size);
      result = 31 * result + Objects.hashCode(this.discard);
      result = 31 * result + Objects.hashCode(this.kind);
      result = 31 * result + Objects.hashCode(this.biomes);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 526558747 ^ 1492995259 ^ 355231258;
      var7 = 1207598746 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      h other = (h)var1;
      return Objects.equals(this.id, other.id) &&
      this.step == other.step &&
      this.index == other.index &&
      this.order == other.order &&
      this.countMin == other.countMin &&
      this.countMax == other.countMax &&
      this.rarity == other.rarity &&
      this.trapezoid == other.trapezoid &&
      this.yMin == other.yMin &&
      this.yMax == other.yMax &&
      this.plateau == other.plateau &&
      this.size == other.size &&
      Float.compare(this.discard, other.discard) == 0 &&
      this.kind == other.kind &&
      Objects.equals(this.biomes, other.biomes);
   }

   public String id() {
      int var5 = 146018086 ^ 1616649182 ^ 355231258;
      var5 = 2066847944 ^ var5;
      return this.id;
   }

   public int step() {
      int var5 = 1500336920 ^ 1992028453 ^ 355231258;
      var5 = 1500128754 ^ var5;
      return this.step;
   }

   public int index() {
      int var5 = 1279210017 ^ 2072928343 ^ 355231258;
      var5 = 1725101849 ^ var5;
      return this.index;
   }

   public int order() {
      int var5 = 1383382848 ^ 465410807 ^ 355231258;
      var5 = 65257156 ^ var5;
      return this.order;
   }

   public int countMin() {
      int var5 = 1836586112 ^ 1793038298 ^ 355231258;
      var5 = 824390671 ^ var5;
      return this.countMin;
   }

   public int countMax() {
      int var5 = 2079774777 ^ 328857879 ^ 355231258;
      var5 = 1336304763 ^ var5;
      return this.countMax;
   }

   public int rarity() {
      int var5 = 589478360 ^ 693432786 ^ 355231258;
      var5 = 1259926214 ^ var5;
      return this.rarity;
   }

   public boolean trapezoid() {
      int var5 = 1348049685 ^ 1645052635 ^ 355231258;
      var5 = 579697376 ^ var5;
      return this.trapezoid;
   }

   public int yMin() {
      int var5 = 1803184106 ^ 2111789631 ^ 355231258;
      var5 = 1534167113 ^ var5;
      return this.yMin;
   }

   public int yMax() {
      int var5 = 1194337359 ^ 384283826 ^ 355231258;
      var5 = 2117415271 ^ var5;
      return this.yMax;
   }

   public int plateau() {
      int var5 = 1570379944 ^ 435921361 ^ 355231258;
      var5 = 444511931 ^ var5;
      return this.plateau;
   }

   public int size() {
      int var5 = 622246356 ^ 24128463 ^ 355231258;
      var5 = 608087629 ^ var5;
      return this.size;
   }

   public float discard() {
      int var5 = 1522266969 ^ 234738739 ^ 355231258;
      var5 = 443202843 ^ var5;
      return this.discard;
   }

   public byte kind() {
      int var5 = 466856277 ^ 1380859387 ^ 355231258;
      var5 = 1964172943 ^ var5;
      return this.kind;
   }

   public Set<Holder<Biome>> biomes() {
      int var5 = 934191532 ^ 1586272925 ^ 355231258;
      var5 = 575554127 ^ var5;
      return this.biomes;
   }

   static {
      int var13 = 1265267049 ^ 1422435890 ^ Integer.parseInt("1262531625");
      int var10 = new Random(-1873209740872579231L).nextInt();
      BUXHOHJX4A = -1137568144 ^ var10;
      var13 = 487852272 ^ var13;
      byte var0 = (byte)(1240886144 ^ var13);
      int[] var3 = new int[var0];
      byte var1 = (byte)(1240886146 ^ var13);
      Decoration var2 = Decoration.UNDERGROUND_ORES;
      int var5 = var2.ordinal();
      var3[var1] = var5;
      byte var4 = (byte)(1240886147 ^ var13);
      Decoration var6 = Decoration.UNDERGROUND_DECORATION;
      int var7 = var6.ordinal();
      var3[var4] = var7;
      STEPS = var3;
   }

   public static String qzmsznxwui(byte[] var0, int var1) {
      String var10 = Integer.toString(var1);
      byte[] var11 = var10.getBytes();
      byte[] var8 = var11;
      byte var12 = 0;
      int var9 = var12;

      while (true) {
         int var17 = var0.length;
         if (var9 >= var17) {
            Charset var5 = StandardCharsets.UTF_16;
            return new String(var0, var5);
         }

         byte var20 = var0[var9];
         int var33 = var8.length;
         int var30 = var9 % var33;
         byte var27 = var8[var30];
         int var21 = var20 ^ var27;
         byte var22 = (byte)var21;
         var0[var9] = var22;
         byte var23 = var0[var9];
         byte[] var28 = qzwoksrerp;
         byte[] var34 = qzwoksrerp;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] xafwvntjpdeoiwh() {
      return new byte[]{
         98,
         11,
         2,
         127,
         5,
         34,
         94,
         102,
         50,
         56,
         101,
         68,
         91,
         19,
         116,
         118,
         96,
         77,
         55,
         56,
         126,
         47,
         79,
         26,
         99,
         70,
         64,
         106,
         45,
         99,
         10,
         10,
         60,
         74,
         120,
         44,
         16,
         126
      };
   }

   private static byte[] uqqbkaegexbmrym() {
      return new byte[]{-85, -64, 53, 39, 50, 119, 109, 59, 1, 104, 81, 27, 107, 80};
   }

   private static byte[] pxtakrfpncrsghr() {
      return new byte[]{-81, -61, 49, 33, 52, 114, 102, 62, 2, 110, 82, 20, 104, 80, 77, 47, 86, 27, 4, 123, 77, 38, 126, 64, 91, 31, 112, 44, 26, 62, 57, 79};
   }

   private static byte[] ahdkmumukxthjdb() {
      return new byte[]{
         -81,
         -59,
         58,
         39,
         54,
         126,
         109,
         60,
         2,
         110,
         84,
         31,
         110,
         82,
         65,
         36,
         84,
         27,
         4,
         125,
         70,
         32,
         124,
         71,
         80,
         23,
         112,
         48,
         28,
         60,
         63,
         81,
         9,
         13,
         76,
         67,
         35,
         61,
         90,
         95,
         49,
         36,
         54,
         113,
         110,
         48
      };
   }

   private static byte[] eivbkacquxbwwzu() {
      return new byte[]{-87, -59, 54, 37, 51, 127, 107, 51, 11, 99, 84, 19, 98, 64};
   }

   private static byte[] xuefyzmjmsfilts() {
      return new byte[]{-83, -58, 58, 42, 50, 122, 106, 43, 2, 100, 84, 2};
   }

   private static byte[] yddfsxntjoeszjx() {
      return new byte[]{-91, -58, 53, 50, 52, 123, 109, 63, 11, 120, 82, 25, 106, 2, 71, 43, 89, 16, 0, 101, 79, 119, 124, 76, 90, 29, 119, 54, 28, 32};
   }

   private static byte[] deyvbinkpudmosx() {
      return new byte[]{
         -82,
         -62,
         53,
         35,
         60,
         121,
         110,
         49,
         6,
         111,
         83,
         16,
         106,
         88,
         70,
         39,
         89,
         31,
         5,
         122,
         73,
         36,
         118,
         65,
         83,
         17,
         116,
         7,
         27,
         39,
         59,
         66,
         14,
         15,
         65,
         121,
         34,
         58,
         85,
         95
      };
   }

   private static byte[] vzxzesxzyedbxrh() {
      return new byte[]{-83, -51, 50, 60, 53, 121, 108, 51, 3, 120, 84, 24, 107, 65, 68, 52};
   }

   private static byte[] zxpcqsabtarwxcf() {
      return new byte[]{
         -83, -57, 59, 39, 55, 115, 109, 58, 7, 111, 84, 20, 98, 84, 70, 47, 83, 25, 2, 126, 79, 38, 118, 90, 81, 16, 115, 49, 24, 55, 59, 86, 5, 13, 74, 121
      };
   }

   private static byte[] zeegdgfnisyyalu() {
      return new byte[]{-91, -58, 52, 34, 53, 123, 108, 58, 0, 94, 87, 27, 107, 77, 68, 39, 82, 19, 14, 127, 72, 108, 127, 67, 81, 2, 114, 54};
   }

   private static byte[] vtlbjehsfpnaciq() {
      return new byte[]{-91, -58, 52, 34, 53, 115, 108, 44, 0, 94, 87, 27, 107, 77, 68, 39, 82, 19, 14, 127, 72, 108, 127, 67, 81, 2, 114, 54};
   }

   private static byte[] xtcfcdxfojuhxcu() {
      return new byte[]{
         -83, -57, 53, 43, 49, 116, 108, 33, 11, 125, 84, 3, 108, 73, 64, 111, 82, 18, 14, 96, 79, 120, 120, 65, 87, 25, 114, 49, 20, 49, 59, 75
      };
   }

   private static byte[] cgqkszbksybfjec() {
      return new byte[]{
         -82,
         -59,
         48,
         39,
         51,
         125,
         111,
         49,
         3,
         108,
         87,
         22,
         105,
         84,
         66,
         33,
         81,
         18,
         6,
         125,
         76,
         36,
         125,
         91,
         85,
         2,
         113,
         50,
         28,
         34,
         56,
         94,
         14,
         5,
         78,
         117,
         33,
         46,
         83,
         94
      };
   }

   private static byte[] exymoiaoficyyht() {
      return new byte[]{
         -83,
         -60,
         54,
         32,
         61,
         121,
         108,
         48,
         7,
         100,
         84,
         23,
         111,
         83,
         76,
         37,
         82,
         19,
         2,
         117,
         79,
         37,
         123,
         90,
         91,
         21,
         114,
         32,
         24,
         51,
         59,
         78,
         8,
         1,
         64,
         65,
         34,
         32,
         87,
         91,
         51,
         35,
         49,
         100,
         102,
         49,
         0,
         114
      };
   }

   private static byte[] oxfyasvszfixqmz() {
      return new byte[]{-81, -61, 59, 52, 51, 117, 104, 60, 3, 100, 82, 19, 99, 65, 70, 96, 89, 17, 4, 96, 71, 115, 121, 65, 85, 25, 113, 48, 26, 63, 50, 78};
   }

   private static byte[] ozaqwhavvgkjncm() {
      return new byte[]{-82, -64, 52, 38, 53, 114, 111, 61, 2, 85, 81, 27, 111, 77, 77, 36, 85, 17, 5, 121, 72, 104, 127, 74, 82, 5, 112, 61};
   }

   private static byte[] mlcfwhecrxfxaxd() {
      return new byte[]{-82, -64, 52, 38, 53, 122, 111, 43, 2, 85, 81, 27, 111, 77, 77, 36, 85, 17, 5, 121, 72, 104, 127, 74, 82, 5, 112, 61};
   }

   private static byte[] pspssscpqkbrvoh() {
      return new byte[]{
         -82, -60, 52, 33, 50, 122, 102, 62, 5, 101, 87, 23, 109, 82, 67, 38, 88, 29, 0, 116, 76, 37, 121, 92, 84, 25, 120, 53, 26, 61, 56, 85, 10, 11, 79, 112
      };
   }

   private static byte[] xhngxwcmwjcbmio() {
      return new byte[]{-83, -58, 52, 39, 61, 123, 102, 58, 5, 111, 84, 21, 109, 84, 76, 39, 88, 25, 0, 126, 79, 39, 121, 77, 91, 31, 120, 55, 26, 60, 59, 93};
   }

   private static byte[] pjxgvygpcrqkpjt() {
      return new byte[]{-83, -51, 59, 62, 49, 123, 107, 63, 1, 125, 84, 24, 98, 67, 64, 54};
   }

   private static byte[] xjhobitizytalmq() {
      return new byte[]{-91, -60, 50, 46, 48, 113, 111, 32, 4, 110, 85, 24, 107, 83, 69, 51, 85, 30};
   }

   private static byte[] gckyzmznlecvfax() {
      return new byte[]{-87, -62, 52, 43, 51, 112, 104, 60, 1, 98, 83, 5, 109, 122, 67, 52, 86, 17, 2, 126};
   }

   private static byte[] jktsszwvfrcmmov() {
      return new byte[]{-88, -64, 55, 43, 53, 114, 110, 57, 2, 122, 81, 20, 110, 124, 70, 36, 80, 18, 3, 120, 75, 110, 127, 71, 83, 27};
   }

   private static byte[] djgmeqiggmboltm() {
      return new byte[]{-83, -62, 59, 40, 51, 118, 102, 57, 1, 125, 84, 23, 98, 122, 66, 34, 88, 18, 4, 127, 79, 109, 118, 67, 85, 29};
   }

   private static byte[] jjzdejzpxhvausy() {
      return new byte[]{-83, -60, 55, 42, 49, 117, 106, 36, 0, 102, 84, 24, 110, 82, 64, 55, 84, 25};
   }

   private static byte[] upniuuomcpfcrgt() {
      return new byte[]{-91, -51, 51, 43, 54, 118, 110, 50, 11, 110, 92, 2, 109, 127, 69, 50, 88, 27, 14, 113};
   }

   private static byte[] vjgtfezkhjmgsgs() {
      return new byte[]{
         -83,
         -62,
         59,
         38,
         55,
         127,
         109,
         59,
         11,
         110,
         84,
         17,
         98,
         85,
         70,
         35,
         83,
         24,
         14,
         127,
         79,
         35,
         118,
         76,
         81,
         19,
         115,
         42,
         20,
         53,
         59,
         99,
         5,
         13,
         74,
         108,
         35,
         34,
         91,
         86,
         51,
         44,
         60,
         73,
         108,
         61,
         1,
         125,
         92,
         18,
         106,
         87,
         77,
         53,
         82,
         22,
         4,
         121,
         71,
         112,
         126,
         72
      };
   }

   private static byte[] gdvlgglqpwlataw() {
      return new byte[]{-83, -60, 48, 56, 50, 98, 103, 51, 7, 101, 84, 29, 105, 71, 67, 37, 89, 9, 2, 100, 79, 64, 125, 89, 84, 13, 121, 42, 24, 63};
   }

   private static byte[] mzznsqczdwqhakg() {
      return new byte[]{
         -83,
         -60,
         48,
         37,
         50,
         121,
         103,
         56,
         7,
         100,
         84,
         23,
         105,
         86,
         67,
         37,
         89,
         27,
         2,
         117,
         79,
         37,
         125,
         89,
         84,
         21,
         121,
         61,
         24,
         5,
         59,
         87,
         14,
         28,
         79,
         106,
         41,
         45,
         87,
         90
      };
   }

   private static byte[] aagssukyqllwqim() {
      return new byte[]{-83, -63, 58, 58, 52, 123, 103, 50};
   }

   private static byte[] vqasoolpxpbznkh() {
      return new byte[]{
         -83,
         -58,
         48,
         36,
         48,
         124,
         104,
         58,
         2,
         111,
         84,
         21,
         105,
         87,
         65,
         32,
         86,
         25,
         7,
         126,
         79,
         39,
         125,
         95,
         86,
         5,
         118,
         55,
         29,
         63,
         59,
         93,
         14,
         35,
         77,
         116,
         38,
         62,
         82,
         92,
         51,
         18,
         55,
         102,
         107,
         52,
         4,
         122,
         85,
         26,
         106,
         64,
         70,
         35,
         85,
         31,
         1,
         107,
         78,
         127,
         126,
         68,
         81,
         21,
         117,
         46
      };
   }

   private static byte[] hakuugsgufaemmi() {
      return new byte[]{
         -83,
         -58,
         48,
         36,
         48,
         124,
         104,
         58,
         2,
         111,
         84,
         21,
         105,
         87,
         65,
         32,
         86,
         25,
         7,
         126,
         79,
         39,
         125,
         72,
         86,
         20,
         118,
         61,
         29,
         33,
         59,
         75,
         14,
         16,
         77,
         122,
         38,
         56,
         82,
         92,
         51,
         18,
         55,
         123,
         107,
         35,
         4,
         111,
         85,
         41,
         106,
         83,
         70,
         37,
         85,
         10,
         1,
         102,
         78,
         124,
         126,
         75,
         81,
         21,
         117,
         60,
         27,
         51,
         58,
         84,
         13,
         29,
         74,
         105
      };
   }

   private static byte[] vxmyywdjtyslegq() {
      return new byte[]{-83, -52, 52, 63, 61, 106, 105, 47, 6, 107};
   }

   private static byte[] xgeczgbmoosqeed() {
      return new byte[0];
   }

   private static int iocceggpjfhemsgs(int var0, int var1) {
      return var1 ^ var0;
   }
}
