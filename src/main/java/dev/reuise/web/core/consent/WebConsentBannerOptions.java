package dev.reuise.web.core.consent;
import dev.reuise.core.consent.CoreConsentBannerOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.layout.WebFlexContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebConsentBannerOptions extends WebFlexContainerOptions , CoreConsentBannerOptions , WebBaseComponentPartOptions , WebConsentBannerPartOptions , WebFlexContainerPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebFlexContainerPartOptions getFlexContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
