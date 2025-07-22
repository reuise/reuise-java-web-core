package dev.reuise.web.core.card;
import dev.reuise.core.card.CoreCard;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebSurface;
public interface WebCard extends WebCardPart , CoreCard , WebComponent , WebSurface {
    WebCard getComponent();
}