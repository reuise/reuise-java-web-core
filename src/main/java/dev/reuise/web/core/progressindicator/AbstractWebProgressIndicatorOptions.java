package dev.reuise.web.core.progressindicator;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.progressindicator.AbstractCoreProgressIndicatorOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
public abstract class AbstractWebProgressIndicatorOptions<S extends AbstractWebProgressIndicatorOptions<S>> extends AbstractCoreProgressIndicatorOptions<S> implements WebProgressIndicatorOptions {
    protected AbstractWebProgressIndicatorOptions() {
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

    protected WebContainerOptions createDefaultTrackOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultTrackOptions()));
        options.setBaseStyleClass("reuise-progressindicator_track");
        options.setStyleClass("reuise-progressindicator_track");
        return options;
    }
}