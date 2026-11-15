package com.wimpyclient.u;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.Consumer;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MouseHandler;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class e {
   private static final ExecutorService WORKER;
   private static int OFE74Tey0b;
   private transient int t8bNti7PDI;
   private static byte[] keicqboomn = nsmjigwxxcbxwgy();

   private e() {
super();
      int var4 = 1602568097 ^ 222338224;
      
      var4 = 744134293 ^ var4;
      var4 = 1759882337 ^ 814183019 ^ Integer.parseInt("654175118");
      this.t8bNti7PDI = 464478386 ^ OFE74Tey0b;
      var4 = 792100454 ^ var4;
   }

   public static void pickAsync(Consumer<Path> var0) {
      int var15 = 143892314 ^ 967636084 ^ 2067671369;
      var15 = 1027367495 ^ var15;
      Minecraft var1 = Minecraft.getInstance();
      Minecraft var3 = var1;
      if (var1 == null) {
         var15 = 2101968364 ^ var15;
      } else {
         var15 = 622670343 ^ var15;
         MouseHandler var7 = var1.mouseHandler;
         label30:
         if (var7 != null) {
            var15 = 1161100403 ^ var15;

            try {
               MouseHandler var9 = var3.mouseHandler;
               var9.releaseMouse();
               var15 ^= 392273080;
            } catch (Throwable var16) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var15)) {
                  case -1196985696:
                     var15 = 868685683 ^ var15;
                     var15 = 782738667 ^ var15;
                     break label30;
                  default:
                     throw new RuntimeException(new IllegalAccessException("Error in hash"));
               }
            }

            var15 = 167849760 ^ var15;
         } else {
            label38:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
                  case 102426918:
                  default:
                     throw new RuntimeException(new IOException());
                  case 253653259:
                     var15 = 1481920491 ^ var15;
                     break label38;
                  case 470371406:
                     break;
                  case 1150043976:
                     break label38;
               }
            }
         }
      }

      ExecutorService var10 = WORKER;
      Runnable var12 = () -> {
         int var31 = 1790416817 ^ 137138516 ^ 2067671369;
         var31 = 1078376050 ^ var31;
         Object var1x = null;
         Path var4 = (Path)var1x;
         var31 = 1983304079 ^ var31;

         label79: {
            label68: {
               label67: {
                  label66: {
                     label65: {
                        label64: {
                           label74: {
                              label62: {
                                 try {
                                    String var7x = jeeiuisvpq(lmhlmhvlmaeidmv(), var31);
                                    String var2 = jeeiuisvpq(uysynriabcyqapi(), var31);
                                    String var8 = System.getProperty(var7x, var2);
                                    Locale var22x = Locale.ROOT;
                                    String var9x = var8.toLowerCase(var22x);
                                    String var23x = jeeiuisvpq(wbftlqvvsgreigs(), var31);
                                    byte var11 = (byte)((var9x.contains(var23x)) ? 1 : 0);
                                    if (var11 != (802506833 ^ var31)) {
                                       var31 ^= 674472608;
                                       Path var12x = pickWindows();
                                       var4 = var12x;
                                       var31 ^= 1922291179;
                                       break label62;
                                    }
                                 } catch (Throwable var33) {
                                    switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var31)) {
                                       case -2089070168:
                                          break label65;
                                       case -1414924077:
                                          break label74;
                                       case 1060591496:
                                          break label66;
                                       case 2125087369:
                                          break label64;
                                       default:
                                          throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                    }
                                 }

                                 var31 ^= 1520465739;
                              }

                              try {
                                 if (var4 == null) {
                                    var31 ^= 1696224559;
                                    Path var14 = pickSwing();
                                    var4 = var14;
                                    var31 ^= 1067953207;
                                    break label68;
                                 }
                              } catch (Throwable var32) {
                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var31)) {
                                    case -2089070168:
                                       break label65;
                                    case -1414924077:
                                       break label74;
                                    case 1060591496:
                                       break label66;
                                    case 2125087369:
                                       break label64;
                                    default:
                                       throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                 }
                              }

                              var31 ^= 1522399512;
                              break label68;
                           }

                           var31 = 821256484 ^ var31;
                           break label67;
                        }

                        var31 = 1783830127 ^ var31;
                        break label67;
                     }

                     var31 = 1441346571 ^ var31;
                     break label67;
                  }

                  var31 = 1113633999 ^ var31;
               }

               Object var21x = null;
               var4 = (Path)var21x;
               var31 = 499474848 ^ var31;
               break label79;
            }

            var31 = 2005662108 ^ var31;
         }

         Path var15x = var4;
         Minecraft var16x = Minecraft.getInstance();
         if (var16x != null) {
            var31 = 1916171928 ^ var31;
            Runnable var26 = () -> {
               int var6 = 1990790418 ^ 823037643 ^ 2067671369;
               var6 = 1750615548 ^ var6;
               var0.accept(var15x);
            };
            var16x.execute(var26);
            var31 = ffekvepdgnvepmtm(var31, 1589068279);
         } else {
            var31 = ffekvepdgnvepmtm(var31, 26897922);
            var0.accept(var15x);
            var31 = 756767085 ^ var31;
         }
      };
      var10.execute(var12);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static Path pickWindows() throws Exception {
      int var129 = 155012900 ^ 47325225 ^ 2067671369;
      var129 = 1161956110 ^ var129;
      String var0 = jeeiuisvpq(hfpdvhtofzssgok(), var129);
      byte var1 = (byte)(898846028 ^ var129);
      CharSequence[] var69 = new CharSequence[var1];
      byte var2 = (byte)(898846026 ^ var129);
      String var3 = jeeiuisvpq(hojhatadsxwqnqv(), var129);
      var69[var2] = var3;
      byte var95 = (byte)(898846027 ^ var129);
      String var101 = jeeiuisvpq(swfrnkxfxgajlkk(), var129);
      var69[var95] = var101;
      byte var96 = (byte)(898846024 ^ var129);
      String var102 = jeeiuisvpq(epwqzrplmeyqzqu(), var129);
      var69[var96] = var102;
      byte var97 = (byte)(898846025 ^ var129);
      String var103 = jeeiuisvpq(pxsvvwtwlrwfvrz(), var129);
      var69[var97] = var103;
      byte var98 = (byte)(898846030 ^ var129);
      String var104 = jeeiuisvpq(dkpzhndhixubyxa(), var129);
      var69[var98] = var104;
      byte var99 = (byte)(898846031 ^ var129);
      String var105 = jeeiuisvpq(nnnkqcznoodmuuh(), var129);
      var69[var99] = var105;
      String var13 = String.join(var0, var69);
      byte var88 = (byte)(898846029 ^ var129);
      String[] var89 = new String[var88];
      byte var106 = (byte)(898846026 ^ var129);
      String var4 = jeeiuisvpq(bpwpppqemsqwuob(), var129);
      var89[var106] = var4;
      byte var107 = (byte)(898846027 ^ var129);
      String var115 = jeeiuisvpq(wjwyxdceplmhpqn(), var129);
      var89[var107] = var115;
      byte var108 = (byte)(898846024 ^ var129);
      String var116 = jeeiuisvpq(fwjgqgzckymcnoe(), var129);
      var89[var108] = var116;
      byte var109 = (byte)(898846025 ^ var129);
      String var117 = jeeiuisvpq(khmylaxsqhvajxo(), var129);
      var89[var109] = var117;
      byte var110 = (byte)(898846030 ^ var129);
      String var118 = jeeiuisvpq(kccwdzmmazpswqr(), var129);
      var89[var110] = var118;
      byte var111 = (byte)(898846031 ^ var129);
      String var119 = jeeiuisvpq(pnvcuznlnnadlrn(), var129);
      var89[var111] = var119;
      byte var112 = (byte)(898846028 ^ var129);
      var89[var112] = var13;
      ProcessBuilder var14 = new ProcessBuilder(var89);
      byte var70 = (byte)(898846027 ^ var129);
      ProcessBuilder var16 = var14.redirectErrorStream((var70 != 0));
      Process var18 = var14.start();
      InputStream var114 = var18.getInputStream();
      Charset var121 = StandardCharsets.UTF_8;
      InputStreamReader var90 = new InputStreamReader(var114, var121);
      BufferedReader var19 = new BufferedReader(var90);
      BufferedReader var9 = var19;
      var129 = 1203362072 ^ var129;

      String var122;
      label216: {
         Throwable var10000;
         label205: {
            label204: {
               label203: {
                  label202: {
                     label201: {
                        label200: {
                           label217: {
                              StringBuilder var10;
                              try {
                                 StringBuilder var20 = new StringBuilder();
                                 var10 = var20;
                                 var129 ^= 1208521252;
                              } catch (Throwable var133) {
                                 var10000 = var133;
                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var129)) {
                                    case -1856724333:
                                       break label204;
                                    case -787467343:
                                       break label203;
                                    case -62579853:
                                       break label201;
                                    case 1199202632:
                                       break label200;
                                    case 1457438539:
                                       break label202;
                                    case 1648529443:
                                       break label217;
                                    default:
                                       throw new RuntimeException(new IOException("Error in hash"));
                                 }
                              }

                              while (true) {
                                 String var8;
                                 label195: {
                                    try {
                                       String var22 = var9.readLine();
                                       var8 = var22;
                                       if (var22 == null) {
                                          break;
                                       }

                                       var129 ^= 1358549407;
                                       byte var24 = (byte)((var10.isEmpty()) ? 1 : 0);
                                       if (var24 == (1792792553 ^ var129)) {
                                          var129 ^= 1647614912;
                                          byte var71 = (byte)(149900323 ^ var129);
                                          StringBuilder var26 = var10.append((char)var71);
                                          var129 ^= 2003300167;
                                          break label195;
                                       }
                                    } catch (Throwable var134) {
                                       var10000 = var134;
                                       switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var129)) {
                                          case -1856724333:
                                             break label204;
                                          case -787467343:
                                             break label203;
                                          case -62579853:
                                             break label201;
                                          case 1199202632:
                                             break label200;
                                          case 1457438539:
                                             break label202;
                                          case 1648529443:
                                             break label217;
                                          default:
                                             throw new RuntimeException(new IOException("Error in hash"));
                                       }
                                    }

                                    var129 = ffekvepdgnvepmtm(var129, 357790855);
                                 }

                                 try {
                                    StringBuilder var28 = var10.append(var8);
                                 } catch (Throwable var132) {
                                    var10000 = var132;
                                    switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var129)) {
                                       case -1856724333:
                                          break label204;
                                       case -787467343:
                                          break label203;
                                       case -62579853:
                                          break label201;
                                       case 1199202632:
                                          break label200;
                                       case 1457438539:
                                          break label202;
                                       case 1648529443:
                                          break label217;
                                       default:
                                          throw new RuntimeException(new IOException("Error in hash"));
                                    }
                                 }

                                 var129 ^= 1168811288;
                              }

                              label139:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var129)) {
                                    case 10606246:
                                       var129 ^= 1449809010;
                                       break label139;
                                    case 788257657:
                                    default:
                                       throw new RuntimeException(new IOException());
                                    case 1033874630:
                                       break;
                                    case 1450337330:
                                       break label139;
                                 }
                              }

                              try {
                                 String var35 = var10.toString();
                                 String var36 = var35.trim();
                                 var122 = var36;
                                 var129 ^= 325765834;
                                 break label216;
                              } catch (Throwable var131) {
                                 var10000 = var131;
                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var129)) {
                                    case -1856724333:
                                       break label204;
                                    case -787467343:
                                       break label203;
                                    case -62579853:
                                       break label201;
                                    case 1199202632:
                                       break label200;
                                    case 1457438539:
                                       break label202;
                                    case 1648529443:
                                       break;
                                    default:
                                       throw new RuntimeException(new IOException("Error in hash"));
                                 }
                              }
                           }

                           var129 = 1387475070 ^ var129;
                           break label205;
                        }

                        var129 = ffekvepdgnvepmtm(var129, 907292243);
                        break label205;
                     }

                     var129 = 1098105108 ^ var129;
                     break label205;
                  }

                  var129 = ffekvepdgnvepmtm(var129, 1411429779);
                  break label205;
               }

               var129 = 81355788 ^ var129;
               break label205;
            }

            var129 = 1288828456 ^ var129;
         }

         Throwable var29 = var10000;
         var129 = 777116520 ^ var129;

         try {
            var9.close();
            var129 ^= 1526082210;
         } catch (Throwable var130) {
            switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var129)) {
               case -2057975664:
                  var129 = 1411192427 ^ var129;
                  var29.addSuppressed(var130);
                  var129 = 672905811 ^ var129;
                  throw new RuntimeException(var29);
               default:
                  throw new RuntimeException("Error in hash");
            }
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var129)) {
               case 1250425:
                  var129 = 653297306 ^ var129;
                  throw new RuntimeException(var29);
               case 583635657:
                  break;
               case 821556505:
                  throw new RuntimeException(var29);
               case 1140511238:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }

      var9.close();
      var129 = ffekvepdgnvepmtm(var129, 145232327);
      int var39 = var18.waitFor();
      if (var39 == (2005567753 ^ var129)) {
         var129 = 153680395 ^ var129;
         if (var122 != null) {
            var129 = 1916737425 ^ var129;
            byte var43 = (byte)((var122.isBlank()) ? 1 : 0);
            if (var43 != (211641491 ^ var129)) {
               var129 = 231376680 ^ var129;
               return null;
            } else {
               label111:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var129)) {
                     case 141622849:
                        var129 ^= 1986746818;
                     case 523862653:
                        break label111;
                     case 641056627:
                     default:
                        throw new RuntimeException(new IOException());
                     case 698108421:
                  }
               }

               String var74 = jeeiuisvpq(szxpqoqzsrsnsdd(), var129);
               String[] var45 = var122.split(var74);
               int var76 = var45.length;
               byte var91 = (byte)(2062957904 ^ var129);
               int var77 = var76 - var91;
               String var47 = var45[var77];
               String var48 = var47.trim();
               String var126 = var48;
               String var78 = jeeiuisvpq(eyfrahydvjkfvph(), var129);
               byte var50 = (byte)((var48.startsWith(var78)) ? 1 : 0);
               if (var50 != (2062957905 ^ var129)) {
                  var129 = 1445131129 ^ var129;
                  String var79 = jeeiuisvpq(bxwijtcwcheupgo(), var129);
                  byte var52 = (byte)((var48.endsWith(var79)) ? 1 : 0);
                  if (var52 != (752143912 ^ var129)) {
                     var129 = 85376214 ^ var129;
                     int var54 = var48.length();
                     byte var80 = (byte)(700609276 ^ var129);
                     if (var54 >= var80) {
                        var129 = 84077200 ^ var129;
                        byte var81 = (byte)(750819439 ^ var129);
                        int var93 = var48.length();
                        byte var100 = (byte)(750819439 ^ var129);
                        int var94 = var93 - var100;
                        String var56 = var48.substring(var81, var94);
                        var126 = var56;
                        var129 = 1282603694 ^ var129;
                     } else {
                        label101:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var129)) {
                              case 15243022:
                                 var129 ^= 1232080958;
                                 break label101;
                              case 19074630:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 31467689:
                                 break;
                              case 256869022:
                                 break label101;
                           }
                        }
                     }
                  } else {
                     var129 = 1281797352 ^ var129;
                  }
               } else {
                  var129 = ffekvepdgnvepmtm(var129, 440688529);
               }

               byte var82 = (byte)(1622303424 ^ var129);
               String[] var83 = new String[var82];
               Path var58 = Path.of(var126, var83);
               byte var84 = (byte)(1622303424 ^ var129);
               LinkOption[] var85 = new LinkOption[var84];
               byte var60 = (byte)((Files.isRegularFile(var58, var85)) ? 1 : 0);
               if (var60 != (1622303424 ^ var129)) {
                  var129 = 1818130469 ^ var129;
                  Path var62 = var58.getFileName();
                  String var63 = var62.toString();
                  byte var64 = (byte)((isSchematicName(var63)) ? 1 : 0);
                  if (var64 != (216799973 ^ var129)) {
                     var129 = 710145605 ^ var129;
                     var129 = 47469459 ^ var129;
                     return var58;
                  }

                  var129 = 1032242768 ^ var129;
               } else {
                  var129 = ffekvepdgnvepmtm(var129, 1373159029);
               }

               byte var86 = (byte)(829086901 ^ var129);
               LinkOption[] var87 = new LinkOption[var86];
               byte var66 = (byte)((Files.isRegularFile(var58, var87)) ? 1 : 0);
               Path var68;
               if (var66 != (829086901 ^ var129)) {
                  var129 = 1570164633 ^ var129;
                  var68 = var58;
                  var129 = 1217899551 ^ var129;
               } else {
                  var129 = 1619297985 ^ var129;
                  var68 = null;
                  var129 = 1971709255 ^ var129;
               }

               return var68;
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var129)) {
                  case 62886730:
                  default:
                     throw new RuntimeException(new IOException());
                  case 89833585:
                     var129 = 2146799801 ^ var129;
                     return null;
                  case 1669657465:
                     return null;
                  case 1758616032:
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var129)) {
               case 127671819:
                  var129 = 1994222258 ^ var129;
                  return null;
               case 1229002857:
                  return null;
               case 1541298081:
               default:
                  throw new RuntimeException(new IOException());
               case 1618118625:
            }
         }
      }
   }

   private static Path pickSwing() throws Exception {
      int var44 = 1018123739 ^ 1781559636 ^ 2067671369;
      var44 = 830685638 ^ var44;
      String var0 = jeeiuisvpq(ksuwgbuemqfbeoy(), var44);
      String var1 = jeeiuisvpq(vqgylmwgfwtbxbp(), var44);
      String var9 = System.setProperty(var0, var1);
      var44 = 1263524984 ^ var44;

      label48: {
         try {
            String var10 = UIManager.getSystemLookAndFeelClassName();
            UIManager.setLookAndFeel(var10);
            var44 ^= 353596817;
         } catch (Throwable var45) {
            switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var44)) {
               case -1150516286:
                  var44 = 1710113752 ^ var44;
                  var44 = 655152717 ^ var44;
                  break label48;
               default:
                  throw new RuntimeException(new IOException("Error in hash"));
            }
         }

         var44 = ffekvepdgnvepmtm(var44, 1475469316);
      }

      JFileChooser var12 = new JFileChooser();
      String var29 = jeeiuisvpq(khfrzjufpnggwgj(), var44);
      var12.setDialogTitle(var29);
      byte var30 = (byte)(361694700 ^ var44);
      var12.setAcceptAllFileFilterUsed((var30 != 0));
      String var2 = jeeiuisvpq(dfzgpucjmxxvjsr(), var44);
      byte var3 = (byte)(361694702 ^ var44);
      String[] var36 = new String[var3];
      byte var4 = (byte)(361694701 ^ var44);
      String var5 = jeeiuisvpq(jcfukrodqvgwihi(), var44);
      var36[var4] = var5;
      byte var37 = (byte)(361694700 ^ var44);
      String var39 = jeeiuisvpq(wkszvkbeliigdpt(), var44);
      var36[var37] = var39;
      byte var38 = (byte)(361694703 ^ var44);
      String var40 = jeeiuisvpq(rcveryzzivfjgqj(), var44);
      var36[var38] = var40;
      FileNameExtensionFilter var31 = new FileNameExtensionFilter(var2, var36);
      var12.setFileFilter(var31);
      byte var32 = (byte)(361694701 ^ var44);
      var12.setMultiSelectionEnabled((var32 != 0));
      Object var33 = null;
      int var18 = var12.showOpenDialog((Component)var33);
      if (var18 == (361694701 ^ var44)) {
         var44 = 1129390915 ^ var44;
         File var21 = var12.getSelectedFile();
         if (var21 != null) {
            var44 = ffekvepdgnvepmtm(var44, 270469249);
            File var23 = var12.getSelectedFile();
            Path var24 = var23.toPath();
            byte var34 = (byte)(1187065391 ^ var44);
            LinkOption[] var35 = new LinkOption[var34];
            byte var26 = (byte)((Files.isRegularFile(var24, var35)) ? 1 : 0);
            if (var26 == (1187065391 ^ var44)) {
               var44 = 2042239274 ^ var44;
               Object var27 = null;
               var44 = 2100107782 ^ var44;
               return (Path)var27;
            } else {
               var44 = 873908329 ^ var44;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var44)) {
                     case 243416304:
                        var44 = 813812549 ^ var44;
                        return var24;
                     case 1011651519:
                        break;
                     case 1137418567:
                     default:
                        throw new RuntimeException();
                     case 1230114472:
                        return var24;
                  }
               }
            }
         }

         var44 = 2068087731 ^ var44;
      } else {
         var44 = ffekvepdgnvepmtm(var44, 940941552);
      }

      return null;
   }

   public static boolean isSchematicName(String var0) {
      int var19 = 187473828 ^ 1856126991 ^ 2067671369;
      var19 = 700666752 ^ var19;
      if (var0 == null) {
         var19 = 1357275117 ^ var19;
         return (((byte)(1737882255 ^ var19)) != 0);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
               case 191899422:
                  var19 ^= 1715418251;
                  break;
               case 622662390:
                  continue;
               case 1310825763:
               default:
                  throw new RuntimeException();
               case 2115258533:
            }

            Locale var2 = Locale.ROOT;
            String var6 = var0.toLowerCase(var2);
            String var14 = jeeiuisvpq(uzmrwtodkmeyknl(), var19);
            byte var8 = (byte)((var6.endsWith(var14)) ? 1 : 0);
            if (var8 == (1363972585 ^ var19)) {
               var19 ^= 937912199;
               String var15 = jeeiuisvpq(mcouswypizacbcm(), var19);
               byte var10 = (byte)((var6.endsWith(var15)) ? 1 : 0);
               if (var10 == (1722545774 ^ var19)) {
                  var19 = 397338306 ^ var19;
                  String var16 = jeeiuisvpq(vfpfouhnssvhkey(), var19);
                  byte var12 = (byte)((var6.endsWith(var16)) ? 1 : 0);
                  if (var12 == (1896157356 ^ var19)) {
                     label35:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
                           case 148505244:
                              break label35;
                           case 184131912:
                              var19 ^= 909004014;
                              break label35;
                           case 360663976:
                           default:
                              throw new RuntimeException();
                           case 676944195:
                        }
                     }

                     byte var13 = (byte)(1194024002 ^ var19);
                     var19 = 609257619 ^ var19;
                     return (var13 != 0);
                  }

                  var19 = 228888608 ^ var19;
               } else {
                  label51:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
                        case 93864630:
                           break label51;
                        case 116214750:
                           var19 ^= 436893410;
                           break label51;
                        case 1498129486:
                           break;
                        case 1584318791:
                        default:
                           throw new RuntimeException();
                     }
                  }
               }
            } else {
               label45:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
                     case 111411713:
                        break;
                     case 207030925:
                     default:
                        throw new RuntimeException();
                     case 226757631:
                        var19 ^= 770511205;
                     case 1232161616:
                        break label45;
                  }
               }
            }

            byte var25 = (byte)(2090958989 ^ var19);
            var19 = 534402141 ^ var19;
            return (var25 != 0);
         }
      }
   }

   static {
      int var7 = 266666855 ^ 954370642 ^ Integer.parseInt("654175118");
      int var4 = new Random(-8539529713938043962L).nextInt();
      OFE74Tey0b = -810771786 ^ var4;
      var7 = 2030701728 ^ var7;
      ThreadFactory var0 = var0x -> {
         int var10 = 1591642453 ^ 1458267580 ^ 2067671369;
         var10 = 33245879 ^ var10;
         String var3 = jeeiuisvpq(dgellesqnviextq(), var10);
         Thread var1x = new Thread(var0x, var3);
         byte var7x = (byte)(1928367894 ^ var10);
         var1x.setDaemon((var7x != 0));
         return var1x;
      };
      ExecutorService var1 = Executors.newSingleThreadExecutor(var0);
      WORKER = var1;
   }

   public static String jeeiuisvpq(byte[] var0, int var1) {
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
         byte[] var27 = keicqboomn;
         byte[] var34 = keicqboomn;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] nsmjigwxxcbxwgy() {
      return new byte[]{
         47,
         16,
         33,
         87,
         34,
         63,
         32,
         75,
         32,
         113,
         43,
         56,
         11,
         34,
         101,
         98,
         91,
         89,
         2,
         23,
         52,
         75,
         25,
         28,
         60,
         126,
         69,
         84,
         123,
         41,
         125,
         59,
         69,
         63,
         7,
         42,
         91,
         9,
         117,
         121,
         104,
         20,
         39,
         65,
         27,
         47,
         32,
         21,
         3,
         9,
         78,
         35,
         102,
         63,
         127,
         14,
         43,
         59,
         89,
         8,
         35,
         108,
         21,
         9,
         3,
         117,
         126,
         51,
         51,
         108,
         80,
         61,
         49,
         97,
         31,
         109,
         90,
         23,
         26,
         24,
         113,
         97,
         93,
         55,
         108,
         31,
         33,
         101,
         82,
         66,
         62,
         78,
         51,
         112,
         7,
         127,
         24,
         103,
         45,
         27,
         66,
         90,
         38,
         91
      };
   }

   private static byte[] szxpqoqzsrsnsdd() {
      return new byte[]{-29, -33, 23, 57, 27, 88};
   }

   private static byte[] eyfrahydvjkfvph() {
      return new byte[]{-29, -33, 23, 71};
   }

   private static byte[] bxwijtcwcheupgo() {
      return new byte[]{-26, -38, 19, 68};
   }

   private static byte[] hfpdvhtofzssgok() {
      return new byte[]{-23, -42, 25, 79};
   }

   private static byte[] hojhatadsxwqnqv() {
      return new byte[]{
         -23,
         -42,
         25,
         46,
         22,
         109,
         16,
         29,
         22,
         100,
         18,
         84,
         51,
         111,
         83,
         34,
         105,
         10,
         58,
         14,
         12,
         94,
         45,
         107,
         12,
         63,
         115,
         31,
         66,
         116,
         69,
         98,
         115,
         109,
         53,
         112,
         99,
         73,
         77,
         15,
         92,
         67,
         23,
         30,
         45,
         114,
         25,
         13,
         59,
         110,
         120,
         106,
         84,
         122,
         71,
         67,
         19,
         102,
         109,
         83,
         19,
         112,
         35,
         102,
         58,
         36,
         70,
         105,
         5,
         56,
         98,
         100,
         9,
         47,
         39,
         38,
         110,
         15,
         42,
         108,
         71,
         54,
         100,
         125,
         84,
         70,
         23,
         38,
         96,
         79
      };
   }

   private static byte[] swfrnkxfxgajlkk() {
      return new byte[]{
         -23,
         -42,
         25,
         75,
         22,
         111,
         16,
         89,
         22,
         116,
         18,
         32,
         51,
         88,
         83,
         55,
         105,
         24,
         58,
         3,
         12,
         60,
         45,
         72,
         12,
         38,
         115,
         9,
         66,
         114,
         69,
         123,
         115,
         47,
         53,
         79,
         99,
         73,
         77,
         50,
         92,
         86,
         23,
         22,
         45,
         122,
         25,
         3,
         59,
         106,
         120,
         122,
         84,
         103,
         71,
         83,
         19,
         108,
         109,
         73,
         19,
         45,
         35,
         31,
         58,
         11,
         70,
         104,
         5,
         46,
         98,
         102,
         9,
         43,
         39,
         123,
         110,
         110,
         42,
         90,
         71,
         60,
         100,
         97,
         84,
         109,
         23,
         60,
         96,
         24,
         6,
         18,
         11,
         12,
         51,
         32,
         40,
         52,
         27,
         79,
         123,
         13,
         30,
         8,
         25,
         27
      };
   }

   private static byte[] epwqzrplmeyqzqu() {
      return new byte[]{
         -23,
         -42,
         25,
         75,
         22,
         111,
         16,
         87,
         22,
         29,
         18,
         105,
         51,
         98,
         83,
         62,
         105,
         10,
         58,
         14,
         12,
         78,
         45,
         10,
         12,
         107,
         115,
         35,
         66,
         97,
         69,
         106,
         115,
         97,
         53,
         60,
         99,
         67,
         77,
         34,
         92,
         74,
         23,
         22,
         45,
         122,
         25,
         76,
         59,
         73,
         120,
         122,
         84,
         106,
         71,
         16,
         19,
         56
      };
   }

   private static byte[] pxsvvwtwlrwfvrz() {
      return new byte[]{
         -23,
         -42,
         25,
         75,
         22,
         111,
         16,
         87,
         22,
         15,
         18,
         105,
         51,
         122,
         83,
         38,
         105,
         10,
         58,
         92,
         12,
         83,
         45,
         23,
         12,
         108,
         115,
         75,
         66,
         66,
         69,
         108,
         115,
         103,
         53,
         121,
         99,
         93,
         77,
         32,
         92,
         86,
         23,
         26,
         45,
         116,
         25,
         94,
         59,
         29,
         120,
         59,
         84,
         35,
         71,
         25,
         19,
         111,
         109,
         87,
         19,
         42,
         35,
         84,
         58,
         32,
         70,
         102,
         5,
         40,
         98,
         98,
         9,
         59,
         39,
         110,
         110,
         11,
         42,
         4,
         71,
         42,
         100,
         108,
         84,
         67,
         23,
         48,
         96,
         25,
         6,
         76,
         11,
         98,
         51,
         103,
         40,
         38,
         27,
         64,
         123,
         10,
         30,
         10,
         25,
         77,
         19,
         0,
         26,
         114,
         24,
         26,
         20,
         36,
         27,
         35,
         61,
         102,
         92,
         112,
         99,
         67,
         52,
         75,
         6,
         20,
         33,
         81,
         4,
         35,
         113,
         15,
         75,
         122,
         75,
         119,
         124,
         110,
         63,
         125,
         109,
         2,
         71,
         101,
         80,
         3,
         31,
         10,
         47,
         122,
         16,
         79,
         53,
         84,
         119,
         118,
         94,
         48,
         73,
         20,
         25,
         35,
         97,
         66,
         27,
         55,
         33,
         87,
         51,
         34,
         72,
         102,
         10,
         53,
         104,
         125,
         7,
         56,
         45,
         56,
         98,
         82,
         34,
         97,
         69,
         59,
         109,
         105,
         90,
         7,
         24,
         59,
         106,
         31,
         8,
         18,
         1,
         35,
         63,
         53,
         32,
         127,
         25,
         5,
         114,
         66,
         16,
         77,
         22,
         2,
         25,
         74,
         20,
         115,
         18,
         87,
         24,
         102,
         19,
         42,
         63,
         51,
         85,
         107
      };
   }

   private static byte[] dkpzhndhixubyxa() {
      return new byte[]{
         -23,
         -42,
         25,
         75,
         22,
         111,
         16,
         87,
         22,
         4,
         18,
         117,
         51,
         122,
         83,
         38,
         105,
         6,
         58,
         93,
         12,
         22,
         45,
         70,
         12,
         41,
         115,
         15,
         66,
         101,
         69,
         47,
         115,
         50,
         53,
         60,
         99,
         20,
         77,
         39,
         92,
         67,
         23,
         31,
         45,
         100,
         25,
         72,
         59,
         6
      };
   }

   private static byte[] nnnkqcznoodmuuh() {
      return new byte[]{
         -23,
         -42,
         25,
         6,
         22,
         111,
         16,
         89,
         22,
         97,
         18,
         36,
         51,
         112,
         83,
         124,
         105,
         60,
         58,
         70,
         12,
         28,
         45,
         93,
         12,
         8,
         115,
         5,
         66,
         112,
         69,
         99,
         115,
         96,
         53,
         123,
         99,
         24,
         77,
         104,
         92,
         2,
         23,
         94,
         45,
         114,
         25,
         92,
         59,
         29,
         120,
         72,
         84,
         90,
         71,
         78,
         19,
         112,
         109,
         74,
         19,
         59,
         35,
         92,
         58,
         99,
         70,
         80,
         5,
         53,
         98,
         101,
         9,
         60,
         39,
         58,
         110,
         86,
         42,
         89,
         71,
         119,
         100,
         73,
         84,
         68,
         23,
         39,
         96,
         25,
         6,
         4,
         11,
         102,
         51,
         13,
         40,
         60,
         27,
         66,
         123,
         14,
         30,
         0,
         25,
         71,
         19,
         51,
         26,
         99,
         24,
         0,
         20,
         50,
         27,
         102,
         61,
         110,
         92,
         7,
         99,
         87,
         52,
         29,
         6,
         50,
         33,
         110,
         4,
         111,
         113,
         66,
         75,
         96,
         75,
         35,
         124,
         92,
         63,
         93,
         109,
         86,
         71,
         33,
         80,
         94,
         31,
         22,
         47,
         117,
         16,
         66,
         53,
         108,
         119,
         33,
         94,
         49,
         73,
         113,
         25,
         120,
         97,
         69,
         27,
         122,
         33,
         104,
         51,
         53,
         72,
         98,
         10,
         32,
         104,
         108,
         7,
         121,
         45,
         127,
         98,
         72,
         34,
         14,
         69,
         17,
         109,
         108,
         90,
         75,
         24,
         56,
         106,
         56,
         8,
         31,
         1,
         43,
         63,
         35,
         32,
         118,
         25,
         13,
         114,
         21
      };
   }

   private static byte[] bpwpppqemsqwuob() {
      return new byte[]{-23, -42, 25, 31, 22, 102, 16, 14, 22, 44, 18, 114, 51, 101, 83, 58, 105, 10, 58, 66, 12, 31, 45, 4, 12, 41, 115, 20, 66, 116};
   }

   private static byte[] wjwyxdceplmhpqn() {
      return new byte[]{-23, -42, 25, 66, 22, 71, 16, 22, 22, 25, 18, 114, 51, 121, 83, 52, 105, 6, 58, 66, 12, 22};
   }

   private static byte[] fwjgqgzckymcnoe() {
      return new byte[]{-23, -42, 25, 66, 22, 71, 16, 22, 22, 39, 18, 73, 51, 120, 83, 38, 105, 10, 58, 92, 12, 18, 45, 73, 12, 56, 115, 5, 66, 103, 69, 106};
   }

   private static byte[] khmylaxsqhvajxo() {
      return new byte[]{
         -23, -42, 25, 66, 22, 76, 16, 1, 22, 44, 18, 99, 51, 99, 83, 38, 105, 6, 58, 65, 12, 29, 45, 122, 12, 35, 115, 0, 66, 120, 69, 108, 115, 118
      };
   }

   private static byte[] kccwdzmmazpswqr() {
      return new byte[]{-23, -42, 25, 45, 22, 112, 16, 9, 22, 40, 18, 115, 51, 101};
   }

   private static byte[] pnvcuznlnnadlrn() {
      return new byte[]{-23, -42, 25, 66, 22, 74, 16, 22, 22, 36, 18, 109, 51, 119, 83, 60, 105, 11};
   }

   private static byte[] khfrzjufpnggwgj() {
      return new byte[]{-30, -39, 16, 46, 27, 123, 23, 30, 17, 44, 29, 41, 61, 104, 81, 54, 107, 0, 49, 68, 5, 16, 32, 73, 11, 58, 116, 14, 77, 123};
   }

   private static byte[] dfzgpucjmxxvjsr() {
      return new byte[]{
         -30,
         -39,
         16,
         50,
         27,
         104,
         23,
         19,
         17,
         39,
         29,
         100,
         61,
         122,
         81,
         33,
         107,
         1,
         49,
         66,
         5,
         14,
         32,
         8,
         11,
         102,
         116,
         77,
         77,
         54,
         75,
         110,
         113,
         97,
         55,
         111,
         104,
         90,
         68,
         34,
         81,
         65,
         16,
         5,
         42,
         117,
         22,
         71,
         53,
         28,
         122,
         52,
         86,
         36,
         76,
         22,
         26,
         126,
         96,
         95,
         20,
         52,
         36,
         95,
         53,
         41,
         72,
         38,
         7,
         123,
         96,
         38,
         2,
         121,
         46,
         40,
         99,
         64,
         45,
         64,
         64,
         55,
         107,
         107,
         90,
         71,
         21,
         38,
         98,
         26,
         13,
         27,
         2,
         111
      };
   }

   private static byte[] jcfukrodqvgwihi() {
      return new byte[]{-30, -39, 16, 13, 27, 98, 23, 15, 17, 39, 29, 100, 61, 122, 81, 33, 107, 1, 49, 66};
   }

   private static byte[] wkszvkbeliigdpt() {
      return new byte[]{-30, -39, 16, 18, 27, 104, 23, 19, 17, 39, 29, 100};
   }

   private static byte[] rcveryzzivfjgqj() {
      return new byte[]{-30, -39, 16, 18, 27, 104, 23, 19, 17, 39, 29, 100, 61, 122, 81, 33, 107, 1, 49, 66};
   }

   private static byte[] ksuwgbuemqfbeoy() {
      return new byte[]{
         -27, -40, 19, 13, 18, 103, 23, 15, 24, 36, 28, 36, 59, 115, 92, 34, 105, 21, 54, 14, 6, 19, 41, 64, 11, 45, 125, 4, 76, 119, 77, 110, 124, 123, 53, 97
      };
   }

   private static byte[] vqgylmwgfwtbxbp() {
      return new byte[]{-27, -40, 19, 1, 18, 103, 23, 21, 24, 54, 28, 111};
   }

   private static byte[] uzmrwtodkmeyknl() {
      return new byte[]{-32, -36, 23, 74, 27, 100, 18, 23, 24, 48, 26, 110, 61, 124, 92, 52, 105, 24, 58, 75, 5, 27};
   }

   private static byte[] vfpfouhnssvhkey() {
      return new byte[]{-32, -41, 24, 79, 19, 121, 23, 27, 21, 47, 26, 101, 50, 121, 84, 54, 108, 30, 55, 72, 5, 16};
   }

   private static byte[] mcouswypizacbcm() {
      return new byte[]{-32, -40, 19, 75, 23, 120, 21, 31, 23, 45, 26, 106, 57, 125};
   }

   private static byte[] lmhlmhvlmaeidmv() {
      return new byte[]{-23, -33, 19, 13, 18, 122, 24, 86, 19, 39, 27, 107, 62, 127, 83, 63};
   }

   private static byte[] uysynriabcyqapi() {
      return new byte[0];
   }

   private static byte[] wbftlqvvsgreigs() {
      return new byte[]{-23, -33, 19, 21, 18, 96, 24, 22};
   }

   private static byte[] dgellesqnviextq() {
      return new byte[]{
         -32,
         -42,
         19,
         24,
         17,
         96,
         23,
         30,
         25,
         52,
         26,
         120,
         57,
         55,
         86,
         39,
         108,
         2,
         59,
         74,
         5,
         23,
         43,
         73,
         15,
         41,
         114,
         24,
         66,
         117,
         76,
         97,
         119,
         42,
         52,
         126,
         108,
         67,
         76,
         35,
         89,
         90,
         21,
         10,
         40,
         124
      };
   }

   private static int ffekvepdgnvepmtm(int var0, int var1) {
      return var1 ^ var0;
   }
}
