package dev.reuise.web.core.banner;
import dev.reuise.core.State;
import dev.reuise.core.banner.CoreBannerPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebBannerPartOptions extends CoreBannerPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebBanner getComponent();
}
