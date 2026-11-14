package dev.reuise.web.core.graphics.svg;

public final class GlobeIcon implements BuiltinIcon {
    public static final GlobeIcon INSTANCE = new GlobeIcon();
    private GlobeIcon() {}
    @Override public String path() {
        return "M12 3 A9 9 0 1 0 12 21 A9 9 0 1 0 12 3 M3 12 H21 M12 3 C7 7 7 17 12 21 M12 3 C17 7 17 17 12 21";
    }
}
