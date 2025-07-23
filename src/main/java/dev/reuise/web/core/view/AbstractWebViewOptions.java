package dev.reuise.web.core.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.view.AbstractCoreViewOptions;
import java.util.Map;
public abstract class AbstractWebViewOptions<S extends AbstractWebViewOptions<S>> extends AbstractCoreViewOptions<S> implements WebViewOptions {
    protected AbstractWebViewOptions() {
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
    public Map<String, String> getParameters() {
        return ((Map<String, String>) (getOptionValue("parameters")));
    }

    @Override
    public ComponentOption<Map<String, String>> getParametersOption() {
        return ((ComponentOption<Map<String, String>>) (getOption("parameters")));
    }

    private void setDefaultParameters(Map<String, String> parameters) {
        setDefaultOption("parameters", parameters);
    }

    @Override
    public String getContentType() {
        return ((String) (getOptionValue("contentType")));
    }

    @Override
    public ComponentOption<String> getContentTypeOption() {
        return ((ComponentOption<String>) (getOption("contentType")));
    }

    private void setDefaultContentType(String contentType) {
        setDefaultOption("contentType", contentType);
    }
}