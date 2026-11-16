package dev.reuise.web.core.dialog;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.State;
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
        restoreClientConfiguration(values, null);
    }

    public void restoreClientConfiguration(Map<String, Object> values, State state) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "contentEditable": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "margin": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginTop": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginRight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginBottom": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginLeft": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "width": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "minWidth": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "maxWidth": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "height": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "minHeight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "maxHeight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "visible": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "enabled": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "title": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "open": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "size": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, values.get(key) == null ? null : dev.reuise.core.dialog.DialogSize.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "removeOnClose": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "hasAcceptButton": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, true); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "hasCancelButton": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, true); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
