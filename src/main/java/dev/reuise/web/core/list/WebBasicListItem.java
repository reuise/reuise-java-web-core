package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreBasicListItem;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebBasicListItem extends WebParentComponent , WebComponent , WebBasicListItemPart , CoreBasicListItem {
    WebBasicListItem getComponent();
}