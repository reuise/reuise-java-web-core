package dev.reuise.web.core.banner;

import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleProperty;
import dev.reuise.web.core.style.StyleOptions;
import dev.reuise.web.core.style.SpacingScale;

public final class BannerStyles {
    private BannerStyles() {}

    public static void initialize(StyleBuilder commonStyles) {
        NoticeStyles.initialize(commonStyles, ".reuise-banner", ".reuise-banner_actions");
        Style banner = commonStyles.addRule(":where(.reuise-banner)")
                .setFlexWrap("wrap").setAlignItems("center")
                .setBackgroundColor("var(--reuise-banner-background, var(--reuise-minimal-surface, #ffffff))")
                .setColor("var(--reuise-banner-color, var(--reuise-minimal-text, #1d1b20))")
                .setBorderColor("var(--reuise-banner-border, var(--reuise-minimal-border, #cac4d0))");
        property(banner, "gap", SpacingScale.value(12));
        commonStyles.addRule(":where(.reuise-banner[data-tone=\"informational\"])")
                .setBackgroundColor("var(--reuise-banner-background, #e8f1ff)")
                .setColor("var(--reuise-banner-color, #102d54)")
                .setBorderColor("var(--reuise-banner-border, #7594bc)");
        commonStyles.addRule(":where(.reuise-banner[data-tone=\"warning\"])")
                .setBackgroundColor("var(--reuise-banner-background, #fff4d6)")
                .setColor("var(--reuise-banner-color, #4d3500)")
                .setBorderColor("var(--reuise-banner-border, #a68a45)");
        property(commonStyles.addRule(":where(.reuise-banner_content)")
                .setFlex("1 1 16rem").setMinWidth(0).setMaxWidth("100%"), "overflow-wrap", "anywhere");
        commonStyles.addRule(":where(.reuise-banner_message)").setMargin(0);
        commonStyles.addRule(":where(.reuise-banner_icon,.reuise-banner_dismissbutton)")
                .setFlexShrink(0);
        property(commonStyles.addRule(":where(.reuise-banner_actions)")
                .setMaxWidth("100%").setMinWidth(0), "gap", SpacingScale.value(8));
        property(commonStyles.addRule(":where(.reuise-banner_actions>*)")
                .setMaxWidth("100%").setWhiteSpace("normal"), "overflow-wrap", "anywhere");
        property(commonStyles.addRule(":where(.reuise-banner_dismissbutton)")
                .setMaxWidth("100%").setWhiteSpace("normal"), "overflow-wrap", "anywhere");
        property(commonStyles.addRule(".reuise-banner_actions .reuise-button_label,"
                + ".reuise-banner_dismissbutton .reuise-button_label")
                .setWhiteSpace("normal").setMinWidth(0), "overflow-wrap", "anywhere");
        commonStyles.addRule(".reuise-banner_actions:empty,.reuise-banner_message:empty")
                .setDisplay("none");
        commonStyles.addRule(".reuise-banner[hidden],.reuise-banner_dismissbutton[hidden]")
                .setDisplay("none", true);
    }

    private static void property(Style style, String name, String value) {
        StyleOptions input = new StyleOptions();
        input.setProperty(new StyleProperty(name), value, false);
        style.append(input);
    }
}
