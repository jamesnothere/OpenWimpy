package com.wimpyclient.e;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectCollection;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.ChunkPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class a$b {
   private final List<a$c> members;
   private final Long2ObjectMap<d> crystals;
   private int blocks;
   private boolean qualified;
   private int budding;
   private int innerBlocks;
   private int minX;
   private int minZ;
   private int maxX;
   private int maxZ;
   private int iconY;
   private static int A5HNO6qfzg;
   private transient int FDx7iLbZPw;
   private static byte[] lprtrmxpww = nxzlxknmokkodgl();

   public a$b() {
super();
      int var18 = 2073522374 ^ 1071819364;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
            case 77861868:
               var18 = 1047586844 ^ var18;
            case 2045238169:
               var18 = 1820306267 ^ 50509847 ^ Integer.parseInt("360194546");
               this.FDx7iLbZPw = 1629089601 ^ A5HNO6qfzg;
               var18 = jlteqzdyvpydzqww(var18, 2068117711);
               ArrayList var2 = new ArrayList();
               this.members = var2;
               Long2ObjectOpenHashMap var10 = new Long2ObjectOpenHashMap();
               this.crystals = var10;
               int var11 = Integer.MAX_VALUE;
               this.minX = var11;
               int var12 = Integer.MAX_VALUE;
               this.minZ = var12;
               int var13 = Integer.MIN_VALUE;
               this.maxX = var13;
               int var14 = Integer.MIN_VALUE;
               this.maxZ = var14;
               int var15 = Integer.MIN_VALUE;
               this.iconY = var15;
               return;
            case 607165862:
            default:
               throw new RuntimeException(new IOException());
            case 737811000:
         }
      }
   }

   public void add(a$c var1) {
      int var88 = 1271257109 ^ 1285128365 ^ 969345420;
      var88 = 1301631457 ^ var88;
      List var12 = this.members;
      boolean var13 = var12.add(var1);
      int var40 = this.blocks;
      int var66 = var1.blocks();
      int var41 = var40 + var66;
      this.blocks = var41;
      boolean var42 = this.qualified;
      boolean var68 = var1.qualified();
      boolean var43 = var42 | var68;
      this.qualified = var43;
      int var44 = this.budding;
      int var70 = var1.budding();
      int var45 = var44 + var70;
      this.budding = var45;
      int var46 = this.innerBlocks;
      int var72 = var1.innerBlocks();
      int var47 = var46 + var72;
      this.innerBlocks = var47;
      int var49 = this.minX;
      int var74 = var1.minX();
      int var50 = Math.min(var49, var74);
      this.minX = var50;
      int var52 = this.minZ;
      int var76 = var1.minZ();
      int var53 = Math.min(var52, var76);
      this.minZ = var53;
      int var55 = this.maxX;
      int var78 = var1.maxX();
      int var56 = Math.max(var55, var78);
      this.maxX = var56;
      int var58 = this.maxZ;
      int var80 = var1.maxZ();
      int var59 = Math.max(var58, var80);
      this.maxZ = var59;
      List var23 = var1.crystals();
      Iterator var24 = var23.iterator();
      Iterator var8 = var24;
      var88 = 1098482374 ^ var88;

      while (true) {
         byte var26 = (byte)((var8.hasNext()) ? 1 : 0);
         if (var26 == (846692883 ^ var88)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var88)) {
                  case 20482480:
                  default:
                     throw new IllegalStateException();
                  case 29867635:
                     var88 ^= 1785237866;
                  case 1553688608:
                     int var38 = var1.iconY();
                     int var63 = this.iconY;
                     if (var38 > var63) {
                        var88 = 2088162406 ^ var88;
                        int var65 = var1.iconY();
                        this.iconY = var65;
                        var88 = 629837770 ^ var88;
                     } else {
                        var88 = 1509710764 ^ var88;
                     }

                     return;
                  case 2087957011:
               }
            }
         }

         var88 = 1926977861 ^ var88;
         Object var28 = var8.next();
         d var29 = (d)var28;
         BlockPos var31 = var29.pos();
         long var32 = var31.asLong();
         Long2ObjectMap var35 = this.crystals;
         Long2ObjectMap var81 = this.crystals;
         Object var82 = var81.get(var32);
         d var83 = (d)var82;
         d var84 = d.prefer(var83, var29);
         Object var36 = var35.put(var32, var84);
         var88 = 1926977861 ^ var88;
      }
   }

   public long centroidChunkKey() {
      int var14 = 1602631363 ^ 574640397 ^ 969345420;
      var14 = 897305759 ^ var14;
      BlockPos var4 = this.icon();
      int var6 = var4.getX();
      int var7 = SectionPos.blockToSectionCoord(var6);
      int var10 = var4.getZ();
      int var11 = SectionPos.blockToSectionCoord(var10);
      return ChunkPos.asLong(var7, var11);
   }

   public LongOpenHashSet memberChunkKeys() {
      int var61 = 1863484646 ^ 985227617 ^ 969345420;
      var61 = 336229344 ^ var61;
      byte var2 = (byte)(2019991535 ^ var61);
      List var54 = this.members;
      int var55 = var54.size();
      byte var4 = (byte)(2019991529 ^ var61);
      int var56 = var55 * var4;
      int var49 = Math.max(var2, var56);
      LongOpenHashSet var1 = new LongOpenHashSet(var49);
      LongOpenHashSet var5 = var1;
      List var9 = this.members;
      Iterator var10 = var9.iterator();
      Iterator var6 = var10;
      var61 = 936102252 ^ var61;

      label51:
      while (true) {
         byte var12 = (byte)((var6.hasNext()) ? 1 : 0);
            var61 ^= 2021438546;
         if (var12 != (1336759943 ^ var61)) {
            Object var33 = var6.next();
            a$c var34 = (a$c)var33;
            long var47 = var34.chunkKey();
            boolean var36 = var5.add(var47);

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var61)) {
                  case 203853997:
                     var61 ^= 2021438546;
                  case 1705124894:
                     continue label51;
                  case 1783180203:
                  default:
                     throw new IllegalStateException();
                  case 2009214229:
               }
            }
         }

         label45:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var61)) {
               case 174037000:
                  var61 ^= 758381911;
               case 823099178:
                  break label45;
               case 1331386052:
               default:
                  throw new IllegalStateException();
               case 1667529063:
            }
         }

         Long2ObjectMap var14 = this.crystals;
         ObjectCollection var15 = var14.values();
         ObjectIterator var16 = var15.iterator();
         ObjectIterator var57 = var16;
         var61 = 1305363095 ^ var61;

         while (true) {
            byte var18 = (byte)((var57.hasNext()) ? 1 : 0);
            if (var18 == (793831751 ^ var61)) {
               var61 = jlteqzdyvpydzqww(var61, 474826377);
               byte var20 = (byte)((var5.isEmpty()) ? 1 : 0);
               if (var20 != (857583566 ^ var61)) {
                  var61 = 676523228 ^ var61;
                  long var38 = this.centroidChunkKey();
                  boolean var22 = var5.add(var38);
                  var61 = 1222950475 ^ var61;
               } else {
                  var61 = 1622561431 ^ var61;
               }

               return var5;
            }

            var61 = 1305703036 ^ var61;
            Object var25 = var57.next();
            d var26 = (d)var25;
            d$a var28 = var26.kind();
            byte var29 = (byte)((var28.countsAsCluster()) ? 1 : 0);
            if (var29 == (1652792123 ^ var61)) {
               var61 = 850268461 ^ var61;
               var61 = jlteqzdyvpydzqww(var61, 2138923857);
            } else {
               var61 = 981843443 ^ var61;
               BlockPos var41 = var26.pos();
               int var42 = var41.getX();
               int var43 = SectionPos.blockToSectionCoord(var42);
               BlockPos var51 = var26.pos();
               int var52 = var51.getZ();
               int var53 = SectionPos.blockToSectionCoord(var52);
               long var44 = ChunkPos.asLong(var43, var53);
               boolean var31 = var5.add(var44);
               var61 = 2002177935 ^ var61;
            }
         }
      }
   }

   public int confirmedGrownInChunk(long var1) {
      int var39 = 254691502 ^ 1646615725 ^ 969345420;
      var39 = 827665567 ^ var39;
      byte var3 = (byte)(1704538384 ^ var39);
      int var7 = var3;
      Long2ObjectMap var13 = this.crystals;
      ObjectCollection var14 = var13.values();
      ObjectIterator var15 = var14.iterator();
      ObjectIterator var8 = var15;
      var39 = 883259875 ^ var39;

      while (true) {
         byte var17 = (byte)((var8.hasNext()) ? 1 : 0);
         if (var17 == (1362905331 ^ var39)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                  case 224697450:
                     var39 = 2068983045 ^ var39;
                  case 2044565936:
                     return var7;
                  case 398678953:
                  default:
                     throw new RuntimeException(new IOException());
                  case 749170384:
               }
            }
         }

         var39 = 1796258043 ^ var39;
         Object var19 = var8.next();
         d var20 = (d)var19;
         d$a var22 = var20.kind();
         byte var23 = (byte)((var22.countsAsCluster()) ? 1 : 0);
         if (var23 == (976023560 ^ var39)) {
            var39 = 325291963 ^ var39;
            var39 = 2020816704 ^ var39;
         } else {
            var39 = 1962058427 ^ var39;
            BlockPos var25 = var20.pos();
            int var26 = var25.getX();
            int var27 = SectionPos.blockToSectionCoord(var26);
            BlockPos var34 = var20.pos();
            int var35 = var34.getZ();
            int var36 = SectionPos.blockToSectionCoord(var35);
            long var28 = ChunkPos.asLong(var27, var36);
            long var48;
            int var32 = (var48 = var28 - var1) == 0L ? 0 : (var48 < 0L ? -1 : 1);
            if (var32 == (1323193011 ^ var39)) {
               var39 = 1599679790 ^ var39;
               var7 += 294092700 ^ var39;
               var39 = 165305265 ^ var39;
            } else {
               var39 = jlteqzdyvpydzqww(var39, 1451456159);
            }

            var39 = jlteqzdyvpydzqww(var39, 1231121631);
         }
      }
   }

   private int blocksInChunk(long var1) {
      int var24 = 33458120 ^ 1877260617 ^ 969345420;
      var24 = 459324207 ^ var24;
      List var8 = this.members;
      Iterator var9 = var8.iterator();
      Iterator var6 = var9;
      var24 = 1464270890 ^ var24;

      label27:
      while (true) {
         byte var11 = (byte)((var6.hasNext()) ? 1 : 0);
         if (var11 == (469404680 ^ var24)) {
            var24 = 1569380871 ^ var24;
            return (byte)(1181767183 ^ var24);
         }

         var24 = 551669669 ^ var24;
         Object var14 = var6.next();
         a$c var15 = (a$c)var14;
         long var17 = var15.chunkKey();
         long var30;
         int var19 = (var30 = var17 - var1) == 0L ? 0 : (var30 < 0L ? -1 : 1);
         if (var19 == (991642541 ^ var24)) {
            var24 = 497376709 ^ var24;
            return var15.blocks();
         }

         var24 = 2011174836 ^ var24;

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var24)) {
               case 86425099:
                  var24 ^= 1459738641;
                  continue label27;
               case 833392459:
               default:
                  throw new RuntimeException(new IOException());
               case 838009992:
                  break;
               case 1682567996:
                  continue label27;
            }
         }
      }
   }

   private int innerInChunk(long var1) {
      int var24 = 1552062852 ^ 1583757374 ^ 969345420;
      var24 = 1314353659 ^ var24;
      List var8 = this.members;
      Iterator var9 = var8.iterator();
      Iterator var6 = var9;
      var24 = 898570638 ^ var24;

      while (true) {
         byte var11 = (byte)((var6.hasNext()) ? 1 : 0);
         if (var11 == (1090240579 ^ var24)) {
            var24 = jlteqzdyvpydzqww(var24, 2035616873);
            return (byte)(967756842 ^ var24);
         }

         var24 = 174932223 ^ var24;
         Object var13 = var6.next();
         a$c var14 = (a$c)var13;
         long var16 = var14.chunkKey();
         long var31;
         int var18 = (var31 = var16 - var1) == 0L ? 0 : (var31 < 0L ? -1 : 1);
         if (var18 == (1251377340 ^ var24)) {
            var24 = 819692418 ^ var24;
            return var14.innerBlocks();
         }

         var24 = 760753173 ^ var24;
         var24 = 657812714 ^ var24;
      }
   }

   public BlockPos icon() {
      int var31 = 84077737 ^ 376860249 ^ 969345420;
      var31 = 109606632 ^ var31;
      List var9 = this.members;
      byte var2 = (byte)(742129044 ^ var31);
      Object var10 = var9.get(var2);
      a$c var11 = (a$c)var10;
      a$c var6 = var11;
      List var13 = this.members;
      Iterator var14 = var13.iterator();
      Iterator var7 = var14;
      var31 = 1852951835 ^ var31;

      while (true) {
         byte var16 = (byte)((var7.hasNext()) ? 1 : 0);
         if (var16 == (1112158351 ^ var31)) {
            label32:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
                  case 7339103:
                     var31 = 173173120 ^ var31;
                     break label32;
                  case 1283302190:
                     break;
                  case 1461773824:
                     break label32;
                  case 1560552597:
                  default:
                     throw new RuntimeException();
               }
            }

            int var26 = var6.iconX();
            int var27 = var6.iconY();
            int var28 = var6.iconZ();
            return new BlockPos(var26, var27, var28);
         }

         var31 = 1118773152 ^ var31;
         Object var19 = var7.next();
         a$c var20 = (a$c)var19;
         int var22 = var20.blocks();
         int var25 = var6.blocks();
         if (var22 > var25) {
            var31 = 1846608827 ^ var31;
            var6 = var20;
            var31 = 1883369443 ^ var31;
         } else {
            label23:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
                  case 14081241:
                     var31 ^= 508619864;
                     break label23;
                  case 1646417149:
                  default:
                     throw new RuntimeException();
                  case 1672653267:
                     break;
                  case 1995913225:
                     break label23;
               }
            }
         }

         var31 = jlteqzdyvpydzqww(var31, 1560278008);
      }
   }

   public int clusterCount() {
      int var5 = 1187300007 ^ 1145825670 ^ 969345420;
      var5 = 915812823 ^ var5;
      return this.visibleClusterCount();
   }

   public int visibleClusterCount() {
      int var20 = 1494667357 ^ 1993691909 ^ 969345420;
      var20 = 1524826692 ^ var20;
      byte var1 = (byte)(1290242192 ^ var20);
      int var2 = var1;
      Long2ObjectMap var6 = this.crystals;
      ObjectCollection var7 = var6.values();
      ObjectIterator var8 = var7.iterator();
      ObjectIterator var3 = var8;
      var20 = 1818143881 ^ var20;

      while (true) {
         byte var10 = (byte)((var3.hasNext()) ? 1 : 0);
         if (var10 != (549004313 ^ var20)) {
            var20 = 1757893019 ^ var20;
            Object var13 = var3.next();
            d var14 = (d)var13;
            d$a var16 = var14.kind();
            byte var17 = (byte)((var16.countsAsCluster()) ? 1 : 0);
            if (var17 != (1216247170 ^ var20)) {
               var20 = 1348692122 ^ var20;
               var2 += 404561177 ^ var20;
               var20 = 1527611069 ^ var20;
            } else {
               label26:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
                     case 209013717:
                        var20 ^= 191764007;
                        break label26;
                     case 457187388:
                     default:
                        throw new IllegalStateException();
                     case 1709091647:
                        break;
                     case 1781254506:
                        break label26;
                  }
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
                  case 199264856:
                  default:
                     throw new IllegalStateException();
                  case 258381129:
                     var20 = 1005820945 ^ var20;
                     return var2;
                  case 1531691923:
                     break;
                  case 1758565765:
                     return var2;
               }
            }
         }

         var20 = 1672038332 ^ var20;
      }
   }

   public boolean worthHud() {
      int var9 = 1370078510 ^ 627649791 ^ 969345420;
      var9 = 1815066650 ^ var9;
      byte var3 = (byte)((this.qualified) ? 1 : 0);
      if (var3 != (556277831 ^ var9)) {
         var9 = 377389060 ^ var9;
         int var5 = this.blocks;
         byte var2 = (byte)(928424002 ^ var9);
         if (var5 >= var2) {
            var9 = 186150163 ^ var9;
            byte var6 = (byte)(1011797329 ^ var9);
            var9 = jlteqzdyvpydzqww(var9, 148722524);
            return (var6 != 0);
         }

         var9 = jlteqzdyvpydzqww(var9, 890986105);
      } else {
         var9 = 593878653 ^ var9;
      }

      byte var16 = (byte)(38665786 ^ var9);
      var9 = 920543286 ^ var9;
      return (var16 != 0);
   }

   public List<d> crystalList() {
      int var32 = 1527992979 ^ 2143197926 ^ 969345420;
      var32 = 508188530 ^ var32;
      Long2ObjectMap var6 = this.crystals;
      byte var7 = (byte)((var6.isEmpty()) ? 1 : 0);
      if (var7 != (52467339 ^ var32)) {
         var32 = 35656097 ^ var32;
         return List.of();
      } else {
         var32 = 740526316 ^ var32;
         ArrayList var8 = new ArrayList();
         ArrayList var2 = var8;
         Long2ObjectMap var10 = this.crystals;
         ObjectCollection var11 = var10.values();
         ObjectIterator var12 = var11.iterator();
         ObjectIterator var3 = var12;
         var32 = 412604988 ^ var32;

         while (true) {
            label56:
            while (true) {
               label53:
               while (true) {
                  byte var14 = (byte)((var3.hasNext()) ? 1 : 0);
                  if (var14 == (932496475 ^ var32)) {
                     var32 = 1205825032 ^ var32;
                     break;
                  }

                  var32 = 344080711 ^ var32;
                  Object var16 = var3.next();
                  d var17 = (d)var16;
                  d$a var19 = var17.kind();
                  byte var21 = (byte)((var19.countsAsCluster()) ? 1 : 0);
                  if (var21 == (588678428 ^ var32)) {
                     var32 = 293813898 ^ var32;

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
                           case 33696231:
                              var32 ^= 83984333;
                              continue label53;
                           case 106936726:
                              break;
                           case 423301215:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1259062383:
                              continue label53;
                        }
                     }
                  } else {
                     var32 = jlteqzdyvpydzqww(var32, 662044044);
                     boolean var23 = var2.add(var17);
                     int var25 = var2.size();
                     byte var29 = (byte)(73627824 ^ var32);
                     if (var25 >= var29) {
                        var32 = 96270683 ^ var32;
                        var32 = jlteqzdyvpydzqww(var32, 1905535896);
                        break;
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
                           case 69027172:
                              var32 ^= 2143776051;
                              break label56;
                           case 1252376716:
                              break;
                           case 1606491212:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1890541342:
                              break label56;
                        }
                     }
                  }
               }

               return var2;
            }

            var32 = jlteqzdyvpydzqww(var32, 1278267896);
         }
      }
   }

   static {
      int var3 = new Random(1316503831329789619L).nextInt();
      A5HNO6qfzg = -1465500395 ^ var3;
   }

   public static String gnvglaozkw(byte[] var0, int var1) {
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
         byte[] var28 = lprtrmxpww;
         byte[] var34 = lprtrmxpww;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] nxzlxknmokkodgl() {
      return new byte[]{
         118, 41, 83, 75, 18, 18, 27, 33, 32, 35, 44, 26, 84, 120, 11, 50, 28, 91, 18, 64, 98, 17, 108, 10, 54, 69, 32, 75, 115, 37, 63, 113, 48, 74
      };
   }

   private static int jlteqzdyvpydzqww(int var0, int var1) {
      return var1 ^ var0;
   }
}
