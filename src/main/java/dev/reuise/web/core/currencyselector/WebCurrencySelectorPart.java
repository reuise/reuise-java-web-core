package dev.reuise.web.core.currencyselector;
import dev.reuise.core.currencyselector.CoreCurrencySelectorPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.selectmenu.WebSelectMenuPart;
public interface WebCurrencySelectorPart extends WebSelectMenuPart , WebComponentPart , WebCurrencySelectorFeatures , CoreCurrencySelectorPart {
    WebSelectMenuPart getSelectMenuPart();
}
