package com.wimpyclient.i;

import com.wimpyclient.auth.LicenseGate;
import com.wimpyclient.n.b$a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.protocol.game.ServerboundCommandSuggestionPacket;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameType;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.scores.PlayerTeam;

@Environment(EnvType.CLIENT)
public final class af {
   public static final af INSTANCE = new af();
   private static final long SIGNAL_WINDOW_MS = 15000L;
   private static final long ALERT_COOLDOWN_MS = 12000L;
   private static final long CRITICAL_COOLDOWN_MS = 12000L;
   private static final long PENDING_VANISH_MS = 900L;
   private static final long RECENT_MESSAGE_TTL_MS = 8000L;
   private static final long KNOWN_STAFF_TTL_MS = 180000L;
   private static final long TRUSTED_LISTED_MS = 1500L;
   private static final String PROBE_COMMAND = "minecraft:msg ";
   private static final int CRITICAL_SCORE = 35;
   private static final int MAX_SIGNALS = 64;
   private final ConcurrentLinkedQueue<af$i> worldCues = new ConcurrentLinkedQueue<>();
   private final ConcurrentLinkedQueue<af$c> packetCues = new ConcurrentLinkedQueue<>();
   private final Map<UUID, af$b> knownPlayers = new HashMap<>();
   private final Map<UUID, af$a> knownStaff = new HashMap<>();
   private final Map<UUID, double[]> lastPos = new HashMap<>();
   private final Map<UUID, Long> listedSinceMs = new HashMap<>();
   private final Map<UUID, GameType> prevGameModes = new HashMap<>();
   private final Set<UUID> prevListed = new HashSet<>();
   private final Set<UUID> prevOnline = new HashSet<>();
   private final Deque<af$d> pendingVanishes = new ArrayDeque<>();
   private final Deque<af$f> signals = new ArrayDeque<>();
   private final Deque<af$e> recentMessages = new ArrayDeque<>();
   private final Map<UUID, Long> alertedUntil = new HashMap<>();
   private final Map<String, Long> announceCooldown = new HashMap<>();
   private final Set<Integer> completionRequestIds = ConcurrentHashMap.newKeySet();
   private volatile List<String> pendingCompletionNames;
   private int nextCompletionId = 30000;
   private boolean serverSendsLeaveMessages;
   private boolean haveSnapshot;
   private long lastCriticalMs;
   private int tickCounter;

   private af() {
   }

   public void reset() {
      this.worldCues.clear();
      this.packetCues.clear();
      this.knownPlayers.clear();
      this.knownStaff.clear();
      this.lastPos.clear();
      this.listedSinceMs.clear();
      this.prevGameModes.clear();
      this.prevListed.clear();
      this.prevOnline.clear();
      this.pendingVanishes.clear();
      this.signals.clear();
      this.recentMessages.clear();
      this.alertedUntil.clear();
      this.announceCooldown.clear();
      this.completionRequestIds.clear();
      this.pendingCompletionNames = null;
      this.serverSendsLeaveMessages = false;
      this.haveSnapshot = false;
      this.lastCriticalMs = 0L;
      this.tickCounter = 0;
      com.wimpyclient.k.y.reset();
   }

   public void onPlayerInfoRemove(List<UUID> var1) {
      if (var1 != null && !var1.isEmpty() && var1.size() < 4) {
         if (x.INSTANCE.antiVanish.qo()) {
            for (UUID var3 : var1) {
               if (var3 != null) {
                  this.packetCues.offer(af$c.remove(var3));
               }
            }
         }
      }
   }

   public void onPlayerInfoUnlisted(List<UUID> var1) {
      if (var1 != null && !var1.isEmpty() && var1.size() < 4) {
         if (x.INSTANCE.antiVanish.qo()) {
            for (UUID var3 : var1) {
               if (var3 != null) {
                  this.packetCues.offer(af$c.hide(var3));
               }
            }
         }
      }
   }

   public boolean onCommandSuggestions(int var1, List<String> var2) {
      if (!this.completionRequestIds.remove(var1)) {
         return false;
      } else {
         ArrayList var3 = new ArrayList();
         if (var2 != null) {
            for (String var5 : var2) {
               if (var5 != null && !var5.isBlank()) {
                  var3.add(var5.trim());
               }
            }
         }

         this.pendingCompletionNames = var3;
         return true;
      }
   }

   public void onPositionalSound(double var1, double var3, double var5, Holder<SoundEvent> var7, SoundSource var8) {
      if (var7 != null) {
         this.onPositionalSound(var1, var3, var5, (SoundEvent)var7.value(), var8);
      }
   }

