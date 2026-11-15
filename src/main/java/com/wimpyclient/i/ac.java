package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class ac {
   public static final ac INSTANCE;
   public static final int HUD_VISIBLE_TICKS = 100;
   private ac$a current;
   private ac$a lastWeather;
   private boolean seeded;
   private boolean inOverworld;
   private int hudTicksLeft;
   private ac$a changeFrom;
   private ac$a changeTo;
   private static int nqNp0gpyzV;
   private transient int jIqivykINC;
   private static String qdlkvkrxod = ByteBuffer.wrap(zhllplsvkoflchx()).asCharBuffer().toString();

   private ac() {
super();
      int var6 = 1866588162 ^ 757771675;
      
      var6 = 616627538 ^ var6;
      var6 = 1892755758 ^ 1409231853 ^ Integer.parseInt("1166389768");
      this.jIqivykINC = 1586169175 ^ nqNp0gpyzV;
      var6 = frhemmmuevgpllvq(var6, 1455754463);
      ac$a var2 = ac$a.CLEAR;
      this.current = var2;
   }

   public void tick(Minecraft var1) {
      int var96 = 1673805308 ^ 1702074 ^ 705848447;
      var96 = 1036807236 ^ var96;
      byte var2 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var2 == (1946406269 ^ var96)) {
         var96 = 2129310467 ^ var96;
      } else {
         label104:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var96)) {
               case 13052449:
                  var96 ^= 382807917;
               case 1632192164:
                  x var9 = x.INSTANCE;
                  v var10 = var9.weatherNotifier;
                  byte var11 = (byte)((var10.qo()) ? 1 : 0);
                  if (var11 == (1657987600 ^ var96)) {
                     var96 = 1888605626 ^ var96;
                     this.reset();
                     return;
                  }

                  label101:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var96)) {
                        case 259585837:
                           var96 ^= 952505725;
                        case 916935960:
                           break label101;
                        case 1180251538:
                        default:
                           throw new IllegalStateException();
                        case 1869990898:
                     }
                  }

                  int var14 = this.hudTicksLeft;
                  if (var14 > (1511323501 ^ var96)) {
                     var96 = 1844003863 ^ var96;
                     int var59 = this.hudTicksLeft;
                     byte var3 = (byte)(939373435 ^ var96);
                     int var60 = var59 - var3;
                     this.hudTicksLeft = var60;
                     int var17 = this.hudTicksLeft;
                     if (var17 <= (939373434 ^ var96)) {
                        var96 = 285634562 ^ var96;
                        Object var61 = null;
                        this.changeFrom = (ac$a)var61;
                        Object var62 = null;
                        this.changeTo = (ac$a)var62;
                        var96 = 86143283 ^ var96;
                     } else {
                        var96 = 337903921 ^ var96;
                     }
                  } else {
                     label93:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var96)) {
                           case 243844471:
                              var96 ^= 2043495718;
                              break label93;
                           case 359600359:
                           default:
                              throw new IllegalStateException();
                           case 1502704639:
                              break;
                           case 2106724944:
                              break label93;
                        }
                     }
                  }

                  LocalPlayer var21 = var1.player;
                  ClientLevel var23 = var1.level;
                  if (var21 != null) {
                     var96 = 57619532 ^ var96;
                     if (var23 == null) {
                        var96 = 706633694 ^ var96;
                        break label104;
                     }

                     var96 = frhemmmuevgpllvq(var96, 1840205939);
                     ResourceKey var27 = var23.dimension();
                     ResourceKey var63 = Level.OVERWORLD;
                     byte var28 = (byte)((var27.equals(var63)) ? 1 : 0);
                     if (var28 == (1293538932 ^ var96)) {
                        var96 = 1216319939 ^ var96;
                        byte var84 = (byte)(90589111 ^ var96);
                        this.inOverworld = (var84 != 0);
                        byte var85 = (byte)(90589111 ^ var96);
                        this.seeded = (var85 != 0);
                        Object var86 = null;
                        this.lastWeather = (ac$a)var86;
                        byte var87 = (byte)(90589111 ^ var96);
                        this.hudTicksLeft = var87;
                        Object var88 = null;
                        this.changeFrom = (ac$a)var88;
                        Object var89 = null;
                        this.changeTo = (ac$a)var89;
                        return;
                     }

                     label75:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var96)) {
                           case 90325657:
                              var96 ^= 1679012476;
                              break label75;
                           case 443872709:
                           default:
                              throw new IllegalStateException();
                           case 1247904408:
                              break label75;
                           case 1704300033:
                        }
                     }

                     byte var64 = (byte)(688546825 ^ var96);
                     this.inOverworld = (var64 != 0);
                     ac$a var31 = currentWeather(var23);
                     this.current = var31;
                     byte var34 = (byte)((this.seeded) ? 1 : 0);
                     if (var34 == (688546824 ^ var96)) {
                        var96 = 1854404439 ^ var96;
                        this.lastWeather = var31;
                        byte var67 = (byte)(1200460638 ^ var96);
                        this.seeded = (var67 != 0);
                        return;
                     }

                     var96 = frhemmmuevgpllvq(var96, 1066217133);
                     ac$a var69 = this.lastWeather;
                     if (var31 == var69) {
                        var96 = 528029646 ^ var96;
                        return;
                     }

                     byte var58;
                     label57: {
                        var96 = frhemmmuevgpllvq(var96, 522603903);
                        ac$a var39 = this.lastWeather;
                        this.lastWeather = var31;
                        this.changeFrom = var39;
                        this.changeTo = var31;
                        byte var73 = (byte)(161548222 ^ var96);
                        this.hudTicksLeft = var73;
                        String var45 = var39.label;
                        String var75 = var31.label;
                        String var46 = "Weather: " + var45 + " \u2192 " + var75;
                        String var77 = "[Weather] " + var46;
                        MutableComponent var78 = Component.literal(var77);
                        byte var91 = (byte)(161548250 ^ var96);
                        var21.displayClientMessage(var78, (var91 != 0));
                        MutableComponent var80 = Component.literal(var46);
                        byte var92 = (byte)(161548251 ^ var96);
                        var21.displayClientMessage(var80, (var92 != 0));
                        ac$a var81 = ac$a.RAIN;
                        if (var31 != var81) {
                           var96 = 838130237 ^ var96;
                           ac$a var82 = ac$a.THUNDER;
                           if (var31 != var82) {
                              var96 = 139871567 ^ var96;
                              var58 = (byte)(805542056 ^ var96);
                              var96 = 1218394533 ^ var96;
                              break label57;
                           }

                           var96 = 1427493647 ^ var96;
                        } else {
                           var96 = 1692469554 ^ var96;
                        }

                        var58 = (byte)(1832914665 ^ var96);
                        var96 = frhemmmuevgpllvq(var96, 366784485);
                     }

                     ac$a var93 = ac$a.THUNDER;
                     byte var90;
                     if (var31 == var93) {
                        var96 = 1031102844 ^ var96;
                        var90 = (byte)(1172947056 ^ var96);
                        var96 = frhemmmuevgpllvq(var96, 600736434);
                     } else {
                        var96 = 1334778044 ^ var96;
                        var90 = (byte)(924039601 ^ var96);
                        var96 = 1362426738 ^ var96;
                     }

                     com.wimpyclient.p.f.onWeatherChange((var58 != 0), (var90 != 0));
                     return;
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var96)) {
                        case 91613864:
                           var96 = 695298962 ^ var96;
                           break label104;
                        case 168522148:
                        default:
                           throw new IllegalStateException();
                        case 491224491:
                           break;
                        case 1441364393:
                           break label104;
                     }
                  }
               case 256850796:
               default:
                  throw new IllegalStateException();
               case 2002167986:
            }
         }

         this.reset();
      }
   }

   public boolean shouldRenderHud(long var1) {
      int var17 = 240255918 ^ 1672802812 ^ 705848447;
      var17 = 661241058 ^ var17;
      x var3 = x.INSTANCE;
      v var4 = var3.weatherNotifier;
      byte var5 = (byte)((var4.qo()) ? 1 : 0);
      if (var5 != (1620912847 ^ var17)) {
         var17 = 1018827647 ^ var17;
         byte var7 = (byte)((this.inOverworld) ? 1 : 0);
         if (var7 != (1546074544 ^ var17)) {
            var17 = 1594602719 ^ var17;
            byte var9 = (byte)((this.seeded) ? 1 : 0);
            if (var9 != (53251439 ^ var17)) {
               var17 = 905715584 ^ var17;
               ac$a var11 = this.changeTo;
               if (var11 != null) {
                  var17 = 1701274500 ^ var17;
                  int var13 = this.hudTicksLeft;
                  if (var13 > (1404563819 ^ var17)) {
                     var17 = 1419496058 ^ var17;
                     byte var14 = (byte)(120339216 ^ var17);

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var17)) {
                           case 112816243:
                              var17 = 1123471347 ^ var17;
                              return (var14 != 0);
                           case 393323055:
                              break;
                           case 709153521:
                              return (var14 != 0);
                           case 1867143207:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }

                  label37:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var17)) {
                        case 36974600:
                           var17 ^= 393686931;
                           break label37;
                        case 680868332:
                           break;
                        case 1445247536:
                           break label37;
                        case 1572483478:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               } else {
                  var17 = frhemmmuevgpllvq(var17, 1913670679);
               }
            } else {
               var17 = 1206670231 ^ var17;
            }
         } else {
            var17 = 417851208 ^ var17;
         }
      } else {
         label47:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var17)) {
               case 187753068:
                  var17 ^= 610137143;
                  break label47;
               case 1107070063:
               default:
                  throw new RuntimeException(new IOException());
               case 1669954334:
                  break;
               case 1770446668:
                  break label47;
            }
         }
      }

      byte var25 = (byte)(1153490680 ^ var17);
      var17 = 18491930 ^ var17;
      return (var25 != 0);
   }

   public ac$a currentWeather() {
      int var7 = 1000114375 ^ 55208487 ^ 705848447;
      var7 = 1080341938 ^ var7;
      ac$a var2 = this.current;
      ac$a var4;
      if (var2 == null) {
         var7 = 435884118 ^ var7;
         var4 = ac$a.CLEAR;
         var7 = 429195904 ^ var7;
      } else {
         var7 = frhemmmuevgpllvq(var7, 1853697755);
         var4 = this.current;
         var7 = 1846754317 ^ var7;
      }

      return var4;
   }

   public String transitionLabel() {
      label46: {
         int var18 = 854733863 ^ 1897406573 ^ 705848447;
         var18 = 858512841 ^ var18;
         ac$a var3 = this.changeFrom;
         if (var3 != null) {
            var18 = 209523174 ^ var18;
            ac$a var5 = this.changeTo;
            if (var5 == null) {
               var18 = 1742814755 ^ var18;
               break label46;
            }

            label23:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
                  case 133356252:
                     var18 = 2108122849 ^ var18;
                     break label23;
                  case 235412985:
                  default:
                     throw new IllegalStateException();
                  case 701037378:
                     break label23;
                  case 1636048140:
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
                  case 259780280:
                     break label46;
                  case 268073931:
                     var18 = 1805397957 ^ var18;
                     break label46;
                  case 1346991551:
                  default:
                     throw new IllegalStateException();
                  case 1974225854:
               }
            }
         }

         ac$a var7 = this.changeFrom;
         String var8 = var7.label;
         ac$a var14 = this.changeTo;
         String var15 = var14.label;
         return var8 + " \u2192 " + var15;
      }

      ac$a var11 = this.currentWeather();
      String var12 = var11.label;
      return var12.toUpperCase();
   }

   private static ac$a currentWeather(Level var0) {
      int var10 = 1078604384 ^ 2007449308 ^ 1956208936;
      var10 = 1431641409 ^ var10;
      byte var2 = (byte)((var0.isThundering()) ? 1 : 0);
      if (var2 != (371290325 ^ var10)) {
         var10 = 1525678222 ^ var10;
         return ac$a.THUNDER;
      } else {
         var10 = 2001490467 ^ var10;
         byte var4 = (byte)((var0.isRaining()) ? 1 : 0);
         if (var4 != (1634542326 ^ var10)) {
            var10 = 139915704 ^ var10;
            return ac$a.RAIN;
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
                  case 214110929:
                     var10 = 110330224 ^ var10;
                  case 1729157997:
                     return ac$a.CLEAR;
                  case 716504193:
                     break;
                  case 1592790443:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      }
   }

   private void reset() {
      int var17 = 684290256 ^ 1855535103 ^ 705848447;
      var17 = 981495268 ^ var17;
      Object var2 = null;
      this.lastWeather = (ac$a)var2;
      byte var9 = (byte)(1455574708 ^ var17);
      this.seeded = (var9 != 0);
      byte var10 = (byte)(1455574708 ^ var17);
      this.inOverworld = (var10 != 0);
      ac$a var11 = ac$a.CLEAR;
      this.current = var11;
      Object var12 = null;
      this.changeFrom = (ac$a)var12;
      Object var13 = null;
      this.changeTo = (ac$a)var13;
      byte var14 = (byte)(1455574708 ^ var17);
      this.hudTicksLeft = var14;
   }

   static {
      int var6 = 1530905931 ^ 100055701 ^ Integer.parseInt("1166389768");
      int var3 = new Random(-1914140845350199568L).nextInt();
      nqNp0gpyzV = -1389549858 ^ var3;
      var6 = 1366940477 ^ var6;
      ac var0 = new ac();
      INSTANCE = var0;
   }

   public static String txzhsgwpmb(byte[] var0, int var1) {
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
      String var29 = qdlkvkrxod;
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

   private static byte[] zhllplsvkoflchx() {
      return new byte[0];
   }

   private static int frhemmmuevgpllvq(int var0, int var1) {
      return var1 ^ var0;
   }
}
