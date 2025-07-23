package dev.reuise.web.core.image;
import dev.reuise.core.image.CoreImage;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponent;
public interface WebImage extends WebComponent , CoreImage , WebImagePart , WebBaseComponent {
    WebImage getComponent();
}