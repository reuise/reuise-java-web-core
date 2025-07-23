package dev.reuise.web.core.card;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.card.AbstractCoreCardOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.image.WebImageOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.link.WebLinkOptions;
import dev.reuise.web.core.text.WebTextBlockOptions;
public abstract class AbstractWebCardOptions<S extends AbstractWebCardOptions<S>> extends AbstractCoreCardOptions<S> implements WebCardOptions {
    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        setUrl(url);
        if (this.mediaLinkOptions != null)
            ((WebLinkOptions) (this.mediaLinkOptions)).setUrl(url, useHistoryApi);

        if (this.headingLinkOptions != null)
            ((WebLinkOptions) (this.headingLinkOptions)).setUrl(url, useHistoryApi);

        return self();
    }

    protected AbstractWebCardOptions() {
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
}