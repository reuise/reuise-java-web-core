package dev.reuise.web.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.text.AbstractCoreLineBreakOptions;
public abstract class AbstractWebLineBreakOptions<S extends AbstractWebLineBreakOptions<S>> extends AbstractCoreLineBreakOptions<S> implements WebLineBreakOptions {
    protected AbstractWebLineBreakOptions() {
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