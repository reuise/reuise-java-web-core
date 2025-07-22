package dev.reuise.web.core.button;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.AbstractCoreIconButtonOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.icon.WebIconOptions;
public abstract class AbstractWebIconButtonOptions<S extends AbstractWebIconButtonOptions<S>> extends AbstractCoreIconButtonOptions<S> implements WebIconButtonOptions {
    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        setUrl(url);
        setUseHistoryApi(useHistoryApi);
        return self();
    }

    protected AbstractWebIconButtonOptions() {
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

    protected WebIconOptions createDefaultIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultIconOptions()));
        options.setStyleClass("reuise-iconbutton_icon");
        return options;
    }
}