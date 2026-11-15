package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.HitResult.Type;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class t {
   public static final t INSTANCE;
   private int previousSlot;
   private int switchBackTicks;
   private static int f9MyDn0K4KO;
   private transient int ppe62hM8e3;
   private static String gjgyypomdf = ByteBuffer.wrap(mrvjydzukiwszis()).asCharBuffer().toString();

   private t() {
super();
      int var8 = 1276595095 ^ 1140183643;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
            case 247924249:
               var8 = 688088840 ^ var8;
            case 1857021878:
               var8 = 815490849 ^ 1202441171 ^ Integer.parseInt("1372672566");
               this.ppe62hM8e3 = 732452417 ^ f9MyDn0K4KO;

               label22:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
                     case 190184314:
                        var8 = 662403204 ^ var8;
                        break label22;
                     case 230244938:
                        break;
                     case 1124360333:
                        break label22;
                     case 1963546590:
                     default:
                        throw new IllegalStateException();
                  }
               }

               byte var2 = -1;
               this.previousSlot = var2;
               byte var5 = -1;
               this.switchBackTicks = var5;
               return;
            case 728861317:
               break;
            case 946066676:
            default:
               throw new IllegalStateException();
         }
      }
   }

   public void tick(Minecraft var1) {
      int var117 = 932309528 ^ 749913 ^ 716792664;
      var117 = 456965776 ^ var117;
      byte var2 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var2 == (102712969 ^ var117)) {
         var117 = 696803510 ^ var117;
         this.reset();
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
               case 53342138:
               default:
                  throw new RuntimeException();
               case 96293951:
                  var117 ^= 1146975346;
               case 1323827528:
                  x var13 = x.INSTANCE;
                  v var15 = var13.maceSwap;
                  byte var16 = (byte)((var15.qo()) ? 1 : 0);
                  if (var16 == (1111634683 ^ var117)) {
                     var117 = 1893836627 ^ var117;
                     this.reset();
                     return;
                  }

                  var117 = 883484812 ^ var117;
                  LocalPlayer var18 = var1.player;
                  if (var18 == null) {
                     var117 = 1364281050 ^ var117;
                     return;
                  }

                  var117 = 1326824478 ^ var117;
                  MultiPlayerGameMode var20 = var1.gameMode;
                  if (var20 == null) {
                     var117 = 507837124 ^ var117;
                     return;
                  }

                  label238:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                        case 2563678:
                        default:
                           throw new RuntimeException();
                        case 6221716:
                           var117 ^= 1097044609;
                           break label238;
                        case 360790847:
                           break;
                        case 2108849733:
                           break label238;
                     }
                  }

                  Screen var22 = var1.screen;
                  if (var22 == null) {
                     var117 = 2116482503 ^ var117;
                     com.wimpyclient.g.g var23 = com.wimpyclient.g.g.INSTANCE;
                     byte var24 = (byte)((var23.isOpen()) ? 1 : 0);
                     if (var24 != (112853295 ^ var117)) {
                        var117 = 1821311470 ^ var117;
                        return;
                     }

                     var117 = zsmzdeqzzhrisyod(var117, 1649261940);
                     LocalPlayer var26 = var1.player;
                     LocalPlayer var6 = var26;
                     int var28 = this.switchBackTicks;
                     if (var28 >= (1693957211 ^ var117)) {
                        var117 = 1036046014 ^ var117;
                        int var107 = this.switchBackTicks;
                        byte var113 = (byte)(1496806116 ^ var117);
                        int var108 = var107 + var113;
                        this.switchBackTicks = var108;
                        int var85 = this.switchBackTicks;
                        int var110 = var13.maceSwapSwitchDelay;
                        if (var85 < var110) {
                           var117 = 1030304188 ^ var117;
                           return;
                        }

                        var117 = 1739658471 ^ var117;
                        int var87 = this.previousSlot;
                        if (var87 >= (1048995330 ^ var117)) {
                           var117 = 1642716916 ^ var117;
                           Inventory var89 = var26.getInventory();
                           int var112 = this.previousSlot;
                           var89.setSelectedSlot(var112);
                           this.reset();
                           var117 = 993131439 ^ var117;
                           return;
                        }

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                              case 153377573:
                                 var117 = 1524114779 ^ var117;
                                 return;
                              case 249740318:
                                 break;
                              case 778972807:
                              default:
                                 throw new RuntimeException();
                              case 1981244592:
                                 return;
                           }
                        }
                     }

                     label220:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                           case 60790791:
                              var117 ^= 1112372805;
                           case 232077197:
                              break label220;
                           case 2036948719:
                           default:
                              throw new RuntimeException();
                           case 2120546077:
                        }
                     }

                     Options var30 = var1.options;
                     KeyMapping var31 = var30.keyAttack;
                     byte var32 = (byte)((var31.isDown()) ? 1 : 0);
                     if (var32 == (649775646 ^ var117)) {
                        var117 = 665399421 ^ var117;
                        return;
                     }

                     var117 = zsmzdeqzzhrisyod(var117, 2237653);
                     HitResult var34 = var1.hitResult;
                     if (var34 == null) {
                        var117 = zsmzdeqzzhrisyod(var117, 1376035959);
                        return;
                     }

                     var117 = 2087359225 ^ var117;
                     Type var37 = var34.getType();
                     Type var3 = Type.ENTITY;
                     if (var37 != var3) {
                        var117 = 778974862 ^ var117;
                        return;
                     }

                     var117 = 1157864721 ^ var117;
                     EntityHitResult var39 = (EntityHitResult)var34;
                     Entity var40 = var39.getEntity();
                     if (var40 != null) {
                        var117 = 1135727419 ^ var117;
                        byte var43 = (byte)((var40.isAlive()) ? 1 : 0);
                        if (var43 == (1547711000 ^ var117)) {
                           var117 = 1847948242 ^ var117;
                           return;
                        }

                        var117 = zsmzdeqzzhrisyod(var117, 1564396086);
                        float var92 = 0.5F;
                        float var45 = var26.getAttackStrengthScale(var92);
                        float var93 = 1.0F;
                        float var164;
                        int var46 = (var164 = var45 - var93) == 0.0F ? 0 : (var164 < 0.0F ? -1 : 1);
                        if (var46 < (25098286 ^ var117)) {
                           var117 = 197327222 ^ var117;
                           return;
                        }

                        var117 = 299287321 ^ var117;
                        ItemStack var48 = var26.getMainHandItem();
                        Item var94 = Items.MACE;
                        byte var50 = (byte)((var48.is(var94)) ? 1 : 0);
                        if (var50 != (279460663 ^ var117)) {
                           var117 = 344488189 ^ var117;
                           return;
                        }

                        label256: {
                           var117 = 1163910939 ^ var117;
                           byte var52 = (byte)((var13.maceSwapOnlySword) ? 1 : 0);
                           if (var52 == (1442309164 ^ var117)) {
                              var117 = 219285804 ^ var117;
                              byte var54 = (byte)((var13.maceSwapOnlyAxe) ? 1 : 0);
                              if (var54 == (1491463424 ^ var117)) {
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                                       case 205333461:
                                          var117 ^= 1456815587;
                                          break label256;
                                       case 379153007:
                                          break;
                                       case 1607739882:
                                       default:
                                          throw new RuntimeException();
                                       case 1767478438:
                                          break label256;
                                    }
                                 }
                              }

                              var117 = 726594845 ^ var117;
                           } else {
                              label196:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                                    case 58151251:
                                       break label196;
                                    case 110108642:
                                       var117 ^= 643628081;
                                       break label196;
                                    case 1085330915:
                                    default:
                                       throw new RuntimeException();
                                    case 1490823229:
                                 }
                              }
                           }

                           byte var82;
                           label180: {
                              label257: {
                                 byte var56 = (byte)((var13.maceSwapOnlySword) ? 1 : 0);
                                 if (var56 != (1940592669 ^ var117)) {
                                    var117 = 714921675 ^ var117;
                                    TagKey var95 = ItemTags.SWORDS;
                                    byte var58 = (byte)((var48.is(var95)) ? 1 : 0);
                                    if (var58 != (1496829654 ^ var117)) {
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                                             case 215775625:
                                                var117 ^= 852495288;
                                                break label257;
                                             case 591461330:
                                             default:
                                                throw new RuntimeException();
                                             case 1085512877:
                                                break;
                                             case 1490531143:
                                                break label257;
                                          }
                                       }
                                    }

                                    var117 = 1420551175 ^ var117;
                                 } else {
                                    var117 = 2117546700 ^ var117;
                                 }

                                 byte var60 = (byte)((var13.maceSwapOnlyAxe) ? 1 : 0);
                                 if (var60 != (228338385 ^ var117)) {
                                    var117 = 1970429948 ^ var117;
                                    TagKey var96 = ItemTags.AXES;
                                    byte var62 = (byte)((var48.is(var96)) ? 1 : 0);
                                    if (var62 != (2028893485 ^ var117)) {
                                       var117 = 319402051 ^ var117;
                                       break label257;
                                    }

                                    var117 = zsmzdeqzzhrisyod(var117, 1325974883);
                                 } else {
                                    label170:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                                          case 74286152:
                                             break;
                                          case 173973352:
                                             var117 ^= 981113503;
                                          case 416816102:
                                             break label170;
                                          case 826797858:
                                          default:
                                             throw new RuntimeException();
                                       }
                                    }
                                 }

                                 var82 = (byte)(937865294 ^ var117);
                                 var117 = 345425908 ^ var117;
                                 break label180;
                              }

                              var82 = (byte)(1810351471 ^ var117);
                              var117 = 1217901268 ^ var117;
                           }

                           if (var82 == (594573242 ^ var117)) {
                              var117 = 1629215801 ^ var117;
                              return;
                           }

                           var117 = 759211865 ^ var117;
                        }

                        byte var64 = (byte)(-238080228 ^ var117);
                        int var114 = var64;
                        byte var65 = (byte)(238080227 ^ var117);
                        int var11 = var65;
                        var117 = 735605684 ^ var117;

                        label155:
                        while (true) {
                           byte var97 = (byte)(636003166 ^ var117);
                           if (var11 >= var97) {
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                                    case 158505360:
                                       var117 ^= 1048251558;
                                       break label155;
                                    case 523978459:
                                       break;
                                    case 1406092040:
                                    default:
                                       throw new RuntimeException();
                                    case 1647335406:
                                       break label155;
                                 }
                              }
                           }

                           var117 = 1758961324 ^ var117;
                           Inventory var68 = var6.getInventory();
                           ItemStack var69 = var68.getItem(var11);
                           Item var99 = Items.MACE;
                           byte var70 = (byte)((var69.is(var99)) ? 1 : 0);
                           if (var70 != (1295990267 ^ var117)) {
                              var117 = 544895501 ^ var117;
                              var114 = var11;
                              var117 = zsmzdeqzzhrisyod(var117, 1993793543);
                              break;
                           }

                           label152:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                                 case 95077673:
                                    var117 ^= 1183018858;
                                    break label152;
                                 case 426405021:
                                    break;
                                 case 458329053:
                                 default:
                                    throw new RuntimeException();
                                 case 2146582866:
                                    break label152;
                              }
                           }

                           var11 += 196891280 ^ var117;
                           var117 = 777318854 ^ var117;
                        }

                        if (var114 < (462663665 ^ var117)) {
                           var117 = 1133114000 ^ var117;
                           return;
                        }

                        var117 = 566516772 ^ var117;
                        Inventory var101 = var6.getInventory();
                        int var102 = var101.getSelectedSlot();
                        this.previousSlot = var102;
                        Inventory var75 = var6.getInventory();
                        var75.setSelectedSlot(var114);
                        boolean var77 = com.wimpyclient.p.h.attackNoPrediction(var1, var6, var40);
                        byte var79 = (byte)((var13.maceSwapSwitchBack) ? 1 : 0);
                        if (var79 != (978842581 ^ var117)) {
                           var117 = 1269263619 ^ var117;
                           byte var105 = (byte)(1911594710 ^ var117);
                           this.switchBackTicks = var105;
                           var117 = 1007700705 ^ var117;
                        } else {
                           var117 = zsmzdeqzzhrisyod(var117, 1863199303);
                           byte var106 = (byte)(-1431951763 ^ var117);
                           this.previousSlot = var106;
                           var117 = 414780837 ^ var117;
                        }

                        return;
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                           case 233094082:
                              var117 = 764715241 ^ var117;
                              return;
                           case 776486014:
                              return;
                           case 1045948624:
                           default:
                              throw new RuntimeException();
                           case 1478629150:
                        }
                     }
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var117)) {
                        case 162554397:
                           var117 = 313127977 ^ var117;
                           return;
                        case 777371017:
                           break;
                        case 934278671:
                        default:
                           throw new RuntimeException();
                        case 1082538705:
                           return;
                     }
                  }
               case 1191689132:
            }
         }
      }
   }

   private void reset() {
      int var7 = 1020673371 ^ 1317654459 ^ 716792664;
      var7 = 994943404 ^ var7;
      byte var2 = (byte)(-1672163349 ^ var7);
      this.previousSlot = var2;
      byte var4 = (byte)(-1672163349 ^ var7);
      this.switchBackTicks = var4;
   }

   static {
      int var6 = 78989267 ^ 803492209 ^ Integer.parseInt("1372672566");
      int var3 = new Random(-4493124731498456641L).nextInt();
      f9MyDn0K4KO = -1688585465 ^ var3;
      var6 = 71700969 ^ var6;
      t var0 = new t();
      INSTANCE = var0;
   }

   public static String oaicucsqqs(byte[] var0, int var1) {
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
      String var29 = gjgyypomdf;
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

   private static byte[] mrvjydzukiwszis() {
      return new byte[0];
   }

   private static int zsmzdeqzzhrisyod(int var0, int var1) {
      return var0 ^ var1;
   }
}
