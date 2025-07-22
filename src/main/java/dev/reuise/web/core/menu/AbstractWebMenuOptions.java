package dev.reuise.web.core.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.menu.AbstractCoreMenuOptions;
import dev.reuise.web.core.list.WebListViewOptions;
public abstract class AbstractWebMenuOptions<S extends AbstractWebMenuOptions<S>> extends AbstractCoreMenuOptions<S> implements WebMenuOptions {
    protected AbstractWebMenuOptions() {
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

    protected WebListViewOptions createDefaultListOptions() {
        WebListViewOptions options = ((WebListViewOptions) (super.createDefaultListOptions()));
        options.setStyleClass("reuise-menu_list");
        return options;
    }
}