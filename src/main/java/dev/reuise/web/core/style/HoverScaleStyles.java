package dev.reuise.web.core.style;

import dev.reuise.web.core.WebComponent;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleProperty;
import dev.reuise.webstyles.StyleSheet;

/** Shared opt-in hover growth using individual scale, without replacing transforms. */
public final class HoverScaleStyles {
    private HoverScaleStyles() {}

    public static void apply(WebComponent component, Double factor) {
        if (factor == null || factor.isNaN() || factor.isInfinite() || factor < 1)
            throw new IllegalArgumentException("HoverScale must be finite and at least 1");
        component.setData("hoverscale", factor.toString());
        component.addOrRemoveStyleClass("reuise-hover-scale", factor > 1);
        StyleOptions input = new StyleOptions();
        input.setProperty(new StyleProperty("--reuise-hover-scale"), factor.toString(), false);
        component.getStyle().append(input);
    }

    public static void initializeCommonStyles(StyleBuilder styles) {
        styles.addRule(":where(.reuise-hover-scale:not(.reuise-button))").setTransition("scale 160ms ease-out");
        StyleSheet media = styles.addAtRule("media (hover: hover) and (pointer: fine) and (prefers-reduced-motion: no-preference)");
        String eligible = ".reuise-hover-scale:not(:disabled):not([aria-disabled=\"true\"])"
                + ":not([inert]):not(.reuise-disabled):not(.reuise-loading-skeleton)";
        Style rule = media.addRule(":where(" + eligible + ":hover," + eligible + ":focus-visible)");
        StyleOptions scale = new StyleOptions();
        scale.setProperty(new StyleProperty("scale"), "var(--reuise-hover-scale, 1)", false);
        rule.append(scale);
    }

    /** Horizontal factor from a computed CSS individual-scale value. */
    public static double horizontalScale(String value) {
        if (value == null || value.isEmpty() || "none".equals(value)) return 1;
        return Math.abs(Double.parseDouble(value.trim().split("\\s+")[0]));
    }
}
