package dev.reuise.web.core.consent;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.consent.CoreConsentBanner;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebFlexContainer;
public interface WebConsentBanner extends WebFlexContainer , WebComponent , CoreConsentBanner , WebConsentBannerPart {
    WebConsentBanner getComponent();

    WebConsentBanner setAnimation(ComponentAnimation animation);

    WebConsentBanner startAnimation();

    WebConsentBanner cancelAnimation();
}
