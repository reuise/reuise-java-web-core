package dev.reuise.web.core.graphics.svg;

public final class ChevronLeftIcon implements DirectionalBuiltinIcon {
    public static final ChevronLeftIcon INSTANCE = new ChevronLeftIcon();
    private ChevronLeftIcon() {}
    @Override public String path() { return "M15 5 L8 12 L15 19"; }
}
