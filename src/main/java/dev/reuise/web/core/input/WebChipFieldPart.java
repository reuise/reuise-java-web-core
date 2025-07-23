package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreChipFieldPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.chip.WebChipGroup;
public interface WebChipFieldPart extends WebChipFieldFeatures , WebTextFieldPart , WebComponentPart , CoreChipFieldPart {
    WebChipGroup getChipGroup();

    WebTextFieldPart getTextFieldPart();
}