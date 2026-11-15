package com.wimpyclient.r;

import com.google.gson.JsonObject;
import com.wimpyclient.i.x;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Locale;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import org.slf4j.Logger;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b {
   public static final b INSTANCE;
   private static final long APPLICATION_ID = 1557653858400870410L;
   private static final String LARGE_IMAGE_KEY = "wimpy";
   private volatile boolean started;
   private volatile boolean want;
   private volatile String desiredState;
   private volatile boolean loggedSkip;
   private static int eyv6Pqn14Q;
   private transient int t68bDi3yTc;

   private b() {
super();
      int var6 = 1403812364 ^ 770530986;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var6)) {
            case 14825710:
               break;
            case 77482304:
               var6 = 1893467085 ^ var6;
            case 2077380817:
               var6 = 417840782 ^ 707945027 ^ Integer.parseInt("1011415974");
               this.t68bDi3yTc = 408826831 ^ eyv6Pqn14Q;
               var6 = 456589203 ^ var6;
               String var2 = "In menu";
               this.desiredState = var2;
               return;
            case 1489672551:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public void start() {
      int var22 = 45202464 ^ 2060278793 ^ 587743819;
      var22 = 2141696153 ^ var22;
      byte var1 = (byte)((desktopSupported()) ? 1 : 0);
      if (var1 == (617812731 ^ var22)) {
         var22 = 538937696 ^ var22;
         byte var7 = (byte)((this.loggedSkip) ? 1 : 0);
         if (var7 == (80518043 ^ var22)) {
            var22 = 954372505 ^ var22;
            byte var2 = (byte)(1009650179 ^ var22);
            this.loggedSkip = (var2 != 0);
            Logger var9 = com.wimpyclient.Wimpy.LOGGER;
            String var16 = gcxutrrlqb(kriexgkdjqxxdbv(), mwgdiozqjezcfgi(), var22);
            var9.info(var16);
            var22 = 137304597 ^ var22;
         } else {
            var22 = bhxvtaoodqzhjkyi(var22, 818776972);
         }
      } else {
         var22 = 153183612 ^ var22;
         byte var11 = (byte)((this.started) ? 1 : 0);
         if (var11 != (770865031 ^ var22)) {
            var22 = 569140150 ^ var22;
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
                  case 151382631:
                     var22 ^= 656152551;
                  case 770088867:
                     byte var17 = (byte)(183394401 ^ var22);
                     this.started = (var17 != 0);
                     Runnable var19 = this::run;
                     String var4 = gcxutrrlqb(tkabojckyxfojxk(), mwgdiozqjezcfgi(), var22);
                     Thread var13 = new Thread(var19, var4);
                     byte var18 = (byte)(183394401 ^ var22);
                     var13.setDaemon((var18 != 0));
                     var13.start();
                     return;
                  case 762527840:
                     break;
                  case 883906103:
                  default:
                     throw new RuntimeException();
               }
            }
         }
      }
   }

   public void tick(Minecraft var1) {
      int var13 = 1596115055 ^ 910321332 ^ 587743819;
      var13 = 1319012667 ^ var13;
      byte var4 = (byte)((this.started) ? 1 : 0);
      if (var4 == (83256747 ^ var13)) {
         var13 = 54577965 ^ var13;
      } else {
         var13 = 338351498 ^ var13;
         x var3 = x.INSTANCE;
         boolean var7 = var3.discordRpcEnabled();
         this.want = var7;
         ClientLevel var9 = var1.level;
         String var10;
         if (var9 != null) {
            var13 = 854768850 ^ var13;
            var10 = gcxutrrlqb(xgjqdmjeuhsueig(), mwgdiozqjezcfgi(), var13);
            var13 = bhxvtaoodqzhjkyi(var13, 1715928888);
         } else {
            var13 = 1837400019 ^ var13;
            var10 = gcxutrrlqb(nrfnwgstppjjxyl(), mwgdiozqjezcfgi(), var13);
            var13 = 959462457 ^ var13;
         }

         this.desiredState = var10;
      }
   }

   public void stop() {
      int var7 = 1066753968 ^ 1854455782 ^ 587743819;
      var7 = 1320282931 ^ var7;
      byte var2 = (byte)(1017399598 ^ var7);
      this.started = (var2 != 0);
      byte var4 = (byte)(1017399598 ^ var7);
      this.want = (var4 != 0);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private void run() {
      int var106 = 383816 ^ 515625461 ^ 587743819;
      var106 = 310068699 ^ var106;
      Object var1 = null;
      a var5 = (a)var1;
      Object var15 = null;
      String var6 = (String)var15;
      long var16 = 0L;
      long var7 = var16;
      long var18 = 0L;
      long var9 = var18;
      byte var20 = (byte)(801967405 ^ var106);
      byte var11 = var20;
      var106 = 796862413 ^ var106;

      label338:
      while (true) {
         byte var22 = (byte)((this.started) ? 1 : 0);
         if (var22 == (11676384 ^ var106)) {
            var106 = 1447790613 ^ var106;
            if (var5 != null) {
               var106 = 820568880 ^ var106;
               var5.close();
               var106 = 1166417940 ^ var106;
            } else {
               var106 = bhxvtaoodqzhjkyi(var106, 1970193188);
            }

            return;
         }

         var106 ^= 1725374722;

         label329: {
            label386: {
               label324: {
                  label342: {
                     Throwable var10000;
                     label322: {
                        label321: {
                           label320: {
                              label319: {
                                 label318: {
                                    label343: {
                                       label316: {
                                          label315: {
                                             try {
                                                byte var26 = (byte)((this.want) ? 1 : 0);
                                                if (var26 != (1717898210 ^ var106)) {
                                                   break label316;
                                                }

                                                var106 ^= 1812050958;
                                                Object var79 = null;
                                                var6 = (String)var79;
                                                if (var5 != null) {
                                                   var106 ^= 557367270;
                                                   var5.close();
                                                   Object var82 = null;
                                                   var106 ^= 393170158;
                                                   var5 = (a)var82;
                                                   Logger var83 = com.wimpyclient.Wimpy.LOGGER;
                                                   String var91 = gcxutrrlqb(idircqzhbzgnqtr(), mwgdiozqjezcfgi(), var106);
                                                   var83.info(var91);
                                                   var106 ^= 677364955;
                                                   break label315;
                                                }
                                             } catch (Throwable var116) {
                                                var10000 = var116;
                                                switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var106)) {
                                                   case -1553710600:
                                                      break label343;
                                                   case -509974751:
                                                      break label318;
                                                   case 858283795:
                                                      break label319;
                                                   case 1394999136:
                                                      break label321;
                                                   case 1524629585:
                                                      break label320;
                                                   default:
                                                      throw new RuntimeException("Error in hash");
                                                }
                                             }

                                             label314:
                                             while (true) {
                                                switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                                                   case 69417405:
                                                      var106 ^= 503855059;
                                                   case 165335146:
                                                      break label314;
                                                   case 208626475:
                                                      break;
                                                   case 862951946:
                                                   default:
                                                      throw new IllegalStateException();
                                                }
                                             }
                                          }

                                          try {
                                             long var84 = 200L;
                                             sleepQuiet(var84);
                                             var106 ^= 1603888902;
                                             break label342;
                                          } catch (Throwable var115) {
                                             var10000 = var115;
                                             switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var106)) {
                                                case -1553710600:
                                                   break label343;
                                                case -509974751:
                                                   break label318;
                                                case 858283795:
                                                   break label319;
                                                case 1394999136:
                                                   break label321;
                                                case 1524629585:
                                                   break label320;
                                                default:
                                                   throw new RuntimeException("Error in hash");
                                             }
                                          }
                                       }

                                       var106 = bhxvtaoodqzhjkyi(var106, 551976639);

                                       label279: {
                                          label278: {
                                             label277: {
                                                label276: {
                                                   label275: {
                                                      label274: {
                                                         label273: {
                                                            label272: {
                                                               label344: {
                                                                  label270: {
                                                                     label345: {
                                                                        long var12;
                                                                        try {
                                                                           if (var5 != null) {
                                                                              break label345;
                                                                           }

                                                                           var106 ^= 1836123309;
                                                                           long var28 = System.currentTimeMillis();
                                                                           var12 = var28;
                                                                           long var127;
                                                                           int var32 = (var127 = var28 - var9) == 0L ? 0 : (var127 < 0L ? -1 : 1);
                                                                           if (var32 < (737309168 ^ var106)) {
                                                                              var106 ^= 684223379;
                                                                              long var77 = 200L;
                                                                              sleepQuiet(var77);
                                                                              var106 ^= 1177134478;
                                                                              break label386;
                                                                           }
                                                                        } catch (Throwable var114) {
                                                                           var10000 = var114;
                                                                           switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var106)) {
                                                                              case 433115928:
                                                                                 var106 = bhxvtaoodqzhjkyi(var106, 1478020773);
                                                                                 break label322;
                                                                              case 874228458:
                                                                                 var106 = 497131931 ^ var106;
                                                                                 break label322;
                                                                              case 1603506049:
                                                                                 var106 = 1892721974 ^ var106;
                                                                                 break label322;
                                                                              default:
                                                                                 throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                           }
                                                                        }

                                                                        var106 = bhxvtaoodqzhjkyi(var106, 146380996);

                                                                        try {
                                                                           long var33 = 1557653858400870410L;
                                                                           a var35 = a.connect(var33);
                                                                           var106 ^= 1123895190;
                                                                           var5 = var35;
                                                                           Instant var36 = Instant.now();
                                                                           long var37 = var36.getEpochSecond();
                                                                           var106 ^= 34847963;
                                                                           var7 = var37;
                                                                           Object var39 = null;
                                                                           var106 ^= 1022518147;
                                                                           var6 = (String)var39;
                                                                           byte var40 = (byte)(1599566330 ^ var106);
                                                                           var106 ^= 962288451;
                                                                           var11 = var40;
                                                                           Logger var41 = com.wimpyclient.Wimpy.LOGGER;
                                                                           String var2 = gcxutrrlqb(qeywniaqhbbkrdf(), mwgdiozqjezcfgi(), var106);
                                                                           var41.info(var2);
                                                                           var106 ^= 1098391363;
                                                                        } catch (Throwable var112) {
                                                                           var10000 = var112;
                                                                           var106 = switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var106)) {
                                                                              case -88371246 -> bhxvtaoodqzhjkyi(var106, 512373339);
                                                                              case 229995795 -> 543943939;
                                                                              case 442452385 -> 1654041237;
                                                                              case 489198539 -> 578310616;
                                                                              case 811685323 -> 668035352;
                                                                              default -> throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                           };

                                                                           label254: {
                                                                              try {
                                                                                 Throwable var67 = var10000;
                                                                                 long var98 = 15000L;
                                                                                 long var70 = var12 + var98;
                                                                                 var9 = var70;
                                                                                 if (var11 == (1105019809 ^ var106)) {
                                                                                    var106 ^= 1551621726;
                                                                                    byte var73 = (byte)(497458686 ^ var106);
                                                                                    var11 = var73;
                                                                                    Logger var74 = com.wimpyclient.Wimpy.LOGGER;
                                                                                    String var90 = gcxutrrlqb(tvemwsfpsccexos(), mwgdiozqjezcfgi(), var106);
                                                                                    String var101 = var67.toString();
                                                                                    var74.info(var90, var101);
                                                                                    var106 ^= 678847913;
                                                                                    break label254;
                                                                                 }
                                                                              } catch (Throwable var111) {
                                                                                 var10000 = var111;
                                                                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var106)) {
                                                                                    case -1366834511:
                                                                                       break label275;
                                                                                    case -315297800:
                                                                                       break label274;
                                                                                    case -88371246:
                                                                                       break label272;
                                                                                    case 229995795:
                                                                                       break label277;
                                                                                    case 250223882:
                                                                                       break label273;
                                                                                    case 442452385:
                                                                                       break label344;
                                                                                    case 489198539:
                                                                                       break label276;
                                                                                    case 811685323:
                                                                                       break label279;
                                                                                    case 1000452049:
                                                                                       break label278;
                                                                                    default:
                                                                                       throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                                 }
                                                                              }

                                                                              var106 = bhxvtaoodqzhjkyi(var106, 1947057143);
                                                                           }

                                                                           try {
                                                                              long var75 = 200L;
                                                                              sleepQuiet(var75);
                                                                              var106 ^= 760011585;
                                                                              break label329;
                                                                           } catch (Throwable var110) {
                                                                              var10000 = var110;
                                                                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var106)) {
                                                                                 case -1366834511:
                                                                                    break label275;
                                                                                 case -315297800:
                                                                                    break label274;
                                                                                 case -88371246:
                                                                                    break label272;
                                                                                 case 229995795:
                                                                                    break label277;
                                                                                 case 250223882:
                                                                                    break label273;
                                                                                 case 442452385:
                                                                                    break label344;
                                                                                 case 489198539:
                                                                                    break label276;
                                                                                 case 811685323:
                                                                                    break label279;
                                                                                 case 1000452049:
                                                                                    break label278;
                                                                                 default:
                                                                                    throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                              }
                                                                           }
                                                                        }

                                                                        while (true) {
                                                                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                                                                              case 163144348:
                                                                                 break label270;
                                                                              case 208736224:
                                                                                 var106 ^= 1184947845;
                                                                                 break label270;
                                                                              case 411899920:
                                                                                 break;
                                                                              case 2067907803:
                                                                              default:
                                                                                 throw new IllegalStateException();
                                                                           }
                                                                        }
                                                                     }

                                                                     label197:
                                                                     while (true) {
                                                                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                                                                           case 144635367:
                                                                              var106 ^= 660053538;
                                                                              break label197;
                                                                           case 243946234:
                                                                           default:
                                                                              throw new IllegalStateException();
                                                                           case 545412623:
                                                                              break label197;
                                                                           case 1252458988:
                                                                        }
                                                                     }
                                                                  }

                                                                  try {
                                                                     byte var43 = (byte)((var5.pump()) ? 1 : 0);
                                                                     if (var43 == (1641343871 ^ var106)) {
                                                                        var106 ^= 375335536;
                                                                        var5.close();
                                                                        Object var65 = null;
                                                                        var106 ^= 326120077;
                                                                        var5 = (a)var65;
                                                                        Object var66 = null;
                                                                        var6 = (String)var66;
                                                                        var106 ^= 2089207910;
                                                                        break label324;
                                                                     }
                                                                  } catch (Throwable var109) {
                                                                     var10000 = var109;
                                                                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var106)) {
                                                                        case -1134688133:
                                                                           var106 = bhxvtaoodqzhjkyi(var106, 749278665);
                                                                           break label322;
                                                                        case 245849083:
                                                                           var106 = 989216697 ^ var106;
                                                                           break label322;
                                                                        case 668965907:
                                                                           var106 = bhxvtaoodqzhjkyi(var106, 1071195972);
                                                                           break label322;
                                                                        default:
                                                                           throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                     }
                                                                  }

                                                                  var106 = 286552765 ^ var106;

                                                                  label140: {
                                                                     label387: {
                                                                        label137: {
                                                                           label136: {
                                                                              label135: {
                                                                                 try {
                                                                                    String var45 = this.desiredState;
                                                                                    byte var47 = (byte)((var45.equals(var6)) ? 1 : 0);
                                                                                    if (var47 == (1891670466 ^ var106)) {
                                                                                       var106 ^= 1439309479;
                                                                                       JsonObject var88 = activity(var45, var7);
                                                                                       var5.setActivity(var88);
                                                                                       var6 = var45;
                                                                                       var106 ^= 372210409;
                                                                                       break label135;
                                                                                    }
                                                                                 } catch (Throwable var108) {
                                                                                    var10000 = var108;
                                                                                    switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var106)) {
                                                                                       case -2046505453:
                                                                                          break label136;
                                                                                       case -1724912543:
                                                                                          break label387;
                                                                                       case 676608809:
                                                                                          break label137;
                                                                                       default:
                                                                                          throw new RuntimeException("Error in hash");
                                                                                    }
                                                                                 }

                                                                                 var106 ^= 1139106894;
                                                                              }

                                                                              try {
                                                                                 long var50 = 200L;
                                                                                 sleepQuiet(var50);
                                                                                 var106 ^= 27017097;
                                                                                 break label140;
                                                                              } catch (Throwable var107) {
                                                                                 var10000 = var107;
                                                                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var106)) {
                                                                                    case -2046505453:
                                                                                       break;
                                                                                    case -1724912543:
                                                                                       break label387;
                                                                                    case 676608809:
                                                                                       break label137;
                                                                                    default:
                                                                                       throw new RuntimeException("Error in hash");
                                                                                 }
                                                                              }
                                                                           }

                                                                           var106 = bhxvtaoodqzhjkyi(var106, 736251140);
                                                                           break label322;
                                                                        }

                                                                        var106 = 2116572067 ^ var106;
                                                                        break label322;
                                                                     }

                                                                     var106 = 1745299786 ^ var106;
                                                                     break label322;
                                                                  }

                                                                  var106 = bhxvtaoodqzhjkyi(var106, 839641317);
                                                                  continue;
                                                               }

                                                               var106 = bhxvtaoodqzhjkyi(var106, 2020163058);
                                                               break label322;
                                                            }

                                                            var106 = 74818876 ^ var106;
                                                            break label322;
                                                         }

                                                         var106 = bhxvtaoodqzhjkyi(var106, 452958055);
                                                         break label322;
                                                      }

                                                      var106 = bhxvtaoodqzhjkyi(var106, 1183074617);
                                                      break label322;
                                                   }

                                                   var106 = 1861364880 ^ var106;
                                                   break label322;
                                                }

                                                var106 = 948422335 ^ var106;
                                                break label322;
                                             }

                                             var106 = 982809188 ^ var106;
                                             break label322;
                                          }

                                          var106 = 2086068540 ^ var106;
                                          break label322;
                                       }

                                       var106 = 1026489983 ^ var106;
                                       break label322;
                                    }

                                    var106 = bhxvtaoodqzhjkyi(var106, 1330535673);
                                    break label322;
                                 }

                                 var106 = bhxvtaoodqzhjkyi(var106, 1729206306);
                                 break label322;
                              }

                              var106 ^= 1028120356;
                              break label322;
                           }

                           var106 ^= 1887360204;
                           break label322;
                        }

                        var106 ^= 1363569450;
                     }

                     Throwable var52 = var10000;
                     Logger var53 = com.wimpyclient.Wimpy.LOGGER;
                     String var89 = gcxutrrlqb(nsfixlfwnnxqzsy(), mwgdiozqjezcfgi(), var106);
                     String var95 = var52.toString();
                     var53.info(var89, var95);
                     if (var5 != null) {
                        var106 = 673634440 ^ var106;
                        var5.close();
                        Object var56 = null;
                        var5 = (a)var56;
                        var106 = 2085892571 ^ var106;
                     } else {
                        label175:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                              case 9643805:
                                 var106 ^= 1416816979;
                                 break label175;
                              case 876120399:
                                 break;
                              case 1339858967:
                              default:
                                 throw new IllegalStateException();
                              case 1751421722:
                                 break label175;
                           }
                        }
                     }

                     Object var57 = null;
                     var6 = (String)var57;
                     long var58 = System.currentTimeMillis();
                     long var96 = 15000L;
                     long var60 = var58 + var96;
                     var9 = var60;
                     long var62 = 200L;
                     sleepQuiet(var62);

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                           case 229341184:
                              var106 ^= 266475381;
                              continue label338;
                           case 447542287:
                              break;
                           case 1656386172:
                              continue label338;
                           case 2092534923:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                        case 53228683:
                           var106 ^= 1262994905;
                        case 603172872:
                           continue label338;
                        case 970853054:
                        default:
                           throw new IllegalStateException();
                        case 1918881117:
                     }
                  }
               }

               var106 = bhxvtaoodqzhjkyi(var106, 416223492);
               continue;
            }

            var106 = bhxvtaoodqzhjkyi(var106, 1168217357);
            continue;
         }

         var106 = 405670391 ^ var106;
      }
   }

   private static JsonObject activity(String var0, long var1) {
      int var39 = 97147359 ^ 167561567 ^ 995520900;
      var39 = 1959860649 ^ var39;
      JsonObject var3 = new JsonObject();
      String var20 = gcxutrrlqb(qwftakejimevqsd(), mwgdiozqjezcfgi(), var39);
      Long var28 = var1;
      var3.addProperty(var20, var28);
      JsonObject var10 = new JsonObject();
      String var21 = gcxutrrlqb(jdaemdujndylyoc(), mwgdiozqjezcfgi(), var39);
      String var29 = gcxutrrlqb(xkguvtfzyabdrkh(), mwgdiozqjezcfgi(), var39);
      var10.addProperty(var21, var29);
      String var22 = gcxutrrlqb(hhqspffondosvdi(), mwgdiozqjezcfgi(), var39);
      String var30 = gcxutrrlqb(xbjlzwmmjjwbokw(), mwgdiozqjezcfgi(), var39);
      var10.addProperty(var22, var30);
      JsonObject var13 = new JsonObject();
      String var23 = gcxutrrlqb(edncbankyuidtwk(), mwgdiozqjezcfgi(), var39);
      byte var31 = (byte)(1135737005 ^ var39);
      Integer var32 = Integer.valueOf(var31);
      var13.addProperty(var23, var32);
      String var24 = gcxutrrlqb(twunwhnqyhpeniy(), mwgdiozqjezcfgi(), var39);
      String var33 = gcxutrrlqb(jbvewsnnkiwyxsb(), mwgdiozqjezcfgi(), var39);
      var13.addProperty(var24, var33);
      String var25 = gcxutrrlqb(rwmkvowehfbqiac(), mwgdiozqjezcfgi(), var39);
      var13.addProperty(var25, var0);
      String var26 = gcxutrrlqb(scwfjxppptjkpow(), mwgdiozqjezcfgi(), var39);
      var13.add(var26, var3);
      String var27 = gcxutrrlqb(pjkmkykvthrbsit(), mwgdiozqjezcfgi(), var39);
      var13.add(var27, var10);
      return var13;
   }

   private static void sleepQuiet(long var0) {
      int var9 = 1046467950 ^ 1231592289 ^ 995520900;
      var9 = 437626117 ^ var9;

      try {
         Thread.sleep(var0);
         var9 ^= 1133490426;
      } catch (InterruptedException var10) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var9)) {
            case -1281043342:
               var9 = bhxvtaoodqzhjkyi(var9, 808359155);
               Thread var6 = Thread.currentThread();
               var6.interrupt();
               var9 = 2075816593 ^ var9;
               return;
            default:
               throw new RuntimeException(new IOException("Error in hash"));
         }
      }

      var9 = 136009368 ^ var9;
   }

   private static boolean desktopSupported() {
      int var40 = 1585388474 ^ 488723419 ^ 995520900;
      var40 = 1611760629 ^ var40;
      String var0 = gcxutrrlqb(xdckovfpzeqslgb(), mwgdiozqjezcfgi(), var40);
      String var1 = gcxutrrlqb(gpmvvpdzltpsmbt(), mwgdiozqjezcfgi(), var40);
      String var5 = System.getProperty(var0, var1);
      Locale var29 = Locale.ROOT;
      String var6 = var5.toLowerCase(var29);
      String var30 = gcxutrrlqb(qeltcxnutacqiiq(), mwgdiozqjezcfgi(), var40);
      byte var8 = (byte)((var6.contains(var30)) ? 1 : 0);
      if (var8 != (404339216 ^ var40)) {
         var40 = 676865041 ^ var40;
         return (((byte)(809606657 ^ var40)) != 0);
      } else {
         var40 = 1881505956 ^ var40;
         String var2 = gcxutrrlqb(tgsmpcramytpqpj(), mwgdiozqjezcfgi(), var40);
         File var9 = new File(var2);
         byte var10 = (byte)((var9.exists()) ? 1 : 0);
         if (var10 == (1748777652 ^ var40)) {
            var40 = 1474565750 ^ var40;
            String var37 = gcxutrrlqb(wbquznkixelooka(), mwgdiozqjezcfgi(), var40);
            File var11 = new File(var37);
            byte var12 = (byte)((var11.exists()) ? 1 : 0);
            if (var12 != (1071131842 ^ var40)) {
               var40 = 1077395542 ^ var40;
               return (((byte)(2146430100 ^ var40)) != 0);
            } else {
               var40 = bhxvtaoodqzhjkyi(var40, 1773192633);
               String var13 = gcxutrrlqb(kicjqgyfdqoxudd(), mwgdiozqjezcfgi(), var40);
               String var31 = gcxutrrlqb(fupjvswaacigsaf(), mwgdiozqjezcfgi(), var40);
               String var14 = System.getProperty(var13, var31);
               String var32 = gcxutrrlqb(edbelrmvlbkcyqq(), mwgdiozqjezcfgi(), var40);
               byte var16 = (byte)((var14.contains(var32)) ? 1 : 0);
               if (var16 != (1449716091 ^ var40)) {
                  var40 = 79463767 ^ var40;
                  return (((byte)(1389653036 ^ var40)) != 0);
               } else {
                  label81:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                        case 124457526:
                           var40 ^= 1679186999;
                        case 262972591:
                           break label81;
                        case 727648207:
                           break;
                        case 2127356994:
                        default:
                           throw new IllegalStateException();
                     }
                  }

                  String var33 = gcxutrrlqb(wznrwafbdcdhndc(), mwgdiozqjezcfgi(), var40);
                  byte var19 = (byte)((var6.contains(var33)) ? 1 : 0);
                  if (var19 == (847164748 ^ var40)) {
                     var40 = 908462566 ^ var40;
                     String var34 = gcxutrrlqb(rkovftdzskwlffi(), mwgdiozqjezcfgi(), var40);
                     byte var21 = (byte)((var6.contains(var34)) ? 1 : 0);
                     if (var21 == (72924330 ^ var40)) {
                        var40 = 524514299 ^ var40;
                        String var35 = gcxutrrlqb(wwvtlbfiujzonvh(), mwgdiozqjezcfgi(), var40);
                        byte var23 = (byte)((var6.contains(var35)) ? 1 : 0);
                        if (var23 == (454807377 ^ var40)) {
                           var40 = 545254975 ^ var40;
                           String var36 = gcxutrrlqb(ulilrbmmpycwsio(), mwgdiozqjezcfgi(), var40);
                           byte var25 = (byte)((var6.contains(var36)) ? 1 : 0);
                           if (var25 == (996417902 ^ var40)) {
                              label47:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                                    case 51526561:
                                       var40 ^= 1990716313;
                                    case 319743494:
                                       break label47;
                                    case 1847661901:
                                       break;
                                    case 2028426378:
                                    default:
                                       throw new IllegalStateException();
                                 }
                              }

                              byte var28 = (byte)(1304677111 ^ var40);
                              var40 = 1436979205 ^ var40;
                              return (var28 != 0);
                           }

                           var40 = 1092861192 ^ var40;
                        } else {
                           label65:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                                 case 75889335:
                                    var40 ^= 1633440567;
                                    break label65;
                                 case 243555527:
                                    break;
                                 case 530204412:
                                 default:
                                    throw new IllegalStateException();
                                 case 1549342062:
                                    break label65;
                              }
                           }
                        }
                     } else {
                        var40 = 2115969228 ^ var40;
                     }
                  } else {
                     label73:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                           case 30756157:
                              var40 ^= 1211705642;
                              break label73;
                           case 599524722:
                              break;
                           case 1619715087:
                              break label73;
                           case 1939230356:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }

                  byte var51 = (byte)(2051513447 ^ var40);

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                        case 216712514:
                           var40 = 1646446228 ^ var40;
                           return (var51 != 0);
                        case 366791240:
                           return (var51 != 0);
                        case 1604230763:
                           break;
                        case 1608273002:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                  case 167041408:
                     var40 ^= 399758880;
                     return (((byte)(2146430100 ^ var40)) != 0);
                  case 811392461:
                     return (((byte)(2146430100 ^ var40)) != 0);
                  case 1702469597:
                     break;
                  case 2009567348:
                  default:
                     throw new IllegalStateException();
               }
            }
         }
      }
   }

   static {
      int var6 = 2004398841 ^ 903529731 ^ Integer.parseInt("1011415974");
      int var3 = new Random(-6069614897047457838L).nextInt();
      eyv6Pqn14Q = -1264262944 ^ var3;
      var6 = 747360463 ^ var6;
      b var0 = new b();
      INSTANCE = var0;
   }

   public static String gcxutrrlqb(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] mwgdiozqjezcfgi() {
      return new byte[]{
         123,
         78,
         89,
         98,
         69,
         109,
         105,
         85,
         93,
         120,
         104,
         11,
         76,
         7,
         125,
         15,
         18,
         20,
         124,
         53,
         25,
         13,
         33,
         61,
         109,
         80,
         43,
         10,
         35,
         85,
         12,
         35,
         85,
         125,
         87,
         69,
         89,
         8,
         79,
         61,
         27,
         125,
         89,
         124,
         91,
         3,
         1,
         118,
         22,
         94,
         17,
         1,
         93,
         80
      };
   }

   private static byte[] qwftakejimevqsd() {
      return new byte[]{-76, -128, 106, 36, 114, 42, 94, 4, 109, 63, 89, 78};
   }

   private static byte[] jdaemdujndylyoc() {
      return new byte[]{-76, -128, 106, 59, 114, 63, 94, 23, 109, 42, 89, 95, 127, 109, 74, 85, 37, 73, 76, 97, 40, 91, 18, 109};
   }

   private static byte[] xkguvtfzyabdrkh() {
      return new byte[]{-76, -128, 106, 32, 114, 55, 94, 8, 109, 61, 89, 67};
   }

   private static byte[] hhqspffondosvdi() {
      return new byte[]{-76, -128, 106, 59, 114, 63, 94, 23, 109, 42, 89, 95, 127, 109, 74, 72, 37, 65, 76, 120, 40, 72};
   }

   private static byte[] xbjlzwmmjjwbokw() {
      return new byte[]{-76, -128, 106, 0, 114, 55, 94, 8, 109, 61, 89, 67, 127, 113, 74, 80, 37, 77, 76, 101, 40, 82, 18, 124};
   }

   private static byte[] edncbankyuidtwk() {
      return new byte[]{-76, -128, 106, 35, 114, 39, 94, 21, 109, 40};
   }

   private static byte[] twunwhnqyhpeniy() {
      return new byte[]{-76, -128, 106, 51, 114, 59, 94, 17, 109, 44, 89, 83, 127, 94, 74, 79};
   }

   private static byte[] jbvewsnnkiwyxsb() {
      return new byte[]{-76, -128, 106, 0, 114, 55, 94, 8, 109, 61, 89, 67, 127, 113, 74, 80, 37, 77, 76, 101, 40, 82, 18, 124};
   }

   private static byte[] rwmkvowehfbqiac() {
      return new byte[]{-76, -128, 106, 36, 114, 42, 94, 4, 109, 57, 89, 95};
   }

   private static byte[] scwfjxppptjkpow() {
      return new byte[]{-76, -128, 106, 35, 114, 55, 94, 8, 109, 40, 89, 73, 127, 70, 74, 93, 37, 73, 76, 112, 40, 79};
   }

   private static byte[] pjkmkykvthrbsit() {
      return new byte[]{-76, -128, 106, 54, 114, 45, 94, 22, 109, 40, 89, 78, 127, 65};
   }

   private static byte[] xdckovfpzeqslgb() {
      return new byte[]{-79, -127, 109, 62, 118, 39, 91, 74, 107, 34, 88, 94, 127, 89, 68, 88};
   }

   private static byte[] gpmvvpdzltpsmbt() {
      return new byte[0];
   }

   private static byte[] qeltcxnutacqiiq() {
      return new byte[]{-79, -127, 109, 48, 118, 58, 91, 0, 107, 62, 88, 80, 127, 93, 68, 89};
   }

   private static byte[] kicjqgyfdqoxudd() {
      return new byte[]{-76, -123, 109, 46, 114, 47, 95, 0, 100, 59, 89, 17, 120, 86, 74, 81, 36, 73, 69, 97};
   }

   private static byte[] fupjvswaacigsaf() {
      return new byte[0];
   }

   private static byte[] edbelrmvlbkcyqq() {
      return new byte[]{-76, -123, 109, 116, 114, 56, 95, 4, 100, 61, 89, 94, 120, 17, 74, 90, 36, 69, 69, 112, 40, 88, 21, 43};
   }

   private static byte[] wbquznkixelooka() {
      return new byte[]{
         -76,
         -127,
         110,
         124,
         116,
         45,
         88,
         20,
         105,
         57,
         89,
         79,
         123,
         83,
         76,
         81,
         35,
         3,
         72,
         101,
         40,
         72,
         22,
         101,
         92,
         15,
         26,
         86,
         23,
         73,
         61,
         99,
         98,
         62,
         102,
         25,
         104,
         64
      };
   }

   private static byte[] wwvtlbfiujzonvh() {
      return new byte[]{-79, -124, 109, 54, 117, 51, 90, 12, 106, 57, 93, 71};
   }

   private static byte[] wznrwafbdcdhndc() {
      return new byte[]{-67, -123, 110, 36, 115, 48, 94, 15};
   }

   private static byte[] tgsmpcramytpqpj() {
      return new byte[]{
         -76,
         -122,
         109,
         117,
         114,
         41,
         94,
         26,
         104,
         57,
         89,
         72,
         120,
         90,
         74,
         85,
         37,
         13,
         73,
         101,
         40,
         83,
         21,
         107,
         90,
         72,
         28,
         93,
         22,
         23,
         61,
         100,
         97,
         26,
         96,
         2,
         110,
         76,
         122,
         96,
         42,
         41,
         109,
         33,
         108,
         71,
         54,
         51
      };
   }

   private static byte[] rkovftdzskwlffi() {
      return new byte[]{-78, -125, 96, 61, 113, 63, 90, 6};
   }

   private static byte[] ulilrbmmpycwsio() {
      return new byte[]{-68, -120, 111, 56, 116, 47, 80, 29};
   }

   private static byte[] tkabojckyxfojxk() {
      return new byte[]{
         -76,
         -119,
         106,
         38,
         124,
         48,
         93,
         8,
         109,
         57,
         80,
         65,
         127,
         19,
         73,
         95,
         34,
         77,
         77,
         126,
         42,
         93,
         24,
         102,
         89,
         18,
         27,
         95,
         27,
         75,
         63,
         104,
         97,
         57,
         103,
         22
      };
   }

   private static byte[] kriexgkdjqxxdbv() {
      return new byte[]{
         -76,
         -127,
         105,
         31,
         115,
         49,
         89,
         23,
         106,
         35,
         89,
         84,
         124,
         76,
         75,
         94,
         34,
         5,
         75,
         95,
         40,
         84,
         17,
         103,
         91,
         13,
         27,
         27,
         20,
         61,
         61,
         97,
         101,
         33,
         97,
         3,
         105,
         92,
         120,
         107,
         42,
         46,
         105,
         32,
         109,
         22,
         49,
         35,
         33,
         15,
         32,
         66,
         109,
         8,
         77,
         25,
         105,
         63,
         114,
         48,
         88,
         1,
         109,
         97,
         94,
         22,
         124,
         88,
         74,
         88,
         35,
         80,
         76,
         44,
         47,
         89,
         17,
         44,
         90,
         12,
         26,
         95,
         19,
         31,
         58,
         125,
         101,
         56,
         96,
         18,
         104,
         72,
         127,
         36,
         45,
         7,
         105,
         30,
         108,
         18
      };
   }

   private static byte[] nrfnwgstppjjxyl() {
      return new byte[]{-73, -128, 105, 25, 124, 52, 91, 65, 109, 39, 90, 95, 124, 91, 68, 77};
   }

   private static byte[] xgjqdmjeuhsueig() {
      return new byte[]{-80, -122, 106, 31, 113, 48, 90, 68, 104, 42, 95, 89, 120, 94, 78, 89};
   }

   private static byte[] idircqzhbzgnqtr() {
      return new byte[]{
         -76,
         -127,
         105,
         31,
         124,
         61,
         93,
         31,
         101,
         43,
         89,
         84,
         124,
         76,
         68,
         82,
         38,
         13,
         68,
         87,
         40,
         84,
         17,
         103,
         84,
         1,
         31,
         19,
         27,
         53,
         61,
         97,
         101,
         33,
         110,
         15,
         109,
         84,
         119,
         99,
         42,
         46,
         105,
         32,
         98,
         26,
         53,
         60,
         46,
         26,
         32,
         94,
         109,
         25,
         66,
         7,
         109,
         62,
         125,
         57
      };
   }

   private static byte[] nsfixlfwnnxqzsy() {
      return new byte[]{
         -76,
         -124,
         107,
         31,
         117,
         52,
         80,
         21,
         104,
         43,
         89,
         81,
         126,
         76,
         77,
         91,
         43,
         7,
         73,
         87,
         40,
         81,
         19,
         103,
         93,
         8,
         18,
         25,
         22,
         53,
         61,
         100,
         103,
         33,
         103,
         6,
         96,
         94,
         122,
         99,
         42,
         43,
         107,
         32,
         107,
         19,
         56,
         50,
         35,
         1,
         32,
         70,
         111,
         2,
         75,
         27,
         96,
         35,
         112,
         125,
         88,
         6,
         111,
         32,
         88,
         82,
         117,
         88,
         72,
         90,
         35,
         69,
         78,
         54,
         41,
         29,
         24,
         117,
         88,
         29
      };
   }

   private static byte[] qeywniaqhbbkrdf() {
      return new byte[]{
         -76,
         -122,
         104,
         20,
         117,
         51,
         90,
         18,
         109,
         42,
         89,
         83,
         125,
         71,
         77,
         92,
         33,
         0,
         76,
         86,
         40,
         83,
         16,
         108,
         93,
         15,
         24,
         30,
         19,
         52,
         61,
         102,
         100,
         42,
         103,
         1,
         106,
         89,
         127,
         98,
         42,
         41,
         104,
         43,
         107,
         20,
         50,
         33,
         38,
         0,
         32,
         88,
         108,
         12,
         75,
         28,
         106,
         53,
         117,
         40,
         88,
         7,
         108,
         46
      };
   }

   private static byte[] tvemwsfpsccexos() {
      return new byte[]{
         -79,
         -120,
         110,
         18,
         112,
         60,
         95,
         30,
         106,
         47,
         81,
         83,
         120,
         64,
         69,
         93,
         42,
         3,
         72,
         94,
         46,
         80,
         20,
         102,
         91,
         0,
         28,
         30,
         26,
         50,
         56,
         100,
         109,
         46,
         111,
         1,
         109,
         84,
         120,
         103,
         46,
         38,
         111,
         33,
         108,
         23,
         56,
         52,
         34,
         5,
         41,
         86,
         101,
         17,
         79,
         22,
         110,
         63,
         112,
         57,
         95,
         12,
         106,
         46,
         81,
         80,
         120,
         87,
         69,
         3,
         42,
         3,
         72,
         119,
         46,
         68
      };
   }

   private static int bhxvtaoodqzhjkyi(int var0, int var1) {
      return var0 ^ var1;
   }
}
