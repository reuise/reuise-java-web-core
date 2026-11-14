package dev.reuise.web.core.graphics.svg;

public final class UserIcon implements BuiltinIcon {
    public static final UserIcon INSTANCE = new UserIcon();
    private UserIcon() {}
    @Override public String path() {
        return "M12 12 A4 4 0 1 0 12 4 A4 4 0 1 0 12 12 M4 20 C4 15 7 13 12 13 C17 13 20 15 20 20 Z";
    }
}
