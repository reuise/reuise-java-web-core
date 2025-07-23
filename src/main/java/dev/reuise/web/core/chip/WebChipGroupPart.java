package dev.reuise.web.core.chip;
import dev.reuise.core.chip.CoreChipGroupPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebFieldSetPart;
public interface WebChipGroupPart extends CoreChipGroupPart , WebChipGroupFeatures , WebComponentPart , WebFieldSetPart {
    WebChip getAddButton();

    WebFieldSetPart getFieldSetPart();
}