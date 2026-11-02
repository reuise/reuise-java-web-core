package dev.reuise.web.core.regionselector;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.regionselector.AbstractCoreRegionSelectorOptions;
public abstract class AbstractWebRegionSelectorOptions<S extends AbstractWebRegionSelectorOptions<S>> extends AbstractCoreRegionSelectorOptions<S> implements WebRegionSelectorOptions {
    protected AbstractWebRegionSelectorOptions() {
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
