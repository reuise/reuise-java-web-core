package dev.reuise.web.core.button;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.AbstractCoreButtonOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
public abstract class AbstractWebButtonOptions<S extends AbstractWebButtonOptions<S>> extends AbstractCoreButtonOptions<S> implements WebButtonOptions {
    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        setUrl(url);
        setUseHistoryApi(useHistoryApi);
        return self();
    }

    protected AbstractWebButtonOptions() {
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
        options.setStyleClass("reuise-button_starticon");
        return options;
    }

    protected WebInlineTextOptions createDefaultLabelContainerOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultLabelContainerOptions()));
        options.setBaseStyleClass("reuise-button_label");
        options.setStyleClass("reuise-button_label");
        return options;
    }

    protected WebIconOptions createDefaultEndIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultEndIconOptions()));
        options.setStyleClass("reuise-button_endicon");
        return options;
    }
}