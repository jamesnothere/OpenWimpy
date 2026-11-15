package com.wimpyclient.localauth;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HexFormat;
import java.util.function.BiConsumer;

/**
 * Clean reimplementation of the license transport.
 *
 * The encrypted payload is replaced by a pre-decrypted zip bundled in this jar as
 * {@code /wimpy-payload.bin}. Activation mounts it through the stock payload
 * mounter ({@link d}), so the rest of the mod (payload classes, entrypoints,
 * Fabric wiring) behaves exactly as it does with a legitimately activated key.
 *
 * Session verification, heartbeats and server round-trips are no-ops: there is
 * no server left to talk to.
 */
public final class LicenseLoader {

    /** Bundled, already-decrypted payload zip. */
    private static final String PAYLOAD_RESOURCE = "/wimpy-payload.bin";

    /** Far-future expiry (2100-01-01T00:00:00Z), epoch seconds. */
    private static final long PERPETUAL_EXPIRY = 4102444800L;

    /** Tier reported to feature gates. */
    private static final String TIER = "free";

    private static volatile boolean loaded;
    private static volatile boolean mounted;
    private static volatile boolean clientReady;
    private static volatile String token;
    private static volatile long expiresAt;
    private static volatile String tier;
    private static volatile byte[] activeKeyHash;
    private static String payloadDigest = "";
    private static long payloadSize;

    /** Watermark, printed once on first activation. */
    private static final String WATERMARK = "WimpyClient 1.0.18 :: Cracked By JamesNotHere \u2764\uFE0F";
    private static volatile boolean watermarkPrinted;

    private LicenseLoader() {
    }

    /**
     * Prints the watermark as raw UTF-8 on the real stdout. System.out's charset
     * follows the console's native encoding on Windows and silently replaces the
     * heart with '?', so we bypass it with an explicitly UTF-8 stream.
     */
    private static void printWatermark() {
        try {
            System.out.flush();
            PrintStream utf8 = new PrintStream(
                    new FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8);
            utf8.println(WATERMARK);
            utf8.flush();
        } catch (Throwable t) {
            System.out.println(WATERMARK);
        }
    }

    // ------------------------------------------------------------------
    // activation
    // ------------------------------------------------------------------

    public static synchronized long activate(String key) {
        return activateAndLoad(key, null);
    }

    public static synchronized long activateAndLoad(String key, BiConsumer<String, Integer> progress) {
        if (!watermarkPrinted) {
            watermarkPrinted = true;
            printWatermark();
        }
        String normalized = normalizeKey(key);
        if (loaded) {
            // already mounted: just adopt the (new) key as current
            activeKeyHash = sha256(normalized);
            return expiresAt;
        }
        notify(progress, "Connecting", 2);
        notify(progress, "Checking key", 7);
        notify(progress, "Downloading client", 12);
        notify(progress, "Decrypting client", 90);

        byte[] payload = readBundledPayload();
        // This source tree already contains the (pre-decrypted) payload classes;
        // the outer loader's initPayload() wires the entrypoint. Validate the
        // bundled archive so a broken build fails loudly, then flip state.
        if (payload.length == 0) {
            throw new IllegalStateException("Bundled payload is empty");
        }
        mounted = true;
        payloadDigest = sha256Hex(payload);
        payloadSize = payload.length;

        notify(progress, "Loading classes", 95);
        notify(progress, "Starting client", 98);

        token = "local";
        tier = TIER;
        activeKeyHash = sha256(normalized);
        expiresAt = PERPETUAL_EXPIRY;
        loaded = true;
        return expiresAt;
    }

    // ------------------------------------------------------------------
    // state queries (signatures match the original transport exactly)
    // ------------------------------------------------------------------

    public static boolean isAuthorized() {
        return loaded && expiresAt > nowSeconds() && token != null;
    }

    public static boolean isPayloadMounted() {
        return mounted;
    }

    public static boolean isClientReady() {
        return clientReady;
    }

    public static void markClientReady() {
        clientReady = true;
    }

    public static boolean isFreeKey() {
        return TIER.equals(tier);
    }

    public static boolean isCurrentKey(String key) {
        if (!loaded || key == null || activeKeyHash == null) {
            return false;
        }
        byte[] candidate = sha256(normalizeKey(key));
        return MessageDigest.isEqual(candidate, activeKeyHash);
    }

    public static long expiresAtEpochSeconds() {
        return loaded ? expiresAt : 0L;
    }

    public static String hwid() {
        return sha256Hex("wimpy-local".getBytes(StandardCharsets.UTF_8));
    }

    // ------------------------------------------------------------------
    // session upkeep — all no-ops, nothing to talk to anymore
    // ------------------------------------------------------------------

    public static synchronized void verifySession() {
        if (!isAuthorized()) {
            clearAuthorization();
            throw new IllegalStateException("Key authorization is not established");
        }
    }

    public static synchronized void startHeartbeat(Runnable onSessionEnded) {
        // no-op: session never expires, no heartbeat needed
    }

    public static void startStoredKeyValidation(Runnable onOk, Runnable onFail) {
        Thread t = new Thread(() -> {
            try {
                activate(null);
                if (onOk != null) {
                    onOk.run();
                }
            } catch (Throwable throwable) {
                if (onFail != null) {
                    onFail.run();
                }
            }
        }, "wimpy-local-stored-key");
        t.setDaemon(true);
        t.start();
    }

    // ------------------------------------------------------------------
    // internals
    // ------------------------------------------------------------------

    private static void clearAuthorization() {
        loaded = false;
        mounted = false;
        clientReady = false;
        token = null;
        activeKeyHash = null;
    }

    private static String normalizeKey(String key) {
        if (key == null) {
            return TIER;
        }
        String trimmed = key.trim();
        return trimmed.isEmpty() ? TIER : trimmed;
    }

    private static void notify(BiConsumer<String, Integer> progress, String message, int code) {
        if (progress != null) {
            progress.accept(message, code);
        }
    }

    private static byte[] readBundledPayload() {
        InputStream in = LicenseLoader.class.getResourceAsStream(PAYLOAD_RESOURCE);
        if (in == null) {
            throw new IllegalStateException("Bundled payload missing: " + PAYLOAD_RESOURCE);
        }
        try (in) {
            return in.readAllBytes();
        } catch (Exception e) {
            throw new IllegalStateException("Failed to read bundled payload", e);
        }
    }

    private static long nowSeconds() {
        return System.currentTimeMillis() / 1000L;
    }

    private static byte[] sha256(String s) {
        return sha256(s.getBytes(StandardCharsets.UTF_8));
    }

    private static byte[] sha256(byte[] data) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(data);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private static String sha256Hex(byte[] data) {
        return HexFormat.of().formatHex(sha256(data));
    }
}
