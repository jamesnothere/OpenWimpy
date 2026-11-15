package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.level.ChunkPos;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class h {
   public static final h INSTANCE;
   private static final double TELEPORT_MIN_DIST_SQ = 4096.0;
   private static final int TELEPORT_TIMEOUT_TICKS = 200;
   private static final int LOAD_TIMEOUT_TICKS = 600;
   private static final int SCAN_TIMEOUT_TICKS = 900;
   private static final int TRAVEL_TIMEOUT_TICKS = 3600;
   private h$a phase;
   private int ticksInPhase;
   private double preX;
   private double preZ;
   private boolean wasEnabled;
   private int lastOverlayBucket;
   private boolean teleportLatched;
   private static int LrR5xZQAyL;
   private transient int rsLJgaxPIj;

   private h() {
super();
      int var8 = 123362699 ^ 1841217886;
      
      var8 = 1783617087 ^ var8;
      var8 = 382849807 ^ 1216331878 ^ Integer.parseInt("1577408899");
      this.rsLJgaxPIj = 1352826377 ^ LrR5xZQAyL;

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var8)) {
            case 10524304:
               var8 = 1670127238 ^ var8;
            case 1020028379:
               h$a var2 = h$a.SEND_COMMAND;
               this.phase = var2;
               byte var5 = -1;
               this.lastOverlayBucket = var5;
               return;
            case 381025309:
            default:
               throw new IllegalStateException();
            case 1008175119:
         }
      }
   }

   public void tick(Minecraft var1) {
      int var346 = 1374272006 ^ 1824618512 ^ 1007138694;
      var346 = 1422290097 ^ var346;
      byte var2 = (byte)((LicenseGate.isAuthorized()) ? 1 : 0);
      if (var2 == (1441339681 ^ var346)) {
         var346 = 1047080298 ^ var346;
         byte var17 = (byte)((this.wasEnabled) ? 1 : 0);
         if (var17 != (1803564107 ^ var346)) {
            var346 = 2065956707 ^ var346;
            com.wimpyclient.f.a var18 = com.wimpyclient.f.a.INSTANCE;
            var18.endAutoRtpScanPass();
            boolean var19 = com.wimpyclient.p.b.cancelPath();
            this.reset();
            var346 = 1455518543 ^ var346;
         } else {
            var346 = 769821740 ^ var346;
         }

         byte var3 = (byte)(1180874855 ^ var346);
         this.wasEnabled = (var3 != 0);
      } else {
         var346 = 149878085 ^ var346;
         x var22 = x.INSTANCE;
         v var24 = var22.autoRtp;
         byte var25 = (byte)((var24.qo()) ? 1 : 0);
         if (var25 == (1560800356 ^ var346)) {
            var346 = 1859343251 ^ var346;
            byte var179 = (byte)((this.wasEnabled) ? 1 : 0);
            if (var179 != (869580791 ^ var346)) {
               var346 = 629659056 ^ var346;
               com.wimpyclient.f.a var180 = com.wimpyclient.f.a.INSTANCE;
               var180.endAutoRtpScanPass();
               boolean var181 = com.wimpyclient.p.b.cancelPath();
               this.reset();
               var346 = 358839721 ^ var346;
            } else {
               var346 = 820289561 ^ var346;
            }

            byte var293 = (byte)(53485550 ^ var346);
            this.wasEnabled = (var293 != 0);
         } else {
            label444: {
               LocalPlayer var36;
               label445: {
                  ChunkPos var102;
                  label449: {
                     var346 = 989282732 ^ var346;
                     byte var28 = (byte)((this.wasEnabled) ? 1 : 0);
                     if (var28 == (1743826376 ^ var346)) {
                        var346 ^= 1460556265;
                        this.reset();
                        byte var184 = (byte)(822017056 ^ var346);
                        this.wasEnabled = (var184 != 0);
                        byte var32 = (byte)((var22.isPrimeSusFinderEnabled()) ? 1 : 0);
                        if (var32 == (822017057 ^ var346)) {
                           var346 = 1071407161 ^ var346;
                           v var34 = var22.primeSusFinder;
                           byte var185 = (byte)(253926425 ^ var346);
                           var34.qp((var185 != 0));
                           var346 = 1802631788 ^ var346;
                        } else {
                           label318:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                 case 250493057:
                                    var346 ^= 1420663381;
                                 case 1018332397:
                                    break label318;
                                 case 1165604593:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1791337943:
                              }
                           }
                        }
                     } else {
                        label312:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                              case 157431619:
                                 var346 ^= 61066172;
                                 break label312;
                              case 779443699:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 790023444:
                                 break;
                              case 1258481815:
                                 break label312;
                           }
                        }
                     }

                     var36 = var1.player;
                     if (var36 == null) {
                        var346 = dlgqhvideerkglzv(var346, 639947182);
                        return;
                     }

                     var346 = 1151560964 ^ var346;
                     ClientLevel var39 = var1.level;
                     if (var39 == null) {
                        var346 = dlgqhvideerkglzv(var346, 1653062826);
                        return;
                     }

                     var346 = 621313683 ^ var346;
                     ClientPacketListener var41 = var1.getConnection();
                     if (var41 == null) {
                        var346 = 1200603705 ^ var346;
                        return;
                     }

                     label304:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                           case 93907836:
                              var346 ^= 1857657114;
                              break label304;
                           case 380205121:
                           default:
                              throw new RuntimeException(new IOException());
                           case 1122080492:
                              break;
                           case 1798298311:
                              break label304;
                        }
                     }

                     int var242;
                     int var320;
                     String var333;
                     int var186 = this.ticksInPhase;
                     byte var4 = (byte)(1799482616 ^ var346);
                     int var187 = var186 + var4;
                     this.ticksInPhase = var187;
                     h$a var44 = this.phase;
                     int var45 = var44.ordinal();
                     label289:
                     switch (var45) {
                        case 0:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                 case 85184489:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 265277539:
                                    var346 ^= 1746151479;
                                    break label445;
                                 case 1809874664:
                                    break;
                                 case 1824271699:
                                    break label445;
                              }
                           }
                        case 1:
                           var346 = dlgqhvideerkglzv(var346, 650046357);
                           double var57 = var36.getX();
                           double var296 = this.preX;
                           double var59 = var57 - var296;
                           double var62 = var36.getZ();
                           double var299 = this.preZ;
                           double var64 = var62 - var299;
                           double var68 = var59 * var59;
                           double var305 = var64 * var64;
                           double var70 = var68 + var305;
                           double var307 = 4096.0;
                           double var417;
                           int var72 = (var417 = var70 - var307) == 0.0 ? 0 : (var417 < 0.0 ? -1 : 1);
                           if (var72 >= (1308559212 ^ var346)) {
                              var346 = 66322849 ^ var346;
                              byte var74 = (byte)((this.teleportLatched) ? 1 : 0);
                              if (var74 != (1309345485 ^ var346)) {
                                 var346 = dlgqhvideerkglzv(var346, 2114933630);
                                 int var78 = this.ticksInPhase;
                                 byte var203 = (byte)(805590439 ^ var346);
                                 if (var78 < var203) {
                                    var346 = 590274898 ^ var346;
                                    var346 = 885501887 ^ var346;
                                 } else {
                                    var346 = dlgqhvideerkglzv(var346, 487287884);
                                    com.wimpyclient.f.a var79 = com.wimpyclient.f.a.INSTANCE;
                                    var79.beginAutoRtpLoadWait(var1);
                                    h$a var205 = h$a.WAIT_LOAD;
                                    this.phase = var205;
                                    byte var206 = (byte)(755972607 ^ var346);
                                    this.ticksInPhase = var206;
                                    byte var207 = (byte)(-755972608 ^ var346);
                                    this.lastOverlayBucket = var207;
                                    String var208 = vfexwbwsdk(eqajawwpkmqxazc(), dhyballxngeqzne(), var346);
                                    MutableComponent var209 = Component.literal(var208);
                                    byte var309 = (byte)(755972606 ^ var346);
                                    var36.displayClientMessage(var209, (var309 != 0));
                                    var346 = 182592161 ^ var346;
                                 }

                                 return;
                              }

                              var346 = 803601836 ^ var346;
                              byte var201 = (byte)(1643051872 ^ var346);
                              this.teleportLatched = (var201 != 0);
                              byte var202 = (byte)(1643051873 ^ var346);
                              this.ticksInPhase = var202;

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                    case 230647525:
                                       var346 = 1174659135 ^ var346;
                                       return;
                                    case 916487314:
                                       break;
                                    case 1609139580:
                                       return;
                                    case 2035042588:
                                    default:
                                       throw new RuntimeException(new IOException());
                                 }
                              }
                           }

                           var346 = 62389085 ^ var346;
                           int var85 = this.ticksInPhase;
                           short var210 = (short)(1313406201 ^ var346);
                           if (var85 >= var210) {
                              var346 = 1098703159 ^ var346;
                              h$a var211 = h$a.SEND_COMMAND;
                              this.phase = var211;
                              byte var212 = (byte)(255073542 ^ var346);
                              this.ticksInPhase = var212;
                              byte var213 = (byte)(255073542 ^ var346);
                              this.teleportLatched = (var213 != 0);
                              var346 = 307424551 ^ var346;
                              break label444;
                           }

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                 case 128788182:
                                    var346 ^= 1395526672;
                                    break label444;
                                 case 1035940847:
                                    break;
                                 case 1145953348:
                                    break label444;
                                 case 1916659960:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        case 2:
                           var346 = dlgqhvideerkglzv(var346, 1167655943);
                           com.wimpyclient.f.a var155 = com.wimpyclient.f.a.INSTANCE;
                           var155.tickAutoRtpLoadWait();
                           int var157 = this.ticksInPhase;
                           short var273 = (short)(785967782 ^ var346);
                           if (var157 >= var273) {
                              var346 = 131203102 ^ var346;
                              String var274 = vfexwbwsdk(uslgqgszxxomvxk(), dhyballxngeqzne(), var346);
                              MutableComponent var275 = Component.literal(var274);
                              byte var328 = (byte)(688580833 ^ var346);
                              var36.displayClientMessage(var275, (var328 != 0));
                              h$a var276 = h$a.SEND_COMMAND;
                              this.phase = var276;
                              byte var277 = (byte)(688580832 ^ var346);
                              this.ticksInPhase = var277;

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                    case 260377144:
                                       var346 = 250082238 ^ var346;
                                       return;
                                    case 1539675821:
                                       return;
                                    case 1856425782:
                                    default:
                                       throw new RuntimeException(new IOException());
                                    case 1946560757:
                                 }
                              }
                           }

                           var346 = 916644739 ^ var346;
                           com.wimpyclient.f.a var161 = com.wimpyclient.f.a.INSTANCE;
                           byte var162 = (byte)((var161.isSusSimulationLoadReady(var1)) ? 1 : 0);
                           if (var162 != (410651517 ^ var346)) {
                              var346 = dlgqhvideerkglzv(var346, 1524627954);
                              com.wimpyclient.f.a var173 = com.wimpyclient.f.a.INSTANCE;
                              var173.beginAutoRtpScanPass(var1);
                              h$a var288 = h$a.WAIT_SCAN;
                              this.phase = var288;
                              byte var289 = (byte)(1118171791 ^ var346);
                              this.ticksInPhase = var289;
                              byte var290 = (byte)(-1118171792 ^ var346);
                              this.lastOverlayBucket = var290;
                              String var291 = vfexwbwsdk(rfnfdoibcfuuzew(), dhyballxngeqzne(), var346);
                              MutableComponent var292 = Component.literal(var291);
                              byte var331 = (byte)(1118171790 ^ var346);
                              var36.displayClientMessage(var292, (var331 != 0));
                              var346 = 1699277265 ^ var346;
                              return;
                           }

                           var346 = 1450788666 ^ var346;
                           int var164 = this.ticksInPhase;
                           byte var279 = (byte)(1308838995 ^ var346);
                           int var165 = var164 / var279;
                           int var281 = this.lastOverlayBucket;
                           if (var165 == var281) {
                              var346 = 1777227545 ^ var346;
                              return;
                           }

                           var346 = 407803867 ^ var346;
                           this.lastOverlayBucket = var165;
                           com.wimpyclient.f.a var168 = com.wimpyclient.f.a.INSTANCE;
                           int var169 = var168.autoRtpTerrainReadyCount();
                           com.wimpyclient.f.a var170 = com.wimpyclient.f.a.INSTANCE;
                           int var171 = var170.autoRtpExpectedChunkCount(var1);
                           int var335 = this.ticksInPhase;
                           byte var337 = (byte)(1447943048 ^ var346);
                           int var336 = var335 / var337;
                           String var285 = "Auto-RTP: loading chunks\u2026 " + var169 + "/" + var171 + " (" + var336 + "s)";
                           MutableComponent var286 = Component.literal(var285);
                           byte var330 = (byte)(1447943069 ^ var346);
                           var36.displayClientMessage(var286, (var330 != 0));

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                 case 17580488:
                                    return;
                                 case 121016115:
                                    var346 = 1906360514 ^ var346;
                                    return;
                                 case 318448404:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 791788423:
                              }
                           }
                        case 3:
                           var346 = dlgqhvideerkglzv(var346, 918190324);
                           com.wimpyclient.f.a var89 = com.wimpyclient.f.a.INSTANCE;
                           var89.tickAutoRtpScanWait();
                           int var91 = this.ticksInPhase;
                           short var214 = (short)(1576769417 ^ var346);
                           if (var91 >= var214) {
                              var346 = 1780722865 ^ var346;
                              String var251 = vfexwbwsdk(aqjmubxojevrghp(), dhyballxngeqzne(), var346);
                              MutableComponent var252 = Component.literal(var251);
                              byte var323 = (byte)(936917181 ^ var346);
                              var36.displayClientMessage(var252, (var323 != 0));
                              h$a var253 = h$a.SEND_COMMAND;
                              this.phase = var253;
                              byte var254 = (byte)(936917180 ^ var346);
                              this.ticksInPhase = var254;
                              var346 = dlgqhvideerkglzv(var346, 271918050);
                              return;
                           }

                           label241:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                 case 102183714:
                                    var346 ^= 1014730513;
                                 case 660390838:
                                    break label241;
                                 case 1646448350:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1707518037:
                              }
                           }

                           com.wimpyclient.f.a var92 = com.wimpyclient.f.a.INSTANCE;
                           byte var93 = (byte)((var92.isSusSimulationScanComplete(var1)) ? 1 : 0);
                           if (var93 == (1635785500 ^ var346)) {
                              var346 = 2132463738 ^ var346;
                              int var95 = this.ticksInPhase;
                              byte var216 = (byte)(513461070 ^ var346);
                              int var96 = var95 / var216;
                              int var218 = this.lastOverlayBucket;
                              if (var96 != var218) {
                                 var346 = 385377678 ^ var346;
                                 this.lastOverlayBucket = var96;
                                 int var221 = this.ticksInPhase;
                                 byte var310 = (byte)(140685052 ^ var346);
                                 int var222 = var221 / var310;
                                 String var223 = "Auto-RTP: scanning\u2026 (" + var222 + "s)";
                                 MutableComponent var224 = Component.literal(var223);
                                 byte var311 = (byte)(140685033 ^ var346);
                                 var36.displayClientMessage(var224, (var311 != 0));
                                 var346 = dlgqhvideerkglzv(var346, 797947318);
                              } else {
                                 var346 = dlgqhvideerkglzv(var346, 964153400);
                              }

                              return;
                           }

                           label233:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                 case 216552710:
                                    var346 ^= 12934939;
                                 case 1239687874:
                                    break label233;
                                 case 1730776345:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1912357052:
                              }
                           }

                           com.wimpyclient.f.a var100 = com.wimpyclient.f.a.INSTANCE;
                           var100.endAutoRtpScanPass();
                           var102 = nearestSusChunk(var36);
                           if (var102 != null) {
                              var346 = 1905602963 ^ var346;
                              v var105 = var22.freecam;
                              byte var106 = (byte)((var105.qo()) ? 1 : 0);
                              if (var106 != (282097044 ^ var346)) {
                                 var346 = 2002842028 ^ var346;
                                 v var108 = var22.freecam;
                                 byte var225 = (byte)(1739621432 ^ var346);
                                 var108.qp((var225 != 0));
                                 var346 = 915588801 ^ var346;
                              } else {
                                 var346 = dlgqhvideerkglzv(var346, 1106392941);
                              }

                              byte var110 = (byte)((var22.autoRtpBaritone) ? 1 : 0);
                              if (var110 == (1361199865 ^ var346)) {
                                 var346 = 1279970572 ^ var346;
                                 int var227 = var102.x;
                                 int var313 = var102.z;
                                 String var228 = "[Auto-RTP] Sus chunk @ " + var227 + ", " + var313 + " \u2014 Baritone disabled.";
                                 MutableComponent var229 = Component.literal(var228);
                                 byte var314 = (byte)(493391861 ^ var346);
                                 var36.displayClientMessage(var229, (var314 != 0));
                                 String var230 = vfexwbwsdk(ivxbsceylnjsghi(), dhyballxngeqzne(), var346);
                                 MutableComponent var231 = Component.literal(var230);
                                 byte var315 = (byte)(493391860 ^ var346);
                                 var36.displayClientMessage(var231, (var315 != 0));
                                 v var114 = var22.autoRtp;
                                 byte var232 = (byte)(493391861 ^ var346);
                                 var114.qp((var232 != 0));
                                 this.reset();
                                 byte var233 = (byte)(493391861 ^ var346);
                                 this.wasEnabled = (var233 != 0);
                                 var346 = 981832875 ^ var346;
                                 return;
                              }

                              label215:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                    case 221393120:
                                       var346 ^= 126303354;
                                    case 562218177:
                                       break label215;
                                    case 759962652:
                                    default:
                                       throw new RuntimeException(new IOException());
                                    case 2010155216:
                                 }
                              }

                              boolean var117 = com.wimpyclient.p.b.applyHumanMovementSettings();
                              com.wimpyclient.p.b.clearTravelResult();
                              byte var119 = (byte)((com.wimpyclient.p.b.pathToChunk(var102)) ? 1 : 0);
                              if (var119 == (1453686403 ^ var346)) {
                                 var346 = 1896252916 ^ var346;
                                 var242 = var102.x;
                                 var320 = var102.z;
                                 String var5 = com.wimpyclient.p.b.lastError();
                                 if (var5 != null) {
                                    var346 = 6183459 ^ var346;
                                    String var332 = com.wimpyclient.p.b.lastError();
                                    var333 = " (" + var332 + ")";

                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                          case 226185071:
                                             var346 ^= 466906256;
                                          case 736554737:
                                             break label289;
                                          case 1140329999:
                                          default:
                                             throw new RuntimeException(new IOException());
                                          case 1696644074:
                                       }
                                    }
                                 }

                                 label197:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                       case 48509155:
                                          break;
                                       case 214798485:
                                          var346 ^= 1176182088;
                                       case 1242529489:
                                          break label197;
                                       case 1949238217:
                                       default:
                                          throw new RuntimeException(new IOException());
                                    }
                                 }

                                 var333 = vfexwbwsdk(uxokdcoyqqlsskb(), dhyballxngeqzne(), var346);
                                 var346 = 1569795067 ^ var346;
                                 break;
                              }

                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                    case 59784061:
                                       break;
                                    case 132182968:
                                       var346 ^= 1453958749;
                                       break label449;
                                    case 483756692:
                                    default:
                                       throw new RuntimeException(new IOException());
                                    case 2099603814:
                                       break label449;
                                 }
                              }
                           }

                           var346 = dlgqhvideerkglzv(var346, 35250157);
                           String var247 = vfexwbwsdk(ibqgbuermtxaxxv(), dhyballxngeqzne(), var346);
                           MutableComponent var248 = Component.literal(var247);
                           byte var322 = (byte)(1667013611 ^ var346);
                           var36.displayClientMessage(var248, (var322 != 0));
                           h$a var249 = h$a.SEND_COMMAND;
                           this.phase = var249;
                           byte var250 = (byte)(1667013610 ^ var346);
                           this.ticksInPhase = var250;

                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                 case 8588617:
                                    var346 = 1152483508 ^ var346;
                                    return;
                                 case 13096910:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 16145618:
                                    break;
                                 case 1687316952:
                                    return;
                              }
                           }
                        case 4:
                           var346 = 1308848687 ^ var346;
                           byte var133 = (byte)((com.wimpyclient.p.b.travelSucceeded()) ? 1 : 0);
                           if (var133 != (625123030 ^ var346)) {
                              var346 = 1421039823 ^ var346;
                              com.wimpyclient.p.b.clearTravelResult();
                              String var255 = vfexwbwsdk(crkfdfjebpetpjs(), dhyballxngeqzne(), var346);
                              MutableComponent var256 = Component.literal(var255);
                              byte var324 = (byte)(1911670296 ^ var346);
                              var36.displayClientMessage(var256, (var324 != 0));
                              v var136 = var22.autoRtp;
                              byte var257 = (byte)(1911670297 ^ var346);
                              var136.qp((var257 != 0));
                              this.reset();
                              byte var258 = (byte)(1911670297 ^ var346);
                              this.wasEnabled = (var258 != 0);
                              var346 = dlgqhvideerkglzv(var346, 1444732231);
                              return;
                           }

                           byte var154;
                           label170: {
                              var346 = 206331122 ^ var346;
                              byte var139 = (byte)((com.wimpyclient.p.b.travelFailed()) ? 1 : 0);
                              if (var139 == (688833060 ^ var346)) {
                                 var346 = 2072969143 ^ var346;
                                 byte var140 = (byte)((com.wimpyclient.p.b.isTravelBusy()) ? 1 : 0);
                                 if (var140 != (1384136083 ^ var346)) {
                                    label164:
                                    while (true) {
                                       switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                          case 265823692:
                                             var346 ^= 1218073488;
                                             break label164;
                                          case 304907070:
                                             break;
                                          case 842226338:
                                             break label164;
                                          case 1779638997:
                                          default:
                                             throw new RuntimeException(new IOException());
                                       }
                                    }

                                    var154 = (byte)(437939715 ^ var346);
                                    var346 = 334036362 ^ var346;
                                    break label170;
                                 }

                                 var346 = 222606861 ^ var346;
                              } else {
                                 var346 = dlgqhvideerkglzv(var346, 1992968634);
                              }

                              var154 = (byte)(1606716319 ^ var346);
                              var346 = dlgqhvideerkglzv(var346, 1446385687);
                           }

                           if (var154 == (166892425 ^ var346)) {
                              var346 = 1155546569 ^ var346;
                              int var143 = this.ticksInPhase;
                              short var259 = (short)(1293066320 ^ var346);
                              if (var143 < var259) {
                                 var346 = 753833507 ^ var346;
                                 int var145 = this.ticksInPhase;
                                 byte var260 = (byte)(1643919435 ^ var346);
                                 int var146 = var145 / var260;
                                 int var262 = this.lastOverlayBucket;
                                 if (var146 != var262) {
                                    var346 = 2000984962 ^ var346;
                                    this.lastOverlayBucket = var146;
                                    int var265 = this.ticksInPhase;
                                    byte var325 = (byte)(381199349 ^ var346);
                                    int var266 = var265 / var325;
                                    String var267 = "Auto-RTP: travelling\u2026 (" + var266 + "s)";
                                    MutableComponent var268 = Component.literal(var267);
                                    byte var326 = (byte)(381199328 ^ var346);
                                    var36.displayClientMessage(var268, (var326 != 0));
                                    var346 = 827701439 ^ var346;
                                 } else {
                                    var346 = dlgqhvideerkglzv(var346, 1175528253);
                                 }

                                 return;
                              }

                              var346 = 505257973 ^ var346;
                           } else {
                              label156:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                    case 54916139:
                                       var346 ^= 1526571580;
                                    case 782269719:
                                       break label156;
                                    case 1718945250:
                                       break;
                                    case 1774900540:
                                    default:
                                       throw new RuntimeException(new IOException());
                                 }
                              }
                           }

                           boolean var150 = com.wimpyclient.p.b.cancelPath();
                           com.wimpyclient.p.b.clearTravelResult();
                           String var269 = vfexwbwsdk(tllxyluiapvyvov(), dhyballxngeqzne(), var346);
                           MutableComponent var270 = Component.literal(var269);
                           byte var327 = (byte)(1393504692 ^ var346);
                           var36.displayClientMessage(var270, (var327 != 0));
                           h$a var271 = h$a.SEND_COMMAND;
                           this.phase = var271;
                           byte var272 = (byte)(1393504693 ^ var346);
                           this.ticksInPhase = var272;
                           var346 = 1960979179 ^ var346;
                           return;
                        default:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var346)) {
                                 case 265277539:
                                    var346 = 1286404007 ^ var346;
                                    return;
                                 case 394978040:
                                 default:
                                    throw new RuntimeException(new IOException());
                                 case 1048700940:
                                    return;
                                 case 2000085176:
                              }
                           }
                     }

                     String var243 = "[Auto-RTP] Sus chunk @ " + var242 + ", " + var320 + " \u2014 Baritone failed" + var333 + ", hopping\u2026";
                     MutableComponent var244 = Component.literal(var243);
                     byte var321 = (byte)(1009372612 ^ var346);
                     var36.displayClientMessage(var244, (var321 != 0));
                     com.wimpyclient.p.b.clearTravelResult();
                     h$a var245 = h$a.SEND_COMMAND;
                     this.phase = var245;
                     byte var246 = (byte)(1009372612 ^ var346);
                     this.ticksInPhase = var246;
                     var346 = dlgqhvideerkglzv(var346, 465884826);
                     return;
                  }

                  int var235 = var102.x;
                  int var317 = var102.z;
                  String var236 = "[Auto-RTP] Sus chunk @ " + var235 + ", " + var317 + " \u2014 Baritone pathing.";
                  MutableComponent var237 = Component.literal(var236);
                  byte var318 = (byte)(841950 ^ var346);
                  var36.displayClientMessage(var237, (var318 != 0));
                  h$a var238 = h$a.WAIT_TRAVEL;
                  this.phase = var238;
                  byte var239 = (byte)(841950 ^ var346);
                  this.ticksInPhase = var239;
                  byte var240 = (byte)(-841951 ^ var346);
                  this.lastOverlayBucket = var240;
                  var346 = 669107072 ^ var346;
                  return;
               }

               com.wimpyclient.f.a var46 = com.wimpyclient.f.a.INSTANCE;
               var46.endAutoRtpScanPass();
               boolean var47 = com.wimpyclient.p.b.cancelPath();
               double var189 = var36.getX();
               this.preX = var189;
               double var192 = var36.getZ();
               this.preZ = var192;
               byte var194 = (byte)(-55952591 ^ var346);
               this.lastOverlayBucket = var194;
               byte var195 = (byte)(55952590 ^ var346);
               this.teleportLatched = (var195 != 0);
               String var197 = var22.autoRtpCommand;
               String var294 = vfexwbwsdk(xadzgexszxqaonx(), dhyballxngeqzne(), var346);
               String var198 = com.wimpyclient.p.d.withoutSlash(var197, var294);
               boolean var53 = com.wimpyclient.p.d.send(var36, var198);
               h$a var199 = h$a.WAIT_TELEPORT;
               this.phase = var199;
               byte var200 = (byte)(55952590 ^ var346);
               this.ticksInPhase = var200;
               var346 = 616095632 ^ var346;
               return;
            }

            var346 = dlgqhvideerkglzv(var346, 982248319);
         }
      }
   }

   private static ChunkPos nearestSusChunk(LocalPlayer var0) {
      int var210 = 322722956 ^ 1763152102 ^ 1822804367;
      var210 = 2066854656 ^ var210;
      com.wimpyclient.e.a var1 = com.wimpyclient.e.a.INSTANCE;
      List var31 = var1.primeSusMarkSnapshot();
      byte var33 = (byte)((var31.isEmpty()) ? 1 : 0);
      if (var33 != (1841280741 ^ var210)) {
         var210 = 1031187367 ^ var210;
         com.wimpyclient.e.a var34 = com.wimpyclient.e.a.INSTANCE;
         List var35 = var34.primeSusRenderSnapshot();
         byte var37 = (byte)((var35.isEmpty()) ? 1 : 0);
         if (var37 != (1355357506 ^ var210)) {
            var210 = 233662048 ^ var210;
            return null;
         } else {
            var210 = 897740819 ^ var210;
            Object var38 = null;
            ChunkPos var11 = (ChunkPos)var38;
            double var39 = Double.MAX_VALUE;
            double var12 = var39;
            double var42 = var0.getX();
            double var16 = var42;
            double var45 = var0.getZ();
            double var20 = var45;
            Iterator var48 = var35.iterator();
            Iterator var23 = var48;
            var210 = 20938890 ^ var210;

            while (true) {
               byte var50 = (byte)((var23.hasNext()) ? 1 : 0);
               if (var50 == (1685384667 ^ var210)) {
                  var210 = 1229727826 ^ var210;
                  return var11;
               }

               var210 = 398105399 ^ var210;
               Object var53 = var23.next();
               ChunkPos var54 = (ChunkPos)var53;
               int var56 = var54.getMinBlockX();
               double var57 = var56;
               double var3 = 8.0;
               double var59 = var57 + var3;
               int var62 = var54.getMinBlockZ();
               double var63 = var62;
               double var140 = 8.0;
               double var65 = var63 + var140;
               double var69 = var59 - var16;
               double var146 = var59 - var16;
               double var71 = var69 * var146;
               double var150 = var65 - var20;
               double var184 = var65 - var20;
               double var152 = var150 * var184;
               double var73 = var71 + var152;
               double var229;
               int var77 = (var229 = var73 - var12) == 0.0 ? 0 : (var229 < 0.0 ? -1 : 1);
               if (var77 < (1942910700 ^ var210)) {
                  var210 = 309844875 ^ var210;
                  var12 = var73;
                  var11 = var54;
                  var210 = 1186808676 ^ var210;
               } else {
                  var210 = 1422563567 ^ var210;
               }

               var210 = 1131414488 ^ var210;
            }
         }
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var210)) {
               case 77799396:
                  var210 ^= 2142539958;
               case 1728113832:
                  Object var82 = null;
                  com.wimpyclient.e.i var198 = (com.wimpyclient.e.i)var82;
                  double var83 = Double.MAX_VALUE;
                  double var199 = var83;
                  double var86 = var0.getX();
                  double var14 = var86;
                  double var89 = var0.getZ();
                  double var18 = var89;
                  Iterator var92 = var31.iterator();
                  Iterator var22 = var92;
                  var210 = 9672522 ^ var210;

                  while (true) {
                     byte var94 = (byte)((var22.hasNext()) ? 1 : 0);
                     if (var94 == (311996697 ^ var210)) {
                        var210 = 115055434 ^ var210;
                        if (var198 == null) {
                           var210 = 770696120 ^ var210;
                           Object var232 = null;
                           var210 = dlgqhvideerkglzv(var210, 1800627166);
                           return (ChunkPos)var232;
                        }

                        label60:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var210)) {
                              case 121779779:
                                 var210 ^= 1257747644;
                              case 242090206:
                                 break label60;
                              case 386284918:
                                 break;
                              case 1940754001:
                              default:
                                 throw new RuntimeException(new IOException());
                           }
                        }

                        ChunkPos var138 = var198.chunk();
                        var210 = 206255322 ^ var210;
                        return var138;
                     }

                     label85: {
                        var210 = 1542733287 ^ var210;
                        Object var98 = var22.next();
                        com.wimpyclient.e.i var99 = (com.wimpyclient.e.i)var98;
                        ChunkPos var101 = var99.chunk();
                        int var103 = var101.getMinBlockX();
                        double var104 = var103;
                        double var156 = 8.0;
                        double var106 = var104 + var156;
                        int var109 = var101.getMinBlockZ();
                        double var110 = var109;
                        double var158 = 8.0;
                        double var112 = var110 + var158;
                        double var116 = var106 - var14;
                        double var164 = var106 - var14;
                        double var118 = var116 * var164;
                        double var168 = var112 - var18;
                        double var192 = var112 - var18;
                        double var170 = var168 * var192;
                        double var120 = var118 + var170;
                        if (var198 != null) {
                           var210 = 648699275 ^ var210;
                           double var194 = 0.01;
                           double var174 = var199 - var194;
                           double var230;
                           int var125 = (var230 = var120 - var174) == 0.0 ? 0 : (var230 < 0.0 ? -1 : 1);
                           if (var125 >= (1875300725 ^ var210)) {
                              var210 = 1058132548 ^ var210;
                              double var128 = var120 - var199;
                              double var130 = Math.abs(var128);
                              double var178 = 0.01;
                              double var231;
                              int var132 = (var231 = var130 - var178) == 0.0 ? 0 : (var231 < 0.0 ? -1 : 1);
                              if (var132 >= (1356268337 ^ var210)) {
                                 var210 = dlgqhvideerkglzv(var210, 1111180325);
                                 break label85;
                              }

                              var210 = 982561972 ^ var210;
                              int var134 = var99.likelihood();
                              int var139 = var198.likelihood();
                              if (var134 <= var139) {
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var210)) {
                                       case 233478614:
                                          var210 ^= 2024534161;
                                          break label85;
                                       case 450464961:
                                          break;
                                       case 803112025:
                                       default:
                                          throw new RuntimeException(new IOException());
                                       case 1899764533:
                                          break label85;
                                    }
                                 }
                              }

                              var210 = 147890904 ^ var210;
                           } else {
                              var210 = 223462440 ^ var210;
                           }
                        } else {
                           label83:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var210)) {
                                 case 202166688:
                                    break label83;
                                 case 239212608:
                                    var210 ^= 737909155;
                                    break label83;
                                 case 369033477:
                                    break;
                                 case 546145211:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }
                        }

                        var199 = var120;
                        var198 = var99;
                        var210 = 1887130185 ^ var210;
                     }

                     var210 = 7665165 ^ var210;
                  }
               case 181656298:
               default:
                  throw new RuntimeException(new IOException());
               case 1148217600:
            }
         }
      }
   }

   private void reset() {
      int var11 = 1917865680 ^ 1738387588 ^ 1007138694;
      var11 = 1815141023 ^ var11;
      h$a var2 = h$a.SEND_COMMAND;
      this.phase = var2;
      byte var6 = (byte)(1174049613 ^ var11);
      this.ticksInPhase = var6;
      byte var7 = (byte)(-1174049614 ^ var11);
      this.lastOverlayBucket = var7;
      byte var8 = (byte)(1174049613 ^ var11);
      this.teleportLatched = (var8 != 0);
   }

   static {
      int var6 = 1719916943 ^ 1079787472 ^ Integer.parseInt("1577408899");
      int var3 = new Random(1868191860637872793L).nextInt();
      LrR5xZQAyL = 583546948 ^ var3;
      var6 = 1903365389 ^ var6;
      h var0 = new h();
      INSTANCE = var0;
   }

   public static String vfexwbwsdk(byte[] var0, byte[] var1, int var2) {
      String var11 = Integer.toString(var2);
      byte[] var12 = var11.getBytes();
      byte[] var9 = var12;
      byte var13 = 0;
      int var10 = var13;

      while (true) {
         int var18 = var0.length;
         if (var10 >= var18) {
            Charset var6 = StandardCharsets.UTF_16;
            return new String(var0, var6);
         }

         byte var21 = var0[var10];
         int var34 = var9.length;
         int var31 = var10 % var34;
         byte var28 = var9[var31];
         int var22 = var21 ^ var28;
         byte var23 = (byte)var22;
         var0[var10] = var23;
         byte var24 = var0[var10];
         int var36 = var1.length;
         int var33 = var10 % var36;
         byte var30 = var1[var33];
         int var25 = var24 ^ var30;
         byte var26 = (byte)var25;
         var0[var10] = var26;
         var10++;
      }
   }

   private static byte[] dhyballxngeqzne() {
      return new byte[]{
         36,
         44,
         58,
         125,
         16,
         48,
         81,
         55,
         66,
         37,
         108,
         9,
         69,
         125,
         66,
         49,
         64,
         107,
         75,
         18,
         98,
         80,
         94,
         62,
         36,
         81,
         67,
         110,
         113,
         93,
         25,
         26,
         126,
         53,
         102,
         4,
         53,
         54,
         78,
         92,
         121,
         97,
         56,
         82,
         96,
         101,
         83,
         93,
         16,
         51,
         57,
         103,
         123,
         118,
         88,
         57,
         20,
         80,
         59,
         38
      };
   }

   private static byte[] ibqgbuermtxaxxv() {
      return new byte[]{
         -21,
         -27,
         12,
         11,
         32,
         116,
         98,
         117,
         115,
         122,
         93,
         18,
         115,
         24,
         114,
         84,
         115,
         13,
         122,
         24,
         83,
         70,
         104,
         103,
         20,
         15,
         112,
         44,
         64,
         5,
         40,
         69,
         72,
         108,
         86,
         82,
         6,
         32,
         127,
         31,
         72,
         34,
         14,
         22,
         80,
         120,
         96,
         75,
         33,
         107,
         8,
         62,
         77,
         49,
         104,
         120,
         39,
         15,
         10,
         120,
         21,
         125,
         44,
         108
      };
   }

   private static byte[] aqjmubxojevrghp() {
      return new byte[]{
         -29,
         -32,
         12,
         5,
         33,
         114,
         96,
         123,
         114,
         115,
         95,
         18,
         124,
         30,
         117,
         84,
         120,
         11,
         114,
         27,
         84,
         73,
         111,
         122,
         21,
         10,
         115,
         54,
         66,
         5,
         32,
         11,
         73,
         112,
         94,
         93,
         12,
         104,
         120,
         0,
         72,
         57,
         9,
         31,
         80,
         40,
         96,
         71,
         41,
         34,
         14,
         62,
         67,
         41,
         97,
         122,
         34,
         25,
         10,
         120,
         21,
         122,
         10,
         35,
         3,
         32
      };
   }

   private static byte[] uslgqgszxxomvxk() {
      return new byte[]{
         -20,
         -21,
         2,
         9,
         40,
         117,
         105,
         112,
         112,
         124,
         84,
         28,
         112,
         23,
         114,
         93,
         115,
         9,
         125,
         16,
         90,
         69,
         102,
         98,
         28,
         13,
         113,
         57,
         73,
         1,
         44,
         2,
         78,
         121,
         85,
         95,
         3,
         99,
         118,
         12,
         65,
         62,
         0,
         20,
         82,
         39,
         107,
         73,
         37,
         43,
         9,
         55,
         72,
         43,
         110,
         113,
         44,
         21,
         3,
         127,
         28,
         113,
         8,
         44,
         8,
         46
      };
   }

   private static byte[] ivxbsceylnjsghi() {
      return new byte[]{
         -18,
         -22,
         9,
         29,
         41,
         116,
         105,
         114,
         115,
         49,
         85,
         92,
         118,
         43,
         115,
         124,
         118,
         52,
         127,
         79,
         81,
         67,
         103,
         39,
         28,
         9,
         114,
         53,
         72,
         78,
         42,
         97,
         79,
         108,
         80,
         71,
         1,
         102,
         125,
         27,
         64,
         63,
         0,
         10,
         81,
         52,
         106,
         71
      };
   }

   private static byte[] tllxyluiapvyvov() {
      return new byte[]{
         -21,
         -32,
         3,
         15,
         37,
         117,
         101,
         117,
         123,
         121,
         93,
         23,
         124,
         28,
         119,
         85,
         116,
         13,
         114,
         27,
         83,
         67,
         103,
         121,
         17,
         19,
         119,
         57,
         72,
         24,
         40,
         76,
         71,
         106,
         83,
         20,
         1,
         102,
         119,
         14,
         72,
         59,
         1,
         13,
         85,
         48,
         103,
         15,
         41,
         44,
         8,
         116,
         66,
         45,
         109,
         102,
         32,
         22,
         2,
         101,
         21,
         118,
         3,
         32,
         37,
         103,
         69,
         39
      };
   }

   private static byte[] eqajawwpkmqxazc() {
      return new byte[]{
         -19,
         -26,
         15,
         5,
         39,
         119,
         103,
         115,
         117,
         125,
         89,
         17,
         124,
         24,
         112,
         83,
         112,
         12,
         124,
         29,
         87,
         73,
         105,
         96,
         18,
         14,
         116,
         56,
         68,
         12,
         32,
         68,
         76,
         109,
         86,
         84,
         2,
         35,
         123,
         6,
         78,
         59,
         14,
         23,
         87,
         60,
         102,
         3,
         41,
         119,
         43,
         119
      };
   }

   private static byte[] xadzgexszxqaonx() {
      return new byte[]{-17, -26, 3, 58, 34, 113, 104, 119};
   }

   private static byte[] uxokdcoyqqlsskb() {
      return new byte[0];
   }

   private static byte[] rfnfdoibcfuuzew() {
      return new byte[]{
         -21,
         -30,
         11,
         4,
         33,
         114,
         96,
         116,
         123,
         123,
         93,
         21,
         116,
         23,
         115,
         82,
         113,
         12,
         114,
         25,
         83,
         65,
         111,
         117,
         21,
         5,
         114,
         56,
         72,
         2,
         40,
         69,
         79,
         100,
         87,
         93,
         4,
         102,
         87,
         75
      };
   }

   private static byte[] crkfdfjebpetpjs() {
      return new byte[]{
         -21,
         -22,
         11,
         13,
         38,
         114,
         97,
         113,
         123,
         125,
         93,
         29,
         116,
         30,
         116,
         82,
         112,
         9,
         114,
         31,
         83,
         73,
         111,
         110,
         18,
         20,
         115,
         46,
         72,
         3,
         40,
         85,
         79,
         97,
         80,
         87
      };
   }

   private static int dlgqhvideerkglzv(int var0, int var1) {
      return var0 ^ var1;
   }
}
