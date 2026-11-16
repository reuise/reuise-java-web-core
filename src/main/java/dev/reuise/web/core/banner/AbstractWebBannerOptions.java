package dev.reuise.web.core.banner;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.banner.AbstractCoreBannerOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.text.WebParagraphOptions;
import java.util.Map;
public abstract class AbstractWebBannerOptions<S extends AbstractWebBannerOptions<S>> extends AbstractCoreBannerOptions<S> implements ClientConfigurationOptions , WebBannerOptions {
    protected AbstractWebBannerOptions() {
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

    protected WebIconOptions createDefaultIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultIconOptions()));
        options.setStyleClass("reuise-banner_icon");
        return options;
    }

    protected WebContainerOptions createDefaultContentOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultContentOptions()));
        options.setStyleClass("reuise-banner_content");
        return options;
    }

    protected WebParagraphOptions createDefaultMessageParagraphOptions() {
        WebParagraphOptions options = ((WebParagraphOptions) (super.createDefaultMessageParagraphOptions()));
        options.setStyleClass("reuise-banner_message");
        return options;
    }

    protected WebFlexContainerOptions createDefaultActionsOptions() {
        WebFlexContainerOptions options = ((WebFlexContainerOptions) (super.createDefaultActionsOptions()));
        options.setStyleClass("reuise-banner_actions");
        return options;
    }

    protected WebButtonOptions createDefaultDismissButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultDismissButtonOptions()));
        options.setStyleClass("reuise-banner_dismissbutton");
        return options;
    }

    public String getClientConfigurationType() {
        return "Banner";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "message": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setMessage(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "campaignId": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setCampaignId(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "tone": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTone(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "dismissLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setDismissLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "dismissible": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setDismissible(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
