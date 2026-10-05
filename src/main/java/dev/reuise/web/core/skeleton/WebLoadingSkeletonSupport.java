package dev.reuise.web.core.skeleton;

import dev.reuise.core.skeleton.CoreSkeletonOptions;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheet;

public class WebLoadingSkeletonSupport {
    public static final String LOADING_SKELETON_STYLE_CLASS = "reuise-loading-skeleton";

    private final StyleAccessor styleAccessor;
    private final StyleClassToggler styleClassToggler;
    private final SkeletonOptionsAccessor skeletonOptionsAccessor;
    private final SkeletonStyleApplicator skeletonStyleApplicator;
    private final String variantStyleClass;
    private final SkeletonStyleSnapshot snapshot = new SkeletonStyleSnapshot();

    public WebLoadingSkeletonSupport(StyleAccessor styleAccessor, StyleClassToggler styleClassToggler,
            SkeletonOptionsAccessor skeletonOptionsAccessor, SkeletonStyleApplicator skeletonStyleApplicator,
            String variantStyleClass) {
        this.styleAccessor = styleAccessor;
        this.styleClassToggler = styleClassToggler;
        this.skeletonOptionsAccessor = skeletonOptionsAccessor;
        this.skeletonStyleApplicator = skeletonStyleApplicator;
        this.variantStyleClass = variantStyleClass;
    }

    public void update(boolean loading) {
        styleClassToggler.addOrRemoveStyleClass(LOADING_SKELETON_STYLE_CLASS, loading);
        styleClassToggler.addOrRemoveStyleClass(variantStyleClass, loading);
        if (loading) {
            snapshot.capture(styleAccessor.getStyle());
            skeletonStyleApplicator.apply(styleAccessor.getStyle(), skeletonOptionsAccessor.getSkeletonOptions());
            return;
        }

        snapshot.restore(styleAccessor.getStyle());
    }

    public void refreshIfLoading(boolean loading) {
        if (loading)
            skeletonStyleApplicator.apply(styleAccessor.getStyle(), skeletonOptionsAccessor.getSkeletonOptions());
    }

    public static void addCommonStyles(StyleBuilder commonStyles) {
        commonStyles.addRule("." + LOADING_SKELETON_STYLE_CLASS)
                .setPosition("relative")
                .setOverflow("hidden")
                .setColor("transparent", true)
                .setUserSelect("none")
                .setPointerEvents("none");
        commonStyles.addRule("." + LOADING_SKELETON_STYLE_CLASS + ">*").setVisibility("hidden");
        commonStyles.addRule("." + LOADING_SKELETON_STYLE_CLASS + "::before")
                .setContent("''")
                .setPosition("absolute")
                .setTop("0")
                .setRight("0")
                .setBottom("0")
                .setLeft("0")
                .setBackgroundColor("rgb(0 0 0 / 10%)")
                .setBorderRadius("inherit")
                .setAnimation("1.5s ease-in-out 0.5s infinite alternate reuise-loading-skeleton_pulse");
        StyleSheet keyframes = commonStyles.addAtRule("keyframes reuise-loading-skeleton_pulse");
        keyframes.addRule("0%").setOpacity(1);
        keyframes.addRule("100%").setOpacity(0.55);
    }

    public interface StyleAccessor {
        Style getStyle();
    }

    public interface StyleClassToggler {
        void addOrRemoveStyleClass(String styleClass, boolean add);
    }

    public interface SkeletonOptionsAccessor {
        CoreSkeletonOptions getSkeletonOptions();
    }

    public interface SkeletonStyleApplicator {
        void apply(Style style, CoreSkeletonOptions skeletonOptions);
    }

    private static class SkeletonStyleSnapshot {
        private boolean captured;
        private Object width;
        private Object height;
        private Object minWidth;
        private Object minHeight;
        private Object borderRadius;

        public void capture(Style style) {
            if (captured || style == null)
                return;

            width = style.getWidth();
            height = style.getHeight();
            minWidth = style.getMinWidth();
            minHeight = style.getMinHeight();
            borderRadius = style.getBorderRadius();
            captured = true;
        }

        public void restore(Style style) {
            if (!captured || style == null)
                return;

            style.setWidth(width);
            style.setHeight(height);
            style.setMinWidth(minWidth);
            style.setMinHeight(minHeight);
            style.setBorderRadius(borderRadius);
            captured = false;
        }
    }
}
