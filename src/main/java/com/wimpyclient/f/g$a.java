package com.wimpyclient.f;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class g$a {
   public int fullClusters;
   public int largeBuds;
   public int smallBuds;
   public int budding;
   public int calcite;
   public int smoothBasalt;
   public int amethystBlock;
   public int berriedVineTips;
   public int plainVineTips;
   public int vineBodies;
   public int mossBlocks;
   public int lushDecor;
   public int lushRoots;
   public int climbingVines;
   public int jungleCanopy;
   public int mangroveCanopy;
   public int farmland;
   public int crops;
   public int sugarCane;
   public int cocoaPods;
   public int beeNests;
   public int beehives;
   public int beeOccupants;
   public int fullHoney;
   public int grownGrass;
   public int growthBlocks;
   public boolean denseGrownGrass;
   public int bambooStalks;
   public int thickBamboo;
   public int canopyBamboo;
   public int podzol;
   public int kelpTips;
   public int kelpBodies;
   public int oceanDecor;
   public int maxAgeBerries;
   public int dripstoneSpikes;
   public int playerDeepslate;
   public int rotatedDeepslate;
   public int cobbledDeepslate;
   public int craftedDeepslate;
   public int endStone;
   public int trialChamber;
   public int reinforcedDeepslate;
   public int cobbleLines;
   public int obsidian;
   public int pistons;
   public int stairs;
   public int airPocket;
   public int needles;
   public int hiddenOre;
   public int vertVeins;
   public int valuableOre;
   public int deepslateFloor;
   public int repeaters;
   public int poweredRepeaters;
   public int workstations;
   public int hoppers;
   public int droppedItems;
   public int polarBears;
   public int mobCluster;
   public int armorStands;
   public int villagers;
   public int itemFrames;
   public int hiddenFullClusters;
   public int hiddenBuds;
   private static int f3zgYhvAZRk;
   private transient int f8DF03mulcm;
   private static String vzkknrgybs = ByteBuffer.wrap(pqumcmpzucimvob()).asCharBuffer().toString();

   public g$a() {
super();
      int var4 = 1745091811 ^ 410526599;
      
      var4 = mlljcdtnoizxwzdr(var4, 164562491);
      var4 = 1875787962 ^ 1479754765 ^ Integer.parseInt("1313463784");
      this.f8DF03mulcm = 933274185 ^ f3zgYhvAZRk;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 198057116:
               var4 = 579090908 ^ var4;
            case 1232818169:
               return;
            case 1590239388:
               break;
            case 1797328669:
            default:
               throw new RuntimeException();
         }
      }
   }

   public int crystalTotal() {
      int var8 = 707579469 ^ 544491920 ^ 284442551;
      var8 = 939058392 ^ var8;
      int var3 = this.fullClusters;
      int var5 = this.hiddenFullClusters;
      return var3 + var5;
   }

   public int shellTotal() {
      int var11 = 379582067 ^ 131671966 ^ 284442551;
      var11 = 548447277 ^ var11;
      int var3 = this.calcite;
      int var6 = this.smoothBasalt;
      int var4 = var3 + var6;
      int var8 = this.amethystBlock;
      return var4 + var8;
   }

   public boolean crystalsVisible() {
      int var7 = 1096644937 ^ 45330138 ^ 284442551;
      var7 = 1067577055 ^ var7;
      int var3 = this.crystalTotal();
      byte var2 = (byte)(1824196344 ^ var7);
      byte var4;
      if (var3 >= var2) {
         var7 = 1240875943 ^ var7;
         var4 = (byte)(625821021 ^ var7);
         var7 = mlljcdtnoizxwzdr(var7, 128891346);
      } else {
         var7 = 1843195482 ^ var7;
         var4 = (byte)(23586977 ^ var7);
         var7 = 595858479 ^ var7;
      }

      return (var4 != 0);
   }

   public int grownClusters() {
      int var8 = 149773766 ^ 1778083219 ^ 284442551;
      var8 = 176425192 ^ var8;
      int var3 = this.fullClusters;
      int var5 = this.hiddenFullClusters;
      return var3 + var5;
   }

   static {
      int var3 = new Random(6501824025135948483L).nextInt();
      f3zgYhvAZRk = 227795510 ^ var3;
   }

   public static String ulzcerbttg(byte[] var0, int var1) {
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
      String var29 = vzkknrgybs;
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

   private static byte[] pqumcmpzucimvob() {
      return new byte[0];
   }

   private static int mlljcdtnoizxwzdr(int var0, int var1) {
      return var1 ^ var0;
   }
}
