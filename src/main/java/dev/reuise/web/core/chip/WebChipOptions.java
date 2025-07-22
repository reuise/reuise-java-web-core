package dev.reuise.web.core.chip;
import dev.reuise.core.chip.CoreChipOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebChipOptions extends WebChipPartOptions , WebBaseComponentPartOptions , WebParentComponentOptions , WebParentComponentPartOptions , CoreChipOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}