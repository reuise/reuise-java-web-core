package dev.reuise.web.core.banner;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.banner.CoreBanner;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebFlexContainer;
public interface WebBanner extends WebFlexContainer , CoreBanner , WebComponent , WebBannerPart {
    WebBanner getComponent();

    WebBanner setAnimation(ComponentAnimation animation);

    WebBanner startAnimation();

    WebBanner cancelAnimation();
}
