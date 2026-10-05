package dev.reuise.web.core.accordion;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.accordion.AbstractCoreAccordionOptions;
public abstract class AbstractWebAccordionOptions<S extends AbstractWebAccordionOptions<S>> extends AbstractCoreAccordionOptions<S> implements WebAccordionOptions {
    protected AbstractWebAccordionOptions() {
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