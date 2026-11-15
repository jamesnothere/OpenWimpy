package com.wimpyclient.localauth;

import com.mojang.blaze3d.platform.InputConstants.Type;
import com.wimpyclient.bridge.BridgeGate;
import ivirzlaazbgesszx.equlxktebzrxiyte;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndTick;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.AllowChat;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.AllowCommand;
import net.fabricmc.fabric.api.event.Event;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping.Category;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.Identifier;

@Environment(EnvType.CLIENT)
public final class WimpyLoader implements ClientModInitializer {
   private static final Logger LOG;
   private static final AtomicBoolean CHECKING;
   private static volatile f loadingScreen;
   private static volatile WimpyLoader$a completion;
   private static volatile String pendingNotice;
   private static volatile boolean showLoading;
   private static volatile Screen resumeAfterLoad;
   private static long closeLoadingAt;
   private static boolean initialized;
   private static Object announcedWorld;
   private static int worldTicks;
   private static boolean promptedThisWorld;
   private static int LrE3zXpkti;
   private transient int YoXThTbzEi;
   private static String hgmquarums = ByteBuffer.wrap(lnqsmecwcfkhpdi()).asCharBuffer().toString();

   public WimpyLoader() {
super();
      int var4 = 777697287 ^ 1871703374;
      

      while (true) {
         switch (equlxktebzrxiyte.tpabobqnolkrvwps(var4)) {
            case 260904168:
               var4 = 1400819921 ^ var4;
            case 1653124702:
               var4 = 249551249 ^ 2102212991 ^ Integer.parseInt("1631151478");
               this.YoXThTbzEi = 2103407243 ^ LrE3zXpkti;

               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var4)) {
                     case 70008957:
                        var4 = 637136372 ^ var4;
                        return;
                     case 604802917:
                        break;
                     case 1013444462:
                        return;
                     case 1896493574:
                     default:
                        throw new RuntimeException();
                  }
               }
            case 502132052:
               break;
            case 1089016109:
            default:
               throw new RuntimeException();
         }
      }
   }

   public void onInitializeClient() {
      int var24 = 843068245 ^ 994554309 ^ 1264528539;
      var24 = 1696951252 ^ var24;
      String var1 = sszzachwza(rxwxjohfscmokxn(), var24);
      String var2 = sszzachwza(puivvnwizqldluj(), var24);
      Identifier var9 = Identifier.fromNamespaceAndPath(var1, var2);
      Category var10 = Category.register(var9);
      String var3 = sszzachwza(xodmjsioxfochtk(), var24);
      Type var4 = Type.KEYSYM;
      short var5 = 344;
      KeyMapping var11 = new KeyMapping(var3, var4, var5, var10);
      KeyMapping var12 = KeyBindingHelper.registerKeyBinding(var11);
      BridgeGate.bindOpenMenuKey(var12);
      Event var14 = ClientSendMessageEvents.ALLOW_CHAT;
      AllowChat var18 = WimpyLoader::allowChat;
      var14.register(var18);
      Event var15 = ClientSendMessageEvents.ALLOW_COMMAND;
      AllowCommand var19 = WimpyLoader::allowCommand;
      var15.register(var19);
      Event var16 = ClientTickEvents.END_CLIENT_TICK;
      EndTick var20 = WimpyLoader::tick;
      var16.register(var20);
      Runnable var17 = () -> {
         int var6 = 610397475 ^ 2031521429 ^ 905993744;
         var6 = 688062721 ^ var6;
         boolean var1x = true;
         Object var2x = null;
         long var3x = System.nanoTime();
         WimpyLoader$a var0 = new WimpyLoader$a(var1x, (String)var2x, var3x);
         completion = var0;
      };
      Runnable var21 = () -> {
         int var6 = 348685341 ^ 1640989912 ^ 905993744;
         var6 = 1718064327 ^ var6;
         boolean var1x = false;
         String var2x = sszzachwza(dxuomgcipqmzdaz(), var6);
         long var3x = System.nanoTime();
         WimpyLoader$a var0 = new WimpyLoader$a(var1x, var2x, var3x);
         completion = var0;
      };
      LicenseLoader.startStoredKeyValidation(var17, var21);
   }

   public static void openKeyPrompt(Minecraft var0, String var1) {
      int var24 = 859666524 ^ 444735912 ^ 905993744;
      var24 = 757711066 ^ var24;
      if (var0 != null) {
         var24 = 1254058383 ^ var24;
         Screen var10 = var0.screen;
         boolean var11 = var10 instanceof f;
         if (var11) {
            var24 = 887379967 ^ var24;
         } else {
            label29:
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var24)) {
                  case 147896927:
                     var24 ^= 1350274750;
                  case 620555607:
                     break label29;
                  case 1699014607:
                     break;
                  case 1796127331:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }

            Screen var13 = var0.screen;
            boolean var15 = var13 instanceof c;
            Screen var19;
            if (var15) {
               var24 = 1494490398 ^ var24;
               c var17 = (c)var13;
               var19 = var17.parent();
               var24 = pdkifbqxtvpqxmjj(var24, 204340062);
            } else {
               var24 = 1254084194 ^ var24;
               var19 = var0.screen;
               var24 = 528885794 ^ var24;
            }

            c var3 = new c(var19, var1);
            var0.setScreen(var3);
         }
      } else {
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var24)) {
               case 33820830:
                  var24 = 2119908976 ^ var24;
                  return;
               case 485846420:
                  break;
               case 1288676112:
                  return;
               case 1905222727:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }
   }

   public static boolean requestActivation(String var0) {
      int var49 = 88610196 ^ 938843367 ^ 905993744;
      var49 = 427593251 ^ var49;
      if (var0 != null) {
         var49 = 2035524870 ^ var49;
         boolean var9 = var0.isBlank();
         if (var9) {
            var49 = 1875748089 ^ var49;
            return false;
         } else {
            var49 = pdkifbqxtvpqxmjj(var49, 1044196904);
            boolean var10 = LicenseLoader.isAuthorized();
            if (var10) {
               var49 = 1333504639 ^ var49;
               boolean var37 = LicenseLoader.isCurrentKey(var0);
               String var39;
               if (var37) {
                  var49 = 71987172 ^ var49;
                  var39 = sszzachwza(adnzartghqpeezi(), var49);
                  var49 = pdkifbqxtvpqxmjj(var49, 1403119849);
               } else {
                  var49 = 398133819 ^ var49;
                  var39 = sszzachwza(ittetlvxaiyysyg(), var49);
                  var49 = 1079020854 ^ var49;
               }

               notice(var39);
               return true;
            } else {
               var49 = 2116439069 ^ var49;
               AtomicBoolean var11 = CHECKING;
               boolean var2 = false;
               boolean var3 = true;
               boolean var12 = var11.compareAndSet(var2, var3);
               if (!var12) {
                  var49 = 269554812 ^ var49;
                  return false;
               } else {
                  var49 = pdkifbqxtvpqxmjj(var49, 541992168);
                  boolean var13 = true;
                  promptedThisWorld = var13;
                  Minecraft var14 = Minecraft.getInstance();
                  if (var14 != null) {
                     var49 = 544459438 ^ var49;
                     Screen var17 = var14.screen;
                     boolean var18 = var17 instanceof f;
                     if (!var18) {
                        var49 = 1111659225 ^ var49;
                        Screen var20 = var14.screen;
                        boolean var22 = var20 instanceof c;
                        Screen var24;
                        if (var22) {
                           var49 = 1332288077 ^ var49;
                           c var33 = (c)var20;
                           var24 = var33.parent();

                           label46:
                           while (true) {
                              switch (equlxktebzrxiyte.tpabobqnolkrvwps(var49)) {
                                 case 10868776:
                                    var49 ^= 1497366122;
                                    break label46;
                                 case 937334795:
                                    break;
                                 case 1429942607:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1785756775:
                                    break label46;
                              }
                           }
                        } else {
                           label55:
                           while (true) {
                              switch (equlxktebzrxiyte.tpabobqnolkrvwps(var49)) {
                                 case 125710687:
                                    var49 ^= 1298185199;
                                    break label55;
                                 case 761065455:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1040279446:
                                    break;
                                 case 1626992164:
                                    break label55;
                              }
                           }

                           var24 = var14.screen;
                           var49 = 1530290120 ^ var49;
                        }

                        resumeAfterLoad = var24;
                        var49 = 2063569169 ^ var49;
                     } else {
                        var49 = pdkifbqxtvpqxmjj(var49, 787212271);
                     }
                  } else {
                     var49 = 244854081 ^ var49;
                  }

                  f var25 = new f();
                  loadingScreen = var25;
                  boolean var27 = true;
                  showLoading = var27;
                  Runnable var43 = () -> {
                     int var34 = 563963888 ^ 1417787148 ^ 905993744;
                     var34 = 269884467 ^ var34;

                     try {
                        String var9x = var0.trim();
                        Object var22x = Objects.requireNonNull(var25);
                        BiConsumer<String, Integer> var19 = var25::update;
                        long var10x = LicenseLoader.activateAndLoad(var9x, var19);
                        String var20x = sszzachwza(tsicslwkfeiasvv(), var34);
                        byte var23 = 100;
                        Integer var24x = Integer.valueOf(var23);
                        var25.update(var20x, var24x);
                        boolean var25x = true;
                        Object var4 = null;
                        long var5 = System.nanoTime();
                        WimpyLoader$a var13x = new WimpyLoader$a(var25x, (String)var4, var5);
                        completion = var13x;
                        var34 ^= 254249448;
                     } catch (RuntimeException var35) {
                        switch (equlxktebzrxiyte.ywsixjszjupjgadr(var34)) {
                           case -1739286790:
                              var34 = 897609088 ^ var34;
                              String var16 = var35.getMessage();
                              Logger var17x = LOG;
                              Level var21 = Level.WARNING;
                              String var27x = "Key activation failed: " + var16;
                              var17x.log(var21, var27x);
                              var34 = 368116608 ^ var34;
                              boolean var28x = false;
                              String var30;
                              if (var16 == null) {
                                 var34 = 720016634 ^ var34;
                                 var30 = sszzachwza(igmirdhgxjvihim(), var34);
                                 var34 = pdkifbqxtvpqxmjj(var34, 492988810);
                              } else {
                                 var34 = 1267563609 ^ var34;
                                 var30 = var16;
                                 var34 = 2080735529 ^ var34;
                              }

                              long var31 = System.nanoTime();
                              WimpyLoader$a var18x = new WimpyLoader$a(var28x, var30, var31);
                              completion = var18x;
                              var34 = 984406810 ^ var34;
                              return;
                           default:
                              throw new RuntimeException("Error in hash");
                        }
                     }

                     var34 = pdkifbqxtvpqxmjj(var34, 577945986);
                  };
                  String var44 = sszzachwza(pfgusvgbiarfhvz(), var49);
                  Thread var28 = new Thread(var43, var44);
                  boolean var41 = true;
                  var28.setDaemon(var41);
                  var28.start();
                  return true;
               }
            }
         }
      } else {
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var49)) {
               case 161906989:
                  var49 = 379453951 ^ var49;
                  return false;
               case 1182820189:
               default:
                  throw new RuntimeException(new IOException());
               case 1212619707:
                  return false;
               case 1259331396:
            }
         }
      }
   }

   private static boolean allowChat(String var0) {
      int var6 = 494870826 ^ 407202232 ^ 905993744;
      var6 = 1044846135 ^ var6;
      boolean var2 = handleChatInput(var0);
      boolean var3;
      if (!var2) {
         var6 = 2139961407 ^ var6;
         var3 = true;
         var6 = pdkifbqxtvpqxmjj(var6, 1457904650);
      } else {
         var6 = 2096459912 ^ var6;
         var3 = false;
         var6 = 1436390589 ^ var6;
      }

      return var3;
   }

   private static boolean allowCommand(String var0) {
      int var6 = 764822385 ^ 876231404 ^ 905993744;
      var6 = 487441576 ^ var6;
      boolean var2 = handleChatInput(var0);
      if (!var2) {
         var6 = 297621464 ^ var6;
         boolean var3 = true;

         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var6)) {
               case 67616182:
                  var6 = 1984968725 ^ var6;
                  return var3;
               case 1192507048:
                  return var3;
               case 1561480455:
               default:
                  throw new IllegalStateException();
               case 2136371936:
            }
         }
      } else {
         label19:
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var6)) {
               case 35232438:
                  var6 ^= 1271129447;
                  break label19;
               case 70582511:
                  break;
               case 487667534:
               default:
                  throw new IllegalStateException();
               case 1152763101:
                  break label19;
            }
         }

         boolean var11 = false;
         var6 = 741247658 ^ var6;
         return var11;
      }
   }

   public static boolean handleChatInput(String var0) {
      int var32 = 273327459 ^ 580556152 ^ 905993744;
      var32 = 156154191 ^ var32;
      String var27;
      if (var0 == null) {
         var32 = 139310246 ^ var32;
         var27 = sszzachwza(zkbzfnlhdrwpent(), var32);

         label48:
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var32)) {
               case 91629680:
                  var32 ^= 329940897;
               case 723508470:
                  break label48;
               case 1268712647:
               default:
                  throw new RuntimeException(new IOException());
               case 1793315856:
            }
         }
      } else {
         label41:
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var32)) {
               case 174312589:
                  var32 ^= 2077025929;
                  break label41;
               case 276715801:
               default:
                  throw new RuntimeException(new IOException());
               case 1474210106:
                  break label41;
               case 1629150016:
            }
         }

         var27 = var0.trim();
         var32 = 1613442446 ^ var32;
      }

      int var7 = keyPrefixLength(var27);
      if (var7 == 0) {
         var32 = 602573157 ^ var32;
         return false;
      } else {
         var32 = pdkifbqxtvpqxmjj(var32, 360231495);
         int var11 = var27.length();
         if (var11 > var7) {
            var32 = 388383759 ^ var32;
            char var13 = var27.charAt(var7);
            boolean var14 = Character.isWhitespace(var13);
            if (!var14) {
               var32 = 138354618 ^ var32;
               return false;
            }

            var32 = 804148975 ^ var32;
         } else {
            var32 = 952636128 ^ var32;
         }

         String var17 = var27.substring(var7);
         String var18 = var17.trim();
         boolean var20 = var18.isEmpty();
         if (var20) {
            var32 = 928085717 ^ var32;
            showStatus();
            return true;
         } else {
            var32 = 1497563074 ^ var32;
            boolean var22 = requestActivation(var18);
            if (!var22) {
               var32 = 845506276 ^ var32;
               String var23 = sszzachwza(uabnotvrncrtxbu(), var32);
               notice(var23);
               var32 = 1848196563 ^ var32;
            } else {
               var32 = 1548507959 ^ var32;
            }

            return true;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void tick(Minecraft var0) {
      int var125 = 741619785 ^ 1664663512 ^ 905993744;
      var125 = 1255962585 ^ var125;
      long var1 = closeLoadingAt;
      long var4 = 0L;
      long var155;
      int var9 = (var155 = var1 - var4) == 0L ? 0 : (var155 < 0L ? -1 : 1);
      if (var9 != 0) {
         var125 = 1002011197 ^ var125;
         long var10 = System.nanoTime();
         long var102 = closeLoadingAt;
         long var156;
         int var12 = (var156 = var10 - var102) == 0L ? 0 : (var156 < 0L ? -1 : 1);
         if (var12 >= 0) {
            var125 = 172423556 ^ var125;
            restoreAfterLoad(var0);
            var125 = 1639059049 ^ var125;
         } else {
            label252:
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var125)) {
                  case 5047274:
                     var125 ^= 1811216365;
                     break label252;
                  case 198715333:
                     break;
                  case 255930716:
                     break label252;
                  case 1824353950:
                  default:
                     throw new RuntimeException();
               }
            }
         }
      } else {
         var125 = pdkifbqxtvpqxmjj(var125, 1347259856);
      }

      ClientLevel var15 = var0.level;
      Object var3 = announcedWorld;
      if (var15 != var3) {
         var125 = 1241835417 ^ var125;
         ClientLevel var17 = var0.level;
         announcedWorld = var17;
         byte var18 = 0;
         worldTicks = var18;
         boolean var19 = false;
         promptedThisWorld = var19;
         var125 = 703271092 ^ var125;
      } else {
         label244:
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var125)) {
               case 16783178:
                  var125 ^= 1676670765;
                  break label244;
               case 269654700:
               default:
                  throw new RuntimeException();
               case 1303430855:
                  break;
               case 1542952517:
                  break label244;
            }
         }
      }

      ClientLevel var21 = var0.level;
      if (var21 != null) {
         var125 = 1919997741 ^ var125;
         LocalPlayer var23 = var0.player;
         if (var23 != null) {
            var125 = 589975286 ^ var125;
            boolean var24 = LicenseLoader.isAuthorized();
            if (var24) {
               var125 = 314779548 ^ var125;
               boolean var86 = true;
               promptedThisWorld = var86;

               label227:
               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var125)) {
                     case 60316926:
                        var125 ^= 1207888914;
                        break label227;
                     case 206894465:
                     default:
                        throw new RuntimeException();
                     case 1245925433:
                        break label227;
                     case 1793231164:
                  }
               }
            } else {
               var125 = pdkifbqxtvpqxmjj(var125, 1010456590);
               boolean var25 = initialized;
               if (!var25) {
                  var125 = 41055431 ^ var125;
                  AtomicBoolean var26 = CHECKING;
                  boolean var27 = var26.get();
                  if (!var27) {
                     var125 = 1712457287 ^ var125;
                     boolean var28 = promptedThisWorld;
                     if (!var28) {
                        var125 = 44859854 ^ var125;
                        int var29 = worldTicks;
                        byte var87 = 1;
                        int var30 = var29 + var87;
                        worldTicks = var30;
                        byte var88 = 40;
                        if (var30 >= var88) {
                           var125 = 112723631 ^ var125;
                           boolean var31 = true;
                           promptedThisWorld = var31;
                           String var32 = sszzachwza(ljzxyoxbqrbrlhx(), var125);
                           notice(var32);
                           var125 = 158557793 ^ var125;
                        } else {
                           var125 = pdkifbqxtvpqxmjj(var125, 264986830);
                        }
                     } else {
                        var125 = pdkifbqxtvpqxmjj(var125, 224911616);
                     }
                  } else {
                     var125 = pdkifbqxtvpqxmjj(var125, 1802889031);
                  }
               } else {
                  var125 = 1762104192 ^ var125;
               }
            }
         } else {
            label235:
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var125)) {
                  case 216241365:
                     var125 ^= 1981252984;
                     break label235;
                  case 541901441:
                  default:
                     throw new RuntimeException();
                  case 1454446824:
                     break;
                  case 2130764662:
                     break label235;
               }
            }
         }
      } else {
         var125 = pdkifbqxtvpqxmjj(var125, 73880149);
      }

      boolean var33 = showLoading;
      if (var33) {
         var125 = 1890211144 ^ var125;
         f var34 = loadingScreen;
         if (var34 != null) {
            var125 = 168782767 ^ var125;
            Screen var36 = var0.screen;
            f var89 = loadingScreen;
            if (var36 != var89) {
               var125 = 82878144 ^ var125;
               f var90 = loadingScreen;
               var0.setScreen(var90);
               var125 = 1652384375 ^ var125;
            } else {
               var125 = 1720581303 ^ var125;
            }
         } else {
            var125 = 1820497688 ^ var125;
         }
      } else {
         var125 = 472433232 ^ var125;
      }

      WimpyLoader$a var38 = completion;
      label219:
      if (var38 != null) {
         var125 = 1010448975 ^ var125;
         f var40 = loadingScreen;
         if (var40 != null) {
            var125 = 172763993 ^ var125;
            long var41 = System.nanoTime();
            long var105 = var38.finishedAt;
            long var43 = var41 - var105;
            long var107 = 350000000L;
            long var157;
            int var45 = (var157 = var43 - var107) == 0L ? 0 : (var157 < 0L ? -1 : 1);
            if (var45 < 0) {
               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var125)) {
                     case 80572344:
                        break label219;
                     case 162650203:
                        var125 ^= 1237728373;
                        break label219;
                     case 1030255781:
                        break;
                     case 1948099978:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            var125 = 236344585 ^ var125;
         } else {
            var125 = pdkifbqxtvpqxmjj(var125, 73039440);
         }

         Object var46 = null;
         completion = (WimpyLoader$a)var46;
         boolean var47 = false;
         showLoading = var47;
         AtomicBoolean var48 = CHECKING;
         boolean var91 = false;
         var48.set(var91);
         boolean var50 = var38.ok;
         if (var50) {
            var125 ^= 2107386026;
            boolean var51 = LicenseLoader.isAuthorized();
            if (var51) {
               var125 = 80316260 ^ var125;
               boolean var52 = LicenseLoader.isPayloadMounted();
               if (var52) {
                  var125 = 1018080910 ^ var125;

                  label262: {
                     Throwable var10000;
                     label186: {
                        label185: {
                           label184: {
                              label183: {
                                 label182: {
                                    label263: {
                                       label180: {
                                          try {
                                             initPayload();
                                             LicenseLoader.markClientReady();
                                             Runnable var53 = WimpyLoader::authLost;
                                             LicenseLoader.startHeartbeat(var53);
                                             f var54 = loadingScreen;
                                             if (var54 == null) {
                                                break label180;
                                             }

                                             var125 ^= 182993196;
                                             f var55 = loadingScreen;
                                             String var92 = sszzachwza(wqkxsyeqygopmfy(), var125);
                                             byte var109 = 100;
                                             Integer var110 = Integer.valueOf(var109);
                                             var55.update(var92, var110);
                                             long var56 = System.nanoTime();
                                             long var111 = 350000000L;
                                             long var58 = var56 + var111;
                                             closeLoadingAt = var58;
                                          } catch (Throwable var128) {
                                             var10000 = var128;
                                             switch (equlxktebzrxiyte.ywsixjszjupjgadr(var125)) {
                                                case -2029761814:
                                                   break label182;
                                                case 758124539:
                                                   break label184;
                                                case 1729239459:
                                                   break label183;
                                                case 2054293147:
                                                   break label185;
                                                default:
                                                   throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                             }
                                          }

                                          while (true) {
                                             switch (equlxktebzrxiyte.tpabobqnolkrvwps(var125)) {
                                                case 128447190:
                                                   var125 ^= 1068419470;
                                                   break label263;
                                                case 300973897:
                                                   break;
                                                case 629549291:
                                                   break label263;
                                                case 862948582:
                                                default:
                                                   throw new RuntimeException();
                                             }
                                          }
                                       }

                                       var125 = pdkifbqxtvpqxmjj(var125, 155468491);

                                       try {
                                          restoreAfterLoad(var0);
                                          var125 ^= 1006815849;
                                       } catch (Throwable var127) {
                                          var10000 = var127;
                                          switch (equlxktebzrxiyte.ywsixjszjupjgadr(var125)) {
                                             case -2029761814:
                                                break label182;
                                             case 758124539:
                                                break label184;
                                             case 1729239459:
                                                break label183;
                                             case 2054293147:
                                                break label185;
                                             default:
                                                throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                          }
                                       }
                                    }

                                    try {
                                       String var60 = sszzachwza(kdaqfhhexmxduak(), var125);
                                       boolean var93 = true;
                                       Class<WimpyLoader> var113 = WimpyLoader.class;
                                       ClassLoader var114 = var113.getClassLoader();
                                       Class var61 = Class.forName(var60, var93, var114);
                                       String var94 = sszzachwza(tplgkfkxjmwtxop(), var125);
                                       byte var115 = 0;
                                       Class[] var116 = new Class[var115];
                                       Method var62 = var61.getMethod(var94, var116);
                                       Object var95 = null;
                                       byte var117 = 0;
                                       Object[] var118 = new Object[var117];
                                       Object var63 = var62.invoke(var95, var118);
                                       var125 ^= 200380723;
                                       break label262;
                                    } catch (Throwable var126) {
                                       var10000 = var126;
                                       switch (equlxktebzrxiyte.ywsixjszjupjgadr(var125)) {
                                          case -2029761814:
                                             break;
                                          case 758124539:
                                             break label184;
                                          case 1729239459:
                                             break label183;
                                          case 2054293147:
                                             break label185;
                                          default:
                                             throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                       }
                                    }
                                 }

                                 var125 ^= 1551401162;
                                 break label186;
                              }

                              var125 ^= 1618627235;
                              break label186;
                           }

                           var125 = pdkifbqxtvpqxmjj(var125, 1765673064);
                           break label186;
                        }

                        var125 ^= 1674987844;
                     }

                     Throwable var64 = var10000;
                     Logger var65 = LOG;
                     Level var96 = Level.ERROR;
                     String var119 = sszzachwza(ljkngbcbpxxjzyn(), var125);
                     var65.log(var96, var119, var64);
                     restoreAfterLoad(var0);
                     String var97 = sszzachwza(qbmuguckqjeckuu(), var125);
                     openKeyPrompt(var0, var97);
                     String var68 = sszzachwza(hmusfsupyojmdzz(), var125);
                     notice(var68);

                     while (true) {
                        switch (equlxktebzrxiyte.tpabobqnolkrvwps(var125)) {
                           case 140942860:
                              var125 ^= 1796563028;
                              break label219;
                           case 808752580:
                              break;
                           case 945469589:
                           default:
                              throw new RuntimeException();
                           case 1755233860:
                              break label219;
                        }
                     }
                  }

                  while (true) {
                     switch (equlxktebzrxiyte.tpabobqnolkrvwps(var125)) {
                        case 7423044:
                           var125 ^= 1016885677;
                           break label219;
                        case 468208850:
                        default:
                           throw new RuntimeException();
                        case 1004601582:
                           break label219;
                        case 1970427691:
                     }
                  }
               }

               var125 = pdkifbqxtvpqxmjj(var125, 1779585033);
            } else {
               label198:
               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var125)) {
                     case 94789737:
                        var125 ^= 1859901293;
                        break label198;
                     case 673278554:
                     default:
                        throw new RuntimeException();
                     case 1773423221:
                        break;
                     case 1838664142:
                        break label198;
                  }
               }
            }
         } else {
            label205:
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var125)) {
                  case 246681903:
                     var125 ^= 323485639;
                     break label205;
                  case 483759432:
                     break;
                  case 1049955774:
                  default:
                     throw new RuntimeException();
                  case 1545478842:
                     break label205;
               }
            }
         }

         restoreAfterLoad(var0);
         String var80 = var38.message;
         String var81;
         if (var80 != null) {
            var125 = pdkifbqxtvpqxmjj(var125, 1781276380);
            var81 = var38.message;
            var125 = 763641209 ^ var125;
         } else {
            var125 = 1571373425 ^ var125;
            var81 = sszzachwza(whhjnttxxgpmqzi(), var125);

            label123:
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var125)) {
                  case 95815574:
                  default:
                     throw new RuntimeException();
                  case 108801666:
                     var125 ^= 436298452;
                  case 504742307:
                     break label123;
                  case 1889344150:
               }
            }
         }

         openKeyPrompt(var0, var81);
         notice(var81);
         boolean var84 = true;
         promptedThisWorld = var84;
         var125 = 322942238 ^ var125;
      } else {
         var125 = 2142252387 ^ var125;
      }

      String var69 = pendingNotice;
      if (var69 != null) {
         var125 = 76786882 ^ var125;
         LocalPlayer var72 = var0.player;
         if (var72 != null) {
            var125 = 1423877132 ^ var125;
            Object var73 = null;
            pendingNotice = (String)var73;
            boolean var74 = true;
            promptedThisWorld = var74;
            LocalPlayer var76 = var0.player;
            String var99 = "[License] " + var69;
            MutableComponent var100 = Component.literal(var99);
            boolean var120 = false;
            var76.displayClientMessage(var100, var120);
            var125 = 725890583 ^ var125;
         } else {
            var125 = pdkifbqxtvpqxmjj(var125, 2140836379);
         }
      } else {
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var125)) {
               case 144808804:
                  var125 = 2064203481 ^ var125;
                  return;
               case 390279320:
                  break;
               case 1078606439:
               default:
                  throw new RuntimeException();
               case 1394215582:
                  return;
            }
         }
      }
   }

   private static void restoreAfterLoad(Minecraft var0) {
      Screen var5;
      label53: {
         int var30 = 425923723 ^ 1191138163 ^ 905993744;
         var30 = 1107850072 ^ var30;
         long var1 = 0L;
         closeLoadingAt = var1;
         Screen var8 = var0.screen;
         Screen var9 = resumeAfterLoad;
         var5 = var9;
         f var10 = loadingScreen;
         Object var11 = null;
         resumeAfterLoad = (Screen)var11;
         Object var12 = null;
         loadingScreen = (f)var12;
         if (var8 != null) {
            var30 = 1278602187 ^ var30;
            if (var8 != var10) {
               var30 = 1035221705 ^ var30;
               boolean var16 = var8 instanceof f;
               if (!var16) {
                  var30 = 1201403964 ^ var30;
                  boolean var18 = var8 instanceof c;
                  if (!var18) {
                     var30 = 87013354 ^ var30;
                     return;
                  }

                  label45:
                  while (true) {
                     switch (equlxktebzrxiyte.tpabobqnolkrvwps(var30)) {
                        case 155434861:
                           var30 ^= 159303443;
                           break label45;
                        case 863640939:
                           break;
                        case 1047975688:
                        default:
                           throw new RuntimeException();
                        case 1859227531:
                           break label45;
                     }
                  }
               } else {
                  var30 = 1323646767 ^ var30;
               }
            } else {
               var30 = pdkifbqxtvpqxmjj(var30, 1934689766);
            }
         } else {
            var30 = 1063579181 ^ var30;
         }

         boolean var20 = var9 instanceof f;
         if (!var20) {
            var30 = 1702950694 ^ var30;
            boolean var22 = var9 instanceof c;
            if (!var22) {
               var30 = 209645256 ^ var30;
               boolean var24 = var9 instanceof ChatScreen;
               if (!var24) {
                  var30 = 723885313 ^ var30;
                  break label53;
               }

               var30 = 1424818622 ^ var30;
            } else {
               label36:
               while (true) {
                  switch (equlxktebzrxiyte.tpabobqnolkrvwps(var30)) {
                     case 197759306:
                        var30 ^= 1486090102;
                        break label36;
                     case 894551235:
                     default:
                        throw new RuntimeException();
                     case 1122382121:
                        break label36;
                     case 1907268963:
                  }
               }
            }
         } else {
            var30 = pdkifbqxtvpqxmjj(var30, 1024661584);
         }

         Object var25 = null;
         var5 = (Screen)var25;
         var30 = 2143853759 ^ var30;
      }

      var0.setScreen(var5);
   }

   private static void initPayload() throws Exception {
      int var20 = 1445502063 ^ 170107750 ^ 905993744;
      var20 = 1231114215 ^ var20;
      boolean var0 = initialized;
      if (var0) {
         var20 = 2138927801 ^ var20;
      } else {
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var20)) {
               case 77437030:
                  var20 ^= 2066390955;
               case 1857890046:
                  String var5 = sszzachwza(nosgkhajehrrejw(), var20);
                  boolean var1 = true;
                  Class<WimpyLoader> var2 = WimpyLoader.class;
                  ClassLoader var17 = var2.getClassLoader();
                  Class var6 = Class.forName(var5, var1, var17);
                  byte var13 = 0;
                  Class[] var14 = new Class[var13];
                  Constructor var8 = var6.getDeclaredConstructor(var14);
                  byte var15 = 0;
                  Object[] var16 = new Object[var15];
                  Object var9 = var8.newInstance(var16);
                  ClientModInitializer var10 = (ClientModInitializer)var9;
                  var10.onInitializeClient();
                  boolean var12 = true;
                  initialized = var12;
                  return;
               case 652027244:
               default:
                  throw new IllegalStateException();
               case 1488217137:
            }
         }
      }
   }

   private static void authLost() {
      int var21 = 301528027 ^ 1301593751 ^ 905993744;
      var21 = 1726810890 ^ var21;

      try {
         String var0 = sszzachwza(hwgzhavyjtlahla(), var21);
         boolean var1 = true;
         Class<WimpyLoader> var2 = WimpyLoader.class;
         ClassLoader var13 = var2.getClassLoader();
         Class var5 = Class.forName(var0, var1, var13);
         String var10 = sszzachwza(mrcgzerkvaoivol(), var21);
         byte var14 = 0;
         Class[] var15 = new Class[var14];
         Method var6 = var5.getMethod(var10, var15);
         Object var11 = null;
         byte var16 = 0;
         Object[] var17 = new Object[var16];
         Object var7 = var6.invoke(var11, var17);
         var21 ^= 1765907042;
      } catch (Throwable var22) {
         switch (equlxktebzrxiyte.ywsixjszjupjgadr(var21)) {
            case 1678295728:
               var21 = 1017855067 ^ var21;
               Logger var9 = LOG;
               Level var12 = Level.ERROR;
               String var18 = sszzachwza(aozjfiyvaxvsfvh(), var21);
               var9.log(var12, var18, var22);
               var21 = 521355504 ^ var21;
               return;
            default:
               throw new RuntimeException("Error in hash");
         }
      }

      var21 = pdkifbqxtvpqxmjj(var21, 1257891529);
   }

   private static void notice(String var0) {
      int var15 = 1963677478 ^ 1432183801 ^ 905993744;
      var15 = 861619920 ^ var15;
      Minecraft var1 = Minecraft.getInstance();
      if (var1 != null) {
         var15 ^= 713410140;
         LocalPlayer var7 = var1.player;
         if (var7 != null) {
            var15 = 745301844 ^ var15;
            LocalPlayer var10 = var1.player;
            String var11 = "[License] " + var0;
            MutableComponent var12 = Component.literal(var11);
            boolean var3 = false;
            var10.displayClientMessage(var12, var3);
            var15 = pdkifbqxtvpqxmjj(var15, 1563059533);
            return;
         }

         label29:
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var15)) {
               case 236538473:
                  var15 ^= 1670450017;
                  break label29;
               case 897657473:
               default:
                  throw new RuntimeException(new IOException());
               case 1307650507:
                  break label29;
               case 2042498546:
            }
         }
      } else {
         label23:
         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var15)) {
               case 130654321:
                  var15 ^= 1226100029;
                  break label23;
               case 376453509:
                  break;
               case 850532880:
               default:
                  throw new RuntimeException(new IOException());
               case 2012072071:
                  break label23;
            }
         }
      }

      pendingNotice = var0;
      var15 = 316082552 ^ var15;
   }

   private static void showStatus() {
      int var34 = 1155456933 ^ 1790019687 ^ 905993744;
      var34 = 2123310645 ^ var34;
      String var0 = sszzachwza(xcdplzfzibapzhe(), var34);
      notice(var0);
      boolean var6 = LicenseLoader.isAuthorized();
      if (var6) {
         var34 = 1384527352 ^ var34;
         boolean var7 = LicenseLoader.isFreeKey();
         String var24;
         if (var7) {
            var34 = 1448152000 ^ var34;
            var24 = sszzachwza(jzgrjbgqbeqkzpc(), var34);
            var34 = pdkifbqxtvpqxmjj(var34, 1433113967);
         } else {
            label44:
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var34)) {
                  case 92661498:
                     var34 ^= 2086389326;
                     break label44;
                  case 360050861:
                     break;
                  case 550425875:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1676675336:
                     break label44;
               }
            }

            var24 = sszzachwza(ysbohwaiusbfpdq(), var34);
            var34 = 2137086177 ^ var34;
         }

         notice(var24);
         long var8 = 0L;
         long var1 = LicenseLoader.expiresAtEpochSeconds();
         Instant var3 = Instant.now();
         long var31 = var3.getEpochSecond();
         long var25 = var1 - var31;
         long var10 = Math.max(var8, var25);
         long var27 = 59L;
         long var14 = var10 + var27;
         long var29 = 60L;
         long var16 = var14 / var29;
         String var18 = "Time left: about " + var16 + " minutes";
         notice(var18);

         while (true) {
            switch (equlxktebzrxiyte.tpabobqnolkrvwps(var34)) {
               case 188970569:
                  var34 = 1746617094 ^ var34;
                  return;
               case 232552623:
                  break;
               case 1673498683:
                  return;
               case 2120058874:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      } else {
         var34 = pdkifbqxtvpqxmjj(var34, 2077871870);
         AtomicBoolean var19 = CHECKING;
         boolean var20 = var19.get();
         if (var20) {
            var34 = 676286798 ^ var34;
            String var23 = sszzachwza(ztusfdgwxjfrzqc(), var34);
            notice(var23);
            var34 = pdkifbqxtvpqxmjj(var34, 1781626849);
         } else {
            label27:
            while (true) {
               switch (equlxktebzrxiyte.tpabobqnolkrvwps(var34)) {
                  case 144718105:
                     var34 ^= 520925001;
                     break label27;
                  case 1751429413:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1788240040:
                     break;
                  case 2125060181:
                     break label27;
               }
            }

            String var21 = sszzachwza(tfdikanblnlwdbe(), var34);
            notice(var21);
            String var22 = sszzachwza(mgnnxxwpzbprild(), var34);
            notice(var22);
            var34 = 1567787494 ^ var34;
         }
      }
   }

   static int keyPrefixLength(String var0) {
      int var34 = 177856939 ^ 1254390762 ^ 905993744;
      var34 = 23893682 ^ var34;
      boolean var2 = true;
      byte var3 = 0;
      String var4 = sszzachwza(uurpjjuexuduzuy(), var34);
      byte var5 = 0;
      byte var6 = 4;
      boolean var7 = var0.regionMatches(var2, var3, var4, var5, var6);
      if (!var7) {
         var34 = 1655271556 ^ var34;
         boolean var17 = true;
         byte var20 = 0;
         String var23 = sszzachwza(mkiraidcnvdxunj(), var34);
         byte var26 = 0;
         byte var29 = 4;
         boolean var9 = var0.regionMatches(var17, var20, var23, var26, var29);
         if (!var9) {
            var34 = pdkifbqxtvpqxmjj(var34, 211007326);
            boolean var18 = true;
            byte var21 = 0;
            String var24 = sszzachwza(rtxqlvtcfrmldmu(), var34);
            byte var27 = 0;
            byte var30 = 5;
            boolean var11 = var0.regionMatches(var18, var21, var24, var27, var30);
            if (!var11) {
               var34 = 239240181 ^ var34;
               boolean var19 = true;
               byte var22 = 0;
               String var25 = sszzachwza(cxhigkczleolrvy(), var34);
               byte var28 = 0;
               byte var31 = 5;
               boolean var13 = var0.regionMatches(var19, var22, var25, var28, var31);
               if (!var13) {
                  var34 = 469316703 ^ var34;
                  return 0;
               }

               var34 = 249322923 ^ var34;
            } else {
               var34 = pdkifbqxtvpqxmjj(var34, 10411614);
            }

            return 5;
         }

         var34 = 435708190 ^ var34;
      } else {
         var34 = 2068910490 ^ var34;
      }

      return 4;
   }

   static {
      int var8 = 1023403307 ^ 585412579 ^ Integer.parseInt("1631151478");
      int var5 = new Random(6712486853610224390L).nextInt();
      LrE3zXpkti = 295750487 ^ var5;
      var8 = 1225430341 ^ var8;
      String var0 = sszzachwza(pzxqhdnqrwxkgkv(), var8);
      Logger var1 = System.getLogger(var0);
      LOG = var1;
      AtomicBoolean var2 = new AtomicBoolean();
      CHECKING = var2;
   }

   public static String sszzachwza(byte[] var0, int var1) {
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
      String var29 = hgmquarums;
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

   private static byte[] pzxqhdnqrwxkgkv() {
      return new byte[]{0, 0, 0, 9, 0, 0, 0, 0};
   }

   private static byte[] adnzartghqpeezi() {
      return new byte[]{0, 0, 0, 42, 0, 0, 0, 9};
   }

   private static byte[] ittetlvxaiyysyg() {
      return new byte[]{0, 0, 0, 79, 0, 0, 0, 51};
   }

   private static byte[] pfgusvgbiarfhvz() {
      return new byte[]{0, 0, 0, 20, 0, 0, 0, -126};
   }

   private static byte[] zkbzfnlhdrwpent() {
      return new byte[]{0, 0, 0, 0, 0, 0, 0, -106};
   }

   private static byte[] uabnotvrncrtxbu() {
      return new byte[]{0, 0, 0, 31, 0, 0, 0, -106};
   }

   private static byte[] ljkngbcbpxxjzyn() {
      return new byte[]{0, 0, 0, 34, 0, 0, 0, -75};
   }

   private static byte[] qbmuguckqjeckuu() {
      return new byte[]{0, 0, 0, 47, 0, 0, 0, -41};
   }

   private static byte[] hmusfsupyojmdzz() {
      return new byte[]{0, 0, 0, 59, 0, 0, 1, 6};
   }

   private static byte[] whhjnttxxgpmqzi() {
      return new byte[]{0, 0, 0, 51, 0, 0, 1, 65};
   }

   private static byte[] wqkxsyeqygopmfy() {
      return new byte[]{0, 0, 0, 5, 0, 0, 1, 116};
   }

   private static byte[] ljzxyoxbqrbrlhx() {
      return new byte[]{0, 0, 0, 65, 0, 0, 1, 121};
   }

   private static byte[] kdaqfhhexmxduak() {
      return new byte[]{0, 0, 0, 32, 0, 0, 1, -70};
   }

   private static byte[] tplgkfkxjmwtxop() {
      return new byte[]{0, 0, 0, 19, 0, 0, 1, -38};
   }

   private static byte[] nosgkhajehrrejw() {
      return new byte[]{0, 0, 0, 27, 0, 0, 1, -19};
   }

   private static byte[] aozjfiyvaxvsfvh() {
      return new byte[]{0, 0, 0, 54, 0, 0, 2, 8};
   }

   private static byte[] hwgzhavyjtlahla() {
      return new byte[]{0, 0, 0, 32, 0, 0, 2, 62};
   }

   private static byte[] mrcgzerkvaoivol() {
      return new byte[]{0, 0, 0, 10, 0, 0, 2, 94};
   }

   private static byte[] ysbohwaiusbfpdq() {
      return new byte[]{0, 0, 0, 24, 0, 0, 2, 104};
   }

   private static byte[] jzgrjbgqbeqkzpc() {
      return new byte[]{0, 0, 0, 70, 0, 0, 2, -128};
   }

   private static byte[] ztusfdgwxjfrzqc() {
      return new byte[]{0, 0, 0, 40, 0, 0, 2, -58};
   }

   private static byte[] tfdikanblnlwdbe() {
      return new byte[]{0, 0, 0, 46, 0, 0, 2, -18};
   }

   private static byte[] mgnnxxwpzbprild() {
      return new byte[]{0, 0, 0, 47, 0, 0, 3, 28};
   }

   private static byte[] xcdplzfzibapzhe() {
      return new byte[]{0, 0, 0, 36, 0, 0, 3, 75};
   }

   private static byte[] cxhigkczleolrvy() {
      return new byte[]{0, 0, 0, 5, 0, 0, 3, 111};
   }

   private static byte[] mkiraidcnvdxunj() {
      return new byte[]{0, 0, 0, 4, 0, 0, 3, 116};
   }

   private static byte[] rtxqlvtcfrmldmu() {
      return new byte[]{0, 0, 0, 5, 0, 0, 3, 120};
   }

   private static byte[] uurpjjuexuduzuy() {
      return new byte[]{0, 0, 0, 4, 0, 0, 3, 125};
   }

   private static byte[] igmirdhgxjvihim() {
      return new byte[]{0, 0, 0, 35, 0, 0, 3, -127};
   }

   private static byte[] tsicslwkfeiasvv() {
      return new byte[]{0, 0, 0, 5, 0, 0, 3, -92};
   }

   private static byte[] dxuomgcipqmzdaz() {
      return new byte[]{0, 0, 0, 40, 0, 0, 3, -87};
   }

   private static byte[] rxwxjohfscmokxn() {
      return new byte[]{0, 0, 0, 11, 0, 0, 3, -47};
   }

   private static byte[] puivvnwizqldluj() {
      return new byte[]{0, 0, 0, 4, 0, 0, 3, -36};
   }

   private static byte[] xodmjsioxfochtk() {
      return new byte[]{0, 0, 0, 25, 0, 0, 3, -32};
   }

   private static byte[] lnqsmecwcfkhpdi() {
      return new byte[]{
         57,
         103,
         56,
         95,
         51,
         85,
         57,
         71,
         49,
         64,
         48,
         121,
         54,
         70,
         56,
         77,
         55,
         89,
         50,
         109,
         53,
         93,
         55,
         90,
         52,
         74,
         51,
         18,
         57,
         94,
         53,
         82,
         51,
         77,
         57,
         19,
         50,
         80,
         53,
         70,
         55,
         19,
         52,
         88,
         51,
         94,
         57,
         71,
         53,
         82,
         51,
         85,
         57,
         87,
         50,
         64,
         53,
         21,
         55,
         82,
         52,
         90,
         51,
         70,
         57,
         92,
         53,
         65,
         51,
         81,
         57,
         19,
         50,
         86,
         53,
         91,
         55,
         19,
         52,
         77,
         51,
         90,
         57,
         92,
         53,
         68,
         51,
         20,
         57,
         80,
         50,
         85,
         53,
         92,
         55,
         86,
         52,
         87,
         51,
         70,
         57,
         27,
         52,
         113,
         56,
         21,
         56,
         93,
         53,
         93,
         52,
         83,
         56,
         80,
         56,
         95,
         53,
         71,
         52,
         85,
         56,
         21,
         56,
         88,
         53,
         71,
         52,
         16,
         56,
         84,
         56,
         93,
         53,
         70,
         52,
         85,
         56,
         84,
         56,
         85,
         53,
         77,
         52,
         16,
         56,
         84,
         56,
         82,
         53,
         64,
         52,
         89,
         56,
         67,
         56,
         84,
         53,
         26,
         52,
         16,
         56,
         98,
         56,
         80,
         53,
         93,
         52,
         68,
         56,
         21,
         56,
         87,
         53,
         91,
         52,
         66,
         56,
         21,
         56,
         88,
         53,
         64,
         52,
         16,
         56,
         65,
         56,
         94,
         53,
         20,
         52,
         85,
         56,
         77,
         56,
         65,
         53,
         93,
         52,
         66,
         56,
         80,
         56,
         17,
         53,
         86,
         52,
         85,
         56,
         83,
         56,
         94,
         53,
         70,
         52,
         85,
         56,
         21,
         56,
         84,
         53,
         90,
         52,
         68,
         56,
         80,
         56,
         67,
         53,
         93,
         52,
         94,
         56,
         82,
         56,
         17,
         53,
         85,
         52,
         94,
         56,
         90,
         56,
         69,
         53,
         92,
         52,
         85,
         56,
         71,
         56,
         17,
         53,
         95,
         52,
         85,
         56,
         76,
         56,
         31,
         49,
         96,
         52,
         89,
         51,
         91,
         57,
         69,
         52,
         72,
         55,
         20,
         48,
         88,
         54,
         92,
         53,
         77,
         49,
         23,
         52,
         81,
         51,
         85,
         57,
         65,
         52,
         88,
         55,
         66,
         48,
         82,
         54,
         77,
         53,
         93,
         49,
         88,
         52,
         94,
         49,
         114,
         53,
         23,
         55,
         83,
         52,
         80,
         49,
         77,
         49,
         19,
         53,
         94,
         55,
         75,
         52,
         21,
         49,
         85,
         49,
         95,
         53,
         69,
         55,
         93,
         52,
         84,
         49,
         80,
         49,
         74,
         53,
         23,
         55,
         90,
         52,
         80,
         49,
         93,
         49,
         93,
         53,
         80,
         55,
         24,
         52,
         86,
         49,
         92,
         49,
         86,
         53,
         84,
         55,
         83,
         52,
         80,
         49,
         80,
         49,
         29,
         50,
         102,
         49,
         91,
         57,
         93,
         53,
         65,
         57,
         75,
         49,
         17,
         50,
         90,
         48,
         89,
         49,
         80,
         50,
         84,
         49,
         92,
         57,
         68,
         53,
         17,
         57,
         91,
         49,
         95,
         50,
         80,
         48,
         65,
         49,
         80,
         50,
         80,
         49,
         94,
         57,
         89,
         53,
         75,
         57,
         83,
         49,
         69,
         50,
         80,
         48,
         90,
         49,
         87,
         50,
         17,
         49,
         84,
         57,
         81,
         53,
         88,
         57,
         94,
         49,
         84,
         50,
         93,
         50,
         114,
         49,
         94,
         57,
         89,
         53,
         84,
         57,
         92,
         49,
         69,
         50,
         25,
         48,
         92,
         49,
         87,
         50,
         88,
         49,
         70,
         57,
         89,
         53,
         80,
         57,
         94,
         49,
         88,
         50,
         67,
         48,
         84,
         49,
         77,
         50,
         88,
         49,
         93,
         57,
         94,
         53,
         17,
         57,
         84,
         49,
         80,
         50,
         80,
         48,
         89,
         49,
         92,
         50,
         85,
         49,
         28,
         57,
         16,
         53,
         114,
         57,
         90,
         49,
         84,
         50,
         90,
         48,
         94,
         49,
         25,
         50,
         93,
         49,
         83,
         57,
         68,
         53,
         84,
         57,
         65,
         49,
         69,
         50,
         23,
         48,
         89,
         49,
         86,
         50,
         86,
         49,
         28,
         50,
         114,
         49,
         94,
         57,
         89,
         53,
         84,
         57,
         92,
         49,
         69,
         50,
         25,
         48,
         92,
         49,
         87,
         50,
         88,
         49,
         70,
         57,
         89,
         53,
         80,
         57,
         94,
         49,
         88,
         50,
         67,
         48,
         84,
         49,
         77,
         50,
         88,
         49,
         93,
         57,
         94,
         53,
         17,
         57,
         84,
         49,
         80,
         50,
         80,
         48,
         89,
         49,
         92,
         50,
         85,
         49,
         28,
         57,
         16,
         53,
         114,
         57,
         90,
         49,
         84,
         50,
         90,
         48,
         94,
         49,
         25,
         50,
         93,
         49,
         83,
         57,
         68,
         53,
         84,
         57,
         65,
         49,
         69,
         50,
         23,
         48,
         89,
         49,
         86,
         50,
         86,
         49,
         18,
         57,
         86,
         53,
         94,
         57,
         64,
         49,
         17,
         50,
         93,
         48,
         80,
         49,
         77,
         50,
         80,
         49,
         91,
         57,
         92,
         53,
         66,
         57,
         28,
         49,
         116,
         53,
         94,
         50,
         84,
         51,
         86,
         53,
         93,
         49,
         75,
         53,
         82,
         50,
         23,
         51,
         68,
         53,
         82,
         49,
         75,
         53,
         23,
         50,
         89,
         51,
         92,
         53,
         71,
         49,
         24,
         53,
         86,
         50,
         84,
         51,
         80,
         53,
         86,
         49,
         72,
         53,
         67,
         50,
         82,
         51,
         87,
         53,
         29,
         49,
         24,
         53,
         114,
         50,
         89,
         51,
         71,
         53,
         86,
         49,
         74,
         53,
         23,
         50,
         86,
         51,
         19,
         53,
         88,
         49,
         93,
         53,
         78,
         50,
         23,
         51,
         71,
         53,
         92,
         49,
         24,
         53,
         67,
         50,
         69,
         51,
         74,
         53,
         19,
         49,
         89,
         53,
         80,
         50,
         86,
         51,
         90,
         53,
         93,
         49,
         22,
         49,
         106,
         54,
         82,
         51,
         88,
         57,
         87,
         55,
         64,
         50,
         126,
         52,
         81,
         52,
         86,
         57,
         83,
         57,
         92,
         50,
         71,
         56,
         81,
         53,
         25,
         54,
         75,
         50,
         87,
         52,
         73,
         52,
         64,
         57,
         95,
         57,
         64,
         50,
         81,
         56,
         80,
         53,
         23,
         54,
         25,
         50,
         98,
         52,
         74,
         52,
         80,
         57,
         69,
         57,
         65,
         50,
         20,
         56,
         102,
         53,
         80,
         54,
         94,
         50,
         90,
         52,
         76,
         52,
         21,
         57,
         101,
         57,
         90,
         50,
         93,
         56,
         82,
         53,
         77,
         54,
         25,
         50,
         93,
         52,
         74,
         52,
         21,
         57,
         66,
         57,
         75,
         50,
         68,
         56,
         81,
         53,
         25,
         54,
         23,
         50,
         89,
         52,
         93,
         52,
         76,
         57,
         22,
         57,
         107,
         50,
         123,
         56,
         97,
         53,
         107,
         54,
         114,
         50,
         119,
         52,
         97,
         52,
         21,
         57,
         95,
         57,
         92,
         50,
         20,
         56,
         87,
         53,
         81,
         54,
         88,
         50,
         70,
         52,
         22,
         49,
         80,
         53,
         89,
         56,
         84,
         50,
         27,
         48,
         78,
         49,
         90,
         53,
         91,
         56,
         73,
         50,
         76,
         48,
         90,
         49,
         95,
         53,
         95,
         56,
         92,
         50,
         91,
         48,
         77,
         49,
         29,
         53,
         87,
         56,
         76,
         50,
         65,
         48,
         81,
         49,
         29,
         53,
         122,
         56,
         80,
         50,
         86,
         48,
         92,
         49,
         93,
         53,
         69,
         56,
         92,
         50,
         118,
         48,
         81,
         49,
         82,
         53,
         66,
         49,
         64,
         53,
         66,
         56,
         86,
         50,
         71,
         48,
         92,
         49,
         87,
         53,
         125,
         56,
         92,
         50,
         76,
         48,
         120,
         49,
         70,
         53,
         66,
         56,
         81,
         50,
         90,
         48,
         75,
         49,
         90,
         53,
         76,
         56,
         92,
         50,
         81,
         49,
         87,
         56,
         95,
         54,
         94,
         52,
         25,
         48,
         78,
         49,
         93,
         56,
         93,
         54,
         67,
         52,
         78,
         48,
         90,
         49,
         88,
         56,
         89,
         54,
         86,
         52,
         89,
         48,
         77,
         49,
         26,
         56,
         103,
         54,
         90,
         52,
         90,
         48,
         73,
         49,
         77,
         56,
         115,
         54,
         95,
         52,
         94,
         48,
         92,
         49,
         90,
         56,
         68,
         56,
         103,
         56,
         89,
         54,
         85,
         49,
         64,
         57,
         65,
         48,
         24,
         48,
         85,
         56,
         93,
         48,
         80,
         56,
         85,
         56,
         94,
         54,
         76,
         49,
         16,
         57,
         91,
         48,
         87,
         48,
         67,
         56,
         93,
         48,
         93,
         56,
         16,
         56,
         94,
         54,
         87,
         49,
         68,
         57,
         24,
         48,
         74,
         48,
         83,
         56,
         66,
         48,
         92,
         56,
         68,
         56,
         16,
         54,
         89,
         49,
         86,
         57,
         76,
         48,
         93,
         48,
         68,
         56,
         17,
         48,
         88,
         56,
         69,
         56,
         68,
         54,
         80,
         49,
         95,
         57,
         74,
         48,
         81,
         48,
         76,
         56,
         80,
         48,
         77,
         56,
         89,
         56,
         95,
         54,
         86,
         49,
         16,
         57,
         93,
         48,
         86,
         48,
         82,
         56,
         84,
         48,
         93,
         50,
         83,
         57,
         88,
         56,
         91,
         57,
         24,
         54,
         69,
         48,
         80,
         55,
         85,
         54,
         73,
         54,
         79,
         50,
         83,
         57,
         91,
         56,
         95,
         57,
         83,
         54,
         92,
         48,
         77,
         55,
         22,
         54,
         117,
         54,
         95,
         50,
         83,
         57,
         82,
         56,
         88,
         57,
         69,
         54,
         87,
         48,
         117,
         55,
         81,
         54,
         95,
         54,
         83,
         50,
         83,
         57,
         78,
         56,
         85,
         57,
         90,
         54,
         87,
         50,
         95,
         57,
         89,
         56,
         119,
         57,
         67,
         54,
         70,
         48,
         81,
         55,
         116,
         54,
         86,
         54,
         69,
         50,
         68,
         49,
         97,
         49,
         70,
         48,
         80,
         51,
         66,
         52,
         76,
         49,
         65,
         49,
         8,
         48,
         17,
         51,
         64,
         52,
         88,
         49,
         94,
         49,
         91,
         48,
         85,
         51,
         22,
         52,
         20,
         49,
         18,
         49,
         66,
         48,
         80,
         51,
         95,
         52,
         93,
         49,
         18,
         49,
         89,
         48,
         84,
         51,
         79,
         49,
         101,
         52,
         67,
         55,
         86,
         54,
         70,
         50,
         70,
         49,
         69,
         52,
         13,
         55,
         23,
         54,
         68,
         50,
         82,
         49,
         90,
         52,
         94,
         55,
         83,
         54,
         18,
         50,
         30,
         49,
         22,
         52,
         81,
         55,
         69,
         54,
         87,
         50,
         86,
         49,
         22,
         52,
         92,
         55,
         82,
         54,
         75,
         50,
         19,
         49,
         30,
         52,
         103,
         55,
         69,
         54,
         91,
         50,
         94,
         49,
         83,
         52,
         23,
         55,
         100,
         54,
         71,
         50,
         64,
         49,
         22,
         52,
         113,
         55,
         94,
         54,
         92,
         50,
         87,
         49,
         83,
         52,
         69,
         55,
         23,
         54,
         83,
         50,
         93,
         49,
         82,
         52,
         23,
         55,
         121,
         54,
         112,
         50,
         103,
         49,
         22,
         52,
         117,
         55,
         78,
         54,
         66,
         50,
         82,
         49,
         69,
         52,
         68,
         55,
         23,
         54,
         71,
         50,
         93,
         49,
         87,
         52,
         65,
         55,
         86,
         54,
         91,
         50,
         95,
         49,
         87,
         52,
         85,
         55,
         91,
         54,
         87,
         50,
         26,
         56,
         106,
         54,
         77,
         55,
         81,
         56,
         71,
         57,
         77,
         57,
         69,
         57,
         13,
         48,
         24,
         51,
         90,
         56,
         81,
         54,
         92,
         55,
         83,
         56,
         88,
         57,
         81,
         57,
         88,
         57,
         80,
         48,
         24,
         51,
         20,
         56,
         25,
         54,
         120,
         55,
         83,
         56,
         71,
         57,
         81,
         57,
         64,
         57,
         86,
         48,
         76,
         51,
         80,
         56,
         87,
         54,
         94,
         55,
         16,
         56,
         95,
         57,
         81,
         57,
         85,
         57,
         82,
         48,
         86,
         51,
         74,
         56,
         92,
         54,
         23,
         55,
         30,
         56,
         29,
         51,
         100,
         48,
         64,
         55,
         89,
         56,
         76,
         51,
         66,
         48,
         71,
         55,
         2,
         56,
         24,
         51,
         94,
         48,
         90,
         55,
         78,
         56,
         89,
         51,
         91,
         48,
         93,
         55,
         92,
         56,
         24,
         51,
         26,
         48,
         20,
         55,
         118,
         56,
         87,
         51,
         23,
         48,
         66,
         55,
         89,
         56,
         84,
         51,
         94,
         48,
         80,
         55,
         24,
         56,
         83,
         51,
         82,
         48,
         77,
         55,
         24,
         56,
         87,
         51,
         89,
         48,
         20,
         55,
         76,
         56,
         80,
         51,
         94,
         48,
         71,
         55,
         24,
         56,
         91,
         51,
         91,
         48,
         93,
         55,
         93,
         56,
         86,
         51,
         67,
         48,
         26,
         51,
         122,
         48,
         91,
         55,
         92,
         56,
         77,
         51,
         91,
         48,
         81,
         55,
         75,
         56,
         24,
         51,
         68,
         48,
         64,
         55,
         89,
         56,
         65,
         51,
         23,
         48,
         91,
         55,
         94,
         56,
         94,
         51,
         23,
         48,
         65,
         55,
         86,
         56,
         76,
         51,
         94,
         48,
         88,
         55,
         24,
         56,
         89,
         51,
         23,
         48,
         66,
         55,
         89,
         56,
         84,
         51,
         94,
         48,
         80,
         55,
         24,
         56,
         83,
         51,
         82,
         48,
         77,
         55,
         24,
         56,
         81,
         51,
         68,
         48,
         20,
         55,
         89,
         56,
         91,
         51,
         84,
         48,
         81,
         55,
         72,
         56,
         76,
         51,
         82,
         48,
         80,
         55,
         22,
         49,
         114,
         50,
         91,
         57,
         66,
         56,
         86,
         53,
         75,
         49,
         23,
         50,
         76,
         57,
         89,
         56,
         70,
         53,
         75,
         49,
         23,
         50,
         94,
         57,
         83,
         56,
         74,
         53,
         25,
         49,
         94,
         50,
         91,
         57,
         22,
         56,
         80,
         53,
         81,
         49,
         86,
         50,
         65,
         57,
         12,
         56,
         19,
         53,
         23,
         49,
         92,
         50,
         80,
         57,
         79,
         56,
         19,
         53,
         96,
         49,
         120,
         50,
         96,
         57,
         100,
         56,
         120,
         53,
         124,
         49,
         110,
         51,
         22,
         48,
         26,
         54,
         94,
         57,
         86,
         50,
         74,
         51,
         26,
         50,
         89,
         57,
         84,
         56,
         72,
         52,
         29,
         48,
         31,
         56,
         82,
         52,
         92,
         55,
         77,
         49,
         23,
         57,
         82,
         55,
         87,
         49,
         72,
         49,
         102,
         48,
         87,
         55,
         66,
         49,
         64,
         48,
         80,
         49,
         71,
         48,
         18,
         55,
         69,
         49,
         88,
         48,
         84,
         49,
         67,
         48,
         83,
         55,
         89,
         49,
         90,
         48,
         84,
         49,
         87,
         48,
         94,
         55,
         85,
         49,
         22,
         48,
         90,
         49,
         71,
         48,
         18,
         55,
         91,
         49,
         83,
         48,
         76,
         49,
         21,
         48,
         64,
         55,
         85,
         49,
         92,
         48,
         80,
         49,
         86,
         48,
         70,
         55,
         85,
         49,
         82,
         48,
         27,
         49,
         97,
         57,
         86,
         50,
         81,
         49,
         92,
         56,
         78,
         54,
         97,
         55,
         80,
         48,
         70,
         49,
         82,
         56,
         82,
         50,
         23,
         49,
         91,
         48,
         84,
         55,
         65,
         54,
         18,
         55,
         70,
         48,
         81,
         49,
         68,
         56,
         22,
         50,
         69,
         49,
         85,
         48,
         91,
         55,
         93,
         54,
         81,
         55,
         69,
         48,
         85,
         49,
         83,
         56,
         24,
         50,
         23,
         49,
         117,
         48,
         95,
         55,
         76,
         54,
         87,
         55,
         67,
         48,
         16,
         49,
         86,
         56,
         22,
         50,
         89,
         49,
         85,
         48,
         70,
         55,
         24,
         54,
         89,
         55,
         84,
         48,
         73,
         49,
         25,
         54,
         65,
         50,
         92,
         53,
         89,
         48,
         71,
         57,
         79,
         54,
         81,
         53,
         89,
         52,
         89,
         55,
         92,
         54,
         88,
         50,
         65,
         54,
         91,
         50,
         84,
         53,
         93,
         48,
         89,
         54,
         93,
         50,
         80,
         53,
         77,
         48,
         25,
         57,
         65,
         54,
         91,
         53,
         88,
         52,
         64,
         55,
         64,
         54,
         85,
         50,
         89,
         53,
         93,
         48,
         82,
         57,
         88,
         54,
         70,
         53,
         27,
         52,
         95,
         55,
         73,
         54,
         83,
         50,
         91,
         53,
         107,
         48,
         90,
         57,
         83,
         54,
         92,
         53,
         64
      };
   }

   private static int pdkifbqxtvpqxmjj(int var0, int var1) {
      return var0 ^ var1;
   }
}
