package com.wimpyclient.k;

import com.mojang.blaze3d.pipeline.RenderTarget;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix3x2fStack;
import org.joml.Vector3fc;

@Environment(EnvType.CLIENT)
public final class o {
   private static final int PING_GOOD = -12723049;
   private static final int PING_OK = -670398;
   private static final int PING_BAD = -41878;
   private static final int HEALTH_HIGH = -12723049;
   private static final int HEALTH_MID = -670398;
   private static final int HEALTH_LOW = -41878;
   private static final int MAX_BLOCK_TAGS = 64;
   private static final float TAG_SCALE = 1.0F;
   private static final float FONT_MAIN = 13.0F;
   private static final float FONT_SUB = 10.5F;
   private static final float PAD_X = 8.0F;
   private static final float PAD_Y = 5.0F;
   private static final float GAP = 5.0F;
   private static final float BAR_H = 3.5F;
   private static final float ICON = 11.0F;
   private static final float ICON_GAP = 1.6F;
   private static final EquipmentSlot[] GEAR = new EquipmentSlot[]{
      EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET, EquipmentSlot.MAINHAND
   };
   private static final List<o$b> PLAYERS = new ArrayList<>();
   private static final List<o$a> LABELS = new ArrayList<>();
   private static final float[] PROJECT_SCREEN = new float[2];
   private static final int MAX_ITEM_TAGS = 48;
   private static boolean prepared;

   private o() {
   }

   public static void render(GuiGraphics var0) {
      prepared = false;
      Minecraft var1 = Minecraft.getInstance();
      prepare(var1);
      if (var1.player != null && var1.screen == null) {
         drawEquipment(var0, var1);
         drawDroppedItemIcons(var0, var1);
      }
   }

   public static void renderNvg(com.wimpyclient.m.b var0) {
      Minecraft var1 = Minecraft.getInstance();
      prepare(var1);
      if (PLAYERS.isEmpty() && LABELS.isEmpty()) {
         prepared = false;
      } else {
         com.wimpyclient.o.b var2 = com.wimpyclient.o.b.INSTANCE;
         PLAYERS.sort(Comparator.comparingDouble(o$b::dist));
         LABELS.sort(Comparator.comparingDouble(o$a::dist));

         for (int var3 = LABELS.size() - 1; var3 >= 0; var3--) {
            drawPill(var0, var2, LABELS.get(var3));
         }

         for (int var4 = PLAYERS.size() - 1; var4 >= 0; var4--) {
            drawPlayerPill(var0, var2, PLAYERS.get(var4));
         }

         prepared = false;
      }
   }

