package dev.reuise.web.core.checkbox;
import dev.reuise.core.checkbox.CoreBasicCheckbox;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponent;
public interface WebBasicCheckbox extends WebComponent , CoreBasicCheckbox , WebBasicCheckboxPart , WebBaseComponent {
    WebBasicCheckbox getComponent();
}