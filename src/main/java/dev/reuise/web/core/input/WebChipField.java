package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreChipField;
import dev.reuise.web.core.WebComponent;
public interface WebChipField extends WebChipFieldPart , CoreChipField , WebComponent , WebTextField {
    WebChipField getComponent();
}