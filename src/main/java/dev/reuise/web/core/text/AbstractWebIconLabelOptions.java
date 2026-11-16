package dev.reuise.web.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.State;
import dev.reuise.core.text.AbstractCoreIconLabelOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.link.WebLinkOptions;
import java.util.Map;
public abstract class AbstractWebIconLabelOptions<S extends AbstractWebIconLabelOptions<S>> extends AbstractCoreIconLabelOptions<S> implements ClientConfigurationOptions , WebIconLabelOptions {
    @Override
    public S setLinkUrl(String url, Boolean useHistoryApi) {
        WebLinkOptions linkOpts = ((WebLinkOptions) (getOrCreateLinkOptions()));
        linkOpts.setUrl(url, useHistoryApi);
        return self();
    }

    protected AbstractWebIconLabelOptions() {
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

    protected WebLinkOptions createDefaultLinkOptions() {
        WebLinkOptions options = ((WebLinkOptions) (super.createDefaultLinkOptions()));
        options.setStyleClass("reuise-iconlabel_link");
        return options;
    }

    protected WebIconOptions createDefaultStartIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultStartIconOptions()));
        options.setStyleClass("reuise-iconlabel_starticon");
        return options;
    }

    protected WebInlineTextOptions createDefaultLabelContainerOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultLabelContainerOptions()));
        options.setStyleClass("reuise-iconlabel_label");
        return options;
    }

    protected WebIconOptions createDefaultEndIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultEndIconOptions()));
        options.setStyleClass("reuise-iconlabel_endicon");
        return options;
    }

    public String getClientConfigurationType() {
        return "IconLabel";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        restoreClientConfiguration(values, null);
    }

    public void restoreClientConfiguration(Map<String, Object> values, State state) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "contentEditable": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "margin": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginTop": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginRight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginBottom": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginLeft": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "width": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "minWidth": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "maxWidth": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "height": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "minHeight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "maxHeight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "visible": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "enabled": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "text": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "linkUrl": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
