package com.wimpyclient.k;

import java.io.IOException;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class k$a {
   float x;
   float y;
   float w;
   float h;
   boolean valid;
   private static int l67TuRYggS;
   private transient int Uwtiid0Vcd;

   public k$a() {
super();
      int var4 = 1980304245 ^ 456076449;
      

      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
            case 58294284:
               var4 = 706243072 ^ var4;
            case 577337535:
               var4 = 1363465265 ^ 1307485768 ^ Integer.parseInt("1536442285");
               this.Uwtiid0Vcd = 994635921 ^ l67TuRYggS;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var4)) {
                     case 168358388:
                        var4 = 573177086 ^ var4;
                        return;
                     case 450984619:
                        return;
                     case 539879414:
                        break;
                     case 2076662139:
                     default:
                        throw new RuntimeException(new IOException());
                  }
               }
            case 1171250672:
               break;
            case 1333529878:
            default:
               throw new RuntimeException(new IOException());
         }
      }
   }

   static {
      int var3 = new Random(8805659853625180878L).nextInt();
      l67TuRYggS = -2053216004 ^ var3;
   }
}
