package dev.reuise.web.core.chat;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.chat.AbstractCoreChatBoxOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.floating.WebFloatingPanelOptions;
import dev.reuise.web.core.input.WebBasicInputFieldOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.text.WebParagraphOptions;
public abstract class AbstractWebChatBoxOptions<S extends AbstractWebChatBoxOptions<S>> extends AbstractCoreChatBoxOptions<S> implements WebChatBoxOptions {
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
}
