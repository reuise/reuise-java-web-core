package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreBasicList;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebBasicList extends CoreBasicList , WebParentComponent , WebBasicListPart , WebComponent {
    WebBasicList getComponent();
}