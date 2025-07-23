package dev.reuise.web.core.chip;
import dev.reuise.core.chip.CoreFilterChipOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebFilterChipOptions extends WebFilterChipPartOptions , WebChipPartOptions , CoreFilterChipOptions , WebBaseComponentPartOptions , WebParentComponentPartOptions , WebChipOptions , WebComponentOptions {
    WebChipPartOptions getChipPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}