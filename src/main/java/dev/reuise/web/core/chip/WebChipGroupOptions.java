package dev.reuise.web.core.chip;
import dev.reuise.core.chip.CoreChipGroupOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.layout.WebFieldSetOptions;
import dev.reuise.web.core.layout.WebFieldSetPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebChipGroupOptions extends WebFieldSetOptions , WebBaseComponentPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , CoreChipGroupOptions , WebChipGroupPartOptions , WebFieldSetPartOptions , WebComponentOptions {
    WebFieldSetPartOptions getFieldSetPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}