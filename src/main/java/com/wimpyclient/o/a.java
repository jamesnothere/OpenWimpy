package com.wimpyclient.o;

import com.wimpyclient.i.x;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.IntFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a {
   public static final String DEFAULT = "Default";
   private static final a$a[] FACES;
   private static int f24b3jMJnWb;
   private transient int bygDb1HDhT;
   private static byte[] gomdrtwlao = apxbdohhrexiwic();

   private a() {
super();
      int var4 = 590550216 ^ 805740148;
      
      var4 = 1410602270 ^ var4;
      var4 = 1364919879 ^ 379870860 ^ Integer.parseInt("14600041");
      this.bygDb1HDhT = 255614180 ^ f24b3jMJnWb;
      var4 = 1888833937 ^ var4;
   }

   public static String[] available() {
      int var32 = 401614707 ^ 1596356634 ^ 1875565230;
      var32 = 1640727236 ^ var32;
      ArrayList var0 = new ArrayList();
      ArrayList var1 = var0;
      String var24 = zyhkdcxfgf(jshxcjsaxyhcbji(), var32);
      boolean var7 = var0.add(var24);
      a$a[] var8 = FACES;
      a$a[] var2 = var8;
      int var10 = var8.length;
      int var3 = var10;
      byte var11 = (byte)(1188497155 ^ var32);
      int var4 = var11;
      var32 = 540706996 ^ var32;

      while (var4 < var3) {
         var32 = 505487145 ^ var32;
         a$a var14 = var2[var4];
         String var16 = var14.name;
         List var17 = paths(var16);
         byte var18 = (byte)((var17.isEmpty()) ? 1 : 0);
         if (var18 == (2026672286 ^ var32)) {
            var32 = 1236321120 ^ var32;
            String var28 = var14.name;
            boolean var20 = var1.add(var28);
            var32 = 1998685665 ^ var32;
         } else {
            label20:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
                  case 52309704:
                     break label20;
                  case 168567038:
                     var32 ^= 1049708161;
                     break label20;
                  case 422533933:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1832517189:
               }
            }
         }

         var4 += 1180554782 ^ var32;
         var32 = qjyqlkcechdqddzq(var32, 548428200);
      }

      var32 = qjyqlkcechdqddzq(var32, 269749138);
      IntFunction var29 = var0x -> {
         int var5 = 1010593256 ^ 572174954 ^ 1875565230;
         var5 = 1195506361 ^ var5;
         return new String[var0x];
      };
      Object[] var22 = var1.toArray(var29);
      return (String[])var22;
   }

   public static String selected() {
      int var10 = 1585096933 ^ 1807977169 ^ 1875565230;
      var10 = 873314773 ^ var10;
      x var0 = x.INSTANCE;
      String var2 = var0.themeFont;
      if (var2 != null) {
         var10 = 1967187603 ^ var10;
         byte var5 = (byte)((var2.isBlank()) ? 1 : 0);
         if (var5 == (457091036 ^ var10)) {
            var10 = 1911574674 ^ var10;
            return var2;
         }

         var10 = 1735853575 ^ var10;
      } else {
         var10 = qjyqlkcechdqddzq(var10, 305651860);
      }

      return zyhkdcxfgf(umddjwhbcfhruzi(), var10);
   }

   public static List<Path> paths(String var0) {
      int var29 = 287245385 ^ 26777084 ^ 1875565230;
      var29 = 1552566124 ^ var29;
      if (var0 != null) {
         var29 = 1503211088 ^ var29;
         String var7 = zyhkdcxfgf(oqbthljydaoxhih(), var29);
         byte var8 = (byte)((var7.equals(var0)) ? 1 : 0);
         if (var8 != (2052989479 ^ var29)) {
            var29 = 2083135140 ^ var29;
            return defaultPaths();
         } else {
            label54:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                  case 219551861:
                     var29 ^= 962942498;
                     break label54;
                  case 559432892:
                     break;
                  case 1029523990:
                     break label54;
                  case 1802955232:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }

            a$a[] var9 = FACES;
            a$a[] var3 = var9;
            int var11 = var9.length;
            int var4 = var11;
            byte var12 = (byte)(1127969797 ^ var29);
            int var5 = var12;
            var29 = 1308805833 ^ var29;

            while (var5 < var4) {
               var29 = 1967842421 ^ var29;
               a$a var15 = var3[var5];
               String var17 = var15.name;
               byte var18 = (byte)((var17.equals(var0)) ? 1 : 0);
               if (var18 != (2020825785 ^ var29)) {
                  var29 = 641702056 ^ var29;
                  String[] var20 = var15.files;
                  return existing(var20);
               }

               label43:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                     case 157222837:
                        var29 ^= 983575949;
                     case 214135161:
                        break label43;
                     case 701540699:
                        break;
                     case 1011110929:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }

               var5 += 1121154869 ^ var29;
               var29 = 1340787192 ^ var29;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                  case 161475730:
                     var29 = 889405723 ^ var29;
                     return List.of();
                  case 331852845:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1617352069:
                     break;
                  case 1967538995:
                     return List.of();
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
               case 89230305:
                  var29 = 632500468 ^ var29;
                  return defaultPaths();
               case 426009729:
                  return defaultPaths();
               case 520578443:
               default:
                  throw new RuntimeException(new IOException());
               case 958046900:
            }
         }
      }
   }

   public static List<Path> defaultPaths() {
      int var49 = 1659160859 ^ 1142066141 ^ 1875565230;
      var49 = 1010976844 ^ var49;
      ArrayList var0 = new ArrayList();
      byte var15 = (byte)(1971245102 ^ var49);
      String[] var16 = new String[var15];
      byte var1 = (byte)(1971245092 ^ var49);
      String var2 = zyhkdcxfgf(ecowvctqsrdwvks(), var49);
      var16[var1] = var2;
      byte var29 = (byte)(1971245093 ^ var49);
      String var38 = zyhkdcxfgf(xwotcppnvsdilwq(), var49);
      var16[var29] = var38;
      byte var30 = (byte)(1971245094 ^ var49);
      String var39 = zyhkdcxfgf(bmamxmdffqtmnqw(), var49);
      var16[var30] = var39;
      byte var31 = (byte)(1971245095 ^ var49);
      String var40 = zyhkdcxfgf(sqmiifqlzdopyrw(), var49);
      var16[var31] = var40;
      byte var32 = (byte)(1971245088 ^ var49);
      String var41 = zyhkdcxfgf(pjjpwacphtjcvbt(), var49);
      var16[var32] = var41;
      byte var33 = (byte)(1971245089 ^ var49);
      String var42 = zyhkdcxfgf(liltgeeuivktazr(), var49);
      var16[var33] = var42;
      byte var34 = (byte)(1971245090 ^ var49);
      String var43 = zyhkdcxfgf(wmddmhvhjgieziy(), var49);
      var16[var34] = var43;
      byte var35 = (byte)(1971245091 ^ var49);
      String var44 = zyhkdcxfgf(dbbqtkhqmlopqef(), var49);
      var16[var35] = var44;
      byte var36 = (byte)(1971245100 ^ var49);
      String var45 = zyhkdcxfgf(yrgularmzvafxjr(), var49);
      var16[var36] = var45;
      byte var37 = (byte)(1971245101 ^ var49);
      String var46 = zyhkdcxfgf(eobtdhdokkuljdq(), var49);
      var16[var37] = var46;
      List var17 = existing(var16);
      boolean var6 = var0.addAll(var17);
      String var7 = zyhkdcxfgf(tnnriojkvzqjeex(), var49);
      String var18 = zyhkdcxfgf(mgohcsigzhzyvuq(), var49);
      String var8 = System.getProperty(var7, var18);
      Locale var19 = Locale.ROOT;
      String var9 = var8.toLowerCase(var19);
      String var20 = zyhkdcxfgf(sfgxanoayoadqwe(), var49);
      byte var11 = (byte)((var9.contains(var20)) ? 1 : 0);
      if (var11 != (1971245092 ^ var49)) {
         var49 = 1061905038 ^ var49;
         String var21 = zyhkdcxfgf(gsrbavcaaggaznf(), var49);
         byte var25 = (byte)(1245033130 ^ var49);
         String[] var26 = new String[var25];
         Path var22 = Path.of(var21, var26);
         addIfFile(var0, var22);
         String var23 = zyhkdcxfgf(miumkbactxhakqy(), var49);
         byte var27 = (byte)(1245033130 ^ var49);
         String[] var28 = new String[var27];
         Path var24 = Path.of(var23, var28);
         addIfFile(var0, var24);
         var49 = 1055782379 ^ var49;
      } else {
         var49 = 27694949 ^ var49;
      }

      return var0;
   }

   private static List<Path> existing(String... var0) {
      int var32 = 1144819756 ^ 1885890707 ^ 1875565230;
      var32 = 480373594 ^ var32;
      ArrayList var1 = new ArrayList();
      ArrayList var3 = var1;
      List var10 = fontDirs();
      Iterator var11 = var10.iterator();
      Iterator var4 = var11;
      var32 = 1704866016 ^ var32;

      while (true) {
         byte var13 = (byte)((var4.hasNext()) ? 1 : 0);
         if (var13 == (581040555 ^ var32)) {
            var32 = qjyqlkcechdqddzq(var32, 2097180848);
            return var3;
         }

         var32 = 165894731 ^ var32;
         Object var15 = var4.next();
         Path var16 = (Path)var15;
         Path var5 = var16;
         String[] var6 = var0;
         int var19 = var0.length;
         int var7 = var19;
         byte var20 = (byte)(725787616 ^ var32);
         int var8 = var20;
         var32 = 1558383936 ^ var32;

         while (var8 < var7) {
            var32 = 324505367 ^ var32;
            String var23 = var6[var8];
            Path var29 = var5.resolve(var23);
            addIfFile(var3, var29);
            var8 += 1693852086 ^ var32;
            var32 = 324505367 ^ var32;
         }

         label27:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var32)) {
               case 66354205:
               default:
                  throw new RuntimeException(new IOException());
               case 130627063:
                  var32 ^= 1050930367;
                  break label27;
               case 1892994428:
                  break;
               case 1947350607:
                  break label27;
            }
         }

         var32 = qjyqlkcechdqddzq(var32, 1805892532);
      }
   }

   private static void addIfFile(List<Path> var0, Path var1) {
      int var14 = 1829319120 ^ 1890253065 ^ 1875565230;
      var14 = 1635021091 ^ var14;
      byte var3 = (byte)(320693076 ^ var14);
      LinkOption[] var9 = new LinkOption[var3];
      byte var4 = (byte)((Files.isRegularFile(var1, var9)) ? 1 : 0);
      if (var4 != (320693076 ^ var14)) {
         var14 = 1686166180 ^ var14;
         byte var6 = (byte)((var0.contains(var1)) ? 1 : 0);
         if (var6 == (2006825456 ^ var14)) {
            var14 = 1894319577 ^ var14;
            boolean var8 = var0.add(var1);
            var14 = 455115310 ^ var14;
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
                  case 130150364:
                     var14 = 1808369655 ^ var14;
                     return;
                  case 174572269:
                  default:
                     throw new RuntimeException();
                  case 1017160074:
                     break;
                  case 1392679294:
                     return;
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
               case 84468591:
                  var14 = 256466259 ^ var14;
                  return;
               case 528111152:
               default:
                  throw new RuntimeException();
               case 607311690:
                  break;
               case 874642960:
                  return;
            }
         }
      }
   }

   private static List<Path> fontDirs() {
      int var89 = 2056887263 ^ 1997605915 ^ 1875565230;
      var89 = 1072530208 ^ var89;
      ArrayList var0 = new ArrayList();
      String var7 = zyhkdcxfgf(gphdbhvqcmjykhf(), var89);
      String var47 = zyhkdcxfgf(fvpkziczqkozbnp(), var89);
      String var8 = System.getProperty(var7, var47);
      Locale var48 = Locale.ROOT;
      String var9 = var8.toLowerCase(var48);
      String var49 = zyhkdcxfgf(vgtwqcqrocytaeg(), var89);
      byte var11 = (byte)((var9.contains(var49)) ? 1 : 0);
      String var6;
      if (var11 == (1571802698 ^ var89)) {
         var89 = qjyqlkcechdqddzq(var89, 802823000);
         String var52 = zyhkdcxfgf(ceeaujgebvhykmu(), var89);
         byte var27 = (byte)((var9.contains(var52)) ? 1 : 0);
         if (var27 == (1920324882 ^ var89)) {
            var89 = 949547091 ^ var89;
            String var53 = zyhkdcxfgf(xprdpqsxhefnnfa(), var89);
            byte var68 = (byte)(1257055553 ^ var89);
            String[] var69 = new String[var68];
            Path var54 = Path.of(var53, var69);
            boolean var29 = var0.add(var54);
            String var55 = zyhkdcxfgf(ispftpwpdhnqzri(), var89);
            byte var70 = (byte)(1257055553 ^ var89);
            String[] var71 = new String[var70];
            Path var56 = Path.of(var55, var71);
            boolean var31 = var0.add(var56);
            String var57 = zyhkdcxfgf(awerbskbgzlfgrd(), var89);
            byte var72 = (byte)(1257055553 ^ var89);
            String[] var73 = new String[var72];
            Path var58 = Path.of(var57, var73);
            boolean var33 = var0.add(var58);
            String var59 = zyhkdcxfgf(jalxkxgwbsjokxg(), var89);
            byte var74 = (byte)(1257055553 ^ var89);
            String[] var75 = new String[var74];
            Path var60 = Path.of(var59, var75);
            boolean var35 = var0.add(var60);
            var89 = 1543433472 ^ var89;
            return var0;
         }

         var89 = 774751913 ^ var89;
         String var61 = zyhkdcxfgf(zmhzpbospicdaal(), var89);
         byte var76 = (byte)(1549276091 ^ var89);
         String[] var77 = new String[var76];
         Path var62 = Path.of(var61, var77);
         boolean var37 = var0.add(var62);
         String var63 = zyhkdcxfgf(mcsxuxxdiyngipt(), var89);
         byte var78 = (byte)(1549276091 ^ var89);
         String[] var79 = new String[var78];
         Path var64 = Path.of(var63, var79);
         boolean var39 = var0.add(var64);
         String var40 = zyhkdcxfgf(vgwllmsutywtrgz(), var89);
         String var41 = System.getProperty(var40);
         if (var41 != null) {
            var89 = 714270424 ^ var89;
            byte var44 = (byte)((var41.isBlank()) ? 1 : 0);
            if (var44 == (1993012579 ^ var89)) {
               var89 = 1019140713 ^ var89;
               byte var80 = (byte)(1249128200 ^ var89);
               String[] var81 = new String[var80];
               byte var82 = (byte)(1249128202 ^ var89);
               String var84 = zyhkdcxfgf(qwvcqvkwsgoeect(), var89);
               var81[var82] = var84;
               byte var83 = (byte)(1249128203 ^ var89);
               String var85 = zyhkdcxfgf(ivfhkcacwbmjdcs(), var89);
               var81[var83] = var85;
               Path var66 = Path.of(var41, var81);
               boolean var46 = var0.add(var66);
               var89 = 1064088949 ^ var89;
            } else {
               label41:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var89)) {
                     case 103370149:
                        var89 ^= 64122652;
                        break label41;
                     case 962819374:
                     default:
                        throw new RuntimeException();
                     case 1270249835:
                        break label41;
                     case 1566829629:
                  }
               }
            }
         } else {
            var89 = 692095428 ^ var89;
         }

         var89 = 1678463550 ^ var89;
         return var0;
      } else {
         label71: {
            label63: {
               var89 = 1165856365 ^ var89;
               String var12 = zyhkdcxfgf(blrgsgpbwbwiovt(), var89);
               String var13 = System.getenv(var12);
               var6 = var13;
               if (var13 != null) {
                  var89 = 820396734 ^ var89;
                  byte var16 = (byte)((var13.isBlank()) ? 1 : 0);
                  if (var16 == (674497177 ^ var89)) {
                     var89 = qjyqlkcechdqddzq(var89, 588070040);
                     break label63;
                  }

                  var89 = 1894998460 ^ var89;
               } else {
                  var89 = 1075127042 ^ var89;
               }

               String var17 = zyhkdcxfgf(nvhpwrnxnqwxjnd(), var89);
               String var18 = System.getenv(var17);
               var6 = var18;
               var89 = 1409178916 ^ var89;
            }

            if (var6 != null) {
               var89 = 2108328841 ^ var89;
               byte var21 = (byte)((var6.isBlank()) ? 1 : 0);
               if (var21 == (1989391752 ^ var89)) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var89)) {
                        case 48530705:
                           break label71;
                        case 96360740:
                           var89 ^= 1451805915;
                           break label71;
                        case 172493108:
                        default:
                           throw new RuntimeException();
                        case 273996499:
                     }
                  }
               }

               var89 = 624601965 ^ var89;
            } else {
               var89 = qjyqlkcechdqddzq(var89, 1485840612);
            }

            String var22 = zyhkdcxfgf(vqjpdyydvcxdbdo(), var89);
            var6 = var22;
            var89 = 1941071798 ^ var89;
         }
      }

      byte var1 = (byte)(538671442 ^ var89);
      String[] var67 = new String[var1];
      byte var2 = (byte)(538671443 ^ var89);
      String var3 = zyhkdcxfgf(liyqadgkklfnfsx(), var89);
      var67[var2] = var3;
      Path var51 = Path.of(var6, var67);
      boolean var24 = var0.add(var51);
      var89 = 822653202 ^ var89;
      return var0;
   }

   static {
      int var141 = 1550734196 ^ 603662722 ^ Integer.parseInt("14600041");
      int var138 = new Random(599952169731925946L).nextInt();
      f24b3jMJnWb = -755298571 ^ var138;
      var141 = 281613119 ^ var141;
      byte var0 = (byte)(1870835374 ^ var141);
      a$a[] var7 = new a$a[var0];
      byte var1 = (byte)(1870835360 ^ var141);
      String var3 = zyhkdcxfgf(ymacvhwjzeirjjo(), var141);
      byte var4 = (byte)(1870835363 ^ var141);
      String[] var47 = new String[var4];
      byte var5 = (byte)(1870835360 ^ var141);
      String var6 = zyhkdcxfgf(jnfkrmtxhyrvuud(), var141);
      var47[var5] = var6;
      byte var74 = (byte)(1870835361 ^ var141);
      String var105 = zyhkdcxfgf(akuwlofxbviyhko(), var141);
      var47[var74] = var105;
      byte var75 = (byte)(1870835362 ^ var141);
      String var106 = zyhkdcxfgf(aejoatgpgqtdhly(), var141);
      var47[var75] = var106;
      a$a var2 = new a$a(var3, var47);
      var7[var1] = var2;
      byte var8 = (byte)(1870835361 ^ var141);
      String var34 = zyhkdcxfgf(recglpfmzfehqiq(), var141);
      byte var48 = (byte)(1870835362 ^ var141);
      String[] var49 = new String[var48];
      byte var76 = (byte)(1870835360 ^ var141);
      String var107 = zyhkdcxfgf(oxyxgztufiamlmp(), var141);
      var49[var76] = var107;
      byte var77 = (byte)(1870835361 ^ var141);
      String var108 = zyhkdcxfgf(ulvosmjiqxjytax(), var141);
      var49[var77] = var108;
      a$a var21 = new a$a(var34, var49);
      var7[var8] = var21;
      byte var9 = (byte)(1870835362 ^ var141);
      String var35 = zyhkdcxfgf(seuasasgyvqccgf(), var141);
      byte var50 = (byte)(1870835363 ^ var141);
      String[] var51 = new String[var50];
      byte var78 = (byte)(1870835360 ^ var141);
      String var109 = zyhkdcxfgf(kocxoxthaimkmjx(), var141);
      var51[var78] = var109;
      byte var79 = (byte)(1870835361 ^ var141);
      String var110 = zyhkdcxfgf(kyfdiwylpizujjh(), var141);
      var51[var79] = var110;
      byte var80 = (byte)(1870835362 ^ var141);
      String var111 = zyhkdcxfgf(ingrgfozkdbumoj(), var141);
      var51[var80] = var111;
      a$a var22 = new a$a(var35, var51);
      var7[var9] = var22;
      byte var10 = (byte)(1870835363 ^ var141);
      String var36 = zyhkdcxfgf(ctpymqzaoltufhl(), var141);
      byte var52 = (byte)(1870835362 ^ var141);
      String[] var53 = new String[var52];
      byte var81 = (byte)(1870835360 ^ var141);
      String var112 = zyhkdcxfgf(oyzlijearrwmfqt(), var141);
      var53[var81] = var112;
      byte var82 = (byte)(1870835361 ^ var141);
      String var113 = zyhkdcxfgf(rmsqgfobjeccixs(), var141);
      var53[var82] = var113;
      a$a var23 = new a$a(var36, var53);
      var7[var10] = var23;
      byte var11 = (byte)(1870835364 ^ var141);
      String var37 = zyhkdcxfgf(njojvzkztzpmmle(), var141);
      byte var54 = (byte)(1870835362 ^ var141);
      String[] var55 = new String[var54];
      byte var83 = (byte)(1870835360 ^ var141);
      String var114 = zyhkdcxfgf(zniojdtthvmawrk(), var141);
      var55[var83] = var114;
      byte var84 = (byte)(1870835361 ^ var141);
      String var115 = zyhkdcxfgf(dowzbfhcswgyzpd(), var141);
      var55[var84] = var115;
      a$a var24 = new a$a(var37, var55);
      var7[var11] = var24;
      byte var12 = (byte)(1870835365 ^ var141);
      String var38 = zyhkdcxfgf(cevzwjivehxfthd(), var141);
      byte var56 = (byte)(1870835362 ^ var141);
      String[] var57 = new String[var56];
      byte var85 = (byte)(1870835360 ^ var141);
      String var116 = zyhkdcxfgf(aafxbzzipufkbmb(), var141);
      var57[var85] = var116;
      byte var86 = (byte)(1870835361 ^ var141);
      String var117 = zyhkdcxfgf(rmikhjmmartlenf(), var141);
      var57[var86] = var117;
      a$a var25 = new a$a(var38, var57);
      var7[var12] = var25;
      byte var13 = (byte)(1870835366 ^ var141);
      String var39 = zyhkdcxfgf(ufmaatmzdfqpknm(), var141);
      byte var58 = (byte)(1870835362 ^ var141);
      String[] var59 = new String[var58];
      byte var87 = (byte)(1870835360 ^ var141);
      String var118 = zyhkdcxfgf(sqsogndrtwbteud(), var141);
      var59[var87] = var118;
      byte var88 = (byte)(1870835361 ^ var141);
      String var119 = zyhkdcxfgf(vmcquqvlweyzkcj(), var141);
      var59[var88] = var119;
      a$a var26 = new a$a(var39, var59);
      var7[var13] = var26;
      byte var14 = (byte)(1870835367 ^ var141);
      String var40 = zyhkdcxfgf(mzrbaszzhrbxgfp(), var141);
      byte var60 = (byte)(1870835362 ^ var141);
      String[] var61 = new String[var60];
      byte var89 = (byte)(1870835360 ^ var141);
      String var120 = zyhkdcxfgf(orlarrzmfklpsyg(), var141);
      var61[var89] = var120;
      byte var90 = (byte)(1870835361 ^ var141);
      String var121 = zyhkdcxfgf(sonksmaecsmojfm(), var141);
      var61[var90] = var121;
      a$a var27 = new a$a(var40, var61);
      var7[var14] = var27;
      byte var15 = (byte)(1870835368 ^ var141);
      String var41 = zyhkdcxfgf(erxbfxxhiexipqs(), var141);
      byte var62 = (byte)(1870835362 ^ var141);
      String[] var63 = new String[var62];
      byte var91 = (byte)(1870835360 ^ var141);
      String var122 = zyhkdcxfgf(apvepnwimlpsccc(), var141);
      var63[var91] = var122;
      byte var92 = (byte)(1870835361 ^ var141);
      String var123 = zyhkdcxfgf(fihgwhpwhaanyjo(), var141);
      var63[var92] = var123;
      a$a var28 = new a$a(var41, var63);
      var7[var15] = var28;
      byte var16 = (byte)(1870835369 ^ var141);
      String var42 = zyhkdcxfgf(hlhwchossgqjhez(), var141);
      byte var64 = (byte)(1870835362 ^ var141);
      String[] var65 = new String[var64];
      byte var93 = (byte)(1870835360 ^ var141);
      String var124 = zyhkdcxfgf(wxayzaurliehmpz(), var141);
      var65[var93] = var124;
      byte var94 = (byte)(1870835361 ^ var141);
      String var125 = zyhkdcxfgf(jgvdzmxbkswwupy(), var141);
      var65[var94] = var125;
      a$a var29 = new a$a(var42, var65);
      var7[var16] = var29;
      byte var17 = (byte)(1870835370 ^ var141);
      String var43 = zyhkdcxfgf(vhmvirwtfvqzqjp(), var141);
      byte var66 = (byte)(1870835362 ^ var141);
      String[] var67 = new String[var66];
      byte var95 = (byte)(1870835360 ^ var141);
      String var126 = zyhkdcxfgf(wrulwafchbakbqx(), var141);
      var67[var95] = var126;
      byte var96 = (byte)(1870835361 ^ var141);
      String var127 = zyhkdcxfgf(zqzticecfpzlflv(), var141);
      var67[var96] = var127;
      a$a var30 = new a$a(var43, var67);
      var7[var17] = var30;
      byte var18 = (byte)(1870835371 ^ var141);
      String var44 = zyhkdcxfgf(xiuwxfabwdwwoye(), var141);
      byte var68 = (byte)(1870835363 ^ var141);
      String[] var69 = new String[var68];
      byte var97 = (byte)(1870835360 ^ var141);
      String var128 = zyhkdcxfgf(ziwripyrujjdlia(), var141);
      var69[var97] = var128;
      byte var98 = (byte)(1870835361 ^ var141);
      String var129 = zyhkdcxfgf(oltwzphoqplovce(), var141);
      var69[var98] = var129;
      byte var99 = (byte)(1870835362 ^ var141);
      String var130 = zyhkdcxfgf(bhemblxbbbrhlbn(), var141);
      var69[var99] = var130;
      a$a var31 = new a$a(var44, var69);
      var7[var18] = var31;
      byte var19 = (byte)(1870835372 ^ var141);
      String var45 = zyhkdcxfgf(yyhkrmronwkwoqx(), var141);
      byte var70 = (byte)(1870835362 ^ var141);
      String[] var71 = new String[var70];
      byte var100 = (byte)(1870835360 ^ var141);
      String var131 = zyhkdcxfgf(lygbhrtlnibbwbm(), var141);
      var71[var100] = var131;
      byte var101 = (byte)(1870835361 ^ var141);
      String var132 = zyhkdcxfgf(xkbfbirvvpruljg(), var141);
      var71[var101] = var132;
      a$a var32 = new a$a(var45, var71);
      var7[var19] = var32;
      byte var20 = (byte)(1870835373 ^ var141);
      String var46 = zyhkdcxfgf(bucapasikrmotoj(), var141);
      byte var72 = (byte)(1870835363 ^ var141);
      String[] var73 = new String[var72];
      byte var102 = (byte)(1870835360 ^ var141);
      String var133 = zyhkdcxfgf(rtrmciuwayrltlt(), var141);
      var73[var102] = var133;
      byte var103 = (byte)(1870835361 ^ var141);
      String var134 = zyhkdcxfgf(yggojjpgqoersvz(), var141);
      var73[var103] = var134;
      byte var104 = (byte)(1870835362 ^ var141);
      String var135 = zyhkdcxfgf(wxyetbtrocoxfrh(), var141);
      var73[var104] = var135;
      a$a var33 = new a$a(var46, var73);
      var7[var20] = var33;
      FACES = var7;
   }

   public static String zyhkdcxfgf(byte[] var0, int var1) {
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
         byte[] var28 = gomdrtwlao;
         byte[] var34 = gomdrtwlao;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] apxbdohhrexiwic() {
      return new byte[]{
         106, 46, 74, 98, 65, 13, 74, 84, 26, 24, 110, 97, 63, 75, 5, 69, 88, 53, 125, 126, 21, 103, 36, 76, 14, 60, 88, 99, 80, 106, 71, 71, 27
      };
   }

   private static byte[] ymacvhwjzeirjjo() {
      return new byte[]{-91, -23, 125, 19, 121, 76, 127, 14, 44, 73, 95, 53};
   }

   private static byte[] jnfkrmtxhyrvuud() {
      return new byte[]{-91, -23, 125, 51, 121, 76, 127, 14, 44, 73, 95, 53, 8, 85, 61, 2, 109, 114, 75, 40};
   }

   private static byte[] akuwlofxbviyhko() {
      return new byte[]{-91, -23, 125, 19, 121, 76, 127, 14, 44, 73, 95, 53, 8, 85, 61, 2, 109, 114, 75, 40};
   }

   private static byte[] aejoatgpgqtdhly() {
      return new byte[]{
         -91,
         -23,
         125,
         30,
         121,
         87,
         127,
         5,
         44,
         77,
         95,
         43,
         8,
         26,
         61,
         2,
         109,
         111,
         75,
         33,
         36,
         49,
         19,
         47,
         54,
         110,
         109,
         62,
         102,
         41,
         118,
         82,
         44,
         8,
         22,
         28,
         87,
         21,
         59,
         15,
         101,
         78,
         47,
         63,
         89,
         126,
         126,
         24,
         115,
         28,
         4,
         49,
         73,
         67
      };
   }

   private static byte[] recglpfmzfehqiq() {
      return new byte[]{-91, -23, 125, 17, 121, 95, 127, 11, 44, 65, 95, 59, 8, 9, 61, 31};
   }

   private static byte[] oxyxgztufiamlmp() {
      return new byte[]{-91, -23, 125, 49, 121, 95, 127, 11, 44, 65, 95, 59, 8, 9, 61, 31, 109, 40, 75, 58, 36, 43, 19, 26};
   }

   private static byte[] ulvosmjiqxjytax() {
      return new byte[]{-91, -23, 125, 17, 121, 95, 127, 11, 44, 65, 95, 59, 8, 9, 61, 31, 109, 40, 75, 58, 36, 43, 19, 26};
   }

   private static byte[] seuasasgyvqccgf() {
      return new byte[]{-91, -23, 125, 17, 121, 95, 127, 20, 44, 75, 95, 56, 8, 31, 61, 31, 109, 103, 75, 110, 36, 18, 19, 19, 54, 97, 109, 63};
   }

   private static byte[] kocxoxthaimkmjx() {
      return new byte[]{
         -91, -23, 125, 49, 121, 95, 127, 20, 44, 75, 95, 56, 8, 31, 61, 31, 109, 103, 75, 35, 36, 48, 19, 18, 54, 96, 109, 126, 102, 46, 118, 11, 44, 60
      };
   }

   private static byte[] kyfdiwylpizujjh() {
      return new byte[]{
         -91, -23, 125, 17, 121, 95, 127, 20, 44, 75, 95, 56, 8, 31, 61, 31, 109, 103, 75, 3, 36, 48, 19, 18, 54, 96, 109, 126, 102, 46, 118, 11, 44, 60
      };
   }

   private static byte[] ingrgfozkdbumoj() {
      return new byte[]{
         -91, -23, 125, 17, 121, 95, 127, 20, 44, 75, 95, 56, 8, 31, 61, 31, 109, 103, 75, 13, 36, 48, 19, 24, 54, 106, 109, 126, 102, 46, 118, 11, 44, 60
      };
   }

   private static byte[] ctpymqzaoltufhl() {
      return new byte[]{-91, -23, 125, 17, 121, 81, 127, 10, 44, 65, 95, 58, 8, 91, 61, 37, 109, 103, 75, 32, 36, 44};
   }

   private static byte[] oyzlijearrwmfqt() {
      return new byte[]{-91, -23, 125, 49, 121, 81, 127, 10, 44, 65, 95, 58, 8, 85, 61, 2, 109, 114, 75, 40};
   }

   private static byte[] rmsqgfobjeccixs() {
      return new byte[]{
         -91,
         -23,
         125,
         17,
         121,
         81,
         127,
         10,
         44,
         65,
         95,
         58,
         8,
         91,
         61,
         37,
         109,
         103,
         75,
         32,
         36,
         44,
         19,
         92,
         54,
         66,
         109,
         3,
         102,
         116,
         118,
         11,
         44,
         46,
         22,
         31
      };
   }

   private static byte[] njojvzkztzpmmle() {
      return new byte[]{-91, -23, 125, 17, 121, 81, 127, 9, 44, 91, 95, 54, 8, 23, 61, 23, 109, 117};
   }

   private static byte[] zniojdtthvmawrk() {
      return new byte[]{-91, -23, 125, 49, 121, 81, 127, 9, 44, 91, 95, 54, 8, 23, 61, 23, 109, 40, 75, 58, 36, 43, 19, 26};
   }

   private static byte[] dowzbfhcswgyzpd() {
      return new byte[]{-91, -23, 125, 17, 121, 81, 127, 9, 44, 91, 95, 54, 8, 23, 61, 23, 109, 117, 75, 96, 36, 43, 19, 8, 54, 105};
   }

   private static byte[] cevzwjivehxfthd() {
      return new byte[]{-91, -23, 125, 17, 121, 81, 127, 18, 44, 90, 95, 48, 8, 30, 61, 4, 109, 38, 75, 0, 36, 58, 19, 11};
   }

   private static byte[] aafxbzzipufkbmb() {
      return new byte[]{-91, -23, 125, 49, 121, 81, 127, 18, 44, 90, 95, 119, 8, 15, 61, 2, 109, 96};
   }

   private static byte[] rmikhjmmartlenf() {
      return new byte[]{-91, -23, 125, 17, 121, 81, 127, 18, 44, 90, 95, 48, 8, 30, 61, 4, 109, 38, 75, 0, 36, 58, 19, 11, 54, 33, 109, 36, 102, 46, 118, 25};
   }

   private static byte[] ufmaatmzdfqpknm() {
      return new byte[]{-91, -23, 125, 21, 121, 91, 127, 8, 44, 90, 95, 62, 8, 18, 61, 23};
   }

   private static byte[] sqsogndrtwbteud() {
      return new byte[]{-91, -23, 125, 53, 121, 91, 127, 8, 44, 90, 95, 62, 8, 18, 61, 23, 109, 40, 75, 58, 36, 43, 19, 26};
   }

   private static byte[] vmcquqvlweyzkcj() {
      return new byte[]{-91, -23, 125, 21, 121, 91, 127, 8, 44, 90, 95, 62, 8, 18, 61, 23, 109, 40, 75, 58, 36, 43, 19, 26};
   }

   private static byte[] mzrbaszzhrbxgfp() {
      return new byte[]{-91, -23, 125, 27, 121, 83, 127, 23, 44, 73, 95, 58, 8, 15};
   }

   private static byte[] orlarrzmfklpsyg() {
      return new byte[]{-91, -23, 125, 59, 121, 83, 127, 23, 44, 73, 95, 58, 8, 15, 61, 88, 109, 114, 75, 58, 36, 57};
   }

   private static byte[] sonksmaecsmojfm() {
      return new byte[]{-91, -23, 125, 27, 121, 83, 127, 23, 44, 73, 95, 58, 8, 15, 61, 88, 109, 114, 75, 58, 36, 57};
   }

   private static byte[] erxbfxxhiexipqs() {
      return new byte[]{-91, -23, 125, 30, 121, 75, 127, 4, 44, 65, 95, 61, 8, 26, 61, 86, 109, 69, 75, 33, 36, 49, 19, 15, 54, 96, 109, 60, 102, 63};
   }

   private static byte[] apvepnwimlpsccc() {
      return new byte[]{-91, -23, 125, 62, 121, 75, 127, 4, 44, 71, 95, 55, 8, 85, 61, 2, 109, 114, 75, 40};
   }

   private static byte[] fihgwhpwhaanyjo() {
      return new byte[]{
         -91,
         -23,
         125,
         30,
         121,
         75,
         127,
         4,
         44,
         65,
         95,
         61,
         8,
         26,
         61,
         86,
         109,
         69,
         75,
         33,
         36,
         49,
         19,
         15,
         54,
         96,
         109,
         60,
         102,
         63,
         118,
         81,
         44,
         46,
         22,
         13,
         87,
         20
      };
   }

   private static byte[] hlhwchossgqjhez() {
      return new byte[]{-91, -23, 125, 1, 121, 91, 127, 0, 44, 71, 95, 60, 8, 91, 61, 35, 109, 79};
   }

   private static byte[] wxayzaurliehmpz() {
      return new byte[]{-91, -23, 125, 33, 121, 91, 127, 0, 44, 71, 95, 60, 8, 14, 61, 31, 109, 40, 75, 58, 36, 43, 19, 26};
   }

   private static byte[] jgvdzmxbkswwupy() {
      return new byte[]{-91, -23, 125, 1, 121, 91, 127, 0, 44, 71, 95, 60, 8, 91, 61, 35, 109, 79, 75, 96, 36, 43, 19, 8, 54, 105};
   }

   private static byte[] vhmvirwtfvqzqjp() {
      return new byte[]{-91, -23, 125, 6, 121, 95, 127, 15, 44, 71, 95, 52, 8, 26};
   }

   private static byte[] wrulwafchbakbqx() {
      return new byte[]{-91, -23, 125, 38, 121, 95, 127, 15, 44, 71, 95, 52, 8, 26, 61, 88, 109, 114, 75, 58, 36, 57};
   }

   private static byte[] zqzticecfpzlflv() {
      return new byte[]{-91, -23, 125, 6, 121, 95, 127, 15, 44, 71, 95, 52, 8, 26, 61, 88, 109, 114, 75, 58, 36, 57};
   }

   private static byte[] xiuwxfabwdwwoye() {
      return new byte[]{-91, -23, 125, 6, 121, 87, 127, 10, 44, 77, 95, 42, 8, 91, 61, 56, 109, 99, 75, 57, 36, 127, 19, 46, 54, 96, 109, 61, 102, 59, 118, 17};
   }

   private static byte[] ziwripyrujjdlia() {
      return new byte[]{-91, -23, 125, 38, 121, 87, 127, 10, 44, 77, 95, 42, 8, 85, 61, 2, 109, 114, 75, 40};
   }

   private static byte[] oltwzphoqplovce() {
      return new byte[]{
         -91,
         -23,
         125,
         6,
         121,
         87,
         127,
         10,
         44,
         77,
         95,
         42,
         8,
         91,
         61,
         56,
         109,
         99,
         75,
         57,
         36,
         127,
         19,
         46,
         54,
         96,
         109,
         61,
         102,
         59,
         118,
         17,
         44,
         116,
         22,
         13,
         87,
         6,
         59,
         28
      };
   }

   private static byte[] bhemblxbbbrhlbn() {
      return new byte[]{
         -91,
         -23,
         125,
         30,
         121,
         87,
         127,
         5,
         44,
         77,
         95,
         43,
         8,
         26,
         61,
         2,
         109,
         111,
         75,
         33,
         36,
         49,
         19,
         47,
         54,
         106,
         109,
         34,
         102,
         51,
         118,
         25,
         44,
         119,
         22,
         43,
         87,
         23,
         59,
         29,
         101,
         87,
         47,
         50,
         89,
         109,
         126,
         68,
         115,
         70,
         4,
         49,
         73,
         81,
         95,
         113
      };
   }

   private static byte[] yyhkrmronwkwoqx() {
      return new byte[]{-91, -23, 125, 6, 121, 76, 127, 2, 44, 74, 95, 44, 8, 24, 61, 30, 109, 99, 75, 58, 36, 127, 19, 49, 54, 92};
   }

   private static byte[] lygbhrtlnibbwbm() {
      return new byte[]{-91, -23, 125, 38, 121, 76, 127, 2, 44, 74, 95, 44, 8, 24, 61, 88, 109, 114, 75, 58, 36, 57};
   }

   private static byte[] xkbfbirvvpruljg() {
      return new byte[]{
         -91, -23, 125, 6, 121, 76, 127, 2, 44, 74, 95, 44, 8, 24, 61, 30, 109, 99, 75, 58, 36, 127, 19, 49, 54, 92, 109, 126, 102, 46, 118, 11, 44, 60
      };
   }

   private static byte[] bucapasikrmotoj() {
      return new byte[]{-91, -23, 125, 4, 121, 91, 127, 21, 44, 76, 95, 56, 8, 21, 61, 23};
   }

   private static byte[] rtrmciuwayrltlt() {
      return new byte[]{-91, -23, 125, 36, 121, 91, 127, 21, 44, 76, 95, 56, 8, 21, 61, 23, 109, 40, 75, 58, 36, 43, 19, 26};
   }

   private static byte[] yggojjpgqoersvz() {
      return new byte[]{-91, -23, 125, 4, 121, 91, 127, 21, 44, 76, 95, 56, 8, 21, 61, 23, 109, 40, 75, 58, 36, 43, 19, 26};
   }

   private static byte[] wxyetbtrocoxfrh() {
      return new byte[]{-91, -23, 125, 22, 121, 91, 127, 13, 44, 73, 95, 15, 8, 14, 61, 37, 109, 103, 75, 32, 36, 44, 19, 82, 54, 123, 109, 36, 102, 60};
   }

   private static byte[] jshxcjsaxyhcbji() {
      return new byte[]{-91, -32, 114, 30, 117, 81, 125, 3, 47, 76, 95, 37, 7, 31, 49, 8};
   }

   private static byte[] umddjwhbcfhruzi() {
      return new byte[]{-90, -31, 114, 19, 115, 88, 122, 1, 46, 78, 92, 36, 7, 18, 55, 1};
   }

   private static byte[] oqbthljydaoxhih() {
      return new byte[]{-90, -31, 127, 20, 120, 80, 115, 6, 45, 64, 92, 36, 10, 21, 60, 9};
   }

   private static byte[] gsrbavcaaggaznf() {
      return new byte[]{
         -91,
         -29,
         126,
         120,
         113,
         109,
         121,
         28,
         41,
         91,
         95,
         39,
         11,
         27,
         53,
         27,
         107,
         43,
         78,
         2,
         36,
         60,
         16,
         27,
         62,
         125,
         107,
         51,
         99,
         40,
         118,
         12,
         47,
         112,
         30,
         63,
         81,
         31,
         62,
         20,
         101,
         92,
         44,
         40,
         81,
         35,
         120,
         103,
         118,
         46,
         4,
         1,
         74,
         115,
         87,
         57,
         127,
         75,
         15,
         28,
         82,
         4
      };
   }

   private static byte[] miumkbactxhakqy() {
      return new byte[]{
         -91,
         -29,
         126,
         120,
         113,
         114,
         121,
         12,
         41,
         74,
         95,
         33,
         11,
         31,
         53,
         4,
         107,
         125,
         78,
         97,
         36,
         19,
         16,
         22,
         62,
         97,
         107,
         38,
         99,
         41,
         118,
         90,
         47,
         30,
         30,
         11,
         81,
         25,
         62,
         27,
         101,
         68,
         44,
         117,
         81,
         120,
         120,
         64,
         118,
         14
      };
   }

   private static byte[] ecowvctqsrdwvks() {
      return new byte[]{
         -91, -24, 125, 48, 115, 88, 127, 23, 35, 73, 95, 57, 8, 30, 55, 24, 109, 100, 68, 33, 36, 49, 19, 19, 60, 103, 109, 125, 105, 44, 118, 10, 44, 61
      };
   }

   private static byte[] xwotcppnvsdilwq() {
      return new byte[]{
         -91, -24, 125, 16, 115, 88, 127, 23, 35, 73, 95, 57, 8, 30, 55, 24, 109, 100, 68, 1, 36, 49, 19, 19, 60, 103, 109, 125, 105, 44, 118, 10, 44, 61
      };
   }

   private static byte[] bmamxmdffqtmnqw() {
      return new byte[]{-91, -24, 125, 48, 115, 86, 127, 10, 35, 89, 95, 55, 8, 22, 55, 16, 109, 43, 68, 56, 36, 42, 19, 27};
   }

   private static byte[] sqmiifqlzdopyrw() {
      return new byte[]{-91, -24, 125, 63, 115, 76, 127, 7, 35, 69, 95, 54, 8, 84, 55, 5, 109, 113, 68, 42};
   }

   private static byte[] pjjpwacphtjcvbt() {
      return new byte[]{-91, -24, 125, 39, 115, 88, 127, 12, 35, 69, 95, 53, 8, 27, 55, 95, 109, 113, 68, 56, 36, 56};
   }

   private static byte[] liltgeeuivktazr() {
      return new byte[]{-91, -24, 125, 37, 115, 92, 127, 22, 35, 78, 95, 57, 8, 20, 55, 16, 109, 43, 68, 56, 36, 42, 19, 27};
   }

   private static byte[] wmddmhvhjgieziy() {
      return new byte[]{-91, -24, 125, 32, 115, 92, 127, 3, 35, 69, 95, 61, 8, 15, 55, 24, 109, 43, 68, 56, 36, 42, 19, 27};
   }

   private static byte[] dbbqtkhqmlopqef() {
      return new byte[]{-91, -24, 125, 50, 115, 75, 127, 13, 35, 75, 95, 52, 8, 84, 55, 5, 109, 113, 68, 42};
   }

   private static byte[] yrgularmzvafxjr() {
      return new byte[]{-91, -24, 125, 23, 115, 92, 127, 14, 35, 75, 95, 14, 8, 15, 55, 34, 109, 100, 68, 34, 36, 45, 19, 83, 60, 124, 109, 39, 105, 62};
   }

   private static byte[] eobtdhdokkuljdq() {
      return new byte[]{
         -91,
         -24,
         125,
         31,
         115,
         80,
         127,
         6,
         35,
         79,
         95,
         42,
         8,
         27,
         55,
         5,
         109,
         108,
         68,
         35,
         36,
         48,
         19,
         46,
         60,
         105,
         109,
         61,
         105,
         43,
         118,
         83,
         44,
         9,
         28,
         27,
         87,
         22,
         52,
         13,
         101,
         79,
         47,
         62,
         83,
         121,
         126,
         27,
         124,
         30,
         4,
         48,
         73,
         66
      };
   }

   private static byte[] tnnriojkvzqjeex() {
      return new byte[]{-91, -24, 125, 60, 115, 74, 127, 74, 35, 68, 95, 57, 8, 23, 55, 20};
   }

   private static byte[] mgohcsigzhzyvuq() {
      return new byte[0];
   }

   private static byte[] sfgxanoayoadqwe() {
      return new byte[]{-91, -24, 125, 62, 115, 88, 127, 7};
   }

   private static byte[] gphdbhvqcmjykhf() {
      return new byte[]{-91, -28, 125, 60, 121, 78, 120, 76, 35, 78, 95, 53, 8, 23, 61, 16};
   }

   private static byte[] fvpkziczqkozbnp() {
      return new byte[0];
   }

   private static byte[] vgtwqcqrocytaeg() {
      return new byte[]{-91, -28, 125, 36, 121, 84, 120, 12};
   }

   private static byte[] blrgsgpbwbwiovt() {
      return new byte[]{-96, -32, 124, 1, 114, 118, 123, 44, 45, 104, 95, 30, 11, 42};
   }

   private static byte[] xprdpqsxhefnnfa() {
      return new byte[]{
         -91,
         -29,
         127,
         122,
         113,
         77,
         127,
         18,
         47,
         89,
         95,
         124,
         10,
         15,
         53,
         24,
         109,
         97,
         72,
         63,
         36,
         48,
         17,
         84,
         62,
         111,
         109,
         57,
         101,
         55,
         118,
         1,
         46,
         46,
         30,
         80,
         87,
         0,
         56,
         11,
         101,
         93,
         45,
         60,
         81,
         126,
         126,
         73,
         112,
         27,
         4,
         42,
         75,
         13,
         87,
         117,
         121,
         94,
         9,
         1,
         82,
         3,
         95,
         6,
         119,
         91
      };
   }

   private static byte[] ispftpwpdhnqzri() {
      return new byte[]{
         -91,
         -29,
         127,
         122,
         113,
         77,
         127,
         18,
         47,
         89,
         95,
         124,
         10,
         15,
         53,
         24,
         109,
         97,
         72,
         63,
         36,
         48,
         17,
         84,
         62,
         111,
         109,
         57,
         101,
         55,
         118,
         1,
         46,
         46,
         30,
         80,
         87,
         0,
         56,
         11,
         101,
         93,
         45,
         60,
         81,
         126,
         126,
         73,
         112,
         27,
         4,
         42,
         75,
         13,
         87,
         125,
         121,
         82,
         9,
         9,
         82,
         7,
         95,
         2,
         119,
         79,
         95,
         111,
         127,
         56,
         112,
         80,
         127,
         13
      };
   }

   private static byte[] awerbskbgzlfgrd() {
      return new byte[]{
         -91,
         -29,
         127,
         122,
         113,
         77,
         127,
         18,
         47,
         89,
         95,
         124,
         10,
         15,
         53,
         24,
         109,
         97,
         72,
         63,
         36,
         48,
         17,
         84,
         62,
         111,
         109,
         57,
         101,
         55,
         118,
         1,
         46,
         46,
         30,
         80,
         87,
         0,
         56,
         11,
         101,
         93,
         45,
         60,
         81,
         126,
         126,
         73,
         112,
         27,
         4,
         42,
         75,
         13,
         87,
         124,
         121,
         72,
         9,
         31,
         82,
         22,
         95,
         19,
         119,
         65,
         95,
         105,
         127,
         52,
         112,
         89,
         127,
         12,
         42,
         67,
         91,
         32,
         10,
         11
      };
   }

   private static byte[] jalxkxgwbsjokxg() {
      return new byte[]{
         -91,
         -29,
         127,
         122,
         113,
         77,
         127,
         18,
         47,
         89,
         95,
         124,
         10,
         15,
         53,
         24,
         109,
         97,
         72,
         63,
         36,
         48,
         17,
         84,
         62,
         111,
         109,
         57,
         101,
         55,
         118,
         1,
         46,
         46,
         30,
         80,
         87,
         32,
         56,
         45,
         101,
         110
      };
   }

   private static byte[] zmhzpbospicdaal() {
      return new byte[]{
         -91,
         -28,
         126,
         116,
         115,
         105,
         124,
         29,
         35,
         90,
         95,
         32,
         11,
         23,
         55,
         31,
         110,
         42,
         68,
         3,
         36,
         59,
         16,
         23,
         60,
         121,
         110,
         50,
         105,
         41,
         118,
         11,
         47,
         124,
         28,
         59,
         84,
         30,
         52,
         21,
         101,
         91,
         44,
         36
      };
   }

   private static byte[] mcsxuxxdiyngipt() {
      return new byte[]{-91, -28, 126, 116, 115, 118, 124, 13, 35, 75, 95, 38, 11, 19, 55, 0, 110, 124, 68, 96, 36, 20, 16, 26, 60, 101, 110, 39, 105, 40};
   }

   private static byte[] vgwllmsutywtrgz() {
      return new byte[]{-91, -28, 126, 46, 115, 73, 124, 1, 35, 91, 95, 122, 11, 26, 55, 29, 110, 104, 68, 42};
   }

   private static byte[] qwvcqvkwsgoeect() {
      return new byte[]{-91, -29, 126, 23, 112, 86, 114, 4, 42, 88, 95, 50, 11, 0, 52, 14};
   }

   private static byte[] ivfhkcacwbmjdcs() {
      return new byte[]{-91, -29, 126, 29, 112, 80, 114, 8, 42, 94, 95, 32};
   }

   private static byte[] ceeaujgebvhykmu() {
      return new byte[]{-91, -24, 120, 63, 114, 94, 126, 15};
   }

   private static byte[] liyqadgkklfnfsx() {
      return new byte[]{-95, -30, 114, 18, 118, 83, 126, 14, 41, 89, 93, 42};
   }

   private static byte[] nvhpwrnxnqwxjnd() {
      return new byte[]{-91, -27, 114, 8, 117, 66, 120, 23, 47, 95, 95, 48, 7, 31, 49, 33, 106, 106, 72, 34, 36, 39};
   }

   private static byte[] vqjpdyydvcxdbdo() {
      return new byte[]{-91, -27, 122, 18, 116, 14, 120, 60, 40, 126, 95, 60, 15, 22, 48, 24, 106, 110, 79, 56, 36, 32};
   }

   private static int qjyqlkcechdqddzq(int var0, int var1) {
      return var1 ^ var0;
   }
}
