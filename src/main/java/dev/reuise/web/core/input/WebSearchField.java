package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreSearchField;
import dev.reuise.web.core.WebComponent;
public interface WebSearchField extends WebSearchFieldPart , CoreSearchField , WebComponent , WebTextField {
    WebSearchField getComponent();
}