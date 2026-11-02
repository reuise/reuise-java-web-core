package dev.reuise.web.core.currencyselector;
import dev.reuise.core.currencyselector.CoreCurrencySelector;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.selectmenu.WebSelectMenu;
public interface WebCurrencySelector extends WebCurrencySelectorPart , CoreCurrencySelector , WebComponent , WebSelectMenu {
    WebCurrencySelector getComponent();
}
