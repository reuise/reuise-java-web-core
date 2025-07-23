package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreBasicListPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebBasicListPart extends WebParentComponentPart , WebBasicListFeatures , WebComponentPart , CoreBasicListPart {
    WebParentComponentPart getParentComponentPart();
}