package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreIconLabel;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebIconLabel extends CoreIconLabel , WebParentComponent , WebComponent , WebIconLabelPart {
    WebIconLabel getComponent();
}