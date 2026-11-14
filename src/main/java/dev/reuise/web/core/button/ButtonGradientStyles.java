package dev.reuise.web.core.button;

import dev.reuise.core.Interaction;
import dev.reuise.core.button.ButtonType;
import dev.reuise.core.theme.ComponentTheme;
import dev.reuise.core.theme.ThemeColorRole;
import dev.reuise.web.core.style.StyleOptions;
import dev.reuise.web.core.style.ThemeBackgroundStyles;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleProperty;

public final class ButtonGradientStyles {
    private static final StyleProperty LOCAL = new StyleProperty("--reuise-button-local-gradient");
    private static final StyleProperty DOCUMENT = new StyleProperty("--reuise-button-document-gradient");
    private static final StyleProperty LOCAL_BLEND = new StyleProperty("--reuise-button-local-blend");
    private static final StyleProperty DOCUMENT_BLEND = new StyleProperty("--reuise-button-document-blend");

    private ButtonGradientStyles() {
    }

    public static void initializeCommonStyles(StyleBuilder styles, String baseClass) {
        Style style = styles.addRule(":where(." + baseClass + ")");
        setInput(style, LOCAL, "initial");
        setInput(style, DOCUMENT, "initial");
        setInput(style, LOCAL_BLEND, "initial");
        setInput(style, DOCUMENT_BLEND, "initial");
        style.setBackgroundImage("var(--reuise-button-local-gradient, var(--reuise-button-document-gradient, none))");
        setInput(style, new StyleProperty("background-blend-mode"),
                "var(--reuise-button-local-blend, var(--reuise-button-document-blend, normal))");
    }

    public static void setLocal(Style style, ComponentTheme theme, ButtonType type, Interaction interaction) {
        ThemeBackgroundStyles.setInputs(style, LOCAL, LOCAL_BLEND, theme, role(type), interaction);
    }

    public static void setDocument(Style style, ComponentTheme theme, ButtonType type, Interaction interaction) {
        ThemeBackgroundStyles.setInputs(style, DOCUMENT, DOCUMENT_BLEND, theme, role(type), interaction);
    }

    private static ThemeColorRole role(ButtonType type) {
        return type == ButtonType.PRIMARY ? ThemeColorRole.PRIMARY : ThemeColorRole.SECONDARY;
    }

    private static void setInput(Style style, StyleProperty property, String value) {
        StyleOptions input = new StyleOptions();
        input.setProperty(property, value, false);
        style.append(input);
    }
}
