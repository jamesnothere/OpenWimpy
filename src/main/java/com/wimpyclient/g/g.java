package com.wimpyclient.g;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.platform.InputConstants.Key;
import com.mojang.blaze3d.platform.InputConstants.Type;
import com.wimpyclient.auth.LicenseGate;
import com.wimpyclient.bridge.BridgeGate;
import com.wimpyclient.bridge.ClickOverlayAccess;
import com.wimpyclient.i.v;
import com.wimpyclient.i.w;
import com.wimpyclient.i.x;
import com.wimpyclient.k.k;
import com.wimpyclient.k.k$b;
import com.wimpyclient.k.k$d;
import com.wimpyclient.p.q;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Overlay;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;

@Environment(EnvType.CLIENT)
public final class g extends Overlay implements ClickOverlayAccess {
   public static final g INSTANCE = new g();
   private static final int SEARCH_W_BASE = 240;
   private static final int SEARCH_H_BASE = 26;
   private final List<b> panels = new ArrayList<>();
   private final com.wimpyclient.l.a openAnim = new com.wimpyclient.l.a(11.0F);
   private final com.wimpyclient.l.a searchAnim = new com.wimpyclient.l.a(12.0F);
   private v settingsModule;
   private v listeningModule;
   private com.wimpyclient.j.g editingString;
   private com.wimpyclient.j.b colorDragSetting;
   private com.wimpyclient.j.d sliderSetting;
   private com.wimpyclient.j.c doubleSliderSetting;
   private boolean draggingWheel;
   private boolean draggingValue;
   private boolean draggingSlider;
   private int dragWheelCx;
   private int dragWheelCy;
   private int dragSliderX;
   private int dragSliderW;
   private final b$a colorDragCache = new b$a();
   private String searchQuery = "";
   private boolean searchFocused;
   private int searchX;
   private int searchY;
   private int searchW;
   private int searchH;
   private int guiWidth;
   private int guiHeight;
   private int layoutGuiW = -1;
   private int layoutGuiH = -1;
   private float layoutUserScale = Float.NaN;
   private double layoutMcGuiScale = Double.NaN;
   private boolean open;
   private boolean closing;
   private b draggingPanel;
   private k$d draggingHud;
   private boolean scalingHud;
   private float hudDragOffsetX;
   private float hudDragOffsetY;
   private float hudScaleOriginX;
   private float hudScaleOriginY;
   private float hudScaleBaseDiag;
   private int dragOffsetX;
   private int dragOffsetY;
   private int pressX;
   private int pressY;
   private boolean dragMoved;

   private g() {
      for (w var4 : w.values()) {
         this.panels.add(new b(var4));
      }

      BridgeGate.bindOverlay(this);
   }

   public boolean isOpen() {
      return this.open;
   }

   public boolean shouldDraw() {
      return this.open && this.openAnim.get() > 0.002F;
   }

   public boolean isCapturingKeybind() {
      return this.listeningModule != null;
   }

   public void toggle(Minecraft var1) {
      if (this.open && !this.closing) {
         this.beginClose(var1);
      } else {
         this.open(var1);
      }

      q.open();
   }

   public void open(Minecraft var1) {
      if (var1.getOverlay() == null) {
         this.open = true;
         this.closing = false;
         this.searchFocused = false;
         this.listeningModule = null;
         this.stopStringEdit();
         this.openAnim.setTarget(1.0F);
         this.searchAnim.snap(0.0F);
         this.searchAnim.setTarget(1.0F);
         if (this.openAnim.get() < 0.05F) {
            this.openAnim.snap(0.0F);
            this.openAnim.setTarget(1.0F);
         }

         for (int var2 = 0; var2 < this.panels.size(); var2++) {
            this.panels.get(var2).playEnter(var2);
         }

         if (var1.mouseHandler != null) {
            var1.mouseHandler.releaseMouse();
         }

         this.layout(var1);
         k.INSTANCE.ensureAllVisible();
      }
   }

   public void close(Minecraft var1) {
      this.beginClose(var1);
      this.finishClose(var1);
   }

   private void beginClose(Minecraft var1) {
      if (this.open) {
         this.closing = true;
         this.searchFocused = false;
         this.listeningModule = null;
         a.INSTANCE.close();
         c.INSTANCE.close();
         f.INSTANCE.close();
         this.stopStringEdit();
         this.draggingWheel = false;
         this.draggingValue = false;
         this.draggingSlider = false;
         this.colorDragSetting = null;
         this.sliderSetting = null;
         this.doubleSliderSetting = null;
         this.draggingPanel = null;
         this.draggingHud = null;
         this.scalingHud = false;
         this.openAnim.setTarget(0.0F);
         this.searchAnim.setTarget(0.0F);

         for (v var3 : x.INSTANCE.modules()) {
            var3.resetKeyState();
         }
      }
   }

   private void finishClose(Minecraft var1) {
      this.open = false;
      this.closing = false;
      this.openAnim.snap(0.0F);
      com.wimpyclient.d.a.save();
      if (var1 != null && var1.gui != null && var1.getOverlay() == this) {
         var1.setOverlay(null);
      }

      if (var1 != null && var1.gui != null && var1.screen == null && var1.level != null && var1.mouseHandler != null) {
         var1.mouseHandler.grabMouse();
      }
   }

