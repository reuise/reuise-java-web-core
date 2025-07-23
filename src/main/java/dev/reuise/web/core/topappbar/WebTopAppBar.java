package dev.reuise.web.core.topappbar;
import dev.reuise.core.topappbar.CoreTopAppBar;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTopAppBar extends WebParentComponent , CoreTopAppBar , WebTopAppBarPart , WebComponent {
    WebTopAppBar getComponent();
}