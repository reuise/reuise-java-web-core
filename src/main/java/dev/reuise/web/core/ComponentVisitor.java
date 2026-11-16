package dev.reuise.web.core;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;

/** Visits public component children and slots once by identity, without following parent references. */
public final class ComponentVisitor {
    private ComponentVisitor() {}

    public static void visit(CoreComponent root, Consumer<? super CoreComponent> visitor) {
        Objects.requireNonNull(visitor, "visitor");
        visit(root, visitor, new IdentityHashMap<CoreComponent, Boolean>());
    }

    private static void visit(CoreComponent component, Consumer<? super CoreComponent> visitor,
            IdentityHashMap<CoreComponent, Boolean> visited) {
        if (component == null || visited.put(component, Boolean.TRUE) != null) return;
        visitor.accept(component);
        List<CoreComponent> children = new ArrayList<>();
        if (component instanceof CoreParentComponent) {
            List<CoreComponent> normal = ((CoreParentComponent) component).getChildren();
            if (normal != null) children.addAll(normal);
        }
        collectSlots(component, children);
        for (CoreComponent child : children) visit(child, visitor, visited);
    }

    private static void collectSlots(CoreComponent component, List<CoreComponent> children) {
        if (component instanceof dev.reuise.web.core.applayout.WebAppLayoutPart) {
            children.add(((dev.reuise.web.core.applayout.WebAppLayoutPart) component).getDrawerScrim());
            children.add(((dev.reuise.web.core.applayout.WebAppLayoutPart) component).getDrawerSplit());
            children.add(((dev.reuise.web.core.applayout.WebAppLayoutPart) component).getTopAppBarSplit());
            children.add(((dev.reuise.web.core.applayout.WebAppLayoutPart) component).getBody());
            children.add(((dev.reuise.web.core.applayout.WebAppLayoutPart) component).getTopAppBar());
            children.add(((dev.reuise.web.core.applayout.WebAppLayoutPart) component).getBottomAppBar());
            children.add(((dev.reuise.web.core.applayout.WebAppLayoutPart) component).getDrawer());
        }
        if (component instanceof dev.reuise.web.core.avatar.WebAvatarPart) {
            children.add(((dev.reuise.web.core.avatar.WebAvatarPart) component).getImage());
            children.add(((dev.reuise.web.core.avatar.WebAvatarPart) component).getBadge());
        }
        if (component instanceof dev.reuise.web.core.banner.WebBannerPart) {
            children.add(((dev.reuise.web.core.banner.WebBannerPart) component).getIcon());
            children.add(((dev.reuise.web.core.banner.WebBannerPart) component).getContent());
            children.add(((dev.reuise.web.core.banner.WebBannerPart) component).getMessageParagraph());
            children.add(((dev.reuise.web.core.banner.WebBannerPart) component).getActions());
            children.add(((dev.reuise.web.core.banner.WebBannerPart) component).getDismissButton());
        }
        if (component instanceof dev.reuise.web.core.button.WebButtonPart) {
            children.add(((dev.reuise.web.core.button.WebButtonPart) component).getStartIcon());
            children.add(((dev.reuise.web.core.button.WebButtonPart) component).getLabelContainer());
            children.add(((dev.reuise.web.core.button.WebButtonPart) component).getEndIcon());
        }
        if (component instanceof dev.reuise.web.core.carousel.WebCarouselPart) {
            children.add(((dev.reuise.web.core.carousel.WebCarouselPart) component).getViewport());
            children.add(((dev.reuise.web.core.carousel.WebCarouselPart) component).getSlider());
            children.add(((dev.reuise.web.core.carousel.WebCarouselPart) component).getNavigation());
            children.add(((dev.reuise.web.core.carousel.WebCarouselPart) component).getPreviousButton());
            children.add(((dev.reuise.web.core.carousel.WebCarouselPart) component).getIndicators());
            children.add(((dev.reuise.web.core.carousel.WebCarouselPart) component).getNextButton());
            children.add(((dev.reuise.web.core.carousel.WebCarouselPart) component).getAutoplayButton());
            children.add(((dev.reuise.web.core.carousel.WebCarouselPart) component).getAnnouncement());
        }
        if (component instanceof dev.reuise.web.core.chat.WebChatBoxPart) {
            children.add(((dev.reuise.web.core.chat.WebChatBoxPart) component).getFloatingPanel());
            children.add(((dev.reuise.web.core.chat.WebChatBoxPart) component).getChatContent());
            children.add(((dev.reuise.web.core.chat.WebChatBoxPart) component).getMessages());
            children.add(((dev.reuise.web.core.chat.WebChatBoxPart) component).getLoadingIndicator());
            children.add(((dev.reuise.web.core.chat.WebChatBoxPart) component).getErrorDisplay());
            children.add(((dev.reuise.web.core.chat.WebChatBoxPart) component).getRetryButton());
            children.add(((dev.reuise.web.core.chat.WebChatBoxPart) component).getHandoffDisplay());
            children.add(((dev.reuise.web.core.chat.WebChatBoxPart) component).getRequestHumanButton());
            children.add(((dev.reuise.web.core.chat.WebChatBoxPart) component).getComposerArea());
            children.add(((dev.reuise.web.core.chat.WebChatBoxPart) component).getComposer());
            children.add(((dev.reuise.web.core.chat.WebChatBoxPart) component).getSendButton());
            children.add(((dev.reuise.web.core.chat.WebChatBoxPart) component).getStopButton());
        }
        if (component instanceof dev.reuise.web.core.checkbox.WebCheckboxPart) {
            children.add(((dev.reuise.web.core.checkbox.WebCheckboxPart) component).getCheckbox());
            children.add(((dev.reuise.web.core.checkbox.WebCheckboxPart) component).getLabelContainer());
        }
        if (component instanceof dev.reuise.web.core.chip.WebChipPart) {
            children.add(((dev.reuise.web.core.chip.WebChipPart) component).getStartIcon());
            children.add(((dev.reuise.web.core.chip.WebChipPart) component).getLabelContainer());
            children.add(((dev.reuise.web.core.chip.WebChipPart) component).getEndIcon());
        }
        if (component instanceof dev.reuise.web.core.chip.WebChipGroupPart) {
            children.add(((dev.reuise.web.core.chip.WebChipGroupPart) component).getAddButton());
            addAll(children, ((dev.reuise.web.core.chip.WebChipGroupPart) component).getChips());
        }
        if (component instanceof dev.reuise.web.core.dialog.WebDialogPart) {
            children.add(((dev.reuise.web.core.dialog.WebDialogPart) component).getContainer());
            children.add(((dev.reuise.web.core.dialog.WebDialogPart) component).getHeader());
            children.add(((dev.reuise.web.core.dialog.WebDialogPart) component).getTitleHeading());
            children.add(((dev.reuise.web.core.dialog.WebDialogPart) component).getBody());
            children.add(((dev.reuise.web.core.dialog.WebDialogPart) component).getFooter());
            children.add(((dev.reuise.web.core.dialog.WebDialogPart) component).getScrim());
            children.add(((dev.reuise.web.core.dialog.WebDialogPart) component).getAcceptButton());
            children.add(((dev.reuise.web.core.dialog.WebDialogPart) component).getCancelButton());
        }
        if (component instanceof dev.reuise.web.core.divider.WebDividerPart) {
            children.add(((dev.reuise.web.core.divider.WebDividerPart) component).getStartLine());
            children.add(((dev.reuise.web.core.divider.WebDividerPart) component).getLabelContainer());
            children.add(((dev.reuise.web.core.divider.WebDividerPart) component).getEndLine());
        }
        if (component instanceof dev.reuise.web.core.document.WebDocumentPart) {
            children.add(((dev.reuise.web.core.document.WebDocumentPart) component).getBody());
        }
        if (component instanceof dev.reuise.web.core.floating.WebFloatingActionButtonPart) {
            children.add(((dev.reuise.web.core.floating.WebFloatingActionButtonPart) component).getBadge());
        }
        if (component instanceof dev.reuise.web.core.floating.WebFloatingPanelPart) {
            children.add(((dev.reuise.web.core.floating.WebFloatingPanelPart) component).getTrigger());
            children.add(((dev.reuise.web.core.floating.WebFloatingPanelPart) component).getPanel());
            children.add(((dev.reuise.web.core.floating.WebFloatingPanelPart) component).getHeader());
            children.add(((dev.reuise.web.core.floating.WebFloatingPanelPart) component).getTitleContainer());
            children.add(((dev.reuise.web.core.floating.WebFloatingPanelPart) component).getMinimiseButton());
            children.add(((dev.reuise.web.core.floating.WebFloatingPanelPart) component).getCloseButton());
            children.add(((dev.reuise.web.core.floating.WebFloatingPanelPart) component).getContent());
        }
        if (component instanceof dev.reuise.web.core.icon.WebIconPart) {
            children.add(((dev.reuise.web.core.icon.WebIconPart) component).getSvg());
            children.add(((dev.reuise.web.core.icon.WebIconPart) component).getLink());
            children.add(((dev.reuise.web.core.icon.WebIconPart) component).getImage());
        }
        if (component instanceof dev.reuise.web.core.button.WebIconButtonPart) {
            children.add(((dev.reuise.web.core.button.WebIconButtonPart) component).getIcon());
        }
        if (component instanceof dev.reuise.web.core.image.WebImagePart) {
            children.add(((dev.reuise.web.core.image.WebImagePart) component).getLink());
        }
        if (component instanceof dev.reuise.web.core.link.WebLinkPart) {
            children.add(((dev.reuise.web.core.link.WebLinkPart) component).getStartIcon());
            children.add(((dev.reuise.web.core.link.WebLinkPart) component).getEndIcon());
        }
        if (component instanceof dev.reuise.web.core.menu.WebMenuPart) {
            children.add(((dev.reuise.web.core.menu.WebMenuPart) component).getList());
        }
        if (component instanceof dev.reuise.web.core.menu.WebMenuButtonPart) {
            children.add(((dev.reuise.web.core.menu.WebMenuButtonPart) component).getTrigger());
            children.add(((dev.reuise.web.core.menu.WebMenuButtonPart) component).getPopup());
        }
        if (component instanceof dev.reuise.web.core.overflow.WebOverflowBarPart) {
            children.add(((dev.reuise.web.core.overflow.WebOverflowBarPart) component).getItems());
            children.add(((dev.reuise.web.core.overflow.WebOverflowBarPart) component).getOverflowMenu());
        }
        if (component instanceof dev.reuise.web.core.progressindicator.WebProgressIndicatorPart) {
            children.add(((dev.reuise.web.core.progressindicator.WebProgressIndicatorPart) component).getTrack());
        }
        if (component instanceof dev.reuise.web.core.scrollablecontainer.WebScrollableContainerPart) {
            children.add(((dev.reuise.web.core.scrollablecontainer.WebScrollableContainerPart) component).getScrollAreaBefore());
            children.add(((dev.reuise.web.core.scrollablecontainer.WebScrollableContainerPart) component).getScrollArea());
            children.add(((dev.reuise.web.core.scrollablecontainer.WebScrollableContainerPart) component).getScrollAreaAfter());
        }
        if (component instanceof dev.reuise.web.core.scrollablecontainer.WebScrollableContainerScrollAreaPart) {
            children.add(((dev.reuise.web.core.scrollablecontainer.WebScrollableContainerScrollAreaPart) component).getScrollAreaTopFade());
            children.add(((dev.reuise.web.core.scrollablecontainer.WebScrollableContainerScrollAreaPart) component).getScrollAreaLeftFade());
            children.add(((dev.reuise.web.core.scrollablecontainer.WebScrollableContainerScrollAreaPart) component).getScrollAreaContent());
            children.add(((dev.reuise.web.core.scrollablecontainer.WebScrollableContainerScrollAreaPart) component).getScrollAreaBottomFade());
            children.add(((dev.reuise.web.core.scrollablecontainer.WebScrollableContainerScrollAreaPart) component).getScrollAreaRightFade());
        }
        if (component instanceof dev.reuise.web.core.selectmenu.WebSelectMenuPart) {
            children.add(((dev.reuise.web.core.selectmenu.WebSelectMenuPart) component).getTextField());
            children.add(((dev.reuise.web.core.selectmenu.WebSelectMenuPart) component).getMenu());
        }
        if (component instanceof dev.reuise.web.core.slidecontainer.WebSlideContainerPart) {
            children.add(((dev.reuise.web.core.slidecontainer.WebSlideContainerPart) component).getSlideAreaBefore());
            children.add(((dev.reuise.web.core.slidecontainer.WebSlideContainerPart) component).getSlideArea());
            children.add(((dev.reuise.web.core.slidecontainer.WebSlideContainerPart) component).getSlideAreaAfter());
        }
        if (component instanceof dev.reuise.web.core.topappbar.WebTopAppBarPart) {
            children.add(((dev.reuise.web.core.topappbar.WebTopAppBarPart) component).getContainer());
            children.add(((dev.reuise.web.core.topappbar.WebTopAppBarPart) component).getNavigationButton());
            children.add(((dev.reuise.web.core.topappbar.WebTopAppBarPart) component).getTitleContainer());
            children.add(((dev.reuise.web.core.topappbar.WebTopAppBarPart) component).getActionsContainer());
            addAll(children, ((dev.reuise.web.core.topappbar.WebTopAppBarPart) component).getActions());
        }
        if (component instanceof dev.reuise.web.core.accordion.WebAccordionItemPart) {
            children.add(((dev.reuise.web.core.accordion.WebAccordionItemPart) component).getHeader());
            children.add(((dev.reuise.web.core.accordion.WebAccordionItemPart) component).getToggle());
            children.add(((dev.reuise.web.core.accordion.WebAccordionItemPart) component).getContent());
        }
        if (component instanceof dev.reuise.web.core.card.WebCardPart) {
            children.add(((dev.reuise.web.core.card.WebCardPart) component).getMediaLink());
            children.add(((dev.reuise.web.core.card.WebCardPart) component).getMediaContainer());
            children.add(((dev.reuise.web.core.card.WebCardPart) component).getImage());
            children.add(((dev.reuise.web.core.card.WebCardPart) component).getTextContent());
            children.add(((dev.reuise.web.core.card.WebCardPart) component).getHeadline());
            children.add(((dev.reuise.web.core.card.WebCardPart) component).getHeadingLink());
            children.add(((dev.reuise.web.core.card.WebCardPart) component).getHeadingContainer());
            children.add(((dev.reuise.web.core.card.WebCardPart) component).getSubHeadingContainer());
            children.add(((dev.reuise.web.core.card.WebCardPart) component).getTextContainer());
            children.add(((dev.reuise.web.core.card.WebCardPart) component).getActionsContainer());
        }
        if (component instanceof dev.reuise.web.core.card.WebCardGridPart) {
            children.add(((dev.reuise.web.core.card.WebCardGridPart) component).getScrim());
            children.add(((dev.reuise.web.core.card.WebCardGridPart) component).getCardContainer());
        }
        if (component instanceof dev.reuise.web.core.consent.WebConsentBannerPart) {
            children.add(((dev.reuise.web.core.consent.WebConsentBannerPart) component).getMessageParagraph());
            children.add(((dev.reuise.web.core.consent.WebConsentBannerPart) component).getActions());
            children.add(((dev.reuise.web.core.consent.WebConsentBannerPart) component).getAcceptButton());
            children.add(((dev.reuise.web.core.consent.WebConsentBannerPart) component).getRejectButton());
            children.add(((dev.reuise.web.core.consent.WebConsentBannerPart) component).getPreferencesButton());
            children.add(((dev.reuise.web.core.consent.WebConsentBannerPart) component).getPreferencesDialog());
        }
        if (component instanceof dev.reuise.web.core.input.WebChipFieldPart) {
            children.add(((dev.reuise.web.core.input.WebChipFieldPart) component).getChipGroup());
        }
        if (component instanceof dev.reuise.web.core.input.WebSegmentedTextFieldPart) {
            addAll(children, ((dev.reuise.web.core.input.WebSegmentedTextFieldPart) component).getFields());
        }
        if (component instanceof dev.reuise.web.core.input.WebTextFieldPart) {
            children.add(((dev.reuise.web.core.input.WebTextFieldPart) component).getLabelContainer());
            children.add(((dev.reuise.web.core.input.WebTextFieldPart) component).getInputContainer());
            children.add(((dev.reuise.web.core.input.WebTextFieldPart) component).getStartIcon());
            children.add(((dev.reuise.web.core.input.WebTextFieldPart) component).getInput());
            children.add(((dev.reuise.web.core.input.WebTextFieldPart) component).getEndIcon());
            children.add(((dev.reuise.web.core.input.WebTextFieldPart) component).getSupportingTextContainer());
        }
        if (component instanceof dev.reuise.web.core.splitcontainer.WebSplitContainerPart) {
            children.add(((dev.reuise.web.core.splitcontainer.WebSplitContainerPart) component).getContainer());
            children.add(((dev.reuise.web.core.splitcontainer.WebSplitContainerPart) component).getStartPanel());
            children.add(((dev.reuise.web.core.splitcontainer.WebSplitContainerPart) component).getDivider());
            children.add(((dev.reuise.web.core.splitcontainer.WebSplitContainerPart) component).getEndPanel());
        }
        if (component instanceof dev.reuise.web.core.list.WebBasicListItemPart) {
            children.add(((dev.reuise.web.core.list.WebBasicListItemPart) component).getLink());
        }
        if (component instanceof dev.reuise.web.core.list.WebListItemPart) {
            children.add(((dev.reuise.web.core.list.WebListItemPart) component).getCheckbox());
            children.add(((dev.reuise.web.core.list.WebListItemPart) component).getStartIcon());
            children.add(((dev.reuise.web.core.list.WebListItemPart) component).getTextContainer());
            children.add(((dev.reuise.web.core.list.WebListItemPart) component).getLabelContainer());
            children.add(((dev.reuise.web.core.list.WebListItemPart) component).getSecondaryLabelContainer());
            children.add(((dev.reuise.web.core.list.WebListItemPart) component).getEndIcon());
        }
        if (component instanceof dev.reuise.web.core.list.WebListViewPart) {
            addAll(children, ((dev.reuise.web.core.list.WebListViewPart) component).getItems());
        }
        if (component instanceof dev.reuise.web.core.media.WebMediaPlayerPart) {
            addAll(children, ((dev.reuise.web.core.media.WebMediaPlayerPart) component).getTextTracks());
        }
        if (component instanceof dev.reuise.web.core.navigation.WebNavigationTreeGroupPart) {
            children.add(((dev.reuise.web.core.navigation.WebNavigationTreeGroupPart) component).getLink());
            children.add(((dev.reuise.web.core.navigation.WebNavigationTreeGroupPart) component).getTree());
        }
        if (component instanceof dev.reuise.web.core.navigation.WebNavigationTreeLinkPart) {
            children.add(((dev.reuise.web.core.navigation.WebNavigationTreeLinkPart) component).getItem());
        }
        if (component instanceof dev.reuise.web.core.table.WebCheckboxTableCellPart) {
            children.add(((dev.reuise.web.core.table.WebCheckboxTableCellPart) component).getCheckbox());
        }
        if (component instanceof dev.reuise.web.core.table.WebCheckboxTableColumnPart) {
            children.add(((dev.reuise.web.core.table.WebCheckboxTableColumnPart) component).getCheckbox());
        }
        if (component instanceof dev.reuise.web.core.table.WebTablePart) {
            children.add(((dev.reuise.web.core.table.WebTablePart) component).getTable());
            children.add(((dev.reuise.web.core.table.WebTablePart) component).getColumnGroup());
            children.add(((dev.reuise.web.core.table.WebTablePart) component).getHeader());
            children.add(((dev.reuise.web.core.table.WebTablePart) component).getBody());
            children.add(((dev.reuise.web.core.table.WebTablePart) component).getFooter());
        }
        if (component instanceof dev.reuise.web.core.table.WebTableHeaderPart) {
            children.add(((dev.reuise.web.core.table.WebTableHeaderPart) component).getRow());
        }
        if (component instanceof dev.reuise.web.core.table.WebTableHeaderCellPart) {
            children.add(((dev.reuise.web.core.table.WebTableHeaderCellPart) component).getLabelContainer());
            children.add(((dev.reuise.web.core.table.WebTableHeaderCellPart) component).getMenu());
            children.add(((dev.reuise.web.core.table.WebTableHeaderCellPart) component).getMenuButton());
        }
        if (component instanceof dev.reuise.web.core.tabs.WebTabPart) {
            children.add(((dev.reuise.web.core.tabs.WebTabPart) component).getLink());
            children.add(((dev.reuise.web.core.tabs.WebTabPart) component).getBadge());
            children.add(((dev.reuise.web.core.tabs.WebTabPart) component).getIcon());
            children.add(((dev.reuise.web.core.tabs.WebTabPart) component).getLabelContainer());
        }
        if (component instanceof dev.reuise.web.core.tabs.WebTabBarPart) {
            children.add(((dev.reuise.web.core.tabs.WebTabBarPart) component).getContainer());
            children.add(((dev.reuise.web.core.tabs.WebTabBarPart) component).getActiveIndicator());
            addAll(children, ((dev.reuise.web.core.tabs.WebTabBarPart) component).getTabs());
        }
        if (component instanceof dev.reuise.web.core.text.WebIconLabelPart) {
            children.add(((dev.reuise.web.core.text.WebIconLabelPart) component).getLink());
            children.add(((dev.reuise.web.core.text.WebIconLabelPart) component).getStartIcon());
            children.add(((dev.reuise.web.core.text.WebIconLabelPart) component).getLabelContainer());
            children.add(((dev.reuise.web.core.text.WebIconLabelPart) component).getEndIcon());
        }
        if (component instanceof dev.reuise.web.core.view.WebSheetRouteLayoutPart) {
            children.add(((dev.reuise.web.core.view.WebSheetRouteLayoutPart) component).getRouteLayout());
        }
    }

    private static void addAll(List<CoreComponent> target, List<? extends CoreComponent> values) {
        if (values != null) target.addAll(values);
    }
}
