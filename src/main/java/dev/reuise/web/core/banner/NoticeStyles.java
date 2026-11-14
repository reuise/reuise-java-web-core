package dev.reuise.web.core.banner;

import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.web.core.style.SpacingScale;

/** Presentation shared by announcement and consent notices, with no shared behavior. */
public final class NoticeStyles {
    private NoticeStyles() {}

    public static void initialize(StyleBuilder commonStyles, String selector, String actionsSelector) {
        commonStyles.addRule(":where(" + selector + ")").setPadding(SpacingScale.value(16));
        commonStyles.addRule(":where(" + selector + ")")
                .setBackgroundColor("var(--reuise-minimal-surface, #ffffff)")
                .setColor("var(--reuise-minimal-text, #1d1b20)")
                .setBorder("1px solid var(--reuise-minimal-border, #cac4d0)");
        commonStyles.addRule(actionsSelector).setFlexWrap("wrap");
    }
}