   private static void prepare(Minecraft var0) {
      if (!prepared) {
         PLAYERS.clear();
         LABELS.clear();
         com.wimpyclient.i.x var1 = com.wimpyclient.i.x.INSTANCE;
         if (var1.nametags.qo() && var0.player != null && var0.level != null && var0.gameRenderer != null) {
            boolean var2 = var1.nametagPlayers;
            boolean var3 = var1.nametagItems;
            boolean var4 = var1.nametagBlocks;
            if (!var2 && !var3 && !var4) {
               prepared = true;
            } else {
               double var5 = var1.nametagMaxDistance;
               double var7 = var5 * var5;
               float var9 = var0.getDeltaTracker().getGameTimeDeltaPartialTick(false);
               Camera var10 = var0.gameRenderer.getMainCamera();
               Vec3 var11 = var10.position();
               Vector3fc var12 = var10.forwardVector();
               int var13 = Math.max(1, var0.getWindow().getWidth());
               int var14 = Math.max(1, var0.getWindow().getHeight());
               RenderTarget var15 = var0.getMainRenderTarget();
               if (var15 != null) {
                  var13 = Math.max(1, var15.width);
                  var14 = Math.max(1, var15.height);
               }

               if (var2) {
                  LocalPlayer var16 = var0.player;
                  boolean var17 = var1.nametagSelf && l.isLocalBodyVisible(var0);

                  for (AbstractClientPlayer var19 : var0.level.players()) {
                     if (!(var19 instanceof com.wimpyclient.i.p) && (var19 != var16 && !(var19 instanceof LocalPlayer) || var17 && var19 == var16)) {
                        Vec3 var20 = var19.getPosition(var9);
                        double var21 = var20.x - var11.x;
                        double var23 = var20.y - var11.y;
                        double var25 = var20.z - var11.z;
                        double var27 = var21 * var21 + var23 * var23 + var25 * var25;
                        if (!(var27 > var7)) {
                           float[] var29 = project(var0, var11, var12, var13, var14, var20.x, var20.y + var19.getBbHeight() + 0.45, var20.z);
                           if (var29 != null) {
                              String var30 = com.wimpyclient.i.n.appliesTo(var19.getUUID()) ? com.wimpyclient.i.n.getName() : var19.getGameProfile().name();
                              ArrayList var31 = new ArrayList(GEAR.length);

                              for (EquipmentSlot var35 : GEAR) {
                                 ItemStack var36 = var19.getItemBySlot(var35);
                                 if (!var36.isEmpty()) {
                                    var31.add(var36);
                                 }
                              }

                              PLAYERS.add(
                                 new o$b(
                                    Math.sqrt(var27),
                                    var29[0],
                                    var29[1],
                                    var19,
                                    var30,
                                    resolvePing(var0, var19),
                                    var19.getHealth(),
                                    Math.max(1.0F, var19.getMaxHealth()),
                                    var31
                                 )
                              );
                           }
                        }
                     }
                  }
               }

               if (var3) {
                  int var37 = 0;

                  for (Entity var39 : var0.level.entitiesForRendering()) {
                     if (var37 >= 48) {
                        break;
                     }

                     if (var39 instanceof ItemEntity var40) {
                        Vec3 var41 = var40.getPosition(var9);
                        double var42 = var41.x - var11.x;
                        double var43 = var41.y - var11.y;
                        double var44 = var41.z - var11.z;
                        double var45 = var42 * var42 + var43 * var43 + var44 * var44;
                        if (!(var45 > var7)) {
                           ItemStack var46 = var40.getItem();
                           if (!var46.isEmpty()) {
                              float[] var47 = project(var0, var11, var12, var13, var14, var41.x, var41.y + var40.getBbHeight() + 0.35, var41.z);
                              if (var47 != null) {
                                 String var48 = var46.getCount() > 1 ? "\u00d7" + var46.getCount() : null;
                                 LABELS.add(
                                    new o$a(
                                       Math.sqrt(var45),
                                       var47[0],
                                       var47[1],
                                       var46.getHoverName().getString(),
                                       var48,
                                       com.wimpyclient.o.b.INSTANCE.accent(),
                                       var46
                                    )
                                 );
                                 var37++;
                              }
                           }
                        }
                     }
                  }
               }

               if (var4) {
                  collectBlockTags(var0, var11, var12, var13, var14, var7);
               }

               prepared = true;
            }
         } else {
            prepared = true;
         }
      }
   }

   private static void collectBlockTags(Minecraft var0, Vec3 var1, Vector3fc var2, int var3, int var4, double var5) {
      ClientLevel var7 = var0.level;
      if (var7 != null) {
         int var8 = 0;

         for (com.wimpyclient.e.b var10 : com.wimpyclient.e.a.INSTANCE.storageRenderSnapshot()) {
            if (var8 >= 64) {
               return;
            }

            BlockPos var11 = var10.pos();
            double var12 = var11.getX() + 0.5;
            double var14 = var11.getY() + 1.05;
            double var16 = var11.getZ() + 0.5;
            double var18 = var12 - var1.x;
            double var20 = var14 - var1.y;
            double var22 = var16 - var1.z;
            double var24 = var18 * var18 + var20 * var20 + var22 * var22;
            if (!(var24 > var5)) {
               BlockState var26 = var7.getBlockState(var11);
               float[] var27 = project(var0, var1, var2, var3, var4, var12, var14, var16);
               if (var27 != null) {
                  LABELS.add(
                     new o$a(
                        Math.sqrt(var24),
                        var27[0],
                        var27[1],
                        var26.getBlock().getName().getString(),
                        null,
                        com.wimpyclient.o.b.INSTANCE.accent(),
                        ItemStack.EMPTY
                     )
                  );
                  var8++;
               }
            }
         }

         for (com.wimpyclient.e.h var30 : com.wimpyclient.e.a.INSTANCE.spawnerRenderSnapshot()) {
            if (var8 >= 64) {
               return;
            }

            BlockPos var31 = var30.pos();
            double var32 = var31.getX() + 0.5;
            double var33 = var31.getY() + 1.35;
            double var34 = var31.getZ() + 0.5;
            double var35 = var32 - var1.x;
            double var36 = var33 - var1.y;
            double var37 = var34 - var1.z;
            double var38 = var35 * var35 + var36 * var36 + var37 * var37;
            if (!(var38 > var5)) {
               BlockState var39 = var7.getBlockState(var31);
               String var40 = var30.typeLabel() != null && !var30.typeLabel().isBlank() ? var30.typeLabel() : var39.getBlock().getName().getString();
               float[] var28 = project(var0, var1, var2, var3, var4, var32, var33, var34);
               if (var28 != null) {
                  LABELS.add(new o$a(Math.sqrt(var38), var28[0], var28[1], var40, null, com.wimpyclient.o.b.INSTANCE.warn(), ItemStack.EMPTY));
                  var8++;
               }
            }
         }
      }
   }

