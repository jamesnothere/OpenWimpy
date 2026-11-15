package com.wimpyclient.q;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b {
   public static final b INACTIVE;
   private final boolean active;
   private final String title;
   private final String artist;
   private final long posMs;
   private final long durMs;
   private final boolean playing;
   private final boolean canSeek;
   private final int artVersion;
   private final int volume;
   private final long receivedNanos;
   private static int f4P3cEEbXFU;
   private transient int oYOUAu0p5q;
   private static byte[] hmlaunkhsb = lxrzihggmhmuuao();

   public b(boolean var1, String var2, String var3, long var4, long var6, boolean var8, boolean var9, int var10, int var11, long var12) {
super();
      int var42 = 1115914943 ^ 692971211;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var42)) {
            case 14649710:
               var42 = 1376116562 ^ var42;
            case 477273482:
               var42 = 2037628024 ^ 2098932567 ^ Integer.parseInt("1034103817");
               this.oYOUAu0p5q = 928548819 ^ f4P3cEEbXFU;
               var42 = mfmgniaidrrlwgto(var42, 582784024);
               this.active = var1;
               String var38;
               if (var2 == null) {
                  var42 = 687241082 ^ var42;
                  var38 = "";
                  var42 = mfmgniaidrrlwgto(var42, 1472879194);
               } else {
                  var42 = mfmgniaidrrlwgto(var42, 998063942);
                  var38 = var2;
                  var42 = 1145115238 ^ var42;
               }

               this.title = var38;
               String var39;
               if (var3 == null) {
                  var42 = 350614740 ^ var42;
                  var39 = "";
                  var42 = 1534025609 ^ var42;
               } else {
                  var42 = mfmgniaidrrlwgto(var42, 148982405);
                  var39 = var3;
                  var42 = 1198252504 ^ var42;
               }

               this.artist = var39;
               this.posMs = var4;
               this.durMs = var6;
               this.playing = var8;
               this.canSeek = var9;
               this.artVersion = var10;
               this.volume = var11;
               this.receivedNanos = var12;
               return;
            case 530911977:
            default:
               throw new RuntimeException(new IOException());
            case 1330982944:
         }
      }
   }

   public long livePosMs() {
      int var38 = 828276728 ^ 651631572 ^ 1724281641;
      var38 = 664269147 ^ var38;
      byte var6 = (byte)((this.playing) ? 1 : 0);
      if (var6 != (1457055326 ^ var38)) {
         var38 = 44915499 ^ var38;
         long var8 = this.durMs;
         long var2 = 0L;
         long var44;
         int var10 = (var44 = var8 - var2) == 0L ? 0 : (var44 < 0L ? -1 : 1);
         if (var10 > (1417002357 ^ var38)) {
            var38 = 1212284570 ^ var38;
            long var14 = System.nanoTime();
            long var28 = this.receivedNanos;
            long var16 = var14 - var28;
            long var30 = 1000000L;
            long var18 = var16 / var30;
            long var21 = this.posMs;
            long var23 = var21 + var18;
            long var35 = this.durMs;
            return Math.min(var23, var35);
         }

         var38 = 3631820 ^ var38;
      } else {
         var38 = 43659751 ^ var38;
      }

      return this.posMs;
   }

   public boolean active() {
      int var5 = 1269375729 ^ 1702076788 ^ 1724281641;
      var5 = 375129514 ^ var5;
      return this.active;
   }

   public String title() {
      int var5 = 636927719 ^ 689483505 ^ 1724281641;
      var5 = 322194578 ^ var5;
      return this.title;
   }

   public String artist() {
      int var5 = 1310747077 ^ 437180159 ^ 1724281641;
      var5 = 2993948 ^ var5;
      return this.artist;
   }

   public long posMs() {
      int var5 = 249393688 ^ 1828368543 ^ 1724281641;
      var5 = 675852324 ^ var5;
      return this.posMs;
   }

   public long durMs() {
      int var5 = 308287356 ^ 1489510986 ^ 1724281641;
      var5 = 1631019411 ^ var5;
      return this.durMs;
   }

   public boolean playing() {
      int var5 = 2012231795 ^ 975317344 ^ 1724281641;
      var5 = 265526486 ^ var5;
      return this.playing;
   }

   public boolean canSeek() {
      int var5 = 1222386600 ^ 1031785718 ^ 1724281641;
      var5 = 737545141 ^ var5;
      return this.canSeek;
   }

   public int artVersion() {
      int var5 = 699836160 ^ 221978673 ^ 1724281641;
      var5 = 1776984597 ^ var5;
      return this.artVersion;
   }

   public int volume() {
      int var5 = 764529934 ^ 544130310 ^ 1724281641;
      var5 = 290740871 ^ var5;
      return this.volume;
   }

   public long receivedNanos() {
      int var5 = 82087055 ^ 2111142467 ^ 1724281641;
      var5 = 1047332781 ^ var5;
      return this.receivedNanos;
   }

   static {
      int var18 = 386220757 ^ 306451829 ^ Integer.parseInt("1034103817");
      int var15 = new Random(-8152095741030520223L).nextInt();
      f4P3cEEbXFU = 1981822271 ^ var15;
      var18 = 1277313114 ^ var18;
      byte var1 = (byte)(1958755315 ^ var18);
      String var2 = txpridypgm(nkuhrgnpeadcjbj(), var18);
      String var3 = txpridypgm(fqcihrnalzftzyn(), var18);
      long var4 = 0L;
      long var6 = 0L;
      byte var8 = (byte)(1958755315 ^ var18);
      byte var9 = (byte)(1958755315 ^ var18);
      byte var10 = (byte)(1958755315 ^ var18);
      byte var11 = (byte)(-1958755316 ^ var18);
      long var12 = 0L;
      b var0 = new b((var1 != 0), var2, var3, var4, var6, (var8 != 0), (var9 != 0), var10, var11, var12);
      INACTIVE = var0;
   }

   public static String txpridypgm(byte[] var0, int var1) {
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
         byte[] var28 = hmlaunkhsb;
         byte[] var34 = hmlaunkhsb;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] lxrzihggmhmuuao() {
      return new byte[]{
         115,
         83,
         37,
         13,
         75,
         121,
         125,
         23,
         45,
         81,
         23,
         30,
         114,
         111,
         88,
         44,
         14,
         112,
         20,
         22,
         37,
         90,
         24,
         40,
         120,
         96,
         112,
         75,
         120,
         87,
         25,
         39,
         119,
         10,
         117,
         92,
         23,
         62,
         63,
         18,
         112,
         71,
         20,
         5,
         92,
         64,
         44,
         76,
         94,
         33,
         118,
         110,
         104,
         89,
         122,
         1,
         28,
         7,
         122,
         45,
         58,
         83,
         40,
         83,
         37,
         49,
         79,
         111,
         125,
         95,
         127,
         2,
         58,
         18,
         37,
         2,
         12,
         127,
         3,
         80,
         90,
         25
      };
   }

   private static byte[] nkuhrgnpeadcjbj() {
      return new byte[0];
   }

   private static byte[] fqcihrnalzftzyn() {
      return new byte[0];
   }

   private static int mfmgniaidrrlwgto(int var0, int var1) {
      return var0 ^ var1;
   }
}
