package dev.reuise.web.core.card;
import dev.reuise.core.card.CoreCardPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.image.WebImage;
import dev.reuise.web.core.layout.WebFlexContainer;
import dev.reuise.web.core.layout.WebSurfacePart;
import dev.reuise.web.core.link.WebLink;
import dev.reuise.web.core.text.WebTextBlock;
public interface WebCardPart extends CoreCardPart , WebSurfacePart , WebCardFeatures , WebComponentPart {
    WebLink getMediaLink();

    WebFlexContainer getMediaContainer();

    WebImage getImage();

    WebFlexContainer getTextContent();

    WebFlexContainer getHeadline();

    WebLink getHeadingLink();

    WebTextBlock getHeadingContainer();

    WebTextBlock getSubHeadingContainer();

    WebTextBlock getTextContainer();

    WebFlexContainer getActionsContainer();

    WebSurfacePart getSurfacePart();
}