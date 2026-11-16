package dev.reuise.web.core.chat;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.chat.AbstractCoreChatBoxOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.floating.WebFloatingPanelOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.input.WebBasicInputFieldOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.text.WebParagraphOptions;
import java.util.Map;
public abstract class AbstractWebChatBoxOptions<S extends AbstractWebChatBoxOptions<S>> extends AbstractCoreChatBoxOptions<S> implements ClientConfigurationOptions , WebChatBoxOptions {
    protected AbstractWebChatBoxOptions() {
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

    protected WebFloatingPanelOptions createDefaultFloatingPanelOptions() {
        WebFloatingPanelOptions options = ((WebFloatingPanelOptions) (super.createDefaultFloatingPanelOptions()));
        options.setStyleClass("reuise-chatbox_floatingpanel");
        return options;
    }

    protected WebContainerOptions createDefaultChatContentOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultChatContentOptions()));
        options.setStyleClass("reuise-chatbox_chatcontent");
        return options;
    }

    protected WebContainerOptions createDefaultMessagesOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultMessagesOptions()));
        options.setStyleClass("reuise-chatbox_messages");
        return options;
    }

    protected WebParagraphOptions createDefaultLoadingIndicatorOptions() {
        WebParagraphOptions options = ((WebParagraphOptions) (super.createDefaultLoadingIndicatorOptions()));
        options.setStyleClass("reuise-chatbox_loadingindicator");
        return options;
    }

    protected WebParagraphOptions createDefaultErrorDisplayOptions() {
        WebParagraphOptions options = ((WebParagraphOptions) (super.createDefaultErrorDisplayOptions()));
        options.setStyleClass("reuise-chatbox_errordisplay");
        return options;
    }

    protected WebButtonOptions createDefaultRetryButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultRetryButtonOptions()));
        options.setStyleClass("reuise-chatbox_retrybutton");
        return options;
    }

    protected WebParagraphOptions createDefaultHandoffDisplayOptions() {
        WebParagraphOptions options = ((WebParagraphOptions) (super.createDefaultHandoffDisplayOptions()));
        options.setStyleClass("reuise-chatbox_handoffdisplay");
        return options;
    }

    protected WebButtonOptions createDefaultRequestHumanButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultRequestHumanButtonOptions()));
        options.setStyleClass("reuise-chatbox_requesthumanbutton");
        return options;
    }

    protected WebContainerOptions createDefaultComposerAreaOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultComposerAreaOptions()));
        options.setStyleClass("reuise-chatbox_composerarea");
        return options;
    }

    protected WebBasicInputFieldOptions createDefaultComposerOptions() {
        WebBasicInputFieldOptions options = ((WebBasicInputFieldOptions) (super.createDefaultComposerOptions()));
        options.setStyleClass("reuise-chatbox_composer");
        return options;
    }

    protected WebButtonOptions createDefaultSendButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultSendButtonOptions()));
        options.setStyleClass("reuise-chatbox_sendbutton");
        return options;
    }

    protected WebButtonOptions createDefaultStopButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultStopButtonOptions()));
        options.setStyleClass("reuise-chatbox_stopbutton");
        return options;
    }

    public String getClientConfigurationType() {
        return "ChatBox";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "loading": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLoading(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "errorMessage": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setErrorMessage(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "handoffStatus": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHandoffStatus(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "handoffMessage": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHandoffMessage(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "handoffRequestedLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHandoffRequestedLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "handoffConnectedLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHandoffConnectedLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "handoffUnavailableLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHandoffUnavailableLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "messagesLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setMessagesLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "composerLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setComposerLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "composerPlaceholder": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setComposerPlaceholder(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "sendLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setSendLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "stopLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setStopLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "retryLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setRetryLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "requestHumanLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setRequestHumanLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "loadingLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLoadingLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
