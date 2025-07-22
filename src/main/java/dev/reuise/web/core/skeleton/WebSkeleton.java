package dev.reuise.web.core.skeleton;
import dev.reuise.core.skeleton.CoreSkeleton;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponent;
public interface WebSkeleton extends WebComponent , WebSkeletonPart , CoreSkeleton , WebBaseComponent {
    WebSkeleton getComponent();
}