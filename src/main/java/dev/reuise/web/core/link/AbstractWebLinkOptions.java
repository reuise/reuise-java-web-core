package dev.reuise.web.core.link;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.link.AbstractCoreLinkOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.icon.WebIconOptions;
public abstract class AbstractWebLinkOptions<S extends AbstractWebLinkOptions<S>> extends AbstractCoreLinkOptions<S> implements WebLinkOptions {
    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        setUrl(url);
        setUseHistoryApi(useHistoryApi);
        return self();
    }

    protected AbstractWebLinkOptions() {
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

    @Override
    public boolean isUseHistoryApi() {
        return Boolean.TRUE.equals(getOptionValue("useHistoryApi"));
    }

    @Override
    public ComponentOption<Boolean> getUseHistoryApiOption() {
        return ((ComponentOption<Boolean>) (getOption("useHistoryApi")));
    }

    @Override
    public S setUseHistoryApi(Boolean useHistoryApi) {
        setOption("useHistoryApi", useHistoryApi, true);
        return self();
    }

    private void setDefaultUseHistoryApi(Boolean useHistoryApi) {
        setDefaultOption("useHistoryApi", useHistoryApi, true);
    }

    protected WebIconOptions createDefaultStartIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultStartIconOptions()));
        options.setStyleClass("reuise-link_starticon");
        return options;
    }

    protected WebIconOptions createDefaultEndIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultEndIconOptions()));
        options.setStyleClass("reuise-link_endicon");
        return options;
    }
}
