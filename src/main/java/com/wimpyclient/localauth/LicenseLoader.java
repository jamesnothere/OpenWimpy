package com.wimpyclient.localauth;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HexFormat;
import java.util.function.BiConsumer;

/**
 * Local license transport.
 *
 * The original client decrypted and mounted an encrypted payload zip at
 * activation time. In this build the payload classes are already present in
 * the source tree, so activation is purely local state: no download, no
 * decryption, no mounting. Session verification and heartbeats are no-ops.
 */
public final class LicenseLoader {

    /** Far-future expiry (2100-01-01T00:00:00Z), epoch seconds. */
    private static final long PERPETUAL_EXPIRY = 4102444800L;

    /** Tier reported to feature gates. */
    private static final String TIER = "paid";

    private static volatile boolean loaded;
    private static volatile boolean mounted;
    private static volatile boolean clientReady;
    private static volatile String token;
    private static volatile long expiresAt;
    private static volatile String tier;
    private static volatile byte[] activeKeyHash;

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

        // Payload classes ship with this build; nothing to download or decrypt.
        mounted = true;

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
