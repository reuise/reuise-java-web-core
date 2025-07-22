package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreTextBlock;
import dev.reuise.web.core.WebComponent;
public interface WebTextBlock extends CoreTextBlock , WebText , WebComponent , WebTextBlockPart {
    WebTextBlock getComponent();
}