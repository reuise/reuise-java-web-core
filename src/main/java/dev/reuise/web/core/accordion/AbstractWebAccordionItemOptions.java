package dev.reuise.web.core.accordion;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.accordion.AbstractCoreAccordionItemOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
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

    protected WebFlexContainerOptions createDefaultHeaderOptions() {
        WebFlexContainerOptions options = ((WebFlexContainerOptions) (super.createDefaultHeaderOptions()));
        options.setStyleClass("reuise-flexcontainer_header");
        return options;
    }

    protected WebButtonOptions createDefaultToggleOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultToggleOptions()));
        options.setStyleClass("reuise-flexcontainer_toggle");
        return options;
    }

    protected WebContainerOptions createDefaultContentOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultContentOptions()));
        options.setStyleClass("reuise-flexcontainer_content");
        return options;
    }
}
