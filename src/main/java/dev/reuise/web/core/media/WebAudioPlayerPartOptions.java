package dev.reuise.web.core.media;
import dev.reuise.core.State;
import dev.reuise.core.media.CoreAudioPlayerPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebAudioPlayerPartOptions extends CoreAudioPlayerPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebAudioPlayer getComponent();
}