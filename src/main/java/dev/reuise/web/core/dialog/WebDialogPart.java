package dev.reuise.web.core.dialog;
import dev.reuise.core.dialog.CoreDialogPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebFlexContainer;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebHeading;
public interface WebDialogPart extends WebParentComponentPart , CoreDialogPart , WebDialogFeatures , WebComponentPart {
    WebContainer getContainer();

    WebContainer getHeader();

    WebHeading getTitleHeading();

    WebFlexContainer getBody();

    WebFlexContainer getFooter();

    WebContainer getScrim();

    WebButton getAcceptButton();

    WebButton getCancelButton();

    WebParentComponentPart getParentComponentPart();
}