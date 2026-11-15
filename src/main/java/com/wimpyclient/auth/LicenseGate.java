package com.wimpyclient.auth;

import java.lang.reflect.Method;
import java.time.Instant;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class LicenseGate {
   private static final Class<?> TRANSPORT = transportClass();
   private static final Method IS_AUTHORIZED = method("isAuthorized");
   private static final Method ACTIVATE = method("activate", String.class);
   private static final Method START_STORED = method("startStoredKeyValidation", Runnable.class, Runnable.class);
   private static final Method START_HEARTBEAT = method("startHeartbeat", Runnable.class);
   private static final Method EXPIRES_AT = method("expiresAtEpochSeconds");
   private static final Method FREE_KEY = method("isFreeKey");
   private static final Method CURRENT_KEY = method("isCurrentKey", String.class);

   private LicenseGate() {
   }

   public static boolean isAuthorized() {
      if (IS_AUTHORIZED == null) {
         return false;
      } else {
         try {
            return Boolean.TRUE.equals(IS_AUTHORIZED.invoke(null));
         } catch (RuntimeException | ReflectiveOperationException var1) {
            return false;
         }
      }
   }

   public static boolean activate(String var0) {
      if (ACTIVATE == null) {
         return false;
      } else {
         try {
            ACTIVATE.invoke(null, var0);
            return isAuthorized();
         } catch (RuntimeException | ReflectiveOperationException var2) {
            return false;
         }
      }
   }

   public static void startStoredKeyValidation(Runnable var0, Runnable var1) {
      if (START_STORED != null) {
         try {
            START_STORED.invoke(null, var0, var1);
         } catch (RuntimeException | ReflectiveOperationException var3) {
            var1.run();
         }
      }
   }

   public static void startHeartbeat(Runnable var0) {
      if (START_HEARTBEAT != null) {
         try {
            START_HEARTBEAT.invoke(null, var0);
         } catch (RuntimeException | ReflectiveOperationException var2) {
            var0.run();
         }
      }
   }

   public static long remainingSeconds() {
      if (isAuthorized() && EXPIRES_AT != null) {
         try {
            if (EXPIRES_AT.invoke(null) instanceof Number var1) {
               return Math.max(0L, var1.longValue() - Instant.now().getEpochSecond());
            }
         } catch (RuntimeException | ReflectiveOperationException var2) {
         }

         return 0L;
      } else {
         return 0L;
      }
   }

   public static boolean isFreeKey() {
      if (isAuthorized() && FREE_KEY != null) {
         try {
            return Boolean.TRUE.equals(FREE_KEY.invoke(null));
         } catch (RuntimeException | ReflectiveOperationException var1) {
            return true;
         }
      } else {
         return true;
      }
   }

   public static boolean isCurrentKey(String var0) {
      if (isAuthorized() && CURRENT_KEY != null) {
         try {
            return Boolean.TRUE.equals(CURRENT_KEY.invoke(null, var0));
         } catch (RuntimeException | ReflectiveOperationException var2) {
            return false;
         }
      } else {
         return false;
      }
   }

   private static Class<?> transportClass() {
      try {
         return Class.forName("com.wimpyclient.localauth.LicenseLoader");
      } catch (LinkageError | ClassNotFoundException var1) {
         return null;
      }
   }

   private static Method method(String var0, Class<?>... var1) {
      if (TRANSPORT == null) {
         return null;
      } else {
         try {
            return TRANSPORT.getMethod(var0, var1);
         } catch (SecurityException | NoSuchMethodException var3) {
            return null;
         }
      }
   }
}
