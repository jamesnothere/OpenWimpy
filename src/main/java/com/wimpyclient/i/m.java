package com.wimpyclient.i;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class m {
   public final EntityType<?> entityType;
   public final String id;
   public final String label;
   public boolean enabled;
   private static int ER7uVXI1FO;
   private transient int lzCmGE8IoX;
   private static String cuskizhhrt = ByteBuffer.wrap(gcsjafusqawwszz()).asCharBuffer().toString();

   public m(EntityType<?> var1, String var2, String var3, boolean var4) {
super();
      int var16 = 1652047758 ^ 2047532540;
      
      var16 = ucelhtjculivnvij(var16, 22136684);
      var16 = 729498197 ^ 20355146 ^ Integer.parseInt("862912257");
      this.lzCmGE8IoX = 1049425521 ^ ER7uVXI1FO;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
            case 11800265:
               var16 = 1822901116 ^ var16;
            case 920192598:
               this.entityType = var1;
               this.id = var2;
               this.label = var3;
               this.enabled = var4;
               return;
            case 142502960:
               break;
            case 1379772163:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public String enableSettingName() {
      int var5 = 1037215478 ^ 225456266 ^ 1465247079;
      var5 = 1910238171 ^ var5;
      return this.label;
   }

   public static List<m> allSelectable() {
      int var62 = 1228444166 ^ 1663268317 ^ 1775833878;
      var62 = 1641217099 ^ var62;
      ArrayList var0 = new ArrayList();
      ArrayList var6 = var0;
      HashSet var13 = new HashSet();
      HashSet var7 = var13;
      DefaultedRegistry var14 = BuiltInRegistries.ENTITY_TYPE;
      Iterator var15 = var14.iterator();
      Iterator var8 = var15;
      var62 = 791010498 ^ var62;

      label59:
      while (true) {
         byte var17 = (byte)((var8.hasNext()) ? 1 : 0);
         if (var17 == (221631556 ^ var62)) {
            var62 = ucelhtjculivnvij(var62, 1352819603);
            Function<m, String> var47 = var0x -> {
               int var7x = 938828424 ^ 687758920 ^ 1775833878;
               var7x = 714791914 ^ var7x;
               String var3 = var0x.label;
               Locale var2 = Locale.ROOT;
               return var3.toLowerCase(var2);
            };
            Comparator var48 = Comparator.comparing(var47);
            var6.sort(var48);
            return var6;
         }

         var62 = 1937350646 ^ var62;
         Object var21 = var8.next();
         EntityType var22 = (EntityType)var21;
         DefaultedRegistry var23 = BuiltInRegistries.ENTITY_TYPE;
         Identifier var24 = var23.getKey(var22);
         if (var24 != null) {
            var62 = 2000095649 ^ var62;
            byte var27 = (byte)((isExcluded(var24)) ? 1 : 0);
            if (var27 != (159072787 ^ var62)) {
               var62 = 68076254 ^ var62;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var62)) {
                     case 169059576:
                        var62 ^= 4215945;
                        continue label59;
                     case 669148483:
                        break;
                     case 1159323455:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1442192457:
                        continue label59;
                  }
               }
            } else {
               String var12;
               String var29;
               label56: {
                  var62 = ucelhtjculivnvij(var62, 1949953909);
                  var29 = var24.toString();
                  Component var31 = var22.getDescription();
                  String var32 = var31.getString();
                  var12 = var32;
                  if (var32 != null) {
                     var62 = 1142809039 ^ var62;
                     byte var35 = (byte)((var32.isBlank()) ? 1 : 0);
                     if (var35 == (962546857 ^ var62)) {
                        var62 = 676059859 ^ var62;
                        break label56;
                     }

                     var62 = 2002333764 ^ var62;
                  } else {
                     label54:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var62)) {
                           case 45175479:
                              var62 ^= 860148107;
                              break label54;
                           case 1543603935:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1849166148:
                              break;
                           case 1940495089:
                              break label54;
                        }
                     }
                  }

                  String var37 = var24.getPath();
                  byte var50 = (byte)(1309047986 ^ var62);
                  byte var1 = (byte)(1309048013 ^ var62);
                  String var38 = var37.replace((char)var50, (char)var1);
                  var12 = var38;
                  var62 = 1595075223 ^ var62;
               }

               Locale var58 = Locale.ROOT;
               String var52 = var12.toLowerCase(var58);
               byte var40 = (byte)((var7.add(var52)) ? 1 : 0);
               if (var40 == (286561914 ^ var62)) {
                  var62 = 837914194 ^ var62;
                  String var54 = var24.getPath();
                  String var42 = var12 + " (" + var54 + ")";
                  var12 = var42;
                  Locale var59 = Locale.ROOT;
                  String var56 = var42.toLowerCase(var59);
                  boolean var44 = var7.add(var56);
                  var62 = 1048271617 ^ var62;
               } else {
                  var62 = ucelhtjculivnvij(var62, 260756819);
               }

               byte var5 = (byte)(513688361 ^ var62);
               m var57 = new m(var22, var29, var12, (var5 != 0));
               boolean var46 = var6.add(var57);
               var62 = 330012525 ^ var62;
            }
         } else {
            var62 = 1937350646 ^ var62;
         }
      }
   }

   public static Map<EntityType<?>, m> indexByType(List<m> var0) {
      int var24 = 300053897 ^ 1080467320 ^ 1775833878;
      var24 = 77070535 ^ var24;
      int var19 = var0.size();
      byte var3 = (byte)(1019607330 ^ var24);
      int var20 = var19 * var3;
      HashMap var1 = new HashMap(var20);
      HashMap var4 = var1;
      Iterator var8 = var0.iterator();
      Iterator var5 = var8;
      var24 = 707262731 ^ var24;

      while (true) {
         byte var10 = (byte)((var5.hasNext()) ? 1 : 0);
         if (var10 == (383909931 ^ var24)) {
            var24 = ucelhtjculivnvij(var24, 347904864);
            return var4;
         }

         var24 = 854989883 ^ var24;
         Object var13 = var5.next();
         m var14 = (m)var13;
         EntityType var18 = var14.entityType;
         Object var16 = var4.put(var18, var14);
         var24 = 854989883 ^ var24;
      }
   }

   public static Map<String, m> indexBySettingName(List<m> var0) {
      int var24 = 1304987777 ^ 1545443195 ^ 1775833878;
      var24 = 1349200855 ^ var24;
      int var19 = var0.size();
      byte var3 = (byte)(677848889 ^ var24);
      int var20 = var19 * var3;
      HashMap var1 = new HashMap(var20);
      HashMap var4 = var1;
      Iterator var8 = var0.iterator();
      Iterator var5 = var8;
      var24 = 1052345033 ^ var24;

      while (true) {
         byte var10 = (byte)((var5.hasNext()) ? 1 : 0);
         if (var10 == (383690226 ^ var24)) {
            var24 = ucelhtjculivnvij(var24, 1736194177);
            return var4;
         }

         var24 = 1479153000 ^ var24;
         Object var13 = var5.next();
         m var14 = (m)var13;
         String var18 = var14.enableSettingName();
         Object var16 = var4.put(var18, var14);
         var24 = ucelhtjculivnvij(var24, 1479153000);
      }
   }

   public static m resolve(Entity var0, Map<EntityType<?>, m> var1) {
      int var12 = 1195955344 ^ 702114619 ^ 1775833878;
      var12 = 2113397202 ^ var12;
      byte var4 = (byte)((var0 instanceof Player) ? 1 : 0);
      if (var4 != (2059357551 ^ var12)) {
         var12 = 634409905 ^ var12;
         return null;
      } else {
         var12 = ucelhtjculivnvij(var12, 1264696047);
         EntityType var9 = var0.getType();
         Object var7 = var1.get(var9);
         return (m)var7;
      }
   }

   public static boolean matchesSearch(m var0, String var1) {
      int var41 = 978565773 ^ 1396475482 ^ 1775833878;
      var41 = 546491235 ^ var41;
      if (var1 != null) {
         var41 = 912416951 ^ var41;
         byte var7 = (byte)((var1.isBlank()) ? 1 : 0);
         if (var7 == (373720085 ^ var41)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                  case 187206062:
                     var41 ^= 195263538;
                  case 1688725340:
                     String var10 = var1.trim();
                     Locale var3 = Locale.ROOT;
                     String var11 = var10.toLowerCase(var3);
                     String var13 = var0.label;
                     Locale var27 = Locale.ROOT;
                     String var14 = var13.toLowerCase(var27);
                     byte var15 = (byte)((var14.contains(var11)) ? 1 : 0);
                     if (var15 != (501610535 ^ var41)) {
                        var41 = 1190238725 ^ var41;
                        return (((byte)(1528062499 ^ var41)) != 0);
                     }

                     var41 = 8771690 ^ var41;
                     String var17 = var0.id;
                     Locale var29 = Locale.ROOT;
                     String var18 = var17.toLowerCase(var29);
                     byte var19 = (byte)((var18.contains(var11)) ? 1 : 0);
                     if (var19 == (492838989 ^ var41)) {
                        var41 = 11150078 ^ var41;
                        String var21 = var0.id;
                        String var32 = var0.id;
                        byte var4 = (byte)(499778185 ^ var41);
                        int var33 = var32.indexOf(var4);
                        byte var37 = (byte)(499778226 ^ var41);
                        int var34 = var33 + var37;
                        String var22 = var21.substring(var34);
                        byte var35 = (byte)(499778284 ^ var41);
                        byte var38 = (byte)(499778195 ^ var41);
                        String var23 = var22.replace((char)var35, (char)var38);
                        byte var24 = (byte)((var23.contains(var11)) ? 1 : 0);
                        if (var24 == (499778227 ^ var41)) {
                           var41 = 1187184356 ^ var41;
                           byte var25 = (byte)(1527315543 ^ var41);
                           var41 = 364772828 ^ var41;
                           return (var25 != 0);
                        }

                        var41 = 200056326 ^ var41;
                     } else {
                        label42:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                              case 149562357:
                                 var41 ^= 189185272;
                              case 1140483120:
                                 break label42;
                              case 1826890704:
                                 break;
                              case 2097272032:
                              default:
                                 throw new IllegalStateException();
                           }
                        }
                     }

                     byte var51 = (byte)(371629236 ^ var41);

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                           case 183163320:
                              var41 = 1486069054 ^ var41;
                              return (var51 != 0);
                           case 318189655:
                              return (var51 != 0);
                           case 1202576910:
                              break;
                           case 1308480482:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  case 509218874:
                     break;
                  case 1090323268:
                  default:
                     throw new IllegalStateException();
               }
            }
         }

         var41 = 491104137 ^ var41;
      } else {
         var41 = 724027198 ^ var41;
      }

      return (((byte)(184755101 ^ var41)) != 0);
   }

   private static boolean isExcluded(Identifier var0) {
      int var86 = 1385543009 ^ 927159685 ^ 1775833878;
      var86 = 320481755 ^ var86;
      String var4 = var0.getPath();
      String var2 = mnayrhvfdg(peerikgtipntxff(), var86);
      byte var6 = (byte)((var4.equals(var2)) ? 1 : 0);
      if (var6 != (521525801 ^ var86)) {
         var86 = 1060408032 ^ var86;
         return (((byte)(539054280 ^ var86)) != 0);
      } else {
         var86 = 81101168 ^ var86;
         String var59 = mnayrhvfdg(mixbsmodmpxrqmy(), var86);
         byte var9 = (byte)((var4.contains(var59)) ? 1 : 0);
         if (var9 == (465591129 ^ var86)) {
            var86 = 1147304520 ^ var86;
            String var60 = mnayrhvfdg(ypvlxvqhncfwqgl(), var86);
            byte var11 = (byte)((var4.contains(var60)) ? 1 : 0);
            if (var11 == (1604460817 ^ var86)) {
               var86 = 1769862558 ^ var86;
               String var61 = mnayrhvfdg(arnvyideluhvqas(), var86);
               byte var13 = (byte)((var4.contains(var61)) ? 1 : 0);
               if (var13 == (920638607 ^ var86)) {
                  var86 = 1400762523 ^ var86;
                  String var62 = mnayrhvfdg(tuvoepuzfnuaame(), var86);
                  byte var15 = (byte)((var4.contains(var62)) ? 1 : 0);
                  if (var15 == (1705124884 ^ var86)) {
                     var86 ^= 245953710;
                     String var63 = mnayrhvfdg(zcncpfzjzhdmeyl(), var86);
                     byte var17 = (byte)((var4.contains(var63)) ? 1 : 0);
                     if (var17 == (1795870906 ^ var86)) {
                        var86 = 1642039472 ^ var86;
                        String var64 = mnayrhvfdg(ditxszpbivdbsri(), var86);
                        byte var19 = (byte)((var4.contains(var64)) ? 1 : 0);
                        if (var19 == (181753866 ^ var86)) {
                           var86 = 1699386605 ^ var86;
                           String var65 = mnayrhvfdg(bscytmzjmbcirfb(), var86);
                           byte var21 = (byte)((var4.contains(var65)) ? 1 : 0);
                           if (var21 == (1872743655 ^ var86)) {
                              var86 = 1970563442 ^ var86;
                              String var66 = mnayrhvfdg(rvkdcofowkykcna(), var86);
                              byte var23 = (byte)((var4.contains(var66)) ? 1 : 0);
                              if (var23 == (451650965 ^ var86)) {
                                 var86 = 1471224146 ^ var86;
                                 String var67 = mnayrhvfdg(ycnvnxxyburhfkk(), var86);
                                 byte var25 = (byte)((var4.contains(var67)) ? 1 : 0);
                                 if (var25 == (1297792199 ^ var86)) {
                                    var86 = 300863865 ^ var86;
                                    String var68 = mnayrhvfdg(ecrttrxbufeexeq(), var86);
                                    byte var27 = (byte)((var4.contains(var68)) ? 1 : 0);
                                    if (var27 == (1555328446 ^ var86)) {
                                       var86 = 1399238849 ^ var86;
                                       String var69 = mnayrhvfdg(qeleqtahajypjta(), var86);
                                       byte var29 = (byte)((var4.contains(var69)) ? 1 : 0);
                                       if (var29 == (265477503 ^ var86)) {
                                          var86 = 683765238 ^ var86;
                                          String var70 = mnayrhvfdg(fllstvxfyaonzpp(), var86);
                                          byte var31 = (byte)((var4.contains(var70)) ? 1 : 0);
                                          if (var31 == (655601801 ^ var86)) {
                                             var86 = 809449342 ^ var86;
                                             String var71 = mnayrhvfdg(ahidmcfkewttfig(), var86);
                                             byte var33 = (byte)((var4.contains(var71)) ? 1 : 0);
                                             if (var33 == (388794359 ^ var86)) {
                                                var86 = 643349159 ^ var86;
                                                String var72 = mnayrhvfdg(eqprynyhnmobfyu(), var86);
                                                byte var35 = (byte)((var4.contains(var72)) ? 1 : 0);
                                                if (var35 == (829701456 ^ var86)) {
                                                   var86 = 1786024005 ^ var86;
                                                   String var73 = mnayrhvfdg(mgdnzfnmsselswi(), var86);
                                                   byte var37 = (byte)((var4.contains(var73)) ? 1 : 0);
                                                   if (var37 == (1526770965 ^ var86)) {
                                                      var86 = 282134477 ^ var86;
                                                      String var74 = mnayrhvfdg(wctkufbjuctzrgb(), var86);
                                                      byte var39 = (byte)((var4.contains(var74)) ? 1 : 0);
                                                      if (var39 == (1272031960 ^ var86)) {
                                                         var86 ^= 1056526104;
                                                         String var75 = mnayrhvfdg(uhoomussqctxhnp(), var86);
                                                         byte var41 = (byte)((var4.equals(var75)) ? 1 : 0);
                                                         if (var41 == (1965614528 ^ var86)) {
                                                            var86 ^= 1673105819;
                                                            String var76 = mnayrhvfdg(mscerljfwhhioad(), var86);
                                                            byte var43 = (byte)((var4.equals(var76)) ? 1 : 0);
                                                            if (var43 == (378631259 ^ var86)) {
                                                               var86 = 480410281 ^ var86;
                                                               String var77 = mnayrhvfdg(zwoksfgdkjwlpjv(), var86);
                                                               byte var45 = (byte)((var4.equals(var77)) ? 1 : 0);
                                                               if (var45 == (171118322 ^ var86)) {
                                                                  var86 = 23388135 ^ var86;
                                                                  String var78 = mnayrhvfdg(cpfpwfttfnffpgb(), var86);
                                                                  byte var47 = (byte)((var4.equals(var78)) ? 1 : 0);
                                                                  if (var47 == (190304533 ^ var86)) {
                                                                     var86 = 89730255 ^ var86;
                                                                     String var79 = mnayrhvfdg(krsgjanrwyujner(), var86);
                                                                     byte var49 = (byte)((var4.equals(var79)) ? 1 : 0);
                                                                     if (var49 == (235863514 ^ var86)) {
                                                                        var86 = 2070969263 ^ var86;
                                                                        String var80 = mnayrhvfdg(zacwqtjlrfrcght(), var86);
                                                                        byte var51 = (byte)((var4.equals(var80)) ? 1 : 0);
                                                                        if (var51 == (1971226229 ^ var86)) {
                                                                           var86 = 242996458 ^ var86;
                                                                           String var81 = mnayrhvfdg(fanakxhsmkgwslp(), var86);
                                                                           byte var53 = (byte)((var4.equals(var81)) ? 1 : 0);
                                                                           if (var53 == (2063946399 ^ var86)) {
                                                                              var86 = 771732098 ^ var86;
                                                                              String var82 = mnayrhvfdg(mymmdxowmiwenpm(), var86);
                                                                              byte var55 = (byte)((var4.equals(var82)) ? 1 : 0);
                                                                              if (var55 == (1459281949 ^ var86)) {
                                                                                 var86 = 1198048240 ^ var86;
                                                                                 String var83 = mnayrhvfdg(ocqiwbyebhfpgkq(), var86);
                                                                                 byte var57 = (byte)((var4.equals(var83)) ? 1 : 0);
                                                                                 if (var57 == (294790125 ^ var86)) {
                                                                                    var86 = ucelhtjculivnvij(var86, 1939988197);
                                                                                    byte var58 = (byte)(1647574280 ^ var86);
                                                                                    var86 = 636663566 ^ var86;
                                                                                    return (var58 != 0);
                                                                                 }

                                                                                 var86 = 1788133418 ^ var86;
                                                                              } else {
                                                                                 var86 = 771490778 ^ var86;
                                                                              }
                                                                           } else {
                                                                              var86 = 242008 ^ var86;
                                                                           }
                                                                        } else {
                                                                           var86 = ucelhtjculivnvij(var86, 242771378);
                                                                        }
                                                                     } else {
                                                                        label89:
                                                                        while (true) {
                                                                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                                                                              case 188548568:
                                                                                 var86 ^= 1963466269;
                                                                              case 1032959939:
                                                                                 break label89;
                                                                              case 1089028425:
                                                                                 break;
                                                                              case 1718153766:
                                                                              default:
                                                                                 throw new RuntimeException();
                                                                           }
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var86 = 1884369618 ^ var86;
                                                                  }
                                                               } else {
                                                                  var86 = ucelhtjculivnvij(var86, 1899359541);
                                                               }
                                                            } else {
                                                               label122:
                                                               while (true) {
                                                                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                                                                     case 196724705:
                                                                        var86 ^= 1838651292;
                                                                     case 265483526:
                                                                        break label122;
                                                                     case 838452877:
                                                                     default:
                                                                        throw new RuntimeException();
                                                                     case 1551772869:
                                                                  }
                                                               }
                                                            }
                                                         } else {
                                                            label110:
                                                            while (true) {
                                                               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                                                                  case 50284556:
                                                                     var86 ^= 237897223;
                                                                     break label110;
                                                                  case 88918566:
                                                                  default:
                                                                     throw new RuntimeException();
                                                                  case 455625586:
                                                                     break;
                                                                  case 2112082730:
                                                                     break label110;
                                                               }
                                                            }
                                                         }
                                                      } else {
                                                         label83:
                                                         while (true) {
                                                            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                                                               case 48656595:
                                                                  var86 ^= 819415327;
                                                                  break label83;
                                                               case 350382493:
                                                               default:
                                                                  throw new RuntimeException();
                                                               case 1624651043:
                                                                  break label83;
                                                               case 1959572470:
                                                            }
                                                         }
                                                      }
                                                   } else {
                                                      var86 = 537284306 ^ var86;
                                                   }
                                                } else {
                                                   var86 = ucelhtjculivnvij(var86, 1249042071);
                                                }
                                             } else {
                                                var86 = ucelhtjculivnvij(var86, 1814717488);
                                             }
                                          } else {
                                             var86 = ucelhtjculivnvij(var86, 1544901454);
                                          }
                                       } else {
                                          var86 = ucelhtjculivnvij(var86, 1960066744);
                                       }
                                    } else {
                                       var86 = ucelhtjculivnvij(var86, 666013305);
                                    }
                                 } else {
                                    var86 = 912023296 ^ var86;
                                 }
                              } else {
                                 var86 = 1642939986 ^ var86;
                              }
                           } else {
                              label116:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                                    case 66446040:
                                    default:
                                       throw new RuntimeException();
                                    case 138802016:
                                       var86 ^= 345583392;
                                       break label116;
                                    case 1213157264:
                                       break;
                                    case 2019772379:
                                       break label116;
                                 }
                              }
                           }
                        } else {
                           var86 = 1909701581 ^ var86;
                        }
                     } else {
                        label98:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                              case 258252642:
                                 var86 ^= 269235069;
                                 break label98;
                              case 461703531:
                              default:
                                 throw new RuntimeException();
                              case 492168798:
                                 break label98;
                              case 804141533:
                           }
                        }
                     }
                  } else {
                     label104:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var86)) {
                           case 82460740:
                              var86 ^= 514115539;
                           case 691258951:
                              break label104;
                           case 1057981615:
                           default:
                              throw new RuntimeException();
                           case 1497608195:
                        }
                     }
                  }
               } else {
                  var86 = 1306081096 ^ var86;
               }
            } else {
               var86 = 614777558 ^ var86;
            }
         } else {
            var86 = ucelhtjculivnvij(var86, 1623636126);
         }

         byte var111 = (byte)(2064049094 ^ var86);
         var86 = ucelhtjculivnvij(var86, 1019718081);
         return (var111 != 0);
      }
   }

   @Override
   public String toString() {
      int var5 = 1947691338 ^ 1738214859 ^ 1465247079;
      var5 = 2054635667 ^ var5;
      return this.id;
   }

   static {
      int var3 = new Random(2092886856293851024L).nextInt();
      ER7uVXI1FO = 1481492977 ^ var3;
   }

   public static String mnayrhvfdg(byte[] var0, int var1) {
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
      String var29 = cuskizhhrt;
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
            Charset var89 = StandardCharsets.UTF_16BE;
            return new String(var11, var89);
         }

         byte var86 = var11[var12];
         int var93 = var8.length;
         int var92 = var12 % var93;
         byte var91 = var8[var92];
         int var87 = var86 ^ var91;
         byte var88 = (byte)var87;
         var11[var12] = var88;
         var12++;
      }
   }

   private static byte[] bscytmzjmbcirfb() {
      return new byte[]{0, 0, 0, 12, 0, 0, 0, 0};
   }

   private static byte[] ditxszpbivdbsri() {
      return new byte[]{0, 0, 0, 14, 0, 0, 0, 12};
   }

   private static byte[] zcncpfzjzhdmeyl() {
      return new byte[]{0, 0, 0, 12, 0, 0, 0, 26};
   }

   private static byte[] krsgjanrwyujner() {
      return new byte[]{0, 0, 0, 11, 0, 0, 0, 38};
   }

   private static byte[] ocqiwbyebhfpgkq() {
      return new byte[]{0, 0, 0, 20, 0, 0, 0, 49};
   }

   private static byte[] mgdnzfnmsselswi() {
      return new byte[]{0, 0, 0, 11, 0, 0, 0, 69};
   }

   private static byte[] cpfpwfttfnffpgb() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, 80};
   }

   private static byte[] eqprynyhnmobfyu() {
      return new byte[]{0, 0, 0, 3, 0, 0, 0, 86};
   }

   private static byte[] ycnvnxxyburhfkk() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, 89};
   }

   private static byte[] mymmdxowmiwenpm() {
      return new byte[]{0, 0, 0, 13, 0, 0, 0, 95};
   }

   private static byte[] rvkdcofowkykcna() {
      return new byte[]{0, 0, 0, 15, 0, 0, 0, 108};
   }

   private static byte[] ypvlxvqhncfwqgl() {
      return new byte[]{0, 0, 0, 8, 0, 0, 0, 123};
   }

   private static byte[] tuvoepuzfnuaame() {
      return new byte[]{0, 0, 0, 10, 0, 0, 0, -125};
   }

   private static byte[] uhoomussqctxhnp() {
      return new byte[]{0, 0, 0, 14, 0, 0, 0, -115};
   }

   private static byte[] wctkufbjuctzrgb() {
      return new byte[]{0, 0, 0, 17, 0, 0, 0, -101};
   }

   private static byte[] ecrttrxbufeexeq() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, -84};
   }

   private static byte[] zacwqtjlrfrcght() {
      return new byte[]{0, 0, 0, 12, 0, 0, 0, -77};
   }

   private static byte[] fanakxhsmkgwslp() {
      return new byte[]{0, 0, 0, 12, 0, 0, 0, -65};
   }

   private static byte[] qeleqtahajypjta() {
      return new byte[]{0, 0, 0, 12, 0, 0, 0, -53};
   }

   private static byte[] ahidmcfkewttfig() {
      return new byte[]{0, 0, 0, 8, 0, 0, 0, -41};
   }

   private static byte[] fllstvxfyaonzpp() {
      return new byte[]{0, 0, 0, 15, 0, 0, 0, -33};
   }

   private static byte[] mixbsmodmpxrqmy() {
      return new byte[]{0, 0, 0, 5, 0, 0, 0, -18};
   }

   private static byte[] peerikgtipntxff() {
      return new byte[]{0, 0, 0, 6, 0, 0, 0, -13};
   }

   private static byte[] mscerljfwhhioad() {
      return new byte[]{0, 0, 0, 17, 0, 0, 0, -7};
   }

   private static byte[] zwoksfgdkjwlpjv() {
      return new byte[]{0, 0, 0, 14, 0, 0, 1, 10};
   }

   private static byte[] arnvyideluhvqas() {
      return new byte[]{0, 0, 0, 14, 0, 0, 1, 24};
   }

   private static byte[] gcsjafusqawwszz() {
      return new byte[]{
         49,
         93,
         55,
         75,
         55,
         81,
         51,
         105,
         53,
         90,
         49,
         94,
         55,
         109,
         55,
         81,
         51,
         88,
         53,
         81,
         49,
         93,
         55,
         64,
         49,
         94,
         49,
         94,
         53,
         64,
         56,
         94,
         54,
         88,
         56,
         95,
         55,
         82,
         51,
         103,
         54,
         84,
         49,
         87,
         49,
         85,
         53,
         81,
         56,
         83,
         54,
         67,
         49,
         82,
         57,
         67,
         56,
         88,
         48,
         82,
         48,
         83,
         49,
         69,
         57,
         106,
         56,
         81,
         48,
         88,
         48,
         88,
         49,
         80,
         57,
         70,
         50,
         90,
         53,
         86,
         54,
         71,
         53,
         84,
         52,
         64,
         51,
         84,
         56,
         85,
         51,
         65,
         49,
         93,
         50,
         92,
         53,
         86,
         50,
         86,
         52,
         90,
         57,
         89,
         49,
         92,
         53,
         93,
         57,
         65,
         55,
         74,
         48,
         110,
         50,
         92,
         50,
         77,
         52,
         82,
         57,
         93,
         49,
         109,
         53,
         65,
         57,
         68,
         55,
         88,
         48,
         70,
         50,
         91,
         50,
         92,
         52,
         69,
         49,
         80,
         50,
         88,
         55,
         83,
         48,
         92,
         54,
         71,
         49,
         106,
         50,
         70,
         55,
         82,
         48,
         88,
         54,
         71,
         49,
         89,
         49,
         84,
         48,
         82,
         48,
         70,
         53,
         88,
         51,
         84,
         57,
         66,
         56,
         87,
         57,
         80,
         48,
         86,
         49,
         66,
         57,
         88,
         55,
         77,
         50,
         88,
         57,
         86,
         49,
         92,
         49,
         86,
         53,
         85,
         50,
         87,
         49,
         90,
         52,
         82,
         49,
         107,
         53,
         93,
         50,
         81,
         49,
         74,
         52,
         73,
         49,
         88,
         53,
         88,
         50,
         65,
         52,
         83,
         49,
         95,
         53,
         66,
         57,
         83,
         53,
         67,
         53,
         94,
         54,
         71,
         48,
         82,
         54,
         106,
         52,
         71,
         49,
         89,
         53,
         83,
         57,
         93,
         53,
         81,
         53,
         69,
         49,
         80,
         48,
         93,
         52,
         68,
         48,
         93,
         49,
         85,
         49,
         87,
         48,
         88,
         52,
         90,
         49,
         91,
         48,
         89,
         49,
         83,
         52,
         85,
         56,
         85,
         49,
         104,
         48,
         70,
         49,
         66,
         52,
         81,
         56,
         64,
         49,
         92,
         54,
         77,
         54,
         65,
         52,
         80,
         50,
         74,
         49,
         80,
         54,
         80,
         54,
         95,
         52,
         86,
         50,
         93,
         49,
         102,
         54,
         90,
         54,
         67,
         52,
         87,
         49,
         87,
         55,
         74,
         48,
         67,
         49,
         92,
         54,
         66,
         49,
         91,
         55,
         87,
         48,
         93,
         49,
         90,
         54,
         85,
         49,
         109,
         55,
         80,
         48,
         92,
         49,
         77,
         54,
         68,
         49,
         94,
         55,
         87,
         49,
         65,
         53,
         71,
         51,
         91,
         56,
         80,
         52,
         83,
         49,
         91,
         53,
         65,
         49,
         77,
         55,
         84,
         50,
         74,
         54,
         70,
         50,
         102,
         49,
         93,
         55,
         88,
         50,
         65,
         54,
         66,
         50,
         85,
         49,
         88,
         55,
         72,
         50,
         89,
         54,
         71,
         57,
         81,
         54,
         94,
         57,
         102,
         50,
         84,
         54,
         90,
         57,
         71,
         54,
         67,
         57,
         85,
         50,
         81,
         54,
         74,
         50,
         65,
         53,
         93,
         55,
         67,
         53,
         88,
         51,
         87,
         54,
         71,
         52,
         104,
         55,
         70,
         48,
         88,
         50,
         67,
         53,
         88,
         55,
         91,
         51,
         75,
         56,
         89,
         57,
         91,
         51,
         66,
         57,
         81,
         56,
         89,
         55,
         85,
         52,
         95,
         54,
         81,
         53,
         68,
         48,
         80,
         56,
         87,
         49,
         89,
         53,
         91,
         54,
         111,
         49,
         94,
         48,
         88,
         54,
         71,
         53,
         83,
         48,
         83,
         56,
         81,
         49,
         90,
         53,
         89,
         52,
         87,
         53,
         71,
         57,
         67,
         49,
         93,
         57,
         67,
         53,
         66,
         49,
         89,
         50,
         84,
         56,
         73,
         49,
         80,
         50,
         67,
         51,
         86,
         56,
         68,
         51,
         84,
         50,
         84,
         57,
         108,
         55,
         93,
         54,
         85,
         49,
         84,
         53,
         92,
         51,
         84,
         56,
         66,
         51,
         110,
         50,
         86,
         57,
         95,
         55,
         87,
         54,
         70,
         49,
         86,
         49,
         91,
         49,
         88,
         49,
         95,
         51,
         90,
         50,
         69,
         55,
         95,
         49,
         88,
         56,
         93,
         50,
         85,
         49,
         104,
         49,
         83,
         49,
         87,
         51,
         94,
         50,
         69,
         57,
         65,
         48,
         94,
         51,
         77,
         54,
         92,
         55,
         82,
         50,
         85,
         54,
         65,
         56,
         105,
         48,
         85,
         57,
         71,
         48,
         90,
         51,
         84,
         54,
         85,
         55,
         77
      };
   }

   private static int ucelhtjculivnvij(int var0, int var1) {
      return var0 ^ var1;
   }
}
