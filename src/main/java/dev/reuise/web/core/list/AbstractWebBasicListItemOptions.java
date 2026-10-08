package dev.reuise.web.core.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.list.AbstractCoreBasicListItemOptions;
import dev.reuise.web.core.link.WebLinkOptions;
import static dev.reuise.web.core.list.AbstractWebBasicListItemOptionsImpl.self;
public abstract class AbstractWebBasicListItemOptions<S extends AbstractWebBasicListItemOptions<S>> extends AbstractCoreBasicListItemOptions<S> implements WebBasicListItemOptions {
    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        setUrl(url);
        if (linkOptions != null)
            ((WebLinkOptions) (linkOptions)).setUrl(url, useHistoryApi);

        return self();
    }

    protected AbstractWebBasicListItemOptions() {
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
        options.setStyleClass("reuise-basiclistitem_link");
        return options;
    }
}
