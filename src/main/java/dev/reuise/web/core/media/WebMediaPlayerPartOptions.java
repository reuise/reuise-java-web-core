package dev.reuise.web.core.media;
import dev.reuise.core.State;
import dev.reuise.core.media.CoreMediaPlayerPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebMediaPlayerPartOptions extends CoreMediaPlayerPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebMediaPlayer getComponent();
}