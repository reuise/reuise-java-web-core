package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreContainerPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebContainerPart extends WebParentComponentPart , CoreContainerPart , WebContainerFeatures , WebComponentPart {
    WebParentComponentPart getParentComponentPart();
}