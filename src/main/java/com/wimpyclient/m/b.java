package com.wimpyclient.m;

import com.wimpyclient.k.j;
import com.wimpyclient.p.g;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NVGPaint;
import org.lwjgl.nanovg.NanoVG;
import org.lwjgl.nanovg.NanoVGGL3;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class b {
   public static final String FONT = "Default";
   private static b instance;
   private long ctx;
   private boolean fontLoaded;
   private String fallbackFace;
   private final Set<String> loadedFaces;
   private final List<ByteBuffer> retainedFontData;
   private final ArrayDeque<Float> alphaStack;
   private final float[] textBounds;
   private float appliedAlpha;
   private String boundFace;
   private static int SWr6jjCfT1;
   private transient int Nh7wTPJeQj;
   private static byte[] nzclgqehdn = mtnfzxcuumhjarr();

   private b() {
super();
      int var54 = 1092912142 ^ 610365811;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
            case 70774503:
               var54 = 1370300008 ^ var54;
            case 1987337504:
               var54 = 580023024 ^ 680189808 ^ Integer.parseInt("1055934101");
               this.Nh7wTPJeQj = 1963200021 ^ SWr6jjCfT1;
               var54 = 28536573 ^ var54;
               String var2 = "Default";
               this.fallbackFace = var2;
               HashSet var29 = new HashSet();
               this.loadedFaces = var29;
               ArrayList var30 = new ArrayList();
               this.retainedFontData = var30;
               ArrayDeque var31 = new ArrayDeque();
               this.alphaStack = var31;
               byte var32 = 4;
               float[] var33 = new float[var32];
               this.textBounds = var33;
               float var34 = 1.0F;
               this.appliedAlpha = var34;
               byte var35 = 3;
               long var36 = NanoVGGL3.nvgCreate(var35);
               this.ctx = var36;
               long var11 = this.ctx;
               long var45 = 0L;
               long var67;
               int var13 = (var67 = var11 - var45) == 0L ? 0 : (var67 < 0L ? -1 : 1);
               if (((var13) != 0)) {
                  var54 = 1138942230 ^ var54;
                  byte var38 = 1;
                  long var39 = NanoVGGL3.nvgCreate(var38);
                  this.ctx = var39;
                  var54 = 1485362419 ^ var54;
               } else {
                  var54 = 459945445 ^ var54;
               }

               long var16 = this.ctx;
               long var47 = 0L;
               long var68;
               int var18 = (var68 = var16 - var47) == 0L ? 0 : (var68 < 0L ? -1 : 1);
               if (((var18) != 0)) {
                  var54 = 1621724906 ^ var54;
                  byte var41 = 0;
                  long var42 = NanoVGGL3.nvgCreate(var41);
                  this.ctx = var42;
                  var54 = 1701528778 ^ var54;
               } else {
                  var54 = zrerigsvavnelhwc(var54, 96651808);
               }

               long var21 = this.ctx;
               long var49 = 0L;
               long var69;
               int var23 = (var69 = var21 - var49) == 0L ? 0 : (var69 < 0L ? -1 : 1);
               if (((var23) != 0)) {
                  var54 = 1011215993 ^ var54;
                  String var51 = "Failed to create NanoVG context";
                  IllegalStateException var28 = new IllegalStateException(var51);
                  throw new RuntimeException(var28);
               }

               var54 = 539554061 ^ var54;
               this.loadAllFonts();
               boolean var26 = this.fontLoaded;
               if (!var26) {
                  var54 = 376597966 ^ var54;
                  Logger var27 = com.wimpyclient.Wimpy.LOGGER;
                  String var44 = "NanoVG: no UI font loaded \u2014 text will be blank";
                  var27.warn(var44);
                  var54 = 2096310542 ^ var54;
                  return;
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
                     case 117003861:
                        var54 = 1786856640 ^ var54;
                        return;
                     case 704715821:
                        return;
                     case 1632863442:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1966873064:
                  }
               }
            case 921089795:
            default:
               throw new RuntimeException(new IOException());
            case 1052958075:
         }
      }
   }

   public static b get() {
      int var5 = 2110801679 ^ 1851883064 ^ 2066920654;
      var5 = 1755444890 ^ var5;
      b var0 = instance;
      if (var0 == null) {
         var5 = 967868320 ^ var5;
         b var1 = new b();
         instance = var1;
         var5 = 1262146683 ^ var5;
         return instance;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var5)) {
               case 2118542:
                  var5 = 1921690587 ^ var5;
                  return instance;
               case 200194795:
               default:
                  throw new IllegalStateException();
               case 2016880182:
                  return instance;
               case 2062826376:
            }
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static boolean ready() {
      int var15 = 1088896629 ^ 575839157 ^ 2066920654;
      var15 = 880984853 ^ var15;

      byte var22;
      label49: {
         RuntimeException var10000;
         label48: {
            label47: {
               label46: {
                  label60: {
                     try {
                        b var0 = get();
                        long var5 = var0.ctx;
                        long var2 = 0L;
                        long var21;
                        int var7 = (var21 = var5 - var2) == 0L ? 0 : (var21 < 0L ? -1 : 1);
                        if (var7 != (755356187 ^ var15)) {
                           var15 ^= 291615975;
                           var22 = (byte)(1013212925 ^ var15);
                           break label49;
                        }
                     } catch (RuntimeException var17) {
                        var10000 = var17;
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var15)) {
                           case -484231199:
                              break label46;
                           case 20902643:
                              break label47;
                           case 1747882201:
                              break label60;
                           default:
                              throw new RuntimeException(new IOException("Error in hash"));
                        }
                     }

                     var15 = zrerigsvavnelhwc(var15, 1294076997);

                     try {
                        var22 = (byte)(1613225566 ^ var15);
                        var15 ^= 2066387435;
                        return (var22 != 0);
                     } catch (RuntimeException var16) {
                        var10000 = var16;
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var15)) {
                           case -484231199:
                              break label46;
                           case 20902643:
                              break label47;
                           case 1747882201:
                              break;
                           default:
                              throw new RuntimeException(new IOException("Error in hash"));
                        }
                     }
                  }

                  var15 = 103936177 ^ var15;
                  break label48;
               }

               var15 = 391136342 ^ var15;
               break label48;
            }

            var15 = 1259601140 ^ var15;
         }

         RuntimeException var8 = var10000;
         Logger var9 = com.wimpyclient.Wimpy.LOGGER;
         String var1 = vrlpgbjthj(utruyngdnacsohk(), var15);
         var9.error(var1, var8);
         return (((byte)(724837034 ^ var15)) != 0);
      }

      var15 = 661203273 ^ var15;
      return (var22 != 0);
   }

   public long ctx() {
      int var5 = 872567205 ^ 500189969 ^ 238467803;
      var5 = 2045361910 ^ var5;
      return this.ctx;
   }

   public boolean hasFont() {
      int var5 = 878174443 ^ 93491332 ^ 238467803;
      var5 = 2124776236 ^ var5;
      return this.fontLoaded;
   }

   private void loadAllFonts() {
      int var60;
      label85: {
         var60 = 107908072 ^ 1290720348 ^ 238467803;
         var60 = 1151663319 ^ var60;
         String var2 = vrlpgbjthj(nckdsvnluxmfony(), var60);
         String var3 = vrlpgbjthj(edcavxivfbytsbb(), var60);
         byte var8 = (byte)((this.loadFontResource(var2, var3)) ? 1 : 0);
         if (var8 == (1186232 ^ var60)) {
            var60 = 696214210 ^ var60;
            String var36 = vrlpgbjthj(kltfdjhksprcdev(), var60);
            String var48 = vrlpgbjthj(aafmbossutqznmf(), var60);
            byte var10 = (byte)((this.loadFontResource(var36, var48)) ? 1 : 0);
            if (var10 == (695040890 ^ var60)) {
               var60 = 1714972007 ^ var60;
               String var37 = vrlpgbjthj(kbmtqesqaeemrfn(), var60);
               List var49 = com.wimpyclient.o.a.defaultPaths();
               byte var12 = (byte)((this.loadFirstFile(var37, var49)) ? 1 : 0);
               if (var12 == (1330978333 ^ var60)) {
                  var60 = 936347940 ^ var60;
                  break label85;
               }

               var60 = 2079926866 ^ var60;
            } else {
               label82:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var60)) {
                     case 4470353:
                        var60 ^= 499207989;
                        break label82;
                     case 55697678:
                        break;
                     case 1345946222:
                        break label82;
                     case 1674241291:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }
         } else {
            var60 = 884878839 ^ var60;
         }

         String var38 = vrlpgbjthj(fcsfwhkwfmafmvq(), var60);
         this.fallbackFace = var38;
         byte var39 = (byte)(883700814 ^ var60);
         this.fontLoaded = (var39 != 0);
         var60 = 1278649206 ^ var60;
      }

      String[] var15 = com.wimpyclient.o.a.available();
      String[] var4 = var15;
      int var17 = var15.length;
      int var5 = var17;
      byte var18 = (byte)(2023397177 ^ var60);
      int var6 = var18;
      var60 = 368547359 ^ var60;

      while (var6 < var5) {
         var60 = 1432229507 ^ var60;
         String var21 = var4[var6];
         String var22 = vrlpgbjthj(fifhwohptybcorp(), var60);
         byte var23 = (byte)((var22.equals(var21)) ? 1 : 0);
         if (var23 != (942872485 ^ var60)) {
            var60 = 858365265 ^ var60;
         } else {
            var60 = 1632362060 ^ var60;
            Set var25 = this.loadedFaces;
            byte var26 = (byte)((var25.contains(var21)) ? 1 : 0);
            if (var26 != (1501088233 ^ var60)) {
               var60 = 1530335840 ^ var60;

               label58:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var60)) {
                     case 36364191:
                        var60 ^= 156586365;
                        break label58;
                     case 572125293:
                        break;
                     case 806452884:
                        break label58;
                     case 1653957992:
                     default:
                        throw new IllegalStateException();
                  }
               }
            } else {
               label68:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var60)) {
                     case 7820964:
                        break;
                     case 199018041:
                        break label68;
                     case 224026187:
                        var60 ^= 921100452;
                        break label68;
                     case 382280524:
                     default:
                        throw new IllegalStateException();
                  }
               }

               List var51 = com.wimpyclient.o.a.paths(var21);
               byte var28 = (byte)((this.loadFirstFile(var21, var51)) ? 1 : 0);
               if (var28 != (1872636237 ^ var60)) {
                  var60 = 1094293621 ^ var60;
                  byte var30 = (byte)((this.fontLoaded) ? 1 : 0);
                  if (var30 == (782741816 ^ var60)) {
                     var60 = 2108918915 ^ var60;
                     this.fallbackFace = var21;
                     byte var46 = (byte)(1393835450 ^ var60);
                     this.fontLoaded = (var46 != 0);
                     var60 = 1477359439 ^ var60;
                  } else {
                     var60 = zrerigsvavnelhwc(var60, 633158604);
                  }
               } else {
                  var60 = 1686414265 ^ var60;
               }
            }
         }

         var6 += 186288885 ^ var60;
         var60 = 1719110610 ^ var60;
      }

      label46:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var60)) {
            case 67329876:
               var60 ^= 480286812;
               break label46;
            case 1048821581:
            default:
               throw new IllegalStateException();
            case 1181306956:
               break;
            case 1388194704:
               break label46;
         }
      }

      byte var34 = (byte)((this.fontLoaded) ? 1 : 0);
      if (var34 != (1909299578 ^ var60)) {
         var60 = 1317473182 ^ var60;
         Logger var35 = com.wimpyclient.Wimpy.LOGGER;
         String var47 = vrlpgbjthj(nyynyqxvrztxnxa(), var60);
         Set var53 = this.loadedFaces;
         var35.info(var47, var53);
         var60 = 1262615071 ^ var60;
      } else {
         var60 = 96924033 ^ var60;
      }
   }

   private boolean loadFirstFile(String var1, List<Path> var2) {
      int var20 = 1800863043 ^ 1716573384 ^ 238467803;
      var20 = 1067941149 ^ var20;
      Iterator var8 = var2.iterator();
      Iterator var6 = var8;
      var20 = 190049381 ^ var20;

      while (true) {
         byte var10 = (byte)((var6.hasNext()) ? 1 : 0);
         if (var10 == (935592488 ^ var20)) {
            var20 = zrerigsvavnelhwc(var20, 1914107775);
            return (((byte)(1171453271 ^ var20)) != 0);
         }

         var20 = 889116290 ^ var20;
         Object var12 = var6.next();
         Path var13 = (Path)var12;
         byte var15 = (byte)((this.loadFontFile(var1, var13)) ? 1 : 0);
         if (var15 != (54187178 ^ var20)) {
            var20 = 712998576 ^ var20;
            return (((byte)(692431387 ^ var20)) != 0);
         }

         label22:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var20)) {
               case 5016369:
               default:
                  throw new RuntimeException(new IOException());
               case 50799717:
                  var20 ^= 531712542;
               case 331016866:
                  break label22;
               case 1538577845:
            }
         }

         var20 = zrerigsvavnelhwc(var20, 726637724);
      }
   }

   private boolean loadFontResource(String param1, String param2) {
   ClassLoader[] var14 = new ClassLoader[] { b.class.getClassLoader(), Thread.currentThread().getContextClassLoader() };
   ClassLoader[] var6 = var14;
   int var16 = var6.length;
   for (int var7 = 0; var7 < var16; var7++) {
      ClassLoader loader = var6[var7];
      if (loader != null) {
         InputStream in = null;
         try {
            in = loader.getResourceAsStream(param2);
            if (in == null) {
               continue;
            }
            byte[] data = in.readAllBytes();
            if (this.registerFont(param1, data)) {
               return true;
            }
            return false;
         } catch (Throwable t) {
            com.wimpyclient.Wimpy.LOGGER.warn(vrlpgbjthj(psymwlmfmgjvuku(), 0), param2, t);
            return false;
         } finally {
            if (in != null) {
               try {
                  in.close();
               } catch (Throwable var18) {
               }
            }
         }
      }
   }
   return false;
}

   private boolean loadFontFile(String var1, Path var2) {
      int var17 = 252130106 ^ 337880443 ^ 238467803;
      var17 = 1671750144 ^ var17;

      try {
         byte[] var7 = Files.readAllBytes(var2);
         byte var9 = (byte)((this.registerFont(var1, var7)) ? 1 : 0);
         if (var9 != (1991691930 ^ var17)) {
            var17 ^= 1438467781;
            byte var10 = (byte)(587958366 ^ var17);
            var17 ^= 840132208;
            return (var10 != 0);
         }
      } catch (IOException var19) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var17)) {
            case -1246333741:
               var17 = 54338423 ^ var17;
               return (((byte)(1972104685 ^ var17)) != 0);
            case 408699641:
               var17 = 1451255218 ^ var17;
               return (((byte)(1972104685 ^ var17)) != 0);
            default:
               throw new RuntimeException(new IllegalAccessException("Error in hash"));
         }
      }

      label42:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var17)) {
            case 100812540:
               var17 ^= 522583223;
               break label42;
            case 322785921:
            default:
               throw new RuntimeException(new IOException());
            case 1268761671:
               break label42;
            case 2082831816:
         }
      }

      try {
         byte var13 = (byte)(1771254317 ^ var17);
         var17 ^= 149390216;
         return (var13 != 0);
      } catch (Throwable var18) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var17)) {
            case 1285132651:
               var17 = 471392192 ^ var17;
               return (((byte)(1972104685 ^ var17)) != 0);
            default:
               throw new RuntimeException(new IllegalAccessException("Error in hash"));
         }
      }
   }

   private boolean registerFont(String var1, byte[] var2) {
      int var41 = 1495219904 ^ 464010717 ^ 238467803;
      var41 = 282718927 ^ var41;
      if (var1 != null) {
         var41 = 665513367 ^ var41;
         byte var11 = (byte)((var1.isBlank()) ? 1 : 0);
         if (var11 == (2079499934 ^ var41)) {
            var41 = 1388987605 ^ var41;
            if (var2 != null) {
               var41 = 2107042022 ^ var41;
               int var14 = var2.length;
               if (var14 != (1420692141 ^ var41)) {
                  var41 = zrerigsvavnelhwc(var41, 669785747);
                  int var16 = var2.length;
                  ByteBuffer var17 = MemoryUtil.memAlloc(var16);
                  ByteBuffer var19 = var17.put(var2);
                  ByteBuffer var20 = var19.flip();
                  long var22 = this.ctx;
                  byte var7 = (byte)(1933710398 ^ var41);
                  int var24 = NanoVG.nvgCreateFontMem(var22, var1, var17, (var7 != 0));
                  byte var36 = (byte)(-1933710399 ^ var41);
                  if (var24 == var36) {
                     var41 = 877730085 ^ var41;
                     MemoryUtil.memFree(var17);
                     return (((byte)(1192430875 ^ var41)) != 0);
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                        case 52028781:
                        default:
                           throw new IllegalStateException();
                        case 256930938:
                           var41 ^= 326494953;
                        case 1005424184:
                           List var27 = this.retainedFontData;
                           boolean var28 = var27.add(var17);
                           Set var30 = this.loadedFaces;
                           boolean var31 = var30.add(var1);
                           return (((byte)(1614282454 ^ var41)) != 0);
                        case 1156226675:
                     }
                  }
               }

               var41 = 301914919 ^ var41;
            } else {
               var41 = 1818768321 ^ var41;
            }
         } else {
            var41 = 1050834708 ^ var41;
         }
      } else {
         var41 = zrerigsvavnelhwc(var41, 419994243);
      }

      return (((byte)(1162924426 ^ var41)) != 0);
   }

   private void bindFace() {
      int var22 = 1046299566 ^ 1145623662 ^ 238467803;
      var22 = 1053779656 ^ var22;
      String var1 = com.wimpyclient.o.a.selected();
      Set var7 = this.loadedFaces;
      byte var8 = (byte)((var7.contains(var1)) ? 1 : 0);
      String var16;
      if (var8 != (1256999891 ^ var22)) {
         var22 = 752799891 ^ var22;
         var16 = var1;
         var22 = 1975480044 ^ var22;
      } else {
         var22 = 445358959 ^ var22;
         var16 = this.fallbackFace;
         var22 = 1139416336 ^ var22;
      }

      String var18 = this.boundFace;
      byte var10 = (byte)((var16.equals(var18)) ? 1 : 0);
      if (var10 != (328070572 ^ var22)) {
         var22 = 818234536 ^ var22;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
               case 98769008:
                  var22 = 1004491294 ^ var22;
               case 2142242057:
                  long var12 = this.ctx;
                  NanoVG.nvgFontFace(var12, var16);
                  this.boundFace = var16;
                  return;
               case 218991765:
                  break;
               case 869008214:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   public void beginFrame(float var1, float var2, float var3) {
      int var18 = 1009936605 ^ 2135884066 ^ 238467803;
      var18 = 837243660 ^ var18;
      ArrayDeque var9 = this.alphaStack;
      var9.clear();
      float var5 = 1.0F;
      this.appliedAlpha = var5;
      Object var15 = null;
      this.boundFace = (String)var15;
      long var13 = this.ctx;
      NanoVG.nvgBeginFrame(var13, var1, var2, var3);
   }

   public void endFrame() {
      int var5 = 697539241 ^ 35716560 ^ 238467803;
      var5 = 130985624 ^ var5;
      long var2 = this.ctx;
      NanoVG.nvgEndFrame(var2);
   }

   public void save() {
      int var11 = 1586471966 ^ 1976201246 ^ 238467803;
      var11 = 1662392971 ^ var11;
      ArrayDeque var3 = this.alphaStack;
      float var7 = this.appliedAlpha;
      Float var8 = var7;
      var3.push(var8);
      long var5 = this.ctx;
      NanoVG.nvgSave(var5);
   }

   public void restore() {
      int var17 = 646989692 ^ 1788812930 ^ 238467803;
      var17 = 889759720 ^ var17;
      ArrayDeque var3 = this.alphaStack;
      byte var4 = (byte)((var3.isEmpty()) ? 1 : 0);
      if (var4 == (1999717581 ^ var17)) {
         var17 = 102155735 ^ var17;
         ArrayDeque var10 = this.alphaStack;
         Object var11 = var10.pop();
         Float var12 = (Float)var11;
         float var13 = var12;
         this.appliedAlpha = var13;
         var17 = 723161567 ^ var17;
      } else {
         label16:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var17)) {
               case 116327036:
                  var17 = 755782664 ^ var17;
                  break label16;
               case 238081386:
               default:
                  throw new RuntimeException();
               case 295745811:
                  break;
               case 658548679:
                  break label16;
            }
         }
      }

      long var7 = this.ctx;
      NanoVG.nvgRestore(var7);
      Object var14 = null;
      this.boundFace = (String)var14;
   }

   public void scale(float var1) {
      int var8 = 669087164 ^ 1236253384 ^ 238467803;
      var8 = 523938537 ^ var8;
      long var5 = this.ctx;
      NanoVG.nvgScale(var5, var1, var1);
   }

   public void scale(float var1, float var2) {
      int var9 = 1237728857 ^ 482799026 ^ 238467803;
      var9 = 1757191034 ^ var9;
      long var6 = this.ctx;
      NanoVG.nvgScale(var6, var1, var2);
   }

   public void translate(float var1, float var2) {
      int var9 = 1623051137 ^ 1240116745 ^ 238467803;
      var9 = 369899494 ^ var9;
      long var6 = this.ctx;
      NanoVG.nvgTranslate(var6, var1, var2);
   }

   public void alpha(float var1) {
      int var17 = 113400595 ^ 2128315321 ^ 238467803;
      var17 = 1141603670 ^ var17;
      float var10 = this.appliedAlpha;
      float var5 = 0.0F;
      float var6 = 1.0F;
      float var12 = Math.clamp(var1, var5, var6);
      float var11 = var10 * var12;
      this.appliedAlpha = var11;
      long var8 = this.ctx;
      float var14 = this.appliedAlpha;
      NanoVG.nvgGlobalAlpha(var8, var14);
   }

   public void scissor(float var1, float var2, float var3, float var4) {
      int var13 = 760873640 ^ 1286841304 ^ 238467803;
      var13 = 399664627 ^ var13;
      long var10 = this.ctx;
      NanoVG.nvgScissor(var10, var1, var2, var3, var4);
   }

   public void intersectScissor(float var1, float var2, float var3, float var4) {
      int var13 = 367132311 ^ 1962277336 ^ 238467803;
      var13 = 959766164 ^ var13;
      long var10 = this.ctx;
      NanoVG.nvgIntersectScissor(var10, var1, var2, var3, var4);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void rect(float var1, float var2, float var3, float var4, float var5, int var6) {
      int var52 = 1670574414 ^ 799249784 ^ 238467803;
      var52 = 25055436 ^ var52;
      MemoryStack var7 = MemoryStack.stackPush();
      MemoryStack var14 = var7;
      var52 = 1170103575 ^ var52;

      label116: {
         Throwable var10000;
         label104: {
            label103: {
               label102: {
                  label101: {
                     label100: {
                        label114: {
                           label98: {
                              try {
                                 long var18 = this.ctx;
                                 NanoVG.nvgBeginPath(var18);
                                 float var8 = 0.01F;
                                 float var68;
                                 int var21 = (var68 = var5 - var8) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
                                 if (var21 > (113759030 ^ var52)) {
                                    break label98;
                                 }

                                 var52 ^= 1152068199;
                                 long var40 = this.ctx;
                                 NanoVG.nvgRect(var40, var1, var2, var3, var4);
                              } catch (Throwable var56) {
                                 var10000 = var56;
                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var52)) {
                                    case 325569162:
                                       break label103;
                                    case 843230995:
                                       break label101;
                                    case 910072240:
                                       break label102;
                                    case 1673204218:
                                       break label100;
                                    default:
                                       throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                 }
                              }

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var52)) {
                                    case 11755872:
                                       var52 ^= 236690286;
                                       break label114;
                                    case 943595014:
                                       break;
                                    case 1237042019:
                                    default:
                                       throw new IllegalStateException();
                                    case 1816223758:
                                       break label114;
                                 }
                              }
                           }

                           var52 ^= 1620018900;

                           try {
                              long var23 = this.ctx;
                              NanoVG.nvgRoundedRect(var23, var1, var2, var3, var4, var5);
                              var52 ^= 708786141;
                           } catch (Throwable var55) {
                              var10000 = var55;
                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var52)) {
                                 case 325569162:
                                    break label103;
                                 case 843230995:
                                    break label101;
                                 case 910072240:
                                    break label102;
                                 case 1673204218:
                                    break label100;
                                 default:
                                    throw new RuntimeException(new IllegalAccessException("Error in hash"));
                              }
                           }
                        }

                        try {
                           long var26 = this.ctx;
                           NVGColor var44 = color(var14, var6);
                           NanoVG.nvgFillColor(var26, var44);
                           long var29 = this.ctx;
                           NanoVG.nvgFill(var29);
                           var52 ^= 1709626345;
                           break label116;
                        } catch (Throwable var54) {
                           var10000 = var54;
                           switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var52)) {
                              case 325569162:
                                 break label103;
                              case 843230995:
                                 break label101;
                              case 910072240:
                                 break label102;
                              case 1673204218:
                                 break;
                              default:
                                 throw new RuntimeException(new IllegalAccessException("Error in hash"));
                           }
                        }
                     }

                     var52 = 233267104 ^ var52;
                     break label104;
                  }

                  var52 = 668493949 ^ var52;
                  break label104;
               }

               var52 = zrerigsvavnelhwc(var52, 1196945065);
               break label104;
            }

            var52 = 66897102 ^ var52;
         }

         Throwable var33 = var10000;
         if (var7 != null) {
            var52 = 2064855805 ^ var52;

            try {
               var14.close();
               var52 ^= 1515712658;
            } catch (Throwable var53) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var52)) {
                  case -736593135:
                     var52 = zrerigsvavnelhwc(var52, 635688333);
                     var33.addSuppressed(var53);
                     var52 = 735477381 ^ var52;
                     throw new RuntimeException(var33);
                  default:
                     throw new RuntimeException(new IllegalAccessException("Error in hash"));
               }
            }

            var52 = 1415732122 ^ var52;
         } else {
            var52 = zrerigsvavnelhwc(var52, 1965464053);
         }

         throw new RuntimeException(var33);
      }

      if (var7 != null) {
         var52 = 1281959412 ^ var52;
         var7.close();
         var52 = 750096259 ^ var52;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var52)) {
               case 9068831:
                  var52 = 1625074295 ^ var52;
                  return;
               case 1360970651:
                  return;
               case 1574335320:
               default:
                  throw new IllegalStateException();
               case 1769816349:
            }
         }
      }
   }

   public void rectSharp(float var1, float var2, float var3, float var4, int var5) {
      int var23 = 702600751 ^ 691362618 ^ 238467803;
      var23 = 1358220180 ^ var23;
      long var13 = this.ctx;
      byte var8 = (byte)(1578630234 ^ var23);
      NanoVG.nvgShapeAntiAlias(var13, (var8 != 0));
      float var11 = 0.0F;
      this.rect(var1, var2, var3, var4, var11, var5);
      long var17 = this.ctx;
      byte var20 = (byte)(1578630235 ^ var23);
      NanoVG.nvgShapeAntiAlias(var17, (var20 != 0));
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void rectGradient(float var1, float var2, float var3, float var4, float var5, int var6, int var7, boolean var8) {
      int var70 = 513990582 ^ 187672210 ^ 238467803;
      var70 = 216569601 ^ var70;
      MemoryStack var9 = MemoryStack.stackPush();
      MemoryStack var18 = var9;
      var70 = 9939547 ^ var70;

      label181: {
         Throwable var10000;
         label168: {
            label167: {
               label166: {
                  label165: {
                     label164: {
                        label163: {
                           label162: {
                              label177: {
                                 NVGPaint var19;
                                 float var26;
                                 label160: {
                                    label178: {
                                       try {
                                          NVGPaint var23 = NVGPaint.malloc(var18);
                                          var19 = var23;
                                          if (var8 != ((398786213 ^ var70) != 0)) {
                                             var70 ^= 1873622085;
                                             var26 = var1;
                                             break label178;
                                          }
                                       } catch (Throwable var76) {
                                          var10000 = var76;
                                          switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var70)) {
                                             case -1104677592:
                                                break label165;
                                             case -1018276093:
                                                break label162;
                                             case -741713232:
                                                break label164;
                                             case -298802207:
                                                break label163;
                                             case -153294934:
                                                break label167;
                                             case -121642685:
                                                break label166;
                                             case 308515882:
                                                break label177;
                                             default:
                                                throw new RuntimeException(new IOException("Error in hash"));
                                          }
                                       }

                                       label152:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                                             case 235780763:
                                                var70 ^= 1226793552;
                                                break label152;
                                             case 466760391:
                                                break;
                                             case 490664910:
                                                break label152;
                                             case 977377694:
                                             default:
                                                throw new IllegalStateException();
                                          }
                                       }

                                       try {
                                          var26 = var1 + var3;
                                          var70 ^= 1151522723;
                                          break label160;
                                       } catch (Throwable var75) {
                                          var10000 = var75;
                                          switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var70)) {
                                             case -1104677592:
                                                break label165;
                                             case -1018276093:
                                                break label162;
                                             case -741713232:
                                                break label164;
                                             case -298802207:
                                                break label163;
                                             case -153294934:
                                                break label167;
                                             case -121642685:
                                                break label166;
                                             case 308515882:
                                                break label177;
                                             default:
                                                throw new RuntimeException(new IOException("Error in hash"));
                                          }
                                       }
                                    }

                                    label146:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                                          case 156008827:
                                             var70 ^= 1645248950;
                                             break label146;
                                          case 205328266:
                                          default:
                                             throw new IllegalStateException();
                                          case 299815560:
                                             break;
                                          case 1240940916:
                                             break label146;
                                       }
                                    }
                                 }

                                 float var20;
                                 float var53;
                                 label179: {
                                    label135: {
                                       try {
                                          var20 = var26;
                                          if (var8 == ((444156758 ^ var70) != 0)) {
                                             break label135;
                                          }

                                          var70 ^= 666853162;
                                          var53 = var2 + var4;
                                       } catch (Throwable var74) {
                                          var10000 = var74;
                                          switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var70)) {
                                             case -1104677592:
                                                break label165;
                                             case -1018276093:
                                                break label162;
                                             case -741713232:
                                                break label164;
                                             case -298802207:
                                                break label163;
                                             case -153294934:
                                                break label167;
                                             case -121642685:
                                                break label166;
                                             case 308515882:
                                                break label177;
                                             default:
                                                throw new RuntimeException(new IOException("Error in hash"));
                                          }
                                       }

                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                                             case 128973430:
                                                var70 ^= 2139776761;
                                                break label179;
                                             case 907493389:
                                             default:
                                                throw new IllegalStateException();
                                             case 1027713125:
                                                break label179;
                                             case 1097749630:
                                          }
                                       }
                                    }

                                    var70 ^= 1701754750;

                                    try {
                                       var53 = var2;
                                       var70 ^= 1029410477;
                                    } catch (Throwable var73) {
                                       var10000 = var73;
                                       switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var70)) {
                                          case -1104677592:
                                             break label165;
                                          case -1018276093:
                                             break label162;
                                          case -741713232:
                                             break label164;
                                          case -298802207:
                                             break label163;
                                          case -153294934:
                                             break label167;
                                          case -121642685:
                                             break label166;
                                          case 308515882:
                                             break label177;
                                          default:
                                             throw new RuntimeException(new IOException("Error in hash"));
                                       }
                                    }
                                 }

                                 try {
                                    long var29 = this.ctx;
                                    NVGColor var61 = color(var18, var6);
                                    NVGColor var64 = color(var18, var7);
                                    NVGPaint var31 = NanoVG.nvgLinearGradient(var29, var1, var2, var20, var53, var61, var64, var19);
                                    long var33 = this.ctx;
                                    NanoVG.nvgBeginPath(var33);
                                    long var36 = this.ctx;
                                    NanoVG.nvgRoundedRect(var36, var1, var2, var3, var4, var5);
                                    long var39 = this.ctx;
                                    NanoVG.nvgFillPaint(var39, var19);
                                    long var42 = this.ctx;
                                    NanoVG.nvgFill(var42);
                                    var70 ^= 2102438108;
                                    break label181;
                                 } catch (Throwable var72) {
                                    var10000 = var72;
                                    switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var70)) {
                                       case -1104677592:
                                          break label165;
                                       case -1018276093:
                                          break label162;
                                       case -741713232:
                                          break label164;
                                       case -298802207:
                                          break label163;
                                       case -153294934:
                                          break label167;
                                       case -121642685:
                                          break label166;
                                       case 308515882:
                                          break;
                                       default:
                                          throw new RuntimeException(new IOException("Error in hash"));
                                    }
                                 }
                              }

                              var70 = zrerigsvavnelhwc(var70, 701818251);
                              break label168;
                           }

                           var70 = zrerigsvavnelhwc(var70, 334585326);
                           break label168;
                        }

                        var70 = 1449034610 ^ var70;
                        break label168;
                     }

                     var70 = zrerigsvavnelhwc(var70, 1910627416);
                     break label168;
                  }

                  var70 = 2086431147 ^ var70;
                  break label168;
               }

               var70 = 344943398 ^ var70;
               break label168;
            }

            var70 = 893586427 ^ var70;
         }

         Throwable var46 = var10000;
         if (var9 != null) {
            var70 = 1579406100 ^ var70;

            try {
               var18.close();
               var70 ^= 1407789299;
            } catch (Throwable var71) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var70)) {
                  case -1378213679:
                     var70 = zrerigsvavnelhwc(var70, 456152529);
                     var46.addSuppressed(var71);
                     var70 = 961363340 ^ var70;
                     throw new RuntimeException(var46);
                  default:
                     throw new RuntimeException(new IOException("Error in hash"));
               }
            }

            var70 = zrerigsvavnelhwc(var70, 1905541294);
         } else {
            var70 = zrerigsvavnelhwc(var70, 2086583113);
         }

         throw new RuntimeException(var46);
      }

      if (var9 != null) {
         var70 = 2094523937 ^ var70;
         var9.close();
         var70 = 782703237 ^ var70;
      } else {
         var70 = 1383136420 ^ var70;
      }
   }

   public void rectOutline(float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      int var18 = 1845209885 ^ 863858440 ^ 238467803;
      var18 = 2028662919 ^ var18;
      this.strokeRect(var1, var2, var3, var4, var5, var6, var7);
   }

   public void strokeRect(float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      int var59 = 1885383150 ^ 946881281 ^ 238467803;
      var59 = 1468133391 ^ var59;
      MemoryStack var8 = MemoryStack.stackPush();
      MemoryStack var15 = var8;
      var59 = 923336136 ^ var59;

      try {
         long var19 = this.ctx;
         NanoVG.nvgBeginPath(var19);
         long var22 = this.ctx;
         float var12 = 2.0F;
         float var45 = var6 / var12;
         float var41 = var1 + var45;
         float var13 = 2.0F;
         float var50 = var6 / var13;
         float var47 = var2 + var50;
         float var52 = var3 - var6;
         float var55 = var4 - var6;
         NanoVG.nvgRoundedRect(var22, var41, var47, var52, var55, var5);
         long var25 = this.ctx;
         NVGColor var43 = color(var15, var7);
         NanoVG.nvgStrokeColor(var25, var43);
         long var28 = this.ctx;
         NanoVG.nvgStrokeWidth(var28, var6);
         long var31 = this.ctx;
         NanoVG.nvgStroke(var31);
         var59 ^= 2132092688;
      } catch (Throwable var61) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var59)) {
            case 897249177:
               var59 = 1775736975 ^ var59;
               if (var8 != null) {
                  var59 = 2069691356 ^ var59;

                  try {
                     var15.close();
                     var59 ^= 641738254;
                  } catch (Throwable var60) {
                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var59)) {
                        case -1591610111:
                           var59 = zrerigsvavnelhwc(var59, 550958149);
                           var61.addSuppressed(var60);
                           var59 = 13038124 ^ var59;
                           throw new RuntimeException(var61);
                        default:
                           throw new RuntimeException(new IOException("Error in hash"));
                     }
                  }

                  var59 = zrerigsvavnelhwc(var59, 105914471);
                  throw new RuntimeException(var61);
               }

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var59)) {
                     case 167358936:
                        var59 = 1531772341 ^ var59;
                        throw new RuntimeException(var61);
                     case 384530895:
                        break;
                     case 1036720193:
                        throw new RuntimeException(var61);
                     case 2072471364:
                     default:
                        throw new RuntimeException();
                  }
               }
            default:
               throw new RuntimeException(new IllegalAccessException("Error in hash"));
         }
      }

      if (var8 != null) {
         var59 = 1230633013 ^ var59;
         var8.close();

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var59)) {
               case 12115357:
                  var59 = 856863169 ^ var59;
                  return;
               case 431632421:
               default:
                  throw new RuntimeException();
               case 479801525:
                  return;
               case 740956436:
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var59)) {
               case 232331181:
                  var59 = 2051754484 ^ var59;
                  return;
               case 989450976:
                  return;
               case 1366736932:
                  break;
               case 1926444686:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   public void glow(float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      int var79 = 533214000 ^ 1052569392 ^ 238467803;
      var79 = 86544842 ^ var79;
      MemoryStack var8 = MemoryStack.stackPush();
      MemoryStack var20 = var8;
      var79 = 893210238 ^ var79;

      try {
         NVGPaint var24 = NVGPaint.malloc(var20);
         long var26 = this.ctx;
         float var16 = 2.0F;
         float var67 = var6 * var16;
         NVGColor var71 = color(var20, var7);
         float var19 = 0.0F;
         int var74 = g.withAlpha(var7, var19);
         NVGColor var73 = color(var20, var74);
         NVGPaint var28 = NanoVG.nvgBoxGradient(var26, var1, var2, var3, var4, var5, var67, var71, var73, var24);
         long var30 = this.ctx;
         NanoVG.nvgBeginPath(var30);
         long var33 = this.ctx;
         float var50 = var1 - var6;
         float var54 = var2 - var6;
         float var62 = 2.0F;
         float var59 = var6 * var62;
         float var57 = var3 + var59;
         float var68 = 2.0F;
         float var64 = var6 * var68;
         float var61 = var4 + var64;
         float var66 = var5 + var6;
         NanoVG.nvgRoundedRect(var33, var50, var54, var57, var61, var66);
         long var36 = this.ctx;
         NanoVG.nvgFillPaint(var36, var24);
         long var39 = this.ctx;
         NanoVG.nvgFill(var39);
         var79 ^= 1275948989;
      } catch (Throwable var81) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var79)) {
            case -88224904:
               var79 = 1439940908 ^ var79;
               if (var8 != null) {
                  var79 = 1927152385 ^ var79;

                  try {
                     var20.close();
                     var79 ^= 712010584;
                  } catch (Throwable var80) {
                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var79)) {
                        case -1026303471:
                           var79 = zrerigsvavnelhwc(var79, 2129853175);
                           var81.addSuppressed(var80);
                           var79 = 1947978776 ^ var79;
                           throw new RuntimeException(var81);
                        default:
                           throw new RuntimeException(new IllegalAccessException("Error in hash"));
                     }
                  }

                  var79 = zrerigsvavnelhwc(var79, 546921911);
               } else {
                  var79 = zrerigsvavnelhwc(var79, 2016884206);
               }

               throw new RuntimeException(var81);
            default:
               throw new RuntimeException("Error in hash");
         }
      }

      if (var8 != null) {
         var79 = 240611887 ^ var79;
         var8.close();
         var79 = 116365799 ^ var79;
      } else {
         var79 = 146336712 ^ var79;
      }
   }

   public void circle(float var1, float var2, float var3, int var4) {
      int var38 = 2097857460 ^ 426859828 ^ 238467803;
      var38 = 43377180 ^ var38;
      MemoryStack var5 = MemoryStack.stackPush();
      MemoryStack var10 = var5;
      var38 = 1138833408 ^ var38;

      try {
         long var14 = this.ctx;
         NanoVG.nvgBeginPath(var14);
         long var17 = this.ctx;
         NanoVG.nvgCircle(var17, var1, var2, var3);
         long var20 = this.ctx;
         NVGColor var34 = color(var10, var4);
         NanoVG.nvgFillColor(var20, var34);
         long var23 = this.ctx;
         NanoVG.nvgFill(var23);
         var38 ^= 1382963298;
      } catch (Throwable var40) {
         switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var38)) {
            case 1506800185:
               var38 = zrerigsvavnelhwc(var38, 1349695575);
               if (var5 != null) {
                  var38 = 1541357142 ^ var38;

                  try {
                     var10.close();
                     var38 ^= 412583855;
                  } catch (Throwable var39) {
                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var38)) {
                        case 77840945:
                           var38 = 892512107 ^ var38;
                           var40.addSuppressed(var39);
                           var38 = 129578917 ^ var38;
                           throw new RuntimeException(var40);
                        default:
                           throw new RuntimeException(new IOException("Error in hash"));
                     }
                  }

                  var38 = 706484065 ^ var38;
               } else {
                  var38 = 1767157400 ^ var38;
               }

               throw new RuntimeException(var40);
            default:
               throw new RuntimeException("Error in hash");
         }
      }

      if (var5 == null) {
         var38 = zrerigsvavnelhwc(var38, 94786028);
      } else {
         var38 = 829203293 ^ var38;
         var5.close();

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var38)) {
               case 200413859:
                  var38 = 885715633 ^ var38;
                  return;
               case 213172840:
               default:
                  throw new RuntimeException(new IOException());
               case 1599813255:
                  return;
               case 2044680256:
            }
         }
      }
   }

   public void radial(float var1, float var2, float var3, int var4, int var5) {
      int var58 = 741226024 ^ 259069727 ^ 238467803;
      var58 = 1838950022 ^ var58;
      float var7 = 0.5F;
      float var73;
      int var18 = (var73 = var3 - var7) == 0.0F ? 0 : (var73 < 0.0F ? -1 : 1);
      if (var18 <= (1089846634 ^ var58)) {
         var58 = 1804133487 ^ var58;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var58)) {
               case 86669083:
                  break;
               case 232545800:
                  var58 ^= 247352224;
               case 898280909:
                  MemoryStack var19 = MemoryStack.stackPush();
                  MemoryStack var15 = var19;
                  var58 = 922022684 ^ var58;

                  try {
                     NVGPaint var21 = NVGPaint.malloc(var15);
                     long var23 = this.ctx;
                     float var10 = 0.0F;
                     NVGColor var51 = color(var15, var4);
                     NVGColor var53 = color(var15, var5);
                     NVGPaint var25 = NanoVG.nvgRadialGradient(var23, var1, var2, var10, var3, var51, var53, var21);
                     long var27 = this.ctx;
                     NanoVG.nvgBeginPath(var27);
                     long var30 = this.ctx;
                     NanoVG.nvgCircle(var30, var1, var2, var3);
                     long var33 = this.ctx;
                     NanoVG.nvgFillPaint(var33, var21);
                     long var36 = this.ctx;
                     NanoVG.nvgFill(var36);
                     var58 ^= 1538360469;
                  } catch (Throwable var60) {
                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var58)) {
                        case -973590861:
                           var58 = 51316119 ^ var58;
                           if (var19 != null) {
                              var58 = 843576326 ^ var58;

                              try {
                                 var15.close();
                                 var58 ^= 1843193190;
                              } catch (Throwable var59) {
                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var58)) {
                                    case 1337958970:
                                       var58 = 1035723908 ^ var58;
                                       var60.addSuppressed(var59);
                                       var58 = 158949592 ^ var58;
                                       throw new RuntimeException(var60);
                                    default:
                                       throw new RuntimeException("Error in hash");
                                 }
                              }

                              var58 = 1495163194 ^ var58;
                              throw new RuntimeException(var60);
                           }

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var58)) {
                                 case 262503373:
                                    var58 = 109408346 ^ var58;
                                    throw new RuntimeException(var60);
                                 case 1210617211:
                                 default:
                                    throw new IllegalStateException();
                                 case 1344787137:
                                    throw new RuntimeException(var60);
                                 case 1780706427:
                              }
                           }
                        default:
                           throw new RuntimeException(new IllegalAccessException("Error in hash"));
                     }
                  }

                  if (var19 != null) {
                     var58 = 1989362599 ^ var58;
                     var19.close();

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var58)) {
                           case 98696196:
                              var58 = 1824352835 ^ var58;
                              return;
                           case 1214546215:
                              break;
                           case 1660334905:
                           default:
                              throw new IllegalStateException();
                           case 1908890393:
                              return;
                        }
                     }
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var58)) {
                        case 65812863:
                           var58 = 439232996 ^ var58;
                           return;
                        case 361217058:
                           break;
                        case 1395091544:
                        default:
                           throw new IllegalStateException();
                        case 1881224113:
                           return;
                     }
                  }
               case 1368460747:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void circleOutline(float var1, float var2, float var3, float var4, int var5) {
      int var70 = 1475435005 ^ 591453940 ^ 238467803;
      var70 = 42669802 ^ var70;
      MemoryStack var6 = MemoryStack.stackPush();
      MemoryStack var11 = var6;
      var70 = 1488682831 ^ var70;

      label94: {
         Throwable var10000;
         label83: {
            label82: {
               label81: {
                  label80: {
                     label79: {
                        try {
                           byte var14 = (byte)((j.enabled()) ? 1 : 0);
                           if (var14 != (548885623 ^ var70)) {
                              var70 ^= 399972721;
                              long var16 = this.ctx;
                              NanoVG.nvgBeginPath(var16);
                              long var19 = this.ctx;
                              NanoVG.nvgCircle(var19, var1, var2, var3);
                              long var22 = this.ctx;
                              float var66 = 0.32F;
                              int var62 = j.soft(var5, var66);
                              NVGColor var54 = color(var11, var62);
                              NanoVG.nvgStrokeColor(var22, var54);
                              long var25 = this.ctx;
                              float var63 = 2.8F;
                              float var56 = var4 + var63;
                              NanoVG.nvgStrokeWidth(var25, var56);
                              long var28 = this.ctx;
                              NanoVG.nvgStroke(var28);
                              var70 ^= 21731058;
                              break label79;
                           }
                        } catch (Throwable var73) {
                           var10000 = var73;
                           switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var70)) {
                              case -1319182431:
                                 break label80;
                              case -1157470159:
                                 break label81;
                              case 96117689:
                                 break label82;
                              default:
                                 throw new RuntimeException(new IllegalAccessException("Error in hash"));
                           }
                        }

                        var70 = zrerigsvavnelhwc(var70, 379359107);
                     }

                     try {
                        long var31 = this.ctx;
                        NanoVG.nvgBeginPath(var31);
                        long var34 = this.ctx;
                        NanoVG.nvgCircle(var34, var1, var2, var3);
                        long var37 = this.ctx;
                        NVGColor var59 = color(var11, var5);
                        NanoVG.nvgStrokeColor(var37, var59);
                        long var40 = this.ctx;
                        NanoVG.nvgStrokeWidth(var40, var4);
                        long var43 = this.ctx;
                        NanoVG.nvgStroke(var43);
                        var70 ^= 446126992;
                        break label94;
                     } catch (Throwable var72) {
                        var10000 = var72;
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var70)) {
                           case -1319182431:
                              break;
                           case -1157470159:
                              break label81;
                           case 96117689:
                              break label82;
                           default:
                              throw new RuntimeException(new IllegalAccessException("Error in hash"));
                        }
                     }
                  }

                  var70 = 743713269 ^ var70;
                  break label83;
               }

               var70 = zrerigsvavnelhwc(var70, 757055239);
               break label83;
            }

            var70 = 986228342 ^ var70;
         }

         Throwable var47 = var10000;
         if (var6 == null) {
            var70 = zrerigsvavnelhwc(var70, 2055808977);
            throw new RuntimeException(var47);
         } else {
            var70 = 1178353437 ^ var70;

            try {
               var11.close();
               var70 ^= 590925129;
            } catch (Throwable var71) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var70)) {
                  case -501323550:
                     var70 = zrerigsvavnelhwc(var70, 1991198982);
                     var47.addSuppressed(var71);
                     var70 = 1243238858 ^ var70;
                     throw new RuntimeException(var47);
                  default:
                     throw new RuntimeException("Error in hash");
               }
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                  case 40888155:
                     throw new RuntimeException(var47);
                  case 87029493:
                     break;
                  case 117321695:
                     var70 = 529388933 ^ var70;
                     throw new RuntimeException(var47);
                  case 1293070981:
                  default:
                     throw new IllegalStateException();
               }
            }
         }
      }

      if (var6 != null) {
         var70 = 779864946 ^ var70;
         var6.close();
         var70 = zrerigsvavnelhwc(var70, 1803585724);
      } else {
         var70 = 1174094798 ^ var70;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void line(float var1, float var2, float var3, float var4, float var5, int var6) {
      int var79 = 1582407787 ^ 691216014 ^ 238467803;
      var79 = 1287712620 ^ var79;
      MemoryStack var7 = MemoryStack.stackPush();
      MemoryStack var12 = var7;
      var79 = 696910010 ^ var79;

      label107: {
         Throwable var10000;
         label98: {
            label97: {
               label96: {
                  label95: {
                     label94: {
                        try {
                           byte var15 = (byte)((j.enabled()) ? 1 : 0);
                           if (var15 != (471788520 ^ var79)) {
                              var79 ^= 971984585;
                              long var17 = this.ctx;
                              NanoVG.nvgBeginPath(var17);
                              long var20 = this.ctx;
                              NanoVG.nvgMoveTo(var20, var1, var2);
                              long var23 = this.ctx;
                              NanoVG.nvgLineTo(var23, var3, var4);
                              long var26 = this.ctx;
                              float var11 = 0.3F;
                              int var72 = j.soft(var6, var11);
                              NVGColor var62 = color(var12, var72);
                              NanoVG.nvgStrokeColor(var26, var62);
                              long var29 = this.ctx;
                              float var73 = 3.0F;
                              float var64 = var5 + var73;
                              NanoVG.nvgStrokeWidth(var29, var64);
                              long var32 = this.ctx;
                              NanoVG.nvgStroke(var32);
                              var79 ^= 348583639;
                              break label94;
                           }
                        } catch (Throwable var82) {
                           var10000 = var82;
                           switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var79)) {
                              case -1984258127:
                                 break label96;
                              case -520659136:
                                 break label97;
                              case 797780233:
                                 break label95;
                              default:
                                 throw new RuntimeException(new IllegalAccessException("Error in hash"));
                           }
                        }

                        var79 ^= 757708830;
                     }

                     try {
                        long var35 = this.ctx;
                        NanoVG.nvgBeginPath(var35);
                        long var38 = this.ctx;
                        NanoVG.nvgMoveTo(var38, var1, var2);
                        long var41 = this.ctx;
                        NanoVG.nvgLineTo(var41, var3, var4);
                        long var44 = this.ctx;
                        NVGColor var68 = color(var12, var6);
                        NanoVG.nvgStrokeColor(var44, var68);
                        long var47 = this.ctx;
                        NanoVG.nvgStrokeWidth(var47, var5);
                        long var50 = this.ctx;
                        NanoVG.nvgStroke(var50);
                        var79 ^= 777499525;
                        break label107;
                     } catch (Throwable var81) {
                        var10000 = var81;
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var79)) {
                           case -1984258127:
                              break label96;
                           case -520659136:
                              break label97;
                           case 797780233:
                              break;
                           default:
                              throw new RuntimeException(new IllegalAccessException("Error in hash"));
                        }
                     }
                  }

                  var79 = 1434947072 ^ var79;
                  break label98;
               }

               var79 = 1094809815 ^ var79;
               break label98;
            }

            var79 = 1818804425 ^ var79;
         }

         Throwable var54 = var10000;
         if (var7 != null) {
            var79 = 40822597 ^ var79;

            try {
               var12.close();
               var79 ^= 874038798;
            } catch (Throwable var80) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var79)) {
                  case -1866046685:
                     var79 = 135013906 ^ var79;
                     var54.addSuppressed(var80);
                     var79 = 1765880112 ^ var79;
                     throw new RuntimeException(var54);
                  default:
                     throw new RuntimeException("Error in hash");
               }
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                  case 127947309:
                     var79 = 1431687468 ^ var79;
                     throw new RuntimeException(var54);
                  case 210784968:
                     throw new RuntimeException(var54);
                  case 1109869439:
                  default:
                     throw new IllegalStateException();
                  case 1890127746:
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
                  case 165970937:
                     var79 = 1663299687 ^ var79;
                     throw new RuntimeException(var54);
                  case 1037975572:
                     throw new RuntimeException(var54);
                  case 1972180362:
                     break;
                  case 1988356219:
                  default:
                     throw new IllegalStateException();
               }
            }
         }
      }

      if (var7 != null) {
         var79 = 679202807 ^ var79;
         var7.close();

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var79)) {
               case 180656916:
                  var79 = 1390270913 ^ var79;
                  return;
               case 217032656:
                  break;
               case 1474783876:
                  return;
               case 1485484664:
               default:
                  throw new IllegalStateException();
            }
         }
      } else {
         var79 = 2057705014 ^ var79;
      }
   }

   public float text(float var1, float var2, float var3, int var4, String var5) {
      int var64 = 2144755658 ^ 358756739 ^ 238467803;
      var64 = 588619377 ^ var64;
      byte var16 = (byte)((this.fontLoaded) ? 1 : 0);
      if (var16 != (1201097443 ^ var64)) {
         var64 = 884888321 ^ var64;
         if (var5 != null) {
            var64 = 126636387 ^ var64;
            byte var19 = (byte)((var5.isEmpty()) ? 1 : 0);
            if (var19 == (1956989057 ^ var64)) {
               var64 = 438810776 ^ var64;
               MemoryStack var20 = MemoryStack.stackPush();
               MemoryStack var13 = var20;
               var64 = 311197021 ^ var64;

               float var14;
               try {
                  long var22 = this.ctx;
                  NanoVG.nvgFontSize(var22, var3);
                  this.bindFace();
                  long var26 = this.ctx;
                  byte var52 = (byte)(2081328469 ^ var64);
                  NanoVG.nvgTextAlign(var26, var52);
                  this.paintTextLayers(var13, var1, var2, var3, var4, var5);
                  long var30 = this.ctx;
                  float var54 = 0.0F;
                  NanoVG.nvgFontBlur(var30, var54);
                  long var33 = this.ctx;
                  NVGColor var56 = color(var13, var4);
                  NanoVG.nvgFillColor(var33, var56);
                  long var36 = this.ctx;
                  float var38 = NanoVG.nvgText(var36, var1, var2, var5);
                  float var39 = var38 - var1;
                  var14 = var39;
                  var64 ^= 994598232;
               } catch (Throwable var66) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var64)) {
                     case -529241565:
                        var64 = 827757092 ^ var64;
                        if (var20 != null) {
                           var64 = 474035642 ^ var64;

                           try {
                              var13.close();
                              var64 ^= 484772701;
                           } catch (Throwable var65) {
                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var64)) {
                                 case -2000070958:
                                    var64 = 232866390 ^ var64;
                                    var66.addSuppressed(var65);
                                    var64 = 1407412379 ^ var64;
                                    throw new RuntimeException(var66);
                                 default:
                                    throw new RuntimeException("Error in hash");
                              }
                           }

                           var64 = zrerigsvavnelhwc(var64, 1122443664);
                        } else {
                           var64 = 1111695223 ^ var64;
                        }

                        throw new RuntimeException(var66);
                     default:
                        throw new RuntimeException(new IOException("Error in hash"));
                  }
               }

               if (var20 != null) {
                  var64 = 1595491246 ^ var64;
                  var20.close();
                  var64 = 1054938699 ^ var64;
               } else {
                  var64 = 1643664869 ^ var64;
               }

               return var14;
            }

            var64 = 421978189 ^ var64;
         } else {
            var64 = 514502958 ^ var64;
         }
      } else {
         var64 = 706011695 ^ var64;
      }

      return 0.0F;
   }

   public float textGradient(float var1, float var2, float var3, int var4, int var5, String var6) {
      int var89 = 1021243203 ^ 861817116 ^ 238467803;
      var89 = 1380033994 ^ var89;
      byte var19 = (byte)((this.fontLoaded) ? 1 : 0);
      if (var19 != (1408743758 ^ var89)) {
         var89 = 227607130 ^ var89;
         if (var6 != null) {
            var89 = 989325690 ^ var89;
            byte var22 = (byte)((var6.isEmpty()) ? 1 : 0);
            if (var22 == (1687245422 ^ var89)) {
               var89 = zrerigsvavnelhwc(var89, 2008845327);
               MemoryStack var23 = MemoryStack.stackPush();
               MemoryStack var16 = var23;
               var89 = 1650919013 ^ var89;

               float var18;
               try {
                  this.bindFace();
                  long var26 = this.ctx;
                  NanoVG.nvgFontSize(var26, var3);
                  long var29 = this.ctx;
                  byte var61 = (byte)(1900730389 ^ var89);
                  NanoVG.nvgTextAlign(var29, var61);
                  this.paintTextLayers(var16, var1, var2, var3, var4, var6);
                  NVGPaint var33 = NVGPaint.malloc(var16);
                  long var35 = this.ctx;
                  float var74 = 2.0F;
                  float var71 = var3 / var74;
                  float var68 = var2 - var71;
                  float var14 = 2.0F;
                  float var78 = var3 / var14;
                  float var76 = var2 + var78;
                  NVGColor var80 = color(var16, var4);
                  NVGColor var83 = color(var16, var5);
                  NVGPaint var37 = NanoVG.nvgLinearGradient(var35, var1, var68, var1, var76, var80, var83, var33);
                  long var39 = this.ctx;
                  float var64 = 0.0F;
                  NanoVG.nvgFontBlur(var39, var64);
                  long var42 = this.ctx;
                  NanoVG.nvgFillPaint(var42, var33);
                  long var45 = this.ctx;
                  float var47 = NanoVG.nvgText(var45, var1, var2, var6);
                  float var48 = var47 - var1;
                  var18 = var48;
                  var89 ^= 1724635687;
               } catch (Throwable var91) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var89)) {
                     case -1974026205:
                        var89 = zrerigsvavnelhwc(var89, 728264188);
                        if (var23 == null) {
                           var89 = zrerigsvavnelhwc(var89, 1186666335);
                           throw new RuntimeException(var91);
                        } else {
                           var89 = 2101830433 ^ var89;

                           try {
                              var16.close();
                              var89 ^= 68388411;
                           } catch (Throwable var90) {
                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var89)) {
                                 case 992917193:
                                    var89 = 344221327 ^ var89;
                                    var91.addSuppressed(var90);
                                    var89 = 796398321 ^ var89;
                                    throw new RuntimeException(var91);
                                 default:
                                    throw new RuntimeException("Error in hash");
                              }
                           }

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var89)) {
                                 case 51551770:
                                    break;
                                 case 78979011:
                                    var89 = 1072689733 ^ var89;
                                    throw new RuntimeException(var91);
                                 case 1059346717:
                                 default:
                                    throw new RuntimeException();
                                 case 1534628243:
                                    throw new RuntimeException(var91);
                              }
                           }
                        }
                     default:
                        throw new RuntimeException(new IllegalAccessException("Error in hash"));
                  }
               }

               if (var23 != null) {
                  var89 = 2043337509 ^ var89;
                  var23.close();
                  var89 = 1873129141 ^ var89;
               } else {
                  var89 = 376403344 ^ var89;
               }

               return var18;
            }

            var89 = 1667481161 ^ var89;
         } else {
            var89 = zrerigsvavnelhwc(var89, 1502893875);
         }
      } else {
         var89 = 1409635689 ^ var89;
      }

      return 0.0F;
   }

   public void textGlow(float var1, float var2, float var3, int var4, String var5) {
      int var82 = 308113907 ^ 1046206146 ^ 238467803;
      var82 = 1202866433 ^ var82;
      byte var16 = (byte)((this.fontLoaded) ? 1 : 0);
      if (var16 == (1703040235 ^ var82)) {
         var82 = zrerigsvavnelhwc(var82, 869815487);
      } else {
         var82 = 983857984 ^ var82;
         if (var5 != null) {
            var82 = 1135406732 ^ var82;
            byte var19 = (byte)((var5.isEmpty()) ? 1 : 0);
            if (var19 != (478855463 ^ var82)) {
               var82 = 1255194995 ^ var82;
            } else {
               label65:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var82)) {
                     case 122473137:
                        var82 ^= 141956018;
                        break label65;
                     case 1029757504:
                        break;
                     case 1920020591:
                        break label65;
                     case 1965045509:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }

               MemoryStack var20 = MemoryStack.stackPush();
               MemoryStack var13 = var20;
               var82 = 1796962957 ^ var82;

               try {
                  this.bindFace();
                  long var23 = this.ctx;
                  NanoVG.nvgFontSize(var23, var3);
                  long var26 = this.ctx;
                  byte var58 = (byte)(2145888265 ^ var82);
                  NanoVG.nvgTextAlign(var26, var58);
                  this.paintTextLayers(var13, var1, var2, var3, var4, var5);
                  long var30 = this.ctx;
                  float var60 = 3.5F;
                  float var76 = 0.28F;
                  float var70 = var3 * var76;
                  float var61 = Math.max(var60, var70);
                  NanoVG.nvgFontBlur(var30, var61);
                  long var33 = this.ctx;
                  float var77 = 0.55F;
                  int var72 = j.soft(var4, var77);
                  NVGColor var63 = color(var13, var72);
                  NanoVG.nvgFillColor(var33, var63);
                  long var36 = this.ctx;
                  float var38 = NanoVG.nvgText(var36, var1, var2, var5);
                  long var40 = this.ctx;
                  float var65 = 0.0F;
                  NanoVG.nvgFontBlur(var40, var65);
                  long var43 = this.ctx;
                  NVGColor var67 = color(var13, var4);
                  NanoVG.nvgFillColor(var43, var67);
                  long var46 = this.ctx;
                  float var48 = NanoVG.nvgText(var46, var1, var2, var5);
                  var82 ^= 1335205413;
               } catch (Throwable var84) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var82)) {
                     case -12762941:
                        var82 = zrerigsvavnelhwc(var82, 1615399932);
                        if (var20 != null) {
                           var82 = 1725557001 ^ var82;

                           try {
                              var13.close();
                              var82 ^= 1816984417;
                           } catch (Throwable var83) {
                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var82)) {
                                 case -876980373:
                                    var82 = 294016991 ^ var82;
                                    var84.addSuppressed(var83);
                                    var82 = 1477027451 ^ var82;
                                    throw new RuntimeException(var84);
                                 default:
                                    throw new RuntimeException("Error in hash");
                              }
                           }

                           var82 = zrerigsvavnelhwc(var82, 633539269);
                        } else {
                           var82 = 794171565 ^ var82;
                        }

                        throw new RuntimeException(var84);
                     default:
                        throw new RuntimeException(new IOException("Error in hash"));
                  }
               }

               if (var20 != null) {
                  var82 = 626372838 ^ var82;
                  var20.close();
                  var82 = 1788594073 ^ var82;
               } else {
                  var82 = zrerigsvavnelhwc(var82, 1338931071);
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var82)) {
                  case 140092285:
                     var82 = 159133695 ^ var82;
                     return;
                  case 537335441:
                     break;
                  case 942789196:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1988651826:
                     return;
               }
            }
         }
      }
   }

   public void textCentered(float var1, float var2, float var3, int var4, String var5) {
      int var59 = 184837356 ^ 758501004 ^ 238467803;
      var59 = 328972490 ^ var59;
      byte var16 = (byte)((this.fontLoaded) ? 1 : 0);
      if (var16 != (1000122481 ^ var59)) {
         var59 = 49041343 ^ var59;
         if (var5 == null) {
            var59 = zrerigsvavnelhwc(var59, 1228568087);
         } else {
            var59 = 1548598191 ^ var59;
            byte var19 = (byte)((var5.isEmpty()) ? 1 : 0);
            if (var19 != (1698520161 ^ var59)) {
               var59 = 360172984 ^ var59;
            } else {
               var59 = zrerigsvavnelhwc(var59, 2096671052);
               MemoryStack var20 = MemoryStack.stackPush();
               MemoryStack var13 = var20;
               var59 = 390392550 ^ var59;

               try {
                  long var22 = this.ctx;
                  NanoVG.nvgFontSize(var22, var3);
                  this.bindFace();
                  long var26 = this.ctx;
                  byte var48 = (byte)(243343321 ^ var59);
                  NanoVG.nvgTextAlign(var26, var48);
                  this.paintTextLayers(var13, var1, var2, var3, var4, var5);
                  long var30 = this.ctx;
                  float var50 = 0.0F;
                  NanoVG.nvgFontBlur(var30, var50);
                  long var33 = this.ctx;
                  NVGColor var52 = color(var13, var4);
                  NanoVG.nvgFillColor(var33, var52);
                  long var36 = this.ctx;
                  float var38 = NanoVG.nvgText(var36, var1, var2, var5);
                  var59 ^= 1248612121;
               } catch (Throwable var61) {
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var59)) {
                     case 1946746456:
                        var59 = 1193549866 ^ var59;
                        if (var20 != null) {
                           var59 = 337484842 ^ var59;

                           try {
                              var13.close();
                              var59 ^= 1553916943;
                           } catch (Throwable var60) {
                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var59)) {
                                 case -305848742:
                                    var59 = 239070834 ^ var59;
                                    var61.addSuppressed(var60);
                                    var59 = 475025118 ^ var59;
                                    throw new RuntimeException(var61);
                                 default:
                                    throw new RuntimeException("Error in hash");
                              }
                           }

                           var59 = 1324434595 ^ var59;
                        } else {
                           var59 = 108149894 ^ var59;
                        }

                        throw new RuntimeException(var61);
                     default:
                        throw new RuntimeException(new IOException("Error in hash"));
                  }
               }

               if (var20 == null) {
                  var59 = zrerigsvavnelhwc(var59, 927262727);
               } else {
                  var59 = 989637364 ^ var59;
                  var20.close();

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var59)) {
                        case 71477944:
                           var59 = 230179571 ^ var59;
                           return;
                        case 704710461:
                           break;
                        case 1290894406:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1618373776:
                           return;
                     }
                  }
               }
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var59)) {
               case 58703302:
                  var59 = 1272330664 ^ var59;
                  return;
               case 768524911:
               default:
                  throw new RuntimeException(new IOException());
               case 1201806108:
                  return;
               case 1919617439:
            }
         }
      }
   }

   private void paintTextLayers(MemoryStack var1, float var2, float var3, float var4, int var5, String var6) {
      int var31 = 1636118021 ^ 870886265 ^ 238467803;
      var31 = 547712458 ^ var31;
      byte var7 = (byte)((j.enabled()) ? 1 : 0);
      if (var7 == (2097042029 ^ var31)) {
         var31 = 574958516 ^ var31;
      } else {
         var31 = 271513901 ^ var31;
         long var12 = this.ctx;
         float var8 = 1.1F;
         NanoVG.nvgFontBlur(var12, var8);
         long var15 = this.ctx;
         int var9 = j.shadow();
         NVGColor var22 = color(var1, var9);
         NanoVG.nvgFillColor(var15, var22);
         long var18 = this.ctx;
         float var25 = 0.6F;
         float var24 = var2 + var25;
         float var10 = 0.9F;
         float var27 = var3 + var10;
         float var20 = NanoVG.nvgText(var18, var24, var27, var6);
      }
   }

   public float textWidth(float var1, String var2) {
      int var34 = 545843129 ^ 2042332773 ^ 238467803;
      var34 = 815946642 ^ var34;
      byte var9 = (byte)((this.fontLoaded) ? 1 : 0);
      if (var9 != (1739030677 ^ var34)) {
         var34 = 667274565 ^ var34;
         if (var2 == null) {
            var34 = 2061832394 ^ var34;
            return 0.0F;
         } else {
            var34 = 369795205 ^ var34;
            byte var12 = (byte)((var2.isEmpty()) ? 1 : 0);
            if (var12 != (1449717077 ^ var34)) {
               var34 = 1827647567 ^ var34;
               return 0.0F;
            } else {
               label26:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
                     case 85373218:
                     default:
                        throw new IllegalStateException();
                     case 124460476:
                        var34 ^= 1443334154;
                     case 1501312715:
                        break label26;
                     case 1811981292:
                  }
               }

               long var14 = this.ctx;
               NanoVG.nvgFontSize(var14, var1);
               this.bindFace();
               long var18 = this.ctx;
               float var29 = 0.0F;
               float var6 = 0.0F;
               float[] var31 = this.textBounds;
               float var20 = NanoVG.nvgTextBounds(var18, var29, var6, var2, var31);
               float[] var22 = this.textBounds;
               byte var4 = (byte)(7300445 ^ var34);
               float var23 = var22[var4];
               float[] var27 = this.textBounds;
               byte var30 = (byte)(7300447 ^ var34);
               float var28 = var27[var30];
               return var23 - var28;
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
               case 148172423:
                  var34 = 1562434959 ^ var34;
                  return 0.0F;
               case 613286925:
                  break;
               case 760957650:
                  return 0.0F;
               case 1047061651:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   public String ellipsize(float var1, String var2, float var3) {
      int var106 = 1115451037 ^ 1667807489 ^ 238467803;
      var106 = 660992588 ^ var106;
      if (var2 != null) {
         var106 = 878692090 ^ var106;
         byte var15 = (byte)((var2.isEmpty()) ? 1 : 0);
         if (var15 == (1008228849 ^ var106)) {
            String var22;
            int var101;
            label144:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                  case 74388058:
                     var106 ^= 912324866;
                  case 360119022:
                     float var5 = 0.0F;
                     float var125;
                     int var18 = (var125 = var3 - var5) == 0.0F ? 0 : (var125 < 0.0F ? -1 : 1);
                     if (var18 <= (175677683 ^ var106)) {
                        var106 = 1133469785 ^ var106;
                        return vrlpgbjthj(yppwspmkxthimrg(), var106);
                     }

                     var106 = 61047368 ^ var106;
                     float var20 = this.textWidth(var1, var2);
                     float var126;
                     int var21 = (var126 = var20 - var3) == 0.0F ? 0 : (var126 < 0.0F ? -1 : 1);
                     if (var21 <= (165356219 ^ var106)) {
                        var106 = 2094579674 ^ var106;
                        return var2;
                     }

                     label141:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                           case 51944081:
                              var106 ^= 1111953364;
                              break label141;
                           case 117695925:
                           default:
                              throw new IllegalStateException();
                           case 830362036:
                              break label141;
                           case 1473913591:
                        }
                     }

                     var22 = vrlpgbjthj(titflbfgupbkhff(), var106);
                     float var24 = this.textWidth(var1, var22);
                     float var10 = var24;
                     float var127;
                     int var26 = (var127 = var3 - var24) == 0.0F ? 0 : (var127 < 0.0F ? -1 : 1);
                     if (var26 <= (1268526447 ^ var106)) {
                        var106 = 1665844797 ^ var106;
                        byte var27 = (byte)(685173586 ^ var106);
                        int var11 = var27;
                        int var29 = var2.length();
                        int var12 = var29;
                        var106 = 1515054930 ^ var106;

                        label92:
                        while (var11 < var12) {
                           var106 = 1960717097 ^ var106;
                           int var35 = var11 + var12;
                           byte var73 = (byte)(105195304 ^ var106);
                           int var36 = var35 + var73;
                           byte var74 = (byte)(105195304 ^ var106);
                           int var37 = var36 >>> var74;
                           byte var98 = (byte)(105195305 ^ var106);
                           String var93 = var2.substring(var98, var37);
                           float var39 = this.textWidth(var1, var93);
                           float var128;
                           int var40 = (var128 = var39 - var3) == 0.0F ? 0 : (var128 < 0.0F ? -1 : 1);
                           if (var40 > (105195305 ^ var106)) {
                              var106 = 1223358964 ^ var106;
                              byte var77 = (byte)(1320148700 ^ var106);
                              int var42 = var37 - var77;
                              var12 = var42;
                              var106 = 431456704 ^ var106;
                           } else {
                              var106 = 687241737 ^ var106;
                              var11 = var37;

                              label78:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                                    case 118097612:
                                    default:
                                       throw new IllegalStateException();
                                    case 175876829:
                                       var106 ^= 2041250365;
                                       break label78;
                                    case 281459384:
                                       break;
                                    case 997472932:
                                       break label78;
                                 }
                              }
                           }

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                                 case 146763600:
                                    var106 ^= 629363485;
                                 case 191003805:
                                    continue label92;
                                 case 573754920:
                                 default:
                                    throw new IllegalStateException();
                                 case 632252029:
                              }
                           }
                        }

                        var106 = 125653930 ^ var106;
                        if (var11 > (1978032042 ^ var106)) {
                           var106 = 75474136 ^ var106;
                           byte var71 = (byte)(1905916786 ^ var106);
                           String var130 = var2.substring(var71, var11);
                           var106 = 1316453377 ^ var106;
                           return var130;
                        }

                        var106 = 807451600 ^ var106;
                        byte var70 = (byte)(1170662522 ^ var106);
                        byte var89 = (byte)(1170662523 ^ var106);
                        int var97 = var2.length();
                        int var90 = Math.min(var89, var97);
                        String var64 = var2.substring(var70, var90);

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                              case 120659818:
                                 var106 = 2049467145 ^ var106;
                                 return var64;
                              case 970259376:
                                 return var64;
                              case 1068310083:
                                 break;
                              case 1333702993:
                              default:
                                 throw new IllegalStateException();
                           }
                        }
                     }

                     label133:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                           case 41866139:
                              var106 ^= 1155156115;
                              break label133;
                           case 261723002:
                           default:
                              throw new IllegalStateException();
                           case 684067992:
                              break;
                           case 2100137637:
                              break label133;
                        }
                     }

                     byte var44 = (byte)(256271868 ^ var106);
                     var101 = var44;
                     int var46 = var2.length();
                     int var102 = var46;
                     var106 = 1398168680 ^ var106;

                     label126:
                     while (var101 < var102) {
                        var106 = 1930630509 ^ var106;
                        int var52 = var101 + var102;
                        byte var82 = (byte)(788737272 ^ var106);
                        int var53 = var52 + var82;
                        byte var83 = (byte)(788737272 ^ var106);
                        int var54 = var53 >>> var83;
                        byte var99 = (byte)(788737273 ^ var106);
                        String var96 = var2.substring(var99, var54);
                        float var56 = this.textWidth(var1, var96);
                        float var57 = var56 + var10;
                        float var129;
                        int var58 = (var129 = var57 - var3) == 0.0F ? 0 : (var129 < 0.0F ? -1 : 1);
                        if (var58 <= (788737273 ^ var106)) {
                           var106 = 1491890751 ^ var106;
                           var101 = var54;
                           var106 = zrerigsvavnelhwc(var106, 27426084);
                        } else {
                           label112:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                                 case 185993249:
                                    var106 ^= 1329387966;
                                    break label112;
                                 case 1073610762:
                                    break;
                                 case 1242781377:
                                    break label112;
                                 case 1351533236:
                                 default:
                                    throw new IllegalStateException();
                              }
                           }

                           byte var87 = (byte)(1614804294 ^ var106);
                           int var60 = var54 - var87;
                           var102 = var60;
                           var106 = 376624805 ^ var106;
                        }

                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                              case 87360456:
                                 var106 ^= 710744694;
                              case 516126999:
                                 continue label126;
                              case 684752184:
                                 break;
                              case 1075199727:
                              default:
                                 throw new IllegalStateException();
                           }
                        }
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var106)) {
                           case 39793566:
                              var106 ^= 2014713377;
                           case 750595592:
                              break label144;
                           case 1588660909:
                           default:
                              throw new IllegalStateException();
                           case 1769130540:
                        }
                     }
                  case 612014269:
                     break;
                  case 752352535:
                  default:
                     throw new IllegalStateException();
               }
            }

            byte var79 = (byte)(604385205 ^ var106);
            String var49 = var2.substring(var79, var101);
            return var49 + var22;
         }

         var106 = 2061370308 ^ var106;
      } else {
         var106 = 1317127486 ^ var106;
      }

      return vrlpgbjthj(vmdsjqzxtqcmnho(), var106);
   }

   public int loadImage(String param1) {
   InputStream in = null;
   try {
      in = b.class.getClassLoader().getResourceAsStream(param1);
      if (in == null) {
         return -1;
      }
      return this.loadImageBytes(in.readAllBytes());
   } catch (Throwable t) {
      com.wimpyclient.Wimpy.LOGGER.warn(vrlpgbjthj(spngyunfcaxzgxn(), 0), param1, t);
      return -1;
   } finally {
      if (in != null) {
         try {
            in.close();
         } catch (Throwable var18) {
         }
      }
   }
}

   public int loadImageBytes(byte[] var1) {
      int var25 = 1386101572 ^ 1473443813 ^ 238467803;
      var25 = 11391514 ^ var25;
      if (var1 != null) {
         var25 = 1805196048 ^ var25;
         int var9 = var1.length;
         if (var9 == (1615773552 ^ var25)) {
            var25 = 1441721393 ^ var25;
            return (byte)(-899699522 ^ var25);
         } else {
            label22:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                  case 177795751:
                     var25 ^= 1399483642;
                     break label22;
                  case 287415021:
                     break;
                  case 1411312562:
                     break label22;
                  case 1902403295:
                  default:
                     throw new RuntimeException();
               }
            }

            int var12 = var1.length;
            ByteBuffer var13 = MemoryUtil.memAlloc(var12);
            ByteBuffer var15 = var13.put(var1);
            ByteBuffer var16 = var15.flip();
            long var18 = this.ctx;
            byte var4 = (byte)(858051466 ^ var25);
            int var20 = NanoVG.nvgCreateImageMem(var18, var4, var13);
            MemoryUtil.memFree(var13);
            return var20;
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
               case 93512133:
                  return (byte)(-899699522 ^ var25);
               case 116508077:
                  var25 ^= 1048049441;
                  return (byte)(-899699522 ^ var25);
               case 152031231:
                  break;
               case 536597203:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   public int loadImageFile(Path var1) {
      int var40 = 454325233 ^ 74721475 ^ 238467803;
      var40 = 295612592 ^ var40;
      if (var1 != null) {
         var40 = 450684328 ^ var40;
         byte var3 = (byte)(437564657 ^ var40);
         LinkOption[] var32 = new LinkOption[var3];
         byte var10 = (byte)((Files.isRegularFile(var1, var32)) ? 1 : 0);
         if (var10 == (437564657 ^ var40)) {
            var40 = 231996980 ^ var40;
            return (byte)(-398936774 ^ var40);
         } else {
            var40 = 323183068 ^ var40;

            Throwable var10000;
            label69: {
               byte[] var6;
               try {
                  byte[] var13 = Files.readAllBytes(var1);
                  var6 = var13;
                  int var15 = var13.length;
                  if (var15 == (156751149 ^ var40)) {
                     var40 ^= 880046723;
                     byte var31 = (byte)(-1025746863 ^ var40);
                     var40 ^= 1432344982;
                     return var31;
                  }
               } catch (IOException var42) {
                  var10000 = var42;
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var40)) {
                     case -383959695:
                        var40 = 1952663596 ^ var40;
                        break label69;
                     case 1254009192:
                        var40 = 1075264175 ^ var40;
                        break label69;
                     default:
                        throw new RuntimeException(new IOException("Error in hash"));
                  }
               }

               label44:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
                     case 35267664:
                        var40 ^= 912003183;
                        break label44;
                     case 71081796:
                        break;
                     case 334589014:
                        break label44;
                     case 862028762:
                     default:
                        throw new RuntimeException();
                  }
               }

               try {
                  int var17 = var6.length;
                  ByteBuffer var18 = MemoryUtil.memAlloc(var17);
                  ByteBuffer var20 = var18.put(var6);
                  ByteBuffer var21 = var20.flip();
                  long var23 = this.ctx;
                  byte var4 = (byte)(1057736002 ^ var40);
                  int var25 = NanoVG.nvgCreateImageMem(var23, var4, var18);
                  MemoryUtil.memFree(var18);
                  var40 ^= 672047735;
                  return var25;
               } catch (Throwable var41) {
                  var10000 = var41;
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var40)) {
                     case -128046575:
                        var40 = 1984637632 ^ var40;
                        break;
                     default:
                        throw new RuntimeException(new IllegalAccessException("Error in hash"));
                  }
               }
            }

            Throwable var28 = var10000;
            Logger var29 = com.wimpyclient.Wimpy.LOGGER;
            String var34 = vrlpgbjthj(joizbfvelgqfrzz(), var40);
            var29.warn(var34, var1, var28);
            return (byte)(-1228992387 ^ var40);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var40)) {
               case 12307595:
                  var40 ^= 386866076;
                  return (byte)(-398936774 ^ var40);
               case 346143237:
                  return (byte)(-398936774 ^ var40);
               case 370880419:
               default:
                  throw new RuntimeException();
               case 924497395:
            }
         }
      }
   }

   public void deleteImage(int var1) {
      int var15 = 1593611725 ^ 2132583666 ^ 238467803;
      var15 = 1531479323 ^ var15;
      if (var1 > (1956515583 ^ var15)) {
         var15 = 1771433448 ^ var15;
         long var6 = this.ctx;
         long var3 = 0L;
         long var22;
         int var8 = (var22 = var6 - var3) == 0L ? 0 : (var22 < 0L ? -1 : 1);
         if (var8 != (487318295 ^ var15)) {
            var15 = 1202282923 ^ var15;
            long var10 = this.ctx;
            NanoVG.nvgDeleteImage(var10, var1);
            var15 = 512489956 ^ var15;
         } else {
            var15 = zrerigsvavnelhwc(var15, 1495439439);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var15)) {
               case 32655760:
                  var15 = 817329575 ^ var15;
                  return;
               case 101780794:
               default:
                  throw new IllegalStateException();
               case 292361030:
                  return;
               case 643297368:
            }
         }
      }
   }

   public void roundedImage(int var1, float var2, float var3, float var4, float var5) {
      int var55 = 479322566 ^ 1963517137 ^ 238467803;
      var55 = 1014391035 ^ var55;
      if (var1 < (1541005111 ^ var55)) {
         var55 = 81161798 ^ var55;
      } else {
         var55 = 1403106682 ^ var55;
         MemoryStack var19 = MemoryStack.stackPush();
         MemoryStack var16 = var19;
         var55 = 1403314660 ^ var55;

         try {
            NVGPaint var21 = NVGPaint.malloc(var16);
            long var23 = this.ctx;
            float var12 = 0.0F;
            float var14 = 1.0F;
            NVGPaint var25 = NanoVG.nvgImagePattern(var23, var2, var3, var4, var4, var12, var1, var14, var21);
            long var27 = this.ctx;
            NanoVG.nvgBeginPath(var27);
            long var30 = this.ctx;
            NanoVG.nvgRoundedRect(var30, var2, var3, var4, var4, var5);
            long var33 = this.ctx;
            NanoVG.nvgFillPaint(var33, var21);
            long var36 = this.ctx;
            NanoVG.nvgFill(var36);
            var55 ^= 1539195571;
         } catch (Throwable var57) {
            switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var55)) {
               case -555459254:
                  var55 = 733791410 ^ var55;
                  if (var19 != null) {
                     var55 = 586795739 ^ var55;

                     try {
                        var16.close();
                        var55 ^= 1914542021;
                     } catch (Throwable var56) {
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var55)) {
                           case -1798558206:
                              var55 = 1002545570 ^ var55;
                              var57.addSuppressed(var56);
                              var55 = 1654720896 ^ var55;
                              throw new RuntimeException(var57);
                           default:
                              throw new RuntimeException(new IOException("Error in hash"));
                        }
                     }

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var55)) {
                           case 251642477:
                              var55 = 729628647 ^ var55;
                              throw new RuntimeException(var57);
                           case 1068486182:
                           default:
                              throw new IllegalStateException();
                           case 1073959991:
                              throw new RuntimeException(var57);
                           case 1734027301:
                        }
                     }
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var55)) {
                        case 163244324:
                           var55 = 2073649913 ^ var55;
                           throw new RuntimeException(var57);
                        case 461384703:
                        default:
                           throw new IllegalStateException();
                        case 1053374124:
                           throw new RuntimeException(var57);
                        case 1431791601:
                     }
                  }
               default:
                  throw new RuntimeException(new IllegalAccessException("Error in hash"));
            }
         }

         if (var19 != null) {
            var55 = 888125809 ^ var55;
            var19.close();
            var55 = zrerigsvavnelhwc(var55, 153938717);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var55)) {
                  case 6069482:
                     var55 = 1036210796 ^ var55;
                     return;
                  case 47045743:
                  default:
                     throw new IllegalStateException();
                  case 234841387:
                     break;
                  case 969790216:
                     return;
               }
            }
         }
      }
   }

   public void image(int var1, float var2, float var3, float var4, float var5) {
      int var54 = 759935784 ^ 1757097656 ^ 238467803;
      var54 = 2089955076 ^ var54;
      if (var1 < (928254031 ^ var54)) {
         var54 = 925367778 ^ var54;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
               case 187885389:
                  var54 ^= 764010118;
               case 885270495:
                  MemoryStack var19 = MemoryStack.stackPush();
                  MemoryStack var16 = var19;
                  var54 = 1943593116 ^ var54;

                  try {
                     NVGPaint var21 = NVGPaint.malloc(var16);
                     long var23 = this.ctx;
                     float var12 = 0.0F;
                     float var14 = 1.0F;
                     NVGPaint var25 = NanoVG.nvgImagePattern(var23, var2, var3, var4, var5, var12, var1, var14, var21);
                     long var27 = this.ctx;
                     NanoVG.nvgBeginPath(var27);
                     long var30 = this.ctx;
                     NanoVG.nvgRect(var30, var2, var3, var4, var5);
                     long var33 = this.ctx;
                     NanoVG.nvgFillPaint(var33, var21);
                     long var36 = this.ctx;
                     NanoVG.nvgFill(var36);
                     var54 ^= 339605914;
                  } catch (Throwable var56) {
                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var54)) {
                        case 1210692267:
                           var54 = zrerigsvavnelhwc(var54, 901484442);
                           if (var19 != null) {
                              var54 = 290357301 ^ var54;

                              try {
                                 var16.close();
                                 var54 ^= 1064109102;
                              } catch (Throwable var55) {
                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var54)) {
                                    case 1870778322:
                                       var54 = zrerigsvavnelhwc(var54, 503688272);
                                       var56.addSuppressed(var55);
                                       var54 = 2121977888 ^ var54;
                                       throw new RuntimeException(var56);
                                    default:
                                       throw new RuntimeException(new IllegalAccessException("Error in hash"));
                                 }
                              }

                              var54 = 1595045982 ^ var54;
                           } else {
                              var54 = 1899101253 ^ var54;
                           }

                           throw new RuntimeException(var56);
                        default:
                           throw new RuntimeException(new IOException("Error in hash"));
                     }
                  }

                  if (var19 != null) {
                     var54 = 1581330942 ^ var54;
                     var19.close();

                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
                           case 21793473:
                           default:
                              throw new RuntimeException(new IOException());
                           case 79462151:
                              var54 = 1900241635 ^ var54;
                              return;
                           case 1003380316:
                              return;
                           case 1491889838:
                        }
                     }
                  } else {
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var54)) {
                           case 43937689:
                              var54 = 788681501 ^ var54;
                              return;
                           case 156084202:
                              break;
                           case 833810249:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1050157042:
                              return;
                        }
                     }
                  }
               case 363591109:
               default:
                  throw new RuntimeException(new IOException());
               case 1686827042:
            }
         }
      }
   }

   public static void shutdown() {
      int var4 = 40807529 ^ 388718209 ^ 2066920654;
      var4 = 37659137 ^ var4;
      b var0 = instance;
      if (var0 != null) {
         var4 = 1617839278 ^ var4;
         b var1 = instance;
         var1.destroy();
         var4 = 1310248450 ^ var4;
      } else {
         var4 = zrerigsvavnelhwc(var4, 779520684);
      }
   }

   public void destroy() {
      int var29 = 95407656 ^ 847507728 ^ 238467803;
      var29 = 1810054951 ^ var29;
      long var8 = this.ctx;
      long var4 = 0L;
      long var36;
      int var10 = (var36 = var8 - var4) == 0L ? 0 : (var36 < 0L ? -1 : 1);
      if (var10 != (1392097988 ^ var29)) {
         var29 = 1564230978 ^ var29;
         long var12 = this.ctx;
         NanoVGGL3.nvgDelete(var12);
         long var2 = 0L;
         this.ctx = var2;
         var29 = 674847652 ^ var29;
      } else {
         var29 = zrerigsvavnelhwc(var29, 1963269862);
      }

      List var16 = this.retainedFontData;
      Iterator var17 = var16.iterator();
      Iterator var6 = var17;
      var29 = 1675540629 ^ var29;

      while (true) {
         byte var19 = (byte)((var6.hasNext()) ? 1 : 0);
         if (var19 == (1143086263 ^ var29)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var29)) {
                  case 67261312:
                     var29 = 385251079 ^ var29;
                  case 1892697839:
                     List var25 = this.retainedFontData;
                     var25.clear();
                     Object var26 = null;
                     instance = (b)var26;
                     return;
                  case 289608435:
                  default:
                     throw new RuntimeException();
                  case 1698631079:
               }
            }
         }

         var29 = 94989557 ^ var29;
         Object var21 = var6.next();
         ByteBuffer var22 = (ByteBuffer)var21;
         MemoryUtil.memFree(var22);
         var29 = 94989557 ^ var29;
      }
   }

   private static NVGColor color(MemoryStack var0, int var1) {
      int var39 = 1067078874 ^ 1637048491 ^ 2066920654;
      var39 = 956286367 ^ var39;
      NVGColor var8 = NVGColor.malloc(var0);
      byte var3 = (byte)(499402032 ^ var39);
      int var10 = var1 >>> var3;
      short var15 = (short)(499402207 ^ var39);
      int var11 = var10 & var15;
      float var12 = var11;
      float var16 = 255.0F;
      float var13 = var12 / var16;
      byte var4 = (byte)(499402024 ^ var39);
      int var18 = var1 >>> var4;
      short var22 = (short)(499402207 ^ var39);
      int var19 = var18 & var22;
      float var20 = var19;
      float var23 = 255.0F;
      float var21 = var20 / var23;
      short var5 = (short)(499402207 ^ var39);
      int var25 = var1 & var5;
      float var26 = var25;
      float var28 = 255.0F;
      float var27 = var26 / var28;
      byte var6 = (byte)(499402040 ^ var39);
      int var30 = var1 >>> var6;
      short var34 = (short)(499402207 ^ var39);
      int var31 = var30 & var34;
      float var32 = var31;
      float var35 = 255.0F;
      float var33 = var32 / var35;
      return NanoVG.nvgRGBAf(var13, var21, var27, var33, var8);
   }

   static {
      int var3 = new Random(-2562444841368052145L).nextInt();
      SWr6jjCfT1 = 366569572 ^ var3;
   }

   public static String vrlpgbjthj(byte[] var0, int var1) {
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
         byte[] var27 = nzclgqehdn;
         byte[] var34 = nzclgqehdn;
         int var35 = var34.length;
         int var32 = var7 % var35;
         byte var28 = var27[var32];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var7] = var23;
         var7++;
      }
   }

   private static byte[] mtnfzxcuumhjarr() {
      return new byte[]{
         52,
         34,
         84,
         23,
         74,
         10,
         32,
         29,
         31,
         118,
         85,
         108,
         77,
         9,
         45,
         78,
         48,
         31,
         123,
         34,
         33,
         114,
         33,
         33,
         64,
         3,
         6,
         48,
         72,
         39,
         47,
         99,
         58,
         122,
         64,
         61,
         36,
         104,
         111,
         37,
         68,
         70,
         40,
         73,
         38,
         81,
         116,
         119,
         17,
         53,
         114,
         66,
         108,
         70,
         13,
         69,
         4,
         127,
         6,
         83,
         107,
         19,
         35,
         96,
         68,
         2,
         3,
         58,
         126,
         103
      };
   }

   private static byte[] utruyngdnacsohk() {
      return new byte[]{
         -3,
         -17,
         96,
         97,
         121,
         92,
         16,
         64,
         43,
         46,
         103,
         14,
         117,
         125,
         26,
         94,
         3,
         66,
         76,
         126,
         21,
         35,
         18,
         98,
         112,
         16,
         50,
         97,
         122,
         114,
         23,
         57,
         13,
         38,
         115,
         108,
         19,
         62
      };
   }

   private static byte[] kltfdjhksprcdev() {
      return new byte[]{-4, -28, 97, 99, 126, 95, 24, 66, 47, 33, 108, 44, 125, 81, 29, 2};
   }

   private static byte[] aafmbossutqznmf() {
      return new byte[]{
         -4,
         -28,
         97,
         70,
         126,
         73,
         24,
         87,
         47,
         37,
         108,
         45,
         125,
         78,
         29,
         89,
         9,
         88,
         77,
         114,
         20,
         47,
         21,
         97,
         120,
         67,
         54,
         101,
         113,
         126,
         31,
         62,
         10,
         39,
         121,
         99,
         18,
         37,
         90,
         58,
         112,
         16,
         16,
         31,
         22,
         9,
         77,
         54,
         33,
         114,
         66,
         85,
         85,
         3,
         59,
         21,
         49,
         97,
         50,
         12,
         83,
         94,
         19,
         48
      };
   }

   private static byte[] nyynyqxvrztxnxa() {
      return new byte[]{
         -5, -19, 98, 104, 114, 94, 17, 75, 40, 47, 100, 10, 123, 127, 21, 91, 1, 65, 76, 123, 16, 44, 23, 100, 120, 69, 55, 50, 127, 49, 30, 40, 12, 54
      };
   }

   private static byte[] fcsfwhkwfmafmvq() {
      return new byte[]{-14, -27, 103, 100, 122, 95, 24, 74, 42, 47, 109, 42, 122, 85, 29, 2};
   }

   private static byte[] nckdsvnluxmfony() {
      return new byte[]{-5, -20, 108, 101, 120, 92, 18, 74, 46, 47, 99, 43, 126, 87, 28, 11};
   }

   private static byte[] edcavxivfbytsbb() {
      return new byte[]{
         -5,
         -20,
         108,
         64,
         120,
         74,
         18,
         95,
         46,
         43,
         99,
         42,
         126,
         72,
         28,
         80,
         8,
         94,
         73,
         120,
         19,
         46,
         16,
         105,
         118,
         72,
         53,
         97,
         121,
         122,
         23,
         60,
         8,
         44,
         114,
         98,
         21,
         36,
         89,
         56,
         119,
         18,
         25,
         23,
         30,
         9,
         70,
         48,
         35,
         119,
         67,
         85,
         90,
         1,
         62,
         30,
         53,
         96,
         62,
         17,
         89,
         84,
         17,
         55
      };
   }

   private static byte[] fifhwohptybcorp() {
      return new byte[]{-13, -23, 102, 107, 125, 93, 20, 67, 42, 46, 97, 43, 117, 82, 31, 14};
   }

   private static byte[] kbmtqesqaeemrfn() {
      return new byte[]{-5, -18, 103, 99, 115, 88, 24, 72, 44, 36, 100, 42, 126, 85, 20, 13};
   }

   private static byte[] psymwlmfmgjvuku() {
      return new byte[]{
         -8,
         -20,
         103,
         103,
         124,
         89,
         16,
         67,
         41,
         46,
         103,
         56,
         126,
         91,
         27,
         92,
         0,
         92,
         77,
         121,
         19,
         99,
         18,
         123,
         118,
         94,
         54,
         102,
         126,
         119,
         29,
         114,
         9,
         42,
         118,
         96,
         20,
         49,
         89,
         101,
         118,
         87,
         27,
         13,
         16,
         6,
         68,
         51,
         39,
         110,
         64,
         6,
         95,
         2,
         59,
         20,
         52,
         45,
         48,
         71,
         89,
         89,
         16,
         43
      };
   }

   private static byte[] yppwspmkxthimrg() {
      return new byte[0];
   }

   private static byte[] titflbfgupbkhff() {
      return new byte[]{-5, -17, 98, 1, 127, 22, 22, 7};
   }

   private static byte[] vmdsjqzxtqcmnho() {
      return new byte[0];
   }

   private static byte[] spngyunfcaxzgxn() {
      return new byte[]{
         -5,
         -18,
         109,
         100,
         127,
         94,
         18,
         68,
         44,
         47,
         100,
         58,
         116,
         88,
         24,
         91,
         2,
         91,
         72,
         120,
         16,
         97,
         24,
         120,
         117,
         89,
         52,
         97,
         123,
         118,
         30,
         112,
         3,
         1,
         117,
         94,
         22,
         31,
         92,
         48,
         117,
         28,
         17,
         17,
         19,
         5,
         70,
         32,
         34,
         101,
         67,
         81,
         85,
         8,
         56,
         13
      };
   }

   private static byte[] joizbfvelgqfrzz() {
      return new byte[]{
         -5,
         -17,
         102,
         105,
         115,
         82,
         18,
         71,
         39,
         44,
         100,
         59,
         127,
         85,
         20,
         87,
         2,
         88,
         67,
         123,
         16,
         96,
         19,
         117,
         121,
         85,
         52,
         98,
         112,
         117,
         30,
         113,
         8,
         12,
         121,
         82,
         22,
         28,
         87,
         51,
         117,
         29,
         26,
         28,
         31,
         9,
         70,
         35,
         41,
         102,
         67,
         80,
         94,
         24,
         52,
         21,
         54,
         32,
         62,
         0,
         90,
         1,
         17,
         35,
         125,
         70
      };
   }

   private static int zrerigsvavnelhwc(int var0, int var1) {
      return var0 ^ var1;
   }
}
