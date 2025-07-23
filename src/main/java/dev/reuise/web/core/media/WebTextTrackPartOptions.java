package dev.reuise.web.core.media;
import dev.reuise.core.State;
import dev.reuise.core.media.CoreTextTrackPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebTextTrackPartOptions extends CoreTextTrackPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebTextTrack getComponent();
}