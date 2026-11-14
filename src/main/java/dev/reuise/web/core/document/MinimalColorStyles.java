package dev.reuise.web.core.document;

import dev.reuise.core.ColorScheme;
import dev.reuise.web.core.style.StyleOptions;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleProperty;

/**
 * Dark defaults for minimal CSS. Light values are supplied as fallbacks by
 * components; applications can override the variables on the body or a
 * component, or override the properties directly.
 * The variables are {@code --reuise-minimal-surface}, {@code -text},
 * {@code -field}, {@code -outline}, {@code -overlay}, {@code -border} and
 * {@code -error}, each with the full {@code --reuise-minimal} prefix.
 * Page colors can be overridden with {@code --reuise-minimal-page-background}
 * and {@code --reuise-minimal-page-text}. LIGHT leaves these dark defaults
 * unset; DEVICE follows changes to the system preference.
 */
public final class MinimalColorStyles {
    private MinimalColorStyles() {
    }

    public static void initialize(StyleBuilder commonStyles) {
        initializeDark(commonStyles.addRule(":where(body[data-reuise-color-scheme=\"dark\"])"));
        initializeDark(commonStyles.addRule(":where(body:not([data-reuise-color-scheme]))", ColorScheme.DARK));
    }

    private static void initializeDark(Style style) {
        set(style, "--reuise-minimal-surface", "#242128");
        set(style, "--reuise-minimal-text", "#e6e1e5");
        set(style, "--reuise-minimal-field", "rgb(255 255 255 / 10%)");
        set(style, "--reuise-minimal-outline", "#938f99");
        set(style, "--reuise-minimal-overlay", "rgb(255 255 255 / 15%)");
        set(style, "--reuise-minimal-border", "#49454f");
        set(style, "--reuise-minimal-error", "#f2b8b5");
        style.setBackgroundColor("var(--reuise-minimal-page-background, #141218)");
        style.setColor("var(--reuise-minimal-page-text, #e6e1e5)");
    }

    private static void set(Style style, String name, String value) {
        StyleOptions input = new StyleOptions();
        input.setProperty(new StyleProperty(name), value, false);
        style.append(input);
    }
}