   public void forceClose(Minecraft var1) {
      this.open = true;
      this.closing = false;
      this.finishClose(var1);
      this.open = false;
   }

   public boolean isPauseScreen() {
      return false;
   }

   public void tick() {
      Minecraft var1 = Minecraft.getInstance();
      if (this.open) {
         if (var1.getOverlay() != null) {
            this.forceClose(var1);
         } else {
            if (var1.mouseHandler != null && var1.mouseHandler.isMouseGrabbed()) {
               var1.mouseHandler.releaseMouse();
            }

            this.openAnim.update();
            this.searchAnim.update();

            for (b var3 : this.panels) {
               var3.tickAnims();
            }

            if (this.closing && this.openAnim.get() <= 0.02F) {
               this.finishClose(var1);
            }
         }
      }
   }

   private void layout(Minecraft var1) {
      Window var2 = var1.getWindow();
      this.guiWidth = var2.getGuiScaledWidth();
      this.guiHeight = var2.getGuiScaledHeight();
      double var3 = var2.getGuiScale();
      int var5 = this.panels.size();
      float var6 = 1.0F;

      try {
         var6 = (float)x.INSTANCE.clickGuiScale;
      } catch (LinkageError var15) {
      }

      if (this.guiWidth != this.layoutGuiW
         || this.guiHeight != this.layoutGuiH
         || Float.floatToIntBits(var6) != Float.floatToIntBits(this.layoutUserScale)
         || Double.doubleToLongBits(var3) != Double.doubleToLongBits(this.layoutMcGuiScale)) {
         e.rescale(this.guiWidth, this.guiHeight, var5, var6, var3);
         this.layoutGuiW = this.guiWidth;
         this.layoutGuiH = this.guiHeight;
         this.layoutUserScale = var6;
         this.layoutMcGuiScale = var3;
      }

      this.searchW = Math.max(160, Math.round(240.0F * e.SCALE));
      this.searchH = Math.max(20, Math.round(26.0F * e.SCALE));
      this.searchX = this.guiWidth / 2 - this.searchW / 2;
      this.searchY = Math.max(6, e.TOP_Y - 2);
      int var7 = var5 * e.COL_W + (var5 - 1) * e.COL_GAP;
      int var8 = Math.max(4, this.guiWidth / 2 - var7 / 2);
      int var9 = this.searchY + this.searchH + 12;
      int var10 = Math.min(e.MAX_COL_H, Math.max(80, this.guiHeight - var9 - 28));
      String var11 = this.searchQuery;

      for (int var12 = 0; var12 < this.panels.size(); var12++) {
         b var13 = this.panels.get(var12);
         v var14 = this.settingsModule != null && this.settingsModule.category() == var13.category ? this.settingsModule : null;
         var13.layout(var8 + var12 * (e.COL_W + e.COL_GAP), var9, e.COL_W, var10, var14, var11);
         if (var13 != this.draggingPanel) {
            var13.clampToScreen(this.guiWidth, this.guiHeight);
         }
      }
   }

   public void render(GuiGraphics var1, int var2, int var3, float var4) {
      if (this.shouldDraw()) {
         Minecraft var5 = Minecraft.getInstance();
         if (var5.level == null) {
            Screen var6 = var5.screen;
            if (var6 != null && var5.gameRenderer != null) {
               var1.nextStratum();
               var5.gameRenderer.getPanorama().render(var1, Math.max(1, var6.width), Math.max(1, var6.height), false);
            }
         } else {
            float var7 = this.openAnim.get();
            if (var7 > 0.01F) {
               var1.blurBeforeThisStratum();
            }
         }

         var1.nextStratum();
      }
   }

   private void renderExtract(GuiGraphics var1, int var2, int var3) {
      Minecraft var4 = Minecraft.getInstance();
      Font var5 = var4.font;
      float var6 = this.openAnim.get();
      float var7 = var4.level == null ? 0.19F * var6 : 0.22F * var6;
      if (var7 > 0.004F) {
         var1.fill(0, 0, this.guiWidth, this.guiHeight, com.wimpyclient.p.g.withAlpha(-16382710, var7));
      }

      String var8 = this.searchQuery;

      for (b var10 : this.panels) {
         v var11 = this.settingsModule != null && this.settingsModule.category() == var10.category ? this.settingsModule : null;
         var10.renderExtract(var1, var5, var2, var3, var11, this.listeningModule, this.editingString, this.colorDragCache, var8);
      }

      this.renderSearchExtract(var1, var5, var2, var3);
      this.renderHoverTipExtract(var1, var5, var2, var3);
      if (this.listeningModule != null) {
         String var13 = "PRESS A KEY TO BIND  \u00b7  ESC CLEARS";
         int var15 = var5.width(var13);
         var1.drawString(var5, var13, this.guiWidth / 2 - var15 / 2, this.guiHeight - 20, com.wimpyclient.o.b.INSTANCE.warn(), false);
      }

      a.INSTANCE.renderExtract(var1, var5, var2, var3, this.guiWidth, this.guiHeight);
      c.INSTANCE.renderExtract(var1, var5, var2, var3, this.guiWidth, this.guiHeight);
      f.INSTANCE.renderExtract(var1, var5, var2, var3, this.guiWidth, this.guiHeight);
      if (!LicenseGate.isAuthorized()) {
         String var14 = "LICENSE REQUIRED \u2014 type .key YOURKEY in chat";
         int var16 = var5.width(var14);
         int var17 = this.guiWidth / 2 - var16 / 2 - 8;
         int var12 = this.guiHeight - 36;
         var1.fill(var17, var12, var17 + var16 + 16, var12 + 18, -300935136);
         var1.drawString(var5, var14, this.guiWidth / 2 - var16 / 2, var12 + 5, com.wimpyclient.o.b.INSTANCE.warn(), false);
      }
   }

