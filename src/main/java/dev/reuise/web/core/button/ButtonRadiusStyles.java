package dev.reuise.web.core.button;

import dev.reuise.core.theme.ComponentTheme;
import dev.reuise.web.core.style.StyleOptions;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleProperty;

/**
 * Button-only radius inputs: caller border-radius, then size, then local/document theme.
 * Theme updates never write the caller's border-radius declaration.
 */
public final class ButtonRadiusStyles {
    private static final StyleProperty SIZE = new StyleProperty("--reuise-button-size-radius");
    private static final StyleProperty LOCAL_THEME = new StyleProperty("--reuise-button-local-theme-radius");
    private static final StyleProperty DOCUMENT_THEME = new StyleProperty("--reuise-button-document-theme-radius");

    private ButtonRadiusStyles() {
    }

    public static void initializeCommonStyles(StyleBuilder commonStyles, String baseStyleClass) {
        Style style = commonStyles.addRule(":where(." + baseStyleClass + ")");
        // Reset inherited inputs, including for buttons nested inside a button-styled container.
        setInput(style, SIZE, "initial");
        setInput(style, LOCAL_THEME, "initial");
        setInput(style, DOCUMENT_THEME, "initial");
        style.setBorderRadius("var(--reuise-button-size-radius, var(--reuise-button-local-theme-radius, var(--reuise-button-document-theme-radius)))");
    }

    public static void setSizeRadius(Style style, int radius) {
        setInput(style, SIZE, radius + "px");
    }

    public static void setLocalThemeRadius(Style style, ComponentTheme theme) {
        setInput(style, LOCAL_THEME, themeRadius(theme));
    }

    public static void setDocumentThemeRadius(Style style, ComponentTheme theme) {
        setInput(style, DOCUMENT_THEME, themeRadius(theme));
    }

    private static String themeRadius(ComponentTheme theme) {
        // Zero historically means "no theme radius". initial makes var() use its fallback.
        return theme == null || theme.getCornerRadius() == 0 ? "initial" : theme.getCornerRadius() + "px";
    }

    private static void setInput(Style style, StyleProperty property, String value) {
        StyleOptions input = new StyleOptions();
        input.setProperty(property, value, false);
        style.append(input);
    }
}
