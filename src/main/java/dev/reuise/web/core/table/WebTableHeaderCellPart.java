package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableHeaderCellPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.button.WebIconButton;
import dev.reuise.web.core.menu.WebMenu;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebInlineText;
public interface WebTableHeaderCellPart extends WebParentComponentPart , WebTableHeaderCellFeatures , CoreTableHeaderCellPart , WebComponentPart {
    WebInlineText getLabelContainer();

    WebMenu getMenu();

    WebIconButton getMenuButton();

    WebParentComponentPart getParentComponentPart();
}