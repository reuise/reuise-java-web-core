package dev.reuise.web.core.card;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.card.AbstractCoreCardOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.image.WebImageOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.link.WebLinkOptions;
import dev.reuise.web.core.text.WebTextBlockOptions;
import java.util.Map;
public abstract class AbstractWebCardOptions<S extends AbstractWebCardOptions<S>> extends AbstractCoreCardOptions<S> implements ClientConfigurationOptions , WebCardOptions {
    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        setUrl(url);
        if (mediaLinkOptions != null)
            ((WebLinkOptions) (mediaLinkOptions)).setUrl(url, useHistoryApi);

        if (headingLinkOptions != null)
            ((WebLinkOptions) (headingLinkOptions)).setUrl(url, useHistoryApi);

        return self();
    }

    protected AbstractWebCardOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        setDefaultHoverScale(1.0);
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    @Override
    public Double getHoverScale() {
        return ((Double) (getOptionValue("hoverScale")));
    }

    @Override
    public ComponentOption<Double> getHoverScaleOption() {
        return ((ComponentOption<Double>) (getOption("hoverScale")));
    }

    @Override
    public S setHoverScale(Double hoverScale) {
        setOption("hoverScale", hoverScale, true);
        return self();
    }

    private void setDefaultHoverScale(Double hoverScale) {
        setDefaultOption("hoverScale", hoverScale, true);
    }

    @Override
    public String getImageAltText() {
        return ((String) (getOptionValue("imageAltText")));
    }

    @Override
    public ComponentOption<String> getImageAltTextOption() {
        return ((ComponentOption<String>) (getOption("imageAltText")));
    }

    @Override
    public S setImageAltText(String imageAltText) {
        setOption("imageAltText", imageAltText);
        return self();
    }

    private void setDefaultImageAltText(String imageAltText) {
        setDefaultOption("imageAltText", imageAltText);
    }

    protected WebLinkOptions createDefaultMediaLinkOptions() {
        WebLinkOptions options = ((WebLinkOptions) (super.createDefaultMediaLinkOptions()));
        options.setStyleClass("reuise-card_media_link");
        return options;
    }

    protected WebFlexContainerOptions createDefaultMediaContainerOptions() {
        WebFlexContainerOptions options = ((WebFlexContainerOptions) (super.createDefaultMediaContainerOptions()));
        options.setHeight(160);
        options.setBaseStyleClass("reuise-card_media");
        options.setStyleClass("reuise-card_media");
        return options;
    }

    protected WebImageOptions createDefaultImageOptions() {
        WebImageOptions options = ((WebImageOptions) (super.createDefaultImageOptions()));
        options.setStyleClass("reuise-card_image");
        return options;
    }

    protected WebFlexContainerOptions createDefaultTextContentOptions() {
        WebFlexContainerOptions options = ((WebFlexContainerOptions) (super.createDefaultTextContentOptions()));
        options.setBaseStyleClass("reuise-card_textcontent");
        options.setStyleClass("reuise-card_textcontent");
        return options;
    }

    protected WebFlexContainerOptions createDefaultHeadlineOptions() {
        WebFlexContainerOptions options = ((WebFlexContainerOptions) (super.createDefaultHeadlineOptions()));
        options.setStyleClass("reuise-card_headline");
        return options;
    }

    protected WebLinkOptions createDefaultHeadingLinkOptions() {
        WebLinkOptions options = ((WebLinkOptions) (super.createDefaultHeadingLinkOptions()));
        options.setStyleClass("reuise-card_heading_link");
        return options;
    }

    protected WebTextBlockOptions createDefaultHeadingContainerOptions() {
        WebTextBlockOptions options = ((WebTextBlockOptions) (super.createDefaultHeadingContainerOptions()));
        options.setBaseStyleClass("reuise-card_heading");
        options.setStyleClass("reuise-card_heading");
        return options;
    }

    protected WebTextBlockOptions createDefaultSubHeadingContainerOptions() {
        WebTextBlockOptions options = ((WebTextBlockOptions) (super.createDefaultSubHeadingContainerOptions()));
        options.setStyleClass("reuise-card_subheading");
        return options;
    }

    protected WebTextBlockOptions createDefaultTextContainerOptions() {
        WebTextBlockOptions options = ((WebTextBlockOptions) (super.createDefaultTextContainerOptions()));
        options.setStyleClass("reuise-card_text");
        return options;
    }

    protected WebFlexContainerOptions createDefaultActionsContainerOptions() {
        WebFlexContainerOptions options = ((WebFlexContainerOptions) (super.createDefaultActionsContainerOptions()));
        options.setStyleClass("reuise-card_actions");
        return options;
    }

    public String getClientConfigurationType() {
        return "Card";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "type": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setType(values.get(key) == null ? null : dev.reuise.core.layout.SurfaceType.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "hoverScale": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHoverScale(dev.reuise.web.core.hydration.ClientConfiguration.decimal(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "imageAltText": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setImageAltText(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "heading": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHeading(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "subHeading": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setSubHeading(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "text": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setText(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "orientation": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setOrientation(values.get(key) == null ? null : dev.reuise.core.card.CardOrientation.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "url": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setUrl(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "imageUrl": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setImageUrl(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
