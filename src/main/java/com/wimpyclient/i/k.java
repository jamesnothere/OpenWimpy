package com.wimpyclient.i;

import java.io.IOException;
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
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class k {
   public final Block block;
   public final String id;
   public final String label;
   public boolean enabled;
   public int red;
   public int green;
   public int blue;
   private static int nhCCQOitOY;
   private transient int f5a9lcTxE20;

   public k(Block var1, String var2, String var3, int var4, int var5, int var6) {
super();
      int var24 = 1519227446 ^ 846919741;
      
      var24 = iuwyyawyuscqsjor(var24, 1126760779);
      var24 = 2061050893 ^ 422212872 ^ Integer.parseInt("1210923589");
      this.f5a9lcTxE20 = 376531016 ^ nhCCQOitOY;
      var24 = 91887240 ^ var24;
      this.block = var1;
      this.id = var2;
      this.label = var3;
      boolean var18 = false;
      this.enabled = var18;
      this.red = var4;
      this.green = var5;
      this.blue = var6;
   }

   public String enableSettingName() {
      int var5 = 1362917721 ^ 1004188944 ^ 787312850;
      var5 = 2042542634 ^ var5;
      return this.label;
   }

   public String colorSettingName() {
      int var6 = 1866413869 ^ 651975941 ^ 787312850;
      var6 = 858493145 ^ var6;
      String var2 = this.label;
      return var2 + " Color";
   }

   public static List<k> allSelectable() {
      int var73 = 1274002336 ^ 1483428486 ^ 949754010;
      var73 = 1752216234 ^ var73;
      ArrayList var0 = new ArrayList();
      ArrayList var9 = var0;
      HashSet var17 = new HashSet();
      HashSet var10 = var17;
      DefaultedRegistry var18 = BuiltInRegistries.BLOCK;
      Iterator var19 = var18.iterator();
      Iterator var11 = var19;
      var73 = 1891184966 ^ var73;

      label71:
      while (true) {
         byte var21 = (byte)((var11.hasNext()) ? 1 : 0);
         if (var21 == (869364304 ^ var73)) {
            var73 = 1420047784 ^ var73;
            Function<k, String> var62 = var0x -> {
               int var7x = 1474476778 ^ 2043940145 ^ 949754010;
               var7x = 354550728 ^ var7x;
               String var3 = var0x.label;
               Locale var2 = Locale.ROOT;
               return var3.toLowerCase(var2);
            };
            Comparator var63 = Comparator.comparing(var62);
            var9.sort(var63);
            return var9;
         }

         var73 = 1594276829 ^ var73;
         Object var23 = var11.next();
         Block var24 = (Block)var23;
         byte var26 = (byte)((isSelectableBlock(var24)) ? 1 : 0);
         if (var26 != (1826081165 ^ var73)) {
            var73 = 1161994785 ^ var73;
            DefaultedRegistry var27 = BuiltInRegistries.BLOCK;
            Identifier var28 = var27.getKey(var24);
            if (var28 != null) {
               label68:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var73)) {
                     case 9545992:
                        var73 ^= 1495803847;
                        break label68;
                     case 725831828:
                        break;
                     case 1122159916:
                        break label68;
                     case 1936392363:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }

               String var15;
               String var31;
               label61: {
                  var31 = var28.toString();
                  MutableComponent var33 = var24.getName();
                  String var34 = var33.getString();
                  var15 = var34;
                  if (var34 != null) {
                     var73 = 394201664 ^ var73;
                     byte var37 = (byte)((var34.isBlank()) ? 1 : 0);
                     if (var37 == (1740785195 ^ var73)) {
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var73)) {
                              case 151519281:
                                 var73 ^= 669416725;
                              case 668872187:
                                 break label61;
                              case 1263412905:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1389898131:
                           }
                        }
                     }

                     var73 = 769485188 ^ var73;
                  } else {
                     var73 = 983720900 ^ var73;
                  }

                  String var39 = var28.getPath();
                  byte var54 = (byte)(1243557872 ^ var73);
                  byte var1 = (byte)(1243557775 ^ var73);
                  String var40 = var39.replace((char)var54, (char)var1);
                  var15 = var40;
                  var73 = 171644049 ^ var73;
               }

               Locale var64 = Locale.ROOT;
               String var56 = var15.toLowerCase(var64);
               byte var42 = (byte)((var10.add(var56)) ? 1 : 0);
               if (var42 == (1076116286 ^ var73)) {
                  var73 = 663217100 ^ var73;
                  String var58 = var28.getPath();
                  String var44 = var15 + " (" + var58 + ")";
                  var15 = var44;
                  Locale var65 = Locale.ROOT;
                  String var60 = var44.toLowerCase(var65);
                  boolean var46 = var10.add(var60);
                  var73 = 1915331189 ^ var73;
               } else {
                  var73 = iuwyyawyuscqsjor(var73, 1437483449);
               }

               int[] var48 = colorForId(var31);
               byte var6 = (byte)(361396871 ^ var73);
               int var66 = var48[var6];
               byte var7 = (byte)(361396870 ^ var73);
               int var68 = var48[var7];
               byte var8 = (byte)(361396869 ^ var73);
               int var70 = var48[var8];
               k var61 = new k(var24, var31, var15, var66, var68, var70);
               boolean var50 = var9.add(var61);

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var73)) {
                     case 163338479:
                        var73 ^= 643500247;
                        continue label71;
                     case 316878737:
                     default:
                        throw new RuntimeException(new IOException());
                     case 428113925:
                        break;
                     case 825190761:
                        continue label71;
                  }
               }
            } else {
               var73 = 22130847 ^ var73;
               var73 = 454404451 ^ var73;
            }
         } else {
            var73 = 660162260 ^ var73;
            var73 = iuwyyawyuscqsjor(var73, 2019556617);
         }
      }
   }

   public static Map<Block, k> indexByBlock(List<k> var0) {
      int var24 = 577724095 ^ 1884032578 ^ 949754010;
      var24 = 1973721325 ^ var24;
      int var19 = var0.size();
      byte var3 = (byte)(521916552 ^ var24);
      int var20 = var19 * var3;
      HashMap var1 = new HashMap(var20);
      HashMap var4 = var1;
      Iterator var8 = var0.iterator();
      Iterator var5 = var8;
      var24 = 736259367 ^ var24;

      while (true) {
         byte var10 = (byte)((var5.hasNext()) ? 1 : 0);
         if (var10 == (888782253 ^ var24)) {
            var24 = 1701707580 ^ var24;
            return var4;
         }

         var24 = 1528107947 ^ var24;
         Object var13 = var5.next();
         k var14 = (k)var13;
         Block var18 = var14.block;
         Object var16 = var4.put(var18, var14);
         var24 = iuwyyawyuscqsjor(var24, 1528107947);
      }
   }

   public static boolean isSelectableBlock(Block var0) {
      int var39 = 308486452 ^ 1565071480 ^ 949754010;
      var39 = 327714491 ^ var39;
      Block var2 = Blocks.AIR;
      if (var0 == var2) {
         var39 = iuwyyawyuscqsjor(var39, 1380903158);
         return (((byte)(913330075 ^ var39)) != 0);
      } else {
         var39 = 1422638446 ^ var39;
         Block var32 = Blocks.CAVE_AIR;
         if (var0 != var32) {
            var39 = 1465994113 ^ var39;
            Block var33 = Blocks.VOID_AIR;
            if (var0 == var33) {
               var39 = 1373904409 ^ var39;
               return (((byte)(913330075 ^ var39)) != 0);
            } else {
               var39 = 986689652 ^ var39;
               BlockState var9 = var0.defaultBlockState();
               byte var10 = (byte)((var9.isAir()) ? 1 : 0);
               if (var10 != (1566302710 ^ var39)) {
                  var39 = 494087150 ^ var39;
                  return (((byte)(1076415000 ^ var39)) != 0);
               } else {
                  label89:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                        case 4244865:
                           break;
                        case 81942679:
                           var39 ^= 304922749;
                           break label89;
                        case 411071200:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1219062846:
                           break label89;
                     }
                  }

                  String var13 = var0.getDescriptionId();
                  if (var13 != null) {
                     var39 = 1509133506 ^ var39;
                     String var34 = qgviyfiqmi(bfoyrdsazimwihy(), jmpfiipueojqhzf(), var39);
                     byte var16 = (byte)((var13.startsWith(var34)) ? 1 : 0);
                     if (var16 != (377793865 ^ var39)) {
                        var39 = 799090831 ^ var39;
                        return (((byte)(958760390 ^ var39)) != 0);
                     }

                     var39 = iuwyyawyuscqsjor(var39, 261290766);
                  } else {
                     var39 = 1449228236 ^ var39;
                  }

                  Item var19 = var0.asItem();
                  if (var19 != null) {
                     var39 = 629706510 ^ var39;
                     Item var35 = Items.AIR;
                     if (var19 == var35) {
                        var39 = 749694855 ^ var39;
                        return (((byte)(271693519 ^ var39)) != 0);
                     } else {
                        var39 = iuwyyawyuscqsjor(var39, 1477565206);
                        byte var24 = (byte)((var19 instanceof BlockItem) ? 1 : 0);
                        if (var24 == (1687093855 ^ var39)) {
                           var39 = iuwyyawyuscqsjor(var39, 139858126);
                           return (((byte)(1826165393 ^ var39)) != 0);
                        } else {
                           var39 = 425428183 ^ var39;
                           BlockItem var26 = (BlockItem)var19;

                           label70:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                                 case 63682931:
                                    var39 ^= 282970636;
                                    break label70;
                                 case 412544458:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 814520267:
                                    break label70;
                                 case 1432461421:
                              }
                           }

                           Block var28 = var26.getBlock();
                           if (var28 != var0) {
                              var39 = iuwyyawyuscqsjor(var39, 1924356244);
                              byte var56 = (byte)(532288528 ^ var39);
                              var39 = 795262594 ^ var39;
                              return (var56 != 0);
                           } else {
                              var39 = 1752198419 ^ var39;
                              byte var29 = (byte)(91824534 ^ var39);

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                                    case 86084100:
                                       var39 = 900041477 ^ var39;
                                       return (var29 != 0);
                                    case 275068314:
                                       return (var29 != 0);
                                    case 768981405:
                                       break;
                                    case 931825239:
                                    default:
                                       throw new RuntimeException(new IOException());
                                 }
                              }
                           }
                        }
                     }
                  } else {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                           case 10182207:
                              var39 ^= 153608329;
                              return (((byte)(271693519 ^ var39)) != 0);
                           case 57473338:
                           default:
                              throw new RuntimeException(new IOException());
                           case 986381614:
                              return (((byte)(271693519 ^ var39)) != 0);
                           case 1240341264:
                        }
                     }
                  }
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                  case 128083240:
                  default:
                     throw new RuntimeException(new IOException());
                  case 159199614:
                     break;
                  case 249221776:
                     var39 ^= 109401496;
                     return (((byte)(913330075 ^ var39)) != 0);
                  case 1843225011:
                     return (((byte)(913330075 ^ var39)) != 0);
               }
            }
         }
      }
   }

   public static Block canonicalBlock(Block var0) {
      int var19 = 1727992363 ^ 1762200463 ^ 949754010;
      var19 = 2043956033 ^ var19;
      Item var6 = var0.asItem();
      byte var8 = (byte)((var6 instanceof BlockItem) ? 1 : 0);
      if (var8 != (1321093759 ^ var19)) {
         var19 = 1278434345 ^ var19;
         BlockItem var10 = (BlockItem)var6;
         Block var12 = var10.getBlock();
         if (var12 != null) {
            var19 = 1234392933 ^ var19;
            Block var2 = Blocks.AIR;
            if (var12 != var2) {
               var19 = 161995175 ^ var19;
               return var12;
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
                     case 25875788:
                        var19 = 821527246 ^ var19;
                        return var0;
                     case 626431420:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1562438381:
                        break;
                     case 1662627887:
                        return var0;
                  }
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
                  case 1740450:
                     return var0;
                  case 40126077:
                     var19 = 2036651435 ^ var19;
                     return var0;
                  case 1091645313:
                     break;
                  case 1616282285:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }
      } else {
         var19 = iuwyyawyuscqsjor(var19, 894929282);
         return var0;
      }
   }

   public static k settingsFor(Block var0, Map<Block, k> var1) {
      int var9 = 1846995112 ^ 1493499460 ^ 949754010;
      var9 = 1660385636 ^ var9;
      Block var6 = canonicalBlock(var0);
      Object var4 = var1.get(var6);
      return (k)var4;
   }

   public static boolean matchesSearch(k var0, String var1) {
      int var41 = 1133485498 ^ 367608855 ^ 949754010;
      var41 = 606930107 ^ var41;
      if (var1 != null) {
         var41 = 110286206 ^ var41;
         byte var7 = (byte)((var1.isBlank()) ? 1 : 0);
         if (var7 != (1279594738 ^ var41)) {
            var41 = 157465954 ^ var41;
            return (((byte)(1160228241 ^ var41)) != 0);
         } else {
            var41 = 1571463240 ^ var41;
            String var9 = var1.trim();
            Locale var3 = Locale.ROOT;
            String var10 = var9.toLowerCase(var3);
            String var12 = var0.label;
            Locale var27 = Locale.ROOT;
            String var13 = var12.toLowerCase(var27);
            byte var14 = (byte)((var13.contains(var10)) ? 1 : 0);
            if (var14 != (300921018 ^ var41)) {
               var41 = 688184901 ^ var41;
               return (((byte)(954953470 ^ var41)) != 0);
            } else {
               label40:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                     case 46167943:
                        var41 ^= 71600770;
                     case 139408587:
                        break label40;
                     case 650592745:
                        break;
                     case 1065895600:
                     default:
                        throw new RuntimeException();
                  }
               }

               String var17 = var0.id;
               Locale var29 = Locale.ROOT;
               String var18 = var17.toLowerCase(var29);
               byte var19 = (byte)((var18.contains(var10)) ? 1 : 0);
               if (var19 == (363543096 ^ var41)) {
                  var41 = 1503572677 ^ var41;
                  String var21 = var0.id;
                  String var32 = var0.id;
                  byte var4 = (byte)(1278576839 ^ var41);
                  int var33 = var32.indexOf(var4);
                  byte var37 = (byte)(1278576892 ^ var41);
                  int var34 = var33 + var37;
                  String var22 = var21.substring(var34);
                  byte var35 = (byte)(1278576802 ^ var41);
                  byte var38 = (byte)(1278576861 ^ var41);
                  String var23 = var22.replace((char)var35, (char)var38);
                  byte var24 = (byte)((var23.contains(var10)) ? 1 : 0);
                  if (var24 == (1278576893 ^ var41)) {
                     var41 = iuwyyawyuscqsjor(var41, 255159125);
                     byte var25 = (byte)(1124131752 ^ var41);
                     var41 = 1175267480 ^ var41;
                     return (var25 != 0);
                  }

                  var41 = 847440488 ^ var41;
               } else {
                  var41 = 1797019821 ^ var41;
               }

               byte var51 = (byte)(2125947540 ^ var41);
               var41 = iuwyyawyuscqsjor(var41, 2075830693);
               return (var51 != 0);
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
               case 16925800:
                  var41 ^= 267413532;
                  return (((byte)(1160228241 ^ var41)) != 0);
               case 175567429:
               default:
                  throw new RuntimeException();
               case 1967135645:
                  break;
               case 1973086522:
                  return (((byte)(1160228241 ^ var41)) != 0);
            }
         }
      }
   }

   public static int[] colorForId(String var0) {
      int var90 = 919466208 ^ 1988238960 ^ 949754010;
      var90 = 1325615632 ^ var90;
      int var11 = var0.hashCode();
      byte var3 = (byte)(936426506 ^ var90);
      int var36 = var11 >>> var3;
      int var13 = var11 ^ var36;
      int var37 = 1211861303 ^ var90;
      int var15 = var13 * var37;
      byte var58 = (byte)(936426517 ^ var90);
      int var39 = var15 >>> var58;
      int var17 = var15 ^ var39;
      int var40 = -1279518063 ^ var90;
      int var19 = var17 * var40;
      byte var59 = (byte)(936426506 ^ var90);
      int var42 = var19 >>> var59;
      int var21 = var19 ^ var42;
      int var43 = 936395749 ^ var90;
      int var23 = var21 & var43;
      long var24 = Integer.toUnsignedLong(var23);
      float var26 = (float)var24;
      float var44 = 65535.0F;
      float var27 = var26 / var44;
      float var28 = 0.58F;
      byte var60 = (byte)(936426506 ^ var90);
      int var46 = var21 >>> var60;
      byte var61 = (byte)(936426597 ^ var90);
      int var47 = var46 & var61;
      float var48 = var47;
      float var62 = 127.0F;
      float var49 = var48 / var62;
      float var63 = 0.32F;
      float var50 = var49 * var63;
      float var29 = var28 + var50;
      float var30 = 0.84F;
      byte var64 = (byte)(936426509 ^ var90);
      int var52 = var21 >>> var64;
      byte var65 = (byte)(936426533 ^ var90);
      int var53 = var52 & var65;
      float var54 = var53;
      float var66 = 63.0F;
      float var55 = var54 / var66;
      float var67 = 0.16F;
      float var56 = var55 * var67;
      float var31 = var30 + var56;
      int var33 = com.wimpyclient.j.b.hsvToRgb(var27, var29, var31);
      byte var34 = (byte)(936426521 ^ var90);
      int[] var35 = new int[var34];
      byte var69 = (byte)(936426522 ^ var90);
      byte var5 = (byte)(936426506 ^ var90);
      int var72 = var33 >> var5;
      short var79 = (short)(936426725 ^ var90);
      int var73 = var72 & var79;
      var35[var69] = var73;
      byte var70 = (byte)(936426523 ^ var90);
      byte var80 = (byte)(936426514 ^ var90);
      int var75 = var33 >> var80;
      short var81 = (short)(936426725 ^ var90);
      int var76 = var75 & var81;
      var35[var70] = var76;
      byte var71 = (byte)(936426520 ^ var90);
      short var82 = (short)(936426725 ^ var90);
      int var78 = var33 & var82;
      var35[var71] = var78;
      return var35;
   }

   static {
      int var3 = new Random(-1797832016260120897L).nextInt();
      nhCCQOitOY = -887402403 ^ var3;
   }

   public static String qgviyfiqmi(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] jmpfiipueojqhzf() {
      return new byte[]{
         83,
         59,
         73,
         73,
         103,
         86,
         18,
         57,
         58,
         35,
         118,
         32,
         49,
         39,
         42,
         51,
         21,
         108,
         75,
         115,
         76,
         12,
         18,
         39,
         59,
         48,
         64,
         52,
         24,
         39,
         17,
         127,
         61,
         84,
         46,
         84,
         45,
         87,
         61,
         57,
         2,
         98,
         109,
         55,
         50,
         64,
         31,
         21,
         105,
         6,
         114,
         52,
         108,
         60,
         54,
         95,
         114,
         103,
         44,
         58,
         73,
         49,
         70,
         82,
         35,
         25,
         94,
         55,
         44,
         109,
         44,
         127,
         75,
         12,
         69,
         18,
         88,
         88,
         76,
         1,
         80,
         9,
         38,
         84,
         125,
         9,
         13,
         23,
         72,
         117,
         119,
         114,
         1,
         8,
         67,
         49,
         78,
         8,
         62,
         34,
         31,
         116,
         127,
         60,
         19,
         49,
         79,
         42,
         9,
         62,
         121,
         77,
         27,
         19,
         25,
         18,
         100,
         55,
         114,
         98,
         5,
         50,
         98,
         118,
         61
      };
   }

   private static byte[] bfoyrdsazimwihy() {
      return new byte[]{-98, -13, 126, 23, 94, 17, 42, 106, 15, 125, 65, 57};
   }

   private static int iuwyyawyuscqsjor(int var0, int var1) {
      return var1 ^ var0;
   }
}
