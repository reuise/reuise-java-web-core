package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreTableOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
public abstract class AbstractWebTableOptions<S extends AbstractWebTableOptions<S>> extends AbstractCoreTableOptions<S> implements WebTableOptions {
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
}