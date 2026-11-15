package com.wimpyclient.k;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class m {
   private static boolean resolved;
   private static boolean present;
   private static Object api;
   private static Method isShaderPackInUse;
   private static Method isRenderingShadowPass;
   private static Field bypassField;
   private static Field temporarilyIgnorePassField;
   private static Field isRenderingLevelField;
   private static int yfp0w2Pxxu;
   private transient int HtzoaBCUwP;

   private m() {
super();
      int var4 = 2101767844 ^ 662539438;
      
      var4 = igaroxivjsfqcqge(var4, 529091656);
      var4 = 1405630375 ^ 742198563 ^ Integer.parseInt("977769670");
      this.HtzoaBCUwP = 889318192 ^ yfp0w2Pxxu;
      var4 = igaroxivjsfqcqge(var4, 160256565);
   }

   static boolean isShaderPackInUse() {
      int var15 = 1618912607 ^ 1911842591 ^ 1851886085;
      var15 = 741080879 ^ var15;
      byte var0 = (byte)((resolve()) ? 1 : 0);
      if (var0 != (1405138794 ^ var15)) {
         var15 = 1826613175 ^ var15;
         Method var5 = isShaderPackInUse;
         if (var5 != null) {
            var15 = 153290768 ^ var15;

            try {
               Boolean var6 = Boolean.TRUE;
               Method var1 = isShaderPackInUse;
               Object var2 = api;
               byte var3 = (byte)(909924557 ^ var15);
               Object[] var12 = new Object[var3];
               Object var11 = var1.invoke(var2, var12);
               boolean var7 = var6.equals(var11);
               var15 ^= 541219512;
               return var7;
            } catch (Throwable var16) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var15)) {
                  case -1310538135:
                     var15 = 167736641 ^ var15;
                     return (((byte)(1069755788 ^ var15)) != 0);
                  default:
                     throw new RuntimeException(new IllegalAccessException("Error in hash"));
               }
            }
         }

         var15 = 443915156 ^ var15;
      } else {
         var15 = 1990884387 ^ var15;
      }

      return (((byte)(627755849 ^ var15)) != 0);
   }

   static boolean isShadowPass() {
      int var15 = 2130007396 ^ 14260053 ^ 1851886085;
      var15 = 1402342713 ^ var15;
      byte var0 = (byte)((resolve()) ? 1 : 0);
      if (var0 != (1138443533 ^ var15)) {
         var15 = 1602763651 ^ var15;
         Method var5 = isRenderingShadowPass;
         if (var5 != null) {
            var15 = 563581693 ^ var15;

            try {
               Boolean var6 = Boolean.TRUE;
               Method var1 = isRenderingShadowPass;
               Object var2 = api;
               byte var3 = (byte)(1036315763 ^ var15);
               Object[] var12 = new Object[var3];
               Object var11 = var1.invoke(var2, var12);
               boolean var7 = var6.equals(var11);
               var15 ^= 690790368;
               return var7;
            } catch (Throwable var16) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var15)) {
                  case -299408487:
                     var15 = igaroxivjsfqcqge(var15, 952270726);
                     return (((byte)(84317173 ^ var15)) != 0);
                  default:
                     throw new RuntimeException("Error in hash");
               }
            }
         } else {
            var15 = 14441477 ^ var15;
            return (((byte)(479142539 ^ var15)) != 0);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
               case 58234386:
                  var15 ^= 1599367046;
                  return (((byte)(479142539 ^ var15)) != 0);
               case 715263428:
                  return (((byte)(479142539 ^ var15)) != 0);
               case 824633158:
               default:
                  throw new RuntimeException(new IOException());
               case 1649975477:
            }
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   static void runWithPipelineBypass(Runnable var0) {
      int var72 = 860843639 ^ 1910398699 ^ 1851886085;
      var72 = 1122026879 ^ var72;
      byte var1 = (byte)(1846575078 ^ var72);
      byte var4 = var1;
      byte var11 = (byte)(1846575078 ^ var72);
      byte var5 = var11;
      byte var12 = (byte)(1846575078 ^ var72);
      byte var6 = var12;
      byte var13 = (byte)(1846575078 ^ var72);
      byte var7 = var13;
      var72 = 251580763 ^ var72;

      Throwable var9;
      label315: {
         label365: {
            label313: {
               label312: {
                  label311: {
                     label366: {
                        label367: {
                           label324: {
                              label303: {
                                 label302: {
                                    label301: {
                                       Throwable var10000;
                                       label300: {
                                          label299: {
                                             label298: {
                                                label297: {
                                                   label296: {
                                                      label295: {
                                                         label294: {
                                                            label293: {
                                                               label292: {
                                                                  label291: {
                                                                     label290: {
                                                                        label325: {
                                                                           label288: {
                                                                              try {
                                                                                 byte var14 = (byte)((resolve()) ? 1 : 0);
                                                                                 if (var14 == (1626255037 ^ var72)) {
                                                                                    break label301;
                                                                                 }

                                                                                 var72 ^= 1010810029;
                                                                                 Field var15 = bypassField;
                                                                                 if (var15 == null) {
                                                                                    break label325;
                                                                                 }

                                                                                 var72 ^= 303164576;
                                                                                 Field var16 = bypassField;
                                                                                 Object var2 = null;
                                                                                 byte var17 = (byte)((var16.getBoolean(var2)) ? 1 : 0);
                                                                                 var72 ^= 266451591;
                                                                                 var4 = var17;
                                                                                 Field var18 = bypassField;
                                                                                 Object var48 = null;
                                                                                 byte var3 = (byte)(1092699190 ^ var72);
                                                                                 var18.setBoolean(var48, (var3 != 0));
                                                                                 Field var19 = temporarilyIgnorePassField;
                                                                                 if (var19 != null) {
                                                                                    var72 ^= 833157523;
                                                                                    Field var20 = temporarilyIgnorePassField;
                                                                                    Object var49 = null;
                                                                                    byte var21 = (byte)((var20.getBoolean(var49)) ? 1 : 0);
                                                                                    var72 ^= 1409769126;
                                                                                    var5 = var21;
                                                                                    Field var22 = temporarilyIgnorePassField;
                                                                                    Object var50 = null;
                                                                                    byte var60 = (byte)(613344003 ^ var72);
                                                                                    var22.setBoolean(var50, (var60 != 0));
                                                                                    var72 ^= 662125825;
                                                                                    break label288;
                                                                                 }
                                                                              } catch (Throwable var81) {
                                                                                 var10000 = var81;
                                                                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var72)) {
                                                                                    case -2075267805:
                                                                                       break label299;
                                                                                    case -1183566176:
                                                                                       break label292;
                                                                                    case -427257726:
                                                                                       break label291;
                                                                                    case 63305474:
                                                                                       break label290;
                                                                                    case 114305907:
                                                                                       break label297;
                                                                                    case 125138411:
                                                                                       break label296;
                                                                                    case 151658938:
                                                                                       break label295;
                                                                                    case 533655576:
                                                                                       break label298;
                                                                                    case 611784721:
                                                                                       break label293;
                                                                                    case 1980233090:
                                                                                       break label294;
                                                                                    default:
                                                                                       throw new RuntimeException(new IOException("Error in hash"));
                                                                                 }
                                                                              }

                                                                              var72 ^= 1121491508;
                                                                           }

                                                                           label276: {
                                                                              try {
                                                                                 Field var23 = isRenderingLevelField;
                                                                                 if (var23 != null) {
                                                                                    var72 ^= 349657303;
                                                                                    Field var24 = isRenderingLevelField;
                                                                                    Object var51 = null;
                                                                                    byte var25 = (byte)((var24.getBoolean(var51)) ? 1 : 0);
                                                                                    var72 ^= 1465268276;
                                                                                    var6 = var25;
                                                                                    Field var26 = isRenderingLevelField;
                                                                                    Object var52 = null;
                                                                                    byte var61 = (byte)(1081655008 ^ var72);
                                                                                    var26.setBoolean(var52, (var61 != 0));
                                                                                    var72 ^= 547535758;
                                                                                    break label276;
                                                                                 }
                                                                              } catch (Throwable var80) {
                                                                                 var10000 = var80;
                                                                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var72)) {
                                                                                    case -2075267805:
                                                                                       break label299;
                                                                                    case -1183566176:
                                                                                       break label292;
                                                                                    case -427257726:
                                                                                       break label291;
                                                                                    case 63305474:
                                                                                       break label290;
                                                                                    case 114305907:
                                                                                       break label297;
                                                                                    case 125138411:
                                                                                       break label296;
                                                                                    case 151658938:
                                                                                       break label295;
                                                                                    case 533655576:
                                                                                       break label298;
                                                                                    case 611784721:
                                                                                       break label293;
                                                                                    case 1980233090:
                                                                                       break label294;
                                                                                    default:
                                                                                       throw new RuntimeException(new IOException("Error in hash"));
                                                                                 }
                                                                              }

                                                                              var72 = igaroxivjsfqcqge(var72, 1663294317);
                                                                           }

                                                                           try {
                                                                              byte var27 = (byte)(1624900975 ^ var72);
                                                                              var7 = var27;
                                                                              var72 ^= 179851619;
                                                                              break label302;
                                                                           } catch (Throwable var79) {
                                                                              var10000 = var79;
                                                                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var72)) {
                                                                                 case -2075267805:
                                                                                    break label299;
                                                                                 case -1183566176:
                                                                                    break label292;
                                                                                 case -427257726:
                                                                                    break label291;
                                                                                 case 63305474:
                                                                                    break label290;
                                                                                 case 114305907:
                                                                                    break label297;
                                                                                 case 125138411:
                                                                                    break label296;
                                                                                 case 151658938:
                                                                                    break label295;
                                                                                 case 533655576:
                                                                                    break label298;
                                                                                 case 611784721:
                                                                                    break label293;
                                                                                 case 1980233090:
                                                                                    break label294;
                                                                                 default:
                                                                                    throw new RuntimeException(new IOException("Error in hash"));
                                                                              }
                                                                           }
                                                                        }

                                                                        while (true) {
                                                                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                                                                              case 64310830:
                                                                                 var72 ^= 917718557;
                                                                                 break label302;
                                                                              case 1167238504:
                                                                              default:
                                                                                 throw new RuntimeException(new IOException());
                                                                              case 1723143757:
                                                                                 break label302;
                                                                              case 1759721967:
                                                                           }
                                                                        }
                                                                     }

                                                                     var72 = 1139214819 ^ var72;
                                                                     break label300;
                                                                  }

                                                                  var72 = 1598989587 ^ var72;
                                                                  break label300;
                                                               }

                                                               var72 = igaroxivjsfqcqge(var72, 347156951);
                                                               break label300;
                                                            }

                                                            var72 = igaroxivjsfqcqge(var72, 655447041);
                                                            break label300;
                                                         }

                                                         var72 = 1298090419 ^ var72;
                                                         break label300;
                                                      }

                                                      var72 = 1119810356 ^ var72;
                                                      break label300;
                                                   }

                                                   var72 = 1668356542 ^ var72;
                                                   break label300;
                                                }

                                                var72 = 1665512045 ^ var72;
                                                break label300;
                                             }

                                             var72 = 6711552 ^ var72;
                                             break label300;
                                          }

                                          var72 = igaroxivjsfqcqge(var72, 1930824359);
                                       }

                                       Throwable var45 = var10000;
                                       Logger var46 = com.wimpyclient.Wimpy.LOGGER;
                                       String var59 = nbtitgufmy(koehfnmevgjekai(), xvepnydyvzpbdlt(), var72);
                                       var46.warn(var59, var45);
                                       byte var47 = (byte)(60798723 ^ var72);
                                       var7 = var47;
                                       var72 = 1697038106 ^ var72;
                                       break label303;
                                    }

                                    var72 ^= 177011376;
                                 }

                                 label211:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                                       case 91714282:
                                       default:
                                          throw new RuntimeException(new IOException());
                                       case 236906683:
                                          var72 ^= 215702548;
                                          break label211;
                                       case 239137222:
                                          break;
                                       case 370921764:
                                          break label211;
                                    }
                                 }
                              }

                              try {
                                 var0.run();
                                 var72 ^= 1695949084;
                              } catch (Throwable var76) {
                                 Throwable var95 = var76;
                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var72)) {
                                    case 902316235:
                                       var72 = 1087072454 ^ var72;

                                       while (true) {
                                          try {
                                             Throwable var36 = var95;
                                             var9 = var36;
                                             var72 ^= 848483956;
                                             break;
                                          } catch (Throwable var75) {
                                             var95 = var75;
                                             switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var72)) {
                                                case 865273593:
                                                   var72 = igaroxivjsfqcqge(var72, 0);
                                                   break;
                                                default:
                                                   throw new RuntimeException("Error in hash");
                                             }
                                          }
                                       }

                                       if (var7 == (350271147 ^ var72)) {
                                          var72 = 2101845374 ^ var72;
                                          return;
                                       }

                                       label148:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                                             case 141784331:
                                                var72 ^= 1895851024;
                                                break label148;
                                             case 400413091:
                                                break;
                                             case 568494169:
                                             default:
                                                throw new RuntimeException(new IOException());
                                             case 1509006464:
                                                break label148;
                                          }
                                       }

                                       label328: {
                                          try {
                                             Field var38 = bypassField;
                                             Object var56 = null;
                                             var38.setBoolean(var56, (var4 != 0));
                                             Field var39 = temporarilyIgnorePassField;
                                             if (var39 != null) {
                                                var72 ^= 1206425312;
                                                Field var40 = temporarilyIgnorePassField;
                                                Object var57 = null;
                                                var40.setBoolean(var57, (var5 != 0));
                                                var72 ^= 2005798313;
                                                break label328;
                                             }
                                          } catch (Throwable var74) {
                                             switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var72)) {
                                                case -1405988974:
                                                   break label367;
                                                case 272769753:
                                                   break label312;
                                                case 610072201:
                                                   break label311;
                                                case 788960731:
                                                   break label366;
                                                default:
                                                   throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                             }
                                          }

                                          label139:
                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                                                case 90439082:
                                                   var72 ^= 812030793;
                                                   break label139;
                                                case 1074893855:
                                                default:
                                                   throw new RuntimeException(new IOException());
                                                case 1233934156:
                                                   break;
                                                case 1274234141:
                                                   break label139;
                                             }
                                          }
                                       }

                                       try {
                                          Field var41 = isRenderingLevelField;
                                          if (var41 == null) {
                                             break label365;
                                          }

                                          var72 ^= 1896732451;
                                          Field var42 = isRenderingLevelField;
                                          Object var58 = null;
                                          var42.setBoolean(var58, (var6 != 0));
                                          var72 ^= 1502080995;
                                          break label315;
                                       } catch (Throwable var73) {
                                          switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var72)) {
                                             case -1405988974:
                                                break label367;
                                             case 272769753:
                                                break label312;
                                             case 610072201:
                                                break label311;
                                             case 788960731:
                                                break label366;
                                             default:
                                                throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                          }
                                       }
                                    default:
                                       throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                 }
                              }

                              if (var7 == (61810949 ^ var72)) {
                                 var72 = 953287502 ^ var72;
                                 return;
                              }

                              var72 = igaroxivjsfqcqge(var72, 1473873108);

                              label368: {
                                 label202: {
                                    label201: {
                                       label200: {
                                          label199: {
                                             label198: {
                                                label197: {
                                                   try {
                                                      Field var30 = bypassField;
                                                      Object var53 = null;
                                                      var30.setBoolean(var53, (var4 != 0));
                                                      Field var31 = temporarilyIgnorePassField;
                                                      if (var31 != null) {
                                                         var72 ^= 1899997711;
                                                         Field var32 = temporarilyIgnorePassField;
                                                         Object var54 = null;
                                                         var32.setBoolean(var54, (var5 != 0));
                                                         var72 ^= 2029260457;
                                                         break label197;
                                                      }
                                                   } catch (Throwable var78) {
                                                      switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var72)) {
                                                         case -1548390774:
                                                            break label199;
                                                         case -303543366:
                                                            break label198;
                                                         case -120384334:
                                                            break label201;
                                                         case 709377777:
                                                            break label200;
                                                         default:
                                                            throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                      }
                                                   }

                                                   var72 = igaroxivjsfqcqge(var72, 164340902);
                                                }

                                                try {
                                                   Field var33 = isRenderingLevelField;
                                                   if (var33 != null) {
                                                      var72 ^= 44526561;
                                                      Field var34 = isRenderingLevelField;
                                                      Object var55 = null;
                                                      var34.setBoolean(var55, (var6 != 0));
                                                      var72 ^= 2123692620;
                                                      break label324;
                                                   }
                                                   break label368;
                                                } catch (Throwable var77) {
                                                   switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var72)) {
                                                      case -1548390774:
                                                         break label199;
                                                      case -303543366:
                                                         break;
                                                      case -120384334:
                                                         break label201;
                                                      case 709377777:
                                                         break label200;
                                                      default:
                                                         throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                   }
                                                }
                                             }

                                             var72 = 369992385 ^ var72;
                                             break label202;
                                          }

                                          var72 = igaroxivjsfqcqge(var72, 533071463);
                                          break label202;
                                       }

                                       var72 = igaroxivjsfqcqge(var72, 1861856360);
                                       break label202;
                                    }

                                    var72 = igaroxivjsfqcqge(var72, 346736928);
                                 }

                                 var72 = igaroxivjsfqcqge(var72, 573448957);
                                 return;
                              }

                              label170:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var72)) {
                                    case 94248939:
                                       var72 ^= 2083754413;
                                       break label170;
                                    case 715094778:
                                    default:
                                       throw new RuntimeException(new IOException());
                                    case 1248007377:
                                       break label170;
                                    case 2018651031:
                                 }
                              }
                           }

                           var72 = 1209012625 ^ var72;
                           return;
                        }

                        var72 = 593328812 ^ var72;
                        break label313;
                     }

                     var72 = igaroxivjsfqcqge(var72, 322691557);
                     break label313;
                  }

                  var72 = 1381019023 ^ var72;
                  break label313;
               }

               var72 = igaroxivjsfqcqge(var72, 1423144709);
            }

            var72 = 1921275107 ^ var72;
            throw new RuntimeException(var9);
         }

         var72 ^= 680147136;
      }

      var72 = 2035488399 ^ var72;
      throw new RuntimeException(var9);
   }

   private static boolean resolve() {
      int var55 = 547378449 ^ 236809249 ^ 1851886085;
      var55 = 1080795601 ^ var55;
      byte var0 = (byte)((resolved) ? 1 : 0);
      if (var0 != (11997924 ^ var55)) {
         var55 = 1561844969 ^ var55;
         return present;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var55)) {
               case 11247874:
                  var55 ^= 350117777;
               case 1700841371:
                  byte var7 = (byte)(342445428 ^ var55);
                  resolved = (var7 != 0);
                  FabricLoader var8 = FabricLoader.getInstance();
                  String var1 = nbtitgufmy(hsqxzzhwmrzqwpu(), xvepnydyvzpbdlt(), var55);
                  byte var9 = (byte)((var8.isModLoaded(var1)) ? 1 : 0);
                  if (var9 == (342445429 ^ var55)) {
                     var55 = 1937576322 ^ var55;
                     byte var34 = (byte)(1729387767 ^ var55);
                     present = (var34 != 0);
                     return (((byte)(1729387767 ^ var55)) != 0);
                  }

                  label35:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var55)) {
                        case 126620283:
                           var55 ^= 382392601;
                           break label35;
                        case 1540800117:
                        default:
                           throw new RuntimeException();
                        case 1553568831:
                           break;
                        case 2018289475:
                           break label35;
                     }
                  }

                  try {
                     String var10 = nbtitgufmy(gzlodefmdhvcytt(), xvepnydyvzpbdlt(), var55);
                     Class var11 = Class.forName(var10);
                     String var36 = nbtitgufmy(brbhbdggqpzplcl(), xvepnydyvzpbdlt(), var55);
                     byte var2 = (byte)(44274796 ^ var55);
                     Class[] var44 = new Class[var2];
                     Method var13 = var11.getMethod(var36, var44);
                     Object var37 = null;
                     byte var45 = (byte)(44274796 ^ var55);
                     Object[] var46 = new Object[var45];
                     Object var15 = var13.invoke(var37, var46);
                     api = var15;
                     String var38 = nbtitgufmy(qywabsedwtbvzbk(), xvepnydyvzpbdlt(), var55);
                     byte var47 = (byte)(44274796 ^ var55);
                     Class[] var48 = new Class[var47];
                     Method var17 = var11.getMethod(var38, var48);
                     isShaderPackInUse = var17;
                     String var39 = nbtitgufmy(fsjrmtvpnwhdwvg(), xvepnydyvzpbdlt(), var55);
                     byte var49 = (byte)(44274796 ^ var55);
                     Class[] var50 = new Class[var49];
                     Method var19 = var11.getMethod(var39, var50);
                     isRenderingShadowPass = var19;
                     String var20 = nbtitgufmy(eakuydowucrfkhf(), xvepnydyvzpbdlt(), var55);
                     Class var21 = Class.forName(var20);
                     String var40 = nbtitgufmy(pwxbkmwrxhlriaz(), xvepnydyvzpbdlt(), var55);
                     Field var23 = var21.getField(var40);
                     bypassField = var23;
                     String var41 = nbtitgufmy(vaaopswppfcslbl(), xvepnydyvzpbdlt(), var55);
                     Field var25 = var21.getField(var41);
                     temporarilyIgnorePassField = var25;
                     String var42 = nbtitgufmy(iqatckzwjbtrdab(), xvepnydyvzpbdlt(), var55);
                     Field var27 = var21.getField(var42);
                     isRenderingLevelField = var27;
                     byte var28 = (byte)(44274797 ^ var55);
                     present = (var28 != 0);
                     byte var29 = (byte)(44274797 ^ var55);
                     var55 ^= 1278390597;
                     return (var29 != 0);
                  } catch (Throwable var56) {
                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var55)) {
                        case 354198368:
                           var55 = 1350647221 ^ var55;
                           Logger var31 = com.wimpyclient.Wimpy.LOGGER;
                           String var43 = nbtitgufmy(yirruveslnyrhxw(), xvepnydyvzpbdlt(), var55);
                           var31.warn(var43, var56);
                           byte var32 = (byte)(1378003417 ^ var55);
                           present = (var32 != 0);
                           return (((byte)(1378003417 ^ var55)) != 0);
                        default:
                           throw new RuntimeException(new IllegalAccessException("Error in hash"));
                     }
                  }
               case 668226154:
                  break;
               case 1136985250:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   static {
      int var3 = new Random(6212909150166268051L).nextInt();
      yfp0w2Pxxu = -1037259357 ^ var3;
   }

   public static String nbtitgufmy(byte[] var0, byte[] var1, int var2) {
      String var9 = Integer.toString(var2);
      byte[] var10 = var9.getBytes();
      byte[] var7 = var10;
      byte var11 = 0;
      int var8 = var11;

      while (true) {
         int var16 = var0.length;
         if (var8 >= var16) {
            Charset var30 = StandardCharsets.UTF_16;
            return new String(var0, var30);
         }

         byte var19 = var0[var8];
         int var34 = var7.length;
         int var31 = var8 % var34;
         byte var27 = var7[var31];
         int var20 = var19 ^ var27;
         byte var21 = (byte)var20;
         var0[var8] = var21;
         byte var22 = var0[var8];
         int var36 = var1.length;
         int var33 = var8 % var36;
         byte var29 = var1[var33];
         int var23 = var22 ^ var29;
         byte var24 = (byte)var23;
         var0[var8] = var24;
         var8++;
      }
   }

   private static byte[] xvepnydyvzpbdlt() {
      return new byte[]{
         34,
         104,
         113,
         31,
         8,
         47,
         17,
         81,
         44,
         89,
         40,
         113,
         9,
         43,
         90,
         102,
         44,
         90,
         14,
         91,
         125,
         5,
         8,
         91,
         74,
         81,
         79,
         44,
         25,
         105,
         61,
         11,
         90,
         98,
         96,
         120,
         77,
         49,
         64,
         51,
         37,
         83,
         52,
         9,
         9,
         73,
         32,
         52,
         78,
         127,
         15,
         57
      };
   }

   private static byte[] koehfnmevgjekai() {
      return new byte[]{
         -22,
         -89,
         70,
         111,
         48,
         106,
         35,
         11,
         26,
         26,
         31,
         104,
         49,
         108,
         104,
         60,
         26,
         26,
         57,
         7,
         69,
         94,
         58,
         1,
         124,
         15,
         120,
         112,
         33,
         126,
         15,
         90,
         108,
         43,
         87,
         49,
         117,
         103,
         114,
         115,
         19,
         16,
         3,
         16,
         49,
         13,
         18,
         98,
         120,
         59,
         56,
         117,
         26,
         47,
         67,
         12,
         62,
         121,
         38,
         9,
         20,
         7,
         26,
         46,
         63,
         126,
         109,
         59
      };
   }

   private static byte[] hsqxzzhwmrzqwpu() {
      return new byte[]{-17, -93, 67, 66, 60, 104, 37, 10, 21, 25};
   }

   private static byte[] yirruveslnyrhxw() {
      return new byte[]{
         -19,
         -92,
         70,
         110,
         56,
         109,
         34,
         12,
         29,
         29,
         25,
         98,
         62,
         119,
         106,
         51,
         31,
         26,
         63,
         9,
         76,
         85,
         63,
         23,
         122,
         4,
         124,
         124,
         40,
         126,
         12,
         90,
         109,
         47,
         80,
         60,
         126,
         37,
         113,
         69,
         20,
         48,
         3,
         120,
         57,
         89,
         19,
         99,
         127,
         39,
         62,
         127,
         21,
         60,
         65,
         75,
         59,
         59,
         32,
         8,
         29,
         5,
         31,
         61,
         57,
         59,
         105,
         48,
         29,
         8,
         63,
         72,
         74,
         95,
         56,
         4,
         121,
         16,
         126,
         117,
         40,
         62
      };
   }

   private static byte[] gzlodefmdhvcytt() {
      return new byte[]{
         -24,
         -93,
         67,
         70,
         60,
         125,
         40,
         19,
         24,
         67,
         26,
         47,
         61,
         110,
         99,
         57,
         24,
         29,
         60,
         31,
         73,
         90,
         49,
         12,
         126,
         1,
         125,
         126,
         45,
         44,
         4,
         78,
         110,
         120,
         82,
         38,
         121,
         116,
         121,
         108,
         17,
         20,
         6,
         16,
         61,
         31,
         25,
         114,
         122,
         34,
         61,
         32,
         22,
         41,
         72,
         25,
         60,
         53,
         35,
         47,
         24,
         28,
         17,
         46,
         61,
         108,
         104,
         16,
         24,
         29,
         55,
         4
      };
   }

   private static byte[] brbhbdggqpzplcl() {
      return new byte[]{-24, -93, 67, 79, 60, 125, 40, 19, 24, 36, 26, 40, 61, 111, 99, 36, 24, 15, 60, 2, 73, 81, 49, 8};
   }

   private static byte[] qywabsedwtbvzbk() {
      return new byte[]{
         -24, -93, 67, 65, 60, 107, 40, 52, 24, 5, 26, 39, 61, 120, 99, 53, 24, 28, 60, 60, 73, 83, 49, 14, 126, 14, 125, 82, 45, 48, 4, 104, 110, 37, 82, 42
      };
   }

   private static byte[] fsjrmtvpnwhdwvg() {
      return new byte[]{
         -24,
         -93,
         67,
         65,
         60,
         107,
         40,
         53,
         24,
         8,
         26,
         40,
         61,
         120,
         99,
         53,
         24,
         28,
         60,
         5,
         73,
         92,
         49,
         10,
         126,
         54,
         125,
         115,
         45,
         63,
         4,
         89,
         110,
         57,
         82,
         56,
         121,
         86,
         121,
         100,
         17,
         20,
         6,
         77
      };
   }

   private static byte[] eakuydowucrfkhf() {
      return new byte[]{
         -24,
         -93,
         67,
         70,
         60,
         125,
         40,
         19,
         24,
         67,
         26,
         47,
         61,
         110,
         99,
         57,
         24,
         29,
         60,
         31,
         73,
         90,
         49,
         12,
         126,
         1,
         125,
         126,
         45,
         44,
         4,
         78,
         110,
         120,
         82,
         38,
         121,
         116,
         121,
         108,
         17,
         20,
         6,
         16,
         61,
         8,
         25,
         103,
         122,
         57,
         61,
         122,
         22,
         54,
         72,
         74,
         60,
         126,
         35,
         21,
         24,
         64,
         17,
         14,
         61,
         114,
         104,
         60,
         24,
         8,
         55,
         9,
         73,
         88,
         58,
         13,
         126,
         18,
         118,
         127,
         45,
         14,
         15,
         72,
         110,
         52,
         89,
         58,
         121,
         96
      };
   }

   private static byte[] pwxbkmwrxhlriaz() {
      return new byte[]{-24, -93, 67, 74, 60, 97, 40, 23, 24, 12, 26, 53, 61, 111};
   }

   private static byte[] vaaopswppfcslbl() {
      return new byte[]{
         -24,
         -93,
         67,
         92,
         60,
         125,
         40,
         10,
         24,
         29,
         26,
         41,
         61,
         110,
         99,
         49,
         24,
         28,
         60,
         5,
         73,
         94,
         49,
         20,
         126,
         44,
         125,
         124,
         45,
         48,
         4,
         82,
         110,
         36,
         82,
         42,
         121,
         86,
         121,
         100,
         17,
         20,
         6,
         77
      };
   }

   private static byte[] iqatckzwjbtrdab() {
      return new byte[]{
         -24, -93, 67, 65, 60, 107, 40, 53, 24, 8, 26, 40, 61, 120, 99, 53, 24, 28, 60, 5, 73, 92, 49, 10, 126, 41, 125, 126, 45, 40, 4, 88, 110, 58
      };
   }

   private static int igaroxivjsfqcqge(int var0, int var1) {
      return var1 ^ var0;
   }
}
