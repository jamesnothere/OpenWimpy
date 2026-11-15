package com.wimpyclient.u;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Locale;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class g {
   private static final Gson GSON;
   private static final Path DIR;
   private static final Path META;
   private static int fKdPG2JUJ3;
   private transient int gdSCVk3vpv;
   private static byte[] ktqbyapyml = jlryffjqmihaybk();

   private g() {
super();
      int var4 = 1266982328 ^ 2020657168;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 78206465:
               var4 = 915636326 ^ var4;
            case 777577553:
               var4 = 320687147 ^ 571011289 ^ Integer.parseInt("879913276");
               this.gdSCVk3vpv = 1942091554 ^ fKdPG2JUJ3;
               var4 = nkjyacukqhyngvew(var4, 1969917957);
               return;
            case 515103663:
               break;
            case 1680294287:
            default:
               throw new IllegalStateException();
         }
      }
   }

   public static Path dir() {
      int var3 = 399581940 ^ 885483974 ^ 1544444495;
      var3 = 746670000 ^ var3;
      return DIR;
   }

   public static Path saveCopy(Path var0) throws IOException {
      int var51;
      label77: {
         var51 = 226103814 ^ 249471507 ^ 1544444495;
         var51 = 401115490 ^ var51;
         String var6;
         if (var0 != null) {
            var51 = 1425008453 ^ var51;
            byte var2 = (byte)(481133693 ^ var51);
            LinkOption[] var33 = new LinkOption[var2];
            byte var10 = (byte)((Files.isRegularFile(var0, var33)) ? 1 : 0);
            if (var10 == (481133693 ^ var51)) {
               var51 = 429262960 ^ var51;
               break label77;
            }

            var51 = nkjyacukqhyngvew(var51, 1052772995);
            Path var11 = DIR;
            byte var34 = (byte)(577605374 ^ var51);
            FileAttribute[] var35 = new FileAttribute[var34];
            Path var12 = Files.createDirectories(var11, var35);
            Path var14 = var0.getFileName();
            String var15 = var14.toString();
            var6 = var15;
            Locale var36 = Locale.ROOT;
            String var17 = var15.toLowerCase(var36);
            String var37 = utzushmjeb(gnaryqlokxdupoj(), var51);
            byte var19 = (byte)((var17.endsWith(var37)) ? 1 : 0);
            if (var19 == (577605374 ^ var51)) {
               var51 = 2137566984 ^ var51;
               String var38 = utzushmjeb(gvfxzveswzyqxac(), var51);
               byte var21 = (byte)((var17.endsWith(var38)) ? 1 : 0);
               if (var21 != (1560617462 ^ var51)) {
                  var51 = nkjyacukqhyngvew(var51, 2060106938);
               } else {
                  var51 = 379640897 ^ var51;
                  String var39 = utzushmjeb(nadzfhibarurjns(), var51);
                  byte var23 = (byte)((var17.endsWith(var39)) ? 1 : 0);
                  if (var23 == (1269169591 ^ var51)) {
                     var51 = 1889280921 ^ var51;
                     String var25 = var15 + ".schem";
                     var6 = var25;
                     var51 = 485901154 ^ var51;
                  } else {
                     label34:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var51)) {
                           case 43110455:
                              var51 ^= 1818910971;
                              break label34;
                           case 575903807:
                              break;
                           case 700154512:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1393654400:
                              break label34;
                        }
                     }
                  }
               }
            } else {
               label48:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var51)) {
                     case 45377377:
                        var51 ^= 94507954;
                     case 112473135:
                        break label48;
                     case 430690920:
                        break;
                     case 2017602314:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var51)) {
                  case 13059260:
                  default:
                     throw new RuntimeException(new IOException());
                  case 201386110:
                     var51 ^= 1299836725;
                     break label77;
                  case 476511676:
                     break;
                  case 755934395:
                     break label77;
               }
            }
         }

         Path var26 = DIR;
         String var41 = sanitize(var6);
         Path var27 = var26.resolve(var41);
         byte var3 = (byte)(667917645 ^ var51);
         CopyOption[] var46 = new CopyOption[var3];
         byte var4 = (byte)(667917644 ^ var51);
         StandardCopyOption var5 = StandardCopyOption.REPLACE_EXISTING;
         var46[var4] = var5;
         Path var29 = Files.copy(var0, var27, var46);
         Path var44 = var0.toAbsolutePath();
         String var45 = var44.toString();
         writeMeta(var27, var45);
         return var27;
      }

      String var47 = utzushmjeb(lupksevxmpllbao(), var51);
      IOException var32 = new IOException(var47);
      throw new RuntimeException(var32);
   }

   public static Path lastSaved() {
      int var54 = 88174040 ^ (2977873 ^ 1544444495);
      var54 = 2112889049 ^ var54;
      Path var6 = null;

      try {
         Path var0 = META;
         byte var1 = (byte)(613574431 ^ var54);
         LinkOption[] var39 = new LinkOption[var1];
         boolean var7 = Files.isRegularFile(var0, var39);
         if (var7 == ((613574431 ^ var54) != 0)) {
            var54 = 2088387245 ^ var54;
            return null;
         }

         var54 = nkjyacukqhyngvew(var54, 1788088730);
         try (BufferedReader var3 = Files.newBufferedReader(META)) {
            var54 = 578103392 ^ var54;
            JsonObject var4 = (JsonObject)GSON.fromJson(var3, JsonObject.class);
            if (var4 == null) {
               var54 = 181267423 ^ var54;
               var54 = 1082963218 ^ var54;
               var6 = null;
            } else {
               var54 = 822006522 ^ var54;
               String var41 = utzushmjeb(xauqmuharborpte(), var54);
               boolean var15 = var4.has(var41);
               if (var15 == ((1552780319 ^ var54) != 0)) {
                  var54 = 976435493 ^ var54;
                  var54 = 1082963218 ^ var54;
                  var6 = null;
               } else {
                  var54 = 1835858990 ^ var54;
                  String var42 = utzushmjeb(pcfmnwhxhwrdals(), var54);
                  String var18 = var4.get(var42).getAsString();
                  String[] var44 = new String[(byte)(836857905 ^ var54)];
                  Path var5 = Path.of(var18, var44);
                  var54 = 1953656760 ^ var54;
                  LinkOption[] var46 = new LinkOption[(byte)(836857905 ^ var54)];
                  boolean var21 = Files.isRegularFile(var5, var46);
                  if (var21 == ((836857905 ^ var54) != 0)) {
                     var54 = nkjyacukqhyngvew(var54, 141008373);
                     var54 = 1158001721 ^ var54;
                     var6 = null;
                  } else {
                     var54 = 957367924 ^ var54;
                     var6 = var5;
                  }
               }
            }
         }

         var54 = 543459014 ^ var54;
         var54 = 1258507784 ^ var54;
         var54 = 1502254854 ^ var54;
      } catch (Throwable var25) {
         var6 = null;
      }

      return var6;
   }

   public static void clear() {
      int var6 = 421775001 ^ 751011964 ^ 1544444495;
      var6 = 318960047 ^ var6;

      try {
         Path var0 = META;
         boolean var2 = Files.deleteIfExists(var0);
         var6 ^= 543069768;
      } catch (IOException var7) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var6)) {
            case -681105365:
               var6 = nkjyacukqhyngvew(var6, 709373445);
               var6 = 19606821 ^ var6;
               return;
            default:
               throw new RuntimeException(new IllegalAccessException("Error in hash"));
         }
      }

      var6 = nkjyacukqhyngvew(var6, 188585320);
   }

   private static void writeMeta(Path var0, String var1) throws IOException {
      int var39 = 2005140543 ^ 429151658 ^ 1544444495;
      var39 = 2091779543 ^ var39;
      JsonObject var2 = new JsonObject();
      JsonObject var4 = var2;
      String var22 = utzushmjeb(avqqiludlfqnhhl(), var39);
      Path var29 = var0.toAbsolutePath();
      String var30 = var29.toString();
      var2.addProperty(var22, var30);
      String var23 = utzushmjeb(aodmcalsrnybevb(), var39);
      String var36;
      if (var1 == null) {
         var39 = 1840555002 ^ var39;
         var36 = utzushmjeb(wpfczdwrfbswimi(), var39);
         var39 = 1991067383 ^ var39;
      } else {
         label79:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
               case 141907337:
                  var39 ^= 1238626123;
               case 873538778:
                  break label79;
               case 1612388638:
               default:
                  throw new IllegalStateException();
               case 1960116767:
            }
         }

         var36 = var1;
         var39 = 1388972614 ^ var39;
      }

      var2.addProperty(var23, var36);
      String var24 = utzushmjeb(qezehcnjavgtjaz(), var39);
      Path var33 = var0.getFileName();
      String var34 = var33.toString();
      var2.addProperty(var24, var34);
      Path var11 = META;
      byte var25 = (byte)(1437199104 ^ var39);
      OpenOption[] var26 = new OpenOption[var25];
      BufferedWriter var12 = Files.newBufferedWriter(var11, var26);
      BufferedWriter var5 = var12;
      var39 = 1196757689 ^ var39;

      try {
         Gson var13 = GSON;
         var13.toJson(var4, var5);
         var39 ^= 1512018894;
      } catch (Throwable var41) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var39)) {
            case -1746416184:
               var39 = nkjyacukqhyngvew(var39, 234269807);
               if (var12 == null) {
                  var39 = 753548886 ^ var39;
                  throw new RuntimeException(var41);
               }

               var39 = 2040250203 ^ var39;

               try {
                  var5.close();
                  var39 ^= 261236715;
               } catch (Throwable var40) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var39)) {
                     case 881808491:
                        var39 = nkjyacukqhyngvew(var39, 1982005628);
                        var41.addSuppressed(var40);
                        var39 = 592609393 ^ var39;
                        throw new RuntimeException(var41);
                     default:
                        throw new RuntimeException("Error in hash");
                  }
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
                     case 91855742:
                        throw new RuntimeException(var41);
                     case 192361718:
                        var39 = 1524868838 ^ var39;
                        throw new RuntimeException(var41);
                     case 1390489087:
                        break;
                     case 1847142995:
                     default:
                        throw new IllegalStateException();
                  }
               }
            default:
               throw new RuntimeException(new IllegalAccessException("Error in hash"));
         }
      }

      if (var12 == null) {
         var39 = nkjyacukqhyngvew(var39, 973214943);
      } else {
         var39 = 1189112585 ^ var39;
         var12.close();

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var39)) {
               case 187030759:
                  var39 = 2095218646 ^ var39;
                  return;
               case 700546580:
                  return;
               case 842947265:
                  break;
               case 1499633934:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   private static String sanitize(String var0) {
      int var11 = 1531698589 ^ 505363476 ^ 1544444495;
      var11 = 400960430 ^ var11;
      String var2 = utzushmjeb(shqkiusfgoayjrx(), var11);
      String var3 = utzushmjeb(nmkmqzhhilkkzmc(), var11);
      String var5 = var0.replaceAll(var2, var3);
      byte var7 = (byte)((var5.isBlank()) ? 1 : 0);
      if (var7 == (247238760 ^ var11)) {
         var11 = nkjyacukqhyngvew(var11, 503228149);
         var11 = 1716465881 ^ var11;
         return var5;
      } else {
         var11 = 1825496567 ^ var11;
         String var8 = utzushmjeb(dbryjdlzautomzk(), var11);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var11)) {
               case 247272470:
                  var11 = 394218459 ^ var11;
                  return var8;
               case 1355130987:
                  break;
               case 1701253957:
               default:
                  throw new RuntimeException();
               case 1761367721:
                  return var8;
            }
         }
      }
   }

   static {
      int var17 = 1398956803 ^ 1875281237 ^ Integer.parseInt("879913276");
      int var14 = new Random(4757543113670503167L).nextInt();
      fKdPG2JUJ3 = 1629858693 ^ var14;
      var17 = 1020516851 ^ var17;
      GsonBuilder var0 = new GsonBuilder();
      GsonBuilder var1 = var0.setPrettyPrinting();
      Gson var2 = var1.create();
      GSON = var2;
      FabricLoader var3 = FabricLoader.getInstance();
      Path var4 = var3.getConfigDir();
      String var9 = utzushmjeb(hpjtnsbrhcdtext(), var17);
      Path var5 = var4.resolve(var9);
      String var10 = utzushmjeb(kgmeiqdtmwkwkhc(), var17);
      Path var6 = var5.resolve(var10);
      DIR = var6;
      Path var7 = DIR;
      String var11 = utzushmjeb(yysmdjuhlpgzjpp(), var17);
      Path var8 = var7.resolve(var11);
      META = var8;
   }

   public static String utzushmjeb(byte[] var0, int var1) {
      String var10 = Integer.toString(var1);
      byte[] var11 = var10.getBytes();
      byte[] var8 = var11;
      byte var12 = 0;
      int var9 = var12;

      while (true) {
         int var17 = var0.length;
         if (var9 >= var17) {
            Charset var5 = StandardCharsets.UTF_16;
            return new String(var0, var5);
         }

         byte var20 = var0[var9];
         int var33 = var8.length;
         int var30 = var9 % var33;
         byte var27 = var8[var30];
         int var21 = var20 ^ var27;
         byte var22 = (byte)var21;
         var0[var9] = var22;
         byte var23 = var0[var9];
         byte[] var28 = ktqbyapyml;
         byte[] var34 = ktqbyapyml;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] jlryffjqmihaybk() {
      return new byte[]{
         8,
         22,
         114,
         118,
         47,
         42,
         119,
         28,
         108,
         35,
         23,
         105,
         28,
         31,
         101,
         120,
         6,
         41,
         71,
         33,
         102,
         123,
         34,
         68,
         113,
         107,
         43,
         20,
         103,
         63,
         42,
         15,
         114,
         85,
         5,
         121,
         90,
         27,
         118,
         13,
         73,
         114,
         115,
         40,
         118,
         84,
         52,
         53,
         116,
         85,
         79,
         76,
         32,
         44,
         84,
         72,
         70,
         73,
         62,
         93,
         38,
         45,
         45,
         74,
         86,
         88,
         24,
         101,
         7,
         71,
         28,
         47,
         66,
         121,
         44,
         28,
         91,
         23,
         121,
         10,
         52,
         53,
         12,
         120,
         8,
         93,
         13,
         90,
         39,
         116,
         92,
         4,
         32,
         124,
         1,
         31,
         25,
         50,
         117,
         112,
         124,
         35,
         10,
         32,
         45,
         13,
         100,
         69,
         107,
         26,
         23,
         42,
         72,
         4,
         15,
         78,
         48,
         86,
         13,
         50,
         11,
         38,
         13,
         114,
         31,
         75
      };
   }

   private static byte[] hpjtnsbrhcdtext() {
      return new byte[]{-50, -34, 64, 54, 25, 118, 71, 73, 93, 107, 32, 34, 43, 74, 80, 36, 62, 113, 127, 115, 84, 34, 20, 5};
   }

   private static byte[] kgmeiqdtmwkwkhc() {
      return new byte[]{-50, -34, 64, 50, 25, 124, 71, 76, 93, 126, 32, 54, 43, 72, 80, 60, 62, 113, 127, 117, 84, 63};
   }

   private static byte[] yysmdjuhlpgzjpp() {
      return new byte[]{-50, -34, 64, 45, 25, 126, 71, 87, 93, 111, 32, 117, 43, 67, 80, 59, 62, 119, 127, 120};
   }

   private static byte[] lupksevxmpllbao() {
      return new byte[]{
         -50,
         -34,
         69,
         29,
         23,
         124,
         66,
         67,
         84,
         113,
         32,
         60,
         36,
         75,
         80,
         59,
         62,
         119,
         112,
         122,
         94,
         110,
         23,
         21,
         73,
         53,
         28,
         64,
         95,
         111,
         31,
         24,
         74,
         15,
         50,
         40,
         98,
         93,
         67,
         73,
         113,
         44,
         68,
         126,
         78,
         6
      };
   }

   private static byte[] gnaryqlokxdupoj() {
      return new byte[]{-61, -34, 69, 110, 31, 115, 68, 66, 88, 98, 32, 59, 42, 66, 80, 42, 49, 105, 114, 127, 81, 46};
   }

   private static byte[] gvfxzveswzyqxac() {
      return new byte[]{-57, -36, 68, 104, 25, 104, 64, 75, 90, 121, 38, 57, 42, 66};
   }

   private static byte[] nadzfhibarurjns() {
      return new byte[]{-57, -37, 68, 97, 30, 111, 78, 74, 85, 122, 38, 62, 42, 75, 84, 47, 63, 104, 126, 121, 87, 42};
   }

   private static byte[] xauqmuharborpte() {
      return new byte[]{-57, -36, 71, 55, 24, 115, 71, 89, 93, 127, 38, 56};
   }

   private static byte[] pcfmnwhxhwrdals() {
      return new byte[]{-50, -38, 68, 61, 26, 124, 78, 90, 89, 126, 36, 59};
   }

   private static byte[] avqqiludlfqnhhl() {
      return new byte[]{-57, -38, 64, 53, 30, 125, 71, 93, 84, 119, 38, 62};
   }

   private static byte[] aodmcalsrnybevb() {
      return new byte[]{-57, -38, 64, 41, 30, 110, 71, 66, 84, 117, 38, 51, 46, 65, 84, 47, 54, 114};
   }

   private static byte[] qezehcnjavgtjaz() {
      return new byte[]{-57, -35, 65, 47, 30, 114, 78, 64, 92, 114};
   }

   private static byte[] wpfczdwrfbswimi() {
      return new byte[0];
   }

   private static byte[] shqkiusfgoayjrx() {
      return new byte[]{-60, -35, 69, 31, 28, 78, 64, 118, 92, 62, 35, 100, 46, 6, 93, 112, 48, 59, 117, 41, 81, 119, 17, 0, 70, 0};
   }

   private static byte[] nmkmqzhhilkkzmc() {
      return new byte[]{-60, -35, 69, 27};
   }

   private static byte[] dbryjdlzautomzk() {
      return new byte[]{-57, -33, 71, 52, 25, 124, 79, 69, 88, 117, 38, 50, 41, 79, 83, 57, 62, 113, 115, 113, 87, 99, 23, 6, 71, 61, 19, 77, 83, 105, 27, 84};
   }

   private static int nkjyacukqhyngvew(int var0, int var1) {
      return var1 ^ var0;
   }
}