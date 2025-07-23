package dev.reuise.web.core.divider;
import dev.reuise.core.divider.CoreDividerPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebInlineText;
public interface WebDividerPart extends WebParentComponentPart , CoreDividerPart , WebDividerFeatures , WebComponentPart {
    WebContainer getStartLine();

    WebInlineText getLabelContainer();

    WebContainer getEndLine();

    WebParentComponentPart getParentComponentPart();
}