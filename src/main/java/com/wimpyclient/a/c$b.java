package com.wimpyclient.a;

import java.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class c$b {
   private final String name;
   private final UUID uuid;
   private final String accessToken;
   private final String refreshToken;
   private final String xuid;
   private final String clientId;
   private static int fUrQzIvfHw;
   private transient int ZQdxZT8w96;
   private static String ymnojqiokh = ByteBuffer.wrap(udfopyueueovcob()).asCharBuffer().toString();

   public c$b(String name, UUID uuid, String accessToken, String refreshToken, String xuid, String clientId) {
super();
      int var22 = 305591794 ^ 2126083402;
      
      var22 = 1138351733 ^ var22;
      var22 = 38666903 ^ 1894651410 ^ Integer.parseInt("1576421960");
      this.ZQdxZT8w96 = 312596485 ^ fUrQzIvfHw;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var22)) {
            case 196573435:
               var22 = 998533815 ^ var22;
            case 1174334651:
               this.name = name;
               this.uuid = uuid;
               this.accessToken = accessToken;
               this.refreshToken = refreshToken;
               this.xuid = xuid;
               this.clientId = clientId;
               return;
            case 724427408:
               break;
            case 1263210624:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   @Override
   public final String toString() {
      int var5 = 499969379 ^ 1158003894 ^ 1976259610;
      var5 = 1515226804 ^ var5;
      return "c$b[name=" + this.name + ", uuid=" + this.uuid + ", accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", xuid=" + this.xuid + ", clientId=" + this.clientId + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 1897329450 ^ 793172048 ^ 1976259610;
      var5 = 964157195 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.name);
      result = 31 * result + Objects.hashCode(this.uuid);
      result = 31 * result + Objects.hashCode(this.accessToken);
      result = 31 * result + Objects.hashCode(this.refreshToken);
      result = 31 * result + Objects.hashCode(this.xuid);
      result = 31 * result + Objects.hashCode(this.clientId);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 138904023 ^ 941260475 ^ 1976259610;
      var7 = 937491396 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      c$b other = (c$b)var1;
      return Objects.equals(this.name, other.name) &&
      Objects.equals(this.uuid, other.uuid) &&
      Objects.equals(this.accessToken, other.accessToken) &&
      Objects.equals(this.refreshToken, other.refreshToken) &&
      Objects.equals(this.xuid, other.xuid) &&
      Objects.equals(this.clientId, other.clientId);
   }

   public String name() {
      int var5 = 1556597656 ^ 715992431 ^ 1976259610;
      var5 = 1032330362 ^ var5;
      return this.name;
   }

   public UUID uuid() {
      int var5 = 1676800782 ^ 1440014343 ^ 1976259610;
      var5 = 1311612762 ^ var5;
      return this.uuid;
   }

   public String accessToken() {
      int var5 = 1466881613 ^ 369524784 ^ 1976259610;
      var5 = 856126907 ^ var5;
      return this.accessToken;
   }

   public String refreshToken() {
      int var5 = 1781538977 ^ 440763879 ^ 1976259610;
      var5 = 2003448862 ^ var5;
      return this.refreshToken;
   }

   public String xuid() {
      int var5 = 6489084 ^ 747978616 ^ 1976259610;
      var5 = 1178441199 ^ var5;
      return this.xuid;
   }

   public String clientId() {
      int var5 = 1593651142 ^ 590925863 ^ 1976259610;
      var5 = 585904011 ^ var5;
      return this.clientId;
   }

   static {
      int var3 = new Random(-2358670823658491445L).nextInt();
      fUrQzIvfHw = 1671965285 ^ var3;
   }

   public static String edjlzomkqp(byte[] var0, int var1) {
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
      String var29 = ymnojqiokh;
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

   private static byte[] udfopyueueovcob() {
      return new byte[0];
   }
}
