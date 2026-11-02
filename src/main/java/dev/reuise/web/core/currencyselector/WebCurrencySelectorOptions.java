package dev.reuise.web.core.currencyselector;
import dev.reuise.core.currencyselector.CoreCurrencySelectorOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
import dev.reuise.web.core.selectmenu.WebSelectMenuOptions;
import dev.reuise.web.core.selectmenu.WebSelectMenuPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebCurrencySelectorOptions extends WebCurrencySelectorPartOptions , WebBaseComponentPartOptions , CoreCurrencySelectorOptions , WebSelectMenuPartOptions , WebParentComponentPartOptions , WebComponentOptions , WebSelectMenuOptions {
    WebSelectMenuPartOptions getSelectMenuPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
