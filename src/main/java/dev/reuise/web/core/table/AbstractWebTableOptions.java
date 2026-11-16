package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.State;
import dev.reuise.core.table.AbstractCoreTableOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import java.util.Map;
public abstract class AbstractWebTableOptions<S extends AbstractWebTableOptions<S>> extends AbstractCoreTableOptions<S> implements ClientConfigurationOptions , WebTableOptions {
    protected AbstractWebTableOptions() {
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

    protected WebContainerOptions createDefaultTableOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultTableOptions()));
        options.setTagName("table");
        options.setStyleClass("reuise-table_table");
        return options;
    }

    protected WebTableColumnGroupOptions createDefaultColumnGroupOptions() {
        WebTableColumnGroupOptions options = ((WebTableColumnGroupOptions) (super.createDefaultColumnGroupOptions()));
        options.setStyleClass("reuise-table_columngroup");
        return options;
    }

    protected WebTableHeaderOptions createDefaultHeaderOptions() {
        WebTableHeaderOptions options = ((WebTableHeaderOptions) (super.createDefaultHeaderOptions()));
        options.setStyleClass("reuise-table_header");
        return options;
    }

    protected WebTableBodyOptions createDefaultBodyOptions() {
        WebTableBodyOptions options = ((WebTableBodyOptions) (super.createDefaultBodyOptions()));
        options.setStyleClass("reuise-table_body");
        return options;
    }

    protected WebTableFooterOptions createDefaultFooterOptions() {
        WebTableFooterOptions options = ((WebTableFooterOptions) (super.createDefaultFooterOptions()));
        options.setStyleClass("reuise-table_footer");
        return options;
    }

    public String getClientConfigurationType() {
        return "Table";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        restoreClientConfiguration(values, null);
    }

    public void restoreClientConfiguration(Map<String, Object> values, State state) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "contentEditable": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "margin": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginTop": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginRight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginBottom": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginLeft": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "width": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "minWidth": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "maxWidth": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "height": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "minHeight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "maxHeight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "visible": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "enabled": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "hasHeader": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "fixedHeader": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "fixedFooter": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "hasFooter": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
