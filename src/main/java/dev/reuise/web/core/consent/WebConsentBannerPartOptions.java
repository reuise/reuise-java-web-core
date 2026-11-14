package dev.reuise.web.core.consent;
import dev.reuise.core.State;
import dev.reuise.core.consent.CoreConsentBannerPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebConsentBannerPartOptions extends CoreConsentBannerPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebConsentBanner getComponent();
}
