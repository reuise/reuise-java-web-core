package dev.reuise.web.core.floating;
import dev.reuise.core.floating.CoreFloatingActionButtonPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.button.WebButtonPart;
import dev.reuise.web.core.text.WebInlineText;
public interface WebFloatingActionButtonPart extends WebButtonPart , WebComponentPart , WebFloatingActionButtonFeatures , CoreFloatingActionButtonPart {
    WebInlineText getBadge();

    WebButtonPart getButtonPart();
}
