package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreSheetLayout;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.splitcontainer.WebSplitContainer;
public interface WebSheetLayout extends WebSplitContainer , WebComponent , WebSheetLayoutPart , CoreSheetLayout {
    WebSheetLayout getComponent();
}