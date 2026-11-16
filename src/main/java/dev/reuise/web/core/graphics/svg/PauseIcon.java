package dev.reuise.web.core.graphics.svg;

public final class PauseIcon implements BuiltinIcon {
    public static final PauseIcon INSTANCE = new PauseIcon();
    private PauseIcon() {}
    @Override public boolean isFilled() { return true; }
    @Override public String path() { return "M6 5 H10 V19 H6 Z M14 5 H18 V19 H14 Z"; }
}
