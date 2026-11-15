package com.wimpyclient.a;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class c$a extends IOException {
   public final int status;
   public final JsonObject json;
   private static int CHXTJ8OrQq;
   private transient int XHF5gBmlmu;

   public c$a(String var1, int var2, JsonObject var3) {
super(var1);
      int var12 = 649768213 ^ 6397671;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var12)) {
            case 189305471:
               var12 = 1042978590 ^ var12;
            case 1421786080:
               var12 = 599735597 ^ 1063023099 ^ Integer.parseInt("68347962");
               this.XHF5gBmlmu = 1722336059 ^ CHXTJ8OrQq;

               label22:
               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var12)) {
                     case 5519224:
                        var12 = 259558446 ^ var12;
                     case 1359170524:
                        break label22;
                     case 1500019062:
                     default:
                        throw new IllegalStateException();
                     case 1997632517:
                  }
               }

               this.status = var2;
               this.json = var3;
               return;
            case 751929437:
            default:
               throw new IllegalStateException();
            case 2015972799:
         }
      }
   }

   static {
      int var3 = new Random(-3018789974569544913L).nextInt();
      CHXTJ8OrQq = 247840812 ^ var3;
   }
}