   public void onPositionalSound(double var1, double var3, double var5, SoundEvent var7, SoundSource var8) {
      if (var7 != null && x.INSTANCE.antiVanish.qo()) {
         if (x.INSTANCE.antiVanishWorldSensors) {
            String var9 = var7.location().toString();
            if (com.wimpyclient.t.a.suspiciousSound(var9)) {
               this.worldCues.offer(af$i.sound(var1, var3, var5, var9));
            }
         }
      }
   }

   public void onLevelEvent(int var1, BlockPos var2, int var3) {
      if (x.INSTANCE.antiVanish.qo() && x.INSTANCE.antiVanishWorldSensors) {
         if (var1 == 2001) {
            this.worldCues.offer(af$i.particle(var2.getX() + 0.5, var2.getY() + 0.5, var2.getZ() + 0.5, "block"));
         }
      }
   }

   public void onChatMessage(Component var1) {
      if (var1 != null && x.INSTANCE.antiVanish.qo()) {
         String var2 = var1.getString();
         if (var2 != null && !var2.isBlank()) {
            long var3 = System.currentTimeMillis();
            this.recentMessages.addLast(new af$e(var2, var3));

            while (this.recentMessages.size() > 32) {
               this.recentMessages.removeFirst();
            }

            for (af$b var6 : this.knownPlayers.values()) {
               if (looksLikeLeaveMessage(var2, var6.name())) {
                  this.serverSendsLeaveMessages = true;
                  this.confirmDeparture(var6.uuid());
                  break;
               }
            }
         }
      }
   }

