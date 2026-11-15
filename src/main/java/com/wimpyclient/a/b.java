package com.wimpyclient.a;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.nio.file.OpenOption;
import java.nio.file.LinkOption;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b {
   private static final Gson GSON;
   private static final Path PATH;
   private static final List<a> ACCOUNTS;
   private static int f54SVT25cyS;
   private transient int E6gaYvqvby;
   private static byte[] vkoecblxpu = mhzhqpeqpvtdwoq();

   private b() {
super();
      int var4 = 258308224 ^ 1437707334;
      
      var4 = 543139018 ^ var4;
      var4 = 1827793385 ^ 1989553964 ^ Integer.parseInt("1626126025");
      this.E6gaYvqvby = 103214394 ^ f54SVT25cyS;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 225334172:
               var4 = 106297718 ^ var4;
            case 920677008:
               return;
            case 226585381:
            default:
               throw new RuntimeException();
            case 870813129:
         }
      }
   }

   public static List<a> accounts() {
      int var4 = 1698221358 ^ 1320686391 ^ 1838389921;
      var4 = 1348993079 ^ var4;
      List var0 = ACCOUNTS;
      return Collections.unmodifiableList(var0);
   }

   public static synchronized void load() {
      int var75 = 1842511861 ^ (190467987 ^ 1838389921);
      var75 = 1141788901 ^ var75;
      List var0 = ACCOUNTS;
      var0.clear();
      Path var12 = PATH;

      try {
         byte var1 = (byte)(1326840354 ^ var75);
         LinkOption[] var59 = new LinkOption[var1];
         boolean var13 = Files.isRegularFile(var12, var59);
         if (var13 == ((1326840354 ^ var75) != 0)) {
            var75 = 1700902059 ^ var75;
            return;
         }

         var75 = 707184893 ^ var75;
         try (BufferedReader var5 = Files.newBufferedReader(PATH)) {
            var75 = 1762013695 ^ var75;
            Gson var16 = GSON;
            JsonObject var6 = (JsonObject)var16.fromJson(var5, JsonObject.class);
            if (var6 != null) {
               var75 = 2045931977 ^ var75;
               String var61 = txxvlxkaxx(jotlsndrdfoivod(), var75);
               boolean var21 = var6.has(var61);
               if (var21 != ((1976005353 ^ var75) != 0)) {
                  var75 = 1972795748 ^ var75;
                  String var62 = txxvlxkaxx(hccmsrotxtdfykf(), var75);
                  JsonElement var23 = var6.get(var62);
                  boolean var24 = var23.isJsonArray();
                  if (var24 != ((5311373 ^ var75) != 0)) {
                     var75 = 1785775733 ^ var75;
                     String var63 = txxvlxkaxx(esfpdgcougunchd(), var75);
                     JsonArray var26 = var6.getAsJsonArray(var63);
                     Iterator var27 = var26.iterator();
                     var75 = 1806732012 ^ var75;

                     while (var27.hasNext()) {
                        var75 = 1265462353 ^ var75;
                        JsonElement var32 = (JsonElement)var27.next();
                        if (var32.isJsonObject() == ((1258040133 ^ var75) != 0)) {
                           var75 = 1294969588 ^ var75;
                           var75 = 105039525 ^ var75;
                           continue;
                        }

                        var75 = 1386268625 ^ var75;
                        JsonObject var9 = var32.getAsJsonObject();
                        String var10 = string(var9, txxvlxkaxx(skacidaxevunlvk(), var75));
                        String var11 = string(var9, txxvlxkaxx(dzfuavrarokcvlw(), var75));
                        if (var10.isEmpty() != ((408743060 ^ var75) != 0)) {
                           var75 = 432909184 ^ var75;
                           continue;
                        }

                        var75 = 1592375816 ^ var75;
                        if (var11.isEmpty() == ((1186289308 ^ var75) != 0)) {
                           var75 = 462589535 ^ var75;
                           var75 = oqaxouytnrptfskm(var75, 1555472343);
                           continue;
                        }

                        var75 = 1236491161 ^ var75;
                        List var45 = ACCOUNTS;
                        a var66 = new a(var10, var11);
                        var45.add(var66);
                        var75 = 244795921 ^ var75;
                     }

                     var75 = 476321255 ^ var75;
                  }
               }
            }
         }

         var75 = 914956966 ^ var75;
         var75 = oqaxouytnrptfskm(var75, 729682597);
      } catch (Throwable var67) {
         // compiled exception handlers all route through the dispatcher and swallow
      }
   }

   public static synchronized void save() {
      int var65 = 1550774762 ^ (982578905 ^ 1838389921);
      var65 = 348000426 ^ var65;

      try {
         JsonObject var2 = new JsonObject();
         JsonArray var3 = new JsonArray();
         Iterator var4 = ACCOUNTS.iterator();
         var65 = 1949381286 ^ var65;

         while (var4.hasNext()) {
            var65 = 2042247444 ^ var65;
            a var5 = (a)var4.next();
            if (var5.username().isBlank() != ((307791498 ^ var65) != 0)) {
               var65 = 2042247444 ^ var65;
               continue;
            }

            var65 = 1489605197 ^ var65;
            if (var5.refreshToken().isBlank() == ((1251022023 ^ var65) != 0)) {
               var65 = 1085004897 ^ var65;
               var65 = 1641576248 ^ var65;
               continue;
            }

            var65 = oqaxouytnrptfskm(var65, 1687996618);
            JsonObject var6 = new JsonObject();
            String var42 = txxvlxkaxx(ezkkpfxaoxahjeh(), var65);
            var6.addProperty(var42, var5.username());
            String var43 = txxvlxkaxx(ghfoojaxqvaamev(), var65);
            var6.addProperty(var43, var5.refreshToken());
            var3.add(var6);
            var65 = oqaxouytnrptfskm(var65, 1173316499);
         }

         var65 = 1044300246 ^ var65;
         String var45 = txxvlxkaxx(diovkbdytqzfyog(), var65);
         var2.add(var45, var3);
         var65 = 205629520 ^ var65;
         Path var26 = PATH;
         Path var27 = var26.getParent();
         FileAttribute[] var47 = new FileAttribute[0];
         Files.createDirectories(var27, var47);
         Path var29 = PATH;
         OpenOption[] var49 = new OpenOption[0];
         BufferedWriter var59 = Files.newBufferedWriter(var29, var49);

         try {
            GSON.toJson(var2, var59);
         } finally {
            var59.close();
         }

         var65 = 874093069 ^ var65;
         var65 = oqaxouytnrptfskm(var65, 1195670459);
      } catch (Throwable var60) {
         // compiled exception handlers all route through the dispatcher and swallow
      }
   }

   public static synchronized a addOrUpdate(String var0, String var1) {
      int var28 = 989073114 ^ 894178052 ^ 1838389921;
      var28 = 1973845950 ^ var28;
      if (var0 != null) {
         var28 = 446083995 ^ var28;
         byte var8 = (byte)((var0.isBlank()) ? 1 : 0);
         if (var8 == (219892570 ^ var28)) {
            var28 = 1739124489 ^ var28;
            if (var1 != null) {
               var28 = 133094365 ^ var28;
               byte var11 = (byte)((var1.isBlank()) ? 1 : 0);
               if (var11 == (1834844046 ^ var28)) {
                  var28 = oqaxouytnrptfskm(var28, 828938660);
                  a var13 = findIgnoreCase(var0);
                  if (var13 != null) {
                     var28 = 1416302805 ^ var28;
                     var13.setRefreshToken(var1);
                     save();
                     return var13;
                  }

                  var28 = 1879405785 ^ var28;
                  String var24 = var0.trim();
                  String var25 = var1.trim();
                  a var15 = new a(var24, var25);
                  List var16 = ACCOUNTS;
                  boolean var17 = var16.add(var15);
                  save();
                  return var15;
               }

               var28 = 1518309927 ^ var28;
            } else {
               var28 = oqaxouytnrptfskm(var28, 1569802746);
            }
         } else {
            var28 = oqaxouytnrptfskm(var28, 976856819);
         }
      } else {
         var28 = 548345192 ^ var28;
      }

      return null;
   }

   public static synchronized void remove(a var0) {
      int var6 = 773551735 ^ 2030693494 ^ 1838389921;
      var6 = 798872793 ^ var6;
      List var1 = ACCOUNTS;
      boolean var3 = var1.remove(var0);
      save();
   }

   public static synchronized a findIgnoreCase(String var0) {
      int var29 = 561034514 ^ 219938762 ^ 1838389921;
      var29 = 1388455991 ^ var29;
      if (var0 != null) {
         var29 = 972536499 ^ var29;
         byte var7 = (byte)((var0.isBlank()) ? 1 : 0);
         if (var7 != (718095101 ^ var29)) {
            var29 = 450192116 ^ var29;
            return null;
         } else {
            label55:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                  case 11055673:
                     break label55;
                  case 49126151:
                     var29 ^= 162732814;
                     break label55;
                  case 573729898:
                     break;
                  case 1409885556:
                  default:
                     throw new IllegalStateException();
               }
            }

            String var10 = var0.trim();
            Locale var2 = Locale.ROOT;
            String var11 = var10.toLowerCase(var2);
            String var3 = var11;
            List var12 = ACCOUNTS;
            Iterator var13 = var12.iterator();
            Iterator var4 = var13;
            var29 = 1406690904 ^ var29;

            label48:
            while (true) {
               byte var15 = (byte)((var4.hasNext()) ? 1 : 0);
               if (var15 == (1889943467 ^ var29)) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                        case 172125181:
                           var29 = 848177137 ^ var29;
                           return null;
                        case 681257351:
                        default:
                           throw new IllegalStateException();
                        case 944183468:
                           break;
                        case 1354827744:
                           return null;
                     }
                  }
               }

               var29 = 2138461646 ^ var29;
               Object var18 = var4.next();
               a var19 = (a)var18;
               String var21 = var19.username();
               Locale var25 = Locale.ROOT;
               String var22 = var21.toLowerCase(var25);
               byte var23 = (byte)((var22.equals(var3)) ? 1 : 0);
               if (var23 != (265316965 ^ var29)) {
                  var29 = 213816610 ^ var29;
                  return var19;
               }

               var29 = 1652777727 ^ var29;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                     case 63999481:
                        var29 ^= 502609713;
                        continue label48;
                     case 1131538800:
                     default:
                        throw new IllegalStateException();
                     case 1337130934:
                        continue label48;
                     case 1956489744:
                  }
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
               case 54093148:
               default:
                  throw new IllegalStateException();
               case 88232493:
                  var29 = 589486151 ^ var29;
                  return null;
               case 603875903:
                  return null;
               case 1765230773:
            }
         }
      }
   }

   public static List<a> parseCombos(String var0) {
      int var32 = 594012011 ^ 863009031 ^ 1838389921;
      var32 = 1274601939 ^ var32;
      ArrayList var1 = new ArrayList();
      ArrayList var2 = var1;
      if (var0 != null) {
         var32 = 1364194750 ^ var32;
         byte var10 = (byte)((var0.isBlank()) ? 1 : 0);
         if (var10 == (1731399840 ^ var32)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
                  case 133338885:
                     var32 ^= 409797618;
                  case 55596930:
                     String var26 = txxvlxkaxx(utagolmpsesiiwi(), var32);
                     String[] var13 = var0.split(var26);
                     String[] var3 = var13;
                     int var15 = var13.length;
                     int var4 = var15;
                     byte var16 = (byte)(2136871762 ^ var32);
                     int var5 = var16;
                     var32 = 1212452715 ^ var32;

                     label48:
                     while (var5 < var4) {
                        var32 ^= 1789796899;
                        String var20 = var3[var5];
                        a var22 = parseCombo(var20);
                        if (var22 != null) {
                           var32 = 1584225282 ^ var32;
                           boolean var25 = var2.add(var22);
                           var32 = 987249239 ^ var32;
                        } else {
                           label33:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
                                 case 93220326:
                                    var32 ^= 1689609813;
                                    break label33;
                                 case 1319557157:
                                    break;
                                 case 1770451855:
                                    break label33;
                                 case 1773673160:
                                 default:
                                    throw new RuntimeException();
                              }
                           }
                        }

                        var5 += 956422222 ^ var32;

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
                              case 242461208:
                                 var32 ^= 236668022;
                                 continue label48;
                              case 1134915943:
                                 break;
                              case 1896375257:
                              default:
                                 throw new RuntimeException();
                              case 1944041421:
                                 continue label48;
                           }
                        }
                     }

                     var32 = 342648233 ^ var32;
                     return var2;
                  case 1116949931:
                  default:
                     throw new RuntimeException();
                  case 1246018310:
               }
            }
         }

         var32 = 913359573 ^ var32;
      } else {
         var32 = 1732196203 ^ var32;
      }

      return var1;
   }

   public static a parseCombo(String var0) {
      int var40 = 1715537293 ^ 246620743 ^ 1838389921;
      var40 = 575737271 ^ var40;
      if (var0 == null) {
         var40 = 699099918 ^ var40;
         return null;
      } else {
         var40 = 1468259228 ^ var40;
         String var10 = var0.trim();
         byte var2 = (byte)(1890806650 ^ var40);
         int var12 = var10.indexOf(var2);
         if (var12 > (1890806592 ^ var40)) {
            var40 = 1987500968 ^ var40;
            int var30 = var10.length();
            byte var3 = (byte)(113619177 ^ var40);
            int var31 = var30 - var3;
            if (var12 < var31) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                     case 106517276:
                        var40 ^= 791815862;
                     case 300845106:
                        byte var32 = (byte)(704091742 ^ var40);
                        String var16 = var10.substring(var32, var12);
                        String var17 = var16.trim();
                        byte var36 = (byte)(704091743 ^ var40);
                        int var34 = var12 + var36;
                        String var19 = var10.substring(var34);
                        String var20 = var19.trim();
                        byte var22 = (byte)((var17.isEmpty()) ? 1 : 0);
                        if (var22 != (704091742 ^ var40)) {
                           var40 = oqaxouytnrptfskm(var40, 1261501768);
                           return null;
                        }

                        var40 = 306054978 ^ var40;
                        byte var24 = (byte)((var20.isEmpty()) ? 1 : 0);
                        if (var24 != (1003065628 ^ var40)) {
                           var40 = 1494153738 ^ var40;
                           return null;
                        }

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                              case 29014498:
                              default:
                                 throw new RuntimeException();
                              case 64402159:
                                 var40 = 810504447 ^ var40;
                                 return new a(var17, var20);
                              case 1665397163:
                                 return new a(var17, var20);
                              case 1791304611:
                           }
                        }
                     case 1560615825:
                        break;
                     case 1575842673:
                     default:
                        throw new RuntimeException();
                  }
               }
            }

            var40 = 613877932 ^ var40;
         } else {
            var40 = oqaxouytnrptfskm(var40, 1390531332);
         }

         return null;
      }
   }

   private static String string(JsonObject var0, String var1) {
      int var19 = 1829721022 ^ 338825073 ^ 1838389921;
      var19 = 749468720 ^ var19;
      byte var5 = (byte)((var0.has(var1)) ? 1 : 0);
      if (var5 != (939866718 ^ var19)) {
         var19 = 1417811241 ^ var19;
         JsonElement var7 = var0.get(var1);
         byte var8 = (byte)((var7.isJsonNull()) ? 1 : 0);
         if (var8 == (1820798839 ^ var19)) {
            var19 = 1557519361 ^ var19;

            try {
               JsonElement var10 = var0.get(var1);
               String var11 = var10.getAsString();
               var19 ^= 584043591;
               return var11;
            } catch (Exception var20) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var19)) {
                  case -2103993423:
                     var19 = 708800445 ^ var19;
                     return txxvlxkaxx(rhwnjjfadimjvif(), var19);
                  default:
                     throw new RuntimeException("Error in hash");
               }
            }
         } else {
            var19 = 1701308860 ^ var19;
            return txxvlxkaxx(ztxsujzlboamuam(), var19);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
               case 210376979:
                  var19 ^= 837155989;
                  return txxvlxkaxx(ztxsujzlboamuam(), var19);
               case 335122654:
                  return txxvlxkaxx(ztxsujzlboamuam(), var19);
               case 1010319870:
                  break;
               case 1413084936:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   static {
      int var13 = 1959393189 ^ 403148007 ^ Integer.parseInt("1626126025");
      int var10 = new Random(-5336033830846008627L).nextInt();
      f54SVT25cyS = 1169358569 ^ var10;
      var13 = 957915942 ^ var13;
      GsonBuilder var0 = new GsonBuilder();
      GsonBuilder var1 = var0.setPrettyPrinting();
      Gson var2 = var1.create();
      GSON = var2;
      FabricLoader var3 = FabricLoader.getInstance();
      Path var4 = var3.getConfigDir();
      String var7 = txxvlxkaxx(wyhjukyugutvwis(), var13);
      Path var5 = var4.resolve(var7);
      PATH = var5;
      ArrayList var6 = new ArrayList();
      ACCOUNTS = var6;
   }

   public static String txxvlxkaxx(byte[] var0, int var1) {
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
         byte[] var27 = vkoecblxpu;
         byte[] var34 = vkoecblxpu;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] mhzhqpeqpvtdwoq() {
      return new byte[]{
         1,
         36,
         45,
         111,
         113,
         101,
         107,
         46,
         75,
         106,
         6,
         117,
         6,
         24,
         1,
         112,
         124,
         1,
         66,
         25,
         31,
         105,
         57,
         90,
         35,
         70,
         104,
         46,
         100,
         27,
         104,
         108,
         40,
         51,
         23,
         98,
         14,
         85,
         39,
         125,
         3,
         64,
         5,
         51,
         19,
         52,
         6,
         97,
         53,
         3,
         9,
         6,
         81,
         12,
         49,
         72,
         29,
         45,
         99,
         39,
         63,
         49,
         77,
         87,
         28,
         74,
         26,
         93,
         38,
         98,
         86
      };
   }

   private static byte[] wyhjukyugutvwis() {
      return new byte[]{
         -57,
         -30,
         30,
         40,
         67,
         61,
         83,
         117,
         114,
         34,
         63,
         63,
         54,
         73,
         48,
         36,
         74,
         81,
         122,
         69,
         44,
         55,
         11,
         31,
         27,
         93,
         81,
         119,
         93,
         75,
         88,
         61,
         25,
         100,
         33,
         46,
         54,
         2,
         20,
         57,
         49,
         2,
         61,
         43,
         42,
         102,
         63,
         33,
         5,
         94,
         56,
         80
      };
   }

   private static byte[] jotlsndrdfoivod() {
      return new byte[]{-50, -30, 26, 56, 65, 54, 94, 126, 126, 54, 55, 57, 49, 64, 49, 52, 73, 65};
   }

   private static byte[] skacidaxevunlvk() {
      return new byte[]{-53, -21, 21, 45, 69, 37, 91, 125, 123, 44, 54, 35, 49, 77, 50, 45, 74, 84};
   }

   private static byte[] dzfuavrarokcvlw() {
      return new byte[]{-53, -21, 21, 42, 69, 51, 91, 126, 123, 44, 54, 40, 49, 95, 50, 40, 74, 101, 118, 70, 39, 53, 13, 12, 19, 30};
   }

   private static byte[] ukgaitrlkmxfqwe() {
      return new byte[]{
         -50,
         -30,
         26,
         24,
         66,
         61,
         90,
         112,
         120,
         51,
         55,
         41,
         49,
         77,
         50,
         105,
         77,
         66,
         113,
         67,
         46,
         112,
         14,
         7,
         16,
         16,
         89,
         120,
         87,
         74,
         89,
         117,
         31,
         99,
         36,
         56,
         63,
         1,
         20,
         39,
         50,
         12,
         50,
         108,
         32,
         121,
         55,
         118,
         6,
         90,
         56,
         86,
         102,
         78,
         2,
         5
      };
   }

   private static byte[] hccmsrotxtdfykf() {
      return new byte[]{-54, -24, 28, 63, 66, 49, 88, 120, 120, 52, 55, 51, 49, 69, 52, 55, 77, 67};
   }

   private static byte[] esfpdgcougunchd() {
      return new byte[]{-50, -20, 21, 62, 71, 54, 91, 126, 122, 55, 55, 55, 62, 70, 55, 52, 76, 65};
   }

   private static byte[] ezkkpfxaoxahjeh() {
      return new byte[]{-56, -20, 31, 44, 71, 38, 89, 120, 124, 47, 49, 41, 48, 79, 49, 47, 79, 83};
   }

   private static byte[] ghfoojaxqvaamev() {
      return new byte[]{-56, -20, 31, 43, 71, 48, 89, 123, 124, 47, 49, 34, 48, 93, 49, 42, 79, 98, 117, 65, 45, 52, 15, 15, 17, 27};
   }

   private static byte[] kiemipaylwsgdtg() {
      return new byte[]{
         -50,
         -20,
         20,
         26,
         69,
         51,
         83,
         117,
         123,
         54,
         55,
         39,
         63,
         79,
         53,
         103,
         68,
         71,
         114,
         70,
         46,
         126,
         0,
         26,
         23,
         16,
         80,
         106,
         84,
         78,
         89,
         123,
         17,
         97,
         35,
         54,
         54,
         4,
         23,
         34,
         50,
         2,
         60,
         110,
         39,
         119,
         62,
         115,
         5,
         95,
         56,
         88,
         104,
         76,
         5,
         11
      };
   }

   private static byte[] diovkbdytqzfyog() {
      return new byte[]{-50, -17, 25, 62, 68, 55, 88, 123, 123, 61, 55, 52, 50, 70, 52, 53, 79, 68};
   }

   private static byte[] utagolmpsesiiwi() {
      return new byte[]{-51, -22, 30, 5, 73, 32, 90, 38, 125, 4, 52, 42};
   }

   private static byte[] ztxsujzlboamuam() {
      return new byte[0];
   }

   private static byte[] rhwnjjfadimjvif() {
      return new byte[0];
   }

   private static int oqaxouytnrptfskm(int var0, int var1) {
      return var0 ^ var1;
   }
}