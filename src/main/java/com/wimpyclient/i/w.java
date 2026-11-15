package com.wimpyclient.i;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.chat.Component;

@Environment(EnvType.CLIENT)
public enum w {WORLD((xslhbiyqyo(auhjfurgjeanmhu(), mfybsluzkjneank(), (1523919659 ^ (235244163 ^ 1408969958 ^ Integer.parseInt("758920864"))))), (xslhbiyqyo(sbdyfahwoqnxpqq(), mfybsluzkjneank(), (1523919659 ^ (235244163 ^ 1408969958 ^ Integer.parseInt("758920864")))))),
   VISUAL((xslhbiyqyo(muppyumtxwiawxn(), mfybsluzkjneank(), (1523919659 ^ (235244163 ^ 1408969958 ^ Integer.parseInt("758920864"))))), (xslhbiyqyo(rxywqdjivoftpjt(), mfybsluzkjneank(), (1523919659 ^ (235244163 ^ 1408969958 ^ Integer.parseInt("758920864")))))),
   COMBAT((xslhbiyqyo(zdpxzhauofcszvt(), mfybsluzkjneank(), (1523919659 ^ (235244163 ^ 1408969958 ^ Integer.parseInt("758920864"))))), (xslhbiyqyo(mdcsrszwjwentyu(), mfybsluzkjneank(), (1523919659 ^ (235244163 ^ 1408969958 ^ Integer.parseInt("758920864")))))),
   PLAYER((xslhbiyqyo(zextsspzpmdzgcd(), mfybsluzkjneank(), (1523919659 ^ (235244163 ^ 1408969958 ^ Integer.parseInt("758920864"))))), (xslhbiyqyo(oaeopygozglvjmg(), mfybsluzkjneank(), (1523919659 ^ (235244163 ^ 1408969958 ^ Integer.parseInt("758920864")))))),
   CLIENT((xslhbiyqyo(ghwwpsdmlotuaqt(), mfybsluzkjneank(), (1523919659 ^ (235244163 ^ 1408969958 ^ Integer.parseInt("758920864"))))), (xslhbiyqyo(ibxiympdhissrmd(), mfybsluzkjneank(), (1523919659 ^ (235244163 ^ 1408969958 ^ Integer.parseInt("758920864"))))));

   private final String id;
   private final String label;

   private w(String nullxx, String nullxxx) {
      int var14 = 622387930 ^ 507046695;
      
      var14 = 784005204 ^ var14;
      var14 = 1125909265 ^ 2075837464 ^ Integer.parseInt("758920864");
      var14 = 2069696726 ^ var14;
      this.id = nullxx;
      this.label = nullxxx;
   }

   public String id() {
      int var5 = 56256712 ^ 115614481 ^ 576819491;
      var5 = 1771007976 ^ var5;
      return this.id;
   }

   public String label() {
      int var5 = 1705254707 ^ 931832542 ^ 576819491;
      var5 = 535595771 ^ var5;
      return this.label;
   }

   public Component displayName() {
      int var7 = 27467873 ^ 1267408277 ^ 576819491;
      var7 = 162496966 ^ var7;
      String var2 = this.id;
      String var3 = "wimpyclient.category." + var2;
      return Component.translatable(var3);
   }



   public static String xslhbiyqyo(byte[] var0, byte[] var1, int var2) {
      String var11 = Integer.toString(var2);
      byte[] var12 = var11.getBytes();
      byte[] var9 = var12;
      byte var13 = 0;
      int var10 = var13;

      while (true) {
         int var18 = var0.length;
         if (var10 >= var18) {
            Charset var6 = StandardCharsets.UTF_16;
            return new String(var0, var6);
         }

         byte var21 = var0[var10];
         int var34 = var9.length;
         int var31 = var10 % var34;
         byte var28 = var9[var31];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var10] = var23;
         byte var24 = var0[var10];
         int var36 = var1.length;
         int var33 = var10 % var36;
         byte var30 = var1[var33];
         int var25 = var24 ^ var30;
         byte var26 = (byte)var25;
         var0[var10] = var26;
         var10++;
      }
   }

   private static byte[] mfybsluzkjneank() {
      return new byte[]{
         92,
         11,
         33,
         69,
         104,
         53,
         28,
         83,
         88,
         54,
         41,
         53,
         118,
         37,
         48,
         60,
         96,
         50,
         2,
         60,
         126,
         126,
         75,
         90,
         82,
         116,
         40,
         105,
         81,
         90,
         34,
         6,
         7,
         112,
         105,
         78,
         97,
         15
      };
   }

   private static byte[] nsbrykgmimlmtoo() {
      return new byte[]{-107, -60, 23, 35, 81, 66, 41, 48, 104, 77, 25, 71};
   }

   private static byte[] auhjfurgjeanmhu() {
      return new byte[]{-107, -60, 23, 3, 81, 98, 41, 16, 104, 109, 25, 103};
   }

   private static byte[] sbdyfahwoqnxpqq() {
      return new byte[]{-107, -60, 23, 35, 81, 98, 41, 16, 104, 109, 25, 103};
   }

   private static byte[] yiqpwiwtuepzgdp() {
      return new byte[]{-107, -60, 23, 34, 81, 68, 41, 49, 104, 84, 25, 66, 71, 80};
   }

   private static byte[] muppyumtxwiawxn() {
      return new byte[]{-107, -60, 23, 2, 81, 100, 41, 17, 104, 116, 25, 98, 71, 112};
   }

   private static byte[] rxywqdjivoftpjt() {
      return new byte[]{-107, -60, 23, 34, 81, 100, 41, 17, 104, 116, 25, 98, 71, 112};
   }

   private static byte[] ettsgymjqscetuu() {
      return new byte[]{-107, -60, 23, 55, 81, 66, 41, 47, 104, 67, 25, 66, 71, 72};
   }

   private static byte[] zdpxzhauofcszvt() {
      return new byte[]{-107, -60, 23, 23, 81, 98, 41, 15, 104, 99, 25, 98, 71, 104};
   }

   private static byte[] mdcsrszwjwentyu() {
      return new byte[]{-107, -60, 23, 55, 81, 98, 41, 15, 104, 99, 25, 98, 71, 104};
   }

   private static byte[] iotndkcuxjcvmbb() {
      return new byte[]{-107, -60, 23, 36, 81, 65, 41, 35, 104, 88, 25, 70, 71, 78};
   }

   private static byte[] zextsspzpmdzgcd() {
      return new byte[]{-107, -60, 23, 4, 81, 97, 41, 3, 104, 120, 25, 102, 71, 110};
   }

   private static byte[] oaeopygozglvjmg() {
      return new byte[]{-107, -60, 23, 36, 81, 97, 41, 3, 104, 120, 25, 102, 71, 110};
   }

   private static byte[] uutzkhkmxeeolmz() {
      return new byte[]{-107, -60, 23, 55, 81, 65, 41, 43, 104, 68, 25, 77, 71, 72};
   }

   private static byte[] ghwwpsdmlotuaqt() {
      return new byte[]{-107, -60, 23, 23, 81, 97, 41, 11, 104, 100, 25, 109, 71, 104};
   }

   private static byte[] ibxiympdhissrmd() {
      return new byte[]{-107, -60, 23, 55, 81, 97, 41, 11, 104, 100, 25, 109, 71, 104};
   }
}