   private void renderSearchExtract(GuiGraphics var1, Font var2, int var3, int var4) {
      int var5 = this.searchX;
      int var6 = this.searchY;
      int var7 = this.searchW;
      int var8 = this.searchH;
      boolean var9 = this.searchFocused;
      int var10 = var9 ? com.wimpyclient.o.b.INSTANCE.accentBright() : com.wimpyclient.p.g.withAlpha(com.wimpyclient.o.b.INSTANCE.accent(), 0.45F);
      d.fillRoundBorder(var1, var5, var6, var7, var8, var8 / 2, -401073118, var10);
      int var11 = d.textY(var6, var8, var2);
      int var12 = var5 + 14;
      int var13 = var6 + var8 / 2;
      d.fillRound(var1, var12 - 4, var13 - 5, 8, 8, 4, com.wimpyclient.p.g.withAlpha(com.wimpyclient.o.b.INSTANCE.textMuted(), 0.9F));
      d.fillRound(var1, var12 - 2, var13 - 3, 4, 4, 2, -401073118);
      var1.fill(var12 + 2, var13 + 1, var12 + 6, var13 + 2, com.wimpyclient.o.b.INSTANCE.textMuted());
      String var14 = this.searchQuery.isEmpty() && !var9 ? "Search modules" : this.searchQuery;
      int var15 = this.searchQuery.isEmpty() && !var9 ? com.wimpyclient.o.b.INSTANCE.textDisabled() : com.wimpyclient.o.b.INSTANCE.textPrimary();
      String var16 = d.ellipsize(var2, var14, var7 - 48);
      var1.drawString(var2, var16, var5 + 30, var11, var15, false);
      if (var9 && !this.searchQuery.isEmpty() && System.nanoTime() / 400000000L % 2L == 0L) {
         int var17 = var5 + 30 + var2.width(var16) + 2;
         var1.fill(var17, var11, var17 + 1, var11 + 9, com.wimpyclient.o.b.INSTANCE.accentBright());
      }

      if (!this.searchQuery.isEmpty()) {
         var1.drawString(var2, "x", var5 + var7 - 18, var11, com.wimpyclient.o.b.INSTANCE.textMuted(), false);
      }
   }

   private void renderHoverTipExtract(GuiGraphics var1, Font var2, int var3, int var4) {
      String var5 = "";

      for (b var7 : this.panels) {
         if (var7.hoverTip != null && !var7.hoverTip.isBlank()) {
            var5 = var7.hoverTip;
         }
      }

      if (!var5.isBlank()) {
         int var12 = var2.width(var5);
         byte var13 = 6;
         int var8 = var12 + var13 * 2;
         byte var9 = 18;
         int var10 = Mth.clamp(var3 + 12, 4, this.guiWidth - var8 - 4);
         int var11 = Mth.clamp(var4 + 14, 4, this.guiHeight - var9 - 4);
         var1.fill(var10, var11, var10 + var8, var11 + var9, com.wimpyclient.o.b.INSTANCE.descriptionBg());
         var1.renderOutline(var10, var11, var8, var9, com.wimpyclient.p.g.withAlpha(com.wimpyclient.o.b.INSTANCE.accent(), 0.35F));
         var1.drawString(var2, var5, var10 + var13, var11 + (var9 - 9) / 2, com.wimpyclient.o.b.INSTANCE.textPrimary(), false);
      }
   }

