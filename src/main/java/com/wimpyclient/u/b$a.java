package com.wimpyclient.u;

import java.util.Objects;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b$a {
   private final Item item;
   private final int needed;
   private final int have;
   private final int missing;
   private static int lLqOpVonjy;
   private transient int F0TWxv6s58;
   private static byte[] tlrraunhwr = ibwnlygmsruxukp();

   public b$a(Item item, int needed, int have, int missing) {
super();
      int var16 = 334462472 ^ 1495792740;
      
      var16 = yebqxqqcntfgqnvt(var16, 1808862024);
      var16 = 308068532 ^ 1477692104 ^ Integer.parseInt("1800831832");
      this.F0TWxv6s58 = 512470820 ^ lLqOpVonjy;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
            case 2185388:
               var16 = 264968505 ^ var16;
            case 2094976890:
               this.item = item;
               this.needed = needed;
               this.have = have;
               this.missing = missing;
               return;
            case 1325770074:
            default:
               throw new RuntimeException(new IOException());
            case 1688313309:
         }
      }
   }

   public String displayName() {
      int var11 = 2066109364 ^ 140361353 ^ 2015854151;
      var11 = 1667889700 ^ var11;
      DefaultedRegistry var1 = BuiltInRegistries.ITEM;
      Item var7 = this.item;
      Identifier var4 = var1.getKey(var7);
      String var5 = var4.getPath();
      byte var8 = (byte)(1748330753 ^ var11);
      byte var3 = (byte)(1748330878 ^ var11);
      return var5.replace((char)var8, (char)var3);
   }

   public ItemStack stack() {
      int var11 = 1524506900 ^ 1229891152 ^ 2015854151;
      var11 = 391106670 ^ var11;
      Item var4 = this.item;
      if (var4 != null) {
         var11 = 484068 ^ var11;
         Item var6 = this.item;
         Item var2 = Items.AIR;
         if (var6 != var2) {
            var11 = 540836384 ^ var11;
            Item var8 = this.item;
            ItemStack var7 = new ItemStack(var8);
            var11 = 567181745 ^ var11;
            return var7;
         }

         var11 = 556813484 ^ var11;
      } else {
         var11 = yebqxqqcntfgqnvt(var11, 557264456);
      }

      ItemStack var18 = ItemStack.EMPTY;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var11)) {
            case 96550936:
               var11 = 549605181 ^ var11;
               return var18;
            case 369998932:
            default:
               throw new IllegalStateException();
            case 479385547:
               break;
            case 1765130637:
               return var18;
         }
      }
   }

   @Override
   public final String toString() {
      int var5 = 220423660 ^ 1223268075 ^ 2015854151;
      var5 = 1502040144 ^ var5;
      return "b$a[item=" + this.item + ", needed=" + this.needed + ", have=" + this.have + ", missing=" + this.missing + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 2051559414 ^ 581628429 ^ 2015854151;
      var5 = 720730382 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.item);
      result = 31 * result + Objects.hashCode(this.needed);
      result = 31 * result + Objects.hashCode(this.have);
      result = 31 * result + Objects.hashCode(this.missing);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1460761607 ^ 905336038 ^ 2015854151;
      var7 = 1471969028 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      b$a other = (b$a)var1;
      return Objects.equals(this.item, other.item) &&
      this.needed == other.needed &&
      this.have == other.have &&
      this.missing == other.missing;
   }

   public Item item() {
      int var5 = 1429335132 ^ 528004766 ^ 2015854151;
      var5 = 898508927 ^ var5;
      return this.item;
   }

   public int needed() {
      int var5 = 858914335 ^ 1633177545 ^ 2015854151;
      var5 = 1027513330 ^ var5;
      return this.needed;
   }

   public int have() {
      int var5 = 248410293 ^ 200097224 ^ 2015854151;
      var5 = 111007642 ^ var5;
      return this.have;
   }

   public int missing() {
      int var5 = 1324441990 ^ 1994620451 ^ 2015854151;
      var5 = 1200987994 ^ var5;
      return this.missing;
   }

   static {
      int var3 = new Random(-8053738088476767603L).nextInt();
      lLqOpVonjy = 1557053054 ^ var3;
   }

   public static String suezdvndbc(byte[] var0, int var1) {
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
         byte[] var28 = tlrraunhwr;
         byte[] var34 = tlrraunhwr;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] ibwnlygmsruxukp() {
      return new byte[]{71, 14, 56, 4, 12, 5, 64, 10, 48, 102};
   }

   private static int yebqxqqcntfgqnvt(int var0, int var1) {
      return var0 ^ var1;
   }
}
