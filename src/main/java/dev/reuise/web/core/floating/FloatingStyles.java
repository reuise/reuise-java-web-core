package dev.reuise.web.core.floating;

import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheet;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleProperty;
import dev.reuise.web.core.style.StyleOptions;
import dev.reuise.web.core.style.SpacingScale;

/** CSS-only responsiveness keeps server rendering and hydration consistent. */
public final class FloatingStyles {
    private FloatingStyles() {}

    public static void initialize(StyleBuilder styles) {
        gap(styles.addRule(".reuise-floatingactionbutton").setPosition("fixed")
                .setZIndex("var(--reuise-floating-z-index, 1000)").setMinWidth("48px").setMinHeight("48px")
                .setDisplay("inline-flex").setAlignItems("center").setJustifyContent("center")
                .setOverflow("visible").setTransition("none"));
        styles.addRule(".reuise-floatingactionbutton:focus-visible,.reuise-floatingpanel_panel:focus-visible")
                .setOutline("2px solid currentColor").setOutlineOffset("3px");
        styles.addRule(".reuise-floatingactionbutton_badge").setPosition("absolute")
                .setTop("-6px").setRight("-6px").setMinWidth("20px").setBorderRadius("12px")
                .setPadding(SpacingScale.value(2) + " " + SpacingScale.value(4)).setFontSize("12px").setBackgroundColor("var(--reuise-floating-badge-background, #b91c1c)")
                .setColor("var(--reuise-floating-badge-color, white)");
        styles.addRule(".reuise-floatingactionbutton_badge[hidden],.reuise-floatingpanel_panel[hidden]")
                .setDisplay("none", true);
        styles.addRule(".reuise-floatingpanel_panel").setPosition("fixed")
                .setZIndex("var(--reuise-floating-z-index, 1000)")
                .setWidth("var(--reuise-floating-width, 380px)")
                .setMaxWidth("calc(100vw - 32px - env(safe-area-inset-left, 0px) - env(safe-area-inset-right, 0px))")
                .setHeight("var(--reuise-floating-height, 520px)")
                .setMaxHeight("calc(100dvh - 112px - env(safe-area-inset-top, 0px) - env(safe-area-inset-bottom, 0px))")
                .setDisplay("flex").setFlexDirection("column").setOverflow("hidden")
                .setBackgroundColor("var(--reuise-floating-background, Canvas)")
                .setColor("var(--reuise-floating-color, CanvasText)")
                .setBorder("1px solid currentColor").setBorderRadius("12px");
        gap(styles.addRule(".reuise-floatingpanel_header").setDisplay("flex").setAlignItems("center")
                .setPadding(SpacingScale.value(12)).setFlexShrink(0));
        styles.addRule(".reuise-floatingpanel_title").setFlexGrow(1).setMinWidth(0);
        styles.addRule(".reuise-floatingpanel_content").setOverflow("auto").setMinHeight(0)
                .setFlexGrow(1).setPadding(SpacingScale.value(12));
        for (String corner : new String[] {"top-left", "top-right", "bottom-left", "bottom-right"}) {
            boolean top = corner.startsWith("top");
            boolean left = corner.endsWith("left");
            String fab = ".reuise-floatingactionbutton[data-corner=\"" + corner + "\"]";
            String panel = ".reuise-floatingpanel[data-corner=\"" + corner + "\"]>.reuise-floatingpanel_panel";
            styles.addRule(fab).setTop(top ? edge("top") : "auto").setBottom(top ? "auto" : edge("bottom"))
                    .setLeft(left ? edge("left") : "auto").setRight(left ? "auto" : edge("right"));
            styles.addRule(panel).setTop(top ? panelEdge("top") : "auto").setBottom(top ? "auto" : panelEdge("bottom"))
                    .setLeft(left ? edge("left") : "auto").setRight(left ? "auto" : edge("right"));
            String dock = ".reuise-floatingpanel[data-docked=\"true\"][data-corner=\"" + corner + "\"]>.reuise-floatingpanel_panel";
            styles.addRule(dock).setTop("env(safe-area-inset-top, 0px)")
                    .setBottom("env(safe-area-inset-bottom, 0px)").setHeight("auto").setMaxHeight("none")
                    .setLeft(left ? "env(safe-area-inset-left, 0px)" : "auto")
                    .setRight(left ? "auto" : "env(safe-area-inset-right, 0px)").setBorderRadius(0);
        }
        StyleSheet mobile = styles.addAtRule("media (max-width: 600px)");
        // Repeating the root class outweighs desktop corner/docking selectors without !important.
        mobile.addRule(".reuise-floatingpanel.reuise-floatingpanel.reuise-floatingpanel>.reuise-floatingpanel_panel")
                .setTop("auto").setBottom("0").setLeft("0").setRight("0").setWidth("auto")
                .setMaxWidth("none").setHeight("var(--reuise-floating-sheet-height, 70dvh)")
                .setMaxHeight("calc(100dvh - env(safe-area-inset-top, 0px) - 16px)")
                .setPaddingBottom("env(safe-area-inset-bottom, 0px)")
                .setPaddingLeft("env(safe-area-inset-left, 0px)")
                .setPaddingRight("env(safe-area-inset-right, 0px)").setBorderRadius("12px 12px 0 0");
    }

    private static String edge(String side) {
        return "calc(var(--reuise-floating-offset, 16px) + env(safe-area-inset-" + side + ", 0px))";
    }

    private static void gap(Style style) {
        StyleOptions options = new StyleOptions();
        options.setProperty(new StyleProperty("gap"), SpacingScale.value(8), false);
        style.append(options);
    }

    private static String panelEdge(String side) {
        return "calc(var(--reuise-floating-panel-offset, 80px) + env(safe-area-inset-" + side + ", 0px))";
    }
}
