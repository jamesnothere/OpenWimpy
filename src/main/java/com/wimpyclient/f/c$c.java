package com.wimpyclient.f;

import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData;

@Environment(EnvType.CLIENT)
final class c$c {
   public final int chunkX;
   public final int chunkZ;
   public final ClientboundLightUpdatePacketData data;
   public final boolean chunkPacket;
   private static int XY3y9QuNl0;
   private transient int VtcoQkBPl5;
   private static String ztqrtclzha = ByteBuffer.wrap(dyjfjonsuknqida()).asCharBuffer().toString();

   public c$c(int chunkX, int chunkZ, ClientboundLightUpdatePacketData data, boolean chunkPacket) {
super();
      int var16 = 803508700 ^ 488971850;
      
      var16 = 622092910 ^ var16;
      var16 = 1848691640 ^ 2091697200 ^ Integer.parseInt("88728176");
      this.VtcoQkBPl5 = 142216332 ^ XY3y9QuNl0;
      var16 = 1500715015 ^ var16;
      this.chunkX = chunkX;
      this.chunkZ = chunkZ;
      this.data = data;
      this.chunkPacket = chunkPacket;
   }

   @Override
   public final String toString() {
      int var5 = 1515164023 ^ 1935204861 ^ 1133906257;
      var5 = 152686089 ^ var5;
      return "c$c[chunkX=" + this.chunkX + ", chunkZ=" + this.chunkZ + ", data=" + this.data + ", chunkPacket=" + this.chunkPacket + "]";
   }

   @Override
   public final int hashCode() {
      int var5 = 97034875 ^ 421233947 ^ 1133906257;
      var5 = 555162204 ^ var5;
      int result = 0;
      result = 31 * result + Objects.hashCode(this.chunkX);
      result = 31 * result + Objects.hashCode(this.chunkZ);
      result = 31 * result + Objects.hashCode(this.data);
      result = 31 * result + Objects.hashCode(this.chunkPacket);
      return result;
   }

   @Override
   public final boolean equals(Object var1) {
      int var7 = 1331541275 ^ 239543280 ^ 1133906257;
      var7 = 299819628 ^ var7;
      if (this == var1) {
      return true;
      }
      if (var1 == null || getClass() != var1.getClass()) {
      return false;
      }
      c$c other = (c$c)var1;
      return this.chunkX == other.chunkX &&
      this.chunkZ == other.chunkZ &&
      Objects.equals(this.data, other.data) &&
      this.chunkPacket == other.chunkPacket;
   }

   public int chunkX() {
      int var5 = 722984902 ^ 1729578063 ^ 1133906257;
      var5 = 1322751577 ^ var5;
      return this.chunkX;
   }

   public int chunkZ() {
      int var5 = 391634702 ^ 1312237494 ^ 1133906257;
      var5 = 1519875840 ^ var5;
      return this.chunkZ;
   }

   public ClientboundLightUpdatePacketData data() {
      int var5 = 574954783 ^ 9225120 ^ 1133906257;
      var5 = 1755794558 ^ var5;
      return this.data;
   }

   public boolean chunkPacket() {
      int var5 = 581801662 ^ 669495697 ^ 1133906257;
      var5 = 1893878425 ^ var5;
      return this.chunkPacket;
   }

   static {
      int var3 = new Random(-7043118432322083799L).nextInt();
      XY3y9QuNl0 = 267916737 ^ var3;
   }

   public static String dhjzcdmxxs(byte[] var0, int var1) {
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
      String var29 = ztqrtclzha;
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
            Charset var89 = StandardCharsets.UTF_16BE;
            return new String(var11, var89);
         }

         byte var86 = var11[var12];
         int var93 = var8.length;
         int var92 = var12 % var93;
         byte var91 = var8[var92];
         int var87 = var86 ^ var91;
         byte var88 = (byte)var87;
         var11[var12] = var88;
         var12++;
      }
   }

   private static byte[] dyjfjonsuknqida() {
      return new byte[0];
   }
}
