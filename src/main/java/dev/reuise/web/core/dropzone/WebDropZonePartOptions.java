package dev.reuise.web.core.dropzone;
import dev.reuise.core.State;
import dev.reuise.core.dropzone.CoreDropZonePartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebDropZonePartOptions extends CoreDropZonePartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebDropZone getComponent();
}