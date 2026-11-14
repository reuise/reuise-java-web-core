package dev.reuise.web.core.banner;
import dev.reuise.core.banner.CoreBannerPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.icon.WebIcon;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebFlexContainer;
import dev.reuise.web.core.layout.WebFlexContainerPart;
import dev.reuise.web.core.text.WebParagraph;
public interface WebBannerPart extends CoreBannerPart , WebBannerFeatures , WebComponentPart , WebFlexContainerPart {
    WebIcon getIcon();

    WebContainer getContent();

    WebParagraph getMessageParagraph();

    WebFlexContainer getActions();

    WebButton getDismissButton();

    WebFlexContainerPart getFlexContainerPart();
}
