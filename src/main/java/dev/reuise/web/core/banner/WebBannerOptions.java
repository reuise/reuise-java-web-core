package dev.reuise.web.core.banner;
import dev.reuise.core.banner.CoreBannerOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.layout.WebFlexContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebBannerOptions extends WebFlexContainerOptions , WebBannerPartOptions , WebBaseComponentPartOptions , WebFlexContainerPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , CoreBannerOptions , WebComponentOptions {
    WebFlexContainerPartOptions getFlexContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
