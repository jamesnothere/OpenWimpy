package com.wimpyclient.i;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.User;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.world.entity.player.Player;

@Environment(EnvType.CLIENT)
public final class n {
   private static final Map<Integer, Character> LETTER_FOLD = letterFold();

   private n() {
   }

   public static boolean isActive() {
      x var0 = x.INSTANCE;
      return var0.fakeName.qo() && !var0.fakeNameText.isBlank();
   }

   public static String getName() {
      return x.INSTANCE.fakeNameText.trim();
   }

   public static String getRealName() {
      LocalPlayer var0 = Minecraft.getInstance().player;
      if (var0 != null) {
         String var1 = var0.getGameProfile().name();
         if (var1 != null && !var1.isBlank()) {
            return var1;
         }
      }

      User var2 = Minecraft.getInstance().getUser();
      return var2 == null ? "" : var2.getName();
   }

   public static Component getComponent() {
      return Component.literal(getName());
   }

   public static boolean appliesTo(Player var0) {
      return var0 != null && appliesTo(var0.getUUID());
   }

   public static boolean appliesTo(UUID var0) {
      Minecraft var1 = Minecraft.getInstance();
      return isActive() && var1.player != null && var0 != null && var1.player.getUUID().equals(var0);
   }

   public static boolean appliesToScoreboardOwner(String var0) {
      LocalPlayer var1 = Minecraft.getInstance().player;
      if (isActive() && var1 != null && var0 != null && !var0.isEmpty()) {
         String var2 = var1.getGameProfile().name();
         String var3 = foldLetters(var0);
         String var4 = foldLetters(var2);
         return var0.equals(var1.getScoreboardName())
            || var0.equals(var2)
            || var0.equalsIgnoreCase(var2)
            || var3.equals(var4)
            || var3.equals(foldLetters(var1.getScoreboardName()))
            || var0.equals(var1.getStringUUID());
      } else {
         return false;
      }
   }

   public static boolean containsRealName(Component var0) {
      return isActive() && var0 != null ? containsRealName(var0.getString()) : false;
   }

   public static boolean containsRealName(String var0) {
      if (isActive() && var0 != null && !var0.isEmpty()) {
         String var1 = getRealName();
         return !var1.isEmpty() && !findNameMatches(var0, var1).isEmpty();
      } else {
         return false;
      }
   }

