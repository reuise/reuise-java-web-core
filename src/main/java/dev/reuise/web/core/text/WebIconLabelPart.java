package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreIconLabelPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.icon.WebIcon;
import dev.reuise.web.core.link.WebLink;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebIconLabelPart extends WebParentComponentPart , CoreIconLabelPart , WebIconLabelFeatures , WebComponentPart {
    WebLink getLink();

    WebIcon getStartIcon();

    WebInlineText getLabelContainer();

    WebIcon getEndIcon();

    WebParentComponentPart getParentComponentPart();
}