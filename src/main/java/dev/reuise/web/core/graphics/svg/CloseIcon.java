package dev.reuise.web.core.graphics.svg;

public final class CloseIcon implements BuiltinIcon {
    public static final CloseIcon INSTANCE = new CloseIcon();
    private CloseIcon() {}
    @Override public String path() { return "M5 5 L19 19 M19 5 L5 19"; }
}
