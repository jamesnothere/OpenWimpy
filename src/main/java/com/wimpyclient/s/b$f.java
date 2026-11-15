package com.wimpyclient.s;

import java.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b$f {
   private final b$d status;
   private final byte kind;
   private final long owner;
   private final long[] changes;
   private static int ExeL1rQxd7;
   private transient int SIxb08AeF2;
   private static byte[] hkvshnbcud = kfqnskbkkriwked();

   public b$f(b$d status, byte kind, long owner, long[] changes) {
super();
      int var18 = 1596004904 ^ 1601259118;
      
      var18 = hxalwhtyipcqdvrd(var18, 295675366);
      var18 = 840836121 ^ 1754852642 ^ Integer.parseInt("1263087771");
      this.SIxb08AeF2 = 1129561461 ^ ExeL1rQxd7;
      var18 = hxalwhtyipcqdvrd(var18, 1017566940);
      this.status = status;
      this.kind = kind;
      this.owner = owner;
      this.changes = changes;
   }

   public boolean alert() {
      int var7 = 2047364637 ^ 350068801 ^ 1566946721;
      var7 = 888018233 ^ var7;
      b$d var3 = this.status;
      b$d var2 = b$d.ALERT;
      if (var3 == var2) {
         var7 = 940475223 ^ var7;
         byte var12 = (byte)(1062260114 ^ var7);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var7)) {
               case 32321654:
               default:
                  throw new RuntimeException();
               case 132112016:
                  return (var12 != 0);
               case 179089692:
                  var7 = 1951820064 ^ var7;
                  return (var12 != 0);
               case 1560366281:
            }
         }
      } else {
         label28:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var7)) {
               case 115895945:
                  var7 ^= 414468750;
               case 1177154491:
                  break label28;
               case 1467698339:
                  break;
               case 1952329333:
               default:
                  throw new RuntimeException();
            }
         }

         byte var4 = (byte)(535430218 ^ var7);
         var7 = 1424793849 ^ var7;
         return (var4 != 0);
      }
   }

   @Override
   public final String toString() {
      int var5 = 1124628549 ^ 1839947021 ^ 1566946721;
      var5 = 1703480867 ^ var5;
      return "b$f[status=" + this.status + ", kind=" + this.kind + ", owner=" + this.owner + ", changes=" + this.changes + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 531484524 ^ 132659691 ^ 1566946721;
      var5 = 1131870316 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.status);
      result = 31 * result + Objects.hashCode(this.kind);
      result = 31 * result + Objects.hashCode(this.owner);
      result = 31 * result + Objects.hashCode(this.changes);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 828185411 ^ 280272640 ^ 1566946721;
      var7 = 848404313 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      b$f other = (b$f)var1;
      return Objects.equals(this.status, other.status) &&
      this.kind == other.kind &&
      this.owner == other.owner &&
      Objects.equals(this.changes, other.changes);
   }

   public b$d status() {
      int var5 = 67954109 ^ 1039792839 ^ 1566946721;
      var5 = 31223627 ^ var5;
      return this.status;
   }

   public byte kind() {
      int var5 = 695864090 ^ 1571742684 ^ 1566946721;
      var5 = 232802823 ^ var5;
      return this.kind;
   }

   public long owner() {
      int var5 = 908583465 ^ 275035793 ^ 1566946721;
      var5 = 327213740 ^ var5;
      return this.owner;
   }

   public long[] changes() {
      int var5 = 1777927179 ^ 482098317 ^ 1566946721;
      var5 = 892702674 ^ var5;
      return this.changes;
   }

   static {
      int var3 = new Random(5565686264542147591L).nextInt();
      ExeL1rQxd7 = -1569069118 ^ var3;
   }

   public static String rtrbjzymju(byte[] var0, int var1) {
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
         byte[] var27 = hkvshnbcud;
         byte[] var34 = hkvshnbcud;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] kfqnskbkkriwked() {
      return new byte[]{
         78,
         93,
         5,
         30,
         29,
         17,
         40,
         24,
         1,
         66,
         61,
         79,
         78,
         107,
         64,
         28,
         35,
         77,
         118,
         106,
         29,
         103,
         75,
         121,
         104,
         113,
         38,
         31,
         64,
         38,
         90,
         38,
         104,
         120,
         112,
         120,
         19,
         81,
         101,
         125,
         90,
         114,
         42,
         110,
         59,
         65,
         7,
         36,
         23,
         121,
         116,
         101,
         36,
         23,
         10,
         90,
         72,
         34,
         97,
         63,
         80,
         92,
         80,
         71,
         113,
         5,
         27,
         32,
         19,
         114,
         47,
         45,
         115,
         4,
         20,
         86,
         112,
         112,
         66,
         55,
         75,
         85,
         50,
         15,
         72,
         17,
         122,
         100
      };
   }

   private static int hxalwhtyipcqdvrd(int var0, int var1) {
      return var0 ^ var1;
   }
}
