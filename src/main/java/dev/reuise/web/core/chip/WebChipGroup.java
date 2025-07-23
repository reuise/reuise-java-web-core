package dev.reuise.web.core.chip;
import dev.reuise.core.chip.CoreChipGroup;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebFieldSet;
public interface WebChipGroup extends WebFieldSet , CoreChipGroup , WebComponent , WebChipGroupPart {
    WebChipGroup getComponent();
}