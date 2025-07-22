package dev.reuise.web.core.icon;
import dev.reuise.core.icon.CoreIconPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.graphics.svg.WebSvg;
import dev.reuise.web.core.image.WebImage;
import dev.reuise.web.core.link.WebLink;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebIconPart extends WebParentComponentPart , CoreIconPart , WebComponentPart , WebIconFeatures {
    WebSvg getSvg();

    WebLink getLink();

    WebImage getImage();

    WebParentComponentPart getParentComponentPart();
}