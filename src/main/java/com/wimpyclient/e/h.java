package com.wimpyclient.e;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class h {
   private final BlockPos pos;
   private final String typeLabel;
   private static int u8PmW27dOh;
   private transient int bBcX4DwYLZ;
   private static byte[] dhopbyuzvc = drescslrqwglwqm();

   public h(BlockPos pos, String typeLabel) {
super();
      int var18 = 414782390 ^ 1712284723;
      
      var18 = cnrkcvgxsvyqpvmh(var18, 1405121551);
      var18 = 1718735617 ^ 697309001 ^ Integer.parseInt("1654114242");
      this.bBcX4DwYLZ = 1442691061 ^ u8PmW27dOh;
      var18 = cnrkcvgxsvyqpvmh(var18, 791470345);
      if (pos == null) {
         var18 = 415760247 ^ var18;
         String var4 = "pos";
         IllegalArgumentException var6 = new IllegalArgumentException(var4);
         throw new RuntimeException(var6);
      } else {
         String var12;
         label38: {
            var18 = 364365911 ^ var18;
            if (typeLabel != null) {
               var18 = 149841802 ^ var18;
               boolean var9 = typeLabel.isBlank();
               if (!var9) {
                  label27:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
                        case 95396330:
                           break;
                        case 202799845:
                           var18 ^= 1050561006;
                           break label27;
                        case 893733296:
                        default:
                           throw new RuntimeException();
                        case 2144600531:
                           break label27;
                     }
                  }

                  var12 = typeLabel;
                  var18 = 1382196973 ^ var18;
                  break label38;
               }

               var18 = 697482942 ^ var18;
            } else {
               label36:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
                     case 240882967:
                        var18 ^= 561830196;
                        break label36;
                     case 530577737:
                     default:
                        throw new RuntimeException();
                     case 837817315:
                        break;
                     case 937465116:
                        break label36;
                  }
               }
            }

            var12 = "Unknown";
            var18 = cnrkcvgxsvyqpvmh(var18, 1164857789);
         }

         this.pos = pos;
         this.typeLabel = var12;
      }
   }

   @Override
   public final String toString() {
      int var5 = 976620341 ^ 2008164863 ^ 1199358291;
      var5 = 1545301183 ^ var5;
      return "h[pos=" + this.pos + ", typeLabel=" + this.typeLabel + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1081136799 ^ 502353177 ^ 1199358291;
      var5 = 136319894 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.pos);
      result = 31 * result + Objects.hashCode(this.typeLabel);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1830066013 ^ 179170290 ^ 1199358291;
      var7 = 1261383316 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      h other = (h)var1;
      return Objects.equals(this.pos, other.pos) &&
      Objects.equals(this.typeLabel, other.typeLabel);
   }

   public BlockPos pos() {
      int var5 = 1003396089 ^ 1903053792 ^ 1199358291;
      var5 = 1211884729 ^ var5;
      return this.pos;
   }

   public String typeLabel() {
      int var5 = 1206349934 ^ 2129755630 ^ 1199358291;
      var5 = 104958579 ^ var5;
      return this.typeLabel;
   }

   static {
      int var3 = new Random(-3753445657848855858L).nextInt();
      u8PmW27dOh = -679376157 ^ var3;
   }

   public static String lsaocrhmrr(byte[] var0, int var1) {
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
         byte[] var27 = dhopbyuzvc;
         byte[] var34 = dhopbyuzvc;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] drescslrqwglwqm() {
      return new byte[]{
         108,
         95,
         21,
         48,
         19,
         100,
         119,
         40,
         49,
         114,
         113,
         50,
         53,
         16,
         121,
         87,
         98,
         24,
         46,
         19,
         3,
         9,
         33,
         83,
         99,
         55,
         72,
         101,
         73,
         92,
         80,
         99,
         113,
         117,
         81,
         83,
         51,
         26,
         125,
         47,
         60,
         110,
         35,
         67,
         53,
         35,
         120,
         17,
         75,
         112,
         55,
         111,
         70,
         125,
         57,
         52,
         86,
         3,
         30,
         99,
         115,
         93,
         74,
         117,
         68,
         102,
         71,
         29,
         19,
         48,
         13,
         116,
         90,
         100,
         116,
         110,
         58,
         24,
         41,
         2,
         80,
         121,
         44,
         35,
         42,
         33,
         55,
         85,
         34,
         19,
         101,
         55,
         44,
         81,
         16,
         21,
         102,
         46,
         67,
         60,
         114,
         49,
         119,
         26,
         115,
         58,
         102,
         69,
         105,
         124,
         41
      };
   }

   private static int cnrkcvgxsvyqpvmh(int var0, int var1) {
      return var1 ^ var0;
   }
}