   public void tick(Minecraft var1) {
      if (LicenseGate.isAuthorized()) {
         x var2 = x.INSTANCE;
         if (!var2.antiVanish.qo()) {
            this.reset();
         } else {
            LocalPlayer var3 = var1.player;
            ClientLevel var4 = var1.level;
            ClientPacketListener var5 = var1.getConnection();
            if (var3 != null && var4 != null && var5 != null) {
               this.tickCounter++;
               long var6 = System.currentTimeMillis();
               this.prune(var6);
               double var8 = Math.max(8, var2.antiVanishRange);
               double var10 = var8 * var8;
               b$a var12 = var2.staffDetectConfig();
               HashSet var13 = new HashSet();

               for (PlayerInfo var15 : var5.getListedOnlinePlayers()) {
                  if (var15 != null && var15.getProfile() != null) {
                     UUID var16 = var15.getProfile().id();
                     var13.add(var16);
                     this.listedSinceMs.putIfAbsent(var16, var6);
                  }
               }

               HashMap var25 = new HashMap();

               for (PlayerInfo var28 : var5.getOnlinePlayers()) {
                  if (var28 != null && var28.getProfile() != null) {
                     UUID var17 = var28.getProfile().id();
                     var25.put(var17, var28);
                     String var18 = var28.getProfile().name();
                     if (var18 != null && !var18.isBlank()) {
                        this.knownPlayers.put(var17, new af$b(var17, var18));
                     }
                  }
               }

               if (this.tickCounter % 100 == 0) {
                  this.sendCompletionProbe(var5);
               }

               this.processCompletionProbe(var3, var2, var12, var6);
               this.drainPacketCues(var3, var2, var12, var6);
               this.listedSinceMs.entrySet().removeIf(var2x -> !var25.containsKey(var2x.getKey()) && !this.knownStaff.containsKey(var2x.getKey()));
               HashMap var27 = new HashMap();

               for (AbstractClientPlayer var35 : var4.players()) {
                  if (var35 != var3 && !(var35 instanceof LocalPlayer) && !(var35 instanceof p)) {
                     UUID var41 = var35.getUUID();
                     this.lastPos.put(var41, new double[]{var35.getX(), var35.getY(), var35.getZ()});
                     if (var3.distanceToSqr(var35) <= var10) {
                        var27.put(var41, var35);
                     }
                  }
               }

               for (Entry var36 : ((Map<UUID, PlayerInfo>)var25).entrySet()) {
                  UUID var42 = (UUID)var36.getKey();
                  if (!var42.equals(var3.getUUID())) {
                     PlayerInfo var19 = (PlayerInfo)var36.getValue();
                     String var20 = nameOf(var19, var42);
                     boolean var21 = !var13.contains(var42) || var19.getGameMode() == GameType.SPECTATOR;
                     com.wimpyclient.n.c var22 = staffOf(var19, var20, var21, var12);
                     if (var22 != null) {
                        this.rememberStaff(var42, var22, var6);
                     }
                  }
               }

               this.pruneKnownStaff(var6, var25.keySet());
               if (this.haveSnapshot) {
                  for (UUID var37 : this.prevListed) {
                     if (!var13.contains(var37) && var25.containsKey(var37) && !var37.equals(var3.getUUID())) {
                        AbstractClientPlayer var43 = (AbstractClientPlayer)var27.get(var37);
                        if (var43 != null) {
                           PlayerInfo var46 = (PlayerInfo)var25.get(var37);
                           String var49 = nameOf(var46, var37);
                           if (this.credible(var37, var49, var2, var12, true) && this.trustedListed(var37) && !this.recentMessageNames(var49)) {
                              this.addSignal(af$g.VANISH, var49, var37, "hidden from tab, still nearby", 100, var6);
                              this.announce(
                                 var3,
                                 var37,
                                 var49,
                                 var3.distanceTo(var43),
                                 this.resolveStaff(var37, var46, var49, true, var12),
                                 "hidden from tab, still nearby",
                                 var2,
                                 var6,
                                 true
                              );
                           }
                        }
                     }
                  }

                  for (UUID var38 : this.prevOnline) {
                     if (!var25.containsKey(var38) && !var38.equals(var3.getUUID())) {
                        af$b var44 = this.knownPlayers.get(var38);
                        String var47 = var44 != null ? var44.name() : null;
                        if ((var47 == null || var47.isBlank()) && this.knownStaff.containsKey(var38)) {
                           var47 = this.knownStaff.get(var38).name();
                        }

                        if (var47 != null && !var47.isBlank() && this.credible(var38, var47, var2, var12, true)) {
                           if (this.recentMessageNames(var47)) {
                              this.confirmDeparture(var38);
                           } else {
                              this.pendingVanishes.addLast(new af$d(var38, var47, var6 + 900L));
                           }
                        }
                     }
                  }

                  for (Entry var39 : ((Map<UUID, PlayerInfo>)var25).entrySet()) {
                     UUID var45 = (UUID)var39.getKey();
                     if (!var45.equals(var3.getUUID())) {
                        GameType var48 = this.prevGameModes.get(var45);
                        GameType var50 = ((PlayerInfo)var39.getValue()).getGameMode();
                        if (var48 != null && var48 != GameType.SPECTATOR && var50 == GameType.SPECTATOR) {
                           String var51 = nameOf((PlayerInfo)var39.getValue(), var45);
                           if (this.credible(var45, var51, var2, var12, true) && this.trustedListed(var45)) {
                              boolean var52 = !var13.contains(var45);
                              AbstractClientPlayer var23 = (AbstractClientPlayer)var27.get(var45);
                              boolean var24 = var23 != null && var23.isInvisible();
                              if (var52 || var24) {
                                 this.addSignal(af$g.VANISH, var51, var45, "switched to spectator", 90, var6);
                                 this.announce(
                                    var3,
                                    var45,
                                    var51,
                                    nearbyDistance(var3, var23),
                                    this.resolveStaff(var45, (PlayerInfo)var39.getValue(), var51, true, var12),
                                    "switched to spectator",
                                    var2,
                                    var6,
                                    true
                                 );
                              }
                           }
                        }
                     }
                  }
               }

               this.processPendingVanishes(var3, var27, var25.keySet(), var13, var2, var12, var6);
               this.drainWorldCues(var3, var4, var27, var13, var25, var2, var12, var10, var6);
               this.scanInvisible(var3, var27, var13, var25, var2, var12, var6);
               this.evaluateCritical(var3, var2, var6);
               this.prevListed.clear();
               this.prevListed.addAll(var13);
               this.prevOnline.clear();
               this.prevOnline.addAll(var25.keySet());
               this.prevGameModes.clear();

               for (Entry var40 : ((Map<UUID, PlayerInfo>)var25).entrySet()) {
                  this.prevGameModes.put((UUID)var40.getKey(), ((PlayerInfo)var40.getValue()).getGameMode());
               }

               this.haveSnapshot = true;
            } else {
               this.reset();
            }
         }
      }
   }

   private void processPendingVanishes(LocalPlayer var1, Map<UUID, AbstractClientPlayer> var2, Set<UUID> var3, Set<UUID> var4, x var5, b$a var6, long var7) {
      Iterator var9 = this.pendingVanishes.iterator();

      while (var9.hasNext()) {
         af$d var10 = (af$d)var9.next();
         if (var7 >= var10.dueMs()) {
            var9.remove();
            if (!this.recentMessageNames(var10.name())) {
               boolean var11 = var3.contains(var10.uuid());
               boolean var12 = var4.contains(var10.uuid());
               if (!var11 || !var12) {
                  com.wimpyclient.n.c var13 = this.resolveStaff(var10.uuid(), null, var10.name(), true, var6);
                  AbstractClientPlayer var14 = (AbstractClientPlayer)var2.get(var10.uuid());
                  if (var11 && !var12) {
                     this.addSignal(af$g.VANISH, var10.name(), var10.uuid(), "hidden from tab", 100, var7);
                     this.announce(var1, var10.uuid(), var10.name(), nearbyDistance(var1, var14), var13, "hidden from tab", var5, var7, true);
                  } else if (var14 != null) {
                     this.addSignal(af$g.VANISH, var10.name(), var10.uuid(), "off tab, still nearby", 100, var7);
                     this.announce(var1, var10.uuid(), var10.name(), var1.distanceTo(var14), var13, "off tab, still nearby", var5, var7, true);
                  } else if (this.serverSendsLeaveMessages) {
                     this.addSignal(af$g.VANISH, var10.name(), var10.uuid(), "left tab silently", 100, var7);
                     this.announce(var1, var10.uuid(), var10.name(), this.distanceFromLastPos(var1, var10.uuid()), var13, "left tab silently", var5, var7, true);
                  }
               }
            }
         }
      }
   }

