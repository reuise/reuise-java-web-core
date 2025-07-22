package dev.reuise.web.core.image;
import dev.reuise.core.image.CoreImageOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebImageOptions extends CoreImageOptions , WebImagePartOptions , WebBaseComponentPartOptions , WebBaseComponentOptions , WebComponentOptions {
    WebBaseComponentPartOptions getBaseComponentPart();
}