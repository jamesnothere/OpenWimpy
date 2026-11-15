package com.wimpyclient.p;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.protocol.game.ServerboundChatCommandPacket;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class d {
   private static int hPpyazgUh5;
   private transient int zX0H1E5h1F;
   private static String hjdzfcfgls = ByteBuffer.wrap(gibiixfwhyvwkeb()).asCharBuffer().toString();

   private d() {
super();
      int var4 = 1839894081 ^ 2005199691;
      
      var4 = ufiztvockpysktqz(var4, 1691339273);
      var4 = 1755002598 ^ 1356522743 ^ Integer.parseInt("1184922898");
      this.zX0H1E5h1F = 1512964499 ^ hPpyazgUh5;
      var4 = ufiztvockpysktqz(var4, 1839691892);
   }

   public static String withoutSlash(String var0, String var1) {
      int var18 = 226425711 ^ 613226361 ^ 905751796;
      var18 = 888151703 ^ var18;
      String var13;
      if (var0 == null) {
         var18 = 2017271710 ^ var18;
         var13 = zrcvuleeoy(oqjvlsfeypxunqp(), var18);
         var18 = 707681373 ^ var18;
      } else {
         var18 = ufiztvockpysktqz(var18, 152961582);
         var13 = var0.trim();
         var18 = 1527595501 ^ var18;
      }

      String var4 = var13;
      var18 = 462109329 ^ var18;

      while (true) {
         String var3 = zrcvuleeoy(ldmcwsjwsyemjhh(), var18);
         byte var7 = (byte)((var4.startsWith(var3)) ? 1 : 0);
         if (var7 == (1634150183 ^ var18)) {
            var18 = ufiztvockpysktqz(var18, 1596600906);
            byte var9 = (byte)((var4.isEmpty()) ? 1 : 0);            String var14;
            if (var9 != (1045239149 ^ var18)) {
               var18 = 1422403878 ^ var18;
               var14 = var1;
               var18 = ufiztvockpysktqz(var18, 17364516);
            } else {
               var18 = 149626203 ^ var18;
               var14 = var4;
               var18 = 1563148889 ^ var18;
            }

            return var14;
         }

         var18 = 1736438308 ^ var18;
         byte var15 = (byte)(102290690 ^ var18);
         String var11 = var4.substring(var15);
         String var12 = var11.trim();
         var4 = var12;
         var18 = 1736438308 ^ var18;
      }
   }

   public static String argument(String var0, String var1) {
      int var11 = 206607246 ^ 740007710 ^ 905751796;
      var11 = 1165962722 ^ var11;
      String var8;
      if (var0 == null) {
         var11 = 1240426185 ^ var11;
         var8 = zrcvuleeoy(dmgbwijqtkvkyrd(), var11);
         var11 = ufiztvockpysktqz(var11, 593767916);
      } else {
         var11 = 1997432019 ^ var11;
         var8 = var0.trim();
         var11 = 495267830 ^ var11;
      }

      byte var5 = (byte)((var8.isEmpty()) ? 1 : 0);      String var6;
      if (var5 != (977520291 ^ var11)) {
         var11 = 477982297 ^ var11;
         var6 = var1;
         var11 = ufiztvockpysktqz(var11, 1075778824);
      } else {
         var11 = ufiztvockpysktqz(var11, 936162765);
         var6 = var8;
         var11 = 1806618268 ^ var11;
      }

      return var6;
   }

   public static boolean send(LocalPlayer var0, String var1) {
      int var29 = 968203752 ^ 687654699 ^ 905751796;
      var29 = 1842467508 ^ var29;
      if (var0 != null) {
         var29 = 850900902 ^ var29;
         ClientPacketListener var9 = var0.connection;
         if (var9 != null) {
            var29 = 1891951595 ^ var29;
            String var3 = zrcvuleeoy(vbzxtwcpohfhsfr(), var29);
            String var12 = withoutSlash(var1, var3);
            String var5 = var12;
            byte var14 = (byte)((var12.isEmpty()) ? 1 : 0);
            if (var14 != (186085582 ^ var29)) {
               var29 = 70082491 ^ var29;
               return (((byte)(255471477 ^ var29)) != 0);
            }

            var29 = 1982793806 ^ var29;

            try {
               ClientPacketListener var17 = var0.connection;
               var17.sendCommand(var5);
               byte var18 = (byte)(2100852865 ^ var29);
               var29 ^= 1576257821;
               return (var18 != 0);
            } catch (RuntimeException var31) {
               switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var29)) {
                  case -373046269:
                     var29 = ufiztvockpysktqz(var29, 1162429607);
                     var29 = 1997699551 ^ var29;

                     try {
                        ClientPacketListener var21 = var0.connection;
                        ServerboundChatCommandPacket var26 = new ServerboundChatCommandPacket(var5);
                        var21.send(var26);
                        byte var22 = (byte)(1331906041 ^ var29);
                        var29 ^= 1455834092;
                        return (var22 != 0);
                     } catch (RuntimeException var30) {
                        switch (mmlkzeshbalmkmju.rasmxkywoiqxsdyd(var29)) {
                           case 2065313730:
                              var29 = 1524397553 ^ var29;
                              return (((byte)(364851209 ^ var29)) != 0);
                           default:
                              throw new RuntimeException(new IOException("Error in hash"));
                        }
                     }
                  default:
                     throw new RuntimeException(new IOException("Error in hash"));
               }
            }
         }

         var29 = 884444615 ^ var29;
      } else {
         var29 = ufiztvockpysktqz(var29, 100678241);
      }

      return (((byte)(1331961570 ^ var29)) != 0);
   }

   public static boolean send(LocalPlayer var0, String var1, String var2) {
      int var26 = 388764503 ^ 1345875065 ^ 905751796;
      var26 = 1811518837 ^ var26;
      String var4 = zrcvuleeoy(fpvnmmvmzzesjwj(), var26);
      String var8 = withoutSlash(var1, var4);
      String var20;
      if (var2 == null) {
         var26 = 2029600427 ^ var26;
         var20 = zrcvuleeoy(kkxztbngwsnaqgp(), var26);
         var26 = 255213748 ^ var26;
      } else {
         var26 = ufiztvockpysktqz(var26, 1844145715);
         var20 = var2.trim();
         var26 = 438571052 ^ var26;
      }

      byte var12 = (byte)((var8.isEmpty()) ? 1 : 0);
      if (var12 != (1860057264 ^ var26)) {
         var26 = 1467720952 ^ var26;
         return (((byte)(967154760 ^ var26)) != 0);
      } else {
         var26 = ufiztvockpysktqz(var26, 2031468221);
         byte var14 = (byte)((var20.isEmpty()) ? 1 : 0);
         if (var14 != (399214093 ^ var26)) {
            var26 = 1131794291 ^ var26;
            return send(var0, var8);
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var26)) {
                  case 236602482:
                     var26 = 526037260 ^ var26;
                  case 181725801:
                     String var23 = var8 + " " + var20;
                     return send(var0, var23);
                  case 446227262:
                  default:
                     throw new IllegalStateException();
                  case 1801595139:
               }
            }
         }
      }
   }

   static {
      int var3 = new Random(-6677811908322149312L).nextInt();
      hPpyazgUh5 = -562670625 ^ var3;
   }

   public static String zrcvuleeoy(byte[] var0, int var1) {
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
      String var29 = hjdzfcfgls;
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

   private static byte[] ldmcwsjwsyemjhh() {
      return new byte[]{0, 0, 0, 1, 0, 0, 0, 0};
   }

   private static byte[] oqjvlsfeypxunqp() {
      return new byte[]{0, 0, 0, 0, 0, 0, 0, 1};
   }

   private static byte[] dmgbwijqtkvkyrd() {
      return new byte[]{0, 0, 0, 0, 0, 0, 0, 1};
   }

   private static byte[] vbzxtwcpohfhsfr() {
      return new byte[]{0, 0, 0, 0, 0, 0, 0, 1};
   }

   private static byte[] kkxztbngwsnaqgp() {
      return new byte[]{0, 0, 0, 0, 0, 0, 0, 1};
   }

   private static byte[] fpvnmmvmzzesjwj() {
      return new byte[]{0, 0, 0, 0, 0, 0, 0, 1};
   }

   private static byte[] gibiixfwhyvwkeb() {
      return new byte[]{49, 25};
   }

   private static int ufiztvockpysktqz(int var0, int var1) {
      return var0 ^ var1;
   }
}
