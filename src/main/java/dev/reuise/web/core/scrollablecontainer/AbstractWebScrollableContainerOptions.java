package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.scrollablecontainer.AbstractCoreScrollableContainerOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
public abstract class AbstractWebScrollableContainerOptions<S extends AbstractWebScrollableContainerOptions<S>> extends AbstractCoreScrollableContainerOptions<S> implements WebScrollableContainerOptions {
    protected AbstractWebScrollableContainerOptions() {
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

    protected WebContainerOptions createDefaultScrollAreaBeforeOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaBeforeOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_before");
        return options;
    }

    protected WebScrollableContainerScrollAreaOptions createDefaultScrollAreaOptions() {
        WebScrollableContainerScrollAreaOptions options = ((WebScrollableContainerScrollAreaOptions) (super.createDefaultScrollAreaOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea");
        return options;
    }

    protected WebContainerOptions createDefaultScrollAreaAfterOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaAfterOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_after");
        return options;
    }
}