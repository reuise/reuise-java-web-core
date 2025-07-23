package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreListItemPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.checkbox.WebCheckbox;
import dev.reuise.web.core.icon.WebIcon;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.text.WebInlineText;
public interface WebListItemPart extends WebListItemFeatures , WebComponentPart , WebBasicListItemPart , CoreListItemPart {
    WebCheckbox getCheckbox();

    WebIcon getStartIcon();

    WebContainer getTextContainer();

    WebInlineText getLabelContainer();

    WebInlineText getSecondaryLabelContainer();

    WebIcon getEndIcon();

    WebBasicListItemPart getBasicListItemPart();
}