package dev.reuise.web.core.chip;
import dev.reuise.core.chip.CoreChipPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.icon.WebIcon;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebLabel;
public interface WebChipPart extends WebParentComponentPart , WebComponentPart , CoreChipPart , WebChipFeatures {
    WebIcon getStartIcon();

    WebLabel getLabelContainer();

    WebIcon getEndIcon();

    WebParentComponentPart getParentComponentPart();
}