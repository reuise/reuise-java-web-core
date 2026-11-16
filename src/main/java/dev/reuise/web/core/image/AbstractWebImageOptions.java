package dev.reuise.web.core.image;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.image.AbstractCoreImageOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.link.WebLinkOptions;
import java.util.Map;
public abstract class AbstractWebImageOptions<S extends AbstractWebImageOptions<S>> extends AbstractCoreImageOptions<S> implements ClientConfigurationOptions , WebImageOptions {
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
    public ComponentAnimation getAnimation() {
        return ((ComponentAnimation) (getOptionValue("animation")));
    }

    @Override
    public ComponentOption<ComponentAnimation> getAnimationOption() {
        return ((ComponentOption<ComponentAnimation>) (getOption("animation")));
    }

    @Override
    public S setAnimation(ComponentAnimation animation) {
        setOption("animation", animation);
        return self();
    }

    private void setDefaultAnimation(ComponentAnimation animation) {
        setDefaultOption("animation", animation);
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

    public String getClientConfigurationType() {
        return "Image";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "linkUrl": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLinkUrl(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
