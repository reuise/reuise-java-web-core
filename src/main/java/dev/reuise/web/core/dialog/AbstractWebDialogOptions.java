package dev.reuise.web.core.dialog;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.dialog.AbstractCoreDialogOptions;
import dev.reuise.web.core.button.WebButtonBarOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.text.WebHeadingOptions;
import java.util.Map;
public abstract class AbstractWebDialogOptions<S extends AbstractWebDialogOptions<S>> extends AbstractCoreDialogOptions<S> implements ClientConfigurationOptions , WebDialogOptions {
    protected AbstractWebDialogOptions() {
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

    protected WebContainerOptions createDefaultContainerOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultContainerOptions()));
        options.setStyleClass("reuise-dialog_container");
        return options;
    }

    protected WebContainerOptions createDefaultHeaderOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultHeaderOptions()));
        options.setStyleClass("reuise-dialog_header");
        return options;
    }

    protected WebHeadingOptions createDefaultTitleHeadingOptions() {
        WebHeadingOptions options = ((WebHeadingOptions) (super.createDefaultTitleHeadingOptions()));
        options.setStyleClass("reuise-dialog_title");
        return options;
    }

    protected WebFlexContainerOptions createDefaultBodyOptions() {
        WebFlexContainerOptions options = ((WebFlexContainerOptions) (super.createDefaultBodyOptions()));
        options.setStyleClass("reuise-dialog_body");
        return options;
    }

    protected WebButtonBarOptions createDefaultFooterOptions() {
        WebButtonBarOptions options = ((WebButtonBarOptions) (super.createDefaultFooterOptions()));
        options.setStyleClass("reuise-dialog_footer");
        return options;
    }

    protected WebContainerOptions createDefaultScrimOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrimOptions()));
        options.setStyleClass("reuise-dialog_scrim");
        return options;
    }

    protected WebButtonOptions createDefaultAcceptButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultAcceptButtonOptions()));
        options.setStyleClass("reuise-dialog_acceptbutton");
        return options;
    }

    protected WebButtonOptions createDefaultCancelButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultCancelButtonOptions()));
        options.setStyleClass("reuise-dialog_cancelbutton");
        return options;
    }

    public String getClientConfigurationType() {
        return "Dialog";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "title": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTitle(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "open": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setOpen(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "removeOnClose": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setRemoveOnClose(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "hasAcceptButton": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHasAcceptButton(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "hasCancelButton": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHasCancelButton(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
