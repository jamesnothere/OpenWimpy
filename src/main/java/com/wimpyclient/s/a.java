package com.wimpyclient.s;

import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongPredicate;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.FastEntrySet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalLong;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.LockSupport;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.Options;
import net.minecraft.client.multiplayer.ClientChunkCache;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.biome.BiomeManager;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.chunk.PalettedContainer;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a implements AutoCloseable {
   public static final int MAX_RADIUS = 8;
   public static final int WORLD_LIMIT = 250000;
   private static final int SETTLE_TICKS = 20;
   private static final int SEED_CHECK_AFTER = 40;
   private static final double SEED_CHECK_FAIL = 0.5;
   private static final int HIDDEN_AFTER = 10;
   private static final int GROUND_CHECK_AFTER = 20;
   private final long seed;
   private final Thread worker;
   private volatile boolean closed;
   private volatile boolean stopped;
   private final ConcurrentLinkedQueue<Object> inbox;
   private final ConcurrentLinkedQueue<Object> outbox;
   private final Long2ObjectOpenHashMap<List<b$c>> clusters;
   private final Long2ObjectOpenHashMap<a$c> results;
   private final LongOpenHashSet shownSent;
   private final LongArrayFIFOQueue toJudge;
   private final LongOpenHashSet judgeQueued;
   private final Long2LongOpenHashMap settling;
   private final LongOpenHashSet counted;
   private final List<String> notices;
   private LongOpenHashSet area;
   private int areaX;
   private int areaZ;
   private int areaRadius;
   private boolean areaStale;
   private long ticks;
   private int trusted;
   private int mispredicted;
   private int hidden;
   private boolean hashChecked;
   private boolean seedWarned;
   private boolean hiddenWarned;
   private boolean distrusted;
   private boolean wrongHeight;
   private boolean released;
   private static int rUAcQTu3J3;
   private transient int vwfxLqOX33;

   private a(long var1) {
super();
      int var50 = 1259410939 ^ 579196901;
      
      var50 = 237361889 ^ var50;
      var50 = 377035977 ^ 1838125873 ^ Integer.parseInt("474453767");
      this.vwfxLqOX33 = 1688332530 ^ rUAcQTu3J3;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var50)) {
            case 149374943:
               var50 = 515027357 ^ var50;
            case 771093626:
               ConcurrentLinkedQueue var4 = new ConcurrentLinkedQueue();
               this.inbox = var4;
               ConcurrentLinkedQueue var29 = new ConcurrentLinkedQueue();
               this.outbox = var29;
               Long2ObjectOpenHashMap var30 = new Long2ObjectOpenHashMap();
               this.clusters = var30;
               Long2ObjectOpenHashMap var31 = new Long2ObjectOpenHashMap();
               this.results = var31;
               LongOpenHashSet var32 = new LongOpenHashSet();
               this.shownSent = var32;
               LongArrayFIFOQueue var33 = new LongArrayFIFOQueue();
               this.toJudge = var33;
               LongOpenHashSet var34 = new LongOpenHashSet();
               this.judgeQueued = var34;
               Long2LongOpenHashMap var35 = new Long2LongOpenHashMap();
               this.settling = var35;
               LongOpenHashSet var36 = new LongOpenHashSet();
               this.counted = var36;
               ArrayList var37 = new ArrayList();
               this.notices = var37;
               LongOpenHashSet var38 = new LongOpenHashSet();
               this.area = var38;
               int var39 = Integer.MIN_VALUE;
               this.areaX = var39;
               int var40 = Integer.MIN_VALUE;
               this.areaZ = var40;
               byte var41 = -1;
               this.areaRadius = var41;
               this.seed = var1;
               Runnable var47 = this::work;
               String var6 = "WimpyClient Advanced Scanner";
               Thread var44 = new Thread(var47, var6);
               this.worker = var44;
               Thread var24 = this.worker;
               boolean var45 = true;
               var24.setDaemon(var45);
               Thread var26 = this.worker;
               byte var46 = 2;
               var26.setPriority(var46);
               Thread var28 = this.worker;
               var28.start();
               return;
            case 551948735:
               break;
            case 1934802662:
            default:
               throw new RuntimeException();
         }
      }
   }

   public static a start(long var0) {
      int var6 = 460527976 ^ 264633152 ^ 1645248852;
      var6 = 113086078 ^ var6;
      return new a(var0);
   }

   public long seed() {
      int var5 = 1194980117 ^ 1938872760 ^ 112290214;
      var5 = 457549977 ^ var5;
      return this.seed;
   }

   @Override
   public void close() {
      int var7 = 1374251779 ^ 1668284556 ^ 112290214;
      var7 = 1066261806 ^ var7;
      byte var2 = (byte)(195419910 ^ var7);
      this.closed = (var2 != 0);
      Thread var4 = this.worker;
      LockSupport.unpark(var4);
   }

   public static boolean matchesHashedSeed(long var0, long var2) {
      int var14 = 813392994 ^ 699775152 ^ 1645248852;
      var14 = 290909727 ^ var14;
      long var8 = BiomeManager.obfuscateSeed(var0);
      long var19;
      int var10 = (var19 = var8 - var2) == 0L ? 0 : (var19 < 0L ? -1 : 1);
      if (var10 == (1787343769 ^ var14)) {
         var14 = 1171543325 ^ var14;
         byte var20 = (byte)(794617477 ^ var14);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
               case 197382595:
                  var14 = 1143249002 ^ var14;
                  return (var20 != 0);
               case 785948835:
                  break;
               case 1197279518:
               default:
                  throw new IllegalStateException();
               case 1391261732:
                  return (var20 != 0);
            }
         }
      } else {
         label28:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
               case 241742192:
                  var14 ^= 1040874261;
               case 1227573830:
                  break label28;
               case 1669617709:
                  break;
               case 1724434040:
               default:
                  throw new IllegalStateException();
            }
         }

         byte var11 = (byte)(1417857164 ^ var14);
         var14 = 1073395298 ^ var14;
         return (var11 != 0);
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   static OptionalLong hashedSeed(ClientLevel var0) {
      int var41 = 119648124 ^ 741277722 ^ 1645248852;
      var41 = 926361330 ^ var41;

      Field var3;
      label235: {
         label236: {
            label237: {
               label238: {
                  label239: {
                     label240: {
                        label241: {
                           label242: {
                              label243: {
                                 label244: {
                                    label187: {
                                       Field[] var4;
                                       int var5;
                                       int var6;
                                       try {
                                          Object var1 = null;
                                          var3 = (Field)var1;
                                          Class<BiomeManager> var8 = BiomeManager.class;
                                          Field[] var9 = var8.getDeclaredFields();
                                          var4 = var9;
                                          int var11 = var9.length;
                                          var5 = var11;
                                          byte var12 = (byte)(2116618432 ^ var41);
                                          var6 = var12;
                                          var41 ^= 1742721960;
                                       } catch (Exception var47) {
                                          switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var41)) {
                                             case -1604695048:
                                                break label243;
                                             case -982894111:
                                                break label241;
                                             case -810099904:
                                                break label187;
                                             case -246921725:
                                                break label240;
                                             case 864432603:
                                                break label242;
                                             case 2012135443:
                                                break label244;
                                             default:
                                                throw new RuntimeException("Error in hash");
                                          }
                                       }

                                       label164:
                                       while (true) {
                                          label162: {
                                             label189: {
                                                Field var7;
                                                label160: {
                                                   try {
                                                      if (var6 >= var5) {
                                                         break;
                                                      }

                                                      var41 ^= 1997210474;
                                                      Field var15 = var4[var6];
                                                      var7 = var15;
                                                      Class var17 = var15.getType();
                                                      Class var34 = long.class;
                                                      if (var17 != var34) {
                                                         break label189;
                                                      }

                                                      var41 ^= 143466041;
                                                      int var19 = var15.getModifiers();
                                                      byte var20 = (byte)((Modifier.isStatic(var19)) ? 1 : 0);
                                                      if (var20 == (1718666811 ^ var41)) {
                                                         var41 ^= 1920700228;
                                                         if (var3 == null) {
                                                            break label160;
                                                         }

                                                         var41 ^= 749080131;
                                                         OptionalLong var22 = OptionalLong.empty();
                                                         var41 ^= 2129988100;
                                                         return var22;
                                                      }
                                                   } catch (Exception var46) {
                                                      switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var41)) {
                                                         case -1604695048:
                                                            break label243;
                                                         case -982894111:
                                                            break label241;
                                                         case -810099904:
                                                            break label187;
                                                         case -246921725:
                                                            break label240;
                                                         case 864432603:
                                                            break label242;
                                                         case 2012135443:
                                                            break label244;
                                                         default:
                                                            throw new RuntimeException("Error in hash");
                                                      }
                                                   }

                                                   while (true) {
                                                      switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                                                         case 108717666:
                                                            var41 ^= 848024592;
                                                            break label162;
                                                         case 1415313414:
                                                         default:
                                                            throw new IllegalStateException();
                                                         case 1420525392:
                                                            break;
                                                         case 1602899236:
                                                            break label162;
                                                      }
                                                   }
                                                }

                                                var41 ^= 744171634;

                                                try {
                                                   var3 = var7;
                                                   var41 ^= 1823175462;
                                                   break label162;
                                                } catch (Exception var45) {
                                                   switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var41)) {
                                                      case -1478979238:
                                                         break label236;
                                                      case -1415566391:
                                                         break label239;
                                                      case -1031600023:
                                                         break label237;
                                                      case 409357770:
                                                         break label238;
                                                      default:
                                                         throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                   }
                                                }
                                             }

                                             var41 ^= 973523497;
                                          }

                                          try {
                                             var6 += 1425740330 ^ var41;
                                          } catch (Exception var44) {
                                             switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var41)) {
                                                case -1478979238:
                                                   break label236;
                                                case -1415566391:
                                                   break label239;
                                                case -1031600023:
                                                   break label237;
                                                case 409357770:
                                                   break label238;
                                                default:
                                                   throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                             }
                                          }

                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                                                case 77998024:
                                                   var41 ^= 1292749123;
                                                   continue label164;
                                                case 1318752471:
                                                default:
                                                   throw new IllegalStateException();
                                                case 1382771908:
                                                   continue label164;
                                                case 1671432960:
                                             }
                                          }
                                       }

                                       label77:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                                             case 38686959:
                                                var41 ^= 746774033;
                                                break label77;
                                             case 54994349:
                                                break;
                                             case 227007998:
                                                break label77;
                                             case 2069264435:
                                             default:
                                                throw new IllegalStateException();
                                          }
                                       }

                                       try {
                                          if (var3 == null) {
                                             var41 ^= 1987628224;
                                             OptionalLong var32 = OptionalLong.empty();
                                             var41 ^= 836429948;
                                             return var32;
                                          }
                                          break label235;
                                       } catch (Exception var43) {
                                          switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var41)) {
                                             case -1478979238:
                                                break label236;
                                             case -1415566391:
                                                break label239;
                                             case -1031600023:
                                                break label237;
                                             case 409357770:
                                                break label238;
                                             default:
                                                throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                          }
                                       }
                                    }

                                    var41 = dhopmbrhacyntlcp(var41, 1399448360);
                                    return OptionalLong.empty();
                                 }

                                 var41 = dhopmbrhacyntlcp(var41, 610459714);
                                 return OptionalLong.empty();
                              }

                              var41 = 1586786623 ^ var41;
                              return OptionalLong.empty();
                           }

                           var41 = dhopmbrhacyntlcp(var41, 753925755);
                           return OptionalLong.empty();
                        }

                        var41 = 1915912060 ^ var41;
                        return OptionalLong.empty();
                     }

                     var41 = 884355200 ^ var41;
                     return OptionalLong.empty();
                  }

                  var41 = dhopmbrhacyntlcp(var41, 2146123065);
                  return OptionalLong.empty();
               }

               var41 = dhopmbrhacyntlcp(var41, 160690681);
               return OptionalLong.empty();
            }

            var41 = 1926191437 ^ var41;
            return OptionalLong.empty();
         }

         var41 = 509880939 ^ var41;
         return OptionalLong.empty();
      }

      label70:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
            case 126943214:
               var41 ^= 1470383566;
               break label70;
            case 457820867:
               break;
            case 1676570510:
               break label70;
            case 2025100406:
            default:
               throw new IllegalStateException();
         }
      }

      try {
         byte var35 = (byte)(1657815222 ^ var41);
         var3.setAccessible((var35 != 0));
         BiomeManager var37 = var0.getBiomeManager();
         long var29 = var3.getLong(var37);
         OptionalLong var31 = OptionalLong.of(var29);
         var41 ^= 945110242;
         return var31;
      } catch (Exception var42) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var41)) {
            case 377619899:
               var41 = 676296951 ^ var41;
               return OptionalLong.empty();
            default:
               throw new RuntimeException(new IllegalAccessException("Error in hash"));
         }
      }
   }

   public List<String> drainNotices() {
      int var10 = 563793248 ^ 39226862 ^ 112290214;
      var10 = 111577154 ^ var10;
      List var7 = this.notices;
      ArrayList var1 = new ArrayList(var7);
      List var5 = this.notices;
      var5.clear();
      return var1;
   }

   public List<a$c> tick(ClientLevel var1, long var2) {
      int var198 = 1342147996 ^ 1506198915 ^ 112290214;
      var198 = 1834078480 ^ var198;
      long var125 = this.ticks;
      long var6 = 1L;
      long var127 = var125 + var6;
      this.ticks = var127;
      var198 = 959488080 ^ var198;

      label189:
      while (true) {
         ConcurrentLinkedQueue var19 = this.outbox;
         Object var20 = var19.poll();
         if (var20 != null) {
            var198 = 2074239284 ^ var198;
            byte var22 = (byte)((var20 instanceof i$b) ? 1 : 0);
            if (var22 != (1061892557 ^ var198)) {
               var198 = 1029808434 ^ var198;
               i$b var31 = (i$b)var20;
               List var33 = var31.clusters();
               if (var33 == null) {
                  var198 = 1236894219 ^ var198;
                  Long2ObjectOpenHashMap var35 = this.clusters;
                  long var131 = var31.chunk();
                  Object var36 = var35.remove(var131);
                  var198 = 838083 ^ var198;
               } else {
                  label99:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var198)) {
                        case 34072005:
                           var198 ^= 2011148408;
                        case 201303090:
                           break label99;
                        case 920521277:
                           break;
                        case 1511419945:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }

                  Long2ObjectOpenHashMap var38 = this.clusters;
                  long var134 = var31.chunk();
                  List var182 = var31.clusters();
                  Object var39 = var38.put(var134, var182);
                  long var137 = var31.chunk();
                  this.queueJudge(var137);
                  var198 = 1047198640 ^ var198;
               }
            } else {
               var198 = dhopmbrhacyntlcp(var198, 1723404692);
               byte var24 = (byte)((var20 instanceof String) ? 1 : 0);
               if (var24 != (1509040217 ^ var198)) {
                  var198 = 1263668229 ^ var198;
                  String var26 = (String)var20;
                  List var28 = this.notices;
                  boolean var29 = var28.add(var26);
                  var198 = 1497364331 ^ var198;
               } else {
                  var198 = 309197678 ^ var198;
               }
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var198)) {
                  case 42332965:
                     var198 ^= 259427278;
                     continue label189;
                  case 584797488:
                     break;
                  case 642216906:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1606836731:
                     continue label189;
               }
            }
         }

         label182:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var198)) {
               case 92555275:
                  var198 ^= 2022009969;
                  break label182;
               case 893773437:
               default:
                  throw new RuntimeException(new IOException());
               case 1416560937:
                  break label182;
               case 1565338183:
            }
         }

         byte var42 = (byte)((this.stopped) ? 1 : 0);
         if (var42 != (1013726344 ^ var198)) {
            var198 = 1547934045 ^ var198;
            this.release();
            return List.of();
         }

         label174:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var198)) {
               case 85035307:
                  var198 ^= 1379450449;
                  break label174;
               case 1258909816:
               default:
                  throw new RuntimeException(new IOException());
               case 1888632156:
                  break;
               case 1922316082:
                  break label174;
            }
         }

         int var44 = var1.getMinY();
         byte var139 = (byte)(-1851032295 ^ var198);
         if (var44 == var139) {
            var198 = 113277635 ^ var198;
            int var46 = var1.getHeight();
            short var140 = (short)(1754593690 ^ var198);
            if (var46 == var140) {
               var198 = 560343512 ^ var198;
               byte var48 = (byte)((this.hashChecked) ? 1 : 0);
               if (var48 == (1240650178 ^ var198)) {
                  var198 = 671482822 ^ var198;
                  byte var141 = (byte)(1643434501 ^ var198);
                  this.hashChecked = (var141 != 0);
                  OptionalLong var51 = hashedSeed(var1);
                  byte var53 = (byte)((var51.isPresent()) ? 1 : 0);
                  if (var53 != (1643434500 ^ var198)) {
                     var198 = 1451169266 ^ var198;
                     long var55 = this.seed;
                     long var169 = var51.getAsLong();
                     byte var57 = (byte)((matchesHashedSeed(var55, var169)) ? 1 : 0);
                     if (var57 == (931907574 ^ var198)) {
                        var198 = 235815330 ^ var198;
                        List var59 = this.notices;
                        long var143 = this.seed;
                        String var145 = "Seed " + var143 + " does not match this server. Check the seed.";
                        boolean var60 = var59.add(var145);
                        var198 = 1425189518 ^ var198;
                     } else {
                        var198 = 1526524716 ^ var198;
                     }
                  } else {
                     var198 = dhopmbrhacyntlcp(var198, 209977054);
                  }
               } else {
                  label162:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var198)) {
                        case 173392875:
                           break;
                        case 256262037:
                           var198 ^= 612760856;
                        case 972964904:
                           break label162;
                        case 1616027781:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               }

               Minecraft var61 = Minecraft.getInstance();
               LocalPlayer var63 = var61.player;
               if (var63 != null) {
                  var198 = 1544936925 ^ var198;
                  LocalPlayer var172 = var61.player;
                  ChunkPos var173 = var172.chunkPosition();
                  Options var184 = var61.options;
                  OptionInstance var185 = var184.renderDistance();
                  Object var186 = var185.get();
                  Integer var187 = (Integer)var186;
                  int var188 = var187;
                  byte var8 = (byte)(828567823 ^ var198);
                  int var189 = Math.min(var188, var8);
                  this.updateArea(var1, var173, var189);
                  var198 = 1524923250 ^ var198;
               } else {
                  label154:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var198)) {
                        case 68586385:
                           var198 ^= 116500143;
                        case 531612113:
                           break label154;
                        case 1280538645:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1837166737:
                     }
                  }
               }

               this.copyArrived(var1, var2);
               ArrayList var66 = new ArrayList();
               ArrayList var195 = var66;
               b$b var68 = clientView(var1);
               b$b var12 = var68;
               LongArrayFIFOQueue var70 = this.toJudge;
               int var71 = var70.size();
               int var13 = var71;
               var198 = 185262888 ^ var198;

               label146:
               while (true) {
                  int var72 = var13;
                  var13 += -1619814750 ^ var198;
                  if (var72 <= (1619814749 ^ var198)) {
                     var198 = dhopmbrhacyntlcp(var198, 211119126);
                     return var195;
                  }

                  var198 = 2092075046 ^ var198;
                  LongArrayFIFOQueue var74 = this.toJudge;
                  byte var75 = (byte)((var74.isEmpty()) ? 1 : 0);
                  if (var75 != (473883003 ^ var198)) {
                     var198 = dhopmbrhacyntlcp(var198, 1881662512);
                     return var195;
                  }

                  var198 = 2039020328 ^ var198;
                  long var76 = System.nanoTime();
                  long var229;
                  int var78 = (var229 = var76 - var2) == 0L ? 0 : (var229 < 0L ? -1 : 1);
                  if (var78 >= (1706433107 ^ var198)) {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var198)) {
                           case 84981430:
                              var198 = 162471704 ^ var198;
                              return var195;
                           case 436558406:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1226826846:
                              break;
                           case 2014962640:
                              return var195;
                        }
                     }
                  }

                  var198 = 427300271 ^ var198;
                  LongArrayFIFOQueue var80 = this.toJudge;
                  long var81 = var80.dequeueLong();
                  LongOpenHashSet var84 = this.judgeQueued;
                  boolean var85 = var84.remove(var81);
                  Long2LongOpenHashMap var87 = this.settling;
                  byte var88 = (byte)((var87.containsKey(var81)) ? 1 : 0);
                  if (var88 != (2093879292 ^ var198)) {
                     var198 = 211176794 ^ var198;
                     Long2LongOpenHashMap var90 = this.settling;
                     long var91 = var90.get(var81);
                     long var179 = this.ticks;
                     long var230;
                     int var93 = (var230 = var91 - var179) == 0L ? 0 : (var230 < 0L ? -1 : 1);
                     if (var93 > (1884832422 ^ var198)) {
                        var198 = 748004605 ^ var198;
                        this.queueJudge(var81);
                        var198 = 1010929414 ^ var198;
                        continue;
                     }

                     var198 = 36317690 ^ var198;
                     Long2LongOpenHashMap var96 = this.settling;
                     long var97 = var96.remove(var81);
                     var198 = 1922545861 ^ var198;
                  } else {
                     var198 = 2083249253 ^ var198;
                  }

                  Long2ObjectOpenHashMap var100 = this.clusters;
                  Object var101 = var100.get(var81);
                  List var102 = (List)var101;
                  if (var102 != null) {
                     var198 ^= 255962492;
                     LongOpenHashSet var105 = this.area;
                     byte var106 = (byte)((var105.contains(var81)) ? 1 : 0);
                     if (var106 != (262438629 ^ var198)) {
                        var198 = 814855990 ^ var198;
                        a$c var108 = this.judge(var81, var102, var12);
                        if (var108 != null) {
                           var198 = 1978369535 ^ var198;
                           Long2ObjectOpenHashMap var111 = this.results;
                           Object var112 = var111.put(var81, var108);
                           boolean var114 = var195.add(var108);
                           var198 = 1418922375 ^ var198;
                        } else {
                           var198 = dhopmbrhacyntlcp(var198, 561548408);
                        }
                     } else {
                        label141:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var198)) {
                              case 227833421:
                                 break label141;
                              case 240040575:
                                 var198 ^= 300497742;
                                 break label141;
                              case 654055985:
                                 break;
                              case 1112285673:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }
                     }
                  } else {
                     label135:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var198)) {
                           case 14120634:
                              var198 ^= 514364978;
                              break label135;
                           case 319548610:
                              break;
                           case 1114089544:
                              break label135;
                           case 1716090995:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var198)) {
                        case 103633375:
                        default:
                           throw new RuntimeException(new IOException());
                        case 179677366:
                           var198 ^= 2126589174;
                           continue label146;
                        case 382350995:
                           break;
                        case 795258393:
                           continue label146;
                     }
                  }
               }
            }

            var198 = dhopmbrhacyntlcp(var198, 35190174);
         } else {
            var198 = dhopmbrhacyntlcp(var198, 81301341);
         }

         byte var117 = (byte)((this.wrongHeight) ? 1 : 0);
         if (var117 == (1787563396 ^ var198)) {
            var198 = 208825633 ^ var198;
            byte var167 = (byte)(1727946916 ^ var198);
            this.wrongHeight = (var167 != 0);
            List var120 = this.notices;
            String var168 = ycqveoiykz(zedkfkffeoxsgpb(), fzbbxmpwpsxklsa(), var198);
            boolean var121 = var120.add(var168);
            var198 = 1515798276 ^ var198;
         } else {
            var198 = 1445679653 ^ var198;
         }

         return List.of();
      }
   }

   private a$c judge(long var1, List<b$c> var3, b$b var4) {
      int var48 = 1568831586 ^ 1722622729 ^ 112290214;
      var48 = 1772938894 ^ var48;
      int var36 = var3.size();
      ArrayList var5 = new ArrayList(var36);
      ArrayList var12 = var5;
      Iterator var17 = var3.iterator();
      Iterator var13 = var17;
      var48 = 1042856871 ^ var48;

      while (true) {
         byte var19 = (byte)((var13.hasNext()) ? 1 : 0);
         if (var19 == (1780117476 ^ var48)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var48)) {
                  case 227758803:
                     var48 ^= 1342886586;
                  case 1310534808:
                     byte var29 = (byte)((this.distrusted) ? 1 : 0);
                     a$c var32;
                     if (var29 != (974175582 ^ var48)) {
                        var48 = 957760488 ^ var48;
                        byte var9 = (byte)(50790070 ^ var48);
                        byte var10 = (byte)(50790070 ^ var48);
                        long[] var45 = new long[var10];
                        List var11 = List.of();
                        var32 = new a$c(var1, var9, var45, var11);
                        var48 = dhopmbrhacyntlcp(var48, 929291810);
                     } else {
                        var48 = 1975076579 ^ var48;
                        Long2ObjectOpenHashMap var39 = this.results;
                        Object var40 = var39.get(var1);
                        a$c var41 = (a$c)var40;
                        var32 = decide(var1, var41, var12);
                        var48 = 2077023017 ^ var48;
                     }

                     return var32;
                  case 1226836696:
                  default:
                     throw new IllegalStateException();
                  case 1334718770:
               }
            }
         }

         var48 = 570139392 ^ var48;
         Object var21 = var13.next();
         b$c var22 = (b$c)var21;
         byte var37 = (byte)(1273089253 ^ var48);
         b$f var24 = b.judge(var22, var4, var37);
         boolean var26 = var12.add(var24);
         this.count(var24);
         var48 = 570139392 ^ var48;
      }
   }

   static a$c decide(long var0, a$c var2, List<b$f> var3) {
      int var134 = 1834943349 ^ 1842690312 ^ 1645248852;
      var134 = 2118602514 ^ var134;
      HashMap var4 = new HashMap();
      HashMap var10 = var4;
      if (var2 != null) {
         var134 = 228907994 ^ var134;
         List var24 = var2.verdicts();
         Iterator var25 = var24.iterator();
         Iterator var11 = var25;
         var134 = 1815760578 ^ var134;

         label149:
         while (true) {
            byte var27 = (byte)((var11.hasNext()) ? 1 : 0);
            if (var27 == (2101567779 ^ var134)) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                     case 45281648:
                        var134 ^= 1640323991;
                        break label149;
                     case 767678390:
                        break;
                     case 1887354364:
                        break label149;
                     case 2005016644:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            var134 = 1046066086 ^ var134;
            Object var29 = var11.next();
            b$f var30 = (b$f)var29;
            b$d var32 = var30.status();
            b$d var84 = b$d.INCOMPLETE;
            if (var32 != var84) {
               var134 = 1586338822 ^ var134;
               long var86 = var30.owner();
               byte var122 = var30.kind();
               long var88 = clusterKey(var86, var122);
               Long var90 = var88;
               Object var34 = var10.put(var90, var30);
               var134 = 1174005770 ^ var134;
            } else {
               label145:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                     case 33797371:
                        var134 ^= 460616716;
                        break label145;
                     case 1057634282:
                     default:
                        throw new RuntimeException();
                     case 1160223920:
                        break;
                     case 1334892211:
                        break label145;
                  }
               }
            }

            var134 = dhopmbrhacyntlcp(var134, 623757226);
         }
      } else {
         var134 = dhopmbrhacyntlcp(var134, 6016655);
      }

      byte var35 = (byte)(478558900 ^ var134);
      byte var127 = var35;
      int var111 = var3.size();
      ArrayList var36 = new ArrayList(var111);
      ArrayList var128 = var36;
      LongArrayList var37 = new LongArrayList();
      LongArrayList var13 = var37;
      LongArrayList var38 = new LongArrayList();
      LongArrayList var14 = var38;
      Iterator var40 = var3.iterator();
      Iterator var15 = var40;
      var134 = 122337411 ^ var134;

      while (true) {
         byte var42 = (byte)((var15.hasNext()) ? 1 : 0);
         if (var42 == (466387511 ^ var134)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                  case 98314118:
                     var134 ^= 1778177555;
                  case 823953354:
                     if (var127 != (1915769892 ^ var134)) {
                        var134 = 1199017119 ^ var134;
                        byte var63 = (byte)((var14.isEmpty()) ? 1 : 0);
                        if (var63 != (893900987 ^ var134)) {
                           var134 = 1399376443 ^ var134;
                           return null;
                        }

                        var134 = 1577368455 ^ var134;
                     } else {
                        label90:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                              case 203609376:
                                 break label90;
                              case 222155061:
                                 var134 ^= 426981144;
                                 break label90;
                              case 1313974634:
                              default:
                                 throw new RuntimeException();
                              case 1832210574:
                           }
                        }
                     }

                     long[] var65 = var13.toLongArray();
                     long[] var129 = var65;
                     Arrays.sort(var65);
                     byte var67 = (byte)(1799578428 ^ var134);
                     int var130 = var67;
                     long[] var131 = var65;
                     int var70 = var65.length;
                     int var18 = var70;
                     byte var71 = (byte)(1799578428 ^ var134);
                     int var19 = var71;
                     var134 = 781339928 ^ var134;

                     label82:
                     while (var19 < var18) {
                        label68: {
                           var134 = 175646960 ^ var134;
                           long var75 = var131[var19];
                           if (var130 != (1336477396 ^ var134)) {
                              var134 = 614150649 ^ var134;
                              byte var117 = (byte)(1798453036 ^ var134);
                              int var108 = var130 - var117;
                              long var79 = var129[var108];
                              long var152;
                              int var81 = (var152 = var79 - var75) == 0L ? 0 : (var152 < 0L ? -1 : 1);
                              if (var81 == (1798453037 ^ var134)) {
                                 var134 = 1742716066 ^ var134;
                                 break label68;
                              }

                              var134 = 735282730 ^ var134;
                           } else {
                              label66:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                                    case 173486739:
                                       var134 ^= 256423891;
                                       break label66;
                                    case 646434243:
                                       break;
                                    case 1208693327:
                                    default:
                                       throw new RuntimeException();
                                    case 1845663057:
                                       break label66;
                                 }
                              }
                           }

                           int var109 = var130;
                           var130 += 1088532742 ^ var134;
                           var129[var109] = var75;
                           var134 = 1275869832 ^ var134;
                        }

                        var19 += 216894350 ^ var134;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                              case 151794312:
                                 var134 ^= 1228711339;
                              case 896051860:
                                 continue label82;
                              case 1371663831:
                              default:
                                 throw new RuntimeException();
                              case 1954765781:
                           }
                        }
                     }

                     var134 = dhopmbrhacyntlcp(var134, 282357234);
                     long[] var125 = var14.toLongArray();
                     List var126 = List.copyOf(var128);
                     return new a$c(var0, var130, var125, var126);
                  case 1880187790:
                     break;
                  case 2025141413:
                  default:
                     throw new RuntimeException();
               }
            }
         }

         var134 = 803756179 ^ var134;
         Object var44 = var15.next();
         b$f var45 = (b$f)var44;
         b$f var16 = var45;
         b$d var47 = var45.status();
         b$d var91 = b$d.INCOMPLETE;
         if (var47 == var91) {
            var134 = 721950498 ^ var134;
            long var93 = var45.owner();
            byte var124 = var45.kind();
            long var95 = clusterKey(var93, var124);
            Long var97 = var95;
            Object var49 = var10.get(var97);
            b$f var50 = (b$f)var49;
            if (var50 != null) {
               var134 = 1536074966 ^ var134;
               var16 = var50;
               var134 = dhopmbrhacyntlcp(var134, 52978841);
            } else {
               var134 = dhopmbrhacyntlcp(var134, 1509516599);
               byte var60 = (byte)(1188407472 ^ var134);
               var127 = var60;
               var134 = 23045496 ^ var134;
            }
         } else {
            label109:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                  case 60248700:
                  default:
                     throw new RuntimeException();
                  case 84366265:
                     var134 ^= 1940838253;
                  case 851343063:
                     break label109;
                  case 1914839137:
               }
            }
         }

         boolean var54 = var128.add(var16);
         byte var56 = (byte)((var16.alert()) ? 1 : 0);
         if (var56 != (1200229833 ^ var134)) {
            var134 = 1667807693 ^ var134;
            long[] var100 = var16.changes();
            byte var112 = (byte)(618836996 ^ var134);
            long var101 = var100[var112];
            boolean var58 = var14.add(var101);
            int var104 = var13.size();
            long[] var114 = var16.changes();
            var13.addElements(var104, var114);
            var134 = 2039698553 ^ var134;
         } else {
            label121:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                  case 177945919:
                     var134 ^= 452718004;
                     break label121;
                  case 835653056:
                  default:
                     throw new RuntimeException();
                  case 1011211415:
                     break label121;
                  case 1371839157:
               }
            }
         }

         var134 = 1186816586 ^ var134;
      }
   }

   static void dropOutside(Long2ObjectOpenHashMap<a$c> var0, LongOpenHashSet var1) {
      int var23 = 2125355914 ^ 1394808014 ^ 1645248852;
      var23 = 1741247470 ^ var23;
      FastEntrySet var6 = var0.long2ObjectEntrySet();
      ObjectIterator var7 = var6.fastIterator();
      ObjectIterator var4 = var7;
      var23 = 1005544787 ^ var23;

      while (true) {
         byte var9 = (byte)((var4.hasNext()) ? 1 : 0);
         if (var9 == (331085997 ^ var23)) {
            var23 = dhopmbrhacyntlcp(var23, 1792372958);
            return;
         }

         var23 = 746512509 ^ var23;
         Object var11 = var4.next();
         Entry var12 = (Entry)var11;
         long var20 = var12.getLongKey();
         byte var14 = (byte)((var1.contains(var20)) ? 1 : 0);
         if (var14 == (1069881552 ^ var23)) {
            var23 = 1454284101 ^ var23;
            Object var16 = var12.getValue();
            a$c var17 = (a$c)var16;
            byte var18 = (byte)((var17.flagged()) ? 1 : 0);
            if (var18 == (1768654229 ^ var23)) {
               var23 = 950427154 ^ var23;
               var4.remove();
               var23 = 1354869540 ^ var23;
            } else {
               var23 = 1751643446 ^ var23;
            }
         } else {
            var23 = dhopmbrhacyntlcp(var23, 1053386867);
         }

         var23 = dhopmbrhacyntlcp(var23, 314017806);
      }
   }

   private static long clusterKey(long var0, byte var2) {
      int var15 = 1308639375 ^ 1624271867 ^ 1645248852;
      var15 = 323287866 ^ var15;
      long var5 = 31L;
      long var7 = var0 * var5;
      long var12 = var2;
      return var7 + var12;
   }

   public void blockChanged(BlockPos var1) {
      int var60 = 358963513 ^ 1256352230 ^ 112290214;
      var60 = 702778068 ^ var60;
      byte var14 = (byte)((this.stopped) ? 1 : 0);
      if (var14 != (1893061549 ^ var60)) {
         var60 = 1381370165 ^ var60;
      } else {
         var60 = 608080831 ^ var60;
         int var16 = var1.getY();
         byte var3 = (byte)(-1424703491 ^ var60);
         if (var16 < var3) {
            var60 = dhopmbrhacyntlcp(var60, 1986566794);
         } else {
            var60 = 166591047 ^ var60;
            int var18 = var1.getY();
            byte var41 = (byte)(1560721941 ^ var60);
            if (var18 > var41) {
               var60 = dhopmbrhacyntlcp(var60, 2139447501);
            } else {
               var60 = 307645401 ^ var60;
               int var20 = var1.getX();
               byte var42 = (byte)(1330704776 ^ var60);
               int var21 = var20 >> var42;
               int var8 = var21;
               int var23 = var1.getZ();
               byte var43 = (byte)(1330704776 ^ var60);
               int var24 = var23 >> var43;
               int var9 = var24;
               byte var25 = (byte)(-1330704782 ^ var60);
               int var10 = var25;
               var60 = 1416324595 ^ var60;

               while (true) {
                  byte var44 = (byte)(456889469 ^ var60);
                  if (var10 > var44) {
                     var60 = dhopmbrhacyntlcp(var60, 968380135);
                     break;
                  }

                  var60 = 1461546083 ^ var60;
                  byte var27 = (byte)(-1277622302 ^ var60);
                  int var11 = var27;
                  var60 = 1224492186 ^ var60;

                  while (true) {
                     byte var45 = (byte)(81443972 ^ var60);
                     if (var11 > var45) {
                        label44:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var60)) {
                              case 76354663:
                                 var60 ^= 403248104;
                                 break label44;
                              case 251673118:
                                 break;
                              case 1196019536:
                              default:
                                 throw new RuntimeException();
                              case 1644736611:
                                 break label44;
                           }
                        }

                        var10 += 483635055 ^ var60;
                        var60 = dhopmbrhacyntlcp(var60, 132659985);
                        break;
                     }

                     var60 = 1323614672 ^ var60;
                     int var30 = var8 + var10;
                     int var48 = var9 + var11;
                     long var31 = ChunkPos.asLong(var30, var48);
                     Long2ObjectOpenHashMap var34 = this.clusters;
                     byte var35 = (byte)((var34.containsKey(var31)) ? 1 : 0);
                     if (var35 != (1245609302 ^ var60)) {
                        var60 = 1915269793 ^ var60;
                        Long2LongOpenHashMap var37 = this.settling;
                        long var55 = this.ticks;
                        long var6 = 20L;
                        long var57 = var55 + var6;
                        long var38 = var37.put(var31, var57);
                        this.queueJudge(var31);
                        var60 = 699149139 ^ var60;
                     } else {
                        var60 = dhopmbrhacyntlcp(var60, 1535416818);
                     }

                     var11 += 297460901 ^ var60;
                     var60 = dhopmbrhacyntlcp(var60, 358635554);
                  }
               }
            }
         }
      }
   }

   public void chunkArrived(int var1, int var2) {
      int var26 = 1180969192 ^ 642449527 ^ 112290214;
      var26 = 158171115 ^ var26;
      byte var9 = (byte)((this.stopped) ? 1 : 0);
      if (var9 == (1878212306 ^ var26)) {
         var26 = 242991339 ^ var26;
         byte var4 = (byte)(1636367928 ^ var26);
         this.areaStale = (var4 != 0);
         byte var11 = (byte)(-1636367930 ^ var26);
         int var7 = var11;
         var26 = 300814055 ^ var26;

         label57:
         while (true) {
            byte var16 = (byte)(1885794527 ^ var26);
            if (var7 > var16) {
               var26 = dhopmbrhacyntlcp(var26, 236603539);
               return;
            }

            var26 = 796941232 ^ var26;
            byte var13 = (byte)(-1608952687 ^ var26);
            int var8 = var13;
            var26 = 403266515 ^ var26;

            while (true) {
               byte var17 = (byte)(1206907068 ^ var26);
               if (var8 > var17) {
                  label42:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
                        case 190883201:
                           var26 ^= 1678631116;
                           break label42;
                        case 220419821:
                        default:
                           throw new RuntimeException();
                        case 824094921:
                           break;
                        case 1844138140:
                           break label42;
                     }
                  }

                  var7 += 602017904 ^ var26;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
                        case 38101959:
                           continue label57;
                        case 92658744:
                           var26 ^= 1401217199;
                           continue label57;
                        case 172370883:
                           break;
                        case 229740890:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }

               var26 = 923425601 ^ var26;
               int var19 = var1 + var7;
               int var23 = var2 + var8;
               long var20 = ChunkPos.asLong(var19, var23);
               this.queueJudge(var20);
               var8 += 1894099965 ^ var26;
               var26 = 923425601 ^ var26;
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
               case 149366341:
                  var26 = 294618783 ^ var26;
                  return;
               case 362829012:
               default:
                  throw new RuntimeException();
               case 822412556:
                  break;
               case 1835129743:
                  return;
            }
         }
      }
   }

   static boolean insideWorldLimit(int var0, int var1) {
      int var17 = 1218885202 ^ 2044908362 ^ 1645248852;
      var17 = 1688637467 ^ var17;
      short var2 = (short)(938625374 ^ var17);
      int var10 = -var2;
      if (var0 >= var10) {
         var17 = 201966522 ^ var17;
         if (var0 < var2) {
            var17 = 620019713 ^ var17;
            int var13 = -var2;
            if (var1 >= var13) {
               var17 = 215156981 ^ var17;
               if (var1 < var2) {
                  var17 = 1612990709 ^ var17;
                  byte var9 = (byte)(1945647085 ^ var17);

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var17)) {
                        case 11575201:
                           var17 = 2067456074 ^ var17;
                           return (var9 != 0);
                        case 465245520:
                           break;
                        case 1299924191:
                           return (var9 != 0);
                        case 2133553241:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }

               var17 = dhopmbrhacyntlcp(var17, 983216703);
            } else {
               var17 = 910801610 ^ var17;
            }
         } else {
            var17 = 314407627 ^ var17;
         }
      } else {
         var17 = dhopmbrhacyntlcp(var17, 515160433);
      }

      byte var26 = (byte)(692505894 ^ var17);
      var17 = 562305664 ^ var17;
      return (var26 != 0);
   }

   private void queueJudge(long var1) {
      int var13 = 339305962 ^ 553122969 ^ 112290214;
      var13 = 725129089 ^ var13;
      LongOpenHashSet var6 = this.judgeQueued;
      byte var7 = (byte)((var6.add(var1)) ? 1 : 0);
      if (var7 != (424109908 ^ var13)) {
         var13 = 293427530 ^ var13;
         LongArrayFIFOQueue var9 = this.toJudge;
         var9.enqueue(var1);
         var13 = 1764594682 ^ var13;
      } else {
         var13 = dhopmbrhacyntlcp(var13, 2018560688);
      }
   }

   private void updateArea(ClientLevel var1, ChunkPos var2, int var3) {
      byte var63;
      int var115;
      label95: {
         var115 = 1432920501 ^ 1403926130 ^ 112290214;
         var115 = 1435074584 ^ var115;
         int var15 = var2.x;
         int var64 = this.areaX;
         if (var15 == var64) {
            var115 = 909247599 ^ var115;
            int var17 = var2.z;
            int var66 = this.areaZ;
            if (var17 == var66) {
               var115 = 648114006 ^ var115;
               int var68 = this.areaRadius;
               if (var3 == var68) {
                  var115 = dhopmbrhacyntlcp(var115, 1028442444);
                  var63 = (byte)(2015484940 ^ var115);
                  var115 = 1500711957 ^ var115;
                  break label95;
               }

               var115 = 1580077054 ^ var115;
            } else {
               var115 = 2022662312 ^ var115;
            }
         } else {
            var115 = 1321034951 ^ var115;
         }

         var63 = (byte)(457382591 ^ var115);
         var115 = 974244519 ^ var115;
      }

      if (var63 == (559075353 ^ var115)) {
         var115 = 49300112 ^ var115;
         byte var21 = (byte)((this.areaStale) ? 1 : 0);
         if (var21 == (597856905 ^ var115)) {
            var115 = 64121880 ^ var115;
            return;
         }

         var115 = 724367685 ^ var115;
         long var23 = this.ticks;
         long var6 = 20L;
         long var25 = var23 % var6;
         long var97 = 0L;
         long var128;
         int var27 = (var128 = var25 - var97) == 0L ? 0 : (var128 < 0L ? -1 : 1);
         if (var27 != (143551436 ^ var115)) {
            var115 = dhopmbrhacyntlcp(var115, 687773021);
            return;
         }

         var115 = 1723977023 ^ var115;
      } else {
         label85:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var115)) {
               case 9458274:
                  var115 ^= 1327331050;
                  break label85;
               case 142357547:
                  break;
               case 338459599:
               default:
                  throw new RuntimeException();
               case 859981670:
                  break label85;
            }
         }
      }

      byte var69 = (byte)(1850713843 ^ var115);
      this.areaStale = (var69 != 0);
      int var71 = var2.x;
      this.areaX = var71;
      int var73 = var2.z;
      this.areaZ = var73;
      this.areaRadius = var3;
      LongOpenHashSet var32 = new LongOpenHashSet();
      LongOpenHashSet var12 = var32;
      int var34 = var2.x;
      int var35 = var34 - var3;
      int var13 = var35;
      var115 = 1347356277 ^ var115;

      while (true) {
         int var77 = var2.x;
         int var78 = var77 + var3;
         if (var13 > var78) {
            label47:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var115)) {
                  case 136382723:
                     var115 ^= 1922855857;
                     break label47;
                  case 1482009922:
                  default:
                     throw new RuntimeException();
                  case 1738657191:
                     break label47;
                  case 2106155529:
               }
            }

            this.area = var12;
            Long2ObjectOpenHashMap var50 = this.clusters;
            LongSet var51 = var50.keySet();
            boolean var52 = var51.retainAll(var12);
            Long2ObjectOpenHashMap var54 = this.results;
            dropOutside(var54, var12);
            byte var91 = (byte)(1285346102 ^ var115);
            int var56 = var3 + var91;
            byte var92 = (byte)(1285346102 ^ var115);
            int var57 = var56 + var92;
            byte var93 = (byte)(1285346102 ^ var115);
            int var58 = var57 + var93;
            LongOpenHashSet var60 = this.shownSent;
            LongPredicate var95 = var2x -> {
               int var23x = 530412787 ^ 488176391 ^ 1645248852;
               var23x = 616050287 ^ var23x;
               int var8 = ChunkPos.getX(var2x);
               int var13x = var2.x;
               int var9 = var8 - var13x;
               int var10 = Math.abs(var9);
               int var16 = ChunkPos.getZ(var2x);
               int var20 = var2.z;
               int var17x = var16 - var20;
               int var18 = Math.abs(var17x);
               int var11 = Math.max(var10, var18);
               byte var12x;
               if (var11 > var58) {
                  var23x = 1471266443 ^ var23x;
                  var12x = (byte)(329031237 ^ var23x);
                  var23x = dhopmbrhacyntlcp(var23x, 1830902057);
               } else {
                  var23x = 636176838 ^ var23x;
                  var12x = (byte)(1640392969 ^ var23x);
                  var23x = 528199268 ^ var23x;
               }

               return (var12x != 0);
            };
            boolean var61 = var60.removeIf(var95);
            int var104 = var2.x;
            int var105 = var2.z;
            a$e var96 = new a$e(var12, var104, var105);
            this.send(var96);
            var115 = 1827417510 ^ var115;
            return;
         }

         var115 = 1630133600 ^ var115;
         int var38 = var2.z;
         int var39 = var38 - var3;
         int var14 = var39;
         var115 = 1188500267 ^ var115;

         while (true) {
            int var81 = var2.z;
            int var82 = var81 + var3;
            if (var14 > var82) {
               var115 = dhopmbrhacyntlcp(var115, 1886582789);
               var13 += 1770821321 ^ var115;
               var115 = 1468806734 ^ var115;
               break;
            }

            var115 = 1567125377 ^ var115;
            byte var42 = (byte)((insideWorldLimit(var13, var14)) ? 1 : 0);
            if (var42 == (1150681420 ^ var115)) {
               var115 = 1934069001 ^ var115;
            } else {
               var115 = 1103085940 ^ var115;
               ClientChunkCache var44 = var1.getChunkSource();
               LevelChunk var45 = var44.getChunkNow(var13, var14);
               if (var45 != null) {
                  var115 = 114746917 ^ var115;
                  long var86 = ChunkPos.asLong(var13, var14);
                  boolean var47 = var12.add(var86);
                  var115 = 875473496 ^ var115;
               } else {
                  label65:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var115)) {
                        case 81207581:
                           var115 ^= 855133309;
                           break label65;
                        case 458720268:
                           break;
                        case 641008346:
                           break label65;
                        case 704768722:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }
            }

            var14 += 936479812 ^ var115;
            var115 = dhopmbrhacyntlcp(var115, 774890120);
         }
      }
   }

   private void copyArrived(ClientLevel var1, long var2) {
      int var117 = 1478436624 ^ 1978864666 ^ 112290214;
      var117 = 1145045683 ^ var117;
      int var21 = this.areaRadius;
      if (var21 >= (1864194079 ^ var117)) {
         var117 = 173397724 ^ var117;
         int var23 = this.areaRadius;
         byte var5 = (byte)(1699253954 ^ var117);
         int var24 = var23 + var5;
         byte var74 = (byte)(1699253954 ^ var117);
         int var25 = var24 + var74;
         byte var75 = (byte)(1699253954 ^ var117);
         int var26 = var25 + var75;
         int var11 = var26;
         byte var27 = (byte)(1699253955 ^ var117);
         int var12 = var27;
         var117 = 595368709 ^ var117;

         while (var12 <= var11) {
            var117 = 695750473 ^ var117;
            long var29 = System.nanoTime();
            long var137;
            int var31 = (var137 = var29 - var2) == 0L ? 0 : (var137 < 0L ? -1 : 1);
            if (var31 >= (1867274895 ^ var117)) {
               var117 = 989056976 ^ var117;
               return;
            }

            label66:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                  case 128155705:
                     var117 ^= 1918208299;
                  case 666933606:
                     break label66;
                  case 846066170:
                  default:
                     throw new RuntimeException();
                  case 1535093131:
               }
            }

            int var33 = this.areaX;
            int var34 = var33 - var12;
            int var13 = var34;
            var117 = 1418223762 ^ var117;

            while (true) {
               int var79 = this.areaX;
               int var80 = var79 + var12;
               if (var13 > var80) {
                  var117 = dhopmbrhacyntlcp(var117, 591351919);
                  var12 += 1789846360 ^ var117;
                  var117 = dhopmbrhacyntlcp(var117, 748353183);
                  break;
               }

               var117 = 410856998 ^ var117;
               int var37 = this.areaZ;
               int var38 = var37 - var12;
               int var14 = var38;
               var117 = 553613622 ^ var117;

               while (true) {
                  int var83 = this.areaZ;
                  int var84 = var83 + var12;
                  if (var14 > var84) {
                     var117 = dhopmbrhacyntlcp(var117, 1558550500);
                     var13 += 771126211 ^ var117;
                     var117 = dhopmbrhacyntlcp(var117, 1684521204);
                     break;
                  }

                  var117 = 465139344 ^ var117;
                  int var86 = this.areaX;
                  int var41 = var13 - var86;
                  int var42 = Math.abs(var41);
                  int var106 = this.areaZ;
                  int var88 = var14 - var106;
                  int var89 = Math.abs(var88);
                  int var43 = Math.max(var42, var89);
                  if (var43 != var12) {
                     var117 = 225527796 ^ var117;
                  } else {
                     var117 = 1411302542 ^ var117;
                     long var45 = ChunkPos.asLong(var13, var14);
                     LongOpenHashSet var48 = this.shownSent;
                     byte var49 = (byte)((var48.contains(var45)) ? 1 : 0);
                     if (var49 == (1052005944 ^ var117)) {
                        var117 ^= 1528771253;
                        ClientChunkCache var51 = var1.getChunkSource();
                        LevelChunk var52 = var51.getChunkNow(var13, var14);
                        if (var52 != null) {
                           var117 = 136233890 ^ var117;
                           LevelChunkSection[] var55 = var52.getSections();
                           LevelChunkSection[] var18 = var55;
                           int var57 = var55.length;
                           PalettedContainer[] var58 = new PalettedContainer[var57];
                           PalettedContainer[] var19 = var58;
                           byte var59 = (byte)(1840621359 ^ var117);
                           int var20 = var59;
                           var117 = 2018278677 ^ var117;

                           label112:
                           while (true) {
                              int var96 = var18.length;
                              if (var20 >= var96) {
                                 var117 = 895202182 ^ var117;
                                 LongOpenHashSet var62 = this.shownSent;
                                 boolean var63 = var62.add(var45);
                                 a$d var99 = new a$d(var13, var14, var19);
                                 this.send(var99);
                                 long var65 = System.nanoTime();
                                 long var138;
                                 int var67 = (var138 = var65 - var2) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                                 if (var67 >= (547514812 ^ var117)) {
                                    var117 = 1503789927 ^ var117;
                                    return;
                                 }

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                                       case 255495294:
                                          var117 ^= 1199160574;
                                          break label112;
                                       case 520924174:
                                       default:
                                          throw new RuntimeException();
                                       case 636859077:
                                          break label112;
                                       case 903027119:
                                    }
                                 }
                              }

                              var117 ^= 1274039323;
                              LevelChunkSection var69 = var18[var20];
                              if (var69 != null) {
                                 var117 = 1718132206 ^ var117;
                                 LevelChunkSection var71 = var18[var20];
                                 byte var72 = (byte)((var71.hasOnlyAir()) ? 1 : 0);
                                 if (var72 == (945884111 ^ var117)) {
                                    var117 = 1909947041 ^ var117;
                                    LevelChunkSection var111 = var18[var20];
                                    PalettedContainer var112 = var111.getStates();
                                    PalettedContainer var113 = var112.copy();
                                    var19[var20] = var113;
                                    var117 = 1707795343 ^ var117;
                                 } else {
                                    var117 = 337484078 ^ var117;
                                 }
                              } else {
                                 label97:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                                       case 103992534:
                                          var117 ^= 1920271552;
                                       case 240583957:
                                          break label97;
                                       case 1364676533:
                                       default:
                                          throw new RuntimeException();
                                       case 1643462588:
                                    }
                                 }
                              }

                              var20 += 746361568 ^ var117;

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                                    case 103903471:
                                       var117 ^= 965036251;
                                       continue label112;
                                    case 121800826:
                                       break;
                                    case 1324942360:
                                       continue label112;
                                    case 1478531319:
                                    default:
                                       throw new RuntimeException();
                                 }
                              }
                           }
                        } else {
                           label121:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                                 case 83654522:
                                    var117 ^= 40939983;
                                 case 188169595:
                                    break label121;
                                 case 1476181858:
                                    break;
                                 case 1511098895:
                                 default:
                                    throw new RuntimeException();
                              }
                           }
                        }
                     } else {
                        label132:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                              case 159209912:
                                 var117 ^= 1500480378;
                                 break label132;
                              case 176494410:
                                 break;
                              case 188948667:
                              default:
                                 throw new RuntimeException();
                              case 463962367:
                                 break label132;
                           }
                        }
                     }
                  }

                  var14 += 1742460227 ^ var117;
                  var117 = dhopmbrhacyntlcp(var117, 382218596);
               }
            }
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
               case 134523931:
                  var117 = 427521177 ^ var117;
                  return;
               case 448855998:
               default:
                  throw new RuntimeException();
               case 743083520:
                  return;
               case 1513861428:
            }
         }
      } else {
         var117 = dhopmbrhacyntlcp(var117, 810694976);
      }
   }

   private static b$b clientView(final ClientLevel var0) {
      int var5 = 1801922463 ^ 1074606176 ^ 1645248852;
      var5 = 1622185621 ^ var5;
      return new b$b() {
         private int lastX;
         private int lastZ;
         private LevelChunk last;
         private static int Powk6alORx;
         private transient int f23rp2T4LPT;
         private static byte[] uxfebkkkwj = oaaphkpfleigebl();

         {
            int var11 = 784929297 ^ 1888061006;
            var11 = 508603114 ^ var11;
            var11 = 1176651816 ^ 1482477818 ^ Integer.parseInt("1584309863");
            this.f23rp2T4LPT = 1803961596 ^ Powk6alORx;
            var11 = llwptokdcnslkekz(var11, 782634737);
            int var7 = Integer.MIN_VALUE;
            this.lastX = var7;
            int var8 = Integer.MIN_VALUE;
            this.lastZ = var8;
         }

         @Override
         public BlockState state(int var1, int var2, int var3) {
            int var63;
            label32: {
               var63 = 2114767566 ^ 1287639379 ^ 1873719857;
               var63 = 2081051518 ^ var63;
               byte var5x = (byte)(555219670 ^ var63);
               int var12 = var1 >> var5x;
               byte var33 = (byte)(555219670 ^ var63);
               int var14 = var3 >> var33;
               int var35 = this.lastX;
               if (var12 == var35) {
                  var63 = 782286792 ^ var63;
                  int var37 = this.lastZ;
                  if (var14 == var37) {
                     var63 = llwptokdcnslkekz(var63, 980894016);
                     break label32;
                  }

                  var63 = 2011007827 ^ var63;
               } else {
                  var63 = 1501377691 ^ var63;
               }

               this.lastX = var12;
               this.lastZ = var14;
               ClientLevel var41 = var0;
               ClientChunkCache var42 = var41.getChunkSource();
               LevelChunk var43 = var42.getChunkNow(var12, var14);
               this.last = var43;
               var63 = 1303038483 ^ var63;
            }

            LevelChunk var21 = this.last;
            if (var21 == null) {
               var63 = 1021686319 ^ var63;
               return null;
            } else {
               var63 = 1920522512 ^ var63;
               LevelChunk var24 = this.last;
               int var25 = var24.getSectionIndex(var2);
               if (var25 >= (1203297610 ^ var63)) {
                  var63 = 324444039 ^ var63;
                  LevelChunk var46 = this.last;
                  int var47 = var46.getSectionsCount();
                  if (var25 < var47) {
                     var63 = 1597304251 ^ var63;
                     LevelChunk var29 = this.last;
                     LevelChunkSection var30 = var29.getSection(var25);
                     byte var51 = (byte)(198881145 ^ var63);
                     int var50 = var1 & var51;
                     byte var54 = (byte)(198881145 ^ var63);
                     int var53 = var2 & var54;
                     byte var8 = (byte)(198881145 ^ var63);
                     int var56 = var3 & var8;
                     BlockState var32 = var30.getBlockState(var50, var53, var56);
                     var63 = llwptokdcnslkekz(var63, 1384648793);
                     return var32;
                  }

                  var63 = 1226565053 ^ var63;
               } else {
                  var63 = llwptokdcnslkekz(var63, 1515027002);
               }

               Block var31 = Blocks.VOID_AIR;
               BlockState var71 = var31.defaultBlockState();
               var63 = 1151801439 ^ var63;
               return var71;
            }
         }

         static {
            int var3 = new Random(-5492550136887175075L).nextInt();
            Powk6alORx = -2052178743 ^ var3;
         }

         public static String hohxtpicfq(byte[] var0x, int var1) {
            String var8 = Integer.toString(var1);
            byte[] var9 = var8.getBytes();
            byte[] var6 = var9;
            byte var10 = 0;
            int var7 = var10;

            while (true) {
               int var15 = var0x.length;
               if (var7 >= var15) {
                  Charset var29 = StandardCharsets.UTF_16;
                  return new String(var0x, var29);
               }

               byte var18 = var0x[var7];
               int var33 = var6.length;
               int var30 = var7 % var33;
               byte var26 = var6[var30];
               int var19 = var18 ^ var26;
               byte var20 = (byte)var19;
               var0x[var7] = var20;
               byte var21 = var0x[var7];
               byte[] var27 = uxfebkkkwj;
               byte[] var34 = uxfebkkkwj;
               int var35 = var34.length;
               int var32 = var7 % var35;
               byte var28 = var27[var32];
               int var22 = var21 ^ var28;
               byte var23 = (byte)var22;
               var0x[var7] = var23;
               var7++;
            }
         }

         private static byte[] oaaphkpfleigebl() {
            return new byte[]{19, 101, 50, 48, 58, 38};
         }

         private static int llwptokdcnslkekz(int var0x, int var1) {
            return var1 ^ var0x;
         }
      };
   }

   private void count(b$f var1) {
      int var83;
      var83 = 477429718 ^ 1192746823 ^ 112290214;
      var83 = 364745465 ^ var83;
      int[] var2 = a$b.$SwitchMap$com$wimpyclient$detect$seedscan$BlobJudge$Status;
      b$d var43 = var1.status();
      int var44 = var43.ordinal();
      int var8 = var2[var44];
      label93:
      switch (var8) {
         case 1:
            var83 ^= 222978659;
            break;
         case 2:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var83)) {
                  case 107788050:
                     break;
                  case 207155632:
                     var83 ^= 222978659;
                     break label93;
                  case 1255951619:
                  default:
                     throw new RuntimeException();
                  case 2095074023:
                     break label93;
               }
            }
         case 3:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var83)) {
                  case 207155632:
                     var83 ^= 222978659;
                  case 1091817753:
                     break label93;
                  case 1221077646:
                     break;
                  case 1670859007:
                  default:
                     throw new RuntimeException();
               }
            }
         case 4:
            var83 ^= 222978659;
            break;
         default:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var83)) {
                  case 183348848:
                     return;
                  case 207155632:
                     var83 = 1493176874 ^ var83;
                     return;
                  case 635921989:
                  default:
                     throw new RuntimeException();
                  case 815373665:
               }
            }
      }

      LongOpenHashSet var10 = this.counted;
      long var46 = var1.owner();
      byte var78 = var1.kind();
      long var48 = clusterKey(var46, var78);
      byte var11 = (byte)((var10.add(var48)) ? 1 : 0);
      if (var11 == (1160100269 ^ var83)) {
         var83 = 1386704116 ^ var83;
      } else {
         label70: {
            var83 = dhopmbrhacyntlcp(var83, 1598027460);
            int[] var12 = a$b.$SwitchMap$com$wimpyclient$detect$seedscan$BlobJudge$Status;
            b$d var51 = var1.status();
            int var52 = var51.ordinal();
            int var13 = var12[var52];
            switch (var13) {
               case 1:
                  var83 = dhopmbrhacyntlcp(var83, 451201939);
                  break;
               case 2:
                  var83 = 451201939 ^ var83;
                  break;
               case 3:
                  label66:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var83)) {
                        case 43180993:
                           var83 ^= 1986936470;
                           break label66;
                        case 217082711:
                        default:
                           throw new RuntimeException();
                        case 613828034:
                           break;
                        case 1670475228:
                           break label66;
                     }
                  }

                  int var70 = this.mispredicted;
                  byte var77 = (byte)(1819570686 ^ var83);
                  int var71 = var70 + var77;
                  this.mispredicted = var71;
                  var83 = dhopmbrhacyntlcp(var83, 1590426242);
                  break label70;
               default:
                  var83 = dhopmbrhacyntlcp(var83, 1123490579);
                  int var68 = this.hidden;
                  byte var76 = (byte)(1491948667 ^ var83);
                  int var69 = var68 + var76;
                  this.hidden = var69;
                  var83 = 1783815943 ^ var83;
                  break label70;
            }

            int var53 = this.trusted;
            byte var4 = (byte)(16680187 ^ var83);
            int var54 = var53 + var4;
            this.trusted = var54;
            var83 = dhopmbrhacyntlcp(var83, 843124615);
         }

         int var16 = this.trusted;
         int var56 = this.mispredicted;
         int var17 = var16 + var56;
         byte var19 = (byte)((this.seedWarned) ? 1 : 0);
         if (var19 == (851413885 ^ var83)) {
            var83 = 204005159 ^ var83;
            byte var57 = (byte)(1050104946 ^ var83);
            if (var17 >= var57) {
               var83 = 1006680971 ^ var83;
               int var22 = this.mispredicted;
               double var23 = var22;
               double var72 = 0.5;
               double var79 = var17;
               double var74 = var72 * var79;
               double var101;
               int var25 = (var101 = var23 - var74) == 0.0 ? 0 : (var101 < 0.0 ? -1 : 1);
               if (var25 > (43511761 ^ var83)) {
                  var83 = 299560614 ^ var83;
                  byte var58 = (byte)(323813750 ^ var83);
                  this.seedWarned = (var58 != 0);
                  byte var59 = (byte)(323813750 ^ var83);
                  this.distrusted = (var59 != 0);
                  List var29 = this.notices;
                  long var61 = this.seed;
                  String var63 = "Ores do not match seed " + var61 + ". Advanced alerts are off until you change the seed.";
                  boolean var30 = var29.add(var63);
                  var83 = 1971904533 ^ var83;
               } else {
                  var83 = 1683099315 ^ var83;
               }
            } else {
               var83 = 1481815352 ^ var83;
            }
         } else {
            var83 = dhopmbrhacyntlcp(var83, 1417308703);
         }

         byte var32 = (byte)((this.hiddenWarned) ? 1 : 0);
         if (var32 != (1724244322 ^ var83)) {
            var83 = 449451270 ^ var83;
         } else {
            var83 = 1242675971 ^ var83;
            int var34 = this.hidden;
            byte var64 = (byte)(752114283 ^ var83);
            if (var34 >= var64) {
               var83 = 1086484621 ^ var83;
               int var36 = this.hidden;
               if (var36 > var17) {
                  var83 = 1329896670 ^ var83;
                  byte var66 = (byte)(592623155 ^ var83);
                  this.hiddenWarned = (var66 != 0);
                  List var39 = this.notices;
                  String var67 = ycqveoiykz(tbaxsnbdrfctzjo(), fzbbxmpwpsxklsa(), var83);
                  boolean var40 = var39.add(var67);
                  var83 = 1599947350 ^ var83;
               } else {
                  var83 = dhopmbrhacyntlcp(var83, 270130824);
               }
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var83)) {
                     case 111705654:
                     default:
                        throw new RuntimeException();
                     case 115033039:
                        var83 = 1356574213 ^ var83;
                        return;
                     case 349192604:
                        break;
                     case 2114497259:
                        return;
                  }
               }
            }
         }
      }
   }

   private void send(Object var1) {
      int var14 = 1720169425 ^ 383584061 ^ 112290214;
      var14 = 687654082 ^ var14;
      byte var4 = (byte)((this.stopped) ? 1 : 0);
      if (var4 == (1578572168 ^ var14)) {
         var14 = 1395135863 ^ var14;
         byte var6 = (byte)((this.closed) ? 1 : 0);
         if (var6 == (222235903 ^ var14)) {
            var14 = 433136649 ^ var14;
            ConcurrentLinkedQueue var8 = this.inbox;
            boolean var9 = var8.add(var1);
            Thread var11 = this.worker;
            LockSupport.unpark(var11);
            var14 = 244191960 ^ var14;
         } else {
            var14 = 392115921 ^ var14;
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
               case 105684832:
                  var14 = 1148658598 ^ var14;
                  return;
               case 687259175:
                  return;
               case 991496662:
               default:
                  throw new RuntimeException(new IOException());
               case 1466649282:
            }
         }
      }
   }

   private void release() {
      int var21 = 1148709563 ^ 326894479 ^ 112290214;
      var21 = 1735975774 ^ var21;
      ConcurrentLinkedQueue var3 = this.inbox;
      var3.clear();
      byte var5 = (byte)((this.released) ? 1 : 0);
      if (var5 == (918709196 ^ var21)) {
         var21 = 583847323 ^ var21;
         byte var2 = (byte)(336506454 ^ var21);
         this.released = (var2 != 0);
         Long2ObjectOpenHashMap var8 = this.clusters;
         var8.clear();
         LongArrayFIFOQueue var10 = this.toJudge;
         var10.clear();
         LongOpenHashSet var12 = this.judgeQueued;
         var12.clear();
         Long2LongOpenHashMap var14 = this.settling;
         var14.clear();
         LongOpenHashSet var16 = this.shownSent;
         var16.clear();
         LongOpenHashSet var18 = new LongOpenHashSet();
         this.area = var18;
         var21 = 16609840 ^ var21;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var21)) {
               case 169383833:
                  var21 = 573685675 ^ var21;
                  return;
               case 1501473411:
                  break;
               case 1855587664:
               default:
                  throw new IllegalStateException();
               case 1942631145:
                  return;
            }
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private void work() {
      int var42 = 354718810 ^ 1598022971 ^ 112290214;
      var42 = 1841650581 ^ var42;
      Object var1 = null;
      j var4 = (j)var1;
      Object var8 = null;
      Throwable var5 = (Throwable)var8;
      var42 = 2073736962 ^ var42;

      label155: {
         label146: {
            Throwable var10000;
            try {
               long var10 = this.seed;
               j var12 = j.create(var10);
               var42 ^= 1887667238;
               var4 = var12;
               this.predict(var12);
               var42 ^= 1284292021;
               break label146;
            } catch (Throwable var48) {
               label159: {
                  var10000 = var48;
                  var42 = switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var42)) {
                     case -676355454 -> 281096063 ^ var42;
                     case 1404273585 -> dhopmbrhacyntlcp(var42, 1614981977);
                     default -> throw new RuntimeException(new IllegalAccessException("Error in hash"));
                  };

                  try {
                     Throwable var22 = var10000;
                     var5 = var22;
                     var42 ^= 578102100;
                  } catch (Throwable var47) {
                     var10000 = var47;
                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var42)) {
                        case 1369889146:
                           var42 = dhopmbrhacyntlcp(var42, 1321632514);
                           break label159;
                        default:
                           throw new RuntimeException(new IllegalAccessException("Error in hash"));
                     }
                  }

                  byte var36 = (byte)(1749153914 ^ var42);
                  this.stopped = (var36 != 0);
                  ConcurrentLinkedQueue var26 = this.inbox;
                  var26.clear();
                  var42 = dhopmbrhacyntlcp(var42, 1745476121);
                  break label155;
               }

            }
            Throwable var7;
            while (true) {
               try {
                  Throwable var27 = var10000;
                  var7 = var27;
                  var42 ^= 1765650640;
                  break;
               } catch (Throwable var43) {
                  var10000 = var43;
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var42)) {
                     case 663929192:
                        var42 ^= 0;
                        break;
                     default:
                        throw new RuntimeException(new IllegalAccessException("Error in hash"));
                  }
               }
            }

            byte var37 = (byte)(1842342140 ^ var42);
            this.stopped = (var37 != 0);
            ConcurrentLinkedQueue var30 = this.inbox;
            var30.clear();
            throw new RuntimeException(var7);
         }

         byte var32 = (byte)(1727712706 ^ var42);
         this.stopped = (var32 != 0);
         ConcurrentLinkedQueue var16 = this.inbox;
         var16.clear();
         var42 = dhopmbrhacyntlcp(var42, 1723002785);
      }

      if (var5 != null) {
         var42 = 1777730939 ^ var42;

         label166: {
            label111: {
               label110: {
                  label109: {
                     label108: {
                        label167: {
                           ConcurrentLinkedQueue var19;
                           String var34;
                           label105: {
                              label104: {
                                 try {
                                    var19 = this.outbox;
                                    if (var4 == null) {
                                       var42 ^= 1965764245;
                                       var34 = ycqveoiykz(yufvanrtuxwgyqm(), fzbbxmpwpsxklsa(), var42);
                                       break label104;
                                    }
                                 } catch (Throwable var46) {
                                    switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var42)) {
                                       case -1726510768:
                                          break label109;
                                       case -458732448:
                                          break label110;
                                       case -219070469:
                                          break label108;
                                       case 1307654347:
                                          break label167;
                                       default:
                                          throw new RuntimeException(new IOException("Error in hash"));
                                    }
                                 }

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
                                       case 216007294:
                                          var42 ^= 2057098803;
                                       case 918973734:
                                          try {
                                             var34 = ycqveoiykz(ubpfpbzqeqlirvf(), fzbbxmpwpsxklsa(), var42);
                                             var42 ^= 1836898005;
                                             break label105;
                                          } catch (Throwable var45) {
                                             switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var42)) {
                                                case -1726510768:
                                                   break label109;
                                                case -458732448:
                                                   break label110;
                                                case -219070469:
                                                   break label108;
                                                case 1307654347:
                                                   break label167;
                                                default:
                                                   throw new RuntimeException(new IOException("Error in hash"));
                                             }
                                          }
                                       case 1691333687:
                                          break;
                                       case 1802070106:
                                       default:
                                          throw new IllegalStateException();
                                    }
                                 }
                              }

                              var42 = dhopmbrhacyntlcp(var42, 1657482867);
                           }

                           try {
                              String var38 = String.valueOf(var5);
                              String var35 = var34 + var38;
                              boolean var20 = var19.add(var35);
                              var42 ^= 1619862790;
                              break label166;
                           } catch (Throwable var44) {
                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var42)) {
                                 case -1726510768:
                                    break label109;
                                 case -458732448:
                                    break label110;
                                 case -219070469:
                                    break label108;
                                 case 1307654347:
                                    break;
                                 default:
                                    throw new RuntimeException(new IOException("Error in hash"));
                              }
                           }
                        }

                        var42 = 658319220 ^ var42;
                        break label111;
                     }

                     var42 = 819799954 ^ var42;
                     break label111;
                  }

                  var42 = 1570894151 ^ var42;
                  break label111;
               }

               var42 = 1377176033 ^ var42;
            }

            var42 = 927713641 ^ var42;
            return;
         }

         var42 = 1729874941 ^ var42;
      } else {
         var42 = dhopmbrhacyntlcp(var42, 2038492006);
      }
   }

   private void predict(j var1) {
      int var70 = 384544093 ^ 2017508818 ^ 112290214;
      var70 = 338080863 ^ var70;
      i var2 = new i(var1);
      i var5 = var2;
      byte var10 = (byte)(2084359542 ^ var70);
      byte var6 = var10;
      var70 = 987179583 ^ var70;

      while (true) {
         byte var12 = (byte)((this.closed) ? 1 : 0);
         if (var12 != (1189865289 ^ var70)) {
            var70 = dhopmbrhacyntlcp(var70, 755980193);
            return;
         }

         var70 = 2058231987 ^ var70;

         label87:
         while (true) {
            ConcurrentLinkedQueue var14 = this.inbox;
            Object var15 = var14.poll();
            if (var15 == null) {
               var70 = dhopmbrhacyntlcp(var70, 270195056);
               byte var27 = (byte)((var5.idle()) ? 1 : 0);
               if (var27 != (744431242 ^ var70)) {
                  var70 = 1582695978 ^ var70;
                  long var44 = 50000000L;
                  LockSupport.parkNanos(var44);

                  label70:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                        case 217181631:
                           var70 ^= 998218278;
                           break label70;
                        case 471747246:
                        default:
                           throw new RuntimeException(new IOException());
                        case 756433331:
                           break label70;
                        case 1769649997:
                     }
                  }
               } else {
                  var70 = 580443129 ^ var70;
                  i$b var29 = var5.step();
                  if (var29 != null) {
                     var70 = 1673018477 ^ var70;
                     ConcurrentLinkedQueue var32 = this.outbox;
                     boolean var33 = var32.add(var29);
                     var70 = 608959396 ^ var70;
                  } else {
                     var70 = 1207158729 ^ var70;
                  }

                  if (var6 == (1228145338 ^ var70)) {
                     var70 ^= 736778304;
                     int var36 = var5.compared();
                     byte var52 = (byte)(1658739438 ^ var70);
                     if (var36 >= var52) {
                        var70 ^= 447485957;
                        byte var37 = (byte)(2020754174 ^ var70);
                        var6 = var37;
                        int var39 = var5.mismatched();
                        byte var53 = (byte)(2020754173 ^ var70);
                        int var40 = var39 * var53;
                        int var55 = var5.compared();
                        if (var40 > var55) {
                           var70 = 1329348773 ^ var70;
                           ConcurrentLinkedQueue var42 = this.outbox;
                           long var57 = this.seed;
                           String var59 = "The terrain here does not match seed " + var57 + ". Check the seed.";
                           boolean var43 = var42.add(var59);
                           var70 = 2117632220 ^ var70;
                        } else {
                           label54:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                                 case 157096380:
                                    var70 ^= 822395001;
                                 case 776617899:
                                    break label54;
                                 case 879445697:
                                    break;
                                 case 1339171972:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        }
                     } else {
                        label61:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                              case 191691581:
                                 break;
                              case 261010074:
                                 var70 ^= 732485756;
                              case 831313163:
                                 break label61;
                              case 1608148540:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }
                     }
                  } else {
                     label48:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                           case 232033404:
                              var70 ^= 4358204;
                              break label48;
                           case 1199834375:
                              break;
                           case 1485281526:
                              break label48;
                           case 2138614375:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }
               }

               var70 = 261973455 ^ var70;
               break;
            }

            var70 = 70748638 ^ var70;
            byte var17 = (byte)((var15 instanceof a$e) ? 1 : 0);
            if (var17 != (947015204 ^ var70)) {
               var70 = 1533313815 ^ var70;
               a$e var24 = (a$e)var15;
               LongOpenHashSet var50 = var24.chunks();
               int var63 = var24.x();
               int var66 = var24.z();
               var5.want(var50, var63, var66);
               var70 = dhopmbrhacyntlcp(var70, 106550563);
            } else {
               var70 = dhopmbrhacyntlcp(var70, 332221599);
               byte var19 = (byte)((var15 instanceof a$d) ? 1 : 0);
               if (var19 != (733938363 ^ var70)) {
                  var70 = 1967406830 ^ var70;
                  a$d var21 = (a$d)var15;
                  int var47 = var21.x();
                  int var61 = var21.z();
                  PalettedContainer[] var64 = var21.sections();
                  k var48 = k.of(var47, var61, var64);
                  var5.offer(var48);
                  var70 = 1001661509 ^ var70;
               } else {
                  var70 = dhopmbrhacyntlcp(var70, 1324358315);
               }
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                  case 71916496:
                     var70 ^= 1493884906;
                  case 632223955:
                     continue label87;
                  case 1807203768:
                     break;
                  case 2108608175:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      }
   }

   static {
      int var3 = new Random(136847930988947224L).nextInt();
      rUAcQTu3J3 = 760880926 ^ var3;
   }

   public static String ycqveoiykz(byte[] var0, byte[] var1, int var2) {
      String var11 = Integer.toString(var2);
      byte[] var12 = var11.getBytes();
      byte[] var9 = var12;
      byte var13 = 0;
      int var10 = var13;

      while (true) {
         int var18 = var0.length;
         if (var10 >= var18) {
            Charset var6 = StandardCharsets.UTF_16;
            return new String(var0, var6);
         }

         byte var21 = var0[var10];
         int var34 = var9.length;
         int var31 = var10 % var34;
         byte var28 = var9[var31];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var10] = var23;
         byte var24 = var0[var10];
         int var36 = var1.length;
         int var33 = var10 % var36;
         byte var30 = var1[var33];
         int var25 = var24 ^ var30;
         byte var26 = (byte)var25;
         var0[var10] = var26;
         var10++;
      }
   }

   private static byte[] fzbbxmpwpsxklsa() {
      return new byte[]{123, 72, 47, 42, 124, 73, 60, 77, 21, 22, 46, 124, 45, 105, 45, 119, 93, 114, 90, 100, 51, 116, 48, 102, 103};
   }

   private static byte[] zedkfkffeoxsgpb() {
      return new byte[]{
         -76,
         -128,
         29,
         92,
         69,
         25,
         10,
         2,
         36,
         64,
         31,
         37,
         31,
         61,
         20,
         38,
         107,
         47,
         107,
         115,
         2,
         16,
         2,
         50,
         94,
         46,
         126,
         120,
         27,
         37,
         120,
         110,
         127,
         80,
         47,
         58,
         74,
         123,
         88,
         116,
         70,
         6,
         64,
         20,
         93,
         39,
         66,
         126,
         87,
         63,
         74,
         13,
         29,
         118,
         69,
         14,
         10,
         84,
         36,
         86,
         31,
         34,
         31,
         42,
         20,
         43,
         107,
         107,
         107,
         37,
         2,
         34,
         2,
         63,
         94,
         38,
         126,
         122,
         27,
         39,
         120,
         106,
         127,
         2,
         47,
         109,
         74,
         123,
         88,
         104,
         70,
         6,
         64,
         9,
         93,
         39,
         66,
         97,
         87,
         53,
         74,
         22,
         29,
         122,
         69,
         21,
         10,
         0,
         36,
         15
      };
   }

   private static byte[] tbaxsnbdrfctzjo() {
      return new byte[]{
         -80,
         -114,
         29,
         72,
         78,
         18,
         13,
         17,
         33,
         80,
         23,
         110,
         27,
         40,
         30,
         35,
         104,
         52,
         111,
         43,
         1,
         39,
         2,
         39,
         86,
         110,
         124,
         114,
         19,
         39,
         127,
         106,
         126,
         65,
         35,
         105,
         73,
         52,
         91,
         116,
         69,
         28,
         67,
         10,
         80,
         117,
         77,
         34,
         80,
         34,
         72,
         16,
         26,
         106,
         73,
         24,
         14,
         91,
         39,
         68,
         31,
         39,
         25,
         40,
         20,
         44,
         107,
         109,
         105,
         45,
         6,
         50,
         5,
         62,
         85,
         52,
         122,
         50,
         27,
         105,
         125,
         72,
         116,
         67,
         32,
         106,
         79,
         125,
         92,
         119,
         66,
         7,
         64,
         9,
         86,
         100,
         69,
         37,
         82,
         1,
         66,
         25,
         25,
         121,
         79,
         22,
         9,
         23,
         32,
         74,
         28,
         56,
         31,
         122,
         28,
         33,
         105,
         38,
         99,
         56,
         5,
         97,
         3,
         35,
         82,
         111,
         125,
         117,
         24,
         34,
         123,
         106,
         124,
         67,
         34,
         112,
         69,
         63,
         95,
         107,
         68,
         4,
         71,
         11,
         81,
         103,
         70,
         40
      };
   }

   private static byte[] yufvanrtuxwgyqm() {
      return new byte[]{
         -79,
         -128,
         22,
         94,
         78,
         20,
         15,
         14,
         35,
         67,
         25,
         43,
         24,
         56,
         20,
         33,
         104,
         32,
         110,
         115,
         10,
         18,
         2,
         60,
         84,
         47,
         126,
         117,
         29,
         43,
         124,
         107,
         116,
         84,
         35,
         56,
         72,
         121,
         80,
         121,
         69,
         10,
         65,
         72,
         82,
         115,
         67,
         41,
         83,
         34,
         66,
         20,
         26,
         110,
         72,
         21,
         5,
         88,
         39,
         64,
         29,
         60,
         27,
         41,
         26,
         110,
         104,
         52,
         99,
         63,
         6,
         43,
         4,
         34,
         94,
         110,
         122,
         97,
         25,
         38,
         127,
         122,
         122,
         64,
         35,
         120,
         69,
         36,
         92,
         59
      };
   }

   private static byte[] ubpfpbzqeqlirvf() {
      return new byte[]{
         -74,
         -123,
         30,
         91,
         73,
         26,
         12,
         13,
         35,
         68,
         28,
         35,
         29,
         63,
         26,
         34,
         107,
         32,
         105,
         118,
         2,
         23,
         5,
         50,
         87,
         44,
         126,
         114,
         24,
         35,
         121,
         108,
         122,
         87,
         32,
         56,
         79,
         108,
         88,
         105,
         66,
         5,
         66,
         28,
         82,
         112,
         70,
         100,
         86,
         54,
         76,
         66,
         25,
         60
      };
   }

   private static int dhopmbrhacyntlcp(int var0, int var1) {
      return var0 ^ var1;
   }
}
