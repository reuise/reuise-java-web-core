package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreLabel;
import dev.reuise.web.core.WebComponent;
public interface WebLabel extends WebInlineText , WebComponent , CoreLabel , WebLabelPart {
    WebLabel getComponent();
}