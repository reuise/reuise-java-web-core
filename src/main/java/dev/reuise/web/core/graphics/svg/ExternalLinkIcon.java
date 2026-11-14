package dev.reuise.web.core.graphics.svg;

public final class ExternalLinkIcon implements BuiltinIcon {
    public static final ExternalLinkIcon INSTANCE = new ExternalLinkIcon();
    private ExternalLinkIcon() {}
    @Override public String path() {
        return "M11 5 H5 V19 H19 V13 M13 5 H19 V11 M19 5 L10 14";
    }
}