   public static Component rewrite(Component var0) {
      if (isActive() && var0 != null) {
         String var1 = getRealName();
         String var2 = getName();
         if (!var1.isEmpty() && !var2.isEmpty() && !var1.equalsIgnoreCase(var2)) {
            Component var3 = replaceAcrossRuns(var0, var1, var2);
            if (var3 != var0) {
               return var3;
            } else {
               String var4 = var0.getString();
               return (Component)(findNameMatches(var4, var1).isEmpty() ? var0 : Component.literal(replaceInString(var4, var1, var2)).setStyle(var0.getStyle()));
            }
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   public static String rewrite(String var0) {
      if (isActive() && var0 != null && !var0.isEmpty()) {
         String var1 = getRealName();
         String var2 = getName();
         return !var1.isEmpty() && !var2.isEmpty() && !var1.equalsIgnoreCase(var2) ? replaceInString(var0, var1, var2) : var0;
      } else {
         return var0;
      }
   }

   public static Component rewriteSidebarLine(Component var0, String var1) {
      if (!isActive()) {
         return var0;
      } else if (var0 == null) {
         return appliesToScoreboardOwner(var1) ? getComponent() : null;
      } else {
         Component var2 = rewrite(var0);
         if (var2 != var0) {
            return var2;
         } else {
            return (Component)(!appliesToScoreboardOwner(var1) && !isNameOnlyLine(var0.getString())
               ? var0
               : Component.literal(getName()).setStyle(var0.getStyle()));
         }
      }
   }

   public static Component rewriteOwnDisplay(Component var0) {
      if (!isActive()) {
         return var0;
      } else if (var0 == null) {
         return getComponent();
      } else {
         Component var1 = rewrite(var0);
         if (var1 != var0) {
            return var1;
         } else {
            String var2 = getName();
            String var3 = var0.getString();
            if (!var2.isEmpty() && !findNameMatches(var3, var2).isEmpty()) {
               return var0;
            } else {
               return (Component)(!containsRealName(var3) && !isNameOnlyLine(var3)
                  ? getComponent()
                  : Component.literal(replaceInString(var3, getRealName(), var2)).setStyle(var0.getStyle()));
            }
         }
      }
   }

   public static MutableComponent replaceRealName(Component var0) {
      Component var1 = rewrite(var0);
      if (var1 instanceof MutableComponent var2) {
         return var2;
      } else {
         return var1 == null ? Component.empty() : var1.copy();
      }
   }

   private static boolean isNameOnlyLine(String var0) {
      String var1 = foldLetters(getRealName());
      return var1.isEmpty() ? false : foldLetters(var0).trim().equals(var1);
   }

   private static Component replaceAcrossRuns(Component var0, String var1, String var2) {
      ArrayList var3 = new ArrayList();
      var0.visit((var1x, var2x) -> {
         if (var2x != null && !var2x.isEmpty()) {
            var3.add(new n$b(var1x, var2x));
         }

         return Optional.empty();
      }, Style.EMPTY);
      if (var3.isEmpty()) {
         return var0;
      } else {
         StringBuilder var4 = new StringBuilder();
         int[] var5 = new int[var3.size()];

         for (int var6 = 0; var6 < var3.size(); var6++) {
            var5[var6] = var4.length();
            var4.append(((n$b)var3.get(var6)).text());
         }

         String var16 = var4.toString();
         List var7 = findNameMatches(var16, var1);
         if (var7.isEmpty()) {
            return var0;
         } else {
            MutableComponent var8 = Component.empty().setStyle(var0.getStyle());
            int var9 = 0;
            int var10 = 0;

            while (var9 < var16.length()) {
               if (var10 < var7.size() && var9 == ((int[])var7.get(var10))[0]) {
                  int var17 = runIndexAt(var5, var9);
                  Style var18 = var17 >= 0 ? ((n$b)var3.get(var17)).style() : var0.getStyle();
                  var8.append(Component.literal(var2).setStyle(var18));
                  var9 = ((int[])var7.get(var10))[1];
                  var10++;
               } else {
                  int var11 = var10 < var7.size() ? ((int[])var7.get(var10))[0] : var16.length();

                  while (var9 < var11) {
                     int var12 = runIndexAt(var5, var9);
                     n$b var13 = (n$b)var3.get(var12);
                     int var14 = var5[var12] + var13.text().length();
                     int var15 = Math.min(var11, var14);
                     var8.append(Component.literal(var13.text().substring(var9 - var5[var12], var15 - var5[var12])).setStyle(var13.style()));
                     var9 = var15;
                  }
               }
            }

            return var8;
         }
      }
   }

   private static String replaceInString(String var0, String var1, String var2) {
      List<int[]> var3 = findNameMatches(var0, var1);
      if (var3.isEmpty()) {
         return var0;
      } else {
         StringBuilder var4 = new StringBuilder();
         int var5 = 0;

         for (int[] var7 : var3) {
            var4.append(var0, var5, var7[0]);
            var4.append(var2);
            var5 = var7[1];
         }

         var4.append(var0, var5, var0.length());
         return var4.toString();
      }
   }

   private static List<int[]> findNameMatches(String var0, String var1) {
      ArrayList var2 = new ArrayList();
      if (var0 != null && !var0.isEmpty() && var1 != null && !var1.isEmpty()) {
         n$a var3 = foldMapped(var0);
         String var4 = foldLetters(var1);
         if (!var4.isEmpty() && var3.text().length() >= var4.length()) {
            int var5 = 0;

            while (var5 <= var3.text().length() - var4.length()) {
               int var6 = indexOfFolded(var3.text(), var4, var5);
               if (var6 < 0) {
                  break;
               }

               int var7 = var3.origStart()[var6];
               int var8 = var3.origEnd()[var6 + var4.length() - 1];
               var2.add(new int[]{var7, var8});
               var5 = var6 + Math.max(1, var4.length());
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   private static int indexOfFolded(String var0, String var1, int var2) {
      for (int var4 = var2; var4 >= 0 && var4 <= var0.length() - var1.length(); var4++) {
         var4 = var0.indexOf(var1, var4);
         if (var4 < 0) {
            return -1;
         }

         if (isNameBoundary(var0, var4, var4 + var1.length())) {
            return var4;
         }
      }

      return -1;
   }

   private static boolean isNameBoundary(String var0, int var1, int var2) {
      return var1 > 0 && isNameChar(var0.charAt(var1 - 1)) ? false : var2 >= var0.length() || !isNameChar(var0.charAt(var2));
   }

   private static boolean isNameChar(char var0) {
      return var0 == '_' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z';
   }

   private static int runIndexAt(int[] var0, int var1) {
      for (int var2 = var0.length - 1; var2 >= 0; var2--) {
         if (var1 >= var0[var2]) {
            return var2;
         }
      }

      return 0;
   }

   private static String foldLetters(String var0) {
      return foldMapped(var0).text();
   }

   private static n$a foldMapped(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         StringBuilder var1 = new StringBuilder(var0.length());
         ArrayList var2 = new ArrayList(var0.length());
         ArrayList var3 = new ArrayList(var0.length());
         int var4 = 0;

         while (var4 < var0.length()) {
            char var5 = var0.charAt(var4);
            if (var5 == 167 && var4 + 1 < var0.length()) {
               var4 += 2;
            } else {
               int var6 = var0.codePointAt(var4);
               int var7 = var4 + Character.charCount(var6);
               if (isIgnored(var6)) {
                  var4 = var7;
               } else {
                  String var8 = foldCodePoint(var6);

                  for (int var9 = 0; var9 < var8.length(); var9++) {
                     var1.append(var8.charAt(var9));
                     var2.add(var4);
                     var3.add(var7);
                  }

                  var4 = var7;
               }
            }
         }

         int[] var10 = new int[var2.size()];
         int[] var11 = new int[var3.size()];

         for (int var12 = 0; var12 < var2.size(); var12++) {
            var10[var12] = (Integer)var2.get(var12);
            var11[var12] = (Integer)var3.get(var12);
         }

         return new n$a(var1.toString(), var10, var11);
      } else {
         return new n$a("", new int[0], new int[0]);
      }
   }

   private static String foldCodePoint(int var0) {
      if (var0 >= 65 && var0 <= 90) {
         return String.valueOf((char)(97 + (var0 - 65)));
      } else if ((var0 < 97 || var0 > 122) && (var0 < 48 || var0 > 57) && var0 != 95) {
         if (var0 >= 65313 && var0 <= 65338) {
            return String.valueOf((char)(97 + (var0 - 65313)));
         } else if (var0 >= 65345 && var0 <= 65370) {
            return String.valueOf((char)(97 + (var0 - 65345)));
         } else {
            int var1 = foldMathLatin(var0);
            if (var1 >= 0) {
               return String.valueOf((char)var1);
            } else {
               Character var2 = LETTER_FOLD.get(var0);
               if (var2 != null) {
                  return String.valueOf(var2);
               } else {
                  String var3 = Normalizer.normalize(Character.toString(var0), Form.NFKC);
                  if (!var3.isEmpty() && var3.codePointCount(0, var3.length()) == 1) {
                     int var4 = var3.codePointAt(0);
                     if (var4 != var0) {
                        return foldCodePoint(var4);
                     }

                     if (var4 >= 65 && var4 <= 90) {
                        return String.valueOf((char)(97 + (var4 - 65)));
                     }

                     if (var4 >= 97 && var4 <= 122 || var4 >= 48 && var4 <= 57 || var4 == 95) {
                        return String.valueOf((char)var4);
                     }
                  }

                  int var5 = Character.toLowerCase(var0);
                  return var5 >= 97 && var5 <= 122 ? String.valueOf((char)var5) : Character.toString(var0);
               }
            }
         }
      } else {
         return String.valueOf((char)var0);
      }
   }

   private static int foldMathLatin(int var0) {
      if (var0 >= 120782 && var0 <= 120831) {
         return 48 + (var0 - 120782) % 10;
      } else {
         int[] var1 = new int[]{119808, 119860, 119912, 119964, 120016, 120068, 120120, 120172, 120224, 120276, 120328, 120380, 120432};

         for (int var5 : var1) {
            if (var0 >= var5 && var0 < var5 + 26) {
               return 97 + (var0 - var5);
            }

            if (var0 >= var5 + 26 && var0 < var5 + 52) {
               return 97 + (var0 - var5 - 26);
            }
         }

         return -1;
      }
   }

   private static boolean isIgnored(int var0) {
      return var0 == 160 || var0 == 8203 || var0 == 8204 || var0 == 8205 || var0 == 8288 || var0 == 65279 || var0 == 6158 || Character.getType(var0) == 16;
   }

   private static Map<Integer, Character> letterFold() {
      HashMap var0 = new HashMap();
      int[] var1 = new int[]{
         7424,
         665,
         7428,
         7429,
         7431,
         42800,
         610,
         668,
         618,
         7434,
         7435,
         671,
         7437,
         628,
         7439,
         7448,
         491,
         42927,
         640,
         42801,
         7451,
         7452,
         7456,
         7457,
         655,
         7458,
         7468,
         7473,
         7477,
         7482,
         7487,
         7488,
         7489,
         7490,
         577,
         640,
         1072,
         1077,
         1086,
         1088,
         1089,
         1091,
         1093,
         1040,
         1045,
         1054,
         1056,
         1057,
         1059,
         1061
      };
      char[] var2 = new char[]{
         'a',
         'b',
         'c',
         'd',
         'e',
         'f',
         'g',
         'h',
         'i',
         'j',
         'k',
         'l',
         'm',
         'n',
         'o',
         'p',
         'q',
         'q',
         'r',
         's',
         't',
         'u',
         'v',
         'w',
         'y',
         'z',
         'a',
         'e',
         'i',
         'n',
         't',
         'u',
         'v',
         'w',
         '?',
         'r',
         'a',
         'e',
         'o',
         'p',
         'c',
         'y',
         'x',
         'a',
         'e',
         'o',
         'p',
         'c',
         'y',
         'x'
      };

      for (int var3 = 0; var3 < var1.length && var3 < var2.length; var3++) {
         if (var2[var3] != '?') {
            var0.put(var1[var3], var2[var3]);
         }
      }

      return var0;
   }
}
