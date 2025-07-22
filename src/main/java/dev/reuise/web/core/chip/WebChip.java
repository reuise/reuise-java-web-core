package dev.reuise.web.core.chip;
import dev.reuise.core.chip.CoreChip;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebChip extends WebParentComponent , CoreChip , WebComponent , WebChipPart {
    WebChip getComponent();
}