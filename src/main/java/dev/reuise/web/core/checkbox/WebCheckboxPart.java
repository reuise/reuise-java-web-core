package dev.reuise.web.core.checkbox;
import dev.reuise.core.checkbox.CheckboxSize;
import dev.reuise.core.checkbox.CoreCheckboxPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebLabel;
// Size here??
public interface WebCheckboxPart extends WebParentComponentPart , WebCheckboxFeatures , WebComponentPart , CoreCheckboxPart {
    CheckboxSize getSize();

    WebCheckboxPart setSize(CheckboxSize size);

    WebBasicCheckbox getCheckbox();

    WebLabel getLabelContainer();

    WebParentComponentPart getParentComponentPart();
}