package dev.reuise.web.core.filepicker;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebFilePickerPartOptions {
    String getAccept();

    ComponentOption<String> getAcceptOption();

    WebFilePickerPartOptions setAccept(String accept);

    boolean isMultiple();

    ComponentOption<Boolean> getMultipleOption();

    WebFilePickerPartOptions setMultiple(Boolean multiple);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebFilePicker getComponent();
}