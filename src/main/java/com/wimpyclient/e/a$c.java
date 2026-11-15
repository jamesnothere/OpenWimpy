package com.wimpyclient.e;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class a$c {
   private final long chunkKey;
   private final int minX;
   private final int minZ;
   private final int maxX;
   private final int maxZ;
   private final int iconX;
   private final int iconY;
   private final int iconZ;
   private final int blocks;
   private final boolean shellOnly;
   private final boolean qualified;
   private final List<d> crystals;
   private final int budding;
   private final int innerBlocks;
   private static int dbmOZ1F7KW;
   private transient int UkN6Xj357V;

   public a$c(
      long chunkKey,
      int minX,
      int minZ,
      int maxX,
      int maxZ,
      int iconX,
      int iconY,
      int iconZ,
      int blocks,
      boolean shellOnly,
      boolean qualified,
      List<d> crystals,
      int budding,
      int innerBlocks
   ) {
super();
      int var48 = 138246358 ^ 760977532;
      
      var48 = lzwtajnnameabxrr(var48, 1703808971);
      var48 = 2020714200 ^ 1304468445 ^ Integer.parseInt("1968820836");
      this.UkN6Xj357V = 93837003 ^ dbmOZ1F7KW;
      var48 = lzwtajnnameabxrr(var48, 1025273548);
      this.chunkKey = chunkKey;
      this.minX = minX;
      this.minZ = minZ;
      this.maxX = maxX;
      this.maxZ = maxZ;
      this.iconX = iconX;
      this.iconY = iconY;
      this.iconZ = iconZ;
      this.blocks = blocks;
      this.shellOnly = shellOnly;
      this.qualified = qualified;
      this.crystals = crystals;
      this.budding = budding;
      this.innerBlocks = innerBlocks;
   }

   @Override
   public final String toString() {
      int var5 = 1168146960 ^ 806581727 ^ 14523763;
      var5 = 1947865698 ^ var5;
      return "a$c[chunkKey=" + this.chunkKey + ", minX=" + this.minX + ", minZ=" + this.minZ + ", maxX=" + this.maxX + ", maxZ=" + this.maxZ + ", iconX=" + this.iconX + ", iconY=" + this.iconY + ", iconZ=" + this.iconZ + ", blocks=" + this.blocks + ", shellOnly=" + this.shellOnly + ", qualified=" + this.qualified + ", crystals=" + this.crystals + ", budding=" + this.budding + ", innerBlocks=" + this.innerBlocks + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1969474957 ^ 1515196729 ^ 14523763;
      var5 = 1567537020 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.chunkKey);
      result = 31 * result + Objects.hashCode(this.minX);
      result = 31 * result + Objects.hashCode(this.minZ);
      result = 31 * result + Objects.hashCode(this.maxX);
      result = 31 * result + Objects.hashCode(this.maxZ);
      result = 31 * result + Objects.hashCode(this.iconX);
      result = 31 * result + Objects.hashCode(this.iconY);
      result = 31 * result + Objects.hashCode(this.iconZ);
      result = 31 * result + Objects.hashCode(this.blocks);
      result = 31 * result + Objects.hashCode(this.shellOnly);
      result = 31 * result + Objects.hashCode(this.qualified);
      result = 31 * result + Objects.hashCode(this.crystals);
      result = 31 * result + Objects.hashCode(this.budding);
      result = 31 * result + Objects.hashCode(this.innerBlocks);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 22916169 ^ 1292679122 ^ 14523763;
      var7 = 235769248 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      a$c other = (a$c)var1;
      return this.chunkKey == other.chunkKey &&
      this.minX == other.minX &&
      this.minZ == other.minZ &&
      this.maxX == other.maxX &&
      this.maxZ == other.maxZ &&
      this.iconX == other.iconX &&
      this.iconY == other.iconY &&
      this.iconZ == other.iconZ &&
      this.blocks == other.blocks &&
      this.shellOnly == other.shellOnly &&
      this.qualified == other.qualified &&
      Objects.equals(this.crystals, other.crystals) &&
      this.budding == other.budding &&
      this.innerBlocks == other.innerBlocks;
   }

   public long chunkKey() {
      int var5 = 118201411 ^ 1998321430 ^ 14523763;
      var5 = 1841546462 ^ var5;
      return this.chunkKey;
   }

   public int minX() {
      int var5 = 575275974 ^ 4639980 ^ 14523763;
      var5 = 1788552491 ^ var5;
      return this.minX;
   }

   public int minZ() {
      int var5 = 607981229 ^ 725735889 ^ 14523763;
      var5 = 280185417 ^ var5;
      return this.minZ;
   }

   public int maxX() {
      int var5 = 2034328647 ^ 1410675127 ^ 14523763;
      var5 = 847118895 ^ var5;
      return this.maxX;
   }

   public int maxZ() {
      int var5 = 225483987 ^ 1844344695 ^ 14523763;
      var5 = 424890922 ^ var5;
      return this.maxZ;
   }

   public int iconX() {
      int var5 = 2049653442 ^ 1680548316 ^ 14523763;
      var5 = 78195010 ^ var5;
      return this.iconX;
   }

   public int iconY() {
      int var5 = 24490840 ^ 1840242222 ^ 14523763;
      var5 = 738031560 ^ var5;
      return this.iconY;
   }

   public int iconZ() {
      int var5 = 1925674700 ^ 1574858626 ^ 14523763;
      var5 = 1989262751 ^ var5;
      return this.iconZ;
   }

   public int blocks() {
      int var5 = 1310628970 ^ 525982238 ^ 14523763;
      var5 = 1223532315 ^ var5;
      return this.blocks;
   }

   public boolean shellOnly() {
      int var5 = 215018324 ^ 1552820207 ^ 14523763;
      var5 = 1120760371 ^ var5;
      return this.shellOnly;
   }

   public boolean qualified() {
      int var5 = 2040243781 ^ 435275234 ^ 14523763;
      var5 = 1784159232 ^ var5;
      return this.qualified;
   }

   public List<d> crystals() {
      int var5 = 1550948462 ^ 1160726324 ^ 14523763;
      var5 = 1388346609 ^ var5;
      return this.crystals;
   }

   public int budding() {
      int var5 = 915158125 ^ 111089385 ^ 14523763;
      var5 = 1936779176 ^ var5;
      return this.budding;
   }

   public int innerBlocks() {
      int var5 = 1673315896 ^ 1499801949 ^ 14523763;
      var5 = 1943112602 ^ var5;
      return this.innerBlocks;
   }

   static {
      int var3 = new Random(-3079638439005290314L).nextInt();
      dbmOZ1F7KW = 416966035 ^ var3;
   }

   public static String qgmwnxzxgu(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] xetnhhcijraoyzj() {
      return new byte[]{
         41,
         117,
         29,
         27,
         115,
         6,
         28,
         56,
         123,
         104,
         8,
         99,
         18,
         69,
         5,
         96,
         104,
         13,
         28,
         52,
         113,
         89,
         30,
         27,
         63,
         119,
         111,
         40,
         56,
         55,
         73,
         48,
         96,
         27,
         83,
         95,
         100,
         64,
         60,
         10,
         118,
         123,
         1,
         116,
         42,
         63,
         15,
         105,
         23,
         13,
         69,
         115,
         10,
         79,
         107,
         122,
         115,
         66,
         55,
         107,
         95,
         64,
         45,
         96,
         45,
         49,
         33,
         107,
         52,
         38,
         24,
         14,
         32,
         64,
         112,
         18,
         23
      };
   }

   private static int lzwtajnnameabxrr(int var0, int var1) {
      return var0 ^ var1;
   }
}
