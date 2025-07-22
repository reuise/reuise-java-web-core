package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.splitcontainer.AbstractCoreSplitContainerPanelOptions;
public abstract class AbstractWebSplitContainerPanelOptions<S extends AbstractWebSplitContainerPanelOptions<S>> extends AbstractCoreSplitContainerPanelOptions<S> implements WebSplitContainerPanelOptions {
    protected AbstractWebSplitContainerPanelOptions() {
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
}