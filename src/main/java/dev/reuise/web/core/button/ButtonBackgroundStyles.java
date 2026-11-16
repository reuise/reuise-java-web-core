package dev.reuise.web.core.button;

import dev.reuise.core.Interaction;
import dev.reuise.core.button.ButtonType;
import dev.reuise.core.theme.ComponentTheme;
import dev.reuise.core.theme.ThemeColorSet;
import dev.reuise.web.core.style.StyleOptions;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleProperty;

/** Theme colour inputs never overwrite a caller's background-color declaration. */
public final class ButtonBackgroundStyles {
    private static final StyleProperty LOCAL = new StyleProperty("--reuise-button-local-background-color");
    private static final StyleProperty DOCUMENT = new StyleProperty("--reuise-button-document-background-color");

    private ButtonBackgroundStyles() {}

    public static void initializeCommonStyles(StyleBuilder styles, String baseClass) {
        Style style = styles.addRule(":where(." + baseClass + ")");
        setInput(style, LOCAL, "initial");
        setInput(style, DOCUMENT, "initial");
        style.setBackgroundColor("var(--reuise-button-local-background-color, "
                + "var(--reuise-button-document-background-color, transparent))");
    }

    public static void setLocal(Style style, ComponentTheme theme, ButtonType type, Interaction interaction) {
        setInput(style, LOCAL, colour(theme, type, interaction));
    }

    public static void setDocument(Style style, ComponentTheme theme, ButtonType type, Interaction interaction) {
        setInput(style, DOCUMENT, colour(theme, type, interaction));
    }

    private static String colour(ComponentTheme theme, ButtonType type, Interaction interaction) {
        ThemeColorSet colours = theme == null ? null
                : type == ButtonType.PRIMARY ? theme.getPrimaryColor() : theme.getSecondaryColor();
        return colours == null || colours.getColor(interaction) == null
                ? "initial" : colours.getColor(interaction).toCss();
    }

    private static void setInput(Style style, StyleProperty property, String value) {
        StyleOptions input = new StyleOptions();
        input.setProperty(property, value, false);
        style.append(input);
    }
}
