package dev.reuise.web.core.dialog;
import dev.reuise.core.dialog.CoreDialog;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebDialog extends WebParentComponent , CoreDialog , WebComponent , WebDialogPart {
    WebDialog getComponent();
}