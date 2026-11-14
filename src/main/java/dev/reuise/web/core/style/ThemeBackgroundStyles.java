package dev.reuise.web.core.style;

import dev.reuise.core.Interaction;
import dev.reuise.core.theme.BackgroundOverlay;
import dev.reuise.core.theme.ComponentTheme;
import dev.reuise.core.theme.ThemeColorRole;
import dev.reuise.core.theme.ThemeGradientSet;
import dev.reuise.core.theme.ThemeOverlaySet;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleProperty;

public final class ThemeBackgroundStyles {
    private ThemeBackgroundStyles() {
    }

    public static void setInputs(Style style, StyleProperty imageProperty, StyleProperty blendProperty,
            ComponentTheme theme, ThemeColorRole role, Interaction interaction) {
        String image = "initial";
        String blend = "initial";
        if (theme != null) {
            ThemeGradientSet gradients = theme.getGradient(role);
            ThemeOverlaySet overlays = theme.getOverlay(role);
            BackgroundOverlay overlay = overlays == null ? null : overlays.getOverlay(interaction);
            String base = gradients == null ? null : gradients.getGradient(interaction).toCss();
            image = base == null ? "none" : base;
            blend = "normal";
            if (overlay != null) {
                image = overlay.toCss() + (base == null ? "" : ", " + base);
                blend = overlay.getBlendMode().toCss() + (base == null ? "" : ", normal");
            }
        }
        StyleOptions inputs = new StyleOptions();
        inputs.setProperty(imageProperty, image, false);
        inputs.setProperty(blendProperty, blend, false);
        style.append(inputs);
    }
}
