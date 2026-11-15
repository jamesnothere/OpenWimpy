package com.wimpyclient.s;

import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import rfaqachqmqhtmqjp.mmlkzeshbalmkmju;

@Environment(EnvType.CLIENT)
final class f$a {
   static final int SIZE = 884736;
   final int[] stamp;
   final byte[] answer;
   int generation;
   private static int o1SzhaHcI8;
   private transient int JkOWWHsbIJ;

   f$a() {
super();
      int var10 = 714627455 ^ 1056095840;
      

      label25:
      while (true) {
         switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
            case 126815142:
               var10 = 1441108875 ^ var10;
            case 882900795:
               var10 = 1475734897 ^ 331335718 ^ Integer.parseInt("96817603");
               this.JkOWWHsbIJ = 1460374482 ^ o1SzhaHcI8;

               while (true) {
                  switch (mmlkzeshbalmkmju.gngpftmbbpmalfxq(var10)) {
                     case 252031057:
                        var10 = 596476233 ^ var10;
                     case 487745746:
                        break label25;
                     case 1294356248:
                     default:
                        throw new RuntimeException();
                     case 1953214633:
                  }
               }
            case 558643824:
               break;
            case 1237990488:
            default:
               throw new RuntimeException();
         }
      }

      int var2 = 884736;
      int[] var5 = new int[var2];
      this.stamp = var5;
      int var6 = 884736;
      byte[] var7 = new byte[var6];
      this.answer = var7;
   }

   static {
      int var3 = new Random(-551401779436641046L).nextInt();
      o1SzhaHcI8 = -1132411466 ^ var3;
   }
}
