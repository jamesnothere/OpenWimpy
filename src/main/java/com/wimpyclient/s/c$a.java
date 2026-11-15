package com.wimpyclient.s;

import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.FastEntrySet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class c$a {
   final int chunkX;
   final int chunkZ;
   private final Long2ObjectOpenHashMap<ShortArrayList> byPos;
   private final ArrayList<c$b> fogs;
   private static int VDmhN0WHxv;
   private transient int w6KFzwC3Up;
   private static byte[] ycnimrkmwa = bhzqwagtcmatfco();

   c$a(int var1, int var2) {
super();
      int var14 = 736251100 ^ 1842694372;
      
      var14 = 1457789015 ^ var14;
      var14 = 69785837 ^ 1507571677 ^ Integer.parseInt("1293972319");
      this.w6KFzwC3Up = 1432064645 ^ VDmhN0WHxv;
      var14 = aqodafdovtdsypnq(var14, 827804994);
      Long2ObjectOpenHashMap var4 = new Long2ObjectOpenHashMap();
      this.byPos = var4;
      ArrayList var9 = new ArrayList();
      this.fogs = var9;
      this.chunkX = var1;
      this.chunkZ = var2;
   }

   void add(long var1, short var3) {
      int var15 = 577825380 ^ 547232612 ^ 800550433;
      var15 = 1152026277 ^ var15;
      Long2ObjectOpenHashMap var8 = this.byPos;
      Long2ObjectFunction var7 = var0 -> {
         int var6 = 748792300 ^ 1443605952 ^ 2062351524;
         var6 = 1739730127 ^ var6;
         byte var3x = (byte)(1744098373 ^ var6);
         return new ShortArrayList(var3x);
      };
      Object var9 = var8.computeIfAbsent(var1, var7);
      ShortArrayList var10 = (ShortArrayList)var9;
      boolean var11 = var10.add(var3);
   }

   ShortArrayList at(long var1) {
      int var11 = 700519033 ^ 1052486919 ^ 800550433;
      var11 = 426874980 ^ var11;
      Long2ObjectOpenHashMap var6 = this.byPos;
      Object var7 = var6.get(var1);
      return (ShortArrayList)var7;
   }

   void fog(c$b var1) {
      int var8 = 498651611 ^ 446820464 ^ 800550433;
      var8 = 557037050 ^ var8;
      ArrayList var4 = this.fogs;
      boolean var5 = var4.add(var1);
   }

   List<c$b> fogList() {
      int var5 = 1815812864 ^ 1386471247 ^ 800550433;
      var5 = 851062669 ^ var5;
      return this.fogs;
   }

   c build() {
      int var84 = 1254846445 ^ 1266382715 ^ 800550433;
      var84 = 2132614597 ^ var84;
      Long2ObjectOpenHashMap var19 = this.byPos;
      LongSet var20 = var19.keySet();
      long[] var21 = var20.toLongArray();
      long[] var10 = var21;
      Arrays.sort(var21);
      int var24 = var21.length;
      byte var2 = (byte)(1360685939 ^ var84);
      int var25 = var24 + var2;
      int[] var26 = new int[var25];
      int[] var11 = var26;
      byte var27 = (byte)(1360685938 ^ var84);
      int var12 = var27;
      Long2ObjectOpenHashMap var29 = this.byPos;
      FastEntrySet var30 = var29.long2ObjectEntrySet();
      ObjectIterator var31 = var30.iterator();
      ObjectIterator var13 = var31;
      var84 = 362496473 ^ var84;

      label60:
      while (true) {
         byte var33 = (byte)((var13.hasNext()) ? 1 : 0);
         if (var33 == (1149315755 ^ var84)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var84)) {
                  case 79300138:
                     var84 ^= 1468627665;
                  case 787311628:
                     short[] var40 = new short[var12];
                     short[] var81 = var40;
                     byte var41 = (byte)(319311994 ^ var84);
                     int var15 = var41;
                     byte var42 = (byte)(319311994 ^ var84);
                     int var16 = var42;
                     var84 = 388552034 ^ var84;

                     while (true) {
                        int var59 = var10.length;
                        if (var16 >= var59) {
                           var84 = aqodafdovtdsypnq(var84, 1660123484);
                           int var68 = var10.length;
                           var11[var68] = var15;
                           int var74 = this.chunkX;
                           int var76 = this.chunkZ;
                           ArrayList var77 = this.fogs;
                           byte var9 = (byte)(1725168708 ^ var84);
                           c$b[] var80 = new c$b[var9];
                           Object[] var78 = var77.toArray(var80);
                           c$b[] var79 = (c$b[])var78;
                           return new c(var74, var76, var10, var11, var81, var79);
                        }

                        var84 = 843723885 ^ var84;
                        var11[var16] = var15;
                        Long2ObjectOpenHashMap var46 = this.byPos;
                        long var62 = var10[var16];
                        Object var47 = var46.get(var62);
                        ShortArrayList var48 = (ShortArrayList)var47;
                        ShortArrayList var17 = var48;
                        byte var49 = (byte)(912961909 ^ var84);
                        int var18 = var49;
                        var84 = 638640525 ^ var84;

                        label38:
                        while (true) {
                           int var65 = var17.size();
                           if (var18 >= var65) {
                              var84 = aqodafdovtdsypnq(var84, 1277899323);
                              var16 += 1548837570 ^ var84;
                              var84 = aqodafdovtdsypnq(var84, 1483859931);
                              break;
                           }

                           var84 ^= 685709705;
                           int var66 = var15;
                           var15 += 950356336 ^ var84;
                           short var71 = var17.getShort(var18);
                           var81[var66] = var71;
                           var18 += 950356336 ^ var84;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var84)) {
                                 case 230688495:
                                    var84 ^= 685709705;
                                    continue label38;
                                 case 443322089:
                                 default:
                                    throw new RuntimeException();
                                 case 1173339516:
                                    break;
                                 case 1411483789:
                                    continue label38;
                              }
                           }
                        }
                     }
                  case 344656802:
                  default:
                     throw new RuntimeException();
                  case 1971876295:
               }
            }
         }

         var84 ^= 1706762870;
         Object var35 = var13.next();
         Entry var36 = (Entry)var35;
         Object var55 = var36.getValue();
         ShortArrayList var56 = (ShortArrayList)var55;
         int var57 = var56.size();
         int var38 = var12 + var57;
         var12 = var38;

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var84)) {
               case 6311958:
                  var84 ^= 1706762870;
               case 103048429:
                  continue label60;
               case 747958148:
                  break;
               case 2024794897:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   static {
      int var3 = new Random(-4151599161161950212L).nextInt();
      VDmhN0WHxv = 2004991995 ^ var3;
   }

   public static String vklbvbdouh(byte[] var0, int var1) {
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
         byte[] var28 = ycnimrkmwa;
         byte[] var34 = ycnimrkmwa;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] bhzqwagtcmatfco() {
      return new byte[]{33, 17, 20, 102, 37};
   }

   private static int aqodafdovtdsypnq(int var0, int var1) {
      return var1 ^ var0;
   }
}
