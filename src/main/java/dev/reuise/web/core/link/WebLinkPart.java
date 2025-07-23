package dev.reuise.web.core.link;
import dev.reuise.core.link.CoreLinkPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebLinkPart extends WebParentComponentPart , CoreLinkPart , WebComponentPart , WebLinkFeatures {
    WebParentComponentPart getParentComponentPart();
}