package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuButtonItemPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.button.WebButtonPart;
public interface WebMenuButtonItemPart extends WebButtonPart , WebMenuButtonItemFeatures , CoreMenuButtonItemPart , WebComponentPart {
    WebButtonPart getButtonPart();
}