   private void drainWorldCues(
      LocalPlayer var1,
      ClientLevel var2,
      Map<UUID, AbstractClientPlayer> var3,
      Set<UUID> var4,
      Map<UUID, PlayerInfo> var5,
      x var6,
      b$a var7,
      double var8,
      long var10
   ) {
      int var13 = 64;

      af$i var12;
      while (var13-- > 0 && (var12 = this.worldCues.poll()) != null) {
         if (!(var1.distanceToSqr(var12.x(), var12.y(), var12.z()) > var8)
            && !hasVisibleCause(var2, var1, var12.x(), var12.y(), var12.z())
            && (var12.sound() || !isAmbientSmokeSource(var2, var12.x(), var12.y(), var12.z()))) {
            af$h var14 = this.locateSubject(var3, var6, var7, var12.x(), var12.y(), var12.z());
            if (var14.staff() == null && var14.name() == null) {
               com.wimpyclient.n.c var15 = this.nearestSoftVanishedStaff(var1, var3, var7);
               if (var15 == null) {
                  var15 = this.nearestCachedVanishedStaff(var4, var5, var12.x(), var12.y(), var12.z(), 36.0);
               }

               if (var15 == null) {
                  continue;
               }

               var14 = new af$h(null, var15.name(), var15);
            }

            if (var6.antiVanishStaffOnly) {
               com.wimpyclient.n.c var16 = var14.staff() != null ? var14.staff() : this.resolveStaff(var14.id(), null, var14.name(), true, var7);
               if (var16 == null) {
                  continue;
               }

               var14 = new af$h(var14.id(), var14.name() != null ? var14.name() : var16.name(), var16);
            }

            String var17 = var14.name() != null ? var14.name() : "Unknown";
            if (var12.sound()) {
               this.addSignal(af$g.SOUND, var17, var14.id(), "suspicious sound", 18, var10);
            } else {
               this.addSignal(af$g.PARTICLE, var17, var14.id(), "ghost particle", 12, var10);
            }
         }
      }
   }

   private void scanInvisible(LocalPlayer var1, Map<UUID, AbstractClientPlayer> var2, Set<UUID> var3, Map<UUID, PlayerInfo> var4, x var5, b$a var6, long var7) {
      for (Entry var10 : var2.entrySet()) {
         UUID var11 = (UUID)var10.getKey();
         AbstractClientPlayer var12 = (AbstractClientPlayer)var10.getValue();
         PlayerInfo var13 = (PlayerInfo)var4.get(var11);
         boolean var14 = var13 == null || !var3.contains(var11);
         boolean var15 = var13 != null && var13.getGameMode() == GameType.SPECTATOR;
         boolean var16 = var12.isInvisible();
         if (var14 || var15 || var16) {
            String var17 = var13 != null ? nameOf(var13, var11) : var12.getGameProfile().name();
            if (var17 == null || var17.isBlank()) {
               var17 = var12.getName().getString();
            }

            if (var14 || var15 || var13 == null) {
               boolean var18 = var14 || var15 || var13 == null;
               if (this.credible(var11, var17, var5, var6, var18)) {
                  com.wimpyclient.n.c var19 = this.resolveStaff(var11, var13, var17, var18, var6);
                  if (var13 == null) {
                     this.addSignal(af$g.VANISH, var17, var11, "entity without tab entry", 90, var7);
                     this.announce(var1, var11, var17, var1.distanceTo(var12), var19, "entity without tab entry", var5, var7, true);
                  } else if (!var16 || !var14 && !var15) {
                     if (var14 || var15) {
                        String var21 = var15 && var14 ? "spectator + hidden from tab" : (var15 ? "spectator" : "hidden from tab");
                        this.addSignal(af$g.VANISH, var17, var11, var21, 70, var7);
                        this.announce(var1, var11, var17, var1.distanceTo(var12), var19, var21, var5, var7, true);
                     }
                  } else {
                     this.addSignal(af$g.INVISIBLE, var17, var11, "invisible vanished body", 40, var7);
                     String var20 = var15 && var14 ? "spectator + hidden from tab, invisible" : (var15 ? "spectator, invisible" : "hidden from tab, invisible");
                     this.announce(var1, var11, var17, var1.distanceTo(var12), var19, var20, var5, var7, true);
                  }
               }
            }
         }
      }
   }

