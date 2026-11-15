package com.wimpyclient.i;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.blaze3d.platform.InputConstants.Type;
import com.wimpyclient.auth.LicenseGate;
import com.wimpyclient.n.b$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.KeyMapping.Category;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;

@Environment(EnvType.CLIENT)
public final class x {
   public static final x INSTANCE = new x();
   public static final boolean SCHEMATIC_BUILDER_RELEASED = false;
   private final List<v> modules = new ArrayList<>();
   private Map<w, List<v>> modulesByCategory;
   private b$a cachedStaffConfig;
   private String cachedStaffDetectBy;
   private String cachedStaffNames;
   private String cachedStaffKeywords;
   private String cachedStaffSymbols;
   private boolean cachedStaffFontIcons;
   private boolean cachedStaffVanished;
   public int chunksPerScan = 8;
   public int storageAlphaPercent = 55;
   public int playerMarkerAlphaPercent = 55;
   public int entityEspAlphaPercent = 55;
   public String entityEspSearch = "";
   public int blockEspAlphaPercent = 55;
   public String blockEspSearch = "";
   public int spawnerAlphaPercent = 60;
   public boolean spawnerNotify = true;
   public int nbtAlphaPercent = 60;
   public int fullbrightIntensity = 100;
   public int freecamSpeed = 10;
   public int ambientStars = 280;
   public int ambientMeteors = 6;
   public int ambientSpeed = 10;
   public int ambientBrightness = 100;
   public boolean ambientDay = true;
   public final u storageStyle = new u(false, 38, 242, 64);
   public final u growthDebugStyle = new u(false, 255, 45, 45);
   public final u baseDebugStyle = new u(false, 255, 40, 40);
   public final u yHideBasesStyle = new u(false, 255, 160, 40);
   public final u baseCalcStyle = new u(false, 255, 40, 40);
   public final u playerMarkerStyle = new u(false, 51, 191, 255);
   public final u entityEspStyle = new u(false, 51, 191, 255);
   public final u blockEspStyle = new u(false, 51, 191, 255);
   public int entityEspRed = 255;
   public int entityEspGreen = 60;
   public int entityEspBlue = 60;
   public final u spawnerStyle = new u(false, 255, 100, 40);
   public final u nbtStyle = new u(false, 120, 200, 255);
   public final u primeSusStyle = new u(false, 38, 242, 64);
   public final aa[] storageTypes = aa.defaults();
   public final List<m> entityEspTypes = m.allSelectable();
   public final Map<EntityType<?>, m> entityEspByType = m.indexByType(this.entityEspTypes);
   public final Map<String, m> entityEspBySettingName = m.indexBySettingName(this.entityEspTypes);
   public final List<k> blockEspTypes = k.allSelectable();
   public final Map<Block, k> blockEspByBlock = k.indexByBlock(this.blockEspTypes);
   public final Map<String, k> blockEspBySettingName = new HashMap<>();
   public int growthDebugRenderY = 60;
   public int growthDebugSensitivity = 2;
   public int growthDebugSpreadRadius = 1;
   public int primeSusSimulationDistance = 16;
   public int primeSusSensitivity = 5;
   public int primeSusAlphaPercent = 40;
   public int primeSusRenderY = 60;
   public boolean primeSusClusterIcons = true;
   public boolean primeSusLikelihoodText = true;
   public boolean primeSusSound = true;
   public boolean weatherNotifierSound = true;
   public boolean growthDebugNotify = true;
   public boolean growthDebugAdvanced = false;
   public String growthDebugSeed = "";
   public boolean baseDebugChat = true;
   public boolean baseDebugShowCoords = true;
   public boolean baseDebugSound = true;
   public boolean baseDebugDisconnect = false;
   public int yHideSoftY = 18;
   public int yHideHardY = 0;
   public int yHideBasesSensitivity = 25;
   public boolean yHideBasesLiveActivity = true;
   public boolean yHideBasesChat = true;
   public boolean yHideBasesShowCoords = true;
   public boolean yHideBasesSound = true;
   public int baseDebugRenderY = 60;
   public int baseCalcRenderY = 55;
   public int baseCalcSimulationDistance = 3;
   public int baseCalcSensitivity = 3;
   public boolean baseCalcChat = true;
   public boolean baseCalcSound = true;
   public boolean baseCalcClearRememberedPin = false;
   public final v primeSusFinder = this.register(this.buildPrimeSusFinderModule());
   public final v storage = this.register(this.buildStorageModule());
   public final v growthDebug = this.register(
      addMarkerSettings(
         new v("growth_debug", w.WORLD, false)
            .addSetting(
               new com.wimpyclient.j.d(
                  "Render Y", "World Y the chunk plane is drawn at", -64, 320, 1, () -> this.growthDebugRenderY, var1 -> this.growthDebugRenderY = (int)var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.d(
                  "Sensitivity",
                  "Minimum height of a refilled stone shaft through a blob. 2 = loose, 5 = strict",
                  2,
                  5,
                  1,
                  () -> this.growthDebugSensitivity,
                  var1 -> this.growthDebugSensitivity = (int)var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.d(
                  "Spread Radius",
                  "Nearby finds pool into one marked chunk per area. 0 = mark every find",
                  0,
                  16,
                  1,
                  () -> this.growthDebugSpreadRadius,
                  var1 -> this.growthDebugSpreadRadius = (int)var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.a(
                  "Notify", "Chat and sound when a new patched-shaft chunk is found", () -> this.growthDebugNotify, var1 -> this.growthDebugNotify = var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.a(
                  "Advanced Scanner",
                  "Regenerate the world from the seed and flag chunks whose ores and blobs were changed",
                  () -> this.growthDebugAdvanced,
                  var1 -> this.growthDebugAdvanced = var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.g(
                  "Seed", "World seed for the Advanced Scanner", 32, () -> this.growthDebugSeed, var1 -> this.growthDebugSeed = var1 == null ? "" : var1.trim()
               )
            ),
         this.growthDebugStyle
      )
   );
   public final v baseDebug = this.register(
      addMarkerSettings(
         new v("base_debug", w.WORLD, false)
            .addSetting(
               new com.wimpyclient.j.d(
                  "Simulation Distance",
                  "Scan radius in chunks. Suggested for Donut bases: 3 (max 8)",
                  1,
                  8,
                  1,
                  () -> this.baseCalcSimulationDistance,
                  var1 -> this.baseCalcSimulationDistance = (int)Math.min(8.0, var1)
               )
            )
            .addSetting(
               new com.wimpyclient.j.d(
                  "Sensitivity",
                  "Player-made blocks a chunk needs before it counts. Lower = flags more",
                  1,
                  16,
                  1,
                  () -> this.baseCalcSensitivity,
                  var1 -> this.baseCalcSensitivity = (int)var1
               )
            )
            .addSetting(new com.wimpyclient.j.a("Chat", "Announce bases in chat", () -> this.baseDebugChat, var1 -> {
               this.baseDebugChat = var1;
               this.baseCalcChat = var1;
            }))
            .addSetting(
               new com.wimpyclient.j.a(
                  "Show Coords", "Include chunk-center coords in alerts and toasts", () -> this.baseDebugShowCoords, var1 -> this.baseDebugShowCoords = var1
               )
            )
            .addSetting(new com.wimpyclient.j.a("Sound", "Play a sound when a base cluster is found", () -> this.baseDebugSound, var1 -> {
               this.baseDebugSound = var1;
               this.baseCalcSound = var1;
            }))
            .addSetting(
               new com.wimpyclient.j.a(
                  "Disconnect", "Leave the server when a base cluster is found", () -> this.baseDebugDisconnect, var1 -> this.baseDebugDisconnect = var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.a(
                  "Clear Remembered Pin",
                  "While on, forget already pinned base clusters",
                  () -> this.baseCalcClearRememberedPin,
                  var1 -> this.baseCalcClearRememberedPin = var1
               )
            ),
         this.baseDebugStyle
      )
   );
   public final v yHideBases = this.register(
      addMarkerSettings(
         new v("wimpy_debug", w.WORLD, false)
            .addSetting(
               new com.wimpyclient.j.d(
                  "Soft Hide Y",
                  "First cull band \u2014 score block-light leaks under this Y",
                  -64,
                  128,
                  1,
                  () -> this.yHideSoftY,
                  var1 -> this.yHideSoftY = (int)var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.d(
                  "Hard Hide Y",
                  "Second cull band \u2014 hard leaks weigh more in the score",
                  -64,
                  128,
                  1,
                  () -> this.yHideHardY,
                  var1 -> this.yHideHardY = (int)var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.d(
                  "Sensitivity",
                  "Min score to mark (hard*8 + soft*5 + activity). Floor 25",
                  25,
                  100,
                  1,
                  () -> this.yHideBasesSensitivity,
                  var1 -> this.yHideBasesSensitivity = (int)var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.a(
                  "Live Activity",
                  "Boost block-light hits with underground players, sounds, particles, digs, and vanish marks",
                  () -> this.yHideBasesLiveActivity,
                  var1 -> this.yHideBasesLiveActivity = var1
               )
            )
            .addSetting(new com.wimpyclient.j.a("Chat", "Announce probable bases in chat", () -> this.yHideBasesChat, var1 -> this.yHideBasesChat = var1))
            .addSetting(
               new com.wimpyclient.j.a(
                  "Show Coords", "Include block coords in alerts", () -> this.yHideBasesShowCoords, var1 -> this.yHideBasesShowCoords = var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.a("Sound", "Play a sound when a probable base is found", () -> this.yHideBasesSound, var1 -> this.yHideBasesSound = var1)
            ),
         this.yHideBasesStyle
      )
   );
   public final v playerMarker = this.register(
      addMarkerSettings(
         new v("player_marker", w.WORLD, true)
            .addSetting(
               new com.wimpyclient.j.d(
                  "ESP Opacity %",
                  "Highlight opacity for other players",
                  10,
                  100,
                  5,
                  () -> this.playerMarkerAlphaPercent,
                  var1 -> this.playerMarkerAlphaPercent = (int)var1
               )
            ),
         this.playerMarkerStyle
      )
   );
   public final v entityEsp = this.register(this.buildEntityEspModule());
   public final v blockEsp = this.register(this.buildBlockEspModule());
   public final v spawnerFinder = this.register(
      addMarkerSettings(
         new v("spawner_finder", w.WORLD, true)
            .addSetting(
               new com.wimpyclient.j.a("Notify", "Chat + overlay when a new spawner is found", () -> this.spawnerNotify, var1 -> this.spawnerNotify = var1)
            )
            .addSetting(
               new com.wimpyclient.j.d(
                  "ESP Opacity %", "Highlight opacity for spawners", 10, 100, 5, () -> this.spawnerAlphaPercent, var1 -> this.spawnerAlphaPercent = (int)var1
               )
            ),
         this.spawnerStyle
      )
   );
   public final v nbtBypass = this.register(
      addMarkerSettings(
         new v("nbt_bypass", w.WORLD, false)
            .addSetting(
               new com.wimpyclient.j.d(
                  "ESP Opacity %",
                  "Highlight opacity for NBT storage/spawners",
                  10,
                  100,
                  5,
                  () -> this.nbtAlphaPercent,
                  var1 -> this.nbtAlphaPercent = (int)var1
               )
            ),
         this.nbtStyle
      )
   );
   public final v weatherNotifier = this.register(
      new v("weather_notifier", w.WORLD, true)
         .addSetting(
            new com.wimpyclient.j.a(
               "Sound", "Play a sound when overworld weather changes", () -> this.weatherNotifierSound, var1 -> this.weatherNotifierSound = var1
            )
         )
   );
   public boolean schematicBuilderOpenPanel = false;
   public int schematicBuilderOffsetX = 0;
   public int schematicBuilderOffsetY = 0;
   public int schematicBuilderOffsetZ = 0;
   public int schematicBuilderPlaceDelay = 1;
   public int schematicBuilderLookSpeed = 8;
   public boolean schematicBuilderSprint = true;
   public boolean schematicBuilderBuild = false;
   public boolean schematicBuilderScaffold = true;
   public boolean schematicBuilderBreakScaffold = true;
   public boolean schematicBuilderClear = true;
   public boolean schematicBuilderDebug = false;
   public final v schematicBuilder = this.registerOptional(
      new v("schematic_builder", w.WORLD, false)
         .addSetting(
            new com.wimpyclient.j.a(
               "Open Panel",
               "Open the schematic drop / material list panel",
               () -> this.schematicBuilderOpenPanel,
               var1 -> this.schematicBuilderOpenPanel = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Offset X",
               "Build origin offset from your feet on Start",
               -64,
               64,
               1,
               () -> this.schematicBuilderOffsetX,
               var1 -> this.schematicBuilderOffsetX = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Offset Y",
               "Build origin offset from your feet on Start",
               -64,
               64,
               1,
               () -> this.schematicBuilderOffsetY,
               var1 -> this.schematicBuilderOffsetY = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Offset Z",
               "Build origin offset from your feet on Start",
               -64,
               64,
               1,
               () -> this.schematicBuilderOffsetZ,
               var1 -> this.schematicBuilderOffsetZ = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Place Delay",
               "Ticks to wait between placed blocks",
               0,
               20,
               1,
               () -> this.schematicBuilderPlaceDelay,
               var1 -> this.schematicBuilderPlaceDelay = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Look Speed",
               "How quickly the camera eases toward the next place",
               1,
               10,
               1,
               () -> this.schematicBuilderLookSpeed,
               var1 -> this.schematicBuilderLookSpeed = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Sprint", "Sprint while walking to the next block", () -> this.schematicBuilderSprint, var1 -> this.schematicBuilderSprint = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Scaffold",
               "Place temporary blocks so floating schematic blocks can be placed",
               () -> this.schematicBuilderScaffold,
               var1 -> this.schematicBuilderScaffold = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Clear",
               "Dig wrong blocks and cavity fill touching the schematic (not the whole box)",
               () -> this.schematicBuilderClear,
               var1 -> this.schematicBuilderClear = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Break Scaffold",
               "Mine temporary scaffold once it is no longer needed",
               () -> this.schematicBuilderBreakScaffold,
               var1 -> this.schematicBuilderBreakScaffold = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Debug",
               "Print what the builder is thinking in chat (+ goal boxes)",
               () -> this.schematicBuilderDebug,
               var1 -> this.schematicBuilderDebug = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a("Build", "Walk and place the loaded schematic", () -> this.schematicBuilderBuild, var1 -> this.schematicBuilderBuild = var1)
         ),
      false
   );
   public final v autotool = this.register(new v("autotool", w.PLAYER, false));
   public final v autoCrouch = this.register(new v("auto_crouch", w.PLAYER, false));
   public final v autoMine = this.register(new v("auto_mine", w.PLAYER, false));
   public int autoTotemDelay = 4;
   public boolean autoTotemForce = false;
   public boolean autoTotemHotbarTotem = false;
   public int autoTotemHotbarSlot = 1;
   public int autoTotemHotbarDelay = 4;
   public final v autoInvTotem = this.register(
      new v("auto_inv_totem", w.COMBAT, false)
         .addSetting(
            new com.wimpyclient.j.d("Delay", "Ticks between offhand restocks", 1, 40, 1, () -> this.autoTotemDelay, var1 -> this.autoTotemDelay = (int)var1)
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Force Totem", "Keep swapping even if offhand already has a totem", () -> this.autoTotemForce, var1 -> this.autoTotemForce = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Hotbar Totem", "Also keep a totem in a chosen hotbar slot", () -> this.autoTotemHotbarTotem, var1 -> this.autoTotemHotbarTotem = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Hotbar Slot",
               "Hotbar slot (1-9) used when Hotbar Totem is on",
               1,
               9,
               1,
               () -> this.autoTotemHotbarSlot,
               var1 -> this.autoTotemHotbarSlot = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Hotbar Delay", "Ticks between hotbar restocks", 1, 40, 1, () -> this.autoTotemHotbarDelay, var1 -> this.autoTotemHotbarDelay = (int)var1
            )
         )
   );
   public boolean triggerbotPlayers = true;
   public boolean triggerbotMobs = true;
   public int triggerbotMinDelay = 9;
   public int triggerbotMaxDelay = 11;
   public boolean triggerbotOnlyItem = false;
   public String triggerbotItemFilter = "Sword";
   public boolean triggerbotOnlyCrit = false;
   public boolean triggerbotCheckShield = false;
   public int autoCrystalBreakDelay = 1;
   public int autoCrystalPlaceDelay = 1;
   public boolean autoCrystalAutoObsidian = true;
   public int autoCrystalObsidianDelay = 2;
   public int autoCrystalRange = 3;
   public boolean autoCrystalRestoreSlot = true;
   public final v autoCrystal = this.register(
      new v("auto_crystal", w.COMBAT, false)
         .addSetting(
            new com.wimpyclient.j.d(
               "Break Delay", "Ticks between crystal breaks", 0, 20, 1, () -> this.autoCrystalBreakDelay, var1 -> this.autoCrystalBreakDelay = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Place Delay", "Ticks between crystal places", 0, 20, 1, () -> this.autoCrystalPlaceDelay, var1 -> this.autoCrystalPlaceDelay = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Auto Obsidian",
               "Lay an obsidian base when you are not aiming at one",
               () -> this.autoCrystalAutoObsidian,
               var1 -> this.autoCrystalAutoObsidian = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Obsidian Delay",
               "Ticks between obsidian placements",
               0,
               20,
               1,
               () -> this.autoCrystalObsidianDelay,
               var1 -> this.autoCrystalObsidianDelay = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Break Range", "Max distance to a crystal you will break", 1, 6, 1, () -> this.autoCrystalRange, var1 -> this.autoCrystalRange = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Switch Back",
               "Return to your original hotbar slot when released",
               () -> this.autoCrystalRestoreSlot,
               var1 -> this.autoCrystalRestoreSlot = var1
            )
         )
   );
   public int autoAnchorSwitchDelay = 0;
   public int autoAnchorGlowstoneDelay = 0;
   public int autoAnchorExplodeDelay = 0;
   public int autoAnchorTotemSlot = 1;
   public boolean autoAnchorRestoreSlot = true;
   public int autoAnchorSwitchBackDelay = 2;
   public final v autoAnchor = this.register(
      new v("auto_anchor", w.COMBAT, false)
         .addSetting(
            new com.wimpyclient.j.d(
               "Switch Delay", "Ticks before swapping to glowstone", 0, 20, 1, () -> this.autoAnchorSwitchDelay, var1 -> this.autoAnchorSwitchDelay = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Glowstone Delay",
               "Ticks before charging the anchor",
               0,
               20,
               1,
               () -> this.autoAnchorGlowstoneDelay,
               var1 -> this.autoAnchorGlowstoneDelay = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Explode Delay",
               "Ticks before swapping to the detonate slot",
               0,
               20,
               1,
               () -> this.autoAnchorExplodeDelay,
               var1 -> this.autoAnchorExplodeDelay = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Totem Slot",
               "Hotbar slot to hold while detonating (1-9)",
               1,
               9,
               1,
               () -> this.autoAnchorTotemSlot,
               var1 -> this.autoAnchorTotemSlot = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Switch Back",
               "Return to the previous hotbar slot after detonating",
               () -> this.autoAnchorRestoreSlot,
               var1 -> this.autoAnchorRestoreSlot = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Switch Back Delay",
               "Ticks before restoring the previous slot",
               0,
               20,
               1,
               () -> this.autoAnchorSwitchBackDelay,
               var1 -> this.autoAnchorSwitchBackDelay = (int)var1
            )
         )
   );
   public final v triggerbot = this.register(
      new v("triggerbot", w.COMBAT, false)
         .addSetting(
            new com.wimpyclient.j.a("Players", "Attack other players on the crosshair", () -> this.triggerbotPlayers, var1 -> this.triggerbotPlayers = var1)
         )
         .addSetting(new com.wimpyclient.j.a("Mobs", "Attack mobs on the crosshair", () -> this.triggerbotMobs, var1 -> this.triggerbotMobs = var1))
         .addSetting(
            new com.wimpyclient.j.d(
               "Min Delay", "Minimum ticks between attacks", 0, 20, 1, () -> this.triggerbotMinDelay, var1 -> this.triggerbotMinDelay = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Max Delay", "Maximum ticks between attacks", 0, 20, 1, () -> this.triggerbotMaxDelay, var1 -> this.triggerbotMaxDelay = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Only Item", "Only attack while holding the filtered item", () -> this.triggerbotOnlyItem, var1 -> this.triggerbotOnlyItem = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.g("Item Filter", "Sword, Axe, or Hand", 8, () -> this.triggerbotItemFilter, var1 -> this.triggerbotItemFilter = var1)
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Only Crit", "Wait until you are falling for a critical hit", () -> this.triggerbotOnlyCrit, var1 -> this.triggerbotOnlyCrit = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Check Shield", "Do not attack players who are blocking", () -> this.triggerbotCheckShield, var1 -> this.triggerbotCheckShield = var1
            )
         )
   );
   public boolean shieldBreakerSwitchBack = true;
   public boolean shieldBreakerBestAxe = true;
   public int shieldBreakerSwitchDelayMs = 150;
   public final v shieldBreaker = this.register(
      new v("shield_breaker", w.COMBAT, false)
         .addSetting(
            new com.wimpyclient.j.a(
               "Switch Back",
               "Return to the previous hotbar slot after the axe hit",
               () -> this.shieldBreakerSwitchBack,
               var1 -> this.shieldBreakerSwitchBack = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Best Axe",
               "Prefer the highest-tier axe in the hotbar (off = nearest slot)",
               () -> this.shieldBreakerBestAxe,
               var1 -> this.shieldBreakerBestAxe = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Switch Delay ms",
               "Delay before switching back after the hit",
               0,
               500,
               10,
               () -> this.shieldBreakerSwitchDelayMs,
               var1 -> this.shieldBreakerSwitchDelayMs = (int)var1
            )
         )
   );
   public boolean maceSwapSwitchBack = true;
   public int maceSwapSwitchDelay = 2;
   public boolean maceSwapOnlySword = false;
   public boolean maceSwapOnlyAxe = false;
   public final v maceSwap = this.register(
      new v("mace_swap", w.COMBAT, false)
         .addSetting(
            new com.wimpyclient.j.a(
               "Only Sword", "Only swap when currently holding a sword", () -> this.maceSwapOnlySword, var1 -> this.maceSwapOnlySword = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a("Only Axe", "Only swap when currently holding an axe", () -> this.maceSwapOnlyAxe, var1 -> this.maceSwapOnlyAxe = var1)
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Switch Back", "Return to the previous hotbar slot after the mace hit", () -> this.maceSwapSwitchBack, var1 -> this.maceSwapSwitchBack = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Switch Delay", "Ticks to wait before switching back", 0, 20, 1, () -> this.maceSwapSwitchDelay, var1 -> this.maceSwapSwitchDelay = (int)var1
            )
         )
   );
   public int elytraSwapDelay = 0;
   public boolean elytraSwapSwitchBack = false;
   public int elytraSwapSwitchDelay = 0;
   public boolean elytraSwapPreferSlot = true;
   public int elytraSwapSlot = 9;
   public final v elytraSwap = this.register(
      new v("elytra_swap", w.COMBAT, false)
         .addSetting(
            new com.wimpyclient.j.d(
               "Swap Delay",
               "Ticks to wait after the key press before swapping",
               0,
               20,
               1,
               () -> this.elytraSwapDelay,
               var1 -> this.elytraSwapDelay = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Switch Back", "Swap again after Switch Delay (toggle elytra/chest)", () -> this.elytraSwapSwitchBack, var1 -> this.elytraSwapSwitchBack = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Switch Delay",
               "Ticks before the automatic switch-back",
               0,
               20,
               1,
               () -> this.elytraSwapSwitchDelay,
               var1 -> this.elytraSwapSwitchDelay = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Prefer Slot", "Prefer a specific hotbar slot when equipping elytra", () -> this.elytraSwapPreferSlot, var1 -> this.elytraSwapPreferSlot = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Elytra Slot", "Hotbar slot 1-9 to prefer for elytra", 1, 9, 1, () -> this.elytraSwapSlot, var1 -> this.elytraSwapSlot = (int)var1
            )
         )
   );
   public double godTridentScale = 0.4;
   public boolean godTridentNoWater = true;
   public final v godTrident = this.register(new v("god_trident", w.COMBAT, false).addSetting(s.get().scale).addSetting(s.get().noWater));
   public double aimAssistRange = 4.0;
   public int aimAssistSpeed = 4;
   public int aimAssistSmoothness = 6;
   public String aimAssistSmoothing = "Soft";
   public String aimAssistTarget = "Body";
   public int aimAssistFov = 90;
   public boolean aimAssistVertical = true;
   public boolean aimAssistPlayers = true;
   public boolean aimAssistHostiles = false;
   public boolean aimAssistPassive = false;
   public boolean aimAssistInvisibles = false;
   public boolean aimAssistWallCheck = false;
   public String aimAssistActivation = "Hold Attack";
   public boolean aimAssistSticky = true;
   public final v aimAssist = this.register(
      new v("aim_assist", w.COMBAT, false)
         .addSetting(
            new com.wimpyclient.j.e(
               "Activation",
               "Hold Attack = while clicking; Always = whenever on; Toggle = click once to arm, again to disarm",
               () -> this.aimAssistActivation,
               var1 -> this.aimAssistActivation = var1,
               "Hold Attack",
               "Always",
               "Toggle"
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Range", "Assist targets within this distance (blocks)", 1, 8, 1, () -> (int)Math.round(this.aimAssistRange), var1 -> this.aimAssistRange = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Speed", "How fast the aim is pulled (higher = snappier)", 1, 10, 1, () -> this.aimAssistSpeed, var1 -> this.aimAssistSpeed = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.e(
               "Smoothing",
               "Off = raw speed; Soft = dampened; Ease = stronger when far, softer when close",
               () -> this.aimAssistSmoothing,
               var1 -> this.aimAssistSmoothing = var1,
               "Off",
               "Soft",
               "Ease"
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Smooth Amount",
               "How strong Soft / Ease dampening is (ignored when Smoothing is Off)",
               1,
               10,
               1,
               () -> this.aimAssistSmoothness,
               var1 -> this.aimAssistSmoothness = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.e(
               "Target", "Where on the entity to aim", () -> this.aimAssistTarget, var1 -> this.aimAssistTarget = var1, "Body", "Head", "Feet"
            )
         )
         .addSetting(
            new com.wimpyclient.j.d("FOV", "Only assist within this facing cone", 10, 180, 5, () -> this.aimAssistFov, var1 -> this.aimAssistFov = (int)var1)
         )
         .addSetting(
            new com.wimpyclient.j.a("Vertical", "Also correct pitch, not just yaw", () -> this.aimAssistVertical, var1 -> this.aimAssistVertical = var1)
         )
         .addSetting(new com.wimpyclient.j.a("Players", "Target other players", () -> this.aimAssistPlayers, var1 -> this.aimAssistPlayers = var1))
         .addSetting(new com.wimpyclient.j.a("Hostiles", "Target hostile mobs", () -> this.aimAssistHostiles, var1 -> this.aimAssistHostiles = var1))
         .addSetting(new com.wimpyclient.j.a("Passive", "Target passive mobs", () -> this.aimAssistPassive, var1 -> this.aimAssistPassive = var1))
         .addSetting(
            new com.wimpyclient.j.a("Invisibles", "Also target invisible entities", () -> this.aimAssistInvisibles, var1 -> this.aimAssistInvisibles = var1)
         )
         .addSetting(
            new com.wimpyclient.j.a("Wall Check", "Only assist targets you can see", () -> this.aimAssistWallCheck, var1 -> this.aimAssistWallCheck = var1)
         )
         .addSetting(
            new com.wimpyclient.j.a("Sticky Target", "Keep one target until it leaves range", () -> this.aimAssistSticky, var1 -> this.aimAssistSticky = var1)
         )
   );
   public String autoRtpCommand = "rtp";
   public boolean autoRtpBaritone = true;
   public final v autoRtp = this.register(
      new v("auto_rtp", w.PLAYER, false)
         .addSetting(
            new com.wimpyclient.j.g(
               "Command",
               "Command to run each hop (without leading /)",
               64,
               () -> this.autoRtpCommand,
               var1 -> this.autoRtpCommand = var1 != null && !var1.isBlank() ? var1.trim() : "rtp"
            )
         )
         .addSetting(new com.wimpyclient.j.a("Baritone", "Path to sus chunks and dig down with Baritone when found", () -> this.autoRtpBaritone, var1 -> {
            this.autoRtpBaritone = var1;
            if (!var1) {
               com.wimpyclient.p.b.cancelPath();
            }
         }))
   );
   public String autoRelogTempHome = "3";
   public String autoRelogHome1 = "1";
   public String autoRelogSetCommand = "sethome";
   public String autoRelogHomeCommand = "home";
   public String autoRelogDelCommand = "delhome";
   public int autoRelogSetDelayTicks = 60;
   public final v autoRelog = this.register(
      new v("auto_relog", w.PLAYER, false)
         .addSetting(
            new com.wimpyclient.j.g(
               "Temp Home",
               "Home number set at dig spot before /home 1 (default 3)",
               64,
               () -> this.autoRelogTempHome,
               var1 -> this.autoRelogTempHome = var1 == null ? "" : var1.trim()
            )
         )
         .addSetting(
            new com.wimpyclient.j.g(
               "Home 1",
               "Home to visit before returning (e.g. 1)",
               64,
               () -> this.autoRelogHome1,
               var1 -> this.autoRelogHome1 = var1 == null ? "" : var1.trim()
            )
         )
         .addSetting(
            new com.wimpyclient.j.g(
               "Set Command",
               "Command to create a home (without /)",
               64,
               () -> this.autoRelogSetCommand,
               var1 -> this.autoRelogSetCommand = var1 == null ? "" : var1.trim()
            )
         )
         .addSetting(
            new com.wimpyclient.j.g(
               "Home Command",
               "Command to teleport to a home (without /)",
               64,
               () -> this.autoRelogHomeCommand,
               var1 -> this.autoRelogHomeCommand = var1 == null ? "" : var1.trim()
            )
         )
         .addSetting(
            new com.wimpyclient.j.g(
               "Delete Command",
               "Command to delete a home (without /)",
               64,
               () -> this.autoRelogDelCommand,
               var1 -> this.autoRelogDelCommand = var1 == null ? "" : var1.trim()
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Set Delay (ticks)",
               "Wait after /sethome before the first /home",
               20,
               200,
               1,
               () -> this.autoRelogSetDelayTicks,
               var1 -> this.autoRelogSetDelayTicks = (int)var1
            )
         )
   );
   public final v autoRelogV2 = this.register(new v("auto_relog_v2", w.PLAYER, false));
   public int autologRange = 64;
   public final v autolog = this.register(
      new v("autolog", w.PLAYER, false)
         .addSetting(
            new com.wimpyclient.j.d(
               "Range", "Disconnect when another player is within this many blocks", 8, 256, 1, () -> this.autologRange, var1 -> this.autologRange = (int)var1
            )
         )
   );
   public int antiVanishRange = 64;
   public boolean antiVanishStaffOnly = true;
   public boolean antiVanishSound = true;
   public boolean antiVanishWorldSensors = true;
   public boolean antiVanishHeadPopup = true;
   public String antiVanishAlerts = "Toast";
   public final v antiVanish = this.register(
      new v("anti_vanish", w.PLAYER, false)
         .addSetting(
            new com.wimpyclient.j.d(
               "Range",
               "How far to watch for vanished bodies and world leaks",
               16,
               128,
               1,
               () -> this.antiVanishRange,
               var1 -> this.antiVanishRange = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Staff Only",
               "Only alert for players matching Staff Detector rules (stars / ranks / names)",
               () -> this.antiVanishStaffOnly,
               var1 -> this.antiVanishStaffOnly = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "World Sensors",
               "Score nearby chest/door sounds and break particles with no visible player",
               () -> this.antiVanishWorldSensors,
               var1 -> this.antiVanishWorldSensors = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Head Popup",
               "Show WATCHING YOU title + staff head when signals go critical",
               () -> this.antiVanishHeadPopup,
               var1 -> this.antiVanishHeadPopup = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.e(
               "Alerts", "How to announce a nearby vanish", () -> this.antiVanishAlerts, var1 -> this.antiVanishAlerts = var1, "Toast", "Chat", "Off"
            )
         )
         .addSetting(new com.wimpyclient.j.a("Sound", "Play a bell when Anti Vanish fires", () -> this.antiVanishSound, var1 -> this.antiVanishSound = var1))
   );
   public final v fullbright = this.register(
      new v("fullbright", w.VISUAL, false)
         .addSetting(
            new com.wimpyclient.j.d(
               "Intensity %", "How strong the fullbright effect is", 10, 100, 5, () -> this.fullbrightIntensity, var1 -> this.fullbrightIntensity = (int)var1
            )
         )
   );
   public int fovChangerFov = 120;
   public final v fovChanger = this.register(
      new v("fov_changer", w.VISUAL, false)
         .addSetting(
            new com.wimpyclient.j.d(
               "FOV", "Camera field of view (vanilla max is 110)", 10, 170, 1, () -> this.fovChangerFov, var1 -> this.fovChangerFov = (int)var1
            )
         )
   );
   public int toolSizePercent = 100;
   public double toolSizeX = 0.0;
   public double toolSizeY = 0.0;
   public double toolSizeZ = 0.0;
   public int toolSizeRotX = 0;
   public int toolSizeRotY = 0;
   public int toolSizeRotZ = 0;
   public final v toolSize = this.register(
      new v("tool_size", w.VISUAL, false)
         .addSetting(
            new com.wimpyclient.j.d(
               "Size %", "Held item scale (100 is vanilla)", 10, 400, 5, () -> this.toolSizePercent, var1 -> this.toolSizePercent = (int)var1
            )
         )
         .addSetting(new com.wimpyclient.j.c("X", "Move the held item left / right", -2.0, 2.0, 0.05, () -> this.toolSizeX, var1 -> this.toolSizeX = var1))
         .addSetting(new com.wimpyclient.j.c("Y", "Move the held item down / up", -2.0, 2.0, 0.05, () -> this.toolSizeY, var1 -> this.toolSizeY = var1))
         .addSetting(new com.wimpyclient.j.c("Z", "Move the held item closer / farther", -2.0, 2.0, 0.05, () -> this.toolSizeZ, var1 -> this.toolSizeZ = var1))
         .addSetting(
            new com.wimpyclient.j.d("Rot X", "Tilt the held item (pitch)", -180, 180, 1, () -> this.toolSizeRotX, var1 -> this.toolSizeRotX = (int)var1)
         )
         .addSetting(new com.wimpyclient.j.d("Rot Y", "Turn the held item (yaw)", -180, 180, 1, () -> this.toolSizeRotY, var1 -> this.toolSizeRotY = (int)var1))
         .addSetting(new com.wimpyclient.j.d("Rot Z", "Roll the held item", -180, 180, 1, () -> this.toolSizeRotZ, var1 -> this.toolSizeRotZ = (int)var1))
   );
   public final v toolOutline = this.register(new v("tool_outline", w.VISUAL, false));
   public final v ambient = this.register(
      new v("ambient", w.VISUAL, false)
         .addSetting(
            new com.wimpyclient.j.d("Stars", "How many stars fill the sky dome", 0, 420, 10, () -> this.ambientStars, var1 -> this.ambientStars = (int)var1)
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Meteors", "How many shooting stars fly at once", 0, 16, 1, () -> this.ambientMeteors, var1 -> this.ambientMeteors = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Speed", "How fast meteors and twinkles move. 10 is the default", 1, 25, 1, () -> this.ambientSpeed, var1 -> this.ambientSpeed = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Brightness", "Overall glow of stars and meteor trails", 10, 150, 5, () -> this.ambientBrightness, var1 -> this.ambientBrightness = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Day Visibility", "Keep the sky dark during the day. Off = night only", () -> this.ambientDay, var1 -> this.ambientDay = var1
            )
         )
   );
   public final v freecam = this.register(
      new v("freecam", w.PLAYER, false)
         .addSetting(
            new com.wimpyclient.j.d(
               "Speed",
               "Freecam move speed. Scroll while freecam is on to change; sprint for a temporary boost",
               1,
               50,
               1,
               () -> this.freecamSpeed,
               var1 -> this.freecamSpeed = (int)var1
            )
         )
   );
   public String flightMode = "Normal";
   public int flightSpeed = 5;
   public int flightVerticalSpeed = 5;
   public boolean flightAntiKick = true;
   public boolean flightSmooth = false;
   public final v flight = this.register(
      new v("flight", w.PLAYER, false)
         .addSetting(
            new com.wimpyclient.j.e(
               "Mode",
               "Normal = vanilla flight math + anti-kick dip; Grim = same math, sprint-air speed cap, no ground spoof",
               () -> this.flightMode,
               var1 -> this.flightMode = var1,
               "Normal",
               "Grim"
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Speed",
               "Horizontal fly speed. 5 matches vanilla fly (0.05); sprint still doubles it. Grim tops out at sprint air acceleration",
               1,
               10,
               1,
               () -> this.flightSpeed,
               var1 -> this.flightSpeed = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Vertical Speed",
               "Up / down impulse. 5 is vanilla (flyingSpeed x 3). Grim caps the impulse",
               1,
               10,
               1,
               () -> this.flightVerticalSpeed,
               var1 -> this.flightVerticalSpeed = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Anti Kick",
               "Normal: dip below the flying-kick line and spoof on-ground for fall damage. Grim always dips and never spoofs ground",
               () -> this.flightAntiKick,
               var1 -> this.flightAntiKick = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Smooth",
               "Kept for old configs. Unused \u2014 blending would desync vanilla flight math",
               () -> this.flightSmooth,
               var1 -> this.flightSmooth = var1
            )
         )
   );
   public int freelookDistance = 4;
   public final v freelook = this.register(
      new v("freelook", w.PLAYER, false)
         .addSetting(
            new com.wimpyclient.j.d(
               "Distance",
               "How far the third-person camera sits behind the look direction",
               1,
               16,
               1,
               () -> this.freelookDistance,
               var1 -> this.freelookDistance = (int)var1
            )
         )
   );
   public boolean nametagPlayers = true;
   public boolean nametagItems = false;
   public boolean nametagBlocks = false;
   public boolean nametagSelf = false;
   public int nametagMaxDistance = 64;
   public final v nametags = this.register(
      new v("nametags", w.VISUAL, true)
         .addSetting(
            new com.wimpyclient.j.a("Players", "Show custom nametags above other players", () -> this.nametagPlayers, var1 -> this.nametagPlayers = var1)
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Self (3rd Person)", "Show your own nametag while in third person or freecam", () -> this.nametagSelf, var1 -> this.nametagSelf = var1
            )
         )
         .addSetting(new com.wimpyclient.j.a("Items", "Show nametags above dropped items", () -> this.nametagItems, var1 -> this.nametagItems = var1))
         .addSetting(
            new com.wimpyclient.j.a("Blocks", "Show nametags above storage blocks and spawners", () -> this.nametagBlocks, var1 -> this.nametagBlocks = var1)
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Max Distance", "How far nametags remain visible", 16, 128, 8, () -> this.nametagMaxDistance, var1 -> this.nametagMaxDistance = (int)var1
            )
         )
   );
   public String armorTrimHiderMode = "Hide";
   public boolean armorTrimHiderOwn = true;
   public final v armorTrimHider = this.register(
      new v("armor_trim_hider", w.VISUAL, false)
         .addSetting(
            new com.wimpyclient.j.e(
               "Mode",
               "Hide wipes worn trims; Random gives every piece a random one",
               () -> this.armorTrimHiderMode,
               var1 -> this.armorTrimHiderMode = var1,
               "Hide",
               "Random"
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Own Armor", "Also affect your own worn armor (F5 / inventory)", () -> this.armorTrimHiderOwn, var1 -> this.armorTrimHiderOwn = var1
            )
         )
   );
   public boolean hudWatermark = true;
   public boolean hudFps = true;
   public boolean hudCoords = true;
   public boolean hudChunk = true;
   public boolean hudDirection = true;
   public boolean hudSpeed = true;
   public boolean hudPing = true;
   public boolean hudBiome = true;
   public boolean hudKeybinds = true;
   public boolean hudArraylist = true;
   public boolean hudRtpMap = true;
   public boolean hudRtpMapIds = true;
   public boolean hudRtpMapLegend = true;
   public boolean hudRtpMapGrid = true;
   public boolean hudRtpMapHeat = true;
   public int hudRtpMapOpacity = 82;
   public boolean hudStaffDetector = true;
   public boolean hudStaffSound = true;
   public String hudStaffDetectBy = "Star + Rank";
   public String hudStaffNames = "";
   public String hudStaffRankKeywords = com.wimpyclient.n.b.DEFAULT_RANK_KEYWORDS_STRING;
   public String hudStaffStarSymbols = "\u2605\u2606\u2726\u2727\u272a\u2729\u272b\u272c\u272d\u272e\u272f\u2b50\u2730\u2742\u269d\u2734\u2735\u2736\u2737\u2738\u2739\u235f";
   public boolean hudStaffFontIcons = true;
   public boolean hudStaffShowRank = true;
   public boolean hudStaffShowPing = false;
   public boolean hudStaffVanished = true;
   public int hudStaffMaxRows = 6;
   public String hudStaffAlerts = "Toast";
   public boolean hudStatusEffects = true;
   public final v hud = this.register(
      new v("hud", w.VISUAL, true)
         .addSetting(new com.wimpyclient.j.a("Watermark", "Show the WimpyClient watermark", () -> this.hudWatermark, var1 -> this.hudWatermark = var1))
         .addSetting(new com.wimpyclient.j.a("FPS", "Show current frames per second", () -> this.hudFps, var1 -> this.hudFps = var1))
         .addSetting(new com.wimpyclient.j.a("Coordinates", "Show XYZ coordinates", () -> this.hudCoords, var1 -> this.hudCoords = var1))
         .addSetting(new com.wimpyclient.j.a("Chunk", "Show chunk coordinates", () -> this.hudChunk, var1 -> this.hudChunk = var1))
         .addSetting(new com.wimpyclient.j.a("Direction", "Show facing direction", () -> this.hudDirection, var1 -> this.hudDirection = var1))
         .addSetting(new com.wimpyclient.j.a("Speed", "Show horizontal movement speed in blocks/sec", () -> this.hudSpeed, var1 -> this.hudSpeed = var1))
         .addSetting(new com.wimpyclient.j.a("Ping", "Show your latency", () -> this.hudPing, var1 -> this.hudPing = var1))
         .addSetting(new com.wimpyclient.j.a("Biome", "Show the current biome", () -> this.hudBiome, var1 -> this.hudBiome = var1))
         .addSetting(new com.wimpyclient.j.a("Keybinds", "Show a keybind menu for bound modules", () -> this.hudKeybinds, var1 -> this.hudKeybinds = var1))
         .addSetting(new com.wimpyclient.j.a("Arraylist", "Show currently enabled modules", () -> this.hudArraylist, var1 -> this.hudArraylist = var1))
         .addSetting(
            new com.wimpyclient.j.a(
               "RTP Map", "Show the 9\u00d79 region map with your position and RTP hop density", () -> this.hudRtpMap, var1 -> this.hudRtpMap = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Map Opacity", "Fill opacity of region cells", 10, 100, 5, () -> this.hudRtpMapOpacity, var1 -> this.hudRtpMapOpacity = (int)var1
            )
         )
         .addSetting(new com.wimpyclient.j.a("Region IDs", "Show each region's id inside its cell", () -> this.hudRtpMapIds, var1 -> this.hudRtpMapIds = var1))
         .addSetting(
            new com.wimpyclient.j.a("Type Legend", "Show region-type colours under the grid", () -> this.hudRtpMapLegend, var1 -> this.hudRtpMapLegend = var1)
         )
         .addSetting(
            new com.wimpyclient.j.a("Grid Lines", "Draw faint separators between region cells", () -> this.hudRtpMapGrid, var1 -> this.hudRtpMapGrid = var1)
         )
         .addSetting(new com.wimpyclient.j.a("Hop Heat", "Brighten cells where you have RTP'd", () -> this.hudRtpMapHeat, var1 -> this.hudRtpMapHeat = var1))
         .addSetting(
            new com.wimpyclient.j.a(
               "Status Effects", "Show your current potion effects with remaining duration", () -> this.hudStatusEffects, var1 -> this.hudStatusEffects = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Staff Detector",
               "Show a HUD panel of staff recognised from tab (star, rank, or extra names)",
               () -> this.hudStaffDetector,
               var1 -> this.hudStaffDetector = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.e(
               "Detect By",
               "How staff are recognised: coloured star, a text rank prefix, or both",
               () -> this.hudStaffDetectBy,
               var1 -> this.hudStaffDetectBy = var1,
               "Star + Rank",
               "Star Only",
               "Rank Only",
               "Names Only"
            )
         )
         .addSetting(
            new com.wimpyclient.j.g(
               "Staff Names",
               "Extra known staff usernames (comma-separated) \u2014 always shown when online",
               220,
               () -> this.hudStaffNames,
               var1 -> this.hudStaffNames = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.g(
               "Rank Keywords",
               "Words in a name tag that mark staff (comma-separated), most senior first",
               256,
               () -> this.hudStaffRankKeywords,
               var1 -> this.hudStaffRankKeywords = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.g(
               "Star Symbols",
               "Marker glyphs that mean staff. Paste the server's star here if detection misses",
               96,
               () -> this.hudStaffStarSymbols,
               var1 -> this.hudStaffStarSymbols = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Font Icons",
               "Also treat custom resource-pack icons (private-use glyphs) as staff stars",
               () -> this.hudStaffFontIcons,
               var1 -> this.hudStaffFontIcons = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Show Rank",
               "Show each staff member's rank label when the server exposes one",
               () -> this.hudStaffShowRank,
               var1 -> this.hudStaffShowRank = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a("Show Ping", "Show each staff member's latency", () -> this.hudStaffShowPing, var1 -> this.hudStaffShowPing = var1)
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Vanished Staff",
               "Include soft-vanished staff (spectator / hidden from tab), marked separately",
               () -> this.hudStaffVanished,
               var1 -> this.hudStaffVanished = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Max Rows",
               "Most staff rows to show before collapsing into a '+N more' line",
               1,
               20,
               1,
               () -> this.hudStaffMaxRows,
               var1 -> this.hudStaffMaxRows = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.e(
               "Alerts",
               "Announce when a new staff member appears in your tab",
               () -> this.hudStaffAlerts,
               var1 -> this.hudStaffAlerts = var1,
               "Toast",
               "Chat",
               "Off"
            )
         )
         .addSetting(
            new com.wimpyclient.j.a("Alert Sound", "Play a bell when a staff alert fires", () -> this.hudStaffSound, var1 -> this.hudStaffSound = var1)
         )
         .addSetting(new com.wimpyclient.j.a("Reset RTP Map", "Clear all recorded RTP samples", () -> false, var0 -> {
            if (var0) {
               com.wimpyclient.e.f.INSTANCE.clear();
            }
         }))
   );
   public String fakeNameText = "";
   public double clickGuiScale = 1.0;
   public final v clickGui = this.register(
      new v("click_gui", w.CLIENT, true)
         .addSetting(
            new com.wimpyclient.j.c("Scale", "Resize the ClickGUI panels", 0.5, 1.5, 0.05, () -> this.clickGuiScale, var1 -> this.clickGuiScale = var1)
         )
   );
   public String themePreset = "Wimpy";
   public String themeFont = "Default";
   public boolean themeNeonGlow = true;
   public boolean themeUiGlow = true;
   public boolean themeUiStarfield = false;
   public boolean themeLogoGlow = true;
   public boolean themeItemOutline = true;
   public boolean themeItemStarfield = false;
   public double themeGlowIntensity = 0.32;
   public double themeOutlineThickness = 0.45;
   public double themeStarDensity = 0.4;
   public double themeStarAnimSpeed = 0.85;
   public double themeOverlayOpacity = 0.42;
   public int themeCustomRed = 61;
   public int themeCustomGreen = 220;
   public int themeCustomBlue = 151;
   public final v theme = this.register(
      new v("theme", w.CLIENT, true)
         .addSetting(
            new com.wimpyclient.j.e(
               "Preset", "ClickGUI / HUD accent preset", () -> this.themePreset, var1 -> this.themePreset = var1, com.wimpyclient.o.c.PRESETS
            )
         )
         .addSetting(
            new com.wimpyclient.j.e("Font", "ClickGUI / HUD typeface", () -> this.themeFont, var1 -> this.themeFont = var1, com.wimpyclient.o.a.available())
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Cosmic Glass", "Master toggle for glass panels, glow, stars, and item overlay", () -> this.themeNeonGlow, var1 -> this.themeNeonGlow = var1
            )
         )
         .addSetting(new com.wimpyclient.j.a("UI Glow", "Soft cyan bloom on HUD text and panel edges", () -> this.themeUiGlow, var1 -> this.themeUiGlow = var1))
         .addSetting(
            new com.wimpyclient.j.a("UI Starfield", "Tiny stars inside glass panels", () -> this.themeUiStarfield, var1 -> this.themeUiStarfield = var1)
         )
         .addSetting(
            new com.wimpyclient.j.a("Logo Glow", "Cyan glow and bevel on the watermark logo", () -> this.themeLogoGlow, var1 -> this.themeLogoGlow = var1)
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Item Outline", "Cyan silhouette outline on the held item", () -> this.themeItemOutline, var1 -> this.themeItemOutline = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Item Starfield", "Dark star overlay on the held-item model", () -> this.themeItemStarfield, var1 -> this.themeItemStarfield = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.c(
               "Glow Intensity", "How strong the cyan bloom is", 0.15, 1.0, 0.05, () -> this.themeGlowIntensity, var1 -> this.themeGlowIntensity = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.c(
               "Outline Thickness", "UI and item outline weight", 0.5, 2.0, 0.05, () -> this.themeOutlineThickness, var1 -> this.themeOutlineThickness = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.c(
               "Star Density", "How many stars appear in glass panels", 0.15, 1.0, 0.05, () -> this.themeStarDensity, var1 -> this.themeStarDensity = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.c(
               "Star Animation",
               "Twinkle speed for panel and item stars",
               0.0,
               2.0,
               0.05,
               () -> this.themeStarAnimSpeed,
               var1 -> this.themeStarAnimSpeed = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.c(
               "Overlay Opacity", "Held-item glass overlay strength", 0.15, 0.8, 0.05, () -> this.themeOverlayOpacity, var1 -> this.themeOverlayOpacity = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.b(
               "Custom Accent",
               "Accent used when Preset is Custom",
               () -> this.themeCustomRed,
               () -> this.themeCustomGreen,
               () -> this.themeCustomBlue,
               var1 -> this.themeCustomRed = var1,
               var1 -> this.themeCustomGreen = var1,
               var1 -> this.themeCustomBlue = var1
            )
         )
   );
   public final v accounts = this.register(new v("accounts", w.CLIENT, false));
   public String spotifySource = "Auto";
   public boolean spotifyControls = true;
   public boolean spotifyVolume = true;
   public boolean spotifyHideWhenIdle = true;
   public final v spotify = this.register(
      new v("spotify", w.CLIENT, true)
         .addSetting(
            new com.wimpyclient.j.e(
               "Source",
               "Auto uses Windows Spotify playback; Demo shows a fake track",
               () -> this.spotifySource,
               var1 -> this.spotifySource = var1,
               "Auto",
               "Demo"
            )
         )
         .addSetting(
            new com.wimpyclient.j.a("Controls", "Show previous / play-pause / next buttons", () -> this.spotifyControls, var1 -> this.spotifyControls = var1)
         )
         .addSetting(new com.wimpyclient.j.a("Volume", "Show Spotify's Windows mixer volume", () -> this.spotifyVolume, var1 -> this.spotifyVolume = var1))
         .addSetting(
            new com.wimpyclient.j.a(
               "Hide When Idle", "Hide the card when nothing is playing", () -> this.spotifyHideWhenIdle, var1 -> this.spotifyHideWhenIdle = var1
            )
         )
   );
   public final v discordRpc = this.register(new v("discord_rpc", w.CLIENT, true));
   public int swingSpeedTenths = 3;
   public final v swingSpeed = this.register(
      new v("swing_speed", w.CLIENT, false)
         .addSetting(
            new com.wimpyclient.j.d(
               "Speed",
               "Swing speed in tenths (3 = 0.3x slower/smoother, 10 = vanilla, 30 = 3x)",
               1,
               30,
               1,
               () -> this.swingSpeedTenths,
               var1 -> this.swingSpeedTenths = (int)var1
            )
         )
   );
   public final v fakeName = this.register(
      new v("fake_name", w.CLIENT, false)
         .addSetting(
            new com.wimpyclient.j.g(
               "Name", "Client-side name shown on tab, scoreboard, nametags, and chat", 32, () -> this.fakeNameText, var1 -> this.fakeNameText = var1
            )
         )
   );
   public String fakeStatsMoney = "1m";
   public int fakeStatsMoneyLine = 1;
   public String fakeStatsShards = "";
   public int fakeStatsShardsLine = 2;
   public String fakeStatsKills = "";
   public int fakeStatsKillsLine = 3;
   public String fakeStatsDeaths = "";
   public int fakeStatsDeathsLine = 4;
   public String fakeStatsPlaytime = "";
   public int fakeStatsPlaytimeLine = 5;
   public boolean fakeStatsSidebar = true;
   public boolean fakeStatsTab = true;
   public boolean fakeStatsBalanceCommand = true;
   public boolean fakeStatsDeductOnPay = true;
   public final v fakeStats = this.register(
      new v("fake_stats", w.CLIENT, false)
         .addSetting(
            new com.wimpyclient.j.g(
               "Money", "Your fake balance (1m, 250k, 250000). Blank = off.", 32, () -> this.fakeStatsMoney, var1 -> this.fakeStatsMoney = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Money Line",
               "Which sidebar line is money (count from the top). 0 = auto by name.",
               0,
               15,
               1,
               () -> this.fakeStatsMoneyLine,
               var1 -> this.fakeStatsMoneyLine = (int)var1
            )
         )
         .addSetting(new com.wimpyclient.j.g("Shards", "Fake shard count. Blank = off.", 32, () -> this.fakeStatsShards, var1 -> this.fakeStatsShards = var1))
         .addSetting(
            new com.wimpyclient.j.d(
               "Shards Line",
               "Which sidebar line is shards. 0 = auto by name.",
               0,
               15,
               1,
               () -> this.fakeStatsShardsLine,
               var1 -> this.fakeStatsShardsLine = (int)var1
            )
         )
         .addSetting(new com.wimpyclient.j.g("Kills", "Fake kill count. Blank = off.", 32, () -> this.fakeStatsKills, var1 -> this.fakeStatsKills = var1))
         .addSetting(
            new com.wimpyclient.j.d(
               "Kills Line",
               "Which sidebar line is kills. 0 = auto by name.",
               0,
               15,
               1,
               () -> this.fakeStatsKillsLine,
               var1 -> this.fakeStatsKillsLine = (int)var1
            )
         )
         .addSetting(new com.wimpyclient.j.g("Deaths", "Fake death count. Blank = off.", 32, () -> this.fakeStatsDeaths, var1 -> this.fakeStatsDeaths = var1))
         .addSetting(
            new com.wimpyclient.j.d(
               "Deaths Line",
               "Which sidebar line is deaths. 0 = auto by name.",
               0,
               15,
               1,
               () -> this.fakeStatsDeathsLine,
               var1 -> this.fakeStatsDeathsLine = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.g(
               "Playtime", "Fake playtime, any text. Blank = off.", 32, () -> this.fakeStatsPlaytime, var1 -> this.fakeStatsPlaytime = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "Playtime Line",
               "Which sidebar line is playtime. 0 = auto by name.",
               0,
               15,
               1,
               () -> this.fakeStatsPlaytimeLine,
               var1 -> this.fakeStatsPlaytimeLine = (int)var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Sidebar", "Rewrite the server scoreboard (leaderboard) on the right.", () -> this.fakeStatsSidebar, var1 -> this.fakeStatsSidebar = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Tab List",
               "Rewrite money and other fake stats in the tab header and footer (bottom-left money). Ping is never changed.",
               () -> this.fakeStatsTab,
               var1 -> this.fakeStatsTab = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Balance Command",
               "Intercept /bal & /balance to show your fake balance.",
               () -> this.fakeStatsBalanceCommand,
               var1 -> this.fakeStatsBalanceCommand = var1
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Deduct On Pay",
               "Subtract what you pay from Money when a fake pay is used.",
               () -> this.fakeStatsDeductOnPay,
               var1 -> this.fakeStatsDeductOnPay = var1
            )
         )
   );
   public String skinChangerName = "";
   public final v skinChanger = this.register(
      new v("skin_changer", w.CLIENT, false)
         .addSetting(
            new com.wimpyclient.j.g(
               "Username", "Skin to apply to every player (blank = default Steve)", 16, () -> this.skinChangerName, var1 -> this.skinChangerName = var1
            )
         )
   );

   public boolean discordRpcEnabled() {
      return this.discordRpc.qn();
   }

   public float swingSpeedMultiplier() {
      return Math.max(0.1F, this.swingSpeedTenths / 10.0F);
   }

   private x() {
   }

   private v buildPrimeSusFinderModule() {
      return addMarkerSettings(
         new v("prime_sus_finder", w.WORLD, false)
            .addSetting(
               new com.wimpyclient.j.d(
                  "Simulation Distance",
                  "Chunk radius around you to scan for looted amethyst geodes",
                  1,
                  16,
                  1,
                  () -> this.primeSusSimulationDistance,
                  var1 -> {
                     this.primeSusSimulationDistance = (int)var1;
                     com.wimpyclient.f.a.INSTANCE.invalidateAllSusScans();
                  }
               )
            )
            .addSetting(
               new com.wimpyclient.j.d(
                  "Sensitivity",
                  "Leftover hanging clusters required on the geode before it is marked. 1 = 4, 5 = 8, 10 = 22",
                  1,
                  10,
                  1,
                  () -> this.primeSusSensitivity,
                  var1 -> {
                     this.primeSusSensitivity = (int)var1;
                     com.wimpyclient.f.a.INSTANCE.invalidateAllSusScans();
                  }
               )
            )
            .addSetting(
               new com.wimpyclient.j.d(
                  "Mark Alpha %", "Opacity of prime-sus planes", 5, 100, 5, () -> this.primeSusAlphaPercent, var1 -> this.primeSusAlphaPercent = (int)var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.d(
                  "Render Y", "World Y the chunk plane is drawn at", -64, 320, 1, () -> this.primeSusRenderY, var1 -> this.primeSusRenderY = (int)var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.a(
                  "Likelihood Text",
                  "Show % chance text above each prime-sus chunk",
                  () -> this.primeSusLikelihoodText,
                  var1 -> this.primeSusLikelihoodText = var1
               )
            )
            .addSetting(
               new com.wimpyclient.j.a(
                  "Cluster Icons",
                  "Geode HUD icon labelled with the recovered cluster count, even below the mark threshold",
                  () -> this.primeSusClusterIcons,
                  var1 -> {
                     this.primeSusClusterIcons = var1;
                     if (!var1) {
                        com.wimpyclient.e.a.INSTANCE.clearAllAmethystClusterIcons();
                     } else {
                        com.wimpyclient.f.a.INSTANCE.invalidateSusScansKeepMarks();
                        com.wimpyclient.e.a.INSTANCE.requestRenderRebuild();
                     }
                  }
               )
            )
            .addSetting(
               new com.wimpyclient.j.a(
                  "Sound", "Play a sound when a new prime-sus chunk is marked", () -> this.primeSusSound, var1 -> this.primeSusSound = var1
               )
            ),
         this.primeSusStyle
      );
   }

   private v buildStorageModule() {
      v var1 = new v("storage", w.WORLD, true)
         .addSetting(
            new com.wimpyclient.j.d(
               "Chunks / Pass",
               "How many chunks Storage ESP sweeps each pass (max 8)",
               1,
               8,
               1,
               () -> this.chunksPerScan,
               var1x -> this.chunksPerScan = (int)var1x
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "ESP Opacity %",
               "Highlight opacity for storage blocks",
               10,
               100,
               5,
               () -> this.storageAlphaPercent,
               var1x -> this.storageAlphaPercent = (int)var1x
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Tracers", "Draw a line from you to each marker", () -> this.storageStyle.tracers, var1x -> this.storageStyle.tracers = var1x
            )
         );

      for (aa var5 : this.storageTypes) {
         var1.addSetting(
            new com.wimpyclient.j.a(
               var5.enableSettingName(), "Show " + var5.label.toLowerCase() + " markers", () -> var5.enabled, var1x -> var5.enabled = var1x
            )
         );
         var1.addSetting(
            new com.wimpyclient.j.b(
               var5.colorSettingName(),
               "Color for " + var5.label.toLowerCase(),
               () -> var5.red,
               () -> var5.green,
               () -> var5.blue,
               var1x -> var5.red = var1x,
               var1x -> var5.green = var1x,
               var1x -> var5.blue = var1x
            )
         );
      }

      return var1;
   }

   private v buildEntityEspModule() {
      v var1 = new v("entity_esp", w.VISUAL, false)
         .addSetting(
            new com.wimpyclient.j.g(
               "Search",
               "Filter the entity list. Empty search lists only enabled types",
               32,
               () -> this.entityEspSearch,
               var1x -> this.entityEspSearch = var1x == null ? "" : var1x.trim()
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "ESP Opacity %",
               "Highlight opacity for marked entities",
               10,
               100,
               5,
               () -> this.entityEspAlphaPercent,
               var1x -> this.entityEspAlphaPercent = (int)var1x
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Tracers", "Draw a line from you to each marked entity", () -> this.entityEspStyle.tracers, var1x -> this.entityEspStyle.tracers = var1x
            )
         )
         .addSetting(
            new com.wimpyclient.j.b(
               "Color",
               "Color for all marked entities",
               () -> this.entityEspRed,
               () -> this.entityEspGreen,
               () -> this.entityEspBlue,
               var1x -> this.entityEspRed = var1x,
               var1x -> this.entityEspGreen = var1x,
               var1x -> this.entityEspBlue = var1x
            )
         );

      for (m var3 : this.entityEspTypes) {
         var1.addSetting(new com.wimpyclient.j.a(var3.enableSettingName(), "Show ESP for " + var3.label, () -> var3.enabled, var1x -> var3.enabled = var1x));
      }

      return var1;
   }

   private v buildBlockEspModule() {
      v var1 = new v("block_esp", w.VISUAL, false)
         .addSetting(
            new com.wimpyclient.j.g(
               "Search",
               "Filter placeable blocks. Empty search lists only enabled blocks",
               32,
               () -> this.blockEspSearch,
               var1x -> this.blockEspSearch = var1x == null ? "" : var1x.trim()
            )
         )
         .addSetting(
            new com.wimpyclient.j.d(
               "ESP Opacity %",
               "Highlight opacity for marked blocks",
               10,
               100,
               5,
               () -> this.blockEspAlphaPercent,
               var1x -> this.blockEspAlphaPercent = (int)var1x
            )
         )
         .addSetting(
            new com.wimpyclient.j.a(
               "Tracers", "Draw a line from you to each marked block", () -> this.blockEspStyle.tracers, var1x -> this.blockEspStyle.tracers = var1x
            )
         );

      for (k var3 : this.blockEspTypes) {
         this.blockEspBySettingName.put(var3.enableSettingName(), var3);
         this.blockEspBySettingName.put(var3.colorSettingName(), var3);
         var1.addSetting(new com.wimpyclient.j.a(var3.enableSettingName(), "Show ESP for " + var3.label, () -> var3.enabled, var1x -> {
            var3.enabled = var1x;
            com.wimpyclient.e.a.INSTANCE.clearBlockEsp();
            com.wimpyclient.f.a.INSTANCE.requestBlockEspRescan();
         }));
         var1.addSetting(
            new com.wimpyclient.j.b(
               var3.colorSettingName(),
               "Color for " + var3.label,
               () -> var3.red,
               () -> var3.green,
               () -> var3.blue,
               var1x -> var3.red = var1x,
               var1x -> var3.green = var1x,
               var1x -> var3.blue = var1x
            )
         );
      }

      return var1;
   }

   public boolean hasAnyBlockEspEnabled() {
      for (k var2 : this.blockEspTypes) {
         if (var2.enabled) {
            return true;
         }
      }

      return false;
   }

   public aa storageSettingsFor(Block var1) {
      return aa.resolve(var1, this.storageTypes);
   }

   public aa storageSettingsForTypeId(String var1) {
      return aa.resolveFromTypeId(var1, this.storageTypes);
   }

   public boolean isStorageTypeEnabled(Block var1) {
      aa var2 = this.storageSettingsFor(var1);
      return var2 != null && var2.enabled;
   }

   private static v addMarkerSettings(v var0, u var1) {
      return var0.addSetting(new com.wimpyclient.j.a("Tracers", "Draw a line from you to each marker", () -> var1.tracers, var1x -> var1.tracers = var1x))
         .addSetting(
            new com.wimpyclient.j.b(
               "Color",
               "Pick marker color on the wheel",
               () -> var1.red,
               () -> var1.green,
               () -> var1.blue,
               var1x -> var1.red = var1x,
               var1x -> var1.green = var1x,
               var1x -> var1.blue = var1x
            )
         );
   }

   private v register(v var1) {
      this.modules.add(var1);
      return var1;
   }

   private v registerOptional(v var1, boolean var2) {
      if (var2) {
         this.modules.add(var1);
      }

      return var1;
   }

   public List<KeyMapping> registerKeybinds(Category var1, KeyMapping var2, boolean var3) {
      ArrayList var4 = new ArrayList();
      var4.add(var2);

      for (v var6 : this.modules) {
         if (var6 == this.clickGui) {
            var6.setKeybind(var2);
         } else if (var6 != this.accounts) {
            KeyMapping var7 = new KeyMapping("key.wimpyclient.module." + var6.id(), Type.KEYSYM, InputConstants.UNKNOWN.getValue(), var1);
            if (!var3) {
               KeyBindingHelper.registerKeyBinding(var7);
            }

            var6.setKeybind(var7);
            var4.add(var7);
         }
      }

      return var4;
   }

   public void tickKeybinds() {
      boolean var1 = LicenseGate.isAuthorized();

      for (v var3 : this.modules) {
         KeyMapping var4 = var3.keybind();
         if (var4 != null) {
            if (!var1) {
               while (var4.consumeClick()) {
               }
            } else if (var3 != this.clickGui && var3 != this.autoCrystal && var3 != this.autoAnchor) {
               while (var4.consumeClick()) {
                  var3.qr();
               }
            } else {
               while (var4.consumeClick()) {
               }
            }
         }
      }
   }

   public int disableAllForLicense() {
      int var1 = 0;

      for (v var3 : this.modules) {
         if (var3 != this.discordRpc && var3.qn()) {
            var3.qq(false);
            var1++;
         }
      }

      return var1;
   }

   public b$a staffDetectConfig() {
      if (this.cachedStaffConfig != null
         && this.hudStaffDetectBy.equals(this.cachedStaffDetectBy)
         && this.hudStaffNames.equals(this.cachedStaffNames)
         && this.hudStaffRankKeywords.equals(this.cachedStaffKeywords)
         && this.hudStaffStarSymbols.equals(this.cachedStaffSymbols)
         && this.hudStaffFontIcons == this.cachedStaffFontIcons
         && this.hudStaffVanished == this.cachedStaffVanished) {
         return this.cachedStaffConfig;
      } else {
         List var1 = parseStaffKeywords(this.hudStaffRankKeywords);
         this.cachedStaffConfig = new b$a(
            this.hudStaffDetectBy,
            parseStaffNames(this.hudStaffNames),
            var1.isEmpty() ? com.wimpyclient.n.b.DEFAULT_RANK_KEYWORDS : var1,
            this.hudStaffStarSymbols,
            this.hudStaffFontIcons,
            this.hudStaffVanished
         );
         this.cachedStaffDetectBy = this.hudStaffDetectBy;
         this.cachedStaffNames = this.hudStaffNames;
         this.cachedStaffKeywords = this.hudStaffRankKeywords;
         this.cachedStaffSymbols = this.hudStaffStarSymbols;
         this.cachedStaffFontIcons = this.hudStaffFontIcons;
         this.cachedStaffVanished = this.hudStaffVanished;
         return this.cachedStaffConfig;
      }
   }

   private static Set<String> parseStaffNames(String var0) {
      HashSet var1 = new HashSet<>(com.wimpyclient.n.a.ALL_LOWER);

      for (String var5 : var0.split("[,\\s]+")) {
         if (!var5.isEmpty()) {
            var1.add(var5.toLowerCase(Locale.ROOT));
         }
      }

      return var1;
   }

   private static List<String> parseStaffKeywords(String var0) {
      ArrayList var1 = new ArrayList();

      for (String var5 : var0.split("[,\\s]+")) {
         String var6 = var5.trim().toLowerCase(Locale.ROOT);
         if (!var6.isEmpty()) {
            var1.add(var6);
         }
      }

      return var1;
   }

   public List<v> modules() {
      return Collections.unmodifiableList(this.modules);
   }

   public List<v> modulesIn(w var1) {
      return this.modulesByCategory().getOrDefault(var1, List.of());
   }

   private Map<w, List<v>> modulesByCategory() {
      if (this.modulesByCategory != null) {
         return this.modulesByCategory;
      } else {
         EnumMap var1 = new EnumMap<>(w.class);

         for (w var5 : w.values()) {
            var1.put(var5, new ArrayList());
         }

         for (v var8 : this.modules) {
            ((List)var1.get(var8.category())).add(var8);
         }

         EnumMap var7 = new EnumMap<>(w.class);

         for (Entry var10 : ((EnumMap<w, List<v>>)var1).entrySet()) {
            var7.put((w)var10.getKey(), Collections.unmodifiableList((List)var10.getValue()));
         }

         this.modulesByCategory = var7;
         return var7;
      }
   }

   public boolean isPrimeSusFinderEnabled() {
      return this.primeSusFinder.qo();
   }

   public boolean isChunkScanEnabled() {
      return this.primeSusFinder.qo();
   }

   public int chunkScanSimulationDistance() {
      return this.primeSusFinder.qo() ? this.primeSusSimulationDistance : 1;
   }

   public boolean needsWorldScan() {
      return this.primeSusFinder.qo()
         || this.storage.qo()
         || this.growthDebug.qo()
         || this.baseDebug.qo()
         || this.yHideBases.qo()
         || this.playerMarker.qo()
         || this.entityEsp.qo()
         || this.blockEsp.qo()
         || this.spawnerFinder.qo()
         || this.nbtBypass.qo()
         || this.schematicBuilder.qo();
   }
}
