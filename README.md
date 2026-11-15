# OpenWimpy

Source reconstruction of **WimpyClient 1.0.18** for Minecraft 1.21.11 (Fabric).

The original jar was decompiled and the full tree was repaired until it compiles
cleanly. The obfuscation layer is preserved as shipped: hash-threaded control
flow, byte/boolean masks, and encrypted string constants are still in place.
Methods that the decompiler could not handle were reconstructed by hand from
their bytecode.

## Requirements

- JDK 21
- No local Gradle install needed, the wrapper is included

## Build

```bash
./gradlew build
```

Output jar: `build/libs/openwimpy-1.0.18.jar`

For a compile-only check:

```bash
./gradlew compileJava
```

## Layout

```
src/main/java/com/wimpyclient/
  Wimpy.java              logger / mod id holder
  WimpyClient.java        client entrypoint
  LicenseLifecycle.java   license state
  localauth/              license adapter, loader
  i/aj.java               main feature implementation
  m/b.java                NanoVG rendering context
  mixin/                  mixins
  rfaqachqmqhtmqjp/       obfuscation runtime (required, do not remove)
src/main/resources/
  assets/                 textures, shaders, sounds
  META-INF/jars/          bundled NanoVG jars
  fabric.mod.json         mod metadata
```

## Notes

- Mappings: Mojang official, resolved through Fabric Loom.
- NanoVG natives are bundled under `META-INF/jars` and loaded at runtime.
- Target versions live in `gradle.properties`.
- Original mod by Zylexz. This repository is a reconstructed source tree of
  the released 1.0.18 build.
