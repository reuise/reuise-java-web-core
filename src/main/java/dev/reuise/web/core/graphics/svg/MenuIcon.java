package dev.reuise.web.core.graphics.svg;

public final class MenuIcon implements BuiltinIcon {
    public static final MenuIcon INSTANCE = new MenuIcon();
    private MenuIcon() {}
    @Override public String path() { return "M4 6 H20 M4 12 H20 M4 18 H20"; }
}
