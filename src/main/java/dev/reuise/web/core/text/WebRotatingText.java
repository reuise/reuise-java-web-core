package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreRotatingText;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponent;
public interface WebRotatingText extends WebComponent , CoreRotatingText , WebRotatingTextPart , WebBaseComponent {
    WebRotatingText getComponent();
}
