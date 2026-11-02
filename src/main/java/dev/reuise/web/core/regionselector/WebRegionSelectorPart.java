package dev.reuise.web.core.regionselector;
import dev.reuise.core.regionselector.CoreRegionSelectorPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.selectmenu.WebSelectMenuPart;
public interface WebRegionSelectorPart extends WebRegionSelectorFeatures , WebSelectMenuPart , WebComponentPart , CoreRegionSelectorPart {
    WebSelectMenuPart getSelectMenuPart();
}
