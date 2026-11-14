package dev.reuise.web.core.graphics.svg;

public final class InformationIcon implements BuiltinIcon {
    public static final InformationIcon INSTANCE = new InformationIcon();
    private InformationIcon() {}
    @Override public String path() {
        return "M12 3 A9 9 0 1 0 12 21 A9 9 0 1 0 12 3 M12 11 V17 M12 7 V7.1";
    }
}
