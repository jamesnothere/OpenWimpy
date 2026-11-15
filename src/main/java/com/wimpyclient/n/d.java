package com.wimpyclient.n;

import com.mojang.authlib.GameProfile;
import com.wimpyclient.i.x;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.GameType;
import net.minecraft.world.scores.PlayerTeam;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class d {
   public static final d INSTANCE;
   private static final int SCAN_INTERVAL = 10;
   private volatile List<c> current;
   private Set<String> lastNames;
   private boolean primed;
   private int ticks;
   private static int eDxU7580FI;
   private transient int Ch1bRJaWPV;
   private static String zpzajsaqpy = ByteBuffer.wrap(ccbjqutfdhfclqk()).asCharBuffer().toString();

   private d() {
super();
      int var8 = 1232019575 ^ 168134781;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
            case 43968249:
               var8 = 1502021168 ^ var8;
            case 831766968:
               var8 = 211236831 ^ 2050953978 ^ Integer.parseInt("1816496927");
               this.Ch1bRJaWPV = 1314295417 ^ eDxU7580FI;
               var8 = 468543136 ^ var8;
               List var2 = List.of();
               this.current = var2;
               HashSet var5 = new HashSet();
               this.lastNames = var5;
               return;
            case 1243296996:
            default:
               throw new IllegalStateException();
            case 1700795630:
         }
      }
   }

   public List<c> current() {
      int var5 = 1804860302 ^ 984301371 ^ 1699965088;
      var5 = 540468578 ^ var5;
      return this.current;
   }

   public void reset() {
      int var11 = 592677404 ^ 1844148171 ^ 1699965088;
      var11 = 150122694 ^ var11;
      HashSet var2 = new HashSet();
      this.lastNames = var2;
      byte var6 = (byte)(588850609 ^ var11);
      this.primed = (var6 != 0);
      List var7 = List.of();
      this.current = var7;
      byte var8 = (byte)(588850609 ^ var11);
      this.ticks = var8;
   }

   public void clear() {
      int var4 = 803506843 ^ 1057358138 ^ 1699965088;
      var4 = 591683845 ^ var4;
      this.reset();
   }

   public void tick() {
      int var10 = 1257546646 ^ 1510087392 ^ 1699965088;
      var10 = 271036977 ^ var10;
      int var5 = this.ticks;
      byte var2 = (byte)(1703044070 ^ var10);
      int var6 = var5 + var2;
      this.ticks = var6;
      byte var7 = (byte)(1703044077 ^ var10);
      int var3 = var6 % var7;
      if (var3 == (1703044071 ^ var10)) {
         var10 = 1295279379 ^ var10;
         this.scan();
         var10 = 644183020 ^ var10;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
               case 46525760:
               default:
                  throw new RuntimeException(new IOException());
               case 78431245:
                  var10 = 1800476415 ^ var10;
                  return;
               case 1847701893:
                  return;
               case 2113963851:
            }
         }
      }
   }

   private void scan() {
      int var157 = 556006508 ^ 1080079160 ^ 1699965088;
      var157 = 321857027 ^ var157;
      Minecraft var1 = Minecraft.getInstance();
      ClientPacketListener var22 = var1.getConnection();
      if (var22 != null) {
         var157 = 1046553673 ^ var157;
         LocalPlayer var25 = var1.player;
         if (var25 != null) {
            var157 = hgrhdxfgalvnofdf(var157, 1022175505);
            x var29 = x.INSTANCE;
            b$a var30 = var29.staffDetectConfig();
            b$a var10 = var30;
            LocalPlayer var32 = var1.player;
            UUID var33 = var32.getUUID();
            UUID var11 = var33;
            HashSet var34 = new HashSet();
            HashSet var12 = var34;
            Collection var36 = var22.getListedOnlinePlayers();
            Iterator var37 = var36.iterator();
            Iterator var13 = var37;
            var157 = 1768793496 ^ var157;

            while (true) {
               byte var39 = (byte)((var13.hasNext()) ? 1 : 0);
               if (var39 == (2094967095 ^ var157)) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var157)) {
                        case 32447236:
                           var157 ^= 629481248;
                        case 229190195:
                           ArrayList var48 = new ArrayList();
                           ArrayList var148 = var48;
                           Collection var50 = var22.getOnlinePlayers();
                           Iterator var51 = var50.iterator();
                           Iterator var149 = var51;
                           var157 = 412778390 ^ var157;

                           while (true) {
                              byte var53 = (byte)((var149.hasNext()) ? 1 : 0);
                              if (var53 == (1103219073 ^ var157)) {
                                 var157 = 433278615 ^ var157;
                                 Function<c, Boolean> var124 = c::vanished;
                                 Comparator var125 = Comparator.comparing(var124);
                                 ToIntFunction<c> var139 = c::priority;
                                 Comparator var140 = Comparator.comparingInt(var139);
                                 Comparator var141 = var140.reversed();
                                 Comparator var126 = var125.thenComparing(var141);
                                 Function<c, String> var142 = var0 -> {
                                    int var7 = 462433993 ^ 1572708054 ^ 721807065;
                                    var7 = 2129347192 ^ var7;
                                    String var3 = var0.name();
                                    Locale var2x = Locale.ROOT;
                                    return var3.toLowerCase(var2x);
                                 };
                                 Comparator var127 = var126.thenComparing(var142);
                                 var148.sort(var127);
                                 HashSet var86 = new HashSet();
                                 HashSet var150 = var86;
                                 Iterator var88 = var148.iterator();
                                 Iterator var151 = var88;
                                 var157 = 1803886887 ^ var157;

                                 while (true) {
                                    byte var90 = (byte)((var151.hasNext()) ? 1 : 0);
                                    if (var90 == (865576497 ^ var157)) {
                                       var157 = 1480437816 ^ var157;
                                       byte var97 = (byte)((this.primed) ? 1 : 0);
                                       if (var97 != (1806308873 ^ var157)) {
                                          var157 = 245722679 ^ var157;
                                          Iterator var99 = var148.iterator();
                                          Iterator var152 = var99;
                                          var157 = 1892779432 ^ var157;

                                          label121:
                                          while (true) {
                                             byte var101 = (byte)((var152.hasNext()) ? 1 : 0);
                                             if (var101 == (366935446 ^ var157)) {
                                                while (true) {
                                                   switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var157)) {
                                                      case 171184043:
                                                         break label121;
                                                      case 174071436:
                                                         var157 ^= 1733328637;
                                                         break label121;
                                                      case 175402477:
                                                      default:
                                                         throw new RuntimeException();
                                                      case 1081411827:
                                                   }
                                                }
                                             }

                                             var157 = 1449343062 ^ var157;
                                             Object var103 = var152.next();
                                             c var104 = (c)var103;
                                             Set var106 = this.lastNames;
                                             String var131 = var104.name();
                                             byte var107 = (byte)((var106.contains(var131)) ? 1 : 0);
                                             if (var107 == (1136510400 ^ var157)) {
                                                var157 = 229801037 ^ var157;
                                                com.wimpyclient.k.x.onStaffAppear(var104);
                                                var157 = 930650456 ^ var157;
                                             } else {
                                                label117:
                                                while (true) {
                                                   switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var157)) {
                                                      case 54520985:
                                                         var157 ^= 986375445;
                                                         break label117;
                                                      case 1761277064:
                                                      default:
                                                         throw new RuntimeException();
                                                      case 1955131064:
                                                         break label117;
                                                      case 2067662602:
                                                   }
                                                }
                                             }

                                             var157 = 1823071555 ^ var157;
                                          }
                                       } else {
                                          var157 = 421827938 ^ var157;
                                       }

                                       this.lastNames = var150;
                                       byte var133 = (byte)(1921942378 ^ var157);
                                       this.primed = (var133 != 0);
                                       List var135 = List.copyOf(var148);
                                       this.current = var135;
                                       return;
                                    }

                                    var157 = 1524865801 ^ var157;
                                    Object var92 = var151.next();
                                    c var93 = (c)var92;
                                    String var129 = var93.name();
                                    boolean var95 = var150.add(var129);
                                    var157 = hgrhdxfgalvnofdf(var157, 1524865801);
                                 }
                              }

                              var157 = 1982414558 ^ var157;
                              Object var55 = var149.next();
                              PlayerInfo var56 = (PlayerInfo)var55;
                              if (var56 != null) {
                                 var157 = 695562632 ^ var157;
                                 GameProfile var59 = var56.getProfile();
                                 if (var59 == null) {
                                    var157 = 53981883 ^ var157;
                                    var157 = 1550581229 ^ var157;
                                 } else {
                                    var157 = 668138078 ^ var157;
                                    GameProfile var61 = var56.getProfile();
                                    UUID var62 = var61.id();
                                    byte var64 = (byte)((var62.equals(var11)) ? 1 : 0);
                                    if (var64 != (961510537 ^ var157)) {
                                       var157 = 840799482 ^ var157;
                                       var157 = hgrhdxfgalvnofdf(var157, 1251156466);
                                    } else {
                                       label206:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var157)) {
                                             case 252327942:
                                                var157 ^= 1364685042;
                                                break label206;
                                             case 1055775953:
                                                break;
                                             case 1451164707:
                                             default:
                                                throw new RuntimeException();
                                             case 1993746818:
                                                break label206;
                                          }
                                       }

                                       GameProfile var66 = var56.getProfile();
                                       String var67 = var66.name();
                                       if (var67 == null) {
                                          var157 = hgrhdxfgalvnofdf(var157, 702137850);
                                       } else {
                                          var157 = 1902016864 ^ var157;
                                          byte var70 = (byte)((var67.isEmpty()) ? 1 : 0);
                                          if (var70 != (424047899 ^ var157)) {
                                             var157 = 1936682186 ^ var157;
                                             var157 = 736677968 ^ var157;
                                          } else {
                                             label198:
                                             while (true) {
                                                switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var157)) {
                                                   case 16292770:
                                                      var157 ^= 932113603;
                                                      break label198;
                                                   case 459955683:
                                                      break;
                                                   case 1285978280:
                                                   default:
                                                      throw new RuntimeException();
                                                   case 1702545210:
                                                      break label198;
                                                }
                                             }

                                             byte var112;
                                             label191: {
                                                GameType var72 = var56.getGameMode();
                                                GameType var119 = GameType.SPECTATOR;
                                                if (var72 != var119) {
                                                   var157 = 520371124 ^ var157;
                                                   byte var74 = (byte)((var12.contains(var62)) ? 1 : 0);
                                                   if (var74 != (835494508 ^ var157)) {
                                                      label179:
                                                      while (true) {
                                                         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var157)) {
                                                            case 8145789:
                                                               var157 ^= 963194090;
                                                               break label179;
                                                            case 86773036:
                                                            default:
                                                               throw new RuntimeException();
                                                            case 552797894:
                                                               break label179;
                                                            case 1758190491:
                                                         }
                                                      }

                                                      var112 = (byte)(145067654 ^ var157);
                                                      var157 = 567232885 ^ var157;
                                                      break label191;
                                                   }

                                                   var157 = 1060527756 ^ var157;
                                                } else {
                                                   label189:
                                                   while (true) {
                                                      switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var157)) {
                                                         case 178554074:
                                                            var157 ^= 540173624;
                                                            break label189;
                                                         case 502757810:
                                                         default:
                                                            throw new RuntimeException();
                                                         case 1080925689:
                                                            break;
                                                         case 1927089860:
                                                            break label189;
                                                      }
                                                   }
                                                }

                                                var112 = (byte)(251329761 ^ var157);
                                                var157 = 663763731 ^ var157;
                                             }

                                             if (var112 != (694863859 ^ var157)) {
                                                var157 = 1184954801 ^ var157;
                                                byte var77 = (byte)((var10.showVanished()) ? 1 : 0);
                                                if (var77 == (1875525186 ^ var157)) {
                                                   var157 = 1883269330 ^ var157;
                                                   var157 = 1582014225 ^ var157;
                                                   continue;
                                                }

                                                label170:
                                                while (true) {
                                                   switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var157)) {
                                                      case 144160597:
                                                         var157 ^= 1733799385;
                                                      case 274315561:
                                                         break label170;
                                                      case 570585109:
                                                      default:
                                                         throw new RuntimeException();
                                                      case 1317534629:
                                                   }
                                                }
                                             } else {
                                                var157 = 569857128 ^ var157;
                                             }

                                             PlayerTeam var79 = var56.getTeam();
                                             Component var122 = var56.getTabListDisplayName();
                                             Component var138;
                                             if (var79 == null) {
                                                var157 = 180446692 ^ var157;
                                                var138 = null;
                                                var157 = 1656280559 ^ var157;
                                             } else {
                                                var157 = 1181113452 ^ var157;
                                                var138 = var79.getPlayerPrefix();
                                                var157 = 773844071 ^ var157;
                                             }

                                             Component var144;
                                             if (var79 == null) {
                                                var157 = 302654580 ^ var157;
                                                var144 = null;
                                                var157 = 1280996148 ^ var157;
                                             } else {
                                                var157 = hgrhdxfgalvnofdf(var157, 1789314232);
                                                var144 = var79.getPlayerSuffix();
                                                var157 = 888574968 ^ var157;
                                             }

                                             String var146;
                                             if (var79 == null) {
                                                var157 = 1421820699 ^ var157;
                                                var146 = null;

                                                label160:
                                                while (true) {
                                                   switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var157)) {
                                                      case 104087007:
                                                      default:
                                                         throw new RuntimeException();
                                                      case 225826322:
                                                         var157 ^= 1218691740;
                                                      case 848261884:
                                                         break label160;
                                                      case 1203646334:
                                                   }
                                                }
                                             } else {
                                                var157 = hgrhdxfgalvnofdf(var157, 845575276);
                                                var146 = var79.getName();
                                                var157 = 779810283 ^ var157;
                                             }

                                             int var147 = var56.getLatency();
                                             c var81 = b.classify(var67, var122, var138, var144, var146, (var112 != 0), var147, var10);
                                             if (var81 != null) {
                                                var157 = 1206520120 ^ var157;
                                                boolean var84 = var148.add(var81);
                                                var157 = 1717445493 ^ var157;
                                             } else {
                                                label152:
                                                while (true) {
                                                   switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var157)) {
                                                      case 52918768:
                                                         var157 ^= 565455437;
                                                         break label152;
                                                      case 475950357:
                                                      default:
                                                         throw new RuntimeException();
                                                      case 561790866:
                                                         break;
                                                      case 2103681489:
                                                         break label152;
                                                   }
                                                }
                                             }

                                             var157 = 1121785499 ^ var157;
                                          }
                                       }
                                    }
                                 }
                              } else {
                                 var157 = hgrhdxfgalvnofdf(var157, 1982414558);
                              }
                           }
                        case 317703406:
                           break;
                        case 1966339619:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }

               var157 = 221068026 ^ var157;
               Object var41 = var13.next();
               PlayerInfo var42 = (PlayerInfo)var41;
               if (var42 != null) {
                  var157 = 190906920 ^ var157;
                  GameProfile var45 = var42.getProfile();
                  if (var45 != null) {
                     var157 = 316365659 ^ var157;
                     GameProfile var116 = var42.getProfile();
                     UUID var117 = var116.id();
                     boolean var47 = var12.add(var117);
                     var157 = 1861192896 ^ var157;
                  } else {
                     var157 = 2083837851 ^ var157;
                  }
               } else {
                  var157 = 2002113971 ^ var157;
               }

               var157 = hgrhdxfgalvnofdf(var157, 2054745929);
            }
         }

         var157 = 1373016614 ^ var157;
      } else {
         var157 = 1874310767 ^ var157;
      }

      List var2 = List.of();
      this.current = var2;
      HashSet var113 = new HashSet();
      this.lastNames = var113;
      byte var114 = (byte)(2022225816 ^ var157);
      this.primed = (var114 != 0);
   }

   static {
      int var6 = 1788090542 ^ 2001971009 ^ Integer.parseInt("1816496927");
      int var3 = new Random(-536942303030497389L).nextInt();
      eDxU7580FI = -270823096 ^ var3;
      var6 = 148381580 ^ var6;
      d var0 = new d();
      INSTANCE = var0;
   }

   public static String idkpakdbcs(byte[] var0, int var1) {
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
      String var29 = zpzajsaqpy;
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

   private static byte[] ccbjqutfdhfclqk() {
      return new byte[0];
   }

   private static int hgrhdxfgalvnofdf(int var0, int var1) {
      return var0 ^ var1;
   }
}
