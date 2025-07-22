package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreListView;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebListView extends WebListViewPart , WebParentComponent , WebComponent , CoreListView {
    WebListView getComponent();
}