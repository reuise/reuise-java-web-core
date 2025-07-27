package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreSegmentedTextFieldOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.layout.WebFlexContainerPartOptions;
import dev.reuise.web.core.layout.WebRowLayoutOptions;
import dev.reuise.web.core.layout.WebRowLayoutPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebSegmentedTextFieldOptions extends CoreSegmentedTextFieldOptions , WebBaseComponentPartOptions , WebFlexContainerPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , WebComponentOptions , WebRowLayoutPartOptions , WebRowLayoutOptions , WebSegmentedTextFieldPartOptions {
    WebRowLayoutPartOptions getRowLayoutPart();

    WebFlexContainerPartOptions getFlexContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}