package dev.reuise.web.core.graphics.svg;

public final class PlayIcon implements BuiltinIcon {
    public static final PlayIcon INSTANCE = new PlayIcon();
    private PlayIcon() {}
    @Override public boolean isFilled() { return true; }
    @Override public String path() { return "M8 5 L19 12 L8 19 Z"; }
}
