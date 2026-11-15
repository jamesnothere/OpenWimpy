package com.wimpyclient.o;

import com.wimpyclient.k.h;
import com.wimpyclient.p.g;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b {
   public static final b INSTANCE;
   private static int RFjjl3rXmE;
   private transient int fHJSTZhPz6;
   private static byte[] eeqeuwvotd = ynxuijmtntqllko();

   private b() {
super();
      int var4 = 1880188594 ^ 1351382760;
      
      var4 = 1048163794 ^ var4;
      var4 = 144587885 ^ 1848725943 ^ Integer.parseInt("2018232402");
      this.fHJSTZhPz6 = 973105486 ^ RFjjl3rXmE;
      var4 = vwwfuhmrmybvpqgh(var4, 393332392);
   }

   public int accent() {
      int var5 = 775618482 ^ 829613689 ^ 1187723422;
      var5 = 1360410262 ^ var5;
      c var1 = c.INSTANCE;
      return var1.accent();
   }

   public int accentBright() {
      int var7 = 1236657946 ^ 546850459 ^ 1187723422;
      var7 = 1215342074 ^ var7;
      int var3 = this.accent();
      float var2 = 0.35F;
      return g.lighten(var3, var2);
   }

   public int accentHover() {
      int var7 = 2061331766 ^ 792436173 ^ 1187723422;
      var7 = 1890496691 ^ var7;
      int var3 = this.accent();
      float var2 = 0.35F;
      return g.withAlpha(var3, var2);
   }

   public int background() {
      int var6 = 671684975 ^ 668202256 ^ 1187723422;
      var6 = 1780167933 ^ var6;
      int var1 = -602212862 ^ var6;
      float var2 = 0.88F;
      return g.withAlpha(var1, var2);
   }

   public int backgroundTo() {
      int var6 = 586530975 ^ 905325142 ^ 1187723422;
      var6 = 1813238934 ^ var6;
      int var1 = -1026550057 ^ var6;
      float var2 = 0.9F;
      return g.withAlpha(var1, var2);
   }

   public int headerTop() {
      int var6 = 29661156 ^ 305763465 ^ 1187723422;
      var6 = 1905047237 ^ var6;
      int var1 = -610095842 ^ var6;
      float var2 = 0.92F;
      return g.withAlpha(var1, var2);
   }

   public int headerBottom() {
      int var6 = 482097538 ^ 668174700 ^ 1187723422;
      var6 = 2050765343 ^ var6;
      int var1 = -125260687 ^ var6;
      float var2 = 0.92F;
      return g.withAlpha(var1, var2);
   }

   public int moduleActiveFill() {
      int var10 = 523249450 ^ 806312919 ^ 1187723422;
      var10 = 180998512 ^ var10;
      int var1 = -1674605261 ^ var10;
      int var6 = this.accent();
      float var3 = 0.22F;
      int var4 = g.lerp(var1, var6, var3);
      float var7 = 0.95F;
      return g.withAlpha(var4, var7);
   }

   public int rowHover() {
      int var6 = 1245986663 ^ 1592861903 ^ 1187723422;
      var6 = 2078831815 ^ var6;
      int var1 = -695569983 ^ var6;
      float var2 = 0.9F;
      return g.withAlpha(var1, var2);
   }

   public int textPrimary() {
      int var4 = 1482128106 ^ 2146927314 ^ 1187723422;
      var4 = 1717808240 ^ var4;
      return -117794260 ^ var4;
   }

   public int textMuted() {
      int var4 = 1463077288 ^ 1527383052 ^ 1187723422;
      var4 = 353125473 ^ var4;
      return -1602874903 ^ var4;
   }

   public int textDisabled() {
      int var4 = 58966853 ^ 396322300 ^ 1187723422;
      var4 = 55301808 ^ var4;
      return -1362743581 ^ var4;
   }

   public int panelEdge() {
      int var10 = 2015790904 ^ 1696013159 ^ 1187723422;
      var10 = 1202620580 ^ var10;
      byte var1 = (byte)((h.master()) ? 1 : 0);
      if (var1 != (475278437 ^ var10)) {
         var10 = 1002700568 ^ var10;
         int var5 = h.chrome();
         float var7 = 0.55F;
         return g.withAlpha(var5, var7);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
               case 115542615:
                  var10 ^= 1247212162;
               case 1815947428:
                  int var3 = -1459429657 ^ var10;
                  float var2 = 0.45F;
                  return g.withAlpha(var3, var2);
               case 567110534:
                  break;
               case 2087622007:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   public int track() {
      int var4 = 850731017 ^ 1312089390 ^ 1187723422;
      var4 = 1712378776 ^ var4;
      return -1552933351 ^ var4;
   }

   public int field() {
      int var4 = 1785979567 ^ 2135800935 ^ 1187723422;
      var4 = 1788058732 ^ var4;
      return -965940692 ^ var4;
   }

   public int warn() {
      int var4 = 2109924633 ^ 680104835 ^ 1187723422;
      var4 = 2081065967 ^ var4;
      return -1870724951 ^ var4;
   }

   public int overlay() {
      int var6 = 1662151722 ^ 891174008 ^ 1187723422;
      var6 = 248553865 ^ var6;
      int var1 = -518534843 ^ var6;
      float var2 = 0.38F;
      return g.withAlpha(var1, var2);
   }

   public int knob() {
      int var4 = 1352651150 ^ 969913037 ^ 1187723422;
      var4 = 1262313345 ^ var4;
      return (byte)(-1688601693 ^ var4);
   }

   public int knobOff() {
      int var4 = 1919734422 ^ 555060831 ^ 1187723422;
      var4 = 264648933 ^ var4;
      return -443368876 ^ var4;
   }

   public int headerLine() {
      int var6 = 1015583679 ^ 967446653 ^ 1187723422;
      var6 = 1098090506 ^ var6;
      byte var1 = (byte)(-43660119 ^ var6);
      float var2 = 0.18F;
      return g.withAlpha(var1, var2);
   }

   public int descriptionBg() {
      int var6 = 47861187 ^ 1730218413 ^ 1187723422;
      var6 = 1303637402 ^ var6;
      int var1 = -1853259396 ^ var6;
      float var2 = 0.92F;
      return g.withAlpha(var1, var2);
   }

   static {
      int var6 = 1439117541 ^ 2022332887 ^ Integer.parseInt("2018232402");
      int var3 = new Random(3051861514583182589L).nextInt();
      RFjjl3rXmE = -1088346520 ^ var3;
      var6 = 506783117 ^ var6;
      b var0 = new b();
      INSTANCE = var0;
   }

   public static String parjrgirct(byte[] var0, int var1) {
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
         byte[] var28 = eeqeuwvotd;
         byte[] var34 = eeqeuwvotd;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] ynxuijmtntqllko() {
      return new byte[]{61, 16, 52, 92, 79, 78, 110, 9, 4, 75, 58, 51, 51, 71, 106, 24, 8, 106, 102, 1, 42, 40, 106, 7};
   }

   private static int vwwfuhmrmybvpqgh(int var0, int var1) {
      return var1 ^ var0;
   }
}
