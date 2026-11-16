package dev.reuise.web.core.graphics.svg;

public final class EllipsisIcon implements BuiltinIcon {
    public static final EllipsisIcon INSTANCE = new EllipsisIcon();
    private EllipsisIcon() {}
    @Override public String path() {
        return "M6 12 a1 1 0 1 1 -2 0 a1 1 0 1 1 2 0 z "
                + "M13 12 a1 1 0 1 1 -2 0 a1 1 0 1 1 2 0 z "
                + "M20 12 a1 1 0 1 1 -2 0 a1 1 0 1 1 2 0 z";
    }
}
