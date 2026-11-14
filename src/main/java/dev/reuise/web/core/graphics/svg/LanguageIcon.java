package dev.reuise.web.core.graphics.svg;

public final class LanguageIcon implements BuiltinIcon {
    public static final LanguageIcon INSTANCE = new LanguageIcon();
    private LanguageIcon() {}
    @Override public String path() {
        return "M3 5 H14 M8 3 V5 M12 5 C12 9 9 12 4 14 M6 8 C7 10 9 12 12 13 M13 20 L17 10 L21 20 M14.5 17 H19.5";
    }
}
