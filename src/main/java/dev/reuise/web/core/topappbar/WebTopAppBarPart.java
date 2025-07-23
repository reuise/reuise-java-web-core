package dev.reuise.web.core.topappbar;
import dev.reuise.core.topappbar.CoreTopAppBarPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.button.WebIconButton;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebTopAppBarPart extends WebParentComponentPart , WebTopAppBarFeatures , WebComponentPart , CoreTopAppBarPart {
    WebContainer getContainer();

    WebIconButton getNavigationButton();

    WebContainer getTitleContainer();

    WebContainer getActionsContainer();

    WebParentComponentPart getParentComponentPart();
}