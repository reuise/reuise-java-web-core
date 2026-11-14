package dev.reuise.web.core.graphics.svg;

public final class SearchIcon implements BuiltinIcon {
    public static final SearchIcon INSTANCE = new SearchIcon();
    private SearchIcon() {}
    @Override public String path() {
        return "M10 4 A6 6 0 1 0 10 16 A6 6 0 1 0 10 4 M14.5 14.5 L20 20";
    }
}
