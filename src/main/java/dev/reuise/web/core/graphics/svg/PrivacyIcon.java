package dev.reuise.web.core.graphics.svg;

public final class PrivacyIcon implements BuiltinIcon {
    public static final PrivacyIcon INSTANCE = new PrivacyIcon();
    private PrivacyIcon() {}
    @Override public boolean isFilled() { return true; }
    @Override public String path() {
        return "M15.344 10.036a1 1 0 1 0-1.688-1.072l-2.474 3.896-.943-1.034a1 1 0 0 0-1.478 1.348l1.826 2a1 1 0 0 0 1.583-.138l3.174-5Z"
                + "M13.203 1.935a3 3 0 0 0-2.405 0l-6 2.625A3 3 0 0 0 3 7.308V13a9 9 0 1 0 18 0V7.308a3 3 0 0 0-1.797-2.748l-6-2.625Z"
                + "M11.599 3.767a1 1 0 0 1 .802 0l6 2.625a1 1 0 0 1 .599.916V13a7 7 0 1 1-14 0V7.308a1 1 0 0 1 .6-.916l6-2.625Z";
    }
}
