package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.scrollablecontainer.AbstractCoreScrollableContainerScrollAreaOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
public abstract class AbstractWebScrollableContainerScrollAreaOptions<S extends AbstractWebScrollableContainerScrollAreaOptions<S>> extends AbstractCoreScrollableContainerScrollAreaOptions<S> implements WebScrollableContainerScrollAreaOptions {
    protected AbstractWebScrollableContainerScrollAreaOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    protected WebContainerOptions createDefaultScrollAreaTopFadeOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaTopFadeOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_scrollarea_topfade");
        return options;
    }

    protected WebContainerOptions createDefaultScrollAreaLeftFadeOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaLeftFadeOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_scrollarea_leftfade");
        return options;
    }

    protected WebContainerOptions createDefaultScrollAreaContentOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaContentOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_scrollarea_content");
        return options;
    }

    protected WebContainerOptions createDefaultScrollAreaBottomFadeOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaBottomFadeOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_scrollarea_bottomfade");
        return options;
    }

    protected WebContainerOptions createDefaultScrollAreaRightFadeOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaRightFadeOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_scrollarea_rightfade");
        return options;
    }
}