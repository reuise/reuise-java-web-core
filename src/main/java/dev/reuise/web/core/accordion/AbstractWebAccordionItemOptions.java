package dev.reuise.web.core.accordion;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.accordion.AbstractCoreAccordionItemOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import java.util.Map;
public abstract class AbstractWebAccordionItemOptions<S extends AbstractWebAccordionItemOptions<S>> extends AbstractCoreAccordionItemOptions<S> implements ClientConfigurationOptions , WebAccordionItemOptions {
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

    public String getClientConfigurationType() {
        return "AccordionItem";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "expanded": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setExpanded(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "toggleAtEnd": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setToggleAtEnd(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
