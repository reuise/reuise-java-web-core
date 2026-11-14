package dev.reuise.web.core.chat;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.chat.CoreChatBox;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebChatBox extends WebChatBoxPart , WebComponent , WebContainer , CoreChatBox {
    WebChatBox getComponent();

    WebChatBox setAnimation(ComponentAnimation animation);

    WebChatBox startAnimation();

    WebChatBox cancelAnimation();
}
