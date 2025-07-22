package dev.reuise.web.core.link;
import dev.reuise.core.State;
import dev.reuise.core.link.CoreNavigationLinkPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.view.PathMatchType;
public interface WebNavigationLinkPartOptions extends CoreNavigationLinkPartOptions {
    PathMatchType getActiveMatchType();

    ComponentOption<PathMatchType> getActiveMatchTypeOption();

    WebNavigationLinkPartOptions setActiveMatchType(PathMatchType activeMatchType);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebNavigationLink getComponent();
}