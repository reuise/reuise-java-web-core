package dev.reuise.web.core.regionselector;
import dev.reuise.core.regionselector.CoreRegionSelector;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.selectmenu.WebSelectMenu;
public interface WebRegionSelector extends CoreRegionSelector , WebRegionSelectorPart , WebComponent , WebSelectMenu {
    WebRegionSelector getComponent();
}
