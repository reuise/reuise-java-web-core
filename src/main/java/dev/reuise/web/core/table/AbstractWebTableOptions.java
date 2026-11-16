package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
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
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "hasHeader": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHasHeader(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "fixedHeader": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setFixedHeader(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "fixedFooter": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setFixedFooter(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "hasFooter": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHasFooter(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
