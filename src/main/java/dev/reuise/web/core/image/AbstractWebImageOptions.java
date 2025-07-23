package dev.reuise.web.core.image;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.image.AbstractCoreImageOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.link.WebLinkOptions;
public abstract class AbstractWebImageOptions<S extends AbstractWebImageOptions<S>> extends AbstractCoreImageOptions<S> implements WebImageOptions {
    @Override
    public S setLinkUrl(String url, Boolean useHistoryApi) {
        WebLinkOptions linkOpts = ((WebLinkOptions) (getOrCreateLinkOptions()));
        linkOpts.setUrl(url, useHistoryApi);
        return self();
    }

    protected AbstractWebImageOptions() {
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
    public String getAltText() {
        return ((String) (getOptionValue("altText")));
    }

    @Override
    public ComponentOption<String> getAltTextOption() {
        return ((ComponentOption<String>) (getOption("altText")));
    }

    @Override
    public S setAltText(String altText) {
        setOption("altText", altText);
        return self();
    }

    private void setDefaultAltText(String altText) {
        setDefaultOption("altText", altText);
    }

    protected WebLinkOptions createDefaultLinkOptions() {
        WebLinkOptions options = ((WebLinkOptions) (super.createDefaultLinkOptions()));
        options.setStyleClass("reuise-image_link");
        return options;
    }
}