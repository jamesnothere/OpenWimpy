package com.wimpyclient.s;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class g$a {
   final h spec;
   final int chunkX;
   final int chunkZ;
   final Long2ByteOpenHashMap writes;
   int fogFrom;
   private static int Eioq5dqnH7;
   private transient int RI8T8Wkwxo;

   g$a(h var1, int var2, int var3) {
super();
      int var17 = 1206986891 ^ 1044909340;
      
      var17 = 1166837398 ^ var17;
      var17 = 313086862 ^ 1281275780 ^ Integer.parseInt("1656899339");
      this.RI8T8Wkwxo = 1063038301 ^ Eioq5dqnH7;
      var17 = 316365418 ^ var17;
      Long2ByteOpenHashMap var5 = new Long2ByteOpenHashMap();
      this.writes = var5;
      byte var11 = -1;
      this.fogFrom = var11;
      this.spec = var1;
      this.chunkX = var2;
      this.chunkZ = var3;
   }

   boolean fogged() {
      int var6 = 109565294 ^ 1781124107 ^ 988479770;
      var6 = 992516387 ^ var6;
      int var2 = this.fogFrom;
      byte var3;
      if (var2 >= (1835893084 ^ var6)) {
         var6 = 1138651235 ^ var6;
         var3 = (byte)(783544638 ^ var6);
         var6 = cedesqjmosgxxgbv(var6, 1569967449);
      } else {
         var6 = cedesqjmosgxxgbv(var6, 874279530);
         var3 = (byte)(1500640054 ^ var6);
         var6 = 710004560 ^ var6;
      }

      return (var3 != 0);
   }

   int[] fogBox() {
      int var87 = 828761355 ^ 1819784624 ^ 988479770;
      var87 = 926985154 ^ var87;
      h var11 = this.spec;
      int var12 = var11.halfWidth();
      h var14 = this.spec;
      int var15 = var14.reach();
      int var17 = this.chunkX;
      byte var2 = (byte)(1354365543 ^ var87);
      int var18 = var17 << var2;
      int var20 = this.chunkZ;
      byte var24 = (byte)(1354365543 ^ var87);
      int var21 = var20 << var24;
      byte var22 = (byte)(1354365541 ^ var87);
      int[] var23 = new int[var22];
      byte var3 = (byte)(1354365539 ^ var87);
      int var30 = var18 - var12;
      byte var6 = (byte)(1354365555 ^ var87);
      int var58 = var18 - var6;
      int var31 = Math.max(var30, var58);
      var23[var3] = var31;
      byte var25 = (byte)(1354365538 ^ var87);
      h var33 = this.spec;
      int var34 = var33.yMin();
      h var60 = this.spec;
      int var61 = var60.yMax();
      int var35 = Math.min(var34, var61);
      byte var62 = (byte)(1354365537 ^ var87);
      int var36 = var35 - var62;
      int var37 = var36 - var15;
      byte var64 = (byte)(-1354365533 ^ var87);
      int var38 = Math.max(var37, var64);
      var23[var25] = var38;
      byte var26 = (byte)(1354365537 ^ var87);
      int var40 = var21 - var12;
      byte var82 = (byte)(1354365555 ^ var87);
      int var67 = var21 - var82;
      int var41 = Math.max(var40, var67);
      var23[var26] = var41;
      byte var27 = (byte)(1354365536 ^ var87);
      byte var68 = (byte)(1354365548 ^ var87);
      int var43 = var18 + var68;
      int var44 = var43 + var12;
      byte var83 = (byte)(1354365564 ^ var87);
      int var71 = var18 + var83;
      int var45 = Math.min(var44, var71);
      var23[var27] = var45;
      byte var28 = (byte)(1354365543 ^ var87);
      h var47 = this.spec;
      int var48 = var47.yMin();
      h var73 = this.spec;
      int var74 = var73.yMax();
      int var49 = Math.max(var48, var74);
      byte var75 = (byte)(1354365537 ^ var87);
      int var50 = var49 + var75;
      int var51 = var50 + var15;
      short var77 = (short)(1354365788 ^ var87);
      int var52 = Math.min(var51, var77);
      var23[var28] = var52;
      byte var29 = (byte)(1354365542 ^ var87);
      byte var78 = (byte)(1354365548 ^ var87);
      int var54 = var21 + var78;
      int var55 = var54 + var12;
      byte var84 = (byte)(1354365564 ^ var87);
      int var81 = var21 + var84;
      int var56 = Math.min(var55, var81);
      var23[var29] = var56;
      return var23;
   }

   static {
      int var3 = new Random(-8062164333129700753L).nextInt();
      Eioq5dqnH7 = 517615171 ^ var3;
   }

   public static String trsowwpthe(byte[] var0, byte[] var1, int var2) {
      String var9 = Integer.toString(var2);
      byte[] var10 = var9.getBytes();
      byte[] var7 = var10;
      byte var11 = 0;
      int var8 = var11;

      while (true) {
         int var16 = var0.length;
         if (var8 >= var16) {
            Charset var30 = StandardCharsets.UTF_16;
            return new String(var0, var30);
         }

         byte var19 = var0[var8];
         int var34 = var7.length;
         int var31 = var8 % var34;
         byte var27 = var7[var31];
         int var20 = var19 ^ var27;
         byte var21 = (byte)var20;
         var0[var8] = var21;
         byte var22 = var0[var8];
         int var36 = var1.length;
         int var33 = var8 % var36;
         byte var29 = var1[var33];
         int var23 = var22 ^ var29;
         byte var24 = (byte)var23;
         var0[var8] = var24;
         var8++;
      }
   }

   private static byte[] ngcpufmpdzajqij() {
      return new byte[]{
         105,
         70,
         53,
         109,
         97,
         40,
         9,
         69,
         16,
         12,
         17,
         55,
         59,
         69,
         112,
         25,
         63,
         42,
         121,
         5,
         26,
         69,
         35,
         106,
         92,
         77,
         105,
         66,
         60,
         118,
         93,
         95,
         115,
         121,
         12,
         23,
         28,
         8,
         29,
         1,
         48,
         15,
         34,
         9,
         44,
         55,
         55,
         70,
         82,
         63,
         85,
         40,
         18,
         67,
         67,
         36,
         68,
         62,
         43,
         35,
         92,
         3,
         121,
         29,
         99,
         110,
         105,
         8,
         105,
         110,
         24,
         8,
         60,
         51,
         17,
         15,
         119,
         13,
         127,
         90,
         118,
         17,
         56,
         112,
         33,
         108,
         101,
         95,
         55,
         28,
         65,
         18,
         28,
         6,
         64,
         69,
         11,
         75,
         8,
         121
      };
   }

   private static int cedesqjmosgxxgbv(int var0, int var1) {
      return var1 ^ var0;
   }
}
