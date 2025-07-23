package dev.reuise.web.core.selectmenu;
import dev.reuise.core.State;
import dev.reuise.core.input.TextFieldSize;
import dev.reuise.core.selectmenu.CoreSelectMenuPartOptions;
import dev.reuise.web.core.WebComponentFactory;
// Placeholder here??
// Label here??
// Autocomplete here??
// ReadOnly here??
// Size here??
public interface WebSelectMenuPartOptions extends CoreSelectMenuPartOptions {
    String getPlaceholder();

    WebSelectMenuPartOptions setPlaceholder(String placeholder);

    String getLabel();

    WebSelectMenuPartOptions setLabel(String label);

    String getAutocomplete();

    WebSelectMenuPartOptions setAutocomplete(String autocomplete);

    boolean isReadOnly();

    WebSelectMenuPartOptions setReadOnly(Boolean readOnly);

    TextFieldSize getSize();

    WebSelectMenuPartOptions setSize(TextFieldSize size);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSelectMenu getComponent();
}