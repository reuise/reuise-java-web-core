package dev.reuise.web.core.graphics.svg;

public final class CheckIcon implements BuiltinIcon {
    public static final CheckIcon INSTANCE = new CheckIcon();
    private CheckIcon() {}
    @Override public String path() { return "M4 12 L9 17 L20 6"; }
}
