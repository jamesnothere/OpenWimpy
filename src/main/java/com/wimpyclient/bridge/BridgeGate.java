package com.wimpyclient.bridge;

import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.KeyMapping;

@Environment(EnvType.CLIENT)
public final class BridgeGate {
   private static volatile Method check;
   private static volatile Method keyChat;
   private static volatile ClickOverlayAccess overlay;
   private static volatile KeyMapping openMenuKey;

   private BridgeGate() {
   }

   public static void bindOverlay(ClickOverlayAccess var0) {
      overlay = var0;
   }

   public static void bindOpenMenuKey(KeyMapping var0) {
      openMenuKey = var0;
   }

   public static ClickOverlayAccess overlay() {
      return overlay;
   }

   public static KeyMapping openMenuKey() {
      return openMenuKey;
   }

   public static boolean ready() {
      try {
         Method var0 = check;
         if (var0 == null) {
            var0 = Class.forName("com.wimpyclient.localauth.LicenseLoader", false, BridgeGate.class.getClassLoader()).getMethod("isClientReady");
            check = var0;
         }

         return Boolean.TRUE.equals(var0.invoke(null));
      } catch (LinkageError | ReflectiveOperationException var1) {
         return false;
      }
   }

   public static boolean keyChat(String var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = var0.stripLeading();
         byte var2 = 0;
         if (var1.regionMatches(true, 0, ".key", 0, 4) || var1.regionMatches(true, 0, ",key", 0, 4)) {
            var2 = 4;
         } else if (var1.regionMatches(true, 0, "/.key", 0, 5) || var1.regionMatches(true, 0, "/,key", 0, 5)) {
            var2 = 5;
         }

         if (var2 != 0 && (var1.length() <= var2 || Character.isWhitespace(var1.charAt(var2)))) {
            try {
               Method var3 = keyChat;
               if (var3 == null) {
                  var3 = Class.forName("com.wimpyclient.localauth.WimpyLoader", false, BridgeGate.class.getClassLoader())
                     .getMethod("handleChatInput", String.class);
                  keyChat = var3;
               }

               var3.invoke(null, var0);
            } catch (LinkageError | ReflectiveOperationException var4) {
            }

            return true;
         } else {
            return false;
         }
      }
   }
}
