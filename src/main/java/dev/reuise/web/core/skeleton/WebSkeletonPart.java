package dev.reuise.web.core.skeleton;
import dev.reuise.core.skeleton.CoreSkeletonPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
public interface WebSkeletonPart extends WebSkeletonFeatures , CoreSkeletonPart , WebComponentPart , WebBaseComponentPart {
    WebBaseComponentPart getBaseComponentPart();
}