   private void evaluateCritical(LocalPlayer var1, x var2, long var3) {
      if (var2.antiVanishHeadPopup) {
         if (var3 - this.lastCriticalMs >= 12000L) {
            HashMap var5 = new HashMap();
            HashMap var6 = new HashMap();

            for (af$f var8 : this.signals) {
               if (var3 - var8.timeMs() <= 15000L) {
                  String var9 = var8.subject().toLowerCase(Locale.ROOT);
                  ((Map<String, Integer>)var5).merge(var9, var8.weight(), Integer::sum);
                  if (var8.id() != null) {
                     var6.put(var9, var8.id());
                  }
               }
            }

            String var15 = null;
            int var16 = 0;

            for (Entry var10 : ((Map<String, Integer>)var5).entrySet()) {
               if ((Integer)var10.getValue() > var16) {
                  var16 = (Integer)var10.getValue();
                  var15 = (String)var10.getKey();
               }
            }

            if (var15 != null && var16 >= 35) {
               String var18 = var15;

               for (af$f var11 : this.signals) {
                  if (var11.subject().equalsIgnoreCase(var15)) {
                     var18 = var11.subject();
                     break;
                  }
               }

               UUID var20 = (UUID)var6.get(var15);
               int var21 = -1;
               if (var20 != null && var1.level() instanceof ClientLevel var12) {
                  for (AbstractClientPlayer var14 : var12.players()) {
                     if (var14.getUUID().equals(var20)) {
                        var21 = Math.round(var1.distanceTo(var14));
                        break;
                     }
                  }
               }

               this.lastCriticalMs = var3;
               com.wimpyclient.k.y.show(var20, var18, var21);
               if (var2.antiVanishSound) {
                  com.wimpyclient.p.f.playUi((SoundEvent)SoundEvents.NOTE_BLOCK_BELL.value(), 1.55F, 0.55F);
               }
            }
         }
      }
   }

   private void addSignal(af$g var1, String var2, UUID var3, String var4, int var5, long var6) {
      if (var2 != null && !var2.isBlank() && var5 > 0) {
         this.signals.addLast(new af$f(var1, var2, var3, var4, var5, var6));

         while (this.signals.size() > 64) {
            this.signals.removeFirst();
         }
      }
   }

   private void announce(LocalPlayer var1, UUID var2, String var3, double var4, com.wimpyclient.n.c var6, String var7, x var8, long var9, boolean var11) {
      if (var3 != null && !var3.isBlank()) {
         String var12 = (var2 != null ? var2.toString() : var3.toLowerCase(Locale.ROOT)) + "|" + var7;
         Long var13 = this.announceCooldown.get(var12);
         if (var13 == null || var13 <= var9) {
            if (var2 != null) {
               Long var14 = this.alertedUntil.get(var2);
               if (var14 != null && var14 > var9 && !var11) {
                  return;
               }

               this.alertedUntil.put(var2, var9 + 12000L);
            }

            this.announceCooldown.put(var12, var9 + (var11 ? 12000L : 6000L));
            String var18 = var6 != null && !var6.rankLabel().isEmpty() ? var3 + " [" + var6.rankLabel() + "]" : var3;
            String var15 = var4 >= 0.0 ? String.format(Locale.ROOT, " (%.0fm)", var4) : "";
            MutableComponent var16 = Component.literal("[Anti Vanish] " + var18 + var15 + " \u2014 " + var7);
            String var17 = var8.antiVanishAlerts;
            if ("Chat".equals(var17)) {
               var1.displayClientMessage(var16, false);
            } else if (!"Off".equals(var17)) {
               var1.displayClientMessage(var16, true);
            }

            if (var8.antiVanishSound && var11) {
               com.wimpyclient.p.f.playUi((SoundEvent)SoundEvents.NOTE_BLOCK_BELL.value(), 1.35F, 0.7F);
            }
         }
      }
   }

   private void confirmDeparture(UUID var1) {
      this.pendingVanishes.removeIf(var1x -> var1x.uuid().equals(var1));
      this.signals.removeIf(var1x -> var1.equals(var1x.id()));
   }

