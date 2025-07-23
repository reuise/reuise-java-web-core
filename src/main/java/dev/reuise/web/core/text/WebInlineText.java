package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.web.core.WebComponent;
public interface WebInlineText extends WebText , WebComponent , WebInlineTextPart , CoreInlineText {
    WebInlineText getComponent();
}