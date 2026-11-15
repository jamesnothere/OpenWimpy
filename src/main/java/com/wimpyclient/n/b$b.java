package com.wimpyclient.n;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class b$b {
   private final String label;
   private final int priority;
   private static int f2wiOa7MEEC;
   private transient int f8I7ANFLnBl;
   private static byte[] ebclmckoym = uwizyrdavfrwoak();

   public b$b(String var1, int var2) {
super();
      int var10 = 1437208797 ^ 1347442210;
      
      var10 = libxyumcnvimiwbg(var10, 516452675);
      var10 = 1833941363 ^ 1792602256 ^ Integer.parseInt("480607839");
      this.f8I7ANFLnBl = 456732716 ^ f2wiOa7MEEC;
      var10 = libxyumcnvimiwbg(var10, 1066523331);
      this.label = var1;
      this.priority = var2;
   }

   public String label() {
      int var5 = 2039302265 ^ 1583376209 ^ 968523921;
      var5 = 325125293 ^ var5;
      return this.label;
   }

   public int priority() {
      int var5 = 1625712342 ^ 735679791 ^ 968523921;
      var5 = 785596060 ^ var5;
      return this.priority;
   }

   static {
      int var3 = new Random(-3700988106216311288L).nextInt();
      f2wiOa7MEEC = 931602513 ^ var3;
   }

   public static String fvfnegtlap(byte[] var0, int var1) {
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
         byte[] var27 = ebclmckoym;
         byte[] var34 = ebclmckoym;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] uwizyrdavfrwoak() {
      return new byte[]{
         74,
         18,
         67,
         58,
         96,
         123,
         34,
         58,
         3,
         105,
         98,
         29,
         119,
         121,
         84,
         19,
         60,
         35,
         16,
         34,
         91,
         6,
         4,
         72,
         81,
         38,
         22,
         59,
         125,
         46,
         107,
         108,
         32,
         88,
         105,
         105,
         36,
         125,
         68,
         24,
         27,
         41,
         72,
         102,
         16,
         84,
         53,
         1,
         80,
         27,
         76,
         121,
         30,
         48,
         30,
         98,
         36,
         26,
         13,
         57,
         105,
         81,
         3,
         87,
         83,
         30,
         77,
         69,
         52,
         21,
         38,
         1,
         50,
         66,
         32,
         20,
         112,
         42,
         122,
         6,
         73,
         54,
         12,
         55,
         26,
         93,
         87,
         12,
         74,
         117,
         125,
         121,
         24,
         86,
         60,
         116
      };
   }

   private static int libxyumcnvimiwbg(int var0, int var1) {
      return var0 ^ var1;
   }
}
