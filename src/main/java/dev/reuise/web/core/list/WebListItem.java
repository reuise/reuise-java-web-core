package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreListItem;
import dev.reuise.web.core.WebComponent;
public interface WebListItem extends WebListItemPart , WebBasicListItem , WebComponent , CoreListItem {
    WebListItem getComponent();
}