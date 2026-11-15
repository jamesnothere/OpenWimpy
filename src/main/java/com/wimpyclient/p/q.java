package com.wimpyclient.p;

import java.io.BufferedInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q {
   private static final String CLICK = "assets/wimpyclient/sounds/ui/click.wav";
   private static final String TOGGLE = "assets/wimpyclient/sounds/ui/toggle.wav";
   private static final String OPEN = "assets/wimpyclient/sounds/ui/open.wav";
   private static int Ao2F8vg5T9;
   private transient int f2m6H5OHqIi;
   private static byte[] lyhknwohwq = aaetxmmzzdxnzia();

   private q() {
super();
      int var4 = 1854011101 ^ 1177128734;
      
      var4 = 334318879 ^ var4;
      var4 = 759147833 ^ 1048907806 ^ Integer.parseInt("687835643");
      this.f2m6H5OHqIi = 652984561 ^ Ao2F8vg5T9;
      var4 = hwmwplbtdcansbqx(var4, 866759986);
   }

   public static void click() {
      int var4 = 1314752371 ^ 1294934297 ^ 1850915628;
      var4 = 812903725 ^ var4;
      String var0 = zmlrnmuejh(kukovkeusfitvgf(), var4);
      float var1 = 0.62F;
      play(var0, var1);
   }

   public static void toggle() {
      int var4 = 365962076 ^ 1583491991 ^ 1850915628;
      var4 = 474557547 ^ var4;
      String var0 = zmlrnmuejh(gfsbeteswyxxman(), var4);
      float var1 = 0.68F;
      play(var0, var1);
   }

   public static void open() {
      int var4 = 94174065 ^ 1830091290 ^ 1850915628;
      var4 = 177719593 ^ var4;
      String var0 = zmlrnmuejh(fwpfrzjxxrojdnk(), var4);
      float var1 = 0.6F;
      play(var0, var1);
   }

   private static void play(String param0, float param1) {
      try {
         InputStream var5 = q.class.getClassLoader().getResourceAsStream(param0);
         if (var5 == null) {
            return;
         }
         BufferedInputStream var13 = new BufferedInputStream(var5);
         try (AudioInputStream var6 = AudioSystem.getAudioInputStream(var13)) {
            Clip var7 = AudioSystem.getClip();
            var7.open(var6);
            if (var7.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
               FloatControl var8 = (FloatControl)var7.getControl(FloatControl.Type.MASTER_GAIN);
               float var9 = Math.max(0.02F, Math.min(1.0F, param1));
               var8.setValue(20.0F * (float)Math.log10(var9));
            }
            var7.addLineListener(event -> {
               if (event.getType() == LineEvent.Type.STOP) {
                  var7.close();
               }
            });
            var7.start();
         }
      } catch (Throwable ignored) {
      }
   }

   static {
      int var3 = new Random(-399487127847893638L).nextInt();
      Ao2F8vg5T9 = -399378704 ^ var3;
   }

   public static String zmlrnmuejh(byte[] var0, int var1) {
      String var10 = Integer.toString(var1);
      byte[] var11 = var10.getBytes();
      byte[] var8 = var11;
      byte var12 = 0;
      int var9 = var12;

      while (true) {
         int var17 = var0.length;
         if (var9 >= var17) {
            Charset var5 = StandardCharsets.UTF_16;
            return new String(var0, var5);
         }

         byte var20 = var0[var9];
         int var33 = var8.length;
         int var30 = var9 % var33;
         byte var27 = var8[var30];
         int var21 = var20 ^ var27;
         byte var22 = (byte)var21;
         var0[var9] = var22;
         byte var23 = var0[var9];
         byte[] var28 = lyhknwohwq;
         byte[] var34 = lyhknwohwq;
         int var35 = var34.length;
         int var32 = var9 % var35;
         byte var29 = var28[var32];
         int var24 = var23 ^ var29;
         byte var25 = (byte)var24;
         var0[var9] = var25;
         var9++;
      }
   }

   private static byte[] aaetxmmzzdxnzia() {
      return new byte[]{
         104,
         104,
         39,
         78,
         86,
         68,
         114,
         125,
         91,
         6,
         35,
         16,
         12,
         29,
         33,
         124,
         14,
         29,
         94,
         9,
         44,
         100,
         119,
         91,
         12,
         79,
         117,
         21,
         120,
         8,
         51,
         24,
         116,
         74,
         118,
         114,
         98,
         21,
         6,
         90,
         108,
         6,
         30,
         54,
         70,
         12,
         100,
         67,
         70,
         41,
         82,
         45,
         32,
         79,
         40,
         75,
         1,
         109,
         86,
         110,
         76,
         64,
         59,
         45,
         71,
         19,
         56,
         62
      };
   }

   private static byte[] kukovkeusfitvgf() {
      return new byte[]{
         -89,
         -94,
         17,
         26,
         97,
         15,
         64,
         63,
         105,
         80,
         18,
         81,
         58,
         91,
         22,
         107,
         60,
         91,
         108,
         83,
         29,
         60,
         65,
         30,
         59,
         14,
         71,
         71,
         74,
         87,
         2,
         68,
         66,
         26,
         65,
         36,
         80,
         80,
         52,
         70,
         93,
         64,
         40,
         108,
         113,
         65,
         86,
         28,
         116,
         126,
         99,
         107,
         22,
         85,
         31,
         6,
         51,
         53,
         100,
         114,
         125,
         22,
         13,
         116,
         112,
         66,
         10,
         108,
         90,
         48,
         22,
         85,
         96,
         6,
         69,
         36,
         105,
         65
      };
   }

   private static byte[] gfsbeteswyxxman() {
      return new byte[]{
         -81,
         -95,
         16,
         27,
         103,
         0,
         69,
         58,
         107,
         90,
         21,
         83,
         56,
         95,
         22,
         100,
         58,
         90,
         103,
         86,
         27,
         61,
         70,
         28,
         59,
         2,
         69,
         79,
         78,
         83,
         7,
         64,
         67,
         24,
         66,
         44,
         91,
         87,
         49,
         65,
         93,
         66,
         41,
         109,
         118,
         64,
         82,
         26,
         114,
         124,
         101,
         105,
         20,
         80,
         17,
         8,
         54,
         48,
         103,
         118,
         123,
         0,
         11,
         123,
         113,
         67,
         12,
         104,
         95,
         51,
         19,
         27,
         111,
         92,
         69,
         62,
         106,
         80,
         20,
         82
      };
   }

   private static byte[] fwpfrzjxxrojdnk() {
      return new byte[]{
         -92,
         -89,
         17,
         27,
         102,
         5,
         70,
         63,
         111,
         81,
         19,
         82,
         56,
         94,
         19,
         103,
         63,
         94,
         108,
         80,
         26,
         61,
         71,
         25,
         56,
         7,
         65,
         68,
         72,
         82,
         7,
         65,
         70,
         27,
         71,
         40,
         80,
         81,
         48,
         65,
         92,
         71,
         42,
         104,
         114,
         75,
         84,
         27,
         114,
         125,
         96,
         106,
         17,
         84,
         26,
         14,
         55,
         48,
         102,
         115,
         120,
         30,
         15,
         111,
         119,
         64,
         12,
         96,
         90,
         114,
         22,
         13,
         100,
         21,
         68,
         63
      };
   }

   private static int hwmwplbtdcansbqx(int var0, int var1) {
      return var0 ^ var1;
   }
}
