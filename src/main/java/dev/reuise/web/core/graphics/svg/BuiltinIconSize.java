package dev.reuise.web.core.graphics.svg;

/** Standard pixel sizes for built-in icons. */
public enum BuiltinIconSize {
    SMALL(16), MEDIUM(20), LARGE(24);

    private final int pixels;

    BuiltinIconSize(int pixels) {
        this.pixels = pixels;
    }

    public int getPixels() {
        return pixels;
    }
}
