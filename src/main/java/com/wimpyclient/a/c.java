package com.wimpyclient.a;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class c {
   public static final String LAUNCHER_CLIENT_ID = "00000000402B5328";
   private static final String[] CLIENT_IDS;
   private static final String[] SCOPES;
   private static final String[] TOKEN_URLS;
   private static final String DESKTOP_REDIRECT = "https://login.live.com/oauth20_desktop.srf";
   private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) XboxReplay/MinecraftLauncher";
   private static final Duration REQUEST_TIMEOUT;
   private static final Duration LOGIN_DEADLINE;
   private static final HttpClient HTTP;
   private static int dkYZesosL5;
   private transient int B87jVscZOr;
   private static byte[] nphxxgvjrk = ixfnzhctfuxdtbn();

   private c() {
super();
      int var4 = 1873093719 ^ 830146767;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 130951352:
               var4 = 2121510337 ^ var4;
            case 1113193158:
               var4 = 920066236 ^ 868712657 ^ Integer.parseInt("633149748");
               this.B87jVscZOr = 2146125604 ^ dkYZesosL5;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
                     case 256903729:
                        var4 = 1825063317 ^ var4;
                        return;
                     case 400532873:
                     default:
                        throw new RuntimeException(new IOException());
                     case 998238098:
                        return;
                     case 1665487195:
                  }
               }
            case 1074866219:
            default:
               throw new RuntimeException(new IOException());
            case 1184409459:
         }
      }
   }

   public static c$b login(String var0) throws IOException, InterruptedException {
      int var6 = 1424581764 ^ 1957620956 ^ 691747891;
      var6 = 527851305 ^ var6;
      Consumer var2 = var0x -> {
         int var3 = 1628295756 ^ 801457757 ^ 691747891;
         var3 = 425817553 ^ var3;
      };
      return login(var0, var2);
   }

   public static c$b login(String var0, Consumer<String> var1) throws IOException, InterruptedException {
      int var94 = 211183770 ^ 950977809 ^ 691747891;
      var94 = 228630039 ^ var94;
      if (var0 != null) {
         var94 = 1467824453 ^ var94;
         byte var21 = (byte)((var0.isBlank()) ? 1 : 0);
         if (var21 == (1205745386 ^ var94)) {
            var94 = rgyicgztqqjffgzg(var94, 1370572722);
            String var23 = sanitizeToken(var0);
            String var7 = var23;
            long var24 = System.nanoTime();
            Duration var3 = LOGIN_DEADLINE;
            long var79 = var3.toNanos();
            long var26 = var24 + var79;
            long var8 = var26;
            String var81 = iqbgrclgfs(swdmpvqjtekfmzk(), var94);
            IOException var28 = new IOException(var81);
            var94 = 712113955 ^ var94;

            try {
               String var67 = iqbgrclgfs(knpvqrbedroybqv(), var94);
               var1.accept(var67);
               String var30 = iqbgrclgfs(fjfuxshwaqklpvz(), var94);
               String[] var68 = SCOPES;
               byte var82 = (byte)(1008635515 ^ var94);
               String var69 = var68[var82];
               c$b var31 = loginWith(var30, var69, var7, var8, var1);
               var94 ^= 603153959;
               return var31;
            } catch (IOException var96) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var94)) {
                  case -520850471:
                     var94 = rgyicgztqqjffgzg(var94, 632031152);
                     IOException var90 = var96;
                     byte var35 = (byte)((isFatalAuthError(var96)) ? 1 : 0);
                     if (var35 != (431131083 ^ var94)) {
                        var94 = 1363401601 ^ var94;
                        throw new RuntimeException(var96);
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var94)) {
                           case 30012235:
                              var94 ^= 920451762;
                           case 1480209516:
                              String[] var36 = CLIENT_IDS;
                              String[] var91 = var36;
                              int var38 = var36.length;
                              int var12 = var38;
                              byte var39 = (byte)(795767673 ^ var94);
                              int var13 = var39;
                              var94 = 2107880134 ^ var94;

                              label113:
                              while (var13 < var12) {
                                 var94 = 1969874249 ^ var94;
                                 String var42 = var91[var13];
                                 String var14 = var42;
                                 String[] var43 = SCOPES;
                                 String[] var15 = var43;
                                 int var45 = var43.length;
                                 int var16 = var45;
                                 byte var46 = (byte)(665068790 ^ var94);
                                 int var17 = var46;
                                 var94 = 1619833206 ^ var94;

                                 label111:
                                 while (var17 < var16) {
                                    label132: {
                                       var94 = 1950864758 ^ var94;
                                       String var49 = var15[var17];
                                       String var18 = var49;
                                       String var74 = iqbgrclgfs(eullgljdysidseu(), var94);
                                       byte var51 = (byte)((var14.equals(var74)) ? 1 : 0);
                                       if (var51 != (862929142 ^ var94)) {
                                          var94 = 1093525015 ^ var94;
                                          String[] var75 = SCOPES;
                                          byte var84 = (byte)(1916968673 ^ var94);
                                          String var76 = var75[var84];
                                          byte var53 = (byte)((var49.equals(var76)) ? 1 : 0);
                                          if (var53 != (1916968673 ^ var94)) {
                                             var94 = 155159940 ^ var94;
                                             var94 = 65199675 ^ var94;
                                             break label132;
                                          }

                                          var94 = 1396170436 ^ var94;
                                       } else {
                                          var94 = rgyicgztqqjffgzg(var94, 303694035);
                                       }

                                       ensureTime(var8);
                                       var94 = 1361280185 ^ var94;

                                       try {
                                          String var77 = iqbgrclgfs(aybmehwticgaavl(), var94);
                                          var1.accept(var77);
                                          c$b var58 = loginWith(var14, var18, var7, var8, var1);
                                          var94 ^= 298197205;
                                          return var58;
                                       } catch (IOException var95) {
                                          switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var94)) {
                                             case -2102270749:
                                                var94 = 134635805 ^ var94;
                                                var90 = var95;
                                                byte var62 = (byte)((isFatalAuthError(var95)) ? 1 : 0);
                                                if (var62 != (2018532737 ^ var94)) {
                                                   var94 = 185998680 ^ var94;
                                                   throw new RuntimeException(var95);
                                                }

                                                var94 = 13603039 ^ var94;
                                                break;
                                             default:
                                                throw new RuntimeException("Error in hash");
                                          }
                                       }
                                    }

                                    var17 += 2023738719 ^ var94;

                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var94)) {
                                          case 162915705:
                                             var94 ^= 1068980446;
                                             continue label111;
                                          case 184525002:
                                          default:
                                             throw new IllegalStateException();
                                          case 366019834:
                                             continue label111;
                                          case 1657234390:
                                       }
                                    }
                                 }

                                 label84:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var94)) {
                                       case 165602944:
                                          var94 ^= 789679996;
                                          break label84;
                                       case 390872024:
                                          break;
                                       case 972158515:
                                          break label84;
                                       case 1622617039:
                                       default:
                                          throw new IllegalStateException();
                                    }
                                 }

                                 var13 += 1748572925 ^ var94;

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var94)) {
                                       case 166644849:
                                          var94 ^= 989125443;
                                       case 492046754:
                                          continue label113;
                                       case 795381478:
                                       default:
                                          throw new IllegalStateException();
                                       case 1816981061:
                                    }
                                 }
                              }

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var94)) {
                                    case 7271855:
                                       var94 = 2119569425 ^ var94;
                                       throw new RuntimeException(var90);
                                    case 421213307:
                                       break;
                                    case 470919728:
                                    default:
                                       throw new IllegalStateException();
                                    case 1288169785:
                                       throw new RuntimeException(var90);
                                 }
                              }
                           case 968135164:
                           default:
                              throw new IllegalStateException();
                           case 1121624308:
                        }
                     }
                  default:
                     throw new RuntimeException("Error in hash");
               }
            }
         }

         var94 = 1891869296 ^ var94;
      } else {
         var94 = 666802997 ^ var94;
      }

      String var86 = iqbgrclgfs(yvnikehaxsupjpm(), var94);
      IOException var66 = new IOException(var86);
      throw new RuntimeException(var66);
   }

   private static c$b loginWith(String var0, String var1, String var2, long var3, Consumer<String> var5) throws IOException, InterruptedException {
      int var110 = 858032778 ^ 1305571851 ^ 691747891;
      var110 = 1478294303 ^ var110;
      ensureTime(var3);
      JsonObject var31 = refreshMicrosoft(var0, var1, var2, var3);
      String var84 = iqbgrclgfs(atxtdwukflsmzfe(), var110);
      String var33 = required(var31, var84);
      String var85 = iqbgrclgfs(aawsbnwswbxirhc(), var110);
      byte var35 = (byte)((var31.has(var85)) ? 1 : 0);
      String var83;
      if (var35 != (265437101 ^ var110)) {
         var110 = 471246473 ^ var110;
         String var102 = iqbgrclgfs(weikzxnbbcegotc(), var110);
         JsonElement var82 = var31.get(var102);
         var83 = var82.getAsString();
         var110 = rgyicgztqqjffgzg(var110, 811335439);
      } else {
         var110 = rgyicgztqqjffgzg(var110, 561699819);
         var83 = var2;
         var110 = 221741677 ^ var110;
      }

      ensureTime(var3);
      String var86 = iqbgrclgfs(pdtnqicjjjdsqzi(), var110);
      var5.accept(var86);
      JsonObject var40 = xboxAuthenticate(var33, var3);
      String var89 = iqbgrclgfs(jskgizwxwrndixs(), var110);
      String var42 = required(var40, var89);
      String var44 = uhs(var40);
      String var21 = var44;
      ensureTime(var3);
      String var90 = iqbgrclgfs(mnpnadezqqbwetj(), var110);
      var5.accept(var90);
      JsonObject var49 = xboxXsts(var42, var3);
      String var93 = iqbgrclgfs(ghwdyifnvzhqnps(), var110);
      String var51 = required(var49, var93);
      byte var53 = (byte)((var44.isEmpty()) ? 1 : 0);
      if (var53 != (597648939 ^ var110)) {
         var110 = 1691715002 ^ var110;
         String var55 = uhs(var49);
         var21 = var55;
         var110 = 1521262841 ^ var110;
      } else {
         var110 = rgyicgztqqjffgzg(var110, 1048126787);
      }

      byte var57 = (byte)((var21.isEmpty()) ? 1 : 0);
      if (var57 != (501629800 ^ var110)) {
         var110 = 287405471 ^ var110;
         String var106 = iqbgrclgfs(rwoiwdvmhcmyloc(), var110);
         IOException var80 = new IOException(var106);
         throw new RuntimeException(var80);
      } else {
         var110 = 783490625 ^ var110;
         String var59 = xid(var49);
         String var24 = var59;
         byte var61 = (byte)((var59.isEmpty()) ? 1 : 0);
         if (var61 != (861232425 ^ var110)) {
            var110 = 2145237245 ^ var110;
            String var63 = xid(var40);
            var24 = var63;
            var110 = 527791542 ^ var110;
         } else {
            var110 = rgyicgztqqjffgzg(var110, 1621675339);
         }

         ensureTime(var3);
         String var94 = iqbgrclgfs(lylmfjaoeyjofic(), var110);
         var5.accept(var94);
         JsonObject var68 = loginWithXbox(var21, var51, var3);
         String var96 = iqbgrclgfs(ylrwsbldyejxezw(), var110);
         String var70 = required(var68, var96);
         String var97 = iqbgrclgfs(glvrtakbqhdnxxa(), var110);
         var5.accept(var97);
         JsonObject var73 = minecraftProfile(var70, var3);
         String var100 = iqbgrclgfs(wmllvkghgxoozzi(), var110);
         String var75 = required(var73, var100);
         String var101 = iqbgrclgfs(yyfryfnmkkbqawa(), var110);
         String var77 = required(var73, var101);
         UUID var78 = parseUuid(var77);
         return new c$b(var75, var78, var70, var83, var24, var0);
      }
   }

   private static JsonObject refreshMicrosoft(String var0, String var1, String var2, long var3) throws IOException, InterruptedException {
      int var56 = 993892764 ^ 1026234893 ^ 691747891;
      var56 = 561600828 ^ var56;
      String var6 = iqbgrclgfs(itrqxmyyvkhmsoa(), var56);
      IOException var5 = new IOException(var6);
      IOException var9 = var5;
      String[] var19 = TOKEN_URLS;
      String[] var10 = var19;
      int var21 = var19.length;
      int var11 = var21;
      byte var22 = (byte)(240445086 ^ var56);
      int var12 = var22;
      var56 = 490345072 ^ var56;

      while (var12 < var11) {
         var56 = 1939522411 ^ var56;
         String var25 = var10[var12];
         String var13 = var25;
         byte var26 = (byte)(1626617735 ^ var56);
         boolean[] var27 = new boolean[var26];
         byte var49 = (byte)(1626617733 ^ var56);
         byte var7 = (byte)(1626617732 ^ var56);
         var27[var49] = (var7 != 0);
         byte var50 = (byte)(1626617732 ^ var56);
         byte var52 = (byte)(1626617733 ^ var56);
         var27[var50] = (var52 != 0);
         boolean[] var14 = var27;
         int var29 = var27.length;
         int var15 = var29;
         byte var30 = (byte)(1626617733 ^ var56);
         int var16 = var30;
         var56 = 675985471 ^ var56;

         label55:
         while (true) {
            if (var16 >= var15) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
                     case 217153222:
                        var56 ^= 1482915305;
                        break label55;
                     case 291214440:
                     default:
                        throw new IllegalStateException();
                     case 313131310:
                        break label55;
                     case 898934090:
                  }
               }
            }

            var56 = 191876471 ^ var56;
            boolean var33 = var14[var16];
            boolean var17 = var33;
            ensureTime(var3);
            var56 = 1827259132 ^ var56;

            try {
               JsonObject var37 = refreshMicrosoftOnce(var13, var0, var1, var2, var17);
               var56 ^= 1531997261;
               return var37;
            } catch (IOException var57) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var56)) {
                  case 2042888585:
                     var56 = 290039798 ^ var56;
                     var9 = var57;
                     byte var41 = (byte)((isFatalAuthError(var57)) ? 1 : 0);
                     if (var41 != (1047603143 ^ var56)) {
                        var56 = 1413486556 ^ var56;
                        throw new RuntimeException(var57);
                     }

                     label42:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var56)) {
                           case 150668128:
                              var56 ^= 1448744517;
                              break label42;
                           case 276845546:
                           default:
                              throw new IllegalStateException();
                           case 355536084:
                              break;
                           case 1701091273:
                              break label42;
                        }
                     }

                     var16 += 1747661187 ^ var56;
                     var56 = 546684472 ^ var56;
                     break;
                  default:
                     throw new RuntimeException("Error in hash");
               }
            }
         }

         var12 += 282980946 ^ var56;
         var56 = rgyicgztqqjffgzg(var56, 62064317);
      }

      var56 = 1177429950 ^ var56;
      throw new RuntimeException(var9);
   }

   private static JsonObject refreshMicrosoftOnce(String var0, String var1, String var2, String var3, boolean var4) throws IOException, InterruptedException {
      int var43 = 1868408570 ^ 1377389210 ^ 691747891;
      var43 = 1214529170 ^ var43;
      StringBuilder var5 = new StringBuilder();
      StringBuilder var7 = var5;
      String var29 = iqbgrclgfs(bwdjfveqocvdfyi(), var43);
      appendForm(var5, var29, var1);
      String var30 = iqbgrclgfs(acrptvdksqepcox(), var43);
      String var37 = iqbgrclgfs(cgothkvhuwhbphp(), var43);
      appendForm(var5, var30, var37);
      String var31 = iqbgrclgfs(ylmuyklddisvcow(), var43);
      appendForm(var5, var31, var3);
      if (var2 != null) {
         var43 = 95866481 ^ var43;
         byte var15 = (byte)((var2.isBlank()) ? 1 : 0);
         if (var15 == (1504518320 ^ var43)) {
            var43 = 260805468 ^ var43;
            String var32 = iqbgrclgfs(uphbiozjufvzhnj(), var43);
            appendForm(var5, var32, var2);
            var43 = 509983456 ^ var43;
         } else {
            label54:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var43)) {
                  case 230635256:
                     var43 ^= 300820924;
                  case 743663884:
                     break label54;
                  case 1056869778:
                  default:
                     throw new RuntimeException();
                  case 1466194159:
               }
            }
         }
      } else {
         var43 = 341370829 ^ var43;
      }

      if (var4 != ((1212352780 ^ var43) != 0)) {
         var43 = 1983616205 ^ var43;
         String var33 = iqbgrclgfs(rdkbkcbjawqnxui(), var43);
         String var40 = iqbgrclgfs(nneriyrmnedrakr(), var43);
         appendForm(var5, var33, var40);
         var43 = 1834961055 ^ var43;
      } else {
         label46:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var43)) {
               case 201435588:
                  var43 ^= 459594834;
                  break label46;
               case 214259099:
               default:
                  throw new RuntimeException();
               case 1075165399:
                  break label46;
               case 1809630434:
            }
         }
      }

      JsonObject var8;
      try {
         String var35 = var7.toString();
         JsonObject var20 = postForm(var0, var35);
         var8 = var20;
         var43 ^= 1132842168;
      } catch (c$a var44) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var43)) {
            case -1723946254:
               var43 = 31312832 ^ var43;
               IOException var28 = mapOAuth(var44);
               throw new RuntimeException(var28);
            default:
               throw new RuntimeException(new IllegalAccessException("Error in hash"));
         }
      }

      var43 = 321678604 ^ var43;
      String var36 = iqbgrclgfs(wfbjazghxhwrplu(), var43);
      byte var22 = (byte)((var8.has(var36)) ? 1 : 0);
      if (var22 != (59667690 ^ var43)) {
         var43 = 1778025116 ^ var43;
         IOException var24 = mapOAuthError(var8);
         throw new RuntimeException(var24);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var43)) {
               case 55938581:
                  var43 = 651673682 ^ var43;
                  return var8;
               case 154134604:
                  return var8;
               case 354245331:
               default:
                  throw new RuntimeException();
               case 1880802615:
            }
         }
      }
   }

   private static JsonObject xboxAuthenticate(String var0, long var1) throws IOException, InterruptedException {
      int var55 = 1504096689 ^ 121054261 ^ 691747891;
      var55 = 1554715210 ^ var55;
      String var4 = iqbgrclgfs(bdsjrtculrlxrft(), var55);
      IOException var3 = new IOException(var4);
      IOException var5 = var3;
      String[] var14 = rpsTickets(var0);
      String[] var6 = var14;
      int var16 = var14.length;
      int var7 = var16;
      byte var17 = (byte)(721533949 ^ var55);
      int var8 = var17;
      var55 = 1708047642 ^ var55;

      while (var8 < var7) {
         var55 = 1229535192 ^ var55;
         String var20 = var6[var8];
         ensureTime(var1);
         JsonObject var23 = new JsonObject();
         String var38 = iqbgrclgfs(hiwtzcfrpccoxif(), var55);
         String var46 = iqbgrclgfs(sgzzhrboxjqoklr(), var55);
         var23.addProperty(var38, var46);
         String var39 = iqbgrclgfs(fifinfypzmdgvwe(), var55);
         String var47 = iqbgrclgfs(czufnotpxpfpkde(), var55);
         var23.addProperty(var39, var47);
         String var40 = iqbgrclgfs(bfimvqnypkmfkmd(), var55);
         var23.addProperty(var40, var20);
         JsonObject var27 = new JsonObject();
         JsonObject var11 = var27;
         String var41 = iqbgrclgfs(bmoubkqsqdozkuf(), var55);
         var27.add(var41, var23);
         String var42 = iqbgrclgfs(swcekugggjubuxg(), var55);
         String var50 = iqbgrclgfs(ryidkjjqhwngxuu(), var55);
         var27.addProperty(var42, var50);
         String var43 = iqbgrclgfs(iwxnhxopmlsjnzj(), var55);
         String var51 = iqbgrclgfs(qzppsrblupklyhh(), var55);
         var27.addProperty(var43, var51);
         var55 = 1654462124 ^ var55;

         try {
            String var31 = iqbgrclgfs(cddmmwygveajcvi(), var55);
            String var45 = var11.toString();
            byte var52 = (byte)(1696278418 ^ var55);
            JsonObject var32 = postJson(var31, var45, (var52 != 0));
            var55 ^= 814810946;
            return var32;
         } catch (IOException var56) {
            switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var55)) {
               case 685325467:
                  var55 = rgyicgztqqjffgzg(var55, 740629504);
                  var5 = var56;
                  var8 += 1228815250 ^ var55;
                  var55 = rgyicgztqqjffgzg(var55, 133250420);
                  break;
               default:
                  throw new RuntimeException(new IOException("Error in hash"));
            }
         }
      }

      var55 = 148122054 ^ var55;
      throw new RuntimeException(var5);
   }

   private static JsonObject xboxXsts(String var0, long var1) throws IOException, InterruptedException {
      int var50 = 639665964 ^ 1550723487 ^ 691747891;
      var50 = 781680755 ^ var50;
      ensureTime(var1);
      JsonArray var11 = new JsonArray();
      var11.add(var0);
      JsonObject var13 = new JsonObject();
      String var34 = iqbgrclgfs(bnbpbqzymverngq(), var50);
      String var5 = iqbgrclgfs(srhdekaroexnbpu(), var50);
      var13.addProperty(var34, var5);
      String var35 = iqbgrclgfs(hweexrxpdwlrpzz(), var50);
      var13.add(var35, var11);
      JsonObject var16 = new JsonObject();
      JsonObject var8 = var16;
      String var36 = iqbgrclgfs(xkxqtwxbjjavrov(), var50);
      var16.add(var36, var13);
      String var37 = iqbgrclgfs(jeeundefqryshpy(), var50);
      String var45 = iqbgrclgfs(xxgkwphinzhqhjr(), var50);
      var16.addProperty(var37, var45);
      String var38 = iqbgrclgfs(zqvqlooaldcorrb(), var50);
      String var46 = iqbgrclgfs(yzreaslrperizrz(), var50);
      var16.addProperty(var38, var46);
      var50 = 232020599 ^ var50;

      JsonObject var9;
      try {
         String var20 = iqbgrclgfs(xatfhqbaysznwvj(), var50);
         String var40 = var8.toString();
         byte var47 = (byte)(1882605701 ^ var50);
         JsonObject var21 = postJson(var20, var40, (var47 != 0));
         var9 = var21;
         var50 ^= 1126110003;
      } catch (c$a var51) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var50)) {
            case -2119023581:
               var50 = rgyicgztqqjffgzg(var50, 758617645);
               IOException var24 = mapXsts(var51);
               throw new RuntimeException(var24);
            default:
               throw new RuntimeException("Error in hash");
         }
      }

      var50 = 120354837 ^ var50;
      String var41 = iqbgrclgfs(roukxwgfehdcdjf(), var50);
      byte var26 = (byte)((var9.has(var41)) ? 1 : 0);
      if (var26 != (872752034 ^ var50)) {
         var50 = 1584220642 ^ var50;
         String var42 = iqbgrclgfs(ffhgdyhqjhogdod(), var50);
         JsonElement var29 = var9.get(var42);
         long var30 = var29.getAsLong();
         IOException var32 = mapXerr(var30);
         throw new RuntimeException(var32);
      } else {
         var50 = 192457344 ^ var50;
         return var9;
      }
   }

   private static JsonObject loginWithXbox(String var0, String var1, long var2) throws IOException, InterruptedException {
      int var40 = 1410518777 ^ 871842967 ^ 691747891;
      var40 = 1204133372 ^ var40;
      ensureTime(var2);
      JsonObject var12 = new JsonObject();
      JsonObject var9 = var12;
      String var23 = iqbgrclgfs(moaillrtfktiwtc(), var40);
      String var28 = "XBL3.0 x=" + var0 + ";" + var1;
      var12.addProperty(var23, var28);
      String var24 = iqbgrclgfs(nvqdjlwtdfouplq(), var40);
      byte var29 = (byte)(152775584 ^ var40);
      Boolean var30 = Boolean.valueOf((var29 != 0));
      var12.addProperty(var24, var30);
      var40 = 216449092 ^ var40;

      JsonObject var10;
      try {
         String var15 = iqbgrclgfs(wqfpwtkhmwhyjwa(), var40);
         String var26 = var9.toString();
         JsonObject var16 = postJson(var15, var26);
         var10 = var16;
         var40 ^= 1389985209;
      } catch (c$a var41) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var40)) {
            case 804216616:
               var40 = rgyicgztqqjffgzg(var40, 1119734778);
               int var33 = var41.status;
               JsonObject var36 = var41.json;
               String var8 = iqbgrclgfs(rbrvdehvrmedgcg(), var40);
               String var34 = statusMessage(var33, var36, var8);
               IOException var22 = new IOException(var34, var41);
               throw new RuntimeException(var22);
            default:
               throw new RuntimeException(new IllegalAccessException("Error in hash"));
         }
      }

      var40 = 22753315 ^ var40;
      String var27 = iqbgrclgfs(krrcxjirkblimff(), var40);
      byte var18 = (byte)((var10.has(var27)) ? 1 : 0);
      if (var18 == (1451206271 ^ var40)) {
         var40 = 2077359503 ^ var40;
         String var31 = iqbgrclgfs(xamdbqwjyawckyb(), var40);
         IOException var19 = new IOException(var31);
         throw new RuntimeException(var19);
      } else {
         var40 = 216479048 ^ var40;
         return var10;
      }
   }

   private static JsonObject minecraftProfile(String var0, long var1) throws IOException, InterruptedException {
      int var59 = 837977374 ^ 1019212223 ^ 691747891;
      var59 = 1803655703 ^ var59;
      ensureTime(var1);
      String var10 = iqbgrclgfs(yfoxhesccxzriiz(), var59);
      URI var11 = URI.create(var10);
      Builder var12 = HttpRequest.newBuilder(var11);
      Duration var5 = REQUEST_TIMEOUT;
      Builder var13 = var12.timeout(var5);
      String var38 = iqbgrclgfs(auqzvprljoaxxgg(), var59);
      String var47 = "Bearer " + var0;
      Builder var14 = var13.header(var38, var47);
      String var39 = iqbgrclgfs(typtcmpgeuwsnjh(), var59);
      String var48 = iqbgrclgfs(yduetziqmfybpuc(), var59);
      Builder var15 = var14.header(var39, var48);
      String var40 = iqbgrclgfs(lxklaenutzobgia(), var59);
      String var49 = iqbgrclgfs(xvwkyynsrhbukwn(), var59);
      Builder var16 = var15.header(var40, var49);
      Builder var17 = var16.GET();
      HttpRequest var18 = var17.build();
      HttpClient var19 = HTTP;
      Charset var50 = StandardCharsets.UTF_8;
      BodyHandler var51 = BodyHandlers.ofString(var50);
      HttpResponse var20 = var19.send(var18, var51);
      int var22 = var20.statusCode();
      short var42 = (short)(1341641489 ^ var59);
      if (var22 == var42) {
         var59 = 1606183198 ^ var59;
         String var52 = iqbgrclgfs(itwxwsgqwqbtydi(), var59);
         IOException var23 = new IOException(var52);
         throw new RuntimeException(var23);
      } else {
         var59 = rgyicgztqqjffgzg(var59, 933200397);
         int var25 = var20.statusCode();
         byte var43 = (byte)(2020102380 ^ var59);
         int var26 = var25 / var43;
         byte var44 = (byte)(2020102282 ^ var59);
         if (var26 != var44) {
            var59 = 1887047207 ^ var59;
            int var54 = var20.statusCode();
            String var55 = "Failed to load Minecraft profile (HTTP " + var54 + ")";
            IOException var27 = new IOException(var55);
            throw new RuntimeException(var27);
         } else {
            var59 = rgyicgztqqjffgzg(var59, 2068833326);
            Object var29 = var20.body();
            String var30 = (String)var29;
            JsonObject var31 = parseJson(var30);
            String var45 = iqbgrclgfs(tduqtxktfrgdxrl(), var59);
            byte var33 = (byte)((var31.has(var45)) ? 1 : 0);
            if (var33 != (52933798 ^ var59)) {
               var59 = 871388245 ^ var59;
               String var46 = iqbgrclgfs(nuhaniuxevckiyy(), var59);
               byte var35 = (byte)((var31.has(var46)) ? 1 : 0);
               if (var35 != (819454195 ^ var59)) {
                  var59 = 1221648313 ^ var59;
                  return var31;
               }

               var59 = 199211176 ^ var59;
            } else {
               var59 = 942664957 ^ var59;
            }

            String var56 = iqbgrclgfs(nnoceqwalaqhkwp(), var59);
            IOException var37 = new IOException(var56);
            throw new RuntimeException(var37);
         }
      }
   }

   private static void ensureTime(long var0) throws IOException {
      int var11 = 1601519627 ^ 638067791 ^ 691747891;
      var11 = 1123126834 ^ var11;
      long var2 = System.nanoTime();
      long var15;
      int var6 = (var15 = var2 - var0) == 0L ? 0 : (var15 < 0L ? -1 : 1);
      if (var6 > (314037829 ^ var11)) {
         var11 = 1096541779 ^ var11;
         String var8 = iqbgrclgfs(iybxsjibcdxeuhs(), var11);
         IOException var7 = new IOException(var8);
         throw new RuntimeException(var7);
      } else {
         var11 = rgyicgztqqjffgzg(var11, 1046938476);
      }
   }

   private static boolean isFatalAuthError(IOException var0) {
      int var29 = 964419779 ^ 1116001047 ^ 691747891;
      var29 = 1013277666 ^ var29;
      String var4 = var0.getMessage();
      String var20;
      if (var4 == null) {
         var29 = 144757103 ^ var29;
         var20 = iqbgrclgfs(yhxhksrblwsocuc(), var29);
         var29 = 1189051304 ^ var29;
      } else {
         var29 = rgyicgztqqjffgzg(var29, 1174524050);
         String var19 = var0.getMessage();
         Locale var26 = Locale.ROOT;
         var20 = var19.toLowerCase(var26);
         var29 = 142506581 ^ var29;
      }

      String var2 = iqbgrclgfs(ldlrpjjytwzzxid(), var29);
      byte var6 = (byte)((var20.contains(var2)) ? 1 : 0);
      if (var6 == (551470786 ^ var29)) {
         var29 = 803682145 ^ var29;
         String var21 = iqbgrclgfs(ruakcsirhfqqmib(), var29);
         byte var8 = (byte)((var20.contains(var21)) ? 1 : 0);
         if (var8 == (255455651 ^ var29)) {
            var29 = 336041945 ^ var29;
            String var22 = iqbgrclgfs(jlhugphqazsmogw(), var29);
            byte var10 = (byte)((var20.contains(var22)) ? 1 : 0);
            if (var10 == (457074298 ^ var29)) {
               var29 ^= 1136784183;
               String var23 = iqbgrclgfs(penypdnsppphkrr(), var29);
               byte var12 = (byte)((var20.contains(var23)) ? 1 : 0);
               if (var12 == (1493144909 ^ var29)) {
                  var29 ^= 1431177342;
                  String var24 = iqbgrclgfs(rbhdrtddoclwxxi(), var29);
                  byte var14 = (byte)((var20.contains(var24)) ? 1 : 0);
                  if (var14 == (229743923 ^ var29)) {
                     var29 = 1428704707 ^ var29;
                     String var25 = iqbgrclgfs(tbsydwdywebmqsg(), var29);
                     byte var16 = (byte)((var20.contains(var25)) ? 1 : 0);
                     if (var16 == (1486475504 ^ var29)) {
                        var29 = rgyicgztqqjffgzg(var29, 97345016);
                        byte var17 = (byte)(1565822216 ^ var29);
                        var29 = 1582911342 ^ var29;
                        return (var17 != 0);
                     }

                     var29 = 571063964 ^ var29;
                  } else {
                     label54:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                           case 94443281:
                              break;
                           case 176696611:
                              var29 ^= 1998713695;
                           case 213822964:
                              break label54;
                           case 1713308213:
                           default:
                              throw new IllegalStateException();
                        }
                     }
                  }
               } else {
                  label67:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                        case 208628154:
                           var29 ^= 577764129;
                        case 828777535:
                           break label67;
                        case 1269162691:
                        default:
                           throw new IllegalStateException();
                        case 1282310824:
                     }
                  }
               }
            } else {
               label61:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                     case 80281010:
                        var29 ^= 1638795286;
                        break label61;
                     case 240174873:
                     default:
                        throw new IllegalStateException();
                     case 330628063:
                        break;
                     case 1661417439:
                        break label61;
                  }
               }
            }
         } else {
            var29 = rgyicgztqqjffgzg(var29, 1974050767);
         }
      } else {
         label48:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
               case 263160265:
                  var29 ^= 1515104430;
                  break label48;
               case 518163761:
                  break;
               case 1408886970:
               default:
                  throw new IllegalStateException();
               case 1925229869:
                  break label48;
            }
         }
      }

      byte var39 = (byte)(2056285805 ^ var29);

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
            case 225947489:
               var29 = 2040376330 ^ var29;
               return (var39 != 0);
            case 603647969:
               return (var39 != 0);
            case 855331341:
            default:
               throw new IllegalStateException();
            case 1203061319:
         }
      }
   }

   private static String[] rpsTickets(String var0) {
      int var29 = 950818999 ^ 440860309 ^ 691747891;
      var29 = 1846853872 ^ var29;
      String var2 = iqbgrclgfs(gcojmzigvmwzpvh(), var29);
      byte var5 = (byte)((var0.startsWith(var2)) ? 1 : 0);
      if (var5 == (1707432673 ^ var29)) {
         var29 = 1041920746 ^ var29;
         String var12 = iqbgrclgfs(cepnsvxlclhszzp(), var29);
         byte var7 = (byte)((var0.startsWith(var12)) ? 1 : 0);
         if (var7 == (1541351435 ^ var29)) {
            var29 = 319933083 ^ var29;
            byte var8 = (byte)(1221517971 ^ var29);
            String[] var9 = new String[var8];
            byte var3 = (byte)(1221517968 ^ var29);
            String var18 = "d=" + var0;
            var9[var3] = var18;
            byte var13 = (byte)(1221517969 ^ var29);
            String var20 = "t=" + var0;
            var9[var13] = var20;
            byte var14 = (byte)(1221517970 ^ var29);
            var9[var14] = var0;
            return var9;
         }

         var29 = 111077842 ^ var29;
      } else {
         var29 = 948214584 ^ var29;
      }

      byte var10 = (byte)(1564590554 ^ var29);
      String[] var11 = new String[var10];
      byte var15 = (byte)(1564590553 ^ var29);
      var11[var15] = var0;
      byte var16 = (byte)(1564590552 ^ var29);
      String var24 = "d=" + var0;
      var11[var16] = var24;
      byte var17 = (byte)(1564590555 ^ var29);
      String var26 = "t=" + var0;
      var11[var17] = var26;
      return var11;
   }

   private static String uhs(JsonObject var0) {
      int var6 = 781221142 ^ 389967030 ^ 691747891;
      var6 = 1817504601 ^ var6;
      String var2 = iqbgrclgfs(jirwmaeysmbpxfe(), var6);
      return claim(var0, var2);
   }

   private static String xid(JsonObject var0) {
      int var6 = 673915222 ^ 1433427363 ^ 691747891;
      var6 = 932707756 ^ var6;
      String var2 = iqbgrclgfs(tdzqtkalxwzkfyk(), var6);
      return claim(var0, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static String claim(JsonObject var0, String var1) {
      int var33 = 2130366972 ^ 536028028 ^ 691747891;
      var33 = 1472469682 ^ var33;

      JsonArray var4;
      label154: {
         label155: {
            label156: {
               label157: {
                  label112: {
                     label111: {
                        label110: {
                           try {
                              String var3 = iqbgrclgfs(wvlargbzrlmbdku(), var33);
                              JsonObject var6 = var0.getAsJsonObject(var3);
                              String var25 = iqbgrclgfs(twstdrwojslxejc(), var33);
                              JsonArray var7 = var6.getAsJsonArray(var25);
                              var4 = var7;
                              if (var7 != null) {
                                 var33 ^= 808500348;
                                 byte var10 = (byte)((var7.isEmpty()) ? 1 : 0);
                                 if (var10 != (801532029 ^ var33)) {
                                    break label110;
                                 }

                                 var33 ^= 60246335;
                                 byte var26 = (byte)(743514434 ^ var33);
                                 JsonElement var12 = var7.get(var26);
                                 byte var13 = (byte)((var12.isJsonObject()) ? 1 : 0);
                                 if (var13 != (743514434 ^ var33)) {
                                    break label154;
                                 }

                                 var33 ^= 1249993312;
                                 break label111;
                              }
                           } catch (Exception var37) {
                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var33)) {
                                 case -4808696:
                                    break label156;
                                 case 914495763:
                                    break label157;
                                 case 1653148177:
                                    break label112;
                                 case 2117288937:
                                    break label155;
                                 default:
                                    throw new RuntimeException("Error in hash");
                              }
                           }

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
                                 case 233710903:
                                    var33 ^= 2032572195;
                                    break label111;
                                 case 410817158:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1432717821:
                                    break label111;
                                 case 1530935511:
                              }
                           }
                        }

                        var33 ^= 1226189663;
                     }

                     try {
                        String var24 = iqbgrclgfs(ovskwmseswkyhqc(), var33);
                        var33 ^= 1590470452;
                        return var24;
                     } catch (Exception var36) {
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var33)) {
                           case -4808696:
                              break label156;
                           case 914495763:
                              break label157;
                           case 1653148177:
                              break;
                           case 2117288937:
                              break label155;
                           default:
                              throw new RuntimeException("Error in hash");
                        }
                     }
                  }

                  var33 = rgyicgztqqjffgzg(var33, 988565760);
                  return iqbgrclgfs(yrdtwlqxbacdhwa(), var33);
               }

               var33 = 1886204768 ^ var33;
               return iqbgrclgfs(yrdtwlqxbacdhwa(), var33);
            }

            var33 = rgyicgztqqjffgzg(var33, 155952195);
            return iqbgrclgfs(yrdtwlqxbacdhwa(), var33);
         }

         var33 = 964368447 ^ var33;
         return iqbgrclgfs(yrdtwlqxbacdhwa(), var33);
      }

      var33 = rgyicgztqqjffgzg(var33, 1664398345);

      label158: {
         label159: {
            label160: {
               String var42;
               label161: {
                  try {
                     byte var27 = (byte)(1332057419 ^ var33);
                     JsonElement var15 = var4.get(var27);
                     JsonObject var16 = var15.getAsJsonObject();
                     byte var18 = (byte)((var16.has(var1)) ? 1 : 0);
                     if (var18 != (1332057419 ^ var33)) {
                        var33 ^= 1261146835;
                        JsonElement var22 = var16.get(var1);
                        var42 = var22.getAsString();
                        break label161;
                     }
                  } catch (Exception var35) {
                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var33)) {
                        case -463334360:
                           break label159;
                        case 577780928:
                           break label158;
                        case 2066524762:
                           break label160;
                        default:
                           throw new RuntimeException(new IllegalAccessException("Error in hash"));
                     }
                  }

                  var33 ^= 1407834062;

                  try {
                     var42 = iqbgrclgfs(selkjlhuvhubyhc(), var33);
                     var33 ^= 714187207;
                     return var42;
                  } catch (Exception var34) {
                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var33)) {
                        case -463334360:
                           break label159;
                        case 577780928:
                           break label158;
                        case 2066524762:
                           break label160;
                        default:
                           throw new RuntimeException(new IllegalAccessException("Error in hash"));
                     }
                  }
               }

               var33 = rgyicgztqqjffgzg(var33, 844358874);
               return var42;
            }

            var33 = 1507386633 ^ var33;
            return iqbgrclgfs(yrdtwlqxbacdhwa(), var33);
         }

         var33 = 170996423 ^ var33;
         return iqbgrclgfs(yrdtwlqxbacdhwa(), var33);
      }

      var33 = rgyicgztqqjffgzg(var33, 317945818);
      return iqbgrclgfs(yrdtwlqxbacdhwa(), var33);
   }

   private static IOException mapXsts(c$a var0) {
      int var26 = 1254976271 ^ 1834490650 ^ 691747891;
      var26 = 1797440919 ^ var26;
      JsonObject var8 = var0.json;
      JsonObject var6 = var8;
      if (var8 == null) {
         var26 = rgyicgztqqjffgzg(var26, 273890139);
      } else {
         var26 = 1736893427 ^ var26;
         String var2 = iqbgrclgfs(rhchnakzwgrvdip(), var26);
         byte var11 = (byte)((var8.has(var2)) ? 1 : 0);
         if (var11 != (34236994 ^ var26)) {
            var26 = 443654370 ^ var26;

            try {
               String var19 = iqbgrclgfs(uwkrcppojgvllai(), var26);
               JsonElement var13 = var6.get(var19);
               long var14 = var13.getAsLong();
               IOException var16 = mapXerr(var14);
               var26 ^= 405174413;
               return var16;
            } catch (Exception var27) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var26)) {
                  case -1008839424:
                     var26 = 320322127 ^ var26;
                     var26 = 2125709829 ^ var26;
                     break;
                  default:
                     throw new RuntimeException(new IOException("Error in hash"));
               }
            }
         } else {
            label36:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
                  case 32096663:
                     var26 ^= 2010503336;
                     break label36;
                  case 493833605:
                  default:
                     throw new RuntimeException(new IOException());
                  case 561453809:
                     break;
                  case 1245116988:
                     break label36;
               }
            }
         }
      }

      int var20 = var0.status;
      JsonObject var22 = var0.json;
      String var5 = iqbgrclgfs(uvwwvtybyauopmt(), var26);
      String var21 = statusMessage(var20, var22, var5);
      return new IOException(var21, var0);
   }

   private static IOException mapXerr(long var0) {
      int var22 = 1645452846 ^ 179445250 ^ 691747891;
      var22 = 2024358531 ^ var22;
      long var4 = 2148916233L;
      long var27;
      int var6 = (var27 = var0 - var4) == 0L ? 0 : (var27 < 0L ? -1 : 1);
      if (var6 == (959708828 ^ var22)) {
         var22 = 2085891955 ^ var22;
         String var13 = iqbgrclgfs(brjakdhjbmjngwj(), var22);
         return new IOException(var13);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
               case 35329423:
                  break;
               case 248808573:
                  var22 ^= 2140218679;
               case 314190567:
                  long var14 = 2148916238L;
                  long var28;
                  int var10 = (var28 = var0 - var14) == 0L ? 0 : (var28 < 0L ? -1 : 1);
                  if (var10 == (1185078187 ^ var22)) {
                     var22 = 2106770369 ^ var22;
                     String var19 = iqbgrclgfs(xyqlvrkhglkubsn(), var22);
                     return new IOException(var19);
                  }

                  var22 = rgyicgztqqjffgzg(var22, 2039356193);
                  String var18 = "Xbox authorization failed (" + var0 + ")";
                  return new IOException(var18);
               case 551106513:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private static IOException mapOAuth(c$a var0) {
      label19: {
         int var24 = 310271367 ^ 717488782 ^ 691747891;
         var24 = 33742569 ^ var24;
         JsonObject var6 = var0.json;
         if (var6 != null) {
            var24 = 482041510 ^ var24;
            JsonObject var8 = var0.json;
            String var2 = iqbgrclgfs(fblvgdyqvntuytn(), var24);
            byte var9 = (byte)((var8.has(var2)) ? 1 : 0);
            if (var9 != (255386485 ^ var24)) {
               var24 = 816482710 ^ var24;
               break label19;
            }

            var24 = 784741526 ^ var24;
            JsonObject var11 = var0.json;
            String var17 = iqbgrclgfs(mtbjcpabuofmdsi(), var24);
            byte var12 = (byte)((var11.has(var17)) ? 1 : 0);
            if (var12 != (570349539 ^ var24)) {
               var24 = 510442752 ^ var24;
               break label19;
            }

            var24 = 1417746268 ^ var24;
         } else {
            var24 = 1727823212 ^ var24;
         }

         int var18 = var0.status;
         JsonObject var20 = var0.json;
         String var5 = iqbgrclgfs(efznzwryzdauaqa(), var24);
         String var19 = statusMessage(var18, var20, var5);
         return new IOException(var19, var0);
      }

      JsonObject var14 = var0.json;
      return mapOAuthError(var14);
   }

   private static IOException mapOAuthError(JsonObject var0) {
      int var45 = 45372810 ^ 684469129 ^ 691747891;
      var45 = 729167057 ^ var45;
      String var2 = iqbgrclgfs(egctfvwdfpmwsxh(), var45);
      byte var7 = (byte)((var0.has(var2)) ? 1 : 0);
      String var31;
      if (var7 != (674592481 ^ var45)) {
         var45 = 1211001041 ^ var45;
         String var33 = iqbgrclgfs(tfwrjqrqbthpbvh(), var45);
         JsonElement var9 = var0.get(var33);
         var31 = var9.getAsString();

         label74:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var45)) {
               case 171240038:
                  var45 ^= 1093400159;
                  break label74;
               case 766371852:
                  break;
               case 1355598877:
               default:
                  throw new IllegalStateException();
               case 2012764905:
                  break label74;
            }
         }
      } else {
         var45 = rgyicgztqqjffgzg(var45, 951562269);
         var31 = iqbgrclgfs(ctpvuqbvnzlibzy(), var45);
         var45 = 833760915 ^ var45;
      }

      String var34 = iqbgrclgfs(pzrrrolqfixwmcs(), var45);
      byte var11 = (byte)((var0.has(var34)) ? 1 : 0);
      String var32;
      if (var11 != (556853359 ^ var45)) {
         var45 = 642595044 ^ var45;
         String var39 = iqbgrclgfs(oerstajuwdyuiny(), var45);
         JsonElement var30 = var0.get(var39);
         var32 = var30.getAsString();
         var45 = 955673276 ^ var45;
      } else {
         var45 = 319387400 ^ var45;
         var32 = var31;
         var45 = 229778768 ^ var45;
      }

      String var12 = iqbgrclgfs(ecqxzxwgbtyykqe(), var45);
      byte var13 = (byte)((var12.equals(var31)) ? 1 : 0);
      if (var13 != (1066121783 ^ var45)) {
         var45 = 705150609 ^ var45;
         String var42 = iqbgrclgfs(nuhfdcawalhrgir(), var45);
         return new IOException(var42);
      } else {
         label66:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var45)) {
               case 186550081:
                  var45 ^= 1607840500;
                  break label66;
               case 1024027349:
                  break;
               case 1697894710:
                  break label66;
               case 2035203973:
               default:
                  throw new IllegalStateException();
            }
         }

         if (var32 == null) {
            var45 = 1386460131 ^ var45;
         } else {
            var45 = 556307022 ^ var45;
            byte var16 = (byte)((var32.isBlank()) ? 1 : 0);
            if (var16 == (1098291853 ^ var45)) {
               label58:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var45)) {
                     case 248875527:
                        var45 ^= 1749609865;
                        break label58;
                     case 1173211126:
                        break;
                     case 1295141065:
                     default:
                        throw new IllegalStateException();
                     case 1341771599:
                        break label58;
                  }
               }

               byte var36 = (byte)(691959561 ^ var45);
               int var18 = var32.indexOf(var36);
               int var6 = var18;
               if (var18 < (691959556 ^ var45)) {
                  var45 = 667326793 ^ var45;
                  byte var37 = (byte)(251194951 ^ var45);
                  int var21 = var32.indexOf(var37);
                  var6 = var21;
                  var45 = 560341529 ^ var45;
               } else {
                  var45 = 111197008 ^ var45;
               }

               if (var6 > (798936148 ^ var45)) {
                  var45 = 442109450 ^ var45;
                  byte var38 = (byte)(902087262 ^ var45);
                  String var24 = var32.substring(var38, var6);
                  String var25 = var24.trim();
                  var45 = 1063684379 ^ var45;
                  return new IOException(var25);
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var45)) {
                     case 159020482:
                        return new IOException(var32);
                     case 205751420:
                        var45 = 624723729 ^ var45;
                        return new IOException(var32);
                     case 1568116280:
                        break;
                     case 1887194080:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }

            var45 = 1938497965 ^ var45;
         }

         String var41 = iqbgrclgfs(hpmcfhfdepgmmgy(), var45);
         return new IOException(var41);
      }
   }

   private static String statusMessage(int var0, JsonObject var1, String var2) {
      int var79 = 1620454300 ^ 896655977 ^ 691747891;
      var79 = 822221448 ^ var79;
      Object var3 = null;
      String var5 = (String)var3;
      if (var1 != null) {
         var79 = 1448573011 ^ var79;
         String var4 = iqbgrclgfs(nbovwmhizskzffh(), var79);
         byte var9 = (byte)((var1.has(var4)) ? 1 : 0);
         label155:
         if (var9 != (462001949 ^ var79)) {
            var79 ^= 815344284;

            try {
               String var62 = iqbgrclgfs(jqszqncrmoiyenr(), var79);
               JsonElement var11 = var1.get(var62);
               long var12 = var11.getAsLong();
               IOException var14 = mapXerr(var12);
               String var15 = var14.getMessage();
               var79 ^= 1170923299;
               var5 = var15;
               var79 ^= 1049785442;
            } catch (Exception var80) {
               var79 = 686055353 ^ switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var79)) {
                  case 1485171721 -> 1240649900 ^ var79;
                  case 1993544979 -> rgyicgztqqjffgzg(var79, 205000591);
                  default -> throw new RuntimeException(new IOException("Error in hash"));
               };
               break label155;
            }

            label152:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                  case 193723484:
                     var79 ^= 441328724;
                     break label152;
                  case 645094336:
                     break;
                  case 1162479735:
                     break label152;
                  case 1668793234:
                  default:
                     throw new RuntimeException();
               }
            }
         } else {
            label162:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                  case 89820993:
                     var79 ^= 1368368521;
                  case 1051822038:
                     break label162;
                  case 2133141041:
                     break;
                  case 2133815114:
                  default:
                     throw new RuntimeException();
               }
            }
         }

         if (var5 != null) {
            var79 = 1062962010 ^ var79;
         } else {
            var79 = 1058579492 ^ var79;
            String var63 = iqbgrclgfs(gauhguuzcmaiysh(), var79);
            byte var18 = (byte)((var1.has(var63)) ? 1 : 0);
            if (var18 != (1964938928 ^ var79)) {
               var79 = 644212876 ^ var79;
               String var64 = iqbgrclgfs(uisldfoytmqldsl(), var79);
               JsonElement var20 = var1.get(var64);
               byte var21 = (byte)((var20.isJsonPrimitive()) ? 1 : 0);
               if (var21 != (1400602172 ^ var79)) {
                  var79 = 1351854702 ^ var79;
                  String var65 = iqbgrclgfs(gpowneqmogwsibn(), var79);
                  JsonElement var23 = var1.get(var65);
                  String var24 = var23.getAsString();
                  var5 = var24;
                  var79 = 1991599516 ^ var79;
               } else {
                  var79 = rgyicgztqqjffgzg(var79, 640077810);
               }
            } else {
               label135:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                     case 48969451:
                        var79 ^= 4401022;
                     case 720542103:
                        break label135;
                     case 950440378:
                     default:
                        throw new RuntimeException();
                     case 1973964314:
                  }
               }
            }
         }

         if (var5 == null) {
            var79 ^= 1648192319;
            String var66 = iqbgrclgfs(qbdkezyuyisqhxg(), var79);
            byte var27 = (byte)((var1.has(var66)) ? 1 : 0);
            if (var27 != (392223473 ^ var79)) {
               var79 = 1017649010 ^ var79;
               String var67 = iqbgrclgfs(nyqtntspnelltod(), var79);
               JsonElement var29 = var1.get(var67);
               byte var30 = (byte)((var29.isJsonPrimitive()) ? 1 : 0);
               if (var30 == (734580099 ^ var79)) {
                  var79 = rgyicgztqqjffgzg(var79, 1283053816);
               } else {
                  var79 = 245397524 ^ var79;
                  String var68 = iqbgrclgfs(ooxcddfirzclzlb(), var79);
                  JsonElement var32 = var1.get(var68);
                  String var33 = var32.getAsString();
                  String var34 = iqbgrclgfs(ayizabqttwupwwu(), var79);
                  byte var35 = (byte)((var34.equals(var33)) ? 1 : 0);
                  if (var35 == (627619223 ^ var79)) {
                     var79 = 1387196784 ^ var79;
                     byte var56 = (byte)((var33.isBlank()) ? 1 : 0);
                     if (var56 == (2009482471 ^ var79)) {
                        var79 = 1960462239 ^ var79;
                        String var74 = iqbgrclgfs(mascnddkkvbajvv(), var79);
                        byte var58 = (byte)((var33.equalsIgnoreCase(var74)) ? 1 : 0);
                        if (var58 == (52167544 ^ var79)) {
                           var79 = 1182976392 ^ var79;
                           var5 = var33;
                           var79 = 573562763 ^ var79;
                        } else {
                           var79 = 1689064963 ^ var79;
                        }
                     } else {
                        var79 = rgyicgztqqjffgzg(var79, 276255132);
                     }
                  } else {
                     var79 = 2007142175 ^ var79;
                     String var36 = iqbgrclgfs(dmrzwlktlhitidd(), var79);
                     var5 = var36;

                     label101:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                           case 6783917:
                              var79 ^= 897265651;
                              break label101;
                           case 90515414:
                              break;
                           case 1113088473:
                           default:
                              throw new RuntimeException();
                           case 1822987487:
                              break label101;
                        }
                     }
                  }
               }
            } else {
               label111:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                     case 223067986:
                        var79 ^= 1892798346;
                        break label111;
                     case 466907336:
                     default:
                        throw new RuntimeException();
                     case 1008544288:
                        break label111;
                     case 1054687850:
                  }
               }
            }
         } else {
            label121:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                  case 5239257:
                     break;
                  case 57015586:
                     var79 ^= 317498549;
                  case 501351000:
                     break label121;
                  case 1763600521:
                  default:
                     throw new RuntimeException();
               }
            }
         }

         if (var5 == null) {
            var79 = 1881472428 ^ var79;
            String var70 = iqbgrclgfs(tagbjafytesdbvv(), var79);
            byte var39 = (byte)((var1.has(var70)) ? 1 : 0);
            if (var39 != (395700439 ^ var79)) {
               var79 = 1994230749 ^ var79;
               String var71 = iqbgrclgfs(otezrecmefgyxgt(), var79);
               JsonElement var41 = var1.get(var71);
               byte var42 = (byte)((var41.isJsonPrimitive()) ? 1 : 0);
               if (var42 != (1632133898 ^ var79)) {
                  var79 = 1587611828 ^ var79;
                  String var72 = iqbgrclgfs(sbxhdtglixbyptm(), var79);
                  JsonElement var44 = var1.get(var72);
                  String var45 = var44.getAsString();
                  var5 = var45;
                  var79 = 404794153 ^ var79;
               } else {
                  var79 = 1182901149 ^ var79;
               }
            } else {
               var79 = 811345984 ^ var79;
            }
         } else {
            var79 = rgyicgztqqjffgzg(var79, 1081660908);
         }
      } else {
         var79 = rgyicgztqqjffgzg(var79, 1779904473);
      }

      label88: {
         if (var5 != null) {
            var79 = 1226422426 ^ var79;
            byte var48 = (byte)((var5.isBlank()) ? 1 : 0);
            if (var48 == (1859155981 ^ var79)) {
               var79 = 1309308618 ^ var79;
               break label88;
            }

            var79 = 140481309 ^ var79;
         } else {
            label86:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                  case 141233431:
                     break;
                  case 165868981:
                  default:
                     throw new RuntimeException();
                  case 219595501:
                     var79 ^= 1095117703;
                  case 378966602:
                     break label86;
               }
            }
         }

         String var50 = "HTTP " + var0;
         var5 = var50;
         var79 = 1180034519 ^ var79;
      }

      String var52 = stepName(var2);
      String var61;
      if (var52 == null) {
         var79 = 641342315 ^ var79;
         var61 = var5;
         var79 = rgyicgztqqjffgzg(var79, 1333825417);
      } else {
         var79 = 577160048 ^ var79;
         var61 = var5 + " (" + var52 + ")";
         var79 = 1272731538 ^ var79;
      }

      return var61;
   }

   private static String stepName(String var0) {
      int var27 = 1605534093 ^ 699471593 ^ 691747891;
      var27 = 973528953 ^ var27;
      if (var0 != null) {
         var27 = 1790104132 ^ var27;
         byte var4 = (byte)((var0.isBlank()) ? 1 : 0);
         if (var4 == (260875882 ^ var27)) {
            var27 = 284421171 ^ var27;
            String var2 = iqbgrclgfs(zinydvnjhlmqloi(), var27);
            byte var6 = (byte)((var0.contains(var2)) ? 1 : 0);
            if (var6 == (528435801 ^ var27)) {
               var27 = 2088580912 ^ var27;
               String var21 = iqbgrclgfs(uwoukaszvuxvtnq(), var27);
               byte var8 = (byte)((var0.contains(var21)) ? 1 : 0);
               if (var8 != (1661107561 ^ var27)) {
                  var27 = 1450176607 ^ var27;
                  return iqbgrclgfs(pbbocwcetiyfruo(), var27);
               }

               var27 = rgyicgztqqjffgzg(var27, 86066814);
               String var22 = iqbgrclgfs(ypmxizmlvsetavo(), var27);
               byte var10 = (byte)((var0.contains(var22)) ? 1 : 0);
               if (var10 != (1713584919 ^ var27)) {
                  var27 = 772316017 ^ var27;
                  return iqbgrclgfs(okwczbkmmeyzkzd(), var27);
               }

               label40:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var27)) {
                     case 98837599:
                        var27 ^= 2061541359;
                        break label40;
                     case 132138535:
                     default:
                        throw new RuntimeException();
                     case 541916755:
                        break;
                     case 1987276351:
                        break label40;
                  }
               }

               String var23 = iqbgrclgfs(tepgrvydwivgzwf(), var27);
               byte var13 = (byte)((var0.contains(var23)) ? 1 : 0);
               if (var13 != (482583800 ^ var27)) {
                  var27 = 1853128173 ^ var27;
                  return iqbgrclgfs(fsbtdivdjuelyho(), var27);
               }

               var27 = rgyicgztqqjffgzg(var27, 484123144);
               String var24 = iqbgrclgfs(cnzduybwwvasafj(), var27);
               byte var15 = (byte)((var0.contains(var24)) ? 1 : 0);
               if (var15 != (1607408 ^ var27)) {
                  var27 = 231757352 ^ var27;
                  return iqbgrclgfs(qyumsgcahmimnot(), var27);
               }

               var27 = rgyicgztqqjffgzg(var27, 527418452);
               return var0;
            } else {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var27)) {
                     case 218546035:
                        var27 ^= 705873775;
                        return iqbgrclgfs(pbbocwcetiyfruo(), var27);
                     case 889709267:
                        break;
                     case 1091779388:
                        return iqbgrclgfs(pbbocwcetiyfruo(), var27);
                     case 1969113510:
                     default:
                        throw new RuntimeException();
                  }
               }
            }
         }

         var27 = 98439645 ^ var27;
      } else {
         var27 = 1869398937 ^ var27;
      }

      return null;
   }

   private static String sanitizeToken(String var0) {
      int var37 = 1988015475 ^ 231166735 ^ 691747891;
      var37 = 1740041079 ^ var37;
      String var8 = var0.trim();
      int var10 = var8.length();
      byte var2 = (byte)(892612922 ^ var37);
      if (var10 >= var2) {
         label59: {
            var37 = 2119892552 ^ var37;
            byte var23 = (byte)(1265553264 ^ var37);
            char var12 = var8.charAt(var23);
            int var25 = var8.length();
            byte var3 = (byte)(1265553265 ^ var37);
            int var26 = var25 - var3;
            char var14 = var8.charAt(var26);
            byte var27 = (byte)(1265553234 ^ var37);
            if (var12 == var27) {
               var37 = 1810197063 ^ var37;
               byte var28 = (byte)(546022677 ^ var37);
               if (var14 == var28) {
                  var37 = rgyicgztqqjffgzg(var37, 1603969161);
                  break label59;
               }

               var37 = 1197679987 ^ var37;
            } else {
               label42:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                     case 36108935:
                        var37 ^= 746999604;
                        break label42;
                     case 650354685:
                        break;
                     case 942507379:
                        break label42;
                     case 1346573275:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }

            byte var29 = (byte)(1743290467 ^ var37);
            if (var12 != var29) {
               var37 = rgyicgztqqjffgzg(var37, 456410740);
               return var8;
            }

            var37 = 852514205 ^ var37;
            byte var30 = (byte)(1429788158 ^ var37);
            if (var14 != var30) {
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
                     case 85871468:
                        var37 = 702813161 ^ var37;
                        return var8;
                     case 349511738:
                        break;
                     case 1067581266:
                        return var8;
                     case 1645496599:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }

            var37 = 707383399 ^ var37;
         }

         byte var31 = (byte)(2131822015 ^ var37);
         int var33 = var8.length();
         byte var4 = (byte)(2131822015 ^ var37);
         int var34 = var33 - var4;
         String var20 = var8.substring(var31, var34);
         String var21 = var20.trim();
         var37 = 63816590 ^ var37;
         return var21;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var37)) {
               case 118827624:
                  var37 = 1240004360 ^ var37;
                  return var8;
               case 1776397381:
                  return var8;
               case 1827792706:
                  break;
               case 1889859789:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }
   }

   private static JsonObject postForm(String var0, String var1) throws IOException, InterruptedException {
      int var26 = 2135436619 ^ 1656512117 ^ 691747891;
      var26 = 1218823194 ^ var26;
      URI var6 = URI.create(var0);
      Builder var7 = HttpRequest.newBuilder(var6);
      Duration var3 = REQUEST_TIMEOUT;
      Builder var8 = var7.timeout(var3);
      String var16 = iqbgrclgfs(ucmjdtycyhradmh(), var26);
      String var4 = iqbgrclgfs(odrlmvydwfsrmhb(), var26);
      Builder var9 = var8.header(var16, var4);
      String var17 = iqbgrclgfs(cjiyrpwxlcfvsqp(), var26);
      String var21 = iqbgrclgfs(nlszourzfkjikxz(), var26);
      Builder var10 = var9.header(var17, var21);
      String var18 = iqbgrclgfs(efrflegowintkdw(), var26);
      String var22 = iqbgrclgfs(ibvejxwtqaiamgd(), var26);
      Builder var11 = var10.header(var18, var22);
      Charset var23 = StandardCharsets.UTF_8;
      BodyPublisher var20 = BodyPublishers.ofString(var1, var23);
      Builder var12 = var11.POST(var20);
      HttpRequest var13 = var12.build();
      return send(var13);
   }

   private static JsonObject postJson(String var0, String var1) throws IOException, InterruptedException {
      int var8 = 395509706 ^ 263421153 ^ 691747891;
      var8 = 1477751654 ^ var8;
      byte var4 = (byte)(1762528382 ^ var8);
      return postJson(var0, var1, (var4 != 0));
   }

   private static JsonObject postJson(String var0, String var1, boolean var2) throws IOException, InterruptedException {
      int var32 = 1719619291 ^ 1649435679 ^ 691747891;
      var32 = 868972302 ^ var32;
      URI var7 = URI.create(var0);
      Builder var8 = HttpRequest.newBuilder(var7);
      Duration var4 = REQUEST_TIMEOUT;
      Builder var9 = var8.timeout(var4);
      String var20 = iqbgrclgfs(vbnwspuftdluvxp(), var32);
      String var5 = iqbgrclgfs(dcmmnjdzdqsbcnz(), var32);
      Builder var10 = var9.header(var20, var5);
      String var21 = iqbgrclgfs(vwzruryeywnziye(), var32);
      String var26 = iqbgrclgfs(kanecswupvjjnav(), var32);
      Builder var11 = var10.header(var21, var26);
      String var22 = iqbgrclgfs(rhirvchiedjmayn(), var32);
      String var27 = iqbgrclgfs(uxvepjhkpzutwhg(), var32);
      Builder var12 = var11.header(var22, var27);
      Charset var28 = StandardCharsets.UTF_8;
      BodyPublisher var24 = BodyPublishers.ofString(var1, var28);
      Builder var13 = var12.POST(var24);
      if (var2 != ((517956089 ^ var32) != 0)) {
         var32 = 1997937169 ^ var32;
         String var25 = iqbgrclgfs(hzerxpjzlmilhmo(), var32);
         String var29 = iqbgrclgfs(goxdhpyqydenfvn(), var32);
         Builder var16 = var13.header(var25, var29);
         var32 = 688849497 ^ var32;
      } else {
         var32 = rgyicgztqqjffgzg(var32, 1578702920);
      }

      HttpRequest var18 = var13.build();
      return send(var18);
   }

   private static JsonObject send(HttpRequest var0) throws IOException, InterruptedException {
      int var31 = 555568199 ^ 372765788 ^ 691747891;
      var31 = 368854501 ^ var31;
      HttpClient var1 = HTTP;
      Charset var3 = StandardCharsets.UTF_8;
      BodyHandler var20 = BodyHandlers.ofString(var3);
      HttpResponse var8 = var1.send(var0, var20);
      Object var10 = var8.body();
      String var11 = (String)var10;
      JsonObject var12 = parseJson(var11);
      int var14 = var8.statusCode();
      byte var18 = (byte)(200130985 ^ var31);
      int var15 = var14 / var18;
      byte var19 = (byte)(200131023 ^ var31);
      if (var15 != var19) {
         var31 = 603367991 ^ var31;
         int var22 = var8.statusCode();
         URI var26 = var0.uri();
         String var27 = var26.getHost();
         String var23 = statusMessage(var22, var12, var27);
         int var25 = var8.statusCode();
         c$a var17 = new c$a(var23, var25, var12);
         throw new RuntimeException(var17);
      } else {
         var31 = rgyicgztqqjffgzg(var31, 909624477);
         return var12;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static JsonObject parseJson(String var0) throws IOException {
      int var18 = 1927418642 ^ 126142292 ^ 691747891;
      var18 = 1459932025 ^ var18;
      if (var0 != null) {
         var18 = 916282083 ^ var18;
         byte var5 = (byte)((var0.isBlank()) ? 1 : 0);
         if (var5 == (1036286447 ^ var18)) {
            var18 = 98813396 ^ var18;

            JsonObject var28;
            label55: {
               label54: {
                  label53: {
                     label52: {
                        label72: {
                           try {
                              JsonElement var7 = JsonParser.parseString(var0);
                              byte var9 = (byte)((var7.isJsonObject()) ? 1 : 0);
                              if (var9 != (942128187 ^ var18)) {
                                 var18 ^= 1081984441;
                                 var28 = var7.getAsJsonObject();
                                 break label55;
                              }
                           } catch (Exception var20) {
                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var18)) {
                                 case -1052909095:
                                    break label72;
                                 case -1026307053:
                                    break label52;
                                 case 781620322:
                                    break label53;
                                 default:
                                    throw new RuntimeException("Error in hash");
                              }
                           }

                           var18 ^= 2113236663;

                           try {
                              var28 = new JsonObject();
                              var18 ^= 1522929773;
                              return var28;
                           } catch (Exception var19) {
                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var18)) {
                                 case -1052909095:
                                    break;
                                 case -1026307053:
                                    break label52;
                                 case 781620322:
                                    break label53;
                                 default:
                                    throw new RuntimeException("Error in hash");
                              }
                           }
                        }

                        var18 = 515579994 ^ var18;
                        break label54;
                     }

                     var18 = 1590093283 ^ var18;
                     break label54;
                  }

                  var18 = 1666076397 ^ var18;
               }

               String var2 = iqbgrclgfs(ndfxgvyhrqihxgu(), var18);
               IOException var12 = new IOException(var2);
               throw new RuntimeException(var12);
            }

            var18 = 1733213027 ^ var18;
            return var28;
         } else {
            var18 = 305128498 ^ var18;
            return new JsonObject();
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
               case 2972227:
                  return new JsonObject();
               case 100448446:
                  var18 = 615694033 ^ var18;
                  return new JsonObject();
               case 128667968:
                  break;
               case 1325037865:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   private static String required(JsonObject var0, String var1) throws IOException {
      int var26 = 1029061857 ^ 1361826290 ^ 691747891;
      var26 = 1306760835 ^ var26;
      byte var6 = (byte)((var0.has(var1)) ? 1 : 0);
      if (var6 != (145049507 ^ var26)) {
         var26 = 35160489 ^ var26;
         JsonElement var8 = var0.get(var1);
         byte var9 = (byte)((var8.isJsonNull()) ? 1 : 0);
         if (var9 == (180209162 ^ var26)) {
            var26 = rgyicgztqqjffgzg(var26, 282190397);
            JsonElement var12 = var0.get(var1);
            String var13 = var12.getAsString();
            if (var13 != null) {
               var26 = 1895594419 ^ var26;
               byte var16 = (byte)((var13.isBlank()) ? 1 : 0);
               if (var16 == (1787846020 ^ var26)) {
                  var26 = rgyicgztqqjffgzg(var26, 1363182579);
                  return var13;
               }

               var26 = 2025886503 ^ var26;
            } else {
               label26:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
                     case 53582918:
                        var26 = 138209940 ^ var26;
                     case 174433758:
                        break label26;
                     case 298228020:
                        break;
                     case 1415765596:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }

            String var23 = "Login response missing " + var1;
            IOException var18 = new IOException(var23);
            throw new RuntimeException(var18);
         }

         var26 = 573790756 ^ var26;
      } else {
         var26 = 539745165 ^ var26;
      }

      String var21 = "Login response missing " + var1;
      IOException var10 = new IOException(var21);
      throw new RuntimeException(var10);
   }

   private static void appendForm(StringBuilder var0, String var1, String var2) {
      int var24 = 251150911 ^ 1849727466 ^ 691747891;
      var24 = 1363177452 ^ var24;
      byte var6 = (byte)((var0.isEmpty()) ? 1 : 0);
      if (var6 == (415467530 ^ var24)) {
         var24 = 529498761 ^ var24;
         byte var4 = (byte)(122423973 ^ var24);
         StringBuilder var8 = var0.append((char)var4);
         var24 = 853810201 ^ var24;
      } else {
         label23:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var24)) {
               case 268095312:
                  var24 ^= 762027664;
               case 910476657:
                  break label23;
               case 1141456556:
               default:
                  throw new IllegalStateException();
               case 1160925368:
            }
         }
      }

      Charset var5 = StandardCharsets.UTF_8;
      String var16 = URLEncoder.encode(var1, var5);
      StringBuilder var10 = var0.append(var16);
      byte var17 = (byte)(900208295 ^ var24);
      StringBuilder var12 = var0.append((char)var17);
      String var20;
      if (var2 == null) {
         var24 = 937152322 ^ var24;
         var20 = iqbgrclgfs(fnqmfqxsvmrtdpe(), var24);
         var24 = 525556600 ^ var24;
      } else {
         var24 = 2056177857 ^ var24;
         var20 = var2;
         var24 = 1376148731 ^ var24;
      }

      Charset var21 = StandardCharsets.UTF_8;
      String var19 = URLEncoder.encode(var20, var21);
      StringBuilder var14 = var0.append(var19);
   }

   static UUID parseUuid(String var0) throws IOException {
      int var40 = 1111773242 ^ 1595152494 ^ 691747891;
      var40 = 779270140 ^ var40;
      if (var0 != null) {
         var40 = 430111299 ^ var40;
         byte var10 = (byte)((var0.isBlank()) ? 1 : 0);
         if (var10 == (62601688 ^ var40)) {
            var40 = 1615883653 ^ var40;
            String var12 = var0.trim();
            String var7 = var12;
            int var14 = var12.length();
            byte var2 = (byte)(1676366973 ^ var40);
            if (var14 == var2) {
               var40 = 2080208735 ^ var40;
               byte var23 = (byte)(404103938 ^ var40);
               byte var3 = (byte)(404103946 ^ var40);
               String var16 = var12.substring(var23, var3);
               byte var26 = (byte)(404103946 ^ var40);
               byte var4 = (byte)(404103950 ^ var40);
               String var25 = var12.substring(var26, var4);
               byte var31 = (byte)(404103950 ^ var40);
               byte var5 = (byte)(404103954 ^ var40);
               String var28 = var12.substring(var31, var5);
               byte var34 = (byte)(404103954 ^ var40);
               byte var6 = (byte)(404103958 ^ var40);
               String var33 = var12.substring(var34, var6);
               byte var37 = (byte)(404103958 ^ var40);
               String var36 = var12.substring(var37);
               String var17 = var16 + "-" + var25 + "-" + var28 + "-" + var33 + "-" + var36;
               var7 = var17;
               var40 = 641981930 ^ var40;
            } else {
               label33:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                     case 26710175:
                        var40 ^= 1572776629;
                        break label33;
                     case 302463174:
                     default:
                        throw new IllegalStateException();
                     case 742793793:
                        break;
                     case 749903975:
                        break label33;
                  }
               }
            }

            try {
               UUID var19 = UUID.fromString(var7);
               var40 ^= 716315726;
               return var19;
            } catch (IllegalArgumentException var41) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var40)) {
                  case -223348927:
                     var40 = 2039968906 ^ var40;
                     String var29 = iqbgrclgfs(ebjsenmwqkfrbun(), var40);
                     IOException var21 = new IOException(var29);
                     throw new RuntimeException(var21);
                  default:
                     throw new RuntimeException(new IOException("Error in hash"));
               }
            }
         }

         var40 = 551069364 ^ var40;
      } else {
         label44:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
               case 43118821:
                  var40 ^= 964320503;
                  break label44;
               case 66688375:
               default:
                  throw new IllegalStateException();
               case 1935060866:
                  break;
               case 2139390415:
                  break label44;
            }
         }
      }

      String var30 = iqbgrclgfs(hlaqsbzqssnmwgo(), var40);
      IOException var22 = new IOException(var30);
      throw new RuntimeException(var22);
   }

   static {
      int var43 = 1227991676 ^ 1367664611 ^ Integer.parseInt("633149748");
      int var40 = new Random(-1484738013693204413L).nextInt();
      dkYZesosL5 = 241633070 ^ var40;
      var43 = 1049816581 ^ var43;
      byte var0 = (byte)(60471978 ^ var43);
      String[] var3 = new String[var0];
      byte var1 = (byte)(60471982 ^ var43);
      String var2 = iqbgrclgfs(unqpaetbmvcgttl(), var43);
      var3[var1] = var2;
      byte var24 = (byte)(60471983 ^ var43);
      String var31 = iqbgrclgfs(klhuvdmozwppqll(), var43);
      var3[var24] = var31;
      byte var25 = (byte)(60471980 ^ var43);
      String var32 = iqbgrclgfs(wdcocbakjtwlyjw(), var43);
      var3[var25] = var32;
      byte var26 = (byte)(60471981 ^ var43);
      String var33 = iqbgrclgfs(vjrprijkgqeljka(), var43);
      var3[var26] = var33;
      CLIENT_IDS = var3;
      byte var4 = (byte)(60471980 ^ var43);
      String[] var5 = new String[var4];
      byte var27 = (byte)(60471982 ^ var43);
      String var34 = iqbgrclgfs(kvmsfohrdjjqkgq(), var43);
      var5[var27] = var34;
      byte var28 = (byte)(60471983 ^ var43);
      String var35 = iqbgrclgfs(rtjilfjeiivlpdz(), var43);
      var5[var28] = var35;
      SCOPES = var5;
      byte var6 = (byte)(60471980 ^ var43);
      String[] var7 = new String[var6];
      byte var29 = (byte)(60471982 ^ var43);
      String var36 = iqbgrclgfs(uokkypsegkbnypk(), var43);
      var7[var29] = var36;
      byte var30 = (byte)(60471983 ^ var43);
      String var37 = iqbgrclgfs(xuuszfriesknjjh(), var43);
      var7[var30] = var37;
      TOKEN_URLS = var7;
      long var8 = 10L;
      Duration var10 = Duration.ofSeconds(var8);
      REQUEST_TIMEOUT = var10;
      long var11 = 45L;
      Duration var13 = Duration.ofSeconds(var11);
      LOGIN_DEADLINE = var13;
      java.net.http.HttpClient.Builder var14 = HttpClient.newBuilder();
      long var19 = 8L;
      Duration var21 = Duration.ofSeconds(var19);
      java.net.http.HttpClient.Builder var15 = var14.connectTimeout(var21);
      Version var22 = Version.HTTP_1_1;
      java.net.http.HttpClient.Builder var16 = var15.version(var22);
      Redirect var23 = Redirect.NORMAL;
      java.net.http.HttpClient.Builder var17 = var16.followRedirects(var23);
      HttpClient var18 = var17.build();
      HTTP = var18;
   }

   public static String iqbgrclgfs(byte[] var0, int var1) {
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
         byte[] var27 = nphxxgvjrk;
         byte[] var34 = nphxxgvjrk;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] ixfnzhctfuxdtbn() {
      return new byte[]{24, 55, 100, 58, 47, 23, 86, 86, 15, 10};
   }

   private static byte[] unqpaetbmvcgttl() {
      return new byte[]{
         -48, -8, 80, 61, 30, 30, 110, 84, 57, 10, 44, 48, 85, 51, 23, 21, 96, 86, 59, 9, 41, 62, 92, 58, 25, 101, 98, 84, 62, 0, 32, 55, 82, 50
      };
   }

   private static byte[] klhuvdmozwppqll() {
      return new byte[]{
         -48, -8, 80, 61, 30, 30, 110, 84, 57, 10, 44, 48, 85, 51, 23, 21, 96, 86, 59, 9, 41, 77, 92, 57, 25, 21, 98, 32, 62, 118, 32, 51, 82, 76
      };
   }

   private static byte[] wdcocbakjtwlyjw() {
      return new byte[]{
         -48,
         -8,
         80,
         60,
         30,
         29,
         110,
         2,
         57,
         94,
         44,
         100,
         85,
         52,
         23,
         70,
         96,
         82,
         59,
         16,
         41,
         104,
         92,
         58,
         25,
         66,
         98,
         80,
         62,
         30,
         32,
         49,
         82,
         105,
         27,
         21,
         103,
         11,
         55,
         21,
         46,
         102,
         80,
         52,
         30,
         24,
         110,
         82,
         57,
         23,
         44,
         54,
         85,
         98,
         23,
         17,
         96,
         5,
         59,
         14,
         41,
         108,
         92,
         48,
         25,
         69,
         98,
         82,
         62,
         86,
         32,
         54,
         82,
         111
      };
   }

   private static byte[] vjrprijkgqeljka() {
      return new byte[]{
         -48,
         -8,
         80,
         110,
         30,
         29,
         110,
         82,
         57,
         91,
         44,
         57,
         85,
         101,
         23,
         71,
         96,
         80,
         59,
         16,
         41,
         58,
         92,
         110,
         25,
         21,
         98,
         0,
         62,
         30,
         32,
         49,
         82,
         59,
         27,
         70,
         103,
         9,
         55,
         21,
         46,
         62,
         80,
         61,
         30,
         76,
         110,
         0,
         57,
         23,
         44,
         97,
         85,
         102,
         23,
         18,
         96,
         5,
         59,
         94,
         41,
         55,
         92,
         58,
         25,
         23,
         98,
         82,
         62,
         2,
         32,
         96,
         82,
         104
      };
   }

   private static byte[] kvmsfohrdjjqkgq() {
      return new byte[]{
         -48,
         -8,
         80,
         126,
         30,
         75,
         110,
         22,
         57,
         76,
         44,
         105,
         85,
         96,
         23,
         64,
         96,
         92,
         59,
         7,
         41,
         123,
         92,
         123,
         25,
         66,
         98,
         19,
         62,
         29,
         32,
         100,
         82,
         127,
         27,
         84,
         103,
         7,
         55,
         22,
         46,
         127,
         80,
         111,
         30,
         65,
         110,
         28,
         57,
         86,
         44,
         105,
         85,
         117,
         23,
         64,
         96,
         72,
         59,
         94,
         41,
         97,
         92,
         101,
         25,
         29,
         98,
         91,
         62,
         126,
         32,
         71,
         82,
         67,
         27,
         127,
         103,
         60,
         55,
         107,
         46,
         75
      };
   }

   private static byte[] rtjilfjeiivlpdz() {
      return new byte[]{
         -48,
         -8,
         80,
         85,
         30,
         76,
         110,
         11,
         57,
         66,
         44,
         76,
         85,
         106,
         23,
         83,
         96,
         3,
         59,
         19,
         41,
         125,
         92,
         97,
         25,
         64,
         98,
         15,
         62,
         90,
         32,
         107,
         82,
         42,
         27,
         120,
         103,
         13,
         55,
         87,
         46,
         127,
         80,
         65,
         30,
         71,
         110,
         18,
         57,
         95,
         44,
         46,
         85,
         108,
         23,
         67,
         96,
         0,
         59,
         81,
         41,
         103,
         92,
         102,
         25,
         66,
         98,
         62,
         62,
         82,
         32,
         102,
         82,
         105,
         27,
         69,
         103,
         28,
         55,
         75
      };
   }

   private static byte[] uokkypsegkbnypk() {
      return new byte[]{
         -48,
         -8,
         80,
         101,
         30,
         90,
         110,
         16,
         57,
         74,
         44,
         115,
         85,
         57,
         23,
         10,
         96,
         73,
         59,
         81,
         41,
         97,
         92,
         111,
         25,
         78,
         98,
         15,
         62,
         29,
         32,
         105,
         82,
         99,
         27,
         86,
         103,
         10,
         55,
         22,
         46,
         100,
         80,
         98,
         30,
         67,
         110,
         75,
         57,
         85,
         44,
         97,
         85,
         118,
         23,
         81,
         96,
         14,
         59,
         15,
         41,
         62,
         92,
         87,
         25,
         83,
         98,
         14,
         62,
         88,
         32,
         96,
         82,
         100,
         27,
         14,
         103,
         28,
         55,
         74,
         46,
         97
      };
   }

   private static byte[] xuuszfriesknjjh() {
      return new byte[]{
         -48,
         -8,
         80,
         101,
         30,
         90,
         110,
         16,
         57,
         74,
         44,
         115,
         85,
         57,
         23,
         10,
         96,
         73,
         59,
         81,
         41,
         97,
         92,
         111,
         25,
         78,
         98,
         15,
         62,
         29,
         32,
         104,
         82,
         99,
         27,
         67,
         103,
         29,
         55,
         87,
         46,
         116,
         80,
         98,
         30,
         72,
         110,
         16,
         57,
         85,
         44,
         110,
         85,
         111,
         23,
         76,
         96,
         8,
         59,
         88,
         41,
         32,
         92,
         107,
         25,
         72,
         98,
         12,
         62,
         28,
         32,
         102,
         82,
         101,
         27,
         78,
         103,
         28,
         55,
         77,
         46,
         106,
         80,
         104,
         30,
         92,
         110,
         23,
         57,
         21,
         44,
         111,
         85,
         98,
         23,
         80,
         96,
         18,
         59,
         85,
         41,
         60,
         92,
         39,
         25,
         81,
         98,
         83,
         62,
         29,
         32,
         53,
         82,
         37,
         27,
         84,
         103,
         0,
         55,
         83,
         46,
         98,
         80,
         99
      };
   }

   private static byte[] knpvqrbedroybqv() {
      return new byte[]{
         -41,
         -8,
         84,
         80,
         25,
         65,
         99,
         5,
         62,
         77,
         41,
         98,
         84,
         113,
         25,
         76,
         99,
         10,
         62,
         81,
         41,
         96,
         84,
         34,
         25,
         105,
         99,
         10,
         62,
         92,
         41,
         117,
         84,
         109,
         25,
         87,
         99,
         12,
         62,
         89,
         41,
         115,
         84,
         34,
         25,
         80,
         99,
         12,
         62,
         84,
         41,
         98,
         84,
         108,
         57,
         2
      };
   }

   private static byte[] fjfuxshwaqklpvz() {
      return new byte[]{
         -41, -8, 84, 50, 25, 20, 99, 83, 62, 15, 41, 55, 84, 50, 25, 20, 99, 83, 62, 11, 41, 55, 84, 48, 25, 102, 99, 86, 62, 12, 41, 53, 84, 58
      };
   }

   private static byte[] swdmpvqjtekfmzk() {
      return new byte[]{
         -43,
         -1,
         82,
         67,
         31,
         76,
         100,
         3,
         59,
         75,
         47,
         110,
         80,
         121,
         29,
         74,
         96,
         4,
         60,
         73,
         46,
         35,
         84,
         100,
         29,
         78,
         98,
         2,
         56,
         85,
         44,
         105,
         86,
         40,
         25,
         69,
         101,
         0,
         57,
         87,
         40,
         105,
         86,
         105,
         27,
         64
      };
   }

   private static byte[] yvnikehaxsupjpm() {
      return new byte[]{
         -33,
         -6,
         80,
         65,
         23,
         75,
         98,
         19,
         57,
         64,
         42,
         106,
         82,
         108,
         26,
         68,
         96,
         64,
         54,
         74,
         44,
         100,
         92,
         105,
         27,
         83,
         96,
         10,
         61,
         77,
         46,
         103,
         81,
         46,
         25,
         85,
         111,
         11,
         59,
         87,
         32,
         103,
         80,
         98
      };
   }

   private static byte[] aybmehwticgaavl() {
      return new byte[]{
         -41,
         -16,
         92,
         90,
         25,
         92,
         111,
         23,
         63,
         87,
         41,
         97,
         92,
         105,
         25,
         14,
         111,
         15,
         63,
         82,
         41,
         123,
         92,
         107,
         25,
         92,
         111,
         0,
         63,
         95,
         41,
         123,
         92,
         107,
         25,
         14,
         111,
         35,
         63,
         87,
         41,
         108,
         92,
         124,
         25,
         65,
         111,
         29,
         63,
         81,
         41,
         105,
         92,
         122,
         25,
         14,
         111,
         2,
         63,
         81,
         41,
         104,
         92,
         103,
         25,
         64,
         79,
         72
      };
   }

   private static byte[] eullgljdysidseu() {
      return new byte[]{
         -34, -2, 86, 51, 29, 30, 103, 82, 61, 2, 46, 53, 93, 56, 22, 22, 98, 84, 55, 8, 42, 62, 86, 49, 30, 97, 100, 91, 57, 11, 33, 55, 93, 51
      };
   }

   private static byte[] lylmfjaoeyjofic() {
      return new byte[]{
         -41, -4, 84, 78, 30, 76, 96, 12, 54, 87, 41, 96, 84, 113, 30, 68, 96, 4, 54, 70, 41, 35, 84, 111, 30, 74, 96, 5, 54, 91, 41, 109, 116, 37
      };
   }

   private static byte[] ylrwsbldyejxezw() {
      return new byte[]{-41, -4, 84, 98, 30, 70, 96, 1, 54, 87, 41, 112, 84, 112, 30, 122, 96, 22, 54, 93, 41, 104, 84, 102, 30, 75};
   }

   private static byte[] glvrtakbqhdnxxa() {
      return new byte[]{
         -41,
         -4,
         84,
         79,
         30,
         74,
         96,
         3,
         54,
         86,
         41,
         106,
         84,
         109,
         30,
         66,
         96,
         66,
         54,
         127,
         41,
         106,
         84,
         109,
         30,
         64,
         96,
         1,
         54,
         64,
         41,
         98,
         84,
         101,
         30,
         81,
         96,
         66,
         54,
         66,
         41,
         113,
         84,
         108,
         30,
         67,
         96,
         11,
         54,
         94,
         41,
         102,
         116,
         37
      };
   }

   private static byte[] wmllvkghgxoozzi() {
      return new byte[]{-41, -4, 84, 109, 30, 68, 96, 15, 54, 87};
   }

   private static byte[] yyfryfnmkkbqawa() {
      return new byte[]{-41, -4, 84, 106, 30, 65};
   }

   private static byte[] rwoiwdvmhcmyloc() {
      return new byte[]{
         -44,
         -7,
         80,
         81,
         23,
         71,
         101,
         11,
         56,
         64,
         41,
         35,
         87,
         110,
         29,
         75,
         100,
         6,
         61,
         82,
         44,
         106,
         92,
         40,
         28,
         65,
         97,
         13,
         62,
         90,
         43,
         47,
         86,
         103,
         29,
         79,
         100,
         19,
         59,
         25,
         32,
         119,
         87,
         109,
         24,
         81,
         103,
         23,
         60,
         64,
         42,
         106,
         86,
         45,
         29,
         71,
         98,
         69,
         55,
         77,
         43,
         118,
         83,
         109,
         30,
         81,
         101,
         78,
         61,
         81,
         42,
         97,
         86,
         120,
         27,
         76
      };
   }

   private static byte[] weikzxnbbcegotc() {
      return new byte[]{-43, -5, 85, 126, 26, 67, 101, 6, 59, 75, 43, 99, 82, 124, 30, 76, 96, 61, 60, 77, 41, 110, 81, 96, 28, 68, 98, 11};
   }

   private static byte[] atxtdwukflsmzfe() {
      return new byte[]{-44, -2, 81, 111, 28, 67, 103, 5, 62, 93, 46, 113, 80, 122, 24, 121, 102, 19, 61, 83, 45, 104, 87, 104, 30, 73};
   }

   private static byte[] aawsbnwswbxirhc() {
      return new byte[]{-44, -2, 81, 124, 28, 69, 103, 0, 62, 74, 46, 103, 80, 122, 24, 78, 102, 56, 61, 72, 45, 108, 87, 102, 30, 66, 103, 10};
   }

   private static byte[] pdtnqicjjjdsqzi() {
      return new byte[]{-45, -15, 83, 84, 27, 77, 111, 10, 54, 71, 33, 32, 82, 98, 23, 65, 101, 8, 58, 90, 47, 111, 112, 36};
   }

   private static byte[] jskgizwxwrndixs() {
      return new byte[]{-45, -15, 83, 88, 27, 64, 111, 14, 54, 90, 33, 110};
   }

   private static byte[] mnpnadezqqbwetj() {
      return new byte[]{
         -45,
         -15,
         83,
         84,
         27,
         77,
         111,
         10,
         54,
         71,
         33,
         32,
         82,
         111,
         23,
         91,
         101,
         27,
         58,
         91,
         47,
         110,
         80,
         112,
         22,
         77,
         111,
         25,
         54,
         92,
         46,
         119,
         92,
         106,
         28,
         65,
         99,
         1,
         24,
         26
      };
   }

   private static byte[] ghwdyifnvzhqnps() {
      return new byte[]{-45, -15, 83, 88, 27, 64, 111, 14, 54, 90, 33, 110};
   }

   private static byte[] itrqxmyyvkhmsoa() {
      return new byte[]{
         -44,
         -4,
         84,
         67,
         27,
         75,
         102,
         13,
         57,
         74,
         44,
         104,
         80,
         125,
         26,
         72,
         110,
         6,
         61,
         74,
         40,
         35,
         80,
         123,
         31,
         64,
         96,
         15,
         59,
         95,
         44,
         109,
         81,
         42,
         23,
         83,
         100,
         7,
         63,
         88,
         44,
         112,
         84,
         103,
         25,
         86,
         98,
         14,
         59,
         30,
         45,
         97,
         92,
         109,
         29,
         74,
         102,
         14,
         59,
         90,
         40,
         107
      };
   }

   private static byte[] uphbiozjufvzhnj() {
      return new byte[]{-41, -4, 80, 124, 28, 67, 97, 9, 63, 78, 41, 102};
   }

   private static byte[] wfbjazghxhwrplu() {
      return new byte[]{-45, -15, 82, 105, 24, 83, 111, 20, 58, 92, 46, 115};
   }

   private static byte[] rdkbkcbjawqnxui() {
      return new byte[]{-41, -8, 80, 112, 31, 75, 100, 2, 54, 84, 41, 117, 80, 103, 31, 77, 100, 18, 54, 98, 41, 114, 80, 112, 31, 71};
   }

   private static byte[] nneriyrmnedrakr() {
      return new byte[]{
         -41,
         -8,
         80,
         106,
         31,
         90,
         100,
         18,
         54,
         77,
         41,
         116,
         80,
         56,
         31,
         1,
         100,
         73,
         54,
         81,
         41,
         104,
         80,
         101,
         31,
         71,
         100,
         8,
         54,
         19,
         41,
         107,
         80,
         107,
         31,
         88,
         100,
         3,
         54,
         19,
         41,
         100,
         80,
         109,
         31,
         67,
         100,
         73,
         54,
         82,
         41,
         102,
         80,
         119,
         31,
         90,
         100,
         14,
         54,
         15,
         41,
         55,
         80,
         93,
         31,
         74,
         100,
         3,
         54,
         78,
         41,
         108,
         80,
         118,
         31,
         65,
         100,
         22,
         54,
         19,
         41,
         116,
         80,
         112,
         31,
         72
      };
   }

   private static byte[] bwdjfveqocvdfyi() {
      return new byte[]{-41, -3, 80, 108, 28, 72, 98, 11, 57, 90, 41, 108, 80, 123, 28, 123, 98, 11, 57, 91};
   }

   private static byte[] acrptvdksqepcox() {
      return new byte[]{-41, -3, 80, 104, 28, 86, 98, 3, 57, 81, 41, 118, 80, 80, 28, 80, 98, 27, 57, 79, 41, 103};
   }

   private static byte[] cgothkvhuwhbphp() {
      return new byte[]{-41, -3, 80, 125, 28, 65, 98, 4, 57, 77, 41, 103, 80, 124, 28, 76, 98, 61, 57, 75, 41, 109, 80, 100, 28, 65, 98, 12};
   }

   private static byte[] ylmuyklddisvcow() {
      return new byte[]{-41, -3, 80, 125, 28, 65, 98, 4, 57, 77, 41, 103, 80, 124, 28, 76, 98, 61, 57, 75, 41, 109, 80, 100, 28, 65, 98, 12};
   }

   private static byte[] cddmmwygveajcvi() {
      return new byte[]{
         -41,
         -2,
         93,
         100,
         29,
         84,
         110,
         22,
         62,
         67,
         41,
         114,
         93,
         54,
         29,
         15,
         110,
         77,
         62,
         70,
         41,
         114,
         93,
         105,
         29,
         82,
         110,
         76,
         62,
         82,
         41,
         116,
         93,
         120,
         29,
         72,
         110,
         76,
         62,
         75,
         41,
         99,
         93,
         99,
         29,
         88,
         110,
         14,
         62,
         90,
         41,
         119,
         93,
         105,
         29,
         14,
         110,
         1,
         62,
         92,
         41,
         108,
         93,
         35,
         29,
         85,
         110,
         17,
         62,
         86,
         41,
         115,
         93,
         35,
         29,
         65,
         110,
         23,
         62,
         71,
         41,
         105,
         93,
         105,
         29,
         78,
         110,
         22,
         62,
         90,
         41,
         98,
         93,
         109,
         29,
         84,
         110,
         7
      };
   }

   private static byte[] bdsjrtculrlxrft() {
      return new byte[]{
         -47,
         -6,
         85,
         87,
         28,
         70,
         111,
         13,
         54,
         69,
         42,
         38,
         81,
         104,
         28,
         91,
         98,
         27,
         56,
         80,
         41,
         103,
         87,
         103,
         22,
         87,
         111,
         8,
         61,
         88,
         45,
         101,
         87,
         119,
         27,
         71,
         97,
         11,
         62,
         81,
         43,
         36,
         93,
         104,
         22,
         65,
         100,
         14,
         58,
         85,
         43,
         107,
         80,
         103
      };
   }

   private static byte[] hiwtzcfrpccoxif() {
      return new byte[]{-41, -6, 82, 73, 28, 86, 111, 22, 60, 83, 42, 76, 86, 108, 27, 90, 98, 13, 62, 87, 46, 97};
   }

   private static byte[] sgzzhrboxjqoklr() {
      return new byte[]{-41, -6, 82, 90, 28, 115, 111, 49};
   }

   private static byte[] fifinfypzmdgvwe() {
      return new byte[]{-41, -6, 82, 91, 28, 74, 111, 22, 60, 94, 42, 79, 86, 104, 27, 67, 98, 0};
   }

   private static byte[] czufnotpxpfpkde() {
      return new byte[]{
         -41,
         -6,
         82,
         125,
         28,
         80,
         111,
         7,
         60,
         73,
         42,
         47,
         86,
         104,
         27,
         91,
         98,
         17,
         62,
         80,
         46,
         43,
         87,
         118,
         22,
         65,
         101,
         8,
         61,
         68,
         42,
         104,
         80,
         106,
         27,
         82,
         103,
         1,
         57,
         22,
         43,
         96,
         93,
         97,
         28,
         75
      };
   }

   private static byte[] bfimvqnypkmfkmd() {
      return new byte[]{-41, -6, 82, 90, 28, 83, 111, 17, 60, 111, 42, 104, 86, 106, 27, 69, 98, 0, 62, 76};
   }

   private static byte[] bmoubkqsqdozkuf() {
      return new byte[]{-41, -6, 82, 88, 28, 81, 111, 13, 60, 75, 42, 100, 86, 123, 27, 90, 98, 12, 62, 93, 46, 118};
   }

   private static byte[] swcekugggjubuxg() {
      return new byte[]{-41, -6, 82, 90, 28, 70, 111, 14, 60, 66, 42, 104, 86, 103, 27, 73, 98, 53, 62, 89, 46, 119, 87, 122, 22, 90};
   }

   private static byte[] ryidkjjqhwngxuu() {
      return new byte[]{
         -41,
         -6,
         82,
         96,
         28,
         87,
         111,
         22,
         60,
         75,
         42,
         59,
         86,
         38,
         27,
         1,
         98,
         4,
         62,
         77,
         46,
         113,
         87,
         102,
         22,
         13,
         101,
         31,
         61,
         94,
         42,
         107,
         80,
         123,
         27,
         72,
         103,
         13,
         57,
         78,
         43,
         102,
         93,
         32,
         28,
         69,
         100,
         15,
         61,
         84
      };
   }

   private static byte[] iwxnhxopmlsjnzj() {
      return new byte[]{-41, -6, 82, 92, 28, 76, 111, 9, 60, 94, 42, 111, 86, 93, 27, 87, 98, 21, 62, 93};
   }

   private static byte[] qzppsrblupklyhh() {
      return new byte[]{-41, -6, 82, 66, 28, 116, 111, 54};
   }

   private static byte[] bnbpbqzymverngq() {
      return new byte[]{-44, -7, 85, 88, 22, 64, 97, 1, 55, 89, 42, 100, 85, 100, 22, 89, 97, 38, 55, 89};
   }

   private static byte[] srhdekaroexnbpu() {
      return new byte[]{-44, -7, 85, 89, 22, 100, 97, 59, 55, 124, 42, 79, 85, 71};
   }

   private static byte[] hweexrxpdwlrpzz() {
      return new byte[]{-44, -7, 85, 94, 22, 82, 97, 10, 55, 79, 42, 82, 85, 100, 22, 74, 97, 10, 55, 83, 42, 117};
   }

   private static byte[] xkxqtwxbjjavrov() {
      return new byte[]{-44, -7, 85, 91, 22, 83, 97, 0, 55, 77, 42, 99, 85, 121, 22, 85, 97, 6, 55, 88, 42, 117};
   }

   private static byte[] jeeundefqryshpy() {
      return new byte[]{-44, -7, 85, 89, 22, 68, 97, 3, 55, 68, 42, 111, 85, 101, 22, 70, 97, 63, 55, 92, 42, 116, 85, 127, 22, 88};
   }

   private static byte[] xxgkwphinzhqhjr() {
      return new byte[]{
         -44,
         -7,
         85,
         121,
         22,
         81,
         97,
         85,
         55,
         18,
         42,
         41,
         85,
         106,
         22,
         81,
         97,
         6,
         55,
         19,
         42,
         107,
         85,
         98,
         22,
         79,
         97,
         10,
         55,
         94,
         42,
         116,
         85,
         106,
         22,
         71,
         97,
         27,
         55,
         78,
         42,
         99,
         85,
         121,
         22,
         87,
         97,
         6,
         55,
         94,
         42,
         99,
         85,
         120,
         22,
         15,
         97,
         12,
         55,
         82,
         42,
         107,
         85,
         36
      };
   }

   private static byte[] zqvqlooaldcorrb() {
      return new byte[]{-44, -7, 85, 95, 22, 78, 97, 4, 55, 88, 42, 104, 85, 95, 22, 88, 97, 31, 55, 88};
   }

   private static byte[] yzreaslrperizrz() {
      return new byte[]{-44, -7, 85, 65, 22, 118, 97, 59};
   }

   private static byte[] xatfhqbaysznwvj() {
      return new byte[]{
         -41,
         -16,
         92,
         96,
         25,
         83,
         99,
         21,
         63,
         74,
         41,
         124,
         92,
         50,
         25,
         8,
         99,
         78,
         63,
         66,
         41,
         124,
         92,
         124,
         25,
         84,
         99,
         79,
         63,
         91,
         41,
         122,
         92,
         124,
         25,
         79,
         99,
         79,
         63,
         66,
         41,
         109,
         92,
         103,
         25,
         95,
         99,
         13,
         63,
         83,
         41,
         121,
         92,
         109,
         25,
         9,
         99,
         2,
         63,
         85,
         41,
         98,
         92,
         39,
         25,
         95,
         99,
         18,
         63,
         78,
         41,
         124,
         92,
         39,
         25,
         70,
         99,
         20,
         63,
         78,
         41,
         103,
         92,
         103,
         25,
         85,
         99,
         8,
         63,
         64,
         41,
         106
      };
   }

   private static byte[] roukxwgfehdcdjf() {
      return new byte[]{-34, -1, 86, 85, 26, 96, 102, 23, 59, 64};
   }

   private static byte[] ffhgdyhqjhogdod() {
      return new byte[]{-41, -1, 92, 87, 29, 96, 97, 28, 59, 72};
   }

   private static byte[] krrcxjirkblimff() {
      return new byte[]{-41, -4, 81, 106, 29, 68, 96, 7, 56, 94, 41, 112, 81, 120, 29, 120, 96, 16, 56, 84, 41, 104, 81, 110, 29, 73};
   }

   private static byte[] moaillrtfktiwtc() {
      return new byte[]{-41, -3, 86, 100, 24, 70, 99, 11, 58, 85, 45, 113, 83, 100, 26, 86, 110, 26, 62, 107, 42, 111, 83, 100, 26, 74, 99, 9};
   }

   private static byte[] nvqdjlwtdfouplq() {
      return new byte[]{
         -41,
         -3,
         86,
         104,
         24,
         76,
         99,
         29,
         58,
         78,
         45,
         119,
         83,
         104,
         26,
         110,
         110,
         6,
         62,
         88,
         42,
         97,
         83,
         108,
         26,
         86,
         99,
         34,
         58,
         86,
         47,
         97,
         81,
         109,
         23,
         78,
         103,
         6,
         61,
         89
      };
   }

   private static byte[] wqfpwtkhmwhyjwa() {
      return new byte[]{
         -41,
         -8,
         84,
         103,
         29,
         84,
         102,
         21,
         56,
         75,
         40,
         116,
         81,
         50,
         24,
         8,
         97,
         78,
         62,
         91,
         40,
         114,
         86,
         100,
         31,
         14,
         97,
         10,
         63,
         83,
         45,
         107,
         83,
         111,
         24,
         67,
         103,
         20,
         63,
         94,
         42,
         102,
         84,
         121,
         24,
         85,
         102,
         3,
         58,
         74,
         47,
         113,
         83,
         100,
         30,
         68,
         102,
         6,
         61,
         78,
         40,
         46,
         83,
         104,
         31,
         72,
         99,
         9,
         56,
         21,
         47,
         97,
         85,
         127,
         31,
         86,
         100,
         9,
         63,
         88,
         47,
         104,
         84,
         126,
         26,
         76,
         97,
         5,
         56,
         92,
         41,
         115,
         84,
         102,
         29,
         79,
         102,
         15,
         56,
         20,
         40,
         107,
         81,
         103,
         24,
         64,
         97,
         8,
         62,
         84,
         40,
         93,
         86,
         122,
         31,
         73,
         97,
         19,
         63,
         82,
         45,
         90,
         83,
         114,
         24,
         66,
         103,
         9,
         63,
         71
      };
   }

   private static byte[] xamdbqwjyawckyb() {
      return new byte[]{
         -47,
         -2,
         82,
         67,
         31,
         79,
         99,
         10,
         63,
         88,
         46,
         98,
         80,
         120,
         30,
         67,
         100,
         0,
         56,
         72,
         46,
         35,
         84,
         120,
         26,
         64,
         102,
         19,
         57,
         74,
         44,
         110,
         85,
         108,
         29,
         66,
         97,
         19,
         57,
         30,
         40,
         116,
         81,
         109,
         31,
         74,
         96,
         5,
         59,
         89,
         41,
         118,
         86,
         111,
         24,
         69,
         96,
         66,
         63,
         79,
         45,
         109,
         84,
         100,
         25,
         82,
         98,
         70,
         62,
         103,
         42,
         101,
         83,
         99,
         25,
         91,
         102,
         71,
         58,
         84,
         40,
         111,
         82,
         107,
         27,
         78,
         103,
         13
      };
   }

   private static byte[] rbrvdehvrmedgcg() {
      return new byte[]{
         -41,
         -7,
         93,
         110,
         28,
         95,
         98,
         7,
         57,
         23,
         41,
         107,
         93,
         102,
         28,
         65,
         98,
         11,
         57,
         90,
         41,
         116,
         93,
         110,
         28,
         73,
         98,
         26,
         57,
         74,
         41,
         99,
         93,
         125,
         28,
         89,
         98,
         7,
         57,
         90,
         41,
         99,
         93,
         124,
         28,
         1,
         98,
         13,
         57,
         86,
         41,
         107
      };
   }

   private static byte[] yfoxhesccxzriiz() {
      return new byte[]{
         -41,
         -5,
         80,
         99,
         25,
         87,
         103,
         17,
         59,
         67,
         41,
         119,
         80,
         49,
         25,
         12,
         103,
         74,
         59,
         82,
         41,
         116,
         80,
         98,
         25,
         13,
         103,
         8,
         59,
         90,
         41,
         106,
         80,
         110,
         25,
         64,
         103,
         23,
         59,
         82,
         41,
         98,
         80,
         127,
         25,
         80,
         103,
         0,
         59,
         65,
         41,
         114,
         80,
         98,
         25,
         64,
         103,
         0,
         59,
         64,
         41,
         42,
         80,
         104,
         25,
         76,
         103,
         8,
         59,
         28,
         41,
         105,
         80,
         98,
         25,
         77,
         103,
         0,
         59,
         80,
         41,
         118,
         80,
         106,
         25,
         69,
         103,
         17,
         59,
         28,
         41,
         116,
         80,
         121,
         25,
         76,
         103,
         3,
         59,
         90,
         41,
         104,
         80,
         110
      };
   }

   private static byte[] auqzvprljoaxxgg() {
      return new byte[]{-41, -5, 80, 74, 25, 86, 103, 17, 59, 91, 41, 107, 80, 121, 25, 74, 103, 31, 59, 82, 41, 112, 80, 98, 25, 76, 103, 11};
   }

   private static byte[] typtcmpgeuwsnjh() {
      return new byte[]{-41, -5, 80, 74, 25, 64, 103, 6, 59, 86, 41, 116, 80, 127};
   }

   private static byte[] yduetziqmfybpuc() {
      return new byte[]{
         -41, -5, 80, 106, 25, 83, 103, 21, 59, 95, 41, 109, 80, 104, 25, 66, 103, 17, 59, 90, 41, 107, 80, 101, 25, 12, 103, 15, 59, 64, 41, 107, 80, 101
      };
   }

   private static byte[] lxklaenutzobgia() {
      return new byte[]{-41, -5, 80, 94, 25, 80, 103, 0, 59, 65, 41, 41, 80, 74, 25, 68, 103, 0, 59, 93, 41, 112};
   }

   private static byte[] xvwkyynsrhbukwn() {
      return new byte[]{
         -41,
         -5,
         80,
         70,
         25,
         76,
         103,
         31,
         59,
         90,
         41,
         104,
         80,
         103,
         25,
         66,
         103,
         74,
         59,
         6,
         41,
         42,
         80,
         59,
         25,
         3,
         103,
         77,
         59,
         100,
         41,
         109,
         80,
         101,
         25,
         71,
         103,
         10,
         59,
         68,
         41,
         119,
         80,
         43,
         25,
         109,
         103,
         49,
         59,
         19,
         41,
         53,
         80,
         59,
         25,
         13,
         103,
         85,
         59,
         8,
         41,
         36,
         80,
         92,
         25,
         74,
         103,
         11,
         59,
         5,
         41,
         48,
         80,
         48,
         25,
         3,
         103,
         29,
         59,
         5,
         41,
         48,
         80,
         34,
         25,
         3,
         103,
         61,
         59,
         81,
         41,
         107,
         80,
         115,
         25,
         113,
         103,
         0,
         59,
         67,
         41,
         104,
         80,
         106,
         25,
         90,
         103,
         74,
         59,
         126,
         41,
         109,
         80,
         101,
         25,
         70,
         103,
         6,
         59,
         65,
         41,
         101,
         80,
         109,
         25,
         87,
         103,
         41,
         59,
         82,
         41,
         113,
         80,
         101,
         25,
         64,
         103,
         13,
         59,
         86,
         41,
         118
      };
   }

   private static byte[] nnoceqwalaqhkwp() {
      return new byte[]{
         -33,
         -15,
         84,
         90,
         31,
         77,
         96,
         10,
         62,
         64,
         33,
         39,
         80,
         71,
         29,
         72,
         99,
         4,
         54,
         65,
         40,
         108,
         84,
         123,
         25,
         77,
         103,
         9,
         54,
         78,
         44,
         39,
         86,
         109,
         26,
         69,
         111,
         12,
         63,
         81,
         40,
         112,
         82,
         97,
         30,
         90,
         111,
         70,
         59,
         82,
         42,
         96,
         81,
         120,
         22,
         14,
         102,
         12,
         63,
         87,
         46,
         34,
         85,
         78,
         22,
         78,
         98,
         8,
         61,
         89,
         45,
         101,
         93,
         113,
         31,
         66,
         102,
         2,
         57,
         75,
         41,
         46,
         93,
         122,
         27,
         85,
         100,
         15,
         58,
         93,
         33,
         103,
         84,
         98,
         31,
         64
      };
   }

   private static byte[] nuhaniuxevckiyy() {
      return new byte[]{-34, -7, 93, 96, 26, 66, 103, 2, 58, 87};
   }

   private static byte[] tduqtxktfrgdxrl() {
      return new byte[]{-45, -6, 93, 96, 28, 68};
   }

   private static byte[] itwxwsgqwqbtydi() {
      return new byte[]{
         -44,
         -1,
         87,
         93,
         22,
         71,
         96,
         7,
         60,
         75,
         47,
         36,
         87,
         78,
         23,
         72,
         110,
         6,
         61,
         79,
         43,
         107,
         93,
         113,
         25,
         64,
         101,
         2,
         56,
         77,
         43,
         46,
         92,
         109,
         23,
         71,
         100,
         2,
         60,
         86,
         33,
         122,
         82,
         108,
         28,
         81,
         97,
         69,
         60,
         91,
         32,
         96,
         92,
         122,
         29,
         0,
         101,
         11,
         54,
         93,
         46,
         47,
         87,
         69,
         24,
         77,
         101,
         1,
         55,
         89,
         32,
         103,
         86,
         127,
         28,
         69,
         111,
         8,
         57,
         70,
         43,
         37,
         83,
         121,
         28,
         92,
         110,
         15,
         55,
         95,
         42,
         105,
         87,
         101,
         22,
         74
      };
   }

   private static byte[] iybxsjibcdxeuhs() {
      return new byte[]{
         -41,
         -4,
         84,
         65,
         22,
         64,
         97,
         6,
         60,
         87,
         41,
         109,
         84,
         45,
         22,
         91,
         97,
         8,
         60,
         83,
         41,
         102,
         84,
         105,
         22,
         15,
         97,
         14,
         60,
         75,
         41,
         119,
         84,
         45,
         54,
         59,
         97,
         65,
         60,
         115,
         41,
         106,
         84,
         110,
         22,
         93,
         97,
         14,
         60,
         77,
         41,
         108,
         84,
         107,
         22,
         91,
         97,
         65,
         60,
         95,
         41,
         118,
         84,
         121,
         22,
         71,
         97,
         65,
         60,
         90,
         41,
         106,
         84,
         105,
         22,
         15,
         97,
         15,
         60,
         81,
         41,
         119,
         84,
         45,
         22,
         73,
         97,
         8,
         60,
         80,
         41,
         106,
         84,
         126,
         22,
         71,
         97,
         65,
         60,
         87,
         41,
         109,
         84,
         45,
         22,
         91,
         97,
         8,
         60,
         83,
         41,
         102
      };
   }

   private static byte[] jlhugphqazsmogw() {
      return new byte[]{-46, -3, 83, 105, 24, 75, 100, 6, 55, 82, 45, 100, 84, 45, 27, 93, 111, 12, 59, 80, 47, 127};
   }

   private static byte[] penypdnsppphkrr() {
      return new byte[]{
         -41,
         -4,
         93,
         103,
         30,
         70,
         98,
         10,
         63,
         87,
         41,
         112,
         93,
         41,
         30,
         66,
         98,
         1,
         63,
         19,
         41,
         123,
         93,
         107,
         30,
         76,
         98,
         23,
         63,
         19,
         41,
         115,
         93,
         123,
         30,
         76,
         98,
         9,
         63,
         90,
         41,
         111,
         93,
         108
      };
   }

   private static byte[] rbhdrtddoclwxxi() {
      return new byte[]{
         -44,
         -6,
         93,
         99,
         27,
         75,
         111,
         68,
         60,
         85,
         42,
         103,
         83,
         96,
         28,
         75,
         100,
         6,
         61,
         74,
         33,
         97,
         80,
         111,
         22,
         81,
         101,
         68,
         61,
         67,
         47,
         113,
         87,
         108,
         29,
         66,
         100,
         13,
         54,
         81,
         44,
         97
      };
   }

   private static byte[] tbsydwdywebmqsg() {
      return new byte[]{-41, -4, 92, 96, 27, 79, 99, 4, 63, 87, 41, 109, 92, 44, 27, 84, 99, 10, 63, 83, 41, 102, 92, 104, 27, 0, 99, 12, 63, 75, 41, 119};
   }

   private static byte[] yhxhksrblwsocuc() {
      return new byte[0];
   }

   private static byte[] ruakcsirhfqqmib() {
      return new byte[]{
         -44,
         -3,
         81,
         124,
         26,
         71,
         96,
         5,
         62,
         74,
         45,
         103,
         80,
         124,
         26,
         73,
         99,
         71,
         61,
         75,
         45,
         108,
         81,
         100,
         25,
         71,
         103,
         10,
         58,
         31,
         44,
         107,
         81,
         127,
         26,
         6,
         100,
         6,
         58,
         70,
         45,
         114,
         82,
         102,
         30,
         87,
         99,
         6,
         59,
         91
      };
   }

   private static byte[] ldlrpjjytwzzxid() {
      return new byte[]{
         -45,
         -3,
         85,
         107,
         24,
         95,
         97,
         30,
         57,
         86,
         45,
         116,
         80,
         104,
         31,
         68,
         110,
         64,
         58,
         80,
         41,
         113,
         83,
         42,
         24,
         70,
         96,
         13,
         58,
         77,
         44,
         97,
         84,
         97,
         23,
         72,
         99,
         7
      };
   }

   private static byte[] cepnsvxlclhszzp() {
      return new byte[]{-41, -3, 80, 127, 28, 31};
   }

   private static byte[] gcojmzigvmwzpvh() {
      return new byte[]{-41, -1, 84, 105, 27, 25};
   }

   private static byte[] jirwmaeysmbpxfe() {
      return new byte[]{-44, -8, 93, 124, 31, 72, 98, 20};
   }

   private static byte[] tdzqtkalxwzkfyk() {
      return new byte[]{-41, -2, 83, 117, 30, 70, 102, 0};
   }

   private static byte[] selkjlhuvhubyhc() {
      return new byte[0];
   }

   private static byte[] wvlargbzrlmbdku() {
      return new byte[]{-45, -5, 82, 76, 25, 71, 110, 23, 58, 79, 43, 109, 86, 109, 22, 86, 100, 32, 58, 85, 46, 100, 82, 106, 23, 72, 99, 16};
   }

   private static byte[] twstdrwojslxejc() {
      return new byte[]{-45, -5, 82, 112, 25, 91, 110, 13};
   }

   private static byte[] ovskwmseswkyhqc() {
      return new byte[0];
   }

   private static byte[] yrdtwlqxbacdhwa() {
      return new byte[0];
   }

   private static byte[] rhchnakzwgrvdip() {
      return new byte[]{-43, -4, 86, 81, 25, 107, 111, 16, 60, 76};
   }

   private static byte[] uvwwvtybyauopmt() {
      return new byte[]{
         -41,
         -15,
         83,
         117,
         26,
         93,
         98,
         20,
         63,
         75,
         41,
         32,
         83,
         108,
         26,
         91,
         98,
         20,
         63,
         80,
         41,
         32,
         83,
         117,
         26,
         76,
         98,
         15,
         63,
         64,
         41,
         98,
         83,
         100,
         26,
         88,
         98,
         5,
         63,
         22,
         41,
         109,
         83,
         98,
         26,
         67
      };
   }

   private static byte[] uwkrcppojgvllai() {
      return new byte[]{-46, -7, 84, 85, 25, 103, 111, 28, 59, 76};
   }

   private static byte[] xyqlvrkhglkubsn() {
      return new byte[]{
         -33,
         -15,
         87,
         94,
         31,
         72,
         97,
         13,
         61,
         64,
         33,
         36,
         84,
         99,
         24,
         83,
         100,
         68,
         54,
         82,
         43,
         39,
         84,
         110,
         24,
         77,
         100,
         6,
         54,
         85,
         40,
         99,
         83,
         45,
         29,
         125,
         111,
         13,
         60,
         85,
         40,
         120,
         83,
         40,
         29,
         79,
         111,
         6,
         63,
         89,
         47,
         111,
         86,
         125,
         22,
         64,
         101,
         18,
         63,
         29,
         47,
         100,
         86,
         109,
         22,
         64,
         102,
         70,
         56,
         94,
         42,
         100,
         93,
         109,
         28,
         73,
         102,
         14,
         56,
         76,
         42,
         46,
         93,
         107,
         31,
         66,
         97,
         65,
         61,
         77,
         33,
         125,
         87,
         111,
         31,
         68
      };
   }

   private static byte[] brjakdhjbmjngwj() {
      return new byte[]{
         -41,
         -7,
         82,
         90,
         27,
         76,
         103,
         7,
         58,
         76,
         41,
         38,
         82,
         67,
         27,
         77,
         103,
         13,
         58,
         77,
         41,
         105,
         82,
         125,
         27,
         75,
         103,
         8,
         58,
         75,
         41,
         38,
         82,
         111,
         27,
         71,
         103,
         13,
         58,
         80,
         41,
         115,
         82,
         96,
         27,
         80,
         103,
         78,
         58,
         81,
         41,
         99,
         82,
         107,
         27,
         64,
         103,
         29,
         58,
         31,
         41,
         103,
         82,
         96,
         27,
         4,
         103,
         54,
         58,
         93,
         41,
         105,
         82,
         118,
         27,
         4,
         103,
         30,
         58,
         77,
         41,
         105,
         82,
         104,
         27,
         77,
         103,
         2,
         58,
         90
      };
   }

   private static byte[] fblvgdyqvntuytn() {
      return new byte[]{-44, -3, 81, 108, 23, 83, 98, 28, 58, 87, 45, 112};
   }

   private static byte[] mtbjcpabuofmdsi() {
      return new byte[]{
         -45, -1, 84, 108, 27, 92, 99, 23, 54, 80, 47, 117, 87, 81, 22, 70, 101, 10, 58, 78, 40, 103, 80, 113, 26, 77, 111, 19, 56, 78, 43, 106, 93, 96, 28, 64
      };
   }

   private static byte[] efznzwryzdauaqa() {
      return new byte[]{-41, -15, 83, 103, 28, 72, 96, 7, 55, 84, 41, 96, 83, 37, 28, 75, 96, 9, 55, 75, 41, 107, 83, 37, 28, 68, 96, 15, 55, 80};
   }

   private static byte[] tfwrjqrqbthpbvh() {
      return new byte[]{-41, -2, 85, 109, 28, 93, 111, 29, 60, 83, 41, 115};
   }

   private static byte[] ctpvuqbvnzlibzy() {
      return new byte[0];
   }

   private static byte[] oerstajuwdyuiny() {
      return new byte[]{
         -41,
         -6,
         81,
         105,
         23,
         80,
         110,
         29,
         54,
         84,
         42,
         112,
         82,
         93,
         26,
         75,
         111,
         10,
         62,
         75,
         45,
         98,
         92,
         125,
         23,
         71,
         111,
         23,
         61,
         75,
         46,
         102,
         81,
         109,
         22,
         64
      };
   }

   private static byte[] egctfvwdfpmwsxh() {
      return new byte[]{-48, -1, 80, 106, 22, 87, 98, 28, 62, 83, 47, 113};
   }

   private static byte[] nuhfdcawalhrgir() {
      return new byte[]{
         -43,
         -2,
         85,
         90,
         22,
         72,
         97,
         9,
         57,
         74,
         46,
         38,
         80,
         113,
         24,
         69,
         96,
         6,
         60,
         78,
         41,
         102,
         93,
         126,
         24,
         73,
         96,
         69,
         57,
         79,
         44,
         97,
         83,
         102,
         25,
         68,
         101,
         14,
         62,
         30,
         33,
         105,
         83,
         127,
         25,
         4,
         96,
         2,
         59,
         75,
         47,
         112,
         82,
         101,
         28,
         83,
         103,
         7,
         54,
         89,
         47,
         33,
         82,
         102,
         25,
         84,
         98,
         79,
         56,
         84,
         46,
         111,
         87,
         122,
         30,
         66,
         111,
         13,
         56,
         85,
         46,
         96
      };
   }

   private static byte[] hpmcfhfdepgmmgy() {
      return new byte[]{
         -34,
         -3,
         81,
         67,
         23,
         71,
         101,
         4,
         61,
         64,
         45,
         109,
         80,
         113,
         22,
         75,
         103,
         2,
         55,
         75,
         45,
         35,
         92,
         111,
         28,
         73,
         100,
         9,
         58,
         86,
         44,
         97,
         93,
         41,
         30,
         67,
         110,
         2,
         58,
         87,
         32,
         98,
         87,
         110,
         29,
         75
      };
   }

   private static byte[] ecqxzxwgbtyykqe() {
      return new byte[]{-41, -8, 82, 101, 30, 75, 103, 23, 55, 88, 41, 107, 82, 101, 30, 65, 103, 62, 55, 94, 41, 117, 82, 109, 30, 75, 103, 21};
   }

   private static byte[] pzrrrolqfixwmcs() {
      return new byte[]{
         -45,
         -3,
         82,
         103,
         26,
         86,
         101,
         17,
         54,
         80,
         45,
         115,
         92,
         80,
         28,
         64,
         99,
         10,
         58,
         76,
         46,
         108,
         81,
         123,
         28,
         75,
         111,
         19,
         58,
         72,
         32,
         107,
         87,
         102,
         26,
         64
      };
   }

   private static byte[] qbdkezyuyisqhxg() {
      return new byte[]{-43, -15, 86, 109, 29, 86, 98, 19, 60, 86, 33, 119};
   }

   private static byte[] jqszqncrmoiyenr() {
      return new byte[]{-47, -6, 86, 87, 30, 101, 101, 19, 56, 79};
   }

   private static byte[] dmrzwlktlhitidd() {
      return new byte[]{
         -41,
         -5,
         92,
         86,
         22,
         71,
         98,
         6,
         57,
         65,
         41,
         36,
         92,
         112,
         22,
         74,
         98,
         9,
         57,
         64,
         41,
         97,
         92,
         113,
         22,
         71,
         98,
         79,
         57,
         70,
         41,
         107,
         92,
         105,
         22,
         74,
         98,
         1,
         57,
         18,
         41,
         109,
         92,
         113,
         22,
         15,
         98,
         10,
         57,
         74,
         41,
         116,
         92,
         107,
         22,
         93,
         98,
         10,
         57,
         86,
         41,
         36,
         92,
         109,
         22,
         93,
         98,
         79,
         57,
         91,
         41,
         106,
         92,
         116,
         22,
         78,
         98,
         3,
         57,
         91,
         41,
         96
      };
   }

   private static byte[] otezrecmefgyxgt() {
      return new byte[]{-41, -2, 87, 101, 30, 65, 101, 29, 54, 65, 41, 96, 87, 111, 30, 65};
   }

   private static byte[] gauhguuzcmaiysh() {
      return new byte[]{
         -41,
         -15,
         82,
         107,
         22,
         86,
         110,
         29,
         61,
         93,
         41,
         124,
         82,
         81,
         22,
         64,
         110,
         10,
         61,
         65,
         41,
         109,
         82,
         124,
         22,
         77,
         110,
         31,
         61,
         70,
         41,
         103,
         82,
         97,
         22,
         74
      };
   }

   private static byte[] sbxhdtglixbyptm() {
      return new byte[]{-41, -8, 83, 101, 29, 68, 100, 21, 56, 65, 41, 102, 83, 111, 29, 68};
   }

   private static byte[] nbovwmhizskzffh() {
      return new byte[]{-46, -2, 86, 82, 31, 99, 111, 16, 54, 76};
   }

   private static byte[] gpowneqmogwsibn() {
      return new byte[]{
         -48, -3, 81, 102, 31, 86, 99, 16, 57, 80, 45, 124, 84, 86, 26, 71, 96, 6, 58, 64, 40, 103, 81, 124, 25, 75, 99, 31, 63, 77, 45, 106, 82, 96, 26, 64
      };
   }

   private static byte[] nyqtntspnelltod() {
      return new byte[]{-47, -5, 80, 106, 23, 85, 102, 29, 54, 82, 43, 113};
   }

   private static byte[] mascnddkkvbajvv() {
      return new byte[]{-45, -6, 85, 78, 24, 67, 98, 6, 58, 24, 41, 83, 83, 106, 27, 82, 99, 17, 62, 89, 47, 113, 80, 122};
   }

   private static byte[] ooxcddfirzclzlb() {
      return new byte[]{-48, -6, 83, 105, 30, 92, 100, 22, 60, 83, 42, 114};
   }

   private static byte[] ayizabqttwupwwu() {
      return new byte[]{-48, -6, 83, 101, 30, 64, 100, 18, 60, 93, 42, 108, 82, 98, 22, 65, 100, 58, 57, 95, 47, 115, 85, 98, 29, 75, 101, 20};
   }

   private static byte[] uisldfoytmqldsl() {
      return new byte[]{
         -41, -4, 84, 111, 25, 85, 100, 21, 56, 87, 41, 113, 84, 85, 25, 67, 100, 2, 56, 75, 41, 96, 84, 120, 25, 78, 100, 23, 56, 76, 41, 106, 84, 101, 25, 73
      };
   }

   private static byte[] tagbjafytesdbvv() {
      return new byte[]{-43, -15, 81, 96, 31, 66, 98, 22, 54, 74, 33, 99, 83, 109, 31, 70};
   }

   private static byte[] cnzduybwwvasafj() {
      return new byte[]{
         -41, -2, 84, 96, 27, 78, 110, 9, 57, 95, 47, 96, 84, 112, 30, 64, 102, 7, 59, 78, 32, 117, 82, 111, 24, 81, 102, 24, 62, 85, 40, 99, 80, 111, 23, 85
      };
   }

   private static byte[] fsbtdivdjuelyho() {
      return new byte[]{
         -41,
         -15,
         86,
         86,
         25,
         64,
         103,
         11,
         55,
         71,
         41,
         46,
         86,
         111,
         25,
         87,
         103,
         16,
         55,
         87,
         41,
         97,
         86,
         124,
         25,
         75,
         103,
         30,
         55,
         94,
         41,
         122,
         86,
         103,
         25,
         77,
         103,
         10
      };
   }

   private static byte[] tepgrvydwivgzwf() {
      return new byte[]{-46, -16, 86, 119, 23, 87, 110, 18, 63, 77};
   }

   private static byte[] uwoukaszvuxvtnq() {
      return new byte[]{-41, -2, 82, 102, 30, 78, 97, 0, 57, 73, 41, 110, 82, 120, 30, 72, 97, 5, 57, 79, 41, 110, 82, 101, 30, 75, 97, 10, 57, 85, 41, 100};
   }

   private static byte[] zinydvnjhlmqloi() {
      return new byte[]{-45, -6, 92, 98, 28, 77, 110, 1, 62, 86, 42, 97, 80, 39, 26, 67, 102, 14, 58, 78, 32, 102};
   }

   private static byte[] qyumsgcahmimnot() {
      return new byte[]{-44, -5, 85, 69, 25, 74, 98, 15, 61, 93, 43, 101, 86, 126, 27, 66, 97, 2, 61, 77, 41, 37, 82, 98, 27, 79, 100, 3, 60, 82, 42, 111};
   }

   private static byte[] ypmxizmlvsetavo() {
      return new byte[]{
         -41,
         -1,
         85,
         124,
         26,
         92,
         98,
         10,
         62,
         65,
         41,
         46,
         85,
         104,
         26,
         90,
         98,
         27,
         62,
         91,
         41,
         46,
         85,
         113,
         26,
         77,
         98,
         0,
         62,
         75,
         41,
         108,
         85,
         96,
         26,
         89,
         98,
         10
      };
   }

   private static byte[] okwczbkmmeyzkzd() {
      return new byte[]{-41, -6, 85, 82, 23, 68, 110, 15, 57, 64, 41, 37, 85, 102, 23, 73, 110, 7, 57, 81, 41, 107};
   }

   private static byte[] pbbocwcetiyfruo() {
      return new byte[]{-34, -15, 82, 68, 24, 76, 102, 7, 61, 64, 33, 110, 87, 126, 29, 72, 100, 2, 55, 71, 46, 36, 83, 124, 31, 74, 100, 5, 54, 89, 43, 110};
   }

   private static byte[] ucmjdtycyhradmh() {
      return new byte[]{-44, -8, 92, 78, 28, 77, 97, 10, 63, 73, 42, 98, 92, 99, 28, 86, 97, 73, 63, 105, 42, 126, 92, 125, 28, 71};
   }

   private static byte[] odrlmvydwfsrmhb() {
      return new byte[]{
         -44,
         -8,
         92,
         108,
         28,
         82,
         97,
         20,
         63,
         81,
         42,
         110,
         92,
         110,
         28,
         67,
         97,
         16,
         63,
         84,
         42,
         104,
         92,
         99,
         28,
         13,
         97,
         28,
         63,
         16,
         42,
         112,
         92,
         122,
         28,
         85,
         97,
         73,
         63,
         91,
         42,
         104,
         92,
         127,
         28,
         79,
         97,
         73,
         63,
         72,
         42,
         117,
         92,
         97,
         28,
         71,
         97,
         10,
         63,
         94,
         42,
         104,
         92,
         105,
         28,
         71,
         97,
         0
      };
   }

   private static byte[] cjiyrpwxlcfvsqp() {
      return new byte[]{-44, -8, 92, 76, 28, 65, 97, 7, 63, 88, 42, 119, 92, 121};
   }

   private static byte[] nlszourzfkjikxz() {
      return new byte[]{
         -44, -8, 92, 108, 28, 82, 97, 20, 63, 81, 42, 110, 92, 110, 28, 67, 97, 16, 63, 84, 42, 104, 92, 99, 28, 13, 97, 14, 63, 78, 42, 104, 92, 99
      };
   }

   private static byte[] efrflegowintkdw() {
      return new byte[]{-44, -8, 92, 88, 28, 81, 97, 1, 63, 79, 42, 42, 92, 76, 28, 69, 97, 1, 63, 83, 42, 115};
   }

   private static byte[] ibvejxwtqaiamgd() {
      return new byte[]{
         -44,
         -8,
         92,
         64,
         28,
         77,
         97,
         30,
         63,
         84,
         42,
         107,
         92,
         97,
         28,
         67,
         97,
         75,
         63,
         8,
         42,
         41,
         92,
         61,
         28,
         2,
         97,
         76,
         63,
         106,
         42,
         110,
         92,
         99,
         28,
         70,
         97,
         11,
         63,
         74,
         42,
         116,
         92,
         45,
         28,
         108,
         97,
         48,
         63,
         29,
         42,
         54,
         92,
         61,
         28,
         12,
         97,
         84,
         63,
         6,
         42,
         39,
         92,
         90,
         28,
         75,
         97,
         10,
         63,
         11,
         42,
         51,
         92,
         54,
         28,
         2,
         97,
         28,
         63,
         11,
         42,
         51,
         92,
         36,
         28,
         2,
         97,
         60,
         63,
         95,
         42,
         104,
         92,
         117,
         28,
         112,
         97,
         1,
         63,
         77,
         42,
         107,
         92,
         108,
         28,
         91,
         97,
         75,
         63,
         112,
         42,
         110,
         92,
         99,
         28,
         71,
         97,
         7,
         63,
         79,
         42,
         102,
         92,
         107,
         28,
         86,
         97,
         40,
         63,
         92,
         42,
         114,
         92,
         99,
         28,
         65,
         97,
         12,
         63,
         88,
         42,
         117
      };
   }

   private static byte[] vbnwspuftdluvxp() {
      return new byte[]{-45, -7, 83, 64, 26, 78, 102, 0, 54, 75, 41, 101, 93, 97, 25, 83, 110, 66, 58, 111, 47, 119, 81, 124, 31, 74};
   }

   private static byte[] dcmmnjdzdqsbcnz() {
      return new byte[]{
         -45, -7, 83, 98, 26, 81, 102, 30, 54, 83, 41, 105, 93, 108, 25, 70, 110, 27, 58, 82, 47, 97, 81, 98, 31, 0, 111, 9, 62, 78, 33, 109, 82, 100
      };
   }

   private static byte[] vwzruryeywnziye() {
      return new byte[]{-45, -7, 83, 66, 26, 66, 102, 13, 54, 90, 41, 112, 93, 123};
   }

   private static byte[] kanecswupvjjnav() {
      return new byte[]{
         -45, -7, 83, 98, 26, 81, 102, 30, 54, 83, 41, 105, 93, 108, 25, 70, 110, 27, 58, 82, 47, 97, 81, 98, 31, 0, 111, 9, 62, 78, 33, 109, 82, 100
      };
   }

   private static byte[] rhirvchiedjmayn() {
      return new byte[]{-45, -7, 83, 86, 26, 82, 102, 11, 54, 77, 41, 45, 93, 78, 25, 64, 110, 10, 58, 85, 47, 122};
   }

   private static byte[] uxvepjhkpzutwhg() {
      return new byte[]{
         -45,
         -7,
         83,
         78,
         26,
         78,
         102,
         20,
         54,
         86,
         41,
         108,
         93,
         99,
         25,
         70,
         110,
         64,
         58,
         14,
         47,
         32,
         81,
         60,
         31,
         15,
         111,
         75,
         62,
         106,
         33,
         107,
         82,
         100,
         23,
         74,
         99,
         8,
         56,
         68,
         45,
         114,
         84,
         34,
         22,
         108,
         103,
         53,
         54,
         31,
         46,
         54,
         92,
         51,
         26,
         8,
         97,
         95,
         58,
         7,
         40,
         47,
         93,
         88,
         30,
         73,
         111,
         13,
         57,
         12,
         32,
         58,
         81,
         48,
         24,
         14,
         99,
         24,
         63,
         4,
         33,
         54,
         85,
         36,
         22,
         2,
         96,
         62,
         55,
         81,
         45,
         105,
         83,
         123,
         26,
         115,
         102,
         11,
         54,
         79,
         41,
         108,
         93,
         110,
         25,
         94,
         110,
         64,
         58,
         118,
         47,
         103,
         81,
         98,
         31,
         74,
         111,
         0,
         62,
         79,
         33,
         99,
         82,
         108,
         23,
         90,
         99,
         43,
         56,
         82,
         45,
         116,
         84,
         108,
         22,
         65,
         103,
         9,
         54,
         90,
         46,
         117
      };
   }

   private static byte[] hzerxpjzlmilhmo() {
      return new byte[]{
         -41,
         -1,
         83,
         118,
         23,
         11,
         100,
         31,
         60,
         94,
         41,
         108,
         83,
         35,
         23,
         69,
         100,
         8,
         60,
         82,
         41,
         116,
         83,
         124,
         23,
         71,
         100,
         4,
         60,
         72,
         41,
         45,
         83,
         120,
         23,
         67,
         100,
         21,
         60,
         79,
         41,
         105,
         83,
         97,
         23,
         72
      };
   }

   private static byte[] goxdhpyqydenfvn() {
      return new byte[]{-41, -1, 83, 63};
   }

   private static byte[] ndfxgvyhrqihxgu() {
      return new byte[]{
         -48,
         -4,
         83,
         88,
         22,
         78,
         110,
         6,
         56,
         68,
         44,
         112,
         83,
         102,
         24,
         76,
         99,
         21,
         57,
         91,
         47,
         100,
         93,
         45,
         23,
         78,
         97,
         15,
         59,
         90,
         47,
         103,
         83,
         108,
         26,
         0,
         96,
         16,
         56,
         88,
         33,
         115,
         92,
         127,
         24,
         78,
         98,
         15,
         56,
         64,
         47,
         106
      };
   }

   private static byte[] fnqmfqxsvmrtdpe() {
      return new byte[0];
   }

   private static byte[] ebjsenmwqkfrbun() {
      return new byte[]{
         -41,
         -6,
         84,
         89,
         22,
         86,
         103,
         14,
         59,
         90,
         41,
         108,
         84,
         101,
         22,
         65,
         103,
         65,
         59,
         105,
         41,
         80,
         84,
         64,
         22,
         96,
         103,
         65,
         59,
         85,
         41,
         118,
         84,
         41,
         22,
         77,
         103,
         15,
         59,
         74,
         41,
         100,
         84,
         101,
         22,
         77,
         103,
         5
      };
   }

   private static byte[] hlaqsbzqssnmwgo() {
      return new byte[]{
         -45,
         -15,
         87,
         93,
         28,
         84,
         98,
         10,
         57,
         89,
         33,
         109,
         83,
         101,
         30,
         70,
         101,
         64,
         58,
         90,
         43,
         115,
         87,
         43,
         27,
         73,
         96,
         10,
         54,
         74,
         47,
         119,
         85,
         103,
         28,
         79,
         99,
         8,
         60,
         29,
         43,
         103,
         80,
         41,
         25,
         119,
         111,
         48,
         56,
         112,
         41,
         71
      };
   }

   private static int rgyicgztqqjffgzg(int var0, int var1) {
      return var0 ^ var1;
   }
}
