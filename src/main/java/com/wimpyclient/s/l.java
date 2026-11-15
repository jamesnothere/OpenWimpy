package com.wimpyclient.s;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.chunk.ProtoChunk;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class l {
   public static final int MIN_Y = -64;
   public static final int HEIGHT = 384;
   public static final int SECTIONS = 24;
   public final int chunkX;
   public final int chunkZ;
   private final byte[][] nibbles;
   private final byte[] uniform;
   private final short[] oceanFloor;
   private static int kVrSb9ztbN;
   private transient int uCiS3Kf91O;
   private static String mzxfeegbwo = ByteBuffer.wrap(vujelvhrfskvdpz()).asCharBuffer().toString();

   private l(int var1, int var2) {
super();
      int var19 = 1474853840 ^ 261068415;
      

      label25:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
            case 189334756:
               var19 = 678764706 ^ var19;
            case 1267048599:
               var19 = 549644988 ^ 1954223634 ^ Integer.parseInt("615199139");
               this.uCiS3Kf91O = 661227789 ^ kVrSb9ztbN;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var19)) {
                     case 153361755:
                        var19 = 1872499188 ^ var19;
                        break label25;
                     case 391835279:
                     default:
                        throw new RuntimeException();
                     case 460422325:
                        break;
                     case 1848526872:
                        break label25;
                  }
               }
            case 887714522:
            default:
               throw new RuntimeException();
            case 1959878326:
         }
      }

      byte var4 = 24;
      byte[][] var10 = new byte[var4][];
      this.nibbles = var10;
      byte var11 = 24;
      byte[] var12 = new byte[var11];
      this.uniform = var12;
      short var13 = 256;
      short[] var14 = new short[var13];
      this.oceanFloor = var14;
      this.chunkX = var1;
      this.chunkZ = var2;
   }

   static l of(ProtoChunk var0) {
      int var102 = 294538046 ^ 568213604 ^ 1114682716;
      var102 = 599051253 ^ var102;
      ChunkPos var69 = var0.getPos();
      int var70 = var69.x;
      ChunkPos var86 = var0.getPos();
      int var87 = var86.z;
      l var1 = new l(var70, var87);
      l var6 = var1;
      byte var15 = (byte)(1368684019 ^ var102);
      int var7 = var15;
      var102 = 1712381522 ^ var102;

      label141:
      while (true) {
         byte var52 = (byte)(931441593 ^ var102);
         if (var7 < var52) {
            var102 = 1292608026 ^ var102;
            LevelChunkSection var18 = var0.getSection(var7);
            LevelChunkSection var8 = var18;
            byte var20 = (byte)((var18.hasOnlyAir()) ? 1 : 0);
            if (var20 != (2056194491 ^ var102)) {
               var102 = 839151510 ^ var102;
               byte[] var22 = var6.uniform;
               byte var71 = (byte)(1217095213 ^ var102);
               var22[var7] = var71;
               var102 = jmsnazzgjuvlyuox(var102, 1631415838);
            } else {
               var102 = jmsnazzgjuvlyuox(var102, 1223648181);
               byte var55 = (byte)(845179406 ^ var102);
               byte var72 = (byte)(845179406 ^ var102);
               byte var88 = (byte)(845179406 ^ var102);
               BlockState var24 = var18.getBlockState(var55, var72, var88);
               byte var25 = m.of(var24);
               byte var9 = var25;
               Object var26 = null;
               byte[] var10 = (byte[])var26;
               byte var27 = (byte)(845179406 ^ var102);
               int var11 = var27;
               var102 = 905959326 ^ var102;

               while (true) {
                  short var56 = (short)(127905168 ^ var102);
                  if (var11 >= var56) {
                     label62:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var102)) {
                           case 119916072:
                              var102 ^= 1840817695;
                              break label62;
                           case 499851574:
                           default:
                              throw new RuntimeException(new IOException());
                           case 632146588:
                              break label62;
                           case 1553807620:
                        }
                     }

                     byte[] var42 = var6.uniform;
                     var42[var7] = var9;
                     byte[][] var44 = var6.nibbles;
                     var44[var7] = var10;
                     var102 = 1133581244 ^ var102;
                     break;
                  }

                  label82: {
                     var102 = 1527404841 ^ var102;
                     byte var73 = (byte)(1553327286 ^ var102);
                     int var58 = var11 & var73;
                     byte var89 = (byte)(1553327281 ^ var102);
                     int var75 = var11 >> var89;
                     byte var4 = (byte)(1553327293 ^ var102);
                     int var91 = var11 >> var4;
                     byte var96 = (byte)(1553327286 ^ var102);
                     int var92 = var91 & var96;
                     BlockState var30 = var8.getBlockState(var58, var75, var92);
                     byte var32 = m.of(var30);
                     if (var10 == null) {
                        var102 = 1255537722 ^ var102;
                        if (var32 == var9) {
                           var102 = 924605080 ^ var102;
                           var102 = jmsnazzgjuvlyuox(var102, 694780076);
                           break label82;
                        }

                        var102 = 120067796 ^ var102;
                        short var35 = (short)(292030039 ^ var102);
                        byte[] var36 = new byte[var35];
                        var10 = var36;
                        byte var37 = (byte)(292032087 ^ var102);
                        int var14 = var37;
                        var102 = 1498736304 ^ var102;

                        while (var14 < var11) {
                           var102 = 661139272 ^ var102;
                           put(var10, var14, var9);
                           var14 += 1867827118 ^ var102;
                           var102 = 661139272 ^ var102;
                        }

                        var102 = 1613707089 ^ var102;
                     } else {
                        label80:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var102)) {
                              case 21336853:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 56768435:
                                 var102 ^= 1954953999;
                              case 1449383104:
                                 break label80;
                              case 1952699921:
                           }
                        }
                     }

                     put(var10, var11, var32);
                     var102 = 539368705 ^ var102;
                  }

                  var11 += 137740982 ^ var102;
                  var102 = 262831911 ^ var102;
               }
            }

            var7 += 699795506 ^ var102;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var102)) {
                  case 13665876:
                     var102 ^= 506635154;
                  case 134127197:
                     continue label141;
                  case 911476827:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1279618552:
               }
            }
         } else {
            label135:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var102)) {
                  case 194067203:
                     var102 ^= 1058956848;
                     break label135;
                  case 266860838:
                     break;
                  case 438569588:
                  default:
                     throw new RuntimeException(new IOException());
                  case 2036585394:
                     break label135;
               }
            }

            byte var45 = (byte)(144362897 ^ var102);
            int var98 = var45;
            var102 = 323859926 ^ var102;

            while (true) {
               byte var65 = (byte)(467105879 ^ var102);
               if (var98 >= var65) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var102)) {
                        case 99705566:
                           var102 = 1820504662 ^ var102;
                           return var6;
                        case 897283492:
                           break;
                        case 1155053329:
                        default:
                           throw new RuntimeException(new IOException());
                        case 1676985626:
                           return var6;
                     }
                  }
               }

               var102 = 1369982583 ^ var102;
               byte var48 = (byte)(1249852976 ^ var102);
               int var99 = var48;
               var102 = 1133139468 ^ var102;

               label115:
               while (true) {
                  byte var66 = (byte)(167077932 ^ var102);
                  if (var99 >= var66) {
                     label124:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var102)) {
                           case 55275521:
                              var102 ^= 1320467340;
                           case 151078229:
                              break label124;
                           case 774366397:
                              break;
                           case 894154056:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }

                     var98 += 1195496369 ^ var102;
                     var102 = 1553378295 ^ var102;
                     break;
                  }

                  var102 ^= 1993617719;
                  short[] var51 = var6.oceanFloor;
                  byte var80 = (byte)(2132891931 ^ var102);
                  int var81 = var80 * var98;
                  int var68 = var99 + var81;
                  Types var94 = Types.OCEAN_FLOOR_WG;
                  int var83 = var0.getHeight(var94, var99, var98);
                  byte var95 = (byte)(2132891914 ^ var102);
                  int var84 = var83 + var95;
                  short var85 = (short)var84;
                  var51[var68] = var85;
                  var99 += 2132891914 ^ var102;

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var102)) {
                        case 105964452:
                           var102 ^= 1993617719;
                           continue label115;
                        case 427561502:
                           break;
                        case 737328973:
                           continue label115;
                        case 1820250930:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               }
            }
         }
      }
   }

   private static void put(byte[] var0, int var1, byte var2) {
      int var31 = 1470726167 ^ 150588149 ^ 1114682716;
      var31 = 1820783151 ^ var31;
      byte var4 = (byte)(1906707856 ^ var31);
      int var9 = var1 >> var4;
      byte var6 = (byte)(1906707856 ^ var31);
      int var12 = var1 & var6;
      byte var21;
      if (var12 == (1906707857 ^ var31)) {
         var31 = 2121485686 ^ var31;
         byte var14 = var0[var9];
         short var23 = (short)(265633815 ^ var31);
         int var15 = var14 & var23;
         int var16 = var15 | var2;
         var21 = (byte)var16;
         var31 = jmsnazzgjuvlyuox(var31, 509768502);
      } else {
         var31 = jmsnazzgjuvlyuox(var31, 1089808442);
         byte var18 = var0[var9];
         byte var26 = (byte)(827532708 ^ var31);
         int var19 = var18 & var26;
         byte var7 = (byte)(827532719 ^ var31);
         int var28 = var2 << var7;
         int var20 = var19 | var28;
         var21 = (byte)var20;
         var31 = 551818874 ^ var31;
      }

      var0[var9] = var21;
   }

   public byte kind(int var1, int var2, int var3) {
      int var60 = 403294103 ^ 325904835 ^ 1696152657;
      var60 = 1896563446 ^ var60;
      byte var5 = (byte)(-527913165 ^ var60);
      if (var2 >= var5) {
         var60 = 1440701567 ^ var60;
         short var37 = (short)(1252527564 ^ var60);
         if (var2 < var37) {
            var60 = 106976469 ^ var60;
            byte var38 = (byte)(-1288198247 ^ var60);
            int var13 = var2 - var38;
            byte var39 = (byte)(1288198237 ^ var60);
            int var14 = var13 >> var39;
            byte[][] var16 = this.nibbles;
            byte[] var17 = var16[var14];
            if (var17 == null) {
               var60 = 905834122 ^ var60;
               byte[] var33 = this.uniform;
               return var33[var14];
            }

            var60 = jmsnazzgjuvlyuox(var60, 1575613270);
            byte var41 = (byte)(287419136 ^ var60);
            int var20 = var2 & var41;
            byte var42 = (byte)(287419143 ^ var60);
            int var21 = var20 << var42;
            byte var6 = (byte)(287419136 ^ var60);
            int var44 = var3 & var6;
            byte var55 = (byte)(287419147 ^ var60);
            int var45 = var44 << var55;
            int var22 = var21 | var45;
            byte var56 = (byte)(287419136 ^ var60);
            int var47 = var1 & var56;
            int var23 = var22 | var47;
            byte var57 = (byte)(287419150 ^ var60);
            int var49 = var23 >> var57;
            byte var25 = var17[var49];
            byte var50 = (byte)(287419150 ^ var60);
            int var27 = var23 & var50;
            int var36;
            if (var27 == (287419151 ^ var60)) {
               var60 = 1498667322 ^ var60;
               byte var53 = (byte)(1215459898 ^ var60);
               var36 = var25 & var53;
               var60 = jmsnazzgjuvlyuox(var60, 1783864031);
            } else {
               var60 = 1618091421 ^ var60;
               byte var51 = (byte)(1901311638 ^ var60);
               int var29 = var25 >> var51;
               byte var52 = (byte)(1901311645 ^ var60);
               var36 = var29 & var52;
               var60 = 1400004216 ^ var60;
            }

            return (byte)var36;
         }

         var60 = 424889774 ^ var60;
      } else {
         var60 = 1284248017 ^ var60;
      }

      return (byte)(1408975138 ^ var60);
   }

   public int oceanFloor(int var1, int var2) {
      int var17 = 533540296 ^ 1706045701 ^ 1696152657;
      var17 = 2084098967 ^ var17;
      short[] var8 = this.oceanFloor;
      byte var5 = (byte)(1667035908 ^ var17);
      int var10 = var1 & var5;
      byte var12 = (byte)(1667035931 ^ var17);
      byte var7 = (byte)(1667035908 ^ var17);
      int var14 = var2 & var7;
      int var13 = var12 * var14;
      int var11 = var10 + var13;
      return var8[var11];
   }

   static {
      int var3 = new Random(3598966122013240547L).nextInt();
      kVrSb9ztbN = 55912666 ^ var3;
   }

   public static String mzkyubhgki(byte[] var0, int var1) {
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
      String var29 = mzxfeegbwo;
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

   private static byte[] vujelvhrfskvdpz() {
      return new byte[0];
   }

   private static int jmsnazzgjuvlyuox(int var0, int var1) {
      return var0 ^ var1;
   }
}