   public void renderNvg(com.wimpyclient.m.b var1, int var2, int var3, float var4, float var5) {
      if (this.shouldDraw()) {
         this.layout(Minecraft.getInstance());
         float var6 = this.openAnim.update();
         float var7 = var6 * var6 * (3.0F - 2.0F * var6);
         Minecraft var8 = Minecraft.getInstance();
         float var9 = var8.level == null ? 0.14F * var7 : 0.2F * var7;
         if (var9 > 0.004F) {
            var1.rect(0.0F, 0.0F, var4, var5, 0.0F, com.wimpyclient.p.g.withAlpha(-16382710, var9));
         }

         var1.save();
         var1.alpha(var7);
         if (var7 < 0.995F) {
            float var10 = 0.94F + 0.06F * var7;
            float var11 = (1.0F - var7) * 14.0F;
            var1.translate(var4 / 2.0F, var5 / 2.0F + var11);
            var1.scale(var10);
            var1.translate(-var4 / 2.0F, -var5 / 2.0F);
         }

         String var16 = this.searchQuery;

         for (b var12 : this.panels) {
            v var13 = this.settingsModule != null && this.settingsModule.category() == var12.category ? this.settingsModule : null;
            var12.render(var1, var2, var3, var13, this.listeningModule, this.editingString, this.colorDragCache, var16);
         }

         this.renderSearch(var1, var2, var3);
         this.renderHoverTip(var1, var2, var3, var4, var5);
         if (this.listeningModule != null) {
            var1.textCentered(var4 / 2.0F, var5 - 14.0F, e.bodyFont(), com.wimpyclient.o.b.INSTANCE.warn(), "PRESS A KEY TO BIND  \u00b7  ESC CLEARS");
         }

         a.INSTANCE.render(var1, var2, var3, var4, var5);
         c.INSTANCE.render(var1, var2, var3, var4, var5);
         f.INSTANCE.render(var1, var2, var3, var4, var5);
         if (!LicenseGate.isAuthorized()) {
            String var18 = "LICENSE REQUIRED \u2014 type .key YOURKEY in chat";
            float var19 = e.bodyFont();
            float var20 = var1.textWidth(var19, var18);
            float var14 = (var4 - var20) / 2.0F - 8.0F;
            float var15 = var5 - 32.0F;
            var1.rect(var14, var15, var20 + 16.0F, 16.0F, 5.0F, -300935136);
            var1.textCentered(var4 / 2.0F, var15 + 8.0F, var19, com.wimpyclient.o.b.INSTANCE.warn(), var18);
         }

         var1.restore();
      }
   }

   private void renderSearch(com.wimpyclient.m.b var1, int var2, int var3) {
      com.wimpyclient.o.b var4 = com.wimpyclient.o.b.INSTANCE;
      float var5 = this.searchAnim.eased();
      if (!(var5 < 0.01F)) {
         float var6 = this.searchX;
         float var7 = this.searchY - (1.0F - var5) * 12.0F;
         float var8 = this.searchW;
         float var9 = this.searchH;
         boolean var10 = this.searchFocused;
         var1.save();
         var1.alpha(var5);
         com.wimpyclient.k.e.glassCapsule(var1, var6, var7, var8, var9);
         float var11 = var7 + var9 / 2.0F;
         float var12 = var6 + 16.0F;
         var1.circleOutline(var12, var11 - 1.5F, 4.5F, 1.6F, var4.textMuted());
         var1.line(var12 + 3.4F, var11 + 2.2F, var12 + 6.5F, var11 + 5.4F, 1.6F, var4.textMuted());
         float var13 = var6 + 30.0F;
         if (this.searchQuery.isEmpty() && !var10) {
            var1.text(var13, var11, e.bodyFont(), var4.textDisabled(), "Search modules");
         } else {
            float var14 = var1.text(var13, var11, e.bodyFont(), var4.textPrimary(), this.searchQuery);
            if (var10 && System.nanoTime() / 400000000L % 2L == 0L) {
               var1.rect(var13 + var14 + 2.0F, var11 - 7.0F, 1.5F, 14.0F, 0.75F, var4.accentBright());
            }
         }

         if (!this.searchQuery.isEmpty()) {
            var1.line(var6 + var8 - 22.0F, var11 - 5.0F, var6 + var8 - 12.0F, var11 + 5.0F, 1.6F, var4.textMuted());
            var1.line(var6 + var8 - 12.0F, var11 - 5.0F, var6 + var8 - 22.0F, var11 + 5.0F, 1.6F, var4.textMuted());
         }

         var1.restore();
      }
   }

   private void renderHoverTip(com.wimpyclient.m.b var1, int var2, int var3, float var4, float var5) {
      String var6 = "";

      for (b var8 : this.panels) {
         if (var8.hoverTip != null && !var8.hoverTip.isBlank()) {
            var6 = var8.hoverTip;
         }
      }

      if (!var6.isBlank()) {
         float var14 = e.labelFont();
         float var15 = var1.textWidth(var14, var6);
         float var9 = 5.0F;
         float var10 = var15 + var9 * 2.0F;
         float var11 = Math.max(14.0F, var14 + 8.0F);
         float var12 = Mth.clamp(var2 + 12, 4.0F, var4 - var10 - 4.0F);
         float var13 = Mth.clamp(var3 + 14, 4.0F, var5 - var11 - 4.0F);
         var1.save();
         var1.alpha(0.92F);
         com.wimpyclient.k.e.glassPanel(var1, var12, var13, var10, var11, 5.0F);
         var1.text(var12 + var9, var13 + var11 / 2.0F, var14, com.wimpyclient.o.b.INSTANCE.textPrimary(), var6);
         var1.restore();
      }
   }

