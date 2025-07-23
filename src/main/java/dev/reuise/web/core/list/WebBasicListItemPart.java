package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreBasicListItemPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.link.WebLink;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebBasicListItemPart extends WebParentComponentPart , CoreBasicListItemPart , WebBasicListItemFeatures , WebComponentPart {
    WebLink getLink();

    WebParentComponentPart getParentComponentPart();
}