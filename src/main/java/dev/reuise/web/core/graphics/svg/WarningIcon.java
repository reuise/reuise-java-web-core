package dev.reuise.web.core.graphics.svg;

public final class WarningIcon implements BuiltinIcon {
    public static final WarningIcon INSTANCE = new WarningIcon();
    private WarningIcon() {}
    @Override public String path() {
        return "M12 3 L22 20 H2 Z M12 9 V14 M12 17 V17.1";
    }
}