   private void prune(long var1) {
      this.alertedUntil.entrySet().removeIf(var2 -> var2.getValue() <= var1);
      this.announceCooldown.entrySet().removeIf(var2 -> var2.getValue() <= var1);

      while (!this.signals.isEmpty() && var1 - this.signals.peekFirst().timeMs() > 15000L) {
         this.signals.removeFirst();
      }

      while (!this.recentMessages.isEmpty() && var1 - this.recentMessages.peekFirst().timeMs() > 8000L) {
         this.recentMessages.removeFirst();
      }

      this.pendingVanishes.removeIf(var2 -> var1 - var2.dueMs() > 5000L);
      if (this.tickCounter % 200 == 0 && this.knownPlayers.size() > 256) {
         this.knownPlayers.keySet().retainAll(this.prevOnline);
      }
   }

   private boolean credible(UUID var1, String var2, x var3, b$a var4, boolean var5) {
      if (var2 == null || var2.isBlank() || !isPlausibleName(var2)) {
         return false;
      } else if (!var3.antiVanishStaffOnly) {
         return true;
      } else if (com.wimpyclient.n.a.contains(var2)) {
         return true;
      } else if (var4.names().contains(var2.toLowerCase(Locale.ROOT))) {
         return true;
      } else {
         return var1 != null && this.knownStaff.containsKey(var1) ? true : classifyName(var2, var5, var4) != null;
      }
   }

   private boolean trustedListed(UUID var1) {
      Long var2 = var1 == null ? null : this.listedSinceMs.get(var1);
      return var2 != null && System.currentTimeMillis() - var2 >= 1500L;
   }

   private void drainPacketCues(LocalPlayer var1, x var2, b$a var3, long var4) {
      int var7 = 32;

      af$c var6;
      while (var7-- > 0 && (var6 = this.packetCues.poll()) != null) {
         UUID var8 = var6.id();
         if (var8 != null && !var8.equals(var1.getUUID())) {
            String var9 = nameOf(null, var8);
            if (var9 != null && !var9.isBlank() && this.credible(var8, var9, var2, var3, true) && this.trustedListed(var8)) {
               if (var6.hide()) {
                  if (!this.recentMessageNames(var9)) {
                     this.pendingVanishes.removeIf(var1x -> var1x.uuid().equals(var1));
                     this.pendingVanishes.addLast(new af$d(var8, var9, var4 + 900L));
                  }
               } else {
                  this.pendingVanishes.removeIf(var1x -> var1x.uuid().equals(var1));
                  this.pendingVanishes.addLast(new af$d(var8, var9, var4 + 900L));
               }
            }
         }
      }
   }

   private void sendCompletionProbe(ClientPacketListener var1) {
      if (var1 != null) {
         int var2 = this.nextCompletionId++;
         if (this.nextCompletionId > 40000) {
            this.nextCompletionId = 30000;
         }

         this.completionRequestIds.add(var2);

         while (this.completionRequestIds.size() > 8) {
            Integer var3 = this.completionRequestIds.iterator().next();
            this.completionRequestIds.remove(var3);
         }

         try {
            var1.send(new ServerboundCommandSuggestionPacket(var2, "minecraft:msg "));
         } catch (Throwable var4) {
         }
      }
   }

   private void processCompletionProbe(LocalPlayer var1, x var2, b$a var3, long var4) {
      List<String> var6 = this.pendingCompletionNames;
      if (var6 != null) {
         this.pendingCompletionNames = null;
         ClientPacketListener var7 = Minecraft.getInstance().getConnection();
         if (var7 != null) {
            HashSet var8 = new HashSet();

            for (PlayerInfo var10 : var7.getOnlinePlayers()) {
               if (var10 != null && var10.getProfile() != null && var10.getProfile().name() != null) {
                  var8.add(var10.getProfile().name().toLowerCase(Locale.ROOT));
               }
            }

            String var14 = var1.getGameProfile().name();
            ArrayList<String> var15 = new ArrayList<>();

            for (String var12 : var6) {
               if (isPlausibleName(var12)
                  && !var12.equalsIgnoreCase(var14)
                  && !var8.contains(var12.toLowerCase(Locale.ROOT))
                  && !this.recentMessageNames(var12)) {
                  UUID var13 = this.knownUuid(var12);
                  if (var13 != null && this.credible(var13, var12, var2, var3, true)) {
                     var15.add(var12);
                  }
               }
            }

            if (!var15.isEmpty() && var15.size() <= 3) {
               for (String var17 : var15) {
                  UUID var18 = this.knownUuid(var17);
                  this.addSignal(af$g.VANISH, var17, var18, "off tab, still targetable", 90, var4);
                  this.announce(
                     var1,
                     var18,
                     var17,
                     this.distanceFromLastPos(var1, var18),
                     this.resolveStaff(var18, null, var17, true, var3),
                     "off tab, still targetable",
                     var2,
                     var4,
                     true
                  );
               }
            }
         }
      }
   }

