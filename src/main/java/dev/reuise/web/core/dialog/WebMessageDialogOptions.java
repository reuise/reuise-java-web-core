package dev.reuise.web.core.dialog;
import dev.reuise.core.dialog.CoreMessageDialogOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebMessageDialogOptions extends WebDialogOptions , WebBaseComponentPartOptions , WebMessageDialogPartOptions , WebDialogPartOptions , WebParentComponentPartOptions , CoreMessageDialogOptions , WebComponentOptions {
    WebDialogPartOptions getDialogPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}