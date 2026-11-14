package dev.reuise.web.core.graphics.svg;

public final class ChevronRightIcon implements DirectionalBuiltinIcon {
    public static final ChevronRightIcon INSTANCE = new ChevronRightIcon();
    private ChevronRightIcon() {}
    @Override public String path() { return "M9 5 L16 12 L9 19"; }
}
