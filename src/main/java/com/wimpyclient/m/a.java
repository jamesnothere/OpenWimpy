package com.wimpyclient.m;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.lwjgl.opengl.GL33C;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class a {
   private int program;
   private int vao;
   private int arrayBuffer;
   private int uniformBuffer;
   private int uniformBufferBase0;
   private int framebuffer;
   private int activeTexture;
   private int texture2D;
   private int sampler0;
   private int blendSrcRgb;
   private int blendDstRgb;
   private int blendSrcAlpha;
   private int blendDstAlpha;
   private int blendEqRgb;
   private int blendEqAlpha;
   private int cullFaceMode;
   private int frontFace;
   private int depthFunc;
   private int stencilFunc;
   private int stencilRef;
   private int stencilValueMask;
   private int stencilWriteMask;
   private int stencilFail;
   private int stencilPassDepthFail;
   private int stencilPassDepthPass;
   private boolean blend;
   private boolean cullFace;
   private boolean depthTest;
   private boolean scissorTest;
   private boolean stencilTest;
   private boolean depthMask;
   private static final a INSTANCE;
   private final int[] viewport;
   private final int[] scissorBox;
   private final boolean[] colorMask;
   private final int[] colorMaskScratch;
   private int unpackAlignment;
   private int unpackRowLength;
   private int unpackSkipPixels;
   private int unpackSkipRows;
   private static int ivpupBbIcL;
   private transient int f6Wzk2bGhZU;

   private a() {
super();
      int var16 = 175988826 ^ 1347953898;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
            case 245919536:
               var16 = 1515979351 ^ var16;
            case 151488140:
               var16 = 369352450 ^ 176414390 ^ Integer.parseInt("486098771");
               this.f6Wzk2bGhZU = 825223527 ^ ivpupBbIcL;
               var16 = 18632590 ^ var16;
               byte var2 = 4;
               int[] var7 = new int[var2];
               this.viewport = var7;
               byte var8 = 4;
               int[] var9 = new int[var8];
               this.scissorBox = var9;
               byte var10 = 4;
               boolean[] var11 = new boolean[var10];
               this.colorMask = var11;
               byte var12 = 4;
               int[] var13 = new int[var12];
               this.colorMaskScratch = var13;
               return;
            case 392024168:
               break;
            case 1798167275:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public static a capture() {
      int var4 = 509096836 ^ 380187761 ^ 1239899632;
      var4 = 629197520 ^ var4;
      a var0 = INSTANCE;
      var0.captureInto();
      return INSTANCE;
   }

   private void captureInto() {
      int var134 = 1812164569 ^ 31300150 ^ 2026419351;
      var134 = 175250229 ^ var134;
      int var2 = 526700992 ^ var134;
      int var53 = GL33C.glGetInteger(var2);
      this.program = var53;
      int var54 = 526704632 ^ var134;
      int var55 = GL33C.glGetInteger(var54);
      this.vao = var55;
      int var56 = 526701273 ^ var134;
      int var57 = GL33C.glGetInteger(var56);
      this.arrayBuffer = var57;
      int var58 = 526700645 ^ var134;
      int var59 = GL33C.glGetInteger(var58);
      this.uniformBuffer = var59;
      int var60 = 526700645 ^ var134;
      byte var3 = (byte)(526670413 ^ var134);
      int var61 = GL33C.glGetIntegeri(var60, var3);
      this.uniformBufferBase0 = var61;
      int var62 = 526702315 ^ var134;
      int var63 = GL33C.glGetInteger(var62);
      this.framebuffer = var63;
      int var64 = 526704301 ^ var134;
      int var65 = GL33C.glGetInteger(var64);
      this.activeTexture = var65;
      int var12 = 526704269 ^ var134;
      GL33C.glActiveTexture(var12);
      int var66 = 526703140 ^ var134;
      int var67 = GL33C.glGetInteger(var66);
      this.texture2D = var67;
      int var68 = 526701396 ^ var134;
      int var69 = GL33C.glGetInteger(var68);
      this.sampler0 = var69;
      byte var15 = (byte)(526670413 ^ var134);
      byte var70 = (byte)(526670413 ^ var134);
      GL33C.glBindSampler(var15, var70);
      int var17 = this.activeTexture;
      GL33C.glActiveTexture(var17);
      short var71 = (short)(526668207 ^ var134);
      boolean var72 = GL33C.glIsEnabled(var71);
      this.blend = var72;
      int var73 = 526703236 ^ var134;
      int var74 = GL33C.glGetInteger(var73);
      this.blendSrcRgb = var74;
      int var75 = 526703237 ^ var134;
      int var76 = GL33C.glGetInteger(var75);
      this.blendDstRgb = var76;
      int var77 = 526703238 ^ var134;
      int var78 = GL33C.glGetInteger(var77);
      this.blendSrcAlpha = var78;
      int var79 = 526703239 ^ var134;
      int var80 = GL33C.glGetInteger(var79);
      this.blendDstAlpha = var80;
      int var81 = 526703172 ^ var134;
      int var82 = GL33C.glGetInteger(var81);
      this.blendEqRgb = var82;
      int var83 = 526701168 ^ var134;
      int var84 = GL33C.glGetInteger(var83);
      this.blendEqAlpha = var84;
      short var85 = (short)(526668041 ^ var134);
      boolean var86 = GL33C.glIsEnabled(var85);
      this.cullFace = var86;
      short var87 = (short)(526668040 ^ var134);
      int var88 = GL33C.glGetInteger(var87);
      this.cullFaceMode = var88;
      short var89 = (short)(526668043 ^ var134);
      int var90 = GL33C.glGetInteger(var89);
      this.frontFace = var90;
      short var91 = (short)(526668092 ^ var134);
      boolean var92 = GL33C.glIsEnabled(var91);
      this.depthTest = var92;
      short var93 = (short)(526668089 ^ var134);
      int var94 = GL33C.glGetInteger(var93);
      this.depthFunc = var94;
      short var95 = (short)(526668095 ^ var134);
      boolean var96 = GL33C.glGetBoolean(var95);
      this.depthMask = var96;
      short var97 = (short)(526669404 ^ var134);
      boolean var98 = GL33C.glIsEnabled(var97);
      this.scissorTest = var98;
      short var99 = (short)(526668253 ^ var134);
      boolean var100 = GL33C.glIsEnabled(var99);
      this.stencilTest = var100;
      byte var34 = (byte)((this.stencilTest) ? 1 : 0);
      if (var34 != (526670413 ^ var134)) {
         var134 = 1743942171 ^ var134;
         short var101 = (short)(2023105476 ^ var134);
         int var102 = GL33C.glGetInteger(var101);
         this.stencilFunc = var102;
         short var103 = (short)(2023105473 ^ var134);
         int var104 = GL33C.glGetInteger(var103);
         this.stencilRef = var104;
         short var105 = (short)(2023105477 ^ var134);
         int var106 = GL33C.glGetInteger(var105);
         this.stencilValueMask = var106;
         short var107 = (short)(2023105486 ^ var134);
         int var108 = GL33C.glGetInteger(var107);
         this.stencilWriteMask = var108;
         short var109 = (short)(2023105474 ^ var134);
         int var110 = GL33C.glGetInteger(var109);
         this.stencilFail = var110;
         short var111 = (short)(2023105475 ^ var134);
         int var112 = GL33C.glGetInteger(var111);
         this.stencilPassDepthFail = var112;
         short var113 = (short)(2023105472 ^ var134);
         int var114 = GL33C.glGetInteger(var113);
         this.stencilPassDepthPass = var114;
         var134 = 395299239 ^ var134;
      } else {
         label41:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
               case 215118225:
                  var134 ^= 1887288252;
               case 303901324:
                  break label41;
               case 617885216:
                  break;
               case 1665484028:
               default:
                  throw new RuntimeException(new IOException());
            }
         }
      }

      short var42 = (short)(1863969363 ^ var134);
      int[] var116 = this.viewport;
      GL33C.glGetIntegerv(var42, var116);
      short var43 = (short)(1863970273 ^ var134);
      int[] var118 = this.scissorBox;
      GL33C.glGetIntegerv(var43, var118);
      short var44 = (short)(1863970258 ^ var134);
      int[] var120 = this.colorMaskScratch;
      GL33C.glGetIntegerv(var44, var120);
      byte var45 = (byte)(1863967217 ^ var134);
      int var5 = var45;
      var134 = 1707760072 ^ var134;

      while (true) {
         byte var121 = (byte)(181647421 ^ var134);
         if (var5 >= var121) {
            var134 = flvifhotfuvhtagp(var134, 328331951);
            short var123 = (short)(423773795 ^ var134);
            int var124 = GL33C.glGetInteger(var123);
            this.unpackAlignment = var124;
            byte var125 = (byte)(423774870 ^ var134);
            this.unpackRowLength = var125;
            byte var126 = (byte)(423774870 ^ var134);
            this.unpackSkipPixels = var126;
            byte var127 = (byte)(423774870 ^ var134);
            this.unpackSkipRows = var127;
            return;
         }

         var134 = 1133044393 ^ var134;
         boolean[] var48 = this.colorMask;
         int[] var129 = this.colorMaskScratch;
         int var130 = var129[var5];
         byte var131;
         if (var130 != (1230723728 ^ var134)) {
            var134 = 1993146124 ^ var134;
            var131 = (byte)(1066902941 ^ var134);
            var134 = flvifhotfuvhtagp(var134, 1069140006);
         } else {
            label29:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var134)) {
                  case 187286397:
                  default:
                     throw new RuntimeException(new IOException());
                  case 237024812:
                     var134 ^= 1307199068;
                     break label29;
                  case 525463964:
                     break;
                  case 527431621:
                     break label29;
               }
            }

            var131 = (byte)(78716108 ^ var134);
            var134 = 77558134 ^ var134;
         }

         var48[var5] = (var131 != 0);
         var5 += 3042747 ^ var134;
         var134 = 184407427 ^ var134;
      }
   }

   public int framebuffer() {
      int var5 = 871119075 ^ 563643048 ^ 2026419351;
      var5 = 768048011 ^ var5;
      return this.framebuffer;
   }

   public int[] viewport() {
      int var5 = 152761860 ^ 1867954210 ^ 2026419351;
      var5 = 982979605 ^ var5;
      return this.viewport;
   }

   public void restore() {
      int var137 = 1479733902 ^ 1091991332 ^ 2026419351;
      var137 = 9154155 ^ var137;
      int var1 = 1634144790 ^ var137;
      int var56 = this.framebuffer;
      GL33C.glBindFramebuffer(var1, var56);
      int var7 = this.program;
      GL33C.glUseProgram(var7);
      int var9 = this.vao;
      GL33C.glBindVertexArray(var9);
      int var10 = 1634146244 ^ var137;
      int var58 = this.arrayBuffer;
      GL33C.glBindBuffer(var10, var58);
      int var11 = 1634145607 ^ var137;
      byte var59 = (byte)(1634180950 ^ var137);
      int var101 = this.uniformBufferBase0;
      GL33C.glBindBufferBase(var11, var59, var101);
      int var12 = 1634145607 ^ var137;
      int var61 = this.uniformBuffer;
      GL33C.glBindBuffer(var12, var61);
      int var13 = 1634147222 ^ var137;
      GL33C.glActiveTexture(var13);
      short var14 = (short)(1634177719 ^ var137);
      int var63 = this.texture2D;
      GL33C.glBindTexture(var14, var63);
      byte var15 = (byte)(1634180950 ^ var137);
      int var65 = this.sampler0;
      GL33C.glBindSampler(var15, var65);
      int var17 = this.activeTexture;
      GL33C.glActiveTexture(var17);
      short var18 = (short)(1634178228 ^ var137);
      boolean var67 = this.blend;
      setEnabled(var18, var67);
      int var20 = this.blendSrcRgb;
      int var69 = this.blendDstRgb;
      int var103 = this.blendSrcAlpha;
      int var120 = this.blendDstAlpha;
      GL33C.glBlendFuncSeparate(var20, var69, var103, var120);
      int var22 = this.blendEqRgb;
      int var71 = this.blendEqAlpha;
      GL33C.glBlendEquationSeparate(var22, var71);
      short var23 = (short)(1634178066 ^ var137);
      boolean var73 = this.cullFace;
      setEnabled(var23, var73);
      int var25 = this.cullFaceMode;
      GL33C.glCullFace(var25);
      int var27 = this.frontFace;
      GL33C.glFrontFace(var27);
      short var28 = (short)(1634178087 ^ var137);
      boolean var75 = this.depthTest;
      setEnabled(var28, var75);
      int var30 = this.depthFunc;
      GL33C.glDepthFunc(var30);
      boolean var32 = this.depthMask;
      GL33C.glDepthMask(var32);
      short var33 = (short)(1634177863 ^ var137);
      boolean var77 = this.scissorTest;
      setEnabled(var33, var77);
      short var34 = (short)(1634178246 ^ var137);
      boolean var79 = this.stencilTest;
      setEnabled(var34, var79);
      byte var36 = (byte)((this.stencilTest) ? 1 : 0);
      if (var36 != (1634180950 ^ var137)) {
         var137 = 1940959426 ^ var137;
         int var38 = this.stencilFunc;
         int var81 = this.stencilRef;
         int var105 = this.stencilValueMask;
         GL33C.glStencilFunc(var38, var81, var105);
         int var40 = this.stencilWriteMask;
         GL33C.glStencilMask(var40);
         int var42 = this.stencilFail;
         int var83 = this.stencilPassDepthFail;
         int var107 = this.stencilPassDepthPass;
         GL33C.glStencilOp(var42, var83, var107);
         var137 = 799028171 ^ var137;
      } else {
         var137 = 1544585993 ^ var137;
      }

      int[] var44 = this.viewport;
      byte var84 = (byte)(1031216223 ^ var137);
      int var45 = var44[var84];
      int[] var86 = this.viewport;
      byte var108 = (byte)(1031216222 ^ var137);
      int var87 = var86[var108];
      int[] var110 = this.viewport;
      byte var121 = (byte)(1031216221 ^ var137);
      int var111 = var110[var121];
      int[] var123 = this.viewport;
      byte var5 = (byte)(1031216220 ^ var137);
      int var124 = var123[var5];
      GL33C.glViewport(var45, var87, var111, var124);
      int[] var47 = this.scissorBox;
      byte var88 = (byte)(1031216223 ^ var137);
      int var48 = var47[var88];
      int[] var90 = this.scissorBox;
      byte var112 = (byte)(1031216222 ^ var137);
      int var91 = var90[var112];
      int[] var114 = this.scissorBox;
      byte var125 = (byte)(1031216221 ^ var137);
      int var115 = var114[var125];
      int[] var127 = this.scissorBox;
      byte var133 = (byte)(1031216220 ^ var137);
      int var128 = var127[var133];
      GL33C.glScissor(var48, var91, var115, var128);
      boolean[] var50 = this.colorMask;
      byte var92 = (byte)(1031216223 ^ var137);
      boolean var51 = var50[var92];
      boolean[] var94 = this.colorMask;
      byte var116 = (byte)(1031216222 ^ var137);
      boolean var95 = var94[var116];
      boolean[] var118 = this.colorMask;
      byte var129 = (byte)(1031216221 ^ var137);
      boolean var119 = var118[var129];
      boolean[] var131 = this.colorMask;
      byte var134 = (byte)(1031216220 ^ var137);
      boolean var132 = var131[var134];
      GL33C.glColorMask(var51, var95, var119, var132);
      short var52 = (short)(1031213226 ^ var137);
      int var97 = this.unpackAlignment;
      GL33C.glPixelStorei(var52, var97);
      short var53 = (short)(1031213229 ^ var137);
      byte var98 = (byte)(1031216223 ^ var137);
      GL33C.glPixelStorei(var53, var98);
      short var54 = (short)(1031213227 ^ var137);
      byte var99 = (byte)(1031216223 ^ var137);
      GL33C.glPixelStorei(var54, var99);
      short var55 = (short)(1031213228 ^ var137);
      byte var100 = (byte)(1031216223 ^ var137);
      GL33C.glPixelStorei(var55, var100);
   }

   private static void setEnabled(int var0, boolean var1) {
      int var7 = 1905990848 ^ 386971003 ^ 1239899632;
      var7 = 1579698907 ^ var7;
      if (var1 != ((1900330640 ^ var7) != 0)) {
         var7 = 700641762 ^ var7;
         GL33C.glEnable(var0);
         var7 = 923741158 ^ var7;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var7)) {
               case 192233587:
                  var7 ^= 259413665;
               case 1450440612:
                  GL33C.glDisable(var0);
                  var7 = 297503909 ^ var7;
                  return;
               case 856860914:
               default:
                  throw new RuntimeException(new IOException());
               case 1722906232:
            }
         }
      }
   }

   static {
      int var6 = 929448570 ^ 1770349294 ^ Integer.parseInt("486098771");
      int var3 = new Random(-7884185157851038907L).nextInt();
      ivpupBbIcL = 698423730 ^ var3;
      var6 = 1188103339 ^ var6;
      a var0 = new a();
      INSTANCE = var0;
   }

   public static String ymfwhppmiw(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] gilzgjnnqgwddjz() {
      return new byte[]{
         32,
         112,
         99,
         56,
         126,
         75,
         89,
         89,
         101,
         96,
         112,
         116,
         116,
         56,
         17,
         97,
         98,
         30,
         28,
         81,
         66,
         1,
         10,
         9,
         121,
         52,
         117,
         90,
         125,
         39,
         43,
         107,
         117,
         63,
         46,
         120,
         104,
         30,
         105,
         9,
         112,
         34,
         6,
         13,
         110,
         8
      };
   }

   private static int flvifhotfuvhtagp(int var0, int var1) {
      return var1 ^ var0;
   }
}
