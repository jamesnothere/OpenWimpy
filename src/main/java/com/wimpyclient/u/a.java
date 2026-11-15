package com.wimpyclient.u;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class a {
   private static int f6CeEpj0thw;
   private transient int M1EzXUpvdC;
   private static String yadtrxqupm = ByteBuffer.wrap(ctnqjmphpjtolvi()).asCharBuffer().toString();

   private a() {
super();
      int var4 = 1573174866 ^ 531689721;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 12655135:
               var4 = 642289496 ^ var4;
            case 1111851206:
               var4 = 1917212694 ^ 767166182 ^ Integer.parseInt("1002479363");
               this.M1EzXUpvdC = 911687217 ^ f6CeEpj0thw;
               var4 = wxaosivcmfstxsxw(var4, 849064791);
               return;
            case 864996125:
            default:
               throw new IllegalStateException();
            case 1891377469:
         }
      }
   }

   static BlockState state(int var0, int var1) {
      int var110;
      label518: {
         var110 = 265377879 ^ 655005591 ^ 28208402;
         var110 = 1613617919 ^ var110;
         label451:
         switch (var0) {
            case 1:
               label307:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 1199951631;
                        break label307;
                     case 517959336:
                        break;
                     case 968072225:
                        break label307;
                     case 2032398858:
                     default:
                        throw new RuntimeException();
                  }
               }

               Block var7 = Blocks.STONE;
               BlockState var217 = var7.defaultBlockState();
               var110 = 1841344464 ^ var110;
               return var217;
            case 2:
               label370:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 138275565:
                        break label370;
                     case 236659087:
                        var110 ^= 1371939120;
                        break label370;
                     case 1598386849:
                     default:
                        throw new RuntimeException();
                     case 1599209479:
                  }
               }

               Block var51 = Blocks.GRASS_BLOCK;
               BlockState var216 = var51.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 261895083:
                     default:
                        throw new RuntimeException();
                     case 263377974:
                        var110 = 2072199663 ^ var110;
                        return var216;
                     case 646226541:
                        break;
                     case 1752639849:
                        return var216;
                  }
               }
            case 3:
               label167:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 1006739142;
                     case 940962804:
                        break label167;
                     case 1893335640:
                     default:
                        throw new RuntimeException();
                     case 2007594233:
                  }
               }

               Block var40 = Blocks.DIRT;
               BlockState var215 = var40.defaultBlockState();
               var110 = 373620249 ^ var110;
               return var215;
            case 4:
               var110 = 819961555 ^ var110;
               Block var48 = Blocks.COBBLESTONE;
               BlockState var214 = var48.defaultBlockState();
               var110 = 446365196 ^ var110;
               return var214;
            case 5:
               label181:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 2110755113;
                        break label181;
                     case 690536094:
                     default:
                        throw new RuntimeException();
                     case 905098798:
                        break;
                     case 1721673738:
                        break label181;
                  }
               }

               BlockState var213 = woodPlanks(var1);
               var110 = 1468723702 ^ var110;
               return var213;
            case 7:
               var110 = 871575188 ^ var110;
               Block var17 = Blocks.BEDROCK;
               BlockState var212 = var17.defaultBlockState();
               var110 = 431377995 ^ var110;
               return var212;
            case 12:
               var110 = wxaosivcmfstxsxw(var110, 1525608664);
               Block var39 = Blocks.SAND;
               BlockState var211 = var39.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 1890291719);
               return var211;
            case 13:
               var110 = wxaosivcmfstxsxw(var110, 1168714221);
               Block var10 = Blocks.GRAVEL;
               BlockState var210 = var10.defaultBlockState();
               var110 = 1877756210 ^ var110;
               return var210;
            case 14:
               var110 = 375293732 ^ var110;
               Block var22 = Blocks.GOLD_ORE;
               BlockState var209 = var22.defaultBlockState();
               var110 = 1008461819 ^ var110;
               return var209;
            case 15:
               var110 = wxaosivcmfstxsxw(var110, 1619564363);
               Block var61 = Blocks.IRON_ORE;
               BlockState var223 = var61.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 17098245:
                        var110 = 1255012244 ^ var110;
                        return var223;
                     case 149862777:
                        return var223;
                     case 802621942:
                     default:
                        throw new RuntimeException();
                     case 841913217:
                  }
               }
            case 16:
               var110 = wxaosivcmfstxsxw(var110, 66482638);
               Block var8 = Blocks.COAL_ORE;
               BlockState var208 = var8.defaultBlockState();
               var110 = 699601169 ^ var110;
               return var208;
            case 17:
               var110 = 1545476085 ^ var110;
               BlockState var207 = log(var1);
               var110 = 1985705770 ^ var110;
               return var207;
            case 18:
               label356:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 167713110;
                     case 727282808:
                        break label356;
                     case 753665378:
                     default:
                        throw new RuntimeException();
                     case 1399334344:
                  }
               }

               BlockState var206 = leaves(var1);
               var110 = wxaosivcmfstxsxw(var110, 599423369);
               return var206;
            case 20:
               var110 = wxaosivcmfstxsxw(var110, 538844335);
               Block var19 = Blocks.GLASS;
               BlockState var205 = var19.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 173767792);
               return var205;
            case 21:
               var110 = wxaosivcmfstxsxw(var110, 1433592189);
               Block var49 = Blocks.LAPIS_ORE;
               BlockState var204 = var49.defaultBlockState();
               var110 = 2134344098 ^ var110;
               return var204;
            case 22:
               var110 = 472168478 ^ var110;
               Block var50 = Blocks.LAPIS_BLOCK;
               BlockState var222 = var50.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 94495006:
                        var110 = 912382145 ^ var110;
                        return var222;
                     case 755354310:
                        return var222;
                     case 1768948905:
                        break;
                     case 1984679209:
                     default:
                        throw new RuntimeException();
                  }
               }
            case 24:
               var110 = 789694622 ^ var110;
               Block var27 = Blocks.SANDSTONE;
               BlockState var203 = var27.defaultBlockState();
               var110 = 89434177 ^ var110;
               return var203;
            case 35:
               var110 = wxaosivcmfstxsxw(var110, 946053241);
               BlockState var202 = wool(var1);
               var110 = 304529574 ^ var110;
               return var202;
            case 41:
               label174:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 36249396:
                        break label174;
                     case 236659087:
                        var110 ^= 96025607;
                        break label174;
                     case 249637815:
                     default:
                        throw new RuntimeException();
                     case 989041001:
                  }
               }

               Block var29 = Blocks.GOLD_BLOCK;
               BlockState var201 = var29.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 805067992);
               return var201;
            case 42:
               var110 = 1412280139 ^ var110;
               Block var26 = Blocks.IRON_BLOCK;
               BlockState var200 = var26.defaultBlockState();
               var110 = 2120798100 ^ var110;
               return var200;
            case 43:
               var110 = 2082706366 ^ var110;
               BlockState var199 = doubleSlab(var1);
               var110 = 1449587553 ^ var110;
               return var199;
            case 44:
               label272:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 1716517752;
                        break label272;
                     case 403592558:
                     default:
                        throw new RuntimeException();
                     case 471176141:
                        break;
                     case 1918023564:
                        break label272;
                  }
               }

               BlockState var198 = slab(var1);
               var110 = 1275763623 ^ var110;
               return var198;
            case 45:
               label314:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 1715014812;
                        break label314;
                     case 995094235:
                        break;
                     case 1361342953:
                     default:
                        throw new RuntimeException();
                     case 1791377673:
                        break label314;
                  }
               }

               Block var37 = Blocks.BRICKS;
               BlockState var197 = var37.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 1283222595);
               return var197;
            case 47:
               var110 = wxaosivcmfstxsxw(var110, 1968549855);
               Block var47 = Blocks.BOOKSHELF;
               BlockState var196 = var47.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 73068137:
                        var110 = 1594937088 ^ var110;
                        return var196;
                     case 170736529:
                        break;
                     case 364090080:
                     default:
                        throw new RuntimeException();
                     case 1553949466:
                        return var196;
                  }
               }
            case 48:
               var110 = 1649670315 ^ var110;
               Block var45 = Blocks.MOSSY_COBBLESTONE;
               BlockState var195 = var45.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 1209440372);
               return var195;
            case 49:
               var110 = wxaosivcmfstxsxw(var110, 2033172543);
               Block var58 = Blocks.OBSIDIAN;
               BlockState var194 = var58.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 79117294:
                        break;
                     case 233293013:
                        var110 = 1399496928 ^ var110;
                        return var194;
                     case 1783435176:
                     default:
                        throw new RuntimeException();
                     case 2104549396:
                        return var194;
                  }
               }
            case 50:
               var110 = wxaosivcmfstxsxw(var110, 958391540);
               Block var13 = Blocks.TORCH;
               BlockState var193 = var13.defaultBlockState();
               var110 = 324699179 ^ var110;
               return var193;
            case 53:
               var110 = wxaosivcmfstxsxw(var110, 921131018);
               Block var31 = Blocks.OAK_STAIRS;
               BlockState var221 = var31.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 125972980:
                        var110 = 480393429 ^ var110;
                        return var221;
                     case 450953646:
                        return var221;
                     case 792251935:
                     default:
                        throw new RuntimeException();
                     case 1685244806:
                  }
               }
            case 56:
               var110 = 2013959637 ^ var110;
               Block var5 = Blocks.DIAMOND_ORE;
               BlockState var192 = var5.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 261135426:
                        var110 = 1380971786 ^ var110;
                        return var192;
                     case 607571630:
                        break;
                     case 798443239:
                     default:
                        throw new RuntimeException();
                     case 1036256378:
                        return var192;
                  }
               }
            case 57:
               label195:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 1592712791;
                     case 423708685:
                        break label195;
                     case 1313292633:
                     default:
                        throw new RuntimeException();
                     case 1469703248:
                  }
               }

               Block var4 = Blocks.DIAMOND_BLOCK;
               BlockState var191 = var4.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 233960762:
                        var110 = 1957412488 ^ var110;
                        return var191;
                     case 295974946:
                        break;
                     case 1120600120:
                     default:
                        throw new RuntimeException();
                     case 1591452781:
                        return var191;
                  }
               }
            case 58:
               label237:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 430103859;
                        break label237;
                     case 1323610170:
                     default:
                        throw new RuntimeException();
                     case 1860477180:
                        break;
                     case 2056974346:
                        break label237;
                  }
               }

               Block var32 = Blocks.CRAFTING_TABLE;
               BlockState var190 = var32.defaultBlockState();
               var110 = 870825452 ^ var110;
               return var190;
            case 60:
               var110 = wxaosivcmfstxsxw(var110, 1100157308);
               Block var44 = Blocks.FARMLAND;
               BlockState var189 = var44.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 1809215907);
               return var189;
            case 61:
               var110 = wxaosivcmfstxsxw(var110, 1645667828);
               break label518;
            case 62:
               var110 = 1645667828 ^ var110;
               break label518;
            case 67:
               var110 = 747284144 ^ var110;
               Block var54 = Blocks.COBBLESTONE_STAIRS;
               BlockState var188 = var54.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 88664706:
                        var110 = 114280047 ^ var110;
                        return var188;
                     case 1754135470:
                     default:
                        throw new RuntimeException();
                     case 1918539569:
                        break;
                     case 2071374583:
                        return var188;
                  }
               }
            case 73:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 145853760;
                        break label451;
                     case 1051787302:
                        break;
                     case 1656986159:
                        break label451;
                     case 1995964031:
                     default:
                        throw new RuntimeException();
                  }
               }
            case 74:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 187456794:
                        break label451;
                     case 198744640:
                     default:
                        throw new RuntimeException();
                     case 236659087:
                        var110 ^= 145853760;
                        break label451;
                     case 252490141:
                  }
               }
            case 79:
               label251:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 559903923;
                        break label251;
                     case 961704316:
                     default:
                        throw new RuntimeException();
                     case 1071432476:
                        break;
                     case 2021581063:
                        break label251;
                  }
               }

               Block var18 = Blocks.ICE;
               BlockState var186 = var18.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 160284789:
                        var110 = 186258540 ^ var110;
                        return var186;
                     case 631967575:
                        break;
                     case 1639354900:
                        return var186;
                     case 1891912966:
                     default:
                        throw new RuntimeException();
                  }
               }
            case 80:
               var110 = wxaosivcmfstxsxw(var110, 878792618);
               Block var42 = Blocks.SNOW_BLOCK;
               BlockState var185 = var42.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 505687925);
               return var185;
            case 82:
               label377:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 693931393;
                        break label377;
                     case 402721575:
                     default:
                        throw new RuntimeException();
                     case 840226188:
                        break label377;
                     case 1182151964:
                  }
               }

               Block var38 = Blocks.CLAY;
               BlockState var184 = var38.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 52030814);
               return var184;
            case 87:
               label328:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 605996507;
                     case 384819865:
                        break label328;
                     case 490859110:
                        break;
                     case 1897221565:
                     default:
                        throw new RuntimeException();
                  }
               }

               Block var41 = Blocks.NETHERRACK;
               BlockState var219 = var41.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 62487882:
                        var110 = 240887044 ^ var110;
                        return var219;
                     case 689955742:
                        return var219;
                     case 889590255:
                     default:
                        throw new RuntimeException();
                     case 971588999:
                  }
               }
            case 88:
               label342:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 1178891256;
                     case 595011762:
                        break label342;
                     case 960988030:
                     default:
                        throw new RuntimeException();
                     case 1439140807:
                  }
               }

               Block var21 = Blocks.SOUL_SAND;
               BlockState var183 = var21.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 222714352:
                        var110 = 1812009767 ^ var110;
                        return var183;
                     case 274811123:
                        break;
                     case 328189019:
                        return var183;
                     case 747895579:
                     default:
                        throw new RuntimeException();
                  }
               }
            case 89:
               var110 = wxaosivcmfstxsxw(var110, 610709325);
               Block var57 = Blocks.GLOWSTONE;
               BlockState var182 = var57.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 237227922);
               return var182;
            case 98:
               label216:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 58485446;
                        break label216;
                     case 498529202:
                     default:
                        throw new RuntimeException();
                     case 687932854:
                        break label216;
                     case 703689598:
                  }
               }

               Block var33 = Blocks.STONE_BRICKS;
               BlockState var181 = var33.defaultBlockState();
               var110 = 691603993 ^ var110;
               return var181;
            case 108:
               var110 = wxaosivcmfstxsxw(var110, 1080043163);
               Block var24 = Blocks.BRICK_STAIRS;
               BlockState var180 = var24.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 1780827716);
               return var180;
            case 109:
               var110 = 474220984 ^ var110;
               Block var11 = Blocks.STONE_BRICK_STAIRS;
               BlockState var179 = var11.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 82266380:
                        var110 = 906062183 ^ var110;
                        return var179;
                     case 356908535:
                     default:
                        throw new RuntimeException();
                     case 474659690:
                        return var179;
                     case 1629219229:
                  }
               }
            case 112:
               var110 = 1803028112 ^ var110;
               Block var9 = Blocks.NETHER_BRICKS;
               BlockState var178 = var9.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 1094542927);
               return var178;
            case 121:
               var110 = wxaosivcmfstxsxw(var110, 713872288);
               Block var43 = Blocks.END_STONE;
               BlockState var177 = var43.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 13218687);
               return var177;
            case 125:
               var110 = wxaosivcmfstxsxw(var110, 648039709);
               BlockState var176 = woodPlanks(var1);
               var110 = wxaosivcmfstxsxw(var110, 216346050);
               return var176;
            case 126:
               label286:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 236659087:
                        var110 ^= 2072033891;
                     case 704431397:
                        break label286;
                     case 972035818:
                        break;
                     case 1062456232:
                     default:
                        throw new RuntimeException();
                  }
               }

               BlockState var175 = woodSlab(var1);
               var110 = wxaosivcmfstxsxw(var110, 1371921084);
               return var175;
            case 133:
               var110 = 267246175 ^ var110;
               Block var15 = Blocks.EMERALD_BLOCK;
               BlockState var174 = var15.defaultBlockState();
               var110 = 631814784 ^ var110;
               return var174;
            case 152:
               var110 = wxaosivcmfstxsxw(var110, 1900374238);
               Block var30 = Blocks.REDSTONE_BLOCK;
               BlockState var218 = var30.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 213412043:
                        var110 = 1526728705 ^ var110;
                        return var218;
                     case 469699469:
                        return var218;
                     case 1146011336:
                     default:
                        throw new RuntimeException();
                     case 1212548282:
                  }
               }
            case 155:
               label230:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 151260536:
                        break;
                     case 236659087:
                        var110 ^= 954410927;
                     case 440099067:
                        break label230;
                     case 1839204775:
                     default:
                        throw new RuntimeException();
                  }
               }

               Block var46 = Blocks.QUARTZ_BLOCK;
               BlockState var173 = var46.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 207321264:
                        var110 = 312887152 ^ var110;
                        return var173;
                     case 939223227:
                        return var173;
                     case 1296005528:
                     default:
                        throw new RuntimeException();
                     case 2011704376:
                  }
               }
            case 159:
               var110 = wxaosivcmfstxsxw(var110, 267057951);
               BlockState var172 = terracotta(var1);
               var110 = wxaosivcmfstxsxw(var110, 632265664);
               return var172;
            case 168:
               var110 = 1689334139 ^ var110;
               Block var59 = Blocks.PRISMARINE;
               BlockState var171 = var59.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 1324634532);
               return var171;
            case 169:
               var110 = 448521404 ^ var110;
               Block var3 = Blocks.SEA_LANTERN;
               BlockState var170 = var3.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 821986403);
               return var170;
            case 172:
               var110 = wxaosivcmfstxsxw(var110, 584586835);
               Block var55 = Blocks.TERRACOTTA;
               BlockState var169 = var55.defaultBlockState();
               var110 = 144537228 ^ var110;
               return var169;
            case 173:
               var110 = 2085332517 ^ var110;
               Block var25 = Blocks.COAL_BLOCK;
               BlockState var168 = var25.defaultBlockState();
               var110 = wxaosivcmfstxsxw(var110, 1443809018);
               return var168;
            case 174:
               label398:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 99700624:
                        break label398;
                     case 236659087:
                        var110 ^= 981852284;
                        break label398;
                     case 1580094591:
                     default:
                        throw new RuntimeException();
                     case 1742490330:
                  }
               }

               Block var60 = Blocks.PACKED_ICE;
               BlockState var167 = var60.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 8201409:
                        var110 = 281051299 ^ var110;
                        return var167;
                     case 161868551:
                     default:
                        throw new RuntimeException();
                     case 1723561414:
                        break;
                     case 2015984267:
                        return var167;
                  }
               }
            case 179:
               var110 = wxaosivcmfstxsxw(var110, 929790742);
               Block var53 = Blocks.RED_SANDSTONE;
               BlockState var166 = var53.defaultBlockState();

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
                     case 75671665:
                        var110 = 489561033 ^ var110;
                        return var166;
                     case 860772983:
                        break;
                     case 1527742201:
                        return var166;
                     case 1964498481:
                     default:
                        throw new RuntimeException();
                  }
               }
            default:
               var110 = 989737748 ^ var110;
               Block var12 = Blocks.AIR;
               BlockState var23 = var12.defaultBlockState();
               var110 = 280712139 ^ var110;
               return var23;
         }

         Block var34 = Blocks.REDSTONE_ORE;
         BlockState var187 = var34.defaultBlockState();

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
               case 263522922:
                  var110 = 586476959 ^ var110;
                  return var187;
               case 640121120:
               default:
                  throw new RuntimeException();
               case 1980759014:
                  break;
               case 1999808728:
                  return var187;
            }
         }
      }

      Block var35 = Blocks.FURNACE;
      BlockState var220 = var35.defaultBlockState();

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var110)) {
            case 65567386:
               var110 = 1213433131 ^ var110;
               return var220;
            case 1168196404:
               return var220;
            case 1405720066:
               break;
            case 1829329929:
            default:
               throw new RuntimeException();
         }
      }
   }

   private static BlockState woodPlanks(int var0) {
      int var13 = 1108092601 ^ 2030663321 ^ 28208402;
      var13 = 989595908 ^ var13;
      byte var2 = (byte)(5714993 ^ var13);
      int var3 = var0 & var2;
      BlockState var8;
      switch (var3) {
         case 1:
            label51:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
                  case 5357733:
                     var13 ^= 978263502;
                  case 169268620:
                     break label51;
                  case 957250754:
                  default:
                     throw new IllegalStateException();
                  case 1114844169:
               }
            }

            Block var6 = Blocks.SPRUCE_PLANKS;
            var8 = var6.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
                  case 9366344:
                     var13 = 179300697 ^ var13;
                     return var8;
                  case 1137686577:
                     break;
                  case 1204668588:
                     return var8;
                  case 1457366634:
                  default:
                     throw new IllegalStateException();
               }
            }
         case 2:
            var13 = 297235244 ^ var13;
            Block var5 = Blocks.BIRCH_PLANKS;
            var8 = var5.defaultBlockState();
            var13 = 559384507 ^ var13;
            break;
         case 3:
            var13 = wxaosivcmfstxsxw(var13, 1122480335);
            Block var10 = Blocks.JUNGLE_PLANKS;
            var8 = var10.defaultBlockState();
            var13 = wxaosivcmfstxsxw(var13, 1913078872);
            break;
         case 4:
            label58:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
                  case 5357733:
                     var13 ^= 1165889516;
                  case 55598977:
                     break label58;
                  case 696515075:
                     break;
                  case 1488230320:
                  default:
                     throw new IllegalStateException();
               }
            }

            Block var4 = Blocks.ACACIA_PLANKS;
            var8 = var4.defaultBlockState();
            var13 = 1973353339 ^ var13;
            break;
         case 5:
            label37:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
                  case 5357733:
                     var13 ^= 746465365;
                  case 1401139357:
                     break label37;
                  case 1575930849:
                  default:
                     throw new IllegalStateException();
                  case 1972847953:
               }
            }

            Block var7 = Blocks.DARK_OAK_PLANKS;
            var8 = var7.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
                  case 93293270:
                     var13 = 480173250 ^ var13;
                     return var8;
                  case 871760288:
                     return var8;
                  case 1132615345:
                  default:
                     throw new IllegalStateException();
                  case 1573248158:
               }
            }
         default:
            var13 = 475176213 ^ var13;
            Block var9 = Blocks.OAK_PLANKS;
            var8 = var9.defaultBlockState();
            var13 = 749889922 ^ var13;
      }

      return var8;
   }

   private static BlockState log(int var0) {
      int var11 = 1365033642 ^ 14246194 ^ 28208402;
      var11 = 260917849 ^ var11;
      byte var2 = (byte)(1604748496 ^ var11);
      int var3 = var0 & var2;
      BlockState var5;
      switch (var3) {
         case 1:
            var11 = wxaosivcmfstxsxw(var11, 1755609010);
            Block var6 = Blocks.SPRUCE_LOG;
            var5 = var6.defaultBlockState();
            var11 = wxaosivcmfstxsxw(var11, 1340380490);
            break;
         case 2:
            var11 = 36236514 ^ var11;
            Block var7 = Blocks.BIRCH_LOG;
            var5 = var7.defaultBlockState();
            var11 = wxaosivcmfstxsxw(var11, 627576346);
            break;
         case 3:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var11)) {
                  case 156434174:
                     var11 ^= 633877085;
                  case 590712493:
                     Block var4 = Blocks.JUNGLE_LOG;
                     var5 = var4.defaultBlockState();
                     var11 = 42520741 ^ var11;
                     return var5;
                  case 296119745:
                     break;
                  case 1729935823:
                  default:
                     throw new IllegalStateException();
               }
            }
         default:
            var11 = wxaosivcmfstxsxw(var11, 2029276034);
            Block var8 = Blocks.OAK_LOG;
            var5 = var8.defaultBlockState();
            var11 = 1605675386 ^ var11;
      }

      return var5;
   }

   private static BlockState leaves(int var0) {
      int var11 = 1379798547 ^ 1612233851 ^ 28208402;
      var11 = 2107677706 ^ var11;
      byte var2 = (byte)(1311261555 ^ var11);
      int var3 = var0 & var2;
      BlockState var5;
      switch (var3) {
         case 1:
            var11 = wxaosivcmfstxsxw(var11, 292796468);
            Block var6 = Blocks.SPRUCE_LEAVES;
            var5 = var6.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var11)) {
                  case 74971331:
                  default:
                     throw new IllegalStateException();
                  case 146958728:
                     var11 = 2075628398 ^ var11;
                     return var5;
                  case 719539729:
                     break;
                  case 1065299699:
                     return var5;
               }
            }
         case 2:
            var11 = wxaosivcmfstxsxw(var11, 315138079);
            Block var4 = Blocks.BIRCH_LEAVES;
            var5 = var4.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var11)) {
                  case 66315335:
                     var11 = 2014088005 ^ var11;
                     return var5;
                  case 1037662783:
                     break;
                  case 1745120284:
                     return var5;
                  case 2130856991:
                  default:
                     throw new IllegalStateException();
               }
            }
         case 3:
            var11 = 1972288575 ^ var11;
            Block var7 = Blocks.JUNGLE_LEAVES;
            var5 = var7.defaultBlockState();
            var11 = wxaosivcmfstxsxw(var11, 524982117);
            break;
         default:
            label23:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var11)) {
                  case 124669057:
                     var11 ^= 1193962983;
                  case 1241820164:
                     break label23;
                  case 1532412247:
                     break;
                  case 1610725518:
                  default:
                     throw new IllegalStateException();
               }
            }

            Block var8 = Blocks.OAK_LEAVES;
            var5 = var8.defaultBlockState();
            var11 = 770590397 ^ var11;
      }

      return var5;
   }

   private static BlockState wool(int var0) {
      int var23 = 78515135 ^ 670422991 ^ 28208402;
      var23 = 1279246038 ^ var23;
      byte var2 = (byte)(1858736059 ^ var23);
      int var3 = var0 & var2;
      BlockState var15;
      switch (var3) {
         case 1:
            var23 = wxaosivcmfstxsxw(var23, 1800427382);
            Block var14 = Blocks.ORANGE_WOOL;
            var15 = var14.defaultBlockState();
            var23 = 825465080 ^ var23;
            break;
         case 2:
            label51:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 14189886:
                     break label51;
                  case 111612070:
                     var23 ^= 1592293572;
                     break label51;
                  case 654082565:
                     break;
                  case 1557456858:
                  default:
                     throw new RuntimeException();
               }
            }

            Block var9 = Blocks.MAGENTA_WOOL;
            var15 = var9.defaultBlockState();
            var23 = 76265290 ^ var23;
            break;
         case 3:
            var23 = 1358092741 ^ var23;
            Block var8 = Blocks.LIGHT_BLUE_WOOL;
            var15 = var8.defaultBlockState();
            var23 = 177280587 ^ var23;
            break;
         case 4:
            label44:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 111612070:
                     var23 ^= 1597511983;
                     break label44;
                  case 367305833:
                     break;
                  case 940029593:
                     break label44;
                  case 1528097945:
                  default:
                     throw new RuntimeException();
               }
            }

            Block var18 = Blocks.YELLOW_WOOL;
            var15 = var18.defaultBlockState();
            var23 = wxaosivcmfstxsxw(var23, 89904801);
            break;
         case 5:
            var23 = 1041796486 ^ var23;
            Block var11 = Blocks.LIME_WOOL;
            var15 = var11.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 211258514:
                     var23 = 1685799432 ^ var23;
                     return var15;
                  case 1291562871:
                     break;
                  case 1861025035:
                  default:
                     throw new RuntimeException();
                  case 1880905148:
                     return var15;
               }
            }
         case 6:
            var23 = 1725731616 ^ var23;
            Block var17 = Blocks.PINK_WOOL;
            var15 = var17.defaultBlockState();
            var23 = wxaosivcmfstxsxw(var23, 1019174062);
            break;
         case 7:
            var23 = 490607252 ^ var23;
            Block var5 = Blocks.GRAY_WOOL;
            var15 = var5.defaultBlockState();
            var23 = 1197333786 ^ var23;
            break;
         case 8:
            label72:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 87270223:
                     break label72;
                  case 111612070:
                     var23 ^= 1197272710;
                     break label72;
                  case 141889858:
                     break;
                  case 1877866808:
                  default:
                     throw new RuntimeException();
               }
            }

            Block var7 = Blocks.LIGHT_GRAY_WOOL;
            var15 = var7.defaultBlockState();
            var23 = wxaosivcmfstxsxw(var23, 490676488);
            break;
         case 9:
            var23 = 1119691782 ^ var23;
            Block var4 = Blocks.CYAN_WOOL;
            var15 = var4.defaultBlockState();
            var23 = wxaosivcmfstxsxw(var23, 417262472);
            break;
         case 10:
            var23 = wxaosivcmfstxsxw(var23, 511762480);
            Block var20 = Blocks.PURPLE_WOOL;
            var15 = var20.defaultBlockState();
            var23 = 1155739582 ^ var23;
            break;
         case 11:
            label65:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 42507508:
                     break label65;
                  case 111612070:
                     var23 ^= 1268373601;
                     break label65;
                  case 1013587538:
                     break;
                  case 1557018879:
                  default:
                     throw new RuntimeException();
               }
            }

            Block var13 = Blocks.BLUE_WOOL;
            var15 = var13.defaultBlockState();
            var23 = wxaosivcmfstxsxw(var23, 301602799);
            break;
         case 12:
            var23 = wxaosivcmfstxsxw(var23, 593629771);
            Block var12 = Blocks.BROWN_WOOL;
            var15 = var12.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 108394422:
                     var23 = 2030165445 ^ var23;
                     return var15;
                  case 456678490:
                  default:
                     throw new RuntimeException();
                  case 481065210:
                     break;
                  case 1245043054:
                     return var15;
               }
            }
         case 13:
            var23 = 1386550179 ^ var23;
            Block var19 = Blocks.GREEN_WOOL;
            var15 = var19.defaultBlockState();
            var23 = wxaosivcmfstxsxw(var23, 147250221);
            break;
         case 14:
            label79:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 109219805:
                     break label79;
                  case 111612070:
                     var23 ^= 192977680;
                     break label79;
                  case 930220085:
                  default:
                     throw new RuntimeException();
                  case 1110924861:
               }
            }

            Block var16 = Blocks.RED_WOOL;
            var15 = var16.defaultBlockState();
            var23 = 1373852830 ^ var23;
            break;
         case 15:
            var23 = 297788563 ^ var23;
            Block var10 = Blocks.BLACK_WOOL;
            var15 = var10.defaultBlockState();
            var23 = 1272720157 ^ var23;
            break;
         default:
            var23 = 648894584 ^ var23;
            Block var6 = Blocks.WHITE_WOOL;
            var15 = var6.defaultBlockState();
            var23 = 2093914102 ^ var23;
      }

      return var15;
   }

   private static BlockState terracotta(int var0) {
      int var23 = 2003735838 ^ 1118697985 ^ 28208402;
      var23 = 874981148 ^ var23;
      byte var2 = (byte)(4859166 ^ var23);
      int var3 = var0 & var2;
      switch (var3) {
         case 1:
            var23 = 171687122 ^ var23;
            Block var10 = Blocks.ORANGE_TERRACOTTA;
            BlockState var62 = var10.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 71046040:
                     var23 = 551446050 ^ var23;
                     return var62;
                  case 347702162:
                     break;
                  case 379433942:
                  default:
                     throw new IllegalStateException();
                  case 1725225100:
                     return var62;
               }
            }
         case 2:
            var23 = wxaosivcmfstxsxw(var23, 280223277);
            Block var6 = Blocks.MAGENTA_TERRACOTTA;
            BlockState var64 = var6.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 14960189:
                     var23 = 978715869 ^ var23;
                     return var64;
                  case 422709672:
                     return var64;
                  case 973615708:
                     break;
                  case 1615021854:
                  default:
                     throw new IllegalStateException();
               }
            }
         case 3:
            var23 = wxaosivcmfstxsxw(var23, 1121341959);
            Block var11 = Blocks.LIGHT_BLUE_TERRACOTTA;
            BlockState var61 = var11.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 17785894:
                     var23 = 1748207863 ^ var23;
                     return var61;
                  case 694383688:
                  default:
                     throw new IllegalStateException();
                  case 1611906232:
                     break;
                  case 1760748275:
                     return var61;
               }
            }
         case 4:
            label129:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 4555509:
                     var23 ^= 2084547032;
                     break label129;
                  case 595192237:
                     break;
                  case 817108296:
                  default:
                     throw new IllegalStateException();
                  case 1770117555:
                     break label129;
               }
            }

            Block var8 = Blocks.YELLOW_TERRACOTTA;
            BlockState var60 = var8.defaultBlockState();
            var23 = 1457156904 ^ var23;
            return var60;
         case 5:
            var23 = wxaosivcmfstxsxw(var23, 558105334);
            Block var7 = Blocks.LIME_TERRACOTTA;
            BlockState var59 = var7.defaultBlockState();
            var23 = wxaosivcmfstxsxw(var23, 195155974);
            return var59;
         case 6:
            var23 = wxaosivcmfstxsxw(var23, 811057658);
            Block var5 = Blocks.PINK_TERRACOTTA;
            BlockState var63 = var5.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 80806977:
                  default:
                     throw new IllegalStateException();
                  case 221895578:
                     var23 = 447879946 ^ var23;
                     return var63;
                  case 1290700991:
                     return var63;
                  case 1530892974:
               }
            }
         case 7:
            label113:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 4555509:
                     var23 ^= 151650770;
                     break label113;
                  case 822925146:
                     break;
                  case 1280317841:
                  default:
                     throw new IllegalStateException();
                  case 2139111914:
                     break label113;
               }
            }

            Block var19 = Blocks.GRAY_TERRACOTTA;
            BlockState var58 = var19.defaultBlockState();
            var23 = wxaosivcmfstxsxw(var23, 602921762);
            return var58;
         case 8:
            label106:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 4555509:
                     var23 ^= 330483371;
                     break label106;
                  case 65096873:
                     break;
                  case 1430513428:
                     break label106;
                  case 2009922940:
                  default:
                     throw new IllegalStateException();
               }
            }

            Block var16 = Blocks.LIGHT_GRAY_TERRACOTTA;
            BlockState var57 = var16.defaultBlockState();
            var23 = wxaosivcmfstxsxw(var23, 962010203);
            return var57;
         case 9:
            var23 = 1390791375 ^ var23;
            Block var18 = Blocks.CYAN_TERRACOTTA;
            BlockState var56 = var18.defaultBlockState();
            var23 = 2013270079 ^ var23;
            return var56;
         case 10:
            label99:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 4555509:
                     var23 ^= 834961766;
                     break label99;
                  case 362133204:
                     break;
                  case 1082564953:
                  default:
                     throw new IllegalStateException();
                  case 1851644488:
                     break label99;
               }
            }

            Block var14 = Blocks.PURPLE_TERRACOTTA;
            BlockState var55 = var14.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 290600:
                     var23 = 455170966 ^ var23;
                     return var55;
                  case 736593759:
                     break;
                  case 820260391:
                  default:
                     throw new IllegalStateException();
                  case 1788827190:
                     return var55;
               }
            }
         case 11:
            var23 = wxaosivcmfstxsxw(var23, 429141939);
            Block var15 = Blocks.BLUE_TERRACOTTA;
            BlockState var54 = var15.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 35532103:
                     var23 = 863106371 ^ var23;
                     return var54;
                  case 417884755:
                  default:
                     throw new IllegalStateException();
                  case 929258855:
                     return var54;
                  case 1686631660:
               }
            }
         case 12:
            label74:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 4555509:
                     var23 ^= 587382834;
                     break label74;
                  case 335923821:
                     break;
                  case 945074131:
                  default:
                     throw new IllegalStateException();
                  case 1006779406:
                     break label74;
               }
            }

            Block var17 = Blocks.BROWN_TERRACOTTA;
            BlockState var53 = var17.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 73210043:
                     var23 = 166140610 ^ var23;
                     return var53;
                  case 1478791654:
                     return var53;
                  case 1617989074:
                  default:
                     throw new IllegalStateException();
                  case 2029841184:
               }
            }
         case 13:
            label58:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 4555509:
                     var23 ^= 565755355;
                     break label58;
                  case 446891839:
                     break;
                  case 1065229766:
                  default:
                     throw new IllegalStateException();
                  case 2082590994:
                     break label58;
               }
            }

            Block var4 = Blocks.GREEN_TERRACOTTA;
            BlockState var52 = var4.defaultBlockState();
            var23 = 190670635 ^ var23;
            return var52;
         case 14:
            var23 = wxaosivcmfstxsxw(var23, 1234191174);
            Block var20 = Blocks.RED_TERRACOTTA;
            BlockState var51 = var20.defaultBlockState();
            var23 = 1668651446 ^ var23;
            return var51;
         case 15:
            var23 = 1938367668 ^ var23;
            Block var9 = Blocks.BLACK_TERRACOTTA;
            BlockState var50 = var9.defaultBlockState();
            var23 = wxaosivcmfstxsxw(var23, 1500315204);
            return var50;
         default:
            label165:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var23)) {
                  case 4555509:
                     var23 ^= 630706443;
                     break label165;
                  case 417794520:
                  default:
                     throw new IllegalStateException();
                  case 613476624:
                     break label165;
                  case 1797168795:
               }
            }

            Block var13 = Blocks.WHITE_TERRACOTTA;
            BlockState var12 = var13.defaultBlockState();
            var23 = 259132411 ^ var23;
            return var12;
      }
   }

   private static BlockState slab(int var0) {
      int var31 = 444221402 ^ 1994801698 ^ 28208402;
      var31 = 968436561 ^ var31;
      byte var2 = (byte)(1418412979 ^ var31);
      int var6 = var0 & var2;
      byte var24;
      if (var6 != (1418412987 ^ var31)) {
         var31 = 141914586 ^ var31;
         var24 = (byte)(1560162912 ^ var31);
         var31 = 1928703823 ^ var31;
      } else {
         var31 = wxaosivcmfstxsxw(var31, 2065138136);
         var24 = (byte)(798802531 ^ var31);
         var31 = 26697549 ^ var31;
      }

      BlockState var17;
      byte var25 = (byte)(772513065 ^ var31);
      int var8 = var0 & var25;
      label87:
      switch (var8) {
         case 1:
            var31 = wxaosivcmfstxsxw(var31, 1523594279);
            Block var9 = Blocks.SANDSTONE_SLAB;
            var17 = var9.defaultBlockState();
            var31 = wxaosivcmfstxsxw(var31, 125032848);
            break;
         case 2:
            label71:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
                  case 149541043:
                  default:
                     throw new RuntimeException(new IOException());
                  case 154578562:
                     var31 ^= 2096740246;
                  case 826030505:
                     break label71;
                  case 1097935624:
               }
            }

            Block var18 = Blocks.PETRIFIED_OAK_SLAB;
            var17 = var18.defaultBlockState();
            var31 = 559569441 ^ var31;
            break;
         case 3:
            var31 = 861659766 ^ var31;
            Block var23 = Blocks.COBBLESTONE_SLAB;
            var17 = var23.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
                  case 147581930:
                     var31 ^= 1861750721;
                  case 1161714251:
                     break label87;
                  case 1428298265:
                     break;
                  case 1838976821:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         case 4:
            var31 = wxaosivcmfstxsxw(var31, 1053342660);
            Block var21 = Blocks.BRICK_SLAB;
            var17 = var21.defaultBlockState();
            var31 = wxaosivcmfstxsxw(var31, 1667978867);
            break;
         case 5:
            var31 = 832037672 ^ var31;
            Block var22 = Blocks.STONE_BRICK_SLAB;
            var17 = var22.defaultBlockState();
            var31 = wxaosivcmfstxsxw(var31, 1815350943);
            break;
         case 6:
            label64:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
                  case 154578562:
                     var31 ^= 507979573;
                     break label64;
                  case 597614790:
                     break;
                  case 1461553967:
                  default:
                     throw new RuntimeException(new IOException());
                  case 2145216976:
                     break label64;
               }
            }

            Block var16 = Blocks.NETHER_BRICK_SLAB;
            var17 = var16.defaultBlockState();
            var31 = 1139067522 ^ var31;
            break;
         case 7:
            var31 = wxaosivcmfstxsxw(var31, 1337306288);
            Block var19 = Blocks.QUARTZ_SLAB;
            var17 = var19.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
                  case 224453020:
                     var31 ^= 303448327;
                     break label87;
                  case 442655664:
                     break;
                  case 973111472:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1002015729:
                     break label87;
               }
            }
         default:
            label57:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
                  case 154578562:
                     var31 ^= 1987481472;
                  case 736493424:
                     break label57;
                  case 1767885900:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1934281224:
               }
            }

            Block var20 = Blocks.SMOOTH_STONE_SLAB;
            var17 = var20.defaultBlockState();
            var31 = 735404599 ^ var31;
      }

      EnumProperty var26 = BlockStateProperties.SLAB_TYPE;
      byte var11 = (byte)((var17.hasProperty(var26)) ? 1 : 0);
      if (var11 == (1940418713 ^ var31)) {
         var31 = 528160671 ^ var31;
         return var17;
      } else {
         var31 = 958133534 ^ var31;
         EnumProperty var27 = BlockStateProperties.SLAB_TYPE;
         SlabType var28;
         if (var24 != (1253279111 ^ var31)) {
            var31 = 687753394 ^ var31;
            var28 = SlabType.TOP;
            var31 = wxaosivcmfstxsxw(var31, 156799993);
         } else {
            label47:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
                  case 12294150:
                     var31 ^= 419474257;
                     break label47;
                  case 839313743:
                     break;
                  case 1520076456:
                     break label47;
                  case 1672278090:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }

            var28 = SlabType.BOTTOM;
            var31 = 950431770 ^ var31;
         }

         Object var14 = var17.setValue(var27, var28);
         return (BlockState)var14;
      }
   }

   private static BlockState woodSlab(int var0) {
      int var30 = 1711210328 ^ 259200228 ^ 28208402;
      var30 = 721241441 ^ var30;
      byte var2 = (byte)(1105118151 ^ var30);
      int var6 = var0 & var2;
      byte var22;
      if (var6 != (1105118159 ^ var30)) {
         var30 = 1308182302 ^ var30;
         var22 = (byte)(203916496 ^ var30);

         label95:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
               case 126655859:
                  var30 ^= 695807525;
               case 686996253:
                  break label95;
               case 1218377198:
                  break;
               case 1793343556:
               default:
                  throw new IllegalStateException();
            }
         }
      } else {
         label88:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
               case 262134463:
                  var30 ^= 776763313;
               case 491357830:
                  break label88;
               case 859960666:
                  break;
               case 1273481308:
               default:
                  throw new IllegalStateException();
            }
         }

         var22 = (byte)(1871885438 ^ var30);
         var30 = 1254891146 ^ var30;
      }

      BlockState var17;
      byte var23 = (byte)(626961139 ^ var30);
      int var8 = var0 & var23;
      BlockState var9 = woodPlanks(var8);
      byte var24 = (byte)(626961139 ^ var30);
      int var11 = var0 & var24;
      label81:
      switch (var11) {
         case 1:
            label58:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 140988006:
                     var30 ^= 1458441702;
                     break label58;
                  case 258555465:
                     break;
                  case 449988152:
                     break label58;
                  case 681054819:
                  default:
                     throw new IllegalStateException();
               }
            }

            Block var18 = Blocks.SPRUCE_SLAB;
            var17 = var18.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 2502658:
                     var30 ^= 694503827;
                  case 56833325:
                     break label81;
                  case 1313465148:
                  default:
                     throw new IllegalStateException();
                  case 2095667944:
               }
            }
         case 2:
            label79:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 140988006:
                     var30 ^= 1037466456;
                     break label79;
                  case 356525334:
                  default:
                     throw new IllegalStateException();
                  case 728369245:
                     break;
                  case 1654418605:
                     break label79;
               }
            }

            Block var12 = Blocks.BIRCH_SLAB;
            var17 = var12.defaultBlockState();

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 260640437:
                     var30 ^= 1113407277;
                  case 655623372:
                     break label81;
                  case 893382892:
                  default:
                     throw new IllegalStateException();
                  case 1992190846:
               }
            }
         case 3:
            var30 = 2099224107 ^ var30;
            Block var20 = Blocks.JUNGLE_SLAB;
            var17 = var20.defaultBlockState();
            var30 = 43309662 ^ var30;
            break;
         case 4:
            var30 = wxaosivcmfstxsxw(var30, 788960986);
            Block var21 = Blocks.ACACIA_SLAB;
            var17 = var21.defaultBlockState();
            var30 = 1351471791 ^ var30;
            break;
         case 5:
            label65:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 140988006:
                     var30 ^= 189589926;
                     break label65;
                  case 531361828:
                  default:
                     throw new IllegalStateException();
                  case 1451813680:
                     break;
                  case 1678047454:
                     break label65;
               }
            }

            Block var19 = Blocks.DARK_OAK_SLAB;
            var17 = var19.defaultBlockState();
            var30 ^= 1959243219;
            break;
         default:
            var30 = 1576478630 ^ var30;
            Block var16 = Blocks.OAK_SLAB;
            var17 = var16.defaultBlockState();
            var30 = 578577363 ^ var30;
      }

      EnumProperty var25 = BlockStateProperties.SLAB_TYPE;
      SlabType var26;
      if (var22 != (1523969665 ^ var30)) {
         var30 = 960866403 ^ var30;
         var26 = SlabType.TOP;

         label42:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
               case 15198917:
                  var30 = 1329054857 ^ var30;
                  break label42;
               case 59747187:
                  break;
               case 718678369:
               default:
                  throw new IllegalStateException();
               case 1560450790:
                  break label42;
            }
         }
      } else {
         var30 = wxaosivcmfstxsxw(var30, 886693747);
         var26 = SlabType.BOTTOM;
         var30 = 1118548889 ^ var30;
      }

      Object var14 = var17.setValue(var25, var26);
      return (BlockState)var14;
   }

   private static BlockState doubleSlab(int var0) {
      int var25 = 846180499 ^ 169773730 ^ 28208402;
      var25 = 352587566 ^ var25;
      byte var2 = (byte)(752572426 ^ var25);
      int var5 = var0 & var2;
      BlockState var6 = slab(var5);
      EnumProperty var18 = BlockStateProperties.SLAB_TYPE;
      byte var8 = (byte)((var6.hasProperty(var18)) ? 1 : 0);
      if (var8 != (752572429 ^ var25)) {
         var25 = 1861462314 ^ var25;
         EnumProperty var19 = BlockStateProperties.SLAB_TYPE;
         SlabType var3 = SlabType.DOUBLE;
         Object var10 = var6.setValue(var19, var3);
         return (BlockState)var10;
      } else {
         var25 = wxaosivcmfstxsxw(var25, 713104108);
         EnumProperty var20 = BlockStateProperties.HALF;
         byte var13 = (byte)((var6.hasProperty(var20)) ? 1 : 0);
         if (var13 != (106578657 ^ var25)) {
            var25 = 2059226968 ^ var25;
            EnumProperty var21 = BlockStateProperties.HALF;
            Half var22 = Half.BOTTOM;
            Object var16 = var6.setValue(var21, var22);
            return (BlockState)var16;
         } else {
            var25 = 262873063 ^ var25;
            return var6;
         }
      }
   }

   static {
      int var3 = new Random(282262916952081753L).nextInt();
      f6CeEpj0thw = 1621233322 ^ var3;
   }

   public static String olgmngetji(byte[] var0, int var1) {
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
      String var29 = yadtrxqupm;
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

   private static byte[] ctnqjmphpjtolvi() {
      return new byte[0];
   }

   private static int wxaosivcmfstxsxw(int var0, int var1) {
      return var1 ^ var0;
   }
}