   public boolean mouseClicked(double var1, double var3, int var5) {
      if (!this.open || this.closing) {
         return this.open;
      } else if (c.INSTANCE.isOpen()) {
         return c.INSTANCE.mouseClicked(var1, var3, var5);
      } else if (f.INSTANCE.isOpen()) {
         return f.INSTANCE.mouseClicked(var1, var3, var5);
      } else if (a.INSTANCE.isOpen()) {
         return a.INSTANCE.mouseClicked(var1, var3, var5);
      } else {
         if (this.listeningModule != null) {
            if (var5 == 1) {
               this.listeningModule.clearKeybind();
               this.finishKeybindListen();
               q.click();
               return true;
            }

            if (var5 >= 0) {
               this.listeningModule.bindKey(Type.MOUSE.getOrCreate(var5));
               this.finishKeybindListen();
               q.click();
               return true;
            }
         }

         this.searchFocused = false;
         this.stopStringEdit();
         if (this.isOverSearchClear(var1, var3) && var5 == 0) {
            this.searchQuery = "";
            this.layout(Minecraft.getInstance());
            q.click();
            return true;
         } else if (this.isOverSearchPanel(var1, var3) && var5 == 0) {
            this.searchFocused = true;
            q.click();
            return true;
         } else if (var5 == 1) {
            b$b var9 = this.hit(var1, var3);
            if (var9.type == b$c.HEADER) {
               for (b var13 : this.panels) {
                  if (var13.category == var9.category) {
                     var13.toggleCollapsed();
                     this.layout(Minecraft.getInstance());
                     q.click();
                     return true;
                  }
               }
            }

            if (var9.type != b$c.MODULE_TOGGLE && var9.type != b$c.MODULE_OPEN) {
               return true;
            } else if (this.openAccountsIfNeeded(var9.module)) {
               q.open();
               return true;
            } else {
               this.openSettings(var9.module);
               q.open();
               return true;
            }
         } else if (var5 != 0) {
            return true;
         } else {
            b$b var6 = this.hit(var1, var3);
            switch (var6.type) {
               case HEADER:
                  for (b var8 : this.panels) {
                     if (var8.category == var6.category) {
                        var8.userMoved = true;
                        this.bringToFront(var8);
                        this.draggingPanel = var8;
                        this.dragOffsetX = (int)var1 - var8.x;
                        this.dragOffsetY = (int)var3 - var8.y;
                        this.pressX = (int)var1;
                        this.pressY = (int)var3;
                        this.dragMoved = false;
                        return true;
                     }
                  }

                  return true;
               case MODULE_TOGGLE:
                  if (this.openAccountsIfNeeded(var6.module)) {
                     q.open();
                     return true;
                  } else if (!LicenseGate.isAuthorized()) {
                     LocalPlayer var10 = Minecraft.getInstance().player;
                     if (var10 != null) {
                        var10.displayClientMessage(Component.literal("[License] Modules locked \u2014 type .key YOURKEY in chat"), false);
                     }

                     return true;
                  } else {
                     if (var6.module == x.INSTANCE.clickGui) {
                        this.openSettings(var6.module);
                        q.open();
                        return true;
                     }

                     var6.module.qr();
                     q.toggle();
                     return true;
                  }
               case MODULE_OPEN:
                  if (this.openAccountsIfNeeded(var6.module)) {
                     q.open();
                     return true;
                  }

                  this.openSettings(var6.module);
                  q.open();
                  return true;
               case KEYBIND:
                  this.beginKeybindListen(var6.module);
                  q.click();
                  return true;
               case BOOL:
                  ((com.wimpyclient.j.a)var6.setting).toggle();
                  q.toggle();
                  return true;
               case INT_SLIDER:
                  this.sliderSetting = (com.wimpyclient.j.d)var6.setting;
                  this.doubleSliderSetting = null;
                  this.draggingSlider = true;
                  this.dragSliderX = var6.a;
                  this.dragSliderW = var6.b;
                  this.applyIntSlider(var1);
                  q.click();
                  return true;
               case DOUBLE_SLIDER:
                  this.doubleSliderSetting = (com.wimpyclient.j.c)var6.setting;
                  this.sliderSetting = null;
                  this.draggingSlider = true;
                  this.dragSliderX = var6.a;
                  this.dragSliderW = var6.b;
                  this.applyDoubleSlider(var1);
                  q.click();
                  return true;
               case STRING:
                  this.editingString = (com.wimpyclient.j.g)var6.setting;
                  this.editingString.setEditing(true);
                  this.searchFocused = false;
                  q.click();
                  return true;
               case MODE:
                  ((com.wimpyclient.j.e)var6.setting).cycle();
                  q.click();
                  return true;
               case COLOR_TOGGLE:
                  com.wimpyclient.j.b var7 = (com.wimpyclient.j.b)var6.setting;
                  this.closeOtherColorPickers(var7);
                  var7.togglePicker();
                  this.layout(Minecraft.getInstance());
                  q.click();
                  return true;
               case COLOR_WHEEL:
                  this.colorDragSetting = (com.wimpyclient.j.b)var6.setting;
                  this.draggingWheel = true;
                  this.draggingValue = false;
                  this.dragWheelCx = var6.a;
                  this.dragWheelCy = var6.b;
                  this.applyWheel(var1, var3);
                  q.click();
                  return true;
               case COLOR_VALUE:
                  this.colorDragSetting = (com.wimpyclient.j.b)var6.setting;
                  this.draggingWheel = false;
                  this.draggingValue = true;
                  this.dragSliderX = var6.a;
                  this.dragSliderW = var6.b;
                  this.applyValue(var1);
                  q.click();
                  return true;
               default:
                  return this.beginHudDrag(var1, var3);
            }
         }
      }
   }

