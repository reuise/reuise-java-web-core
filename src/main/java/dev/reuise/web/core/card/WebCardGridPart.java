package dev.reuise.web.core.card;
import dev.reuise.core.card.CoreCardGridPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
public interface WebCardGridPart extends WebCardGridFeatures , CoreCardGridPart , WebComponentPart , WebContainerPart {
    WebContainer getScrim();

    WebContainer getCardContainer();

    WebContainerPart getContainerPart();
}