package dev.reuise.web.core.chat;
import dev.reuise.core.chat.CoreChatBoxPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.floating.WebFloatingPanel;
import dev.reuise.web.core.input.WebBasicInputField;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
import dev.reuise.web.core.text.WebParagraph;
public interface WebChatBoxPart extends CoreChatBoxPart , WebChatBoxFeatures , WebComponentPart , WebContainerPart {
    WebFloatingPanel getFloatingPanel();

    WebContainer getChatContent();

    WebContainer getMessages();

    WebParagraph getLoadingIndicator();

    WebParagraph getErrorDisplay();

    WebButton getRetryButton();

    WebParagraph getHandoffDisplay();

    WebButton getRequestHumanButton();

    WebContainer getComposerArea();

    WebBasicInputField getComposer();

    WebButton getSendButton();

    WebButton getStopButton();

    WebContainerPart getContainerPart();
}
