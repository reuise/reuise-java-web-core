package dev.reuise.web.core.tabs;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.tabs.AbstractCoreTabOptions;
import dev.reuise.web.core.badge.WebBadgeOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.link.WebLinkOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
public abstract class AbstractWebTabOptions<S extends AbstractWebTabOptions<S>> extends AbstractCoreTabOptions<S> implements WebTabOptions {
    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        setUrl(url);
        if (this.linkOptions != null)
            ((WebLinkOptions) (this.linkOptions)).setUrl(url, useHistoryApi);

        return self();
    }

    protected AbstractWebTabOptions() {
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
        options.setStyleClass("reuise-tab_link");
        return options;
    }

    protected WebBadgeOptions createDefaultBadgeOptions() {
        WebBadgeOptions options = ((WebBadgeOptions) (super.createDefaultBadgeOptions()));
        options.setStyleClass("reuise-tab_badge");
        return options;
    }

    protected WebIconOptions createDefaultIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultIconOptions()));
        options.setStyleClass("reuise-tab_icon");
        return options;
    }

    protected WebInlineTextOptions createDefaultLabelContainerOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultLabelContainerOptions()));
        options.setBaseStyleClass("reuise-tab_label");
        options.setStyleClass("reuise-tab_label");
        return options;
    }
}