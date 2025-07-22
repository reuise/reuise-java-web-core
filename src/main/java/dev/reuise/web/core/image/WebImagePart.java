package dev.reuise.web.core.image;
import dev.reuise.core.image.CoreImagePart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.link.WebLink;
public interface WebImagePart extends CoreImagePart , WebImageFeatures , WebComponentPart , WebBaseComponentPart {
    WebLink getLink();

    WebBaseComponentPart getBaseComponentPart();
}