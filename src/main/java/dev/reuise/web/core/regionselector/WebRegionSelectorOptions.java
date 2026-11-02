package dev.reuise.web.core.regionselector;
import dev.reuise.core.regionselector.CoreRegionSelectorOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
import dev.reuise.web.core.selectmenu.WebSelectMenuOptions;
import dev.reuise.web.core.selectmenu.WebSelectMenuPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebRegionSelectorOptions extends WebBaseComponentPartOptions , WebSelectMenuPartOptions , WebParentComponentPartOptions , WebComponentOptions , WebRegionSelectorPartOptions , WebSelectMenuOptions , CoreRegionSelectorOptions {
    WebSelectMenuPartOptions getSelectMenuPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
