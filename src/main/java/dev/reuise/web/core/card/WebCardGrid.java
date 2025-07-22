package dev.reuise.web.core.card;
import dev.reuise.core.card.CoreCardGrid;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebCardGrid extends CoreCardGrid , WebComponent , WebCardGridPart , WebContainer {
    WebCardGrid getComponent();
}