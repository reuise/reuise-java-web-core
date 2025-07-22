package dev.reuise.web.core.icon;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.AbstractCoreIconOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.image.WebImageOptions;
import dev.reuise.web.core.link.WebLinkOptions;
public abstract class AbstractWebIconOptions<S extends AbstractWebIconOptions<S>> extends AbstractCoreIconOptions<S> implements WebIconOptions {
    @Override
    public S setUrl(String url) {
        super.setUrl(url);
        setSvgOptions(null);
        return self();
    }

    public S setImageOptions(WebImageOptions imageOptions) {
        super.setImageOptions(imageOptions);
        setSvgOptions(null);
        return self();
    }

    /* public S setSvgOptions(WebSvgOptions  svgOptions) {
    super.setSvgOptions(svgOptions);
    setImageOptions(null);
    return self();
    }
     */
    @Override
    public S setLinkUrl(String url, Boolean useHistoryApi) {
        WebLinkOptions linkOpts = ((WebLinkOptions) (getOrCreateLinkOptions()));
        linkOpts.setUrl(url, useHistoryApi);
        return self();
    }

    protected dev.reuise.web.core.graphics.svg.WebSvgOptions svgOptions;

    protected AbstractWebIconOptions() {
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
        setLayoutChildrenAltText(altText);
        return self();
    }

    protected void setLayoutChildrenAltText(String altText) {
    }

    private void setDefaultAltText(String altText) {
        setDefaultOption("altText", altText);
        setLayoutChildrenAltText(altText);
    }

    @Override
    public dev.reuise.web.core.graphics.svg.WebSvgOptions getSvgOptions() {
        return svgOptions;
    }

    @Override
    public boolean hasSvgOptions() {
        return svgOptions != null;
    }

    @Override
    public S setSvgOptions(dev.reuise.web.core.graphics.svg.WebSvgOptions svgOptions) {
        if (!hasSvgOptions())
            this.svgOptions = createDefaultSvgOptions();

        // Merge with default options
        this.svgOptions.merge(svgOptions);
        return self();
    }

    protected WebSvgOptions createDefaultSvgOptions() {
        WebSvgOptions options = getComponentFactory().createSvgOptions();
        options.setStyleClass("reuise-icon_svg");
        return options;
    }

    protected WebLinkOptions createDefaultLinkOptions() {
        WebLinkOptions options = ((WebLinkOptions) (super.createDefaultLinkOptions()));
        options.setStyleClass("reuise-icon_link");
        return options;
    }

    protected WebImageOptions createDefaultImageOptions() {
        WebImageOptions options = ((WebImageOptions) (super.createDefaultImageOptions()));
        options.setStyleClass("reuise-icon_image");
        return options;
    }
}