   private boolean beginHudDrag(double var1, double var3) {
      float[] var5 = k.guiToHud(var1, var3);
      k$d var6 = k.INSTANCE.hitResize(var5[0], var5[1]);
      if (var6 != null) {
         k$b var11 = k.INSTANCE.bounds(var6);
         if (var11 == null) {
            return true;
         } else {
            float var12 = Math.max(0.01F, k.INSTANCE.scale(var6));
            float var9 = var11.w() / var12;
            float var10 = var11.h() / var12;
            this.draggingHud = var6;
            this.scalingHud = true;
            this.hudScaleOriginX = var11.x();
            this.hudScaleOriginY = var11.y();
            this.hudScaleBaseDiag = Math.max(8.0F, (float)Math.hypot(var9, var10));
            this.pressX = (int)var1;
            this.pressY = (int)var3;
            this.dragMoved = false;
            this.draggingPanel = null;
            return true;
         }
      } else {
         k$d var7 = k.INSTANCE.hit(var5[0], var5[1]);
         if (var7 == null) {
            return true;
         } else {
            k$b var8 = k.INSTANCE.bounds(var7);
            if (var8 == null) {
               return true;
            } else {
               this.draggingHud = var7;
               this.scalingHud = false;
               this.hudDragOffsetX = var5[0] - var8.x();
               this.hudDragOffsetY = var5[1] - var8.y();
               this.pressX = (int)var1;
               this.pressY = (int)var3;
               this.dragMoved = false;
               this.draggingPanel = null;
               return true;
            }
         }
      }
   }

   public boolean mouseReleased(double var1, double var3, int var5) {
      if (!this.open) {
         return false;
      } else if (var5 == 0 && this.draggingHud != null) {
         k.INSTANCE.ensureVisible(this.draggingHud);
         if (this.dragMoved) {
            com.wimpyclient.d.a.save();
         }

         this.draggingHud = null;
         this.scalingHud = false;
         this.dragMoved = false;
         return true;
      } else if (var5 == 0 && this.draggingPanel != null) {
         if (!this.dragMoved) {
            this.draggingPanel.toggleCollapsed();
            this.layout(Minecraft.getInstance());
         }

         this.draggingPanel = null;
         this.dragMoved = false;
         return true;
      } else if (var5 != 0 || !this.draggingSlider || this.sliderSetting == null && this.doubleSliderSetting == null) {
         if (var5 != 0 || this.colorDragSetting == null || !this.draggingWheel && !this.draggingValue) {
            return true;
         } else {
            this.colorDragSetting.save();
            this.draggingWheel = false;
            this.draggingValue = false;
            this.colorDragSetting = null;
            return true;
         }
      } else {
         if (this.sliderSetting != null) {
            this.sliderSetting.commit();
         } else {
            this.doubleSliderSetting.commit();
         }

         this.draggingSlider = false;
         this.sliderSetting = null;
         this.doubleSliderSetting = null;
         return true;
      }
   }

   public boolean mouseDragged(double var1, double var3, int var5) {
      if (!this.open || var5 != 0) {
         return this.open;
      } else if (this.draggingHud != null) {
         if (!this.dragMoved && Math.hypot(var1 - this.pressX, var3 - this.pressY) > 4.0) {
            this.dragMoved = true;
         }

         if (this.dragMoved) {
            float[] var6 = k.guiToHud(var1, var3);
            if (!Float.isFinite(var6[0]) || !Float.isFinite(var6[1])) {
               return true;
            }

            if (this.scalingHud) {
               float var7 = Math.max(4.0F, var6[0] - this.hudScaleOriginX);
               float var8 = Math.max(4.0F, var6[1] - this.hudScaleOriginY);
               float var9 = (float)Math.hypot(var7, var8);
               float var10 = var9 / Math.max(8.0F, this.hudScaleBaseDiag);
               if (Float.isFinite(var10)) {
                  k.INSTANCE.setScale(this.draggingHud, var10);
               }
            } else {
               k$b var11 = k.INSTANCE.bounds(this.draggingHud);
               float var12 = var11 != null ? var11.w() : 40.0F;
               float var13 = var11 != null ? var11.h() : 20.0F;
               k.INSTANCE.set(this.draggingHud, var6[0] - this.hudDragOffsetX, var6[1] - this.hudDragOffsetY, k.hudScreenW(), k.hudScreenH(), var12, var13);
            }

            k.INSTANCE.ensureVisible(this.draggingHud);
         }

         return true;
      } else if (this.draggingPanel != null) {
         if (!this.dragMoved && Math.hypot(var1 - this.pressX, var3 - this.pressY) > 4.0) {
            this.dragMoved = true;
            this.draggingPanel.userMoved = true;
         }

         if (this.dragMoved) {
            this.draggingPanel.x = (int)var1 - this.dragOffsetX;
            this.draggingPanel.y = (int)var3 - this.dragOffsetY;
            this.draggingPanel.clampToScreen(this.guiWidth, this.guiHeight);
         }

         return true;
      } else if (this.draggingSlider && this.sliderSetting != null) {
         this.applyIntSlider(var1);
         return true;
      } else if (this.draggingSlider && this.doubleSliderSetting != null) {
         this.applyDoubleSlider(var1);
         return true;
      } else if (this.colorDragSetting == null) {
         return true;
      } else if (this.draggingWheel) {
         this.applyWheel(var1, var3);
         return true;
      } else if (this.draggingValue) {
         this.applyValue(var1);
         return true;
      } else {
         return true;
      }
   }

