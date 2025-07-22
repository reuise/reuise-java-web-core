package dev.reuise.web.core.link;
import dev.reuise.core.link.CoreNavigationLinkFeatures;
import dev.reuise.web.core.view.PathMatchType;
public interface WebNavigationLinkFeatures extends CoreNavigationLinkFeatures {
    PathMatchType getActiveMatchType();

    WebNavigationLinkFeatures setActiveMatchType(PathMatchType activeMatchType);
}