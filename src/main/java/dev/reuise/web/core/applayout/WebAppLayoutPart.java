package dev.reuise.web.core.applayout;
import dev.reuise.core.applayout.CoreAppLayoutPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.splitcontainer.WebSplitContainer;
public interface WebAppLayoutPart extends WebParentComponentPart , CoreAppLayoutPart , WebAppLayoutFeatures , WebComponentPart {
    WebContainer getDrawerScrim();

    WebSplitContainer getDrawerSplit();

    WebSplitContainer getTopAppBarSplit();

    WebAppLayoutBody getBody();

    WebParentComponentPart getParentComponentPart();
}