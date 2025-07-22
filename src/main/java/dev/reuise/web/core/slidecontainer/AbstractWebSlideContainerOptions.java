package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.slidecontainer.AbstractCoreSlideContainerOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
public abstract class AbstractWebSlideContainerOptions<S extends AbstractWebSlideContainerOptions<S>> extends AbstractCoreSlideContainerOptions<S> implements WebSlideContainerOptions {
    protected AbstractWebSlideContainerOptions() {
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

    protected WebContainerOptions createDefaultSlideAreaBeforeOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultSlideAreaBeforeOptions()));
        options.setStyleClass("reuise-slidecontainer_slideareabefore");
        return options;
    }

    protected WebContainerOptions createDefaultSlideAreaOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultSlideAreaOptions()));
        options.setStyleClass("reuise-slidecontainer_slidearea");
        return options;
    }

    protected WebContainerOptions createDefaultSlideAreaAfterOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultSlideAreaAfterOptions()));
        options.setStyleClass("reuise-slidecontainer_slideareaafter");
        return options;
    }
}