package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreMultiEmailAddressField;
import dev.reuise.web.core.WebComponent;
public interface WebMultiEmailAddressField extends WebMultiEmailAddressFieldPart , WebComponent , CoreMultiEmailAddressField , WebChipField {
    WebMultiEmailAddressField getComponent();
}