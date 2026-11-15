package com.wimpyclient.k;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NanoVG;
import org.lwjgl.system.MemoryStack;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class w {
   public static final float WIDTH = 252.0F;
   public static final float HEIGHT = 74.0F;
   private static final float ART = 54.0F;
   private static final float TEXT_X = 76.0F;
   private static final float VOL_ROW = 18.0F;
   private static final long DEMO_START;
   private static float lastX;
   private static float lastY;
   private static float lastW;
   private static float lastH;
   private static int artHandle;
   private static int artVersion;
   private static int CStsyz6lmh;
   private transient int pS4ZlDO2mL;
   private static String gxuxqpqqrz = ByteBuffer.wrap(yibzzhalmygshcb()).asCharBuffer().toString();

   private w() {
super();
      int var4 = 590861748 ^ 1339979103;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 50645806:
               var4 = 1450571548 ^ var4;
            case 380899631:
               var4 = 753323538 ^ 476759587 ^ Integer.parseInt("168845254");
               this.pS4ZlDO2mL = 1708143451 ^ CStsyz6lmh;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
                     case 26136818:
                        var4 = 83106058 ^ var4;
                        return;
                     case 340872624:
                        break;
                     case 1475498957:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1524037408:
                        return;
                  }
               }
            case 798684309:
               break;
            case 2108801894:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public static float cardHeight() {
      int var9 = 1839571023 ^ 177570097 ^ 251688915;
      var9 = 65346303 ^ var9;
      com.wimpyclient.i.x var0 = com.wimpyclient.i.x.INSTANCE;
      byte var3 = (byte)((var0.spotifyVolume) ? 1 : 0);
      if (var3 != (1809140818 ^ var9)) {
         var9 = 647196378 ^ var9;
         com.wimpyclient.q.b var4 = state();
         byte var5 = (byte)((var4.active()) ? 1 : 0);
         if (var5 != (1296441992 ^ var9)) {
            var9 = 487195421 ^ var9;
            float var6 = 92.0F;
            var9 = 1410590600 ^ var9;
            return var6;
         }

         var9 = rbicwxystpzbtgca(var9, 1255765945);
      } else {
         var9 = 1816795491 ^ var9;
      }

      float var16 = 74.0F;
      var9 = 62952236 ^ var9;
      return var16;
   }

   private static boolean demo() {
      int var6 = 1537226496 ^ 1061967337 ^ 251688915;
      var6 = 1747474396 ^ var6;
      String var0 = jhbkqgfnzb(jjmwdanooespcmh(), var6);
      com.wimpyclient.i.x var1 = com.wimpyclient.i.x.INSTANCE;
      String var3 = var1.spotifySource;
      return var0.equals(var3);
   }

   private static com.wimpyclient.q.b state() {
      int var35 = 1168285607 ^ 892557256 ^ 251688915;
      var35 = 271382611 ^ var35;
      byte var0 = (byte)((demo()) ? 1 : 0);
      if (var0 != (1874675695 ^ var35)) {
         var35 = 1264090258 ^ var35;
         long var17 = System.nanoTime();
         long var1 = DEMO_START;
         long var19 = var17 - var1;
         long var28 = 1000000L;
         long var21 = var19 / var28;
         long var30 = 227000L;
         long var23 = var21 % var30;
         byte var32 = (byte)(619002748 ^ var35);
         String var3 = jhbkqgfnzb(ndnuvrjlaxqzsbe(), var35);
         String var4 = jhbkqgfnzb(lzbeqssvesmifom(), var35);
         long var7 = 227000L;
         byte var9 = (byte)(619002748 ^ var35);
         byte var10 = (byte)(619002748 ^ var35);
         byte var11 = (byte)(619002749 ^ var35);
         byte var12 = (byte)(619002683 ^ var35);
         long var13 = System.nanoTime();
         return new com.wimpyclient.q.b((var32 != 0), var3, var4, var23, var7, (var9 != 0), (var10 != 0), var11, var12, var13);
      } else {
         var35 = 467850096 ^ var35;
         com.wimpyclient.q.a var26 = com.wimpyclient.q.a.INSTANCE;
         return var26.state();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static void renderNvg(com.wimpyclient.m.b var0, float var1, float var2) {
      int var428 = 150260594 ^ 565088107 ^ 251688915;
      var428 = 167225969 ^ var428;
      com.wimpyclient.i.x var3 = com.wimpyclient.i.x.INSTANCE;
      com.wimpyclient.i.x var12 = var3;
      com.wimpyclient.i.v var38 = var3.spotify;
      byte var39 = (byte)((var38.qo()) ? 1 : 0);
      if (var39 == (799906235 ^ var428)) {
         var428 = 101842308 ^ var428;
         k var40 = k.INSTANCE;
         k$d var4 = k$d.SPOTIFY;
         var40.clearReport(var4);
      } else {
         var428 = rbicwxystpzbtgca(var428, 114718224);
         com.wimpyclient.q.b var41 = state();
         com.wimpyclient.q.b var13 = var41;
         byte var43 = (byte)((var41.active()) ? 1 : 0);
         if (var43 == (695988139 ^ var428)) {
            var428 = 1375061721 ^ var428;
            byte var45 = (byte)((var3.spotifyHideWhenIdle) ? 1 : 0);
            if (var45 != (2022582642 ^ var428)) {
               var428 = 377681942 ^ var428;
               k var46 = k.INSTANCE;
               k$d var163 = k$d.SPOTIFY;
               var46.clearReport(var163);
               return;
            }

            var428 = 1225130376 ^ var428;
         } else {
            var428 = 418629457 ^ var428;
         }

         float var47 = 252.0F;
         float var14 = var47;
         float var48 = cardHeight();
         float var15 = var48;
         k var49 = k.INSTANCE;
         k$d var164 = k$d.SPOTIFY;
         float var236 = var1 - var47;
         float var301 = 0.5F;
         float var237 = var236 * var301;
         float var50 = var49.x(var164, var237);
         float var16 = var50;
         k var51 = k.INSTANCE;
         k$d var165 = k$d.SPOTIFY;
         float var239 = var2 - var48;
         float var303 = 12.0F;
         float var240 = var239 - var303;
         float var52 = var51.y(var165, var240);
         float var17 = var52;
         lastX = var50;
         lastY = var52;
         lastW = var47;
         lastH = var48;
         k var57 = k.INSTANCE;
         k$d var166 = k$d.SPOTIFY;
         var57.reportScaled(var166, var50, var52, var47, var48);
         com.wimpyclient.o.b var58 = com.wimpyclient.o.b.INSTANCE;
         com.wimpyclient.o.b var18 = var58;
         k var59 = k.INSTANCE;
         k$d var242 = k$d.SPOTIFY;
         float var60 = var59.beginElement(var0, var242, var50, var52);
         var428 = 1792328423 ^ var428;

         label675: {
            Throwable var10000;
            label744: {
               label666: {
                  label665: {
                     label664: {
                        label663: {
                           label662: {
                              label661: {
                                 label660: {
                                    label659: {
                                       label658: {
                                          label657: {
                                             label677: {
                                                label655: {
                                                   try {
                                                      float var378 = 13.0F;
                                                      e.glassPanel(var0, var16, var17, var14, var15, var378);
                                                      k var62 = k.INSTANCE;
                                                      byte var63 = (byte)((var62.editMode()) ? 1 : 0);
                                                      if (var63 != (1532815901 ^ var428)) {
                                                         var428 ^= 2085810195;
                                                         float var379 = 13.0F;
                                                         float var9 = 1.2F;
                                                         int var408 = var18.accentBright();
                                                         float var11 = 0.55F;
                                                         int var409 = com.wimpyclient.p.g.withAlpha(var408, var11);
                                                         var0.rectOutline(var16, var17, var14, var15, var379, var9, var409);
                                                         var428 ^= 391529061;
                                                         break label655;
                                                      }
                                                   } catch (Throwable var446) {
                                                      var10000 = var446;
                                                      switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                         case -2101165223:
                                                            break label665;
                                                         case -1748591349:
                                                            break label664;
                                                         case -1652508280:
                                                            break label663;
                                                         case -1586052400:
                                                            break label660;
                                                         case -622374678:
                                                            break label677;
                                                         case 25046315:
                                                            break label659;
                                                         case 47991187:
                                                            break label657;
                                                         case 193498296:
                                                            break label661;
                                                         case 946917489:
                                                            break label658;
                                                         case 1206079912:
                                                            break label662;
                                                         default:
                                                            throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                      }
                                                   }

                                                   var428 = rbicwxystpzbtgca(var428, 1795469942);
                                                }

                                                float var20;
                                                float var21;
                                                int var22;
                                                label647: {
                                                   try {
                                                      float var170 = 10.0F;
                                                      float var66 = var16 + var170;
                                                      var20 = var66;
                                                      float var171 = 10.0F;
                                                      float var68 = var17 + var171;
                                                      var21 = var68;
                                                      byte var69 = (byte)(-811096172 ^ var428);
                                                      var22 = var69;
                                                      byte var70 = (byte)((demo()) ? 1 : 0);
                                                      if (var70 == (811096171 ^ var428)) {
                                                         var428 ^= 824789500;
                                                         int var173 = var13.artVersion();
                                                         int var72 = artHandle(var0, var173);
                                                         var22 = var72;
                                                         var428 ^= 358599117;
                                                         break label647;
                                                      }
                                                   } catch (Throwable var445) {
                                                      var10000 = var445;
                                                      switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                         case -2101165223:
                                                            break label665;
                                                         case -1748591349:
                                                            break label664;
                                                         case -1652508280:
                                                            break label663;
                                                         case -1586052400:
                                                            break label660;
                                                         case -622374678:
                                                            break label677;
                                                         case 25046315:
                                                            break label659;
                                                         case 47991187:
                                                            break label657;
                                                         case 193498296:
                                                            break label661;
                                                         case 946917489:
                                                            break label658;
                                                         case 1206079912:
                                                            break label662;
                                                         default:
                                                            throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                      }
                                                   }

                                                   var428 ^= 611745841;
                                                }

                                                label639: {
                                                   label638: {
                                                      label637: {
                                                         label636: {
                                                            try {
                                                               byte var73 = (byte)((demo()) ? 1 : 0);
                                                               if (var73 != (338614362 ^ var428)) {
                                                                  break label636;
                                                               }

                                                               var428 ^= 1953845608;
                                                               if (var22 > (1616611634 ^ var428)) {
                                                                  var428 ^= 1944821251;
                                                                  float var347 = 54.0F;
                                                                  float var380 = 8.0F;
                                                                  var0.roundedImage(var22, var20, var21, var347, var380);
                                                                  break label638;
                                                               }
                                                            } catch (Throwable var444) {
                                                               var10000 = var444;
                                                               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                  case -2101165223:
                                                                     break label665;
                                                                  case -1748591349:
                                                                     break label664;
                                                                  case -1652508280:
                                                                     break label663;
                                                                  case -1586052400:
                                                                     break label660;
                                                                  case -622374678:
                                                                     break label677;
                                                                  case 25046315:
                                                                     break label659;
                                                                  case 47991187:
                                                                     break label657;
                                                                  case 193498296:
                                                                     break label661;
                                                                  case 946917489:
                                                                     break label658;
                                                                  case 1206079912:
                                                                     break label662;
                                                                  default:
                                                                     throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                               }
                                                            }

                                                            var428 = rbicwxystpzbtgca(var428, 1755833095);
                                                            break label637;
                                                         }

                                                         var428 = rbicwxystpzbtgca(var428, 483570287);
                                                      }

                                                      try {
                                                         float var376 = 54.0F;
                                                         drawVinyl(var0, var18, var20, var21, var376);
                                                         var428 ^= 2047130004;
                                                         break label639;
                                                      } catch (Throwable var443) {
                                                         var10000 = var443;
                                                         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                            case -2101165223:
                                                               break label665;
                                                            case -1748591349:
                                                               break label664;
                                                            case -1652508280:
                                                               break label663;
                                                            case -1586052400:
                                                               break label660;
                                                            case -622374678:
                                                               break label677;
                                                            case 25046315:
                                                               break label659;
                                                            case 47991187:
                                                               break label657;
                                                            case 193498296:
                                                               break label661;
                                                            case 946917489:
                                                               break label658;
                                                            case 1206079912:
                                                               break label662;
                                                            default:
                                                               throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                         }
                                                      }
                                                   }

                                                   var428 ^= 1632158864;
                                                }

                                                try {
                                                   byte var77 = (byte)((var13.active()) ? 1 : 0);
                                                   if (var77 != (1928909729 ^ var428)) {
                                                      break label666;
                                                   }

                                                   var428 ^= 316085764;
                                                   float var296 = 76.0F;
                                                   float var233 = var16 + var296;
                                                   float var373 = 2.0F;
                                                   float var341 = var15 / var373;
                                                   float var298 = var17 + var341;
                                                   float var342 = 13.5F;
                                                   int var375 = var18.textMuted();
                                                   String var397 = jhbkqgfnzb(hnalludxvjoycym(), var428);
                                                   float var160 = var0.text(var233, var298, var342, var375, var397);
                                                   var428 ^= 876324384;
                                                   break label675;
                                                } catch (Throwable var442) {
                                                   var10000 = var442;
                                                   switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                      case -2101165223:
                                                         break label665;
                                                      case -1748591349:
                                                         break label664;
                                                      case -1652508280:
                                                         break label663;
                                                      case -1586052400:
                                                         break label660;
                                                      case -622374678:
                                                         break;
                                                      case 25046315:
                                                         break label659;
                                                      case 47991187:
                                                         break label657;
                                                      case 193498296:
                                                         break label661;
                                                      case 946917489:
                                                         break label658;
                                                      case 1206079912:
                                                         break label662;
                                                      default:
                                                         throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                   }
                                                }
                                             }

                                             var428 = 466312972 ^ var428;
                                             break label744;
                                          }

                                          var428 = 550255651 ^ var428;
                                          break label744;
                                       }

                                       var428 = 1738125087 ^ var428;
                                       break label744;
                                    }

                                    var428 = 548958388 ^ var428;
                                    break label744;
                                 }

                                 var428 = 1421438283 ^ var428;
                                 break label744;
                              }

                              var428 = 1105634438 ^ var428;
                              break label744;
                           }

                           var428 = 1215029028 ^ var428;
                           break label744;
                        }

                        var428 = 1395106336 ^ var428;
                        break label744;
                     }

                     var428 = 846161584 ^ var428;
                     break label744;
                  }

                  var428 = 1892674938 ^ var428;
                  break label744;
               }

               var428 = 1440454055 ^ var428;

               label543: {
                  label542: {
                     label541: {
                        label540: {
                           label539: {
                              label538: {
                                 label537: {
                                    label536: {
                                       label535: {
                                          label534: {
                                             label533: {
                                                label532: {
                                                   label741: {
                                                      label529: {
                                                         label528: {
                                                            label527: {
                                                               label526: {
                                                                  label742: {
                                                                     label679: {
                                                                        float var82;
                                                                        label680: {
                                                                           label521: {
                                                                              try {
                                                                                 byte var79 = (byte)((var12.spotifyControls) ? 1 : 0);
                                                                                 if (var79 == (656623110 ^ var428)) {
                                                                                    break label521;
                                                                                 }

                                                                                 var428 ^= 1501647925;
                                                                                 float var81 = var16 + var14;
                                                                                 float var176 = 84.0F;
                                                                                 var82 = var81 - var176;
                                                                              } catch (Throwable var441) {
                                                                                 var10000 = var441;
                                                                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                                    case -2094481222:
                                                                                       break label541;
                                                                                    case -1732585463:
                                                                                       break label741;
                                                                                    case -1713635933:
                                                                                       break label532;
                                                                                    case -1636080975:
                                                                                       break label742;
                                                                                    case -1297043893:
                                                                                       break label529;
                                                                                    case -882321175:
                                                                                       break label537;
                                                                                    case -854860614:
                                                                                       break label528;
                                                                                    case -596907032:
                                                                                       break label540;
                                                                                    case -227232319:
                                                                                       break label542;
                                                                                    case -211725008:
                                                                                       break label535;
                                                                                    case -183463525:
                                                                                       break label526;
                                                                                    case 159618921:
                                                                                       break label533;
                                                                                    case 168913937:
                                                                                       break label536;
                                                                                    case 478686434:
                                                                                       break label543;
                                                                                    case 698339035:
                                                                                       break label539;
                                                                                    case 958017585:
                                                                                       break label538;
                                                                                    case 1089940024:
                                                                                       break label679;
                                                                                    case 1948885089:
                                                                                       break label534;
                                                                                    case 2131290882:
                                                                                       break label527;
                                                                                    default:
                                                                                       throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                                 }
                                                                              }

                                                                              while (true) {
                                                                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var428)) {
                                                                                    case 89816544:
                                                                                       var428 ^= 826478419;
                                                                                    case 91181003:
                                                                                       break label680;
                                                                                    case 1749834937:
                                                                                    default:
                                                                                       throw new RuntimeException();
                                                                                    case 2143632387:
                                                                                 }
                                                                              }
                                                                           }

                                                                           var428 = rbicwxystpzbtgca(var428, 351021648);

                                                                           try {
                                                                              float var158 = var16 + var14;
                                                                              float var231 = 12.0F;
                                                                              var82 = var158 - var231;
                                                                              var428 ^= 2083418422;
                                                                           } catch (Throwable var435) {
                                                                              var10000 = var435;
                                                                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                                 case -2094481222:
                                                                                    break label541;
                                                                                 case -1732585463:
                                                                                    break label741;
                                                                                 case -1713635933:
                                                                                    break label532;
                                                                                 case -1636080975:
                                                                                    break label742;
                                                                                 case -1297043893:
                                                                                    break label529;
                                                                                 case -882321175:
                                                                                    break label537;
                                                                                 case -854860614:
                                                                                    break label528;
                                                                                 case -596907032:
                                                                                    break label540;
                                                                                 case -227232319:
                                                                                    break label542;
                                                                                 case -211725008:
                                                                                    break label535;
                                                                                 case -183463525:
                                                                                    break label526;
                                                                                 case 159618921:
                                                                                    break label533;
                                                                                 case 168913937:
                                                                                    break label536;
                                                                                 case 478686434:
                                                                                    break label543;
                                                                                 case 698339035:
                                                                                    break label539;
                                                                                 case 958017585:
                                                                                    break label538;
                                                                                 case 1089940024:
                                                                                    break label679;
                                                                                 case 1948885089:
                                                                                    break label534;
                                                                                 case 2131290882:
                                                                                    break label527;
                                                                                 default:
                                                                                    throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                              }
                                                                           }
                                                                        }

                                                                        label508: {
                                                                           try {
                                                                              float var246 = 76.0F;
                                                                              float var178 = var16 + var246;
                                                                              float var84 = var82 - var178;
                                                                              float var179 = 6.0F;
                                                                              float var85 = var84 - var179;
                                                                              float var247 = 76.0F;
                                                                              float var181 = var16 + var247;
                                                                              float var309 = 20.0F;
                                                                              float var249 = var17 + var309;
                                                                              float var310 = 14.0F;
                                                                              int var349 = var18.textPrimary();
                                                                              float var398 = 14.0F;
                                                                              String var411 = var13.title();
                                                                              String var382 = var0.ellipsize(var398, var411, var85);
                                                                              float var87 = var0.text(var181, var249, var310, var349, var382);
                                                                              float var250 = 76.0F;
                                                                              float var183 = var16 + var250;
                                                                              float var311 = 38.0F;
                                                                              float var252 = var17 + var311;
                                                                              float var312 = 11.5F;
                                                                              int var351 = var18.textMuted();
                                                                              float var399 = 11.5F;
                                                                              String var413 = var13.artist();
                                                                              String var384 = var0.ellipsize(var399, var413, var85);
                                                                              float var89 = var0.text(var183, var252, var312, var351, var384);
                                                                              byte var91 = (byte)((var12.spotifyControls) ? 1 : 0);
                                                                              if (var91 != (1340153184 ^ var428)) {
                                                                                 var428 ^= 1859219341;
                                                                                 float var184 = 22.0F;
                                                                                 float var93 = var17 + var184;
                                                                                 int var95 = var18.textMuted();
                                                                                 float var186 = var16 + var14;
                                                                                 float var254 = 76.0F;
                                                                                 float var187 = var186 - var254;
                                                                                 drawPrev(var0, var187, var93, var95);
                                                                                 float var189 = var16 + var14;
                                                                                 float var257 = 52.0F;
                                                                                 float var190 = var189 - var257;
                                                                                 int var315 = var18.accentBright();
                                                                                 boolean var353 = var13.playing();
                                                                                 drawPlayPause(var0, var190, var93, var315, var353);
                                                                                 float var192 = var16 + var14;
                                                                                 float var260 = 28.0F;
                                                                                 float var193 = var192 - var260;
                                                                                 drawNext(var0, var193, var93, var95);
                                                                                 var428 ^= 985468816;
                                                                                 break label508;
                                                                              }
                                                                           } catch (Throwable var440) {
                                                                              var10000 = var440;
                                                                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                                 case -2094481222:
                                                                                    break label541;
                                                                                 case -1732585463:
                                                                                    break label741;
                                                                                 case -1713635933:
                                                                                    break label532;
                                                                                 case -1636080975:
                                                                                    break label742;
                                                                                 case -1297043893:
                                                                                    break label529;
                                                                                 case -882321175:
                                                                                    break label537;
                                                                                 case -854860614:
                                                                                    break label528;
                                                                                 case -596907032:
                                                                                    break label540;
                                                                                 case -227232319:
                                                                                    break label542;
                                                                                 case -211725008:
                                                                                    break label535;
                                                                                 case -183463525:
                                                                                    break label526;
                                                                                 case 159618921:
                                                                                    break label533;
                                                                                 case 168913937:
                                                                                    break label536;
                                                                                 case 478686434:
                                                                                    break label543;
                                                                                 case 698339035:
                                                                                    break label539;
                                                                                 case 958017585:
                                                                                    break label538;
                                                                                 case 1089940024:
                                                                                    break label679;
                                                                                 case 1948885089:
                                                                                    break label534;
                                                                                 case 2131290882:
                                                                                    break label527;
                                                                                 default:
                                                                                    throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                              }
                                                                           }

                                                                           var428 ^= 1416388637;
                                                                        }

                                                                        float var27;
                                                                        float var110;
                                                                        float var424;
                                                                        float var425;
                                                                        label681: {
                                                                           label500: {
                                                                              try {
                                                                                 float var194 = 76.0F;
                                                                                 float var100 = var16 + var194;
                                                                                 var424 = var100;
                                                                                 float var195 = 76.0F;
                                                                                 float var102 = var14 - var195;
                                                                                 float var196 = 12.0F;
                                                                                 float var103 = var102 - var196;
                                                                                 var425 = var103;
                                                                                 float var197 = 58.0F;
                                                                                 float var105 = var17 + var197;
                                                                                 var27 = var105;
                                                                                 long var107 = var13.durMs();
                                                                                 long var262 = 0L;
                                                                                 long var457;
                                                                                 int var109 = (var457 = var107 - var262) == 0L ? 0 : (var457 < 0L ? -1 : 1);
                                                                                 if (var109 <= (462257533 ^ var428)) {
                                                                                    break label500;
                                                                                 }

                                                                                 var428 ^= 98654171;
                                                                                 long var153 = var13.livePosMs();
                                                                                 float var155 = (float)var153;
                                                                                 long var226 = var13.durMs();
                                                                                 float var228 = (float)var226;
                                                                                 float var156 = var155 / var228;
                                                                                 float var229 = 0.0F;
                                                                                 float var295 = 1.0F;
                                                                                 var110 = Math.clamp(var156, var229, var295);
                                                                              } catch (Throwable var439) {
                                                                                 var10000 = var439;
                                                                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                                    case -2094481222:
                                                                                       break label541;
                                                                                    case -1732585463:
                                                                                       break label741;
                                                                                    case -1713635933:
                                                                                       break label532;
                                                                                    case -1636080975:
                                                                                       break label742;
                                                                                    case -1297043893:
                                                                                       break label529;
                                                                                    case -882321175:
                                                                                       break label537;
                                                                                    case -854860614:
                                                                                       break label528;
                                                                                    case -596907032:
                                                                                       break label540;
                                                                                    case -227232319:
                                                                                       break label542;
                                                                                    case -211725008:
                                                                                       break label535;
                                                                                    case -183463525:
                                                                                       break label526;
                                                                                    case 159618921:
                                                                                       break label533;
                                                                                    case 168913937:
                                                                                       break label536;
                                                                                    case 478686434:
                                                                                       break label543;
                                                                                    case 698339035:
                                                                                       break label539;
                                                                                    case 958017585:
                                                                                       break label538;
                                                                                    case 1089940024:
                                                                                       break label679;
                                                                                    case 1948885089:
                                                                                       break label534;
                                                                                    case 2131290882:
                                                                                       break label527;
                                                                                    default:
                                                                                       throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                                 }
                                                                              }

                                                                              while (true) {
                                                                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var428)) {
                                                                                    case 183602381:
                                                                                       var428 ^= 763064743;
                                                                                    case 541359902:
                                                                                       break label681;
                                                                                    case 1820947689:
                                                                                       break;
                                                                                    case 1988250524:
                                                                                    default:
                                                                                       throw new RuntimeException();
                                                                                 }
                                                                              }
                                                                           }

                                                                           label487:
                                                                           while (true) {
                                                                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var428)) {
                                                                                 case 40154034:
                                                                                 default:
                                                                                    throw new RuntimeException();
                                                                                 case 51544486:
                                                                                    break;
                                                                                 case 90323119:
                                                                                    var428 ^= 1843095732;
                                                                                 case 1241391194:
                                                                                    break label487;
                                                                              }
                                                                           }

                                                                           try {
                                                                              var110 = 0.0F;
                                                                              var428 ^= 1161907912;
                                                                           } catch (Throwable var434) {
                                                                              var10000 = var434;
                                                                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                                 case -2094481222:
                                                                                    break label541;
                                                                                 case -1732585463:
                                                                                    break label741;
                                                                                 case -1713635933:
                                                                                    break label532;
                                                                                 case -1636080975:
                                                                                    break label742;
                                                                                 case -1297043893:
                                                                                    break label529;
                                                                                 case -882321175:
                                                                                    break label537;
                                                                                 case -854860614:
                                                                                    break label528;
                                                                                 case -596907032:
                                                                                    break label540;
                                                                                 case -227232319:
                                                                                    break label542;
                                                                                 case -211725008:
                                                                                    break label535;
                                                                                 case -183463525:
                                                                                    break label526;
                                                                                 case 159618921:
                                                                                    break label533;
                                                                                 case 168913937:
                                                                                    break label536;
                                                                                 case 478686434:
                                                                                    break label543;
                                                                                 case 698339035:
                                                                                    break label539;
                                                                                 case 958017585:
                                                                                    break label538;
                                                                                 case 1089940024:
                                                                                    break label679;
                                                                                 case 1948885089:
                                                                                    break label534;
                                                                                 case 2131290882:
                                                                                    break label527;
                                                                                 default:
                                                                                    throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                              }
                                                                           }
                                                                        }

                                                                        label480: {
                                                                           label682: {
                                                                              int var30;
                                                                              int var127;
                                                                              label683: {
                                                                                 label477: {
                                                                                    try {
                                                                                       float var317 = 49.0F;
                                                                                       float var265 = var17 + var317;
                                                                                       float var318 = 9.5F;
                                                                                       int var355 = var18.textDisabled();
                                                                                       long var386 = var13.livePosMs();
                                                                                       String var388 = time(var386);
                                                                                       float var112 = var0.text(var424, var265, var318, var355, var388);
                                                                                       long var114 = var13.durMs();
                                                                                       String var116 = time(var114);
                                                                                       float var200 = var424 + var425;
                                                                                       float var319 = 9.5F;
                                                                                       float var268 = var0.textWidth(var319, var116);
                                                                                       float var201 = var200 - var268;
                                                                                       float var320 = 49.0F;
                                                                                       float var270 = var17 + var320;
                                                                                       float var321 = 9.5F;
                                                                                       int var358 = var18.textDisabled();
                                                                                       float var118 = var0.text(var201, var270, var321, var358, var116);
                                                                                       float var359 = 4.0F;
                                                                                       float var390 = 2.0F;
                                                                                       int var400 = -870884607 ^ var428;
                                                                                       float var414 = 0.5F;
                                                                                       int var401 = com.wimpyclient.p.g.withAlpha(var400, var414);
                                                                                       var0.rect(var424, var27, var425, var359, var390, var401);
                                                                                       float var323 = 4.0F;
                                                                                       float var361 = var425 * var110;
                                                                                       float var324 = Math.max(var323, var361);
                                                                                       float var362 = 4.0F;
                                                                                       float var392 = 2.0F;
                                                                                       int var403 = var18.accent();
                                                                                       int var416 = var18.accentBright();
                                                                                       byte var422 = (byte)(857168641 ^ var428);
                                                                                       var0.rectGradient(
                                                                                          var424,
                                                                                          var27,
                                                                                          var324,
                                                                                          var362,
                                                                                          var392,
                                                                                          var403,
                                                                                          var416,
                                                                                          (var422 != 0)
                                                                                       );
                                                                                       float var274 = var425 * var110;
                                                                                       float var205 = var424 + var274;
                                                                                       float var326 = 2.0F;
                                                                                       float var276 = var27 + var326;
                                                                                       float var327 = 4.0F;
                                                                                       byte var363 = (byte)(-857168642 ^ var428);
                                                                                       var0.circle(var205, var276, var327, var363);
                                                                                       byte var123 = (byte)((var12.spotifyVolume) ? 1 : 0);
                                                                                       if (var123 == (857168641 ^ var428)) {
                                                                                          break label682;
                                                                                       }

                                                                                       var428 ^= 990494278;
                                                                                       int var125 = var13.volume();
                                                                                       var30 = var125;
                                                                                       if (var125 >= (136242503 ^ var428)) {
                                                                                          break label477;
                                                                                       }

                                                                                       var428 ^= 829685338;
                                                                                       var127 = (byte)(963451677 ^ var428);
                                                                                    } catch (Throwable var438) {
                                                                                       var10000 = var438;
                                                                                       switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                                          case -2094481222:
                                                                                             break label541;
                                                                                          case -1732585463:
                                                                                             break label741;
                                                                                          case -1713635933:
                                                                                             break label532;
                                                                                          case -1636080975:
                                                                                             break label742;
                                                                                          case -1297043893:
                                                                                             break label529;
                                                                                          case -882321175:
                                                                                             break label537;
                                                                                          case -854860614:
                                                                                             break label528;
                                                                                          case -596907032:
                                                                                             break label540;
                                                                                          case -227232319:
                                                                                             break label542;
                                                                                          case -211725008:
                                                                                             break label535;
                                                                                          case -183463525:
                                                                                             break label526;
                                                                                          case 159618921:
                                                                                             break label533;
                                                                                          case 168913937:
                                                                                             break label536;
                                                                                          case 478686434:
                                                                                             break label543;
                                                                                          case 698339035:
                                                                                             break label539;
                                                                                          case 958017585:
                                                                                             break label538;
                                                                                          case 1089940024:
                                                                                             break label679;
                                                                                          case 1948885089:
                                                                                             break label534;
                                                                                          case 2131290882:
                                                                                             break label527;
                                                                                          default:
                                                                                             throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                                       }
                                                                                    }

                                                                                    while (true) {
                                                                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var428)) {
                                                                                          case 256073189:
                                                                                             var428 ^= 401092369;
                                                                                             break label683;
                                                                                          case 645158415:
                                                                                             break;
                                                                                          case 1914790972:
                                                                                          default:
                                                                                             throw new RuntimeException();
                                                                                          case 1916432684:
                                                                                             break label683;
                                                                                       }
                                                                                    }
                                                                                 }

                                                                                 label461:
                                                                                 while (true) {
                                                                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var428)) {
                                                                                       case 127729388:
                                                                                          var428 ^= 1371512528;
                                                                                       case 556222571:
                                                                                          break label461;
                                                                                       case 664518633:
                                                                                          break;
                                                                                       case 759452035:
                                                                                       default:
                                                                                          throw new RuntimeException();
                                                                                    }
                                                                                 }

                                                                                 try {
                                                                                    var127 = var30;
                                                                                    var428 ^= 1998868379;
                                                                                 } catch (Throwable var433) {
                                                                                    var10000 = var433;
                                                                                    switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                                       case -2094481222:
                                                                                          break label541;
                                                                                       case -1732585463:
                                                                                          break label741;
                                                                                       case -1713635933:
                                                                                          break label532;
                                                                                       case -1636080975:
                                                                                          break label742;
                                                                                       case -1297043893:
                                                                                          break label529;
                                                                                       case -882321175:
                                                                                          break label537;
                                                                                       case -854860614:
                                                                                          break label528;
                                                                                       case -596907032:
                                                                                          break label540;
                                                                                       case -227232319:
                                                                                          break label542;
                                                                                       case -211725008:
                                                                                          break label535;
                                                                                       case -183463525:
                                                                                          break label526;
                                                                                       case 159618921:
                                                                                          break label533;
                                                                                       case 168913937:
                                                                                          break label536;
                                                                                       case 478686434:
                                                                                          break label543;
                                                                                       case 698339035:
                                                                                          break label539;
                                                                                       case 958017585:
                                                                                          break label538;
                                                                                       case 1089940024:
                                                                                          break label679;
                                                                                       case 1948885089:
                                                                                          break label534;
                                                                                       case 2131290882:
                                                                                          break label527;
                                                                                       default:
                                                                                          throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                                    }
                                                                                 }
                                                                              }

                                                                              float var31;
                                                                              float var32;
                                                                              float var33;
                                                                              float var34;
                                                                              com.wimpyclient.m.b var139;
                                                                              float var214;
                                                                              float var280;
                                                                              int var330;
                                                                              byte var377;
                                                                              label453: {
                                                                                 label685: {
                                                                                    try {
                                                                                       float var128 = var127;
                                                                                       float var206 = 100.0F;
                                                                                       float var129 = var128 / var206;
                                                                                       float var207 = 0.0F;
                                                                                       float var277 = 1.0F;
                                                                                       float var130 = Math.clamp(var129, var207, var277);
                                                                                       var31 = var130;
                                                                                       float var208 = 36.0F;
                                                                                       float var132 = var16 + var208;
                                                                                       var32 = var132;
                                                                                       float var209 = 36.0F;
                                                                                       float var134 = var14 - var209;
                                                                                       float var210 = 46.0F;
                                                                                       float var135 = var134 - var210;
                                                                                       var33 = var135;
                                                                                       float var211 = 80.0F;
                                                                                       float var137 = var17 + var211;
                                                                                       float var212 = 2.0F;
                                                                                       float var138 = var137 - var212;
                                                                                       var34 = var138;
                                                                                       var139 = var0;
                                                                                       float var278 = 18.0F;
                                                                                       var214 = var16 + var278;
                                                                                       float var328 = 80.0F;
                                                                                       var280 = var17 + var328;
                                                                                       var330 = var18.textMuted();
                                                                                       if (var30 == (780481548 ^ var428)) {
                                                                                          var428 ^= 281780916;
                                                                                          var377 = (byte)(1045337785 ^ var428);
                                                                                          break label685;
                                                                                       }
                                                                                    } catch (Throwable var437) {
                                                                                       var10000 = var437;
                                                                                       switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                                          case -2094481222:
                                                                                             break label541;
                                                                                          case -1732585463:
                                                                                             break label741;
                                                                                          case -1713635933:
                                                                                             break label532;
                                                                                          case -1636080975:
                                                                                             break label742;
                                                                                          case -1297043893:
                                                                                             break label529;
                                                                                          case -882321175:
                                                                                             break label537;
                                                                                          case -854860614:
                                                                                             break label528;
                                                                                          case -596907032:
                                                                                             break label540;
                                                                                          case -227232319:
                                                                                             break label542;
                                                                                          case -211725008:
                                                                                             break label535;
                                                                                          case -183463525:
                                                                                             break label526;
                                                                                          case 159618921:
                                                                                             break label533;
                                                                                          case 168913937:
                                                                                             break label536;
                                                                                          case 478686434:
                                                                                             break label543;
                                                                                          case 698339035:
                                                                                             break label539;
                                                                                          case 958017585:
                                                                                             break label538;
                                                                                          case 1089940024:
                                                                                             break label679;
                                                                                          case 1948885089:
                                                                                             break label534;
                                                                                          case 2131290882:
                                                                                             break label527;
                                                                                          default:
                                                                                             throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                                       }
                                                                                    }

                                                                                    var428 ^= 1270271447;

                                                                                    try {
                                                                                       var377 = (byte)(1697905115 ^ var428);
                                                                                       var428 ^= 1148310617;
                                                                                       break label453;
                                                                                    } catch (Throwable var432) {
                                                                                       var10000 = var432;
                                                                                       switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                                          case -2094481222:
                                                                                             break label541;
                                                                                          case -1732585463:
                                                                                             break label741;
                                                                                          case -1713635933:
                                                                                             break label532;
                                                                                          case -1636080975:
                                                                                             break label742;
                                                                                          case -1297043893:
                                                                                             break label529;
                                                                                          case -882321175:
                                                                                             break label537;
                                                                                          case -854860614:
                                                                                             break label528;
                                                                                          case -596907032:
                                                                                             break label540;
                                                                                          case -227232319:
                                                                                             break label542;
                                                                                          case -211725008:
                                                                                             break label535;
                                                                                          case -183463525:
                                                                                             break label526;
                                                                                          case 159618921:
                                                                                             break label533;
                                                                                          case 168913937:
                                                                                             break label536;
                                                                                          case 478686434:
                                                                                             break label543;
                                                                                          case 698339035:
                                                                                             break label539;
                                                                                          case 958017585:
                                                                                             break label538;
                                                                                          case 1089940024:
                                                                                             break label679;
                                                                                          case 1948885089:
                                                                                             break label534;
                                                                                          case 2131290882:
                                                                                             break label527;
                                                                                          default:
                                                                                             throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                                       }
                                                                                    }
                                                                                 }

                                                                                 var428 ^= 520928058;
                                                                              }

                                                                              String var145;
                                                                              label686: {
                                                                                 label687: {
                                                                                    try {
                                                                                       drawSpeaker(var139, var214, var280, var330, (var377 != 0));
                                                                                       float var365 = 4.0F;
                                                                                       float var393 = 2.0F;
                                                                                       int var404 = -566088318 ^ var428;
                                                                                       float var417 = 0.5F;
                                                                                       int var405 = com.wimpyclient.p.g.withAlpha(var404, var417);
                                                                                       var0.rect(var32, var34, var33, var365, var393, var405);
                                                                                       float var332 = 4.0F;
                                                                                       float var367 = var33 * var31;
                                                                                       float var333 = Math.max(var332, var367);
                                                                                       float var368 = 4.0F;
                                                                                       float var395 = 2.0F;
                                                                                       int var407 = var18.accent();
                                                                                       int var419 = var18.accentBright();
                                                                                       byte var423 = (byte)(557985154 ^ var428);
                                                                                       var0.rectGradient(
                                                                                          var32, var34, var333, var368, var395, var407, var419, (var423 != 0)
                                                                                       );
                                                                                       float var284 = var33 * var31;
                                                                                       float var218 = var32 + var284;
                                                                                       float var335 = 80.0F;
                                                                                       float var286 = var17 + var335;
                                                                                       float var336 = 4.0F;
                                                                                       byte var369 = (byte)(-557985155 ^ var428);
                                                                                       var0.circle(var218, var286, var336, var369);
                                                                                       if (var30 >= (557985154 ^ var428)) {
                                                                                          break label687;
                                                                                       }

                                                                                       var428 ^= 1658005534;
                                                                                       var145 = jhbkqgfnzb(osvpoxpwtklmbkb(), var428);
                                                                                    } catch (Throwable var436) {
                                                                                       var10000 = var436;
                                                                                       switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                                          case -2094481222:
                                                                                             break label541;
                                                                                          case -1732585463:
                                                                                             break label741;
                                                                                          case -1713635933:
                                                                                             break label532;
                                                                                          case -1636080975:
                                                                                             break label742;
                                                                                          case -1297043893:
                                                                                             break label529;
                                                                                          case -882321175:
                                                                                             break label537;
                                                                                          case -854860614:
                                                                                             break label528;
                                                                                          case -596907032:
                                                                                             break label540;
                                                                                          case -227232319:
                                                                                             break label542;
                                                                                          case -211725008:
                                                                                             break label535;
                                                                                          case -183463525:
                                                                                             break label526;
                                                                                          case 159618921:
                                                                                             break label533;
                                                                                          case 168913937:
                                                                                             break label536;
                                                                                          case 478686434:
                                                                                             break label543;
                                                                                          case 698339035:
                                                                                             break label539;
                                                                                          case 958017585:
                                                                                             break label538;
                                                                                          case 1089940024:
                                                                                             break label679;
                                                                                          case 1948885089:
                                                                                             break label534;
                                                                                          case 2131290882:
                                                                                             break label527;
                                                                                          default:
                                                                                             throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                                       }
                                                                                    }

                                                                                    while (true) {
                                                                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var428)) {
                                                                                          case 48806223:
                                                                                             var428 ^= 816478760;
                                                                                             break label686;
                                                                                          case 732216839:
                                                                                             break;
                                                                                          case 811110510:
                                                                                          default:
                                                                                             throw new RuntimeException();
                                                                                          case 2053746138:
                                                                                             break label686;
                                                                                       }
                                                                                    }
                                                                                 }

                                                                                 var428 = rbicwxystpzbtgca(var428, 1898395029);

                                                                                 try {
                                                                                    var145 = var30 + "%";
                                                                                    var428 ^= 593389475;
                                                                                 } catch (Throwable var431) {
                                                                                    var10000 = var431;
                                                                                    switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                                       case -2094481222:
                                                                                          break label541;
                                                                                       case -1732585463:
                                                                                          break label741;
                                                                                       case -1713635933:
                                                                                          break label532;
                                                                                       case -1636080975:
                                                                                          break label742;
                                                                                       case -1297043893:
                                                                                          break label529;
                                                                                       case -882321175:
                                                                                          break label537;
                                                                                       case -854860614:
                                                                                          break label528;
                                                                                       case -596907032:
                                                                                          break label540;
                                                                                       case -227232319:
                                                                                          break label542;
                                                                                       case -211725008:
                                                                                          break label535;
                                                                                       case -183463525:
                                                                                          break label526;
                                                                                       case 159618921:
                                                                                          break label533;
                                                                                       case 168913937:
                                                                                          break label536;
                                                                                       case 478686434:
                                                                                          break label543;
                                                                                       case 698339035:
                                                                                          break label539;
                                                                                       case 958017585:
                                                                                          break label538;
                                                                                       case 1089940024:
                                                                                          break label679;
                                                                                       case 1948885089:
                                                                                          break label534;
                                                                                       case 2131290882:
                                                                                          break label527;
                                                                                       default:
                                                                                          throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                                    }
                                                                                 }
                                                                              }

                                                                              try {
                                                                                 float var220 = var16 + var14;
                                                                                 float var337 = 9.5F;
                                                                                 float var289 = var0.textWidth(var337, var145);
                                                                                 float var221 = var220 - var289;
                                                                                 float var290 = 12.0F;
                                                                                 float var222 = var221 - var290;
                                                                                 float var338 = 80.0F;
                                                                                 float var292 = var17 + var338;
                                                                                 float var339 = 9.5F;
                                                                                 int var372 = var18.textDisabled();
                                                                                 float var147 = var0.text(var222, var292, var339, var372, var145);
                                                                                 var428 ^= 1087362566;
                                                                                 break label480;
                                                                              } catch (Throwable var430) {
                                                                                 var10000 = var430;
                                                                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                                                                                    case -2094481222:
                                                                                       break label541;
                                                                                    case -1732585463:
                                                                                       break label741;
                                                                                    case -1713635933:
                                                                                       break label532;
                                                                                    case -1636080975:
                                                                                       break label742;
                                                                                    case -1297043893:
                                                                                       break label529;
                                                                                    case -882321175:
                                                                                       break label537;
                                                                                    case -854860614:
                                                                                       break label528;
                                                                                    case -596907032:
                                                                                       break label540;
                                                                                    case -227232319:
                                                                                       break label542;
                                                                                    case -211725008:
                                                                                       break label535;
                                                                                    case -183463525:
                                                                                       break label526;
                                                                                    case 159618921:
                                                                                       break label533;
                                                                                    case 168913937:
                                                                                       break label536;
                                                                                    case 478686434:
                                                                                       break label543;
                                                                                    case 698339035:
                                                                                       break label539;
                                                                                    case 958017585:
                                                                                       break label538;
                                                                                    case 1089940024:
                                                                                       break label679;
                                                                                    case 1948885089:
                                                                                       break label534;
                                                                                    case 2131290882:
                                                                                       break label527;
                                                                                    default:
                                                                                       throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                                                                 }
                                                                              }
                                                                           }

                                                                           var428 ^= 14938803;
                                                                        }

                                                                        k var148 = k.INSTANCE;
                                                                        var148.endElement(var0, var60);

                                                                        while (true) {
                                                                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var428)) {
                                                                              case 42505323:
                                                                              default:
                                                                                 throw new RuntimeException();
                                                                              case 78265148:
                                                                                 var428 = 288011051 ^ var428;
                                                                                 return;
                                                                              case 1413636645:
                                                                                 return;
                                                                              case 1486854138:
                                                                           }
                                                                        }
                                                                     }

                                                                     var428 = rbicwxystpzbtgca(var428, 1216958550);
                                                                     break label744;
                                                                  }

                                                                  var428 = rbicwxystpzbtgca(var428, 1935202631);
                                                                  break label744;
                                                               }

                                                               var428 = 1043703586 ^ var428;
                                                               break label744;
                                                            }

                                                            var428 = 259434609 ^ var428;
                                                            break label744;
                                                         }

                                                         var428 = 423022214 ^ var428;
                                                         break label744;
                                                      }

                                                      var428 = rbicwxystpzbtgca(var428, 918659288);
                                                      break label744;
                                                   }

                                                   var428 = 1937829392 ^ var428;
                                                   break label744;
                                                }

                                                var428 = 866962085 ^ var428;
                                                break label744;
                                             }

                                             var428 = rbicwxystpzbtgca(var428, 1638385660);
                                             break label744;
                                          }

                                          var428 = rbicwxystpzbtgca(var428, 1846706461);
                                          break label744;
                                       }

                                       var428 = rbicwxystpzbtgca(var428, 1593548727);
                                       break label744;
                                    }

                                    var428 = 1641388179 ^ var428;
                                    break label744;
                                 }

                                 var428 = 2046471692 ^ var428;
                                 break label744;
                              }

                              var428 = 1739911959 ^ var428;
                              break label744;
                           }

                           var428 = 631524554 ^ var428;
                           break label744;
                        }

                        var428 = rbicwxystpzbtgca(var428, 1528481900);
                        break label744;
                     }

                     var428 = rbicwxystpzbtgca(var428, 284339462);
                     break label744;
                  }

                  var428 = rbicwxystpzbtgca(var428, 2128159657);
                  break label744;
               }

               var428 = 50770061 ^ var428;
            }

            Throwable var36;
            while (true) {
               try {
                  Throwable var149 = var10000;
                  var36 = var149;
                  var428 ^= 1094599370;
                  break;
               } catch (Throwable var429) {
                  var10000 = var429;
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var428)) {
                     case 79538314:
                        var428 ^= 0;
                        break;
                     default:
                        throw new RuntimeException("Error in hash");
                  }
               }
            }

            k var150 = k.INSTANCE;
            var150.endElement(var0, var60);
            throw new RuntimeException(var36);
         }

         k var161 = k.INSTANCE;
         var161.endElement(var0, var60);
      }
   }

   public static boolean onClick(float var0, float var1, float var2) {
      int var148 = 826464179 ^ 475158725 ^ 251688915;
      var148 = 261004238 ^ var148;
      com.wimpyclient.i.x var3 = com.wimpyclient.i.x.INSTANCE;
      com.wimpyclient.i.v var15 = var3.spotify;
      byte var16 = (byte)((var15.qo()) ? 1 : 0);
      if (var16 == (765354859 ^ var148)) {
         var148 = 658476909 ^ var148;
         return (((byte)(178383878 ^ var148)) != 0);
      } else {
         var148 = 1035514754 ^ var148;
         com.wimpyclient.q.b var17 = state();
         byte var19 = (byte)((var17.active()) ? 1 : 0);
         if (var19 == (270979305 ^ var148)) {
            var148 = 157772722 ^ var148;
            return (((byte)(423738203 ^ var148)) != 0);
         } else {
            label227: {
               label314: {
                  var148 = 1072293187 ^ var148;
                  float var21 = 0.01F;
                  k var4 = k.INSTANCE;
                  k$d var5 = k$d.SPOTIFY;
                  float var101 = var4.scale(var5);
                  float var22 = Math.max(var21, var101);
                  float var24 = var0 / var2;
                  float var103 = lastX;
                  float var25 = var24 - var103;
                  float var26 = var25 / var22;
                  float var28 = var1 / var2;
                  float var106 = lastY;
                  float var29 = var28 - var106;
                  float var30 = var29 / var22;
                  float var108 = 0.0F;
                  float var178;
                  int var32 = (var178 = var26 - var108) == 0.0F ? 0 : (var178 < 0.0F ? -1 : 1);
                  if (var32 >= (802108842 ^ var148)) {
                     var148 ^= 197385962;
                     float var109 = 0.0F;
                     float var179;
                     int var34 = (var179 = var30 - var109) == 0.0F ? 0 : (var179 < 0.0F ? -1 : 1);
                     if (var34 >= (604826432 ^ var148)) {
                        var148 ^= 507186101;
                        float var110 = lastW;
                        float var180;
                        int var36 = (var180 = var26 - var110) == 0.0F ? 0 : (var180 < 0.0F ? -1 : 1);
                        label194:
                        if (var36 <= (976740597 ^ var148)) {
                           var148 = 1715779057 ^ var148;
                           float var111 = lastH;
                           float var181;
                           int var38 = (var181 = var30 - var111) == 0.0F ? 0 : (var181 < 0.0F ? -1 : 1);
                           if (var38 > (1551062276 ^ var148)) {
                              var148 = 1940781490 ^ var148;
                              return (((byte)(803122358 ^ var148)) != 0);
                           }

                           var148 = rbicwxystpzbtgca(var148, 2109783789);
                           byte var40 = (byte)((var3.spotifyControls) ? 1 : 0);
                           if (var40 != (565439465 ^ var148)) {
                              var148 = 11279859 ^ var148;
                              float var112 = 10.0F;
                              float var182;
                              int var42 = (var182 = var30 - var112) == 0.0F ? 0 : (var182 < 0.0F ? -1 : 1);
                              if (var42 >= (555742746 ^ var148)) {
                                 var148 = 38757303 ^ var148;
                                 float var113 = 34.0F;
                                 float var183;
                                 int var44 = (var183 = var30 - var113) == 0.0F ? 0 : (var183 < 0.0F ? -1 : 1);
                                 if (var44 <= (592483757 ^ var148)) {
                                    var148 = 1426653505 ^ var148;
                                    float var114 = lastW;
                                    float var141 = 76.0F;
                                    float var115 = var114 - var141;
                                    byte var46 = (byte)((hit(var26, var115)) ? 1 : 0);
                                    if (var46 != (1985582316 ^ var148)) {
                                       var148 = 1607312198 ^ var148;
                                       byte var96 = (byte)((demo()) ? 1 : 0);
                                       if (var96 == (697579434 ^ var148)) {
                                          var148 = 2035692126 ^ var148;
                                          com.wimpyclient.q.a var97 = com.wimpyclient.q.a.INSTANCE;
                                          var97.previous();
                                          var148 = 1111231344 ^ var148;
                                          break label227;
                                       }

                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var148)) {
                                             case 9372237:
                                                var148 ^= 996817198;
                                                break label227;
                                             case 20334671:
                                                break;
                                             case 305638853:
                                                break label227;
                                             case 2076566500:
                                             default:
                                                throw new RuntimeException(new IOException());
                                          }
                                       }
                                    }

                                    var148 = 1107045625 ^ var148;
                                    float var116 = lastW;
                                    float var142 = 52.0F;
                                    float var117 = var116 - var142;
                                    byte var48 = (byte)((hit(var26, var117)) ? 1 : 0);
                                    if (var48 != (933607445 ^ var148)) {
                                       var148 = 1492371017 ^ var148;
                                       byte var49 = (byte)((demo()) ? 1 : 0);
                                       if (var49 == (1867939420 ^ var148)) {
                                          var148 = 407644622 ^ var148;
                                          com.wimpyclient.q.a var50 = com.wimpyclient.q.a.INSTANCE;
                                          var50.togglePlay();
                                          var148 = 551921673 ^ var148;
                                       } else {
                                          var148 = 950632903 ^ var148;
                                       }

                                       com.wimpyclient.p.q.toggle();
                                       return (((byte)(1476394906 ^ var148)) != 0);
                                    }

                                    var148 = rbicwxystpzbtgca(var148, 640359552);
                                    float var118 = lastW;
                                    float var143 = 28.0F;
                                    float var119 = var118 - var143;
                                    byte var53 = (byte)((hit(var26, var119)) ? 1 : 0);
                                    if (var53 != (294560917 ^ var148)) {
                                       var148 = 469948165 ^ var148;
                                       byte var54 = (byte)((demo()) ? 1 : 0);
                                       if (var54 == (227308432 ^ var148)) {
                                          var148 = 765766651 ^ var148;
                                          com.wimpyclient.q.a var55 = com.wimpyclient.q.a.INSTANCE;
                                          var55.next();
                                          var148 = 1374332138 ^ var148;
                                          break label314;
                                       }

                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var148)) {
                                             case 118543414:
                                                break;
                                             case 171971179:
                                                var148 ^= 2085490449;
                                             case 913426257:
                                                break label314;
                                             case 1858063063:
                                             default:
                                                throw new RuntimeException(new IOException());
                                          }
                                       }
                                    }

                                    label187:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var148)) {
                                          case 33836910:
                                             var148 ^= 1011690773;
                                          case 1214964257:
                                             break label187;
                                          case 1954128815:
                                          default:
                                             throw new RuntimeException(new IOException());
                                          case 1993622752:
                                       }
                                    }
                                 } else {
                                    var148 = 244522029 ^ var148;
                                 }
                              } else {
                                 var148 = rbicwxystpzbtgca(var148, 215777178);
                              }
                           } else {
                              var148 = 208691817 ^ var148;
                           }

                           float var120 = 52.0F;
                           float var184;
                           int var58 = (var184 = var30 - var120) == 0.0F ? 0 : (var184 < 0.0F ? -1 : 1);
                           if (var58 >= (767789440 ^ var148)) {
                              var148 = 1340539134 ^ var148;
                              float var121 = 66.0F;
                              float var185;
                              int var60 = (var185 = var30 - var121) == 0.0F ? 0 : (var185 < 0.0F ? -1 : 1);
                              if (var60 <= (1646561662 ^ var148)) {
                                 var148 = 1242452315 ^ var148;
                                 float var122 = 76.0F;
                                 float var186;
                                 int var62 = (var186 = var26 - var122) == 0.0F ? 0 : (var186 < 0.0F ? -1 : 1);
                                 if (var62 >= (673896485 ^ var148)) {
                                    var148 = 51580416 ^ var148;
                                    float var123 = 240.0F;
                                    float var187;
                                    int var64 = (var187 = var26 - var123) == 0.0F ? 0 : (var187 < 0.0F ? -1 : 1);
                                    if (var64 <= (725210661 ^ var148)) {
                                       var148 = 1999828220 ^ var148;
                                       byte var66 = (byte)((var17.canSeek()) ? 1 : 0);
                                       if (var66 != (1544233689 ^ var148)) {
                                          var148 = 1174197558 ^ var148;
                                          float var124 = 76.0F;
                                          float var68 = var26 - var124;
                                          float var125 = 164.0F;
                                          float var69 = var68 / var125;
                                          long var127 = var17.durMs();
                                          float var129 = (float)var127;
                                          float var70 = var69 * var129;
                                          long var71 = (long)var70;
                                          byte var73 = (byte)((demo()) ? 1 : 0);
                                          if (var73 == (435681263 ^ var148)) {
                                             var148 = 1280173817 ^ var148;
                                             com.wimpyclient.q.a var74 = com.wimpyclient.q.a.INSTANCE;
                                             var74.seekTo(var71);
                                             var148 = 1475611859 ^ var148;
                                             break label194;
                                          }

                                          while (true) {
                                             switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var148)) {
                                                case 38824360:
                                                   var148 ^= 465168938;
                                                   break label194;
                                                case 1753516165:
                                                default:
                                                   throw new RuntimeException(new IOException());
                                                case 1792181494:
                                                   break label194;
                                                case 1835476797:
                                             }
                                          }
                                       }

                                       var148 = rbicwxystpzbtgca(var148, 1316921912);
                                    } else {
                                       var148 = 961304260 ^ var148;
                                    }
                                 } else {
                                    var148 = 979327172 ^ var148;
                                 }
                              } else {
                                 label178:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var148)) {
                                       case 16633428:
                                          break;
                                       case 237414464:
                                          var148 ^= 1884359071;
                                       case 527910056:
                                          break label178;
                                       case 1065428659:
                                       default:
                                          throw new RuntimeException(new IOException());
                                    }
                                 }
                              }
                           } else {
                              var148 = 1068894561 ^ var148;
                           }

                           float var76 = 36.0F;
                           byte var78 = (byte)((var3.spotifyVolume) ? 1 : 0);
                           if (var78 == (309690593 ^ var148)) {
                              var148 = 268073220 ^ var148;
                              return (((byte)(495974885 ^ var148)) != 0);
                           }

                           var148 = 652716313 ^ var148;
                           float var132 = 73.0F;
                           float var188;
                           int var80 = (var188 = var30 - var132) == 0.0F ? 0 : (var188 < 0.0F ? -1 : 1);
                           if (var80 >= (881994232 ^ var148)) {
                              var148 ^= 649819106;
                              float var133 = 87.0F;
                              float var189;
                              int var82 = (var189 = var30 - var133) == 0.0F ? 0 : (var189 < 0.0F ? -1 : 1);
                              if (var82 <= (304699930 ^ var148)) {
                                 var148 ^= 1490761252;
                                 float var190;
                                 int var84 = (var190 = var26 - var76) == 0.0F ? 0 : (var190 < 0.0F ? -1 : 1);
                                 if (var84 >= (1257401406 ^ var148)) {
                                    var148 ^= 818948578;
                                    float var144 = 170.0F;
                                    float var136 = var76 + var144;
                                    float var191;
                                    int var86 = (var191 = var26 - var136) == 0.0F ? 0 : (var191 < 0.0F ? -1 : 1);
                                    if (var86 <= (2049066460 ^ var148)) {
                                       var148 = 143837465 ^ var148;
                                       float var88 = var26 - var76;
                                       float var138 = 170.0F;
                                       float var89 = var88 / var138;
                                       float var139 = 100.0F;
                                       float var90 = var89 * var139;
                                       int var91 = Math.round(var90);
                                       byte var92 = (byte)((demo()) ? 1 : 0);
                                       if (var92 == (1924172997 ^ var148)) {
                                          var148 = 392746457 ^ var148;
                                          com.wimpyclient.q.a var93 = com.wimpyclient.q.a.INSTANCE;
                                          var93.setVolume(var91);
                                          var148 = 172127152 ^ var148;
                                       } else {
                                          var148 = rbicwxystpzbtgca(var148, 489334377);
                                       }

                                       com.wimpyclient.p.q.click();
                                       return (((byte)(1872374445 ^ var148)) != 0);
                                    }

                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var148)) {
                                          case 211950968:
                                             var148 ^= 1739439161;
                                             return (((byte)(495974885 ^ var148)) != 0);
                                          case 674719208:
                                             return (((byte)(495974885 ^ var148)) != 0);
                                          case 1868374576:
                                             break;
                                          case 2018801187:
                                          default:
                                             throw new RuntimeException(new IOException());
                                       }
                                    }
                                 } else {
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var148)) {
                                          case 20314954:
                                             var148 ^= 1467848155;
                                             return (((byte)(495974885 ^ var148)) != 0);
                                          case 198695370:
                                             break;
                                          case 809032488:
                                          default:
                                             throw new RuntimeException(new IOException());
                                          case 1696816209:
                                             return (((byte)(495974885 ^ var148)) != 0);
                                       }
                                    }
                                 }
                              } else {
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var148)) {
                                       case 53480635:
                                          var148 ^= 262579199;
                                          return (((byte)(495974885 ^ var148)) != 0);
                                       case 421978507:
                                       default:
                                          throw new RuntimeException(new IOException());
                                       case 514684778:
                                          break;
                                       case 1256525877:
                                          return (((byte)(495974885 ^ var148)) != 0);
                                    }
                                 }
                              }
                           } else {
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var148)) {
                                    case 98239938:
                                       var148 ^= 689819677;
                                       return (((byte)(495974885 ^ var148)) != 0);
                                    case 474684578:
                                    default:
                                       throw new RuntimeException(new IOException());
                                    case 1495038868:
                                       break;
                                    case 1913821198:
                                       return (((byte)(495974885 ^ var148)) != 0);
                                 }
                              }
                           }
                        } else {
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var148)) {
                                 case 13400557:
                                    var148 ^= 367610947;
                                    return (((byte)(803122358 ^ var148)) != 0);
                                 case 892851962:
                                    break;
                                 case 1197764165:
                                    return (((byte)(803122358 ^ var148)) != 0);
                                 case 1539506215:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        }
                     } else {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var148)) {
                              case 7620231:
                                 break;
                              case 98116544:
                                 var148 ^= 198330358;
                                 return (((byte)(803122358 ^ var148)) != 0);
                              case 960397537:
                                 return (((byte)(803122358 ^ var148)) != 0);
                              case 1984549269:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }
                     }
                  } else {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var148)) {
                           case 211900470:
                              var148 ^= 1153308;
                              return (((byte)(803122358 ^ var148)) != 0);
                           case 1239891378:
                              return (((byte)(803122358 ^ var148)) != 0);
                           case 1371665287:
                              break;
                           case 1749052794:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }

                  com.wimpyclient.p.q.click();
                  return (((byte)(38673860 ^ var148)) != 0);
               }

               com.wimpyclient.p.q.click();
               return (((byte)(1908571264 ^ var148)) != 0);
            }

            com.wimpyclient.p.q.click();
            return (((byte)(318639749 ^ var148)) != 0);
         }
      }
   }

   private static boolean hit(float var0, float var1) {
      int var11 = 496280250 ^ 1680028554 ^ 251688915;
      var11 = 1784979246 ^ var11;
      float var4 = var0 - var1;
      float var5 = Math.abs(var4);
      float var8 = 11.0F;
      float var16;
      int var6 = (var16 = var5 - var8) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
      if (var6 <= (483621325 ^ var11)) {
         var11 = 1415456956 ^ var11;
         byte var17 = (byte)(1217220976 ^ var11);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var11)) {
               case 210863431:
                  var11 = 342213866 ^ var11;
                  return (var17 != 0);
               case 299854500:
               default:
                  throw new RuntimeException();
               case 1049955729:
                  return (var17 != 0);
               case 1284621578:
            }
         }
      } else {
         label28:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var11)) {
               case 131704622:
                  var11 ^= 1090268815;
               case 517887889:
                  break label28;
               case 678474753:
                  break;
               case 810666273:
               default:
                  throw new RuntimeException();
            }
         }

         byte var7 = (byte)(1546606402 ^ var11);
         var11 = 13091545 ^ var11;
         return (var7 != 0);
      }
   }

   private static int artHandle(com.wimpyclient.m.b var0, int var1) {
      int var15 = 989615692 ^ 1130008469 ^ 251688915;
      var15 = 1390471604 ^ var15;
      int var3 = artVersion;
      if (var1 == var3) {
         var15 = rbicwxystpzbtgca(var15, 140984775);
      } else {
         var15 = 705382979 ^ var15;
         int var4 = artHandle;
         if (var4 > (239930877 ^ var15)) {
            var15 = 186503841 ^ var15;
            int var10 = artHandle;
            var0.deleteImage(var10);
            var15 = 1242358683 ^ var15;
         } else {
            label22:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
                  case 196429143:
                     var15 ^= 1091645754;
                     break label22;
                  case 395281753:
                     break;
                  case 1096885753:
                  default:
                     throw new RuntimeException();
                  case 1220391355:
                     break label22;
               }
            }
         }

         com.wimpyclient.q.a var11 = com.wimpyclient.q.a.INSTANCE;
         Path var12 = var11.artPath();
         int var7 = var0.loadImageFile(var12);
         artHandle = var7;
         artVersion = var1;
         var15 = 1669151422 ^ var15;
      }

      return artHandle;
   }

   private static String time(long var0) {
      int var31 = 1692048754 ^ 209734306 ^ 251688915;
      var31 = 2046457383 ^ var31;
      long var5 = 1000L;
      long var14 = var0 / var5;
      String var16 = jhbkqgfnzb(wzpcyrveoavczgb(), var31);
      byte var4 = (byte)(513857062 ^ var31);
      Object[] var18 = new Object[var4];
      byte var7 = (byte)(513857060 ^ var31);
      long var10 = 60L;
      long var20 = var14 / var10;
      Long var22 = var20;
      var18[var7] = var22;
      byte var19 = (byte)(513857061 ^ var31);
      long var28 = 60L;
      long var25 = var14 % var28;
      Long var27 = var25;
      var18[var19] = var27;
      return String.format(var16, var18);
   }

   private static void drawVinyl(com.wimpyclient.m.b var0, com.wimpyclient.o.b var1, float var2, float var3, float var4) {
      int var81 = 1907104381 ^ 1921946950 ^ 251688915;
      var81 = 28786072 ^ var81;
      float var7 = 2.0F;
      float var27 = var4 / var7;
      float var16 = var2 + var27;
      float var37 = 2.0F;
      float var29 = var4 / var37;
      float var18 = var3 + var29;
      float var10 = 8.0F;
      int var11 = -224406170 ^ var81;
      float var12 = 0.9F;
      int var76 = com.wimpyclient.p.g.withAlpha(var11, var12);
      var0.rect(var2, var3, var4, var4, var10, var76);
      float var58 = 0.4F;
      float var48 = var4 * var58;
      int var59 = -226240172 ^ var81;
      var0.circle(var16, var18, var48, var59);
      float var60 = 0.3F;
      float var50 = var4 * var60;
      float var61 = 1.0F;
      int var70 = var1.accent();
      float var77 = 0.35F;
      int var71 = com.wimpyclient.p.g.withAlpha(var70, var77);
      var0.circleOutline(var16, var18, var50, var61, var71);
      float var62 = 0.22F;
      float var52 = var4 * var62;
      float var63 = 1.0F;
      int var73 = var1.accent();
      float var78 = 0.25F;
      int var74 = com.wimpyclient.p.g.withAlpha(var73, var78);
      var0.circleOutline(var16, var18, var52, var63, var74);
      float var64 = 0.12F;
      float var54 = var4 * var64;
      int var66 = var1.accent();
      var0.circle(var16, var18, var54, var66);
      String var24 = jhbkqgfnzb(roknzluzburpwxn(), var81);
      float var55 = 9.0F;
      float var44 = var0.textWidth(var55, var24);
      float var56 = 2.0F;
      float var45 = var44 / var56;
      float var36 = var16 - var45;
      float var57 = 9.0F;
      byte var68 = (byte)(-227919217 ^ var81);
      float var26 = var0.text(var36, var18, var57, var68, var24);
   }

   private static void drawPrev(com.wimpyclient.m.b var0, float var1, float var2, int var3) {
      int var24 = 390784133 ^ 1591011329 ^ 251688915;
      var24 = 2067655185 ^ var24;
      float var6 = 4.0F;
      float var12 = var1 + var6;
      float var7 = -7.0F;
      triangle(var0, var12, var2, var7, var3);
      float var16 = 7.0F;
      float var14 = var1 - var16;
      float var19 = 5.5F;
      float var18 = var2 - var19;
      float var20 = 2.0F;
      float var21 = 11.0F;
      float var9 = 1.0F;
      var0.rect(var14, var18, var20, var21, var9, var3);
   }

   private static void drawNext(com.wimpyclient.m.b var0, float var1, float var2, int var3) {
      int var24 = 1063272209 ^ 46862122 ^ 251688915;
      var24 = 210906459 ^ var24;
      float var6 = 4.0F;
      float var12 = var1 - var6;
      float var7 = 7.0F;
      triangle(var0, var12, var2, var7, var3);
      float var16 = 5.0F;
      float var14 = var1 + var16;
      float var19 = 5.5F;
      float var18 = var2 - var19;
      float var20 = 2.0F;
      float var21 = 11.0F;
      float var9 = 1.0F;
      var0.rect(var14, var18, var20, var21, var9, var3);
   }

   private static void drawPlayPause(com.wimpyclient.m.b var0, float var1, float var2, int var3, boolean var4) {
      int var43 = 1064698845 ^ 2124834966 ^ 251688915;
      var43 = 118606512 ^ var43;
      float var8 = 10.0F;
      float var9 = 1.4F;
      var0.circleOutline(var1, var2, var8, var9, var3);
      if (var4 != ((1237440040 ^ var43) != 0)) {
         var43 = 753909065 ^ var43;
         float var22 = 3.5F;
         float var17 = var1 - var22;
         float var30 = 4.5F;
         float var24 = var2 - var30;
         float var31 = 2.4F;
         float var35 = 9.0F;
         float var38 = 1.2F;
         var0.rect(var17, var24, var31, var35, var38, var3);
         float var25 = 1.1F;
         float var19 = var1 + var25;
         float var32 = 4.5F;
         float var27 = var2 - var32;
         float var33 = 2.4F;
         float var36 = 9.0F;
         float var39 = 1.2F;
         var0.rect(var19, var27, var33, var36, var39, var3);
         var43 = 1694455989 ^ var43;
      } else {
         var43 = 1661415791 ^ var43;
         float var28 = 2.5F;
         float var21 = var1 - var28;
         float var34 = 7.0F;
         triangle(var0, var21, var2, var34, var3);
         var43 = 722982035 ^ var43;
      }
   }

   private static void triangle(com.wimpyclient.m.b var0, float var1, float var2, float var3, int var4) {
      int var66 = 972819317 ^ 1552188795 ^ 251688915;
      var66 = 218927937 ^ var66;
      MemoryStack var5 = MemoryStack.stackPush();
      MemoryStack var12 = var5;
      var66 = 1885986605 ^ var66;

      try {
         long var17 = var0.ctx();
         NanoVG.nvgBeginPath(var17);
         float var9 = 5.5F;
         float var48 = var2 - var9;
         NanoVG.nvgMoveTo(var17, var1, var48);
         float var56 = 5.5F;
         float var50 = var2 + var56;
         NanoVG.nvgLineTo(var17, var1, var50);
         float var43 = var1 + var3;
         NanoVG.nvgLineTo(var17, var43, var2);
         NanoVG.nvgClosePath(var17);
         int var45 = com.wimpyclient.p.g.red(var4);
         byte var46 = (byte)var45;
         int var54 = com.wimpyclient.p.g.green(var4);
         byte var55 = (byte)var54;
         int var58 = com.wimpyclient.p.g.blue(var4);
         byte var59 = (byte)var58;
         int var60 = com.wimpyclient.p.g.alpha(var4);
         byte var61 = (byte)var60;
         NVGColor var62 = NVGColor.malloc(var12);
         NVGColor var47 = NanoVG.nvgRGBA(var46, var55, var59, var61, var62);
         NanoVG.nvgFillColor(var17, var47);
         NanoVG.nvgFill(var17);
         var66 ^= 1611790340;
      } catch (Throwable var68) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var66)) {
            case -1192383096:
               var66 = 171176061 ^ var66;
               if (var5 != null) {
                  var66 = 817832762 ^ var66;

                  try {
                     var12.close();
                     var66 ^= 1147062060;
                  } catch (Throwable var67) {
                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var66)) {
                        case 1821063089:
                           var66 = 434266077 ^ var66;
                           var68.addSuppressed(var67);
                           var66 = 1790115558 ^ var66;
                           throw new RuntimeException(var68);
                        default:
                           throw new RuntimeException(new IOException("Error in hash"));
                     }
                  }

                  var66 = rbicwxystpzbtgca(var66, 923690519);
               } else {
                  var66 = 1139769857 ^ var66;
               }

               throw new RuntimeException(var68);
            default:
               throw new RuntimeException("Error in hash");
         }
      }

      if (var5 != null) {
         var66 = 2075730446 ^ var66;
         var5.close();
         var66 = rbicwxystpzbtgca(var66, 123323726);
      } else {
         var66 = 2095114048 ^ var66;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void drawSpeaker(com.wimpyclient.m.b var0, float var1, float var2, int var3, boolean var4) {
      int var161 = 1000568571 ^ 109623427 ^ 251688915;
      var161 = 953301879 ^ var161;
      MemoryStack var5 = MemoryStack.stackPush();
      MemoryStack var13 = var5;
      var161 = 668389030 ^ var161;

      label142: {
         Throwable var10000;
         label131: {
            label130: {
               label129: {
                  label128: {
                     label127: {
                        label126: {
                           label143: {
                              long var14;
                              try {
                                 long var23 = var0.ctx();
                                 var14 = var23;
                                 int var26 = com.wimpyclient.p.g.red(var3);
                                 byte var27 = (byte)var26;
                                 int var85 = com.wimpyclient.p.g.green(var3);
                                 byte var86 = (byte)var85;
                                 int var92 = com.wimpyclient.p.g.blue(var3);
                                 byte var93 = (byte)var92;
                                 int var119 = com.wimpyclient.p.g.alpha(var3);
                                 byte var120 = (byte)var119;
                                 NVGColor var147 = NVGColor.malloc(var13);
                                 NVGColor var28 = NanoVG.nvgRGBA(var27, var86, var93, var120, var147);
                                 float var94 = 7.0F;
                                 float var88 = var1 - var94;
                                 float var121 = 3.0F;
                                 float var96 = var2 - var121;
                                 float var122 = 5.0F;
                                 float var148 = 6.0F;
                                 float var10 = 1.0F;
                                 var0.rect(var88, var96, var122, var148, var10, var3);
                                 NanoVG.nvgFillColor(var23, var28);
                                 NanoVG.nvgBeginPath(var23);
                                 float var123 = 6.0F;
                                 float var99 = var1 - var123;
                                 NanoVG.nvgMoveTo(var23, var99, var2);
                                 float var125 = 2.0F;
                                 float var101 = var1 + var125;
                                 float var149 = 7.0F;
                                 float var127 = var2 - var149;
                                 NanoVG.nvgLineTo(var23, var101, var127);
                                 float var128 = 2.0F;
                                 float var103 = var1 + var128;
                                 float var150 = 7.0F;
                                 float var130 = var2 + var150;
                                 NanoVG.nvgLineTo(var23, var103, var130);
                                 NanoVG.nvgClosePath(var23);
                                 NanoVG.nvgFill(var23);
                                 NanoVG.nvgStrokeColor(var23, var28);
                                 float var105 = 1.7F;
                                 NanoVG.nvgStrokeWidth(var23, var105);
                                 byte var106 = (byte)(758074491 ^ var161);
                                 NanoVG.nvgLineCap(var23, var106);
                                 if (var4 != ((758074490 ^ var161) != 0)) {
                                    var161 ^= 1039207899;
                                    NanoVG.nvgBeginPath(var23);
                                    float var131 = 5.0F;
                                    float var108 = var1 + var131;
                                    float var151 = 3.5F;
                                    float var133 = var2 - var151;
                                    NanoVG.nvgMoveTo(var23, var108, var133);
                                    float var134 = 10.0F;
                                    float var110 = var1 + var134;
                                    float var152 = 3.5F;
                                    float var136 = var2 + var152;
                                    NanoVG.nvgLineTo(var23, var110, var136);
                                    float var137 = 10.0F;
                                    float var112 = var1 + var137;
                                    float var153 = 3.5F;
                                    float var139 = var2 - var153;
                                    NanoVG.nvgMoveTo(var23, var112, var139);
                                    float var140 = 5.0F;
                                    float var114 = var1 + var140;
                                    float var154 = 3.5F;
                                    float var142 = var2 + var154;
                                    NanoVG.nvgLineTo(var23, var114, var142);
                                    NanoVG.nvgStroke(var23);
                                    break label143;
                                 }
                              } catch (Throwable var165) {
                                 var10000 = var165;
                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var161)) {
                                    case -2030957304:
                                       break label130;
                                    case -983128672:
                                       break label128;
                                    case 1082259001:
                                       break label127;
                                    case 1769628625:
                                       break label129;
                                    case 2091370651:
                                       break label126;
                                    default:
                                       throw new RuntimeException("Error in hash");
                                 }
                              }

                              var161 ^= 88044221;

                              float[] var18;
                              int var19;
                              int var20;
                              try {
                                 byte var71 = (byte)(672153285 ^ var161);
                                 float[] var72 = new float[var71];
                                 byte var115 = (byte)(672153287 ^ var161);
                                 float var143 = 4.5F;
                                 var72[var115] = var143;
                                 byte var116 = (byte)(672153286 ^ var161);
                                 float var144 = 8.0F;
                                 var72[var116] = var144;
                                 var18 = var72;
                                 int var74 = var72.length;
                                 var19 = var74;
                                 byte var75 = (byte)(672153287 ^ var161);
                                 var20 = var75;
                                 var161 ^= 817687155;
                              } catch (Throwable var164) {
                                 var10000 = var164;
                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var161)) {
                                    case -2030957304:
                                       break label130;
                                    case -983128672:
                                       break label128;
                                    case 1082259001:
                                       break label127;
                                    case 1769628625:
                                       break label129;
                                    case 2091370651:
                                       break label126;
                                    default:
                                       throw new RuntimeException("Error in hash");
                                 }
                              }

                              while (true) {
                                 label112: {
                                    try {
                                       if (var20 < var19) {
                                          var161 ^= 2000170407;
                                          float var78 = var18[var20];
                                          NanoVG.nvgBeginPath(var14);
                                          float var145 = 2.0F;
                                          float var118 = var1 + var145;
                                          float var156 = -0.6F;
                                          float var157 = 0.6F;
                                          byte var12 = (byte)(1872034065 ^ var161);
                                          NanoVG.nvgArc(var14, var118, var2, var78, var156, var157, var12);
                                          NanoVG.nvgStroke(var14);
                                          var20 += 1872034066 ^ var161;
                                          break label112;
                                       }
                                    } catch (Throwable var163) {
                                       var10000 = var163;
                                       switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var161)) {
                                          case -2030957304:
                                             break label130;
                                          case -983128672:
                                             break label128;
                                          case 1082259001:
                                             break label127;
                                          case 1769628625:
                                             break label129;
                                          case 2091370651:
                                             break label126;
                                          default:
                                             throw new RuntimeException("Error in hash");
                                       }
                                    }

                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var161)) {
                                          case 265209008:
                                             var161 ^= 621357931;
                                             break label142;
                                          case 909387354:
                                          default:
                                             throw new IllegalStateException();
                                          case 1781383269:
                                             break;
                                          case 1926213496:
                                             break label142;
                                       }
                                    }
                                 }

                                 var161 = rbicwxystpzbtgca(var161, 2000170407);
                              }
                           }

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var161)) {
                                 case 11440121:
                                    var161 ^= 763084414;
                                 case 576196843:
                                    break label142;
                                 case 1081814654:
                                    break;
                                 case 2071546482:
                                 default:
                                    throw new IllegalStateException();
                              }
                           }
                        }

                        var161 = 1830157012 ^ var161;
                        break label131;
                     }

                     var161 = 714161408 ^ var161;
                     break label131;
                  }

                  var161 = 439211891 ^ var161;
                  break label131;
               }

               var161 = rbicwxystpzbtgca(var161, 799952829);
               break label131;
            }

            var161 = 308232806 ^ var161;
         }

         Throwable var65 = var10000;
         if (var5 != null) {
            var161 = 1568375567 ^ var161;

            try {
               var13.close();
               var161 ^= 2132979963;
            } catch (Throwable var162) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var161)) {
                  case -2881982:
                     var161 = 190665560 ^ var161;
                     var65.addSuppressed(var162);
                     var161 = 1942239483 ^ var161;
                     throw new RuntimeException(var65);
                  default:
                     throw new RuntimeException(new IllegalAccessException("Error in hash"));
               }
            }

            var161 = rbicwxystpzbtgca(var161, 129751896);
            throw new RuntimeException(var65);
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var161)) {
               case 39383307:
                  var161 = 635627692 ^ var161;
                  throw new RuntimeException(var65);
               case 443988883:
               default:
                  throw new IllegalStateException();
               case 1235192252:
                  break;
               case 1916550945:
                  throw new RuntimeException(var65);
            }
         }
      }

      if (var5 != null) {
         var161 = 84815115 ^ var161;
         var5.close();
         var161 = rbicwxystpzbtgca(var161, 1325918645);
      } else {
         var161 = 1242154174 ^ var161;
      }
   }

   static {
      int var9 = 357165674 ^ 1251669202 ^ Integer.parseInt("168845254");
      int var6 = new Random(-506519211409434607L).nextInt();
      CStsyz6lmh = 542303211 ^ var6;
      var9 = 227479537 ^ var9;
      long var0 = System.nanoTime();
      DEMO_START = var0;
      byte var2 = (byte)(-1481395856 ^ var9);
      artHandle = var2;
      byte var3 = (byte)(-1481395856 ^ var9);
      artVersion = var3;
   }

   public static String jhbkqgfnzb(byte[] var0, int var1) {
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
      String var29 = gxuxqpqqrz;
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

   private static byte[] jjmwdanooespcmh() {
      return new byte[]{0, 0, 0, 4, 0, 0, 0, 0};
   }

   private static byte[] ndnuvrjlaxqzsbe() {
      return new byte[]{0, 0, 0, 11, 0, 0, 0, 4};
   }

   private static byte[] lzbeqssvesmifom() {
      return new byte[]{0, 0, 0, 11, 0, 0, 0, 15};
   }

   private static byte[] hnalludxvjoycym() {
      return new byte[]{0, 0, 0, 15, 0, 0, 0, 26};
   }

   private static byte[] osvpoxpwtklmbkb() {
      return new byte[]{0, 0, 0, 2, 0, 0, 0, 41};
   }

   private static byte[] wzpcyrveoavczgb() {
      return new byte[]{0, 0, 0, 7, 0, 0, 0, 43};
   }

   private static byte[] roknzluzburpwxn() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, 50};
   }

   private static byte[] yibzzhalmygshcb() {
      return new byte[]{
         54,
         119,
         49,
         92,
         51,
         85,
         51,
         95,
         54,
         127,
         57,
         85,
         48,
         93,
         55,
         90,
         57,
         22,
         49,
         119,
         48,
         89,
         50,
         80,
         52,
         81,
         54,
         69,
         57,
         67,
         54,
         102,
         57,
         89,
         48,
         95,
         55,
         68,
         57,
         79,
         49,
         25,
         48,
         99,
         50,
         88,
         52,
         76,
         54,
         95,
         57,
         84,
         49,
         120,
         49,
         92,
         55,
         64,
         51,
         93,
         50,
         92,
         49,
         88,
         49,
         84,
         55,
         20,
         51,
         69,
         50,
         89,
         49,
         87,
         49,
         74,
         55,
         93,
         51,
         91,
         50,
         82,
         49,
         28,
         51,
         30,
         53,
         20,
         51,
         92,
         53,
         13,
         48,
         19,
         48,
         5,
         49,
         1,
         56,
         81,
         50,
         101
      };
   }

   private static int rbicwxystpzbtgca(int var0, int var1) {
      return var1 ^ var0;
   }
}
