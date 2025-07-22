package dev.reuise.web.core.bottomappbar;
import dev.reuise.core.bottomappbar.CoreBottomAppBarPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
public interface WebBottomAppBarPart extends WebBottomAppBarFeatures , CoreBottomAppBarPart , WebComponentPart , WebBaseComponentPart {
    WebBaseComponentPart getBaseComponentPart();
}