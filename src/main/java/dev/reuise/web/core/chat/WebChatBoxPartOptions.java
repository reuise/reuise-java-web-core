package dev.reuise.web.core.chat;
import dev.reuise.core.State;
import dev.reuise.core.chat.CoreChatBoxPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebChatBoxPartOptions extends CoreChatBoxPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebChatBox getComponent();
}
