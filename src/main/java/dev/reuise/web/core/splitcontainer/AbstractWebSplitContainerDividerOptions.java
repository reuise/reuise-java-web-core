package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.splitcontainer.AbstractCoreSplitContainerDividerOptions;
public abstract class AbstractWebSplitContainerDividerOptions<S extends AbstractWebSplitContainerDividerOptions<S>> extends AbstractCoreSplitContainerDividerOptions<S> implements WebSplitContainerDividerOptions {
    protected AbstractWebSplitContainerDividerOptions() {
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