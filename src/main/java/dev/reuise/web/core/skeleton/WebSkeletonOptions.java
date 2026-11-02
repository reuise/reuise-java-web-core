package dev.reuise.web.core.skeleton;
import dev.reuise.core.skeleton.CoreSkeletonOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebSkeletonOptions extends WebBaseComponentPartOptions , WebBaseComponentOptions , WebSkeletonPartOptions , CoreSkeletonOptions , WebComponentOptions {
    WebBaseComponentPartOptions getBaseComponentPart();
}
