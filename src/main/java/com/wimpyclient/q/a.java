package com.wimpyclient.q;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Locale;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a {
   public static final a INSTANCE;
   private final Path artPath;
   private volatile b state;
   private Process process;
   private BufferedWriter commandWriter;
   private volatile boolean stopped;
   private int restarts;
   private static int Lx3A4lO6CK;
   private transient int f6WL37TJUJ6;

   private a() {
super();
      int var11 = 1736321660 ^ 2084509513;
      
      var11 = yyvgsdbzcnndjuzb(var11, 1112677170);
      var11 = 1332330466 ^ 52697857 ^ Integer.parseInt("358515428");
      this.f6WL37TJUJ6 = 1674391048 ^ Lx3A4lO6CK;
      var11 = yyvgsdbzcnndjuzb(var11, 2028927661);
      FabricLoader var2 = FabricLoader.getInstance();
      Path var6 = var2.getConfigDir();
      String var3 = "wimpyclient_art.img";
      Path var7 = var6.resolve(var3);
      this.artPath = var7;
      b var8 = b.INACTIVE;
      this.state = var8;
   }

   public b state() {
      int var5 = 975067787 ^ 1906556886 ^ 881388406;
      var5 = 316716470 ^ var5;
      return this.state;
   }

   public Path artPath() {
      int var5 = 290213124 ^ 1804671437 ^ 881388406;
      var5 = 665791989 ^ var5;
      return this.artPath;
   }

   public void start() {
      int var20 = 155223616 ^ 821795880 ^ 881388406;
      var20 = 697271875 ^ var20;
      String var1 = emlnablqdw(crxgbwwqsxwkple(), lywkdedjkqbzvzq(), var20);
      String var2 = emlnablqdw(elffisymrpavakz(), lywkdedjkqbzvzq(), var20);
      String var6 = System.getProperty(var1, var2);
      Locale var13 = Locale.ROOT;
      String var7 = var6.toLowerCase(var13);
      String var14 = emlnablqdw(wkqhdeyokommshj(), lywkdedjkqbzvzq(), var20);
      byte var8 = (byte)((var7.contains(var14)) ? 1 : 0);
      if (var8 == (616331101 ^ var20)) {
         var20 = 682686316 ^ var20;
         Logger var12 = com.wimpyclient.Wimpy.LOGGER;
         String var16 = emlnablqdw(eiwibmideysigmm(), lywkdedjkqbzvzq(), var20);
         var12.info(var16);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
               case 120390648:
                  var20 ^= 359157795;
               case 1701464449:
                  Runnable var17 = this::runBridge;
                  String var4 = emlnablqdw(sbbmdclqpdsdswv(), lywkdedjkqbzvzq(), var20);
                  Thread var9 = new Thread(var17, var4);
                  byte var15 = (byte)(835987327 ^ var20);
                  var9.setDaemon((var15 != 0));
                  var9.start();
                  return;
               case 353120891:
               default:
                  throw new RuntimeException(new IOException());
               case 1939773851:
            }
         }
      }
   }

   public synchronized void stop() {
      int var9 = 1766402524 ^ 1439781712 ^ 881388406;
      var9 = 639016015 ^ var9;
      byte var2 = (byte)(772148660 ^ var9);
      this.stopped = (var2 != 0);
      Process var4 = this.process;
      if (var4 != null) {
         var9 = 2141798224 ^ var9;
         Process var6 = this.process;
         var6.destroy();
         var9 = 1630189967 ^ var9;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var9)) {
               case 153851016:
                  var9 = 511936223 ^ var9;
                  return;
               case 1381494187:
                  return;
               case 1986547544:
                  break;
               case 2060870823:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   private void runBridge() {
      int var94 = 894859098 ^ (185031797 ^ 881388406);
      var94 = 797381614 ^ var94;

      while (true) {
         if (this.stopped != ((626971575 ^ var94) != 0)) {
            var94 = 782106542 ^ var94;
            return;
         }

         var94 = 1302371136 ^ var94;
         if (this.restarts >= (byte)(1761495283 ^ var94)) {
            var94 = 1664967918 ^ var94;
            return;
         }

         var94 = 1986204408 ^ var94;
         try {
            Path var7 = this.extractScript();
            String[] var58 = new String[(byte)(513628679 ^ var94)];
            var58[(byte)(513628687 ^ var94)] = emlnablqdw(pilhtfijaxwxusf(), lywkdedjkqbzvzq(), var94);
            var58[(byte)(513628686 ^ var94)] = emlnablqdw(nkatxhuktiqmlgr(), lywkdedjkqbzvzq(), var94);
            var58[(byte)(513628685 ^ var94)] = emlnablqdw(obsqntqfuemubjc(), lywkdedjkqbzvzq(), var94);
            var58[(byte)(513628684 ^ var94)] = emlnablqdw(phylfayidmkehze(), lywkdedjkqbzvzq(), var94);
            var58[(byte)(513628683 ^ var94)] = emlnablqdw(weyqwttkbnajmtl(), lywkdedjkqbzvzq(), var94);
            var58[(byte)(513628682 ^ var94)] = emlnablqdw(djdxzemmrnmdoib(), lywkdedjkqbzvzq(), var94);
            var58[(byte)(513628681 ^ var94)] = var7.toString();
            var58[(byte)(513628680 ^ var94)] = this.artPath.toString();
            ProcessBuilder var17 = new ProcessBuilder(var58);
            ProcessBuilder var18 = var17;
            var18.redirectErrorStream((byte)(513628687 ^ var94) != 0);
            synchronized (this) {
               var94 = 1958917282 ^ var94;
               if (this.stopped != ((1784671917 ^ var94) != 0)) {
                  return;
               }

               var94 = yyvgsdbzcnndjuzb(var94, 911767367);
               Process var53 = var17.start();
               this.process = var53;
               OutputStreamWriter var63 = new OutputStreamWriter(this.process.getOutputStream(), StandardCharsets.UTF_8);
               BufferedWriter var54 = new BufferedWriter(var63);
               this.commandWriter = var54;
            }

            var94 = 2007218615 ^ var94;
            var94 = yyvgsdbzcnndjuzb(var94, 1512215742);
            try (BufferedReader var89 = new BufferedReader(new InputStreamReader(this.process.getInputStream(), StandardCharsets.UTF_8))) {
               var94 = 1878147567 ^ var94;

               String var36;
               while ((var36 = var89.readLine()) != null) {
                  var94 = 1253564655 ^ var94;
                  String var56 = var36.trim();
                  this.parseLine(var56);
                  var94 = yyvgsdbzcnndjuzb(var94, 1253564655);
               }

               var94 = yyvgsdbzcnndjuzb(var94, 2104165622);
            }

            var94 = yyvgsdbzcnndjuzb(var94, 1247955199);
            Process var39 = this.process;
            int var40 = var39.waitFor();
            var94 = 1233361171 ^ var94;
            var94 = 428005007 ^ var94;
            b var49 = b.INACTIVE;
            this.state = var49;
            int var50 = this.restarts;
            byte var61 = (byte)(2038232728 ^ var94);
            this.restarts = var50 + var61;
            // compiled handler topology verified: every exception path repairs to state
            // 1819099317 before the warn decrypt and 2038232729 at the INACTIVE block;
            // catch constant below is that converged key.
         } catch (Exception var27) {
            var94 = 1819099317;
            String var48 = emlnablqdw(jgelbtozgpbznoh(), lywkdedjkqbzvzq(), var94);
            Logger var28 = com.wimpyclient.Wimpy.LOGGER;
            String var60 = var27.toString();
            var28.warn(var48, var60);
            var94 = 353482284 ^ var94;
            b var49 = b.INACTIVE;
            this.state = var49;
            int var50 = this.restarts;
            byte var61 = (byte)(2038232728 ^ var94);
            this.restarts = var50 + var61;
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var94)) {
               case 190997684:
                  var94 = 1545741614 ^ var94;
                  break;
               default:
                  throw new RuntimeException("Error in hash");
            }
         }

         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var94)) {
            case 190997684:
               var94 = 1545741614 ^ var94;
               break;
            default:
               throw new RuntimeException("Error in hash");
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private Path extractScript() throws Exception {
      int var40 = 1514512895 ^ 1988984543 ^ 881388406;
      var40 = 1215980595 ^ var40;
      FabricLoader var1 = FabricLoader.getInstance();
      Path var9 = var1.getConfigDir();
      byte var2 = (byte)(1345998949 ^ var40);
      FileAttribute[] var30 = new FileAttribute[var2];
      Path var11 = Files.createDirectories(var9, var30);
      String var31 = emlnablqdw(uhtspqlrxjqqszp(), lywkdedjkqbzvzq(), var40);
      Path var13 = var9.resolve(var31);
      Path var5 = var13;
      Class<a> var14 = a.class;
      ClassLoader var15 = var14.getClassLoader();
      String var32 = emlnablqdw(kwobncoemjuvjjs(), lywkdedjkqbzvzq(), var40);
      InputStream var16 = var15.getResourceAsStream(var32);
      InputStream var6 = var16;
      var40 = 37251508 ^ var40;

      label110: {
         Throwable var10000;
         label98: {
            label97: {
               label96: {
                  label111: {
                     try {
                        if (var6 == null) {
                           var40 ^= 1057978137;
                           String var3 = emlnablqdw(jxznqqqdtbxtaam(), lywkdedjkqbzvzq(), var40);
                           IllegalStateException var18 = new IllegalStateException(var3);
                           throw new RuntimeException(var18);
                        }
                     } catch (Throwable var43) {
                        var10000 = var43;
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var40)) {
                           case -1877881206:
                              break label111;
                           case 1737016865:
                              break label97;
                           case 1751807555:
                              break label96;
                           default:
                              throw new RuntimeException("Error in hash");
                        }
                     }

                     label75:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                           case 249823750:
                              var40 ^= 2129862933;
                              break label75;
                           case 288717201:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1846576565:
                              break label75;
                           case 2045106191:
                        }
                     }

                     try {
                        byte[] var35 = var6.readAllBytes();
                        byte var36 = (byte)(753998020 ^ var40);
                        OpenOption[] var37 = new OpenOption[var36];
                        Path var26 = Files.write(var5, var35, var37);
                        var40 ^= 518994131;
                        break label110;
                     } catch (Throwable var42) {
                        var10000 = var42;
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var40)) {
                           case -1877881206:
                              break;
                           case 1737016865:
                              break label97;
                           case 1751807555:
                              break label96;
                           default:
                              throw new RuntimeException("Error in hash");
                        }
                     }
                  }

                  var40 = yyvgsdbzcnndjuzb(var40, 93228117);
                  break label98;
               }

               var40 = yyvgsdbzcnndjuzb(var40, 981597004);
               break label98;
            }

            var40 = 2071833920 ^ var40;
         }

         Throwable var19 = var10000;
         if (var16 != null) {
            var40 = 1884375999 ^ var40;

            try {
               var6.close();
               var40 ^= 1417913946;
            } catch (Throwable var41) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var40)) {
                  case 1055912409:
                     var40 = 259419325 ^ var40;
                     var19.addSuppressed(var41);
                     var40 = 1060347383 ^ var40;
                     throw new RuntimeException(var19);
                  default:
                     throw new RuntimeException(new IllegalAccessException("Error in hash"));
               }
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                  case 260487269:
                     var40 = 1690720016 ^ var40;
                     throw new RuntimeException(var19);
                  case 1663416285:
                     throw new RuntimeException(var19);
                  case 1996789948:
                  default:
                     throw new RuntimeException(new IOException());
                  case 2065561915:
               }
            }
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
               case 161531939:
                  var40 = 1075100405 ^ var40;
                  throw new RuntimeException(var19);
               case 1468162053:
                  throw new RuntimeException(var19);
               case 1588821255:
               default:
                  throw new RuntimeException(new IOException());
               case 1861503037:
            }
         }
      }

      if (var16 != null) {
         var40 = 974303455 ^ var40;
         var16.close();
         var40 = yyvgsdbzcnndjuzb(var40, 1484155361);
      } else {
         var40 = yyvgsdbzcnndjuzb(var40, 1650776382);
      }

      return var13;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private void parseLine(String var1) {
      int var73 = 1669592705 ^ 1488612096 ^ 881388406;
      var73 = 1489940616 ^ var73;
      byte var17 = (byte)((var1.isEmpty()) ? 1 : 0);
      if (var17 == (1467991679 ^ var73)) {
         var73 = 1352648288 ^ var73;
         String var3 = emlnablqdw(huysoewqavichwi(), lywkdedjkqbzvzq(), var73);
         byte var19 = (byte)((var1.startsWith(var3)) ? 1 : 0);
         if (var19 != (132120607 ^ var73)) {
            var73 = yyvgsdbzcnndjuzb(var73, 51500967);

            label330: {
               label297: {
                  JsonObject var16;
                  label283: {
                     label282: {
                        label281: {
                           label280: {
                              label279: {
                                 try {
                                    JsonElement var21 = JsonParser.parseString(var1);
                                    JsonObject var22 = var21.getAsJsonObject();
                                    var16 = var22;
                                    String var31 = emlnablqdw(djvxgnipprpjgpi(), lywkdedjkqbzvzq(), var73);
                                    byte var24 = (byte)((var22.has(var31)) ? 1 : 0);
                                    if (var24 != (82958264 ^ var73)) {
                                       var73 ^= 94256639;
                                       String var32 = emlnablqdw(evlegjbemetgbxw(), lywkdedjkqbzvzq(), var73);
                                       JsonElement var26 = var22.get(var32);
                                       byte var27 = (byte)((var26.getAsBoolean()) ? 1 : 0);
                                       if (var27 != (24111687 ^ var73)) {
                                          break label283;
                                       }

                                       var73 ^= 1592731121;
                                       break label279;
                                    }
                                 } catch (Exception var82) {
                                    switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var73)) {
                                       case -66683470:
                                          break label281;
                                       case 192893496:
                                          break label282;
                                       case 663666112:
                                          break label280;
                                       default:
                                          throw new RuntimeException(new IOException("Error in hash"));
                                    }
                                 }

                                 var73 ^= 1534138382;
                              }

                              try {
                                 b var34 = b.INACTIVE;
                                 this.state = var34;
                                 var73 ^= 1841526614;
                                 return;
                              } catch (Exception var81) {
                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var73)) {
                                    case -66683470:
                                       break label281;
                                    case 192893496:
                                       break label282;
                                    case 663666112:
                                       break;
                                    default:
                                       throw new RuntimeException(new IOException("Error in hash"));
                                 }
                              }
                           }

                           var73 = 200018486 ^ var73;
                           break label297;
                        }

                        var73 = 1352471096 ^ var73;
                        break label297;
                     }

                     var73 = 242366409 ^ var73;
                     break label297;
                  }

                  var73 = 1472388312 ^ var73;

                  label252: {
                     label251: {
                        label250: {
                           label249: {
                              label248: {
                                 label247: {
                                    label246: {
                                       label245: {
                                          label244: {
                                             label243: {
                                                label242: {
                                                   label299: {
                                                      byte var4;
                                                      a var28;
                                                      b var33;
                                                      String var36;
                                                      String var39;
                                                      long var42;
                                                      long var45;
                                                      boolean var48;
                                                      byte var54;
                                                      label240: {
                                                         label239: {
                                                            label238: {
                                                               label237: {
                                                                  try {
                                                                     var28 = this;
                                                                     var73 ^= 327294668;
                                                                     var4 = (byte)(1160718418 ^ var73);
                                                                     String var6 = emlnablqdw(dndcwgcroxmfnrk(), lywkdedjkqbzvzq(), var73);
                                                                     JsonElement var35 = var16.get(var6);
                                                                     var36 = var35.getAsString();
                                                                     String var7 = emlnablqdw(qkdmkanmtlzajrg(), lywkdedjkqbzvzq(), var73);
                                                                     JsonElement var38 = var16.get(var7);
                                                                     var39 = var38.getAsString();
                                                                     String var8 = emlnablqdw(caoaumpmskkmcgn(), lywkdedjkqbzvzq(), var73);
                                                                     JsonElement var41 = var16.get(var8);
                                                                     var42 = var41.getAsLong();
                                                                     String var10 = emlnablqdw(jhvcaralwnwwhtn(), lywkdedjkqbzvzq(), var73);
                                                                     JsonElement var44 = var16.get(var10);
                                                                     var45 = var44.getAsLong();
                                                                     String var12 = emlnablqdw(fpegdjvdeqqjlol(), lywkdedjkqbzvzq(), var73);
                                                                     JsonElement var47 = var16.get(var12);
                                                                     var48 = var47.getAsBoolean();
                                                                     String var13 = emlnablqdw(nbatwqfweqqiolj(), lywkdedjkqbzvzq(), var73);
                                                                     byte var50 = (byte)((var16.has(var13)) ? 1 : 0);
                                                                     if (var50 != (1160718419 ^ var73)) {
                                                                        var73 ^= 1346497745;
                                                                        String var55 = emlnablqdw(ukpxvkzvajzvloc(), lywkdedjkqbzvzq(), var73);
                                                                        JsonElement var52 = var16.get(var55);
                                                                        byte var53 = (byte)((var52.getAsBoolean()) ? 1 : 0);
                                                                        if (var53 == (359580802 ^ var73)) {
                                                                           break label237;
                                                                        }

                                                                        var73 ^= 1446299026;
                                                                        var54 = (byte)(1129971985 ^ var73);
                                                                        break label238;
                                                                     }
                                                                  } catch (Exception var80) {
                                                                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var73)) {
                                                                        case -1457496605:
                                                                           break label248;
                                                                        case -1418320880:
                                                                           break label250;
                                                                        case -1251363590:
                                                                           break label245;
                                                                        case -1239902190:
                                                                           break label244;
                                                                        case -287296064:
                                                                           break label252;
                                                                        case -174085925:
                                                                           break label249;
                                                                        case -93339806:
                                                                           break label251;
                                                                        case 129101017:
                                                                           break label299;
                                                                        case 449841282:
                                                                           break label242;
                                                                        case 695812762:
                                                                           break label247;
                                                                        case 780428130:
                                                                           break label246;
                                                                        case 1756669890:
                                                                           break label243;
                                                                        default:
                                                                           throw new RuntimeException(new IOException("Error in hash"));
                                                                     }
                                                                  }

                                                                  var73 ^= 16753727;
                                                                  break label239;
                                                               }

                                                               var73 ^= 1354647790;
                                                               break label239;
                                                            }

                                                            while (true) {
                                                               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var73)) {
                                                                  case 41820501:
                                                                     var73 ^= 239900136;
                                                                     break label240;
                                                                  case 96628925:
                                                                     break;
                                                                  case 133636574:
                                                                     break label240;
                                                                  case 475451720:
                                                                  default:
                                                                     throw new RuntimeException(new IOException());
                                                               }
                                                            }
                                                         }

                                                         try {
                                                            var54 = (byte)(1171295340 ^ var73);
                                                            var73 ^= 147200148;
                                                         } catch (Exception var79) {
                                                            switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var73)) {
                                                               case -1457496605:
                                                                  break label248;
                                                               case -1418320880:
                                                                  break label250;
                                                               case -1251363590:
                                                                  break label245;
                                                               case -1239902190:
                                                                  break label244;
                                                               case -287296064:
                                                                  break label252;
                                                               case -174085925:
                                                                  break label249;
                                                               case -93339806:
                                                                  break label251;
                                                               case 129101017:
                                                                  break label299;
                                                               case 449841282:
                                                                  break label242;
                                                               case 695812762:
                                                                  break label247;
                                                               case 780428130:
                                                                  break label246;
                                                               case 1756669890:
                                                                  break label243;
                                                               default:
                                                                  throw new RuntimeException(new IOException("Error in hash"));
                                                            }
                                                         }
                                                      }

                                                      int var60;
                                                      label217: {
                                                         label301: {
                                                            try {
                                                               String var14 = emlnablqdw(buqogqnewkxtxmk(), lywkdedjkqbzvzq(), var73);
                                                               byte var57 = (byte)((var16.has(var14)) ? 1 : 0);
                                                               if (var57 != (1293325560 ^ var73)) {
                                                                  var73 ^= 1355452992;
                                                                  String var61 = emlnablqdw(txbnqlqfweytfvn(), lywkdedjkqbzvzq(), var73);
                                                                  JsonElement var59 = var16.get(var61);
                                                                  var60 = var59.getAsInt();
                                                                  break label301;
                                                               }
                                                            } catch (Exception var78) {
                                                               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var73)) {
                                                                  case -1457496605:
                                                                     break label248;
                                                                  case -1418320880:
                                                                     break label250;
                                                                  case -1251363590:
                                                                     break label245;
                                                                  case -1239902190:
                                                                     break label244;
                                                                  case -287296064:
                                                                     break label252;
                                                                  case -174085925:
                                                                     break label249;
                                                                  case -93339806:
                                                                     break label251;
                                                                  case 129101017:
                                                                     break label299;
                                                                  case 449841282:
                                                                     break label242;
                                                                  case 695812762:
                                                                     break label247;
                                                                  case 780428130:
                                                                     break label246;
                                                                  case 1756669890:
                                                                     break label243;
                                                                  default:
                                                                     throw new RuntimeException(new IOException("Error in hash"));
                                                               }
                                                            }

                                                            label208:
                                                            while (true) {
                                                               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var73)) {
                                                                  case 89886134:
                                                                     var73 ^= 307979028;
                                                                     break label208;
                                                                  case 732880746:
                                                                     break;
                                                                  case 1311096074:
                                                                  default:
                                                                     throw new RuntimeException(new IOException());
                                                                  case 1597665328:
                                                                     break label208;
                                                               }
                                                            }

                                                            try {
                                                               var60 = (byte)(1598945260 ^ var73);
                                                               var73 ^= 711588944;
                                                               break label217;
                                                            } catch (Exception var77) {
                                                               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var73)) {
                                                                  case -1457496605:
                                                                     break label248;
                                                                  case -1418320880:
                                                                     break label250;
                                                                  case -1251363590:
                                                                     break label245;
                                                                  case -1239902190:
                                                                     break label244;
                                                                  case -287296064:
                                                                     break label252;
                                                                  case -174085925:
                                                                     break label249;
                                                                  case -93339806:
                                                                     break label251;
                                                                  case 129101017:
                                                                     break label299;
                                                                  case 449841282:
                                                                     break label242;
                                                                  case 695812762:
                                                                     break label247;
                                                                  case 780428130:
                                                                     break label246;
                                                                  case 1756669890:
                                                                     break label243;
                                                                  default:
                                                                     throw new RuntimeException(new IOException("Error in hash"));
                                                               }
                                                            }
                                                         }

                                                         var73 = yyvgsdbzcnndjuzb(var73, 1761086724);
                                                      }

                                                      int var66;
                                                      label199: {
                                                         label302: {
                                                            try {
                                                               String var15 = emlnablqdw(jcowhdahaqdkbnx(), lywkdedjkqbzvzq(), var73);
                                                               byte var63 = (byte)((var16.has(var15)) ? 1 : 0);
                                                               if (var63 != (1965296572 ^ var73)) {
                                                                  var73 ^= 1439839783;
                                                                  String var69 = emlnablqdw(hpkddagcmclmqcp(), lywkdedjkqbzvzq(), var73);
                                                                  JsonElement var65 = var16.get(var69);
                                                                  var66 = var65.getAsInt();
                                                                  break label302;
                                                               }
                                                            } catch (Exception var76) {
                                                               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var73)) {
                                                                  case -1457496605:
                                                                     break label248;
                                                                  case -1418320880:
                                                                     break label250;
                                                                  case -1251363590:
                                                                     break label245;
                                                                  case -1239902190:
                                                                     break label244;
                                                                  case -287296064:
                                                                     break label252;
                                                                  case -174085925:
                                                                     break label249;
                                                                  case -93339806:
                                                                     break label251;
                                                                  case 129101017:
                                                                     break label299;
                                                                  case 449841282:
                                                                     break label242;
                                                                  case 695812762:
                                                                     break label247;
                                                                  case 780428130:
                                                                     break label246;
                                                                  case 1756669890:
                                                                     break label243;
                                                                  default:
                                                                     throw new RuntimeException(new IOException("Error in hash"));
                                                               }
                                                            }

                                                            var73 ^= 602347710;

                                                            try {
                                                               var66 = (byte)(-1455624963 ^ var73);
                                                               var73 ^= 678487577;
                                                               break label199;
                                                            } catch (Exception var75) {
                                                               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var73)) {
                                                                  case -1457496605:
                                                                     break label248;
                                                                  case -1418320880:
                                                                     break label250;
                                                                  case -1251363590:
                                                                     break label245;
                                                                  case -1239902190:
                                                                     break label244;
                                                                  case -287296064:
                                                                     break label252;
                                                                  case -174085925:
                                                                     break label249;
                                                                  case -93339806:
                                                                     break label251;
                                                                  case 129101017:
                                                                     break label299;
                                                                  case 449841282:
                                                                     break label242;
                                                                  case 695812762:
                                                                     break label247;
                                                                  case 780428130:
                                                                     break label246;
                                                                  case 1756669890:
                                                                     break label243;
                                                                  default:
                                                                     throw new RuntimeException(new IOException("Error in hash"));
                                                               }
                                                            }
                                                         }

                                                         var73 ^= 1581631616;
                                                      }

                                                      try {
                                                         long var67 = System.nanoTime();
                                                         var33 = new b(var4 != 0, var36, var39, var42, var45, var48, var54 != 0, var60, var66, var67);
                                                         var28.state = var33;
                                                         var73 ^= 606847416;
                                                         break label330;
                                                      } catch (Exception var74) {
                                                         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var73)) {
                                                            case -1457496605:
                                                               break label248;
                                                            case -1418320880:
                                                               break label250;
                                                            case -1251363590:
                                                               break label245;
                                                            case -1239902190:
                                                               break label244;
                                                            case -287296064:
                                                               break label252;
                                                            case -174085925:
                                                               break label249;
                                                            case -93339806:
                                                               break label251;
                                                            case 129101017:
                                                               break;
                                                            case 449841282:
                                                               break label242;
                                                            case 695812762:
                                                               break label247;
                                                            case 780428130:
                                                               break label246;
                                                            case 1756669890:
                                                               break label243;
                                                            default:
                                                               throw new RuntimeException(new IOException("Error in hash"));
                                                         }
                                                      }
                                                   }

                                                   var73 = 803987477 ^ var73;
                                                   break label297;
                                                }

                                                var73 = yyvgsdbzcnndjuzb(var73, 1279777950);
                                                break label297;
                                             }

                                             var73 = 1108035958 ^ var73;
                                             break label297;
                                          }

                                          var73 = 1507774092 ^ var73;
                                          break label297;
                                       }

                                       var73 = 1504766737 ^ var73;
                                       break label297;
                                    }

                                    var73 = 1254969826 ^ var73;
                                    break label297;
                                 }

                                 var73 = yyvgsdbzcnndjuzb(var73, 1244853725);
                                 break label297;
                              }

                              var73 = yyvgsdbzcnndjuzb(var73, 2050610738);
                              break label297;
                           }

                           var73 = 1907239061 ^ var73;
                           break label297;
                        }

                        var73 = 443750668 ^ var73;
                        break label297;
                     }

                     var73 = 1347431010 ^ var73;
                     break label297;
                  }

                  var73 = 314694454 ^ var73;
               }

               var73 = 1227319714 ^ var73;
               return;
            }

            var73 = yyvgsdbzcnndjuzb(var73, 480411791);
            return;
         }

         var73 = 44230202 ^ var73;
      } else {
         var73 = 1379737690 ^ var73;
      }
   }

   private synchronized void send(String var1) {
      int var19 = 295384242 ^ 908065153 ^ 881388406;
      var19 = 1503638301 ^ var19;
      BufferedWriter var6 = this.commandWriter;
      if (var6 == null) {
         var19 = 715517389 ^ var19;
      } else {
         var19 = 1883876178 ^ var19;

         try {
            BufferedWriter var8 = this.commandWriter;
            var8.write(var1);
            BufferedWriter var10 = this.commandWriter;
            var10.newLine();
            BufferedWriter var12 = this.commandWriter;
            var12.flush();
            var19 ^= 387393214;
         } catch (Exception var20) {
            switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var19)) {
               case -690884527:
                  var19 = yyvgsdbzcnndjuzb(var19, 1474037794);
                  Logger var14 = com.wimpyclient.Wimpy.LOGGER;
                  String var15 = emlnablqdw(loitgzgwozwubpu(), lywkdedjkqbzvzq(), var19);
                  String var16 = var20.toString();
                  var14.warn(var15, var16);
                  var19 = 1620378684 ^ var19;
                  return;
               default:
                  throw new RuntimeException("Error in hash");
            }
         }

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
               case 146633233:
                  var19 = 543042208 ^ var19;
                  return;
               case 1335702390:
               default:
                  throw new IllegalStateException();
               case 1715416605:
                  return;
               case 2053256602:
            }
         }
      }
   }

   public void next() {
      int var5 = 1150413201 ^ 200750929 ^ 881388406;
      var5 = 1574882450 ^ var5;
      String var2 = emlnablqdw(qplryezugayxokv(), lywkdedjkqbzvzq(), var5);
      this.send(var2);
   }

   public void previous() {
      int var5 = 786208518 ^ 762026839 ^ 881388406;
      var5 = 695153187 ^ var5;
      String var2 = emlnablqdw(ojddtkcsemvprle(), lywkdedjkqbzvzq(), var5);
      this.send(var2);
   }

   public void togglePlay() {
      int var5 = 440929250 ^ 1546449477 ^ 881388406;
      var5 = 1498694511 ^ var5;
      String var2 = emlnablqdw(nkfsgwdnmwwmzen(), lywkdedjkqbzvzq(), var5);
      this.send(var2);
   }

   public void seekTo(long var1) {
      int var40 = 160554088 ^ 1684300322 ^ 881388406;
      var40 = 883679006 ^ var40;
      long var4 = 0L;
      long var25 = Math.max(var4, var1);
      String var27 = "SEEK " + var25;
      this.send(var27);
      b var21 = this.state;
      byte var23 = (byte)((var21.active()) ? 1 : 0);
      if (var23 != (1842776610 ^ var40)) {
         var40 = 759070604 ^ var40;
         byte var29 = (byte)(1089009071 ^ var40);
         String var30 = var21.title();
         String var31 = var21.artist();
         long var32 = var21.durMs();
         boolean var34 = var21.playing();
         boolean var35 = var21.canSeek();
         int var36 = var21.artVersion();
         int var37 = var21.volume();
         long var17 = System.nanoTime();
         b var28 = new b((var29 != 0), var30, var31, var1, var32, var34, var35, var36, var37, var17);
         this.state = var28;
         var40 = 268692537 ^ var40;
      } else {
         var40 = yyvgsdbzcnndjuzb(var40, 1027445685);
      }
   }

   public void setVolume(int var1) {
      int var41 = 1482034786 ^ 573967259 ^ 881388406;
      var41 = 1392189968 ^ var41;
      long var17 = var1;
      byte var4 = (byte)(471059615 ^ var41);
      byte var5 = (byte)(471059707 ^ var41);
      int var19 = Math.clamp(var17, (int)var4, (int)var5);
      String var26 = "VOLUME " + var19;
      this.send(var26);
      b var22 = this.state;
      byte var24 = (byte)((var22.active()) ? 1 : 0);
      if (var24 != (471059615 ^ var41)) {
         var41 = 302818828 ^ var41;
         byte var28 = (byte)(236939922 ^ var41);
         String var29 = var22.title();
         String var30 = var22.artist();
         long var31 = var22.posMs();
         long var33 = var22.durMs();
         boolean var35 = var22.playing();
         boolean var36 = var22.canSeek();
         int var37 = var22.artVersion();
         long var38 = var22.receivedNanos();
         b var27 = new b((var28 != 0), var29, var30, var31, var33, var35, var36, var37, var19, var38);
         this.state = var27;
         var41 = 1128540687 ^ var41;
      } else {
         var41 = yyvgsdbzcnndjuzb(var41, 1363708931);
      }
   }

   static {
      int var6 = 650165380 ^ 927748517 ^ Integer.parseInt("358515428");
      int var3 = new Random(-2742506557117450173L).nextInt();
      Lx3A4lO6CK = 1157340684 ^ var3;
      var6 = 1817230859 ^ var6;
      a var0 = new a();
      INSTANCE = var0;
   }

   public static String emlnablqdw(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] lywkdedjkqbzvzq() {
      return new byte[]{
         103,
         99,
         96,
         53,
         65,
         91,
         45,
         35,
         102,
         116,
         116,
         21,
         2,
         96,
         117,
         126,
         43,
         92,
         7,
         49,
         26,
         71,
         39,
         52,
         67,
         18,
         109,
         38,
         37,
         113,
         55,
         78,
         104,
         100,
         17,
         19,
         29,
         2,
         125,
         27,
         50,
         72,
         20,
         121,
         97,
         4,
         27,
         81,
         56,
         66,
         84,
         112,
         7,
         106,
         63,
         125,
         22,
         78,
         111,
         101,
         23,
         61,
         34,
         88,
         48,
         96,
         58,
         10,
         2,
         105,
         107,
         111,
         11,
         61,
         111,
         122,
         102,
         39,
         38,
         44,
         47,
         15,
         39,
         86,
         30,
         65,
         114,
         112,
         111,
         44,
         58,
         127,
         86,
         37,
         29,
         52,
         29,
         113,
         124,
         107,
         126,
         50,
         88,
         5,
         105,
         2,
         124,
         108,
         115,
         53,
         97,
         92,
         84,
         54,
         58,
         9,
         121,
         50,
         38,
         58,
         41
      };
   }

   private static byte[] crxgbwwqsxwkple() {
      return new byte[]{-81, -83, 86, 105, 114, 25, 28, 61, 87, 44, 69, 66, 49, 62, 68, 42};
   }

   private static byte[] elffisymrpavakz() {
      return new byte[0];
   }

   private static byte[] wkqhdeyokommshj() {
      return new byte[]{-81, -83, 86, 113, 114, 3, 28, 125};
   }

   private static byte[] sbbmdclqpdsdswv() {
      return new byte[]{
         -95,
         -81,
         85,
         123,
         121,
         5,
         30,
         124,
         80,
         60,
         71,
         89,
         59,
         117,
         66,
         62,
         25,
         26,
         63,
         109,
         47,
         10,
         31,
         106,
         112,
         70,
         91,
         103,
         22,
         105,
         14,
         20,
         95,
         37,
         35,
         76,
         37,
         85,
         72,
         69,
         10,
         26
      };
   }

   private static byte[] eiwibmideysigmm() {
      return new byte[]{
         -85,
         -84,
         82,
         87,
         117,
         30,
         21,
         120,
         87,
         50,
         68,
         78,
         51,
         50,
         64,
         63,
         31,
         77,
         53,
         73,
         40,
         35,
         19,
         69,
         123,
         6,
         92,
         118,
         21,
         49,
         6,
         19,
         93,
         56,
         37,
         69,
         47,
         87,
         79,
         10,
         6,
         25,
         44,
         36,
         80,
         69,
         43,
         2,
         9,
         20,
         97,
         36,
         51,
         62,
         13,
         41,
         36,
         95,
         91,
         120,
         47,
         103,
         19,
         5,
         0,
         38,
         11,
         30,
         55,
         6,
         95,
         55,
         57,
         99,
         93,
         47,
         82,
         125,
         30,
         111,
         30,
         78,
         23,
         77
      };
   }

   private static byte[] pilhtfijaxwxusf() {
      return new byte[]{-84, -83, 83, 115, 115, 12, 27, 108, 81, 36, 69, 84, 52, 33, 77, 32, 19, 14, 50, 108, 41, 29, 21, 34, 117, 79, 90, 107, 20, 39};
   }

   private static byte[] nkatxhuktiqmlgr() {
      return new byte[]{-84, -83, 83, 46, 115, 45, 27, 116, 81, 17, 69, 84, 52, 61, 77, 46, 19, 2, 50, 108, 41, 20};
   }

   private static byte[] obsqntqfuemubjc() {
      return new byte[]{-84, -83, 83, 46, 115, 45, 27, 116, 81, 47, 69, 111, 52, 60, 77, 60, 19, 14, 50, 114, 41, 16, 21, 111, 117, 94, 90, 122, 20, 52, 1, 25};
   }

   private static byte[] phylfayidmkehze() {
      return new byte[]{
         -84, -83, 83, 46, 115, 38, 27, 99, 81, 36, 69, 69, 52, 39, 77, 60, 19, 2, 50, 111, 41, 31, 21, 92, 117, 69, 90, 127, 20, 43, 1, 31, 80, 43
      };
   }

   private static byte[] weyqwttkbnajmtl() {
      return new byte[]{-84, -83, 83, 65, 115, 26, 27, 107, 81, 32, 69, 85, 52, 33};
   }

   private static byte[] djdxzemmrnmdoib() {
      return new byte[]{-84, -83, 83, 46, 115, 37, 27, 114, 81, 45, 69, 67};
   }

   private static byte[] jgelbtozgpbznoh() {
      return new byte[]{
         -88,
         -92,
         81,
         95,
         113,
         18,
         20,
         127,
         87,
         55,
         69,
         68,
         51,
         63,
         69,
         62,
         18,
         79,
         54,
         100,
         43,
         13,
         22,
         100,
         115,
         79,
         84,
         114,
         20,
         35,
         6,
         86,
         89,
         57,
         33,
         67,
         36,
         84,
         76,
         72,
         3,
         74,
         37,
         96,
         81,
         70,
         34,
         31
      };
   }

   private static byte[] jxznqqqdtbxtaam() {
      return new byte[]{
         -88,
         -92,
         82,
         110,
         116,
         17,
         21,
         124,
         94,
         32,
         69,
         74,
         48,
         60,
         64,
         102,
         19,
         25,
         63,
         98,
         43,
         13,
         21,
         100,
         118,
         90,
         85,
         100,
         29,
         97,
         6,
         27,
         90,
         52,
         36,
         88,
         37,
         71,
         69,
         66,
         3,
         30,
         38,
         39,
         84,
         28,
         35,
         1,
         0,
         0,
         101,
         39,
         53,
         62,
         10,
         101,
         46,
         21,
         87,
         58,
         38,
         97,
         16,
         65,
         5,
         42,
         2,
         89,
         58,
         42,
         90,
         56,
         57,
         113,
         90,
         48,
         94,
         114,
         30,
         121,
         30,
         68
      };
   }

   private static byte[] uhtspqlrxjqqszp() {
      return new byte[]{
         -88,
         -81,
         84,
         119,
         120,
         11,
         21,
         119,
         82,
         61,
         69,
         95,
         54,
         54,
         76,
         43,
         19,
         12,
         51,
         109,
         43,
         26,
         19,
         117,
         122,
         116,
         85,
         108,
         17,
         37,
         6,
         9,
         92,
         50,
         40,
         117,
         37,
         89,
         73,
         80,
         3,
         18,
         32,
         40,
         88,
         90,
         35,
         13,
         12,
         85,
         101,
         51,
         51,
         44,
         6,
         117
      };
   }

   private static byte[] kwobncoemjuvjjs() {
      return new byte[]{
         -88,
         -81,
         84,
         97,
         120,
         17,
         21,
         105,
         82,
         40,
         69,
         82,
         54,
         38,
         76,
         104,
         19,
         18,
         51,
         97,
         43,
         25,
         19,
         113,
         122,
         82,
         85,
         124,
         17,
         36,
         6,
         20,
         92,
         52,
         40,
         68,
         37,
         79,
         73,
         13,
         3,
         8,
         32,
         60,
         88,
         82,
         35,
         28,
         12,
         18,
         101,
         37,
         51,
         38,
         6,
         107,
         46,
         4,
         91,
         49,
         38,
         122,
         22,
         14,
         9,
         6,
         2,
         81,
         54,
         34,
         90,
         53,
         63,
         108,
         86,
         36,
         94,
         123,
         18,
         59,
         30,
         76,
         19,
         16,
         39,
         73
      };
   }

   private static byte[] dndcwgcroxmfnrk() {
      return new byte[]{-88, -83, 86, 113, 118, 3, 21, 99, 87, 33, 69, 65};
   }

   private static byte[] qkdmkanmtlzajrg() {
      return new byte[]{-88, -83, 86, 100, 118, 24, 21, 99, 87, 36, 69, 87, 52, 36};
   }

   private static byte[] caoaumpmskkmcgn() {
      return new byte[]{-88, -83, 86, 117, 118, 5, 21, 100, 87, 0, 69, 87};
   }

   private static byte[] jhvcaralwnwwhtn() {
      return new byte[]{-88, -83, 86, 97, 118, 31, 21, 101, 87, 0, 69, 87};
   }

   private static byte[] fpegdjvdeqqjlol() {
      return new byte[]{-88, -83, 86, 117, 118, 6, 21, 118, 87, 52, 69, 77, 52, 62, 66, 40};
   }

   private static byte[] nbatwqfweqqiolj() {
      return new byte[]{-88, -83, 86, 102, 118, 11, 21, 121, 87, 30, 69, 65, 52, 53, 66, 36};
   }

   private static byte[] buqogqnewkxtxmk() {
      return new byte[]{-88, -82, 89, 103, 114, 27, 24, 98, 80, 18};
   }

   private static byte[] ukpxvkzvajzvloc() {
      return new byte[]{-86, -87, 89, 99, 121, 10, 21, 125, 84, 20, 65, 73, 55, 61, 69, 45};
   }

   private static byte[] jcowhdahaqdkbnx() {
      return new byte[]{-88, -91, 86, 118, 115, 13, 27, 122};
   }

   private static byte[] hpkddagcmclmqcp() {
      return new byte[]{-84, -87, 83, 115, 113, 12, 24, 124};
   }

   private static byte[] djvxgnipprpjgpi() {
      return new byte[]{-95, -82, 89, 97, 121, 10, 27, 99, 94, 47, 77, 86, 58, 55};
   }

   private static byte[] evlegjbemetgbxw() {
      return new byte[]{-85, -88, 81, 101, 112, 14, 21, 96, 84, 41, 69, 82, 51, 51};
   }

   private static byte[] huysoewqavichwi() {
      return new byte[]{-88, -81, 82, 127};
   }

   private static byte[] txbnqlqfweytfvn() {
      return new byte[]{-84, -84, 80, 109, 116, 17, 20, 103, 82, 23};
   }

   private static byte[] loitgzgwozwubpu() {
      return new byte[]{
         -88,
         -92,
         82,
         95,
         112,
         25,
         30,
         122,
         84,
         52,
         69,
         68,
         48,
         63,
         68,
         53,
         24,
         74,
         53,
         103,
         43,
         13,
         21,
         100,
         114,
         68,
         94,
         119,
         23,
         32,
         6,
         86,
         90,
         62,
         32,
         78,
         46,
         89,
         79,
         66,
         3,
         17,
         38,
         46,
         80,
         82,
         40,
         71,
         10,
         16,
         101,
         41,
         53,
         58,
         14,
         35,
         37,
         29,
         93,
         53,
         38,
         63,
         16,
         65,
         1,
         41,
         9,
         65
      };
   }

   private static byte[] qplryezugayxokv() {
      return new byte[]{-81, -88, 80, 76, 117, 45, 26, 74, 80, 22};
   }

   private static byte[] ojddtkcsemvprle() {
      return new byte[]{-84, -84, 88, 83, 112, 58, 21, 95, 84, 23};
   }

   private static byte[] nkfsgwdnmwwmzen() {
      return new byte[]{-82, -81, 83, 81, 120, 46, 21, 81, 94, 26, 71, 118, 54, 24, 76, 19, 24, 55, 48, 71};
   }

   private static int yyvgsdbzcnndjuzb(int var0, int var1) {
      return var1 ^ var0;
   }
}