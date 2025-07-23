package dev.reuise.web.core.dialog;
import dev.reuise.core.dialog.CoreMessageDialogPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebMessageDialogPart extends WebMessageDialogFeatures , WebComponentPart , WebDialogPart , CoreMessageDialogPart {
    WebDialogPart getDialogPart();
}