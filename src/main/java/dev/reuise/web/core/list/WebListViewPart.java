package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreListViewPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebListViewPart extends WebParentComponentPart , WebListViewFeatures , WebComponentPart , CoreListViewPart {
    WebParentComponentPart getParentComponentPart();
}