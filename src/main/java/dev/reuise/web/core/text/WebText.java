package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreText;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebText extends WebTextPart , WebParentComponent , CoreText , WebComponent {
    WebText getComponent();
}