package dev.reuise.web.core.link;
import dev.reuise.core.link.CoreLink;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebLink extends WebParentComponent , CoreLink , WebComponent , WebLinkPart {
    WebLink getComponent();
}