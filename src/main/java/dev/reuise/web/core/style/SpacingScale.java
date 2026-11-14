package dev.reuise.web.core.style;

/**
 * Shared web spacing tokens. The supported defaults are 0, 2, 4, 6, 8, 12,
 * 16, 24, 32, 48 and 64 pixels. Override a nonzero step, for example,
 * {@code --reuise-space-16} on an ancestor or component to change that step.
 * Zero is always zero. The returned CSS values can also be used with existing
 * responsive style options.
 */
public final class SpacingScale {
    private SpacingScale() {}

    public static String value(int pixels) {
        switch (pixels) {
            case 0:
                return "0px";
            case 2: case 4: case 6: case 8: case 12:
            case 16: case 24: case 32: case 48: case 64:
                return "var(--reuise-space-" + pixels + ", " + pixels + "px)";
            default:
                throw new IllegalArgumentException("Unsupported spacing step: " + pixels);
        }
    }
}
