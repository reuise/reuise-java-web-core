package dev.reuise.web.core.selectmenu;
import dev.reuise.core.input.TextFieldSize;
import dev.reuise.core.selectmenu.CoreSelectMenuPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.input.WebTextField;
import dev.reuise.web.core.menu.WebMenu;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
// Placeholder here??
// Label here??
// Autocomplete here??
// ReadOnly here??
// Size here??
public interface WebSelectMenuPart extends WebParentComponentPart , WebSelectMenuFeatures , WebComponentPart , CoreSelectMenuPart {
    String getPlaceholder();

    WebSelectMenuPart setPlaceholder(String placeholder);

    String getLabel();

    WebSelectMenuPart setLabel(String label);

    String getAutocomplete();

    WebSelectMenuPart setAutocomplete(String autocomplete);

    boolean isReadOnly();

    WebSelectMenuPart setReadOnly(Boolean readOnly);

    TextFieldSize getSize();

    WebSelectMenuPart setSize(TextFieldSize size);

    WebTextField getTextField();

    WebMenu getMenu();

    WebParentComponentPart getParentComponentPart();
}