   private static float[] project(Minecraft var0, Vec3 var1, Vector3fc var2, int var3, int var4, double var5, double var7, double var9) {
      double var11 = var5 - var1.x;
      double var13 = var7 - var1.y;
      double var15 = var9 - var1.z;
      if (var11 * var2.x() + var13 * var2.y() + var15 * var2.z() <= 0.05) {
         return null;
      } else {
         Vec3 var17 = var0.gameRenderer.projectPointToScreen(new Vec3(var5, var7, var9));
         if (!(var17.z > 1.0) && !(var17.z < -1.0)) {
            float var18 = (float)((var17.x + 1.0) * 0.5 * var3);
            float var19 = (float)((1.0 - var17.y) * 0.5 * var4);
            if (!(var18 < -80.0F) && !(var19 < -80.0F) && !(var18 > var3 + 80) && !(var19 > var4 + 80)) {
               PROJECT_SCREEN[0] = var18;
               PROJECT_SCREEN[1] = var19;
               return PROJECT_SCREEN;
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   private static void drawPlayerPill(com.wimpyclient.m.b var0, com.wimpyclient.o.b var1, o$b var2) {
      String var3 = var2.ping() >= 0 ? var2.ping() + "ms" : "--";
      String var4 = formatHealth(var2.health());
      drawPill(
         var0,
         var1,
         var2.fbX(),
         var2.fbY(),
         var2.name(),
         var3,
         pingColor(var2.ping()),
         var4,
         healthColor(var2.health(), var2.maxHealth()),
         var2.health() / var2.maxHealth(),
         var1.accent()
      );
   }

   private static void drawPill(com.wimpyclient.m.b var0, com.wimpyclient.o.b var1, o$a var2) {
      drawPill(var0, var1, var2.fbX(), var2.fbY(), var2.name(), var2.suffix(), var1.textMuted(), null, 0, -1.0F, var2.accent());
   }

   private static void drawPill(
      com.wimpyclient.m.b var0,
      com.wimpyclient.o.b var1,
      float var2,
      float var3,
      String var4,
      String var5,
      int var6,
      String var7,
      int var8,
      float var9,
      int var10
   ) {
      float var11 = q.uiScale();
      float var12 = 1.0F;
      float var13 = 13.0F * var12;
      float var14 = 10.5F * var12;
      float var15 = 8.0F * var12;
      float var16 = 5.0F * var12;
      float var17 = 5.0F * var12;
      boolean var18 = var9 >= 0.0F;
      float var19 = 3.5F * var12;
      float var20 = var0.textWidth(var13, var4 == null ? "" : var4);
      float var21 = var5 != null ? var17 + var0.textWidth(var14, var5) : 0.0F;
      float var22 = var7 != null ? var17 + var0.textWidth(var14, var7) : 0.0F;
      float var23 = var20 + var21 + var22 + var15 * 2.0F;
      float var24 = var13 + var16 * 2.0F;
      float var25 = var24 + (var18 ? var19 + var16 : 0.0F);
      float var26 = var2 / var11 - var23 / 2.0F;
      float var27 = var3 / var11 - var25;
      int var28 = h.master() ? h.chromeBright() : com.wimpyclient.p.g.lighten(var10, 0.35F);
      int var29 = h.master() ? h.chrome() : var10;
      e.glassCapsule(var0, var26, var27, var23, var25, false);
      float var30 = var27 + var16 + var13 / 2.0F;
      float var31 = var26 + var15;
      var31 += var0.textGradient(var31, var30, var13, var28, var29, var4 == null ? "" : var4);
      if (var5 != null) {
         var31 += var17;
         var0.text(var31, var30, var14, var6, var5);
         var31 += var0.textWidth(var14, var5);
      }

      if (var7 != null) {
         var31 += var17;
         var0.text(var31, var30, var14, var8, var7);
      }

      if (var18) {
         float var32 = var27 + var24;
         float var33 = var26 + var15;
         float var34 = var23 - var15 * 2.0F;
         float var35 = Math.max(var19, var34 * Math.clamp(var9, 0.0F, 1.0F));
         int var36 = com.wimpyclient.p.g.withAlpha(-16051680, 0.72F);
         int var37 = healthColor(var9, 1.0F);
         if (h.master()) {
            var37 = com.wimpyclient.p.g.lerp(h.chrome(), var37, 0.55F);
         }

         var0.rect(var33, var32, var34, var19, var19 / 2.0F, var36);
         var0.rect(var33, var32, var35, var19, var19 / 2.0F, var37);
         if (h.master()) {
            var0.strokeRect(var33, var32, var34, var19, var19 / 2.0F, 0.8F, com.wimpyclient.p.g.withAlpha(h.chrome(), 0.5F));
         }
      }
   }

   private static void drawDroppedItemIcons(GuiGraphics var0, Minecraft var1) {
      Font var2 = var1.font;
      float var3 = q.uiScale();
      double var4 = Math.max(1.0, (double)var1.getWindow().getGuiScale());
      float var6 = labelPillHeight();
      float var7 = 11.0F;

      for (o$a var9 : LABELS) {
         if (!var9.icon().isEmpty()) {
            float var10 = var9.fbX() / (float)var4;
            float var11 = (var9.fbY() - var6 * var3) / (float)var4 - 3.0F;
            float var12 = var10 - var7 / 2.0F;
            float var13 = var11 - var7;
            Matrix3x2fStack var14 = var0.pose();
            var14.pushMatrix();
            var14.translate(var12, var13);
            var14.scale(var7 / 16.0F, var7 / 16.0F);
            var0.renderItem(var9.icon(), 0, 0);
            var0.renderItemDecorations(var2, var9.icon(), 0, 0);
            var14.popMatrix();
         }
      }
   }

   private static float labelPillHeight() {
      float var0 = 1.0F;
      return 13.0F * var0 + 5.0F * var0 * 2.0F;
   }

   private static float playerPillHeight() {
      float var0 = 1.0F;
      return 13.0F * var0 + 5.0F * var0 * 2.0F + 3.5F * var0 + 5.0F * var0;
   }

   private static void drawEquipment(GuiGraphics var0, Minecraft var1) {
      Font var2 = var1.font;
      float var3 = q.uiScale();
      double var4 = Math.max(1.0, (double)var1.getWindow().getGuiScale());
      float var6 = playerPillHeight();
      float var7 = 11.0F;
      float var8 = var7 + 1.6F;

      for (o$b var10 : PLAYERS) {
         if (!var10.gear().isEmpty()) {
            float var11 = var10.fbX() / (float)var4;
            float var12 = (var10.fbY() - var6 * var3) / (float)var4 - 3.0F;
            float var13 = var10.gear().size() * var7 + (var10.gear().size() - 1) * 1.6F * 1.0F;
            float var14 = var11 - var13 / 2.0F;
            float var15 = var12 - var7;
            Matrix3x2fStack var16 = var0.pose();

            for (int var17 = 0; var17 < var10.gear().size(); var17++) {
               ItemStack var18 = var10.gear().get(var17);
               var16.pushMatrix();
               var16.translate(var14 + var17 * var8, var15);
               var16.scale(var7 / 16.0F, var7 / 16.0F);
               var0.renderItem(var10.player(), var18, 0, 0, var17);
               var0.renderItemDecorations(var2, var18, 0, 0);
               var16.popMatrix();
            }
         }
      }
   }

   private static int resolvePing(Minecraft var0, AbstractClientPlayer var1) {
      if (var1 instanceof LocalPlayer) {
         return com.wimpyclient.p.l.resolvePing(var0);
      } else if (var0.getConnection() == null) {
         return -1;
      } else {
         PlayerInfo var2 = var0.getConnection().getPlayerInfo(var1.getUUID());
         return var2 == null ? -1 : var2.getLatency();
      }
   }

   private static String formatHealth(float var0) {
      return !(var0 >= 10.0F) && var0 != Math.rint(var0) ? String.format("%.1f", var0) : String.valueOf(Math.round(var0));
   }

   private static int pingColor(int var0) {
      if (var0 < 0) {
         return com.wimpyclient.o.b.INSTANCE.textMuted();
      } else if (var0 <= 80) {
         return -12723049;
      } else {
         return var0 <= 180 ? -670398 : -41878;
      }
   }

   private static int healthColor(float var0, float var1) {
      float var2 = var0 / var1;
      if (var2 > 0.66F) {
         return -12723049;
      } else {
         return var2 > 0.33F ? -670398 : -41878;
      }
   }
}
