package dev.reuise.web.core.dialog;
import dev.reuise.core.dialog.CoreMessageDialog;
import dev.reuise.web.core.WebComponent;
public interface WebMessageDialog extends WebMessageDialogPart , CoreMessageDialog , WebComponent , WebDialog {
    WebMessageDialog getComponent();
}