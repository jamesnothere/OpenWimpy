package com.wimpyclient.r;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.StandardProtocolFamily;
import java.net.UnixDomainSocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class a implements AutoCloseable {
   private static final int OP_HANDSHAKE = 0;
   private static final int OP_FRAME = 1;
   private static final int OP_CLOSE = 2;
   private static final int OP_PING = 3;
   private static final int OP_PONG = 4;
   private RandomAccessFile windowsPipe;
   private SocketChannel unixChannel;
   private String lastJson;
   private byte unixPeek;
   private boolean unixHasPeek;
   private static int niNPyw7fWB;
   private transient int YR972OZriJ;

   a() {
super();
      int var4 = 1738796039 ^ 1051062556;
      
      var4 = nyqpyvalizrolwhd(var4, 1220063303);
      var4 = 130299065 ^ 1694618178 ^ Integer.parseInt("1937460135");
      this.YR972OZriJ = 1460267775 ^ niNPyw7fWB;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 39943772:
               var4 = 1534475997 ^ var4;
            case 1767570040:
               return;
            case 599045058:
            default:
               throw new RuntimeException();
            case 1698577021:
         }
      }
   }

   static a connect(long var0) throws IOException {
      int var25 = 2045649610 ^ 1572158880 ^ 708053962;
      var25 = 10541383 ^ var25;
      Object var2 = null;
      IOException var5 = (IOException)var2;
      byte var9 = (byte)(248499687 ^ var25);
      int var6 = var9;
      var25 = 1509610565 ^ var25;

      label62:
      while (true) {
         byte var3 = (byte)(1463097768 ^ var25);
         if (var6 < var3) {
            var25 = 1847590274 ^ var25;
            Object var11 = null;
            a var7 = (a)var11;
            var25 = 1464787117 ^ var25;

            try {
               a var13 = open(var6);
               var25 ^= 1867544199;
               var7 = var13;
               var13.handshake(var0);
               var25 ^= 960050050;
               return var13;
            } catch (IOException var26) {
               var25 = switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var25)) {
                  case 161714256 -> nyqpyvalizrolwhd(var25, 840430263);
                  case 1931486315 -> 1564967984 ^ var25;
                  default -> throw new RuntimeException("Error in hash");
               };
               if (var7 != null) {
                  var25 = 1480165752 ^ var25;
                  var7.close();
                  var25 = 494108080 ^ var25;
               } else {
                  var25 = nyqpyvalizrolwhd(var25, 1162540232);
               }

               var5 = var26;
               var6 += 1986622580 ^ var25;
            }

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                  case 90974155:
                     var25 ^= 559705559;
                     continue label62;
                  case 610282728:
                  default:
                     throw new RuntimeException(new IOException());
                  case 895225434:
                     break;
                  case 1117827611:
                     continue label62;
               }
            }
         }

         var25 = nyqpyvalizrolwhd(var25, 1461046439);
         if (var5 != null) {
            var25 = 284262259 ^ var25;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var25)) {
                  case 9841301:
                     var25 = 588226539 ^ var25;
                     throw new RuntimeException(var5);
                  case 1179828078:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1792002893:
                     break;
                  case 2063228836:
                     throw new RuntimeException(var5);
               }
            }
         } else {
            var25 = nyqpyvalizrolwhd(var25, 243295177);
            String var4 = tfhknofirb(hstpeovcntyxhev(), sihnnxuloikffrd(), var25);
            IOException var21 = new IOException(var4);
            var25 = 1031701329 ^ var25;
            throw new RuntimeException(var21);
         }
      }
   }

   void setActivity(JsonObject var1) throws IOException {
      int var58 = 1311583849 ^ 1763147019 ^ 2101207349;
      var58 = 703024657 ^ var58;
      JsonObject var2 = new JsonObject();
      String var27 = tfhknofirb(nopnpfpaotflrsx(), sihnnxuloikffrd(), var58);
      long var3 = 2147483647L;
      ProcessHandle var5 = ProcessHandle.current();
      long var55 = var5.pid();
      long var38 = Math.min(var3, var55);
      int var40 = (int)var38;
      Integer var41 = var40;
      var2.addProperty(var27, var41);
      if (var1 == null) {
         var58 = 1954401405 ^ var58;
         String var28 = tfhknofirb(bvninpwhddpazuc(), sihnnxuloikffrd(), var58);
         JsonNull var42 = JsonNull.INSTANCE;
         var2.add(var28, var42);
         var58 = 144432041 ^ var58;
      } else {
         var58 = nyqpyvalizrolwhd(var58, 1141088375);
         String var37 = tfhknofirb(cqhsiqojnzcjkew(), sihnnxuloikffrd(), var58);
         var2.add(var37, var1);
         var58 = 954578851 ^ var58;
      }

      UUID var13 = UUID.randomUUID();
      String var14 = var13.toString();
      JsonObject var15 = new JsonObject();
      String var29 = tfhknofirb(poiagovytdhnobj(), sihnnxuloikffrd(), var58);
      String var43 = tfhknofirb(jekirngwmhmfypz(), sihnnxuloikffrd(), var58);
      var15.addProperty(var29, var43);
      String var30 = tfhknofirb(mbcclvndeprjrap(), sihnnxuloikffrd(), var58);
      var15.addProperty(var30, var14);
      String var31 = tfhknofirb(sjugnlgykdtjuce(), sihnnxuloikffrd(), var58);
      var15.add(var31, var2);
      byte var32 = (byte)(252111763 ^ var58);
      String var47 = var15.toString();
      this.write(var32, var47);
      JsonObject var21 = this.awaitFrame(var14);
      String var22 = tfhknofirb(nlbvfethbsthmyw(), sihnnxuloikffrd(), var58);
      String var48 = tfhknofirb(ksunqzygxakouhl(), sihnnxuloikffrd(), var58);
      String var35 = stringField(var21, var48);
      byte var23 = (byte)((var22.equals(var35)) ? 1 : 0);
      if (var23 != (252111762 ^ var58)) {
         var58 = 220530489 ^ var58;
         String var50 = this.lastJson;
         String var51 = "SET_ACTIVITY failed: " + var50;
         IOException var24 = new IOException(var51);
         throw new RuntimeException(var24);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var58)) {
               case 59786199:
               default:
                  throw new RuntimeException(new IOException());
               case 220030828:
                  var58 ^= 2094569123;
               case 716566580:
                  Logger var25 = com.wimpyclient.Wimpy.LOGGER;
                  String var36 = tfhknofirb(vjyqrwwrnzafbrv(), sihnnxuloikffrd(), var58);
                  String var53 = this.lastJson;
                  var25.info(var36, var53);
                  return;
               case 996050791:
            }
         }
      }
   }

   boolean pump() throws IOException {
      int var13 = 2013927954 ^ 501091652 ^ 2101207349;
      var13 = 1495692855 ^ var13;

      while (true) {
         byte var4 = (byte)((this.readable()) ? 1 : 0);
         if (var4 == (1104117844 ^ var13)) {
            var13 = 850339717 ^ var13;
            return (((byte)(1935714256 ^ var13)) != 0);
         }

         var13 = 1814829075 ^ var13;
         int var7 = this.readPacket();
         byte var9 = (byte)((this.handleOpcode(var7)) ? 1 : 0);
         if (var9 == (769890375 ^ var13)) {
            var13 = 67322296 ^ var13;
            return (((byte)(702601727 ^ var13)) != 0);
         }

         label22:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
               case 149478122:
                  var13 ^= 1707217834;
                  break label22;
               case 214508105:
                  break;
               case 1614405604:
               default:
                  throw new RuntimeException(new IOException());
               case 1718207402:
                  break label22;
            }
         }

         var13 = 166595513 ^ var13;
      }
   }

   @Override
   public void close() {
      int var19 = 1050426385 ^ 419203103 ^ 2101207349;
      var19 = 469435997 ^ var19;
      RandomAccessFile var4 = this.windowsPipe;
      if (var4 != null) {
         var19 = 455328378 ^ var19;

         label78: {
            try {
               RandomAccessFile var6 = this.windowsPipe;
               var6.close();
               var19 ^= 884428638;
            } catch (IOException var21) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var19)) {
                  case -601061150:
                     var19 = 1017049134 ^ var19;
                     var19 = 923081923 ^ var19;
                     break label78;
                  default:
                     throw new RuntimeException(new IOException("Error in hash"));
               }
            }

            label65:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
                  case 95937194:
                  default:
                     throw new RuntimeException(new IOException());
                  case 124969389:
                     var19 ^= 1059890099;
                     break label65;
                  case 233138188:
                     break;
                  case 848515098:
                     break label65;
               }
            }
         }

         Object var2 = null;
         this.windowsPipe = (RandomAccessFile)var2;
         var19 = 227962986 ^ var19;
      } else {
         var19 = nyqpyvalizrolwhd(var19, 489578237);
      }

      SocketChannel var9 = this.unixChannel;
      if (var9 != null) {
         var19 = 1850252013 ^ var19;

         label49: {
            try {
               SocketChannel var11 = this.unixChannel;
               var11.close();
               var19 ^= 1594120408;
            } catch (IOException var20) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var19)) {
                  case -1643856975:
                     var19 = 145885775 ^ var19;
                     var19 = 1113374773 ^ var19;
                     break label49;
                  default:
                     throw new RuntimeException("Error in hash");
               }
            }

            label43:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
                  case 45956773:
                     var19 ^= 367694498;
                     break label43;
                  case 830919139:
                     break;
                  case 1049852768:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1959088457:
                     break label43;
               }
            }
         }

         Object var15 = null;
         this.unixChannel = (SocketChannel)var15;
         var19 = 650551077 ^ var19;
      } else {
         var19 = 39899058 ^ var19;
      }
   }

   private void handshake(long var1) throws IOException {
      int var57 = 1921484139 ^ 1289646568 ^ 2101207349;
      var57 = 1435804795 ^ var57;
      JsonObject var3 = new JsonObject();
      String var26 = tfhknofirb(gvzlkejhtfblibm(), sihnnxuloikffrd(), var57);
      byte var4 = (byte)(384872908 ^ var57);
      Integer var34 = Integer.valueOf(var4);
      var3.addProperty(var26, var34);
      String var27 = tfhknofirb(hyyjcopwhvysics(), sihnnxuloikffrd(), var57);
      String var37 = Long.toString(var1);
      var3.addProperty(var27, var37);
      byte var28 = (byte)(384872909 ^ var57);
      String var39 = var3.toString();
      this.write(var28, var39);
      int var12 = this.readPacket();
      byte var29 = (byte)(384872911 ^ var57);
      if (var12 == var29) {
         var57 = 511678896 ^ var57;
         String var41 = this.lastJson;
         String var42 = "Discord closed IPC during handshake: " + var41;
         IOException var14 = new IOException(var42);
         throw new RuntimeException(var14);
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var57)) {
               case 208817805:
                  var57 ^= 551309427;
               case 1630241163:
                  byte var30 = (byte)(908911037 ^ var57);
                  if (var12 == var30) {
                     byte var31;
                     String var48;
                     label30: {
                        var57 = 1573995748 ^ var57;
                        var31 = (byte)(1811785054 ^ var57);
                        String var44 = this.lastJson;
                        if (var44 != null) {
                           var57 = 1920045831 ^ var57;
                           String var46 = this.lastJson;
                           byte var47 = (byte)((var46.isEmpty()) ? 1 : 0);
                           if (var47 == (428619357 ^ var57)) {
                              var57 = nyqpyvalizrolwhd(var57, 583305764);
                              var48 = this.lastJson;
                              var57 = 1685654833 ^ var57;
                              break label30;
                           }

                           var57 = 44416674 ^ var57;
                        } else {
                           var57 = nyqpyvalizrolwhd(var57, 1892953509);
                        }

                        var48 = tfhknofirb(rdczbcgepoihede(), sihnnxuloikffrd(), var57);
                        var57 = 1142438327 ^ var57;
                     }

                     this.write(var31, var48);
                     int var18 = this.readPacket();
                     var57 = 1356974606 ^ var57;
                  } else {
                     var57 = 972856056 ^ var57;
                  }

                  String var20 = this.lastJson;
                  JsonElement var21 = JsonParser.parseString(var20);
                  JsonObject var22 = var21.getAsJsonObject();
                  String var23 = tfhknofirb(eijwrtfzjfcftnz(), sihnnxuloikffrd(), var57);
                  String var49 = tfhknofirb(ovnburaagqeaxjp(), sihnnxuloikffrd(), var57);
                  String var33 = stringField(var22, var49);
                  byte var24 = (byte)((var23.equals(var33)) ? 1 : 0);
                  if (var24 == (265321286 ^ var57)) {
                     var57 = 1039059831 ^ var57;
                     String var51 = this.lastJson;
                     String var52 = "Unexpected Discord handshake: " + var51;
                     IOException var25 = new IOException(var52);
                     throw new RuntimeException(var25);
                  }

                  var57 = nyqpyvalizrolwhd(var57, 308376228);
                  return;
               case 1096899615:
               default:
                  throw new RuntimeException();
               case 1758424977:
            }
         }
      }
   }

   private JsonObject awaitFrame(String var1) throws IOException {
      int var52 = 1863455827 ^ 2088120442 ^ 2101207349;
      var52 = 791722847 ^ var52;
      byte var2 = (byte)(1097432643 ^ var52);
      int var5 = var2;
      var52 = 192539768 ^ var52;

      while (true) {
         byte var3 = (byte)(1242599979 ^ var52);
         if (var5 >= var3) {
            var52 = nyqpyvalizrolwhd(var52, 532916625);
            String var4 = tfhknofirb(ezkfczwasiswfku(), sihnnxuloikffrd(), var52);
            IOException var9 = new IOException(var4);
            throw new RuntimeException(var9);
         }

         var52 = 101546396 ^ var52;
         int var11 = this.readPacket();
         byte var27 = (byte)(1277029285 ^ var52);
         if (var11 == var27) {
            var52 = 2110294299 ^ var52;
            String var37 = this.lastJson;
            String var38 = "Discord closed IPC: " + var37;
            IOException var13 = new IOException(var38);
            throw new RuntimeException(var13);
         }

         var52 = 655316909 ^ var52;
         byte var28 = (byte)(1796389897 ^ var52);
         if (var11 == var28) {
            byte var29;
            String var49;
            label95: {
               var52 = 1252711093 ^ var52;
               var29 = (byte)(565733051 ^ var52);
               String var40 = this.lastJson;
               if (var40 != null) {
                  var52 = 384592603 ^ var52;
                  String var42 = this.lastJson;
                  byte var43 = (byte)((var42.isEmpty()) ? 1 : 0);
                  if (var43 == (928255076 ^ var52)) {
                     label64:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var52)) {
                           case 187887445:
                              var52 ^= 2147086392;
                              break label64;
                           case 608884565:
                              break;
                           case 1097389124:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1359317302:
                              break label64;
                        }
                     }

                     var49 = this.lastJson;
                     var52 = 1798267552 ^ var52;
                     break label95;
                  }

                  var52 = 515536925 ^ var52;
               } else {
                  label82:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var52)) {
                        case 22374058:
                           var52 ^= 139858630;
                        case 497316612:
                           break label82;
                        case 1083264088:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1099348619:
                     }
                  }
               }

               var49 = tfhknofirb(ltmbcntkakeqkrg(), sihnnxuloikffrd(), var52);

               label74:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var52)) {
                     case 20850756:
                        var52 ^= 174910085;
                     case 173255355:
                        break label74;
                     case 301919871:
                     default:
                        throw new RuntimeException(new IOException());
                     case 2018670573:
                  }
               }
            }

            this.write(var29, var49);

            label56:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var52)) {
                  case 80557962:
                     var52 ^= 1949736909;
                  case 86415638:
                     break label56;
                  case 542917782:
                     break;
                  case 1996604548:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         } else {
            var52 = nyqpyvalizrolwhd(var52, 16229919);
            byte var30 = (byte)(1810176532 ^ var52);
            if (var11 != var30) {
               var52 = 477867153 ^ var52;
               var52 = nyqpyvalizrolwhd(var52, 539670453);
            } else {
               var52 = 1194168891 ^ var52;
               String var18 = this.lastJson;
               JsonElement var19 = JsonParser.parseString(var18);
               JsonObject var20 = var19.getAsJsonObject();
               String var45 = tfhknofirb(mfeornshuuefkrn(), sihnnxuloikffrd(), var52);
               String var32 = stringField(var20, var45);
               byte var22 = (byte)((var1.equals(var32)) ? 1 : 0);
               if (var22 != (751339566 ^ var52)) {
                  var52 = 178301911 ^ var52;
                  return var20;
               }

               label47:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var52)) {
                     case 113552145:
                        var52 ^= 665698920;
                        break label47;
                     case 464507660:
                        break;
                     case 800904858:
                     default:
                        throw new RuntimeException(new IOException());
                     case 994321997:
                        break label47;
                  }
               }

               String var23 = tfhknofirb(grktdukldgcxqwj(), sihnnxuloikffrd(), var52);
               String var46 = tfhknofirb(tbldnfqrnrfhiyf(), sihnnxuloikffrd(), var52);
               String var34 = stringField(var20, var46);
               byte var24 = (byte)((var23.equals(var34)) ? 1 : 0);
               if (var24 != (191187526 ^ var52)) {
                  var52 = 204841617 ^ var52;
                  Logger var25 = com.wimpyclient.Wimpy.LOGGER;
                  String var35 = tfhknofirb(puxuxvlwekckjoe(), sihnnxuloikffrd(), var52);
                  String var48 = this.lastJson;
                  var25.info(var35, var48);
                  var52 = 1357179366 ^ var52;
               } else {
                  var52 = 1557220215 ^ var52;
               }
            }
         }

         var5 += 1471414576 ^ var52;
         var52 = nyqpyvalizrolwhd(var52, 497324810);
      }
   }

   private boolean handleOpcode(int var1) throws IOException {
      byte var20;
      String var31;
      int var48;
      var48 = 1750332896 ^ 862107606 ^ 2101207349;
      var48 = 617925819 ^ var48;
      byte var3 = (byte)(47738811 ^ var48);
      label44:
      if (var1 == var3) {
         var48 = 1605952202 ^ var48;
         var20 = (byte)(1566608758 ^ var48);
         String var26 = this.lastJson;
         if (var26 != null) {
            var48 = 1219477055 ^ var48;
            String var28 = this.lastJson;
            byte var29 = (byte)((var28.isEmpty()) ? 1 : 0);
            if (var29 == (365900621 ^ var48)) {
               var48 = nyqpyvalizrolwhd(var48, 822289049);
               var31 = this.lastJson;
               var48 = 1308306319 ^ var48;
               break label44;
            }

            var48 = 926236838 ^ var48;
         } else {
            label41:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var48)) {
                  case 82530156:
                     var48 ^= 2140864153;
                  case 388002350:
                     break label41;
                  case 433176445:
                  default:
                     throw new RuntimeException();
                  case 1657484274:
               }
            }
         }

         var31 = tfhknofirb(gzybruvwrwemxav(), sihnnxuloikffrd(), var48);
         var48 = nyqpyvalizrolwhd(var48, 1271744944);
      } else {
         var48 = nyqpyvalizrolwhd(var48, 1179741180);
         byte var21 = (byte)(1149830214 ^ var48);
         if (var1 == var21) {
            var48 = 1086707658 ^ var48;
            return (((byte)(72143758 ^ var48)) != 0);
         }

         var48 = nyqpyvalizrolwhd(var48, 745863893);
         byte var22 = (byte)(1761476240 ^ var48);
         if (var1 != var22) {
            var48 = 2144199562 ^ var48;
            return (((byte)(389029146 ^ var48)) != 0);
         }

         label51:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var48)) {
               case 191657413:
                  var48 ^= 1728690516;
               case 360325848:
                  break label51;
               case 1354721998:
               default:
                  throw new RuntimeException();
               case 2077001070:
            }
         }

         String var13 = this.lastJson;
         JsonElement var14 = JsonParser.parseString(var13);
         JsonObject var15 = var14.getAsJsonObject();
         String var16 = tfhknofirb(auoumnzwyxuxfpt(), sihnnxuloikffrd(), var48);
         String var32 = tfhknofirb(mwxucymijvgbdbi(), sihnnxuloikffrd(), var48);
         String var24 = stringField(var15, var32);
         byte var17 = (byte)((var16.equals(var24)) ? 1 : 0);
         if (var17 != (267667397 ^ var48)) {
            var48 = 627877529 ^ var48;
            Logger var18 = com.wimpyclient.Wimpy.LOGGER;
            String var25 = tfhknofirb(ohnxucuopuicsjl(), sihnnxuloikffrd(), var48);
            String var34 = this.lastJson;
            var18.info(var25, var34);
            var48 = 851566250 ^ var48;
         } else {
            var48 = 397244467 ^ var48;
         }

         return (((byte)(408502263 ^ var48)) != 0);
      }

      this.write(var20, var31);
      return (((byte)(1765227098 ^ var48)) != 0);
   }

   private static a open(int var0) throws IOException {
      int var70 = 1110263630 ^ 1999409059 ^ 708053962;
      var70 = 1457384195 ^ var70;
      a var1 = new a();
      String var13 = tfhknofirb(mbhmvlghfmgkjpd(), sihnnxuloikffrd(), var70);
      String var51 = tfhknofirb(igtoqnofsynxaga(), sihnnxuloikffrd(), var70);
      String var14 = System.getProperty(var13, var51);
      Locale var52 = Locale.ROOT;
      String var15 = var14.toLowerCase(var52);
      String var53 = tfhknofirb(brmbhelrwggswmd(), sihnnxuloikffrd(), var70);
      byte var17 = (byte)((var15.contains(var53)) ? 1 : 0);
      if (var17 != (1239951396 ^ var70)) {
         var70 = 859802117 ^ var70;
         String var67 = "\\\\.\\pipe\\discord-ipc-" + var0;
         String var5 = tfhknofirb(qbjaeuxiuddnxdg(), sihnnxuloikffrd(), var70);
         RandomAccessFile var60 = new RandomAccessFile(var67, var5);
         var1.windowsPipe = var60;
         return var1;
      } else {
         label66:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
               case 254903341:
                  var70 ^= 379713863;
               case 1750902629:
                  Path var19 = ipcPath(var0);
                  if (var19 == null) {
                     var70 = nyqpyvalizrolwhd(var70, 1321998813);
                     break label66;
                  }

                  var70 = 1433800590 ^ var70;
                  byte var54 = (byte)(171957997 ^ var70);
                  LinkOption[] var55 = new LinkOption[var54];
                  byte var22 = (byte)((Files.exists(var19, var55)) ? 1 : 0);
                  if (var22 == (171957997 ^ var70)) {
                     var70 = 465180243 ^ var70;
                     break label66;
                  }

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                        case 64730580:
                           var70 ^= 765254348;
                        case 2121061755:
                           StandardProtocolFamily var23 = StandardProtocolFamily.UNIX;
                           SocketChannel var24 = SocketChannel.open(var23);
                           SocketChannel var9 = var24;
                           byte var56 = (byte)(664994849 ^ var70);
                           SelectableChannel var26 = var24.configureBlocking((var56 != 0));
                           UnixDomainSocketAddress var58 = UnixDomainSocketAddress.of(var19);
                           boolean var28 = var24.connect(var58);
                           long var29 = System.currentTimeMillis();
                           long var2 = 2000L;
                           long var31 = var29 + var2;
                           long var10 = var31;
                           var70 = 1959228173 ^ var70;

                           label51:
                           while (true) {
                              byte var34 = (byte)((var9.finishConnect()) ? 1 : 0);
                              if (var34 != (1399093036 ^ var70)) {
                                 var70 = 607975716 ^ var70;
                                 var1.unixChannel = var9;
                                 return var1;
                              }

                              var70 = 483937078 ^ var70;
                              long var37 = System.currentTimeMillis();
                              long var82;
                              int var39 = (var82 = var37 - var10) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                              if (var39 > (1337736218 ^ var70)) {
                                 var70 = 336914663 ^ var70;
                                 var9.close();
                                 String var63 = tfhknofirb(anrpmqqlbcmonma(), sihnnxuloikffrd(), var70);
                                 IOException var41 = new IOException(var63);
                                 throw new RuntimeException(var41);
                              }

                              var70 = nyqpyvalizrolwhd(var70, 1145589450);

                              try {
                                 long var42 = 20L;
                                 Thread.sleep(var42);
                                 var70 ^= 647549123;
                              } catch (InterruptedException var71) {
                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var70)) {
                                    case 1604556416:
                                       var70 = nyqpyvalizrolwhd(var70, 33892688);
                                       Thread var45 = Thread.currentThread();
                                       var45.interrupt();
                                       var9.close();
                                       String var64 = tfhknofirb(yuluxaumxsduktt(), sihnnxuloikffrd(), var70);
                                       IOException var47 = new IOException(var64);
                                       throw new RuntimeException(var47);
                                    default:
                                       throw new RuntimeException(new IOException("Error in hash"));
                                 }
                              }

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                                    case 134371176:
                                       var70 ^= 2114508095;
                                       continue label51;
                                    case 337833573:
                                    default:
                                       throw new IllegalStateException();
                                    case 833676282:
                                       break;
                                    case 1527076002:
                                       continue label51;
                                 }
                              }
                           }
                        case 716287078:
                           break;
                        case 1886612821:
                        default:
                           throw new IllegalStateException();
                     }
                  }
               case 1064422206:
               default:
                  throw new IllegalStateException();
               case 799106726:
            }
         }

         String var66 = "Missing Discord socket " + var0;
         IOException var48 = new IOException(var66);
         throw new RuntimeException(var48);
      }
   }

   private static Path ipcPath(int var0) {
      int var31 = 1665300200 ^ 1862449808 ^ 708053962;
      var31 = 504591152 ^ var31;
      String var8 = "discord-ipc-" + var0;
      String var9 = tfhknofirb(yubddusrbdgbxqx(), sihnnxuloikffrd(), var31);
      String var10 = System.getenv(var9);
      if (var10 != null) {
         var31 = 1805053993 ^ var31;
         byte var13 = (byte)((var10.isBlank()) ? 1 : 0);
         if (var13 == (1408320683 ^ var31)) {
            var31 = 1005729513 ^ var31;
            byte var2 = (byte)(1745056323 ^ var31);
            String[] var24 = new String[var2];
            byte var3 = (byte)(1745056322 ^ var31);
            var24[var3] = var8;
            return Path.of(var10, var24);
         }

         label36:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
               case 44246778:
                  var31 ^= 77524455;
               case 564813743:
                  break label36;
               case 900248860:
               default:
                  throw new RuntimeException();
               case 1022600598:
            }
         }
      } else {
         var31 = 1862802894 ^ var31;
      }

      String var16 = tfhknofirb(gisgieiodvigguh(), sihnnxuloikffrd(), var31);
      String var17 = System.getProperty(var16);
      if (var17 != null) {
         var31 = 742505120 ^ var31;
         byte var20 = (byte)((var17.isBlank()) ? 1 : 0);
         if (var20 == (2066617324 ^ var31)) {
            var31 = 777146373 ^ var31;
            byte var25 = (byte)(1434207208 ^ var31);
            String[] var26 = new String[var25];
            byte var27 = (byte)(1434207209 ^ var31);
            var26[var27] = var8;
            return Path.of(var17, var26);
         } else {
            var31 = 872589167 ^ var31;
            return null;
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
               case 157814636:
                  var31 = 407051727 ^ var31;
                  return null;
               case 241642207:
                  return null;
               case 379439522:
                  break;
               case 1767736992:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private boolean readable() throws IOException {
      int var39 = 1804714412 ^ 369177771 ^ 2101207349;
      var39 = 1648537166 ^ var39;
      RandomAccessFile var6 = this.windowsPipe;
      if (var6 != null) {
         var39 = 1423918489 ^ var39;

         byte var54;
         label86: {
            label87: {
               label88: {
                  label71: {
                     try {
                        RandomAccessFile var23 = this.windowsPipe;
                        long var24 = var23.length();
                        long var34 = 0L;
                        long var53;
                        int var26 = (var53 = var24 - var34) == 0L ? 0 : (var53 < 0L ? -1 : 1);
                        if (var26 > (909180901 ^ var39)) {
                           var39 ^= 940714643;
                           var54 = (byte)(237163895 ^ var39);
                           break label86;
                        }
                     } catch (IOException var41) {
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var39)) {
                           case -1316487383:
                              break label88;
                           case 1077948561:
                              break label87;
                           case 1897311152:
                              break label71;
                           default:
                              throw new RuntimeException(new IllegalAccessException("Error in hash"));
                        }
                     }

                     var39 = nyqpyvalizrolwhd(var39, 507050487);

                     try {
                        var54 = (byte)(671614482 ^ var39);
                        var39 ^= 99203765;
                        return (var54 != 0);
                     } catch (Throwable var40) {
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var39)) {
                           case -1316487383:
                              break label88;
                           case 1077948561:
                              break label87;
                           case 1897311152:
                              break;
                           default:
                              throw new RuntimeException(new IllegalAccessException("Error in hash"));
                        }
                     }
                  }

                  var39 = 1458995929 ^ var39;
                  return (((byte)(1490311087 ^ var39)) != 0);
               }

               var39 = 1860479050 ^ var39;
               return (((byte)(1490311087 ^ var39)) != 0);
            }

            var39 = 1893487037 ^ var39;
            return (((byte)(1490311087 ^ var39)) != 0);
         }

         var39 = 600009169 ^ var39;
         return (var54 != 0);
      } else {
         var39 = 1300077784 ^ var39;
         SocketChannel var8 = this.unixChannel;
         if (var8 != null) {
            var39 = 1196219055 ^ var39;
            byte var9 = (byte)(1759443978 ^ var39);
            ByteBuffer var10 = ByteBuffer.allocate(var9);
            SocketChannel var12 = this.unixChannel;
            int var13 = var12.read(var10);
            if (var13 < (1759443979 ^ var39)) {
               var39 = 2062415855 ^ var39;
               String var3 = tfhknofirb(mnavavytqllhurj(), sihnnxuloikffrd(), var39);
               IOException var15 = new IOException(var3);
               throw new RuntimeException(var15);
            } else {
               var39 = nyqpyvalizrolwhd(var39, 2090429543);
               if (var13 == (340234348 ^ var39)) {
                  var39 = 718741848 ^ var39;
                  return (((byte)(1049669940 ^ var39)) != 0);
               } else {
                  var39 = nyqpyvalizrolwhd(var39, 1468826592);
                  byte var33 = (byte)(1137382284 ^ var39);
                  byte var31 = var10.get(var33);
                  this.unixPeek = var31;
                  byte var32 = (byte)(1137382285 ^ var39);
                  this.unixHasPeek = (var32 != 0);
                  return (((byte)(1137382285 ^ var39)) != 0);
               }
            }
         } else {
            var39 = 485262547 ^ var39;
            return (((byte)(863937143 ^ var39)) != 0);
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private void write(int var1, String var2) throws IOException {
      int var68 = 1057044 ^ 1685686140 ^ 2101207349;
      var68 = 1611910187 ^ var68;
      Charset var4 = StandardCharsets.UTF_8;
      byte[] var13 = var2.getBytes(var4);
      byte var14 = (byte)(2034731902 ^ var68);
      int var51 = var13.length;
      int var15 = var14 + var51;
      byte[] var16 = new byte[var15];
      byte[] var9 = var16;
      byte var52 = (byte)(2034731894 ^ var68);
      byte var5 = (byte)(2034731902 ^ var68);
      ByteBuffer var18 = ByteBuffer.wrap(var16, var52, var5);
      ByteOrder var53 = ByteOrder.LITTLE_ENDIAN;
      ByteBuffer var19 = var18.order(var53);
      ByteBuffer var21 = var19.putInt(var1);
      int var56 = var13.length;
      ByteBuffer var23 = var19.putInt(var56);
      byte var57 = (byte)(2034731894 ^ var68);
      byte var6 = (byte)(2034731902 ^ var68);
      int var65 = var13.length;
      System.arraycopy(var13, var57, var16, var6, var65);
      RandomAccessFile var26 = this.windowsPipe;
      if (var26 != null) {
         var68 = 297090980 ^ var68;
         RandomAccessFile var28 = this.windowsPipe;
         var28.write(var16);
      } else {
         var68 = nyqpyvalizrolwhd(var68, 1090714580);
         SocketChannel var30 = this.unixChannel;
         if (var30 == null) {
            var68 = 1095053690 ^ var68;
            String var64 = tfhknofirb(ezhilczcthggiao(), sihnnxuloikffrd(), var68);
            IOException var31 = new IOException(var64);
            throw new RuntimeException(var31);
         } else {
            var68 = 1362494742 ^ var68;
            SocketChannel var33 = this.unixChannel;
            byte var59 = (byte)(1769174453 ^ var68);
            SelectableChannel var34 = var33.configureBlocking((var59 != 0));
            var68 = 594351966 ^ var68;

            label81: {
               Throwable var10000;
               label71: {
                  label70: {
                     label69: {
                        label68: {
                           ByteBuffer var11;
                           try {
                              ByteBuffer var36 = ByteBuffer.wrap(var9);
                              var11 = var36;
                              var68 ^= 2068614047;
                           } catch (Throwable var71) {
                              var10000 = var71;
                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var68)) {
                                 case -1969796183:
                                    break label70;
                                 case 514191856:
                                    break label69;
                                 case 1358108498:
                                    break label68;
                                 default:
                                    throw new RuntimeException("Error in hash");
                              }
                           }

                           label65:
                           while (true) {
                              try {
                                 byte var38 = (byte)((var11.hasRemaining()) ? 1 : 0);
                                 if (var38 == (827517301 ^ var68)) {
                                    break label81;
                                 }

                                 var68 ^= 847664971;
                                 SocketChannel var43 = this.unixChannel;
                                 int var44 = var43.write(var11);
                              } catch (Throwable var70) {
                                 var10000 = var70;
                                 switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var68)) {
                                    case -1969796183:
                                       break label70;
                                    case 514191856:
                                       break label69;
                                    case 1358108498:
                                       break label65;
                                    default:
                                       throw new RuntimeException("Error in hash");
                                 }
                              }

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var68)) {
                                    case 58236027:
                                       continue label65;
                                    case 60256654:
                                       var68 ^= 847664971;
                                       continue label65;
                                    case 240167063:
                                       break;
                                    case 1125703406:
                                    default:
                                       throw new IllegalStateException();
                                 }
                              }
                           }
                        }

                        var68 = 1727978533 ^ var68;
                        break label71;
                     }

                     var68 = nyqpyvalizrolwhd(var68, 791937265);
                     break label71;
                  }

                  var68 = 498227130 ^ var68;
               }

               Throwable var12;
               while (true) {
                  try {
                     Throwable var45 = var10000;
                     var12 = var45;
                     var68 ^= 239495718;
                     break;
                  } catch (Throwable var69) {
                     var10000 = var69;
                     switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var68)) {
                        case 1728444025:
                           var68 ^= 0;
                           break;
                        default:
                           throw new RuntimeException(new IllegalAccessException("Error in hash"));
                     }
                  }
               }

               SocketChannel var47 = this.unixChannel;
               byte var62 = (byte)(581358825 ^ var68);
               SelectableChannel var48 = var47.configureBlocking((var62 != 0));
               throw new RuntimeException(var12);
            }

            var68 = nyqpyvalizrolwhd(var68, 767552045);
            SocketChannel var40 = this.unixChannel;
            byte var60 = (byte)(485294936 ^ var68);
            SelectableChannel var41 = var40.configureBlocking((var60 != 0));
            var68 = nyqpyvalizrolwhd(var68, 214813468);
         }
      }
   }

   private int readPacket() throws IOException {
      int var35 = 662149467 ^ 1546691245 ^ 2101207349;
      var35 = 163027404 ^ var35;
      byte var1 = (byte)(265110279 ^ var35);
      byte[] var10 = new byte[var1];
      this.readFully(var10);
      ByteBuffer var13 = ByteBuffer.wrap(var10);
      ByteOrder var28 = ByteOrder.LITTLE_ENDIAN;
      ByteBuffer var14 = var13.order(var28);
      int var16 = var14.getInt();
      int var18 = var14.getInt();
      if (var18 >= (265110287 ^ var35)) {
         var35 = 377864950 ^ var35;
         int var29 = 424133561 ^ var35;
         if (var18 <= var29) {
            var35 = 712804507 ^ var35;
            byte[] var22 = new byte[var18];
            if (var18 > (859048290 ^ var35)) {
               var35 = 265345220 ^ var35;
               this.readFully(var22);
               var35 = 682423991 ^ var35;
            } else {
               var35 = nyqpyvalizrolwhd(var35, 662449779);
            }

            Charset var4 = StandardCharsets.UTF_8;
            String var31 = new String(var22, var4);
            this.lastJson = var31;
            return var16;
         }

         var35 = 1074123579 ^ var35;
      } else {
         var35 = 1451233741 ^ var35;
      }

      String var32 = tfhknofirb(ktqwejvchxhzkww(), sihnnxuloikffrd(), var35);
      IOException var27 = new IOException(var32);
      throw new RuntimeException(var27);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private void readFully(byte[] var1) throws IOException {
      int var57 = 452826206 ^ 737613254 ^ 2101207349;
      var57 = 1978070471 ^ var57;
      RandomAccessFile var9 = this.windowsPipe;
      if (var9 != null) {
         var57 = 1687150265 ^ var57;
         RandomAccessFile var11 = this.windowsPipe;
         var11.readFully(var1);
      } else {
         var57 = nyqpyvalizrolwhd(var57, 1087662727);
         SocketChannel var13 = this.unixChannel;
         if (var13 == null) {
            var57 = 1859473622 ^ var57;
            String var4 = tfhknofirb(ggofeswsqisantd(), sihnnxuloikffrd(), var57);
            IOException var14 = new IOException(var4);
            throw new RuntimeException(var14);
         } else {
            var57 = nyqpyvalizrolwhd(var57, 476310539);
            byte var15 = (byte)(1701188582 ^ var57);
            byte var6 = var15;
            byte var17 = (byte)((this.unixHasPeek) ? 1 : 0);
            if (var17 != (1701188582 ^ var57)) {
               var57 = 1283828733 ^ var57;
               int var19 = var1.length;
               if (var19 > (702789659 ^ var57)) {
                  var57 = 1031462979 ^ var57;
                  byte var42 = (byte)(345593944 ^ var57);
                  byte var50 = this.unixPeek;
                  var1[var42] = var50;
                  byte var43 = (byte)(345593944 ^ var57);
                  this.unixHasPeek = (var43 != 0);
                  byte var22 = (byte)(345593945 ^ var57);
                  var6 = var22;
                  var57 = 1418681860 ^ var57;
               } else {
                  var57 = 1777712711 ^ var57;
               }
            } else {
               label101:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var57)) {
                     case 74818539:
                        var57 ^= 628102586;
                        break label101;
                     case 370658040:
                        break;
                     case 770896285:
                     default:
                        throw new IllegalStateException();
                     case 1694237100:
                        break label101;
                  }
               }
            }

            SocketChannel var24 = this.unixChannel;
            byte var44 = (byte)(1075185245 ^ var57);
            SelectableChannel var25 = var24.configureBlocking((var44 != 0));
            var57 = 1949047976 ^ var57;

            Throwable var10000;
            label93: {
               label92: {
                  label91: {
                     label90: {
                        label89: {
                           ByteBuffer var7;
                           try {
                              int var52 = var1.length;
                              int var53 = var52 - var6;
                              ByteBuffer var27 = ByteBuffer.wrap(var1, var6, var53);
                              var7 = var27;
                              var57 ^= 761506375;
                           } catch (Throwable var60) {
                              var10000 = var60;
                              switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var57)) {
                                 case -1580148831:
                                    break label92;
                                 case -892500584:
                                    break label90;
                                 case -407371200:
                                    break label91;
                                 case 1308695545:
                                    break label89;
                                 default:
                                    throw new RuntimeException(new IOException("Error in hash"));
                              }
                           }

                           label86:
                           while (true) {
                              label112: {
                                 try {
                                    byte var29 = (byte)((var7.hasRemaining()) ? 1 : 0);
                                    if (var29 != (425308339 ^ var57)) {
                                       var57 ^= 95334651;
                                       SocketChannel var31 = this.unixChannel;
                                       int var32 = var31.read(var7);
                                       if (var32 >= (485949512 ^ var57)) {
                                          break label112;
                                       }

                                       var57 ^= 892805943;
                                       String var54 = tfhknofirb(jsobyjfusclbmvi(), sihnnxuloikffrd(), var57);
                                       IOException var33 = new IOException(var54);
                                       throw new RuntimeException(var33);
                                    }
                                 } catch (Throwable var59) {
                                    var10000 = var59;
                                    switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var57)) {
                                       case -1580148831:
                                          break label92;
                                       case -892500584:
                                          break label90;
                                       case -407371200:
                                          break label91;
                                       case 1308695545:
                                          break label86;
                                       default:
                                          throw new RuntimeException(new IOException("Error in hash"));
                                    }
                                 }

                                 var57 = 548607770 ^ var57;
                                 SocketChannel var40 = this.unixChannel;
                                 byte var48 = (byte)(971679657 ^ var57);
                                 SelectableChannel var41 = var40.configureBlocking((var48 != 0));

                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var57)) {
                                       case 3579197:
                                          var57 = 1214559234 ^ var57;
                                          return;
                                       case 426995384:
                                       default:
                                          throw new IllegalStateException();
                                       case 984519736:
                                          return;
                                       case 1693840905:
                                    }
                                 }
                              }

                              var57 = nyqpyvalizrolwhd(var57, 95334651);
                           }
                        }

                        var57 = 737047319 ^ var57;
                        break label93;
                     }

                     var57 = 460841179 ^ var57;
                     break label93;
                  }

                  var57 = 517558304 ^ var57;
                  break label93;
               }

               var57 = 907299484 ^ var57;
            }

            Throwable var8;
            while (true) {
               try {
                  Throwable var34 = var10000;
                  var8 = var34;
                  var57 ^= 287367691;
                  break;
               } catch (Throwable var58) {
                  var10000 = var58;
                  switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var57)) {
                     case 292717376:
                        var57 ^= 0;
                        break;
                     default:
                        throw new RuntimeException(new IOException("Error in hash"));
                  }
               }
            }

            SocketChannel var36 = this.unixChannel;
            byte var47 = (byte)(319730275 ^ var57);
            SelectableChannel var37 = var36.configureBlocking((var47 != 0));
            throw new RuntimeException(var8);
         }
      }
   }

   private static String stringField(JsonObject var0, String var1) {
      int var14 = 1283231833 ^ 2008110421 ^ 708053962;
      var14 = 1324140951 ^ var14;
      JsonElement var5 = var0.get(var1);
      if (var5 != null) {
         var14 = 1441965393 ^ var14;
         byte var8 = (byte)((var5.isJsonNull()) ? 1 : 0);
         if (var8 == (182952448 ^ var14)) {
            var14 = 1245571242 ^ var14;
            return var5.getAsString();
         } else {
            var14 = 46876311 ^ var14;
            return tfhknofirb(nidromcjytzscfa(), sihnnxuloikffrd(), var14);
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var14)) {
               case 137945401:
                  var14 ^= 1463411654;
                  return tfhknofirb(nidromcjytzscfa(), sihnnxuloikffrd(), var14);
               case 1484125465:
               default:
                  throw new IllegalStateException();
               case 1932047217:
                  break;
               case 2101123886:
                  return tfhknofirb(nidromcjytzscfa(), sihnnxuloikffrd(), var14);
            }
         }
      }
   }

   static {
      int var3 = new Random(4101909798649836640L).nextInt();
      niNPyw7fWB = 750022111 ^ var3;
   }

   public static String tfhknofirb(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] sihnnxuloikffrd() {
      return new byte[]{
         80,
         79,
         47,
         101,
         34,
         29,
         96,
         17,
         60,
         98,
         24,
         28,
         2,
         126,
         127,
         94,
         65,
         17,
         53,
         10,
         44,
         31,
         40,
         111,
         85,
         61,
         48,
         1,
         49,
         25,
         112,
         119,
         99,
         94,
         28,
         116,
         54,
         90,
         65,
         99,
         6,
         127,
         74,
         86,
         20,
         124,
         45,
         6,
         120,
         69,
         24,
         64,
         19
      };
   }

   private static byte[] hstpeovcntyxhev() {
      return new byte[]{
         -100,
         -124,
         26,
         21,
         19,
         71,
         85,
         90,
         12,
         51,
         44,
         70,
         54,
         61,
         76,
         15,
         121,
         1,
         7,
         119,
         25,
         123,
         25,
         31,
         96,
         37,
         0,
         67,
         5,
         69,
         68,
         54,
         80,
         14,
         36,
         100,
         4,
         0,
         116,
         56,
         55,
         56,
         127,
         78,
         36,
         40,
         25,
         92,
         76,
         1,
         43,
         27,
         43,
         4
      };
   }

   private static byte[] anrpmqqlbcmonma() {
      return new byte[]{
         -97,
         -123,
         28,
         22,
         21,
         77,
         81,
         80,
         14,
         56,
         41,
         70,
         49,
         59,
         72,
         3,
         112,
         3,
         7,
         64,
         29,
         69,
         27,
         59,
         98,
         111,
         1,
         86,
         3,
         84,
         65,
         98,
         80,
         10,
         43,
         34,
         7,
         6,
         115,
         52,
         55,
         47,
         121,
         2,
         35,
         49,
         28,
         20,
         74,
         8,
         41,
         28,
         32,
         10,
         120,
         115,
         84,
         127,
         47,
         44,
         32,
         125
      };
   }

   private static byte[] qbjaeuxiuddnxdg() {
      return new byte[]{-100, -128, 25, 39, 27, 95};
   }

   private static byte[] mbhmvlghfmgkjpd() {
      return new byte[]{-97, -126, 28, 51, 27, 91, 81, 12, 5, 58, 41, 79, 49, 42, 70, 14};
   }

   private static byte[] igtoqnofsynxaga() {
      return new byte[0];
   }

   private static byte[] brmbhelrwggswmd() {
      return new byte[]{-97, -126, 28, 43, 27, 65, 81, 76};
   }

   private static byte[] yuluxaumxsduktt() {
      return new byte[]{
         -97,
         -122,
         25,
         25,
         19,
         70,
         85,
         86,
         8,
         48,
         46,
         69,
         58,
         61,
         77,
         15,
         117,
         5,
         4,
         79,
         26,
         72,
         25,
         62,
         96,
         98,
         4,
         85,
         7,
         91,
         72,
         102,
         81,
         8,
         40,
         47,
         7,
         2,
         119,
         53,
         55,
         40,
         127,
         1,
         32,
         57,
         27,
         16,
         64,
         29,
         42,
         27,
         39,
         16,
         126,
         124,
         83,
         104,
         44,
         32,
         36,
         125,
         86,
         89,
         42,
         64,
         70,
         43,
         108,
         16
      };
   }

   private static byte[] yubddusrbdgbxqx() {
      return new byte[]{-105, -124, 25, 14, 16, 105, 85, 103, 8, 4, 44, 120, 49, 25, 79, 37, 112, 113, 12, 119, 26, 97, 26, 26, 96, 83, 4, 124, 5, 102, 67, 23};
   }

   private static byte[] gisgieiodvigguh() {
      return new byte[]{-97, -124, 25, 57, 27, 79, 85, 81, 14, 59, 41, 6, 52, 33, 70, 2, 116, 9, 7, 70, 29, 70, 30, 41, 108, 106, 5, 94, 3, 83};
   }

   private static byte[] nidromcjytzscfa() {
      return new byte[0];
   }

   private static byte[] bvninpwhddpazuc() {
      return new byte[]{-97, -126, 24, 51, 22, 76, 80, 84, 13, 58, 42, 93, 53, 35, 77, 26, 112, 89};
   }

   private static byte[] vjyqrwwrnzafbrv() {
      return new byte[]{
         -97,
         -119,
         27,
         18,
         27,
         66,
         80,
         90,
         4,
         48,
         41,
         74,
         54,
         63,
         70,
         12,
         113,
         9,
         13,
         105,
         29,
         79,
         28,
         63,
         108,
         99,
         0,
         25,
         9,
         120,
         65,
         60,
         87,
         8,
         37,
         49,
         6,
         7,
         121,
         60,
         55,
         37,
         126,
         0,
         45,
         106,
         29,
         75,
         64,
         4,
         41,
         29,
         39,
         2,
         118,
         109,
         85,
         127,
         37,
         53,
         32,
         63,
         86,
         11,
         37,
         79,
         78,
         58
      };
   }

   private static byte[] poiagovytdhnobj() {
      return new byte[]{-100, -123, 29, 55, 19, 65, 87, 67};
   }

   private static byte[] jekirngwmhmfypz() {
      return new byte[]{-100, -123, 29, 7, 19, 105, 87, 115, 14, 15, 45, 111, 51, 12, 78, 61, 119, 106, 7, 105, 30, 103, 25, 10, 98, 82};
   }

   private static byte[] mbcclvndeprjrap() {
      return new byte[]{-100, -123, 29, 58, 19, 67, 87, 73, 14, 51, 45, 75};
   }

   private static byte[] sjugnlgykdtjuce() {
      return new byte[]{-100, -123, 29, 53, 19, 94, 87, 64, 14, 35};
   }

   private static byte[] nlbvfethbsthmyw() {
      return new byte[]{-100, -123, 29, 17, 19, 126, 87, 117, 14, 31, 45, 124};
   }

   private static byte[] ksunqzygxakouhl() {
      return new byte[]{-100, -123, 29, 49, 19, 90, 87, 83};
   }

   private static byte[] nopnpfpaotflrsx() {
      return new byte[]{-97, -119, 27, 33, 19, 70, 84, 65};
   }

   private static byte[] cqhsiqojnzcjkew() {
      return new byte[]{-105, -125, 24, 50, 22, 73, 81, 80, 15, 50, 43, 93, 52, 35, 72, 27, 116, 91};
   }

   private static byte[] eijwrtfzjfcftnz() {
      return new byte[]{-100, -122, 26, 4, 16, 105, 82, 104, 10, 20, 46, 112};
   }

   private static byte[] ovnburaagqeaxjp() {
      return new byte[]{-100, -122, 26, 51, 16, 90, 82, 93};
   }

   private static byte[] gvzlkejhtfblibm() {
      return new byte[]{-99, -120, 27, 43};
   }

   private static byte[] hyyjcopwhvysics() {
      return new byte[]{-99, -120, 27, 62, 21, 67, 89, 72, 5, 52, 32, 70, 58, 61, 77, 56, 113, 65, 6, 86};
   }

   private static byte[] rdczbcgepoihede() {
      return new byte[]{-102, -123, 26, 41, 18, 86};
   }

   private static byte[] ezkfczwasiswfku() {
      return new byte[]{
         -97,
         -124,
         28,
         24,
         27,
         68,
         86,
         85,
         15,
         49,
         41,
         71,
         49,
         53,
         70,
         10,
         119,
         6,
         6,
         115,
         29,
         123,
         27,
         21,
         108,
         45,
         6,
         101,
         2,
         108,
         65,
         23,
         80,
         56,
         37,
         5,
         0,
         46,
         114,
         7,
         55,
         2,
         121,
         57,
         45,
         5,
         27,
         101,
         75,
         44,
         41,
         84,
         32,
         1,
         118,
         126,
         83,
         113,
         46,
         112,
         32,
         102,
         81,
         78,
         37,
         18,
         72,
         58,
         109,
         20,
         32,
         113,
         57,
         121,
         38,
         97
      };
   }

   private static byte[] grktdukldgcxqwj() {
      return new byte[]{-97, -119, 30, 17, 26, 120, 85, 113, 10, 28, 33, 127};
   }

   private static byte[] tbldnfqrnrfhiyf() {
      return new byte[]{-97, -119, 30, 49, 26, 92, 85, 87};
   }

   private static byte[] ltmbcntkakeqkrg() {
      return new byte[]{-103, -128, 28, 42, 27, 83};
   }

   private static byte[] mfeornshuuefkrn() {
      return new byte[]{-103, -123, 30, 56, 17, 75, 85, 73, 10, 54, 45, 72};
   }

   private static byte[] puxuxvlwekckjoe() {
      return new byte[]{
         -97,
         -126,
         29,
         22,
         22,
         70,
         89,
         91,
         5,
         48,
         42,
         65,
         53,
         56,
         77,
         3,
         120,
         8,
         4,
         106,
         30,
         65,
         28,
         62,
         108,
         108,
         9,
         16,
         3,
         123,
         71,
         49,
         81,
         2,
         37,
         62,
         7,
         13,
         115,
         58,
         50,
         46,
         115,
         10,
         45,
         109,
         31,
         81,
         79,
         3,
         42,
         11,
         42,
         6,
         126,
         111,
         87,
         47,
         41,
         114,
         40,
         126,
         91,
         84
      };
   }

   private static byte[] ohnxucuopuicsjl() {
      return new byte[]{
         -103,
         -127,
         27,
         23,
         20,
         70,
         82,
         81,
         10,
         54,
         41,
         71,
         52,
         58,
         77,
         8,
         114,
         7,
         2,
         105,
         24,
         64,
         30,
         62,
         103,
         102,
         6,
         22,
         0,
         125,
         70,
         51,
         81,
         9,
         47,
         49,
         1,
         14,
         117,
         59,
         48,
         46,
         120,
         0,
         34,
         107,
         28,
         87,
         78,
         1,
         42,
         0,
         32,
         9,
         120,
         108,
         81,
         46,
         43,
         114,
         35,
         116,
         84,
         82
      };
   }

   private static byte[] auoumnzwyxuxfpt() {
      return new byte[]{-100, -122, 24, 22, 20, 120, 83, 122, 11, 31, 46, 121};
   }

   private static byte[] mwxucymijvgbdbi() {
      return new byte[]{-100, -122, 24, 54, 20, 92, 83, 92};
   }

   private static byte[] gzybruvwrwemxav() {
      return new byte[]{-101, -120, 25, 38, 17, 89};
   }

   private static byte[] mnavavytqllhurj() {
      return new byte[]{
         -99, -128, 26, 18, 17, 65, 82, 84, 4, 50, 40, 70, 49, 63, 74, 8, 119, 9, 6, 115, 25, 124, 27, 25, 103, 43, 8, 81, 1, 64, 67, 43, 86, 31, 42, 41, 5, 14
      };
   }

   private static byte[] ezhilczcthggiao() {
      return new byte[]{
         -100,
         -128,
         28,
         17,
         18,
         65,
         89,
         91,
         5,
         51,
         42,
         67,
         49,
         60,
         79,
         15,
         120,
         8,
         12,
         113,
         30,
         127,
         27,
         28,
         101,
         40,
         9,
         91,
         8,
         71,
         66,
         40,
         80,
         29,
         44,
         36,
         15,
         7
      };
   }

   private static byte[] ktqwejvchxhzkww() {
      return new byte[]{
         -97,
         -124,
         22,
         20,
         16,
         64,
         89,
         81,
         4,
         49,
         41,
         68,
         59,
         47,
         77,
         9,
         120,
         7,
         13,
         124,
         29,
         66,
         17,
         36,
         103,
         109,
         9,
         88,
         9,
         89,
         65,
         39,
         90,
         70,
         46,
         14,
         15,
         60,
         121,
         18,
         55,
         107,
         115,
         8,
         38,
         61,
         20,
         81,
         64,
         26,
         41,
         17
      };
   }

   private static byte[] ggofeswsqisantd() {
      return new byte[]{
         -99, -119, 22, 20, 23, 70, 83, 83, 9, 50, 33, 74, 55, 57, 77, 9, 112, 4, 6, 122, 21, 122, 29, 30, 102, 44, 5, 81, 8, 76, 69, 45, 81, 30, 45, 36, 5, 7
      };
   }

   private static byte[] jsobyjfusclbmvi() {
      return new byte[]{
         -103,
         -128,
         31,
         21,
         23,
         67,
         88,
         87,
         9,
         54,
         40,
         67,
         54,
         57,
         72,
         2,
         116,
         4,
         2,
         115,
         28,
         123,
         29,
         27,
         109,
         40,
         5,
         85,
         1,
         69,
         68,
         45,
         84,
         21,
         41,
         36,
         1,
         14
      };
   }

   private static int nyqpyvalizrolwhd(int var0, int var1) {
      return var1 ^ var0;
   }
}
