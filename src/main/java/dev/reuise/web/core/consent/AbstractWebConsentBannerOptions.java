package dev.reuise.web.core.consent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.consent.AbstractCoreConsentBannerOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.dialog.WebDialogOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.text.WebParagraphOptions;
import java.util.Map;
public abstract class AbstractWebConsentBannerOptions<S extends AbstractWebConsentBannerOptions<S>> extends AbstractCoreConsentBannerOptions<S> implements ClientConfigurationOptions , WebConsentBannerOptions {
    protected AbstractWebConsentBannerOptions() {
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

    protected WebParagraphOptions createDefaultMessageParagraphOptions() {
        WebParagraphOptions options = ((WebParagraphOptions) (super.createDefaultMessageParagraphOptions()));
        options.setStyleClass("reuise-consentbanner_message");
        return options;
    }

    protected WebFlexContainerOptions createDefaultActionsOptions() {
        WebFlexContainerOptions options = ((WebFlexContainerOptions) (super.createDefaultActionsOptions()));
        options.setStyleClass("reuise-consentbanner_actions");
        return options;
    }

    protected WebButtonOptions createDefaultAcceptButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultAcceptButtonOptions()));
        options.setStyleClass("reuise-consentbanner_acceptbutton");
        return options;
    }

    protected WebButtonOptions createDefaultRejectButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultRejectButtonOptions()));
        options.setStyleClass("reuise-consentbanner_rejectbutton");
        return options;
    }

    protected WebButtonOptions createDefaultPreferencesButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultPreferencesButtonOptions()));
        options.setStyleClass("reuise-consentbanner_preferencesbutton");
        return options;
    }

    protected WebDialogOptions createDefaultPreferencesDialogOptions() {
        WebDialogOptions options = ((WebDialogOptions) (super.createDefaultPreferencesDialogOptions()));
        options.setStyleClass("reuise-consentbanner_preferencesdialog");
        return options;
    }

    public String getClientConfigurationType() {
        return "ConsentBanner";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "message": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setMessage(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "acceptLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setAcceptLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "rejectLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setRejectLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "preferencesLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setPreferencesLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "preferencesTitle": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setPreferencesTitle(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