   public boolean mouseScrolled(double var1, double var3, double var5) {
      if (this.open && !this.closing) {
         if (f.INSTANCE.isOpen()) {
            return f.INSTANCE.mouseScrolled(var1, var3, var5);
         } else if (a.INSTANCE.isOpen()) {
            return a.INSTANCE.mouseScrolled(var1, var3, var5);
         } else {
            for (int var7 = this.panels.size() - 1; var7 >= 0; var7--) {
               b var8 = this.panels.get(var7);
               if (var8.contains(var1, var3)) {
                  v var9 = this.settingsModule != null && this.settingsModule.category() == var8.category ? this.settingsModule : null;
                  return var8.mouseScrolled(var5, var9, this.searchQuery);
               }
            }

            if (Math.abs(var5) > 1.0E-4) {
               float[] var10 = k.guiToHud(var1, var3);
               k$d var11 = k.INSTANCE.hit(var10[0], var10[1]);
               if (var11 != null) {
                  float var12 = k.INSTANCE.scale(var11) + (float)var5 * 0.08F;
                  k.INSTANCE.setScale(var11, var12);
                  k.INSTANCE.ensureVisible(var11);
                  com.wimpyclient.d.a.save();
                  return true;
               }
            }

            return true;
         }
      } else {
         return this.open;
      }
   }

