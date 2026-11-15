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
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b$b {
   private final Item item;
   private final int needed;
   private static int sj9NVBdiZl;
   private transient int EK0QcDMbyW;
   private static byte[] mrytjibzkz = qskmyebrkmjbrjr();

   public b$b(Item item, int needed) {
super();
      int var10 = 1434060070 ^ 992300348;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
            case 98104813:
               var10 = 1369857671 ^ var10;
            case 1604059453:
               var10 = 169503820 ^ 763236722 ^ Integer.parseInt("412969891");
               this.EK0QcDMbyW = 1593688958 ^ sj9NVBdiZl;

               label22:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
                     case 140920754:
                        break label22;
                     case 200451113:
                        var10 = 842330769 ^ var10;
                        break label22;
                     case 841170723:
                        break;
                     case 918706787:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }

               this.item = item;
               this.needed = needed;
               return;
            case 1096118116:
            default:
               throw new RuntimeException(new IOException());
            case 2070189477:
         }
      }
   }

   public String displayName() {
      int var11 = 1196542693 ^ 2017695900 ^ 661285598;
      var11 = 1181648990 ^ var11;
      DefaultedRegistry var1 = BuiltInRegistries.ITEM;
      Item var7 = this.item;
      Identifier var4 = var1.getKey(var7);
      String var5 = var4.getPath();
      byte var8 = (byte)(1578545318 ^ var11);
      byte var3 = (byte)(1578545369 ^ var11);
      return var5.replace((char)var8, (char)var3);
   }

   @Override
   public final String toString() {
      int var5 = 796116191 ^ 396657266 ^ 661285598;
      var5 = 1077163581 ^ var5;
      return "b$b[item=" + this.item + ", needed=" + this.needed + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 121421188 ^ 2112349844 ^ 661285598;
      var5 = 1062144835 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.item);
      result = 31 * result + Objects.hashCode(this.needed);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 564476557 ^ 1790656639 ^ 661285598;
      var7 = 559007026 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      b$b other = (b$b)var1;
      return Objects.equals(this.item, other.item) &&
      this.needed == other.needed;
   }

   public Item item() {
      int var5 = 614143545 ^ 912017968 ^ 661285598;
      var5 = 117580487 ^ var5;
      return this.item;
   }

   public int needed() {
      int var5 = 254776622 ^ 859078497 ^ 661285598;
      var5 = 138325298 ^ var5;
      return this.needed;
   }

   static {
      int var3 = new Random(163967124712831892L).nextInt();
      sj9NVBdiZl = 1779746194 ^ var3;
   }

   public static String qeeyncccfc(byte[] var0, int var1) {
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
         byte[] var28 = mrytjibzkz;
         byte[] var34 = mrytjibzkz;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] qskmyebrkmjbrjr() {
      return new byte[]{
         51,
         85,
         2,
         87,
         7,
         105,
         47,
         111,
         120,
         77,
         101,
         73,
         70,
         124,
         69,
         111,
         124,
         3,
         24,
         123,
         30,
         14,
         52,
         5,
         87,
         111,
         109,
         100,
         43,
         79,
         82,
         114,
         69,
         82,
         19,
         102,
         7,
         35,
         127,
         127,
         20,
         95,
         25,
         123,
         113,
         95,
         37,
         77,
         75,
         24,
         3,
         43,
         54,
         75,
         101,
         100,
         72,
         9,
         90,
         75
      };
   }
}