   private UUID knownUuid(String var1) {
      if (var1 == null) {
         return null;
      } else {
         for (af$b var3 : this.knownPlayers.values()) {
            if (var3.name().equalsIgnoreCase(var1)) {
               return var3.uuid();
            }
         }

         for (Entry var5 : this.knownStaff.entrySet()) {
            if (((af$a)var5.getValue()).name().equalsIgnoreCase(var1)) {
               return (UUID)var5.getKey();
            }
         }

         return null;
      }
   }

   private static boolean isPlausibleName(String var0) {
      if (var0.length() >= 3 && var0.length() <= 16) {
         for (int var1 = 0; var1 < var0.length(); var1++) {
            char var2 = var0.charAt(var1);
            if ((var2 < 'a' || var2 > 'z') && (var2 < 'A' || var2 > 'Z') && (var2 < '0' || var2 > '9') && var2 != '_') {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean recentMessageNames(String var1) {
      for (af$e var3 : this.recentMessages) {
         if (looksLikeLeaveMessage(var3.text(), var1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean looksLikeLeaveMessage(String var0, String var1) {
      if (var0 != null && var1 != null && !var1.isBlank()) {
         String var2 = var0.toLowerCase(Locale.ROOT);
         String var3 = var1.toLowerCase(Locale.ROOT);
         return !var2.contains(var3) ? false : var2.contains("left") || var2.contains("disconnected") || var2.contains("quit") || var2.contains("logged out");
      } else {
         return false;
      }
   }

   private static boolean hasVisibleCause(ClientLevel var0, LocalPlayer var1, double var2, double var4, double var6) {
      AABB var8 = new AABB(var2 - 2.5, var4 - 2.5, var6 - 2.5, var2 + 2.5, var4 + 2.5, var6 + 2.5);

      for (Player var10 : var0.getEntitiesOfClass(Player.class, var8)) {
         if (var10 != var1 && !(var10 instanceof LocalPlayer) && !(var10 instanceof p) && !var10.isInvisible()) {
            return true;
         }
      }

      return false;
   }

   private static boolean isAmbientSmokeSource(ClientLevel var0, double var1, double var3, double var5) {
      MutableBlockPos var7 = new MutableBlockPos();
      int var8 = MthFloor(var1);
      int var9 = MthFloor(var3);
      int var10 = MthFloor(var5);

      for (int var11 = -1; var11 <= 2; var11++) {
         for (int var12 = -1; var12 <= 1; var12++) {
            for (int var13 = -1; var13 <= 1; var13++) {
               Identifier var14 = BuiltInRegistries.BLOCK.getKey(var0.getBlockState(var7.set(var8 + var12, var9 + var11, var10 + var13)).getBlock());
               if (var14 != null) {
                  String var15 = var14.getPath();
                  if (var15.contains("campfire")
                     || var15.contains("furnace")
                     || var15.contains("smoker")
                     || var15.contains("fire")
                     || var15.contains("torch")
                     || var15.contains("candle")
                     || var15.contains("respawn_anchor")) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   private static int MthFloor(double var0) {
      int var2 = (int)var0;
      return var0 < var2 ? var2 - 1 : var2;
   }

   private af$h locateSubject(Map<UUID, AbstractClientPlayer> var1, x var2, b$a var3, double var4, double var6, double var8) {
      AbstractClientPlayer var10 = null;
      double var11 = Double.MAX_VALUE;

      for (AbstractClientPlayer var14 : var1.values()) {
         double var15 = var14.distanceToSqr(var4, var6, var8);
         if (var15 < var11 && var15 <= 36.0) {
            var11 = var15;
            var10 = var14;
         }
      }

      if (var10 == null) {
         return new af$h(null, null, null);
      } else {
         String var17 = var10.getGameProfile().name();
         com.wimpyclient.n.c var18 = this.resolveStaff(var10.getUUID(), null, var17, true, var3);
         return new af$h(var10.getUUID(), var17, var18);
      }
   }

   private com.wimpyclient.n.c nearestSoftVanishedStaff(LocalPlayer var1, Map<UUID, AbstractClientPlayer> var2, b$a var3) {
      ClientPacketListener var4 = Minecraft.getInstance().getConnection();
      if (var4 == null) {
         return null;
      } else {
         HashSet var5 = new HashSet();

         for (PlayerInfo var7 : var4.getListedOnlinePlayers()) {
            if (var7 != null && var7.getProfile() != null) {
               var5.add(var7.getProfile().id());
            }
         }

         com.wimpyclient.n.c var17 = null;
         double var18 = Double.MAX_VALUE;

         for (AbstractClientPlayer var10 : var2.values()) {
            PlayerInfo var11 = var4.getPlayerInfo(var10.getUUID());
            boolean var12 = var11 == null || !var5.contains(var10.getUUID()) || var11.getGameMode() == GameType.SPECTATOR || var10.isInvisible();
            if (var12) {
               String var13 = var11 != null ? nameOf(var11, var10.getUUID()) : var10.getGameProfile().name();
               com.wimpyclient.n.c var14 = this.resolveStaff(var10.getUUID(), var11, var13, true, var3);
               if (var14 != null) {
                  double var15 = var1.distanceToSqr(var10);
                  if (var15 < var18) {
                     var18 = var15;
                     var17 = var14;
                  }
               }
            }
         }

         return var17;
      }
   }

   private com.wimpyclient.n.c nearestCachedVanishedStaff(Set<UUID> var1, Map<UUID, PlayerInfo> var2, double var3, double var5, double var7, double var9) {
      com.wimpyclient.n.c var11 = null;
      double var12 = Double.MAX_VALUE;

      for (Entry var15 : this.knownStaff.entrySet()) {
         UUID var16 = (UUID)var15.getKey();
         PlayerInfo var17 = (PlayerInfo)var2.get(var16);
         boolean var18 = var17 == null || !var1.contains(var16) || var17.getGameMode() == GameType.SPECTATOR;
         if (var18) {
            double[] var19 = this.lastPos.get(var16);
            if (var19 != null) {
               double var20 = distSq(var19[0], var19[1], var19[2], var3, var5, var7);
               if (!(var20 > var9) && var20 < var12) {
                  var12 = var20;
                  var11 = ((af$a)var15.getValue()).asEntry(true);
               }
            }
         }
      }

      return var11;
   }

   private void rememberStaff(UUID var1, com.wimpyclient.n.c var2, long var3) {
      if (var1 != null && var2 != null) {
         this.knownStaff.put(var1, new af$a(var2.name(), var2.rankLabel(), var2.color(), var2.priority(), var3));
      }
   }

   private void pruneKnownStaff(long var1, Set<UUID> var3) {
      this.knownStaff.entrySet().removeIf(var3x -> var3.contains(var3x.getKey()) ? false : var1 - var3x.getValue().seenAtMs() > 180000L);
      this.lastPos.keySet().removeIf(var2 -> !var3.contains(var2) && !this.knownStaff.containsKey(var2));
   }

   private com.wimpyclient.n.c resolveStaff(UUID var1, PlayerInfo var2, String var3, boolean var4, b$a var5) {
      if (var2 != null) {
         com.wimpyclient.n.c var6 = staffOf(var2, var3, var4, var5);
         if (var6 != null) {
            this.rememberStaff(var1, var6, System.currentTimeMillis());
            return var6;
         }
      }

      af$a var7 = var1 != null ? this.knownStaff.get(var1) : null;
      return var7 != null ? var7.asEntry(var4) : classifyName(var3, var4, var5);
   }

   private double distanceFromLastPos(LocalPlayer var1, UUID var2) {
      double[] var3 = this.lastPos.get(var2);
      return var3 == null ? -1.0 : Math.sqrt(var1.distanceToSqr(var3[0], var3[1], var3[2]));
   }

   private static double distSq(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = var0 - var6;
      double var14 = var2 - var8;
      double var16 = var4 - var10;
      return var12 * var12 + var14 * var14 + var16 * var16;
   }

   private static String nameOf(PlayerInfo var0, UUID var1) {
      if (var0 != null && var0.getProfile() != null && var0.getProfile().name() != null) {
         return var0.getProfile().name();
      } else {
         af$b var2 = INSTANCE.knownPlayers.get(var1);
         return var2 != null ? var2.name() : null;
      }
   }

   private static com.wimpyclient.n.c staffOf(PlayerInfo var0, String var1, boolean var2, b$a var3) {
      if (var0 == null) {
         return classifyName(var1, var2, var3);
      } else {
         PlayerTeam var4 = var0.getTeam();
         return com.wimpyclient.n.b.classify(
            var1,
            var0.getTabListDisplayName(),
            var4 == null ? null : var4.getPlayerPrefix(),
            var4 == null ? null : var4.getPlayerSuffix(),
            var4 == null ? null : var4.getName(),
            var2,
            var0.getLatency(),
            var3
         );
      }
   }

   private static com.wimpyclient.n.c classifyName(String var0, boolean var1, b$a var2) {
      return var0 != null && !var0.isBlank() ? com.wimpyclient.n.b.classify(var0, null, null, null, null, var1, 0, var2) : null;
   }

   private static double nearbyDistance(LocalPlayer var0, AbstractClientPlayer var1) {
      return var1 == null ? -1.0 : var0.distanceTo(var1);
   }

   private static double distanceTo(LocalPlayer var0, af$i var1) {
      return Math.sqrt(var0.distanceToSqr(var1.x(), var1.y(), var1.z()));
   }
}
