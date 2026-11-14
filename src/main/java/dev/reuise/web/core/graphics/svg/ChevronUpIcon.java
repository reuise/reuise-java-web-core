package dev.reuise.web.core.graphics.svg;

public final class ChevronUpIcon implements BuiltinIcon {
    public static final ChevronUpIcon INSTANCE = new ChevronUpIcon();
    private ChevronUpIcon() {}
    @Override public String path() { return "M5 15 L12 8 L19 15"; }
}