   public boolean keyPressed(KeyEvent var1) {
      if (!this.open) {
         return false;
      } else if (this.listeningModule != null) {
         if (var1.key() == 256) {
            this.listeningModule.clearKeybind();
            this.finishKeybindListen();
            return true;
         } else {
            Key var3 = InputConstants.getKey(var1);
            if (var3.getValue() != InputConstants.UNKNOWN.getValue()) {
               this.listeningModule.bindKey(var3);
               this.finishKeybindListen();
               return true;
            } else {
               return true;
            }
         }
      } else if (c.INSTANCE.isOpen()) {
         if (var1.key() == 256) {
            c.INSTANCE.close();
            return true;
         } else {
            return true;
         }
      } else if (f.INSTANCE.isOpen()) {
         if (var1.key() == 256) {
            f.INSTANCE.close();
            return true;
         } else {
            return true;
         }
      } else if (a.INSTANCE.isOpen()) {
         return a.INSTANCE.keyPressed(var1);
      } else if (var1.key() == 256) {
         if (this.searchFocused) {
            this.searchFocused = false;
            return true;
         } else if (this.editingString != null) {
            this.stopStringEdit();
            return true;
         } else {
            this.beginClose(Minecraft.getInstance());
            return true;
         }
      } else if (this.searchFocused) {
         if (var1.key() == 259) {
            if (!this.searchQuery.isEmpty()) {
               this.searchQuery = this.searchQuery.substring(0, this.searchQuery.length() - 1);
               this.layout(Minecraft.getInstance());
            }

            return true;
         } else {
            return true;
         }
      } else if (this.editingString != null) {
         if (var1.key() == 257) {
            this.stopStringEdit();
            return true;
         } else if (var1.key() == 259) {
            String var2 = this.editingString.get();
            if (!var2.isEmpty()) {
               this.editingString.set(var2.substring(0, var2.length() - 1));
            }

            return true;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public boolean charTyped(CharacterEvent var1) {
      if (!this.open) {
         return false;
      } else if (a.INSTANCE.isOpen()) {
         return a.INSTANCE.charTyped(var1);
      } else if (!this.searchFocused || !var1.isAllowedChatCharacter() && var1.codepoint() != 32) {
         if (this.editingString == null || !var1.isAllowedChatCharacter() && var1.codepoint() != 32) {
            return this.listeningModule != null || this.searchFocused || this.editingString != null;
         } else {
            String var2 = this.editingString.get() + var1.codepointAsString();
            if (var2.length() <= this.editingString.maxLength()) {
               this.editingString.set(var2);
            }

            return true;
         }
      } else {
         this.searchQuery = this.searchQuery + var1.codepointAsString();
         this.layout(Minecraft.getInstance());
         return true;
      }
   }

   private b$b hit(double var1, double var3) {
      for (int var5 = this.panels.size() - 1; var5 >= 0; var5--) {
         b var6 = this.panels.get(var5);
         v var7 = this.settingsModule != null && this.settingsModule.category() == var6.category ? this.settingsModule : null;
         b$b var8 = var6.hit(var1, var3, var7, this.searchQuery);
         if (var8.type != b$c.NONE) {
            return var8;
         }
      }

      return b$b.miss();
   }

   private void bringToFront(b var1) {
      this.panels.remove(var1);
      this.panels.add(var1);
   }

   private boolean isOverSearchPanel(double var1, double var3) {
      return var1 >= this.searchX && var1 < this.searchX + this.searchW && var3 >= this.searchY && var3 < this.searchY + this.searchH;
   }

   private boolean isOverSearchClear(double var1, double var3) {
      if (this.searchQuery.isEmpty()) {
         return false;
      } else {
         float var5 = this.searchX + this.searchW - 17;
         float var6 = this.searchY + this.searchH / 2.0F;
         return Math.abs(var1 - var5) < 10.0 && Math.abs(var3 - var6) < 10.0;
      }
   }

   private boolean openAccountsIfNeeded(v var1) {
      if (var1 != x.INSTANCE.accounts) {
         return false;
      } else {
         a.INSTANCE.toggle();
         return true;
      }
   }

   private boolean openSchematicBuilderIfNeeded(v var1) {
      if (var1 != x.INSTANCE.schematicBuilder) {
         return false;
      } else {
         f.INSTANCE.toggle();
         return true;
      }
   }

   private void openSettings(v var1) {
      if (!this.openAccountsIfNeeded(var1)) {
         if (!this.openSchematicBuilderIfNeeded(var1)) {
            boolean var2 = this.settingsModule == var1;
            if (!var2 && this.settingsModule != null) {
               collapseColorPickers(this.settingsModule);
            }

            this.settingsModule = var2 ? null : var1;
            if (var2) {
               collapseColorPickers(var1);
            }

            this.listeningModule = null;
            this.stopStringEdit();
            this.layout(Minecraft.getInstance());
         }
      }
   }

   private void beginKeybindListen(v var1) {
      this.stopStringEdit();
      this.searchFocused = false;
      this.listeningModule = var1;
   }

   private void finishKeybindListen() {
      if (this.listeningModule != null) {
         this.listeningModule.resetKeyState();
      }

      KeyMapping.resetMapping();
      Minecraft var1 = Minecraft.getInstance();
      var1.options.save();
      this.listeningModule = null;
   }

   private void stopStringEdit() {
      if (this.editingString != null) {
         this.editingString.setEditing(false);
         this.editingString = null;
      }
   }

   private void closeOtherColorPickers(com.wimpyclient.j.b var1) {
      if (this.settingsModule != null) {
         for (com.wimpyclient.j.f var3 : this.settingsModule.settings()) {
            if (var3 instanceof com.wimpyclient.j.b var4 && var4 != var1) {
               var4.setPickerOpen(false);
            }
         }
      }
   }

   private static void collapseColorPickers(v var0) {
      for (com.wimpyclient.j.f var2 : var0.settings()) {
         if (var2 instanceof com.wimpyclient.j.b var3) {
            var3.setPickerOpen(false);
         }
      }
   }

   private void applyWheel(double var1, double var3) {
      if (this.colorDragSetting != null) {
         float var5 = (float)(var1 - this.dragWheelCx);
         float var6 = (float)(var3 - this.dragWheelCy);
         float var7 = (float)Math.sqrt(var5 * var5 + var6 * var6);
         float var8 = Math.min(1.0F, var7 / Math.max(1, e.WHEEL_R));
         float var9 = (float)(Math.atan2(var6, var5) / (Math.PI * 2) + 0.5);
         this.colorDragSetting.setFromWheel(var9, var8);
      }
   }

   private void applyValue(double var1) {
      if (this.colorDragSetting != null) {
         float var3 = this.dragSliderW <= 1 ? 1.0F : (float)((var1 - this.dragSliderX) / (this.dragSliderW - 1));
         this.colorDragSetting.setValue(Mth.clamp(var3, 0.0F, 1.0F));
      }
   }

   private void applyIntSlider(double var1) {
      if (this.sliderSetting != null && this.dragSliderW > 1) {
         float var3 = Mth.clamp((float)((var1 - this.dragSliderX) / this.dragSliderW), 0.0F, 1.0F);
         int var4 = this.sliderSetting.min();
         int var5 = this.sliderSetting.max();
         int var6 = Math.round(var4 + (var5 - var4) * var3);
         this.sliderSetting.setLive(var6);
      }
   }

   private void applyDoubleSlider(double var1) {
      if (this.doubleSliderSetting != null && this.dragSliderW > 1) {
         float var3 = Mth.clamp((float)((var1 - this.dragSliderX) / this.dragSliderW), 0.0F, 1.0F);
         double var4 = this.doubleSliderSetting.min();
         double var6 = this.doubleSliderSetting.max();
         this.doubleSliderSetting.setLive(var4 + (var6 - var4) * var3);
      }
   }
}
