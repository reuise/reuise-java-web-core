package dev.reuise.web.core.floating;

/** Shared normalization for backend rendering and frontend updates. */
public final class FloatingPresentation {
    private FloatingPresentation() {}

    public static String corner(String value) {
        return "top-left".equals(value) || "top-right".equals(value) || "bottom-left".equals(value)
                ? value : "bottom-right";
    }

    public static int unread(Integer value) {
        return value == null ? 0 : Math.max(0, value);
    }

    public static String badge(Integer value) {
        int count = unread(value);
        return count == 0 ? "" : count > 99 ? "99+" : Integer.toString(count);
    }

    public static String label(String value) {
        return value == null || value.trim().isEmpty() ? "Help" : value;
    }
}
