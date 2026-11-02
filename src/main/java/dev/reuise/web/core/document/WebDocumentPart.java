package dev.reuise.web.core.document;
import dev.reuise.core.ColorMode;
import dev.reuise.core.dialog.CoreDialog;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebDocumentPart extends WebParentComponentPart , WebDocumentFeatures , WebComponentPart {
    String getUrlParameter(String urlParameter);

    void openDialog(CoreDialog dialog);

    WebDocumentPart setColorMode(ColorMode colorMode);

    ColorMode getColorMode();

    boolean isViewId(String viewId);

    WebDocumentBody getBody();

    WebParentComponentPart getParentComponentPart();
}
