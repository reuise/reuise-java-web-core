package dev.reuise.web.core.graphics.svg;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentOptions;
public abstract class AbstractWebSvgImageOptions<S extends AbstractWebSvgImageOptions<S>> implements WebSvgImageOptions , WebComponentOptions {
    protected AbstractWebSvgImageOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getHref() {
        return ((String) (getOptionValue("href")));
    }

    @Override
    public ComponentOption<String> getHrefOption() {
        return ((ComponentOption<String>) (getOption("href")));
    }

    @Override
    public S setHref(String href) {
        setOption("href", href);
        return self();
    }

    private void setDefaultHref(String href) {
        setDefaultOption("href", href);
    }

    @Override
    public String getPreserveAspectRatio() {
        return ((String) (getOptionValue("preserveAspectRatio")));
    }

    @Override
    public ComponentOption<String> getPreserveAspectRatioOption() {
        return ((ComponentOption<String>) (getOption("preserveAspectRatio")));
    }

    @Override
    public S setPreserveAspectRatio(String preserveAspectRatio) {
        setOption("preserveAspectRatio", preserveAspectRatio);
        return self();
    }

    private void setDefaultPreserveAspectRatio(String preserveAspectRatio) {
        setDefaultOption("preserveAspectRatio", preserveAspectRatio);
    }

    protected abstract S self();
}