package dev.reuise.web.core.accordion;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.accordion.AbstractCoreAccordionItemOptions;
public abstract class AbstractWebAccordionItemOptions<S extends AbstractWebAccordionItemOptions<S>> extends AbstractCoreAccordionItemOptions<S> implements WebAccordionItemOptions {
    protected AbstractWebAccordionItemOptions() {
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