package dev.reuise.web.core.consent;
import dev.reuise.core.consent.CoreConsentBannerPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.dialog.WebDialog;
import dev.reuise.web.core.layout.WebFlexContainer;
import dev.reuise.web.core.layout.WebFlexContainerPart;
import dev.reuise.web.core.text.WebParagraph;
public interface WebConsentBannerPart extends WebConsentBannerFeatures , CoreConsentBannerPart , WebComponentPart , WebFlexContainerPart {
    WebParagraph getMessageParagraph();

    WebFlexContainer getActions();

    WebButton getAcceptButton();

    WebButton getRejectButton();

    WebButton getPreferencesButton();

    WebDialog getPreferencesDialog();

    WebFlexContainerPart getFlexContainerPart();
}
