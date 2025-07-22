package dev.reuise.web.core.bottomappbar;
import dev.reuise.core.bottomappbar.CoreBottomAppBar;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponent;
public interface WebBottomAppBar extends WebComponent , CoreBottomAppBar , WebBottomAppBarPart , WebBaseComponent {
    WebBottomAppBar getComponent();
}