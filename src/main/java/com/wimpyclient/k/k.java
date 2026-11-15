package com.wimpyclient.k;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.Window;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
public final class k {
   public static final k INSTANCE;
   public static final float MIN_SCALE = 0.5F;
   public static final float MAX_SCALE = 2.5F;
   public static final float HANDLE = 9.0F;
   private static final float HANDLE_HIT_PAD = 4.0F;
   private final EnumMap<k$d, k$c> positions;
   private final EnumMap<k$d, k$a> bounds;
   private static final float[] GUI_TO_HUD;
   private static final float[] HUD_TO_GUI;
   private static int f1N12WSnPWi;
   private transient int ubiGfJaHDE;

   private k() {
super();
      int var33 = 688181165 ^ 2043007363;
      
      var33 = 518065830 ^ var33;
      var33 = 1482328429 ^ 827812754 ^ Integer.parseInt("657322615");
      this.ubiGfJaHDE = 1534650425 ^ f1N12WSnPWi;
      var33 = xumisnwzbavhhaua(var33, 1303582994);
      Class<k$d> var3 = k$d.class;
      EnumMap var2 = new EnumMap<>(var3);
      this.positions = var2;
      Class<k$d> var30 = k$d.class;
      EnumMap var23 = new EnumMap<>(var30);
      this.bounds = var23;
      k$d[] var10 = k$d.values();
      k$d[] var4 = var10;
      int var12 = var10.length;
      int var5 = var12;
      byte var13 = 0;
      int var6 = var13;
      var33 = 383793418 ^ var33;

      while (var6 < var5) {
         var33 = 1945493454 ^ var33;
         k$d var16 = var4[var6];
         EnumMap var18 = this.positions;
         k$c var28 = new k$c();
         Object var19 = var18.put(var16, var28);
         EnumMap var21 = this.bounds;
         k$a var29 = new k$a();
         Object var22 = var21.put(var16, var29);
         var6++;
         var33 = 1945493454 ^ var33;
      }

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var33)) {
            case 160381796:
               var33 = 158508370 ^ var33;
            case 1442060238:
               return;
            case 164319689:
               break;
            case 636468294:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   public boolean hasCustom(k$d var1) {
      int var31;
      label53: {
         var31 = 1637385695 ^ 1412792754 ^ 1398312895;
         var31 = 1272583558 ^ var31;
         EnumMap var5 = this.positions;
         Object var6 = var5.get(var1);
         k$c var7 = (k$c)var6;
         label40:
         if (var7 != null) {
            var31 = 1151257738 ^ var31;
            float var10 = var7.nx;
            byte var11 = (byte)((Float.isFinite(var10)) ? 1 : 0);
            if (var11 == (1773228766 ^ var31)) {
               var31 = 101645797 ^ var31;
               float var13 = var7.x;
               byte var14 = (byte)((Float.isFinite(var13)) ? 1 : 0);
               if (var14 == (1874833211 ^ var31)) {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var31)) {
                        case 48782611:
                           break;
                        case 142806077:
                           var31 ^= 1009701675;
                        case 1665658968:
                           break label40;
                        case 1769464782:
                        default:
                           throw new RuntimeException(new IOException());
                     }
                  }
               }

               var31 = 2063745640 ^ var31;
            } else {
               var31 = 2097987469 ^ var31;
            }

            float var16 = var7.ny;
            byte var17 = (byte)((Float.isFinite(var16)) ? 1 : 0);
            if (var17 != (347991379 ^ var31)) {
               var31 = 870263229 ^ var31;
               break label53;
            }

            var31 = 878179809 ^ var31;
            float var19 = var7.y;
            byte var20 = (byte)((Float.isFinite(var19)) ? 1 : 0);
            if (var20 != (552212658 ^ var31)) {
               var31 = 126409820 ^ var31;
               break label53;
            }

            var31 = 1937466530 ^ var31;
         } else {
            var31 = xumisnwzbavhhaua(var31, 2126438980);
         }

         byte var21 = (byte)(1402043408 ^ var31);
         var31 = 430044458 ^ var31;
         return (var21 != 0);
      }

      byte var33 = (byte)(660784367 ^ var31);
      var31 = xumisnwzbavhhaua(var31, 1834110420);
      return (var33 != 0);
   }

   public float x(k$d var1, float var2) {
      int var30 = 1560764358 ^ 1306959009 ^ 1398312895;
      var30 = 2099935880 ^ var30;
      EnumMap var7 = this.positions;
      Object var8 = var7.get(var1);
      k$c var9 = (k$c)var8;
      if (var9 == null) {
         var30 = 1922042348 ^ var30;
         return var2;
      } else {
         var30 = xumisnwzbavhhaua(var30, 1909865564);
         float var11 = hudScreenW();
         float var13 = var9.nx;
         byte var14 = (byte)((Float.isFinite(var13)) ? 1 : 0);
         if (var14 != (1329924620 ^ var30)) {
            var30 ^= 906480045;
            float var26 = 1.0F;
            float var39;
            int var16 = (var39 = var11 - var26) == 0.0F ? 0 : (var39 < 0.0F ? -1 : 1);
            if (var16 > (2034418593 ^ var30)) {
               var30 = 315056991 ^ var30;
               float var18 = var9.nx;
               return var18 * var11;
            }

            label44:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 183575109:
                     var30 ^= 694157936;
                     break label44;
                  case 238118096:
                  default:
                     throw new RuntimeException();
                  case 587208205:
                     break;
                  case 2059524463:
                     break label44;
               }
            }
         } else {
            label38:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 160795698:
                     var30 ^= 526896093;
                  case 761697896:
                     break label38;
                  case 858158063:
                     break;
                  case 1681329535:
                  default:
                     throw new RuntimeException();
               }
            }
         }

         float var21 = var9.x;
         byte var22 = (byte)((Float.isFinite(var21)) ? 1 : 0);
         if (var22 != (1344455121 ^ var30)) {
            var30 = 333928800 ^ var30;
            float var25 = var9.x;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 55481363:
                     var30 = 863680817 ^ var30;
                     return var25;
                  case 1034517346:
                  default:
                     throw new RuntimeException();
                  case 1193210358:
                     break;
                  case 1991887798:
                     return var25;
               }
            }
         } else {
            var30 = xumisnwzbavhhaua(var30, 301780103);
            var30 = 828452054 ^ var30;
            return var2;
         }
      }
   }

   public float y(k$d var1, float var2) {
      int var30 = 526036772 ^ 155200824 ^ 1398312895;
      var30 = 634090957 ^ var30;
      EnumMap var7 = this.positions;
      Object var8 = var7.get(var1);
      k$c var9 = (k$c)var8;
      if (var9 == null) {
         var30 = 1102032322 ^ var30;
         return var2;
      } else {
         var30 = xumisnwzbavhhaua(var30, 69133957);
         float var12 = hudScreenH();
         float var14 = var9.ny;
         byte var15 = (byte)((Float.isFinite(var14)) ? 1 : 0);
         if (var15 != (1687658219 ^ var30)) {
            var30 = 1100011162 ^ var30;
            float var26 = 1.0F;
            float var40;
            int var17 = (var40 = var12 - var26) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
            if (var17 > (621234289 ^ var30)) {
               var30 = 618800039 ^ var30;
               float var19 = var9.ny;
               return var19 * var12;
            }

            var30 = 1707756780 ^ var30;
         } else {
            label38:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 48605040:
                     var30 ^= 609917558;
                  case 966387150:
                     break label38;
                  case 1191263123:
                  default:
                     throw new IllegalStateException();
                  case 2137288393:
               }
            }
         }

         float var22 = var9.y;
         byte var23 = (byte)((Float.isFinite(var22)) ? 1 : 0);
         if (var23 != (1087177885 ^ var30)) {
            var30 = 1873161892 ^ var30;
            float var25 = var9.y;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var30)) {
                  case 199200421:
                     var30 = 754025743 ^ var30;
                     return var25;
                  case 228250619:
                     break;
                  case 635417678:
                     return var25;
                  case 1253335764:
                  default:
                     throw new IllegalStateException();
               }
            }
         } else {
            var30 = xumisnwzbavhhaua(var30, 481552600);
            var30 = 1608794995 ^ var30;
            return var2;
         }
      }
   }

   public float scale(k$d var1) {
      int var17 = 870911462 ^ 1369121925 ^ 1398312895;
      var17 = 1601194146 ^ var17;
      EnumMap var6 = this.positions;
      Object var7 = var6.get(var1);
      k$c var8 = (k$c)var7;
      if (var8 == null) {
         var17 = 508026045 ^ var17;
         return 1.0F;
      } else {
         var17 = xumisnwzbavhhaua(var17, 1074629987);
         float var12 = var8.scale;
         float var14 = 0.5F;
         float var4 = 2.5F;
         return Mth.clamp(var12, var14, var4);
      }
   }

   public void set(k$d var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int var61 = 872573575 ^ 554473998 ^ 1398312895;
      var61 = 509043202 ^ var61;
      EnumMap var18 = this.positions;
      Object var19 = var18.get(var1);
      k$c var20 = (k$c)var19;
      if (var20 == null) {
         var61 = 1327336146 ^ var61;
      } else {
         var61 = 895944415 ^ var61;
         byte var23 = (byte)((Float.isFinite(var2)) ? 1 : 0);
         if (var23 != (1835408363 ^ var61)) {
            var61 = 719387518 ^ var61;
            byte var25 = (byte)((Float.isFinite(var3)) ? 1 : 0);
            if (var25 != (1200021653 ^ var61)) {
               var61 = xumisnwzbavhhaua(var61, 1047418344);
               byte var28 = (byte)((Float.isFinite(var6)) ? 1 : 0);
               float var48;
               if (var28 != (2045293949 ^ var61)) {
                  var61 = 62222895 ^ var61;
                  float var29 = 8.0F;
                  var48 = Math.max(var29, var6);

                  label75:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var61)) {
                        case 219531379:
                           var61 ^= 1066196465;
                        case 623996786:
                           break label75;
                        case 797381603:
                        default:
                           throw new RuntimeException();
                        case 1071160890:
                     }
                  }
               } else {
                  var61 = xumisnwzbavhhaua(var61, 1354973340);
                  var48 = 48.0F;
                  var61 = 1828384578 ^ var61;
               }

               byte var31 = (byte)((Float.isFinite(var7)) ? 1 : 0);
               float var47;
               if (var31 != (1171331747 ^ var61)) {
                  var61 = 862020730 ^ var61;
                  float var32 = 8.0F;
                  var47 = Math.max(var32, var7);

                  label66:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var61)) {
                        case 99976052:
                           var61 ^= 1640352757;
                           break label66;
                        case 288038486:
                           break;
                        case 1111511540:
                           break label66;
                        case 1984811053:
                        default:
                           throw new RuntimeException();
                     }
                  }
               } else {
                  var61 = 648616242 ^ var61;
                  var47 = 24.0F;
                  var61 = 1947055805 ^ var61;
               }

               float var46;
               label59: {
                  byte var34 = (byte)((Float.isFinite(var4)) ? 1 : 0);
                  if (var34 != (393590060 ^ var61)) {
                     var61 = 1779607331 ^ var61;
                     float var52 = 1.0F;
                     float var81;
                     int var36 = (var81 = var4 - var52) == 0.0F ? 0 : (var81 < 0.0F ? -1 : 1);
                     if (var36 > (2103906831 ^ var61)) {
                        var61 = 268334950 ^ var61;
                        var46 = var4;
                        var61 = xumisnwzbavhhaua(var61, 1987262896);
                        break label59;
                     }

                     var61 = xumisnwzbavhhaua(var61, 278904692);
                  } else {
                     label57:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var61)) {
                           case 225712240:
                              var61 ^= 2056067159;
                           case 504376255:
                              break label57;
                           case 1639929926:
                           default:
                              throw new RuntimeException();
                           case 1842961236:
                        }
                     }
                  }

                  var46 = hudScreenW();
                  var61 = 1762849186 ^ var61;
               }

               float var41;
               label45: {
                  byte var38 = (byte)((Float.isFinite(var5)) ? 1 : 0);
                  if (var38 != (82468057 ^ var61)) {
                     var61 = 554838819 ^ var61;
                     float var53 = 1.0F;
                     float var82;
                     int var40 = (var82 = var5 - var53) == 0.0F ? 0 : (var82 < 0.0F ? -1 : 1);
                     if (var40 > (637040634 ^ var61)) {
                        var61 = 90579308 ^ var61;
                        var41 = var5;
                        var61 = 410474057 ^ var61;
                        break label45;
                     }

                     var61 = xumisnwzbavhhaua(var61, 409030318);
                  } else {
                     var61 = xumisnwzbavhhaua(var61, 963863949);
                  }

                  var41 = hudScreenH();
                  var61 = 91240843 ^ var61;
               }

               var20.x = var2;
               var20.y = var3;
               clampVisible(var20, var46, var41, var48, var47);
               storeNormalized(var20, var46, var41);
               return;
            }

            var61 = 1389115984 ^ var61;
         } else {
            var61 = xumisnwzbavhhaua(var61, 2016198958);
         }

         this.reset(var1);
      }
   }

   public void setScale(k$d var1, float var2) {
      int var23 = 1760789789 ^ 362773629 ^ 1398312895;
      var23 = 95337320 ^ var23;
      EnumMap var8 = this.positions;
      Object var9 = var8.get(var1);
      k$c var10 = (k$c)var9;
      if (var10 == null) {
         var23 = 2087974370 ^ var23;
      } else {
         var23 = xumisnwzbavhhaua(var23, 522379345);
         byte var13 = (byte)((Float.isFinite(var2)) ? 1 : 0);
         if (var13 == (884485606 ^ var23)) {
            var23 = 434186392 ^ var23;
            float var20 = 1.0F;
            var10.scale = var20;
            var23 = xumisnwzbavhhaua(var23, 627231850);
         } else {
            var23 = xumisnwzbavhhaua(var23, 525508387);
            float var5 = 0.5F;
            float var6 = 2.5F;
            float var18 = Mth.clamp(var2, var5, var6);
            var10.scale = var18;
            var23 = 600931281 ^ var23;
         }

         this.ensureVisible(var1);
      }
   }

   public void ensureVisible(k$d var1) {
      int var102 = 1835863293 ^ 2024765684 ^ 1398312895;
      var102 = 1459572700 ^ var102;
      EnumMap var13 = this.positions;
      Object var14 = var13.get(var1);
      k$c var15 = (k$c)var14;
      if (var15 == null) {
         var102 = 525343175 ^ var102;
      } else {
         var102 = xumisnwzbavhhaua(var102, 1727128093);
         float var17 = hudScreenW();
         float var18 = hudScreenH();
         float var20 = var15.nx;
         byte var21 = (byte)((Float.isFinite(var20)) ? 1 : 0);
         if (var21 != (1989432951 ^ var102)) {
            var102 = 1370340201 ^ var102;
            float var65 = 1.0F;
            float var133;
            int var23 = (var133 = var17 - var65) == 0.0F ? 0 : (var133 < 0.0F ? -1 : 1);
            if (var23 > (658107678 ^ var102)) {
               var102 = 592098924 ^ var102;
               float var67 = var15.nx;
               float var68 = var67 * var17;
               var15.x = var68;
               var102 = 1082879435 ^ var102;
            } else {
               label107:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var102)) {
                     case 201333843:
                        var102 ^= 1673649063;
                        break label107;
                     case 390680323:
                     default:
                        throw new RuntimeException(new IOException());
                     case 535958140:
                        break;
                     case 1775295891:
                        break label107;
                  }
               }
            }
         } else {
            var102 = xumisnwzbavhhaua(var102, 845963470);
         }

         float var26 = var15.ny;
         byte var27 = (byte)((Float.isFinite(var26)) ? 1 : 0);
         if (var27 != (1157117625 ^ var102)) {
            var102 = 459060147 ^ var102;
            float var69 = 1.0F;
            float var134;
            int var29 = (var134 = var18 - var69) == 0.0F ? 0 : (var134 < 0.0F ? -1 : 1);
            if (var29 > (1604617482 ^ var102)) {
               var102 = 1523018842 ^ var102;
               float var71 = var15.ny;
               float var72 = var71 * var18;
               var15.y = var72;
               var102 = 1026621593 ^ var102;
            } else {
               label98:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var102)) {
                     case 156147303:
                        var102 ^= 1744202947;
                        break label98;
                     case 1388173594:
                        break;
                     case 1499620750:
                        break label98;
                     case 1660269986:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            }
         } else {
            var102 = xumisnwzbavhhaua(var102, 2091573104);
         }

         float var32 = var15.x;
         byte var33 = (byte)((Float.isFinite(var32)) ? 1 : 0);
         if (var33 != (944957897 ^ var102)) {
            var102 = 255042365 ^ var102;
            float var35 = var15.y;
            byte var36 = (byte)((Float.isFinite(var35)) ? 1 : 0);
            if (var36 != (929123060 ^ var102)) {
               var102 = 1823851350 ^ var102;
               float var74 = var15.scale;
               byte var75 = (byte)((Float.isFinite(var74)) ? 1 : 0);
               float var85;
               if (var75 != (1540655522 ^ var102)) {
                  var102 = 1519036712 ^ var102;
                  float var77 = var15.scale;
                  float var94 = 0.5F;
                  float var5 = 2.5F;
                  var85 = Mth.clamp(var77, var94, var5);
                  var102 = 261795734 ^ var102;
               } else {
                  var102 = xumisnwzbavhhaua(var102, 2041394992);
                  var85 = 1.0F;
                  var102 = 750596494 ^ var102;
               }

               var15.scale = var85;
               EnumMap var39 = this.bounds;
               Object var40 = var39.get(var1);
               k$a var41 = (k$a)var40;
               if (var41 == null) {
                  var102 = xumisnwzbavhhaua(var102, 122936019);
                  return;
               }

               var102 = 5950987 ^ var102;
               byte var44 = (byte)((var41.valid) ? 1 : 0);
               if (var44 == (245252375 ^ var102)) {
                  var102 = 118035672 ^ var102;
                  return;
               }

               label80:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var102)) {
                     case 206737538:
                        var102 ^= 69871913;
                        break label80;
                     case 1046259397:
                     default:
                        throw new RuntimeException(new IOException());
                     case 1090695639:
                        break label80;
                     case 1553893175:
                  }
               }

               float var46 = var41.w;
               byte var47 = (byte)((Float.isFinite(var46)) ? 1 : 0);
               float var49;
               if (var47 != (179595326 ^ var102)) {
                  var102 = 1607538804 ^ var102;
                  float var48 = 8.0F;
                  float var80 = var41.w;
                  var49 = Math.max(var48, var80);
                  var102 = 640631373 ^ var102;
               } else {
                  var102 = 525245861 ^ var102;
                  var49 = 48.0F;
                  var102 = 1722861468 ^ var102;
               }

               float var51 = var41.h;
               byte var52 = (byte)((Float.isFinite(var51)) ? 1 : 0);
               float var54;
               if (var52 != (1934242311 ^ var102)) {
                  var102 = 1255859734 ^ var102;
                  float var53 = 8.0F;
                  float var82 = var41.h;
                  var54 = Math.max(var53, var82);
                  var102 = xumisnwzbavhhaua(var102, 740240735);
               } else {
                  var102 = 1689288304 ^ var102;
                  var54 = 24.0F;
                  var102 = 41268537 ^ var102;
               }

               clampVisible(var15, var17, var18, var49, var54);
               storeNormalized(var15, var17, var18);
               return;
            }

            var102 = 612087801 ^ var102;
         } else {
            label90:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var102)) {
                  case 220241063:
                     var102 ^= 726144196;
                     break label90;
                  case 798642448:
                  default:
                     throw new RuntimeException(new IOException());
                  case 1769678614:
                     break;
                  case 2059078801:
                     break label90;
               }
            }
         }

         float var58 = var15.x;
         byte var59 = (byte)((Float.isInfinite(var58)) ? 1 : 0);
         if (var59 == (320535821 ^ var102)) {
            var102 = 1337470706 ^ var102;
            float var61 = var15.y;
            byte var62 = (byte)((Float.isInfinite(var61)) ? 1 : 0);
            if (var62 == (1554174975 ^ var102)) {
               var102 = 89425573 ^ var102;
               float var87 = var15.scale;
               byte var88 = (byte)((Float.isFinite(var87)) ? 1 : 0);
               float var92;
               if (var88 != (1509315930 ^ var102)) {
                  var102 = 1968171323 ^ var102;
                  float var90 = var15.scale;
                  float var97 = 0.5F;
                  float var99 = 2.5F;
                  var92 = Mth.clamp(var90, var97, var99);
                  var102 = 369438070 ^ var102;
               } else {
                  var102 = xumisnwzbavhhaua(var102, 1839955227);
                  var92 = 1.0F;
                  var102 = 249674070 ^ var102;
               }

               var15.scale = var92;
               return;
            }

            var102 = 726078496 ^ var102;
         } else {
            var102 = xumisnwzbavhhaua(var102, 1694448338);
         }

         this.reset(var1);
      }
   }

   public void ensureAllVisible() {
      int var18 = 819350890 ^ 1017683818 ^ 1398312895;
      var18 = 1560919767 ^ var18;
      k$d[] var1 = k$d.values();
      k$d[] var3 = var1;
      int var8 = var1.length;
      int var4 = var8;
      byte var9 = (byte)(36692840 ^ var18);
      int var5 = var9;
      var18 = 425689903 ^ var18;

      label23:
      while (var5 < var4) {
         var18 ^= 158657024;
         k$d var12 = var3[var5];
         this.ensureVisible(var12);
         var5 += 302287430 ^ var18;

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var18)) {
               case 48814573:
                  var18 ^= 158657024;
                  continue label23;
               case 203683148:
               default:
                  throw new RuntimeException(new IOException());
               case 300068085:
                  continue label23;
               case 1706171241:
            }
         }
      }

      var18 = xumisnwzbavhhaua(var18, 1812177463);
   }

   public void reset(k$d var1) {
      int var21 = 1529080933 ^ 227817966 ^ 1398312895;
      var21 = 1117386612 ^ var21;
      EnumMap var5 = this.positions;
      Object var6 = var5.get(var1);
      k$c var7 = (k$c)var6;
      if (var7 == null) {
         var21 = 366335322 ^ var21;
      } else {
         var21 = xumisnwzbavhhaua(var21, 1389859738);
         float var14 = Float.NaN;
         var7.x = var14;
         float var15 = Float.NaN;
         var7.y = var15;
         float var16 = Float.NaN;
         var7.nx = var16;
         float var17 = Float.NaN;
         var7.ny = var17;
         float var18 = 1.0F;
         var7.scale = var18;
      }
   }

   private static void clampVisible(k$c var0, float var1, float var2, float var3, float var4) {
      int var85 = 962979687 ^ 235350814 ^ 136341382;
      var85 = 900649104 ^ var85;
      float var5 = 56.0F;
      float var17 = Math.max(var5, var1);
      float var18 = 56.0F;
      float var19 = Math.max(var18, var2);
      float var20 = 8.0F;
      float var21 = Math.max(var20, var3);
      float var22 = 8.0F;
      float var23 = Math.max(var22, var4);
      float var24 = 28.0F;
      float var25 = var24 - var21;
      float var26 = 28.0F;
      float var27 = var26 - var23;
      float var56 = 28.0F;
      float var29 = var17 - var56;
      float var57 = 28.0F;
      float var31 = var19 - var57;
      float var95;
      int var33 = (var95 = var25 - var29) == 0.0F ? 0 : (var95 < 0.0F ? -1 : 1);
      if (var33 > (183270255 ^ var85)) {
         var85 = 471935583 ^ var85;
         float var75 = var17 - var21;
         float var81 = 0.5F;
         float var76 = var75 * var81;
         var0.x = var76;
         var85 = xumisnwzbavhhaua(var85, 436968765);
      } else {
         var85 = 93818128 ^ var85;
         float var60 = var0.x;
         float var61 = Mth.clamp(var60, var25, var29);
         var0.x = var61;
         var85 = 62732914 ^ var85;
      }

      float var96;
      int var36 = (var96 = var27 - var31) == 0.0F ? 0 : (var96 < 0.0F ? -1 : 1);
      if (var36 > (214354957 ^ var85)) {
         var85 = 1229833477 ^ var85;
         float var64 = var19 - var23;
         float var78 = 0.5F;
         float var65 = var64 * var78;
         var0.y = var65;

         label43:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var85)) {
               case 113059060:
                  var85 ^= 332020736;
                  break label43;
               case 596881870:
               default:
                  throw new RuntimeException(new IOException());
               case 1133017777:
                  break label43;
               case 1961408147:
            }
         }
      } else {
         label36:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var85)) {
               case 146876319:
                  var85 ^= 1823338557;
                  break label36;
               case 659733882:
                  break;
               case 1140494258:
                  break label36;
               case 1579253617:
               default:
                  throw new RuntimeException(new IOException());
            }
         }

         float var72 = var0.y;
         float var73 = Mth.clamp(var72, var27, var31);
         var0.y = var73;
         var85 = 908724536 ^ var85;
      }

      float var39 = var0.x;
      byte var40 = (byte)((Float.isFinite(var39)) ? 1 : 0);
      if (var40 != (1447113992 ^ var85)) {
         var85 = 437482890 ^ var85;
         float var42 = var0.y;
         byte var43 = (byte)((Float.isFinite(var42)) ? 1 : 0);
         if (var43 != (1280458882 ^ var85)) {
            var85 = 209799296 ^ var85;
            return;
         }

         var85 = 566761801 ^ var85;
      } else {
         var85 = xumisnwzbavhhaua(var85, 1004235971);
      }

      float var66 = Float.NaN;
      var0.x = var66;
      float var67 = Float.NaN;
      var0.y = var67;
      float var68 = Float.NaN;
      var0.nx = var68;
      float var69 = Float.NaN;
      var0.ny = var69;
      float var70 = 1.0F;
      var0.scale = var70;
      var85 = 759779785 ^ var85;
   }

   private static void storeNormalized(k$c var0, float var1, float var2) {
      int var27 = 1327127957 ^ 226355763 ^ 136341382;
      var27 = 1935699891 ^ var27;
      float var6 = var0.x;
      byte var7 = (byte)((Float.isFinite(var6)) ? 1 : 0);
      if (var7 != (958906259 ^ var27)) {
         var27 = 1777791200 ^ var27;
         float var4 = 1.0F;
         float var37;
         int var9 = (var37 = var1 - var4) == 0.0F ? 0 : (var37 < 0.0F ? -1 : 1);
         if (var9 > (1355894643 ^ var27)) {
            var27 = 1901175937 ^ var27;
            float var18 = var0.x;
            float var19 = var18 / var1;
            var0.nx = var19;
            var27 = 1779715057 ^ var27;
         } else {
            var27 = 457568112 ^ var27;
         }
      } else {
         var27 = 1924341648 ^ var27;
      }

      float var12 = var0.y;
      byte var13 = (byte)((Float.isFinite(var12)) ? 1 : 0);
      if (var13 != (1268031491 ^ var27)) {
         var27 = 636267285 ^ var27;
         float var20 = 1.0F;
         float var38;
         int var15 = (var38 = var2 - var20) == 0.0F ? 0 : (var38 < 0.0F ? -1 : 1);
         if (var15 > (1853360918 ^ var27)) {
            var27 = 1291175515 ^ var27;
            float var22 = var0.y;
            float var23 = var22 / var2;
            var0.ny = var23;
            var27 = 563909151 ^ var27;
         } else {
            var27 = xumisnwzbavhhaua(var27, 1835619396);
         }
      } else {
         var27 = xumisnwzbavhhaua(var27, 1216741201);
      }
   }

   public float beginElement(com.wimpyclient.m.b var1, k$d var2, float var3, float var4) {
      int var28 = 899440609 ^ 890320481 ^ 1398312895;
      var28 = 742103982 ^ var28;
      float var9 = this.scale(var2);
      float var20 = 1.0F;
      float var11 = var9 - var20;
      float var12 = Math.abs(var11);
      float var21 = 0.001F;
      float var32;
      int var13 = (var32 = var12 - var21) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
      if (var13 < (2146336145 ^ var28)) {
         var28 = 110969673 ^ var28;
         return 1.0F;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var28)) {
               case 3744999:
                  break;
               case 132017318:
                  var28 = 448798542 ^ var28;
               case 1869031254:
                  var1.save();
                  var1.translate(var3, var4);
                  var1.scale(var9);
                  var1.translate(var3, var4);
                  return var9;
               case 1382520447:
               default:
                  throw new IllegalStateException();
            }
         }
      }
   }

   public void endElement(com.wimpyclient.m.b var1, float var2) {
      int var12 = 1856100655 ^ 2070984606 ^ 1398312895;
      var12 = 1044285306 ^ var12;
      float var4 = 1.0F;
      float var5 = var2 - var4;
      float var6 = Math.abs(var5);
      float var9 = 0.001F;
      float var17;
      int var7 = (var17 = var6 - var9) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
      if (var7 >= (2025285236 ^ var12)) {
         var12 = 461539700 ^ var12;
         var1.restore();
         var12 = 1044433609 ^ var12;
      } else {
         var12 = 633488317 ^ var12;
      }
   }

   public void report(k$d var1, float var2, float var3, float var4, float var5) {
      int var41 = 1261034105 ^ 76884722 ^ 1398312895;
      var41 = 72067538 ^ var41;
      EnumMap var10 = this.bounds;
      Object var11 = var10.get(var1);
      k$a var12 = (k$a)var11;
      if (var12 == null) {
         var41 = 2026071809 ^ var41;
      } else {
         var41 = xumisnwzbavhhaua(var41, 1887083385);
         byte var15 = (byte)((Float.isFinite(var2)) ? 1 : 0);
         if (var15 != (1758809503 ^ var41)) {
            var41 = 2145714905 ^ var41;
            byte var17 = (byte)((Float.isFinite(var3)) ? 1 : 0);
            if (var17 != (389041990 ^ var41)) {
               var41 = 1300793058 ^ var41;
               byte var19 = (byte)((Float.isFinite(var4)) ? 1 : 0);
               if (var19 != (1522059684 ^ var41)) {
                  var41 = 1838537284 ^ var41;
                  byte var21 = (byte)((Float.isFinite(var5)) ? 1 : 0);
                  if (var21 != (925701088 ^ var41)) {
                     byte var37;
                     label30: {
                        var41 = xumisnwzbavhhaua(var41, 1120745586);
                        var12.x = var2;
                        var12.y = var3;
                        var12.w = var4;
                        var12.h = var5;
                        float var8 = 1.0F;
                        float var54;
                        int var34 = (var54 = var4 - var8) == 0.0F ? 0 : (var54 < 0.0F ? -1 : 1);
                        if (var34 > (1977625490 ^ var41)) {
                           var41 = 1028044277 ^ var41;
                           float var38 = 1.0F;
                           float var55;
                           int var36 = (var55 = var5 - var38) == 0.0F ? 0 : (var55 < 0.0F ? -1 : 1);
                           if (var36 > (1218879079 ^ var41)) {
                              var41 = 909746843 ^ var41;
                              var37 = (byte)(2124365053 ^ var41);
                              var41 = 1731709680 ^ var41;
                              break label30;
                           }

                           var41 = 342807246 ^ var41;
                        } else {
                           var41 = xumisnwzbavhhaua(var41, 690513723);
                        }

                        var37 = (byte)(1556630697 ^ var41);
                        var41 = 1163967141 ^ var41;
                     }

                     var12.valid = (var37 != 0);
                     return;
                  }

                  var41 = 57526197 ^ var41;
               } else {
                  var41 = xumisnwzbavhhaua(var41, 1861754353);
               }
            } else {
               var41 = 594582291 ^ var41;
            }
         } else {
            label43:
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var41)) {
                  case 186461873:
                     var41 ^= 1553308106;
                     break label43;
                  case 853280762:
                  default:
                     throw new IllegalStateException();
                  case 1723820927:
                     break label43;
                  case 1905936188:
               }
            }
         }

         byte var28 = (byte)(876663893 ^ var41);
         var12.valid = (var28 != 0);
      }
   }

   public void reportScaled(k$d var1, float var2, float var3, float var4, float var5) {
      int var22 = 1741050731 ^ 336067015 ^ 1398312895;
      var22 = 887576768 ^ var22;
      float var14 = this.scale(var1);
      float var17 = var4 * var14;
      float var19 = var5 * var14;
      this.report(var1, var2, var3, var17, var19);
   }

   public void clearReport(k$d var1) {
      int var13 = 1192641513 ^ 1539846880 ^ 1398312895;
      var13 = 414287701 ^ var13;
      EnumMap var5 = this.bounds;
      Object var6 = var5.get(var1);
      k$a var7 = (k$a)var6;
      if (var7 != null) {
         var13 = 1959664295 ^ var13;
         byte var10 = (byte)(603546436 ^ var13);
         var7.valid = (var10 != 0);
         var13 = 903519907 ^ var13;
      } else {
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var13)) {
               case 150678288:
                  var13 = 1091863556 ^ var13;
                  return;
               case 647509504:
                  break;
               case 665082341:
               default:
                  throw new IllegalStateException();
               case 2041103109:
                  return;
            }
         }
      }
   }

   public void clearReports() {
      int var16 = 576445714 ^ 1642186527 ^ 1398312895;
      var16 = 682097222 ^ var16;
      EnumMap var5 = this.bounds;
      Collection var6 = var5.values();
      Iterator var7 = var6.iterator();
      Iterator var3 = var7;
      var16 = 1408362276 ^ var16;

      label23:
      while (true) {
         byte var9 = (byte)((var3.hasNext()) ? 1 : 0);
         if (var9 == (1806993616 ^ var16)) {
            var16 = xumisnwzbavhhaua(var16, 397122380);
            return;
         }

         var16 ^= 822637808;
         Object var11 = var3.next();
         k$a var12 = (k$a)var11;
         byte var2 = (byte)(1522334752 ^ var16);
         var12.valid = (var2 != 0);

         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var16)) {
               case 265188034:
                  var16 ^= 822637808;
               case 489678301:
                  continue label23;
               case 1828358449:
                  break;
               case 2134515880:
               default:
                  throw new RuntimeException();
            }
         }
      }
   }

   public k$d hit(float var1, float var2) {
      int var50 = 1563456481 ^ 1705239749 ^ 1398312895;
      var50 = 500457826 ^ var50;
      k$d[] var3 = k$d.values();
      k$d[] var6 = var3;
      int var11 = var3.length;
      byte var4 = (byte)(1981774328 ^ var50);
      int var12 = var11 - var4;
      int var7 = var12;
      var50 = 1306036502 ^ var50;

      label87:
      while (true) {
         if (var7 >= (1002959087 ^ var50)) {
            var50 ^= 926309885;
            k$d var15 = var6[var7];
            EnumMap var17 = this.bounds;
            Object var18 = var17.get(var15);
            k$a var19 = (k$a)var18;
            if (var19 != null) {
               var50 = 1574207656 ^ var50;
               byte var22 = (byte)((var19.valid) ? 1 : 0);
               if (var22 != (1361391034 ^ var50)) {
                  var50 = 2104973024 ^ var50;
                  float var36 = var19.x;
                  float var57;
                  int var24 = (var57 = var1 - var36) == 0.0F ? 0 : (var57 < 0.0F ? -1 : 1);
                  if (var24 >= (743603034 ^ var50)) {
                     var50 = 1924389769 ^ var50;
                     float var38 = var19.x;
                     float var45 = var19.w;
                     float var39 = var38 + var45;
                     float var58;
                     int var26 = (var58 = var1 - var39) == 0.0F ? 0 : (var58 < 0.0F ? -1 : 1);
                     if (var26 < (1591845075 ^ var50)) {
                        var50 = 1178869338 ^ var50;
                        float var41 = var19.y;
                        float var59;
                        int var28 = (var59 = var2 - var41) == 0.0F ? 0 : (var59 < 0.0F ? -1 : 1);
                        if (var28 >= (413515401 ^ var50)) {
                           var50 ^= 88688783;
                           float var43 = var19.y;
                           float var47 = var19.h;
                           float var44 = var43 + var47;
                           float var60;
                           int var30 = (var60 = var2 - var44) == 0.0F ? 0 : (var60 < 0.0F ? -1 : 1);
                           if (var30 < (502068742 ^ var50)) {
                              var50 = 1216893951 ^ var50;
                              return var15;
                           }

                           label48:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var50)) {
                                 case 167444807:
                                    var50 ^= 423038555;
                                    break label48;
                                 case 238971052:
                                 default:
                                    throw new IllegalStateException();
                                 case 1366240162:
                                    break;
                                 case 1414790320:
                                    break label48;
                              }
                           }
                        } else {
                           label61:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var50)) {
                                 case 264321420:
                                    var50 ^= 478037716;
                                    break label61;
                                 case 305470498:
                                    break;
                                 case 684828688:
                                    break label61;
                                 case 1707405337:
                                 default:
                                    throw new IllegalStateException();
                              }
                           }
                        }
                     } else {
                        var50 = xumisnwzbavhhaua(var50, 1513773198);
                     }
                  } else {
                     label69:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var50)) {
                           case 98558636:
                              var50 ^= 680100615;
                              break label69;
                           case 119295090:
                           default:
                              throw new IllegalStateException();
                           case 1013535527:
                              break;
                           case 1404616621:
                              break label69;
                        }
                     }
                  }
               } else {
                  var50 = 1442764263 ^ var50;
               }
            } else {
               label55:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var50)) {
                     case 152318883:
                        var50 ^= 136992079;
                        break label55;
                     case 288115069:
                        break;
                     case 1247931584:
                        break label55;
                     case 1976718909:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }

            var7 += -81524830 ^ var50;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var50)) {
                  case 76430348:
                     var50 ^= 1058801842;
                  case 564070598:
                     continue label87;
                  case 1005865068:
                     break;
                  case 1319950644:
                  default:
                     throw new IllegalStateException();
               }
            }
         } else {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var50)) {
                  case 64182536:
                     var50 = 885557227 ^ var50;
                     return null;
                  case 227568288:
                     return null;
                  case 478778673:
                     break;
                  case 937440104:
                  default:
                     throw new IllegalStateException();
               }
            }
         }
      }
   }

   public k$d hitResize(float var1, float var2) {
      int var76 = 716053273 ^ 2020988271 ^ 1398312895;
      var76 = 298293217 ^ var76;
      k$d[] var3 = k$d.values();
      k$d[] var5 = var3;
      int var14 = var3.length;
      byte var4 = (byte)(272946729 ^ var76);
      int var15 = var14 - var4;
      int var6 = var15;
      var76 = 1652357254 ^ var76;

      while (var6 >= (1916284590 ^ var76)) {
         var76 = 1529006369 ^ var76;
         k$d var19 = var5[var6];
         EnumMap var21 = this.bounds;
         Object var22 = var21.get(var19);
         k$a var23 = (k$a)var22;
         if (var23 != null) {
            var76 = 1862961917 ^ var76;
            byte var26 = (byte)((var23.valid) ? 1 : 0);
            if (var26 == (1175481714 ^ var76)) {
               var76 = 705814201 ^ var76;
               var76 = 498209303 ^ var76;
            } else {
               var76 = xumisnwzbavhhaua(var76, 1465760376);
               float var28 = var23.x;
               float var57 = var23.w;
               float var29 = var28 + var57;
               float var58 = 9.0F;
               float var30 = var29 - var58;
               float var59 = 4.0F;
               float var31 = var30 - var59;
               float var33 = var23.y;
               float var61 = var23.h;
               float var34 = var33 + var61;
               float var62 = 9.0F;
               float var35 = var34 - var62;
               float var63 = 4.0F;
               float var36 = var35 - var63;
               float var38 = var23.x;
               float var65 = var23.w;
               float var39 = var38 + var65;
               float var66 = 4.0F;
               float var40 = var39 + var66;
               float var42 = var23.y;
               float var68 = var23.h;
               float var43 = var42 + var68;
               float var69 = 4.0F;
               float var44 = var43 + var69;
               float var88;
               int var46 = (var88 = var1 - var31) == 0.0F ? 0 : (var88 < 0.0F ? -1 : 1);
               if (var46 >= (290313994 ^ var76)) {
                  var76 = 2048663561 ^ var76;
                  float var89;
                  int var48 = (var89 = var1 - var40) == 0.0F ? 0 : (var89 < 0.0F ? -1 : 1);
                  if (var48 < (1800533763 ^ var76)) {
                     var76 = 1397905219 ^ var76;
                     float var90;
                     int var50 = (var90 = var2 - var36) == 0.0F ? 0 : (var90 < 0.0F ? -1 : 1);
                     if (var50 >= (939761728 ^ var76)) {
                        var76 = 602657132 ^ var76;
                        float var91;
                        int var52 = (var91 = var2 - var44) == 0.0F ? 0 : (var91 < 0.0F ? -1 : 1);
                        if (var52 < (468218156 ^ var76)) {
                           var76 = 742893279 ^ var76;
                           return var19;
                        }

                        var76 = 1784402160 ^ var76;
                     } else {
                        var76 = 1236271516 ^ var76;
                     }
                  } else {
                     var76 = 451040991 ^ var76;
                  }
               } else {
                  label35:
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var76)) {
                        case 25608686:
                           var76 ^= 1627289302;
                           break label35;
                        case 133484610:
                           break;
                        case 948312915:
                        default:
                           throw new IllegalStateException();
                        case 1943403571:
                           break label35;
                     }
                  }
               }
            }
         } else {
            var76 = xumisnwzbavhhaua(var76, 1487488595);
         }

         var6 += -1907597789 ^ var76;
         var76 = 59477874 ^ var76;
      }

      var76 = 1411805569 ^ var76;
      return null;
   }

   public k$b bounds(k$d var1) {
      int var23 = 572560560 ^ 893003305 ^ 1398312895;
      var23 = 670590175 ^ var23;
      EnumMap var9 = this.bounds;
      Object var10 = var9.get(var1);
      k$a var11 = (k$a)var10;
      if (var11 != null) {
         var23 = 536270935 ^ var23;
         byte var14 = (byte)((var11.valid) ? 1 : 0);
         if (var14 != (2085388718 ^ var23)) {
            var23 = xumisnwzbavhhaua(var23, 734746812);
            float var17 = var11.x;
            float var18 = var11.y;
            float var19 = var11.w;
            float var20 = var11.h;
            return new k$b(var17, var18, var19, var20);
         }

         var23 = 1500566694 ^ var23;
      } else {
         var23 = xumisnwzbavhhaua(var23, 1183190257);
      }

      return null;
   }

   public boolean editMode() {
      int var5 = 1938398241 ^ 533073911 ^ 1398312895;
      var5 = 1213469645 ^ var5;
      com.wimpyclient.g.g var1 = com.wimpyclient.g.g.INSTANCE;
      return var1.isOpen();
   }

   public void drawEditHandles(com.wimpyclient.m.b var1) {
      int var70 = 1993952150 ^ 1264833990 ^ 1398312895;
      var70 = 2072460824 ^ var70;
      byte var20 = (byte)((this.editMode()) ? 1 : 0);
      if (var20 != (358952951 ^ var70)) {
         var70 = 1621779523 ^ var70;
         if (var1 != null) {
            var70 = 2041255727 ^ var70;
            com.wimpyclient.o.b var22 = com.wimpyclient.o.b.INSTANCE;
            int var24 = var22.accentBright();
            int var11 = var24;
            int var26 = var22.background();
            float var3 = 0.85F;
            int var27 = com.wimpyclient.p.g.withAlpha(var26, var3);
            int var12 = var27;
            k$d[] var28 = k$d.values();
            k$d[] var13 = var28;
            int var30 = var28.length;
            int var14 = var30;
            byte var31 = (byte)(207903899 ^ var70);
            int var15 = var31;
            var70 = 1042965636 ^ var70;

            while (true) {
               if (var15 < var14) {
                  var70 = 652127248 ^ var70;
                  k$d var34 = var13[var15];
                  EnumMap var36 = this.bounds;
                  Object var37 = var36.get(var34);
                  k$a var38 = (k$a)var37;
                  if (var38 != null) {
                     var70 = 1671489359 ^ var70;
                     byte var41 = (byte)((var38.valid) ? 1 : 0);
                     if (var41 == (1999663936 ^ var70)) {
                        var70 = 50855342 ^ var70;
                        var70 = xumisnwzbavhhaua(var70, 1193174510);
                     } else {
                        label35:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                              case 26694108:
                                 break label35;
                              case 116238460:
                                 var70 ^= 185672186;
                                 break label35;
                              case 378638899:
                              default:
                                 throw new RuntimeException();
                              case 772804151:
                           }
                        }

                        float var43 = var38.x;
                        float var56 = var38.w;
                        float var44 = var43 + var56;
                        float var57 = 9.0F;
                        float var45 = var44 - var57;
                        float var47 = var38.y;
                        float var59 = var38.h;
                        float var48 = var47 + var59;
                        float var60 = 9.0F;
                        float var49 = var48 - var60;
                        float var5 = 9.0F;
                        float var6 = 9.0F;
                        float var7 = 2.0F;
                        var1.rect(var45, var49, var5, var6, var7, var11);
                        float var64 = 9.0F;
                        float var65 = 9.0F;
                        float var66 = 2.0F;
                        float var67 = 1.0F;
                        var1.rectOutline(var45, var49, var64, var65, var66, var67, var12);
                        var70 = 1325971898 ^ var70;
                     }
                  } else {
                     label45:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                           case 27967595:
                              break;
                           case 131598925:
                              var70 ^= 666468111;
                              break label45;
                           case 713836802:
                           default:
                              throw new RuntimeException();
                           case 1960630891:
                              break label45;
                        }
                     }
                  }
               } else {
                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var70)) {
                        case 24624882:
                           var70 = 943990346 ^ var70;
                           return;
                        case 1220774333:
                        default:
                           throw new RuntimeException();
                        case 1450948147:
                           return;
                        case 1870298701:
                     }
                  }
               }

               var15 += 858385153 ^ var70;
               var70 = xumisnwzbavhhaua(var70, 23581471);
            }
         }

         var70 = 188167138 ^ var70;
      } else {
         var70 = xumisnwzbavhhaua(var70, 1805473697);
      }
   }

   public static float[] guiToHud(double var0, double var2) {
      int var85 = 554786613 ^ 1500205473 ^ 136341382;
      var85 = 1023839458 ^ var85;
      Minecraft var4 = Minecraft.getInstance();
      Window var18 = var4.getWindow();
      RenderTarget var20 = var4.getMainRenderTarget();
      float var40;
      if (var20 != null) {
         var85 = 621167577 ^ var85;
         int var23 = var20.width;
         var40 = var23;

         label49:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var85)) {
               case 170903989:
                  var85 ^= 2124998258;
                  break label49;
               case 584316530:
                  break;
               case 751688124:
               default:
                  throw new IllegalStateException();
               case 1588003316:
                  break label49;
            }
         }
      } else {
         label42:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var85)) {
               case 98808029:
                  var85 ^= 1453019474;
                  break label42;
               case 702724026:
                  break;
               case 1024061016:
                  break label42;
               case 2003528355:
               default:
                  throw new IllegalStateException();
            }
         }

         byte var38 = (byte)(466072739 ^ var85);
         int var54 = var18.getWidth();
         int var39 = Math.max(var38, var54);
         var40 = var39;
         var85 = 221639929 ^ var85;
      }

      float var41;
      if (var20 != null) {
         var85 = 269754894 ^ var85;
         int var26 = var20.height;
         var41 = var26;

         label33:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var85)) {
               case 108526281:
                  var85 ^= 855189661;
                  break label33;
               case 526919186:
               default:
                  throw new IllegalStateException();
               case 1042506492:
                  break;
               case 1069677463:
                  break label33;
            }
         }
      } else {
         label26:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var85)) {
               case 209013314:
                  var85 ^= 1497504888;
                  break label26;
               case 563464040:
               default:
                  throw new IllegalStateException();
               case 1027335908:
                  break;
               case 1212798354:
                  break label26;
            }
         }

         byte var36 = (byte)(1336957986 ^ var85);
         int var52 = var18.getHeight();
         int var37 = Math.max(var36, var52);
         var41 = var37;
         var85 = 2075072235 ^ var85;
      }

      float var27 = 1.0F;
      int var42 = var18.getGuiScaledWidth();
      float var43 = var42;
      float var28 = Math.max(var27, var43);
      float var29 = 1.0F;
      int var45 = var18.getGuiScaledHeight();
      float var46 = var45;
      float var30 = Math.max(var29, var46);
      float var31 = 1.0F;
      float var6 = 1080.0F;
      float var48 = var41 / var6;
      float var32 = Math.max(var31, var48);
      float[] var33 = GUI_TO_HUD;
      byte var49 = (byte)(874465992 ^ var85);
      float var69 = var40 / var28;
      double var70 = var69;
      double var57 = var0 * var70;
      double var73 = var32;
      double var59 = var57 / var73;
      float var61 = (float)var59;
      var33[var49] = var61;
      float[] var34 = GUI_TO_HUD;
      byte var50 = (byte)(874465993 ^ var85);
      float var76 = var41 / var30;
      double var77 = var76;
      double var64 = var2 * var77;
      double var80 = var32;
      double var66 = var64 / var80;
      float var68 = (float)var66;
      var34[var50] = var68;
      return GUI_TO_HUD;
   }

   public static float hudScreenW() {
      int var34 = 1212289703 ^ 1790460656 ^ 136341382;
      var34 = 969547662 ^ var34;
      Minecraft var0 = Minecraft.getInstance();
      RenderTarget var9 = var0.getMainRenderTarget();
      float var13;
      if (var9 != null) {
         var34 = 1409558657 ^ var34;
         int var12 = var9.width;
         var13 = var12;

         label41:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
               case 162956986:
                  var34 ^= 1776319315;
               case 492692925:
                  break label41;
               case 511613214:
               default:
                  throw new RuntimeException(new IOException());
               case 817388134:
            }
         }
      } else {
         label34:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
               case 65458058:
                  break label34;
               case 82795816:
                  var34 ^= 468262369;
                  break label34;
               case 491222450:
               default:
                  throw new RuntimeException(new IOException());
               case 1918996334:
            }
         }

         byte var21 = (byte)(150549951 ^ var34);
         Window var29 = var0.getWindow();
         int var30 = var29.getWidth();
         int var22 = Math.max(var21, var30);
         var13 = var22;
         var34 = 638406195 ^ var34;
      }

      float var23;
      if (var9 != null) {
         var34 = 1612575912 ^ var34;
         int var16 = var9.height;
         var23 = var16;
         var34 = xumisnwzbavhhaua(var34, 316019383);
      } else {
         label26:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var34)) {
               case 178407150:
               default:
                  throw new RuntimeException(new IOException());
               case 184123797:
                  var34 ^= 84984524;
               case 551144501:
                  break label26;
               case 618706226:
            }
         }

         byte var19 = (byte)(736409920 ^ var34);
         Window var26 = var0.getWindow();
         int var27 = var26.getHeight();
         int var20 = Math.max(var19, var27);
         var23 = var20;
         var34 = 2010850515 ^ var34;
      }

      float var1 = 1.0F;
      float var3 = 1080.0F;
      float var31 = var23 / var3;
      float var24 = Math.max(var1, var31);
      return var13 / var24;
   }

   public static float hudScreenH() {
      int var24 = 1939244899 ^ 1394363904 ^ 136341382;
      var24 = 59236632 ^ var24;
      Minecraft var0 = Minecraft.getInstance();
      RenderTarget var8 = var0.getMainRenderTarget();
      float var16;
      if (var8 != null) {
         var24 = 292689653 ^ var24;
         int var11 = var8.height;
         var16 = var11;
         var24 = xumisnwzbavhhaua(var24, 824601630);
      } else {
         var24 = 1112862356 ^ var24;
         byte var14 = (byte)(1769578856 ^ var24);
         Window var19 = var0.getWindow();
         int var20 = var19.getHeight();
         int var15 = Math.max(var14, var20);
         var16 = var15;
         var24 = 1644205183 ^ var24;
      }

      float var1 = 1.0F;
      float var3 = 1080.0F;
      float var21 = var16 / var3;
      float var17 = Math.max(var1, var21);
      return var16 / var17;
   }

   public static float[] hudToGui(float var0, float var1) {
      int var67 = 2129282589 ^ 1335805648 ^ 136341382;
      var67 = 1373647023 ^ var67;
      Minecraft var2 = Minecraft.getInstance();
      Window var15 = var2.getWindow();
      RenderTarget var17 = var2.getMainRenderTarget();
      float var37;
      if (var17 != null) {
         var67 = 1379448749 ^ var67;
         int var36 = var17.width;
         var37 = var36;
         var67 = 1721241137 ^ var67;
      } else {
         var67 = xumisnwzbavhhaua(var67, 862204696);
         byte var19 = (byte)(1540416765 ^ var67);
         int var39 = var15.getWidth();
         int var20 = Math.max(var19, var39);
         var37 = var20;
         var67 = 130321028 ^ var67;
      }

      float var38;
      if (var17 != null) {
         var67 = 129107641 ^ var67;
         int var34 = var17.height;
         var38 = var34;
         var67 = 391588692 ^ var67;
      } else {
         label26:
         while (true) {
            switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var67)) {
               case 40356380:
                  var67 ^= 404034473;
               case 1392132805:
                  byte var22 = (byte)(1140948432 ^ var67);
                  int var41 = var15.getHeight();
                  int var23 = Math.max(var22, var41);
                  var38 = var23;
                  var67 = 149962308 ^ var67;
                  break label26;
               case 395191921:
                  break;
               case 1045095453:
               default:
                  throw new RuntimeException();
            }
         }
      }

      float var24 = 1.0F;
      int var43 = var15.getGuiScaledWidth();
      float var44 = var43;
      float var25 = Math.max(var24, var44);
      float var26 = 1.0F;
      int var46 = var15.getGuiScaledHeight();
      float var47 = var46;
      float var27 = Math.max(var26, var47);
      float var28 = 1.0F;
      float var4 = 1080.0F;
      float var49 = var38 / var4;
      float var29 = Math.max(var28, var49);
      float[] var30 = HUD_TO_GUI;
      byte var50 = (byte)(1290879893 ^ var67);
      float var53 = var0 * var29;
      float var54 = var53 * var25;
      float var55 = var54 / var37;
      var30[var50] = var55;
      float[] var31 = HUD_TO_GUI;
      byte var51 = (byte)(1290879892 ^ var67);
      float var57 = var1 * var29;
      float var58 = var57 * var27;
      float var59 = var58 / var38;
      var31[var51] = var59;
      return HUD_TO_GUI;
   }

   public static float guiSizeToHud(float var0) {
      int var39 = 355750971 ^ 493865683 ^ 136341382;
      var39 = 1580378962 ^ var39;
      Minecraft var1 = Minecraft.getInstance();
      Window var11 = var1.getWindow();
      RenderTarget var13 = var1.getMainRenderTarget();
      float var26;
      if (var13 != null) {
         var39 = 485353739 ^ var39;
         int var16 = var13.height;
         var26 = var16;
         var39 = 1815194898 ^ var39;
      } else {
         var39 = xumisnwzbavhhaua(var39, 1966684276);
         byte var24 = (byte)(728787529 ^ var39);
         int var35 = var11.getHeight();
         int var25 = Math.max(var24, var35);
         var26 = var25;
         var39 = 98925677 ^ var39;
      }

      float var17 = 1.0F;
      int var27 = var11.getGuiScaledHeight();
      float var28 = var27;
      float var18 = Math.max(var17, var28);
      float var19 = 1.0F;
      float var3 = 1080.0F;
      float var30 = var26 / var3;
      float var20 = Math.max(var19, var30);
      float var32 = var26 / var18;
      float var22 = var0 * var32;
      return var22 / var20;
   }

   public JsonObject toJson() {
      int var89 = 834946055 ^ 2119820075 ^ 1398312895;
      var89 = 1069280458 ^ var89;
      JsonObject var1 = new JsonObject();
      JsonObject var3 = var1;
      EnumMap var12 = this.positions;
      Set var13 = var12.entrySet();
      Iterator var14 = var13.iterator();
      Iterator var4 = var14;
      var89 = 2054663608 ^ var89;

      while (true) {
         byte var16 = (byte)((var4.hasNext()) ? 1 : 0);
         if (var16 == (1493789153 ^ var89)) {
            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var89)) {
                  case 209871914:
                     var89 = 1209666465 ^ var89;
                     return var3;
                  case 1161730102:
                     break;
                  case 1288418554:
                  default:
                     throw new IllegalStateException();
                  case 2048753253:
                     return var3;
               }
            }
         }

         Entry var20;
         k$c var23;
         byte var58;
         label110: {
            var89 = 1210228576 ^ var89;
            Object var19 = var4.next();
            var20 = (Entry)var19;
            Object var22 = var20.getValue();
            var23 = (k$c)var22;
            float var25 = var23.nx;
            byte var26 = (byte)((Float.isFinite(var25)) ? 1 : 0);
            if (var26 != (288093825 ^ var89)) {
               var89 = 481840776 ^ var89;
               float var28 = var23.ny;
               byte var29 = (byte)((Float.isFinite(var28)) ? 1 : 0);
               if (var29 != (227784713 ^ var89)) {
                  var89 = 1677795065 ^ var89;
                  var58 = (byte)(1771218673 ^ var89);

                  while (true) {
                     switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var89)) {
                        case 210520803:
                           var89 ^= 974242046;
                           break label110;
                        case 1299359722:
                        default:
                           throw new IllegalStateException();
                        case 1642319507:
                           break;
                        case 1983180933:
                           break label110;
                     }
                  }
               }

               var89 = xumisnwzbavhhaua(var89, 1654262782);
            } else {
               label108:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var89)) {
                     case 21314738:
                        var89 ^= 2116175222;
                        break label108;
                     case 139913780:
                        break;
                     case 729437585:
                     default:
                        throw new IllegalStateException();
                     case 1116673148:
                        break label108;
                  }
               }
            }

            var58 = (byte)(1862906871 ^ var89);
            var89 = 1015731705 ^ var89;
         }

         byte var59;
         label90: {
            float var31 = var23.x;
            byte var32 = (byte)((Float.isFinite(var31)) ? 1 : 0);
            if (var32 != (1401120270 ^ var89)) {
               var89 = 701252125 ^ var89;
               float var34 = var23.y;
               byte var35 = (byte)((Float.isFinite(var34)) ? 1 : 0);
               if (var35 != (2052006931 ^ var89)) {
                  var89 = 685348310 ^ var89;
                  var59 = (byte)(1385607620 ^ var89);
                  var89 = 269840724 ^ var89;
                  break label90;
               }

               label87:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var89)) {
                     case 42718093:
                        break label87;
                     case 217657259:
                        var89 ^= 1679350130;
                        break label87;
                     case 982002382:
                        break;
                     case 1322587518:
                     default:
                        throw new IllegalStateException();
                  }
               }
            } else {
               var89 = xumisnwzbavhhaua(var89, 1305779055);
            }

            var59 = (byte)(509082977 ^ var89);
            var89 = 1557413360 ^ var89;
         }

         byte var57;
         label77: {
            float var37 = var23.scale;
            byte var38 = (byte)((Float.isFinite(var37)) ? 1 : 0);
            if (var38 != (1115930769 ^ var89)) {
               var89 = 174336622 ^ var89;
               float var40 = var23.scale;
               float var60 = 1.0F;
               float var41 = var40 - var60;
               float var42 = Math.abs(var41);
               float var61 = 0.001F;
               float var112;
               int var43 = (var112 = var42 - var61) == 0.0F ? 0 : (var112 < 0.0F ? -1 : 1);
               if (var43 >= (1223158527 ^ var89)) {
                  var89 = 755671382 ^ var89;
                  var57 = (byte)(1710050216 ^ var89);
                  var89 = 838561431 ^ var89;
                  break label77;
               }

               var89 = 977375071 ^ var89;
            } else {
               var89 = xumisnwzbavhhaua(var89, 807773489);
            }

            var57 = (byte)(1923507616 ^ var89);
            var89 = 649085086 ^ var89;
         }

         if (var58 == (1410737470 ^ var89)) {
            var89 = 1526892514 ^ var89;
            if (var59 == (253010652 ^ var89)) {
               var89 = 1489755555 ^ var89;
               if (var57 == (1474264959 ^ var89)) {
                  var89 = 2040548713 ^ var89;
                  var89 = xumisnwzbavhhaua(var89, 2004245495);
                  continue;
               }

               var89 = 1982708844 ^ var89;
            } else {
               label68:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var89)) {
                     case 221770910:
                        var89 ^= 786850255;
                        break label68;
                     case 1335788575:
                        break;
                     case 1347375053:
                        break label68;
                     case 1804222951:
                     default:
                        throw new IllegalStateException();
                  }
               }
            }
         } else {
            var89 = xumisnwzbavhhaua(var89, 1977935405);
         }

         JsonObject var47 = new JsonObject();
         if (var58 != (569557779 ^ var89)) {
            var89 = 1312468235 ^ var89;
            String var62 = oqisdcdfho(kfnfzfsewqwagxj(), zzjcytzefzufonh(), var89);
            float var72 = var23.nx;
            Float var73 = var72;
            var47.addProperty(var62, var73);
            String var63 = oqisdcdfho(bxybbyfldbgrolb(), zzjcytzefzufonh(), var89);
            float var75 = var23.ny;
            Float var76 = var75;
            var47.addProperty(var63, var76);
            var89 = 803296940 ^ var89;
         } else {
            var89 = 1641806759 ^ var89;
         }

         if (var59 != (1076443316 ^ var89)) {
            var89 = 1477658454 ^ var89;
            String var64 = oqisdcdfho(alpeibrdafywnrk(), zzjcytzefzufonh(), var89);
            float var78 = var23.x;
            Float var79 = var78;
            var47.addProperty(var64, var79);
            String var65 = oqisdcdfho(euugafcpvydbubm(), zzjcytzefzufonh(), var89);
            float var81 = var23.y;
            Float var82 = var81;
            var47.addProperty(var65, var82);
            var89 = 1421471776 ^ var89;
         } else {
            var89 = xumisnwzbavhhaua(var89, 212514678);
         }

         if (var57 != (1283690434 ^ var89)) {
            var89 = 1857710015 ^ var89;
            String var66 = oqisdcdfho(uhhiplsdcwuqeaf(), zzjcytzefzufonh(), var89);
            float var84 = var23.scale;
            Float var85 = var84;
            var47.addProperty(var66, var85);
            var89 = 738287741 ^ var89;
         } else {
            var89 = 1119553474 ^ var89;
         }

         Object var68 = var20.getKey();
         k$d var69 = (k$d)var68;
         String var70 = var69.name();
         String var71 = var70.toLowerCase();
         var3.add(var71, var47);
         var89 = xumisnwzbavhhaua(var89, 1462886881);
      }
   }

   public void fromJson(JsonObject var1) {
      int var139 = 1086283 ^ 1378787276 ^ 1398312895;
      var139 = 934120921 ^ var139;
      if (var1 == null) {
         var139 = 40770864 ^ var139;
      } else {
         var139 = xumisnwzbavhhaua(var139, 1767544923);
         k$d[] var19 = k$d.values();
         k$d[] var6 = var19;
         int var21 = var19.length;
         int var7 = var21;
         byte var22 = (byte)(1603376826 ^ var139);
         int var8 = var22;
         var139 = 1277770891 ^ var139;

         label174:
         while (var8 < var7) {
            var139 = 1795134855 ^ var139;
            k$d var25 = var6[var8];
            String var27 = var25.name();
            String var28 = var27.toLowerCase();
            byte var30 = (byte)((var1.has(var28)) ? 1 : 0);
            if (var30 != (2034712502 ^ var139)) {
               var139 = 1139102640 ^ var139;
               JsonElement var32 = var1.get(var28);
               byte var33 = (byte)((var32.isJsonObject()) ? 1 : 0);
               if (var33 == (983723014 ^ var139)) {
                  var139 = 571574463 ^ var139;
                  var139 = xumisnwzbavhhaua(var139, 1774747960);
               } else {
                  var139 = 1502107238 ^ var139;
                  JsonObject var35 = var1.getAsJsonObject(var28);
                  EnumMap var37 = this.positions;
                  Object var38 = var37.get(var25);
                  k$c var39 = (k$c)var38;
                  String var108 = oqisdcdfho(ujaopwtpkahfsxt(), zzjcytzefzufonh(), var139);
                  JsonElement var41 = var35.get(var108);
                  String var109 = oqisdcdfho(obxislkiksytyrd(), zzjcytzefzufonh(), var139);
                  JsonElement var43 = var35.get(var109);
                  if (var41 != null) {
                     var139 = 134696488 ^ var139;
                     if (var43 == null) {
                        var139 = 470226963 ^ var139;
                     } else {
                        var139 = 709402910 ^ var139;
                        byte var47 = (byte)((var41.isJsonPrimitive()) ? 1 : 0);
                        if (var47 == (1097192790 ^ var139)) {
                           var139 = 911194381 ^ var139;
                        } else {
                           var139 = 1444409542 ^ var139;
                           byte var49 = (byte)((var43.isJsonPrimitive()) ? 1 : 0);
                           if (var49 == (393356688 ^ var139)) {
                              var139 = xumisnwzbavhhaua(var139, 1616398795);
                           } else {
                              var139 = 192209066 ^ var139;
                              float var51 = var41.getAsFloat();
                              float var53 = var43.getAsFloat();
                              byte var55 = (byte)((Float.isFinite(var51)) ? 1 : 0);
                              if (var55 == (470205754 ^ var139)) {
                                 var139 = 1798089057 ^ var139;
                              } else {
                                 var139 = 1788034056 ^ var139;
                                 byte var57 = (byte)((Float.isFinite(var53)) ? 1 : 0);
                                 if (var57 == (1989540146 ^ var139)) {
                                    var139 = xumisnwzbavhhaua(var139, 29332841);
                                 } else {
                                    var139 = 446536728 ^ var139;
                                    var39.nx = var51;
                                    var39.ny = var53;
                                    float var60 = hudScreenW();
                                    float var61 = hudScreenH();
                                    float var112 = 1.0F;
                                    float var167;
                                    int var63 = (var167 = var60 - var112) == 0.0F ? 0 : (var167 < 0.0F ? -1 : 1);
                                    if (var63 > (1812489514 ^ var139)) {
                                       var139 = 872284309 ^ var139;
                                       float var114 = var51 * var60;
                                       var39.x = var114;
                                       var139 = 560717148 ^ var139;
                                    } else {
                                       var139 = 311811529 ^ var139;
                                    }

                                    float var115 = 1.0F;
                                    float var168;
                                    int var66 = (var168 = var61 - var115) == 0.0F ? 0 : (var168 < 0.0F ? -1 : 1);
                                    if (var66 > (2124265699 ^ var139)) {
                                       var139 = 1446317395 ^ var139;
                                       float var117 = var53 * var61;
                                       var39.y = var117;
                                       var139 = 1602410987 ^ var139;
                                    } else {
                                       label156:
                                       while (true) {
                                          switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                                             case 89254058:
                                                var139 ^= 163042488;
                                             case 1028499810:
                                                break label156;
                                             case 1551269259:
                                             default:
                                                throw new RuntimeException(new IOException());
                                             case 1620796141:
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  } else {
                     label166:
                     while (true) {
                        switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                           case 2208304:
                              var139 ^= 335566395;
                           case 595396884:
                              break label166;
                           case 628174979:
                              break;
                           case 691577663:
                           default:
                              throw new RuntimeException(new IOException());
                        }
                     }
                  }

                  String var118 = oqisdcdfho(abojpiyzdfqmiuo(), zzjcytzefzufonh(), var139);
                  JsonElement var69 = var35.get(var118);
                  String var119 = oqisdcdfho(qootofpytathcvx(), zzjcytzefzufonh(), var139);
                  JsonElement var71 = var35.get(var119);
                  if (var69 == null) {
                     var139 = 806030934 ^ var139;
                  } else {
                     var139 = 685684190 ^ var139;
                     if (var71 == null) {
                        var139 = 416660360 ^ var139;
                     } else {
                        var139 = 974549519 ^ var139;
                        byte var75 = (byte)((var69.isJsonPrimitive()) ? 1 : 0);
                        if (var75 == (1709353866 ^ var139)) {
                           var139 = xumisnwzbavhhaua(var139, 583256455);
                        } else {
                           var139 = 1575866371 ^ var139;
                           byte var77 = (byte)((var71.isJsonPrimitive()) ? 1 : 0);
                           if (var77 != (940538761 ^ var139)) {
                              var139 ^= 209542575;
                              float var79 = var69.getAsFloat();
                              float var81 = var71.getAsFloat();
                              byte var83 = (byte)((Float.isFinite(var79)) ? 1 : 0);
                              if (var83 != (879896102 ^ var139)) {
                                 var139 = 1278987106 ^ var139;
                                 byte var85 = (byte)((Float.isFinite(var81)) ? 1 : 0);
                                 label108:
                                 if (var85 != (2018110788 ^ var139)) {
                                    var139 = 740771275 ^ var139;
                                    var39.x = var79;
                                    var39.y = var81;
                                    float var89 = var39.nx;
                                    byte var90 = (byte)((Float.isFinite(var89)) ? 1 : 0);
                                    if (var90 != (1416538255 ^ var139)) {
                                       var139 = 2007189439 ^ var139;
                                       float var92 = var39.ny;
                                       byte var93 = (byte)((Float.isFinite(var92)) ? 1 : 0);
                                       if (var93 != (600698672 ^ var139)) {
                                          var139 = xumisnwzbavhhaua(var139, 1693224253);
                                          break label108;
                                       }

                                       var139 = 1875578917 ^ var139;
                                    } else {
                                       var139 = 409491354 ^ var139;
                                    }

                                    float var122 = hudScreenW();
                                    float var129 = hudScreenH();
                                    storeNormalized(var39, var122, var129);
                                    var139 = 187145496 ^ var139;
                                 } else {
                                    var139 = xumisnwzbavhhaua(var139, 1063817033);
                                 }
                              } else {
                                 label119:
                                 while (true) {
                                    switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                                       case 94182811:
                                          var139 ^= 1934836779;
                                       case 372704321:
                                          break label119;
                                       case 901926795:
                                          break;
                                       case 1737554258:
                                       default:
                                          throw new RuntimeException(new IOException());
                                    }
                                 }
                              }
                           } else {
                              label133:
                              while (true) {
                                 switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                                    case 28740815:
                                       break;
                                    case 211666774:
                                       var139 ^= 2133727620;
                                    case 771811286:
                                       break label133;
                                    case 2114431777:
                                    default:
                                       throw new RuntimeException(new IOException());
                                 }
                              }
                           }
                        }
                     }
                  }

                  String var123 = oqisdcdfho(lryvegjtvrddumk(), zzjcytzefzufonh(), var139);
                  JsonElement var96 = var35.get(var123);
                  if (var96 != null) {
                     var139 = 1918976022 ^ var139;
                     byte var99 = (byte)((var96.isJsonPrimitive()) ? 1 : 0);
                     if (var99 != (893395483 ^ var139)) {
                        var139 = 582807395 ^ var139;
                        float var101 = var96.getAsFloat();
                        byte var125 = (byte)((Float.isFinite(var101)) ? 1 : 0);
                        float var127;
                        if (var125 != (402443640 ^ var139)) {
                           var139 = 1027552658 ^ var139;
                           float var130 = 0.5F;
                           float var5 = 2.5F;
                           var127 = Mth.clamp(var101, var130, var5);
                           var139 = 865185862 ^ var139;
                        } else {
                           label91:
                           while (true) {
                              switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                                 case 242866660:
                                    var139 ^= 790275179;
                                 case 1323209752:
                                    break label91;
                                 case 1683666406:
                                    break;
                                 case 2021356591:
                                 default:
                                    throw new RuntimeException(new IOException());
                              }
                           }

                           var127 = 1.0F;
                           var139 = 565453247 ^ var139;
                        }

                        var39.scale = var127;
                        var139 = 1747529005 ^ var139;
                     } else {
                        label100:
                        while (true) {
                           switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                              case 120354644:
                                 var139 ^= 1144735642;
                                 break label100;
                              case 502059710:
                                 break;
                              case 1555625437:
                              default:
                                 throw new RuntimeException(new IOException());
                              case 1969622396:
                                 break label100;
                           }
                        }
                     }
                  } else {
                     var139 = 911869836 ^ var139;
                  }
               }
            } else {
               var139 = 138172983 ^ var139;
            }

            var8 += 1903912320 ^ var139;

            while (true) {
               switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var139)) {
                  case 199189970:
                     var139 ^= 1656999856;
                  case 1013208676:
                     continue label174;
                  case 1305888940:
                     break;
                  case 2066366034:
                  default:
                     throw new RuntimeException(new IOException());
               }
            }
         }

         var139 = xumisnwzbavhhaua(var139, 209560920);
      }
   }

   static {
      int var10 = 196953489 ^ 567219473 ^ Integer.parseInt("657322615");
      int var7 = new Random(-1960368153709836595L).nextInt();
      f1N12WSnPWi = 1251536212 ^ var7;
      var10 = 842443469 ^ var10;
      k var0 = new k();
      INSTANCE = var0;
      byte var1 = (byte)(1063847992 ^ var10);
      float[] var2 = new float[var1];
      GUI_TO_HUD = var2;
      byte var3 = (byte)(1063847992 ^ var10);
      float[] var4 = new float[var3];
      HUD_TO_GUI = var4;
   }

   public static String oqisdcdfho(byte[] var0, byte[] var1, int var2) {
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

   private static byte[] zzjcytzefzufonh() {
      return new byte[]{55, 26, 63, 30, 96, 126, 30, 89, 21, 33, 122, 66, 45, 103, 24, 19, 116, 59, 40, 37, 123, 114, 88, 41};
   }

   private static byte[] kfnfzfsewqwagxj() {
      return new byte[]{-8, -35, 8, 69, 84, 54};
   }

   private static byte[] bxybbyfldbgrolb() {
      return new byte[]{-8, -35, 8, 69, 84, 55};
   }

   private static byte[] uhhiplsdcwuqeaf() {
      return new byte[]{-4, -46, 11, 95, 82, 45, 42, 9, 38, 120, 77, 19};
   }

   private static byte[] alpeibrdafywnrk() {
      return new byte[]{-3, -43, 9, 82};
   }

   private static byte[] euugafcpvydbubm() {
      return new byte[]{-3, -43, 9, 83};
   }

   private static byte[] lryvegjtvrddumk() {
      return new byte[]{-8, -44, 6, 94, 83, 42, 46, 9, 39, 120, 75, 22};
   }

   private static byte[] abojpiyzdfqmiuo() {
      return new byte[]{-8, -36, 6, 95};
   }

   private static byte[] qootofpytathcvx() {
      return new byte[]{-8, -36, 6, 94};
   }

   private static byte[] ujaopwtpkahfsxt() {
      return new byte[]{-8, -45, 9, 67, 87, 55};
   }

   private static byte[] obxislkiksytyrd() {
      return new byte[]{-8, -45, 9, 67, 87, 54};
   }

   private static int xumisnwzbavhhaua(int var0, int var1) {
      return var1 ^ var0;
   }
}
