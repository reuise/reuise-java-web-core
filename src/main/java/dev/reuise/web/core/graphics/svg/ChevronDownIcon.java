package dev.reuise.web.core.graphics.svg;

public final class ChevronDownIcon implements BuiltinIcon {
    public static final ChevronDownIcon INSTANCE = new ChevronDownIcon();
    private ChevronDownIcon() {}
    @Override public String path() { return "M5 9 L12 16 L19 9"; }
}
