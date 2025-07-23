package dev.reuise.web.core.checkbox;
import dev.reuise.core.checkbox.CoreCheckbox;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebCheckbox extends WebCheckboxPart , WebParentComponent , WebComponent , CoreCheckbox {
    WebCheckbox getComponent();
}