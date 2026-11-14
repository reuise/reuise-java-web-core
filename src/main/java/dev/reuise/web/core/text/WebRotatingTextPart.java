package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreRotatingTextPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
public interface WebRotatingTextPart extends CoreRotatingTextPart , WebRotatingTextFeatures , WebComponentPart , WebBaseComponentPart {
    WebBaseComponentPart getBaseComponentPart();
}
